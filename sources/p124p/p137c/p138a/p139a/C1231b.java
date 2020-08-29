package p124p.p137c.p138a.p139a;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: p.c.a.a.b */
public class C1231b extends C1233c {

    /* renamed from: a */
    public final Object f3510a = new Object();

    /* renamed from: b */
    public final ExecutorService f3511b = Executors.newFixedThreadPool(4, new C1232a(this));

    /* renamed from: c */
    public volatile Handler f3512c;

    /* renamed from: p.c.a.a.b$a */
    public class C1232a implements ThreadFactory {

        /* renamed from: e */
        public final AtomicInteger f3513e = new AtomicInteger(0);

        public C1232a(C1231b bVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f3513e.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: a */
    public static Handler m3099a(Looper looper) {
        if (VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.valueOf(true)});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    /* renamed from: a */
    public void mo5405a(Runnable runnable) {
        this.f3511b.execute(runnable);
    }

    /* renamed from: a */
    public boolean mo5406a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: b */
    public void mo5407b(Runnable runnable) {
        if (this.f3512c == null) {
            synchronized (this.f3510a) {
                if (this.f3512c == null) {
                    this.f3512c = m3099a(Looper.getMainLooper());
                }
            }
        }
        this.f3512c.post(runnable);
    }
}
