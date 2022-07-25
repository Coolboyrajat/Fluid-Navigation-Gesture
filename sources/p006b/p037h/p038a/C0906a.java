package p006b.p037h.p038a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p006b.p037h.p038a.C0909b;

/* renamed from: b.h.a.a */
public abstract class C0906a extends BaseAdapter implements Filterable, C0909b.C0910a {

    /* renamed from: f */
    protected boolean f3347f;

    /* renamed from: g */
    protected boolean f3348g;

    /* renamed from: h */
    protected Cursor f3349h;

    /* renamed from: i */
    protected Context f3350i;

    /* renamed from: j */
    protected int f3351j;

    /* renamed from: k */
    protected C0907a f3352k;

    /* renamed from: l */
    protected DataSetObserver f3353l;

    /* renamed from: m */
    protected C0909b f3354m;

    /* renamed from: b.h.a.a$a */
    private class C0907a extends ContentObserver {
        C0907a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C0906a.this.mo4711b();
        }
    }

    /* renamed from: b.h.a.a$b */
    private class C0908b extends DataSetObserver {
        C0908b() {
        }

        public void onChanged() {
            C0906a aVar = C0906a.this;
            aVar.f3347f = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C0906a aVar = C0906a.this;
            aVar.f3347f = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public C0906a(Context context, Cursor cursor, boolean z) {
        mo4710a(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public Cursor mo4708a() {
        return this.f3349h;
    }

    /* renamed from: a */
    public abstract View mo4709a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: a */
    public abstract CharSequence mo1485a(Cursor cursor);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4710a(Context context, Cursor cursor, int i) {
        C0908b bVar;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f3348g = true;
        } else {
            this.f3348g = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f3349h = cursor;
        this.f3347f = z;
        this.f3350i = context;
        this.f3351j = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f3352k = new C0907a();
            bVar = new C0908b();
        } else {
            bVar = null;
            this.f3352k = null;
        }
        this.f3353l = bVar;
        if (z) {
            C0907a aVar = this.f3352k;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f3353l;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo1487a(View view, Context context, Cursor cursor);

    /* renamed from: b */
    public abstract View mo1488b(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4711b() {
        Cursor cursor;
        if (this.f3348g && (cursor = this.f3349h) != null && !cursor.isClosed()) {
            this.f3347f = this.f3349h.requery();
        }
    }

    /* renamed from: b */
    public void mo1489b(Cursor cursor) {
        Cursor c = mo4712c(cursor);
        if (c != null) {
            c.close();
        }
    }

    /* renamed from: c */
    public Cursor mo4712c(Cursor cursor) {
        Cursor cursor2 = this.f3349h;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0907a aVar = this.f3352k;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f3353l;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f3349h = cursor;
        if (cursor != null) {
            C0907a aVar2 = this.f3352k;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f3353l;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f3351j = cursor.getColumnIndexOrThrow("_id");
            this.f3347f = true;
            notifyDataSetChanged();
        } else {
            this.f3351j = -1;
            this.f3347f = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    public int getCount() {
        Cursor cursor;
        if (!this.f3347f || (cursor = this.f3349h) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f3347f) {
            return null;
        }
        this.f3349h.moveToPosition(i);
        if (view == null) {
            view = mo4709a(this.f3350i, this.f3349h, viewGroup);
        }
        mo1487a(view, this.f3350i, this.f3349h);
        return view;
    }

    public Filter getFilter() {
        if (this.f3354m == null) {
            this.f3354m = new C0909b(this);
        }
        return this.f3354m;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f3347f || (cursor = this.f3349h) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f3349h;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f3347f || (cursor = this.f3349h) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f3349h.getLong(this.f3351j);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f3347f) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f3349h.moveToPosition(i)) {
            if (view == null) {
                view = mo1488b(this.f3350i, this.f3349h, viewGroup);
            }
            mo1487a(view, this.f3350i, this.f3349h);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }
}
