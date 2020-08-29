package p003f.p004a.p005a.p006a.p010d;

import java.util.NoSuchElementException;
import p002es.gob.radarcovid.models.request.RequestVerifyCode;
import p002es.gob.radarcovid.models.response.ResponseToken;
import p369s.p370a.p371a.p374b.C4441h;
import p369s.p370a.p371a.p374b.C4442i;
import p369s.p370a.p371a.p378f.p383e.p385b.C4490b.C4491a;
import p392u.C4552e;
import p392u.p401r.p403c.C4638h;
import p425x.p482c.p483a.C5244a;
import p425x.p482c.p483a.C5244a.C5245a;
import p425x.p482c.p483a.C5244a.C5246b;

/* renamed from: f.a.a.a.d.r */
public final class C0491r<T> implements C4442i<T> {

    /* renamed from: a */
    public final /* synthetic */ C0494u f1882a;

    /* renamed from: b */
    public final /* synthetic */ String f1883b;

    public C0491r(C0494u uVar, String str) {
        this.f1882a = uVar;
        this.f1883b = str;
    }

    /* renamed from: a */
    public final void mo3711a(C4441h<ResponseToken> hVar) {
        C5244a a = this.f1882a.f1888c.mo3665a(new RequestVerifyCode(null, this.f1883b));
        String str = "e";
        if (a.mo11967b()) {
            if (a == null) {
                C4638h.m10271a(str);
                throw null;
            } else if (a instanceof C5245a) {
                ((C4491a) hVar).mo10763a((Throwable) ((C5245a) a).f12483a);
            } else if (a instanceof C5246b) {
                throw new NoSuchElementException("Either.left.value on Right");
            } else {
                throw new C4552e();
            }
        } else if (a == null) {
            C4638h.m10271a(str);
            throw null;
        } else if (a instanceof C5246b) {
            C4491a aVar = (C4491a) hVar;
            aVar.mo10762a(((C5246b) a).f12484a);
            aVar.mo10765b();
        } else if (a instanceof C5245a) {
            throw new NoSuchElementException("Either.right.value on Left");
        } else {
            throw new C4552e();
        }
    }
}
