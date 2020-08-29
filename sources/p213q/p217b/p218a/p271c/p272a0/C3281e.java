package p213q.p217b.p218a.p271c.p272a0;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton.C0238b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p124p.p126b.p127k.C1061o;
import p124p.p150h.p162l.C1404o;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.p273b0.C3302g;
import p213q.p217b.p218a.p271c.p277f0.C3329b;
import p213q.p217b.p218a.p271c.p278g0.C3337g;
import p213q.p217b.p218a.p271c.p278g0.C3342j;
import p213q.p217b.p218a.p271c.p283m.C3407a;
import p213q.p217b.p218a.p271c.p283m.C3411e;
import p213q.p217b.p218a.p271c.p283m.C3412f;
import p213q.p217b.p218a.p271c.p283m.C3413g;

/* renamed from: q.b.a.c.a0.e */
public class C3281e {

    /* renamed from: A */
    public static final TimeInterpolator f8184A = C3407a.f8574c;

    /* renamed from: B */
    public static final int[] f8185B = {16842919, 16842910};

    /* renamed from: C */
    public static final int[] f8186C = {16843623, 16842908, 16842910};

    /* renamed from: D */
    public static final int[] f8187D = {16842908, 16842910};

    /* renamed from: E */
    public static final int[] f8188E = {16843623, 16842910};

    /* renamed from: F */
    public static final int[] f8189F = {16842910};

    /* renamed from: G */
    public static final int[] f8190G = new int[0];

    /* renamed from: a */
    public C3342j f8191a;

    /* renamed from: b */
    public C3337g f8192b;

    /* renamed from: c */
    public boolean f8193c;

    /* renamed from: d */
    public boolean f8194d = true;

    /* renamed from: e */
    public float f8195e;

    /* renamed from: f */
    public float f8196f;

    /* renamed from: g */
    public float f8197g;

    /* renamed from: h */
    public final C3302g f8198h;

    /* renamed from: i */
    public C3413g f8199i;

    /* renamed from: j */
    public C3413g f8200j;

    /* renamed from: k */
    public Animator f8201k;

    /* renamed from: l */
    public C3413g f8202l;

    /* renamed from: m */
    public C3413g f8203m;

    /* renamed from: n */
    public float f8204n;

    /* renamed from: o */
    public float f8205o = 1.0f;

    /* renamed from: p */
    public int f8206p = 0;

    /* renamed from: q */
    public ArrayList<AnimatorListener> f8207q;

    /* renamed from: r */
    public ArrayList<AnimatorListener> f8208r;

    /* renamed from: s */
    public ArrayList<C3286e> f8209s;

    /* renamed from: t */
    public final FloatingActionButton f8210t;

    /* renamed from: u */
    public final C3329b f8211u;

    /* renamed from: v */
    public final Rect f8212v = new Rect();

    /* renamed from: w */
    public final RectF f8213w = new RectF();

    /* renamed from: x */
    public final RectF f8214x = new RectF();

    /* renamed from: y */
    public final Matrix f8215y = new Matrix();

    /* renamed from: z */
    public OnPreDrawListener f8216z;

    /* renamed from: q.b.a.c.a0.e$a */
    public class C3282a extends C3412f {
        public C3282a() {
        }

        public Object evaluate(float f, Object obj, Object obj2) {
            Matrix matrix = (Matrix) obj;
            Matrix matrix2 = (Matrix) obj2;
            C3281e.this.f8205o = f;
            matrix.getValues(this.f8582a);
            matrix2.getValues(this.f8583b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f8583b;
                float f2 = fArr[i];
                float[] fArr2 = this.f8582a;
                fArr[i] = ((f2 - fArr2[i]) * f) + fArr2[i];
            }
            this.f8584c.setValues(this.f8583b);
            return this.f8584c;
        }
    }

    /* renamed from: q.b.a.c.a0.e$b */
    public class C3283b extends C3289h {
        public C3283b(C3281e eVar) {
            super(null);
        }

        /* renamed from: a */
        public float mo8980a() {
            return 0.0f;
        }
    }

    /* renamed from: q.b.a.c.a0.e$c */
    public class C3284c extends C3289h {
        public C3284c() {
            super(null);
        }

        /* renamed from: a */
        public float mo8980a() {
            C3281e eVar = C3281e.this;
            return eVar.f8195e + eVar.f8196f;
        }
    }

    /* renamed from: q.b.a.c.a0.e$d */
    public class C3285d extends C3289h {
        public C3285d() {
            super(null);
        }

        /* renamed from: a */
        public float mo8980a() {
            C3281e eVar = C3281e.this;
            return eVar.f8195e + eVar.f8197g;
        }
    }

    /* renamed from: q.b.a.c.a0.e$e */
    public interface C3286e {
        /* renamed from: a */
        void mo2136a();

        /* renamed from: b */
        void mo2137b();
    }

    /* renamed from: q.b.a.c.a0.e$f */
    public interface C3287f {
    }

    /* renamed from: q.b.a.c.a0.e$g */
    public class C3288g extends C3289h {
        public C3288g() {
            super(null);
        }

        /* renamed from: a */
        public float mo8980a() {
            return C3281e.this.f8195e;
        }
    }

    /* renamed from: q.b.a.c.a0.e$h */
    public abstract class C3289h extends AnimatorListenerAdapter implements AnimatorUpdateListener {

        /* renamed from: a */
        public boolean f8221a;

        /* renamed from: b */
        public float f8222b;

        /* renamed from: c */
        public float f8223c;

        public /* synthetic */ C3289h(C3279c cVar) {
        }

        /* renamed from: a */
        public abstract float mo8980a();

        public void onAnimationEnd(Animator animator) {
            if (C3281e.this != null) {
                this.f8221a = false;
                return;
            }
            throw null;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f8221a) {
                C3337g gVar = C3281e.this.f8192b;
                this.f8222b = gVar == null ? 0.0f : gVar.f8365e.f8401o;
                this.f8223c = mo8980a();
                this.f8221a = true;
            }
            C3281e eVar = C3281e.this;
            valueAnimator.getAnimatedFraction();
            if (eVar == null) {
                throw null;
            }
        }
    }

    public C3281e(FloatingActionButton floatingActionButton, C3329b bVar) {
        this.f8210t = floatingActionButton;
        this.f8211u = bVar;
        C3302g gVar = new C3302g();
        this.f8198h = gVar;
        gVar.mo9029a(f8185B, mo8961a((C3289h) new C3285d()));
        this.f8198h.mo9029a(f8186C, mo8961a((C3289h) new C3284c()));
        this.f8198h.mo9029a(f8187D, mo8961a((C3289h) new C3284c()));
        this.f8198h.mo9029a(f8188E, mo8961a((C3289h) new C3284c()));
        this.f8198h.mo9029a(f8189F, mo8961a((C3289h) new C3288g()));
        this.f8198h.mo9029a(f8190G, mo8961a((C3289h) new C3283b(this)));
        this.f8204n = this.f8210t.getRotation();
    }

    /* renamed from: a */
    public float mo8959a() {
        throw null;
    }

    /* renamed from: a */
    public final AnimatorSet mo8960a(C3413g gVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f8210t, View.ALPHA, new float[]{f});
        gVar.mo9189a("opacity").mo9194a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f8210t, View.SCALE_X, new float[]{f2});
        String str = "scale";
        gVar.mo9189a(str).mo9194a(ofFloat2);
        if (VERSION.SDK_INT == 26) {
            ofFloat2.setEvaluator(new C3290f(this));
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f8210t, View.SCALE_Y, new float[]{f2});
        gVar.mo9189a(str).mo9194a(ofFloat3);
        if (VERSION.SDK_INT == 26) {
            ofFloat3.setEvaluator(new C3290f(this));
        }
        arrayList.add(ofFloat3);
        this.f8215y.reset();
        this.f8210t.getDrawable();
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f8210t, new C3411e(), new C3282a(), new Matrix[]{new Matrix(this.f8215y)});
        gVar.mo9189a("iconScale").mo9194a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C2286e.m5227a(animatorSet, (List<Animator>) arrayList);
        return animatorSet;
    }

    /* renamed from: a */
    public final ValueAnimator mo8961a(C3289h hVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f8184A);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(hVar);
        valueAnimator.addUpdateListener(hVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: a */
    public void mo8963a(float f, float f2, float f3) {
        throw null;
    }

    /* renamed from: a */
    public void mo8964a(ColorStateList colorStateList) {
        throw null;
    }

    /* renamed from: a */
    public void mo8965a(Rect rect) {
        int i = 0;
        if (this.f8193c) {
            i = (0 - this.f8210t.getSizeDimension()) / 2;
        }
        float a = this.f8194d ? mo8959a() + this.f8197g : 0.0f;
        int max = Math.max(i, (int) Math.ceil((double) a));
        int max2 = Math.max(i, (int) Math.ceil((double) (a * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: a */
    public void mo8966a(int[] iArr) {
        throw null;
    }

    /* renamed from: b */
    public boolean mo8967b() {
        boolean z = false;
        if (this.f8210t.getVisibility() == 0) {
            if (this.f8206p == 1) {
                z = true;
            }
            return z;
        }
        if (this.f8206p != 2) {
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    public boolean mo8968c() {
        boolean z = false;
        if (this.f8210t.getVisibility() != 0) {
            if (this.f8206p == 2) {
                z = true;
            }
            return z;
        }
        if (this.f8206p != 1) {
            z = true;
        }
        return z;
    }

    /* renamed from: d */
    public void mo8969d() {
        throw null;
    }

    /* renamed from: e */
    public void mo8970e() {
        throw null;
    }

    /* renamed from: f */
    public void mo8971f() {
        ArrayList<C3286e> arrayList = this.f8209s;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C3286e) it.next()).mo2137b();
            }
        }
    }

    /* renamed from: g */
    public void mo8972g() {
        ArrayList<C3286e> arrayList = this.f8209s;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C3286e) it.next()).mo2136a();
            }
        }
    }

    /* renamed from: h */
    public boolean mo8973h() {
        throw null;
    }

    /* renamed from: i */
    public boolean mo8974i() {
        throw null;
    }

    /* renamed from: j */
    public final boolean mo8975j() {
        return C1404o.m3563x(this.f8210t) && !this.f8210t.isInEditMode();
    }

    /* renamed from: k */
    public final boolean mo8976k() {
        return !this.f8193c || this.f8210t.getSizeDimension() >= 0;
    }

    /* renamed from: l */
    public void mo8977l() {
        throw null;
    }

    /* renamed from: m */
    public final void mo8978m() {
        Rect rect = this.f8212v;
        mo8965a(rect);
        C1061o.m2465a(null, (Object) "Didn't initialize content background");
        if (mo8974i()) {
            InsetDrawable insetDrawable = new InsetDrawable(null, rect.left, rect.top, rect.right, rect.bottom);
            C0238b bVar = (C0238b) this.f8211u;
            if (bVar != null) {
                C3281e.super.setBackgroundDrawable(insetDrawable);
            } else {
                throw null;
            }
        } else if (((C0238b) this.f8211u) == null) {
            throw null;
        }
        C3329b bVar2 = this.f8211u;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        C0238b bVar3 = (C0238b) bVar2;
        FloatingActionButton.this.f1328o.set(i, i2, i3, i4);
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        int i5 = floatingActionButton.f1326m;
        floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }

    /* renamed from: a */
    public final void mo8962a(float f) {
        this.f8205o = f;
        Matrix matrix = this.f8215y;
        matrix.reset();
        this.f8210t.getDrawable();
        this.f8210t.setImageMatrix(matrix);
    }
}
