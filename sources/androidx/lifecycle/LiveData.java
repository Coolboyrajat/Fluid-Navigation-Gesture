package androidx.lifecycle;

import androidx.lifecycle.C0481i;
import java.util.Iterator;
import java.util.Map;
import p006b.p015b.p016a.p017a.C0698a;
import p006b.p015b.p016a.p018b.C0705b;

public abstract class LiveData<T> {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private C0705b<C0498u<? super T>, LiveData<T>.c> mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    class LifecycleBoundObserver extends LiveData<T>.c implements C0488m {

        /* renamed from: j */
        final C0490o f2019j;

        LifecycleBoundObserver(C0490o oVar, C0498u<? super T> uVar) {
            super(uVar);
            this.f2019j = oVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2663a() {
            this.f2019j.mo5a().mo2702b(this);
        }

        /* renamed from: a */
        public void mo14a(C0490o oVar, C0481i.C0482a aVar) {
            if (this.f2019j.mo5a().mo2700a() == C0481i.C0483b.DESTROYED) {
                LiveData.this.removeObserver(this.f2022f);
            } else {
                mo2667a(mo2665b());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2664a(C0490o oVar) {
            return this.f2019j == oVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2665b() {
            return this.f2019j.mo5a().mo2700a().mo2703a(C0481i.C0483b.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    class C0460a implements Runnable {
        C0460a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.mDataLock) {
                obj = LiveData.this.mPendingData;
                LiveData.this.mPendingData = LiveData.NOT_SET;
            }
            LiveData.this.setValue(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    private class C0461b extends LiveData<T>.c {
        C0461b(LiveData liveData, C0498u<? super T> uVar) {
            super(uVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2665b() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    private abstract class C0462c {

        /* renamed from: f */
        final C0498u<? super T> f2022f;

        /* renamed from: g */
        boolean f2023g;

        /* renamed from: h */
        int f2024h = -1;

        C0462c(C0498u<? super T> uVar) {
            this.f2022f = uVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2663a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2667a(boolean z) {
            if (z != this.f2023g) {
                this.f2023g = z;
                int i = 1;
                boolean z2 = LiveData.this.mActiveCount == 0;
                LiveData liveData = LiveData.this;
                int i2 = liveData.mActiveCount;
                if (!this.f2023g) {
                    i = -1;
                }
                liveData.mActiveCount = i2 + i;
                if (z2 && this.f2023g) {
                    LiveData.this.onActive();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.mActiveCount == 0 && !this.f2023g) {
                    liveData2.onInactive();
                }
                if (this.f2023g) {
                    LiveData.this.dispatchingValue(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2664a(C0490o oVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract boolean mo2665b();
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new C0705b<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new C0460a();
        this.mData = NOT_SET;
        this.mVersion = -1;
    }

    public LiveData(T t) {
        this.mDataLock = new Object();
        this.mObservers = new C0705b<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new C0460a();
        this.mData = t;
        this.mVersion = 0;
    }

    static void assertMainThread(String str) {
        if (!C0698a.m3847b().mo3958a()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    private void considerNotify(LiveData<T>.c cVar) {
        if (cVar.f2023g) {
            if (!cVar.mo2665b()) {
                cVar.mo2667a(false);
                return;
            }
            int i = cVar.f2024h;
            int i2 = this.mVersion;
            if (i < i2) {
                cVar.f2024h = i2;
                cVar.f2022f.mo2154a(this.mData);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchingValue(LiveData<T>.c cVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (cVar == null) {
                C0705b<K, V>.d c = this.mObservers.mo3971c();
                while (c.hasNext()) {
                    considerNotify((C0462c) ((Map.Entry) c.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            } else {
                considerNotify(cVar);
                cVar = null;
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t = this.mData;
        if (t != NOT_SET) {
            return t;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.size() > 0;
    }

    public void observe(C0490o oVar, C0498u<? super T> uVar) {
        assertMainThread("observe");
        if (oVar.mo5a().mo2700a() != C0481i.C0483b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(oVar, uVar);
            C0462c b = this.mObservers.mo3964b(uVar, lifecycleBoundObserver);
            if (b != null && !b.mo2664a(oVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (b == null) {
                oVar.mo5a().mo2701a(lifecycleBoundObserver);
            }
        }
    }

    public void observeForever(C0498u<? super T> uVar) {
        assertMainThread("observeForever");
        C0461b bVar = new C0461b(this, uVar);
        C0462c b = this.mObservers.mo3964b(uVar, bVar);
        if (b instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (b == null) {
            bVar.mo2667a(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onActive() {
    }

    /* access modifiers changed from: protected */
    public void onInactive() {
    }

    /* access modifiers changed from: protected */
    public void postValue(T t) {
        boolean z;
        synchronized (this.mDataLock) {
            z = this.mPendingData == NOT_SET;
            this.mPendingData = t;
        }
        if (z) {
            C0698a.m3847b().mo3959b(this.mPostValueRunnable);
        }
    }

    public void removeObserver(C0498u<? super T> uVar) {
        assertMainThread("removeObserver");
        C0462c remove = this.mObservers.remove(uVar);
        if (remove != null) {
            remove.mo2663a();
            remove.mo2667a(false);
        }
    }

    public void removeObservers(C0490o oVar) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<C0498u<? super T>, LiveData<T>.c>> it = this.mObservers.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (((C0462c) next.getValue()).mo2664a(oVar)) {
                removeObserver((C0498u) next.getKey());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setValue(T t) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t;
        dispatchingValue((LiveData<T>.c) null);
    }
}
