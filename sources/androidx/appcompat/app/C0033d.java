package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0244w0;
import androidx.core.app.C0276a;
import androidx.core.app.C0290f;
import androidx.core.app.C0307n;
import androidx.fragment.app.C0401d;
import p006b.p007a.p014o.C0685b;

/* renamed from: androidx.appcompat.app.d */
public class C0033d extends C0401d implements C0034e, C0307n.C0308a, C0030b {

    /* renamed from: v */
    private C0035f f145v;

    /* renamed from: w */
    private Resources f146w;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r2 = getWindow();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m92a(int r2, android.view.KeyEvent r3) {
        /*
            r1 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 >= r0) goto L_0x003e
            boolean r2 = r3.isCtrlPressed()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getMetaState()
            boolean r2 = android.view.KeyEvent.metaStateHasNoModifiers(r2)
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getRepeatCount()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getKeyCode()
            boolean r2 = android.view.KeyEvent.isModifierKey(r2)
            if (r2 != 0) goto L_0x003e
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L_0x003e
            android.view.View r0 = r2.getDecorView()
            if (r0 == 0) goto L_0x003e
            android.view.View r2 = r2.getDecorView()
            boolean r2 = r2.dispatchKeyShortcutEvent(r3)
            if (r2 == 0) goto L_0x003e
            r2 = 1
            return r2
        L_0x003e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0033d.m92a(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: a */
    public C0685b mo108a(C0685b.C0686a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo109a(Intent intent) {
        C0290f.m1447a((Activity) this, intent);
    }

    /* renamed from: a */
    public void mo110a(C0307n nVar) {
        nVar.mo1942a((Activity) this);
    }

    /* renamed from: a */
    public void mo111a(C0685b bVar) {
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo126n().mo152a(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        mo126n().mo148a(context);
    }

    /* renamed from: b */
    public void mo114b(C0307n nVar) {
    }

    /* renamed from: b */
    public void mo115b(C0685b bVar) {
    }

    /* renamed from: b */
    public boolean mo116b(Intent intent) {
        return C0290f.m1450b((Activity) this, intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo117c(int i) {
    }

    public void closeOptionsMenu() {
        C0026a o = mo127o();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (o == null || !o.mo82e()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0026a o = mo127o();
        if (keyCode != 82 || o == null || !o.mo78a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i) {
        return mo126n().mo147a(i);
    }

    public MenuInflater getMenuInflater() {
        return mo126n().mo159c();
    }

    public Resources getResources() {
        if (this.f146w == null && C0244w0.m1228b()) {
            this.f146w = new C0244w0(this, super.getResources());
        }
        Resources resources = this.f146w;
        return resources == null ? super.getResources() : resources;
    }

    /* renamed from: i */
    public Intent mo123i() {
        return C0290f.m1445a(this);
    }

    public void invalidateOptionsMenu() {
        mo126n().mo165f();
    }

    /* renamed from: m */
    public void mo125m() {
        mo126n().mo165f();
    }

    /* renamed from: n */
    public C0035f mo126n() {
        if (this.f145v == null) {
            this.f145v = C0035f.m110a((Activity) this, (C0034e) this);
        }
        return this.f145v;
    }

    /* renamed from: o */
    public C0026a mo127o() {
        return mo126n().mo162d();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f146w != null) {
            this.f146w.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        mo126n().mo149a(configuration);
    }

    public void onContentChanged() {
        mo141p();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0035f n = mo126n();
        n.mo164e();
        n.mo150a(bundle);
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo126n().mo166g();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m92a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0026a o = mo127o();
        if (menuItem.getItemId() != 16908332 || o == null || (o.mo84g() & 4) == 0) {
            return false;
        }
        return mo142q();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo126n().mo156b(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo126n().mo167h();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo126n().mo161c(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo126n().mo168i();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo126n().mo169j();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo126n().mo153a(charSequence);
    }

    public void openOptionsMenu() {
        C0026a o = mo127o();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (o == null || !o.mo88k()) {
            super.openOptionsMenu();
        }
    }

    @Deprecated
    /* renamed from: p */
    public void mo141p() {
    }

    /* renamed from: q */
    public boolean mo142q() {
        Intent i = mo123i();
        if (i == null) {
            return false;
        }
        if (mo116b(i)) {
            C0307n a = C0307n.m1509a((Context) this);
            mo110a(a);
            mo114b(a);
            a.mo1945a();
            try {
                C0276a.m1422a(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            mo109a(i);
            return true;
        }
    }

    public void setContentView(int i) {
        mo126n().mo160c(i);
    }

    public void setContentView(View view) {
        mo126n().mo151a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo126n().mo157b(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        mo126n().mo163d(i);
    }
}
