package p213q.p217b.p218a.p231b.p239d.p246q;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.io.BufferedReader;
import java.io.FileReader;

/* renamed from: q.b.a.b.d.q.f */
public class C2287f {

    /* renamed from: a */
    public static String f6257a;

    /* renamed from: b */
    public static int f6258b;

    /* renamed from: a */
    public static BufferedReader m5353a(String str) {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.String, ?[OBJECT, ARRAY]]
      uses: [java.lang.String, ?[int, boolean, OBJECT, ARRAY, byte, short, char], java.io.Closeable]
      mth insns count: 41
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC, Splitter:B:18:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004b A[SYNTHETIC, Splitter:B:26:0x004b] */
    /* JADX WARNING: Unknown variable types count: 4 */
    @javax.annotation.Nullable
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m5354a() {
        /*
            java.lang.String r0 = f6257a
            if (r0 != 0) goto L_0x0050
            int r0 = f6258b
            if (r0 != 0) goto L_0x000e
            int r0 = android.os.Process.myPid()
            f6258b = r0
        L_0x000e:
            int r0 = f6258b
            r1 = 0
            if (r0 > 0) goto L_0x0014
            goto L_0x004e
        L_0x0014:
            r2 = 25
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0048, all -> 0x0041 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0048, all -> 0x0041 }
            java.lang.String r2 = "/proc/"
            r3.append(r2)     // Catch:{ IOException -> 0x0048, all -> 0x0041 }
            r3.append(r0)     // Catch:{ IOException -> 0x0048, all -> 0x0041 }
            java.lang.String r0 = "/cmdline"
            r3.append(r0)     // Catch:{ IOException -> 0x0048, all -> 0x0041 }
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x0048, all -> 0x0041 }
            java.io.BufferedReader r0 = m5353a(r0)     // Catch:{ IOException -> 0x0048, all -> 0x0041 }
            java.lang.String r2 = r0.readLine()     // Catch:{ IOException -> 0x0049, all -> 0x003c }
            java.lang.String r1 = r2.trim()     // Catch:{ IOException -> 0x0049, all -> 0x003c }
            r0.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x004e
        L_0x003c:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x0042
        L_0x0041:
            r0 = move-exception
        L_0x0042:
            if (r1 == 0) goto L_0x0047
            r1.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            throw r0
        L_0x0048:
            r0 = r1
        L_0x0049:
            if (r0 == 0) goto L_0x004e
            r0.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            f6257a = r1
        L_0x0050:
            java.lang.String r0 = f6257a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p239d.p246q.C2287f.m5354a():java.lang.String");
    }
}
