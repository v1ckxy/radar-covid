package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView.C0099a0;
import androidx.recyclerview.widget.RecyclerView.C0105d0;
import androidx.recyclerview.widget.RecyclerView.C0120o;
import androidx.recyclerview.widget.RecyclerView.C0120o.C0123c;
import androidx.recyclerview.widget.RecyclerView.C0120o.C0124d;
import androidx.recyclerview.widget.RecyclerView.C0125p;
import androidx.recyclerview.widget.RecyclerView.C0132v;
import androidx.recyclerview.widget.RecyclerView.C0137z;
import androidx.recyclerview.widget.RecyclerView.C0137z.C0139b;
import java.util.List;
import p124p.p126b.p127k.C1061o;
import p124p.p180p.p181d.C1595m.C1597b;
import p124p.p180p.p181d.C1600o;
import p124p.p180p.p181d.C1606t;
import p213q.p214a.p215a.p216a.C1965a;

public class LinearLayoutManager extends C0120o implements C0139b {

    /* renamed from: A */
    public int f691A = -1;

    /* renamed from: B */
    public int f692B = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: C */
    public C0096d f693C = null;

    /* renamed from: D */
    public final C0093a f694D = new C0093a();

    /* renamed from: E */
    public final C0094b f695E = new C0094b();

    /* renamed from: F */
    public int f696F = 2;

    /* renamed from: G */
    public int[] f697G = new int[2];

    /* renamed from: s */
    public int f698s = 1;

    /* renamed from: t */
    public C0095c f699t;

    /* renamed from: u */
    public C1606t f700u;

    /* renamed from: v */
    public boolean f701v;

    /* renamed from: w */
    public boolean f702w = false;

    /* renamed from: x */
    public boolean f703x = false;

    /* renamed from: y */
    public boolean f704y = false;

    /* renamed from: z */
    public boolean f705z = true;

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C0093a {

        /* renamed from: a */
        public C1606t f706a;

        /* renamed from: b */
        public int f707b;

        /* renamed from: c */
        public int f708c;

        /* renamed from: d */
        public boolean f709d;

        /* renamed from: e */
        public boolean f710e;

        public C0093a() {
            mo932b();
        }

        /* renamed from: a */
        public void mo930a() {
            this.f708c = this.f709d ? this.f706a.mo6357b() : this.f706a.mo6365f();
        }

        /* renamed from: a */
        public void mo931a(View view, int i) {
            if (this.f709d) {
                this.f708c = this.f706a.mo6368h() + this.f706a.mo6355a(view);
            } else {
                this.f708c = this.f706a.mo6362d(view);
            }
            this.f707b = i;
        }

        /* renamed from: b */
        public void mo932b() {
            this.f707b = -1;
            this.f708c = RecyclerView.UNDEFINED_DURATION;
            this.f709d = false;
            this.f710e = false;
        }

        /* renamed from: b */
        public void mo933b(View view, int i) {
            int i2;
            int h = this.f706a.mo6368h();
            if (h >= 0) {
                mo931a(view, i);
                return;
            }
            this.f707b = i;
            if (this.f709d) {
                int b = (this.f706a.mo6357b() - h) - this.f706a.mo6355a(view);
                this.f708c = this.f706a.mo6357b() - b;
                if (b > 0) {
                    int b2 = this.f708c - this.f706a.mo6358b(view);
                    int f = this.f706a.mo6365f();
                    int min = b2 - (Math.min(this.f706a.mo6362d(view) - f, 0) + f);
                    if (min < 0) {
                        i2 = Math.min(b, -min) + this.f708c;
                    }
                }
            }
            int d = this.f706a.mo6362d(view);
            int f2 = d - this.f706a.mo6365f();
            this.f708c = d;
            if (f2 > 0) {
                int b3 = (this.f706a.mo6357b() - Math.min(0, (this.f706a.mo6357b() - h) - this.f706a.mo6355a(view))) - (this.f706a.mo6358b(view) + d);
                if (b3 < 0) {
                    i2 = this.f708c - Math.min(f2, -b3);
                }
            }
            this.f708c = i2;
        }

        public String toString() {
            StringBuilder a = C1965a.m4756a("AnchorInfo{mPosition=");
            a.append(this.f707b);
            a.append(", mCoordinate=");
            a.append(this.f708c);
            a.append(", mLayoutFromEnd=");
            a.append(this.f709d);
            a.append(", mValid=");
            a.append(this.f710e);
            a.append('}');
            return a.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C0094b {

        /* renamed from: a */
        public int f711a;

        /* renamed from: b */
        public boolean f712b;

        /* renamed from: c */
        public boolean f713c;

        /* renamed from: d */
        public boolean f714d;
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C0095c {

        /* renamed from: a */
        public boolean f715a = true;

        /* renamed from: b */
        public int f716b;

        /* renamed from: c */
        public int f717c;

        /* renamed from: d */
        public int f718d;

        /* renamed from: e */
        public int f719e;

        /* renamed from: f */
        public int f720f;

        /* renamed from: g */
        public int f721g;

        /* renamed from: h */
        public int f722h = 0;

        /* renamed from: i */
        public int f723i = 0;

        /* renamed from: j */
        public boolean f724j;

        /* renamed from: k */
        public int f725k;

        /* renamed from: l */
        public List<C0105d0> f726l = null;

        /* renamed from: m */
        public boolean f727m;

        /* renamed from: a */
        public void mo936a(View view) {
            int i;
            int size = this.f726l.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = ((C0105d0) this.f726l.get(i3)).f757a;
                C0125p pVar = (C0125p) view3.getLayoutParams();
                if (view3 != view && !pVar.mo1250c()) {
                    int a = (pVar.mo1248a() - this.f718d) * this.f719e;
                    if (a >= 0 && a < i2) {
                        view2 = view3;
                        if (a == 0) {
                            break;
                        }
                        i2 = a;
                    }
                }
            }
            if (view2 == null) {
                i = -1;
            } else {
                i = ((C0125p) view2.getLayoutParams()).mo1248a();
            }
            this.f718d = i;
        }

        /* renamed from: a */
        public boolean mo937a(C0099a0 a0Var) {
            int i = this.f718d;
            return i >= 0 && i < a0Var.mo1135a();
        }

        /* renamed from: a */
        public View mo935a(C0132v vVar) {
            View view;
            List<C0105d0> list = this.f726l;
            int i = 0;
            if (list != null) {
                int size = list.size();
                while (true) {
                    if (i >= size) {
                        view = null;
                        break;
                    }
                    view = ((C0105d0) this.f726l.get(i)).f757a;
                    C0125p pVar = (C0125p) view.getLayoutParams();
                    if (!pVar.mo1250c() && this.f718d == pVar.mo1248a()) {
                        mo936a(view);
                        break;
                    }
                    i++;
                }
                return view;
            }
            View view2 = vVar.mo1261a(this.f718d, false, RecyclerView.FOREVER_NS).f757a;
            this.f718d += this.f719e;
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    public static class C0096d implements Parcelable {
        public static final Creator<C0096d> CREATOR = new C0097a();

        /* renamed from: e */
        public int f728e;

        /* renamed from: f */
        public int f729f;

        /* renamed from: g */
        public boolean f730g;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        public class C0097a implements Creator<C0096d> {
            public Object createFromParcel(Parcel parcel) {
                return new C0096d(parcel);
            }

            public Object[] newArray(int i) {
                return new C0096d[i];
            }
        }

        public C0096d() {
        }

        public C0096d(Parcel parcel) {
            this.f728e = parcel.readInt();
            this.f729f = parcel.readInt();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f730g = z;
        }

        public C0096d(C0096d dVar) {
            this.f728e = dVar.f728e;
            this.f729f = dVar.f729f;
            this.f730g = dVar.f730g;
        }

        /* renamed from: a */
        public boolean mo938a() {
            return this.f728e >= 0;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f728e);
            parcel.writeInt(this.f729f);
            parcel.writeInt(this.f730g ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i, boolean z) {
        mo918j(i);
        mo900a((String) null);
        if (z != this.f702w) {
            this.f702w = z;
            mo1242p();
        }
    }

    /* renamed from: a */
    public int mo845a(int i, C0132v vVar, C0099a0 a0Var) {
        if (this.f698s == 1) {
            return 0;
        }
        return mo906c(i, vVar, a0Var);
    }

    /* renamed from: a */
    public final int mo884a(int i, C0132v vVar, C0099a0 a0Var, boolean z) {
        int b = this.f700u.mo6357b() - i;
        if (b <= 0) {
            return 0;
        }
        int i2 = -mo906c(-b, vVar, a0Var);
        int i3 = i + i2;
        if (z) {
            int b2 = this.f700u.mo6357b() - i3;
            if (b2 > 0) {
                this.f700u.mo6356a(b2);
                return b2 + i2;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public int mo885a(C0099a0 a0Var) {
        return mo913h(a0Var);
    }

    /* renamed from: a */
    public PointF mo887a(int i) {
        if (mo1222d() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo1237i(mo1219c(0))) {
            z = true;
        }
        if (z != this.f703x) {
            i2 = -1;
        }
        return this.f698s == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
    }

    /* renamed from: a */
    public View mo888a(int i, int i2, boolean z, boolean z2) {
        mo922s();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return (this.f698s == 0 ? this.f798e : this.f799f).mo6377a(i, i2, i4, i3);
    }

    /* renamed from: a */
    public View mo849a(C0132v vVar, C0099a0 a0Var, int i, int i2, int i3) {
        mo922s();
        int f = this.f700u.mo6365f();
        int b = this.f700u.mo6357b();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View c = mo1219c(i);
            int i5 = mo1237i(c);
            int d = this.f700u.mo6362d(c);
            int a = this.f700u.mo6355a(c);
            if (i5 >= 0 && i5 < i3) {
                if (((C0125p) c.getLayoutParams()).mo1250c()) {
                    if (view2 == null) {
                        view2 = c;
                    }
                } else if ((d < b || a <= b) && (a > f || d >= f)) {
                    return c;
                } else {
                    if (view == null) {
                        view = c;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            view = view2;
        }
        return view;
    }

    /* renamed from: a */
    public View mo889a(boolean z, boolean z2) {
        int d;
        int i;
        if (this.f703x) {
            d = 0;
            i = mo1222d();
        } else {
            d = mo1222d() - 1;
            i = -1;
        }
        return mo888a(d, i, z, z2);
    }

    /* renamed from: a */
    public void mo890a(int i, int i2, C0099a0 a0Var, C0123c cVar) {
        if (this.f698s != 0) {
            i = i2;
        }
        if (mo1222d() != 0 && i != 0) {
            mo922s();
            mo891a(i > 0 ? 1 : -1, Math.abs(i), true, a0Var);
            mo854a(a0Var, this.f699t, cVar);
        }
    }

    /* renamed from: a */
    public final void mo891a(int i, int i2, boolean z, C0099a0 a0Var) {
        int i3;
        this.f699t.f727m = mo928y();
        this.f699t.f720f = i;
        int[] iArr = this.f697G;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        mo895a(a0Var, iArr);
        int max = Math.max(0, this.f697G[0]);
        int max2 = Math.max(0, this.f697G[1]);
        if (i == 1) {
            z2 = true;
        }
        this.f699t.f722h = z2 ? max2 : max;
        C0095c cVar = this.f699t;
        if (!z2) {
            max = max2;
        }
        cVar.f723i = max;
        if (z2) {
            C0095c cVar2 = this.f699t;
            cVar2.f722h = this.f700u.mo6359c() + cVar2.f722h;
            View v = mo925v();
            C0095c cVar3 = this.f699t;
            if (this.f703x) {
                i4 = -1;
            }
            cVar3.f719e = i4;
            C0095c cVar4 = this.f699t;
            int i5 = mo1237i(v);
            C0095c cVar5 = this.f699t;
            cVar4.f718d = i5 + cVar5.f719e;
            cVar5.f716b = this.f700u.mo6355a(v);
            i3 = this.f700u.mo6355a(v) - this.f700u.mo6357b();
        } else {
            View w = mo926w();
            C0095c cVar6 = this.f699t;
            cVar6.f722h = this.f700u.mo6365f() + cVar6.f722h;
            C0095c cVar7 = this.f699t;
            if (!this.f703x) {
                i4 = -1;
            }
            cVar7.f719e = i4;
            C0095c cVar8 = this.f699t;
            int i6 = mo1237i(w);
            C0095c cVar9 = this.f699t;
            cVar8.f718d = i6 + cVar9.f719e;
            cVar9.f716b = this.f700u.mo6362d(w);
            i3 = (-this.f700u.mo6362d(w)) + this.f700u.mo6365f();
        }
        C0095c cVar10 = this.f699t;
        cVar10.f717c = i2;
        if (z) {
            cVar10.f717c = i2 - i3;
        }
        this.f699t.f721g = i3;
    }

    /* renamed from: a */
    public void mo892a(int i, C0123c cVar) {
        boolean z;
        int i2;
        C0096d dVar = this.f693C;
        int i3 = -1;
        if (dVar == null || !dVar.mo938a()) {
            mo929z();
            z = this.f703x;
            i2 = this.f691A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            C0096d dVar2 = this.f693C;
            z = dVar2.f730g;
            i2 = dVar2.f728e;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f696F && i2 >= 0 && i2 < i; i4++) {
            ((C1597b) cVar).mo6339a(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: a */
    public void mo894a(AccessibilityEvent accessibilityEvent) {
        super.mo894a(accessibilityEvent);
        if (mo1222d() > 0) {
            accessibilityEvent.setFromIndex(mo923t());
            accessibilityEvent.setToIndex(mo924u());
        }
    }

    /* renamed from: a */
    public void mo854a(C0099a0 a0Var, C0095c cVar, C0123c cVar2) {
        int i = cVar.f718d;
        if (i >= 0 && i < a0Var.mo1135a()) {
            ((C1597b) cVar2).mo6339a(i, Math.max(0, cVar.f721g));
        }
    }

    /* renamed from: a */
    public final void mo896a(C0132v vVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo1199a(i3, vVar);
                }
            } else {
                while (i > i2) {
                    mo1199a(i, vVar);
                    i--;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo856a(C0132v vVar, C0099a0 a0Var, C0093a aVar, int i) {
    }

    /* renamed from: a */
    public void mo899a(RecyclerView recyclerView, C0132v vVar) {
    }

    /* renamed from: a */
    public void mo900a(String str) {
        if (this.f693C == null) {
            RecyclerView recyclerView = this.f795b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }
    }

    /* renamed from: a */
    public void mo862a(boolean z) {
        mo900a((String) null);
        if (this.f704y != z) {
            this.f704y = z;
            mo1242p();
        }
    }

    /* renamed from: a */
    public boolean mo901a() {
        return this.f698s == 0;
    }

    /* renamed from: b */
    public int mo864b(int i, C0132v vVar, C0099a0 a0Var) {
        if (this.f698s == 0) {
            return 0;
        }
        return mo906c(i, vVar, a0Var);
    }

    /* renamed from: b */
    public final int mo902b(int i, C0132v vVar, C0099a0 a0Var, boolean z) {
        int f = i - this.f700u.mo6365f();
        if (f <= 0) {
            return 0;
        }
        int i2 = -mo906c(f, vVar, a0Var);
        int i3 = i + i2;
        if (z) {
            int f2 = i3 - this.f700u.mo6365f();
            if (f2 > 0) {
                this.f700u.mo6356a(-f2);
                i2 -= f2;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public int mo865b(C0099a0 a0Var) {
        return mo916i(a0Var);
    }

    /* renamed from: b */
    public View mo903b(int i) {
        int d = mo1222d();
        if (d == 0) {
            return null;
        }
        int i2 = i - mo1237i(mo1219c(0));
        if (i2 >= 0 && i2 < d) {
            View c = mo1219c(i2);
            if (mo1237i(c) == i) {
                return c;
            }
        }
        return super.mo903b(i);
    }

    /* renamed from: b */
    public View mo904b(boolean z, boolean z2) {
        int i;
        int d;
        if (this.f703x) {
            i = mo1222d() - 1;
            d = -1;
        } else {
            i = 0;
            d = mo1222d();
        }
        return mo888a(i, d, z, z2);
    }

    /* renamed from: b */
    public boolean mo905b() {
        return this.f698s == 1;
    }

    /* renamed from: c */
    public int mo906c(int i, C0132v vVar, C0099a0 a0Var) {
        if (mo1222d() == 0 || i == 0) {
            return 0;
        }
        mo922s();
        this.f699t.f715a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        mo891a(i2, abs, true, a0Var);
        C0095c cVar = this.f699t;
        int a = mo886a(vVar, cVar, a0Var, false) + cVar.f721g;
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.f700u.mo6356a(-i);
        this.f699t.f725k = i;
        return i;
    }

    /* renamed from: c */
    public int mo870c(C0099a0 a0Var) {
        return mo917j(a0Var);
    }

    /* renamed from: c */
    public View mo907c(int i, int i2) {
        int i3;
        int i4;
        mo922s();
        char c = i2 > i ? 1 : i2 < i ? (char) 65535 : 0;
        if (c == 0) {
            return mo1219c(i);
        }
        if (this.f700u.mo6362d(mo1219c(i)) < this.f700u.mo6365f()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return (this.f698s == 0 ? this.f798e : this.f799f).mo6377a(i, i2, i4, i3);
    }

    /* renamed from: c */
    public C0125p mo872c() {
        return new C0125p(-2, -2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0177  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo873c(androidx.recyclerview.widget.RecyclerView.C0132v r17, androidx.recyclerview.widget.RecyclerView.C0099a0 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f693C
            r4 = -1
            if (r3 != 0) goto L_0x000f
            int r3 = r0.f691A
            if (r3 == r4) goto L_0x0019
        L_0x000f:
            int r3 = r18.mo1135a()
            if (r3 != 0) goto L_0x0019
            r16.mo1215b(r17)
            return
        L_0x0019:
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f693C
            if (r3 == 0) goto L_0x0029
            boolean r3 = r3.mo938a()
            if (r3 == 0) goto L_0x0029
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f693C
            int r3 = r3.f728e
            r0.f691A = r3
        L_0x0029:
            r16.mo922s()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f699t
            r5 = 0
            r3.f715a = r5
            r16.mo929z()
            android.view.View r3 = r16.mo1226e()
            androidx.recyclerview.widget.LinearLayoutManager$a r6 = r0.f694D
            boolean r6 = r6.f710e
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 1
            if (r6 == 0) goto L_0x0073
            int r6 = r0.f691A
            if (r6 != r4) goto L_0x0073
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.f693C
            if (r6 == 0) goto L_0x004a
            goto L_0x0073
        L_0x004a:
            if (r3 == 0) goto L_0x022f
            p.p.d.t r6 = r0.f700u
            int r6 = r6.mo6362d(r3)
            p.p.d.t r9 = r0.f700u
            int r9 = r9.mo6357b()
            if (r6 >= r9) goto L_0x0068
            p.p.d.t r6 = r0.f700u
            int r6 = r6.mo6355a(r3)
            p.p.d.t r9 = r0.f700u
            int r9 = r9.mo6365f()
            if (r6 > r9) goto L_0x022f
        L_0x0068:
            androidx.recyclerview.widget.LinearLayoutManager$a r6 = r0.f694D
            int r9 = r0.mo1237i(r3)
            r6.mo933b(r3, r9)
            goto L_0x022f
        L_0x0073:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f694D
            r3.mo932b()
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f694D
            boolean r6 = r0.f703x
            boolean r9 = r0.f704y
            r6 = r6 ^ r9
            r3.f709d = r6
            boolean r6 = r2.f738g
            if (r6 != 0) goto L_0x0172
            int r6 = r0.f691A
            if (r6 != r4) goto L_0x008b
            goto L_0x0172
        L_0x008b:
            if (r6 < 0) goto L_0x016e
            int r9 = r18.mo1135a()
            if (r6 < r9) goto L_0x0095
            goto L_0x016e
        L_0x0095:
            int r6 = r0.f691A
            r3.f707b = r6
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.f693C
            if (r6 == 0) goto L_0x00c3
            boolean r6 = r6.mo938a()
            if (r6 == 0) goto L_0x00c3
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.f693C
            boolean r6 = r6.f730g
            r3.f709d = r6
            if (r6 == 0) goto L_0x00b7
            p.p.d.t r6 = r0.f700u
            int r6 = r6.mo6357b()
            androidx.recyclerview.widget.LinearLayoutManager$d r9 = r0.f693C
            int r9 = r9.f729f
            goto L_0x015f
        L_0x00b7:
            p.p.d.t r6 = r0.f700u
            int r6 = r6.mo6365f()
            androidx.recyclerview.widget.LinearLayoutManager$d r9 = r0.f693C
            int r9 = r9.f729f
            goto L_0x0169
        L_0x00c3:
            int r6 = r0.f692B
            if (r6 != r7) goto L_0x0151
            int r6 = r0.f691A
            android.view.View r6 = r0.mo903b(r6)
            if (r6 == 0) goto L_0x012f
            p.p.d.t r9 = r0.f700u
            int r9 = r9.mo6358b(r6)
            p.p.d.t r10 = r0.f700u
            int r10 = r10.mo6367g()
            if (r9 <= r10) goto L_0x00df
            goto L_0x014d
        L_0x00df:
            p.p.d.t r9 = r0.f700u
            int r9 = r9.mo6362d(r6)
            p.p.d.t r10 = r0.f700u
            int r10 = r10.mo6365f()
            int r9 = r9 - r10
            if (r9 >= 0) goto L_0x00fa
            p.p.d.t r6 = r0.f700u
            int r6 = r6.mo6365f()
            r3.f708c = r6
            r3.f709d = r5
            goto L_0x016c
        L_0x00fa:
            p.p.d.t r9 = r0.f700u
            int r9 = r9.mo6357b()
            p.p.d.t r10 = r0.f700u
            int r10 = r10.mo6355a(r6)
            int r9 = r9 - r10
            if (r9 >= 0) goto L_0x0114
            p.p.d.t r6 = r0.f700u
            int r6 = r6.mo6357b()
            r3.f708c = r6
            r3.f709d = r8
            goto L_0x016c
        L_0x0114:
            boolean r9 = r3.f709d
            if (r9 == 0) goto L_0x0126
            p.p.d.t r9 = r0.f700u
            int r6 = r9.mo6355a(r6)
            p.p.d.t r9 = r0.f700u
            int r9 = r9.mo6368h()
            int r9 = r9 + r6
            goto L_0x012c
        L_0x0126:
            p.p.d.t r9 = r0.f700u
            int r9 = r9.mo6362d(r6)
        L_0x012c:
            r3.f708c = r9
            goto L_0x016c
        L_0x012f:
            int r6 = r16.mo1222d()
            if (r6 <= 0) goto L_0x014d
            android.view.View r6 = r0.mo1219c(r5)
            int r6 = r0.mo1237i(r6)
            int r9 = r0.f691A
            if (r9 >= r6) goto L_0x0143
            r6 = r8
            goto L_0x0144
        L_0x0143:
            r6 = r5
        L_0x0144:
            boolean r9 = r0.f703x
            if (r6 != r9) goto L_0x014a
            r6 = r8
            goto L_0x014b
        L_0x014a:
            r6 = r5
        L_0x014b:
            r3.f709d = r6
        L_0x014d:
            r3.mo930a()
            goto L_0x016c
        L_0x0151:
            boolean r6 = r0.f703x
            r3.f709d = r6
            if (r6 == 0) goto L_0x0161
            p.p.d.t r6 = r0.f700u
            int r6 = r6.mo6357b()
            int r9 = r0.f692B
        L_0x015f:
            int r6 = r6 - r9
            goto L_0x016a
        L_0x0161:
            p.p.d.t r6 = r0.f700u
            int r6 = r6.mo6365f()
            int r9 = r0.f692B
        L_0x0169:
            int r6 = r6 + r9
        L_0x016a:
            r3.f708c = r6
        L_0x016c:
            r6 = r8
            goto L_0x0173
        L_0x016e:
            r0.f691A = r4
            r0.f692B = r7
        L_0x0172:
            r6 = r5
        L_0x0173:
            if (r6 == 0) goto L_0x0177
            goto L_0x022b
        L_0x0177:
            int r6 = r16.mo1222d()
            if (r6 != 0) goto L_0x017f
            goto L_0x0217
        L_0x017f:
            android.view.View r6 = r16.mo1226e()
            if (r6 == 0) goto L_0x01af
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$p r9 = (androidx.recyclerview.widget.RecyclerView.C0125p) r9
            boolean r10 = r9.mo1250c()
            if (r10 != 0) goto L_0x01a3
            int r10 = r9.mo1248a()
            if (r10 < 0) goto L_0x01a3
            int r9 = r9.mo1248a()
            int r10 = r18.mo1135a()
            if (r9 >= r10) goto L_0x01a3
            r9 = r8
            goto L_0x01a4
        L_0x01a3:
            r9 = r5
        L_0x01a4:
            if (r9 == 0) goto L_0x01af
            int r9 = r0.mo1237i(r6)
            r3.mo933b(r6, r9)
            goto L_0x0215
        L_0x01af:
            boolean r6 = r0.f701v
            boolean r9 = r0.f704y
            if (r6 == r9) goto L_0x01b7
            goto L_0x0217
        L_0x01b7:
            boolean r6 = r3.f709d
            if (r6 == 0) goto L_0x01c9
            boolean r6 = r0.f703x
            if (r6 == 0) goto L_0x01c4
            android.view.View r6 = r16.mo909d(r17, r18)
            goto L_0x01d6
        L_0x01c4:
            android.view.View r6 = r16.mo911e(r17, r18)
            goto L_0x01d6
        L_0x01c9:
            boolean r6 = r0.f703x
            if (r6 == 0) goto L_0x01d2
            android.view.View r6 = r16.mo911e(r17, r18)
            goto L_0x01d6
        L_0x01d2:
            android.view.View r6 = r16.mo909d(r17, r18)
        L_0x01d6:
            if (r6 == 0) goto L_0x0217
            int r9 = r0.mo1237i(r6)
            r3.mo931a(r6, r9)
            boolean r9 = r2.f738g
            if (r9 != 0) goto L_0x0215
            boolean r9 = r16.mo880r()
            if (r9 == 0) goto L_0x0215
            p.p.d.t r9 = r0.f700u
            int r9 = r9.mo6362d(r6)
            p.p.d.t r10 = r0.f700u
            int r6 = r10.mo6355a(r6)
            p.p.d.t r10 = r0.f700u
            int r10 = r10.mo6365f()
            p.p.d.t r11 = r0.f700u
            int r11 = r11.mo6357b()
            if (r9 < r11) goto L_0x0205
            if (r6 > r11) goto L_0x0209
        L_0x0205:
            if (r6 > r10) goto L_0x020b
            if (r9 >= r10) goto L_0x020b
        L_0x0209:
            r6 = r8
            goto L_0x020c
        L_0x020b:
            r6 = r5
        L_0x020c:
            if (r6 == 0) goto L_0x0215
            boolean r6 = r3.f709d
            if (r6 == 0) goto L_0x0213
            r10 = r11
        L_0x0213:
            r3.f708c = r10
        L_0x0215:
            r6 = r8
            goto L_0x0218
        L_0x0217:
            r6 = r5
        L_0x0218:
            if (r6 == 0) goto L_0x021b
            goto L_0x022b
        L_0x021b:
            r3.mo930a()
            boolean r6 = r0.f704y
            if (r6 == 0) goto L_0x0228
            int r6 = r18.mo1135a()
            int r6 = r6 + r4
            goto L_0x0229
        L_0x0228:
            r6 = r5
        L_0x0229:
            r3.f707b = r6
        L_0x022b:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f694D
            r3.f710e = r8
        L_0x022f:
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f699t
            int r6 = r3.f725k
            if (r6 < 0) goto L_0x0237
            r6 = r8
            goto L_0x0238
        L_0x0237:
            r6 = r4
        L_0x0238:
            r3.f720f = r6
            int[] r3 = r0.f697G
            r3[r5] = r5
            r3[r8] = r5
            r0.mo895a(r2, r3)
            int[] r3 = r0.f697G
            r3 = r3[r5]
            int r3 = java.lang.Math.max(r5, r3)
            p.p.d.t r6 = r0.f700u
            int r6 = r6.mo6365f()
            int r6 = r6 + r3
            int[] r3 = r0.f697G
            r3 = r3[r8]
            int r3 = java.lang.Math.max(r5, r3)
            p.p.d.t r9 = r0.f700u
            int r9 = r9.mo6359c()
            int r9 = r9 + r3
            boolean r3 = r2.f738g
            if (r3 == 0) goto L_0x029c
            int r3 = r0.f691A
            if (r3 == r4) goto L_0x029c
            int r10 = r0.f692B
            if (r10 == r7) goto L_0x029c
            android.view.View r3 = r0.mo903b(r3)
            if (r3 == 0) goto L_0x029c
            boolean r7 = r0.f703x
            if (r7 == 0) goto L_0x0287
            p.p.d.t r7 = r0.f700u
            int r7 = r7.mo6357b()
            p.p.d.t r10 = r0.f700u
            int r3 = r10.mo6355a(r3)
            int r7 = r7 - r3
            int r3 = r0.f692B
            goto L_0x0296
        L_0x0287:
            p.p.d.t r7 = r0.f700u
            int r3 = r7.mo6362d(r3)
            p.p.d.t r7 = r0.f700u
            int r7 = r7.mo6365f()
            int r3 = r3 - r7
            int r7 = r0.f692B
        L_0x0296:
            int r7 = r7 - r3
            if (r7 <= 0) goto L_0x029b
            int r6 = r6 + r7
            goto L_0x029c
        L_0x029b:
            int r9 = r9 - r7
        L_0x029c:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f694D
            boolean r3 = r3.f709d
            if (r3 == 0) goto L_0x02a7
            boolean r3 = r0.f703x
            if (r3 == 0) goto L_0x02ab
            goto L_0x02ad
        L_0x02a7:
            boolean r3 = r0.f703x
            if (r3 == 0) goto L_0x02ad
        L_0x02ab:
            r3 = r4
            goto L_0x02ae
        L_0x02ad:
            r3 = r8
        L_0x02ae:
            androidx.recyclerview.widget.LinearLayoutManager$a r7 = r0.f694D
            r0.mo856a(r1, r2, r7, r3)
            r16.mo1207a(r17)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f699t
            boolean r7 = r16.mo928y()
            r3.f727m = r7
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f699t
            boolean r7 = r2.f738g
            r3.f724j = r7
            r3.f723i = r5
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f694D
            boolean r7 = r3.f709d
            if (r7 == 0) goto L_0x0313
            int r7 = r3.f707b
            int r3 = r3.f708c
            r0.mo912e(r7, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f699t
            r3.f722h = r6
            r0.mo886a(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f699t
            int r6 = r3.f716b
            int r7 = r3.f718d
            int r3 = r3.f717c
            if (r3 <= 0) goto L_0x02e5
            int r9 = r9 + r3
        L_0x02e5:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f694D
            int r10 = r3.f707b
            int r3 = r3.f708c
            r0.mo910d(r10, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f699t
            r3.f722h = r9
            int r9 = r3.f718d
            int r10 = r3.f719e
            int r9 = r9 + r10
            r3.f718d = r9
            r0.mo886a(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f699t
            int r9 = r3.f716b
            int r3 = r3.f717c
            if (r3 <= 0) goto L_0x0359
            r0.mo912e(r7, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r6 = r0.f699t
            r6.f722h = r3
            r0.mo886a(r1, r6, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f699t
            int r6 = r3.f716b
            goto L_0x0359
        L_0x0313:
            int r7 = r3.f707b
            int r3 = r3.f708c
            r0.mo910d(r7, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f699t
            r3.f722h = r9
            r0.mo886a(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f699t
            int r9 = r3.f716b
            int r7 = r3.f718d
            int r3 = r3.f717c
            if (r3 <= 0) goto L_0x032c
            int r6 = r6 + r3
        L_0x032c:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f694D
            int r10 = r3.f707b
            int r3 = r3.f708c
            r0.mo912e(r10, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f699t
            r3.f722h = r6
            int r6 = r3.f718d
            int r10 = r3.f719e
            int r6 = r6 + r10
            r3.f718d = r6
            r0.mo886a(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f699t
            int r6 = r3.f716b
            int r3 = r3.f717c
            if (r3 <= 0) goto L_0x0359
            r0.mo910d(r7, r9)
            androidx.recyclerview.widget.LinearLayoutManager$c r7 = r0.f699t
            r7.f722h = r3
            r0.mo886a(r1, r7, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f699t
            int r9 = r3.f716b
        L_0x0359:
            int r3 = r16.mo1222d()
            if (r3 <= 0) goto L_0x037d
            boolean r3 = r0.f703x
            boolean r7 = r0.f704y
            r3 = r3 ^ r7
            if (r3 == 0) goto L_0x0371
            int r3 = r0.mo884a(r9, r1, r2, r8)
            int r6 = r6 + r3
            int r9 = r9 + r3
            int r3 = r0.mo902b(r6, r1, r2, r5)
            goto L_0x037b
        L_0x0371:
            int r3 = r0.mo902b(r6, r1, r2, r8)
            int r6 = r6 + r3
            int r9 = r9 + r3
            int r3 = r0.mo884a(r9, r1, r2, r5)
        L_0x037b:
            int r6 = r6 + r3
            int r9 = r9 + r3
        L_0x037d:
            boolean r3 = r2.f742k
            if (r3 == 0) goto L_0x0413
            int r3 = r16.mo1222d()
            if (r3 == 0) goto L_0x0413
            boolean r3 = r2.f738g
            if (r3 != 0) goto L_0x0413
            boolean r3 = r16.mo880r()
            if (r3 != 0) goto L_0x0393
            goto L_0x0413
        L_0x0393:
            java.util.List<androidx.recyclerview.widget.RecyclerView$d0> r3 = r1.f831d
            int r7 = r3.size()
            android.view.View r10 = r0.mo1219c(r5)
            int r10 = r0.mo1237i(r10)
            r11 = r5
            r12 = r11
            r13 = r12
        L_0x03a4:
            if (r11 >= r7) goto L_0x03d4
            java.lang.Object r14 = r3.get(r11)
            androidx.recyclerview.widget.RecyclerView$d0 r14 = (androidx.recyclerview.widget.RecyclerView.C0105d0) r14
            boolean r15 = r14.mo1159j()
            if (r15 == 0) goto L_0x03b3
            goto L_0x03d0
        L_0x03b3:
            int r15 = r14.mo1153d()
            if (r15 >= r10) goto L_0x03bb
            r15 = r8
            goto L_0x03bc
        L_0x03bb:
            r15 = r5
        L_0x03bc:
            boolean r8 = r0.f703x
            if (r15 == r8) goto L_0x03c2
            r8 = r4
            goto L_0x03c3
        L_0x03c2:
            r8 = 1
        L_0x03c3:
            p.p.d.t r15 = r0.f700u
            android.view.View r14 = r14.f757a
            int r14 = r15.mo6358b(r14)
            if (r8 != r4) goto L_0x03cf
            int r12 = r12 + r14
            goto L_0x03d0
        L_0x03cf:
            int r13 = r13 + r14
        L_0x03d0:
            int r11 = r11 + 1
            r8 = 1
            goto L_0x03a4
        L_0x03d4:
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f699t
            r4.f726l = r3
            r3 = 0
            if (r12 <= 0) goto L_0x03f4
            android.view.View r4 = r16.mo926w()
            int r4 = r0.mo1237i(r4)
            r0.mo912e(r4, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f699t
            r4.f722h = r12
            r4.f717c = r5
            r4.mo936a(r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f699t
            r0.mo886a(r1, r4, r2, r5)
        L_0x03f4:
            if (r13 <= 0) goto L_0x040f
            android.view.View r4 = r16.mo925v()
            int r4 = r0.mo1237i(r4)
            r0.mo910d(r4, r9)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f699t
            r4.f722h = r13
            r4.f717c = r5
            r4.mo936a(r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f699t
            r0.mo886a(r1, r4, r2, r5)
        L_0x040f:
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r0.f699t
            r1.f726l = r3
        L_0x0413:
            boolean r1 = r2.f738g
            if (r1 != 0) goto L_0x0420
            p.p.d.t r1 = r0.f700u
            int r2 = r1.mo6367g()
            r1.f4730b = r2
            goto L_0x0425
        L_0x0420:
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r0.f694D
            r1.mo932b()
        L_0x0425:
            boolean r1 = r0.f704y
            r0.f701v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo873c(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    /* renamed from: d */
    public int mo908d(C0099a0 a0Var) {
        return mo913h(a0Var);
    }

    /* renamed from: d */
    public final View mo909d(C0132v vVar, C0099a0 a0Var) {
        return mo849a(vVar, a0Var, 0, mo1222d(), a0Var.mo1135a());
    }

    /* renamed from: d */
    public final void mo910d(int i, int i2) {
        this.f699t.f717c = this.f700u.mo6357b() - i2;
        this.f699t.f719e = this.f703x ? -1 : 1;
        C0095c cVar = this.f699t;
        cVar.f718d = i;
        cVar.f720f = 1;
        cVar.f716b = i2;
        cVar.f721g = RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: e */
    public int mo874e(C0099a0 a0Var) {
        return mo916i(a0Var);
    }

    /* renamed from: e */
    public final View mo911e(C0132v vVar, C0099a0 a0Var) {
        return mo849a(vVar, a0Var, mo1222d() - 1, -1, a0Var.mo1135a());
    }

    /* renamed from: e */
    public final void mo912e(int i, int i2) {
        this.f699t.f717c = i2 - this.f700u.mo6365f();
        C0095c cVar = this.f699t;
        cVar.f718d = i;
        cVar.f719e = this.f703x ? 1 : -1;
        C0095c cVar2 = this.f699t;
        cVar2.f720f = -1;
        cVar2.f716b = i2;
        cVar2.f721g = RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: f */
    public int mo876f(C0099a0 a0Var) {
        return mo917j(a0Var);
    }

    /* renamed from: g */
    public void mo877g(C0099a0 a0Var) {
        this.f693C = null;
        this.f691A = -1;
        this.f692B = RecyclerView.UNDEFINED_DURATION;
        this.f694D.mo932b();
    }

    /* renamed from: h */
    public final int mo913h(C0099a0 a0Var) {
        if (mo1222d() == 0) {
            return 0;
        }
        mo922s();
        C1606t tVar = this.f700u;
        View b = mo904b(!this.f705z, true);
        return C1061o.m2437a(a0Var, tVar, b, mo889a(!this.f705z, true), (C0120o) this, this.f705z);
    }

    /* renamed from: h */
    public void mo914h(int i) {
        this.f691A = i;
        this.f692B = RecyclerView.UNDEFINED_DURATION;
        C0096d dVar = this.f693C;
        if (dVar != null) {
            dVar.f728e = -1;
        }
        mo1242p();
    }

    /* renamed from: i */
    public int mo915i(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.f698s != 1 && mo927x()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f698s != 1 && mo927x()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.f698s != 0) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 33) {
            if (this.f698s != 1) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 66) {
            if (this.f698s != 0) {
                i3 = Integer.MIN_VALUE;
            }
            return i3;
        } else if (i != 130) {
            return RecyclerView.UNDEFINED_DURATION;
        } else {
            if (this.f698s != 1) {
                i3 = Integer.MIN_VALUE;
            }
            return i3;
        }
    }

    /* renamed from: i */
    public final int mo916i(C0099a0 a0Var) {
        if (mo1222d() == 0) {
            return 0;
        }
        mo922s();
        C1606t tVar = this.f700u;
        View b = mo904b(!this.f705z, true);
        return C1061o.m2438a(a0Var, tVar, b, mo889a(!this.f705z, true), (C0120o) this, this.f705z, this.f703x);
    }

    /* renamed from: j */
    public final int mo917j(C0099a0 a0Var) {
        if (mo1222d() == 0) {
            return 0;
        }
        mo922s();
        C1606t tVar = this.f700u;
        View b = mo904b(!this.f705z, true);
        return C1061o.m2523b(a0Var, tVar, b, mo889a(!this.f705z, true), this, this.f705z);
    }

    /* renamed from: j */
    public void mo918j(int i) {
        if (i == 0 || i == 1) {
            mo900a((String) null);
            if (i != this.f698s || this.f700u == null) {
                C1606t a = C1606t.m4079a(this, i);
                this.f700u = a;
                this.f694D.f706a = a;
                this.f698s = i;
                mo1242p();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C1965a.m4761b("invalid orientation:", i));
    }

    /* renamed from: n */
    public boolean mo919n() {
        return true;
    }

    /* renamed from: o */
    public Parcelable mo920o() {
        if (this.f693C != null) {
            return new C0096d(this.f693C);
        }
        C0096d dVar = new C0096d();
        if (mo1222d() > 0) {
            mo922s();
            boolean z = this.f701v ^ this.f703x;
            dVar.f730g = z;
            if (z) {
                View v = mo925v();
                dVar.f729f = this.f700u.mo6357b() - this.f700u.mo6355a(v);
                dVar.f728e = mo1237i(v);
            } else {
                View w = mo926w();
                dVar.f728e = mo1237i(w);
                dVar.f729f = this.f700u.mo6362d(w) - this.f700u.mo6365f();
            }
        } else {
            dVar.f728e = -1;
        }
        return dVar;
    }

    /* renamed from: q */
    public boolean mo921q() {
        boolean z;
        if (this.f809p == 1073741824 || this.f808o == 1073741824) {
            return false;
        }
        int d = mo1222d();
        int i = 0;
        while (true) {
            if (i >= d) {
                z = false;
                break;
            }
            LayoutParams layoutParams = mo1219c(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public boolean mo880r() {
        return this.f693C == null && this.f701v == this.f704y;
    }

    /* renamed from: s */
    public void mo922s() {
        if (this.f699t == null) {
            this.f699t = new C0095c();
        }
    }

    /* renamed from: t */
    public int mo923t() {
        View a = mo888a(0, mo1222d(), false, true);
        if (a == null) {
            return -1;
        }
        return mo1237i(a);
    }

    /* renamed from: u */
    public int mo924u() {
        View a = mo888a(mo1222d() - 1, -1, false, true);
        if (a == null) {
            return -1;
        }
        return mo1237i(a);
    }

    /* renamed from: v */
    public final View mo925v() {
        return mo1219c(this.f703x ? 0 : mo1222d() - 1);
    }

    /* renamed from: w */
    public final View mo926w() {
        return mo1219c(this.f703x ? mo1222d() - 1 : 0);
    }

    /* renamed from: x */
    public boolean mo927x() {
        return mo1231g() == 1;
    }

    /* renamed from: y */
    public boolean mo928y() {
        return this.f700u.mo6361d() == 0 && this.f700u.mo6354a() == 0;
    }

    /* renamed from: z */
    public final void mo929z() {
        this.f703x = (this.f698s == 1 || !mo927x()) ? this.f702w : !this.f702w;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C0124d a = C0120o.m501a(context, attributeSet, i, i2);
        mo918j(a.f814a);
        boolean z = a.f816c;
        mo900a((String) null);
        if (z != this.f702w) {
            this.f702w = z;
            mo1242p();
        }
        mo862a(a.f817d);
    }

    /* renamed from: a */
    public void mo895a(C0099a0 a0Var, int[] iArr) {
        int i;
        int g = a0Var.f732a != -1 ? this.f700u.mo6367g() : 0;
        if (this.f699t.f720f == -1) {
            i = 0;
        } else {
            i = g;
            g = 0;
        }
        iArr[0] = g;
        iArr[1] = i;
    }

    /* renamed from: a */
    public int mo886a(C0132v vVar, C0095c cVar, C0099a0 a0Var, boolean z) {
        int i = cVar.f717c;
        int i2 = cVar.f721g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f721g = i2 + i;
            }
            mo897a(vVar, cVar);
        }
        int i3 = cVar.f717c + cVar.f722h;
        C0094b bVar = this.f695E;
        while (true) {
            if ((!cVar.f727m && i3 <= 0) || !cVar.mo937a(a0Var)) {
                break;
            }
            bVar.f711a = 0;
            bVar.f712b = false;
            bVar.f713c = false;
            bVar.f714d = false;
            mo857a(vVar, a0Var, cVar, bVar);
            if (!bVar.f712b) {
                cVar.f716b = (bVar.f711a * cVar.f720f) + cVar.f716b;
                if (!bVar.f713c || cVar.f726l != null || !a0Var.f738g) {
                    int i4 = cVar.f717c;
                    int i5 = bVar.f711a;
                    cVar.f717c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f721g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f711a;
                    cVar.f721g = i7;
                    int i8 = cVar.f717c;
                    if (i8 < 0) {
                        cVar.f721g = i7 + i8;
                    }
                    mo897a(vVar, cVar);
                }
                if (z && bVar.f714d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f717c;
    }

    /* renamed from: a */
    public void mo857a(C0132v vVar, C0099a0 a0Var, C0095c cVar, C0094b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View a = cVar.mo935a(vVar);
        if (a == null) {
            bVar.f712b = true;
            return;
        }
        C0125p pVar = (C0125p) a.getLayoutParams();
        if (cVar.f726l == null) {
            if (this.f703x == (cVar.f720f == -1)) {
                mo1202a(a, -1, false);
            } else {
                mo1202a(a, 0, false);
            }
        } else {
            if (this.f703x == (cVar.f720f == -1)) {
                mo1202a(a, -1, true);
            } else {
                mo1202a(a, 0, true);
            }
        }
        C0125p pVar2 = (C0125p) a.getLayoutParams();
        Rect itemDecorInsetsForChild = this.f795b.getItemDecorInsetsForChild(a);
        int i6 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + 0;
        int a2 = C0120o.m500a(this.f810q, this.f808o, mo1240l() + mo1239k() + pVar2.leftMargin + pVar2.rightMargin + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + 0, pVar2.width, mo901a());
        int a3 = C0120o.m500a(this.f811r, this.f809p, mo1238j() + mo1241m() + pVar2.topMargin + pVar2.bottomMargin + i6, pVar2.height, mo905b());
        if (mo1210a(a, a2, a3, pVar2)) {
            a.measure(a2, a3);
        }
        bVar.f711a = this.f700u.mo6358b(a);
        if (this.f698s == 1) {
            if (mo927x()) {
                i5 = this.f810q - mo1240l();
                i4 = i5 - this.f700u.mo6360c(a);
            } else {
                i4 = mo1239k();
                i5 = this.f700u.mo6360c(a) + i4;
            }
            int i7 = cVar.f720f;
            int i8 = cVar.f716b;
            if (i7 == -1) {
                i = i8;
                i2 = i5;
                i3 = i8 - bVar.f711a;
            } else {
                i3 = i8;
                i2 = i5;
                i = bVar.f711a + i8;
            }
        } else {
            int m = mo1241m();
            int c = this.f700u.mo6360c(a) + m;
            int i9 = cVar.f720f;
            int i10 = cVar.f716b;
            if (i9 == -1) {
                i2 = i10;
                i3 = m;
                i = c;
                i4 = i10 - bVar.f711a;
            } else {
                i3 = m;
                i2 = bVar.f711a + i10;
                i = c;
                i4 = i10;
            }
        }
        mo1201a(a, i4, i3, i2, i);
        if (pVar.mo1250c() || pVar.mo1249b()) {
            bVar.f713c = true;
        }
        bVar.f714d = a.hasFocusable();
    }

    /* renamed from: a */
    public View mo848a(View view, int i, C0132v vVar, C0099a0 a0Var) {
        View view2;
        mo929z();
        if (mo1222d() == 0) {
            return null;
        }
        int i2 = mo915i(i);
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        mo922s();
        mo891a(i2, (int) (((float) this.f700u.mo6367g()) * 0.33333334f), false, a0Var);
        C0095c cVar = this.f699t;
        cVar.f721g = RecyclerView.UNDEFINED_DURATION;
        cVar.f715a = false;
        mo886a(vVar, cVar, a0Var, true);
        if (i2 == -1) {
            if (this.f703x) {
                view2 = mo907c(mo1222d() - 1, -1);
            } else {
                view2 = mo907c(0, mo1222d());
            }
        } else if (this.f703x) {
            view2 = mo907c(0, mo1222d());
        } else {
            view2 = mo907c(mo1222d() - 1, -1);
        }
        View w = i2 == -1 ? mo926w() : mo925v();
        if (!w.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return w;
    }

    /* renamed from: a */
    public void mo893a(Parcelable parcelable) {
        if (parcelable instanceof C0096d) {
            C0096d dVar = (C0096d) parcelable;
            this.f693C = dVar;
            if (this.f691A != -1) {
                dVar.f728e = -1;
            }
            mo1242p();
        }
    }

    /* renamed from: a */
    public final void mo897a(C0132v vVar, C0095c cVar) {
        if (cVar.f715a && !cVar.f727m) {
            int i = cVar.f721g;
            int i2 = cVar.f723i;
            if (cVar.f720f == -1) {
                int d = mo1222d();
                if (i >= 0) {
                    int a = (this.f700u.mo6354a() - i) + i2;
                    if (this.f703x) {
                        for (int i3 = 0; i3 < d; i3++) {
                            View c = mo1219c(i3);
                            if (this.f700u.mo6362d(c) < a || this.f700u.mo6366f(c) < a) {
                                mo896a(vVar, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = d - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View c2 = mo1219c(i5);
                        if (this.f700u.mo6362d(c2) < a || this.f700u.mo6366f(c2) < a) {
                            mo896a(vVar, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i6 = i - i2;
                int d2 = mo1222d();
                if (this.f703x) {
                    int i7 = d2 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View c3 = mo1219c(i8);
                        if (this.f700u.mo6355a(c3) > i6 || this.f700u.mo6364e(c3) > i6) {
                            mo896a(vVar, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < d2; i9++) {
                    View c4 = mo1219c(i9);
                    if (this.f700u.mo6355a(c4) > i6 || this.f700u.mo6364e(c4) > i6) {
                        mo896a(vVar, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo898a(RecyclerView recyclerView, C0099a0 a0Var, int i) {
        C1600o oVar = new C1600o(recyclerView.getContext());
        oVar.f838a = i;
        mo1209a((C0137z) oVar);
    }
}
