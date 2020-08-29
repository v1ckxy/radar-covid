package p423w;

import p119o.p120a.C0967p0;
import p392u.p401r.p403c.C4638h;

/* renamed from: w.v */
public final class C4912v {

    /* renamed from: a */
    public final byte[] f11701a;

    /* renamed from: b */
    public int f11702b;

    /* renamed from: c */
    public int f11703c;

    /* renamed from: d */
    public boolean f11704d;

    /* renamed from: e */
    public boolean f11705e;

    /* renamed from: f */
    public C4912v f11706f;

    /* renamed from: g */
    public C4912v f11707g;

    public C4912v() {
        this.f11701a = new byte[8192];
        this.f11705e = true;
        this.f11704d = false;
    }

    public C4912v(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        if (bArr != null) {
            this.f11701a = bArr;
            this.f11702b = i;
            this.f11703c = i2;
            this.f11704d = z;
            this.f11705e = z2;
            return;
        }
        C4638h.m10271a("data");
        throw null;
    }

    /* renamed from: a */
    public final C4912v mo11541a() {
        C4912v vVar = this.f11706f;
        if (vVar == this) {
            vVar = null;
        }
        C4912v vVar2 = this.f11707g;
        if (vVar2 != null) {
            vVar2.f11706f = this.f11706f;
            C4912v vVar3 = this.f11706f;
            if (vVar3 != null) {
                vVar3.f11707g = vVar2;
                this.f11706f = null;
                this.f11707g = null;
                return vVar;
            }
            C4638h.m10269a();
            throw null;
        }
        C4638h.m10269a();
        throw null;
    }

    /* renamed from: a */
    public final C4912v mo11542a(C4912v vVar) {
        if (vVar != null) {
            vVar.f11707g = this;
            vVar.f11706f = this.f11706f;
            C4912v vVar2 = this.f11706f;
            if (vVar2 != null) {
                vVar2.f11707g = vVar;
                this.f11706f = vVar;
                return vVar;
            }
            C4638h.m10269a();
            throw null;
        }
        C4638h.m10271a("segment");
        throw null;
    }

    /* renamed from: b */
    public final C4912v mo11544b() {
        this.f11704d = true;
        C4912v vVar = new C4912v(this.f11701a, this.f11702b, this.f11703c, true, false);
        return vVar;
    }

    /* renamed from: a */
    public final void mo11543a(C4912v vVar, int i) {
        if (vVar == null) {
            C4638h.m10271a("sink");
            throw null;
        } else if (vVar.f11705e) {
            int i2 = vVar.f11703c;
            if (i2 + i > 8192) {
                if (!vVar.f11704d) {
                    int i3 = i2 + i;
                    int i4 = vVar.f11702b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = vVar.f11701a;
                        C0967p0.m2235b(bArr, i4, bArr, 0, i2 - i4);
                        vVar.f11703c -= vVar.f11702b;
                        vVar.f11702b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            C0967p0.m2235b(this.f11701a, this.f11702b, vVar.f11701a, vVar.f11703c, i);
            vVar.f11703c += i;
            this.f11702b += i;
        } else {
            throw new IllegalStateException("only owner can write".toString());
        }
    }
}
