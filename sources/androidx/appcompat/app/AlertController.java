package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.C0168d0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p006b.p007a.C0654a;
import p006b.p007a.C0659f;
import p006b.p007a.C0663j;
import p006b.p026g.p035k.C0890v;

class AlertController {

    /* renamed from: A */
    NestedScrollView f25A;

    /* renamed from: B */
    private int f26B = 0;

    /* renamed from: C */
    private Drawable f27C;

    /* renamed from: D */
    private ImageView f28D;

    /* renamed from: E */
    private TextView f29E;

    /* renamed from: F */
    private TextView f30F;

    /* renamed from: G */
    private View f31G;

    /* renamed from: H */
    ListAdapter f32H;

    /* renamed from: I */
    int f33I = -1;

    /* renamed from: J */
    private int f34J;

    /* renamed from: K */
    private int f35K;

    /* renamed from: L */
    int f36L;

    /* renamed from: M */
    int f37M;

    /* renamed from: N */
    int f38N;

    /* renamed from: O */
    int f39O;

    /* renamed from: P */
    private boolean f40P;

    /* renamed from: Q */
    private int f41Q = 0;

    /* renamed from: R */
    Handler f42R;

    /* renamed from: S */
    private final View.OnClickListener f43S = new C0012a();

    /* renamed from: a */
    private final Context f44a;

    /* renamed from: b */
    final C0056h f45b;

    /* renamed from: c */
    private final Window f46c;

    /* renamed from: d */
    private final int f47d;

    /* renamed from: e */
    private CharSequence f48e;

    /* renamed from: f */
    private CharSequence f49f;

    /* renamed from: g */
    ListView f50g;

    /* renamed from: h */
    private View f51h;

    /* renamed from: i */
    private int f52i;

    /* renamed from: j */
    private int f53j;

    /* renamed from: k */
    private int f54k;

    /* renamed from: l */
    private int f55l;

    /* renamed from: m */
    private int f56m;

    /* renamed from: n */
    private boolean f57n = false;

    /* renamed from: o */
    Button f58o;

    /* renamed from: p */
    private CharSequence f59p;

    /* renamed from: q */
    Message f60q;

    /* renamed from: r */
    private Drawable f61r;

    /* renamed from: s */
    Button f62s;

    /* renamed from: t */
    private CharSequence f63t;

    /* renamed from: u */
    Message f64u;

    /* renamed from: v */
    private Drawable f65v;

    /* renamed from: w */
    Button f66w;

    /* renamed from: x */
    private CharSequence f67x;

    /* renamed from: y */
    Message f68y;

    /* renamed from: z */
    private Drawable f69z;

    public static class RecycleListView extends ListView {

        /* renamed from: f */
        private final int f70f;

        /* renamed from: g */
        private final int f71g;

        public RecycleListView(Context context) {
            this(context, (AttributeSet) null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0663j.RecycleListView);
            this.f71g = obtainStyledAttributes.getDimensionPixelOffset(C0663j.RecycleListView_paddingBottomNoButtons, -1);
            this.f70f = obtainStyledAttributes.getDimensionPixelOffset(C0663j.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public void mo40a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f70f, getPaddingRight(), z2 ? getPaddingBottom() : this.f71g);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    class C0012a implements View.OnClickListener {
        C0012a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
            r3 = r0.f68y;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f58o
                if (r3 != r1) goto L_0x000f
                android.os.Message r0 = r0.f60q
                if (r0 == 0) goto L_0x000f
            L_0x000a:
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L_0x002a
            L_0x000f:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f62s
                if (r3 != r1) goto L_0x001a
                android.os.Message r0 = r0.f64u
                if (r0 == 0) goto L_0x001a
                goto L_0x000a
            L_0x001a:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f66w
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.f68y
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f42R
                r1 = 1
                androidx.appcompat.app.h r3 = r3.f45b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0012a.onClick(android.view.View):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    class C0013b implements NestedScrollView.C0335b {

        /* renamed from: a */
        final /* synthetic */ View f73a;

        /* renamed from: b */
        final /* synthetic */ View f74b;

        C0013b(AlertController alertController, View view, View view2) {
            this.f73a = view;
            this.f74b = view2;
        }

        /* renamed from: a */
        public void mo42a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m30a(nestedScrollView, this.f73a, this.f74b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    class C0014c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f75f;

        /* renamed from: g */
        final /* synthetic */ View f76g;

        C0014c(View view, View view2) {
            this.f75f = view;
            this.f76g = view2;
        }

        public void run() {
            AlertController.m30a(AlertController.this.f25A, this.f75f, this.f76g);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    class C0015d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f78a;

        /* renamed from: b */
        final /* synthetic */ View f79b;

        C0015d(AlertController alertController, View view, View view2) {
            this.f78a = view;
            this.f79b = view2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m30a(absListView, this.f78a, this.f79b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    class C0016e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f80f;

        /* renamed from: g */
        final /* synthetic */ View f81g;

        C0016e(View view, View view2) {
            this.f80f = view;
            this.f81g = view2;
        }

        public void run() {
            AlertController.m30a(AlertController.this.f50g, this.f80f, this.f81g);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    public static class C0017f {

        /* renamed from: A */
        public int f83A;

        /* renamed from: B */
        public int f84B;

        /* renamed from: C */
        public int f85C;

        /* renamed from: D */
        public int f86D;

        /* renamed from: E */
        public boolean f87E = false;

        /* renamed from: F */
        public boolean[] f88F;

        /* renamed from: G */
        public boolean f89G;

        /* renamed from: H */
        public boolean f90H;

        /* renamed from: I */
        public int f91I = -1;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f92J;

        /* renamed from: K */
        public Cursor f93K;

        /* renamed from: L */
        public String f94L;

        /* renamed from: M */
        public String f95M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f96N;

        /* renamed from: O */
        public C0022e f97O;

        /* renamed from: a */
        public final Context f98a;

        /* renamed from: b */
        public final LayoutInflater f99b;

        /* renamed from: c */
        public int f100c = 0;

        /* renamed from: d */
        public Drawable f101d;

        /* renamed from: e */
        public int f102e = 0;

        /* renamed from: f */
        public CharSequence f103f;

        /* renamed from: g */
        public View f104g;

        /* renamed from: h */
        public CharSequence f105h;

        /* renamed from: i */
        public CharSequence f106i;

        /* renamed from: j */
        public Drawable f107j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f108k;

        /* renamed from: l */
        public CharSequence f109l;

        /* renamed from: m */
        public Drawable f110m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f111n;

        /* renamed from: o */
        public CharSequence f112o;

        /* renamed from: p */
        public Drawable f113p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f114q;

        /* renamed from: r */
        public boolean f115r;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f116s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f117t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f118u;

        /* renamed from: v */
        public CharSequence[] f119v;

        /* renamed from: w */
        public ListAdapter f120w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f121x;

        /* renamed from: y */
        public int f122y;

        /* renamed from: z */
        public View f123z;

        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        class C0018a extends ArrayAdapter<CharSequence> {

            /* renamed from: f */
            final /* synthetic */ RecycleListView f124f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0018a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f124f = recycleListView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0017f.this.f88F;
                if (zArr != null && zArr[i]) {
                    this.f124f.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        class C0019b extends CursorAdapter {

            /* renamed from: f */
            private final int f126f;

            /* renamed from: g */
            private final int f127g;

            /* renamed from: h */
            final /* synthetic */ RecycleListView f128h;

            /* renamed from: i */
            final /* synthetic */ AlertController f129i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0019b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f128h = recycleListView;
                this.f129i = alertController;
                Cursor cursor2 = getCursor();
                this.f126f = cursor2.getColumnIndexOrThrow(C0017f.this.f94L);
                this.f127g = cursor2.getColumnIndexOrThrow(C0017f.this.f95M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f126f));
                RecycleListView recycleListView = this.f128h;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f127g) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0017f.this.f99b.inflate(this.f129i.f37M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        class C0020c implements AdapterView.OnItemClickListener {

            /* renamed from: f */
            final /* synthetic */ AlertController f131f;

            C0020c(AlertController alertController) {
                this.f131f = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0017f.this.f121x.onClick(this.f131f.f45b, i);
                if (!C0017f.this.f90H) {
                    this.f131f.f45b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        class C0021d implements AdapterView.OnItemClickListener {

            /* renamed from: f */
            final /* synthetic */ RecycleListView f133f;

            /* renamed from: g */
            final /* synthetic */ AlertController f134g;

            C0021d(RecycleListView recycleListView, AlertController alertController) {
                this.f133f = recycleListView;
                this.f134g = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0017f.this.f88F;
                if (zArr != null) {
                    zArr[i] = this.f133f.isItemChecked(i);
                }
                C0017f.this.f92J.onClick(this.f134g.f45b, i, this.f133f.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        public interface C0022e {
            /* renamed from: a */
            void mo53a(ListView listView);
        }

        public C0017f(Context context) {
            this.f98a = context;
            this.f115r = true;
            this.f99b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v6, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v20, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v21, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m57b(androidx.appcompat.app.AlertController r12) {
            /*
                r11 = this;
                android.view.LayoutInflater r0 = r11.f99b
                int r1 = r12.f36L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r11.f89G
                r8 = 1
                if (r1 == 0) goto L_0x0033
                android.database.Cursor r4 = r11.f93K
                if (r4 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r11.f98a
                int r4 = r12.f37M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r11.f119v
                r1 = r9
                r2 = r11
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r11.f98a
                r5 = 0
                r1 = r9
                r2 = r11
                r6 = r0
                r7 = r12
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0033:
                boolean r1 = r11.f90H
                if (r1 == 0) goto L_0x003a
                int r1 = r12.f38N
                goto L_0x003c
            L_0x003a:
                int r1 = r12.f39O
            L_0x003c:
                r4 = r1
                android.database.Cursor r5 = r11.f93K
                r1 = 16908308(0x1020014, float:2.3877285E-38)
                if (r5 == 0) goto L_0x0059
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r11.f98a
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r2 = r11.f94L
                r7 = 0
                r6[r7] = r2
                int[] r10 = new int[r8]
                r10[r7] = r1
                r2 = r9
                r7 = r10
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0059:
                android.widget.ListAdapter r9 = r11.f120w
                if (r9 == 0) goto L_0x005e
                goto L_0x0067
            L_0x005e:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r2 = r11.f98a
                java.lang.CharSequence[] r3 = r11.f119v
                r9.<init>(r2, r4, r1, r3)
            L_0x0067:
                androidx.appcompat.app.AlertController$f$e r1 = r11.f97O
                if (r1 == 0) goto L_0x006e
                r1.mo53a(r0)
            L_0x006e:
                r12.f32H = r9
                int r1 = r11.f91I
                r12.f33I = r1
                android.content.DialogInterface$OnClickListener r1 = r11.f121x
                if (r1 == 0) goto L_0x0081
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r12)
            L_0x007d:
                r0.setOnItemClickListener(r1)
                goto L_0x008b
            L_0x0081:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r11.f92J
                if (r1 == 0) goto L_0x008b
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r12)
                goto L_0x007d
            L_0x008b:
                android.widget.AdapterView$OnItemSelectedListener r1 = r11.f96N
                if (r1 == 0) goto L_0x0092
                r0.setOnItemSelectedListener(r1)
            L_0x0092:
                boolean r1 = r11.f90H
                if (r1 == 0) goto L_0x009a
                r0.setChoiceMode(r8)
                goto L_0x00a2
            L_0x009a:
                boolean r1 = r11.f89G
                if (r1 == 0) goto L_0x00a2
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a2:
                r12.f50g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0017f.m57b(androidx.appcompat.app.AlertController):void");
        }

        /* renamed from: a */
        public void mo47a(AlertController alertController) {
            View view = this.f104g;
            if (view != null) {
                alertController.mo30a(view);
            } else {
                CharSequence charSequence = this.f103f;
                if (charSequence != null) {
                    alertController.mo37b(charSequence);
                }
                Drawable drawable = this.f101d;
                if (drawable != null) {
                    alertController.mo29a(drawable);
                }
                int i = this.f100c;
                if (i != 0) {
                    alertController.mo35b(i);
                }
                int i2 = this.f102e;
                if (i2 != 0) {
                    alertController.mo35b(alertController.mo26a(i2));
                }
            }
            CharSequence charSequence2 = this.f105h;
            if (charSequence2 != null) {
                alertController.mo32a(charSequence2);
            }
            if (!(this.f106i == null && this.f107j == null)) {
                alertController.mo28a(-1, this.f106i, this.f108k, (Message) null, this.f107j);
            }
            if (!(this.f109l == null && this.f110m == null)) {
                alertController.mo28a(-2, this.f109l, this.f111n, (Message) null, this.f110m);
            }
            if (!(this.f112o == null && this.f113p == null)) {
                alertController.mo28a(-3, this.f112o, this.f114q, (Message) null, this.f113p);
            }
            if (!(this.f119v == null && this.f93K == null && this.f120w == null)) {
                m57b(alertController);
            }
            View view2 = this.f123z;
            if (view2 == null) {
                int i3 = this.f122y;
                if (i3 != 0) {
                    alertController.mo39c(i3);
                }
            } else if (this.f87E) {
                alertController.mo31a(view2, this.f83A, this.f84B, this.f85C, this.f86D);
            } else {
                alertController.mo36b(view2);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    private static final class C0023g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f136a;

        public C0023g(DialogInterface dialogInterface) {
            this.f136a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f136a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$h */
    private static class C0024h extends ArrayAdapter<CharSequence> {
        public C0024h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0056h hVar, Window window) {
        this.f44a = context;
        this.f45b = hVar;
        this.f46c = window;
        this.f42R = new C0023g(hVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C0663j.AlertDialog, C0654a.alertDialogStyle, 0);
        this.f34J = obtainStyledAttributes.getResourceId(C0663j.AlertDialog_android_layout, 0);
        this.f35K = obtainStyledAttributes.getResourceId(C0663j.AlertDialog_buttonPanelSideLayout, 0);
        this.f36L = obtainStyledAttributes.getResourceId(C0663j.AlertDialog_listLayout, 0);
        this.f37M = obtainStyledAttributes.getResourceId(C0663j.AlertDialog_multiChoiceItemLayout, 0);
        this.f38N = obtainStyledAttributes.getResourceId(C0663j.AlertDialog_singleChoiceItemLayout, 0);
        this.f39O = obtainStyledAttributes.getResourceId(C0663j.AlertDialog_listItemLayout, 0);
        this.f40P = obtainStyledAttributes.getBoolean(C0663j.AlertDialog_showTitle, true);
        this.f47d = obtainStyledAttributes.getDimensionPixelSize(C0663j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        hVar.mo243a(1);
    }

    /* renamed from: a */
    private ViewGroup m29a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: a */
    static void m30a(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m31a(ViewGroup viewGroup) {
        boolean z;
        Button button;
        this.f58o = (Button) viewGroup.findViewById(16908313);
        this.f58o.setOnClickListener(this.f43S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f59p) || this.f61r != null) {
            this.f58o.setText(this.f59p);
            Drawable drawable = this.f61r;
            if (drawable != null) {
                int i = this.f47d;
                drawable.setBounds(0, 0, i, i);
                this.f58o.setCompoundDrawables(this.f61r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f58o.setVisibility(0);
            z = true;
        } else {
            this.f58o.setVisibility(8);
            z = false;
        }
        this.f62s = (Button) viewGroup.findViewById(16908314);
        this.f62s.setOnClickListener(this.f43S);
        if (!TextUtils.isEmpty(this.f63t) || this.f65v != null) {
            this.f62s.setText(this.f63t);
            Drawable drawable2 = this.f65v;
            if (drawable2 != null) {
                int i2 = this.f47d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f62s.setCompoundDrawables(this.f65v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f62s.setVisibility(0);
            z |= true;
        } else {
            this.f62s.setVisibility(8);
        }
        this.f66w = (Button) viewGroup.findViewById(16908315);
        this.f66w.setOnClickListener(this.f43S);
        if (!TextUtils.isEmpty(this.f67x) || this.f69z != null) {
            this.f66w.setText(this.f67x);
            Drawable drawable3 = this.f61r;
            if (drawable3 != null) {
                int i3 = this.f47d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f58o.setCompoundDrawables(this.f61r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f66w.setVisibility(0);
            z |= true;
        } else {
            this.f66w.setVisibility(8);
        }
        if (m34a(this.f44a)) {
            if (z) {
                button = this.f58o;
            } else if (z) {
                button = this.f62s;
            } else if (z) {
                button = this.f66w;
            }
            m33a(button);
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m32a(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f46c.findViewById(C0659f.scrollIndicatorUp);
        View findViewById2 = this.f46c.findViewById(C0659f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C0890v.m4746a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        View view2 = null;
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 == null || (i & 2) != 0) {
            view2 = findViewById2;
        } else {
            viewGroup.removeView(findViewById2);
        }
        if (findViewById != null || view2 != null) {
            if (this.f49f != null) {
                this.f25A.setOnScrollChangeListener(new C0013b(this, findViewById, view2));
                this.f25A.post(new C0014c(findViewById, view2));
                return;
            }
            ListView listView = this.f50g;
            if (listView != null) {
                listView.setOnScrollListener(new C0015d(this, findViewById, view2));
                this.f50g.post(new C0016e(findViewById, view2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (view2 != null) {
                viewGroup.removeView(view2);
            }
        }
    }

    /* renamed from: a */
    private void m33a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private static boolean m34a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0654a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: b */
    private void m35b(ViewGroup viewGroup) {
        this.f25A = (NestedScrollView) this.f46c.findViewById(C0659f.scrollView);
        this.f25A.setFocusable(false);
        this.f25A.setNestedScrollingEnabled(false);
        this.f30F = (TextView) viewGroup.findViewById(16908299);
        TextView textView = this.f30F;
        if (textView != null) {
            CharSequence charSequence = this.f49f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f25A.removeView(this.f30F);
            if (this.f50g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f25A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f25A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f50g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: c */
    private int m36c() {
        int i = this.f35K;
        return i == 0 ? this.f34J : this.f41Q == 1 ? i : this.f34J;
    }

    /* renamed from: c */
    private void m37c(ViewGroup viewGroup) {
        View view = this.f51h;
        boolean z = false;
        if (view == null) {
            view = this.f52i != 0 ? LayoutInflater.from(this.f44a).inflate(this.f52i, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m38c(view)) {
            this.f46c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f46c.findViewById(C0659f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f57n) {
                frameLayout.setPadding(this.f53j, this.f54k, this.f55l, this.f56m);
            }
            if (this.f50g != null) {
                ((C0168d0.C0169a) viewGroup.getLayoutParams()).f893a = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: c */
    static boolean m38c(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m38c(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m39d() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f46c.findViewById(C0659f.parentPanel);
        View findViewById4 = findViewById3.findViewById(C0659f.topPanel);
        View findViewById5 = findViewById3.findViewById(C0659f.contentPanel);
        View findViewById6 = findViewById3.findViewById(C0659f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C0659f.customPanel);
        m37c(viewGroup);
        View findViewById7 = viewGroup.findViewById(C0659f.topPanel);
        View findViewById8 = viewGroup.findViewById(C0659f.contentPanel);
        View findViewById9 = viewGroup.findViewById(C0659f.buttonPanel);
        ViewGroup a = m29a(findViewById7, findViewById4);
        ViewGroup a2 = m29a(findViewById8, findViewById5);
        ViewGroup a3 = m29a(findViewById9, findViewById6);
        m35b(a2);
        m31a(a3);
        m40d(a);
        char c = 0;
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (a == null || a.getVisibility() == 8) ? false : true;
        boolean z3 = (a3 == null || a3.getVisibility() == 8) ? false : true;
        if (!(z3 || a2 == null || (findViewById2 = a2.findViewById(C0659f.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f25A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f49f == null && this.f50g == null)) {
                view = a.findViewById(C0659f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(a2 == null || (findViewById = a2.findViewById(C0659f.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f50g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo40a(z2, z3);
        }
        if (!z) {
            View view2 = this.f50g;
            if (view2 == null) {
                view2 = this.f25A;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                m32a(a2, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f50g;
        if (listView2 != null && (listAdapter = this.f32H) != null) {
            listView2.setAdapter(listAdapter);
            int i = this.f33I;
            if (i > -1) {
                listView2.setItemChecked(i, true);
                listView2.setSelection(i);
            }
        }
    }

    /* renamed from: d */
    private void m40d(ViewGroup viewGroup) {
        if (this.f31G != null) {
            viewGroup.addView(this.f31G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f46c.findViewById(C0659f.title_template).setVisibility(8);
            return;
        }
        this.f28D = (ImageView) this.f46c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f48e)) || !this.f40P) {
            this.f46c.findViewById(C0659f.title_template).setVisibility(8);
            this.f28D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        this.f29E = (TextView) this.f46c.findViewById(C0659f.alertTitle);
        this.f29E.setText(this.f48e);
        int i = this.f26B;
        if (i != 0) {
            this.f28D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f27C;
        if (drawable != null) {
            this.f28D.setImageDrawable(drawable);
            return;
        }
        this.f29E.setPadding(this.f28D.getPaddingLeft(), this.f28D.getPaddingTop(), this.f28D.getPaddingRight(), this.f28D.getPaddingBottom());
        this.f28D.setVisibility(8);
    }

    /* renamed from: a */
    public int mo26a(int i) {
        TypedValue typedValue = new TypedValue();
        this.f44a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public ListView mo27a() {
        return this.f50g;
    }

    /* renamed from: a */
    public void mo28a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f42R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f67x = charSequence;
            this.f68y = message;
            this.f69z = drawable;
        } else if (i == -2) {
            this.f63t = charSequence;
            this.f64u = message;
            this.f65v = drawable;
        } else if (i == -1) {
            this.f59p = charSequence;
            this.f60q = message;
            this.f61r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: a */
    public void mo29a(Drawable drawable) {
        this.f27C = drawable;
        this.f26B = 0;
        ImageView imageView = this.f28D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f28D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: a */
    public void mo30a(View view) {
        this.f31G = view;
    }

    /* renamed from: a */
    public void mo31a(View view, int i, int i2, int i3, int i4) {
        this.f51h = view;
        this.f52i = 0;
        this.f57n = true;
        this.f53j = i;
        this.f54k = i2;
        this.f55l = i3;
        this.f56m = i4;
    }

    /* renamed from: a */
    public void mo32a(CharSequence charSequence) {
        this.f49f = charSequence;
        TextView textView = this.f30F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    public boolean mo33a(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f25A;
        return nestedScrollView != null && nestedScrollView.mo2035a(keyEvent);
    }

    /* renamed from: b */
    public void mo34b() {
        this.f45b.setContentView(m36c());
        m39d();
    }

    /* renamed from: b */
    public void mo35b(int i) {
        this.f27C = null;
        this.f26B = i;
        ImageView imageView = this.f28D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f28D.setImageResource(this.f26B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: b */
    public void mo36b(View view) {
        this.f51h = view;
        this.f52i = 0;
        this.f57n = false;
    }

    /* renamed from: b */
    public void mo37b(CharSequence charSequence) {
        this.f48e = charSequence;
        TextView textView = this.f29E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: b */
    public boolean mo38b(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f25A;
        return nestedScrollView != null && nestedScrollView.mo2035a(keyEvent);
    }

    /* renamed from: c */
    public void mo39c(int i) {
        this.f51h = null;
        this.f52i = i;
        this.f57n = false;
    }
}
