package p213q.p217b.p301c.p302a.p303c0;

import com.google.crypto.tink.proto.KeyTemplate;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p213q.p217b.p301c.p302a.C3499a;
import p213q.p217b.p301c.p302a.C3855z;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;

/* renamed from: q.b.c.a.c0.i */
public final class C3526i implements C3499a {

    /* renamed from: c */
    public static final byte[] f8912c = new byte[0];

    /* renamed from: a */
    public final KeyTemplate f8913a;

    /* renamed from: b */
    public final C3499a f8914b;

    public C3526i(KeyTemplate keyTemplate, C3499a aVar) {
        this.f8913a = keyTemplate;
        this.f8914b = aVar;
    }

    /* renamed from: a */
    public byte[] mo9453a(byte[] bArr, byte[] bArr2) {
        byte[] byteArray = C3855z.m9217a(this.f8913a).toByteArray();
        byte[] a = this.f8914b.mo9453a(byteArray, f8912c);
        byte[] a2 = ((C3499a) C3855z.m9215a(this.f8913a.getTypeUrl(), C3635j.m8388a(byteArray), C3499a.class)).mo9453a(bArr, bArr2);
        return ByteBuffer.allocate(a.length + 4 + a2.length).putInt(a.length).put(a).put(a2).array();
    }

    /* renamed from: b */
    public byte[] mo9454b(byte[] bArr, byte[] bArr2) {
        String str = "invalid ciphertext";
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException(str);
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((C3499a) C3855z.m9216a(this.f8913a.getTypeUrl(), this.f8914b.mo9454b(bArr3, f8912c), C3499a.class)).mo9454b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException(str, e);
        }
    }
}
