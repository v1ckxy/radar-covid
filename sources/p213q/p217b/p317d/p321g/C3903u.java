package p213q.p217b.p317d.p321g;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p213q.p217b.p317d.p345j.C4206a;
import p213q.p217b.p317d.p345j.C4207b;
import p213q.p217b.p317d.p345j.C4208c;
import p213q.p217b.p317d.p345j.C4209d;

/* renamed from: q.b.d.g.u */
public class C3903u implements C4209d, C4208c {

    /* renamed from: a */
    public final Map<Class<?>, ConcurrentHashMap<C4207b<Object>, Executor>> f9532a = new HashMap();

    /* renamed from: b */
    public Queue<C4206a<?>> f9533b = new ArrayDeque();

    /* renamed from: c */
    public final Executor f9534c;

    public C3903u(Executor executor) {
        this.f9534c = executor;
    }

    /* renamed from: a */
    public final synchronized Set<Entry<C4207b<Object>, Executor>> mo10093a(C4206a<?> aVar) {
        Map map;
        Map<Class<?>, ConcurrentHashMap<C4207b<Object>, Executor>> map2 = this.f9532a;
        if (aVar != null) {
            map = (Map) map2.get(null);
        } else {
            throw null;
        }
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    /* renamed from: a */
    public void mo10094a() {
        Queue<C4206a> queue;
        synchronized (this) {
            queue = null;
            if (this.f9533b != null) {
                Queue<C4206a<?>> queue2 = this.f9533b;
                this.f9533b = null;
                queue = queue2;
            }
        }
        if (queue != null) {
            for (C4206a b : queue) {
                mo10097b(b);
            }
        }
    }

    /* renamed from: a */
    public <T> void mo10096a(Class<T> cls, C4207b<? super T> bVar) {
        mo10095a(cls, this.f9534c, bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new p213q.p217b.p317d.p321g.C3902t(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        r0 = mo10093a(r5).iterator();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10097b(p213q.p217b.p317d.p345j.C4206a<?> r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0036
            monitor-enter(r4)
            java.util.Queue<q.b.d.j.a<?>> r0 = r4.f9533b     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000e
            java.util.Queue<q.b.d.j.a<?>> r0 = r4.f9533b     // Catch:{ all -> 0x0033 }
            r0.add(r5)     // Catch:{ all -> 0x0033 }
            monitor-exit(r4)     // Catch:{ all -> 0x0033 }
            return
        L_0x000e:
            monitor-exit(r4)     // Catch:{ all -> 0x0033 }
            java.util.Set r0 = r4.mo10093a(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            q.b.d.g.t r3 = new q.b.d.g.t
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0017
        L_0x0032:
            return
        L_0x0033:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0033 }
            throw r5
        L_0x0036:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p321g.C3903u.mo10097b(q.b.d.j.a):void");
    }

    /* renamed from: a */
    public synchronized <T> void mo10095a(Class<T> cls, Executor executor, C4207b<? super T> bVar) {
        if (cls == null) {
            throw null;
        } else if (bVar == null) {
            throw null;
        } else if (executor != null) {
            if (!this.f9532a.containsKey(cls)) {
                this.f9532a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f9532a.get(cls)).put(bVar, executor);
        } else {
            throw null;
        }
    }
}
