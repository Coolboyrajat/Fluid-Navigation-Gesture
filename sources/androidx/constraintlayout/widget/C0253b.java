package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import p006b.p022e.p023a.p024j.C0765j;

/* renamed from: androidx.constraintlayout.widget.b */
public abstract class C0253b extends View {

    /* renamed from: f */
    protected int[] f1262f = new int[32];

    /* renamed from: g */
    protected int f1263g;

    /* renamed from: h */
    protected Context f1264h;

    /* renamed from: i */
    protected C0765j f1265i;

    /* renamed from: j */
    protected boolean f1266j = false;

    /* renamed from: k */
    private String f1267k;

    public C0253b(Context context) {
        super(context);
        this.f1264h = context;
        mo1734a((AttributeSet) null);
    }

    /* renamed from: a */
    private void m1285a(String str) {
        int i;
        Object a;
        if (str != null && this.f1264h != null) {
            String trim = str.trim();
            try {
                i = C0261g.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = this.f1264h.getResources().getIdentifier(trim, "id", this.f1264h.getPackageName());
            }
            if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (a = ((ConstraintLayout) getParent()).mo1704a(0, (Object) trim)) != null && (a instanceof Integer)) {
                i = ((Integer) a).intValue();
            }
            if (i != 0) {
                setTag(i, (Object) null);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m1285a(str.substring(i));
                    return;
                } else {
                    m1285a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1738a() {
        if (this.f1265i != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.C0250a) {
                ((ConstraintLayout.C0250a) layoutParams).f1241k0 = this.f1265i;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1734a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0262h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0262h.ConstraintLayout_Layout_constraint_referenced_ids) {
                    this.f1267k = obtainStyledAttributes.getString(index);
                    setIds(this.f1267k);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1739a(ConstraintLayout constraintLayout) {
    }

    /* renamed from: b */
    public void mo1740b(ConstraintLayout constraintLayout) {
    }

    /* renamed from: c */
    public void mo1741c(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f1267k);
        }
        C0765j jVar = this.f1265i;
        if (jVar != null) {
            jVar.mo4421J();
            for (int i = 0; i < this.f1263g; i++) {
                View a = constraintLayout.mo1702a(this.f1262f[i]);
                if (a != null) {
                    this.f1265i.mo4425b(constraintLayout.mo1703a(a));
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1262f, this.f1263g);
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1266j) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1263g = 0;
        for (int tag : iArr) {
            setTag(tag, (Object) null);
        }
    }

    public void setTag(int i, Object obj) {
        int i2 = this.f1263g + 1;
        int[] iArr = this.f1262f;
        if (i2 > iArr.length) {
            this.f1262f = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1262f;
        int i3 = this.f1263g;
        iArr2[i3] = i;
        this.f1263g = i3 + 1;
    }
}
