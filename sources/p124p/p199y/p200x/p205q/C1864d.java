package p124p.p199y.p200x.p205q;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.p205q.p206e.C1865a;
import p124p.p199y.p200x.p205q.p206e.C1866b;
import p124p.p199y.p200x.p205q.p206e.C1867c;
import p124p.p199y.p200x.p205q.p206e.C1867c.C1868a;
import p124p.p199y.p200x.p205q.p206e.C1869d;
import p124p.p199y.p200x.p205q.p206e.C1870e;
import p124p.p199y.p200x.p205q.p206e.C1871f;
import p124p.p199y.p200x.p205q.p206e.C1872g;
import p124p.p199y.p200x.p205q.p206e.C1873h;
import p124p.p199y.p200x.p209s.C1913p;
import p124p.p199y.p200x.p210t.p212q.C1962a;

/* renamed from: p.y.x.q.d */
public class C1864d implements C1868a {

    /* renamed from: d */
    public static final String f5453d = C1800l.m4459a("WorkConstraintsTracker");

    /* renamed from: a */
    public final C1863c f5454a;

    /* renamed from: b */
    public final C1867c<?>[] f5455b;

    /* renamed from: c */
    public final Object f5456c = new Object();

    public C1864d(Context context, C1962a aVar, C1863c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f5454a = cVar;
        this.f5455b = new C1867c[]{new C1865a(applicationContext, aVar), new C1866b(applicationContext, aVar), new C1873h(applicationContext, aVar), new C1869d(applicationContext, aVar), new C1872g(applicationContext, aVar), new C1871f(applicationContext, aVar), new C1870e(applicationContext, aVar)};
    }

    /* renamed from: a */
    public void mo6855a(List<String> list) {
        synchronized (this.f5456c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (mo6856a(str)) {
                    C1800l.m4460a().mo6782a(f5453d, String.format("Constraints met for %s", new Object[]{str}), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            if (this.f5454a != null) {
                this.f5454a.mo1499b(arrayList);
            }
        }
    }

    /* renamed from: a */
    public boolean mo6856a(String str) {
        C1867c<?>[] cVarArr;
        synchronized (this.f5456c) {
            for (C1867c<?> cVar : this.f5455b) {
                T t = cVar.f5458b;
                if (t != null && cVar.mo6859b(t) && cVar.f5457a.contains(str)) {
                    C1800l.m4460a().mo6782a(f5453d, String.format("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()}), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public void mo6857b(List<String> list) {
        synchronized (this.f5456c) {
            if (this.f5454a != null) {
                this.f5454a.mo1498a(list);
            }
        }
    }

    /* renamed from: a */
    public void mo6854a(Iterable<C1913p> iterable) {
        C1867c<?>[] cVarArr;
        C1867c<?>[] cVarArr2;
        synchronized (this.f5456c) {
            for (C1867c<?> cVar : this.f5455b) {
                if (cVar.f5460d != null) {
                    cVar.f5460d = null;
                    cVar.mo6861a(null, cVar.f5458b);
                }
            }
            for (C1867c<?> a : this.f5455b) {
                a.mo6860a(iterable);
            }
            for (C1867c<?> cVar2 : this.f5455b) {
                if (cVar2.f5460d != this) {
                    cVar2.f5460d = this;
                    cVar2.mo6861a(this, cVar2.f5458b);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6853a() {
        C1867c<?>[] cVarArr;
        synchronized (this.f5456c) {
            for (C1867c<?> cVar : this.f5455b) {
                if (!cVar.f5457a.isEmpty()) {
                    cVar.f5457a.clear();
                    cVar.f5459c.mo6870b(cVar);
                }
            }
        }
    }
}
