package p124p.p191u;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.u.q */
public class C1734q {

    /* renamed from: a */
    public final Map<String, Object> f5070a = new HashMap();

    /* renamed from: b */
    public View f5071b;

    /* renamed from: c */
    public final ArrayList<C1718i> f5072c = new ArrayList<>();

    @Deprecated
    public C1734q() {
    }

    public C1734q(View view) {
        this.f5071b = view;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1734q) {
            C1734q qVar = (C1734q) obj;
            if (this.f5071b == qVar.f5071b && this.f5070a.equals(qVar.f5070a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f5070a.hashCode() + (this.f5071b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("TransitionValues@");
        a.append(Integer.toHexString(hashCode()));
        a.append(":\n");
        StringBuilder b = C1965a.m4763b(a.toString(), "    view = ");
        b.append(this.f5071b);
        String str = "\n";
        b.append(str);
        String a2 = C1965a.m4751a(b.toString(), "    values:");
        for (String str2 : this.f5070a.keySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append("    ");
            sb.append(str2);
            sb.append(": ");
            sb.append(this.f5070a.get(str2));
            sb.append(str);
            a2 = sb.toString();
        }
        return a2;
    }
}
