package p003f.p004a.p005a.p006a.p007a;

import p002es.gob.radarcovid.models.request.RequestKpiReport;
import p002es.gob.radarcovid.models.request.RequestPostAnswers;
import p002es.gob.radarcovid.models.request.RequestVerifyCode;
import p002es.gob.radarcovid.models.response.ResponseLabels;
import p002es.gob.radarcovid.models.response.ResponseLanguages;
import p002es.gob.radarcovid.models.response.ResponseQuestions;
import p002es.gob.radarcovid.models.response.ResponseRegions;
import p002es.gob.radarcovid.models.response.ResponseSettings;
import p002es.gob.radarcovid.models.response.ResponseToken;
import p002es.gob.radarcovid.models.response.ResponseUuid;
import p003f.p004a.p005a.p006a.p008b.C0436a;
import p003f.p004a.p005a.p108g.p109a.C0707f;
import p392u.C4560l;
import p392u.p401r.p402b.C4607a;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;
import p425x.p482c.p483a.C5244a;
import p484y.C5264d;

/* renamed from: f.a.a.a.a.c */
public final class C0414c extends C0707f implements C0413b {

    /* renamed from: a */
    public final C0436a f1791a;

    /* renamed from: f.a.a.a.a.c$a */
    public static final class C0415a extends C4639i implements C4607a<C5264d<ResponseLabels>> {

        /* renamed from: f */
        public final /* synthetic */ C0414c f1792f;

        /* renamed from: g */
        public final /* synthetic */ String f1793g;

        /* renamed from: h */
        public final /* synthetic */ String f1794h;

        /* renamed from: i */
        public final /* synthetic */ String f1795i;

        public C0415a(C0414c cVar, String str, String str2, String str3) {
            this.f1792f = cVar;
            this.f1793g = str;
            this.f1794h = str2;
            this.f1795i = str3;
            super(0);
        }

        /* renamed from: c */
        public Object mo3123c() {
            return this.f1792f.f1791a.mo3697a(this.f1793g, this.f1794h, this.f1795i);
        }
    }

    /* renamed from: f.a.a.a.a.c$b */
    public static final class C0416b extends C4639i implements C4607a<C5264d<ResponseLanguages>> {

        /* renamed from: f */
        public final /* synthetic */ C0414c f1796f;

        /* renamed from: g */
        public final /* synthetic */ String f1797g;

        /* renamed from: h */
        public final /* synthetic */ String f1798h;

        public C0416b(C0414c cVar, String str, String str2) {
            this.f1796f = cVar;
            this.f1797g = str;
            this.f1798h = str2;
            super(0);
        }

        /* renamed from: c */
        public Object mo3123c() {
            return this.f1796f.f1791a.mo3696a(this.f1797g, this.f1798h);
        }
    }

    /* renamed from: f.a.a.a.a.c$c */
    public static final class C0417c extends C4639i implements C4607a<C5264d<ResponseQuestions>> {

        /* renamed from: f */
        public final /* synthetic */ C0414c f1799f;

        public C0417c(C0414c cVar) {
            this.f1799f = cVar;
            super(0);
        }

        /* renamed from: c */
        public Object mo3123c() {
            return this.f1799f.f1791a.mo3699b();
        }
    }

    /* renamed from: f.a.a.a.a.c$d */
    public static final class C0418d extends C4639i implements C4607a<C5264d<ResponseRegions>> {

        /* renamed from: f */
        public final /* synthetic */ C0414c f1800f;

        /* renamed from: g */
        public final /* synthetic */ String f1801g;

        /* renamed from: h */
        public final /* synthetic */ String f1802h;

        public C0418d(C0414c cVar, String str, String str2) {
            this.f1800f = cVar;
            this.f1801g = str;
            this.f1802h = str2;
            super(0);
        }

        /* renamed from: c */
        public Object mo3123c() {
            return this.f1800f.f1791a.mo3698a(this.f1801g, this.f1802h, true);
        }
    }

    /* renamed from: f.a.a.a.a.c$e */
    public static final class C0419e extends C4639i implements C4607a<C5264d<ResponseSettings>> {

        /* renamed from: f */
        public final /* synthetic */ C0414c f1803f;

        public C0419e(C0414c cVar) {
            this.f1803f = cVar;
            super(0);
        }

        /* renamed from: c */
        public Object mo3123c() {
            return this.f1803f.f1791a.mo3700c();
        }
    }

    /* renamed from: f.a.a.a.a.c$f */
    public static final class C0420f extends C4639i implements C4607a<C5264d<ResponseUuid>> {

        /* renamed from: f */
        public final /* synthetic */ C0414c f1804f;

        public C0420f(C0414c cVar) {
            this.f1804f = cVar;
            super(0);
        }

        /* renamed from: c */
        public Object mo3123c() {
            return this.f1804f.f1791a.mo3692a();
        }
    }

    /* renamed from: f.a.a.a.a.c$g */
    public static final class C0421g extends C4639i implements C4607a<C5264d<C4560l>> {

        /* renamed from: f */
        public final /* synthetic */ C0414c f1805f;

        /* renamed from: g */
        public final /* synthetic */ String f1806g;

        /* renamed from: h */
        public final /* synthetic */ RequestPostAnswers f1807h;

        public C0421g(C0414c cVar, String str, RequestPostAnswers requestPostAnswers) {
            this.f1805f = cVar;
            this.f1806g = str;
            this.f1807h = requestPostAnswers;
            super(0);
        }

        /* renamed from: c */
        public Object mo3123c() {
            return this.f1805f.f1791a.mo3695a(this.f1806g, this.f1807h);
        }
    }

    /* renamed from: f.a.a.a.a.c$h */
    public static final class C0422h extends C4639i implements C4607a<C5264d<C4560l>> {

        /* renamed from: f */
        public final /* synthetic */ C0414c f1808f;

        /* renamed from: g */
        public final /* synthetic */ RequestKpiReport f1809g;

        public C0422h(C0414c cVar, RequestKpiReport requestKpiReport) {
            this.f1808f = cVar;
            this.f1809g = requestKpiReport;
            super(0);
        }

        /* renamed from: c */
        public Object mo3123c() {
            return this.f1808f.f1791a.mo3693a(this.f1809g);
        }
    }

    /* renamed from: f.a.a.a.a.c$i */
    public static final class C0423i extends C4639i implements C4607a<C5264d<ResponseToken>> {

        /* renamed from: f */
        public final /* synthetic */ C0414c f1810f;

        /* renamed from: g */
        public final /* synthetic */ RequestVerifyCode f1811g;

        public C0423i(C0414c cVar, RequestVerifyCode requestVerifyCode) {
            this.f1810f = cVar;
            this.f1811g = requestVerifyCode;
            super(0);
        }

        /* renamed from: c */
        public Object mo3123c() {
            return this.f1810f.f1791a.mo3694a(this.f1811g);
        }
    }

    public C0414c(C0436a aVar) {
        if (aVar != null) {
            this.f1791a = aVar;
        } else {
            C4638h.m10271a("apiInterface");
            throw null;
        }
    }

    /* renamed from: a */
    public C5244a<Throwable, ResponseUuid> mo3663a() {
        return mo3885a(new C0420f(this));
    }

    /* renamed from: a */
    public C5244a<Throwable, ResponseLabels> mo3668a(String str, String str2, String str3) {
        if (str == null) {
            C4638h.m10271a("uuid");
            throw null;
        } else if (str2 == null) {
            C4638h.m10271a("language");
            throw null;
        } else if (str3 != null) {
            return mo3885a(new C0415a(this, str, str2, str3));
        } else {
            C4638h.m10271a("region");
            throw null;
        }
    }

    /* renamed from: b */
    public C5244a<Throwable, ResponseQuestions> mo3669b() {
        return mo3885a(new C0417c(this));
    }

    /* renamed from: b */
    public C5244a<Throwable, ResponseRegions> mo3670b(String str, String str2) {
        if (str == null) {
            C4638h.m10271a("uuid");
            throw null;
        } else if (str2 != null) {
            return mo3885a(new C0418d(this, str, str2));
        } else {
            C4638h.m10271a("language");
            throw null;
        }
    }

    /* renamed from: c */
    public C5244a<Throwable, ResponseSettings> mo3671c() {
        return mo3885a(new C0419e(this));
    }

    /* renamed from: a */
    public C5244a<Throwable, ResponseLanguages> mo3667a(String str, String str2) {
        if (str == null) {
            C4638h.m10271a("uuid");
            throw null;
        } else if (str2 != null) {
            return mo3885a(new C0416b(this, str, str2));
        } else {
            C4638h.m10271a("language");
            throw null;
        }
    }

    /* renamed from: a */
    public C5244a<Throwable, C4560l> mo3666a(String str, RequestPostAnswers requestPostAnswers) {
        if (str == null) {
            C4638h.m10271a("uuid");
            throw null;
        } else if (requestPostAnswers != null) {
            return mo3885a(new C0421g(this, str, requestPostAnswers));
        } else {
            C4638h.m10271a("requestPostAnswers");
            throw null;
        }
    }

    /* renamed from: a */
    public C5244a<Throwable, C4560l> mo3664a(RequestKpiReport requestKpiReport) {
        if (requestKpiReport != null) {
            return mo3885a(new C0422h(this, requestKpiReport));
        }
        C4638h.m10271a("requestKpiReport");
        throw null;
    }

    /* renamed from: a */
    public C5244a<Throwable, ResponseToken> mo3665a(RequestVerifyCode requestVerifyCode) {
        if (requestVerifyCode != null) {
            return mo3885a(new C0423i(this, requestVerifyCode));
        }
        C4638h.m10271a("body");
        throw null;
    }
}
