package p116io.jsonwebtoken.lang;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: io.jsonwebtoken.lang.DateFormats */
public class DateFormats {
    public static final ThreadLocal<DateFormat> ISO_8601 = new ThreadLocal<DateFormat>() {
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateFormats.ISO_8601_PATTERN);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    };
    public static final ThreadLocal<DateFormat> ISO_8601_MILLIS = new ThreadLocal<DateFormat>() {
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateFormats.ISO_8601_MILLIS_PATTERN);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    };
    public static final String ISO_8601_MILLIS_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    public static final String ISO_8601_PATTERN = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    public static String formatIso8601(Date date) {
        return formatIso8601(date, true);
    }

    public static String formatIso8601(Date date, boolean z) {
        return ((DateFormat) (z ? ISO_8601_MILLIS : ISO_8601).get()).format(date);
    }

    public static Date parseIso8601Date(String str) {
        Assert.notNull(str, "String argument cannot be null.");
        return ((DateFormat) (str.lastIndexOf(46) > -1 ? ISO_8601_MILLIS : ISO_8601).get()).parse(str);
    }
}
