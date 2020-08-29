package p369s.p370a.p371a.p372a.p373a;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p369s.p370a.p371a.p374b.C4445l;
import p369s.p370a.p371a.p374b.C4445l.C4447b;
import p369s.p370a.p371a.p375c.C4449b;
import p369s.p370a.p371a.p375c.C4450c;

/* renamed from: s.a.a.a.a.b */
public final class C4431b extends C4445l {

    /* renamed from: a */
    public final Handler f10531a;

    /* renamed from: b */
    public final boolean f10532b;

    /* renamed from: s.a.a.a.a.b$a */
    public static final class C4432a extends C4447b {

        /* renamed from: e */
        public final Handler f10533e;

        /* renamed from: f */
        public final boolean f10534f;

        /* renamed from: g */
        public volatile boolean f10535g;

        public C4432a(Handler handler, boolean z) {
            this.f10533e = handler;
            this.f10534f = z;
        }

        @SuppressLint({"NewApi"})
        /* renamed from: a */
        public C4450c mo10713a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.f10535g) {
                return C4449b.m10038a();
            } else {
                Objects.requireNonNull(runnable, "run is null");
                C4433b bVar = new C4433b(this.f10533e, runnable);
                Message obtain = Message.obtain(this.f10533e, bVar);
                obtain.obj = this;
                if (this.f10534f) {
                    obtain.setAsynchronous(true);
                }
                this.f10533e.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (!this.f10535g) {
                    return bVar;
                }
                this.f10533e.removeCallbacks(bVar);
                return C4449b.m10038a();
            }
        }

        /* renamed from: f */
        public void mo10714f() {
            this.f10535g = true;
            this.f10533e.removeCallbacksAndMessages(this);
        }
    }

    /* renamed from: s.a.a.a.a.b$b */
    public static final class C4433b implements Runnable, C4450c {

        /* renamed from: e */
        public final Handler f10536e;

        /* renamed from: f */
        public final Runnable f10537f;

        public C4433b(Handler handler, Runnable runnable) {
            this.f10536e = handler;
            this.f10537f = runnable;
        }

        /* renamed from: f */
        public void mo10714f() {
            this.f10536e.removeCallbacks(this);
        }

        public void run() {
            try {
                this.f10537f.run();
            } catch (Throwable th) {
                C2286e.m5298b(th);
            }
        }
    }

    public C4431b(Handler handler, boolean z) {
        this.f10531a = handler;
        this.f10532b = z;
    }

    /* renamed from: a */
    public C4447b mo10711a() {
        return new C4432a(this.f10531a, this.f10532b);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public C4450c mo10712a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            Objects.requireNonNull(runnable, "run is null");
            C4433b bVar = new C4433b(this.f10531a, runnable);
            Message obtain = Message.obtain(this.f10531a, bVar);
            if (this.f10532b) {
                obtain.setAsynchronous(true);
            }
            this.f10531a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            return bVar;
        } else {
            throw new NullPointerException("unit == null");
        }
    }
}
