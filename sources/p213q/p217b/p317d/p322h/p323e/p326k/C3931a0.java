package p213q.p217b.p317d.p322h.p323e.p326k;

import java.util.List;
import java.util.concurrent.Executor;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p270l.C3253h;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p322h.p323e.p333q.p334c.C4153c;
import p213q.p217b.p317d.p322h.p323e.p333q.p334c.C4153c.C4154a;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4173b;

/* renamed from: q.b.d.h.e.k.a0 */
public class C3931a0 implements C3253h<C4173b, Void> {

    /* renamed from: a */
    public final /* synthetic */ List f9586a;

    /* renamed from: b */
    public final /* synthetic */ boolean f9587b;

    /* renamed from: c */
    public final /* synthetic */ Executor f9588c;

    /* renamed from: d */
    public final /* synthetic */ C3933b0 f9589d;

    public C3931a0(C3933b0 b0Var, List list, boolean z, Executor executor) {
        this.f9589d = b0Var;
        this.f9586a = list;
        this.f9587b = z;
        this.f9588c = executor;
    }

    /* renamed from: a */
    public C3255i mo8939a(Object obj) {
        C4173b bVar = (C4173b) obj;
        if (bVar == null) {
            C3913b.f9552c.mo10113c("Received null app settings, cannot send reports during app startup.");
        } else {
            for (C4153c cVar : this.f9586a) {
                if (cVar.getType() == C4154a.JAVA) {
                    C3975t.m9402a(bVar.f10096e, cVar.mo10363e());
                }
            }
            C3975t.m9400a(C3975t.this);
            ((C3935c0) C3975t.this.f9727j).mo10125a(bVar).mo10356a(this.f9586a, this.f9587b, this.f9589d.f9597f.f9747b);
            C3975t.this.f9736s.mo10196a(this.f9588c, C3961m0.m9386a(bVar));
            C3975t.this.f9740w.mo8941a(null);
        }
        return C2286e.m5291b(null);
    }
}
