package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.C0203l;
import p006b.p007a.C0654a;
import p006b.p026g.p035k.C0838a;
import p006b.p026g.p035k.C0890v;
import p006b.p026g.p035k.p036e0.C0857c;
import p006b.p039i.p040a.C0912a;
import p190io.objectbox.model.PropertyFlags;

public class CheckableImageButton extends C0203l implements Checkable {

    /* renamed from: j */
    private static final int[] f6990j = {16842912};

    /* renamed from: h */
    private boolean f6991h;

    /* renamed from: i */
    private boolean f6992i;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    class C2657a extends C0838a {
        C2657a() {
        }

        /* renamed from: a */
        public void mo2093a(View view, C0857c cVar) {
            super.mo2093a(view, cVar);
            cVar.mo4595b(CheckableImageButton.this.mo8475a());
            cVar.mo4600c(CheckableImageButton.this.isChecked());
        }

        /* renamed from: b */
        public void mo2095b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2095b(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$b */
    static class C2658b extends C0912a {
        public static final Parcelable.Creator<C2658b> CREATOR = new C2659a();

        /* renamed from: h */
        boolean f6994h;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$b$a */
        static class C2659a implements Parcelable.ClassLoaderCreator<C2658b> {
            C2659a() {
            }

            public C2658b createFromParcel(Parcel parcel) {
                return new C2658b(parcel, (ClassLoader) null);
            }

            public C2658b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2658b(parcel, classLoader);
            }

            public C2658b[] newArray(int i) {
                return new C2658b[i];
            }
        }

        public C2658b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m10499a(parcel);
        }

        public C2658b(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        private void m10499a(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f6994h = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6994h ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0654a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6992i = true;
        C0890v.m4752a((View) this, (C0838a) new C2657a());
    }

    /* renamed from: a */
    public boolean mo8475a() {
        return this.f6992i;
    }

    public boolean isChecked() {
        return this.f6991h;
    }

    public int[] onCreateDrawableState(int i) {
        return this.f6991h ? ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + f6990j.length), f6990j) : super.onCreateDrawableState(i);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2658b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2658b bVar = (C2658b) parcelable;
        super.onRestoreInstanceState(bVar.mo4725q());
        setChecked(bVar.f6994h);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C2658b bVar = new C2658b(super.onSaveInstanceState());
        bVar.f6994h = this.f6991h;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.f6992i != z) {
            this.f6992i = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f6992i && this.f6991h != z) {
            this.f6991h = z;
            refreshDrawableState();
            sendAccessibilityEvent(PropertyFlags.INDEX_HASH);
        }
    }

    public void toggle() {
        setChecked(!this.f6991h);
    }
}
