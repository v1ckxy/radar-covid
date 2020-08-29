package p213q.p217b.p317d.p322h.p323e.p324i;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p322h.p323e.p325j.C3928a;
import p213q.p217b.p317d.p322h.p323e.p326k.C3937d0;
import p213q.p217b.p317d.p322h.p323e.p326k.C3941f0;
import p213q.p217b.p317d.p322h.p323e.p326k.C3960m;
import p213q.p217b.p317d.p322h.p323e.p326k.C3975t;

/* renamed from: q.b.d.h.e.i.d */
public class C3925d implements C3923b, C3928a {

    /* renamed from: a */
    public C3937d0 f9579a;

    /* renamed from: a */
    public static String m9333a(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    /* renamed from: a */
    public void mo10118a(C3937d0 d0Var) {
        this.f9579a = d0Var;
        C3913b.f9552c.mo10108a("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    /* renamed from: b */
    public void mo10117b(String str, Bundle bundle) {
        C3937d0 d0Var = this.f9579a;
        if (d0Var != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("$A$:");
                sb.append(m9333a(str, bundle));
                String sb2 = sb.toString();
                C3941f0 f0Var = d0Var.f9601a;
                if (f0Var != null) {
                    long currentTimeMillis = System.currentTimeMillis() - f0Var.f9611d;
                    C3975t tVar = f0Var.f9614g;
                    tVar.f9722e.mo10137a(new C3960m(tVar, currentTimeMillis, sb2));
                    return;
                }
                throw null;
            } catch (JSONException unused) {
                C3913b.f9552c.mo10113c("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
