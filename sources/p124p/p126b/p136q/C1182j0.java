package p124p.p126b.p136q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
import p124p.p126b.p134p.p135i.C1113f;
import p124p.p126b.p134p.p135i.C1114g;
import p124p.p126b.p134p.p135i.C1118i;

/* renamed from: p.b.q.j0 */
public class C1182j0 extends C1172h0 implements C1180i0 {

    /* renamed from: K */
    public static Method f3337K;

    /* renamed from: J */
    public C1180i0 f3338J;

    /* renamed from: p.b.q.j0$a */
    public static class C1183a extends C1157c0 {

        /* renamed from: s */
        public final int f3339s;

        /* renamed from: t */
        public final int f3340t;

        /* renamed from: u */
        public C1180i0 f3341u;

        /* renamed from: v */
        public MenuItem f3342v;

        public C1183a(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f3339s = 21;
                this.f3340t = 22;
                return;
            }
            this.f3339s = 22;
            this.f3340t = 21;
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            if (this.f3341u != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C1113f fVar = (C1113f) adapter;
                C1118i iVar = null;
                if (motionEvent.getAction() != 10) {
                    int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (pointToPosition != -1) {
                        int i2 = pointToPosition - i;
                        if (i2 >= 0 && i2 < fVar.getCount()) {
                            iVar = fVar.getItem(i2);
                        }
                    }
                }
                MenuItem menuItem = this.f3342v;
                if (menuItem != iVar) {
                    C1114g gVar = fVar.f3065e;
                    if (menuItem != null) {
                        this.f3341u.mo4782b(gVar, menuItem);
                    }
                    this.f3342v = iVar;
                    if (iVar != null) {
                        this.f3341u.mo4781a(gVar, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f3339s) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f3340t) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C1113f) getAdapter()).f3065e.mo4808a(false);
                return true;
            }
        }

        public void setHoverListener(C1180i0 i0Var) {
            this.f3341u = i0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (VERSION.SDK_INT <= 28) {
                f3337K = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C1182j0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public C1157c0 mo5158a(Context context, boolean z) {
        C1183a aVar = new C1183a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    /* renamed from: a */
    public void mo4781a(C1114g gVar, MenuItem menuItem) {
        C1180i0 i0Var = this.f3338J;
        if (i0Var != null) {
            i0Var.mo4781a(gVar, menuItem);
        }
    }

    /* renamed from: b */
    public void mo4782b(C1114g gVar, MenuItem menuItem) {
        C1180i0 i0Var = this.f3338J;
        if (i0Var != null) {
            i0Var.mo4782b(gVar, menuItem);
        }
    }
}
