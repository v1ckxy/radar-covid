package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker.C0177a;
import p124p.p199y.p200x.p210t.p211p.C1961c;
import p213q.p217b.p298b.p299a.p300a.C3498a;

public abstract class Worker extends ListenableWorker {

    /* renamed from: h */
    public C1961c<C0177a> f983h;

    /* renamed from: androidx.work.Worker$a */
    public class C0181a implements Runnable {
        public C0181a() {
        }

        public void run() {
            try {
                Worker.this.f983h.mo6960c(Worker.this.mo1455e());
            } catch (Throwable th) {
                Worker.this.f983h.mo6958a(th);
            }
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: c */
    public final C3498a<C0177a> mo1444c() {
        this.f983h = new C1961c<>();
        this.f979f.f987c.execute(new C0181a());
        return this.f983h;
    }

    /* renamed from: e */
    public abstract C0177a mo1455e();
}
