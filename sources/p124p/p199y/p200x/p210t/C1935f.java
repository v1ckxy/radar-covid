package p124p.p199y.p200x.p210t;

import androidx.work.impl.WorkDatabase;
import p124p.p199y.p200x.p209s.C1894d;
import p124p.p199y.p200x.p209s.C1896f;

/* renamed from: p.y.x.t.f */
public class C1935f {

    /* renamed from: a */
    public final WorkDatabase f5570a;

    public C1935f(WorkDatabase workDatabase) {
        this.f5570a = workDatabase;
    }

    /* renamed from: a */
    public int mo6924a() {
        int a;
        synchronized (C1935f.class) {
            a = mo6926a("next_alarm_manager_id");
        }
        return a;
    }

    /* renamed from: a */
    public final int mo6926a(String str) {
        this.f5570a.mo6416c();
        try {
            Long a = ((C1896f) this.f5570a.mo1458i()).mo6884a(str);
            int i = 0;
            int intValue = a != null ? a.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i = intValue + 1;
            }
            ((C1896f) this.f5570a.mo1458i()).mo6885a(new C1894d(str, (long) i));
            this.f5570a.mo6420g();
            return intValue;
        } finally {
            this.f5570a.mo6417d();
        }
    }

    /* renamed from: a */
    public int mo6925a(int i, int i2) {
        synchronized (C1935f.class) {
            int a = mo6926a("next_job_scheduler_id");
            if (a >= i) {
                if (a <= i2) {
                    i = a;
                }
            }
            int i3 = i + 1;
            ((C1896f) this.f5570a.mo1458i()).mo6885a(new C1894d("next_job_scheduler_id", (long) i3));
        }
        return i;
    }
}
