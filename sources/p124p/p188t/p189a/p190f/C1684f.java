package p124p.p188t.p189a.p190f;

import android.database.sqlite.SQLiteStatement;
import p124p.p188t.p189a.C1674d;

/* renamed from: p.t.a.f.f */
public class C1684f extends C1683e implements C1674d {

    /* renamed from: f */
    public final SQLiteStatement f4946f;

    public C1684f(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f4946f = sQLiteStatement;
    }

    /* renamed from: a */
    public int mo6508a() {
        return this.f4946f.executeUpdateDelete();
    }
}
