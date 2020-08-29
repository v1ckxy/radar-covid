package p124p.p182q.p184m;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.q.m.a */
public class C1650a {

    /* renamed from: e */
    public static final Map<String, Lock> f4864e = new HashMap();

    /* renamed from: a */
    public final File f4865a;

    /* renamed from: b */
    public final Lock f4866b;

    /* renamed from: c */
    public final boolean f4867c;

    /* renamed from: d */
    public FileChannel f4868d;

    public C1650a(String str, File file, boolean z) {
        File file2 = new File(file, C1965a.m4751a(str, ".lck"));
        this.f4865a = file2;
        this.f4866b = m4194a(file2.getAbsolutePath());
        this.f4867c = z;
    }

    /* renamed from: a */
    public static Lock m4194a(String str) {
        Lock lock;
        synchronized (f4864e) {
            lock = (Lock) f4864e.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                f4864e.put(str, lock);
            }
        }
        return lock;
    }

    /* renamed from: a */
    public void mo6445a() {
        FileChannel fileChannel = this.f4868d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f4866b.unlock();
    }
}
