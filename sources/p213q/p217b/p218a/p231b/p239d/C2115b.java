package p213q.p217b.p218a.p231b.p239d;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.C2254m;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.d.b */
public final class C2115b extends C2258a {
    public static final Creator<C2115b> CREATOR = new C2295s();

    /* renamed from: i */
    public static final C2115b f5974i = new C2115b(0);

    /* renamed from: e */
    public final int f5975e;

    /* renamed from: f */
    public final int f5976f;

    /* renamed from: g */
    public final PendingIntent f5977g;

    /* renamed from: h */
    public final String f5978h;

    public C2115b(int i) {
        this.f5975e = 1;
        this.f5976f = i;
        this.f5977g = null;
        this.f5978h = null;
    }

    public C2115b(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f5975e = i;
        this.f5976f = i2;
        this.f5977g = pendingIntent;
        this.f5978h = str;
    }

    /* renamed from: a */
    public static String m4904a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    /* renamed from: c */
    public final boolean mo7093c() {
        return this.f5976f == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2115b)) {
            return false;
        }
        C2115b bVar = (C2115b) obj;
        return this.f5976f == bVar.f5976f && C1061o.m2546c((Object) this.f5977g, (Object) bVar.f5977g) && C1061o.m2546c((Object) this.f5978h, (Object) bVar.f5978h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5976f), this.f5977g, this.f5978h});
    }

    public final String toString() {
        C2254m d = C1061o.m2550d((Object) this);
        d.mo7283a("statusCode", m4904a(this.f5976f));
        d.mo7283a("resolution", this.f5977g);
        d.mo7283a("message", this.f5978h);
        return d.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2480a(parcel, 1, this.f5975e);
        C1061o.m2480a(parcel, 2, this.f5976f);
        C1061o.m2484a(parcel, 3, (Parcelable) this.f5977g, i, false);
        C1061o.m2485a(parcel, 4, this.f5978h, false);
        C1061o.m2566n(parcel, a);
    }

    public C2115b(int i, PendingIntent pendingIntent) {
        this.f5975e = 1;
        this.f5976f = i;
        this.f5977g = pendingIntent;
        this.f5978h = null;
    }
}
