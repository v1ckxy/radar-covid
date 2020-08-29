package p213q.p217b.p218a.p231b.p251g.p256e;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: q.b.a.b.g.e.me */
public final class C2571me extends C2675se {

    /* renamed from: a */
    public final AtomicReference<Bundle> f6719a = new AtomicReference<>();

    /* renamed from: b */
    public boolean f6720b;

    /* renamed from: a */
    public static <T> T m6157a(Bundle bundle, Class<T> cls) {
        if (bundle != null) {
            Object obj = bundle.get("r");
            if (obj != null) {
                try {
                    return cls.cast(obj);
                } catch (ClassCastException e) {
                    String canonicalName = cls.getCanonicalName();
                    String canonicalName2 = obj.getClass().getCanonicalName();
                    Object[] objArr = {canonicalName, canonicalName2};
                    String str = "AM";
                    Log.w(str, String.format("Unexpected object type. Expected, Received".concat(": %s, %s"), objArr), e);
                    throw e;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final String mo7873a(long j) {
        return (String) m6157a(mo7875b(j), String.class);
    }

    /* renamed from: a */
    public final void mo7874a(Bundle bundle) {
        synchronized (this.f6719a) {
            try {
                this.f6719a.set(bundle);
                this.f6720b = true;
                this.f6719a.notify();
            } catch (Throwable th) {
                this.f6719a.notify();
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final Bundle mo7875b(long j) {
        Bundle bundle;
        synchronized (this.f6719a) {
            if (!this.f6720b) {
                try {
                    this.f6719a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f6719a.get();
        }
        return bundle;
    }
}
