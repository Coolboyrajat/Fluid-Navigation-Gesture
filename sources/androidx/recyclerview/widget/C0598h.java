package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p006b.p026g.p031g.C0798a;

/* renamed from: androidx.recyclerview.widget.h */
final class C0598h implements Runnable {

    /* renamed from: j */
    static final ThreadLocal<C0598h> f2445j = new ThreadLocal<>();

    /* renamed from: k */
    static Comparator<C0601c> f2446k = new C0599a();

    /* renamed from: f */
    ArrayList<RecyclerView> f2447f = new ArrayList<>();

    /* renamed from: g */
    long f2448g;

    /* renamed from: h */
    long f2449h;

    /* renamed from: i */
    private ArrayList<C0601c> f2450i = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.h$a */
    static class C0599a implements Comparator<C0601c> {
        C0599a() {
        }

        /* renamed from: a */
        public int compare(C0601c cVar, C0601c cVar2) {
            if ((cVar.f2458d == null) != (cVar2.f2458d == null)) {
                return cVar.f2458d == null ? 1 : -1;
            }
            boolean z = cVar.f2455a;
            if (z != cVar2.f2455a) {
                return z ? -1 : 1;
            }
            int i = cVar2.f2456b - cVar.f2456b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.f2457c - cVar2.f2457c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.h$b */
    static class C0600b implements RecyclerView.C0538o.C0541c {

        /* renamed from: a */
        int f2451a;

        /* renamed from: b */
        int f2452b;

        /* renamed from: c */
        int[] f2453c;

        /* renamed from: d */
        int f2454d;

        C0600b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3543a() {
            int[] iArr = this.f2453c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2454d = 0;
        }

        /* renamed from: a */
        public void mo3278a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f2454d * 2;
                int[] iArr = this.f2453c;
                if (iArr == null) {
                    this.f2453c = new int[4];
                    Arrays.fill(this.f2453c, -1);
                } else if (i3 >= iArr.length) {
                    this.f2453c = new int[(i3 * 2)];
                    System.arraycopy(iArr, 0, this.f2453c, 0, iArr.length);
                }
                int[] iArr2 = this.f2453c;
                iArr2[i3] = i;
                iArr2[i3 + 1] = i2;
                this.f2454d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3544a(RecyclerView recyclerView, boolean z) {
            this.f2454d = 0;
            int[] iArr = this.f2453c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.C0538o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && oVar != null && oVar.mo3267t()) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.mo3449c()) {
                        oVar.mo2795a(recyclerView.mAdapter.mo3114b(), (RecyclerView.C0538o.C0541c) this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    oVar.mo2794a(this.f2451a, this.f2452b, recyclerView.mState, (RecyclerView.C0538o.C0541c) this);
                }
                int i = this.f2454d;
                if (i > oVar.f2211r) {
                    oVar.f2211r = i;
                    oVar.f2212s = z;
                    recyclerView.mRecycler.mo3336j();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3545a(int i) {
            if (this.f2453c != null) {
                int i2 = this.f2454d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f2453c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3546b(int i, int i2) {
            this.f2451a = i;
            this.f2452b = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$c */
    static class C0601c {

        /* renamed from: a */
        public boolean f2455a;

        /* renamed from: b */
        public int f2456b;

        /* renamed from: c */
        public int f2457c;

        /* renamed from: d */
        public RecyclerView f2458d;

        /* renamed from: e */
        public int f2459e;

        C0601c() {
        }

        /* renamed from: a */
        public void mo3547a() {
            this.f2455a = false;
            this.f2456b = 0;
            this.f2457c = 0;
            this.f2458d = null;
            this.f2459e = 0;
        }
    }

    C0598h() {
    }

    /* renamed from: a */
    private RecyclerView.C0524d0 m3344a(RecyclerView recyclerView, int i, long j) {
        if (m3348a(recyclerView, i)) {
            return null;
        }
        RecyclerView.C0550v vVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.C0524d0 a = vVar.mo3304a(i, false, j);
            if (a != null) {
                if (!a.mo3069n() || a.mo3070o()) {
                    vVar.mo3312a(a, false);
                } else {
                    vVar.mo3319b(a.f2168f);
                }
            }
            return a;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    /* renamed from: a */
    private void m3345a() {
        C0601c cVar;
        int size = this.f2447f.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f2447f.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.mo3544a(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.f2454d;
            }
        }
        this.f2450i.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f2447f.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0600b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.f2451a) + Math.abs(bVar.f2452b);
                int i5 = i3;
                for (int i6 = 0; i6 < bVar.f2454d * 2; i6 += 2) {
                    if (i5 >= this.f2450i.size()) {
                        cVar = new C0601c();
                        this.f2450i.add(cVar);
                    } else {
                        cVar = this.f2450i.get(i5);
                    }
                    int i7 = bVar.f2453c[i6 + 1];
                    cVar.f2455a = i7 <= abs;
                    cVar.f2456b = abs;
                    cVar.f2457c = i7;
                    cVar.f2458d = recyclerView2;
                    cVar.f2459e = bVar.f2453c[i6];
                    i5++;
                }
                i3 = i5;
            }
        }
        Collections.sort(this.f2450i, f2446k);
    }

    /* renamed from: a */
    private void m3346a(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.mo3470b() != 0) {
                recyclerView.removeAndRecycleViews();
            }
            C0600b bVar = recyclerView.mPrefetchRegistry;
            bVar.mo3544a(recyclerView, true);
            if (bVar.f2454d != 0) {
                try {
                    C0798a.m4441a("RV Nested Prefetch");
                    recyclerView.mState.mo3027a(recyclerView.mAdapter);
                    for (int i = 0; i < bVar.f2454d * 2; i += 2) {
                        m3344a(recyclerView, bVar.f2453c[i], j);
                    }
                } finally {
                    C0798a.m4440a();
                }
            }
        }
    }

    /* renamed from: a */
    private void m3347a(C0601c cVar, long j) {
        RecyclerView.C0524d0 a = m3344a(cVar.f2458d, cVar.f2459e, cVar.f2455a ? Long.MAX_VALUE : j);
        if (a != null && a.f2169g != null && a.mo3069n() && !a.mo3070o()) {
            m3346a((RecyclerView) a.f2169g.get(), j);
        }
    }

    /* renamed from: a */
    static boolean m3348a(RecyclerView recyclerView, int i) {
        int b = recyclerView.mChildHelper.mo3470b();
        for (int i2 = 0; i2 < b; i2++) {
            RecyclerView.C0524d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.mo3476d(i2));
            if (childViewHolderInt.f2170h == i && !childViewHolderInt.mo3070o()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m3349b(long j) {
        int i = 0;
        while (i < this.f2450i.size()) {
            C0601c cVar = this.f2450i.get(i);
            if (cVar.f2458d != null) {
                m3347a(cVar, j);
                cVar.mo3547a();
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3536a(long j) {
        m3345a();
        m3349b(j);
    }

    /* renamed from: a */
    public void mo3537a(RecyclerView recyclerView) {
        this.f2447f.add(recyclerView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3538a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f2448g == 0) {
            this.f2448g = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.mo3546b(i, i2);
    }

    /* renamed from: b */
    public void mo3539b(RecyclerView recyclerView) {
        this.f2447f.remove(recyclerView);
    }

    public void run() {
        try {
            C0798a.m4441a("RV Prefetch");
            if (!this.f2447f.isEmpty()) {
                int size = this.f2447f.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f2447f.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo3536a(TimeUnit.MILLISECONDS.toNanos(j) + this.f2449h);
                    this.f2448g = 0;
                    C0798a.m4440a();
                }
            }
        } finally {
            this.f2448g = 0;
            C0798a.m4440a();
        }
    }
}
