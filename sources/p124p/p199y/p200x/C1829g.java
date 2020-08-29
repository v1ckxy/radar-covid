package p124p.p199y.p200x;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p199y.C1795g;
import p124p.p199y.C1800l;
import p124p.p199y.C1805o;
import p124p.p199y.C1815s;
import p124p.p199y.C1818v;
import p124p.p199y.p200x.p210t.C1934e;
import p124p.p199y.p200x.p210t.p212q.C1963b;

/* renamed from: p.y.x.g */
public class C1829g extends C1815s {

    /* renamed from: j */
    public static final String f5324j = C1800l.m4459a("WorkContinuationImpl");

    /* renamed from: a */
    public final C1842l f5325a;

    /* renamed from: b */
    public final String f5326b;

    /* renamed from: c */
    public final C1795g f5327c;

    /* renamed from: d */
    public final List<? extends C1818v> f5328d;

    /* renamed from: e */
    public final List<String> f5329e = new ArrayList(this.f5328d.size());

    /* renamed from: f */
    public final List<String> f5330f = new ArrayList();

    /* renamed from: g */
    public final List<C1829g> f5331g;

    /* renamed from: h */
    public boolean f5332h;

    /* renamed from: i */
    public C1805o f5333i;

    public C1829g(C1842l lVar, String str, C1795g gVar, List<? extends C1818v> list, List<C1829g> list2) {
        this.f5325a = lVar;
        this.f5326b = str;
        this.f5327c = gVar;
        this.f5328d = list;
        this.f5331g = list2;
        if (list2 != null) {
            for (C1829g gVar2 : list2) {
                this.f5330f.addAll(gVar2.f5330f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String a = ((C1818v) list.get(i)).mo6793a();
            this.f5329e.add(a);
            this.f5330f.add(a);
        }
    }

    /* renamed from: a */
    public C1805o mo6812a() {
        if (!this.f5332h) {
            C1934e eVar = new C1934e(this);
            ((C1963b) this.f5325a.f5351d).f5626a.execute(eVar);
            this.f5333i = eVar.f5569f;
        } else {
            C1800l.m4460a().mo6785d(f5324j, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(Objects.ARRAY_ELEMENT_SEPARATOR, this.f5329e)}), new Throwable[0]);
        }
        return this.f5333i;
    }

    /* renamed from: a */
    public static boolean m4503a(C1829g gVar, Set<String> set) {
        set.addAll(gVar.f5329e);
        Set a = m4502a(gVar);
        for (String contains : set) {
            if (((HashSet) a).contains(contains)) {
                return true;
            }
        }
        List<C1829g> list = gVar.f5331g;
        if (list != null && !list.isEmpty()) {
            for (C1829g a2 : list) {
                if (m4503a(a2, set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.f5329e);
        return false;
    }

    /* renamed from: a */
    public static Set<String> m4502a(C1829g gVar) {
        HashSet hashSet = new HashSet();
        List<C1829g> list = gVar.f5331g;
        if (list != null && !list.isEmpty()) {
            for (C1829g gVar2 : list) {
                hashSet.addAll(gVar2.f5329e);
            }
        }
        return hashSet;
    }
}
