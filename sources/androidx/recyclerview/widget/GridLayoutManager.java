package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.recyclerview.widget.LinearLayoutManager.C0093a;
import androidx.recyclerview.widget.LinearLayoutManager.C0094b;
import androidx.recyclerview.widget.LinearLayoutManager.C0095c;
import androidx.recyclerview.widget.RecyclerView.C0099a0;
import androidx.recyclerview.widget.RecyclerView.C0120o;
import androidx.recyclerview.widget.RecyclerView.C0120o.C0123c;
import androidx.recyclerview.widget.RecyclerView.C0125p;
import androidx.recyclerview.widget.RecyclerView.C0132v;
import java.util.Arrays;
import p124p.p150h.p162l.p163y.C1429b;
import p124p.p150h.p162l.p163y.C1429b.C1432c;
import p124p.p180p.p181d.C1595m.C1597b;
import p213q.p214a.p215a.p216a.C1965a;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: H */
    public boolean f677H = false;

    /* renamed from: I */
    public int f678I = -1;

    /* renamed from: J */
    public int[] f679J;

    /* renamed from: K */
    public View[] f680K;

    /* renamed from: L */
    public final SparseIntArray f681L = new SparseIntArray();

    /* renamed from: M */
    public final SparseIntArray f682M = new SparseIntArray();

    /* renamed from: N */
    public C0092c f683N = new C0090a();

    /* renamed from: O */
    public final Rect f684O = new Rect();

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C0090a extends C0092c {
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C0091b extends C0125p {

        /* renamed from: e */
        public int f685e = -1;

        /* renamed from: f */
        public int f686f = 0;

        public C0091b(int i, int i2) {
            super(i, i2);
        }

        public C0091b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0091b(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0091b(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class C0092c {

        /* renamed from: a */
        public final SparseIntArray f687a = new SparseIntArray();

        /* renamed from: b */
        public final SparseIntArray f688b = new SparseIntArray();

        /* renamed from: c */
        public boolean f689c = false;

        /* renamed from: d */
        public boolean f690d = false;

        /* renamed from: a */
        public int mo881a(int i, int i2) {
            if (!this.f690d) {
                return mo883c(i, i2);
            }
            int i3 = this.f688b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int c = mo883c(i, i2);
            this.f688b.put(i, c);
            return c;
        }

        /* renamed from: b */
        public int mo882b(int i, int i2) {
            if (!this.f689c) {
                return i % i2;
            }
            int i3 = this.f687a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int i4 = i % i2;
            this.f687a.put(i, i4);
            return i4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo883c(int r9, int r10) {
            /*
                r8 = this;
                boolean r0 = r8.f690d
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0044
                android.util.SparseIntArray r0 = r8.f688b
                int r3 = r0.size()
                r4 = -1
                int r3 = r3 + r4
                r5 = r1
            L_0x000f:
                if (r5 > r3) goto L_0x0020
                int r6 = r5 + r3
                int r6 = r6 >>> r2
                int r7 = r0.keyAt(r6)
                if (r7 >= r9) goto L_0x001d
                int r5 = r6 + 1
                goto L_0x000f
            L_0x001d:
                int r3 = r6 + -1
                goto L_0x000f
            L_0x0020:
                int r5 = r5 + r4
                if (r5 < 0) goto L_0x002e
                int r3 = r0.size()
                if (r5 >= r3) goto L_0x002e
                int r0 = r0.keyAt(r5)
                goto L_0x002f
            L_0x002e:
                r0 = r4
            L_0x002f:
                if (r0 == r4) goto L_0x0044
                android.util.SparseIntArray r3 = r8.f688b
                int r3 = r3.get(r0)
                int r4 = r0 + 1
                int r0 = r8.mo882b(r0, r10)
                int r0 = r0 + r2
                if (r0 != r10) goto L_0x0047
                int r3 = r3 + 1
                r0 = r1
                goto L_0x0047
            L_0x0044:
                r0 = r1
                r3 = r0
                r4 = r3
            L_0x0047:
                if (r4 >= r9) goto L_0x0059
                int r0 = r0 + 1
                if (r0 != r10) goto L_0x0051
                int r3 = r3 + 1
                r0 = r1
                goto L_0x0056
            L_0x0051:
                if (r0 <= r10) goto L_0x0056
                int r3 = r3 + 1
                r0 = r2
            L_0x0056:
                int r4 = r4 + 1
                goto L_0x0047
            L_0x0059:
                int r0 = r0 + r2
                if (r0 <= r10) goto L_0x005e
                int r3 = r3 + 1
            L_0x005e:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.C0092c.mo883c(int, int):int");
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(i2, z);
        mo879l(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo879l(C0120o.m501a(context, attributeSet, i, i2).f815b);
    }

    /* renamed from: A */
    public final void mo843A() {
        View[] viewArr = this.f680K;
        if (viewArr == null || viewArr.length != this.f678I) {
            this.f680K = new View[this.f678I];
        }
    }

    /* renamed from: B */
    public final void mo844B() {
        int i;
        int i2;
        if (this.f698s == 1) {
            i2 = this.f810q - mo1240l();
            i = mo1239k();
        } else {
            i2 = this.f811r - mo1238j();
            i = mo1241m();
        }
        mo878k(i2 - i);
    }

    /* renamed from: a */
    public int mo846a(C0132v vVar, C0099a0 a0Var) {
        if (this.f698s == 1) {
            return this.f678I;
        }
        if (a0Var.mo1135a() < 1) {
            return 0;
        }
        return mo847a(vVar, a0Var, a0Var.mo1135a() - 1) + 1;
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
            if (i5 >= 0 && i5 < i3 && mo867b(vVar, a0Var, i5) == 0) {
                if (((C0125p) c.getLayoutParams()).mo1250c()) {
                    if (view2 == null) {
                        view2 = c;
                    }
                } else if (this.f700u.mo6362d(c) < b && this.f700u.mo6355a(c) >= f) {
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
    public C0125p mo850a(Context context, AttributeSet attributeSet) {
        return new C0091b(context, attributeSet);
    }

    /* renamed from: a */
    public C0125p mo851a(LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams ? new C0091b((MarginLayoutParams) layoutParams) : new C0091b(layoutParams);
    }

    /* renamed from: a */
    public final void mo853a(View view, int i, int i2, boolean z) {
        C0125p pVar = (C0125p) view.getLayoutParams();
        if (z ? mo1217b(view, i, i2, pVar) : mo1210a(view, i, i2, pVar)) {
            view.measure(i, i2);
        }
    }

    /* renamed from: a */
    public void mo854a(C0099a0 a0Var, C0095c cVar, C0123c cVar2) {
        int i = this.f678I;
        int i2 = 0;
        while (i2 < this.f678I && cVar.mo937a(a0Var) && i > 0) {
            ((C1597b) cVar2).mo6339a(cVar.f718d, Math.max(0, cVar.f721g));
            if (((C0090a) this.f683N) != null) {
                i--;
                cVar.f718d += cVar.f719e;
                i2++;
            } else {
                throw null;
            }
        }
    }

    /* renamed from: a */
    public boolean mo863a(C0125p pVar) {
        return pVar instanceof C0091b;
    }

    /* renamed from: b */
    public int mo865b(C0099a0 a0Var) {
        return mo916i(a0Var);
    }

    /* renamed from: b */
    public int mo866b(C0132v vVar, C0099a0 a0Var) {
        if (this.f698s == 0) {
            return this.f678I;
        }
        if (a0Var.mo1135a() < 1) {
            return 0;
        }
        return mo847a(vVar, a0Var, a0Var.mo1135a() - 1) + 1;
    }

    /* renamed from: c */
    public int mo870c(C0099a0 a0Var) {
        return mo917j(a0Var);
    }

    /* renamed from: c */
    public C0125p mo872c() {
        return this.f698s == 0 ? new C0091b(-2, -1) : new C0091b(-1, -2);
    }

    /* renamed from: e */
    public int mo874e(C0099a0 a0Var) {
        return mo916i(a0Var);
    }

    /* renamed from: f */
    public int mo875f(int i, int i2) {
        if (this.f698s != 1 || !mo927x()) {
            int[] iArr = this.f679J;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f679J;
        int i3 = this.f678I;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
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
        this.f677H = false;
    }

    /* renamed from: k */
    public final void mo878k(int i) {
        int i2;
        int[] iArr = this.f679J;
        int i3 = this.f678I;
        if (!(iArr != null && iArr.length == i3 + 1 && iArr[iArr.length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f679J = iArr;
    }

    /* renamed from: l */
    public void mo879l(int i) {
        if (i != this.f678I) {
            this.f677H = true;
            if (i >= 1) {
                this.f678I = i;
                this.f683N.f687a.clear();
                mo1242p();
                return;
            }
            throw new IllegalArgumentException(C1965a.m4761b("Span count should be at least 1. Provided ", i));
        }
    }

    /* renamed from: r */
    public boolean mo880r() {
        return this.f693C == null && !this.f677H;
    }

    /* renamed from: a */
    public final int mo847a(C0132v vVar, C0099a0 a0Var, int i) {
        if (!a0Var.f738g) {
            return this.f683N.mo881a(i, this.f678I);
        }
        int a = vVar.mo1260a(i);
        if (a != -1) {
            return this.f683N.mo881a(a, this.f678I);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. ");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 0;
    }

    /* renamed from: b */
    public final int mo867b(C0132v vVar, C0099a0 a0Var, int i) {
        if (!a0Var.f738g) {
            return this.f683N.mo882b(i, this.f678I);
        }
        int i2 = this.f682M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = vVar.mo1260a(i);
        if (a != -1) {
            return this.f683N.mo882b(a, this.f678I);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 0;
    }

    /* renamed from: c */
    public final int mo871c(C0132v vVar, C0099a0 a0Var, int i) {
        if (a0Var.f738g) {
            int i2 = this.f681L.get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            if (vVar.mo1260a(i) == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
                sb.append(i);
                Log.w("GridLayoutManager", sb.toString());
                return 1;
            } else if (((C0090a) this.f683N) != null) {
                return 1;
            } else {
                throw null;
            }
        } else if (((C0090a) this.f683N) != null) {
            return 1;
        } else {
            throw null;
        }
    }

    /* renamed from: a */
    public void mo857a(C0132v vVar, C0099a0 a0Var, C0095c cVar, C0094b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z;
        C0132v vVar2 = vVar;
        C0099a0 a0Var2 = a0Var;
        C0095c cVar2 = cVar;
        C0094b bVar2 = bVar;
        int e = this.f700u.mo6363e();
        boolean z2 = e != 1073741824;
        int i19 = mo1222d() > 0 ? this.f679J[this.f678I] : 0;
        if (z2) {
            mo844B();
        }
        boolean z3 = cVar2.f719e == 1;
        int i20 = this.f678I;
        if (!z3) {
            i20 = mo867b(vVar2, a0Var2, cVar2.f718d) + mo871c(vVar2, a0Var2, cVar2.f718d);
        }
        int i21 = 0;
        while (i21 < this.f678I && cVar2.mo937a(a0Var2) && i20 > 0) {
            int i22 = cVar2.f718d;
            int c = mo871c(vVar2, a0Var2, i22);
            if (c <= this.f678I) {
                i20 -= c;
                if (i20 < 0) {
                    break;
                }
                View a = cVar2.mo935a(vVar2);
                if (a == null) {
                    break;
                }
                this.f680K[i21] = a;
                i21++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Item at position ");
                sb.append(i22);
                sb.append(" requires ");
                sb.append(c);
                sb.append(" spans but GridLayoutManager has only ");
                throw new IllegalArgumentException(C1965a.m4753a(sb, this.f678I, " spans."));
            }
        }
        if (i21 == 0) {
            bVar2.f712b = true;
            return;
        }
        if (z3) {
            i = 1;
            i2 = i21;
            i3 = 0;
        } else {
            i3 = i21 - 1;
            i2 = -1;
            i = -1;
        }
        int i23 = 0;
        while (i3 != i2) {
            View view = this.f680K[i3];
            C0091b bVar3 = (C0091b) view.getLayoutParams();
            int c2 = mo871c(vVar2, a0Var2, mo1237i(view));
            bVar3.f686f = c2;
            bVar3.f685e = i23;
            i23 += c2;
            i3 += i;
        }
        float f = 0.0f;
        int i24 = 0;
        for (int i25 = 0; i25 < i21; i25++) {
            View view2 = this.f680K[i25];
            if (cVar2.f726l != null) {
                z = false;
                if (z3) {
                    mo1202a(view2, -1, true);
                } else {
                    mo1202a(view2, 0, true);
                }
            } else if (z3) {
                mo1200a(view2);
                z = false;
            } else {
                z = false;
                mo1202a(view2, 0, false);
            }
            Rect rect = this.f684O;
            RecyclerView recyclerView = this.f795b;
            if (recyclerView == null) {
                rect.set(z ? 1 : 0, z, z, z);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view2));
            }
            mo868b(view2, e, z);
            int b = this.f700u.mo6358b(view2);
            if (b > i24) {
                i24 = b;
            }
            float c3 = (((float) this.f700u.mo6360c(view2)) * 1.0f) / ((float) ((C0091b) view2.getLayoutParams()).f686f);
            if (c3 > f) {
                f = c3;
            }
        }
        if (z2) {
            mo878k(Math.max(Math.round(f * ((float) this.f678I)), i19));
            i24 = 0;
            for (int i26 = 0; i26 < i21; i26++) {
                View view3 = this.f680K[i26];
                mo868b(view3, 1073741824, true);
                int b2 = this.f700u.mo6358b(view3);
                if (b2 > i24) {
                    i24 = b2;
                }
            }
        }
        for (int i27 = 0; i27 < i21; i27++) {
            View view4 = this.f680K[i27];
            if (this.f700u.mo6358b(view4) != i24) {
                C0091b bVar4 = (C0091b) view4.getLayoutParams();
                Rect rect2 = bVar4.f819b;
                int i28 = rect2.top + rect2.bottom + bVar4.topMargin + bVar4.bottomMargin;
                int i29 = rect2.left + rect2.right + bVar4.leftMargin + bVar4.rightMargin;
                int f2 = mo875f(bVar4.f685e, bVar4.f686f);
                if (this.f698s == 1) {
                    i18 = C0120o.m500a(f2, 1073741824, i29, bVar4.width, false);
                    i17 = MeasureSpec.makeMeasureSpec(i24 - i28, 1073741824);
                } else {
                    int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i24 - i29, 1073741824);
                    i17 = C0120o.m500a(f2, 1073741824, i28, bVar4.height, false);
                    i18 = makeMeasureSpec;
                }
                mo853a(view4, i18, i17, true);
            }
        }
        bVar2.f711a = i24;
        if (this.f698s == 1) {
            if (cVar2.f720f == -1) {
                i16 = cVar2.f716b;
                i15 = i16 - i24;
            } else {
                int i30 = cVar2.f716b;
                i15 = i30;
                i16 = i24 + i30;
            }
            i5 = i15;
            i6 = 0;
            i4 = i16;
            i7 = 0;
        } else {
            if (cVar2.f720f == -1) {
                i7 = cVar2.f716b;
                i14 = i7 - i24;
            } else {
                int i31 = cVar2.f716b;
                i14 = i31;
                i7 = i24 + i31;
            }
            i6 = i14;
            i5 = 0;
            i4 = 0;
        }
        int i32 = 0;
        while (i32 < i21) {
            View view5 = this.f680K[i32];
            C0091b bVar5 = (C0091b) view5.getLayoutParams();
            if (this.f698s == 1) {
                if (mo927x()) {
                    i13 = mo1239k() + this.f679J[this.f678I - bVar5.f685e];
                    i12 = i13 - this.f700u.mo6360c(view5);
                } else {
                    i12 = this.f679J[bVar5.f685e] + mo1239k();
                    i13 = this.f700u.mo6360c(view5) + i12;
                }
                i10 = i12;
                i9 = i5;
                i8 = i4;
                i11 = i13;
            } else {
                int m = mo1241m() + this.f679J[bVar5.f685e];
                i11 = i7;
                i10 = i6;
                i9 = m;
                i8 = this.f700u.mo6360c(view5) + m;
            }
            mo1201a(view5, i10, i9, i11, i8);
            if (bVar5.mo1250c() || bVar5.mo1249b()) {
                bVar2.f713c = true;
            }
            bVar2.f714d |= view5.hasFocusable();
            i32++;
            i7 = i11;
            i6 = i10;
            i5 = i9;
            i4 = i8;
        }
        Arrays.fill(this.f680K, null);
    }

    /* renamed from: b */
    public final void mo868b(View view, int i, boolean z) {
        int i2;
        int i3;
        C0091b bVar = (C0091b) view.getLayoutParams();
        Rect rect = bVar.f819b;
        int i4 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i5 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int f = mo875f(bVar.f685e, bVar.f686f);
        if (this.f698s == 1) {
            i2 = C0120o.m500a(f, i, i5, bVar.width, false);
            i3 = C0120o.m500a(this.f700u.mo6367g(), this.f809p, i4, bVar.height, true);
        } else {
            int a = C0120o.m500a(f, i, i4, bVar.height, false);
            int a2 = C0120o.m500a(this.f700u.mo6367g(), this.f808o, i5, bVar.width, true);
            i3 = a;
            i2 = a2;
        }
        mo853a(view, i2, i3, z);
    }

    /* renamed from: c */
    public void mo873c(C0132v vVar, C0099a0 a0Var) {
        if (a0Var.f738g) {
            int d = mo1222d();
            for (int i = 0; i < d; i++) {
                C0091b bVar = (C0091b) mo1219c(i).getLayoutParams();
                int a = bVar.mo1248a();
                this.f681L.put(a, bVar.f686f);
                this.f682M.put(a, bVar.f685e);
            }
        }
        super.mo873c(vVar, a0Var);
        this.f681L.clear();
        this.f682M.clear();
    }

    /* renamed from: b */
    public void mo869b(RecyclerView recyclerView, int i, int i2) {
        this.f683N.f687a.clear();
        this.f683N.f688b.clear();
    }

    /* renamed from: b */
    public int mo864b(int i, C0132v vVar, C0099a0 a0Var) {
        mo844B();
        mo843A();
        if (this.f698s == 0) {
            return 0;
        }
        return mo906c(i, vVar, a0Var);
    }

    /* renamed from: a */
    public void mo856a(C0132v vVar, C0099a0 a0Var, C0093a aVar, int i) {
        mo844B();
        if (a0Var.mo1135a() > 0 && !a0Var.f738g) {
            boolean z = i == 1;
            int b = mo867b(vVar, a0Var, aVar.f707b);
            if (z) {
                while (b > 0) {
                    int i2 = aVar.f707b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    aVar.f707b = i3;
                    b = mo867b(vVar, a0Var, i3);
                }
            } else {
                int a = a0Var.mo1135a() - 1;
                int i4 = aVar.f707b;
                while (i4 < a) {
                    int i5 = i4 + 1;
                    int b2 = mo867b(vVar, a0Var, i5);
                    if (b2 <= b) {
                        break;
                    }
                    i4 = i5;
                    b = b2;
                }
                aVar.f707b = i4;
            }
        }
        mo843A();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d2, code lost:
        if (r13 == (r2 > r15)) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ff, code lost:
        if (r13 == (r2 > r8)) goto L_0x00f6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo848a(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.C0132v r25, androidx.recyclerview.widget.RecyclerView.C0099a0 r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            android.view.View r3 = r22.mo1213b(r23)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.C0091b) r5
            int r6 = r5.f685e
            int r5 = r5.f686f
            int r5 = r5 + r6
            android.view.View r7 = super.mo848a(r23, r24, r25, r26)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r24
            int r7 = r0.mo915i(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = r9
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f703x
            if (r7 == r10) goto L_0x0032
            r7 = r9
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r22.mo1222d()
            int r7 = r7 - r9
            r11 = r10
            r12 = r11
            goto L_0x0045
        L_0x003e:
            int r7 = r22.mo1222d()
            r11 = r7
            r12 = r9
            r7 = 0
        L_0x0045:
            int r13 = r0.f698s
            if (r13 != r9) goto L_0x0051
            boolean r13 = r22.mo927x()
            if (r13 == 0) goto L_0x0051
            r13 = r9
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.mo847a(r1, r2, r7)
            r8 = r10
            r15 = r8
            r16 = r12
            r9 = 0
            r12 = 0
            r10 = r7
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0144
            r17 = r11
            int r11 = r0.mo847a(r1, r2, r10)
            android.view.View r1 = r0.mo1219c(r10)
            if (r1 != r3) goto L_0x006e
            goto L_0x0144
        L_0x006e:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0085
            if (r11 == r14) goto L_0x0085
            if (r4 == 0) goto L_0x007a
            goto L_0x0144
        L_0x007a:
            r18 = r3
            r21 = r7
            r19 = r9
            r20 = r14
            r14 = 1
            goto L_0x0132
        L_0x0085:
            android.view.ViewGroup$LayoutParams r11 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r11 = (androidx.recyclerview.widget.GridLayoutManager.C0091b) r11
            int r2 = r11.f685e
            r18 = r3
            int r3 = r11.f686f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009d
            if (r2 != r6) goto L_0x009d
            if (r3 != r5) goto L_0x009d
            return r1
        L_0x009d:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a5
            if (r4 == 0) goto L_0x00ad
        L_0x00a5:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00b6
            if (r7 != 0) goto L_0x00b6
        L_0x00ad:
            r21 = r7
        L_0x00af:
            r19 = r9
            r20 = r14
            r7 = 1
            r14 = 1
            goto L_0x0108
        L_0x00b6:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d5
            if (r7 <= r9) goto L_0x00cb
        L_0x00ca:
            goto L_0x00af
        L_0x00cb:
            if (r7 != r9) goto L_0x0102
            if (r2 <= r15) goto L_0x00d1
            r7 = 1
            goto L_0x00d2
        L_0x00d1:
            r7 = 0
        L_0x00d2:
            if (r13 != r7) goto L_0x0102
            goto L_0x00ca
        L_0x00d5:
            if (r4 != 0) goto L_0x0102
            r19 = r9
            p.p.d.z r9 = r0.f798e
            r20 = r14
            r14 = 24579(0x6003, float:3.4443E-41)
            boolean r9 = r9.mo6378a(r1, r14)
            if (r9 == 0) goto L_0x00ef
            p.p.d.z r9 = r0.f799f
            boolean r9 = r9.mo6378a(r1, r14)
            if (r9 == 0) goto L_0x00ef
            r9 = 1
            goto L_0x00f0
        L_0x00ef:
            r9 = 0
        L_0x00f0:
            r14 = 1
            r9 = r9 ^ r14
            if (r9 == 0) goto L_0x0107
            if (r7 <= r12) goto L_0x00f8
        L_0x00f6:
            r7 = r14
            goto L_0x0108
        L_0x00f8:
            if (r7 != r12) goto L_0x0107
            if (r2 <= r8) goto L_0x00fe
            r7 = r14
            goto L_0x00ff
        L_0x00fe:
            r7 = 0
        L_0x00ff:
            if (r13 != r7) goto L_0x0107
            goto L_0x00f6
        L_0x0102:
            r19 = r9
            r20 = r14
            r14 = 1
        L_0x0107:
            r7 = 0
        L_0x0108:
            if (r7 == 0) goto L_0x0132
            boolean r7 = r1.hasFocusable()
            if (r7 == 0) goto L_0x0121
            int r4 = r11.f685e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r9 = r3 - r2
            r15 = r4
            r7 = r21
            r4 = r1
            goto L_0x0136
        L_0x0121:
            int r7 = r11.f685e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r12 = r3 - r2
            r8 = r7
            r9 = r19
            r7 = r1
            goto L_0x0136
        L_0x0132:
            r9 = r19
            r7 = r21
        L_0x0136:
            int r10 = r10 + r16
            r1 = r25
            r2 = r26
            r11 = r17
            r3 = r18
            r14 = r20
            goto L_0x005e
        L_0x0144:
            r21 = r7
            if (r4 == 0) goto L_0x0149
            goto L_0x014b
        L_0x0149:
            r4 = r21
        L_0x014b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo848a(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    /* renamed from: a */
    public void mo855a(C0132v vVar, C0099a0 a0Var, View view, C1429b bVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0091b)) {
            super.mo1204a(view, bVar);
            return;
        }
        C0091b bVar2 = (C0091b) layoutParams;
        int a = mo847a(vVar, a0Var, bVar2.mo1248a());
        if (this.f698s == 0) {
            i4 = bVar2.f685e;
            i3 = bVar2.f686f;
            i = 1;
            z2 = false;
            z = false;
            i2 = a;
        } else {
            i3 = 1;
            i2 = bVar2.f685e;
            i = bVar2.f686f;
            z2 = false;
            z = false;
            i4 = a;
        }
        bVar.mo5949b((Object) C1432c.m3642a(i4, i3, i2, i, z2, z));
    }

    /* renamed from: a */
    public void mo859a(RecyclerView recyclerView, int i, int i2) {
        this.f683N.f687a.clear();
        this.f683N.f688b.clear();
    }

    /* renamed from: a */
    public void mo858a(RecyclerView recyclerView) {
        this.f683N.f687a.clear();
        this.f683N.f688b.clear();
    }

    /* renamed from: a */
    public void mo860a(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f683N.f687a.clear();
        this.f683N.f688b.clear();
    }

    /* renamed from: a */
    public void mo861a(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f683N.f687a.clear();
        this.f683N.f688b.clear();
    }

    /* renamed from: a */
    public int mo845a(int i, C0132v vVar, C0099a0 a0Var) {
        mo844B();
        mo843A();
        if (this.f698s == 1) {
            return 0;
        }
        return mo906c(i, vVar, a0Var);
    }

    /* renamed from: a */
    public void mo852a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f679J == null) {
            super.mo852a(rect, i, i2);
        }
        int l = mo1240l() + mo1239k();
        int j = mo1238j() + mo1241m();
        if (this.f698s == 1) {
            i4 = C0120o.m499a(i2, rect.height() + j, mo1234h());
            int[] iArr = this.f679J;
            i3 = C0120o.m499a(i, iArr[iArr.length - 1] + l, mo1236i());
        } else {
            i3 = C0120o.m499a(i, rect.width() + l, mo1236i());
            int[] iArr2 = this.f679J;
            i4 = C0120o.m499a(i2, iArr2[iArr2.length - 1] + j, mo1234h());
        }
        this.f795b.setMeasuredDimension(i3, i4);
    }

    /* renamed from: a */
    public void mo862a(boolean z) {
        if (!z) {
            mo900a((String) null);
            if (this.f704y) {
                this.f704y = false;
                mo1242p();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }
}
