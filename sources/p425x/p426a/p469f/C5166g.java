package p425x.p426a.p469f;

import java.security.AccessControlException;
import java.security.AccessController;
import java.util.Map;

/* renamed from: x.a.f.g */
public class C5166g {

    /* renamed from: a */
    public static final ThreadLocal f12354a = new ThreadLocal();

    /* renamed from: a */
    public static boolean m11599a(String str) {
        try {
            String str2 = (String) AccessController.doPrivileged(new C5164e(str));
            if (str2 == null) {
                Map map = (Map) f12354a.get();
                if (map != null) {
                    str2 = (String) map.get(str);
                    if (str2 != null) {
                    }
                }
                str2 = (String) AccessController.doPrivileged(new C5165f(str));
            }
            return "true".equalsIgnoreCase(str2);
        } catch (AccessControlException unused) {
            return false;
        }
    }
}
