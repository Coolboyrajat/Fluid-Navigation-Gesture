package p006b.p050n;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import p006b.p026g.p035k.C0890v;
import p006b.p050n.C0992m;

/* renamed from: b.n.d */
public class C0963d extends C0982i0 {

    /* renamed from: b.n.d$a */
    class C0964a extends C0999n {

        /* renamed from: a */
        final /* synthetic */ View f3460a;

        C0964a(C0963d dVar, View view) {
            this.f3460a = view;
        }

        /* renamed from: d */
        public void mo4846d(C0992m mVar) {
            C0966d0.m5064a(this.f3460a, 1.0f);
            C0966d0.m5063a(this.f3460a);
            mVar.mo4906b((C0992m.C0998f) this);
        }
    }

    /* renamed from: b.n.d$b */
    private static class C0965b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f3461a;

        /* renamed from: b */
        private boolean f3462b = false;

        C0965b(View view) {
            this.f3461a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C0966d0.m5064a(this.f3461a, 1.0f);
            if (this.f3462b) {
                this.f3461a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (C0890v.m4801y(this.f3461a) && this.f3461a.getLayerType() == 0) {
                this.f3462b = true;
                this.f3461a.setLayerType(2, (Paint) null);
            }
        }
    }

    public C0963d(int i) {
        mo4874a(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f3573a.get("android:fade:transitionAlpha");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float m5056a(p006b.p050n.C1008s r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f3573a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p050n.C0963d.m5056a(b.n.s, float):float");
    }

    /* renamed from: a */
    private Animator m5057a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C0966d0.m5064a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C0966d0.f3466d, new float[]{f2});
        ofFloat.addListener(new C0965b(view));
        mo4892a((C0992m.C0998f) new C0964a(this, view));
        return ofFloat;
    }

    /* renamed from: a */
    public Animator mo4849a(ViewGroup viewGroup, View view, C1008s sVar, C1008s sVar2) {
        float f = 0.0f;
        float a = m5056a(sVar, 0.0f);
        if (a != 1.0f) {
            f = a;
        }
        return m5057a(view, f, 1.0f);
    }

    /* renamed from: b */
    public Animator mo4850b(ViewGroup viewGroup, View view, C1008s sVar, C1008s sVar2) {
        C0966d0.m5072e(view);
        return m5057a(view, m5056a(sVar, 1.0f), 0.0f);
    }

    /* renamed from: c */
    public void mo4815c(C1008s sVar) {
        super.mo4815c(sVar);
        sVar.f3573a.put("android:fade:transitionAlpha", Float.valueOf(C0966d0.m5070c(sVar.f3574b)));
    }
}
