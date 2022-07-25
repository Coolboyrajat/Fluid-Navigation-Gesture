package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0192i;
import androidx.appcompat.widget.C0249z;
import androidx.core.content.C0311a;
import androidx.core.graphics.drawable.C0328a;
import androidx.core.widget.C0348i;
import com.google.android.material.internal.C2661a;
import com.google.android.material.internal.C2663b;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p006b.p007a.p008k.p009a.C0664a;
import p006b.p026g.p035k.C0838a;
import p006b.p026g.p035k.C0890v;
import p006b.p026g.p035k.p036e0.C0857c;
import p006b.p039i.p040a.C0912a;
import p054c.p083e.p084a.p085a.C1169b;
import p054c.p083e.p084a.p085a.C1170c;
import p054c.p083e.p084a.p085a.C1173f;
import p054c.p083e.p084a.p085a.C1176i;
import p054c.p083e.p084a.p085a.C1177j;
import p054c.p083e.p084a.p085a.p087l.C1179a;
import p054c.p083e.p084a.p085a.p093q.C1207a;
import p054c.p083e.p084a.p085a.p102z.C1233d;
import p054c.p083e.p084a.p085a.p102z.C1238g;
import p190io.objectbox.model.PropertyFlags;

public class TextInputLayout extends LinearLayout {

    /* renamed from: w0 */
    private static final int f7160w0 = C1177j.Widget_Design_TextInputLayout;

    /* renamed from: A */
    private final int f7161A;

    /* renamed from: B */
    private int f7162B;

    /* renamed from: C */
    private final int f7163C;

    /* renamed from: D */
    private final int f7164D;

    /* renamed from: E */
    private int f7165E;

    /* renamed from: F */
    private int f7166F;

    /* renamed from: G */
    private final Rect f7167G;

    /* renamed from: H */
    private final Rect f7168H;

    /* renamed from: I */
    private final RectF f7169I;

    /* renamed from: J */
    private Typeface f7170J;

    /* renamed from: K */
    private final CheckableImageButton f7171K;

    /* renamed from: L */
    private ColorStateList f7172L;

    /* renamed from: M */
    private boolean f7173M;

    /* renamed from: N */
    private PorterDuff.Mode f7174N;

    /* renamed from: O */
    private boolean f7175O;

    /* renamed from: P */
    private Drawable f7176P;

    /* renamed from: Q */
    private View.OnLongClickListener f7177Q;

    /* renamed from: R */
    private final LinkedHashSet<C2713e> f7178R;

    /* renamed from: S */
    private int f7179S;

    /* renamed from: T */
    private final SparseArray<C2738e> f7180T;

    /* renamed from: U */
    private final CheckableImageButton f7181U;

    /* renamed from: V */
    private final LinkedHashSet<C2714f> f7182V;

    /* renamed from: W */
    private ColorStateList f7183W;

    /* renamed from: a0 */
    private boolean f7184a0;

    /* renamed from: b0 */
    private PorterDuff.Mode f7185b0;

    /* renamed from: c0 */
    private boolean f7186c0;

    /* renamed from: d0 */
    private Drawable f7187d0;

    /* renamed from: e0 */
    private Drawable f7188e0;

    /* renamed from: f */
    private final FrameLayout f7189f;

    /* renamed from: f0 */
    private final CheckableImageButton f7190f0;

    /* renamed from: g */
    private final FrameLayout f7191g;

    /* renamed from: g0 */
    private View.OnLongClickListener f7192g0;

    /* renamed from: h */
    EditText f7193h;

    /* renamed from: h0 */
    private ColorStateList f7194h0;

    /* renamed from: i */
    private CharSequence f7195i;

    /* renamed from: i0 */
    private ColorStateList f7196i0;

    /* renamed from: j */
    private final C2739f f7197j;

    /* renamed from: j0 */
    private final int f7198j0;

    /* renamed from: k */
    boolean f7199k;

    /* renamed from: k0 */
    private final int f7200k0;

    /* renamed from: l */
    private int f7201l;

    /* renamed from: l0 */
    private int f7202l0;

    /* renamed from: m */
    private boolean f7203m;

    /* renamed from: m0 */
    private int f7204m0;

    /* renamed from: n */
    private TextView f7205n;

    /* renamed from: n0 */
    private final int f7206n0;

    /* renamed from: o */
    private int f7207o;

    /* renamed from: o0 */
    private final int f7208o0;

    /* renamed from: p */
    private int f7209p;

    /* renamed from: p0 */
    private final int f7210p0;

    /* renamed from: q */
    private ColorStateList f7211q;

    /* renamed from: q0 */
    private boolean f7212q0;

    /* renamed from: r */
    private ColorStateList f7213r;

    /* renamed from: r0 */
    final C2661a f7214r0;

    /* renamed from: s */
    private boolean f7215s;

    /* renamed from: s0 */
    private boolean f7216s0;

    /* renamed from: t */
    private CharSequence f7217t;

    /* renamed from: t0 */
    private ValueAnimator f7218t0;

    /* renamed from: u */
    private boolean f7219u;

    /* renamed from: u0 */
    private boolean f7220u0;

    /* renamed from: v */
    private C1233d f7221v;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public boolean f7222v0;

    /* renamed from: w */
    private C1233d f7223w;

    /* renamed from: x */
    private C1238g f7224x;

    /* renamed from: y */
    private final int f7225y;

    /* renamed from: z */
    private int f7226z;

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    class C2709a implements TextWatcher {
        C2709a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.mo8641a(!textInputLayout.f7222v0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f7199k) {
                textInputLayout2.mo8637a(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    class C2710b implements Runnable {
        C2710b() {
        }

        public void run() {
            TextInputLayout.this.f7193h.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    class C2711c implements ValueAnimator.AnimatorUpdateListener {
        C2711c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f7214r0.mo8513b(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    public static class C2712d extends C0838a {

        /* renamed from: d */
        private final TextInputLayout f7230d;

        public C2712d(TextInputLayout textInputLayout) {
            this.f7230d = textInputLayout;
        }

        /* renamed from: a */
        public void mo2093a(View view, C0857c cVar) {
            super.mo2093a(view, cVar);
            EditText editText = this.f7230d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f7230d.getHint();
            CharSequence error = this.f7230d.getError();
            CharSequence counterOverflowDescription = this.f7230d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(error);
            boolean z4 = false;
            boolean z5 = z3 || !TextUtils.isEmpty(counterOverflowDescription);
            if (z) {
                cVar.mo4613g((CharSequence) text);
            } else if (z2) {
                cVar.mo4613g(hint);
            }
            if (z2) {
                cVar.mo4603d(hint);
                if (!z && z2) {
                    z4 = true;
                }
                cVar.mo4626m(z4);
            }
            if (z5) {
                if (!z3) {
                    error = counterOverflowDescription;
                }
                cVar.mo4599c(error);
                cVar.mo4607e(true);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public interface C2713e {
        /* renamed from: a */
        void mo8756a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface C2714f {
        /* renamed from: a */
        void mo8757a(TextInputLayout textInputLayout, int i);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    static class C2715g extends C0912a {
        public static final Parcelable.Creator<C2715g> CREATOR = new C2716a();

        /* renamed from: h */
        CharSequence f7231h;

        /* renamed from: i */
        boolean f7232i;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$g$a */
        static class C2716a implements Parcelable.ClassLoaderCreator<C2715g> {
            C2716a() {
            }

            public C2715g createFromParcel(Parcel parcel) {
                return new C2715g(parcel, (ClassLoader) null);
            }

            public C2715g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2715g(parcel, classLoader);
            }

            public C2715g[] newArray(int i) {
                return new C2715g[i];
            }
        }

        C2715g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7231h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f7232i = parcel.readInt() != 1 ? false : true;
        }

        C2715g(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f7231h + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f7231h, parcel, i);
            parcel.writeInt(this.f7232i ? 1 : 0);
        }
    }

    public TextInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1169b.textInputStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r1 = f7160w0
            r2 = r17
            android.content.Context r1 = com.google.android.material.internal.C2672g.m10585b(r2, r7, r8, r1)
            r0.<init>(r1, r7, r8)
            com.google.android.material.textfield.f r1 = new com.google.android.material.textfield.f
            r1.<init>(r0)
            r0.f7197j = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f7167G = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f7168H = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f7169I = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f7178R = r1
            r9 = 0
            r0.f7179S = r9
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.f7180T = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f7182V = r1
            com.google.android.material.internal.a r1 = new com.google.android.material.internal.a
            r1.<init>(r0)
            r0.f7214r0 = r1
            android.content.Context r10 = r16.getContext()
            r11 = 1
            r0.setOrientation(r11)
            r0.setWillNotDraw(r9)
            r0.setAddStatesFromChildren(r11)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r10)
            r0.f7189f = r1
            android.widget.FrameLayout r1 = r0.f7189f
            r1.setAddStatesFromChildren(r11)
            android.widget.FrameLayout r1 = r0.f7189f
            r0.addView(r1)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r10)
            r0.f7191g = r1
            android.widget.FrameLayout r1 = r0.f7191g
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -2
            r4 = 8388629(0x800015, float:1.1754973E-38)
            r2.<init>(r3, r3, r4)
            r1.setLayoutParams(r2)
            android.widget.FrameLayout r1 = r0.f7189f
            android.widget.FrameLayout r2 = r0.f7191g
            r1.addView(r2)
            com.google.android.material.internal.a r1 = r0.f7214r0
            android.animation.TimeInterpolator r2 = p054c.p083e.p084a.p085a.p087l.C1179a.f3914a
            r1.mo8516b((android.animation.TimeInterpolator) r2)
            com.google.android.material.internal.a r1 = r0.f7214r0
            android.animation.TimeInterpolator r2 = p054c.p083e.p084a.p085a.p087l.C1179a.f3914a
            r1.mo8504a((android.animation.TimeInterpolator) r2)
            com.google.android.material.internal.a r1 = r0.f7214r0
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.mo8514b((int) r2)
            int[] r3 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout
            int r5 = f7160w0
            r1 = 5
            int[] r6 = new int[r1]
            int r1 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_counterTextAppearance
            r6[r9] = r1
            int r1 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_counterOverflowTextAppearance
            r6[r11] = r1
            int r1 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_errorTextAppearance
            r12 = 2
            r6[r12] = r1
            int r1 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_helperTextTextAppearance
            r13 = 3
            r6[r13] = r1
            int r1 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_hintTextAppearance
            r2 = 4
            r6[r2] = r1
            r1 = r10
            r2 = r18
            r4 = r19
            androidx.appcompat.widget.r0 r1 = com.google.android.material.internal.C2672g.m10590d(r1, r2, r3, r4, r5, r6)
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_hintEnabled
            boolean r2 = r1.mo1532a((int) r2, (boolean) r11)
            r0.f7215s = r2
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_android_hint
            java.lang.CharSequence r2 = r1.mo1541e(r2)
            r0.setHint(r2)
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_hintAnimationEnabled
            boolean r2 = r1.mo1532a((int) r2, (boolean) r11)
            r0.f7216s0 = r2
            int r2 = f7160w0
            c.e.a.a.z.g$b r2 = p054c.p083e.p084a.p085a.p102z.C1238g.m5967a((android.content.Context) r10, (android.util.AttributeSet) r7, (int) r8, (int) r2)
            c.e.a.a.z.g r2 = r2.mo5547a()
            r0.f7224x = r2
            android.content.res.Resources r2 = r10.getResources()
            int r3 = p054c.p083e.p084a.p085a.C1171d.mtrl_textinput_box_label_cutout_padding
            int r2 = r2.getDimensionPixelOffset(r3)
            r0.f7225y = r2
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_boxCollapsedPaddingTop
            int r2 = r1.mo1534b((int) r2, (int) r9)
            r0.f7161A = r2
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_boxStrokeWidth
            android.content.res.Resources r3 = r10.getResources()
            int r4 = p054c.p083e.p084a.p085a.C1171d.mtrl_textinput_box_stroke_width_default
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.mo1536c(r2, r3)
            r0.f7163C = r2
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_boxStrokeWidthFocused
            android.content.res.Resources r3 = r10.getResources()
            int r4 = p054c.p083e.p084a.p085a.C1171d.mtrl_textinput_box_stroke_width_focused
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.mo1536c(r2, r3)
            r0.f7164D = r2
            int r2 = r0.f7163C
            r0.f7162B = r2
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_boxCornerRadiusTopStart
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r1.mo1527a((int) r2, (float) r3)
            int r4 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_boxCornerRadiusTopEnd
            float r4 = r1.mo1527a((int) r4, (float) r3)
            int r5 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_boxCornerRadiusBottomEnd
            float r5 = r1.mo1527a((int) r5, (float) r3)
            int r6 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_boxCornerRadiusBottomStart
            float r3 = r1.mo1527a((int) r6, (float) r3)
            c.e.a.a.z.g r6 = r0.f7224x
            c.e.a.a.z.g$b r6 = r6.mo5542k()
            r7 = 0
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 < 0) goto L_0x014d
            r6.mo5557e((float) r2)
        L_0x014d:
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0154
            r6.mo5558f((float) r4)
        L_0x0154:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x015b
            r6.mo5551c((float) r5)
        L_0x015b:
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0162
            r6.mo5548b((float) r3)
        L_0x0162:
            c.e.a.a.z.g r2 = r6.mo5547a()
            r0.f7224x = r2
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_boxBackgroundColor
            android.content.res.ColorStateList r2 = p054c.p083e.p084a.p085a.p099w.C1218c.m5862a((android.content.Context) r10, (androidx.appcompat.widget.C0217r0) r1, (int) r2)
            r3 = 16843623(0x1010367, float:2.3696E-38)
            r4 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r5 = -1
            if (r2 == 0) goto L_0x01b5
            int r6 = r2.getDefaultColor()
            r0.f7204m0 = r6
            int r6 = r0.f7204m0
            r0.f7166F = r6
            boolean r6 = r2.isStateful()
            if (r6 == 0) goto L_0x019a
            int[] r6 = new int[r11]
            r6[r9] = r4
            int r6 = r2.getColorForState(r6, r5)
            r0.f7206n0 = r6
            int[] r6 = new int[r11]
            r6[r9] = r3
            int r2 = r2.getColorForState(r6, r5)
            goto L_0x01b2
        L_0x019a:
            int r2 = p054c.p083e.p084a.p085a.C1170c.mtrl_filled_background_color
            android.content.res.ColorStateList r2 = p006b.p007a.p008k.p009a.C0664a.m3681b(r10, r2)
            int[] r6 = new int[r11]
            r6[r9] = r4
            int r6 = r2.getColorForState(r6, r5)
            r0.f7206n0 = r6
            int[] r6 = new int[r11]
            r6[r9] = r3
            int r2 = r2.getColorForState(r6, r5)
        L_0x01b2:
            r0.f7208o0 = r2
            goto L_0x01bd
        L_0x01b5:
            r0.f7166F = r9
            r0.f7204m0 = r9
            r0.f7206n0 = r9
            r0.f7208o0 = r9
        L_0x01bd:
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_android_textColorHint
            boolean r2 = r1.mo1545g(r2)
            if (r2 == 0) goto L_0x01cf
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_android_textColorHint
            android.content.res.ColorStateList r2 = r1.mo1529a(r2)
            r0.f7196i0 = r2
            r0.f7194h0 = r2
        L_0x01cf:
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_boxStrokeColor
            android.content.res.ColorStateList r2 = p054c.p083e.p084a.p085a.p099w.C1218c.m5862a((android.content.Context) r10, (androidx.appcompat.widget.C0217r0) r1, (int) r2)
            if (r2 == 0) goto L_0x0205
            boolean r6 = r2.isStateful()
            if (r6 == 0) goto L_0x0205
            int r6 = r2.getDefaultColor()
            r0.f7198j0 = r6
            int[] r6 = new int[r11]
            r6[r9] = r4
            int r4 = r2.getColorForState(r6, r5)
            r0.f7210p0 = r4
            int[] r4 = new int[r11]
            r4[r9] = r3
            int r3 = r2.getColorForState(r4, r5)
            r0.f7200k0 = r3
            int[] r3 = new int[r11]
            r4 = 16842908(0x101009c, float:2.3693995E-38)
            r3[r9] = r4
            int r2 = r2.getColorForState(r3, r5)
            r0.f7202l0 = r2
            goto L_0x0225
        L_0x0205:
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_boxStrokeColor
            int r2 = r1.mo1528a((int) r2, (int) r9)
            r0.f7202l0 = r2
            int r2 = p054c.p083e.p084a.p085a.C1170c.mtrl_textinput_default_box_stroke_color
            int r2 = androidx.core.content.C0311a.m1528a((android.content.Context) r10, (int) r2)
            r0.f7198j0 = r2
            int r2 = p054c.p083e.p084a.p085a.C1170c.mtrl_textinput_disabled_color
            int r2 = androidx.core.content.C0311a.m1528a((android.content.Context) r10, (int) r2)
            r0.f7210p0 = r2
            int r2 = p054c.p083e.p084a.p085a.C1170c.mtrl_textinput_hovered_box_stroke_color
            int r2 = androidx.core.content.C0311a.m1528a((android.content.Context) r10, (int) r2)
            r0.f7200k0 = r2
        L_0x0225:
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_hintTextAppearance
            int r2 = r1.mo1544g(r2, r5)
            if (r2 == r5) goto L_0x0236
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_hintTextAppearance
            int r2 = r1.mo1544g(r2, r9)
            r0.setHintTextAppearance(r2)
        L_0x0236:
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_errorTextAppearance
            int r2 = r1.mo1544g(r2, r9)
            int r3 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_errorEnabled
            boolean r3 = r1.mo1532a((int) r3, (boolean) r9)
            android.content.Context r4 = r16.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r6 = p054c.p083e.p084a.p085a.C1175h.design_text_input_end_icon
            android.widget.FrameLayout r7 = r0.f7189f
            android.view.View r4 = r4.inflate(r6, r7, r9)
            com.google.android.material.internal.CheckableImageButton r4 = (com.google.android.material.internal.CheckableImageButton) r4
            r0.f7190f0 = r4
            android.widget.FrameLayout r4 = r0.f7189f
            com.google.android.material.internal.CheckableImageButton r6 = r0.f7190f0
            r4.addView(r6)
            com.google.android.material.internal.CheckableImageButton r4 = r0.f7190f0
            r6 = 8
            r4.setVisibility(r6)
            int r4 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_errorIconDrawable
            boolean r4 = r1.mo1545g(r4)
            if (r4 == 0) goto L_0x0275
            int r4 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_errorIconDrawable
            android.graphics.drawable.Drawable r4 = r1.mo1535b(r4)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r4)
        L_0x0275:
            int r4 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_errorIconTint
            boolean r4 = r1.mo1545g(r4)
            if (r4 == 0) goto L_0x0286
            int r4 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_errorIconTint
            android.content.res.ColorStateList r4 = p054c.p083e.p084a.p085a.p099w.C1218c.m5862a((android.content.Context) r10, (androidx.appcompat.widget.C0217r0) r1, (int) r4)
            r0.setErrorIconTintList(r4)
        L_0x0286:
            int r4 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_errorIconTintMode
            boolean r4 = r1.mo1545g(r4)
            r7 = 0
            if (r4 == 0) goto L_0x029c
            int r4 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_errorIconTintMode
            int r4 = r1.mo1538d(r4, r5)
            android.graphics.PorterDuff$Mode r4 = com.google.android.material.internal.C2673h.m10593a((int) r4, (android.graphics.PorterDuff.Mode) r7)
            r0.setErrorIconTintMode(r4)
        L_0x029c:
            com.google.android.material.internal.CheckableImageButton r4 = r0.f7190f0
            android.content.res.Resources r8 = r16.getResources()
            int r14 = p054c.p083e.p084a.p085a.C1176i.error_icon_content_description
            java.lang.CharSequence r8 = r8.getText(r14)
            r4.setContentDescription(r8)
            com.google.android.material.internal.CheckableImageButton r4 = r0.f7190f0
            p006b.p026g.p035k.C0890v.m4783h(r4, r12)
            com.google.android.material.internal.CheckableImageButton r4 = r0.f7190f0
            r4.setClickable(r9)
            com.google.android.material.internal.CheckableImageButton r4 = r0.f7190f0
            r4.setFocusable(r9)
            int r4 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_helperTextTextAppearance
            int r4 = r1.mo1544g(r4, r9)
            int r8 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_helperTextEnabled
            boolean r8 = r1.mo1532a((int) r8, (boolean) r9)
            int r14 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_helperText
            java.lang.CharSequence r14 = r1.mo1541e(r14)
            int r15 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_counterEnabled
            boolean r15 = r1.mo1532a((int) r15, (boolean) r9)
            int r13 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_counterMaxLength
            int r13 = r1.mo1538d(r13, r5)
            r0.setCounterMaxLength(r13)
            int r13 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_counterTextAppearance
            int r13 = r1.mo1544g(r13, r9)
            r0.f7209p = r13
            int r13 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_counterOverflowTextAppearance
            int r13 = r1.mo1544g(r13, r9)
            r0.f7207o = r13
            android.content.Context r13 = r16.getContext()
            android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r13)
            int r12 = p054c.p083e.p084a.p085a.C1175h.design_text_input_start_icon
            android.widget.FrameLayout r5 = r0.f7189f
            android.view.View r5 = r13.inflate(r12, r5, r9)
            com.google.android.material.internal.CheckableImageButton r5 = (com.google.android.material.internal.CheckableImageButton) r5
            r0.f7171K = r5
            android.widget.FrameLayout r5 = r0.f7189f
            com.google.android.material.internal.CheckableImageButton r12 = r0.f7171K
            r5.addView(r12)
            com.google.android.material.internal.CheckableImageButton r5 = r0.f7171K
            r5.setVisibility(r6)
            r0.setStartIconOnClickListener(r7)
            r0.setStartIconOnLongClickListener(r7)
            int r5 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_startIconDrawable
            boolean r5 = r1.mo1545g(r5)
            if (r5 == 0) goto L_0x033c
            int r5 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_startIconDrawable
            android.graphics.drawable.Drawable r5 = r1.mo1535b(r5)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r5)
            int r5 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_startIconContentDescription
            boolean r5 = r1.mo1545g(r5)
            if (r5 == 0) goto L_0x0333
            int r5 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_startIconContentDescription
            java.lang.CharSequence r5 = r1.mo1541e(r5)
            r0.setStartIconContentDescription((java.lang.CharSequence) r5)
        L_0x0333:
            int r5 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_startIconCheckable
            boolean r5 = r1.mo1532a((int) r5, (boolean) r11)
            r0.setStartIconCheckable(r5)
        L_0x033c:
            int r5 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_startIconTint
            boolean r5 = r1.mo1545g(r5)
            if (r5 == 0) goto L_0x034d
            int r5 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_startIconTint
            android.content.res.ColorStateList r5 = p054c.p083e.p084a.p085a.p099w.C1218c.m5862a((android.content.Context) r10, (androidx.appcompat.widget.C0217r0) r1, (int) r5)
            r0.setStartIconTintList(r5)
        L_0x034d:
            int r5 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_startIconTintMode
            boolean r5 = r1.mo1545g(r5)
            if (r5 == 0) goto L_0x0363
            int r5 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_startIconTintMode
            r12 = -1
            int r5 = r1.mo1538d(r5, r12)
            android.graphics.PorterDuff$Mode r5 = com.google.android.material.internal.C2673h.m10593a((int) r5, (android.graphics.PorterDuff.Mode) r7)
            r0.setStartIconTintMode(r5)
        L_0x0363:
            r0.setHelperTextEnabled(r8)
            r0.setHelperText(r14)
            r0.setHelperTextTextAppearance(r4)
            r0.setErrorEnabled(r3)
            r0.setErrorTextAppearance(r2)
            int r2 = r0.f7209p
            r0.setCounterTextAppearance(r2)
            int r2 = r0.f7207o
            r0.setCounterOverflowTextAppearance(r2)
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_errorTextColor
            boolean r2 = r1.mo1545g(r2)
            if (r2 == 0) goto L_0x038d
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_errorTextColor
            android.content.res.ColorStateList r2 = r1.mo1529a(r2)
            r0.setErrorTextColor(r2)
        L_0x038d:
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_helperTextTextColor
            boolean r2 = r1.mo1545g(r2)
            if (r2 == 0) goto L_0x039e
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_helperTextTextColor
            android.content.res.ColorStateList r2 = r1.mo1529a(r2)
            r0.setHelperTextColor(r2)
        L_0x039e:
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_hintTextColor
            boolean r2 = r1.mo1545g(r2)
            if (r2 == 0) goto L_0x03af
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_hintTextColor
            android.content.res.ColorStateList r2 = r1.mo1529a(r2)
            r0.setHintTextColor(r2)
        L_0x03af:
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_counterTextColor
            boolean r2 = r1.mo1545g(r2)
            if (r2 == 0) goto L_0x03c0
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_counterTextColor
            android.content.res.ColorStateList r2 = r1.mo1529a(r2)
            r0.setCounterTextColor(r2)
        L_0x03c0:
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_counterOverflowTextColor
            boolean r2 = r1.mo1545g(r2)
            if (r2 == 0) goto L_0x03d1
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_counterOverflowTextColor
            android.content.res.ColorStateList r2 = r1.mo1529a(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x03d1:
            r0.setCounterEnabled(r15)
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_boxBackgroundMode
            int r2 = r1.mo1538d(r2, r9)
            r0.setBoxBackgroundMode(r2)
            android.content.Context r2 = r16.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            int r3 = p054c.p083e.p084a.p085a.C1175h.design_text_input_end_icon
            android.widget.FrameLayout r4 = r0.f7191g
            android.view.View r2 = r2.inflate(r3, r4, r9)
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            r0.f7181U = r2
            android.widget.FrameLayout r2 = r0.f7191g
            com.google.android.material.internal.CheckableImageButton r3 = r0.f7181U
            r2.addView(r3)
            com.google.android.material.internal.CheckableImageButton r2 = r0.f7181U
            r2.setVisibility(r6)
            android.util.SparseArray<com.google.android.material.textfield.e> r2 = r0.f7180T
            com.google.android.material.textfield.b r3 = new com.google.android.material.textfield.b
            r3.<init>(r0)
            r4 = -1
            r2.append(r4, r3)
            android.util.SparseArray<com.google.android.material.textfield.e> r2 = r0.f7180T
            com.google.android.material.textfield.g r3 = new com.google.android.material.textfield.g
            r3.<init>(r0)
            r2.append(r9, r3)
            android.util.SparseArray<com.google.android.material.textfield.e> r2 = r0.f7180T
            com.google.android.material.textfield.h r3 = new com.google.android.material.textfield.h
            r3.<init>(r0)
            r2.append(r11, r3)
            android.util.SparseArray<com.google.android.material.textfield.e> r2 = r0.f7180T
            com.google.android.material.textfield.a r3 = new com.google.android.material.textfield.a
            r3.<init>(r0)
            r4 = 2
            r2.append(r4, r3)
            android.util.SparseArray<com.google.android.material.textfield.e> r2 = r0.f7180T
            com.google.android.material.textfield.d r3 = new com.google.android.material.textfield.d
            r3.<init>(r0)
            r4 = 3
            r2.append(r4, r3)
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_endIconMode
            boolean r2 = r1.mo1545g(r2)
            if (r2 == 0) goto L_0x046f
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_endIconMode
            int r2 = r1.mo1538d(r2, r9)
            r0.setEndIconMode(r2)
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_endIconDrawable
            boolean r2 = r1.mo1545g(r2)
            if (r2 == 0) goto L_0x0454
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_endIconDrawable
            android.graphics.drawable.Drawable r2 = r1.mo1535b(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
        L_0x0454:
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_endIconContentDescription
            boolean r2 = r1.mo1545g(r2)
            if (r2 == 0) goto L_0x0465
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_endIconContentDescription
            java.lang.CharSequence r2 = r1.mo1541e(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
        L_0x0465:
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_endIconCheckable
            boolean r2 = r1.mo1532a((int) r2, (boolean) r11)
            r0.setEndIconCheckable(r2)
            goto L_0x04b9
        L_0x046f:
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_passwordToggleEnabled
            boolean r2 = r1.mo1545g(r2)
            if (r2 == 0) goto L_0x04b9
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_passwordToggleEnabled
            boolean r2 = r1.mo1532a((int) r2, (boolean) r9)
            r0.setEndIconMode(r2)
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_passwordToggleDrawable
            android.graphics.drawable.Drawable r2 = r1.mo1535b(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_passwordToggleContentDescription
            java.lang.CharSequence r2 = r1.mo1541e(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_passwordToggleTint
            boolean r2 = r1.mo1545g(r2)
            if (r2 == 0) goto L_0x04a3
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_passwordToggleTint
            android.content.res.ColorStateList r2 = p054c.p083e.p084a.p085a.p099w.C1218c.m5862a((android.content.Context) r10, (androidx.appcompat.widget.C0217r0) r1, (int) r2)
            r0.setEndIconTintList(r2)
        L_0x04a3:
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_passwordToggleTintMode
            boolean r2 = r1.mo1545g(r2)
            if (r2 == 0) goto L_0x04b9
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_passwordToggleTintMode
            r3 = -1
            int r2 = r1.mo1538d(r2, r3)
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.C2673h.m10593a((int) r2, (android.graphics.PorterDuff.Mode) r7)
            r0.setEndIconTintMode(r2)
        L_0x04b9:
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_passwordToggleEnabled
            boolean r2 = r1.mo1545g(r2)
            if (r2 != 0) goto L_0x04e8
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_endIconTint
            boolean r2 = r1.mo1545g(r2)
            if (r2 == 0) goto L_0x04d2
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_endIconTint
            android.content.res.ColorStateList r2 = p054c.p083e.p084a.p085a.p099w.C1218c.m5862a((android.content.Context) r10, (androidx.appcompat.widget.C0217r0) r1, (int) r2)
            r0.setEndIconTintList(r2)
        L_0x04d2:
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_endIconTintMode
            boolean r2 = r1.mo1545g(r2)
            if (r2 == 0) goto L_0x04e8
            int r2 = p054c.p083e.p084a.p085a.C1178k.TextInputLayout_endIconTintMode
            r3 = -1
            int r2 = r1.mo1538d(r2, r3)
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.C2673h.m10593a((int) r2, (android.graphics.PorterDuff.Mode) r7)
            r0.setEndIconTintMode(r2)
        L_0x04e8:
            r1.mo1531a()
            r1 = 2
            p006b.p026g.p035k.C0890v.m4783h(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: A */
    private void m10695A() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f7205n;
        if (textView != null) {
            mo8638a(textView, this.f7203m ? this.f7207o : this.f7209p);
            if (!this.f7203m && (colorStateList2 = this.f7211q) != null) {
                this.f7205n.setTextColor(colorStateList2);
            }
            if (this.f7203m && (colorStateList = this.f7213r) != null) {
                this.f7205n.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: B */
    private boolean m10696B() {
        int max;
        if (this.f7193h == null || this.f7193h.getMeasuredHeight() >= (max = Math.max(this.f7181U.getMeasuredHeight(), this.f7171K.getMeasuredHeight()))) {
            return false;
        }
        this.f7193h.setMinimumHeight(max);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c9  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m10697C() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f7193h
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.m10732t()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0060
            boolean r0 = r10.mo8646d()
            if (r0 == 0) goto L_0x0060
            com.google.android.material.internal.CheckableImageButton r0 = r10.f7171K
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0060
            android.graphics.drawable.Drawable r0 = r10.f7176P
            if (r0 != 0) goto L_0x0048
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>()
            r10.f7176P = r0
            com.google.android.material.internal.CheckableImageButton r0 = r10.f7171K
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f7193h
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.f7171K
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = p006b.p026g.p035k.C0875g.m4688a(r6)
            int r0 = r0 + r6
            android.graphics.drawable.Drawable r6 = r10.f7176P
            r6.setBounds(r1, r1, r0, r5)
        L_0x0048:
            android.widget.EditText r0 = r10.f7193h
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C0348i.m1742a((android.widget.TextView) r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f7176P
            if (r6 == r7) goto L_0x0079
            android.widget.EditText r6 = r10.f7193h
            r8 = r0[r5]
            r9 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.C0348i.m1739a(r6, r7, r8, r9, r0)
            goto L_0x0077
        L_0x0060:
            android.graphics.drawable.Drawable r0 = r10.f7176P
            if (r0 == 0) goto L_0x0079
            android.widget.EditText r0 = r10.f7193h
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C0348i.m1742a((android.widget.TextView) r0)
            android.widget.EditText r6 = r10.f7193h
            r7 = r0[r5]
            r8 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.C0348i.m1739a(r6, r2, r7, r8, r0)
            r10.f7176P = r2
        L_0x0077:
            r0 = 1
            goto L_0x007a
        L_0x0079:
            r0 = 0
        L_0x007a:
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x00c9
            int r7 = r6.getMeasuredWidth()
            if (r7 <= 0) goto L_0x00c9
            android.graphics.drawable.Drawable r2 = r10.f7187d0
            if (r2 != 0) goto L_0x00ac
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>()
            r10.f7187d0 = r2
            int r2 = r6.getMeasuredWidth()
            android.widget.EditText r7 = r10.f7193h
            int r7 = r7.getPaddingRight()
            int r2 = r2 - r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = p006b.p026g.p035k.C0875g.m4689b(r6)
            int r2 = r2 + r6
            android.graphics.drawable.Drawable r6 = r10.f7187d0
            r6.setBounds(r1, r1, r2, r5)
        L_0x00ac:
            android.widget.EditText r2 = r10.f7193h
            android.graphics.drawable.Drawable[] r2 = androidx.core.widget.C0348i.m1742a((android.widget.TextView) r2)
            r6 = r2[r4]
            android.graphics.drawable.Drawable r7 = r10.f7187d0
            if (r6 == r7) goto L_0x00e9
            r0 = r2[r4]
            r10.f7188e0 = r0
            android.widget.EditText r0 = r10.f7193h
            r1 = r2[r1]
            r4 = r2[r5]
            r2 = r2[r3]
            androidx.core.widget.C0348i.m1739a(r0, r1, r4, r7, r2)
            r0 = 1
            goto L_0x00e9
        L_0x00c9:
            android.graphics.drawable.Drawable r6 = r10.f7187d0
            if (r6 == 0) goto L_0x00e9
            android.widget.EditText r6 = r10.f7193h
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.C0348i.m1742a((android.widget.TextView) r6)
            r4 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.f7187d0
            if (r4 != r7) goto L_0x00e7
            android.widget.EditText r0 = r10.f7193h
            r1 = r6[r1]
            r4 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f7188e0
            r3 = r6[r3]
            androidx.core.widget.C0348i.m1739a(r0, r1, r4, r7, r3)
            r0 = 1
        L_0x00e7:
            r10.f7187d0 = r2
        L_0x00e9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m10697C():boolean");
    }

    /* renamed from: D */
    private void m10698D() {
        if (this.f7226z != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f7189f.getLayoutParams();
            int m = m10725m();
            if (m != layoutParams.topMargin) {
                layoutParams.topMargin = m;
                this.f7189f.requestLayout();
            }
        }
    }

    /* renamed from: a */
    private int m10699a(Rect rect, float f) {
        return m10733u() ? (int) (((float) rect.centerY()) - (f / 2.0f)) : rect.top + this.f7193h.getCompoundPaddingTop();
    }

    /* renamed from: a */
    private int m10700a(Rect rect, Rect rect2, float f) {
        return this.f7226z == 1 ? (int) (((float) rect2.top) + f) : rect.bottom - this.f7193h.getCompoundPaddingBottom();
    }

    /* renamed from: a */
    private Rect m10701a(Rect rect) {
        int i;
        int i2;
        int i3;
        EditText editText = this.f7193h;
        if (editText != null) {
            Rect rect2 = this.f7168H;
            rect2.bottom = rect.bottom;
            int i4 = this.f7226z;
            if (i4 == 1) {
                rect2.left = rect.left + editText.getCompoundPaddingLeft();
                i = rect.top + this.f7161A;
            } else if (i4 != 2) {
                rect2.left = rect.left + editText.getCompoundPaddingLeft();
                i = getPaddingTop();
            } else {
                rect2.left = rect.left + editText.getPaddingLeft();
                rect2.top = rect.top - m10725m();
                i2 = rect.right;
                i3 = this.f7193h.getPaddingRight();
                rect2.right = i2 - i3;
                return rect2;
            }
            rect2.top = i;
            i2 = rect.right;
            i3 = this.f7193h.getCompoundPaddingRight();
            rect2.right = i2 - i3;
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    private static void m10702a(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? C1176i.character_counter_overflowed_content_description : C1176i.character_counter_content_description, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: a */
    private void m10703a(Canvas canvas) {
        C1233d dVar = this.f7223w;
        if (dVar != null) {
            Rect bounds = dVar.getBounds();
            bounds.top = bounds.bottom - this.f7162B;
            this.f7223w.draw(canvas);
        }
    }

    /* renamed from: a */
    private void m10704a(RectF rectF) {
        float f = rectF.left;
        int i = this.f7225y;
        rectF.left = f - ((float) i);
        rectF.top -= (float) i;
        rectF.right += (float) i;
        rectF.bottom += (float) i;
    }

    /* renamed from: a */
    private static void m10705a(View view, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        view.setOnClickListener(onClickListener);
        m10706a(view, onLongClickListener);
    }

    /* renamed from: a */
    private static void m10706a(View view, View.OnLongClickListener onLongClickListener) {
        boolean x = C0890v.m4800x(view);
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (x || z2) {
            z = true;
        }
        view.setFocusable(z);
        view.setClickable(x);
        view.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        C0890v.m4783h(view, i);
    }

    /* renamed from: a */
    private static void m10707a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m10707a((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: a */
    private void m10708a(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = C0328a.m1626i(drawable).mutate();
            if (z) {
                C0328a.m1611a(drawable, colorStateList);
            }
            if (z2) {
                C0328a.m1614a(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: a */
    private void m10709a(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C2661a aVar;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f7193h;
        boolean z3 = true;
        boolean z4 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f7193h;
        if (editText2 == null || !editText2.hasFocus()) {
            z3 = false;
        }
        boolean c = this.f7197j.mo8799c();
        ColorStateList colorStateList2 = this.f7194h0;
        if (colorStateList2 != null) {
            this.f7214r0.mo8505a(colorStateList2);
            this.f7214r0.mo8517b(this.f7194h0);
        }
        if (!isEnabled) {
            this.f7214r0.mo8505a(ColorStateList.valueOf(this.f7210p0));
            this.f7214r0.mo8517b(ColorStateList.valueOf(this.f7210p0));
        } else if (c) {
            this.f7214r0.mo8505a(this.f7197j.mo8802f());
        } else {
            if (this.f7203m && (textView = this.f7205n) != null) {
                aVar = this.f7214r0;
                colorStateList = textView.getTextColors();
            } else if (z3 && (colorStateList = this.f7196i0) != null) {
                aVar = this.f7214r0;
            }
            aVar.mo8505a(colorStateList);
        }
        if (z4 || (isEnabled() && (z3 || c))) {
            if (z2 || this.f7212q0) {
                m10715b(z);
            }
        } else if (z2 || !this.f7212q0) {
            m10717c(z);
        }
    }

    /* renamed from: b */
    private Rect m10711b(Rect rect) {
        if (this.f7193h != null) {
            Rect rect2 = this.f7168H;
            float e = this.f7214r0.mo8523e();
            rect2.left = rect.left + this.f7193h.getCompoundPaddingLeft();
            rect2.top = m10699a(rect, e);
            rect2.right = rect.right - this.f7193h.getCompoundPaddingRight();
            rect2.bottom = m10700a(rect, rect2, e);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    private void m10712b(int i) {
        Iterator it = this.f7182V.iterator();
        while (it.hasNext()) {
            ((C2714f) it.next()).mo8757a(this, i);
        }
    }

    /* renamed from: b */
    private void m10713b(Canvas canvas) {
        if (this.f7215s) {
            this.f7214r0.mo8506a(canvas);
        }
    }

    /* renamed from: b */
    private static void m10714b(View view, View.OnLongClickListener onLongClickListener) {
        view.setOnLongClickListener(onLongClickListener);
        m10706a(view, onLongClickListener);
    }

    /* renamed from: b */
    private void m10715b(boolean z) {
        ValueAnimator valueAnimator = this.f7218t0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f7218t0.cancel();
        }
        if (!z || !this.f7216s0) {
            this.f7214r0.mo8513b(1.0f);
        } else {
            mo8636a(1.0f);
        }
        this.f7212q0 = false;
        if (m10729q()) {
            m10735w();
        }
    }

    /* renamed from: c */
    private void m10716c(Rect rect) {
        C1233d dVar = this.f7223w;
        if (dVar != null) {
            int i = rect.bottom;
            dVar.setBounds(rect.left, i - this.f7164D, rect.right, i);
        }
    }

    /* renamed from: c */
    private void m10717c(boolean z) {
        ValueAnimator valueAnimator = this.f7218t0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f7218t0.cancel();
        }
        if (!z || !this.f7216s0) {
            this.f7214r0.mo8513b(0.0f);
        } else {
            mo8636a(0.0f);
        }
        if (m10729q() && ((C2726c) this.f7221v).mo8180n()) {
            m10728p();
        }
        this.f7212q0 = true;
    }

    /* renamed from: d */
    private void m10718d(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            m10721i();
            return;
        }
        Drawable mutate = C0328a.m1626i(getEndIconDrawable()).mutate();
        C0328a.m1619b(mutate, this.f7197j.mo8801e());
        this.f7181U.setImageDrawable(mutate);
    }

    /* renamed from: g */
    private void m10719g() {
        C1233d dVar = this.f7221v;
        if (dVar != null) {
            dVar.setShapeAppearanceModel(this.f7224x);
            if (m10726n()) {
                this.f7221v.mo5487a((float) this.f7162B, this.f7165E);
            }
            this.f7166F = m10724l();
            this.f7221v.mo5492a(ColorStateList.valueOf(this.f7166F));
            if (this.f7179S == 3) {
                this.f7193h.getBackground().invalidateSelf();
            }
            m10720h();
            invalidate();
        }
    }

    private C2738e getEndIconDelegate() {
        C2738e eVar = this.f7180T.get(this.f7179S);
        return eVar != null ? eVar : this.f7180T.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f7190f0.getVisibility() == 0) {
            return this.f7190f0;
        }
        if (!m10731s() || !mo8642a()) {
            return null;
        }
        return this.f7181U;
    }

    /* renamed from: h */
    private void m10720h() {
        if (this.f7223w != null) {
            if (m10727o()) {
                this.f7223w.mo5492a(ColorStateList.valueOf(this.f7165E));
            }
            invalidate();
        }
    }

    /* renamed from: i */
    private void m10721i() {
        m10708a(this.f7181U, this.f7184a0, this.f7183W, this.f7186c0, this.f7185b0);
    }

    /* renamed from: j */
    private void m10722j() {
        m10708a(this.f7171K, this.f7173M, this.f7172L, this.f7175O, this.f7174N);
    }

    /* renamed from: k */
    private void m10723k() {
        int i = this.f7226z;
        if (i == 0) {
            this.f7221v = null;
        } else if (i == 1) {
            this.f7221v = new C1233d(this.f7224x);
            this.f7223w = new C1233d();
            return;
        } else if (i == 2) {
            this.f7221v = (!this.f7215s || (this.f7221v instanceof C2726c)) ? new C1233d(this.f7224x) : new C2726c(this.f7224x);
        } else {
            throw new IllegalArgumentException(this.f7226z + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
        this.f7223w = null;
    }

    /* renamed from: l */
    private int m10724l() {
        return this.f7226z == 1 ? C1207a.m5824a(C1207a.m5829a((View) this, C1169b.colorSurface, 0), this.f7166F) : this.f7166F;
    }

    /* renamed from: m */
    private int m10725m() {
        float c;
        if (!this.f7215s) {
            return 0;
        }
        int i = this.f7226z;
        if (i == 0 || i == 1) {
            c = this.f7214r0.mo8520c();
        } else if (i != 2) {
            return 0;
        } else {
            c = this.f7214r0.mo8520c() / 2.0f;
        }
        return (int) c;
    }

    /* renamed from: n */
    private boolean m10726n() {
        return this.f7226z == 2 && m10727o();
    }

    /* renamed from: o */
    private boolean m10727o() {
        return this.f7162B > -1 && this.f7165E != 0;
    }

    /* renamed from: p */
    private void m10728p() {
        if (m10729q()) {
            ((C2726c) this.f7221v).mo8183o();
        }
    }

    /* renamed from: q */
    private boolean m10729q() {
        return this.f7215s && !TextUtils.isEmpty(this.f7217t) && (this.f7221v instanceof C2726c);
    }

    /* renamed from: r */
    private void m10730r() {
        Iterator it = this.f7178R.iterator();
        while (it.hasNext()) {
            ((C2713e) it.next()).mo8756a(this);
        }
    }

    /* renamed from: s */
    private boolean m10731s() {
        return this.f7179S != 0;
    }

    private void setEditText(EditText editText) {
        if (this.f7193h == null) {
            if (this.f7179S != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f7193h = editText;
            m10734v();
            setTextInputAccessibilityDelegate(new C2712d(this));
            this.f7214r0.mo8519b(this.f7193h.getTypeface());
            this.f7214r0.mo8501a(this.f7193h.getTextSize());
            int gravity = this.f7193h.getGravity();
            this.f7214r0.mo8514b((gravity & -113) | 48);
            this.f7214r0.mo8521c(gravity);
            this.f7193h.addTextChangedListener(new C2709a());
            if (this.f7194h0 == null) {
                this.f7194h0 = this.f7193h.getHintTextColors();
            }
            if (this.f7215s) {
                if (TextUtils.isEmpty(this.f7217t)) {
                    this.f7195i = this.f7193h.getHint();
                    setHint(this.f7195i);
                    this.f7193h.setHint((CharSequence) null);
                }
                this.f7219u = true;
            }
            if (this.f7205n != null) {
                mo8637a(this.f7193h.getText().length());
            }
            mo8651e();
            this.f7197j.mo8785a();
            this.f7171K.bringToFront();
            this.f7191g.bringToFront();
            this.f7190f0.bringToFront();
            m10730r();
            m10709a(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        int i = 0;
        this.f7190f0.setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = this.f7191g;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        if (!m10731s()) {
            m10697C();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f7217t)) {
            this.f7217t = charSequence;
            this.f7214r0.mo8510a(charSequence);
            if (!this.f7212q0) {
                m10735w();
            }
        }
    }

    /* renamed from: t */
    private boolean m10732t() {
        return getStartIconDrawable() != null;
    }

    /* renamed from: u */
    private boolean m10733u() {
        return this.f7226z == 1 && (Build.VERSION.SDK_INT < 16 || this.f7193h.getMinLines() <= 1);
    }

    /* renamed from: v */
    private void m10734v() {
        m10723k();
        m10736x();
        mo8652f();
        if (this.f7226z != 0) {
            m10698D();
        }
    }

    /* renamed from: w */
    private void m10735w() {
        if (m10729q()) {
            RectF rectF = this.f7169I;
            this.f7214r0.mo8508a(rectF);
            m10704a(rectF);
            rectF.offset((float) (-getPaddingLeft()), 0.0f);
            ((C2726c) this.f7221v).mo8772a(rectF);
        }
    }

    /* renamed from: x */
    private void m10736x() {
        if (m10737y()) {
            C0890v.m4751a((View) this.f7193h, (Drawable) this.f7221v);
        }
    }

    /* renamed from: y */
    private boolean m10737y() {
        EditText editText = this.f7193h;
        return (editText == null || this.f7221v == null || editText.getBackground() != null || this.f7226z == 0) ? false : true;
    }

    /* renamed from: z */
    private void m10738z() {
        if (this.f7205n != null) {
            EditText editText = this.f7193h;
            mo8637a(editText == null ? 0 : editText.getText().length());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8636a(float f) {
        if (this.f7214r0.mo8524f() != f) {
            if (this.f7218t0 == null) {
                this.f7218t0 = new ValueAnimator();
                this.f7218t0.setInterpolator(C1179a.f3915b);
                this.f7218t0.setDuration(167);
                this.f7218t0.addUpdateListener(new C2711c());
            }
            this.f7218t0.setFloatValues(new float[]{this.f7214r0.mo8524f(), f});
            this.f7218t0.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8637a(int i) {
        boolean z = this.f7203m;
        if (this.f7201l == -1) {
            this.f7205n.setText(String.valueOf(i));
            this.f7205n.setContentDescription((CharSequence) null);
            this.f7203m = false;
        } else {
            if (C0890v.m4773d(this.f7205n) == 1) {
                C0890v.m4781g(this.f7205n, 0);
            }
            this.f7203m = i > this.f7201l;
            m10702a(getContext(), this.f7205n, i, this.f7201l, this.f7203m);
            if (z != this.f7203m) {
                m10695A();
                if (this.f7203m) {
                    C0890v.m4781g(this.f7205n, 1);
                }
            }
            this.f7205n.setText(getContext().getString(C1176i.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f7201l)}));
        }
        if (this.f7193h != null && z != this.f7203m) {
            mo8641a(false);
            mo8652f();
            mo8651e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8638a(TextView textView, int i) {
        boolean z = true;
        try {
            C0348i.m1748d(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C0348i.m1748d(textView, C1177j.TextAppearance_AppCompat_Caption);
            textView.setTextColor(C0311a.m1528a(getContext(), C1170c.design_error));
        }
    }

    /* renamed from: a */
    public void mo8639a(C2713e eVar) {
        this.f7178R.add(eVar);
        if (this.f7193h != null) {
            eVar.mo8756a(this);
        }
    }

    /* renamed from: a */
    public void mo8640a(C2714f fVar) {
        this.f7182V.add(fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8641a(boolean z) {
        m10709a(z, false);
    }

    /* renamed from: a */
    public boolean mo8642a() {
        return this.f7191g.getVisibility() == 0 && this.f7181U.getVisibility() == 0;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f7189f.addView(view, layoutParams2);
            this.f7189f.setLayoutParams(layoutParams);
            m10698D();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public boolean mo8644b() {
        return this.f7197j.mo8808l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo8645c() {
        return this.f7219u;
    }

    /* renamed from: d */
    public boolean mo8646d() {
        return this.f7171K.getVisibility() == 0;
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.f7195i == null || (editText = this.f7193h) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.f7219u;
        this.f7219u = false;
        CharSequence hint = editText.getHint();
        this.f7193h.setHint(this.f7195i);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f7193h.setHint(hint);
            this.f7219u = z;
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f7222v0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f7222v0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        m10713b(canvas);
        m10703a(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.f7220u0) {
            boolean z = true;
            this.f7220u0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            C2661a aVar = this.f7214r0;
            boolean a = aVar != null ? aVar.mo8511a(drawableState) | false : false;
            if (!C0890v.m4732C(this) || !isEnabled()) {
                z = false;
            }
            mo8641a(z);
            mo8651e();
            mo8652f();
            if (a) {
                invalidate();
            }
            this.f7220u0 = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo8651e() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f7193h;
        if (editText != null && this.f7226z == 0 && (background = editText.getBackground()) != null) {
            if (C0249z.m1266a(background)) {
                background = background.mutate();
            }
            if (this.f7197j.mo8799c()) {
                currentTextColor = this.f7197j.mo8801e();
            } else if (!this.f7203m || (textView = this.f7205n) == null) {
                C0328a.m1618b(background);
                this.f7193h.refreshDrawableState();
                return;
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            background.setColorFilter(C0192i.m961a(currentTextColor, PorterDuff.Mode.SRC_IN));
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r5.f7193h;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8652f() {
        /*
            r5 = this;
            c.e.a.a.z.d r0 = r5.f7221v
            if (r0 == 0) goto L_0x00bd
            int r0 = r5.f7226z
            if (r0 != 0) goto L_0x000a
            goto L_0x00bd
        L_0x000a:
            boolean r0 = r5.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r5.f7193h
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r5.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r5.f7193h
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            boolean r4 = r5.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r5.f7210p0
        L_0x003c:
            r5.f7165E = r4
            goto L_0x0068
        L_0x003f:
            com.google.android.material.textfield.f r4 = r5.f7197j
            boolean r4 = r4.mo8799c()
            if (r4 == 0) goto L_0x004e
            com.google.android.material.textfield.f r4 = r5.f7197j
            int r4 = r4.mo8801e()
            goto L_0x003c
        L_0x004e:
            boolean r4 = r5.f7203m
            if (r4 == 0) goto L_0x005b
            android.widget.TextView r4 = r5.f7205n
            if (r4 == 0) goto L_0x005b
            int r4 = r4.getCurrentTextColor()
            goto L_0x003c
        L_0x005b:
            if (r0 == 0) goto L_0x0060
            int r4 = r5.f7202l0
            goto L_0x003c
        L_0x0060:
            if (r3 == 0) goto L_0x0065
            int r4 = r5.f7200k0
            goto L_0x003c
        L_0x0065:
            int r4 = r5.f7198j0
            goto L_0x003c
        L_0x0068:
            com.google.android.material.textfield.f r4 = r5.f7197j
            boolean r4 = r4.mo8799c()
            if (r4 == 0) goto L_0x007c
            com.google.android.material.textfield.e r4 = r5.getEndIconDelegate()
            boolean r4 = r4.mo8774b()
            if (r4 == 0) goto L_0x007c
            r4 = 1
            goto L_0x007d
        L_0x007c:
            r4 = 0
        L_0x007d:
            r5.m10718d(r4)
            android.graphics.drawable.Drawable r4 = r5.getErrorIconDrawable()
            if (r4 == 0) goto L_0x008f
            com.google.android.material.textfield.f r4 = r5.f7197j
            boolean r4 = r4.mo8799c()
            if (r4 == 0) goto L_0x008f
            r1 = 1
        L_0x008f:
            r5.setErrorIconVisible(r1)
            if (r3 != 0) goto L_0x0096
            if (r0 == 0) goto L_0x009f
        L_0x0096:
            boolean r0 = r5.isEnabled()
            if (r0 == 0) goto L_0x009f
            int r0 = r5.f7164D
            goto L_0x00a1
        L_0x009f:
            int r0 = r5.f7163C
        L_0x00a1:
            r5.f7162B = r0
            int r0 = r5.f7226z
            if (r0 != r2) goto L_0x00ba
            boolean r0 = r5.isEnabled()
            if (r0 != 0) goto L_0x00b2
            int r0 = r5.f7206n0
        L_0x00af:
            r5.f7166F = r0
            goto L_0x00ba
        L_0x00b2:
            if (r3 == 0) goto L_0x00b7
            int r0 = r5.f7208o0
            goto L_0x00af
        L_0x00b7:
            int r0 = r5.f7204m0
            goto L_0x00af
        L_0x00ba:
            r5.m10719g()
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo8652f():void");
    }

    public int getBaseline() {
        EditText editText = this.f7193h;
        return editText != null ? editText.getBaseline() + getPaddingTop() + m10725m() : super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public C1233d getBoxBackground() {
        int i = this.f7226z;
        if (i == 1 || i == 2) {
            return this.f7221v;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f7166F;
    }

    public int getBoxBackgroundMode() {
        return this.f7226z;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f7224x.mo5532b().mo5482a();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f7224x.mo5534c().mo5482a();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f7224x.mo5539h().mo5482a();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f7224x.mo5538g().mo5482a();
    }

    public int getBoxStrokeColor() {
        return this.f7202l0;
    }

    public int getCounterMaxLength() {
        return this.f7201l;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f7199k || !this.f7203m || (textView = this.f7205n) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f7211q;
    }

    public ColorStateList getCounterTextColor() {
        return this.f7211q;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f7194h0;
    }

    public EditText getEditText() {
        return this.f7193h;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f7181U.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f7181U.getDrawable();
    }

    public int getEndIconMode() {
        return this.f7179S;
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f7181U;
    }

    public CharSequence getError() {
        if (this.f7197j.mo8807k()) {
            return this.f7197j.mo8800d();
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        return this.f7197j.mo8801e();
    }

    public Drawable getErrorIconDrawable() {
        return this.f7190f0.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public final int getErrorTextCurrentColor() {
        return this.f7197j.mo8801e();
    }

    public CharSequence getHelperText() {
        if (this.f7197j.mo8808l()) {
            return this.f7197j.mo8803g();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f7197j.mo8804h();
    }

    public CharSequence getHint() {
        if (this.f7215s) {
            return this.f7217t;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.f7214r0.mo8520c();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f7214r0.mo8522d();
    }

    public ColorStateList getHintTextColor() {
        return this.f7196i0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f7181U.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f7181U.getDrawable();
    }

    public CharSequence getStartIconContentDescription() {
        return this.f7171K.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f7171K.getDrawable();
    }

    public Typeface getTypeface() {
        return this.f7170J;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f7193h;
        if (editText != null) {
            Rect rect = this.f7167G;
            C2663b.m10555a((ViewGroup) this, (View) editText, rect);
            m10716c(rect);
            if (this.f7215s) {
                this.f7214r0.mo8507a(m10701a(rect));
                this.f7214r0.mo8518b(m10711b(rect));
                this.f7214r0.mo8527i();
                if (m10729q() && !this.f7212q0) {
                    m10735w();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean B = m10696B();
        boolean C = m10697C();
        if (B || C) {
            this.f7193h.post(new C2710b());
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2715g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2715g gVar = (C2715g) parcelable;
        super.onRestoreInstanceState(gVar.mo4725q());
        setError(gVar.f7231h);
        if (gVar.f7232i) {
            this.f7181U.performClick();
            this.f7181U.jumpDrawablesToCurrentState();
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C2715g gVar = new C2715g(super.onSaveInstanceState());
        if (this.f7197j.mo8799c()) {
            gVar.f7231h = getError();
        }
        gVar.f7232i = m10731s() && this.f7181U.isChecked();
        return gVar;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f7166F != i) {
            this.f7166F = i;
            this.f7204m0 = i;
            m10719g();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C0311a.m1528a(getContext(), i));
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f7226z) {
            this.f7226z = i;
            if (this.f7193h != null) {
                m10734v();
            }
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f7202l0 != i) {
            this.f7202l0 = i;
            mo8652f();
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.f7199k != z) {
            if (z) {
                this.f7205n = new AppCompatTextView(getContext());
                this.f7205n.setId(C1173f.textinput_counter);
                Typeface typeface = this.f7170J;
                if (typeface != null) {
                    this.f7205n.setTypeface(typeface);
                }
                this.f7205n.setMaxLines(1);
                this.f7197j.mo8788a(this.f7205n, 2);
                m10695A();
                m10738z();
            } else {
                this.f7197j.mo8795b(this.f7205n, 2);
                this.f7205n = null;
            }
            this.f7199k = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f7201l != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f7201l = i;
            if (this.f7199k) {
                m10738z();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f7207o != i) {
            this.f7207o = i;
            m10695A();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f7213r != colorStateList) {
            this.f7213r = colorStateList;
            m10695A();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f7209p != i) {
            this.f7209p = i;
            m10695A();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f7211q != colorStateList) {
            this.f7211q = colorStateList;
            m10695A();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f7194h0 = colorStateList;
        this.f7196i0 = colorStateList;
        if (this.f7193h != null) {
            mo8641a(false);
        }
    }

    public void setEnabled(boolean z) {
        m10707a((ViewGroup) this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f7181U.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f7181U.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f7181U.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C0664a.m3682c(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f7181U.setImageDrawable(drawable);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f7179S;
        this.f7179S = i;
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo8773a(this.f7226z)) {
            getEndIconDelegate().mo8762a();
            m10721i();
            m10712b(i2);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f7226z + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m10705a((View) this.f7181U, onClickListener, this.f7192g0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f7192g0 = onLongClickListener;
        m10714b(this.f7181U, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f7183W != colorStateList) {
            this.f7183W = colorStateList;
            this.f7184a0 = true;
            m10721i();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f7185b0 != mode) {
            this.f7185b0 = mode;
            this.f7186c0 = true;
            m10721i();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (mo8642a() != z) {
            this.f7181U.setVisibility(z ? 0 : 4);
            m10697C();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f7197j.mo8807k()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f7197j.mo8789a(charSequence);
        } else {
            this.f7197j.mo8805i();
        }
    }

    public void setErrorEnabled(boolean z) {
        this.f7197j.mo8790a(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C0664a.m3682c(getContext(), i) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f7190f0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f7190f0.getDrawable();
        if (drawable != null) {
            drawable = C0328a.m1626i(drawable).mutate();
            C0328a.m1611a(drawable, colorStateList);
        }
        if (this.f7190f0.getDrawable() != drawable) {
            this.f7190f0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f7190f0.getDrawable();
        if (drawable != null) {
            drawable = C0328a.m1626i(drawable).mutate();
            C0328a.m1614a(drawable, mode);
        }
        if (this.f7190f0.getDrawable() != drawable) {
            this.f7190f0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.f7197j.mo8793b(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f7197j.mo8786a(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!mo8644b()) {
                setHelperTextEnabled(true);
            }
            this.f7197j.mo8796b(charSequence);
        } else if (mo8644b()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f7197j.mo8794b(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f7197j.mo8797b(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f7197j.mo8798c(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f7215s) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(PropertyFlags.INDEX_HASH);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f7216s0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f7215s) {
            this.f7215s = z;
            if (!this.f7215s) {
                this.f7219u = false;
                if (!TextUtils.isEmpty(this.f7217t) && TextUtils.isEmpty(this.f7193h.getHint())) {
                    this.f7193h.setHint(this.f7217t);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f7193h.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f7217t)) {
                        setHint(hint);
                    }
                    this.f7193h.setHint((CharSequence) null);
                }
                this.f7219u = true;
            }
            if (this.f7193h != null) {
                m10698D();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f7214r0.mo8502a(i);
        this.f7196i0 = this.f7214r0.mo8512b();
        if (this.f7193h != null) {
            mo8641a(false);
            m10698D();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f7196i0 != colorStateList) {
            if (this.f7194h0 == null) {
                this.f7214r0.mo8505a(colorStateList);
            }
            this.f7196i0 = colorStateList;
            if (this.f7193h != null) {
                mo8641a(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f7181U.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C0664a.m3682c(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f7181U.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f7179S != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f7183W = colorStateList;
        this.f7184a0 = true;
        m10721i();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f7185b0 = mode;
        this.f7186c0 = true;
        m10721i();
    }

    public void setStartIconCheckable(boolean z) {
        this.f7171K.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f7171K.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C0664a.m3682c(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f7171K.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            m10722j();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        m10705a((View) this.f7171K, onClickListener, this.f7177Q);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f7177Q = onLongClickListener;
        m10714b(this.f7171K, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f7172L != colorStateList) {
            this.f7172L = colorStateList;
            this.f7173M = true;
            m10722j();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f7174N != mode) {
            this.f7174N = mode;
            this.f7175O = true;
            m10722j();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (mo8646d() != z) {
            this.f7171K.setVisibility(z ? 0 : 8);
            m10697C();
        }
    }

    public void setTextInputAccessibilityDelegate(C2712d dVar) {
        EditText editText = this.f7193h;
        if (editText != null) {
            C0890v.m4752a((View) editText, (C0838a) dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f7170J) {
            this.f7170J = typeface;
            this.f7214r0.mo8519b(typeface);
            this.f7197j.mo8787a(typeface);
            TextView textView = this.f7205n;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }
}
