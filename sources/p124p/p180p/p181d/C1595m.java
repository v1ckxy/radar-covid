package p124p.p180p.p181d;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0099a0;
import androidx.recyclerview.widget.RecyclerView.C0105d0;
import androidx.recyclerview.widget.RecyclerView.C0108g;
import androidx.recyclerview.widget.RecyclerView.C0120o;
import androidx.recyclerview.widget.RecyclerView.C0120o.C0123c;
import androidx.recyclerview.widget.RecyclerView.C0132v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p124p.p150h.p158h.C1353e;

/* renamed from: p.p.d.m */
public final class C1595m implements Runnable {

    /* renamed from: i */
    public static final ThreadLocal<C1595m> f4694i = new ThreadLocal<>();

    /* renamed from: j */
    public static Comparator<C1598c> f4695j = new C1596a();

    /* renamed from: e */
    public ArrayList<RecyclerView> f4696e = new ArrayList<>();

    /* renamed from: f */
    public long f4697f;

    /* renamed from: g */
    public long f4698g;

    /* renamed from: h */
    public ArrayList<C1598c> f4699h = new ArrayList<>();

    /* renamed from: p.p.d.m$a */
    public class C1596a implements Comparator<C1598c> {
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
            if (r6.f4707d == null) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
            if (r0 != false) goto L_0x001d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            return -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(java.lang.Object r6, java.lang.Object r7) {
            /*
                r5 = this;
                p.p.d.m$c r6 = (p124p.p180p.p181d.C1595m.C1598c) r6
                p.p.d.m$c r7 = (p124p.p180p.p181d.C1595m.C1598c) r7
                androidx.recyclerview.widget.RecyclerView r0 = r6.f4707d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x000c
                r0 = r2
                goto L_0x000d
            L_0x000c:
                r0 = r1
            L_0x000d:
                androidx.recyclerview.widget.RecyclerView r3 = r7.f4707d
                if (r3 != 0) goto L_0x0013
                r3 = r2
                goto L_0x0014
            L_0x0013:
                r3 = r1
            L_0x0014:
                r4 = -1
                if (r0 == r3) goto L_0x001f
                androidx.recyclerview.widget.RecyclerView r6 = r6.f4707d
                if (r6 != 0) goto L_0x001d
            L_0x001b:
                r1 = r2
                goto L_0x0039
            L_0x001d:
                r1 = r4
                goto L_0x0039
            L_0x001f:
                boolean r0 = r6.f4704a
                boolean r3 = r7.f4704a
                if (r0 == r3) goto L_0x0028
                if (r0 == 0) goto L_0x001b
                goto L_0x001d
            L_0x0028:
                int r0 = r7.f4705b
                int r2 = r6.f4705b
                int r0 = r0 - r2
                if (r0 == 0) goto L_0x0031
                r1 = r0
                goto L_0x0039
            L_0x0031:
                int r6 = r6.f4706c
                int r7 = r7.f4706c
                int r6 = r6 - r7
                if (r6 == 0) goto L_0x0039
                r1 = r6
            L_0x0039:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p124p.p180p.p181d.C1595m.C1596a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: p.p.d.m$b */
    public static class C1597b implements C0123c {

        /* renamed from: a */
        public int f4700a;

        /* renamed from: b */
        public int f4701b;

        /* renamed from: c */
        public int[] f4702c;

        /* renamed from: d */
        public int f4703d;

        /* renamed from: a */
        public void mo6339a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f4703d * 2;
                int[] iArr = this.f4702c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f4702c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f4702c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f4702c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f4703d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* renamed from: a */
        public void mo6340a(RecyclerView recyclerView, boolean z) {
            this.f4703d = 0;
            int[] iArr = this.f4702c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            C0120o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && oVar != null && oVar.f805l) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.mo6268c()) {
                        oVar.mo892a(recyclerView.mAdapter.mo1178b(), (C0123c) this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    oVar.mo890a(this.f4700a, this.f4701b, recyclerView.mState, (C0123c) this);
                }
                int i = this.f4703d;
                if (i > oVar.f806m) {
                    oVar.f806m = i;
                    oVar.f807n = z;
                    recyclerView.mRecycler.mo1272d();
                }
            }
        }

        /* renamed from: a */
        public boolean mo6341a(int i) {
            if (this.f4702c != null) {
                int i2 = this.f4703d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f4702c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: p.p.d.m$c */
    public static class C1598c {

        /* renamed from: a */
        public boolean f4704a;

        /* renamed from: b */
        public int f4705b;

        /* renamed from: c */
        public int f4706c;

        /* renamed from: d */
        public RecyclerView f4707d;

        /* renamed from: e */
        public int f4708e;
    }

    /* renamed from: a */
    public void mo6336a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f4697f == 0) {
            this.f4697f = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C1597b bVar = recyclerView.mPrefetchRegistry;
        bVar.f4700a = i;
        bVar.f4701b = i2;
    }

    public void run() {
        try {
            C1353e.m3438a(RecyclerView.TRACE_PREFETCH_TAG);
            if (this.f4696e.isEmpty()) {
                this.f4697f = 0;
                Trace.endSection();
                return;
            }
            int size = this.f4696e.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                RecyclerView recyclerView = (RecyclerView) this.f4696e.get(i);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.f4697f = 0;
                Trace.endSection();
                return;
            }
            mo6335a(TimeUnit.MILLISECONDS.toNanos(j) + this.f4698g);
            this.f4697f = 0;
            Trace.endSection();
        } catch (Throwable th) {
            this.f4697f = 0;
            C1353e.m3437a();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo6335a(long j) {
        C1598c cVar;
        int size = this.f4696e.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = (RecyclerView) this.f4696e.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.mo6340a(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.f4703d;
            }
        }
        this.f4699h.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f4696e.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C1597b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.f4701b) + Math.abs(bVar.f4700a);
                for (int i5 = 0; i5 < bVar.f4703d * 2; i5 += 2) {
                    if (i3 >= this.f4699h.size()) {
                        cVar = new C1598c();
                        this.f4699h.add(cVar);
                    } else {
                        cVar = (C1598c) this.f4699h.get(i3);
                    }
                    int i6 = bVar.f4702c[i5 + 1];
                    cVar.f4704a = i6 <= abs;
                    cVar.f4705b = abs;
                    cVar.f4706c = i6;
                    cVar.f4707d = recyclerView2;
                    cVar.f4708e = bVar.f4702c[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f4699h, f4695j);
        int i7 = 0;
        while (i7 < this.f4699h.size()) {
            C1598c cVar2 = (C1598c) this.f4699h.get(i7);
            if (cVar2.f4707d != null) {
                C0105d0 a = mo6334a(cVar2.f4707d, cVar2.f4708e, cVar2.f4704a ? RecyclerView.FOREVER_NS : j);
                if (a != null && a.f758b != null && a.mo1156g() && !a.mo1157h()) {
                    RecyclerView recyclerView3 = (RecyclerView) a.f758b.get();
                    if (recyclerView3 != null) {
                        if (recyclerView3.mDataSetHasChangedAfterLayout && recyclerView3.mChildHelper.mo6285b() != 0) {
                            recyclerView3.removeAndRecycleViews();
                        }
                        C1597b bVar2 = recyclerView3.mPrefetchRegistry;
                        bVar2.mo6340a(recyclerView3, true);
                        if (bVar2.f4703d != 0) {
                            try {
                                C1353e.m3438a(RecyclerView.TRACE_NESTED_PREFETCH_TAG);
                                C0099a0 a0Var = recyclerView3.mState;
                                C0108g gVar = recyclerView3.mAdapter;
                                a0Var.f735d = 1;
                                a0Var.f736e = gVar.mo1178b();
                                a0Var.f738g = false;
                                a0Var.f739h = false;
                                a0Var.f740i = false;
                                for (int i8 = 0; i8 < bVar2.f4703d * 2; i8 += 2) {
                                    mo6334a(recyclerView3, bVar2.f4702c[i8], j);
                                }
                                Trace.endSection();
                            } catch (Throwable th) {
                                C1353e.m3437a();
                                throw th;
                            }
                        }
                    }
                }
                cVar2.f4704a = false;
                cVar2.f4705b = 0;
                cVar2.f4706c = 0;
                cVar2.f4707d = null;
                cVar2.f4708e = 0;
                i7++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final C0105d0 mo6334a(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int b = recyclerView.mChildHelper.mo6285b();
        int i2 = 0;
        while (true) {
            if (i2 >= b) {
                z = false;
                break;
            }
            C0105d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.mo6290d(i2));
            if (childViewHolderInt.f759c == i && !childViewHolderInt.mo1157h()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        C0132v vVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            C0105d0 a = vVar.mo1261a(i, false, j);
            if (a != null) {
                if (!a.mo1156g() || a.mo1157h()) {
                    vVar.mo1266a(a, false);
                } else {
                    vVar.mo1263a(a.f757a);
                }
            }
            return a;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }
}
