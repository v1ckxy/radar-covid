package p003f.p004a.p005a.p012b.p013a.p014a;

import p002es.gob.radarcovid.models.domain.ExposureInfo;
import p002es.gob.radarcovid.models.domain.ExposureInfo.Level;
import p003f.p004a.p005a.p006a.p010d.C0455c;
import p003f.p004a.p005a.p006a.p010d.C0459e;
import p003f.p004a.p005a.p006a.p010d.C0485m;
import p003f.p004a.p005a.p012b.p013a.p017d.C0515a;
import p003f.p004a.p005a.p012b.p013a.p017d.C0516b;
import p003f.p004a.p005a.p012b.p013a.p017d.C0517c;
import p003f.p004a.p005a.p108g.p109a.p110h.C0710a;
import p003f.p004a.p005a.p108g.p109a.p110h.C0711b;
import p213q.p363c.p364a.C4413h;
import p392u.C4560l;
import p392u.p401r.p402b.C4607a;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;

/* renamed from: f.a.a.b.a.a.a */
public final class C0502a implements C0515a {

    /* renamed from: a */
    public final C0517c f1901a;

    /* renamed from: b */
    public final C0516b f1902b;

    /* renamed from: c */
    public final C0485m f1903c;

    /* renamed from: d */
    public final C0455c f1904d;

    /* renamed from: e */
    public final C0459e f1905e;

    /* renamed from: f.a.a.b.a.a.a$a */
    /* compiled from: com.android.tools.r8.jetbrains.kotlin-style lambda group */
    public static final class C0503a extends C4639i implements C4607a<C4560l> {

        /* renamed from: f */
        public final /* synthetic */ int f1906f;

        /* renamed from: g */
        public final /* synthetic */ Object f1907g;

        public C0503a(int i, Object obj) {
            this.f1906f = i;
            this.f1907g = obj;
            super(0);
        }

        /* renamed from: c */
        public final Object mo3123c() {
            int i = this.f1906f;
            if (i == 0) {
                ((C0502a) this.f1907g).f1901a.mo3945v();
                ((C0502a) this.f1907g).f1901a.mo3733c(true);
                return C4560l.f10773a;
            } else if (i == 1) {
                ((C0502a) this.f1907g).f1901a.mo3733c(false);
                ((C0502a) this.f1907g).f1901a.mo3945v();
                return C4560l.f10773a;
            } else {
                throw null;
            }
        }
    }

    /* renamed from: f.a.a.b.a.a.a$b */
    public static final class C0504b extends C4639i implements C4618l<Exception, C4560l> {

        /* renamed from: f */
        public final /* synthetic */ C0502a f1908f;

        public C0504b(C0502a aVar) {
            this.f1908f = aVar;
            super(1);
        }

        /* renamed from: b */
        public Object mo3153b(Object obj) {
            Exception exc = (Exception) obj;
            if (exc != null) {
                this.f1908f.f1901a.mo3733c(false);
                this.f1908f.f1901a.mo3943a(exc);
                return C4560l.f10773a;
            }
            C4638h.m10271a("it");
            throw null;
        }
    }

    public C0502a(C0517c cVar, C0516b bVar, C0485m mVar, C0455c cVar2, C0459e eVar) {
        if (cVar == null) {
            C4638h.m10271a("view");
            throw null;
        } else if (bVar == null) {
            C4638h.m10271a("router");
            throw null;
        } else if (mVar == null) {
            C4638h.m10271a("onboardingCompletedUseCase");
            throw null;
        } else if (cVar2 == null) {
            C4638h.m10271a("exposureRadarUseCase");
            throw null;
        } else if (eVar != null) {
            this.f1901a = cVar;
            this.f1902b = bVar;
            this.f1903c = mVar;
            this.f1904d = cVar2;
            this.f1905e = eVar;
        } else {
            C4638h.m10271a("getExposureInfoUseCase");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3717a() {
        this.f1902b.mo3745c();
    }

    /* renamed from: a */
    public void mo3718a(boolean z) {
        if (this.f1903c.f1867a.mo3688h()) {
            this.f1901a.mo3733c(this.f1904d.mo3709a());
            return;
        }
        this.f1903c.f1867a.mo3678a(true);
        if (z) {
            mo3720b(false);
            this.f1901a.mo3730L();
        }
    }

    /* renamed from: b */
    public void mo3719b() {
        C0710a aVar = C0710a.f2168b;
        C0710a.m1892a(this);
        mo3725g();
    }

    /* renamed from: b */
    public void mo3720b(boolean z) {
        if (z) {
            this.f1901a.mo3733c(false);
            this.f1904d.f1828a.mo3651a();
        } else if (this.f1901a.mo3727E()) {
            mo3722d();
        } else {
            this.f1901a.mo3738p();
        }
    }

    /* renamed from: c */
    public void mo3721c() {
        C0710a aVar = C0710a.f2168b;
        C0710a.m1893b(this);
    }

    /* renamed from: d */
    public void mo3722d() {
        this.f1901a.mo3942B();
        C0455c cVar = this.f1904d;
        cVar.f1828a.mo3653a(new C0503a(0, this), new C0504b(this), new C0503a(1, this));
    }

    /* renamed from: e */
    public void mo3723e() {
        if (!this.f1904d.mo3709a()) {
            this.f1901a.mo3741w();
        } else if (this.f1905e.mo3710a().getLevel() == Level.INFECTED) {
            this.f1902b.mo3744b();
        } else {
            this.f1902b.mo3746d();
        }
    }

    /* renamed from: f */
    public void mo3724f() {
        this.f1902b.mo3743a();
    }

    /* renamed from: g */
    public final void mo3725g() {
        ExposureInfo a = this.f1905e.mo3710a();
        this.f1901a.mo3732b(a.getExposureNotificationsEnabled() && this.f1904d.mo3709a());
        if (a.getExposureNotificationsEnabled()) {
            this.f1901a.mo3728F();
        } else {
            this.f1901a.mo3731N();
        }
        if (a.getLevel() == Level.INFECTED) {
            this.f1901a.mo3729I();
        } else {
            this.f1901a.mo3739q();
        }
        int ordinal = a.getLevel().ordinal();
        if (ordinal == 0) {
            this.f1901a.mo3736e();
        } else if (ordinal == 1) {
            this.f1901a.mo3737h();
        } else if (ordinal == 2) {
            this.f1901a.mo3735d();
        }
    }

    @C4413h
    public final void onExposureStatusChange(C0711b bVar) {
        if (bVar != null) {
            mo3725g();
        } else {
            C4638h.m10271a("event");
            throw null;
        }
    }
}
