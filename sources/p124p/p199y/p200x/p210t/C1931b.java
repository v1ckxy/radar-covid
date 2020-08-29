package p124p.p199y.p200x.p210t;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import p124p.p199y.p200x.C1842l;
import p124p.p199y.p200x.p209s.C1916r;

/* renamed from: p.y.x.t.b */
public class C1931b extends C1933d {

    /* renamed from: f */
    public final /* synthetic */ C1842l f5561f;

    /* renamed from: g */
    public final /* synthetic */ String f5562g;

    public C1931b(C1842l lVar, String str) {
        this.f5561f = lVar;
        this.f5562g = str;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo6919a() {
        WorkDatabase workDatabase = this.f5561f.f5350c;
        workDatabase.mo6416c();
        try {
            Iterator it = ((ArrayList) ((C1916r) workDatabase.mo1462m()).mo6913d(this.f5562g)).iterator();
            while (it.hasNext()) {
                mo6921a(this.f5561f, (String) it.next());
            }
            workDatabase.mo6420g();
            workDatabase.mo6417d();
            mo6920a(this.f5561f);
        } catch (Throwable th) {
            workDatabase.mo6417d();
            throw th;
        }
    }
}
