package p124p.p199y.p200x.p209s;

import p124p.p182q.C1619b;
import p124p.p182q.C1638g;
import p124p.p182q.C1648k;
import p124p.p188t.p189a.p190f.C1684f;
import p124p.p199y.C1792e;

/* renamed from: p.y.x.s.o */
public final class C1909o implements C1908n {

    /* renamed from: a */
    public final C1638g f5523a;

    /* renamed from: b */
    public final C1648k f5524b;

    /* renamed from: c */
    public final C1648k f5525c;

    /* renamed from: p.y.x.s.o$a */
    public class C1910a extends C1619b<C1907m> {
        public C1910a(C1909o oVar, C1638g gVar) {
            super(gVar);
        }

        /* renamed from: a */
        public void mo6383a(C1684f fVar, Object obj) {
            C1907m mVar = (C1907m) obj;
            String str = mVar.f5521a;
            if (str == null) {
                fVar.f4945e.bindNull(1);
            } else {
                fVar.f4945e.bindString(1, str);
            }
            byte[] a = C1792e.m4447a(mVar.f5522b);
            if (a == null) {
                fVar.f4945e.bindNull(2);
            } else {
                fVar.f4945e.bindBlob(2, a);
            }
        }

        /* renamed from: b */
        public String mo6443b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }
    }

    /* renamed from: p.y.x.s.o$b */
    public class C1911b extends C1648k {
        public C1911b(C1909o oVar, C1638g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo6443b() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: p.y.x.s.o$c */
    public class C1912c extends C1648k {
        public C1912c(C1909o oVar, C1638g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo6443b() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C1909o(C1638g gVar) {
        this.f5523a = gVar;
        new C1910a(this, gVar);
        this.f5524b = new C1911b(this, gVar);
        this.f5525c = new C1912c(this, gVar);
    }

    /* renamed from: a */
    public void mo6892a(String str) {
        this.f5523a.mo6415b();
        C1684f a = this.f5524b.mo6441a();
        if (str == null) {
            a.f4945e.bindNull(1);
        } else {
            a.f4945e.bindString(1, str);
        }
        this.f5523a.mo6416c();
        try {
            a.mo6508a();
            this.f5523a.mo6420g();
            this.f5523a.mo6417d();
            C1648k kVar = this.f5524b;
            if (a == kVar.f4861c) {
                kVar.f4859a.set(false);
            }
        } catch (Throwable th) {
            this.f5523a.mo6417d();
            this.f5524b.mo6442a(a);
            throw th;
        }
    }

    /* renamed from: a */
    public void mo6891a() {
        this.f5523a.mo6415b();
        C1684f a = this.f5525c.mo6441a();
        this.f5523a.mo6416c();
        try {
            a.mo6508a();
            this.f5523a.mo6420g();
            this.f5523a.mo6417d();
            C1648k kVar = this.f5525c;
            if (a == kVar.f4861c) {
                kVar.f4859a.set(false);
            }
        } catch (Throwable th) {
            this.f5523a.mo6417d();
            this.f5525c.mo6442a(a);
            throw th;
        }
    }
}
