package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.exposurenotification.ExposureSummary;

/* renamed from: q.b.a.b.g.f.r */
public final class C2855r extends C2851q implements C2847p {
    public C2855r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.exposurenotification.internal.IExposureSummaryCallback");
    }

    /* renamed from: a */
    public final void mo8146a(Status status, ExposureSummary exposureSummary) {
        Parcel a = mo8206a();
        C2860s0.m6663a(a, (Parcelable) status);
        C2860s0.m6663a(a, (Parcelable) exposureSummary);
        mo8207a(1, a);
    }
}
