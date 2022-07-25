package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p006b.p007a.C0654a;
import p006b.p007a.p014o.C0685b;
import p006b.p026g.p035k.C0853e;

/* renamed from: androidx.appcompat.app.h */
public class C0056h extends Dialog implements C0034e {

    /* renamed from: f */
    private C0035f f245f;

    /* renamed from: g */
    private final C0853e.C0854a f246g = new C0057a();

    /* renamed from: androidx.appcompat.app.h$a */
    class C0057a implements C0853e.C0854a {
        C0057a() {
        }

        /* renamed from: a */
        public boolean mo254a(KeyEvent keyEvent) {
            return C0056h.this.mo244a(keyEvent);
        }
    }

    public C0056h(Context context, int i) {
        super(context, m256a(context, i));
        C0035f a = mo242a();
        a.mo163d(m256a(context, i));
        a.mo150a((Bundle) null);
    }

    /* renamed from: a */
    private static int m256a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0654a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public C0035f mo242a() {
        if (this.f245f == null) {
            this.f245f = C0035f.m111a((Dialog) this, (C0034e) this);
        }
        return this.f245f;
    }

    /* renamed from: a */
    public C0685b mo108a(C0685b.C0686a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo111a(C0685b bVar) {
    }

    /* renamed from: a */
    public boolean mo243a(int i) {
        return mo242a().mo158b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo244a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo242a().mo152a(view, layoutParams);
    }

    /* renamed from: b */
    public void mo115b(C0685b bVar) {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0853e.m4595a(this.f246g, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return mo242a().mo147a(i);
    }

    public void invalidateOptionsMenu() {
        mo242a().mo165f();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo242a().mo164e();
        super.onCreate(bundle);
        mo242a().mo150a(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo242a().mo169j();
    }

    public void setContentView(int i) {
        mo242a().mo160c(i);
    }

    public void setContentView(View view) {
        mo242a().mo151a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo242a().mo157b(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo242a().mo153a((CharSequence) getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo242a().mo153a(charSequence);
    }
}
