package p213q.p217b.p218a.p231b.p239d.p242n;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.C2119d;
import p213q.p217b.p218a.p231b.p239d.C2124f;
import p213q.p217b.p218a.p231b.p239d.p242n.C2241h.C2242a;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.d.n.d */
public class C2232d extends C2258a {
    public static final Creator<C2232d> CREATOR = new C2231c0();

    /* renamed from: e */
    public final int f6169e;

    /* renamed from: f */
    public final int f6170f;

    /* renamed from: g */
    public int f6171g;

    /* renamed from: h */
    public String f6172h;

    /* renamed from: i */
    public IBinder f6173i;

    /* renamed from: j */
    public Scope[] f6174j;

    /* renamed from: k */
    public Bundle f6175k;

    /* renamed from: l */
    public Account f6176l;

    /* renamed from: m */
    public C2119d[] f6177m;

    /* renamed from: n */
    public C2119d[] f6178n;

    /* renamed from: o */
    public boolean f6179o;

    /* renamed from: p */
    public int f6180p;

    public C2232d(int i) {
        this.f6169e = 4;
        this.f6171g = C2124f.f5996a;
        this.f6170f = i;
        this.f6179o = true;
    }

    public C2232d(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C2119d[] dVarArr, C2119d[] dVarArr2, boolean z, int i4) {
        this.f6169e = i;
        this.f6170f = i2;
        this.f6171g = i3;
        String str2 = "com.google.android.gms";
        if (str2.equals(str)) {
            this.f6172h = str2;
        } else {
            this.f6172h = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                account2 = C2212a.m5030a(C2242a.m5095a(iBinder));
            }
            this.f6176l = account2;
        } else {
            this.f6173i = iBinder;
            this.f6176l = account;
        }
        this.f6174j = scopeArr;
        this.f6175k = bundle;
        this.f6177m = dVarArr;
        this.f6178n = dVarArr2;
        this.f6179o = z;
        this.f6180p = i4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2480a(parcel, 1, this.f6169e);
        C1061o.m2480a(parcel, 2, this.f6170f);
        C1061o.m2480a(parcel, 3, this.f6171g);
        C1061o.m2485a(parcel, 4, this.f6172h, false);
        C1061o.m2483a(parcel, 5, this.f6173i, false);
        C1061o.m2490a(parcel, 6, (T[]) this.f6174j, i, false);
        C1061o.m2482a(parcel, 7, this.f6175k, false);
        C1061o.m2484a(parcel, 8, (Parcelable) this.f6176l, i, false);
        C1061o.m2490a(parcel, 10, (T[]) this.f6177m, i, false);
        C1061o.m2490a(parcel, 11, (T[]) this.f6178n, i, false);
        C1061o.m2487a(parcel, 12, this.f6179o);
        C1061o.m2480a(parcel, 13, this.f6180p);
        C1061o.m2566n(parcel, a);
    }
}
