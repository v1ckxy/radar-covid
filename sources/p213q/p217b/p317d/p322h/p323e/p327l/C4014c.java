package p213q.p217b.p317d.p322h.p323e.p327l;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.d.h.e.l.c */
public class C4014c implements Closeable {

    /* renamed from: k */
    public static final Logger f9795k = Logger.getLogger(C4014c.class.getName());

    /* renamed from: e */
    public final RandomAccessFile f9796e;

    /* renamed from: f */
    public int f9797f;

    /* renamed from: g */
    public int f9798g;

    /* renamed from: h */
    public C4016b f9799h;

    /* renamed from: i */
    public C4016b f9800i;

    /* renamed from: j */
    public final byte[] f9801j = new byte[16];

    /* renamed from: q.b.d.h.e.l.c$a */
    public class C4015a implements C4018d {

        /* renamed from: a */
        public boolean f9802a = true;

        /* renamed from: b */
        public final /* synthetic */ StringBuilder f9803b;

        public C4015a(C4014c cVar, StringBuilder sb) {
            this.f9803b = sb;
        }

        /* renamed from: a */
        public void mo10219a(InputStream inputStream, int i) {
            if (this.f9802a) {
                this.f9802a = false;
            } else {
                this.f9803b.append(Objects.ARRAY_ELEMENT_SEPARATOR);
            }
            this.f9803b.append(i);
        }
    }

    /* renamed from: q.b.d.h.e.l.c$b */
    public static class C4016b {

        /* renamed from: c */
        public static final C4016b f9804c = new C4016b(0, 0);

        /* renamed from: a */
        public final int f9805a;

        /* renamed from: b */
        public final int f9806b;

        public C4016b(int i, int i2) {
            this.f9805a = i;
            this.f9806b = i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C4016b.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.f9805a);
            sb.append(", length = ");
            return C1965a.m4753a(sb, this.f9806b, "]");
        }
    }

    /* renamed from: q.b.d.h.e.l.c$c */
    public final class C4017c extends InputStream {

        /* renamed from: e */
        public int f9807e;

        /* renamed from: f */
        public int f9808f;

        public /* synthetic */ C4017c(C4016b bVar, C4015a aVar) {
            int i = bVar.f9805a + 4;
            int i2 = C4014c.this.f9797f;
            if (i >= i2) {
                i = (i + 16) - i2;
            }
            this.f9807e = i;
            this.f9808f = bVar.f9806b;
        }

        public int read() {
            if (this.f9808f == 0) {
                return -1;
            }
            C4014c.this.f9796e.seek((long) this.f9807e);
            int read = C4014c.this.f9796e.read();
            this.f9807e = C4014c.m9459a(C4014c.this, this.f9807e + 1);
            this.f9808f--;
            return read;
        }

        public int read(byte[] bArr, int i, int i2) {
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                int i3 = this.f9808f;
                if (i3 <= 0) {
                    return -1;
                }
                if (i2 > i3) {
                    i2 = i3;
                }
                C4014c.this.mo10208a(this.f9807e, bArr, i, i2);
                this.f9807e = C4014c.m9459a(C4014c.this, this.f9807e + i2);
                this.f9808f -= i2;
                return i2;
            }
        }
    }

    /* renamed from: q.b.d.h.e.l.c$d */
    public interface C4018d {
        /* renamed from: a */
        void mo10219a(InputStream inputStream, int i);
    }

    /* JADX INFO: finally extract failed */
    public C4014c(File file) {
        String str = "rwd";
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.getPath());
            sb.append(".tmp");
            File file2 = new File(sb.toString());
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, str);
            try {
                randomAccessFile.setLength(4096);
                randomAccessFile.seek(0);
                byte[] bArr = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    m9461b(bArr, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, str);
        this.f9796e = randomAccessFile2;
        randomAccessFile2.seek(0);
        this.f9796e.readFully(this.f9801j);
        int a = m9460a(this.f9801j, 0);
        this.f9797f = a;
        if (((long) a) <= this.f9796e.length()) {
            this.f9798g = m9460a(this.f9801j, 4);
            int a2 = m9460a(this.f9801j, 8);
            int a3 = m9460a(this.f9801j, 12);
            this.f9799h = mo10211b(a2);
            this.f9800i = mo10211b(a3);
            return;
        }
        StringBuilder a4 = C1965a.m4756a("File is truncated. Expected length: ");
        a4.append(this.f9797f);
        a4.append(", Actual length: ");
        a4.append(this.f9796e.length());
        throw new IOException(a4.toString());
    }

    /* renamed from: a */
    public static /* synthetic */ int m9459a(C4014c cVar, int i) {
        int i2 = cVar.f9797f;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: a */
    public static int m9460a(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: b */
    public static void m9461b(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: a */
    public synchronized void mo10209a(C4018d dVar) {
        int i = this.f9799h.f9805a;
        for (int i2 = 0; i2 < this.f9798g; i2++) {
            C4016b b = mo10211b(i);
            dVar.mo10219a(new C4017c(b, null), b.f9806b);
            i = mo10213c(b.f9805a + 4 + b.f9806b);
        }
    }

    /* renamed from: b */
    public final C4016b mo10211b(int i) {
        if (i == 0) {
            return C4016b.f9804c;
        }
        this.f9796e.seek((long) i);
        return new C4016b(i, this.f9796e.readInt());
    }

    /* renamed from: b */
    public final void mo10212b(int i, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile;
        int i4 = this.f9797f;
        if (i >= i4) {
            i = (i + 16) - i4;
        }
        int i5 = i + i3;
        int i6 = this.f9797f;
        if (i5 <= i6) {
            this.f9796e.seek((long) i);
            randomAccessFile = this.f9796e;
        } else {
            int i7 = i6 - i;
            this.f9796e.seek((long) i);
            this.f9796e.write(bArr, i2, i7);
            this.f9796e.seek(16);
            randomAccessFile = this.f9796e;
            i2 += i7;
            i3 -= i7;
        }
        randomAccessFile.write(bArr, i2, i3);
    }

    /* renamed from: c */
    public final int mo10213c(int i) {
        int i2 = this.f9797f;
        return i < i2 ? i : (i + 16) - i2;
    }

    public synchronized void close() {
        this.f9796e.close();
    }

    /* renamed from: f */
    public synchronized boolean mo10215f() {
        return this.f9798g == 0;
    }

    /* renamed from: g */
    public synchronized void mo10216g() {
        if (mo10215f()) {
            throw new NoSuchElementException();
        } else if (this.f9798g == 1) {
            mo10205a();
        } else {
            int c = mo10213c(this.f9799h.f9805a + 4 + this.f9799h.f9806b);
            mo10208a(c, this.f9801j, 0, 4);
            int a = m9460a(this.f9801j, 0);
            mo10207a(this.f9797f, this.f9798g - 1, c, this.f9800i.f9805a);
            this.f9798g--;
            this.f9799h = new C4016b(c, a);
        }
    }

    /* renamed from: h */
    public int mo10217h() {
        if (this.f9798g == 0) {
            return 16;
        }
        C4016b bVar = this.f9800i;
        int i = bVar.f9805a;
        int i2 = this.f9799h.f9805a;
        return i >= i2 ? (i - i2) + 4 + bVar.f9806b + 16 : (((i + 4) + bVar.f9806b) + this.f9797f) - i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C4014c.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f9797f);
        sb.append(", size=");
        sb.append(this.f9798g);
        sb.append(", first=");
        sb.append(this.f9799h);
        sb.append(", last=");
        sb.append(this.f9800i);
        sb.append(", element lengths=[");
        try {
            mo10209a((C4018d) new C4015a(this, sb));
        } catch (IOException e) {
            f9795k.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: a */
    public synchronized void mo10210a(byte[] bArr, int i, int i2) {
        String str = "buffer";
        if (bArr == null) {
            throw new NullPointerException(str);
        } else if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else {
            mo10206a(i2);
            boolean f = mo10215f();
            C4016b bVar = new C4016b(f ? 16 : mo10213c(this.f9800i.f9805a + 4 + this.f9800i.f9806b), i2);
            m9461b(this.f9801j, 0, i2);
            mo10212b(bVar.f9805a, this.f9801j, 0, 4);
            mo10212b(bVar.f9805a + 4, bArr, i, i2);
            mo10207a(this.f9797f, this.f9798g + 1, f ? bVar.f9805a : this.f9799h.f9805a, bVar.f9805a);
            this.f9800i = bVar;
            this.f9798g++;
            if (f) {
                this.f9799h = bVar;
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo10205a() {
        mo10207a(4096, 0, 0, 0);
        this.f9798g = 0;
        this.f9799h = C4016b.f9804c;
        this.f9800i = C4016b.f9804c;
        if (this.f9797f > 4096) {
            this.f9796e.setLength((long) 4096);
            this.f9796e.getChannel().force(true);
        }
        this.f9797f = 4096;
    }

    /* renamed from: a */
    public final void mo10206a(int i) {
        int i2 = i + 4;
        int h = this.f9797f - mo10217h();
        if (h < i2) {
            int i3 = this.f9797f;
            do {
                h += i3;
                i3 <<= 1;
            } while (h < i2);
            this.f9796e.setLength((long) i3);
            this.f9796e.getChannel().force(true);
            C4016b bVar = this.f9800i;
            int c = mo10213c(bVar.f9805a + 4 + bVar.f9806b);
            if (c < this.f9799h.f9805a) {
                FileChannel channel = this.f9796e.getChannel();
                channel.position((long) this.f9797f);
                long j = (long) (c - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i4 = this.f9800i.f9805a;
            int i5 = this.f9799h.f9805a;
            if (i4 < i5) {
                int i6 = (this.f9797f + i4) - 16;
                mo10207a(i3, this.f9798g, i5, i6);
                this.f9800i = new C4016b(i6, this.f9800i.f9806b);
            } else {
                mo10207a(i3, this.f9798g, i5, i4);
            }
            this.f9797f = i3;
        }
    }

    /* renamed from: a */
    public final void mo10208a(int i, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile;
        int i4 = this.f9797f;
        if (i >= i4) {
            i = (i + 16) - i4;
        }
        int i5 = i + i3;
        int i6 = this.f9797f;
        if (i5 <= i6) {
            this.f9796e.seek((long) i);
            randomAccessFile = this.f9796e;
        } else {
            int i7 = i6 - i;
            this.f9796e.seek((long) i);
            this.f9796e.readFully(bArr, i2, i7);
            this.f9796e.seek(16);
            randomAccessFile = this.f9796e;
            i2 += i7;
            i3 -= i7;
        }
        randomAccessFile.readFully(bArr, i2, i3);
    }

    /* renamed from: a */
    public final void mo10207a(int i, int i2, int i3, int i4) {
        byte[] bArr = this.f9801j;
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            m9461b(bArr, i5, iArr[i6]);
            i5 += 4;
        }
        this.f9796e.seek(0);
        this.f9796e.write(this.f9801j);
    }
}
