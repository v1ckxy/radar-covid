package p392u.p395p;

import java.io.Serializable;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4557i;
import p392u.p395p.C4583f.C4584a;
import p392u.p395p.C4583f.C4586b;
import p392u.p401r.p402b.C4622p;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;

/* renamed from: u.p.c */
public final class C4578c implements C4583f, Serializable {

    /* renamed from: e */
    public final C4583f f10786e;

    /* renamed from: f */
    public final C4584a f10787f;

    /* renamed from: u.p.c$a */
    public static final class C4579a extends C4639i implements C4622p<String, C4584a, String> {

        /* renamed from: f */
        public static final C4579a f10788f = new C4579a();

        public C4579a() {
            super(2);
        }

        /* renamed from: a */
        public Object mo3781a(Object obj, Object obj2) {
            String str = (String) obj;
            C4584a aVar = (C4584a) obj2;
            if (str == null) {
                C4638h.m10271a("acc");
                throw null;
            } else if (aVar != null) {
                if (str.length() == 0) {
                    return aVar.toString();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(Objects.ARRAY_ELEMENT_SEPARATOR);
                sb.append(aVar);
                return sb.toString();
            } else {
                C4638h.m10271a("element");
                throw null;
            }
        }
    }

    public C4578c(C4583f fVar, C4584a aVar) {
        if (fVar == null) {
            C4638h.m10271a("left");
            throw null;
        } else if (aVar != null) {
            this.f10786e = fVar;
            this.f10787f = aVar;
        } else {
            C4638h.m10271a("element");
            throw null;
        }
    }

    /* renamed from: b */
    public final int mo10908b() {
        int i = 2;
        C4578c cVar = this;
        while (true) {
            C4583f fVar = cVar.f10786e;
            if (!(fVar instanceof C4578c)) {
                fVar = null;
            }
            cVar = (C4578c) fVar;
            if (cVar == null) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof C4578c)) {
                return false;
            }
            C4578c cVar = (C4578c) obj;
            if (cVar.mo10908b() != mo10908b()) {
                return false;
            }
            if (cVar != null) {
                C4578c cVar2 = this;
                while (true) {
                    C4584a aVar = cVar2.f10787f;
                    if (!C4638h.m10272a((Object) cVar.get(aVar.getKey()), (Object) aVar)) {
                        z = false;
                        break;
                    }
                    C4583f fVar = cVar2.f10786e;
                    if (fVar instanceof C4578c) {
                        cVar2 = (C4578c) fVar;
                    } else if (fVar != null) {
                        C4584a aVar2 = (C4584a) fVar;
                        z = C4638h.m10272a((Object) cVar.get(aVar2.getKey()), (Object) aVar2);
                    } else {
                        throw new C4557i("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    }
                }
                if (!z) {
                    return false;
                }
            } else {
                throw null;
            }
        }
        return true;
    }

    public <R> R fold(R r, C4622p<? super R, ? super C4584a, ? extends R> pVar) {
        if (pVar != null) {
            return pVar.mo3781a(this.f10786e.fold(r, pVar), this.f10787f);
        }
        C4638h.m10271a("operation");
        throw null;
    }

    public <E extends C4584a> E get(C4586b<E> bVar) {
        if (bVar != null) {
            C4578c cVar = this;
            while (true) {
                E e = cVar.f10787f.get(bVar);
                if (e != null) {
                    return e;
                }
                C4583f fVar = cVar.f10786e;
                if (!(fVar instanceof C4578c)) {
                    return fVar.get(bVar);
                }
                cVar = (C4578c) fVar;
            }
        } else {
            C4638h.m10271a("key");
            throw null;
        }
    }

    public int hashCode() {
        return this.f10787f.hashCode() + this.f10786e.hashCode();
    }

    public C4583f minusKey(C4586b<?> bVar) {
        if (bVar == null) {
            C4638h.m10271a("key");
            throw null;
        } else if (this.f10787f.get(bVar) != null) {
            return this.f10786e;
        } else {
            C4583f minusKey = this.f10786e.minusKey(bVar);
            C4583f fVar = minusKey == this.f10786e ? this : minusKey == C4588h.f10792e ? this.f10787f : new C4578c(minusKey, this.f10787f);
            return fVar;
        }
    }

    public C4583f plus(C4583f fVar) {
        if (fVar != null) {
            return C2286e.m5220a((C4583f) this, fVar);
        }
        C4638h.m10271a("context");
        throw null;
    }

    public String toString() {
        return C1965a.m4754a(C1965a.m4756a("["), (String) fold(Objects.EMPTY_STRING, C4579a.f10788f), "]");
    }
}
