package p003f.p004a.p005a.p006a.p010d;

import java.util.List;
import p002es.gob.radarcovid.models.domain.Language;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p369s.p370a.p371a.p374b.C4441h;
import p369s.p370a.p371a.p374b.C4442i;
import p369s.p370a.p371a.p378f.p383e.p385b.C4490b.C4491a;
import p392u.C4560l;
import p392u.p401r.p402b.C4607a;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;
import p425x.p482c.p483a.C5244a;

/* renamed from: f.a.a.a.d.h0 */
public final class C0468h0<T> implements C4442i<T> {

    /* renamed from: a */
    public final /* synthetic */ C0484l0 f1841a;

    /* renamed from: f.a.a.a.d.h0$a */
    public static final class C0469a extends C4639i implements C4618l<List<? extends Language>, C4560l> {

        /* renamed from: f */
        public final /* synthetic */ C4441h f1842f;

        public C0469a(C4441h hVar) {
            this.f1842f = hVar;
            super(1);
        }

        /* renamed from: b */
        public Object mo3153b(Object obj) {
            List list = (List) obj;
            if (list != null) {
                ((C4491a) this.f1842f).mo10762a(list);
                ((C4491a) this.f1842f).mo10765b();
                return C4560l.f10773a;
            }
            C4638h.m10271a("it");
            throw null;
        }
    }

    /* renamed from: f.a.a.a.d.h0$b */
    public static final class C0470b extends C4639i implements C4618l<Throwable, C4560l> {

        /* renamed from: f */
        public final /* synthetic */ C4441h f1843f;

        public C0470b(C4441h hVar) {
            this.f1843f = hVar;
            super(1);
        }

        /* renamed from: b */
        public Object mo3153b(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                ((C4491a) this.f1843f).mo10763a(th);
                ((C4491a) this.f1843f).mo10765b();
                return C4560l.f10773a;
            }
            C4638h.m10271a("it");
            throw null;
        }
    }

    public C0468h0(C0484l0 l0Var) {
        this.f1841a = l0Var;
    }

    /* renamed from: a */
    public final void mo3711a(C4441h<List<Language>> hVar) {
        C0484l0 l0Var = this.f1841a;
        C0469a aVar = new C0469a(hVar);
        C0470b bVar = new C0470b(hVar);
        if (l0Var != null) {
            C2286e.m5250a((C4618l<? super T, C4560l>) aVar, (C4618l<? super Throwable, C4560l>) bVar, (C4607a<? extends C5244a<? extends Throwable, ? extends T>>) new C0456c0<Object>(l0Var));
            return;
        }
        throw null;
    }
}
