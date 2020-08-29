package p213q.p217b.p317d.p347l;

import com.google.firebase.iid.FirebaseInstanceId;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p270l.C3239a;
import p213q.p217b.p218a.p231b.p270l.C3255i;

/* renamed from: q.b.d.l.s0 */
public final /* synthetic */ class C4259s0 implements C3239a {

    /* renamed from: a */
    public final FirebaseInstanceId f10243a;

    /* renamed from: b */
    public final String f10244b;

    /* renamed from: c */
    public final String f10245c;

    public C4259s0(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.f10243a = firebaseInstanceId;
        this.f10244b = str;
        this.f10245c = str2;
    }

    /* renamed from: a */
    public final Object mo8913a(C3255i iVar) {
        FirebaseInstanceId firebaseInstanceId = this.f10243a;
        String str = this.f10244b;
        String str2 = this.f10245c;
        String e = firebaseInstanceId.mo3058e();
        C4272z a = FirebaseInstanceId.f1537j.mo10399a(firebaseInstanceId.mo3059f(), str, str2);
        return !firebaseInstanceId.mo3054a(a) ? C2286e.m5291b(new C4224d(e, a.f10278a)) : firebaseInstanceId.f1543e.mo10458a(str, str2, new C4269x0(firebaseInstanceId, e, str, str2));
    }
}
