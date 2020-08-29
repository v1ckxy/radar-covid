package p213q.p217b.p317d.p322h.p323e.p326k;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: q.b.d.h.e.k.w */
public class C3996w implements Callable<Void> {

    /* renamed from: e */
    public final /* synthetic */ long f9771e;

    /* renamed from: f */
    public final /* synthetic */ C3975t f9772f;

    public C3996w(C3975t tVar, long j) {
        this.f9772f = tVar;
        this.f9771e = j;
    }

    public Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f9771e);
        this.f9772f.f9735r.mo10116a("_ae", bundle);
        return null;
    }
}
