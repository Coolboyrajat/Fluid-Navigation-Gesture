package p155d.p156a.p161p;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import p190io.objectbox.android.BuildConfig;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: d.a.p.a */
public final class C2814a extends RuntimeException {

    /* renamed from: f */
    private final List<Throwable> f7407f;

    /* renamed from: g */
    private final String f7408g;

    /* renamed from: h */
    private Throwable f7409h;

    /* renamed from: d.a.p.a$a */
    static final class C2815a extends RuntimeException {
        C2815a() {
        }

        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* renamed from: d.a.p.a$b */
    static abstract class C2816b {
        C2816b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo8961a(Object obj);
    }

    /* renamed from: d.a.p.a$c */
    static final class C2817c extends C2816b {

        /* renamed from: a */
        private final PrintStream f7410a;

        C2817c(PrintStream printStream) {
            this.f7410a = printStream;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo8961a(Object obj) {
            this.f7410a.println(obj);
        }
    }

    /* renamed from: d.a.p.a$d */
    static final class C2818d extends C2816b {

        /* renamed from: a */
        private final PrintWriter f7411a;

        C2818d(PrintWriter printWriter) {
            this.f7411a = printWriter;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo8961a(Object obj) {
            this.f7411a.println(obj);
        }
    }

    public C2814a(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Object obj : iterable) {
                if (obj instanceof C2814a) {
                    linkedHashSet.addAll(((C2814a) obj).mo8954a());
                } else {
                    linkedHashSet.add(obj == null ? new NullPointerException("Throwable was null!") : obj);
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            this.f7407f = Collections.unmodifiableList(arrayList);
            this.f7408g = this.f7407f.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2814a(Throwable... thArr) {
        this((Iterable<? extends Throwable>) thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    /* renamed from: a */
    private void m11079a(C2816b bVar) {
        StringBuilder sb = new StringBuilder(PropertyFlags.ID_SELF_ASSIGNABLE);
        sb.append(this);
        sb.append(10);
        for (StackTraceElement append : getStackTrace()) {
            sb.append("\tat ");
            sb.append(append);
            sb.append(10);
        }
        int i = 1;
        for (Throwable a : this.f7407f) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            m11080a(sb, a, "\t");
            i++;
        }
        bVar.mo8961a(sb.toString());
    }

    /* renamed from: a */
    private void m11080a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append(10);
        for (StackTraceElement append : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(append);
            sb.append(10);
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            m11080a(sb, th.getCause(), BuildConfig.FLAVOR);
        }
    }

    /* renamed from: b */
    private List<Throwable> m11081b(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Throwable mo8953a(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || th == cause) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                return cause;
            }
            cause = cause2;
        }
        return cause;
    }

    /* renamed from: a */
    public List<Throwable> mo8954a() {
        return this.f7407f;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|(4:13|(2:15|33)(2:16|34)|32|11)|17|18|19|20|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0055 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Throwable getCause() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Throwable r0 = r8.f7409h     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x005c
            d.a.p.a$a r0 = new d.a.p.a$a     // Catch:{ all -> 0x0060 }
            r0.<init>()     // Catch:{ all -> 0x0060 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0060 }
            r1.<init>()     // Catch:{ all -> 0x0060 }
            java.util.List<java.lang.Throwable> r2 = r8.f7407f     // Catch:{ all -> 0x0060 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0060 }
            r3 = r0
        L_0x0016:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0060 }
            if (r4 == 0) goto L_0x005a
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0060 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x0060 }
            boolean r5 = r1.contains(r4)     // Catch:{ all -> 0x0060 }
            if (r5 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0029:
            r1.add(r4)     // Catch:{ all -> 0x0060 }
            java.util.List r5 = r8.m11081b(r4)     // Catch:{ all -> 0x0060 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0060 }
        L_0x0034:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0060 }
            if (r6 == 0) goto L_0x0052
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0060 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x0060 }
            boolean r7 = r1.contains(r6)     // Catch:{ all -> 0x0060 }
            if (r7 == 0) goto L_0x004e
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = "Duplicate found in causal chain so cropping to prevent loop ..."
            r4.<init>(r6)     // Catch:{ all -> 0x0060 }
            goto L_0x0034
        L_0x004e:
            r1.add(r6)     // Catch:{ all -> 0x0060 }
            goto L_0x0034
        L_0x0052:
            r3.initCause(r4)     // Catch:{ all -> 0x0055 }
        L_0x0055:
            java.lang.Throwable r3 = r8.mo8953a((java.lang.Throwable) r3)     // Catch:{ all -> 0x0060 }
            goto L_0x0016
        L_0x005a:
            r8.f7409h = r0     // Catch:{ all -> 0x0060 }
        L_0x005c:
            java.lang.Throwable r0 = r8.f7409h     // Catch:{ all -> 0x0060 }
            monitor-exit(r8)
            return r0
        L_0x0060:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p155d.p156a.p161p.C2814a.getCause():java.lang.Throwable");
    }

    public String getMessage() {
        return this.f7408g;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        m11079a((C2816b) new C2817c(printStream));
    }

    public void printStackTrace(PrintWriter printWriter) {
        m11079a((C2816b) new C2818d(printWriter));
    }
}
