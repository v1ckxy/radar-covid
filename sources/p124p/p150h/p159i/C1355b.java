package p124p.p150h.p159i;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p124p.p126b.p127k.C1061o;
import p124p.p143e.C1254f;
import p124p.p143e.C1261h;
import p124p.p150h.p152e.p153b.C1332g;
import p124p.p150h.p154f.C1338d;
import p124p.p150h.p159i.C1363c.C1366c;

/* renamed from: p.h.i.b */
public class C1355b {

    /* renamed from: a */
    public static final C1254f<String, Typeface> f4070a = new C1254f<>(16);

    /* renamed from: b */
    public static final C1363c f4071b = new C1363c("fonts", 10, 10000);

    /* renamed from: c */
    public static final Object f4072c = new Object();

    /* renamed from: d */
    public static final C1261h<String, ArrayList<C1366c<C1362g>>> f4073d = new C1261h<>();

    /* renamed from: e */
    public static final Comparator<byte[]> f4074e = new C1359d();

    /* renamed from: p.h.i.b$a */
    public class C1356a implements Callable<C1362g> {

        /* renamed from: e */
        public final /* synthetic */ Context f4075e;

        /* renamed from: f */
        public final /* synthetic */ C1354a f4076f;

        /* renamed from: g */
        public final /* synthetic */ int f4077g;

        /* renamed from: h */
        public final /* synthetic */ String f4078h;

        public C1356a(Context context, C1354a aVar, int i, String str) {
            this.f4075e = context;
            this.f4076f = aVar;
            this.f4077g = i;
            this.f4078h = str;
        }

        public Object call() {
            C1362g a = C1355b.m3442a(this.f4075e, this.f4076f, this.f4077g);
            Typeface typeface = a.f4089a;
            if (typeface != null) {
                C1355b.f4070a.mo5526a(this.f4078h, typeface);
            }
            return a;
        }
    }

    /* renamed from: p.h.i.b$b */
    public class C1357b implements C1366c<C1362g> {

        /* renamed from: a */
        public final /* synthetic */ C1332g f4079a;

        /* renamed from: b */
        public final /* synthetic */ Handler f4080b;

        public C1357b(C1332g gVar, Handler handler) {
            this.f4079a = gVar;
            this.f4080b = handler;
        }

        /* renamed from: a */
        public void mo5827a(Object obj) {
            C1332g gVar;
            int i;
            C1362g gVar2 = (C1362g) obj;
            if (gVar2 == null) {
                gVar = this.f4079a;
                i = 1;
            } else {
                i = gVar2.f4090b;
                if (i == 0) {
                    this.f4079a.mo5793a(gVar2.f4089a, this.f4080b);
                    return;
                }
                gVar = this.f4079a;
            }
            gVar.mo5792a(i, this.f4080b);
        }
    }

    /* renamed from: p.h.i.b$c */
    public class C1358c implements C1366c<C1362g> {

        /* renamed from: a */
        public final /* synthetic */ String f4081a;

        public C1358c(String str) {
            this.f4081a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r0 >= r1.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            ((p124p.p150h.p159i.C1363c.C1366c) r1.get(r0)).mo5827a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r0 = 0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo5827a(p124p.p150h.p159i.C1355b.C1362g r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p124p.p150h.p159i.C1355b.f4072c
                monitor-enter(r0)
                p.e.h<java.lang.String, java.util.ArrayList<p.h.i.c$c<p.h.i.b$g>>> r1 = p124p.p150h.p159i.C1355b.f4073d     // Catch:{ all -> 0x002d }
                java.lang.String r2 = r4.f4081a     // Catch:{ all -> 0x002d }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002d }
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x002d }
                if (r1 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                return
            L_0x0011:
                p.e.h<java.lang.String, java.util.ArrayList<p.h.i.c$c<p.h.i.b$g>>> r2 = p124p.p150h.p159i.C1355b.f4073d     // Catch:{ all -> 0x002d }
                java.lang.String r3 = r4.f4081a     // Catch:{ all -> 0x002d }
                r2.remove(r3)     // Catch:{ all -> 0x002d }
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                r0 = 0
            L_0x001a:
                int r2 = r1.size()
                if (r0 >= r2) goto L_0x002c
                java.lang.Object r2 = r1.get(r0)
                p.h.i.c$c r2 = (p124p.p150h.p159i.C1363c.C1366c) r2
                r2.mo5827a(r5)
                int r0 = r0 + 1
                goto L_0x001a
            L_0x002c:
                return
            L_0x002d:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p124p.p150h.p159i.C1355b.C1358c.mo5827a(p.h.i.b$g):void");
        }
    }

    /* renamed from: p.h.i.b$d */
    public class C1359d implements Comparator<byte[]> {
        public int compare(Object obj, Object obj2) {
            int i;
            int i2;
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            if (bArr.length != bArr2.length) {
                i2 = bArr.length;
                i = bArr2.length;
            } else {
                int i3 = 0;
                while (i3 < bArr.length) {
                    if (bArr[i3] != bArr2[i3]) {
                        i2 = bArr[i3];
                        i = bArr2[i3];
                    } else {
                        i3++;
                    }
                }
                return 0;
            }
            return i2 - i;
        }
    }

    /* renamed from: p.h.i.b$e */
    public static class C1360e {

        /* renamed from: a */
        public final int f4082a;

        /* renamed from: b */
        public final C1361f[] f4083b;

        public C1360e(int i, C1361f[] fVarArr) {
            this.f4082a = i;
            this.f4083b = fVarArr;
        }
    }

    /* renamed from: p.h.i.b$f */
    public static class C1361f {

        /* renamed from: a */
        public final Uri f4084a;

        /* renamed from: b */
        public final int f4085b;

        /* renamed from: c */
        public final int f4086c;

        /* renamed from: d */
        public final boolean f4087d;

        /* renamed from: e */
        public final int f4088e;

        public C1361f(Uri uri, int i, int i2, boolean z, int i3) {
            if (uri != null) {
                this.f4084a = uri;
                this.f4085b = i;
                this.f4086c = i2;
                this.f4087d = z;
                this.f4088e = i3;
                return;
            }
            throw null;
        }
    }

    /* renamed from: p.h.i.b$g */
    public static final class C1362g {

        /* renamed from: a */
        public final Typeface f4089a;

        /* renamed from: b */
        public final int f4090b;

        public C1362g(Typeface typeface, int i) {
            this.f4089a = typeface;
            this.f4090b = i;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.pm.ProviderInfo] */
    /* JADX WARNING: type inference failed for: r7v2, types: [p.h.i.b$f[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2, types: [android.content.pm.ProviderInfo] */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v2, types: [p.h.i.b$f[], android.database.Cursor]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [?[OBJECT, ARRAY], ?[int, boolean, OBJECT, ARRAY, byte, short, char], android.database.Cursor, p.h.i.b$f[]]
      mth insns count: 162
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
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p124p.p150h.p159i.C1355b.C1360e m3441a(android.content.Context r20, android.os.CancellationSignal r21, p124p.p150h.p159i.C1354a r22) {
        /*
            r0 = r22
            android.content.pm.PackageManager r1 = r20.getPackageManager()
            android.content.res.Resources r2 = r20.getResources()
            java.lang.String r3 = r0.f4064a
            r4 = 0
            android.content.pm.ProviderInfo r5 = r1.resolveContentProvider(r3, r4)
            if (r5 == 0) goto L_0x01b4
            java.lang.String r6 = r5.packageName
            java.lang.String r7 = r0.f4065b
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0193
            java.lang.String r3 = r5.packageName
            r6 = 64
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r3, r6)
            android.content.pm.Signature[] r1 = r1.signatures
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6 = r4
        L_0x002d:
            int r7 = r1.length
            if (r6 >= r7) goto L_0x003c
            r7 = r1[r6]
            byte[] r7 = r7.toByteArray()
            r3.add(r7)
            int r6 = r6 + 1
            goto L_0x002d
        L_0x003c:
            java.util.Comparator<byte[]> r1 = f4074e
            java.util.Collections.sort(r3, r1)
            java.util.List<java.util.List<byte[]>> r1 = r0.f4067d
            if (r1 == 0) goto L_0x0046
            goto L_0x004c
        L_0x0046:
            int r1 = r0.f4068e
            java.util.List r1 = p124p.p126b.p127k.C1061o.m2469a(r2, r1)
        L_0x004c:
            r2 = r4
        L_0x004d:
            int r6 = r1.size()
            r7 = 0
            r8 = 1
            if (r2 >= r6) goto L_0x0095
            java.util.ArrayList r6 = new java.util.ArrayList
            java.lang.Object r9 = r1.get(r2)
            java.util.Collection r9 = (java.util.Collection) r9
            r6.<init>(r9)
            java.util.Comparator<byte[]> r9 = f4074e
            java.util.Collections.sort(r6, r9)
            int r9 = r3.size()
            int r10 = r6.size()
            if (r9 == r10) goto L_0x0070
            goto L_0x0089
        L_0x0070:
            r9 = r4
        L_0x0071:
            int r10 = r3.size()
            if (r9 >= r10) goto L_0x008e
            java.lang.Object r10 = r3.get(r9)
            byte[] r10 = (byte[]) r10
            java.lang.Object r11 = r6.get(r9)
            byte[] r11 = (byte[]) r11
            boolean r10 = java.util.Arrays.equals(r10, r11)
            if (r10 != 0) goto L_0x008b
        L_0x0089:
            r6 = r4
            goto L_0x008f
        L_0x008b:
            int r9 = r9 + 1
            goto L_0x0071
        L_0x008e:
            r6 = r8
        L_0x008f:
            if (r6 == 0) goto L_0x0092
            goto L_0x0096
        L_0x0092:
            int r2 = r2 + 1
            goto L_0x004d
        L_0x0095:
            r5 = r7
        L_0x0096:
            if (r5 != 0) goto L_0x009e
            p.h.i.b$e r0 = new p.h.i.b$e
            r0.<init>(r8, r7)
            return r0
        L_0x009e:
            java.lang.String r1 = r5.authority
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.net.Uri$Builder r3 = new android.net.Uri$Builder
            r3.<init>()
            java.lang.String r5 = "content"
            android.net.Uri$Builder r3 = r3.scheme(r5)
            android.net.Uri$Builder r3 = r3.authority(r1)
            android.net.Uri r3 = r3.build()
            android.net.Uri$Builder r6 = new android.net.Uri$Builder
            r6.<init>()
            android.net.Uri$Builder r5 = r6.scheme(r5)
            android.net.Uri$Builder r1 = r5.authority(r1)
            java.lang.String r5 = "file"
            android.net.Uri$Builder r1 = r1.appendPath(r5)
            android.net.Uri r1 = r1.build()
            android.content.ContentResolver r9 = r20.getContentResolver()     // Catch:{ all -> 0x018c }
            java.lang.String r10 = "_id"
            java.lang.String r11 = "file_id"
            java.lang.String r12 = "font_ttc_index"
            java.lang.String r13 = "font_variation_settings"
            java.lang.String r14 = "font_weight"
            java.lang.String r15 = "font_italic"
            java.lang.String r16 = "result_code"
            java.lang.String[] r11 = new java.lang.String[]{r10, r11, r12, r13, r14, r15, r16}     // Catch:{ all -> 0x018c }
            java.lang.String r12 = "query = ?"
            java.lang.String[] r13 = new java.lang.String[r8]     // Catch:{ all -> 0x018c }
            java.lang.String r0 = r0.f4066c     // Catch:{ all -> 0x018c }
            r13[r4] = r0     // Catch:{ all -> 0x018c }
            r14 = 0
            r10 = r3
            r15 = r21
            android.database.Cursor r7 = r9.query(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x018c }
            if (r7 == 0) goto L_0x0179
            int r0 = r7.getCount()     // Catch:{ all -> 0x018c }
            if (r0 <= 0) goto L_0x0179
            java.lang.String r0 = "result_code"
            int r0 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x018c }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x018c }
            r2.<init>()     // Catch:{ all -> 0x018c }
            java.lang.String r5 = "_id"
            int r5 = r7.getColumnIndex(r5)     // Catch:{ all -> 0x018c }
            java.lang.String r6 = "file_id"
            int r6 = r7.getColumnIndex(r6)     // Catch:{ all -> 0x018c }
            java.lang.String r9 = "font_ttc_index"
            int r9 = r7.getColumnIndex(r9)     // Catch:{ all -> 0x018c }
            java.lang.String r10 = "font_weight"
            int r10 = r7.getColumnIndex(r10)     // Catch:{ all -> 0x018c }
            java.lang.String r11 = "font_italic"
            int r11 = r7.getColumnIndex(r11)     // Catch:{ all -> 0x018c }
        L_0x0126:
            boolean r12 = r7.moveToNext()     // Catch:{ all -> 0x018c }
            if (r12 == 0) goto L_0x0179
            r12 = -1
            if (r0 == r12) goto L_0x0136
            int r13 = r7.getInt(r0)     // Catch:{ all -> 0x018c }
            r19 = r13
            goto L_0x0138
        L_0x0136:
            r19 = r4
        L_0x0138:
            if (r9 == r12) goto L_0x0141
            int r13 = r7.getInt(r9)     // Catch:{ all -> 0x018c }
            r16 = r13
            goto L_0x0143
        L_0x0141:
            r16 = r4
        L_0x0143:
            if (r6 != r12) goto L_0x014e
            long r13 = r7.getLong(r5)     // Catch:{ all -> 0x018c }
            android.net.Uri r13 = android.content.ContentUris.withAppendedId(r3, r13)     // Catch:{ all -> 0x018c }
            goto L_0x0156
        L_0x014e:
            long r13 = r7.getLong(r6)     // Catch:{ all -> 0x018c }
            android.net.Uri r13 = android.content.ContentUris.withAppendedId(r1, r13)     // Catch:{ all -> 0x018c }
        L_0x0156:
            r15 = r13
            if (r10 == r12) goto L_0x015e
            int r13 = r7.getInt(r10)     // Catch:{ all -> 0x018c }
            goto L_0x0160
        L_0x015e:
            r13 = 400(0x190, float:5.6E-43)
        L_0x0160:
            r17 = r13
            if (r11 == r12) goto L_0x016d
            int r12 = r7.getInt(r11)     // Catch:{ all -> 0x018c }
            if (r12 != r8) goto L_0x016d
            r18 = r8
            goto L_0x016f
        L_0x016d:
            r18 = r4
        L_0x016f:
            p.h.i.b$f r12 = new p.h.i.b$f     // Catch:{ all -> 0x018c }
            r14 = r12
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x018c }
            r2.add(r12)     // Catch:{ all -> 0x018c }
            goto L_0x0126
        L_0x0179:
            if (r7 == 0) goto L_0x017e
            r7.close()
        L_0x017e:
            p.h.i.b$f[] r0 = new p124p.p150h.p159i.C1355b.C1361f[r4]
            java.lang.Object[] r0 = r2.toArray(r0)
            p.h.i.b$f[] r0 = (p124p.p150h.p159i.C1355b.C1361f[]) r0
            p.h.i.b$e r1 = new p.h.i.b$e
            r1.<init>(r4, r0)
            return r1
        L_0x018c:
            r0 = move-exception
            if (r7 == 0) goto L_0x0192
            r7.close()
        L_0x0192:
            throw r0
        L_0x0193:
            android.content.pm.PackageManager$NameNotFoundException r1 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Found content provider "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = ", but package was not "
            r2.append(r3)
            java.lang.String r0 = r0.f4065b
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x01b4:
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.String r1 = "No package found for authority: "
            java.lang.String r1 = p213q.p214a.p215a.p216a.C1965a.m4751a(r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p150h.p159i.C1355b.m3441a(android.content.Context, android.os.CancellationSignal, p.h.i.a):p.h.i.b$e");
    }

    /* renamed from: a */
    public static C1362g m3442a(Context context, C1354a aVar, int i) {
        try {
            C1360e a = m3441a(context, (CancellationSignal) null, aVar);
            int i2 = a.f4082a;
            int i3 = -3;
            if (i2 == 0) {
                Typeface a2 = C1338d.f4041a.mo5799a(context, (CancellationSignal) null, a.f4083b, i);
                if (a2 != null) {
                    i3 = 0;
                }
                return new C1362g(a2, i3);
            }
            if (i2 == 1) {
                i3 = -2;
            }
            return new C1362g(null, i3);
        } catch (NameNotFoundException unused) {
            return new C1362g(null, -1);
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Throwable, android.graphics.Typeface, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v4, types: [p.h.i.b$b] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.graphics.Typeface] */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.graphics.Typeface] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0070, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0081, code lost:
        r3 = f4071b;
        r4 = new p124p.p150h.p159i.C1355b.C1358c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0088, code lost:
        if (r3 == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008a, code lost:
        r3.mo5833b(new p124p.p150h.p159i.C1367d(r3, r1, new android.os.Handler(), r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0097, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
        throw r2;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v1, types: [java.lang.Throwable, android.graphics.Typeface, java.lang.Object]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [java.lang.Object, java.lang.Throwable, android.graphics.Typeface, ?[OBJECT, ARRAY]]
      mth insns count: 65
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
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m3439a(android.content.Context r2, p124p.p150h.p159i.C1354a r3, p124p.p150h.p152e.p153b.C1332g r4, android.os.Handler r5, boolean r6, int r7, int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.f4069f
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            p.e.f<java.lang.String, android.graphics.Typeface> r1 = f4070a
            java.lang.Object r1 = r1.mo5525a(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0026
            if (r4 == 0) goto L_0x0025
            r4.mo5338a(r1)
        L_0x0025:
            return r1
        L_0x0026:
            if (r6 == 0) goto L_0x0041
            r1 = -1
            if (r7 != r1) goto L_0x0041
            p.h.i.b$g r2 = m3442a(r2, r3, r8)
            if (r4 == 0) goto L_0x003e
            int r3 = r2.f4090b
            if (r3 != 0) goto L_0x003b
            android.graphics.Typeface r3 = r2.f4089a
            r4.mo5793a(r3, r5)
            goto L_0x003e
        L_0x003b:
            r4.mo5792a(r3, r5)
        L_0x003e:
            android.graphics.Typeface r2 = r2.f4089a
            return r2
        L_0x0041:
            p.h.i.b$a r1 = new p.h.i.b$a
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0054
            p.h.i.c r3 = f4071b     // Catch:{ InterruptedException -> 0x0053 }
            java.lang.Object r3 = r3.mo5830a(r1, r7)     // Catch:{ InterruptedException -> 0x0053 }
            p.h.i.b$g r3 = (p124p.p150h.p159i.C1355b.C1362g) r3     // Catch:{ InterruptedException -> 0x0053 }
            android.graphics.Typeface r2 = r3.f4089a     // Catch:{ InterruptedException -> 0x0053 }
        L_0x0053:
            return r2
        L_0x0054:
            if (r4 != 0) goto L_0x0058
            r3 = r2
            goto L_0x005d
        L_0x0058:
            p.h.i.b$b r3 = new p.h.i.b$b
            r3.<init>(r4, r5)
        L_0x005d:
            java.lang.Object r4 = f4072c
            monitor-enter(r4)
            p.e.h<java.lang.String, java.util.ArrayList<p.h.i.c$c<p.h.i.b$g>>> r5 = f4073d     // Catch:{ all -> 0x0099 }
            java.lang.Object r5 = r5.getOrDefault(r0, r2)     // Catch:{ all -> 0x0099 }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x0099 }
            if (r5 == 0) goto L_0x0071
            if (r3 == 0) goto L_0x006f
            r5.add(r3)     // Catch:{ all -> 0x0099 }
        L_0x006f:
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            return r2
        L_0x0071:
            if (r3 == 0) goto L_0x0080
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0099 }
            r5.<init>()     // Catch:{ all -> 0x0099 }
            r5.add(r3)     // Catch:{ all -> 0x0099 }
            p.e.h<java.lang.String, java.util.ArrayList<p.h.i.c$c<p.h.i.b$g>>> r3 = f4073d     // Catch:{ all -> 0x0099 }
            r3.put(r0, r5)     // Catch:{ all -> 0x0099 }
        L_0x0080:
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            p.h.i.c r3 = f4071b
            p.h.i.b$c r4 = new p.h.i.b$c
            r4.<init>(r0)
            if (r3 == 0) goto L_0x0098
            android.os.Handler r5 = new android.os.Handler
            r5.<init>()
            p.h.i.d r6 = new p.h.i.d
            r6.<init>(r3, r1, r5, r4)
            r3.mo5833b(r6)
            return r2
        L_0x0098:
            throw r2
        L_0x0099:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p150h.p159i.C1355b.m3439a(android.content.Context, p.h.i.a, p.h.e.b.g, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m3440a(Context context, C1361f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C1361f fVar : fVarArr) {
            if (fVar.f4088e == 0) {
                Uri uri = fVar.f4084a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, C1061o.m2468a(context, cancellationSignal, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
