package p213q.p217b.p317d.p322h.p323e.p326k;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p213q.p217b.p218a.p219a.C1966a;
import p213q.p217b.p218a.p219a.C1967b;
import p213q.p217b.p218a.p219a.C1968c;
import p213q.p217b.p218a.p219a.C1969d;
import p213q.p217b.p218a.p219a.p222f.C2003a.C2005b;
import p213q.p217b.p218a.p219a.p222f.C2006b;
import p213q.p217b.p218a.p219a.p222f.C2006b.C2008b;
import p213q.p217b.p218a.p219a.p222f.C2012e;
import p213q.p217b.p218a.p219a.p222f.C2018i;
import p213q.p217b.p218a.p219a.p222f.C2018i.C2019a;
import p213q.p217b.p218a.p219a.p222f.C2021k;
import p213q.p217b.p218a.p219a.p222f.C2022l;
import p213q.p217b.p218a.p219a.p222f.C2023m;
import p213q.p217b.p218a.p219a.p222f.p225r.C2047e;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p270l.C3239a;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p213q.p217b.p218a.p231b.p270l.C3257j;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p322h.p323e.p327l.C4010b;
import p213q.p217b.p317d.p322h.p323e.p328m.C4043b;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4118e;
import p213q.p217b.p317d.p322h.p323e.p331o.C4137g;
import p213q.p217b.p317d.p322h.p323e.p336r.C4160a;
import p213q.p217b.p317d.p322h.p323e.p336r.C4161b;
import p213q.p217b.p317d.p322h.p323e.p336r.C4162c;

/* renamed from: q.b.d.h.e.k.w0 */
public class C3997w0 {

    /* renamed from: a */
    public final C3952i0 f9773a;

    /* renamed from: b */
    public final C4137g f9774b;

    /* renamed from: c */
    public final C4162c f9775c;

    /* renamed from: d */
    public final C4010b f9776d;

    /* renamed from: e */
    public final C4001y0 f9777e;

    /* renamed from: f */
    public String f9778f;

    public C3997w0(C3952i0 i0Var, C4137g gVar, C4162c cVar, C4010b bVar, C4001y0 y0Var) {
        this.f9773a = i0Var;
        this.f9774b = gVar;
        this.f9775c = cVar;
        this.f9776d = bVar;
        this.f9777e = y0Var;
    }

    /* renamed from: a */
    public C3255i<Void> mo10196a(Executor executor, C3961m0 m0Var) {
        C3997w0 w0Var = this;
        C3961m0 m0Var2 = m0Var;
        Throwable th = null;
        if (m0Var2 == C3961m0.NONE) {
            C3913b.f9552c.mo10108a("Send via DataTransport disabled. Removing DataTransport reports.");
            w0Var.f9774b.mo10335a();
            return C2286e.m5291b(null);
        }
        C4137g gVar = w0Var.f9774b;
        List b = gVar.mo10338b();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(b.size());
        for (File file : gVar.mo10338b()) {
            try {
                arrayList.add(new C3934c(C4137g.f10009i.mo10325a(C4137g.m9560c(file)), file.getName()));
            } catch (IOException e) {
                C3913b bVar = C3913b.f9552c;
                StringBuilder sb = new StringBuilder();
                sb.append("Could not load report file ");
                sb.append(file);
                sb.append("; deleting");
                bVar.mo10109a(sb.toString(), e);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3954j0 j0Var = (C3954j0) it.next();
            C3934c cVar = (C3934c) j0Var;
            C4090v vVar = cVar.f9598a;
            if (vVar != null) {
                C4043b bVar2 = (C4043b) vVar;
                C4118e eVar = bVar2.f9845h != null ? C4118e.JAVA : bVar2.f9846i != null ? C4118e.NATIVE : C4118e.INCOMPLETE;
                if (eVar != C4118e.NATIVE || m0Var2 == C3961m0.ALL) {
                    C4162c cVar2 = w0Var.f9775c;
                    if (cVar2 != null) {
                        C4090v vVar2 = cVar.f9598a;
                        C3257j jVar = new C3257j();
                        C1969d<C4090v> dVar = cVar2.f10065a;
                        C1967b bVar3 = C1967b.HIGHEST;
                        if (vVar2 == null) {
                            C3997w0 w0Var2 = w0Var;
                            throw new NullPointerException("Null payload");
                        } else if (bVar3 != null) {
                            C4160a aVar = new C4160a(jVar, j0Var);
                            C2021k kVar = (C2021k) dVar;
                            C2022l lVar = kVar.f5792e;
                            C2018i iVar = kVar.f5788a;
                            if (iVar != null) {
                                String str = kVar.f5789b;
                                if (str != null) {
                                    C1968c<T, byte[]> cVar3 = kVar.f5791d;
                                    if (cVar3 != null) {
                                        C1966a aVar2 = kVar.f5790c;
                                        if (aVar2 != null) {
                                            C2023m mVar = (C2023m) lVar;
                                            C2047e eVar2 = mVar.f5796c;
                                            C2019a a = C2018i.m4802a();
                                            C2006b bVar4 = (C2006b) iVar;
                                            a.mo7005a(bVar4.f5762a);
                                            a.mo7006a(bVar3);
                                            C2008b bVar5 = (C2008b) a;
                                            bVar5.f5766b = bVar4.f5763b;
                                            C2018i a2 = bVar5.mo7007a();
                                            C2005b bVar6 = new C2005b();
                                            bVar6.f5761f = new HashMap();
                                            ArrayList arrayList3 = arrayList2;
                                            bVar6.mo6997a(mVar.f5794a.mo7076a());
                                            bVar6.mo7002b(mVar.f5795b.mo7076a());
                                            bVar6.mo6998a(str);
                                            C4161b bVar7 = (C4161b) cVar3;
                                            bVar6.mo6999a(new C2012e(aVar2, C4162c.f10061b.mo10324a(vVar2).getBytes(Charset.forName("UTF-8"))));
                                            bVar6.f5757b = null;
                                            eVar2.mo7032a(a2, bVar6.mo7000a(), aVar);
                                            C3255i a3 = jVar.f8128a.mo8922a(executor, (C3239a<TResult, TContinuationResult>) new C3993u0<TResult,TContinuationResult>(this));
                                            ArrayList arrayList4 = arrayList3;
                                            arrayList4.add(a3);
                                            arrayList2 = arrayList4;
                                            w0Var = this;
                                            th = null;
                                        } else {
                                            C3997w0 w0Var3 = w0Var;
                                            throw new NullPointerException("Null encoding");
                                        }
                                    } else {
                                        C3997w0 w0Var4 = w0Var;
                                        throw new NullPointerException("Null transformer");
                                    }
                                } else {
                                    C3997w0 w0Var5 = w0Var;
                                    throw new NullPointerException("Null transportName");
                                }
                            } else {
                                C3997w0 w0Var6 = w0Var;
                                throw new NullPointerException("Null transportContext");
                            }
                        } else {
                            C3997w0 w0Var7 = w0Var;
                            throw new NullPointerException("Null priority");
                        }
                    } else {
                        Throwable th2 = th;
                        C3997w0 w0Var8 = w0Var;
                        throw th2;
                    }
                } else {
                    C3913b.f9552c.mo10108a("Send native reports via DataTransport disabled. Removing DataTransport reports.");
                    w0Var.f9774b.mo10336a(cVar.f9599b);
                }
            } else {
                Throwable th3 = th;
                C3997w0 w0Var9 = w0Var;
                throw th3;
            }
        }
        C3997w0 w0Var10 = w0Var;
        return C2286e.m5210a((Collection<? extends C3255i<?>>) arrayList2);
    }
}
