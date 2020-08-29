package p213q.p217b.p218a.p271c.p278g0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import p213q.p217b.p218a.p271c.p278g0.C3348m.C3354f;

/* renamed from: q.b.a.c.g0.k */
public class C3345k {

    /* renamed from: a */
    public final C3348m[] f8435a = new C3348m[4];

    /* renamed from: b */
    public final Matrix[] f8436b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f8437c = new Matrix[4];

    /* renamed from: d */
    public final PointF f8438d = new PointF();

    /* renamed from: e */
    public final C3348m f8439e = new C3348m();

    /* renamed from: f */
    public final float[] f8440f = new float[2];

    /* renamed from: g */
    public final float[] f8441g = new float[2];

    /* renamed from: q.b.a.c.g0.k$a */
    public interface C3346a {
    }

    public C3345k() {
        for (int i = 0; i < 4; i++) {
            this.f8435a[i] = new C3348m();
            this.f8436b[i] = new Matrix();
            this.f8437c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    public void mo9106a(C3342j jVar, float f, RectF rectF, C3346a aVar, Path path) {
        float f2;
        float f3;
        C3336f fVar;
        char c;
        char c2;
        C3333c cVar;
        C3334d dVar;
        float f4;
        float f5;
        C3342j jVar2 = jVar;
        float f6 = f;
        RectF rectF2 = rectF;
        Path path2 = path;
        path.rewind();
        char c3 = 0;
        int i = 0;
        while (i < 4) {
            if (i == 1) {
                cVar = jVar2.f8417g;
            } else if (i == 2) {
                cVar = jVar2.f8418h;
            } else if (i != 3) {
                cVar = jVar2.f8416f;
            } else {
                cVar = jVar2.f8415e;
            }
            if (i == 1) {
                dVar = jVar2.f8413c;
            } else if (i == 2) {
                dVar = jVar2.f8414d;
            } else if (i != 3) {
                dVar = jVar2.f8412b;
            } else {
                dVar = jVar2.f8411a;
            }
            C3348m mVar = this.f8435a[i];
            if (dVar != null) {
                dVar.mo9055a(mVar, 90.0f, f6, cVar.mo9050a(rectF2));
                int i2 = i + 1;
                float f7 = (float) (i2 * 90);
                this.f8436b[i].reset();
                PointF pointF = this.f8438d;
                if (i == 1) {
                    f5 = rectF2.right;
                } else if (i != 2) {
                    float f8 = i != 3 ? rectF2.right : rectF2.left;
                    f4 = rectF2.top;
                    pointF.set(f8, f4);
                    Matrix matrix = this.f8436b[i];
                    PointF pointF2 = this.f8438d;
                    matrix.setTranslate(pointF2.x, pointF2.y);
                    this.f8436b[i].preRotate(f7);
                    float[] fArr = this.f8440f;
                    C3348m[] mVarArr = this.f8435a;
                    fArr[0] = mVarArr[i].f8446c;
                    fArr[1] = mVarArr[i].f8447d;
                    this.f8436b[i].mapPoints(fArr);
                    this.f8437c[i].reset();
                    Matrix matrix2 = this.f8437c[i];
                    float[] fArr2 = this.f8440f;
                    matrix2.setTranslate(fArr2[0], fArr2[1]);
                    this.f8437c[i].preRotate(f7);
                    i = i2;
                } else {
                    f5 = rectF2.left;
                }
                f4 = rectF2.bottom;
                pointF.set(f8, f4);
                Matrix matrix3 = this.f8436b[i];
                PointF pointF22 = this.f8438d;
                matrix3.setTranslate(pointF22.x, pointF22.y);
                this.f8436b[i].preRotate(f7);
                float[] fArr3 = this.f8440f;
                C3348m[] mVarArr2 = this.f8435a;
                fArr3[0] = mVarArr2[i].f8446c;
                fArr3[1] = mVarArr2[i].f8447d;
                this.f8436b[i].mapPoints(fArr3);
                this.f8437c[i].reset();
                Matrix matrix22 = this.f8437c[i];
                float[] fArr22 = this.f8440f;
                matrix22.setTranslate(fArr22[0], fArr22[1]);
                this.f8437c[i].preRotate(f7);
                i = i2;
            } else {
                throw null;
            }
        }
        int i3 = 0;
        while (i3 < 4) {
            float[] fArr4 = this.f8440f;
            C3348m[] mVarArr3 = this.f8435a;
            fArr4[c3] = mVarArr3[i3].f8444a;
            fArr4[1] = mVarArr3[i3].f8445b;
            this.f8436b[i3].mapPoints(fArr4);
            float[] fArr5 = this.f8440f;
            if (i3 == 0) {
                path2.moveTo(fArr5[c3], fArr5[1]);
            } else {
                path2.lineTo(fArr5[c3], fArr5[1]);
            }
            this.f8435a[i3].mo9112a(this.f8436b[i3], path2);
            if (aVar != null) {
                C3348m mVar2 = this.f8435a[i3];
                Matrix matrix4 = this.f8436b[i3];
                C3354f[] fVarArr = C3337g.this.f8366f;
                mVar2.mo9108a(mVar2.f8449f);
                fVarArr[i3] = new C3347l(mVar2, new ArrayList(mVar2.f8451h), matrix4);
            }
            int i4 = i3 + 1;
            int i5 = i4 % 4;
            float[] fArr6 = this.f8440f;
            C3348m[] mVarArr4 = this.f8435a;
            fArr6[c3] = mVarArr4[i3].f8446c;
            fArr6[1] = mVarArr4[i3].f8447d;
            this.f8436b[i3].mapPoints(fArr6);
            float[] fArr7 = this.f8441g;
            C3348m[] mVarArr5 = this.f8435a;
            fArr7[c3] = mVarArr5[i5].f8444a;
            fArr7[1] = mVarArr5[i5].f8445b;
            this.f8436b[i5].mapPoints(fArr7);
            float[] fArr8 = this.f8440f;
            float f9 = fArr8[c3];
            float[] fArr9 = this.f8441g;
            float max = Math.max(((float) Math.hypot((double) (f9 - fArr9[c3]), (double) (fArr8[1] - fArr9[1]))) - 0.001f, 0.0f);
            float[] fArr10 = this.f8440f;
            C3348m[] mVarArr6 = this.f8435a;
            fArr10[c3] = mVarArr6[i3].f8446c;
            fArr10[1] = mVarArr6[i3].f8447d;
            this.f8436b[i3].mapPoints(fArr10);
            if (i3 == 1 || i3 == 3) {
                f3 = rectF.centerX();
                f2 = this.f8440f[c3];
            } else {
                f3 = rectF.centerY();
                f2 = this.f8440f[1];
            }
            float abs = Math.abs(f3 - f2);
            this.f8439e.mo9110a(0.0f, 0.0f, 270.0f, 0.0f);
            if (i3 != 1) {
                c2 = 2;
                if (i3 != 2) {
                    c = 3;
                    if (i3 != 3) {
                        fVar = jVar2.f8420j;
                    } else {
                        fVar = jVar2.f8419i;
                    }
                } else {
                    c = 3;
                    fVar = jVar2.f8422l;
                }
            } else {
                c2 = 2;
                c = 3;
                fVar = jVar2.f8421k;
            }
            fVar.mo9056a(max, abs, f6, this.f8439e);
            this.f8439e.mo9112a(this.f8437c[i3], path2);
            if (aVar != null) {
                C3348m mVar3 = this.f8439e;
                Matrix matrix5 = this.f8437c[i3];
                C3354f[] fVarArr2 = C3337g.this.f8367g;
                mVar3.mo9108a(mVar3.f8449f);
                fVarArr2[i3] = new C3347l(mVar3, new ArrayList(mVar3.f8451h), matrix5);
            }
            char c4 = c2;
            i3 = i4;
            char c5 = c;
            c3 = 0;
        }
        path.close();
    }
}
