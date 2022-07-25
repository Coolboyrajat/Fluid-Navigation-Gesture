package com.p131fb.fluid.p135l.p136m;

import android.graphics.Bitmap;
import android.util.LruCache;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: com.fb.fluid.l.m.b */
public final class C1759b extends LruCache<String, Bitmap> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final long f5080a = (Runtime.getRuntime().maxMemory() / ((long) PropertyFlags.VIRTUAL));

    /* renamed from: b */
    public static final C1760a f5081b = new C1760a((C3366g) null);

    /* renamed from: com.fb.fluid.l.m.b$a */
    public static final class C1760a {
        private C1760a() {
        }

        public /* synthetic */ C1760a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1759b mo6528a() {
            return new C1759b(((int) mo6529b()) / 10);
        }

        /* renamed from: b */
        public final long mo6529b() {
            return C1759b.f5080a;
        }
    }

    public C1759b(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int sizeOf(String str, Bitmap bitmap) {
        C3370k.m12227b(str, "key");
        C3370k.m12227b(bitmap, "bitmap");
        return bitmap.getAllocationByteCount() / PropertyFlags.VIRTUAL;
    }
}
