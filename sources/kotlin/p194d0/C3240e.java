package kotlin.p194d0;

import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.d0.e */
public final class C3240e implements Serializable {

    /* renamed from: f */
    private final Pattern f7976f;

    /* renamed from: kotlin.d0.e$a */
    public static final class C3241a {
        private C3241a() {
        }

        public /* synthetic */ C3241a(C3366g gVar) {
            this();
        }
    }

    static {
        new C3241a((C3366g) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3240e(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.p205x.p207d.C3370k.m12227b(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "Pattern.compile(pattern)"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r2, (java.lang.String) r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p194d0.C3240e.<init>(java.lang.String):void");
    }

    public C3240e(Pattern pattern) {
        C3370k.m12227b(pattern, "nativePattern");
        this.f7976f = pattern;
    }

    /* renamed from: a */
    public final String mo9929a(CharSequence charSequence, String str) {
        C3370k.m12227b(charSequence, "input");
        C3370k.m12227b(str, "replacement");
        String replaceAll = this.f7976f.matcher(charSequence).replaceAll(str);
        C3370k.m12223a((Object) replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public String toString() {
        String pattern = this.f7976f.toString();
        C3370k.m12223a((Object) pattern, "nativePattern.toString()");
        return pattern;
    }
}
