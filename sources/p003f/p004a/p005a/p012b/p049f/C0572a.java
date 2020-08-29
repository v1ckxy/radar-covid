package p003f.p004a.p005a.p012b.p049f;

import android.content.Context;
import com.google.android.gms.nearby.exposurenotification.ExposureSummary;
import p002es.gob.radarcovid.features.kpireport.KpiReportWorker;
import p002es.gob.radarcovid.models.request.RequestKpiReport;
import p119o.p120a.C0919b0;
import p213q.p217b.p218a.p231b.p270l.C3245d;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p392u.C4560l;
import p392u.p395p.C4580d;
import p392u.p395p.p397k.p398a.C4601h;
import p392u.p401r.p402b.C4622p;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.f.a */
public final class C0572a extends C4601h implements C4622p<C0919b0, C4580d<? super RequestKpiReport>, Object> {

    /* renamed from: i */
    public C0919b0 f1989i;

    /* renamed from: j */
    public Object f1990j;

    /* renamed from: k */
    public Object f1991k;

    /* renamed from: l */
    public int f1992l;

    /* renamed from: m */
    public final /* synthetic */ String f1993m;

    /* renamed from: n */
    public final /* synthetic */ String f1994n;

    /* renamed from: o */
    public final /* synthetic */ KpiReportWorker f1995o;

    /* renamed from: p */
    public final /* synthetic */ Context f1996p;

    /* renamed from: f.a.a.b.f.a$a */
    public static final class C0573a<TResult> implements C3245d<ExposureSummary> {

        /* renamed from: a */
        public final /* synthetic */ C4580d f1997a;

        /* renamed from: b */
        public final /* synthetic */ C0572a f1998b;

        public C0573a(C4580d dVar, C0572a aVar) {
            this.f1997a = dVar;
            this.f1998b = aVar;
        }

        /* renamed from: a */
        public final void mo3784a(C3255i<ExposureSummary> iVar) {
            if (iVar == null) {
                C4638h.m10271a("task");
                throw null;
            } else if (iVar.mo8936d()) {
                C4580d dVar = this.f1997a;
                KpiReportWorker kpiReportWorker = this.f1998b.f1995o;
                Object b = iVar.mo8931b();
                C4638h.m10270a(b, "task.result");
                dVar.mo4217a(KpiReportWorker.m1337a(kpiReportWorker, (ExposureSummary) b, this.f1998b.f1994n));
            } else {
                this.f1997a.mo4217a(null);
            }
        }
    }

    public C0572a(String str, String str2, C4580d dVar, KpiReportWorker kpiReportWorker, Context context) {
        this.f1993m = str;
        this.f1994n = str2;
        this.f1995o = kpiReportWorker;
        this.f1996p = context;
        super(2, dVar);
    }

    /* renamed from: a */
    public final Object mo3781a(Object obj, Object obj2) {
        return ((C0572a) mo3782a(obj, (C4580d) obj2)).mo3783c(C4560l.f10773a);
    }

    /* renamed from: a */
    public final C4580d<C4560l> mo3782a(Object obj, C4580d<?> dVar) {
        if (dVar != null) {
            C0572a aVar = new C0572a(this.f1993m, this.f1994n, dVar, this.f1995o, this.f1996p);
            aVar.f1989i = (C0919b0) obj;
            return aVar;
        }
        C4638h.m10271a("completion");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090 A[RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo3783c(java.lang.Object r8) {
        /*
            r7 = this;
            u.p.j.a r0 = p392u.p395p.p396j.C4590a.COROUTINE_SUSPENDED
            int r1 = r7.f1992l
            r2 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            java.lang.Object r0 = r7.f1991k
            f.a.a.b.f.a r0 = (p003f.p004a.p005a.p012b.p049f.C0572a) r0
            java.lang.Object r0 = r7.f1990j
            o.a.b0 r0 = (p119o.p120a.C0919b0) r0
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5339f(r8)
            goto L_0x0091
        L_0x0016:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x001e:
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5339f(r8)
            o.a.b0 r8 = r7.f1989i
            r7.f1990j = r8
            r7.f1991k = r7
            r7.f1992l = r2
            u.p.i r8 = new u.p.i
            u.p.d r1 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5218a(r7)
            r8.<init>(r1)
            android.content.Context r1 = r7.f1996p
            x.b.a.a.l.n.m r1 = p425x.p472b.p473a.p474a.p476l.p480n.C5242m.m11680a(r1)
            java.lang.String r3 = r7.f1993m
            q.b.a.b.i.c.b r1 = r1.f12480a
            q.b.a.b.g.f.n2 r1 = (p213q.p217b.p218a.p231b.p251g.p257f.C2842n2) r1
            r4 = 0
            if (r1 == 0) goto L_0x0098
            q.b.a.b.d.m.k.m$a r5 = p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2190m.m5016a()
            q.b.a.b.g.f.t2 r6 = new q.b.a.b.g.f.t2
            r6.<init>(r1, r3)
            r5.f6092a = r6
            q.b.a.b.d.d[] r2 = new p213q.p217b.p218a.p231b.p239d.C2119d[r2]
            q.b.a.b.d.d r3 = p213q.p217b.p218a.p231b.p262i.C3216e.f8070c
            r6 = 0
            r2[r6] = r3
            r5.f6094c = r2
            q.b.a.b.d.m.k.m r2 = r5.mo7206a()
            q.b.a.b.l.i r1 = r1.mo7139a(r6, r2)
            f.a.a.b.f.a$a r2 = new f.a.a.b.f.a$a
            r2.<init>(r8, r7)
            q.b.a.b.l.f0 r1 = (p213q.p217b.p218a.p231b.p270l.C3250f0) r1
            if (r1 == 0) goto L_0x0097
            java.util.concurrent.Executor r3 = p213q.p217b.p218a.p231b.p270l.C3259k.f8131a
            r1.mo8924a(r3, r2)
            java.lang.Object r1 = r8.result
            u.p.j.a r2 = p392u.p395p.p396j.C4590a.UNDECIDED
            if (r1 != r2) goto L_0x0080
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<u.p.i<?>, java.lang.Object> r1 = p392u.p395p.C4589i.f10793f
            u.p.j.a r3 = p392u.p395p.p396j.C4590a.COROUTINE_SUSPENDED
            boolean r1 = r1.compareAndSet(r8, r2, r3)
            if (r1 == 0) goto L_0x007e
            u.p.j.a r8 = p392u.p395p.p396j.C4590a.COROUTINE_SUSPENDED
            goto L_0x008c
        L_0x007e:
            java.lang.Object r1 = r8.result
        L_0x0080:
            u.p.j.a r8 = p392u.p395p.p396j.C4590a.RESUMED
            if (r1 != r8) goto L_0x0087
            u.p.j.a r1 = p392u.p395p.p396j.C4590a.COROUTINE_SUSPENDED
            goto L_0x008b
        L_0x0087:
            boolean r8 = r1 instanceof p392u.C4554g.C4555a
            if (r8 != 0) goto L_0x0092
        L_0x008b:
            r8 = r1
        L_0x008c:
            u.p.j.a r1 = p392u.p395p.p396j.C4590a.COROUTINE_SUSPENDED
            if (r8 != r0) goto L_0x0091
            return r0
        L_0x0091:
            return r8
        L_0x0092:
            u.g$a r1 = (p392u.C4554g.C4555a) r1
            java.lang.Throwable r8 = r1.f10768e
            throw r8
        L_0x0097:
            throw r4
        L_0x0098:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p003f.p004a.p005a.p012b.p049f.C0572a.mo3783c(java.lang.Object):java.lang.Object");
    }
}
