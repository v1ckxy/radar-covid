package p213q.p217b.p218a.p231b.p251g.p256e;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: q.b.a.b.g.e.j8 */
public final class C2514j8 extends C2475h8<FieldDescriptorType, Object> {
    public C2514j8(int i) {
        super(i, null);
    }

    /* renamed from: a */
    public final void mo7709a() {
        if (!this.f6578h) {
            for (int i = 0; i < mo7710b(); i++) {
                Entry a = mo7708a(i);
                if (((C2778z5) a.getKey()).mo7786d()) {
                    a.setValue(Collections.unmodifiableList((List) a.getValue()));
                }
            }
            for (Entry entry : mo7712c()) {
                if (((C2778z5) entry.getKey()).mo7786d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo7709a();
    }
}
