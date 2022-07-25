package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C0311a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p006b.p026g.p028e.p029a.C0794a;
import p006b.p026g.p035k.C0899w;

/* renamed from: androidx.appcompat.view.menu.g */
public class C0081g implements C0794a {

    /* renamed from: A */
    private static final int[] f423A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f424a;

    /* renamed from: b */
    private final Resources f425b;

    /* renamed from: c */
    private boolean f426c;

    /* renamed from: d */
    private boolean f427d;

    /* renamed from: e */
    private C0082a f428e;

    /* renamed from: f */
    private ArrayList<C0086j> f429f;

    /* renamed from: g */
    private ArrayList<C0086j> f430g;

    /* renamed from: h */
    private boolean f431h;

    /* renamed from: i */
    private ArrayList<C0086j> f432i;

    /* renamed from: j */
    private ArrayList<C0086j> f433j;

    /* renamed from: k */
    private boolean f434k;

    /* renamed from: l */
    private int f435l = 0;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f436m;

    /* renamed from: n */
    CharSequence f437n;

    /* renamed from: o */
    Drawable f438o;

    /* renamed from: p */
    View f439p;

    /* renamed from: q */
    private boolean f440q = false;

    /* renamed from: r */
    private boolean f441r = false;

    /* renamed from: s */
    private boolean f442s = false;

    /* renamed from: t */
    private boolean f443t = false;

    /* renamed from: u */
    private boolean f444u = false;

    /* renamed from: v */
    private ArrayList<C0086j> f445v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<C0097n>> f446w = new CopyOnWriteArrayList<>();

    /* renamed from: x */
    private C0086j f447x;

    /* renamed from: y */
    private boolean f448y = false;

    /* renamed from: z */
    private boolean f449z;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    public interface C0082a {
        /* renamed from: a */
        void mo177a(C0081g gVar);

        /* renamed from: a */
        boolean mo180a(C0081g gVar, MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.view.menu.g$b */
    public interface C0083b {
        /* renamed from: a */
        boolean mo312a(C0086j jVar);
    }

    public C0081g(Context context) {
        this.f424a = context;
        this.f425b = context.getResources();
        this.f429f = new ArrayList<>();
        this.f430g = new ArrayList<>();
        this.f431h = true;
        this.f432i = new ArrayList<>();
        this.f433j = new ArrayList<>();
        this.f434k = true;
        m422e(true);
    }

    /* renamed from: a */
    private static int m416a(ArrayList<C0086j> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo528c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private C0086j m417a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0086j(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: a */
    private void m418a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources l = mo499l();
        if (view != null) {
            this.f439p = view;
            this.f437n = null;
            this.f438o = null;
        } else {
            if (i > 0) {
                this.f437n = l.getText(i);
            } else if (charSequence != null) {
                this.f437n = charSequence;
            }
            if (i2 > 0) {
                this.f438o = C0311a.m1534c(mo487e(), i2);
            } else if (drawable != null) {
                this.f438o = drawable;
            }
            this.f439p = null;
        }
        mo475b(false);
    }

    /* renamed from: a */
    private void m419a(int i, boolean z) {
        if (i >= 0 && i < this.f429f.size()) {
            this.f429f.remove(i);
            if (z) {
                mo475b(true);
            }
        }
    }

    /* renamed from: a */
    private boolean m420a(C0106s sVar, C0097n nVar) {
        boolean z = false;
        if (this.f446w.isEmpty()) {
            return false;
        }
        if (nVar != null) {
            z = nVar.mo395a(sVar);
        }
        Iterator<WeakReference<C0097n>> it = this.f446w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0097n nVar2 = (C0097n) next.get();
            if (nVar2 == null) {
                this.f446w.remove(next);
            } else if (!z) {
                z = nVar2.mo395a(sVar);
            }
        }
        return z;
    }

    /* renamed from: d */
    private void m421d(boolean z) {
        if (!this.f446w.isEmpty()) {
            mo510s();
            Iterator<WeakReference<C0097n>> it = this.f446w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0097n nVar = (C0097n) next.get();
                if (nVar == null) {
                    this.f446w.remove(next);
                } else {
                    nVar.mo391a(z);
                }
            }
            mo507r();
        }
    }

    /* renamed from: e */
    private void m422e(boolean z) {
        boolean z2 = true;
        if (!z || this.f425b.getConfiguration().keyboard == 1 || !C0899w.m4843d(ViewConfiguration.get(this.f424a), this.f424a)) {
            z2 = false;
        }
        this.f427d = z2;
    }

    /* renamed from: f */
    private static int m423f(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f423A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: a */
    public int mo443a(int i) {
        return mo444a(i, 0);
    }

    /* renamed from: a */
    public int mo444a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f429f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo445a(int i, int i2, int i3, CharSequence charSequence) {
        int f = m423f(i3);
        C0086j a = m417a(i, i2, i3, f, charSequence, this.f435l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f436m;
        if (contextMenuInfo != null) {
            a.mo523a(contextMenuInfo);
        }
        ArrayList<C0086j> arrayList = this.f429f;
        arrayList.add(m416a(arrayList, f), a);
        mo475b(true);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0081g mo446a(Drawable drawable) {
        m418a(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0081g mo447a(View view) {
        m418a(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0081g mo448a(CharSequence charSequence) {
        m418a(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0086j mo449a(int i, KeyEvent keyEvent) {
        ArrayList<C0086j> arrayList = this.f445v;
        arrayList.clear();
        mo456a((List<C0086j>) arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean p = mo503p();
        for (int i2 = 0; i2 < size; i2++) {
            C0086j jVar = arrayList.get(i2);
            char alphabeticShortcut = p ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (p && alphabeticShortcut == 8 && i == 67))) {
                return jVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo450a() {
        C0082a aVar = this.f428e;
        if (aVar != null) {
            aVar.mo177a(this);
        }
    }

    /* renamed from: a */
    public void mo451a(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo485d());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0106s) item.getSubMenu()).mo451a(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo452a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f429f.size();
        mo510s();
        for (int i = 0; i < size; i++) {
            C0086j jVar = this.f429f.get(i);
            if (jVar.getGroupId() == groupId && jVar.mo550i() && jVar.isCheckable()) {
                jVar.mo527b(jVar == menuItem);
            }
        }
        mo507r();
    }

    /* renamed from: a */
    public void mo453a(C0082a aVar) {
        this.f428e = aVar;
    }

    /* renamed from: a */
    public void mo454a(C0097n nVar) {
        mo455a(nVar, this.f424a);
    }

    /* renamed from: a */
    public void mo455a(C0097n nVar, Context context) {
        this.f446w.add(new WeakReference(nVar));
        nVar.mo386a(context, this);
        this.f434k = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo456a(List<C0086j> list, int i, KeyEvent keyEvent) {
        boolean p = mo503p();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f429f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0086j jVar = this.f429f.get(i2);
                if (jVar.hasSubMenu()) {
                    ((C0081g) jVar.getSubMenu()).mo456a(list, i, keyEvent);
                }
                char alphabeticShortcut = p ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
                if (((modifiers & 69647) == ((p ? jVar.getAlphabeticModifiers() : jVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (p && alphabeticShortcut == 8 && i == 67)) && jVar.isEnabled()) {
                        list.add(jVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo457a(boolean z) {
        if (!this.f444u) {
            this.f444u = true;
            Iterator<WeakReference<C0097n>> it = this.f446w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0097n nVar = (C0097n) next.get();
                if (nVar == null) {
                    this.f446w.remove(next);
                } else {
                    nVar.mo388a(this, z);
                }
            }
            this.f444u = false;
        }
    }

    /* renamed from: a */
    public boolean mo458a(MenuItem menuItem, int i) {
        return mo459a(menuItem, (C0097n) null, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if ((r9 & 1) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r1 == false) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo459a(android.view.MenuItem r7, androidx.appcompat.view.menu.C0097n r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.j r7 = (androidx.appcompat.view.menu.C0086j) r7
            r0 = 0
            if (r7 == 0) goto L_0x006c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000c
            goto L_0x006c
        L_0x000c:
            boolean r1 = r7.mo535g()
            b.g.k.b r2 = r7.mo327a()
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.mo634a()
            if (r4 == 0) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            boolean r5 = r7.mo534f()
            if (r5 == 0) goto L_0x0031
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x006b
        L_0x002d:
            r6.mo457a((boolean) r3)
            goto L_0x006b
        L_0x0031:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x003f
            if (r4 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x006b
            goto L_0x002d
        L_0x003f:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0046
            r6.mo457a((boolean) r0)
        L_0x0046:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0058
            androidx.appcompat.view.menu.s r9 = new androidx.appcompat.view.menu.s
            android.content.Context r0 = r6.mo487e()
            r9.<init>(r0, r6, r7)
            r7.mo524a((androidx.appcompat.view.menu.C0106s) r9)
        L_0x0058:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.s r7 = (androidx.appcompat.view.menu.C0106s) r7
            if (r4 == 0) goto L_0x0063
            r2.mo633a((android.view.SubMenu) r7)
        L_0x0063:
            boolean r7 = r6.m420a((androidx.appcompat.view.menu.C0106s) r7, (androidx.appcompat.view.menu.C0097n) r8)
            r1 = r1 | r7
            if (r1 != 0) goto L_0x006b
            goto L_0x002d
        L_0x006b:
            return r1
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0081g.mo459a(android.view.MenuItem, androidx.appcompat.view.menu.n, int):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo460a(C0081g gVar, MenuItem menuItem) {
        C0082a aVar = this.f428e;
        return aVar != null && aVar.mo180a(gVar, menuItem);
    }

    /* renamed from: a */
    public boolean mo461a(C0086j jVar) {
        boolean z = false;
        if (!this.f446w.isEmpty() && this.f447x == jVar) {
            mo510s();
            Iterator<WeakReference<C0097n>> it = this.f446w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0097n nVar = (C0097n) next.get();
                if (nVar == null) {
                    this.f446w.remove(next);
                } else {
                    z = nVar.mo394a(this, jVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo507r();
            if (z) {
                this.f447x = null;
            }
        }
        return z;
    }

    public MenuItem add(int i) {
        return mo445a(0, 0, 0, this.f425b.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo445a(i, i2, i3, this.f425b.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo445a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo445a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f424a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f425b.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f425b.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0086j jVar = (C0086j) mo445a(i, i2, i3, charSequence);
        C0106s sVar = new C0106s(this.f424a, this, jVar);
        jVar.mo524a(sVar);
        return sVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public int mo471b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f429f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo472b() {
        ArrayList<C0086j> n = mo501n();
        if (this.f434k) {
            Iterator<WeakReference<C0097n>> it = this.f446w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0097n nVar = (C0097n) next.get();
                if (nVar == null) {
                    this.f446w.remove(next);
                } else {
                    z |= nVar.mo410b();
                }
            }
            if (z) {
                this.f432i.clear();
                this.f433j.clear();
                int size = n.size();
                for (int i = 0; i < size; i++) {
                    C0086j jVar = n.get(i);
                    (jVar.mo548h() ? this.f432i : this.f433j).add(jVar);
                }
            } else {
                this.f432i.clear();
                this.f433j.clear();
                this.f433j.addAll(mo501n());
            }
            this.f434k = false;
        }
    }

    /* renamed from: b */
    public void mo473b(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0106s) item.getSubMenu()).mo473b(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo485d(), sparseArray);
        }
    }

    /* renamed from: b */
    public void mo474b(C0097n nVar) {
        Iterator<WeakReference<C0097n>> it = this.f446w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0097n nVar2 = (C0097n) next.get();
            if (nVar2 == null || nVar2 == nVar) {
                this.f446w.remove(next);
            }
        }
    }

    /* renamed from: b */
    public void mo475b(boolean z) {
        if (!this.f440q) {
            if (z) {
                this.f431h = true;
                this.f434k = true;
            }
            m421d(z);
            return;
        }
        this.f441r = true;
        if (z) {
            this.f442s = true;
        }
    }

    /* renamed from: b */
    public boolean mo476b(C0086j jVar) {
        boolean z = false;
        if (this.f446w.isEmpty()) {
            return false;
        }
        mo510s();
        Iterator<WeakReference<C0097n>> it = this.f446w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0097n nVar = (C0097n) next.get();
            if (nVar == null) {
                this.f446w.remove(next);
            } else {
                z = nVar.mo397b(this, jVar);
                if (z) {
                    break;
                }
            }
        }
        mo507r();
        if (z) {
            this.f447x = jVar;
        }
        return z;
    }

    /* renamed from: c */
    public C0081g mo477c(int i) {
        this.f435l = i;
        return this;
    }

    /* renamed from: c */
    public ArrayList<C0086j> mo478c() {
        mo472b();
        return this.f432i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo479c(C0086j jVar) {
        this.f434k = true;
        mo475b(true);
    }

    /* renamed from: c */
    public void mo480c(boolean z) {
        this.f449z = z;
    }

    public void clear() {
        C0086j jVar = this.f447x;
        if (jVar != null) {
            mo461a(jVar);
        }
        this.f429f.clear();
        mo475b(true);
    }

    public void clearHeader() {
        this.f438o = null;
        this.f437n = null;
        this.f439p = null;
        mo475b(false);
    }

    public void close() {
        mo457a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0081g mo484d(int i) {
        m418a(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo485d() {
        return "android:menu:actionviewstates";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo486d(C0086j jVar) {
        this.f431h = true;
        mo475b(true);
    }

    /* renamed from: e */
    public Context mo487e() {
        return this.f424a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0081g mo488e(int i) {
        m418a(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: f */
    public C0086j mo489f() {
        return this.f447x;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0086j jVar = this.f429f.get(i2);
            if (jVar.getItemId() == i) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public Drawable mo491g() {
        return this.f438o;
    }

    public MenuItem getItem(int i) {
        return this.f429f.get(i);
    }

    /* renamed from: h */
    public CharSequence mo493h() {
        return this.f437n;
    }

    public boolean hasVisibleItems() {
        if (this.f449z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f429f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public View mo495i() {
        return this.f439p;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo449a(i, keyEvent) != null;
    }

    /* renamed from: j */
    public ArrayList<C0086j> mo497j() {
        mo472b();
        return this.f433j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo498k() {
        return this.f443t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Resources mo499l() {
        return this.f425b;
    }

    /* renamed from: m */
    public C0081g mo500m() {
        return this;
    }

    /* renamed from: n */
    public ArrayList<C0086j> mo501n() {
        if (!this.f431h) {
            return this.f430g;
        }
        this.f430g.clear();
        int size = this.f429f.size();
        for (int i = 0; i < size; i++) {
            C0086j jVar = this.f429f.get(i);
            if (jVar.isVisible()) {
                this.f430g.add(jVar);
            }
        }
        this.f431h = false;
        this.f434k = true;
        return this.f430g;
    }

    /* renamed from: o */
    public boolean mo502o() {
        return this.f448y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo503p() {
        return this.f426c;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo458a(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0086j a = mo449a(i, keyEvent);
        boolean a2 = a != null ? mo458a((MenuItem) a, i2) : false;
        if ((i2 & 2) != 0) {
            mo457a(true);
        }
        return a2;
    }

    /* renamed from: q */
    public boolean mo506q() {
        return this.f427d;
    }

    /* renamed from: r */
    public void mo507r() {
        this.f440q = false;
        if (this.f441r) {
            this.f441r = false;
            mo475b(this.f442s);
        }
    }

    public void removeGroup(int i) {
        int a = mo443a(i);
        if (a >= 0) {
            int size = this.f429f.size() - a;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f429f.get(a).getGroupId() != i) {
                    mo475b(true);
                } else {
                    m419a(a, false);
                    i2 = i3;
                }
            }
            mo475b(true);
        }
    }

    public void removeItem(int i) {
        m419a(mo471b(i), true);
    }

    /* renamed from: s */
    public void mo510s() {
        if (!this.f440q) {
            this.f440q = true;
            this.f441r = false;
            this.f442s = false;
        }
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f429f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0086j jVar = this.f429f.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.mo529c(z2);
                jVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f448y = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f429f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0086j jVar = this.f429f.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f429f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0086j jVar = this.f429f.get(i2);
            if (jVar.getGroupId() == i && jVar.mo533e(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo475b(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f426c = z;
        mo475b(false);
    }

    public int size() {
        return this.f429f.size();
    }
}
