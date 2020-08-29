package p410v;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.p393n.C4570i;
import p392u.p401r.p403c.C4638h;

/* renamed from: v.r$a */
public final class r$a implements C4860s {
    /* renamed from: a */
    public List<InetAddress> mo11353a(String str) {
        if (str != null) {
            try {
                InetAddress[] allByName = InetAddress.getAllByName(str);
                C4638h.m10270a((Object) allByName, "InetAddress.getAllByName(hostname)");
                int length = allByName.length;
                if (length != 0) {
                    return length != 1 ? C2286e.m5290b((T[]) allByName) : C2286e.m5332e(allByName[0]);
                }
                return C4570i.f10779e;
            } catch (NullPointerException e) {
                UnknownHostException unknownHostException = new UnknownHostException(C1965a.m4751a("Broken system behaviour for dns lookup of ", str));
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        } else {
            C4638h.m10271a("hostname");
            throw null;
        }
    }
}
