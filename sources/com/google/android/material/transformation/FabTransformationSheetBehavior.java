package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0071f;
import java.util.HashMap;
import java.util.Map;
import p124p.p150h.p162l.C1404o;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    public Map<View, Integer> f1455i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo2318a(View view, View view2, boolean z, boolean z2) {
        int i;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f1455i = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                boolean z3 = (childAt.getLayoutParams() instanceof C0071f) && (((C0071f) childAt.getLayoutParams()).f519a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    Map<View, Integer> map = this.f1455i;
                    if (z) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        i = 4;
                    } else if (map != null && map.containsKey(childAt)) {
                        i = ((Integer) this.f1455i.get(childAt)).intValue();
                    }
                    C1404o.m3545f(childAt, i);
                }
            }
            if (!z) {
                this.f1455i = null;
            }
        }
        super.mo2318a(view, view2, z, z2);
        return true;
    }
}
