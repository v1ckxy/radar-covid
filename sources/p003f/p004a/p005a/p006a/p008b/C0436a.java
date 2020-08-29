package p003f.p004a.p005a.p006a.p008b;

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
import p484y.C5264d;
import p484y.p488j0.C5305a;
import p484y.p488j0.C5309e;
import p484y.p488j0.C5312h;
import p484y.p488j0.C5316l;
import p484y.p488j0.C5321q;

/* renamed from: f.a.a.a.b.a */
public interface C0436a {
    @C5309e("/configuration/token/uuid")
    /* renamed from: a */
    C5264d<ResponseUuid> mo3692a();

    @C5316l("/kpi/kpi")
    /* renamed from: a */
    C5264d<C4560l> mo3693a(@C5305a RequestKpiReport requestKpiReport);

    @C5316l("/verification/verify/code")
    /* renamed from: a */
    C5264d<ResponseToken> mo3694a(@C5305a RequestVerifyCode requestVerifyCode);

    @C5316l("/questionnaire/answers")
    /* renamed from: a */
    C5264d<C4560l> mo3695a(@C5312h("SEDIA-UserToken") String str, @C5305a RequestPostAnswers requestPostAnswers);

    @C5309e("/configuration/masterData/locales")
    /* renamed from: a */
    C5264d<ResponseLanguages> mo3696a(@C5312h("SEDIA-UserToken") String str, @C5321q("locale") String str2);

    @C5309e("/configuration/texts")
    /* renamed from: a */
    C5264d<ResponseLabels> mo3697a(@C5312h("SEDIA-UserToken") String str, @C5321q("locale") String str2, @C5321q("ccaa") String str3);

    @C5309e("/configuration/masterData/ccaa")
    /* renamed from: a */
    C5264d<ResponseRegions> mo3698a(@C5312h("SEDIA-UserToken") String str, @C5321q("locale") String str2, @C5321q("additionalInfo") boolean z);

    @C5309e("/questionnaire/questions")
    /* renamed from: b */
    C5264d<ResponseQuestions> mo3699b();

    @C5309e("/configuration/settings")
    /* renamed from: c */
    C5264d<ResponseSettings> mo3700c();
}
