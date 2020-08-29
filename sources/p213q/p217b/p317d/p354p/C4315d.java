package p213q.p217b.p317d.p354p;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: q.b.d.p.d */
public class C4315d {

    /* renamed from: b */
    public static volatile C4315d f10372b;

    /* renamed from: a */
    public final Set<C4316e> f10373a = new HashSet();

    /* renamed from: b */
    public static C4315d m9834b() {
        C4315d dVar = f10372b;
        if (dVar == null) {
            synchronized (C4315d.class) {
                dVar = f10372b;
                if (dVar == null) {
                    dVar = new C4315d();
                    f10372b = dVar;
                }
            }
        }
        return dVar;
    }

    /* renamed from: a */
    public Set<C4316e> mo10532a() {
        Set<C4316e> unmodifiableSet;
        synchronized (this.f10373a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f10373a);
        }
        return unmodifiableSet;
    }
}
