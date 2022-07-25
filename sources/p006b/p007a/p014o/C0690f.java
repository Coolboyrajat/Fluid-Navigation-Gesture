package p006b.p007a.p014o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0088k;
import androidx.appcompat.view.menu.C0101p;
import java.util.ArrayList;
import p006b.p007a.p014o.C0685b;
import p006b.p021d.C0736g;
import p006b.p026g.p028e.p029a.C0794a;
import p006b.p026g.p028e.p029a.C0795b;

/* renamed from: b.a.o.f */
public class C0690f extends ActionMode {

    /* renamed from: a */
    final Context f2698a;

    /* renamed from: b */
    final C0685b f2699b;

    /* renamed from: b.a.o.f$a */
    public static class C0691a implements C0685b.C0686a {

        /* renamed from: a */
        final ActionMode.Callback f2700a;

        /* renamed from: b */
        final Context f2701b;

        /* renamed from: c */
        final ArrayList<C0690f> f2702c = new ArrayList<>();

        /* renamed from: d */
        final C0736g<Menu, Menu> f2703d = new C0736g<>();

        public C0691a(Context context, ActionMode.Callback callback) {
            this.f2701b = context;
            this.f2700a = callback;
        }

        /* renamed from: a */
        private Menu m3817a(Menu menu) {
            Menu menu2 = this.f2703d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            C0101p pVar = new C0101p(this.f2701b, (C0794a) menu);
            this.f2703d.put(menu, pVar);
            return pVar;
        }

        /* renamed from: a */
        public void mo214a(C0685b bVar) {
            this.f2700a.onDestroyActionMode(mo3922b(bVar));
        }

        /* renamed from: a */
        public boolean mo215a(C0685b bVar, Menu menu) {
            return this.f2700a.onPrepareActionMode(mo3922b(bVar), m3817a(menu));
        }

        /* renamed from: a */
        public boolean mo216a(C0685b bVar, MenuItem menuItem) {
            return this.f2700a.onActionItemClicked(mo3922b(bVar), new C0088k(this.f2701b, (C0795b) menuItem));
        }

        /* renamed from: b */
        public ActionMode mo3922b(C0685b bVar) {
            int size = this.f2702c.size();
            for (int i = 0; i < size; i++) {
                C0690f fVar = this.f2702c.get(i);
                if (fVar != null && fVar.f2699b == bVar) {
                    return fVar;
                }
            }
            C0690f fVar2 = new C0690f(this.f2701b, bVar);
            this.f2702c.add(fVar2);
            return fVar2;
        }

        /* renamed from: b */
        public boolean mo217b(C0685b bVar, Menu menu) {
            return this.f2700a.onCreateActionMode(mo3922b(bVar), m3817a(menu));
        }
    }

    public C0690f(Context context, C0685b bVar) {
        this.f2698a = context;
        this.f2699b = bVar;
    }

    public void finish() {
        this.f2699b.mo274a();
    }

    public View getCustomView() {
        return this.f2699b.mo279b();
    }

    public Menu getMenu() {
        return new C0101p(this.f2698a, (C0794a) this.f2699b.mo282c());
    }

    public MenuInflater getMenuInflater() {
        return this.f2699b.mo283d();
    }

    public CharSequence getSubtitle() {
        return this.f2699b.mo284e();
    }

    public Object getTag() {
        return this.f2699b.mo3895f();
    }

    public CharSequence getTitle() {
        return this.f2699b.mo285g();
    }

    public boolean getTitleOptionalHint() {
        return this.f2699b.mo3896h();
    }

    public void invalidate() {
        this.f2699b.mo286i();
    }

    public boolean isTitleOptional() {
        return this.f2699b.mo287j();
    }

    public void setCustomView(View view) {
        this.f2699b.mo276a(view);
    }

    public void setSubtitle(int i) {
        this.f2699b.mo275a(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2699b.mo277a(charSequence);
    }

    public void setTag(Object obj) {
        this.f2699b.mo3894a(obj);
    }

    public void setTitle(int i) {
        this.f2699b.mo280b(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2699b.mo281b(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f2699b.mo278a(z);
    }
}
