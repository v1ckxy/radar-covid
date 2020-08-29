package p213q.p217b.p218a.p231b.p251g.p257f;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p240m.p241k.C2188l;
import p213q.p217b.p218a.p231b.p262i.p264c.C3200a;
import p213q.p217b.p218a.p231b.p270l.C3257j;

/* renamed from: q.b.a.b.g.f.u2 */
public final /* synthetic */ class C2870u2 implements C2188l {

    /* renamed from: a */
    public final List f7098a;

    /* renamed from: b */
    public final C3200a f7099b;

    /* renamed from: c */
    public final String f7100c;

    public C2870u2(List list, C3200a aVar, String str) {
        this.f7098a = list;
        this.f7099b = aVar;
        this.f7100c = str;
    }

    /* renamed from: a */
    public final void mo7204a(Object obj, Object obj2) {
        List<File> list = this.f7098a;
        C3200a aVar = this.f7099b;
        String str = this.f7100c;
        C2846o2 o2Var = (C2846o2) obj;
        C3257j jVar = (C3257j) obj2;
        ArrayList arrayList = new ArrayList(list.size());
        try {
            for (File open : list) {
                arrayList.add(ParcelFileDescriptor.open(open, 268435456));
            }
            C2875w wVar = (C2875w) o2Var.mo7243q();
            C2804e0 e0Var = new C2804e0(null);
            e0Var.f7037g = arrayList;
            e0Var.f7038h = aVar;
            e0Var.f7036f = new C2799d(jVar);
            e0Var.f7039i = str;
            wVar.mo8235a(e0Var);
        } catch (FileNotFoundException e) {
            C1061o.m2495a(new Status(39506, e.getMessage()), null, jVar);
        }
    }
}
