package p369s.p370a.p371a.p378f.p379a;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p375c.C4451d;

/* renamed from: s.a.a.f.a.c */
public final class C4465c implements C4450c, C4451d {

    /* renamed from: e */
    public List<C4450c> f10552e;

    /* renamed from: f */
    public volatile boolean f10553f;

    /* renamed from: a */
    public boolean mo10730a(C4450c cVar) {
        if (!mo10731b(cVar)) {
            return false;
        }
        cVar.mo10714f();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0021, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10731b(p369s.p370a.p371a.p375c.C4450c r3) {
        /*
            r2 = this;
            java.lang.String r0 = "Disposable item is null"
            java.util.Objects.requireNonNull(r3, r0)
            boolean r0 = r2.f10553f
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f10553f     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            java.util.List<s.a.a.c.c> r0 = r2.f10552e     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r3 = 1
            return r3
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p369s.p370a.p371a.p378f.p379a.C4465c.mo10731b(s.a.a.c.c):boolean");
    }

    /* renamed from: c */
    public boolean mo10732c(C4450c cVar) {
        Objects.requireNonNull(cVar, "d is null");
        if (!this.f10553f) {
            synchronized (this) {
                if (!this.f10553f) {
                    List list = this.f10552e;
                    if (list == null) {
                        list = new LinkedList();
                        this.f10552e = list;
                    }
                    list.add(cVar);
                    return true;
                }
            }
        }
        cVar.mo10714f();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r1 != null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r1.hasNext() == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        ((p369s.p370a.p371a.p375c.C4450c) r1.next()).mo10714f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5312c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        if (r2 == null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        r2.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (r2 == null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        if (r2.size() != 1) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        throw p369s.p370a.p371a.p378f.p388h.C4535b.m10204a((java.lang.Throwable) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        throw new p369s.p370a.p371a.p376d.C4453a((java.lang.Iterable<? extends java.lang.Throwable>) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10714f() {
        /*
            r4 = this;
            boolean r0 = r4.f10553f
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r4)
            boolean r0 = r4.f10553f     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            return
        L_0x000c:
            r0 = 1
            r4.f10553f = r0     // Catch:{ all -> 0x0056 }
            java.util.List<s.a.a.c.c> r1 = r4.f10552e     // Catch:{ all -> 0x0056 }
            r2 = 0
            r4.f10552e = r2     // Catch:{ all -> 0x0056 }
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x0018
            goto L_0x0055
        L_0x0018:
            java.util.Iterator r1 = r1.iterator()
        L_0x001c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x003b
            java.lang.Object r3 = r1.next()
            s.a.a.c.c r3 = (p369s.p370a.p371a.p375c.C4450c) r3
            r3.mo10714f()     // Catch:{ all -> 0x002c }
            goto L_0x001c
        L_0x002c:
            r3 = move-exception
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5312c(r3)
            if (r2 != 0) goto L_0x0037
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0037:
            r2.add(r3)
            goto L_0x001c
        L_0x003b:
            if (r2 == 0) goto L_0x0055
            int r1 = r2.size()
            if (r1 != r0) goto L_0x004f
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.RuntimeException r0 = p369s.p370a.p371a.p378f.p388h.C4535b.m10204a(r0)
            throw r0
        L_0x004f:
            s.a.a.d.a r0 = new s.a.a.d.a
            r0.<init>(r2)
            throw r0
        L_0x0055:
            return
        L_0x0056:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p369s.p370a.p371a.p378f.p379a.C4465c.mo10714f():void");
    }
}
