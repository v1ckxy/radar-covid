package p213q.p217b.p218a.p271c.p287q;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import p124p.p126b.C1018a;
import p124p.p126b.p128l.p129a.C1070a;
import p124p.p126b.p134p.p135i.C1114g;
import p124p.p126b.p134p.p135i.C1118i;
import p124p.p126b.p134p.p135i.C1131n;
import p124p.p150h.p161k.C1384d;
import p124p.p150h.p161k.C1385e;
import p124p.p150h.p162l.C1404o;
import p124p.p172l.p173a.p174a.C1527b;
import p124p.p191u.C1685a;
import p124p.p191u.C1718i;
import p124p.p191u.C1730o;
import p213q.p217b.p218a.p271c.C3318d;
import p213q.p217b.p218a.p271c.p273b0.C3308i;
import p213q.p217b.p218a.p271c.p285o.C3424a;

/* renamed from: q.b.a.c.q.e */
public class C3439e extends ViewGroup implements C1131n {

    /* renamed from: D */
    public static final int[] f8680D = {16842912};

    /* renamed from: E */
    public static final int[] f8681E = {-16842910};

    /* renamed from: A */
    public SparseArray<C3424a> f8682A = new SparseArray<>(5);

    /* renamed from: B */
    public C3440f f8683B;

    /* renamed from: C */
    public C1114g f8684C;

    /* renamed from: e */
    public final C1730o f8685e;

    /* renamed from: f */
    public final int f8686f;

    /* renamed from: g */
    public final int f8687g;

    /* renamed from: h */
    public final int f8688h;

    /* renamed from: i */
    public final int f8689i;

    /* renamed from: j */
    public final int f8690j;

    /* renamed from: k */
    public final OnClickListener f8691k;

    /* renamed from: l */
    public final C1384d<C3436b> f8692l = new C1385e(5);

    /* renamed from: m */
    public boolean f8693m;

    /* renamed from: n */
    public int f8694n;

    /* renamed from: o */
    public C3436b[] f8695o;

    /* renamed from: p */
    public int f8696p = 0;

    /* renamed from: q */
    public int f8697q = 0;

    /* renamed from: r */
    public ColorStateList f8698r;

    /* renamed from: s */
    public int f8699s;

    /* renamed from: t */
    public ColorStateList f8700t;

    /* renamed from: u */
    public final ColorStateList f8701u;

    /* renamed from: v */
    public int f8702v;

    /* renamed from: w */
    public int f8703w;

    /* renamed from: x */
    public Drawable f8704x;

    /* renamed from: y */
    public int f8705y;

    /* renamed from: z */
    public int[] f8706z;

    public C3439e(Context context) {
        super(context, null);
        Resources resources = getResources();
        this.f8686f = resources.getDimensionPixelSize(C3318d.design_bottom_navigation_item_max_width);
        this.f8687g = resources.getDimensionPixelSize(C3318d.design_bottom_navigation_item_min_width);
        this.f8688h = resources.getDimensionPixelSize(C3318d.design_bottom_navigation_active_item_max_width);
        this.f8689i = resources.getDimensionPixelSize(C3318d.design_bottom_navigation_active_item_min_width);
        this.f8690j = resources.getDimensionPixelSize(C3318d.design_bottom_navigation_height);
        this.f8701u = mo9259a(16842808);
        C1685a aVar = new C1685a();
        this.f8685e = aVar;
        aVar.mo6596b(0);
        this.f8685e.mo6562a(115);
        this.f8685e.mo6563a((TimeInterpolator) new C1527b());
        this.f8685e.mo6595a((C1718i) new C3308i());
        this.f8691k = new C3438d(this);
        this.f8706z = new int[5];
    }

    private C3436b getNewItem() {
        C3436b bVar = (C3436b) this.f8692l.mo5864a();
        return bVar == null ? new C3436b(getContext()) : bVar;
    }

    private void setBadgeIfNeeded(C3436b bVar) {
        int id = bVar.getId();
        if (id != -1) {
            C3424a aVar = (C3424a) this.f8682A.get(id);
            if (aVar != null) {
                bVar.setBadge(aVar);
            }
        }
    }

    /* renamed from: a */
    public ColorStateList mo9259a(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a = C1070a.m2601a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C1018a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a.getDefaultColor();
        return new ColorStateList(new int[][]{f8681E, f8680D, ViewGroup.EMPTY_STATE_SET}, new int[]{a.getColorForState(f8681E, defaultColor), i2, defaultColor});
    }

    /* renamed from: a */
    public void mo9260a() {
        removeAllViews();
        C3436b[] bVarArr = this.f8695o;
        if (bVarArr != null) {
            for (C3436b bVar : bVarArr) {
                if (bVar != null) {
                    this.f8692l.mo5865a(bVar);
                    ImageView imageView = bVar.f8670k;
                    if (bVar.mo9237a()) {
                        if (imageView != null) {
                            bVar.setClipChildren(true);
                            bVar.setClipToPadding(true);
                            C3424a aVar = bVar.f8678s;
                            if (aVar != null) {
                                imageView.getOverlay().remove(aVar);
                            }
                        }
                        bVar.f8678s = null;
                    }
                }
            }
        }
        if (this.f8684C.size() == 0) {
            this.f8696p = 0;
            this.f8697q = 0;
            this.f8695o = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f8684C.size(); i++) {
            hashSet.add(Integer.valueOf(this.f8684C.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f8682A.size(); i2++) {
            int keyAt = this.f8682A.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f8682A.delete(keyAt);
            }
        }
        this.f8695o = new C3436b[this.f8684C.size()];
        boolean a = mo9261a(this.f8694n, this.f8684C.mo4830d().size());
        for (int i3 = 0; i3 < this.f8684C.size(); i3++) {
            this.f8683B.f8709g = true;
            this.f8684C.getItem(i3).setCheckable(true);
            this.f8683B.f8709g = false;
            C3436b newItem = getNewItem();
            this.f8695o[i3] = newItem;
            newItem.setIconTintList(this.f8698r);
            newItem.setIconSize(this.f8699s);
            newItem.setTextColor(this.f8701u);
            newItem.setTextAppearanceInactive(this.f8702v);
            newItem.setTextAppearanceActive(this.f8703w);
            newItem.setTextColor(this.f8700t);
            Drawable drawable = this.f8704x;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f8705y);
            }
            newItem.setShifting(a);
            newItem.setLabelVisibilityMode(this.f8694n);
            newItem.mo38a((C1118i) this.f8684C.getItem(i3), 0);
            newItem.setItemPosition(i3);
            newItem.setOnClickListener(this.f8691k);
            if (this.f8696p != 0 && this.f8684C.getItem(i3).getItemId() == this.f8696p) {
                this.f8697q = i3;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f8684C.size() - 1, this.f8697q);
        this.f8697q = min;
        this.f8684C.getItem(min).setChecked(true);
    }

    /* renamed from: a */
    public void mo61a(C1114g gVar) {
        this.f8684C = gVar;
    }

    /* renamed from: a */
    public final boolean mo9261a(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    public SparseArray<C3424a> getBadgeDrawables() {
        return this.f8682A;
    }

    public ColorStateList getIconTintList() {
        return this.f8698r;
    }

    public Drawable getItemBackground() {
        C3436b[] bVarArr = this.f8695o;
        return (bVarArr == null || bVarArr.length <= 0) ? this.f8704x : bVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f8705y;
    }

    public int getItemIconSize() {
        return this.f8699s;
    }

    public int getItemTextAppearanceActive() {
        return this.f8703w;
    }

    public int getItemTextAppearanceInactive() {
        return this.f8702v;
    }

    public ColorStateList getItemTextColor() {
        return this.f8700t;
    }

    public int getLabelVisibilityMode() {
        return this.f8694n;
    }

    public int getSelectedItemId() {
        return this.f8696p;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (C1404o.m3551l(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int size2 = this.f8684C.mo4830d().size();
        int childCount = getChildCount();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f8690j, 1073741824);
        if (!mo9261a(this.f8694n, size2) || !this.f8693m) {
            int min = Math.min(size / (size2 == 0 ? 1 : size2), this.f8688h);
            int i3 = size - (size2 * min);
            for (int i4 = 0; i4 < childCount; i4++) {
                if (getChildAt(i4).getVisibility() != 8) {
                    int[] iArr = this.f8706z;
                    iArr[i4] = min;
                    if (i3 > 0) {
                        iArr[i4] = iArr[i4] + 1;
                        i3--;
                    }
                } else {
                    this.f8706z[i4] = 0;
                }
            }
        } else {
            View childAt = getChildAt(this.f8697q);
            int i5 = this.f8689i;
            if (childAt.getVisibility() != 8) {
                childAt.measure(MeasureSpec.makeMeasureSpec(this.f8688h, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
                i5 = Math.max(i5, childAt.getMeasuredWidth());
            }
            int i6 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min2 = Math.min(size - (this.f8687g * i6), Math.min(i5, this.f8688h));
            int i7 = size - min2;
            int min3 = Math.min(i7 / (i6 == 0 ? 1 : i6), this.f8686f);
            int i8 = i7 - (i6 * min3);
            int i9 = 0;
            while (i9 < childCount) {
                if (getChildAt(i9).getVisibility() != 8) {
                    this.f8706z[i9] = i9 == this.f8697q ? min2 : min3;
                    if (i8 > 0) {
                        int[] iArr2 = this.f8706z;
                        iArr2[i9] = iArr2[i9] + 1;
                        i8--;
                    }
                } else {
                    this.f8706z[i9] = 0;
                }
                i9++;
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(MeasureSpec.makeMeasureSpec(this.f8706z[i11], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i10 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10, MeasureSpec.makeMeasureSpec(i10, 1073741824), 0), View.resolveSizeAndState(this.f8690j, makeMeasureSpec, 0));
    }

    public void setBadgeDrawables(SparseArray<C3424a> sparseArray) {
        this.f8682A = sparseArray;
        C3436b[] bVarArr = this.f8695o;
        if (bVarArr != null) {
            for (C3436b bVar : bVarArr) {
                bVar.setBadge((C3424a) sparseArray.get(bVar.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f8698r = colorStateList;
        C3436b[] bVarArr = this.f8695o;
        if (bVarArr != null) {
            for (C3436b iconTintList : bVarArr) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f8704x = drawable;
        C3436b[] bVarArr = this.f8695o;
        if (bVarArr != null) {
            for (C3436b itemBackground : bVarArr) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f8705y = i;
        C3436b[] bVarArr = this.f8695o;
        if (bVarArr != null) {
            for (C3436b itemBackground : bVarArr) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f8693m = z;
    }

    public void setItemIconSize(int i) {
        this.f8699s = i;
        C3436b[] bVarArr = this.f8695o;
        if (bVarArr != null) {
            for (C3436b iconSize : bVarArr) {
                iconSize.setIconSize(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f8703w = i;
        C3436b[] bVarArr = this.f8695o;
        if (bVarArr != null) {
            for (C3436b bVar : bVarArr) {
                bVar.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f8700t;
                if (colorStateList != null) {
                    bVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f8702v = i;
        C3436b[] bVarArr = this.f8695o;
        if (bVarArr != null) {
            for (C3436b bVar : bVarArr) {
                bVar.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f8700t;
                if (colorStateList != null) {
                    bVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f8700t = colorStateList;
        C3436b[] bVarArr = this.f8695o;
        if (bVarArr != null) {
            for (C3436b textColor : bVarArr) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f8694n = i;
    }

    public void setPresenter(C3440f fVar) {
        this.f8683B = fVar;
    }
}
