package androidx.databinding.p004n.p005b;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.C0372c;
import androidx.databinding.C0374e;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.databinding.n.b.a */
public class C0388a extends C0372c {

    /* renamed from: a */
    private static final SparseIntArray f1706a = new SparseIntArray(0);

    /* renamed from: a */
    public ViewDataBinding mo2180a(C0374e eVar, View view, int i) {
        if (f1706a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    /* renamed from: a */
    public ViewDataBinding mo2181a(C0374e eVar, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f1706a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    /* renamed from: a */
    public List<C0372c> mo2182a() {
        return new ArrayList(0);
    }
}
