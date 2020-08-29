package p124p.p180p.p181d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0099a0;
import androidx.recyclerview.widget.RecyclerView.C0119n;
import androidx.recyclerview.widget.RecyclerView.C0128s;
import androidx.recyclerview.widget.RecyclerView.C0129t;
import p124p.p150h.p162l.C1404o;

/* renamed from: p.p.d.l */
public class C1590l extends C0119n implements C0128s {

    /* renamed from: D */
    public static final int[] f4658D = {16842919};

    /* renamed from: E */
    public static final int[] f4659E = new int[0];

    /* renamed from: A */
    public int f4660A = 0;

    /* renamed from: B */
    public final Runnable f4661B = new C1591a();

    /* renamed from: C */
    public final C0129t f4662C = new C1592b();

    /* renamed from: a */
    public final int f4663a;

    /* renamed from: b */
    public final int f4664b;

    /* renamed from: c */
    public final StateListDrawable f4665c;

    /* renamed from: d */
    public final Drawable f4666d;

    /* renamed from: e */
    public final int f4667e;

    /* renamed from: f */
    public final int f4668f;

    /* renamed from: g */
    public final StateListDrawable f4669g;

    /* renamed from: h */
    public final Drawable f4670h;

    /* renamed from: i */
    public final int f4671i;

    /* renamed from: j */
    public final int f4672j;

    /* renamed from: k */
    public int f4673k;

    /* renamed from: l */
    public int f4674l;

    /* renamed from: m */
    public float f4675m;

    /* renamed from: n */
    public int f4676n;

    /* renamed from: o */
    public int f4677o;

    /* renamed from: p */
    public float f4678p;

    /* renamed from: q */
    public int f4679q = 0;

    /* renamed from: r */
    public int f4680r = 0;

    /* renamed from: s */
    public RecyclerView f4681s;

    /* renamed from: t */
    public boolean f4682t = false;

    /* renamed from: u */
    public boolean f4683u = false;

    /* renamed from: v */
    public int f4684v = 0;

    /* renamed from: w */
    public int f4685w = 0;

    /* renamed from: x */
    public final int[] f4686x = new int[2];

    /* renamed from: y */
    public final int[] f4687y = new int[2];

    /* renamed from: z */
    public final ValueAnimator f4688z = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

    /* renamed from: p.p.d.l$a */
    public class C1591a implements Runnable {
        public C1591a() {
        }

        public void run() {
            C1590l lVar = C1590l.this;
            int i = lVar.f4660A;
            if (i == 1) {
                lVar.f4688z.cancel();
            } else if (i != 2) {
                return;
            }
            lVar.f4660A = 3;
            ValueAnimator valueAnimator = lVar.f4688z;
            valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
            lVar.f4688z.setDuration((long) 500);
            lVar.f4688z.start();
        }
    }

    /* renamed from: p.p.d.l$b */
    public class C1592b extends C0129t {
        public C1592b() {
        }

        /* renamed from: a */
        public void mo1257a(RecyclerView recyclerView, int i, int i2) {
            C1590l lVar = C1590l.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = lVar.f4681s.computeVerticalScrollRange();
            int i3 = lVar.f4680r;
            lVar.f4682t = computeVerticalScrollRange - i3 > 0 && i3 >= lVar.f4663a;
            int computeHorizontalScrollRange = lVar.f4681s.computeHorizontalScrollRange();
            int i4 = lVar.f4679q;
            boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= lVar.f4663a;
            lVar.f4683u = z;
            if (lVar.f4682t || z) {
                if (lVar.f4682t) {
                    float f = (float) i3;
                    lVar.f4674l = (int) ((((f / 2.0f) + ((float) computeVerticalScrollOffset)) * f) / ((float) computeVerticalScrollRange));
                    lVar.f4673k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
                }
                if (lVar.f4683u) {
                    float f2 = (float) computeHorizontalScrollOffset;
                    float f3 = (float) i4;
                    lVar.f4677o = (int) ((((f3 / 2.0f) + f2) * f3) / ((float) computeHorizontalScrollRange));
                    lVar.f4676n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
                }
                int i5 = lVar.f4684v;
                if (i5 == 0 || i5 == 1) {
                    lVar.mo6326a(1);
                }
            } else if (lVar.f4684v != 0) {
                lVar.mo6326a(0);
            }
        }
    }

    /* renamed from: p.p.d.l$c */
    public class C1593c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f4691a = false;

        public C1593c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f4691a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f4691a) {
                this.f4691a = false;
                return;
            }
            if (((Float) C1590l.this.f4688z.getAnimatedValue()).floatValue() == 0.0f) {
                C1590l lVar = C1590l.this;
                lVar.f4660A = 0;
                lVar.mo6326a(0);
            } else {
                C1590l lVar2 = C1590l.this;
                lVar2.f4660A = 2;
                lVar2.f4681s.invalidate();
            }
        }
    }

    /* renamed from: p.p.d.l$d */
    public class C1594d implements AnimatorUpdateListener {
        public C1594d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1590l.this.f4665c.setAlpha(floatValue);
            C1590l.this.f4666d.setAlpha(floatValue);
            C1590l.this.f4681s.invalidate();
        }
    }

    public C1590l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f4665c = stateListDrawable;
        this.f4666d = drawable;
        this.f4669g = stateListDrawable2;
        this.f4670h = drawable2;
        this.f4667e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f4668f = Math.max(i, drawable.getIntrinsicWidth());
        this.f4671i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f4672j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f4663a = i2;
        this.f4664b = i3;
        this.f4665c.setAlpha(255);
        this.f4666d.setAlpha(255);
        this.f4688z.addListener(new C1593c());
        this.f4688z.addUpdateListener(new C1594d());
        RecyclerView recyclerView2 = this.f4681s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(this);
                this.f4681s.removeOnItemTouchListener(this);
                this.f4681s.removeOnScrollListener(this.f4662C);
                mo6325a();
            }
            this.f4681s = recyclerView;
            if (recyclerView != null) {
                recyclerView.addItemDecoration(this);
                this.f4681s.addOnItemTouchListener(this);
                this.f4681s.addOnScrollListener(this.f4662C);
            }
        }
    }

    /* renamed from: a */
    public final int mo6324a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: a */
    public final void mo6325a() {
        this.f4681s.removeCallbacks(this.f4661B);
    }

    /* renamed from: a */
    public void mo6326a(int i) {
        int i2;
        if (i == 2 && this.f4684v != 2) {
            this.f4665c.setState(f4658D);
            mo6325a();
        }
        if (i == 0) {
            this.f4681s.invalidate();
        } else {
            mo6328b();
        }
        if (this.f4684v != 2 || i == 2) {
            if (i == 1) {
                i2 = 1500;
            }
            this.f4684v = i;
        }
        this.f4665c.setState(f4659E);
        i2 = 1200;
        mo6325a();
        this.f4681s.postDelayed(this.f4661B, (long) i2);
        this.f4684v = i;
    }

    /* renamed from: a */
    public void mo1253a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo6327a(float f, float f2) {
        if (f2 >= ((float) (this.f4680r - this.f4671i))) {
            int i = this.f4677o;
            int i2 = this.f4676n;
            if (f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo1254a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f4684v;
        if (i == 1) {
            boolean b = mo6329b(motionEvent.getX(), motionEvent.getY());
            boolean a = mo6327a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b && !a) {
                return false;
            }
            if (a) {
                this.f4685w = 1;
                this.f4678p = (float) ((int) motionEvent.getX());
            } else if (b) {
                this.f4685w = 2;
                this.f4675m = (float) ((int) motionEvent.getY());
            }
            mo6326a(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo6328b() {
        int i = this.f4660A;
        if (i != 0) {
            if (i == 3) {
                this.f4688z.cancel();
            } else {
                return;
            }
        }
        this.f4660A = 1;
        ValueAnimator valueAnimator = this.f4688z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f4688z.setDuration(500);
        this.f4688z.setStartDelay(0);
        this.f4688z.start();
    }

    /* renamed from: b */
    public boolean mo6329b(float f, float f2) {
        if (C1404o.m3551l(this.f4681s) == 1) {
            if (f > ((float) this.f4667e)) {
                return false;
            }
        } else if (f < ((float) (this.f4679q - this.f4667e))) {
            return false;
        }
        int i = this.f4674l;
        int i2 = this.f4673k / 2;
        if (f2 < ((float) (i - i2)) || f2 > ((float) (i2 + i))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo1197b(Canvas canvas, RecyclerView recyclerView, C0099a0 a0Var) {
        if (this.f4679q == this.f4681s.getWidth() && this.f4680r == this.f4681s.getHeight()) {
            if (this.f4660A != 0) {
                if (this.f4682t) {
                    int i = this.f4679q;
                    int i2 = this.f4667e;
                    int i3 = i - i2;
                    int i4 = this.f4674l;
                    int i5 = this.f4673k;
                    int i6 = i4 - (i5 / 2);
                    this.f4665c.setBounds(0, 0, i2, i5);
                    this.f4666d.setBounds(0, 0, this.f4668f, this.f4680r);
                    boolean z = true;
                    if (C1404o.m3551l(this.f4681s) != 1) {
                        z = false;
                    }
                    if (z) {
                        this.f4666d.draw(canvas);
                        canvas.translate((float) this.f4667e, (float) i6);
                        canvas.scale(-1.0f, 1.0f);
                        this.f4665c.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        i3 = this.f4667e;
                    } else {
                        canvas.translate((float) i3, 0.0f);
                        this.f4666d.draw(canvas);
                        canvas.translate(0.0f, (float) i6);
                        this.f4665c.draw(canvas);
                    }
                    canvas.translate((float) (-i3), (float) (-i6));
                }
                if (this.f4683u) {
                    int i7 = this.f4680r;
                    int i8 = this.f4671i;
                    int i9 = i7 - i8;
                    int i10 = this.f4677o;
                    int i11 = this.f4676n;
                    int i12 = i10 - (i11 / 2);
                    this.f4669g.setBounds(0, 0, i11, i8);
                    this.f4670h.setBounds(0, 0, this.f4679q, this.f4672j);
                    canvas.translate(0.0f, (float) i9);
                    this.f4670h.draw(canvas);
                    canvas.translate((float) i12, 0.0f);
                    this.f4669g.draw(canvas);
                    canvas.translate((float) (-i12), (float) (-i9));
                }
            }
            return;
        }
        this.f4679q = this.f4681s.getWidth();
        this.f4680r = this.f4681s.getHeight();
        mo6326a(0);
    }

    /* renamed from: b */
    public void mo1255b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f4684v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean b = mo6329b(motionEvent.getX(), motionEvent.getY());
                boolean a = mo6327a(motionEvent.getX(), motionEvent.getY());
                if (b || a) {
                    if (a) {
                        this.f4685w = 1;
                        this.f4678p = (float) ((int) motionEvent.getX());
                    } else if (b) {
                        this.f4685w = 2;
                        this.f4675m = (float) ((int) motionEvent.getY());
                    }
                    mo6326a(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f4684v == 2) {
                this.f4675m = 0.0f;
                this.f4678p = 0.0f;
                mo6326a(1);
                this.f4685w = 0;
            } else if (motionEvent.getAction() == 2 && this.f4684v == 2) {
                mo6328b();
                if (this.f4685w == 1) {
                    float x = motionEvent.getX();
                    int[] iArr = this.f4687y;
                    int i = this.f4664b;
                    iArr[0] = i;
                    iArr[1] = this.f4679q - i;
                    float max = Math.max((float) iArr[0], Math.min((float) iArr[1], x));
                    if (Math.abs(((float) this.f4677o) - max) >= 2.0f) {
                        int a2 = mo6324a(this.f4678p, max, iArr, this.f4681s.computeHorizontalScrollRange(), this.f4681s.computeHorizontalScrollOffset(), this.f4679q);
                        if (a2 != 0) {
                            this.f4681s.scrollBy(a2, 0);
                        }
                        this.f4678p = max;
                    }
                }
                if (this.f4685w == 2) {
                    float y = motionEvent.getY();
                    int[] iArr2 = this.f4686x;
                    int i2 = this.f4664b;
                    iArr2[0] = i2;
                    iArr2[1] = this.f4680r - i2;
                    float max2 = Math.max((float) iArr2[0], Math.min((float) iArr2[1], y));
                    if (Math.abs(((float) this.f4674l) - max2) >= 2.0f) {
                        int a3 = mo6324a(this.f4675m, max2, iArr2, this.f4681s.computeVerticalScrollRange(), this.f4681s.computeVerticalScrollOffset(), this.f4680r);
                        if (a3 != 0) {
                            this.f4681s.scrollBy(0, a3);
                        }
                        this.f4675m = max2;
                    }
                }
            }
        }
    }
}
