package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p006b.p007a.C0663j;
import p190io.objectbox.BoxStoreBuilder;

/* renamed from: androidx.appcompat.widget.v */
class C0241v {

    /* renamed from: k */
    private static final RectF f1150k = new RectF();

    /* renamed from: l */
    private static ConcurrentHashMap<String, Method> f1151l = new ConcurrentHashMap<>();

    /* renamed from: m */
    private static ConcurrentHashMap<String, Field> f1152m = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f1153a = 0;

    /* renamed from: b */
    private boolean f1154b = false;

    /* renamed from: c */
    private float f1155c = -1.0f;

    /* renamed from: d */
    private float f1156d = -1.0f;

    /* renamed from: e */
    private float f1157e = -1.0f;

    /* renamed from: f */
    private int[] f1158f = new int[0];

    /* renamed from: g */
    private boolean f1159g = false;

    /* renamed from: h */
    private TextPaint f1160h;

    /* renamed from: i */
    private final TextView f1161i;

    /* renamed from: j */
    private final Context f1162j;

    C0241v(TextView textView) {
        this.f1161i = textView;
        this.f1162j = this.f1161i.getContext();
    }

    /* renamed from: a */
    private int m1191a(RectF rectF) {
        int length = this.f1158f.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m1198a(this.f1158f[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f1158f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: a */
    private StaticLayout m1192a(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1160h, i, alignment, ((Float) m1193a((Object) this.f1161i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) m1193a((Object) this.f1161i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) m1193a((Object) this.f1161i, "mIncludePad", true)).booleanValue());
    }

    /* renamed from: a */
    private static <T> T m1193a(Object obj, String str, T t) {
        try {
            Field a = m1194a(str);
            return a == null ? t : a.get(obj);
        } catch (IllegalAccessException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return t;
        }
    }

    /* renamed from: a */
    private static Field m1194a(String str) {
        try {
            Field field = f1152m.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f1152m.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return null;
        }
    }

    /* renamed from: a */
    private void m1195a(float f) {
        if (f != this.f1161i.getPaint().getTextSize()) {
            this.f1161i.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f1161i.isInLayout() : false;
            if (this.f1161i.getLayout() != null) {
                this.f1154b = false;
                try {
                    Method b = m1203b("nullLayouts");
                    if (b != null) {
                        b.invoke(this.f1161i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f1161i.requestLayout();
                } else {
                    this.f1161i.forceLayout();
                }
                this.f1161i.invalidate();
            }
        }
    }

    /* renamed from: a */
    private void m1196a(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f1153a = 1;
            this.f1156d = f;
            this.f1157e = f2;
            this.f1155c = f3;
            this.f1159g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    /* renamed from: a */
    private void m1197a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1158f = m1199a(iArr);
            m1206j();
        }
    }

    /* renamed from: a */
    private boolean m1198a(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1161i.getText();
        TransformationMethod transformationMethod = this.f1161i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f1161i)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f1161i.getMaxLines() : -1;
        mo1684a(i);
        StaticLayout a = mo1682a(text, (Layout.Alignment) m1202b((Object) this.f1161i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (a.getLineCount() <= maxLines && a.getLineEnd(a.getLineCount() - 1) == text.length())) && ((float) a.getHeight()) <= rectF.bottom;
    }

    /* renamed from: a */
    private int[] m1199a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: b */
    private StaticLayout m1200b(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1160h, i, alignment, this.f1161i.getLineSpacingMultiplier(), this.f1161i.getLineSpacingExtra(), this.f1161i.getIncludeFontPadding());
    }

    /* renamed from: b */
    private StaticLayout m1201b(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1160h, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f1161i.getLineSpacingExtra(), this.f1161i.getLineSpacingMultiplier()).setIncludePad(this.f1161i.getIncludeFontPadding()).setBreakStrategy(this.f1161i.getBreakStrategy()).setHyphenationFrequency(this.f1161i.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            obtain.setTextDirection(Build.VERSION.SDK_INT >= 29 ? this.f1161i.getTextDirectionHeuristic() : (TextDirectionHeuristic) m1202b((Object) this.f1161i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    /* renamed from: b */
    private static <T> T m1202b(Object obj, String str, T t) {
        try {
            return m1203b(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: b */
    private static Method m1203b(String str) {
        try {
            Method method = f1151l.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1151l.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: h */
    private void m1204h() {
        this.f1153a = 0;
        this.f1156d = -1.0f;
        this.f1157e = -1.0f;
        this.f1155c = -1.0f;
        this.f1158f = new int[0];
        this.f1154b = false;
    }

    /* renamed from: i */
    private boolean m1205i() {
        if (!m1207k() || this.f1153a != 1) {
            this.f1154b = false;
        } else {
            if (!this.f1159g || this.f1158f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f1157e - this.f1156d) / this.f1155c))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f1156d + (((float) i) * this.f1155c));
                }
                this.f1158f = m1199a(iArr);
            }
            this.f1154b = true;
        }
        return this.f1154b;
    }

    /* renamed from: j */
    private boolean m1206j() {
        int length = this.f1158f.length;
        this.f1159g = length > 0;
        if (this.f1159g) {
            this.f1153a = 1;
            int[] iArr = this.f1158f;
            this.f1156d = (float) iArr[0];
            this.f1157e = (float) iArr[length - 1];
            this.f1155c = -1.0f;
        }
        return this.f1159g;
    }

    /* renamed from: k */
    private boolean m1207k() {
        return !(this.f1161i instanceof C0195j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public StaticLayout mo1682a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        return i3 >= 23 ? m1201b(charSequence, alignment, i, i2) : i3 >= 16 ? m1200b(charSequence, alignment, i) : m1192a(charSequence, alignment, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1683a() {
        if (mo1695g()) {
            if (this.f1154b) {
                if (this.f1161i.getMeasuredHeight() > 0 && this.f1161i.getMeasuredWidth() > 0) {
                    int measuredWidth = Build.VERSION.SDK_INT >= 29 ? this.f1161i.isHorizontallyScrollable() : ((Boolean) m1202b((Object) this.f1161i, "getHorizontallyScrolling", false)).booleanValue() ? BoxStoreBuilder.DEFAULT_MAX_DB_SIZE_KBYTE : (this.f1161i.getMeasuredWidth() - this.f1161i.getTotalPaddingLeft()) - this.f1161i.getTotalPaddingRight();
                    int height = (this.f1161i.getHeight() - this.f1161i.getCompoundPaddingBottom()) - this.f1161i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        synchronized (f1150k) {
                            f1150k.setEmpty();
                            f1150k.right = (float) measuredWidth;
                            f1150k.bottom = (float) height;
                            float a = (float) m1191a(f1150k);
                            if (a != this.f1161i.getTextSize()) {
                                mo1685a(0, a);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1154b = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1684a(int i) {
        TextPaint textPaint = this.f1160h;
        if (textPaint == null) {
            this.f1160h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1160h.set(this.f1161i.getPaint());
        this.f1160h.setTextSize((float) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1685a(int i, float f) {
        Context context = this.f1162j;
        m1195a(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1686a(int i, int i2, int i3, int i4) {
        if (m1207k()) {
            DisplayMetrics displayMetrics = this.f1162j.getResources().getDisplayMetrics();
            m1196a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m1205i()) {
                mo1683a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1687a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1162j.obtainStyledAttributes(attributeSet, C0663j.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(C0663j.AppCompatTextView_autoSizeTextType)) {
            this.f1153a = obtainStyledAttributes.getInt(C0663j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C0663j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C0663j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C0663j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C0663j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C0663j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C0663j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C0663j.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(C0663j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m1197a(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m1207k()) {
            this.f1153a = 0;
        } else if (this.f1153a == 1) {
            if (!this.f1159g) {
                DisplayMetrics displayMetrics = this.f1162j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m1196a(dimension2, dimension3, dimension);
            }
            m1205i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1688a(int[] iArr, int i) {
        if (m1207k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1162j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f1158f = m1199a(iArr2);
                if (!m1206j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1159g = false;
            }
            if (m1205i()) {
                mo1683a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo1689b() {
        return Math.round(this.f1157e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1690b(int i) {
        if (!m1207k()) {
            return;
        }
        if (i == 0) {
            m1204h();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f1162j.getResources().getDisplayMetrics();
            m1196a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m1205i()) {
                mo1683a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo1691c() {
        return Math.round(this.f1156d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo1692d() {
        return Math.round(this.f1155c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] mo1693e() {
        return this.f1158f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo1694f() {
        return this.f1153a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo1695g() {
        return m1207k() && this.f1153a != 0;
    }
}
