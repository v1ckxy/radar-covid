package p213q.p217b.p218a.p271c.p273b0;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.SparseArray;

/* renamed from: q.b.a.c.b0.f */
public class C3300f extends SparseArray<Parcelable> implements Parcelable {
    public static final Creator<C3300f> CREATOR = new C3301a();

    /* renamed from: q.b.a.c.b0.f$a */
    public static class C3301a implements ClassLoaderCreator<C3300f> {
        public Object createFromParcel(Parcel parcel) {
            return new C3300f(parcel, null);
        }

        public Object[] newArray(int i) {
            return new C3300f[i];
        }

        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C3300f(parcel, classLoader);
        }
    }

    public C3300f() {
    }

    public C3300f(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i = 0; i < readInt; i++) {
            put(iArr[i], readParcelableArray[i]);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = (Parcelable) valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
