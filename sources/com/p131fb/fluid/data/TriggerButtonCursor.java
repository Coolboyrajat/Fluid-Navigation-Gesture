package com.p131fb.fluid.data;

import com.p131fb.fluid.data.C1709d;
import p190io.objectbox.BoxStore;
import p190io.objectbox.Cursor;
import p190io.objectbox.Transaction;
import p190io.objectbox.annotation.apihint.Internal;
import p190io.objectbox.internal.CursorFactory;
import p190io.objectbox.relation.ToOne;

/* renamed from: com.fb.fluid.data.TriggerButtonCursor */
public final class TriggerButtonCursor extends Cursor<TriggerButton> {

    /* renamed from: f */
    private static final C1709d.C1711b f4924f = C1709d.f4951h;

    /* renamed from: g */
    private static final int f4925g = C1709d.f4954k.f7909id;

    /* renamed from: h */
    private static final int f4926h = C1709d.f4955l.f7909id;

    /* renamed from: i */
    private static final int f4927i = C1709d.f4956m.f7909id;

    /* renamed from: j */
    private static final int f4928j = C1709d.f4957n.f7909id;

    /* renamed from: k */
    private static final int f4929k = C1709d.f4958o.f7909id;

    /* renamed from: l */
    private static final int f4930l = C1709d.f4959p.f7909id;

    /* renamed from: m */
    private static final int f4931m = C1709d.f4960q.f7909id;

    /* renamed from: n */
    private static final int f4932n = C1709d.f4961r.f7909id;

    @Internal
    /* renamed from: com.fb.fluid.data.TriggerButtonCursor$a */
    static final class C1700a implements CursorFactory<TriggerButton> {
        C1700a() {
        }

        public Cursor<TriggerButton> createCursor(Transaction transaction, long j, BoxStore boxStore) {
            return new TriggerButtonCursor(transaction, j, boxStore);
        }
    }

    public TriggerButtonCursor(Transaction transaction, long j, BoxStore boxStore) {
        super(transaction, j, C1709d.f4952i, boxStore);
    }

    /* renamed from: c */
    private void m7294c(TriggerButton triggerButton) {
        triggerButton.__boxStore = this.boxStoreForEntities;
    }

    /* renamed from: a */
    public final long getId(TriggerButton triggerButton) {
        return f4924f.getId(triggerButton);
    }

    /* renamed from: b */
    public final long put(TriggerButton triggerButton) {
        TriggerButton triggerButton2 = triggerButton;
        ToOne<Trigger> toOne = triggerButton2.trigger;
        if (toOne != null && toOne.internalRequiresPutTarget()) {
            Cursor<TARGET> relationTargetCursor = getRelationTargetCursor(Trigger.class);
            try {
                toOne.internalPutTarget(relationTargetCursor);
                relationTargetCursor.close();
            } catch (Throwable th) {
                Throwable th2 = th;
                relationTargetCursor.close();
                throw th2;
            }
        }
        String a = triggerButton.mo6400a();
        int i = a != null ? f4929k : 0;
        String b = triggerButton.mo6406b();
        int i2 = b != null ? f4931m : 0;
        long collect313311 = Cursor.collect313311(this.cursor, triggerButton.mo6414f(), 3, i, a, i2, b, 0, (String) null, 0, (byte[]) null, f4932n, triggerButton2.trigger.getTargetId(), f4925g, (long) triggerButton.mo6415g(), f4928j, (long) triggerButton.mo6412d(), f4930l, triggerButton.mo6410c(), f4926h, triggerButton.mo6417i() ? 1 : 0, f4927i, triggerButton.mo6413e() ? 1 : 0, 0, 0.0f, 0, 0.0d);
        triggerButton2.mo6403a(collect313311);
        m7294c(triggerButton);
        return collect313311;
    }
}
