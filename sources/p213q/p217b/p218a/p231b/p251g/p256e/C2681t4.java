package p213q.p217b.p218a.p231b.p251g.p256e;

import java.lang.ref.Reference;
import java.util.List;
import java.util.Vector;

/* renamed from: q.b.a.b.g.e.t4 */
public final class C2681t4 extends C2614p4 {

    /* renamed from: a */
    public final C2665s4 f6872a = new C2665s4();

    /* renamed from: a */
    public final void mo7940a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            C2665s4 s4Var = this.f6872a;
            while (true) {
                Reference poll = s4Var.f6860b.poll();
                if (poll == null) {
                    break;
                }
                s4Var.f6859a.remove(poll);
            }
            List list = (List) s4Var.f6859a.get(new C2649r4(th, null));
            if (list == null) {
                list = new Vector(2);
                List list2 = (List) s4Var.f6859a.putIfAbsent(new C2649r4(th, s4Var.f6860b), list);
                if (list2 != null) {
                    list = list2;
                }
            }
            list.add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
