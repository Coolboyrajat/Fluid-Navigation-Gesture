package p006b.p007a.p014o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p006b.p007a.C0662i;

/* renamed from: b.a.o.d */
public class C0688d extends ContextWrapper {

    /* renamed from: a */
    private int f2687a;

    /* renamed from: b */
    private Resources.Theme f2688b;

    /* renamed from: c */
    private LayoutInflater f2689c;

    /* renamed from: d */
    private Configuration f2690d;

    /* renamed from: e */
    private Resources f2691e;

    public C0688d() {
        super((Context) null);
    }

    public C0688d(Context context, int i) {
        super(context);
        this.f2687a = i;
    }

    public C0688d(Context context, Resources.Theme theme) {
        super(context);
        this.f2688b = theme;
    }

    /* renamed from: b */
    private Resources m3797b() {
        Resources resources;
        if (this.f2691e == null) {
            Configuration configuration = this.f2690d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            }
            this.f2691e = resources;
        }
        return this.f2691e;
    }

    /* renamed from: c */
    private void m3798c() {
        boolean z = this.f2688b == null;
        if (z) {
            this.f2688b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2688b.setTo(theme);
            }
        }
        mo3898a(this.f2688b, this.f2687a, z);
    }

    /* renamed from: a */
    public int mo3897a() {
        return this.f2687a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3898a(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return m3797b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2689c == null) {
            this.f2689c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2689c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2688b;
        if (theme != null) {
            return theme;
        }
        if (this.f2687a == 0) {
            this.f2687a = C0662i.Theme_AppCompat_Light;
        }
        m3798c();
        return this.f2688b;
    }

    public void setTheme(int i) {
        if (this.f2687a != i) {
            this.f2687a = i;
            m3798c();
        }
    }
}
