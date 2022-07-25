package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.C0031c;
import androidx.appcompat.view.menu.C0097n;
import p006b.p007a.C0660g;

/* renamed from: androidx.appcompat.view.menu.h */
class C0084h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C0097n.C0098a {

    /* renamed from: f */
    private C0081g f450f;

    /* renamed from: g */
    private C0031c f451g;

    /* renamed from: h */
    C0078e f452h;

    /* renamed from: i */
    private C0097n.C0098a f453i;

    public C0084h(C0081g gVar) {
        this.f450f = gVar;
    }

    /* renamed from: a */
    public void mo517a() {
        C0031c cVar = this.f451g;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    /* renamed from: a */
    public void mo518a(IBinder iBinder) {
        C0081g gVar = this.f450f;
        C0031c.C0032a aVar = new C0031c.C0032a(gVar.mo487e());
        this.f452h = new C0078e(aVar.mo107b(), C0660g.abc_list_menu_item_layout);
        this.f452h.mo390a((C0097n.C0098a) this);
        this.f450f.mo454a((C0097n) this.f452h);
        aVar.mo104a(this.f452h.mo426a(), this);
        View i = gVar.mo495i();
        if (i != null) {
            aVar.mo102a(i);
        } else {
            aVar.mo101a(gVar.mo491g());
            aVar.mo105a(gVar.mo493h());
        }
        aVar.mo100a((DialogInterface.OnKeyListener) this);
        this.f451g = aVar.mo106a();
        this.f451g.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f451g.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f451g.show();
    }

    /* renamed from: a */
    public void mo212a(C0081g gVar, boolean z) {
        if (z || gVar == this.f450f) {
            mo517a();
        }
        C0097n.C0098a aVar = this.f453i;
        if (aVar != null) {
            aVar.mo212a(gVar, z);
        }
    }

    /* renamed from: a */
    public boolean mo213a(C0081g gVar) {
        C0097n.C0098a aVar = this.f453i;
        if (aVar != null) {
            return aVar.mo213a(gVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f450f.mo458a((MenuItem) (C0086j) this.f452h.mo426a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f452h.mo388a(this.f450f, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f451g.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f451g.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f450f.mo457a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f450f.performShortcut(i, keyEvent, 0);
    }
}
