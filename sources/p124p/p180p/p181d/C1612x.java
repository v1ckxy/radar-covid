package p124p.p180p.p181d;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0120o;
import androidx.recyclerview.widget.RecyclerView.C0127r;
import androidx.recyclerview.widget.RecyclerView.C0129t;
import androidx.recyclerview.widget.RecyclerView.C0137z;
import androidx.recyclerview.widget.RecyclerView.C0137z.C0139b;

/* renamed from: p.p.d.x */
public abstract class C1612x extends C0127r {

    /* renamed from: a */
    public RecyclerView f4740a;

    /* renamed from: b */
    public Scroller f4741b;

    /* renamed from: c */
    public final C0129t f4742c = new C1613a();

    /* renamed from: p.p.d.x$a */
    public class C1613a extends C0129t {

        /* renamed from: a */
        public boolean f4743a = false;

        public C1613a() {
        }

        /* renamed from: a */
        public void mo1256a(RecyclerView recyclerView, int i) {
            if (i == 0 && this.f4743a) {
                this.f4743a = false;
                C1612x.this.mo6375a();
            }
        }

        /* renamed from: a */
        public void mo1257a(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f4743a = true;
            }
        }
    }

    /* renamed from: a */
    public abstract int mo6348a(C0120o oVar, int i, int i2);

    /* renamed from: a */
    public void mo6375a() {
        RecyclerView recyclerView = this.f4740a;
        if (recyclerView != null) {
            C0120o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                View b = mo1433b(layoutManager);
                if (b != null) {
                    int[] a = mo6351a(layoutManager, b);
                    if (!(a[0] == 0 && a[1] == 0)) {
                        this.f4740a.smoothScrollBy(a[0], a[1]);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6376a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4740a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeOnScrollListener(this.f4742c);
                this.f4740a.setOnFlingListener(null);
            }
            this.f4740a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() == null) {
                    this.f4740a.addOnScrollListener(this.f4742c);
                    this.f4740a.setOnFlingListener(this);
                    this.f4741b = new Scroller(this.f4740a.getContext(), new DecelerateInterpolator());
                    mo6375a();
                } else {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
            }
        }
    }

    /* renamed from: a */
    public abstract int[] mo6351a(C0120o oVar, View view);

    /* renamed from: b */
    public abstract View mo1433b(C0120o oVar);

    /* renamed from: a */
    public C0137z mo6371a(C0120o oVar) {
        if (!(oVar instanceof C0139b)) {
            return null;
        }
        return new C1614y(this, this.f4740a.getContext());
    }
}
