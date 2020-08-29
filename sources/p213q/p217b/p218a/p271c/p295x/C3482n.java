package p213q.p217b.p218a.p271c.p295x;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.c.x.n */
public final class C3482n implements Comparable<C3482n>, Parcelable {
    public static final Creator<C3482n> CREATOR = new C3483a();

    /* renamed from: e */
    public final Calendar f8872e;

    /* renamed from: f */
    public final String f8873f;

    /* renamed from: g */
    public final int f8874g;

    /* renamed from: h */
    public final int f8875h = this.f8872e.get(1);

    /* renamed from: i */
    public final int f8876i = this.f8872e.getMaximum(7);

    /* renamed from: j */
    public final int f8877j = this.f8872e.getActualMaximum(5);

    /* renamed from: q.b.a.c.x.n$a */
    public static class C3483a implements Creator<C3482n> {
        public Object createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            Calendar c = C2286e.m5311c();
            c.set(1, readInt);
            c.set(2, readInt2);
            return new C3482n(c);
        }

        public Object[] newArray(int i) {
            return new C3482n[i];
        }
    }

    public C3482n(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a = C2286e.m5201a(calendar);
        this.f8872e = a;
        this.f8874g = a.get(2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM, yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(C2286e.m5206a());
        this.f8873f = simpleDateFormat.format(this.f8872e.getTime());
        this.f8872e.getTimeInMillis();
    }

    /* renamed from: a */
    public int compareTo(C3482n nVar) {
        return this.f8872e.compareTo(nVar.f8872e);
    }

    /* renamed from: a */
    public C3482n mo9430a(int i) {
        Calendar a = C2286e.m5201a(this.f8872e);
        a.add(2, i);
        return new C3482n(a);
    }

    /* renamed from: b */
    public int mo9431b(C3482n nVar) {
        if (this.f8872e instanceof GregorianCalendar) {
            return (nVar.f8874g - this.f8874g) + ((nVar.f8875h - this.f8875h) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3482n)) {
            return false;
        }
        C3482n nVar = (C3482n) obj;
        if (!(this.f8874g == nVar.f8874g && this.f8875h == nVar.f8875h)) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public int mo9435f() {
        int firstDayOfWeek = this.f8872e.get(7) - this.f8872e.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f8876i : firstDayOfWeek;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8874g), Integer.valueOf(this.f8875h)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8875h);
        parcel.writeInt(this.f8874g);
    }
}
