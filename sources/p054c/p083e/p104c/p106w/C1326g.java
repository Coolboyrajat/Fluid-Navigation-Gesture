package p054c.p083e.p104c.p106w;

import java.math.BigDecimal;

/* renamed from: c.e.c.w.g */
public final class C1326g extends Number {

    /* renamed from: f */
    private final String f4188f;

    public C1326g(String str) {
        this.f4188f = str;
    }

    public double doubleValue() {
        return Double.parseDouble(this.f4188f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1326g)) {
            return false;
        }
        String str = this.f4188f;
        String str2 = ((C1326g) obj).f4188f;
        return str == str2 || str.equals(str2);
    }

    public float floatValue() {
        return Float.parseFloat(this.f4188f);
    }

    public int hashCode() {
        return this.f4188f.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f4188f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f4188f).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f4188f     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f4188f     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r1 = (int) r0
            return r1
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f4188f
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p054c.p083e.p104c.p106w.C1326g.intValue():int");
    }

    public long longValue() {
        try {
            return Long.parseLong(this.f4188f);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f4188f).longValue();
        }
    }

    public String toString() {
        return this.f4188f;
    }
}
