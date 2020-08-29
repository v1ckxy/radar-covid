package p213q.p217b.p218a.p271c.p273b0;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import p124p.p150h.p160j.C1374d;
import p124p.p150h.p160j.C1374d.C1378d;
import p124p.p150h.p162l.C1404o;
import p213q.p217b.p218a.p271c.p275d0.C3319a;
import p213q.p217b.p218a.p271c.p283m.C3407a;

/* renamed from: q.b.a.c.b0.b */
public final class C3296b {

    /* renamed from: T */
    public static final Paint f8228T = null;

    /* renamed from: A */
    public Bitmap f8229A;

    /* renamed from: B */
    public Paint f8230B;

    /* renamed from: C */
    public float f8231C;

    /* renamed from: D */
    public float f8232D;

    /* renamed from: E */
    public float f8233E;

    /* renamed from: F */
    public float f8234F;

    /* renamed from: G */
    public int[] f8235G;

    /* renamed from: H */
    public boolean f8236H;

    /* renamed from: I */
    public final TextPaint f8237I;

    /* renamed from: J */
    public final TextPaint f8238J;

    /* renamed from: K */
    public TimeInterpolator f8239K;

    /* renamed from: L */
    public TimeInterpolator f8240L;

    /* renamed from: M */
    public float f8241M;

    /* renamed from: N */
    public float f8242N;

    /* renamed from: O */
    public float f8243O;

    /* renamed from: P */
    public ColorStateList f8244P;

    /* renamed from: Q */
    public float f8245Q;

    /* renamed from: R */
    public float f8246R;

    /* renamed from: S */
    public float f8247S;

    /* renamed from: a */
    public final View f8248a;

    /* renamed from: b */
    public boolean f8249b;

    /* renamed from: c */
    public float f8250c;

    /* renamed from: d */
    public final Rect f8251d;

    /* renamed from: e */
    public final Rect f8252e;

    /* renamed from: f */
    public final RectF f8253f;

    /* renamed from: g */
    public int f8254g = 16;

    /* renamed from: h */
    public int f8255h = 16;

    /* renamed from: i */
    public float f8256i = 15.0f;

    /* renamed from: j */
    public float f8257j = 15.0f;

    /* renamed from: k */
    public ColorStateList f8258k;

    /* renamed from: l */
    public ColorStateList f8259l;

    /* renamed from: m */
    public float f8260m;

    /* renamed from: n */
    public float f8261n;

    /* renamed from: o */
    public float f8262o;

    /* renamed from: p */
    public float f8263p;

    /* renamed from: q */
    public float f8264q;

    /* renamed from: r */
    public float f8265r;

    /* renamed from: s */
    public Typeface f8266s;

    /* renamed from: t */
    public Typeface f8267t;

    /* renamed from: u */
    public Typeface f8268u;

    /* renamed from: v */
    public C3319a f8269v;

    /* renamed from: w */
    public CharSequence f8270w;

    /* renamed from: x */
    public CharSequence f8271x;

    /* renamed from: y */
    public boolean f8272y;

    /* renamed from: z */
    public boolean f8273z;

    static {
        Paint paint = null;
        if (paint != null) {
            paint.setAntiAlias(true);
            f8228T.setColor(-65281);
        }
    }

    public C3296b(View view) {
        this.f8248a = view;
        this.f8237I = new TextPaint(129);
        this.f8238J = new TextPaint(this.f8237I);
        this.f8252e = new Rect();
        this.f8251d = new Rect();
        this.f8253f = new RectF();
    }

    /* renamed from: a */
    public static float m7657a(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C3407a.m7806a(f, f2, f3);
    }

    /* renamed from: a */
    public static int m7658a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f) + (((float) Color.alpha(i)) * f2)), (int) ((((float) Color.red(i2)) * f) + (((float) Color.red(i)) * f2)), (int) ((((float) Color.green(i2)) * f) + (((float) Color.green(i)) * f2)), (int) ((((float) Color.blue(i2)) * f) + (((float) Color.blue(i)) * f2)));
    }

    /* renamed from: a */
    public static boolean m7659a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: a */
    public float mo8994a() {
        if (this.f8270w == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.f8238J;
        textPaint.setTextSize(this.f8257j);
        textPaint.setTypeface(this.f8266s);
        TextPaint textPaint2 = this.f8238J;
        CharSequence charSequence = this.f8270w;
        return textPaint2.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: a */
    public final int mo8995a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f8235G;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: a */
    public final boolean mo8998a(CharSequence charSequence) {
        boolean z = true;
        if (C1404o.m3551l(this.f8248a) != 1) {
            z = false;
        }
        return ((C1378d) (z ? C1374d.f4131d : C1374d.f4130c)).mo5856a(charSequence, 0, charSequence.length());
    }

    /* renamed from: b */
    public final void mo9000b(float f) {
        float f2;
        boolean z;
        if (this.f8270w != null) {
            float width = (float) this.f8252e.width();
            float width2 = (float) this.f8251d.width();
            boolean z2 = true;
            if (Math.abs(f - this.f8257j) < 0.001f) {
                f2 = this.f8257j;
                this.f8233E = 1.0f;
                Typeface typeface = this.f8268u;
                Typeface typeface2 = this.f8266s;
                if (typeface != typeface2) {
                    this.f8268u = typeface2;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                float f3 = this.f8256i;
                Typeface typeface3 = this.f8268u;
                Typeface typeface4 = this.f8267t;
                if (typeface3 != typeface4) {
                    this.f8268u = typeface4;
                    z = true;
                } else {
                    z = false;
                }
                if (Math.abs(f - this.f8256i) < 0.001f) {
                    this.f8233E = 1.0f;
                } else {
                    this.f8233E = f / this.f8256i;
                }
                float f4 = this.f8257j / this.f8256i;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
                f2 = f3;
            }
            if (width > 0.0f) {
                z = this.f8234F != f2 || this.f8236H || z;
                this.f8234F = f2;
                this.f8236H = false;
            }
            if (this.f8271x == null || z) {
                this.f8237I.setTextSize(this.f8234F);
                this.f8237I.setTypeface(this.f8268u);
                TextPaint textPaint = this.f8237I;
                if (this.f8233E == 1.0f) {
                    z2 = false;
                }
                textPaint.setLinearText(z2);
                CharSequence ellipsize = TextUtils.ellipsize(this.f8270w, this.f8237I, width, TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.f8271x)) {
                    this.f8271x = ellipsize;
                    this.f8272y = mo8998a(ellipsize);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo9001b(ColorStateList colorStateList) {
        if (this.f8259l != colorStateList) {
            this.f8259l = colorStateList;
            mo9006e();
        }
    }

    /* renamed from: c */
    public int mo9002c() {
        return mo8995a(this.f8259l);
    }

    /* renamed from: c */
    public void mo9003c(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f8250c) {
            this.f8250c = f;
            mo8996a(f);
        }
    }

    /* renamed from: d */
    public void mo9004d() {
        this.f8249b = this.f8252e.width() > 0 && this.f8252e.height() > 0 && this.f8251d.width() > 0 && this.f8251d.height() > 0;
    }

    /* renamed from: d */
    public final void mo9005d(float f) {
        mo9000b(f);
        this.f8273z = false;
        if (0 != 0 && this.f8229A == null && !this.f8251d.isEmpty() && !TextUtils.isEmpty(this.f8271x)) {
            mo8996a(0.0f);
            this.f8231C = this.f8237I.ascent();
            this.f8232D = this.f8237I.descent();
            TextPaint textPaint = this.f8237I;
            CharSequence charSequence = this.f8271x;
            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.f8232D - this.f8231C);
            if (round > 0 && round2 > 0) {
                this.f8229A = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
                Canvas canvas = new Canvas(this.f8229A);
                CharSequence charSequence2 = this.f8271x;
                canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.f8237I.descent(), this.f8237I);
                if (this.f8230B == null) {
                    this.f8230B = new Paint(3);
                }
            }
        }
        C1404o.m3507B(this.f8248a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0109  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9006e() {
        /*
            r11 = this;
            android.view.View r0 = r11.f8248a
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L_0x0117
            android.view.View r0 = r11.f8248a
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L_0x0117
            float r0 = r11.f8234F
            float r1 = r11.f8257j
            r11.mo9000b(r1)
            java.lang.CharSequence r1 = r11.f8271x
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0028
            android.text.TextPaint r4 = r11.f8237I
            int r5 = r1.length()
            float r1 = r4.measureText(r1, r2, r5)
            goto L_0x0029
        L_0x0028:
            r1 = r3
        L_0x0029:
            int r4 = r11.f8255h
            boolean r5 = r11.f8272y
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r5 = r4 & 112(0x70, float:1.57E-43)
            r6 = 80
            r7 = 48
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r7) goto L_0x0063
            if (r5 == r6) goto L_0x005d
            android.text.TextPaint r5 = r11.f8237I
            float r5 = r5.descent()
            android.text.TextPaint r9 = r11.f8237I
            float r9 = r9.ascent()
            float r5 = r5 - r9
            float r5 = r5 / r8
            android.text.TextPaint r9 = r11.f8237I
            float r9 = r9.descent()
            float r5 = r5 - r9
            android.graphics.Rect r9 = r11.f8252e
            int r9 = r9.centerY()
            float r9 = (float) r9
            float r9 = r9 + r5
            r11.f8261n = r9
            goto L_0x0071
        L_0x005d:
            android.graphics.Rect r5 = r11.f8252e
            int r5 = r5.bottom
            float r5 = (float) r5
            goto L_0x006f
        L_0x0063:
            android.graphics.Rect r5 = r11.f8252e
            int r5 = r5.top
            float r5 = (float) r5
            android.text.TextPaint r9 = r11.f8237I
            float r9 = r9.ascent()
            float r5 = r5 - r9
        L_0x006f:
            r11.f8261n = r5
        L_0x0071:
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r5
            r9 = 5
            r10 = 1
            if (r4 == r10) goto L_0x0089
            if (r4 == r9) goto L_0x0083
            android.graphics.Rect r1 = r11.f8252e
            int r1 = r1.left
            float r1 = (float) r1
            r11.f8263p = r1
            goto L_0x0094
        L_0x0083:
            android.graphics.Rect r4 = r11.f8252e
            int r4 = r4.right
            float r4 = (float) r4
            goto L_0x0091
        L_0x0089:
            android.graphics.Rect r4 = r11.f8252e
            int r4 = r4.centerX()
            float r4 = (float) r4
            float r1 = r1 / r8
        L_0x0091:
            float r4 = r4 - r1
            r11.f8263p = r4
        L_0x0094:
            float r1 = r11.f8256i
            r11.mo9000b(r1)
            java.lang.CharSequence r1 = r11.f8271x
            if (r1 == 0) goto L_0x00a7
            android.text.TextPaint r3 = r11.f8237I
            int r4 = r1.length()
            float r3 = r3.measureText(r1, r2, r4)
        L_0x00a7:
            int r1 = r11.f8254g
            boolean r2 = r11.f8272y
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r2)
            r2 = r1 & 112(0x70, float:1.57E-43)
            if (r2 == r7) goto L_0x00db
            if (r2 == r6) goto L_0x00d5
            android.text.TextPaint r2 = r11.f8237I
            float r2 = r2.descent()
            android.text.TextPaint r4 = r11.f8237I
            float r4 = r4.ascent()
            float r2 = r2 - r4
            float r2 = r2 / r8
            android.text.TextPaint r4 = r11.f8237I
            float r4 = r4.descent()
            float r2 = r2 - r4
            android.graphics.Rect r4 = r11.f8251d
            int r4 = r4.centerY()
            float r4 = (float) r4
            float r4 = r4 + r2
            r11.f8260m = r4
            goto L_0x00e9
        L_0x00d5:
            android.graphics.Rect r2 = r11.f8251d
            int r2 = r2.bottom
            float r2 = (float) r2
            goto L_0x00e7
        L_0x00db:
            android.graphics.Rect r2 = r11.f8251d
            int r2 = r2.top
            float r2 = (float) r2
            android.text.TextPaint r4 = r11.f8237I
            float r4 = r4.ascent()
            float r2 = r2 - r4
        L_0x00e7:
            r11.f8260m = r2
        L_0x00e9:
            r1 = r1 & r5
            if (r1 == r10) goto L_0x00fa
            if (r1 == r9) goto L_0x00f4
            android.graphics.Rect r1 = r11.f8251d
            int r1 = r1.left
            float r1 = (float) r1
            goto L_0x0103
        L_0x00f4:
            android.graphics.Rect r1 = r11.f8251d
            int r1 = r1.right
            float r1 = (float) r1
            goto L_0x0102
        L_0x00fa:
            android.graphics.Rect r1 = r11.f8251d
            int r1 = r1.centerX()
            float r1 = (float) r1
            float r3 = r3 / r8
        L_0x0102:
            float r1 = r1 - r3
        L_0x0103:
            r11.f8262o = r1
            android.graphics.Bitmap r1 = r11.f8229A
            if (r1 == 0) goto L_0x010f
            r1.recycle()
            r1 = 0
            r11.f8229A = r1
        L_0x010f:
            r11.mo9005d(r0)
            float r0 = r11.f8250c
            r11.mo8996a(r0)
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p271c.p273b0.C3296b.mo9006e():void");
    }

    /* renamed from: a */
    public final void mo8996a(float f) {
        int i;
        TextPaint textPaint;
        this.f8253f.left = m7657a((float) this.f8251d.left, (float) this.f8252e.left, f, this.f8239K);
        this.f8253f.top = m7657a(this.f8260m, this.f8261n, f, this.f8239K);
        this.f8253f.right = m7657a((float) this.f8251d.right, (float) this.f8252e.right, f, this.f8239K);
        this.f8253f.bottom = m7657a((float) this.f8251d.bottom, (float) this.f8252e.bottom, f, this.f8239K);
        this.f8264q = m7657a(this.f8262o, this.f8263p, f, this.f8239K);
        this.f8265r = m7657a(this.f8260m, this.f8261n, f, this.f8239K);
        mo9005d(m7657a(this.f8256i, this.f8257j, f, this.f8240L));
        ColorStateList colorStateList = this.f8259l;
        ColorStateList colorStateList2 = this.f8258k;
        if (colorStateList != colorStateList2) {
            textPaint = this.f8237I;
            i = m7658a(mo8995a(colorStateList2), mo9002c(), f);
        } else {
            textPaint = this.f8237I;
            i = mo9002c();
        }
        textPaint.setColor(i);
        this.f8237I.setShadowLayer(m7657a(this.f8245Q, this.f8241M, f, null), m7657a(this.f8246R, this.f8242N, f, null), m7657a(this.f8247S, this.f8243O, f, null), m7658a(mo8995a((ColorStateList) null), mo8995a(this.f8244P), f));
        C1404o.m3507B(this.f8248a);
    }

    /* renamed from: b */
    public float mo8999b() {
        TextPaint textPaint = this.f8238J;
        textPaint.setTextSize(this.f8257j);
        textPaint.setTypeface(this.f8266s);
        return -this.f8238J.ascent();
    }

    /* renamed from: a */
    public void mo8997a(Typeface typeface) {
        boolean z;
        C3319a aVar = this.f8269v;
        boolean z2 = true;
        if (aVar != null) {
            aVar.f8317c = true;
        }
        if (this.f8266s != typeface) {
            this.f8266s = typeface;
            z = true;
        } else {
            z = false;
        }
        if (this.f8267t != typeface) {
            this.f8267t = typeface;
        } else {
            z2 = false;
        }
        if (z || z2) {
            mo9006e();
        }
    }
}
