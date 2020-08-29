package p213q.p217b.p218a.p231b.p239d.p248r;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.d.r.a */
public class C2293a {

    /* renamed from: a */
    public final Context f6270a;

    public C2293a(Context context) {
        this.f6270a = context;
    }

    /* renamed from: a */
    public ApplicationInfo mo7308a(String str, int i) {
        return this.f6270a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: a */
    public boolean mo7309a() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return C2286e.m5259a(this.f6270a);
        }
        if (C2286e.m5333e()) {
            String nameForUid = this.f6270a.getPackageManager().getNameForUid(Binder.getCallingUid());
            if (nameForUid != null) {
                return this.f6270a.getPackageManager().isInstantApp(nameForUid);
            }
        }
        return false;
    }

    /* renamed from: b */
    public PackageInfo mo7310b(String str, int i) {
        return this.f6270a.getPackageManager().getPackageInfo(str, i);
    }
}
