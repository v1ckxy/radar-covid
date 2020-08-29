package androidx.work;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p124p.p199y.C1792e;
import p124p.p199y.C1792e.C1793a;
import p124p.p199y.C1797i;

public final class OverwritingInputMerger extends C1797i {
    /* renamed from: a */
    public C1792e mo1441a(List<C1792e> list) {
        C1793a aVar = new C1793a();
        HashMap hashMap = new HashMap();
        for (C1792e eVar : list) {
            hashMap.putAll(Collections.unmodifiableMap(eVar.f5265a));
        }
        aVar.mo6777a(hashMap);
        return aVar.mo6778a();
    }
}
