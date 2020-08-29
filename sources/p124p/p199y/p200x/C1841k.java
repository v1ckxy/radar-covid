package p124p.p199y.p200x;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import p124p.p182q.C1643h.C1644a;
import p124p.p182q.C1643h.C1645b;
import p124p.p182q.p184m.C1652c;
import p124p.p182q.p184m.C1652c.C1653a;
import p124p.p182q.p184m.C1652c.C1654b;
import p124p.p182q.p184m.C1652c.C1656d;
import p124p.p188t.p189a.C1669b;
import p124p.p188t.p189a.p190f.C1676a;

/* renamed from: p.y.x.k */
public class C1841k extends C1644a {

    /* renamed from: b */
    public final /* synthetic */ WorkDatabase_Impl f5344b;

    public C1841k(WorkDatabase_Impl workDatabase_Impl, int i) {
        this.f5344b = workDatabase_Impl;
        super(i);
    }

    /* renamed from: a */
    public void mo6424a(C1669b bVar) {
        ((C1676a) bVar).f4930e.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        C1676a aVar = (C1676a) bVar;
        aVar.f4930e.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        aVar.f4930e.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        aVar.f4930e.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        aVar.f4930e.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        aVar.f4930e.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        aVar.f4930e.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        aVar.f4930e.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        aVar.f4930e.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        aVar.f4930e.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        aVar.f4930e.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        aVar.f4930e.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        aVar.f4930e.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        aVar.f4930e.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        aVar.f4930e.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cf029002fffdcadf079e8d0a1c9a70ac')");
    }

    /* renamed from: b */
    public C1645b mo6425b(C1669b bVar) {
        C1669b bVar2 = bVar;
        HashMap hashMap = new HashMap(2);
        C1653a aVar = new C1653a("work_spec_id", "TEXT", true, 1, null, 1);
        String str = "work_spec_id";
        hashMap.put(str, aVar);
        C1653a aVar2 = new C1653a("prerequisite_id", "TEXT", true, 2, null, 1);
        String str2 = "prerequisite_id";
        hashMap.put(str2, aVar2);
        HashSet hashSet = new HashSet(2);
        String str3 = "id";
        C1654b bVar3 = new C1654b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str}), Arrays.asList(new String[]{str3}));
        hashSet.add(bVar3);
        C1654b bVar4 = new C1654b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str2}), Arrays.asList(new String[]{str3}));
        hashSet.add(bVar4);
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new C1656d("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{str})));
        hashSet2.add(new C1656d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{str2})));
        String str4 = "Dependency";
        C1652c cVar = new C1652c(str4, hashMap, hashSet, hashSet2);
        C1652c a = C1652c.m4200a(bVar2, str4);
        String str5 = "\n Found:\n";
        if (!cVar.equals(a)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
            sb.append(cVar);
            sb.append(str5);
            sb.append(a);
            return new C1645b(false, sb.toString());
        }
        HashMap hashMap2 = new HashMap(24);
        C1653a aVar3 = new C1653a("id", "TEXT", true, 1, null, 1);
        hashMap2.put(str3, aVar3);
        C1653a aVar4 = new C1653a("state", "INTEGER", true, 0, null, 1);
        hashMap2.put("state", aVar4);
        C1653a aVar5 = new C1653a("worker_class_name", "TEXT", true, 0, null, 1);
        hashMap2.put("worker_class_name", aVar5);
        C1653a aVar6 = new C1653a("input_merger_class_name", "TEXT", false, 0, null, 1);
        hashMap2.put("input_merger_class_name", aVar6);
        C1653a aVar7 = new C1653a("input", "BLOB", true, 0, null, 1);
        hashMap2.put("input", aVar7);
        C1653a aVar8 = new C1653a("output", "BLOB", true, 0, null, 1);
        hashMap2.put("output", aVar8);
        C1653a aVar9 = new C1653a("initial_delay", "INTEGER", true, 0, null, 1);
        hashMap2.put("initial_delay", aVar9);
        C1653a aVar10 = new C1653a("interval_duration", "INTEGER", true, 0, null, 1);
        hashMap2.put("interval_duration", aVar10);
        C1653a aVar11 = new C1653a("flex_duration", "INTEGER", true, 0, null, 1);
        hashMap2.put("flex_duration", aVar11);
        C1653a aVar12 = new C1653a("run_attempt_count", "INTEGER", true, 0, null, 1);
        hashMap2.put("run_attempt_count", aVar12);
        C1653a aVar13 = new C1653a("backoff_policy", "INTEGER", true, 0, null, 1);
        hashMap2.put("backoff_policy", aVar13);
        C1653a aVar14 = new C1653a("backoff_delay_duration", "INTEGER", true, 0, null, 1);
        hashMap2.put("backoff_delay_duration", aVar14);
        C1653a aVar15 = new C1653a("period_start_time", "INTEGER", true, 0, null, 1);
        String str6 = "period_start_time";
        hashMap2.put(str6, aVar15);
        C1653a aVar16 = new C1653a("minimum_retention_duration", "INTEGER", true, 0, null, 1);
        hashMap2.put("minimum_retention_duration", aVar16);
        C1653a aVar17 = new C1653a("schedule_requested_at", "INTEGER", true, 0, null, 1);
        String str7 = "schedule_requested_at";
        hashMap2.put(str7, aVar17);
        C1653a aVar18 = new C1653a("run_in_foreground", "INTEGER", true, 0, null, 1);
        hashMap2.put("run_in_foreground", aVar18);
        C1653a aVar19 = new C1653a("required_network_type", "INTEGER", false, 0, null, 1);
        hashMap2.put("required_network_type", aVar19);
        C1653a aVar20 = new C1653a("requires_charging", "INTEGER", true, 0, null, 1);
        hashMap2.put("requires_charging", aVar20);
        C1653a aVar21 = new C1653a("requires_device_idle", "INTEGER", true, 0, null, 1);
        hashMap2.put("requires_device_idle", aVar21);
        C1653a aVar22 = new C1653a("requires_battery_not_low", "INTEGER", true, 0, null, 1);
        hashMap2.put("requires_battery_not_low", aVar22);
        C1653a aVar23 = new C1653a("requires_storage_not_low", "INTEGER", true, 0, null, 1);
        hashMap2.put("requires_storage_not_low", aVar23);
        C1653a aVar24 = new C1653a("trigger_content_update_delay", "INTEGER", true, 0, null, 1);
        hashMap2.put("trigger_content_update_delay", aVar24);
        C1653a aVar25 = new C1653a("trigger_max_content_delay", "INTEGER", true, 0, null, 1);
        hashMap2.put("trigger_max_content_delay", aVar25);
        C1653a aVar26 = new C1653a("content_uri_triggers", "BLOB", false, 0, null, 1);
        hashMap2.put("content_uri_triggers", aVar26);
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new C1656d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{str7})));
        hashSet4.add(new C1656d("index_WorkSpec_period_start_time", false, Arrays.asList(new String[]{str6})));
        String str8 = "WorkSpec";
        C1652c cVar2 = new C1652c(str8, hashMap2, hashSet3, hashSet4);
        C1652c a2 = C1652c.m4200a(bVar2, str8);
        if (!cVar2.equals(a2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
            sb2.append(cVar2);
            sb2.append(str5);
            sb2.append(a2);
            return new C1645b(false, sb2.toString());
        }
        HashMap hashMap3 = new HashMap(2);
        C1653a aVar27 = new C1653a("tag", "TEXT", true, 1, null, 1);
        hashMap3.put("tag", aVar27);
        C1653a aVar28 = new C1653a("work_spec_id", "TEXT", true, 2, null, 1);
        hashMap3.put(str, aVar28);
        HashSet hashSet5 = new HashSet(1);
        C1654b bVar5 = new C1654b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str}), Arrays.asList(new String[]{str3}));
        hashSet5.add(bVar5);
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new C1656d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{str})));
        String str9 = "WorkTag";
        C1652c cVar3 = new C1652c(str9, hashMap3, hashSet5, hashSet6);
        C1652c a3 = C1652c.m4200a(bVar2, str9);
        if (!cVar3.equals(a3)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
            sb3.append(cVar3);
            sb3.append(str5);
            sb3.append(a3);
            return new C1645b(false, sb3.toString());
        }
        HashMap hashMap4 = new HashMap(2);
        C1653a aVar29 = new C1653a("work_spec_id", "TEXT", true, 1, null, 1);
        hashMap4.put(str, aVar29);
        C1653a aVar30 = new C1653a("system_id", "INTEGER", true, 0, null, 1);
        hashMap4.put("system_id", aVar30);
        HashSet hashSet7 = new HashSet(1);
        C1654b bVar6 = new C1654b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str}), Arrays.asList(new String[]{str3}));
        hashSet7.add(bVar6);
        String str10 = "SystemIdInfo";
        C1652c cVar4 = new C1652c(str10, hashMap4, hashSet7, new HashSet(0));
        C1652c a4 = C1652c.m4200a(bVar2, str10);
        if (!cVar4.equals(a4)) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
            sb4.append(cVar4);
            sb4.append(str5);
            sb4.append(a4);
            return new C1645b(false, sb4.toString());
        }
        HashMap hashMap5 = new HashMap(2);
        C1653a aVar31 = new C1653a("name", "TEXT", true, 1, null, 1);
        hashMap5.put("name", aVar31);
        C1653a aVar32 = new C1653a("work_spec_id", "TEXT", true, 2, null, 1);
        hashMap5.put(str, aVar32);
        HashSet hashSet8 = new HashSet(1);
        C1654b bVar7 = new C1654b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str}), Arrays.asList(new String[]{str3}));
        hashSet8.add(bVar7);
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new C1656d("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{str})));
        String str11 = "WorkName";
        C1652c cVar5 = new C1652c(str11, hashMap5, hashSet8, hashSet9);
        C1652c a5 = C1652c.m4200a(bVar2, str11);
        if (!cVar5.equals(a5)) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
            sb5.append(cVar5);
            sb5.append(str5);
            sb5.append(a5);
            return new C1645b(false, sb5.toString());
        }
        HashMap hashMap6 = new HashMap(2);
        C1653a aVar33 = new C1653a("work_spec_id", "TEXT", true, 1, null, 1);
        hashMap6.put(str, aVar33);
        C1653a aVar34 = new C1653a("progress", "BLOB", true, 0, null, 1);
        hashMap6.put("progress", aVar34);
        HashSet hashSet10 = new HashSet(1);
        C1654b bVar8 = new C1654b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str}), Arrays.asList(new String[]{str3}));
        hashSet10.add(bVar8);
        String str12 = "WorkProgress";
        C1652c cVar6 = new C1652c(str12, hashMap6, hashSet10, new HashSet(0));
        C1652c a6 = C1652c.m4200a(bVar2, str12);
        if (!cVar6.equals(a6)) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n");
            sb6.append(cVar6);
            sb6.append(str5);
            sb6.append(a6);
            return new C1645b(false, sb6.toString());
        }
        HashMap hashMap7 = new HashMap(2);
        C1653a aVar35 = new C1653a("key", "TEXT", true, 1, null, 1);
        hashMap7.put("key", aVar35);
        C1653a aVar36 = new C1653a("long_value", "INTEGER", false, 0, null, 1);
        hashMap7.put("long_value", aVar36);
        String str13 = "Preference";
        C1652c cVar7 = new C1652c(str13, hashMap7, new HashSet(0), new HashSet(0));
        C1652c a7 = C1652c.m4200a(bVar2, str13);
        if (cVar7.equals(a7)) {
            return new C1645b(true, null);
        }
        StringBuilder sb7 = new StringBuilder();
        sb7.append("Preference(androidx.work.impl.model.Preference).\n Expected:\n");
        sb7.append(cVar7);
        sb7.append(str5);
        sb7.append(a7);
        return new C1645b(false, sb7.toString());
    }
}
