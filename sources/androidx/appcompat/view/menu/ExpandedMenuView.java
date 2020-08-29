package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import p124p.p126b.p128l.p129a.C1070a;
import p124p.p126b.p134p.p135i.C1114g;
import p124p.p126b.p134p.p135i.C1114g.C1116b;
import p124p.p126b.p134p.p135i.C1118i;
import p124p.p126b.p134p.p135i.C1129m;
import p124p.p126b.p134p.p135i.C1131n;

public final class ExpandedMenuView extends ListView implements C1116b, C1131n, OnItemClickListener {

    /* renamed from: f */
    public static final int[] f107f = {16842964, 16843049};

    /* renamed from: e */
    public C1114g f108e;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        super(context, attributeSet);
        setOnItemClickListener(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f107f, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            if (obtainStyledAttributes.hasValue(0)) {
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    drawable2 = C1070a.m2602b(context, resourceId);
                    setBackgroundDrawable(drawable2);
                }
            }
            drawable2 = obtainStyledAttributes.getDrawable(0);
            setBackgroundDrawable(drawable2);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            if (obtainStyledAttributes.hasValue(1)) {
                int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
                if (resourceId2 != 0) {
                    drawable = C1070a.m2602b(context, resourceId2);
                    setDivider(drawable);
                }
            }
            drawable = obtainStyledAttributes.getDrawable(1);
            setDivider(drawable);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public void mo61a(C1114g gVar) {
        this.f108e = gVar;
    }

    /* renamed from: a */
    public boolean mo62a(C1118i iVar) {
        return this.f108e.mo4810a((MenuItem) iVar, (C1129m) null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo62a((C1118i) getAdapter().getItem(i));
    }
}
