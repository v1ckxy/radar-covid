package p213q.p217b.p218a.p231b.p239d.p242n;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.d.n.v */
public final class C2270v implements Creator<C2271w> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C1061o.m2522b(parcel);
        Account account = null;
        int i = 0;
        int i2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = C1061o.m2561i(parcel, readInt);
            } else if (i3 == 2) {
                account = (Account) C1061o.m2458a(parcel, readInt, Account.CREATOR);
            } else if (i3 == 3) {
                i2 = C1061o.m2561i(parcel, readInt);
            } else if (i3 != 4) {
                C1061o.m2564l(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C1061o.m2458a(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        C1061o.m2557f(parcel, b);
        return new C2271w(i, account, i2, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2271w[i];
    }
}
