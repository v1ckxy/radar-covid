package p423w;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: w.i */
public interface C4896i extends C4882a0, ReadableByteChannel {
    /* renamed from: a */
    int mo11432a(C4905q qVar);

    /* renamed from: a */
    long mo11436a(C4915y yVar);

    /* renamed from: a */
    String mo11438a(Charset charset);

    /* renamed from: b */
    C4897j mo11446b(long j);

    /* renamed from: c */
    boolean mo11447c(long j);

    /* renamed from: d */
    String mo11450d();

    /* renamed from: e */
    byte[] mo11451e();

    /* renamed from: e */
    byte[] mo11452e(long j);

    /* renamed from: f */
    String mo11454f(long j);

    C4892f getBuffer();

    /* renamed from: h */
    void mo11457h(long j);

    /* renamed from: i */
    boolean mo11460i();

    /* renamed from: n */
    long mo11465n();

    /* renamed from: p */
    long mo11467p();

    C4896i peek();

    /* renamed from: q */
    InputStream mo11469q();

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);
}
