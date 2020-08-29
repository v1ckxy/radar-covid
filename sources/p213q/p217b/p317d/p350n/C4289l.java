package p213q.p217b.p317d.p350n;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: q.b.d.n.l */
public class C4289l {

    /* renamed from: a */
    public static final byte f10312a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    public static final byte f10313b = Byte.parseByte("00001111", 2);

    /* renamed from: a */
    public String mo10496a() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        array[16] = array[0];
        array[0] = (byte) ((f10313b & array[0]) | f10312a);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
