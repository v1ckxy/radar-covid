package p119o.p120a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: o.a.s */
public class C0975s {

    /* renamed from: b */
    public static final AtomicIntegerFieldUpdater f2590b = AtomicIntegerFieldUpdater.newUpdater(C0975s.class, "_handled");
    public volatile int _handled;

    /* renamed from: a */
    public final Throwable f2591a;

    public C0975s(Throwable th, boolean z) {
        this.f2591a = th;
        this._handled = z ? 1 : 0;
    }

    public /* synthetic */ C0975s(Throwable th, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        this.f2591a = th;
        this._handled = z ? 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append(this.f2591a);
        sb.append(']');
        return sb.toString();
    }
}
