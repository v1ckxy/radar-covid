package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.util.List;
import java.util.Map;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3667l0.C3668a;

/* renamed from: q.b.c.a.j0.a.l */
public final class C3666l implements C3622f1 {

    /* renamed from: a */
    public final C3656k f9099a;

    /* renamed from: b */
    public int f9100b;

    /* renamed from: c */
    public int f9101c;

    /* renamed from: d */
    public int f9102d = 0;

    public C3666l(C3656k kVar) {
        C3594b0.m8166a(kVar, "input");
        C3656k kVar2 = kVar;
        this.f9099a = kVar2;
        kVar2.f9069d = this;
    }

    /* renamed from: a */
    public int mo9560a() {
        mo9792b(0);
        return this.f9099a.mo9741f();
    }

    /* renamed from: a */
    public <T> T mo9561a(Class<T> cls, C3697r rVar) {
        mo9792b(3);
        return mo9793c(C3608c1.f8978c.mo9537a(cls), rVar);
    }

    /* renamed from: a */
    public <T> T mo9562a(C3625g1<T> g1Var, C3697r rVar) {
        mo9792b(3);
        return mo9793c(g1Var, rVar);
    }

    /* renamed from: a */
    public final void mo9790a(int i) {
        if (this.f9099a.mo9732a() != i) {
            throw C3606c0.m8181h();
        }
    }

    /* renamed from: a */
    public void mo9565a(List<Integer> list) {
        int i;
        int r;
        int r2;
        if (list instanceof C3591a0) {
            C3591a0 a0Var = (C3591a0) list;
            int i2 = this.f9100b & 7;
            if (i2 == 0) {
                do {
                    a0Var.mo9517e(this.f9099a.mo9749n());
                    if (!this.f9099a.mo9735b()) {
                        r2 = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r2 == this.f9100b);
                this.f9102d = r2;
                return;
            } else if (i2 == 2) {
                i = this.f9099a.mo9732a() + this.f9099a.mo9754s();
                do {
                    a0Var.mo9517e(this.f9099a.mo9749n());
                } while (this.f9099a.mo9732a() < i);
            } else {
                throw C3606c0.m8177d();
            }
        } else {
            int i3 = this.f9100b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f9099a.mo9749n()));
                    if (!this.f9099a.mo9735b()) {
                        r = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r == this.f9100b);
                this.f9102d = r;
                return;
            } else if (i3 == 2) {
                i = this.f9099a.mo9732a() + this.f9099a.mo9754s();
                do {
                    list.add(Integer.valueOf(this.f9099a.mo9749n()));
                } while (this.f9099a.mo9732a() < i);
            } else {
                throw C3606c0.m8177d();
            }
        }
        mo9790a(i);
    }

    /* renamed from: a */
    public <T> void mo9566a(List<T> list, C3625g1<T> g1Var, C3697r rVar) {
        int r;
        int i = this.f9100b;
        if ((i & 7) == 2) {
            do {
                list.add(mo9795d(g1Var, rVar));
                if (!this.f9099a.mo9735b() && this.f9102d == 0) {
                    r = this.f9099a.mo9753r();
                } else {
                    return;
                }
            } while (r == i);
            this.f9102d = r;
            return;
        }
        throw C3606c0.m8177d();
    }

    /* renamed from: a */
    public void mo9791a(List<String> list, boolean z) {
        int r;
        int r2;
        if ((this.f9100b & 7) != 2) {
            throw C3606c0.m8177d();
        } else if (!(list instanceof C3627h0) || z) {
            do {
                list.add(z ? mo9611r() : mo9589g());
                if (!this.f9099a.mo9735b()) {
                    r = this.f9099a.mo9753r();
                } else {
                    return;
                }
            } while (r == this.f9100b);
            this.f9102d = r;
        } else {
            C3627h0 h0Var = (C3627h0) list;
            do {
                h0Var.mo9633a(mo9599l());
                if (!this.f9099a.mo9735b()) {
                    r2 = this.f9099a.mo9753r();
                } else {
                    return;
                }
            } while (r2 == this.f9100b);
            this.f9102d = r2;
        }
    }

    /* renamed from: a */
    public <K, V> void mo9568a(Map<K, V> map, C3668a<K, V> aVar, C3697r rVar) {
        mo9792b(2);
        this.f9099a.mo9736c(this.f9099a.mo9754s());
        throw null;
    }

    /* renamed from: b */
    public int mo9569b() {
        return this.f9100b;
    }

    /* renamed from: b */
    public <T> T mo9570b(Class<T> cls, C3697r rVar) {
        mo9792b(2);
        return mo9795d(C3608c1.f8978c.mo9537a(cls), rVar);
    }

    /* renamed from: b */
    public <T> T mo9571b(C3625g1<T> g1Var, C3697r rVar) {
        mo9792b(2);
        return mo9795d(g1Var, rVar);
    }

    /* renamed from: b */
    public final void mo9792b(int i) {
        if ((this.f9100b & 7) != i) {
            throw C3606c0.m8177d();
        }
    }

    /* renamed from: b */
    public void mo9573b(List<Integer> list) {
        int r;
        int r2;
        if (list instanceof C3591a0) {
            C3591a0 a0Var = (C3591a0) list;
            int i = this.f9100b & 7;
            if (i == 2) {
                int s = this.f9099a.mo9754s();
                mo9794c(s);
                int a = this.f9099a.mo9732a() + s;
                do {
                    a0Var.mo9517e(this.f9099a.mo9742g());
                } while (this.f9099a.mo9732a() < a);
            } else if (i == 5) {
                do {
                    a0Var.mo9517e(this.f9099a.mo9742g());
                    if (!this.f9099a.mo9735b()) {
                        r2 = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r2 == this.f9100b);
                this.f9102d = r2;
            } else {
                throw C3606c0.m8177d();
            }
        } else {
            int i2 = this.f9100b & 7;
            if (i2 == 2) {
                int s2 = this.f9099a.mo9754s();
                mo9794c(s2);
                int a2 = this.f9099a.mo9732a() + s2;
                do {
                    list.add(Integer.valueOf(this.f9099a.mo9742g()));
                } while (this.f9099a.mo9732a() < a2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f9099a.mo9742g()));
                    if (!this.f9099a.mo9735b()) {
                        r = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r == this.f9100b);
                this.f9102d = r;
            } else {
                throw C3606c0.m8177d();
            }
        }
    }

    /* renamed from: b */
    public <T> void mo9574b(List<T> list, C3625g1<T> g1Var, C3697r rVar) {
        int r;
        int i = this.f9100b;
        if ((i & 7) == 3) {
            do {
                list.add(mo9793c(g1Var, rVar));
                if (!this.f9099a.mo9735b() && this.f9102d == 0) {
                    r = this.f9099a.mo9753r();
                } else {
                    return;
                }
            } while (r == i);
            this.f9102d = r;
            return;
        }
        throw C3606c0.m8177d();
    }

    /* renamed from: c */
    public long mo9575c() {
        mo9792b(0);
        return this.f9099a.mo9755t();
    }

    /* renamed from: c */
    public final <T> T mo9793c(C3625g1<T> g1Var, C3697r rVar) {
        int i = this.f9101c;
        this.f9101c = ((this.f9100b >>> 3) << 3) | 4;
        try {
            T a = g1Var.mo9642a();
            g1Var.mo9645a(a, this, rVar);
            g1Var.mo9643a(a);
            if (this.f9100b == this.f9101c) {
                return a;
            }
            throw C3606c0.m8180g();
        } finally {
            this.f9101c = i;
        }
    }

    /* renamed from: c */
    public final void mo9794c(int i) {
        if ((i & 3) != 0) {
            throw C3606c0.m8180g();
        }
    }

    /* renamed from: c */
    public void mo9578c(List<Integer> list) {
        int r;
        int r2;
        if (list instanceof C3591a0) {
            C3591a0 a0Var = (C3591a0) list;
            int i = this.f9100b & 7;
            if (i == 2) {
                int s = this.f9099a.mo9754s();
                mo9794c(s);
                int a = this.f9099a.mo9732a() + s;
                do {
                    a0Var.mo9517e(this.f9099a.mo9747l());
                } while (this.f9099a.mo9732a() < a);
            } else if (i == 5) {
                do {
                    a0Var.mo9517e(this.f9099a.mo9747l());
                    if (!this.f9099a.mo9735b()) {
                        r2 = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r2 == this.f9100b);
                this.f9102d = r2;
            } else {
                throw C3606c0.m8177d();
            }
        } else {
            int i2 = this.f9100b & 7;
            if (i2 == 2) {
                int s2 = this.f9099a.mo9754s();
                mo9794c(s2);
                int a2 = this.f9099a.mo9732a() + s2;
                do {
                    list.add(Integer.valueOf(this.f9099a.mo9747l()));
                } while (this.f9099a.mo9732a() < a2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f9099a.mo9747l()));
                    if (!this.f9099a.mo9735b()) {
                        r = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r == this.f9100b);
                this.f9102d = r;
            } else {
                throw C3606c0.m8177d();
            }
        }
    }

    /* renamed from: d */
    public long mo9579d() {
        mo9792b(1);
        return this.f9099a.mo9743h();
    }

    /* renamed from: d */
    public final <T> T mo9795d(C3625g1<T> g1Var, C3697r rVar) {
        int s = this.f9099a.mo9754s();
        C3656k kVar = this.f9099a;
        if (kVar.f9066a < kVar.f9067b) {
            int c = kVar.mo9736c(s);
            T a = g1Var.mo9642a();
            this.f9099a.f9066a++;
            g1Var.mo9645a(a, this, rVar);
            g1Var.mo9643a(a);
            this.f9099a.mo9733a(0);
            C3656k kVar2 = this.f9099a;
            kVar2.f9066a--;
            kVar2.mo9734b(c);
            return a;
        }
        throw new C3606c0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: d */
    public final void mo9796d(int i) {
        if ((i & 7) != 0) {
            throw C3606c0.m8180g();
        }
    }

    /* renamed from: d */
    public void mo9582d(List<Long> list) {
        int i;
        int r;
        int r2;
        if (list instanceof C3645j0) {
            C3645j0 j0Var = (C3645j0) list;
            int i2 = this.f9100b & 7;
            if (i2 == 0) {
                do {
                    j0Var.mo9679a(this.f9099a.mo9750o());
                    if (!this.f9099a.mo9735b()) {
                        r2 = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r2 == this.f9100b);
                this.f9102d = r2;
                return;
            } else if (i2 == 2) {
                i = this.f9099a.mo9732a() + this.f9099a.mo9754s();
                do {
                    j0Var.mo9679a(this.f9099a.mo9750o());
                } while (this.f9099a.mo9732a() < i);
            } else {
                throw C3606c0.m8177d();
            }
        } else {
            int i3 = this.f9100b & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(this.f9099a.mo9750o()));
                    if (!this.f9099a.mo9735b()) {
                        r = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r == this.f9100b);
                this.f9102d = r;
                return;
            } else if (i3 == 2) {
                i = this.f9099a.mo9732a() + this.f9099a.mo9754s();
                do {
                    list.add(Long.valueOf(this.f9099a.mo9750o()));
                } while (this.f9099a.mo9732a() < i);
            } else {
                throw C3606c0.m8177d();
            }
        }
        mo9790a(i);
    }

    /* renamed from: e */
    public int mo9583e() {
        mo9792b(0);
        return this.f9099a.mo9749n();
    }

    /* renamed from: e */
    public void mo9585e(List<Integer> list) {
        int i;
        int r;
        int r2;
        if (list instanceof C3591a0) {
            C3591a0 a0Var = (C3591a0) list;
            int i2 = this.f9100b & 7;
            if (i2 == 0) {
                do {
                    a0Var.mo9517e(this.f9099a.mo9754s());
                    if (!this.f9099a.mo9735b()) {
                        r2 = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r2 == this.f9100b);
                this.f9102d = r2;
                return;
            } else if (i2 == 2) {
                i = this.f9099a.mo9732a() + this.f9099a.mo9754s();
                do {
                    a0Var.mo9517e(this.f9099a.mo9754s());
                } while (this.f9099a.mo9732a() < i);
            } else {
                throw C3606c0.m8177d();
            }
        } else {
            int i3 = this.f9100b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f9099a.mo9754s()));
                    if (!this.f9099a.mo9735b()) {
                        r = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r == this.f9100b);
                this.f9102d = r;
                return;
            } else if (i3 == 2) {
                i = this.f9099a.mo9732a() + this.f9099a.mo9754s();
                do {
                    list.add(Integer.valueOf(this.f9099a.mo9754s()));
                } while (this.f9099a.mo9732a() < i);
            } else {
                throw C3606c0.m8177d();
            }
        }
        mo9790a(i);
    }

    /* renamed from: f */
    public long mo9586f() {
        mo9792b(0);
        return this.f9099a.mo9750o();
    }

    /* renamed from: f */
    public void mo9588f(List<Boolean> list) {
        int i;
        int r;
        int r2;
        if (list instanceof C3623g) {
            C3623g gVar = (C3623g) list;
            int i2 = this.f9100b & 7;
            if (i2 == 0) {
                do {
                    gVar.mo9624a(this.f9099a.mo9737c());
                    if (!this.f9099a.mo9735b()) {
                        r2 = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r2 == this.f9100b);
                this.f9102d = r2;
                return;
            } else if (i2 == 2) {
                i = this.f9099a.mo9732a() + this.f9099a.mo9754s();
                do {
                    gVar.mo9624a(this.f9099a.mo9737c());
                } while (this.f9099a.mo9732a() < i);
            } else {
                throw C3606c0.m8177d();
            }
        } else {
            int i3 = this.f9100b & 7;
            if (i3 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f9099a.mo9737c()));
                    if (!this.f9099a.mo9735b()) {
                        r = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r == this.f9100b);
                this.f9102d = r;
                return;
            } else if (i3 == 2) {
                i = this.f9099a.mo9732a() + this.f9099a.mo9754s();
                do {
                    list.add(Boolean.valueOf(this.f9099a.mo9737c()));
                } while (this.f9099a.mo9732a() < i);
            } else {
                throw C3606c0.m8177d();
            }
        }
        mo9790a(i);
    }

    /* renamed from: g */
    public String mo9589g() {
        mo9792b(2);
        return this.f9099a.mo9751p();
    }

    /* renamed from: g */
    public void mo9590g(List<String> list) {
        mo9791a(list, false);
    }

    /* renamed from: h */
    public int mo9591h() {
        mo9792b(5);
        return this.f9099a.mo9742g();
    }

    /* renamed from: h */
    public void mo9592h(List<Long> list) {
        int i;
        int r;
        int r2;
        if (list instanceof C3645j0) {
            C3645j0 j0Var = (C3645j0) list;
            int i2 = this.f9100b & 7;
            if (i2 == 0) {
                do {
                    j0Var.mo9679a(this.f9099a.mo9755t());
                    if (!this.f9099a.mo9735b()) {
                        r2 = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r2 == this.f9100b);
                this.f9102d = r2;
                return;
            } else if (i2 == 2) {
                i = this.f9099a.mo9732a() + this.f9099a.mo9754s();
                do {
                    j0Var.mo9679a(this.f9099a.mo9755t());
                } while (this.f9099a.mo9732a() < i);
            } else {
                throw C3606c0.m8177d();
            }
        } else {
            int i3 = this.f9100b & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(this.f9099a.mo9755t()));
                    if (!this.f9099a.mo9735b()) {
                        r = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r == this.f9100b);
                this.f9102d = r;
                return;
            } else if (i3 == 2) {
                i = this.f9099a.mo9732a() + this.f9099a.mo9754s();
                do {
                    list.add(Long.valueOf(this.f9099a.mo9755t()));
                } while (this.f9099a.mo9732a() < i);
            } else {
                throw C3606c0.m8177d();
            }
        }
        mo9790a(i);
    }

    /* renamed from: i */
    public void mo9593i(List<String> list) {
        mo9791a(list, true);
    }

    /* renamed from: i */
    public boolean mo9594i() {
        mo9792b(0);
        return this.f9099a.mo9737c();
    }

    /* renamed from: j */
    public int mo9595j() {
        int i = this.f9102d;
        if (i != 0) {
            this.f9100b = i;
            this.f9102d = 0;
        } else {
            this.f9100b = this.f9099a.mo9753r();
        }
        int i2 = this.f9100b;
        if (i2 == 0 || i2 == this.f9101c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    /* renamed from: j */
    public void mo9596j(List<Float> list) {
        int r;
        int r2;
        if (list instanceof C3727x) {
            C3727x xVar = (C3727x) list;
            int i = this.f9100b & 7;
            if (i == 2) {
                int s = this.f9099a.mo9754s();
                mo9794c(s);
                int a = this.f9099a.mo9732a() + s;
                do {
                    xVar.mo9983a(this.f9099a.mo9744i());
                } while (this.f9099a.mo9732a() < a);
            } else if (i == 5) {
                do {
                    xVar.mo9983a(this.f9099a.mo9744i());
                    if (!this.f9099a.mo9735b()) {
                        r2 = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r2 == this.f9100b);
                this.f9102d = r2;
            } else {
                throw C3606c0.m8177d();
            }
        } else {
            int i2 = this.f9100b & 7;
            if (i2 == 2) {
                int s2 = this.f9099a.mo9754s();
                mo9794c(s2);
                int a2 = this.f9099a.mo9732a() + s2;
                do {
                    list.add(Float.valueOf(this.f9099a.mo9744i()));
                } while (this.f9099a.mo9732a() < a2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f9099a.mo9744i()));
                    if (!this.f9099a.mo9735b()) {
                        r = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r == this.f9100b);
                this.f9102d = r;
            } else {
                throw C3606c0.m8177d();
            }
        }
    }

    /* renamed from: k */
    public long mo9597k() {
        mo9792b(1);
        return this.f9099a.mo9748m();
    }

    /* renamed from: k */
    public void mo9598k(List<C3635j> list) {
        int r;
        if ((this.f9100b & 7) == 2) {
            do {
                list.add(mo9599l());
                if (!this.f9099a.mo9735b()) {
                    r = this.f9099a.mo9753r();
                } else {
                    return;
                }
            } while (r == this.f9100b);
            this.f9102d = r;
            return;
        }
        throw C3606c0.m8177d();
    }

    /* renamed from: l */
    public C3635j mo9599l() {
        mo9792b(2);
        return this.f9099a.mo9738d();
    }

    /* renamed from: l */
    public void mo9600l(List<Double> list) {
        int r;
        int r2;
        if (list instanceof C3681o) {
            C3681o oVar = (C3681o) list;
            int i = this.f9100b & 7;
            if (i == 1) {
                do {
                    oVar.mo9865a(this.f9099a.mo9740e());
                    if (!this.f9099a.mo9735b()) {
                        r2 = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r2 == this.f9100b);
                this.f9102d = r2;
            } else if (i == 2) {
                int s = this.f9099a.mo9754s();
                mo9796d(s);
                int a = this.f9099a.mo9732a() + s;
                do {
                    oVar.mo9865a(this.f9099a.mo9740e());
                } while (this.f9099a.mo9732a() < a);
            } else {
                throw C3606c0.m8177d();
            }
        } else {
            int i2 = this.f9100b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f9099a.mo9740e()));
                    if (!this.f9099a.mo9735b()) {
                        r = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r == this.f9100b);
                this.f9102d = r;
            } else if (i2 == 2) {
                int s2 = this.f9099a.mo9754s();
                mo9796d(s2);
                int a2 = this.f9099a.mo9732a() + s2;
                do {
                    list.add(Double.valueOf(this.f9099a.mo9740e()));
                } while (this.f9099a.mo9732a() < a2);
            } else {
                throw C3606c0.m8177d();
            }
        }
    }

    /* renamed from: m */
    public int mo9601m() {
        mo9792b(0);
        return this.f9099a.mo9754s();
    }

    /* renamed from: m */
    public void mo9602m(List<Long> list) {
        int i;
        int r;
        int r2;
        if (list instanceof C3645j0) {
            C3645j0 j0Var = (C3645j0) list;
            int i2 = this.f9100b & 7;
            if (i2 == 0) {
                do {
                    j0Var.mo9679a(this.f9099a.mo9746k());
                    if (!this.f9099a.mo9735b()) {
                        r2 = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r2 == this.f9100b);
                this.f9102d = r2;
                return;
            } else if (i2 == 2) {
                i = this.f9099a.mo9732a() + this.f9099a.mo9754s();
                do {
                    j0Var.mo9679a(this.f9099a.mo9746k());
                } while (this.f9099a.mo9732a() < i);
            } else {
                throw C3606c0.m8177d();
            }
        } else {
            int i3 = this.f9100b & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(this.f9099a.mo9746k()));
                    if (!this.f9099a.mo9735b()) {
                        r = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r == this.f9100b);
                this.f9102d = r;
                return;
            } else if (i3 == 2) {
                i = this.f9099a.mo9732a() + this.f9099a.mo9754s();
                do {
                    list.add(Long.valueOf(this.f9099a.mo9746k()));
                } while (this.f9099a.mo9732a() < i);
            } else {
                throw C3606c0.m8177d();
            }
        }
        mo9790a(i);
    }

    /* renamed from: n */
    public int mo9603n() {
        mo9792b(0);
        return this.f9099a.mo9745j();
    }

    /* renamed from: n */
    public void mo9604n(List<Long> list) {
        int r;
        int r2;
        if (list instanceof C3645j0) {
            C3645j0 j0Var = (C3645j0) list;
            int i = this.f9100b & 7;
            if (i == 1) {
                do {
                    j0Var.mo9679a(this.f9099a.mo9748m());
                    if (!this.f9099a.mo9735b()) {
                        r2 = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r2 == this.f9100b);
                this.f9102d = r2;
            } else if (i == 2) {
                int s = this.f9099a.mo9754s();
                mo9796d(s);
                int a = this.f9099a.mo9732a() + s;
                do {
                    j0Var.mo9679a(this.f9099a.mo9748m());
                } while (this.f9099a.mo9732a() < a);
            } else {
                throw C3606c0.m8177d();
            }
        } else {
            int i2 = this.f9100b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f9099a.mo9748m()));
                    if (!this.f9099a.mo9735b()) {
                        r = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r == this.f9100b);
                this.f9102d = r;
            } else if (i2 == 2) {
                int s2 = this.f9099a.mo9754s();
                mo9796d(s2);
                int a2 = this.f9099a.mo9732a() + s2;
                do {
                    list.add(Long.valueOf(this.f9099a.mo9748m()));
                } while (this.f9099a.mo9732a() < a2);
            } else {
                throw C3606c0.m8177d();
            }
        }
    }

    /* renamed from: o */
    public void mo9605o(List<Long> list) {
        int r;
        int r2;
        if (list instanceof C3645j0) {
            C3645j0 j0Var = (C3645j0) list;
            int i = this.f9100b & 7;
            if (i == 1) {
                do {
                    j0Var.mo9679a(this.f9099a.mo9743h());
                    if (!this.f9099a.mo9735b()) {
                        r2 = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r2 == this.f9100b);
                this.f9102d = r2;
            } else if (i == 2) {
                int s = this.f9099a.mo9754s();
                mo9796d(s);
                int a = this.f9099a.mo9732a() + s;
                do {
                    j0Var.mo9679a(this.f9099a.mo9743h());
                } while (this.f9099a.mo9732a() < a);
            } else {
                throw C3606c0.m8177d();
            }
        } else {
            int i2 = this.f9100b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f9099a.mo9743h()));
                    if (!this.f9099a.mo9735b()) {
                        r = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r == this.f9100b);
                this.f9102d = r;
            } else if (i2 == 2) {
                int s2 = this.f9099a.mo9754s();
                mo9796d(s2);
                int a2 = this.f9099a.mo9732a() + s2;
                do {
                    list.add(Long.valueOf(this.f9099a.mo9743h()));
                } while (this.f9099a.mo9732a() < a2);
            } else {
                throw C3606c0.m8177d();
            }
        }
    }

    /* renamed from: o */
    public boolean mo9606o() {
        if (!this.f9099a.mo9735b()) {
            int i = this.f9100b;
            if (i != this.f9101c) {
                return this.f9099a.mo9739d(i);
            }
        }
        return false;
    }

    /* renamed from: p */
    public int mo9607p() {
        mo9792b(5);
        return this.f9099a.mo9747l();
    }

    /* renamed from: p */
    public void mo9608p(List<Integer> list) {
        int i;
        int r;
        int r2;
        if (list instanceof C3591a0) {
            C3591a0 a0Var = (C3591a0) list;
            int i2 = this.f9100b & 7;
            if (i2 == 0) {
                do {
                    a0Var.mo9517e(this.f9099a.mo9745j());
                    if (!this.f9099a.mo9735b()) {
                        r2 = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r2 == this.f9100b);
                this.f9102d = r2;
                return;
            } else if (i2 == 2) {
                i = this.f9099a.mo9732a() + this.f9099a.mo9754s();
                do {
                    a0Var.mo9517e(this.f9099a.mo9745j());
                } while (this.f9099a.mo9732a() < i);
            } else {
                throw C3606c0.m8177d();
            }
        } else {
            int i3 = this.f9100b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f9099a.mo9745j()));
                    if (!this.f9099a.mo9735b()) {
                        r = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r == this.f9100b);
                this.f9102d = r;
                return;
            } else if (i3 == 2) {
                i = this.f9099a.mo9732a() + this.f9099a.mo9754s();
                do {
                    list.add(Integer.valueOf(this.f9099a.mo9745j()));
                } while (this.f9099a.mo9732a() < i);
            } else {
                throw C3606c0.m8177d();
            }
        }
        mo9790a(i);
    }

    /* renamed from: q */
    public long mo9609q() {
        mo9792b(0);
        return this.f9099a.mo9746k();
    }

    /* renamed from: q */
    public void mo9610q(List<Integer> list) {
        int i;
        int r;
        int r2;
        if (list instanceof C3591a0) {
            C3591a0 a0Var = (C3591a0) list;
            int i2 = this.f9100b & 7;
            if (i2 == 0) {
                do {
                    a0Var.mo9517e(this.f9099a.mo9741f());
                    if (!this.f9099a.mo9735b()) {
                        r2 = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r2 == this.f9100b);
                this.f9102d = r2;
                return;
            } else if (i2 == 2) {
                i = this.f9099a.mo9732a() + this.f9099a.mo9754s();
                do {
                    a0Var.mo9517e(this.f9099a.mo9741f());
                } while (this.f9099a.mo9732a() < i);
            } else {
                throw C3606c0.m8177d();
            }
        } else {
            int i3 = this.f9100b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f9099a.mo9741f()));
                    if (!this.f9099a.mo9735b()) {
                        r = this.f9099a.mo9753r();
                    } else {
                        return;
                    }
                } while (r == this.f9100b);
                this.f9102d = r;
                return;
            } else if (i3 == 2) {
                i = this.f9099a.mo9732a() + this.f9099a.mo9754s();
                do {
                    list.add(Integer.valueOf(this.f9099a.mo9741f()));
                } while (this.f9099a.mo9732a() < i);
            } else {
                throw C3606c0.m8177d();
            }
        }
        mo9790a(i);
    }

    /* renamed from: r */
    public String mo9611r() {
        mo9792b(2);
        return this.f9099a.mo9752q();
    }

    public double readDouble() {
        mo9792b(1);
        return this.f9099a.mo9740e();
    }

    public float readFloat() {
        mo9792b(5);
        return this.f9099a.mo9744i();
    }
}
