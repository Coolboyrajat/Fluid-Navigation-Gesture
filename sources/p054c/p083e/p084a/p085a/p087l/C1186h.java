package p054c.p083e.p084a.p085a.p087l;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p006b.p021d.C0736g;

/* renamed from: c.e.a.a.l.h */
public class C1186h {

    /* renamed from: a */
    private final C0736g<String, C1187i> f3927a = new C0736g<>();

    /* renamed from: b */
    private final C0736g<String, PropertyValuesHolder[]> f3928b = new C0736g<>();

    /* renamed from: a */
    public static C1186h m5746a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m5748a((List<Animator>) ((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m5748a((List<Animator>) arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* renamed from: a */
    public static C1186h m5747a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m5746a(context, resourceId);
    }

    /* renamed from: a */
    private static C1186h m5748a(List<Animator> list) {
        C1186h hVar = new C1186h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m5749a(hVar, list.get(i));
        }
        return hVar;
    }

    /* renamed from: a */
    private static void m5749a(C1186h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.mo5311a(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.mo5310a(objectAnimator.getPropertyName(), C1187i.m5755a((ValueAnimator) objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    /* renamed from: a */
    public long mo5308a() {
        int size = this.f3927a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C1187i d = this.f3927a.mo4199d(i);
            j = Math.max(j, d.mo5316a() + d.mo5318b());
        }
        return j;
    }

    /* renamed from: a */
    public C1187i mo5309a(String str) {
        if (mo5312b(str)) {
            return this.f3927a.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public void mo5310a(String str, C1187i iVar) {
        this.f3927a.put(str, iVar);
    }

    /* renamed from: a */
    public void mo5311a(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f3928b.put(str, propertyValuesHolderArr);
    }

    /* renamed from: b */
    public boolean mo5312b(String str) {
        return this.f3927a.get(str) != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1186h)) {
            return false;
        }
        return this.f3927a.equals(((C1186h) obj).f3927a);
    }

    public int hashCode() {
        return this.f3927a.hashCode();
    }

    public String toString() {
        return 10 + C1186h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3927a + "}\n";
    }
}
