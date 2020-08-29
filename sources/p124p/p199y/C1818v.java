package p124p.p199y;

import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import p124p.p199y.p200x.p209s.C1913p;

/* renamed from: p.y.v */
public abstract class C1818v {

    /* renamed from: a */
    public UUID f5297a;

    /* renamed from: b */
    public C1913p f5298b;

    /* renamed from: c */
    public Set<String> f5299c;

    /* renamed from: p.y.v$a */
    public static abstract class C1819a<B extends C1819a<?, ?>, W extends C1818v> {

        /* renamed from: a */
        public boolean f5300a = false;

        /* renamed from: b */
        public UUID f5301b = UUID.randomUUID();

        /* renamed from: c */
        public C1913p f5302c;

        /* renamed from: d */
        public Set<String> f5303d = new HashSet();

        public C1819a(Class<? extends ListenableWorker> cls) {
            this.f5302c = new C1913p(this.f5301b.toString(), cls.getName());
            this.f5303d.add(cls.getName());
            mo6787c();
        }

        /* renamed from: a */
        public final W mo6794a() {
            W b = mo6786b();
            this.f5301b = UUID.randomUUID();
            C1913p pVar = new C1913p(this.f5302c);
            this.f5302c = pVar;
            pVar.f5527a = this.f5301b.toString();
            return b;
        }

        /* renamed from: b */
        public abstract W mo6786b();

        /* renamed from: c */
        public abstract B mo6787c();
    }

    public C1818v(UUID uuid, C1913p pVar, Set<String> set) {
        this.f5297a = uuid;
        this.f5298b = pVar;
        this.f5299c = set;
    }

    /* renamed from: a */
    public String mo6793a() {
        return this.f5297a.toString();
    }
}
