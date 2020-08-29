package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: q.b.a.b.h.b.k8 */
public final class C3020k8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ AtomicReference f7492e;

    /* renamed from: f */
    public final /* synthetic */ String f7493f;

    /* renamed from: g */
    public final /* synthetic */ String f7494g;

    /* renamed from: h */
    public final /* synthetic */ String f7495h;

    /* renamed from: i */
    public final /* synthetic */ C3189z9 f7496i;

    /* renamed from: j */
    public final /* synthetic */ C3121t7 f7497j;

    public C3020k8(C3121t7 t7Var, AtomicReference atomicReference, String str, String str2, String str3, C3189z9 z9Var) {
        this.f7497j = t7Var;
        this.f7492e = atomicReference;
        this.f7493f = str;
        this.f7494g = str2;
        this.f7495h = str3;
        this.f7496i = z9Var;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List a;
        synchronized (this.f7492e) {
            try {
                C3117t3 t3Var = this.f7497j.f7868d;
                if (t3Var == null) {
                    this.f7497j.mo8285i().f7153f.mo8435a("(legacy) Failed to get conditional properties; not connected to service", C2908b4.m6745a(this.f7493f), this.f7494g, this.f7495h);
                    this.f7492e.set(Collections.emptyList());
                    this.f7492e.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f7493f)) {
                    atomicReference2 = this.f7492e;
                    a = t3Var.mo8500a(this.f7494g, this.f7495h, this.f7496i);
                } else {
                    atomicReference2 = this.f7492e;
                    a = t3Var.mo8498a(this.f7493f, this.f7494g, this.f7495h);
                }
                atomicReference2.set(a);
                this.f7497j.mo8722C();
                atomicReference = this.f7492e;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f7497j.mo8285i().f7153f.mo8435a("(legacy) Failed to get conditional properties; remote exception", C2908b4.m6745a(this.f7493f), this.f7494g, e);
                    this.f7492e.set(Collections.emptyList());
                    atomicReference = this.f7492e;
                } catch (Throwable th) {
                    this.f7492e.notify();
                    throw th;
                }
            }
        }
    }
}
