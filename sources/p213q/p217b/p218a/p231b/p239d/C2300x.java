package p213q.p217b.p218a.p231b.p239d;

import java.lang.ref.WeakReference;

/* renamed from: q.b.a.b.d.x */
public abstract class C2300x extends C2298v {

    /* renamed from: c */
    public static final WeakReference<byte[]> f6280c = new WeakReference<>(null);

    /* renamed from: b */
    public WeakReference<byte[]> f6281b = f6280c;

    public C2300x(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: a */
    public final byte[] mo7316a() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f6281b.get();
            if (bArr == null) {
                bArr = mo7102d();
                this.f6281b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* renamed from: d */
    public abstract byte[] mo7102d();
}
