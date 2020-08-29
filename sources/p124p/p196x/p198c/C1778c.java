package p124p.p196x.p198c;

import androidx.viewpager2.widget.ViewPager2.C0166g;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* renamed from: p.x.c.c */
public final class C1778c extends C0166g {

    /* renamed from: a */
    public final List<C0166g> f5202a;

    public C1778c(int i) {
        this.f5202a = new ArrayList(i);
    }

    /* renamed from: a */
    public void mo1406a(int i) {
        try {
            for (C0166g a : this.f5202a) {
                a.mo1406a(i);
            }
        } catch (ConcurrentModificationException e) {
            mo6758a(e);
            throw null;
        }
    }

    /* renamed from: a */
    public void mo1428a(int i, float f, int i2) {
        try {
            for (C0166g a : this.f5202a) {
                a.mo1428a(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            mo6758a(e);
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo6758a(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    /* renamed from: b */
    public void mo1407b(int i) {
        try {
            for (C0166g b : this.f5202a) {
                b.mo1407b(i);
            }
        } catch (ConcurrentModificationException e) {
            mo6758a(e);
            throw null;
        }
    }
}
