package p124p.p144f.p145a.p146h;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: p.f.a.h.l */
public class C1287l {

    /* renamed from: a */
    public HashSet<C1287l> f3815a = new HashSet<>(2);

    /* renamed from: b */
    public int f3816b = 0;

    /* renamed from: a */
    public void mo5733a() {
        this.f3816b = 1;
        Iterator it = this.f3815a.iterator();
        while (it.hasNext()) {
            ((C1287l) it.next()).mo5729d();
        }
    }

    /* renamed from: b */
    public void mo5734b() {
        this.f3816b = 0;
        Iterator it = this.f3815a.iterator();
        while (it.hasNext()) {
            ((C1287l) it.next()).mo5734b();
        }
    }

    /* renamed from: c */
    public boolean mo5735c() {
        return this.f3816b == 1;
    }

    /* renamed from: d */
    public void mo5729d() {
    }
}
