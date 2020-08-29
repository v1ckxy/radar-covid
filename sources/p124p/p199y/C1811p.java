package p124p.p199y;

import androidx.work.ListenableWorker;
import java.util.concurrent.TimeUnit;
import p124p.p199y.C1818v.C1819a;
import p124p.p199y.p200x.p209s.C1913p;

/* renamed from: p.y.p */
public final class C1811p extends C1818v {

    /* renamed from: p.y.p$a */
    public static final class C1812a extends C1819a<C1812a, C1811p> {
        public C1812a(Class<? extends ListenableWorker> cls, long j, TimeUnit timeUnit) {
            super(cls);
            C1913p pVar = this.f5302c;
            long millis = timeUnit.toMillis(j);
            if (pVar != null) {
                long j2 = 900000;
                Long valueOf = Long.valueOf(900000);
                String str = "Interval duration lesser than minimum allowed value; Changed to %s";
                if (millis < 900000) {
                    C1800l.m4460a().mo6785d(C1913p.f5526r, String.format(str, new Object[]{valueOf}), new Throwable[0]);
                    millis = 900000;
                }
                if (millis < 900000) {
                    C1800l.m4460a().mo6785d(C1913p.f5526r, String.format(str, new Object[]{valueOf}), new Throwable[0]);
                } else {
                    j2 = millis;
                }
                if (millis < 300000) {
                    C1800l.m4460a().mo6785d(C1913p.f5526r, String.format("Flex duration lesser than minimum allowed value; Changed to %s", new Object[]{Long.valueOf(300000)}), new Throwable[0]);
                    millis = 300000;
                }
                if (millis > j2) {
                    C1800l.m4460a().mo6785d(C1913p.f5526r, String.format("Flex duration greater than interval duration; Changed to %s", new Object[]{Long.valueOf(j2)}), new Throwable[0]);
                    millis = j2;
                }
                pVar.f5534h = j2;
                pVar.f5535i = millis;
                return;
            }
            throw null;
        }

        /* renamed from: b */
        public C1818v mo6786b() {
            if (!this.f5300a || !this.f5302c.f5536j.f5246c) {
                C1913p pVar = this.f5302c;
                if (!pVar.f5543q || !pVar.f5536j.f5246c) {
                    return new C1811p(this);
                }
                throw new IllegalArgumentException("Cannot run in foreground with an idle mode constraint");
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* renamed from: c */
        public C1819a mo6787c() {
            return this;
        }
    }

    public C1811p(C1812a aVar) {
        super(aVar.f5301b, aVar.f5302c, aVar.f5303d);
    }
}
