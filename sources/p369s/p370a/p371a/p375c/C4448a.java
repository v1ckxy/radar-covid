package p369s.p370a.p371a.p375c;

import java.util.Objects;
import p369s.p370a.p371a.p378f.p388h.C4537c;

/* renamed from: s.a.a.c.a */
public final class C4448a implements C4450c, C4451d {

    /* renamed from: e */
    public C4537c<C4450c> f10542e;

    /* renamed from: f */
    public volatile boolean f10543f;

    /* renamed from: a */
    public boolean mo10730a(C4450c cVar) {
        if (!mo10731b(cVar)) {
            return false;
        }
        cVar.mo10714f();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0049, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046 A[DONT_GENERATE] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10731b(p369s.p370a.p371a.p375c.C4450c r8) {
        /*
            r7 = this;
            java.lang.String r0 = "disposable is null"
            java.util.Objects.requireNonNull(r8, r0)
            boolean r0 = r7.f10543f
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r7)
            boolean r0 = r7.f10543f     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r7)     // Catch:{ all -> 0x004a }
            return r1
        L_0x0012:
            s.a.a.f.h.c<s.a.a.c.c> r0 = r7.f10542e     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0048
            T[] r2 = r0.f10755e     // Catch:{ all -> 0x004a }
            int r3 = r0.f10752b     // Catch:{ all -> 0x004a }
            int r4 = r8.hashCode()     // Catch:{ all -> 0x004a }
            int r4 = p369s.p370a.p371a.p378f.p388h.C4537c.m10207a(r4)     // Catch:{ all -> 0x004a }
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x004a }
            r6 = 1
            if (r5 != 0) goto L_0x002a
        L_0x0028:
            r8 = r1
            goto L_0x0043
        L_0x002a:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x004a }
            if (r5 == 0) goto L_0x0035
        L_0x0030:
            r0.mo10805a(r4, r2, r3)     // Catch:{ all -> 0x004a }
            r8 = r6
            goto L_0x0043
        L_0x0035:
            int r4 = r4 + r6
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x004a }
            if (r5 != 0) goto L_0x003c
            goto L_0x0028
        L_0x003c:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x004a }
            if (r5 == 0) goto L_0x0035
            goto L_0x0030
        L_0x0043:
            if (r8 != 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            monitor-exit(r7)     // Catch:{ all -> 0x004a }
            return r6
        L_0x0048:
            monitor-exit(r7)     // Catch:{ all -> 0x004a }
            return r1
        L_0x004a:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x004a }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p369s.p370a.p371a.p375c.C4448a.mo10731b(s.a.a.c.c):boolean");
    }

    /* renamed from: c */
    public boolean mo10732c(C4450c cVar) {
        Objects.requireNonNull(cVar, "disposable is null");
        if (!this.f10543f) {
            synchronized (this) {
                if (!this.f10543f) {
                    C4537c<C4450c> cVar2 = this.f10542e;
                    if (cVar2 == null) {
                        cVar2 = new C4537c<>();
                        this.f10542e = cVar2;
                    }
                    cVar2.mo10806a(cVar);
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
        r1 = r1.f10755e;
        r3 = r1.length;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r5 >= r3) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        r6 = r1[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        if ((r6 instanceof p369s.p370a.p371a.p375c.C4450c) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        ((p369s.p370a.p371a.p375c.C4450c) r6).mo10714f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5312c(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        if (r2 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        r2.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (r2 == null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        if (r2.size() != 1) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        throw p369s.p370a.p371a.p378f.p388h.C4535b.m10204a((java.lang.Throwable) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        throw new p369s.p370a.p371a.p376d.C4453a((java.lang.Iterable<? extends java.lang.Throwable>) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0055, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10714f() {
        /*
            r8 = this;
            boolean r0 = r8.f10543f
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r8)
            boolean r0 = r8.f10543f     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            return
        L_0x000c:
            r0 = 1
            r8.f10543f = r0     // Catch:{ all -> 0x0056 }
            s.a.a.f.h.c<s.a.a.c.c> r1 = r8.f10542e     // Catch:{ all -> 0x0056 }
            r2 = 0
            r8.f10542e = r2     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x0018
            goto L_0x0055
        L_0x0018:
            T[] r1 = r1.f10755e
            int r3 = r1.length
            r4 = 0
            r5 = r4
        L_0x001d:
            if (r5 >= r3) goto L_0x003c
            r6 = r1[r5]
            boolean r7 = r6 instanceof p369s.p370a.p371a.p375c.C4450c
            if (r7 == 0) goto L_0x0039
            s.a.a.c.c r6 = (p369s.p370a.p371a.p375c.C4450c) r6     // Catch:{ all -> 0x002b }
            r6.mo10714f()     // Catch:{ all -> 0x002b }
            goto L_0x0039
        L_0x002b:
            r6 = move-exception
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5312c(r6)
            if (r2 != 0) goto L_0x0036
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0036:
            r2.add(r6)
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x001d
        L_0x003c:
            if (r2 == 0) goto L_0x0055
            int r1 = r2.size()
            if (r1 != r0) goto L_0x004f
            java.lang.Object r0 = r2.get(r4)
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
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p369s.p370a.p371a.p375c.C4448a.mo10714f():void");
    }
}
