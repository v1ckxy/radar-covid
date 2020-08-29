package p213q.p217b.p317d.p350n;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p213q.p217b.p317d.p350n.p351o.C4292a;
import p213q.p217b.p317d.p350n.p351o.C4298d;

/* renamed from: q.b.d.n.n */
public class C4291n {

    /* renamed from: a */
    public static final long f10314a = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: b */
    public static final Pattern f10315b = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: a */
    public static boolean m9796a(String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long mo10497a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    /* renamed from: a */
    public boolean mo10498a(C4298d dVar) {
        if (TextUtils.isEmpty(((C4292a) dVar).f10318c)) {
            return true;
        }
        C4292a aVar = (C4292a) dVar;
        if (aVar.f10321f + aVar.f10320e < mo10497a() + f10314a) {
            return true;
        }
        return false;
    }
}
