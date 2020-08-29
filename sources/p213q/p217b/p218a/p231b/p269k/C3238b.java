package p213q.p217b.p218a.p231b.p269k;

import android.util.Log;

/* renamed from: q.b.a.b.k.b */
public final class C3238b implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C3237a f8111e;

    public C3238b(C3237a aVar) {
        this.f8111e = aVar;
    }

    public final void run() {
        C3237a aVar = this.f8111e;
        if (aVar.f8101b.isHeld()) {
            try {
                aVar.f8101b.release();
            } catch (RuntimeException e) {
                if (e.getClass().equals(RuntimeException.class)) {
                    Log.e("WakeLock", String.valueOf(aVar.f8104e).concat(" was already released!"), e);
                } else {
                    throw e;
                }
            }
            aVar.f8101b.isHeld();
        }
    }
}
