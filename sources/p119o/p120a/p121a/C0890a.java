package p119o.p120a.p121a;

import p119o.p120a.C0964o1;
import p392u.C4557i;
import p392u.p395p.C4583f;
import p392u.p395p.C4583f.C4584a;
import p392u.p401r.p402b.C4622p;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;

/* renamed from: o.a.a.a */
public final class C0890a {

    /* renamed from: a */
    public static final C0910o f2469a = new C0910o("ZERO");

    /* renamed from: b */
    public static final C4622p<Object, C4584a, Object> f2470b = C0892b.f2477f;

    /* renamed from: c */
    public static final C4622p<C0964o1<?>, C4584a, C0964o1<?>> f2471c = C0893c.f2478f;

    /* renamed from: d */
    public static final C4622p<C0914s, C4584a, C0914s> f2472d = C0891a.f2475h;

    /* renamed from: e */
    public static final C4622p<C0914s, C4584a, C0914s> f2473e = C0891a.f2474g;

    /* renamed from: o.a.a.a$a */
    /* compiled from: com.android.tools.r8.jetbrains.kotlin-style lambda group */
    public static final class C0891a extends C4639i implements C4622p<C0914s, C4584a, C0914s> {

        /* renamed from: g */
        public static final C0891a f2474g = new C0891a(0);

        /* renamed from: h */
        public static final C0891a f2475h = new C0891a(1);

        /* renamed from: f */
        public final /* synthetic */ int f2476f;

        public C0891a(int i) {
            this.f2476f = i;
            super(2);
        }

        /* renamed from: a */
        public final Object mo3781a(Object obj, Object obj2) {
            int i = this.f2476f;
            if (i == 0) {
                C0914s sVar = (C0914s) obj;
                C4584a aVar = (C4584a) obj2;
                if (aVar instanceof C0964o1) {
                    C0964o1 o1Var = (C0964o1) aVar;
                    C4583f fVar = sVar.f2510c;
                    Object[] objArr = sVar.f2508a;
                    int i2 = sVar.f2509b;
                    sVar.f2509b = i2 + 1;
                    o1Var.mo4311a(fVar, objArr[i2]);
                }
                return sVar;
            } else if (i == 1) {
                C0914s sVar2 = (C0914s) obj;
                C4584a aVar2 = (C4584a) obj2;
                if (aVar2 instanceof C0964o1) {
                    Object a = ((C0964o1) aVar2).mo4310a(sVar2.f2510c);
                    Object[] objArr2 = sVar2.f2508a;
                    int i3 = sVar2.f2509b;
                    sVar2.f2509b = i3 + 1;
                    objArr2[i3] = a;
                }
                return sVar2;
            } else {
                throw null;
            }
        }
    }

    /* renamed from: o.a.a.a$b */
    public static final class C0892b extends C4639i implements C4622p<Object, C4584a, Object> {

        /* renamed from: f */
        public static final C0892b f2477f = new C0892b();

        public C0892b() {
            super(2);
        }

        /* renamed from: a */
        public Object mo3781a(Object obj, Object obj2) {
            C4584a aVar = (C4584a) obj2;
            if (!(aVar instanceof C0964o1)) {
                return obj;
            }
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? aVar : Integer.valueOf(intValue + 1);
        }
    }

    /* renamed from: o.a.a.a$c */
    public static final class C0893c extends C4639i implements C4622p<C0964o1<?>, C4584a, C0964o1<?>> {

        /* renamed from: f */
        public static final C0893c f2478f = new C0893c();

        public C0893c() {
            super(2);
        }

        /* renamed from: a */
        public Object mo3781a(Object obj, Object obj2) {
            C0964o1 o1Var = (C0964o1) obj;
            C4584a aVar = (C4584a) obj2;
            if (o1Var != null) {
                return o1Var;
            }
            if (!(aVar instanceof C0964o1)) {
                aVar = null;
            }
            return (C0964o1) aVar;
        }
    }

    /* renamed from: a */
    public static final Object m1969a(C4583f fVar) {
        Object fold = fVar.fold(Integer.valueOf(0), f2470b);
        if (fold != null) {
            return fold;
        }
        C4638h.m10269a();
        throw null;
    }

    /* renamed from: a */
    public static final void m1970a(C4583f fVar, Object obj) {
        if (obj != f2469a) {
            if (obj instanceof C0914s) {
                ((C0914s) obj).f2509b = 0;
                fVar.fold(obj, f2473e);
            } else {
                Object fold = fVar.fold(null, f2471c);
                if (fold != null) {
                    ((C0964o1) fold).mo4311a(fVar, obj);
                } else {
                    throw new C4557i("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                }
            }
        }
    }

    /* renamed from: b */
    public static final Object m1971b(C4583f fVar, Object obj) {
        if (obj == null) {
            obj = m1969a(fVar);
        }
        if (obj == Integer.valueOf(0)) {
            return f2469a;
        }
        if (obj instanceof Integer) {
            return fVar.fold(new C0914s(fVar, ((Number) obj).intValue()), f2472d);
        }
        if (obj != null) {
            return ((C0964o1) obj).mo4310a(fVar);
        }
        throw new C4557i("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }
}
