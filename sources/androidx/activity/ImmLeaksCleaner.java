package androidx.activity;

import android.app.Activity;
import java.lang.reflect.Field;
import p124p.p177n.C1540f;

public final class ImmLeaksCleaner implements C1540f {

    /* renamed from: b */
    public static int f8b;

    /* renamed from: c */
    public static Field f9c;

    /* renamed from: d */
    public static Field f10d;

    /* renamed from: e */
    public static Field f11e;

    /* renamed from: a */
    public Activity f12a;

    public ImmLeaksCleaner(Activity activity) {
        this.f12a = activity;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:32|33|34) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0069, code lost:
        r3.isActive();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006e, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x006d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9a(p124p.p177n.C1542h r3, p124p.p177n.C1537e.C1538a r4) {
        /*
            r2 = this;
            p.n.e$a r3 = p124p.p177n.C1537e.C1538a.ON_DESTROY
            if (r4 == r3) goto L_0x0005
            return
        L_0x0005:
            int r3 = f8b
            r4 = 1
            if (r3 != 0) goto L_0x0036
            r3 = 2
            f8b = r3     // Catch:{ NoSuchFieldException -> 0x0036 }
            java.lang.Class<android.view.inputmethod.InputMethodManager> r3 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r0 = "mServedView"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0036 }
            f10d = r3     // Catch:{ NoSuchFieldException -> 0x0036 }
            r3.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x0036 }
            java.lang.Class<android.view.inputmethod.InputMethodManager> r3 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r0 = "mNextServedView"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0036 }
            f11e = r3     // Catch:{ NoSuchFieldException -> 0x0036 }
            r3.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x0036 }
            java.lang.Class<android.view.inputmethod.InputMethodManager> r3 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r0 = "mH"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0036 }
            f9c = r3     // Catch:{ NoSuchFieldException -> 0x0036 }
            r3.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x0036 }
            f8b = r4     // Catch:{ NoSuchFieldException -> 0x0036 }
        L_0x0036:
            int r3 = f8b
            if (r3 != r4) goto L_0x0077
            android.app.Activity r3 = r2.f12a
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.reflect.Field r4 = f9c     // Catch:{ IllegalAccessException -> 0x0077 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalAccessException -> 0x0077 }
            if (r4 != 0) goto L_0x004d
            return
        L_0x004d:
            monitor-enter(r4)
            java.lang.reflect.Field r0 = f10d     // Catch:{ IllegalAccessException -> 0x0073, ClassCastException -> 0x0071 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ IllegalAccessException -> 0x0073, ClassCastException -> 0x0071 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ IllegalAccessException -> 0x0073, ClassCastException -> 0x0071 }
            if (r0 != 0) goto L_0x005a
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return
        L_0x005a:
            boolean r0 = r0.isAttachedToWindow()     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0062
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return
        L_0x0062:
            java.lang.reflect.Field r0 = f11e     // Catch:{ IllegalAccessException -> 0x006d }
            r1 = 0
            r0.set(r3, r1)     // Catch:{ IllegalAccessException -> 0x006d }
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            r3.isActive()
            goto L_0x0077
        L_0x006d:
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return
        L_0x006f:
            r3 = move-exception
            goto L_0x0075
        L_0x0071:
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return
        L_0x0073:
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return
        L_0x0075:
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            throw r3
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.ImmLeaksCleaner.mo9a(p.n.h, p.n.e$a):void");
    }
}
