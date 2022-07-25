package p054c.p083e.p084a.p085a.p087l;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: c.e.a.a.l.i */
public class C1187i {

    /* renamed from: a */
    private long f3929a = 0;

    /* renamed from: b */
    private long f3930b = 300;

    /* renamed from: c */
    private TimeInterpolator f3931c = null;

    /* renamed from: d */
    private int f3932d = 0;

    /* renamed from: e */
    private int f3933e = 1;

    public C1187i(long j, long j2) {
        this.f3929a = j;
        this.f3930b = j2;
    }

    public C1187i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f3929a = j;
        this.f3930b = j2;
        this.f3931c = timeInterpolator;
    }

    /* renamed from: a */
    static C1187i m5755a(ValueAnimator valueAnimator) {
        C1187i iVar = new C1187i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m5756b(valueAnimator));
        iVar.f3932d = valueAnimator.getRepeatCount();
        iVar.f3933e = valueAnimator.getRepeatMode();
        return iVar;
    }

    /* renamed from: b */
    private static TimeInterpolator m5756b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? C1179a.f3915b : interpolator instanceof AccelerateInterpolator ? C1179a.f3916c : interpolator instanceof DecelerateInterpolator ? C1179a.f3917d : interpolator;
    }

    /* renamed from: a */
    public long mo5316a() {
        return this.f3929a;
    }

    /* renamed from: a */
    public void mo5317a(Animator animator) {
        animator.setStartDelay(mo5316a());
        animator.setDuration(mo5318b());
        animator.setInterpolator(mo5319c());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(mo5320d());
            valueAnimator.setRepeatMode(mo5321e());
        }
    }

    /* renamed from: b */
    public long mo5318b() {
        return this.f3930b;
    }

    /* renamed from: c */
    public TimeInterpolator mo5319c() {
        TimeInterpolator timeInterpolator = this.f3931c;
        return timeInterpolator != null ? timeInterpolator : C1179a.f3915b;
    }

    /* renamed from: d */
    public int mo5320d() {
        return this.f3932d;
    }

    /* renamed from: e */
    public int mo5321e() {
        return this.f3933e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1187i)) {
            return false;
        }
        C1187i iVar = (C1187i) obj;
        if (mo5316a() == iVar.mo5316a() && mo5318b() == iVar.mo5318b() && mo5320d() == iVar.mo5320d() && mo5321e() == iVar.mo5321e()) {
            return mo5319c().getClass().equals(iVar.mo5319c().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (mo5316a() ^ (mo5316a() >>> 32))) * 31) + ((int) (mo5318b() ^ (mo5318b() >>> 32)))) * 31) + mo5319c().getClass().hashCode()) * 31) + mo5320d()) * 31) + mo5321e();
    }

    public String toString() {
        return 10 + C1187i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + mo5316a() + " duration: " + mo5318b() + " interpolator: " + mo5319c().getClass() + " repeatCount: " + mo5320d() + " repeatMode: " + mo5321e() + "}\n";
    }
}
