package p213q.p217b.p317d.p322h.p323e.p326k;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: q.b.d.h.e.k.f */
public class C3940f {

    /* renamed from: a */
    public static final AtomicLong f9606a = new AtomicLong(0);

    /* renamed from: b */
    public static String f9607b;

    public C3940f(C3970q0 q0Var) {
        long time = new Date().getTime();
        long j = time / 1000;
        long j2 = time % 1000;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        byte[] a = m9347a(j2);
        byte[] a2 = m9347a(f9606a.incrementAndGet());
        byte[] a3 = m9347a((long) Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {array[0], array[1], array[2], array[3], a[0], a[1], a2[0], a2[1], a3[0], a3[1]};
        String c = C3944g.m9368c(q0Var.mo10158a());
        String a4 = C3944g.m9358a(bArr);
        f9607b = String.format(Locale.US, "%s-%s-%s-%s", new Object[]{a4.substring(0, 12), a4.substring(12, 16), a4.subSequence(16, 20), c.substring(0, 12)}).toUpperCase(Locale.US);
    }

    /* renamed from: a */
    public static byte[] m9347a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public String toString() {
        return f9607b;
    }
}
