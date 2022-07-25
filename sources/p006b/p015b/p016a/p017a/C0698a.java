package p006b.p015b.p016a.p017a;

import java.util.concurrent.Executor;

/* renamed from: b.b.a.a.a */
public class C0698a extends C0703c {

    /* renamed from: c */
    private static volatile C0698a f2755c;

    /* renamed from: a */
    private C0703c f2756a = this.f2757b;

    /* renamed from: b */
    private C0703c f2757b = new C0701b();

    /* renamed from: b.b.a.a.a$a */
    static class C0699a implements Executor {
        C0699a() {
        }

        public void execute(Runnable runnable) {
            C0698a.m3847b().mo3959b(runnable);
        }
    }

    /* renamed from: b.b.a.a.a$b */
    static class C0700b implements Executor {
        C0700b() {
        }

        public void execute(Runnable runnable) {
            C0698a.m3847b().mo3957a(runnable);
        }
    }

    static {
        new C0699a();
        new C0700b();
    }

    private C0698a() {
    }

    /* renamed from: b */
    public static C0698a m3847b() {
        if (f2755c != null) {
            return f2755c;
        }
        synchronized (C0698a.class) {
            if (f2755c == null) {
                f2755c = new C0698a();
            }
        }
        return f2755c;
    }

    /* renamed from: a */
    public void mo3957a(Runnable runnable) {
        this.f2756a.mo3957a(runnable);
    }

    /* renamed from: a */
    public boolean mo3958a() {
        return this.f2756a.mo3958a();
    }

    /* renamed from: b */
    public void mo3959b(Runnable runnable) {
        this.f2756a.mo3959b(runnable);
    }
}
