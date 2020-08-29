package p003f.p004a.p005a.p108g.p111b.p113b;

import java.net.URI;
import java.util.ArrayList;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p365r.p368b.C4427b;
import p392u.p393n.C4568g;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;
import p410v.C4713h;
import p410v.C4713h.C4714a;
import p410v.C4713h.C4715b;
import p410v.C4873x;
import p410v.C4873x.C4876b;
import p423w.C4897j;
import p423w.C4897j.C4898a;

/* renamed from: f.a.a.g.b.b.q */
public final class C0820q implements C4427b<C4713h> {

    /* renamed from: a */
    public final C0818o f2381a;

    public C0820q(C0818o oVar) {
        this.f2381a = oVar;
    }

    public Object get() {
        StringBuilder sb;
        C4876b bVar;
        C4715b bVar2;
        if (this.f2381a != null) {
            ArrayList arrayList = new ArrayList();
            String host = new URI("https://radarcovid.covid19.gob.es/").getHost();
            C4638h.m10270a((Object) host, "URI(BuildConfig.API_URL).host");
            String[] strArr = {"sha256/V5NaZx/jvh7NR/Ne6tXTw/g2Pcu9ztv08prWsUh7czI="};
            int i = 0;
            while (i < 1) {
                String str = strArr[i];
                C4714a aVar = C4713h.f11044d;
                if (str != null) {
                    String str2 = "http://";
                    String str3 = "(this as java.lang.String).substring(startIndex)";
                    if (C4681g.m10327b(host, "*.", false, 2)) {
                        bVar = C4873x.f11615l;
                        sb = C1965a.m4756a(str2);
                        String substring = host.substring(2);
                        C4638h.m10270a((Object) substring, str3);
                        sb.append(substring);
                    } else {
                        bVar = C4873x.f11615l;
                        sb = C1965a.m4763b(str2, host);
                    }
                    String str4 = bVar.mo11409b(sb.toString()).f11620e;
                    String str5 = "sha1/";
                    if (C4681g.m10327b(str, str5, false, 2)) {
                        C4898a aVar2 = C4897j.f11665i;
                        String substring2 = str.substring(5);
                        C4638h.m10270a((Object) substring2, str3);
                        C4897j a = aVar2.mo11509a(substring2);
                        if (a != null) {
                            bVar2 = new C4715b(host, str4, str5, a);
                        } else {
                            C4638h.m10269a();
                            throw null;
                        }
                    } else {
                        String str6 = "sha256/";
                        if (C4681g.m10327b(str, str6, false, 2)) {
                            C4898a aVar3 = C4897j.f11665i;
                            String substring3 = str.substring(7);
                            C4638h.m10270a((Object) substring3, str3);
                            C4897j a2 = aVar3.mo11509a(substring3);
                            if (a2 != null) {
                                bVar2 = new C4715b(host, str4, str6, a2);
                            } else {
                                C4638h.m10269a();
                                throw null;
                            }
                        } else {
                            throw new IllegalArgumentException(C1965a.m4751a("pins must start with 'sha256/' or 'sha1/': ", str));
                        }
                    }
                    arrayList.add(bVar2);
                    i++;
                } else {
                    C4638h.m10271a("pin");
                    throw null;
                }
            }
            C4713h hVar = new C4713h(C4568g.m10221c(arrayList), null);
            C2286e.m5279b(hVar, "Cannot return null from a non-@Nullable @Provides method");
            return hVar;
        }
        throw null;
    }
}
