package p124p.p126b.p134p.p135i;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
import p124p.p126b.p134p.p135i.C1131n.C1132a;

/* renamed from: p.b.p.i.f */
public class C1113f extends BaseAdapter {

    /* renamed from: e */
    public C1114g f3065e;

    /* renamed from: f */
    public int f3066f = -1;

    /* renamed from: g */
    public boolean f3067g;

    /* renamed from: h */
    public final boolean f3068h;

    /* renamed from: i */
    public final LayoutInflater f3069i;

    /* renamed from: j */
    public final int f3070j;

    public C1113f(C1114g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f3068h = z;
        this.f3069i = layoutInflater;
        this.f3065e = gVar;
        this.f3070j = i;
        mo4792a();
    }

    /* renamed from: a */
    public void mo4792a() {
        C1114g gVar = this.f3065e;
        C1118i iVar = gVar.f3094w;
        if (iVar != null) {
            gVar.mo4800a();
            ArrayList<C1118i> arrayList = gVar.f3081j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C1118i) arrayList.get(i)) == iVar) {
                    this.f3066f = i;
                    return;
                }
            }
        }
        this.f3066f = -1;
    }

    public int getCount() {
        ArrayList<C1118i> arrayList;
        if (this.f3068h) {
            C1114g gVar = this.f3065e;
            gVar.mo4800a();
            arrayList = gVar.f3081j;
        } else {
            arrayList = this.f3065e.mo4830d();
        }
        int i = this.f3066f;
        int size = arrayList.size();
        return i < 0 ? size : size - 1;
    }

    public C1118i getItem(int i) {
        ArrayList<C1118i> arrayList;
        if (this.f3068h) {
            C1114g gVar = this.f3065e;
            gVar.mo4800a();
            arrayList = gVar.f3081j;
        } else {
            arrayList = this.f3065e.mo4830d();
        }
        int i2 = this.f3066f;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C1118i) arrayList.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f3069i.inflate(this.f3070j, viewGroup, false);
        }
        int i2 = getItem(i).f3105b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f3065e.mo4831e() && i2 != (i3 >= 0 ? getItem(i3).f3105b : i2));
        C1132a aVar = (C1132a) view;
        if (this.f3067g) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo38a(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo4792a();
        super.notifyDataSetChanged();
    }
}
