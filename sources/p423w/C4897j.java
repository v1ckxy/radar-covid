package p423w;

import java.io.Serializable;
import java.security.MessageDigest;
import p119o.p120a.C0967p0;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;
import p423w.p424c0.C4889a;

/* renamed from: w.j */
public class C4897j implements Serializable, Comparable<C4897j> {

    /* renamed from: h */
    public static final C4897j f11664h = C4889a.f11656b;

    /* renamed from: i */
    public static final C4898a f11665i = new C4898a(null);

    /* renamed from: e */
    public transient int f11666e;

    /* renamed from: f */
    public transient String f11667f;

    /* renamed from: g */
    public final byte[] f11668g;

    /* renamed from: w.j$a */
    public static final class C4898a {
        public /* synthetic */ C4898a(C4636f fVar) {
        }

        /* renamed from: a */
        public final C4897j mo11509a(String str) {
            if (str != null) {
                return C4889a.m10939a(str);
            }
            C4638h.m10271a("$receiver");
            throw null;
        }

        /* renamed from: b */
        public final C4897j mo11510b(String str) {
            if (str != null) {
                return C4889a.m10945b(str);
            }
            C4638h.m10271a("$receiver");
            throw null;
        }

        /* renamed from: c */
        public final C4897j mo11511c(String str) {
            if (str != null) {
                return C4889a.m10948c(str);
            }
            C4638h.m10271a("$receiver");
            throw null;
        }

        /* renamed from: a */
        public static C4897j m11029a(C4898a aVar, byte[] bArr, int i, int i2, int i3) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            if (aVar == null) {
                throw null;
            } else if (bArr != null) {
                C0967p0.m2197a((long) bArr.length, (long) i, (long) i2);
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                return new C4897j(bArr2);
            } else {
                C4638h.m10271a("$receiver");
                throw null;
            }
        }
    }

    public C4897j(byte[] bArr) {
        if (bArr != null) {
            this.f11668g = bArr;
        } else {
            C4638h.m10271a("data");
            throw null;
        }
    }

    /* renamed from: a */
    public byte mo11495a(int i) {
        return C4889a.m10935a(this, i);
    }

    /* renamed from: a */
    public C4897j mo11496a(String str) {
        if (str != null) {
            byte[] digest = MessageDigest.getInstance(str).digest(this.f11668g);
            C4638h.m10270a((Object) digest, "MessageDigest.getInstance(algorithm).digest(data)");
            return new C4897j(digest);
        }
        C4638h.m10271a("algorithm");
        throw null;
    }

    public int compareTo(Object obj) {
        C4897j jVar = (C4897j) obj;
        if (jVar != null) {
            return C4889a.m10937a(this, jVar);
        }
        C4638h.m10271a("other");
        throw null;
    }

    public boolean equals(Object obj) {
        return C4889a.m10943a(this, obj);
    }

    /* renamed from: f */
    public String mo11502f() {
        return C4889a.m10938a(this);
    }

    /* renamed from: g */
    public int mo11503g() {
        return C4889a.m10944b(this);
    }

    /* renamed from: h */
    public String mo11504h() {
        return C4889a.m10949d(this);
    }

    public int hashCode() {
        return C4889a.m10947c(this);
    }

    /* renamed from: j */
    public byte[] mo11506j() {
        return C4889a.m10950e(this);
    }

    /* renamed from: k */
    public C4897j mo11507k() {
        return C4889a.m10951f(this);
    }

    public String toString() {
        return C4889a.m10952g(this);
    }

    /* renamed from: a */
    public boolean mo11498a(int i, C4897j jVar, int i2, int i3) {
        if (jVar != null) {
            return C4889a.m10941a(this, i, jVar, i2, i3);
        }
        C4638h.m10271a("other");
        throw null;
    }

    /* renamed from: a */
    public boolean mo11499a(int i, byte[] bArr, int i2, int i3) {
        if (bArr != null) {
            return C4889a.m10942a(this, i, bArr, i2, i3);
        }
        C4638h.m10271a("other");
        throw null;
    }

    /* renamed from: a */
    public void mo11497a(C4892f fVar) {
        if (fVar != null) {
            byte[] bArr = this.f11668g;
            fVar.write(bArr, 0, bArr.length);
            return;
        }
        C4638h.m10271a("buffer");
        throw null;
    }
}
