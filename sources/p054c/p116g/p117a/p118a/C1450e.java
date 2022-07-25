package p054c.p116g.p117a.p118a;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/* renamed from: c.g.a.a.e */
public class C1450e extends Thread {

    /* renamed from: f */
    private final BufferedReader f4469f;

    /* renamed from: g */
    private List<String> f4470g;

    /* renamed from: h */
    private C1451a f4471h;

    /* renamed from: c.g.a.a.e$a */
    public interface C1451a {
        /* renamed from: a */
        void mo5888a(String str);
    }

    public C1450e(InputStream inputStream, C1451a aVar) {
        this.f4469f = new BufferedReader(new InputStreamReader(inputStream));
        this.f4471h = aVar;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001b */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001b A[SYNTHETIC, Splitter:B:9:0x001b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r2 = this;
        L_0x0000:
            java.io.BufferedReader r0 = r2.f4469f     // Catch:{ IOException -> 0x001b }
            java.lang.String r0 = r0.readLine()     // Catch:{ IOException -> 0x001b }
            if (r0 == 0) goto L_0x001b
            java.util.List<java.lang.String> r1 = r2.f4470g     // Catch:{ IOException -> 0x001b }
            if (r1 == 0) goto L_0x0011
            java.util.List<java.lang.String> r1 = r2.f4470g     // Catch:{ IOException -> 0x001b }
            r1.add(r0)     // Catch:{ IOException -> 0x001b }
        L_0x0011:
            c.g.a.a.e$a r1 = r2.f4471h     // Catch:{ IOException -> 0x001b }
            if (r1 == 0) goto L_0x0000
            c.g.a.a.e$a r1 = r2.f4471h     // Catch:{ IOException -> 0x001b }
            r1.mo5888a(r0)     // Catch:{ IOException -> 0x001b }
            goto L_0x0000
        L_0x001b:
            java.io.BufferedReader r0 = r2.f4469f     // Catch:{ IOException -> 0x0020 }
            r0.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p054c.p116g.p117a.p118a.C1450e.run():void");
    }
}
