package p119o.p120a.p121a;

import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import p119o.p120a.C0944i1;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: o.a.a.k */
public final class C0906k {

    /* renamed from: a */
    public static final boolean f2501a;

    /* renamed from: b */
    public static final C0944i1 f2502b;

    static {
        Object obj;
        String a = C0911p.m1998a("kotlinx.coroutines.fast.service.loader");
        f2501a = a != null ? Boolean.parseBoolean(a) : true;
        String str = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'";
        List a2 = C2286e.m5203a(C2286e.m5221a(C0000a.m1b()));
        Iterator it = a2.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (it.hasNext()) {
                int b = ((MainDispatcherFactory) next).mo4166b();
                do {
                    Object next2 = it.next();
                    int b2 = ((MainDispatcherFactory) next2).mo4166b();
                    if (b < b2) {
                        next = next2;
                        b = b2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        }
        MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) obj;
        if (mainDispatcherFactory != null) {
            try {
                C0944i1 a3 = mainDispatcherFactory.mo4165a(a2);
                if (a3 != null) {
                    f2502b = a3;
                    return;
                }
            } catch (Throwable th) {
                mainDispatcherFactory.mo4164a();
                throw th;
            }
        }
        throw new IllegalStateException(str);
    }
}
