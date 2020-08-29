package p124p.p188t.p189a.p190f;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteQuery;
import p124p.p188t.p189a.C1675e;

/* renamed from: p.t.a.f.b */
public class C1678b implements CursorFactory {

    /* renamed from: a */
    public final /* synthetic */ C1675e f4932a;

    public C1678b(C1676a aVar, C1675e eVar) {
        this.f4932a = eVar;
    }

    public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.f4932a.mo6427a(new C1683e(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
