package p124p.p199y;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p124p.p199y.p200x.C1822a;

/* renamed from: p.y.b */
public final class C1785b {

    /* renamed from: a */
    public final Executor f5225a;

    /* renamed from: b */
    public final Executor f5226b;

    /* renamed from: c */
    public final C1820w f5227c;

    /* renamed from: d */
    public final C1799k f5228d;

    /* renamed from: e */
    public final C1822a f5229e;

    /* renamed from: f */
    public final int f5230f;

    /* renamed from: g */
    public final int f5231g;

    /* renamed from: h */
    public final int f5232h;

    /* renamed from: i */
    public final int f5233i;

    /* renamed from: p.y.b$a */
    public static final class C1786a {

        /* renamed from: a */
        public Executor f5234a;

        /* renamed from: b */
        public C1820w f5235b;

        /* renamed from: c */
        public C1799k f5236c;

        /* renamed from: d */
        public Executor f5237d;

        /* renamed from: e */
        public C1822a f5238e;

        /* renamed from: f */
        public int f5239f = 4;

        /* renamed from: g */
        public int f5240g = 0;

        /* renamed from: h */
        public int f5241h = Integer.MAX_VALUE;

        /* renamed from: i */
        public int f5242i = 20;
    }

    /* renamed from: p.y.b$b */
    public interface C1787b {
        /* renamed from: a */
        C1785b mo6765a();
    }

    public C1785b(C1786a aVar) {
        Executor executor = aVar.f5234a;
        if (executor == null) {
            executor = mo6764a();
        }
        this.f5225a = executor;
        Executor executor2 = aVar.f5237d;
        if (executor2 == null) {
            executor2 = mo6764a();
        }
        this.f5226b = executor2;
        C1820w wVar = aVar.f5235b;
        if (wVar == null) {
            wVar = C1820w.m4480a();
        }
        this.f5227c = wVar;
        C1799k kVar = aVar.f5236c;
        if (kVar == null) {
            kVar = new C1798j();
        }
        this.f5228d = kVar;
        C1822a aVar2 = aVar.f5238e;
        if (aVar2 == null) {
            aVar2 = new C1822a();
        }
        this.f5229e = aVar2;
        this.f5230f = aVar.f5239f;
        this.f5231g = aVar.f5240g;
        this.f5232h = aVar.f5241h;
        this.f5233i = aVar.f5242i;
    }

    /* renamed from: a */
    public final Executor mo6764a() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }
}
