package p425x.p472b.p473a.p474a.p476l.p477k;

import org.dpppt.android.sdk.internal.backend.models.GaenRequest;
import org.dpppt.android.sdk.internal.backend.models.GaenSecondDay;
import p484y.C5264d;
import p484y.p488j0.C5305a;
import p484y.p488j0.C5312h;
import p484y.p488j0.C5313i;
import p484y.p488j0.C5316l;

/* renamed from: x.b.a.a.l.k.f */
public interface C5212f {
    @C5313i({"Accept: application/json"})
    @C5316l("v1/gaen/exposed")
    /* renamed from: a */
    C5264d<Void> mo11955a(@C5305a GaenRequest gaenRequest, @C5312h("Authorization") String str);

    @C5313i({"Accept: application/json"})
    @C5316l("v1/gaen/exposednextday")
    /* renamed from: a */
    C5264d<Void> mo11956a(@C5305a GaenSecondDay gaenSecondDay, @C5312h("Authorization") String str);
}
