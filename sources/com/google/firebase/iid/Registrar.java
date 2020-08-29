package com.google.firebase.iid;

import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p317d.C3859c;
import p213q.p217b.p317d.p321g.C3884d;
import p213q.p217b.p317d.p321g.C3884d.C3886b;
import p213q.p217b.p317d.p321g.C3891i;
import p213q.p217b.p317d.p321g.C3899q;
import p213q.p217b.p317d.p345j.C4209d;
import p213q.p217b.p317d.p346k.C4212c;
import p213q.p217b.p317d.p347l.C4258s;
import p213q.p217b.p317d.p347l.C4260t;
import p213q.p217b.p317d.p347l.p348b.C4218a;
import p213q.p217b.p317d.p350n.C4283g;
import p213q.p217b.p317d.p354p.C4317f;

@Keep
public final class Registrar implements C3891i {

    /* renamed from: com.google.firebase.iid.Registrar$a */
    public static class C0330a implements C4218a {

        /* renamed from: a */
        public final FirebaseInstanceId f1554a;

        public C0330a(FirebaseInstanceId firebaseInstanceId) {
            this.f1554a = firebaseInstanceId;
        }

        public final String getId() {
            FirebaseInstanceId firebaseInstanceId = this.f1554a;
            C3859c cVar = firebaseInstanceId.f1540b;
            cVar.mo10056a();
            C1061o.m2467a(cVar.f9461c.f9477g, (Object) "FirebaseApp has to define a valid projectId.");
            cVar.mo10056a();
            C1061o.m2467a(cVar.f9461c.f9472b, (Object) "FirebaseApp has to define a valid applicationId.");
            cVar.mo10056a();
            C1061o.m2467a(cVar.f9461c.f9471a, (Object) "FirebaseApp has to define a valid apiKey.");
            firebaseInstanceId.mo3056c();
            return firebaseInstanceId.mo3058e();
        }
    }

    @Keep
    public final List<C3884d<?>> getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        C3886b a = C3884d.m9271a(cls);
        a.mo10081a(C3899q.m9288a(C3859c.class));
        a.mo10081a(C3899q.m9288a(C4209d.class));
        a.mo10081a(C3899q.m9288a(C4317f.class));
        a.mo10081a(C3899q.m9288a(C4212c.class));
        a.mo10081a(C3899q.m9288a(C4283g.class));
        a.mo10080a(C4258s.f10242a);
        a.mo10079a(1);
        C3884d a2 = a.mo10082a();
        C3886b a3 = C3884d.m9271a(C4218a.class);
        a3.mo10081a(C3899q.m9288a(cls));
        a3.mo10080a(C4260t.f10246a);
        return Arrays.asList(new C3884d[]{a2, a3.mo10082a(), C2286e.m5216a("fire-iid", "20.1.5")});
    }
}
