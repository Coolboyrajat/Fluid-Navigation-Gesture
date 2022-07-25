package p190io.objectbox.reactive;

import java.util.concurrent.ExecutorService;
import p190io.objectbox.annotation.apihint.Internal;

/* renamed from: io.objectbox.reactive.SubscriptionBuilder */
public class SubscriptionBuilder<T> {
    private DataSubscriptionList dataSubscriptionList;
    /* access modifiers changed from: private */
    public ErrorObserver errorObserver;
    /* access modifiers changed from: private */
    public DataObserver<T> observer;
    private boolean onlyChanges;
    private final DataPublisher<T> publisher;
    private final Object publisherParam;
    /* access modifiers changed from: private */
    public Scheduler scheduler;
    private boolean single;
    /* access modifiers changed from: private */
    public final ExecutorService threadPool;
    /* access modifiers changed from: private */
    public DataTransformer<T, Object> transformer;
    private boolean weak;

    /* renamed from: io.objectbox.reactive.SubscriptionBuilder$ActionObserver */
    class ActionObserver implements DataObserver<T>, DelegatingObserver<T> {
        private SubscriptionBuilder<T>.ActionObserver.SchedulerRunOnChange schedulerRunOnData;
        private SubscriptionBuilder<T>.ActionObserver.SchedulerRunOnError schedulerRunOnError;
        /* access modifiers changed from: private */
        public final DataSubscriptionImpl subscription;

        /* renamed from: io.objectbox.reactive.SubscriptionBuilder$ActionObserver$SchedulerRunOnChange */
        class SchedulerRunOnChange implements RunWithParam<T> {
            SchedulerRunOnChange() {
            }

            public void run(T t) {
                if (!ActionObserver.this.subscription.isCanceled()) {
                    try {
                        SubscriptionBuilder.this.observer.onData(t);
                    } catch (Error | RuntimeException e) {
                        ActionObserver.this.callOnError(e, "Observer failed without an ErrorObserver set");
                    }
                }
            }
        }

        /* renamed from: io.objectbox.reactive.SubscriptionBuilder$ActionObserver$SchedulerRunOnError */
        class SchedulerRunOnError implements RunWithParam<Throwable> {
            SchedulerRunOnError() {
            }

            public void run(Throwable th) {
                if (!ActionObserver.this.subscription.isCanceled()) {
                    SubscriptionBuilder.this.errorObserver.onError(th);
                }
            }
        }

        public ActionObserver(DataSubscriptionImpl dataSubscriptionImpl) {
            this.subscription = dataSubscriptionImpl;
            if (SubscriptionBuilder.this.scheduler != null) {
                this.schedulerRunOnData = new SchedulerRunOnChange();
                if (SubscriptionBuilder.this.errorObserver != null) {
                    this.schedulerRunOnError = new SchedulerRunOnError();
                }
            }
        }

        /* access modifiers changed from: private */
        public void callOnError(Throwable th, String str) {
            if (SubscriptionBuilder.this.errorObserver == null) {
                RuntimeException runtimeException = new RuntimeException(str, th);
                runtimeException.printStackTrace();
                throw runtimeException;
            } else if (this.subscription.isCanceled()) {
            } else {
                if (SubscriptionBuilder.this.scheduler != null) {
                    SubscriptionBuilder.this.scheduler.run(this.schedulerRunOnError, th);
                } else {
                    SubscriptionBuilder.this.errorObserver.onError(th);
                }
            }
        }

        private void transformAndContinue(final T t) {
            SubscriptionBuilder.this.threadPool.submit(new Runnable() {
                public void run() {
                    if (!ActionObserver.this.subscription.isCanceled()) {
                        try {
                            ActionObserver.this.callOnData(SubscriptionBuilder.this.transformer.transform(t));
                        } catch (Throwable th) {
                            ActionObserver.this.callOnError(th, "Transformer failed without an ErrorObserver set");
                        }
                    }
                }
            });
        }

        /* access modifiers changed from: package-private */
        public void callOnData(T t) {
            if (this.subscription.isCanceled()) {
                return;
            }
            if (SubscriptionBuilder.this.scheduler != null) {
                SubscriptionBuilder.this.scheduler.run(this.schedulerRunOnData, t);
                return;
            }
            try {
                SubscriptionBuilder.this.observer.onData(t);
            } catch (Error | RuntimeException e) {
                callOnError(e, "Observer failed without an ErrorObserver set");
            }
        }

        public DataObserver<T> getObserverDelegate() {
            return SubscriptionBuilder.this.observer;
        }

        public void onData(T t) {
            if (SubscriptionBuilder.this.transformer != null) {
                transformAndContinue(t);
            } else {
                callOnData(t);
            }
        }
    }

    @Internal
    public SubscriptionBuilder(DataPublisher<T> dataPublisher, Object obj, ExecutorService executorService) {
        this.publisher = dataPublisher;
        this.publisherParam = obj;
        this.threadPool = executorService;
    }

    public SubscriptionBuilder<T> dataSubscriptionList(DataSubscriptionList dataSubscriptionList2) {
        this.dataSubscriptionList = dataSubscriptionList2;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        if (r4.onlyChanges == false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p190io.objectbox.reactive.DataSubscription observer(p190io.objectbox.reactive.DataObserver<T> r5) {
        /*
            r4 = this;
            boolean r0 = r4.weak
            if (r0 == 0) goto L_0x000b
            io.objectbox.reactive.WeakDataObserver r0 = new io.objectbox.reactive.WeakDataObserver
            r0.<init>(r5)
            r5 = r0
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r4.observer = r5
            io.objectbox.reactive.DataSubscriptionImpl r1 = new io.objectbox.reactive.DataSubscriptionImpl
            io.objectbox.reactive.DataPublisher<T> r2 = r4.publisher
            java.lang.Object r3 = r4.publisherParam
            r1.<init>(r2, r3, r5)
            if (r0 == 0) goto L_0x001c
            r0.setSubscription(r1)
        L_0x001c:
            io.objectbox.reactive.DataSubscriptionList r0 = r4.dataSubscriptionList
            if (r0 == 0) goto L_0x0023
            r0.add(r1)
        L_0x0023:
            io.objectbox.reactive.DataTransformer<T, java.lang.Object> r0 = r4.transformer
            if (r0 != 0) goto L_0x002f
            io.objectbox.reactive.Scheduler r0 = r4.scheduler
            if (r0 != 0) goto L_0x002f
            io.objectbox.reactive.ErrorObserver r0 = r4.errorObserver
            if (r0 == 0) goto L_0x0034
        L_0x002f:
            io.objectbox.reactive.SubscriptionBuilder$ActionObserver r5 = new io.objectbox.reactive.SubscriptionBuilder$ActionObserver
            r5.<init>(r1)
        L_0x0034:
            boolean r0 = r4.single
            if (r0 == 0) goto L_0x0045
            boolean r0 = r4.onlyChanges
            if (r0 != 0) goto L_0x003d
            goto L_0x0050
        L_0x003d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Illegal combination of single() and onlyChanges()"
            r5.<init>(r0)
            throw r5
        L_0x0045:
            io.objectbox.reactive.DataPublisher<T> r0 = r4.publisher
            java.lang.Object r2 = r4.publisherParam
            r0.subscribe(r5, r2)
            boolean r0 = r4.onlyChanges
            if (r0 != 0) goto L_0x0057
        L_0x0050:
            io.objectbox.reactive.DataPublisher<T> r0 = r4.publisher
            java.lang.Object r2 = r4.publisherParam
            r0.publishSingle(r5, r2)
        L_0x0057:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p190io.objectbox.reactive.SubscriptionBuilder.observer(io.objectbox.reactive.DataObserver):io.objectbox.reactive.DataSubscription");
    }

    /* renamed from: on */
    public SubscriptionBuilder<T> mo9819on(Scheduler scheduler2) {
        if (this.scheduler == null) {
            this.scheduler = scheduler2;
            return this;
        }
        throw new IllegalStateException("Only one scheduler allowed");
    }

    public SubscriptionBuilder<T> onError(ErrorObserver errorObserver2) {
        if (this.errorObserver == null) {
            this.errorObserver = errorObserver2;
            return this;
        }
        throw new IllegalStateException("Only one errorObserver allowed");
    }

    public SubscriptionBuilder<T> onlyChanges() {
        this.onlyChanges = true;
        return this;
    }

    public SubscriptionBuilder<T> single() {
        this.single = true;
        return this;
    }

    public <TO> SubscriptionBuilder<TO> transform(DataTransformer<T, TO> dataTransformer) {
        if (this.transformer == null) {
            this.transformer = dataTransformer;
            return this;
        }
        throw new IllegalStateException("Only one transformer allowed");
    }

    public SubscriptionBuilder<T> weak() {
        this.weak = true;
        return this;
    }
}
