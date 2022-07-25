package com.p131fb.fluid.p135l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.p131fb.fluid.App;
import com.p131fb.fluid.p135l.p139p.C1776l;
import com.p131fb.fluid.utils.preferences.C2521f;
import com.p131fb.fluid.utils.preferences.C2527h;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import kotlin.p194d0.C3237c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3382w;
import kotlin.p205x.p207d.C3383x;
import p054c.p083e.p104c.C1271e;
import p054c.p083e.p104c.p110x.C1417a;
import p179e.p180a.p181a.p183b.C2982a;
import p190io.objectbox.BoxStoreBuilder;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: com.fb.fluid.l.b */
public final class C1731b {

    /* renamed from: b */
    private static final String f5028b = (BoxStoreBuilder.DEFAULT_NAME + File.separator + BoxStoreBuilder.DEFAULT_NAME + File.separator + "data.mdb");

    /* renamed from: c */
    private static final List<String> f5029c = C3284j.m12070b((T[]) new String[]{"triggers_avail_user", "fluid_enabled", "fluid_error_time"});

    /* renamed from: a */
    private final App f5030a;

    /* renamed from: com.fb.fluid.l.b$a */
    public static final class C1732a {
        private C1732a() {
        }

        public /* synthetic */ C1732a(C3366g gVar) {
            this();
        }
    }

    /* renamed from: com.fb.fluid.l.b$b */
    public static final class C1733b extends C1417a<Map<String, ? extends Object>> {
        C1733b() {
        }
    }

    static {
        new C1732a((C3366g) null);
    }

    public C1731b(App app) {
        C3370k.m12227b(app, "app");
        this.f5030a = app;
    }

    /* renamed from: a */
    private final void m7345a(File file) {
        try {
            if (file.isDirectory()) {
                String[] list = file.list();
                if (list != null) {
                    for (String file2 : list) {
                        new File(file, file2).delete();
                    }
                    return;
                }
                return;
            }
            file.mkdirs();
        } catch (Exception e) {
            C1776l.m7478a("bak.emdir.e: " + e.getMessage(), (String) null, 1, (Object) null);
        }
    }

    /* renamed from: a */
    private final boolean m7346a(Context context, Uri uri, File file, List<String> list) {
        ZipEntry nextEntry;
        try {
            if (!file.isDirectory()) {
                return false;
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return false;
            }
            C3370k.m12223a((Object) openInputStream, "context.contentResolver.…(zipFile) ?: return false");
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(openInputStream));
            C3383x xVar = new C3383x();
            byte[] bArr = new byte[PropertyFlags.INDEX_HASH];
            C3382w wVar = new C3382w();
            do {
                nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    T name = nextEntry.getName();
                    C3370k.m12223a((Object) name, "this.name");
                    xVar.f8049f = name;
                    if (nextEntry.isDirectory()) {
                        new File(file + File.separator + ((String) xVar.f8049f)).mkdirs();
                        continue;
                    } else if (list == null || list.contains((String) xVar.f8049f)) {
                        File file2 = new File(file + File.separator + ((String) xVar.f8049f));
                        file2.createNewFile();
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        do {
                            wVar.f8048f = zipInputStream.read(bArr);
                            if (wVar.f8048f != -1) {
                                fileOutputStream.write(bArr, 0, wVar.f8048f);
                            }
                        } while (wVar.f8048f != -1);
                        fileOutputStream.close();
                        zipInputStream.closeEntry();
                        continue;
                    } else {
                        continue;
                    }
                } else {
                    nextEntry = null;
                    continue;
                }
            } while (nextEntry != null);
            zipInputStream.close();
            return true;
        } catch (IOException e) {
            C1776l.m7478a("bak.uzp.e: " + e.getMessage(), (String) null, 1, (Object) null);
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m7347a(File file, File file2) {
        boolean z = true;
        try {
            C2521f.f6389b.mo7481a().close();
            if (file2.exists()) {
                file2.delete();
            }
            C2982a.m11466a(file, file2);
        } catch (Exception e) {
            C1776l.m7478a("bak.rdb.e: " + e.getMessage(), (String) null, 1, (Object) null);
            z = false;
        } catch (Throwable th) {
            C2521f fVar = C2521f.f6389b;
            Context applicationContext = m7349b().getApplicationContext();
            C3370k.m12223a((Object) applicationContext, "context.applicationContext");
            fVar.mo7483b(applicationContext);
            throw th;
        }
        C2521f fVar2 = C2521f.f6389b;
        Context applicationContext2 = m7349b().getApplicationContext();
        C3370k.m12223a((Object) applicationContext2, "context.applicationContext");
        fVar2.mo7483b(applicationContext2);
        return z;
    }

    /* renamed from: a */
    private final boolean m7348a(File file, File... fileArr) {
        int read;
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            byte[] bArr = new byte[PropertyFlags.INDEX_HASH];
            for (File file2 : fileArr) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2), PropertyFlags.INDEX_HASH);
                zipOutputStream.putNextEntry(new ZipEntry(file2.getName()));
                do {
                    read = bufferedInputStream.read(bArr, 0, PropertyFlags.INDEX_HASH);
                    if (read != -1) {
                        zipOutputStream.write(bArr, 0, read);
                        continue;
                    }
                } while (read != -1);
                bufferedInputStream.close();
            }
            zipOutputStream.close();
            return true;
        } catch (Exception e) {
            C1776l.m7478a("bak.zf.e: " + e.getMessage(), (String) null, 1, (Object) null);
            return false;
        }
    }

    /* renamed from: b */
    private final Context m7349b() {
        Context baseContext = this.f5030a.getBaseContext();
        C3370k.m12223a((Object) baseContext, "app.baseContext");
        return baseContext;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        kotlin.p204w.C3346a.m12185a(r4, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        throw r3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m7350b(java.io.File r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            c.e.c.e r3 = new c.e.c.e     // Catch:{ FileNotFoundException -> 0x007d }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x007d }
            com.fb.fluid.utils.preferences.h r4 = new com.fb.fluid.utils.preferences.h     // Catch:{ FileNotFoundException -> 0x007d }
            android.content.Context r5 = r9.m7349b()     // Catch:{ FileNotFoundException -> 0x007d }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x007d }
            android.content.SharedPreferences r4 = r4.mo7458a()     // Catch:{ FileNotFoundException -> 0x007d }
            java.util.Map r4 = r4.getAll()     // Catch:{ FileNotFoundException -> 0x007d }
            java.lang.String r5 = "SharedPrefHelper(context…              .shared.all"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r4, (java.lang.String) r5)     // Catch:{ FileNotFoundException -> 0x007d }
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap     // Catch:{ FileNotFoundException -> 0x007d }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x007d }
            java.util.Set r4 = r4.entrySet()     // Catch:{ FileNotFoundException -> 0x007d }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ FileNotFoundException -> 0x007d }
        L_0x002b:
            boolean r6 = r4.hasNext()     // Catch:{ FileNotFoundException -> 0x007d }
            if (r6 == 0) goto L_0x005a
            java.lang.Object r6 = r4.next()     // Catch:{ FileNotFoundException -> 0x007d }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ FileNotFoundException -> 0x007d }
            java.lang.Object r7 = r6.getKey()     // Catch:{ FileNotFoundException -> 0x007d }
            if (r7 == 0) goto L_0x004b
            java.util.List<java.lang.String> r7 = f5029c     // Catch:{ FileNotFoundException -> 0x007d }
            java.lang.Object r8 = r6.getKey()     // Catch:{ FileNotFoundException -> 0x007d }
            boolean r7 = r7.contains(r8)     // Catch:{ FileNotFoundException -> 0x007d }
            if (r7 != 0) goto L_0x004b
            r7 = 1
            goto L_0x004c
        L_0x004b:
            r7 = 0
        L_0x004c:
            if (r7 == 0) goto L_0x002b
            java.lang.Object r7 = r6.getKey()     // Catch:{ FileNotFoundException -> 0x007d }
            java.lang.Object r6 = r6.getValue()     // Catch:{ FileNotFoundException -> 0x007d }
            r5.put(r7, r6)     // Catch:{ FileNotFoundException -> 0x007d }
            goto L_0x002b
        L_0x005a:
            java.lang.String r3 = r3.mo5637a((java.lang.Object) r5)     // Catch:{ FileNotFoundException -> 0x007d }
            java.lang.String r4 = "Gson().toJson(SharedPref…_KEYS.contains(it.key) })"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r3, (java.lang.String) r4)     // Catch:{ FileNotFoundException -> 0x007d }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ FileNotFoundException -> 0x007d }
            java.io.PrintWriter r4 = new java.io.PrintWriter     // Catch:{ FileNotFoundException -> 0x007d }
            r4.<init>(r10)     // Catch:{ FileNotFoundException -> 0x007d }
            r4.println(r3)     // Catch:{ all -> 0x0076 }
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0076 }
            kotlin.p204w.C3346a.m12185a(r4, r2)     // Catch:{ FileNotFoundException -> 0x007d }
            r0 = 1
            goto L_0x0096
        L_0x0076:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r3 = move-exception
            kotlin.p204w.C3346a.m12185a(r4, r10)     // Catch:{ FileNotFoundException -> 0x007d }
            throw r3     // Catch:{ FileNotFoundException -> 0x007d }
        L_0x007d:
            r10 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "bak.xsp.e: "
            r3.append(r4)
            java.lang.String r10 = r10.getMessage()
            r3.append(r10)
            java.lang.String r10 = r3.toString()
            com.p131fb.fluid.p135l.p139p.C1776l.m7478a(r10, r2, r1, r2)
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.p135l.C1731b.m7350b(java.io.File):boolean");
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: c */
    private final boolean m7351c(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            Object a = new C1271e().mo5635a(new String(bArr, C3237c.f7965a), new C1733b().mo5856b());
            C3370k.m12223a(a, "Gson().fromJson(json, ob…p<String, Any>>(){}.type)");
            Map map = (Map) a;
            SharedPreferences.Editor edit = new C2527h(m7349b()).mo7458a().edit();
            edit.clear();
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (obj != null) {
                    if (obj instanceof Double) {
                        if (C2527h.f6401e.mo7559a().contains(str)) {
                            edit.putLong(str, (long) ((Number) obj).doubleValue());
                        } else {
                            edit.putInt(str, (int) ((Number) obj).doubleValue());
                        }
                    } else if (obj instanceof Integer) {
                        edit.putInt(str, ((Number) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        edit.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Long) {
                        edit.putLong(str, ((Number) obj).longValue());
                    } else if (obj instanceof String) {
                        edit.putString(str, (String) obj);
                    }
                }
            }
            edit.apply();
            return true;
        } catch (IOException e) {
            C1776l.m7478a("bak.imsp.e: " + e.getMessage(), (String) null, 1, (Object) null);
            return false;
        }
    }

    /* renamed from: a */
    public final Uri mo6470a() {
        try {
            StringBuilder sb = new StringBuilder();
            File filesDir = m7349b().getFilesDir();
            C3370k.m12223a((Object) filesDir, "context.filesDir");
            sb.append(filesDir.getAbsolutePath());
            sb.append(File.separator);
            sb.append("backup");
            File file = new File(sb.toString());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss", Locale.getDefault());
            Calendar instance = Calendar.getInstance();
            C3370k.m12223a((Object) instance, "Calendar.getInstance()");
            String str = simpleDateFormat.format(instance.getTime()).toString();
            File file2 = new File(file + File.separator + "fng_" + str + ".zip");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m7349b().getFilesDir());
            sb2.append(File.separator);
            sb2.append(f5028b);
            File file3 = new File(sb2.toString());
            File file4 = new File(file.getAbsolutePath() + File.separator + "shared.json");
            if (!file.exists()) {
                file.mkdirs();
            }
            m7345a(file);
            m7350b(file4);
            m7348a(file2, file3, file4);
            return FileProvider.m1517a(m7349b(), "com.fb.fluid.provider", file2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo6471a(Uri uri) {
        C3370k.m12227b(uri, "data");
        try {
            StringBuilder sb = new StringBuilder();
            File filesDir = m7349b().getFilesDir();
            C3370k.m12223a((Object) filesDir, "context.filesDir");
            sb.append(filesDir.getAbsolutePath());
            sb.append(File.separator);
            sb.append("backup");
            File file = new File(sb.toString());
            File file2 = new File(file + File.separator + "data.mdb");
            File file3 = new File(file + File.separator + "shared.json");
            File file4 = new File(m7349b().getFilesDir() + File.separator + f5028b);
            m7345a(file);
            boolean a = (!((!m7346a(m7349b(), uri, file, C3284j.m12070b((T[]) new String[]{"shared.json", "data.mdb"})) || !file3.exists()) ? false : m7351c(file3)) || !file2.exists()) ? false : m7347a(file2, file4);
            m7345a(file);
            return a;
        } catch (Exception unused) {
            return false;
        }
    }
}
