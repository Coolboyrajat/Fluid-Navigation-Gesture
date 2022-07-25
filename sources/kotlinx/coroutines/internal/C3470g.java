package kotlinx.coroutines.internal;

import java.io.BufferedReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.C3269p;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.internal.g */
public final class C3470g {

    /* renamed from: a */
    public static final C3470g f8174a = new C3470g();

    private C3470g() {
    }

    /* renamed from: a */
    private final <S> S m12506a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* renamed from: a */
    private final List<String> m12507a(BufferedReader bufferedReader) {
        boolean z;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return C3292r.m12104g(linkedHashSet);
            }
            String b = C3251o.m11957b(readLine, "#", (String) null, 2, (Object) null);
            if (b != null) {
                String obj = C3251o.m11963d(b).toString();
                boolean z2 = false;
                int i = 0;
                while (true) {
                    if (i >= obj.length()) {
                        z = true;
                        break;
                    }
                    char charAt = obj.charAt(i);
                    if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                        z = false;
                        break;
                    }
                    i++;
                }
                if (z) {
                    if (obj.length() > 0) {
                        z2 = true;
                    }
                    if (z2) {
                        linkedHashSet.add(obj);
                    }
                } else {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
                }
            } else {
                throw new C3269p("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        kotlin.p204w.C3346a.m12185a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        kotlin.C3199b.m11853a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007d, code lost:
        kotlin.p204w.C3346a.m12185a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0080, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.String> m12508a(java.net.URL r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "url.toString()"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r0, (java.lang.String) r1)
            r1 = 0
            r2 = 2
            r3 = 0
            java.lang.String r4 = "jar"
            boolean r4 = kotlin.p194d0.C3250n.m11932a(r0, r4, r1, r2, r3)
            if (r4 == 0) goto L_0x0062
            java.lang.String r6 = "jar:file:"
            java.lang.String r6 = kotlin.p194d0.C3251o.m11944a((java.lang.String) r0, (java.lang.String) r6, (java.lang.String) r3, (int) r2, (java.lang.Object) r3)
            r4 = 33
            java.lang.String r6 = kotlin.p194d0.C3251o.m11942a((java.lang.String) r6, (char) r4, (java.lang.String) r3, (int) r2, (java.lang.Object) r3)
            java.lang.String r4 = "!/"
            java.lang.String r0 = kotlin.p194d0.C3251o.m11944a((java.lang.String) r0, (java.lang.String) r4, (java.lang.String) r3, (int) r2, (java.lang.Object) r3)
            java.util.jar.JarFile r2 = new java.util.jar.JarFile
            r2.<init>(r6, r1)
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x0056 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x0056 }
            java.util.zip.ZipEntry r4 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0056 }
            r4.<init>(r0)     // Catch:{ all -> 0x0056 }
            java.io.InputStream r0 = r2.getInputStream(r4)     // Catch:{ all -> 0x0056 }
            java.lang.String r4 = "UTF-8"
            r1.<init>(r0, r4)     // Catch:{ all -> 0x0056 }
            r6.<init>(r1)     // Catch:{ all -> 0x0056 }
            kotlinx.coroutines.internal.g r0 = f8174a     // Catch:{ all -> 0x004f }
            java.util.List r0 = r0.m12507a((java.io.BufferedReader) r6)     // Catch:{ all -> 0x004f }
            kotlin.p204w.C3346a.m12185a(r6, r3)     // Catch:{ all -> 0x0056 }
            r2.close()     // Catch:{ all -> 0x004d }
            return r0
        L_0x004d:
            r6 = move-exception
            throw r6
        L_0x004f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r1 = move-exception
            kotlin.p204w.C3346a.m12185a(r6, r0)     // Catch:{ all -> 0x0056 }
            throw r1     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x005d }
            throw r0
        L_0x005d:
            r0 = move-exception
            kotlin.C3199b.m11853a(r6, r0)
            throw r6
        L_0x0062:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r6 = r6.openStream()
            r1.<init>(r6)
            r0.<init>(r1)
            kotlinx.coroutines.internal.g r6 = f8174a     // Catch:{ all -> 0x007a }
            java.util.List r6 = r6.m12507a((java.io.BufferedReader) r0)     // Catch:{ all -> 0x007a }
            kotlin.p204w.C3346a.m12185a(r0, r3)
            return r6
        L_0x007a:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x007c }
        L_0x007c:
            r1 = move-exception
            kotlin.p204w.C3346a.m12185a(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C3470g.m12508a(java.net.URL):java.util.List");
    }

    /* renamed from: a */
    public final <S> List<S> mo10227a(Class<S> cls, ClassLoader classLoader) {
        C3370k.m12227b(cls, "service");
        C3370k.m12227b(classLoader, "loader");
        try {
            return mo10228b(cls, classLoader);
        } catch (Throwable unused) {
            ServiceLoader<S> load = ServiceLoader.load(cls, classLoader);
            C3370k.m12223a((Object) load, "ServiceLoader.load(service, loader)");
            return C3292r.m12104g(load);
        }
    }

    /* renamed from: b */
    public final <S> List<S> mo10228b(Class<S> cls, ClassLoader classLoader) {
        C3370k.m12227b(cls, "service");
        C3370k.m12227b(classLoader, "loader");
        Enumeration<URL> resources = classLoader.getResources("META-INF/services/" + cls.getName());
        C3370k.m12223a((Object) resources, "urls");
        ArrayList<T> list = Collections.list(resources);
        C3370k.m12223a((Object) list, "java.util.Collections.list(this)");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            C3470g gVar = f8174a;
            C3370k.m12223a((Object) t, "it");
            boolean unused = C3289o.m12079a(arrayList, gVar.m12508a((URL) t));
        }
        Set<String> i = C3292r.m12106i(arrayList);
        if (!i.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(C3285k.m12075a(i, 10));
            for (String a : i) {
                arrayList2.add(f8174a.m12506a(a, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
