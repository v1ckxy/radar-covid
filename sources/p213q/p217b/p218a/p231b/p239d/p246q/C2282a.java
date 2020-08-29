package p213q.p217b.p218a.p231b.p239d.p246q;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: q.b.a.b.d.q.a */
public class C2282a {
    /* renamed from: a */
    public static MessageDigest m5136a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
