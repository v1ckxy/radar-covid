package p213q.p217b.p317d.p347l;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceId.C0329a;
import p213q.p217b.p317d.p345j.C4206a;
import p213q.p217b.p317d.p345j.C4207b;

/* renamed from: q.b.d.l.y0 */
public final /* synthetic */ class C4271y0 implements C4207b {

    /* renamed from: a */
    public final C0329a f10276a;

    public C4271y0(C0329a aVar) {
        this.f10276a = aVar;
    }

    /* renamed from: a */
    public final void mo10074a(C4206a aVar) {
        C0329a aVar2 = this.f10276a;
        synchronized (aVar2) {
            if (aVar2.mo3060a()) {
                FirebaseInstanceId.this.mo3056c();
            }
        }
    }
}
