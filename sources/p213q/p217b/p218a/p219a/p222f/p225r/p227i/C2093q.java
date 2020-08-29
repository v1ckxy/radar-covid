package p213q.p217b.p218a.p219a.p222f.p225r.p227i;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* renamed from: q.b.a.a.f.r.i.q */
public final class C2093q extends SQLiteOpenHelper {

    /* renamed from: g */
    public static int f5937g = 4;

    /* renamed from: h */
    public static final C2094a f5938h = C2089m.f5933a;

    /* renamed from: i */
    public static final C2094a f5939i = C2090n.f5934a;

    /* renamed from: j */
    public static final C2094a f5940j = C2091o.f5935a;

    /* renamed from: k */
    public static final C2094a f5941k;

    /* renamed from: l */
    public static final List<C2094a> f5942l;

    /* renamed from: e */
    public final int f5943e;

    /* renamed from: f */
    public boolean f5944f = false;

    /* renamed from: q.b.a.a.f.r.i.q$a */
    public interface C2094a {
        /* renamed from: a */
        void mo7069a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        C2092p pVar = C2092p.f5936a;
        f5941k = pVar;
        f5942l = Arrays.asList(new C2094a[]{f5938h, f5939i, f5940j, pVar});
    }

    public C2093q(Context context, String str, int i) {
        super(context, str, null, i);
        this.f5943e = i;
    }

    /* renamed from: a */
    public static /* synthetic */ void m4880a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* renamed from: b */
    public static /* synthetic */ void m4881b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* renamed from: d */
    public static /* synthetic */ void m4883d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* renamed from: a */
    public final void mo7070a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 <= f5942l.size()) {
            while (i < i2) {
                ((C2094a) f5942l.get(i)).mo7069a(sQLiteDatabase);
                i++;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Migration from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(" was requested, but cannot be performed. Only ");
        sb.append(f5942l.size());
        sb.append(" migrations are provided");
        throw new IllegalArgumentException(sb.toString());
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f5944f = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.f5943e;
        if (!this.f5944f) {
            onConfigure(sQLiteDatabase);
        }
        mo7070a(sQLiteDatabase, 0, i);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        if (!this.f5944f) {
            onConfigure(sQLiteDatabase);
        }
        mo7070a(sQLiteDatabase, 0, i2);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f5944f) {
            onConfigure(sQLiteDatabase);
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.f5944f) {
            onConfigure(sQLiteDatabase);
        }
        mo7070a(sQLiteDatabase, i, i2);
    }
}
