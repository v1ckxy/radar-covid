package p213q.p217b.p317d.p322h.p323e.p326k;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p317d.p322h.p323e.C3913b;

/* renamed from: q.b.d.h.e.k.g */
public class C3944g {

    /* renamed from: a */
    public static final char[] f9624a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static long f9625b = -1;

    /* renamed from: c */
    public static final Comparator<File> f9626c = new C3945a();

    /* renamed from: q.b.d.h.e.k.g$a */
    public class C3945a implements Comparator<File> {
        public int compare(Object obj, Object obj2) {
            return (int) (((File) obj).lastModified() - ((File) obj2).lastModified());
        }
    }

    /* renamed from: q.b.d.h.e.k.g$b */
    public enum C3946b {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        

        /* renamed from: o */
        public static final Map<String, C3946b> f9637o = null;

        /* access modifiers changed from: public */
        static {
            HashMap hashMap = new HashMap(4);
            f9637o = hashMap;
            hashMap.put("armeabi-v7a", ARMV7);
            f9637o.put("armeabi", ARMV6);
            f9637o.put("arm64-v8a", ARM64);
            f9637o.put("x86", X86_32);
        }

        /* renamed from: f */
        public static C3946b m9373f() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                C3913b.f9552c.mo10108a("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            C3946b bVar = (C3946b) f9637o.get(str.toLowerCase(Locale.US));
            if (bVar == null) {
                bVar = UNKNOWN;
            }
            return bVar;
        }
    }

    /* renamed from: a */
    public static int m9351a() {
        return C3946b.m9373f().ordinal();
    }

    /* renamed from: a */
    public static long m9353a(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    /* renamed from: a */
    public static long m9354a(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    /* renamed from: a */
    public static RunningAppProcessInfo m9355a(String str, Context context) {
        List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m9357a(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : Objects.EMPTY_STRING;
    }

    /* renamed from: a */
    public static String m9358a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f9624a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static String m9359a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", Objects.EMPTY_STRING).toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return m9368c(sb2);
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public static boolean m9362a(Context context) {
        boolean z = false;
        if (!(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m9363a(Context context, String str, boolean z) {
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                int a = m9352a(context, str, "bool");
                if (a > 0) {
                    return resources.getBoolean(a);
                }
                int a2 = m9352a(context, str, "string");
                if (a2 > 0) {
                    return Boolean.parseBoolean(context.getString(a2));
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    public static int m9364b(Context context) {
        boolean z = true;
        int i = m9371f(context) ? 1 : 0;
        if (m9372g(context)) {
            i |= 2;
        }
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            z = false;
        }
        return z ? i | 4 : i;
    }

    /* renamed from: b */
    public static boolean m9366b(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: c */
    public static String m9367c(Context context) {
        String str = "string";
        int a = m9352a(context, "com.google.firebase.crashlytics.mapping_file_id", str);
        if (a == 0) {
            a = m9352a(context, "com.crashlytics.android.build_id", str);
        }
        if (a != 0) {
            return context.getResources().getString(a);
        }
        return null;
    }

    /* renamed from: c */
    public static String m9368c(String str) {
        String str2 = "SHA-1";
        byte[] bytes = str.getBytes();
        try {
            MessageDigest instance = MessageDigest.getInstance(str2);
            instance.update(bytes);
            return m9358a(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            C3913b bVar = C3913b.f9552c;
            StringBuilder sb = new StringBuilder();
            sb.append("Could not create hashing algorithm: ");
            sb.append(str2);
            sb.append(", returning empty string.");
            bVar.mo10112b(sb.toString(), e);
            return Objects.EMPTY_STRING;
        }
    }

    /* renamed from: d */
    public static boolean m9369d(Context context) {
        boolean z = false;
        if (m9371f(context)) {
            return false;
        }
        if (((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: e */
    public static SharedPreferences m9370e(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    /* renamed from: f */
    public static boolean m9371f(Context context) {
        String string = Secure.getString(context.getContentResolver(), "android_id");
        if (!"sdk".equals(Build.PRODUCT)) {
            if (!"google_sdk".equals(Build.PRODUCT) && string != null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m9372g(Context context) {
        boolean f = m9371f(context);
        String str = Build.TAGS;
        if ((!f && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        return !f && new File("/system/xbin/su").exists();
    }

    /* renamed from: b */
    public static synchronized long m9365b() {
        long j;
        synchronized (C3944g.class) {
            if (f9625b == -1) {
                long j2 = 0;
                String a = m9356a(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(a)) {
                    String upperCase = a.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j2 = m9354a(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j2 = m9354a(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j2 = m9354a(upperCase, "GB", 1073741824);
                        } else {
                            C3913b bVar = C3913b.f9552c;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unexpected meminfo format while computing RAM: ");
                            sb.append(upperCase);
                            bVar.mo10108a(sb.toString());
                        }
                    } catch (NumberFormatException e) {
                        C3913b bVar2 = C3913b.f9552c;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unexpected meminfo format while computing RAM: ");
                        sb2.append(upperCase);
                        bVar2.mo10112b(sb2.toString(), e);
                    }
                }
                f9625b = j2;
            }
            j = f9625b;
        }
        return j;
    }

    /* renamed from: a */
    public static void m9360a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C3913b bVar = C3913b.f9552c;
                if (bVar.mo10110a(6)) {
                    Log.e(bVar.f9553a, str, e);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY]]
      uses: [java.lang.String, java.io.Closeable]
      mth insns count: 40
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m9356a(java.io.File r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L_0x005d
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            r3.<init>(r6)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
        L_0x0015:
            java.lang.String r3 = r1.readLine()     // Catch:{ Exception -> 0x003a }
            if (r3 == 0) goto L_0x0036
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch:{ Exception -> 0x003a }
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch:{ Exception -> 0x003a }
            int r4 = r3.length     // Catch:{ Exception -> 0x003a }
            r5 = 1
            if (r4 <= r5) goto L_0x0015
            r4 = 0
            r4 = r3[r4]     // Catch:{ Exception -> 0x003a }
            boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x003a }
            if (r4 == 0) goto L_0x0015
            r6 = r3[r5]     // Catch:{ Exception -> 0x003a }
            r2 = r6
        L_0x0036:
            m9360a(r1, r0)
            goto L_0x005d
        L_0x003a:
            r7 = move-exception
            goto L_0x0040
        L_0x003c:
            r6 = move-exception
            goto L_0x0059
        L_0x003e:
            r7 = move-exception
            r1 = r2
        L_0x0040:
            q.b.d.h.e.b r3 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c     // Catch:{ all -> 0x0057 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0057 }
            r4.<init>()     // Catch:{ all -> 0x0057 }
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch:{ all -> 0x0057 }
            r4.append(r6)     // Catch:{ all -> 0x0057 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0057 }
            r3.mo10112b(r6, r7)     // Catch:{ all -> 0x0057 }
            goto L_0x0036
        L_0x0057:
            r6 = move-exception
            r2 = r1
        L_0x0059:
            m9360a(r2, r0)
            throw r6
        L_0x005d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9356a(java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static void m9361a(Flushable flushable, String str) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (IOException e) {
                C3913b bVar = C3913b.f9552c;
                if (bVar.mo10110a(6)) {
                    Log.e(bVar.f9553a, str, e);
                }
            }
        }
    }

    /* renamed from: a */
    public static int m9352a(Context context, String str, String str2) {
        String str3;
        Resources resources = context.getResources();
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                str3 = context.getResources().getResourcePackageName(i);
            } catch (NotFoundException unused) {
            }
            return resources.getIdentifier(str, str2, str3);
        }
        str3 = context.getPackageName();
        return resources.getIdentifier(str, str2, str3);
    }
}
