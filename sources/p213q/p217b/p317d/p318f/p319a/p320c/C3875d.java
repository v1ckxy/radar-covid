package p213q.p217b.p317d.p318f.p319a.p320c;

import java.util.HashSet;
import java.util.Set;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p251g.p256e.C2339a0;
import p213q.p217b.p218a.p231b.p251g.p256e.C2462h;
import p213q.p217b.p218a.p231b.p259h.p260a.C2889a;
import p213q.p217b.p317d.p318f.p319a.C3867a.C3869b;

/* renamed from: q.b.d.f.a.c.d */
public final class C3875d {

    /* renamed from: a */
    public Set<String> f9487a;

    /* renamed from: b */
    public C3869b f9488b;

    /* renamed from: c */
    public C2889a f9489c;

    /* renamed from: d */
    public C3874c f9490d;

    public C3875d(C2889a aVar, C3869b bVar) {
        this.f9488b = bVar;
        this.f9489c = aVar;
        C3874c cVar = new C3874c(this);
        this.f9490d = cVar;
        C2462h hVar = this.f9489c.f7111a;
        if (hVar != null) {
            C1061o.m2524b(cVar);
            hVar.f6557c.execute(new C2339a0(hVar, cVar));
            this.f9487a = new HashSet();
            return;
        }
        throw null;
    }
}
