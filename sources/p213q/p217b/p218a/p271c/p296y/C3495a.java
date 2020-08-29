package p213q.p217b.p218a.p271c.p296y;

import android.content.Context;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.C3294b;

/* renamed from: q.b.a.c.y.a */
public class C3495a {

    /* renamed from: a */
    public final boolean f8896a;

    /* renamed from: b */
    public final int f8897b;

    /* renamed from: c */
    public final int f8898c;

    /* renamed from: d */
    public final float f8899d;

    public C3495a(Context context) {
        this.f8896a = C2286e.m5261a(context, C3294b.elevationOverlayEnabled, false);
        this.f8897b = C2286e.m5154a(context, C3294b.elevationOverlayColor, 0);
        this.f8898c = C2286e.m5154a(context, C3294b.colorSurface, 0);
        this.f8899d = context.getResources().getDisplayMetrics().density;
    }
}
