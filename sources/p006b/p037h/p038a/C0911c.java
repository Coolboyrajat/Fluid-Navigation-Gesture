package p006b.p037h.p038a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: b.h.a.c */
public abstract class C0911c extends C0906a {

    /* renamed from: n */
    private int f3358n;

    /* renamed from: o */
    private int f3359o;

    /* renamed from: p */
    private LayoutInflater f3360p;

    @Deprecated
    public C0911c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f3359o = i;
        this.f3358n = i;
        this.f3360p = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public View mo4709a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3360p.inflate(this.f3359o, viewGroup, false);
    }

    /* renamed from: b */
    public View mo1488b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3360p.inflate(this.f3358n, viewGroup, false);
    }
}
