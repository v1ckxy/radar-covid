package p002es.gob.radarcovid.models.request;

import java.util.Date;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.models.request.RequestVerifyCode */
public final class RequestVerifyCode {
    public final String code;
    public final Date date;

    public RequestVerifyCode(Date date2, String str) {
        if (str != null) {
            this.date = date2;
            this.code = str;
            return;
        }
        C4638h.m10271a("code");
        throw null;
    }

    public static /* synthetic */ RequestVerifyCode copy$default(RequestVerifyCode requestVerifyCode, Date date2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            date2 = requestVerifyCode.date;
        }
        if ((i & 2) != 0) {
            str = requestVerifyCode.code;
        }
        return requestVerifyCode.copy(date2, str);
    }

    public final Date component1() {
        return this.date;
    }

    public final String component2() {
        return this.code;
    }

    public final RequestVerifyCode copy(Date date2, String str) {
        if (str != null) {
            return new RequestVerifyCode(date2, str);
        }
        C4638h.m10271a("code");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.code, (java.lang.Object) r3.code) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.request.RequestVerifyCode
            if (r0 == 0) goto L_0x001d
            es.gob.radarcovid.models.request.RequestVerifyCode r3 = (p002es.gob.radarcovid.models.request.RequestVerifyCode) r3
            java.util.Date r0 = r2.date
            java.util.Date r1 = r3.date
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.code
            java.lang.String r3 = r3.code
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
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.request.RequestVerifyCode.equals(java.lang.Object):boolean");
    }

    public final String getCode() {
        return this.code;
    }

    public final Date getDate() {
        return this.date;
    }

    public int hashCode() {
        Date date2 = this.date;
        int i = 0;
        int hashCode = (date2 != null ? date2.hashCode() : 0) * 31;
        String str = this.code;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("RequestVerifyCode(date=");
        a.append(this.date);
        a.append(", code=");
        return C1965a.m4754a(a, this.code, ")");
    }
}
