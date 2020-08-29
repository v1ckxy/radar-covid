package p119o.p120a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Locale;
import org.dpppt.android.sdk.models.DayDate;
import p116io.jsonwebtoken.lang.Objects;
import p116io.jsonwebtoken.lang.Strings;
import p119o.p120a.p121a.C0909n;
import p119o.p120a.p121a.C0911p;
import p124p.p150h.p161k.C1381a;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.C2119d;
import p213q.p217b.p218a.p231b.p239d.C2121e;
import p213q.p217b.p218a.p231b.p239d.C2124f;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2190m;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2190m.C2191a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p251g.p257f.C2842n2;
import p213q.p217b.p218a.p231b.p251g.p257f.C2862s2;
import p213q.p217b.p218a.p231b.p262i.C3216e;
import p213q.p217b.p218a.p231b.p270l.C3247e;
import p213q.p217b.p218a.p231b.p270l.C3249f;
import p213q.p217b.p218a.p231b.p270l.C3250f0;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p213q.p217b.p218a.p231b.p270l.C3259k;
import p392u.C4557i;
import p392u.C4560l;
import p392u.p395p.C4580d;
import p392u.p395p.p396j.C4590a;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p402b.C4622p;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4645o;
import p392u.p409w.C4681g;
import p410v.p411m0.C4737b;
import p423w.C4882a0;
import p423w.C4886b0;
import p423w.C4888c;
import p423w.C4890d;
import p423w.C4892f;
import p423w.C4895h;
import p423w.C4896i;
import p423w.C4904p;
import p423w.C4907r;
import p423w.C4909t;
import p423w.C4910u;
import p423w.C4915y;
import p423w.C4916z;
import p425x.p426a.p427a.C4921b;
import p425x.p426a.p427a.C4929d;
import p425x.p426a.p427a.C4967n;
import p425x.p426a.p427a.C4971o;
import p425x.p426a.p427a.C4986t;
import p425x.p426a.p427a.C4996w;
import p425x.p426a.p427a.C4997w0;
import p425x.p426a.p427a.C5003y0;
import p425x.p426a.p427a.p428c2.C4928a;
import p425x.p426a.p427a.p429d2.C4932a;
import p425x.p426a.p427a.p430e2.C4936a;
import p425x.p426a.p427a.p431f2.C4941a;
import p425x.p426a.p427a.p432g2.C4945a;
import p425x.p426a.p427a.p432g2.C4946b;
import p425x.p426a.p427a.p433h2.C4950a;
import p425x.p426a.p427a.p433h2.C4951b;
import p425x.p426a.p434b.C5008a;
import p425x.p426a.p434b.p435c.C5012c;
import p425x.p426a.p434b.p435c.C5013d;
import p425x.p426a.p434b.p435c.C5014e;
import p425x.p426a.p434b.p435c.C5015f;
import p425x.p426a.p434b.p435c.C5016g;
import p425x.p426a.p434b.p436d.C5018a;
import p425x.p426a.p445e.p446a.C5031e;
import p425x.p426a.p445e.p446a.C5034h;
import p425x.p426a.p445e.p446a.C5035i;
import p425x.p426a.p445e.p446a.C5036j;
import p425x.p426a.p445e.p446a.C5037k;
import p425x.p426a.p445e.p446a.C5038l;
import p425x.p426a.p445e.p446a.C5039m;
import p425x.p426a.p445e.p446a.C5040n;
import p425x.p426a.p445e.p447b.p448a.C5043c;
import p425x.p426a.p445e.p447b.p448a.C5044d;
import p425x.p426a.p445e.p447b.p448a.C5049h;
import p425x.p426a.p445e.p447b.p448a.C5051i;
import p425x.p426a.p445e.p447b.p450c.C5061a;
import p425x.p426a.p445e.p447b.p450c.C5062b;
import p425x.p426a.p445e.p447b.p451d.C5063a;
import p425x.p426a.p445e.p447b.p451d.C5064b;
import p425x.p426a.p445e.p447b.p453f.C5067b;
import p425x.p426a.p445e.p447b.p453f.C5068c;
import p425x.p426a.p445e.p447b.p454g.C5078b;
import p425x.p426a.p445e.p447b.p455h.C5079a;
import p425x.p426a.p445e.p447b.p455h.C5080b;
import p425x.p426a.p445e.p447b.p455h.C5084f;
import p425x.p426a.p445e.p447b.p455h.C5085g;
import p425x.p426a.p445e.p447b.p455h.C5085g.C5087b;
import p425x.p426a.p445e.p447b.p455h.C5088h;
import p425x.p426a.p445e.p447b.p455h.C5089i;
import p425x.p426a.p445e.p447b.p455h.C5089i.C5091b;
import p425x.p426a.p445e.p447b.p455h.C5095k;
import p425x.p426a.p445e.p447b.p455h.C5098n;
import p425x.p426a.p445e.p447b.p455h.C5099o;
import p425x.p426a.p445e.p447b.p455h.C5099o.C5100a;
import p425x.p426a.p445e.p447b.p455h.C5103r;
import p425x.p426a.p445e.p447b.p455h.C5104s;
import p425x.p426a.p445e.p447b.p455h.C5104s.C5106b;
import p425x.p426a.p445e.p447b.p455h.C5107t;
import p425x.p426a.p445e.p447b.p455h.C5110u;
import p425x.p426a.p445e.p447b.p455h.C5112w;
import p425x.p426a.p445e.p447b.p455h.C5113x;
import p425x.p426a.p445e.p447b.p455h.C5113x.C5115b;
import p425x.p426a.p445e.p447b.p455h.C5116y;
import p425x.p426a.p445e.p447b.p455h.C5119z;
import p425x.p426a.p445e.p467d.p468a.C5155a;
import p425x.p426a.p445e.p467d.p468a.C5156b;
import p425x.p426a.p445e.p467d.p468a.C5159e;
import p425x.p472b.p473a.p474a.C5182f;
import p425x.p472b.p473a.p474a.p476l.p479m.C5229g;
import p425x.p472b.p473a.p474a.p476l.p480n.C5241l;
import p425x.p472b.p473a.p474a.p476l.p480n.C5242m;

/* renamed from: o.a.p0 */
public final class C0967p0 {
    /* renamed from: a */
    public static int m2167a(int i) {
        int i2 = -1;
        while (i != 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: a */
    public static int m2168a(int i, int i2) {
        if (i2 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (m2167a(i) >= m2167a(i2)) {
            i ^= i2 << (m2167a(i) - m2167a(i2));
        }
        return i;
    }

    /* renamed from: a */
    public static int m2169a(int i, int i2, int i3) {
        int a = m2168a(i, i3);
        int a2 = m2168a(i2, i3);
        int i4 = 0;
        if (a2 != 0) {
            int a3 = 1 << m2167a(i3);
            while (a != 0) {
                if (((byte) (a & 1)) == 1) {
                    i4 ^= a2;
                }
                a >>>= 1;
                a2 <<= 1;
                if (a2 >= a3) {
                    a2 ^= i3;
                }
            }
        }
        return i4;
    }

    /* renamed from: a */
    public static int m2170a(long j) {
        return ((int) ((((j / 1000) / 60) / 60) / 24)) * 24 * 6;
    }

    /* renamed from: a */
    public static int m2172a(DayDate dayDate) {
        return m2170a(dayDate.getStartOfDayTimestamp());
    }

    /* renamed from: a */
    public static int m2173a(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        return ((bArr[i3 + 1] & 255) << 24) | b | ((bArr[i3] & 255) << 16);
    }

    /* renamed from: a */
    public static long m2176a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = 0;
            for (int i3 = i; i3 < i + i2; i3++) {
                j = (j << 8) | ((long) (bArr[i3] & 255));
            }
            return j;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: a */
    public static Object m2179a(byte[] bArr, Class cls) {
        C5119z zVar = new C5119z(cls, new ByteArrayInputStream(bArr));
        Object readObject = zVar.readObject();
        if (zVar.available() != 0) {
            throw new IOException("unexpected data found at end of ObjectInputStream");
        } else if (cls.isInstance(readObject)) {
            return readObject;
        } else {
            throw new IOException("unexpected class found in ObjectInputStream");
        }
    }

    /* renamed from: a */
    public static /* synthetic */ C0949k0 m2181a(C0916a1 a1Var, boolean z, boolean z2, C4618l lVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return a1Var.mo4206a(z, z2, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
    }

    /* renamed from: a */
    public static final void m2194a(int i, String str, Throwable th) {
        int min;
        if (str != null) {
            int i2 = 5;
            if (i != 5) {
                i2 = 3;
            }
            if (th != null) {
                StringBuilder b = C1965a.m4763b(str, "\n");
                b.append(Log.getStackTraceString(th));
                str = b.toString();
            }
            int length = str.length();
            int i3 = 0;
            while (i3 < length) {
                int a = C4681g.m10302a((CharSequence) str, 10, i3, false, 4);
                if (a == -1) {
                    a = length;
                }
                while (true) {
                    min = Math.min(a, i3 + 4000);
                    String substring = str.substring(i3, min);
                    C4638h.m10270a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i2, "OkHttp", substring);
                    if (min >= a) {
                        break;
                    }
                    i3 = min;
                }
                i3 = min + 1;
            }
            return;
        }
        C4638h.m10271a("message");
        throw null;
    }

    /* renamed from: a */
    public static void m2195a(int i, C5008a aVar) {
        aVar.mo11661a((byte) (i >>> 24));
        aVar.mo11661a((byte) (i >>> 16));
        aVar.mo11661a((byte) (i >>> 8));
        aVar.mo11661a((byte) i);
    }

    /* renamed from: a */
    public static void m2196a(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) i;
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i5] = (byte) (i >>> 24);
    }

    /* renamed from: a */
    public static final void m2197a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sb = new StringBuilder();
            sb.append("size=");
            sb.append(j);
            sb.append(" offset=");
            sb.append(j2);
            sb.append(" byteCount=");
            sb.append(j3);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m2198a(long j, byte[] bArr, int i) {
        m2233b((int) (j >>> 32), bArr, i);
        m2233b((int) (j & 4294967295L), bArr, i + 4);
    }

    /* renamed from: a */
    public static final <R, T> void m2204a(C4622p<? super R, ? super C4580d<? super T>, ? extends Object> pVar, R r, C4580d<? super T> dVar) {
        try {
            C0937g0.m2094a(C2286e.m5218a(C2286e.m5219a(pVar, r, dVar)), C4560l.f10773a);
        } catch (Throwable th) {
            dVar.mo4217a(C2286e.m5184a(th));
        }
    }

    /* renamed from: a */
    public static void m2205a(byte[] bArr, C5008a aVar) {
        aVar.mo11662a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static void m2206a(byte[] bArr, byte[] bArr2, int i) {
        if (bArr == null) {
            throw new NullPointerException("dst == null");
        } else if (bArr2 == null) {
            throw new NullPointerException("src == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        } else if (bArr2.length + i <= bArr.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                bArr[i + i2] = bArr2[i2];
            }
        } else {
            throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
    }

    /* renamed from: a */
    public static boolean m2207a(int i, long j) {
        if (j >= 0) {
            return j < (1 << i);
        }
        throw new IllegalStateException("index must not be negative");
    }

    /* renamed from: a */
    public static boolean m2211a(int[] iArr, int[] iArr2) {
        if (iArr.length != iArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = iArr.length - 1; length >= 0; length--) {
            z &= iArr[length] == iArr2[length];
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m2212a(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z &= sArr[length] == sArr2[length];
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m2213a(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z &= m2212a(sArr[length], sArr2[length]);
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m2214a(short[][][] sArr, short[][][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z &= m2213a(sArr[length], sArr2[length]);
        }
        return z;
    }

    /* renamed from: a */
    public static byte[] m2215a(long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((int) j);
            j >>>= 8;
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m2216a(String str) {
        return Base64.decode(str, 2);
    }

    /* renamed from: a */
    public static byte[] m2217a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    /* renamed from: a */
    public static byte[] m2218a(byte[] bArr, byte[] bArr2) {
        Object clone;
        if (bArr == null) {
            clone = bArr2.clone();
        } else if (bArr2 == null) {
            clone = bArr.clone();
        } else {
            byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            return bArr3;
        }
        return (byte[]) clone;
    }

    /* renamed from: a */
    public static int[] m2219a(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* renamed from: a */
    public static short[] m2220a(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    /* renamed from: a */
    public static byte[][] m2221a(byte[][] bArr) {
        if (!m2245c(bArr)) {
            byte[][] bArr2 = new byte[bArr.length][];
            for (int i = 0; i < bArr.length; i++) {
                bArr2[i] = new byte[bArr[i].length];
                System.arraycopy(bArr[i], 0, bArr2[i], 0, bArr[i].length);
            }
            return bArr2;
        }
        throw new NullPointerException("in has null pointers");
    }

    /* renamed from: a */
    public static byte[][] m2222a(short[][] sArr) {
        int length = sArr.length;
        int[] iArr = new int[2];
        iArr[1] = sArr[0].length;
        iArr[0] = length;
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, iArr);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                bArr[i][i2] = (byte) sArr[i][i2];
            }
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[][][] m2223a(short[][][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        int[] iArr = new int[3];
        iArr[2] = sArr[0][0].length;
        iArr[1] = length2;
        iArr[0] = length;
        byte[][][] bArr = (byte[][][]) Array.newInstance(byte.class, iArr);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                for (int i3 = 0; i3 < sArr[0][0].length; i3++) {
                    bArr[i][i2][i3] = (byte) sArr[i][i2][i3];
                }
            }
        }
        return bArr;
    }

    /* renamed from: a */
    public static short[][][] m2224a(byte[][][] bArr) {
        int length = bArr.length;
        int length2 = bArr[0].length;
        int[] iArr = new int[3];
        iArr[2] = bArr[0][0].length;
        iArr[1] = length2;
        iArr[0] = length;
        short[][][] sArr = (short[][][]) Array.newInstance(short.class, iArr);
        for (int i = 0; i < bArr.length; i++) {
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                for (int i3 = 0; i3 < bArr[0][0].length; i3++) {
                    sArr[i][i2][i3] = (short) (bArr[i][i2][i3] & 255);
                }
            }
        }
        return sArr;
    }

    /* renamed from: b */
    public static int m2225b(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
    }

    /* renamed from: b */
    public static int m2226b(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ iArr[length];
        }
    }

    /* renamed from: b */
    public static int m2227b(short[][] sArr) {
        int i = 0;
        for (int i2 = 0; i2 != sArr.length; i2++) {
            i = (i * 257) + m2242c(sArr[i2]);
        }
        return i;
    }

    /* renamed from: b */
    public static int m2228b(short[][][] sArr) {
        int i = 0;
        for (int i2 = 0; i2 != sArr.length; i2++) {
            i = (i * 257) + m2227b(sArr[i2]);
        }
        return i;
    }

    /* renamed from: b */
    public static String m2229b(int i) {
        if (i == 5) {
            return "qTESLA-p-I";
        }
        if (i == 6) {
            return "qTESLA-p-III";
        }
        throw new IllegalArgumentException(C1965a.m4761b("unknown security category: ", i));
    }

    /* renamed from: b */
    public static C4950a m2232b(String str) {
        if (str.equals("SHA-1")) {
            return new C4950a(C4941a.f11794a, C4997w0.f11880e);
        }
        if (str.equals("SHA-224")) {
            return new C4950a(C4936a.f11781f, C4997w0.f11880e);
        }
        if (str.equals("SHA-256")) {
            return new C4950a(C4936a.f11778c, C4997w0.f11880e);
        }
        if (str.equals("SHA-384")) {
            return new C4950a(C4936a.f11779d, C4997w0.f11880e);
        }
        if (str.equals("SHA-512")) {
            return new C4950a(C4936a.f11780e, C4997w0.f11880e);
        }
        throw new IllegalArgumentException(C1965a.m4751a("unrecognised digest algorithm: ", str));
    }

    /* renamed from: b */
    public static void m2233b(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    /* renamed from: b */
    public static final void m2235b(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (bArr == null) {
            C4638h.m10271a("src");
            throw null;
        } else if (bArr2 != null) {
            System.arraycopy(bArr, i, bArr2, i2, i3);
        } else {
            C4638h.m10271a("dest");
            throw null;
        }
    }

    /* renamed from: b */
    public static byte[] m2236b(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: b */
    public static byte[] m2238b(short[] sArr) {
        byte[] bArr = new byte[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            bArr[i] = (byte) sArr[i];
        }
        return bArr;
    }

    /* renamed from: b */
    public static short[][] m2239b(byte[][] bArr) {
        int length = bArr.length;
        int[] iArr = new int[2];
        iArr[1] = bArr[0].length;
        iArr[0] = length;
        short[][] sArr = (short[][]) Array.newInstance(short.class, iArr);
        for (int i = 0; i < bArr.length; i++) {
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                sArr[i][i2] = (short) (bArr[i][i2] & 255);
            }
        }
        return sArr;
    }

    /* renamed from: c */
    public static int m2240c(int i) {
        int i2 = 0;
        while (true) {
            i >>= 1;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    /* renamed from: c */
    public static int m2241c(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    /* renamed from: c */
    public static int m2242c(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        int length = sArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ (sArr[length] & 255);
        }
    }

    /* renamed from: c */
    public static C4967n m2243c(String str) {
        if (str.equals("SHA-256")) {
            return C4936a.f11778c;
        }
        if (str.equals("SHA-512")) {
            return C4936a.f11780e;
        }
        if (str.equals("SHAKE128")) {
            return C4936a.f11784i;
        }
        if (str.equals("SHAKE256")) {
            return C4936a.f11785j;
        }
        throw new IllegalArgumentException(C1965a.m4751a("unrecognized digest: ", str));
    }

    /* renamed from: c */
    public static void m2244c(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    /* renamed from: c */
    public static boolean m2245c(byte[][] bArr) {
        if (bArr == null) {
            return true;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static byte[] m2246c(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("src == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("length hast to be >= 0");
        } else if (i + i2 <= bArr.length) {
            byte[] bArr2 = new byte[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                bArr2[i3] = bArr[i + i3];
            }
            return bArr2;
        } else {
            throw new IllegalArgumentException("offset + length must not be greater then size of source array");
        }
    }

    /* renamed from: c */
    public static short[] m2247c(byte[] bArr) {
        short[] sArr = new short[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            sArr[i] = (short) (bArr[i] & 255);
        }
        return sArr;
    }

    /* renamed from: d */
    public static int m2248d(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    /* renamed from: d */
    public static long m2249d(byte[] bArr, int i) {
        return ((((long) m2241c(bArr, i + 4)) & 4294967295L) << 32) | (((long) m2241c(bArr, i)) & 4294967295L);
    }

    /* renamed from: d */
    public static PublicKey m2250d(String str) {
        return KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(m2216a(new String(m2216a(str)).replaceAll("-+(BEGIN|END) PUBLIC KEY-+", Objects.EMPTY_STRING).trim())));
    }

    /* renamed from: e */
    public static final String m2251e(String str) {
        String str2 = null;
        if (str != null) {
            int i = 0;
            int i2 = -1;
            if (C4681g.m10318a((CharSequence) str, (CharSequence) ":", false, 2)) {
                InetAddress a = (!C4681g.m10327b(str, "[", false, 2) || !C4681g.m10323a(str, "]", false, 2)) ? m2180a(str, 0, str.length()) : m2180a(str, 1, str.length() - 1);
                if (a == null) {
                    return null;
                }
                byte[] address = a.getAddress();
                if (address.length == 16) {
                    C4638h.m10270a((Object) address, "address");
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < address.length) {
                        int i5 = i3;
                        while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                            i5 += 2;
                        }
                        int i6 = i5 - i3;
                        if (i6 > i4 && i6 >= 4) {
                            i2 = i3;
                            i4 = i6;
                        }
                        i3 = i5 + 2;
                    }
                    C4892f fVar = new C4892f();
                    while (i < address.length) {
                        if (i == i2) {
                            fVar.writeByte(58);
                            i += i4;
                            if (i == 16) {
                                fVar.writeByte(58);
                            }
                        } else {
                            if (i > 0) {
                                fVar.writeByte(58);
                            }
                            fVar.mo11439a((long) ((C4737b.m10442a(address[i], 255) << 8) | (255 & address[i + 1])));
                            i += 2;
                        }
                    }
                    return fVar.mo11470r();
                } else if (address.length == 4) {
                    return a.getHostAddress();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid IPv6 address: '");
                    sb.append(str);
                    sb.append('\'');
                    throw new AssertionError(sb.toString());
                }
            } else {
                try {
                    String ascii = IDN.toASCII(str);
                    C4638h.m10270a((Object) ascii, "IDN.toASCII(host)");
                    Locale locale = Locale.US;
                    C4638h.m10270a((Object) locale, "Locale.US");
                    String lowerCase = ascii.toLowerCase(locale);
                    C4638h.m10270a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (lowerCase.length() == 0) {
                        return null;
                    }
                    int length = lowerCase.length();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            break;
                        }
                        char charAt = lowerCase.charAt(i7);
                        if (charAt <= 31) {
                            break;
                        } else if (charAt >= 127) {
                            break;
                        } else if (C4681g.m10302a((CharSequence) " #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    i = 1;
                    if (i == 0) {
                        str2 = lowerCase;
                    }
                    return str2;
                } catch (IllegalArgumentException unused) {
                }
            }
        } else {
            C4638h.m10271a("$this$toCanonicalHost");
            throw null;
        }
    }

    /* renamed from: e */
    public static String m2252e(byte[] bArr) {
        return new String(Base64.encode(bArr, 2));
    }

    /* renamed from: a */
    public static final C4915y m2184a(File file) {
        if (file != null) {
            return new C4907r(new FileOutputStream(file, true), new C4886b0());
        }
        C4638h.m10271a("$receiver");
        throw null;
    }

    /* renamed from: b */
    public static byte[] m2237b(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        if (i3 >= 0) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i, bArr2, 0, Math.min(bArr.length - i, i3));
            return bArr2;
        }
        StringBuffer stringBuffer = new StringBuffer(i);
        stringBuffer.append(" > ");
        stringBuffer.append(i2);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    /* renamed from: b */
    public static void m2234b(Context context) {
        context.sendBroadcast(new Intent("org.dpppt.android.sdk.ACTION_UPDATE"));
        context.sendBroadcast(new Intent("org.dpppt.android.sdk.ACTION_UPDATE_ERRORS"));
    }

    /* renamed from: a */
    public static final boolean m2210a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (bArr == null) {
            C4638h.m10271a("a");
            throw null;
        } else if (bArr2 != null) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (bArr[i4 + i] != bArr2[i4 + i2]) {
                    return false;
                }
            }
            return true;
        } else {
            C4638h.m10271a("b");
            throw null;
        }
    }

    /* renamed from: a */
    public static final C4895h m2182a(C4915y yVar) {
        if (yVar != null) {
            return new C4909t(yVar);
        }
        C4638h.m10271a("$receiver");
        throw null;
    }

    /* renamed from: b */
    public static final C4882a0 m2230b(File file) {
        if (file != null) {
            return new C4904p(new FileInputStream(file), new C4886b0());
        }
        C4638h.m10271a("$receiver");
        throw null;
    }

    /* renamed from: a */
    public static final C4896i m2183a(C4882a0 a0Var) {
        if (a0Var != null) {
            return new C4910u(a0Var);
        }
        C4638h.m10271a("$receiver");
        throw null;
    }

    /* renamed from: a */
    public static void m2200a(Context context, C1381a<C5182f> aVar) {
        C5182f fVar;
        C5182f fVar2;
        boolean z = false;
        String str = "GaenStateHelper";
        if (new Intent("com.google.android.gms.settings.EXPOSURE_NOTIFICATION_SETTINGS").resolveActivity(context.getPackageManager()) != null) {
            C5229g.m11663a(str, "checkGaenAvailability: EN available");
            fVar = C5182f.AVAILABLE;
        } else {
            int a = C2121e.f5993d.mo7110a(context, C2124f.f5996a);
            if (a == 1 || a == 3 || a == 9) {
                StringBuilder sb = new StringBuilder();
                sb.append("checkGaenAvailability: googlePlayServicesAvailable=");
                sb.append(a);
                C5229g.m11665b(str, sb.toString());
                fVar = C5182f.UNAVAILABLE;
            } else if (a == 2) {
                C5229g.m11667d(str, "checkGaenAvailability: update required (isGooglePlayServicesAvailable)");
                fVar = C5182f.UPDATE_REQUIRED;
            } else {
                try {
                    context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    z = true;
                } catch (NameNotFoundException unused) {
                }
                if (z) {
                    C5229g.m11667d(str, "checkGaenAvailability: update required (isPackageInstalled)");
                    fVar2 = C5182f.UPDATE_REQUIRED;
                } else {
                    C5229g.m11667d(str, "checkGaenAvailability: not installed");
                    fVar2 = C5182f.UNAVAILABLE;
                }
                m2203a(context, aVar, fVar2);
                return;
            }
        }
        m2203a(context, aVar, fVar);
    }

    /* renamed from: b */
    public static final C4882a0 m2231b(Socket socket) {
        if (socket != null) {
            C4916z zVar = new C4916z(socket);
            InputStream inputStream = socket.getInputStream();
            C4638h.m10270a((Object) inputStream, "getInputStream()");
            return new C4890d(zVar, new C4904p(inputStream, zVar));
        }
        C4638h.m10271a("$receiver");
        throw null;
    }

    /* renamed from: a */
    public static C5155a m2193a(C5156b bVar, C5159e eVar) {
        C5156b bVar2 = bVar;
        C5159e eVar2 = eVar;
        Class<int> cls = int.class;
        int i = bVar2.f12342a;
        int i2 = 1 << i;
        int b = eVar.mo11917b();
        int[] iArr = new int[2];
        iArr[1] = i2;
        int i3 = 0;
        iArr[0] = b;
        int[][] iArr2 = (int[][]) Array.newInstance(cls, iArr);
        int[] iArr3 = new int[2];
        iArr3[1] = i2;
        iArr3[0] = b;
        int[][] iArr4 = (int[][]) Array.newInstance(cls, iArr3);
        for (int i4 = 0; i4 < i2; i4++) {
            int[] iArr5 = iArr4[0];
            int[] iArr6 = eVar2.f12347c;
            int i5 = eVar2.f12346b;
            int i6 = iArr6[i5];
            while (true) {
                i5--;
                if (i5 < 0) {
                    break;
                }
                i6 = eVar2.f12345a.mo11903a(i6, i4) ^ eVar2.f12347c[i5];
            }
            iArr5[i4] = bVar2.mo11902a(i6);
        }
        for (int i7 = 1; i7 < b; i7++) {
            for (int i8 = 0; i8 < i2; i8++) {
                iArr4[i7][i8] = bVar2.mo11903a(iArr4[i7 - 1][i8], i8);
            }
        }
        int i9 = 0;
        while (i9 < b) {
            int i10 = i3;
            while (i10 < i2) {
                for (int i11 = i3; i11 <= i9; i11++) {
                    iArr2[i9][i10] = bVar2.mo11903a(iArr4[i11][i10], eVar2.mo11913a((b + i11) - i9)) ^ iArr2[i9][i10];
                }
                i10++;
                i3 = 0;
            }
            i9++;
            i3 = 0;
        }
        int i12 = b * i;
        int[] iArr7 = new int[2];
        iArr7[1] = (i2 + 31) >>> 5;
        iArr7[0] = i12;
        int[][] iArr8 = (int[][]) Array.newInstance(cls, iArr7);
        for (int i13 = 0; i13 < i2; i13++) {
            int i14 = i13 >>> 5;
            int i15 = 1 << (i13 & 31);
            for (int i16 = 0; i16 < b; i16++) {
                int i17 = iArr2[i16][i13];
                for (int i18 = 0; i18 < i; i18++) {
                    if (((i17 >>> i18) & 1) != 0) {
                        int[] iArr9 = iArr8[(((i16 + 1) * i) - i18) - 1];
                        iArr9[i14] = iArr9[i14] ^ i15;
                    }
                }
            }
        }
        return new C5155a(i2, iArr8);
    }

    /* renamed from: a */
    public static C5018a m2190a(C4946b bVar) {
        C4967n nVar = bVar.f11820f.f11831e;
        C4967n nVar2 = C4928a.f11733D;
        String str = nVar.f11849e;
        String str2 = nVar2.f11849e;
        if (str.length() > str2.length() && str.charAt(str2.length()) == '.' && str.startsWith(str2)) {
            return new C5063a(((Integer) C5078b.f12147i.get(bVar.f11820f.f11831e)).intValue(), C4971o.m11277a((Object) bVar.mo11582h()).f11858e);
        } else if (nVar.mo11626b(C4928a.f11746h)) {
            return new C5067b(C4971o.m11277a((Object) bVar.mo11582h()).f11858e, C5078b.m11533a(C5034h.m11489a(bVar.f11820f.f11832f)));
        } else {
            if (nVar.mo11626b(C4928a.f11737H)) {
                byte[] bArr = C4971o.m11277a((Object) bVar.mo11582h()).f11858e;
                int length = bArr.length / 2;
                short[] sArr = new short[length];
                for (int i = 0; i != length; i++) {
                    int i2 = i * 2;
                    sArr[i] = (short) (((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255));
                }
                return new C5061a(sArr);
            } else if (nVar.mo11626b(C4945a.f11809l)) {
                byte[] bArr2 = C4971o.m11277a((Object) bVar.mo11582h()).f11858e;
                C4921b bVar2 = bVar.f11823i;
                if (m2225b(bArr2, 0) != 1) {
                    return C5043c.m11505a(m2237b(bArr2, 4, bArr2.length));
                }
                if (bVar2 == null) {
                    return C5049h.m11510a((Object) m2237b(bArr2, 4, bArr2.length));
                }
                byte[] o = bVar2.mo11561o();
                byte[] b = m2237b(bArr2, 4, bArr2.length);
                byte[] b2 = m2237b(o, 4, o.length);
                C5049h a = C5049h.m11510a((Object) b);
                a.f12079k = C5051i.m11516a(b2);
                return a;
            } else {
                String str3 = "ClassNotFoundException processing BDS state: ";
                if (nVar.mo11626b(C4928a.f11750l)) {
                    C5035i a2 = C5035i.m11491a(bVar.f11820f.f11832f);
                    C4967n nVar3 = a2.f12022g.f11831e;
                    C4929d h = bVar.mo11582h();
                    C5039m mVar = h instanceof C5039m ? (C5039m) h : h != null ? new C5039m(C4986t.m11342a((Object) h)) : null;
                    try {
                        C5115b bVar3 = new C5115b(new C5112w(a2.f12021f, C5084f.m11549a(C5078b.m11536a(nVar3).getAlgorithmName())));
                        bVar3.f12268b = mVar.f12038f;
                        bVar3.f12270d = m2236b(m2217a(mVar.f12039g));
                        bVar3.f12271e = m2236b(m2217a(mVar.f12040h));
                        bVar3.f12272f = m2236b(m2217a(mVar.f12041i));
                        bVar3.f12273g = m2236b(m2217a(mVar.f12042j));
                        if (mVar.f12037e != 0) {
                            bVar3.f12269c = mVar.f12043k;
                        }
                        if (m2217a(mVar.f12044l) != null) {
                            C5079a aVar = (C5079a) m2179a(m2217a(mVar.f12044l), C5079a.class);
                            if (aVar != null) {
                                bVar3.f12274h = new C5079a(aVar, nVar3);
                            } else {
                                throw null;
                            }
                        }
                        return new C5113x(bVar3, null);
                    } catch (ClassNotFoundException e) {
                        StringBuilder a3 = C1965a.m4756a(str3);
                        a3.append(e.getMessage());
                        throw new IOException(a3.toString());
                    }
                } else if (nVar.mo11626b(C5031e.f11997l)) {
                    C5036j a4 = C5036j.m11493a(bVar.f11820f.f11832f);
                    C4967n nVar4 = a4.f12026h.f11831e;
                    try {
                        C4929d h2 = bVar.mo11582h();
                        C5037k kVar = h2 instanceof C5037k ? (C5037k) h2 : h2 != null ? new C5037k(C4986t.m11342a((Object) h2)) : null;
                        C5106b bVar4 = new C5106b(new C5103r(a4.f12024f, a4.f12025g, C5084f.m11549a(C5078b.m11536a(nVar4).getAlgorithmName())));
                        bVar4.f12233b = kVar.f12028f;
                        bVar4.f12235d = m2236b(m2217a(kVar.f12030h));
                        bVar4.f12236e = m2236b(m2217a(kVar.f12031i));
                        bVar4.f12237f = m2236b(m2217a(kVar.f12032j));
                        bVar4.f12238g = m2236b(m2217a(kVar.f12033k));
                        if (kVar.f12027e != 0) {
                            bVar4.f12234c = kVar.f12029g;
                        }
                        if (m2217a(kVar.f12034l) != null) {
                            C5080b a5 = ((C5080b) m2179a(m2217a(kVar.f12034l), C5080b.class)).mo11738a(nVar4);
                            if (a5.f12161f == 0) {
                                bVar4.f12239h = new C5080b(a5, (1 << bVar4.f12232a.f12223c) - 1);
                            } else {
                                bVar4.f12239h = a5;
                            }
                        }
                        return new C5104s(bVar4, null);
                    } catch (ClassNotFoundException e2) {
                        StringBuilder a6 = C1965a.m4756a(str3);
                        a6.append(e2.getMessage());
                        throw new IOException(a6.toString());
                    }
                } else {
                    throw new RuntimeException("algorithm identifier in private key not recognised");
                }
            }
        }
    }

    /* renamed from: a */
    public static C4946b m2187a(C5018a aVar, C4996w wVar) {
        C5018a aVar2 = aVar;
        C4996w wVar2 = wVar;
        if (aVar2 instanceof C5063a) {
            C5063a aVar3 = (C5063a) aVar2;
            return new C4946b(C5078b.m11534a(aVar3.f12124a), new C5003y0(aVar3.mo11728a()), wVar2, null);
        } else if (aVar2 instanceof C5067b) {
            C5067b bVar = (C5067b) aVar2;
            return new C4946b(new C4950a(C5031e.f11990e, new C5034h(C5078b.m11535a(bVar.f12135a))), new C5003y0(bVar.mo11732a()), null, null);
        } else {
            if (aVar2 instanceof C5061a) {
                C5061a aVar4 = (C5061a) aVar2;
                C4950a aVar5 = new C4950a(C5031e.f11991f);
                short[] a = aVar4.mo11726a();
                byte[] bArr = new byte[(a.length * 2)];
                for (int i = 0; i != a.length; i++) {
                    short s = a[i];
                    int i2 = i * 2;
                    bArr[i2] = (byte) s;
                    bArr[i2 + 1] = (byte) (s >>> 8);
                }
                return new C4946b(aVar5, new C5003y0(bArr), null, null);
            } else if (aVar2 instanceof C5049h) {
                C5049h hVar = (C5049h) aVar2;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte b = (byte) 0;
                byteArrayOutputStream.write(b);
                byte b2 = (byte) 0;
                byteArrayOutputStream.write(b2);
                byte b3 = (byte) 0;
                byteArrayOutputStream.write(b3);
                byte b4 = (byte) 1;
                byteArrayOutputStream.write(b4);
                try {
                    byteArrayOutputStream.write(hVar.getEncoded());
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    byteArrayOutputStream2.write(b);
                    byteArrayOutputStream2.write(b2);
                    byteArrayOutputStream2.write(b3);
                    byteArrayOutputStream2.write(b4);
                    try {
                        byteArrayOutputStream2.write(hVar.mo11716b().getEncoded());
                        return new C4946b(new C4950a(C4945a.f11809l), new C5003y0(byteArray), wVar2, byteArrayOutputStream2.toByteArray());
                    } catch (Exception e) {
                        throw new RuntimeException(e.getMessage(), e);
                    }
                } catch (Exception e2) {
                    throw new RuntimeException(e2.getMessage(), e2);
                }
            } else if (aVar2 instanceof C5043c) {
                C5043c cVar = (C5043c) aVar2;
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i3 = cVar.f12050e;
                byteArrayOutputStream3.write((byte) (i3 >>> 24));
                byteArrayOutputStream3.write((byte) (i3 >>> 16));
                byteArrayOutputStream3.write((byte) (i3 >>> 8));
                byteArrayOutputStream3.write((byte) i3);
                try {
                    byteArrayOutputStream3.write(cVar.getEncoded());
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    int i4 = cVar.f12050e;
                    byteArrayOutputStream4.write((byte) (i4 >>> 24));
                    byteArrayOutputStream4.write((byte) (i4 >>> 16));
                    byteArrayOutputStream4.write((byte) (i4 >>> 8));
                    byteArrayOutputStream4.write((byte) i4);
                    try {
                        byteArrayOutputStream4.write(cVar.mo11705a().getEncoded());
                        return new C4946b(new C4950a(C4945a.f11809l), new C5003y0(byteArray2), wVar2, byteArrayOutputStream4.toByteArray());
                    } catch (Exception e3) {
                        throw new RuntimeException(e3.getMessage(), e3);
                    }
                } catch (Exception e4) {
                    throw new RuntimeException(e4.getMessage(), e4);
                }
            } else {
                String str = "index out of bounds";
                if (aVar2 instanceof C5113x) {
                    C5113x xVar = (C5113x) aVar2;
                    C4950a aVar6 = new C4950a(C5031e.f11992g, new C5035i(xVar.f12261f.f12254b, C5078b.m11537b(xVar.f12218e)));
                    byte[] encoded = xVar.getEncoded();
                    C5112w wVar3 = xVar.f12261f;
                    int i5 = wVar3.f12259g;
                    int i6 = wVar3.f12254b;
                    int a2 = (int) m2176a(encoded, 0, 4);
                    if (m2207a(i6, (long) a2)) {
                        byte[] c = m2246c(encoded, 4, i5);
                        int i7 = i5 + 4;
                        byte[] c2 = m2246c(encoded, i7, i5);
                        int i8 = i7 + i5;
                        byte[] c3 = m2246c(encoded, i8, i5);
                        int i9 = i8 + i5;
                        byte[] c4 = m2246c(encoded, i9, i5);
                        int i10 = i9 + i5;
                        byte[] c5 = m2246c(encoded, i10, encoded.length - i10);
                        try {
                            int i11 = ((C5079a) m2179a(c5, C5079a.class)).f12159p;
                            return new C4946b(aVar6, i11 != (1 << i6) - 1 ? new C5039m(a2, c, c2, c3, c4, c5, i11) : new C5039m(a2, c, c2, c3, c4, c5), wVar2, null);
                        } catch (ClassNotFoundException e5) {
                            StringBuilder a3 = C1965a.m4756a("cannot parse BDS: ");
                            a3.append(e5.getMessage());
                            throw new IOException(a3.toString());
                        }
                    } else {
                        throw new IllegalArgumentException(str);
                    }
                } else if (aVar2 instanceof C5104s) {
                    C5104s sVar = (C5104s) aVar2;
                    C4967n nVar = C5031e.f11997l;
                    C5103r rVar = sVar.f12225f;
                    C4950a aVar7 = new C4950a(nVar, new C5036j(rVar.f12223c, rVar.f12224d, C5078b.m11537b(sVar.f12219e)));
                    byte[] encoded2 = sVar.getEncoded();
                    C5103r rVar2 = sVar.f12225f;
                    int i12 = rVar2.f12222b.f12259g;
                    int i13 = rVar2.f12223c;
                    int i14 = (i13 + 7) / 8;
                    long a4 = (long) ((int) m2176a(encoded2, 0, i14));
                    if (m2207a(i13, a4)) {
                        int i15 = i14 + 0;
                        byte[] c6 = m2246c(encoded2, i15, i12);
                        int i16 = i15 + i12;
                        byte[] c7 = m2246c(encoded2, i16, i12);
                        int i17 = i16 + i12;
                        byte[] c8 = m2246c(encoded2, i17, i12);
                        int i18 = i17 + i12;
                        byte[] c9 = m2246c(encoded2, i18, i12);
                        int i19 = i18 + i12;
                        byte[] c10 = m2246c(encoded2, i19, encoded2.length - i19);
                        try {
                            long j = ((C5080b) m2179a(c10, C5080b.class)).f12161f;
                            return new C4946b(aVar7, j != (1 << i13) - 1 ? new C5037k(a4, c6, c7, c8, c9, c10, j) : new C5037k(a4, c6, c7, c8, c9, c10), wVar2, null);
                        } catch (ClassNotFoundException e6) {
                            StringBuilder a5 = C1965a.m4756a("cannot parse BDSStateMap: ");
                            a5.append(e6.getMessage());
                            throw new IOException(a5.toString());
                        }
                    } else {
                        throw new IllegalArgumentException(str);
                    }
                } else {
                    throw new IOException("key parameters not recognized");
                }
            }
        }
    }

    /* renamed from: a */
    public static C4951b m2188a(C5018a aVar) {
        if (aVar instanceof C5064b) {
            C5064b bVar = (C5064b) aVar;
            return new C4951b(C5078b.m11534a(bVar.f12126a), bVar.mo11729a());
        } else if (aVar instanceof C5068c) {
            C5068c cVar = (C5068c) aVar;
            return new C4951b(new C4950a(C5031e.f11990e, new C5034h(C5078b.m11535a(cVar.f12135a))), cVar.mo11733a());
        } else if (aVar instanceof C5062b) {
            return new C4951b(new C4950a(C5031e.f11991f), ((C5062b) aVar).mo11727a());
        } else if (aVar instanceof C5051i) {
            C5051i iVar = (C5051i) aVar;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write((byte) 0);
            byteArrayOutputStream.write((byte) 0);
            byteArrayOutputStream.write((byte) 0);
            byteArrayOutputStream.write((byte) 1);
            try {
                byteArrayOutputStream.write(iVar.getEncoded());
                return new C4951b(new C4950a(C4945a.f11809l), (C4929d) new C5003y0(byteArrayOutputStream.toByteArray()));
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        } else if (aVar instanceof C5044d) {
            C5044d dVar = (C5044d) aVar;
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            int i = dVar.f12056e;
            byteArrayOutputStream2.write((byte) (i >>> 24));
            byteArrayOutputStream2.write((byte) (i >>> 16));
            byteArrayOutputStream2.write((byte) (i >>> 8));
            byteArrayOutputStream2.write((byte) i);
            try {
                byteArrayOutputStream2.write(dVar.getEncoded());
                return new C4951b(new C4950a(C4945a.f11809l), (C4929d) new C5003y0(byteArrayOutputStream2.toByteArray()));
            } catch (Exception e2) {
                throw new RuntimeException(e2.getMessage(), e2);
            }
        } else if (aVar instanceof C5116y) {
            C5116y yVar = (C5116y) aVar;
            byte[] b = m2236b(yVar.f12279i);
            byte[] b2 = m2236b(yVar.f12278h);
            byte[] encoded = yVar.getEncoded();
            if (encoded.length > b.length + b2.length) {
                return new C4951b(new C4950a(C4932a.f11768a), (C4929d) new C5003y0(encoded));
            }
            return new C4951b(new C4950a(C5031e.f11992g, new C5035i(yVar.f12276f.f12254b, C5078b.m11537b(yVar.f12218e))), (C4929d) new C5040n(b, b2));
        } else if (aVar instanceof C5107t) {
            C5107t tVar = (C5107t) aVar;
            byte[] b3 = m2236b(tVar.f12245i);
            byte[] b4 = m2236b(tVar.f12244h);
            byte[] a = tVar.mo11760a();
            if (a.length > b3.length + b4.length) {
                return new C4951b(new C4950a(C4932a.f11769b), (C4929d) new C5003y0(a));
            }
            C4967n nVar = C5031e.f11997l;
            C5103r rVar = tVar.f12242f;
            return new C4951b(new C4950a(nVar, new C5036j(rVar.f12223c, rVar.f12224d, C5078b.m11537b(tVar.f12219e))), (C4929d) new C5038l(m2236b(tVar.f12245i), m2236b(tVar.f12244h)));
        } else {
            throw new IOException("key parameters not recognized");
        }
    }

    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0099, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d8, code lost:
        if (r7 == r0) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00db, code lost:
        if (r8 != -1) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00dd, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00de, code lost:
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f1, code lost:
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.net.InetAddress m2180a(java.lang.String r16, int r17, int r18) {
        /*
            r0 = r16
            r1 = r18
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = -1
            r5 = 0
            r6 = r17
            r8 = r4
            r9 = r8
            r7 = r5
        L_0x000f:
            r10 = 0
            if (r6 >= r1) goto L_0x00d7
            if (r7 != r2) goto L_0x0015
            return r10
        L_0x0015:
            int r11 = r6 + 2
            r12 = 255(0xff, float:3.57E-43)
            r13 = 4
            if (r11 > r1) goto L_0x0033
            java.lang.String r14 = "::"
            boolean r14 = p392u.p409w.C4681g.m10321a(r0, r14, r6, r5, r13)
            if (r14 == 0) goto L_0x0033
            if (r8 == r4) goto L_0x0027
            return r10
        L_0x0027:
            int r7 = r7 + 2
            if (r11 != r1) goto L_0x002f
            r0 = r2
            r8 = r7
            goto L_0x00d8
        L_0x002f:
            r8 = r7
            r9 = r11
            goto L_0x00a4
        L_0x0033:
            if (r7 == 0) goto L_0x00a3
            java.lang.String r11 = ":"
            boolean r11 = p392u.p409w.C4681g.m10321a(r0, r11, r6, r5, r13)
            if (r11 == 0) goto L_0x0041
            int r6 = r6 + 1
            goto L_0x00a3
        L_0x0041:
            java.lang.String r11 = "."
            boolean r6 = p392u.p409w.C4681g.m10321a(r0, r11, r6, r5, r13)
            if (r6 == 0) goto L_0x00a2
            int r6 = r7 + -2
            r11 = r6
        L_0x004c:
            if (r9 >= r1) goto L_0x0094
            if (r11 != r2) goto L_0x0052
        L_0x0050:
            r0 = r5
            goto L_0x009a
        L_0x0052:
            if (r11 == r6) goto L_0x005f
            char r14 = r0.charAt(r9)
            r15 = 46
            if (r14 == r15) goto L_0x005d
            goto L_0x0050
        L_0x005d:
            int r9 = r9 + 1
        L_0x005f:
            r15 = r5
            r14 = r9
        L_0x0061:
            if (r14 >= r1) goto L_0x0083
            char r5 = r0.charAt(r14)
            r2 = 48
            if (r5 < r2) goto L_0x0083
            r4 = 57
            if (r5 <= r4) goto L_0x0070
            goto L_0x0083
        L_0x0070:
            if (r15 != 0) goto L_0x0075
            if (r9 == r14) goto L_0x0075
            goto L_0x0099
        L_0x0075:
            int r15 = r15 * 10
            int r15 = r15 + r5
            int r15 = r15 - r2
            if (r15 <= r12) goto L_0x007c
            goto L_0x0099
        L_0x007c:
            int r14 = r14 + 1
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x0061
        L_0x0083:
            int r2 = r14 - r9
            if (r2 != 0) goto L_0x0088
            goto L_0x0099
        L_0x0088:
            int r2 = r11 + 1
            byte r4 = (byte) r15
            r3[r11] = r4
            r11 = r2
            r9 = r14
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x004c
        L_0x0094:
            int r6 = r6 + r13
            if (r11 != r6) goto L_0x0099
            r0 = 1
            goto L_0x009a
        L_0x0099:
            r0 = 0
        L_0x009a:
            if (r0 != 0) goto L_0x009d
            return r10
        L_0x009d:
            int r7 = r7 + 2
            r0 = 16
            goto L_0x00d8
        L_0x00a2:
            return r10
        L_0x00a3:
            r9 = r6
        L_0x00a4:
            r6 = r9
            r2 = 0
        L_0x00a6:
            if (r6 >= r1) goto L_0x00ba
            char r4 = r0.charAt(r6)
            int r4 = p410v.p411m0.C4737b.m10443a(r4)
            r5 = -1
            if (r4 != r5) goto L_0x00b4
            goto L_0x00ba
        L_0x00b4:
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto L_0x00a6
        L_0x00ba:
            int r4 = r6 - r9
            if (r4 == 0) goto L_0x00d6
            if (r4 <= r13) goto L_0x00c1
            goto L_0x00d6
        L_0x00c1:
            int r4 = r7 + 1
            int r5 = r2 >>> 8
            r5 = r5 & r12
            byte r5 = (byte) r5
            r3[r7] = r5
            int r7 = r4 + 1
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x000f
        L_0x00d6:
            return r10
        L_0x00d7:
            r0 = r2
        L_0x00d8:
            if (r7 == r0) goto L_0x00ed
            r1 = -1
            if (r8 != r1) goto L_0x00de
            return r10
        L_0x00de:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            byte r0 = (byte) r0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00ed:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p119o.p120a.C0967p0.m2180a(java.lang.String, int, int):java.net.InetAddress");
    }

    /* renamed from: a */
    public static C5008a m2189a(C4950a aVar) {
        if (aVar.f11831e.mo11626b(C4941a.f11794a)) {
            return new C5012c();
        }
        if (aVar.f11831e.mo11626b(C4936a.f11781f)) {
            return new C5013d();
        }
        if (aVar.f11831e.mo11626b(C4936a.f11778c)) {
            return new C5014e();
        }
        if (aVar.f11831e.mo11626b(C4936a.f11779d)) {
            return new C5015f();
        }
        if (aVar.f11831e.mo11626b(C4936a.f11780e)) {
            return new C5016g();
        }
        StringBuilder a = C1965a.m4756a("unrecognised OID in digest algorithm identifier: ");
        a.append(aVar.f11831e);
        throw new IllegalArgumentException(a.toString());
    }

    /* renamed from: a */
    public static void m2199a(Context context) {
        C2842n2 n2Var = (C2842n2) C5242m.m11680a(context).f12480a;
        if (n2Var != null) {
            C2191a a = C2190m.m5016a();
            a.f6092a = new C2862s2(n2Var);
            a.f6094c = new C2119d[]{C3216e.f8070c};
            C3255i a2 = n2Var.mo7139a(0, a.mo7206a());
            C0921c cVar = new C0921c(context, null);
            C3250f0 f0Var = (C3250f0) a2;
            if (f0Var != null) {
                f0Var.mo8926a(C3259k.f8131a, (C3249f<? super TResult>) cVar);
                f0Var.mo8925a(C3259k.f8131a, (C3247e) new C0918b(context, null));
                return;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: a */
    public static final boolean m2208a(AssertionError assertionError) {
        if (assertionError == null) {
            C4638h.m10271a("$receiver");
            throw null;
        } else if (assertionError.getCause() == null) {
            return false;
        } else {
            String message = assertionError.getMessage();
            return message != null ? C4681g.m10318a((CharSequence) message, (CharSequence) "getsockname failed", false, 2) : false;
        }
    }

    /* renamed from: a */
    public static final boolean m2209a(C4892f fVar) {
        if (fVar != null) {
            try {
                C4892f fVar2 = new C4892f();
                long j = fVar.f11661f;
                fVar.mo11442a(fVar2, 0, j > 64 ? 64 : j);
                int i = 0;
                while (true) {
                    if (i >= 16) {
                        break;
                    } else if (fVar2.mo11460i()) {
                        break;
                    } else {
                        int s = fVar2.mo11476s();
                        if (Character.isISOControl(s) && !Character.isWhitespace(s)) {
                            return false;
                        }
                        i++;
                    }
                }
                return true;
            } catch (EOFException unused) {
                return false;
            }
        } else {
            C4638h.m10271a("$this$isProbablyUtf8");
            throw null;
        }
    }

    /* renamed from: a */
    public static C5110u m2191a(C5095k kVar, C5098n nVar, C5089i iVar) {
        double d;
        if (nVar == null) {
            throw new NullPointerException("publicKey == null");
        } else if (iVar != null) {
            int i = kVar.f12195a.f12205d;
            byte[][] a = m2221a(nVar.f12209a);
            C5110u[] uVarArr = new C5110u[a.length];
            for (int i2 = 0; i2 < a.length; i2++) {
                uVarArr[i2] = new C5110u(0, a[i2]);
            }
            C5091b bVar = (C5091b) ((C5091b) new C5091b().mo11758b(iVar.f12210a)).mo11757a(iVar.f12211b);
            bVar.f12186e = iVar.f12183e;
            bVar.f12187f = 0;
            bVar.f12188g = iVar.f12185g;
            C5100a a2 = bVar.mo11756a(iVar.f12213d);
            while (true) {
                C5089i iVar2 = (C5089i) ((C5091b) a2).mo11749b();
                if (i <= 1) {
                    return uVarArr[0];
                }
                int i3 = 0;
                while (true) {
                    d = (double) (i / 2);
                    if (i3 >= ((int) Math.floor(d))) {
                        break;
                    }
                    C5091b bVar2 = (C5091b) ((C5091b) new C5091b().mo11758b(iVar2.f12210a)).mo11757a(iVar2.f12211b);
                    bVar2.f12186e = iVar2.f12183e;
                    bVar2.f12187f = iVar2.f12184f;
                    bVar2.f12188g = i3;
                    iVar2 = (C5089i) ((C5091b) bVar2.mo11756a(iVar2.f12213d)).mo11749b();
                    int i4 = i3 * 2;
                    uVarArr[i3] = m2192a(kVar, uVarArr[i4], uVarArr[i4 + 1], (C5099o) iVar2);
                    i3++;
                }
                if (i % 2 == 1) {
                    uVarArr[(int) Math.floor(d)] = uVarArr[i - 1];
                }
                i = (int) Math.ceil(((double) i) / 2.0d);
                C5091b bVar3 = (C5091b) ((C5091b) new C5091b().mo11758b(iVar2.f12210a)).mo11757a(iVar2.f12211b);
                bVar3.f12186e = iVar2.f12183e;
                bVar3.f12187f = iVar2.f12184f + 1;
                bVar3.f12188g = iVar2.f12185g;
                a2 = bVar3.mo11756a(iVar2.f12213d);
            }
        } else {
            throw new NullPointerException("address == null");
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m2201a(Context context, C1381a aVar, Boolean bool) {
        StringBuilder sb = new StringBuilder();
        sb.append("checkGaenEnabled: enabled=");
        sb.append(bool);
        C5229g.m11663a("GaenStateHelper", sb.toString());
        boolean booleanValue = bool.booleanValue();
        C5241l.m11679a(booleanValue, null, context);
        if (aVar != null) {
            aVar.mo3659a(Boolean.valueOf(booleanValue));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m2202a(Context context, C1381a aVar, Exception exc) {
        C5229g.m11664a("GaenStateHelper", "checkGaenEnabled", exc);
        C5241l.m11679a(false, exc, context);
        if (aVar != null) {
            aVar.mo3659a(Boolean.valueOf(false));
        }
    }

    /* renamed from: a */
    public static void m2203a(Context context, C1381a<C5182f> aVar, C5182f fVar) {
        if (C5241l.f12476a != fVar) {
            C5241l.f12476a = fVar;
            m2234b(context);
        }
        if (aVar != null) {
            aVar.mo3659a(fVar);
        }
    }

    /* renamed from: a */
    public static C5110u m2192a(C5095k kVar, C5110u uVar, C5110u uVar2, C5099o oVar) {
        if (uVar == null) {
            throw new NullPointerException("left == null");
        } else if (uVar2 == null) {
            throw new NullPointerException("right == null");
        } else if (uVar.f12250e != uVar2.f12250e) {
            throw new IllegalStateException("height of both nodes must be equal");
        } else if (oVar != null) {
            byte[] a = m2217a(kVar.f12198d);
            if (oVar instanceof C5089i) {
                C5089i iVar = (C5089i) oVar;
                C5091b bVar = (C5091b) ((C5091b) new C5091b().mo11758b(iVar.f12210a)).mo11757a(iVar.f12211b);
                bVar.f12186e = iVar.f12183e;
                bVar.f12187f = iVar.f12184f;
                bVar.f12188g = iVar.f12185g;
                oVar = (C5089i) ((C5091b) bVar.mo11756a(0)).mo11749b();
            } else if (oVar instanceof C5085g) {
                C5085g gVar = (C5085g) oVar;
                C5087b bVar2 = (C5087b) ((C5087b) new C5087b().mo11758b(gVar.f12210a)).mo11757a(gVar.f12211b);
                bVar2.f12179e = gVar.f12177f;
                bVar2.f12180f = gVar.f12178g;
                oVar = (C5085g) ((C5087b) bVar2.mo11756a(0)).mo11746b();
            }
            byte[] a2 = kVar.f12196b.mo11748a(a, oVar.mo11744a());
            if (oVar instanceof C5089i) {
                C5089i iVar2 = (C5089i) oVar;
                C5091b bVar3 = (C5091b) ((C5091b) new C5091b().mo11758b(iVar2.f12210a)).mo11757a(iVar2.f12211b);
                bVar3.f12186e = iVar2.f12183e;
                bVar3.f12187f = iVar2.f12184f;
                bVar3.f12188g = iVar2.f12185g;
                oVar = (C5089i) ((C5091b) bVar3.mo11756a(1)).mo11749b();
            } else if (oVar instanceof C5085g) {
                C5085g gVar2 = (C5085g) oVar;
                C5087b bVar4 = (C5087b) ((C5087b) new C5087b().mo11758b(gVar2.f12210a)).mo11757a(gVar2.f12211b);
                bVar4.f12179e = gVar2.f12177f;
                bVar4.f12180f = gVar2.f12178g;
                oVar = (C5085g) ((C5087b) bVar4.mo11756a(1)).mo11746b();
            }
            byte[] a3 = kVar.f12196b.mo11748a(a, oVar.mo11744a());
            if (oVar instanceof C5089i) {
                C5089i iVar3 = (C5089i) oVar;
                C5091b bVar5 = (C5091b) ((C5091b) new C5091b().mo11758b(iVar3.f12210a)).mo11757a(iVar3.f12211b);
                bVar5.f12186e = iVar3.f12183e;
                bVar5.f12187f = iVar3.f12184f;
                bVar5.f12188g = iVar3.f12185g;
                oVar = (C5089i) ((C5091b) bVar5.mo11756a(2)).mo11749b();
            } else if (oVar instanceof C5085g) {
                C5085g gVar3 = (C5085g) oVar;
                C5087b bVar6 = (C5087b) ((C5087b) new C5087b().mo11758b(gVar3.f12210a)).mo11757a(gVar3.f12211b);
                bVar6.f12179e = gVar3.f12177f;
                bVar6.f12180f = gVar3.f12178g;
                oVar = (C5085g) ((C5087b) bVar6.mo11756a(2)).mo11746b();
            }
            byte[] a4 = kVar.f12196b.mo11748a(a, oVar.mo11744a());
            int i = kVar.f12195a.f12203b;
            int i2 = i * 2;
            byte[] bArr = new byte[i2];
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) (uVar.mo11761a()[i3] ^ a3[i3]);
            }
            for (int i4 = 0; i4 < i; i4++) {
                bArr[i4 + i] = (byte) (uVar2.mo11761a()[i4] ^ a4[i4]);
            }
            C5088h hVar = kVar.f12196b;
            if (hVar != null) {
                int length = a2.length;
                int i5 = hVar.f12182b;
                if (length != i5) {
                    throw new IllegalArgumentException("wrong key length");
                } else if (i2 == i5 * 2) {
                    return new C5110u(uVar.f12250e, hVar.mo11747a(1, a2, bArr));
                } else {
                    throw new IllegalArgumentException("wrong in length");
                }
            } else {
                throw null;
            }
        } else {
            throw new NullPointerException("address == null");
        }
    }

    /* renamed from: a */
    public static final C4915y m2186a(Socket socket) {
        if (socket != null) {
            C4916z zVar = new C4916z(socket);
            OutputStream outputStream = socket.getOutputStream();
            C4638h.m10270a((Object) outputStream, "getOutputStream()");
            return new C4888c(zVar, new C4907r(outputStream, zVar));
        }
        C4638h.m10271a("$receiver");
        throw null;
    }

    /* renamed from: a */
    public static C4915y m2185a(File file, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if (file != null) {
            return new C4907r(new FileOutputStream(file, z), new C4886b0());
        }
        C4638h.m10271a("$receiver");
        throw null;
    }

    /* renamed from: a */
    public static final <T, R> Object m2178a(C0909n<? super T> nVar, R r, C4622p<? super R, ? super C4580d<? super T>, ? extends Object> pVar) {
        Object obj;
        nVar.mo4225m();
        if (pVar != null) {
            try {
                C4645o.m10278a((Object) pVar, 2);
                obj = pVar.mo3781a(r, nVar);
            } catch (Throwable th) {
                obj = new C0975s(th, false, 2);
            }
            C4590a aVar = C4590a.COROUTINE_SUSPENDED;
            if (obj == aVar) {
                return aVar;
            }
            Object f = nVar.mo4261f(obj);
            if (f == C0938g1.f2551b) {
                return C4590a.COROUTINE_SUSPENDED;
            }
            if (!(f instanceof C0975s)) {
                return C0938g1.m2096b(f);
            }
            throw ((C0975s) f).f2591a;
        }
        throw new C4557i("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m2177a(java.lang.Exception r4, p392u.p395p.C4580d<?> r5) {
        /*
            boolean r0 = r5 instanceof p484y.C5337t
            if (r0 == 0) goto L_0x0013
            r0 = r5
            y.t r0 = (p484y.C5337t) r0
            int r1 = r0.f12624i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12624i = r1
            goto L_0x0018
        L_0x0013:
            y.t r0 = new y.t
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f12623h
            u.p.j.a r1 = p392u.p395p.p396j.C4590a.COROUTINE_SUSPENDED
            int r2 = r0.f12624i
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r4 = r0.f12625j
            java.lang.Exception r4 = (java.lang.Exception) r4
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5339f(r5)
            goto L_0x004d
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5339f(r5)
            r0.f12625j = r4
            r0.f12624i = r3
            o.a.z r5 = p119o.p120a.C0946j0.f2564a
            u.p.f r2 = r0.mo4219b()
            y.s r3 = new y.s
            r3.<init>(r0, r4)
            r5.mo4301a(r2, r3)
            u.p.j.a r4 = p392u.p395p.p396j.C4590a.COROUTINE_SUSPENDED
            if (r4 != r1) goto L_0x004d
            return r1
        L_0x004d:
            u.l r4 = p392u.C4560l.f10773a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p119o.p120a.C0967p0.m2177a(java.lang.Exception, u.p.d):java.lang.Object");
    }

    /* renamed from: a */
    public static final long m2174a(String str, long j, long j2, long j3) {
        Long l;
        String str2 = str;
        long j4 = j2;
        long j5 = j3;
        String a = C0911p.m1998a(str);
        if (a == null) {
            return j;
        }
        C2286e.m5143a(10);
        int length = a.length();
        if (length != 0) {
            int i = 0;
            char charAt = a.charAt(0);
            long j6 = -9223372036854775807L;
            boolean z = true;
            if (charAt >= '0') {
                z = false;
            } else if (length != 1) {
                if (charAt == '-') {
                    j6 = Long.MIN_VALUE;
                    i = 1;
                } else if (charAt == '+') {
                    z = false;
                    i = 1;
                }
            }
            long j7 = 0;
            long j8 = -256204778801521550L;
            while (true) {
                if (i < length) {
                    int digit = Character.digit(a.charAt(i), 10);
                    if (digit < 0) {
                        break;
                    }
                    if (j7 < j8) {
                        if (j8 != -256204778801521550L) {
                            break;
                        }
                        j8 = j6 / ((long) 10);
                        if (j7 < j8) {
                            break;
                        }
                    }
                    long j9 = j7 * ((long) 10);
                    long j10 = (long) digit;
                    if (j9 < j6 + j10) {
                        break;
                    }
                    j7 = j9 - j10;
                    i++;
                    long j11 = j3;
                } else {
                    l = z ? Long.valueOf(j7) : Long.valueOf(-j7);
                }
            }
        }
        l = null;
        String str3 = "System property '";
        if (l != null) {
            long longValue = l.longValue();
            long j12 = j3;
            if (j4 <= longValue && j12 >= longValue) {
                return longValue;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(str2);
            sb.append("' should be in range ");
            sb.append(j4);
            sb.append(Strings.TOP_PATH);
            sb.append(j12);
            sb.append(", but is '");
            sb.append(longValue);
            sb.append('\'');
            throw new IllegalStateException(sb.toString().toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(str2);
        sb2.append("' has unrecognized value '");
        sb2.append(a);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }

    /* renamed from: a */
    public static /* synthetic */ int m2171a(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) m2174a(str, (long) i, (long) i2, (long) i3);
    }

    /* renamed from: a */
    public static /* synthetic */ long m2175a(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = RecyclerView.FOREVER_NS;
        }
        return m2174a(str, j, j4, j3);
    }
}
