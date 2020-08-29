package p425x.p482c.p483a;

import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: x.c.a.a */
public abstract class C5244a<L, R> implements C5247b {

    /* renamed from: x.c.a.a$a */
    public static final class C5245a<L, R> extends C5244a<L, R> implements C5248c {

        /* renamed from: a */
        public final L f12483a;

        public C5245a(L l) {
            super(null);
            this.f12483a = l;
        }

        /* renamed from: a */
        public boolean mo11966a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo11967b() {
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C5245a) {
                return C4638h.m10272a((Object) this.f12483a, (Object) ((C5245a) obj).f12483a);
            }
            return false;
        }

        public int hashCode() {
            L l = this.f12483a;
            if (l == null) {
                return 43;
            }
            return 43 * l.hashCode();
        }

        public String toString() {
            StringBuilder a = C1965a.m4756a("Either.Left(");
            a.append(this.f12483a);
            a.append(')');
            return a.toString();
        }
    }

    /* renamed from: x.c.a.a$b */
    public static final class C5246b<L, R> extends C5244a<L, R> implements C5249d {

        /* renamed from: a */
        public final R f12484a;

        public C5246b(R r) {
            super(null);
            this.f12484a = r;
        }

        /* renamed from: a */
        public boolean mo11966a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo11967b() {
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C5246b) {
                return C4638h.m10272a((Object) this.f12484a, (Object) ((C5246b) obj).f12484a);
            }
            return false;
        }

        public int hashCode() {
            R r = this.f12484a;
            if (r == null) {
                return 43;
            }
            return 43 * r.hashCode();
        }

        public String toString() {
            StringBuilder a = C1965a.m4756a("Either.Right(");
            a.append(this.f12484a);
            a.append(')');
            return a.toString();
        }
    }

    public C5244a() {
    }

    public /* synthetic */ C5244a(C4636f fVar) {
    }
}
