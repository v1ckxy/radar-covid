package p425x.p426a.p427a;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* renamed from: x.a.a.b2 */
public class C4924b2 {

    /* renamed from: a */
    public static final long f11725a = Runtime.getRuntime().maxMemory();

    /* renamed from: a */
    public static int m11131a(int i) {
        int i2 = 1;
        if (i > 127) {
            int i3 = 1;
            while (true) {
                i >>>= 8;
                if (i == 0) {
                    break;
                }
                i3++;
            }
            for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static int m11132a(InputStream inputStream) {
        if (inputStream instanceof C5007z1) {
            return ((C5007z1) inputStream).f11898f;
        }
        if (inputStream instanceof C4955j) {
            return ((C4955j) inputStream).f11838e;
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) inputStream).available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                FileChannel channel = ((FileInputStream) inputStream).getChannel();
                long size = channel != null ? channel.size() : 2147483647L;
                if (size < 2147483647L) {
                    return (int) size;
                }
            } catch (IOException unused) {
            }
        }
        long j = f11725a;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    /* renamed from: b */
    public static int m11133b(int i) {
        if (i < 31) {
            return 1;
        }
        if (i < 128) {
            return 2;
        }
        byte[] bArr = new byte[5];
        int i2 = 4;
        do {
            i >>= 7;
            i2--;
            bArr[i2] = (byte) ((i & 127) | 128);
        } while (i > 127);
        return 1 + (5 - i2);
    }
}
