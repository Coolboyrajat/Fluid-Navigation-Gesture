package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.p002c.C0323f;

/* renamed from: androidx.appcompat.widget.r0 */
public class C0217r0 {

    /* renamed from: a */
    private final Context f1064a;

    /* renamed from: b */
    private final TypedArray f1065b;

    /* renamed from: c */
    private TypedValue f1066c;

    private C0217r0(Context context, TypedArray typedArray) {
        this.f1064a = context;
        this.f1065b = typedArray;
    }

    /* renamed from: a */
    public static C0217r0 m1052a(Context context, int i, int[] iArr) {
        return new C0217r0(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: a */
    public static C0217r0 m1053a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0217r0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static C0217r0 m1054a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0217r0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public float mo1527a(int i, float f) {
        return this.f1065b.getDimension(i, f);
    }

    /* renamed from: a */
    public int mo1528a(int i, int i2) {
        return this.f1065b.getColor(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = p006b.p007a.p008k.p009a.C0664a.m3681b(r2.f1064a, (r0 = r2.f1065b.getResourceId(r3, 0)));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList mo1529a(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f1065b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f1065b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f1064a
            android.content.res.ColorStateList r0 = p006b.p007a.p008k.p009a.C0664a.m3681b(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f1065b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0217r0.mo1529a(int):android.content.res.ColorStateList");
    }

    /* renamed from: a */
    public Typeface mo1530a(int i, int i2, C0323f.C0324a aVar) {
        int resourceId = this.f1065b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1066c == null) {
            this.f1066c = new TypedValue();
        }
        return C0323f.m1581a(this.f1064a, resourceId, this.f1066c, i2, aVar);
    }

    /* renamed from: a */
    public void mo1531a() {
        this.f1065b.recycle();
    }

    /* renamed from: a */
    public boolean mo1532a(int i, boolean z) {
        return this.f1065b.getBoolean(i, z);
    }

    /* renamed from: b */
    public float mo1533b(int i, float f) {
        return this.f1065b.getFloat(i, f);
    }

    /* renamed from: b */
    public int mo1534b(int i, int i2) {
        return this.f1065b.getDimensionPixelOffset(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f1065b.getResourceId(r3, 0);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable mo1535b(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f1065b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f1065b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f1064a
            android.graphics.drawable.Drawable r3 = p006b.p007a.p008k.p009a.C0664a.m3682c(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f1065b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0217r0.mo1535b(int):android.graphics.drawable.Drawable");
    }

    /* renamed from: c */
    public int mo1536c(int i, int i2) {
        return this.f1065b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: c */
    public Drawable mo1537c(int i) {
        int resourceId;
        if (!this.f1065b.hasValue(i) || (resourceId = this.f1065b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0192i.m963b().mo1387a(this.f1064a, resourceId, true);
    }

    /* renamed from: d */
    public int mo1538d(int i, int i2) {
        return this.f1065b.getInt(i, i2);
    }

    /* renamed from: d */
    public String mo1539d(int i) {
        return this.f1065b.getString(i);
    }

    /* renamed from: e */
    public int mo1540e(int i, int i2) {
        return this.f1065b.getInteger(i, i2);
    }

    /* renamed from: e */
    public CharSequence mo1541e(int i) {
        return this.f1065b.getText(i);
    }

    /* renamed from: f */
    public int mo1542f(int i, int i2) {
        return this.f1065b.getLayoutDimension(i, i2);
    }

    /* renamed from: f */
    public CharSequence[] mo1543f(int i) {
        return this.f1065b.getTextArray(i);
    }

    /* renamed from: g */
    public int mo1544g(int i, int i2) {
        return this.f1065b.getResourceId(i, i2);
    }

    /* renamed from: g */
    public boolean mo1545g(int i) {
        return this.f1065b.hasValue(i);
    }
}
