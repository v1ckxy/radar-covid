package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.ActionMenuView.C0019a;
import p124p.p126b.C1027j;
import p124p.p126b.p127k.C1061o;
import p124p.p126b.p134p.p135i.C1114g.C1116b;
import p124p.p126b.p134p.p135i.C1118i;
import p124p.p126b.p134p.p135i.C1131n.C1132a;
import p124p.p126b.p134p.p135i.C1134p;
import p124p.p126b.p136q.C1147c;
import p124p.p126b.p136q.C1147c.C1148a;
import p124p.p126b.p136q.C1163e0;
import p124p.p126b.p136q.C1218w;

public class ActionMenuItemView extends C1218w implements C1132a, OnClickListener, C0019a {

    /* renamed from: i */
    public C1118i f95i;

    /* renamed from: j */
    public CharSequence f96j;

    /* renamed from: k */
    public Drawable f97k;

    /* renamed from: l */
    public C1116b f98l;

    /* renamed from: m */
    public C1163e0 f99m;

    /* renamed from: n */
    public C0012b f100n;

    /* renamed from: o */
    public boolean f101o;

    /* renamed from: p */
    public boolean f102p;

    /* renamed from: q */
    public int f103q;

    /* renamed from: r */
    public int f104r;

    /* renamed from: s */
    public int f105s;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    public class C0011a extends C1163e0 {
        public C0011a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: b */
        public C1134p mo59b() {
            C0012b bVar = ActionMenuItemView.this.f100n;
            if (bVar == null) {
                return null;
            }
            C1148a aVar = C1147c.this.f3215z;
            if (aVar != null) {
                return aVar.mo4961a();
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo60c() {
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C1116b bVar = actionMenuItemView.f98l;
            if (bVar == null || !bVar.mo62a(actionMenuItemView.f95i)) {
                return false;
            }
            C1134p b = mo59b();
            return b != null && b.mo4766a();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0012b {
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f101o = mo43e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1027j.ActionMenuItemView, i, 0);
        this.f103q = obtainStyledAttributes.getDimensionPixelSize(C1027j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f105s = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f104r = -1;
        setSaveEnabled(false);
    }

    /* renamed from: a */
    public void mo38a(C1118i iVar, int i) {
        CharSequence charSequence;
        this.f95i = iVar;
        setIcon(iVar.getIcon());
        if (mo40b()) {
            charSequence = iVar.getTitleCondensed();
        } else {
            charSequence = iVar.f3108e;
        }
        setTitle(charSequence);
        setId(iVar.f3104a);
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f99m == null) {
            this.f99m = new C0011a();
        }
    }

    /* renamed from: a */
    public boolean mo39a() {
        return mo42d();
    }

    /* renamed from: b */
    public boolean mo40b() {
        return true;
    }

    /* renamed from: c */
    public boolean mo41c() {
        return mo42d() && this.f95i.getIcon() == null;
    }

    /* renamed from: d */
    public boolean mo42d() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: e */
    public final boolean mo43e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: f */
    public final void mo44f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f96j);
        if (this.f97k != null) {
            if (!((this.f95i.f3128y & 4) == 4) || (!this.f101o && !this.f102p)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f96j : null);
        CharSequence charSequence2 = this.f95i.f3120q;
        if (TextUtils.isEmpty(charSequence2)) {
            if (z3) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f95i.f3108e;
            }
        }
        setContentDescription(charSequence2);
        CharSequence charSequence3 = this.f95i.f3121r;
        if (TextUtils.isEmpty(charSequence3)) {
            if (!z3) {
                charSequence = this.f95i.f3108e;
            }
            C1061o.m2492a((View) this, charSequence);
            return;
        }
        C1061o.m2492a((View) this, charSequence3);
    }

    public C1118i getItemData() {
        return this.f95i;
    }

    public void onClick(View view) {
        C1116b bVar = this.f98l;
        if (bVar != null) {
            bVar.mo62a(this.f95i);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f101o = mo43e();
        mo44f();
    }

    public void onMeasure(int i, int i2) {
        boolean d = mo42d();
        if (d) {
            int i3 = this.f104r;
            if (i3 >= 0) {
                super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
            }
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f103q) : this.f103q;
        if (mode != 1073741824 && this.f103q > 0 && measuredWidth < min) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!d && this.f97k != null) {
            super.setPadding((getMeasuredWidth() - this.f97k.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f95i.hasSubMenu()) {
            C1163e0 e0Var = this.f99m;
            if (e0Var != null && e0Var.onTouch(this, motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f102p != z) {
            this.f102p = z;
            C1118i iVar = this.f95i;
            if (iVar != null) {
                iVar.f3117n.mo4836h();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f97k = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f105s;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            int i2 = this.f105s;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        mo44f();
    }

    public void setItemInvoker(C1116b bVar) {
        this.f98l = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f104r = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0012b bVar) {
        this.f100n = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f96j = charSequence;
        mo44f();
    }
}
