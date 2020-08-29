package p213q.p217b.p218a.p271c.p295x;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import p124p.p126b.p127k.C1061o;
import p124p.p150h.p162l.C1404o;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.C3406l;
import p213q.p217b.p218a.p271c.p278g0.C3331a;
import p213q.p217b.p218a.p271c.p278g0.C3333c;
import p213q.p217b.p218a.p271c.p278g0.C3337g;
import p213q.p217b.p218a.p271c.p278g0.C3342j;

/* renamed from: q.b.a.c.x.b */
public final class C3464b {

    /* renamed from: a */
    public final Rect f8820a;

    /* renamed from: b */
    public final ColorStateList f8821b;

    /* renamed from: c */
    public final ColorStateList f8822c;

    /* renamed from: d */
    public final ColorStateList f8823d;

    /* renamed from: e */
    public final int f8824e;

    /* renamed from: f */
    public final C3342j f8825f;

    public C3464b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C3342j jVar, Rect rect) {
        C1061o.m2431a(rect.left);
        C1061o.m2431a(rect.top);
        C1061o.m2431a(rect.right);
        C1061o.m2431a(rect.bottom);
        this.f8820a = rect;
        this.f8821b = colorStateList2;
        this.f8822c = colorStateList;
        this.f8823d = colorStateList3;
        this.f8824e = i;
        this.f8825f = jVar;
    }

    /* renamed from: a */
    public static C3464b m7919a(Context context, int i) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C3406l.MaterialCalendarItem);
            Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C3406l.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(C3406l.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(C3406l.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(C3406l.MaterialCalendarItem_android_insetBottom, 0));
            ColorStateList a = C2286e.m5173a(context, obtainStyledAttributes, C3406l.MaterialCalendarItem_itemFillColor);
            ColorStateList a2 = C2286e.m5173a(context, obtainStyledAttributes, C3406l.MaterialCalendarItem_itemTextColor);
            ColorStateList a3 = C2286e.m5173a(context, obtainStyledAttributes, C3406l.MaterialCalendarItem_itemStrokeColor);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C3406l.MaterialCalendarItem_itemStrokeWidth, 0);
            C3342j a4 = C3342j.m7743a(context, obtainStyledAttributes.getResourceId(C3406l.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(C3406l.MaterialCalendarItem_itemShapeAppearanceOverlay, 0), (C3333c) new C3331a((float) 0)).mo9102a();
            obtainStyledAttributes.recycle();
            C3464b bVar = new C3464b(a, a2, a3, dimensionPixelSize, a4, rect);
            return bVar;
        }
        throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
    }

    /* renamed from: a */
    public void mo9412a(TextView textView) {
        C3337g gVar = new C3337g();
        C3337g gVar2 = new C3337g();
        gVar.setShapeAppearanceModel(this.f8825f);
        gVar2.setShapeAppearanceModel(this.f8825f);
        gVar.mo9063a(this.f8822c);
        gVar.mo9061a((float) this.f8824e, this.f8823d);
        textView.setTextColor(this.f8821b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f8821b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f8820a;
        InsetDrawable insetDrawable = new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        C1404o.m3522a((View) textView, (Drawable) insetDrawable);
    }
}
