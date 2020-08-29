package p116io.jsonwebtoken.lang;

/* renamed from: io.jsonwebtoken.lang.Arrays */
public final class Arrays {
    public static byte[] clean(byte[] bArr) {
        if (length(bArr) > 0) {
            return bArr;
        }
        return null;
    }

    public static int length(byte[] bArr) {
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }
}
