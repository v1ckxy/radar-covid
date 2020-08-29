package p213q.p217b.p317d.p322h.p323e.p337s;

import org.json.JSONObject;
import p213q.p217b.p317d.p322h.p323e.p326k.C3999x0;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4177f;

/* renamed from: q.b.d.h.e.s.f */
public class C4169f {

    /* renamed from: a */
    public final C3999x0 f10081a;

    public C4169f(C3999x0 x0Var) {
        this.f10081a = x0Var;
    }

    /* renamed from: a */
    public C4177f mo10375a(JSONObject jSONObject) {
        return (jSONObject.getInt("settings_version") != 3 ? new C4164b() : new C4171h()).mo10369a(this.f10081a, jSONObject);
    }
}
