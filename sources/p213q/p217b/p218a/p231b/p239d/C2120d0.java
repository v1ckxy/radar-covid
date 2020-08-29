package p213q.p217b.p218a.p231b.p239d;

import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import p213q.p217b.p218a.p231b.p239d.p246q.C2282a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2285d;

@CheckReturnValue
/* renamed from: q.b.a.b.d.d0 */
public class C2120d0 {

    /* renamed from: d */
    public static final C2120d0 f5988d = new C2120d0(true, null, null);

    /* renamed from: a */
    public final boolean f5989a;
    @Nullable

    /* renamed from: b */
    public final String f5990b;
    @Nullable

    /* renamed from: c */
    public final Throwable f5991c;

    public C2120d0(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.f5989a = z;
        this.f5990b = str;
        this.f5991c = th;
    }

    /* renamed from: a */
    public static String m4908a(String str, C2298v vVar, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{z2 ? "debug cert rejected" : "not whitelisted", str, C2285d.m5138a(C2282a.m5136a("SHA-1").digest(vVar.mo7316a())), Boolean.valueOf(z), "12451009.false"});
    }

    /* renamed from: a */
    public static C2120d0 m4909a(String str) {
        return new C2120d0(false, str, null);
    }

    /* renamed from: a */
    public static C2120d0 m4910a(Callable<String> callable) {
        return new C2125f0(callable, null);
    }

    @Nullable
    /* renamed from: a */
    public String mo7108a() {
        return this.f5990b;
    }
}
