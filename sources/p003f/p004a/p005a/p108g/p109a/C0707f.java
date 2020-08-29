package p003f.p004a.p005a.p108g.p109a;

import java.net.UnknownHostException;
import p002es.gob.radarcovid.models.exception.GenericRequestException;
import p002es.gob.radarcovid.models.exception.NetworkUnavailableException;
import p002es.gob.radarcovid.models.exception.ServiceException;
import p392u.C4560l;
import p392u.p401r.p402b.C4607a;
import p392u.p401r.p403c.C4638h;
import p425x.p482c.p483a.C5244a;
import p425x.p482c.p483a.C5244a.C5245a;
import p425x.p482c.p483a.C5244a.C5246b;
import p484y.C5263c0;
import p484y.C5264d;

/* renamed from: f.a.a.g.a.f */
public abstract class C0707f {
    /* renamed from: a */
    public final <T> C5244a<Exception, T> mo3885a(C4607a<? extends C5264d<T>> aVar) {
        C5245a aVar2;
        C5244a<Exception, T> aVar3;
        if (aVar != null) {
            try {
                C5263c0 f = ((C5264d) aVar.mo3123c()).mo11990f();
                C4638h.m10270a((Object) f, "response");
                if (!f.mo11985a()) {
                    aVar3 = new C5245a<>(ServiceException.Companion.from(f));
                } else if (f.f12550b != null) {
                    T t = f.f12550b;
                    if (t != null) {
                        aVar3 = new C5246b<>(t);
                    } else {
                        C4638h.m10269a();
                        throw null;
                    }
                } else {
                    T t2 = f.f12550b;
                    if (t2 != null ? t2 instanceof C4560l : true) {
                        aVar3 = new C5246b<>(C4560l.f10773a);
                    } else {
                        aVar3 = new C5245a<>(ServiceException.Companion.from(f));
                    }
                }
                return aVar3;
            } catch (Exception e) {
                if (e instanceof UnknownHostException) {
                    aVar2 = new C5245a(new NetworkUnavailableException());
                } else {
                    aVar2 = new C5245a(new GenericRequestException());
                }
                return aVar2;
            }
        } else {
            C4638h.m10271a("call");
            throw null;
        }
    }
}
