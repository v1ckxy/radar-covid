package p124p.p150h.p158h;

import android.os.Build.VERSION;
import android.os.LocaleList;
import java.util.Locale;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.h.h.a */
public final class C1349a {

    /* renamed from: a */
    public C1351c f4060a;

    static {
        m3433a(new Locale[0]);
    }

    public C1349a(C1351c cVar) {
        this.f4060a = cVar;
    }

    /* renamed from: a */
    public static Locale m3432a(String str) {
        String str2 = "-";
        if (str.contains(str2)) {
            String[] split = str.split(str2, -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else {
            String str3 = "_";
            if (!str.contains(str3)) {
                return new Locale(str);
            }
            String[] split2 = str.split(str3, -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException(C1965a.m4752a("Can not parse language tag: [", str, "]"));
    }

    /* renamed from: a */
    public static C1349a m3433a(Locale... localeArr) {
        if (VERSION.SDK_INT >= 24) {
            return new C1349a(new C1352d(new LocaleList(localeArr)));
        }
        return new C1349a(new C1350b(localeArr));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1349a) && this.f4060a.equals(((C1349a) obj).f4060a);
    }

    public int hashCode() {
        return this.f4060a.hashCode();
    }

    public String toString() {
        return this.f4060a.toString();
    }
}
