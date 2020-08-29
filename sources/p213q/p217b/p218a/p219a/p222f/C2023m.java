package p213q.p217b.p218a.p219a.p222f;

import android.content.Context;
import p213q.p217b.p218a.p219a.p222f.p225r.C2047e;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2066l;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2068n;
import p213q.p217b.p218a.p219a.p222f.p225r.p226h.C2070p;
import p213q.p217b.p218a.p219a.p222f.p229t.C2099a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.a.f.m */
public class C2023m implements C2022l {

    /* renamed from: e */
    public static volatile C2024n f5793e;

    /* renamed from: a */
    public final C2099a f5794a;

    /* renamed from: b */
    public final C2099a f5795b;

    /* renamed from: c */
    public final C2047e f5796c;

    /* renamed from: d */
    public final C2066l f5797d;

    public C2023m(C2099a aVar, C2099a aVar2, C2047e eVar, C2066l lVar, C2070p pVar) {
        this.f5794a = aVar;
        this.f5795b = aVar2;
        this.f5796c = eVar;
        this.f5797d = lVar;
        pVar.f5900a.execute(new C2068n(pVar));
    }

    /* renamed from: a */
    public static C2023m m4806a() {
        C2024n nVar = f5793e;
        if (nVar != null) {
            return (C2023m) ((C2009c) nVar).f5779p.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: a */
    public static void m4807a(Context context) {
        if (f5793e == null) {
            synchronized (C2023m.class) {
                if (f5793e == null) {
                    if (context != null) {
                        C2286e.m5237a(context, Context.class);
                        f5793e = new C2009c(context, null);
                    } else {
                        throw null;
                    }
                }
            }
        }
    }
}
