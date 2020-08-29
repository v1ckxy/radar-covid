package p124p.p199y.p200x.p209s;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import p124p.p182q.C1619b;
import p124p.p182q.C1638g;
import p124p.p182q.C1646i;
import p124p.p182q.p184m.C1651b;
import p124p.p188t.p189a.p190f.C1684f;

/* renamed from: p.y.x.s.c */
public final class C1892c implements C1891b {

    /* renamed from: a */
    public final C1638g f5506a;

    /* renamed from: b */
    public final C1619b<C1890a> f5507b;

    /* renamed from: p.y.x.s.c$a */
    public class C1893a extends C1619b<C1890a> {
        public C1893a(C1892c cVar, C1638g gVar) {
            super(gVar);
        }

        /* renamed from: a */
        public void mo6383a(C1684f fVar, Object obj) {
            C1890a aVar = (C1890a) obj;
            String str = aVar.f5504a;
            if (str == null) {
                fVar.f4945e.bindNull(1);
            } else {
                fVar.f4945e.bindString(1, str);
            }
            String str2 = aVar.f5505b;
            if (str2 == null) {
                fVar.f4945e.bindNull(2);
            } else {
                fVar.f4945e.bindString(2, str2);
            }
        }

        /* renamed from: b */
        public String mo6443b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }
    }

    public C1892c(C1638g gVar) {
        this.f5506a = gVar;
        this.f5507b = new C1893a(this, gVar);
    }

    /* renamed from: a */
    public List<String> mo6880a(String str) {
        C1646i a = C1646i.m4184a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f5506a.mo6415b();
        Cursor a2 = C1651b.m4197a(this.f5506a, a, false, null);
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

    /* renamed from: b */
    public boolean mo6881b(String str) {
        boolean z = true;
        C1646i a = C1646i.m4184a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f5506a.mo6415b();
        boolean z2 = false;
        Cursor a2 = C1651b.m4197a(this.f5506a, a, false, null);
        try {
            if (a2.moveToFirst()) {
                if (a2.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            a2.close();
            a.mo6434f();
        }
    }
}
