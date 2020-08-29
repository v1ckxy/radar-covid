package p213q.p217b.p218a.p231b.p251g.p256e;

import android.database.Cursor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p124p.p143e.C1248a;

/* renamed from: q.b.a.b.g.e.q1 */
public final /* synthetic */ class C2629q1 implements C2678t1 {

    /* renamed from: a */
    public final C2576n1 f6813a;

    public C2629q1(C2576n1 n1Var) {
        this.f6813a = n1Var;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Object mo7963a() {
        C2576n1 n1Var = this.f6813a;
        Cursor query = n1Var.f6734a.query(n1Var.f6735b, C2576n1.f6733h, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                Map emptyMap = Collections.emptyMap();
                query.close();
                return emptyMap;
            }
            Map aVar = count <= 256 ? new C1248a(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                aVar.put(query.getString(0), query.getString(1));
            }
            query.close();
            return aVar;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }
}
