package com.p131fb.fluid.data;

import com.p131fb.fluid.data.C1712e;
import p190io.objectbox.BoxStore;
import p190io.objectbox.Cursor;
import p190io.objectbox.Transaction;
import p190io.objectbox.annotation.apihint.Internal;
import p190io.objectbox.internal.CursorFactory;

/* renamed from: com.fb.fluid.data.TriggerCursor */
public final class TriggerCursor extends Cursor<Trigger> {

    /* renamed from: f */
    private static final C1712e.C1715c f4933f = C1712e.f4967h;

    /* renamed from: g */
    private static final int f4934g = C1712e.f4970k.f7909id;

    /* renamed from: h */
    private static final int f4935h = C1712e.f4971l.f7909id;

    /* renamed from: i */
    private static final int f4936i = C1712e.f4972m.f7909id;

    /* renamed from: j */
    private static final int f4937j = C1712e.f4973n.f7909id;

    /* renamed from: k */
    private static final int f4938k = C1712e.f4974o.f7909id;

    /* renamed from: l */
    private static final int f4939l = C1712e.f4975p.f7909id;

    /* renamed from: m */
    private static final int f4940m = C1712e.f4976q.f7909id;

    /* renamed from: n */
    private static final int f4941n = C1712e.f4977r.f7909id;

    /* renamed from: o */
    private static final int f4942o = C1712e.f4978s.f7909id;

    /* renamed from: p */
    private static final int f4943p = C1712e.f4979t.f7909id;

    /* renamed from: q */
    private static final int f4944q = C1712e.f4980u.f7909id;

    /* renamed from: r */
    private static final int f4945r = C1712e.f4981v.f7909id;

    @Internal
    /* renamed from: com.fb.fluid.data.TriggerCursor$a */
    static final class C1701a implements CursorFactory<Trigger> {
        C1701a() {
        }

        public Cursor<Trigger> createCursor(Transaction transaction, long j, BoxStore boxStore) {
            return new TriggerCursor(transaction, j, boxStore);
        }
    }

    public TriggerCursor(Transaction transaction, long j, BoxStore boxStore) {
        super(transaction, j, C1712e.f4968i, boxStore);
    }

    /* renamed from: c */
    private void m7297c(Trigger trigger) {
        trigger.__boxStore = this.boxStoreForEntities;
    }

    /* renamed from: a */
    public final long getId(Trigger trigger) {
        return f4933f.getId(trigger);
    }

    /* renamed from: b */
    public final long put(Trigger trigger) {
        Trigger trigger2 = trigger;
        String b = trigger.mo6375b();
        int i = b != null ? f4943p : 0;
        String a = trigger.mo6370a();
        Cursor.collect313311(this.cursor, 0, 1, i, b, a != null ? f4945r : 0, a, 0, (String) null, 0, (byte[]) null, f4935h, (long) trigger.mo6388g(), f4936i, (long) trigger.mo6393k(), f4937j, (long) trigger.mo6394l(), f4938k, trigger.mo6395m(), f4939l, trigger.mo6396n(), f4942o, trigger.mo6382d(), 0, 0.0f, 0, 0.0d);
        long collect004000 = Cursor.collect004000(this.cursor, trigger.mo6390h(), 2, f4944q, (long) trigger.mo6379c(), f4934g, trigger.mo6387f() ? 1 : 0, f4940m, trigger.mo6391i() ? 1 : 0, f4941n, trigger.mo6392j() ? 1 : 0);
        trigger2.mo6372a(collect004000);
        m7297c(trigger);
        checkApplyToManyToDb(trigger2.buttons, TriggerButton.class);
        return collect004000;
    }
}
