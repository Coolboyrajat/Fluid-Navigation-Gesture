package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.C0011c;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.C0276a;
import androidx.lifecycle.C0474c0;
import androidx.lifecycle.C0476d0;
import androidx.lifecycle.C0481i;
import androidx.lifecycle.C0491p;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p006b.p021d.C0737h;
import p006b.p046l.p047a.C0934a;

/* renamed from: androidx.fragment.app.d */
public class C0401d extends ComponentActivity implements C0276a.C0278b, C0276a.C0280d {

    /* renamed from: l */
    final C0405g f1806l = C0405g.m2069a((C0407i<?>) new C0402a());

    /* renamed from: m */
    final C0491p f1807m = new C0491p(this);

    /* renamed from: n */
    boolean f1808n;

    /* renamed from: o */
    boolean f1809o;

    /* renamed from: p */
    boolean f1810p = true;

    /* renamed from: q */
    boolean f1811q;

    /* renamed from: r */
    boolean f1812r;

    /* renamed from: s */
    boolean f1813s;

    /* renamed from: t */
    int f1814t;

    /* renamed from: u */
    C0737h<String> f1815u;

    /* renamed from: androidx.fragment.app.d$a */
    class C0402a extends C0407i<C0401d> implements C0476d0, C0011c {
        public C0402a() {
            super(C0401d.this);
        }

        /* renamed from: a */
        public View mo2318a(int i) {
            return C0401d.this.findViewById(i);
        }

        /* renamed from: a */
        public C0481i mo5a() {
            return C0401d.this.f1807m;
        }

        /* renamed from: a */
        public void mo2382a(Fragment fragment) {
            C0401d.this.mo2360a(fragment);
        }

        /* renamed from: a */
        public void mo2383a(Fragment fragment, Intent intent, int i, Bundle bundle) {
            C0401d.this.mo2361a(fragment, intent, i, bundle);
        }

        /* renamed from: a */
        public void mo2384a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            C0401d.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: b */
        public boolean mo2319b() {
            Window window = C0401d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: b */
        public boolean mo2385b(Fragment fragment) {
            return !C0401d.this.isFinishing();
        }

        /* renamed from: f */
        public OnBackPressedDispatcher mo6f() {
            return C0401d.this.mo6f();
        }

        /* renamed from: g */
        public C0401d m2061g() {
            return C0401d.this;
        }

        /* renamed from: h */
        public C0474c0 mo8h() {
            return C0401d.this.mo8h();
        }

        /* renamed from: i */
        public LayoutInflater mo2387i() {
            return C0401d.this.getLayoutInflater().cloneInContext(C0401d.this);
        }

        /* renamed from: j */
        public void mo2388j() {
            C0401d.this.mo125m();
        }
    }

    /* renamed from: a */
    private static boolean m2040a(C0411l lVar, C0481i.C0483b bVar) {
        boolean z = false;
        for (Fragment next : lVar.mo2513q()) {
            if (next != null) {
                if (next.mo5a().mo2700a().mo2703a(C0481i.C0483b.STARTED)) {
                    next.f1729V.mo2709b(bVar);
                    z = true;
                }
                if (next.mo2201H() != null) {
                    z |= m2040a(next.mo2192A(), bVar);
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    private int m2041b(Fragment fragment) {
        if (this.f1815u.mo4217b() < 65534) {
            while (this.f1815u.mo4218b(this.f1814t) >= 0) {
                this.f1814t = (this.f1814t + 1) % 65534;
            }
            int i = this.f1814t;
            this.f1815u.mo4221c(i, fragment.f1738j);
            this.f1814t = (this.f1814t + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    /* renamed from: b */
    static void m2042b(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* renamed from: n */
    private void mo126n() {
        do {
        } while (m2040a(mo2364k(), C0481i.C0483b.CREATED));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo2359a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1806l.mo2406a(view, str, context, attributeSet);
    }

    /* renamed from: a */
    public final void mo1893a(int i) {
        if (!this.f1811q && i != -1) {
            m2042b(i);
        }
    }

    /* renamed from: a */
    public void mo2360a(Fragment fragment) {
    }

    /* renamed from: a */
    public void mo2361a(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        this.f1813s = true;
        if (i == -1) {
            try {
                C0276a.m1423a(this, intent, -1, bundle);
            } finally {
                this.f1813s = false;
            }
        } else {
            m2042b(i);
            C0276a.m1423a(this, intent, ((m2041b(fragment) + 1) << 16) + (i & 65535), bundle);
            this.f1813s = false;
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public boolean mo2362a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f1808n);
        printWriter.print(" mResumed=");
        printWriter.print(this.f1809o);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1810p);
        if (getApplication() != null) {
            C0934a.m4996a(this).mo4785a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f1806l.mo2427j().mo2469a(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: k */
    public C0411l mo2364k() {
        return this.f1806l.mo2427j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo2365l() {
        this.f1807m.mo2707a(C0481i.C0482a.ON_RESUME);
        this.f1806l.mo2423f();
    }

    @Deprecated
    /* renamed from: m */
    public void mo125m() {
        invalidateOptionsMenu();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f1806l.mo2428k();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String a = this.f1815u.mo4214a(i4);
            this.f1815u.mo4223d(i4);
            if (a == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a2 = this.f1806l.mo2407a(a);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a);
                return;
            }
            a2.mo2226a(i & 65535, i2, intent);
            return;
        }
        C0276a.C0279c a3 = C0276a.m1421a();
        if (a3 == null || !a3.mo1891a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1806l.mo2428k();
        this.f1806l.mo2409a(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f1806l.mo2412a((Fragment) null);
        if (bundle != null) {
            this.f1806l.mo2410a(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f1814t = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f1815u = new C0737h<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f1815u.mo4221c(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f1815u == null) {
            this.f1815u = new C0737h<>();
            this.f1814t = 0;
        }
        super.onCreate(bundle);
        this.f1807m.mo2707a(C0481i.C0482a.ON_CREATE);
        this.f1806l.mo2416b();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.f1806l.mo2414a(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo2359a(view, str, context, attributeSet);
        return a == null ? super.onCreateView(view, str, context, attributeSet) : a;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a = mo2359a((View) null, str, context, attributeSet);
        return a == null ? super.onCreateView(str, context, attributeSet) : a;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f1806l.mo2420c();
        this.f1807m.mo2707a(C0481i.C0482a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f1806l.mo2421d();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f1806l.mo2419b(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f1806l.mo2415a(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f1806l.mo2413a(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f1806l.mo2428k();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f1806l.mo2411a(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f1809o = false;
        this.f1806l.mo2422e();
        this.f1807m.mo2707a(C0481i.C0482a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f1806l.mo2417b(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo2365l();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? mo2362a(view, menu) | this.f1806l.mo2418b(menu) : super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f1806l.mo2428k();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String a = this.f1815u.mo4214a(i3);
            this.f1815u.mo4223d(i3);
            if (a == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a2 = this.f1806l.mo2407a(a);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a);
                return;
            }
            a2.mo2227a(i & 65535, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f1809o = true;
        this.f1806l.mo2428k();
        this.f1806l.mo2426i();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo126n();
        this.f1807m.mo2707a(C0481i.C0482a.ON_STOP);
        Parcelable l = this.f1806l.mo2429l();
        if (l != null) {
            bundle.putParcelable("android:support:fragments", l);
        }
        if (this.f1815u.mo4217b() > 0) {
            bundle.putInt("android:support:next_request_index", this.f1814t);
            int[] iArr = new int[this.f1815u.mo4217b()];
            String[] strArr = new String[this.f1815u.mo4217b()];
            for (int i = 0; i < this.f1815u.mo4217b(); i++) {
                iArr[i] = this.f1815u.mo4220c(i);
                strArr[i] = this.f1815u.mo4224e(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f1810p = false;
        if (!this.f1808n) {
            this.f1808n = true;
            this.f1806l.mo2408a();
        }
        this.f1806l.mo2428k();
        this.f1806l.mo2426i();
        this.f1807m.mo2707a(C0481i.C0482a.ON_START);
        this.f1806l.mo2424g();
    }

    public void onStateNotSaved() {
        this.f1806l.mo2428k();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f1810p = true;
        mo126n();
        this.f1806l.mo2425h();
        this.f1807m.mo2707a(C0481i.C0482a.ON_STOP);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (!this.f1813s && i != -1) {
            m2042b(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (!this.f1813s && i != -1) {
            m2042b(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.f1812r && i != -1) {
            m2042b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.f1812r && i != -1) {
            m2042b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
