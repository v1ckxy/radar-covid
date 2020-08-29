package p002es.gob.radarcovid.models.response;

import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: es.gob.radarcovid.models.response.ResponseRegionsItem */
public final class ResponseRegionsItem {
    public final String description;
    public final String email;

    /* renamed from: id */
    public final String f1779id;
    public final String phone;
    public final String web;
    public final String webName;

    public ResponseRegionsItem(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f1779id = str;
        this.description = str2;
        this.phone = str3;
        this.email = str4;
        this.web = str5;
        this.webName = str6;
    }

    public static /* synthetic */ ResponseRegionsItem copy$default(ResponseRegionsItem responseRegionsItem, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responseRegionsItem.f1779id;
        }
        if ((i & 2) != 0) {
            str2 = responseRegionsItem.description;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = responseRegionsItem.phone;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = responseRegionsItem.email;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = responseRegionsItem.web;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = responseRegionsItem.webName;
        }
        return responseRegionsItem.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.f1779id;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.phone;
    }

    public final String component4() {
        return this.email;
    }

    public final String component5() {
        return this.web;
    }

    public final String component6() {
        return this.webName;
    }

    public final ResponseRegionsItem copy(String str, String str2, String str3, String str4, String str5, String str6) {
        ResponseRegionsItem responseRegionsItem = new ResponseRegionsItem(str, str2, str3, str4, str5, str6);
        return responseRegionsItem;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.webName, (java.lang.Object) r3.webName) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0047
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.response.ResponseRegionsItem
            if (r0 == 0) goto L_0x0045
            es.gob.radarcovid.models.response.ResponseRegionsItem r3 = (p002es.gob.radarcovid.models.response.ResponseRegionsItem) r3
            java.lang.String r0 = r2.f1779id
            java.lang.String r1 = r3.f1779id
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.description
            java.lang.String r1 = r3.description
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.phone
            java.lang.String r1 = r3.phone
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.email
            java.lang.String r1 = r3.email
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.web
            java.lang.String r1 = r3.web
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.webName
            java.lang.String r3 = r3.webName
            boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r0, r3)
            if (r3 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r3 = 0
            return r3
        L_0x0047:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.response.ResponseRegionsItem.equals(java.lang.Object):boolean");
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getId() {
        return this.f1779id;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getWeb() {
        return this.web;
    }

    public final String getWebName() {
        return this.webName;
    }

    public int hashCode() {
        String str = this.f1779id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.phone;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.email;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.web;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.webName;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("ResponseRegionsItem(id=");
        a.append(this.f1779id);
        a.append(", description=");
        a.append(this.description);
        a.append(", phone=");
        a.append(this.phone);
        a.append(", email=");
        a.append(this.email);
        a.append(", web=");
        a.append(this.web);
        a.append(", webName=");
        return C1965a.m4754a(a, this.webName, ")");
    }
}
