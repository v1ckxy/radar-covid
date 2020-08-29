package p425x.p426a.p427a;

/* renamed from: x.a.a.c */
public class C4925c extends C4983s {

    /* renamed from: f */
    public static final C4925c f11726f = new C4925c(0);

    /* renamed from: g */
    public static final C4925c f11727g = new C4925c(-1);

    /* renamed from: e */
    public final byte f11728e;

    public C4925c(byte b) {
        this.f11728e = b;
    }

    /* renamed from: b */
    public static C4925c m11134b(byte[] bArr) {
        if (bArr.length == 1) {
            byte b = bArr[0];
            return b != -1 ? b != 0 ? new C4925c(b) : f11726f : f11727g;
        }
        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
    }

    /* renamed from: a */
    public void mo11548a(C4977q qVar, boolean z) {
        byte b = this.f11728e;
        if (z) {
            qVar.f11861a.write(1);
        }
        qVar.mo11616a(1);
        qVar.f11861a.write(b);
    }

    /* renamed from: a */
    public boolean mo11549a(C4983s sVar) {
        boolean z = false;
        if (!(sVar instanceof C4925c)) {
            return false;
        }
        if (mo11566m() == ((C4925c) sVar).mo11566m()) {
            z = true;
        }
        return z;
    }

    /* renamed from: h */
    public int mo11550h() {
        return 3;
    }

    public int hashCode() {
        return mo11566m() ? 1 : 0;
    }

    /* renamed from: i */
    public boolean mo11552i() {
        return false;
    }

    /* renamed from: k */
    public C4983s mo11558k() {
        return mo11566m() ? f11727g : f11726f;
    }

    /* renamed from: m */
    public boolean mo11566m() {
        return this.f11728e != 0;
    }

    public String toString() {
        return mo11566m() ? "TRUE" : "FALSE";
    }
}
