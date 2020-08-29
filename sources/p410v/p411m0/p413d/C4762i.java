package p410v.p411m0.p413d;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.C4561m;
import p392u.p401r.p403c.C4638h;
import p410v.C4685a;
import p410v.C4713h;
import p410v.C4719i;
import p410v.C4730k0;
import p410v.C4866v;
import p410v.p411m0.C4737b;
import p410v.p411m0.p413d.C4768m.C4769a;
import p410v.p411m0.p418i.C4839f;
import p410v.p411m0.p418i.C4839f.C4840a;
import p410v.p411m0.p421k.C4852d;

/* renamed from: v.m0.d.i */
public final class C4762i {

    /* renamed from: g */
    public static final ThreadPoolExecutor f11256g;

    /* renamed from: a */
    public final long f11257a;

    /* renamed from: b */
    public final C4763a f11258b;

    /* renamed from: c */
    public final ArrayDeque<C4761h> f11259c;

    /* renamed from: d */
    public final C4764j f11260d;

    /* renamed from: e */
    public boolean f11261e;

    /* renamed from: f */
    public final int f11262f;

    /* renamed from: v.m0.d.i$a */
    public static final class C4763a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C4762i f11263e;

        public C4763a(C4762i iVar) {
            this.f11263e = iVar;
        }

        public void run() {
            while (true) {
                long a = this.f11263e.mo11136a(System.nanoTime());
                if (a != -1) {
                    try {
                        C4737b.m10464a((Object) this.f11263e, a);
                    } catch (InterruptedException unused) {
                        this.f11263e.mo11137a();
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C4737b.m10460a("OkHttp ConnectionPool", true));
        f11256g = threadPoolExecutor;
    }

    public C4762i(int i, long j, TimeUnit timeUnit) {
        if (timeUnit != null) {
            this.f11262f = i;
            this.f11257a = timeUnit.toNanos(j);
            this.f11258b = new C4763a(this);
            this.f11259c = new ArrayDeque<>();
            this.f11260d = new C4764j();
            if (!(j > 0)) {
                throw new IllegalArgumentException(C1965a.m4748a("keepAliveDuration <= 0: ", j).toString());
            }
            return;
        }
        C4638h.m10271a("timeUnit");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0059, code lost:
        if (r6 == null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005b, code lost:
        p410v.p411m0.C4737b.m10465a(r6.mo11133d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0064, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0065, code lost:
        p392u.p401r.p403c.C4638h.m10269a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0068, code lost:
        throw null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo11136a(long r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.util.ArrayDeque<v.m0.d.h> r0 = r12.f11259c     // Catch:{ all -> 0x0069 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0069 }
            r1 = 0
            r2 = 0
            r3 = -9223372036854775808
            r6 = r1
            r5 = r2
            r7 = r5
        L_0x000e:
            boolean r8 = r0.hasNext()     // Catch:{ all -> 0x0069 }
            if (r8 == 0) goto L_0x0035
            java.lang.Object r8 = r0.next()     // Catch:{ all -> 0x0069 }
            v.m0.d.h r8 = (p410v.p411m0.p413d.C4761h) r8     // Catch:{ all -> 0x0069 }
            java.lang.String r9 = "connection"
            p392u.p401r.p403c.C4638h.m10270a(r8, r9)     // Catch:{ all -> 0x0069 }
            int r9 = r12.mo11135a(r8, r13)     // Catch:{ all -> 0x0069 }
            if (r9 <= 0) goto L_0x0028
            int r7 = r7 + 1
            goto L_0x000e
        L_0x0028:
            int r5 = r5 + 1
            long r9 = r8.f11253o     // Catch:{ all -> 0x0069 }
            long r9 = r13 - r9
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x000e
            r6 = r8
            r3 = r9
            goto L_0x000e
        L_0x0035:
            long r13 = r12.f11257a     // Catch:{ all -> 0x0069 }
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 >= 0) goto L_0x0053
            int r13 = r12.f11262f     // Catch:{ all -> 0x0069 }
            if (r5 <= r13) goto L_0x0040
            goto L_0x0053
        L_0x0040:
            if (r5 <= 0) goto L_0x0047
            long r13 = r12.f11257a     // Catch:{ all -> 0x0069 }
            long r13 = r13 - r3
            monitor-exit(r12)
            return r13
        L_0x0047:
            if (r7 <= 0) goto L_0x004d
            long r13 = r12.f11257a     // Catch:{ all -> 0x0069 }
            monitor-exit(r12)
            return r13
        L_0x004d:
            r12.f11261e = r2     // Catch:{ all -> 0x0069 }
            r13 = -1
            monitor-exit(r12)
            return r13
        L_0x0053:
            java.util.ArrayDeque<v.m0.d.h> r13 = r12.f11259c     // Catch:{ all -> 0x0069 }
            r13.remove(r6)     // Catch:{ all -> 0x0069 }
            monitor-exit(r12)
            if (r6 == 0) goto L_0x0065
            java.net.Socket r13 = r6.mo11133d()
            p410v.p411m0.C4737b.m10465a(r13)
            r13 = 0
            return r13
        L_0x0065:
            p392u.p401r.p403c.C4638h.m10269a()
            throw r1
        L_0x0069:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p413d.C4762i.mo11136a(long):long");
    }

    /* renamed from: a */
    public final void mo11138a(C4730k0 k0Var, IOException iOException) {
        if (k0Var == null) {
            C4638h.m10271a("failedRoute");
            throw null;
        } else if (iOException != null) {
            if (k0Var.f11116b.type() != Type.DIRECT) {
                C4685a aVar = k0Var.f11115a;
                aVar.f10891k.connectFailed(aVar.f10881a.mo11396h(), k0Var.f11116b.address(), iOException);
            }
            this.f11260d.mo11143b(k0Var);
        } else {
            C4638h.m10271a("failure");
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo11137a() {
        ArrayList<C4761h> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator it = this.f11259c.iterator();
            C4638h.m10270a((Object) it, "connections.iterator()");
            while (it.hasNext()) {
                C4761h hVar = (C4761h) it.next();
                if (hVar.f11252n.isEmpty()) {
                    hVar.f11247i = true;
                    C4638h.m10270a((Object) hVar, "connection");
                    arrayList.add(hVar);
                    it.remove();
                }
            }
        }
        for (C4761h d : arrayList) {
            C4737b.m10465a(d.mo11133d());
        }
    }

    /* renamed from: a */
    public final int mo11135a(C4761h hVar, long j) {
        List<Reference<C4768m>> list = hVar.f11252n;
        int i = 0;
        while (i < list.size()) {
            Reference reference = (Reference) list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C4769a aVar = (C4769a) reference;
                StringBuilder a = C1965a.m4756a("A connection to ");
                a.append(hVar.f11255q.f11115a.f10881a);
                a.append(" was leaked. ");
                a.append("Did you forget to close a response body?");
                String sb = a.toString();
                C4840a aVar2 = C4839f.f11548c;
                C4839f.f11546a.mo11299a(sb, aVar.f11292a);
                list.remove(i);
                hVar.f11247i = true;
                if (list.isEmpty()) {
                    hVar.f11253o = j - this.f11257a;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* renamed from: a */
    public final void mo11139a(C4761h hVar) {
        if (hVar != null) {
            boolean holdsLock = Thread.holdsLock(this);
            if (!C4561m.f10774a || holdsLock) {
                if (!this.f11261e) {
                    this.f11261e = true;
                    f11256g.execute(this.f11258b);
                }
                this.f11259c.add(hVar);
                return;
            }
            throw new AssertionError("Assertion failed");
        }
        C4638h.m10271a("connection");
        throw null;
    }

    /* renamed from: a */
    public final boolean mo11140a(C4685a aVar, C4768m mVar, List<C4730k0> list, boolean z) {
        boolean z2;
        boolean z3;
        if (aVar == null) {
            C4638h.m10271a("address");
            throw null;
        } else if (mVar != null) {
            boolean holdsLock = Thread.holdsLock(this);
            if (!C4561m.f10774a || holdsLock) {
                Iterator it = this.f11259c.iterator();
                while (true) {
                    boolean z4 = false;
                    if (!it.hasNext()) {
                        return false;
                    }
                    C4761h hVar = (C4761h) it.next();
                    if (!z || hVar.mo11131b()) {
                        if (hVar.f11252n.size() < hVar.f11251m && !hVar.f11247i && hVar.f11255q.f11115a.mo10966a(aVar)) {
                            if (!C4638h.m10272a((Object) aVar.f10881a.f11620e, (Object) hVar.f11255q.f11115a.f10881a.f11620e)) {
                                if (!(hVar.f11244f == null || list == null)) {
                                    if (!list.isEmpty()) {
                                        Iterator it2 = list.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                break;
                                            }
                                            C4730k0 k0Var = (C4730k0) it2.next();
                                            if (k0Var.f11116b.type() == Type.DIRECT && hVar.f11255q.f11116b.type() == Type.DIRECT && C4638h.m10272a((Object) hVar.f11255q.f11117c, (Object) k0Var.f11117c)) {
                                                z3 = true;
                                                continue;
                                            } else {
                                                z3 = false;
                                                continue;
                                            }
                                            if (z3) {
                                                z2 = true;
                                                break;
                                            }
                                        }
                                    }
                                    z2 = false;
                                    if (z2 && aVar.f10887g == C4852d.f11565a && hVar.mo11130a(aVar.f10881a)) {
                                        try {
                                            C4713h hVar2 = aVar.f10888h;
                                            if (hVar2 != null) {
                                                String str = aVar.f10881a.f11620e;
                                                C4866v vVar = hVar.f11242d;
                                                if (vVar != null) {
                                                    List a = vVar.mo11360a();
                                                    if (str == null) {
                                                        C4638h.m10271a("hostname");
                                                        throw null;
                                                    } else if (a != null) {
                                                        hVar2.mo11022a(str, new C4719i(hVar2, a, str));
                                                    } else {
                                                        C4638h.m10271a("peerCertificates");
                                                        throw null;
                                                    }
                                                } else {
                                                    C4638h.m10269a();
                                                    throw null;
                                                }
                                            } else {
                                                C4638h.m10269a();
                                                throw null;
                                            }
                                        } catch (SSLPeerUnverifiedException unused) {
                                        }
                                    }
                                }
                            }
                            z4 = true;
                        }
                        if (z4) {
                            C4638h.m10270a((Object) hVar, "connection");
                            mVar.mo11153a(hVar);
                            return true;
                        }
                    }
                }
            } else {
                throw new AssertionError("Assertion failed");
            }
        } else {
            C4638h.m10271a("transmitter");
            throw null;
        }
    }
}
