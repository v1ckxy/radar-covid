package p003f.p004a.p005a.p108g.p114c.p115p;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.g.c.p.a */
public final class C0855a implements Parcelable {
    public static final Creator CREATOR = new C0856a();

    /* renamed from: e */
    public final int f2431e;

    /* renamed from: f */
    public String f2432f;

    /* renamed from: g */
    public boolean f2433g;

    /* renamed from: f.a.a.g.c.p.a$a */
    public static class C0856a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            if (parcel != null) {
                return new C0855a(parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
            }
            C4638h.m10271a("in");
            throw null;
        }

        public final Object[] newArray(int i) {
            return new C0855a[i];
        }
    }

    public C0855a(int i, String str, boolean z) {
        if (str != null) {
            this.f2431e = i;
            this.f2432f = str;
            this.f2433g = z;
            return;
        }
        C4638h.m10271a("text");
        throw null;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r2.f2433g == r3.f2433g) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0021
            boolean r0 = r3 instanceof p003f.p004a.p005a.p108g.p114c.p115p.C0855a
            if (r0 == 0) goto L_0x001f
            f.a.a.g.c.p.a r3 = (p003f.p004a.p005a.p108g.p114c.p115p.C0855a) r3
            int r0 = r2.f2431e
            int r1 = r3.f2431e
            if (r0 != r1) goto L_0x001f
            java.lang.String r0 = r2.f2432f
            java.lang.String r1 = r3.f2432f
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
            if (r0 == 0) goto L_0x001f
            boolean r0 = r2.f2433g
            boolean r3 = r3.f2433g
            if (r0 != r3) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r3 = 0
            return r3
        L_0x0021:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p003f.p004a.p005a.p108g.p114c.p115p.C0855a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = this.f2431e * 31;
        String str = this.f2432f;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f2433g;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("AnswerViewModel(id=");
        a.append(this.f2431e);
        a.append(", text=");
        a.append(this.f2432f);
        a.append(", isSelected=");
        a.append(this.f2433g);
        a.append(")");
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeInt(this.f2431e);
            parcel.writeString(this.f2432f);
            parcel.writeInt(this.f2433g ? 1 : 0);
            return;
        }
        C4638h.m10271a("parcel");
        throw null;
    }

    public /* synthetic */ C0855a(int i, String str, boolean z, int i2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        if (str != null) {
            this.f2431e = i;
            this.f2432f = str;
            this.f2433g = z;
            return;
        }
        C4638h.m10271a("text");
        throw null;
    }
}
