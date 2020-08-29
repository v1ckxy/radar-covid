package p213q.p217b.p218a.p231b.p267j.p268b;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p213q.p217b.p218a.p231b.p239d.C2115b;
import p213q.p217b.p218a.p231b.p251g.p253b.C2320a;
import p213q.p217b.p218a.p231b.p251g.p253b.C2322c;

/* renamed from: q.b.a.b.j.b.g */
public abstract class C3224g extends C2320a implements C3221d {
    public C3224g() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* renamed from: a */
    public final boolean mo7194a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                C2115b bVar = (C2115b) C2322c.m5405a(parcel, C2115b.CREATOR);
                C3220c cVar = (C3220c) C2322c.m5405a(parcel, C3220c.CREATOR);
                break;
            case 4:
            case 6:
                Status status = (Status) C2322c.m5405a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status2 = (Status) C2322c.m5405a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) C2322c.m5405a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                mo7146a((C3231n) C2322c.m5405a(parcel, C3231n.CREATOR));
                break;
            case 9:
                C3225h hVar = (C3225h) C2322c.m5405a(parcel, C3225h.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
