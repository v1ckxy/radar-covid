package p213q.p217b.p218a.p219a.p222f.p225r.p226h;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.p127k.C1061o;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p219a.p222f.C2006b;
import p213q.p217b.p218a.p219a.p222f.C2018i;
import p213q.p217b.p218a.p219a.p222f.p223p.C2026a;
import p213q.p217b.p218a.p219a.p222f.p223p.C2031e;
import p213q.p217b.p218a.p219a.p222f.p223p.C2032f;
import p213q.p217b.p218a.p219a.p222f.p223p.C2033g;
import p213q.p217b.p218a.p219a.p222f.p223p.C2041m;
import p213q.p217b.p218a.p219a.p222f.p225r.p227i.C2075b;
import p213q.p217b.p218a.p219a.p222f.p225r.p227i.C2076c;
import p213q.p217b.p218a.p219a.p222f.p225r.p227i.C2081h;
import p213q.p217b.p218a.p219a.p222f.p228s.C2097b;
import p213q.p217b.p218a.p219a.p222f.p229t.C2099a;

/* renamed from: q.b.a.a.f.r.h.l */
public class C2066l {

    /* renamed from: a */
    public final Context f5884a;

    /* renamed from: b */
    public final C2031e f5885b;

    /* renamed from: c */
    public final C2076c f5886c;

    /* renamed from: d */
    public final C2072r f5887d;

    /* renamed from: e */
    public final Executor f5888e;

    /* renamed from: f */
    public final C2097b f5889f;

    /* renamed from: g */
    public final C2099a f5890g;

    public C2066l(Context context, C2031e eVar, C2076c cVar, C2072r rVar, Executor executor, C2097b bVar, C2099a aVar) {
        this.f5884a = context;
        this.f5885b = eVar;
        this.f5886c = cVar;
        this.f5887d = rVar;
        this.f5888e = executor;
        this.f5889f = bVar;
        this.f5890g = aVar;
    }

    /* renamed from: a */
    public void mo7047a(C2018i iVar, int i) {
        C2033g a;
        C2041m a2 = this.f5885b.mo7028a(((C2006b) iVar).f5762a);
        Iterable<C2081h> iterable = (Iterable) this.f5889f.mo7067a(new C2062h(this, iVar));
        if (iterable.iterator().hasNext()) {
            if (a2 == null) {
                C1061o.m2499a("Uploader", "Unknown backend for %s, deleting event batch for it...", (Object) iVar);
                a = C2033g.m4809a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (C2081h hVar : iterable) {
                    arrayList.add(((C2075b) hVar).f5915c);
                }
                byte[] bArr = ((C2006b) iVar).f5763b;
                if (1 != 0) {
                    a = a2.mo6993a((C2032f) new C2026a(arrayList, bArr, null));
                } else {
                    throw new IllegalStateException(C1965a.m4751a("Missing required properties:", Objects.EMPTY_STRING));
                }
            }
            C2033g gVar = a;
            C2097b bVar = this.f5889f;
            C2063i iVar2 = new C2063i(this, gVar, iterable, iVar, i);
            bVar.mo7067a(iVar2);
        }
    }
}
