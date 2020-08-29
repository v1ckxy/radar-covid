package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.ListenableWorker.C0177a;
import androidx.work.ListenableWorker.C0177a.C0180c;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p124p.p126b.p127k.C1061o;
import p124p.p182q.C1646i;
import p124p.p182q.p184m.C1651b;
import p124p.p199y.C1788c;
import p124p.p199y.C1792e;
import p124p.p199y.C1800l;
import p124p.p199y.p200x.C1842l;
import p124p.p199y.p200x.p209s.C1898g;
import p124p.p199y.p200x.p209s.C1899h;
import p124p.p199y.p200x.p209s.C1900i;
import p124p.p199y.p200x.p209s.C1904k;
import p124p.p199y.p200x.p209s.C1905l;
import p124p.p199y.p200x.p209s.C1913p;
import p124p.p199y.p200x.p209s.C1915q;
import p124p.p199y.p200x.p209s.C1916r;
import p124p.p199y.p200x.p209s.C1927t;
import p124p.p199y.p200x.p209s.C1928u;

public class DiagnosticsWorker extends Worker {

    /* renamed from: i */
    public static final String f1040i = C1800l.m4459a("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static String m872a(C1904k kVar, C1927t tVar, C1899h hVar, List<C1913p> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", new Object[]{"Job Id"}));
        for (C1913p pVar : list) {
            C1898g a = ((C1900i) hVar).mo6888a(pVar.f5527a);
            Object valueOf = a != null ? Integer.valueOf(a.f5513b) : null;
            String str = pVar.f5527a;
            C1905l lVar = (C1905l) kVar;
            if (lVar != null) {
                C1646i a2 = C1646i.m4184a("SELECT name FROM workname WHERE work_spec_id=?", 1);
                if (str == null) {
                    a2.bindNull(1);
                } else {
                    a2.bindString(1, str);
                }
                lVar.f5519a.mo6415b();
                Cursor a3 = C1651b.m4197a(lVar.f5519a, a2, false, null);
                try {
                    ArrayList arrayList = new ArrayList(a3.getCount());
                    while (a3.moveToNext()) {
                        arrayList.add(a3.getString(0));
                    }
                    a3.close();
                    a2.mo6434f();
                    String str2 = ",";
                    sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", new Object[]{pVar.f5527a, pVar.f5529c, valueOf, pVar.f5528b.name(), TextUtils.join(str2, arrayList), TextUtils.join(str2, ((C1928u) tVar).mo6918a(pVar.f5527a))}));
                } catch (Throwable th) {
                    a3.close();
                    a2.mo6434f();
                    throw th;
                }
            } else {
                throw null;
            }
        }
        return sb.toString();
    }

    /* renamed from: e */
    public C0177a mo1455e() {
        C1646i iVar;
        C1899h hVar;
        C1927t tVar;
        C1904k kVar;
        int i;
        WorkDatabase workDatabase = C1842l.m4517a(this.f978e).f5350c;
        C1915q m = workDatabase.mo1462m();
        C1904k k = workDatabase.mo1460k();
        C1927t n = workDatabase.mo1463n();
        C1899h j = workDatabase.mo1459j();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1);
        C1916r rVar = (C1916r) m;
        if (rVar != null) {
            C1646i a = C1646i.m4184a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
            a.bindLong(1, currentTimeMillis);
            rVar.f5546a.mo6415b();
            Cursor a2 = C1651b.m4197a(rVar.f5546a, a, false, null);
            try {
                int a3 = C1061o.m2435a(a2, "required_network_type");
                int a4 = C1061o.m2435a(a2, "requires_charging");
                int a5 = C1061o.m2435a(a2, "requires_device_idle");
                int a6 = C1061o.m2435a(a2, "requires_battery_not_low");
                int a7 = C1061o.m2435a(a2, "requires_storage_not_low");
                int a8 = C1061o.m2435a(a2, "trigger_content_update_delay");
                int a9 = C1061o.m2435a(a2, "trigger_max_content_delay");
                int a10 = C1061o.m2435a(a2, "content_uri_triggers");
                int a11 = C1061o.m2435a(a2, "id");
                int a12 = C1061o.m2435a(a2, "state");
                C1899h hVar2 = j;
                int a13 = C1061o.m2435a(a2, "worker_class_name");
                C1904k kVar2 = k;
                int a14 = C1061o.m2435a(a2, "input_merger_class_name");
                C1927t tVar2 = n;
                int a15 = C1061o.m2435a(a2, "input");
                C1915q qVar = m;
                int a16 = C1061o.m2435a(a2, "output");
                iVar = a;
                try {
                    int a17 = C1061o.m2435a(a2, "initial_delay");
                    int a18 = C1061o.m2435a(a2, "interval_duration");
                    int a19 = C1061o.m2435a(a2, "flex_duration");
                    int a20 = C1061o.m2435a(a2, "run_attempt_count");
                    int a21 = C1061o.m2435a(a2, "backoff_policy");
                    int a22 = C1061o.m2435a(a2, "backoff_delay_duration");
                    int a23 = C1061o.m2435a(a2, "period_start_time");
                    int a24 = C1061o.m2435a(a2, "minimum_retention_duration");
                    int a25 = C1061o.m2435a(a2, "schedule_requested_at");
                    int a26 = C1061o.m2435a(a2, "run_in_foreground");
                    int i2 = a16;
                    ArrayList arrayList = new ArrayList(a2.getCount());
                    while (a2.moveToNext()) {
                        String string = a2.getString(a11);
                        int i3 = a11;
                        String string2 = a2.getString(a13);
                        int i4 = a13;
                        C1788c cVar = new C1788c();
                        int i5 = a3;
                        cVar.f5244a = C1061o.m2549d(a2.getInt(a3));
                        cVar.f5245b = a2.getInt(a4) != 0;
                        cVar.f5246c = a2.getInt(a5) != 0;
                        cVar.f5247d = a2.getInt(a6) != 0;
                        cVar.f5248e = a2.getInt(a7) != 0;
                        int i6 = a4;
                        cVar.f5249f = a2.getLong(a8);
                        cVar.f5250g = a2.getLong(a9);
                        cVar.f5251h = C1061o.m2474a(a2.getBlob(a10));
                        C1913p pVar = new C1913p(string, string2);
                        pVar.f5528b = C1061o.m2555e(a2.getInt(a12));
                        pVar.f5530d = a2.getString(a14);
                        pVar.f5531e = C1792e.m4454b(a2.getBlob(a15));
                        int i7 = i2;
                        pVar.f5532f = C1792e.m4454b(a2.getBlob(i7));
                        int i8 = a12;
                        i2 = i7;
                        int i9 = a17;
                        pVar.f5533g = a2.getLong(i9);
                        int i10 = a14;
                        int i11 = a18;
                        pVar.f5534h = a2.getLong(i11);
                        int i12 = a15;
                        int i13 = a19;
                        pVar.f5535i = a2.getLong(i13);
                        int i14 = a20;
                        pVar.f5537k = a2.getInt(i14);
                        int i15 = a21;
                        int i16 = i11;
                        pVar.f5538l = C1061o.m2540c(a2.getInt(i15));
                        a19 = i13;
                        int i17 = i14;
                        int i18 = a22;
                        pVar.f5539m = a2.getLong(i18);
                        int i19 = i15;
                        int i20 = a23;
                        pVar.f5540n = a2.getLong(i20);
                        int i21 = i18;
                        a23 = i20;
                        int i22 = a24;
                        pVar.f5541o = a2.getLong(i22);
                        a24 = i22;
                        int i23 = a25;
                        pVar.f5542p = a2.getLong(i23);
                        int i24 = a26;
                        pVar.f5543q = a2.getInt(i24) != 0;
                        pVar.f5536j = cVar;
                        arrayList.add(pVar);
                        a25 = i23;
                        a26 = i24;
                        a12 = i8;
                        a14 = i10;
                        a13 = i4;
                        a4 = i6;
                        a3 = i5;
                        a17 = i9;
                        a11 = i3;
                        int i25 = i19;
                        a22 = i21;
                        a15 = i12;
                        a18 = i16;
                        a20 = i17;
                        a21 = i25;
                    }
                    a2.close();
                    iVar.mo6434f();
                    C1916r rVar2 = (C1916r) qVar;
                    List c = rVar2.mo6910c();
                    List a27 = rVar2.mo6903a();
                    if (!arrayList.isEmpty()) {
                        i = 0;
                        C1800l.m4460a().mo6784c(f1040i, "Recently completed work:\n\n", new Throwable[0]);
                        hVar = hVar2;
                        kVar = kVar2;
                        tVar = tVar2;
                        C1800l.m4460a().mo6784c(f1040i, m872a(kVar, tVar, hVar, arrayList), new Throwable[0]);
                    } else {
                        hVar = hVar2;
                        kVar = kVar2;
                        tVar = tVar2;
                        i = 0;
                    }
                    if (!((ArrayList) c).isEmpty()) {
                        C1800l.m4460a().mo6784c(f1040i, "Running work:\n\n", new Throwable[i]);
                        C1800l.m4460a().mo6784c(f1040i, m872a(kVar, tVar, hVar, c), new Throwable[i]);
                    }
                    if (!((ArrayList) a27).isEmpty()) {
                        C1800l.m4460a().mo6784c(f1040i, "Enqueued work:\n\n", new Throwable[i]);
                        C1800l.m4460a().mo6784c(f1040i, m872a(kVar, tVar, hVar, a27), new Throwable[i]);
                    }
                    return new C0180c();
                } catch (Throwable th) {
                    th = th;
                    a2.close();
                    iVar.mo6434f();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                iVar = a;
                a2.close();
                iVar.mo6434f();
                throw th;
            }
        } else {
            throw null;
        }
    }
}
