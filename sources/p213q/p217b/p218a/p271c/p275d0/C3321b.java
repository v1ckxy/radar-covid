package p213q.p217b.p218a.p271c.p275d0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import p124p.p126b.p127k.C1061o;
import p124p.p150h.p152e.p153b.C1332g;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.C3406l;

/* renamed from: q.b.a.c.d0.b */
public class C3321b {

    /* renamed from: a */
    public final float f8318a;

    /* renamed from: b */
    public final ColorStateList f8319b;

    /* renamed from: c */
    public final int f8320c;

    /* renamed from: d */
    public final int f8321d;

    /* renamed from: e */
    public final String f8322e;

    /* renamed from: f */
    public final ColorStateList f8323f;

    /* renamed from: g */
    public final float f8324g;

    /* renamed from: h */
    public final float f8325h;

    /* renamed from: i */
    public final float f8326i;

    /* renamed from: j */
    public final int f8327j;

    /* renamed from: k */
    public boolean f8328k = false;

    /* renamed from: l */
    public Typeface f8329l;

    /* renamed from: q.b.a.c.d0.b$a */
    public class C3322a extends C1332g {

        /* renamed from: a */
        public final /* synthetic */ C3324d f8330a;

        public C3322a(C3324d dVar) {
            this.f8330a = dVar;
        }

        /* renamed from: a */
        public void mo5337a(int i) {
            C3321b.this.f8328k = true;
            this.f8330a.mo1990a(i);
        }

        /* renamed from: a */
        public void mo5338a(Typeface typeface) {
            C3321b bVar = C3321b.this;
            bVar.f8329l = Typeface.create(typeface, bVar.f8320c);
            C3321b bVar2 = C3321b.this;
            bVar2.f8328k = true;
            this.f8330a.mo1991a(bVar2.f8329l, false);
        }
    }

    public C3321b(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C3406l.TextAppearance);
        this.f8318a = obtainStyledAttributes.getDimension(C3406l.TextAppearance_android_textSize, 0.0f);
        this.f8319b = C2286e.m5173a(context, obtainStyledAttributes, C3406l.TextAppearance_android_textColor);
        C2286e.m5173a(context, obtainStyledAttributes, C3406l.TextAppearance_android_textColorHint);
        C2286e.m5173a(context, obtainStyledAttributes, C3406l.TextAppearance_android_textColorLink);
        this.f8320c = obtainStyledAttributes.getInt(C3406l.TextAppearance_android_textStyle, 0);
        this.f8321d = obtainStyledAttributes.getInt(C3406l.TextAppearance_android_typeface, 1);
        int i2 = C3406l.TextAppearance_fontFamily;
        int i3 = C3406l.TextAppearance_android_fontFamily;
        if (!obtainStyledAttributes.hasValue(i2)) {
            i2 = i3;
        }
        this.f8327j = obtainStyledAttributes.getResourceId(i2, 0);
        this.f8322e = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(C3406l.TextAppearance_textAllCaps, false);
        this.f8323f = C2286e.m5173a(context, obtainStyledAttributes, C3406l.TextAppearance_android_shadowColor);
        this.f8324g = obtainStyledAttributes.getFloat(C3406l.TextAppearance_android_shadowDx, 0.0f);
        this.f8325h = obtainStyledAttributes.getFloat(C3406l.TextAppearance_android_shadowDy, 0.0f);
        this.f8326i = obtainStyledAttributes.getFloat(C3406l.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo9045a() {
        if (this.f8329l == null) {
            String str = this.f8322e;
            if (str != null) {
                this.f8329l = Typeface.create(str, this.f8320c);
            }
        }
        if (this.f8329l == null) {
            int i = this.f8321d;
            Typeface typeface = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f8329l = typeface;
            this.f8329l = Typeface.create(this.f8329l, this.f8320c);
        }
    }

    /* renamed from: a */
    public void mo9047a(Context context, C3324d dVar) {
        mo9045a();
        if (this.f8327j == 0) {
            this.f8328k = true;
        }
        if (this.f8328k) {
            dVar.mo1991a(this.f8329l, true);
            return;
        }
        try {
            int i = this.f8327j;
            C3322a aVar = new C3322a(dVar);
            if (context.isRestricted()) {
                aVar.mo5792a(-4, (Handler) null);
            } else {
                C1061o.m2455a(context, i, new TypedValue(), 0, (C1332g) aVar, (Handler) null, false);
            }
        } catch (NotFoundException unused) {
            this.f8328k = true;
            dVar.mo1990a(1);
        } catch (Exception e) {
            StringBuilder a = C1965a.m4756a("Error loading font ");
            a.append(this.f8322e);
            Log.d("TextAppearance", a.toString(), e);
            this.f8328k = true;
            dVar.mo1990a(-3);
        }
    }

    /* renamed from: a */
    public void mo9048a(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f8320c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f8318a);
    }

    /* renamed from: a */
    public void mo9046a(Context context, TextPaint textPaint, C3324d dVar) {
        mo9045a();
        mo9048a(textPaint, this.f8329l);
        mo9047a(context, (C3324d) new C3323c(this, textPaint, dVar));
        ColorStateList colorStateList = this.f8319b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f8326i;
        float f2 = this.f8324g;
        float f3 = this.f8325h;
        ColorStateList colorStateList2 = this.f8323f;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }
}
