package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p006b.p007a.C0663j;
import p006b.p007a.p014o.C0685b;

/* renamed from: androidx.appcompat.app.a */
public abstract class C0026a {

    /* renamed from: androidx.appcompat.app.a$a */
    public static class C0027a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f141a;

        public C0027a(int i, int i2) {
            super(i, i2);
            this.f141a = 0;
            this.f141a = 8388627;
        }

        public C0027a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f141a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0663j.ActionBarLayout);
            this.f141a = obtainStyledAttributes.getInt(C0663j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0027a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f141a = 0;
        }

        public C0027a(C0027a aVar) {
            super(aVar);
            this.f141a = 0;
            this.f141a = aVar.f141a;
        }
    }

    /* renamed from: androidx.appcompat.app.a$b */
    public interface C0028b {
        /* renamed from: a */
        void mo89a(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$c */
    public static abstract class C0029c {
        /* renamed from: a */
        public abstract CharSequence mo90a();

        /* renamed from: b */
        public abstract View mo91b();

        /* renamed from: c */
        public abstract Drawable mo92c();

        /* renamed from: d */
        public abstract CharSequence mo93d();

        /* renamed from: e */
        public abstract void mo94e();
    }

    /* renamed from: a */
    public abstract C0685b mo74a(C0685b.C0686a aVar);

    /* renamed from: a */
    public abstract void mo75a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo76a(CharSequence charSequence);

    /* renamed from: a */
    public abstract boolean mo77a(int i, KeyEvent keyEvent);

    /* renamed from: a */
    public boolean mo78a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo79b(boolean z);

    /* renamed from: c */
    public abstract void mo80c(boolean z);

    /* renamed from: d */
    public abstract void mo81d(boolean z);

    /* renamed from: e */
    public boolean mo82e() {
        return false;
    }

    /* renamed from: f */
    public abstract boolean mo83f();

    /* renamed from: g */
    public abstract int mo84g();

    /* renamed from: h */
    public abstract Context mo85h();

    /* renamed from: i */
    public boolean mo86i() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo87j() {
    }

    /* renamed from: k */
    public boolean mo88k() {
        return false;
    }
}
