package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p006b.p022e.p023a.p024j.C0750b;

/* renamed from: androidx.constraintlayout.widget.a */
public class C0252a extends C0253b {

    /* renamed from: l */
    private int f1259l;

    /* renamed from: m */
    private int f1260m;

    /* renamed from: n */
    private C0750b f1261n;

    public C0252a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1734a(AttributeSet attributeSet) {
        super.mo1734a(attributeSet);
        this.f1261n = new C0750b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0262h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0262h.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0262h.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f1261n.mo4303c(obtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.f1265i = this.f1261n;
        mo1738a();
    }

    public int getType() {
        return this.f1259l;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1261n.mo4303c(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r6 == 6) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r6 == 6) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r6 == 6) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setType(int r6) {
        /*
            r5 = this;
            r5.f1259l = r6
            r5.f1260m = r6
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 6
            r1 = 5
            r2 = 0
            r3 = 1
            r4 = 17
            if (r6 >= r4) goto L_0x001a
            int r6 = r5.f1259l
            if (r6 != r1) goto L_0x0015
        L_0x0012:
            r5.f1260m = r2
            goto L_0x003d
        L_0x0015:
            if (r6 != r0) goto L_0x003d
        L_0x0017:
            r5.f1260m = r3
            goto L_0x003d
        L_0x001a:
            android.content.res.Resources r6 = r5.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.getLayoutDirection()
            if (r3 != r6) goto L_0x002a
            r6 = 1
            goto L_0x002b
        L_0x002a:
            r6 = 0
        L_0x002b:
            if (r6 == 0) goto L_0x0035
            int r6 = r5.f1259l
            if (r6 != r1) goto L_0x0032
            goto L_0x0017
        L_0x0032:
            if (r6 != r0) goto L_0x003d
            goto L_0x0012
        L_0x0035:
            int r6 = r5.f1259l
            if (r6 != r1) goto L_0x003a
            goto L_0x0012
        L_0x003a:
            if (r6 != r0) goto L_0x003d
            goto L_0x0017
        L_0x003d:
            b.e.a.j.b r6 = r5.f1261n
            int r0 = r5.f1260m
            r6.mo4304t(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0252a.setType(int):void");
    }
}
