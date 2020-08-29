package p365r.p366a.p367f;

import android.app.Application;
import android.os.Bundle;
import p124p.p126b.p127k.C1036e;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p366a.C4416a;
import p365r.p366a.C4420d;
import p365r.p366a.C4422e;

/* renamed from: r.a.f.a */
public abstract class C4423a extends C1036e implements C4422e {

    /* renamed from: t */
    public C4420d<Object> f10523t;

    /* renamed from: k */
    public C4416a<Object> mo10710k() {
        return this.f10523t;
    }

    public void onCreate(Bundle bundle) {
        C2286e.m5279b(this, "activity");
        Application application = getApplication();
        if (application instanceof C4422e) {
            C4422e eVar = (C4422e) application;
            C4416a k = eVar.mo10710k();
            C2286e.m5182a(k, "%s.androidInjector() returned null", (Object) eVar.getClass());
            k.mo3887a(this);
            super.onCreate(bundle);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), C4422e.class.getCanonicalName()}));
    }
}
