package p213q.p217b.p218a.p231b.p251g.p256e;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: q.b.a.b.g.e.k1 */
public class C2524k1 {

    /* renamed from: a */
    public static final Uri f6662a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f6663b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f6664c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f6665d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    public static final AtomicBoolean f6666e = new AtomicBoolean();

    /* renamed from: f */
    public static HashMap<String, String> f6667f;

    /* renamed from: g */
    public static final HashMap<String, Boolean> f6668g = new HashMap<>();

    /* renamed from: h */
    public static final HashMap<String, Integer> f6669h = new HashMap<>();

    /* renamed from: i */
    public static final HashMap<String, Long> f6670i = new HashMap<>();

    /* renamed from: j */
    public static final HashMap<String, Float> f6671j = new HashMap<>();

    /* renamed from: k */
    public static Object f6672k;

    /* renamed from: l */
    public static boolean f6673l;

    /* renamed from: m */
    public static String[] f6674m = new String[0];

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006a, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c9, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cb, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d5, code lost:
        r12 = r12.query(f6662a, null, null, new java.lang.String[]{r13}, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e3, code lost:
        if (r12 != null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e5, code lost:
        if (r12 == null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e7, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ea, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ef, code lost:
        if (r12.moveToFirst() != false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f1, code lost:
        m6066a(r1, r13, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f7, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r0 = r12.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fc, code lost:
        if (r0 == null) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0102, code lost:
        if (r0.equals(null) == false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0104, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0105, code lost:
        m6066a(r1, r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0108, code lost:
        if (r0 == null) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010a, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x010b, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010e, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010f, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0110, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0113, code lost:
        throw r13;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m6065a(android.content.ContentResolver r12, java.lang.String r13) {
        /*
            java.lang.Class<q.b.a.b.g.e.k1> r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2524k1.class
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f6667f     // Catch:{ all -> 0x0114 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0029
            java.util.concurrent.atomic.AtomicBoolean r1 = f6666e     // Catch:{ all -> 0x0114 }
            r1.set(r3)     // Catch:{ all -> 0x0114 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0114 }
            r1.<init>()     // Catch:{ all -> 0x0114 }
            f6667f = r1     // Catch:{ all -> 0x0114 }
            java.lang.Object r1 = new java.lang.Object     // Catch:{ all -> 0x0114 }
            r1.<init>()     // Catch:{ all -> 0x0114 }
            f6672k = r1     // Catch:{ all -> 0x0114 }
            f6673l = r3     // Catch:{ all -> 0x0114 }
            android.net.Uri r1 = f6662a     // Catch:{ all -> 0x0114 }
            q.b.a.b.g.e.m1 r4 = new q.b.a.b.g.e.m1     // Catch:{ all -> 0x0114 }
            r4.<init>()     // Catch:{ all -> 0x0114 }
            r12.registerContentObserver(r1, r2, r4)     // Catch:{ all -> 0x0114 }
            goto L_0x0053
        L_0x0029:
            java.util.concurrent.atomic.AtomicBoolean r1 = f6666e     // Catch:{ all -> 0x0114 }
            boolean r1 = r1.getAndSet(r3)     // Catch:{ all -> 0x0114 }
            if (r1 == 0) goto L_0x0053
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f6667f     // Catch:{ all -> 0x0114 }
            r1.clear()     // Catch:{ all -> 0x0114 }
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = f6668g     // Catch:{ all -> 0x0114 }
            r1.clear()     // Catch:{ all -> 0x0114 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = f6669h     // Catch:{ all -> 0x0114 }
            r1.clear()     // Catch:{ all -> 0x0114 }
            java.util.HashMap<java.lang.String, java.lang.Long> r1 = f6670i     // Catch:{ all -> 0x0114 }
            r1.clear()     // Catch:{ all -> 0x0114 }
            java.util.HashMap<java.lang.String, java.lang.Float> r1 = f6671j     // Catch:{ all -> 0x0114 }
            r1.clear()     // Catch:{ all -> 0x0114 }
            java.lang.Object r1 = new java.lang.Object     // Catch:{ all -> 0x0114 }
            r1.<init>()     // Catch:{ all -> 0x0114 }
            f6672k = r1     // Catch:{ all -> 0x0114 }
            f6673l = r3     // Catch:{ all -> 0x0114 }
        L_0x0053:
            java.lang.Object r1 = f6672k     // Catch:{ all -> 0x0114 }
            java.util.HashMap<java.lang.String, java.lang.String> r4 = f6667f     // Catch:{ all -> 0x0114 }
            boolean r4 = r4.containsKey(r13)     // Catch:{ all -> 0x0114 }
            r5 = 0
            if (r4 == 0) goto L_0x006b
            java.util.HashMap<java.lang.String, java.lang.String> r12 = f6667f     // Catch:{ all -> 0x0114 }
            java.lang.Object r12 = r12.get(r13)     // Catch:{ all -> 0x0114 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0114 }
            if (r12 == 0) goto L_0x0069
            r5 = r12
        L_0x0069:
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            return r5
        L_0x006b:
            java.lang.String[] r4 = f6674m     // Catch:{ all -> 0x0114 }
            int r6 = r4.length     // Catch:{ all -> 0x0114 }
            r7 = r3
        L_0x006f:
            if (r7 >= r6) goto L_0x00d4
            r8 = r4[r7]     // Catch:{ all -> 0x0114 }
            boolean r8 = r13.startsWith(r8)     // Catch:{ all -> 0x0114 }
            if (r8 == 0) goto L_0x00d1
            boolean r1 = f6673l     // Catch:{ all -> 0x0114 }
            if (r1 == 0) goto L_0x0085
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f6667f     // Catch:{ all -> 0x0114 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0114 }
            if (r1 == 0) goto L_0x00ca
        L_0x0085:
            java.lang.String[] r10 = f6674m     // Catch:{ all -> 0x0114 }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f6667f     // Catch:{ all -> 0x0114 }
            android.net.Uri r7 = f6663b     // Catch:{ all -> 0x0114 }
            r8 = 0
            r9 = 0
            r11 = 0
            r6 = r12
            android.database.Cursor r12 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0114 }
            java.util.TreeMap r4 = new java.util.TreeMap     // Catch:{ all -> 0x0114 }
            r4.<init>()     // Catch:{ all -> 0x0114 }
            if (r12 != 0) goto L_0x009b
            goto L_0x00b0
        L_0x009b:
            boolean r6 = r12.moveToNext()     // Catch:{ all -> 0x00cc }
            if (r6 == 0) goto L_0x00ad
            java.lang.String r6 = r12.getString(r3)     // Catch:{ all -> 0x00cc }
            java.lang.String r7 = r12.getString(r2)     // Catch:{ all -> 0x00cc }
            r4.put(r6, r7)     // Catch:{ all -> 0x00cc }
            goto L_0x009b
        L_0x00ad:
            r12.close()     // Catch:{ all -> 0x0114 }
        L_0x00b0:
            r1.putAll(r4)     // Catch:{ all -> 0x0114 }
            f6673l = r2     // Catch:{ all -> 0x0114 }
            java.util.HashMap<java.lang.String, java.lang.String> r12 = f6667f     // Catch:{ all -> 0x0114 }
            boolean r12 = r12.containsKey(r13)     // Catch:{ all -> 0x0114 }
            if (r12 == 0) goto L_0x00ca
            java.util.HashMap<java.lang.String, java.lang.String> r12 = f6667f     // Catch:{ all -> 0x0114 }
            java.lang.Object r12 = r12.get(r13)     // Catch:{ all -> 0x0114 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0114 }
            if (r12 == 0) goto L_0x00c8
            r5 = r12
        L_0x00c8:
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            return r5
        L_0x00ca:
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            return r5
        L_0x00cc:
            r13 = move-exception
            r12.close()     // Catch:{ all -> 0x0114 }
            throw r13     // Catch:{ all -> 0x0114 }
        L_0x00d1:
            int r7 = r7 + 1
            goto L_0x006f
        L_0x00d4:
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            android.net.Uri r7 = f6662a
            r8 = 0
            r9 = 0
            java.lang.String[] r10 = new java.lang.String[r2]
            r10[r3] = r13
            r11 = 0
            r6 = r12
            android.database.Cursor r12 = r6.query(r7, r8, r9, r10, r11)
            if (r12 != 0) goto L_0x00eb
            if (r12 == 0) goto L_0x00ea
            r12.close()
        L_0x00ea:
            return r5
        L_0x00eb:
            boolean r0 = r12.moveToFirst()     // Catch:{ all -> 0x010f }
            if (r0 != 0) goto L_0x00f8
            m6066a(r1, r13, r5)     // Catch:{ all -> 0x010f }
            r12.close()
            return r5
        L_0x00f8:
            java.lang.String r0 = r12.getString(r2)     // Catch:{ all -> 0x010f }
            if (r0 == 0) goto L_0x0105
            boolean r2 = r0.equals(r5)     // Catch:{ all -> 0x010f }
            if (r2 == 0) goto L_0x0105
            r0 = r5
        L_0x0105:
            m6066a(r1, r13, r0)     // Catch:{ all -> 0x010f }
            if (r0 == 0) goto L_0x010b
            r5 = r0
        L_0x010b:
            r12.close()
            return r5
        L_0x010f:
            r13 = move-exception
            r12.close()
            throw r13
        L_0x0114:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2524k1.m6065a(android.content.ContentResolver, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static void m6066a(Object obj, String str, String str2) {
        synchronized (C2524k1.class) {
            if (obj == f6672k) {
                f6667f.put(str, str2);
            }
        }
    }
}
