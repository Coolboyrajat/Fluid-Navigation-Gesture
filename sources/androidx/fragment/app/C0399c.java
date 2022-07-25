package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: androidx.fragment.app.c */
public class C0399c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: b0 */
    private Handler f1794b0;

    /* renamed from: c0 */
    private Runnable f1795c0 = new C0400a();

    /* renamed from: d0 */
    int f1796d0 = 0;

    /* renamed from: e0 */
    int f1797e0 = 0;

    /* renamed from: f0 */
    boolean f1798f0 = true;

    /* renamed from: g0 */
    boolean f1799g0 = true;

    /* renamed from: h0 */
    int f1800h0 = -1;

    /* renamed from: i0 */
    Dialog f1801i0;

    /* renamed from: j0 */
    boolean f1802j0;

    /* renamed from: k0 */
    boolean f1803k0;

    /* renamed from: l0 */
    boolean f1804l0;

    /* renamed from: androidx.fragment.app.c$a */
    class C0400a implements Runnable {
        C0400a() {
        }

        public void run() {
            C0399c cVar = C0399c.this;
            Dialog dialog = cVar.f1801i0;
            if (dialog != null) {
                cVar.onDismiss(dialog);
            }
        }
    }

    /* renamed from: C0 */
    public void mo2351C0() {
        mo2354a(false, false);
    }

    /* renamed from: a */
    public void mo2352a(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: a */
    public void mo2231a(Context context) {
        super.mo2231a(context);
        if (!this.f1804l0) {
            this.f1803k0 = false;
        }
    }

    /* renamed from: a */
    public void mo2353a(C0411l lVar, String str) {
        this.f1803k0 = false;
        this.f1804l0 = true;
        C0438s b = lVar.mo2475b();
        b.mo2594a((Fragment) this, str);
        b.mo2322a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2354a(boolean z, boolean z2) {
        if (!this.f1803k0) {
            this.f1803k0 = true;
            this.f1804l0 = false;
            Dialog dialog = this.f1801i0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f1801i0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.f1794b0.getLooper()) {
                        onDismiss(this.f1801i0);
                    } else {
                        this.f1794b0.post(this.f1795c0);
                    }
                }
            }
            this.f1802j0 = true;
            if (this.f1800h0 >= 0) {
                mo2315z0().mo2455a(this.f1800h0, 1);
                this.f1800h0 = -1;
                return;
            }
            C0438s b = mo2315z0().mo2475b();
            b.mo2337c(this);
            if (z) {
                b.mo2332b();
            } else {
                b.mo2322a();
            }
        }
    }

    /* renamed from: b */
    public void mo2248b(Bundle bundle) {
        Bundle bundle2;
        super.mo2248b(bundle);
        if (this.f1799g0) {
            View T = mo2213T();
            if (T != null) {
                if (T.getParent() == null) {
                    this.f1801i0.setContentView(T);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            C0401d u = mo2304u();
            if (u != null) {
                this.f1801i0.setOwnerActivity(u);
            }
            this.f1801i0.setCancelable(this.f1798f0);
            this.f1801i0.setOnCancelListener(this);
            this.f1801i0.setOnDismissListener(this);
            if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                this.f1801i0.onRestoreInstanceState(bundle2);
            }
        }
    }

    /* renamed from: c */
    public void mo2256c(Bundle bundle) {
        super.mo2256c(bundle);
        this.f1794b0 = new Handler();
        this.f1799g0 = this.f1709B == 0;
        if (bundle != null) {
            this.f1796d0 = bundle.getInt("android:style", 0);
            this.f1797e0 = bundle.getInt("android:theme", 0);
            this.f1798f0 = bundle.getBoolean("android:cancelable", true);
            this.f1799g0 = bundle.getBoolean("android:showsDialog", this.f1799g0);
            this.f1800h0 = bundle.getInt("android:backStackId", -1);
        }
    }

    /* renamed from: d */
    public LayoutInflater mo2261d(Bundle bundle) {
        Context d;
        if (!this.f1799g0) {
            return super.mo2261d(bundle);
        }
        this.f1801i0 = mo2355n(bundle);
        Dialog dialog = this.f1801i0;
        if (dialog != null) {
            mo2352a(dialog, this.f1796d0);
            d = this.f1801i0.getContext();
        } else {
            d = this.f1752x.mo2432d();
        }
        return (LayoutInflater) d.getSystemService("layout_inflater");
    }

    /* renamed from: e */
    public void mo2267e(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.mo2267e(bundle);
        Dialog dialog = this.f1801i0;
        if (!(dialog == null || (onSaveInstanceState = dialog.onSaveInstanceState()) == null)) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f1796d0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f1797e0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f1798f0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f1799g0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f1800h0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* renamed from: h0 */
    public void mo2279h0() {
        super.mo2279h0();
        Dialog dialog = this.f1801i0;
        if (dialog != null) {
            this.f1802j0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f1801i0.dismiss();
            if (!this.f1803k0) {
                onDismiss(this.f1801i0);
            }
            this.f1801i0 = null;
        }
    }

    /* renamed from: i0 */
    public void mo2283i0() {
        super.mo2283i0();
        if (!this.f1804l0 && !this.f1803k0) {
            this.f1803k0 = true;
        }
    }

    /* renamed from: l0 */
    public void mo2289l0() {
        super.mo2289l0();
        Dialog dialog = this.f1801i0;
        if (dialog != null) {
            this.f1802j0 = false;
            dialog.show();
        }
    }

    /* renamed from: m0 */
    public void mo2291m0() {
        super.mo2291m0();
        Dialog dialog = this.f1801i0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* renamed from: n */
    public Dialog mo2355n(Bundle bundle) {
        throw null;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f1802j0) {
            mo2354a(true, true);
        }
    }
}
