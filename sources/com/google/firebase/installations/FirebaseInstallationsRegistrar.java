package com.google.firebase.installations;

import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p317d.C3859c;
import p213q.p217b.p317d.p321g.C3884d;
import p213q.p217b.p317d.p321g.C3884d.C3886b;
import p213q.p217b.p317d.p321g.C3887e;
import p213q.p217b.p317d.p321g.C3890h;
import p213q.p217b.p317d.p321g.C3891i;
import p213q.p217b.p317d.p321g.C3899q;
import p213q.p217b.p317d.p346k.C4212c;
import p213q.p217b.p317d.p350n.C4281f;
import p213q.p217b.p317d.p350n.C4283g;
import p213q.p217b.p317d.p350n.C4286i;
import p213q.p217b.p317d.p354p.C4317f;

@Keep
public class FirebaseInstallationsRegistrar implements C3891i {
    public static /* synthetic */ C4283g lambda$getComponents$0(C3887e eVar) {
        return new C4281f((C3859c) eVar.mo10075a(C3859c.class), (C4317f) eVar.mo10075a(C4317f.class), (C4212c) eVar.mo10075a(C4212c.class));
    }

    public List<C3884d<?>> getComponents() {
        C3886b a = C3884d.m9271a(C4283g.class);
        a.mo10081a(C3899q.m9288a(C3859c.class));
        a.mo10081a(C3899q.m9288a(C4212c.class));
        a.mo10081a(C3899q.m9288a(C4317f.class));
        a.mo10080a((C3890h<T>) C4286i.f10309a);
        return Arrays.asList(new C3884d[]{a.mo10082a(), C2286e.m5216a("fire-installations", "16.3.2")});
    }
}
