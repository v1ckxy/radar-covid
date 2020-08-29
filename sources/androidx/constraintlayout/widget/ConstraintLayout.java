package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;
import java.util.HashMap;
import p116io.jsonwebtoken.lang.Strings;
import p124p.p144f.p145a.p146h.C1278d;
import p124p.p144f.p145a.p146h.C1280e;
import p124p.p144f.p145a.p146h.C1282g;
import p124p.p144f.p147b.C1292b;
import p124p.p144f.p147b.C1293c;
import p124p.p144f.p147b.C1297e;
import p124p.p144f.p147b.C1298f;
import p124p.p144f.p147b.C1300h;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: e */
    public SparseArray<View> f413e = new SparseArray<>();

    /* renamed from: f */
    public ArrayList<C1292b> f414f = new ArrayList<>(4);

    /* renamed from: g */
    public final ArrayList<C1278d> f415g = new ArrayList<>(100);

    /* renamed from: h */
    public C1280e f416h = new C1280e();

    /* renamed from: i */
    public int f417i = 0;

    /* renamed from: j */
    public int f418j = 0;

    /* renamed from: k */
    public int f419k = Integer.MAX_VALUE;

    /* renamed from: l */
    public int f420l = Integer.MAX_VALUE;

    /* renamed from: m */
    public boolean f421m = true;

    /* renamed from: n */
    public int f422n = 7;

    /* renamed from: o */
    public C1293c f423o = null;

    /* renamed from: p */
    public int f424p = -1;

    /* renamed from: q */
    public HashMap<String, Integer> f425q = new HashMap<>();

    /* renamed from: r */
    public int f426r = -1;

    /* renamed from: s */
    public int f427s = -1;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static class C0064a extends MarginLayoutParams {

        /* renamed from: A */
        public float f428A = 0.5f;

        /* renamed from: B */
        public String f429B = null;

        /* renamed from: C */
        public int f430C = 1;

        /* renamed from: D */
        public float f431D = -1.0f;

        /* renamed from: E */
        public float f432E = -1.0f;

        /* renamed from: F */
        public int f433F = 0;

        /* renamed from: G */
        public int f434G = 0;

        /* renamed from: H */
        public int f435H = 0;

        /* renamed from: I */
        public int f436I = 0;

        /* renamed from: J */
        public int f437J = 0;

        /* renamed from: K */
        public int f438K = 0;

        /* renamed from: L */
        public int f439L = 0;

        /* renamed from: M */
        public int f440M = 0;

        /* renamed from: N */
        public float f441N = 1.0f;

        /* renamed from: O */
        public float f442O = 1.0f;

        /* renamed from: P */
        public int f443P = -1;

        /* renamed from: Q */
        public int f444Q = -1;

        /* renamed from: R */
        public int f445R = -1;

        /* renamed from: S */
        public boolean f446S = false;

        /* renamed from: T */
        public boolean f447T = false;

        /* renamed from: U */
        public boolean f448U = true;

        /* renamed from: V */
        public boolean f449V = true;

        /* renamed from: W */
        public boolean f450W = false;

        /* renamed from: X */
        public boolean f451X = false;

        /* renamed from: Y */
        public boolean f452Y = false;

        /* renamed from: Z */
        public boolean f453Z = false;

        /* renamed from: a */
        public int f454a = -1;

        /* renamed from: a0 */
        public int f455a0 = -1;

        /* renamed from: b */
        public int f456b = -1;

        /* renamed from: b0 */
        public int f457b0 = -1;

        /* renamed from: c */
        public float f458c = -1.0f;

        /* renamed from: c0 */
        public int f459c0 = -1;

        /* renamed from: d */
        public int f460d = -1;

        /* renamed from: d0 */
        public int f461d0 = -1;

        /* renamed from: e */
        public int f462e = -1;

        /* renamed from: e0 */
        public int f463e0 = -1;

        /* renamed from: f */
        public int f464f = -1;

        /* renamed from: f0 */
        public int f465f0 = -1;

        /* renamed from: g */
        public int f466g = -1;

        /* renamed from: g0 */
        public float f467g0 = 0.5f;

        /* renamed from: h */
        public int f468h = -1;

        /* renamed from: h0 */
        public int f469h0;

        /* renamed from: i */
        public int f470i = -1;

        /* renamed from: i0 */
        public int f471i0;

        /* renamed from: j */
        public int f472j = -1;

        /* renamed from: j0 */
        public float f473j0;

        /* renamed from: k */
        public int f474k = -1;

        /* renamed from: k0 */
        public C1278d f475k0 = new C1278d();

        /* renamed from: l */
        public int f476l = -1;

        /* renamed from: l0 */
        public boolean f477l0 = false;

        /* renamed from: m */
        public int f478m = -1;

        /* renamed from: n */
        public int f479n = 0;

        /* renamed from: o */
        public float f480o = 0.0f;

        /* renamed from: p */
        public int f481p = -1;

        /* renamed from: q */
        public int f482q = -1;

        /* renamed from: r */
        public int f483r = -1;

        /* renamed from: s */
        public int f484s = -1;

        /* renamed from: t */
        public int f485t = -1;

        /* renamed from: u */
        public int f486u = -1;

        /* renamed from: v */
        public int f487v = -1;

        /* renamed from: w */
        public int f488w = -1;

        /* renamed from: x */
        public int f489x = -1;

        /* renamed from: y */
        public int f490y = -1;

        /* renamed from: z */
        public float f491z = 0.5f;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a */
        public static class C0065a {

            /* renamed from: a */
            public static final SparseIntArray f492a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f492a = sparseIntArray;
                sparseIntArray.append(C1300h.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f492a.append(C1300h.ConstraintLayout_Layout_android_orientation, 1);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f492a.append(C1300h.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }
        }

        public C0064a(int i, int i2) {
            super(i, i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0204, code lost:
            android.util.Log.e(r7, r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0064a(android.content.Context r10, android.util.AttributeSet r11) {
            /*
                r9 = this;
                r9.<init>(r10, r11)
                r0 = -1
                r9.f454a = r0
                r9.f456b = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r9.f458c = r1
                r9.f460d = r0
                r9.f462e = r0
                r9.f464f = r0
                r9.f466g = r0
                r9.f468h = r0
                r9.f470i = r0
                r9.f472j = r0
                r9.f474k = r0
                r9.f476l = r0
                r9.f478m = r0
                r2 = 0
                r9.f479n = r2
                r3 = 0
                r9.f480o = r3
                r9.f481p = r0
                r9.f482q = r0
                r9.f483r = r0
                r9.f484s = r0
                r9.f485t = r0
                r9.f486u = r0
                r9.f487v = r0
                r9.f488w = r0
                r9.f489x = r0
                r9.f490y = r0
                r4 = 1056964608(0x3f000000, float:0.5)
                r9.f491z = r4
                r9.f428A = r4
                r5 = 0
                r9.f429B = r5
                r5 = 1
                r9.f430C = r5
                r9.f431D = r1
                r9.f432E = r1
                r9.f433F = r2
                r9.f434G = r2
                r9.f435H = r2
                r9.f436I = r2
                r9.f437J = r2
                r9.f438K = r2
                r9.f439L = r2
                r9.f440M = r2
                r1 = 1065353216(0x3f800000, float:1.0)
                r9.f441N = r1
                r9.f442O = r1
                r9.f443P = r0
                r9.f444Q = r0
                r9.f445R = r0
                r9.f446S = r2
                r9.f447T = r2
                r9.f448U = r5
                r9.f449V = r5
                r9.f450W = r2
                r9.f451X = r2
                r9.f452Y = r2
                r9.f453Z = r2
                r9.f455a0 = r0
                r9.f457b0 = r0
                r9.f459c0 = r0
                r9.f461d0 = r0
                r9.f463e0 = r0
                r9.f465f0 = r0
                r9.f467g0 = r4
                p.f.a.h.d r1 = new p.f.a.h.d
                r1.<init>()
                r9.f475k0 = r1
                r9.f477l0 = r2
                int[] r1 = p124p.p144f.p147b.C1300h.ConstraintLayout_Layout
                android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r1)
                int r11 = r10.getIndexCount()
                r1 = r2
            L_0x0098:
                if (r1 >= r11) goto L_0x03ab
                int r4 = r10.getIndex(r1)
                android.util.SparseIntArray r6 = androidx.constraintlayout.widget.ConstraintLayout.C0064a.C0065a.f492a
                int r6 = r6.get(r4)
                java.lang.String r7 = "ConstraintLayout"
                r8 = -2
                switch(r6) {
                    case 1: goto L_0x039f;
                    case 2: goto L_0x038e;
                    case 3: goto L_0x0385;
                    case 4: goto L_0x0370;
                    case 5: goto L_0x0367;
                    case 6: goto L_0x035e;
                    case 7: goto L_0x0355;
                    case 8: goto L_0x0344;
                    case 9: goto L_0x0333;
                    case 10: goto L_0x0321;
                    case 11: goto L_0x030f;
                    case 12: goto L_0x02fd;
                    case 13: goto L_0x02eb;
                    case 14: goto L_0x02d9;
                    case 15: goto L_0x02c7;
                    case 16: goto L_0x02b5;
                    case 17: goto L_0x02a3;
                    case 18: goto L_0x0291;
                    case 19: goto L_0x027f;
                    case 20: goto L_0x026d;
                    case 21: goto L_0x0263;
                    case 22: goto L_0x0259;
                    case 23: goto L_0x024f;
                    case 24: goto L_0x0245;
                    case 25: goto L_0x023b;
                    case 26: goto L_0x0231;
                    case 27: goto L_0x0227;
                    case 28: goto L_0x021d;
                    case 29: goto L_0x0213;
                    case 30: goto L_0x0209;
                    case 31: goto L_0x01fa;
                    case 32: goto L_0x01ef;
                    case 33: goto L_0x01d9;
                    case 34: goto L_0x01c3;
                    case 35: goto L_0x01b5;
                    case 36: goto L_0x019f;
                    case 37: goto L_0x0189;
                    case 38: goto L_0x017b;
                    default: goto L_0x00aa;
                }
            L_0x00aa:
                switch(r6) {
                    case 44: goto L_0x00e7;
                    case 45: goto L_0x00dd;
                    case 46: goto L_0x00d3;
                    case 47: goto L_0x00cb;
                    case 48: goto L_0x00c3;
                    case 49: goto L_0x00b9;
                    case 50: goto L_0x00af;
                    default: goto L_0x00ad;
                }
            L_0x00ad:
                goto L_0x03a7
            L_0x00af:
                int r6 = r9.f444Q
                int r4 = r10.getDimensionPixelOffset(r4, r6)
                r9.f444Q = r4
                goto L_0x03a7
            L_0x00b9:
                int r6 = r9.f443P
                int r4 = r10.getDimensionPixelOffset(r4, r6)
                r9.f443P = r4
                goto L_0x03a7
            L_0x00c3:
                int r4 = r10.getInt(r4, r2)
                r9.f434G = r4
                goto L_0x03a7
            L_0x00cb:
                int r4 = r10.getInt(r4, r2)
                r9.f433F = r4
                goto L_0x03a7
            L_0x00d3:
                float r6 = r9.f432E
                float r4 = r10.getFloat(r4, r6)
                r9.f432E = r4
                goto L_0x03a7
            L_0x00dd:
                float r6 = r9.f431D
                float r4 = r10.getFloat(r4, r6)
                r9.f431D = r4
                goto L_0x03a7
            L_0x00e7:
                java.lang.String r4 = r10.getString(r4)
                r9.f429B = r4
                r9.f430C = r0
                if (r4 == 0) goto L_0x03a7
                int r4 = r4.length()
                java.lang.String r6 = r9.f429B
                r7 = 44
                int r6 = r6.indexOf(r7)
                if (r6 <= 0) goto L_0x0121
                int r7 = r4 + -1
                if (r6 >= r7) goto L_0x0121
                java.lang.String r7 = r9.f429B
                java.lang.String r7 = r7.substring(r2, r6)
                java.lang.String r8 = "W"
                boolean r8 = r7.equalsIgnoreCase(r8)
                if (r8 == 0) goto L_0x0114
                r9.f430C = r2
                goto L_0x011e
            L_0x0114:
                java.lang.String r8 = "H"
                boolean r7 = r7.equalsIgnoreCase(r8)
                if (r7 == 0) goto L_0x011e
                r9.f430C = r5
            L_0x011e:
                int r6 = r6 + 1
                goto L_0x0122
            L_0x0121:
                r6 = r2
            L_0x0122:
                java.lang.String r7 = r9.f429B
                r8 = 58
                int r7 = r7.indexOf(r8)
                if (r7 < 0) goto L_0x016a
                int r4 = r4 + -1
                if (r7 >= r4) goto L_0x016a
                java.lang.String r4 = r9.f429B
                java.lang.String r4 = r4.substring(r6, r7)
                java.lang.String r6 = r9.f429B
                int r7 = r7 + 1
                java.lang.String r6 = r6.substring(r7)
                int r7 = r4.length()
                if (r7 <= 0) goto L_0x03a7
                int r7 = r6.length()
                if (r7 <= 0) goto L_0x03a7
                float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03a7 }
                float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ NumberFormatException -> 0x03a7 }
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x03a7
                int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x03a7
                int r7 = r9.f430C     // Catch:{ NumberFormatException -> 0x03a7 }
                if (r7 != r5) goto L_0x0164
                float r6 = r6 / r4
                java.lang.Math.abs(r6)     // Catch:{ NumberFormatException -> 0x03a7 }
                goto L_0x03a7
            L_0x0164:
                float r4 = r4 / r6
                java.lang.Math.abs(r4)     // Catch:{ NumberFormatException -> 0x03a7 }
                goto L_0x03a7
            L_0x016a:
                java.lang.String r4 = r9.f429B
                java.lang.String r4 = r4.substring(r6)
                int r6 = r4.length()
                if (r6 <= 0) goto L_0x03a7
                java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03a7 }
                goto L_0x03a7
            L_0x017b:
                float r6 = r9.f442O
                float r4 = r10.getFloat(r4, r6)
                float r4 = java.lang.Math.max(r3, r4)
                r9.f442O = r4
                goto L_0x03a7
            L_0x0189:
                int r6 = r9.f440M     // Catch:{ Exception -> 0x0193 }
                int r6 = r10.getDimensionPixelSize(r4, r6)     // Catch:{ Exception -> 0x0193 }
                r9.f440M = r6     // Catch:{ Exception -> 0x0193 }
                goto L_0x03a7
            L_0x0193:
                int r6 = r9.f440M
                int r4 = r10.getInt(r4, r6)
                if (r4 != r8) goto L_0x03a7
                r9.f440M = r8
                goto L_0x03a7
            L_0x019f:
                int r6 = r9.f438K     // Catch:{ Exception -> 0x01a9 }
                int r6 = r10.getDimensionPixelSize(r4, r6)     // Catch:{ Exception -> 0x01a9 }
                r9.f438K = r6     // Catch:{ Exception -> 0x01a9 }
                goto L_0x03a7
            L_0x01a9:
                int r6 = r9.f438K
                int r4 = r10.getInt(r4, r6)
                if (r4 != r8) goto L_0x03a7
                r9.f438K = r8
                goto L_0x03a7
            L_0x01b5:
                float r6 = r9.f441N
                float r4 = r10.getFloat(r4, r6)
                float r4 = java.lang.Math.max(r3, r4)
                r9.f441N = r4
                goto L_0x03a7
            L_0x01c3:
                int r6 = r9.f439L     // Catch:{ Exception -> 0x01cd }
                int r6 = r10.getDimensionPixelSize(r4, r6)     // Catch:{ Exception -> 0x01cd }
                r9.f439L = r6     // Catch:{ Exception -> 0x01cd }
                goto L_0x03a7
            L_0x01cd:
                int r6 = r9.f439L
                int r4 = r10.getInt(r4, r6)
                if (r4 != r8) goto L_0x03a7
                r9.f439L = r8
                goto L_0x03a7
            L_0x01d9:
                int r6 = r9.f437J     // Catch:{ Exception -> 0x01e3 }
                int r6 = r10.getDimensionPixelSize(r4, r6)     // Catch:{ Exception -> 0x01e3 }
                r9.f437J = r6     // Catch:{ Exception -> 0x01e3 }
                goto L_0x03a7
            L_0x01e3:
                int r6 = r9.f437J
                int r4 = r10.getInt(r4, r6)
                if (r4 != r8) goto L_0x03a7
                r9.f437J = r8
                goto L_0x03a7
            L_0x01ef:
                int r4 = r10.getInt(r4, r2)
                r9.f436I = r4
                if (r4 != r5) goto L_0x03a7
                java.lang.String r4 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
                goto L_0x0204
            L_0x01fa:
                int r4 = r10.getInt(r4, r2)
                r9.f435H = r4
                if (r4 != r5) goto L_0x03a7
                java.lang.String r4 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
            L_0x0204:
                android.util.Log.e(r7, r4)
                goto L_0x03a7
            L_0x0209:
                float r6 = r9.f428A
                float r4 = r10.getFloat(r4, r6)
                r9.f428A = r4
                goto L_0x03a7
            L_0x0213:
                float r6 = r9.f491z
                float r4 = r10.getFloat(r4, r6)
                r9.f491z = r4
                goto L_0x03a7
            L_0x021d:
                boolean r6 = r9.f447T
                boolean r4 = r10.getBoolean(r4, r6)
                r9.f447T = r4
                goto L_0x03a7
            L_0x0227:
                boolean r6 = r9.f446S
                boolean r4 = r10.getBoolean(r4, r6)
                r9.f446S = r4
                goto L_0x03a7
            L_0x0231:
                int r6 = r9.f490y
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.f490y = r4
                goto L_0x03a7
            L_0x023b:
                int r6 = r9.f489x
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.f489x = r4
                goto L_0x03a7
            L_0x0245:
                int r6 = r9.f488w
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.f488w = r4
                goto L_0x03a7
            L_0x024f:
                int r6 = r9.f487v
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.f487v = r4
                goto L_0x03a7
            L_0x0259:
                int r6 = r9.f486u
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.f486u = r4
                goto L_0x03a7
            L_0x0263:
                int r6 = r9.f485t
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.f485t = r4
                goto L_0x03a7
            L_0x026d:
                int r6 = r9.f484s
                int r6 = r10.getResourceId(r4, r6)
                r9.f484s = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.f484s = r4
                goto L_0x03a7
            L_0x027f:
                int r6 = r9.f483r
                int r6 = r10.getResourceId(r4, r6)
                r9.f483r = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.f483r = r4
                goto L_0x03a7
            L_0x0291:
                int r6 = r9.f482q
                int r6 = r10.getResourceId(r4, r6)
                r9.f482q = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.f482q = r4
                goto L_0x03a7
            L_0x02a3:
                int r6 = r9.f481p
                int r6 = r10.getResourceId(r4, r6)
                r9.f481p = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.f481p = r4
                goto L_0x03a7
            L_0x02b5:
                int r6 = r9.f476l
                int r6 = r10.getResourceId(r4, r6)
                r9.f476l = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.f476l = r4
                goto L_0x03a7
            L_0x02c7:
                int r6 = r9.f474k
                int r6 = r10.getResourceId(r4, r6)
                r9.f474k = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.f474k = r4
                goto L_0x03a7
            L_0x02d9:
                int r6 = r9.f472j
                int r6 = r10.getResourceId(r4, r6)
                r9.f472j = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.f472j = r4
                goto L_0x03a7
            L_0x02eb:
                int r6 = r9.f470i
                int r6 = r10.getResourceId(r4, r6)
                r9.f470i = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.f470i = r4
                goto L_0x03a7
            L_0x02fd:
                int r6 = r9.f468h
                int r6 = r10.getResourceId(r4, r6)
                r9.f468h = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.f468h = r4
                goto L_0x03a7
            L_0x030f:
                int r6 = r9.f466g
                int r6 = r10.getResourceId(r4, r6)
                r9.f466g = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.f466g = r4
                goto L_0x03a7
            L_0x0321:
                int r6 = r9.f464f
                int r6 = r10.getResourceId(r4, r6)
                r9.f464f = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.f464f = r4
                goto L_0x03a7
            L_0x0333:
                int r6 = r9.f462e
                int r6 = r10.getResourceId(r4, r6)
                r9.f462e = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.f462e = r4
                goto L_0x03a7
            L_0x0344:
                int r6 = r9.f460d
                int r6 = r10.getResourceId(r4, r6)
                r9.f460d = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.f460d = r4
                goto L_0x03a7
            L_0x0355:
                float r6 = r9.f458c
                float r4 = r10.getFloat(r4, r6)
                r9.f458c = r4
                goto L_0x03a7
            L_0x035e:
                int r6 = r9.f456b
                int r4 = r10.getDimensionPixelOffset(r4, r6)
                r9.f456b = r4
                goto L_0x03a7
            L_0x0367:
                int r6 = r9.f454a
                int r4 = r10.getDimensionPixelOffset(r4, r6)
                r9.f454a = r4
                goto L_0x03a7
            L_0x0370:
                float r6 = r9.f480o
                float r4 = r10.getFloat(r4, r6)
                r6 = 1135869952(0x43b40000, float:360.0)
                float r4 = r4 % r6
                r9.f480o = r4
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 >= 0) goto L_0x03a7
                float r4 = r6 - r4
                float r4 = r4 % r6
                r9.f480o = r4
                goto L_0x03a7
            L_0x0385:
                int r6 = r9.f479n
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.f479n = r4
                goto L_0x03a7
            L_0x038e:
                int r6 = r9.f478m
                int r6 = r10.getResourceId(r4, r6)
                r9.f478m = r6
                if (r6 != r0) goto L_0x03a7
                int r4 = r10.getInt(r4, r0)
                r9.f478m = r4
                goto L_0x03a7
            L_0x039f:
                int r6 = r9.f445R
                int r4 = r10.getInt(r4, r6)
                r9.f445R = r4
            L_0x03a7:
                int r1 = r1 + 1
                goto L_0x0098
            L_0x03ab:
                r10.recycle()
                r9.mo592a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0064a.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        public C0064a(LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public void mo592a() {
            this.f451X = false;
            this.f448U = true;
            this.f449V = true;
            if (this.width == -2 && this.f446S) {
                this.f448U = false;
                this.f435H = 1;
            }
            if (this.height == -2 && this.f447T) {
                this.f449V = false;
                this.f436I = 1;
            }
            int i = this.width;
            if (i == 0 || i == -1) {
                this.f448U = false;
                if (this.width == 0 && this.f435H == 1) {
                    this.width = -2;
                    this.f446S = true;
                }
            }
            int i2 = this.height;
            if (i2 == 0 || i2 == -1) {
                this.f449V = false;
                if (this.height == 0 && this.f436I == 1) {
                    this.height = -2;
                    this.f447T = true;
                }
            }
            if (this.f458c != -1.0f || this.f454a != -1 || this.f456b != -1) {
                this.f451X = true;
                this.f448U = true;
                this.f449V = true;
                if (!(this.f475k0 instanceof C1282g)) {
                    this.f475k0 = new C1282g();
                }
                ((C1282g) this.f475k0).mo5722g(this.f445R);
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
                r6.f459c0 = r7
                r6.f461d0 = r7
                r6.f455a0 = r7
                r6.f457b0 = r7
                r6.f463e0 = r7
                r6.f465f0 = r7
                int r2 = r6.f485t
                r6.f463e0 = r2
                int r2 = r6.f487v
                r6.f465f0 = r2
                float r2 = r6.f491z
                r6.f467g0 = r2
                int r2 = r6.f454a
                r6.f469h0 = r2
                int r2 = r6.f456b
                r6.f471i0 = r2
                float r2 = r6.f458c
                r6.f473j0 = r2
                int r2 = r6.getLayoutDirection()
                r3 = 0
                r4 = 1
                if (r4 != r2) goto L_0x0036
                r2 = r4
                goto L_0x0037
            L_0x0036:
                r2 = r3
            L_0x0037:
                if (r2 == 0) goto L_0x0098
                int r2 = r6.f481p
                if (r2 == r7) goto L_0x0041
                r6.f459c0 = r2
            L_0x003f:
                r3 = r4
                goto L_0x0048
            L_0x0041:
                int r2 = r6.f482q
                if (r2 == r7) goto L_0x0048
                r6.f461d0 = r2
                goto L_0x003f
            L_0x0048:
                int r2 = r6.f483r
                if (r2 == r7) goto L_0x004f
                r6.f457b0 = r2
                r3 = r4
            L_0x004f:
                int r2 = r6.f484s
                if (r2 == r7) goto L_0x0056
                r6.f455a0 = r2
                r3 = r4
            L_0x0056:
                int r2 = r6.f489x
                if (r2 == r7) goto L_0x005c
                r6.f465f0 = r2
            L_0x005c:
                int r2 = r6.f490y
                if (r2 == r7) goto L_0x0062
                r6.f463e0 = r2
            L_0x0062:
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x006c
                float r3 = r6.f491z
                float r3 = r2 - r3
                r6.f467g0 = r3
            L_0x006c:
                boolean r3 = r6.f451X
                if (r3 == 0) goto L_0x00bc
                int r3 = r6.f445R
                if (r3 != r4) goto L_0x00bc
                float r3 = r6.f458c
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x0084
                float r2 = r2 - r3
                r6.f473j0 = r2
                r6.f469h0 = r7
                r6.f471i0 = r7
                goto L_0x00bc
            L_0x0084:
                int r2 = r6.f454a
                if (r2 == r7) goto L_0x008f
                r6.f471i0 = r2
                r6.f469h0 = r7
            L_0x008c:
                r6.f473j0 = r4
                goto L_0x00bc
            L_0x008f:
                int r2 = r6.f456b
                if (r2 == r7) goto L_0x00bc
                r6.f469h0 = r2
                r6.f471i0 = r7
                goto L_0x008c
            L_0x0098:
                int r2 = r6.f481p
                if (r2 == r7) goto L_0x009e
                r6.f457b0 = r2
            L_0x009e:
                int r2 = r6.f482q
                if (r2 == r7) goto L_0x00a4
                r6.f455a0 = r2
            L_0x00a4:
                int r2 = r6.f483r
                if (r2 == r7) goto L_0x00aa
                r6.f459c0 = r2
            L_0x00aa:
                int r2 = r6.f484s
                if (r2 == r7) goto L_0x00b0
                r6.f461d0 = r2
            L_0x00b0:
                int r2 = r6.f489x
                if (r2 == r7) goto L_0x00b6
                r6.f463e0 = r2
            L_0x00b6:
                int r2 = r6.f490y
                if (r2 == r7) goto L_0x00bc
                r6.f465f0 = r2
            L_0x00bc:
                int r2 = r6.f483r
                if (r2 != r7) goto L_0x0104
                int r2 = r6.f484s
                if (r2 != r7) goto L_0x0104
                int r2 = r6.f482q
                if (r2 != r7) goto L_0x0104
                int r2 = r6.f481p
                if (r2 != r7) goto L_0x0104
                int r2 = r6.f464f
                if (r2 == r7) goto L_0x00db
                r6.f459c0 = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00e8
                if (r1 <= 0) goto L_0x00e8
            L_0x00d8:
                r6.rightMargin = r1
                goto L_0x00e8
            L_0x00db:
                int r2 = r6.f466g
                if (r2 == r7) goto L_0x00e8
                r6.f461d0 = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00e8
                if (r1 <= 0) goto L_0x00e8
                goto L_0x00d8
            L_0x00e8:
                int r1 = r6.f460d
                if (r1 == r7) goto L_0x00f7
                r6.f455a0 = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x0104
                if (r0 <= 0) goto L_0x0104
            L_0x00f4:
                r6.leftMargin = r0
                goto L_0x0104
            L_0x00f7:
                int r1 = r6.f462e
                if (r1 == r7) goto L_0x0104
                r6.f457b0 = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x0104
                if (r0 <= 0) goto L_0x0104
                goto L_0x00f4
            L_0x0104:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0064a.resolveLayoutDirection(int):void");
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        mo566a((AttributeSet) null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo566a(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo566a(attributeSet);
    }

    /* renamed from: a */
    public Object mo560a(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.f425q;
            if (hashMap != null && hashMap.containsKey(str)) {
                return this.f425q.get(str);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C1278d mo561a(int i) {
        if (i == 0) {
            return this.f416h;
        }
        View view = (View) this.f413e.get(i);
        if (view == null) {
            view = findViewById(i);
            if (!(view == null || view == this || view.getParent() != this)) {
                onViewAdded(view);
            }
        }
        if (view == this) {
            return this.f416h;
        }
        return view == null ? null : ((C0064a) view.getLayoutParams()).f475k0;
    }

    /* renamed from: a */
    public final C1278d mo562a(View view) {
        if (view == this) {
            return this.f416h;
        }
        return view == null ? null : ((C0064a) view.getLayoutParams()).f475k0;
    }

    /* renamed from: a */
    public void mo565a(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f425q == null) {
                this.f425q = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf(Strings.FOLDER_SEPARATOR);
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f425q.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* renamed from: a */
    public final void mo566a(AttributeSet attributeSet) {
        this.f416h.f3719X = this;
        this.f413e.put(getId(), this);
        this.f423o = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1300h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1300h.ConstraintLayout_Layout_android_minWidth) {
                    this.f417i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f417i);
                } else if (index == C1300h.ConstraintLayout_Layout_android_minHeight) {
                    this.f418j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f418j);
                } else if (index == C1300h.ConstraintLayout_Layout_android_maxWidth) {
                    this.f419k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f419k);
                } else if (index == C1300h.ConstraintLayout_Layout_android_maxHeight) {
                    this.f420l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f420l);
                } else if (index == C1300h.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f422n = obtainStyledAttributes.getInt(index, this.f422n);
                } else if (index == C1300h.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C1293c cVar = new C1293c();
                        this.f423o = cVar;
                        cVar.mo5749a(getContext(), resourceId);
                    } catch (NotFoundException unused) {
                        this.f423o = null;
                    }
                    this.f424p = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f416h.f3764C0 = this.f422n;
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0064a;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag();
                    if (tag != null && (tag instanceof String)) {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            int i2 = (int) ((((float) parseInt) / 1080.0f) * width);
                            int i3 = (int) ((((float) parseInt2) / 1920.0f) * height);
                            int parseInt3 = (int) ((((float) Integer.parseInt(split[2])) / 1080.0f) * width);
                            int parseInt4 = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height);
                            Paint paint = new Paint();
                            paint.setColor(-65536);
                            float f = (float) i2;
                            float f2 = (float) (i2 + parseInt3);
                            Canvas canvas2 = canvas;
                            float f3 = (float) i3;
                            float f4 = f;
                            float f5 = f;
                            float f6 = f3;
                            Paint paint2 = paint;
                            float f7 = f2;
                            Paint paint3 = paint2;
                            canvas2.drawLine(f4, f6, f7, f3, paint3);
                            float f8 = (float) (i3 + parseInt4);
                            float f9 = f2;
                            float f10 = f8;
                            canvas2.drawLine(f9, f6, f7, f10, paint3);
                            float f11 = f8;
                            float f12 = f5;
                            canvas2.drawLine(f9, f11, f12, f10, paint3);
                            float f13 = f5;
                            canvas2.drawLine(f13, f11, f12, f3, paint3);
                            Paint paint4 = paint2;
                            paint4.setColor(-16711936);
                            Paint paint5 = paint4;
                            float f14 = f2;
                            Paint paint6 = paint5;
                            canvas2.drawLine(f13, f3, f14, f8, paint6);
                            canvas2.drawLine(f13, f8, f14, f3, paint6);
                        }
                    }
                }
            }
        }
    }

    public C0064a generateDefaultLayoutParams() {
        return new C0064a(-2, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0064a(getContext(), attributeSet);
    }

    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0064a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f420l;
    }

    public int getMaxWidth() {
        return this.f419k;
    }

    public int getMinHeight() {
        return this.f418j;
    }

    public int getMinWidth() {
        return this.f417i;
    }

    public int getOptimizationLevel() {
        return this.f416h.f3764C0;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            C0064a aVar = (C0064a) childAt.getLayoutParams();
            C1278d dVar = aVar.f475k0;
            if ((childAt.getVisibility() != 8 || aVar.f451X || aVar.f452Y || isInEditMode) && !aVar.f453Z) {
                int i7 = dVar.f3708M + dVar.f3710O;
                int i8 = dVar.f3709N + dVar.f3711P;
                int j = dVar.mo5705j() + i7;
                int d = dVar.mo5696d() + i8;
                childAt.layout(i7, i8, j, d);
                if (childAt instanceof C1298f) {
                    View content = ((C1298f) childAt).getContent();
                    if (content != null) {
                        content.setVisibility(0);
                        content.layout(i7, i8, j, d);
                    }
                }
            }
        }
        int size = this.f414f.size();
        if (size > 0) {
            while (i5 < size) {
                if (((C1292b) this.f414f.get(i5)) != null) {
                    i5++;
                } else {
                    throw null;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:377:0x07e4, code lost:
        if (r8.f435H != 1) goto L_0x07e8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x04f5  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x052c  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0568  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x058c  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0640  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0666  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0674  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0705  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0801  */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x0853  */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x0864  */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x0868  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x086e  */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x094a  */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x0963  */
    /* JADX WARNING: Removed duplicated region for block: B:582:0x0b50  */
    /* JADX WARNING: Removed duplicated region for block: B:585:0x0b84  */
    /* JADX WARNING: Removed duplicated region for block: B:588:0x0b8b  */
    /* JADX WARNING: Removed duplicated region for block: B:624:0x087e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r39, int r40) {
        /*
            r38 = this;
            r0 = r38
            r1 = r39
            r2 = r40
            java.lang.System.currentTimeMillis()
            int r3 = android.view.View.MeasureSpec.getMode(r39)
            int r4 = android.view.View.MeasureSpec.getSize(r39)
            int r5 = android.view.View.MeasureSpec.getMode(r40)
            int r6 = android.view.View.MeasureSpec.getSize(r40)
            int r7 = r38.getPaddingLeft()
            int r8 = r38.getPaddingTop()
            p.f.a.h.e r9 = r0.f416h
            r9.f3704I = r7
            r9.f3705J = r8
            int r10 = r0.f419k
            int[] r11 = r9.f3747q
            r12 = 0
            r11[r12] = r10
            int r10 = r0.f420l
            r13 = 1
            r11[r13] = r10
            int r10 = r38.getLayoutDirection()
            if (r10 != r13) goto L_0x003b
            r10 = r13
            goto L_0x003c
        L_0x003b:
            r10 = r12
        L_0x003c:
            r9.f3768l0 = r10
            int r9 = android.view.View.MeasureSpec.getMode(r39)
            int r10 = android.view.View.MeasureSpec.getSize(r39)
            int r11 = android.view.View.MeasureSpec.getMode(r40)
            int r14 = android.view.View.MeasureSpec.getSize(r40)
            int r15 = r38.getPaddingTop()
            int r16 = r38.getPaddingBottom()
            int r16 = r16 + r15
            int r15 = r38.getPaddingLeft()
            int r17 = r38.getPaddingRight()
            int r17 = r17 + r15
            p.f.a.h.d$a r15 = p124p.p144f.p145a.p146h.C1278d.C1279a.FIXED
            r38.getLayoutParams()
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 1073741824(0x40000000, float:2.0)
            if (r9 == r13) goto L_0x0081
            if (r9 == 0) goto L_0x007d
            if (r9 == r12) goto L_0x0073
            r9 = r15
            goto L_0x007f
        L_0x0073:
            int r9 = r0.f419k
            int r9 = java.lang.Math.min(r9, r10)
            int r10 = r9 - r17
            r9 = r15
            goto L_0x0083
        L_0x007d:
            p.f.a.h.d$a r9 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
        L_0x007f:
            r10 = 0
            goto L_0x0083
        L_0x0081:
            p.f.a.h.d$a r9 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
        L_0x0083:
            if (r11 == r13) goto L_0x0098
            if (r11 == 0) goto L_0x0093
            if (r11 == r12) goto L_0x008a
            goto L_0x0096
        L_0x008a:
            int r11 = r0.f420l
            int r11 = java.lang.Math.min(r11, r14)
            int r14 = r11 - r16
            goto L_0x009a
        L_0x0093:
            p.f.a.h.d$a r11 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
            r15 = r11
        L_0x0096:
            r14 = 0
            goto L_0x009a
        L_0x0098:
            p.f.a.h.d$a r15 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
        L_0x009a:
            p.f.a.h.e r11 = r0.f416h
            r12 = 0
            r11.f3713R = r12
            r11.f3714S = r12
            r11.mo5686a(r9)
            p.f.a.h.e r9 = r0.f416h
            r9.mo5701f(r10)
            p.f.a.h.e r9 = r0.f416h
            r9.mo5691b(r15)
            p.f.a.h.e r9 = r0.f416h
            r9.mo5699e(r14)
            p.f.a.h.e r9 = r0.f416h
            int r10 = r0.f417i
            int r11 = r38.getPaddingLeft()
            int r10 = r10 - r11
            int r11 = r38.getPaddingRight()
            int r10 = r10 - r11
            if (r10 >= 0) goto L_0x00c4
            r10 = 0
        L_0x00c4:
            r9.f3713R = r10
            p.f.a.h.e r9 = r0.f416h
            int r10 = r0.f418j
            int r11 = r38.getPaddingTop()
            int r10 = r10 - r11
            int r11 = r38.getPaddingBottom()
            int r10 = r10 - r11
            if (r10 >= 0) goto L_0x00d7
            r10 = 0
        L_0x00d7:
            r9.f3714S = r10
            p.f.a.h.e r9 = r0.f416h
            int r9 = r9.mo5705j()
            p.f.a.h.e r10 = r0.f416h
            int r10 = r10.mo5696d()
            boolean r11 = r0.f421m
            if (r11 == 0) goto L_0x0768
            r11 = 0
            r0.f421m = r11
            int r11 = r38.getChildCount()
            r15 = 0
        L_0x00f1:
            if (r15 >= r11) goto L_0x0102
            android.view.View r17 = r0.getChildAt(r15)
            boolean r17 = r17.isLayoutRequested()
            if (r17 == 0) goto L_0x00ff
            r11 = 1
            goto L_0x0103
        L_0x00ff:
            int r15 = r15 + 1
            goto L_0x00f1
        L_0x0102:
            r11 = 0
        L_0x0103:
            if (r11 == 0) goto L_0x075a
            java.util.ArrayList<p.f.a.h.d> r11 = r0.f415g
            r11.clear()
            boolean r11 = r38.isInEditMode()
            int r15 = r38.getChildCount()
            if (r11 == 0) goto L_0x0156
            r13 = 0
        L_0x0115:
            if (r13 >= r15) goto L_0x0156
            android.view.View r18 = r0.getChildAt(r13)
            android.content.res.Resources r12 = r38.getResources()     // Catch:{ NotFoundException -> 0x014f }
            int r14 = r18.getId()     // Catch:{ NotFoundException -> 0x014f }
            java.lang.String r12 = r12.getResourceName(r14)     // Catch:{ NotFoundException -> 0x014f }
            int r14 = r18.getId()     // Catch:{ NotFoundException -> 0x014f }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ NotFoundException -> 0x014f }
            r19 = r7
            r7 = 0
            r0.mo565a(r7, r12, r14)     // Catch:{ NotFoundException -> 0x0151 }
            r7 = 47
            int r7 = r12.indexOf(r7)     // Catch:{ NotFoundException -> 0x0151 }
            r14 = -1
            if (r7 == r14) goto L_0x0144
            int r7 = r7 + 1
            java.lang.String r12 = r12.substring(r7)     // Catch:{ NotFoundException -> 0x0151 }
        L_0x0144:
            int r7 = r18.getId()     // Catch:{ NotFoundException -> 0x0151 }
            p.f.a.h.d r7 = r0.mo561a(r7)     // Catch:{ NotFoundException -> 0x0151 }
            r7.f3721Z = r12     // Catch:{ NotFoundException -> 0x0151 }
            goto L_0x0151
        L_0x014f:
            r19 = r7
        L_0x0151:
            int r13 = r13 + 1
            r7 = r19
            goto L_0x0115
        L_0x0156:
            r19 = r7
            r7 = 0
        L_0x0159:
            if (r7 >= r15) goto L_0x016c
            android.view.View r12 = r0.getChildAt(r7)
            p.f.a.h.d r12 = r0.mo562a(r12)
            if (r12 != 0) goto L_0x0166
            goto L_0x0169
        L_0x0166:
            r12.mo5707l()
        L_0x0169:
            int r7 = r7 + 1
            goto L_0x0159
        L_0x016c:
            int r7 = r0.f424p
            r12 = -1
            if (r7 == r12) goto L_0x018f
            r7 = 0
        L_0x0172:
            if (r7 >= r15) goto L_0x018f
            android.view.View r12 = r0.getChildAt(r7)
            int r13 = r12.getId()
            int r14 = r0.f424p
            if (r13 != r14) goto L_0x018c
            boolean r13 = r12 instanceof p124p.p144f.p147b.C1295d
            if (r13 == 0) goto L_0x018c
            p.f.b.d r12 = (p124p.p144f.p147b.C1295d) r12
            p.f.b.c r12 = r12.getConstraintSet()
            r0.f423o = r12
        L_0x018c:
            int r7 = r7 + 1
            goto L_0x0172
        L_0x018f:
            p.f.b.c r7 = r0.f423o
            if (r7 == 0) goto L_0x0310
            int r12 = r38.getChildCount()
            java.util.HashSet r13 = new java.util.HashSet
            java.util.HashMap<java.lang.Integer, p.f.b.c$a> r14 = r7.f3839a
            java.util.Set r14 = r14.keySet()
            r13.<init>(r14)
            r14 = 0
        L_0x01a3:
            if (r14 >= r12) goto L_0x028f
            r18 = r12
            android.view.View r12 = r0.getChildAt(r14)
            r20 = r8
            int r8 = r12.getId()
            r21 = r6
            r6 = -1
            if (r8 == r6) goto L_0x0287
            java.util.HashMap<java.lang.Integer, p.f.b.c$a> r6 = r7.f3839a
            r22 = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            boolean r5 = r6.containsKey(r5)
            if (r5 == 0) goto L_0x0273
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r13.remove(r5)
            java.util.HashMap<java.lang.Integer, p.f.b.c$a> r5 = r7.f3839a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            java.lang.Object r5 = r5.get(r6)
            p.f.b.c$a r5 = (p124p.p144f.p147b.C1293c.C1294a) r5
            boolean r6 = r12 instanceof p124p.p144f.p147b.C1291a
            if (r6 == 0) goto L_0x01df
            r6 = 1
            r5.f3905t0 = r6
            goto L_0x01e0
        L_0x01df:
            r6 = 1
        L_0x01e0:
            r23 = r4
            int r4 = r5.f3905t0
            r24 = r3
            r3 = -1
            if (r4 == r3) goto L_0x0211
            if (r4 == r6) goto L_0x01ec
            goto L_0x0211
        L_0x01ec:
            r3 = r12
            p.f.b.a r3 = (p124p.p144f.p147b.C1291a) r3
            r3.setId(r8)
            int r4 = r5.f3903s0
            r3.setType(r4)
            boolean r4 = r5.f3901r0
            r3.setAllowsGoneWidget(r4)
            int[] r4 = r5.f3907u0
            if (r4 == 0) goto L_0x0204
            r3.setReferencedIds(r4)
            goto L_0x0211
        L_0x0204:
            java.lang.String r4 = r5.f3909v0
            if (r4 == 0) goto L_0x0211
            int[] r4 = r7.mo5750a(r3, r4)
            r5.f3907u0 = r4
            r3.setReferencedIds(r4)
        L_0x0211:
            android.view.ViewGroup$LayoutParams r3 = r12.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r3 = (androidx.constraintlayout.widget.ConstraintLayout.C0064a) r3
            r5.mo5752a(r3)
            r12.setLayoutParams(r3)
            int r3 = r5.f3849J
            r12.setVisibility(r3)
            float r3 = r5.f3860U
            r12.setAlpha(r3)
            float r3 = r5.f3863X
            r12.setRotation(r3)
            float r3 = r5.f3864Y
            r12.setRotationX(r3)
            float r3 = r5.f3865Z
            r12.setRotationY(r3)
            float r3 = r5.f3867a0
            r12.setScaleX(r3)
            float r3 = r5.f3869b0
            r12.setScaleY(r3)
            float r3 = r5.f3871c0
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L_0x024d
            float r3 = r5.f3871c0
            r12.setPivotX(r3)
        L_0x024d:
            float r3 = r5.f3873d0
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L_0x025a
            float r3 = r5.f3873d0
            r12.setPivotY(r3)
        L_0x025a:
            float r3 = r5.f3875e0
            r12.setTranslationX(r3)
            float r3 = r5.f3877f0
            r12.setTranslationY(r3)
            float r3 = r5.f3879g0
            r12.setTranslationZ(r3)
            boolean r3 = r5.f3861V
            if (r3 == 0) goto L_0x0277
            float r3 = r5.f3862W
            r12.setElevation(r3)
            goto L_0x0277
        L_0x0273:
            r24 = r3
            r23 = r4
        L_0x0277:
            int r14 = r14 + 1
            r12 = r18
            r8 = r20
            r6 = r21
            r5 = r22
            r4 = r23
            r3 = r24
            goto L_0x01a3
        L_0x0287:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            r1.<init>(r2)
            throw r1
        L_0x028f:
            r24 = r3
            r23 = r4
            r22 = r5
            r21 = r6
            r20 = r8
            java.util.Iterator r3 = r13.iterator()
        L_0x029d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x031a
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.util.HashMap<java.lang.Integer, p.f.b.c$a> r5 = r7.f3839a
            java.lang.Object r5 = r5.get(r4)
            p.f.b.c$a r5 = (p124p.p144f.p147b.C1293c.C1294a) r5
            int r6 = r5.f3905t0
            r8 = -1
            if (r6 == r8) goto L_0x02f1
            r8 = 1
            if (r6 == r8) goto L_0x02ba
            goto L_0x02f1
        L_0x02ba:
            p.f.b.a r6 = new p.f.b.a
            android.content.Context r8 = r38.getContext()
            r6.<init>(r8)
            int r8 = r4.intValue()
            r6.setId(r8)
            int[] r8 = r5.f3907u0
            if (r8 == 0) goto L_0x02d2
            r6.setReferencedIds(r8)
            goto L_0x02df
        L_0x02d2:
            java.lang.String r8 = r5.f3909v0
            if (r8 == 0) goto L_0x02df
            int[] r8 = r7.mo5750a(r6, r8)
            r5.f3907u0 = r8
            r6.setReferencedIds(r8)
        L_0x02df:
            int r8 = r5.f3903s0
            r6.setType(r8)
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = r38.generateDefaultLayoutParams()
            r6.mo5740a()
            r5.mo5752a(r8)
            r0.addView(r6, r8)
        L_0x02f1:
            boolean r6 = r5.f3866a
            if (r6 == 0) goto L_0x029d
            p.f.b.e r6 = new p.f.b.e
            android.content.Context r8 = r38.getContext()
            r6.<init>(r8)
            int r4 = r4.intValue()
            r6.setId(r4)
            androidx.constraintlayout.widget.ConstraintLayout$a r4 = r38.generateDefaultLayoutParams()
            r5.mo5752a(r4)
            r0.addView(r6, r4)
            goto L_0x029d
        L_0x0310:
            r24 = r3
            r23 = r4
            r22 = r5
            r21 = r6
            r20 = r8
        L_0x031a:
            p.f.a.h.e r3 = r0.f416h
            java.util.ArrayList<p.f.a.h.d> r3 = r3.f3827k0
            r3.clear()
            java.util.ArrayList<p.f.b.b> r3 = r0.f414f
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x033a
            r4 = 0
        L_0x032a:
            if (r4 >= r3) goto L_0x033a
            java.util.ArrayList<p.f.b.b> r5 = r0.f414f
            java.lang.Object r5 = r5.get(r4)
            p.f.b.b r5 = (p124p.p144f.p147b.C1292b) r5
            r5.mo5741a(r0)
            int r4 = r4 + 1
            goto L_0x032a
        L_0x033a:
            r3 = 0
        L_0x033b:
            if (r3 >= r15) goto L_0x0376
            android.view.View r4 = r0.getChildAt(r3)
            boolean r5 = r4 instanceof p124p.p144f.p147b.C1298f
            if (r5 == 0) goto L_0x0373
            p.f.b.f r4 = (p124p.p144f.p147b.C1298f) r4
            int r5 = r4.f3928e
            r6 = -1
            if (r5 != r6) goto L_0x0357
            boolean r5 = r4.isInEditMode()
            if (r5 != 0) goto L_0x0357
            int r5 = r4.f3930g
            r4.setVisibility(r5)
        L_0x0357:
            int r5 = r4.f3928e
            android.view.View r5 = r0.findViewById(r5)
            r4.f3929f = r5
            if (r5 == 0) goto L_0x0373
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r5 = (androidx.constraintlayout.widget.ConstraintLayout.C0064a) r5
            r6 = 1
            r5.f453Z = r6
            android.view.View r5 = r4.f3929f
            r6 = 0
            r5.setVisibility(r6)
            r4.setVisibility(r6)
        L_0x0373:
            int r3 = r3 + 1
            goto L_0x033b
        L_0x0376:
            r3 = 0
        L_0x0377:
            r4 = 0
            if (r3 >= r15) goto L_0x0766
            android.view.View r5 = r0.getChildAt(r3)
            p.f.a.h.d r6 = r0.mo562a(r5)
            if (r6 != 0) goto L_0x0386
            goto L_0x0478
        L_0x0386:
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r7 = (androidx.constraintlayout.widget.ConstraintLayout.C0064a) r7
            r7.mo592a()
            boolean r8 = r7.f477l0
            if (r8 == 0) goto L_0x0397
            r8 = 0
            r7.f477l0 = r8
            goto L_0x03c7
        L_0x0397:
            if (r11 == 0) goto L_0x03c7
            android.content.res.Resources r8 = r38.getResources()     // Catch:{ NotFoundException -> 0x03c7 }
            int r12 = r5.getId()     // Catch:{ NotFoundException -> 0x03c7 }
            java.lang.String r8 = r8.getResourceName(r12)     // Catch:{ NotFoundException -> 0x03c7 }
            int r12 = r5.getId()     // Catch:{ NotFoundException -> 0x03c7 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NotFoundException -> 0x03c7 }
            r13 = 0
            r0.mo565a(r13, r8, r12)     // Catch:{ NotFoundException -> 0x03c7 }
            java.lang.String r12 = "id/"
            int r12 = r8.indexOf(r12)     // Catch:{ NotFoundException -> 0x03c7 }
            int r12 = r12 + 3
            java.lang.String r8 = r8.substring(r12)     // Catch:{ NotFoundException -> 0x03c7 }
            int r12 = r5.getId()     // Catch:{ NotFoundException -> 0x03c7 }
            p.f.a.h.d r12 = r0.mo561a(r12)     // Catch:{ NotFoundException -> 0x03c7 }
            r12.f3721Z = r8     // Catch:{ NotFoundException -> 0x03c7 }
        L_0x03c7:
            int r8 = r5.getVisibility()
            r6.f3720Y = r8
            boolean r8 = r7.f453Z
            if (r8 == 0) goto L_0x03d5
            r8 = 8
            r6.f3720Y = r8
        L_0x03d5:
            r6.f3719X = r5
            p.f.a.h.e r5 = r0.f416h
            java.util.ArrayList<p.f.a.h.d> r8 = r5.f3827k0
            r8.add(r6)
            p.f.a.h.d r8 = r6.f3699D
            if (r8 == 0) goto L_0x03eb
            p.f.a.h.n r8 = (p124p.p144f.p145a.p146h.C1290n) r8
            java.util.ArrayList<p.f.a.h.d> r8 = r8.f3827k0
            r8.remove(r6)
            r6.f3699D = r4
        L_0x03eb:
            r6.f3699D = r5
            boolean r4 = r7.f449V
            if (r4 == 0) goto L_0x03f5
            boolean r4 = r7.f448U
            if (r4 != 0) goto L_0x03fa
        L_0x03f5:
            java.util.ArrayList<p.f.a.h.d> r4 = r0.f415g
            r4.add(r6)
        L_0x03fa:
            boolean r4 = r7.f451X
            if (r4 == 0) goto L_0x042e
            p.f.a.h.g r6 = (p124p.p144f.p145a.p146h.C1282g) r6
            int r4 = r7.f469h0
            int r5 = r7.f471i0
            float r7 = r7.f473j0
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r12 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r12 == 0) goto L_0x0417
            if (r12 <= 0) goto L_0x0478
            r6.f3794k0 = r7
            r12 = -1
            r6.f3795l0 = r12
            r6.f3796m0 = r12
            goto L_0x0478
        L_0x0417:
            r12 = -1
            if (r4 == r12) goto L_0x0423
            if (r4 <= r12) goto L_0x0478
            r6.f3794k0 = r8
            r6.f3795l0 = r4
            r6.f3796m0 = r12
            goto L_0x0478
        L_0x0423:
            if (r5 == r12) goto L_0x0478
            if (r5 <= r12) goto L_0x0478
            r6.f3794k0 = r8
            r6.f3795l0 = r12
            r6.f3796m0 = r5
            goto L_0x0478
        L_0x042e:
            r12 = -1
            int r4 = r7.f460d
            if (r4 != r12) goto L_0x047c
            int r4 = r7.f462e
            if (r4 != r12) goto L_0x047c
            int r4 = r7.f464f
            if (r4 != r12) goto L_0x047c
            int r4 = r7.f466g
            if (r4 != r12) goto L_0x047c
            int r4 = r7.f482q
            if (r4 != r12) goto L_0x047c
            int r4 = r7.f481p
            if (r4 != r12) goto L_0x047c
            int r4 = r7.f483r
            if (r4 != r12) goto L_0x047c
            int r4 = r7.f484s
            if (r4 != r12) goto L_0x047c
            int r4 = r7.f468h
            if (r4 != r12) goto L_0x047c
            int r4 = r7.f470i
            if (r4 != r12) goto L_0x047c
            int r4 = r7.f472j
            if (r4 != r12) goto L_0x047c
            int r4 = r7.f474k
            if (r4 != r12) goto L_0x047c
            int r4 = r7.f476l
            if (r4 != r12) goto L_0x047c
            int r4 = r7.f443P
            if (r4 != r12) goto L_0x047c
            int r4 = r7.f444Q
            if (r4 != r12) goto L_0x047c
            int r4 = r7.f478m
            if (r4 != r12) goto L_0x047c
            int r4 = r7.width
            if (r4 == r12) goto L_0x047c
            int r4 = r7.height
            if (r4 != r12) goto L_0x0478
            goto L_0x047c
        L_0x0478:
            r18 = r15
            goto L_0x0750
        L_0x047c:
            int r4 = r7.f455a0
            int r5 = r7.f457b0
            int r8 = r7.f459c0
            int r12 = r7.f461d0
            int r13 = r7.f463e0
            int r14 = r7.f465f0
            r18 = r15
            float r15 = r7.f467g0
            int r2 = r7.f478m
            r1 = -1
            if (r2 == r1) goto L_0x04ac
            p.f.a.h.d r27 = r0.mo561a(r2)
            if (r27 == 0) goto L_0x05f5
            float r1 = r7.f480o
            int r2 = r7.f479n
            p.f.a.h.c$c r28 = p124p.p144f.p145a.p146h.C1274c.C1277c.CENTER
            r30 = 0
            r25 = r6
            r26 = r28
            r29 = r2
            r25.mo5685a(r26, r27, r28, r29, r30)
            r6.f3748r = r1
            goto L_0x05f5
        L_0x04ac:
            if (r4 == r1) goto L_0x04c1
            p.f.a.h.d r2 = r0.mo561a(r4)
            if (r2 == 0) goto L_0x04de
            p.f.a.h.c$c r4 = p124p.p144f.p145a.p146h.C1274c.C1277c.LEFT
            int r5 = r7.leftMargin
            r27 = r2
            r26 = r4
            r28 = r26
        L_0x04be:
            r29 = r5
            goto L_0x04d6
        L_0x04c1:
            if (r5 == r1) goto L_0x04de
            p.f.a.h.d r1 = r0.mo561a(r5)
            if (r1 == 0) goto L_0x04dd
            p.f.a.h.c$c r2 = p124p.p144f.p145a.p146h.C1274c.C1277c.LEFT
            p.f.a.h.c$c r4 = p124p.p144f.p145a.p146h.C1274c.C1277c.RIGHT
            int r5 = r7.leftMargin
            r27 = r1
            r26 = r2
            r28 = r4
            goto L_0x04be
        L_0x04d6:
            r25 = r6
            r30 = r13
            r25.mo5685a(r26, r27, r28, r29, r30)
        L_0x04dd:
            r1 = -1
        L_0x04de:
            if (r8 == r1) goto L_0x04f5
            p.f.a.h.d r2 = r0.mo561a(r8)
            if (r2 == 0) goto L_0x0510
            p.f.a.h.c$c r4 = p124p.p144f.p145a.p146h.C1274c.C1277c.RIGHT
            p.f.a.h.c$c r5 = p124p.p144f.p145a.p146h.C1274c.C1277c.LEFT
            int r8 = r7.rightMargin
            r27 = r2
            r26 = r4
            r28 = r5
            r29 = r8
            goto L_0x0509
        L_0x04f5:
            if (r12 == r1) goto L_0x0510
            p.f.a.h.d r1 = r0.mo561a(r12)
            if (r1 == 0) goto L_0x0510
            p.f.a.h.c$c r2 = p124p.p144f.p145a.p146h.C1274c.C1277c.RIGHT
            int r4 = r7.rightMargin
            r27 = r1
            r26 = r2
            r28 = r26
            r29 = r4
        L_0x0509:
            r25 = r6
            r30 = r14
            r25.mo5685a(r26, r27, r28, r29, r30)
        L_0x0510:
            int r1 = r7.f468h
            r2 = -1
            if (r1 == r2) goto L_0x052c
            p.f.a.h.d r1 = r0.mo561a(r1)
            if (r1 == 0) goto L_0x054a
            p.f.a.h.c$c r4 = p124p.p144f.p145a.p146h.C1274c.C1277c.TOP
            int r5 = r7.topMargin
            int r8 = r7.f486u
            r27 = r1
            r26 = r4
            r28 = r26
        L_0x0527:
            r29 = r5
            r30 = r8
            goto L_0x0545
        L_0x052c:
            int r1 = r7.f470i
            if (r1 == r2) goto L_0x054a
            p.f.a.h.d r1 = r0.mo561a(r1)
            if (r1 == 0) goto L_0x054a
            p.f.a.h.c$c r2 = p124p.p144f.p145a.p146h.C1274c.C1277c.TOP
            p.f.a.h.c$c r4 = p124p.p144f.p145a.p146h.C1274c.C1277c.BOTTOM
            int r5 = r7.topMargin
            int r8 = r7.f486u
            r27 = r1
            r26 = r2
            r28 = r4
            goto L_0x0527
        L_0x0545:
            r25 = r6
            r25.mo5685a(r26, r27, r28, r29, r30)
        L_0x054a:
            int r1 = r7.f472j
            r2 = -1
            if (r1 == r2) goto L_0x0568
            p.f.a.h.d r1 = r0.mo561a(r1)
            if (r1 == 0) goto L_0x0587
            p.f.a.h.c$c r4 = p124p.p144f.p145a.p146h.C1274c.C1277c.BOTTOM
            p.f.a.h.c$c r5 = p124p.p144f.p145a.p146h.C1274c.C1277c.TOP
            int r8 = r7.bottomMargin
            int r12 = r7.f488w
            r27 = r1
            r26 = r4
            r28 = r5
            r29 = r8
            r30 = r12
            goto L_0x0582
        L_0x0568:
            int r1 = r7.f474k
            if (r1 == r2) goto L_0x0587
            p.f.a.h.d r1 = r0.mo561a(r1)
            if (r1 == 0) goto L_0x0587
            p.f.a.h.c$c r2 = p124p.p144f.p145a.p146h.C1274c.C1277c.BOTTOM
            int r4 = r7.bottomMargin
            int r5 = r7.f488w
            r27 = r1
            r26 = r2
            r28 = r26
            r29 = r4
            r30 = r5
        L_0x0582:
            r25 = r6
            r25.mo5685a(r26, r27, r28, r29, r30)
        L_0x0587:
            int r1 = r7.f476l
            r2 = -1
            if (r1 == r2) goto L_0x05dc
            android.util.SparseArray<android.view.View> r2 = r0.f413e
            java.lang.Object r1 = r2.get(r1)
            android.view.View r1 = (android.view.View) r1
            int r2 = r7.f476l
            p.f.a.h.d r2 = r0.mo561a(r2)
            if (r2 == 0) goto L_0x05dc
            if (r1 == 0) goto L_0x05dc
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            boolean r4 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0064a
            if (r4 == 0) goto L_0x05dc
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r1 = (androidx.constraintlayout.widget.ConstraintLayout.C0064a) r1
            r4 = 1
            r7.f450W = r4
            r1.f450W = r4
            p.f.a.h.c$c r1 = p124p.p144f.p145a.p146h.C1274c.C1277c.BASELINE
            p.f.a.h.c r31 = r6.mo5680a(r1)
            p.f.a.h.c$c r1 = p124p.p144f.p145a.p146h.C1274c.C1277c.BASELINE
            p.f.a.h.c r32 = r2.mo5680a(r1)
            r33 = 0
            r34 = -1
            p.f.a.h.c$b r35 = p124p.p144f.p145a.p146h.C1274c.C1276b.STRONG
            r36 = 0
            r37 = 1
            r31.mo5675a(r32, r33, r34, r35, r36, r37)
            p.f.a.h.c$c r1 = p124p.p144f.p145a.p146h.C1274c.C1277c.TOP
            p.f.a.h.c r1 = r6.mo5680a(r1)
            r1.mo5677c()
            p.f.a.h.c$c r1 = p124p.p144f.p145a.p146h.C1274c.C1277c.BOTTOM
            p.f.a.h.c r1 = r6.mo5680a(r1)
            r1.mo5677c()
        L_0x05dc:
            r1 = 0
            int r2 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            r4 = 1056964608(0x3f000000, float:0.5)
            if (r2 < 0) goto L_0x05e9
            int r2 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x05e9
            r6.f3717V = r15
        L_0x05e9:
            float r2 = r7.f428A
            int r5 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r5 < 0) goto L_0x05f5
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x05f5
            r6.f3718W = r2
        L_0x05f5:
            if (r11 == 0) goto L_0x0608
            int r1 = r7.f443P
            r2 = -1
            if (r1 != r2) goto L_0x0600
            int r1 = r7.f444Q
            if (r1 == r2) goto L_0x0608
        L_0x0600:
            int r1 = r7.f443P
            int r2 = r7.f444Q
            r6.f3704I = r1
            r6.f3705J = r2
        L_0x0608:
            boolean r1 = r7.f448U
            if (r1 != 0) goto L_0x0632
            int r1 = r7.width
            r2 = -1
            if (r1 != r2) goto L_0x062b
            p.f.a.h.d$a r1 = p124p.p144f.p145a.p146h.C1278d.C1279a.MATCH_PARENT
            r6.mo5686a(r1)
            p.f.a.h.c$c r1 = p124p.p144f.p145a.p146h.C1274c.C1277c.LEFT
            p.f.a.h.c r1 = r6.mo5680a(r1)
            int r2 = r7.leftMargin
            r1.f3673e = r2
            p.f.a.h.c$c r1 = p124p.p144f.p145a.p146h.C1274c.C1277c.RIGHT
            p.f.a.h.c r1 = r6.mo5680a(r1)
            int r2 = r7.rightMargin
            r1.f3673e = r2
            goto L_0x063c
        L_0x062b:
            p.f.a.h.d$a r1 = p124p.p144f.p145a.p146h.C1278d.C1279a.MATCH_CONSTRAINT
            r6.mo5686a(r1)
            r1 = 0
            goto L_0x0639
        L_0x0632:
            p.f.a.h.d$a r1 = p124p.p144f.p145a.p146h.C1278d.C1279a.FIXED
            r6.mo5686a(r1)
            int r1 = r7.width
        L_0x0639:
            r6.mo5701f(r1)
        L_0x063c:
            boolean r1 = r7.f449V
            if (r1 != 0) goto L_0x0666
            int r1 = r7.height
            r2 = -1
            if (r1 != r2) goto L_0x065f
            p.f.a.h.d$a r1 = p124p.p144f.p145a.p146h.C1278d.C1279a.MATCH_PARENT
            r6.mo5691b(r1)
            p.f.a.h.c$c r1 = p124p.p144f.p145a.p146h.C1274c.C1277c.TOP
            p.f.a.h.c r1 = r6.mo5680a(r1)
            int r2 = r7.topMargin
            r1.f3673e = r2
            p.f.a.h.c$c r1 = p124p.p144f.p145a.p146h.C1274c.C1277c.BOTTOM
            p.f.a.h.c r1 = r6.mo5680a(r1)
            int r2 = r7.bottomMargin
            r1.f3673e = r2
            goto L_0x0670
        L_0x065f:
            p.f.a.h.d$a r1 = p124p.p144f.p145a.p146h.C1278d.C1279a.MATCH_CONSTRAINT
            r6.mo5691b(r1)
            r1 = 0
            goto L_0x066d
        L_0x0666:
            p.f.a.h.d$a r1 = p124p.p144f.p145a.p146h.C1278d.C1279a.FIXED
            r6.mo5691b(r1)
            int r1 = r7.height
        L_0x066d:
            r6.mo5699e(r1)
        L_0x0670:
            java.lang.String r1 = r7.f429B
            if (r1 == 0) goto L_0x0709
            int r2 = r1.length()
            if (r2 != 0) goto L_0x067f
            r2 = 0
            r6.f3702G = r2
            goto L_0x0709
        L_0x067f:
            int r2 = r1.length()
            r4 = 44
            int r4 = r1.indexOf(r4)
            if (r4 <= 0) goto L_0x06ac
            int r5 = r2 + -1
            if (r4 >= r5) goto L_0x06ac
            r5 = 0
            java.lang.String r8 = r1.substring(r5, r4)
            java.lang.String r5 = "W"
            boolean r5 = r8.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x069e
            r5 = 0
            goto L_0x06a9
        L_0x069e:
            java.lang.String r5 = "H"
            boolean r5 = r8.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x06a8
            r5 = 1
            goto L_0x06a9
        L_0x06a8:
            r5 = -1
        L_0x06a9:
            int r4 = r4 + 1
            goto L_0x06ae
        L_0x06ac:
            r4 = 0
            r5 = -1
        L_0x06ae:
            r8 = 58
            int r8 = r1.indexOf(r8)
            if (r8 < 0) goto L_0x06f0
            int r2 = r2 + -1
            if (r8 >= r2) goto L_0x06f0
            java.lang.String r2 = r1.substring(r4, r8)
            int r8 = r8 + 1
            java.lang.String r1 = r1.substring(r8)
            int r4 = r2.length()
            if (r4 <= 0) goto L_0x06ff
            int r4 = r1.length()
            if (r4 <= 0) goto L_0x06ff
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x06ff }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x06ff }
            r4 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x06ff
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x06ff
            r4 = 1
            if (r5 != r4) goto L_0x06ea
            float r1 = r1 / r2
            float r1 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x06ff }
            goto L_0x0700
        L_0x06ea:
            float r2 = r2 / r1
            float r1 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x06ff }
            goto L_0x0700
        L_0x06f0:
            java.lang.String r1 = r1.substring(r4)
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x06ff
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x06ff }
            goto L_0x0700
        L_0x06ff:
            r1 = 0
        L_0x0700:
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0709
            r6.f3702G = r1
            r6.f3703H = r5
        L_0x0709:
            float r1 = r7.f431D
            float[] r2 = r6.f3735g0
            r4 = 0
            r2[r4] = r1
            float r1 = r7.f432E
            r4 = 1
            r2[r4] = r1
            int r1 = r7.f433F
            r6.f3731e0 = r1
            int r1 = r7.f434G
            r6.f3733f0 = r1
            int r1 = r7.f435H
            int r2 = r7.f437J
            int r4 = r7.f439L
            float r5 = r7.f441N
            r6.f3730e = r1
            r6.f3736h = r2
            r6.f3738i = r4
            r6.f3740j = r5
            r2 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r5 = 2
            if (r4 >= 0) goto L_0x0738
            if (r1 != 0) goto L_0x0738
            r6.f3730e = r5
        L_0x0738:
            int r1 = r7.f436I
            int r4 = r7.f438K
            int r8 = r7.f440M
            float r7 = r7.f442O
            r6.f3732f = r1
            r6.f3741k = r4
            r6.f3742l = r8
            r6.f3743m = r7
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0750
            if (r1 != 0) goto L_0x0750
            r6.f3732f = r5
        L_0x0750:
            int r3 = r3 + 1
            r1 = r39
            r2 = r40
            r15 = r18
            goto L_0x0377
        L_0x075a:
            r24 = r3
            r23 = r4
            r22 = r5
            r21 = r6
            r19 = r7
            r20 = r8
        L_0x0766:
            r1 = 1
            goto L_0x0775
        L_0x0768:
            r24 = r3
            r23 = r4
            r22 = r5
            r21 = r6
            r19 = r7
            r20 = r8
            r1 = 0
        L_0x0775:
            int r2 = r0.f422n
            r3 = 8
            r2 = r2 & r3
            if (r2 != r3) goto L_0x077e
            r12 = 1
            goto L_0x077f
        L_0x077e:
            r12 = 0
        L_0x077f:
            if (r12 == 0) goto L_0x0794
            p.f.a.h.e r3 = r0.f416h
            r3.mo5716r()
            p.f.a.h.e r3 = r0.f416h
            r3.mo5711d(r9, r10)
            r38.mo564a(r39, r40)
        L_0x078e:
            r2 = r39
            r3 = r40
            goto L_0x0884
        L_0x0794:
            int r3 = r38.getPaddingTop()
            int r4 = r38.getPaddingBottom()
            int r4 = r4 + r3
            int r3 = r38.getPaddingLeft()
            int r5 = r38.getPaddingRight()
            int r5 = r5 + r3
            int r3 = r38.getChildCount()
            r6 = 0
        L_0x07ab:
            if (r6 >= r3) goto L_0x078e
            android.view.View r7 = r0.getChildAt(r6)
            int r8 = r7.getVisibility()
            r11 = 8
            if (r8 != r11) goto L_0x07bb
            goto L_0x0878
        L_0x07bb:
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.C0064a) r8
            p.f.a.h.d r11 = r8.f475k0
            boolean r13 = r8.f451X
            if (r13 != 0) goto L_0x0878
            boolean r13 = r8.f452Y
            if (r13 == 0) goto L_0x07cd
            goto L_0x0878
        L_0x07cd:
            int r13 = r7.getVisibility()
            r11.f3720Y = r13
            int r13 = r8.width
            int r14 = r8.height
            boolean r15 = r8.f448U
            if (r15 != 0) goto L_0x07fe
            boolean r2 = r8.f449V
            if (r2 != 0) goto L_0x07fe
            if (r15 != 0) goto L_0x07e7
            int r2 = r8.f435H
            r15 = 1
            if (r2 == r15) goto L_0x07fe
            goto L_0x07e8
        L_0x07e7:
            r15 = 1
        L_0x07e8:
            int r2 = r8.width
            r15 = -1
            if (r2 == r15) goto L_0x07fe
            boolean r2 = r8.f449V
            if (r2 != 0) goto L_0x07fc
            int r2 = r8.f436I
            r15 = 1
            if (r2 == r15) goto L_0x07fe
            int r2 = r8.height
            r15 = -1
            if (r2 != r15) goto L_0x07fc
            goto L_0x07fe
        L_0x07fc:
            r2 = 0
            goto L_0x07ff
        L_0x07fe:
            r2 = 1
        L_0x07ff:
            if (r2 == 0) goto L_0x0853
            r2 = r39
            if (r13 != 0) goto L_0x080d
            r15 = -2
            int r13 = android.view.ViewGroup.getChildMeasureSpec(r2, r5, r15)
            r25 = 1
            goto L_0x0826
        L_0x080d:
            r15 = -1
            if (r13 != r15) goto L_0x0818
            int r13 = android.view.ViewGroup.getChildMeasureSpec(r2, r5, r15)
            r15 = -2
            r25 = 0
            goto L_0x0826
        L_0x0818:
            r15 = -2
            if (r13 != r15) goto L_0x081e
            r18 = 1
            goto L_0x0820
        L_0x081e:
            r18 = 0
        L_0x0820:
            int r13 = android.view.ViewGroup.getChildMeasureSpec(r2, r5, r13)
            r25 = r18
        L_0x0826:
            r26 = r3
            if (r14 != 0) goto L_0x0832
            r3 = r40
            int r14 = android.view.ViewGroup.getChildMeasureSpec(r3, r4, r15)
            r15 = 1
            goto L_0x0847
        L_0x0832:
            r15 = -1
            r3 = r40
            if (r14 != r15) goto L_0x083d
            int r14 = android.view.ViewGroup.getChildMeasureSpec(r3, r4, r15)
            r15 = 0
            goto L_0x0847
        L_0x083d:
            r15 = -2
            if (r14 != r15) goto L_0x0842
            r15 = 1
            goto L_0x0843
        L_0x0842:
            r15 = 0
        L_0x0843:
            int r14 = android.view.ViewGroup.getChildMeasureSpec(r3, r4, r14)
        L_0x0847:
            r7.measure(r13, r14)
            int r13 = r7.getMeasuredWidth()
            int r14 = r7.getMeasuredHeight()
            goto L_0x085c
        L_0x0853:
            r2 = r39
            r26 = r3
            r3 = r40
            r15 = 0
            r25 = 0
        L_0x085c:
            r11.mo5701f(r13)
            r11.mo5699e(r14)
            if (r25 == 0) goto L_0x0866
            r11.f3715T = r13
        L_0x0866:
            if (r15 == 0) goto L_0x086a
            r11.f3716U = r14
        L_0x086a:
            boolean r8 = r8.f450W
            if (r8 == 0) goto L_0x087e
            int r7 = r7.getBaseline()
            r8 = -1
            if (r7 == r8) goto L_0x087e
            r11.f3712Q = r7
            goto L_0x087e
        L_0x0878:
            r2 = r39
            r26 = r3
            r3 = r40
        L_0x087e:
            int r6 = r6 + 1
            r3 = r26
            goto L_0x07ab
        L_0x0884:
            r38.mo563a()
            int r4 = r38.getChildCount()
            if (r4 <= 0) goto L_0x0894
            if (r1 == 0) goto L_0x0894
            p.f.a.h.e r1 = r0.f416h
            p124p.p126b.p127k.C1061o.m2504a(r1)
        L_0x0894:
            p.f.a.h.e r1 = r0.f416h
            boolean r4 = r1.f3780x0
            if (r4 == 0) goto L_0x08e1
            boolean r4 = r1.f3781y0
            if (r4 == 0) goto L_0x08b8
            r4 = r24
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r5) goto L_0x08b5
            int r5 = r1.f3762A0
            r6 = r23
            if (r5 >= r6) goto L_0x08ad
            r1.mo5701f(r5)
        L_0x08ad:
            p.f.a.h.e r1 = r0.f416h
            p.f.a.h.d$a r5 = p124p.p144f.p145a.p146h.C1278d.C1279a.FIXED
            r1.mo5686a(r5)
            goto L_0x08bc
        L_0x08b5:
            r6 = r23
            goto L_0x08bc
        L_0x08b8:
            r6 = r23
            r4 = r24
        L_0x08bc:
            p.f.a.h.e r1 = r0.f416h
            boolean r5 = r1.f3782z0
            if (r5 == 0) goto L_0x08dc
            r5 = r22
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r7) goto L_0x08d9
            int r7 = r1.f3763B0
            r8 = r21
            if (r7 >= r8) goto L_0x08d1
            r1.mo5699e(r7)
        L_0x08d1:
            p.f.a.h.e r1 = r0.f416h
            p.f.a.h.d$a r7 = p124p.p144f.p145a.p146h.C1278d.C1279a.FIXED
            r1.mo5691b(r7)
            goto L_0x08e9
        L_0x08d9:
            r8 = r21
            goto L_0x08e9
        L_0x08dc:
            r8 = r21
            r5 = r22
            goto L_0x08e9
        L_0x08e1:
            r8 = r21
            r5 = r22
            r6 = r23
            r4 = r24
        L_0x08e9:
            int r1 = r0.f422n
            r7 = 32
            r1 = r1 & r7
            if (r1 != r7) goto L_0x0942
            p.f.a.h.e r1 = r0.f416h
            int r1 = r1.mo5705j()
            p.f.a.h.e r7 = r0.f416h
            int r7 = r7.mo5696d()
            int r11 = r0.f426r
            if (r11 == r1) goto L_0x090d
            r11 = 1073741824(0x40000000, float:2.0)
            if (r4 != r11) goto L_0x090f
            p.f.a.h.e r4 = r0.f416h
            java.util.List<p.f.a.h.f> r4 = r4.f3779w0
            r13 = 0
            p124p.p126b.p127k.C1061o.m2502a(r4, r13, r1)
            goto L_0x090f
        L_0x090d:
            r11 = 1073741824(0x40000000, float:2.0)
        L_0x090f:
            int r1 = r0.f427s
            if (r1 == r7) goto L_0x091d
            if (r5 != r11) goto L_0x091d
            p.f.a.h.e r1 = r0.f416h
            java.util.List<p.f.a.h.f> r1 = r1.f3779w0
            r4 = 1
            p124p.p126b.p127k.C1061o.m2502a(r1, r4, r7)
        L_0x091d:
            p.f.a.h.e r1 = r0.f416h
            boolean r4 = r1.f3781y0
            if (r4 == 0) goto L_0x092e
            int r4 = r1.f3762A0
            if (r4 <= r6) goto L_0x092e
            java.util.List<p.f.a.h.f> r1 = r1.f3779w0
            r4 = 0
            p124p.p126b.p127k.C1061o.m2502a(r1, r4, r6)
            goto L_0x092f
        L_0x092e:
            r4 = 0
        L_0x092f:
            p.f.a.h.e r1 = r0.f416h
            boolean r5 = r1.f3782z0
            if (r5 == 0) goto L_0x0940
            int r5 = r1.f3763B0
            if (r5 <= r8) goto L_0x0940
            java.util.List<p.f.a.h.f> r1 = r1.f3779w0
            r5 = 1
            p124p.p126b.p127k.C1061o.m2502a(r1, r5, r8)
            goto L_0x0944
        L_0x0940:
            r5 = 1
            goto L_0x0944
        L_0x0942:
            r4 = 0
            goto L_0x0940
        L_0x0944:
            int r1 = r38.getChildCount()
            if (r1 <= 0) goto L_0x094f
            p.f.a.h.e r1 = r0.f416h
            r1.mo5714p()
        L_0x094f:
            java.util.ArrayList<p.f.a.h.d> r1 = r0.f415g
            int r1 = r1.size()
            int r6 = r38.getPaddingBottom()
            int r6 = r6 + r20
            int r7 = r38.getPaddingRight()
            int r7 = r7 + r19
            if (r1 <= 0) goto L_0x0b50
            p.f.a.h.e r8 = r0.f416h
            p.f.a.h.d$a r8 = r8.mo5698e()
            p.f.a.h.d$a r11 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
            if (r8 != r11) goto L_0x096f
            r8 = r5
            goto L_0x0970
        L_0x096f:
            r8 = r4
        L_0x0970:
            p.f.a.h.e r11 = r0.f416h
            p.f.a.h.d$a r11 = r11.mo5704i()
            p.f.a.h.d$a r13 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
            if (r11 != r13) goto L_0x097c
            r11 = r5
            goto L_0x097d
        L_0x097c:
            r11 = r4
        L_0x097d:
            p.f.a.h.e r13 = r0.f416h
            int r13 = r13.mo5705j()
            int r14 = r0.f417i
            int r13 = java.lang.Math.max(r13, r14)
            p.f.a.h.e r14 = r0.f416h
            int r14 = r14.mo5696d()
            int r15 = r0.f418j
            int r14 = java.lang.Math.max(r14, r15)
            r15 = r4
            r5 = r14
            r14 = r15
            r4 = r13
            r13 = r14
        L_0x099a:
            r17 = r1
            if (r13 >= r1) goto L_0x0ab7
            java.util.ArrayList<p.f.a.h.d> r1 = r0.f415g
            java.lang.Object r1 = r1.get(r13)
            p.f.a.h.d r1 = (p124p.p144f.p145a.p146h.C1278d) r1
            r19 = r10
            java.lang.Object r10 = r1.f3719X
            android.view.View r10 = (android.view.View) r10
            if (r10 != 0) goto L_0x09b2
            r21 = r9
            goto L_0x0aa3
        L_0x09b2:
            android.view.ViewGroup$LayoutParams r20 = r10.getLayoutParams()
            r21 = r9
            r9 = r20
            androidx.constraintlayout.widget.ConstraintLayout$a r9 = (androidx.constraintlayout.widget.ConstraintLayout.C0064a) r9
            boolean r0 = r9.f452Y
            if (r0 != 0) goto L_0x0aa3
            boolean r0 = r9.f451X
            if (r0 == 0) goto L_0x09c6
            goto L_0x0aa3
        L_0x09c6:
            int r0 = r10.getVisibility()
            r20 = r14
            r14 = 8
            if (r0 != r14) goto L_0x09d1
            goto L_0x09e7
        L_0x09d1:
            if (r12 == 0) goto L_0x09ea
            p.f.a.h.k r0 = r1.mo5702g()
            boolean r0 = r0.mo5735c()
            if (r0 == 0) goto L_0x09ea
            p.f.a.h.k r0 = r1.mo5700f()
            boolean r0 = r0.mo5735c()
            if (r0 == 0) goto L_0x09ea
        L_0x09e7:
            r2 = -1
            goto L_0x0aa7
        L_0x09ea:
            int r0 = r9.width
            r14 = -2
            if (r0 != r14) goto L_0x09f8
            boolean r14 = r9.f448U
            if (r14 == 0) goto L_0x09f8
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r2, r7, r0)
            goto L_0x0a02
        L_0x09f8:
            int r0 = r1.mo5705j()
            r14 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r14)
        L_0x0a02:
            int r14 = r9.height
            r2 = -2
            if (r14 != r2) goto L_0x0a10
            boolean r2 = r9.f449V
            if (r2 == 0) goto L_0x0a10
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r3, r6, r14)
            goto L_0x0a1a
        L_0x0a10:
            int r2 = r1.mo5696d()
            r14 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r14)
        L_0x0a1a:
            r10.measure(r0, r2)
            int r0 = r10.getMeasuredWidth()
            int r2 = r10.getMeasuredHeight()
            int r14 = r1.mo5705j()
            if (r0 == r14) goto L_0x0a54
            r1.mo5701f(r0)
            if (r12 == 0) goto L_0x0a37
            p.f.a.h.k r14 = r1.mo5702g()
            r14.mo5732a(r0)
        L_0x0a37:
            if (r8 == 0) goto L_0x0a52
            int r0 = r1.mo5703h()
            if (r0 <= r4) goto L_0x0a52
            int r0 = r1.mo5703h()
            p.f.a.h.c$c r14 = p124p.p144f.p145a.p146h.C1274c.C1277c.RIGHT
            p.f.a.h.c r14 = r1.mo5680a(r14)
            int r14 = r14.mo5674a()
            int r14 = r14 + r0
            int r4 = java.lang.Math.max(r4, r14)
        L_0x0a52:
            r20 = 1
        L_0x0a54:
            int r0 = r1.mo5696d()
            if (r2 == r0) goto L_0x0a84
            r1.mo5699e(r2)
            if (r12 == 0) goto L_0x0a66
            p.f.a.h.k r0 = r1.mo5700f()
            r0.mo5732a(r2)
        L_0x0a66:
            if (r11 == 0) goto L_0x0a82
            int r0 = r1.mo5692c()
            if (r0 <= r5) goto L_0x0a82
            int r0 = r1.mo5692c()
            p.f.a.h.c$c r2 = p124p.p144f.p145a.p146h.C1274c.C1277c.BOTTOM
            p.f.a.h.c r2 = r1.mo5680a(r2)
            int r2 = r2.mo5674a()
            int r2 = r2 + r0
            int r0 = java.lang.Math.max(r5, r2)
            r5 = r0
        L_0x0a82:
            r20 = 1
        L_0x0a84:
            boolean r0 = r9.f450W
            if (r0 == 0) goto L_0x0a98
            int r0 = r10.getBaseline()
            r2 = -1
            if (r0 == r2) goto L_0x0a99
            int r9 = r1.f3712Q
            if (r0 == r9) goto L_0x0a99
            r1.f3712Q = r0
            r20 = 1
            goto L_0x0a99
        L_0x0a98:
            r2 = -1
        L_0x0a99:
            int r0 = r10.getMeasuredState()
            int r0 = android.view.ViewGroup.combineMeasuredStates(r15, r0)
            r15 = r0
            goto L_0x0aa7
        L_0x0aa3:
            r20 = r14
            goto L_0x09e7
        L_0x0aa7:
            r14 = r20
            int r13 = r13 + 1
            r0 = r38
            r2 = r39
            r1 = r17
            r10 = r19
            r9 = r21
            goto L_0x099a
        L_0x0ab7:
            r21 = r9
            r19 = r10
            r20 = r14
            r0 = r38
            if (r20 == 0) goto L_0x0b02
            p.f.a.h.e r1 = r0.f416h
            r2 = r21
            r1.mo5701f(r2)
            p.f.a.h.e r1 = r0.f416h
            r2 = r19
            r1.mo5699e(r2)
            if (r12 == 0) goto L_0x0ad6
            p.f.a.h.e r1 = r0.f416h
            r1.mo5718t()
        L_0x0ad6:
            p.f.a.h.e r1 = r0.f416h
            r1.mo5714p()
            p.f.a.h.e r1 = r0.f416h
            int r1 = r1.mo5705j()
            if (r1 >= r4) goto L_0x0aea
            p.f.a.h.e r1 = r0.f416h
            r1.mo5701f(r4)
            r12 = 1
            goto L_0x0aeb
        L_0x0aea:
            r12 = 0
        L_0x0aeb:
            p.f.a.h.e r1 = r0.f416h
            int r1 = r1.mo5696d()
            if (r1 >= r5) goto L_0x0afa
            p.f.a.h.e r1 = r0.f416h
            r1.mo5699e(r5)
            r13 = 1
            goto L_0x0afb
        L_0x0afa:
            r13 = r12
        L_0x0afb:
            if (r13 == 0) goto L_0x0b02
            p.f.a.h.e r1 = r0.f416h
            r1.mo5714p()
        L_0x0b02:
            r1 = r17
            r12 = 0
        L_0x0b05:
            if (r12 >= r1) goto L_0x0b4e
            java.util.ArrayList<p.f.a.h.d> r2 = r0.f415g
            java.lang.Object r2 = r2.get(r12)
            p.f.a.h.d r2 = (p124p.p144f.p145a.p146h.C1278d) r2
            java.lang.Object r4 = r2.f3719X
            android.view.View r4 = (android.view.View) r4
            if (r4 != 0) goto L_0x0b16
            goto L_0x0b2b
        L_0x0b16:
            int r5 = r4.getMeasuredWidth()
            int r8 = r2.mo5705j()
            if (r5 != r8) goto L_0x0b30
            int r5 = r4.getMeasuredHeight()
            int r8 = r2.mo5696d()
            if (r5 == r8) goto L_0x0b2b
            goto L_0x0b30
        L_0x0b2b:
            r8 = 8
        L_0x0b2d:
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x0b4b
        L_0x0b30:
            int r5 = r2.f3720Y
            r8 = 8
            if (r5 == r8) goto L_0x0b2d
            int r5 = r2.mo5705j()
            r9 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r9)
            int r2 = r2.mo5696d()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r9)
            r4.measure(r5, r2)
        L_0x0b4b:
            int r12 = r12 + 1
            goto L_0x0b05
        L_0x0b4e:
            r12 = r15
            goto L_0x0b51
        L_0x0b50:
            r12 = 0
        L_0x0b51:
            p.f.a.h.e r1 = r0.f416h
            int r1 = r1.mo5705j()
            int r1 = r1 + r7
            p.f.a.h.e r2 = r0.f416h
            int r2 = r2.mo5696d()
            int r2 = r2 + r6
            r4 = r39
            int r1 = android.view.ViewGroup.resolveSizeAndState(r1, r4, r12)
            int r4 = r12 << 16
            int r2 = android.view.ViewGroup.resolveSizeAndState(r2, r3, r4)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r2 = r2 & r3
            int r3 = r0.f419k
            int r1 = java.lang.Math.min(r3, r1)
            int r3 = r0.f420l
            int r2 = java.lang.Math.min(r3, r2)
            p.f.a.h.e r3 = r0.f416h
            boolean r3 = r3.f3766E0
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r3 == 0) goto L_0x0b85
            r1 = r1 | r4
        L_0x0b85:
            p.f.a.h.e r3 = r0.f416h
            boolean r3 = r3.f3767F0
            if (r3 == 0) goto L_0x0b8c
            r2 = r2 | r4
        L_0x0b8c:
            r0.setMeasuredDimension(r1, r2)
            r0.f426r = r1
            r0.f427s = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C1278d a = mo562a(view);
        if ((view instanceof C1297e) && !(a instanceof C1282g)) {
            C0064a aVar = (C0064a) view.getLayoutParams();
            C1282g gVar = new C1282g();
            aVar.f475k0 = gVar;
            aVar.f451X = true;
            gVar.mo5722g(aVar.f445R);
        }
        if (view instanceof C1292b) {
            C1292b bVar = (C1292b) view;
            bVar.mo5740a();
            ((C0064a) view.getLayoutParams()).f452Y = true;
            if (!this.f414f.contains(bVar)) {
                this.f414f.add(bVar);
            }
        }
        this.f413e.put(view.getId(), view);
        this.f421m = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f413e.remove(view.getId());
        C1278d a = mo562a(view);
        this.f416h.f3827k0.remove(a);
        a.f3699D = null;
        this.f414f.remove(view);
        this.f415g.remove(a);
        this.f421m = true;
    }

    public void removeView(View view) {
        super.removeView(view);
    }

    public void requestLayout() {
        super.requestLayout();
        this.f421m = true;
        this.f426r = -1;
        this.f427s = -1;
    }

    public void setConstraintSet(C1293c cVar) {
        this.f423o = cVar;
    }

    public void setId(int i) {
        this.f413e.remove(getId());
        super.setId(i);
        this.f413e.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f420l) {
            this.f420l = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f419k) {
            this.f419k = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f418j) {
            this.f418j = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f417i) {
            this.f417i = i;
            requestLayout();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f416h.f3764C0 = i;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x029e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo564a(int r23, int r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            int r3 = r22.getPaddingTop()
            int r4 = r22.getPaddingBottom()
            int r4 = r4 + r3
            int r3 = r22.getPaddingLeft()
            int r5 = r22.getPaddingRight()
            int r5 = r5 + r3
            int r3 = r22.getChildCount()
            r7 = 0
        L_0x001d:
            r8 = 8
            r9 = -1
            r10 = -2
            if (r7 >= r3) goto L_0x00b2
            android.view.View r12 = r0.getChildAt(r7)
            int r13 = r12.getVisibility()
            if (r13 != r8) goto L_0x002f
            goto L_0x00ae
        L_0x002f:
            android.view.ViewGroup$LayoutParams r8 = r12.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.C0064a) r8
            p.f.a.h.d r13 = r8.f475k0
            boolean r14 = r8.f451X
            if (r14 != 0) goto L_0x00ae
            boolean r14 = r8.f452Y
            if (r14 == 0) goto L_0x0041
            goto L_0x00ae
        L_0x0041:
            int r14 = r12.getVisibility()
            r13.f3720Y = r14
            int r14 = r8.width
            int r15 = r8.height
            if (r14 == 0) goto L_0x00a0
            if (r15 != 0) goto L_0x0050
            goto L_0x00a0
        L_0x0050:
            if (r14 != r10) goto L_0x0055
            r16 = 1
            goto L_0x0057
        L_0x0055:
            r16 = 0
        L_0x0057:
            int r14 = android.view.ViewGroup.getChildMeasureSpec(r1, r5, r14)
            if (r15 != r10) goto L_0x005f
            r11 = 1
            goto L_0x0060
        L_0x005f:
            r11 = 0
        L_0x0060:
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r2, r4, r15)
            r12.measure(r14, r10)
            int r10 = r12.getMeasuredWidth()
            int r14 = r12.getMeasuredHeight()
            r13.mo5701f(r10)
            r13.mo5699e(r14)
            if (r16 == 0) goto L_0x0079
            r13.f3715T = r10
        L_0x0079:
            if (r11 == 0) goto L_0x007d
            r13.f3716U = r14
        L_0x007d:
            boolean r11 = r8.f450W
            if (r11 == 0) goto L_0x0089
            int r11 = r12.getBaseline()
            if (r11 == r9) goto L_0x0089
            r13.f3712Q = r11
        L_0x0089:
            boolean r9 = r8.f448U
            if (r9 == 0) goto L_0x00ae
            boolean r8 = r8.f449V
            if (r8 == 0) goto L_0x00ae
            p.f.a.h.k r8 = r13.mo5702g()
            r8.mo5732a(r10)
            p.f.a.h.k r8 = r13.mo5700f()
            r8.mo5732a(r14)
            goto L_0x00ae
        L_0x00a0:
            p.f.a.h.k r8 = r13.mo5702g()
            r8.mo5734b()
            p.f.a.h.k r8 = r13.mo5700f()
            r8.mo5734b()
        L_0x00ae:
            int r7 = r7 + 1
            goto L_0x001d
        L_0x00b2:
            p.f.a.h.e r7 = r0.f416h
            r7.mo5718t()
            r7 = 0
        L_0x00b8:
            if (r7 >= r3) goto L_0x02b5
            android.view.View r12 = r0.getChildAt(r7)
            int r13 = r12.getVisibility()
            if (r13 != r8) goto L_0x00c6
            goto L_0x02a0
        L_0x00c6:
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r13 = (androidx.constraintlayout.widget.ConstraintLayout.C0064a) r13
            p.f.a.h.d r14 = r13.f475k0
            boolean r15 = r13.f451X
            if (r15 != 0) goto L_0x02a0
            boolean r15 = r13.f452Y
            if (r15 == 0) goto L_0x00d8
            goto L_0x02a0
        L_0x00d8:
            int r15 = r12.getVisibility()
            r14.f3720Y = r15
            int r15 = r13.width
            int r8 = r13.height
            if (r15 == 0) goto L_0x00e8
            if (r8 == 0) goto L_0x00e8
            goto L_0x02a0
        L_0x00e8:
            p.f.a.h.c$c r11 = p124p.p144f.p145a.p146h.C1274c.C1277c.LEFT
            p.f.a.h.c r11 = r14.mo5680a(r11)
            p.f.a.h.j r11 = r11.f3669a
            p.f.a.h.c$c r9 = p124p.p144f.p145a.p146h.C1274c.C1277c.RIGHT
            p.f.a.h.c r9 = r14.mo5680a(r9)
            p.f.a.h.j r9 = r9.f3669a
            p.f.a.h.c$c r10 = p124p.p144f.p145a.p146h.C1274c.C1277c.LEFT
            p.f.a.h.c r10 = r14.mo5680a(r10)
            p.f.a.h.c r10 = r10.f3672d
            if (r10 == 0) goto L_0x010e
            p.f.a.h.c$c r10 = p124p.p144f.p145a.p146h.C1274c.C1277c.RIGHT
            p.f.a.h.c r10 = r14.mo5680a(r10)
            p.f.a.h.c r10 = r10.f3672d
            if (r10 == 0) goto L_0x010e
            r10 = 1
            goto L_0x010f
        L_0x010e:
            r10 = 0
        L_0x010f:
            p.f.a.h.c$c r6 = p124p.p144f.p145a.p146h.C1274c.C1277c.TOP
            p.f.a.h.c r6 = r14.mo5680a(r6)
            p.f.a.h.j r6 = r6.f3669a
            r18 = r3
            p.f.a.h.c$c r3 = p124p.p144f.p145a.p146h.C1274c.C1277c.BOTTOM
            p.f.a.h.c r3 = r14.mo5680a(r3)
            p.f.a.h.j r3 = r3.f3669a
            r19 = r7
            p.f.a.h.c$c r7 = p124p.p144f.p145a.p146h.C1274c.C1277c.TOP
            p.f.a.h.c r7 = r14.mo5680a(r7)
            p.f.a.h.c r7 = r7.f3672d
            if (r7 == 0) goto L_0x0139
            p.f.a.h.c$c r7 = p124p.p144f.p145a.p146h.C1274c.C1277c.BOTTOM
            p.f.a.h.c r7 = r14.mo5680a(r7)
            p.f.a.h.c r7 = r7.f3672d
            if (r7 == 0) goto L_0x0139
            r7 = 1
            goto L_0x013a
        L_0x0139:
            r7 = 0
        L_0x013a:
            if (r15 != 0) goto L_0x0146
            if (r8 != 0) goto L_0x0146
            if (r10 == 0) goto L_0x0146
            if (r7 == 0) goto L_0x0146
            r3 = -2
            r6 = -1
            goto L_0x02a6
        L_0x0146:
            r20 = r13
            p.f.a.h.e r13 = r0.f416h
            p.f.a.h.d$a r13 = r13.mo5698e()
            r21 = r12
            p.f.a.h.d$a r12 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
            if (r13 == r12) goto L_0x0156
            r12 = 1
            goto L_0x0157
        L_0x0156:
            r12 = 0
        L_0x0157:
            p.f.a.h.e r13 = r0.f416h
            p.f.a.h.d$a r13 = r13.mo5704i()
            p.f.a.h.d$a r0 = p124p.p144f.p145a.p146h.C1278d.C1279a.WRAP_CONTENT
            if (r13 == r0) goto L_0x0163
            r0 = 1
            goto L_0x0164
        L_0x0163:
            r0 = 0
        L_0x0164:
            if (r12 != 0) goto L_0x016d
            p.f.a.h.k r13 = r14.mo5702g()
            r13.mo5734b()
        L_0x016d:
            if (r0 != 0) goto L_0x0176
            p.f.a.h.k r13 = r14.mo5700f()
            r13.mo5734b()
        L_0x0176:
            r13 = 0
            if (r15 != 0) goto L_0x01cc
            if (r12 == 0) goto L_0x01c1
            int r15 = r14.f3730e
            if (r15 != 0) goto L_0x0199
            float r15 = r14.f3702G
            int r15 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x0199
            int r15 = r14.f3736h
            if (r15 != 0) goto L_0x0199
            int r15 = r14.f3738i
            if (r15 != 0) goto L_0x0199
            p.f.a.h.d$a[] r15 = r14.f3698C
            r17 = 0
            r15 = r15[r17]
            p.f.a.h.d$a r13 = p124p.p144f.p145a.p146h.C1278d.C1279a.MATCH_CONSTRAINT
            if (r15 != r13) goto L_0x019b
            r13 = 1
            goto L_0x019d
        L_0x0199:
            r17 = 0
        L_0x019b:
            r13 = r17
        L_0x019d:
            if (r13 == 0) goto L_0x01c3
            if (r10 == 0) goto L_0x01c3
            boolean r10 = r11.mo5735c()
            if (r10 == 0) goto L_0x01c3
            boolean r10 = r9.mo5735c()
            if (r10 == 0) goto L_0x01c3
            float r9 = r9.f3807g
            float r10 = r11.f3807g
            float r9 = r9 - r10
            int r9 = (int) r9
            p.f.a.h.k r10 = r14.mo5702g()
            r10.mo5732a(r9)
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r1, r5, r9)
            r11 = r9
            r9 = -2
            goto L_0x01d6
        L_0x01c1:
            r17 = 0
        L_0x01c3:
            r9 = -2
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r1, r5, r9)
            r12 = r17
            r9 = 1
            goto L_0x01e4
        L_0x01cc:
            r9 = -2
            r10 = -1
            r17 = 0
            if (r15 != r10) goto L_0x01da
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r1, r5, r10)
        L_0x01d6:
            r10 = r11
            r9 = r17
            goto L_0x01e4
        L_0x01da:
            if (r15 != r9) goto L_0x01de
            r9 = 1
            goto L_0x01e0
        L_0x01de:
            r9 = r17
        L_0x01e0:
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r1, r5, r15)
        L_0x01e4:
            if (r8 != 0) goto L_0x023c
            if (r0 == 0) goto L_0x0231
            int r8 = r14.f3732f
            if (r8 != 0) goto L_0x0206
            float r8 = r14.f3702G
            r11 = 0
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x0206
            int r8 = r14.f3741k
            if (r8 != 0) goto L_0x0206
            int r8 = r14.f3742l
            if (r8 != 0) goto L_0x0206
            p.f.a.h.d$a[] r8 = r14.f3698C
            r11 = 1
            r8 = r8[r11]
            p.f.a.h.d$a r13 = p124p.p144f.p145a.p146h.C1278d.C1279a.MATCH_CONSTRAINT
            if (r8 != r13) goto L_0x0207
            r8 = r11
            goto L_0x0209
        L_0x0206:
            r11 = 1
        L_0x0207:
            r8 = r17
        L_0x0209:
            if (r8 == 0) goto L_0x0232
            if (r7 == 0) goto L_0x0232
            boolean r7 = r6.mo5735c()
            if (r7 == 0) goto L_0x0232
            boolean r7 = r3.mo5735c()
            if (r7 == 0) goto L_0x0232
            float r3 = r3.f3807g
            float r6 = r6.f3807g
            float r3 = r3 - r6
            int r3 = (int) r3
            p.f.a.h.k r6 = r14.mo5700f()
            r6.mo5732a(r3)
            int r3 = android.view.ViewGroup.getChildMeasureSpec(r2, r4, r3)
            r7 = r3
            r6 = r17
            r8 = r21
            r3 = -2
            goto L_0x0254
        L_0x0231:
            r11 = 1
        L_0x0232:
            r3 = -2
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r2, r4, r3)
            r7 = r0
            r6 = r11
            r0 = r17
            goto L_0x0252
        L_0x023c:
            r3 = -2
            r6 = -1
            r11 = 1
            if (r8 != r6) goto L_0x0248
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r2, r4, r6)
            r6 = r17
            goto L_0x0252
        L_0x0248:
            if (r8 != r3) goto L_0x024c
            r6 = r11
            goto L_0x024e
        L_0x024c:
            r6 = r17
        L_0x024e:
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r2, r4, r8)
        L_0x0252:
            r8 = r21
        L_0x0254:
            r8.measure(r10, r7)
            int r7 = r8.getMeasuredWidth()
            int r10 = r8.getMeasuredHeight()
            r14.mo5701f(r7)
            r14.mo5699e(r10)
            if (r9 == 0) goto L_0x0269
            r14.f3715T = r7
        L_0x0269:
            if (r6 == 0) goto L_0x026d
            r14.f3716U = r10
        L_0x026d:
            r6 = 2
            if (r12 == 0) goto L_0x0278
            p.f.a.h.k r9 = r14.mo5702g()
            r9.mo5732a(r7)
            goto L_0x027e
        L_0x0278:
            p.f.a.h.k r7 = r14.mo5702g()
            r7.f3816b = r6
        L_0x027e:
            if (r0 == 0) goto L_0x0288
            p.f.a.h.k r0 = r14.mo5700f()
            r0.mo5732a(r10)
            goto L_0x028e
        L_0x0288:
            p.f.a.h.k r0 = r14.mo5700f()
            r0.f3816b = r6
        L_0x028e:
            r13 = r20
            boolean r0 = r13.f450W
            if (r0 == 0) goto L_0x029e
            int r0 = r8.getBaseline()
            r6 = -1
            if (r0 == r6) goto L_0x02a9
            r14.f3712Q = r0
            goto L_0x02a9
        L_0x029e:
            r6 = -1
            goto L_0x02a9
        L_0x02a0:
            r18 = r3
            r19 = r7
            r6 = r9
            r3 = r10
        L_0x02a6:
            r11 = 1
            r17 = 0
        L_0x02a9:
            int r7 = r19 + 1
            r8 = 8
            r0 = r22
            r10 = r3
            r9 = r6
            r3 = r18
            goto L_0x00b8
        L_0x02b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo564a(int, int):void");
    }

    /* renamed from: a */
    public final void mo563a() {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof C1298f) {
                C1298f fVar = (C1298f) childAt;
                if (fVar.f3929f != null) {
                    C0064a aVar = (C0064a) fVar.getLayoutParams();
                    C0064a aVar2 = (C0064a) fVar.f3929f.getLayoutParams();
                    C1278d dVar = aVar2.f475k0;
                    dVar.f3720Y = 0;
                    aVar.f475k0.mo5701f(dVar.mo5705j());
                    aVar.f475k0.mo5699e(aVar2.f475k0.mo5696d());
                    aVar2.f475k0.f3720Y = 8;
                }
            }
        }
        int size = this.f414f.size();
        if (size > 0) {
            while (i < size) {
                if (((C1292b) this.f414f.get(i)) != null) {
                    i++;
                } else {
                    throw null;
                }
            }
        }
    }
}
