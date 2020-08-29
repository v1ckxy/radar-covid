package p213q.p217b.p317d.p322h.p323e.p326k;

import android.content.Context;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p317d.p322h.p323e.p333q.C4146b;
import p213q.p217b.p317d.p322h.p323e.p333q.C4146b.C4148b;
import p213q.p217b.p317d.p322h.p323e.p333q.p335d.C4156a;
import p213q.p217b.p317d.p322h.p323e.p333q.p335d.C4158c;
import p213q.p217b.p317d.p322h.p323e.p333q.p335d.C4159d;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4173b;

/* renamed from: q.b.d.h.e.k.c0 */
public class C3935c0 implements C4148b {

    /* renamed from: a */
    public final /* synthetic */ C3975t f9600a;

    public C3935c0(C3975t tVar) {
        this.f9600a = tVar;
    }

    /* renamed from: a */
    public C4146b mo10125a(C4173b bVar) {
        String str = bVar.f10094c;
        String str2 = bVar.f10095d;
        String str3 = bVar.f10096e;
        C3975t tVar = this.f9600a;
        Context context = tVar.f9718a;
        int a = C3944g.m9352a(context, "com.crashlytics.ApiEndpoint", "string");
        String string = a > 0 ? context.getString(a) : Objects.EMPTY_STRING;
        String str4 = "17.1.1";
        C4156a aVar = new C4156a(new C4158c(string, str, tVar.f9723f, str4), new C4159d(string, str2, tVar.f9723f, str4));
        String str5 = this.f9600a.f9726i.f9590a;
        C3961m0 a2 = C3961m0.m9386a(bVar);
        C3975t tVar2 = this.f9600a;
        C4146b bVar2 = new C4146b(str3, str5, a2, tVar2.f9730m, aVar, tVar2.f9731n);
        return bVar2;
    }
}
