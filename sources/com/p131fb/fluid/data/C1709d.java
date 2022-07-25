package com.p131fb.fluid.data;

import com.p131fb.fluid.data.TriggerButtonCursor;
import p190io.objectbox.EntityInfo;
import p190io.objectbox.Property;
import p190io.objectbox.annotation.apihint.Internal;
import p190io.objectbox.internal.CursorFactory;
import p190io.objectbox.internal.IdGetter;
import p190io.objectbox.internal.ToOneGetter;
import p190io.objectbox.relation.RelationInfo;
import p190io.objectbox.relation.ToOne;

/* renamed from: com.fb.fluid.data.d */
public final class C1709d implements EntityInfo<TriggerButton> {

    /* renamed from: f */
    public static final Class<TriggerButton> f4949f = TriggerButton.class;

    /* renamed from: g */
    public static final CursorFactory<TriggerButton> f4950g = new TriggerButtonCursor.C1700a();
    @Internal

    /* renamed from: h */
    static final C1711b f4951h = new C1711b();

    /* renamed from: i */
    public static final C1709d f4952i = new C1709d();

    /* renamed from: j */
    public static final Property<TriggerButton> f4953j = new Property(f4952i, 0, 1, Long.TYPE, "id", true, "id");

    /* renamed from: k */
    public static final Property<TriggerButton> f4954k = new Property(f4952i, 1, 2, Integer.TYPE, "layoutIndex");

    /* renamed from: l */
    public static final Property<TriggerButton> f4955l = new Property(f4952i, 2, 4, Boolean.TYPE, "waitForUp");

    /* renamed from: m */
    public static final Property<TriggerButton> f4956m = new Property(f4952i, 3, 10, Boolean.TYPE, "enabled");

    /* renamed from: n */
    public static final Property<TriggerButton> f4957n = new Property(f4952i, 4, 5, Integer.TYPE, "actionType");

    /* renamed from: o */
    public static final Property<TriggerButton> f4958o = new Property(f4952i, 5, 6, String.class, "actionData");

    /* renamed from: p */
    public static final Property<TriggerButton> f4959p = new Property(f4952i, 6, 7, Integer.TYPE, "actionSecType");

    /* renamed from: q */
    public static final Property<TriggerButton> f4960q = new Property(f4952i, 7, 8, String.class, "actionSecData");

    /* renamed from: r */
    public static final Property<TriggerButton> f4961r = new Property(f4952i, 8, 9, Long.TYPE, "triggerId", true);

    /* renamed from: s */
    public static final Property<TriggerButton>[] f4962s;

    /* renamed from: t */
    public static final Property<TriggerButton> f4963t;

    /* renamed from: u */
    public static final RelationInfo<TriggerButton, Trigger> f4964u = new RelationInfo<>(f4952i, C1712e.f4968i, (Property) f4961r, (ToOneGetter) new C1710a());

    /* renamed from: com.fb.fluid.data.d$a */
    static class C1710a implements ToOneGetter<TriggerButton> {
        C1710a() {
        }

        /* renamed from: a */
        public ToOne<Trigger> getToOne(TriggerButton triggerButton) {
            return triggerButton.trigger;
        }
    }

    @Internal
    /* renamed from: com.fb.fluid.data.d$b */
    static final class C1711b implements IdGetter<TriggerButton> {
        C1711b() {
        }

        /* renamed from: a */
        public long getId(TriggerButton triggerButton) {
            return triggerButton.mo6414f();
        }
    }

    static {
        Property<TriggerButton> property = f4953j;
        f4962s = new Property[]{property, f4954k, f4955l, f4956m, f4957n, f4958o, f4959p, f4960q, f4961r};
        f4963t = property;
    }

    public Property<TriggerButton>[] getAllProperties() {
        return f4962s;
    }

    public CursorFactory<TriggerButton> getCursorFactory() {
        return f4950g;
    }

    public String getDbName() {
        return "TriggerButton";
    }

    public Class<TriggerButton> getEntityClass() {
        return f4949f;
    }

    public int getEntityId() {
        return 2;
    }

    public String getEntityName() {
        return "TriggerButton";
    }

    public IdGetter<TriggerButton> getIdGetter() {
        return f4951h;
    }

    public Property<TriggerButton> getIdProperty() {
        return f4963t;
    }
}
