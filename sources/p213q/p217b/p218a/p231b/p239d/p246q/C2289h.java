package p213q.p217b.p218a.p231b.p239d.p246q;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import p213q.p217b.p218a.p231b.p239d.p248r.C2294b;

/* renamed from: q.b.a.b.d.q.h */
public class C2289h {

    /* renamed from: a */
    public static final Method f6259a;

    /* renamed from: b */
    public static final Method f6260b;

    /* renamed from: c */
    public static final Method f6261c;

    /* renamed from: d */
    public static final Method f6262d;

    static {
        Method method;
        Method method2;
        Method method3;
        Class<String> cls = String.class;
        String str = "add";
        Process.myUid();
        Method method4 = null;
        try {
            method = WorkSource.class.getMethod(str, new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            method = null;
        }
        f6259a = method;
        try {
            method2 = WorkSource.class.getMethod(str, new Class[]{Integer.TYPE, cls});
        } catch (Exception unused2) {
            method2 = null;
        }
        f6260b = method2;
        try {
            method3 = WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
            method3 = null;
        }
        f6261c = method3;
        try {
            WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused4) {
        }
        try {
            method4 = WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
        } catch (Exception unused5) {
        }
        f6262d = method4;
        String str2 = "WorkSourceUtil";
        if (VERSION.SDK_INT >= 28) {
            try {
                WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e) {
                Log.w(str2, "Missing WorkChain API createWorkChain", e);
            }
        }
        if (VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, cls});
            } catch (Exception e2) {
                Log.w(str2, "Missing WorkChain class", e2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0050 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> m5356a(android.os.WorkSource r9) {
        /*
            java.lang.String r0 = "Unable to assign blame through WorkSource"
            java.lang.String r1 = "WorkSourceUtil"
            r2 = 0
            if (r9 != 0) goto L_0x0009
        L_0x0007:
            r3 = r2
            goto L_0x001f
        L_0x0009:
            java.lang.reflect.Method r3 = f6261c
            if (r3 == 0) goto L_0x0007
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x001a }
            java.lang.Object r3 = r3.invoke(r9, r4)     // Catch:{ Exception -> 0x001a }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x001a }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x001a }
            goto L_0x001f
        L_0x001a:
            r3 = move-exception
            android.util.Log.wtf(r1, r0, r3)
            goto L_0x0007
        L_0x001f:
            if (r3 != 0) goto L_0x0026
            java.util.List r9 = java.util.Collections.emptyList()
            return r9
        L_0x0026:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = r2
        L_0x002c:
            if (r5 >= r3) goto L_0x0053
            java.lang.reflect.Method r6 = f6262d
            if (r6 == 0) goto L_0x0046
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0042 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0042 }
            r7[r2] = r8     // Catch:{ Exception -> 0x0042 }
            java.lang.Object r6 = r6.invoke(r9, r7)     // Catch:{ Exception -> 0x0042 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0042 }
            goto L_0x0047
        L_0x0042:
            r6 = move-exception
            android.util.Log.wtf(r1, r0, r6)
        L_0x0046:
            r6 = 0
        L_0x0047:
            boolean r7 = p213q.p217b.p218a.p231b.p239d.p246q.C2288g.m5355a(r6)
            if (r7 != 0) goto L_0x0050
            r4.add(r6)
        L_0x0050:
            int r5 = r5 + 1
            goto L_0x002c
        L_0x0053:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p239d.p246q.C2289h.m5356a(android.os.WorkSource):java.util.List");
    }

    /* renamed from: a */
    public static boolean m5357a(Context context) {
        if (context == null || context.getPackageManager() == null) {
            return false;
        }
        return C2294b.m5363b(context).f6270a.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0;
    }
}
