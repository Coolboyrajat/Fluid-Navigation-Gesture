package p006b.p007a.p014o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0086j;
import androidx.appcompat.view.menu.C0088k;
import androidx.appcompat.widget.C0217r0;
import androidx.appcompat.widget.C0249z;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p006b.p007a.C0663j;
import p006b.p026g.p028e.p029a.C0794a;
import p006b.p026g.p035k.C0841b;
import p006b.p026g.p035k.C0876h;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: b.a.o.g */
public class C0692g extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f2704e = {Context.class};

    /* renamed from: f */
    static final Class<?>[] f2705f = f2704e;

    /* renamed from: a */
    final Object[] f2706a;

    /* renamed from: b */
    final Object[] f2707b = this.f2706a;

    /* renamed from: c */
    Context f2708c;

    /* renamed from: d */
    private Object f2709d;

    /* renamed from: b.a.o.g$a */
    private static class C0693a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class<?>[] f2710c = {MenuItem.class};

        /* renamed from: a */
        private Object f2711a;

        /* renamed from: b */
        private Method f2712b;

        public C0693a(Object obj, String str) {
            this.f2711a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f2712b = cls.getMethod(str, f2710c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f2712b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f2712b.invoke(this.f2711a, new Object[]{menuItem})).booleanValue();
                }
                this.f2712b.invoke(this.f2711a, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: b.a.o.g$b */
    private class C0694b {

        /* renamed from: A */
        C0841b f2713A;

        /* renamed from: B */
        private CharSequence f2714B;

        /* renamed from: C */
        private CharSequence f2715C;

        /* renamed from: D */
        private ColorStateList f2716D = null;

        /* renamed from: E */
        private PorterDuff.Mode f2717E = null;

        /* renamed from: a */
        private Menu f2719a;

        /* renamed from: b */
        private int f2720b;

        /* renamed from: c */
        private int f2721c;

        /* renamed from: d */
        private int f2722d;

        /* renamed from: e */
        private int f2723e;

        /* renamed from: f */
        private boolean f2724f;

        /* renamed from: g */
        private boolean f2725g;

        /* renamed from: h */
        private boolean f2726h;

        /* renamed from: i */
        private int f2727i;

        /* renamed from: j */
        private int f2728j;

        /* renamed from: k */
        private CharSequence f2729k;

        /* renamed from: l */
        private CharSequence f2730l;

        /* renamed from: m */
        private int f2731m;

        /* renamed from: n */
        private char f2732n;

        /* renamed from: o */
        private int f2733o;

        /* renamed from: p */
        private char f2734p;

        /* renamed from: q */
        private int f2735q;

        /* renamed from: r */
        private int f2736r;

        /* renamed from: s */
        private boolean f2737s;

        /* renamed from: t */
        private boolean f2738t;

        /* renamed from: u */
        private boolean f2739u;

        /* renamed from: v */
        private int f2740v;

        /* renamed from: w */
        private int f2741w;

        /* renamed from: x */
        private String f2742x;

        /* renamed from: y */
        private String f2743y;

        /* renamed from: z */
        private String f2744z;

        public C0694b(Menu menu) {
            this.f2719a = menu;
            mo3931d();
        }

        /* renamed from: a */
        private char m3826a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        private <T> T m3827a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C0692g.this.f2708c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: a */
        private void m3828a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f2737s).setVisible(this.f2738t).setEnabled(this.f2739u).setCheckable(this.f2736r >= 1).setTitleCondensed(this.f2730l).setIcon(this.f2731m);
            int i = this.f2740v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f2744z != null) {
                if (!C0692g.this.f2708c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C0693a(C0692g.this.mo3923a(), this.f2744z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z2 = menuItem instanceof C0086j;
            if (z2) {
                C0086j jVar = (C0086j) menuItem;
            }
            if (this.f2736r >= 2) {
                if (z2) {
                    ((C0086j) menuItem).mo529c(true);
                } else if (menuItem instanceof C0088k) {
                    ((C0088k) menuItem).mo578a(true);
                }
            }
            String str = this.f2742x;
            if (str != null) {
                menuItem.setActionView((View) m3827a(str, C0692g.f2704e, C0692g.this.f2706a));
                z = true;
            }
            int i2 = this.f2741w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C0841b bVar = this.f2713A;
            if (bVar != null) {
                C0876h.m4690a(menuItem, bVar);
            }
            C0876h.m4694a(menuItem, this.f2714B);
            C0876h.m4696b(menuItem, this.f2715C);
            C0876h.m4691a(menuItem, this.f2732n, this.f2733o);
            C0876h.m4695b(menuItem, this.f2734p, this.f2735q);
            PorterDuff.Mode mode = this.f2717E;
            if (mode != null) {
                C0876h.m4693a(menuItem, mode);
            }
            ColorStateList colorStateList = this.f2716D;
            if (colorStateList != null) {
                C0876h.m4692a(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void mo3926a() {
            this.f2726h = true;
            m3828a(this.f2719a.add(this.f2720b, this.f2727i, this.f2728j, this.f2729k));
        }

        /* renamed from: a */
        public void mo3927a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0692g.this.f2708c.obtainStyledAttributes(attributeSet, C0663j.MenuGroup);
            this.f2720b = obtainStyledAttributes.getResourceId(C0663j.MenuGroup_android_id, 0);
            this.f2721c = obtainStyledAttributes.getInt(C0663j.MenuGroup_android_menuCategory, 0);
            this.f2722d = obtainStyledAttributes.getInt(C0663j.MenuGroup_android_orderInCategory, 0);
            this.f2723e = obtainStyledAttributes.getInt(C0663j.MenuGroup_android_checkableBehavior, 0);
            this.f2724f = obtainStyledAttributes.getBoolean(C0663j.MenuGroup_android_visible, true);
            this.f2725g = obtainStyledAttributes.getBoolean(C0663j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        public SubMenu mo3928b() {
            this.f2726h = true;
            SubMenu addSubMenu = this.f2719a.addSubMenu(this.f2720b, this.f2727i, this.f2728j, this.f2729k);
            m3828a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: b */
        public void mo3929b(AttributeSet attributeSet) {
            C0217r0 a = C0217r0.m1053a(C0692g.this.f2708c, attributeSet, C0663j.MenuItem);
            this.f2727i = a.mo1544g(C0663j.MenuItem_android_id, 0);
            this.f2728j = (a.mo1538d(C0663j.MenuItem_android_menuCategory, this.f2721c) & -65536) | (a.mo1538d(C0663j.MenuItem_android_orderInCategory, this.f2722d) & 65535);
            this.f2729k = a.mo1541e(C0663j.MenuItem_android_title);
            this.f2730l = a.mo1541e(C0663j.MenuItem_android_titleCondensed);
            this.f2731m = a.mo1544g(C0663j.MenuItem_android_icon, 0);
            this.f2732n = m3826a(a.mo1539d(C0663j.MenuItem_android_alphabeticShortcut));
            this.f2733o = a.mo1538d(C0663j.MenuItem_alphabeticModifiers, PropertyFlags.INDEX_HASH64);
            this.f2734p = m3826a(a.mo1539d(C0663j.MenuItem_android_numericShortcut));
            this.f2735q = a.mo1538d(C0663j.MenuItem_numericModifiers, PropertyFlags.INDEX_HASH64);
            this.f2736r = a.mo1545g(C0663j.MenuItem_android_checkable) ? a.mo1532a(C0663j.MenuItem_android_checkable, false) : this.f2723e;
            this.f2737s = a.mo1532a(C0663j.MenuItem_android_checked, false);
            this.f2738t = a.mo1532a(C0663j.MenuItem_android_visible, this.f2724f);
            this.f2739u = a.mo1532a(C0663j.MenuItem_android_enabled, this.f2725g);
            this.f2740v = a.mo1538d(C0663j.MenuItem_showAsAction, -1);
            this.f2744z = a.mo1539d(C0663j.MenuItem_android_onClick);
            this.f2741w = a.mo1544g(C0663j.MenuItem_actionLayout, 0);
            this.f2742x = a.mo1539d(C0663j.MenuItem_actionViewClass);
            this.f2743y = a.mo1539d(C0663j.MenuItem_actionProviderClass);
            boolean z = this.f2743y != null;
            if (z && this.f2741w == 0 && this.f2742x == null) {
                this.f2713A = (C0841b) m3827a(this.f2743y, C0692g.f2705f, C0692g.this.f2707b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f2713A = null;
            }
            this.f2714B = a.mo1541e(C0663j.MenuItem_contentDescription);
            this.f2715C = a.mo1541e(C0663j.MenuItem_tooltipText);
            if (a.mo1545g(C0663j.MenuItem_iconTintMode)) {
                this.f2717E = C0249z.m1265a(a.mo1538d(C0663j.MenuItem_iconTintMode, -1), this.f2717E);
            } else {
                this.f2717E = null;
            }
            if (a.mo1545g(C0663j.MenuItem_iconTint)) {
                this.f2716D = a.mo1529a(C0663j.MenuItem_iconTint);
            } else {
                this.f2716D = null;
            }
            a.mo1531a();
            this.f2726h = false;
        }

        /* renamed from: c */
        public boolean mo3930c() {
            return this.f2726h;
        }

        /* renamed from: d */
        public void mo3931d() {
            this.f2720b = 0;
            this.f2721c = 0;
            this.f2722d = 0;
            this.f2723e = 0;
            this.f2724f = true;
            this.f2725g = true;
        }
    }

    public C0692g(Context context) {
        super(context);
        this.f2708c = context;
        this.f2706a = new Object[]{context};
    }

    /* renamed from: a */
    private Object m3823a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m3823a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: a */
    private void m3824a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C0694b bVar = new C0694b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        int i = eventType;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.mo3931d();
                        } else if (name2.equals("item")) {
                            if (!bVar.mo3930c()) {
                                C0841b bVar2 = bVar.f2713A;
                                if (bVar2 == null || !bVar2.mo634a()) {
                                    bVar.mo3926a();
                                } else {
                                    bVar.mo3928b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.mo3927a(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.mo3929b(attributeSet);
                    } else if (name3.equals("menu")) {
                        m3824a(xmlPullParser, attributeSet, bVar.mo3928b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                i = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo3923a() {
        if (this.f2709d == null) {
            this.f2709d = m3823a(this.f2708c);
        }
        return this.f2709d;
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof C0794a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f2708c.getResources().getLayout(i);
            m3824a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
