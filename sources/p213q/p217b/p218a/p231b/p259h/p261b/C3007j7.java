package p213q.p217b.p218a.p231b.p259h.p261b;

import java.net.URL;
import java.util.List;
import java.util.Map;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.j7 */
public final class C3007j7 implements Runnable {

    /* renamed from: e */
    public final URL f7454e;

    /* renamed from: f */
    public final C2957f5 f7455f;

    /* renamed from: g */
    public final String f7456g;

    /* renamed from: h */
    public final Map<String, String> f7457h = null;

    /* renamed from: i */
    public final /* synthetic */ C2983h7 f7458i;

    public C3007j7(C2983h7 h7Var, String str, URL url, C2957f5 f5Var) {
        this.f7458i = h7Var;
        C1061o.m2528b(str);
        C1061o.m2524b(url);
        C1061o.m2524b(f5Var);
        this.f7454e = url;
        this.f7455f = f5Var;
        this.f7456g = str;
    }

    /* renamed from: a */
    public final void mo8546a(int i, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        C3184z4 g = this.f7458i.mo8283g();
        C3031l7 l7Var = new C3031l7(this, i, exc, bArr, map);
        g.mo8846n();
        C1061o.m2524b(l7Var);
        g.mo8843a(new C2945e5<>(g, l7Var, "Task exception on worker thread"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            q.b.a.b.h.b.h7 r0 = r7.f7458i
            r0.mo8278b()
            r0 = 0
            r1 = 0
            q.b.a.b.h.b.h7 r2 = r7.f7458i     // Catch:{ IOException -> 0x0068, all -> 0x005c }
            java.net.URL r3 = r7.f7454e     // Catch:{ IOException -> 0x0068, all -> 0x005c }
            java.net.HttpURLConnection r2 = r2.mo8518a(r3)     // Catch:{ IOException -> 0x0068, all -> 0x005c }
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.f7457h     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            if (r3 == 0) goto L_0x0039
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.f7457h     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
        L_0x001d:
            boolean r4 = r3.hasNext()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r3.next()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            r2.addRequestProperty(r5, r4)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            goto L_0x001d
        L_0x0039:
            int r1 = r2.getResponseCode()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.util.Map r3 = r2.getHeaderFields()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            byte[] r4 = p213q.p217b.p218a.p231b.p259h.p261b.C2983h7.m6980a(r2)     // Catch:{ IOException -> 0x0051, all -> 0x004c }
            r2.disconnect()
            r7.mo8546a(r1, r0, r4, r3)
            return
        L_0x004c:
            r4 = move-exception
            r6 = r4
            r4 = r3
            r3 = r6
            goto L_0x005f
        L_0x0051:
            r4 = move-exception
            r6 = r4
            r4 = r3
            r3 = r6
            goto L_0x006b
        L_0x0056:
            r3 = move-exception
            r4 = r0
            goto L_0x005f
        L_0x0059:
            r3 = move-exception
            r4 = r0
            goto L_0x006b
        L_0x005c:
            r3 = move-exception
            r2 = r0
            r4 = r2
        L_0x005f:
            if (r2 == 0) goto L_0x0064
            r2.disconnect()
        L_0x0064:
            r7.mo8546a(r1, r0, r0, r4)
            throw r3
        L_0x0068:
            r3 = move-exception
            r2 = r0
            r4 = r2
        L_0x006b:
            if (r2 == 0) goto L_0x0070
            r2.disconnect()
        L_0x0070:
            r7.mo8546a(r1, r3, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3007j7.run():void");
    }
}
