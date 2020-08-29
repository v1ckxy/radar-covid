package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p240m.C2153e;
import p213q.p217b.p218a.p231b.p239d.p240m.C2153e.C2154a;
import p213q.p217b.p218a.p231b.p239d.p240m.C2155f;
import p213q.p217b.p218a.p231b.p239d.p240m.C2157h;
import p213q.p217b.p218a.p231b.p239d.p240m.C2158i;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2175f0;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2189l0;
import p213q.p217b.p218a.p231b.p251g.p253b.C2323d;

@KeepName
public abstract class BasePendingResult<R extends C2157h> extends C2153e<R> {

    /* renamed from: a */
    public final Object f1065a = new Object();

    /* renamed from: b */
    public final C0192a<R> f1066b = new C0192a<>(Looper.getMainLooper());

    /* renamed from: c */
    public final CountDownLatch f1067c = new CountDownLatch(1);

    /* renamed from: d */
    public final ArrayList<C2154a> f1068d = new ArrayList<>();

    /* renamed from: e */
    public C2158i<? super R> f1069e;

    /* renamed from: f */
    public final AtomicReference<C2175f0> f1070f = new AtomicReference<>();

    /* renamed from: g */
    public R f1071g;

    /* renamed from: h */
    public Status f1072h;

    /* renamed from: i */
    public volatile boolean f1073i;

    /* renamed from: j */
    public boolean f1074j;
    @KeepName
    public C0193b mResultGuardian;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class C0192a<R extends C2157h> extends C2323d {
        public C0192a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                C2158i iVar = (C2158i) pair.first;
                C2157h hVar = (C2157h) pair.second;
                try {
                    iVar.mo7142a(hVar);
                } catch (RuntimeException e) {
                    BasePendingResult.m883c(hVar);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).mo1533b(Status.f1059j);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    public final class C0193b {
        public /* synthetic */ C0193b(C2189l0 l0Var) {
        }

        public final void finalize() {
            BasePendingResult.m883c(BasePendingResult.this.f1071g);
            super.finalize();
        }
    }

    static {
        new C2189l0();
    }

    @Deprecated
    public BasePendingResult() {
        new WeakReference(null);
    }

    /* renamed from: c */
    public static void m883c(C2157h hVar) {
        if (hVar instanceof C2155f) {
            try {
                ((C2155f) hVar).mo7141a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(hVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }

    /* renamed from: a */
    public abstract R mo1529a(Status status);

    /* renamed from: a */
    public final void mo1530a(R r) {
        synchronized (this.f1065a) {
            if (!this.f1074j) {
                mo1531a();
                boolean z = true;
                C1061o.m2534b(!mo1531a(), (Object) "Results have already been set");
                if (this.f1073i) {
                    z = false;
                }
                C1061o.m2534b(z, (Object) "Result has already been consumed");
                mo1534b(r);
                return;
            }
            m883c(r);
        }
    }

    /* renamed from: a */
    public final boolean mo1531a() {
        return this.f1067c.getCount() == 0;
    }

    /* renamed from: b */
    public final R mo1532b() {
        R r;
        synchronized (this.f1065a) {
            C1061o.m2534b(!this.f1073i, (Object) "Result has already been consumed.");
            C1061o.m2534b(mo1531a(), (Object) "Result is not ready.");
            r = this.f1071g;
            this.f1071g = null;
            this.f1069e = null;
            this.f1073i = true;
        }
        C2175f0 f0Var = (C2175f0) this.f1070f.getAndSet(null);
        if (f0Var != null) {
            f0Var.mo7192a(this);
        }
        C1061o.m2524b(r);
        return (C2157h) r;
    }

    @Deprecated
    /* renamed from: b */
    public final void mo1533b(Status status) {
        synchronized (this.f1065a) {
            if (!mo1531a()) {
                mo1530a((R) mo1529a(status));
                this.f1074j = true;
            }
        }
    }

    /* renamed from: b */
    public final void mo1534b(R r) {
        this.f1071g = r;
        this.f1072h = r.getStatus();
        this.f1067c.countDown();
        C2158i<? super R> iVar = this.f1069e;
        if (iVar != null) {
            this.f1066b.removeMessages(2);
            C0192a<R> aVar = this.f1066b;
            C2157h b = mo1532b();
            if (aVar != null) {
                C1061o.m2524b(iVar);
                aVar.sendMessage(aVar.obtainMessage(1, new Pair(iVar, b)));
            } else {
                throw null;
            }
        } else if (this.f1071g instanceof C2155f) {
            this.mResultGuardian = new C0193b(null);
        }
        ArrayList<C2154a> arrayList = this.f1068d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C2154a) obj).mo7140a(this.f1072h);
        }
        this.f1068d.clear();
    }
}
