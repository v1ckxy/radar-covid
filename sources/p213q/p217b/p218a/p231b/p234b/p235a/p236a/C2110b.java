package p213q.p217b.p218a.p231b.p234b.p235a.p236a;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.List;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.b.a.a.b */
public final class C2110b implements Creator<GoogleSignInAccount> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C1061o.m2522b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        List list = null;
        String str7 = null;
        String str8 = null;
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C1061o.m2561i(parcel2, readInt);
                    break;
                case 2:
                    str = C1061o.m2548d(parcel2, readInt);
                    break;
                case 3:
                    str2 = C1061o.m2548d(parcel2, readInt);
                    break;
                case 4:
                    str3 = C1061o.m2548d(parcel2, readInt);
                    break;
                case 5:
                    str4 = C1061o.m2548d(parcel2, readInt);
                    break;
                case 6:
                    uri = (Uri) C1061o.m2458a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str5 = C1061o.m2548d(parcel2, readInt);
                    break;
                case 8:
                    j = C1061o.m2562j(parcel2, readInt);
                    break;
                case 9:
                    str6 = C1061o.m2548d(parcel2, readInt);
                    break;
                case 10:
                    list = C1061o.m2539c(parcel2, readInt, Scope.CREATOR);
                    break;
                case 11:
                    str7 = C1061o.m2548d(parcel2, readInt);
                    break;
                case 12:
                    str8 = C1061o.m2548d(parcel2, readInt);
                    break;
                default:
                    C1061o.m2564l(parcel2, readInt);
                    break;
            }
        }
        C1061o.m2557f(parcel2, b);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, list, str7, str8);
        return googleSignInAccount;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
