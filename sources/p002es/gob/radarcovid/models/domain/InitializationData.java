package p002es.gob.radarcovid.models.domain;

import java.util.List;
import java.util.Map;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.models.domain.InitializationData */
public final class InitializationData {
    public final Map<String, String> labels;
    public final List<Language> languages;
    public final List<Region> regions;
    public final Settings settings;

    public InitializationData(Settings settings2, Map<String, String> map, List<Language> list, List<Region> list2) {
        if (settings2 == null) {
            C4638h.m10271a("settings");
            throw null;
        } else if (map == null) {
            C4638h.m10271a("labels");
            throw null;
        } else if (list == null) {
            C4638h.m10271a("languages");
            throw null;
        } else if (list2 != null) {
            this.settings = settings2;
            this.labels = map;
            this.languages = list;
            this.regions = list2;
        } else {
            C4638h.m10271a("regions");
            throw null;
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<es.gob.radarcovid.models.domain.Language>, for r3v0, types: [java.util.List] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<es.gob.radarcovid.models.domain.Region>, for r4v0, types: [java.util.List] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Map, code=java.util.Map<java.lang.String, java.lang.String>, for r2v0, types: [java.util.Map] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ p002es.gob.radarcovid.models.domain.InitializationData copy$default(p002es.gob.radarcovid.models.domain.InitializationData r0, p002es.gob.radarcovid.models.domain.Settings r1, java.util.Map<java.lang.String, java.lang.String> r2, java.util.List<p002es.gob.radarcovid.models.domain.Language> r3, java.util.List<p002es.gob.radarcovid.models.domain.Region> r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            es.gob.radarcovid.models.domain.Settings r1 = r0.settings
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.labels
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            java.util.List<es.gob.radarcovid.models.domain.Language> r3 = r0.languages
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            java.util.List<es.gob.radarcovid.models.domain.Region> r4 = r0.regions
        L_0x0018:
            es.gob.radarcovid.models.domain.InitializationData r0 = r0.copy(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.domain.InitializationData.copy$default(es.gob.radarcovid.models.domain.InitializationData, es.gob.radarcovid.models.domain.Settings, java.util.Map, java.util.List, java.util.List, int, java.lang.Object):es.gob.radarcovid.models.domain.InitializationData");
    }

    public final Settings component1() {
        return this.settings;
    }

    public final Map<String, String> component2() {
        return this.labels;
    }

    public final List<Language> component3() {
        return this.languages;
    }

    public final List<Region> component4() {
        return this.regions;
    }

    public final InitializationData copy(Settings settings2, Map<String, String> map, List<Language> list, List<Region> list2) {
        if (settings2 == null) {
            C4638h.m10271a("settings");
            throw null;
        } else if (map == null) {
            C4638h.m10271a("labels");
            throw null;
        } else if (list == null) {
            C4638h.m10271a("languages");
            throw null;
        } else if (list2 != null) {
            return new InitializationData(settings2, map, list, list2);
        } else {
            C4638h.m10271a("regions");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.regions, (java.lang.Object) r3.regions) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof p002es.gob.radarcovid.models.domain.InitializationData
            if (r0 == 0) goto L_0x0031
            es.gob.radarcovid.models.domain.InitializationData r3 = (p002es.gob.radarcovid.models.domain.InitializationData) r3
            es.gob.radarcovid.models.domain.Settings r0 = r2.settings
            es.gob.radarcovid.models.domain.Settings r1 = r3.settings
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.labels
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.labels
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.util.List<es.gob.radarcovid.models.domain.Language> r0 = r2.languages
            java.util.List<es.gob.radarcovid.models.domain.Language> r1 = r3.languages
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.util.List<es.gob.radarcovid.models.domain.Region> r0 = r2.regions
            java.util.List<es.gob.radarcovid.models.domain.Region> r3 = r3.regions
            boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p002es.gob.radarcovid.models.domain.InitializationData.equals(java.lang.Object):boolean");
    }

    public final Map<String, String> getLabels() {
        return this.labels;
    }

    public final List<Language> getLanguages() {
        return this.languages;
    }

    public final List<Region> getRegions() {
        return this.regions;
    }

    public final Settings getSettings() {
        return this.settings;
    }

    public int hashCode() {
        Settings settings2 = this.settings;
        int i = 0;
        int hashCode = (settings2 != null ? settings2.hashCode() : 0) * 31;
        Map<String, String> map = this.labels;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        List<Language> list = this.languages;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<Region> list2 = this.regions;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("InitializationData(settings=");
        a.append(this.settings);
        a.append(", labels=");
        a.append(this.labels);
        a.append(", languages=");
        a.append(this.languages);
        a.append(", regions=");
        a.append(this.regions);
        a.append(")");
        return a.toString();
    }
}
