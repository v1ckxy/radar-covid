package p410v.p411m0.p413d;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import p392u.C4561m;
import p392u.p401r.p403c.C4638h;
import p410v.C4685a;
import p410v.C4708f;
import p410v.C4730k0;
import p410v.C4861t;
import p410v.p411m0.C4737b;
import p410v.p411m0.p413d.C4766l.C4767a;
import p410v.p411m0.p416g.C4797f;
import p423w.C4896i;

/* renamed from: v.m0.d.d */
public final class C4757d {

    /* renamed from: a */
    public C4767a f11224a;

    /* renamed from: b */
    public final C4766l f11225b;

    /* renamed from: c */
    public C4761h f11226c;

    /* renamed from: d */
    public boolean f11227d;

    /* renamed from: e */
    public C4730k0 f11228e;

    /* renamed from: f */
    public final C4768m f11229f;

    /* renamed from: g */
    public final C4762i f11230g;

    /* renamed from: h */
    public final C4685a f11231h;

    /* renamed from: i */
    public final C4708f f11232i;

    /* renamed from: j */
    public final C4861t f11233j;

    public C4757d(C4768m mVar, C4762i iVar, C4685a aVar, C4708f fVar, C4861t tVar) {
        if (mVar == null) {
            C4638h.m10271a("transmitter");
            throw null;
        } else if (iVar == null) {
            C4638h.m10271a("connectionPool");
            throw null;
        } else if (aVar == null) {
            C4638h.m10271a("address");
            throw null;
        } else if (fVar == null) {
            C4638h.m10271a("call");
            throw null;
        } else if (tVar != null) {
            this.f11229f = mVar;
            this.f11230g = iVar;
            this.f11231h = aVar;
            this.f11232i = fVar;
            this.f11233j = tVar;
            this.f11225b = new C4766l(this.f11231h, this.f11230g.f11260d, this.f11232i, this.f11233j);
        } else {
            C4638h.m10271a("eventListener");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:140:0x025b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p410v.p411m0.p413d.C4761h mo11115a(int r19, int r20, int r21, int r22, boolean r23) {
        /*
            r18 = this;
            r1 = r18
            v.m0.d.i r2 = r1.f11230g
            monitor-enter(r2)
            v.m0.d.m r0 = r1.f11229f     // Catch:{ all -> 0x0343 }
            boolean r0 = r0.mo11157e()     // Catch:{ all -> 0x0343 }
            if (r0 != 0) goto L_0x033b
            r0 = 0
            r1.f11227d = r0     // Catch:{ all -> 0x0343 }
            v.m0.d.m r3 = r1.f11229f     // Catch:{ all -> 0x0343 }
            v.m0.d.h r3 = r3.f11283g     // Catch:{ all -> 0x0343 }
            v.m0.d.m r4 = r1.f11229f     // Catch:{ all -> 0x0343 }
            v.m0.d.h r4 = r4.f11283g     // Catch:{ all -> 0x0343 }
            r5 = 0
            if (r4 == 0) goto L_0x0030
            v.m0.d.m r4 = r1.f11229f     // Catch:{ all -> 0x0343 }
            v.m0.d.h r4 = r4.f11283g     // Catch:{ all -> 0x0343 }
            if (r4 == 0) goto L_0x002c
            boolean r4 = r4.f11247i     // Catch:{ all -> 0x0343 }
            if (r4 == 0) goto L_0x0030
            v.m0.d.m r4 = r1.f11229f     // Catch:{ all -> 0x0343 }
            java.net.Socket r4 = r4.mo11158f()     // Catch:{ all -> 0x0343 }
            goto L_0x0031
        L_0x002c:
            p392u.p401r.p403c.C4638h.m10269a()     // Catch:{ all -> 0x0343 }
            throw r5
        L_0x0030:
            r4 = r5
        L_0x0031:
            v.m0.d.m r6 = r1.f11229f     // Catch:{ all -> 0x0343 }
            v.m0.d.h r6 = r6.f11283g     // Catch:{ all -> 0x0343 }
            if (r6 == 0) goto L_0x003d
            v.m0.d.m r3 = r1.f11229f     // Catch:{ all -> 0x0343 }
            v.m0.d.h r3 = r3.f11283g     // Catch:{ all -> 0x0343 }
            r6 = r5
            goto L_0x003f
        L_0x003d:
            r6 = r3
            r3 = r5
        L_0x003f:
            r7 = 1
            if (r3 != 0) goto L_0x0072
            v.m0.d.i r8 = r1.f11230g     // Catch:{ all -> 0x0343 }
            v.a r9 = r1.f11231h     // Catch:{ all -> 0x0343 }
            v.m0.d.m r10 = r1.f11229f     // Catch:{ all -> 0x0343 }
            boolean r8 = r8.mo11140a(r9, r10, r5, r0)     // Catch:{ all -> 0x0343 }
            if (r8 == 0) goto L_0x0055
            v.m0.d.m r3 = r1.f11229f     // Catch:{ all -> 0x0343 }
            v.m0.d.h r3 = r3.f11283g     // Catch:{ all -> 0x0343 }
            r8 = r5
            r9 = r7
            goto L_0x0074
        L_0x0055:
            v.k0 r8 = r1.f11228e     // Catch:{ all -> 0x0343 }
            if (r8 == 0) goto L_0x005e
            v.k0 r8 = r1.f11228e     // Catch:{ all -> 0x0343 }
            r1.f11228e = r5     // Catch:{ all -> 0x0343 }
            goto L_0x006c
        L_0x005e:
            boolean r8 = r18.mo11119c()     // Catch:{ all -> 0x0343 }
            if (r8 == 0) goto L_0x0072
            v.m0.d.m r8 = r1.f11229f     // Catch:{ all -> 0x0343 }
            v.m0.d.h r8 = r8.f11283g     // Catch:{ all -> 0x0343 }
            if (r8 == 0) goto L_0x006e
            v.k0 r8 = r8.f11255q     // Catch:{ all -> 0x0343 }
        L_0x006c:
            r9 = r0
            goto L_0x0074
        L_0x006e:
            p392u.p401r.p403c.C4638h.m10269a()     // Catch:{ all -> 0x0343 }
            throw r5
        L_0x0072:
            r9 = r0
            r8 = r5
        L_0x0074:
            monitor-exit(r2)
            if (r4 == 0) goto L_0x007a
            p410v.p411m0.C4737b.m10465a(r4)
        L_0x007a:
            if (r6 == 0) goto L_0x0092
            v.t r2 = r1.f11233j
            v.f r4 = r1.f11232i
            if (r6 == 0) goto L_0x008e
            if (r2 == 0) goto L_0x008d
            if (r4 == 0) goto L_0x0087
            goto L_0x0092
        L_0x0087:
            java.lang.String r0 = "call"
            p392u.p401r.p403c.C4638h.m10271a(r0)
            throw r5
        L_0x008d:
            throw r5
        L_0x008e:
            p392u.p401r.p403c.C4638h.m10269a()
            throw r5
        L_0x0092:
            if (r9 == 0) goto L_0x00a2
            v.t r2 = r1.f11233j
            v.f r4 = r1.f11232i
            if (r3 == 0) goto L_0x009e
            r2.mo11356a(r4, r3)
            goto L_0x00a2
        L_0x009e:
            p392u.p401r.p403c.C4638h.m10269a()
            throw r5
        L_0x00a2:
            if (r3 == 0) goto L_0x00a5
            return r3
        L_0x00a5:
            if (r8 != 0) goto L_0x0257
            v.m0.d.l$a r2 = r1.f11224a
            if (r2 == 0) goto L_0x00b1
            boolean r2 = r2.mo11147a()
            if (r2 != 0) goto L_0x0257
        L_0x00b1:
            v.m0.d.l r2 = r1.f11225b
            boolean r4 = r2.mo11145a()
            if (r4 == 0) goto L_0x0251
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x00be:
            boolean r6 = r2.mo11146b()
            if (r6 == 0) goto L_0x0238
            boolean r6 = r2.mo11146b()
            java.lang.String r10 = "No route to "
            if (r6 == 0) goto L_0x0217
            java.util.List<? extends java.net.Proxy> r6 = r2.f11267a
            int r11 = r2.f11268b
            int r12 = r11 + 1
            r2.f11268b = r12
            java.lang.Object r6 = r6.get(r11)
            java.net.Proxy r6 = (java.net.Proxy) r6
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r2.f11269c = r11
            java.net.Proxy$Type r12 = r6.type()
            java.net.Proxy$Type r13 = java.net.Proxy.Type.DIRECT
            if (r12 == r13) goto L_0x013a
            java.net.Proxy$Type r12 = r6.type()
            java.net.Proxy$Type r13 = java.net.Proxy.Type.SOCKS
            if (r12 != r13) goto L_0x00f2
            goto L_0x013a
        L_0x00f2:
            java.net.SocketAddress r12 = r6.address()
            boolean r13 = r12 instanceof java.net.InetSocketAddress
            if (r13 == 0) goto L_0x011f
            java.net.InetSocketAddress r12 = (java.net.InetSocketAddress) r12
            if (r12 == 0) goto L_0x0119
            java.net.InetAddress r13 = r12.getAddress()
            if (r13 == 0) goto L_0x010b
            java.lang.String r13 = r13.getHostAddress()
            java.lang.String r14 = "address.hostAddress"
            goto L_0x0111
        L_0x010b:
            java.lang.String r13 = r12.getHostName()
            java.lang.String r14 = "hostName"
        L_0x0111:
            p392u.p401r.p403c.C4638h.m10270a(r13, r14)
            int r12 = r12.getPort()
            goto L_0x0142
        L_0x0119:
            java.lang.String r0 = "$this$socketHost"
            p392u.p401r.p403c.C4638h.m10271a(r0)
            throw r5
        L_0x011f:
            java.lang.String r0 = "Proxy.address() is not an InetSocketAddress: "
            java.lang.StringBuilder r0 = p213q.p214a.p215a.p216a.C1965a.m4756a(r0)
            java.lang.Class r2 = r12.getClass()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x013a:
            v.a r12 = r2.f11271e
            v.x r12 = r12.f10881a
            java.lang.String r13 = r12.f11620e
            int r12 = r12.f11621f
        L_0x0142:
            r14 = 65535(0xffff, float:9.1834E-41)
            if (r7 > r12) goto L_0x01f5
            if (r14 < r12) goto L_0x01f5
            java.net.Proxy$Type r10 = r6.type()
            java.net.Proxy$Type r14 = java.net.Proxy.Type.SOCKS
            if (r10 != r14) goto L_0x0159
            java.net.InetSocketAddress r10 = java.net.InetSocketAddress.createUnresolved(r13, r12)
            r11.add(r10)
            goto L_0x0194
        L_0x0159:
            v.t r10 = r2.f11274h
            v.f r14 = r2.f11273g
            if (r10 == 0) goto L_0x01f4
            java.lang.String r10 = "call"
            if (r14 == 0) goto L_0x01f0
            if (r13 == 0) goto L_0x01ea
            v.a r14 = r2.f11271e
            v.s r14 = r14.f10884d
            java.util.List r14 = r14.mo11353a(r13)
            boolean r15 = r14.isEmpty()
            if (r15 != 0) goto L_0x01cc
            v.t r13 = r2.f11274h
            v.f r15 = r2.f11273g
            if (r13 == 0) goto L_0x01cb
            if (r15 == 0) goto L_0x01c7
            java.util.Iterator r10 = r14.iterator()
        L_0x017f:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x0194
            java.lang.Object r13 = r10.next()
            java.net.InetAddress r13 = (java.net.InetAddress) r13
            java.net.InetSocketAddress r14 = new java.net.InetSocketAddress
            r14.<init>(r13, r12)
            r11.add(r14)
            goto L_0x017f
        L_0x0194:
            java.util.List<? extends java.net.InetSocketAddress> r10 = r2.f11269c
            java.util.Iterator r10 = r10.iterator()
        L_0x019a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01bf
            java.lang.Object r11 = r10.next()
            java.net.InetSocketAddress r11 = (java.net.InetSocketAddress) r11
            v.k0 r12 = new v.k0
            v.a r13 = r2.f11271e
            r12.<init>(r13, r6, r11)
            v.m0.d.j r11 = r2.f11272f
            boolean r11 = r11.mo11144c(r12)
            if (r11 == 0) goto L_0x01bb
            java.util.List<v.k0> r11 = r2.f11270d
            r11.add(r12)
            goto L_0x019a
        L_0x01bb:
            r4.add(r12)
            goto L_0x019a
        L_0x01bf:
            boolean r6 = r4.isEmpty()
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x00be
            goto L_0x0238
        L_0x01c7:
            p392u.p401r.p403c.C4638h.m10271a(r10)
            throw r5
        L_0x01cb:
            throw r5
        L_0x01cc:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            v.a r2 = r2.f11271e
            v.s r2 = r2.f10884d
            r3.append(r2)
            java.lang.String r2 = " returned no addresses for "
            r3.append(r2)
            r3.append(r13)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x01ea:
            java.lang.String r0 = "domainName"
            p392u.p401r.p403c.C4638h.m10271a(r0)
            throw r5
        L_0x01f0:
            p392u.p401r.p403c.C4638h.m10271a(r10)
            throw r5
        L_0x01f4:
            throw r5
        L_0x01f5:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r13)
            r3 = 58
            r2.append(r3)
            r2.append(r12)
            java.lang.String r3 = "; port is out of range"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0217:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r3 = p213q.p214a.p215a.p216a.C1965a.m4756a(r10)
            v.a r4 = r2.f11271e
            v.x r4 = r4.f10881a
            java.lang.String r4 = r4.f11620e
            r3.append(r4)
            java.lang.String r4 = "; exhausted proxy configurations: "
            r3.append(r4)
            java.util.List<? extends java.net.Proxy> r2 = r2.f11267a
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x0238:
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L_0x0248
            java.util.List<v.k0> r6 = r2.f11270d
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5263a(r4, r6)
            java.util.List<v.k0> r2 = r2.f11270d
            r2.clear()
        L_0x0248:
            v.m0.d.l$a r2 = new v.m0.d.l$a
            r2.<init>(r4)
            r1.f11224a = r2
            r2 = r7
            goto L_0x0258
        L_0x0251:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0257:
            r2 = r0
        L_0x0258:
            v.m0.d.i r4 = r1.f11230g
            monitor-enter(r4)
            v.m0.d.m r6 = r1.f11229f     // Catch:{ all -> 0x0338 }
            boolean r6 = r6.mo11157e()     // Catch:{ all -> 0x0338 }
            if (r6 != 0) goto L_0x0330
            if (r2 == 0) goto L_0x0281
            v.m0.d.l$a r2 = r1.f11224a     // Catch:{ all -> 0x0338 }
            if (r2 == 0) goto L_0x027d
            java.util.List<v.k0> r2 = r2.f11276b     // Catch:{ all -> 0x0338 }
            v.m0.d.i r6 = r1.f11230g     // Catch:{ all -> 0x0338 }
            v.a r10 = r1.f11231h     // Catch:{ all -> 0x0338 }
            v.m0.d.m r11 = r1.f11229f     // Catch:{ all -> 0x0338 }
            boolean r0 = r6.mo11140a(r10, r11, r2, r0)     // Catch:{ all -> 0x0338 }
            if (r0 == 0) goto L_0x0282
            v.m0.d.m r0 = r1.f11229f     // Catch:{ all -> 0x0338 }
            v.m0.d.h r3 = r0.f11283g     // Catch:{ all -> 0x0338 }
            r9 = r7
            goto L_0x0282
        L_0x027d:
            p392u.p401r.p403c.C4638h.m10269a()     // Catch:{ all -> 0x0338 }
            throw r5
        L_0x0281:
            r2 = r5
        L_0x0282:
            if (r9 != 0) goto L_0x02ba
            if (r8 != 0) goto L_0x02aa
            v.m0.d.l$a r0 = r1.f11224a     // Catch:{ all -> 0x0338 }
            if (r0 == 0) goto L_0x02a6
            boolean r3 = r0.mo11147a()     // Catch:{ all -> 0x0338 }
            if (r3 == 0) goto L_0x02a0
            java.util.List<v.k0> r3 = r0.f11276b     // Catch:{ all -> 0x0338 }
            int r6 = r0.f11275a     // Catch:{ all -> 0x0338 }
            int r8 = r6 + 1
            r0.f11275a = r8     // Catch:{ all -> 0x0338 }
            java.lang.Object r0 = r3.get(r6)     // Catch:{ all -> 0x0338 }
            r8 = r0
            v.k0 r8 = (p410v.C4730k0) r8     // Catch:{ all -> 0x0338 }
            goto L_0x02aa
        L_0x02a0:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0338 }
            r0.<init>()     // Catch:{ all -> 0x0338 }
            throw r0     // Catch:{ all -> 0x0338 }
        L_0x02a6:
            p392u.p401r.p403c.C4638h.m10269a()     // Catch:{ all -> 0x0338 }
            throw r5
        L_0x02aa:
            v.m0.d.h r3 = new v.m0.d.h     // Catch:{ all -> 0x0338 }
            v.m0.d.i r0 = r1.f11230g     // Catch:{ all -> 0x0338 }
            if (r8 == 0) goto L_0x02b6
            r3.<init>(r0, r8)     // Catch:{ all -> 0x0338 }
            r1.f11226c = r3     // Catch:{ all -> 0x0338 }
            goto L_0x02ba
        L_0x02b6:
            p392u.p401r.p403c.C4638h.m10269a()     // Catch:{ all -> 0x0338 }
            throw r5
        L_0x02ba:
            monitor-exit(r4)
            if (r9 == 0) goto L_0x02cb
            v.t r0 = r1.f11233j
            v.f r2 = r1.f11232i
            if (r3 == 0) goto L_0x02c7
            r0.mo11356a(r2, r3)
            return r3
        L_0x02c7:
            p392u.p401r.p403c.C4638h.m10269a()
            throw r5
        L_0x02cb:
            if (r3 == 0) goto L_0x032c
            v.f r0 = r1.f11232i
            v.t r4 = r1.f11233j
            r10 = r3
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r22
            r15 = r23
            r16 = r0
            r17 = r4
            r10.mo11123a(r11, r12, r13, r14, r15, r16, r17)
            v.m0.d.i r0 = r1.f11230g
            v.m0.d.j r0 = r0.f11260d
            v.k0 r4 = r3.f11255q
            r0.mo11142a(r4)
            v.m0.d.i r4 = r1.f11230g
            monitor-enter(r4)
            r1.f11226c = r5     // Catch:{ all -> 0x0329 }
            v.m0.d.i r0 = r1.f11230g     // Catch:{ all -> 0x0329 }
            v.a r6 = r1.f11231h     // Catch:{ all -> 0x0329 }
            v.m0.d.m r9 = r1.f11229f     // Catch:{ all -> 0x0329 }
            boolean r0 = r0.mo11140a(r6, r9, r2, r7)     // Catch:{ all -> 0x0329 }
            if (r0 == 0) goto L_0x030a
            r3.f11247i = r7     // Catch:{ all -> 0x0329 }
            java.net.Socket r0 = r3.mo11133d()     // Catch:{ all -> 0x0329 }
            v.m0.d.m r2 = r1.f11229f     // Catch:{ all -> 0x0329 }
            v.m0.d.h r3 = r2.f11283g     // Catch:{ all -> 0x0329 }
            r1.f11228e = r8     // Catch:{ all -> 0x0329 }
            goto L_0x0315
        L_0x030a:
            v.m0.d.i r0 = r1.f11230g     // Catch:{ all -> 0x0329 }
            r0.mo11139a(r3)     // Catch:{ all -> 0x0329 }
            v.m0.d.m r0 = r1.f11229f     // Catch:{ all -> 0x0329 }
            r0.mo11153a(r3)     // Catch:{ all -> 0x0329 }
            r0 = r5
        L_0x0315:
            monitor-exit(r4)
            if (r0 == 0) goto L_0x031b
            p410v.p411m0.C4737b.m10465a(r0)
        L_0x031b:
            v.t r0 = r1.f11233j
            v.f r2 = r1.f11232i
            if (r3 == 0) goto L_0x0325
            r0.mo11356a(r2, r3)
            return r3
        L_0x0325:
            p392u.p401r.p403c.C4638h.m10269a()
            throw r5
        L_0x0329:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x032c:
            p392u.p401r.p403c.C4638h.m10269a()
            throw r5
        L_0x0330:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0338 }
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)     // Catch:{ all -> 0x0338 }
            throw r0     // Catch:{ all -> 0x0338 }
        L_0x0338:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x033b:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0343 }
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch:{ all -> 0x0343 }
            throw r0     // Catch:{ all -> 0x0343 }
        L_0x0343:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p413d.C4757d.mo11115a(int, int, int, int, boolean):v.m0.d.h");
    }

    /* renamed from: b */
    public final boolean mo11118b() {
        boolean z;
        synchronized (this.f11230g) {
            z = this.f11227d;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo11119c() {
        C4761h hVar = this.f11229f.f11283g;
        if (hVar != null) {
            if (hVar == null) {
                C4638h.m10269a();
                throw null;
            } else if (hVar.f11248j == 0) {
                if (hVar == null) {
                    C4638h.m10269a();
                    throw null;
                } else if (C4737b.m10468a(hVar.f11255q.f11115a.f10881a, this.f11231h.f10881a)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void mo11120d() {
        boolean z = !Thread.holdsLock(this.f11230g);
        if (!C4561m.f10774a || z) {
            synchronized (this.f11230g) {
                this.f11227d = true;
            }
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    /* renamed from: a */
    public final C4761h mo11116a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5;
        int soTimeout;
        while (true) {
            C4761h a = mo11115a(i, i2, i3, i4, z);
            synchronized (this.f11230g) {
                i5 = a.f11249k;
            }
            if (i5 == 0) {
                return a;
            }
            Socket socket = a.f11241c;
            if (socket != null) {
                C4896i iVar = a.f11245g;
                if (iVar != null) {
                    boolean z3 = false;
                    if (!socket.isClosed() && !socket.isInputShutdown() && !socket.isOutputShutdown()) {
                        C4797f fVar = a.f11244f;
                        if (fVar != null) {
                            z3 = !fVar.mo11215a();
                        } else {
                            if (z2) {
                                try {
                                    soTimeout = socket.getSoTimeout();
                                    socket.setSoTimeout(1);
                                    boolean z4 = !iVar.mo11460i();
                                    socket.setSoTimeout(soTimeout);
                                    z3 = z4;
                                } catch (SocketTimeoutException unused) {
                                } catch (IOException unused2) {
                                } catch (Throwable th) {
                                    socket.setSoTimeout(soTimeout);
                                    throw th;
                                }
                            }
                            z3 = true;
                        }
                    }
                    if (z3) {
                        return a;
                    }
                    a.mo11132c();
                } else {
                    C4638h.m10269a();
                    throw null;
                }
            } else {
                C4638h.m10269a();
                throw null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0039, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11117a() {
        /*
            r4 = this;
            v.m0.d.i r0 = r4.f11230g
            monitor-enter(r0)
            v.k0 r1 = r4.f11228e     // Catch:{ all -> 0x003a }
            r2 = 1
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)
            return r2
        L_0x000a:
            boolean r1 = r4.mo11119c()     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0021
            v.m0.d.m r1 = r4.f11229f     // Catch:{ all -> 0x003a }
            v.m0.d.h r1 = r1.f11283g     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x001c
            v.k0 r1 = r1.f11255q     // Catch:{ all -> 0x003a }
            r4.f11228e = r1     // Catch:{ all -> 0x003a }
            monitor-exit(r0)
            return r2
        L_0x001c:
            p392u.p401r.p403c.C4638h.m10269a()     // Catch:{ all -> 0x003a }
            r0 = 0
            throw r0
        L_0x0021:
            v.m0.d.l$a r1 = r4.f11224a     // Catch:{ all -> 0x003a }
            r3 = 0
            if (r1 == 0) goto L_0x002b
            boolean r1 = r1.mo11147a()     // Catch:{ all -> 0x003a }
            goto L_0x002c
        L_0x002b:
            r1 = r3
        L_0x002c:
            if (r1 != 0) goto L_0x0038
            v.m0.d.l r1 = r4.f11225b     // Catch:{ all -> 0x003a }
            boolean r1 = r1.mo11145a()     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r2 = r3
        L_0x0038:
            monitor-exit(r0)
            return r2
        L_0x003a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p413d.C4757d.mo11117a():boolean");
    }
}
