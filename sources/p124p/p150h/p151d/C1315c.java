package p124p.p150h.p151d;

import android.util.Log;

/* renamed from: p.h.d.c */
public class C1315c implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ Object f3953e;

    /* renamed from: f */
    public final /* synthetic */ Object f3954f;

    public C1315c(Object obj, Object obj2) {
        this.f3953e = obj;
        this.f3954f = obj2;
    }

    public void run() {
        try {
            if (C1311b.f3940d != null) {
                C1311b.f3940d.invoke(this.f3953e, new Object[]{this.f3954f, Boolean.valueOf(false), "AppCompat recreation"});
                return;
            }
            C1311b.f3941e.invoke(this.f3953e, new Object[]{this.f3954f, Boolean.valueOf(false)});
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
