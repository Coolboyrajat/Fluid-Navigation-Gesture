package p006b.p037h.p038a;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: b.h.a.b */
class C0909b extends Filter {

    /* renamed from: a */
    C0910a f3357a;

    /* renamed from: b.h.a.b$a */
    interface C0910a {
        /* renamed from: a */
        Cursor mo4708a();

        /* renamed from: a */
        Cursor mo1483a(CharSequence charSequence);

        /* renamed from: a */
        CharSequence mo1485a(Cursor cursor);

        /* renamed from: b */
        void mo1489b(Cursor cursor);
    }

    C0909b(C0910a aVar) {
        this.f3357a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f3357a.mo1485a((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f3357a.mo1483a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
        } else {
            filterResults.count = 0;
            a = null;
        }
        filterResults.values = a;
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor a = this.f3357a.mo4708a();
        Object obj = filterResults.values;
        if (obj != null && obj != a) {
            this.f3357a.mo1489b((Cursor) obj);
        }
    }
}
