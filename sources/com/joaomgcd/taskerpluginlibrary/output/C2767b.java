package com.joaomgcd.taskerpluginlibrary.output;

import android.content.Context;
import android.os.Build;
import com.joaomgcd.taskerpluginlibrary.output.C2766a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.joaomgcd.taskerpluginlibrary.output.b */
public abstract class C2767b<TTaskerVariable extends C2766a> extends ArrayList<TTaskerVariable> {
    /* renamed from: a */
    private final List<TTaskerVariable> m10927a(Collection<? extends TTaskerVariable> collection) {
        ArrayList arrayList = new ArrayList();
        for (T next : collection) {
            if (m10930f((C2766a) next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static /* synthetic */ void m10928a(C2767b bVar, Context context, Class cls, Object obj, C3350b bVar2, boolean z, ArrayList arrayList, int i, Object obj2) {
        if (obj2 == null) {
            bVar.mo8865a(context, cls, (i & 4) != 0 ? null : obj, (i & 8) != 0 ? null : bVar2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : arrayList);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: add");
    }

    /* renamed from: b */
    private final List<TTaskerVariable> m10929b(Collection<? extends TTaskerVariable> collection) {
        return m10927a(collection);
    }

    /* renamed from: f */
    private final boolean m10930f(TTaskerVariable ttaskervariable) {
        return !ttaskervariable.mo8854a() && Build.VERSION.SDK_INT >= ttaskervariable.mo8856c() && Build.VERSION.SDK_INT <= ttaskervariable.mo8855b();
    }

    /* renamed from: a */
    public /* bridge */ int mo8861a() {
        return super.size();
    }

    /* renamed from: a */
    public final TTaskerVariable mo8862a(String str) {
        TTaskerVariable ttaskervariable;
        C3370k.m12227b(str, "name");
        Iterator it = iterator();
        while (true) {
            if (!it.hasNext()) {
                ttaskervariable = null;
                break;
            }
            ttaskervariable = it.next();
            if (C3370k.m12225a((Object) ((C2766a) ttaskervariable).mo8858e(), (Object) str)) {
                break;
            }
        }
        return (C2766a) ttaskervariable;
    }

    /* renamed from: a */
    public abstract List<TTaskerVariable> mo8863a(Context context, TaskerOutputVariable taskerOutputVariable, Method method, Object obj, boolean z, boolean z2, ArrayList<Integer> arrayList);

    /* renamed from: a */
    public void add(int i, TTaskerVariable ttaskervariable) {
        C3370k.m12227b(ttaskervariable, "element");
        if (m10930f(ttaskervariable)) {
            super.add(i, ttaskervariable);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ee A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8865a(android.content.Context r23, java.lang.Class<?> r24, java.lang.Object r25, kotlin.p205x.p206c.C3350b<? super TTaskerVariable, java.lang.Boolean> r26, boolean r27, java.util.ArrayList<java.lang.Integer> r28) {
        /*
            r22 = this;
            r9 = r22
            r10 = r25
            r11 = r26
            java.lang.String r0 = "context"
            r12 = r23
            kotlin.p205x.p207d.C3370k.m12227b(r12, r0)
            java.lang.String r0 = "type"
            r1 = r24
            kotlin.p205x.p207d.C3370k.m12227b(r1, r0)
            boolean r13 = r24.isArray()
            if (r13 == 0) goto L_0x0024
            java.lang.Class r0 = r24.getComponentType()
            java.lang.String r1 = "realType.componentType"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r0, (java.lang.String) r1)
            goto L_0x0025
        L_0x0024:
            r0 = r1
        L_0x0025:
            java.lang.reflect.Method[] r0 = r0.getMethods()
            java.lang.String r1 = "methods"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r0, (java.lang.String) r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.length
            r4 = 0
        L_0x003a:
            if (r4 >= r3) goto L_0x0050
            r5 = r0[r4]
            java.lang.Class<com.joaomgcd.taskerpluginlibrary.output.TaskerOutputVariable> r6 = com.joaomgcd.taskerpluginlibrary.output.TaskerOutputVariable.class
            boolean r6 = r5.isAnnotationPresent(r6)
            if (r6 == 0) goto L_0x004a
            r1.add(r5)
            goto L_0x004d
        L_0x004a:
            r2.add(r5)
        L_0x004d:
            int r4 = r4 + 1
            goto L_0x003a
        L_0x0050:
            kotlin.j r0 = new kotlin.j
            r0.<init>(r1, r2)
            java.lang.Object r1 = r0.mo9934a()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.mo9935b()
            r8 = r0
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r15 = new java.util.ArrayList
            r7 = 10
            int r0 = kotlin.p195s.C3285k.m12075a(r1, r7)
            r15.<init>(r0)
            java.util.Iterator r16 = r1.iterator()
        L_0x0071:
            boolean r0 = r16.hasNext()
            java.lang.String r1 = "it"
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r0 = r16.next()
            r3 = r0
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Class<com.joaomgcd.taskerpluginlibrary.output.TaskerOutputVariable> r0 = com.joaomgcd.taskerpluginlibrary.output.TaskerOutputVariable.class
            java.lang.annotation.Annotation r0 = r3.getAnnotation(r0)
            java.lang.String r2 = "it.getAnnotation(TaskerOutputVariable::class.java)"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r0, (java.lang.String) r2)
            r2 = r0
            com.joaomgcd.taskerpluginlibrary.output.TaskerOutputVariable r2 = (com.joaomgcd.taskerpluginlibrary.output.TaskerOutputVariable) r2
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r3, (java.lang.String) r1)
            r0 = r22
            r1 = r23
            r4 = r25
            r5 = r13
            r6 = r27
            r14 = 10
            r7 = r28
            java.util.List r0 = r0.mo8863a(r1, r2, r3, r4, r5, r6, r7)
            r15.add(r0)
            r7 = 10
            goto L_0x0071
        L_0x00a8:
            r14 = 10
            java.util.List r0 = kotlin.p195s.C3285k.m12076a(r15)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.p195s.C3285k.m12075a(r0, r14)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x00bb:
            boolean r3 = r0.hasNext()
            r14 = 1
            if (r3 == 0) goto L_0x00de
            java.lang.Object r3 = r0.next()
            com.joaomgcd.taskerpluginlibrary.output.a r3 = (com.joaomgcd.taskerpluginlibrary.output.C2766a) r3
            if (r11 == 0) goto L_0x00d6
            java.lang.Object r4 = r11.mo5146a(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r14 = r14 ^ r4
            goto L_0x00d7
        L_0x00d6:
            r14 = 0
        L_0x00d7:
            r3.mo8853a((boolean) r14)
            r2.add(r3)
            goto L_0x00bb
        L_0x00de:
            java.util.List r0 = r9.m10929b(r2)
            r9.addAll(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r8.iterator()
        L_0x00ee:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x012b
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r4, (java.lang.String) r1)
            java.lang.Class r5 = r4.getReturnType()
            java.lang.Class<com.joaomgcd.taskerpluginlibrary.output.TaskerOutputObject> r6 = com.joaomgcd.taskerpluginlibrary.output.TaskerOutputObject.class
            boolean r5 = r5.isAnnotationPresent(r6)
            if (r5 != 0) goto L_0x0124
            java.lang.Class r4 = r4.getReturnType()
            java.lang.String r5 = "it.returnType"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r4, (java.lang.String) r5)
            java.lang.Class r4 = r4.getComponentType()
            if (r4 == 0) goto L_0x0122
            java.lang.Class<com.joaomgcd.taskerpluginlibrary.output.TaskerOutputObject> r5 = com.joaomgcd.taskerpluginlibrary.output.TaskerOutputObject.class
            boolean r4 = r4.isAnnotationPresent(r5)
            if (r4 != r14) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r4 = 0
            goto L_0x0125
        L_0x0124:
            r4 = 1
        L_0x0125:
            if (r4 == 0) goto L_0x00ee
            r0.add(r3)
            goto L_0x00ee
        L_0x012b:
            java.util.Iterator r15 = r0.iterator()
        L_0x012f:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x01cd
            java.lang.Object r0 = r15.next()
            r7 = r0
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.String r8 = "method.returnType"
            java.lang.String r6 = "method"
            if (r10 != 0) goto L_0x0162
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r7, (java.lang.String) r6)
            java.lang.Class r2 = r7.getReturnType()
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r2, (java.lang.String) r8)
            r6 = 0
            r7 = 32
            r8 = 0
            r0 = r22
            r1 = r23
            r3 = r25
        L_0x0156:
            r4 = r26
            r5 = r13
            m10928a(r0, r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x015c:
            r7 = r28
            r18 = 0
            goto L_0x01ca
        L_0x0162:
            if (r13 != 0) goto L_0x017e
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r7, (java.lang.String) r6)
            java.lang.Class r2 = r7.getReturnType()
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r2, (java.lang.String) r8)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object r3 = r7.invoke(r10, r1)
            r6 = 0
            r7 = 32
            r8 = 0
            r0 = r22
            r1 = r23
            goto L_0x0156
        L_0x017e:
            r5 = r10
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            int r4 = r5.length
            r0 = 0
            r3 = 0
        L_0x0184:
            if (r3 >= r4) goto L_0x015c
            r1 = r5[r3]
            int r16 = r0 + 1
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r7, (java.lang.String) r6)
            java.lang.Class r2 = r7.getReturnType()
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r2, (java.lang.String) r8)
            r0 = 0
            java.lang.Object[] r14 = new java.lang.Object[r0]
            java.lang.Object r14 = r7.invoke(r1, r14)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r27 = r7
            r7 = r28
            java.util.ArrayList r17 = p054c.p119h.p120a.p122i.C1472a.m6705a(r7, r1)
            r18 = 0
            r0 = r22
            r1 = r23
            r19 = r3
            r3 = r14
            r14 = r4
            r4 = r26
            r20 = r5
            r5 = r13
            r21 = r6
            r6 = r17
            r0.mo8865a(r1, r2, r3, r4, r5, r6)
            int r3 = r19 + 1
            r7 = r27
            r4 = r14
            r0 = r16
            r5 = r20
            r6 = r21
            r14 = 1
            goto L_0x0184
        L_0x01ca:
            r14 = 1
            goto L_0x012f
        L_0x01cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.joaomgcd.taskerpluginlibrary.output.C2767b.mo8865a(android.content.Context, java.lang.Class, java.lang.Object, kotlin.x.c.b, boolean, java.util.ArrayList):void");
    }

    /* renamed from: a */
    public final void mo8866a(String str, CharSequence charSequence) {
        C2766a a;
        C3370k.m12227b(str, "oldName");
        if (charSequence != null) {
            if (!(charSequence.length() == 0) && (a = mo8862a(str)) != null) {
                a.mo8852a(charSequence.toString());
            }
        }
    }

    /* renamed from: a */
    public boolean add(TTaskerVariable ttaskervariable) {
        C3370k.m12227b(ttaskervariable, "element");
        if (!m10930f(ttaskervariable)) {
            return false;
        }
        return super.add(ttaskervariable);
    }

    public boolean addAll(int i, Collection<? extends TTaskerVariable> collection) {
        C3370k.m12227b(collection, "elements");
        return super.addAll(i, m10929b(collection));
    }

    public boolean addAll(Collection<? extends TTaskerVariable> collection) {
        C3370k.m12227b(collection, "elements");
        return super.addAll(m10929b(collection));
    }

    /* renamed from: b */
    public /* bridge */ boolean mo8872b(C2766a aVar) {
        return super.contains(aVar);
    }

    /* renamed from: c */
    public /* bridge */ int mo8873c(C2766a aVar) {
        return super.indexOf(aVar);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C2766a) {
            return mo8872b((C2766a) obj);
        }
        return false;
    }

    /* renamed from: d */
    public /* bridge */ int mo8875d(C2766a aVar) {
        return super.lastIndexOf(aVar);
    }

    /* renamed from: e */
    public /* bridge */ boolean mo8876e(C2766a aVar) {
        return super.remove(aVar);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C2766a) {
            return mo8873c((C2766a) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C2766a) {
            return mo8875d((C2766a) obj);
        }
        return -1;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C2766a) {
            return mo8876e((C2766a) obj);
        }
        return false;
    }

    public final /* bridge */ int size() {
        return mo8861a();
    }
}
