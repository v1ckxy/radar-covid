package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.StateSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p124p.p126b.p134p.C1096f;
import p124p.p126b.p134p.p135i.C1114g;
import p124p.p126b.p134p.p135i.C1114g.C1115a;
import p124p.p126b.p134p.p135i.C1129m;
import p124p.p126b.p136q.C1213u0;
import p124p.p150h.p162l.C1401l;
import p124p.p150h.p162l.C1404o;
import p124p.p167j.p168a.C1458a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.C3294b;
import p213q.p217b.p218a.p271c.C3318d;
import p213q.p217b.p218a.p271c.C3400k;
import p213q.p217b.p218a.p271c.C3406l;
import p213q.p217b.p218a.p271c.p273b0.C3310j;
import p213q.p217b.p218a.p271c.p273b0.C3311k;
import p213q.p217b.p218a.p271c.p273b0.C3312l;
import p213q.p217b.p218a.p271c.p273b0.C3314n;
import p213q.p217b.p218a.p271c.p276e0.C3326a;
import p213q.p217b.p218a.p271c.p278g0.C3337g;
import p213q.p217b.p218a.p271c.p287q.C3437c;
import p213q.p217b.p218a.p271c.p287q.C3439e;
import p213q.p217b.p218a.p271c.p287q.C3440f;
import p213q.p217b.p218a.p271c.p287q.C3443g;
import p213q.p217b.p218a.p271c.p296y.C3495a;

public class BottomNavigationView extends FrameLayout {

    /* renamed from: l */
    public static final int f1200l = C3400k.Widget_Design_BottomNavigationView;

    /* renamed from: e */
    public final C1114g f1201e;

    /* renamed from: f */
    public final C3439e f1202f;

    /* renamed from: g */
    public final C3440f f1203g;

    /* renamed from: h */
    public ColorStateList f1204h;

    /* renamed from: i */
    public MenuInflater f1205i;

    /* renamed from: j */
    public C0214c f1206j;

    /* renamed from: k */
    public C0213b f1207k;

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    public class C0212a implements C1115a {
        public C0212a() {
        }

        /* renamed from: a */
        public void mo198a(C1114g gVar) {
        }

        /* renamed from: a */
        public boolean mo199a(C1114g gVar, MenuItem menuItem) {
            boolean z = true;
            if (BottomNavigationView.this.f1207k == null || menuItem.getItemId() != BottomNavigationView.this.getSelectedItemId()) {
                C0214c cVar = BottomNavigationView.this.f1206j;
                if (cVar == null || cVar.mo1757a(menuItem)) {
                    z = false;
                }
                return z;
            }
            BottomNavigationView.this.f1207k.mo1756a(menuItem);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    public interface C0213b {
        /* renamed from: a */
        void mo1756a(MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$c */
    public interface C0214c {
        /* renamed from: a */
        boolean mo1757a(MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$d */
    public static class C0215d extends C1458a {
        public static final Creator<C0215d> CREATOR = new C0216a();

        /* renamed from: g */
        public Bundle f1209g;

        /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$d$a */
        public static class C0216a implements ClassLoaderCreator<C0215d> {
            public Object createFromParcel(Parcel parcel) {
                return new C0215d(parcel, null);
            }

            public Object[] newArray(int i) {
                return new C0215d[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0215d(parcel, classLoader);
            }
        }

        public C0215d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = C0215d.class.getClassLoader();
            }
            this.f1209g = parcel.readBundle(classLoader);
        }

        public C0215d(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f4274e, i);
            parcel.writeBundle(this.f1209g);
        }
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3294b.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        C3439e eVar;
        super(C3310j.m7690b(context, attributeSet, i, f1200l), attributeSet, i);
        this.f1203g = new C3440f();
        Context context2 = getContext();
        this.f1201e = new C3437c(context2);
        this.f1202f = new C3439e(context2);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f1202f.setLayoutParams(layoutParams);
        C3440f fVar = this.f1203g;
        C3439e eVar2 = this.f1202f;
        fVar.f8708f = eVar2;
        fVar.f8710h = 1;
        eVar2.setPresenter(fVar);
        C1114g gVar = this.f1201e;
        gVar.mo4807a((C1129m) this.f1203g, gVar.f3072a);
        C3440f fVar2 = this.f1203g;
        getContext();
        C1114g gVar2 = this.f1201e;
        fVar2.f8707e = gVar2;
        fVar2.f8708f.f8684C = gVar2;
        int[] iArr = C3406l.BottomNavigationView;
        int i2 = C3400k.Widget_Design_BottomNavigationView;
        int[] iArr2 = {C3406l.BottomNavigationView_itemTextAppearanceInactive, C3406l.BottomNavigationView_itemTextAppearanceActive};
        C3310j.m7687a(context2, attributeSet, i, i2);
        C3310j.m7688a(context2, attributeSet, iArr, i, i2, iArr2);
        C1213u0 u0Var = new C1213u0(context2, context2.obtainStyledAttributes(attributeSet, iArr, i, i2));
        if (u0Var.mo5326f(C3406l.BottomNavigationView_itemIconTint)) {
            eVar = this.f1202f;
            colorStateList = u0Var.mo5314a(C3406l.BottomNavigationView_itemIconTint);
        } else {
            eVar = this.f1202f;
            colorStateList = eVar.mo9259a(16842808);
        }
        eVar.setIconTintList(colorStateList);
        setItemIconSize(u0Var.mo5319c(C3406l.BottomNavigationView_itemIconSize, getResources().getDimensionPixelSize(C3318d.design_bottom_navigation_icon_size)));
        if (u0Var.mo5326f(C3406l.BottomNavigationView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(u0Var.mo5327g(C3406l.BottomNavigationView_itemTextAppearanceInactive, 0));
        }
        if (u0Var.mo5326f(C3406l.BottomNavigationView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(u0Var.mo5327g(C3406l.BottomNavigationView_itemTextAppearanceActive, 0));
        }
        if (u0Var.mo5326f(C3406l.BottomNavigationView_itemTextColor)) {
            setItemTextColor(u0Var.mo5314a(C3406l.BottomNavigationView_itemTextColor));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C3337g gVar3 = new C3337g();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                gVar3.mo9063a(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            gVar3.f8365e.f8388b = new C3495a(context2);
            gVar3.mo9086j();
            C1404o.m3522a((View) this, (Drawable) gVar3);
        }
        if (u0Var.mo5326f(C3406l.BottomNavigationView_elevation)) {
            C1404o.m3514a((View) this, (float) u0Var.mo5319c(C3406l.BottomNavigationView_elevation, 0));
        }
        getBackground().mutate().setTintList(C2286e.m5174a(context2, u0Var, C3406l.BottomNavigationView_backgroundTint));
        setLabelVisibilityMode(u0Var.mo5323e(C3406l.BottomNavigationView_labelVisibilityMode, -1));
        setItemHorizontalTranslationEnabled(u0Var.mo5316a(C3406l.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int g = u0Var.mo5327g(C3406l.BottomNavigationView_itemBackground, 0);
        if (g != 0) {
            this.f1202f.setItemBackgroundRes(g);
        } else {
            setItemRippleColor(C2286e.m5174a(context2, u0Var, C3406l.BottomNavigationView_itemRippleColor));
        }
        if (u0Var.mo5326f(C3406l.BottomNavigationView_menu)) {
            int g2 = u0Var.mo5327g(C3406l.BottomNavigationView_menu, 0);
            this.f1203g.f8709g = true;
            getMenuInflater().inflate(g2, this.f1201e);
            C3440f fVar3 = this.f1203g;
            fVar3.f8709g = false;
            fVar3.mo536a(true);
        }
        u0Var.f3426b.recycle();
        addView(this.f1202f, layoutParams);
        this.f1201e.mo4805a((C1115a) new C0212a());
        C1404o.m3527a((View) this, (C1401l) new C3311k(new C3443g(this), new C3314n(C1404o.m3555p(this), getPaddingTop(), getPaddingEnd(), getPaddingBottom())));
        if (isAttachedToWindow()) {
            requestApplyInsets();
        } else {
            addOnAttachStateChangeListener(new C3312l());
        }
    }

    private MenuInflater getMenuInflater() {
        if (this.f1205i == null) {
            this.f1205i = new C1096f(getContext());
        }
        return this.f1205i;
    }

    public Drawable getItemBackground() {
        return this.f1202f.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f1202f.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f1202f.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f1202f.getIconTintList();
    }

    public ColorStateList getItemRippleColor() {
        return this.f1204h;
    }

    public int getItemTextAppearanceActive() {
        return this.f1202f.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f1202f.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f1202f.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f1202f.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.f1201e;
    }

    public int getSelectedItemId() {
        return this.f1202f.getSelectedItemId();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C3337g) {
            C2286e.m5230a((View) this, (C3337g) background);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0215d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0215d dVar = (C0215d) parcelable;
        super.onRestoreInstanceState(dVar.f4274e);
        C1114g gVar = this.f1201e;
        Bundle bundle = dVar.f1209g;
        if (gVar != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
            if (sparseParcelableArray != null && !gVar.f3093v.isEmpty()) {
                Iterator it = gVar.f3093v.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    C1129m mVar = (C1129m) weakReference.get();
                    if (mVar == null) {
                        gVar.f3093v.remove(weakReference);
                    } else {
                        int id = mVar.getId();
                        if (id > 0) {
                            Parcelable parcelable2 = (Parcelable) sparseParcelableArray.get(id);
                            if (parcelable2 != null) {
                                mVar.mo533a(parcelable2);
                            }
                        }
                    }
                }
            }
            return;
        }
        throw null;
    }

    public Parcelable onSaveInstanceState() {
        C0215d dVar = new C0215d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dVar.f1209g = bundle;
        C1114g gVar = this.f1201e;
        if (!gVar.f3093v.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator it = gVar.f3093v.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C1129m mVar = (C1129m) weakReference.get();
                if (mVar == null) {
                    gVar.f3093v.remove(weakReference);
                } else {
                    int id = mVar.getId();
                    if (id > 0) {
                        Parcelable d = mVar.mo541d();
                        if (d != null) {
                            sparseArray.put(id, d);
                        }
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return dVar;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C2286e.m5229a((View) this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.f1202f.setItemBackground(drawable);
        this.f1204h = null;
    }

    public void setItemBackgroundResource(int i) {
        this.f1202f.setItemBackgroundRes(i);
        this.f1204h = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        C3439e eVar = this.f1202f;
        if (eVar.f8693m != z) {
            eVar.setItemHorizontalTranslationEnabled(z);
            this.f1203g.mo536a(false);
        }
    }

    public void setItemIconSize(int i) {
        this.f1202f.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f1202f.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f1204h == colorStateList) {
            if (colorStateList == null && this.f1202f.getItemBackground() != null) {
                this.f1202f.setItemBackground(null);
            }
            return;
        }
        this.f1204h = colorStateList;
        if (colorStateList == null) {
            this.f1202f.setItemBackground(null);
        } else {
            this.f1202f.setItemBackground(new RippleDrawable(new ColorStateList(new int[][]{C3326a.f8344j, StateSet.NOTHING}, new int[]{C3326a.m7707a(colorStateList, C3326a.f8340f), C3326a.m7707a(colorStateList, C3326a.f8336b)}), null, null));
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f1202f.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f1202f.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f1202f.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f1202f.getLabelVisibilityMode() != i) {
            this.f1202f.setLabelVisibilityMode(i);
            this.f1203g.mo536a(false);
        }
    }

    public void setOnNavigationItemReselectedListener(C0213b bVar) {
        this.f1207k = bVar;
    }

    public void setOnNavigationItemSelectedListener(C0214c cVar) {
        this.f1206j = cVar;
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f1201e.findItem(i);
        if (findItem != null && !this.f1201e.mo4810a(findItem, (C1129m) this.f1203g, 0)) {
            findItem.setChecked(true);
        }
    }
}
