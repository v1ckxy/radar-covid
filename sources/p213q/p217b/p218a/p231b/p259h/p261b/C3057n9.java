package p213q.p217b.p218a.p231b.p259h.p261b;

import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import java.util.List;
import java.util.Map;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;

/* renamed from: q.b.a.b.h.b.n9 */
public final class C3057n9 implements C2980h4 {

    /* renamed from: a */
    public final /* synthetic */ String f7610a;

    /* renamed from: b */
    public final /* synthetic */ C3033l9 f7611b;

    public C3057n9(C3033l9 l9Var, String str) {
        this.f7611b = l9Var;
        this.f7610a = str;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo8497a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        C2939e d;
        C3033l9 l9Var = this.f7611b;
        l9Var.mo8628r();
        l9Var.mo8623m();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                l9Var.f7545q = false;
                l9Var.mo8599a();
                throw th2;
            }
        }
        List<Long> list = l9Var.f7549u;
        l9Var.f7549u = null;
        boolean z = true;
        if ((i == 200 || i == 204) && th == null) {
            try {
                C3107s4 s4Var = l9Var.f7537i.mo8470m().f7622e;
                if (((C2284c) l9Var.f7537i.f7345n) != null) {
                    s4Var.mo8709a(System.currentTimeMillis());
                    l9Var.f7537i.mo8470m().f7623f.mo8709a(0);
                    l9Var.mo8631u();
                    l9Var.f7537i.mo8285i().f7161n.mo8434a("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                    l9Var.mo8619d().mo8429x();
                    try {
                        for (Long l : list) {
                            try {
                                d = l9Var.mo8619d();
                                long longValue = l.longValue();
                                d.mo8279c();
                                d.mo8649m();
                                if (d.mo8425t().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                    throw new SQLiteException("Deleted fewer rows from queue than expected");
                                }
                            } catch (SQLiteException e) {
                                d.mo8285i().f7153f.mo8433a("Failed to delete a bundle in a queue table", e);
                                throw e;
                            } catch (SQLiteException e2) {
                                if (l9Var.f7550v == null || !l9Var.f7550v.contains(l)) {
                                    throw e2;
                                }
                            }
                        }
                        l9Var.mo8619d().mo8424s();
                        l9Var.mo8619d().mo8430y();
                        l9Var.f7550v = null;
                        if (!l9Var.mo8616c().mo8452s() || !l9Var.mo8630t()) {
                            l9Var.f7551w = -1;
                            l9Var.mo8631u();
                        } else {
                            l9Var.mo8624n();
                        }
                        l9Var.f7540l = 0;
                    } catch (Throwable th3) {
                        l9Var.mo8619d().mo8430y();
                        throw th3;
                    }
                } else {
                    throw null;
                }
            } catch (SQLiteException e3) {
                l9Var.f7537i.mo8285i().f7153f.mo8433a("Database error while trying to delete uploaded bundles", e3);
                if (((C2284c) l9Var.f7537i.f7345n) != null) {
                    l9Var.f7540l = SystemClock.elapsedRealtime();
                    l9Var.f7537i.mo8285i().f7161n.mo8433a("Disable upload, time", Long.valueOf(l9Var.f7540l));
                } else {
                    throw null;
                }
            }
        } else {
            l9Var.f7537i.mo8285i().f7161n.mo8434a("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            C3107s4 s4Var2 = l9Var.f7537i.mo8470m().f7623f;
            if (((C2284c) l9Var.f7537i.f7345n) != null) {
                s4Var2.mo8709a(System.currentTimeMillis());
                if (i != 503) {
                    if (i != 429) {
                        z = false;
                    }
                }
                if (z) {
                    C3107s4 s4Var3 = l9Var.f7537i.mo8470m().f7624g;
                    if (((C2284c) l9Var.f7537i.f7345n) != null) {
                        s4Var3.mo8709a(System.currentTimeMillis());
                    } else {
                        throw null;
                    }
                }
                l9Var.mo8619d().mo8400a(list);
                l9Var.mo8631u();
            } else {
                throw null;
            }
        }
        l9Var.f7545q = false;
        l9Var.mo8599a();
    }
}
