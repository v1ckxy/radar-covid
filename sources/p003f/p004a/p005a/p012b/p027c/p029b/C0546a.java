package p003f.p004a.p005a.p012b.p027c.p029b;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import p002es.gob.radarcovid.models.domain.ExposureInfo;
import p002es.gob.radarcovid.models.domain.ExposureInfo.Level;
import p003f.p004a.p005a.p006a.p010d.C0459e;
import p003f.p004a.p005a.p012b.p027c.p030c.C0548a;
import p003f.p004a.p005a.p012b.p027c.p030c.C0549b;
import p003f.p004a.p005a.p012b.p027c.p030c.C0550c;
import p003f.p004a.p005a.p108g.p109a.p110h.C0710a;
import p003f.p004a.p005a.p108g.p109a.p110h.C0711b;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p363c.p364a.C4413h;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.b.c.b.a */
public final class C0546a implements C0548a {

    /* renamed from: a */
    public final C0550c f1971a;

    /* renamed from: b */
    public final C0549b f1972b;

    /* renamed from: c */
    public final C0459e f1973c;

    public C0546a(C0550c cVar, C0549b bVar, C0459e eVar) {
        if (cVar == null) {
            C4638h.m10271a("view");
            throw null;
        } else if (bVar == null) {
            C4638h.m10271a("router");
            throw null;
        } else if (eVar != null) {
            this.f1971a = cVar;
            this.f1972b = bVar;
            this.f1973c = eVar;
        } else {
            C4638h.m10271a("getExposureInfoUseCase");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3759a() {
    }

    /* renamed from: a */
    public void mo3761a(String str) {
        if (str != null) {
            this.f1972b.mo3766a(str);
        } else {
            C4638h.m10271a("url");
            throw null;
        }
    }

    /* renamed from: b */
    public void mo3762b() {
        C0710a aVar = C0710a.f2168b;
        C0710a.m1892a(this);
        mo3760a(this.f1973c.mo3710a());
    }

    /* renamed from: c */
    public void mo3763c() {
        C0710a aVar = C0710a.f2168b;
        C0710a.m1893b(this);
    }

    /* renamed from: d */
    public void mo3764d() {
        this.f1971a.mo3166f();
    }

    @C4413h
    public final void onExposureStatusChange(C0711b bVar) {
        if (bVar != null) {
            mo3760a(this.f1973c.mo3710a());
        } else {
            C4638h.m10271a("event");
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo3760a(ExposureInfo exposureInfo) {
        int ordinal = exposureInfo.getLevel().ordinal();
        if (ordinal == 0) {
            this.f1971a.mo3165e();
        } else if (ordinal == 1) {
            this.f1971a.mo3167h();
        } else if (ordinal == 2) {
            this.f1971a.mo3164d();
        }
        if (C4638h.m10272a((Object) exposureInfo.getLastUpdateTime(), (Object) new Date(0))) {
            this.f1971a.mo3169y();
        } else if (exposureInfo.getLevel() == Level.LOW) {
            this.f1971a.mo3161a(C2286e.m5192a(exposureInfo.getLastUpdateTime()), null, null, null);
        } else if (exposureInfo.getLevel() == Level.INFECTED) {
            long currentTimeMillis = System.currentTimeMillis() - exposureInfo.getLastExposureDate().getTime();
            long days = TimeUnit.MILLISECONDS.toDays(currentTimeMillis);
            long hours = TimeUnit.MILLISECONDS.toHours(currentTimeMillis) - (((long) 24) * days);
            this.f1971a.mo3162b(C2286e.m5192a(exposureInfo.getLastUpdateTime()), Integer.valueOf((int) days), Integer.valueOf((int) hours), Integer.valueOf((int) (TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis) - (((long) 60) * hours))));
        } else {
            long currentTimeMillis2 = System.currentTimeMillis() - exposureInfo.getLastExposureDate().getTime();
            long days2 = TimeUnit.MILLISECONDS.toDays(currentTimeMillis2);
            long hours2 = TimeUnit.MILLISECONDS.toHours(currentTimeMillis2) - (((long) 24) * days2);
            this.f1971a.mo3161a(C2286e.m5192a(exposureInfo.getLastUpdateTime()), Integer.valueOf((int) days2), Integer.valueOf((int) hours2), Integer.valueOf((int) (TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis2) - (((long) 60) * hours2))));
        }
    }
}
