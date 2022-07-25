package p155d.p156a;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p161p.C2819b;
import p155d.p156a.p162q.C2823a;
import p155d.p156a.p162q.C2826d;
import p155d.p156a.p162q.C2827e;
import p155d.p156a.p162q.C2828f;
import p155d.p156a.p162q.C2830h;
import p155d.p156a.p163r.p165b.C2836a;
import p155d.p156a.p163r.p165b.C2849b;
import p155d.p156a.p163r.p167d.C2862e;
import p155d.p156a.p163r.p168e.p170b.C2868b;
import p155d.p156a.p163r.p168e.p170b.C2871c;
import p155d.p156a.p163r.p168e.p170b.C2876d;
import p155d.p156a.p163r.p168e.p170b.C2879e;
import p155d.p156a.p163r.p168e.p170b.C2881f;
import p155d.p156a.p163r.p168e.p170b.C2883g;
import p155d.p156a.p163r.p168e.p170b.C2884h;
import p155d.p156a.p163r.p168e.p170b.C2885i;
import p155d.p156a.p163r.p168e.p170b.C2887j;
import p155d.p156a.p163r.p168e.p170b.C2888k;
import p155d.p156a.p163r.p168e.p170b.C2890l;
import p155d.p156a.p163r.p168e.p170b.C2892m;
import p155d.p156a.p163r.p168e.p170b.C2893n;
import p155d.p156a.p163r.p168e.p170b.C2895o;
import p155d.p156a.p163r.p168e.p170b.C2897p;
import p155d.p156a.p163r.p168e.p170b.C2899q;
import p155d.p156a.p163r.p168e.p170b.C2902s;
import p155d.p156a.p163r.p168e.p170b.C2904t;
import p155d.p156a.p163r.p168e.p170b.C2907u;
import p155d.p156a.p163r.p168e.p170b.C2909v;
import p155d.p156a.p163r.p168e.p170b.C2911w;
import p155d.p156a.p163r.p168e.p170b.C2913x;
import p155d.p156a.p163r.p168e.p170b.C2915y;
import p155d.p156a.p176u.C2962a;
import p155d.p156a.p177v.C2964b;

/* renamed from: d.a.h */
public abstract class C2790h<T> implements C2792j<T> {
    /* renamed from: a */
    public static C2790h<Long> m10988a(long j, long j2, TimeUnit timeUnit, C2794l lVar) {
        C2849b.m11138a(timeUnit, "unit is null");
        C2849b.m11138a(lVar, "scheduler is null");
        return C2962a.m11420a(new C2890l(Math.max(0, j), Math.max(0, j2), timeUnit, lVar));
    }

    /* renamed from: a */
    private C2790h<T> m10989a(C2827e<? super T> eVar, C2827e<? super Throwable> eVar2, C2823a aVar, C2823a aVar2) {
        C2849b.m11138a(eVar, "onNext is null");
        C2849b.m11138a(eVar2, "onError is null");
        C2849b.m11138a(aVar, "onComplete is null");
        C2849b.m11138a(aVar2, "onAfterTerminate is null");
        return C2962a.m11420a(new C2881f(this, eVar, eVar2, aVar, aVar2));
    }

    /* renamed from: a */
    public static <T, R> C2790h<R> m10990a(Iterable<? extends C2792j<? extends T>> iterable, C2828f<? super Object[], ? extends R> fVar) {
        return m10991a(iterable, fVar, m10996e());
    }

    /* renamed from: a */
    public static <T, R> C2790h<R> m10991a(Iterable<? extends C2792j<? extends T>> iterable, C2828f<? super Object[], ? extends R> fVar, int i) {
        C2849b.m11138a(iterable, "sources is null");
        C2849b.m11138a(fVar, "combiner is null");
        C2849b.m11135a(i, "bufferSize");
        return C2962a.m11420a(new C2868b((C2792j<? extends T>[]) null, iterable, fVar, i << 1, false));
    }

    /* renamed from: a */
    public static <T> C2790h<T> m10992a(Callable<? extends T> callable) {
        C2849b.m11138a(callable, "supplier is null");
        return C2962a.m11420a(new C2887j(callable));
    }

    /* renamed from: c */
    public static C2790h<Long> m10993c(long j, TimeUnit timeUnit, C2794l lVar) {
        return m10988a(j, j, timeUnit, lVar);
    }

    /* renamed from: c */
    public static <T> C2790h<T> m10994c(T t) {
        C2849b.m11138a(t, "item is null");
        return C2962a.m11420a(new C2892m(t));
    }

    /* renamed from: d */
    public static C2790h<Long> m10995d(long j, TimeUnit timeUnit, C2794l lVar) {
        C2849b.m11138a(timeUnit, "unit is null");
        C2849b.m11138a(lVar, "scheduler is null");
        return C2962a.m11420a(new C2915y(Math.max(j, 0), timeUnit, lVar));
    }

    /* renamed from: e */
    public static int m10996e() {
        return C2787e.m10987a();
    }

    /* renamed from: f */
    public static <T> C2790h<T> m10997f() {
        return C2962a.m11420a(C2884h.f7504f);
    }

    /* renamed from: a */
    public final C2790h<T> mo8901a() {
        return mo8913a(C2836a.m11127b());
    }

    /* renamed from: a */
    public final C2790h<T> mo8902a(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? m10997f() : C2962a.m11420a(new C2897p(this, j));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j);
    }

    /* renamed from: a */
    public final C2790h<T> mo8903a(long j, TimeUnit timeUnit) {
        return mo8905a(j, timeUnit, C2964b.m11436a(), false);
    }

    /* renamed from: a */
    public final C2790h<T> mo8904a(long j, TimeUnit timeUnit, C2794l lVar) {
        return mo8906a(m10995d(j, timeUnit, lVar));
    }

    /* renamed from: a */
    public final C2790h<T> mo8905a(long j, TimeUnit timeUnit, C2794l lVar, boolean z) {
        C2849b.m11138a(timeUnit, "unit is null");
        C2849b.m11138a(lVar, "scheduler is null");
        return C2962a.m11420a(new C2871c(this, j, timeUnit, lVar, z));
    }

    /* renamed from: a */
    public final <U> C2790h<T> mo8906a(C2792j<U> jVar) {
        C2849b.m11138a(jVar, "other is null");
        return C2962a.m11420a(new C2876d(this, jVar));
    }

    /* renamed from: a */
    public final C2790h<T> mo8907a(C2794l lVar) {
        return mo8908a(lVar, false, m10996e());
    }

    /* renamed from: a */
    public final C2790h<T> mo8908a(C2794l lVar, boolean z, int i) {
        C2849b.m11138a(lVar, "scheduler is null");
        C2849b.m11135a(i, "bufferSize");
        return C2962a.m11420a(new C2895o(this, lVar, z, i));
    }

    /* renamed from: a */
    public final C2790h<T> mo8909a(C2823a aVar) {
        return mo8912a((C2827e<? super C2810b>) C2836a.m11126a(), aVar);
    }

    /* renamed from: a */
    public final C2790h<T> mo8910a(C2826d dVar) {
        C2849b.m11138a(dVar, "stop is null");
        return C2962a.m11420a(new C2899q(this, dVar));
    }

    /* renamed from: a */
    public final C2790h<T> mo8911a(C2827e<? super Throwable> eVar) {
        C2827e a = C2836a.m11126a();
        C2823a aVar = C2836a.f7421c;
        return m10989a(a, eVar, aVar, aVar);
    }

    /* renamed from: a */
    public final C2790h<T> mo8912a(C2827e<? super C2810b> eVar, C2823a aVar) {
        C2849b.m11138a(eVar, "onSubscribe is null");
        C2849b.m11138a(aVar, "onDispose is null");
        return C2962a.m11420a(new C2883g(this, eVar, aVar));
    }

    /* renamed from: a */
    public final <K> C2790h<T> mo8913a(C2828f<? super T, K> fVar) {
        C2849b.m11138a(fVar, "keySelector is null");
        return C2962a.m11420a(new C2879e(this, fVar, C2849b.m11137a()));
    }

    /* renamed from: a */
    public final C2790h<T> mo8914a(C2830h<? super T> hVar) {
        C2849b.m11138a(hVar, "predicate is null");
        return C2962a.m11420a(new C2885i(this, hVar));
    }

    /* renamed from: a */
    public final C2810b mo8915a(C2827e<? super T> eVar, C2827e<? super Throwable> eVar2, C2823a aVar, C2827e<? super C2810b> eVar3) {
        C2849b.m11138a(eVar, "onNext is null");
        C2849b.m11138a(eVar2, "onError is null");
        C2849b.m11138a(aVar, "onComplete is null");
        C2849b.m11138a(eVar3, "onSubscribe is null");
        C2862e eVar4 = new C2862e(eVar, eVar2, aVar, eVar3);
        mo8917a(eVar4);
        return eVar4;
    }

    /* renamed from: a */
    public final <R> R mo8916a(C2791i<T, ? extends R> iVar) {
        C2849b.m11138a(iVar, "converter is null");
        return iVar.mo6029a(this);
    }

    /* renamed from: a */
    public final void mo8917a(C2793k<? super T> kVar) {
        C2849b.m11138a(kVar, "observer is null");
        try {
            C2793k<? super Object> a = C2962a.m11421a(this, kVar);
            C2849b.m11138a(a, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo5871b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C2819b.m11088b(th);
            C2962a.m11431b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: b */
    public final C2783a mo8918b() {
        return C2962a.m11418a((C2783a) new C2888k(this));
    }

    /* renamed from: b */
    public final C2790h<T> mo8919b(long j) {
        return j <= 0 ? C2962a.m11420a(this) : C2962a.m11420a(new C2902s(this, j));
    }

    /* renamed from: b */
    public final C2790h<T> mo8920b(long j, TimeUnit timeUnit) {
        return mo8904a(j, timeUnit, C2964b.m11436a());
    }

    /* renamed from: b */
    public final C2790h<T> mo8921b(long j, TimeUnit timeUnit, C2794l lVar) {
        C2849b.m11138a(timeUnit, "unit is null");
        C2849b.m11138a(lVar, "scheduler is null");
        return C2962a.m11420a(new C2913x(this, j, timeUnit, lVar));
    }

    /* renamed from: b */
    public final C2790h<T> mo8922b(C2792j<? extends T> jVar) {
        C2849b.m11138a(jVar, "other is null");
        return C2962a.m11420a(new C2907u(this, jVar));
    }

    /* renamed from: b */
    public final C2790h<T> mo8923b(C2794l lVar) {
        C2849b.m11138a(lVar, "scheduler is null");
        return C2962a.m11420a(new C2904t(this, lVar));
    }

    /* renamed from: b */
    public final <R> C2790h<R> mo8924b(C2828f<? super T, ? extends R> fVar) {
        C2849b.m11138a(fVar, "mapper is null");
        return C2962a.m11420a(new C2893n(this, fVar));
    }

    /* renamed from: b */
    public final C2790h<T> mo8925b(C2830h<? super T> hVar) {
        C2849b.m11138a(hVar, "stopPredicate is null");
        return C2962a.m11420a(new C2911w(this, hVar));
    }

    /* renamed from: b */
    public final C2790h<T> mo8926b(T t) {
        C2849b.m11138a(t, "defaultItem is null");
        return mo8922b(m10994c(t));
    }

    /* renamed from: b */
    public final C2810b mo8927b(C2827e<? super T> eVar) {
        return mo8915a(eVar, (C2827e<? super Throwable>) C2836a.f7423e, C2836a.f7421c, (C2827e<? super C2810b>) C2836a.m11126a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo5871b(C2793k<? super T> kVar);

    /* renamed from: c */
    public final C2790h<T> mo8928c(long j) {
        if (j >= 0) {
            return C2962a.m11420a(new C2909v(this, j));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j);
    }

    /* renamed from: c */
    public final C2790h<T> mo8929c(long j, TimeUnit timeUnit) {
        return mo8921b(j, timeUnit, C2964b.m11436a());
    }

    /* renamed from: d */
    public final C2790h<T> mo8930d() {
        return mo8902a(Long.MAX_VALUE);
    }
}
