package p213q.p217b.p317d.p322h.p323e;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.concurrent.Executor;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p317d.C3859c;
import p213q.p217b.p317d.p322h.p323e.p326k.C3944g;
import p213q.p217b.p317d.p322h.p323e.p326k.C3959l0;
import p213q.p217b.p317d.p322h.p323e.p326k.C3963n0;
import p213q.p217b.p317d.p322h.p323e.p326k.C3970q0;
import p213q.p217b.p317d.p322h.p323e.p330n.C4129c;
import p213q.p217b.p317d.p322h.p323e.p337s.C4165c;
import p213q.p217b.p317d.p322h.p323e.p337s.C4166d;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4172a;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4173b;
import p213q.p217b.p317d.p322h.p323e.p337s.p339j.C4180b;
import p213q.p217b.p317d.p322h.p323e.p337s.p339j.C4183e;

/* renamed from: q.b.d.h.e.h */
public class C3921h {

    /* renamed from: a */
    public final C4129c f9561a = new C4129c();

    /* renamed from: b */
    public final C3859c f9562b;

    /* renamed from: c */
    public final Context f9563c;

    /* renamed from: d */
    public PackageManager f9564d;

    /* renamed from: e */
    public String f9565e;

    /* renamed from: f */
    public PackageInfo f9566f;

    /* renamed from: g */
    public String f9567g;

    /* renamed from: h */
    public String f9568h;

    /* renamed from: i */
    public String f9569i;

    /* renamed from: j */
    public String f9570j;

    /* renamed from: k */
    public String f9571k;

    /* renamed from: l */
    public C3970q0 f9572l;

    /* renamed from: m */
    public C3959l0 f9573m;

    public C3921h(C3859c cVar, Context context, C3970q0 q0Var, C3959l0 l0Var) {
        this.f9562b = cVar;
        this.f9563c = context;
        this.f9572l = q0Var;
        this.f9573m = l0Var;
    }

    /* renamed from: a */
    public static /* synthetic */ void m9326a(C3921h hVar, C4173b bVar, String str, C4166d dVar, Executor executor, boolean z) {
        if (hVar != null) {
            String str2 = "17.1.1";
            if ("new".equals(bVar.f10092a)) {
                if (!new C4180b(hVar.mo10114a(), bVar.f10093b, hVar.f9561a, str2).mo10378a(hVar.mo10115a(bVar.f10096e, str), z)) {
                    C3913b bVar2 = C3913b.f9552c;
                    if (bVar2.mo10110a(6)) {
                        Log.e(bVar2.f9553a, "Failed to create app with Crashlytics service.", null);
                        return;
                    }
                    return;
                }
            } else {
                if (!"configured".equals(bVar.f10092a)) {
                    if (bVar.f10097f) {
                        C3913b.f9552c.mo10108a("Server says an update is required - forcing a full App update.");
                        new C4183e(hVar.mo10114a(), bVar.f10093b, hVar.f9561a, str2).mo10378a(hVar.mo10115a(bVar.f10096e, str), z);
                        return;
                    }
                    return;
                }
            }
            dVar.mo10371a(C4165c.SKIP_CACHE_LOOKUP, executor);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final C4172a mo10115a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        C4172a aVar = new C4172a(str3, str4, this.f9572l.f9697c, this.f9568h, this.f9567g, C3944g.m9359a(C3944g.m9367c(this.f9563c), str2, this.f9568h, this.f9567g), this.f9570j, C3963n0.m9387a(this.f9569i).f9680e, this.f9571k, "0");
        return aVar;
    }

    /* renamed from: a */
    public String mo10114a() {
        Context context = this.f9563c;
        int a = C3944g.m9352a(context, "com.crashlytics.ApiEndpoint", "string");
        return a > 0 ? context.getString(a) : Objects.EMPTY_STRING;
    }
}
