package p003f.p004a.p005a.p012b.p087k.p088a.p089a;

import p002es.gob.radarcovid.features.poll.completed.view.PollCompletedFragment;
import p003f.p004a.p005a.p012b.p087k.p088a.p091c.C0657b;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.k.a.a.c */
public final class C0653c implements C4427b<C0657b> {

    /* renamed from: a */
    public final C0651a f2091a;

    /* renamed from: b */
    public final C4547a<PollCompletedFragment> f2092b;

    public C0653c(C0651a aVar, C4547a<PollCompletedFragment> aVar2) {
        this.f2091a = aVar;
        this.f2092b = aVar2;
    }

    public Object get() {
        PollCompletedFragment pollCompletedFragment = (PollCompletedFragment) this.f2092b.get();
        if (this.f2091a == null) {
            throw null;
        } else if (pollCompletedFragment != null) {
            C2286e.m5279b(pollCompletedFragment, "Cannot return null from a non-@Nullable @Provides method");
            return pollCompletedFragment;
        } else {
            C4638h.m10271a("fragment");
            throw null;
        }
    }
}
