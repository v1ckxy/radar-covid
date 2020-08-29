package p003f.p004a.p005a.p108g.p114c.p115p;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p116io.jsonwebtoken.lang.Objects;
import p392u.p393n.C4570i;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.g.c.p.b */
public final class C0857b implements Parcelable {
    public static final Creator CREATOR = new C0858a();

    /* renamed from: e */
    public int f2434e;

    /* renamed from: f */
    public final C0859b f2435f;

    /* renamed from: g */
    public String f2436g;

    /* renamed from: h */
    public List<C0855a> f2437h;

    /* renamed from: i */
    public int f2438i;

    /* renamed from: j */
    public int f2439j;

    /* renamed from: k */
    public int f2440k;

    /* renamed from: l */
    public int f2441l;

    /* renamed from: f.a.a.g.c.p.b$a */
    public static class C0858a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            if (parcel != null) {
                int readInt = parcel.readInt();
                C0859b bVar = (C0859b) Enum.valueOf(C0859b.class, parcel.readString());
                String readString = parcel.readString();
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList.add((C0855a) C0855a.CREATOR.createFromParcel(parcel));
                    readInt2--;
                }
                C0857b bVar2 = new C0857b(readInt, bVar, readString, arrayList, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return bVar2;
            }
            C4638h.m10271a("in");
            throw null;
        }

        public final Object[] newArray(int i) {
            return new C0857b[i];
        }
    }

    /* renamed from: f.a.a.g.c.p.b$b */
    public enum C0859b {
        RATE,
        SINGLE_SELECTION,
        MULTIPLE_SELECTION,
        FIELD
    }

    public C0857b() {
        this(0, null, null, null, 0, 0, 0, 0, 255);
    }

    public C0857b(int i, C0859b bVar, String str, List<C0855a> list, int i2, int i3, int i4, int i5) {
        if (bVar == null) {
            C4638h.m10271a("type");
            throw null;
        } else if (str == null) {
            C4638h.m10271a("text");
            throw null;
        } else if (list != null) {
            this.f2434e = i;
            this.f2435f = bVar;
            this.f2436g = str;
            this.f2437h = list;
            this.f2438i = i2;
            this.f2439j = i3;
            this.f2440k = i4;
            this.f2441l = i5;
        } else {
            C4638h.m10271a("answers");
            throw null;
        }
    }

    /* renamed from: a */
    public final boolean mo3953a() {
        return this.f2439j == -1;
    }

    /* renamed from: a */
    public final boolean mo3954a(int i) {
        boolean z;
        List<C0855a> list = this.f2437h;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C0855a aVar : list) {
                if (!aVar.f2433g || aVar.f2431e != i) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0857b)) {
            obj = null;
        }
        C0857b bVar = (C0857b) obj;
        return bVar != null && bVar.f2434e == this.f2434e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeInt(this.f2434e);
            parcel.writeString(this.f2435f.name());
            parcel.writeString(this.f2436g);
            List<C0855a> list = this.f2437h;
            parcel.writeInt(list.size());
            for (C0855a writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, 0);
            }
            parcel.writeInt(this.f2438i);
            parcel.writeInt(this.f2439j);
            parcel.writeInt(this.f2440k);
            parcel.writeInt(this.f2441l);
            return;
        }
        C4638h.m10271a("parcel");
        throw null;
    }

    public /* synthetic */ C0857b(int i, C0859b bVar, String str, List list, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i6;
        int i8 = -1;
        int i9 = (i7 & 1) != 0 ? -1 : i;
        C0859b bVar2 = (i7 & 2) != 0 ? C0859b.RATE : bVar;
        String str2 = (i7 & 4) != 0 ? Objects.EMPTY_STRING : str;
        List list2 = (i7 & 8) != 0 ? C4570i.f10779e : list;
        int i10 = (i7 & 16) != 0 ? -1 : i2;
        int i11 = (i7 & 32) != 0 ? -1 : i3;
        int i12 = (i7 & 64) != 0 ? -1 : i4;
        if ((i7 & 128) == 0) {
            i8 = i5;
        }
        this(i9, bVar2, str2, list2, i10, i11, i12, i8);
    }
}
