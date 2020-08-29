package p003f.p004a.p005a.p012b.p103l.p105b;

import android.os.Handler;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p002es.gob.radarcovid.models.domain.InitializationData;
import p002es.gob.radarcovid.models.domain.Settings;
import p002es.gob.radarcovid.models.exception.NetworkUnavailableException;
import p003f.p004a.p005a.p006a.p010d.C0452a0;
import p003f.p004a.p005a.p006a.p010d.C0463g;
import p003f.p004a.p005a.p006a.p010d.C0464g0;
import p003f.p004a.p005a.p006a.p010d.C0468h0;
import p003f.p004a.p005a.p006a.p010d.C0472i0;
import p003f.p004a.p005a.p006a.p010d.C0476j0;
import p003f.p004a.p005a.p006a.p010d.C0484l0;
import p003f.p004a.p005a.p006a.p010d.C0485m;
import p003f.p004a.p005a.p012b.p103l.p106c.C0693a;
import p003f.p004a.p005a.p012b.p103l.p106c.C0694b;
import p003f.p004a.p005a.p012b.p103l.p106c.C0695c;
import p369s.p370a.p371a.p372a.p373a.C4429a;
import p369s.p370a.p371a.p374b.C4439f;
import p369s.p370a.p371a.p374b.C4440g;
import p369s.p370a.p371a.p374b.C4442i;
import p369s.p370a.p371a.p374b.C4443j;
import p369s.p370a.p371a.p374b.C4445l;
import p369s.p370a.p371a.p377e.C4459b;
import p369s.p370a.p371a.p377e.C4461d;
import p369s.p370a.p371a.p378f.p380b.C4467a;
import p369s.p370a.p371a.p378f.p380b.C4472b;
import p369s.p370a.p371a.p378f.p383e.p385b.C4499f;
import p369s.p370a.p371a.p378f.p383e.p385b.C4503i;
import p369s.p370a.p371a.p378f.p383e.p385b.C4506j;
import p369s.p370a.p371a.p389g.C4538a;
import p392u.C4560l;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;

/* renamed from: f.a.a.b.l.b.b */
public final class C0687b implements C0693a {

    /* renamed from: a */
    public boolean f2129a;

    /* renamed from: b */
    public boolean f2130b;

    /* renamed from: c */
    public final C0695c f2131c;

    /* renamed from: d */
    public final C0694b f2132d;

    /* renamed from: e */
    public final C0463g f2133e;

    /* renamed from: f */
    public final C0485m f2134f;

    /* renamed from: g */
    public final C0484l0 f2135g;

    /* renamed from: f.a.a.b.l.b.b$a */
    public static final class C0688a extends C4639i implements C4618l<Boolean, C4560l> {

        /* renamed from: f */
        public final /* synthetic */ C0687b f2136f;

        public C0688a(C0687b bVar) {
            this.f2136f = bVar;
            super(1);
        }

        /* renamed from: b */
        public Object mo3153b(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                C0687b bVar = this.f2136f;
                if (!bVar.f2129a) {
                    bVar.f2129a = true;
                    new Handler().postDelayed(new C0686a(bVar), 2000);
                }
            } else {
                this.f2136f.f2131c.mo3206u();
            }
            return C4560l.f10773a;
        }
    }

    /* renamed from: f.a.a.b.l.b.b$b */
    public static final class C0689b<T, R> implements C4461d<T, C4443j<? extends R>> {

        /* renamed from: a */
        public final /* synthetic */ C0687b f2137a;

        public C0689b(C0687b bVar) {
            this.f2137a = bVar;
        }

        /* renamed from: a */
        public Object mo3712a(Object obj) {
            String str = (String) obj;
            C4638h.m10270a((Object) str, "it");
            if (str.length() > 0) {
                this.f2137a.f2135g.f1861b.mo3680b(str);
            }
            C0484l0 l0Var = this.f2137a.f2135g;
            if (l0Var != null) {
                C4440g a = C4440g.m10018a((C4442i<T>) new C0476j0<T>(l0Var));
                C4638h.m10270a((Object) a, "Observable.create { emit…             })\n        }");
                C4440g a2 = C4440g.m10018a((C4442i<T>) new C0464g0<T>(l0Var));
                C4638h.m10270a((Object) a2, "Observable.create { emit…}\n            )\n        }");
                C4440g a3 = C4440g.m10018a((C4442i<T>) new C0468h0<T>(l0Var));
                String str2 = "Observable.create { emit…        }\n        )\n    }";
                C4638h.m10270a((Object) a3, str2);
                C4440g a4 = C4440g.m10018a((C4442i<T>) new C0472i0<T>(l0Var));
                C4638h.m10270a((Object) a4, str2);
                C0452a0 a0Var = C0452a0.f1825a;
                Objects.requireNonNull(a, "source1 is null");
                Objects.requireNonNull(a2, "source2 is null");
                Objects.requireNonNull(a3, "source3 is null");
                Objects.requireNonNull(a4, "source4 is null");
                String str3 = "zipper is null";
                Objects.requireNonNull(a0Var, str3);
                C4461d a5 = C4467a.m10063a(a0Var);
                int i = C4439f.f10538a;
                C4443j[] jVarArr = {a, a2, a3, a4};
                Objects.requireNonNull(jVarArr, "sources is null");
                Objects.requireNonNull(a5, str3);
                String str4 = "bufferSize";
                C4472b.m10066a(i, str4);
                C4506j jVar = new C4506j(jVarArr, null, a5, i, false);
                C4445l lVar = C4538a.f10756a;
                String str5 = "scheduler is null";
                Objects.requireNonNull(lVar, str5);
                C4503i iVar = new C4503i(jVar, lVar);
                C4445l lVar2 = C4429a.f10529a;
                if (lVar2 != null) {
                    int i2 = C4439f.f10538a;
                    Objects.requireNonNull(lVar2, str5);
                    C4472b.m10066a(i2, str4);
                    C4499f fVar = new C4499f(iVar, lVar2, false, i2);
                    C4638h.m10270a((Object) fVar, "Observable.zip<Settings,…dSchedulers.mainThread())");
                    return fVar;
                }
                throw new NullPointerException("scheduler == null");
            }
            throw null;
        }
    }

    /* renamed from: f.a.a.b.l.b.b$c */
    public static final class C0690c<T> implements C4459b<InitializationData> {

        /* renamed from: e */
        public final /* synthetic */ C0687b f2138e;

        public C0690c(C0687b bVar) {
            this.f2138e = bVar;
        }

        /* renamed from: a */
        public void mo3749a(Object obj) {
            InitializationData initializationData = (InitializationData) obj;
            C0687b bVar = this.f2138e;
            C4638h.m10270a((Object) initializationData, "it");
            int b = bVar.f2135g.f1866g.mo3691b();
            Settings settings = initializationData.getSettings();
            if (!initializationData.getLabels().isEmpty()) {
                C0484l0 l0Var = bVar.f2135g;
                Map labels = initializationData.getLabels();
                if (labels != null) {
                    l0Var.f1861b.mo3677a(labels);
                    bVar.f2131c.mo3203H();
                } else {
                    C4638h.m10271a("labels");
                    throw null;
                }
            }
            if (!initializationData.getLanguages().isEmpty()) {
                C0484l0 l0Var2 = bVar.f2135g;
                List languages = initializationData.getLanguages();
                if (languages != null) {
                    l0Var2.f1861b.mo3681b(languages);
                } else {
                    C4638h.m10271a("languages");
                    throw null;
                }
            }
            if (!initializationData.getRegions().isEmpty()) {
                C0484l0 l0Var3 = bVar.f2135g;
                List regions = initializationData.getRegions();
                if (regions != null) {
                    l0Var3.f1861b.mo3676a(regions);
                } else {
                    C4638h.m10271a("regions");
                    throw null;
                }
            }
            if (b < settings.getAppInfo().getMinVersionCode()) {
                bVar.f2131c.mo3207z();
                return;
            }
            bVar.f2135g.f1862c.mo3652a(settings);
            bVar.f2130b = true;
            bVar.mo3861b();
        }
    }

    /* renamed from: f.a.a.b.l.b.b$d */
    public static final class C0691d<T> implements C4459b<Throwable> {

        /* renamed from: e */
        public final /* synthetic */ C0687b f2139e;

        public C0691d(C0687b bVar) {
            this.f2139e = bVar;
        }

        /* renamed from: a */
        public void mo3749a(Object obj) {
            Throwable th = (Throwable) obj;
            C0687b bVar = this.f2139e;
            C4638h.m10270a((Object) th, "it");
            if (bVar == null) {
                throw null;
            } else if (th instanceof NetworkUnavailableException) {
                bVar.f2130b = true;
                bVar.mo3861b();
            } else {
                bVar.f2131c.mo3944a(th, true);
            }
        }
    }

    public C0687b(C0695c cVar, C0694b bVar, C0463g gVar, C0485m mVar, C0484l0 l0Var) {
        if (cVar == null) {
            C4638h.m10271a("view");
            throw null;
        } else if (bVar == null) {
            C4638h.m10271a("router");
            throw null;
        } else if (gVar == null) {
            C4638h.m10271a("useCaseInternetInfo");
            throw null;
        } else if (mVar == null) {
            C4638h.m10271a("onboardingCompletedUseCase");
            throw null;
        } else if (l0Var != null) {
            this.f2131c = cVar;
            this.f2132d = bVar;
            this.f2133e = gVar;
            this.f2134f = mVar;
            this.f2135g = l0Var;
        } else {
            C4638h.m10271a("splashUseCase");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3860a() {
        mo3866g();
    }

    /* renamed from: b */
    public void mo3861b() {
        if (!this.f2130b) {
            return;
        }
        if (!this.f2133e.f1836a.mo3690a()) {
            this.f2131c.mo3205n();
            return;
        }
        if (this.f2135g.f1861b.mo3673a().length() > 0) {
            this.f2135g.f1862c.mo3654a((C4618l<? super Boolean, C4560l>) new C0688a<Object,C4560l>(this));
        }
    }

    /* renamed from: c */
    public void mo3862c() {
        mo3866g();
    }

    /* renamed from: d */
    public void mo3863d() {
        this.f2132d.mo3869c();
        this.f2131c.finish();
    }

    /* renamed from: e */
    public void mo3864e() {
        this.f2131c.finish();
    }

    /* renamed from: f */
    public void mo3865f() {
        this.f2132d.mo3867a();
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [s.a.a.f.e.b.h] */
    /* JADX WARNING: type inference failed for: r0v11, types: [s.a.a.b.g<java.lang.Object>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3866g() {
        /*
            r8 = this;
            f.a.a.a.d.l0 r0 = r8.f2135g
            if (r0 == 0) goto L_0x0071
            f.a.a.a.d.k0 r1 = new f.a.a.a.d.k0
            r1.<init>(r0)
            s.a.a.b.g r3 = p369s.p370a.p371a.p374b.C4440g.m10018a(r1)
            java.lang.String r0 = "Observable.create { emit…       })\n        }\n    }"
            p392u.p401r.p403c.C4638h.m10270a(r3, r0)
            f.a.a.b.l.b.b$b r4 = new f.a.a.b.l.b.b$b
            r4.<init>(r8)
            int r7 = p369s.p370a.p371a.p374b.C4439f.f10538a
            java.lang.String r0 = "mapper is null"
            java.util.Objects.requireNonNull(r4, r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r1 = "maxConcurrency"
            p369s.p370a.p371a.p378f.p380b.C4472b.m10066a(r0, r1)
            java.lang.String r0 = "bufferSize"
            p369s.p370a.p371a.p378f.p380b.C4472b.m10066a(r7, r0)
            boolean r0 = r3 instanceof p369s.p370a.p371a.p378f.p381c.C4474b
            if (r0 == 0) goto L_0x0041
            s.a.a.f.c.b r3 = (p369s.p370a.p371a.p378f.p381c.C4474b) r3
            java.lang.Object r0 = r3.get()
            if (r0 != 0) goto L_0x003a
            s.a.a.b.g<java.lang.Object> r0 = p369s.p370a.p371a.p378f.p383e.p385b.C4492c.f10585a
            goto L_0x004b
        L_0x003a:
            s.a.a.f.e.b.h r1 = new s.a.a.f.e.b.h
            r1.<init>(r0, r4)
            r0 = r1
            goto L_0x004b
        L_0x0041:
            s.a.a.f.e.b.d r0 = new s.a.a.f.e.b.d
            r6 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x004b:
            f.a.a.b.l.b.b$c r1 = new f.a.a.b.l.b.b$c
            r1.<init>(r8)
            f.a.a.b.l.b.b$d r2 = new f.a.a.b.l.b.b$d
            r2.<init>(r8)
            s.a.a.e.a r3 = p369s.p370a.p371a.p378f.p380b.C4467a.f10555b
            java.lang.String r4 = "onNext is null"
            java.util.Objects.requireNonNull(r1, r4)
            java.lang.String r4 = "onError is null"
            java.util.Objects.requireNonNull(r2, r4)
            java.lang.String r4 = "onComplete is null"
            java.util.Objects.requireNonNull(r3, r4)
            s.a.a.f.d.c r4 = new s.a.a.f.d.c
            s.a.a.e.b<java.lang.Object> r5 = p369s.p370a.p371a.p378f.p380b.C4467a.f10556c
            r4.<init>(r1, r2, r3, r5)
            r0.mo10720a(r4)
            return
        L_0x0071:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p003f.p004a.p005a.p012b.p103l.p105b.C0687b.mo3866g():void");
    }
}
