package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.h.b.w3 */
public final class C3150w3 extends SQLiteOpenHelper {

    /* renamed from: e */
    public final /* synthetic */ C3161x3 f7933e;

    public C3150w3(C3161x3 x3Var, Context context, String str) {
        this.f7933e = x3Var;
        super(context, str, null, 1);
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f7933e.mo8285i().f7153f.mo8432a("Opening the local database failed, dropping and recreating it");
            String str = "google_app_measurement_local.db";
            if (!this.f7933e.f7133a.f7332a.getDatabasePath(str).delete()) {
                this.f7933e.mo8285i().f7153f.mo8433a("Failed to delete corrupted local db file", str);
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f7933e.mo8285i().f7153f.mo8433a("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C2286e.m5245a(this.f7933e.mo8285i(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C2286e.m5246a(this.f7933e.mo8285i(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
