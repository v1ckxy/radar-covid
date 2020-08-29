package p213q.p217b.p317d.p322h.p323e.p326k;

import android.content.Context;
import p116io.jsonwebtoken.lang.Objects;

/* renamed from: q.b.d.h.e.k.s0 */
public class C3974s0 {

    /* renamed from: a */
    public String f9709a;

    /* renamed from: a */
    public synchronized String mo10163a(Context context) {
        if (this.f9709a == null) {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            if (installerPackageName == null) {
                installerPackageName = Objects.EMPTY_STRING;
            }
            this.f9709a = installerPackageName;
        }
        return Objects.EMPTY_STRING.equals(this.f9709a) ? null : this.f9709a;
    }
}
