package p124p.p170k.p171a;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* renamed from: p.k.a.t */
public final class C1514t implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ Object f4484e;

    /* renamed from: f */
    public final /* synthetic */ C1476b0 f4485f;

    /* renamed from: g */
    public final /* synthetic */ View f4486g;

    /* renamed from: h */
    public final /* synthetic */ Fragment f4487h;

    /* renamed from: i */
    public final /* synthetic */ ArrayList f4488i;

    /* renamed from: j */
    public final /* synthetic */ ArrayList f4489j;

    /* renamed from: k */
    public final /* synthetic */ ArrayList f4490k;

    /* renamed from: l */
    public final /* synthetic */ Object f4491l;

    public C1514t(Object obj, C1476b0 b0Var, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f4484e = obj;
        this.f4485f = b0Var;
        this.f4486g = view;
        this.f4487h = fragment;
        this.f4488i = arrayList;
        this.f4489j = arrayList2;
        this.f4490k = arrayList3;
        this.f4491l = obj2;
    }

    public void run() {
        Object obj = this.f4484e;
        if (obj != null) {
            this.f4485f.mo6057b(obj, this.f4486g);
            this.f4489j.addAll(C1517w.m3882a(this.f4485f, this.f4484e, this.f4487h, this.f4488i, this.f4486g));
        }
        if (this.f4490k != null) {
            if (this.f4491l != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f4486g);
                this.f4485f.mo6051a(this.f4491l, this.f4490k, arrayList);
            }
            this.f4490k.clear();
            this.f4490k.add(this.f4486g);
        }
    }
}
