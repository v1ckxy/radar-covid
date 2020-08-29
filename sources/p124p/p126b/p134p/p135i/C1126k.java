package p124p.p126b.p134p.p135i;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: p.b.p.i.k */
public abstract class C1126k implements C1134p, C1129m, OnItemClickListener {

    /* renamed from: e */
    public Rect f3141e;

    /* renamed from: a */
    public static int m2791a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static boolean m2792b(C1114g gVar) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo4762a(int i);

    /* renamed from: a */
    public void mo532a(Context context, C1114g gVar) {
    }

    /* renamed from: a */
    public abstract void mo4763a(View view);

    /* renamed from: a */
    public abstract void mo4764a(OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo4765a(C1114g gVar);

    /* renamed from: a */
    public boolean mo537a(C1114g gVar, C1118i iVar) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo4767b(int i);

    /* renamed from: b */
    public abstract void mo4768b(boolean z);

    /* renamed from: b */
    public boolean mo540b(C1114g gVar, C1118i iVar) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo4770c(int i);

    /* renamed from: c */
    public abstract void mo4772c(boolean z);

    /* renamed from: f */
    public boolean mo4775f() {
        return true;
    }

    public int getId() {
        return 0;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C1113f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C1113f) listAdapter).f3065e.mo4810a((MenuItem) listAdapter.getItem(i), (C1129m) this, mo4775f() ? 0 : 4);
    }
}
