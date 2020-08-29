package p124p.p199y.p200x.p210t;

import android.content.ComponentName;
import android.content.Context;
import p124p.p199y.C1800l;

/* renamed from: p.y.x.t.g */
public class C1936g {

    /* renamed from: a */
    public static final String f5571a = C1800l.m4459a("PackageManagerHelper");

    /* renamed from: a */
    public static void m4705a(Context context, Class<?> cls, boolean z) {
        String str = "enabled";
        String str2 = "disabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            C1800l a = C1800l.m4460a();
            String str3 = f5571a;
            String str4 = "%s %s";
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? str : str2;
            a.mo6782a(str3, String.format(str4, objArr), new Throwable[0]);
        } catch (Exception e) {
            C1800l a2 = C1800l.m4460a();
            String str5 = f5571a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str = str2;
            }
            objArr2[1] = str;
            a2.mo6782a(str5, String.format("%s could not be %s", objArr2), e);
        }
    }
}
