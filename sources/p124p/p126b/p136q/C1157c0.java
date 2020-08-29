package p124p.p126b.p136q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import p124p.p126b.C1018a;
import p124p.p126b.p130m.p131a.C1083c;
import p124p.p150h.p162l.C1413t;
import p124p.p150h.p164m.C1449c;

/* renamed from: p.b.q.c0 */
public class C1157c0 extends ListView {

    /* renamed from: e */
    public final Rect f3225e = new Rect();

    /* renamed from: f */
    public int f3226f = 0;

    /* renamed from: g */
    public int f3227g = 0;

    /* renamed from: h */
    public int f3228h = 0;

    /* renamed from: i */
    public int f3229i = 0;

    /* renamed from: j */
    public int f3230j;

    /* renamed from: k */
    public Field f3231k;

    /* renamed from: l */
    public C1158a f3232l;

    /* renamed from: m */
    public boolean f3233m;

    /* renamed from: n */
    public boolean f3234n;

    /* renamed from: o */
    public boolean f3235o;

    /* renamed from: p */
    public C1413t f3236p;

    /* renamed from: q */
    public C1449c f3237q;

    /* renamed from: r */
    public C1159b f3238r;

    /* renamed from: p.b.q.c0$a */
    public static class C1158a extends C1083c {

        /* renamed from: f */
        public boolean f3239f = true;

        public C1158a(Drawable drawable) {
            super(drawable);
        }

        public void draw(Canvas canvas) {
            if (this.f3239f) {
                this.f2912e.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f3239f) {
                this.f2912e.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f3239f) {
                this.f2912e.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f3239f) {
                return this.f2912e.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f3239f) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: p.b.q.c0$b */
    public class C1159b implements Runnable {
        public C1159b() {
        }

        public void run() {
            C1157c0 c0Var = C1157c0.this;
            c0Var.f3238r = null;
            c0Var.drawableStateChanged();
        }
    }

    public C1157c0(Context context, boolean z) {
        super(context, null, C1018a.dropDownListViewStyle);
        this.f3234n = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f3231k = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        C1158a aVar = this.f3232l;
        if (aVar != null) {
            aVar.f3239f = z;
        }
    }

    /* renamed from: a */
    public int mo5068a(int i, int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i4 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i4;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i5 = 0;
        int i6 = 0;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            view.measure(i, i8 > 0 ? MeasureSpec.makeMeasureSpec(i8, 1073741824) : MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                i4 += dividerHeight;
            }
            i4 += view.getMeasuredHeight();
            if (i4 >= i2) {
                if (i3 >= 0 && i7 > i3 && i6 > 0 && i4 != i2) {
                    i2 = i6;
                }
                return i2;
            }
            if (i3 >= 0 && i7 >= i3) {
                i6 = i4;
            }
        }
        return i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0164  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5070a(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0018
            r0 = 2
            if (r3 == r0) goto L_0x0016
            r0 = 3
            if (r3 == r0) goto L_0x001f
            r0 = r4
            r4 = r5
            goto L_0x0126
        L_0x0016:
            r0 = r4
            goto L_0x0019
        L_0x0018:
            r0 = r5
        L_0x0019:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x0023
        L_0x001f:
            r0 = r5
            r4 = r0
            goto L_0x0126
        L_0x0023:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0036
            goto L_0x0126
        L_0x0036:
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.f3235o = r4
            r1.drawableHotspotChanged(r7, r6)
            boolean r0 = r16.isPressed()
            if (r0 != 0) goto L_0x0050
            r1.setPressed(r4)
        L_0x0050:
            r16.layoutChildren()
            int r0 = r1.f3230j
            if (r0 == r9) goto L_0x006d
            int r11 = r16.getFirstVisiblePosition()
            int r0 = r0 - r11
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L_0x006d
            if (r0 == r10) goto L_0x006d
            boolean r11 = r0.isPressed()
            if (r11 == 0) goto L_0x006d
            r0.setPressed(r5)
        L_0x006d:
            r1.f3230j = r8
            int r0 = r10.getLeft()
            float r0 = (float) r0
            float r0 = r7 - r0
            int r11 = r10.getTop()
            float r11 = (float) r11
            float r11 = r6 - r11
            r10.drawableHotspotChanged(r0, r11)
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L_0x0089
            r10.setPressed(r4)
        L_0x0089:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L_0x0093
            if (r8 == r9) goto L_0x0093
            r12 = r4
            goto L_0x0094
        L_0x0093:
            r12 = r5
        L_0x0094:
            if (r12 == 0) goto L_0x0099
            r11.setVisible(r5, r5)
        L_0x0099:
            android.graphics.Rect r0 = r1.f3225e
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            int r4 = r10.getBottom()
            r0.set(r13, r14, r15, r4)
            int r4 = r0.left
            int r13 = r1.f3226f
            int r4 = r4 - r13
            r0.left = r4
            int r4 = r0.top
            int r13 = r1.f3227g
            int r4 = r4 - r13
            r0.top = r4
            int r4 = r0.right
            int r13 = r1.f3228h
            int r4 = r4 + r13
            r0.right = r4
            int r4 = r0.bottom
            int r13 = r1.f3229i
            int r4 = r4 + r13
            r0.bottom = r4
            java.lang.reflect.Field r0 = r1.f3231k     // Catch:{ IllegalAccessException -> 0x00ea }
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00ea }
            boolean r4 = r10.isEnabled()     // Catch:{ IllegalAccessException -> 0x00ea }
            if (r4 == r0) goto L_0x00ee
            java.lang.reflect.Field r4 = r1.f3231k     // Catch:{ IllegalAccessException -> 0x00ea }
            if (r0 != 0) goto L_0x00dc
            r0 = 1
            goto L_0x00dd
        L_0x00dc:
            r0 = r5
        L_0x00dd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x00ea }
            r4.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x00ea }
            if (r8 == r9) goto L_0x00ee
            r16.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00ea }
            goto L_0x00ee
        L_0x00ea:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00ee:
            if (r12 == 0) goto L_0x0109
            android.graphics.Rect r0 = r1.f3225e
            float r4 = r0.exactCenterX()
            float r0 = r0.exactCenterY()
            int r12 = r16.getVisibility()
            if (r12 != 0) goto L_0x0102
            r12 = 1
            goto L_0x0103
        L_0x0102:
            r12 = r5
        L_0x0103:
            r11.setVisible(r12, r5)
            r11.setHotspot(r4, r0)
        L_0x0109:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x0114
            if (r8 == r9) goto L_0x0114
            r0.setHotspot(r7, r6)
        L_0x0114:
            r1.setSelectorEnabled(r5)
            r16.refreshDrawableState()
            r4 = 1
            if (r3 != r4) goto L_0x0124
            long r3 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r3)
        L_0x0124:
            r4 = r5
            r0 = 1
        L_0x0126:
            if (r0 == 0) goto L_0x012a
            if (r4 == 0) goto L_0x014c
        L_0x012a:
            r1.f3235o = r5
            r1.setPressed(r5)
            r16.drawableStateChanged()
            int r3 = r1.f3230j
            int r4 = r16.getFirstVisiblePosition()
            int r3 = r3 - r4
            android.view.View r3 = r1.getChildAt(r3)
            if (r3 == 0) goto L_0x0142
            r3.setPressed(r5)
        L_0x0142:
            p.h.l.t r3 = r1.f3236p
            if (r3 == 0) goto L_0x014c
            r3.mo5914a()
            r3 = 0
            r1.f3236p = r3
        L_0x014c:
            if (r0 == 0) goto L_0x0164
            p.h.m.c r3 = r1.f3237q
            if (r3 != 0) goto L_0x0159
            p.h.m.c r3 = new p.h.m.c
            r3.<init>(r1)
            r1.f3237q = r3
        L_0x0159:
            p.h.m.c r3 = r1.f3237q
            boolean r4 = r3.f4238t
            r5 = 1
            r3.f4238t = r5
            r3.onTouch(r1, r2)
            goto L_0x0171
        L_0x0164:
            p.h.m.c r2 = r1.f3237q
            if (r2 == 0) goto L_0x0171
            boolean r3 = r2.f4238t
            if (r3 == 0) goto L_0x016f
            r2.mo5966a()
        L_0x016f:
            r2.f4238t = r5
        L_0x0171:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p136q.C1157c0.mo5070a(android.view.MotionEvent, int):boolean");
    }

    public void dispatchDraw(Canvas canvas) {
        if (!this.f3225e.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.f3225e);
                selector.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.f3238r == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            mo5069a();
        }
    }

    public boolean hasFocus() {
        return this.f3234n || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f3234n || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f3234n || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f3234n && this.f3233m) || super.isInTouchMode();
    }

    public void onDetachedFromWindow() {
        this.f3238r = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3238r == null) {
            C1159b bVar = new C1159b();
            this.f3238r = bVar;
            C1157c0.this.post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                mo5069a();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3230j = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C1159b bVar = this.f3238r;
        if (bVar != null) {
            C1157c0 c0Var = C1157c0.this;
            c0Var.f3238r = null;
            c0Var.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f3233m = z;
    }

    public void setSelector(Drawable drawable) {
        C1158a aVar = drawable != null ? new C1158a(drawable) : null;
        this.f3232l = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3226f = rect.left;
        this.f3227g = rect.top;
        this.f3228h = rect.right;
        this.f3229i = rect.bottom;
    }

    /* renamed from: a */
    public final void mo5069a() {
        Drawable selector = getSelector();
        if (selector != null && this.f3235o && isPressed()) {
            selector.setState(getDrawableState());
        }
    }
}
