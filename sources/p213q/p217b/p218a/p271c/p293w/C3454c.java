package p213q.p217b.p218a.p271c.p293w;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.c.w.c */
public interface C3454c {

    /* renamed from: q.b.a.c.w.c$b */
    public static class C3456b implements TypeEvaluator<C3459e> {

        /* renamed from: b */
        public static final TypeEvaluator<C3459e> f8807b = new C3456b();

        /* renamed from: a */
        public final C3459e f8808a = new C3459e(null);

        public Object evaluate(float f, Object obj, Object obj2) {
            C3459e eVar = (C3459e) obj;
            C3459e eVar2 = (C3459e) obj2;
            C3459e eVar3 = this.f8808a;
            float a = C2286e.m5141a(eVar.f8811a, eVar2.f8811a, f);
            float a2 = C2286e.m5141a(eVar.f8812b, eVar2.f8812b, f);
            float a3 = C2286e.m5141a(eVar.f8813c, eVar2.f8813c, f);
            eVar3.f8811a = a;
            eVar3.f8812b = a2;
            eVar3.f8813c = a3;
            return this.f8808a;
        }
    }

    /* renamed from: q.b.a.c.w.c$c */
    public static class C3457c extends Property<C3454c, C3459e> {

        /* renamed from: a */
        public static final Property<C3454c, C3459e> f8809a = new C3457c("circularReveal");

        public C3457c(String str) {
            super(C3459e.class, str);
        }

        public Object get(Object obj) {
            return ((C3454c) obj).getRevealInfo();
        }

        public void set(Object obj, Object obj2) {
            ((C3454c) obj).setRevealInfo((C3459e) obj2);
        }
    }

    /* renamed from: q.b.a.c.w.c$d */
    public static class C3458d extends Property<C3454c, Integer> {

        /* renamed from: a */
        public static final Property<C3454c, Integer> f8810a = new C3458d("circularRevealScrimColor");

        public C3458d(String str) {
            super(Integer.class, str);
        }

        public Object get(Object obj) {
            return Integer.valueOf(((C3454c) obj).getCircularRevealScrimColor());
        }

        public void set(Object obj, Object obj2) {
            ((C3454c) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
        }
    }

    /* renamed from: q.b.a.c.w.c$e */
    public static class C3459e {

        /* renamed from: a */
        public float f8811a;

        /* renamed from: b */
        public float f8812b;

        /* renamed from: c */
        public float f8813c;

        public C3459e() {
        }

        public C3459e(float f, float f2, float f3) {
            this.f8811a = f;
            this.f8812b = f2;
            this.f8813c = f3;
        }

        public /* synthetic */ C3459e(C3455a aVar) {
        }
    }

    /* renamed from: a */
    void mo9387a();

    /* renamed from: b */
    void mo9388b();

    int getCircularRevealScrimColor();

    C3459e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C3459e eVar);
}
