package p425x.p472b.p473a.p474a.p476l.p478l;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: x.b.a.a.l.l.a */
public class C5219a {

    /* renamed from: b */
    public static C5219a f12430b;

    /* renamed from: a */
    public final C5220a f12431a;

    /* renamed from: x.b.a.a.l.l.a$a */
    public static class C5220a extends SQLiteOpenHelper {
        public C5220a(Context context) {
            super(context, "dp3t_history.db", null, 1);
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE history (_id INTEGER PRIMARY KEY,status TEXT,type INTEGER NOT NULL,success INTEGER NOT NULL,time INTEGER NOT NULL)");
            sQLiteDatabase.execSQL("CREATE INDEX i_time ON history(time)");
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    public C5219a(Context context) {
        this.f12431a = new C5220a(context);
    }

    /* renamed from: a */
    public static synchronized C5219a m11661a(Context context) {
        C5219a aVar;
        synchronized (C5219a.class) {
            if (f12430b == null) {
                f12430b = new C5219a(context);
            }
            aVar = f12430b;
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo11958a(C5221b bVar) {
        SQLiteDatabase writableDatabase = this.f12431a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(bVar.f12432a.f12443e));
        contentValues.put("status", bVar.f12433b);
        contentValues.put("time", Long.valueOf(bVar.f12435d));
        contentValues.put("success", Integer.valueOf(bVar.f12434c ? 1 : 0));
        writableDatabase.insert("history", null, contentValues);
    }
}
