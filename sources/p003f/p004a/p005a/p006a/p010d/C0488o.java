package p003f.p004a.p005a.p006a.p010d;

import java.util.List;
import java.util.NoSuchElementException;
import p002es.gob.radarcovid.models.domain.Question;
import p002es.gob.radarcovid.models.exception.MapperException;
import p002es.gob.radarcovid.models.response.ResponseQuestions;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.C4552e;
import p392u.p401r.p402b.C4607a;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;
import p425x.p482c.p483a.C5244a;
import p425x.p482c.p483a.C5244a.C5245a;
import p425x.p482c.p483a.C5244a.C5246b;

/* renamed from: f.a.a.a.d.o */
public final class C0488o extends C4639i implements C4607a<C5244a<? extends Throwable, ? extends List<? extends Question>>> {

    /* renamed from: f */
    public final /* synthetic */ C0490q f1876f;

    public C0488o(C0490q qVar) {
        this.f1876f = qVar;
        super(0);
    }

    /* renamed from: c */
    public Object mo3123c() {
        C5244a b = this.f1876f.f1879a.mo3669b();
        try {
            if (b.mo11967b()) {
                if (b instanceof C5245a) {
                    return new C5245a(((C5245a) b).f12483a);
                }
                if (b instanceof C5246b) {
                    throw new NoSuchElementException("Either.left.value on Right");
                }
                throw new C4552e();
            } else if (b instanceof C5246b) {
                return new C5246b(this.f1876f.f1881c.mo3702a((ResponseQuestions) ((C5246b) b).f12484a));
            } else if (b instanceof C5245a) {
                throw new NoSuchElementException("Either.right.value on Left");
            } else {
                throw new C4552e();
            }
        } catch (Exception e) {
            StringBuilder a = C1965a.m4756a("Error when mapping to ");
            a.append(List.class.getSimpleName());
            String sb = a.toString();
            String message = e.getMessage();
            if (message != null) {
                return new C5245a(new MapperException(sb, message));
            }
            C4638h.m10269a();
            throw null;
        }
    }
}
