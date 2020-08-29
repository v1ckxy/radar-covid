package p425x.p426a.p445e.p447b.p455h;

import p119o.p120a.C0967p0;

/* renamed from: x.a.e.b.h.o */
public abstract class C5099o {

    /* renamed from: a */
    public final int f12210a;

    /* renamed from: b */
    public final long f12211b;

    /* renamed from: c */
    public final int f12212c;

    /* renamed from: d */
    public final int f12213d;

    /* renamed from: x.a.e.b.h.o$a */
    public static abstract class C5100a<T extends C5100a> {

        /* renamed from: a */
        public final int f12214a;

        /* renamed from: b */
        public int f12215b = 0;

        /* renamed from: c */
        public long f12216c = 0;

        /* renamed from: d */
        public int f12217d = 0;

        public C5100a(int i) {
            this.f12214a = i;
        }

        /* renamed from: a */
        public abstract T mo11745a();

        /* renamed from: a */
        public T mo11756a(int i) {
            this.f12217d = i;
            return mo11745a();
        }

        /* renamed from: a */
        public T mo11757a(long j) {
            this.f12216c = j;
            return mo11745a();
        }

        /* renamed from: b */
        public T mo11758b(int i) {
            this.f12215b = i;
            return mo11745a();
        }
    }

    public C5099o(C5100a aVar) {
        this.f12210a = aVar.f12215b;
        this.f12211b = aVar.f12216c;
        this.f12212c = aVar.f12214a;
        this.f12213d = aVar.f12217d;
    }

    /* renamed from: a */
    public byte[] mo11744a() {
        byte[] bArr = new byte[32];
        C0967p0.m2233b(this.f12210a, bArr, 0);
        C0967p0.m2198a(this.f12211b, bArr, 4);
        C0967p0.m2233b(this.f12212c, bArr, 12);
        C0967p0.m2233b(this.f12213d, bArr, 28);
        return bArr;
    }
}
