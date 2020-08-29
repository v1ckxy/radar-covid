package org.dpppt.android.sdk.models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

public class DayDate implements Comparable {
    public long timestampRepresentation;

    public DayDate() {
        this(System.currentTimeMillis());
    }

    public DayDate(long j) {
        this.timestampRepresentation = convertToDay(j);
    }

    public DayDate(String str) {
        this.timestampRepresentation = convertToDay(getDayDateFormat().parse(str).getTime());
    }

    private long convertToDay(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setTimeInMillis(j);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    private SimpleDateFormat getDayDateFormat() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    public DayDate addDays(int i) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setTimeInMillis(this.timestampRepresentation);
        gregorianCalendar.add(5, i);
        return new DayDate(gregorianCalendar.getTimeInMillis());
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof DayDate)) {
            return -1;
        }
        DayDate dayDate = (DayDate) obj;
        if (isBefore(dayDate)) {
            return -1;
        }
        return dayDate.isBefore(this) ? 1 : 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || DayDate.class != obj.getClass()) {
            return false;
        }
        if (this.timestampRepresentation != ((DayDate) obj).timestampRepresentation) {
            z = false;
        }
        return z;
    }

    public String formatAsString() {
        return getDayDateFormat().format(new Date(this.timestampRepresentation));
    }

    public DayDate getNextDay() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setTimeInMillis(this.timestampRepresentation);
        gregorianCalendar.add(5, 1);
        return new DayDate(gregorianCalendar.getTimeInMillis());
    }

    public long getStartOfDay(TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setTimeInMillis(this.timestampRepresentation);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
        gregorianCalendar2.set(1, gregorianCalendar.get(1));
        gregorianCalendar2.set(2, gregorianCalendar.get(2));
        gregorianCalendar2.set(5, gregorianCalendar.get(5));
        gregorianCalendar2.set(11, 0);
        gregorianCalendar2.set(12, 0);
        gregorianCalendar2.set(13, 0);
        gregorianCalendar2.set(14, 0);
        return gregorianCalendar2.getTimeInMillis();
    }

    public long getStartOfDayTimestamp() {
        return this.timestampRepresentation;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.timestampRepresentation)});
    }

    public boolean isBefore(DayDate dayDate) {
        return this.timestampRepresentation < dayDate.timestampRepresentation;
    }

    public boolean isBeforeOrEquals(long j) {
        return this.timestampRepresentation <= j;
    }

    public boolean isBeforeOrEquals(DayDate dayDate) {
        return this.timestampRepresentation <= dayDate.timestampRepresentation;
    }

    public DayDate subtractDays(int i) {
        return addDays(-i);
    }
}
