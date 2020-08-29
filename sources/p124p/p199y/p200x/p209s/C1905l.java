package p124p.p199y.p200x.p209s;

import p124p.p182q.C1619b;
import p124p.p182q.C1638g;
import p124p.p188t.p189a.p190f.C1684f;

/* renamed from: p.y.x.s.l */
public final class C1905l implements C1904k {

    /* renamed from: a */
    public final C1638g f5519a;

    /* renamed from: b */
    public final C1619b<C1903j> f5520b;

    /* renamed from: p.y.x.s.l$a */
    public class C1906a extends C1619b<C1903j> {
        public C1906a(C1905l lVar, C1638g gVar) {
            super(gVar);
        }

        /* renamed from: a */
        public void mo6383a(C1684f fVar, Object obj) {
            C1903j jVar = (C1903j) obj;
            String str = jVar.f5517a;
            if (str == null) {
                fVar.f4945e.bindNull(1);
            } else {
                fVar.f4945e.bindString(1, str);
            }
            String str2 = jVar.f5518b;
            if (str2 == null) {
                fVar.f4945e.bindNull(2);
            } else {
                fVar.f4945e.bindString(2, str2);
            }
        }

        /* renamed from: b */
        public String mo6443b() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public C1905l(C1638g gVar) {
        this.f5519a = gVar;
        this.f5520b = new C1906a(this, gVar);
    }
}
