package p410v.p411m0.p413d;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.p393n.C4570i;
import p392u.p401r.p403c.C4638h;
import p410v.C4685a;
import p410v.C4708f;
import p410v.C4730k0;
import p410v.C4861t;
import p410v.C4873x;
import p410v.p411m0.C4737b;

/* renamed from: v.m0.d.l */
public final class C4766l {

    /* renamed from: a */
    public List<? extends Proxy> f11267a;

    /* renamed from: b */
    public int f11268b;

    /* renamed from: c */
    public List<? extends InetSocketAddress> f11269c;

    /* renamed from: d */
    public final List<C4730k0> f11270d;

    /* renamed from: e */
    public final C4685a f11271e;

    /* renamed from: f */
    public final C4764j f11272f;

    /* renamed from: g */
    public final C4708f f11273g;

    /* renamed from: h */
    public final C4861t f11274h;

    /* renamed from: v.m0.d.l$a */
    public static final class C4767a {

        /* renamed from: a */
        public int f11275a;

        /* renamed from: b */
        public final List<C4730k0> f11276b;

        public C4767a(List<C4730k0> list) {
            if (list != null) {
                this.f11276b = list;
            } else {
                C4638h.m10271a("routes");
                throw null;
            }
        }

        /* renamed from: a */
        public final boolean mo11147a() {
            return this.f11275a < this.f11276b.size();
        }
    }

    public C4766l(C4685a aVar, C4764j jVar, C4708f fVar, C4861t tVar) {
        List<? extends Proxy> list;
        if (aVar == null) {
            C4638h.m10271a("address");
            throw null;
        } else if (jVar != null) {
            String str = "call";
            if (fVar == null) {
                C4638h.m10271a(str);
                throw null;
            } else if (tVar != null) {
                this.f11271e = aVar;
                this.f11272f = jVar;
                this.f11273g = fVar;
                this.f11274h = tVar;
                C4570i iVar = C4570i.f10779e;
                this.f11267a = iVar;
                this.f11269c = iVar;
                this.f11270d = new ArrayList();
                C4685a aVar2 = this.f11271e;
                C4873x xVar = aVar2.f10881a;
                Proxy proxy = aVar2.f10890j;
                C4861t tVar2 = this.f11274h;
                C4708f fVar2 = this.f11273g;
                if (tVar2 == null) {
                    throw null;
                } else if (fVar2 == null) {
                    C4638h.m10271a(str);
                    throw null;
                } else if (xVar != null) {
                    if (proxy != null) {
                        list = C2286e.m5332e(proxy);
                    } else {
                        List select = aVar2.f10891k.select(xVar.mo11396h());
                        if (select == null || !(!select.isEmpty())) {
                            list = C4737b.m10458a((T[]) new Proxy[]{Proxy.NO_PROXY});
                        } else {
                            list = C4737b.m10474b(select);
                        }
                    }
                    this.f11267a = list;
                    this.f11268b = 0;
                    C4861t tVar3 = this.f11274h;
                    C4708f fVar3 = this.f11273g;
                    if (tVar3 == null) {
                        throw null;
                    } else if (fVar3 == null) {
                        C4638h.m10271a(str);
                        throw null;
                    } else if (list == null) {
                        C4638h.m10271a("proxies");
                        throw null;
                    }
                } else {
                    C4638h.m10271a("url");
                    throw null;
                }
            } else {
                C4638h.m10271a("eventListener");
                throw null;
            }
        } else {
            C4638h.m10271a("routeDatabase");
            throw null;
        }
    }

    /* renamed from: a */
    public final boolean mo11145a() {
        return mo11146b() || (this.f11270d.isEmpty() ^ true);
    }

    /* renamed from: b */
    public final boolean mo11146b() {
        return this.f11268b < this.f11267a.size();
    }
}
