package com.p131fb.fluid;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.C0372c;
import androidx.databinding.C0374e;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.p004n.p005b.C0388a;
import com.p131fb.fluid.p132j.C1722b;
import com.p131fb.fluid.p132j.C1724d;
import com.p131fb.fluid.p132j.C1726f;
import java.util.ArrayList;
import java.util.List;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.e */
public class C1716e extends C0372c {

    /* renamed from: a */
    private static final SparseIntArray f4985a = new SparseIntArray(3);

    static {
        f4985a.put(C3148R.layout.item_home_header, 1);
        f4985a.put(C3148R.layout.layout_dialog_about, 2);
        f4985a.put(C3148R.layout.layout_dialog_billing, 3);
    }

    /* renamed from: a */
    public ViewDataBinding mo2180a(C0374e eVar, View view, int i) {
        int i2 = f4985a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        } else if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return null;
                }
                if ("layout/layout_dialog_billing_0".equals(tag)) {
                    return new C1726f(eVar, view);
                }
                throw new IllegalArgumentException("The tag for layout_dialog_billing is invalid. Received: " + tag);
            } else if ("layout/layout_dialog_about_0".equals(tag)) {
                return new C1724d(eVar, view);
            } else {
                throw new IllegalArgumentException("The tag for layout_dialog_about is invalid. Received: " + tag);
            }
        } else if ("layout/item_home_header_0".equals(tag)) {
            return new C1722b(eVar, view);
        } else {
            throw new IllegalArgumentException("The tag for item_home_header is invalid. Received: " + tag);
        }
    }

    /* renamed from: a */
    public ViewDataBinding mo2181a(C0374e eVar, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f4985a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    /* renamed from: a */
    public List<C0372c> mo2182a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new C0388a());
        return arrayList;
    }
}
