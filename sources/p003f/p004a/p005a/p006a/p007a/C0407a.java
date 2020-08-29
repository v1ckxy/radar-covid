package p003f.p004a.p005a.p006a.p007a;

import android.app.Activity;
import android.content.Context;
import java.util.Date;
import java.util.Objects;
import org.dpppt.android.sdk.internal.SyncWorker.C1014a;
import org.dpppt.android.sdk.models.ExposeeAuthMethodAuthorization;
import p002es.gob.radarcovid.models.domain.Settings;
import p003f.p004a.p005a.C0698c;
import p003f.p004a.p005a.p006a.p009c.C0437a;
import p119o.p120a.C0967p0;
import p124p.p126b.p127k.C1036e;
import p124p.p150h.p161k.C1381a;
import p213q.p214a.p215a.p216a.C1965a;
import p369s.p370a.p371a.p374b.C4434a;
import p369s.p370a.p371a.p374b.C4435b;
import p369s.p370a.p371a.p374b.C4437d;
import p369s.p370a.p371a.p378f.p383e.p384a.C4483b;
import p369s.p370a.p371a.p378f.p383e.p384a.C4483b.C4484a;
import p392u.C4560l;
import p392u.p401r.p402b.C4607a;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;
import p425x.p472b.p473a.p474a.C5178e;
import p425x.p472b.p473a.p474a.C5178e.C5180b;
import p425x.p472b.p473a.p474a.C5182f;
import p425x.p472b.p473a.p474a.p475k.C5188a;
import p425x.p472b.p473a.p474a.p476l.C5195d;
import p425x.p472b.p473a.p474a.p476l.p480n.C5242m;

/* renamed from: f.a.a.a.a.a */
public final class C0407a implements C0425e {

    /* renamed from: a */
    public final C0427g f1780a;

    /* renamed from: b */
    public final C0437a f1781b;

    /* renamed from: c */
    public final C1036e f1782c;

    /* renamed from: f.a.a.a.a.a$a */
    /* compiled from: java-style lambda group */
    public static final class C0408a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ int f1783e;

        /* renamed from: f */
        public final /* synthetic */ Object f1784f;

        public C0408a(int i, Object obj) {
            this.f1783e = i;
            this.f1784f = obj;
        }

        public final void run() {
            int i = this.f1783e;
            if (i == 0) {
                ((C4607a) this.f1784f).mo3123c();
            } else if (i == 1) {
                ((C4607a) this.f1784f).mo3123c();
            } else {
                throw null;
            }
        }
    }

    /* renamed from: f.a.a.a.a.a$b */
    public static final class C0409b<T> implements C1381a<C5182f> {

        /* renamed from: a */
        public final /* synthetic */ C4618l f1785a;

        public C0409b(C4618l lVar) {
            this.f1785a = lVar;
        }

        /* renamed from: a */
        public void mo3659a(Object obj) {
            C5182f fVar = (C5182f) obj;
            this.f1785a.mo3153b(Boolean.valueOf(fVar != null && fVar.ordinal() == 0));
        }
    }

    /* renamed from: f.a.a.a.a.a$c */
    public static final class C0410c implements C4437d {

        /* renamed from: a */
        public final /* synthetic */ C0407a f1786a;

        /* renamed from: b */
        public final /* synthetic */ Date f1787b;

        /* renamed from: c */
        public final /* synthetic */ String f1788c;

        /* renamed from: f.a.a.a.a.a$c$a */
        public static final class C0411a implements C5188a<Void> {

            /* renamed from: a */
            public final /* synthetic */ C4435b f1789a;

            public C0411a(C4435b bVar) {
                this.f1789a = bVar;
            }

            /* renamed from: a */
            public void mo3661a(Object obj) {
                Void voidR = (Void) obj;
                ((C4484a) this.f1789a).mo10757a();
            }

            /* renamed from: a */
            public void mo3662a(Throwable th) {
                C4435b bVar = this.f1789a;
                if (th == null) {
                    th = new Exception("Error notifying infection");
                }
                ((C4484a) bVar).mo10758a(th);
            }
        }

        public C0410c(C0407a aVar, Date date, String str) {
            this.f1786a = aVar;
            this.f1787b = date;
            this.f1788c = str;
        }

        /* renamed from: a */
        public final void mo3660a(C4435b bVar) {
            Boolean bool = C0698c.f2147a;
            C4638h.m10270a((Object) bool, "BuildConfig.isMock");
            if (bool.booleanValue()) {
                ((C4484a) bVar).mo10757a();
                return;
            }
            C1036e eVar = this.f1786a.f1782c;
            Date date = this.f1787b;
            StringBuilder a = C1965a.m4756a("Bearer ");
            a.append(this.f1788c);
            ExposeeAuthMethodAuthorization exposeeAuthMethodAuthorization = new ExposeeAuthMethodAuthorization(a.toString());
            C0411a aVar = new C0411a(bVar);
            C5178e.m11615a();
            C5178e.f12369c = new C5180b(date, exposeeAuthMethodAuthorization, aVar, null);
            C5178e.m11616a((Activity) eVar);
        }
    }

    /* renamed from: f.a.a.a.a.a$d */
    public static final class C0412d<T> implements C1381a<Exception> {

        /* renamed from: a */
        public final /* synthetic */ C4618l f1790a;

        public C0412d(C4618l lVar) {
            this.f1790a = lVar;
        }

        /* renamed from: a */
        public void mo3659a(Object obj) {
            Exception exc = (Exception) obj;
            C4618l lVar = this.f1790a;
            C4638h.m10270a((Object) exc, "exception");
            lVar.mo3153b(exc);
        }
    }

    public C0407a(C0427g gVar, C0437a aVar, C1036e eVar) {
        if (gVar == null) {
            C4638h.m10271a("preferencesRepository");
            throw null;
        } else if (aVar == null) {
            C4638h.m10271a("exposureInfoDataMapper");
            throw null;
        } else if (eVar != null) {
            this.f1780a = gVar;
            this.f1781b = aVar;
            this.f1782c = eVar;
        } else {
            C4638h.m10271a("activity");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3651a() {
        C5178e.m11624c(this.f1782c);
    }

    /* renamed from: a */
    public void mo3654a(C4618l<? super Boolean, C4560l> lVar) {
        if (lVar != null) {
            Boolean bool = C0698c.f2147a;
            C4638h.m10270a((Object) bool, "BuildConfig.isMock");
            if (bool.booleanValue()) {
                lVar.mo3153b(Boolean.valueOf(true));
            } else {
                C0967p0.m2200a((Context) this.f1782c, (C1381a<C5182f>) new C0409b<C5182f>(lVar));
            }
        } else {
            C4638h.m10271a("callback");
            throw null;
        }
    }

    /* renamed from: b */
    public boolean mo3655b() {
        return C5178e.m11623b(this.f1782c);
    }

    /* renamed from: c */
    public void mo3656c() {
        C1036e eVar = this.f1782c;
        C5178e.m11615a();
        try {
            new C1014a(eVar).mo4370a();
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r3v10, types: [java.lang.Comparable] */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Comparable] */
    /* JADX WARNING: type inference failed for: r3v14, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ad, code lost:
        if (r3 != null) goto L_0x00b5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p002es.gob.radarcovid.models.domain.ExposureInfo mo3657d() {
        /*
            r12 = this;
            f.a.a.a.c.a r0 = r12.f1781b
            p.b.k.e r1 = r12.f1782c
            x.b.a.a.j r1 = p425x.p472b.p473a.p474a.C5178e.m11614a(r1)
            java.lang.String r2 = "DP3T.getStatus(activity)"
            p392u.p401r.p403c.C4638h.m10270a(r1, r2)
            p.b.k.e r2 = r12.f1782c
            x.b.a.a.l.g r2 = p425x.p472b.p473a.p474a.p476l.C5199g.m11639a(r2)
            java.lang.String r3 = "ExposureDayStorage.getInstance(activity)"
            p392u.p401r.p403c.C4638h.m10270a(r2, r3)
            java.util.ArrayList r2 = r2.mo11942a()
            f.a.a.a.a.g r3 = r12.f1780a
            java.util.Date r3 = r3.mo3679b()
            r4 = 0
            if (r0 == 0) goto L_0x00c7
            es.gob.radarcovid.models.domain.ExposureInfo r0 = new es.gob.radarcovid.models.domain.ExposureInfo
            x.b.a.a.g r5 = r1.f12389c
            java.lang.String r6 = "tracingStatus.infectionStatus"
            p392u.p401r.p403c.C4638h.m10270a(r5, r6)
            int r5 = r5.ordinal()
            r6 = 1
            if (r5 == 0) goto L_0x0046
            if (r5 == r6) goto L_0x0043
            r7 = 2
            if (r5 != r7) goto L_0x003d
            es.gob.radarcovid.models.domain.ExposureInfo$Level r5 = p002es.gob.radarcovid.models.domain.ExposureInfo.Level.INFECTED
            goto L_0x0048
        L_0x003d:
            u.e r0 = new u.e
            r0.<init>()
            throw r0
        L_0x0043:
            es.gob.radarcovid.models.domain.ExposureInfo$Level r5 = p002es.gob.radarcovid.models.domain.ExposureInfo.Level.HIGH
            goto L_0x0048
        L_0x0046:
            es.gob.radarcovid.models.domain.ExposureInfo$Level r5 = p002es.gob.radarcovid.models.domain.ExposureInfo.Level.LOW
        L_0x0048:
            java.util.Date r7 = new java.util.Date
            long r8 = r1.f12388b
            r7.<init>(r8)
            if (r3 == 0) goto L_0x0052
            goto L_0x00b5
        L_0x0052:
            if (r2 == 0) goto L_0x00b0
            java.util.ArrayList r3 = new java.util.ArrayList
            r8 = 10
            int r8 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5158a(r2, r8)
            r3.<init>(r8)
            java.util.Iterator r2 = r2.iterator()
        L_0x0063:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0085
            java.lang.Object r8 = r2.next()
            org.dpppt.android.sdk.models.ExposureDay r8 = (org.dpppt.android.sdk.models.ExposureDay) r8
            java.util.Date r9 = new java.util.Date
            org.dpppt.android.sdk.models.DayDate r8 = r8.getExposedDate()
            java.lang.String r10 = "it.exposedDate"
            p392u.p401r.p403c.C4638h.m10270a(r8, r10)
            long r10 = r8.getStartOfDayTimestamp()
            r9.<init>(r10)
            r3.add(r9)
            goto L_0x0063
        L_0x0085:
            java.util.Iterator r2 = r3.iterator()
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L_0x0090
            goto L_0x00aa
        L_0x0090:
            java.lang.Object r3 = r2.next()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
        L_0x0096:
            r4 = r3
        L_0x0097:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00aa
            java.lang.Object r3 = r2.next()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r8 = r4.compareTo(r3)
            if (r8 >= 0) goto L_0x0097
            goto L_0x0096
        L_0x00aa:
            r3 = r4
            java.util.Date r3 = (java.util.Date) r3
            if (r3 == 0) goto L_0x00b0
            goto L_0x00b5
        L_0x00b0:
            java.util.Date r3 = new java.util.Date
            r3.<init>()
        L_0x00b5:
            java.util.Collection<x.b.a.a.j$a> r1 = r1.f12390d
            if (r1 == 0) goto L_0x00c2
            x.b.a.a.j$a r2 = p425x.p472b.p473a.p474a.C5186j.C5187a.GAEN_UNEXPECTEDLY_DISABLED
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            r6 = 0
        L_0x00c3:
            r0.<init>(r5, r7, r3, r6)
            return r0
        L_0x00c7:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p003f.p004a.p005a.p006a.p007a.C0407a.mo3657d():es.gob.radarcovid.models.domain.ExposureInfo");
    }

    /* renamed from: a */
    public C4434a mo3650a(String str, Date date) {
        if (str == null) {
            C4638h.m10271a("authCode");
            throw null;
        } else if (date != null) {
            C0410c cVar = new C0410c(this, date, str);
            Objects.requireNonNull(cVar, "source is null");
            C4483b bVar = new C4483b(cVar);
            C4638h.m10270a((Object) bVar, "Completable.create {\n   …)\n            }\n        }");
            return bVar;
        } else {
            C4638h.m10271a("onSet");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3653a(C4607a<C4560l> aVar, C4618l<? super Exception, C4560l> lVar, C4607a<C4560l> aVar2) {
        if (aVar == null) {
            C4638h.m10271a("onSuccess");
            throw null;
        } else if (lVar == null) {
            C4638h.m10271a("onError");
            throw null;
        } else if (aVar2 != null) {
            Boolean bool = C0698c.f2147a;
            C4638h.m10270a((Object) bool, "BuildConfig.isMock");
            if (bool.booleanValue()) {
                aVar.mo3123c();
            } else {
                C5178e.m11618a(this.f1782c, new C0408a(0, aVar), new C0412d(lVar), new C0408a(1, aVar2));
            }
        } else {
            C4638h.m10271a("onCancelled");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3652a(Settings settings) {
        if (settings != null) {
            C5242m.m11680a((Context) this.f1782c).mo11964a(settings.getAttenuationThresholdLow(), settings.getAttenuationThresholdMedium());
            C1036e eVar = this.f1782c;
            int attenuationThresholdLow = settings.getAttenuationThresholdLow();
            int attenuationThresholdMedium = settings.getAttenuationThresholdMedium();
            float attenuationFactorLow = settings.getAttenuationFactorLow();
            float attenuationFactorMedium = settings.getAttenuationFactorMedium();
            int minDurationForExposure = settings.getMinDurationForExposure();
            C5178e.m11615a();
            C5195d b = C5195d.m11631b((Context) eVar);
            String str = "attenuationThresholdLow";
            b.f12413a.edit().putInt(str, attenuationThresholdLow).apply();
            String str2 = "attenuationThresholdMedium";
            b.f12414b.mo11964a(attenuationThresholdLow, b.f12413a.getInt(str2, 60));
            b.f12413a.edit().putInt(str2, attenuationThresholdMedium).apply();
            b.f12414b.mo11964a(b.f12413a.getInt(str, 50), attenuationThresholdMedium);
            b.f12413a.edit().putFloat("attenuationFactorLow", attenuationFactorLow).apply();
            b.f12413a.edit().putFloat("attenuationFactorMedium", attenuationFactorMedium).apply();
            b.f12413a.edit().putInt("minDurationForExposure", minDurationForExposure).apply();
            return;
        }
        C4638h.m10271a("settings");
        throw null;
    }
}
