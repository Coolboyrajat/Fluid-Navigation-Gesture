package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import p006b.p042j.C0929c;

/* renamed from: androidx.fragment.app.j */
class C0408j implements LayoutInflater.Factory2 {

    /* renamed from: f */
    private final C0411l f1826f;

    C0408j(C0411l lVar) {
        this.f1826f = lVar;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0929c.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(C0929c.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C0929c.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(C0929c.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C0406h.m2094b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f1826f.mo2453a(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f1826f.mo2474b(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.f1826f.mo2453a(id);
        }
        if (C0411l.f1831F) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + fragment);
        }
        if (fragment == null) {
            fragment = this.f1826f.mo2511p().mo2430a(context.getClassLoader(), attributeValue);
            fragment.f1746r = true;
            fragment.f1708A = resourceId != 0 ? resourceId : id;
            fragment.f1709B = id;
            fragment.f1710C = string;
            fragment.f1747s = true;
            C0411l lVar = this.f1826f;
            fragment.f1751w = lVar;
            C0407i<?> iVar = lVar.f1851o;
            fragment.f1752x = iVar;
            fragment.mo2232a(iVar.mo2432d(), attributeSet, fragment.f1735g);
            this.f1826f.mo2460a(fragment);
            this.f1826f.mo2500j(fragment);
        } else if (!fragment.f1747s) {
            fragment.f1747s = true;
            C0407i<?> iVar2 = this.f1826f.f1851o;
            fragment.f1752x = iVar2;
            fragment.mo2232a(iVar2.mo2432d(), attributeSet, fragment.f1735g);
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        C0411l lVar2 = this.f1826f;
        if (lVar2.f1850n >= 1 || !fragment.f1746r) {
            this.f1826f.mo2500j(fragment);
        } else {
            lVar2.mo2461a(fragment, 1);
        }
        View view2 = fragment.f1719L;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.f1719L.getTag() == null) {
                fragment.f1719L.setTag(string);
            }
            return fragment.f1719L;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
