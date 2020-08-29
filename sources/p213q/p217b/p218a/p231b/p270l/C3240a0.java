package p213q.p217b.p218a.p231b.p270l;

import java.util.concurrent.CancellationException;

/* renamed from: q.b.a.b.l.a0 */
public final class C3240a0 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C3255i f8112e;

    /* renamed from: f */
    public final /* synthetic */ C3242b0 f8113f;

    public C3240a0(C3242b0 b0Var, C3255i iVar) {
        this.f8113f = b0Var;
        this.f8112e = iVar;
    }

    public final void run() {
        try {
            C3255i a = this.f8113f.f8115b.mo8939a(this.f8112e.mo8931b());
            if (a == null) {
                C3242b0 b0Var = this.f8113f;
                b0Var.f8116c.mo8929a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            a.mo8926a(C3259k.f8132b, (C3249f<? super TResult>) this.f8113f);
            a.mo8925a(C3259k.f8132b, (C3247e) this.f8113f);
            a.mo8923a(C3259k.f8132b, (C3243c) this.f8113f);
        } catch (C3251g e) {
            if (e.getCause() instanceof Exception) {
                Exception exc = (Exception) e.getCause();
                this.f8113f.f8116c.mo8929a(exc);
                return;
            }
            this.f8113f.f8116c.mo8929a((Exception) e);
        } catch (CancellationException unused) {
            this.f8113f.f8116c.mo8937e();
        } catch (Exception e2) {
            this.f8113f.f8116c.mo8929a(e2);
        }
    }
}
