package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.databinding.g */
public class C0376g extends C0372c {

    /* renamed from: a */
    private Set<Class<? extends C0372c>> f1702a = new HashSet();

    /* renamed from: b */
    private List<C0372c> f1703b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private List<String> f1704c = new CopyOnWriteArrayList();

    /* renamed from: b */
    private boolean m1851b() {
        StringBuilder sb;
        boolean z = false;
        for (String next : this.f1704c) {
            try {
                Class<?> cls = Class.forName(next);
                if (C0372c.class.isAssignableFrom(cls)) {
                    mo2183a((C0372c) cls.newInstance());
                    this.f1704c.remove(next);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e) {
                e = e;
                sb = new StringBuilder();
                sb.append("unable to add feature mapper for ");
                sb.append(next);
                Log.e("MergedDataBinderMapper", sb.toString(), e);
            } catch (InstantiationException e2) {
                e = e2;
                sb = new StringBuilder();
                sb.append("unable to add feature mapper for ");
                sb.append(next);
                Log.e("MergedDataBinderMapper", sb.toString(), e);
            }
        }
        return z;
    }

    /* renamed from: a */
    public ViewDataBinding mo2180a(C0374e eVar, View view, int i) {
        for (C0372c a : this.f1703b) {
            ViewDataBinding a2 = a.mo2180a(eVar, view, i);
            if (a2 != null) {
                return a2;
            }
        }
        if (m1851b()) {
            return mo2180a(eVar, view, i);
        }
        return null;
    }

    /* renamed from: a */
    public ViewDataBinding mo2181a(C0374e eVar, View[] viewArr, int i) {
        for (C0372c a : this.f1703b) {
            ViewDataBinding a2 = a.mo2181a(eVar, viewArr, i);
            if (a2 != null) {
                return a2;
            }
        }
        if (m1851b()) {
            return mo2181a(eVar, viewArr, i);
        }
        return null;
    }

    /* renamed from: a */
    public void mo2183a(C0372c cVar) {
        if (this.f1702a.add(cVar.getClass())) {
            this.f1703b.add(cVar);
            for (C0372c a : cVar.mo2182a()) {
                mo2183a(a);
            }
        }
    }
}
