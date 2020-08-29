package p213q.p217b.p317d.p321g;

import java.util.Arrays;
import java.util.List;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.d.g.r */
public class C3900r extends C3901s {
    public C3900r(List<C3884d<?>> list) {
        StringBuilder a = C1965a.m4756a("Dependency cycle detected: ");
        a.append(Arrays.toString(list.toArray()));
        super(a.toString());
    }
}
