package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0481i;
import androidx.lifecycle.C0490o;
import androidx.lifecycle.C0491p;
import androidx.lifecycle.C0504x;
import p006b.p021d.C0736g;
import p006b.p026g.p035k.C0853e;

/* renamed from: androidx.core.app.e */
public class C0289e extends Activity implements C0490o, C0853e.C0854a {

    /* renamed from: f */
    private C0491p f1443f = new C0491p(this);

    public C0289e() {
        new C0736g();
    }

    /* renamed from: a */
    public boolean mo254a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0853e.m4594a(decorView, keyEvent)) {
            return C0853e.m4595a(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0853e.m4594a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0504x.m2485b((Activity) this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f1443f.mo2708a(C0481i.C0483b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
