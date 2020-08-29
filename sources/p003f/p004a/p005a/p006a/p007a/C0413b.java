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
import p392u.C4560l;
import p425x.p482c.p483a.C5244a;

/* renamed from: f.a.a.a.a.b */
public interface C0413b {
    /* renamed from: a */
    C5244a<Throwable, ResponseUuid> mo3663a();

    /* renamed from: a */
    C5244a<Throwable, C4560l> mo3664a(RequestKpiReport requestKpiReport);

    /* renamed from: a */
    C5244a<Throwable, ResponseToken> mo3665a(RequestVerifyCode requestVerifyCode);

    /* renamed from: a */
    C5244a<Throwable, C4560l> mo3666a(String str, RequestPostAnswers requestPostAnswers);

    /* renamed from: a */
    C5244a<Throwable, ResponseLanguages> mo3667a(String str, String str2);

    /* renamed from: a */
    C5244a<Throwable, ResponseLabels> mo3668a(String str, String str2, String str3);

    /* renamed from: b */
    C5244a<Throwable, ResponseQuestions> mo3669b();

    /* renamed from: b */
    C5244a<Throwable, ResponseRegions> mo3670b(String str, String str2);

    /* renamed from: c */
    C5244a<Throwable, ResponseSettings> mo3671c();
}
