package p119o.p120a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p392u.p395p.C4580d;

/* renamed from: o.a.k */
public final class C0948k extends C0975s {

    /* renamed from: c */
    public static final AtomicIntegerFieldUpdater f2566c = AtomicIntegerFieldUpdater.newUpdater(C0948k.class, "_resumed");
    public volatile int _resumed;

    public C0948k(C4580d<?> dVar, Throwable th, boolean z) {
        if (th == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Continuation ");
            sb.append(dVar);
            sb.append(" was cancelled normally");
            th = new CancellationException(sb.toString());
        }
        super(th, z);
        this._resumed = 0;
    }
}
