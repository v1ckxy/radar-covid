package p410v;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p116io.jsonwebtoken.lang.Strings;
import p119o.p120a.C0967p0;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;
import p410v.p411m0.C4737b;
import p410v.p411m0.p414e.C4773c;

/* renamed from: v.n */
public final class C4854n {

    /* renamed from: j */
    public static final Pattern f11566j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    public static final Pattern f11567k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    public static final Pattern f11568l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    public static final Pattern f11569m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: n */
    public static final C4854n f11570n = null;

    /* renamed from: a */
    public final String f11571a;

    /* renamed from: b */
    public final String f11572b;

    /* renamed from: c */
    public final long f11573c;

    /* renamed from: d */
    public final String f11574d;

    /* renamed from: e */
    public final String f11575e;

    /* renamed from: f */
    public final boolean f11576f;

    /* renamed from: g */
    public final boolean f11577g;

    /* renamed from: h */
    public final boolean f11578h;

    /* renamed from: i */
    public final boolean f11579i;

    public /* synthetic */ C4854n(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, C4636f fVar) {
        this.f11571a = str;
        this.f11572b = str2;
        this.f11573c = j;
        this.f11574d = str3;
        this.f11575e = str4;
        this.f11576f = z;
        this.f11577g = z2;
        this.f11578h = z3;
        this.f11579i = z4;
    }

    /* renamed from: a */
    public static final int m10824a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static final String m10826a(String str) {
        String str2 = Strings.CURRENT_PATH;
        if (!C4681g.m10323a(str, str2, false, 2)) {
            if (C4681g.m10327b(str, str2, false, 2)) {
                str = str.substring(str2.length());
                C4638h.m10270a((Object) str, "(this as java.lang.String).substring(startIndex)");
            }
            String e = C0967p0.m2251e(str);
            if (e != null) {
                return e;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4854n) {
            C4854n nVar = (C4854n) obj;
            if (C4638h.m10272a((Object) nVar.f11571a, (Object) this.f11571a) && C4638h.m10272a((Object) nVar.f11572b, (Object) this.f11572b) && nVar.f11573c == this.f11573c && C4638h.m10272a((Object) nVar.f11574d, (Object) this.f11574d) && C4638h.m10272a((Object) nVar.f11575e, (Object) this.f11575e) && nVar.f11576f == this.f11576f && nVar.f11577g == this.f11577g && nVar.f11578h == this.f11578h && nVar.f11579i == this.f11579i) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((this.f11575e.hashCode() + ((this.f11574d.hashCode() + ((((this.f11572b.hashCode() + ((this.f11571a.hashCode() + 527) * 31)) * 31) + C0191c.m875a(this.f11573c)) * 31)) * 31)) * 31) + C0190b.m874a(this.f11576f)) * 31) + C0190b.m874a(this.f11577g)) * 31) + C0190b.m874a(this.f11578h)) * 31) + C0190b.m874a(this.f11579i);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11571a);
        sb.append('=');
        sb.append(this.f11572b);
        if (this.f11578h) {
            if (this.f11573c == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                sb.append("; expires=");
                str = C4773c.m10572a(new Date(this.f11573c));
            }
            sb.append(str);
        }
        if (!this.f11579i) {
            sb.append("; domain=");
            sb.append(this.f11574d);
        }
        sb.append("; path=");
        sb.append(this.f11575e);
        if (this.f11576f) {
            sb.append("; secure");
        }
        if (this.f11577g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        C4638h.m10270a((Object) sb2, "toString()");
        return sb2;
    }

    /* renamed from: a */
    public static final long m10825a(String str, int i, int i2) {
        int a = m10824a(str, i, i2, false);
        Matcher matcher = f11569m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (a < i2) {
            int a2 = m10824a(str, a + 1, i2, true);
            matcher.region(a, a2);
            if (i4 == -1 && matcher.usePattern(f11569m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(f11568l).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (i6 == -1 && matcher.usePattern(f11567k).matches()) {
                String group = matcher.group(1);
                C4638h.m10270a((Object) group, "matcher.group(1)");
                Locale locale = Locale.US;
                C4638h.m10270a((Object) locale, "Locale.US");
                String lowerCase = group.toLowerCase(locale);
                C4638h.m10270a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                String pattern = f11567k.pattern();
                C4638h.m10270a((Object) pattern, "MONTH_PATTERN.pattern()");
                i6 = C4681g.m10306a((CharSequence) pattern, lowerCase, 0, false, 6) / 4;
            } else if (i3 == -1 && matcher.usePattern(f11566j).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
            }
            a = m10824a(str, a2 + 1, i2, false);
        }
        if (70 <= i3 && 99 >= i3) {
            i3 += 1900;
        }
        if (i3 >= 0 && 69 >= i3) {
            i3 += RecyclerView.MAX_SCROLL_DURATION;
        }
        String str2 = "Failed requirement.";
        if (i3 >= 1601) {
            if (i6 != -1) {
                if (1 <= i5 && 31 >= i5) {
                    if (i4 >= 0 && 23 >= i4) {
                        if (i7 >= 0 && 59 >= i7) {
                            if (i8 >= 0 && 59 >= i8) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(C4737b.f11144e);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i3);
                                gregorianCalendar.set(2, i6 - 1);
                                gregorianCalendar.set(5, i5);
                                gregorianCalendar.set(11, i4);
                                gregorianCalendar.set(12, i7);
                                gregorianCalendar.set(13, i8);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            throw new IllegalArgumentException(str2.toString());
                        }
                        throw new IllegalArgumentException(str2.toString());
                    }
                    throw new IllegalArgumentException(str2.toString());
                }
                throw new IllegalArgumentException(str2.toString());
            }
            throw new IllegalArgumentException(str2.toString());
        }
        throw new IllegalArgumentException(str2.toString());
    }
}
