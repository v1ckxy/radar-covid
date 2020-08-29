package p365r.p366a;

import android.app.Application;
import android.content.Context;
import p002es.gob.radarcovid.RadarCovidApplication;
import p003f.p004a.p005a.p108g.p111b.p112a.C0725n;
import p003f.p004a.p005a.p108g.p111b.p113b.C0818o;
import p003f.p004a.p005a.p108g.p111b.p113b.C0832y;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: r.a.b */
public abstract class C4418b extends Application implements C4422e {

    /* renamed from: e */
    public volatile C4420d<Object> f10521e;

    /* renamed from: a */
    public final void mo10709a() {
        if (this.f10521e == null) {
            synchronized (this) {
                if (this.f10521e == null) {
                    RadarCovidApplication radarCovidApplication = (RadarCovidApplication) this;
                    C2286e.m5237a(radarCovidApplication, Context.class);
                    new C0725n(new C0818o(), new C0832y(), radarCovidApplication, null).mo3887a(this);
                    if (this.f10521e == null) {
                        throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the DaggerApplication");
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public C4416a<Object> mo10710k() {
        mo10709a();
        return this.f10521e;
    }

    public void onCreate() {
        super.onCreate();
        mo10709a();
    }
}
