package p124p.p170k.p171a;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.fragment.app.Fragment;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: p.k.a.q */
public final class C1509q implements Parcelable {
    public static final Creator<C1509q> CREATOR = new C1510a();

    /* renamed from: e */
    public final String f4444e;

    /* renamed from: f */
    public final String f4445f;

    /* renamed from: g */
    public final boolean f4446g;

    /* renamed from: h */
    public final int f4447h;

    /* renamed from: i */
    public final int f4448i;

    /* renamed from: j */
    public final String f4449j;

    /* renamed from: k */
    public final boolean f4450k;

    /* renamed from: l */
    public final boolean f4451l;

    /* renamed from: m */
    public final boolean f4452m;

    /* renamed from: n */
    public final Bundle f4453n;

    /* renamed from: o */
    public final boolean f4454o;

    /* renamed from: p */
    public final int f4455p;

    /* renamed from: q */
    public Bundle f4456q;

    /* renamed from: r */
    public Fragment f4457r;

    /* renamed from: p.k.a.q$a */
    public static class C1510a implements Creator<C1509q> {
        public Object createFromParcel(Parcel parcel) {
            return new C1509q(parcel);
        }

        public Object[] newArray(int i) {
            return new C1509q[i];
        }
    }

    public C1509q(Parcel parcel) {
        this.f4444e = parcel.readString();
        this.f4445f = parcel.readString();
        boolean z = true;
        this.f4446g = parcel.readInt() != 0;
        this.f4447h = parcel.readInt();
        this.f4448i = parcel.readInt();
        this.f4449j = parcel.readString();
        this.f4450k = parcel.readInt() != 0;
        this.f4451l = parcel.readInt() != 0;
        this.f4452m = parcel.readInt() != 0;
        this.f4453n = parcel.readBundle();
        if (parcel.readInt() == 0) {
            z = false;
        }
        this.f4454o = z;
        this.f4456q = parcel.readBundle();
        this.f4455p = parcel.readInt();
    }

    public C1509q(Fragment fragment) {
        this.f4444e = fragment.getClass().getName();
        this.f4445f = fragment.f614i;
        this.f4446g = fragment.f622q;
        this.f4447h = fragment.f631z;
        this.f4448i = fragment.f584A;
        this.f4449j = fragment.f585B;
        this.f4450k = fragment.f588E;
        this.f4451l = fragment.f621p;
        this.f4452m = fragment.f587D;
        this.f4453n = fragment.f615j;
        this.f4454o = fragment.f586C;
        this.f4455p = fragment.f604U.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f4444e);
        sb.append(" (");
        sb.append(this.f4445f);
        sb.append(")}:");
        if (this.f4446g) {
            sb.append(" fromLayout");
        }
        if (this.f4448i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f4448i));
        }
        String str = this.f4449j;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f4449j);
        }
        if (this.f4450k) {
            sb.append(" retainInstance");
        }
        if (this.f4451l) {
            sb.append(" removing");
        }
        if (this.f4452m) {
            sb.append(" detached");
        }
        if (this.f4454o) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4444e);
        parcel.writeString(this.f4445f);
        parcel.writeInt(this.f4446g ? 1 : 0);
        parcel.writeInt(this.f4447h);
        parcel.writeInt(this.f4448i);
        parcel.writeString(this.f4449j);
        parcel.writeInt(this.f4450k ? 1 : 0);
        parcel.writeInt(this.f4451l ? 1 : 0);
        parcel.writeInt(this.f4452m ? 1 : 0);
        parcel.writeBundle(this.f4453n);
        parcel.writeInt(this.f4454o ? 1 : 0);
        parcel.writeBundle(this.f4456q);
        parcel.writeInt(this.f4455p);
    }
}
