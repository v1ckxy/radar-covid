package p002es.gob.radarcovid.models.domain;

import java.util.List;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.models.domain.LocaleInfo */
public final class LocaleInfo {
    public final List<Language> languages;
    public final List<Region> regions;

    public LocaleInfo(List<Language> list, List<Region> list2) {
        if (list == null) {
            C4638h.m10271a("languages");
            throw null;
        } else if (list2 != null) {
            this.languages = list;
            this.regions = list2;
        } else {
            C4638h.m10271a("regions");
            throw null;
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<es.gob.radarcovid.models.domain.Language>, for r1v0, types: [java.util.List] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<es.gob.radarcovid.models.domain.Region>, for r2v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ p002es.gob.radarcovid.models.domain.LocaleInfo copy$default(p002es.gob.radarcovid.models.domain.LocaleInfo r0, java.util.List<p002es.gob.radarcovid.models.domain.Language> r1, java.util.List<p002es.gob.radarcovid.models.domain.Region> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            java.util.List<es.gob.radarcovid.models.domain.Language> r1 = r0.languages
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            java.util.List<es.gob.radarcovid.models.domain.Region> r2 = r0.regions
        L_0x000c:
            es.gob.radarcovid.models.domain.LocaleInfo r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.domain.LocaleInfo.copy$default(es.gob.radarcovid.models.domain.LocaleInfo, java.util.List, java.util.List, int, java.lang.Object):es.gob.radarcovid.models.domain.LocaleInfo");
    }

    public final List<Language> component1() {
        return this.languages;
    }

    public final List<Region> component2() {
        return this.regions;
    }

    public final LocaleInfo copy(List<Language> list, List<Region> list2) {
        if (list == null) {
            C4638h.m10271a("languages");
            throw null;
        } else if (list2 != null) {
            return new LocaleInfo(list, list2);
        } else {
            C4638h.m10271a("regions");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.regions, (java.lang.Object) r3.regions) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.domain.LocaleInfo
            if (r0 == 0) goto L_0x001d
            es.gob.radarcovid.models.domain.LocaleInfo r3 = (p002es.gob.radarcovid.models.domain.LocaleInfo) r3
            java.util.List<es.gob.radarcovid.models.domain.Language> r0 = r2.languages
            java.util.List<es.gob.radarcovid.models.domain.Language> r1 = r3.languages
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<es.gob.radarcovid.models.domain.Region> r0 = r2.regions
            java.util.List<es.gob.radarcovid.models.domain.Region> r3 = r3.regions
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
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.domain.LocaleInfo.equals(java.lang.Object):boolean");
    }

    public final List<Language> getLanguages() {
        return this.languages;
    }

    public final List<Region> getRegions() {
        return this.regions;
    }

    public int hashCode() {
        List<Language> list = this.languages;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Region> list2 = this.regions;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("LocaleInfo(languages=");
        a.append(this.languages);
        a.append(", regions=");
        a.append(this.regions);
        a.append(")");
        return a.toString();
    }
}
