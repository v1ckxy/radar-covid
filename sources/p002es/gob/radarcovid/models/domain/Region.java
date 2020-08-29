package p002es.gob.radarcovid.models.domain;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.models.domain.Region */
public final class Region {
    public final String code;
    public final String name;
    public final String phone;
    public final String url;
    public final String webName;

    public Region() {
        this(null, null, null, null, null, 31, null);
    }

    public Region(String str, String str2, String str3, String str4, String str5) {
        if (str == null) {
            C4638h.m10271a("code");
            throw null;
        } else if (str2 == null) {
            C4638h.m10271a("name");
            throw null;
        } else if (str3 == null) {
            C4638h.m10271a("phone");
            throw null;
        } else if (str4 == null) {
            C4638h.m10271a("url");
            throw null;
        } else if (str5 != null) {
            this.code = str;
            this.name = str2;
            this.phone = str3;
            this.url = str4;
            this.webName = str5;
        } else {
            C4638h.m10271a("webName");
            throw null;
        }
    }

    public /* synthetic */ Region(String str, String str2, String str3, String str4, String str5, int i, C4636f fVar) {
        int i2 = i & 1;
        String str6 = Objects.EMPTY_STRING;
        String str7 = i2 != 0 ? str6 : str;
        this(str7, (i & 2) != 0 ? str6 : str2, (i & 4) != 0 ? str6 : str3, (i & 8) != 0 ? str6 : str4, (i & 16) != 0 ? str6 : str5);
    }

    public static /* synthetic */ Region copy$default(Region region, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = region.code;
        }
        if ((i & 2) != 0) {
            str2 = region.name;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = region.phone;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = region.url;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = region.webName;
        }
        return region.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.phone;
    }

    public final String component4() {
        return this.url;
    }

    public final String component5() {
        return this.webName;
    }

    public final Region copy(String str, String str2, String str3, String str4, String str5) {
        if (str == null) {
            C4638h.m10271a("code");
            throw null;
        } else if (str2 == null) {
            C4638h.m10271a("name");
            throw null;
        } else if (str3 == null) {
            C4638h.m10271a("phone");
            throw null;
        } else if (str4 == null) {
            C4638h.m10271a("url");
            throw null;
        } else if (str5 != null) {
            Region region = new Region(str, str2, str3, str4, str5);
            return region;
        } else {
            C4638h.m10271a("webName");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.webName, (java.lang.Object) r3.webName) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.domain.Region
            if (r0 == 0) goto L_0x003b
            es.gob.radarcovid.models.domain.Region r3 = (p002es.gob.radarcovid.models.domain.Region) r3
            java.lang.String r0 = r2.code
            java.lang.String r1 = r3.code
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.name
            java.lang.String r1 = r3.name
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.phone
            java.lang.String r1 = r3.phone
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.url
            java.lang.String r1 = r3.url
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.webName
            java.lang.String r3 = r3.webName
            boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.domain.Region.equals(java.lang.Object):boolean");
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getWebName() {
        return this.webName;
    }

    public int hashCode() {
        String str = this.code;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.phone;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.url;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.webName;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("Region(code=");
        a.append(this.code);
        a.append(", name=");
        a.append(this.name);
        a.append(", phone=");
        a.append(this.phone);
        a.append(", url=");
        a.append(this.url);
        a.append(", webName=");
        return C1965a.m4754a(a, this.webName, ")");
    }
}
