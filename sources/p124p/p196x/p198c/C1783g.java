package p124p.p196x.p198c;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0125p;
import androidx.recyclerview.widget.RecyclerView.C0126q;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: p.x.c.g */
public class C1783g implements C0126q {
    public C1783g(ViewPager2 viewPager2) {
    }

    /* renamed from: a */
    public void mo1251a(View view) {
        C0125p pVar = (C0125p) view.getLayoutParams();
        if (pVar.width != -1 || pVar.height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    /* renamed from: b */
    public void mo1252b(View view) {
    }
}
