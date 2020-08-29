package p484y;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;
import p410v.C4686a0.C4687a;
import p410v.C4706e0;
import p410v.C4706e0.C4707a;
import p410v.C4708f;
import p410v.C4708f.C4709a;
import p410v.C4711g;
import p410v.C4716h0;
import p410v.C4720i0;
import p410v.C4720i0.C4721a;
import p410v.C4725j0;
import p410v.C4864u;
import p410v.C4864u.C4865a;
import p410v.C4873x;
import p410v.C4873x.C4874a;
import p410v.C4879z;
import p423w.C4882a0;
import p423w.C4892f;
import p423w.C4896i;
import p423w.C4900l;
import p484y.C5251a0.C5252a;

/* renamed from: y.u */
public final class C5338u<T> implements C5264d<T> {

    /* renamed from: e */
    public final C5254b0 f12626e;

    /* renamed from: f */
    public final Object[] f12627f;

    /* renamed from: g */
    public final C4709a f12628g;

    /* renamed from: h */
    public final C5280h<C4725j0, T> f12629h;

    /* renamed from: i */
    public volatile boolean f12630i;
    @GuardedBy("this")
    @Nullable

    /* renamed from: j */
    public C4708f f12631j;
    @GuardedBy("this")
    @Nullable

    /* renamed from: k */
    public Throwable f12632k;
    @GuardedBy("this")

    /* renamed from: l */
    public boolean f12633l;

    /* renamed from: y.u$a */
    public class C5339a implements C4711g {

        /* renamed from: a */
        public final /* synthetic */ C5271f f12634a;

        public C5339a(C5271f fVar) {
            this.f12634a = fVar;
        }

        /* renamed from: a */
        public void mo12058a(C4708f fVar, C4720i0 i0Var) {
            try {
                try {
                    this.f12634a.mo11953a((C5264d<T>) C5338u.this, C5338u.this.mo12055a(i0Var));
                } catch (Throwable th) {
                    C5282h0.m11763a(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                C5282h0.m11763a(th2);
                th2.printStackTrace();
            }
        }
    }

    /* renamed from: y.u$b */
    public static final class C5340b extends C4725j0 {

        /* renamed from: g */
        public final C4725j0 f12636g;

        /* renamed from: h */
        public final C4896i f12637h;
        @Nullable

        /* renamed from: i */
        public IOException f12638i;

        /* renamed from: y.u$b$a */
        public class C5341a extends C4900l {
            public C5341a(C4882a0 a0Var) {
                super(a0Var);
            }

            /* renamed from: b */
            public long mo11077b(C4892f fVar, long j) {
                try {
                    return super.mo11077b(fVar, j);
                } catch (IOException e) {
                    C5340b.this.f12638i = e;
                    throw e;
                }
            }
        }

        public C5340b(C4725j0 j0Var) {
            this.f12636g = j0Var;
            this.f12637h = C0967p0.m2183a((C4882a0) new C5341a(j0Var.mo10991h()));
        }

        public void close() {
            this.f12636g.close();
        }

        /* renamed from: f */
        public long mo10989f() {
            return this.f12636g.mo10989f();
        }

        /* renamed from: g */
        public C4879z mo10990g() {
            return this.f12636g.mo10990g();
        }

        /* renamed from: h */
        public C4896i mo10991h() {
            return this.f12637h;
        }
    }

    /* renamed from: y.u$c */
    public static final class C5342c extends C4725j0 {
        @Nullable

        /* renamed from: g */
        public final C4879z f12640g;

        /* renamed from: h */
        public final long f12641h;

        public C5342c(@Nullable C4879z zVar, long j) {
            this.f12640g = zVar;
            this.f12641h = j;
        }

        /* renamed from: f */
        public long mo10989f() {
            return this.f12641h;
        }

        /* renamed from: g */
        public C4879z mo10990g() {
            return this.f12640g;
        }

        /* renamed from: h */
        public C4896i mo10991h() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public C5338u(C5254b0 b0Var, Object[] objArr, C4709a aVar, C5280h<C4725j0, T> hVar) {
        this.f12626e = b0Var;
        this.f12627f = objArr;
        this.f12628g = aVar;
        this.f12629h = hVar;
    }

    /* renamed from: a */
    public C5263c0<T> mo12055a(C4720i0 i0Var) {
        C4725j0 j0Var = i0Var.f11066l;
        C4721a aVar = new C4721a(i0Var);
        aVar.f11079g = new C5342c(j0Var.mo10990g(), j0Var.mo10989f());
        C4720i0 a = aVar.mo11042a();
        int i = a.f11063i;
        if (i < 200 || i >= 300) {
            try {
                C4725j0 a2 = C5282h0.m11762a(j0Var);
                Objects.requireNonNull(a2, "body == null");
                Objects.requireNonNull(a, "rawResponse == null");
                if (!a.mo11034f()) {
                    return new C5263c0<>(a, null, a2);
                }
                throw new IllegalArgumentException("rawResponse should not be successful response");
            } finally {
                j0Var.close();
            }
        } else if (i == 204 || i == 205) {
            j0Var.close();
            return C5263c0.m11721a(null, a);
        } else {
            C5340b bVar = new C5340b(j0Var);
            try {
                return C5263c0.m11721a(this.f12629h.mo11984a(bVar), a);
            } catch (RuntimeException e) {
                IOException iOException = bVar.f12638i;
                if (iOException == null) {
                    throw e;
                }
                throw iOException;
            }
        }
    }

    /* renamed from: a */
    public void mo11987a(C5271f<T> fVar) {
        C4708f fVar2;
        Throwable th;
        Objects.requireNonNull(fVar, "callback == null");
        synchronized (this) {
            if (!this.f12633l) {
                this.f12633l = true;
                fVar2 = this.f12631j;
                th = this.f12632k;
                if (fVar2 == null && th == null) {
                    try {
                        C4708f b = mo12056b();
                        this.f12631j = b;
                        fVar2 = b;
                    } catch (Throwable th2) {
                        th = th2;
                        C5282h0.m11763a(th);
                        this.f12632k = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            fVar.mo11952a((C5264d<T>) this, th);
            return;
        }
        if (this.f12630i) {
            fVar2.cancel();
        }
        fVar2.mo10999a(new C5339a(fVar));
    }

    /* renamed from: b */
    public final C4708f mo12056b() {
        C4873x xVar;
        C4709a aVar = this.f12628g;
        C5254b0 b0Var = this.f12626e;
        Object[] objArr = this.f12627f;
        C5347y<?>[] yVarArr = b0Var.f12515j;
        int length = objArr.length;
        if (length == yVarArr.length) {
            C5251a0 a0Var = new C5251a0(b0Var.f12508c, b0Var.f12507b, b0Var.f12509d, b0Var.f12510e, b0Var.f12511f, b0Var.f12512g, b0Var.f12513h, b0Var.f12514i);
            if (b0Var.f12516k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                yVarArr[i].mo12059a(a0Var, objArr[i]);
            }
            C4874a aVar2 = a0Var.f12493d;
            if (aVar2 != null) {
                xVar = aVar2.mo11402a();
            } else {
                xVar = a0Var.f12491b.mo11389b(a0Var.f12492c);
                if (xVar == null) {
                    StringBuilder a = C1965a.m4756a("Malformed URL. Base: ");
                    a.append(a0Var.f12491b);
                    a.append(", Relative: ");
                    a.append(a0Var.f12492c);
                    throw new IllegalArgumentException(a.toString());
                }
            }
            C4716h0 h0Var = a0Var.f12500k;
            if (h0Var == null) {
                C4865a aVar3 = a0Var.f12499j;
                if (aVar3 != null) {
                    h0Var = new C4864u(aVar3.f11600a, aVar3.f11601b);
                } else {
                    C4687a aVar4 = a0Var.f12498i;
                    if (aVar4 != null) {
                        h0Var = aVar4.mo10976a();
                    } else if (a0Var.f12497h) {
                        h0Var = C4716h0.f11051a.mo11031a(new byte[0], null, 0, 0);
                    }
                }
            }
            C4879z zVar = a0Var.f12496g;
            if (zVar != null) {
                if (h0Var != null) {
                    h0Var = new C5252a(h0Var, zVar);
                } else {
                    a0Var.f12495f.mo11377a("Content-Type", zVar.f11638a);
                }
            }
            C4707a aVar5 = a0Var.f12494e;
            aVar5.f11034a = xVar;
            aVar5.mo11019a(a0Var.f12495f.mo11378a());
            aVar5.mo11018a(a0Var.f12490a, h0Var);
            aVar5.mo11015a(C5329l.class, new C5329l(b0Var.f12506a, arrayList));
            C4708f a2 = aVar.mo10979a(aVar5.mo11021a());
            if (a2 != null) {
                return a2;
            }
            throw new NullPointerException("Call.Factory returned null.");
        }
        throw new IllegalArgumentException(C1965a.m4753a(C1965a.m4757a("Argument count (", length, ") doesn't match expected count ("), yVarArr.length, ")"));
    }

    @GuardedBy("this")
    /* renamed from: c */
    public final C4708f mo12057c() {
        C4708f fVar = this.f12631j;
        if (fVar != null) {
            return fVar;
        }
        Throwable th = this.f12632k;
        if (th == null) {
            try {
                C4708f b = mo12056b();
                this.f12631j = b;
                return b;
            } catch (IOException | Error | RuntimeException e) {
                C5282h0.m11763a(e);
                this.f12632k = e;
                throw e;
            }
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    public void cancel() {
        C4708f fVar;
        this.f12630i = true;
        synchronized (this) {
            fVar = this.f12631j;
        }
        if (fVar != null) {
            fVar.cancel();
        }
    }

    public Object clone() {
        return new C5338u(this.f12626e, this.f12627f, this.f12628g, this.f12629h);
    }

    /* renamed from: f */
    public C5263c0<T> mo11990f() {
        C4708f c;
        synchronized (this) {
            if (!this.f12633l) {
                this.f12633l = true;
                c = mo12057c();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f12630i) {
            c.cancel();
        }
        return mo12055a(c.mo11004f());
    }

    /* renamed from: g */
    public synchronized C4706e0 mo11991g() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return mo12057c().mo11005g();
    }

    /* renamed from: h */
    public boolean mo11992h() {
        boolean z = true;
        if (this.f12630i) {
            return true;
        }
        synchronized (this) {
            if (this.f12631j == null || !this.f12631j.mo11006h()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: clone reason: collision with other method in class */
    public C5264d m11856clone() {
        return new C5338u(this.f12626e, this.f12627f, this.f12628g, this.f12629h);
    }
}
