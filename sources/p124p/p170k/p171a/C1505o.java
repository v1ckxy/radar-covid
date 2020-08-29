package p124p.p170k.p171a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: p.k.a.o */
public final class C1505o implements Parcelable {
    public static final Creator<C1505o> CREATOR = new C1506a();

    /* renamed from: e */
    public ArrayList<C1509q> f4432e;

    /* renamed from: f */
    public ArrayList<String> f4433f;

    /* renamed from: g */
    public C1474b[] f4434g;

    /* renamed from: h */
    public String f4435h = null;

    /* renamed from: i */
    public int f4436i;

    /* renamed from: p.k.a.o$a */
    public static class C1506a implements Creator<C1505o> {
        public Object createFromParcel(Parcel parcel) {
            return new C1505o(parcel);
        }

        public Object[] newArray(int i) {
            return new C1505o[i];
        }
    }

    public C1505o() {
    }

    public C1505o(Parcel parcel) {
        this.f4432e = parcel.createTypedArrayList(C1509q.CREATOR);
        this.f4433f = parcel.createStringArrayList();
        this.f4434g = (C1474b[]) parcel.createTypedArray(C1474b.CREATOR);
        this.f4435h = parcel.readString();
        this.f4436i = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f4432e);
        parcel.writeStringList(this.f4433f);
        parcel.writeTypedArray(this.f4434g, i);
        parcel.writeString(this.f4435h);
        parcel.writeInt(this.f4436i);
    }
}
