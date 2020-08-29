package p003f.p004a.p005a.p006a.p010d;

import java.util.NoSuchElementException;
import p002es.gob.radarcovid.models.exception.MapperException;
import p002es.gob.radarcovid.models.response.ResponseUuid;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.C4552e;
import p392u.p401r.p402b.C4607a;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;
import p425x.p482c.p483a.C5244a;
import p425x.p482c.p483a.C5244a.C5245a;
import p425x.p482c.p483a.C5244a.C5246b;

/* renamed from: f.a.a.a.d.f0 */
public final class C0462f0 extends C4639i implements C4607a<C5244a<? extends Throwable, ? extends String>> {

    /* renamed from: f */
    public final /* synthetic */ C0484l0 f1835f;

    public C0462f0(C0484l0 l0Var) {
        this.f1835f = l0Var;
        super(0);
    }

    /* renamed from: c */
    public Object mo3123c() {
        C5244a a = this.f1835f.f1860a.mo3663a();
        try {
            if (a.mo11967b()) {
                if (a instanceof C5245a) {
                    return new C5245a(((C5245a) a).f12483a);
                }
                if (a instanceof C5246b) {
                    throw new NoSuchElementException("Either.left.value on Right");
                }
                throw new C4552e();
            } else if (a instanceof C5246b) {
                return new C5246b(((ResponseUuid) ((C5246b) a).f12484a).getUuid());
            } else {
                if (a instanceof C5245a) {
                    throw new NoSuchElementException("Either.right.value on Left");
                }
                throw new C4552e();
            }
        } catch (Exception e) {
            StringBuilder a2 = C1965a.m4756a("Error when mapping to ");
            a2.append(String.class.getSimpleName());
            String sb = a2.toString();
            String message = e.getMessage();
            if (message != null) {
                return new C5245a(new MapperException(sb, message));
            }
            C4638h.m10269a();
            throw null;
        }
    }
}
