package p124p.p144f.p147b;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.C0064a;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import p124p.p144f.p147b.C1295d.C1296a;

/* renamed from: p.f.b.c */
public class C1293c {

    /* renamed from: b */
    public static final int[] f3837b = {0, 4, 8};

    /* renamed from: c */
    public static SparseIntArray f3838c;

    /* renamed from: a */
    public HashMap<Integer, C1294a> f3839a = new HashMap<>();

    /* renamed from: p.f.b.c$a */
    public static class C1294a {

        /* renamed from: A */
        public int f3840A = -1;

        /* renamed from: B */
        public int f3841B = -1;

        /* renamed from: C */
        public int f3842C = -1;

        /* renamed from: D */
        public int f3843D = -1;

        /* renamed from: E */
        public int f3844E = -1;

        /* renamed from: F */
        public int f3845F = -1;

        /* renamed from: G */
        public int f3846G = -1;

        /* renamed from: H */
        public int f3847H = -1;

        /* renamed from: I */
        public int f3848I = -1;

        /* renamed from: J */
        public int f3849J = 0;

        /* renamed from: K */
        public int f3850K = -1;

        /* renamed from: L */
        public int f3851L = -1;

        /* renamed from: M */
        public int f3852M = -1;

        /* renamed from: N */
        public int f3853N = -1;

        /* renamed from: O */
        public int f3854O = -1;

        /* renamed from: P */
        public int f3855P = -1;

        /* renamed from: Q */
        public float f3856Q = 0.0f;

        /* renamed from: R */
        public float f3857R = 0.0f;

        /* renamed from: S */
        public int f3858S = 0;

        /* renamed from: T */
        public int f3859T = 0;

        /* renamed from: U */
        public float f3860U = 1.0f;

        /* renamed from: V */
        public boolean f3861V = false;

        /* renamed from: W */
        public float f3862W = 0.0f;

        /* renamed from: X */
        public float f3863X = 0.0f;

        /* renamed from: Y */
        public float f3864Y = 0.0f;

        /* renamed from: Z */
        public float f3865Z = 0.0f;

        /* renamed from: a */
        public boolean f3866a = false;

        /* renamed from: a0 */
        public float f3867a0 = 1.0f;

        /* renamed from: b */
        public int f3868b;

        /* renamed from: b0 */
        public float f3869b0 = 1.0f;

        /* renamed from: c */
        public int f3870c;

        /* renamed from: c0 */
        public float f3871c0 = Float.NaN;

        /* renamed from: d */
        public int f3872d;

        /* renamed from: d0 */
        public float f3873d0 = Float.NaN;

        /* renamed from: e */
        public int f3874e = -1;

        /* renamed from: e0 */
        public float f3875e0 = 0.0f;

        /* renamed from: f */
        public int f3876f = -1;

        /* renamed from: f0 */
        public float f3877f0 = 0.0f;

        /* renamed from: g */
        public float f3878g = -1.0f;

        /* renamed from: g0 */
        public float f3879g0 = 0.0f;

        /* renamed from: h */
        public int f3880h = -1;

        /* renamed from: h0 */
        public boolean f3881h0 = false;

        /* renamed from: i */
        public int f3882i = -1;

        /* renamed from: i0 */
        public boolean f3883i0 = false;

        /* renamed from: j */
        public int f3884j = -1;

        /* renamed from: j0 */
        public int f3885j0 = 0;

        /* renamed from: k */
        public int f3886k = -1;

        /* renamed from: k0 */
        public int f3887k0 = 0;

        /* renamed from: l */
        public int f3888l = -1;

        /* renamed from: l0 */
        public int f3889l0 = -1;

        /* renamed from: m */
        public int f3890m = -1;

        /* renamed from: m0 */
        public int f3891m0 = -1;

        /* renamed from: n */
        public int f3892n = -1;

        /* renamed from: n0 */
        public int f3893n0 = -1;

        /* renamed from: o */
        public int f3894o = -1;

        /* renamed from: o0 */
        public int f3895o0 = -1;

        /* renamed from: p */
        public int f3896p = -1;

        /* renamed from: p0 */
        public float f3897p0 = 1.0f;

        /* renamed from: q */
        public int f3898q = -1;

        /* renamed from: q0 */
        public float f3899q0 = 1.0f;

        /* renamed from: r */
        public int f3900r = -1;

        /* renamed from: r0 */
        public boolean f3901r0 = false;

        /* renamed from: s */
        public int f3902s = -1;

        /* renamed from: s0 */
        public int f3903s0 = -1;

        /* renamed from: t */
        public int f3904t = -1;

        /* renamed from: t0 */
        public int f3905t0 = -1;

        /* renamed from: u */
        public float f3906u = 0.5f;

        /* renamed from: u0 */
        public int[] f3907u0;

        /* renamed from: v */
        public float f3908v = 0.5f;

        /* renamed from: v0 */
        public String f3909v0;

        /* renamed from: w */
        public String f3910w = null;

        /* renamed from: x */
        public int f3911x = -1;

        /* renamed from: y */
        public int f3912y = 0;

        /* renamed from: z */
        public float f3913z = 0.0f;

        /* renamed from: a */
        public final void mo5751a(int i, C1296a aVar) {
            this.f3872d = i;
            this.f3880h = aVar.f460d;
            this.f3882i = aVar.f462e;
            this.f3884j = aVar.f464f;
            this.f3886k = aVar.f466g;
            this.f3888l = aVar.f468h;
            this.f3890m = aVar.f470i;
            this.f3892n = aVar.f472j;
            this.f3894o = aVar.f474k;
            this.f3896p = aVar.f476l;
            this.f3898q = aVar.f481p;
            this.f3900r = aVar.f482q;
            this.f3902s = aVar.f483r;
            this.f3904t = aVar.f484s;
            this.f3906u = aVar.f491z;
            this.f3908v = aVar.f428A;
            this.f3910w = aVar.f429B;
            this.f3911x = aVar.f478m;
            this.f3912y = aVar.f479n;
            this.f3913z = aVar.f480o;
            this.f3840A = aVar.f443P;
            this.f3841B = aVar.f444Q;
            this.f3842C = aVar.f445R;
            this.f3878g = aVar.f458c;
            this.f3874e = aVar.f454a;
            this.f3876f = aVar.f456b;
            this.f3868b = aVar.width;
            this.f3870c = aVar.height;
            this.f3843D = aVar.leftMargin;
            this.f3844E = aVar.rightMargin;
            this.f3845F = aVar.topMargin;
            this.f3846G = aVar.bottomMargin;
            this.f3856Q = aVar.f432E;
            this.f3857R = aVar.f431D;
            this.f3859T = aVar.f434G;
            this.f3858S = aVar.f433F;
            boolean z = aVar.f446S;
            this.f3881h0 = z;
            this.f3883i0 = aVar.f447T;
            this.f3885j0 = aVar.f435H;
            this.f3887k0 = aVar.f436I;
            this.f3881h0 = z;
            this.f3889l0 = aVar.f439L;
            this.f3891m0 = aVar.f440M;
            this.f3893n0 = aVar.f437J;
            this.f3895o0 = aVar.f438K;
            this.f3897p0 = aVar.f441N;
            this.f3899q0 = aVar.f442O;
            this.f3847H = aVar.getMarginEnd();
            this.f3848I = aVar.getMarginStart();
            this.f3860U = aVar.f3915m0;
            this.f3863X = aVar.f3918p0;
            this.f3864Y = aVar.f3919q0;
            this.f3865Z = aVar.f3920r0;
            this.f3867a0 = aVar.f3921s0;
            this.f3869b0 = aVar.f3922t0;
            this.f3871c0 = aVar.f3923u0;
            this.f3873d0 = aVar.f3924v0;
            this.f3875e0 = aVar.f3925w0;
            this.f3877f0 = aVar.f3926x0;
            this.f3879g0 = aVar.f3927y0;
            this.f3862W = aVar.f3917o0;
            this.f3861V = aVar.f3916n0;
        }

        /* renamed from: a */
        public void mo5752a(C0064a aVar) {
            aVar.f460d = this.f3880h;
            aVar.f462e = this.f3882i;
            aVar.f464f = this.f3884j;
            aVar.f466g = this.f3886k;
            aVar.f468h = this.f3888l;
            aVar.f470i = this.f3890m;
            aVar.f472j = this.f3892n;
            aVar.f474k = this.f3894o;
            aVar.f476l = this.f3896p;
            aVar.f481p = this.f3898q;
            aVar.f482q = this.f3900r;
            aVar.f483r = this.f3902s;
            aVar.f484s = this.f3904t;
            aVar.leftMargin = this.f3843D;
            aVar.rightMargin = this.f3844E;
            aVar.topMargin = this.f3845F;
            aVar.bottomMargin = this.f3846G;
            aVar.f489x = this.f3855P;
            aVar.f490y = this.f3854O;
            aVar.f491z = this.f3906u;
            aVar.f428A = this.f3908v;
            aVar.f478m = this.f3911x;
            aVar.f479n = this.f3912y;
            aVar.f480o = this.f3913z;
            aVar.f429B = this.f3910w;
            aVar.f443P = this.f3840A;
            aVar.f444Q = this.f3841B;
            aVar.f432E = this.f3856Q;
            aVar.f431D = this.f3857R;
            aVar.f434G = this.f3859T;
            aVar.f433F = this.f3858S;
            aVar.f446S = this.f3881h0;
            aVar.f447T = this.f3883i0;
            aVar.f435H = this.f3885j0;
            aVar.f436I = this.f3887k0;
            aVar.f439L = this.f3889l0;
            aVar.f440M = this.f3891m0;
            aVar.f437J = this.f3893n0;
            aVar.f438K = this.f3895o0;
            aVar.f441N = this.f3897p0;
            aVar.f442O = this.f3899q0;
            aVar.f445R = this.f3842C;
            aVar.f458c = this.f3878g;
            aVar.f454a = this.f3874e;
            aVar.f456b = this.f3876f;
            aVar.width = this.f3868b;
            aVar.height = this.f3870c;
            aVar.setMarginStart(this.f3848I);
            aVar.setMarginEnd(this.f3847H);
            aVar.mo592a();
        }

        public Object clone() {
            C1294a aVar = new C1294a();
            aVar.f3866a = this.f3866a;
            aVar.f3868b = this.f3868b;
            aVar.f3870c = this.f3870c;
            aVar.f3874e = this.f3874e;
            aVar.f3876f = this.f3876f;
            aVar.f3878g = this.f3878g;
            aVar.f3880h = this.f3880h;
            aVar.f3882i = this.f3882i;
            aVar.f3884j = this.f3884j;
            aVar.f3886k = this.f3886k;
            aVar.f3888l = this.f3888l;
            aVar.f3890m = this.f3890m;
            aVar.f3892n = this.f3892n;
            aVar.f3894o = this.f3894o;
            aVar.f3896p = this.f3896p;
            aVar.f3898q = this.f3898q;
            aVar.f3900r = this.f3900r;
            aVar.f3902s = this.f3902s;
            aVar.f3904t = this.f3904t;
            aVar.f3906u = this.f3906u;
            aVar.f3908v = this.f3908v;
            aVar.f3910w = this.f3910w;
            aVar.f3840A = this.f3840A;
            aVar.f3841B = this.f3841B;
            aVar.f3906u = this.f3906u;
            aVar.f3906u = this.f3906u;
            aVar.f3906u = this.f3906u;
            aVar.f3906u = this.f3906u;
            aVar.f3906u = this.f3906u;
            aVar.f3842C = this.f3842C;
            aVar.f3843D = this.f3843D;
            aVar.f3844E = this.f3844E;
            aVar.f3845F = this.f3845F;
            aVar.f3846G = this.f3846G;
            aVar.f3847H = this.f3847H;
            aVar.f3848I = this.f3848I;
            aVar.f3849J = this.f3849J;
            aVar.f3850K = this.f3850K;
            aVar.f3851L = this.f3851L;
            aVar.f3852M = this.f3852M;
            aVar.f3853N = this.f3853N;
            aVar.f3854O = this.f3854O;
            aVar.f3855P = this.f3855P;
            aVar.f3856Q = this.f3856Q;
            aVar.f3857R = this.f3857R;
            aVar.f3858S = this.f3858S;
            aVar.f3859T = this.f3859T;
            aVar.f3860U = this.f3860U;
            aVar.f3861V = this.f3861V;
            aVar.f3862W = this.f3862W;
            aVar.f3863X = this.f3863X;
            aVar.f3864Y = this.f3864Y;
            aVar.f3865Z = this.f3865Z;
            aVar.f3867a0 = this.f3867a0;
            aVar.f3869b0 = this.f3869b0;
            aVar.f3871c0 = this.f3871c0;
            aVar.f3873d0 = this.f3873d0;
            aVar.f3875e0 = this.f3875e0;
            aVar.f3877f0 = this.f3877f0;
            aVar.f3879g0 = this.f3879g0;
            aVar.f3881h0 = this.f3881h0;
            aVar.f3883i0 = this.f3883i0;
            aVar.f3885j0 = this.f3885j0;
            aVar.f3887k0 = this.f3887k0;
            aVar.f3889l0 = this.f3889l0;
            aVar.f3891m0 = this.f3891m0;
            aVar.f3893n0 = this.f3893n0;
            aVar.f3895o0 = this.f3895o0;
            aVar.f3897p0 = this.f3897p0;
            aVar.f3899q0 = this.f3899q0;
            aVar.f3903s0 = this.f3903s0;
            aVar.f3905t0 = this.f3905t0;
            int[] iArr = this.f3907u0;
            if (iArr != null) {
                aVar.f3907u0 = Arrays.copyOf(iArr, iArr.length);
            }
            aVar.f3911x = this.f3911x;
            aVar.f3912y = this.f3912y;
            aVar.f3913z = this.f3913z;
            aVar.f3901r0 = this.f3901r0;
            return aVar;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3838c = sparseIntArray;
        sparseIntArray.append(C1300h.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f3838c.append(C1300h.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f3838c.append(C1300h.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f3838c.append(C1300h.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f3838c.append(C1300h.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f3838c.append(C1300h.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f3838c.append(C1300h.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f3838c.append(C1300h.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f3838c.append(C1300h.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f3838c.append(C1300h.ConstraintSet_layout_editor_absoluteX, 6);
        f3838c.append(C1300h.ConstraintSet_layout_editor_absoluteY, 7);
        f3838c.append(C1300h.ConstraintSet_layout_constraintGuide_begin, 17);
        f3838c.append(C1300h.ConstraintSet_layout_constraintGuide_end, 18);
        f3838c.append(C1300h.ConstraintSet_layout_constraintGuide_percent, 19);
        f3838c.append(C1300h.ConstraintSet_android_orientation, 27);
        f3838c.append(C1300h.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f3838c.append(C1300h.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f3838c.append(C1300h.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f3838c.append(C1300h.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f3838c.append(C1300h.ConstraintSet_layout_goneMarginLeft, 13);
        f3838c.append(C1300h.ConstraintSet_layout_goneMarginTop, 16);
        f3838c.append(C1300h.ConstraintSet_layout_goneMarginRight, 14);
        f3838c.append(C1300h.ConstraintSet_layout_goneMarginBottom, 11);
        f3838c.append(C1300h.ConstraintSet_layout_goneMarginStart, 15);
        f3838c.append(C1300h.ConstraintSet_layout_goneMarginEnd, 12);
        f3838c.append(C1300h.ConstraintSet_layout_constraintVertical_weight, 40);
        f3838c.append(C1300h.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f3838c.append(C1300h.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f3838c.append(C1300h.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f3838c.append(C1300h.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f3838c.append(C1300h.ConstraintSet_layout_constraintVertical_bias, 37);
        f3838c.append(C1300h.ConstraintSet_layout_constraintDimensionRatio, 5);
        f3838c.append(C1300h.ConstraintSet_layout_constraintLeft_creator, 75);
        f3838c.append(C1300h.ConstraintSet_layout_constraintTop_creator, 75);
        f3838c.append(C1300h.ConstraintSet_layout_constraintRight_creator, 75);
        f3838c.append(C1300h.ConstraintSet_layout_constraintBottom_creator, 75);
        f3838c.append(C1300h.ConstraintSet_layout_constraintBaseline_creator, 75);
        f3838c.append(C1300h.ConstraintSet_android_layout_marginLeft, 24);
        f3838c.append(C1300h.ConstraintSet_android_layout_marginRight, 28);
        f3838c.append(C1300h.ConstraintSet_android_layout_marginStart, 31);
        f3838c.append(C1300h.ConstraintSet_android_layout_marginEnd, 8);
        f3838c.append(C1300h.ConstraintSet_android_layout_marginTop, 34);
        f3838c.append(C1300h.ConstraintSet_android_layout_marginBottom, 2);
        f3838c.append(C1300h.ConstraintSet_android_layout_width, 23);
        f3838c.append(C1300h.ConstraintSet_android_layout_height, 21);
        f3838c.append(C1300h.ConstraintSet_android_visibility, 22);
        f3838c.append(C1300h.ConstraintSet_android_alpha, 43);
        f3838c.append(C1300h.ConstraintSet_android_elevation, 44);
        f3838c.append(C1300h.ConstraintSet_android_rotationX, 45);
        f3838c.append(C1300h.ConstraintSet_android_rotationY, 46);
        f3838c.append(C1300h.ConstraintSet_android_rotation, 60);
        f3838c.append(C1300h.ConstraintSet_android_scaleX, 47);
        f3838c.append(C1300h.ConstraintSet_android_scaleY, 48);
        f3838c.append(C1300h.ConstraintSet_android_transformPivotX, 49);
        f3838c.append(C1300h.ConstraintSet_android_transformPivotY, 50);
        f3838c.append(C1300h.ConstraintSet_android_translationX, 51);
        f3838c.append(C1300h.ConstraintSet_android_translationY, 52);
        f3838c.append(C1300h.ConstraintSet_android_translationZ, 53);
        f3838c.append(C1300h.ConstraintSet_layout_constraintWidth_default, 54);
        f3838c.append(C1300h.ConstraintSet_layout_constraintHeight_default, 55);
        f3838c.append(C1300h.ConstraintSet_layout_constraintWidth_max, 56);
        f3838c.append(C1300h.ConstraintSet_layout_constraintHeight_max, 57);
        f3838c.append(C1300h.ConstraintSet_layout_constraintWidth_min, 58);
        f3838c.append(C1300h.ConstraintSet_layout_constraintHeight_min, 59);
        f3838c.append(C1300h.ConstraintSet_layout_constraintCircle, 61);
        f3838c.append(C1300h.ConstraintSet_layout_constraintCircleRadius, 62);
        f3838c.append(C1300h.ConstraintSet_layout_constraintCircleAngle, 63);
        f3838c.append(C1300h.ConstraintSet_android_id, 38);
        f3838c.append(C1300h.ConstraintSet_layout_constraintWidth_percent, 69);
        f3838c.append(C1300h.ConstraintSet_layout_constraintHeight_percent, 70);
        f3838c.append(C1300h.ConstraintSet_chainUseRtl, 71);
        f3838c.append(C1300h.ConstraintSet_barrierDirection, 72);
        f3838c.append(C1300h.ConstraintSet_constraint_referenced_ids, 73);
        f3838c.append(C1300h.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    /* renamed from: a */
    public final C1294a mo5748a(Context context, AttributeSet attributeSet) {
        String str;
        StringBuilder sb;
        C1294a aVar = new C1294a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1300h.ConstraintSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = f3838c.get(index);
            switch (i2) {
                case 1:
                    int resourceId = obtainStyledAttributes.getResourceId(index, aVar.f3896p);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f3896p = resourceId;
                    break;
                case 2:
                    aVar.f3846G = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f3846G);
                    break;
                case 3:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, aVar.f3894o);
                    if (resourceId2 == -1) {
                        resourceId2 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f3894o = resourceId2;
                    break;
                case 4:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, aVar.f3892n);
                    if (resourceId3 == -1) {
                        resourceId3 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f3892n = resourceId3;
                    break;
                case 5:
                    aVar.f3910w = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    aVar.f3840A = obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f3840A);
                    break;
                case 7:
                    aVar.f3841B = obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f3841B);
                    break;
                case 8:
                    aVar.f3847H = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f3847H);
                    break;
                case 9:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, aVar.f3904t);
                    if (resourceId4 == -1) {
                        resourceId4 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f3904t = resourceId4;
                    break;
                case 10:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, aVar.f3902s);
                    if (resourceId5 == -1) {
                        resourceId5 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f3902s = resourceId5;
                    break;
                case 11:
                    aVar.f3853N = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f3853N);
                    break;
                case 12:
                    aVar.f3854O = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f3854O);
                    break;
                case 13:
                    aVar.f3850K = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f3850K);
                    break;
                case 14:
                    aVar.f3852M = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f3852M);
                    break;
                case 15:
                    aVar.f3855P = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f3855P);
                    break;
                case 16:
                    aVar.f3851L = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f3851L);
                    break;
                case 17:
                    aVar.f3874e = obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f3874e);
                    break;
                case 18:
                    aVar.f3876f = obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f3876f);
                    break;
                case 19:
                    aVar.f3878g = obtainStyledAttributes.getFloat(index, aVar.f3878g);
                    break;
                case 20:
                    aVar.f3906u = obtainStyledAttributes.getFloat(index, aVar.f3906u);
                    break;
                case 21:
                    aVar.f3870c = obtainStyledAttributes.getLayoutDimension(index, aVar.f3870c);
                    break;
                case 22:
                    int i3 = obtainStyledAttributes.getInt(index, aVar.f3849J);
                    aVar.f3849J = i3;
                    aVar.f3849J = f3837b[i3];
                    break;
                case 23:
                    aVar.f3868b = obtainStyledAttributes.getLayoutDimension(index, aVar.f3868b);
                    break;
                case 24:
                    aVar.f3843D = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f3843D);
                    break;
                case 25:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, aVar.f3880h);
                    if (resourceId6 == -1) {
                        resourceId6 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f3880h = resourceId6;
                    break;
                case 26:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, aVar.f3882i);
                    if (resourceId7 == -1) {
                        resourceId7 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f3882i = resourceId7;
                    break;
                case 27:
                    aVar.f3842C = obtainStyledAttributes.getInt(index, aVar.f3842C);
                    break;
                case 28:
                    aVar.f3844E = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f3844E);
                    break;
                case 29:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, aVar.f3884j);
                    if (resourceId8 == -1) {
                        resourceId8 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f3884j = resourceId8;
                    break;
                case 30:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, aVar.f3886k);
                    if (resourceId9 == -1) {
                        resourceId9 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f3886k = resourceId9;
                    break;
                case 31:
                    aVar.f3848I = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f3848I);
                    break;
                case 32:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, aVar.f3898q);
                    if (resourceId10 == -1) {
                        resourceId10 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f3898q = resourceId10;
                    break;
                case 33:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, aVar.f3900r);
                    if (resourceId11 == -1) {
                        resourceId11 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f3900r = resourceId11;
                    break;
                case 34:
                    aVar.f3845F = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f3845F);
                    break;
                case 35:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, aVar.f3890m);
                    if (resourceId12 == -1) {
                        resourceId12 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f3890m = resourceId12;
                    break;
                case 36:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, aVar.f3888l);
                    if (resourceId13 == -1) {
                        resourceId13 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f3888l = resourceId13;
                    break;
                case 37:
                    aVar.f3908v = obtainStyledAttributes.getFloat(index, aVar.f3908v);
                    break;
                case 38:
                    aVar.f3872d = obtainStyledAttributes.getResourceId(index, aVar.f3872d);
                    break;
                case 39:
                    aVar.f3857R = obtainStyledAttributes.getFloat(index, aVar.f3857R);
                    break;
                case 40:
                    aVar.f3856Q = obtainStyledAttributes.getFloat(index, aVar.f3856Q);
                    break;
                case 41:
                    aVar.f3858S = obtainStyledAttributes.getInt(index, aVar.f3858S);
                    break;
                case 42:
                    aVar.f3859T = obtainStyledAttributes.getInt(index, aVar.f3859T);
                    break;
                case 43:
                    aVar.f3860U = obtainStyledAttributes.getFloat(index, aVar.f3860U);
                    break;
                case 44:
                    aVar.f3861V = true;
                    aVar.f3862W = obtainStyledAttributes.getDimension(index, aVar.f3862W);
                    break;
                case 45:
                    aVar.f3864Y = obtainStyledAttributes.getFloat(index, aVar.f3864Y);
                    break;
                case 46:
                    aVar.f3865Z = obtainStyledAttributes.getFloat(index, aVar.f3865Z);
                    break;
                case 47:
                    aVar.f3867a0 = obtainStyledAttributes.getFloat(index, aVar.f3867a0);
                    break;
                case 48:
                    aVar.f3869b0 = obtainStyledAttributes.getFloat(index, aVar.f3869b0);
                    break;
                case 49:
                    aVar.f3871c0 = obtainStyledAttributes.getFloat(index, aVar.f3871c0);
                    break;
                case 50:
                    aVar.f3873d0 = obtainStyledAttributes.getFloat(index, aVar.f3873d0);
                    break;
                case 51:
                    aVar.f3875e0 = obtainStyledAttributes.getDimension(index, aVar.f3875e0);
                    break;
                case 52:
                    aVar.f3877f0 = obtainStyledAttributes.getDimension(index, aVar.f3877f0);
                    break;
                case 53:
                    aVar.f3879g0 = obtainStyledAttributes.getDimension(index, aVar.f3879g0);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            aVar.f3863X = obtainStyledAttributes.getFloat(index, aVar.f3863X);
                            break;
                        case 61:
                            int resourceId14 = obtainStyledAttributes.getResourceId(index, aVar.f3911x);
                            if (resourceId14 == -1) {
                                resourceId14 = obtainStyledAttributes.getInt(index, -1);
                            }
                            aVar.f3911x = resourceId14;
                            break;
                        case 62:
                            aVar.f3912y = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f3912y);
                            break;
                        case 63:
                            aVar.f3913z = obtainStyledAttributes.getFloat(index, aVar.f3913z);
                            break;
                        default:
                            String str2 = "ConstraintSet";
                            switch (i2) {
                                case 69:
                                    aVar.f3897p0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    continue;
                                case 70:
                                    aVar.f3899q0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    continue;
                                case 71:
                                    Log.e(str2, "CURRENTLY UNSUPPORTED");
                                    continue;
                                case 72:
                                    aVar.f3903s0 = obtainStyledAttributes.getInt(index, aVar.f3903s0);
                                    continue;
                                case 73:
                                    aVar.f3909v0 = obtainStyledAttributes.getString(index);
                                    continue;
                                case 74:
                                    aVar.f3901r0 = obtainStyledAttributes.getBoolean(index, aVar.f3901r0);
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
                            sb.append(f3838c.get(index));
                            Log.w(str2, sb.toString());
                            break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: a */
    public void mo5749a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C1294a a = mo5748a(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        a.f3866a = true;
                    }
                    this.f3839a.put(Integer.valueOf(a.f3872d), a);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public final int[] mo5750a(View view, String str) {
        int i;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C1299g.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                Object a = ((ConstraintLayout) view.getParent()).mo560a(0, (Object) trim);
                if (a != null && (a instanceof Integer)) {
                    i = ((Integer) a).intValue();
                }
            }
            int i4 = i3 + 1;
            iArr[i3] = i;
            i2++;
            i3 = i4;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }
}
