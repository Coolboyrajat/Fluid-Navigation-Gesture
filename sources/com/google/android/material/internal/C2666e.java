package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.e */
public final class C2666e {

    /* renamed from: a */
    private final ArrayList<C2668b> f7068a = new ArrayList<>();

    /* renamed from: b */
    private C2668b f7069b = null;

    /* renamed from: c */
    ValueAnimator f7070c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f7071d = new C2667a();

    /* renamed from: com.google.android.material.internal.e$a */
    class C2667a extends AnimatorListenerAdapter {
        C2667a() {
        }

        public void onAnimationEnd(Animator animator) {
            C2666e eVar = C2666e.this;
            if (eVar.f7070c == animator) {
                eVar.f7070c = null;
            }
        }
    }

    /* renamed from: com.google.android.material.internal.e$b */
    static class C2668b {

        /* renamed from: a */
        final int[] f7073a;

        /* renamed from: b */
        final ValueAnimator f7074b;

        C2668b(int[] iArr, ValueAnimator valueAnimator) {
            this.f7073a = iArr;
            this.f7074b = valueAnimator;
        }
    }

    /* renamed from: a */
    private void m10561a(C2668b bVar) {
        this.f7070c = bVar.f7074b;
        this.f7070c.start();
    }

    /* renamed from: b */
    private void m10562b() {
        ValueAnimator valueAnimator = this.f7070c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7070c = null;
        }
    }

    /* renamed from: a */
    public void mo8544a() {
        ValueAnimator valueAnimator = this.f7070c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f7070c = null;
        }
    }

    /* renamed from: a */
    public void mo8545a(int[] iArr) {
        C2668b bVar;
        int size = this.f7068a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.f7068a.get(i);
            if (StateSet.stateSetMatches(bVar.f7073a, iArr)) {
                break;
            }
            i++;
        }
        C2668b bVar2 = this.f7069b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                m10562b();
            }
            this.f7069b = bVar;
            if (bVar != null) {
                m10561a(bVar);
            }
        }
    }

    /* renamed from: a */
    public void mo8546a(int[] iArr, ValueAnimator valueAnimator) {
        C2668b bVar = new C2668b(iArr, valueAnimator);
        valueAnimator.addListener(this.f7071d);
        this.f7068a.add(bVar);
    }
}
