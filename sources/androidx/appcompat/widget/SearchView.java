package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p006b.p007a.C0654a;
import p006b.p007a.C0657d;
import p006b.p007a.C0659f;
import p006b.p007a.C0660g;
import p006b.p007a.C0661h;
import p006b.p007a.C0663j;
import p006b.p007a.p014o.C0687c;
import p006b.p026g.p035k.C0890v;
import p006b.p037h.p038a.C0906a;
import p006b.p039i.p040a.C0912a;
import p190io.objectbox.android.BuildConfig;
import p190io.objectbox.model.PropertyFlags;

public class SearchView extends C0168d0 implements C0687c {

    /* renamed from: v0 */
    static final C0131k f636v0 = new C0131k();

    /* renamed from: A */
    final ImageView f637A;

    /* renamed from: B */
    final ImageView f638B;

    /* renamed from: C */
    private final View f639C;

    /* renamed from: D */
    private C0137p f640D;

    /* renamed from: E */
    private Rect f641E;

    /* renamed from: F */
    private Rect f642F;

    /* renamed from: G */
    private int[] f643G;

    /* renamed from: H */
    private int[] f644H;

    /* renamed from: I */
    private final ImageView f645I;

    /* renamed from: J */
    private final Drawable f646J;

    /* renamed from: K */
    private final int f647K;

    /* renamed from: L */
    private final int f648L;

    /* renamed from: M */
    private final Intent f649M;

    /* renamed from: N */
    private final Intent f650N;

    /* renamed from: O */
    private final CharSequence f651O;

    /* renamed from: P */
    private C0133m f652P;

    /* renamed from: Q */
    private C0132l f653Q;

    /* renamed from: R */
    View.OnFocusChangeListener f654R;

    /* renamed from: S */
    private C0134n f655S;

    /* renamed from: T */
    private View.OnClickListener f656T;

    /* renamed from: U */
    private boolean f657U;

    /* renamed from: V */
    private boolean f658V;

    /* renamed from: W */
    C0906a f659W;

    /* renamed from: a0 */
    private boolean f660a0;

    /* renamed from: b0 */
    private CharSequence f661b0;

    /* renamed from: c0 */
    private boolean f662c0;

    /* renamed from: d0 */
    private boolean f663d0;

    /* renamed from: e0 */
    private int f664e0;

    /* renamed from: f0 */
    private boolean f665f0;

    /* renamed from: g0 */
    private CharSequence f666g0;

    /* renamed from: h0 */
    private CharSequence f667h0;

    /* renamed from: i0 */
    private boolean f668i0;

    /* renamed from: j0 */
    private int f669j0;

    /* renamed from: k0 */
    SearchableInfo f670k0;

    /* renamed from: l0 */
    private Bundle f671l0;

    /* renamed from: m0 */
    private final Runnable f672m0;

    /* renamed from: n0 */
    private Runnable f673n0;

    /* renamed from: o0 */
    private final WeakHashMap<String, Drawable.ConstantState> f674o0;

    /* renamed from: p0 */
    private final View.OnClickListener f675p0;

    /* renamed from: q0 */
    View.OnKeyListener f676q0;

    /* renamed from: r0 */
    private final TextView.OnEditorActionListener f677r0;

    /* renamed from: s0 */
    private final AdapterView.OnItemClickListener f678s0;

    /* renamed from: t0 */
    private final AdapterView.OnItemSelectedListener f679t0;

    /* renamed from: u */
    final SearchAutoComplete f680u;

    /* renamed from: u0 */
    private TextWatcher f681u0;

    /* renamed from: v */
    private final View f682v;

    /* renamed from: w */
    private final View f683w;

    /* renamed from: x */
    private final View f684x;

    /* renamed from: y */
    final ImageView f685y;

    /* renamed from: z */
    final ImageView f686z;

    public static class SearchAutoComplete extends C0167d {

        /* renamed from: i */
        private int f687i;

        /* renamed from: j */
        private SearchView f688j;

        /* renamed from: k */
        private boolean f689k;

        /* renamed from: l */
        final Runnable f690l;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        class C0120a implements Runnable {
            C0120a() {
            }

            public void run() {
                SearchAutoComplete.this.mo980b();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0654a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f690l = new C0120a();
            this.f687i = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return PropertyFlags.INDEX_PARTIAL_SKIP_NULL;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo979a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo980b() {
            if (this.f689k) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f689k = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f687i <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f689k) {
                removeCallbacks(this.f690l);
                post(this.f690l);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f688j.mo955j();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f688j.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f688j.hasFocus() && getVisibility() == 0) {
                this.f689k = true;
                if (SearchView.m666a(getContext())) {
                    SearchView.f636v0.mo1007a(this, true);
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f689k = false;
                removeCallbacks(this.f690l);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f689k = false;
                removeCallbacks(this.f690l);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f689k = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f688j = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f687i = i;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    class C0121a implements TextWatcher {
        C0121a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.mo938b(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    class C0122b implements Runnable {
        C0122b() {
        }

        public void run() {
            SearchView.this.mo957l();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    class C0123c implements Runnable {
        C0123c() {
        }

        public void run() {
            C0906a aVar = SearchView.this.f659W;
            if (aVar instanceof C0204l0) {
                aVar.mo1489b((Cursor) null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    class C0124d implements View.OnFocusChangeListener {
        C0124d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f654R;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    class C0125e implements View.OnLayoutChangeListener {
        C0125e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.mo940d();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    class C0126f implements View.OnClickListener {
        C0126f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f685y) {
                searchView.mo953h();
            } else if (view == searchView.f637A) {
                searchView.mo944g();
            } else if (view == searchView.f686z) {
                searchView.mo954i();
            } else if (view == searchView.f638B) {
                searchView.mo956k();
            } else if (view == searchView.f680u) {
                searchView.mo942e();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    class C0127g implements View.OnKeyListener {
        C0127g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f670k0 == null) {
                return false;
            }
            if (searchView.f680u.isPopupShowing() && SearchView.this.f680u.getListSelection() != -1) {
                return SearchView.this.mo937a(view, i, keyEvent);
            }
            if (SearchView.this.f680u.mo979a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.mo933a(0, (String) null, searchView2.f680u.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    class C0128h implements TextView.OnEditorActionListener {
        C0128h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo954i();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    class C0129i implements AdapterView.OnItemClickListener {
        C0129i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo936a(i, 0, (String) null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    class C0130j implements AdapterView.OnItemSelectedListener {
        C0130j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo941d(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    private static class C0131k {

        /* renamed from: a */
        private Method f702a;

        /* renamed from: b */
        private Method f703b;

        /* renamed from: c */
        private Method f704c;

        C0131k() {
            try {
                this.f702a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f702a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                this.f703b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f703b.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                this.f704c = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f704c.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1006a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f703b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1007a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            Method method = this.f704c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1008b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f702a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C0132l {
        /* renamed from: a */
        boolean mo1009a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C0133m {
        /* renamed from: a */
        boolean mo1010a(String str);

        /* renamed from: b */
        boolean mo1011b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public interface C0134n {
        /* renamed from: a */
        boolean mo1012a(int i);

        /* renamed from: b */
        boolean mo1013b(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    static class C0135o extends C0912a {
        public static final Parcelable.Creator<C0135o> CREATOR = new C0136a();

        /* renamed from: h */
        boolean f705h;

        /* renamed from: androidx.appcompat.widget.SearchView$o$a */
        static class C0136a implements Parcelable.ClassLoaderCreator<C0135o> {
            C0136a() {
            }

            public C0135o createFromParcel(Parcel parcel) {
                return new C0135o(parcel, (ClassLoader) null);
            }

            public C0135o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0135o(parcel, classLoader);
            }

            public C0135o[] newArray(int i) {
                return new C0135o[i];
            }
        }

        public C0135o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f705h = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        C0135o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f705h + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f705h));
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    private static class C0137p extends TouchDelegate {

        /* renamed from: a */
        private final View f706a;

        /* renamed from: b */
        private final Rect f707b = new Rect();

        /* renamed from: c */
        private final Rect f708c = new Rect();

        /* renamed from: d */
        private final Rect f709d = new Rect();

        /* renamed from: e */
        private final int f710e;

        /* renamed from: f */
        private boolean f711f;

        public C0137p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f710e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo1019a(rect, rect2);
            this.f706a = view;
        }

        /* renamed from: a */
        public void mo1019a(Rect rect, Rect rect2) {
            this.f707b.set(rect);
            this.f709d.set(rect);
            Rect rect3 = this.f709d;
            int i = this.f710e;
            rect3.inset(-i, -i);
            this.f708c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x002e
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003a
            L_0x001b:
                boolean r2 = r7.f711f
                r7.f711f = r5
                goto L_0x003b
            L_0x0020:
                boolean r2 = r7.f711f
                if (r2 == 0) goto L_0x003b
                android.graphics.Rect r6 = r7.f709d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x003b
                r4 = 0
                goto L_0x003b
            L_0x002e:
                android.graphics.Rect r2 = r7.f707b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003a
                r7.f711f = r4
                r2 = 1
                goto L_0x003b
            L_0x003a:
                r2 = 0
            L_0x003b:
                if (r2 == 0) goto L_0x006a
                if (r4 == 0) goto L_0x0057
                android.graphics.Rect r2 = r7.f708c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0057
                android.view.View r0 = r7.f706a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f706a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L_0x0060
            L_0x0057:
                android.graphics.Rect r2 = r7.f708c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x0060:
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                android.view.View r0 = r7.f706a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x006a:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0137p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0654a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f641E = new Rect();
        this.f642F = new Rect();
        this.f643G = new int[2];
        this.f644H = new int[2];
        this.f672m0 = new C0122b();
        this.f673n0 = new C0123c();
        this.f674o0 = new WeakHashMap<>();
        this.f675p0 = new C0126f();
        this.f676q0 = new C0127g();
        this.f677r0 = new C0128h();
        this.f678s0 = new C0129i();
        this.f679t0 = new C0130j();
        this.f681u0 = new C0121a();
        C0217r0 a = C0217r0.m1054a(context, attributeSet, C0663j.SearchView, i, 0);
        LayoutInflater.from(context).inflate(a.mo1544g(C0663j.SearchView_layout, C0660g.abc_search_view), this, true);
        this.f680u = (SearchAutoComplete) findViewById(C0659f.search_src_text);
        this.f680u.setSearchView(this);
        this.f682v = findViewById(C0659f.search_edit_frame);
        this.f683w = findViewById(C0659f.search_plate);
        this.f684x = findViewById(C0659f.submit_area);
        this.f685y = (ImageView) findViewById(C0659f.search_button);
        this.f686z = (ImageView) findViewById(C0659f.search_go_btn);
        this.f637A = (ImageView) findViewById(C0659f.search_close_btn);
        this.f638B = (ImageView) findViewById(C0659f.search_voice_btn);
        this.f645I = (ImageView) findViewById(C0659f.search_mag_icon);
        C0890v.m4751a(this.f683w, a.mo1535b(C0663j.SearchView_queryBackground));
        C0890v.m4751a(this.f684x, a.mo1535b(C0663j.SearchView_submitBackground));
        this.f685y.setImageDrawable(a.mo1535b(C0663j.SearchView_searchIcon));
        this.f686z.setImageDrawable(a.mo1535b(C0663j.SearchView_goIcon));
        this.f637A.setImageDrawable(a.mo1535b(C0663j.SearchView_closeIcon));
        this.f638B.setImageDrawable(a.mo1535b(C0663j.SearchView_voiceIcon));
        this.f645I.setImageDrawable(a.mo1535b(C0663j.SearchView_searchIcon));
        this.f646J = a.mo1535b(C0663j.SearchView_searchHintIcon);
        C0234t0.m1151a(this.f685y, getResources().getString(C0661h.abc_searchview_description_search));
        this.f647K = a.mo1544g(C0663j.SearchView_suggestionRowLayout, C0660g.abc_search_dropdown_item_icons_2line);
        this.f648L = a.mo1544g(C0663j.SearchView_commitIcon, 0);
        this.f685y.setOnClickListener(this.f675p0);
        this.f637A.setOnClickListener(this.f675p0);
        this.f686z.setOnClickListener(this.f675p0);
        this.f638B.setOnClickListener(this.f675p0);
        this.f680u.setOnClickListener(this.f675p0);
        this.f680u.addTextChangedListener(this.f681u0);
        this.f680u.setOnEditorActionListener(this.f677r0);
        this.f680u.setOnItemClickListener(this.f678s0);
        this.f680u.setOnItemSelectedListener(this.f679t0);
        this.f680u.setOnKeyListener(this.f676q0);
        this.f680u.setOnFocusChangeListener(new C0124d());
        setIconifiedByDefault(a.mo1532a(C0663j.SearchView_iconifiedByDefault, true));
        int c = a.mo1536c(C0663j.SearchView_android_maxWidth, -1);
        if (c != -1) {
            setMaxWidth(c);
        }
        this.f651O = a.mo1541e(C0663j.SearchView_defaultQueryHint);
        this.f661b0 = a.mo1541e(C0663j.SearchView_queryHint);
        int d = a.mo1538d(C0663j.SearchView_android_imeOptions, -1);
        if (d != -1) {
            setImeOptions(d);
        }
        int d2 = a.mo1538d(C0663j.SearchView_android_inputType, -1);
        if (d2 != -1) {
            setInputType(d2);
        }
        setFocusable(a.mo1532a(C0663j.SearchView_android_focusable, true));
        a.mo1531a();
        this.f649M = new Intent("android.speech.action.WEB_SEARCH");
        this.f649M.addFlags(268435456);
        this.f649M.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f650N = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f650N.addFlags(268435456);
        this.f639C = findViewById(this.f680u.getDropDownAnchor());
        View view = this.f639C;
        if (view != null) {
            view.addOnLayoutChangeListener(new C0125e());
        }
        m668b(this.f657U);
        m678r();
    }

    /* renamed from: a */
    private Intent m660a(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f671l0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: a */
    private Intent m661a(Cursor cursor, int i, String str) {
        int i2;
        String a;
        try {
            String a2 = C0204l0.m1001a(cursor, "suggest_intent_action");
            if (a2 == null) {
                a2 = this.f670k0.getSuggestIntentAction();
            }
            if (a2 == null) {
                a2 = "android.intent.action.SEARCH";
            }
            String str2 = a2;
            String a3 = C0204l0.m1001a(cursor, "suggest_intent_data");
            if (a3 == null) {
                a3 = this.f670k0.getSuggestIntentData();
            }
            if (!(a3 == null || (a = C0204l0.m1001a(cursor, "suggest_intent_data_id")) == null)) {
                a3 = a3 + "/" + Uri.encode(a);
            }
            return m662a(str2, a3 == null ? null : Uri.parse(a3), C0204l0.m1001a(cursor, "suggest_intent_extra_data"), C0204l0.m1001a(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    /* renamed from: a */
    private Intent m662a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f667h0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f671l0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f670k0.getSearchActivity());
        return intent;
    }

    /* renamed from: a */
    private void m663a(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                Log.e("SearchView", "Failed launch activity: " + intent, e);
            }
        }
    }

    /* renamed from: a */
    private void m664a(View view, Rect rect) {
        view.getLocationInWindow(this.f643G);
        getLocationInWindow(this.f644H);
        int[] iArr = this.f643G;
        int i = iArr[1];
        int[] iArr2 = this.f644H;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: a */
    private void m665a(boolean z) {
        this.f686z.setVisibility((!this.f660a0 || !m675o() || !hasFocus() || (!z && this.f665f0)) ? 8 : 0);
    }

    /* renamed from: a */
    static boolean m666a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: b */
    private Intent m667b(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: b */
    private void m668b(boolean z) {
        this.f658V = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f680u.getText());
        this.f685y.setVisibility(i2);
        m665a(z2);
        this.f682v.setVisibility(z ? 8 : 0);
        if (this.f645I.getDrawable() == null || this.f657U) {
            i = 8;
        }
        this.f645I.setVisibility(i);
        m677q();
        m671c(!z2);
        m680t();
    }

    /* renamed from: b */
    private boolean m669b(int i, int i2, String str) {
        Cursor a = this.f659W.mo4708a();
        if (a == null || !a.moveToPosition(i)) {
            return false;
        }
        m663a(m661a(a, i2, str));
        return true;
    }

    /* renamed from: c */
    private CharSequence m670c(CharSequence charSequence) {
        if (!this.f657U || this.f646J == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f680u.getTextSize()) * 1.25d);
        this.f646J.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f646J), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: c */
    private void m671c(boolean z) {
        int i;
        if (!this.f665f0 || mo943f() || !z) {
            i = 8;
        } else {
            i = 0;
            this.f686z.setVisibility(8);
        }
        this.f638B.setVisibility(i);
    }

    /* renamed from: e */
    private void m672e(int i) {
        CharSequence a;
        Editable text = this.f680u.getText();
        Cursor a2 = this.f659W.mo4708a();
        if (a2 != null) {
            if (!a2.moveToPosition(i) || (a = this.f659W.mo1485a(a2)) == null) {
                setQuery(text);
            } else {
                setQuery(a);
            }
        }
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0657d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0657d.abc_search_view_preferred_width);
    }

    /* renamed from: m */
    private void m673m() {
        this.f680u.dismissDropDown();
    }

    /* renamed from: n */
    private boolean m674n() {
        SearchableInfo searchableInfo = this.f670k0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f670k0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f649M;
        } else if (this.f670k0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f650N;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: o */
    private boolean m675o() {
        return (this.f660a0 || this.f665f0) && !mo943f();
    }

    /* renamed from: p */
    private void m676p() {
        post(this.f672m0);
    }

    /* renamed from: q */
    private void m677q() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f680u.getText());
        int i = 0;
        if (!z2 && (!this.f657U || this.f668i0)) {
            z = false;
        }
        ImageView imageView = this.f637A;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f637A.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: r */
    private void m678r() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f680u;
        if (queryHint == null) {
            queryHint = BuildConfig.FLAVOR;
        }
        searchAutoComplete.setHint(m670c(queryHint));
    }

    /* renamed from: s */
    private void m679s() {
        this.f680u.setThreshold(this.f670k0.getSuggestThreshold());
        this.f680u.setImeOptions(this.f670k0.getImeOptions());
        int inputType = this.f670k0.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f670k0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f680u.setInputType(inputType);
        C0906a aVar = this.f659W;
        if (aVar != null) {
            aVar.mo1489b((Cursor) null);
        }
        if (this.f670k0.getSuggestAuthority() != null) {
            this.f659W = new C0204l0(getContext(), this, this.f670k0, this.f674o0);
            this.f680u.setAdapter(this.f659W);
            C0204l0 l0Var = (C0204l0) this.f659W;
            if (this.f662c0) {
                i = 2;
            }
            l0Var.mo1486a(i);
        }
    }

    private void setQuery(CharSequence charSequence) {
        this.f680u.setText(charSequence);
        this.f680u.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: t */
    private void m680t() {
        this.f684x.setVisibility((!m675o() || !(this.f686z.getVisibility() == 0 || this.f638B.getVisibility() == 0)) ? 8 : 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo933a(int i, String str, String str2) {
        getContext().startActivity(m662a("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo934a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: a */
    public void mo935a(CharSequence charSequence, boolean z) {
        this.f680u.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f680u;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f667h0 = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo954i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo936a(int i, int i2, String str) {
        C0134n nVar = this.f655S;
        if (nVar != null && nVar.mo1013b(i)) {
            return false;
        }
        m669b(i, 0, (String) null);
        this.f680u.setImeVisibility(false);
        m673m();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo937a(View view, int i, KeyEvent keyEvent) {
        if (this.f670k0 != null && this.f659W != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo936a(this.f680u.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                this.f680u.setSelection(i == 21 ? 0 : this.f680u.length());
                this.f680u.setListSelection(0);
                this.f680u.clearListSelection();
                f636v0.mo1007a(this.f680u, true);
                return true;
            } else if (i != 19 || this.f680u.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo643b() {
        if (!this.f668i0) {
            this.f668i0 = true;
            this.f669j0 = this.f680u.getImeOptions();
            this.f680u.setImeOptions(this.f669j0 | 33554432);
            this.f680u.setText(BuildConfig.FLAVOR);
            setIconified(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo938b(CharSequence charSequence) {
        Editable text = this.f680u.getText();
        this.f667h0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m665a(z);
        m671c(!z);
        m677q();
        m680t();
        if (this.f652P != null && !TextUtils.equals(charSequence, this.f666g0)) {
            this.f652P.mo1010a(charSequence.toString());
        }
        this.f666g0 = charSequence.toString();
    }

    /* renamed from: c */
    public void mo644c() {
        mo935a((CharSequence) BuildConfig.FLAVOR, false);
        clearFocus();
        m668b(true);
        this.f680u.setImeOptions(this.f669j0);
        this.f668i0 = false;
    }

    public void clearFocus() {
        this.f663d0 = true;
        super.clearFocus();
        this.f680u.clearFocus();
        this.f680u.setImeVisibility(false);
        this.f663d0 = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo940d() {
        if (this.f639C.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f683w.getPaddingLeft();
            Rect rect = new Rect();
            boolean a = C0246x0.m1240a(this);
            int dimensionPixelSize = this.f657U ? resources.getDimensionPixelSize(C0657d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C0657d.abc_dropdownitem_text_padding_left) : 0;
            this.f680u.getDropDownBackground().getPadding(rect);
            int i = rect.left;
            this.f680u.setDropDownHorizontalOffset(a ? -i : paddingLeft - (i + dimensionPixelSize));
            this.f680u.setDropDownWidth((((this.f639C.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo941d(int i) {
        C0134n nVar = this.f655S;
        if (nVar != null && nVar.mo1012a(i)) {
            return false;
        }
        m672e(i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo942e() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f680u.refreshAutoCompleteResults();
            return;
        }
        f636v0.mo1008b(this.f680u);
        f636v0.mo1006a(this.f680u);
    }

    /* renamed from: f */
    public boolean mo943f() {
        return this.f658V;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo944g() {
        if (!TextUtils.isEmpty(this.f680u.getText())) {
            this.f680u.setText(BuildConfig.FLAVOR);
            this.f680u.requestFocus();
            this.f680u.setImeVisibility(true);
        } else if (this.f657U) {
            C0132l lVar = this.f653Q;
            if (lVar == null || !lVar.mo1009a()) {
                clearFocus();
                m668b(true);
            }
        }
    }

    public int getImeOptions() {
        return this.f680u.getImeOptions();
    }

    public int getInputType() {
        return this.f680u.getInputType();
    }

    public int getMaxWidth() {
        return this.f664e0;
    }

    public CharSequence getQuery() {
        return this.f680u.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f661b0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f670k0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f651O : getContext().getText(this.f670k0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f648L;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f647K;
    }

    public C0906a getSuggestionsAdapter() {
        return this.f659W;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo953h() {
        m668b(false);
        this.f680u.requestFocus();
        this.f680u.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f656T;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo954i() {
        Editable text = this.f680u.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0133m mVar = this.f652P;
            if (mVar == null || !mVar.mo1011b(text.toString())) {
                if (this.f670k0 != null) {
                    mo933a(0, (String) null, text.toString());
                }
                this.f680u.setImeVisibility(false);
                m673m();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo955j() {
        m668b(mo943f());
        m676p();
        if (this.f680u.hasFocus()) {
            mo942e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo956k() {
        Intent a;
        SearchableInfo searchableInfo = this.f670k0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    a = m667b(this.f649M, searchableInfo);
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    a = m660a(this.f650N, searchableInfo);
                } else {
                    return;
                }
                getContext().startActivity(a);
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo957l() {
        int[] iArr = this.f680u.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f683w.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f684x.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f672m0);
        post(this.f673n0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m664a((View) this.f680u, this.f641E);
            Rect rect = this.f642F;
            Rect rect2 = this.f641E;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0137p pVar = this.f640D;
            if (pVar == null) {
                this.f640D = new C0137p(this.f642F, this.f641E, this.f680u);
                setTouchDelegate(this.f640D);
                return;
            }
            pVar.mo1019a(this.f642F, this.f641E);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 <= 0) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.mo943f()
            if (r0 == 0) goto L_0x000a
            super.onMeasure(r4, r5)
            return
        L_0x000a:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002c
            if (r0 == 0) goto L_0x0022
            if (r0 == r2) goto L_0x001d
            goto L_0x0039
        L_0x001d:
            int r0 = r3.f664e0
            if (r0 <= 0) goto L_0x0039
            goto L_0x0030
        L_0x0022:
            int r4 = r3.f664e0
            if (r4 <= 0) goto L_0x0027
            goto L_0x0039
        L_0x0027:
            int r4 = r3.getPreferredWidth()
            goto L_0x0039
        L_0x002c:
            int r0 = r3.f664e0
            if (r0 <= 0) goto L_0x0031
        L_0x0030:
            goto L_0x0035
        L_0x0031:
            int r0 = r3.getPreferredWidth()
        L_0x0035:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0039:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x004b
            if (r0 == 0) goto L_0x0046
            goto L_0x0053
        L_0x0046:
            int r5 = r3.getPreferredHeight()
            goto L_0x0053
        L_0x004b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0053:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0135o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0135o oVar = (C0135o) parcelable;
        super.onRestoreInstanceState(oVar.mo4725q());
        m668b(oVar.f705h);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0135o oVar = new C0135o(super.onSaveInstanceState());
        oVar.f705h = mo943f();
        return oVar;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m676p();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f663d0 || !isFocusable()) {
            return false;
        }
        if (mo943f()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f680u.requestFocus(i, rect);
        if (requestFocus) {
            m668b(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f671l0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo944g();
        } else {
            mo953h();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f657U != z) {
            this.f657U = z;
            m668b(z);
            m678r();
        }
    }

    public void setImeOptions(int i) {
        this.f680u.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f680u.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f664e0 = i;
        requestLayout();
    }

    public void setOnCloseListener(C0132l lVar) {
        this.f653Q = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f654R = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0133m mVar) {
        this.f652P = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f656T = onClickListener;
    }

    public void setOnSuggestionListener(C0134n nVar) {
        this.f655S = nVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f661b0 = charSequence;
        m678r();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f662c0 = z;
        C0906a aVar = this.f659W;
        if (aVar instanceof C0204l0) {
            ((C0204l0) aVar).mo1486a(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f670k0 = searchableInfo;
        if (this.f670k0 != null) {
            m679s();
            m678r();
        }
        this.f665f0 = m674n();
        if (this.f665f0) {
            this.f680u.setPrivateImeOptions("nm");
        }
        m668b(mo943f());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f660a0 = z;
        m668b(mo943f());
    }

    public void setSuggestionsAdapter(C0906a aVar) {
        this.f659W = aVar;
        this.f680u.setAdapter(this.f659W);
    }
}
