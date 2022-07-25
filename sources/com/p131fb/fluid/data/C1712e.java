package com.p131fb.fluid.data;

import com.p131fb.fluid.data.TriggerCursor;
import java.util.List;
import p190io.objectbox.EntityInfo;
import p190io.objectbox.Property;
import p190io.objectbox.annotation.apihint.Internal;
import p190io.objectbox.internal.CursorFactory;
import p190io.objectbox.internal.IdGetter;
import p190io.objectbox.internal.ToManyGetter;
import p190io.objectbox.internal.ToOneGetter;
import p190io.objectbox.relation.RelationInfo;
import p190io.objectbox.relation.ToOne;

/* renamed from: com.fb.fluid.data.e */
public final class C1712e implements EntityInfo<Trigger> {

    /* renamed from: f */
    public static final Class<Trigger> f4965f = Trigger.class;

    /* renamed from: g */
    public static final CursorFactory<Trigger> f4966g = new TriggerCursor.C1701a();
    @Internal

    /* renamed from: h */
    static final C1715c f4967h = new C1715c();

    /* renamed from: i */
    public static final C1712e f4968i = new C1712e();

    /* renamed from: j */
    public static final Property<Trigger> f4969j = new Property(f4968i, 0, 1, Long.TYPE, "id", true, "id");

    /* renamed from: k */
    public static final Property<Trigger> f4970k = new Property(f4968i, 1, 2, Boolean.TYPE, "enabled");

    /* renamed from: l */
    public static final Property<Trigger> f4971l = new Property(f4968i, 2, 3, Integer.TYPE, "gravity");

    /* renamed from: m */
    public static final Property<Trigger> f4972m = new Property(f4968i, 3, 4, Integer.TYPE, "location");

    /* renamed from: n */
    public static final Property<Trigger> f4973n = new Property(f4968i, 4, 11, Integer.TYPE, "sensitivity");

    /* renamed from: o */
    public static final Property<Trigger> f4974o = new Property(f4968i, 5, 12, Integer.TYPE, "size");

    /* renamed from: p */
    public static final Property<Trigger> f4975p = new Property(f4968i, 6, 13, Integer.TYPE, "transparency");

    /* renamed from: q */
    public static final Property<Trigger> f4976q = new Property(f4968i, 7, 16, Boolean.TYPE, "instantPrimaryAction");

    /* renamed from: r */
    public static final Property<Trigger> f4977r = new Property(f4968i, 8, 15, Boolean.TYPE, "instantSecondaryAction");

    /* renamed from: s */
    public static final Property<Trigger> f4978s = new Property(f4968i, 9, 7, Integer.TYPE, "actionTypeStart");

    /* renamed from: t */
    public static final Property<Trigger> f4979t = new Property(f4968i, 10, 8, String.class, "actionDataStart");

    /* renamed from: u */
    public static final Property<Trigger> f4980u = new Property(f4968i, 11, 9, Integer.TYPE, "actionTypeEnd");

    /* renamed from: v */
    public static final Property<Trigger> f4981v = new Property(f4968i, 12, 10, String.class, "actionDataEnd");

    /* renamed from: w */
    public static final Property<Trigger>[] f4982w;

    /* renamed from: x */
    public static final Property<Trigger> f4983x;

    /* renamed from: y */
    public static final RelationInfo<Trigger, TriggerButton> f4984y = new RelationInfo(f4968i, C1709d.f4952i, (ToManyGetter) new C1713a(), (Property) C1709d.f4961r, (ToOneGetter) new C1714b());

    /* renamed from: com.fb.fluid.data.e$a */
    static class C1713a implements ToManyGetter<Trigger> {
        C1713a() {
        }

        /* renamed from: a */
        public List<TriggerButton> getToMany(Trigger trigger) {
            return trigger.buttons;
        }
    }

    /* renamed from: com.fb.fluid.data.e$b */
    static class C1714b implements ToOneGetter<TriggerButton> {
        C1714b() {
        }

        /* renamed from: a */
        public ToOne<Trigger> getToOne(TriggerButton triggerButton) {
            return triggerButton.trigger;
        }
    }

    @Internal
    /* renamed from: com.fb.fluid.data.e$c */
    static final class C1715c implements IdGetter<Trigger> {
        C1715c() {
        }

        /* renamed from: a */
        public long getId(Trigger trigger) {
            return trigger.mo6390h();
        }
    }

    static {
        Property<Trigger> property = f4969j;
        f4982w = new Property[]{property, f4970k, f4971l, f4972m, f4973n, f4974o, f4975p, f4976q, f4977r, f4978s, f4979t, f4980u, f4981v};
        f4983x = property;
    }

    public Property<Trigger>[] getAllProperties() {
        return f4982w;
    }

    public CursorFactory<Trigger> getCursorFactory() {
        return f4966g;
    }

    public String getDbName() {
        return "Trigger";
    }

    public Class<Trigger> getEntityClass() {
        return f4965f;
    }

    public int getEntityId() {
        return 3;
    }

    public String getEntityName() {
        return "Trigger";
    }

    public IdGetter<Trigger> getIdGetter() {
        return f4967h;
    }

    public Property<Trigger> getIdProperty() {
        return f4983x;
    }
}
