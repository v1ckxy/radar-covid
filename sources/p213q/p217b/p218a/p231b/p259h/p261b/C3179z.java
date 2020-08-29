package p213q.p217b.p218a.p231b.p259h.p261b;

import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.z */
public final class C3179z implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ String f7990e;

    /* renamed from: f */
    public final /* synthetic */ long f7991f;

    /* renamed from: g */
    public final /* synthetic */ C2891a f7992g;

    public C3179z(C2891a aVar, String str, long j) {
        this.f7992g = aVar;
        this.f7990e = str;
        this.f7991f = j;
    }

    public final void run() {
        C2891a aVar = this.f7992g;
        String str = this.f7990e;
        long j = this.f7991f;
        aVar.mo8277a();
        aVar.mo8279c();
        C1061o.m2528b(str);
        Integer num = (Integer) aVar.f7113c.get(str);
        if (num != null) {
            C3044m7 a = aVar.mo8300r().mo8671a(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                aVar.f7113c.remove(str);
                Long l = (Long) aVar.f7112b.get(str);
                if (l == null) {
                    aVar.mo8285i().f7153f.mo8432a("First ad unit exposure time was never set");
                } else {
                    long longValue = j - l.longValue();
                    aVar.f7112b.remove(str);
                    aVar.mo8257a(str, longValue, a);
                }
                if (aVar.f7113c.isEmpty()) {
                    long j2 = aVar.f7114d;
                    if (j2 == 0) {
                        aVar.mo8285i().f7153f.mo8432a("First ad exposure time was never set");
                        return;
                    }
                    aVar.mo8255a(j - j2, a);
                    aVar.f7114d = 0;
                    return;
                }
                return;
            }
            aVar.f7113c.put(str, Integer.valueOf(intValue));
            return;
        }
        aVar.mo8285i().f7153f.mo8433a("Call to endAdUnitExposure for unknown ad unit id", str);
    }
}
