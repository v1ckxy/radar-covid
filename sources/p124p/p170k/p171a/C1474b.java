package p124p.p170k.p171a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import p124p.p170k.p171a.C1511r.C1512a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: p.k.a.b */
public final class C1474b implements Parcelable {
    public static final Creator<C1474b> CREATOR = new C1475a();

    /* renamed from: e */
    public final int[] f4321e;

    /* renamed from: f */
    public final ArrayList<String> f4322f;

    /* renamed from: g */
    public final int[] f4323g;

    /* renamed from: h */
    public final int[] f4324h;

    /* renamed from: i */
    public final int f4325i;

    /* renamed from: j */
    public final int f4326j;

    /* renamed from: k */
    public final String f4327k;

    /* renamed from: l */
    public final int f4328l;

    /* renamed from: m */
    public final int f4329m;

    /* renamed from: n */
    public final CharSequence f4330n;

    /* renamed from: o */
    public final int f4331o;

    /* renamed from: p */
    public final CharSequence f4332p;

    /* renamed from: q */
    public final ArrayList<String> f4333q;

    /* renamed from: r */
    public final ArrayList<String> f4334r;

    /* renamed from: s */
    public final boolean f4335s;

    /* renamed from: p.k.a.b$a */
    public static class C1475a implements Creator<C1474b> {
        public Object createFromParcel(Parcel parcel) {
            return new C1474b(parcel);
        }

        public Object[] newArray(int i) {
            return new C1474b[i];
        }
    }

    public C1474b(Parcel parcel) {
        this.f4321e = parcel.createIntArray();
        this.f4322f = parcel.createStringArrayList();
        this.f4323g = parcel.createIntArray();
        this.f4324h = parcel.createIntArray();
        this.f4325i = parcel.readInt();
        this.f4326j = parcel.readInt();
        this.f4327k = parcel.readString();
        this.f4328l = parcel.readInt();
        this.f4329m = parcel.readInt();
        this.f4330n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4331o = parcel.readInt();
        this.f4332p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4333q = parcel.createStringArrayList();
        this.f4334r = parcel.createStringArrayList();
        this.f4335s = parcel.readInt() != 0;
    }

    public C1474b(C1472a aVar) {
        int size = aVar.f4458a.size();
        this.f4321e = new int[(size * 5)];
        if (aVar.f4465h) {
            this.f4322f = new ArrayList<>(size);
            this.f4323g = new int[size];
            this.f4324h = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C1512a aVar2 = (C1512a) aVar.f4458a.get(i);
                int i3 = i2 + 1;
                this.f4321e[i2] = aVar2.f4475a;
                ArrayList<String> arrayList = this.f4322f;
                Fragment fragment = aVar2.f4476b;
                arrayList.add(fragment != null ? fragment.f614i : null);
                int[] iArr = this.f4321e;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f4477c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f4478d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f4479e;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f4480f;
                this.f4323g[i] = aVar2.f4481g.ordinal();
                this.f4324h[i] = aVar2.f4482h.ordinal();
                i++;
                i2 = i7;
            }
            this.f4325i = aVar.f4463f;
            this.f4326j = aVar.f4464g;
            this.f4327k = aVar.f4466i;
            this.f4328l = aVar.f4318t;
            this.f4329m = aVar.f4467j;
            this.f4330n = aVar.f4468k;
            this.f4331o = aVar.f4469l;
            this.f4332p = aVar.f4470m;
            this.f4333q = aVar.f4471n;
            this.f4334r = aVar.f4472o;
            this.f4335s = aVar.f4473p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f4321e);
        parcel.writeStringList(this.f4322f);
        parcel.writeIntArray(this.f4323g);
        parcel.writeIntArray(this.f4324h);
        parcel.writeInt(this.f4325i);
        parcel.writeInt(this.f4326j);
        parcel.writeString(this.f4327k);
        parcel.writeInt(this.f4328l);
        parcel.writeInt(this.f4329m);
        TextUtils.writeToParcel(this.f4330n, parcel, 0);
        parcel.writeInt(this.f4331o);
        TextUtils.writeToParcel(this.f4332p, parcel, 0);
        parcel.writeStringList(this.f4333q);
        parcel.writeStringList(this.f4334r);
        parcel.writeInt(this.f4335s ? 1 : 0);
    }
}
