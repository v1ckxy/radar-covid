package p003f.p004a.p005a.p006a.p010d;

import java.security.Key;
import java.text.SimpleDateFormat;
import java.util.Date;
import p002es.gob.radarcovid.models.response.ResponseToken;
import p003f.p004a.p005a.p006a.p007a.C0425e;
import p116io.jsonwebtoken.Claims;
import p116io.jsonwebtoken.Jws;
import p116io.jsonwebtoken.Jwts;
import p119o.p120a.C0967p0;
import p369s.p370a.p371a.p374b.C4438e;
import p369s.p370a.p371a.p377e.C4461d;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.a.d.s */
public final class C0492s<T, R> implements C4461d<ResponseToken, C4438e> {

    /* renamed from: a */
    public final /* synthetic */ C0494u f1884a;

    public C0492s(C0494u uVar) {
        this.f1884a = uVar;
    }

    /* renamed from: a */
    public Object mo3712a(Object obj) {
        ResponseToken responseToken = (ResponseToken) obj;
        C0494u uVar = this.f1884a;
        String token = responseToken.getToken();
        String str = null;
        if (uVar != null) {
            Jws parseClaimsJws = Jwts.parserBuilder().setSigningKey((Key) C0967p0.m2250d("LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUlHYk1CQUdCeXFHU000OUFnRUdCU3VCQkFBakE0R0dBQVFBWjM1ZzlhN1M2MjdXMVlpOEVsVmdNS012dkdUUAo5R0hiUHZHTzhLekNLQk84WTZOc0JSTHlJeWUwZmdxR0ZXM2Z5dHVxcnFSNi9wSllDUWFXN1IyUnY3OEF4OXJhCmlYbmRVSmVyVk9KSHJRaFgxbnMrTjZxaVUxT0I4a3dUaWVuaCtuZDVVbXZUN24vK3hod3djK1RYa1lnNDBxOVcKUTRiVjBMbHRWbGRUSUlTK1QxOD0KLS0tLS1FTkQgUFVCTElDIEtFWS0tLS0tCg==")).build().parseClaimsJws(token);
            C4638h.m10270a((Object) parseClaimsJws, "Jwts.parserBuilder()\n   …parseClaimsJws(signedJWT)");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String str2 = "onset";
            Object obj2 = ((Claims) parseClaimsJws.getBody()).get(str2);
            if (obj2 instanceof String) {
                str = obj2;
            }
            Date parse = simpleDateFormat.parse(str);
            C0425e eVar = this.f1884a.f1886a;
            String token2 = responseToken.getToken();
            C4638h.m10270a((Object) parse, str2);
            return eVar.mo3650a(token2, parse);
        }
        throw null;
    }
}
