package p213q.p217b.p317d.p350n.p351o;

import p213q.p217b.p317d.p350n.p351o.C4292a.C4294b;
import p213q.p217b.p317d.p350n.p351o.C4296c.C4297a;

/* renamed from: q.b.d.n.o.d */
public abstract class C4298d {

    /* renamed from: q.b.d.n.o.d$a */
    public static abstract class C4299a {
        /* renamed from: a */
        public abstract C4299a mo10503a(long j);

        /* renamed from: a */
        public abstract C4299a mo10504a(C4297a aVar);

        /* renamed from: a */
        public abstract C4298d mo10505a();

        /* renamed from: b */
        public abstract C4299a mo10506b(long j);
    }

    static {
        C4294b bVar = new C4294b();
        bVar.mo10506b(0);
        bVar.mo10504a(C4297a.ATTEMPT_MIGRATION);
        bVar.mo10503a(0);
        bVar.mo10505a();
    }

    /* renamed from: d */
    public static C4299a m9810d() {
        C4294b bVar = new C4294b();
        bVar.mo10506b(0);
        bVar.mo10504a(C4297a.ATTEMPT_MIGRATION);
        bVar.mo10503a(0);
        return bVar;
    }

    /* renamed from: a */
    public boolean mo10513a() {
        return ((C4292a) this).f10317b == C4297a.REGISTER_ERROR;
    }

    /* renamed from: b */
    public boolean mo10514b() {
        C4297a aVar = ((C4292a) this).f10317b;
        return aVar == C4297a.NOT_GENERATED || aVar == C4297a.ATTEMPT_MIGRATION;
    }

    /* renamed from: c */
    public abstract C4299a mo10499c();
}
