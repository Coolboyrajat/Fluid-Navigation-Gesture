package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C0097n;
import p006b.p026g.p035k.C0902z;

/* renamed from: androidx.appcompat.widget.y */
public interface C0247y {
    /* renamed from: a */
    Context mo1609a();

    /* renamed from: a */
    C0902z mo1610a(int i, long j);

    /* renamed from: a */
    void mo1611a(int i);

    /* renamed from: a */
    void mo1613a(Menu menu, C0097n.C0098a aVar);

    /* renamed from: a */
    void mo1615a(C0198k0 k0Var);

    /* renamed from: a */
    void mo1617a(boolean z);

    /* renamed from: b */
    void mo1618b(int i);

    /* renamed from: b */
    void mo1621b(boolean z);

    /* renamed from: b */
    boolean mo1622b();

    /* renamed from: c */
    void mo1623c(int i);

    /* renamed from: c */
    boolean mo1625c();

    void collapseActionView();

    /* renamed from: d */
    boolean mo1628d();

    /* renamed from: e */
    boolean mo1630e();

    /* renamed from: f */
    void mo1631f();

    /* renamed from: g */
    boolean mo1632g();

    CharSequence getTitle();

    /* renamed from: h */
    void mo1634h();

    /* renamed from: i */
    int mo1635i();

    /* renamed from: j */
    ViewGroup mo1636j();

    /* renamed from: k */
    int mo1637k();

    /* renamed from: l */
    void mo1638l();

    /* renamed from: m */
    boolean mo1639m();

    /* renamed from: n */
    void mo1640n();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
