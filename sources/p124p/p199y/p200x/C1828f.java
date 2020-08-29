package p124p.p199y.p200x;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p124p.p199y.C1785b;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.p201p.p204c.C1860b;
import p124p.p199y.p200x.p209s.C1913p;
import p124p.p199y.p200x.p209s.C1915q;
import p124p.p199y.p200x.p209s.C1916r;
import p124p.p199y.p200x.p210t.C1936g;

/* renamed from: p.y.x.f */
public class C1828f {

    /* renamed from: a */
    public static final String f5323a = C1800l.m4459a("Schedulers");

    /* renamed from: a */
    public static C1827e m4500a(Context context, C1842l lVar) {
        C1860b bVar = new C1860b(context, lVar);
        C1936g.m4705a(context, SystemJobService.class, true);
        C1800l.m4460a().mo6782a(f5323a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        return bVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m4501a(C1785b bVar, WorkDatabase workDatabase, List<C1827e> list) {
        if (list != null && list.size() != 0) {
            C1915q m = workDatabase.mo1462m();
            workDatabase.mo6416c();
            try {
                C1916r rVar = (C1916r) m;
                List a = rVar.mo6904a(VERSION.SDK_INT == 23 ? bVar.f5233i / 2 : bVar.f5233i);
                List a2 = rVar.mo6903a();
                ArrayList arrayList = (ArrayList) a;
                if (arrayList.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        rVar.mo6901a(((C1913p) it.next()).f5527a, currentTimeMillis);
                    }
                }
                workDatabase.mo6420g();
                workDatabase.mo6417d();
                if (arrayList.size() > 0) {
                    C1913p[] pVarArr = (C1913p[]) arrayList.toArray(new C1913p[arrayList.size()]);
                    for (C1827e eVar : list) {
                        if (eVar.mo6811a()) {
                            eVar.mo6810a(pVarArr);
                        }
                    }
                }
                ArrayList arrayList2 = (ArrayList) a2;
                if (arrayList2.size() > 0) {
                    C1913p[] pVarArr2 = (C1913p[]) arrayList2.toArray(new C1913p[arrayList2.size()]);
                    for (C1827e eVar2 : list) {
                        if (!eVar2.mo6811a()) {
                            eVar2.mo6810a(pVarArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.mo6417d();
                throw th;
            }
        }
    }
}
