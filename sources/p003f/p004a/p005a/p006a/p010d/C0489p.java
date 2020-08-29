package p003f.p004a.p005a.p006a.p010d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002es.gob.radarcovid.models.request.RequestPostAnswer;
import p002es.gob.radarcovid.models.request.RequestPostAnswers;
import p003f.p004a.p005a.p006a.p007a.C0413b;
import p003f.p004a.p005a.p108g.p114c.p115p.C0855a;
import p003f.p004a.p005a.p108g.p114c.p115p.C0857b;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4560l;
import p392u.p401r.p402b.C4607a;
import p392u.p401r.p403c.C4639i;
import p425x.p482c.p483a.C5244a;

/* renamed from: f.a.a.a.d.p */
public final class C0489p extends C4639i implements C4607a<C5244a<? extends Throwable, ? extends C4560l>> {

    /* renamed from: f */
    public final /* synthetic */ C0490q f1877f;

    /* renamed from: g */
    public final /* synthetic */ List f1878g;

    public C0489p(C0490q qVar, List list) {
        this.f1877f = qVar;
        this.f1878g = list;
        super(0);
    }

    /* renamed from: c */
    public Object mo3123c() {
        C0490q qVar = this.f1877f;
        C0413b bVar = qVar.f1879a;
        String a = qVar.f1880b.mo3673a();
        C0490q qVar2 = this.f1877f;
        List<C0857b> list = this.f1878g;
        if (qVar2 != null) {
            RequestPostAnswers requestPostAnswers = new RequestPostAnswers();
            for (C0857b bVar2 : list) {
                List<C0855a> list2 = bVar2.f2437h;
                ArrayList arrayList = new ArrayList();
                for (Object next : list2) {
                    if (((C0855a) next).f2433g) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C2286e.m5158a((Iterable<? extends T>) arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0855a aVar = (C0855a) it.next();
                    arrayList2.add(new RequestPostAnswer(bVar2.f2434e, aVar.f2431e, aVar.f2432f));
                }
                requestPostAnswers.addAll(arrayList2);
            }
            return bVar.mo3666a(a, requestPostAnswers);
        }
        throw null;
    }
}
