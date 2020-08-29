package p124p.p188t.p189a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.Closeable;
import java.io.File;

/* renamed from: p.t.a.c */
public interface C1670c extends Closeable {

    /* renamed from: p.t.a.c$a */
    public static abstract class C1671a {

        /* renamed from: a */
        public final int f4924a;

        public C1671a(int i) {
            this.f4924a = i;
        }

        /* renamed from: a */
        public final void mo6490a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("deleting the database file: ");
                sb.append(str);
                String str2 = "SupportSQLite";
                Log.w(str2, sb.toString());
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e) {
                    Log.w(str2, "delete failed: ", e);
                }
            }
        }

        /* renamed from: a */
        public abstract void mo6423a(C1669b bVar, int i, int i2);
    }

    /* renamed from: p.t.a.c$b */
    public static class C1672b {

        /* renamed from: a */
        public final Context f4925a;

        /* renamed from: b */
        public final String f4926b;

        /* renamed from: c */
        public final C1671a f4927c;

        /* renamed from: d */
        public final boolean f4928d;

        public C1672b(Context context, String str, C1671a aVar, boolean z) {
            this.f4925a = context;
            this.f4926b = str;
            this.f4927c = aVar;
            this.f4928d = z;
        }
    }

    /* renamed from: p.t.a.c$c */
    public interface C1673c {
        /* renamed from: a */
        C1670c mo1464a(C1672b bVar);
    }

    void close();

    String getDatabaseName();

    C1669b getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
