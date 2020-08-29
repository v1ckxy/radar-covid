package p213q.p217b.p218a.p231b.p239d.p242n;

import java.util.ArrayList;
import java.util.List;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.p127k.C1061o;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.d.n.m */
public final class C2254m {

    /* renamed from: a */
    public final List<String> f6215a = new ArrayList();

    /* renamed from: b */
    public final Object f6216b;

    public /* synthetic */ C2254m(Object obj, C2265q0 q0Var) {
        C1061o.m2524b(obj);
        this.f6216b = obj;
    }

    /* renamed from: a */
    public final C2254m mo7283a(String str, Object obj) {
        List<String> list = this.f6215a;
        C1061o.m2524b(str);
        String str2 = str;
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(valueOf.length() + C1965a.m4743a(str2, 1));
        sb.append(str2);
        sb.append("=");
        sb.append(valueOf);
        list.add(sb.toString());
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.f6216b.getClass().getSimpleName());
        sb.append('{');
        int size = this.f6215a.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) this.f6215a.get(i));
            if (i < size - 1) {
                sb.append(Objects.ARRAY_ELEMENT_SEPARATOR);
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
