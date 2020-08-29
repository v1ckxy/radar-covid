package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p124p.p126b.p134p.p135i.C1114g;
import p124p.p126b.p134p.p135i.C1131n;

public class NavigationMenuView extends RecyclerView implements C1131n {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(1, false));
    }

    /* renamed from: a */
    public void mo61a(C1114g gVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
