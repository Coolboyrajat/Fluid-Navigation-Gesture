package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.C3262k;
import kotlin.C3265l;
import kotlin.C3269p;
import kotlin.p205x.C3347a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;

/* renamed from: kotlinx.coroutines.internal.f */
public final class C3462f {

    /* renamed from: a */
    private static final int f8165a = m12493b(Throwable.class, -1);

    /* renamed from: b */
    private static final ReentrantReadWriteLock f8166b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static final WeakHashMap<Class<? extends Throwable>, C3350b<Throwable, Throwable>> f8167c = new WeakHashMap<>();

    /* renamed from: kotlinx.coroutines.internal.f$a */
    public static final class C3463a extends C3371l implements C3350b<Throwable, Throwable> {

        /* renamed from: g */
        final /* synthetic */ Constructor f8168g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3463a(Constructor constructor) {
            super(1);
            this.f8168g = constructor;
        }

        /* renamed from: a */
        public final Throwable mo5146a(Throwable th) {
            Object obj;
            C3370k.m12227b(th, "e");
            try {
                C3262k.C3263a aVar = C3262k.f7982f;
                Object newInstance = this.f8168g.newInstance(new Object[]{th.getMessage(), th});
                if (newInstance != null) {
                    obj = (Throwable) newInstance;
                    C3262k.m11974a(obj);
                    if (C3262k.m11976c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new C3269p("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                C3262k.C3263a aVar2 = C3262k.f7982f;
                obj = C3265l.m11978a(th2);
                C3262k.m11974a(obj);
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$b */
    public static final class C3464b extends C3371l implements C3350b<Throwable, Throwable> {

        /* renamed from: g */
        final /* synthetic */ Constructor f8169g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3464b(Constructor constructor) {
            super(1);
            this.f8169g = constructor;
        }

        /* renamed from: a */
        public final Throwable mo5146a(Throwable th) {
            Object obj;
            C3370k.m12227b(th, "e");
            try {
                C3262k.C3263a aVar = C3262k.f7982f;
                Object newInstance = this.f8169g.newInstance(new Object[]{th});
                if (newInstance != null) {
                    obj = (Throwable) newInstance;
                    C3262k.m11974a(obj);
                    if (C3262k.m11976c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new C3269p("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                C3262k.C3263a aVar2 = C3262k.f7982f;
                obj = C3265l.m11978a(th2);
                C3262k.m11974a(obj);
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$c */
    public static final class C3465c extends C3371l implements C3350b<Throwable, Throwable> {

        /* renamed from: g */
        final /* synthetic */ Constructor f8170g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3465c(Constructor constructor) {
            super(1);
            this.f8170g = constructor;
        }

        /* renamed from: a */
        public final Throwable mo5146a(Throwable th) {
            Throwable th2;
            C3370k.m12227b(th, "e");
            try {
                C3262k.C3263a aVar = C3262k.f7982f;
                Object newInstance = this.f8170g.newInstance(new Object[]{th.getMessage()});
                if (newInstance != null) {
                    Throwable th3 = (Throwable) newInstance;
                    th3.initCause(th);
                    C3262k.m11974a(th3);
                    th2 = th3;
                    boolean c = C3262k.m11976c(th2);
                    Throwable th4 = th2;
                    if (c) {
                        th4 = null;
                    }
                    return th4;
                }
                throw new C3269p("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th5) {
                C3262k.C3263a aVar2 = C3262k.f7982f;
                Object a = C3265l.m11978a(th5);
                C3262k.m11974a(a);
                th2 = a;
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$d */
    public static final class C3466d extends C3371l implements C3350b<Throwable, Throwable> {

        /* renamed from: g */
        final /* synthetic */ Constructor f8171g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3466d(Constructor constructor) {
            super(1);
            this.f8171g = constructor;
        }

        /* renamed from: a */
        public final Throwable mo5146a(Throwable th) {
            Throwable th2;
            C3370k.m12227b(th, "e");
            try {
                C3262k.C3263a aVar = C3262k.f7982f;
                Object newInstance = this.f8171g.newInstance(new Object[0]);
                if (newInstance != null) {
                    Throwable th3 = (Throwable) newInstance;
                    th3.initCause(th);
                    C3262k.m11974a(th3);
                    th2 = th3;
                    boolean c = C3262k.m11976c(th2);
                    Throwable th4 = th2;
                    if (c) {
                        th4 = null;
                    }
                    return th4;
                }
                throw new C3269p("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th5) {
                C3262k.C3263a aVar2 = C3262k.f7982f;
                Object a = C3265l.m11978a(th5);
                C3262k.m11974a(a);
                th2 = a;
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$e */
    public static final class C3467e<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Constructor constructor = (Constructor) t2;
            C3370k.m12223a((Object) constructor, "it");
            Integer valueOf = Integer.valueOf(constructor.getParameterTypes().length);
            Constructor constructor2 = (Constructor) t;
            C3370k.m12223a((Object) constructor2, "it");
            return C3303b.m12118a(valueOf, Integer.valueOf(constructor2.getParameterTypes().length));
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$f */
    static final class C3468f extends C3371l implements C3350b {

        /* renamed from: g */
        public static final C3468f f8172g = new C3468f();

        C3468f() {
            super(1);
        }

        /* renamed from: a */
        public final Void mo5146a(Throwable th) {
            C3370k.m12227b(th, "it");
            return null;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$g */
    static final class C3469g extends C3371l implements C3350b {

        /* renamed from: g */
        public static final C3469g f8173g = new C3469g();

        C3469g() {
            super(1);
        }

        /* renamed from: a */
        public final Void mo5146a(Throwable th) {
            C3370k.m12227b(th, "it");
            return null;
        }
    }

    /* renamed from: a */
    private static final int m12489a(Class<?> cls, int i) {
        Class<? super Object> superclass;
        do {
            Field[] declaredFields = r6.getDeclaredFields();
            C3370k.m12223a((Object) declaredFields, "declaredFields");
            int i2 = 0;
            Class<? super Object> cls2 = cls;
            for (Field field : declaredFields) {
                C3370k.m12223a((Object) field, "it");
                if (!Modifier.isStatic(field.getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            superclass = cls2.getSuperclass();
            cls2 = superclass;
        } while (superclass != null);
        return i;
    }

    /* renamed from: a */
    static /* synthetic */ int m12490a(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m12489a(cls, i);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    public static final <E extends java.lang.Throwable> E m12491a(E r9) {
        /*
            java.lang.String r0 = "exception"
            kotlin.p205x.p207d.C3370k.m12227b(r9, r0)
            boolean r0 = r9 instanceof kotlinx.coroutines.C3547x
            r1 = 0
            if (r0 == 0) goto L_0x002a
            kotlin.k$a r0 = kotlin.C3262k.f7982f     // Catch:{ all -> 0x0016 }
            kotlinx.coroutines.x r9 = (kotlinx.coroutines.C3547x) r9     // Catch:{ all -> 0x0016 }
            java.lang.Throwable r9 = r9.mo10275a()     // Catch:{ all -> 0x0016 }
            kotlin.C3262k.m11974a(r9)     // Catch:{ all -> 0x0016 }
            goto L_0x0020
        L_0x0016:
            r9 = move-exception
            kotlin.k$a r0 = kotlin.C3262k.f7982f
            java.lang.Object r9 = kotlin.C3265l.m11978a((java.lang.Throwable) r9)
            kotlin.C3262k.m11974a(r9)
        L_0x0020:
            boolean r0 = kotlin.C3262k.m11976c(r9)
            if (r0 == 0) goto L_0x0027
            r9 = r1
        L_0x0027:
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            return r9
        L_0x002a:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f8166b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.x.c.b<java.lang.Throwable, java.lang.Throwable>> r2 = f8167c     // Catch:{ all -> 0x0127 }
            java.lang.Class r3 = r9.getClass()     // Catch:{ all -> 0x0127 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0127 }
            kotlin.x.c.b r2 = (kotlin.p205x.p206c.C3350b) r2     // Catch:{ all -> 0x0127 }
            r0.unlock()
            if (r2 == 0) goto L_0x004b
            java.lang.Object r9 = r2.mo5146a(r9)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            return r9
        L_0x004b:
            int r0 = f8165a
            java.lang.Class r2 = r9.getClass()
            r3 = 0
            int r2 = m12493b(r2, r3)
            if (r0 == r2) goto L_0x00a0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f8166b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            int r4 = r0.getWriteHoldCount()
            if (r4 != 0) goto L_0x0069
            int r4 = r0.getReadHoldCount()
            goto L_0x006a
        L_0x0069:
            r4 = 0
        L_0x006a:
            r5 = 0
        L_0x006b:
            if (r5 >= r4) goto L_0x0073
            r2.unlock()
            int r5 = r5 + 1
            goto L_0x006b
        L_0x0073:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.x.c.b<java.lang.Throwable, java.lang.Throwable>> r5 = f8167c     // Catch:{ all -> 0x0093 }
            java.lang.Class r9 = r9.getClass()     // Catch:{ all -> 0x0093 }
            kotlinx.coroutines.internal.f$f r6 = kotlinx.coroutines.internal.C3462f.C3468f.f8172g     // Catch:{ all -> 0x0093 }
            r5.put(r9, r6)     // Catch:{ all -> 0x0093 }
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0093 }
        L_0x0087:
            if (r3 >= r4) goto L_0x008f
            r2.lock()
            int r3 = r3 + 1
            goto L_0x0087
        L_0x008f:
            r0.unlock()
            return r1
        L_0x0093:
            r9 = move-exception
        L_0x0094:
            if (r3 >= r4) goto L_0x009c
            r2.lock()
            int r3 = r3 + 1
            goto L_0x0094
        L_0x009c:
            r0.unlock()
            throw r9
        L_0x00a0:
            java.lang.Class r0 = r9.getClass()
            java.lang.reflect.Constructor[] r0 = r0.getConstructors()
            java.lang.String r2 = "exception.javaClass.constructors"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r0, (java.lang.String) r2)
            kotlinx.coroutines.internal.f$e r2 = new kotlinx.coroutines.internal.f$e
            r2.<init>()
            java.util.List r0 = kotlin.p195s.C3280f.m12027c((T[]) r0, r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = r1
        L_0x00bb:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00d2
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            java.lang.String r4 = "constructor"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r2, (java.lang.String) r4)
            kotlin.x.c.b r2 = m12492a((java.lang.reflect.Constructor<?>) r2)
            if (r2 == 0) goto L_0x00bb
        L_0x00d2:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f8166b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r0.readLock()
            int r5 = r0.getWriteHoldCount()
            if (r5 != 0) goto L_0x00e3
            int r5 = r0.getReadHoldCount()
            goto L_0x00e4
        L_0x00e3:
            r5 = 0
        L_0x00e4:
            r6 = 0
        L_0x00e5:
            if (r6 >= r5) goto L_0x00ed
            r4.unlock()
            int r6 = r6 + 1
            goto L_0x00e5
        L_0x00ed:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.x.c.b<java.lang.Throwable, java.lang.Throwable>> r6 = f8167c     // Catch:{ all -> 0x011a }
            java.lang.Class r7 = r9.getClass()     // Catch:{ all -> 0x011a }
            if (r2 == 0) goto L_0x00fe
            r8 = r2
            goto L_0x0100
        L_0x00fe:
            kotlinx.coroutines.internal.f$g r8 = kotlinx.coroutines.internal.C3462f.C3469g.f8173g     // Catch:{ all -> 0x011a }
        L_0x0100:
            r6.put(r7, r8)     // Catch:{ all -> 0x011a }
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x011a }
        L_0x0105:
            if (r3 >= r5) goto L_0x010d
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0105
        L_0x010d:
            r0.unlock()
            if (r2 == 0) goto L_0x0119
            java.lang.Object r9 = r2.mo5146a(r9)
            r1 = r9
            java.lang.Throwable r1 = (java.lang.Throwable) r1
        L_0x0119:
            return r1
        L_0x011a:
            r9 = move-exception
        L_0x011b:
            if (r3 >= r5) goto L_0x0123
            r4.lock()
            int r3 = r3 + 1
            goto L_0x011b
        L_0x0123:
            r0.unlock()
            throw r9
        L_0x0127:
            r9 = move-exception
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C3462f.m12491a(java.lang.Throwable):java.lang.Throwable");
    }

    /* renamed from: a */
    private static final C3350b<Throwable, Throwable> m12492a(Constructor<?> constructor) {
        Class[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new C3466d(constructor);
        }
        if (length == 1) {
            Class cls = parameterTypes[0];
            if (C3370k.m12225a((Object) cls, (Object) Throwable.class)) {
                return new C3464b(constructor);
            }
            if (C3370k.m12225a((Object) cls, (Object) String.class)) {
                return new C3465c(constructor);
            }
        } else if (length == 2 && C3370k.m12225a((Object) parameterTypes[0], (Object) String.class) && C3370k.m12225a((Object) parameterTypes[1], (Object) Throwable.class)) {
            return new C3463a(constructor);
        }
        return null;
    }

    /* renamed from: b */
    private static final int m12493b(Class<?> cls, int i) {
        Integer num;
        C3347a.m12187a(cls);
        try {
            C3262k.C3263a aVar = C3262k.f7982f;
            num = Integer.valueOf(m12490a(cls, 0, 1, (Object) null));
            C3262k.m11974a(num);
        } catch (Throwable th) {
            C3262k.C3263a aVar2 = C3262k.f7982f;
            num = C3265l.m11978a(th);
            C3262k.m11974a(num);
        }
        Integer valueOf = Integer.valueOf(i);
        if (C3262k.m11976c(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }
}
