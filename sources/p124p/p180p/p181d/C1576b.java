package p124p.p180p.p181d;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0105d0;
import androidx.recyclerview.widget.RecyclerView.C0106e;
import java.util.ArrayList;
import java.util.List;
import p124p.p150h.p162l.C1404o;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.p.d.b */
public class C1576b {

    /* renamed from: a */
    public final C1578b f4602a;

    /* renamed from: b */
    public final C1577a f4603b = new C1577a();

    /* renamed from: c */
    public final List<View> f4604c = new ArrayList();

    /* renamed from: p.p.d.b$a */
    public static class C1577a {

        /* renamed from: a */
        public long f4605a = 0;

        /* renamed from: b */
        public C1577a f4606b;

        /* renamed from: a */
        public final void mo6293a() {
            if (this.f4606b == null) {
                this.f4606b = new C1577a();
            }
        }

        /* renamed from: a */
        public void mo6294a(int i) {
            if (i >= 64) {
                C1577a aVar = this.f4606b;
                if (aVar != null) {
                    aVar.mo6294a(i - 64);
                    return;
                }
                return;
            }
            this.f4605a &= ~(1 << i);
        }

        /* renamed from: a */
        public void mo6295a(int i, boolean z) {
            if (i >= 64) {
                mo6293a();
                this.f4606b.mo6295a(i - 64, z);
                return;
            }
            boolean z2 = (this.f4605a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.f4605a;
            this.f4605a = ((j2 & (~j)) << 1) | (j2 & j);
            if (z) {
                mo6300e(i);
            } else {
                mo6294a(i);
            }
            if (z2 || this.f4606b != null) {
                mo6293a();
                this.f4606b.mo6295a(0, z2);
            }
        }

        /* renamed from: b */
        public int mo6296b(int i) {
            long j;
            C1577a aVar = this.f4606b;
            if (aVar == null) {
                if (i >= 64) {
                    j = this.f4605a;
                }
                j = this.f4605a & ((1 << i) - 1);
            } else {
                if (i >= 64) {
                    return Long.bitCount(this.f4605a) + aVar.mo6296b(i - 64);
                }
                j = this.f4605a & ((1 << i) - 1);
            }
            return Long.bitCount(j);
        }

        /* renamed from: b */
        public void mo6297b() {
            this.f4605a = 0;
            C1577a aVar = this.f4606b;
            if (aVar != null) {
                aVar.mo6297b();
            }
        }

        /* renamed from: c */
        public boolean mo6298c(int i) {
            if (i >= 64) {
                mo6293a();
                return this.f4606b.mo6298c(i - 64);
            }
            return (this.f4605a & (1 << i)) != 0;
        }

        /* renamed from: d */
        public boolean mo6299d(int i) {
            if (i >= 64) {
                mo6293a();
                return this.f4606b.mo6299d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f4605a & j) != 0;
            long j2 = this.f4605a & (~j);
            this.f4605a = j2;
            long j3 = j - 1;
            this.f4605a = (j2 & j3) | Long.rotateRight((~j3) & j2, 1);
            C1577a aVar = this.f4606b;
            if (aVar != null) {
                if (aVar.mo6298c(0)) {
                    mo6300e(63);
                }
                this.f4606b.mo6299d(0);
            }
            return z;
        }

        /* renamed from: e */
        public void mo6300e(int i) {
            if (i >= 64) {
                mo6293a();
                this.f4606b.mo6300e(i - 64);
                return;
            }
            this.f4605a |= 1 << i;
        }

        public String toString() {
            if (this.f4606b == null) {
                return Long.toBinaryString(this.f4605a);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f4606b.toString());
            sb.append("xx");
            sb.append(Long.toBinaryString(this.f4605a));
            return sb.toString();
        }
    }

    /* renamed from: p.p.d.b$b */
    public interface C1578b {
    }

    public C1576b(C1578b bVar) {
        this.f4602a = bVar;
    }

    /* renamed from: a */
    public int mo6280a() {
        return ((C0106e) this.f4602a).mo1167a() - this.f4604c.size();
    }

    /* renamed from: a */
    public void mo6284a(View view, int i, boolean z) {
        int a = i < 0 ? ((C0106e) this.f4602a).mo1167a() : mo6288c(i);
        this.f4603b.mo6295a(a, z);
        if (z) {
            mo6282a(view);
        }
        C0106e eVar = (C0106e) this.f4602a;
        RecyclerView.this.addView(view, a);
        RecyclerView.this.dispatchChildAttached(view);
    }

    /* renamed from: b */
    public int mo6285b() {
        return ((C0106e) this.f4602a).mo1167a();
    }

    /* renamed from: b */
    public int mo6286b(View view) {
        int indexOfChild = RecyclerView.this.indexOfChild(view);
        if (indexOfChild != -1 && !this.f4603b.mo6298c(indexOfChild)) {
            return indexOfChild - this.f4603b.mo6296b(indexOfChild);
        }
        return -1;
    }

    /* renamed from: b */
    public View mo6287b(int i) {
        return ((C0106e) this.f4602a).mo1168a(mo6288c(i));
    }

    /* renamed from: c */
    public final int mo6288c(int i) {
        if (i < 0) {
            return -1;
        }
        int a = ((C0106e) this.f4602a).mo1167a();
        int i2 = i;
        while (i2 < a) {
            int b = i - (i2 - this.f4603b.mo6296b(i2));
            if (b == 0) {
                while (this.f4603b.mo6298c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: c */
    public boolean mo6289c(View view) {
        return this.f4604c.contains(view);
    }

    /* renamed from: d */
    public View mo6290d(int i) {
        return RecyclerView.this.getChildAt(i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4603b.toString());
        sb.append(", hidden list:");
        sb.append(this.f4604c.size());
        return sb.toString();
    }

    /* renamed from: a */
    public void mo6283a(View view, int i, LayoutParams layoutParams, boolean z) {
        int a = i < 0 ? ((C0106e) this.f4602a).mo1167a() : mo6288c(i);
        this.f4603b.mo6295a(a, z);
        if (z) {
            mo6282a(view);
        }
        C0106e eVar = (C0106e) this.f4602a;
        if (eVar != null) {
            C0105d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.mo1161l() || childViewHolderInt.mo1164o()) {
                    childViewHolderInt.f766j &= -257;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Called attach on a child which is not detached: ");
                    sb.append(childViewHolderInt);
                    throw new IllegalArgumentException(C1965a.m4746a(RecyclerView.this, sb));
                }
            }
            RecyclerView.this.attachViewToParent(view, a, layoutParams);
            return;
        }
        throw null;
    }

    /* renamed from: d */
    public final boolean mo6291d(View view) {
        if (!this.f4604c.remove(view)) {
            return false;
        }
        C0106e eVar = (C0106e) this.f4602a;
        if (eVar != null) {
            C0105d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                RecyclerView.this.setChildImportantForAccessibilityInternal(childViewHolderInt, childViewHolderInt.f772p);
                childViewHolderInt.f772p = 0;
            }
            return true;
        }
        throw null;
    }

    /* renamed from: a */
    public void mo6281a(int i) {
        int c = mo6288c(i);
        this.f4603b.mo6299d(c);
        C0106e eVar = (C0106e) this.f4602a;
        View childAt = RecyclerView.this.getChildAt(c);
        if (childAt != null) {
            C0105d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.mo1161l() || childViewHolderInt.mo1164o()) {
                    childViewHolderInt.mo1145a(256);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("called detach on an already detached child ");
                    sb.append(childViewHolderInt);
                    throw new IllegalArgumentException(C1965a.m4746a(RecyclerView.this, sb));
                }
            }
        }
        RecyclerView.this.detachViewFromParent(c);
    }

    /* renamed from: a */
    public final void mo6282a(View view) {
        this.f4604c.add(view);
        C0106e eVar = (C0106e) this.f4602a;
        if (eVar != null) {
            C0105d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                RecyclerView recyclerView = RecyclerView.this;
                int i = childViewHolderInt.f773q;
                if (i == -1) {
                    i = C1404o.m3549j(childViewHolderInt.f757a);
                }
                childViewHolderInt.f772p = i;
                recyclerView.setChildImportantForAccessibilityInternal(childViewHolderInt, 4);
                return;
            }
            return;
        }
        throw null;
    }
}
