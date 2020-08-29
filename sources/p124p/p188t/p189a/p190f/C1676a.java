package p124p.p188t.p189a.p190f;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteQuery;
import p124p.p188t.p189a.C1668a;
import p124p.p188t.p189a.C1669b;
import p124p.p188t.p189a.C1675e;

/* renamed from: p.t.a.f.a */
public class C1676a implements C1669b {

    /* renamed from: f */
    public static final String[] f4929f = new String[0];

    /* renamed from: e */
    public final SQLiteDatabase f4930e;

    /* renamed from: p.t.a.f.a$a */
    public class C1677a implements CursorFactory {

        /* renamed from: a */
        public final /* synthetic */ C1675e f4931a;

        public C1677a(C1676a aVar, C1675e eVar) {
            this.f4931a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f4931a.mo6427a(new C1683e(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public C1676a(SQLiteDatabase sQLiteDatabase) {
        this.f4930e = sQLiteDatabase;
    }

    /* renamed from: a */
    public Cursor mo6491a(C1675e eVar) {
        return this.f4930e.rawQueryWithFactory(new C1677a(this, eVar), eVar.mo6426a(), f4929f, null);
    }

    /* renamed from: a */
    public String mo6492a() {
        return this.f4930e.getPath();
    }

    /* renamed from: b */
    public Cursor mo6493b(String str) {
        return mo6491a(new C1668a(str));
    }

    public void close() {
        this.f4930e.close();
    }
}
