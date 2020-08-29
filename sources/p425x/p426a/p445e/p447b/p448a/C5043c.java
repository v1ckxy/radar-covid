package p425x.p426a.p445e.p447b.p448a;

import java.util.Collections;
import java.util.List;
import p425x.p426a.p469f.C5162c;

/* renamed from: x.a.e.b.a.c */
public class C5043c extends C5048g {

    /* renamed from: e */
    public final int f12050e;

    /* renamed from: f */
    public final boolean f12051f;

    /* renamed from: g */
    public List<C5049h> f12052g;

    /* renamed from: h */
    public List<C5052j> f12053h;

    /* renamed from: i */
    public final long f12054i;

    /* renamed from: j */
    public long f12055j = 0;

    public C5043c(int i, List<C5049h> list, List<C5052j> list2, long j, long j2, boolean z) {
        super(true);
        this.f12050e = i;
        this.f12052g = Collections.unmodifiableList(list);
        this.f12053h = Collections.unmodifiableList(list2);
        this.f12055j = j;
        this.f12054i = j2;
        this.f12051f = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p425x.p426a.p445e.p447b.p448a.C5043c m11505a(java.lang.Object r11) {
        /*
            boolean r0 = r11 instanceof p425x.p426a.p445e.p447b.p448a.C5043c
            if (r0 == 0) goto L_0x0007
            x.a.e.b.a.c r11 = (p425x.p426a.p445e.p447b.p448a.C5043c) r11
            return r11
        L_0x0007:
            boolean r0 = r11 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x0059
            r0 = r11
            java.io.DataInputStream r0 = (java.io.DataInputStream) r0
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0051
            int r3 = r0.readInt()
            long r6 = r0.readLong()
            long r8 = r0.readLong()
            boolean r10 = r0.readBoolean()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0 = 0
            r1 = r0
        L_0x0030:
            if (r1 >= r3) goto L_0x003c
            x.a.e.b.a.h r2 = p425x.p426a.p445e.p447b.p448a.C5049h.m11510a(r11)
            r4.add(r2)
            int r1 = r1 + 1
            goto L_0x0030
        L_0x003c:
            int r1 = r3 + -1
            if (r0 >= r1) goto L_0x004a
            x.a.e.b.a.j r1 = p425x.p426a.p445e.p447b.p448a.C5052j.m11517a(r11)
            r5.add(r1)
            int r0 = r0 + 1
            goto L_0x003c
        L_0x004a:
            x.a.e.b.a.c r11 = new x.a.e.b.a.c
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r8, r10)
            return r11
        L_0x0051:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "unknown version for hss private key"
            r11.<init>(r0)
            throw r11
        L_0x0059:
            boolean r0 = r11 instanceof byte[]
            if (r0 == 0) goto L_0x007c
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x0075 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0075 }
            byte[] r11 = (byte[]) r11     // Catch:{ all -> 0x0075 }
            r2.<init>(r11)     // Catch:{ all -> 0x0075 }
            r1.<init>(r2)     // Catch:{ all -> 0x0075 }
            x.a.e.b.a.c r11 = m11505a(r1)     // Catch:{ all -> 0x0072 }
            r1.close()
            return r11
        L_0x0072:
            r11 = move-exception
            r0 = r1
            goto L_0x0076
        L_0x0075:
            r11 = move-exception
        L_0x0076:
            if (r0 == 0) goto L_0x007b
            r0.close()
        L_0x007b:
            throw r11
        L_0x007c:
            boolean r0 = r11 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x008b
            java.io.InputStream r11 = (java.io.InputStream) r11
            byte[] r11 = p425x.p426a.p469f.p471j.C5173a.m11610a(r11)
            x.a.e.b.a.c r11 = m11505a(r11)
            return r11
        L_0x008b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "cannot parse "
            java.lang.String r11 = p213q.p214a.p215a.p216a.C1965a.m4750a(r1, r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p425x.p426a.p445e.p447b.p448a.C5043c.m11505a(java.lang.Object):x.a.e.b.a.c");
    }

    /* renamed from: a */
    public synchronized C5044d mo11705a() {
        return new C5044d(this.f12050e, ((C5049h) this.f12052g.get(0)).mo11716b());
    }

    public Object clone() {
        try {
            return m11505a(getEncoded());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5043c.class != obj.getClass()) {
            return false;
        }
        C5043c cVar = (C5043c) obj;
        if (this.f12050e == cVar.f12050e && this.f12051f == cVar.f12051f && this.f12054i == cVar.f12054i && this.f12055j == cVar.f12055j && this.f12052g.equals(cVar.f12052g)) {
            return this.f12053h.equals(cVar.f12053h);
        }
        return false;
    }

    public synchronized byte[] getEncoded() {
        C5041a aVar;
        aVar = new C5041a();
        aVar.mo11701a(0);
        aVar.mo11701a(this.f12050e);
        long j = this.f12055j;
        aVar.mo11701a((int) (j >>> 32));
        aVar.mo11701a((int) j);
        long j2 = this.f12054i;
        aVar.mo11701a((int) (j2 >>> 32));
        aVar.mo11701a((int) j2);
        aVar.f12047a.write(this.f12051f ? 1 : 0);
        for (C5049h a : this.f12052g) {
            aVar.mo11702a((C5162c) a);
        }
        for (C5052j a2 : this.f12053h) {
            aVar.mo11702a((C5162c) a2);
        }
        return aVar.mo11704a();
    }

    public int hashCode() {
        int hashCode = (this.f12053h.hashCode() + ((this.f12052g.hashCode() + (((this.f12050e * 31) + (this.f12051f ? 1 : 0)) * 31)) * 31)) * 31;
        long j = this.f12054i;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f12055j;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }
}
