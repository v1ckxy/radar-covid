package p124p.p199y.p200x.p209s;

import android.database.Cursor;
import p124p.p126b.p127k.C1061o;
import p124p.p182q.C1619b;
import p124p.p182q.C1638g;
import p124p.p182q.C1646i;
import p124p.p182q.C1648k;
import p124p.p182q.p184m.C1651b;
import p124p.p188t.p189a.p190f.C1684f;

/* renamed from: p.y.x.s.i */
public final class C1900i implements C1899h {

    /* renamed from: a */
    public final C1638g f5514a;

    /* renamed from: b */
    public final C1619b<C1898g> f5515b;

    /* renamed from: c */
    public final C1648k f5516c;

    /* renamed from: p.y.x.s.i$a */
    public class C1901a extends C1619b<C1898g> {
        public C1901a(C1900i iVar, C1638g gVar) {
            super(gVar);
        }

        /* renamed from: a */
        public void mo6383a(C1684f fVar, Object obj) {
            C1898g gVar = (C1898g) obj;
            String str = gVar.f5512a;
            if (str == null) {
                fVar.f4945e.bindNull(1);
            } else {
                fVar.f4945e.bindString(1, str);
            }
            fVar.f4945e.bindLong(2, (long) gVar.f5513b);
        }

        /* renamed from: b */
        public String mo6443b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }
    }

    /* renamed from: p.y.x.s.i$b */
    public class C1902b extends C1648k {
        public C1902b(C1900i iVar, C1638g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo6443b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C1900i(C1638g gVar) {
        this.f5514a = gVar;
        this.f5515b = new C1901a(this, gVar);
        this.f5516c = new C1902b(this, gVar);
    }

    /* renamed from: a */
    public C1898g mo6888a(String str) {
        C1646i a = C1646i.m4184a("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f5514a.mo6415b();
        C1898g gVar = null;
        Cursor a2 = C1651b.m4197a(this.f5514a, a, false, null);
        try {
            int a3 = C1061o.m2435a(a2, "work_spec_id");
            int a4 = C1061o.m2435a(a2, "system_id");
            if (a2.moveToFirst()) {
                gVar = new C1898g(a2.getString(a3), a2.getInt(a4));
            }
            return gVar;
        } finally {
            a2.close();
            a.mo6434f();
        }
    }

    /* renamed from: a */
    public void mo6889a(C1898g gVar) {
        this.f5514a.mo6415b();
        this.f5514a.mo6416c();
        try {
            this.f5515b.mo6382a(gVar);
            this.f5514a.mo6420g();
        } finally {
            this.f5514a.mo6417d();
        }
    }

    /* renamed from: b */
    public void mo6890b(String str) {
        this.f5514a.mo6415b();
        C1684f a = this.f5516c.mo6441a();
        if (str == null) {
            a.f4945e.bindNull(1);
        } else {
            a.f4945e.bindString(1, str);
        }
        this.f5514a.mo6416c();
        try {
            a.mo6508a();
            this.f5514a.mo6420g();
            this.f5514a.mo6417d();
            C1648k kVar = this.f5516c;
            if (a == kVar.f4861c) {
                kVar.f4859a.set(false);
            }
        } catch (Throwable th) {
            this.f5514a.mo6417d();
            this.f5516c.mo6442a(a);
            throw th;
        }
    }
}
