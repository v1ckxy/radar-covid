package p213q.p217b.p317d.p347l;

import android.os.Bundle;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.Executor;
import p213q.p217b.p218a.p231b.p270l.C3239a;
import p213q.p217b.p218a.p231b.p270l.C3253h;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p213q.p217b.p218a.p231b.p270l.C3257j;

/* renamed from: q.b.d.l.x0 */
public final /* synthetic */ class C4269x0 {

    /* renamed from: a */
    public final FirebaseInstanceId f10271a;

    /* renamed from: b */
    public final String f10272b;

    /* renamed from: c */
    public final String f10273c;

    /* renamed from: d */
    public final String f10274d;

    public C4269x0(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.f10271a = firebaseInstanceId;
        this.f10272b = str;
        this.f10273c = str2;
        this.f10274d = str3;
    }

    /* renamed from: a */
    public final C3255i mo10468a() {
        FirebaseInstanceId firebaseInstanceId = this.f10271a;
        String str = this.f10272b;
        String str2 = this.f10273c;
        String str3 = this.f10274d;
        C4220b1 b1Var = firebaseInstanceId.f1542d;
        if (b1Var != null) {
            Bundle bundle = new Bundle();
            C3257j jVar = new C3257j();
            Executor executor = b1Var.f10172d;
            C4217a1 a1Var = new C4217a1(b1Var, str, str2, str3, bundle, jVar);
            executor.execute(a1Var);
            return jVar.f8128a.mo8922a(b1Var.f10172d, (C3239a<TResult, TContinuationResult>) new C4223c1<TResult,TContinuationResult>(b1Var)).mo8927a(firebaseInstanceId.f1539a, (C3253h<TResult, TContinuationResult>) new C4267w0<TResult,TContinuationResult>(firebaseInstanceId, str2, str3, str));
        }
        throw null;
    }
}
