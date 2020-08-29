package p213q.p217b.p218a.p231b.p239d.p242n;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.d.n.w */
public final class C2271w extends C2258a {
    public static final Creator<C2271w> CREATOR = new C2270v();

    /* renamed from: e */
    public final int f6232e;

    /* renamed from: f */
    public final Account f6233f;

    /* renamed from: g */
    public final int f6234g;

    /* renamed from: h */
    public final GoogleSignInAccount f6235h;

    public C2271w(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f6232e = i;
        this.f6233f = account;
        this.f6234g = i2;
        this.f6235h = googleSignInAccount;
    }

    public C2271w(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this.f6232e = 2;
        this.f6233f = account;
        this.f6234g = i;
        this.f6235h = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2480a(parcel, 1, this.f6232e);
        C1061o.m2484a(parcel, 2, (Parcelable) this.f6233f, i, false);
        C1061o.m2480a(parcel, 3, this.f6234g);
        C1061o.m2484a(parcel, 4, (Parcelable) this.f6235h, i, false);
        C1061o.m2566n(parcel, a);
    }
}
