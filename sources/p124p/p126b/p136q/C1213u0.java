package p124p.p126b.p136q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import p124p.p126b.p127k.C1061o;
import p124p.p126b.p128l.p129a.C1070a;
import p124p.p150h.p152e.p153b.C1332g;

/* renamed from: p.b.q.u0 */
public class C1213u0 {

    /* renamed from: a */
    public final Context f3425a;

    /* renamed from: b */
    public final TypedArray f3426b;

    /* renamed from: c */
    public TypedValue f3427c;

    public C1213u0(Context context, TypedArray typedArray) {
        this.f3425a = context;
        this.f3426b = typedArray;
    }

    /* renamed from: a */
    public static C1213u0 m3012a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C1213u0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static C1213u0 m3013a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C1213u0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public float mo5312a(int i, float f) {
        return this.f3426b.getDimension(i, f);
    }

    /* renamed from: a */
    public int mo5313a(int i, int i2) {
        return this.f3426b.getColor(i, i2);
    }

    /* renamed from: a */
    public ColorStateList mo5314a(int i) {
        if (this.f3426b.hasValue(i)) {
            int resourceId = this.f3426b.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = C1070a.m2601a(this.f3425a, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return this.f3426b.getColorStateList(i);
    }

    /* renamed from: a */
    public Typeface mo5315a(int i, int i2, C1332g gVar) {
        int resourceId = this.f3426b.getResourceId(i, 0);
        Typeface typeface = null;
        if (resourceId == 0) {
            return null;
        }
        if (this.f3427c == null) {
            this.f3427c = new TypedValue();
        }
        Context context = this.f3425a;
        TypedValue typedValue = this.f3427c;
        if (!context.isRestricted()) {
            typeface = C1061o.m2455a(context, resourceId, typedValue, i2, gVar, (Handler) null, true);
        }
        return typeface;
    }

    /* renamed from: a */
    public boolean mo5316a(int i, boolean z) {
        return this.f3426b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int mo5317b(int i, int i2) {
        return this.f3426b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: b */
    public Drawable mo5318b(int i) {
        if (this.f3426b.hasValue(i)) {
            int resourceId = this.f3426b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C1070a.m2602b(this.f3425a, resourceId);
            }
        }
        return this.f3426b.getDrawable(i);
    }

    /* renamed from: c */
    public int mo5319c(int i, int i2) {
        return this.f3426b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: c */
    public Drawable mo5320c(int i) {
        if (this.f3426b.hasValue(i)) {
            int resourceId = this.f3426b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C1178i.m2951a().mo5175a(this.f3425a, resourceId, true);
            }
        }
        return null;
    }

    /* renamed from: d */
    public int mo5321d(int i, int i2) {
        return this.f3426b.getInt(i, i2);
    }

    /* renamed from: d */
    public String mo5322d(int i) {
        return this.f3426b.getString(i);
    }

    /* renamed from: e */
    public int mo5323e(int i, int i2) {
        return this.f3426b.getInteger(i, i2);
    }

    /* renamed from: e */
    public CharSequence mo5324e(int i) {
        return this.f3426b.getText(i);
    }

    /* renamed from: f */
    public int mo5325f(int i, int i2) {
        return this.f3426b.getLayoutDimension(i, i2);
    }

    /* renamed from: f */
    public boolean mo5326f(int i) {
        return this.f3426b.hasValue(i);
    }

    /* renamed from: g */
    public int mo5327g(int i, int i2) {
        return this.f3426b.getResourceId(i, i2);
    }
}
