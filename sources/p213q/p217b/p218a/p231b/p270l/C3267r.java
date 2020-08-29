package p213q.p217b.p218a.p231b.p270l;

/* renamed from: q.b.a.b.l.r */
public final class C3267r implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C3255i f8151e;

    /* renamed from: f */
    public final /* synthetic */ C3265p f8152f;

    public C3267r(C3265p pVar, C3255i iVar) {
        this.f8152f = pVar;
        this.f8151e = iVar;
    }

    public final void run() {
        try {
            C3255i iVar = (C3255i) this.f8152f.f8147b.mo8913a(this.f8151e);
            if (iVar == null) {
                C3265p pVar = this.f8152f;
                pVar.f8148c.mo8929a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            iVar.mo8926a(C3259k.f8132b, (C3249f<? super TResult>) this.f8152f);
            iVar.mo8925a(C3259k.f8132b, (C3247e) this.f8152f);
            iVar.mo8923a(C3259k.f8132b, (C3243c) this.f8152f);
        } catch (C3251g e) {
            if (e.getCause() instanceof Exception) {
                this.f8152f.f8148c.mo8929a((Exception) e.getCause());
            } else {
                this.f8152f.f8148c.mo8929a((Exception) e);
            }
        } catch (Exception e2) {
            this.f8152f.f8148c.mo8929a(e2);
        }
    }
}
