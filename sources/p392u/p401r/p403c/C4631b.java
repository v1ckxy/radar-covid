package p392u.p401r.p403c;

import java.io.Serializable;
import p392u.p401r.C4606a;
import p392u.p407u.C4657a;
import p392u.p407u.C4661e;

/* renamed from: u.r.c.b */
public abstract class C4631b implements C4657a, Serializable {

    /* renamed from: g */
    public static final Object f10820g = C4632a.f10823e;

    /* renamed from: e */
    public transient C4657a f10821e;

    /* renamed from: f */
    public final Object f10822f = f10820g;

    /* renamed from: u.r.c.b$a */
    public static class C4632a implements Serializable {

        /* renamed from: e */
        public static final C4632a f10823e = new C4632a();
    }

    /* renamed from: a */
    public Object mo10929a(Object... objArr) {
        C4642l lVar = (C4642l) this;
        C4657a a = lVar.mo10930a();
        if (a != lVar) {
            return ((C4661e) a).mo10929a(objArr);
        }
        throw new C4606a();
    }

    /* renamed from: a */
    public C4657a mo10930a() {
        C4657a aVar = this.f10821e;
        if (aVar == null) {
            aVar = (C4640j) this;
            if (C4643m.f10834a != null) {
                this.f10821e = aVar;
            } else {
                throw null;
            }
        }
        return aVar;
    }
}
