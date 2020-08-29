package p124p.p199y.p200x;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import p124p.p199y.C1800l;

/* renamed from: p.y.x.j */
public class C1840j {

    /* renamed from: a */
    public static final String f5342a = C1800l.m4459a("WrkDbPathHelper");

    /* renamed from: b */
    public static final String[] f5343b = {"-journal", "-shm", "-wal"};

    /* renamed from: a */
    public static String m4513a() {
        return "androidx.work.workdb";
    }

    /* renamed from: a */
    public static void m4514a(Context context) {
        String[] strArr;
        String str;
        String str2 = "androidx.work.workdb";
        if (context.getDatabasePath(str2).exists()) {
            C1800l.m4460a().mo6782a(f5342a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap hashMap = new HashMap();
            File databasePath = context.getDatabasePath(str2);
            File file = new File(context.getNoBackupFilesDir(), str2);
            hashMap.put(databasePath, file);
            for (String str3 : f5343b) {
                StringBuilder sb = new StringBuilder();
                sb.append(databasePath.getPath());
                sb.append(str3);
                File file2 = new File(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(file.getPath());
                sb2.append(str3);
                hashMap.put(file2, new File(sb2.toString()));
            }
            for (File file3 : hashMap.keySet()) {
                File file4 = (File) hashMap.get(file3);
                if (file3.exists() && file4 != null) {
                    if (file4.exists()) {
                        C1800l.m4460a().mo6785d(f5342a, String.format("Over-writing contents of %s", new Object[]{file4}), new Throwable[0]);
                    }
                    if (file3.renameTo(file4)) {
                        str = String.format("Migrated %s to %s", new Object[]{file3, file4});
                    } else {
                        str = String.format("Renaming %s to %s failed", new Object[]{file3, file4});
                    }
                    C1800l.m4460a().mo6782a(f5342a, str, new Throwable[0]);
                }
            }
        }
    }
}
