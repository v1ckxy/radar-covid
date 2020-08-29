package p213q.p217b.p301c.p302a.p315m0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.C3499a;

/* renamed from: q.b.c.a.m0.l */
public abstract class C3814l implements C3499a {

    /* renamed from: a */
    public final C3810j f9394a;

    /* renamed from: b */
    public final C3810j f9395b;

    public C3814l(byte[] bArr) {
        this.f9394a = mo10043a(bArr, 1);
        this.f9395b = mo10043a(bArr, 0);
    }

    /* renamed from: a */
    public static byte[] m9168a(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i = remaining % 16;
        int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length;
        ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i2);
        order.putLong((long) bArr.length);
        order.putLong((long) remaining);
        return order.array();
    }

    /* renamed from: a */
    public abstract C3810j mo10043a(byte[] bArr, int i);

    /* renamed from: a */
    public byte[] mo9453a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= (Integer.MAX_VALUE - this.f9394a.mo10035a()) - 16) {
            ByteBuffer allocate = ByteBuffer.allocate(this.f9394a.mo10035a() + bArr.length + 16);
            if (allocate.remaining() >= this.f9394a.mo10035a() + bArr.length + 16) {
                int position = allocate.position();
                this.f9394a.mo10039a(allocate, bArr);
                allocate.position(position);
                byte[] bArr3 = new byte[this.f9394a.mo10035a()];
                allocate.get(bArr3);
                allocate.limit(allocate.limit() - 16);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] bArr4 = new byte[32];
                this.f9395b.mo10038a(bArr3, 0).get(bArr4);
                byte[] a = C2286e.m5269a(bArr4, m9168a(bArr2, allocate));
                allocate.limit(allocate.limit() + 16);
                allocate.put(a);
                return allocate.array();
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: b */
    public byte[] mo9454b(byte[] bArr, byte[] bArr2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.remaining() >= this.f9394a.mo10035a() + 16) {
            int position = wrap.position();
            byte[] bArr3 = new byte[16];
            wrap.position(wrap.limit() - 16);
            wrap.get(bArr3);
            wrap.position(position);
            wrap.limit(wrap.limit() - 16);
            byte[] bArr4 = new byte[this.f9394a.mo10035a()];
            wrap.get(bArr4);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr5 = new byte[32];
                this.f9395b.mo10038a(bArr4, 0).get(bArr5);
                if (C2286e.m5301b(C2286e.m5269a(bArr5, m9168a(bArr2, wrap)), bArr3)) {
                    wrap.position(position);
                    return this.f9394a.mo10041a(wrap);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }
}
