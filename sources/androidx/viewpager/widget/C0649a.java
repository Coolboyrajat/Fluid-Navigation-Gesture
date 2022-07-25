package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.viewpager.widget.a */
public abstract class C0649a {

    /* renamed from: a */
    private final DataSetObservable f2603a = new DataSetObservable();

    /* renamed from: a */
    public float mo3753a(int i) {
        return 1.0f;
    }

    /* renamed from: a */
    public abstract int mo3754a();

    /* renamed from: a */
    public int mo3755a(Object obj) {
        return -1;
    }

    /* renamed from: a */
    public abstract Object mo2571a(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public void mo3756a(DataSetObserver dataSetObserver) {
        this.f2603a.registerObserver(dataSetObserver);
    }

    /* renamed from: a */
    public void mo2572a(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Deprecated
    /* renamed from: a */
    public void mo3757a(View view) {
    }

    @Deprecated
    /* renamed from: a */
    public void mo3758a(View view, int i, Object obj) {
    }

    /* renamed from: a */
    public void mo2573a(ViewGroup viewGroup) {
        mo3757a((View) viewGroup);
    }

    /* renamed from: a */
    public abstract void mo2574a(ViewGroup viewGroup, int i, Object obj);

    /* renamed from: a */
    public abstract boolean mo2575a(View view, Object obj);

    /* renamed from: b */
    public Parcelable mo2576b() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3759b(DataSetObserver dataSetObserver) {
        synchronized (this) {
        }
    }

    @Deprecated
    /* renamed from: b */
    public void mo3760b(View view) {
    }

    /* renamed from: b */
    public void mo2578b(ViewGroup viewGroup) {
        mo3760b((View) viewGroup);
    }

    /* renamed from: b */
    public void mo2579b(ViewGroup viewGroup, int i, Object obj) {
        mo3758a((View) viewGroup, i, obj);
    }
}
