package p425x.p472b.p473a.p474a.p476l.p480n;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p213q.p217b.p218a.p231b.p239d.p240m.C2147b;

/* renamed from: x.b.a.a.l.n.k */
public class C5240k {

    /* renamed from: a */
    public static final Pattern f12475a = Pattern.compile("ConnectionResult\\{[^}]*statusCode=[a-zA-Z0-9_]+\\((\\d+)\\)");

    /* renamed from: a */
    public static int m11678a(C2147b bVar) {
        String str = bVar.f6010e.f1063g;
        if (str != null) {
            Matcher matcher = f12475a.matcher(str);
            if (matcher.find()) {
                return Integer.parseInt(matcher.group(1));
            }
        }
        return -2;
    }
}
