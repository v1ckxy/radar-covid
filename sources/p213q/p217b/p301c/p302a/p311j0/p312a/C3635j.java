package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.c.a.j0.a.j */
public abstract class C3635j implements Iterable<Byte>, Serializable {

    /* renamed from: f */
    public static final C3635j f9034f = new C3643h(C3594b0.f8973b);

    /* renamed from: g */
    public static final C3639d f9035g = (C3609d.m8184a() ? new C3644i(null) : new C3637b(null));

    /* renamed from: e */
    public int f9036e = 0;

    /* renamed from: q.b.c.a.j0.a.j$a */
    public static abstract class C3636a implements C3640e {
        public Object next() {
            return Byte.valueOf(((C3629i) this).mo9653b());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: q.b.c.a.j0.a.j$b */
    public static final class C3637b implements C3639d {
        public /* synthetic */ C3637b(C3629i iVar) {
        }

        /* renamed from: a */
        public byte[] mo9676a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* renamed from: q.b.c.a.j0.a.j$c */
    public static final class C3638c extends C3643h {

        /* renamed from: i */
        public final int f9037i;

        /* renamed from: j */
        public final int f9038j;

        public C3638c(byte[] bArr, int i, int i2) {
            super(bArr);
            C3635j.m8390b(i, i + i2, bArr.length);
            this.f9037i = i;
            this.f9038j = i2;
        }

        /* renamed from: a */
        public void mo9662a(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f9041h, this.f9037i + i, bArr, i2, i3);
        }

        /* renamed from: e */
        public byte mo9664e(int i) {
            int i2 = this.f9038j;
            if (((i2 - (i + 1)) | i) >= 0) {
                return this.f9041h[this.f9037i + i];
            }
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(C1965a.m4761b("Index < 0: ", i));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Index > length: ");
            sb.append(i);
            sb.append(Objects.ARRAY_ELEMENT_SEPARATOR);
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }

        /* renamed from: f */
        public byte mo9666f(int i) {
            return this.f9041h[this.f9037i + i];
        }

        /* renamed from: i */
        public int mo9677i() {
            return this.f9037i;
        }

        public int size() {
            return this.f9038j;
        }
    }

    /* renamed from: q.b.c.a.j0.a.j$d */
    public interface C3639d {
        /* renamed from: a */
        byte[] mo9676a(byte[] bArr, int i, int i2);
    }

    /* renamed from: q.b.c.a.j0.a.j$e */
    public interface C3640e extends Iterator<Byte> {
    }

    /* renamed from: q.b.c.a.j0.a.j$f */
    public static final class C3641f {

        /* renamed from: a */
        public final C3670m f9039a;

        /* renamed from: b */
        public final byte[] f9040b;

        public /* synthetic */ C3641f(int i, C3629i iVar) {
            byte[] bArr = new byte[i];
            this.f9040b = bArr;
            this.f9039a = C3670m.m8646b(bArr);
        }

        /* renamed from: a */
        public C3635j mo9678a() {
            if (this.f9039a.mo9797a() == 0) {
                return new C3643h(this.f9040b);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: q.b.c.a.j0.a.j$g */
    public static abstract class C3642g extends C3635j {
    }

    /* renamed from: q.b.c.a.j0.a.j$h */
    public static class C3643h extends C3642g {

        /* renamed from: h */
        public final byte[] f9041h;

        public C3643h(byte[] bArr) {
            if (bArr != null) {
                this.f9041h = bArr;
                return;
            }
            throw null;
        }

        /* renamed from: a */
        public final int mo9658a(int i, int i2, int i3) {
            return C3594b0.m8160a(i, this.f9041h, mo9677i() + i2, i3);
        }

        /* renamed from: a */
        public final String mo9659a(Charset charset) {
            return new String(this.f9041h, mo9677i(), size(), charset);
        }

        /* renamed from: a */
        public final C3635j mo9660a(int i, int i2) {
            int b = C3635j.m8390b(i, i2, size());
            return b == 0 ? C3635j.f9034f : new C3638c(this.f9041h, mo9677i() + i, b);
        }

        /* renamed from: a */
        public final void mo9661a(C3626h hVar) {
            hVar.mo9652a(this.f9041h, mo9677i(), size());
        }

        /* renamed from: a */
        public void mo9662a(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f9041h, i, bArr, i2, i3);
        }

        /* renamed from: c */
        public final boolean mo9663c() {
            int i = mo9677i();
            return C3700r1.m8888c(this.f9041h, i, size() + i);
        }

        /* renamed from: e */
        public byte mo9664e(int i) {
            return this.f9041h[i];
        }

        public final boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C3635j) || size() != ((C3635j) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C3643h)) {
                return obj.equals(this);
            }
            C3643h hVar = (C3643h) obj;
            int i = this.f9036e;
            int i2 = hVar.f9036e;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int size = size();
            if (size > hVar.size()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Length too large: ");
                sb.append(size);
                sb.append(size());
                throw new IllegalArgumentException(sb.toString());
            } else if (0 + size <= hVar.size()) {
                byte[] bArr = this.f9041h;
                byte[] bArr2 = hVar.f9041h;
                int i3 = mo9677i() + size;
                int i4 = mo9677i();
                int i5 = hVar.mo9677i() + 0;
                while (true) {
                    if (i4 >= i3) {
                        break;
                    } else if (bArr[i4] != bArr2[i5]) {
                        z = false;
                        break;
                    } else {
                        i4++;
                        i5++;
                    }
                }
                return z;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Ran off end of other: ");
                sb2.append(0);
                String str = Objects.ARRAY_ELEMENT_SEPARATOR;
                sb2.append(str);
                sb2.append(size);
                sb2.append(str);
                sb2.append(hVar.size());
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        /* renamed from: f */
        public byte mo9666f(int i) {
            return this.f9041h[i];
        }

        /* renamed from: f */
        public final C3656k mo9667f() {
            return C3656k.m8447a(this.f9041h, mo9677i(), size(), true);
        }

        /* renamed from: i */
        public int mo9677i() {
            return 0;
        }

        public int size() {
            return this.f9041h.length;
        }
    }

    /* renamed from: q.b.c.a.j0.a.j$i */
    public static final class C3644i implements C3639d {
        public /* synthetic */ C3644i(C3629i iVar) {
        }

        /* renamed from: a */
        public byte[] mo9676a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    /* renamed from: a */
    public static C3635j m8387a(String str) {
        return new C3643h(str.getBytes(C3594b0.f8972a));
    }

    /* renamed from: a */
    public static C3635j m8388a(byte[] bArr) {
        return m8389a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C3635j m8389a(byte[] bArr, int i, int i2) {
        m8390b(i, i + i2, bArr.length);
        return new C3643h(f9035g.mo9676a(bArr, i, i2));
    }

    /* renamed from: b */
    public static int m8390b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(C1965a.m4762b("Beginning index: ", i, " < 0"));
        } else if (i2 < i) {
            StringBuilder sb = new StringBuilder();
            sb.append("Beginning index larger than ending index: ");
            sb.append(i);
            sb.append(Objects.ARRAY_ELEMENT_SEPARATOR);
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("End index: ");
            sb2.append(i2);
            sb2.append(" >= ");
            sb2.append(i3);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
    }

    /* renamed from: b */
    public static C3635j m8391b(byte[] bArr) {
        return new C3643h(bArr);
    }

    /* renamed from: b */
    public static C3635j m8392b(byte[] bArr, int i, int i2) {
        return new C3638c(bArr, i, i2);
    }

    /* renamed from: g */
    public static C3641f m8393g(int i) {
        return new C3641f(i, null);
    }

    /* renamed from: a */
    public abstract int mo9658a(int i, int i2, int i3);

    /* renamed from: a */
    public abstract String mo9659a(Charset charset);

    /* renamed from: a */
    public abstract C3635j mo9660a(int i, int i2);

    /* renamed from: a */
    public abstract void mo9661a(C3626h hVar);

    /* renamed from: a */
    public abstract void mo9662a(byte[] bArr, int i, int i2, int i3);

    /* renamed from: c */
    public abstract boolean mo9663c();

    /* renamed from: e */
    public abstract byte mo9664e(int i);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract byte mo9666f(int i);

    /* renamed from: f */
    public abstract C3656k mo9667f();

    /* renamed from: g */
    public final byte[] mo9668g() {
        int size = size();
        if (size == 0) {
            return C3594b0.f8973b;
        }
        byte[] bArr = new byte[size];
        mo9662a(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: h */
    public final String mo9669h() {
        return size() == 0 ? Objects.EMPTY_STRING : mo9659a(C3594b0.f8972a);
    }

    public final int hashCode() {
        int i = this.f9036e;
        if (i == 0) {
            int size = size();
            i = mo9658a(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f9036e = i;
        }
        return i;
    }

    public Iterator iterator() {
        return new C3629i(this);
    }

    public abstract int size();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            str = C2286e.m5194a(this);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(C2286e.m5194a(mo9660a(0, 47)));
            sb.append("...");
            str = sb.toString();
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
