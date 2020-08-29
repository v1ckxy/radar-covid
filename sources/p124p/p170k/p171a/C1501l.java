package p124p.p170k.p171a;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import androidx.fragment.app.Fragment;

/* renamed from: p.k.a.l */
public class C1501l implements AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f4421a;

    /* renamed from: b */
    public final /* synthetic */ Fragment f4422b;

    /* renamed from: c */
    public final /* synthetic */ C1490k f4423c;

    /* renamed from: p.k.a.l$a */
    public class C1502a implements Runnable {
        public C1502a() {
        }

        public void run() {
            if (C1501l.this.f4422b.mo778R() != null) {
                C1501l.this.f4422b.mo794a((View) null);
                C1501l lVar = C1501l.this;
                C1490k kVar = lVar.f4423c;
                Fragment fragment = lVar.f4422b;
                kVar.mo6104a(fragment, fragment.mo804c0(), 0, 0, false);
            }
        }
    }

    public C1501l(C1490k kVar, ViewGroup viewGroup, Fragment fragment) {
        this.f4423c = kVar;
        this.f4421a = viewGroup;
        this.f4422b = fragment;
    }

    public void onAnimationEnd(Animation animation) {
        this.f4421a.post(new C1502a());
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
