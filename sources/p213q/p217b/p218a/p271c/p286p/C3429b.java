package p213q.p217b.p218a.p271c.p286p;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton.C0237a;

/* renamed from: q.b.a.c.p.b */
public class C3429b extends C0237a {

    /* renamed from: a */
    public final /* synthetic */ int f8648a;

    /* renamed from: b */
    public final /* synthetic */ BottomAppBar f8649b;

    /* renamed from: q.b.a.c.p.b$a */
    public class C3430a extends C0237a {
        public C3430a() {
        }

        /* renamed from: b */
        public void mo2135b(FloatingActionButton floatingActionButton) {
            BottomAppBar.m969c(C3429b.this.f8649b);
        }
    }

    public C3429b(BottomAppBar bottomAppBar, int i) {
        this.f8649b = bottomAppBar;
        this.f8648a = i;
    }

    /* renamed from: a */
    public void mo2134a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f8649b.mo1701b(this.f8648a));
        floatingActionButton.mo2063b(new C3430a(), true);
    }
}
