package p124p.p199y.p200x.p210t;

import androidx.work.impl.WorkDatabase;
import p124p.p199y.p200x.p209s.C1894d;
import p124p.p199y.p200x.p209s.C1896f;

/* renamed from: p.y.x.t.h */
public class C1937h {

    /* renamed from: a */
    public final WorkDatabase f5572a;

    public C1937h(WorkDatabase workDatabase) {
        this.f5572a = workDatabase;
    }

    /* renamed from: a */
    public void mo6927a(boolean z) {
        ((C1896f) this.f5572a.mo1458i()).mo6885a(new C1894d("reschedule_needed", z));
    }
}
