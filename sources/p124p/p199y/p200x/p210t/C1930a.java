package p124p.p199y.p200x.p210t;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import p124p.p199y.p200x.C1842l;

/* renamed from: p.y.x.t.a */
public class C1930a extends C1933d {

    /* renamed from: f */
    public final /* synthetic */ C1842l f5559f;

    /* renamed from: g */
    public final /* synthetic */ UUID f5560g;

    public C1930a(C1842l lVar, UUID uuid) {
        this.f5559f = lVar;
        this.f5560g = uuid;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo6919a() {
        WorkDatabase workDatabase = this.f5559f.f5350c;
        workDatabase.mo6416c();
        try {
            mo6921a(this.f5559f, this.f5560g.toString());
            workDatabase.mo6420g();
            workDatabase.mo6417d();
            mo6920a(this.f5559f);
        } catch (Throwable th) {
            workDatabase.mo6417d();
            throw th;
        }
    }
}
