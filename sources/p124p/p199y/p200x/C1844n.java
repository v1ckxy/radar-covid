package p124p.p199y.p200x;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker.C0177a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.p210t.p211p.C1961c;

/* renamed from: p.y.x.n */
public class C1844n implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C1961c f5359e;

    /* renamed from: f */
    public final /* synthetic */ String f5360f;

    /* renamed from: g */
    public final /* synthetic */ C1845o f5361g;

    public C1844n(C1845o oVar, C1961c cVar, String str) {
        this.f5361g = oVar;
        this.f5359e = cVar;
        this.f5360f = str;
    }

    @SuppressLint({"SyntheticAccessor"})
    public void run() {
        try {
            C0177a aVar = (C0177a) this.f5359e.get();
            if (aVar == null) {
                C1800l.m4460a().mo6783b(C1845o.f5362x, String.format("%s returned a null result. Treating it as a failure.", new Object[]{this.f5361g.f5367i.f5529c}), new Throwable[0]);
            } else {
                C1800l.m4460a().mo6782a(C1845o.f5362x, String.format("%s returned a %s result.", new Object[]{this.f5361g.f5367i.f5529c, aVar}), new Throwable[0]);
                this.f5361g.f5369k = aVar;
            }
        } catch (CancellationException e) {
            C1800l.m4460a().mo6784c(C1845o.f5362x, String.format("%s was cancelled", new Object[]{this.f5360f}), e);
        } catch (InterruptedException | ExecutionException e2) {
            C1800l.m4460a().mo6783b(C1845o.f5362x, String.format("%s failed because it threw an exception/error", new Object[]{this.f5360f}), e2);
        } catch (Throwable th) {
            this.f5361g.mo6819a();
            throw th;
        }
        this.f5361g.mo6819a();
    }
}
