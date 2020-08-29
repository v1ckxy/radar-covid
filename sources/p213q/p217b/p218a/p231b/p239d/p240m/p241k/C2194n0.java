package p213q.p217b.p218a.p231b.p239d.p240m.p241k;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import p213q.p217b.p218a.p231b.p239d.p240m.C2147b;
import p213q.p217b.p218a.p231b.p270l.C3257j;

/* renamed from: q.b.a.b.d.m.k.n0 */
public final class C2194n0 {

    /* renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f6095a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    public final Map<C3257j<?>, Boolean> f6096b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: a */
    public final void mo7207a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f6095a) {
            hashMap = new HashMap(this.f6095a);
        }
        synchronized (this.f6096b) {
            hashMap2 = new HashMap(this.f6096b);
        }
        for (Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo1533b(status);
            }
        }
        for (Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                C3257j jVar = (C3257j) entry2.getKey();
                jVar.f8128a.mo8933b((Exception) new C2147b(status));
            }
        }
    }
}
