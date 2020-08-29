package p002es.gob.radarcovid.models.domain;

import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.models.domain.Language */
public final class Language {
    public final String code;
    public final String name;

    public Language() {
        this(null, null, 3, null);
    }

    public Language(String str, String str2) {
        if (str == null) {
            C4638h.m10271a("code");
            throw null;
        } else if (str2 != null) {
            this.code = str;
            this.name = str2;
        } else {
            C4638h.m10271a("name");
            throw null;
        }
    }

    public /* synthetic */ Language(String str, String str2, int i, C4636f fVar) {
        int i2 = i & 1;
        String str3 = Objects.EMPTY_STRING;
        if (i2 != 0) {
            str = str3;
        }
        if ((i & 2) != 0) {
            str2 = str3;
        }
        this(str, str2);
    }

    public static /* synthetic */ Language copy$default(Language language, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = language.code;
        }
        if ((i & 2) != 0) {
            str2 = language.name;
        }
        return language.copy(str, str2);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.name;
    }

    public final Language copy(String str, String str2) {
        if (str == null) {
            C4638h.m10271a("code");
            throw null;
        } else if (str2 != null) {
            return new Language(str, str2);
        } else {
            C4638h.m10271a("name");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.name, (java.lang.Object) r3.name) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.domain.Language
            if (r0 == 0) goto L_0x001d
            es.gob.radarcovid.models.domain.Language r3 = (p002es.gob.radarcovid.models.domain.Language) r3
            java.lang.String r0 = r2.code
            java.lang.String r1 = r3.code
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.name
            java.lang.String r3 = r3.name
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
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.domain.Language.equals(java.lang.Object):boolean");
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.code;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("Language(code=");
        a.append(this.code);
        a.append(", name=");
        return C1965a.m4754a(a, this.name, ")");
    }
}
