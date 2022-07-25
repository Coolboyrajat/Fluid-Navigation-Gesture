package com.p131fb.fluid.p148ui;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.C0033d;
import androidx.core.app.C0276a;
import androidx.core.content.C0311a;
import com.p131fb.fluid.OverlayDeclared;
import com.p131fb.fluid.p135l.p139p.C1779o;
import com.p131fb.fluid.p148ui.billing.C2037a;
import java.util.List;
import kotlin.C3256e;
import kotlin.Unit;
import kotlin.p192b0.C3208i;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3384y;
import p179e.p184b.p185a.C3059m;
import p179e.p184b.p185a.C3117n;
import p179e.p184b.p185a.C3125q;
import p179e.p184b.p185a.C3134v;
import p179e.p184b.p185a.p186k0.C3014a;

/* renamed from: com.fb.fluid.ui.c */
public abstract class C2054c extends C0033d implements C3117n {

    /* renamed from: A */
    public static final C2055a f5653A = new C2055a((C3366g) null);

    /* renamed from: z */
    static final /* synthetic */ C3208i[] f5654z;

    /* renamed from: x */
    private final C3256e f5655x = C3014a.m11539a().mo9126a(this, f5654z[0]);

    /* renamed from: y */
    private Integer f5656y = -1;

    /* renamed from: com.fb.fluid.ui.c$a */
    public static final class C2055a {
        private C2055a() {
        }

        public /* synthetic */ C2055a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ void m8389a(C2055a aVar, Context context, int i, String str, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                str = null;
            }
            aVar.mo6915a(context, i, str);
        }

        /* renamed from: a */
        public final void mo6915a(Context context, int i, String str) {
            C3370k.m12227b(context, "context");
            try {
                Intent intent = new Intent(context, OverlayDeclared.class);
                intent.setFlags(268468224);
                PendingIntent activity = PendingIntent.getActivity(context, 0, intent.putExtra("value", str).putExtra("mode", i), 1073741824, (Bundle) null);
                C3370k.m12223a((Object) activity, "PendingIntent.getActivit…tent.FLAG_ONE_SHOT, null)");
                C1779o.m7484a(activity);
            } catch (PendingIntent.CanceledException unused) {
            }
        }
    }

    /* renamed from: com.fb.fluid.ui.c$b */
    static final class C2056b extends C3371l implements C3349a<Unit> {

        /* renamed from: g */
        final /* synthetic */ C2054c f5657g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2056b(C2054c cVar) {
            super(0);
            this.f5657g = cVar;
        }

        public final void invoke() {
            this.f5657g.finish();
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(C2054c.class), "kodein", "getKodein()Lorg/kodein/di/Kodein;");
        C3384y.m12259a((C3379t) uVar);
        f5654z = new C3208i[]{uVar};
    }

    /* renamed from: c */
    public C3134v mo6349c() {
        return C3117n.C3118a.m11765b(this);
    }

    /* renamed from: d */
    public C3125q<?> mo6350d() {
        return C3117n.C3118a.m11764a(this);
    }

    /* renamed from: e */
    public C3059m mo6351e() {
        C3256e eVar = this.f5655x;
        C3208i iVar = f5654z[0];
        return (C3059m) eVar.getValue();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Intent intent = getIntent();
        C3370k.m12223a((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        this.f5656y = Integer.valueOf(extras != null ? extras.getInt("mode") : -1);
        Integer num = this.f5656y;
        if (num != null && num.intValue() == 0) {
            Intent intent2 = getIntent();
            C3370k.m12223a((Object) intent2, "intent");
            Bundle extras2 = intent2.getExtras();
            if (extras2 != null && (string = extras2.getString("value")) != null && C0311a.m1529a((Context) this, string) != 0) {
                C0276a.m1424a(this, new String[]{string}, 0);
            }
        } else if (num != null && num.intValue() == 1) {
            C2037a.C2039b.m8351a(C2037a.f5629s0, this, (List) null, new C2056b(this), 2, (Object) null);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C3370k.m12227b(strArr, "permissions");
        C3370k.m12227b(iArr, "grantResults");
        if (i == 0) {
            finish();
        }
    }
}
