package com.p131fb.fluid.p148ui.p149g.p152c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.p131fb.fluid.p148ui.views.PreferenceView;
import java.util.ArrayList;
import java.util.List;
import kotlin.C3265l;
import kotlin.Unit;
import kotlin.p195s.C3282h;
import kotlin.p197u.C3309c;
import kotlin.p197u.p199i.p200a.C3330d;
import kotlin.p197u.p199i.p200a.C3332f;
import kotlin.p197u.p199i.p200a.C3339l;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3359b0;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.C3418e0;
import p054c.p055a.p067b.p068f.C1116a;
import p190io.objectbox.android.BuildConfig;

/* renamed from: com.fb.fluid.ui.g.c.t */
public abstract class C2472t<T> {

    /* renamed from: a */
    private String f6215a = BuildConfig.FLAVOR;

    /* renamed from: b */
    private Object f6216b = true;

    /* renamed from: c */
    private C2459k0<T> f6217c;

    /* renamed from: d */
    private Object f6218d;

    /* renamed from: e */
    private boolean f6219e;

    /* renamed from: f */
    private boolean f6220f;

    /* renamed from: g */
    private boolean f6221g;

    /* renamed from: h */
    private Integer f6222h;

    /* renamed from: i */
    private Object f6223i = BuildConfig.FLAVOR;

    /* renamed from: j */
    private Object f6224j = BuildConfig.FLAVOR;

    /* renamed from: k */
    private Object f6225k = BuildConfig.FLAVOR;

    /* renamed from: l */
    private C3351c<? super C2472t<T>, ? super Integer, ? extends Object> f6226l;

    /* renamed from: m */
    private C3351c<? super C2472t<T>, ? super Integer, ? extends Object> f6227m;

    /* renamed from: n */
    private List<String> f6228n = new ArrayList();

    /* renamed from: o */
    private Integer f6229o;

    @C3332f(mo10052c = "com.fb.fluid.ui.preferences.items.PreferenceItemBase", mo10053f = "PreferenceItemBase.kt", mo10054l = {238, 269}, mo10055m = "setupPreferenceViewIcons")
    /* renamed from: com.fb.fluid.ui.g.c.t$a */
    static final class C2473a extends C3330d {

        /* renamed from: i */
        /* synthetic */ Object f6230i;

        /* renamed from: j */
        int f6231j;

        /* renamed from: k */
        final /* synthetic */ C2472t f6232k;

        /* renamed from: l */
        Object f6233l;

        /* renamed from: m */
        Object f6234m;

        /* renamed from: n */
        Object f6235n;

        /* renamed from: o */
        Object f6236o;

        /* renamed from: p */
        Object f6237p;

        /* renamed from: q */
        boolean f6238q;

        /* renamed from: r */
        int f6239r;

        /* renamed from: s */
        int f6240s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2473a(C2472t tVar, C3309c cVar) {
            super(cVar);
            this.f6232k = tVar;
        }

        /* renamed from: b */
        public final Object mo6618b(Object obj) {
            this.f6230i = obj;
            this.f6231j |= RecyclerView.UNDEFINED_DURATION;
            return this.f6232k.mo7325a((PreferenceView) null, false, (C3309c<? super Unit>) this);
        }
    }

    @C3332f(mo10052c = "com.fb.fluid.ui.preferences.items.PreferenceItemBase$setupPreferenceViewIcons$2", mo10053f = "PreferenceItemBase.kt", mo10054l = {}, mo10055m = "invokeSuspend")
    /* renamed from: com.fb.fluid.ui.g.c.t$b */
    static final class C2474b extends C3339l implements C3351c<C3418e0, C3309c<? super Drawable>, Object> {

        /* renamed from: j */
        private C3418e0 f6241j;

        /* renamed from: k */
        int f6242k;

        /* renamed from: l */
        final /* synthetic */ C2472t f6243l;

        /* renamed from: m */
        final /* synthetic */ PreferenceView f6244m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2474b(C2472t tVar, PreferenceView preferenceView, C3309c cVar) {
            super(2, cVar);
            this.f6243l = tVar;
            this.f6244m = preferenceView;
        }

        /* renamed from: a */
        public final Object mo6125a(Object obj, Object obj2) {
            return ((C2474b) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
        }

        /* renamed from: a */
        public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
            C3370k.m12227b(cVar, "completion");
            C2474b bVar = new C2474b(this.f6243l, this.f6244m, cVar);
            bVar.f6241j = (C3418e0) obj;
            return bVar;
        }

        /* renamed from: b */
        public final Object mo6618b(Object obj) {
            Object unused = C3326d.m12146a();
            if (this.f6242k == 0) {
                C3265l.m11979a(obj);
                Object e = this.f6243l.mo7336e();
                if (!C3359b0.m12202b(e, 2)) {
                    e = null;
                }
                C3351c cVar = (C3351c) e;
                if (cVar == null) {
                    return null;
                }
                Context context = this.f6244m.getContext();
                C3370k.m12223a((Object) context, "view.context");
                return (Drawable) cVar.mo6125a(context, this.f6243l);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C3332f(mo10052c = "com.fb.fluid.ui.preferences.items.PreferenceItemBase$setupPreferenceViewIcons$3", mo10053f = "PreferenceItemBase.kt", mo10054l = {}, mo10055m = "invokeSuspend")
    /* renamed from: com.fb.fluid.ui.g.c.t$c */
    static final class C2475c extends C3339l implements C3351c<C3418e0, C3309c<? super Drawable>, Object> {

        /* renamed from: j */
        private C3418e0 f6245j;

        /* renamed from: k */
        int f6246k;

        /* renamed from: l */
        final /* synthetic */ C2472t f6247l;

        /* renamed from: m */
        final /* synthetic */ PreferenceView f6248m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2475c(C2472t tVar, PreferenceView preferenceView, C3309c cVar) {
            super(2, cVar);
            this.f6247l = tVar;
            this.f6248m = preferenceView;
        }

        /* renamed from: a */
        public final Object mo6125a(Object obj, Object obj2) {
            return ((C2475c) mo6617a(obj, (C3309c<?>) (C3309c) obj2)).mo6618b(Unit.INSTANCE);
        }

        /* renamed from: a */
        public final C3309c<Unit> mo6617a(Object obj, C3309c<?> cVar) {
            C3370k.m12227b(cVar, "completion");
            C2475c cVar2 = new C2475c(this.f6247l, this.f6248m, cVar);
            cVar2.f6245j = (C3418e0) obj;
            return cVar2;
        }

        /* renamed from: b */
        public final Object mo6618b(Object obj) {
            Object unused = C3326d.m12146a();
            if (this.f6246k == 0) {
                C3265l.m11979a(obj);
                Object e = this.f6247l.mo7336e();
                if (!C3359b0.m12202b(e, 2)) {
                    e = null;
                }
                C3351c cVar = (C3351c) e;
                if (cVar == null) {
                    return null;
                }
                Context context = this.f6248m.getContext();
                C3370k.m12223a((Object) context, "view.context");
                return (Drawable) cVar.mo6125a(context, this.f6247l);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.fb.fluid.ui.g.c.t$d */
    public static final class C2476d extends C2472t<T> implements C2459k0<T> {

        /* renamed from: p */
        final /* synthetic */ C2472t f6249p;

        /* renamed from: q */
        final /* synthetic */ C3351c f6250q;

        /* renamed from: r */
        final /* synthetic */ C3350b f6251r;

        C2476d(C2472t tVar, C3351c cVar, C3350b bVar) {
            this.f6249p = tVar;
            this.f6250q = cVar;
            this.f6251r = bVar;
        }

        /* renamed from: a */
        public T mo7304a() {
            return this.f6251r.mo5146a(this.f6249p);
        }

        public void set(T t) {
            C3370k.m12227b(t, "value");
            C3351c cVar = this.f6250q;
            if (cVar != null) {
                Unit unit = (Unit) cVar.mo6125a(this, t);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ C2472t m9225a(C2472t tVar, Drawable drawable, Integer num, boolean z, Integer num2, C3351c cVar, int i, Object obj) {
        if (obj == null) {
            tVar.mo7316a((i & 1) != 0 ? null : drawable, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : cVar);
            return tVar;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: icon");
    }

    /* renamed from: a */
    public static /* synthetic */ C2472t m9226a(C2472t tVar, Boolean bool, C3349a aVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                bool = null;
            }
            if ((i & 2) != 0) {
                aVar = null;
            }
            tVar.mo7318a(bool, (C3349a<Boolean>) aVar);
            return tVar;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enabledState");
    }

    /* renamed from: a */
    public static /* synthetic */ C2472t m9227a(C2472t tVar, String str, Integer num, C3349a aVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                aVar = null;
            }
            tVar.mo7320a(str, num, (C3349a<String>) aVar);
            return tVar;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: summary");
    }

    /* renamed from: a */
    public static /* synthetic */ C2472t m9228a(C2472t tVar, String str, Integer num, C3350b bVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                bVar = null;
            }
            tVar.mo7321a(str, num, bVar);
            return tVar;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: description");
    }

    /* renamed from: a */
    public static /* synthetic */ C2472t m9229a(C2472t tVar, C3350b bVar, C3351c cVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                cVar = null;
            }
            tVar.mo7322a(bVar, cVar);
            return tVar;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: variable");
    }

    /* renamed from: a */
    public static /* synthetic */ void m9230a(C2472t tVar, Object obj, C1116a aVar, boolean z, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 4) != 0) {
                z = false;
            }
            tVar.mo7327a(obj, (C1116a<?>) aVar, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCurrentValue");
    }

    /* renamed from: b */
    public static /* synthetic */ C2472t m9231b(C2472t tVar, String str, Integer num, C3349a aVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                aVar = null;
            }
            tVar.mo7328b(str, num, aVar);
            return tVar;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: title");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r5v0, types: [kotlin.x.c.c<? super android.content.Context, ? super com.fb.fluid.ui.g.c.t<T>, ? extends android.graphics.drawable.Drawable>] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Incorrect type for immutable var: ssa=android.graphics.drawable.Drawable, code=java.lang.Object, for r1v0, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p131fb.fluid.p148ui.p149g.p152c.C2472t<T> mo7316a(java.lang.Object r1, java.lang.Integer r2, boolean r3, java.lang.Integer r4, kotlin.p205x.p206c.C3351c<? super android.content.Context, ? super com.p131fb.fluid.p148ui.p149g.p152c.C2472t<T>, ? extends android.graphics.drawable.Drawable> r5) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x0003
            goto L_0x0004
        L_0x0003:
            r1 = r2
        L_0x0004:
            if (r1 == 0) goto L_0x0007
            goto L_0x0008
        L_0x0007:
            r1 = r5
        L_0x0008:
            if (r1 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            java.lang.String r1 = ""
        L_0x000d:
            r0.f6218d = r1
            r0.f6219e = r3
            r0.f6222h = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.p148ui.p149g.p152c.C2472t.mo7316a(android.graphics.drawable.Drawable, java.lang.Integer, boolean, java.lang.Integer, kotlin.x.c.c):com.fb.fluid.ui.g.c.t");
    }

    /* renamed from: a */
    public final C2472t<T> mo7317a(C2459k0<T> k0Var) {
        C3370k.m12227b(k0Var, "valueHandler");
        this.f6217c = k0Var;
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [kotlin.x.c.a<java.lang.Boolean>] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Boolean, code=java.lang.Object, for r1v0, types: [java.lang.Boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p131fb.fluid.p148ui.p149g.p152c.C2472t<T> mo7318a(java.lang.Object r1, kotlin.p205x.p206c.C3349a<java.lang.Boolean> r2) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x0003
            goto L_0x0004
        L_0x0003:
            r1 = r2
        L_0x0004:
            if (r1 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            java.lang.String r1 = ""
        L_0x0009:
            r0.f6216b = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.p148ui.p149g.p152c.C2472t.mo7318a(java.lang.Boolean, kotlin.x.c.a):com.fb.fluid.ui.g.c.t");
    }

    /* renamed from: a */
    public final C2472t<T> mo7319a(String str) {
        C3370k.m12227b(str, "key");
        this.f6215a = str;
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r3v0, types: [kotlin.x.c.a<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p131fb.fluid.p148ui.p149g.p152c.C2472t<T> mo7320a(java.lang.String r1, java.lang.Integer r2, kotlin.p205x.p206c.C3349a<java.lang.String> r3) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x0003
            goto L_0x0004
        L_0x0003:
            r1 = r2
        L_0x0004:
            if (r1 == 0) goto L_0x0007
            goto L_0x0008
        L_0x0007:
            r1 = r3
        L_0x0008:
            if (r1 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            java.lang.String r1 = ""
        L_0x000d:
            r0.f6224j = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.p148ui.p149g.p152c.C2472t.mo7320a(java.lang.String, java.lang.Integer, kotlin.x.c.a):com.fb.fluid.ui.g.c.t");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r3v0, types: [kotlin.x.c.b<? super com.fb.fluid.ui.g.c.t<T>, java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p131fb.fluid.p148ui.p149g.p152c.C2472t<T> mo7321a(java.lang.String r1, java.lang.Integer r2, kotlin.p205x.p206c.C3350b<? super com.p131fb.fluid.p148ui.p149g.p152c.C2472t<T>, java.lang.String> r3) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x0003
            goto L_0x0004
        L_0x0003:
            r1 = r2
        L_0x0004:
            if (r1 == 0) goto L_0x0007
            goto L_0x0008
        L_0x0007:
            r1 = r3
        L_0x0008:
            if (r1 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            java.lang.String r1 = ""
        L_0x000d:
            r0.f6225k = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.p148ui.p149g.p152c.C2472t.mo7321a(java.lang.String, java.lang.Integer, kotlin.x.c.b):com.fb.fluid.ui.g.c.t");
    }

    /* renamed from: a */
    public final C2472t<T> mo7322a(C3350b<? super C2472t<T>, ? extends T> bVar, C3351c<? super C2472t<T>, ? super T, Unit> cVar) {
        C3370k.m12227b(bVar, "getter");
        mo7317a(new C2476d(this, cVar, bVar));
        return this;
    }

    /* renamed from: a */
    public final <TP extends C2472t<T>> C2472t<T> mo7315a(C3351c<? super TP, ? super Integer, Unit> cVar) {
        C3359b0.m12198a((Object) cVar, 2);
        this.f6226l = cVar;
        return this;
    }

    /* renamed from: a */
    public final C2472t<T> mo7323a(boolean z) {
        this.f6220f = z;
        return this;
    }

    /* renamed from: a */
    public final C2472t<T> mo7324a(String... strArr) {
        C3370k.m12227b(strArr, "keys");
        this.f6228n.clear();
        boolean unused = C3289o.m12080a(this.f6228n, (T[]) strArr);
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo7325a(com.p131fb.fluid.p148ui.views.PreferenceView r28, boolean r29, kotlin.p197u.C3309c<? super kotlin.Unit> r30) {
        /*
            r27 = this;
            r0 = r27
            r9 = r28
            r1 = r30
            boolean r2 = r1 instanceof com.p131fb.fluid.p148ui.p149g.p152c.C2472t.C2473a
            if (r2 == 0) goto L_0x0019
            r2 = r1
            com.fb.fluid.ui.g.c.t$a r2 = (com.p131fb.fluid.p148ui.p149g.p152c.C2472t.C2473a) r2
            int r3 = r2.f6231j
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.f6231j = r3
            goto L_0x001e
        L_0x0019:
            com.fb.fluid.ui.g.c.t$a r2 = new com.fb.fluid.ui.g.c.t$a
            r2.<init>(r0, r1)
        L_0x001e:
            r10 = r2
            java.lang.Object r1 = r10.f6230i
            java.lang.Object r11 = kotlin.p197u.p198h.C3326d.m12146a()
            int r2 = r10.f6231j
            java.lang.String r12 = "null cannot be cast to non-null type android.graphics.drawable.Drawable"
            java.lang.String r13 = "null cannot be cast to non-null type kotlin.Int"
            r8 = 2
            r7 = 1
            if (r2 == 0) goto L_0x008b
            if (r2 == r7) goto L_0x005e
            if (r2 != r8) goto L_0x0056
            java.lang.Object r2 = r10.f6237p
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r15 = r10.f6240s
            int r3 = r10.f6239r
            java.lang.Object r4 = r10.f6236o
            com.fb.fluid.ui.views.PreferenceView r4 = (com.p131fb.fluid.p148ui.views.PreferenceView) r4
            java.lang.Object r5 = r10.f6235n
            java.lang.Integer r5 = (java.lang.Integer) r5
            boolean r5 = r10.f6238q
            java.lang.Object r6 = r10.f6234m
            com.fb.fluid.ui.views.PreferenceView r6 = (com.p131fb.fluid.p148ui.views.PreferenceView) r6
            java.lang.Object r6 = r10.f6233l
            com.fb.fluid.ui.g.c.t r6 = (com.p131fb.fluid.p148ui.p149g.p152c.C2472t) r6
            kotlin.C3265l.m11979a((java.lang.Object) r1)
            r6 = r2
            r2 = r4
            r7 = r5
            r4 = r15
            goto L_0x01a1
        L_0x0056:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005e:
            java.lang.Object r2 = r10.f6237p
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r10.f6240s
            int r4 = r10.f6239r
            java.lang.Object r5 = r10.f6236o
            com.fb.fluid.ui.views.PreferenceView r5 = (com.p131fb.fluid.p148ui.views.PreferenceView) r5
            java.lang.Object r6 = r10.f6235n
            java.lang.Integer r6 = (java.lang.Integer) r6
            boolean r9 = r10.f6238q
            java.lang.Object r8 = r10.f6234m
            com.fb.fluid.ui.views.PreferenceView r8 = (com.p131fb.fluid.p148ui.views.PreferenceView) r8
            java.lang.Object r15 = r10.f6233l
            com.fb.fluid.ui.g.c.t r15 = (com.p131fb.fluid.p148ui.p149g.p152c.C2472t) r15
            kotlin.C3265l.m11979a((java.lang.Object) r1)
            r22 = r2
            r20 = r3
            r19 = r4
            r18 = r5
            r14 = 2
            r26 = r9
            r9 = r8
            r8 = r26
            goto L_0x0102
        L_0x008b:
            kotlin.C3265l.m11979a((java.lang.Object) r1)
            java.lang.Integer r1 = r0.f6222h
            if (r1 == 0) goto L_0x0094
        L_0x0092:
            r15 = r1
            goto L_0x00af
        L_0x0094:
            java.lang.Integer r1 = r0.f6229o
            if (r1 == 0) goto L_0x00ae
            if (r1 == 0) goto L_0x00a6
            int r1 = r1.intValue()
            boolean r1 = com.p131fb.fluid.p135l.p139p.C1767c.m7446a(r1)
            if (r1 != r7) goto L_0x00a6
            r1 = -1
            goto L_0x00a9
        L_0x00a6:
            r1 = -12303292(0xffffffffff444444, float:-2.6088314E38)
        L_0x00a9:
            java.lang.Integer r1 = kotlin.p197u.p199i.p200a.C3328b.m12155a((int) r1)
            goto L_0x0092
        L_0x00ae:
            r15 = 0
        L_0x00af:
            boolean r1 = r0.f6219e
            if (r1 != 0) goto L_0x00c8
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r8 = 15
            r16 = 0
            r1 = r28
            r6 = r29
            r7 = r8
            r14 = 2
            r8 = r16
        L_0x00c3:
            com.p131fb.fluid.p148ui.views.PreferenceView.m9366a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0154
        L_0x00c8:
            r14 = 2
            java.lang.Object r1 = r0.f6218d
            boolean r1 = kotlin.p205x.p207d.C3359b0.m12202b(r1, r14)
            if (r1 == 0) goto L_0x0113
            kotlinx.coroutines.z r1 = kotlinx.coroutines.C3536t0.m12776a()
            com.fb.fluid.ui.g.c.t$b r2 = new com.fb.fluid.ui.g.c.t$b
            r3 = 0
            r2.<init>(r0, r9, r3)
            r10.f6233l = r0
            r10.f6234m = r9
            r8 = r29
            r10.f6238q = r8
            r10.f6235n = r15
            r10.f6236o = r9
            r3 = 0
            r10.f6239r = r3
            r10.f6240s = r3
            r10.f6237p = r15
            r7 = 1
            r10.f6231j = r7
            java.lang.Object r1 = kotlinx.coroutines.C3412d.m12326a(r1, r2, r10)
            if (r1 != r11) goto L_0x00f8
            return r11
        L_0x00f8:
            r18 = r9
            r6 = r15
            r22 = r6
            r19 = 0
            r20 = 0
            r15 = r0
        L_0x0102:
            r21 = r1
            android.graphics.drawable.Drawable r21 = (android.graphics.drawable.Drawable) r21
            r24 = 3
            r25 = 0
            r23 = r8
            com.p131fb.fluid.p148ui.views.PreferenceView.m9366a(r18, r19, r20, r21, r22, r23, r24, r25)
            r5 = r6
            r6 = r8
            r1 = r9
            goto L_0x0159
        L_0x0113:
            r8 = r29
            r7 = 1
            java.lang.Object r1 = r0.f6218d
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L_0x013a
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x0134
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r2 = r1.intValue()
            r16 = 6
            r17 = 0
            r1 = r28
            r5 = r15
            r6 = r29
            r7 = r16
            r8 = r17
            goto L_0x00c3
        L_0x0134:
            kotlin.p r1 = new kotlin.p
            r1.<init>(r13)
            throw r1
        L_0x013a:
            boolean r2 = r1 instanceof android.graphics.drawable.Drawable
            if (r2 == 0) goto L_0x0154
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x014e
            r4 = r1
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
            r7 = 3
            r8 = 0
            r1 = r28
            r5 = r15
            r6 = r29
            goto L_0x00c3
        L_0x014e:
            kotlin.p r1 = new kotlin.p
            r1.<init>(r12)
            throw r1
        L_0x0154:
            r6 = r29
            r1 = r9
            r5 = r15
            r15 = r0
        L_0x0159:
            boolean r2 = r15.f6219e
            if (r2 == 0) goto L_0x0169
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 15
        L_0x0163:
            r8 = 0
        L_0x0164:
            com.p131fb.fluid.p148ui.views.PreferenceView.m9368b(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01db
        L_0x0169:
            java.lang.Object r2 = r15.f6218d
            boolean r2 = kotlin.p205x.p207d.C3359b0.m12202b(r2, r14)
            if (r2 == 0) goto L_0x01aa
            r2 = 1
            r1.setForceStartSpacing(r2)
            kotlinx.coroutines.z r2 = kotlinx.coroutines.C3536t0.m12776a()
            com.fb.fluid.ui.g.c.t$c r3 = new com.fb.fluid.ui.g.c.t$c
            r4 = 0
            r3.<init>(r15, r1, r4)
            r10.f6233l = r15
            r10.f6234m = r1
            r10.f6238q = r6
            r10.f6235n = r5
            r10.f6236o = r1
            r4 = 0
            r10.f6239r = r4
            r10.f6240s = r4
            r10.f6237p = r5
            r10.f6231j = r14
            java.lang.Object r2 = kotlinx.coroutines.C3412d.m12326a(r2, r3, r10)
            if (r2 != r11) goto L_0x0199
            return r11
        L_0x0199:
            r7 = r6
            r3 = 0
            r6 = r5
            r26 = r2
            r2 = r1
            r1 = r26
        L_0x01a1:
            r5 = r1
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            r8 = 3
            r9 = 0
            com.p131fb.fluid.p148ui.views.PreferenceView.m9368b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x01db
        L_0x01aa:
            java.lang.Object r2 = r15.f6218d
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x01c2
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x01bc
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r7 = 6
            goto L_0x0163
        L_0x01bc:
            kotlin.p r1 = new kotlin.p
            r1.<init>(r13)
            throw r1
        L_0x01c2:
            boolean r3 = r2 instanceof android.graphics.drawable.Drawable
            if (r3 == 0) goto L_0x01db
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x01d5
            r7 = r2
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            r8 = 3
            r9 = 0
            r2 = r3
            r3 = r4
            r4 = r7
            r7 = r8
            r8 = r9
            goto L_0x0164
        L_0x01d5:
            kotlin.p r1 = new kotlin.p
            r1.<init>(r12)
            throw r1
        L_0x01db:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.p148ui.p149g.p152c.C2472t.mo7325a(com.fb.fluid.ui.views.PreferenceView, boolean, kotlin.u.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        r4 = (java.lang.String) r0.mo5146a(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo7326a(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            kotlin.p205x.p207d.C3370k.m12227b(r4, r0)
            java.lang.Object r0 = r3.f6225k
            boolean r1 = r0 instanceof java.lang.String
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0011
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0040
        L_0x0011:
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0025
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.String r2 = r4.getString(r0)
            java.lang.String r4 = "context.getString(it)"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r2, (java.lang.String) r4)
            goto L_0x0040
        L_0x0025:
            r4 = 1
            boolean r1 = kotlin.p205x.p207d.C3359b0.m12202b(r0, r4)
            if (r1 == 0) goto L_0x0040
            boolean r4 = kotlin.p205x.p207d.C3359b0.m12202b(r0, r4)
            if (r4 != 0) goto L_0x0033
            r0 = 0
        L_0x0033:
            kotlin.x.c.b r0 = (kotlin.p205x.p206c.C3350b) r0
            if (r0 == 0) goto L_0x0040
            java.lang.Object r4 = r0.mo5146a(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0040
            r2 = r4
        L_0x0040:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.p148ui.p149g.p152c.C2472t.mo7326a(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    public final void mo7327a(T t, C1116a<?> aVar, boolean z) {
        List<?> b;
        C3370k.m12227b(t, "value");
        C2459k0<T> k0Var = this.f6217c;
        if (k0Var != null) {
            k0Var.set(t);
        }
        if (aVar != null && (b = aVar.mo5204b()) != null) {
            int i = 0;
            for (T next : b) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (next instanceof C2472t) {
                        C2472t tVar = (C2472t) next;
                        if ((C3370k.m12225a((Object) tVar.f6215a, (Object) this.f6215a) && z) || tVar.f6228n.contains(this.f6215a)) {
                            aVar.mo5199a(i);
                        }
                    }
                    i = i2;
                } else {
                    C3282h.m12055c();
                    throw null;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r3v0, types: [kotlin.x.c.a<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p131fb.fluid.p148ui.p149g.p152c.C2472t<T> mo7328b(java.lang.String r1, java.lang.Integer r2, kotlin.p205x.p206c.C3349a<java.lang.String> r3) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x0003
            goto L_0x0004
        L_0x0003:
            r1 = r2
        L_0x0004:
            if (r1 == 0) goto L_0x0007
            goto L_0x0008
        L_0x0007:
            r1 = r3
        L_0x0008:
            if (r1 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            java.lang.String r1 = ""
        L_0x000d:
            r0.f6223i = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.p148ui.p149g.p152c.C2472t.mo7328b(java.lang.String, java.lang.Integer, kotlin.x.c.a):com.fb.fluid.ui.g.c.t");
    }

    /* renamed from: b */
    public final C2472t<T> mo7329b(C3351c<? super C2472t<T>, ? super Integer, Unit> cVar) {
        this.f6227m = cVar;
        return this;
    }

    /* renamed from: b */
    public final C2472t<T> mo7330b(boolean z) {
        this.f6221g = z;
        return this;
    }

    /* renamed from: b */
    public final Integer mo7331b() {
        return this.f6229o;
    }

    /* renamed from: b */
    public final String mo7332b(Context context) {
        C3370k.m12227b(context, "context");
        Object obj = this.f6224j;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Integer) {
            String string = context.getString(((Number) obj).intValue());
            C3370k.m12223a((Object) string, "context.getString(it)");
            return string;
        } else if (!C3359b0.m12202b(obj, 0)) {
            return BuildConfig.FLAVOR;
        } else {
            Object invoke = ((C3349a) obj).invoke();
            if (!(invoke instanceof String)) {
                invoke = null;
            }
            String str = (String) invoke;
            return str != null ? str : BuildConfig.FLAVOR;
        }
    }

    /* renamed from: c */
    public final T mo7333c() {
        C2459k0<T> k0Var = this.f6217c;
        if (k0Var != null) {
            return k0Var.mo7304a();
        }
        return null;
    }

    /* renamed from: c */
    public final String mo7334c(Context context) {
        C3370k.m12227b(context, "context");
        Object obj = this.f6223i;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Integer) {
            String string = context.getString(((Number) obj).intValue());
            C3370k.m12223a((Object) string, "context.getString(it)");
            return string;
        } else if (!C3359b0.m12202b(obj, 0)) {
            return BuildConfig.FLAVOR;
        } else {
            Object invoke = ((C3349a) obj).invoke();
            if (!(invoke instanceof String)) {
                invoke = null;
            }
            String str = (String) invoke;
            return str != null ? str : BuildConfig.FLAVOR;
        }
    }

    /* renamed from: d */
    public final boolean mo7335d() {
        return this.f6220f;
    }

    /* renamed from: e */
    public final Object mo7336e() {
        return this.f6218d;
    }

    /* renamed from: f */
    public final String mo7337f() {
        return this.f6215a;
    }

    /* renamed from: g */
    public final boolean mo7338g() {
        return this.f6221g;
    }

    /* renamed from: h */
    public final List<String> mo7339h() {
        return this.f6228n;
    }

    /* renamed from: i */
    public final C3351c<C2472t<T>, Integer, Object> mo7340i() {
        return this.f6226l;
    }

    /* renamed from: j */
    public final C3351c<C2472t<T>, Integer, Object> mo7341j() {
        return this.f6227m;
    }

    /* renamed from: k */
    public final boolean mo7342k() {
        Boolean bool;
        Object obj = this.f6216b;
        if (obj instanceof Boolean) {
            bool = (Boolean) obj;
        } else if (!C3359b0.m12202b(obj, 0)) {
            return true;
        } else {
            Object invoke = ((C3349a) obj).invoke();
            if (!(invoke instanceof Boolean)) {
                invoke = null;
            }
            bool = (Boolean) invoke;
            if (bool == null) {
                return true;
            }
        }
        return bool.booleanValue();
    }

    /* renamed from: l */
    public final boolean mo7343l() {
        return this.f6219e;
    }
}
