package p124p.p199y.p200x.p210t.p212q;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p124p.p199y.p200x.p210t.C1938i;

/* renamed from: p.y.x.t.q.b */
public class C1963b implements C1962a {

    /* renamed from: a */
    public final C1938i f5626a;

    /* renamed from: b */
    public final Handler f5627b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final Executor f5628c = new C1964a();

    /* renamed from: p.y.x.t.q.b$a */
    public class C1964a implements Executor {
        public C1964a() {
        }

        public void execute(Runnable runnable) {
            C1963b.this.f5627b.post(runnable);
        }
    }

    public C1963b(Executor executor) {
        this.f5626a = new C1938i(executor);
    }
}
