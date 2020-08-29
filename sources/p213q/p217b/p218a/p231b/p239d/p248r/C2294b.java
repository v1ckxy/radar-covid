package p213q.p217b.p218a.p231b.p239d.p248r;

import android.content.Context;

/* renamed from: q.b.a.b.d.r.b */
public class C2294b {

    /* renamed from: b */
    public static C2294b f6271b = new C2294b();

    /* renamed from: a */
    public C2293a f6272a = null;

    /* renamed from: b */
    public static C2293a m5363b(Context context) {
        return f6271b.mo7311a(context);
    }

    /* renamed from: a */
    public final synchronized C2293a mo7311a(Context context) {
        if (this.f6272a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f6272a = new C2293a(context);
        }
        return this.f6272a;
    }
}
