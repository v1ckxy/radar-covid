package p213q.p217b.p218a.p271c.p280i0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p143e.C1261h;
import p124p.p167j.p168a.C1458a;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.c.i0.a */
public class C3367a extends C1458a {
    public static final Creator<C3367a> CREATOR = new C3368a();

    /* renamed from: g */
    public final C1261h<String, Bundle> f8478g;

    /* renamed from: q.b.a.c.i0.a$a */
    public static class C3368a implements ClassLoaderCreator<C3367a> {
        public Object createFromParcel(Parcel parcel) {
            return new C3367a(parcel, null, null);
        }

        public Object[] newArray(int i) {
            return new C3367a[i];
        }

        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C3367a(parcel, classLoader, null);
        }
    }

    public /* synthetic */ C3367a(Parcel parcel, ClassLoader classLoader, C3368a aVar) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f8478g = new C1261h<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f8478g.put(strArr[i], bundleArr[i]);
        }
    }

    public C3367a(Parcelable parcelable) {
        super(parcelable);
        this.f8478g = new C1261h<>();
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("ExtendableSavedState{");
        a.append(Integer.toHexString(System.identityHashCode(this)));
        a.append(" states=");
        a.append(this.f8478g);
        a.append(Objects.ARRAY_END);
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f4274e, i);
        int i2 = this.f8478g.f3589g;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = (String) this.f8478g.mo5593c(i3);
            bundleArr[i3] = (Bundle) this.f8478g.mo5598e(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
