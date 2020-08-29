package p425x.p426a.p445e.p447b.p455h;

import java.io.Serializable;

/* renamed from: x.a.e.b.h.c */
public class C5081c implements Serializable, Cloneable {

    /* renamed from: e */
    public C5110u f12162e;

    /* renamed from: f */
    public final int f12163f;

    /* renamed from: g */
    public int f12164g;

    /* renamed from: h */
    public int f12165h;

    /* renamed from: i */
    public boolean f12166i = false;

    /* renamed from: j */
    public boolean f12167j = false;

    public C5081c(int i) {
        this.f12163f = i;
    }

    /* renamed from: b */
    public int mo11739b() {
        if (!this.f12166i || this.f12167j) {
            return Integer.MAX_VALUE;
        }
        return this.f12164g;
    }

    public C5081c clone() {
        C5081c cVar = new C5081c(this.f12163f);
        cVar.f12162e = this.f12162e;
        cVar.f12164g = this.f12164g;
        cVar.f12165h = this.f12165h;
        cVar.f12166i = this.f12166i;
        cVar.f12167j = this.f12167j;
        return cVar;
    }
}
