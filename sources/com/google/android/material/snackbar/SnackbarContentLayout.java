package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import p124p.p150h.p162l.C1404o;
import p213q.p217b.p218a.p271c.C3327f;
import p213q.p217b.p218a.p271c.C3406l;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: e */
    public TextView f1355e;

    /* renamed from: f */
    public Button f1356f;

    /* renamed from: g */
    public int f1357g;

    /* renamed from: h */
    public int f1358h;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3406l.SnackbarLayout);
        this.f1357g = obtainStyledAttributes.getDimensionPixelSize(C3406l.SnackbarLayout_android_maxWidth, -1);
        this.f1358h = obtainStyledAttributes.getDimensionPixelSize(C3406l.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final boolean mo2171a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f1355e.getPaddingTop() == i2 && this.f1355e.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f1355e;
        if (C1404o.m3565z(textView)) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f1356f;
    }

    public TextView getMessageView() {
        return this.f1355e;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1355e = (TextView) findViewById(C3327f.snackbar_text);
        this.f1356f = (Button) findViewById(C3327f.snackbar_action);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (mo2171a(1, r0, r0 - r1) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (mo2171a(0, r0, r0) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f1357g
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f1357g
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = p213q.p217b.p218a.p271c.C3318d.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = p213q.p217b.p218a.p271c.C3318d.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f1355e
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = r4
            goto L_0x003d
        L_0x003c:
            r2 = r3
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f1358h
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.f1356f
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f1358h
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.mo2171a(r4, r0, r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0060
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.mo2171a(r3, r0, r0)
            if (r0 == 0) goto L_0x0061
        L_0x0060:
            r3 = r4
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            super.onMeasure(r8, r9)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }
}
