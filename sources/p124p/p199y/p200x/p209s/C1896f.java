package p124p.p199y.p200x.p209s;

import android.database.Cursor;
import p124p.p182q.C1619b;
import p124p.p182q.C1638g;
import p124p.p182q.C1646i;
import p124p.p182q.p184m.C1651b;
import p124p.p188t.p189a.p190f.C1684f;

/* renamed from: p.y.x.s.f */
public final class C1896f implements C1895e {

    /* renamed from: a */
    public final C1638g f5510a;

    /* renamed from: b */
    public final C1619b<C1894d> f5511b;

    /* renamed from: p.y.x.s.f$a */
    public class C1897a extends C1619b<C1894d> {
        public C1897a(C1896f fVar, C1638g gVar) {
            super(gVar);
        }

        /* renamed from: a */
        public void mo6383a(C1684f fVar, Object obj) {
            C1894d dVar = (C1894d) obj;
            String str = dVar.f5508a;
            if (str == null) {
                fVar.f4945e.bindNull(1);
            } else {
                fVar.f4945e.bindString(1, str);
            }
            Long l = dVar.f5509b;
            if (l == null) {
                fVar.f4945e.bindNull(2);
                return;
            }
            fVar.f4945e.bindLong(2, l.longValue());
        }

        /* renamed from: b */
        public String mo6443b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }
    }

    public C1896f(C1638g gVar) {
        this.f5510a = gVar;
        this.f5511b = new C1897a(this, gVar);
    }

    /* renamed from: a */
    public Long mo6884a(String str) {
        C1646i a = C1646i.m4184a("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f5510a.mo6415b();
        Long l = null;
        Cursor a2 = C1651b.m4197a(this.f5510a, a, false, null);
        try {
            if (a2.moveToFirst()) {
                if (!a2.isNull(0)) {
                    l = Long.valueOf(a2.getLong(0));
                }
            }
            return l;
        } finally {
            a2.close();
            a.mo6434f();
        }
    }

    /* renamed from: a */
    public void mo6885a(C1894d dVar) {
        this.f5510a.mo6415b();
        this.f5510a.mo6416c();
        try {
            this.f5511b.mo6382a(dVar);
            this.f5510a.mo6420g();
        } finally {
            this.f5510a.mo6417d();
        }
    }
}
