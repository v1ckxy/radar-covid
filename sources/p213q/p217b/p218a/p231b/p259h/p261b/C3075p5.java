package p213q.p217b.p218a.p231b.p259h.p261b;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.p5 */
public final class C3075p5 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C3189z9 f7772e;

    /* renamed from: f */
    public final /* synthetic */ C2981h5 f7773f;

    public C3075p5(C2981h5 h5Var, C3189z9 z9Var) {
        this.f7773f = h5Var;
        this.f7772e = z9Var;
    }

    public final void run() {
        this.f7773f.f7375a.mo8625o();
        C3033l9 l9Var = this.f7773f.f7375a;
        C3189z9 z9Var = this.f7772e;
        String str = "app_id=?";
        if (l9Var.f7549u != null) {
            ArrayList arrayList = new ArrayList();
            l9Var.f7550v = arrayList;
            arrayList.addAll(l9Var.f7549u);
        }
        C2939e d = l9Var.mo8619d();
        String str2 = z9Var.f8017e;
        C1061o.m2528b(str2);
        d.mo8279c();
        d.mo8649m();
        try {
            SQLiteDatabase t = d.mo8425t();
            String[] strArr = {str2};
            int delete = t.delete("apps", str, strArr) + 0 + t.delete("events", str, strArr) + t.delete("user_attributes", str, strArr) + t.delete("conditional_properties", str, strArr) + t.delete("raw_events", str, strArr) + t.delete("raw_events_metadata", str, strArr) + t.delete("queue", str, strArr) + t.delete("audience_filter_values", str, strArr) + t.delete("main_event_params", str, strArr) + t.delete("default_event_params", str, strArr);
            if (delete > 0) {
                d.mo8285i().f7161n.mo8434a("Reset analytics data. app, records", str2, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            d.mo8285i().f7153f.mo8434a("Error resetting analytics data. appId, error", C2908b4.m6745a(str2), e);
        }
        if (z9Var.f8024l) {
            l9Var.mo8606a(z9Var);
        }
    }
}
