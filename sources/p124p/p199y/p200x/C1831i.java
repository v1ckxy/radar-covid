package p124p.p199y.p200x;

import android.content.Context;
import android.content.SharedPreferences;
import p124p.p182q.p183l.C1649a;
import p124p.p188t.p189a.C1669b;
import p124p.p188t.p189a.p190f.C1676a;

/* renamed from: p.y.x.i */
public class C1831i {

    /* renamed from: a */
    public static C1649a f5334a = new C1832a(1, 2);

    /* renamed from: b */
    public static C1649a f5335b = new C1833b(3, 4);

    /* renamed from: c */
    public static C1649a f5336c = new C1834c(4, 5);

    /* renamed from: d */
    public static C1649a f5337d = new C1835d(6, 7);

    /* renamed from: e */
    public static C1649a f5338e = new C1836e(7, 8);

    /* renamed from: f */
    public static C1649a f5339f = new C1837f(8, 9);

    /* renamed from: p.y.x.i$a */
    public class C1832a extends C1649a {
        public C1832a(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo6444a(C1669b bVar) {
            ((C1676a) bVar).f4930e.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            C1676a aVar = (C1676a) bVar;
            aVar.f4930e.execSQL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            aVar.f4930e.execSQL("DROP TABLE IF EXISTS alarmInfo");
            aVar.f4930e.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* renamed from: p.y.x.i$b */
    public class C1833b extends C1649a {
        public C1833b(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo6444a(C1669b bVar) {
            ((C1676a) bVar).f4930e.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    /* renamed from: p.y.x.i$c */
    public class C1834c extends C1649a {
        public C1834c(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo6444a(C1669b bVar) {
            ((C1676a) bVar).f4930e.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            ((C1676a) bVar).f4930e.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* renamed from: p.y.x.i$d */
    public class C1835d extends C1649a {
        public C1835d(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo6444a(C1669b bVar) {
            ((C1676a) bVar).f4930e.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* renamed from: p.y.x.i$e */
    public class C1836e extends C1649a {
        public C1836e(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo6444a(C1669b bVar) {
            ((C1676a) bVar).f4930e.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* renamed from: p.y.x.i$f */
    public class C1837f extends C1649a {
        public C1837f(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo6444a(C1669b bVar) {
            ((C1676a) bVar).f4930e.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: p.y.x.i$g */
    public static class C1838g extends C1649a {

        /* renamed from: c */
        public final Context f5340c;

        public C1838g(Context context, int i, int i2) {
            super(i, i2);
            this.f5340c = context;
        }

        /* renamed from: a */
        public void mo6444a(C1669b bVar) {
            String str = "reschedule_needed";
            if (this.f4863b >= 10) {
                ((C1676a) bVar).f4930e.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{str, Integer.valueOf(1)});
                return;
            }
            this.f5340c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean(str, true).apply();
        }
    }

    /* renamed from: p.y.x.i$h */
    public static class C1839h extends C1649a {

        /* renamed from: c */
        public final Context f5341c;

        public C1839h(Context context) {
            super(9, 10);
            this.f5341c = context;
        }

        /* renamed from: a */
        public void mo6444a(C1669b bVar) {
            ((C1676a) bVar).f4930e.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            SharedPreferences sharedPreferences = this.f5341c.getSharedPreferences("androidx.work.util.preferences", 0);
            String str = "reschedule_needed";
            String str2 = "last_cancel_all_time_ms";
            String str3 = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)";
            if (sharedPreferences.contains(str) || sharedPreferences.contains(str2)) {
                long j = 0;
                long j2 = sharedPreferences.getLong(str2, 0);
                if (sharedPreferences.getBoolean(str, false)) {
                    j = 1;
                }
                C1676a aVar = (C1676a) bVar;
                aVar.f4930e.beginTransaction();
                try {
                    ((C1676a) bVar).f4930e.execSQL(str3, new Object[]{str2, Long.valueOf(j2)});
                    ((C1676a) bVar).f4930e.execSQL(str3, new Object[]{str, Long.valueOf(j)});
                    sharedPreferences.edit().clear().apply();
                    ((C1676a) bVar).f4930e.setTransactionSuccessful();
                } finally {
                    aVar.f4930e.endTransaction();
                }
            }
            SharedPreferences sharedPreferences2 = this.f5341c.getSharedPreferences("androidx.work.util.id", 0);
            String str4 = "next_job_scheduler_id";
            if (sharedPreferences2.contains(str4) || sharedPreferences2.contains(str4)) {
                int i = sharedPreferences2.getInt(str4, 0);
                String str5 = "next_alarm_manager_id";
                int i2 = sharedPreferences2.getInt(str5, 0);
                C1676a aVar2 = (C1676a) bVar;
                aVar2.f4930e.beginTransaction();
                try {
                    ((C1676a) bVar).f4930e.execSQL(str3, new Object[]{str4, Integer.valueOf(i)});
                    ((C1676a) bVar).f4930e.execSQL(str3, new Object[]{str5, Integer.valueOf(i2)});
                    sharedPreferences2.edit().clear().apply();
                    ((C1676a) bVar).f4930e.setTransactionSuccessful();
                } finally {
                    aVar2.f4930e.endTransaction();
                }
            }
        }
    }
}
