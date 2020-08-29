package p003f.p004a.p005a.p006a.p010d;

import p116io.jsonwebtoken.lang.Objects;
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

/* renamed from: f.a.a.a.d.k0 */
public final class C0480k0<T> implements C4442i<T> {

    /* renamed from: a */
    public final /* synthetic */ C0484l0 f1855a;

    /* renamed from: f.a.a.a.d.k0$a */
    public static final class C0481a extends C4639i implements C4618l<String, C4560l> {

        /* renamed from: f */
        public final /* synthetic */ C4441h f1856f;

        public C0481a(C4441h hVar) {
            this.f1856f = hVar;
            super(1);
        }

        /* renamed from: b */
        public Object mo3153b(Object obj) {
            String str = (String) obj;
            if (str != null) {
                ((C4491a) this.f1856f).mo10762a(str);
                ((C4491a) this.f1856f).mo10765b();
                return C4560l.f10773a;
            }
            C4638h.m10271a("it");
            throw null;
        }
    }

    /* renamed from: f.a.a.a.d.k0$b */
    public static final class C0482b extends C4639i implements C4618l<Throwable, C4560l> {

        /* renamed from: f */
        public final /* synthetic */ C4441h f1857f;

        public C0482b(C4441h hVar) {
            this.f1857f = hVar;
            super(1);
        }

        /* renamed from: b */
        public Object mo3153b(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                ((C4491a) this.f1857f).mo10763a(th);
                ((C4491a) this.f1857f).mo10765b();
                return C4560l.f10773a;
            }
            C4638h.m10271a("it");
            throw null;
        }
    }

    public C0480k0(C0484l0 l0Var) {
        this.f1855a = l0Var;
    }

    /* renamed from: a */
    public final void mo3711a(C4441h<String> hVar) {
        if (this.f1855a.f1861b.mo3673a().length() > 0) {
            C4491a aVar = (C4491a) hVar;
            aVar.mo10762a(Objects.EMPTY_STRING);
            aVar.mo10765b();
            return;
        }
        C0484l0 l0Var = this.f1855a;
        C0481a aVar2 = new C0481a(hVar);
        C0482b bVar = new C0482b(hVar);
        if (l0Var != null) {
            C2286e.m5250a((C4618l<? super T, C4560l>) aVar2, (C4618l<? super Throwable, C4560l>) bVar, (C4607a<? extends C5244a<? extends Throwable, ? extends T>>) new C0462f0<Object>(l0Var));
            return;
        }
        throw null;
    }
}
