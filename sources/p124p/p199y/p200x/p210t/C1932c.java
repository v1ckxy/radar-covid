package p124p.p199y.p200x.p210t;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import p124p.p199y.p200x.C1842l;
import p124p.p199y.p200x.p209s.C1916r;

/* renamed from: p.y.x.t.c */
public class C1932c extends C1933d {

    /* renamed from: f */
    public final /* synthetic */ C1842l f5563f;

    /* renamed from: g */
    public final /* synthetic */ String f5564g;

    /* renamed from: h */
    public final /* synthetic */ boolean f5565h;

    public C1932c(C1842l lVar, String str, boolean z) {
        this.f5563f = lVar;
        this.f5564g = str;
        this.f5565h = z;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo6919a() {
        WorkDatabase workDatabase = this.f5563f.f5350c;
        workDatabase.mo6416c();
        try {
            Iterator it = ((ArrayList) ((C1916r) workDatabase.mo1462m()).mo6911c(this.f5564g)).iterator();
            while (it.hasNext()) {
                mo6921a(this.f5563f, (String) it.next());
            }
            workDatabase.mo6420g();
            workDatabase.mo6417d();
            if (this.f5565h) {
                mo6920a(this.f5563f);
            }
        } catch (Throwable th) {
            workDatabase.mo6417d();
            throw th;
        }
    }
}
