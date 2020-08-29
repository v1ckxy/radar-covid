package p425x.p472b.p473a.p474a.p476l.p477k;

import android.content.Context;
import java.security.PublicKey;
import p410v.C4690b0;
import p410v.C4690b0.C4691a;
import p425x.p472b.p473a.p474a.p475k.C5190c;
import p484y.C5265d0.C5267b;

/* renamed from: x.b.a.a.l.k.a */
public class C5207a implements C5214h {

    /* renamed from: a */
    public C5210d f12422a;

    public C5207a(Context context, String str, PublicKey publicKey) {
        C4691a a = mo11951a(context);
        a.mo10981a(new C5218l());
        if (publicKey != null) {
            a.mo10981a(new C5190c(publicKey));
        }
        C5267b bVar = new C5267b();
        bVar.mo12000a(str);
        bVar.mo12001a(new C4690b0(a));
        this.f12422a = (C5210d) bVar.mo12002a().mo11993a(C5210d.class);
    }

    /* renamed from: a */
    public /* synthetic */ C4691a mo11951a(Context context) {
        return C5213g.m11657a(this, context);
    }
}
