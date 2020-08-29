package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import p124p.p195w.C1766b;
import p124p.p195w.C1767c;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Creator<ParcelImpl> CREATOR = new C0151a();

    /* renamed from: e */
    public final C1767c f917e;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    public static class C0151a implements Creator<ParcelImpl> {
        public Object createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public Object[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f917e = new C1766b(parcel).mo6754c();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C1766b(parcel).mo6746a(this.f917e);
    }
}
