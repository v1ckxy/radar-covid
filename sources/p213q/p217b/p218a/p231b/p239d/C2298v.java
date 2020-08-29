package p213q.p217b.p218a.p231b.p239d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.C2251k0;
import p213q.p217b.p218a.p231b.p239d.p242n.C2253l0;
import p213q.p217b.p218a.p231b.p249e.C2303a;
import p213q.p217b.p218a.p231b.p249e.C2306b;
import p213q.p217b.p218a.p231b.p251g.p254c.C2324a;
import p213q.p217b.p218a.p231b.p251g.p254c.C2326c;

/* renamed from: q.b.a.b.d.v */
public abstract class C2298v extends C2324a implements C2251k0 {

    /* renamed from: a */
    public int f6276a;

    public C2298v(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        C1061o.m2507a(bArr.length == 25);
        this.f6276a = Arrays.hashCode(bArr);
    }

    /* renamed from: a */
    public static C2251k0 m5368a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof C2251k0 ? (C2251k0) queryLocalInterface : new C2253l0(iBinder);
    }

    /* renamed from: a */
    public static byte[] m5369a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final boolean mo7278a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C2303a b = mo7281b();
            parcel2.writeNoException();
            C2326c.m5411a(parcel2, (IInterface) b);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int c = mo7282c();
            parcel2.writeNoException();
            parcel2.writeInt(c);
            return true;
        }
    }

    /* renamed from: a */
    public abstract byte[] mo7316a();

    /* renamed from: b */
    public final C2303a mo7281b() {
        return new C2306b(mo7316a());
    }

    /* renamed from: c */
    public final int mo7282c() {
        return this.f6276a;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C2251k0)) {
            try {
                C2251k0 k0Var = (C2251k0) obj;
                if (k0Var.mo7282c() != this.f6276a) {
                    return false;
                }
                C2303a b = k0Var.mo7281b();
                if (b == null) {
                    return false;
                }
                return Arrays.equals(mo7316a(), (byte[]) C2306b.m5379a(b));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f6276a;
    }
}
