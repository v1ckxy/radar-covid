package p124p.p170k.p171a;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import p124p.p143e.C1248a;
import p124p.p170k.p171a.C1517w.C1518a;

/* renamed from: p.k.a.v */
public final class C1516v implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C1476b0 f4499e;

    /* renamed from: f */
    public final /* synthetic */ C1248a f4500f;

    /* renamed from: g */
    public final /* synthetic */ Object f4501g;

    /* renamed from: h */
    public final /* synthetic */ C1518a f4502h;

    /* renamed from: i */
    public final /* synthetic */ ArrayList f4503i;

    /* renamed from: j */
    public final /* synthetic */ View f4504j;

    /* renamed from: k */
    public final /* synthetic */ Fragment f4505k;

    /* renamed from: l */
    public final /* synthetic */ Fragment f4506l;

    /* renamed from: m */
    public final /* synthetic */ boolean f4507m;

    /* renamed from: n */
    public final /* synthetic */ ArrayList f4508n;

    /* renamed from: o */
    public final /* synthetic */ Object f4509o;

    /* renamed from: p */
    public final /* synthetic */ Rect f4510p;

    public C1516v(C1476b0 b0Var, C1248a aVar, Object obj, C1518a aVar2, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f4499e = b0Var;
        this.f4500f = aVar;
        this.f4501g = obj;
        this.f4502h = aVar2;
        this.f4503i = arrayList;
        this.f4504j = view;
        this.f4505k = fragment;
        this.f4506l = fragment2;
        this.f4507m = z;
        this.f4508n = arrayList2;
        this.f4509o = obj2;
        this.f4510p = rect;
    }

    public void run() {
        C1248a a = C1517w.m3883a(this.f4499e, this.f4500f, this.f4501g, this.f4502h);
        if (a != null) {
            this.f4503i.addAll(a.values());
            this.f4503i.add(this.f4504j);
        }
        C1517w.m3885a(this.f4505k, this.f4506l, this.f4507m, a, false);
        Object obj = this.f4501g;
        if (obj != null) {
            this.f4499e.mo6059b(obj, this.f4508n, this.f4503i);
            View a2 = C1517w.m3878a(a, this.f4502h, this.f4509o, this.f4507m);
            if (a2 != null) {
                this.f4499e.mo6044a(a2, this.f4510p);
            }
        }
    }
}
