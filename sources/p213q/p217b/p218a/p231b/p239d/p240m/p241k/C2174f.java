package p213q.p217b.p218a.p231b.p239d.p240m.p241k;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import javax.annotation.concurrent.GuardedBy;
import p116io.jsonwebtoken.lang.Strings;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.C2131k;
import p213q.p217b.p218a.p231b.p239d.p242n.C2263p0;

@Deprecated
/* renamed from: q.b.a.b.d.m.k.f */
public final class C2174f {

    /* renamed from: d */
    public static final Object f6080d = new Object();
    @GuardedBy("sLock")

    /* renamed from: e */
    public static C2174f f6081e;

    /* renamed from: a */
    public final String f6082a;

    /* renamed from: b */
    public final Status f6083b;

    /* renamed from: c */
    public final boolean f6084c;

    public C2174f(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(C2131k.common_google_play_services_unknown_issue));
        boolean z = false;
        if (identifier != 0) {
            if (resources.getInteger(identifier) != 0) {
                z = true;
            }
            this.f6084c = !z;
        } else {
            this.f6084c = false;
        }
        C2263p0.m5118a(context);
        String str = C2263p0.f6223c;
        if (str == null) {
            C1061o.m2524b(context);
            Resources resources2 = context.getResources();
            int identifier2 = resources2.getIdentifier("google_app_id", "string", resources2.getResourcePackageName(C2131k.common_google_play_services_unknown_issue));
            str = identifier2 == 0 ? null : resources2.getString(identifier2);
        }
        if (TextUtils.isEmpty(str)) {
            this.f6083b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f6082a = null;
            return;
        }
        this.f6082a = str;
        this.f6083b = Status.f1058i;
    }

    /* renamed from: a */
    public static Status m4995a(Context context) {
        Status status;
        C1061o.m2525b(context, (Object) "Context must not be null.");
        synchronized (f6080d) {
            if (f6081e == null) {
                f6081e = new C2174f(context);
            }
            status = f6081e.f6083b;
        }
        return status;
    }

    /* renamed from: a */
    public static C2174f m4996a(String str) {
        C2174f fVar;
        synchronized (f6080d) {
            if (f6081e != null) {
                fVar = f6081e;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(Strings.CURRENT_PATH);
                throw new IllegalStateException(sb.toString());
            }
        }
        return fVar;
    }
}
