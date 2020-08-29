package p425x.p426a.p445e.p447b.p455h;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p425x.p426a.p427a.C4967n;
import p425x.p426a.p427a.p430e2.C4936a;

/* renamed from: x.a.e.b.h.w */
public final class C5112w {

    /* renamed from: i */
    public static final Map<Integer, C5112w> f12252i;

    /* renamed from: a */
    public final C5111v f12253a;

    /* renamed from: b */
    public final int f12254b;

    /* renamed from: c */
    public final int f12255c;

    /* renamed from: d */
    public final C4967n f12256d;

    /* renamed from: e */
    public final int f12257e;

    /* renamed from: f */
    public final String f12258f;

    /* renamed from: g */
    public final int f12259g;

    /* renamed from: h */
    public final C5097m f12260h;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(1), new C5112w(10, C4936a.f11778c));
        hashMap.put(Integer.valueOf(2), new C5112w(16, C4936a.f11778c));
        hashMap.put(Integer.valueOf(3), new C5112w(20, C4936a.f11778c));
        hashMap.put(Integer.valueOf(4), new C5112w(10, C4936a.f11780e));
        hashMap.put(Integer.valueOf(5), new C5112w(16, C4936a.f11780e));
        hashMap.put(Integer.valueOf(6), new C5112w(20, C4936a.f11780e));
        hashMap.put(Integer.valueOf(7), new C5112w(10, C4936a.f11784i));
        hashMap.put(Integer.valueOf(8), new C5112w(16, C4936a.f11784i));
        hashMap.put(Integer.valueOf(9), new C5112w(20, C4936a.f11784i));
        hashMap.put(Integer.valueOf(10), new C5112w(10, C4936a.f11785j));
        hashMap.put(Integer.valueOf(11), new C5112w(16, C4936a.f11785j));
        hashMap.put(Integer.valueOf(12), new C5112w(20, C4936a.f11785j));
        f12252i = Collections.unmodifiableMap(hashMap);
    }

    public C5112w(int i, C4967n nVar) {
        if (i < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        } else if (nVar != null) {
            this.f12254b = i;
            int i2 = 2;
            while (true) {
                int i3 = this.f12254b;
                if (i2 > i3) {
                    throw new IllegalStateException("should never happen...");
                } else if ((i3 - i2) % 2 == 0) {
                    this.f12255c = i2;
                    String str = (String) C5084f.f12175b.get(nVar);
                    if (str != null) {
                        this.f12258f = str;
                        this.f12256d = nVar;
                        C5097m mVar = new C5097m(nVar);
                        this.f12260h = mVar;
                        int i4 = mVar.f12203b;
                        this.f12259g = i4;
                        int i5 = mVar.f12204c;
                        this.f12257e = i5;
                        this.f12253a = C5083e.m11547b(this.f12258f, i4, i5, mVar.f12205d, i);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("unrecognized digest oid: ");
                    sb.append(nVar);
                    throw new IllegalArgumentException(sb.toString());
                } else {
                    i2++;
                }
            }
        } else {
            throw new NullPointerException("digest == null");
        }
    }

    /* renamed from: a */
    public C5095k mo11762a() {
        return new C5095k(this.f12260h);
    }
}
