package androidx.work;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import p124p.p199y.C1792e;
import p124p.p199y.C1813q;
import p124p.p199y.C1820w;
import p124p.p199y.p200x.p210t.C1943m;
import p124p.p199y.p200x.p210t.p212q.C1962a;

public final class WorkerParameters {

    /* renamed from: a */
    public UUID f985a;

    /* renamed from: b */
    public C1792e f986b;

    /* renamed from: c */
    public Executor f987c;

    /* renamed from: d */
    public C1820w f988d;

    /* renamed from: androidx.work.WorkerParameters$a */
    public static class C0182a {
        public C0182a() {
            Collections.emptyList();
            Collections.emptyList();
        }
    }

    public WorkerParameters(UUID uuid, C1792e eVar, Collection<String> collection, C0182a aVar, int i, Executor executor, C1962a aVar2, C1820w wVar, C1813q qVar, C1943m mVar) {
        this.f985a = uuid;
        this.f986b = eVar;
        new HashSet(collection);
        this.f987c = executor;
        this.f988d = wVar;
    }
}
