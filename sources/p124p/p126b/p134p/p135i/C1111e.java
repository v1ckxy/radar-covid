package p124p.p126b.p134p.p135i;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController.C0007b;
import androidx.appcompat.view.menu.ExpandedMenuView;
import java.util.ArrayList;
import p124p.p126b.C1024g;
import p124p.p126b.p127k.C1034d;
import p124p.p126b.p127k.C1034d.C1035a;
import p124p.p126b.p134p.p135i.C1129m.C1130a;
import p124p.p126b.p134p.p135i.C1131n.C1132a;

/* renamed from: p.b.p.i.e */
public class C1111e implements C1129m, OnItemClickListener {

    /* renamed from: e */
    public Context f3054e;

    /* renamed from: f */
    public LayoutInflater f3055f;

    /* renamed from: g */
    public C1114g f3056g;

    /* renamed from: h */
    public ExpandedMenuView f3057h;

    /* renamed from: i */
    public int f3058i;

    /* renamed from: j */
    public int f3059j = 0;

    /* renamed from: k */
    public int f3060k;

    /* renamed from: l */
    public C1130a f3061l;

    /* renamed from: m */
    public C1112a f3062m;

    /* renamed from: p.b.p.i.e$a */
    public class C1112a extends BaseAdapter {

        /* renamed from: e */
        public int f3063e = -1;

        public C1112a() {
            mo4786a();
        }

        /* renamed from: a */
        public void mo4786a() {
            C1114g gVar = C1111e.this.f3056g;
            C1118i iVar = gVar.f3094w;
            if (iVar != null) {
                gVar.mo4800a();
                ArrayList<C1118i> arrayList = gVar.f3081j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((C1118i) arrayList.get(i)) == iVar) {
                        this.f3063e = i;
                        return;
                    }
                }
            }
            this.f3063e = -1;
        }

        public int getCount() {
            C1114g gVar = C1111e.this.f3056g;
            gVar.mo4800a();
            int size = gVar.f3081j.size() - C1111e.this.f3058i;
            return this.f3063e < 0 ? size : size - 1;
        }

        public C1118i getItem(int i) {
            C1114g gVar = C1111e.this.f3056g;
            gVar.mo4800a();
            ArrayList<C1118i> arrayList = gVar.f3081j;
            int i2 = i + C1111e.this.f3058i;
            int i3 = this.f3063e;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return (C1118i) arrayList.get(i2);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C1111e eVar = C1111e.this;
                view = eVar.f3055f.inflate(eVar.f3060k, viewGroup, false);
            }
            ((C1132a) view).mo38a(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo4786a();
            super.notifyDataSetChanged();
        }
    }

    public C1111e(Context context, int i) {
        this.f3060k = i;
        this.f3054e = context;
        this.f3055f = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter mo4784a() {
        if (this.f3062m == null) {
            this.f3062m = new C1112a();
        }
        return this.f3062m;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo532a(android.content.Context r3, p124p.p126b.p134p.p135i.C1114g r4) {
        /*
            r2 = this;
            int r0 = r2.f3059j
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f3059j
            r0.<init>(r3, r1)
            r2.f3054e = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L_0x0011:
            r2.f3055f = r3
            goto L_0x0023
        L_0x0014:
            android.content.Context r0 = r2.f3054e
            if (r0 == 0) goto L_0x0023
            r2.f3054e = r3
            android.view.LayoutInflater r0 = r2.f3055f
            if (r0 != 0) goto L_0x0023
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L_0x0011
        L_0x0023:
            r2.f3056g = r4
            p.b.p.i.e$a r3 = r2.f3062m
            if (r3 == 0) goto L_0x002c
            r3.notifyDataSetChanged()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p134p.p135i.C1111e.mo532a(android.content.Context, p.b.p.i.g):void");
    }

    /* renamed from: a */
    public void mo533a(Parcelable parcelable) {
        SparseArray sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f3057h.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: a */
    public void mo534a(C1114g gVar, boolean z) {
        C1130a aVar = this.f3061l;
        if (aVar != null) {
            aVar.mo196a(gVar, z);
        }
    }

    /* renamed from: a */
    public void mo535a(C1130a aVar) {
        this.f3061l = aVar;
    }

    /* renamed from: a */
    public void mo536a(boolean z) {
        C1112a aVar = this.f3062m;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo537a(C1114g gVar, C1118i iVar) {
        return false;
    }

    /* renamed from: b */
    public boolean mo539b() {
        return false;
    }

    /* renamed from: b */
    public boolean mo540b(C1114g gVar, C1118i iVar) {
        return false;
    }

    /* renamed from: d */
    public Parcelable mo541d() {
        if (this.f3057h == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f3057h;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    public int getId() {
        return 0;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f3056g.mo4810a((MenuItem) this.f3062m.getItem(i), (C1129m) this, 0);
    }

    /* renamed from: a */
    public boolean mo538a(C1138r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        C1117h hVar = new C1117h(rVar);
        C1114g gVar = hVar.f3097e;
        C1035a aVar = new C1035a(gVar.f3072a);
        C1111e eVar = new C1111e(aVar.f2683a.f69a, C1024g.abc_list_menu_item_layout);
        hVar.f3099g = eVar;
        eVar.f3061l = hVar;
        C1114g gVar2 = hVar.f3097e;
        gVar2.mo4807a((C1129m) eVar, gVar2.f3072a);
        ListAdapter a = hVar.f3099g.mo4784a();
        C0007b bVar = aVar.f2683a;
        bVar.f83o = a;
        bVar.f84p = hVar;
        View view = gVar.f3086o;
        if (view != null) {
            bVar.f75g = view;
        } else {
            bVar.f72d = gVar.f3085n;
            bVar.f74f = gVar.f3084m;
        }
        aVar.f2683a.f82n = hVar;
        C1034d a2 = aVar.mo4425a();
        hVar.f3098f = a2;
        a2.setOnDismissListener(hVar);
        LayoutParams attributes = hVar.f3098f.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        hVar.f3098f.show();
        C1130a aVar2 = this.f3061l;
        if (aVar2 != null) {
            aVar2.mo197a(rVar);
        }
        return true;
    }
}
