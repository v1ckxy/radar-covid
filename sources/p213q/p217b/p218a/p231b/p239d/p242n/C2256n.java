package p213q.p217b.p218a.p231b.p239d.p242n;

import android.content.Context;
import android.content.res.Resources;
import javax.annotation.Nullable;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.C2131k;

/* renamed from: q.b.a.b.d.n.n */
public class C2256n {

    /* renamed from: a */
    public final Resources f6217a;

    /* renamed from: b */
    public final String f6218b;

    public C2256n(Context context) {
        C1061o.m2524b(context);
        Resources resources = context.getResources();
        this.f6217a = resources;
        this.f6218b = resources.getResourcePackageName(C2131k.common_google_play_services_unknown_issue);
    }

    @Nullable
    /* renamed from: a */
    public String mo7285a(String str) {
        int identifier = this.f6217a.getIdentifier(str, "string", this.f6218b);
        if (identifier == 0) {
            return null;
        }
        return this.f6217a.getString(identifier);
    }
}
