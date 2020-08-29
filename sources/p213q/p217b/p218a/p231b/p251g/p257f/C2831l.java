package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: q.b.a.b.g.f.l */
public final class C2831l extends C2851q implements C2823j {
    public C2831l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.exposurenotification.internal.IBooleanCallback");
    }

    /* renamed from: a */
    public final void mo8139a(Status status, boolean z) {
        Parcel a = mo8206a();
        C2860s0.m6663a(a, (Parcelable) status);
        a.writeInt(z ? 1 : 0);
        mo8207a(1, a);
    }
}
