package p124p.p188t.p189a.p190f;

import android.database.sqlite.SQLiteProgram;
import p124p.p188t.p189a.C1674d;

/* renamed from: p.t.a.f.e */
public class C1683e implements C1674d {

    /* renamed from: e */
    public final SQLiteProgram f4945e;

    public C1683e(SQLiteProgram sQLiteProgram) {
        this.f4945e = sQLiteProgram;
    }

    public void bindBlob(int i, byte[] bArr) {
        this.f4945e.bindBlob(i, bArr);
    }

    public void bindDouble(int i, double d) {
        this.f4945e.bindDouble(i, d);
    }

    public void bindLong(int i, long j) {
        this.f4945e.bindLong(i, j);
    }

    public void bindNull(int i) {
        this.f4945e.bindNull(i);
    }

    public void bindString(int i, String str) {
        this.f4945e.bindString(i, str);
    }

    public void close() {
        this.f4945e.close();
    }
}
