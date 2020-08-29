package p213q.p217b.p317d.p322h.p323e.p326k;

import android.util.Log;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.atomic.AtomicBoolean;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p322h.p323e.p337s.C4168e;

/* renamed from: q.b.d.h.e.k.k0 */
public class C3956k0 implements UncaughtExceptionHandler {

    /* renamed from: a */
    public final C3957a f9655a;

    /* renamed from: b */
    public final C4168e f9656b;

    /* renamed from: c */
    public final UncaughtExceptionHandler f9657c;

    /* renamed from: d */
    public final AtomicBoolean f9658d = new AtomicBoolean(false);

    /* renamed from: q.b.d.h.e.k.k0$a */
    public interface C3957a {
    }

    public C3956k0(C3957a aVar, C4168e eVar, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f9655a = aVar;
        this.f9656b = eVar;
        this.f9657c = uncaughtExceptionHandler;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        C3913b bVar;
        String str;
        this.f9658d.set(true);
        String str2 = "Crashlytics completed exception processing. Invoking default exception handler.";
        if (thread == null) {
            try {
                bVar = C3913b.f9552c;
                str = "Could not handle uncaught exception; null thread";
            } catch (Exception e) {
                C3913b bVar2 = C3913b.f9552c;
                String str3 = "An error occurred in the uncaught exception handler";
                if (bVar2.mo10110a(6)) {
                    Log.e(bVar2.f9553a, str3, e);
                }
            } catch (Throwable th2) {
                C3913b.f9552c.mo10108a(str2);
                this.f9657c.uncaughtException(thread, th);
                this.f9658d.set(false);
                throw th2;
            }
        } else if (th == null) {
            bVar = C3913b.f9552c;
            str = "Could not handle uncaught exception; null throwable";
        } else {
            C3957a aVar = this.f9655a;
            ((C3998x) aVar).f9779a.mo10172a(this.f9656b, thread, th);
            C3913b.f9552c.mo10108a(str2);
            this.f9657c.uncaughtException(thread, th);
            this.f9658d.set(false);
        }
        bVar.mo10111b(str);
        C3913b.f9552c.mo10108a(str2);
        this.f9657c.uncaughtException(thread, th);
        this.f9658d.set(false);
    }
}
