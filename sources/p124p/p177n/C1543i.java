package p124p.p177n;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map.Entry;
import p124p.p137c.p138a.p140b.C1234a;
import p124p.p137c.p138a.p140b.C1235b.C1238c;
import p124p.p177n.C1537e.C1538a;
import p124p.p177n.C1537e.C1539b;

/* renamed from: p.n.i */
public class C1543i extends C1537e {

    /* renamed from: a */
    public C1234a<C1541g, C1544a> f4558a = new C1234a<>();

    /* renamed from: b */
    public C1539b f4559b;

    /* renamed from: c */
    public final WeakReference<C1542h> f4560c;

    /* renamed from: d */
    public int f4561d = 0;

    /* renamed from: e */
    public boolean f4562e = false;

    /* renamed from: f */
    public boolean f4563f = false;

    /* renamed from: g */
    public ArrayList<C1539b> f4564g = new ArrayList<>();

    /* renamed from: p.n.i$a */
    public static class C1544a {

        /* renamed from: a */
        public C1539b f4565a;

        /* renamed from: b */
        public C1540f f4566b;

        public C1544a(C1541g gVar, C1539b bVar) {
            this.f4566b = C1547l.m3943a((Object) gVar);
            this.f4565a = bVar;
        }

        /* renamed from: a */
        public void mo6234a(C1542h hVar, C1538a aVar) {
            C1539b b = C1543i.m3930b(aVar);
            this.f4565a = C1543i.m3928a(this.f4565a, b);
            this.f4566b.mo9a(hVar, aVar);
            this.f4565a = b;
        }
    }

    public C1543i(C1542h hVar) {
        this.f4560c = new WeakReference<>(hVar);
        this.f4559b = C1539b.INITIALIZED;
    }

    /* renamed from: a */
    public static C1539b m3928a(C1539b bVar, C1539b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* renamed from: b */
    public static C1538a m3929b(C1539b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return C1538a.ON_CREATE;
        }
        if (ordinal == 2) {
            return C1538a.ON_START;
        }
        if (ordinal == 3) {
            return C1538a.ON_RESUME;
        }
        if (ordinal != 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected state value ");
            sb.append(bVar);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public static C1539b m3930b(C1538a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return C1539b.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return C1539b.DESTROYED;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected event value ");
                        sb.append(aVar);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
            return C1539b.STARTED;
        }
        return C1539b.CREATED;
    }

    /* renamed from: a */
    public final void mo6229a() {
        ArrayList<C1539b> arrayList = this.f4564g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: a */
    public void mo6230a(C1538a aVar) {
        mo6231a(m3930b(aVar));
    }

    /* renamed from: a */
    public final void mo6231a(C1539b bVar) {
        if (this.f4559b != bVar) {
            this.f4559b = bVar;
            if (this.f4562e || this.f4561d != 0) {
                this.f4563f = true;
                return;
            }
            this.f4562e = true;
            mo6233b();
            this.f4562e = false;
        }
    }

    /* renamed from: a */
    public void mo6227a(C1541g gVar) {
        C1539b bVar = this.f4559b;
        C1539b bVar2 = C1539b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = C1539b.INITIALIZED;
        }
        C1544a aVar = new C1544a(gVar, bVar2);
        if (((C1544a) this.f4558a.mo5411b(gVar, aVar)) == null) {
            C1542h hVar = (C1542h) this.f4560c.get();
            if (hVar != null) {
                boolean z = this.f4561d != 0 || this.f4562e;
                C1539b b = mo6232b(gVar);
                this.f4561d++;
                while (aVar.f4565a.compareTo(b) < 0 && this.f4558a.f3514i.containsKey(gVar)) {
                    this.f4564g.add(aVar.f4565a);
                    aVar.mo6234a(hVar, m3929b(aVar.f4565a));
                    mo6229a();
                    b = mo6232b(gVar);
                }
                if (!z) {
                    mo6233b();
                }
                this.f4561d--;
            }
        }
    }

    /* renamed from: b */
    public final C1539b mo6232b(C1541g gVar) {
        C1234a<C1541g, C1544a> aVar = this.f4558a;
        C1539b bVar = null;
        Entry entry = aVar.f3514i.containsKey(gVar) ? ((C1238c) aVar.f3514i.get(gVar)).f3522h : null;
        C1539b bVar2 = entry != null ? ((C1544a) entry.getValue()).f4565a : null;
        if (!this.f4564g.isEmpty()) {
            ArrayList<C1539b> arrayList = this.f4564g;
            bVar = (C1539b) arrayList.get(arrayList.size() - 1);
        }
        return m3928a(m3928a(this.f4559b, bVar2), bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0140 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6233b() {
        /*
            r8 = this;
            java.lang.ref.WeakReference<p.n.h> r0 = r8.f4560c
            java.lang.Object r0 = r0.get()
            p.n.h r0 = (p124p.p177n.C1542h) r0
            if (r0 == 0) goto L_0x0141
        L_0x000a:
            p.c.a.b.a<p.n.g, p.n.i$a> r1 = r8.f4558a
            int r2 = r1.f3518h
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0013
            goto L_0x002f
        L_0x0013:
            p.c.a.b.b$c<K, V> r1 = r1.f3515e
            java.lang.Object r1 = r1.getValue()
            p.n.i$a r1 = (p124p.p177n.C1543i.C1544a) r1
            p.n.e$b r1 = r1.f4565a
            p.c.a.b.a<p.n.g, p.n.i$a> r2 = r8.f4558a
            p.c.a.b.b$c<K, V> r2 = r2.f3516f
            java.lang.Object r2 = r2.getValue()
            p.n.i$a r2 = (p124p.p177n.C1543i.C1544a) r2
            p.n.e$b r2 = r2.f4565a
            if (r1 != r2) goto L_0x0031
            p.n.e$b r1 = r8.f4559b
            if (r1 != r2) goto L_0x0031
        L_0x002f:
            r1 = r3
            goto L_0x0032
        L_0x0031:
            r1 = r4
        L_0x0032:
            r8.f4563f = r4
            if (r1 != 0) goto L_0x0140
            p.n.e$b r1 = r8.f4559b
            p.c.a.b.a<p.n.g, p.n.i$a> r2 = r8.f4558a
            p.c.a.b.b$c<K, V> r2 = r2.f3515e
            java.lang.Object r2 = r2.getValue()
            p.n.i$a r2 = (p124p.p177n.C1543i.C1544a) r2
            p.n.e$b r2 = r2.f4565a
            int r1 = r1.compareTo(r2)
            if (r1 >= 0) goto L_0x00dc
            p.c.a.b.a<p.n.g, p.n.i$a> r1 = r8.f4558a
            p.c.a.b.b$b r2 = new p.c.a.b.b$b
            p.c.a.b.b$c<K, V> r5 = r1.f3516f
            p.c.a.b.b$c<K, V> r6 = r1.f3515e
            r2.<init>(r5, r6)
            java.util.WeakHashMap<p.c.a.b.b$f<K, V>, java.lang.Boolean> r1 = r1.f3517g
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.put(r2, r4)
        L_0x005e:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x00dc
            boolean r1 = r8.f4563f
            if (r1 != 0) goto L_0x00dc
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r4 = r1.getValue()
            p.n.i$a r4 = (p124p.p177n.C1543i.C1544a) r4
        L_0x0074:
            p.n.e$b r5 = r4.f4565a
            p.n.e$b r6 = r8.f4559b
            int r5 = r5.compareTo(r6)
            if (r5 <= 0) goto L_0x005e
            boolean r5 = r8.f4563f
            if (r5 != 0) goto L_0x005e
            p.c.a.b.a<p.n.g, p.n.i$a> r5 = r8.f4558a
            java.lang.Object r6 = r1.getKey()
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x005e
            p.n.e$b r5 = r4.f4565a
            int r6 = r5.ordinal()
            if (r6 == 0) goto L_0x00d6
            if (r6 == r3) goto L_0x00d0
            r7 = 2
            if (r6 == r7) goto L_0x00be
            r7 = 3
            if (r6 == r7) goto L_0x00bb
            r7 = 4
            if (r6 != r7) goto L_0x00a4
            p.n.e$a r5 = p124p.p177n.C1537e.C1538a.ON_PAUSE
            goto L_0x00c0
        L_0x00a4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected state value "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00bb:
            p.n.e$a r5 = p124p.p177n.C1537e.C1538a.ON_STOP
            goto L_0x00c0
        L_0x00be:
            p.n.e$a r5 = p124p.p177n.C1537e.C1538a.ON_DESTROY
        L_0x00c0:
            p.n.e$b r6 = m3930b(r5)
            java.util.ArrayList<p.n.e$b> r7 = r8.f4564g
            r7.add(r6)
            r4.mo6234a(r0, r5)
            r8.mo6229a()
            goto L_0x0074
        L_0x00d0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x00d6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x00dc:
            p.c.a.b.a<p.n.g, p.n.i$a> r1 = r8.f4558a
            p.c.a.b.b$c<K, V> r1 = r1.f3516f
            boolean r2 = r8.f4563f
            if (r2 != 0) goto L_0x000a
            if (r1 == 0) goto L_0x000a
            p.n.e$b r2 = r8.f4559b
            java.lang.Object r1 = r1.getValue()
            p.n.i$a r1 = (p124p.p177n.C1543i.C1544a) r1
            p.n.e$b r1 = r1.f4565a
            int r1 = r2.compareTo(r1)
            if (r1 <= 0) goto L_0x000a
            p.c.a.b.a<p.n.g, p.n.i$a> r1 = r8.f4558a
            p.c.a.b.b$d r1 = r1.mo5415c()
        L_0x00fc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x000a
            boolean r2 = r8.f4563f
            if (r2 != 0) goto L_0x000a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            p.n.i$a r3 = (p124p.p177n.C1543i.C1544a) r3
        L_0x0112:
            p.n.e$b r4 = r3.f4565a
            p.n.e$b r5 = r8.f4559b
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L_0x00fc
            boolean r4 = r8.f4563f
            if (r4 != 0) goto L_0x00fc
            p.c.a.b.a<p.n.g, p.n.i$a> r4 = r8.f4558a
            java.lang.Object r5 = r2.getKey()
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x00fc
            p.n.e$b r4 = r3.f4565a
            java.util.ArrayList<p.n.e$b> r5 = r8.f4564g
            r5.add(r4)
            p.n.e$b r4 = r3.f4565a
            p.n.e$a r4 = m3929b(r4)
            r3.mo6234a(r0, r4)
            r8.mo6229a()
            goto L_0x0112
        L_0x0140:
            return
        L_0x0141:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p177n.C1543i.mo6233b():void");
    }
}
