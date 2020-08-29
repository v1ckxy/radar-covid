package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker.C0177a;
import androidx.work.ListenableWorker.C0177a.C0180c;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class CombineContinuationsWorker extends Worker {
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: e */
    public C0177a mo1455e() {
        return new C0180c(this.f979f.f986b);
    }
}
