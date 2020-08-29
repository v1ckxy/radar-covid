package p213q.p217b.p218a.p219a.p220e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.TimeZone;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p219a.p220e.p221b.C1972b;
import p213q.p217b.p218a.p219a.p220e.p221b.C1987j;
import p213q.p217b.p218a.p219a.p220e.p221b.C1994o.C1995a;
import p213q.p217b.p218a.p219a.p220e.p221b.C1994o.C1996b;
import p213q.p217b.p218a.p219a.p222f.C2013f;
import p213q.p217b.p218a.p219a.p222f.C2013f.C2014a;
import p213q.p217b.p218a.p219a.p222f.p223p.C2041m;
import p213q.p217b.p218a.p219a.p222f.p229t.C2099a;
import p213q.p217b.p317d.p342i.C4190a;
import p213q.p217b.p317d.p342i.p344i.C4202d;
import p213q.p217b.p317d.p342i.p344i.C4203e;

/* renamed from: q.b.a.a.e.e */
public final class C2000e implements C2041m {

    /* renamed from: a */
    public final C4190a f5738a;

    /* renamed from: b */
    public final ConnectivityManager f5739b;

    /* renamed from: c */
    public final URL f5740c;

    /* renamed from: d */
    public final C2099a f5741d;

    /* renamed from: e */
    public final C2099a f5742e;

    /* renamed from: f */
    public final int f5743f;

    /* renamed from: q.b.a.a.e.e$a */
    public static final class C2001a {

        /* renamed from: a */
        public final URL f5744a;

        /* renamed from: b */
        public final C1987j f5745b;

        /* renamed from: c */
        public final String f5746c;

        public C2001a(URL url, C1987j jVar, String str) {
            this.f5744a = url;
            this.f5745b = jVar;
            this.f5746c = str;
        }
    }

    /* renamed from: q.b.a.a.e.e$b */
    public static final class C2002b {

        /* renamed from: a */
        public final int f5747a;

        /* renamed from: b */
        public final URL f5748b;

        /* renamed from: c */
        public final long f5749c;

        public C2002b(int i, URL url, long j) {
            this.f5747a = i;
            this.f5748b = url;
            this.f5749c = j;
        }
    }

    public C2000e(Context context, C2099a aVar, C2099a aVar2) {
        C4203e eVar = new C4203e();
        ((C1972b) C1972b.f5641a).mo6968a(eVar);
        this.f5738a = new C4202d(eVar);
        this.f5739b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f5740c = m4777a(C1970a.f5635c);
        this.f5741d = aVar2;
        this.f5742e = aVar;
        this.f5743f = 40000;
    }

    /* renamed from: a */
    public static URL m4777a(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(C1965a.m4751a("Invalid url: ", str), e);
        }
    }

    /* renamed from: a */
    public C2013f mo6992a(C2013f fVar) {
        int i;
        int i2;
        C1995a aVar;
        NetworkInfo activeNetworkInfo = this.f5739b.getActiveNetworkInfo();
        C2014a a = fVar.mo7012a();
        String str = "sdk-version";
        a.mo7001b().put(str, String.valueOf(VERSION.SDK_INT));
        a.mo7001b().put("model", Build.MODEL);
        a.mo7001b().put("hardware", Build.HARDWARE);
        a.mo7001b().put("device", Build.DEVICE);
        a.mo7001b().put("product", Build.PRODUCT);
        a.mo7001b().put("os-uild", Build.ID);
        a.mo7001b().put("manufacturer", Build.MANUFACTURER);
        a.mo7001b().put("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        String str2 = "tz-offset";
        a.mo7001b().put(str2, String.valueOf((long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000)));
        if (activeNetworkInfo == null) {
            i = C1996b.NONE.f5728e;
        } else {
            i = activeNetworkInfo.getType();
        }
        a.mo7001b().put("net-type", String.valueOf(i));
        if (activeNetworkInfo == null) {
            aVar = C1995a.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            i2 = activeNetworkInfo.getSubtype();
            if (i2 == -1) {
                aVar = C1995a.COMBINED;
            } else {
                if (((C1995a) C1995a.f5685A.get(i2)) == null) {
                    i2 = 0;
                }
                a.mo7001b().put("mobile-subtype", String.valueOf(i2));
                return a.mo7000a();
            }
        }
        i2 = aVar.f5707e;
        a.mo7001b().put("mobile-subtype", String.valueOf(i2));
        return a.mo7000a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x020c, code lost:
        r18 = r0;
        r20 = r2;
        r19 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0212, code lost:
        if (r8 != null) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0214, code lost:
        r11 = " requestTimeMs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0217, code lost:
        r11 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0219, code lost:
        if (r9 != null) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x021b, code lost:
        r11 = p213q.p214a.p215a.p216a.C1965a.m4751a(r11, " requestUptimeMs");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0225, code lost:
        if (r11.isEmpty() == false) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x024c, code lost:
        throw new java.lang.IllegalStateException(p213q.p214a.p215a.p216a.C1965a.m4751a(r10, r11));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p213q.p217b.p218a.p219a.p222f.p223p.C2033g mo6993a(p213q.p217b.p218a.p219a.p222f.p223p.C2032f r33) {
        /*
            r32 = this;
            r1 = r32
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2 = r33
            q.b.a.a.f.p.a r2 = (p213q.p217b.p218a.p219a.p222f.p223p.C2026a) r2
            java.lang.Iterable<q.b.a.a.f.f> r3 = r2.f5803a
            java.util.Iterator r3 = r3.iterator()
        L_0x0011:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x003e
            java.lang.Object r4 = r3.next()
            q.b.a.a.f.f r4 = (p213q.p217b.p218a.p219a.p222f.C2013f) r4
            r5 = r4
            q.b.a.a.f.a r5 = (p213q.p217b.p218a.p219a.p222f.C2003a) r5
            java.lang.String r5 = r5.f5750a
            boolean r6 = r0.containsKey(r5)
            if (r6 != 0) goto L_0x0034
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.add(r4)
            r0.put(r5, r6)
            goto L_0x0011
        L_0x0034:
            java.lang.Object r5 = r0.get(r5)
            java.util.List r5 = (java.util.List) r5
            r5.add(r4)
            goto L_0x0011
        L_0x003e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x004b:
            boolean r4 = r0.hasNext()
            java.lang.String r5 = "CctTransportBackend"
            r6 = 0
            if (r4 == 0) goto L_0x024d
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r7 = r4.getValue()
            java.util.List r7 = (java.util.List) r7
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            q.b.a.a.f.f r7 = (p213q.p217b.p218a.p219a.p222f.C2013f) r7
            q.b.a.a.e.b.p r17 = p213q.p217b.p218a.p219a.p220e.p221b.C1997p.DEFAULT
            q.b.a.a.f.t.a r8 = r1.f5742e
            long r8 = r8.mo7076a()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            q.b.a.a.f.t.a r9 = r1.f5741d
            long r9 = r9.mo7076a()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            q.b.a.a.e.b.k$a r10 = p213q.p217b.p218a.p219a.p220e.p221b.C1988k.C1989a.ANDROID_FIREBASE
            java.lang.String r11 = "sdk-version"
            int r11 = r7.mo7013b(r11)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r11)
            java.lang.String r11 = "model"
            java.lang.String r20 = r7.mo7011a(r11)
            java.lang.String r11 = "hardware"
            java.lang.String r21 = r7.mo7011a(r11)
            java.lang.String r11 = "device"
            java.lang.String r22 = r7.mo7011a(r11)
            java.lang.String r11 = "product"
            java.lang.String r23 = r7.mo7011a(r11)
            java.lang.String r11 = "os-uild"
            java.lang.String r24 = r7.mo7011a(r11)
            java.lang.String r11 = "manufacturer"
            java.lang.String r25 = r7.mo7011a(r11)
            java.lang.String r11 = "fingerprint"
            java.lang.String r26 = r7.mo7011a(r11)
            q.b.a.a.e.b.c r7 = new q.b.a.a.e.b.c
            r18 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            q.b.a.a.e.b.e r13 = new q.b.a.a.e.b.e
            r13.<init>(r10, r7)
            java.lang.Object r7 = r4.getKey()     // Catch:{ NumberFormatException -> 0x00d0 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x00d0 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x00d0 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ NumberFormatException -> 0x00d0 }
            r15 = r6
            r14 = r7
            goto L_0x00d8
        L_0x00d0:
            java.lang.Object r7 = r4.getKey()
            java.lang.String r7 = (java.lang.String) r7
            r14 = r6
            r15 = r7
        L_0x00d8:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x00e7:
            boolean r7 = r4.hasNext()
            java.lang.String r10 = "Missing required properties:"
            java.lang.String r11 = ""
            if (r7 == 0) goto L_0x020c
            java.lang.Object r7 = r4.next()
            q.b.a.a.f.f r7 = (p213q.p217b.p218a.p219a.p222f.C2013f) r7
            r12 = r7
            q.b.a.a.f.a r12 = (p213q.p217b.p218a.p219a.p222f.C2003a) r12
            r18 = r0
            q.b.a.a.f.e r0 = r12.f5752c
            r16 = r4
            q.b.a.a.a r4 = r0.f5780a
            r19 = r11
            q.b.a.a.a r11 = new q.b.a.a.a
            r20 = r2
            java.lang.String r2 = "proto"
            r11.<init>(r2)
            boolean r2 = r4.equals(r11)
            if (r2 == 0) goto L_0x011d
            byte[] r0 = r0.f5781b
            q.b.a.a.e.b.f$a r2 = new q.b.a.a.e.b.f$a
            r2.<init>()
            r2.f5669d = r0
            goto L_0x013f
        L_0x011d:
            q.b.a.a.a r2 = new q.b.a.a.a
            java.lang.String r11 = "json"
            r2.<init>(r11)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x01ef
            java.lang.String r2 = new java.lang.String
            byte[] r0 = r0.f5781b
            java.lang.String r4 = "UTF-8"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r2.<init>(r0, r4)
            q.b.a.a.e.b.f$a r0 = new q.b.a.a.e.b.f$a
            r0.<init>()
            r0.f5670e = r2
            r2 = r0
        L_0x013f:
            long r0 = r12.f5753d
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.f5666a = r0
            long r0 = r12.f5754e
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.f5668c = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r12.f5755f
            java.lang.String r1 = "tz-offset"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x015e
            r0 = 0
            goto L_0x0166
        L_0x015e:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = r0.longValue()
        L_0x0166:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.f5671f = r0
            java.lang.String r0 = "net-type"
            int r0 = r7.mo7013b(r0)
            android.util.SparseArray<q.b.a.a.e.b.o$b> r1 = p213q.p217b.p218a.p219a.p220e.p221b.C1994o.C1996b.f5727y
            java.lang.Object r0 = r1.get(r0)
            q.b.a.a.e.b.o$b r0 = (p213q.p217b.p218a.p219a.p220e.p221b.C1994o.C1996b) r0
            java.lang.String r1 = "mobile-subtype"
            int r1 = r7.mo7013b(r1)
            android.util.SparseArray<q.b.a.a.e.b.o$a> r4 = p213q.p217b.p218a.p219a.p220e.p221b.C1994o.C1995a.f5685A
            java.lang.Object r1 = r4.get(r1)
            q.b.a.a.e.b.o$a r1 = (p213q.p217b.p218a.p219a.p220e.p221b.C1994o.C1995a) r1
            q.b.a.a.e.b.i r4 = new q.b.a.a.e.b.i
            r4.<init>(r0, r1)
            r2.f5672g = r4
            java.lang.Integer r0 = r12.f5751b
            if (r0 == 0) goto L_0x0195
            r2.f5667b = r0
        L_0x0195:
            java.lang.Long r0 = r2.f5666a
            if (r0 != 0) goto L_0x019c
            java.lang.String r11 = " eventTimeMs"
            goto L_0x019e
        L_0x019c:
            r11 = r19
        L_0x019e:
            java.lang.Long r0 = r2.f5668c
            if (r0 != 0) goto L_0x01a8
            java.lang.String r0 = " eventUptimeMs"
            java.lang.String r11 = p213q.p214a.p215a.p216a.C1965a.m4751a(r11, r0)
        L_0x01a8:
            java.lang.Long r0 = r2.f5671f
            if (r0 != 0) goto L_0x01b2
            java.lang.String r0 = " timezoneOffsetSeconds"
            java.lang.String r11 = p213q.p214a.p215a.p216a.C1965a.m4751a(r11, r0)
        L_0x01b2:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x01e5
            q.b.a.a.e.b.f r0 = new q.b.a.a.e.b.f
            java.lang.Long r1 = r2.f5666a
            long r22 = r1.longValue()
            java.lang.Integer r1 = r2.f5667b
            java.lang.Long r4 = r2.f5668c
            long r25 = r4.longValue()
            byte[] r4 = r2.f5669d
            java.lang.String r7 = r2.f5670e
            java.lang.Long r10 = r2.f5671f
            long r29 = r10.longValue()
            q.b.a.a.e.b.o r2 = r2.f5672g
            r21 = r0
            r24 = r1
            r27 = r4
            r28 = r7
            r31 = r2
            r21.<init>(r22, r24, r25, r27, r28, r29, r31)
            r6.add(r0)
            goto L_0x0202
        L_0x01e5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4751a(r10, r11)
            r0.<init>(r1)
            throw r0
        L_0x01ef:
            java.lang.String r0 = p124p.p126b.p127k.C1061o.m2556f(r5)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r2 = "Received event of unsupported encoding %s. Skipping..."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            android.util.Log.w(r0, r1)
        L_0x0202:
            r1 = r32
            r4 = r16
            r0 = r18
            r2 = r20
            goto L_0x00e7
        L_0x020c:
            r18 = r0
            r20 = r2
            r19 = r11
            if (r8 != 0) goto L_0x0217
            java.lang.String r11 = " requestTimeMs"
            goto L_0x0219
        L_0x0217:
            r11 = r19
        L_0x0219:
            if (r9 != 0) goto L_0x0221
            java.lang.String r0 = " requestUptimeMs"
            java.lang.String r11 = p213q.p214a.p215a.p216a.C1965a.m4751a(r11, r0)
        L_0x0221:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0243
            q.b.a.a.e.b.g r0 = new q.b.a.a.e.b.g
            long r1 = r8.longValue()
            long r11 = r9.longValue()
            r8 = r0
            r9 = r1
            r16 = r6
            r8.<init>(r9, r11, r13, r14, r15, r16, r17)
            r3.add(r0)
            r1 = r32
            r0 = r18
            r2 = r20
            goto L_0x004b
        L_0x0243:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4751a(r10, r11)
            r0.<init>(r1)
            throw r0
        L_0x024d:
            r20 = r2
            q.b.a.a.e.b.d r0 = new q.b.a.a.e.b.d
            r0.<init>(r3)
            r1 = r32
            java.net.URL r2 = r1.f5740c
            r3 = r20
            byte[] r3 = r3.f5804b
            if (r3 == 0) goto L_0x027e
            r3 = r33
            q.b.a.a.f.p.a r3 = (p213q.p217b.p218a.p219a.p222f.p223p.C2026a) r3     // Catch:{ IllegalArgumentException -> 0x0279 }
            byte[] r3 = r3.f5804b     // Catch:{ IllegalArgumentException -> 0x0279 }
            q.b.a.a.e.a r3 = p213q.p217b.p218a.p219a.p220e.C1970a.m4764a(r3)     // Catch:{ IllegalArgumentException -> 0x0279 }
            java.lang.String r4 = r3.f5640b     // Catch:{ IllegalArgumentException -> 0x0279 }
            if (r4 == 0) goto L_0x026e
            java.lang.String r6 = r3.f5640b     // Catch:{ IllegalArgumentException -> 0x0279 }
        L_0x026e:
            java.lang.String r4 = r3.f5639a     // Catch:{ IllegalArgumentException -> 0x0279 }
            if (r4 == 0) goto L_0x027e
            java.lang.String r2 = r3.f5639a     // Catch:{ IllegalArgumentException -> 0x0279 }
            java.net.URL r2 = m4777a(r2)     // Catch:{ IllegalArgumentException -> 0x0279 }
            goto L_0x027e
        L_0x0279:
            q.b.a.a.f.p.g r0 = p213q.p217b.p218a.p219a.p222f.p223p.C2033g.m4809a()
            return r0
        L_0x027e:
            r3 = 5
            r7 = -1
            q.b.a.a.e.e$a r4 = new q.b.a.a.e.e$a     // Catch:{ IOException -> 0x02bb }
            r4.<init>(r2, r0, r6)     // Catch:{ IOException -> 0x02bb }
            q.b.a.a.e.c r0 = new q.b.a.a.e.c     // Catch:{ IOException -> 0x02bb }
            r0.<init>(r1)     // Catch:{ IOException -> 0x02bb }
            q.b.a.a.e.d r2 = p213q.p217b.p218a.p219a.p220e.C1999d.f5737a     // Catch:{ IOException -> 0x02bb }
            java.lang.Object r0 = p124p.p126b.p127k.C1061o.m2463a(r3, r4, r0, r2)     // Catch:{ IOException -> 0x02bb }
            q.b.a.a.e.e$b r0 = (p213q.p217b.p218a.p219a.p220e.C2000e.C2002b) r0     // Catch:{ IOException -> 0x02bb }
            int r2 = r0.f5747a     // Catch:{ IOException -> 0x02bb }
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L_0x02a3
            long r2 = r0.f5749c     // Catch:{ IOException -> 0x02bb }
            q.b.a.a.f.p.b r0 = new q.b.a.a.f.p.b     // Catch:{ IOException -> 0x02bb }
            q.b.a.a.f.p.g$a r4 = p213q.p217b.p218a.p219a.p222f.p223p.C2033g.C2034a.OK     // Catch:{ IOException -> 0x02bb }
            r0.<init>(r4, r2)     // Catch:{ IOException -> 0x02bb }
            return r0
        L_0x02a3:
            int r0 = r0.f5747a     // Catch:{ IOException -> 0x02bb }
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r2) goto L_0x02b3
            r2 = 404(0x194, float:5.66E-43)
            if (r0 != r2) goto L_0x02ae
            goto L_0x02b3
        L_0x02ae:
            q.b.a.a.f.p.g r0 = p213q.p217b.p218a.p219a.p222f.p223p.C2033g.m4809a()     // Catch:{ IOException -> 0x02bb }
            return r0
        L_0x02b3:
            q.b.a.a.f.p.b r0 = new q.b.a.a.f.p.b     // Catch:{ IOException -> 0x02bb }
            q.b.a.a.f.p.g$a r2 = p213q.p217b.p218a.p219a.p222f.p223p.C2033g.C2034a.TRANSIENT_ERROR     // Catch:{ IOException -> 0x02bb }
            r0.<init>(r2, r7)     // Catch:{ IOException -> 0x02bb }
            return r0
        L_0x02bb:
            r0 = move-exception
            java.lang.String r2 = "Could not make request to the backend"
            p124p.p126b.p127k.C1061o.m2500a(r5, r2, r0)
            q.b.a.a.f.p.b r0 = new q.b.a.a.f.p.b
            q.b.a.a.f.p.g$a r2 = p213q.p217b.p218a.p219a.p222f.p223p.C2033g.C2034a.TRANSIENT_ERROR
            r0.<init>(r2, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p219a.p220e.C2000e.mo6993a(q.b.a.a.f.p.f):q.b.a.a.f.p.g");
    }
}
