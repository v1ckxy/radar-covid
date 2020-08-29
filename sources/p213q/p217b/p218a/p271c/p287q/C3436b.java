package p213q.p217b.p218a.p271c.p287q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.p127k.C1061o;
import p124p.p126b.p134p.p135i.C1118i;
import p124p.p126b.p134p.p135i.C1131n.C1132a;
import p124p.p150h.p152e.C1325a;
import p124p.p150h.p162l.C1387a;
import p124p.p150h.p162l.C1403n;
import p124p.p150h.p162l.C1404o;
import p213q.p217b.p218a.p271c.C3318d;
import p213q.p217b.p218a.p271c.C3325e;
import p213q.p217b.p218a.p271c.C3327f;
import p213q.p217b.p218a.p271c.C3356h;
import p213q.p217b.p218a.p271c.p285o.C3424a;
import p213q.p217b.p218a.p271c.p285o.C3427b;

/* renamed from: q.b.a.c.q.b */
public class C3436b extends FrameLayout implements C1132a {

    /* renamed from: t */
    public static final int[] f8663t = {16842912};

    /* renamed from: e */
    public final int f8664e;

    /* renamed from: f */
    public float f8665f;

    /* renamed from: g */
    public float f8666g;

    /* renamed from: h */
    public float f8667h;

    /* renamed from: i */
    public int f8668i;

    /* renamed from: j */
    public boolean f8669j;

    /* renamed from: k */
    public ImageView f8670k;

    /* renamed from: l */
    public final TextView f8671l;

    /* renamed from: m */
    public final TextView f8672m;

    /* renamed from: n */
    public int f8673n = -1;

    /* renamed from: o */
    public C1118i f8674o;

    /* renamed from: p */
    public ColorStateList f8675p;

    /* renamed from: q */
    public Drawable f8676q;

    /* renamed from: r */
    public Drawable f8677r;

    /* renamed from: s */
    public C3424a f8678s;

    public C3436b(Context context) {
        super(context, null, 0);
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(C3356h.design_bottom_navigation_item, this, true);
        setBackgroundResource(C3325e.design_bottom_navigation_item_background);
        this.f8664e = resources.getDimensionPixelSize(C3318d.design_bottom_navigation_margin);
        this.f8670k = (ImageView) findViewById(C3327f.icon);
        this.f8671l = (TextView) findViewById(C3327f.smallLabel);
        this.f8672m = (TextView) findViewById(C3327f.largeLabel);
        C1404o.m3545f(this.f8671l, 2);
        this.f8672m.setImportantForAccessibility(2);
        setFocusable(true);
        mo9234a(this.f8671l.getTextSize(), this.f8672m.getTextSize());
        ImageView imageView = this.f8670k;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new C3435a(this));
        }
        C1404o.m3526a((View) this, (C1387a) null);
    }

    /* renamed from: a */
    public final void mo9234a(float f, float f2) {
        this.f8665f = f - f2;
        this.f8666g = (f2 * 1.0f) / f;
        this.f8667h = (f * 1.0f) / f2;
    }

    /* renamed from: a */
    public final void mo9235a(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo9236a(View view, int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo38a(C1118i iVar, int i) {
        CharSequence charSequence;
        this.f8674o = iVar;
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setIcon(iVar.getIcon());
        setTitle(iVar.f3108e);
        setId(iVar.f3104a);
        if (!TextUtils.isEmpty(iVar.f3120q)) {
            setContentDescription(iVar.f3120q);
        }
        if (!TextUtils.isEmpty(iVar.f3121r)) {
            charSequence = iVar.f3121r;
        } else {
            charSequence = iVar.f3108e;
        }
        C1061o.m2492a((View) this, charSequence);
        setVisibility(iVar.isVisible() ? 0 : 8);
    }

    /* renamed from: a */
    public final boolean mo9237a() {
        return this.f8678s != null;
    }

    /* renamed from: b */
    public boolean mo40b() {
        return false;
    }

    public C3424a getBadge() {
        return this.f8678s;
    }

    public C1118i getItemData() {
        return this.f8674o;
    }

    public int getItemPosition() {
        return this.f8673n;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1118i iVar = this.f8674o;
        if (iVar != null && iVar.isCheckable() && this.f8674o.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f8663t);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3424a aVar = this.f8678s;
        if (aVar != null && aVar.isVisible()) {
            C1118i iVar = this.f8674o;
            CharSequence charSequence = iVar.f3108e;
            if (!TextUtils.isEmpty(iVar.f3120q)) {
                charSequence = this.f8674o.f3120q;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence);
            sb.append(Objects.ARRAY_ELEMENT_SEPARATOR);
            C3424a aVar2 = this.f8678s;
            Object obj = null;
            if (aVar2.isVisible()) {
                if (!aVar2.mo9212d()) {
                    obj = aVar2.f8630l.f8644j;
                } else if (aVar2.f8630l.f8645k > 0) {
                    Context context = (Context) aVar2.f8623e.get();
                    if (context != null) {
                        obj = context.getResources().getQuantityString(aVar2.f8630l.f8645k, aVar2.mo9211c(), new Object[]{Integer.valueOf(aVar2.mo9211c())});
                    }
                }
            }
            sb.append(obj);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
    }

    public void setBadge(C3424a aVar) {
        this.f8678s = aVar;
        ImageView imageView = this.f8670k;
        if (imageView != null && mo9237a() && imageView != null) {
            setClipChildren(false);
            setClipToPadding(false);
            C3424a aVar2 = this.f8678s;
            C3427b.m7835a(aVar2, imageView, null);
            imageView.getOverlay().add(aVar2);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x008a, code lost:
        if (r10 != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x008c, code lost:
        mo9236a(r0, r1, 49);
        mo9235a(r9.f8672m, 1.0f, 1.0f, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0095, code lost:
        mo9236a(r0, r1, 17);
        mo9235a(r9.f8672m, 0.5f, 0.5f, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009d, code lost:
        r9.f8671l.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ab, code lost:
        if (r10 != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ae, code lost:
        if (r10 != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0057, code lost:
        if (r10 != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0072, code lost:
        mo9236a(r9.f8670k, r9.f8664e, 49);
        r0 = r9.f8672m;
        r1 = r9.f8667h;
        mo9235a(r0, r1, r1, 4);
        mo9235a(r9.f8671l, 1.0f, 1.0f, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChecked(boolean r10) {
        /*
            r9 = this;
            android.widget.TextView r0 = r9.f8672m
            int r1 = r0.getWidth()
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r9.f8672m
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            android.widget.TextView r0 = r9.f8671l
            int r1 = r0.getWidth()
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r9.f8671l
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            int r0 = r9.f8668i
            r1 = -1
            r3 = 17
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 0
            r6 = 49
            r7 = 4
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r0 == r1) goto L_0x00a3
            if (r0 == 0) goto L_0x0086
            r1 = 1
            if (r0 == r1) goto L_0x0057
            if (r0 == r2) goto L_0x0043
            goto L_0x00b1
        L_0x0043:
            android.widget.ImageView r0 = r9.f8670k
            int r1 = r9.f8664e
            r9.mo9236a(r0, r1, r3)
            android.widget.TextView r0 = r9.f8672m
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r9.f8671l
            r0.setVisibility(r1)
            goto L_0x00b1
        L_0x0057:
            if (r10 == 0) goto L_0x0072
        L_0x0059:
            android.widget.ImageView r0 = r9.f8670k
            int r1 = r9.f8664e
            float r1 = (float) r1
            float r2 = r9.f8665f
            float r1 = r1 + r2
            int r1 = (int) r1
            r9.mo9236a(r0, r1, r6)
            android.widget.TextView r0 = r9.f8672m
            r9.mo9235a(r0, r8, r8, r5)
            android.widget.TextView r0 = r9.f8671l
            float r1 = r9.f8666g
            r9.mo9235a(r0, r1, r1, r7)
            goto L_0x00b1
        L_0x0072:
            android.widget.ImageView r0 = r9.f8670k
            int r1 = r9.f8664e
            r9.mo9236a(r0, r1, r6)
            android.widget.TextView r0 = r9.f8672m
            float r1 = r9.f8667h
            r9.mo9235a(r0, r1, r1, r7)
            android.widget.TextView r0 = r9.f8671l
            r9.mo9235a(r0, r8, r8, r5)
            goto L_0x00b1
        L_0x0086:
            android.widget.ImageView r0 = r9.f8670k
            int r1 = r9.f8664e
            if (r10 == 0) goto L_0x0095
        L_0x008c:
            r9.mo9236a(r0, r1, r6)
            android.widget.TextView r0 = r9.f8672m
            r9.mo9235a(r0, r8, r8, r5)
            goto L_0x009d
        L_0x0095:
            r9.mo9236a(r0, r1, r3)
            android.widget.TextView r0 = r9.f8672m
            r9.mo9235a(r0, r4, r4, r7)
        L_0x009d:
            android.widget.TextView r0 = r9.f8671l
            r0.setVisibility(r7)
            goto L_0x00b1
        L_0x00a3:
            boolean r0 = r9.f8669j
            if (r0 == 0) goto L_0x00ae
            android.widget.ImageView r0 = r9.f8670k
            int r1 = r9.f8664e
            if (r10 == 0) goto L_0x0095
            goto L_0x008c
        L_0x00ae:
            if (r10 == 0) goto L_0x0072
            goto L_0x0059
        L_0x00b1:
            r9.refreshDrawableState()
            r9.setSelected(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p271c.p287q.C3436b.setChecked(boolean):void");
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f8671l.setEnabled(z);
        this.f8672m.setEnabled(z);
        this.f8670k.setEnabled(z);
        C1403n nVar = null;
        if (z) {
            nVar = VERSION.SDK_INT >= 24 ? new C1403n(PointerIcon.getSystemIcon(getContext(), 1002)) : new C1403n(null);
        }
        C1404o.m3528a((View) this, nVar);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != this.f8676q) {
            this.f8676q = drawable;
            if (drawable != null) {
                ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                this.f8677r = drawable;
                ColorStateList colorStateList = this.f8675p;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                }
            }
            this.f8670k.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i) {
        LayoutParams layoutParams = (LayoutParams) this.f8670k.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f8670k.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f8675p = colorStateList;
        if (this.f8674o != null) {
            Drawable drawable = this.f8677r;
            if (drawable != null) {
                drawable.setTintList(colorStateList);
                this.f8677r.invalidateSelf();
            }
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : C1325a.m3377b(getContext(), i));
    }

    public void setItemBackground(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        C1404o.m3522a((View) this, drawable);
    }

    public void setItemPosition(int i) {
        this.f8673n = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f8668i != i) {
            this.f8668i = i;
            if (this.f8674o != null) {
                setChecked(this.f8674o.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.f8669j != z) {
            this.f8669j = z;
            if (this.f8674o != null) {
                setChecked(this.f8674o.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        this.f8672m.setTextAppearance(i);
        mo9234a(this.f8671l.getTextSize(), this.f8672m.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        this.f8671l.setTextAppearance(i);
        mo9234a(this.f8671l.getTextSize(), this.f8672m.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f8671l.setTextColor(colorStateList);
            this.f8672m.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f8671l.setText(charSequence);
        this.f8672m.setText(charSequence);
        C1118i iVar = this.f8674o;
        if (iVar == null || TextUtils.isEmpty(iVar.f3120q)) {
            setContentDescription(charSequence);
        }
        C1118i iVar2 = this.f8674o;
        if (iVar2 != null && !TextUtils.isEmpty(iVar2.f3121r)) {
            charSequence = this.f8674o.f3121r;
        }
        C1061o.m2492a((View) this, charSequence);
    }
}
