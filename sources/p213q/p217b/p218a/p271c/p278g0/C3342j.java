package p213q.p217b.p218a.p271c.p278g0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.C3406l;

/* renamed from: q.b.a.c.g0.j */
public class C3342j {

    /* renamed from: a */
    public C3334d f8411a;

    /* renamed from: b */
    public C3334d f8412b;

    /* renamed from: c */
    public C3334d f8413c;

    /* renamed from: d */
    public C3334d f8414d;

    /* renamed from: e */
    public C3333c f8415e;

    /* renamed from: f */
    public C3333c f8416f;

    /* renamed from: g */
    public C3333c f8417g;

    /* renamed from: h */
    public C3333c f8418h;

    /* renamed from: i */
    public C3336f f8419i;

    /* renamed from: j */
    public C3336f f8420j;

    /* renamed from: k */
    public C3336f f8421k;

    /* renamed from: l */
    public C3336f f8422l;

    /* renamed from: q.b.a.c.g0.j$b */
    public static final class C3344b {

        /* renamed from: a */
        public C3334d f8423a = new C3341i();

        /* renamed from: b */
        public C3334d f8424b = new C3341i();

        /* renamed from: c */
        public C3334d f8425c = new C3341i();

        /* renamed from: d */
        public C3334d f8426d = new C3341i();

        /* renamed from: e */
        public C3333c f8427e = new C3331a(0.0f);

        /* renamed from: f */
        public C3333c f8428f = new C3331a(0.0f);

        /* renamed from: g */
        public C3333c f8429g = new C3331a(0.0f);

        /* renamed from: h */
        public C3333c f8430h = new C3331a(0.0f);

        /* renamed from: i */
        public C3336f f8431i = new C3336f();

        /* renamed from: j */
        public C3336f f8432j = new C3336f();

        /* renamed from: k */
        public C3336f f8433k = new C3336f();

        /* renamed from: l */
        public C3336f f8434l = new C3336f();

        public C3344b() {
        }

        /* renamed from: a */
        public static float m7747a(C3334d dVar) {
            if (dVar instanceof C3341i) {
                return ((C3341i) dVar).f8410a;
            }
            if (dVar instanceof C3335e) {
                return ((C3335e) dVar).f8363a;
            }
            return -1.0f;
        }

        /* renamed from: a */
        public C3344b mo9101a(float f) {
            this.f8430h = new C3331a(f);
            return this;
        }

        /* renamed from: a */
        public C3342j mo9102a() {
            return new C3342j(this, null);
        }

        /* renamed from: b */
        public C3344b mo9103b(float f) {
            this.f8429g = new C3331a(f);
            return this;
        }

        /* renamed from: c */
        public C3344b mo9104c(float f) {
            this.f8427e = new C3331a(f);
            return this;
        }

        /* renamed from: d */
        public C3344b mo9105d(float f) {
            this.f8428f = new C3331a(f);
            return this;
        }

        public C3344b(C3342j jVar) {
            this.f8423a = jVar.f8411a;
            this.f8424b = jVar.f8412b;
            this.f8425c = jVar.f8413c;
            this.f8426d = jVar.f8414d;
            this.f8427e = jVar.f8415e;
            this.f8428f = jVar.f8416f;
            this.f8429g = jVar.f8417g;
            this.f8430h = jVar.f8418h;
            this.f8431i = jVar.f8419i;
            this.f8432j = jVar.f8420j;
            this.f8433k = jVar.f8421k;
            this.f8434l = jVar.f8422l;
        }
    }

    public C3342j() {
        this.f8411a = new C3341i();
        this.f8412b = new C3341i();
        this.f8413c = new C3341i();
        this.f8414d = new C3341i();
        this.f8415e = new C3331a(0.0f);
        this.f8416f = new C3331a(0.0f);
        this.f8417g = new C3331a(0.0f);
        this.f8418h = new C3331a(0.0f);
        this.f8419i = new C3336f();
        this.f8420j = new C3336f();
        this.f8421k = new C3336f();
        this.f8422l = new C3336f();
    }

    /* renamed from: a */
    public static C3333c m7742a(TypedArray typedArray, int i, C3333c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new C3331a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new C3340h(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    /* renamed from: a */
    public static C3344b m7743a(Context context, int i, int i2, C3333c cVar) {
        if (i2 != 0) {
            Context contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C3406l.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(C3406l.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(C3406l.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(C3406l.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(C3406l.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(C3406l.ShapeAppearance_cornerFamilyBottomLeft, i3);
            C3333c a = m7742a(obtainStyledAttributes, C3406l.ShapeAppearance_cornerSize, cVar);
            C3333c a2 = m7742a(obtainStyledAttributes, C3406l.ShapeAppearance_cornerSizeTopLeft, a);
            C3333c a3 = m7742a(obtainStyledAttributes, C3406l.ShapeAppearance_cornerSizeTopRight, a);
            C3333c a4 = m7742a(obtainStyledAttributes, C3406l.ShapeAppearance_cornerSizeBottomRight, a);
            C3333c a5 = m7742a(obtainStyledAttributes, C3406l.ShapeAppearance_cornerSizeBottomLeft, a);
            C3344b bVar = new C3344b();
            C3334d b = C2286e.m5292b(i4);
            bVar.f8423a = b;
            float a6 = C3344b.m7747a(b);
            if (a6 != -1.0f) {
                bVar.mo9104c(a6);
            }
            bVar.f8427e = a2;
            C3334d b2 = C2286e.m5292b(i5);
            bVar.f8424b = b2;
            float a7 = C3344b.m7747a(b2);
            if (a7 != -1.0f) {
                bVar.mo9105d(a7);
            }
            bVar.f8428f = a3;
            C3334d b3 = C2286e.m5292b(i6);
            bVar.f8425c = b3;
            float a8 = C3344b.m7747a(b3);
            if (a8 != -1.0f) {
                bVar.mo9103b(a8);
            }
            bVar.f8429g = a4;
            C3334d b4 = C2286e.m5292b(i7);
            bVar.f8426d = b4;
            float a9 = C3344b.m7747a(b4);
            if (a9 != -1.0f) {
                bVar.mo9101a(a9);
            }
            bVar.f8430h = a5;
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public boolean mo9100a(RectF rectF) {
        Class<C3336f> cls = C3336f.class;
        boolean z = this.f8422l.getClass().equals(cls) && this.f8420j.getClass().equals(cls) && this.f8419i.getClass().equals(cls) && this.f8421k.getClass().equals(cls);
        float a = this.f8415e.mo9050a(rectF);
        return z && ((this.f8416f.mo9050a(rectF) > a ? 1 : (this.f8416f.mo9050a(rectF) == a ? 0 : -1)) == 0 && (this.f8418h.mo9050a(rectF) > a ? 1 : (this.f8418h.mo9050a(rectF) == a ? 0 : -1)) == 0 && (this.f8417g.mo9050a(rectF) > a ? 1 : (this.f8417g.mo9050a(rectF) == a ? 0 : -1)) == 0) && ((this.f8412b instanceof C3341i) && (this.f8411a instanceof C3341i) && (this.f8413c instanceof C3341i) && (this.f8414d instanceof C3341i));
    }

    /* renamed from: a */
    public static C3344b m7744a(Context context, AttributeSet attributeSet, int i, int i2) {
        C3331a aVar = new C3331a((float) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3406l.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C3406l.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C3406l.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return m7743a(context, resourceId, resourceId2, (C3333c) aVar);
    }

    /* renamed from: a */
    public C3342j mo9099a(float f) {
        C3344b bVar = new C3344b(this);
        bVar.mo9104c(f);
        bVar.mo9105d(f);
        bVar.mo9103b(f);
        bVar.mo9101a(f);
        return bVar.mo9102a();
    }

    public /* synthetic */ C3342j(C3344b bVar, C3343a aVar) {
        this.f8411a = bVar.f8423a;
        this.f8412b = bVar.f8424b;
        this.f8413c = bVar.f8425c;
        this.f8414d = bVar.f8426d;
        this.f8415e = bVar.f8427e;
        this.f8416f = bVar.f8428f;
        this.f8417g = bVar.f8429g;
        this.f8418h = bVar.f8430h;
        this.f8419i = bVar.f8431i;
        this.f8420j = bVar.f8432j;
        this.f8421k = bVar.f8433k;
        this.f8422l = bVar.f8434l;
    }
}
