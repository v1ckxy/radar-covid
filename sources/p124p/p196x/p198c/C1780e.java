package p124p.p196x.p198c;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2.C0166g;
import androidx.viewpager2.widget.ViewPager2.C0171i;
import java.util.Locale;

/* renamed from: p.x.c.e */
public final class C1780e extends C0166g {

    /* renamed from: a */
    public final LinearLayoutManager f5204a;

    /* renamed from: b */
    public C0171i f5205b;

    public C1780e(LinearLayoutManager linearLayoutManager) {
        this.f5204a = linearLayoutManager;
    }

    /* renamed from: a */
    public void mo1406a(int i) {
    }

    /* renamed from: a */
    public void mo1428a(int i, float f, int i2) {
        if (this.f5205b != null) {
            float f2 = -f;
            int i3 = 0;
            while (i3 < this.f5204a.mo1222d()) {
                View c = this.f5204a.mo1219c(i3);
                if (c != null) {
                    this.f5205b.mo1432a(c, ((float) (this.f5204a.mo1237i(c) - i)) + f2);
                    i3++;
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.f5204a.mo1222d())}));
                }
            }
        }
    }

    /* renamed from: b */
    public void mo1407b(int i) {
    }
}
