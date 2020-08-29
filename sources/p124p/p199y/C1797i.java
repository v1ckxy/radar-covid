package p124p.p199y;

import java.util.List;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.y.i */
public abstract class C1797i {

    /* renamed from: a */
    public static final String f5278a = C1800l.m4459a("InputMerger");

    /* renamed from: a */
    public static C1797i m4457a(String str) {
        try {
            return (C1797i) Class.forName(str).newInstance();
        } catch (Exception e) {
            C1800l.m4460a().mo6783b(f5278a, C1965a.m4751a("Trouble instantiating + ", str), e);
            return null;
        }
    }

    /* renamed from: a */
    public abstract C1792e mo1441a(List<C1792e> list);
}
