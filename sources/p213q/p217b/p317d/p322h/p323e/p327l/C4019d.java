package p213q.p217b.p317d.p322h.p323e.p327l;

import java.io.InputStream;
import p213q.p217b.p317d.p322h.p323e.p327l.C4014c.C4018d;

/* renamed from: q.b.d.h.e.l.d */
public class C4019d implements C4018d {

    /* renamed from: a */
    public final /* synthetic */ byte[] f9810a;

    /* renamed from: b */
    public final /* synthetic */ int[] f9811b;

    public C4019d(C4020e eVar, byte[] bArr, int[] iArr) {
        this.f9810a = bArr;
        this.f9811b = iArr;
    }

    /* renamed from: a */
    public void mo10219a(InputStream inputStream, int i) {
        try {
            inputStream.read(this.f9810a, this.f9811b[0], i);
            int[] iArr = this.f9811b;
            iArr[0] = iArr[0] + i;
        } finally {
            inputStream.close();
        }
    }
}
