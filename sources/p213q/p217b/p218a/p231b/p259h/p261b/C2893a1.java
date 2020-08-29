package p213q.p217b.p218a.p231b.p259h.p261b;

import java.util.Map;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.a1 */
public final class C2893a1 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ String f7116e;

    /* renamed from: f */
    public final /* synthetic */ long f7117f;

    /* renamed from: g */
    public final /* synthetic */ C2891a f7118g;

    public C2893a1(C2891a aVar, String str, long j) {
        this.f7118g = aVar;
        this.f7116e = str;
        this.f7117f = j;
    }

    public final void run() {
        Object obj;
        Map map;
        C2891a aVar = this.f7118g;
        String str = this.f7116e;
        long j = this.f7117f;
        aVar.mo8277a();
        aVar.mo8279c();
        C1061o.m2528b(str);
        if (aVar.f7113c.isEmpty()) {
            aVar.f7114d = j;
        }
        Integer num = (Integer) aVar.f7113c.get(str);
        if (num != null) {
            map = aVar.f7113c;
            obj = Integer.valueOf(num.intValue() + 1);
        } else if (aVar.f7113c.size() >= 100) {
            aVar.mo8285i().f7156i.mo8432a("Too many ads visible");
            return;
        } else {
            aVar.f7113c.put(str, Integer.valueOf(1));
            map = aVar.f7112b;
            obj = Long.valueOf(j);
        }
        map.put(str, obj);
    }
}
