package p410v.p411m0.p414e;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p392u.p401r.p403c.C4638h;
import p410v.p411m0.C4737b;

/* renamed from: v.m0.e.c */
public final class C4773c {

    /* renamed from: a */
    public static final C4774a f11296a = new C4774a();

    /* renamed from: b */
    public static final String[] f11297b;

    /* renamed from: c */
    public static final DateFormat[] f11298c;

    /* renamed from: v.m0.e.c$a */
    public static final class C4774a extends ThreadLocal<DateFormat> {
        public Object initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C4737b.f11144e);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f11297b = strArr;
        f11298c = new DateFormat[strArr.length];
    }

    /* renamed from: a */
    public static final Date m10573a(String str) {
        if (str != null) {
            if (str.length() == 0) {
                return null;
            }
            ParsePosition parsePosition = new ParsePosition(0);
            Date parse = ((DateFormat) f11296a.get()).parse(str, parsePosition);
            if (parsePosition.getIndex() == str.length()) {
                return parse;
            }
            synchronized (f11297b) {
                int length = f11297b.length;
                for (int i = 0; i < length; i++) {
                    DateFormat dateFormat = f11298c[i];
                    if (dateFormat == 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(f11297b[i], Locale.US);
                        simpleDateFormat.setTimeZone(C4737b.f11144e);
                        f11298c[i] = simpleDateFormat;
                        dateFormat = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date parse2 = dateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return parse2;
                    }
                }
                return null;
            }
        }
        C4638h.m10271a("$this$toHttpDateOrNull");
        throw null;
    }

    /* renamed from: a */
    public static final String m10572a(Date date) {
        if (date != null) {
            String format = ((DateFormat) f11296a.get()).format(date);
            C4638h.m10270a((Object) format, "STANDARD_DATE_FORMAT.get().format(this)");
            return format;
        }
        C4638h.m10271a("$this$toHttpDateString");
        throw null;
    }
}
