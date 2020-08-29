package p392u.p395p;

import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.p401r.p402b.C4622p;
import p392u.p401r.p403c.C4638h;

/* renamed from: u.p.f */
public interface C4583f {

    /* renamed from: u.p.f$a */
    public interface C4584a extends C4583f {

        /* renamed from: u.p.f$a$a */
        public static final class C4585a {
            /* renamed from: a */
            public static <R> R m10230a(C4584a aVar, R r, C4622p<? super R, ? super C4584a, ? extends R> pVar) {
                if (pVar != null) {
                    return pVar.mo3781a(r, aVar);
                }
                C4638h.m10271a("operation");
                throw null;
            }

            /* renamed from: b */
            public static C4583f m10233b(C4584a aVar, C4586b<?> bVar) {
                if (bVar != null) {
                    return C4638h.m10272a((Object) aVar.getKey(), (Object) bVar) ? C4588h.f10792e : aVar;
                }
                C4638h.m10271a("key");
                throw null;
            }

            /* renamed from: a */
            public static <E extends C4584a> E m10231a(C4584a aVar, C4586b<E> bVar) {
                if (bVar == null) {
                    C4638h.m10271a("key");
                    throw null;
                } else if (C4638h.m10272a((Object) aVar.getKey(), (Object) bVar)) {
                    return aVar;
                } else {
                    return null;
                }
            }

            /* renamed from: a */
            public static C4583f m10232a(C4584a aVar, C4583f fVar) {
                if (fVar != null) {
                    return C2286e.m5220a((C4583f) aVar, fVar);
                }
                C4638h.m10271a("context");
                throw null;
            }
        }

        <E extends C4584a> E get(C4586b<E> bVar);

        C4586b<?> getKey();
    }

    /* renamed from: u.p.f$b */
    public interface C4586b<E extends C4584a> {
    }

    <R> R fold(R r, C4622p<? super R, ? super C4584a, ? extends R> pVar);

    <E extends C4584a> E get(C4586b<E> bVar);

    C4583f minusKey(C4586b<?> bVar);

    C4583f plus(C4583f fVar);
}
