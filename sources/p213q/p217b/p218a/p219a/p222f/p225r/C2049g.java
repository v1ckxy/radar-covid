package p213q.p217b.p218a.p219a.p222f.p225r;

import android.content.Context;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2055d;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2057f;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2072r;
import p213q.p217b.p218a.p219a.p222f.p225r.p227i.C2076c;
import p213q.p217b.p218a.p219a.p222f.p229t.C2099a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p390t.p391a.C4547a;

/* renamed from: q.b.a.a.f.r.g */
public final class C2049g implements C4427b<C2072r> {

    /* renamed from: a */
    public final C4547a<Context> f5847a;

    /* renamed from: b */
    public final C4547a<C2076c> f5848b;

    /* renamed from: c */
    public final C4547a<C2057f> f5849c;

    /* renamed from: d */
    public final C4547a<C2099a> f5850d;

    public C2049g(C4547a<Context> aVar, C4547a<C2076c> aVar2, C4547a<C2057f> aVar3, C4547a<C2099a> aVar4) {
        this.f5847a = aVar;
        this.f5848b = aVar2;
        this.f5849c = aVar3;
        this.f5850d = aVar4;
    }

    public Object get() {
        C2099a aVar = (C2099a) this.f5850d.get();
        C2055d dVar = new C2055d((Context) this.f5847a.get(), (C2076c) this.f5848b.get(), (C2057f) this.f5849c.get());
        C2286e.m5279b(dVar, "Cannot return null from a non-@Nullable @Provides method");
        return dVar;
    }
}
