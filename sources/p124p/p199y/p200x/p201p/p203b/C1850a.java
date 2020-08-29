package p124p.p199y.p200x.p201p.p203b;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.C1842l;
import p124p.p199y.p200x.p209s.C1898g;
import p124p.p199y.p200x.p209s.C1900i;
import p124p.p199y.p200x.p210t.C1935f;

/* renamed from: p.y.x.p.b.a */
public class C1850a {

    /* renamed from: a */
    public static final String f5406a = C1800l.m4459a("Alarms");

    /* renamed from: a */
    public static void m4542a(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C1851b.m4547a(context, str), 536870912);
        if (service != null && alarmManager != null) {
            C1800l.m4460a().mo6782a(f5406a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)}), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    /* renamed from: a */
    public static void m4543a(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C1851b.m4547a(context, str), 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }

    /* renamed from: a */
    public static void m4544a(Context context, C1842l lVar, String str) {
        C1900i iVar = (C1900i) lVar.f5350c.mo1459j();
        C1898g a = iVar.mo6888a(str);
        if (a != null) {
            m4542a(context, str, a.f5513b);
            C1800l.m4460a().mo6782a(f5406a, String.format("Removing SystemIdInfo for workSpecId (%s)", new Object[]{str}), new Throwable[0]);
            iVar.mo6890b(str);
        }
    }

    /* renamed from: a */
    public static void m4545a(Context context, C1842l lVar, String str, long j) {
        int i;
        WorkDatabase workDatabase = lVar.f5350c;
        C1900i iVar = (C1900i) workDatabase.mo1459j();
        C1898g a = iVar.mo6888a(str);
        if (a != null) {
            m4542a(context, str, a.f5513b);
            i = a.f5513b;
        } else {
            i = new C1935f(workDatabase).mo6924a();
            iVar.mo6889a(new C1898g(str, i));
        }
        m4543a(context, str, i, j);
    }
}
