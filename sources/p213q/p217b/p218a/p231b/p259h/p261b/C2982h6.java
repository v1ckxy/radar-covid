package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.Context;
import android.os.Bundle;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p251g.p256e.C2427f;

/* renamed from: q.b.a.b.h.b.h6 */
public final class C2982h6 {

    /* renamed from: a */
    public final Context f7378a;

    /* renamed from: b */
    public String f7379b;

    /* renamed from: c */
    public String f7380c;

    /* renamed from: d */
    public String f7381d;

    /* renamed from: e */
    public Boolean f7382e;

    /* renamed from: f */
    public long f7383f;

    /* renamed from: g */
    public C2427f f7384g;

    /* renamed from: h */
    public boolean f7385h = true;

    /* renamed from: i */
    public Long f7386i;

    public C2982h6(Context context, C2427f fVar, Long l) {
        C1061o.m2524b(context);
        Context applicationContext = context.getApplicationContext();
        C1061o.m2524b(applicationContext);
        this.f7378a = applicationContext;
        this.f7386i = l;
        if (fVar != null) {
            this.f7384g = fVar;
            this.f7379b = fVar.f6511j;
            this.f7380c = fVar.f6510i;
            this.f7381d = fVar.f6509h;
            this.f7385h = fVar.f6508g;
            this.f7383f = fVar.f6507f;
            Bundle bundle = fVar.f6512k;
            if (bundle != null) {
                this.f7382e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
