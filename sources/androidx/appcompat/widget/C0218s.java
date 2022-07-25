package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.C0031c;
import androidx.appcompat.view.menu.C0102q;
import p006b.p007a.C0654a;
import p006b.p007a.p008k.p009a.C0664a;
import p006b.p026g.p035k.C0889u;
import p006b.p026g.p035k.C0890v;

/* renamed from: androidx.appcompat.widget.s */
public class C0218s extends Spinner implements C0889u {

    /* renamed from: n */
    private static final int[] f1067n = {16843505};

    /* renamed from: f */
    private final C0170e f1068f;

    /* renamed from: g */
    private final Context f1069g;

    /* renamed from: h */
    private C0164c0 f1070h;

    /* renamed from: i */
    private SpinnerAdapter f1071i;

    /* renamed from: j */
    private final boolean f1072j;

    /* renamed from: k */
    private C0229g f1073k;

    /* renamed from: l */
    int f1074l;

    /* renamed from: m */
    final Rect f1075m;

    /* renamed from: androidx.appcompat.widget.s$a */
    class C0219a extends C0164c0 {

        /* renamed from: o */
        final /* synthetic */ C0223e f1076o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0219a(View view, C0223e eVar) {
            super(view);
            this.f1076o = eVar;
        }

        /* renamed from: a */
        public C0102q mo308a() {
            return this.f1076o;
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public boolean mo309b() {
            if (C0218s.this.getInternalPopup().mo1581c()) {
                return true;
            }
            C0218s.this.mo1547a();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.s$b */
    class C0220b implements ViewTreeObserver.OnGlobalLayoutListener {
        C0220b() {
        }

        public void onGlobalLayout() {
            if (!C0218s.this.getInternalPopup().mo1581c()) {
                C0218s.this.mo1547a();
            }
            ViewTreeObserver viewTreeObserver = C0218s.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.s$c */
    class C0221c implements C0229g, DialogInterface.OnClickListener {

        /* renamed from: f */
        C0031c f1079f;

        /* renamed from: g */
        private ListAdapter f1080g;

        /* renamed from: h */
        private CharSequence f1081h;

        C0221c() {
        }

        /* renamed from: a */
        public void mo1573a(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: a */
        public void mo1574a(int i, int i2) {
            if (this.f1080g != null) {
                C0031c.C0032a aVar = new C0031c.C0032a(C0218s.this.getPopupContext());
                CharSequence charSequence = this.f1081h;
                if (charSequence != null) {
                    aVar.mo105a(charSequence);
                }
                aVar.mo103a(this.f1080g, C0218s.this.getSelectedItemPosition(), this);
                this.f1079f = aVar.mo106a();
                ListView b = this.f1079f.mo95b();
                if (Build.VERSION.SDK_INT >= 17) {
                    b.setTextDirection(i);
                    b.setTextAlignment(i2);
                }
                this.f1079f.show();
            }
        }

        /* renamed from: a */
        public void mo1575a(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        /* renamed from: a */
        public void mo1576a(ListAdapter listAdapter) {
            this.f1080g = listAdapter;
        }

        /* renamed from: a */
        public void mo1577a(CharSequence charSequence) {
            this.f1081h = charSequence;
        }

        /* renamed from: b */
        public int mo1578b() {
            return 0;
        }

        /* renamed from: b */
        public void mo1579b(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: c */
        public void mo1580c(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: c */
        public boolean mo1581c() {
            C0031c cVar = this.f1079f;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        /* renamed from: d */
        public int mo1582d() {
            return 0;
        }

        public void dismiss() {
            C0031c cVar = this.f1079f;
            if (cVar != null) {
                cVar.dismiss();
                this.f1079f = null;
            }
        }

        /* renamed from: e */
        public Drawable mo1584e() {
            return null;
        }

        /* renamed from: f */
        public CharSequence mo1585f() {
            return this.f1081h;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C0218s.this.setSelection(i);
            if (C0218s.this.getOnItemClickListener() != null) {
                C0218s.this.performItemClick((View) null, i, this.f1080g.getItemId(i));
            }
            dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.s$d */
    private static class C0222d implements ListAdapter, SpinnerAdapter {

        /* renamed from: f */
        private SpinnerAdapter f1083f;

        /* renamed from: g */
        private ListAdapter f1084g;

        public C0222d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1083f = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1084g = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof C0209n0) {
                C0209n0 n0Var = (C0209n0) spinnerAdapter;
                if (n0Var.getDropDownViewTheme() == null) {
                    n0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1084g;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1083f;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1083f;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1083f;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1083f;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1083f;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1084g;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1083f;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1083f;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.s$e */
    class C0223e extends C0171e0 implements C0229g {

        /* renamed from: N */
        private CharSequence f1085N;

        /* renamed from: O */
        ListAdapter f1086O;

        /* renamed from: P */
        private final Rect f1087P = new Rect();

        /* renamed from: Q */
        private int f1088Q;

        /* renamed from: androidx.appcompat.widget.s$e$a */
        class C0224a implements AdapterView.OnItemClickListener {
            C0224a(C0218s sVar) {
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0218s.this.setSelection(i);
                if (C0218s.this.getOnItemClickListener() != null) {
                    C0223e eVar = C0223e.this;
                    C0218s.this.performItemClick(view, i, eVar.f1086O.getItemId(i));
                }
                C0223e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.s$e$b */
        class C0225b implements ViewTreeObserver.OnGlobalLayoutListener {
            C0225b() {
            }

            public void onGlobalLayout() {
                C0223e eVar = C0223e.this;
                if (!eVar.mo1600b(C0218s.this)) {
                    C0223e.this.dismiss();
                    return;
                }
                C0223e.this.mo1601m();
                C0223e.super.mo403a();
            }
        }

        /* renamed from: androidx.appcompat.widget.s$e$c */
        class C0226c implements PopupWindow.OnDismissListener {

            /* renamed from: f */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1092f;

            C0226c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1092f = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0218s.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1092f);
                }
            }
        }

        public C0223e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo1300a((View) C0218s.this);
            mo1304a(true);
            mo1315h(0);
            mo1301a((AdapterView.OnItemClickListener) new C0224a(C0218s.this));
        }

        /* renamed from: a */
        public void mo1574a(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean c = mo413c();
            mo1601m();
            mo1313g(2);
            super.mo403a();
            ListView g = mo416g();
            g.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                g.setTextDirection(i);
                g.setTextAlignment(i2);
            }
            mo1317i(C0218s.this.getSelectedItemPosition());
            if (!c && (viewTreeObserver = C0218s.this.getViewTreeObserver()) != null) {
                C0225b bVar = new C0225b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                mo1303a((PopupWindow.OnDismissListener) new C0226c(bVar));
            }
        }

        /* renamed from: a */
        public void mo1302a(ListAdapter listAdapter) {
            super.mo1302a(listAdapter);
            this.f1086O = listAdapter;
        }

        /* renamed from: a */
        public void mo1577a(CharSequence charSequence) {
            this.f1085N = charSequence;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo1600b(View view) {
            return C0890v.m4731B(view) && view.getGlobalVisibleRect(this.f1087P);
        }

        /* renamed from: c */
        public void mo1580c(int i) {
            this.f1088Q = i;
        }

        /* renamed from: f */
        public CharSequence mo1585f() {
            return this.f1085N;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1601m() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.mo1310e()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                androidx.appcompat.widget.s r1 = androidx.appcompat.widget.C0218s.this
                android.graphics.Rect r1 = r1.f1075m
                r0.getPadding(r1)
                androidx.appcompat.widget.s r0 = androidx.appcompat.widget.C0218s.this
                boolean r0 = androidx.appcompat.widget.C0246x0.m1240a(r0)
                if (r0 == 0) goto L_0x001d
                androidx.appcompat.widget.s r0 = androidx.appcompat.widget.C0218s.this
                android.graphics.Rect r0 = r0.f1075m
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                androidx.appcompat.widget.s r0 = androidx.appcompat.widget.C0218s.this
                android.graphics.Rect r0 = r0.f1075m
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                androidx.appcompat.widget.s r0 = androidx.appcompat.widget.C0218s.this
                android.graphics.Rect r0 = r0.f1075m
                r0.right = r1
                r0.left = r1
            L_0x002e:
                androidx.appcompat.widget.s r0 = androidx.appcompat.widget.C0218s.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.s r2 = androidx.appcompat.widget.C0218s.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.s r3 = androidx.appcompat.widget.C0218s.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.s r4 = androidx.appcompat.widget.C0218s.this
                int r5 = r4.f1074l
                r6 = -2
                if (r5 != r6) goto L_0x0078
                android.widget.ListAdapter r5 = r8.f1086O
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.mo1310e()
                int r4 = r4.mo1546a(r5, r6)
                androidx.appcompat.widget.s r5 = androidx.appcompat.widget.C0218s.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.s r6 = androidx.appcompat.widget.C0218s.this
                android.graphics.Rect r6 = r6.f1075m
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x007e
            L_0x0078:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r0
                int r4 = r4 - r2
            L_0x007e:
                r8.mo1311e(r4)
                goto L_0x0085
            L_0x0082:
                r8.mo1311e(r5)
            L_0x0085:
                androidx.appcompat.widget.s r4 = androidx.appcompat.widget.C0218s.this
                boolean r4 = androidx.appcompat.widget.C0246x0.m1240a(r4)
                if (r4 == 0) goto L_0x009a
                int r3 = r3 - r2
                int r0 = r8.mo1318j()
                int r3 = r3 - r0
                int r0 = r8.mo1602n()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto L_0x00a0
            L_0x009a:
                int r2 = r8.mo1602n()
                int r0 = r0 + r2
                int r1 = r1 + r0
            L_0x00a0:
                r8.mo1297a((int) r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0218s.C0223e.mo1601m():void");
        }

        /* renamed from: n */
        public int mo1602n() {
            return this.f1088Q;
        }
    }

    /* renamed from: androidx.appcompat.widget.s$f */
    static class C0227f extends View.BaseSavedState {
        public static final Parcelable.Creator<C0227f> CREATOR = new C0228a();

        /* renamed from: f */
        boolean f1094f;

        /* renamed from: androidx.appcompat.widget.s$f$a */
        static class C0228a implements Parcelable.Creator<C0227f> {
            C0228a() {
            }

            public C0227f createFromParcel(Parcel parcel) {
                return new C0227f(parcel);
            }

            public C0227f[] newArray(int i) {
                return new C0227f[i];
            }
        }

        C0227f(Parcel parcel) {
            super(parcel);
            this.f1094f = parcel.readByte() != 0;
        }

        C0227f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1094f ? (byte) 1 : 0);
        }
    }

    /* renamed from: androidx.appcompat.widget.s$g */
    interface C0229g {
        /* renamed from: a */
        void mo1573a(int i);

        /* renamed from: a */
        void mo1574a(int i, int i2);

        /* renamed from: a */
        void mo1575a(Drawable drawable);

        /* renamed from: a */
        void mo1576a(ListAdapter listAdapter);

        /* renamed from: a */
        void mo1577a(CharSequence charSequence);

        /* renamed from: b */
        int mo1578b();

        /* renamed from: b */
        void mo1579b(int i);

        /* renamed from: c */
        void mo1580c(int i);

        /* renamed from: c */
        boolean mo1581c();

        /* renamed from: d */
        int mo1582d();

        void dismiss();

        /* renamed from: e */
        Drawable mo1584e();

        /* renamed from: f */
        CharSequence mo1585f();
    }

    public C0218s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0654a.spinnerStyle);
    }

    public C0218s(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C0218s(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r11 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        if (r11 != null) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036 A[SYNTHETIC, Splitter:B:10:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0218s(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f1075m = r0
            int[] r0 = p006b.p007a.C0663j.Spinner
            r1 = 0
            androidx.appcompat.widget.r0 r0 = androidx.appcompat.widget.C0217r0.m1054a(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f1068f = r2
            if (r11 == 0) goto L_0x0022
            b.a.o.d r2 = new b.a.o.d
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
        L_0x001f:
            r6.f1069g = r2
            goto L_0x0032
        L_0x0022:
            int r11 = p006b.p007a.C0663j.Spinner_popupTheme
            int r11 = r0.mo1544g(r11, r1)
            if (r11 == 0) goto L_0x0030
            b.a.o.d r2 = new b.a.o.d
            r2.<init>((android.content.Context) r7, (int) r11)
            goto L_0x001f
        L_0x0030:
            r6.f1069g = r7
        L_0x0032:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x0064
            int[] r11 = f1067n     // Catch:{ Exception -> 0x0051, all -> 0x004e }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0051, all -> 0x004e }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x004c }
            if (r3 == 0) goto L_0x0046
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x004c }
        L_0x0046:
            if (r11 == 0) goto L_0x0064
        L_0x0048:
            r11.recycle()
            goto L_0x0064
        L_0x004c:
            r3 = move-exception
            goto L_0x0053
        L_0x004e:
            r7 = move-exception
            r11 = r2
            goto L_0x005e
        L_0x0051:
            r3 = move-exception
            r11 = r2
        L_0x0053:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x005d }
            if (r11 == 0) goto L_0x0064
            goto L_0x0048
        L_0x005d:
            r7 = move-exception
        L_0x005e:
            if (r11 == 0) goto L_0x0063
            r11.recycle()
        L_0x0063:
            throw r7
        L_0x0064:
            r11 = 1
            if (r10 == 0) goto L_0x00a1
            if (r10 == r11) goto L_0x006a
            goto L_0x00b3
        L_0x006a:
            androidx.appcompat.widget.s$e r10 = new androidx.appcompat.widget.s$e
            android.content.Context r3 = r6.f1069g
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1069g
            int[] r4 = p006b.p007a.C0663j.Spinner
            androidx.appcompat.widget.r0 r1 = androidx.appcompat.widget.C0217r0.m1054a(r3, r8, r4, r9, r1)
            int r3 = p006b.p007a.C0663j.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.mo1542f(r3, r4)
            r6.f1074l = r3
            int r3 = p006b.p007a.C0663j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.mo1535b(r3)
            r10.mo1299a((android.graphics.drawable.Drawable) r3)
            int r3 = p006b.p007a.C0663j.Spinner_android_prompt
            java.lang.String r3 = r0.mo1539d(r3)
            r10.mo1577a((java.lang.CharSequence) r3)
            r1.mo1531a()
            r6.f1073k = r10
            androidx.appcompat.widget.s$a r1 = new androidx.appcompat.widget.s$a
            r1.<init>(r6, r10)
            r6.f1070h = r1
            goto L_0x00b3
        L_0x00a1:
            androidx.appcompat.widget.s$c r10 = new androidx.appcompat.widget.s$c
            r10.<init>()
            r6.f1073k = r10
            androidx.appcompat.widget.s$g r10 = r6.f1073k
            int r1 = p006b.p007a.C0663j.Spinner_android_prompt
            java.lang.String r1 = r0.mo1539d(r1)
            r10.mo1577a((java.lang.CharSequence) r1)
        L_0x00b3:
            int r10 = p006b.p007a.C0663j.Spinner_android_entries
            java.lang.CharSequence[] r10 = r0.mo1543f(r10)
            if (r10 == 0) goto L_0x00cb
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = p006b.p007a.C0660g.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00cb:
            r0.mo1531a()
            r6.f1072j = r11
            android.widget.SpinnerAdapter r7 = r6.f1071i
            if (r7 == 0) goto L_0x00d9
            r6.setAdapter((android.widget.SpinnerAdapter) r7)
            r6.f1071i = r2
        L_0x00d9:
            androidx.appcompat.widget.e r7 = r6.f1068f
            r7.mo1292a(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0218s.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo1546a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f1075m);
        Rect rect = this.f1075m;
        return i2 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1547a() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f1073k.mo1574a(getTextDirection(), getTextAlignment());
        } else {
            this.f1073k.mo1574a(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0170e eVar = this.f1068f;
        if (eVar != null) {
            eVar.mo1287a();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0229g gVar = this.f1073k;
        if (gVar != null) {
            return gVar.mo1578b();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        C0229g gVar = this.f1073k;
        if (gVar != null) {
            return gVar.mo1582d();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f1073k != null) {
            return this.f1074l;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final C0229g getInternalPopup() {
        return this.f1073k;
    }

    public Drawable getPopupBackground() {
        C0229g gVar = this.f1073k;
        if (gVar != null) {
            return gVar.mo1584e();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f1069g;
    }

    public CharSequence getPrompt() {
        C0229g gVar = this.f1073k;
        return gVar != null ? gVar.mo1585f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0170e eVar = this.f1068f;
        if (eVar != null) {
            return eVar.mo1293b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0170e eVar = this.f1068f;
        if (eVar != null) {
            return eVar.mo1295c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0229g gVar = this.f1073k;
        if (gVar != null && gVar.mo1581c()) {
            this.f1073k.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1073k != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1546a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0227f fVar = (C0227f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (fVar.f1094f && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C0220b());
        }
    }

    public Parcelable onSaveInstanceState() {
        C0227f fVar = new C0227f(super.onSaveInstanceState());
        C0229g gVar = this.f1073k;
        fVar.f1094f = gVar != null && gVar.mo1581c();
        return fVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0164c0 c0Var = this.f1070h;
        if (c0Var == null || !c0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0229g gVar = this.f1073k;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.mo1581c()) {
            return true;
        }
        mo1547a();
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1072j) {
            this.f1071i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1073k != null) {
            Context context = this.f1069g;
            if (context == null) {
                context = getContext();
            }
            this.f1073k.mo1576a((ListAdapter) new C0222d(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0170e eVar = this.f1068f;
        if (eVar != null) {
            eVar.mo1291a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0170e eVar = this.f1068f;
        if (eVar != null) {
            eVar.mo1288a(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0229g gVar = this.f1073k;
        if (gVar != null) {
            gVar.mo1580c(i);
            this.f1073k.mo1573a(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        C0229g gVar = this.f1073k;
        if (gVar != null) {
            gVar.mo1579b(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f1073k != null) {
            this.f1074l = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0229g gVar = this.f1073k;
        if (gVar != null) {
            gVar.mo1575a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0664a.m3682c(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0229g gVar = this.f1073k;
        if (gVar != null) {
            gVar.mo1577a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0170e eVar = this.f1068f;
        if (eVar != null) {
            eVar.mo1294b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0170e eVar = this.f1068f;
        if (eVar != null) {
            eVar.mo1290a(mode);
        }
    }
}
