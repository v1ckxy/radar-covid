package p213q.p217b.p317d.p354p;

import java.util.Iterator;
import java.util.Set;

/* renamed from: q.b.d.p.c */
public class C4314c implements C4317f {

    /* renamed from: a */
    public final String f10370a;

    /* renamed from: b */
    public final C4315d f10371b;

    public C4314c(Set<C4316e> set, C4315d dVar) {
        this.f10370a = m9832a(set);
        this.f10371b = dVar;
    }

    /* renamed from: a */
    public static String m9832a(Set<C4316e> set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C4312a aVar = (C4312a) ((C4316e) it.next());
            sb.append(aVar.f10367a);
            sb.append('/');
            sb.append(aVar.f10368b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo10531a() {
        if (this.f10371b.mo10532a().isEmpty()) {
            return this.f10370a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10370a);
        sb.append(' ');
        sb.append(m9832a(this.f10371b.mo10532a()));
        return sb.toString();
    }
}
