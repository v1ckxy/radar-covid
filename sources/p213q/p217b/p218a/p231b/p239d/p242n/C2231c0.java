package p213q.p217b.p218a.p231b.p239d.p242n;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.C2119d;

/* renamed from: q.b.a.b.d.n.c0 */
public final class C2231c0 implements Creator<C2232d> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C1061o.m2522b(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        C2119d[] dVarArr = null;
        C2119d[] dVarArr2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C1061o.m2561i(parcel2, readInt);
                    break;
                case 2:
                    i2 = C1061o.m2561i(parcel2, readInt);
                    break;
                case 3:
                    i3 = C1061o.m2561i(parcel2, readInt);
                    break;
                case 4:
                    str = C1061o.m2548d(parcel2, readInt);
                    break;
                case 5:
                    iBinder = C1061o.m2560h(parcel2, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) C1061o.m2537b(parcel2, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C1061o.m2457a(parcel2, readInt);
                    break;
                case 8:
                    account = (Account) C1061o.m2458a(parcel2, readInt, Account.CREATOR);
                    break;
                case 10:
                    dVarArr = (C2119d[]) C1061o.m2537b(parcel2, readInt, C2119d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (C2119d[]) C1061o.m2537b(parcel2, readInt, C2119d.CREATOR);
                    break;
                case 12:
                    z = C1061o.m2559g(parcel2, readInt);
                    break;
                case 13:
                    i4 = C1061o.m2561i(parcel2, readInt);
                    break;
                default:
                    C1061o.m2564l(parcel2, readInt);
                    break;
            }
        }
        C1061o.m2557f(parcel2, b);
        C2232d dVar = new C2232d(i, i2, i3, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z, i4);
        return dVar;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2232d[i];
    }
}
