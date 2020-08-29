package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p124p.p199y.C1800l;
import p124p.p199y.C1800l.C1801a;
import p124p.p199y.C1816t;
import p124p.p199y.p200x.C1828f;
import p124p.p199y.p200x.C1840j;
import p124p.p199y.p200x.C1842l;
import p124p.p199y.p200x.p201p.p204c.C1860b;
import p124p.p199y.p200x.p209s.C1896f;
import p124p.p199y.p200x.p209s.C1908n;
import p124p.p199y.p200x.p209s.C1909o;
import p124p.p199y.p200x.p209s.C1913p;
import p124p.p199y.p200x.p209s.C1915q;
import p124p.p199y.p200x.p209s.C1916r;

public class ForceStopRunnable implements Runnable {

    /* renamed from: g */
    public static final String f1026g = C1800l.m4459a("ForceStopRunnable");

    /* renamed from: h */
    public static final long f1027h = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: e */
    public final Context f1028e;

    /* renamed from: f */
    public final C1842l f1029f;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        public static final String f1030a = C1800l.m4459a("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if ("ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                    C1800l a = C1800l.m4460a();
                    String str = f1030a;
                    if (((C1801a) a).f5280b <= 2) {
                        Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
                    }
                    ForceStopRunnable.m860a(context);
                }
            }
        }
    }

    public ForceStopRunnable(Context context, C1842l lVar) {
        this.f1028e = context.getApplicationContext();
        this.f1029f = lVar;
    }

    /* renamed from: a */
    public static void m860a(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent a = m859a(context, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f1027h;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, a);
        }
    }

    /* renamed from: a */
    public boolean mo1494a() {
        C1860b.m4574b(this.f1028e);
        WorkDatabase workDatabase = this.f1029f.f5350c;
        C1915q m = workDatabase.mo1462m();
        C1908n l = workDatabase.mo1461l();
        workDatabase.mo6416c();
        C1916r rVar = (C1916r) m;
        try {
            List c = rVar.mo6910c();
            boolean z = !((ArrayList) c).isEmpty();
            if (z) {
                Iterator it = ((ArrayList) c).iterator();
                while (it.hasNext()) {
                    C1913p pVar = (C1913p) it.next();
                    rVar.mo6902a(C1816t.ENQUEUED, pVar.f5527a);
                    rVar.mo6901a(pVar.f5527a, -1);
                }
            }
            ((C1909o) l).mo6891a();
            workDatabase.mo6420g();
            return z;
        } finally {
            workDatabase.mo6417d();
        }
    }

    /* renamed from: b */
    public boolean mo1495b() {
        Long a = ((C1896f) this.f1029f.f5354g.f5572a.mo1458i()).mo6884a("reschedule_needed");
        return a != null && a.longValue() == 1;
    }

    public void run() {
        boolean z;
        C1840j.m4514a(this.f1028e);
        C1800l.m4460a().mo6782a(f1026g, "Performing cleanup operations.", new Throwable[0]);
        try {
            boolean a = mo1494a();
            if (mo1495b()) {
                C1800l.m4460a().mo6782a(f1026g, "Rescheduling Workers.", new Throwable[0]);
                this.f1029f.mo6816b();
                this.f1029f.f5354g.mo6927a(false);
            } else {
                if (m859a(this.f1028e, 536870912) == null) {
                    m860a(this.f1028e);
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C1800l.m4460a().mo6782a(f1026g, "Application was force-stopped, rescheduling.", new Throwable[0]);
                    this.f1029f.mo6816b();
                } else if (a) {
                    C1800l.m4460a().mo6782a(f1026g, "Found unfinished work, scheduling it.", new Throwable[0]);
                    C1828f.m4501a(this.f1029f.f5349b, this.f1029f.f5350c, this.f1029f.f5352e);
                }
            }
            this.f1029f.mo6813a();
        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteDatabaseCorruptException e) {
            String str = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.";
            C1800l.m4460a().mo6783b(f1026g, str, e);
            throw new IllegalStateException(str, e);
        }
    }

    /* renamed from: a */
    public static PendingIntent m859a(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i);
    }
}
