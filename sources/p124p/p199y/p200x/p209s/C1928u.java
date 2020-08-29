package p124p.p199y.p200x.p209s;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import p124p.p182q.C1619b;
import p124p.p182q.C1638g;
import p124p.p182q.C1646i;
import p124p.p182q.p184m.C1651b;
import p124p.p188t.p189a.p190f.C1684f;

/* renamed from: p.y.x.s.u */
public final class C1928u implements C1927t {

    /* renamed from: a */
    public final C1638g f5557a;

    /* renamed from: b */
    public final C1619b<C1926s> f5558b;

    /* renamed from: p.y.x.s.u$a */
    public class C1929a extends C1619b<C1926s> {
        public C1929a(C1928u uVar, C1638g gVar) {
            super(gVar);
        }

        /* renamed from: a */
        public void mo6383a(C1684f fVar, Object obj) {
            C1926s sVar = (C1926s) obj;
            String str = sVar.f5555a;
            if (str == null) {
                fVar.f4945e.bindNull(1);
            } else {
                fVar.f4945e.bindString(1, str);
            }
            String str2 = sVar.f5556b;
            if (str2 == null) {
                fVar.f4945e.bindNull(2);
            } else {
                fVar.f4945e.bindString(2, str2);
            }
        }

        /* renamed from: b */
        public String mo6443b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public C1928u(C1638g gVar) {
        this.f5557a = gVar;
        this.f5558b = new C1929a(this, gVar);
    }

    /* renamed from: a */
    public List<String> mo6918a(String str) {
        C1646i a = C1646i.m4184a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f5557a.mo6415b();
        Cursor a2 = C1651b.m4197a(this.f5557a, a, false, null);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(a2.getString(0));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo6434f();
        }
    }
}
