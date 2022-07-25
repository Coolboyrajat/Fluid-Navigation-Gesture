package com.joaomgcd.taskerpluginlibrary.output;

import kotlin.p205x.p207d.C3370k;
import p054c.p119h.p120a.p122i.C1482b;

/* renamed from: com.joaomgcd.taskerpluginlibrary.output.a */
public abstract class C2766a {

    /* renamed from: a */
    private String f7345a;

    /* renamed from: b */
    private final boolean f7346b;

    /* renamed from: c */
    private final int f7347c;

    /* renamed from: d */
    private final int f7348d;

    /* renamed from: e */
    private boolean f7349e;

    public C2766a(String str, boolean z, int i, int i2, boolean z2) {
        C3370k.m12227b(str, "nameNoSuffix");
        this.f7345a = str;
        this.f7346b = z;
        this.f7347c = i;
        this.f7348d = i2;
        this.f7349e = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2766a(String str, boolean z, int i, int i2, boolean z2, int i3, C3366g gVar) {
        this(str, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? -1 : i, (i3 & 8) != 0 ? Integer.MAX_VALUE : i2, (i3 & 16) != 0 ? false : z2);
    }

    /* renamed from: a */
    public final void mo8852a(String str) {
        C3370k.m12227b(str, "<set-?>");
        this.f7345a = str;
    }

    /* renamed from: a */
    public final void mo8853a(boolean z) {
        this.f7349e = z;
    }

    /* renamed from: a */
    public final boolean mo8854a() {
        return this.f7349e;
    }

    /* renamed from: b */
    public final int mo8855b() {
        return this.f7348d;
    }

    /* renamed from: c */
    public final int mo8856c() {
        return this.f7347c;
    }

    /* renamed from: d */
    public final String mo8857d() {
        String f = mo8859f();
        if (!this.f7346b) {
            return f;
        }
        return f + "()";
    }

    /* renamed from: e */
    public final String mo8858e() {
        return this.f7345a;
    }

    /* renamed from: f */
    public final String mo8859f() {
        return C1482b.m6732a(this.f7345a);
    }

    /* renamed from: g */
    public final boolean mo8860g() {
        return this.f7346b;
    }
}
