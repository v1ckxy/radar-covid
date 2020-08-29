package p003f.p004a.p005a.p006a.p010d;

import java.util.List;
import java.util.Map;
import p002es.gob.radarcovid.models.domain.InitializationData;
import p002es.gob.radarcovid.models.domain.Language;
import p002es.gob.radarcovid.models.domain.Region;
import p002es.gob.radarcovid.models.domain.Settings;
import p369s.p370a.p371a.p377e.C4460c;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.a.d.a0 */
public final class C0452a0<T1, T2, T3, T4, R> implements C4460c<Settings, Map<String, ? extends String>, List<? extends Language>, List<? extends Region>, InitializationData> {

    /* renamed from: a */
    public static final C0452a0 f1825a = new C0452a0();

    /* renamed from: a */
    public Object mo3708a(Object obj, Object obj2, Object obj3, Object obj4) {
        Settings settings = (Settings) obj;
        Map map = (Map) obj2;
        List list = (List) obj3;
        List list2 = (List) obj4;
        C4638h.m10270a((Object) settings, "settings");
        C4638h.m10270a((Object) map, "labels");
        C4638h.m10270a((Object) list, "languages");
        C4638h.m10270a((Object) list2, "regions");
        return new InitializationData(settings, map, list, list2);
    }
}
