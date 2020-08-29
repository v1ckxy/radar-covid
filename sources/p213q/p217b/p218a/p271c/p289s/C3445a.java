package p213q.p217b.p218a.p271c.p289s;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.C3294b;
import p213q.p217b.p218a.p271c.p278g0.C3337g;
import p213q.p217b.p218a.p271c.p278g0.C3342j;
import p213q.p217b.p218a.p271c.p278g0.C3355n;

/* renamed from: q.b.a.c.s.a */
public class C3445a {

    /* renamed from: a */
    public final MaterialButton f8714a;

    /* renamed from: b */
    public C3342j f8715b;

    /* renamed from: c */
    public int f8716c;

    /* renamed from: d */
    public int f8717d;

    /* renamed from: e */
    public int f8718e;

    /* renamed from: f */
    public int f8719f;

    /* renamed from: g */
    public int f8720g;

    /* renamed from: h */
    public int f8721h;

    /* renamed from: i */
    public Mode f8722i;

    /* renamed from: j */
    public ColorStateList f8723j;

    /* renamed from: k */
    public ColorStateList f8724k;

    /* renamed from: l */
    public ColorStateList f8725l;

    /* renamed from: m */
    public Drawable f8726m;

    /* renamed from: n */
    public boolean f8727n = false;

    /* renamed from: o */
    public boolean f8728o = false;

    /* renamed from: p */
    public boolean f8729p = false;

    /* renamed from: q */
    public boolean f8730q;

    /* renamed from: r */
    public LayerDrawable f8731r;

    public C3445a(MaterialButton materialButton, C3342j jVar) {
        this.f8714a = materialButton;
        this.f8715b = jVar;
    }

    /* renamed from: a */
    public final C3337g mo9291a(boolean z) {
        LayerDrawable layerDrawable = this.f8731r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C3337g) ((LayerDrawable) ((InsetDrawable) this.f8731r.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
    }

    /* renamed from: a */
    public C3355n mo9292a() {
        LayerDrawable layerDrawable = this.f8731r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (C3355n) (this.f8731r.getNumberOfLayers() > 2 ? this.f8731r.getDrawable(2) : this.f8731r.getDrawable(1));
    }

    /* renamed from: a */
    public void mo9293a(C3342j jVar) {
        this.f8715b = jVar;
        if (mo9294b() != null) {
            C3337g b = mo9294b();
            b.f8365e.f8387a = jVar;
            b.invalidateSelf();
        }
        if (mo9295c() != null) {
            C3337g c = mo9295c();
            c.f8365e.f8387a = jVar;
            c.invalidateSelf();
        }
        if (mo9292a() != null) {
            mo9292a().setShapeAppearanceModel(jVar);
        }
    }

    /* renamed from: b */
    public C3337g mo9294b() {
        return mo9291a(false);
    }

    /* renamed from: c */
    public final C3337g mo9295c() {
        return mo9291a(true);
    }

    /* renamed from: d */
    public final void mo9296d() {
        C3337g b = mo9294b();
        C3337g c = mo9295c();
        if (b != null) {
            b.mo9061a((float) this.f8721h, this.f8724k);
            if (c != null) {
                c.mo9060a((float) this.f8721h, this.f8727n ? C2286e.m5156a((View) this.f8714a, C3294b.colorSurface) : 0);
            }
        }
    }
}
