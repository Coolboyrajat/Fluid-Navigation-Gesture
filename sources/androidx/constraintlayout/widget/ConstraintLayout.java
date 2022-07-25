package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import p006b.p022e.p023a.C0744f;
import p006b.p022e.p023a.p024j.C0758f;
import p006b.p022e.p023a.p024j.C0761g;
import p006b.p022e.p023a.p024j.C0763i;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: f */
    SparseArray<View> f1178f = new SparseArray<>();

    /* renamed from: g */
    private ArrayList<C0253b> f1179g = new ArrayList<>(4);

    /* renamed from: h */
    private final ArrayList<C0758f> f1180h = new ArrayList<>(100);

    /* renamed from: i */
    C0761g f1181i = new C0761g();

    /* renamed from: j */
    private int f1182j = 0;

    /* renamed from: k */
    private int f1183k = 0;

    /* renamed from: l */
    private int f1184l = Integer.MAX_VALUE;

    /* renamed from: m */
    private int f1185m = Integer.MAX_VALUE;

    /* renamed from: n */
    private boolean f1186n = true;

    /* renamed from: o */
    private int f1187o = 7;

    /* renamed from: p */
    private C0254c f1188p = null;

    /* renamed from: q */
    private int f1189q = -1;

    /* renamed from: r */
    private HashMap<String, Integer> f1190r = new HashMap<>();

    /* renamed from: s */
    private int f1191s = -1;

    /* renamed from: t */
    private int f1192t = -1;

    /* renamed from: u */
    private C0744f f1193u;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static class C0250a extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f1194A = 0.5f;

        /* renamed from: B */
        public String f1195B = null;

        /* renamed from: C */
        int f1196C = 1;

        /* renamed from: D */
        public float f1197D = -1.0f;

        /* renamed from: E */
        public float f1198E = -1.0f;

        /* renamed from: F */
        public int f1199F = 0;

        /* renamed from: G */
        public int f1200G = 0;

        /* renamed from: H */
        public int f1201H = 0;

        /* renamed from: I */
        public int f1202I = 0;

        /* renamed from: J */
        public int f1203J = 0;

        /* renamed from: K */
        public int f1204K = 0;

        /* renamed from: L */
        public int f1205L = 0;

        /* renamed from: M */
        public int f1206M = 0;

        /* renamed from: N */
        public float f1207N = 1.0f;

        /* renamed from: O */
        public float f1208O = 1.0f;

        /* renamed from: P */
        public int f1209P = -1;

        /* renamed from: Q */
        public int f1210Q = -1;

        /* renamed from: R */
        public int f1211R = -1;

        /* renamed from: S */
        public boolean f1212S = false;

        /* renamed from: T */
        public boolean f1213T = false;

        /* renamed from: U */
        boolean f1214U = true;

        /* renamed from: V */
        boolean f1215V = true;

        /* renamed from: W */
        boolean f1216W = false;

        /* renamed from: X */
        boolean f1217X = false;

        /* renamed from: Y */
        boolean f1218Y = false;

        /* renamed from: Z */
        boolean f1219Z = false;

        /* renamed from: a */
        public int f1220a = -1;

        /* renamed from: a0 */
        int f1221a0 = -1;

        /* renamed from: b */
        public int f1222b = -1;

        /* renamed from: b0 */
        int f1223b0 = -1;

        /* renamed from: c */
        public float f1224c = -1.0f;

        /* renamed from: c0 */
        int f1225c0 = -1;

        /* renamed from: d */
        public int f1226d = -1;

        /* renamed from: d0 */
        int f1227d0 = -1;

        /* renamed from: e */
        public int f1228e = -1;

        /* renamed from: e0 */
        int f1229e0 = -1;

        /* renamed from: f */
        public int f1230f = -1;

        /* renamed from: f0 */
        int f1231f0 = -1;

        /* renamed from: g */
        public int f1232g = -1;

        /* renamed from: g0 */
        float f1233g0 = 0.5f;

        /* renamed from: h */
        public int f1234h = -1;

        /* renamed from: h0 */
        int f1235h0;

        /* renamed from: i */
        public int f1236i = -1;

        /* renamed from: i0 */
        int f1237i0;

        /* renamed from: j */
        public int f1238j = -1;

        /* renamed from: j0 */
        float f1239j0;

        /* renamed from: k */
        public int f1240k = -1;

        /* renamed from: k0 */
        C0758f f1241k0 = new C0758f();

        /* renamed from: l */
        public int f1242l = -1;

        /* renamed from: l0 */
        public boolean f1243l0 = false;

        /* renamed from: m */
        public int f1244m = -1;

        /* renamed from: n */
        public int f1245n = 0;

        /* renamed from: o */
        public float f1246o = 0.0f;

        /* renamed from: p */
        public int f1247p = -1;

        /* renamed from: q */
        public int f1248q = -1;

        /* renamed from: r */
        public int f1249r = -1;

        /* renamed from: s */
        public int f1250s = -1;

        /* renamed from: t */
        public int f1251t = -1;

        /* renamed from: u */
        public int f1252u = -1;

        /* renamed from: v */
        public int f1253v = -1;

        /* renamed from: w */
        public int f1254w = -1;

        /* renamed from: x */
        public int f1255x = -1;

        /* renamed from: y */
        public int f1256y = -1;

        /* renamed from: z */
        public float f1257z = 0.5f;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a */
        private static class C0251a {

            /* renamed from: a */
            public static final SparseIntArray f1258a = new SparseIntArray();

            static {
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f1258a.append(C0262h.ConstraintLayout_Layout_android_orientation, 1);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f1258a.append(C0262h.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }
        }

        public C0250a(int i, int i2) {
            super(i, i2);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x020b, code lost:
            android.util.Log.e("ConstraintLayout", r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0250a(android.content.Context r10, android.util.AttributeSet r11) {
            /*
                r9 = this;
                r9.<init>(r10, r11)
                r0 = -1
                r9.f1220a = r0
                r9.f1222b = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r9.f1224c = r1
                r9.f1226d = r0
                r9.f1228e = r0
                r9.f1230f = r0
                r9.f1232g = r0
                r9.f1234h = r0
                r9.f1236i = r0
                r9.f1238j = r0
                r9.f1240k = r0
                r9.f1242l = r0
                r9.f1244m = r0
                r2 = 0
                r9.f1245n = r2
                r3 = 0
                r9.f1246o = r3
                r9.f1247p = r0
                r9.f1248q = r0
                r9.f1249r = r0
                r9.f1250s = r0
                r9.f1251t = r0
                r9.f1252u = r0
                r9.f1253v = r0
                r9.f1254w = r0
                r9.f1255x = r0
                r9.f1256y = r0
                r4 = 1056964608(0x3f000000, float:0.5)
                r9.f1257z = r4
                r9.f1194A = r4
                r5 = 0
                r9.f1195B = r5
                r5 = 1
                r9.f1196C = r5
                r9.f1197D = r1
                r9.f1198E = r1
                r9.f1199F = r2
                r9.f1200G = r2
                r9.f1201H = r2
                r9.f1202I = r2
                r9.f1203J = r2
                r9.f1204K = r2
                r9.f1205L = r2
                r9.f1206M = r2
                r1 = 1065353216(0x3f800000, float:1.0)
                r9.f1207N = r1
                r9.f1208O = r1
                r9.f1209P = r0
                r9.f1210Q = r0
                r9.f1211R = r0
                r9.f1212S = r2
                r9.f1213T = r2
                r9.f1214U = r5
                r9.f1215V = r5
                r9.f1216W = r2
                r9.f1217X = r2
                r9.f1218Y = r2
                r9.f1219Z = r2
                r9.f1221a0 = r0
                r9.f1223b0 = r0
                r9.f1225c0 = r0
                r9.f1227d0 = r0
                r9.f1229e0 = r0
                r9.f1231f0 = r0
                r9.f1233g0 = r4
                b.e.a.j.f r1 = new b.e.a.j.f
                r1.<init>()
                r9.f1241k0 = r1
                r9.f1243l0 = r2
                int[] r1 = androidx.constraintlayout.widget.C0262h.ConstraintLayout_Layout
                android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r1)
                int r11 = r10.getIndexCount()
                r1 = 0
            L_0x0098:
                if (r1 >= r11) goto L_0x03d0
                int r4 = r10.getIndex(r1)
                android.util.SparseIntArray r6 = androidx.constraintlayout.widget.ConstraintLayout.C0250a.C0251a.f1258a
                int r6 = r6.get(r4)
                java.lang.String r7 = "ConstraintLayout"
                r8 = -2
                switch(r6) {
                    case 0: goto L_0x03cc;
                    case 1: goto L_0x03c4;
                    case 2: goto L_0x03b1;
                    case 3: goto L_0x03a8;
                    case 4: goto L_0x0391;
                    case 5: goto L_0x0388;
                    case 6: goto L_0x037f;
                    case 7: goto L_0x0376;
                    case 8: goto L_0x0363;
                    case 9: goto L_0x0350;
                    case 10: goto L_0x033c;
                    case 11: goto L_0x0328;
                    case 12: goto L_0x0314;
                    case 13: goto L_0x0300;
                    case 14: goto L_0x02ec;
                    case 15: goto L_0x02d8;
                    case 16: goto L_0x02c4;
                    case 17: goto L_0x02b0;
                    case 18: goto L_0x029c;
                    case 19: goto L_0x0288;
                    case 20: goto L_0x0274;
                    case 21: goto L_0x026a;
                    case 22: goto L_0x0260;
                    case 23: goto L_0x0256;
                    case 24: goto L_0x024c;
                    case 25: goto L_0x0242;
                    case 26: goto L_0x0238;
                    case 27: goto L_0x022e;
                    case 28: goto L_0x0224;
                    case 29: goto L_0x021a;
                    case 30: goto L_0x0210;
                    case 31: goto L_0x01ff;
                    case 32: goto L_0x01f2;
                    case 33: goto L_0x01db;
                    case 34: goto L_0x01c4;
                    case 35: goto L_0x01b6;
                    case 36: goto L_0x019f;
                    case 37: goto L_0x0188;
                    case 38: goto L_0x017a;
                    case 39: goto L_0x03cc;
                    case 40: goto L_0x03cc;
                    case 41: goto L_0x03cc;
                    case 42: goto L_0x03cc;
                    case 43: goto L_0x00aa;
                    case 44: goto L_0x00e4;
                    case 45: goto L_0x00da;
                    case 46: goto L_0x00d0;
                    case 47: goto L_0x00c8;
                    case 48: goto L_0x00c0;
                    case 49: goto L_0x00b6;
                    case 50: goto L_0x00ac;
                    default: goto L_0x00aa;
                }
            L_0x00aa:
                goto L_0x03cc
            L_0x00ac:
                int r6 = r9.f1210Q
                int r4 = r10.getDimensionPixelOffset(r4, r6)
                r9.f1210Q = r4
                goto L_0x03cc
            L_0x00b6:
                int r6 = r9.f1209P
                int r4 = r10.getDimensionPixelOffset(r4, r6)
                r9.f1209P = r4
                goto L_0x03cc
            L_0x00c0:
                int r4 = r10.getInt(r4, r2)
                r9.f1200G = r4
                goto L_0x03cc
            L_0x00c8:
                int r4 = r10.getInt(r4, r2)
                r9.f1199F = r4
                goto L_0x03cc
            L_0x00d0:
                float r6 = r9.f1198E
                float r4 = r10.getFloat(r4, r6)
                r9.f1198E = r4
                goto L_0x03cc
            L_0x00da:
                float r6 = r9.f1197D
                float r4 = r10.getFloat(r4, r6)
                r9.f1197D = r4
                goto L_0x03cc
            L_0x00e4:
                java.lang.String r4 = r10.getString(r4)
                r9.f1195B = r4
                r9.f1196C = r0
                java.lang.String r4 = r9.f1195B
                if (r4 == 0) goto L_0x03cc
                int r4 = r4.length()
                java.lang.String r6 = r9.f1195B
                r7 = 44
                int r6 = r6.indexOf(r7)
                if (r6 <= 0) goto L_0x0120
                int r7 = r4 + -1
                if (r6 >= r7) goto L_0x0120
                java.lang.String r7 = r9.f1195B
                java.lang.String r7 = r7.substring(r2, r6)
                java.lang.String r8 = "W"
                boolean r8 = r7.equalsIgnoreCase(r8)
                if (r8 == 0) goto L_0x0113
                r9.f1196C = r2
                goto L_0x011d
            L_0x0113:
                java.lang.String r8 = "H"
                boolean r7 = r7.equalsIgnoreCase(r8)
                if (r7 == 0) goto L_0x011d
                r9.f1196C = r5
            L_0x011d:
                int r6 = r6 + 1
                goto L_0x0121
            L_0x0120:
                r6 = 0
            L_0x0121:
                java.lang.String r7 = r9.f1195B
                r8 = 58
                int r7 = r7.indexOf(r8)
                if (r7 < 0) goto L_0x0169
                int r4 = r4 + -1
                if (r7 >= r4) goto L_0x0169
                java.lang.String r4 = r9.f1195B
                java.lang.String r4 = r4.substring(r6, r7)
                java.lang.String r6 = r9.f1195B
                int r7 = r7 + 1
                java.lang.String r6 = r6.substring(r7)
                int r7 = r4.length()
                if (r7 <= 0) goto L_0x03cc
                int r7 = r6.length()
                if (r7 <= 0) goto L_0x03cc
                float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03cc }
                float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ NumberFormatException -> 0x03cc }
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x03cc
                int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x03cc
                int r7 = r9.f1196C     // Catch:{ NumberFormatException -> 0x03cc }
                if (r7 != r5) goto L_0x0163
                float r6 = r6 / r4
                java.lang.Math.abs(r6)     // Catch:{ NumberFormatException -> 0x03cc }
                goto L_0x03cc
            L_0x0163:
                float r4 = r4 / r6
                java.lang.Math.abs(r4)     // Catch:{ NumberFormatException -> 0x03cc }
                goto L_0x03cc
            L_0x0169:
                java.lang.String r4 = r9.f1195B
                java.lang.String r4 = r4.substring(r6)
                int r6 = r4.length()
                if (r6 <= 0) goto L_0x03cc
                java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03cc }
                goto L_0x03cc
            L_0x017a:
                float r6 = r9.f1208O
                float r4 = r10.getFloat(r4, r6)
                float r4 = java.lang.Math.max(r3, r4)
                r9.f1208O = r4
                goto L_0x03cc
            L_0x0188:
                int r6 = r9.f1206M     // Catch:{ Exception -> 0x0192 }
                int r6 = r10.getDimensionPixelSize(r4, r6)     // Catch:{ Exception -> 0x0192 }
                r9.f1206M = r6     // Catch:{ Exception -> 0x0192 }
                goto L_0x03cc
            L_0x0192:
                int r6 = r9.f1206M
                int r4 = r10.getInt(r4, r6)
                if (r4 != r8) goto L_0x03cc
                r9.f1206M = r8
                goto L_0x03cc
            L_0x019f:
                int r6 = r9.f1204K     // Catch:{ Exception -> 0x01a9 }
                int r6 = r10.getDimensionPixelSize(r4, r6)     // Catch:{ Exception -> 0x01a9 }
                r9.f1204K = r6     // Catch:{ Exception -> 0x01a9 }
                goto L_0x03cc
            L_0x01a9:
                int r6 = r9.f1204K
                int r4 = r10.getInt(r4, r6)
                if (r4 != r8) goto L_0x03cc
                r9.f1204K = r8
                goto L_0x03cc
            L_0x01b6:
                float r6 = r9.f1207N
                float r4 = r10.getFloat(r4, r6)
                float r4 = java.lang.Math.max(r3, r4)
                r9.f1207N = r4
                goto L_0x03cc
            L_0x01c4:
                int r6 = r9.f1205L     // Catch:{ Exception -> 0x01ce }
                int r6 = r10.getDimensionPixelSize(r4, r6)     // Catch:{ Exception -> 0x01ce }
                r9.f1205L = r6     // Catch:{ Exception -> 0x01ce }
                goto L_0x03cc
            L_0x01ce:
                int r6 = r9.f1205L
                int r4 = r10.getInt(r4, r6)
                if (r4 != r8) goto L_0x03cc
                r9.f1205L = r8
                goto L_0x03cc
            L_0x01db:
                int r6 = r9.f1203J     // Catch:{ Exception -> 0x01e5 }
                int r6 = r10.getDimensionPixelSize(r4, r6)     // Catch:{ Exception -> 0x01e5 }
                r9.f1203J = r6     // Catch:{ Exception -> 0x01e5 }
                goto L_0x03cc
            L_0x01e5:
                int r6 = r9.f1203J
                int r4 = r10.getInt(r4, r6)
                if (r4 != r8) goto L_0x03cc
                r9.f1203J = r8
                goto L_0x03cc
            L_0x01f2:
                int r4 = r10.getInt(r4, r2)
                r9.f1202I = r4
                int r4 = r9.f1202I
                if (r4 != r5) goto L_0x03cc
                java.lang.String r4 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
                goto L_0x020b
            L_0x01ff:
                int r4 = r10.getInt(r4, r2)
                r9.f1201H = r4
                int r4 = r9.f1201H
                if (r4 != r5) goto L_0x03cc
                java.lang.String r4 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
            L_0x020b:
                android.util.Log.e(r7, r4)
                goto L_0x03cc
            L_0x0210:
                float r6 = r9.f1194A
                float r4 = r10.getFloat(r4, r6)
                r9.f1194A = r4
                goto L_0x03cc
            L_0x021a:
                float r6 = r9.f1257z
                float r4 = r10.getFloat(r4, r6)
                r9.f1257z = r4
                goto L_0x03cc
            L_0x0224:
                boolean r6 = r9.f1213T
                boolean r4 = r10.getBoolean(r4, r6)
                r9.f1213T = r4
                goto L_0x03cc
            L_0x022e:
                boolean r6 = r9.f1212S
                boolean r4 = r10.getBoolean(r4, r6)
                r9.f1212S = r4
                goto L_0x03cc
            L_0x0238:
                int r6 = r9.f1256y
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.f1256y = r4
                goto L_0x03cc
            L_0x0242:
                int r6 = r9.f1255x
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.f1255x = r4
                goto L_0x03cc
            L_0x024c:
                int r6 = r9.f1254w
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.f1254w = r4
                goto L_0x03cc
            L_0x0256:
                int r6 = r9.f1253v
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.f1253v = r4
                goto L_0x03cc
            L_0x0260:
                int r6 = r9.f1252u
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.f1252u = r4
                goto L_0x03cc
            L_0x026a:
                int r6 = r9.f1251t
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.f1251t = r4
                goto L_0x03cc
            L_0x0274:
                int r6 = r9.f1250s
                int r6 = r10.getResourceId(r4, r6)
                r9.f1250s = r6
                int r6 = r9.f1250s
                if (r6 != r0) goto L_0x03cc
                int r4 = r10.getInt(r4, r0)
                r9.f1250s = r4
                goto L_0x03cc
            L_0x0288:
                int r6 = r9.f1249r
                int r6 = r10.getResourceId(r4, r6)
                r9.f1249r = r6
                int r6 = r9.f1249r
                if (r6 != r0) goto L_0x03cc
                int r4 = r10.getInt(r4, r0)
                r9.f1249r = r4
                goto L_0x03cc
            L_0x029c:
                int r6 = r9.f1248q
                int r6 = r10.getResourceId(r4, r6)
                r9.f1248q = r6
                int r6 = r9.f1248q
                if (r6 != r0) goto L_0x03cc
                int r4 = r10.getInt(r4, r0)
                r9.f1248q = r4
                goto L_0x03cc
            L_0x02b0:
                int r6 = r9.f1247p
                int r6 = r10.getResourceId(r4, r6)
                r9.f1247p = r6
                int r6 = r9.f1247p
                if (r6 != r0) goto L_0x03cc
                int r4 = r10.getInt(r4, r0)
                r9.f1247p = r4
                goto L_0x03cc
            L_0x02c4:
                int r6 = r9.f1242l
                int r6 = r10.getResourceId(r4, r6)
                r9.f1242l = r6
                int r6 = r9.f1242l
                if (r6 != r0) goto L_0x03cc
                int r4 = r10.getInt(r4, r0)
                r9.f1242l = r4
                goto L_0x03cc
            L_0x02d8:
                int r6 = r9.f1240k
                int r6 = r10.getResourceId(r4, r6)
                r9.f1240k = r6
                int r6 = r9.f1240k
                if (r6 != r0) goto L_0x03cc
                int r4 = r10.getInt(r4, r0)
                r9.f1240k = r4
                goto L_0x03cc
            L_0x02ec:
                int r6 = r9.f1238j
                int r6 = r10.getResourceId(r4, r6)
                r9.f1238j = r6
                int r6 = r9.f1238j
                if (r6 != r0) goto L_0x03cc
                int r4 = r10.getInt(r4, r0)
                r9.f1238j = r4
                goto L_0x03cc
            L_0x0300:
                int r6 = r9.f1236i
                int r6 = r10.getResourceId(r4, r6)
                r9.f1236i = r6
                int r6 = r9.f1236i
                if (r6 != r0) goto L_0x03cc
                int r4 = r10.getInt(r4, r0)
                r9.f1236i = r4
                goto L_0x03cc
            L_0x0314:
                int r6 = r9.f1234h
                int r6 = r10.getResourceId(r4, r6)
                r9.f1234h = r6
                int r6 = r9.f1234h
                if (r6 != r0) goto L_0x03cc
                int r4 = r10.getInt(r4, r0)
                r9.f1234h = r4
                goto L_0x03cc
            L_0x0328:
                int r6 = r9.f1232g
                int r6 = r10.getResourceId(r4, r6)
                r9.f1232g = r6
                int r6 = r9.f1232g
                if (r6 != r0) goto L_0x03cc
                int r4 = r10.getInt(r4, r0)
                r9.f1232g = r4
                goto L_0x03cc
            L_0x033c:
                int r6 = r9.f1230f
                int r6 = r10.getResourceId(r4, r6)
                r9.f1230f = r6
                int r6 = r9.f1230f
                if (r6 != r0) goto L_0x03cc
                int r4 = r10.getInt(r4, r0)
                r9.f1230f = r4
                goto L_0x03cc
            L_0x0350:
                int r6 = r9.f1228e
                int r6 = r10.getResourceId(r4, r6)
                r9.f1228e = r6
                int r6 = r9.f1228e
                if (r6 != r0) goto L_0x03cc
                int r4 = r10.getInt(r4, r0)
                r9.f1228e = r4
                goto L_0x03cc
            L_0x0363:
                int r6 = r9.f1226d
                int r6 = r10.getResourceId(r4, r6)
                r9.f1226d = r6
                int r6 = r9.f1226d
                if (r6 != r0) goto L_0x03cc
                int r4 = r10.getInt(r4, r0)
                r9.f1226d = r4
                goto L_0x03cc
            L_0x0376:
                float r6 = r9.f1224c
                float r4 = r10.getFloat(r4, r6)
                r9.f1224c = r4
                goto L_0x03cc
            L_0x037f:
                int r6 = r9.f1222b
                int r4 = r10.getDimensionPixelOffset(r4, r6)
                r9.f1222b = r4
                goto L_0x03cc
            L_0x0388:
                int r6 = r9.f1220a
                int r4 = r10.getDimensionPixelOffset(r4, r6)
                r9.f1220a = r4
                goto L_0x03cc
            L_0x0391:
                float r6 = r9.f1246o
                float r4 = r10.getFloat(r4, r6)
                r6 = 1135869952(0x43b40000, float:360.0)
                float r4 = r4 % r6
                r9.f1246o = r4
                float r4 = r9.f1246o
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 >= 0) goto L_0x03cc
                float r4 = r6 - r4
                float r4 = r4 % r6
                r9.f1246o = r4
                goto L_0x03cc
            L_0x03a8:
                int r6 = r9.f1245n
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.f1245n = r4
                goto L_0x03cc
            L_0x03b1:
                int r6 = r9.f1244m
                int r6 = r10.getResourceId(r4, r6)
                r9.f1244m = r6
                int r6 = r9.f1244m
                if (r6 != r0) goto L_0x03cc
                int r4 = r10.getInt(r4, r0)
                r9.f1244m = r4
                goto L_0x03cc
            L_0x03c4:
                int r6 = r9.f1211R
                int r4 = r10.getInt(r4, r6)
                r9.f1211R = r4
            L_0x03cc:
                int r1 = r1 + 1
                goto L_0x0098
            L_0x03d0:
                r10.recycle()
                r9.mo1732a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0250a.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        public C0250a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public void mo1732a() {
            this.f1217X = false;
            this.f1214U = true;
            this.f1215V = true;
            if (this.width == -2 && this.f1212S) {
                this.f1214U = false;
                this.f1201H = 1;
            }
            if (this.height == -2 && this.f1213T) {
                this.f1215V = false;
                this.f1202I = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.f1214U = false;
                if (this.width == 0 && this.f1201H == 1) {
                    this.width = -2;
                    this.f1212S = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.f1215V = false;
                if (this.height == 0 && this.f1202I == 1) {
                    this.height = -2;
                    this.f1213T = true;
                }
            }
            if (this.f1224c != -1.0f || this.f1220a != -1 || this.f1222b != -1) {
                this.f1217X = true;
                this.f1214U = true;
                this.f1215V = true;
                if (!(this.f1241k0 instanceof C0763i)) {
                    this.f1241k0 = new C0763i();
                }
                ((C0763i) this.f1241k0).mo4424v(this.f1211R);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d6, code lost:
            if (r1 > 0) goto L_0x00d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x00e5, code lost:
            if (r1 > 0) goto L_0x00d8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x00ec  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x00f7  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r7) {
            /*
                r6 = this;
                int r0 = r6.leftMargin
                int r1 = r6.rightMargin
                super.resolveLayoutDirection(r7)
                r7 = -1
                r6.f1225c0 = r7
                r6.f1227d0 = r7
                r6.f1221a0 = r7
                r6.f1223b0 = r7
                r6.f1229e0 = r7
                r6.f1231f0 = r7
                int r2 = r6.f1251t
                r6.f1229e0 = r2
                int r2 = r6.f1253v
                r6.f1231f0 = r2
                float r2 = r6.f1257z
                r6.f1233g0 = r2
                int r2 = r6.f1220a
                r6.f1235h0 = r2
                int r2 = r6.f1222b
                r6.f1237i0 = r2
                float r2 = r6.f1224c
                r6.f1239j0 = r2
                int r2 = r6.getLayoutDirection()
                r3 = 0
                r4 = 1
                if (r4 != r2) goto L_0x0036
                r2 = 1
                goto L_0x0037
            L_0x0036:
                r2 = 0
            L_0x0037:
                if (r2 == 0) goto L_0x0098
                int r2 = r6.f1247p
                if (r2 == r7) goto L_0x0041
                r6.f1225c0 = r2
            L_0x003f:
                r3 = 1
                goto L_0x0048
            L_0x0041:
                int r2 = r6.f1248q
                if (r2 == r7) goto L_0x0048
                r6.f1227d0 = r2
                goto L_0x003f
            L_0x0048:
                int r2 = r6.f1249r
                if (r2 == r7) goto L_0x004f
                r6.f1223b0 = r2
                r3 = 1
            L_0x004f:
                int r2 = r6.f1250s
                if (r2 == r7) goto L_0x0056
                r6.f1221a0 = r2
                r3 = 1
            L_0x0056:
                int r2 = r6.f1255x
                if (r2 == r7) goto L_0x005c
                r6.f1231f0 = r2
            L_0x005c:
                int r2 = r6.f1256y
                if (r2 == r7) goto L_0x0062
                r6.f1229e0 = r2
            L_0x0062:
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x006c
                float r3 = r6.f1257z
                float r3 = r2 - r3
                r6.f1233g0 = r3
            L_0x006c:
                boolean r3 = r6.f1217X
                if (r3 == 0) goto L_0x00bc
                int r3 = r6.f1211R
                if (r3 != r4) goto L_0x00bc
                float r3 = r6.f1224c
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x0084
                float r2 = r2 - r3
                r6.f1239j0 = r2
                r6.f1235h0 = r7
                r6.f1237i0 = r7
                goto L_0x00bc
            L_0x0084:
                int r2 = r6.f1220a
                if (r2 == r7) goto L_0x008f
                r6.f1237i0 = r2
                r6.f1235h0 = r7
            L_0x008c:
                r6.f1239j0 = r4
                goto L_0x00bc
            L_0x008f:
                int r2 = r6.f1222b
                if (r2 == r7) goto L_0x00bc
                r6.f1235h0 = r2
                r6.f1237i0 = r7
                goto L_0x008c
            L_0x0098:
                int r2 = r6.f1247p
                if (r2 == r7) goto L_0x009e
                r6.f1223b0 = r2
            L_0x009e:
                int r2 = r6.f1248q
                if (r2 == r7) goto L_0x00a4
                r6.f1221a0 = r2
            L_0x00a4:
                int r2 = r6.f1249r
                if (r2 == r7) goto L_0x00aa
                r6.f1225c0 = r2
            L_0x00aa:
                int r2 = r6.f1250s
                if (r2 == r7) goto L_0x00b0
                r6.f1227d0 = r2
            L_0x00b0:
                int r2 = r6.f1255x
                if (r2 == r7) goto L_0x00b6
                r6.f1229e0 = r2
            L_0x00b6:
                int r2 = r6.f1256y
                if (r2 == r7) goto L_0x00bc
                r6.f1231f0 = r2
            L_0x00bc:
                int r2 = r6.f1249r
                if (r2 != r7) goto L_0x0104
                int r2 = r6.f1250s
                if (r2 != r7) goto L_0x0104
                int r2 = r6.f1248q
                if (r2 != r7) goto L_0x0104
                int r2 = r6.f1247p
                if (r2 != r7) goto L_0x0104
                int r2 = r6.f1230f
                if (r2 == r7) goto L_0x00db
                r6.f1225c0 = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00e8
                if (r1 <= 0) goto L_0x00e8
            L_0x00d8:
                r6.rightMargin = r1
                goto L_0x00e8
            L_0x00db:
                int r2 = r6.f1232g
                if (r2 == r7) goto L_0x00e8
                r6.f1227d0 = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00e8
                if (r1 <= 0) goto L_0x00e8
                goto L_0x00d8
            L_0x00e8:
                int r1 = r6.f1226d
                if (r1 == r7) goto L_0x00f7
                r6.f1221a0 = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x0104
                if (r0 <= 0) goto L_0x0104
            L_0x00f4:
                r6.leftMargin = r0
                goto L_0x0104
            L_0x00f7:
                int r1 = r6.f1228e
                if (r1 == r7) goto L_0x0104
                r6.f1223b0 = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x0104
                if (r0 <= 0) goto L_0x0104
                goto L_0x00f4
            L_0x0104:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0250a.resolveLayoutDirection(int):void");
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        m1272a((AttributeSet) null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1272a(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1272a(attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01d6, code lost:
        if (r11 != -1) goto L_0x01da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x024d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03a3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1270a() {
        /*
            r26 = this;
            r0 = r26
            boolean r1 = r26.isInEditMode()
            int r2 = r26.getChildCount()
            r3 = 0
            r4 = -1
            if (r1 == 0) goto L_0x0048
            r5 = 0
        L_0x000f:
            if (r5 >= r2) goto L_0x0048
            android.view.View r6 = r0.getChildAt(r5)
            android.content.res.Resources r7 = r26.getResources()     // Catch:{ NotFoundException -> 0x0045 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0045 }
            java.lang.String r7 = r7.getResourceName(r8)     // Catch:{ NotFoundException -> 0x0045 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0045 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NotFoundException -> 0x0045 }
            r0.mo1705a(r3, r7, r8)     // Catch:{ NotFoundException -> 0x0045 }
            r8 = 47
            int r8 = r7.indexOf(r8)     // Catch:{ NotFoundException -> 0x0045 }
            if (r8 == r4) goto L_0x003a
            int r8 = r8 + 1
            java.lang.String r7 = r7.substring(r8)     // Catch:{ NotFoundException -> 0x0045 }
        L_0x003a:
            int r6 = r6.getId()     // Catch:{ NotFoundException -> 0x0045 }
            b.e.a.j.f r6 = r0.mo7402b(r6)     // Catch:{ NotFoundException -> 0x0045 }
            r6.mo4340a((java.lang.String) r7)     // Catch:{ NotFoundException -> 0x0045 }
        L_0x0045:
            int r5 = r5 + 1
            goto L_0x000f
        L_0x0048:
            r5 = 0
        L_0x0049:
            if (r5 >= r2) goto L_0x005c
            android.view.View r6 = r0.getChildAt(r5)
            b.e.a.j.f r6 = r0.mo1703a((android.view.View) r6)
            if (r6 != 0) goto L_0x0056
            goto L_0x0059
        L_0x0056:
            r6.mo4324D()
        L_0x0059:
            int r5 = r5 + 1
            goto L_0x0049
        L_0x005c:
            int r5 = r0.f1189q
            if (r5 == r4) goto L_0x007e
            r5 = 0
        L_0x0061:
            if (r5 >= r2) goto L_0x007e
            android.view.View r6 = r0.getChildAt(r5)
            int r7 = r6.getId()
            int r8 = r0.f1189q
            if (r7 != r8) goto L_0x007b
            boolean r7 = r6 instanceof androidx.constraintlayout.widget.C0257d
            if (r7 == 0) goto L_0x007b
            androidx.constraintlayout.widget.d r6 = (androidx.constraintlayout.widget.C0257d) r6
            androidx.constraintlayout.widget.c r6 = r6.getConstraintSet()
            r0.f1188p = r6
        L_0x007b:
            int r5 = r5 + 1
            goto L_0x0061
        L_0x007e:
            androidx.constraintlayout.widget.c r5 = r0.f1188p
            if (r5 == 0) goto L_0x0085
            r5.mo1748a((androidx.constraintlayout.widget.ConstraintLayout) r0)
        L_0x0085:
            b.e.a.j.g r5 = r0.f1181i
            r5.mo4450L()
            java.util.ArrayList<androidx.constraintlayout.widget.b> r5 = r0.f1179g
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x00a3
            r6 = 0
        L_0x0093:
            if (r6 >= r5) goto L_0x00a3
            java.util.ArrayList<androidx.constraintlayout.widget.b> r7 = r0.f1179g
            java.lang.Object r7 = r7.get(r6)
            androidx.constraintlayout.widget.b r7 = (androidx.constraintlayout.widget.C0253b) r7
            r7.mo1741c(r0)
            int r6 = r6 + 1
            goto L_0x0093
        L_0x00a3:
            r5 = 0
        L_0x00a4:
            if (r5 >= r2) goto L_0x00b6
            android.view.View r6 = r0.getChildAt(r5)
            boolean r7 = r6 instanceof androidx.constraintlayout.widget.C0260f
            if (r7 == 0) goto L_0x00b3
            androidx.constraintlayout.widget.f r6 = (androidx.constraintlayout.widget.C0260f) r6
            r6.mo1764b(r0)
        L_0x00b3:
            int r5 = r5 + 1
            goto L_0x00a4
        L_0x00b6:
            r5 = 0
        L_0x00b7:
            if (r5 >= r2) goto L_0x03d4
            android.view.View r6 = r0.getChildAt(r5)
            b.e.a.j.f r13 = r0.mo1703a((android.view.View) r6)
            if (r13 != 0) goto L_0x00c5
            goto L_0x03d0
        L_0x00c5:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            r14 = r7
            androidx.constraintlayout.widget.ConstraintLayout$a r14 = (androidx.constraintlayout.widget.ConstraintLayout.C0250a) r14
            r14.mo1732a()
            boolean r7 = r14.f1243l0
            if (r7 == 0) goto L_0x00d6
            r14.f1243l0 = r3
            goto L_0x0108
        L_0x00d6:
            if (r1 == 0) goto L_0x0108
            android.content.res.Resources r7 = r26.getResources()     // Catch:{ NotFoundException -> 0x0107 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0107 }
            java.lang.String r7 = r7.getResourceName(r8)     // Catch:{ NotFoundException -> 0x0107 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0107 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NotFoundException -> 0x0107 }
            r0.mo1705a(r3, r7, r8)     // Catch:{ NotFoundException -> 0x0107 }
            java.lang.String r8 = "id/"
            int r8 = r7.indexOf(r8)     // Catch:{ NotFoundException -> 0x0107 }
            int r8 = r8 + 3
            java.lang.String r7 = r7.substring(r8)     // Catch:{ NotFoundException -> 0x0107 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0107 }
            b.e.a.j.f r8 = r0.mo7402b(r8)     // Catch:{ NotFoundException -> 0x0107 }
            r8.mo4340a((java.lang.String) r7)     // Catch:{ NotFoundException -> 0x0107 }
            goto L_0x0108
        L_0x0107:
        L_0x0108:
            int r7 = r6.getVisibility()
            r13.mo4381n(r7)
            boolean r7 = r14.f1219Z
            if (r7 == 0) goto L_0x0118
            r7 = 8
            r13.mo4381n(r7)
        L_0x0118:
            r13.mo4339a((java.lang.Object) r6)
            b.e.a.j.g r6 = r0.f1181i
            r6.mo4451b(r13)
            boolean r6 = r14.f1215V
            if (r6 == 0) goto L_0x0128
            boolean r6 = r14.f1214U
            if (r6 != 0) goto L_0x012d
        L_0x0128:
            java.util.ArrayList<b.e.a.j.f> r6 = r0.f1180h
            r6.add(r13)
        L_0x012d:
            boolean r6 = r14.f1217X
            r7 = 17
            if (r6 == 0) goto L_0x015e
            b.e.a.j.i r13 = (p006b.p022e.p023a.p024j.C0763i) r13
            int r6 = r14.f1235h0
            int r8 = r14.f1237i0
            float r9 = r14.f1239j0
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 >= r7) goto L_0x0145
            int r6 = r14.f1220a
            int r8 = r14.f1222b
            float r9 = r14.f1224c
        L_0x0145:
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0150
            r13.mo4422e(r9)
            goto L_0x03d0
        L_0x0150:
            if (r6 == r4) goto L_0x0157
            r13.mo4304t(r6)
            goto L_0x03d0
        L_0x0157:
            if (r8 == r4) goto L_0x03d0
            r13.mo4423u(r8)
            goto L_0x03d0
        L_0x015e:
            int r6 = r14.f1226d
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f1228e
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f1230f
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f1232g
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f1248q
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f1247p
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f1249r
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f1250s
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f1234h
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f1236i
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f1238j
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f1240k
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f1242l
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f1209P
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f1210Q
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f1244m
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.width
            if (r6 == r4) goto L_0x01a6
            int r6 = r14.height
            if (r6 != r4) goto L_0x03d0
        L_0x01a6:
            int r6 = r14.f1221a0
            int r8 = r14.f1223b0
            int r9 = r14.f1225c0
            int r10 = r14.f1227d0
            int r11 = r14.f1229e0
            int r12 = r14.f1231f0
            float r15 = r14.f1233g0
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 >= r7) goto L_0x01f7
            int r3 = r14.f1226d
            int r6 = r14.f1228e
            int r9 = r14.f1230f
            int r10 = r14.f1232g
            int r7 = r14.f1251t
            int r8 = r14.f1253v
            float r15 = r14.f1257z
            if (r3 != r4) goto L_0x01d9
            if (r6 != r4) goto L_0x01d9
            int r11 = r14.f1248q
            if (r11 == r4) goto L_0x01d4
            r25 = r11
            r11 = r6
            r6 = r25
            goto L_0x01db
        L_0x01d4:
            int r11 = r14.f1247p
            if (r11 == r4) goto L_0x01d9
            goto L_0x01da
        L_0x01d9:
            r11 = r6
        L_0x01da:
            r6 = r3
        L_0x01db:
            if (r9 != r4) goto L_0x01f2
            if (r10 != r4) goto L_0x01f2
            int r3 = r14.f1249r
            if (r3 == r4) goto L_0x01e7
            r12 = r7
            r16 = r8
            goto L_0x01fc
        L_0x01e7:
            int r3 = r14.f1250s
            if (r3 == r4) goto L_0x01f2
            r12 = r7
            r16 = r8
            r10 = r15
            r15 = r3
            r3 = r9
            goto L_0x0201
        L_0x01f2:
            r12 = r7
            r16 = r8
            r3 = r9
            goto L_0x01fc
        L_0x01f7:
            r3 = r9
            r16 = r12
            r12 = r11
            r11 = r8
        L_0x01fc:
            r25 = r15
            r15 = r10
            r10 = r25
        L_0x0201:
            int r7 = r14.f1244m
            if (r7 == r4) goto L_0x0214
            b.e.a.j.f r3 = r0.mo7402b(r7)
            if (r3 == 0) goto L_0x0323
            float r6 = r14.f1246o
            int r7 = r14.f1245n
            r13.mo4338a((p006b.p022e.p023a.p024j.C0758f) r3, (float) r6, (int) r7)
            goto L_0x0323
        L_0x0214:
            if (r6 == r4) goto L_0x0229
            b.e.a.j.f r9 = r0.mo7402b(r6)
            if (r9 == 0) goto L_0x0226
            b.e.a.j.e$d r6 = p006b.p022e.p023a.p024j.C0753e.C0757d.LEFT
            int r11 = r14.leftMargin
            r7 = r13
            r8 = r6
            r17 = r10
            r10 = r6
            goto L_0x023a
        L_0x0226:
            r17 = r10
            goto L_0x023d
        L_0x0229:
            r17 = r10
            if (r11 == r4) goto L_0x023d
            b.e.a.j.f r9 = r0.mo7402b(r11)
            if (r9 == 0) goto L_0x023d
            b.e.a.j.e$d r8 = p006b.p022e.p023a.p024j.C0753e.C0757d.LEFT
            b.e.a.j.e$d r10 = p006b.p022e.p023a.p024j.C0753e.C0757d.RIGHT
            int r11 = r14.leftMargin
            r7 = r13
        L_0x023a:
            r7.mo4335a(r8, r9, r10, r11, r12)
        L_0x023d:
            if (r3 == r4) goto L_0x024d
            b.e.a.j.f r9 = r0.mo7402b(r3)
            if (r9 == 0) goto L_0x0260
            b.e.a.j.e$d r8 = p006b.p022e.p023a.p024j.C0753e.C0757d.RIGHT
            b.e.a.j.e$d r10 = p006b.p022e.p023a.p024j.C0753e.C0757d.LEFT
            int r11 = r14.rightMargin
            r7 = r13
            goto L_0x025b
        L_0x024d:
            if (r15 == r4) goto L_0x0260
            b.e.a.j.f r9 = r0.mo7402b(r15)
            if (r9 == 0) goto L_0x0260
            b.e.a.j.e$d r10 = p006b.p022e.p023a.p024j.C0753e.C0757d.RIGHT
            int r11 = r14.rightMargin
            r7 = r13
            r8 = r10
        L_0x025b:
            r12 = r16
            r7.mo4335a(r8, r9, r10, r11, r12)
        L_0x0260:
            int r3 = r14.f1234h
            if (r3 == r4) goto L_0x0273
            b.e.a.j.f r9 = r0.mo7402b(r3)
            if (r9 == 0) goto L_0x0289
            b.e.a.j.e$d r10 = p006b.p022e.p023a.p024j.C0753e.C0757d.TOP
            int r11 = r14.topMargin
            int r12 = r14.f1252u
            r7 = r13
            r8 = r10
            goto L_0x0286
        L_0x0273:
            int r3 = r14.f1236i
            if (r3 == r4) goto L_0x0289
            b.e.a.j.f r9 = r0.mo7402b(r3)
            if (r9 == 0) goto L_0x0289
            b.e.a.j.e$d r8 = p006b.p022e.p023a.p024j.C0753e.C0757d.TOP
            b.e.a.j.e$d r10 = p006b.p022e.p023a.p024j.C0753e.C0757d.BOTTOM
            int r11 = r14.topMargin
            int r12 = r14.f1252u
            r7 = r13
        L_0x0286:
            r7.mo4335a(r8, r9, r10, r11, r12)
        L_0x0289:
            int r3 = r14.f1238j
            if (r3 == r4) goto L_0x029d
            b.e.a.j.f r9 = r0.mo7402b(r3)
            if (r9 == 0) goto L_0x02b2
            b.e.a.j.e$d r8 = p006b.p022e.p023a.p024j.C0753e.C0757d.BOTTOM
            b.e.a.j.e$d r10 = p006b.p022e.p023a.p024j.C0753e.C0757d.TOP
            int r11 = r14.bottomMargin
            int r12 = r14.f1254w
            r7 = r13
            goto L_0x02af
        L_0x029d:
            int r3 = r14.f1240k
            if (r3 == r4) goto L_0x02b2
            b.e.a.j.f r9 = r0.mo7402b(r3)
            if (r9 == 0) goto L_0x02b2
            b.e.a.j.e$d r10 = p006b.p022e.p023a.p024j.C0753e.C0757d.BOTTOM
            int r11 = r14.bottomMargin
            int r12 = r14.f1254w
            r7 = r13
            r8 = r10
        L_0x02af:
            r7.mo4335a(r8, r9, r10, r11, r12)
        L_0x02b2:
            int r3 = r14.f1242l
            if (r3 == r4) goto L_0x0306
            android.util.SparseArray<android.view.View> r6 = r0.f1178f
            java.lang.Object r3 = r6.get(r3)
            android.view.View r3 = (android.view.View) r3
            int r6 = r14.f1242l
            b.e.a.j.f r6 = r0.mo7402b(r6)
            if (r6 == 0) goto L_0x0306
            if (r3 == 0) goto L_0x0306
            android.view.ViewGroup$LayoutParams r7 = r3.getLayoutParams()
            boolean r7 = r7 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0250a
            if (r7 == 0) goto L_0x0306
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r3 = (androidx.constraintlayout.widget.ConstraintLayout.C0250a) r3
            r7 = 1
            r14.f1216W = r7
            r3.f1216W = r7
            b.e.a.j.e$d r3 = p006b.p022e.p023a.p024j.C0753e.C0757d.BASELINE
            b.e.a.j.e r18 = r13.mo4328a((p006b.p022e.p023a.p024j.C0753e.C0757d) r3)
            b.e.a.j.e$d r3 = p006b.p022e.p023a.p024j.C0753e.C0757d.BASELINE
            b.e.a.j.e r19 = r6.mo4328a((p006b.p022e.p023a.p024j.C0753e.C0757d) r3)
            r20 = 0
            r21 = -1
            b.e.a.j.e$c r22 = p006b.p022e.p023a.p024j.C0753e.C0756c.STRONG
            r23 = 0
            r24 = 1
            r18.mo4309a(r19, r20, r21, r22, r23, r24)
            b.e.a.j.e$d r3 = p006b.p022e.p023a.p024j.C0753e.C0757d.TOP
            b.e.a.j.e r3 = r13.mo4328a((p006b.p022e.p023a.p024j.C0753e.C0757d) r3)
            r3.mo4319j()
            b.e.a.j.e$d r3 = p006b.p022e.p023a.p024j.C0753e.C0757d.BOTTOM
            b.e.a.j.e r3 = r13.mo4328a((p006b.p022e.p023a.p024j.C0753e.C0757d) r3)
            r3.mo4319j()
        L_0x0306:
            r3 = 1056964608(0x3f000000, float:0.5)
            r6 = 0
            r15 = r17
            int r7 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r7 < 0) goto L_0x0316
            int r7 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0316
            r13.mo4329a((float) r15)
        L_0x0316:
            float r7 = r14.f1194A
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0323
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0323
            r13.mo4354c((float) r7)
        L_0x0323:
            if (r1 == 0) goto L_0x0334
            int r3 = r14.f1209P
            if (r3 != r4) goto L_0x032d
            int r3 = r14.f1210Q
            if (r3 == r4) goto L_0x0334
        L_0x032d:
            int r3 = r14.f1209P
            int r6 = r14.f1210Q
            r13.mo4355c(r3, r6)
        L_0x0334:
            boolean r3 = r14.f1214U
            if (r3 != 0) goto L_0x035d
            int r3 = r14.width
            if (r3 != r4) goto L_0x0356
            b.e.a.j.f$b r3 = p006b.p022e.p023a.p024j.C0758f.C0760b.MATCH_PARENT
            r13.mo4336a((p006b.p022e.p023a.p024j.C0758f.C0760b) r3)
            b.e.a.j.e$d r3 = p006b.p022e.p023a.p024j.C0753e.C0757d.LEFT
            b.e.a.j.e r3 = r13.mo4328a((p006b.p022e.p023a.p024j.C0753e.C0757d) r3)
            int r6 = r14.leftMargin
            r3.f2974e = r6
            b.e.a.j.e$d r3 = p006b.p022e.p023a.p024j.C0753e.C0757d.RIGHT
            b.e.a.j.e r3 = r13.mo4328a((p006b.p022e.p023a.p024j.C0753e.C0757d) r3)
            int r6 = r14.rightMargin
            r3.f2974e = r6
            goto L_0x0367
        L_0x0356:
            b.e.a.j.f$b r3 = p006b.p022e.p023a.p024j.C0758f.C0760b.MATCH_CONSTRAINT
            r13.mo4336a((p006b.p022e.p023a.p024j.C0758f.C0760b) r3)
            r3 = 0
            goto L_0x0364
        L_0x035d:
            b.e.a.j.f$b r3 = p006b.p022e.p023a.p024j.C0758f.C0760b.FIXED
            r13.mo4336a((p006b.p022e.p023a.p024j.C0758f.C0760b) r3)
            int r3 = r14.width
        L_0x0364:
            r13.mo4383o(r3)
        L_0x0367:
            boolean r3 = r14.f1215V
            if (r3 != 0) goto L_0x0394
            int r3 = r14.height
            if (r3 != r4) goto L_0x038a
            b.e.a.j.f$b r3 = p006b.p022e.p023a.p024j.C0758f.C0760b.MATCH_PARENT
            r13.mo4349b((p006b.p022e.p023a.p024j.C0758f.C0760b) r3)
            b.e.a.j.e$d r3 = p006b.p022e.p023a.p024j.C0753e.C0757d.TOP
            b.e.a.j.e r3 = r13.mo4328a((p006b.p022e.p023a.p024j.C0753e.C0757d) r3)
            int r6 = r14.topMargin
            r3.f2974e = r6
            b.e.a.j.e$d r3 = p006b.p022e.p023a.p024j.C0753e.C0757d.BOTTOM
            b.e.a.j.e r3 = r13.mo4328a((p006b.p022e.p023a.p024j.C0753e.C0757d) r3)
            int r6 = r14.bottomMargin
            r3.f2974e = r6
            r3 = 0
            goto L_0x039f
        L_0x038a:
            b.e.a.j.f$b r3 = p006b.p022e.p023a.p024j.C0758f.C0760b.MATCH_CONSTRAINT
            r13.mo4349b((p006b.p022e.p023a.p024j.C0758f.C0760b) r3)
            r3 = 0
            r13.mo4367g(r3)
            goto L_0x039f
        L_0x0394:
            r3 = 0
            b.e.a.j.f$b r6 = p006b.p022e.p023a.p024j.C0758f.C0760b.FIXED
            r13.mo4349b((p006b.p022e.p023a.p024j.C0758f.C0760b) r6)
            int r6 = r14.height
            r13.mo4367g(r6)
        L_0x039f:
            java.lang.String r6 = r14.f1195B
            if (r6 == 0) goto L_0x03a6
            r13.mo4350b((java.lang.String) r6)
        L_0x03a6:
            float r6 = r14.f1197D
            r13.mo4345b((float) r6)
            float r6 = r14.f1198E
            r13.mo4359d((float) r6)
            int r6 = r14.f1199F
            r13.mo4369h(r6)
            int r6 = r14.f1200G
            r13.mo4379m(r6)
            int r6 = r14.f1201H
            int r7 = r14.f1203J
            int r8 = r14.f1205L
            float r9 = r14.f1207N
            r13.mo4332a((int) r6, (int) r7, (int) r8, (float) r9)
            int r6 = r14.f1202I
            int r7 = r14.f1204K
            int r8 = r14.f1206M
            float r9 = r14.f1208O
            r13.mo4347b(r6, r7, r8, r9)
        L_0x03d0:
            int r5 = r5 + 1
            goto L_0x00b7
        L_0x03d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m1270a():void");
    }

    /* renamed from: a */
    private void m1271a(int i, int i2) {
        boolean z;
        boolean z2;
        int baseline;
        int i3;
        int i4;
        int i5 = i;
        int i6 = i2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0250a aVar = (C0250a) childAt.getLayoutParams();
                C0758f fVar = aVar.f1241k0;
                if (!aVar.f1217X && !aVar.f1218Y) {
                    fVar.mo4381n(childAt.getVisibility());
                    int i8 = aVar.width;
                    int i9 = aVar.height;
                    boolean z3 = aVar.f1214U;
                    if (z3 || aVar.f1215V || (!z3 && aVar.f1201H == 1) || aVar.width == -1 || (!aVar.f1215V && (aVar.f1202I == 1 || aVar.height == -1))) {
                        if (i8 == 0) {
                            i3 = ViewGroup.getChildMeasureSpec(i5, paddingLeft, -2);
                            z2 = true;
                        } else if (i8 == -1) {
                            i3 = ViewGroup.getChildMeasureSpec(i5, paddingLeft, -1);
                            z2 = false;
                        } else {
                            z2 = i8 == -2;
                            i3 = ViewGroup.getChildMeasureSpec(i5, paddingLeft, i8);
                        }
                        if (i9 == 0) {
                            i4 = ViewGroup.getChildMeasureSpec(i6, paddingTop, -2);
                            z = true;
                        } else if (i9 == -1) {
                            i4 = ViewGroup.getChildMeasureSpec(i6, paddingTop, -1);
                            z = false;
                        } else {
                            z = i9 == -2;
                            i4 = ViewGroup.getChildMeasureSpec(i6, paddingTop, i9);
                        }
                        childAt.measure(i3, i4);
                        C0744f fVar2 = this.f1193u;
                        if (fVar2 != null) {
                            fVar2.f2905a++;
                        }
                        fVar.mo4351b(i8 == -2);
                        fVar.mo4341a(i9 == -2);
                        i8 = childAt.getMeasuredWidth();
                        i9 = childAt.getMeasuredHeight();
                    } else {
                        z2 = false;
                        z = false;
                    }
                    fVar.mo4383o(i8);
                    fVar.mo4367g(i9);
                    if (z2) {
                        fVar.mo4387q(i8);
                    }
                    if (z) {
                        fVar.mo4385p(i9);
                    }
                    if (aVar.f1216W && (baseline = childAt.getBaseline()) != -1) {
                        fVar.mo4365f(baseline);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m1272a(AttributeSet attributeSet) {
        this.f1181i.mo4339a((Object) this);
        this.f1178f.put(getId(), this);
        this.f1188p = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0262h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0262h.ConstraintLayout_Layout_android_minWidth) {
                    this.f1182j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1182j);
                } else if (index == C0262h.ConstraintLayout_Layout_android_minHeight) {
                    this.f1183k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1183k);
                } else if (index == C0262h.ConstraintLayout_Layout_android_maxWidth) {
                    this.f1184l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1184l);
                } else if (index == C0262h.ConstraintLayout_Layout_android_maxHeight) {
                    this.f1185m = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1185m);
                } else if (index == C0262h.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f1187o = obtainStyledAttributes.getInt(index, this.f1187o);
                } else if (index == C0262h.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        this.f1188p = new C0254c();
                        this.f1188p.mo1747a(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.f1188p = null;
                    }
                    this.f1189q = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1181i.mo4415u(this.f1187o);
    }

    /* renamed from: b */
    private final C0758f mo7402b(int i) {
        if (i == 0) {
            return this.f1181i;
        }
        View view = this.f1178f.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f1181i;
        }
        if (view == null) {
            return null;
        }
        return ((C0250a) view.getLayoutParams()).f1241k0;
    }

    /* renamed from: b */
    private void m1274b() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            this.f1180h.clear();
            m1270a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02c2  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1275b(int r24, int r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r23.getPaddingTop()
            int r4 = r23.getPaddingBottom()
            int r3 = r3 + r4
            int r4 = r23.getPaddingLeft()
            int r5 = r23.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r23.getChildCount()
            r7 = 0
        L_0x001d:
            r8 = 1
            r10 = 8
            r12 = -2
            if (r7 >= r5) goto L_0x00dc
            android.view.View r14 = r0.getChildAt(r7)
            int r15 = r14.getVisibility()
            if (r15 != r10) goto L_0x0030
            goto L_0x00d4
        L_0x0030:
            android.view.ViewGroup$LayoutParams r10 = r14.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r10 = (androidx.constraintlayout.widget.ConstraintLayout.C0250a) r10
            b.e.a.j.f r15 = r10.f1241k0
            boolean r6 = r10.f1217X
            if (r6 != 0) goto L_0x00d4
            boolean r6 = r10.f1218Y
            if (r6 == 0) goto L_0x0042
            goto L_0x00d4
        L_0x0042:
            int r6 = r14.getVisibility()
            r15.mo4381n(r6)
            int r6 = r10.width
            int r13 = r10.height
            if (r6 == 0) goto L_0x00c4
            if (r13 != 0) goto L_0x0053
            goto L_0x00c4
        L_0x0053:
            if (r6 != r12) goto L_0x0058
            r16 = 1
            goto L_0x005a
        L_0x0058:
            r16 = 0
        L_0x005a:
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r6)
            if (r13 != r12) goto L_0x0063
            r17 = 1
            goto L_0x0065
        L_0x0063:
            r17 = 0
        L_0x0065:
            int r12 = android.view.ViewGroup.getChildMeasureSpec(r2, r3, r13)
            r14.measure(r11, r12)
            b.e.a.f r11 = r0.f1193u
            r12 = r3
            if (r11 == 0) goto L_0x0076
            long r2 = r11.f2905a
            long r2 = r2 + r8
            r11.f2905a = r2
        L_0x0076:
            r2 = -2
            if (r6 != r2) goto L_0x007b
            r3 = 1
            goto L_0x007c
        L_0x007b:
            r3 = 0
        L_0x007c:
            r15.mo4351b((boolean) r3)
            if (r13 != r2) goto L_0x0083
            r2 = 1
            goto L_0x0084
        L_0x0083:
            r2 = 0
        L_0x0084:
            r15.mo4341a((boolean) r2)
            int r2 = r14.getMeasuredWidth()
            int r3 = r14.getMeasuredHeight()
            r15.mo4383o(r2)
            r15.mo4367g(r3)
            if (r16 == 0) goto L_0x009a
            r15.mo4387q(r2)
        L_0x009a:
            if (r17 == 0) goto L_0x009f
            r15.mo4385p(r3)
        L_0x009f:
            boolean r6 = r10.f1216W
            if (r6 == 0) goto L_0x00ad
            int r6 = r14.getBaseline()
            r8 = -1
            if (r6 == r8) goto L_0x00ad
            r15.mo4365f(r6)
        L_0x00ad:
            boolean r6 = r10.f1214U
            if (r6 == 0) goto L_0x00d5
            boolean r6 = r10.f1215V
            if (r6 == 0) goto L_0x00d5
            b.e.a.j.n r6 = r15.mo4378m()
            r6.mo4440a(r2)
            b.e.a.j.n r2 = r15.mo4376l()
            r2.mo4440a(r3)
            goto L_0x00d5
        L_0x00c4:
            r12 = r3
            b.e.a.j.n r2 = r15.mo4378m()
            r2.mo4444b()
            b.e.a.j.n r2 = r15.mo4376l()
            r2.mo4444b()
            goto L_0x00d5
        L_0x00d4:
            r12 = r3
        L_0x00d5:
            int r7 = r7 + 1
            r2 = r25
            r3 = r12
            goto L_0x001d
        L_0x00dc:
            r12 = r3
            b.e.a.j.g r2 = r0.f1181i
            r2.mo4409U()
            r2 = 0
        L_0x00e3:
            if (r2 >= r5) goto L_0x02d8
            android.view.View r3 = r0.getChildAt(r2)
            int r6 = r3.getVisibility()
            if (r6 != r10) goto L_0x00f1
            goto L_0x02c4
        L_0x00f1:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r6 = (androidx.constraintlayout.widget.ConstraintLayout.C0250a) r6
            b.e.a.j.f r7 = r6.f1241k0
            boolean r11 = r6.f1217X
            if (r11 != 0) goto L_0x02c4
            boolean r11 = r6.f1218Y
            if (r11 == 0) goto L_0x0103
            goto L_0x02c4
        L_0x0103:
            int r11 = r3.getVisibility()
            r7.mo4381n(r11)
            int r11 = r6.width
            int r13 = r6.height
            if (r11 == 0) goto L_0x0114
            if (r13 == 0) goto L_0x0114
            goto L_0x02c4
        L_0x0114:
            b.e.a.j.e$d r14 = p006b.p022e.p023a.p024j.C0753e.C0757d.LEFT
            b.e.a.j.e r14 = r7.mo4328a((p006b.p022e.p023a.p024j.C0753e.C0757d) r14)
            b.e.a.j.m r14 = r14.mo4313d()
            b.e.a.j.e$d r15 = p006b.p022e.p023a.p024j.C0753e.C0757d.RIGHT
            b.e.a.j.e r15 = r7.mo4328a((p006b.p022e.p023a.p024j.C0753e.C0757d) r15)
            b.e.a.j.m r15 = r15.mo4313d()
            b.e.a.j.e$d r10 = p006b.p022e.p023a.p024j.C0753e.C0757d.LEFT
            b.e.a.j.e r10 = r7.mo4328a((p006b.p022e.p023a.p024j.C0753e.C0757d) r10)
            b.e.a.j.e r10 = r10.mo4316g()
            if (r10 == 0) goto L_0x0142
            b.e.a.j.e$d r10 = p006b.p022e.p023a.p024j.C0753e.C0757d.RIGHT
            b.e.a.j.e r10 = r7.mo4328a((p006b.p022e.p023a.p024j.C0753e.C0757d) r10)
            b.e.a.j.e r10 = r10.mo4316g()
            if (r10 == 0) goto L_0x0142
            r10 = 1
            goto L_0x0143
        L_0x0142:
            r10 = 0
        L_0x0143:
            b.e.a.j.e$d r8 = p006b.p022e.p023a.p024j.C0753e.C0757d.TOP
            b.e.a.j.e r8 = r7.mo4328a((p006b.p022e.p023a.p024j.C0753e.C0757d) r8)
            b.e.a.j.m r8 = r8.mo4313d()
            b.e.a.j.e$d r9 = p006b.p022e.p023a.p024j.C0753e.C0757d.BOTTOM
            b.e.a.j.e r9 = r7.mo4328a((p006b.p022e.p023a.p024j.C0753e.C0757d) r9)
            b.e.a.j.m r9 = r9.mo4313d()
            r17 = r5
            b.e.a.j.e$d r5 = p006b.p022e.p023a.p024j.C0753e.C0757d.TOP
            b.e.a.j.e r5 = r7.mo4328a((p006b.p022e.p023a.p024j.C0753e.C0757d) r5)
            b.e.a.j.e r5 = r5.mo4316g()
            if (r5 == 0) goto L_0x0173
            b.e.a.j.e$d r5 = p006b.p022e.p023a.p024j.C0753e.C0757d.BOTTOM
            b.e.a.j.e r5 = r7.mo4328a((p006b.p022e.p023a.p024j.C0753e.C0757d) r5)
            b.e.a.j.e r5 = r5.mo4316g()
            if (r5 == 0) goto L_0x0173
            r5 = 1
            goto L_0x0174
        L_0x0173:
            r5 = 0
        L_0x0174:
            if (r11 != 0) goto L_0x0186
            if (r13 != 0) goto L_0x0186
            if (r10 == 0) goto L_0x0186
            if (r5 == 0) goto L_0x0186
            r5 = r25
            r20 = r2
            r3 = -1
            r10 = -2
            r18 = 1
            goto L_0x02ce
        L_0x0186:
            r20 = r2
            b.e.a.j.g r2 = r0.f1181i
            b.e.a.j.f$b r2 = r2.mo4372j()
            r21 = r6
            b.e.a.j.f$b r6 = p006b.p022e.p023a.p024j.C0758f.C0760b.WRAP_CONTENT
            if (r2 == r6) goto L_0x0196
            r6 = 1
            goto L_0x0197
        L_0x0196:
            r6 = 0
        L_0x0197:
            b.e.a.j.g r2 = r0.f1181i
            b.e.a.j.f$b r2 = r2.mo4386q()
            b.e.a.j.f$b r0 = p006b.p022e.p023a.p024j.C0758f.C0760b.WRAP_CONTENT
            if (r2 == r0) goto L_0x01a3
            r0 = 1
            goto L_0x01a4
        L_0x01a3:
            r0 = 0
        L_0x01a4:
            if (r6 != 0) goto L_0x01ad
            b.e.a.j.n r2 = r7.mo4378m()
            r2.mo4444b()
        L_0x01ad:
            if (r0 != 0) goto L_0x01b6
            b.e.a.j.n r2 = r7.mo4376l()
            r2.mo4444b()
        L_0x01b6:
            if (r11 != 0) goto L_0x01ee
            if (r6 == 0) goto L_0x01e5
            boolean r2 = r7.mo4323C()
            if (r2 == 0) goto L_0x01e5
            if (r10 == 0) goto L_0x01e5
            boolean r2 = r14.mo4445c()
            if (r2 == 0) goto L_0x01e5
            boolean r2 = r15.mo4445c()
            if (r2 == 0) goto L_0x01e5
            float r2 = r15.mo4437f()
            float r10 = r14.mo4437f()
            float r2 = r2 - r10
            int r11 = (int) r2
            b.e.a.j.n r2 = r7.mo4378m()
            r2.mo4440a(r11)
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r11)
            r14 = r2
            goto L_0x01f6
        L_0x01e5:
            r2 = -2
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r2)
            r14 = r6
            r2 = 1
            r6 = 0
            goto L_0x0202
        L_0x01ee:
            r2 = -2
            r10 = -1
            if (r11 != r10) goto L_0x01f8
            int r14 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r10)
        L_0x01f6:
            r2 = 0
            goto L_0x0202
        L_0x01f8:
            if (r11 != r2) goto L_0x01fc
            r2 = 1
            goto L_0x01fd
        L_0x01fc:
            r2 = 0
        L_0x01fd:
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r11)
            r14 = r10
        L_0x0202:
            if (r13 != 0) goto L_0x023e
            if (r0 == 0) goto L_0x0234
            boolean r10 = r7.mo4322B()
            if (r10 == 0) goto L_0x0234
            if (r5 == 0) goto L_0x0234
            boolean r5 = r8.mo4445c()
            if (r5 == 0) goto L_0x0234
            boolean r5 = r9.mo4445c()
            if (r5 == 0) goto L_0x0234
            float r5 = r9.mo4437f()
            float r8 = r8.mo4437f()
            float r5 = r5 - r8
            int r13 = (int) r5
            b.e.a.j.n r5 = r7.mo4376l()
            r5.mo4440a(r13)
            r5 = r25
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r13)
            r9 = r0
            r0 = r8
            goto L_0x024a
        L_0x0234:
            r5 = r25
            r8 = -2
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r8)
            r8 = 1
            r9 = 0
            goto L_0x025a
        L_0x023e:
            r5 = r25
            r8 = -2
            r9 = -1
            if (r13 != r9) goto L_0x024c
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r9)
            r9 = r0
            r0 = r10
        L_0x024a:
            r8 = 0
            goto L_0x025a
        L_0x024c:
            if (r13 != r8) goto L_0x0250
            r8 = 1
            goto L_0x0251
        L_0x0250:
            r8 = 0
        L_0x0251:
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r13)
            r22 = r9
            r9 = r0
            r0 = r22
        L_0x025a:
            r3.measure(r14, r0)
            r0 = r23
            b.e.a.f r10 = r0.f1193u
            if (r10 == 0) goto L_0x026c
            long r14 = r10.f2905a
            r18 = 1
            long r14 = r14 + r18
            r10.f2905a = r14
            goto L_0x026e
        L_0x026c:
            r18 = 1
        L_0x026e:
            r10 = -2
            if (r11 != r10) goto L_0x0273
            r11 = 1
            goto L_0x0274
        L_0x0273:
            r11 = 0
        L_0x0274:
            r7.mo4351b((boolean) r11)
            if (r13 != r10) goto L_0x027b
            r11 = 1
            goto L_0x027c
        L_0x027b:
            r11 = 0
        L_0x027c:
            r7.mo4341a((boolean) r11)
            int r11 = r3.getMeasuredWidth()
            int r13 = r3.getMeasuredHeight()
            r7.mo4383o(r11)
            r7.mo4367g(r13)
            if (r2 == 0) goto L_0x0292
            r7.mo4387q(r11)
        L_0x0292:
            if (r8 == 0) goto L_0x0297
            r7.mo4385p(r13)
        L_0x0297:
            b.e.a.j.n r2 = r7.mo4378m()
            if (r6 == 0) goto L_0x02a1
            r2.mo4440a(r11)
            goto L_0x02a4
        L_0x02a1:
            r2.mo4441f()
        L_0x02a4:
            b.e.a.j.n r2 = r7.mo4376l()
            if (r9 == 0) goto L_0x02ae
            r2.mo4440a(r13)
            goto L_0x02b1
        L_0x02ae:
            r2.mo4441f()
        L_0x02b1:
            r6 = r21
            boolean r2 = r6.f1216W
            if (r2 == 0) goto L_0x02c2
            int r2 = r3.getBaseline()
            r3 = -1
            if (r2 == r3) goto L_0x02ce
            r7.mo4365f(r2)
            goto L_0x02ce
        L_0x02c2:
            r3 = -1
            goto L_0x02ce
        L_0x02c4:
            r20 = r2
            r17 = r5
            r18 = r8
            r3 = -1
            r10 = -2
            r5 = r25
        L_0x02ce:
            int r2 = r20 + 1
            r5 = r17
            r8 = r18
            r10 = 8
            goto L_0x00e3
        L_0x02d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m1275b(int, int):void");
    }

    /* renamed from: c */
    private void m1276c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C0260f) {
                ((C0260f) childAt).mo1763a(this);
            }
        }
        int size = this.f1179g.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.f1179g.get(i2).mo1740b(this);
            }
        }
    }

    /* renamed from: c */
    private void m1277c(int i, int i2) {
        C0758f.C0760b bVar;
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        C0758f.C0760b bVar2 = C0758f.C0760b.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                bVar = C0758f.C0760b.WRAP_CONTENT;
            } else if (mode != 1073741824) {
                bVar = bVar2;
            } else {
                i3 = Math.min(this.f1184l, size) - paddingLeft;
                bVar = bVar2;
            }
            i3 = 0;
        } else {
            i3 = size;
            bVar = C0758f.C0760b.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                bVar2 = C0758f.C0760b.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                size2 = Math.min(this.f1185m, size2) - paddingTop;
            }
            size2 = 0;
        } else {
            bVar2 = C0758f.C0760b.WRAP_CONTENT;
        }
        this.f1181i.mo4377l(0);
        this.f1181i.mo4375k(0);
        this.f1181i.mo4336a(bVar);
        this.f1181i.mo4383o(i3);
        this.f1181i.mo4349b(bVar2);
        this.f1181i.mo4367g(size2);
        this.f1181i.mo4377l((this.f1182j - getPaddingLeft()) - getPaddingRight());
        this.f1181i.mo4375k((this.f1183k - getPaddingTop()) - getPaddingBottom());
    }

    /* renamed from: a */
    public View mo1702a(int i) {
        return this.f1178f.get(i);
    }

    /* renamed from: a */
    public final C0758f mo1703a(View view) {
        if (view == this) {
            return this.f1181i;
        }
        if (view == null) {
            return null;
        }
        return ((C0250a) view.getLayoutParams()).f1241k0;
    }

    /* renamed from: a */
    public Object mo1704a(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f1190r;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f1190r.get(str);
    }

    /* renamed from: a */
    public void mo1705a(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1190r == null) {
                this.f1190r = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1190r.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1706a(String str) {
        this.f1181i.mo4400K();
        C0744f fVar = this.f1193u;
        if (fVar != null) {
            fVar.f2907c++;
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0250a;
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i2 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i3 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i2;
                        float f2 = (float) (i2 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f3 = (float) i3;
                        float f4 = f;
                        float f5 = f;
                        float f6 = f3;
                        Paint paint2 = paint;
                        float f7 = f2;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f4, f6, f7, f3, paint3);
                        float parseInt4 = (float) (i3 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f2;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f6, f7, f9, paint3);
                        float f10 = parseInt4;
                        float f11 = f5;
                        canvas2.drawLine(f8, f10, f11, f9, paint3);
                        float f12 = f5;
                        canvas2.drawLine(f12, f10, f11, f3, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f13 = f2;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f12, f3, f13, parseInt4, paint6);
                        canvas2.drawLine(f12, parseInt4, f13, f3, paint6);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public C0250a generateDefaultLayoutParams() {
        return new C0250a(-2, -2);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0250a(layoutParams);
    }

    public C0250a generateLayoutParams(AttributeSet attributeSet) {
        return new C0250a(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f1185m;
    }

    public int getMaxWidth() {
        return this.f1184l;
    }

    public int getMinHeight() {
        return this.f1183k;
    }

    public int getMinWidth() {
        return this.f1182j;
    }

    public int getOptimizationLevel() {
        return this.f1181i.mo4401M();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0250a aVar = (C0250a) childAt.getLayoutParams();
            C0758f fVar = aVar.f1241k0;
            if ((childAt.getVisibility() != 8 || aVar.f1217X || aVar.f1218Y || isInEditMode) && !aVar.f1219Z) {
                int g = fVar.mo4366g();
                int h = fVar.mo4368h();
                int s = fVar.mo4390s() + g;
                int i6 = fVar.mo4370i() + h;
                childAt.layout(g, h, s, i6);
                if ((childAt instanceof C0260f) && (content = ((C0260f) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(g, h, s, i6);
                }
            }
        }
        int size = this.f1179g.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.f1179g.get(i7).mo1739a(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            java.lang.System.currentTimeMillis()
            int r3 = android.view.View.MeasureSpec.getMode(r25)
            int r4 = android.view.View.MeasureSpec.getSize(r25)
            int r5 = android.view.View.MeasureSpec.getMode(r26)
            int r6 = android.view.View.MeasureSpec.getSize(r26)
            int r7 = r24.getPaddingLeft()
            int r8 = r24.getPaddingTop()
            b.e.a.j.g r9 = r0.f1181i
            r9.mo4389r(r7)
            b.e.a.j.g r9 = r0.f1181i
            r9.mo4391s(r8)
            b.e.a.j.g r9 = r0.f1181i
            int r10 = r0.f1184l
            r9.mo4373j(r10)
            b.e.a.j.g r9 = r0.f1181i
            int r10 = r0.f1185m
            r9.mo4371i(r10)
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 0
            r11 = 1
            r12 = 17
            if (r9 < r12) goto L_0x004f
            b.e.a.j.g r9 = r0.f1181i
            int r12 = r24.getLayoutDirection()
            if (r12 != r11) goto L_0x004b
            r12 = 1
            goto L_0x004c
        L_0x004b:
            r12 = 0
        L_0x004c:
            r9.mo4412c(r12)
        L_0x004f:
            r24.m1277c(r25, r26)
            b.e.a.j.g r9 = r0.f1181i
            int r9 = r9.mo4390s()
            b.e.a.j.g r12 = r0.f1181i
            int r12 = r12.mo4370i()
            boolean r13 = r0.f1186n
            if (r13 == 0) goto L_0x0069
            r0.f1186n = r10
            r24.m1274b()
            r13 = 1
            goto L_0x006a
        L_0x0069:
            r13 = 0
        L_0x006a:
            int r14 = r0.f1187o
            r15 = 8
            r14 = r14 & r15
            if (r14 != r15) goto L_0x0073
            r14 = 1
            goto L_0x0074
        L_0x0073:
            r14 = 0
        L_0x0074:
            if (r14 == 0) goto L_0x0084
            b.e.a.j.g r15 = r0.f1181i
            r15.mo4408T()
            b.e.a.j.g r15 = r0.f1181i
            r15.mo4414f(r9, r12)
            r24.m1275b(r25, r26)
            goto L_0x0087
        L_0x0084:
            r24.m1271a((int) r25, (int) r26)
        L_0x0087:
            r24.m1276c()
            int r15 = r24.getChildCount()
            if (r15 <= 0) goto L_0x0097
            if (r13 == 0) goto L_0x0097
            b.e.a.j.g r13 = r0.f1181i
            p006b.p022e.p023a.p024j.C0749a.m4151a((p006b.p022e.p023a.p024j.C0761g) r13)
        L_0x0097:
            b.e.a.j.g r13 = r0.f1181i
            boolean r15 = r13.f3084x0
            if (r15 == 0) goto L_0x00c9
            boolean r15 = r13.f3085y0
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 == 0) goto L_0x00b3
            if (r3 != r11) goto L_0x00b3
            int r15 = r13.f3066A0
            if (r15 >= r4) goto L_0x00ac
            r13.mo4383o(r15)
        L_0x00ac:
            b.e.a.j.g r13 = r0.f1181i
            b.e.a.j.f$b r15 = p006b.p022e.p023a.p024j.C0758f.C0760b.FIXED
            r13.mo4336a((p006b.p022e.p023a.p024j.C0758f.C0760b) r15)
        L_0x00b3:
            b.e.a.j.g r13 = r0.f1181i
            boolean r15 = r13.f3086z0
            if (r15 == 0) goto L_0x00c9
            if (r5 != r11) goto L_0x00c9
            int r11 = r13.f3067B0
            if (r11 >= r6) goto L_0x00c2
            r13.mo4367g(r11)
        L_0x00c2:
            b.e.a.j.g r11 = r0.f1181i
            b.e.a.j.f$b r13 = p006b.p022e.p023a.p024j.C0758f.C0760b.FIXED
            r11.mo4349b((p006b.p022e.p023a.p024j.C0758f.C0760b) r13)
        L_0x00c9:
            int r11 = r0.f1187o
            r13 = 32
            r11 = r11 & r13
            r15 = 1073741824(0x40000000, float:2.0)
            if (r11 != r13) goto L_0x011d
            b.e.a.j.g r11 = r0.f1181i
            int r11 = r11.mo4390s()
            b.e.a.j.g r13 = r0.f1181i
            int r13 = r13.mo4370i()
            int r10 = r0.f1191s
            if (r10 == r11) goto L_0x00ec
            if (r3 != r15) goto L_0x00ec
            b.e.a.j.g r3 = r0.f1181i
            java.util.List<b.e.a.j.h> r3 = r3.f3083w0
            r10 = 0
            p006b.p022e.p023a.p024j.C0749a.m4153a((java.util.List<p006b.p022e.p023a.p024j.C0762h>) r3, (int) r10, (int) r11)
        L_0x00ec:
            int r3 = r0.f1192t
            if (r3 == r13) goto L_0x00fa
            if (r5 != r15) goto L_0x00fa
            b.e.a.j.g r3 = r0.f1181i
            java.util.List<b.e.a.j.h> r3 = r3.f3083w0
            r5 = 1
            p006b.p022e.p023a.p024j.C0749a.m4153a((java.util.List<p006b.p022e.p023a.p024j.C0762h>) r3, (int) r5, (int) r13)
        L_0x00fa:
            b.e.a.j.g r3 = r0.f1181i
            boolean r5 = r3.f3085y0
            if (r5 == 0) goto L_0x010b
            int r5 = r3.f3066A0
            if (r5 <= r4) goto L_0x010b
            java.util.List<b.e.a.j.h> r3 = r3.f3083w0
            r10 = 0
            p006b.p022e.p023a.p024j.C0749a.m4153a((java.util.List<p006b.p022e.p023a.p024j.C0762h>) r3, (int) r10, (int) r4)
            goto L_0x010c
        L_0x010b:
            r10 = 0
        L_0x010c:
            b.e.a.j.g r3 = r0.f1181i
            boolean r4 = r3.f3086z0
            if (r4 == 0) goto L_0x011d
            int r4 = r3.f3067B0
            if (r4 <= r6) goto L_0x011d
            java.util.List<b.e.a.j.h> r3 = r3.f3083w0
            r4 = 1
            p006b.p022e.p023a.p024j.C0749a.m4153a((java.util.List<p006b.p022e.p023a.p024j.C0762h>) r3, (int) r4, (int) r6)
            goto L_0x011e
        L_0x011d:
            r4 = 1
        L_0x011e:
            int r3 = r24.getChildCount()
            if (r3 <= 0) goto L_0x0129
            java.lang.String r3 = "First pass"
            r0.mo1706a((java.lang.String) r3)
        L_0x0129:
            java.util.ArrayList<b.e.a.j.f> r3 = r0.f1180h
            int r3 = r3.size()
            int r5 = r24.getPaddingBottom()
            int r8 = r8 + r5
            int r5 = r24.getPaddingRight()
            int r7 = r7 + r5
            if (r3 <= 0) goto L_0x035b
            b.e.a.j.g r6 = r0.f1181i
            b.e.a.j.f$b r6 = r6.mo4372j()
            b.e.a.j.f$b r11 = p006b.p022e.p023a.p024j.C0758f.C0760b.WRAP_CONTENT
            if (r6 != r11) goto L_0x0147
            r6 = 1
            goto L_0x0148
        L_0x0147:
            r6 = 0
        L_0x0148:
            b.e.a.j.g r11 = r0.f1181i
            b.e.a.j.f$b r11 = r11.mo4386q()
            b.e.a.j.f$b r13 = p006b.p022e.p023a.p024j.C0758f.C0760b.WRAP_CONTENT
            if (r11 != r13) goto L_0x0154
            r11 = 1
            goto L_0x0155
        L_0x0154:
            r11 = 0
        L_0x0155:
            b.e.a.j.g r13 = r0.f1181i
            int r13 = r13.mo4390s()
            int r4 = r0.f1182j
            int r4 = java.lang.Math.max(r13, r4)
            b.e.a.j.g r13 = r0.f1181i
            int r13 = r13.mo4370i()
            int r10 = r0.f1183k
            int r10 = java.lang.Math.max(r13, r10)
            r13 = r4
            r5 = r10
            r4 = 0
            r10 = 0
            r17 = 0
        L_0x0173:
            r18 = 1
            if (r4 >= r3) goto L_0x02b4
            java.util.ArrayList<b.e.a.j.f> r15 = r0.f1180h
            java.lang.Object r15 = r15.get(r4)
            b.e.a.j.f r15 = (p006b.p022e.p023a.p024j.C0758f) r15
            java.lang.Object r20 = r15.mo4362e()
            r21 = r3
            r3 = r20
            android.view.View r3 = (android.view.View) r3
            if (r3 != 0) goto L_0x0193
            r20 = r9
            r23 = r10
            r22 = r12
            goto L_0x02a0
        L_0x0193:
            android.view.ViewGroup$LayoutParams r20 = r3.getLayoutParams()
            r22 = r12
            r12 = r20
            androidx.constraintlayout.widget.ConstraintLayout$a r12 = (androidx.constraintlayout.widget.ConstraintLayout.C0250a) r12
            r20 = r9
            boolean r9 = r12.f1218Y
            if (r9 != 0) goto L_0x029e
            boolean r9 = r12.f1217X
            if (r9 == 0) goto L_0x01a9
            goto L_0x029e
        L_0x01a9:
            int r9 = r3.getVisibility()
            r23 = r10
            r10 = 8
            if (r9 != r10) goto L_0x01b5
        L_0x01b3:
            goto L_0x02a0
        L_0x01b5:
            if (r14 == 0) goto L_0x01cc
            b.e.a.j.n r9 = r15.mo4378m()
            boolean r9 = r9.mo4445c()
            if (r9 == 0) goto L_0x01cc
            b.e.a.j.n r9 = r15.mo4376l()
            boolean r9 = r9.mo4445c()
            if (r9 == 0) goto L_0x01cc
            goto L_0x01b3
        L_0x01cc:
            int r9 = r12.width
            r10 = -2
            if (r9 != r10) goto L_0x01dc
            boolean r9 = r12.f1214U
            if (r9 == 0) goto L_0x01dc
            int r9 = r12.width
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r1, r7, r9)
            goto L_0x01e6
        L_0x01dc:
            int r9 = r15.mo4390s()
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
        L_0x01e6:
            int r10 = r12.height
            r1 = -2
            if (r10 != r1) goto L_0x01f6
            boolean r1 = r12.f1215V
            if (r1 == 0) goto L_0x01f6
            int r1 = r12.height
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r2, r8, r1)
            goto L_0x0200
        L_0x01f6:
            int r1 = r15.mo4370i()
            r10 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
        L_0x0200:
            r3.measure(r9, r1)
            b.e.a.f r1 = r0.f1193u
            if (r1 == 0) goto L_0x020d
            long r9 = r1.f2906b
            long r9 = r9 + r18
            r1.f2906b = r9
        L_0x020d:
            int r1 = r3.getMeasuredWidth()
            int r9 = r3.getMeasuredHeight()
            int r10 = r15.mo4390s()
            if (r1 == r10) goto L_0x0244
            r15.mo4383o(r1)
            if (r14 == 0) goto L_0x0227
            b.e.a.j.n r10 = r15.mo4378m()
            r10.mo4440a(r1)
        L_0x0227:
            if (r6 == 0) goto L_0x0242
            int r1 = r15.mo4380n()
            if (r1 <= r13) goto L_0x0242
            int r1 = r15.mo4380n()
            b.e.a.j.e$d r10 = p006b.p022e.p023a.p024j.C0753e.C0757d.RIGHT
            b.e.a.j.e r10 = r15.mo4328a((p006b.p022e.p023a.p024j.C0753e.C0757d) r10)
            int r10 = r10.mo4311b()
            int r1 = r1 + r10
            int r13 = java.lang.Math.max(r13, r1)
        L_0x0242:
            r23 = 1
        L_0x0244:
            int r1 = r15.mo4370i()
            if (r9 == r1) goto L_0x0274
            r15.mo4367g(r9)
            if (r14 == 0) goto L_0x0256
            b.e.a.j.n r1 = r15.mo4376l()
            r1.mo4440a(r9)
        L_0x0256:
            if (r11 == 0) goto L_0x0272
            int r1 = r15.mo4357d()
            if (r1 <= r5) goto L_0x0272
            int r1 = r15.mo4357d()
            b.e.a.j.e$d r9 = p006b.p022e.p023a.p024j.C0753e.C0757d.BOTTOM
            b.e.a.j.e r9 = r15.mo4328a((p006b.p022e.p023a.p024j.C0753e.C0757d) r9)
            int r9 = r9.mo4311b()
            int r1 = r1 + r9
            int r1 = java.lang.Math.max(r5, r1)
            r5 = r1
        L_0x0272:
            r23 = 1
        L_0x0274:
            boolean r1 = r12.f1216W
            if (r1 == 0) goto L_0x028a
            int r1 = r3.getBaseline()
            r9 = -1
            if (r1 == r9) goto L_0x028a
            int r9 = r15.mo4352c()
            if (r1 == r9) goto L_0x028a
            r15.mo4365f(r1)
            r23 = 1
        L_0x028a:
            int r1 = android.os.Build.VERSION.SDK_INT
            r9 = 11
            if (r1 < r9) goto L_0x029b
            int r1 = r3.getMeasuredState()
            r3 = r17
            int r17 = android.view.ViewGroup.combineMeasuredStates(r3, r1)
            goto L_0x02a4
        L_0x029b:
            r3 = r17
            goto L_0x02a4
        L_0x029e:
            r23 = r10
        L_0x02a0:
            r3 = r17
            r17 = r3
        L_0x02a4:
            r10 = r23
            int r4 = r4 + 1
            r1 = r25
            r9 = r20
            r3 = r21
            r12 = r22
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x0173
        L_0x02b4:
            r21 = r3
            r20 = r9
            r23 = r10
            r22 = r12
            r3 = r17
            if (r23 == 0) goto L_0x0303
            b.e.a.j.g r1 = r0.f1181i
            r4 = r20
            r1.mo4383o(r4)
            b.e.a.j.g r1 = r0.f1181i
            r4 = r22
            r1.mo4367g(r4)
            if (r14 == 0) goto L_0x02d5
            b.e.a.j.g r1 = r0.f1181i
            r1.mo4409U()
        L_0x02d5:
            java.lang.String r1 = "2nd pass"
            r0.mo1706a((java.lang.String) r1)
            b.e.a.j.g r1 = r0.f1181i
            int r1 = r1.mo4390s()
            if (r1 >= r13) goto L_0x02e9
            b.e.a.j.g r1 = r0.f1181i
            r1.mo4383o(r13)
            r11 = 1
            goto L_0x02ea
        L_0x02e9:
            r11 = 0
        L_0x02ea:
            b.e.a.j.g r1 = r0.f1181i
            int r1 = r1.mo4370i()
            if (r1 >= r5) goto L_0x02fa
            b.e.a.j.g r1 = r0.f1181i
            r1.mo4367g(r5)
            r16 = 1
            goto L_0x02fc
        L_0x02fa:
            r16 = r11
        L_0x02fc:
            if (r16 == 0) goto L_0x0303
            java.lang.String r1 = "3rd pass"
            r0.mo1706a((java.lang.String) r1)
        L_0x0303:
            r1 = r21
            r4 = 0
        L_0x0306:
            if (r4 >= r1) goto L_0x035c
            java.util.ArrayList<b.e.a.j.f> r5 = r0.f1180h
            java.lang.Object r5 = r5.get(r4)
            b.e.a.j.f r5 = (p006b.p022e.p023a.p024j.C0758f) r5
            java.lang.Object r6 = r5.mo4362e()
            android.view.View r6 = (android.view.View) r6
            if (r6 != 0) goto L_0x031d
        L_0x0318:
            r10 = 8
        L_0x031a:
            r11 = 1073741824(0x40000000, float:2.0)
            goto L_0x0358
        L_0x031d:
            int r9 = r6.getMeasuredWidth()
            int r10 = r5.mo4390s()
            if (r9 != r10) goto L_0x0331
            int r9 = r6.getMeasuredHeight()
            int r10 = r5.mo4370i()
            if (r9 == r10) goto L_0x0318
        L_0x0331:
            int r9 = r5.mo4388r()
            r10 = 8
            if (r9 == r10) goto L_0x031a
            int r9 = r5.mo4390s()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r5 = r5.mo4370i()
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
            r6.measure(r9, r5)
            b.e.a.f r5 = r0.f1193u
            if (r5 == 0) goto L_0x0358
            long r12 = r5.f2906b
            long r12 = r12 + r18
            r5.f2906b = r12
        L_0x0358:
            int r4 = r4 + 1
            goto L_0x0306
        L_0x035b:
            r3 = 0
        L_0x035c:
            b.e.a.j.g r1 = r0.f1181i
            int r1 = r1.mo4390s()
            int r1 = r1 + r7
            b.e.a.j.g r4 = r0.f1181i
            int r4 = r4.mo4370i()
            int r4 = r4 + r8
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 11
            if (r5 < r6) goto L_0x03a9
            r5 = r25
            int r1 = android.view.ViewGroup.resolveSizeAndState(r1, r5, r3)
            int r3 = r3 << 16
            int r2 = android.view.ViewGroup.resolveSizeAndState(r4, r2, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r2 = r2 & r3
            int r3 = r0.f1184l
            int r1 = java.lang.Math.min(r3, r1)
            int r3 = r0.f1185m
            int r2 = java.lang.Math.min(r3, r2)
            b.e.a.j.g r3 = r0.f1181i
            boolean r3 = r3.mo4405Q()
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r3 == 0) goto L_0x0398
            r1 = r1 | r4
        L_0x0398:
            b.e.a.j.g r3 = r0.f1181i
            boolean r3 = r3.mo4403O()
            if (r3 == 0) goto L_0x03a1
            r2 = r2 | r4
        L_0x03a1:
            r0.setMeasuredDimension(r1, r2)
            r0.f1191s = r1
            r0.f1192t = r2
            goto L_0x03b0
        L_0x03a9:
            r0.setMeasuredDimension(r1, r4)
            r0.f1191s = r1
            r0.f1192t = r4
        L_0x03b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C0758f a = mo1703a(view);
        if ((view instanceof C0259e) && !(a instanceof C0763i)) {
            C0250a aVar = (C0250a) view.getLayoutParams();
            aVar.f1241k0 = new C0763i();
            aVar.f1217X = true;
            ((C0763i) aVar.f1241k0).mo4424v(aVar.f1211R);
        }
        if (view instanceof C0253b) {
            C0253b bVar = (C0253b) view;
            bVar.mo1738a();
            ((C0250a) view.getLayoutParams()).f1218Y = true;
            if (!this.f1179g.contains(bVar)) {
                this.f1179g.add(bVar);
            }
        }
        this.f1178f.put(view.getId(), view);
        this.f1186n = true;
    }

    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f1178f.remove(view.getId());
        C0758f a = mo1703a(view);
        this.f1181i.mo4452c(a);
        this.f1179g.remove(view);
        this.f1180h.remove(a);
        this.f1186n = true;
    }

    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.f1186n = true;
        this.f1191s = -1;
        this.f1192t = -1;
    }

    public void setConstraintSet(C0254c cVar) {
        this.f1188p = cVar;
    }

    public void setId(int i) {
        this.f1178f.remove(getId());
        super.setId(i);
        this.f1178f.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f1185m) {
            this.f1185m = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f1184l) {
            this.f1184l = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f1183k) {
            this.f1183k = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f1182j) {
            this.f1182j = i;
            requestLayout();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f1181i.mo4415u(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
