package p179e.p184b.p185a;

import java.util.List;
import java.util.Map;
import kotlin.C3267n;
import p179e.p184b.p185a.C3059m;
import p179e.p184b.p185a.p187l0.C3026e;
import p179e.p184b.p185a.p187l0.C3027f;

/* renamed from: e.b.a.u */
public interface C3132u {

    /* renamed from: e.b.a.u$a */
    public static final class C3133a {
        /* renamed from: a */
        public static /* synthetic */ List m11789a(C3132u uVar, C3059m.C3069f fVar, int i, boolean z, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    i = 0;
                }
                if ((i2 & 4) != 0) {
                    z = false;
                }
                return uVar.mo9207a(fVar, i, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: find");
        }
    }

    /* renamed from: a */
    List<C3027f> mo9205a();

    /* renamed from: a */
    List<C3267n<C3059m.C3069f<?, ?, ?>, List<C3129s<?, ?, ?>>, C3026e<?, ?>>> mo9206a(C2985a0 a0Var);

    /* renamed from: a */
    <C, A, T> List<C3267n<C3059m.C3069f<Object, A, T>, C3129s<Object, A, T>, C3026e<C, Object>>> mo9207a(C3059m.C3069f<? super C, ? super A, ? extends T> fVar, int i, boolean z);

    /* renamed from: a */
    <C, A, T> C3267n<C3059m.C3069f<Object, A, T>, List<C3129s<Object, A, T>>, C3026e<C, Object>> mo9208a(C3059m.C3069f<? super C, ? super A, ? extends T> fVar);

    /* renamed from: b */
    Map<C3059m.C3069f<?, ?, ?>, List<C3129s<?, ?, ?>>> mo9209b();
}
