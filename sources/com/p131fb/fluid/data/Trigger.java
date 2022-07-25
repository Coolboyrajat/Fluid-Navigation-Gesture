package com.p131fb.fluid.data;

import com.p131fb.fluid.p135l.C1755l;
import java.util.List;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.BoxStore;
import p190io.objectbox.android.BuildConfig;
import p190io.objectbox.annotation.Backlink;
import p190io.objectbox.annotation.C3153Id;
import p190io.objectbox.annotation.Entity;
import p190io.objectbox.relation.ToMany;

@Entity
/* renamed from: com.fb.fluid.data.Trigger */
public final class Trigger {
    transient BoxStore __boxStore;
    private String actionDataEnd = BuildConfig.FLAVOR;
    private String actionDataStart = BuildConfig.FLAVOR;
    private int actionTypeEnd = -1;
    private int actionTypeStart = -1;
    @Backlink(mo9473to = "trigger")
    public List<TriggerButton> buttons = new ToMany(this, C1712e.f4984y);
    private boolean enabled = true;
    private int gravity;
    @C3153Id

    /* renamed from: id */
    private long f4920id;
    private boolean instantPrimaryAction;
    private boolean instantSecondaryAction;
    private int location;
    private int sensitivity;
    private int size;
    private int transparency;

    /* renamed from: a */
    public final String mo6370a() {
        return this.actionDataEnd;
    }

    /* renamed from: a */
    public final void mo6371a(int i) {
        this.actionTypeEnd = i;
    }

    /* renamed from: a */
    public final void mo6372a(long j) {
        this.f4920id = j;
    }

    /* renamed from: a */
    public final void mo6373a(String str) {
        C3370k.m12227b(str, "<set-?>");
        this.actionDataEnd = str;
    }

    /* renamed from: a */
    public final void mo6374a(boolean z) {
        this.enabled = z;
    }

    /* renamed from: b */
    public final String mo6375b() {
        return this.actionDataStart;
    }

    /* renamed from: b */
    public final void mo6376b(int i) {
        this.actionTypeStart = i;
    }

    /* renamed from: b */
    public final void mo6377b(String str) {
        C3370k.m12227b(str, "<set-?>");
        this.actionDataStart = str;
    }

    /* renamed from: b */
    public final void mo6378b(boolean z) {
        this.instantPrimaryAction = z;
    }

    /* renamed from: c */
    public final int mo6379c() {
        return this.actionTypeEnd;
    }

    /* renamed from: c */
    public final void mo6380c(int i) {
        this.gravity = i;
    }

    /* renamed from: c */
    public final void mo6381c(boolean z) {
        this.instantSecondaryAction = z;
    }

    /* renamed from: d */
    public final int mo6382d() {
        return this.actionTypeStart;
    }

    /* renamed from: d */
    public final void mo6383d(int i) {
        this.location = i;
    }

    /* renamed from: e */
    public final List<TriggerButton> mo6384e() {
        List<TriggerButton> list = this.buttons;
        if (list != null) {
            return list;
        }
        C3370k.m12230d("buttons");
        throw null;
    }

    /* renamed from: e */
    public final void mo6385e(int i) {
        this.sensitivity = i;
    }

    /* renamed from: f */
    public final void mo6386f(int i) {
        this.size = i;
    }

    /* renamed from: f */
    public final boolean mo6387f() {
        return this.enabled;
    }

    /* renamed from: g */
    public final int mo6388g() {
        return this.gravity;
    }

    /* renamed from: g */
    public final void mo6389g(int i) {
        this.transparency = i;
    }

    /* renamed from: h */
    public final long mo6390h() {
        return this.f4920id;
    }

    /* renamed from: i */
    public final boolean mo6391i() {
        return this.instantPrimaryAction;
    }

    /* renamed from: j */
    public final boolean mo6392j() {
        return this.instantSecondaryAction;
    }

    /* renamed from: k */
    public final int mo6393k() {
        return this.location;
    }

    /* renamed from: l */
    public final int mo6394l() {
        return this.sensitivity;
    }

    /* renamed from: m */
    public final int mo6395m() {
        return this.size;
    }

    /* renamed from: n */
    public final int mo6396n() {
        return this.transparency;
    }

    /* renamed from: o */
    public final boolean mo6397o() {
        return this.actionTypeEnd != -1 && C1755l.f5077b.mo6524a().contains(Integer.valueOf(this.actionTypeEnd));
    }

    /* renamed from: p */
    public final boolean mo6398p() {
        return this.actionTypeStart != -1 && C1755l.f5077b.mo6524a().contains(Integer.valueOf(this.actionTypeStart));
    }
}
