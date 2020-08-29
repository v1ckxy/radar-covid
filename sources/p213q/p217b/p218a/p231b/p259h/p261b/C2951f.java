package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.h.b.f */
public final class C2951f extends SQLiteOpenHelper {

    /* renamed from: e */
    public final /* synthetic */ C2939e f7294e;

    public C2951f(C2939e eVar, Context context, String str) {
        this.f7294e = eVar;
        super(context, str, null, 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027 A[SYNTHETIC, Splitter:B:9:0x0027] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        /*
            r7 = this;
            q.b.a.b.h.b.e r0 = r7.f7294e
            q.b.a.b.h.b.j9 r0 = r0.f7268e
            long r1 = r0.f7465b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r1 != 0) goto L_0x000e
            goto L_0x0022
        L_0x000e:
            q.b.a.b.d.q.b r1 = r0.f7464a
            q.b.a.b.d.q.c r1 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r1
            if (r1 == 0) goto L_0x008b
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0.f7465b
            long r5 = r5 - r0
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0024
        L_0x0022:
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 == 0) goto L_0x0083
            android.database.sqlite.SQLiteDatabase r0 = super.getWritableDatabase()     // Catch:{ SQLiteException -> 0x002c }
            return r0
        L_0x002c:
            q.b.a.b.h.b.e r0 = r7.f7294e
            q.b.a.b.h.b.j9 r0 = r0.f7268e
            q.b.a.b.d.q.b r1 = r0.f7464a
            q.b.a.b.d.q.c r1 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r1
            if (r1 == 0) goto L_0x0082
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.f7465b = r1
            q.b.a.b.h.b.e r0 = r7.f7294e
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7153f
            java.lang.String r1 = "Opening the database failed, dropping and recreating it"
            r0.mo8432a(r1)
            java.lang.String r0 = "google_app_measurement.db"
            q.b.a.b.h.b.e r1 = r7.f7294e
            q.b.a.b.h.b.g5 r1 = r1.f7133a
            android.content.Context r1 = r1.f7332a
            java.io.File r1 = r1.getDatabasePath(r0)
            boolean r1 = r1.delete()
            if (r1 != 0) goto L_0x0068
            q.b.a.b.h.b.e r1 = r7.f7294e
            q.b.a.b.h.b.b4 r1 = r1.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7153f
            java.lang.String r2 = "Failed to delete corrupted db file"
            r1.mo8433a(r2, r0)
        L_0x0068:
            android.database.sqlite.SQLiteDatabase r0 = super.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0073 }
            q.b.a.b.h.b.e r1 = r7.f7294e     // Catch:{ SQLiteException -> 0x0073 }
            q.b.a.b.h.b.j9 r1 = r1.f7268e     // Catch:{ SQLiteException -> 0x0073 }
            r1.f7465b = r3     // Catch:{ SQLiteException -> 0x0073 }
            return r0
        L_0x0073:
            r0 = move-exception
            q.b.a.b.h.b.e r1 = r7.f7294e
            q.b.a.b.h.b.b4 r1 = r1.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7153f
            java.lang.String r2 = "Failed to open freshly created database"
            r1.mo8433a(r2, r0)
            throw r0
        L_0x0082:
            throw r2
        L_0x0083:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            java.lang.String r1 = "Database open failed"
            r0.<init>(r1)
            throw r0
        L_0x008b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C2951f.getWritableDatabase():android.database.sqlite.SQLiteDatabase");
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C2286e.m5245a(this.f7294e.mo8285i(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        C2286e.m5246a(this.f7294e.mo8285i(), sQLiteDatabase2, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C2939e.f7259f);
        C2286e.m5246a(this.f7294e.mo8285i(), sQLiteDatabase2, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", (String[]) null);
        SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase;
        C2286e.m5246a(this.f7294e.mo8285i(), sQLiteDatabase3, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C2939e.f7260g);
        SQLiteDatabase sQLiteDatabase4 = sQLiteDatabase;
        C2286e.m5246a(this.f7294e.mo8285i(), sQLiteDatabase4, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C2939e.f7261h);
        SQLiteDatabase sQLiteDatabase5 = sQLiteDatabase;
        C2286e.m5246a(this.f7294e.mo8285i(), sQLiteDatabase5, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C2939e.f7263j);
        C2286e.m5246a(this.f7294e.mo8285i(), sQLiteDatabase5, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", (String[]) null);
        SQLiteDatabase sQLiteDatabase6 = sQLiteDatabase;
        C2286e.m5246a(this.f7294e.mo8285i(), sQLiteDatabase6, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C2939e.f7262i);
        SQLiteDatabase sQLiteDatabase7 = sQLiteDatabase;
        C2286e.m5246a(this.f7294e.mo8285i(), sQLiteDatabase7, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C2939e.f7264k);
        SQLiteDatabase sQLiteDatabase8 = sQLiteDatabase;
        C2286e.m5246a(this.f7294e.mo8285i(), sQLiteDatabase8, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C2939e.f7265l);
        C2286e.m5246a(this.f7294e.mo8285i(), sQLiteDatabase8, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", (String[]) null);
        SQLiteDatabase sQLiteDatabase9 = sQLiteDatabase;
        C2286e.m5246a(this.f7294e.mo8285i(), sQLiteDatabase9, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C2939e.f7266m);
        C2286e.m5246a(this.f7294e.mo8285i(), sQLiteDatabase9, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", (String[]) null);
        C2286e.m5246a(this.f7294e.mo8285i(), sQLiteDatabase9, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
