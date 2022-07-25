package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.C0257d;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.c */
public class C0254c {

    /* renamed from: b */
    private static final int[] f1268b = {0, 4, 8};

    /* renamed from: c */
    private static SparseIntArray f1269c = new SparseIntArray();

    /* renamed from: a */
    private HashMap<Integer, C0256b> f1270a = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.c$b */
    private static class C0256b {

        /* renamed from: A */
        public int f1271A;

        /* renamed from: B */
        public int f1272B;

        /* renamed from: C */
        public int f1273C;

        /* renamed from: D */
        public int f1274D;

        /* renamed from: E */
        public int f1275E;

        /* renamed from: F */
        public int f1276F;

        /* renamed from: G */
        public int f1277G;

        /* renamed from: H */
        public int f1278H;

        /* renamed from: I */
        public int f1279I;

        /* renamed from: J */
        public int f1280J;

        /* renamed from: K */
        public int f1281K;

        /* renamed from: L */
        public int f1282L;

        /* renamed from: M */
        public int f1283M;

        /* renamed from: N */
        public int f1284N;

        /* renamed from: O */
        public int f1285O;

        /* renamed from: P */
        public int f1286P;

        /* renamed from: Q */
        public float f1287Q;

        /* renamed from: R */
        public float f1288R;

        /* renamed from: S */
        public int f1289S;

        /* renamed from: T */
        public int f1290T;

        /* renamed from: U */
        public float f1291U;

        /* renamed from: V */
        public boolean f1292V;

        /* renamed from: W */
        public float f1293W;

        /* renamed from: X */
        public float f1294X;

        /* renamed from: Y */
        public float f1295Y;

        /* renamed from: Z */
        public float f1296Z;

        /* renamed from: a */
        boolean f1297a;

        /* renamed from: a0 */
        public float f1298a0;

        /* renamed from: b */
        public int f1299b;

        /* renamed from: b0 */
        public float f1300b0;

        /* renamed from: c */
        public int f1301c;

        /* renamed from: c0 */
        public float f1302c0;

        /* renamed from: d */
        int f1303d;

        /* renamed from: d0 */
        public float f1304d0;

        /* renamed from: e */
        public int f1305e;

        /* renamed from: e0 */
        public float f1306e0;

        /* renamed from: f */
        public int f1307f;

        /* renamed from: f0 */
        public float f1308f0;

        /* renamed from: g */
        public float f1309g;

        /* renamed from: g0 */
        public float f1310g0;

        /* renamed from: h */
        public int f1311h;

        /* renamed from: h0 */
        public boolean f1312h0;

        /* renamed from: i */
        public int f1313i;

        /* renamed from: i0 */
        public boolean f1314i0;

        /* renamed from: j */
        public int f1315j;

        /* renamed from: j0 */
        public int f1316j0;

        /* renamed from: k */
        public int f1317k;

        /* renamed from: k0 */
        public int f1318k0;

        /* renamed from: l */
        public int f1319l;

        /* renamed from: l0 */
        public int f1320l0;

        /* renamed from: m */
        public int f1321m;

        /* renamed from: m0 */
        public int f1322m0;

        /* renamed from: n */
        public int f1323n;

        /* renamed from: n0 */
        public int f1324n0;

        /* renamed from: o */
        public int f1325o;

        /* renamed from: o0 */
        public int f1326o0;

        /* renamed from: p */
        public int f1327p;

        /* renamed from: p0 */
        public float f1328p0;

        /* renamed from: q */
        public int f1329q;

        /* renamed from: q0 */
        public float f1330q0;

        /* renamed from: r */
        public int f1331r;

        /* renamed from: r0 */
        public boolean f1332r0;

        /* renamed from: s */
        public int f1333s;

        /* renamed from: s0 */
        public int f1334s0;

        /* renamed from: t */
        public int f1335t;

        /* renamed from: t0 */
        public int f1336t0;

        /* renamed from: u */
        public float f1337u;

        /* renamed from: u0 */
        public int[] f1338u0;

        /* renamed from: v */
        public float f1339v;

        /* renamed from: v0 */
        public String f1340v0;

        /* renamed from: w */
        public String f1341w;

        /* renamed from: x */
        public int f1342x;

        /* renamed from: y */
        public int f1343y;

        /* renamed from: z */
        public float f1344z;

        private C0256b() {
            this.f1297a = false;
            this.f1305e = -1;
            this.f1307f = -1;
            this.f1309g = -1.0f;
            this.f1311h = -1;
            this.f1313i = -1;
            this.f1315j = -1;
            this.f1317k = -1;
            this.f1319l = -1;
            this.f1321m = -1;
            this.f1323n = -1;
            this.f1325o = -1;
            this.f1327p = -1;
            this.f1329q = -1;
            this.f1331r = -1;
            this.f1333s = -1;
            this.f1335t = -1;
            this.f1337u = 0.5f;
            this.f1339v = 0.5f;
            this.f1341w = null;
            this.f1342x = -1;
            this.f1343y = 0;
            this.f1344z = 0.0f;
            this.f1271A = -1;
            this.f1272B = -1;
            this.f1273C = -1;
            this.f1274D = -1;
            this.f1275E = -1;
            this.f1276F = -1;
            this.f1277G = -1;
            this.f1278H = -1;
            this.f1279I = -1;
            this.f1280J = 0;
            this.f1281K = -1;
            this.f1282L = -1;
            this.f1283M = -1;
            this.f1284N = -1;
            this.f1285O = -1;
            this.f1286P = -1;
            this.f1287Q = 0.0f;
            this.f1288R = 0.0f;
            this.f1289S = 0;
            this.f1290T = 0;
            this.f1291U = 1.0f;
            this.f1292V = false;
            this.f1293W = 0.0f;
            this.f1294X = 0.0f;
            this.f1295Y = 0.0f;
            this.f1296Z = 0.0f;
            this.f1298a0 = 1.0f;
            this.f1300b0 = 1.0f;
            this.f1302c0 = Float.NaN;
            this.f1304d0 = Float.NaN;
            this.f1306e0 = 0.0f;
            this.f1308f0 = 0.0f;
            this.f1310g0 = 0.0f;
            this.f1312h0 = false;
            this.f1314i0 = false;
            this.f1316j0 = 0;
            this.f1318k0 = 0;
            this.f1320l0 = -1;
            this.f1322m0 = -1;
            this.f1324n0 = -1;
            this.f1326o0 = -1;
            this.f1328p0 = 1.0f;
            this.f1330q0 = 1.0f;
            this.f1332r0 = false;
            this.f1334s0 = -1;
            this.f1336t0 = -1;
        }

        /* renamed from: a */
        private void m1298a(int i, ConstraintLayout.C0250a aVar) {
            this.f1303d = i;
            this.f1311h = aVar.f1226d;
            this.f1313i = aVar.f1228e;
            this.f1315j = aVar.f1230f;
            this.f1317k = aVar.f1232g;
            this.f1319l = aVar.f1234h;
            this.f1321m = aVar.f1236i;
            this.f1323n = aVar.f1238j;
            this.f1325o = aVar.f1240k;
            this.f1327p = aVar.f1242l;
            this.f1329q = aVar.f1247p;
            this.f1331r = aVar.f1248q;
            this.f1333s = aVar.f1249r;
            this.f1335t = aVar.f1250s;
            this.f1337u = aVar.f1257z;
            this.f1339v = aVar.f1194A;
            this.f1341w = aVar.f1195B;
            this.f1342x = aVar.f1244m;
            this.f1343y = aVar.f1245n;
            this.f1344z = aVar.f1246o;
            this.f1271A = aVar.f1209P;
            this.f1272B = aVar.f1210Q;
            this.f1273C = aVar.f1211R;
            this.f1309g = aVar.f1224c;
            this.f1305e = aVar.f1220a;
            this.f1307f = aVar.f1222b;
            this.f1299b = aVar.width;
            this.f1301c = aVar.height;
            this.f1274D = aVar.leftMargin;
            this.f1275E = aVar.rightMargin;
            this.f1276F = aVar.topMargin;
            this.f1277G = aVar.bottomMargin;
            this.f1287Q = aVar.f1198E;
            this.f1288R = aVar.f1197D;
            this.f1290T = aVar.f1200G;
            this.f1289S = aVar.f1199F;
            boolean z = aVar.f1212S;
            this.f1312h0 = z;
            this.f1314i0 = aVar.f1213T;
            this.f1316j0 = aVar.f1201H;
            this.f1318k0 = aVar.f1202I;
            this.f1312h0 = z;
            this.f1320l0 = aVar.f1205L;
            this.f1322m0 = aVar.f1206M;
            this.f1324n0 = aVar.f1203J;
            this.f1326o0 = aVar.f1204K;
            this.f1328p0 = aVar.f1207N;
            this.f1330q0 = aVar.f1208O;
            if (Build.VERSION.SDK_INT >= 17) {
                this.f1278H = aVar.getMarginEnd();
                this.f1279I = aVar.getMarginStart();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m1299a(int i, C0257d.C0258a aVar) {
            m1298a(i, (ConstraintLayout.C0250a) aVar);
            this.f1291U = aVar.f1346m0;
            this.f1294X = aVar.f1349p0;
            this.f1295Y = aVar.f1350q0;
            this.f1296Z = aVar.f1351r0;
            this.f1298a0 = aVar.f1352s0;
            this.f1300b0 = aVar.f1353t0;
            this.f1302c0 = aVar.f1354u0;
            this.f1304d0 = aVar.f1355v0;
            this.f1306e0 = aVar.f1356w0;
            this.f1308f0 = aVar.f1357x0;
            this.f1310g0 = aVar.f1358y0;
            this.f1293W = aVar.f1348o0;
            this.f1292V = aVar.f1347n0;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m1300a(C0253b bVar, int i, C0257d.C0258a aVar) {
            m1299a(i, aVar);
            if (bVar instanceof C0252a) {
                this.f1336t0 = 1;
                C0252a aVar2 = (C0252a) bVar;
                this.f1334s0 = aVar2.getType();
                this.f1338u0 = aVar2.getReferencedIds();
            }
        }

        /* renamed from: a */
        public void mo1750a(ConstraintLayout.C0250a aVar) {
            aVar.f1226d = this.f1311h;
            aVar.f1228e = this.f1313i;
            aVar.f1230f = this.f1315j;
            aVar.f1232g = this.f1317k;
            aVar.f1234h = this.f1319l;
            aVar.f1236i = this.f1321m;
            aVar.f1238j = this.f1323n;
            aVar.f1240k = this.f1325o;
            aVar.f1242l = this.f1327p;
            aVar.f1247p = this.f1329q;
            aVar.f1248q = this.f1331r;
            aVar.f1249r = this.f1333s;
            aVar.f1250s = this.f1335t;
            aVar.leftMargin = this.f1274D;
            aVar.rightMargin = this.f1275E;
            aVar.topMargin = this.f1276F;
            aVar.bottomMargin = this.f1277G;
            aVar.f1255x = this.f1286P;
            aVar.f1256y = this.f1285O;
            aVar.f1257z = this.f1337u;
            aVar.f1194A = this.f1339v;
            aVar.f1244m = this.f1342x;
            aVar.f1245n = this.f1343y;
            aVar.f1246o = this.f1344z;
            aVar.f1195B = this.f1341w;
            aVar.f1209P = this.f1271A;
            aVar.f1210Q = this.f1272B;
            aVar.f1198E = this.f1287Q;
            aVar.f1197D = this.f1288R;
            aVar.f1200G = this.f1290T;
            aVar.f1199F = this.f1289S;
            aVar.f1212S = this.f1312h0;
            aVar.f1213T = this.f1314i0;
            aVar.f1201H = this.f1316j0;
            aVar.f1202I = this.f1318k0;
            aVar.f1205L = this.f1320l0;
            aVar.f1206M = this.f1322m0;
            aVar.f1203J = this.f1324n0;
            aVar.f1204K = this.f1326o0;
            aVar.f1207N = this.f1328p0;
            aVar.f1208O = this.f1330q0;
            aVar.f1211R = this.f1273C;
            aVar.f1224c = this.f1309g;
            aVar.f1220a = this.f1305e;
            aVar.f1222b = this.f1307f;
            aVar.width = this.f1299b;
            aVar.height = this.f1301c;
            if (Build.VERSION.SDK_INT >= 17) {
                aVar.setMarginStart(this.f1279I);
                aVar.setMarginEnd(this.f1278H);
            }
            aVar.mo1732a();
        }

        public C0256b clone() {
            C0256b bVar = new C0256b();
            bVar.f1297a = this.f1297a;
            bVar.f1299b = this.f1299b;
            bVar.f1301c = this.f1301c;
            bVar.f1305e = this.f1305e;
            bVar.f1307f = this.f1307f;
            bVar.f1309g = this.f1309g;
            bVar.f1311h = this.f1311h;
            bVar.f1313i = this.f1313i;
            bVar.f1315j = this.f1315j;
            bVar.f1317k = this.f1317k;
            bVar.f1319l = this.f1319l;
            bVar.f1321m = this.f1321m;
            bVar.f1323n = this.f1323n;
            bVar.f1325o = this.f1325o;
            bVar.f1327p = this.f1327p;
            bVar.f1329q = this.f1329q;
            bVar.f1331r = this.f1331r;
            bVar.f1333s = this.f1333s;
            bVar.f1335t = this.f1335t;
            bVar.f1337u = this.f1337u;
            bVar.f1339v = this.f1339v;
            bVar.f1341w = this.f1341w;
            bVar.f1271A = this.f1271A;
            bVar.f1272B = this.f1272B;
            bVar.f1337u = this.f1337u;
            bVar.f1337u = this.f1337u;
            bVar.f1337u = this.f1337u;
            bVar.f1337u = this.f1337u;
            bVar.f1337u = this.f1337u;
            bVar.f1273C = this.f1273C;
            bVar.f1274D = this.f1274D;
            bVar.f1275E = this.f1275E;
            bVar.f1276F = this.f1276F;
            bVar.f1277G = this.f1277G;
            bVar.f1278H = this.f1278H;
            bVar.f1279I = this.f1279I;
            bVar.f1280J = this.f1280J;
            bVar.f1281K = this.f1281K;
            bVar.f1282L = this.f1282L;
            bVar.f1283M = this.f1283M;
            bVar.f1284N = this.f1284N;
            bVar.f1285O = this.f1285O;
            bVar.f1286P = this.f1286P;
            bVar.f1287Q = this.f1287Q;
            bVar.f1288R = this.f1288R;
            bVar.f1289S = this.f1289S;
            bVar.f1290T = this.f1290T;
            bVar.f1291U = this.f1291U;
            bVar.f1292V = this.f1292V;
            bVar.f1293W = this.f1293W;
            bVar.f1294X = this.f1294X;
            bVar.f1295Y = this.f1295Y;
            bVar.f1296Z = this.f1296Z;
            bVar.f1298a0 = this.f1298a0;
            bVar.f1300b0 = this.f1300b0;
            bVar.f1302c0 = this.f1302c0;
            bVar.f1304d0 = this.f1304d0;
            bVar.f1306e0 = this.f1306e0;
            bVar.f1308f0 = this.f1308f0;
            bVar.f1310g0 = this.f1310g0;
            bVar.f1312h0 = this.f1312h0;
            bVar.f1314i0 = this.f1314i0;
            bVar.f1316j0 = this.f1316j0;
            bVar.f1318k0 = this.f1318k0;
            bVar.f1320l0 = this.f1320l0;
            bVar.f1322m0 = this.f1322m0;
            bVar.f1324n0 = this.f1324n0;
            bVar.f1326o0 = this.f1326o0;
            bVar.f1328p0 = this.f1328p0;
            bVar.f1330q0 = this.f1330q0;
            bVar.f1334s0 = this.f1334s0;
            bVar.f1336t0 = this.f1336t0;
            int[] iArr = this.f1338u0;
            if (iArr != null) {
                bVar.f1338u0 = Arrays.copyOf(iArr, iArr.length);
            }
            bVar.f1342x = this.f1342x;
            bVar.f1343y = this.f1343y;
            bVar.f1344z = this.f1344z;
            bVar.f1332r0 = this.f1332r0;
            return bVar;
        }
    }

    static {
        f1269c.append(C0262h.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f1269c.append(C0262h.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f1269c.append(C0262h.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f1269c.append(C0262h.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f1269c.append(C0262h.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f1269c.append(C0262h.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f1269c.append(C0262h.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f1269c.append(C0262h.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f1269c.append(C0262h.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f1269c.append(C0262h.ConstraintSet_layout_editor_absoluteX, 6);
        f1269c.append(C0262h.ConstraintSet_layout_editor_absoluteY, 7);
        f1269c.append(C0262h.ConstraintSet_layout_constraintGuide_begin, 17);
        f1269c.append(C0262h.ConstraintSet_layout_constraintGuide_end, 18);
        f1269c.append(C0262h.ConstraintSet_layout_constraintGuide_percent, 19);
        f1269c.append(C0262h.ConstraintSet_android_orientation, 27);
        f1269c.append(C0262h.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f1269c.append(C0262h.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f1269c.append(C0262h.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f1269c.append(C0262h.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f1269c.append(C0262h.ConstraintSet_layout_goneMarginLeft, 13);
        f1269c.append(C0262h.ConstraintSet_layout_goneMarginTop, 16);
        f1269c.append(C0262h.ConstraintSet_layout_goneMarginRight, 14);
        f1269c.append(C0262h.ConstraintSet_layout_goneMarginBottom, 11);
        f1269c.append(C0262h.ConstraintSet_layout_goneMarginStart, 15);
        f1269c.append(C0262h.ConstraintSet_layout_goneMarginEnd, 12);
        f1269c.append(C0262h.ConstraintSet_layout_constraintVertical_weight, 40);
        f1269c.append(C0262h.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f1269c.append(C0262h.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f1269c.append(C0262h.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f1269c.append(C0262h.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f1269c.append(C0262h.ConstraintSet_layout_constraintVertical_bias, 37);
        f1269c.append(C0262h.ConstraintSet_layout_constraintDimensionRatio, 5);
        f1269c.append(C0262h.ConstraintSet_layout_constraintLeft_creator, 75);
        f1269c.append(C0262h.ConstraintSet_layout_constraintTop_creator, 75);
        f1269c.append(C0262h.ConstraintSet_layout_constraintRight_creator, 75);
        f1269c.append(C0262h.ConstraintSet_layout_constraintBottom_creator, 75);
        f1269c.append(C0262h.ConstraintSet_layout_constraintBaseline_creator, 75);
        f1269c.append(C0262h.ConstraintSet_android_layout_marginLeft, 24);
        f1269c.append(C0262h.ConstraintSet_android_layout_marginRight, 28);
        f1269c.append(C0262h.ConstraintSet_android_layout_marginStart, 31);
        f1269c.append(C0262h.ConstraintSet_android_layout_marginEnd, 8);
        f1269c.append(C0262h.ConstraintSet_android_layout_marginTop, 34);
        f1269c.append(C0262h.ConstraintSet_android_layout_marginBottom, 2);
        f1269c.append(C0262h.ConstraintSet_android_layout_width, 23);
        f1269c.append(C0262h.ConstraintSet_android_layout_height, 21);
        f1269c.append(C0262h.ConstraintSet_android_visibility, 22);
        f1269c.append(C0262h.ConstraintSet_android_alpha, 43);
        f1269c.append(C0262h.ConstraintSet_android_elevation, 44);
        f1269c.append(C0262h.ConstraintSet_android_rotationX, 45);
        f1269c.append(C0262h.ConstraintSet_android_rotationY, 46);
        f1269c.append(C0262h.ConstraintSet_android_rotation, 60);
        f1269c.append(C0262h.ConstraintSet_android_scaleX, 47);
        f1269c.append(C0262h.ConstraintSet_android_scaleY, 48);
        f1269c.append(C0262h.ConstraintSet_android_transformPivotX, 49);
        f1269c.append(C0262h.ConstraintSet_android_transformPivotY, 50);
        f1269c.append(C0262h.ConstraintSet_android_translationX, 51);
        f1269c.append(C0262h.ConstraintSet_android_translationY, 52);
        f1269c.append(C0262h.ConstraintSet_android_translationZ, 53);
        f1269c.append(C0262h.ConstraintSet_layout_constraintWidth_default, 54);
        f1269c.append(C0262h.ConstraintSet_layout_constraintHeight_default, 55);
        f1269c.append(C0262h.ConstraintSet_layout_constraintWidth_max, 56);
        f1269c.append(C0262h.ConstraintSet_layout_constraintHeight_max, 57);
        f1269c.append(C0262h.ConstraintSet_layout_constraintWidth_min, 58);
        f1269c.append(C0262h.ConstraintSet_layout_constraintHeight_min, 59);
        f1269c.append(C0262h.ConstraintSet_layout_constraintCircle, 61);
        f1269c.append(C0262h.ConstraintSet_layout_constraintCircleRadius, 62);
        f1269c.append(C0262h.ConstraintSet_layout_constraintCircleAngle, 63);
        f1269c.append(C0262h.ConstraintSet_android_id, 38);
        f1269c.append(C0262h.ConstraintSet_layout_constraintWidth_percent, 69);
        f1269c.append(C0262h.ConstraintSet_layout_constraintHeight_percent, 70);
        f1269c.append(C0262h.ConstraintSet_chainUseRtl, 71);
        f1269c.append(C0262h.ConstraintSet_barrierDirection, 72);
        f1269c.append(C0262h.ConstraintSet_constraint_referenced_ids, 73);
        f1269c.append(C0262h.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    /* renamed from: a */
    private static int m1291a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: a */
    private C0256b m1292a(Context context, AttributeSet attributeSet) {
        C0256b bVar = new C0256b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0262h.ConstraintSet);
        m1293a(bVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return bVar;
    }

    /* renamed from: a */
    private void m1293a(C0256b bVar, TypedArray typedArray) {
        StringBuilder sb;
        String str;
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f1269c.get(index);
            switch (i2) {
                case 1:
                    bVar.f1327p = m1291a(typedArray, index, bVar.f1327p);
                    break;
                case 2:
                    bVar.f1277G = typedArray.getDimensionPixelSize(index, bVar.f1277G);
                    break;
                case 3:
                    bVar.f1325o = m1291a(typedArray, index, bVar.f1325o);
                    break;
                case 4:
                    bVar.f1323n = m1291a(typedArray, index, bVar.f1323n);
                    break;
                case 5:
                    bVar.f1341w = typedArray.getString(index);
                    break;
                case 6:
                    bVar.f1271A = typedArray.getDimensionPixelOffset(index, bVar.f1271A);
                    break;
                case 7:
                    bVar.f1272B = typedArray.getDimensionPixelOffset(index, bVar.f1272B);
                    break;
                case 8:
                    bVar.f1278H = typedArray.getDimensionPixelSize(index, bVar.f1278H);
                    break;
                case 9:
                    bVar.f1335t = m1291a(typedArray, index, bVar.f1335t);
                    break;
                case 10:
                    bVar.f1333s = m1291a(typedArray, index, bVar.f1333s);
                    break;
                case 11:
                    bVar.f1284N = typedArray.getDimensionPixelSize(index, bVar.f1284N);
                    break;
                case 12:
                    bVar.f1285O = typedArray.getDimensionPixelSize(index, bVar.f1285O);
                    break;
                case 13:
                    bVar.f1281K = typedArray.getDimensionPixelSize(index, bVar.f1281K);
                    break;
                case 14:
                    bVar.f1283M = typedArray.getDimensionPixelSize(index, bVar.f1283M);
                    break;
                case 15:
                    bVar.f1286P = typedArray.getDimensionPixelSize(index, bVar.f1286P);
                    break;
                case 16:
                    bVar.f1282L = typedArray.getDimensionPixelSize(index, bVar.f1282L);
                    break;
                case 17:
                    bVar.f1305e = typedArray.getDimensionPixelOffset(index, bVar.f1305e);
                    break;
                case 18:
                    bVar.f1307f = typedArray.getDimensionPixelOffset(index, bVar.f1307f);
                    break;
                case 19:
                    bVar.f1309g = typedArray.getFloat(index, bVar.f1309g);
                    break;
                case 20:
                    bVar.f1337u = typedArray.getFloat(index, bVar.f1337u);
                    break;
                case 21:
                    bVar.f1301c = typedArray.getLayoutDimension(index, bVar.f1301c);
                    break;
                case 22:
                    bVar.f1280J = typedArray.getInt(index, bVar.f1280J);
                    bVar.f1280J = f1268b[bVar.f1280J];
                    break;
                case 23:
                    bVar.f1299b = typedArray.getLayoutDimension(index, bVar.f1299b);
                    break;
                case 24:
                    bVar.f1274D = typedArray.getDimensionPixelSize(index, bVar.f1274D);
                    break;
                case 25:
                    bVar.f1311h = m1291a(typedArray, index, bVar.f1311h);
                    break;
                case 26:
                    bVar.f1313i = m1291a(typedArray, index, bVar.f1313i);
                    break;
                case 27:
                    bVar.f1273C = typedArray.getInt(index, bVar.f1273C);
                    break;
                case 28:
                    bVar.f1275E = typedArray.getDimensionPixelSize(index, bVar.f1275E);
                    break;
                case 29:
                    bVar.f1315j = m1291a(typedArray, index, bVar.f1315j);
                    break;
                case 30:
                    bVar.f1317k = m1291a(typedArray, index, bVar.f1317k);
                    break;
                case 31:
                    bVar.f1279I = typedArray.getDimensionPixelSize(index, bVar.f1279I);
                    break;
                case 32:
                    bVar.f1329q = m1291a(typedArray, index, bVar.f1329q);
                    break;
                case 33:
                    bVar.f1331r = m1291a(typedArray, index, bVar.f1331r);
                    break;
                case 34:
                    bVar.f1276F = typedArray.getDimensionPixelSize(index, bVar.f1276F);
                    break;
                case 35:
                    bVar.f1321m = m1291a(typedArray, index, bVar.f1321m);
                    break;
                case 36:
                    bVar.f1319l = m1291a(typedArray, index, bVar.f1319l);
                    break;
                case 37:
                    bVar.f1339v = typedArray.getFloat(index, bVar.f1339v);
                    break;
                case 38:
                    bVar.f1303d = typedArray.getResourceId(index, bVar.f1303d);
                    break;
                case 39:
                    bVar.f1288R = typedArray.getFloat(index, bVar.f1288R);
                    break;
                case 40:
                    bVar.f1287Q = typedArray.getFloat(index, bVar.f1287Q);
                    break;
                case 41:
                    bVar.f1289S = typedArray.getInt(index, bVar.f1289S);
                    break;
                case 42:
                    bVar.f1290T = typedArray.getInt(index, bVar.f1290T);
                    break;
                case 43:
                    bVar.f1291U = typedArray.getFloat(index, bVar.f1291U);
                    break;
                case 44:
                    bVar.f1292V = true;
                    bVar.f1293W = typedArray.getDimension(index, bVar.f1293W);
                    break;
                case 45:
                    bVar.f1295Y = typedArray.getFloat(index, bVar.f1295Y);
                    break;
                case 46:
                    bVar.f1296Z = typedArray.getFloat(index, bVar.f1296Z);
                    break;
                case 47:
                    bVar.f1298a0 = typedArray.getFloat(index, bVar.f1298a0);
                    break;
                case 48:
                    bVar.f1300b0 = typedArray.getFloat(index, bVar.f1300b0);
                    break;
                case 49:
                    bVar.f1302c0 = typedArray.getFloat(index, bVar.f1302c0);
                    break;
                case 50:
                    bVar.f1304d0 = typedArray.getFloat(index, bVar.f1304d0);
                    break;
                case 51:
                    bVar.f1306e0 = typedArray.getDimension(index, bVar.f1306e0);
                    break;
                case 52:
                    bVar.f1308f0 = typedArray.getDimension(index, bVar.f1308f0);
                    break;
                case 53:
                    bVar.f1310g0 = typedArray.getDimension(index, bVar.f1310g0);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            bVar.f1294X = typedArray.getFloat(index, bVar.f1294X);
                            break;
                        case 61:
                            bVar.f1342x = m1291a(typedArray, index, bVar.f1342x);
                            break;
                        case 62:
                            bVar.f1343y = typedArray.getDimensionPixelSize(index, bVar.f1343y);
                            break;
                        case 63:
                            bVar.f1344z = typedArray.getFloat(index, bVar.f1344z);
                            break;
                        default:
                            switch (i2) {
                                case 69:
                                    bVar.f1328p0 = typedArray.getFloat(index, 1.0f);
                                    continue;
                                case 70:
                                    bVar.f1330q0 = typedArray.getFloat(index, 1.0f);
                                    continue;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    continue;
                                case 72:
                                    bVar.f1334s0 = typedArray.getInt(index, bVar.f1334s0);
                                    continue;
                                case 73:
                                    bVar.f1340v0 = typedArray.getString(index);
                                    continue;
                                case 74:
                                    bVar.f1332r0 = typedArray.getBoolean(index, bVar.f1332r0);
                                    continue;
                                case 75:
                                    sb = new StringBuilder();
                                    str = "unused attribute 0x";
                                    break;
                                default:
                                    sb = new StringBuilder();
                                    str = "Unknown attribute 0x";
                                    break;
                            }
                            sb.append(str);
                            sb.append(Integer.toHexString(index));
                            sb.append("   ");
                            sb.append(f1269c.get(index));
                            Log.w("ConstraintSet", sb.toString());
                            break;
                    }
            }
        }
    }

    /* renamed from: a */
    private int[] m1294a(View view, String str) {
        int i;
        Object a;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0261g.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (a = ((ConstraintLayout) view.getParent()).mo1704a(0, (Object) trim)) != null && (a instanceof Integer)) {
                i = ((Integer) a).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* renamed from: a */
    public void mo1747a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0256b a = m1292a(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        a.f1297a = true;
                    }
                    this.f1270a.put(Integer.valueOf(a.f1303d), a);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1748a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1270a.keySet());
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id != -1) {
                if (this.f1270a.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0256b bVar = this.f1270a.get(Integer.valueOf(id));
                    if (childAt instanceof C0252a) {
                        bVar.f1336t0 = 1;
                    }
                    int i2 = bVar.f1336t0;
                    if (i2 != -1 && i2 == 1) {
                        C0252a aVar = (C0252a) childAt;
                        aVar.setId(id);
                        aVar.setType(bVar.f1334s0);
                        aVar.setAllowsGoneWidget(bVar.f1332r0);
                        int[] iArr = bVar.f1338u0;
                        if (iArr != null) {
                            aVar.setReferencedIds(iArr);
                        } else {
                            String str = bVar.f1340v0;
                            if (str != null) {
                                bVar.f1338u0 = m1294a((View) aVar, str);
                                aVar.setReferencedIds(bVar.f1338u0);
                            }
                        }
                    }
                    ConstraintLayout.C0250a aVar2 = (ConstraintLayout.C0250a) childAt.getLayoutParams();
                    bVar.mo1750a(aVar2);
                    childAt.setLayoutParams(aVar2);
                    childAt.setVisibility(bVar.f1280J);
                    if (Build.VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(bVar.f1291U);
                        childAt.setRotation(bVar.f1294X);
                        childAt.setRotationX(bVar.f1295Y);
                        childAt.setRotationY(bVar.f1296Z);
                        childAt.setScaleX(bVar.f1298a0);
                        childAt.setScaleY(bVar.f1300b0);
                        if (!Float.isNaN(bVar.f1302c0)) {
                            childAt.setPivotX(bVar.f1302c0);
                        }
                        if (!Float.isNaN(bVar.f1304d0)) {
                            childAt.setPivotY(bVar.f1304d0);
                        }
                        childAt.setTranslationX(bVar.f1306e0);
                        childAt.setTranslationY(bVar.f1308f0);
                        if (Build.VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(bVar.f1310g0);
                            if (bVar.f1292V) {
                                childAt.setElevation(bVar.f1293W);
                            }
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0256b bVar2 = this.f1270a.get(num);
            int i3 = bVar2.f1336t0;
            if (i3 != -1 && i3 == 1) {
                C0252a aVar3 = new C0252a(constraintLayout.getContext());
                aVar3.setId(num.intValue());
                int[] iArr2 = bVar2.f1338u0;
                if (iArr2 != null) {
                    aVar3.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar2.f1340v0;
                    if (str2 != null) {
                        bVar2.f1338u0 = m1294a((View) aVar3, str2);
                        aVar3.setReferencedIds(bVar2.f1338u0);
                    }
                }
                aVar3.setType(bVar2.f1334s0);
                ConstraintLayout.C0250a generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                aVar3.mo1738a();
                bVar2.mo1750a(generateDefaultLayoutParams);
                constraintLayout.addView(aVar3, generateDefaultLayoutParams);
            }
            if (bVar2.f1297a) {
                C0259e eVar = new C0259e(constraintLayout.getContext());
                eVar.setId(num.intValue());
                ConstraintLayout.C0250a generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                bVar2.mo1750a(generateDefaultLayoutParams2);
                constraintLayout.addView(eVar, generateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: a */
    public void mo1749a(C0257d dVar) {
        int childCount = dVar.getChildCount();
        this.f1270a.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = dVar.getChildAt(i);
            C0257d.C0258a aVar = (C0257d.C0258a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.f1270a.containsKey(Integer.valueOf(id))) {
                    this.f1270a.put(Integer.valueOf(id), new C0256b());
                }
                C0256b bVar = this.f1270a.get(Integer.valueOf(id));
                if (childAt instanceof C0253b) {
                    bVar.m1300a((C0253b) childAt, id, aVar);
                }
                bVar.m1299a(id, aVar);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }
}
