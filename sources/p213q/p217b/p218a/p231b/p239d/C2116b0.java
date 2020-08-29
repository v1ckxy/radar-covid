package p213q.p217b.p218a.p231b.p239d;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;
import javax.annotation.Nullable;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;
import p213q.p217b.p218a.p231b.p249e.C2303a;
import p213q.p217b.p218a.p231b.p249e.C2306b;

/* renamed from: q.b.a.b.d.b0 */
public final class C2116b0 extends C2258a {
    public static final Creator<C2116b0> CREATOR = new C2123e0();

    /* renamed from: e */
    public final String f5979e;
    @Nullable

    /* renamed from: f */
    public final C2298v f5980f;

    /* renamed from: g */
    public final boolean f5981g;

    /* renamed from: h */
    public final boolean f5982h;

    public C2116b0(String str, @Nullable IBinder iBinder, boolean z, boolean z2) {
        this.f5979e = str;
        String str2 = "Could not unwrap certificate";
        String str3 = "GoogleCertificatesQuery";
        C2301y yVar = null;
        if (iBinder != null) {
            try {
                C2303a b = C2298v.m5368a(iBinder).mo7281b();
                byte[] bArr = b == null ? null : (byte[]) C2306b.m5379a(b);
                if (bArr != null) {
                    yVar = new C2301y(bArr);
                } else {
                    Log.e(str3, str2);
                }
            } catch (RemoteException e) {
                Log.e(str3, str2, e);
            }
        }
        this.f5980f = yVar;
        this.f5981g = z;
        this.f5982h = z2;
    }

    public C2116b0(String str, @Nullable C2298v vVar, boolean z, boolean z2) {
        this.f5979e = str;
        this.f5980f = vVar;
        this.f5981g = z;
        this.f5982h = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2485a(parcel, 1, this.f5979e, false);
        C2298v vVar = this.f5980f;
        if (vVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            vVar = null;
        } else if (vVar == null) {
            throw null;
        }
        C1061o.m2483a(parcel, 2, (IBinder) vVar, false);
        C1061o.m2487a(parcel, 3, this.f5981g);
        C1061o.m2487a(parcel, 4, this.f5982h);
        C1061o.m2566n(parcel, a);
    }
}
