package p006b.p026g.p032h;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.p002c.C0315c;
import androidx.core.content.p002c.C0323f;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p006b.p021d.C0729e;
import p006b.p021d.C0736g;
import p006b.p026g.p027d.C0784c;
import p006b.p026g.p027d.C0793i;
import p006b.p026g.p032h.C0808c;
import p006b.p026g.p034j.C0837h;

/* renamed from: b.g.h.b */
public class C0800b {

    /* renamed from: a */
    static final C0729e<String, Typeface> f3162a = new C0729e<>(16);

    /* renamed from: b */
    private static final C0808c f3163b = new C0808c("fonts", 10, 10000);

    /* renamed from: c */
    static final Object f3164c = new Object();

    /* renamed from: d */
    static final C0736g<String, ArrayList<C0808c.C0813d<C0807g>>> f3165d = new C0736g<>();

    /* renamed from: e */
    private static final Comparator<byte[]> f3166e = new C0804d();

    /* renamed from: b.g.h.b$a */
    static class C0801a implements Callable<C0807g> {

        /* renamed from: f */
        final /* synthetic */ Context f3167f;

        /* renamed from: g */
        final /* synthetic */ C0799a f3168g;

        /* renamed from: h */
        final /* synthetic */ int f3169h;

        /* renamed from: i */
        final /* synthetic */ String f3170i;

        C0801a(Context context, C0799a aVar, int i, String str) {
            this.f3167f = context;
            this.f3168g = aVar;
            this.f3169h = i;
            this.f3170i = str;
        }

        public C0807g call() {
            C0807g a = C0800b.m4451a(this.f3167f, this.f3168g, this.f3169h);
            Typeface typeface = a.f3181a;
            if (typeface != null) {
                C0800b.f3162a.mo4120a(this.f3170i, typeface);
            }
            return a;
        }
    }

    /* renamed from: b.g.h.b$b */
    static class C0802b implements C0808c.C0813d<C0807g> {

        /* renamed from: a */
        final /* synthetic */ C0323f.C0324a f3171a;

        /* renamed from: b */
        final /* synthetic */ Handler f3172b;

        C0802b(C0323f.C0324a aVar, Handler handler) {
            this.f3171a = aVar;
            this.f3172b = handler;
        }

        /* renamed from: a */
        public void mo4483a(C0807g gVar) {
            int i;
            C0323f.C0324a aVar;
            if (gVar == null) {
                aVar = this.f3171a;
                i = 1;
            } else {
                i = gVar.f3182b;
                if (i == 0) {
                    this.f3171a.mo1977a(gVar.f3181a, this.f3172b);
                    return;
                }
                aVar = this.f3171a;
            }
            aVar.mo1976a(i, this.f3172b);
        }
    }

    /* renamed from: b.g.h.b$c */
    static class C0803c implements C0808c.C0813d<C0807g> {

        /* renamed from: a */
        final /* synthetic */ String f3173a;

        C0803c(String str) {
            this.f3173a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r0 >= r1.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            ((p006b.p026g.p032h.C0808c.C0813d) r1.get(r0)).mo4483a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r0 = 0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo4483a(p006b.p026g.p032h.C0800b.C0807g r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p006b.p026g.p032h.C0800b.f3164c
                monitor-enter(r0)
                b.d.g<java.lang.String, java.util.ArrayList<b.g.h.c$d<b.g.h.b$g>>> r1 = p006b.p026g.p032h.C0800b.f3165d     // Catch:{ all -> 0x002d }
                java.lang.String r2 = r4.f3173a     // Catch:{ all -> 0x002d }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002d }
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x002d }
                if (r1 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                return
            L_0x0011:
                b.d.g<java.lang.String, java.util.ArrayList<b.g.h.c$d<b.g.h.b$g>>> r2 = p006b.p026g.p032h.C0800b.f3165d     // Catch:{ all -> 0x002d }
                java.lang.String r3 = r4.f3173a     // Catch:{ all -> 0x002d }
                r2.remove(r3)     // Catch:{ all -> 0x002d }
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                r0 = 0
            L_0x001a:
                int r2 = r1.size()
                if (r0 >= r2) goto L_0x002c
                java.lang.Object r2 = r1.get(r0)
                b.g.h.c$d r2 = (p006b.p026g.p032h.C0808c.C0813d) r2
                r2.mo4483a(r5)
                int r0 = r0 + 1
                goto L_0x001a
            L_0x002c:
                return
            L_0x002d:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p006b.p026g.p032h.C0800b.C0803c.mo4483a(b.g.h.b$g):void");
        }
    }

    /* renamed from: b.g.h.b$d */
    static class C0804d implements Comparator<byte[]> {
        C0804d() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(byte[] r5, byte[] r6) {
            /*
                r4 = this;
                int r0 = r5.length
                int r1 = r6.length
                if (r0 == r1) goto L_0x0008
                int r5 = r5.length
                int r6 = r6.length
            L_0x0006:
                int r5 = r5 - r6
                return r5
            L_0x0008:
                r0 = 0
                r1 = 0
            L_0x000a:
                int r2 = r5.length
                if (r1 >= r2) goto L_0x001b
                byte r2 = r5[r1]
                byte r3 = r6[r1]
                if (r2 == r3) goto L_0x0018
                byte r5 = r5[r1]
                byte r6 = r6[r1]
                goto L_0x0006
            L_0x0018:
                int r1 = r1 + 1
                goto L_0x000a
            L_0x001b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p006b.p026g.p032h.C0800b.C0804d.compare(byte[], byte[]):int");
        }
    }

    /* renamed from: b.g.h.b$e */
    public static class C0805e {

        /* renamed from: a */
        private final int f3174a;

        /* renamed from: b */
        private final C0806f[] f3175b;

        public C0805e(int i, C0806f[] fVarArr) {
            this.f3174a = i;
            this.f3175b = fVarArr;
        }

        /* renamed from: a */
        public C0806f[] mo4487a() {
            return this.f3175b;
        }

        /* renamed from: b */
        public int mo4488b() {
            return this.f3174a;
        }
    }

    /* renamed from: b.g.h.b$f */
    public static class C0806f {

        /* renamed from: a */
        private final Uri f3176a;

        /* renamed from: b */
        private final int f3177b;

        /* renamed from: c */
        private final int f3178c;

        /* renamed from: d */
        private final boolean f3179d;

        /* renamed from: e */
        private final int f3180e;

        public C0806f(Uri uri, int i, int i2, boolean z, int i3) {
            C0837h.m4534a(uri);
            this.f3176a = uri;
            this.f3177b = i;
            this.f3178c = i2;
            this.f3179d = z;
            this.f3180e = i3;
        }

        /* renamed from: a */
        public int mo4489a() {
            return this.f3180e;
        }

        /* renamed from: b */
        public int mo4490b() {
            return this.f3177b;
        }

        /* renamed from: c */
        public Uri mo4491c() {
            return this.f3176a;
        }

        /* renamed from: d */
        public int mo4492d() {
            return this.f3178c;
        }

        /* renamed from: e */
        public boolean mo4493e() {
            return this.f3179d;
        }
    }

    /* renamed from: b.g.h.b$g */
    private static final class C0807g {

        /* renamed from: a */
        final Typeface f3181a;

        /* renamed from: b */
        final int f3182b;

        C0807g(Typeface typeface, int i) {
            this.f3181a = typeface;
            this.f3182b = i;
        }
    }

    /* renamed from: a */
    public static ProviderInfo m4448a(PackageManager packageManager, C0799a aVar, Resources resources) {
        String d = aVar.mo4477d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(d, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + d);
        } else if (resolveContentProvider.packageName.equals(aVar.mo4478e())) {
            List<byte[]> a = m4453a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a, f3166e);
            List<List<byte[]>> a2 = m4452a(aVar, resources);
            for (int i = 0; i < a2.size(); i++) {
                ArrayList arrayList = new ArrayList(a2.get(i));
                Collections.sort(arrayList, f3166e);
                if (m4455a(a, (List<byte[]>) arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + d + ", but package was not " + aVar.mo4478e());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0083, code lost:
        f3163b.mo4497a(r1, new p006b.p026g.p032h.C0800b.C0803c(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m4449a(android.content.Context r2, p006b.p026g.p032h.C0799a r3, androidx.core.content.p002c.C0323f.C0324a r4, android.os.Handler r5, boolean r6, int r7, int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.mo4476c()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            b.d.e<java.lang.String, android.graphics.Typeface> r1 = f3162a
            java.lang.Object r1 = r1.mo4124b(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0028
            if (r4 == 0) goto L_0x0027
            r4.mo1672a((android.graphics.Typeface) r1)
        L_0x0027:
            return r1
        L_0x0028:
            if (r6 == 0) goto L_0x0043
            r1 = -1
            if (r7 != r1) goto L_0x0043
            b.g.h.b$g r2 = m4451a((android.content.Context) r2, (p006b.p026g.p032h.C0799a) r3, (int) r8)
            if (r4 == 0) goto L_0x0040
            int r3 = r2.f3182b
            if (r3 != 0) goto L_0x003d
            android.graphics.Typeface r3 = r2.f3181a
            r4.mo1977a((android.graphics.Typeface) r3, (android.os.Handler) r5)
            goto L_0x0040
        L_0x003d:
            r4.mo1976a((int) r3, (android.os.Handler) r5)
        L_0x0040:
            android.graphics.Typeface r2 = r2.f3181a
            return r2
        L_0x0043:
            b.g.h.b$a r1 = new b.g.h.b$a
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0056
            b.g.h.c r3 = f3163b     // Catch:{ InterruptedException -> 0x0055 }
            java.lang.Object r3 = r3.mo4494a(r1, (int) r7)     // Catch:{ InterruptedException -> 0x0055 }
            b.g.h.b$g r3 = (p006b.p026g.p032h.C0800b.C0807g) r3     // Catch:{ InterruptedException -> 0x0055 }
            android.graphics.Typeface r2 = r3.f3181a     // Catch:{ InterruptedException -> 0x0055 }
        L_0x0055:
            return r2
        L_0x0056:
            if (r4 != 0) goto L_0x005a
            r3 = r2
            goto L_0x005f
        L_0x005a:
            b.g.h.b$b r3 = new b.g.h.b$b
            r3.<init>(r4, r5)
        L_0x005f:
            java.lang.Object r4 = f3164c
            monitor-enter(r4)
            b.d.g<java.lang.String, java.util.ArrayList<b.g.h.c$d<b.g.h.b$g>>> r5 = f3165d     // Catch:{ all -> 0x008e }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x008e }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x008e }
            if (r5 == 0) goto L_0x0073
            if (r3 == 0) goto L_0x0071
            r5.add(r3)     // Catch:{ all -> 0x008e }
        L_0x0071:
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            return r2
        L_0x0073:
            if (r3 == 0) goto L_0x0082
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x008e }
            r5.<init>()     // Catch:{ all -> 0x008e }
            r5.add(r3)     // Catch:{ all -> 0x008e }
            b.d.g<java.lang.String, java.util.ArrayList<b.g.h.c$d<b.g.h.b$g>>> r3 = f3165d     // Catch:{ all -> 0x008e }
            r3.put(r0, r5)     // Catch:{ all -> 0x008e }
        L_0x0082:
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            b.g.h.c r3 = f3163b
            b.g.h.b$c r4 = new b.g.h.b$c
            r4.<init>(r0)
            r3.mo4497a(r1, r4)
            return r2
        L_0x008e:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p026g.p032h.C0800b.m4449a(android.content.Context, b.g.h.a, androidx.core.content.c.f$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public static C0805e m4450a(Context context, CancellationSignal cancellationSignal, C0799a aVar) {
        ProviderInfo a = m4448a(context.getPackageManager(), aVar, context.getResources());
        return a == null ? new C0805e(1, (C0806f[]) null) : new C0805e(0, m4456a(context, aVar, a.authority, cancellationSignal));
    }

    /* renamed from: a */
    static C0807g m4451a(Context context, C0799a aVar, int i) {
        try {
            C0805e a = m4450a(context, (CancellationSignal) null, aVar);
            int i2 = -3;
            if (a.mo4488b() == 0) {
                Typeface a2 = C0784c.m4372a(context, (CancellationSignal) null, a.mo4487a(), i);
                if (a2 != null) {
                    i2 = 0;
                }
                return new C0807g(a2, i2);
            }
            if (a.mo4488b() == 1) {
                i2 = -2;
            }
            return new C0807g((Typeface) null, i2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0807g((Typeface) null, -1);
        }
    }

    /* renamed from: a */
    private static List<List<byte[]>> m4452a(C0799a aVar, Resources resources) {
        return aVar.mo4474a() != null ? aVar.mo4474a() : C0315c.m1557a(resources, aVar.mo4475b());
    }

    /* renamed from: a */
    private static List<byte[]> m4453a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m4454a(Context context, C0806f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C0806f fVar : fVarArr) {
            if (fVar.mo4489a() == 0) {
                Uri c = fVar.mo4491c();
                if (!hashMap.containsKey(c)) {
                    hashMap.put(c, C0793i.m4431a(context, cancellationSignal, c));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    private static boolean m4455a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    static C0806f[] m4456a(Context context, C0799a aVar, String str, CancellationSignal cancellationSignal) {
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            cursor = Build.VERSION.SDK_INT > 16 ? context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.mo4479f()}, (String) null, cancellationSignal) : context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.mo4479f()}, (String) null);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    arrayList2.add(new C0806f(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            return (C0806f[]) arrayList.toArray(new C0806f[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
