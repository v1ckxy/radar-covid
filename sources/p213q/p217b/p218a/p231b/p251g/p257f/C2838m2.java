package p213q.p217b.p218a.p231b.p251g.p257f;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: q.b.a.b.g.f.m2 */
public class C2838m2 {

    /* renamed from: a */
    public static final Uri f7058a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f7059b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f7060c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f7061d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    public static final AtomicBoolean f7062e = new AtomicBoolean();

    /* renamed from: f */
    public static HashMap<String, String> f7063f;

    /* renamed from: g */
    public static final HashMap<String, Boolean> f7064g = new HashMap<>();

    /* renamed from: h */
    public static final HashMap<String, Integer> f7065h = new HashMap<>();

    /* renamed from: i */
    public static final HashMap<String, Long> f7066i = new HashMap<>();

    /* renamed from: j */
    public static final HashMap<String, Float> f7067j = new HashMap<>();

    /* renamed from: k */
    public static Object f7068k;

    /* renamed from: l */
    public static boolean f7069l;

    /* renamed from: m */
    public static String[] f7070m = new String[0];

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T m6623a(java.util.HashMap<java.lang.String, T> r2, java.lang.String r3, T r4) {
        /*
            java.lang.Class<q.b.a.b.g.f.m2> r0 = p213q.p217b.p218a.p231b.p251g.p257f.C2838m2.class
            monitor-enter(r0)
            boolean r1 = r2.containsKey(r3)     // Catch:{ all -> 0x0015 }
            if (r1 == 0) goto L_0x0012
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0015 }
            if (r2 == 0) goto L_0x0010
            r4 = r2
        L_0x0010:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return r4
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            r2 = 0
            return r2
        L_0x0015:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p257f.C2838m2.m6623a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0080, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008a, code lost:
        r14 = r14.query(f7058a, null, null, new java.lang.String[]{r15}, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0098, code lost:
        if (r14 != null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009a, code lost:
        if (r14 == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009c, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a4, code lost:
        if (r14.moveToFirst() != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a6, code lost:
        m6626a(r1, r15, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ac, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r0 = r14.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b1, code lost:
        if (r0 == null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b7, code lost:
        if (r0.equals(null) == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b9, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ba, code lost:
        m6626a(r1, r15, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00bd, code lost:
        if (r0 == null) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00bf, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c0, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c3, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c4, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c5, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c8, code lost:
        throw r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return r3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m6624a(android.content.ContentResolver r14, java.lang.String r15) {
        /*
            java.lang.Class<q.b.a.b.g.f.m2> r0 = p213q.p217b.p218a.p231b.p251g.p257f.C2838m2.class
            monitor-enter(r0)
            m6625a(r14)     // Catch:{ all -> 0x00c9 }
            java.lang.Object r1 = f7068k     // Catch:{ all -> 0x00c9 }
            java.util.HashMap<java.lang.String, java.lang.String> r2 = f7063f     // Catch:{ all -> 0x00c9 }
            boolean r2 = r2.containsKey(r15)     // Catch:{ all -> 0x00c9 }
            r3 = 0
            if (r2 == 0) goto L_0x001e
            java.util.HashMap<java.lang.String, java.lang.String> r14 = f7063f     // Catch:{ all -> 0x00c9 }
            java.lang.Object r14 = r14.get(r15)     // Catch:{ all -> 0x00c9 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x00c9 }
            if (r14 == 0) goto L_0x001c
            r3 = r14
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x00c9 }
            return r3
        L_0x001e:
            java.lang.String[] r2 = f7070m     // Catch:{ all -> 0x00c9 }
            int r4 = r2.length     // Catch:{ all -> 0x00c9 }
            r5 = 0
            r6 = r5
        L_0x0023:
            r7 = 1
            if (r6 >= r4) goto L_0x0089
            r8 = r2[r6]     // Catch:{ all -> 0x00c9 }
            boolean r8 = r15.startsWith(r8)     // Catch:{ all -> 0x00c9 }
            if (r8 == 0) goto L_0x0086
            boolean r1 = f7069l     // Catch:{ all -> 0x00c9 }
            if (r1 == 0) goto L_0x003a
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f7063f     // Catch:{ all -> 0x00c9 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00c9 }
            if (r1 == 0) goto L_0x007f
        L_0x003a:
            java.lang.String[] r12 = f7070m     // Catch:{ all -> 0x00c9 }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f7063f     // Catch:{ all -> 0x00c9 }
            android.net.Uri r9 = f7059b     // Catch:{ all -> 0x00c9 }
            r10 = 0
            r11 = 0
            r13 = 0
            r8 = r14
            android.database.Cursor r14 = r8.query(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00c9 }
            java.util.TreeMap r2 = new java.util.TreeMap     // Catch:{ all -> 0x00c9 }
            r2.<init>()     // Catch:{ all -> 0x00c9 }
            if (r14 != 0) goto L_0x0050
            goto L_0x0065
        L_0x0050:
            boolean r4 = r14.moveToNext()     // Catch:{ all -> 0x0081 }
            if (r4 == 0) goto L_0x0062
            java.lang.String r4 = r14.getString(r5)     // Catch:{ all -> 0x0081 }
            java.lang.String r6 = r14.getString(r7)     // Catch:{ all -> 0x0081 }
            r2.put(r4, r6)     // Catch:{ all -> 0x0081 }
            goto L_0x0050
        L_0x0062:
            r14.close()     // Catch:{ all -> 0x00c9 }
        L_0x0065:
            r1.putAll(r2)     // Catch:{ all -> 0x00c9 }
            f7069l = r7     // Catch:{ all -> 0x00c9 }
            java.util.HashMap<java.lang.String, java.lang.String> r14 = f7063f     // Catch:{ all -> 0x00c9 }
            boolean r14 = r14.containsKey(r15)     // Catch:{ all -> 0x00c9 }
            if (r14 == 0) goto L_0x007f
            java.util.HashMap<java.lang.String, java.lang.String> r14 = f7063f     // Catch:{ all -> 0x00c9 }
            java.lang.Object r14 = r14.get(r15)     // Catch:{ all -> 0x00c9 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x00c9 }
            if (r14 == 0) goto L_0x007d
            r3 = r14
        L_0x007d:
            monitor-exit(r0)     // Catch:{ all -> 0x00c9 }
            return r3
        L_0x007f:
            monitor-exit(r0)     // Catch:{ all -> 0x00c9 }
            return r3
        L_0x0081:
            r15 = move-exception
            r14.close()     // Catch:{ all -> 0x00c9 }
            throw r15     // Catch:{ all -> 0x00c9 }
        L_0x0086:
            int r6 = r6 + 1
            goto L_0x0023
        L_0x0089:
            monitor-exit(r0)     // Catch:{ all -> 0x00c9 }
            android.net.Uri r9 = f7058a
            r10 = 0
            r11 = 0
            java.lang.String[] r12 = new java.lang.String[r7]
            r12[r5] = r15
            r13 = 0
            r8 = r14
            android.database.Cursor r14 = r8.query(r9, r10, r11, r12, r13)
            if (r14 != 0) goto L_0x00a0
            if (r14 == 0) goto L_0x009f
            r14.close()
        L_0x009f:
            return r3
        L_0x00a0:
            boolean r0 = r14.moveToFirst()     // Catch:{ all -> 0x00c4 }
            if (r0 != 0) goto L_0x00ad
            m6626a(r1, r15, r3)     // Catch:{ all -> 0x00c4 }
            r14.close()
            return r3
        L_0x00ad:
            java.lang.String r0 = r14.getString(r7)     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x00ba
            boolean r2 = r0.equals(r3)     // Catch:{ all -> 0x00c4 }
            if (r2 == 0) goto L_0x00ba
            r0 = r3
        L_0x00ba:
            m6626a(r1, r15, r0)     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x00c0
            r3 = r0
        L_0x00c0:
            r14.close()
            return r3
        L_0x00c4:
            r15 = move-exception
            r14.close()
            throw r15
        L_0x00c9:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c9 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p257f.C2838m2.m6624a(android.content.ContentResolver, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static void m6625a(ContentResolver contentResolver) {
        if (f7063f == null) {
            f7062e.set(false);
            f7063f = new HashMap<>();
            f7068k = new Object();
            f7069l = false;
            contentResolver.registerContentObserver(f7058a, true, new C2834l2());
            return;
        }
        if (f7062e.getAndSet(false)) {
            f7063f.clear();
            f7064g.clear();
            f7065h.clear();
            f7066i.clear();
            f7067j.clear();
            f7068k = new Object();
            f7069l = false;
        }
    }

    /* renamed from: a */
    public static void m6626a(Object obj, String str, String str2) {
        synchronized (C2838m2.class) {
            if (obj == f7068k) {
                f7063f.put(str, str2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m6627a(android.content.ContentResolver r6, java.lang.String r7) {
        /*
            java.lang.Object r0 = m6628b(r6)
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = f7064g
            r2 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r1 = m6623a(r1, r7, (T) r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x0018
            boolean r6 = r1.booleanValue()
            return r6
        L_0x0018:
            java.lang.String r6 = m6624a(r6, r7)
            r4 = 0
            if (r6 == 0) goto L_0x0067
            java.lang.String r5 = ""
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0028
            goto L_0x0067
        L_0x0028:
            java.util.regex.Pattern r5 = f7060c
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r5 = r5.matches()
            if (r5 == 0) goto L_0x0035
            goto L_0x0068
        L_0x0035:
            java.util.regex.Pattern r3 = f7061d
            java.util.regex.Matcher r3 = r3.matcher(r6)
            boolean r3 = r3.matches()
            if (r3 == 0) goto L_0x0047
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            r2 = r4
            goto L_0x0068
        L_0x0047:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "attempt to read gservices key "
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r4 = " (value \""
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = "\") as boolean"
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            java.lang.String r3 = "Gservices"
            android.util.Log.w(r3, r6)
        L_0x0067:
            r3 = r1
        L_0x0068:
            java.util.HashMap<java.lang.String, java.lang.Boolean> r6 = f7064g
            java.lang.Class<q.b.a.b.g.f.m2> r1 = p213q.p217b.p218a.p231b.p251g.p257f.C2838m2.class
            monitor-enter(r1)
            java.lang.Object r4 = f7068k     // Catch:{ all -> 0x007b }
            if (r0 != r4) goto L_0x0079
            r6.put(r7, r3)     // Catch:{ all -> 0x007b }
            java.util.HashMap<java.lang.String, java.lang.String> r6 = f7063f     // Catch:{ all -> 0x007b }
            r6.remove(r7)     // Catch:{ all -> 0x007b }
        L_0x0079:
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            return r2
        L_0x007b:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p257f.C2838m2.m6627a(android.content.ContentResolver, java.lang.String):boolean");
    }

    /* renamed from: b */
    public static Object m6628b(ContentResolver contentResolver) {
        Object obj;
        synchronized (C2838m2.class) {
            m6625a(contentResolver);
            obj = f7068k;
        }
        return obj;
    }
}
