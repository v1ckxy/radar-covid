package p213q.p217b.p317d.p322h.p323e.p326k;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
import p213q.p217b.p317d.p322h.p323e.p330n.C4127a;
import p213q.p217b.p317d.p322h.p323e.p330n.C4128b;
import p213q.p217b.p317d.p322h.p323e.p330n.C4129c;

/* renamed from: q.b.d.h.e.k.a */
public abstract class C3930a {

    /* renamed from: e */
    public static final Pattern f9581e = Pattern.compile("http(s?)://[^\\/]+", 2);

    /* renamed from: a */
    public final String f9582a;

    /* renamed from: b */
    public final C4129c f9583b;

    /* renamed from: c */
    public final C4127a f9584c;

    /* renamed from: d */
    public final String f9585d;

    public C3930a(String str, String str2, C4129c cVar, C4127a aVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        } else if (cVar != null) {
            this.f9585d = str;
            if (!C3944g.m9366b(str)) {
                str2 = f9581e.matcher(str2).replaceFirst(this.f9585d);
            }
            this.f9582a = str2;
            this.f9583b = cVar;
            this.f9584c = aVar;
        } else {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
    }

    /* renamed from: a */
    public C4128b mo10119a() {
        return mo10120a(Collections.emptyMap());
    }

    /* renamed from: a */
    public C4128b mo10120a(Map<String, String> map) {
        C4129c cVar = this.f9583b;
        C4127a aVar = this.f9584c;
        String str = this.f9582a;
        if (cVar != null) {
            C4128b bVar = new C4128b(aVar, str, map);
            bVar.f9996d.put("User-Agent", "Crashlytics Android SDK/17.1.1");
            bVar.f9996d.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            return bVar;
        }
        throw null;
    }
}
