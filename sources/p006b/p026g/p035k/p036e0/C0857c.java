package p006b.p026g.p035k.p036e0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p006b.p026g.C0778b;
import p006b.p026g.p035k.p036e0.C0865f;
import p190io.objectbox.BoxStoreBuilder;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: b.g.k.e0.c */
public class C0857c {

    /* renamed from: d */
    private static int f3290d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f3291a;

    /* renamed from: b */
    public int f3292b = -1;

    /* renamed from: c */
    private int f3293c = -1;

    /* renamed from: b.g.k.e0.c$a */
    public static class C0858a {

        /* renamed from: e */
        public static final C0858a f3294e = new C0858a(16, (CharSequence) null);

        /* renamed from: f */
        public static final C0858a f3295f = new C0858a(262144, (CharSequence) null);

        /* renamed from: g */
        public static final C0858a f3296g = new C0858a(524288, (CharSequence) null);

        /* renamed from: h */
        public static final C0858a f3297h = new C0858a(BoxStoreBuilder.DEFAULT_MAX_DB_SIZE_KBYTE, (CharSequence) null);

        /* renamed from: a */
        final Object f3298a;

        /* renamed from: b */
        private final int f3299b;

        /* renamed from: c */
        private final Class<? extends C0865f.C0866a> f3300c;

        /* renamed from: d */
        protected final C0865f f3301d;

        static {
            Class<C0865f.C0868c> cls = C0865f.C0868c.class;
            Class<C0865f.C0867b> cls2 = C0865f.C0867b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new C0858a(1, (CharSequence) null);
            new C0858a(2, (CharSequence) null);
            new C0858a(4, (CharSequence) null);
            new C0858a(8, (CharSequence) null);
            new C0858a(32, (CharSequence) null);
            new C0858a(64, (CharSequence) null);
            new C0858a(PropertyFlags.ID_SELF_ASSIGNABLE, (CharSequence) null);
            new C0858a(PropertyFlags.INDEX_PARTIAL_SKIP_NULL, (CharSequence) null, cls2);
            new C0858a(PropertyFlags.INDEX_PARTIAL_SKIP_ZERO, (CharSequence) null, cls2);
            new C0858a(PropertyFlags.VIRTUAL, (CharSequence) null, cls);
            new C0858a(PropertyFlags.INDEX_HASH, (CharSequence) null, cls);
            new C0858a(PropertyFlags.INDEX_HASH64, (CharSequence) null);
            new C0858a(8192, (CharSequence) null);
            new C0858a(16384, (CharSequence) null);
            new C0858a(32768, (CharSequence) null);
            new C0858a(65536, (CharSequence) null);
            new C0858a(131072, (CharSequence) null, C0865f.C0872g.class);
            new C0858a(2097152, (CharSequence) null, C0865f.C0873h.class);
            new C0858a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (C0865f) null, (Class<? extends C0865f.C0866a>) null);
            new C0858a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (C0865f) null, C0865f.C0870e.class);
            new C0858a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (C0865f) null, (Class<? extends C0865f.C0866a>) null);
            new C0858a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (C0865f) null, (Class<? extends C0865f.C0866a>) null);
            new C0858a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (C0865f) null, (Class<? extends C0865f.C0866a>) null);
            new C0858a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (C0865f) null, (Class<? extends C0865f.C0866a>) null);
            new C0858a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (C0865f) null, (Class<? extends C0865f.C0866a>) null);
            new C0858a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (C0865f) null, C0865f.C0871f.class);
            new C0858a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (C0865f) null, C0865f.C0869d.class);
            new C0858a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (C0865f) null, (Class<? extends C0865f.C0866a>) null);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new C0858a(accessibilityAction, 16908357, (CharSequence) null, (C0865f) null, (Class<? extends C0865f.C0866a>) null);
        }

        public C0858a(int i, CharSequence charSequence) {
            this((Object) null, i, charSequence, (C0865f) null, (Class<? extends C0865f.C0866a>) null);
        }

        private C0858a(int i, CharSequence charSequence, Class<? extends C0865f.C0866a> cls) {
            this((Object) null, i, charSequence, (C0865f) null, cls);
        }

        C0858a(Object obj, int i, CharSequence charSequence, C0865f fVar, Class<? extends C0865f.C0866a> cls) {
            this.f3299b = i;
            this.f3301d = fVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            }
            this.f3298a = obj;
            this.f3300c = cls;
        }

        /* renamed from: a */
        public int mo4638a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f3298a).getId();
            }
            return 0;
        }

        /* renamed from: a */
        public C0858a mo4639a(CharSequence charSequence, C0865f fVar) {
            return new C0858a((Object) null, this.f3299b, charSequence, fVar, this.f3300c);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo4640a(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                b.g.k.e0.f r0 = r4.f3301d
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends b.g.k.e0.f$a> r2 = r4.f3300c
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                b.g.k.e0.f$a r1 = (p006b.p026g.p035k.p036e0.C0865f.C0866a) r1     // Catch:{ Exception -> 0x0020 }
                r1.mo4651a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends b.g.k.e0.f$a> r1 = r4.f3300c
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                b.g.k.e0.f r6 = r4.f3301d
                boolean r5 = r6.mo4650a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p006b.p026g.p035k.p036e0.C0857c.C0858a.mo4640a(android.view.View, android.os.Bundle):boolean");
        }
    }

    /* renamed from: b.g.k.e0.c$b */
    public static class C0859b {

        /* renamed from: a */
        final Object f3302a;

        C0859b(Object obj) {
            this.f3302a = obj;
        }

        /* renamed from: a */
        public static C0859b m4674a(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            return i4 >= 21 ? new C0859b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3)) : i4 >= 19 ? new C0859b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new C0859b((Object) null);
        }
    }

    /* renamed from: b.g.k.e0.c$c */
    public static class C0860c {

        /* renamed from: a */
        final Object f3303a;

        C0860c(Object obj) {
            this.f3303a = obj;
        }

        /* renamed from: a */
        public static C0860c m4675a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 21 ? new C0860c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : i5 >= 19 ? new C0860c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new C0860c((Object) null);
        }
    }

    private C0857c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f3291a = accessibilityNodeInfo;
    }

    /* renamed from: a */
    private int m4599a(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f3290d;
        f3290d = i2 + 1;
        return i2;
    }

    /* renamed from: a */
    public static C0857c m4600a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0857c(accessibilityNodeInfo);
    }

    /* renamed from: a */
    public static C0857c m4601a(C0857c cVar) {
        return m4600a(AccessibilityNodeInfo.obtain(cVar.f3291a));
    }

    /* renamed from: a */
    private List<Integer> m4602a(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f3291a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f3291a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private void m4603a(int i, boolean z) {
        Bundle e = mo4605e();
        if (e != null) {
            int i2 = e.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            e.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: a */
    private void m4604a(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m4602a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m4602a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m4602a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m4602a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: b */
    private SparseArray<WeakReference<ClickableSpan>> m4605b(View view) {
        SparseArray<WeakReference<ClickableSpan>> c = m4607c(view);
        if (c != null) {
            return c;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C0778b.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    /* renamed from: b */
    private static String m4606b(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case PropertyFlags.ID_SELF_ASSIGNABLE /*128*/:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case PropertyFlags.INDEX_PARTIAL_SKIP_NULL /*256*/:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case PropertyFlags.INDEX_PARTIAL_SKIP_ZERO /*512*/:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case PropertyFlags.VIRTUAL /*1024*/:
                return "ACTION_NEXT_HTML_ELEMENT";
            case PropertyFlags.INDEX_HASH /*2048*/:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case PropertyFlags.INDEX_HASH64 /*4096*/:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    /* renamed from: c */
    private SparseArray<WeakReference<ClickableSpan>> m4607c(View view) {
        return (SparseArray) view.getTag(C0778b.tag_accessibility_clickable_spans);
    }

    /* renamed from: c */
    private boolean m4608c(int i) {
        Bundle e = mo4605e();
        return e != null && (e.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    /* renamed from: d */
    public static C0857c m4609d(View view) {
        return m4600a(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: e */
    private void m4610e(View view) {
        SparseArray<WeakReference<ClickableSpan>> c = m4607c(view);
        if (c != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < c.size(); i++) {
                if (c.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                c.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: h */
    public static ClickableSpan[] m4611h(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: v */
    private void m4612v() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3291a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f3291a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f3291a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f3291a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    /* renamed from: w */
    private boolean m4613w() {
        return !m4602a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: x */
    public static C0857c m4614x() {
        return m4600a(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: a */
    public int mo4579a() {
        return this.f3291a.getActions();
    }

    /* renamed from: a */
    public void mo4580a(int i) {
        this.f3291a.addAction(i);
    }

    /* renamed from: a */
    public void mo4581a(Rect rect) {
        this.f3291a.getBoundsInParent(rect);
    }

    /* renamed from: a */
    public void mo4582a(View view) {
        this.f3292b = -1;
        this.f3291a.setParent(view);
    }

    /* renamed from: a */
    public void mo4583a(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3291a.addChild(view, i);
        }
    }

    /* renamed from: a */
    public void mo4584a(C0858a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3291a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f3298a);
        }
    }

    /* renamed from: a */
    public void mo4585a(CharSequence charSequence) {
        this.f3291a.setClassName(charSequence);
    }

    /* renamed from: a */
    public void mo4586a(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19 && i < 26) {
            m4612v();
            m4610e(view);
            ClickableSpan[] h = m4611h(charSequence);
            if (h != null && h.length > 0) {
                mo4605e().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C0778b.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> b = m4605b(view);
                int i2 = 0;
                while (h != null && i2 < h.length) {
                    int a = m4599a(h[i2], b);
                    b.put(a, new WeakReference(h[i2]));
                    m4604a(h[i2], (Spanned) charSequence, a);
                    i2++;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4587a(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3291a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C0859b) obj).f3302a);
        }
    }

    /* renamed from: a */
    public void mo4588a(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3291a.setAccessibilityFocused(z);
        }
    }

    /* renamed from: a */
    public boolean mo4589a(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f3291a.performAction(i, bundle);
        }
        return false;
    }

    /* renamed from: b */
    public int mo4590b() {
        return this.f3291a.getChildCount();
    }

    /* renamed from: b */
    public void mo4591b(Rect rect) {
        this.f3291a.getBoundsInScreen(rect);
    }

    /* renamed from: b */
    public void mo4592b(View view, int i) {
        this.f3292b = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3291a.setParent(view, i);
        }
    }

    /* renamed from: b */
    public void mo4593b(CharSequence charSequence) {
        this.f3291a.setContentDescription(charSequence);
    }

    /* renamed from: b */
    public void mo4594b(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3291a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0860c) obj).f3303a);
        }
    }

    /* renamed from: b */
    public void mo4595b(boolean z) {
        this.f3291a.setCheckable(z);
    }

    /* renamed from: c */
    public CharSequence mo4596c() {
        return this.f3291a.getClassName();
    }

    /* renamed from: c */
    public void mo4597c(Rect rect) {
        this.f3291a.setBoundsInParent(rect);
    }

    /* renamed from: c */
    public void mo4598c(View view, int i) {
        this.f3293c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3291a.setSource(view, i);
        }
    }

    /* renamed from: c */
    public void mo4599c(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3291a.setError(charSequence);
        }
    }

    /* renamed from: c */
    public void mo4600c(boolean z) {
        this.f3291a.setChecked(z);
    }

    /* renamed from: d */
    public CharSequence mo4601d() {
        return this.f3291a.getContentDescription();
    }

    /* renamed from: d */
    public void mo4602d(Rect rect) {
        this.f3291a.setBoundsInScreen(rect);
    }

    /* renamed from: d */
    public void mo4603d(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f3291a.setHintText(charSequence);
        } else if (i >= 19) {
            this.f3291a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: d */
    public void mo4604d(boolean z) {
        this.f3291a.setClickable(z);
    }

    /* renamed from: e */
    public Bundle mo4605e() {
        return Build.VERSION.SDK_INT >= 19 ? this.f3291a.getExtras() : new Bundle();
    }

    /* renamed from: e */
    public void mo4606e(CharSequence charSequence) {
        this.f3291a.setPackageName(charSequence);
    }

    /* renamed from: e */
    public void mo4607e(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3291a.setContentInvalid(z);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0857c.class != obj.getClass()) {
            return false;
        }
        C0857c cVar = (C0857c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3291a;
        if (accessibilityNodeInfo == null) {
            if (cVar.f3291a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f3291a)) {
            return false;
        }
        return this.f3293c == cVar.f3293c && this.f3292b == cVar.f3292b;
    }

    /* renamed from: f */
    public CharSequence mo4609f() {
        return this.f3291a.getPackageName();
    }

    /* renamed from: f */
    public void mo4610f(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f3291a.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f3291a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: f */
    public void mo4611f(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3291a.setDismissable(z);
        }
    }

    /* renamed from: g */
    public CharSequence mo4612g() {
        if (!m4613w()) {
            return this.f3291a.getText();
        }
        List<Integer> a = m4602a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> a2 = m4602a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> a3 = m4602a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> a4 = m4602a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f3291a.getText(), 0, this.f3291a.getText().length()));
        for (int i = 0; i < a.size(); i++) {
            spannableString.setSpan(new C0855a(a4.get(i).intValue(), this, mo4605e().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), a.get(i).intValue(), a2.get(i).intValue(), a3.get(i).intValue());
        }
        return spannableString;
    }

    /* renamed from: g */
    public void mo4613g(CharSequence charSequence) {
        this.f3291a.setText(charSequence);
    }

    /* renamed from: g */
    public void mo4614g(boolean z) {
        this.f3291a.setEnabled(z);
    }

    /* renamed from: h */
    public String mo4615h() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f3291a.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: h */
    public void mo4616h(boolean z) {
        this.f3291a.setFocusable(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3291a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public void mo4618i(boolean z) {
        this.f3291a.setFocused(z);
    }

    /* renamed from: i */
    public boolean mo4619i() {
        return this.f3291a.isCheckable();
    }

    /* renamed from: j */
    public void mo4620j(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3291a.setHeading(z);
        } else {
            m4603a(2, z);
        }
    }

    /* renamed from: j */
    public boolean mo4621j() {
        return this.f3291a.isChecked();
    }

    /* renamed from: k */
    public void mo4622k(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3291a.setScreenReaderFocusable(z);
        } else {
            m4603a(1, z);
        }
    }

    /* renamed from: k */
    public boolean mo4623k() {
        return this.f3291a.isClickable();
    }

    /* renamed from: l */
    public void mo4624l(boolean z) {
        this.f3291a.setScrollable(z);
    }

    /* renamed from: l */
    public boolean mo4625l() {
        return this.f3291a.isEnabled();
    }

    /* renamed from: m */
    public void mo4626m(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3291a.setShowingHintText(z);
        } else {
            m4603a(4, z);
        }
    }

    /* renamed from: m */
    public boolean mo4627m() {
        return this.f3291a.isFocusable();
    }

    /* renamed from: n */
    public void mo4628n(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3291a.setVisibleToUser(z);
        }
    }

    /* renamed from: n */
    public boolean mo4629n() {
        return this.f3291a.isFocused();
    }

    /* renamed from: o */
    public boolean mo4630o() {
        return this.f3291a.isLongClickable();
    }

    /* renamed from: p */
    public boolean mo4631p() {
        return this.f3291a.isPassword();
    }

    /* renamed from: q */
    public boolean mo4632q() {
        return this.f3291a.isScrollable();
    }

    /* renamed from: r */
    public boolean mo4633r() {
        return this.f3291a.isSelected();
    }

    /* renamed from: s */
    public boolean mo4634s() {
        return Build.VERSION.SDK_INT >= 26 ? this.f3291a.isShowingHintText() : m4608c(4);
    }

    /* renamed from: t */
    public void mo4635t() {
        this.f3291a.recycle();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo4581a(rect);
        sb.append("; boundsInParent: " + rect);
        mo4591b(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(mo4609f());
        sb.append("; className: ");
        sb.append(mo4596c());
        sb.append("; text: ");
        sb.append(mo4612g());
        sb.append("; contentDescription: ");
        sb.append(mo4601d());
        sb.append("; viewId: ");
        sb.append(mo4615h());
        sb.append("; checkable: ");
        sb.append(mo4619i());
        sb.append("; checked: ");
        sb.append(mo4621j());
        sb.append("; focusable: ");
        sb.append(mo4627m());
        sb.append("; focused: ");
        sb.append(mo4629n());
        sb.append("; selected: ");
        sb.append(mo4633r());
        sb.append("; clickable: ");
        sb.append(mo4623k());
        sb.append("; longClickable: ");
        sb.append(mo4630o());
        sb.append("; enabled: ");
        sb.append(mo4625l());
        sb.append("; password: ");
        sb.append(mo4631p());
        sb.append("; scrollable: " + mo4632q());
        sb.append("; [");
        int a = mo4579a();
        while (a != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(a);
            a &= ~numberOfTrailingZeros;
            sb.append(m4606b(numberOfTrailingZeros));
            if (a != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public AccessibilityNodeInfo mo4637u() {
        return this.f3291a;
    }
}
