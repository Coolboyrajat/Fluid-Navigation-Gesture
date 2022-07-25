package p054c.p083e.p104c;

import java.math.BigInteger;
import p054c.p083e.p104c.p106w.C1302a;
import p054c.p083e.p104c.p106w.C1326g;

/* renamed from: c.e.c.o */
public final class C1287o extends C1282j {

    /* renamed from: b */
    private static final Class<?>[] f4149b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a */
    private Object f4150a;

    public C1287o(Boolean bool) {
        mo5672a((Object) bool);
    }

    public C1287o(Number number) {
        mo5672a((Object) number);
    }

    public C1287o(String str) {
        mo5672a((Object) str);
    }

    /* renamed from: a */
    private static boolean m6181a(C1287o oVar) {
        Object obj = oVar.f4150a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* renamed from: b */
    private static boolean m6182b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> isAssignableFrom : f4149b) {
            if (isAssignableFrom.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5672a(Object obj) {
        if (obj instanceof Character) {
            obj = String.valueOf(((Character) obj).charValue());
        } else {
            C1302a.m6203a((obj instanceof Number) || m6182b(obj));
        }
        this.f4150a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1287o.class != obj.getClass()) {
            return false;
        }
        C1287o oVar = (C1287o) obj;
        if (this.f4150a == null) {
            return oVar.f4150a == null;
        }
        if (m6181a(this) && m6181a(oVar)) {
            return mo5680m().longValue() == oVar.mo5680m().longValue();
        }
        if (!(this.f4150a instanceof Number) || !(oVar.f4150a instanceof Number)) {
            return this.f4150a.equals(oVar.f4150a);
        }
        double doubleValue = mo5680m().doubleValue();
        double doubleValue2 = oVar.mo5680m().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    /* renamed from: h */
    public boolean mo5674h() {
        return mo5682o() ? mo5676i().booleanValue() : Boolean.parseBoolean(mo5681n());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f4150a == null) {
            return 31;
        }
        if (m6181a(this)) {
            doubleToLongBits = mo5680m().longValue();
        } else {
            Object obj = this.f4150a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo5680m().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Boolean mo5676i() {
        return (Boolean) this.f4150a;
    }

    /* renamed from: j */
    public double mo5677j() {
        return mo5683p() ? mo5680m().doubleValue() : Double.parseDouble(mo5681n());
    }

    /* renamed from: k */
    public int mo5678k() {
        return mo5683p() ? mo5680m().intValue() : Integer.parseInt(mo5681n());
    }

    /* renamed from: l */
    public long mo5679l() {
        return mo5683p() ? mo5680m().longValue() : Long.parseLong(mo5681n());
    }

    /* renamed from: m */
    public Number mo5680m() {
        Object obj = this.f4150a;
        return obj instanceof String ? new C1326g((String) obj) : (Number) obj;
    }

    /* renamed from: n */
    public String mo5681n() {
        return mo5683p() ? mo5680m().toString() : mo5682o() ? mo5676i().toString() : (String) this.f4150a;
    }

    /* renamed from: o */
    public boolean mo5682o() {
        return this.f4150a instanceof Boolean;
    }

    /* renamed from: p */
    public boolean mo5683p() {
        return this.f4150a instanceof Number;
    }

    /* renamed from: q */
    public boolean mo5684q() {
        return this.f4150a instanceof String;
    }
}
