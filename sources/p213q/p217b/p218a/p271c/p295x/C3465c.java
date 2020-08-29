package p213q.p217b.p218a.p271c.p295x;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.C3294b;
import p213q.p217b.p218a.p271c.C3406l;

/* renamed from: q.b.a.c.x.c */
public final class C3465c {

    /* renamed from: a */
    public final C3464b f8826a;

    /* renamed from: b */
    public final C3464b f8827b;

    /* renamed from: c */
    public final C3464b f8828c;

    /* renamed from: d */
    public final C3464b f8829d;

    /* renamed from: e */
    public final C3464b f8830e;

    /* renamed from: f */
    public final C3464b f8831f;

    /* renamed from: g */
    public final C3464b f8832g;

    /* renamed from: h */
    public final Paint f8833h;

    public C3465c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C2286e.m5155a(context, C3294b.materialCalendarStyle, C3468f.class.getCanonicalName()), C3406l.MaterialCalendar);
        this.f8826a = C3464b.m7919a(context, obtainStyledAttributes.getResourceId(C3406l.MaterialCalendar_dayStyle, 0));
        this.f8832g = C3464b.m7919a(context, obtainStyledAttributes.getResourceId(C3406l.MaterialCalendar_dayInvalidStyle, 0));
        this.f8827b = C3464b.m7919a(context, obtainStyledAttributes.getResourceId(C3406l.MaterialCalendar_daySelectedStyle, 0));
        this.f8828c = C3464b.m7919a(context, obtainStyledAttributes.getResourceId(C3406l.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList a = C2286e.m5173a(context, obtainStyledAttributes, C3406l.MaterialCalendar_rangeFillColor);
        this.f8829d = C3464b.m7919a(context, obtainStyledAttributes.getResourceId(C3406l.MaterialCalendar_yearStyle, 0));
        this.f8830e = C3464b.m7919a(context, obtainStyledAttributes.getResourceId(C3406l.MaterialCalendar_yearSelectedStyle, 0));
        this.f8831f = C3464b.m7919a(context, obtainStyledAttributes.getResourceId(C3406l.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f8833h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
