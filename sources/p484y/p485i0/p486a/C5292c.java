package p484y.p485i0.p486a;

import com.google.gson.Gson;
import java.io.Reader;
import p213q.p217b.p355e.C4333j;
import p213q.p217b.p355e.C4344s;
import p213q.p217b.p355e.p362x.C4397a;
import p213q.p217b.p355e.p362x.C4399b;
import p410v.C4725j0;
import p484y.C5280h;

/* renamed from: y.i0.a.c */
public final class C5292c<T> implements C5280h<C4725j0, T> {

    /* renamed from: a */
    public final Gson f12593a;

    /* renamed from: b */
    public final C4344s<T> f12594b;

    public C5292c(Gson gson, C4344s<T> sVar) {
        this.f12593a = gson;
        this.f12594b = sVar;
    }

    /* renamed from: a */
    public Object mo11984a(Object obj) {
        C4725j0 j0Var = (C4725j0) obj;
        Gson gson = this.f12593a;
        Reader a = j0Var.mo11048a();
        if (gson != null) {
            C4397a aVar = new C4397a(a);
            aVar.f10461f = gson.f1565j;
            try {
                Object a2 = this.f12594b.mo3072a(aVar);
                if (aVar.peek() == C4399b.END_DOCUMENT) {
                    return a2;
                }
                throw new C4333j("JSON document was not fully consumed.");
            } finally {
                j0Var.close();
            }
        } else {
            throw null;
        }
    }
}
