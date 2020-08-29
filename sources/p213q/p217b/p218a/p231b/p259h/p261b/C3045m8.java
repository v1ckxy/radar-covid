package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: q.b.a.b.h.b.m8 */
public final class C3045m8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ AtomicReference f7573e;

    /* renamed from: f */
    public final /* synthetic */ String f7574f;

    /* renamed from: g */
    public final /* synthetic */ String f7575g;

    /* renamed from: h */
    public final /* synthetic */ String f7576h;

    /* renamed from: i */
    public final /* synthetic */ boolean f7577i;

    /* renamed from: j */
    public final /* synthetic */ C3189z9 f7578j;

    /* renamed from: k */
    public final /* synthetic */ C3121t7 f7579k;

    public C3045m8(C3121t7 t7Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z, C3189z9 z9Var) {
        this.f7579k = t7Var;
        this.f7573e = atomicReference;
        this.f7574f = str;
        this.f7575g = str2;
        this.f7576h = str3;
        this.f7577i = z;
        this.f7578j = z9Var;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List a;
        synchronized (this.f7573e) {
            try {
                C3117t3 t3Var = this.f7579k.f7868d;
                if (t3Var == null) {
                    this.f7579k.mo8285i().f7153f.mo8435a("(legacy) Failed to get user properties; not connected to service", C2908b4.m6745a(this.f7574f), this.f7575g, this.f7576h);
                    this.f7573e.set(Collections.emptyList());
                    this.f7573e.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f7574f)) {
                    atomicReference2 = this.f7573e;
                    a = t3Var.mo8501a(this.f7575g, this.f7576h, this.f7577i, this.f7578j);
                } else {
                    atomicReference2 = this.f7573e;
                    a = t3Var.mo8499a(this.f7574f, this.f7575g, this.f7576h, this.f7577i);
                }
                atomicReference2.set(a);
                this.f7579k.mo8722C();
                atomicReference = this.f7573e;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f7579k.mo8285i().f7153f.mo8435a("(legacy) Failed to get user properties; remote exception", C2908b4.m6745a(this.f7574f), this.f7575g, e);
                    this.f7573e.set(Collections.emptyList());
                    atomicReference = this.f7573e;
                } catch (Throwable th) {
                    this.f7573e.notify();
                    throw th;
                }
            }
        }
    }
}
