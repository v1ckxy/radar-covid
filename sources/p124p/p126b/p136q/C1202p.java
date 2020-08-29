package p124p.p126b.p136q;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: p.b.q.p */
public class C1202p {

    /* renamed from: c */
    public static final int[] f3397c = {16843067, 16843068};

    /* renamed from: a */
    public final ProgressBar f3398a;

    /* renamed from: b */
    public Bitmap f3399b;

    public C1202p(ProgressBar progressBar) {
        this.f3398a = progressBar;
    }

    /* renamed from: a */
    public void mo5288a(AttributeSet attributeSet, int i) {
        C1213u0 a = C1213u0.m3013a(this.f3398a.getContext(), attributeSet, f3397c, i, 0);
        Drawable c = a.mo5320c(0);
        if (c != 0) {
            ProgressBar progressBar = this.f3398a;
            if (c instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) c;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable a2 = mo5287a(animationDrawable.getFrame(i2), true);
                    a2.setLevel(10000);
                    animationDrawable2.addFrame(a2, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                c = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(c);
        }
        Drawable c2 = a.mo5320c(1);
        if (c2 != null) {
            this.f3398a.setProgressDrawable(mo5287a(c2, false));
        }
        a.f3426b.recycle();
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r8v4, types: [android.graphics.drawable.ClipDrawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo5287a(android.graphics.drawable.Drawable r8, boolean r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p124p.p150h.p154f.p155k.C1345a
            if (r0 == 0) goto L_0x0016
            r0 = r8
            p.h.f.k.a r0 = (p124p.p150h.p154f.p155k.C1345a) r0
            android.graphics.drawable.Drawable r1 = r0.mo5812a()
            if (r1 == 0) goto L_0x00a3
            android.graphics.drawable.Drawable r9 = r7.mo5287a(r1, r9)
            r0.mo5813a(r9)
            goto L_0x00a3
        L_0x0016:
            boolean r0 = r8 instanceof android.graphics.drawable.LayerDrawable
            r1 = 1
            if (r0 == 0) goto L_0x0058
            android.graphics.drawable.LayerDrawable r8 = (android.graphics.drawable.LayerDrawable) r8
            int r9 = r8.getNumberOfLayers()
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r9]
            r2 = 0
            r3 = r2
        L_0x0025:
            if (r3 >= r9) goto L_0x0046
            int r4 = r8.getId(r3)
            android.graphics.drawable.Drawable r5 = r8.getDrawable(r3)
            r6 = 16908301(0x102000d, float:2.3877265E-38)
            if (r4 == r6) goto L_0x003c
            r6 = 16908303(0x102000f, float:2.387727E-38)
            if (r4 != r6) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r4 = r2
            goto L_0x003d
        L_0x003c:
            r4 = r1
        L_0x003d:
            android.graphics.drawable.Drawable r4 = r7.mo5287a(r5, r4)
            r0[r3] = r4
            int r3 = r3 + 1
            goto L_0x0025
        L_0x0046:
            android.graphics.drawable.LayerDrawable r1 = new android.graphics.drawable.LayerDrawable
            r1.<init>(r0)
        L_0x004b:
            if (r2 >= r9) goto L_0x0057
            int r0 = r8.getId(r2)
            r1.setId(r2, r0)
            int r2 = r2 + 1
            goto L_0x004b
        L_0x0057:
            return r1
        L_0x0058:
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x00a3
            android.graphics.drawable.BitmapDrawable r8 = (android.graphics.drawable.BitmapDrawable) r8
            android.graphics.Bitmap r0 = r8.getBitmap()
            android.graphics.Bitmap r2 = r7.f3399b
            if (r2 != 0) goto L_0x0068
            r7.f3399b = r0
        L_0x0068:
            android.graphics.drawable.ShapeDrawable r2 = new android.graphics.drawable.ShapeDrawable
            r3 = 8
            float[] r3 = new float[r3]
            r3 = {1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584} // fill-array
            android.graphics.drawable.shapes.RoundRectShape r4 = new android.graphics.drawable.shapes.RoundRectShape
            r5 = 0
            r4.<init>(r3, r5, r5)
            r2.<init>(r4)
            android.graphics.BitmapShader r3 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.Shader$TileMode r5 = android.graphics.Shader.TileMode.CLAMP
            r3.<init>(r0, r4, r5)
            android.graphics.Paint r0 = r2.getPaint()
            r0.setShader(r3)
            android.graphics.Paint r0 = r2.getPaint()
            android.graphics.Paint r8 = r8.getPaint()
            android.graphics.ColorFilter r8 = r8.getColorFilter()
            r0.setColorFilter(r8)
            if (r9 == 0) goto L_0x00a2
            android.graphics.drawable.ClipDrawable r8 = new android.graphics.drawable.ClipDrawable
            r9 = 3
            r8.<init>(r2, r9, r1)
            r2 = r8
        L_0x00a2:
            return r2
        L_0x00a3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p136q.C1202p.mo5287a(android.graphics.drawable.Drawable, boolean):android.graphics.drawable.Drawable");
    }
}
