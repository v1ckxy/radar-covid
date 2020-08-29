package p213q.p217b.p218a.p271c.p292v;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.p127k.C1061o;
import p124p.p150h.p154f.C1335a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.p273b0.C3305h;
import p213q.p217b.p218a.p271c.p273b0.C3305h.C3307b;
import p213q.p217b.p218a.p271c.p275d0.C3321b;
import p213q.p217b.p218a.p271c.p276e0.C3326a;
import p213q.p217b.p218a.p271c.p278g0.C3337g;
import p213q.p217b.p218a.p271c.p278g0.C3342j;
import p213q.p217b.p218a.p271c.p283m.C3413g;
import p213q.p217b.p218a.p271c.p296y.C3495a;

/* renamed from: q.b.a.c.v.b */
public class C3450b extends C3337g implements Callback, C3307b {

    /* renamed from: J0 */
    public static final int[] f8743J0 = {16842910};

    /* renamed from: K0 */
    public static final ShapeDrawable f8744K0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A */
    public ColorStateList f8745A;

    /* renamed from: A0 */
    public Mode f8746A0 = Mode.SRC_IN;

    /* renamed from: B */
    public ColorStateList f8747B;

    /* renamed from: B0 */
    public int[] f8748B0;

    /* renamed from: C */
    public float f8749C;

    /* renamed from: C0 */
    public boolean f8750C0;

    /* renamed from: D */
    public float f8751D;

    /* renamed from: D0 */
    public ColorStateList f8752D0;

    /* renamed from: E */
    public ColorStateList f8753E;

    /* renamed from: E0 */
    public WeakReference<C3451a> f8754E0;

    /* renamed from: F */
    public float f8755F;

    /* renamed from: F0 */
    public TruncateAt f8756F0;

    /* renamed from: G */
    public ColorStateList f8757G;

    /* renamed from: G0 */
    public boolean f8758G0;

    /* renamed from: H */
    public CharSequence f8759H;

    /* renamed from: H0 */
    public int f8760H0;

    /* renamed from: I */
    public boolean f8761I;

    /* renamed from: I0 */
    public boolean f8762I0;

    /* renamed from: J */
    public Drawable f8763J;

    /* renamed from: K */
    public ColorStateList f8764K;

    /* renamed from: L */
    public float f8765L;

    /* renamed from: M */
    public boolean f8766M;

    /* renamed from: N */
    public boolean f8767N;

    /* renamed from: O */
    public Drawable f8768O;

    /* renamed from: P */
    public Drawable f8769P;

    /* renamed from: Q */
    public ColorStateList f8770Q;

    /* renamed from: R */
    public float f8771R;

    /* renamed from: S */
    public CharSequence f8772S;

    /* renamed from: T */
    public boolean f8773T;

    /* renamed from: U */
    public boolean f8774U;

    /* renamed from: V */
    public Drawable f8775V;

    /* renamed from: W */
    public C3413g f8776W;

    /* renamed from: X */
    public C3413g f8777X;

    /* renamed from: Y */
    public float f8778Y;

    /* renamed from: Z */
    public float f8779Z;

    /* renamed from: a0 */
    public float f8780a0;

    /* renamed from: b0 */
    public float f8781b0;

    /* renamed from: c0 */
    public float f8782c0;

    /* renamed from: d0 */
    public float f8783d0;

    /* renamed from: e0 */
    public float f8784e0;

    /* renamed from: f0 */
    public float f8785f0;

    /* renamed from: g0 */
    public final Context f8786g0;

    /* renamed from: h0 */
    public final Paint f8787h0 = new Paint(1);

    /* renamed from: i0 */
    public final Paint f8788i0;

    /* renamed from: j0 */
    public final FontMetrics f8789j0 = new FontMetrics();

    /* renamed from: k0 */
    public final RectF f8790k0 = new RectF();

    /* renamed from: l0 */
    public final PointF f8791l0 = new PointF();

    /* renamed from: m0 */
    public final Path f8792m0 = new Path();

    /* renamed from: n0 */
    public final C3305h f8793n0;

    /* renamed from: o0 */
    public int f8794o0;

    /* renamed from: p0 */
    public int f8795p0;

    /* renamed from: q0 */
    public int f8796q0;

    /* renamed from: r0 */
    public int f8797r0;

    /* renamed from: s0 */
    public int f8798s0;

    /* renamed from: t0 */
    public int f8799t0;

    /* renamed from: u0 */
    public boolean f8800u0;

    /* renamed from: v0 */
    public int f8801v0;

    /* renamed from: w0 */
    public int f8802w0 = 255;

    /* renamed from: x0 */
    public ColorFilter f8803x0;

    /* renamed from: y0 */
    public PorterDuffColorFilter f8804y0;

    /* renamed from: z0 */
    public ColorStateList f8805z0;

    /* renamed from: q.b.a.c.v.b$a */
    public interface C3451a {
        /* renamed from: a */
        void mo1848a();
    }

    public C3450b(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C3342j.m7744a(context, attributeSet, i, i2).mo9102a());
        Paint paint = null;
        this.f8754E0 = new WeakReference<>(paint);
        this.f8365e.f8388b = new C3495a(context);
        mo9086j();
        this.f8786g0 = context;
        C3305h hVar = new C3305h(this);
        this.f8793n0 = hVar;
        this.f8759H = Objects.EMPTY_STRING;
        hVar.f8292a.density = context.getResources().getDisplayMetrics().density;
        this.f8788i0 = paint;
        if (paint != null) {
            paint.setStyle(Style.STROKE);
        }
        setState(f8743J0);
        mo9341b(f8743J0);
        this.f8758G0 = true;
        if (C3326a.f8335a) {
            f8744K0.setTint(-1);
        }
    }

    /* renamed from: f */
    public static boolean m7865f(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: h */
    public static boolean m7866h(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: a */
    public void mo9033a() {
        mo9375o();
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo9333a(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f8768O) {
                if (drawable.isStateful()) {
                    drawable.setState(this.f8748B0);
                }
                drawable.setTintList(this.f8770Q);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.f8763J;
            if (drawable == drawable2 && this.f8766M) {
                drawable2.setTintList(this.f8764K);
            }
        }
    }

    /* renamed from: a */
    public void mo9335a(C3321b bVar) {
        this.f8793n0.mo9032a(bVar, this.f8786g0);
    }

    /* renamed from: a */
    public void mo9336a(boolean z) {
        if (this.f8773T != z) {
            this.f8773T = z;
            float k = mo9367k();
            if (!z && this.f8800u0) {
                this.f8800u0 = false;
            }
            float k2 = mo9367k();
            invalidateSelf();
            if (k != k2) {
                mo9375o();
            }
        }
    }

    /* renamed from: b */
    public final void mo9338b(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (mo9381r()) {
            float f = this.f8785f0 + this.f8784e0;
            if (getLayoutDirection() == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.f8771R;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.f8771R;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f8771R;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: b */
    public void mo9339b(Drawable drawable) {
        if (this.f8775V != drawable) {
            float k = mo9367k();
            this.f8775V = drawable;
            float k2 = mo9367k();
            mo9353e(this.f8775V);
            mo9333a(this.f8775V);
            invalidateSelf();
            if (k != k2) {
                mo9375o();
            }
        }
    }

    /* renamed from: b */
    public void mo9340b(boolean z) {
        if (this.f8774U != z) {
            boolean p = mo9379p();
            this.f8774U = z;
            boolean p2 = mo9379p();
            if (p != p2) {
                if (p2) {
                    mo9333a(this.f8775V);
                } else {
                    mo9353e(this.f8775V);
                }
                invalidateSelf();
                mo9375o();
            }
        }
    }

    /* renamed from: b */
    public boolean mo9341b(int[] iArr) {
        if (!Arrays.equals(this.f8748B0, iArr)) {
            this.f8748B0 = iArr;
            if (mo9381r()) {
                return mo9337a(getState(), iArr);
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo9343c(ColorStateList colorStateList) {
        if (this.f8747B != colorStateList) {
            this.f8747B = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: c */
    public final void mo9344c(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (mo9381r()) {
            float f = this.f8785f0 + this.f8784e0 + this.f8771R + this.f8783d0 + this.f8782c0;
            if (getLayoutDirection() == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: c */
    public void mo9346c(boolean z) {
        if (this.f8761I != z) {
            boolean q = mo9380q();
            this.f8761I = z;
            boolean q2 = mo9380q();
            if (q != q2) {
                if (q2) {
                    mo9333a(this.f8763J);
                } else {
                    mo9353e(this.f8763J);
                }
                invalidateSelf();
                mo9375o();
            }
        }
    }

    /* renamed from: d */
    public void mo9347d(float f) {
        if (this.f8785f0 != f) {
            this.f8785f0 = f;
            invalidateSelf();
            mo9375o();
        }
    }

    /* renamed from: d */
    public void mo9348d(ColorStateList colorStateList) {
        this.f8766M = true;
        if (this.f8764K != colorStateList) {
            this.f8764K = colorStateList;
            if (mo9380q()) {
                this.f8763J.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: d */
    public void mo9350d(boolean z) {
        if (this.f8767N != z) {
            boolean r = mo9381r();
            this.f8767N = z;
            boolean r2 = mo9381r();
            if (r != r2) {
                if (r2) {
                    mo9333a(this.f8768O);
                } else {
                    mo9353e(this.f8768O);
                }
                invalidateSelf();
                mo9375o();
            }
        }
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Drawable drawable;
        int i6;
        float f;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            int i7 = this.f8802w0;
            if (i7 != 0) {
                int saveLayerAlpha = i7 < 255 ? canvas.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i7) : 0;
                if (!this.f8762I0) {
                    this.f8787h0.setColor(this.f8794o0);
                    this.f8787h0.setStyle(Style.FILL);
                    this.f8790k0.set(bounds);
                    canvas2.drawRoundRect(this.f8790k0, mo9371m(), mo9371m(), this.f8787h0);
                }
                if (!this.f8762I0) {
                    this.f8787h0.setColor(this.f8795p0);
                    this.f8787h0.setStyle(Style.FILL);
                    Paint paint = this.f8787h0;
                    ColorFilter colorFilter = this.f8803x0;
                    if (colorFilter == null) {
                        colorFilter = this.f8804y0;
                    }
                    paint.setColorFilter(colorFilter);
                    this.f8790k0.set(bounds);
                    canvas2.drawRoundRect(this.f8790k0, mo9371m(), mo9371m(), this.f8787h0);
                }
                if (this.f8762I0) {
                    super.draw(canvas);
                }
                if (this.f8755F > 0.0f && !this.f8762I0) {
                    this.f8787h0.setColor(this.f8797r0);
                    this.f8787h0.setStyle(Style.STROKE);
                    if (!this.f8762I0) {
                        Paint paint2 = this.f8787h0;
                        ColorFilter colorFilter2 = this.f8803x0;
                        if (colorFilter2 == null) {
                            colorFilter2 = this.f8804y0;
                        }
                        paint2.setColorFilter(colorFilter2);
                    }
                    float f2 = this.f8755F / 2.0f;
                    this.f8790k0.set(((float) bounds.left) + f2, ((float) bounds.top) + f2, ((float) bounds.right) - f2, ((float) bounds.bottom) - f2);
                    float f3 = this.f8751D - (this.f8755F / 2.0f);
                    canvas2.drawRoundRect(this.f8790k0, f3, f3, this.f8787h0);
                }
                this.f8787h0.setColor(this.f8798s0);
                this.f8787h0.setStyle(Style.FILL);
                this.f8790k0.set(bounds);
                if (!this.f8762I0) {
                    canvas2.drawRoundRect(this.f8790k0, mo9371m(), mo9371m(), this.f8787h0);
                } else {
                    mo9070b(new RectF(bounds), this.f8792m0);
                    mo9064a(canvas, this.f8787h0, this.f8792m0, this.f8365e.f8387a, mo9067b());
                }
                if (mo9380q()) {
                    mo9332a(bounds, this.f8790k0);
                    RectF rectF = this.f8790k0;
                    float f4 = rectF.left;
                    float f5 = rectF.top;
                    canvas2.translate(f4, f5);
                    this.f8763J.setBounds(0, 0, (int) this.f8790k0.width(), (int) this.f8790k0.height());
                    this.f8763J.draw(canvas2);
                    canvas2.translate(-f4, -f5);
                }
                if (mo9379p()) {
                    mo9332a(bounds, this.f8790k0);
                    RectF rectF2 = this.f8790k0;
                    float f6 = rectF2.left;
                    float f7 = rectF2.top;
                    canvas2.translate(f6, f7);
                    this.f8775V.setBounds(0, 0, (int) this.f8790k0.width(), (int) this.f8790k0.height());
                    this.f8775V.draw(canvas2);
                    canvas2.translate(-f6, -f7);
                }
                if (!this.f8758G0 || this.f8759H == null) {
                    i = saveLayerAlpha;
                    i2 = 0;
                    i3 = 255;
                } else {
                    PointF pointF = this.f8791l0;
                    pointF.set(0.0f, 0.0f);
                    Align align = Align.LEFT;
                    if (this.f8759H != null) {
                        float k = mo9367k() + this.f8778Y + this.f8781b0;
                        if (getLayoutDirection() == 0) {
                            pointF.x = ((float) bounds.left) + k;
                            align = Align.LEFT;
                        } else {
                            pointF.x = ((float) bounds.right) - k;
                            align = Align.RIGHT;
                        }
                        float centerY = (float) bounds.centerY();
                        this.f8793n0.f8292a.getFontMetrics(this.f8789j0);
                        FontMetrics fontMetrics = this.f8789j0;
                        pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                    }
                    RectF rectF3 = this.f8790k0;
                    rectF3.setEmpty();
                    if (this.f8759H != null) {
                        float k2 = mo9367k() + this.f8778Y + this.f8781b0;
                        float l = mo9369l() + this.f8785f0 + this.f8782c0;
                        if (getLayoutDirection() == 0) {
                            rectF3.left = ((float) bounds.left) + k2;
                            f = ((float) bounds.right) - l;
                        } else {
                            rectF3.left = ((float) bounds.left) + l;
                            f = ((float) bounds.right) - k2;
                        }
                        rectF3.right = f;
                        rectF3.top = (float) bounds.top;
                        rectF3.bottom = (float) bounds.bottom;
                    }
                    C3305h hVar = this.f8793n0;
                    if (hVar.f8297f != null) {
                        hVar.f8292a.drawableState = getState();
                        C3305h hVar2 = this.f8793n0;
                        hVar2.f8297f.mo9046a(this.f8786g0, hVar2.f8292a, hVar2.f8293b);
                    }
                    this.f8793n0.f8292a.setTextAlign(align);
                    boolean z = Math.round(this.f8793n0.mo9031a(this.f8759H.toString())) > Math.round(this.f8790k0.width());
                    if (z) {
                        i6 = canvas.save();
                        canvas2.clipRect(this.f8790k0);
                    } else {
                        i6 = 0;
                    }
                    CharSequence charSequence = this.f8759H;
                    if (z && this.f8756F0 != null) {
                        charSequence = TextUtils.ellipsize(charSequence, this.f8793n0.f8292a, this.f8790k0.width(), this.f8756F0);
                    }
                    CharSequence charSequence2 = charSequence;
                    int length = charSequence2.length();
                    PointF pointF2 = this.f8791l0;
                    i = saveLayerAlpha;
                    float f8 = pointF2.x;
                    i2 = 0;
                    float f9 = pointF2.y;
                    i3 = 255;
                    canvas.drawText(charSequence2, 0, length, f8, f9, this.f8793n0.f8292a);
                    if (z) {
                        canvas2.restoreToCount(i6);
                    }
                }
                if (mo9381r()) {
                    mo9338b(bounds, this.f8790k0);
                    RectF rectF4 = this.f8790k0;
                    float f10 = rectF4.left;
                    float f11 = rectF4.top;
                    canvas2.translate(f10, f11);
                    this.f8768O.setBounds(i2, i2, (int) this.f8790k0.width(), (int) this.f8790k0.height());
                    if (C3326a.f8335a) {
                        this.f8769P.setBounds(this.f8768O.getBounds());
                        this.f8769P.jumpToCurrentState();
                        drawable = this.f8769P;
                    } else {
                        drawable = this.f8768O;
                    }
                    drawable.draw(canvas2);
                    canvas2.translate(-f10, -f11);
                }
                Paint paint3 = this.f8788i0;
                if (paint3 != null) {
                    paint3.setColor(C1335a.m3389b(-16777216, 127));
                    canvas2.drawRect(bounds, this.f8788i0);
                    if (mo9380q() || mo9379p()) {
                        mo9332a(bounds, this.f8790k0);
                        canvas2.drawRect(this.f8790k0, this.f8788i0);
                    }
                    if (this.f8759H != null) {
                        i5 = i3;
                        i4 = i;
                        canvas.drawLine((float) bounds.left, bounds.exactCenterY(), (float) bounds.right, bounds.exactCenterY(), this.f8788i0);
                    } else {
                        i5 = i3;
                        i4 = i;
                    }
                    if (mo9381r()) {
                        mo9338b(bounds, this.f8790k0);
                        canvas2.drawRect(this.f8790k0, this.f8788i0);
                    }
                    this.f8788i0.setColor(C1335a.m3389b(-65536, 127));
                    RectF rectF5 = this.f8790k0;
                    rectF5.set(bounds);
                    if (mo9381r()) {
                        float f12 = this.f8785f0 + this.f8784e0 + this.f8771R + this.f8783d0 + this.f8782c0;
                        if (getLayoutDirection() == 0) {
                            rectF5.right = ((float) bounds.right) - f12;
                        } else {
                            rectF5.left = ((float) bounds.left) + f12;
                        }
                    }
                    canvas2.drawRect(this.f8790k0, this.f8788i0);
                    this.f8788i0.setColor(C1335a.m3389b(-16711936, 127));
                    mo9344c(bounds, this.f8790k0);
                    canvas2.drawRect(this.f8790k0, this.f8788i0);
                } else {
                    i5 = i3;
                    i4 = i;
                }
                if (this.f8802w0 < i5) {
                    canvas2.restoreToCount(i4);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo9351e(float f) {
        if (this.f8765L != f) {
            float k = mo9367k();
            this.f8765L = f;
            float k2 = mo9367k();
            invalidateSelf();
            if (k != k2) {
                mo9375o();
            }
        }
    }

    /* renamed from: e */
    public void mo9352e(ColorStateList colorStateList) {
        if (this.f8753E != colorStateList) {
            this.f8753E = colorStateList;
            if (this.f8762I0) {
                mo9069b(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: e */
    public final void mo9353e(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: e */
    public void mo9354e(boolean z) {
        if (this.f8750C0 != z) {
            this.f8750C0 = z;
            this.f8752D0 = z ? C3326a.m7708a(this.f8757G) : null;
            onStateChange(getState());
        }
    }

    /* renamed from: f */
    public void mo9355f(float f) {
        if (this.f8749C != f) {
            this.f8749C = f;
            invalidateSelf();
            mo9375o();
        }
    }

    /* renamed from: f */
    public void mo9356f(ColorStateList colorStateList) {
        if (this.f8770Q != colorStateList) {
            this.f8770Q = colorStateList;
            if (mo9381r()) {
                this.f8768O.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: g */
    public void mo9357g(float f) {
        if (this.f8778Y != f) {
            this.f8778Y = f;
            invalidateSelf();
            mo9375o();
        }
    }

    /* renamed from: g */
    public void mo9358g(ColorStateList colorStateList) {
        if (this.f8757G != colorStateList) {
            this.f8757G = colorStateList;
            this.f8752D0 = this.f8750C0 ? C3326a.m7708a(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public int getAlpha() {
        return this.f8802w0;
    }

    public ColorFilter getColorFilter() {
        return this.f8803x0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f8749C;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(mo9369l() + this.f8793n0.mo9031a(this.f8759H.toString()) + mo9367k() + this.f8778Y + this.f8781b0 + this.f8782c0 + this.f8785f0), this.f8760H0);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f8762I0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f8751D);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f8749C, this.f8751D);
        }
        outline.setAlpha(((float) this.f8802w0) / 255.0f);
    }

    /* renamed from: h */
    public void mo9363h(float f) {
        if (this.f8755F != f) {
            this.f8755F = f;
            this.f8787h0.setStrokeWidth(f);
            if (this.f8762I0) {
                this.f8365e.f8398l = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* renamed from: i */
    public void mo9364i(float f) {
        if (this.f8784e0 != f) {
            this.f8784e0 = f;
            invalidateSelf();
            if (mo9381r()) {
                mo9375o();
            }
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r3 = this;
            android.content.res.ColorStateList r0 = r3.f8745A
            boolean r0 = m7866h(r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0064
            android.content.res.ColorStateList r0 = r3.f8747B
            boolean r0 = m7866h(r0)
            if (r0 != 0) goto L_0x0064
            android.content.res.ColorStateList r0 = r3.f8753E
            boolean r0 = m7866h(r0)
            if (r0 != 0) goto L_0x0064
            boolean r0 = r3.f8750C0
            if (r0 == 0) goto L_0x0026
            android.content.res.ColorStateList r0 = r3.f8752D0
            boolean r0 = m7866h(r0)
            if (r0 != 0) goto L_0x0064
        L_0x0026:
            q.b.a.c.b0.h r0 = r3.f8793n0
            q.b.a.c.d0.b r0 = r0.f8297f
            if (r0 == 0) goto L_0x0038
            android.content.res.ColorStateList r0 = r0.f8319b
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0038
            r0 = r2
            goto L_0x0039
        L_0x0038:
            r0 = r1
        L_0x0039:
            if (r0 != 0) goto L_0x0064
            boolean r0 = r3.f8774U
            if (r0 == 0) goto L_0x0049
            android.graphics.drawable.Drawable r0 = r3.f8775V
            if (r0 == 0) goto L_0x0049
            boolean r0 = r3.f8773T
            if (r0 == 0) goto L_0x0049
            r0 = r2
            goto L_0x004a
        L_0x0049:
            r0 = r1
        L_0x004a:
            if (r0 != 0) goto L_0x0064
            android.graphics.drawable.Drawable r0 = r3.f8763J
            boolean r0 = m7865f(r0)
            if (r0 != 0) goto L_0x0064
            android.graphics.drawable.Drawable r0 = r3.f8775V
            boolean r0 = m7865f(r0)
            if (r0 != 0) goto L_0x0064
            android.content.res.ColorStateList r0 = r3.f8805z0
            boolean r0 = m7866h(r0)
            if (r0 == 0) goto L_0x0065
        L_0x0064:
            r1 = r2
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p271c.p292v.C3450b.isStateful():boolean");
    }

    /* renamed from: j */
    public void mo9366j(float f) {
        if (this.f8771R != f) {
            this.f8771R = f;
            invalidateSelf();
            if (mo9381r()) {
                mo9375o();
            }
        }
    }

    /* renamed from: k */
    public float mo9367k() {
        if (mo9380q() || mo9379p()) {
            return this.f8779Z + this.f8765L + this.f8780a0;
        }
        return 0.0f;
    }

    /* renamed from: k */
    public void mo9368k(float f) {
        if (this.f8783d0 != f) {
            this.f8783d0 = f;
            invalidateSelf();
            if (mo9381r()) {
                mo9375o();
            }
        }
    }

    /* renamed from: l */
    public float mo9369l() {
        if (mo9381r()) {
            return this.f8783d0 + this.f8771R + this.f8784e0;
        }
        return 0.0f;
    }

    /* renamed from: l */
    public void mo9370l(float f) {
        if (this.f8780a0 != f) {
            float k = mo9367k();
            this.f8780a0 = f;
            float k2 = mo9367k();
            invalidateSelf();
            if (k != k2) {
                mo9375o();
            }
        }
    }

    /* renamed from: m */
    public float mo9371m() {
        return this.f8762I0 ? mo9076g() : this.f8751D;
    }

    /* renamed from: m */
    public void mo9372m(float f) {
        if (this.f8779Z != f) {
            float k = mo9367k();
            this.f8779Z = f;
            float k2 = mo9367k();
            invalidateSelf();
            if (k != k2) {
                mo9375o();
            }
        }
    }

    /* renamed from: n */
    public Drawable mo9373n() {
        Drawable drawable = this.f8768O;
        if (drawable != null) {
            return C1061o.m2456a(drawable);
        }
        return null;
    }

    /* renamed from: n */
    public void mo9374n(float f) {
        if (this.f8782c0 != f) {
            this.f8782c0 = f;
            invalidateSelf();
            mo9375o();
        }
    }

    /* renamed from: o */
    public void mo9375o() {
        C3451a aVar = (C3451a) this.f8754E0.get();
        if (aVar != null) {
            aVar.mo1848a();
        }
    }

    /* renamed from: o */
    public void mo9376o(float f) {
        if (this.f8781b0 != f) {
            this.f8781b0 = f;
            invalidateSelf();
            mo9375o();
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (mo9380q()) {
            onLayoutDirectionChanged |= this.f8763J.setLayoutDirection(i);
        }
        if (mo9379p()) {
            onLayoutDirectionChanged |= this.f8775V.setLayoutDirection(i);
        }
        if (mo9381r()) {
            onLayoutDirectionChanged |= this.f8768O.setLayoutDirection(i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
        }
        return true;
    }

    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (mo9380q()) {
            onLevelChange |= this.f8763J.setLevel(i);
        }
        if (mo9379p()) {
            onLevelChange |= this.f8775V.setLevel(i);
        }
        if (mo9381r()) {
            onLevelChange |= this.f8768O.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.f8762I0) {
            super.onStateChange(iArr);
        }
        return mo9337a(iArr, this.f8748B0);
    }

    /* renamed from: p */
    public final boolean mo9379p() {
        return this.f8774U && this.f8775V != null && this.f8800u0;
    }

    /* renamed from: q */
    public final boolean mo9380q() {
        return this.f8761I && this.f8763J != null;
    }

    /* renamed from: r */
    public final boolean mo9381r() {
        return this.f8767N && this.f8768O != null;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f8802w0 != i) {
            this.f8802w0 = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f8803x0 != colorFilter) {
            this.f8803x0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f8805z0 != colorStateList) {
            this.f8805z0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(Mode mode) {
        if (this.f8746A0 != mode) {
            this.f8746A0 = mode;
            this.f8804y0 = C2286e.m5176a((Drawable) this, this.f8805z0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (mo9380q()) {
            visible |= this.f8763J.setVisible(z, z2);
        }
        if (mo9379p()) {
            visible |= this.f8775V.setVisible(z, z2);
        }
        if (mo9381r()) {
            visible |= this.f8768O.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    @Deprecated
    /* renamed from: c */
    public void mo9342c(float f) {
        if (this.f8751D != f) {
            this.f8751D = f;
            setShapeAppearanceModel(this.f8365e.f8387a.mo9099a(f));
        }
    }

    /* renamed from: d */
    public void mo9349d(Drawable drawable) {
        Drawable n = mo9373n();
        if (n != drawable) {
            float l = mo9369l();
            this.f8768O = drawable != null ? drawable.mutate() : null;
            if (C3326a.f8335a) {
                this.f8769P = new RippleDrawable(C3326a.m7708a(this.f8757G), this.f8768O, f8744K0);
            }
            float l2 = mo9369l();
            mo9353e(n);
            if (mo9381r()) {
                mo9333a(this.f8768O);
            }
            invalidateSelf();
            if (l != l2) {
                mo9375o();
            }
        }
    }

    /* renamed from: c */
    public void mo9345c(Drawable drawable) {
        Drawable drawable2 = this.f8763J;
        Drawable drawable3 = null;
        Drawable a = drawable2 != null ? C1061o.m2456a(drawable2) : null;
        if (a != drawable) {
            float k = mo9367k();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f8763J = drawable3;
            float k2 = mo9367k();
            mo9353e(a);
            if (mo9380q()) {
                mo9333a(this.f8763J);
            }
            invalidateSelf();
            if (k != k2) {
                mo9375o();
            }
        }
    }

    /* renamed from: a */
    public final void mo9332a(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (mo9380q() || mo9379p()) {
            float f = this.f8778Y + this.f8779Z;
            if (getLayoutDirection() == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + this.f8765L;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - this.f8765L;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f8765L;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0144  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9337a(int[] r9, int[] r10) {
        /*
            r8 = this;
            boolean r0 = super.onStateChange(r9)
            android.content.res.ColorStateList r1 = r8.f8745A
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r8.f8794o0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0011
        L_0x0010:
            r1 = r2
        L_0x0011:
            int r3 = r8.f8794o0
            r4 = 1
            if (r3 == r1) goto L_0x0019
            r8.f8794o0 = r1
            r0 = r4
        L_0x0019:
            android.content.res.ColorStateList r3 = r8.f8747B
            if (r3 == 0) goto L_0x0024
            int r5 = r8.f8795p0
            int r3 = r3.getColorForState(r9, r5)
            goto L_0x0025
        L_0x0024:
            r3 = r2
        L_0x0025:
            int r5 = r8.f8795p0
            if (r5 == r3) goto L_0x002c
            r8.f8795p0 = r3
            r0 = r4
        L_0x002c:
            int r1 = p124p.p150h.p154f.C1335a.m3387a(r3, r1)
            int r3 = r8.f8796q0
            if (r3 == r1) goto L_0x0036
            r3 = r4
            goto L_0x0037
        L_0x0036:
            r3 = r2
        L_0x0037:
            q.b.a.c.g0.g$b r5 = r8.f8365e
            android.content.res.ColorStateList r5 = r5.f8390d
            if (r5 != 0) goto L_0x003f
            r5 = r4
            goto L_0x0040
        L_0x003f:
            r5 = r2
        L_0x0040:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x004d
            r8.f8796q0 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r8.mo9063a(r0)
            r0 = r4
        L_0x004d:
            android.content.res.ColorStateList r1 = r8.f8753E
            if (r1 == 0) goto L_0x0058
            int r3 = r8.f8797r0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0059
        L_0x0058:
            r1 = r2
        L_0x0059:
            int r3 = r8.f8797r0
            if (r3 == r1) goto L_0x0060
            r8.f8797r0 = r1
            r0 = r4
        L_0x0060:
            android.content.res.ColorStateList r1 = r8.f8752D0
            if (r1 == 0) goto L_0x0073
            boolean r1 = p213q.p217b.p218a.p271c.p276e0.C3326a.m7709a(r9)
            if (r1 == 0) goto L_0x0073
            android.content.res.ColorStateList r1 = r8.f8752D0
            int r3 = r8.f8798s0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0074
        L_0x0073:
            r1 = r2
        L_0x0074:
            int r3 = r8.f8798s0
            if (r3 == r1) goto L_0x007f
            r8.f8798s0 = r1
            boolean r1 = r8.f8750C0
            if (r1 == 0) goto L_0x007f
            r0 = r4
        L_0x007f:
            q.b.a.c.b0.h r1 = r8.f8793n0
            q.b.a.c.d0.b r1 = r1.f8297f
            if (r1 == 0) goto L_0x0090
            android.content.res.ColorStateList r1 = r1.f8319b
            if (r1 == 0) goto L_0x0090
            int r3 = r8.f8799t0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0091
        L_0x0090:
            r1 = r2
        L_0x0091:
            int r3 = r8.f8799t0
            if (r3 == r1) goto L_0x0098
            r8.f8799t0 = r1
            r0 = r4
        L_0x0098:
            int[] r1 = r8.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r1 != 0) goto L_0x00a2
            goto L_0x00af
        L_0x00a2:
            int r5 = r1.length
            r6 = r2
        L_0x00a4:
            if (r6 >= r5) goto L_0x00af
            r7 = r1[r6]
            if (r7 != r3) goto L_0x00ac
            r1 = r4
            goto L_0x00b0
        L_0x00ac:
            int r6 = r6 + 1
            goto L_0x00a4
        L_0x00af:
            r1 = r2
        L_0x00b0:
            if (r1 == 0) goto L_0x00b8
            boolean r1 = r8.f8773T
            if (r1 == 0) goto L_0x00b8
            r1 = r4
            goto L_0x00b9
        L_0x00b8:
            r1 = r2
        L_0x00b9:
            boolean r3 = r8.f8800u0
            if (r3 == r1) goto L_0x00d5
            android.graphics.drawable.Drawable r3 = r8.f8775V
            if (r3 == 0) goto L_0x00d5
            float r0 = r8.mo9367k()
            r8.f8800u0 = r1
            float r1 = r8.mo9367k()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d2
            r0 = r4
            r1 = r0
            goto L_0x00d6
        L_0x00d2:
            r1 = r2
            r0 = r4
            goto L_0x00d6
        L_0x00d5:
            r1 = r2
        L_0x00d6:
            android.content.res.ColorStateList r3 = r8.f8805z0
            if (r3 == 0) goto L_0x00e1
            int r5 = r8.f8801v0
            int r3 = r3.getColorForState(r9, r5)
            goto L_0x00e2
        L_0x00e1:
            r3 = r2
        L_0x00e2:
            int r5 = r8.f8801v0
            if (r5 == r3) goto L_0x00f3
            r8.f8801v0 = r3
            android.content.res.ColorStateList r0 = r8.f8805z0
            android.graphics.PorterDuff$Mode r3 = r8.f8746A0
            android.graphics.PorterDuffColorFilter r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5176a(r8, r0, r3)
            r8.f8804y0 = r0
            goto L_0x00f4
        L_0x00f3:
            r4 = r0
        L_0x00f4:
            android.graphics.drawable.Drawable r0 = r8.f8763J
            boolean r0 = m7865f(r0)
            if (r0 == 0) goto L_0x0103
            android.graphics.drawable.Drawable r0 = r8.f8763J
            boolean r0 = r0.setState(r9)
            r4 = r4 | r0
        L_0x0103:
            android.graphics.drawable.Drawable r0 = r8.f8775V
            boolean r0 = m7865f(r0)
            if (r0 == 0) goto L_0x0112
            android.graphics.drawable.Drawable r0 = r8.f8775V
            boolean r0 = r0.setState(r9)
            r4 = r4 | r0
        L_0x0112:
            android.graphics.drawable.Drawable r0 = r8.f8768O
            boolean r0 = m7865f(r0)
            if (r0 == 0) goto L_0x012f
            int r0 = r9.length
            int r3 = r10.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r9.length
            java.lang.System.arraycopy(r9, r2, r0, r2, r3)
            int r9 = r9.length
            int r3 = r10.length
            java.lang.System.arraycopy(r10, r2, r0, r9, r3)
            android.graphics.drawable.Drawable r9 = r8.f8768O
            boolean r9 = r9.setState(r0)
            r4 = r4 | r9
        L_0x012f:
            boolean r9 = p213q.p217b.p218a.p271c.p276e0.C3326a.f8335a
            if (r9 == 0) goto L_0x0142
            android.graphics.drawable.Drawable r9 = r8.f8769P
            boolean r9 = m7865f(r9)
            if (r9 == 0) goto L_0x0142
            android.graphics.drawable.Drawable r9 = r8.f8769P
            boolean r9 = r9.setState(r10)
            r4 = r4 | r9
        L_0x0142:
            if (r4 == 0) goto L_0x0147
            r8.invalidateSelf()
        L_0x0147:
            if (r1 == 0) goto L_0x014c
            r8.mo9375o()
        L_0x014c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p271c.p292v.C3450b.mo9337a(int[], int[]):boolean");
    }

    /* renamed from: a */
    public void mo9334a(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = Objects.EMPTY_STRING;
        }
        if (!TextUtils.equals(this.f8759H, charSequence)) {
            this.f8759H = charSequence;
            this.f8793n0.f8295d = true;
            invalidateSelf();
            mo9375o();
        }
    }
}
