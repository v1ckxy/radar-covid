package p124p.p126b.p136q;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import p124p.p126b.C1027j;
import p124p.p126b.p128l.p129a.C1070a;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.b.q.f0 */
public class C1167f0 extends ViewGroup {

    /* renamed from: e */
    public boolean f3263e;

    /* renamed from: f */
    public int f3264f;

    /* renamed from: g */
    public int f3265g;

    /* renamed from: h */
    public int f3266h;

    /* renamed from: i */
    public int f3267i;

    /* renamed from: j */
    public int f3268j;

    /* renamed from: k */
    public float f3269k;

    /* renamed from: l */
    public boolean f3270l;

    /* renamed from: m */
    public int[] f3271m;

    /* renamed from: n */
    public int[] f3272n;

    /* renamed from: o */
    public Drawable f3273o;

    /* renamed from: p */
    public int f3274p;

    /* renamed from: q */
    public int f3275q;

    /* renamed from: r */
    public int f3276r;

    /* renamed from: s */
    public int f3277s;

    /* renamed from: p.b.q.f0$a */
    public static class C1168a extends MarginLayoutParams {

        /* renamed from: a */
        public float f3278a;

        /* renamed from: b */
        public int f3279b;

        public C1168a(int i, int i2) {
            super(i, i2);
            this.f3279b = -1;
            this.f3278a = 0.0f;
        }

        public C1168a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3279b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1027j.LinearLayoutCompat_Layout);
            this.f3278a = obtainStyledAttributes.getFloat(C1027j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f3279b = obtainStyledAttributes.getInt(C1027j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public C1168a(LayoutParams layoutParams) {
            super(layoutParams);
            this.f3279b = -1;
        }
    }

    public C1167f0(Context context) {
        this(context, null);
    }

    public C1167f0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1167f0(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        super(context, attributeSet, i);
        this.f3263e = true;
        this.f3264f = -1;
        this.f3265g = 0;
        this.f3267i = 8388659;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1027j.LinearLayoutCompat, i, 0);
        int i2 = obtainStyledAttributes.getInt(C1027j.LinearLayoutCompat_android_orientation, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = obtainStyledAttributes.getInt(C1027j.LinearLayoutCompat_android_gravity, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = obtainStyledAttributes.getBoolean(C1027j.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f3269k = obtainStyledAttributes.getFloat(C1027j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f3264f = obtainStyledAttributes.getInt(C1027j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f3270l = obtainStyledAttributes.getBoolean(C1027j.LinearLayoutCompat_measureWithLargestChild, false);
        int i4 = C1027j.LinearLayoutCompat_divider;
        if (obtainStyledAttributes.hasValue(i4)) {
            int resourceId = obtainStyledAttributes.getResourceId(i4, 0);
            if (resourceId != 0) {
                drawable = C1070a.m2602b(context, resourceId);
                setDividerDrawable(drawable);
                this.f3276r = obtainStyledAttributes.getInt(C1027j.LinearLayoutCompat_showDividers, 0);
                this.f3277s = obtainStyledAttributes.getDimensionPixelSize(C1027j.LinearLayoutCompat_dividerPadding, 0);
                obtainStyledAttributes.recycle();
            }
        }
        drawable = obtainStyledAttributes.getDrawable(i4);
        setDividerDrawable(drawable);
        this.f3276r = obtainStyledAttributes.getInt(C1027j.LinearLayoutCompat_showDividers, 0);
        this.f3277s = obtainStyledAttributes.getDimensionPixelSize(C1027j.LinearLayoutCompat_dividerPadding, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public void mo5121a(Canvas canvas, int i) {
        this.f3273o.setBounds(getPaddingLeft() + this.f3277s, i, (getWidth() - getPaddingRight()) - this.f3277s, this.f3275q + i);
        this.f3273o.draw(canvas);
    }

    /* renamed from: a */
    public boolean mo5122a(int i) {
        boolean z = false;
        if (i == 0) {
            if ((this.f3276r & 1) != 0) {
                z = true;
            }
            return z;
        } else if (i == getChildCount()) {
            if ((this.f3276r & 4) != 0) {
                z = true;
            }
            return z;
        } else {
            if ((this.f3276r & 2) != 0) {
                int i2 = i - 1;
                while (true) {
                    if (i2 < 0) {
                        break;
                    } else if (getChildAt(i2).getVisibility() != 8) {
                        z = true;
                        break;
                    } else {
                        i2--;
                    }
                }
            }
            return z;
        }
    }

    /* renamed from: b */
    public void mo5123b(Canvas canvas, int i) {
        this.f3273o.setBounds(i, getPaddingTop() + this.f3277s, this.f3274p + i, (getHeight() - getPaddingBottom()) - this.f3277s);
        this.f3273o.draw(canvas);
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C1168a;
    }

    public C1168a generateDefaultLayoutParams() {
        int i = this.f3266h;
        if (i == 0) {
            return new C1168a(-2, -2);
        }
        if (i == 1) {
            return new C1168a(-1, -2);
        }
        return null;
    }

    public C1168a generateLayoutParams(AttributeSet attributeSet) {
        return new C1168a(getContext(), attributeSet);
    }

    public C1168a generateLayoutParams(LayoutParams layoutParams) {
        return new C1168a(layoutParams);
    }

    public int getBaseline() {
        if (this.f3264f < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i = this.f3264f;
        if (childCount > i) {
            View childAt = getChildAt(i);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i2 = this.f3265g;
                if (this.f3266h == 1) {
                    int i3 = this.f3267i & 112;
                    if (i3 != 48) {
                        if (i3 == 16) {
                            i2 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f3268j) / 2;
                        } else if (i3 == 80) {
                            i2 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f3268j;
                        }
                    }
                }
                return i2 + ((C1168a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f3264f == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f3264f;
    }

    public Drawable getDividerDrawable() {
        return this.f3273o;
    }

    public int getDividerPadding() {
        return this.f3277s;
    }

    public int getDividerWidth() {
        return this.f3274p;
    }

    public int getGravity() {
        return this.f3267i;
    }

    public int getOrientation() {
        return this.f3266h;
    }

    public int getShowDividers() {
        return this.f3276r;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f3269k;
    }

    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        if (this.f3273o != null) {
            int i4 = 0;
            if (this.f3266h == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i4 < virtualChildCount) {
                    View childAt = getChildAt(i4);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !mo5122a(i4))) {
                        mo5121a(canvas, (childAt.getTop() - ((C1168a) childAt.getLayoutParams()).topMargin) - this.f3275q);
                    }
                    i4++;
                }
                if (mo5122a(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    mo5121a(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f3275q : childAt2.getBottom() + ((C1168a) childAt2.getLayoutParams()).bottomMargin);
                }
            } else {
                int virtualChildCount2 = getVirtualChildCount();
                boolean a = C1143a1.m2887a(this);
                while (i4 < virtualChildCount2) {
                    View childAt3 = getChildAt(i4);
                    if (!(childAt3 == null || childAt3.getVisibility() == 8 || !mo5122a(i4))) {
                        C1168a aVar = (C1168a) childAt3.getLayoutParams();
                        mo5123b(canvas, a ? childAt3.getRight() + aVar.rightMargin : (childAt3.getLeft() - aVar.leftMargin) - this.f3274p);
                    }
                    i4++;
                }
                if (mo5122a(virtualChildCount2)) {
                    View childAt4 = getChildAt(virtualChildCount2 - 1);
                    if (childAt4 != null) {
                        C1168a aVar2 = (C1168a) childAt4.getLayoutParams();
                        if (a) {
                            i3 = childAt4.getLeft();
                            i2 = aVar2.leftMargin;
                        } else {
                            i = childAt4.getRight() + aVar2.rightMargin;
                            mo5123b(canvas, i);
                        }
                    } else if (a) {
                        i = getPaddingLeft();
                        mo5123b(canvas, i);
                    } else {
                        i3 = getWidth();
                        i2 = getPaddingRight();
                    }
                    i = (i3 - i2) - this.f3274p;
                    mo5123b(canvas, i);
                }
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0196  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f3266h
            r2 = 80
            r3 = 16
            r4 = 8
            r5 = 5
            r6 = 8388615(0x800007, float:1.1754953E-38)
            r7 = 1
            if (r1 != r7) goto L_0x00b4
            int r1 = r17.getPaddingLeft()
            int r8 = r21 - r19
            int r9 = r17.getPaddingRight()
            int r9 = r8 - r9
            int r8 = r8 - r1
            int r10 = r17.getPaddingRight()
            int r8 = r8 - r10
            int r10 = r17.getVirtualChildCount()
            int r11 = r0.f3267i
            r12 = r11 & 112(0x70, float:1.57E-43)
            r6 = r6 & r11
            if (r12 == r3) goto L_0x0041
            if (r12 == r2) goto L_0x0035
            int r2 = r17.getPaddingTop()
            goto L_0x004d
        L_0x0035:
            int r2 = r17.getPaddingTop()
            int r2 = r2 + r22
            int r2 = r2 - r20
            int r3 = r0.f3268j
            int r2 = r2 - r3
            goto L_0x004d
        L_0x0041:
            int r2 = r17.getPaddingTop()
            int r3 = r22 - r20
            int r11 = r0.f3268j
            int r3 = r3 - r11
            int r3 = r3 / 2
            int r2 = r2 + r3
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 >= r10) goto L_0x01c5
            android.view.View r11 = r0.getChildAt(r3)
            if (r11 != 0) goto L_0x0059
            int r2 = r2 + 0
            goto L_0x00af
        L_0x0059:
            int r12 = r11.getVisibility()
            if (r12 == r4) goto L_0x00af
            int r4 = r11.getMeasuredWidth()
            int r12 = r11.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            p.b.q.f0$a r13 = (p124p.p126b.p136q.C1167f0.C1168a) r13
            int r14 = r13.f3279b
            if (r14 >= 0) goto L_0x0072
            r14 = r6
        L_0x0072:
            int r15 = p124p.p150h.p162l.C1404o.m3551l(r17)
            int r14 = android.view.Gravity.getAbsoluteGravity(r14, r15)
            r14 = r14 & 7
            if (r14 == r7) goto L_0x0087
            if (r14 == r5) goto L_0x0084
            int r5 = r13.leftMargin
            int r5 = r5 + r1
            goto L_0x0092
        L_0x0084:
            int r5 = r9 - r4
            goto L_0x008f
        L_0x0087:
            int r5 = r8 - r4
            int r5 = r5 / 2
            int r5 = r5 + r1
            int r14 = r13.leftMargin
            int r5 = r5 + r14
        L_0x008f:
            int r14 = r13.rightMargin
            int r5 = r5 - r14
        L_0x0092:
            boolean r14 = r0.mo5122a(r3)
            if (r14 == 0) goto L_0x009b
            int r14 = r0.f3275q
            int r2 = r2 + r14
        L_0x009b:
            int r14 = r13.topMargin
            int r2 = r2 + r14
            int r14 = r2 + 0
            int r4 = r4 + r5
            int r15 = r12 + r14
            r11.layout(r5, r14, r4, r15)
            int r4 = r13.bottomMargin
            r5 = 0
            int r2 = p213q.p214a.p215a.p216a.C1965a.m4742a(r12, r4, r5, r2)
            int r3 = r3 + 0
        L_0x00af:
            int r3 = r3 + r7
            r4 = 8
            r5 = 5
            goto L_0x004e
        L_0x00b4:
            boolean r1 = p124p.p126b.p136q.C1143a1.m2887a(r17)
            int r2 = r17.getPaddingTop()
            int r3 = r22 - r20
            int r4 = r17.getPaddingBottom()
            int r4 = r3 - r4
            int r3 = r3 - r2
            int r5 = r17.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r17.getVirtualChildCount()
            int r8 = r0.f3267i
            r6 = r6 & r8
            r8 = r8 & 112(0x70, float:1.57E-43)
            boolean r9 = r0.f3263e
            int[] r10 = r0.f3271m
            int[] r11 = r0.f3272n
            int r12 = r17.getLayoutDirection()
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r12)
            if (r6 == r7) goto L_0x00f7
            r12 = 5
            if (r6 == r12) goto L_0x00eb
            int r6 = r17.getPaddingLeft()
            goto L_0x0103
        L_0x00eb:
            int r6 = r17.getPaddingLeft()
            int r6 = r6 + r21
            int r6 = r6 - r19
            int r12 = r0.f3268j
            int r6 = r6 - r12
            goto L_0x0103
        L_0x00f7:
            int r6 = r17.getPaddingLeft()
            int r12 = r21 - r19
            int r13 = r0.f3268j
            int r12 = r12 - r13
            int r12 = r12 / 2
            int r6 = r6 + r12
        L_0x0103:
            if (r1 == 0) goto L_0x0109
            int r1 = r5 + -1
            r7 = -1
            goto L_0x010a
        L_0x0109:
            r1 = 0
        L_0x010a:
            r12 = 0
        L_0x010b:
            if (r12 >= r5) goto L_0x01c5
            int r13 = r7 * r12
            int r13 = r13 + r1
            android.view.View r14 = r0.getChildAt(r13)
            if (r14 != 0) goto L_0x011c
            int r6 = r6 + 0
            r18 = r1
            goto L_0x01af
        L_0x011c:
            int r15 = r14.getVisibility()
            r18 = r1
            r1 = 8
            if (r15 == r1) goto L_0x01af
            int r1 = r14.getMeasuredWidth()
            int r15 = r14.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r16 = r14.getLayoutParams()
            r20 = r5
            r5 = r16
            p.b.q.f0$a r5 = (p124p.p126b.p136q.C1167f0.C1168a) r5
            r19 = r7
            if (r9 == 0) goto L_0x0148
            int r7 = r5.height
            r22 = r8
            r8 = -1
            if (r7 == r8) goto L_0x014a
            int r7 = r14.getBaseline()
            goto L_0x014b
        L_0x0148:
            r22 = r8
        L_0x014a:
            r7 = -1
        L_0x014b:
            int r8 = r5.f3279b
            if (r8 >= 0) goto L_0x0151
            r8 = r22
        L_0x0151:
            r8 = r8 & 112(0x70, float:1.57E-43)
            r16 = r9
            r9 = 16
            if (r8 == r9) goto L_0x0184
            r9 = 48
            if (r8 == r9) goto L_0x0176
            r9 = 80
            if (r8 == r9) goto L_0x0163
            r8 = r2
            goto L_0x0190
        L_0x0163:
            int r8 = r4 - r15
            int r9 = r5.bottomMargin
            int r8 = r8 - r9
            r9 = -1
            if (r7 == r9) goto L_0x0190
            int r9 = r14.getMeasuredHeight()
            int r9 = r9 - r7
            r7 = 2
            r7 = r11[r7]
            int r7 = r7 - r9
            int r8 = r8 - r7
            goto L_0x0190
        L_0x0176:
            r8 = -1
            int r9 = r5.topMargin
            int r9 = r9 + r2
            if (r7 == r8) goto L_0x0182
            r8 = 1
            r8 = r10[r8]
            int r8 = r8 - r7
            int r8 = r8 + r9
            goto L_0x0190
        L_0x0182:
            r8 = r9
            goto L_0x0190
        L_0x0184:
            int r7 = r3 - r15
            int r7 = r7 / 2
            int r7 = r7 + r2
            int r8 = r5.topMargin
            int r7 = r7 + r8
            int r8 = r5.bottomMargin
            int r8 = r7 - r8
        L_0x0190:
            boolean r7 = r0.mo5122a(r13)
            if (r7 == 0) goto L_0x0199
            int r7 = r0.f3274p
            int r6 = r6 + r7
        L_0x0199:
            int r7 = r5.leftMargin
            int r6 = r6 + r7
            int r7 = r6 + 0
            int r9 = r1 + r7
            int r15 = r15 + r8
            r14.layout(r7, r8, r9, r15)
            int r5 = r5.rightMargin
            r7 = 0
            int r1 = p213q.p214a.p215a.p216a.C1965a.m4742a(r1, r5, r7, r6)
            int r12 = r12 + 0
            r6 = r1
            goto L_0x01b7
        L_0x01af:
            r20 = r5
            r19 = r7
            r22 = r8
            r16 = r9
        L_0x01b7:
            int r12 = r12 + 1
            r1 = r18
            r7 = r19
            r5 = r20
            r8 = r22
            r9 = r16
            goto L_0x010b
        L_0x01c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p136q.C1167f0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02a7, code lost:
        if (r8 > 0) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02af, code lost:
        if (r8 < 0) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0750, code lost:
        if (r5 > 0) goto L_0x075b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0758, code lost:
        if (r5 < 0) goto L_0x075a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04e3  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04f2  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x050f  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0537  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0569  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0578  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0583  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0612  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0668  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x06e4  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0703  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x07db  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x08a3  */
    /* JADX WARNING: Removed duplicated region for block: B:420:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r34, int r35) {
        /*
            r33 = this;
            r6 = r33
            r7 = r34
            r8 = r35
            int r0 = r6.f3266h
            r1 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 8
            r4 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            r9 = 1
            r10 = 0
            if (r0 != r9) goto L_0x039a
            r6.f3268j = r10
            int r11 = r33.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r34)
            int r13 = android.view.View.MeasureSpec.getMode(r35)
            int r14 = r6.f3264f
            boolean r15 = r6.f3270l
            r0 = r4
            r17 = r9
            r7 = r10
            r8 = r7
            r16 = r8
            r18 = r16
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r9 = r2
            r2 = r17
        L_0x003a:
            if (r7 >= r11) goto L_0x016d
            android.view.View r23 = r6.getChildAt(r7)
            if (r23 != 0) goto L_0x0049
            int r0 = r6.f3268j
            int r0 = r0 + r20
            r6.f3268j = r0
            goto L_0x0051
        L_0x0049:
            int r2 = r23.getVisibility()
            if (r2 != r3) goto L_0x0059
            int r7 = r7 + 0
        L_0x0051:
            r0 = 1
            r2 = r0
            r27 = r11
            r26 = r13
            goto L_0x015b
        L_0x0059:
            boolean r2 = r6.mo5122a(r7)
            if (r2 == 0) goto L_0x0066
            int r2 = r6.f3268j
            int r3 = r6.f3275q
            int r2 = r2 + r3
            r6.f3268j = r2
        L_0x0066:
            android.view.ViewGroup$LayoutParams r2 = r23.getLayoutParams()
            r3 = r2
            p.b.q.f0$a r3 = (p124p.p126b.p136q.C1167f0.C1168a) r3
            float r2 = r3.f3278a
            float r20 = r4 + r2
            if (r13 != r5) goto L_0x0092
            int r4 = r3.height
            if (r4 != 0) goto L_0x0092
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0092
            int r0 = r6.f3268j
            int r1 = r3.topMargin
            int r1 = r1 + r0
            int r2 = r3.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r6.f3268j = r0
            r21 = 1
            r0 = 1
            r27 = r11
            r26 = r13
            r13 = r3
            goto L_0x00e5
        L_0x0092:
            int r2 = r3.height
            if (r2 != 0) goto L_0x00a1
            float r2 = r3.f3278a
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00a1
            r3.height = r1
            r1 = 0
            r5 = r1
            goto L_0x00a2
        L_0x00a1:
            r5 = r9
        L_0x00a2:
            r4 = 0
            int r0 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00aa
            int r0 = r6.f3268j
            goto L_0x00ab
        L_0x00aa:
            r0 = 0
        L_0x00ab:
            r24 = r0
            r25 = 1
            r0 = r33
            r1 = r23
            r2 = r34
            r26 = r13
            r13 = r3
            r3 = r4
            r4 = r35
            r27 = r11
            r11 = r5
            r5 = r24
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            if (r11 == r9) goto L_0x00c7
            r13.height = r11
        L_0x00c7:
            int r0 = r23.getMeasuredHeight()
            int r1 = r6.f3268j
            int r2 = r1 + r0
            int r3 = r13.topMargin
            int r2 = r2 + r3
            int r3 = r13.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 + 0
            int r1 = java.lang.Math.max(r1, r2)
            r6.f3268j = r1
            if (r15 == 0) goto L_0x00e3
            int r8 = java.lang.Math.max(r0, r8)
        L_0x00e3:
            r0 = r25
        L_0x00e5:
            if (r14 < 0) goto L_0x00ef
            int r1 = r7 + 1
            if (r14 != r1) goto L_0x00ef
            int r1 = r6.f3268j
            r6.f3265g = r1
        L_0x00ef:
            if (r7 >= r14) goto L_0x0101
            float r1 = r13.f3278a
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x00f9
            goto L_0x0101
        L_0x00f9:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0101:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x010e
            int r1 = r13.width
            r2 = -1
            if (r1 != r2) goto L_0x010e
            r1 = r0
            r22 = r1
            goto L_0x010f
        L_0x010e:
            r1 = 0
        L_0x010f:
            int r2 = r13.leftMargin
            int r3 = r13.rightMargin
            int r2 = r2 + r3
            int r3 = r23.getMeasuredWidth()
            int r3 = r3 + r2
            int r4 = java.lang.Math.max(r10, r3)
            int r5 = r23.getMeasuredState()
            r9 = r19
            int r5 = android.view.View.combineMeasuredStates(r9, r5)
            if (r17 == 0) goto L_0x0130
            int r9 = r13.width
            r10 = -1
            if (r9 != r10) goto L_0x0130
            r9 = r0
            goto L_0x0131
        L_0x0130:
            r9 = 0
        L_0x0131:
            float r10 = r13.f3278a
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x0143
            if (r1 == 0) goto L_0x013b
            goto L_0x013c
        L_0x013b:
            r2 = r3
        L_0x013c:
            r11 = r16
            int r16 = java.lang.Math.max(r11, r2)
            goto L_0x0151
        L_0x0143:
            r11 = r16
            if (r1 == 0) goto L_0x0148
            goto L_0x0149
        L_0x0148:
            r2 = r3
        L_0x0149:
            r1 = r18
            int r18 = java.lang.Math.max(r1, r2)
            r16 = r11
        L_0x0151:
            int r7 = r7 + 0
            r2 = r0
            r10 = r4
            r19 = r5
            r17 = r9
            r4 = r20
        L_0x015b:
            int r7 = r7 + 1
            r20 = 0
            r1 = -2
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 8
            r0 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            r13 = r26
            r11 = r27
            goto L_0x003a
        L_0x016d:
            r27 = r11
            r26 = r13
            r11 = r16
            r1 = r18
            r9 = r19
            int r0 = r6.f3268j
            r7 = r27
            if (r0 <= 0) goto L_0x018a
            boolean r0 = r6.mo5122a(r7)
            if (r0 == 0) goto L_0x018a
            int r0 = r6.f3268j
            int r3 = r6.f3275q
            int r0 = r0 + r3
            r6.f3268j = r0
        L_0x018a:
            if (r15 == 0) goto L_0x01d1
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r26
            if (r3 == r0) goto L_0x0194
            if (r3 != 0) goto L_0x01d3
        L_0x0194:
            r0 = 0
            r6.f3268j = r0
            r5 = r0
        L_0x0198:
            if (r0 >= r7) goto L_0x01d3
            android.view.View r13 = r6.getChildAt(r0)
            if (r13 != 0) goto L_0x01a6
            int r13 = r6.f3268j
            int r13 = r13 + r5
            r16 = r0
            goto L_0x01c9
        L_0x01a6:
            int r5 = r13.getVisibility()
            r14 = 8
            if (r5 != r14) goto L_0x01b1
            int r0 = r0 + 0
            goto L_0x01cd
        L_0x01b1:
            android.view.ViewGroup$LayoutParams r5 = r13.getLayoutParams()
            p.b.q.f0$a r5 = (p124p.p126b.p136q.C1167f0.C1168a) r5
            int r13 = r6.f3268j
            int r14 = r13 + r8
            r16 = r0
            int r0 = r5.topMargin
            int r14 = r14 + r0
            int r0 = r5.bottomMargin
            int r14 = r14 + r0
            int r14 = r14 + 0
            int r13 = java.lang.Math.max(r13, r14)
        L_0x01c9:
            r6.f3268j = r13
            r0 = r16
        L_0x01cd:
            int r0 = r0 + 1
            r5 = 0
            goto L_0x0198
        L_0x01d1:
            r3 = r26
        L_0x01d3:
            int r0 = r6.f3268j
            int r5 = r33.getPaddingTop()
            int r13 = r33.getPaddingBottom()
            int r13 = r13 + r5
            int r13 = r13 + r0
            r6.f3268j = r13
            int r0 = r33.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r13, r0)
            r5 = 0
            r13 = r8
            r8 = r35
            int r0 = android.view.View.resolveSizeAndState(r0, r8, r5)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r0
            int r14 = r6.f3268j
            int r5 = r5 - r14
            if (r21 != 0) goto L_0x0244
            if (r5 == 0) goto L_0x0202
            r14 = 0
            int r14 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r14 <= 0) goto L_0x0202
            goto L_0x0244
        L_0x0202:
            int r1 = java.lang.Math.max(r1, r11)
            if (r15 == 0) goto L_0x023f
            r2 = 1073741824(0x40000000, float:2.0)
            if (r3 == r2) goto L_0x023f
            r2 = 0
        L_0x020d:
            if (r2 >= r7) goto L_0x023f
            android.view.View r3 = r6.getChildAt(r2)
            if (r3 == 0) goto L_0x023c
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x021e
            goto L_0x023c
        L_0x021e:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            p.b.q.f0$a r4 = (p124p.p126b.p136q.C1167f0.C1168a) r4
            float r4 = r4.f3278a
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x023c
            int r4 = r3.getMeasuredWidth()
            r5 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r5)
            r3.measure(r4, r5)
        L_0x023c:
            int r2 = r2 + 1
            goto L_0x020d
        L_0x023f:
            r5 = r34
            r13 = r9
            goto L_0x033a
        L_0x0244:
            float r11 = r6.f3269k
            r13 = 0
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 <= 0) goto L_0x024c
            r4 = r11
        L_0x024c:
            r11 = 0
            r6.f3268j = r11
            r13 = r9
            r9 = r1
            r1 = r10
            r10 = r17
        L_0x0254:
            if (r11 >= r7) goto L_0x0326
            android.view.View r14 = r6.getChildAt(r11)
            int r15 = r14.getVisibility()
            r16 = r2
            r2 = 8
            if (r15 != r2) goto L_0x026c
            r26 = r3
            r18 = r5
            r5 = r34
            goto L_0x031a
        L_0x026c:
            android.view.ViewGroup$LayoutParams r2 = r14.getLayoutParams()
            p.b.q.f0$a r2 = (p124p.p126b.p136q.C1167f0.C1168a) r2
            float r15 = r2.f3278a
            r17 = 0
            int r17 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r17 <= 0) goto L_0x02c8
            float r8 = (float) r5
            float r8 = r8 * r15
            float r8 = r8 / r4
            int r8 = (int) r8
            float r4 = r4 - r15
            int r5 = r5 - r8
            int r15 = r33.getPaddingLeft()
            int r17 = r33.getPaddingRight()
            int r17 = r17 + r15
            int r15 = r2.leftMargin
            int r17 = r17 + r15
            int r15 = r2.rightMargin
            int r15 = r17 + r15
            r17 = r4
            int r4 = r2.width
            r18 = r5
            r5 = r34
            int r4 = android.view.ViewGroup.getChildMeasureSpec(r5, r15, r4)
            int r15 = r2.height
            if (r15 != 0) goto L_0x02aa
            r15 = 1073741824(0x40000000, float:2.0)
            if (r3 == r15) goto L_0x02a7
            goto L_0x02aa
        L_0x02a7:
            if (r8 <= 0) goto L_0x02b1
            goto L_0x02b2
        L_0x02aa:
            int r15 = r14.getMeasuredHeight()
            int r8 = r8 + r15
            if (r8 >= 0) goto L_0x02b2
        L_0x02b1:
            r8 = 0
        L_0x02b2:
            r15 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r15)
            r14.measure(r4, r8)
            int r4 = r14.getMeasuredState()
            r4 = r4 & -256(0xffffffffffffff00, float:NaN)
            int r13 = android.view.View.combineMeasuredStates(r13, r4)
            r4 = r17
            goto L_0x02cd
        L_0x02c8:
            r8 = r5
            r5 = r34
            r18 = r8
        L_0x02cd:
            int r8 = r2.leftMargin
            int r15 = r2.rightMargin
            int r8 = r8 + r15
            int r15 = r14.getMeasuredWidth()
            int r15 = r15 + r8
            int r1 = java.lang.Math.max(r1, r15)
            r17 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x02eb
            int r1 = r2.width
            r26 = r3
            r3 = -1
            if (r1 != r3) goto L_0x02ee
            r1 = r16
            goto L_0x02ef
        L_0x02eb:
            r26 = r3
            r3 = -1
        L_0x02ee:
            r1 = 0
        L_0x02ef:
            if (r1 == 0) goto L_0x02f2
            goto L_0x02f3
        L_0x02f2:
            r8 = r15
        L_0x02f3:
            int r1 = java.lang.Math.max(r9, r8)
            if (r10 == 0) goto L_0x0300
            int r8 = r2.width
            if (r8 != r3) goto L_0x0300
            r3 = r16
            goto L_0x0301
        L_0x0300:
            r3 = 0
        L_0x0301:
            int r8 = r6.f3268j
            int r9 = r14.getMeasuredHeight()
            int r9 = r9 + r8
            int r10 = r2.topMargin
            int r9 = r9 + r10
            int r2 = r2.bottomMargin
            int r9 = r9 + r2
            int r9 = r9 + 0
            int r2 = java.lang.Math.max(r8, r9)
            r6.f3268j = r2
            r9 = r1
            r10 = r3
            r1 = r17
        L_0x031a:
            int r11 = r11 + 1
            r8 = r35
            r2 = r16
            r5 = r18
            r3 = r26
            goto L_0x0254
        L_0x0326:
            r5 = r34
            int r2 = r6.f3268j
            int r3 = r33.getPaddingTop()
            int r4 = r33.getPaddingBottom()
            int r4 = r4 + r3
            int r4 = r4 + r2
            r6.f3268j = r4
            r17 = r10
            r10 = r1
            r1 = r9
        L_0x033a:
            if (r17 != 0) goto L_0x0341
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x0341
            goto L_0x0342
        L_0x0341:
            r1 = r10
        L_0x0342:
            int r2 = r33.getPaddingLeft()
            int r3 = r33.getPaddingRight()
            int r3 = r3 + r2
            int r3 = r3 + r1
            int r1 = r33.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r3, r1)
            int r1 = android.view.View.resolveSizeAndState(r1, r5, r13)
            r6.setMeasuredDimension(r1, r0)
            if (r22 == 0) goto L_0x08e6
            int r0 = r33.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r0 = 0
            r9 = r0
        L_0x0369:
            if (r9 >= r7) goto L_0x08e6
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x0397
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r10 = r0
            p.b.q.f0$a r10 = (p124p.p126b.p136q.C1167f0.C1168a) r10
            int r0 = r10.width
            r2 = -1
            if (r0 != r2) goto L_0x0397
            int r11 = r10.height
            int r0 = r1.getMeasuredHeight()
            r10.height = r0
            r3 = 0
            r5 = 0
            r0 = r33
            r2 = r8
            r4 = r35
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r10.height = r11
        L_0x0397:
            int r9 = r9 + 1
            goto L_0x0369
        L_0x039a:
            r5 = r7
            r6.f3268j = r10
            int r7 = r33.getVirtualChildCount()
            int r8 = android.view.View.MeasureSpec.getMode(r34)
            int r10 = android.view.View.MeasureSpec.getMode(r35)
            int[] r0 = r6.f3271m
            r1 = 4
            if (r0 == 0) goto L_0x03b2
            int[] r0 = r6.f3272n
            if (r0 != 0) goto L_0x03ba
        L_0x03b2:
            int[] r0 = new int[r1]
            r6.f3271m = r0
            int[] r0 = new int[r1]
            r6.f3272n = r0
        L_0x03ba:
            int[] r11 = r6.f3271m
            int[] r12 = r6.f3272n
            r0 = 3
            r1 = -1
            r11[r0] = r1
            r13 = 2
            r11[r13] = r1
            r11[r9] = r1
            r2 = 0
            r11[r2] = r1
            r12[r0] = r1
            r12[r13] = r1
            r12[r9] = r1
            r12[r2] = r1
            boolean r14 = r6.f3263e
            boolean r15 = r6.f3270l
            r0 = 1073741824(0x40000000, float:2.0)
            if (r8 != r0) goto L_0x03dd
            r16 = r9
            goto L_0x03e0
        L_0x03dd:
            r0 = 0
            r16 = r0
        L_0x03e0:
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r13 = r17
            r21 = r20
            r20 = r19
            r19 = r9
            r9 = r18
            r31 = r4
            r4 = r0
            r0 = r31
            r32 = r3
            r3 = r2
            r2 = r32
        L_0x0401:
            if (r2 >= r7) goto L_0x05a2
            android.view.View r5 = r6.getChildAt(r2)
            if (r5 != 0) goto L_0x0414
            int r5 = r6.f3268j
            int r5 = r5 + 0
            r6.f3268j = r5
            r22 = r0
            r23 = r3
            goto L_0x0422
        L_0x0414:
            r22 = r0
            int r0 = r5.getVisibility()
            r23 = r3
            r3 = 8
            if (r0 != r3) goto L_0x042c
            int r2 = r2 + 0
        L_0x0422:
            r0 = r22
            r3 = r23
            r23 = r7
            r22 = r8
            goto L_0x0598
        L_0x042c:
            boolean r0 = r6.mo5122a(r2)
            if (r0 == 0) goto L_0x0439
            int r0 = r6.f3268j
            int r3 = r6.f3274p
            int r0 = r0 + r3
            r6.f3268j = r0
        L_0x0439:
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            r3 = r0
            p.b.q.f0$a r3 = (p124p.p126b.p136q.C1167f0.C1168a) r3
            float r0 = r3.f3278a
            float r24 = r1 + r0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r8 != r1) goto L_0x049d
            int r1 = r3.width
            if (r1 != 0) goto L_0x049d
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x049d
            if (r16 == 0) goto L_0x0460
            int r0 = r6.f3268j
            int r1 = r3.leftMargin
            r25 = r2
            int r2 = r3.rightMargin
            int r1 = r1 + r2
            int r1 = r1 + r0
            r6.f3268j = r1
            goto L_0x0470
        L_0x0460:
            r25 = r2
            int r0 = r6.f3268j
            int r1 = r3.leftMargin
            int r1 = r1 + r0
            int r2 = r3.rightMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r6.f3268j = r0
        L_0x0470:
            if (r14 == 0) goto L_0x048a
            r0 = 0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r5.measure(r0, r0)
            r0 = r3
            r26 = r5
            r29 = r23
            r23 = r7
            r7 = r4
            r31 = r22
            r22 = r8
            r8 = r31
            goto L_0x0514
        L_0x048a:
            r0 = 1073741824(0x40000000, float:2.0)
            r2 = r0
            r0 = r3
            r26 = r5
            r1 = r22
            r29 = r23
            r20 = 1
            r23 = r7
            r22 = r8
            r7 = r4
            goto L_0x0517
        L_0x049d:
            r25 = r2
            int r0 = r3.width
            if (r0 != 0) goto L_0x04af
            float r0 = r3.f3278a
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x04b0
            r0 = -2
            r3.width = r0
            r0 = 0
            goto L_0x04b2
        L_0x04af:
            r1 = 0
        L_0x04b0:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x04b2:
            r2 = r0
            int r0 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x04ba
            int r0 = r6.f3268j
            goto L_0x04bb
        L_0x04ba:
            r0 = 0
        L_0x04bb:
            r26 = r0
            r27 = 0
            r1 = r22
            r0 = r33
            r22 = r8
            r8 = r1
            r1 = r5
            r28 = r2
            r2 = r34
            r30 = r3
            r29 = r23
            r3 = r26
            r23 = r7
            r7 = r4
            r4 = r35
            r26 = r5
            r5 = r27
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r28
            if (r1 == r0) goto L_0x04e8
            r0 = r30
            r0.width = r1
            goto L_0x04ea
        L_0x04e8:
            r0 = r30
        L_0x04ea:
            int r1 = r26.getMeasuredWidth()
            int r2 = r6.f3268j
            if (r16 == 0) goto L_0x04fd
            int r3 = r0.leftMargin
            int r3 = r3 + r1
            int r4 = r0.rightMargin
            r5 = 0
            int r2 = p213q.p214a.p215a.p216a.C1965a.m4742a(r3, r4, r5, r2)
            goto L_0x050b
        L_0x04fd:
            int r3 = r2 + r1
            int r4 = r0.leftMargin
            int r3 = r3 + r4
            int r4 = r0.rightMargin
            int r3 = r3 + r4
            int r3 = r3 + 0
            int r2 = java.lang.Math.max(r2, r3)
        L_0x050b:
            r6.f3268j = r2
            if (r15 == 0) goto L_0x0514
            int r1 = java.lang.Math.max(r1, r8)
            goto L_0x0515
        L_0x0514:
            r1 = r8
        L_0x0515:
            r2 = 1073741824(0x40000000, float:2.0)
        L_0x0517:
            if (r10 == r2) goto L_0x0522
            int r2 = r0.height
            r3 = -1
            if (r2 != r3) goto L_0x0522
            r2 = 1
            r21 = 1
            goto L_0x0523
        L_0x0522:
            r2 = 0
        L_0x0523:
            int r3 = r0.topMargin
            int r4 = r0.bottomMargin
            int r3 = r3 + r4
            int r4 = r26.getMeasuredHeight()
            int r4 = r4 + r3
            int r5 = r26.getMeasuredState()
            int r5 = android.view.View.combineMeasuredStates(r13, r5)
            if (r14 == 0) goto L_0x0561
            int r8 = r26.getBaseline()
            r13 = -1
            if (r8 == r13) goto L_0x0561
            int r13 = r0.f3279b
            if (r13 >= 0) goto L_0x0544
            int r13 = r6.f3267i
        L_0x0544:
            r13 = r13 & 112(0x70, float:1.57E-43)
            int r13 = r13 >> 4
            r13 = r13 & -2
            int r13 = r13 >> 1
            r26 = r1
            r1 = r11[r13]
            int r1 = java.lang.Math.max(r1, r8)
            r11[r13] = r1
            r1 = r12[r13]
            int r8 = r4 - r8
            int r1 = java.lang.Math.max(r1, r8)
            r12[r13] = r1
            goto L_0x0563
        L_0x0561:
            r26 = r1
        L_0x0563:
            int r1 = java.lang.Math.max(r9, r4)
            if (r19 == 0) goto L_0x0570
            int r8 = r0.height
            r9 = -1
            if (r8 != r9) goto L_0x0570
            r8 = 1
            goto L_0x0571
        L_0x0570:
            r8 = 0
        L_0x0571:
            float r0 = r0.f3278a
            r9 = 0
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0583
            if (r2 == 0) goto L_0x057b
            goto L_0x057c
        L_0x057b:
            r3 = r4
        L_0x057c:
            int r4 = java.lang.Math.max(r7, r3)
            r3 = r29
            goto L_0x058e
        L_0x0583:
            if (r2 == 0) goto L_0x0586
            goto L_0x0587
        L_0x0586:
            r3 = r4
        L_0x0587:
            r2 = r29
            int r3 = java.lang.Math.max(r2, r3)
            r4 = r7
        L_0x058e:
            int r2 = r25 + 0
            r9 = r1
            r13 = r5
            r19 = r8
            r1 = r24
            r0 = r26
        L_0x0598:
            int r2 = r2 + 1
            r5 = r34
            r8 = r22
            r7 = r23
            goto L_0x0401
        L_0x05a2:
            r2 = r3
            r23 = r7
            r22 = r8
            r8 = r0
            r7 = r4
            int r0 = r6.f3268j
            r5 = r23
            if (r0 <= 0) goto L_0x05bc
            boolean r0 = r6.mo5122a(r5)
            if (r0 == 0) goto L_0x05bc
            int r0 = r6.f3268j
            int r3 = r6.f3274p
            int r0 = r0 + r3
            r6.f3268j = r0
        L_0x05bc:
            r0 = 1
            r3 = r11[r0]
            r0 = -1
            if (r3 != r0) goto L_0x05d7
            r3 = 0
            r3 = r11[r3]
            if (r3 != r0) goto L_0x05d7
            r3 = 2
            r4 = r11[r3]
            if (r4 != r0) goto L_0x05d7
            r3 = 3
            r4 = r11[r3]
            if (r4 == r0) goto L_0x05d2
            goto L_0x05d8
        L_0x05d2:
            r23 = r13
            r24 = r14
            goto L_0x0610
        L_0x05d7:
            r3 = 3
        L_0x05d8:
            r0 = r11[r3]
            r3 = 0
            r3 = r11[r3]
            r23 = r13
            r4 = 1
            r13 = r11[r4]
            r17 = 2
            r4 = r11[r17]
            int r4 = java.lang.Math.max(r13, r4)
            int r3 = java.lang.Math.max(r3, r4)
            int r0 = java.lang.Math.max(r0, r3)
            r3 = 3
            r3 = r12[r3]
            r4 = 0
            r4 = r12[r4]
            r24 = r14
            r13 = 1
            r14 = r12[r13]
            r13 = r12[r17]
            int r13 = java.lang.Math.max(r14, r13)
            int r4 = java.lang.Math.max(r4, r13)
            int r3 = java.lang.Math.max(r3, r4)
            int r3 = r3 + r0
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0610:
            if (r15 == 0) goto L_0x0668
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r22
            if (r3 == r0) goto L_0x061a
            if (r3 != 0) goto L_0x066a
        L_0x061a:
            r0 = 0
            r6.f3268j = r0
            r4 = r0
        L_0x061e:
            if (r0 >= r5) goto L_0x066a
            android.view.View r13 = r6.getChildAt(r0)
            if (r13 != 0) goto L_0x062c
            int r13 = r6.f3268j
            int r13 = r13 + r4
            r22 = r0
            goto L_0x0660
        L_0x062c:
            int r4 = r13.getVisibility()
            r14 = 8
            if (r4 != r14) goto L_0x0637
            int r0 = r0 + 0
            goto L_0x0664
        L_0x0637:
            android.view.ViewGroup$LayoutParams r4 = r13.getLayoutParams()
            p.b.q.f0$a r4 = (p124p.p126b.p136q.C1167f0.C1168a) r4
            int r13 = r6.f3268j
            if (r16 == 0) goto L_0x0650
            int r14 = r4.leftMargin
            int r14 = r14 + r8
            int r4 = r4.rightMargin
            r22 = r0
            r0 = 0
            int r0 = p213q.p214a.p215a.p216a.C1965a.m4742a(r14, r4, r0, r13)
            r6.f3268j = r0
            goto L_0x0662
        L_0x0650:
            r22 = r0
            int r0 = r13 + r8
            int r14 = r4.leftMargin
            int r0 = r0 + r14
            int r4 = r4.rightMargin
            int r0 = r0 + r4
            int r0 = r0 + 0
            int r13 = java.lang.Math.max(r13, r0)
        L_0x0660:
            r6.f3268j = r13
        L_0x0662:
            r0 = r22
        L_0x0664:
            int r0 = r0 + 1
            r4 = 0
            goto L_0x061e
        L_0x0668:
            r3 = r22
        L_0x066a:
            int r0 = r6.f3268j
            int r4 = r33.getPaddingLeft()
            int r13 = r33.getPaddingRight()
            int r13 = r13 + r4
            int r13 = r13 + r0
            r6.f3268j = r13
            int r0 = r33.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r13, r0)
            r4 = 0
            r13 = r34
            int r0 = android.view.View.resolveSizeAndState(r0, r13, r4)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r0
            int r14 = r6.f3268j
            int r4 = r4 - r14
            if (r20 != 0) goto L_0x06dd
            if (r4 == 0) goto L_0x0698
            r14 = 0
            int r14 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r14 <= 0) goto L_0x0698
            goto L_0x06dd
        L_0x0698:
            int r1 = java.lang.Math.max(r2, r7)
            if (r15 == 0) goto L_0x06d5
            r2 = 1073741824(0x40000000, float:2.0)
            if (r3 == r2) goto L_0x06d5
            r2 = 0
        L_0x06a3:
            if (r2 >= r5) goto L_0x06d5
            android.view.View r3 = r6.getChildAt(r2)
            if (r3 == 0) goto L_0x06d2
            int r4 = r3.getVisibility()
            r7 = 8
            if (r4 != r7) goto L_0x06b4
            goto L_0x06d2
        L_0x06b4:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            p.b.q.f0$a r4 = (p124p.p126b.p136q.C1167f0.C1168a) r4
            float r4 = r4.f3278a
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x06d2
            r4 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r4)
            int r11 = r3.getMeasuredHeight()
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r4)
            r3.measure(r7, r4)
        L_0x06d2:
            int r2 = r2 + 1
            goto L_0x06a3
        L_0x06d5:
            r4 = r35
            r13 = r23
            r23 = r5
            goto L_0x0844
        L_0x06dd:
            float r7 = r6.f3269k
            r8 = 0
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x06e5
            r1 = r7
        L_0x06e5:
            r7 = 3
            r8 = -1
            r11[r7] = r8
            r9 = 2
            r11[r9] = r8
            r14 = 1
            r11[r14] = r8
            r15 = 0
            r11[r15] = r8
            r12[r7] = r8
            r12[r9] = r8
            r12[r14] = r8
            r12[r15] = r8
            r6.f3268j = r15
            r7 = -1
            r8 = 0
            r9 = r7
            r7 = r23
        L_0x0701:
            if (r8 >= r5) goto L_0x081a
            android.view.View r14 = r6.getChildAt(r8)
            if (r14 == 0) goto L_0x0808
            int r15 = r14.getVisibility()
            r13 = 8
            if (r15 != r13) goto L_0x0713
            goto L_0x0808
        L_0x0713:
            android.view.ViewGroup$LayoutParams r13 = r14.getLayoutParams()
            p.b.q.f0$a r13 = (p124p.p126b.p136q.C1167f0.C1168a) r13
            float r15 = r13.f3278a
            r20 = 0
            int r20 = (r15 > r20 ? 1 : (r15 == r20 ? 0 : -1))
            r23 = r5
            if (r20 <= 0) goto L_0x0774
            float r5 = (float) r4
            float r5 = r5 * r15
            float r5 = r5 / r1
            int r5 = (int) r5
            float r1 = r1 - r15
            int r4 = r4 - r5
            int r15 = r33.getPaddingTop()
            int r20 = r33.getPaddingBottom()
            int r20 = r20 + r15
            int r15 = r13.topMargin
            int r20 = r20 + r15
            int r15 = r13.bottomMargin
            int r15 = r20 + r15
            r20 = r1
            int r1 = r13.height
            r22 = r4
            r4 = r35
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r4, r15, r1)
            int r15 = r13.width
            if (r15 != 0) goto L_0x0753
            r15 = 1073741824(0x40000000, float:2.0)
            if (r3 == r15) goto L_0x0750
            goto L_0x0753
        L_0x0750:
            if (r5 <= 0) goto L_0x075a
            goto L_0x075b
        L_0x0753:
            int r15 = r14.getMeasuredWidth()
            int r5 = r5 + r15
            if (r5 >= 0) goto L_0x075b
        L_0x075a:
            r5 = 0
        L_0x075b:
            r15 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r15)
            r14.measure(r5, r1)
            int r1 = r14.getMeasuredState()
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r5
            int r7 = android.view.View.combineMeasuredStates(r7, r1)
            r1 = r20
            r5 = r22
            goto L_0x0777
        L_0x0774:
            r5 = r4
            r4 = r35
        L_0x0777:
            if (r16 == 0) goto L_0x0791
            int r15 = r6.f3268j
            int r20 = r14.getMeasuredWidth()
            r22 = r1
            int r1 = r13.leftMargin
            int r1 = r20 + r1
            r20 = r3
            int r3 = r13.rightMargin
            r25 = r5
            r5 = 0
            int r1 = p213q.p214a.p215a.p216a.C1965a.m4742a(r1, r3, r5, r15)
            goto L_0x07aa
        L_0x0791:
            r22 = r1
            r20 = r3
            r25 = r5
            int r1 = r6.f3268j
            int r3 = r14.getMeasuredWidth()
            int r3 = r3 + r1
            int r5 = r13.leftMargin
            int r3 = r3 + r5
            int r5 = r13.rightMargin
            int r3 = r3 + r5
            int r3 = r3 + 0
            int r1 = java.lang.Math.max(r1, r3)
        L_0x07aa:
            r6.f3268j = r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 == r1) goto L_0x07b7
            int r1 = r13.height
            r3 = -1
            if (r1 != r3) goto L_0x07b7
            r1 = 1
            goto L_0x07b8
        L_0x07b7:
            r1 = 0
        L_0x07b8:
            int r3 = r13.topMargin
            int r5 = r13.bottomMargin
            int r3 = r3 + r5
            int r5 = r14.getMeasuredHeight()
            int r5 = r5 + r3
            int r9 = java.lang.Math.max(r9, r5)
            if (r1 == 0) goto L_0x07c9
            goto L_0x07ca
        L_0x07c9:
            r3 = r5
        L_0x07ca:
            int r1 = java.lang.Math.max(r2, r3)
            if (r19 == 0) goto L_0x07d7
            int r2 = r13.height
            r3 = -1
            if (r2 != r3) goto L_0x07d8
            r2 = 1
            goto L_0x07d9
        L_0x07d7:
            r3 = -1
        L_0x07d8:
            r2 = 0
        L_0x07d9:
            if (r24 == 0) goto L_0x0800
            int r14 = r14.getBaseline()
            if (r14 == r3) goto L_0x0800
            int r3 = r13.f3279b
            if (r3 >= 0) goto L_0x07e7
            int r3 = r6.f3267i
        L_0x07e7:
            r3 = r3 & 112(0x70, float:1.57E-43)
            int r3 = r3 >> 4
            r3 = r3 & -2
            int r3 = r3 >> 1
            r13 = r11[r3]
            int r13 = java.lang.Math.max(r13, r14)
            r11[r3] = r13
            r13 = r12[r3]
            int r5 = r5 - r14
            int r5 = java.lang.Math.max(r13, r5)
            r12[r3] = r5
        L_0x0800:
            r19 = r2
            r5 = r25
            r2 = r1
            r1 = r22
            goto L_0x080f
        L_0x0808:
            r20 = r3
            r23 = r5
            r5 = r4
            r4 = r35
        L_0x080f:
            int r8 = r8 + 1
            r13 = r34
            r4 = r5
            r3 = r20
            r5 = r23
            goto L_0x0701
        L_0x081a:
            r4 = r35
            r23 = r5
            int r1 = r6.f3268j
            int r3 = r33.getPaddingLeft()
            int r5 = r33.getPaddingRight()
            int r5 = r5 + r3
            int r5 = r5 + r1
            r6.f3268j = r5
            r1 = 1
            r3 = r11[r1]
            r1 = -1
            if (r3 != r1) goto L_0x0849
            r3 = 0
            r3 = r11[r3]
            if (r3 != r1) goto L_0x0849
            r3 = 2
            r5 = r11[r3]
            if (r5 != r1) goto L_0x0849
            r3 = 3
            r5 = r11[r3]
            if (r5 == r1) goto L_0x0842
            goto L_0x084a
        L_0x0842:
            r1 = r2
            r13 = r7
        L_0x0844:
            r2 = 0
            r5 = r2
            r7 = r13
            r2 = r1
            goto L_0x087a
        L_0x0849:
            r3 = 3
        L_0x084a:
            r1 = r11[r3]
            r5 = 0
            r8 = r11[r5]
            r13 = 1
            r14 = r11[r13]
            r15 = 2
            r11 = r11[r15]
            int r11 = java.lang.Math.max(r14, r11)
            int r8 = java.lang.Math.max(r8, r11)
            int r1 = java.lang.Math.max(r1, r8)
            r3 = r12[r3]
            r8 = r12[r5]
            r11 = r12[r13]
            r12 = r12[r15]
            int r11 = java.lang.Math.max(r11, r12)
            int r8 = java.lang.Math.max(r8, r11)
            int r3 = java.lang.Math.max(r3, r8)
            int r3 = r3 + r1
            int r9 = java.lang.Math.max(r9, r3)
        L_0x087a:
            if (r19 != 0) goto L_0x0881
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 == r1) goto L_0x0881
            goto L_0x0882
        L_0x0881:
            r2 = r9
        L_0x0882:
            int r1 = r33.getPaddingTop()
            int r3 = r33.getPaddingBottom()
            int r3 = r3 + r1
            int r3 = r3 + r2
            int r1 = r33.getSuggestedMinimumHeight()
            int r1 = java.lang.Math.max(r3, r1)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r7
            r0 = r0 | r2
            int r2 = r7 << 16
            int r1 = android.view.View.resolveSizeAndState(r1, r4, r2)
            r6.setMeasuredDimension(r0, r1)
            if (r21 == 0) goto L_0x08e6
            int r0 = r33.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r8 = r5
            r5 = r23
        L_0x08b0:
            if (r8 >= r5) goto L_0x08e6
            android.view.View r1 = r6.getChildAt(r8)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x08e1
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r9 = r0
            p.b.q.f0$a r9 = (p124p.p126b.p136q.C1167f0.C1168a) r9
            int r0 = r9.height
            r2 = -1
            if (r0 != r2) goto L_0x08e1
            int r10 = r9.width
            int r0 = r1.getMeasuredWidth()
            r9.width = r0
            r3 = 0
            r11 = 0
            r0 = r33
            r2 = r34
            r4 = r7
            r12 = r5
            r5 = r11
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r9.width = r10
            goto L_0x08e2
        L_0x08e1:
            r12 = r5
        L_0x08e2:
            int r8 = r8 + 1
            r5 = r12
            goto L_0x08b0
        L_0x08e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p136q.C1167f0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f3263e = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder a = C1965a.m4756a("base aligned child index out of range (0, ");
            a.append(getChildCount());
            a.append(")");
            throw new IllegalArgumentException(a.toString());
        }
        this.f3264f = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f3273o) {
            this.f3273o = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f3274p = drawable.getIntrinsicWidth();
                this.f3275q = drawable.getIntrinsicHeight();
            } else {
                this.f3274p = 0;
                this.f3275q = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f3277s = i;
    }

    public void setGravity(int i) {
        if (this.f3267i != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f3267i = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f3267i;
        if ((8388615 & i3) != i2) {
            this.f3267i = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f3270l = z;
    }

    public void setOrientation(int i) {
        if (this.f3266h != i) {
            this.f3266h = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f3276r) {
            requestLayout();
        }
        this.f3276r = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f3267i;
        if ((i3 & 112) != i2) {
            this.f3267i = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f3269k = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
