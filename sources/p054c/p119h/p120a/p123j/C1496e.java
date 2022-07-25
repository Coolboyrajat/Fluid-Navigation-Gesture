package p054c.p119h.p120a.p123j;

import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3371l;

/* renamed from: c.h.a.j.e */
public final class C1496e extends C1486d {

    /* renamed from: c.h.a.j.e$a */
    static final class C1497a extends C3371l implements C3349a<Object> {

        /* renamed from: g */
        final /* synthetic */ Field f4524g;

        /* renamed from: h */
        final /* synthetic */ Object f4525h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1497a(Field field, Object obj) {
            super(0);
            this.f4524g = field;
            this.f4525h = obj;
        }

        public final Object invoke() {
            Field field = this.f4524g;
            field.setAccessible(true);
            return field.get(this.f4525h);
        }
    }

    /* renamed from: c.h.a.j.e$b */
    static final class C1498b extends C3371l implements C3350b<Object, Unit> {

        /* renamed from: g */
        final /* synthetic */ Field f4526g;

        /* renamed from: h */
        final /* synthetic */ Object f4527h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1498b(Field field, Object obj) {
            super(1);
            this.f4526g = field;
            this.f4527h = obj;
        }

        /* renamed from: a */
        public final void m6764a(Object obj) {
            Field field = this.f4526g;
            field.setAccessible(true);
            field.set(this.f4527h, obj);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1496e(java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15, java.lang.Object r16, java.lang.reflect.Field r17, int r18) {
        /*
            r11 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "key"
            r4 = r12
            kotlin.p205x.p207d.C3370k.m12227b(r12, r2)
            java.lang.String r2 = "label"
            r5 = r13
            kotlin.p205x.p207d.C3370k.m12227b(r13, r2)
            java.lang.String r2 = "taskerPluginInput"
            kotlin.p205x.p207d.C3370k.m12227b(r0, r2)
            java.lang.String r2 = "getter"
            kotlin.p205x.p207d.C3370k.m12227b(r1, r2)
            c.h.a.j.e$a r8 = new c.h.a.j.e$a
            r8.<init>(r1, r0)
            c.h.a.j.e$b r9 = new c.h.a.j.e$b
            r9.<init>(r1, r0)
            r3 = r11
            r6 = r14
            r7 = r15
            r10 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p054c.p119h.p120a.p123j.C1496e.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Object, java.lang.reflect.Field, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1496e(String str, String str2, String str3, boolean z, Object obj, Field field, int i, int i2, C3366g gVar) {
        this(str, str2, str3, z, obj, field, (i2 & 64) != 0 ? Integer.MAX_VALUE : i);
    }
}
