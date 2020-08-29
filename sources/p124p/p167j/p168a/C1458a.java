package p124p.p167j.p168a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

/* renamed from: p.j.a.a */
public abstract class C1458a implements Parcelable {
    public static final Creator<C1458a> CREATOR = new C1460b();

    /* renamed from: f */
    public static final C1458a f4273f = new C1459a();

    /* renamed from: e */
    public final Parcelable f4274e;

    /* renamed from: p.j.a.a$a */
    public static class C1459a extends C1458a {
        public C1459a() {
            super((C1459a) null);
        }
    }

    /* renamed from: p.j.a.a$b */
    public static class C1460b implements ClassLoaderCreator<C1458a> {
        public Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return C1458a.f4273f;
            }
            throw new IllegalStateException("superState must be null");
        }

        public Object[] newArray(int i) {
            return new C1458a[i];
        }

        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return C1458a.f4273f;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public C1458a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = f4273f;
        }
        this.f4274e = readParcelable;
    }

    public C1458a(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable == f4273f) {
                parcelable = null;
            }
            this.f4274e = parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public /* synthetic */ C1458a(C1459a aVar) {
        this.f4274e = null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f4274e, i);
    }
}
