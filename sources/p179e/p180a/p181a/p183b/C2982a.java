package p179e.p180a.p181a.p183b;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* renamed from: e.a.a.b.a */
public class C2982a {
    /* renamed from: a */
    public static void m11466a(File file, File file2) {
        BufferedOutputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            bufferedInputStream = new BufferedOutputStream(new FileOutputStream(file2));
            C2983b.m11467a(bufferedInputStream, bufferedInputStream);
        } catch (Throwable th) {
            throw th;
        } finally {
            C2983b.m11468a(bufferedInputStream);
        }
    }
}
