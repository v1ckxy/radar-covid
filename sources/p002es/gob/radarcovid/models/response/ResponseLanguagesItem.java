package p002es.gob.radarcovid.models.response;

import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: es.gob.radarcovid.models.response.ResponseLanguagesItem */
public final class ResponseLanguagesItem {
    public final String description;

    /* renamed from: id */
    public final String f1776id;

    public ResponseLanguagesItem(String str, String str2) {
        this.f1776id = str;
        this.description = str2;
    }

    public static /* synthetic */ ResponseLanguagesItem copy$default(ResponseLanguagesItem responseLanguagesItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responseLanguagesItem.f1776id;
        }
        if ((i & 2) != 0) {
            str2 = responseLanguagesItem.description;
        }
        return responseLanguagesItem.copy(str, str2);
    }

    public final String component1() {
        return this.f1776id;
    }

    public final String component2() {
        return this.description;
    }

    public final ResponseLanguagesItem copy(String str, String str2) {
        return new ResponseLanguagesItem(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.description, (java.lang.Object) r3.description) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.response.ResponseLanguagesItem
            if (r0 == 0) goto L_0x001d
            es.gob.radarcovid.models.response.ResponseLanguagesItem r3 = (p002es.gob.radarcovid.models.response.ResponseLanguagesItem) r3
            java.lang.String r0 = r2.f1776id
            java.lang.String r1 = r3.f1776id
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.description
            java.lang.String r3 = r3.description
            boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.response.ResponseLanguagesItem.equals(java.lang.Object):boolean");
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.f1776id;
    }

    public int hashCode() {
        String str = this.f1776id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.description;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("ResponseLanguagesItem(id=");
        a.append(this.f1776id);
        a.append(", description=");
        return C1965a.m4754a(a, this.description, ")");
    }
}
