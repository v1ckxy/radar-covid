package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p317d.C3859c;
import p213q.p217b.p317d.p318f.p319a.C3867a;
import p213q.p217b.p317d.p318f.p319a.p320c.C3873b;
import p213q.p217b.p317d.p321g.C3884d;
import p213q.p217b.p317d.p321g.C3884d.C3886b;
import p213q.p217b.p317d.p321g.C3891i;
import p213q.p217b.p317d.p321g.C3899q;
import p213q.p217b.p317d.p345j.C4209d;

@Keep
public class AnalyticsConnectorRegistrar implements C3891i {
    @SuppressLint({"MissingPermission"})
    @Keep
    public List<C3884d<?>> getComponents() {
        C3886b a = C3884d.m9271a(C3867a.class);
        a.mo10081a(C3899q.m9288a(C3859c.class));
        a.mo10081a(C3899q.m9288a(Context.class));
        a.mo10081a(C3899q.m9288a(C4209d.class));
        a.mo10080a(C3873b.f9485a);
        a.mo10079a(2);
        return Arrays.asList(new C3884d[]{a.mo10082a(), C2286e.m5216a("fire-analytics", "17.4.4")});
    }
}
