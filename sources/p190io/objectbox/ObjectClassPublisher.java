package p190io.objectbox;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Set;
import p179e.p180a.p181a.p182a.C2979c;
import p190io.objectbox.annotation.apihint.Internal;
import p190io.objectbox.reactive.DataObserver;
import p190io.objectbox.reactive.DataPublisher;
import p190io.objectbox.reactive.DataPublisherUtils;

@Internal
/* renamed from: io.objectbox.ObjectClassPublisher */
class ObjectClassPublisher implements DataPublisher<Class>, Runnable {
    final BoxStore boxStore;
    volatile boolean changePublisherRunning;
    final Deque<int[]> changesQueue = new ArrayDeque();
    final C2979c<Integer, DataObserver<Class>> observersByEntityTypeId = C2979c.m11463a(C2979c.C2981b.THREAD_SAFE);

    ObjectClassPublisher(BoxStore boxStore2) {
        this.boxStore = boxStore2;
    }

    /* access modifiers changed from: private */
    public void handleObserverException(Class cls) {
        RuntimeException runtimeException = new RuntimeException("Observer failed while processing data for " + cls + ". Consider using an ErrorObserver");
        runtimeException.printStackTrace();
        throw runtimeException;
    }

    private void unsubscribe(DataObserver<Class> dataObserver, int i) {
        DataPublisherUtils.removeObserverFromCopyOnWriteSet((Set) this.observersByEntityTypeId.get((Object) Integer.valueOf(i)), dataObserver);
    }

    /* access modifiers changed from: package-private */
    public void publish(int[] iArr) {
        synchronized (this.changesQueue) {
            this.changesQueue.add(iArr);
            if (!this.changePublisherRunning) {
                this.changePublisherRunning = true;
                this.boxStore.internalScheduleThread(this);
            }
        }
    }

    public void publishSingle(final DataObserver<Class> dataObserver, final Object obj) {
        this.boxStore.internalScheduleThread(new Runnable() {
            public void run() {
                Object obj = obj;
                for (Class cls : obj != null ? Collections.singletonList((Class) obj) : ObjectClassPublisher.this.boxStore.getAllEntityClasses()) {
                    try {
                        dataObserver.onData(cls);
                    } catch (RuntimeException unused) {
                        ObjectClassPublisher.this.handleObserverException(cls);
                    }
                }
            }
        });
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1 = r2.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0017, code lost:
        if (r3 >= r1) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0019, code lost:
        r4 = r2[r3];
        r5 = r7.observersByEntityTypeId.get((java.lang.Object) java.lang.Integer.valueOf(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        if (r5 == null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        if (r5.isEmpty() != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        r4 = r7.boxStore.getEntityClassOrThrow(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r5 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        if (r5.hasNext() == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        ((p190io.objectbox.reactive.DataObserver) r5.next()).onData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        handleObserverException(r4);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r7 = this;
        L_0x0000:
            r0 = 0
            java.util.Deque<int[]> r1 = r7.changesQueue     // Catch:{ all -> 0x0050 }
            monitor-enter(r1)     // Catch:{ all -> 0x0050 }
            java.util.Deque<int[]> r2 = r7.changesQueue     // Catch:{ all -> 0x004d }
            java.lang.Object r2 = r2.pollFirst()     // Catch:{ all -> 0x004d }
            int[] r2 = (int[]) r2     // Catch:{ all -> 0x004d }
            if (r2 != 0) goto L_0x0014
            r7.changePublisherRunning = r0     // Catch:{ all -> 0x004d }
            monitor-exit(r1)     // Catch:{ all -> 0x004d }
            r7.changePublisherRunning = r0
            return
        L_0x0014:
            monitor-exit(r1)     // Catch:{ all -> 0x004d }
            int r1 = r2.length     // Catch:{ all -> 0x0050 }
            r3 = 0
        L_0x0017:
            if (r3 >= r1) goto L_0x0000
            r4 = r2[r3]     // Catch:{ all -> 0x0050 }
            e.a.a.a.c<java.lang.Integer, io.objectbox.reactive.DataObserver<java.lang.Class>> r5 = r7.observersByEntityTypeId     // Catch:{ all -> 0x0050 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0050 }
            java.util.Collection r5 = r5.get((java.lang.Object) r6)     // Catch:{ all -> 0x0050 }
            if (r5 == 0) goto L_0x004a
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x0050 }
            if (r6 != 0) goto L_0x004a
            io.objectbox.BoxStore r6 = r7.boxStore     // Catch:{ all -> 0x0050 }
            java.lang.Class r4 = r6.getEntityClassOrThrow(r4)     // Catch:{ all -> 0x0050 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ RuntimeException -> 0x0047 }
        L_0x0037:
            boolean r6 = r5.hasNext()     // Catch:{ RuntimeException -> 0x0047 }
            if (r6 == 0) goto L_0x004a
            java.lang.Object r6 = r5.next()     // Catch:{ RuntimeException -> 0x0047 }
            io.objectbox.reactive.DataObserver r6 = (p190io.objectbox.reactive.DataObserver) r6     // Catch:{ RuntimeException -> 0x0047 }
            r6.onData(r4)     // Catch:{ RuntimeException -> 0x0047 }
            goto L_0x0037
        L_0x0047:
            r7.handleObserverException(r4)     // Catch:{ all -> 0x0050 }
        L_0x004a:
            int r3 = r3 + 1
            goto L_0x0017
        L_0x004d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004d }
            throw r2     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r1 = move-exception
            r7.changePublisherRunning = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p190io.objectbox.ObjectClassPublisher.run():void");
    }

    public void subscribe(DataObserver<Class> dataObserver, Object obj) {
        if (obj == null) {
            for (int valueOf : this.boxStore.getAllEntityTypeIds()) {
                this.observersByEntityTypeId.mo9081a(Integer.valueOf(valueOf), dataObserver);
            }
            return;
        }
        this.observersByEntityTypeId.mo9081a(Integer.valueOf(this.boxStore.getEntityTypeIdOrThrow((Class) obj)), dataObserver);
    }

    public void unsubscribe(DataObserver<Class> dataObserver, Object obj) {
        if (obj != null) {
            unsubscribe(dataObserver, this.boxStore.getEntityTypeIdOrThrow((Class) obj));
            return;
        }
        for (int unsubscribe : this.boxStore.getAllEntityTypeIds()) {
            unsubscribe(dataObserver, unsubscribe);
        }
    }
}
