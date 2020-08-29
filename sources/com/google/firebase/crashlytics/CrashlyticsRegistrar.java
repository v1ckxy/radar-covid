package com.google.firebase.crashlytics;

import java.util.Arrays;
import java.util.List;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p317d.C3859c;
import p213q.p217b.p317d.p318f.p319a.C3867a;
import p213q.p217b.p317d.p321g.C3884d;
import p213q.p217b.p317d.p321g.C3884d.C3886b;
import p213q.p217b.p317d.p321g.C3890h;
import p213q.p217b.p317d.p321g.C3891i;
import p213q.p217b.p317d.p321g.C3899q;
import p213q.p217b.p317d.p322h.C3909b;
import p213q.p217b.p317d.p322h.C3911d;
import p213q.p217b.p317d.p322h.p323e.C3912a;
import p213q.p217b.p317d.p347l.p348b.C4218a;

public class CrashlyticsRegistrar implements C3891i {
    public List<C3884d<?>> getComponents() {
        C3886b a = C3884d.m9271a(C3911d.class);
        a.mo10081a(C3899q.m9288a(C3859c.class));
        a.mo10081a(new C3899q(C4218a.class, 1, 1));
        a.mo10081a(new C3899q(C3867a.class, 0, 0));
        a.mo10081a(new C3899q(C3912a.class, 0, 0));
        a.mo10080a((C3890h<T>) new C3909b<T>(this));
        a.mo10079a(2);
        return Arrays.asList(new C3884d[]{a.mo10082a(), C2286e.m5216a("fire-cls", "17.1.1")});
    }
}
