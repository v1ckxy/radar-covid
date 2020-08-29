package p423w;

import java.nio.channels.WritableByteChannel;

/* renamed from: w.h */
public interface C4895h extends C4915y, WritableByteChannel {
    /* renamed from: a */
    long mo11435a(C4882a0 a0Var);

    /* renamed from: a */
    C4895h mo11439a(long j);

    /* renamed from: a */
    C4895h mo11440a(String str);

    /* renamed from: a */
    C4895h mo11443a(C4897j jVar);

    void flush();

    C4892f getBuffer();

    /* renamed from: i */
    C4895h mo11459i(long j);

    /* renamed from: l */
    C4895h mo11463l();

    C4895h write(byte[] bArr);

    C4895h write(byte[] bArr, int i, int i2);

    C4895h writeByte(int i);

    C4895h writeInt(int i);

    C4895h writeShort(int i);
}
