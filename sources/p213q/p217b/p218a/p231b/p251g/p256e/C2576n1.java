package p213q.p217b.p218a.p231b.p251g.p256e;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p124p.p143e.C1248a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: q.b.a.b.g.e.n1 */
public final class C2576n1 implements C2646r1 {

    /* renamed from: g */
    public static final Map<Uri, C2576n1> f6732g = new C1248a();

    /* renamed from: h */
    public static final String[] f6733h = {"key", "value"};

    /* renamed from: a */
    public final ContentResolver f6734a;

    /* renamed from: b */
    public final Uri f6735b;

    /* renamed from: c */
    public final ContentObserver f6736c = new C2611p1(this);

    /* renamed from: d */
    public final Object f6737d = new Object();

    /* renamed from: e */
    public volatile Map<String, String> f6738e;

    /* renamed from: f */
    public final List<C2662s1> f6739f = new ArrayList();

    public C2576n1(ContentResolver contentResolver, Uri uri) {
        this.f6734a = contentResolver;
        this.f6735b = uri;
        contentResolver.registerContentObserver(uri, false, this.f6736c);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p213q.p217b.p218a.p231b.p251g.p256e.C2576n1 m6167a(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            java.lang.Class<q.b.a.b.g.e.n1> r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2576n1.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, q.b.a.b.g.e.n1> r1 = f6732g     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x001a }
            q.b.a.b.g.e.n1 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2576n1) r1     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            q.b.a.b.g.e.n1 r2 = new q.b.a.b.g.e.n1     // Catch:{ SecurityException -> 0x0018 }
            r2.<init>(r3, r4)     // Catch:{ SecurityException -> 0x0018 }
            java.util.Map<android.net.Uri, q.b.a.b.g.e.n1> r3 = f6732g     // Catch:{ SecurityException -> 0x0017 }
            r3.put(r4, r2)     // Catch:{ SecurityException -> 0x0017 }
        L_0x0017:
            r1 = r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r1
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2576n1.m6167a(android.content.ContentResolver, android.net.Uri):q.b.a.b.g.e.n1");
    }

    /* renamed from: c */
    public static synchronized void m6168c() {
        synchronized (C2576n1.class) {
            for (C2576n1 n1Var : f6732g.values()) {
                n1Var.f6734a.unregisterContentObserver(n1Var.f6736c);
            }
            f6732g.clear();
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo7817a(String str) {
        return (String) mo7878a().get(str);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Map<String, String> mo7878a() {
        Map<String, String> map;
        Map<String, String> map2 = this.f6738e;
        if (map2 == null) {
            synchronized (this.f6737d) {
                map2 = this.f6738e;
                if (map2 == null) {
                    ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) C2286e.m5185a((C2678t1<V>) new C2629q1<V>(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        try {
                            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                    this.f6738e = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    /* renamed from: b */
    public final void mo7879b() {
        synchronized (this.f6737d) {
            this.f6738e = null;
            C2758y1.f6981j.incrementAndGet();
        }
        synchronized (this) {
            for (C2662s1 a : this.f6739f) {
                a.mo7997a();
            }
        }
    }
}
