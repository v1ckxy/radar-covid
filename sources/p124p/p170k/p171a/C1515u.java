package p124p.p170k.p171a;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import p124p.p143e.C1248a;

/* renamed from: p.k.a.u */
public final class C1515u implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ Fragment f4492e;

    /* renamed from: f */
    public final /* synthetic */ Fragment f4493f;

    /* renamed from: g */
    public final /* synthetic */ boolean f4494g;

    /* renamed from: h */
    public final /* synthetic */ C1248a f4495h;

    /* renamed from: i */
    public final /* synthetic */ View f4496i;

    /* renamed from: j */
    public final /* synthetic */ C1476b0 f4497j;

    /* renamed from: k */
    public final /* synthetic */ Rect f4498k;

    public C1515u(Fragment fragment, Fragment fragment2, boolean z, C1248a aVar, View view, C1476b0 b0Var, Rect rect) {
        this.f4492e = fragment;
        this.f4493f = fragment2;
        this.f4494g = z;
        this.f4495h = aVar;
        this.f4496i = view;
        this.f4497j = b0Var;
        this.f4498k = rect;
    }

    public void run() {
        C1517w.m3885a(this.f4492e, this.f4493f, this.f4494g, this.f4495h, false);
        View view = this.f4496i;
        if (view != null) {
            this.f4497j.mo6044a(view, this.f4498k);
        }
    }
}
