package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import kotlin.C3261j;
import kotlin.C3262k;
import kotlin.C3265l;
import kotlin.C3268o;
import kotlin.C3269p;
import kotlin.p197u.C3309c;
import kotlin.p197u.p199i.p200a.C3331e;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.C3498j0;

/* renamed from: kotlinx.coroutines.internal.t */
public final class C3486t {

    /* renamed from: a */
    private static final String f8197a;

    static {
        Object obj;
        Object obj2;
        try {
            C3262k.C3263a aVar = C3262k.f7982f;
            Class<?> cls = Class.forName("kotlin.u.i.a.a");
            C3370k.m12223a((Object) cls, "Class.forName(baseContinuationImplClass)");
            obj = cls.getCanonicalName();
            C3262k.m11974a(obj);
        } catch (Throwable th) {
            C3262k.C3263a aVar2 = C3262k.f7982f;
            obj = C3265l.m11978a(th);
            C3262k.m11974a(obj);
        }
        if (C3262k.m11975b(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f8197a = (String) obj;
        try {
            C3262k.C3263a aVar3 = C3262k.f7982f;
            Class<?> cls2 = Class.forName("kotlinx.coroutines.internal.t");
            C3370k.m12223a((Object) cls2, "Class.forName(stackTraceRecoveryClass)");
            obj2 = cls2.getCanonicalName();
            C3262k.m11974a(obj2);
        } catch (Throwable th2) {
            C3262k.C3263a aVar4 = C3262k.f7982f;
            obj2 = C3265l.m11978a(th2);
            C3262k.m11974a(obj2);
        }
        if (C3262k.m11975b(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str = (String) obj2;
    }

    /* renamed from: a */
    private static final int m12568a(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (C3370k.m12225a((Object) str, (Object) stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static final StackTraceElement m12569a(String str) {
        C3370k.m12227b(str, "message");
        return new StackTraceElement("\b\b\b(" + str, "\b", "\b", -1);
    }

    /* renamed from: a */
    private static final <E extends Throwable> E m12570a(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(m12569a("Coroutine boundary"));
        StackTraceElement[] stackTrace = e.getStackTrace();
        C3370k.m12223a((Object) stackTrace, "causeTrace");
        String str = f8197a;
        C3370k.m12223a((Object) str, "baseContinuationImplClassName");
        int a = m12568a(stackTrace, str);
        int i = 0;
        if (a == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array != null) {
                e2.setStackTrace((StackTraceElement[]) array);
                return e2;
            }
            throw new C3269p("null cannot be cast to non-null type kotlin.Array<T>");
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + a)];
        for (int i2 = 0; i2 < a; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        for (StackTraceElement stackTraceElement : arrayDeque) {
            stackTraceElementArr[a + i] = stackTraceElement;
            i++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    /* renamed from: a */
    public static final <E extends Throwable> E m12571a(E e, C3309c<?> cVar) {
        C3370k.m12227b(e, "exception");
        C3370k.m12227b(cVar, "continuation");
        return (!C3498j0.m12621d() || !(cVar instanceof C3331e)) ? e : m12572a(e, (C3331e) cVar);
    }

    /* renamed from: a */
    private static final <E extends Throwable> E m12572a(E e, C3331e eVar) {
        C3261j a = m12574a(e);
        E e2 = (Throwable) a.mo9934a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) a.mo9935b();
        E a2 = C3462f.m12491a(e2);
        if (a2 == null) {
            return e;
        }
        ArrayDeque<StackTraceElement> a3 = m12573a(eVar);
        if (a3.isEmpty()) {
            return e;
        }
        if (e2 != e) {
            m12575a(stackTraceElementArr, a3);
        }
        m12570a(e2, a2, a3);
        return a2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022 A[EDGE_INSN: B:12:0x0022->B:11:0x0022 ?: BREAK  
    EDGE_INSN: B:13:0x0022->B:11:0x0022 ?: BREAK  , RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0012  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001b  */
    /* renamed from: a */
    private static final java.util.ArrayDeque<java.lang.StackTraceElement> m12573a(kotlin.p197u.p199i.p200a.C3331e r2) {
        /*
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            java.lang.StackTraceElement r1 = r2.mo10048g()
            if (r1 == 0) goto L_0x000e
        L_0x000b:
            r0.add(r1)
        L_0x000e:
            boolean r1 = r2 instanceof kotlin.p197u.p199i.p200a.C3331e
            if (r1 != 0) goto L_0x0013
            r2 = 0
        L_0x0013:
            if (r2 == 0) goto L_0x0022
            kotlin.u.i.a.e r2 = r2.mo10046c()
            if (r2 == 0) goto L_0x0022
            java.lang.StackTraceElement r1 = r2.mo10048g()
            if (r1 == 0) goto L_0x000e
            goto L_0x000b
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C3486t.m12573a(kotlin.u.i.a.e):java.util.ArrayDeque");
    }

    /* renamed from: a */
    private static final <E extends Throwable> C3261j<E, StackTraceElement[]> m12574a(E e) {
        boolean z;
        Throwable cause = e.getCause();
        if (cause == null || !C3370k.m12225a((Object) cause.getClass(), (Object) e.getClass())) {
            return C3268o.m11989a(e, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e.getStackTrace();
        C3370k.m12223a((Object) stackTrace, "currentTrace");
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            C3370k.m12223a((Object) stackTraceElement, "it");
            if (m12576a(stackTraceElement)) {
                z = true;
                break;
            }
            i++;
        }
        return z ? C3268o.m11989a(cause, stackTrace) : C3268o.m11989a(e, new StackTraceElement[0]);
    }

    /* renamed from: a */
    private static final void m12575a(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (m12576a(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (length2 >= i2) {
            while (true) {
                StackTraceElement stackTraceElement = stackTraceElementArr[length2];
                StackTraceElement last = arrayDeque.getLast();
                C3370k.m12223a((Object) last, "result.last");
                if (m12577a(stackTraceElement, last)) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i2) {
                    length2--;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static final boolean m12576a(StackTraceElement stackTraceElement) {
        C3370k.m12227b(stackTraceElement, "$this$isArtificial");
        String className = stackTraceElement.getClassName();
        C3370k.m12223a((Object) className, "className");
        return C3250n.m11932a(className, "\b\b\b", false, 2, (Object) null);
    }

    /* renamed from: a */
    private static final boolean m12577a(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && C3370k.m12225a((Object) stackTraceElement.getMethodName(), (Object) stackTraceElement2.getMethodName()) && C3370k.m12225a((Object) stackTraceElement.getFileName(), (Object) stackTraceElement2.getFileName()) && C3370k.m12225a((Object) stackTraceElement.getClassName(), (Object) stackTraceElement2.getClassName());
    }

    /* renamed from: b */
    public static final <E extends Throwable> E m12578b(E e) {
        E cause;
        C3370k.m12227b(e, "exception");
        if (C3498j0.m12621d() && (cause = e.getCause()) != null) {
            boolean z = true;
            if (!(!C3370k.m12225a((Object) cause.getClass(), (Object) e.getClass()))) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                C3370k.m12223a((Object) stackTrace, "exception.stackTrace");
                int length = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    C3370k.m12223a((Object) stackTraceElement, "it");
                    if (m12576a(stackTraceElement)) {
                        break;
                    }
                    i++;
                }
                if (z) {
                    return cause;
                }
            }
        }
        return e;
    }
}
