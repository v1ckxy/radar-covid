package com.google.android.material.floatingactionbutton;

import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0067b;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0068c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0071f;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import p124p.p150h.p162l.C1404o;
import p213q.p217b.p218a.p271c.C3406l;
import p213q.p217b.p218a.p271c.p272a0.C3277a;
import p213q.p217b.p218a.p271c.p272a0.C3293i;
import p213q.p217b.p218a.p271c.p273b0.C3297c;
import p213q.p217b.p218a.p271c.p283m.C3413g;

public class ExtendedFloatingActionButton extends MaterialButton implements C0067b {

    /* renamed from: A */
    public boolean f1310A;

    /* renamed from: v */
    public final Rect f1311v;

    /* renamed from: w */
    public final C3293i f1312w;

    /* renamed from: x */
    public final C3293i f1313x;

    /* renamed from: y */
    public final C3293i f1314y;

    /* renamed from: z */
    public final C3293i f1315z;

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends C0068c<T> {

        /* renamed from: a */
        public Rect f1316a;

        /* renamed from: b */
        public boolean f1317b;

        /* renamed from: c */
        public boolean f1318c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f1317b = false;
            this.f1318c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3406l.ExtendedFloatingActionButton_Behavior_Layout);
            this.f1317b = obtainStyledAttributes.getBoolean(C3406l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f1318c = obtainStyledAttributes.getBoolean(C3406l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo652a(C0071f fVar) {
            if (fVar.f526h == 0) {
                fVar.f526h = 80;
            }
        }

        /* renamed from: a */
        public boolean mo660a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            Rect rect2 = extendedFloatingActionButton.f1311v;
            rect.set(extendedFloatingActionButton.getLeft() + rect2.left, extendedFloatingActionButton.getTop() + rect2.top, extendedFloatingActionButton.getRight() - rect2.right, extendedFloatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: b */
        public boolean mo668b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                mo2050a(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof C0071f ? ((C0071f) layoutParams).f519a instanceof BottomSheetBehavior : false) {
                    mo2051b(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo658a(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List a = coordinatorLayout.mo595a((View) extendedFloatingActionButton);
            int size = a.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) a.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof C0071f ? ((C0071f) layoutParams).f519a instanceof BottomSheetBehavior : false) && mo2051b(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (mo2050a(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo607b(extendedFloatingActionButton, i);
            Rect rect = extendedFloatingActionButton.f1311v;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                C0071f fVar = (C0071f) extendedFloatingActionButton.getLayoutParams();
                int i4 = extendedFloatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin ? rect.right : extendedFloatingActionButton.getLeft() <= fVar.leftMargin ? -rect.left : 0;
                if (extendedFloatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                    i2 = rect.bottom;
                } else if (extendedFloatingActionButton.getTop() <= fVar.topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    C1404o.m3539c(extendedFloatingActionButton, i2);
                }
                if (i4 != 0) {
                    C1404o.m3535b((View) extendedFloatingActionButton, i4);
                }
            }
            return true;
        }

        /* renamed from: b */
        public final boolean mo2051b(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            C3293i iVar;
            C3293i iVar2;
            if (!mo2049a(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((C0071f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                if (this.f1318c) {
                    iVar2 = extendedFloatingActionButton.f1312w;
                } else {
                    iVar2 = extendedFloatingActionButton.f1315z;
                }
                ExtendedFloatingActionButton.m1050a(extendedFloatingActionButton, iVar2);
            } else {
                if (this.f1318c) {
                    iVar = extendedFloatingActionButton.f1313x;
                } else {
                    iVar = extendedFloatingActionButton.f1314y;
                }
                ExtendedFloatingActionButton.m1050a(extendedFloatingActionButton, iVar);
            }
            return true;
        }

        /* renamed from: a */
        public final boolean mo2049a(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            C0071f fVar = (C0071f) extendedFloatingActionButton.getLayoutParams();
            if ((this.f1317b || this.f1318c) && fVar.f524f == view.getId()) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo2050a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            C3293i iVar;
            C3293i iVar2;
            if (!mo2049a(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f1316a == null) {
                this.f1316a = new Rect();
            }
            Rect rect = this.f1316a;
            C3297c.m7673a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                if (this.f1318c) {
                    iVar2 = extendedFloatingActionButton.f1312w;
                } else {
                    iVar2 = extendedFloatingActionButton.f1315z;
                }
                ExtendedFloatingActionButton.m1050a(extendedFloatingActionButton, iVar2);
            } else {
                if (this.f1318c) {
                    iVar = extendedFloatingActionButton.f1313x;
                } else {
                    iVar = extendedFloatingActionButton.f1314y;
                }
                ExtendedFloatingActionButton.m1050a(extendedFloatingActionButton, iVar);
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    public static class C0234a extends Property<View, Float> {
        public C0234a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().width);
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            Float f = (Float) obj2;
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    public static class C0235b extends Property<View, Float> {
        public C0235b(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().height);
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            Float f = (Float) obj2;
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    public static abstract class C0236c {
    }

    static {
        Class<Float> cls = Float.class;
        new C0234a(cls, "width");
        new C0235b(cls, "height");
    }

    /* renamed from: a */
    public static /* synthetic */ void m1050a(ExtendedFloatingActionButton extendedFloatingActionButton, C3293i iVar) {
        if (extendedFloatingActionButton == null) {
            throw null;
        } else if (!iVar.mo8992f()) {
            if (!(C1404o.m3563x(extendedFloatingActionButton) && !extendedFloatingActionButton.isInEditMode())) {
                iVar.mo8989c();
                iVar.mo8987a(null);
                return;
            }
            extendedFloatingActionButton.measure(0, 0);
            AnimatorSet d = iVar.mo8990d();
            d.addListener(new C3277a(extendedFloatingActionButton, iVar));
            for (AnimatorListener addListener : iVar.mo8991e()) {
                d.addListener(addListener);
            }
            d.start();
        }
    }

    public C0068c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedSize() {
        return getIconSize() + (Math.min(C1404o.m3555p(this), getPaddingEnd()) * 2);
    }

    public C3413g getExtendMotionSpec() {
        throw null;
    }

    public C3413g getHideMotionSpec() {
        throw null;
    }

    public C3413g getShowMotionSpec() {
        throw null;
    }

    public C3413g getShrinkMotionSpec() {
        throw null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1310A && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f1310A = false;
            throw null;
        }
    }

    public void setExtendMotionSpec(C3413g gVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C3413g.m7807a(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f1310A != z) {
            C3293i iVar = null;
            if (!iVar.mo8992f()) {
                iVar.mo8989c();
            }
        }
    }

    public void setHideMotionSpec(C3413g gVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C3413g.m7807a(getContext(), i));
    }

    public void setShowMotionSpec(C3413g gVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C3413g.m7807a(getContext(), i));
    }

    public void setShrinkMotionSpec(C3413g gVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C3413g.m7807a(getContext(), i));
    }
}
