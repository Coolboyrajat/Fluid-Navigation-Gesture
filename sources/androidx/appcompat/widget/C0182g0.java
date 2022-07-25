package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0080f;
import androidx.appcompat.view.menu.C0081g;
import androidx.appcompat.view.menu.C0086j;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.g0 */
public class C0182g0 extends C0171e0 implements C0180f0 {

    /* renamed from: O */
    private static Method f946O;

    /* renamed from: N */
    private C0180f0 f947N;

    /* renamed from: androidx.appcompat.widget.g0$a */
    public static class C0183a extends C0150a0 {

        /* renamed from: t */
        final int f948t;

        /* renamed from: u */
        final int f949u;

        /* renamed from: v */
        private C0180f0 f950v;

        /* renamed from: w */
        private MenuItem f951w;

        public C0183a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f948t = 22;
                this.f949u = 21;
                return;
            }
            this.f948t = 21;
            this.f949u = 22;
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.f950v != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C0080f fVar = (C0080f) adapter;
                C0086j jVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < fVar.getCount()) {
                    jVar = fVar.getItem(i2);
                }
                MenuItem menuItem = this.f951w;
                if (menuItem != jVar) {
                    C0081g b = fVar.mo437b();
                    if (menuItem != null) {
                        this.f950v.mo423b(b, menuItem);
                    }
                    this.f951w = jVar;
                    if (jVar != null) {
                        this.f950v.mo422a(b, jVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f948t) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f949u) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0080f) getAdapter()).mo437b().mo457a(false);
                return true;
            }
        }

        public void setHoverListener(C0180f0 f0Var) {
            this.f950v = f0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f946O = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0182g0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0150a0 mo1296a(Context context, boolean z) {
        C0183a aVar = new C0183a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    /* renamed from: a */
    public void mo422a(C0081g gVar, MenuItem menuItem) {
        C0180f0 f0Var = this.f947N;
        if (f0Var != null) {
            f0Var.mo422a(gVar, menuItem);
        }
    }

    /* renamed from: a */
    public void mo1356a(C0180f0 f0Var) {
        this.f947N = f0Var;
    }

    /* renamed from: a */
    public void mo1357a(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f913J.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: b */
    public void mo423b(C0081g gVar, MenuItem menuItem) {
        C0180f0 f0Var = this.f947N;
        if (f0Var != null) {
            f0Var.mo423b(gVar, menuItem);
        }
    }

    /* renamed from: b */
    public void mo1358b(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f913J.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: c */
    public void mo1359c(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f946O;
            if (method != null) {
                try {
                    method.invoke(this.f913J, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f913J.setTouchModal(z);
        }
    }
}
