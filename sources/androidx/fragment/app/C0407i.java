package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p006b.p026g.p034j.C0837h;

/* renamed from: androidx.fragment.app.i */
public abstract class C0407i<E> extends C0403e {

    /* renamed from: f */
    private final Activity f1822f;

    /* renamed from: g */
    private final Context f1823g;

    /* renamed from: h */
    private final Handler f1824h;

    /* renamed from: i */
    final C0411l f1825i;

    C0407i(Activity activity, Context context, Handler handler, int i) {
        this.f1825i = new C0429m();
        this.f1822f = activity;
        C0837h.m4535a(context, (Object) "context == null");
        this.f1823g = context;
        C0837h.m4535a(handler, (Object) "handler == null");
        this.f1824h = handler;
    }

    C0407i(C0401d dVar) {
        this(dVar, dVar, new Handler(), 0);
    }

    /* renamed from: a */
    public View mo2318a(int i) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2382a(Fragment fragment) {
    }

    /* renamed from: a */
    public void mo2383a(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.f1823g.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: a */
    public void mo2384a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public boolean mo2319b() {
        return true;
    }

    /* renamed from: b */
    public boolean mo2385b(Fragment fragment) {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Activity mo2431c() {
        return this.f1822f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Context mo2432d() {
        return this.f1823g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Handler mo2433e() {
        return this.f1824h;
    }

    /* renamed from: g */
    public abstract E mo2386g();

    /* renamed from: i */
    public LayoutInflater mo2387i() {
        return LayoutInflater.from(this.f1823g);
    }

    /* renamed from: j */
    public void mo2388j() {
    }
}
