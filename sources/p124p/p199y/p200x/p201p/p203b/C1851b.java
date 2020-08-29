package p124p.p199y.p200x.p201p.p203b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.C1823b;
import p124p.p199y.p200x.p201p.p203b.C1854e.C1856b;
import p124p.p199y.p200x.p209s.C1913p;
import p124p.p199y.p200x.p209s.C1916r;

/* renamed from: p.y.x.p.b.b */
public class C1851b implements C1823b {

    /* renamed from: h */
    public static final String f5407h = C1800l.m4459a("CommandHandler");

    /* renamed from: e */
    public final Context f5408e;

    /* renamed from: f */
    public final Map<String, C1823b> f5409f = new HashMap();

    /* renamed from: g */
    public final Object f5410g = new Object();

    public C1851b(Context context) {
        this.f5408e = context;
    }

    /* renamed from: a */
    public static Intent m4546a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* renamed from: a */
    public static Intent m4547a(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: a */
    public static Intent m4548a(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    /* renamed from: b */
    public static Intent m4549b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: a */
    public final void mo6832a(Intent intent, int i, C1854e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f5410g) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            C1800l.m4460a().mo6782a(f5407h, String.format("Handing delay met for %s", new Object[]{string}), new Throwable[0]);
            if (!this.f5409f.containsKey(string)) {
                C1853d dVar = new C1853d(this.f5408e, i, string, eVar);
                this.f5409f.put(string, dVar);
                dVar.mo6837b();
            } else {
                C1800l.m4460a().mo6782a(f5407h, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string}), new Throwable[0]);
            }
        }
    }

    /* renamed from: a */
    public void mo1480a(String str, boolean z) {
        synchronized (this.f5410g) {
            C1823b bVar = (C1823b) this.f5409f.remove(str);
            if (bVar != null) {
                bVar.mo1480a(str, z);
            }
        }
    }

    /* renamed from: a */
    public boolean mo6833a() {
        boolean z;
        synchronized (this.f5410g) {
            z = !this.f5409f.isEmpty();
        }
        return z;
    }

    /* renamed from: b */
    public void mo6834b(Intent intent, int i, C1854e eVar) {
        boolean z;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            C1800l.m4460a().mo6782a(f5407h, String.format("Handling constraints changed %s", new Object[]{intent}), new Throwable[0]);
            C1852c cVar = new C1852c(this.f5408e, i, eVar);
            List d = ((C1916r) cVar.f5414c.f5431i.f5350c.mo1462m()).mo6912d();
            ConstraintProxy.m849a(cVar.f5412a, d);
            cVar.f5415d.mo6854a((Iterable<C1913p>) d);
            ArrayList arrayList = (ArrayList) d;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C1913p pVar = (C1913p) it.next();
                String str = pVar.f5527a;
                if (currentTimeMillis >= pVar.mo6893a() && (!pVar.mo6894b() || cVar.f5415d.mo6856a(str))) {
                    arrayList2.add(pVar);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str2 = ((C1913p) it2.next()).f5527a;
                Intent a = m4547a(cVar.f5412a, str2);
                C1800l.m4460a().mo6782a(C1852c.f5411e, String.format("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2}), new Throwable[0]);
                C1854e eVar2 = cVar.f5414c;
                eVar2.f5433k.post(new C1856b(eVar2, a, cVar.f5413b));
            }
            cVar.f5415d.mo6853a();
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            C1800l.m4460a().mo6782a(f5407h, String.format("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
            eVar.f5431i.mo6816b();
        } else {
            Bundle extras = intent.getExtras();
            String str3 = "KEY_WORKSPEC_ID";
            String[] strArr = {str3};
            if (extras != null && !extras.isEmpty()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= 1) {
                        z = true;
                        break;
                    } else if (extras.get(strArr[i2]) == null) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            z = false;
            if (!z) {
                C1800l.m4460a().mo6783b(f5407h, String.format("Invalid request for %s, requires %s.", new Object[]{action, str3}), new Throwable[0]);
            } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
                String string = intent.getExtras().getString(str3);
                C1800l.m4460a().mo6782a(f5407h, String.format("Handling schedule work for %s", new Object[]{string}), new Throwable[0]);
                WorkDatabase workDatabase = eVar.f5431i.f5350c;
                workDatabase.mo6416c();
                try {
                    C1913p e = ((C1916r) workDatabase.mo1462m()).mo6914e(string);
                    String str4 = "Skipping scheduling ";
                    if (e == null) {
                        C1800l a2 = C1800l.m4460a();
                        String str5 = f5407h;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str4);
                        sb.append(string);
                        sb.append(" because it's no longer in the DB");
                        a2.mo6785d(str5, sb.toString(), new Throwable[0]);
                    } else if (e.f5528b.mo6791f()) {
                        C1800l a3 = C1800l.m4460a();
                        String str6 = f5407h;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str4);
                        sb2.append(string);
                        sb2.append("because it is finished.");
                        a3.mo6785d(str6, sb2.toString(), new Throwable[0]);
                    } else {
                        long a4 = e.mo6893a();
                        if (!e.mo6894b()) {
                            C1800l.m4460a().mo6782a(f5407h, String.format("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(a4)}), new Throwable[0]);
                            C1850a.m4545a(this.f5408e, eVar.f5431i, string, a4);
                        } else {
                            C1800l.m4460a().mo6782a(f5407h, String.format("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(a4)}), new Throwable[0]);
                            C1850a.m4545a(this.f5408e, eVar.f5431i, string, a4);
                            eVar.f5433k.post(new C1856b(eVar, m4546a(this.f5408e), i));
                        }
                        workDatabase.mo6420g();
                    }
                } finally {
                    workDatabase.mo6417d();
                }
            } else if ("ACTION_DELAY_MET".equals(action)) {
                mo6832a(intent, i, eVar);
            } else if ("ACTION_STOP_WORK".equals(action)) {
                String string2 = intent.getExtras().getString(str3);
                C1800l.m4460a().mo6782a(f5407h, String.format("Handing stopWork work for %s", new Object[]{string2}), new Throwable[0]);
                eVar.f5431i.mo6815a(string2);
                C1850a.m4544a(this.f5408e, eVar.f5431i, string2);
                eVar.mo1480a(string2, false);
            } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                Bundle extras2 = intent.getExtras();
                String string3 = extras2.getString(str3);
                boolean z2 = extras2.getBoolean("KEY_NEEDS_RESCHEDULE");
                C1800l.m4460a().mo6782a(f5407h, String.format("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
                mo1480a(string3, z2);
            } else {
                C1800l.m4460a().mo6785d(f5407h, String.format("Ignoring intent %s", new Object[]{intent}), new Throwable[0]);
            }
        }
    }
}
