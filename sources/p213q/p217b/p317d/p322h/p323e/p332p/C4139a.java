package p213q.p217b.p317d.p322h.p323e.p332p;

import java.io.UnsupportedEncodingException;

/* renamed from: q.b.d.h.e.p.a */
public final class C4139a {

    /* renamed from: a */
    public final byte[] f10019a;

    /* renamed from: b */
    public volatile int f10020b = 0;

    static {
        new C4139a(new byte[0]);
    }

    public C4139a(byte[] bArr) {
        this.f10019a = bArr;
    }

    /* renamed from: a */
    public static C4139a m9568a(String str) {
        try {
            return new C4139a(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4139a)) {
            return false;
        }
        C4139a aVar = (C4139a) obj;
        byte[] bArr = this.f10019a;
        int length = bArr.length;
        byte[] bArr2 = aVar.f10019a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.f10020b;
        if (i == 0) {
            int i2 = r1;
            for (byte b : this.f10019a) {
                i2 = (i2 * 31) + b;
            }
            i = i2 == 0 ? 1 : i2;
            this.f10020b = i;
        }
        return i;
    }
}
