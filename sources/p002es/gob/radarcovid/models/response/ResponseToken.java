package p002es.gob.radarcovid.models.response;

import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.models.response.ResponseToken */
public final class ResponseToken {
    public final String token;

    public ResponseToken(String str) {
        if (str != null) {
            this.token = str;
        } else {
            C4638h.m10271a("token");
            throw null;
        }
    }

    public static /* synthetic */ ResponseToken copy$default(ResponseToken responseToken, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responseToken.token;
        }
        return responseToken.copy(str);
    }

    public final String component1() {
        return this.token;
    }

    public final ResponseToken copy(String str) {
        if (str != null) {
            return new ResponseToken(str);
        }
        C4638h.m10271a("token");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r1.token, (java.lang.Object) ((p002es.gob.radarcovid.models.response.ResponseToken) r2).token) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof p002es.gob.radarcovid.models.response.ResponseToken
            if (r0 == 0) goto L_0x0013
            es.gob.radarcovid.models.response.ResponseToken r2 = (p002es.gob.radarcovid.models.response.ResponseToken) r2
            java.lang.String r0 = r1.token
            java.lang.String r2 = r2.token
            boolean r2 = p392u.p401r.p403c.C4638h.m10272a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.response.ResponseToken.equals(java.lang.Object):boolean");
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        String str = this.token;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return C1965a.m4754a(C1965a.m4756a("ResponseToken(token="), this.token, ")");
    }
}
