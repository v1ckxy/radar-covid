package p213q.p217b.p218a.p231b.p251g.p256e;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.f5 */
public abstract class C2435f5 implements Serializable, Iterable<Byte> {

    /* renamed from: f */
    public static final C2435f5 f6525f = new C2580n5(C2546l6.f6705b);

    /* renamed from: g */
    public static final C2511j5 f6526g = (C2777z4.m6583a() ? new C2562m5(null) : new C2472h5(null));

    /* renamed from: e */
    public int f6527e = 0;

    /* renamed from: a */
    public static int m5805a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(Objects.ARRAY_ELEMENT_SEPARATOR);
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* renamed from: a */
    public static C2435f5 m5806a(String str) {
        return new C2580n5(str.getBytes(C2546l6.f6704a));
    }

    /* renamed from: a */
    public static C2435f5 m5807a(byte[] bArr, int i, int i2) {
        m5805a(i, i + i2, bArr.length);
        return new C2580n5(f6526g.mo7704a(bArr, i, i2));
    }

    /* renamed from: e */
    public static C2545l5 m5808e(int i) {
        return new C2545l5(i, null);
    }

    /* renamed from: a */
    public abstract byte mo7639a(int i);

    /* renamed from: a */
    public abstract int mo7640a();

    /* renamed from: a */
    public abstract C2435f5 mo7641a(int i, int i2);

    /* renamed from: b */
    public final String mo7642b() {
        Charset charset = C2546l6.f6704a;
        if (mo7640a() == 0) {
            return Objects.EMPTY_STRING;
        }
        C2580n5 n5Var = (C2580n5) this;
        return new String(n5Var.f6744h, n5Var.mo7677e(), n5Var.mo7640a(), charset);
    }

    /* renamed from: c */
    public abstract byte mo7643c(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f6527e;
        if (i == 0) {
            int a = mo7640a();
            C2580n5 n5Var = (C2580n5) this;
            i = C2546l6.m6109a(a, n5Var.f6744h, n5Var.mo7677e(), a);
            if (i == 0) {
                i = 1;
            }
            this.f6527e = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new C2417e5(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo7640a());
        objArr[2] = mo7640a() <= 50 ? C2286e.m5193a(this) : String.valueOf(C2286e.m5193a(mo7641a(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
