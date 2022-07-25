package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.k */
class C2624k extends BaseAdapter {

    /* renamed from: j */
    static final int f6877j = Calendar.getInstance().getMaximum(4);

    /* renamed from: f */
    final C2622j f6878f;

    /* renamed from: g */
    final C2606e<?> f6879g;

    /* renamed from: h */
    C2604c f6880h;

    /* renamed from: i */
    final C2600a f6881i;

    C2624k(C2622j jVar, C2606e<?> eVar, C2600a aVar) {
        this.f6878f = jVar;
        this.f6879g = eVar;
        this.f6881i = aVar;
    }

    /* renamed from: a */
    private void m10308a(Context context) {
        if (this.f6880h == null) {
            this.f6880h = new C2604c(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo8271a() {
        return this.f6878f.mo8265q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo8272a(int i) {
        return mo8271a() + (i - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo8273b() {
        return (this.f6878f.mo8265q() + this.f6878f.f6876k) - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo8274b(int i) {
        return i % this.f6878f.f6875j == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo8275c(int i) {
        return (i + 1) % this.f6878f.f6875j == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo8276d(int i) {
        return (i - this.f6878f.mo8265q()) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo8277e(int i) {
        return i >= mo8271a() && i <= mo8273b();
    }

    public int getCount() {
        return this.f6878f.f6876k + mo8271a();
    }

    public Long getItem(int i) {
        if (i < this.f6878f.mo8265q() || i > mo8273b()) {
            return null;
        }
        return Long.valueOf(this.f6878f.mo8258a(mo8276d(i)));
    }

    public long getItemId(int i) {
        return (long) (i / this.f6878f.f6875j);
    }

    /* JADX WARNING: type inference failed for: r7v18, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.m10308a((android.content.Context) r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p054c.p083e.p084a.p085a.C1175h.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.mo8271a()
            int r7 = r6 - r7
            r8 = 1
            if (r7 < 0) goto L_0x005e
            com.google.android.material.datepicker.j r2 = r5.f6878f
            int r3 = r2.f6876k
            if (r7 < r3) goto L_0x002e
            goto L_0x005e
        L_0x002e:
            int r7 = r7 + r8
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r0.setText(r2)
            com.google.android.material.datepicker.j r2 = r5.f6878f
            long r2 = r2.mo8258a((int) r7)
            com.google.android.material.datepicker.j r7 = r5.f6878f
            int r7 = r7.f6874i
            com.google.android.material.datepicker.j r4 = com.google.android.material.datepicker.C2622j.m10300t()
            int r4 = r4.f6874i
            if (r7 != r4) goto L_0x0050
            java.lang.String r7 = com.google.android.material.datepicker.C2607f.m10266a(r2)
            goto L_0x0054
        L_0x0050:
            java.lang.String r7 = com.google.android.material.datepicker.C2607f.m10267b(r2)
        L_0x0054:
            r0.setContentDescription(r7)
            r0.setVisibility(r1)
            r0.setEnabled(r8)
            goto L_0x0066
        L_0x005e:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x0066:
            java.lang.Long r6 = r5.getItem((int) r6)
            if (r6 != 0) goto L_0x006d
            return r0
        L_0x006d:
            com.google.android.material.datepicker.a r7 = r5.f6881i
            com.google.android.material.datepicker.a$b r7 = r7.mo8226q()
            long r2 = r6.longValue()
            boolean r7 = r7.mo8235a(r2)
            if (r7 == 0) goto L_0x00c6
            r0.setEnabled(r8)
            com.google.android.material.datepicker.e<?> r7 = r5.f6879g
            java.util.Collection r7 = r7.mo8242p()
            java.util.Iterator r7 = r7.iterator()
        L_0x008a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00b2
            java.lang.Object r8 = r7.next()
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            long r3 = r6.longValue()
            long r3 = com.google.android.material.datepicker.C2605d.m10261a(r3)
            long r1 = com.google.android.material.datepicker.C2605d.m10261a(r1)
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x008a
            com.google.android.material.datepicker.c r6 = r5.f6880h
            com.google.android.material.datepicker.b r6 = r6.f6828b
        L_0x00ae:
            r6.mo8237a(r0)
            return r0
        L_0x00b2:
            long r6 = r6.longValue()
            boolean r6 = android.text.format.DateUtils.isToday(r6)
            if (r6 == 0) goto L_0x00c1
            com.google.android.material.datepicker.c r6 = r5.f6880h
            com.google.android.material.datepicker.b r6 = r6.f6829c
            goto L_0x00ae
        L_0x00c1:
            com.google.android.material.datepicker.c r6 = r5.f6880h
            com.google.android.material.datepicker.b r6 = r6.f6827a
            goto L_0x00ae
        L_0x00c6:
            r0.setEnabled(r1)
            com.google.android.material.datepicker.c r6 = r5.f6880h
            com.google.android.material.datepicker.b r6 = r6.f6833g
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C2624k.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public boolean hasStableIds() {
        return true;
    }
}
