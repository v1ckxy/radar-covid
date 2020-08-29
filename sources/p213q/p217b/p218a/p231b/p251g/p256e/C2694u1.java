package p213q.p217b.p218a.p231b.p251g.p256e;

import android.content.Context;
import android.database.ContentObserver;
import javax.annotation.Nullable;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.g.e.u1 */
public final class C2694u1 implements C2646r1 {

    /* renamed from: c */
    public static C2694u1 f6906c;
    @Nullable

    /* renamed from: a */
    public final Context f6907a;
    @Nullable

    /* renamed from: b */
    public final ContentObserver f6908b;

    public C2694u1() {
        this.f6907a = null;
        this.f6908b = null;
    }

    public C2694u1(Context context) {
        this.f6907a = context;
        this.f6908b = new C2727w1();
        context.getContentResolver().registerContentObserver(C2524k1.f6662a, true, this.f6908b);
    }

    /* renamed from: a */
    public static C2694u1 m6457a(Context context) {
        C2694u1 u1Var;
        synchronized (C2694u1.class) {
            if (f6906c == null) {
                f6906c = C1061o.m2433a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C2694u1(context) : new C2694u1();
            }
            u1Var = f6906c;
        }
        return u1Var;
    }

    /* renamed from: a */
    public static synchronized void m6458a() {
        synchronized (C2694u1.class) {
            if (!(f6906c == null || f6906c.f6907a == null || f6906c.f6908b == null)) {
                f6906c.f6907a.getContentResolver().unregisterContentObserver(f6906c.f6908b);
            }
            f6906c = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        android.os.Binder.restoreCallingIdentity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        r2 = "Unable to read GServices for: ";
        r5 = java.lang.String.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r5.length() != 0) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        r5 = r2.concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        r5 = new java.lang.String(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        android.util.Log.e("GservicesLoader", r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r2 = android.os.Binder.clearCallingIdentity();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2524k1.m6065a(r4.f6907a.getContentResolver(), r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0012 */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0010 A[ExcHandler: IllegalStateException | SecurityException (r0v5 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo7817a(java.lang.String r5) {
        /*
            r4 = this;
            android.content.Context r0 = r4.f6907a
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x0046
        L_0x0006:
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ SecurityException -> 0x0012, IllegalStateException -> 0x0010 }
            java.lang.String r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2524k1.m6065a(r0, r5)     // Catch:{ SecurityException -> 0x0012, IllegalStateException -> 0x0010 }
            r1 = r5
            goto L_0x0046
        L_0x0010:
            r0 = move-exception
            goto L_0x002b
        L_0x0012:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch:{ IllegalStateException -> 0x0010, SecurityException -> 0x002a }
            android.content.Context r0 = r4.f6907a     // Catch:{ all -> 0x0025 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x0025 }
            java.lang.String r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2524k1.m6065a(r0, r5)     // Catch:{ all -> 0x0025 }
            android.os.Binder.restoreCallingIdentity(r2)     // Catch:{ IllegalStateException -> 0x0010, SecurityException -> 0x002a }
            r1 = r0
            goto L_0x0046
        L_0x0025:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)     // Catch:{ IllegalStateException -> 0x0010, SecurityException -> 0x002a }
            throw r0     // Catch:{ IllegalStateException -> 0x0010, SecurityException -> 0x002a }
        L_0x002a:
            r0 = move-exception
        L_0x002b:
            java.lang.String r2 = "Unable to read GServices for: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r3 = r5.length()
            if (r3 == 0) goto L_0x003c
            java.lang.String r5 = r2.concat(r5)
            goto L_0x0041
        L_0x003c:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x0041:
            java.lang.String r2 = "GservicesLoader"
            android.util.Log.e(r2, r5, r0)
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p251g.p256e.C2694u1.mo7817a(java.lang.String):java.lang.Object");
    }
}
