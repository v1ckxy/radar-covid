package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import java.util.List;
import p124p.p199y.C1795g;
import p124p.p199y.C1800l;
import p124p.p199y.C1803n;
import p124p.p199y.C1803n.C1804a;
import p124p.p199y.p200x.C1829g;
import p124p.p199y.p200x.C1842l;

public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f1010a = C1800l.m4459a("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            C1800l.m4460a().mo6782a(f1010a, "Requesting diagnostics", new Throwable[0]);
            try {
                C1842l a = C1842l.m4517a(context);
                C1803n nVar = (C1803n) new C1804a(DiagnosticsWorker.class).mo6794a();
                if (a != null) {
                    List singletonList = Collections.singletonList(nVar);
                    if (!singletonList.isEmpty()) {
                        C1829g gVar = new C1829g(a, null, C1795g.KEEP, singletonList, null);
                        gVar.mo6812a();
                        return;
                    }
                    throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
                }
                throw null;
            } catch (IllegalStateException e) {
                C1800l.m4460a().mo6783b(f1010a, "WorkManager is not initialized", e);
            }
        }
    }
}
