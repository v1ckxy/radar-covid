package p213q.p217b.p218a.p219a.p222f.p225r;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p219a.p222f.C2006b;
import p213q.p217b.p218a.p219a.p222f.C2013f;
import p213q.p217b.p218a.p219a.p222f.C2018i;
import p213q.p217b.p218a.p219a.p222f.C2023m;
import p213q.p217b.p218a.p219a.p222f.p223p.C2031e;
import p213q.p217b.p218a.p219a.p222f.p223p.C2041m;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2072r;
import p213q.p217b.p218a.p219a.p222f.p225r.p227i.C2076c;
import p213q.p217b.p218a.p219a.p222f.p228s.C2097b;
import p213q.p217b.p317d.p322h.p323e.p336r.C4160a;
import p213q.p217b.p317d.p322h.p323e.p336r.C4162c;

/* renamed from: q.b.a.a.f.r.c */
public class C2045c implements C2047e {

    /* renamed from: f */
    public static final Logger f5835f = Logger.getLogger(C2023m.class.getName());

    /* renamed from: a */
    public final C2072r f5836a;

    /* renamed from: b */
    public final Executor f5837b;

    /* renamed from: c */
    public final C2031e f5838c;

    /* renamed from: d */
    public final C2076c f5839d;

    /* renamed from: e */
    public final C2097b f5840e;

    public C2045c(Executor executor, C2031e eVar, C2072r rVar, C2076c cVar, C2097b bVar) {
        this.f5837b = executor;
        this.f5838c = eVar;
        this.f5836a = rVar;
        this.f5839d = cVar;
        this.f5840e = bVar;
    }

    /* renamed from: a */
    public static /* synthetic */ void m4815a(C2045c cVar, C2018i iVar, C4160a aVar, C2013f fVar) {
        try {
            C2041m a = cVar.f5838c.mo7028a(((C2006b) iVar).f5762a);
            if (a == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{((C2006b) iVar).f5762a});
                f5835f.warning(format);
                C4162c.m9633a(aVar.f10058a, aVar.f10059b, new IllegalArgumentException(format));
                return;
            }
            cVar.f5840e.mo7067a(new C2044b(cVar, iVar, a.mo6992a(fVar)));
            aVar.mo10367a(null);
        } catch (Exception e) {
            Logger logger = f5835f;
            StringBuilder a2 = C1965a.m4756a("Error scheduling event ");
            a2.append(e.getMessage());
            logger.warning(a2.toString());
            C4162c.m9633a(aVar.f10058a, aVar.f10059b, e);
        }
    }

    /* renamed from: a */
    public void mo7032a(C2018i iVar, C2013f fVar, C4160a aVar) {
        this.f5837b.execute(new C2043a(this, iVar, aVar, fVar));
    }
}
