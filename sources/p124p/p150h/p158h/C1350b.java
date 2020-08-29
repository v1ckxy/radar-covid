package p124p.p150h.p158h;

import java.util.HashSet;
import java.util.Locale;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.h.h.b */
public final class C1350b implements C1351c {

    /* renamed from: b */
    public static final Locale[] f4061b = new Locale[0];

    /* renamed from: a */
    public final Locale[] f4062a;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        C1349a.m3432a("en-Latn");
    }

    public C1350b(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f4062a = f4061b;
            return;
        }
        Locale[] localeArr2 = new Locale[localeArr.length];
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < localeArr.length) {
            Locale locale = localeArr[i];
            String str = "list[";
            if (locale == null) {
                throw new NullPointerException(C1965a.m4762b(str, i, "] is null"));
            } else if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                localeArr2[i] = locale2;
                locale2.getLanguage();
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    locale2.getCountry();
                }
                int length = localeArr.length;
                hashSet.add(locale2);
                i++;
            } else {
                throw new IllegalArgumentException(C1965a.m4762b(str, i, "] is a repetition"));
            }
        }
        this.f4062a = localeArr2;
    }

    /* renamed from: a */
    public Object mo5817a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1350b)) {
            return false;
        }
        Locale[] localeArr = ((C1350b) obj).f4062a;
        if (this.f4062a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f4062a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f4062a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f4062a;
            if (i2 >= localeArr.length) {
                return i;
            }
            i = (i * 31) + localeArr[i2].hashCode();
            i2++;
        }
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f4062a;
            if (i < localeArr.length) {
                a.append(localeArr[i]);
                if (i < this.f4062a.length - 1) {
                    a.append(',');
                }
                i++;
            } else {
                a.append("]");
                return a.toString();
            }
        }
    }
}
