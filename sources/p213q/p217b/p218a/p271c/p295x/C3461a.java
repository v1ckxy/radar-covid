package p213q.p217b.p218a.p271c.p295x;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: q.b.a.c.x.a */
public final class C3461a implements Parcelable {
    public static final Creator<C3461a> CREATOR = new C3462a();

    /* renamed from: e */
    public final C3482n f8814e;

    /* renamed from: f */
    public final C3482n f8815f;

    /* renamed from: g */
    public final C3482n f8816g;

    /* renamed from: h */
    public final C3463b f8817h;

    /* renamed from: i */
    public final int f8818i;

    /* renamed from: j */
    public final int f8819j;

    /* renamed from: q.b.a.c.x.a$a */
    public static class C3462a implements Creator<C3461a> {
        public Object createFromParcel(Parcel parcel) {
            C3461a aVar = new C3461a((C3482n) parcel.readParcelable(C3482n.class.getClassLoader()), (C3482n) parcel.readParcelable(C3482n.class.getClassLoader()), (C3482n) parcel.readParcelable(C3482n.class.getClassLoader()), (C3463b) parcel.readParcelable(C3463b.class.getClassLoader()), null);
            return aVar;
        }

        public Object[] newArray(int i) {
            return new C3461a[i];
        }
    }

    /* renamed from: q.b.a.c.x.a$b */
    public interface C3463b extends Parcelable {
        /* renamed from: d */
        boolean mo9411d(long j);
    }

    public /* synthetic */ C3461a(C3482n nVar, C3482n nVar2, C3482n nVar3, C3463b bVar, C3462a aVar) {
        this.f8814e = nVar;
        this.f8815f = nVar2;
        this.f8816g = nVar3;
        this.f8817h = bVar;
        if (nVar.f8872e.compareTo(nVar3.f8872e) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (nVar3.f8872e.compareTo(nVar2.f8872e) <= 0) {
            this.f8819j = nVar.mo9431b(nVar2) + 1;
            this.f8818i = (nVar2.f8875h - nVar.f8875h) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3461a)) {
            return false;
        }
        C3461a aVar = (C3461a) obj;
        if (!this.f8814e.equals(aVar.f8814e) || !this.f8815f.equals(aVar.f8815f) || !this.f8816g.equals(aVar.f8816g) || !this.f8817h.equals(aVar.f8817h)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8814e, this.f8815f, this.f8816g, this.f8817h});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8814e, 0);
        parcel.writeParcelable(this.f8815f, 0);
        parcel.writeParcelable(this.f8816g, 0);
        parcel.writeParcelable(this.f8817h, 0);
    }
}
