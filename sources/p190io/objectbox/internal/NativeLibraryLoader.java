package p190io.objectbox.internal;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLConnection;
import p179e.p180a.p181a.p183b.C2983b;
import p190io.objectbox.BoxStore;

/* renamed from: io.objectbox.internal.NativeLibraryLoader */
public class NativeLibraryLoader {
    private static final String OBJECTBOX_JNI = "objectbox-jni";

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00df A[Catch:{ UnsatisfiedLinkError -> 0x010e, UnsatisfiedLinkError -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00e7  */
    static {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "objectbox-jni"
            r0.append(r1)
            java.lang.String r2 = ".so"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "java.vendor"
            java.lang.String r3 = java.lang.System.getProperty(r3)
            java.lang.String r4 = "os.name"
            java.lang.String r4 = java.lang.System.getProperty(r4)
            java.lang.String r4 = r4.toLowerCase()
            java.lang.String r5 = "sun.arch.data.model"
            java.lang.String r5 = java.lang.System.getProperty(r5)
            java.lang.String r6 = "Android"
            boolean r6 = r3.contains(r6)
            r7 = 1
            r8 = 0
            if (r6 != 0) goto L_0x00d1
            java.lang.String r9 = "32"
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto L_0x003e
            java.lang.String r9 = "-x86"
            goto L_0x0040
        L_0x003e:
            java.lang.String r9 = "-x64"
        L_0x0040:
            java.lang.String r10 = "windows"
            boolean r10 = r4.contains(r10)
            if (r10 == 0) goto L_0x0072
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r2 = "-windows"
            r0.append(r2)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r9 = ".dll"
        L_0x0066:
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            checkUnpackLib(r2)
            r9 = 0
            goto L_0x00d4
        L_0x0072:
            java.lang.String r10 = "linux"
            boolean r10 = r4.contains(r10)
            java.lang.String r11 = "lib"
            if (r10 == 0) goto L_0x00a7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r10 = "-linux"
            r0.append(r10)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r11)
            r9.append(r0)
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            checkUnpackLib(r2)
            r9 = 1
            goto L_0x00d4
        L_0x00a7:
            java.lang.String r2 = "mac"
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L_0x00d1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r2 = "-macos"
            r0.append(r2)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r0)
            java.lang.String r9 = ".dylib"
            goto L_0x0066
        L_0x00d1:
            r9 = 1
            r2 = r0
            r0 = r1
        L_0x00d4:
            java.io.File r10 = new java.io.File     // Catch:{ UnsatisfiedLinkError -> 0x011e }
            r10.<init>(r2)     // Catch:{ UnsatisfiedLinkError -> 0x011e }
            boolean r2 = r10.exists()     // Catch:{ UnsatisfiedLinkError -> 0x011e }
            if (r2 == 0) goto L_0x00e7
            java.lang.String r0 = r10.getAbsolutePath()     // Catch:{ UnsatisfiedLinkError -> 0x011e }
            java.lang.System.load(r0)     // Catch:{ UnsatisfiedLinkError -> 0x011e }
            goto L_0x011c
        L_0x00e7:
            if (r6 == 0) goto L_0x00f3
            boolean r2 = loadLibraryAndroid()     // Catch:{ UnsatisfiedLinkError -> 0x010e }
            if (r2 != 0) goto L_0x011c
        L_0x00ef:
            java.lang.System.loadLibrary(r0)     // Catch:{ UnsatisfiedLinkError -> 0x010e }
            goto L_0x011c
        L_0x00f3:
            java.io.PrintStream r2 = java.lang.System.err     // Catch:{ UnsatisfiedLinkError -> 0x010e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x010e }
            r11.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x010e }
            java.lang.String r12 = "File not available: "
            r11.append(r12)     // Catch:{ UnsatisfiedLinkError -> 0x010e }
            java.lang.String r10 = r10.getAbsolutePath()     // Catch:{ UnsatisfiedLinkError -> 0x010e }
            r11.append(r10)     // Catch:{ UnsatisfiedLinkError -> 0x010e }
            java.lang.String r10 = r11.toString()     // Catch:{ UnsatisfiedLinkError -> 0x010e }
            r2.println(r10)     // Catch:{ UnsatisfiedLinkError -> 0x010e }
            goto L_0x00ef
        L_0x010e:
            r0 = move-exception
            if (r6 != 0) goto L_0x011d
            if (r9 == 0) goto L_0x011d
            boolean r0 = loadLibraryAndroid()     // Catch:{ UnsatisfiedLinkError -> 0x011e }
            if (r0 != 0) goto L_0x011c
            java.lang.System.loadLibrary(r1)     // Catch:{ UnsatisfiedLinkError -> 0x011e }
        L_0x011c:
            return
        L_0x011d:
            throw r0     // Catch:{ UnsatisfiedLinkError -> 0x011e }
        L_0x011e:
            r0 = move-exception
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r8] = r3
            r1[r7] = r4
            r2 = 2
            r1[r2] = r5
            r2 = 3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            r1[r2] = r3
            r2 = 4
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)
            r1[r2] = r3
            java.lang.String r2 = "Loading ObjectBox native library failed: vendor=%s,os=%s,arch=%s,android=%s,linux=%s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.LinkageError r2 = new java.lang.LinkageError
            r2.<init>(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p190io.objectbox.internal.NativeLibraryLoader.<clinit>():void");
    }

    private static void checkUnpackLib(String str) {
        BufferedOutputStream bufferedOutputStream;
        String str2 = "/native/" + str;
        URL resource = NativeLibraryLoader.class.getResource(str2);
        if (resource == null) {
            System.err.println("Not available in classpath: " + str2);
            return;
        }
        File file = new File(str);
        try {
            URLConnection openConnection = resource.openConnection();
            int contentLength = openConnection.getContentLength();
            long lastModified = openConnection.getLastModified();
            if (!file.exists() || file.length() != ((long) contentLength) || file.lastModified() != lastModified) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(openConnection.getInputStream());
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    C2983b.m11467a(bufferedInputStream, bufferedOutputStream);
                    C2983b.m11468a(bufferedOutputStream);
                    C2983b.m11468a(bufferedInputStream);
                    if (lastModified > 0) {
                        file.setLastModified(lastModified);
                    }
                } catch (Throwable th) {
                    C2983b.m11468a(bufferedInputStream);
                    throw th;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ensureLoaded() {
    }

    private static boolean loadLibraryAndroid() {
        if (BoxStore.context == null) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("android.content.Context");
            if (BoxStore.relinker == null) {
                Class.forName("com.getkeepsafe.relinker.ReLinker").getMethod("loadLibrary", new Class[]{cls, String.class, String.class}).invoke((Object) null, new Object[]{BoxStore.context, OBJECTBOX_JNI, BoxStore.JNI_VERSION});
            } else {
                BoxStore.relinker.getClass().getMethod("loadLibrary", new Class[]{cls, String.class, String.class}).invoke(BoxStore.relinker, new Object[]{BoxStore.context, OBJECTBOX_JNI, BoxStore.JNI_VERSION});
            }
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }
}
