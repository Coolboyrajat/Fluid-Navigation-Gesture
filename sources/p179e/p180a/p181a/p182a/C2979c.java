package p179e.p180a.p181a.p182a;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: e.a.a.a.c */
public class C2979c<K, V> extends C2976a<K, V, Set<V>> {

    /* renamed from: g */
    private final C2981b f7739g;

    /* renamed from: e.a.a.a.c$a */
    static /* synthetic */ class C2980a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7740a = new int[C2981b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                e.a.a.a.c$b[] r0 = p179e.p180a.p181a.p182a.C2979c.C2981b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7740a = r0
                int[] r0 = f7740a     // Catch:{ NoSuchFieldError -> 0x0014 }
                e.a.a.a.c$b r1 = p179e.p180a.p181a.p182a.C2979c.C2981b.REGULAR     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f7740a     // Catch:{ NoSuchFieldError -> 0x001f }
                e.a.a.a.c$b r1 = p179e.p180a.p181a.p182a.C2979c.C2981b.THREAD_SAFE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p179e.p180a.p181a.p182a.C2979c.C2980a.<clinit>():void");
        }
    }

    /* renamed from: e.a.a.a.c$b */
    public enum C2981b {
        REGULAR,
        THREAD_SAFE
    }

    protected C2979c(Map<K, Set<V>> map, C2981b bVar) {
        super(map);
        this.f7739g = bVar;
    }

    /* renamed from: a */
    public static <K, V> C2979c<K, V> m11463a(C2981b bVar) {
        return new C2979c<>(new HashMap(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Set<V> m11465a() {
        int i = C2980a.f7740a[this.f7739g.ordinal()];
        if (i == 1) {
            return new HashSet();
        }
        if (i == 2) {
            return new CopyOnWriteArraySet();
        }
        throw new IllegalStateException("Unknown set type: " + this.f7739g);
    }
}
