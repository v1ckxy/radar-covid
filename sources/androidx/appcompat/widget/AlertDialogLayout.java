package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import p124p.p126b.C1023f;
import p124p.p126b.p136q.C1167f0;
import p124p.p126b.p136q.C1167f0.C1168a;
import p124p.p150h.p162l.C1404o;

public class AlertDialogLayout extends C1167f0 {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public static int m67a(View view) {
        int m = C1404o.m3552m(view);
        if (m > 0) {
            return m;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m67a(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            int r10 = r9.getPaddingLeft()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.getGravity()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L_0x0039
            r4 = 80
            if (r3 == r4) goto L_0x0030
            int r12 = r9.getPaddingTop()
            goto L_0x0043
        L_0x0030:
            int r3 = r9.getPaddingTop()
            int r3 = r3 + r14
            int r3 = r3 - r12
            int r12 = r3 - r0
            goto L_0x0043
        L_0x0039:
            int r3 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r14 + r3
        L_0x0043:
            android.graphics.drawable.Drawable r14 = r9.getDividerDrawable()
            r0 = 0
            if (r14 != 0) goto L_0x004c
            r14 = r0
            goto L_0x0050
        L_0x004c:
            int r14 = r14.getIntrinsicHeight()
        L_0x0050:
            if (r0 >= r1) goto L_0x00ad
            android.view.View r3 = r9.getChildAt(r0)
            if (r3 == 0) goto L_0x00aa
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto L_0x00aa
            int r4 = r3.getMeasuredWidth()
            int r5 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            p.b.q.f0$a r6 = (p124p.p126b.p136q.C1167f0.C1168a) r6
            int r7 = r6.f3279b
            if (r7 >= 0) goto L_0x0073
            r7 = r2
        L_0x0073:
            int r8 = p124p.p150h.p162l.C1404o.m3551l(r9)
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L_0x008a
            r8 = 5
            if (r7 == r8) goto L_0x0087
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L_0x0095
        L_0x0087:
            int r7 = r11 - r4
            goto L_0x0092
        L_0x008a:
            int r7 = r13 - r4
            int r7 = r7 / 2
            int r7 = r7 + r10
            int r8 = r6.leftMargin
            int r7 = r7 + r8
        L_0x0092:
            int r8 = r6.rightMargin
            int r7 = r7 - r8
        L_0x0095:
            boolean r8 = r9.mo5122a(r0)
            if (r8 == 0) goto L_0x009c
            int r12 = r12 + r14
        L_0x009c:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r5 + r12
            r3.layout(r7, r12, r4, r8)
            int r3 = r6.bottomMargin
            int r5 = r5 + r3
            int r5 = r5 + r12
            r12 = r5
        L_0x00aa:
            int r0 = r0 + 1
            goto L_0x0050
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int childCount = getChildCount();
        View view = null;
        boolean z = false;
        View view2 = null;
        View view3 = null;
        int i8 = 0;
        while (true) {
            if (i8 < childCount) {
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8) {
                    int id = childAt.getId();
                    if (id == C1023f.topPanel) {
                        view = childAt;
                    } else if (id == C1023f.buttonPanel) {
                        view2 = childAt;
                    } else if ((id == C1023f.contentPanel || id == C1023f.customPanel) && view3 == null) {
                        view3 = childAt;
                    }
                }
                i8++;
            } else {
                int mode = MeasureSpec.getMode(i2);
                int size = MeasureSpec.getSize(i2);
                int mode2 = MeasureSpec.getMode(i);
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                if (view != null) {
                    view.measure(i7, 0);
                    paddingBottom += view.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(0, view.getMeasuredState());
                } else {
                    i3 = 0;
                }
                if (view2 != null) {
                    view2.measure(i7, 0);
                    i5 = m67a(view2);
                    i4 = view2.getMeasuredHeight() - i5;
                    paddingBottom += i5;
                    i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (view3 != null) {
                    view3.measure(i7, mode == 0 ? 0 : MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
                    i6 = view3.getMeasuredHeight();
                    paddingBottom += i6;
                    i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
                } else {
                    i6 = 0;
                }
                int i9 = size - paddingBottom;
                if (view2 != null) {
                    int i10 = paddingBottom - i5;
                    int min = Math.min(i9, i4);
                    if (min > 0) {
                        i9 -= min;
                        i5 += min;
                    }
                    view2.measure(i7, MeasureSpec.makeMeasureSpec(i5, 1073741824));
                    paddingBottom = i10 + view2.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
                }
                if (view3 != null && i9 > 0) {
                    int i11 = paddingBottom - i6;
                    view3.measure(i7, MeasureSpec.makeMeasureSpec(i6 + i9, mode));
                    paddingBottom = i11 + view3.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
                }
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2.getVisibility() != 8) {
                        i12 = Math.max(i12, childAt2.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i12, i7, i3), View.resolveSizeAndState(paddingBottom, i2, 0));
                if (mode2 != 1073741824) {
                    int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt3 = getChildAt(i14);
                        if (childAt3.getVisibility() != 8) {
                            C1168a aVar = (C1168a) childAt3.getLayoutParams();
                            if (aVar.width == -1) {
                                int i15 = aVar.height;
                                aVar.height = childAt3.getMeasuredHeight();
                                measureChildWithMargins(childAt3, makeMeasureSpec, 0, i2, 0);
                                aVar.height = i15;
                            }
                        }
                    }
                }
                z = true;
            }
        }
        int i16 = i2;
        if (!z) {
            super.onMeasure(i, i2);
        }
    }
}
