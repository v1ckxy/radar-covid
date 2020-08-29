package p213q.p217b.p218a.p219a.p220e.p221b;

import p213q.p217b.p317d.p342i.C4193d;
import p213q.p217b.p317d.p342i.C4194e;
import p213q.p217b.p317d.p342i.p343h.C4197a;
import p213q.p217b.p317d.p342i.p343h.C4198b;
import p213q.p217b.p317d.p342i.p344i.C4203e;

/* renamed from: q.b.a.a.e.b.b */
public final class C1972b implements C4197a {

    /* renamed from: a */
    public static final C4197a f5641a = new C1972b();

    /* renamed from: q.b.a.a.e.b.b$a */
    public static final class C1973a implements C4193d<C1971a> {

        /* renamed from: a */
        public static final C1973a f5642a = new C1973a();

        /* renamed from: a */
        public void mo6969a(Object obj, Object obj2) {
            C1971a aVar = (C1971a) obj;
            C4194e eVar = (C4194e) obj2;
            eVar.mo10386a("sdkVersion", (Object) ((C1979c) aVar).f5648a);
            C1979c cVar = (C1979c) aVar;
            eVar.mo10386a("model", (Object) cVar.f5649b);
            eVar.mo10386a("hardware", (Object) cVar.f5650c);
            eVar.mo10386a("device", (Object) cVar.f5651d);
            eVar.mo10386a("product", (Object) cVar.f5652e);
            eVar.mo10386a("osBuild", (Object) cVar.f5653f);
            eVar.mo10386a("manufacturer", (Object) cVar.f5654g);
            eVar.mo10386a("fingerprint", (Object) cVar.f5655h);
        }
    }

    /* renamed from: q.b.a.a.e.b.b$b */
    public static final class C1974b implements C4193d<C1987j> {

        /* renamed from: a */
        public static final C1974b f5643a = new C1974b();

        /* renamed from: a */
        public void mo6969a(Object obj, Object obj2) {
            ((C4194e) obj2).mo10386a("logRequest", (Object) ((C1980d) ((C1987j) obj)).f5656a);
        }
    }

    /* renamed from: q.b.a.a.e.b.b$c */
    public static final class C1975c implements C4193d<C1988k> {

        /* renamed from: a */
        public static final C1975c f5644a = new C1975c();

        /* renamed from: a */
        public void mo6969a(Object obj, Object obj2) {
            C1988k kVar = (C1988k) obj;
            C4194e eVar = (C4194e) obj2;
            eVar.mo10386a("clientType", (Object) ((C1981e) kVar).f5657a);
            eVar.mo10386a("androidClientInfo", (Object) ((C1981e) kVar).f5658b);
        }
    }

    /* renamed from: q.b.a.a.e.b.b$d */
    public static final class C1976d implements C4193d<C1990l> {

        /* renamed from: a */
        public static final C1976d f5645a = new C1976d();

        /* renamed from: a */
        public void mo6969a(Object obj, Object obj2) {
            C4194e eVar = (C4194e) obj2;
            C1982f fVar = (C1982f) ((C1990l) obj);
            eVar.mo10385a("eventTimeMs", fVar.f5659a);
            eVar.mo10386a("eventCode", (Object) fVar.f5660b);
            eVar.mo10385a("eventUptimeMs", fVar.f5661c);
            eVar.mo10386a("sourceExtension", (Object) fVar.f5662d);
            eVar.mo10386a("sourceExtensionJsonProto3", (Object) fVar.f5663e);
            eVar.mo10385a("timezoneOffsetSeconds", fVar.f5664f);
            eVar.mo10386a("networkConnectionInfo", (Object) fVar.f5665g);
        }
    }

    /* renamed from: q.b.a.a.e.b.b$e */
    public static final class C1977e implements C4193d<C1992m> {

        /* renamed from: a */
        public static final C1977e f5646a = new C1977e();

        /* renamed from: a */
        public void mo6969a(Object obj, Object obj2) {
            C4194e eVar = (C4194e) obj2;
            C1984g gVar = (C1984g) ((C1992m) obj);
            eVar.mo10385a("requestTimeMs", gVar.f5673a);
            eVar.mo10385a("requestUptimeMs", gVar.f5674b);
            eVar.mo10386a("clientInfo", (Object) gVar.f5675c);
            eVar.mo10386a("logSource", (Object) gVar.f5676d);
            eVar.mo10386a("logSourceName", (Object) gVar.f5677e);
            eVar.mo10386a("logEvent", (Object) gVar.f5678f);
            eVar.mo10386a("qosTier", (Object) gVar.f5679g);
        }
    }

    /* renamed from: q.b.a.a.e.b.b$f */
    public static final class C1978f implements C4193d<C1994o> {

        /* renamed from: a */
        public static final C1978f f5647a = new C1978f();

        /* renamed from: a */
        public void mo6969a(Object obj, Object obj2) {
            C1994o oVar = (C1994o) obj;
            C4194e eVar = (C4194e) obj2;
            eVar.mo10386a("networkType", (Object) ((C1986i) oVar).f5681a);
            eVar.mo10386a("mobileSubtype", (Object) ((C1986i) oVar).f5682b);
        }
    }

    /* renamed from: a */
    public void mo6968a(C4198b<?> bVar) {
        Class<C1987j> cls = C1987j.class;
        C4203e eVar = (C4203e) bVar;
        eVar.f10138a.put(cls, C1974b.f5643a);
        eVar.f10139b.remove(cls);
        Class<C1980d> cls2 = C1980d.class;
        C4203e eVar2 = (C4203e) bVar;
        eVar2.f10138a.put(cls2, C1974b.f5643a);
        eVar2.f10139b.remove(cls2);
        Class<C1992m> cls3 = C1992m.class;
        eVar2.f10138a.put(cls3, C1977e.f5646a);
        eVar2.f10139b.remove(cls3);
        Class<C1984g> cls4 = C1984g.class;
        eVar2.f10138a.put(cls4, C1977e.f5646a);
        eVar2.f10139b.remove(cls4);
        Class<C1988k> cls5 = C1988k.class;
        eVar2.f10138a.put(cls5, C1975c.f5644a);
        eVar2.f10139b.remove(cls5);
        Class<C1981e> cls6 = C1981e.class;
        eVar2.f10138a.put(cls6, C1975c.f5644a);
        eVar2.f10139b.remove(cls6);
        Class<C1971a> cls7 = C1971a.class;
        eVar2.f10138a.put(cls7, C1973a.f5642a);
        eVar2.f10139b.remove(cls7);
        Class<C1979c> cls8 = C1979c.class;
        eVar2.f10138a.put(cls8, C1973a.f5642a);
        eVar2.f10139b.remove(cls8);
        Class<C1990l> cls9 = C1990l.class;
        eVar2.f10138a.put(cls9, C1976d.f5645a);
        eVar2.f10139b.remove(cls9);
        Class<C1982f> cls10 = C1982f.class;
        eVar2.f10138a.put(cls10, C1976d.f5645a);
        eVar2.f10139b.remove(cls10);
        Class<C1994o> cls11 = C1994o.class;
        eVar2.f10138a.put(cls11, C1978f.f5647a);
        eVar2.f10139b.remove(cls11);
        Class<C1986i> cls12 = C1986i.class;
        eVar2.f10138a.put(cls12, C1978f.f5647a);
        eVar2.f10139b.remove(cls12);
    }
}
