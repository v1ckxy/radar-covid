package p213q.p217b.p218a.p271c.p285o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p150h.p162l.C1404o;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.C3318d;
import p213q.p217b.p218a.p271c.C3366i;
import p213q.p217b.p218a.p271c.C3369j;
import p213q.p217b.p218a.p271c.C3400k;
import p213q.p217b.p218a.p271c.C3406l;
import p213q.p217b.p218a.p271c.p273b0.C3305h;
import p213q.p217b.p218a.p271c.p273b0.C3305h.C3307b;
import p213q.p217b.p218a.p271c.p273b0.C3310j;
import p213q.p217b.p218a.p271c.p275d0.C3321b;
import p213q.p217b.p218a.p271c.p278g0.C3337g;

/* renamed from: q.b.a.c.o.a */
public class C3424a extends Drawable implements C3307b {

    /* renamed from: e */
    public final WeakReference<Context> f8623e;

    /* renamed from: f */
    public final C3337g f8624f = new C3337g();

    /* renamed from: g */
    public final C3305h f8625g;

    /* renamed from: h */
    public final Rect f8626h = new Rect();

    /* renamed from: i */
    public final float f8627i;

    /* renamed from: j */
    public final float f8628j;

    /* renamed from: k */
    public final float f8629k;

    /* renamed from: l */
    public final C3425a f8630l;

    /* renamed from: m */
    public float f8631m;

    /* renamed from: n */
    public float f8632n;

    /* renamed from: o */
    public int f8633o;

    /* renamed from: p */
    public float f8634p;

    /* renamed from: q */
    public float f8635q;

    /* renamed from: r */
    public float f8636r;

    /* renamed from: s */
    public WeakReference<View> f8637s;

    /* renamed from: t */
    public WeakReference<ViewGroup> f8638t;

    /* renamed from: q.b.a.c.o.a$a */
    public static final class C3425a implements Parcelable {
        public static final Creator<C3425a> CREATOR = new C3426a();

        /* renamed from: e */
        public int f8639e;

        /* renamed from: f */
        public int f8640f;

        /* renamed from: g */
        public int f8641g = 255;

        /* renamed from: h */
        public int f8642h = -1;

        /* renamed from: i */
        public int f8643i;

        /* renamed from: j */
        public CharSequence f8644j;

        /* renamed from: k */
        public int f8645k;

        /* renamed from: l */
        public int f8646l;

        /* renamed from: q.b.a.c.o.a$a$a */
        public static class C3426a implements Creator<C3425a> {
            public Object createFromParcel(Parcel parcel) {
                return new C3425a(parcel);
            }

            public Object[] newArray(int i) {
                return new C3425a[i];
            }
        }

        public C3425a(Context context) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C3400k.TextAppearance_MaterialComponents_Badge, C3406l.TextAppearance);
            obtainStyledAttributes.getDimension(C3406l.TextAppearance_android_textSize, 0.0f);
            ColorStateList a = C2286e.m5173a(context, obtainStyledAttributes, C3406l.TextAppearance_android_textColor);
            C2286e.m5173a(context, obtainStyledAttributes, C3406l.TextAppearance_android_textColorHint);
            C2286e.m5173a(context, obtainStyledAttributes, C3406l.TextAppearance_android_textColorLink);
            obtainStyledAttributes.getInt(C3406l.TextAppearance_android_textStyle, 0);
            obtainStyledAttributes.getInt(C3406l.TextAppearance_android_typeface, 1);
            int i = C3406l.TextAppearance_fontFamily;
            int i2 = C3406l.TextAppearance_android_fontFamily;
            if (!obtainStyledAttributes.hasValue(i)) {
                i = i2;
            }
            obtainStyledAttributes.getResourceId(i, 0);
            obtainStyledAttributes.getString(i);
            obtainStyledAttributes.getBoolean(C3406l.TextAppearance_textAllCaps, false);
            C2286e.m5173a(context, obtainStyledAttributes, C3406l.TextAppearance_android_shadowColor);
            obtainStyledAttributes.getFloat(C3406l.TextAppearance_android_shadowDx, 0.0f);
            obtainStyledAttributes.getFloat(C3406l.TextAppearance_android_shadowDy, 0.0f);
            obtainStyledAttributes.getFloat(C3406l.TextAppearance_android_shadowRadius, 0.0f);
            obtainStyledAttributes.recycle();
            this.f8640f = a.getDefaultColor();
            this.f8644j = context.getString(C3369j.mtrl_badge_numberless_content_description);
            this.f8645k = C3366i.mtrl_badge_content_description;
        }

        public C3425a(Parcel parcel) {
            this.f8639e = parcel.readInt();
            this.f8640f = parcel.readInt();
            this.f8641g = parcel.readInt();
            this.f8642h = parcel.readInt();
            this.f8643i = parcel.readInt();
            this.f8644j = parcel.readString();
            this.f8645k = parcel.readInt();
            this.f8646l = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f8639e);
            parcel.writeInt(this.f8640f);
            parcel.writeInt(this.f8641g);
            parcel.writeInt(this.f8642h);
            parcel.writeInt(this.f8643i);
            parcel.writeString(this.f8644j.toString());
            parcel.writeInt(this.f8645k);
            parcel.writeInt(this.f8646l);
        }
    }

    public C3424a(Context context) {
        this.f8623e = new WeakReference<>(context);
        C3310j.m7689a(context, C3310j.f8301b, "Theme.MaterialComponents");
        Resources resources = context.getResources();
        this.f8627i = (float) resources.getDimensionPixelSize(C3318d.mtrl_badge_radius);
        this.f8629k = (float) resources.getDimensionPixelSize(C3318d.mtrl_badge_long_text_horizontal_padding);
        this.f8628j = (float) resources.getDimensionPixelSize(C3318d.mtrl_badge_with_text_radius);
        C3305h hVar = new C3305h(this);
        this.f8625g = hVar;
        hVar.f8292a.setTextAlign(Align.CENTER);
        this.f8630l = new C3425a(context);
        int i = C3400k.TextAppearance_MaterialComponents_Badge;
        Context context2 = (Context) this.f8623e.get();
        if (context2 != null) {
            C3321b bVar = new C3321b(context2, i);
            if (this.f8625g.f8297f != bVar) {
                Context context3 = (Context) this.f8623e.get();
                if (context3 != null) {
                    this.f8625g.mo9032a(bVar, context3);
                    mo9214e();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo9033a() {
        invalidateSelf();
    }

    /* renamed from: b */
    public final String mo9210b() {
        if (mo9211c() <= this.f8633o) {
            return Integer.toString(mo9211c());
        }
        Context context = (Context) this.f8623e.get();
        if (context == null) {
            return Objects.EMPTY_STRING;
        }
        return context.getString(C3369j.mtrl_exceed_max_badge_number_suffix, new Object[]{Integer.valueOf(this.f8633o), "+"});
    }

    /* renamed from: c */
    public int mo9211c() {
        if (!mo9212d()) {
            return 0;
        }
        return this.f8630l.f8642h;
    }

    /* renamed from: d */
    public boolean mo9212d() {
        return this.f8630l.f8642h != -1;
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && this.f8630l.f8641g != 0 && isVisible()) {
            this.f8624f.draw(canvas);
            if (mo9212d()) {
                Rect rect = new Rect();
                String b = mo9210b();
                this.f8625g.f8292a.getTextBounds(b, 0, b.length(), rect);
                canvas.drawText(b, this.f8631m, this.f8632n + ((float) (rect.height() / 2)), this.f8625g.f8292a);
            }
        }
    }

    /* renamed from: e */
    public final void mo9214e() {
        float f;
        Context context = (Context) this.f8623e.get();
        WeakReference<View> weakReference = this.f8637s;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f8626h);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<ViewGroup> weakReference2 = this.f8638t;
            if (weakReference2 != null) {
                viewGroup = (ViewGroup) weakReference2.get();
            }
            if (viewGroup != null) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            int i = this.f8630l.f8646l;
            this.f8632n = (float) ((i == 8388691 || i == 8388693) ? rect2.bottom : rect2.top);
            if (mo9211c() <= 9) {
                f = !mo9212d() ? this.f8627i : this.f8628j;
                this.f8634p = f;
                this.f8636r = f;
            } else {
                float f2 = this.f8628j;
                this.f8634p = f2;
                this.f8636r = f2;
                f = (this.f8625g.mo9031a(mo9210b()) / 2.0f) + this.f8629k;
            }
            this.f8635q = f;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(mo9212d() ? C3318d.mtrl_badge_text_horizontal_edge_offset : C3318d.mtrl_badge_horizontal_edge_offset);
            int i2 = this.f8630l.f8646l;
            float f3 = (i2 == 8388659 || i2 == 8388691 ? C1404o.m3551l(view) != 0 : C1404o.m3551l(view) == 0) ? (((float) rect2.right) + this.f8635q) - ((float) dimensionPixelSize) : (((float) rect2.left) - this.f8635q) + ((float) dimensionPixelSize);
            this.f8631m = f3;
            Rect rect3 = this.f8626h;
            float f4 = this.f8632n;
            float f5 = this.f8635q;
            float f6 = this.f8636r;
            rect3.set((int) (f3 - f5), (int) (f4 - f6), (int) (f3 + f5), (int) (f4 + f6));
            C3337g gVar = this.f8624f;
            gVar.setShapeAppearanceModel(gVar.f8365e.f8387a.mo9099a(this.f8634p));
            if (!rect.equals(this.f8626h)) {
                this.f8624f.setBounds(this.f8626h);
            }
        }
    }

    public int getAlpha() {
        return this.f8630l.f8641g;
    }

    public int getIntrinsicHeight() {
        return this.f8626h.height();
    }

    public int getIntrinsicWidth() {
        return this.f8626h.width();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return false;
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void setAlpha(int i) {
        this.f8630l.f8641g = i;
        this.f8625g.f8292a.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
