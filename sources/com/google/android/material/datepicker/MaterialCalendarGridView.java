package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import p124p.p150h.p161k.C1383c;
import p124p.p150h.p162l.C1387a;
import p124p.p150h.p162l.C1404o;
import p124p.p150h.p162l.p163y.C1429b;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.C3327f;
import p213q.p217b.p218a.p271c.p295x.C3465c;
import p213q.p217b.p218a.p271c.p295x.C3466d;
import p213q.p217b.p218a.p271c.p295x.C3481m;
import p213q.p217b.p218a.p271c.p295x.C3484o;

public final class MaterialCalendarGridView extends GridView {

    /* renamed from: e */
    public final Calendar f1309e;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    public class C0233a extends C1387a {
        public C0233a(MaterialCalendarGridView materialCalendarGridView) {
        }

        /* renamed from: a */
        public void mo768a(View view, C1429b bVar) {
            this.f4146a.onInitializeAccessibilityNodeInfo(view, bVar.f4203a);
            bVar.mo5946a((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1309e = C2286e.m5311c();
        if (C3481m.m7939b(getContext())) {
            setNextFocusLeftId(C3327f.cancel_button);
            setNextFocusRightId(C3327f.confirm_button);
        }
        C1404o.m3526a((View) this, (C1387a) new C0233a(this));
    }

    public C3484o getAdapter() {
        return (C3484o) super.getAdapter();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C3484o adapter = getAdapter();
        C3466d<?> dVar = adapter.f8880f;
        C3465c cVar = adapter.f8881g;
        Long item = adapter.getItem(adapter.mo9440a());
        Long item2 = adapter.getItem(adapter.mo9441b());
        for (C1383c cVar2 : dVar.mo9414k()) {
            F f = cVar2.f4140a;
            if (f != null) {
                if (cVar2.f4141b == null) {
                    continue;
                } else {
                    long longValue = ((Long) f).longValue();
                    long longValue2 = ((Long) cVar2.f4141b).longValue();
                    Long valueOf = Long.valueOf(longValue);
                    Long valueOf2 = Long.valueOf(longValue2);
                    int i5 = 1;
                    if (!(item == null || item2 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > item2.longValue() || valueOf2.longValue() < item.longValue())) {
                        if (longValue < item.longValue()) {
                            i2 = adapter.mo9440a();
                            if (i2 % adapter.f8879e.f8876i == 0) {
                                i = 0;
                            } else {
                                i = materialCalendarGridView.getChildAt(i2 - 1).getRight();
                            }
                        } else {
                            materialCalendarGridView.f1309e.setTimeInMillis(longValue);
                            i2 = (materialCalendarGridView.f1309e.get(5) - 1) + adapter.mo9440a();
                            View childAt = materialCalendarGridView.getChildAt(i2);
                            i = (childAt.getWidth() / 2) + childAt.getLeft();
                        }
                        if (longValue2 > item2.longValue()) {
                            i4 = adapter.mo9441b();
                            i3 = (i4 + 1) % adapter.f8879e.f8876i == 0 ? getWidth() : materialCalendarGridView.getChildAt(i4).getRight();
                        } else {
                            materialCalendarGridView.f1309e.setTimeInMillis(longValue2);
                            i4 = (materialCalendarGridView.f1309e.get(5) - 1) + adapter.mo9440a();
                            View childAt2 = materialCalendarGridView.getChildAt(i4);
                            i3 = (childAt2.getWidth() / 2) + childAt2.getLeft();
                        }
                        int itemId = (int) adapter.getItemId(i2);
                        int itemId2 = (int) adapter.getItemId(i4);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - i5;
                            View childAt3 = materialCalendarGridView.getChildAt(numColumns);
                            canvas.drawRect((float) (numColumns > i2 ? 0 : i), (float) (childAt3.getTop() + cVar.f8826a.f8820a.top), (float) (i4 > numColumns2 ? getWidth() : i3), (float) (childAt3.getBottom() - cVar.f8826a.f8820a.bottom), cVar.f8833h);
                            itemId++;
                            i5 = 1;
                            materialCalendarGridView = this;
                        }
                    } else {
                        return;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        int i2;
        if (z) {
            if (i == 33) {
                i2 = getAdapter().mo9441b();
            } else if (i == 130) {
                i2 = getAdapter().mo9440a();
            } else {
                super.onFocusChanged(true, i, rect);
                return;
            }
            setSelection(i2);
            return;
        }
        super.onFocusChanged(false, i, rect);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo9440a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().mo9440a());
        return true;
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C3484o) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C3484o.class.getCanonicalName()}));
        }
    }

    public void setSelection(int i) {
        if (i < getAdapter().mo9440a()) {
            i = getAdapter().mo9440a();
        }
        super.setSelection(i);
    }
}
