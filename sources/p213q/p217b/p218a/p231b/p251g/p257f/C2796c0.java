package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey;
import java.util.List;

/* renamed from: q.b.a.b.g.f.c0 */
public final class C2796c0 extends C2851q implements C2788a0 {
    public C2796c0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.exposurenotification.internal.ITemporaryExposureKeyListCallback");
    }

    /* renamed from: a */
    public final void mo8136a(Status status, List<TemporaryExposureKey> list) {
        Parcel a = mo8206a();
        C2860s0.m6663a(a, (Parcelable) status);
        a.writeTypedList(list);
        mo8207a(1, a);
    }
}
