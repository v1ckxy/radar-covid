package p213q.p217b.p218a.p271c.p278g0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Shader.TileMode;
import java.util.ArrayList;
import java.util.List;
import p213q.p217b.p218a.p271c.p277f0.C3328a;

/* renamed from: q.b.a.c.g0.m */
public class C3348m {
    @Deprecated

    /* renamed from: a */
    public float f8444a;
    @Deprecated

    /* renamed from: b */
    public float f8445b;
    @Deprecated

    /* renamed from: c */
    public float f8446c;
    @Deprecated

    /* renamed from: d */
    public float f8447d;
    @Deprecated

    /* renamed from: e */
    public float f8448e;
    @Deprecated

    /* renamed from: f */
    public float f8449f;

    /* renamed from: g */
    public final List<C3353e> f8450g = new ArrayList();

    /* renamed from: h */
    public final List<C3354f> f8451h = new ArrayList();

    /* renamed from: q.b.a.c.g0.m$a */
    public static class C3349a extends C3354f {

        /* renamed from: b */
        public final C3351c f8452b;

        public C3349a(C3351c cVar) {
            this.f8452b = cVar;
        }

        /* renamed from: a */
        public void mo9107a(Matrix matrix, C3328a aVar, int i, Canvas canvas) {
            C3328a aVar2 = aVar;
            int i2 = i;
            Canvas canvas2 = canvas;
            C3351c cVar = this.f8452b;
            float f = cVar.f8461f;
            float f2 = cVar.f8462g;
            C3351c cVar2 = this.f8452b;
            RectF rectF = new RectF(cVar2.f8457b, cVar2.f8458c, cVar2.f8459d, cVar2.f8460e);
            boolean z = f2 < 0.0f;
            Path path = aVar2.f8359g;
            if (z) {
                int[] iArr = C3328a.f8351j;
                iArr[0] = 0;
                iArr[1] = aVar2.f8358f;
                iArr[2] = aVar2.f8357e;
                iArr[3] = aVar2.f8356d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f2);
                path.close();
                float f3 = (float) (-i2);
                rectF.inset(f3, f3);
                int[] iArr2 = C3328a.f8351j;
                iArr2[0] = 0;
                iArr2[1] = aVar2.f8356d;
                iArr2[2] = aVar2.f8357e;
                iArr2[3] = aVar2.f8358f;
            }
            float width = 1.0f - (((float) i2) / (rectF.width() / 2.0f));
            float f4 = ((1.0f - width) / 2.0f) + width;
            float[] fArr = C3328a.f8352k;
            fArr[1] = width;
            fArr[2] = f4;
            Paint paint = aVar2.f8354b;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, C3328a.f8351j, C3328a.f8352k, TileMode.CLAMP);
            paint.setShader(radialGradient);
            canvas.save();
            canvas2.concat(matrix);
            if (!z) {
                canvas2.clipPath(path, Op.DIFFERENCE);
            }
            canvas.drawArc(rectF, f, f2, true, aVar2.f8354b);
            canvas.restore();
        }
    }

    /* renamed from: q.b.a.c.g0.m$b */
    public static class C3350b extends C3354f {

        /* renamed from: b */
        public final C3352d f8453b;

        /* renamed from: c */
        public final float f8454c;

        /* renamed from: d */
        public final float f8455d;

        public C3350b(C3352d dVar, float f, float f2) {
            this.f8453b = dVar;
            this.f8454c = f;
            this.f8455d = f2;
        }

        /* renamed from: a */
        public void mo9107a(Matrix matrix, C3328a aVar, int i, Canvas canvas) {
            C3352d dVar = this.f8453b;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (dVar.f8464c - this.f8455d), (double) (dVar.f8463b - this.f8454c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f8454c, this.f8455d);
            matrix2.preRotate(mo9113a());
            if (aVar != null) {
                rectF.bottom += (float) i;
                rectF.offset(0.0f, (float) (-i));
                int[] iArr = C3328a.f8349h;
                iArr[0] = aVar.f8358f;
                iArr[1] = aVar.f8357e;
                iArr[2] = aVar.f8356d;
                Paint paint = aVar.f8355c;
                float f = rectF.left;
                LinearGradient linearGradient = new LinearGradient(f, rectF.top, f, rectF.bottom, C3328a.f8349h, C3328a.f8350i, TileMode.CLAMP);
                paint.setShader(linearGradient);
                canvas.save();
                canvas.concat(matrix2);
                canvas.drawRect(rectF, aVar.f8355c);
                canvas.restore();
                return;
            }
            throw null;
        }

        /* renamed from: a */
        public float mo9113a() {
            C3352d dVar = this.f8453b;
            return (float) Math.toDegrees(Math.atan((double) ((dVar.f8464c - this.f8455d) / (dVar.f8463b - this.f8454c))));
        }
    }

    /* renamed from: q.b.a.c.g0.m$c */
    public static class C3351c extends C3353e {

        /* renamed from: h */
        public static final RectF f8456h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f8457b;
        @Deprecated

        /* renamed from: c */
        public float f8458c;
        @Deprecated

        /* renamed from: d */
        public float f8459d;
        @Deprecated

        /* renamed from: e */
        public float f8460e;
        @Deprecated

        /* renamed from: f */
        public float f8461f;
        @Deprecated

        /* renamed from: g */
        public float f8462g;

        public C3351c(float f, float f2, float f3, float f4) {
            this.f8457b = f;
            this.f8458c = f2;
            this.f8459d = f3;
            this.f8460e = f4;
        }

        /* renamed from: a */
        public void mo9114a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f8465a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            f8456h.set(this.f8457b, this.f8458c, this.f8459d, this.f8460e);
            path.arcTo(f8456h, this.f8461f, this.f8462g, false);
            path.transform(matrix);
        }
    }

    /* renamed from: q.b.a.c.g0.m$d */
    public static class C3352d extends C3353e {

        /* renamed from: b */
        public float f8463b;

        /* renamed from: c */
        public float f8464c;

        /* renamed from: a */
        public void mo9114a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f8465a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f8463b, this.f8464c);
            path.transform(matrix);
        }
    }

    /* renamed from: q.b.a.c.g0.m$e */
    public static abstract class C3353e {

        /* renamed from: a */
        public final Matrix f8465a = new Matrix();

        /* renamed from: a */
        public abstract void mo9114a(Matrix matrix, Path path);
    }

    /* renamed from: q.b.a.c.g0.m$f */
    public static abstract class C3354f {

        /* renamed from: a */
        public static final Matrix f8466a = new Matrix();

        /* renamed from: a */
        public abstract void mo9107a(Matrix matrix, C3328a aVar, int i, Canvas canvas);
    }

    public C3348m() {
        mo9110a(0.0f, 0.0f, 270.0f, 0.0f);
    }

    /* renamed from: a */
    public void mo9111a(float f, float f2, float f3, float f4, float f5, float f6) {
        C3351c cVar = new C3351c(f, f2, f3, f4);
        cVar.f8461f = f5;
        cVar.f8462g = f6;
        this.f8450g.add(cVar);
        C3349a aVar = new C3349a(cVar);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        float f8 = z ? (180.0f + f7) % 360.0f : f7;
        mo9108a(f5);
        this.f8451h.add(aVar);
        this.f8448e = f8;
        double d = (double) f7;
        this.f8446c = (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((f + f3) * 0.5f);
        this.f8447d = (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((f2 + f4) * 0.5f);
    }

    /* renamed from: a */
    public void mo9112a(Matrix matrix, Path path) {
        int size = this.f8450g.size();
        for (int i = 0; i < size; i++) {
            ((C3353e) this.f8450g.get(i)).mo9114a(matrix, path);
        }
    }

    /* renamed from: a */
    public final void mo9108a(float f) {
        float f2 = this.f8448e;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 <= 180.0f) {
                float f4 = this.f8446c;
                float f5 = this.f8447d;
                C3351c cVar = new C3351c(f4, f5, f4, f5);
                cVar.f8461f = this.f8448e;
                cVar.f8462g = f3;
                this.f8451h.add(new C3349a(cVar));
                this.f8448e = f;
            }
        }
    }

    /* renamed from: a */
    public void mo9109a(float f, float f2) {
        C3352d dVar = new C3352d();
        dVar.f8463b = f;
        dVar.f8464c = f2;
        this.f8450g.add(dVar);
        C3350b bVar = new C3350b(dVar, this.f8446c, this.f8447d);
        float a = bVar.mo9113a() + 270.0f;
        mo9108a(bVar.mo9113a() + 270.0f);
        this.f8451h.add(bVar);
        this.f8448e = a;
        this.f8446c = f;
        this.f8447d = f2;
    }

    /* renamed from: a */
    public void mo9110a(float f, float f2, float f3, float f4) {
        this.f8444a = f;
        this.f8445b = f2;
        this.f8446c = f;
        this.f8447d = f2;
        this.f8448e = f3;
        this.f8449f = (f3 + f4) % 360.0f;
        this.f8450g.clear();
        this.f8451h.clear();
    }
}
