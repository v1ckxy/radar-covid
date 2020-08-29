package p124p.p196x.p197b;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.FrameLayout;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/* renamed from: p.x.b.a */
public class C1769a implements OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ FrameLayout f5191a;

    /* renamed from: b */
    public final /* synthetic */ C1774f f5192b;

    /* renamed from: c */
    public final /* synthetic */ FragmentStateAdapter f5193c;

    public C1769a(FragmentStateAdapter fragmentStateAdapter, FrameLayout frameLayout, C1774f fVar) {
        this.f5193c = fragmentStateAdapter;
        this.f5191a = frameLayout;
        this.f5192b = fVar;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f5191a.getParent() != null) {
            this.f5191a.removeOnLayoutChangeListener(this);
            this.f5193c.mo1361a(this.f5192b);
        }
    }
}
