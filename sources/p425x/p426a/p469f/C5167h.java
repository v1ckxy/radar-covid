package p425x.p426a.p469f;

import java.security.AccessController;
import java.security.PrivilegedAction;
import p425x.p426a.p469f.p470i.C5172d;

/* renamed from: x.a.f.h */
public final class C5167h {

    /* renamed from: x.a.f.h$a */
    public static class C5168a implements PrivilegedAction<String> {
        public Object run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            String str = (String) AccessController.doPrivileged(new C5168a());
        } catch (Exception unused) {
            try {
                String.format("%n", new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    public static String m11600a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static byte[] m11601a(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    /* renamed from: b */
    public static String m11602b(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) ((c - 'A') + 97);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    /* renamed from: b */
    public static String m11603b(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int a = C5172d.m11607a(bArr, cArr);
        if (a >= 0) {
            return new String(cArr, 0, a);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }
}
