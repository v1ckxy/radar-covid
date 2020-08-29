package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;
import p124p.p126b.p127k.C1061o;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p249e.C2303a;
import p213q.p217b.p218a.p231b.p249e.C2306b;
import p213q.p217b.p218a.p231b.p250f.C2307a;
import p213q.p217b.p218a.p231b.p250f.C2308b;
import p213q.p217b.p218a.p231b.p250f.C2309c;
import p213q.p217b.p218a.p231b.p250f.C2310d;
import p213q.p217b.p218a.p231b.p250f.C2312f;
import p213q.p217b.p218a.p231b.p250f.C2313g;
import p213q.p217b.p218a.p231b.p250f.C2314h;
import p213q.p217b.p218a.p231b.p250f.C2315i;

public final class DynamiteModule {
    @GuardedBy("DynamiteModule.class")

    /* renamed from: b */
    public static Boolean f1092b = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: c */
    public static C2313g f1093c = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: d */
    public static C2315i f1094d = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: e */
    public static String f1095e = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: f */
    public static int f1096f = -1;

    /* renamed from: g */
    public static final ThreadLocal<C0198c> f1097g = new ThreadLocal<>();

    /* renamed from: h */
    public static final C0197b f1098h = new C2307a();

    /* renamed from: i */
    public static final C0195b f1099i = new C2308b();

    /* renamed from: j */
    public static final C0195b f1100j = new C2309c();

    /* renamed from: k */
    public static final C0195b f1101k = new C2310d();

    /* renamed from: a */
    public final Context f1102a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public static class C0194a extends Exception {
        public /* synthetic */ C0194a(String str, C2307a aVar) {
            super(str);
        }

        public /* synthetic */ C0194a(String str, Throwable th, C2307a aVar) {
            super(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    public interface C0195b {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        public static class C0196a {

            /* renamed from: a */
            public int f1103a = 0;

            /* renamed from: b */
            public int f1104b = 0;

            /* renamed from: c */
            public int f1105c = 0;
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        public interface C0197b {
            /* renamed from: a */
            int mo1541a(Context context, String str);

            /* renamed from: a */
            int mo1542a(Context context, String str, boolean z);
        }

        /* renamed from: a */
        C0196a mo1540a(Context context, String str, C0197b bVar);
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$c */
    public static class C0198c {

        /* renamed from: a */
        public Cursor f1106a;

        public C0198c() {
        }

        public /* synthetic */ C0198c(C2307a aVar) {
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$d */
    public static class C0199d implements C0197b {

        /* renamed from: a */
        public final int f1107a;

        public C0199d(int i) {
            this.f1107a = i;
        }

        /* renamed from: a */
        public final int mo1541a(Context context, String str) {
            return this.f1107a;
        }

        /* renamed from: a */
        public final int mo1542a(Context context, String str, boolean z) {
            return 0;
        }
    }

    public DynamiteModule(Context context) {
        C1061o.m2524b(context);
        this.f1102a = context;
    }

    /* renamed from: a */
    public static int m890a(Context context, String str) {
        String str2 = "DynamiteModule";
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e(str2, sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(C1965a.m4743a(str, 45));
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w(str2, sb3.toString());
            return 0;
        } catch (Exception e) {
            String str3 = "Failed to load module descriptor class: ";
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e(str2, valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
            return 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:44|45) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:15|16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r4 = java.lang.ClassLoader.getSystemClassLoader();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0090 */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00cc A[SYNTHETIC, Splitter:B:62:0x00cc] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f3 A[Catch:{ a -> 0x00d1, all -> 0x00fb }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0052=Splitter:B:23:0x0052, B:17:0x0037=Splitter:B:17:0x0037, B:39:0x008d=Splitter:B:39:0x008d} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m891a(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x00fb }
            java.lang.Boolean r1 = f1092b     // Catch:{ all -> 0x00f8 }
            if (r1 != 0) goto L_0x00c5
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00a0, IllegalAccessException -> 0x009e, NoSuchFieldException -> 0x009c }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00a0, IllegalAccessException -> 0x009e, NoSuchFieldException -> 0x009c }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x00a0, IllegalAccessException -> 0x009e, NoSuchFieldException -> 0x009c }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x00a0, IllegalAccessException -> 0x009e, NoSuchFieldException -> 0x009c }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException -> 0x00a0, IllegalAccessException -> 0x009e, NoSuchFieldException -> 0x009c }
            java.lang.Class r2 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00a0, IllegalAccessException -> 0x009e, NoSuchFieldException -> 0x009c }
            monitor-enter(r2)     // Catch:{ ClassNotFoundException -> 0x00a0, IllegalAccessException -> 0x009e, NoSuchFieldException -> 0x009c }
            r3 = 0
            java.lang.Object r4 = r1.get(r3)     // Catch:{ all -> 0x0099 }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x0099 }
            if (r4 == 0) goto L_0x003a
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0099 }
            if (r4 != r1) goto L_0x0034
            goto L_0x0095
        L_0x0034:
            m896a(r4)     // Catch:{ a -> 0x0037 }
        L_0x0037:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0099 }
            goto L_0x0097
        L_0x003a:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x0099 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x0099 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0099 }
            if (r4 == 0) goto L_0x0052
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0099 }
        L_0x004e:
            r1.set(r3, r4)     // Catch:{ all -> 0x0099 }
            goto L_0x0095
        L_0x0052:
            int r4 = m900c(r8, r9, r10)     // Catch:{ a -> 0x0090 }
            java.lang.String r5 = f1095e     // Catch:{ a -> 0x0090 }
            if (r5 == 0) goto L_0x008d
            java.lang.String r5 = f1095e     // Catch:{ a -> 0x0090 }
            boolean r5 = r5.isEmpty()     // Catch:{ a -> 0x0090 }
            if (r5 == 0) goto L_0x0063
            goto L_0x008d
        L_0x0063:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x0090 }
            r6 = 29
            if (r5 < r6) goto L_0x0075
            dalvik.system.DelegateLastClassLoader r5 = new dalvik.system.DelegateLastClassLoader     // Catch:{ a -> 0x0090 }
            java.lang.String r6 = f1095e     // Catch:{ a -> 0x0090 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x0090 }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x0090 }
            goto L_0x0080
        L_0x0075:
            q.b.a.b.f.e r5 = new q.b.a.b.f.e     // Catch:{ a -> 0x0090 }
            java.lang.String r6 = f1095e     // Catch:{ a -> 0x0090 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x0090 }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x0090 }
        L_0x0080:
            m896a(r5)     // Catch:{ a -> 0x0090 }
            r1.set(r3, r5)     // Catch:{ a -> 0x0090 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ a -> 0x0090 }
            f1092b = r5     // Catch:{ a -> 0x0090 }
            monitor-exit(r2)     // Catch:{ all -> 0x0099 }
            monitor-exit(r0)     // Catch:{ all -> 0x00f8 }
            return r4
        L_0x008d:
            monitor-exit(r2)     // Catch:{ all -> 0x0099 }
            monitor-exit(r0)     // Catch:{ all -> 0x00f8 }
            return r4
        L_0x0090:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0099 }
            goto L_0x004e
        L_0x0095:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0099 }
        L_0x0097:
            monitor-exit(r2)     // Catch:{ all -> 0x0099 }
            goto L_0x00c3
        L_0x0099:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0099 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00a0, IllegalAccessException -> 0x009e, NoSuchFieldException -> 0x009c }
        L_0x009c:
            r1 = move-exception
            goto L_0x00a1
        L_0x009e:
            r1 = move-exception
            goto L_0x00a1
        L_0x00a0:
            r1 = move-exception
        L_0x00a1:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00f8 }
            int r3 = r1.length()     // Catch:{ all -> 0x00f8 }
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f8 }
            r4.<init>(r3)     // Catch:{ all -> 0x00f8 }
            java.lang.String r3 = "Failed to load module via V2: "
            r4.append(r3)     // Catch:{ all -> 0x00f8 }
            r4.append(r1)     // Catch:{ all -> 0x00f8 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00f8 }
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x00f8 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00f8 }
        L_0x00c3:
            f1092b = r1     // Catch:{ all -> 0x00f8 }
        L_0x00c5:
            monitor-exit(r0)     // Catch:{ all -> 0x00f8 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x00f3
            int r8 = m900c(r8, r9, r10)     // Catch:{ a -> 0x00d1 }
            return r8
        L_0x00d1:
            r9 = move-exception
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00fb }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00fb }
            int r1 = r9.length()     // Catch:{ all -> 0x00fb }
            if (r1 == 0) goto L_0x00e9
            java.lang.String r9 = r0.concat(r9)     // Catch:{ all -> 0x00fb }
            goto L_0x00ee
        L_0x00e9:
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x00fb }
            r9.<init>(r0)     // Catch:{ all -> 0x00fb }
        L_0x00ee:
            android.util.Log.w(r10, r9)     // Catch:{ all -> 0x00fb }
            r8 = 0
            return r8
        L_0x00f3:
            int r8 = m897b(r8, r9, r10)     // Catch:{ all -> 0x00fb }
            return r8
        L_0x00f8:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00f8 }
            throw r9     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r9 = move-exception
            p124p.p126b.p127k.C1061o.m2524b(r8)     // Catch:{ Exception -> 0x0103 }
            p124p.p126b.p127k.C1061o.m2524b(r9)     // Catch:{ Exception -> 0x0103 }
            goto L_0x010b
        L_0x0103:
            r8 = move-exception
            java.lang.String r10 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r10, r0, r8)
        L_0x010b:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m891a(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007c, code lost:
        if (r11 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
        if (r11 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ce, code lost:
        if (r11 != null) goto L_0x007e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule m892a(android.content.Context r10, com.google.android.gms.dynamite.DynamiteModule.C0195b r11, java.lang.String r12) {
        /*
            java.lang.String r0 = ":"
            java.lang.String r1 = "DynamiteModule"
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r2 = f1097g
            java.lang.Object r2 = r2.get()
            com.google.android.gms.dynamite.DynamiteModule$c r2 = (com.google.android.gms.dynamite.DynamiteModule.C0198c) r2
            com.google.android.gms.dynamite.DynamiteModule$c r3 = new com.google.android.gms.dynamite.DynamiteModule$c
            r4 = 0
            r3.<init>(r4)
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r5 = f1097g
            r5.set(r3)
            com.google.android.gms.dynamite.DynamiteModule$b$b r5 = f1098h     // Catch:{ all -> 0x011e }
            com.google.android.gms.dynamite.DynamiteModule$b$a r5 = r11.mo1540a(r10, r12, r5)     // Catch:{ all -> 0x011e }
            int r6 = r5.f1103a     // Catch:{ all -> 0x011e }
            int r7 = r5.f1104b     // Catch:{ all -> 0x011e }
            java.lang.String r8 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x011e }
            int r8 = r8.length()     // Catch:{ all -> 0x011e }
            int r8 = r8 + 68
            java.lang.String r9 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x011e }
            int r9 = r9.length()     // Catch:{ all -> 0x011e }
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x011e }
            r9.<init>(r8)     // Catch:{ all -> 0x011e }
            java.lang.String r8 = "Considering local module "
            r9.append(r8)     // Catch:{ all -> 0x011e }
            r9.append(r12)     // Catch:{ all -> 0x011e }
            r9.append(r0)     // Catch:{ all -> 0x011e }
            r9.append(r6)     // Catch:{ all -> 0x011e }
            java.lang.String r6 = " and remote module "
            r9.append(r6)     // Catch:{ all -> 0x011e }
            r9.append(r12)     // Catch:{ all -> 0x011e }
            r9.append(r0)     // Catch:{ all -> 0x011e }
            r9.append(r7)     // Catch:{ all -> 0x011e }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x011e }
            android.util.Log.i(r1, r0)     // Catch:{ all -> 0x011e }
            int r0 = r5.f1105c     // Catch:{ all -> 0x011e }
            if (r0 == 0) goto L_0x00f4
            int r0 = r5.f1105c     // Catch:{ all -> 0x011e }
            r6 = -1
            if (r0 != r6) goto L_0x0069
            int r0 = r5.f1103a     // Catch:{ all -> 0x011e }
            if (r0 == 0) goto L_0x00f4
        L_0x0069:
            int r0 = r5.f1105c     // Catch:{ all -> 0x011e }
            r7 = 1
            if (r0 != r7) goto L_0x0072
            int r0 = r5.f1104b     // Catch:{ all -> 0x011e }
            if (r0 == 0) goto L_0x00f4
        L_0x0072:
            int r0 = r5.f1105c     // Catch:{ all -> 0x011e }
            if (r0 != r6) goto L_0x0087
            com.google.android.gms.dynamite.DynamiteModule r10 = m898b(r10, r12)     // Catch:{ all -> 0x011e }
            android.database.Cursor r11 = r3.f1106a
            if (r11 == 0) goto L_0x0081
        L_0x007e:
            r11.close()
        L_0x0081:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r11 = f1097g
            r11.set(r2)
            return r10
        L_0x0087:
            int r0 = r5.f1105c     // Catch:{ all -> 0x011e }
            if (r0 != r7) goto L_0x00d9
            int r0 = r5.f1104b     // Catch:{ a -> 0x0096 }
            com.google.android.gms.dynamite.DynamiteModule r10 = m893a(r10, r12, r0)     // Catch:{ a -> 0x0096 }
            android.database.Cursor r11 = r3.f1106a
            if (r11 == 0) goto L_0x0081
            goto L_0x007e
        L_0x0096:
            r0 = move-exception
            java.lang.String r7 = "Failed to load remote module: "
            java.lang.String r8 = r0.getMessage()     // Catch:{ all -> 0x011e }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x011e }
            int r9 = r8.length()     // Catch:{ all -> 0x011e }
            if (r9 == 0) goto L_0x00ac
            java.lang.String r7 = r7.concat(r8)     // Catch:{ all -> 0x011e }
            goto L_0x00b2
        L_0x00ac:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x011e }
            r8.<init>(r7)     // Catch:{ all -> 0x011e }
            r7 = r8
        L_0x00b2:
            android.util.Log.w(r1, r7)     // Catch:{ all -> 0x011e }
            int r1 = r5.f1103a     // Catch:{ all -> 0x011e }
            if (r1 == 0) goto L_0x00d1
            com.google.android.gms.dynamite.DynamiteModule$d r1 = new com.google.android.gms.dynamite.DynamiteModule$d     // Catch:{ all -> 0x011e }
            int r5 = r5.f1103a     // Catch:{ all -> 0x011e }
            r1.<init>(r5)     // Catch:{ all -> 0x011e }
            com.google.android.gms.dynamite.DynamiteModule$b$a r11 = r11.mo1540a(r10, r12, r1)     // Catch:{ all -> 0x011e }
            int r11 = r11.f1105c     // Catch:{ all -> 0x011e }
            if (r11 != r6) goto L_0x00d1
            com.google.android.gms.dynamite.DynamiteModule r10 = m898b(r10, r12)     // Catch:{ all -> 0x011e }
            android.database.Cursor r11 = r3.f1106a
            if (r11 == 0) goto L_0x0081
            goto L_0x007e
        L_0x00d1:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x011e }
            java.lang.String r11 = "Remote load failed. No local fallback found."
            r10.<init>(r11, r0, r4)     // Catch:{ all -> 0x011e }
            throw r10     // Catch:{ all -> 0x011e }
        L_0x00d9:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x011e }
            int r11 = r5.f1105c     // Catch:{ all -> 0x011e }
            r12 = 47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x011e }
            r0.<init>(r12)     // Catch:{ all -> 0x011e }
            java.lang.String r12 = "VersionPolicy returned invalid code:"
            r0.append(r12)     // Catch:{ all -> 0x011e }
            r0.append(r11)     // Catch:{ all -> 0x011e }
            java.lang.String r11 = r0.toString()     // Catch:{ all -> 0x011e }
            r10.<init>(r11, r4)     // Catch:{ all -> 0x011e }
            throw r10     // Catch:{ all -> 0x011e }
        L_0x00f4:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x011e }
            int r11 = r5.f1103a     // Catch:{ all -> 0x011e }
            int r12 = r5.f1104b     // Catch:{ all -> 0x011e }
            r0 = 91
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x011e }
            r1.<init>(r0)     // Catch:{ all -> 0x011e }
            java.lang.String r0 = "No acceptable module found. Local version is "
            r1.append(r0)     // Catch:{ all -> 0x011e }
            r1.append(r11)     // Catch:{ all -> 0x011e }
            java.lang.String r11 = " and remote version is "
            r1.append(r11)     // Catch:{ all -> 0x011e }
            r1.append(r12)     // Catch:{ all -> 0x011e }
            java.lang.String r11 = "."
            r1.append(r11)     // Catch:{ all -> 0x011e }
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x011e }
            r10.<init>(r11, r4)     // Catch:{ all -> 0x011e }
            throw r10     // Catch:{ all -> 0x011e }
        L_0x011e:
            r10 = move-exception
            android.database.Cursor r11 = r3.f1106a
            if (r11 == 0) goto L_0x0126
            r11.close()
        L_0x0126:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r11 = f1097g
            r11.set(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m892a(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* renamed from: a */
    public static Boolean m894a() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(f1096f >= 2);
        }
        return valueOf;
    }

    /* renamed from: a */
    public static C2313g m895a(Context context) {
        C2313g gVar;
        synchronized (DynamiteModule.class) {
            if (f1093c != null) {
                C2313g gVar2 = f1093c;
                return gVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    gVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    gVar = queryLocalInterface instanceof C2313g ? (C2313g) queryLocalInterface : new C2312f(iBinder);
                }
                if (gVar != null) {
                    f1093c = gVar;
                    return gVar;
                }
            } catch (Exception e) {
                String str = "DynamiteModule";
                String str2 = "Failed to load IDynamiteLoader from GmsCore: ";
                String valueOf = String.valueOf(e.getMessage());
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
        }
        return null;
    }

    @GuardedBy("DynamiteModule.class")
    /* renamed from: a */
    public static void m896a(ClassLoader classLoader) {
        C2315i iVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                iVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                iVar = queryLocalInterface instanceof C2315i ? (C2315i) queryLocalInterface : new C2314h(iBinder);
            }
            f1094d = iVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C0194a("Failed to instantiate dynamite loader", e, null);
        }
    }

    /* renamed from: b */
    public static int m897b(Context context, String str, boolean z) {
        String str2 = "DynamiteModule";
        C2313g a = m895a(context);
        if (a == null) {
            return 0;
        }
        try {
            if (a.mo7323b() >= 2) {
                return a.mo7321a((C2303a) new C2306b(context), str, z);
            }
            Log.w(str2, "IDynamite loader version < 2, falling back to getModuleVersion2");
            return a.mo7324b((C2303a) new C2306b(context), str, z);
        } catch (RemoteException e) {
            String str3 = "Failed to retrieve remote module version: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return 0;
        }
    }

    /* renamed from: b */
    public static DynamiteModule m898b(Context context, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "Selected local version of ";
        Log.i("DynamiteModule", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b0  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m900c(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            if (r10 == 0) goto L_0x000a
            java.lang.String r8 = "api_force_staging"
            goto L_0x000c
        L_0x000a:
            java.lang.String r8 = "api"
        L_0x000c:
            int r10 = r8.length()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r2 = r2.length()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.<init>(r10)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.append(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.append(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            if (r8 == 0) goto L_0x0083
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r9 == 0) goto L_0x0083
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r9 <= 0) goto L_0x007c
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch:{ all -> 0x0079 }
            f1095e = r1     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch:{ all -> 0x0079 }
            if (r1 < 0) goto L_0x0067
            int r1 = r8.getInt(r1)     // Catch:{ all -> 0x0079 }
            f1096f = r1     // Catch:{ all -> 0x0079 }
        L_0x0067:
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r10 = f1097g     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$c r10 = (com.google.android.gms.dynamite.DynamiteModule.C0198c) r10     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r10 == 0) goto L_0x007c
            android.database.Cursor r1 = r10.f1106a     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r1 != 0) goto L_0x007c
            r10.f1106a = r8     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            goto L_0x007d
        L_0x0079:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            throw r9     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
        L_0x007c:
            r0 = r8
        L_0x007d:
            if (r0 == 0) goto L_0x0082
            r0.close()
        L_0x0082:
            return r9
        L_0x0083:
            java.lang.String r9 = "DynamiteModule"
            java.lang.String r10 = "Failed to retrieve remote module version."
            android.util.Log.w(r9, r10)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>(r10, r0)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            throw r9     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
        L_0x0092:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00ae
        L_0x0096:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x009f
        L_0x009b:
            r8 = move-exception
            goto L_0x00ae
        L_0x009d:
            r8 = move-exception
            r9 = r0
        L_0x009f:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.C0194a     // Catch:{ all -> 0x00ac }
            if (r10 == 0) goto L_0x00a4
            throw r8     // Catch:{ all -> 0x00ac }
        L_0x00a4:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch:{ all -> 0x00ac }
            throw r10     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r8 = move-exception
            r0 = r9
        L_0x00ae:
            if (r0 == 0) goto L_0x00b3
            r0.close()
        L_0x00b3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m900c(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: a */
    public final IBinder mo1539a(String str) {
        try {
            return (IBinder) this.f1102a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String str2 = "Failed to instantiate module class: ";
            String valueOf = String.valueOf(str);
            throw new C0194a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e, null);
        }
    }

    /* renamed from: a */
    public static DynamiteModule m893a(Context context, String str, int i) {
        Boolean bool;
        C2303a aVar;
        try {
            synchronized (DynamiteModule.class) {
                bool = f1092b;
            }
            if (bool == null) {
                throw new C0194a("Failed to determine which loading route to use.", null);
            } else if (bool.booleanValue()) {
                return m899b(context, str, i);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i);
                Log.i("DynamiteModule", sb.toString());
                C2313g a = m895a(context);
                if (a != null) {
                    if (a.mo7323b() >= 2) {
                        aVar = a.mo7322a((C2303a) new C2306b(context), str, i);
                    } else {
                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                        aVar = a.mo7325b((C2303a) new C2306b(context), str, i);
                    }
                    if (C2306b.m5379a(aVar) != null) {
                        return new DynamiteModule((Context) C2306b.m5379a(aVar));
                    }
                    throw new C0194a("Failed to load remote module.", null);
                }
                throw new C0194a("Failed to create IDynamiteLoader.", null);
            }
        } catch (RemoteException e) {
            throw new C0194a("Failed to load remote module.", e, null);
        } catch (C0194a e2) {
            throw e2;
        } catch (Throwable th) {
            try {
                C1061o.m2524b(context);
                C1061o.m2524b(th);
            } catch (Exception e3) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e3);
            }
            throw new C0194a("Failed to load remote module.", th, null);
        }
    }

    /* renamed from: b */
    public static DynamiteModule m899b(Context context, String str, int i) {
        C2315i iVar;
        C2303a aVar;
        StringBuilder sb = new StringBuilder(C1965a.m4743a(str, 51));
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            iVar = f1094d;
        }
        if (iVar != null) {
            C0198c cVar = (C0198c) f1097g.get();
            if (cVar == null || cVar.f1106a == null) {
                throw new C0194a("No result cursor", null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = cVar.f1106a;
            new C2306b(null);
            if (m894a().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                aVar = iVar.mo7327b(new C2306b(applicationContext), str, i, new C2306b(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                aVar = iVar.mo7326a(new C2306b(applicationContext), str, i, new C2306b(cursor));
            }
            Context context2 = (Context) C2306b.m5379a(aVar);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new C0194a("Failed to get module context", null);
        }
        throw new C0194a("DynamiteLoaderV2 was not cached.", null);
    }
}
