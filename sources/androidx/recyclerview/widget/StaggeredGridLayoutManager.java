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
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView.C0099a0;
import androidx.recyclerview.widget.RecyclerView.C0108g;
import androidx.recyclerview.widget.RecyclerView.C0120o;
import androidx.recyclerview.widget.RecyclerView.C0120o.C0123c;
import androidx.recyclerview.widget.RecyclerView.C0120o.C0124d;
import androidx.recyclerview.widget.RecyclerView.C0125p;
import androidx.recyclerview.widget.RecyclerView.C0132v;
import androidx.recyclerview.widget.RecyclerView.C0137z;
import androidx.recyclerview.widget.RecyclerView.C0137z.C0139b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p124p.p126b.p127k.C1061o;
import p124p.p180p.p181d.C1595m.C1597b;
import p124p.p180p.p181d.C1599n;
import p124p.p180p.p181d.C1600o;
import p124p.p180p.p181d.C1606t;
import p213q.p214a.p215a.p216a.C1965a;

public class StaggeredGridLayoutManager extends C0120o implements C0139b {

    /* renamed from: A */
    public boolean f853A;

    /* renamed from: B */
    public BitSet f854B;

    /* renamed from: C */
    public int f855C;

    /* renamed from: D */
    public int f856D;

    /* renamed from: E */
    public C0143d f857E;

    /* renamed from: F */
    public int f858F;

    /* renamed from: G */
    public boolean f859G;

    /* renamed from: H */
    public boolean f860H;

    /* renamed from: I */
    public C0146e f861I;

    /* renamed from: J */
    public int f862J;

    /* renamed from: K */
    public final Rect f863K;

    /* renamed from: L */
    public final C0141b f864L;

    /* renamed from: M */
    public boolean f865M;

    /* renamed from: N */
    public boolean f866N;

    /* renamed from: O */
    public int[] f867O;

    /* renamed from: P */
    public final Runnable f868P;

    /* renamed from: s */
    public int f869s = -1;

    /* renamed from: t */
    public C0148f[] f870t;

    /* renamed from: u */
    public C1606t f871u;

    /* renamed from: v */
    public C1606t f872v;

    /* renamed from: w */
    public int f873w;

    /* renamed from: x */
    public int f874x;

    /* renamed from: y */
    public final C1599n f875y;

    /* renamed from: z */
    public boolean f876z;

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class C0140a implements Runnable {
        public C0140a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo1308s();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C0141b {

        /* renamed from: a */
        public int f878a;

        /* renamed from: b */
        public int f879b;

        /* renamed from: c */
        public boolean f880c;

        /* renamed from: d */
        public boolean f881d;

        /* renamed from: e */
        public boolean f882e;

        /* renamed from: f */
        public int[] f883f;

        public C0141b() {
            mo1316b();
        }

        /* renamed from: a */
        public void mo1315a() {
            this.f879b = this.f880c ? StaggeredGridLayoutManager.this.f871u.mo6357b() : StaggeredGridLayoutManager.this.f871u.mo6365f();
        }

        /* renamed from: b */
        public void mo1316b() {
            this.f878a = -1;
            this.f879b = RecyclerView.UNDEFINED_DURATION;
            this.f880c = false;
            this.f881d = false;
            this.f882e = false;
            int[] iArr = this.f883f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C0142c extends C0125p {

        /* renamed from: e */
        public C0148f f885e;

        /* renamed from: f */
        public boolean f886f;

        public C0142c(int i, int i2) {
            super(i, i2);
        }

        public C0142c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0142c(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0142c(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    public static class C0143d {

        /* renamed from: a */
        public int[] f887a;

        /* renamed from: b */
        public List<C0144a> f888b;

        @SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        public static class C0144a implements Parcelable {
            public static final Creator<C0144a> CREATOR = new C0145a();

            /* renamed from: e */
            public int f889e;

            /* renamed from: f */
            public int f890f;

            /* renamed from: g */
            public int[] f891g;

            /* renamed from: h */
            public boolean f892h;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            public class C0145a implements Creator<C0144a> {
                public Object createFromParcel(Parcel parcel) {
                    return new C0144a(parcel);
                }

                public Object[] newArray(int i) {
                    return new C0144a[i];
                }
            }

            public C0144a() {
            }

            public C0144a(Parcel parcel) {
                this.f889e = parcel.readInt();
                this.f890f = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                this.f892h = z;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f891g = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("FullSpanItem{mPosition=");
                a.append(this.f889e);
                a.append(", mGapDir=");
                a.append(this.f890f);
                a.append(", mHasUnwantedGapAfter=");
                a.append(this.f892h);
                a.append(", mGapPerSpan=");
                a.append(Arrays.toString(this.f891g));
                a.append('}');
                return a.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f889e);
                parcel.writeInt(this.f890f);
                parcel.writeInt(this.f892h ? 1 : 0);
                int[] iArr = this.f891g;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f891g);
            }
        }

        /* renamed from: a */
        public C0144a mo1317a(int i, int i2, int i3, boolean z) {
            List<C0144a> list = this.f888b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0144a aVar = (C0144a) this.f888b.get(i4);
                int i5 = aVar.f889e;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.f890f == i3 || (z && aVar.f892h))) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo1318a() {
            int[] iArr = this.f887a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f888b = null;
        }

        /* renamed from: a */
        public void mo1319a(int i) {
            int[] iArr = this.f887a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f887a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f887a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f887a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: a */
        public void mo1321a(C0144a aVar) {
            if (this.f888b == null) {
                this.f888b = new ArrayList();
            }
            int size = this.f888b.size();
            for (int i = 0; i < size; i++) {
                C0144a aVar2 = (C0144a) this.f888b.get(i);
                if (aVar2.f889e == aVar.f889e) {
                    this.f888b.remove(i);
                }
                if (aVar2.f889e >= aVar.f889e) {
                    this.f888b.add(i, aVar);
                    return;
                }
            }
            this.f888b.add(aVar);
        }

        /* renamed from: b */
        public int mo1322b(int i) {
            List<C0144a> list = this.f888b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((C0144a) this.f888b.get(size)).f889e >= i) {
                        this.f888b.remove(size);
                    }
                }
            }
            return mo1325d(i);
        }

        /* renamed from: b */
        public void mo1323b(int i, int i2) {
            int[] iArr = this.f887a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo1319a(i3);
                int[] iArr2 = this.f887a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f887a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                List<C0144a> list = this.f888b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        C0144a aVar = (C0144a) this.f888b.get(size);
                        int i4 = aVar.f889e;
                        if (i4 >= i) {
                            if (i4 < i3) {
                                this.f888b.remove(size);
                            } else {
                                aVar.f889e = i4 - i2;
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        public C0144a mo1324c(int i) {
            List<C0144a> list = this.f888b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C0144a aVar = (C0144a) this.f888b.get(size);
                if (aVar.f889e == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo1325d(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.f887a
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.length
                if (r5 < r0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f888b
                if (r0 != 0) goto L_0x0010
            L_0x000e:
                r0 = r1
                goto L_0x0046
            L_0x0010:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r4.mo1324c(r5)
                if (r0 == 0) goto L_0x001b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r4.f888b
                r2.remove(r0)
            L_0x001b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f888b
                int r0 = r0.size()
                r2 = 0
            L_0x0022:
                if (r2 >= r0) goto L_0x0034
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f888b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0143d.C0144a) r3
                int r3 = r3.f889e
                if (r3 < r5) goto L_0x0031
                goto L_0x0035
            L_0x0031:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0034:
                r2 = r1
            L_0x0035:
                if (r2 == r1) goto L_0x000e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f888b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0143d.C0144a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f888b
                r3.remove(r2)
                int r0 = r0.f889e
            L_0x0046:
                if (r0 != r1) goto L_0x0052
                int[] r0 = r4.f887a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.f887a
                int r5 = r5.length
                return r5
            L_0x0052:
                int[] r2 = r4.f887a
                int r0 = r0 + 1
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.C0143d.mo1325d(int):int");
        }

        /* renamed from: a */
        public void mo1320a(int i, int i2) {
            int[] iArr = this.f887a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo1319a(i3);
                int[] iArr2 = this.f887a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f887a, i, i3, -1);
                List<C0144a> list = this.f888b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        C0144a aVar = (C0144a) this.f888b.get(size);
                        int i4 = aVar.f889e;
                        if (i4 >= i) {
                            aVar.f889e = i4 + i2;
                        }
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    public static class C0146e implements Parcelable {
        public static final Creator<C0146e> CREATOR = new C0147a();

        /* renamed from: e */
        public int f893e;

        /* renamed from: f */
        public int f894f;

        /* renamed from: g */
        public int f895g;

        /* renamed from: h */
        public int[] f896h;

        /* renamed from: i */
        public int f897i;

        /* renamed from: j */
        public int[] f898j;

        /* renamed from: k */
        public List<C0144a> f899k;

        /* renamed from: l */
        public boolean f900l;

        /* renamed from: m */
        public boolean f901m;

        /* renamed from: n */
        public boolean f902n;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        public class C0147a implements Creator<C0146e> {
            public Object createFromParcel(Parcel parcel) {
                return new C0146e(parcel);
            }

            public Object[] newArray(int i) {
                return new C0146e[i];
            }
        }

        public C0146e() {
        }

        public C0146e(Parcel parcel) {
            this.f893e = parcel.readInt();
            this.f894f = parcel.readInt();
            int readInt = parcel.readInt();
            this.f895g = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f896h = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f897i = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f898j = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f900l = parcel.readInt() == 1;
            this.f901m = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.f902n = z;
            this.f899k = parcel.readArrayList(C0144a.class.getClassLoader());
        }

        public C0146e(C0146e eVar) {
            this.f895g = eVar.f895g;
            this.f893e = eVar.f893e;
            this.f894f = eVar.f894f;
            this.f896h = eVar.f896h;
            this.f897i = eVar.f897i;
            this.f898j = eVar.f898j;
            this.f900l = eVar.f900l;
            this.f901m = eVar.f901m;
            this.f902n = eVar.f902n;
            this.f899k = eVar.f899k;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f893e);
            parcel.writeInt(this.f894f);
            parcel.writeInt(this.f895g);
            if (this.f895g > 0) {
                parcel.writeIntArray(this.f896h);
            }
            parcel.writeInt(this.f897i);
            if (this.f897i > 0) {
                parcel.writeIntArray(this.f898j);
            }
            parcel.writeInt(this.f900l ? 1 : 0);
            parcel.writeInt(this.f901m ? 1 : 0);
            parcel.writeInt(this.f902n ? 1 : 0);
            parcel.writeList(this.f899k);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    public class C0148f {

        /* renamed from: a */
        public ArrayList<View> f903a = new ArrayList<>();

        /* renamed from: b */
        public int f904b = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: c */
        public int f905c = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: d */
        public int f906d = 0;

        /* renamed from: e */
        public final int f907e;

        public C0148f(int i) {
            this.f907e = i;
        }

        /* renamed from: a */
        public int mo1335a(int i) {
            int i2 = this.f905c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f903a.size() == 0) {
                return i;
            }
            mo1338a();
            return this.f905c;
        }

        /* renamed from: a */
        public View mo1337a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f903a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f903a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f876z && staggeredGridLayoutManager.mo1237i(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f876z && staggeredGridLayoutManager2.mo1237i(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f903a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = (View) this.f903a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f876z && staggeredGridLayoutManager3.mo1237i(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f876z && staggeredGridLayoutManager4.mo1237i(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: a */
        public void mo1338a() {
            ArrayList<View> arrayList = this.f903a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            C0142c b = mo1341b(view);
            this.f905c = StaggeredGridLayoutManager.this.f871u.mo6355a(view);
            if (b.f886f) {
                C0144a c = StaggeredGridLayoutManager.this.f857E.mo1324c(b.mo1248a());
                if (c != null && c.f890f == 1) {
                    int i = this.f905c;
                    int i2 = this.f907e;
                    int[] iArr = c.f891g;
                    this.f905c = i + (iArr == null ? 0 : iArr[i2]);
                }
            }
        }

        /* renamed from: a */
        public void mo1339a(View view) {
            C0142c b = mo1341b(view);
            b.f885e = this;
            this.f903a.add(view);
            this.f905c = RecyclerView.UNDEFINED_DURATION;
            if (this.f903a.size() == 1) {
                this.f904b = RecyclerView.UNDEFINED_DURATION;
            }
            if (b.mo1250c() || b.mo1249b()) {
                this.f906d = StaggeredGridLayoutManager.this.f871u.mo6358b(view) + this.f906d;
            }
        }

        /* renamed from: b */
        public int mo1340b(int i) {
            int i2 = this.f904b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f903a.size() == 0) {
                return i;
            }
            mo1342b();
            return this.f904b;
        }

        /* renamed from: b */
        public C0142c mo1341b(View view) {
            return (C0142c) view.getLayoutParams();
        }

        /* renamed from: b */
        public void mo1342b() {
            int i = 0;
            View view = (View) this.f903a.get(0);
            C0142c b = mo1341b(view);
            this.f904b = StaggeredGridLayoutManager.this.f871u.mo6362d(view);
            if (b.f886f) {
                C0144a c = StaggeredGridLayoutManager.this.f857E.mo1324c(b.mo1248a());
                if (c != null && c.f890f == -1) {
                    int i2 = this.f904b;
                    int i3 = this.f907e;
                    int[] iArr = c.f891g;
                    if (iArr != null) {
                        i = iArr[i3];
                    }
                    this.f904b = i2 - i;
                }
            }
        }

        /* renamed from: c */
        public void mo1343c() {
            this.f903a.clear();
            this.f904b = RecyclerView.UNDEFINED_DURATION;
            this.f905c = RecyclerView.UNDEFINED_DURATION;
            this.f906d = 0;
        }

        /* renamed from: c */
        public void mo1344c(View view) {
            C0142c b = mo1341b(view);
            b.f885e = this;
            this.f903a.add(0, view);
            this.f904b = RecyclerView.UNDEFINED_DURATION;
            if (this.f903a.size() == 1) {
                this.f905c = RecyclerView.UNDEFINED_DURATION;
            }
            if (b.mo1250c() || b.mo1249b()) {
                this.f906d = StaggeredGridLayoutManager.this.f871u.mo6358b(view) + this.f906d;
            }
        }

        /* renamed from: d */
        public int mo1345d() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f876z) {
                i2 = this.f903a.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.f903a.size();
            }
            return mo1336a(i2, i, true);
        }

        /* renamed from: e */
        public int mo1346e() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f876z) {
                i2 = 0;
                i = this.f903a.size();
            } else {
                i2 = this.f903a.size() - 1;
                i = -1;
            }
            return mo1336a(i2, i, true);
        }

        /* renamed from: f */
        public void mo1347f() {
            int size = this.f903a.size();
            View view = (View) this.f903a.remove(size - 1);
            C0142c b = mo1341b(view);
            b.f885e = null;
            if (b.mo1250c() || b.mo1249b()) {
                this.f906d -= StaggeredGridLayoutManager.this.f871u.mo6358b(view);
            }
            if (size == 1) {
                this.f904b = RecyclerView.UNDEFINED_DURATION;
            }
            this.f905c = RecyclerView.UNDEFINED_DURATION;
        }

        /* renamed from: g */
        public void mo1348g() {
            View view = (View) this.f903a.remove(0);
            C0142c b = mo1341b(view);
            b.f885e = null;
            if (this.f903a.size() == 0) {
                this.f905c = RecyclerView.UNDEFINED_DURATION;
            }
            if (b.mo1250c() || b.mo1249b()) {
                this.f906d -= StaggeredGridLayoutManager.this.f871u.mo6358b(view);
            }
            this.f904b = RecyclerView.UNDEFINED_DURATION;
        }

        /* renamed from: a */
        public int mo1336a(int i, int i2, boolean z) {
            int f = StaggeredGridLayoutManager.this.f871u.mo6365f();
            int b = StaggeredGridLayoutManager.this.f871u.mo6357b();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = (View) this.f903a.get(i);
                int d = StaggeredGridLayoutManager.this.f871u.mo6362d(view);
                int a = StaggeredGridLayoutManager.this.f871u.mo6355a(view);
                boolean z2 = false;
                boolean z3 = !z ? d < b : d <= b;
                if (!z ? a > f : a >= f) {
                    z2 = true;
                }
                if (z3 && z2 && (d < f || a > b)) {
                    return StaggeredGridLayoutManager.this.mo1237i(view);
                }
                i += i3;
            }
            return -1;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f876z = false;
        this.f853A = false;
        this.f855C = -1;
        this.f856D = RecyclerView.UNDEFINED_DURATION;
        this.f857E = new C0143d();
        this.f858F = 2;
        this.f863K = new Rect();
        this.f864L = new C0141b();
        this.f865M = false;
        this.f866N = true;
        this.f868P = new C0140a();
        C0124d a = C0120o.m501a(context, attributeSet, i, i2);
        int i3 = a.f814a;
        if (i3 == 0 || i3 == 1) {
            mo900a((String) null);
            if (i3 != this.f873w) {
                this.f873w = i3;
                C1606t tVar = this.f871u;
                this.f871u = this.f872v;
                this.f872v = tVar;
                mo1242p();
            }
            int i4 = a.f815b;
            mo900a((String) null);
            if (i4 != this.f869s) {
                this.f857E.mo1318a();
                mo1242p();
                this.f869s = i4;
                this.f854B = new BitSet(this.f869s);
                this.f870t = new C0148f[this.f869s];
                for (int i5 = 0; i5 < this.f869s; i5++) {
                    this.f870t[i5] = new C0148f(i5);
                }
                mo1242p();
            }
            boolean z = a.f816c;
            mo900a((String) null);
            C0146e eVar = this.f861I;
            if (!(eVar == null || eVar.f900l == z)) {
                eVar.f900l = z;
            }
            this.f876z = z;
            mo1242p();
            this.f875y = new C1599n();
            this.f871u = C1606t.m4079a(this, this.f873w);
            this.f872v = C1606t.m4079a(this, 1 - this.f873w);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: a */
    public int mo845a(int i, C0132v vVar, C0099a0 a0Var) {
        return mo1295c(i, vVar, a0Var);
    }

    /* renamed from: a */
    public int mo885a(C0099a0 a0Var) {
        return mo1300h(a0Var);
    }

    /* renamed from: a */
    public PointF mo887a(int i) {
        int i2 = mo1301i(i);
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.f873w == 0) {
            pointF.x = (float) i2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) i2;
        }
        return pointF;
    }

    /* renamed from: a */
    public View mo1284a(boolean z) {
        int f = this.f871u.mo6365f();
        int b = this.f871u.mo6357b();
        View view = null;
        for (int d = mo1222d() - 1; d >= 0; d--) {
            View c = mo1219c(d);
            int d2 = this.f871u.mo6362d(c);
            int a = this.f871u.mo6355a(c);
            if (a > f && d2 < b) {
                if (a <= b || !z) {
                    return c;
                }
                if (view == null) {
                    view = c;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    public C0125p mo850a(Context context, AttributeSet attributeSet) {
        return new C0142c(context, attributeSet);
    }

    /* renamed from: a */
    public C0125p mo851a(LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams ? new C0142c((MarginLayoutParams) layoutParams) : new C0142c(layoutParams);
    }

    /* renamed from: a */
    public void mo1285a(int i, C0099a0 a0Var) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo1310u();
            i2 = 1;
        } else {
            i2 = -1;
            i3 = mo1309t();
        }
        this.f875y.f4709a = true;
        mo1292b(i3, a0Var);
        mo1307m(i2);
        C1599n nVar = this.f875y;
        nVar.f4711c = i3 + nVar.f4712d;
        nVar.f4710b = Math.abs(i);
    }

    /* renamed from: a */
    public void mo894a(AccessibilityEvent accessibilityEvent) {
        super.mo894a(accessibilityEvent);
        if (mo1222d() > 0) {
            View b = mo1291b(false);
            View a = mo1284a(false);
            if (b != null && a != null) {
                int i = mo1237i(b);
                int i2 = mo1237i(a);
                if (i < i2) {
                    accessibilityEvent.setFromIndex(i);
                    accessibilityEvent.setToIndex(i2);
                    return;
                }
                accessibilityEvent.setFromIndex(i2);
                accessibilityEvent.setToIndex(i);
            }
        }
    }

    /* renamed from: a */
    public void mo1206a(C0108g gVar, C0108g gVar2) {
        this.f857E.mo1318a();
        for (int i = 0; i < this.f869s; i++) {
            this.f870t[i].mo1343c();
        }
    }

    /* renamed from: a */
    public final void mo1287a(C0132v vVar, int i) {
        for (int d = mo1222d() - 1; d >= 0; d--) {
            View c = mo1219c(d);
            if (this.f871u.mo6362d(c) < i || this.f871u.mo6366f(c) < i) {
                break;
            }
            C0142c cVar = (C0142c) c.getLayoutParams();
            if (cVar.f886f) {
                int i2 = 0;
                while (i2 < this.f869s) {
                    if (this.f870t[i2].f903a.size() != 1) {
                        i2++;
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f869s; i3++) {
                    this.f870t[i3].mo1347f();
                }
            } else if (cVar.f885e.f903a.size() != 1) {
                cVar.f885e.mo1347f();
            } else {
                return;
            }
            mo1203a(c, vVar);
        }
    }

    /* renamed from: a */
    public final void mo1288a(C0132v vVar, C0099a0 a0Var, boolean z) {
        int j = mo1303j((int) RecyclerView.UNDEFINED_DURATION);
        if (j != Integer.MIN_VALUE) {
            int b = this.f871u.mo6357b() - j;
            if (b > 0) {
                int i = b - (-mo1295c(-b, vVar, a0Var));
                if (z && i > 0) {
                    this.f871u.mo6356a(i);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo858a(RecyclerView recyclerView) {
        this.f857E.mo1318a();
        mo1242p();
    }

    /* renamed from: a */
    public void mo859a(RecyclerView recyclerView, int i, int i2) {
        mo1297c(i, i2, 1);
    }

    /* renamed from: a */
    public void mo860a(RecyclerView recyclerView, int i, int i2, int i3) {
        mo1297c(i, i2, 8);
    }

    /* renamed from: a */
    public void mo861a(RecyclerView recyclerView, int i, int i2, Object obj) {
        mo1297c(i, i2, 4);
    }

    /* renamed from: a */
    public void mo900a(String str) {
        if (this.f861I == null) {
            RecyclerView recyclerView = this.f795b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }
    }

    /* renamed from: a */
    public boolean mo901a() {
        return this.f873w == 0;
    }

    /* renamed from: a */
    public boolean mo863a(C0125p pVar) {
        return pVar instanceof C0142c;
    }

    /* renamed from: b */
    public int mo864b(int i, C0132v vVar, C0099a0 a0Var) {
        return mo1295c(i, vVar, a0Var);
    }

    /* renamed from: b */
    public int mo865b(C0099a0 a0Var) {
        return mo1302i(a0Var);
    }

    /* renamed from: b */
    public View mo1291b(boolean z) {
        int f = this.f871u.mo6365f();
        int b = this.f871u.mo6357b();
        int d = mo1222d();
        View view = null;
        for (int i = 0; i < d; i++) {
            View c = mo1219c(i);
            int d2 = this.f871u.mo6362d(c);
            if (this.f871u.mo6355a(c) > f && d2 < b) {
                if (d2 >= f || !z) {
                    return c;
                }
                if (view == null) {
                    view = c;
                }
            }
        }
        return view;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1292b(int r5, androidx.recyclerview.widget.RecyclerView.C0099a0 r6) {
        /*
            r4 = this;
            p.p.d.n r0 = r4.f875y
            r1 = 0
            r0.f4710b = r1
            r0.f4711c = r5
            androidx.recyclerview.widget.RecyclerView$z r0 = r4.f800g
            r2 = 1
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.f842e
            if (r0 == 0) goto L_0x0012
            r0 = r2
            goto L_0x0013
        L_0x0012:
            r0 = r1
        L_0x0013:
            if (r0 == 0) goto L_0x0034
            int r6 = r6.f732a
            r0 = -1
            if (r6 == r0) goto L_0x0034
            boolean r0 = r4.f853A
            if (r6 >= r5) goto L_0x0020
            r5 = r2
            goto L_0x0021
        L_0x0020:
            r5 = r1
        L_0x0021:
            if (r0 != r5) goto L_0x002b
            p.p.d.t r5 = r4.f871u
            int r5 = r5.mo6367g()
            r6 = r1
            goto L_0x0036
        L_0x002b:
            p.p.d.t r5 = r4.f871u
            int r5 = r5.mo6367g()
            r6 = r5
            r5 = r1
            goto L_0x0036
        L_0x0034:
            r5 = r1
            r6 = r5
        L_0x0036:
            androidx.recyclerview.widget.RecyclerView r0 = r4.f795b
            if (r0 == 0) goto L_0x0040
            boolean r0 = r0.mClipToPadding
            if (r0 == 0) goto L_0x0040
            r0 = r2
            goto L_0x0041
        L_0x0040:
            r0 = r1
        L_0x0041:
            if (r0 == 0) goto L_0x005a
            p.p.d.n r0 = r4.f875y
            p.p.d.t r3 = r4.f871u
            int r3 = r3.mo6365f()
            int r3 = r3 - r6
            r0.f4714f = r3
            p.p.d.n r6 = r4.f875y
            p.p.d.t r0 = r4.f871u
            int r0 = r0.mo6357b()
            int r0 = r0 + r5
            r6.f4715g = r0
            goto L_0x006a
        L_0x005a:
            p.p.d.n r0 = r4.f875y
            p.p.d.t r3 = r4.f871u
            int r3 = r3.mo6354a()
            int r3 = r3 + r5
            r0.f4715g = r3
            p.p.d.n r5 = r4.f875y
            int r6 = -r6
            r5.f4714f = r6
        L_0x006a:
            p.p.d.n r5 = r4.f875y
            r5.f4716h = r1
            r5.f4709a = r2
            p.p.d.t r6 = r4.f871u
            int r6 = r6.mo6361d()
            if (r6 != 0) goto L_0x0081
            p.p.d.t r6 = r4.f871u
            int r6 = r6.mo6354a()
            if (r6 != 0) goto L_0x0081
            r1 = r2
        L_0x0081:
            r5.f4717i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1292b(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    /* renamed from: b */
    public final void mo1293b(C0132v vVar, int i) {
        while (mo1222d() > 0) {
            View c = mo1219c(0);
            if (this.f871u.mo6355a(c) > i || this.f871u.mo6364e(c) > i) {
                break;
            }
            C0142c cVar = (C0142c) c.getLayoutParams();
            if (cVar.f886f) {
                int i2 = 0;
                while (i2 < this.f869s) {
                    if (this.f870t[i2].f903a.size() != 1) {
                        i2++;
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f869s; i3++) {
                    this.f870t[i3].mo1348g();
                }
            } else if (cVar.f885e.f903a.size() != 1) {
                cVar.f885e.mo1348g();
            } else {
                return;
            }
            mo1203a(c, vVar);
        }
    }

    /* renamed from: b */
    public final void mo1294b(C0132v vVar, C0099a0 a0Var, boolean z) {
        int k = mo1305k(Integer.MAX_VALUE);
        if (k != Integer.MAX_VALUE) {
            int f = k - this.f871u.mo6365f();
            if (f > 0) {
                int c = f - mo1295c(f, vVar, a0Var);
                if (z && c > 0) {
                    this.f871u.mo6356a(-c);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo869b(RecyclerView recyclerView, int i, int i2) {
        mo1297c(i, i2, 2);
    }

    /* renamed from: b */
    public boolean mo905b() {
        return this.f873w == 1;
    }

    /* renamed from: c */
    public int mo1295c(int i, C0132v vVar, C0099a0 a0Var) {
        if (mo1222d() == 0 || i == 0) {
            return 0;
        }
        mo1285a(i, a0Var);
        int a = mo1283a(vVar, this.f875y, a0Var);
        if (this.f875y.f4710b >= a) {
            i = i < 0 ? -a : a;
        }
        this.f871u.mo6356a(-i);
        this.f859G = this.f853A;
        C1599n nVar = this.f875y;
        nVar.f4710b = 0;
        mo1289a(vVar, nVar);
        return i;
    }

    /* renamed from: c */
    public int mo870c(C0099a0 a0Var) {
        return mo1304j(a0Var);
    }

    /* renamed from: c */
    public C0125p mo872c() {
        return this.f873w == 0 ? new C0142c(-2, -1) : new C0142c(-1, -2);
    }

    /* renamed from: c */
    public final void mo1296c(int i, int i2) {
        for (int i3 = 0; i3 < this.f869s; i3++) {
            if (!this.f870t[i3].f903a.isEmpty()) {
                mo1290a(this.f870t[i3], i, i2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1297c(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f853A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo1310u()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo1309t()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f857E
            r4.mo1325d(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f857E
            r9.mo1323b(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f857E
            r7.mo1320a(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f857E
            r9.mo1323b(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f857E
            r9.mo1320a(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f853A
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo1309t()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo1310u()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.mo1242p()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1297c(int, int, int):void");
    }

    /* renamed from: c */
    public void mo873c(C0132v vVar, C0099a0 a0Var) {
        mo1298c(vVar, a0Var, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:244:0x03fe, code lost:
        if (mo1308s() != false) goto L_0x0402;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01ae  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1298c(androidx.recyclerview.widget.RecyclerView.C0132v r13, androidx.recyclerview.widget.RecyclerView.C0099a0 r14, boolean r15) {
        /*
            r12 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r12.f864L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r12.f861I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r12.f855C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r14.mo1135a()
            if (r1 != 0) goto L_0x0018
            r12.mo1215b(r13)
            r0.mo1316b()
            return
        L_0x0018:
            boolean r1 = r0.f882e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r12.f855C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r12.f861I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = r3
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            r5 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x01e9
            r0.mo1316b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r12.f861I
            if (r7 == 0) goto L_0x00ba
            int r8 = r7.f895g
            if (r8 <= 0) goto L_0x007d
            int r9 = r12.f869s
            if (r8 != r9) goto L_0x006f
            r7 = r3
        L_0x003f:
            int r8 = r12.f869s
            if (r7 >= r8) goto L_0x007d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r12.f870t
            r8 = r8[r7]
            r8.mo1343c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r8 = r12.f861I
            int[] r9 = r8.f896h
            r9 = r9[r7]
            if (r9 == r6) goto L_0x0064
            boolean r8 = r8.f901m
            if (r8 == 0) goto L_0x005d
            p.p.d.t r8 = r12.f871u
            int r8 = r8.mo6357b()
            goto L_0x0063
        L_0x005d:
            p.p.d.t r8 = r12.f871u
            int r8 = r8.mo6365f()
        L_0x0063:
            int r9 = r9 + r8
        L_0x0064:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r12.f870t
            r8 = r8[r7]
            r8.f904b = r9
            r8.f905c = r9
            int r7 = r7 + 1
            goto L_0x003f
        L_0x006f:
            r7.f896h = r5
            r7.f895g = r3
            r7.f897i = r3
            r7.f898j = r5
            r7.f899k = r5
            int r8 = r7.f894f
            r7.f893e = r8
        L_0x007d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r12.f861I
            boolean r8 = r7.f902n
            r12.f860H = r8
            boolean r7 = r7.f900l
            r12.mo900a(r5)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r8 = r12.f861I
            if (r8 == 0) goto L_0x0092
            boolean r9 = r8.f900l
            if (r9 == r7) goto L_0x0092
            r8.f900l = r7
        L_0x0092:
            r12.f876z = r7
            r12.mo1242p()
            r12.mo1313x()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r12.f861I
            int r8 = r7.f893e
            if (r8 == r2) goto L_0x00a5
            r12.f855C = r8
            boolean r7 = r7.f901m
            goto L_0x00a7
        L_0x00a5:
            boolean r7 = r12.f853A
        L_0x00a7:
            r0.f880c = r7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r12.f861I
            int r8 = r7.f897i
            if (r8 <= r4) goto L_0x00c1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r12.f857E
            int[] r9 = r7.f898j
            r8.f887a = r9
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r7 = r7.f899k
            r8.f888b = r7
            goto L_0x00c1
        L_0x00ba:
            r12.mo1313x()
            boolean r7 = r12.f853A
            r0.f880c = r7
        L_0x00c1:
            boolean r7 = r14.f738g
            if (r7 != 0) goto L_0x01aa
            int r7 = r12.f855C
            if (r7 != r2) goto L_0x00cb
            goto L_0x01aa
        L_0x00cb:
            if (r7 < 0) goto L_0x01a6
            int r8 = r14.mo1135a()
            if (r7 < r8) goto L_0x00d5
            goto L_0x01a6
        L_0x00d5:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r12.f861I
            if (r7 == 0) goto L_0x00ea
            int r8 = r7.f893e
            if (r8 == r2) goto L_0x00ea
            int r7 = r7.f895g
            if (r7 >= r4) goto L_0x00e2
            goto L_0x00ea
        L_0x00e2:
            r0.f879b = r6
            int r7 = r12.f855C
            r0.f878a = r7
            goto L_0x01a4
        L_0x00ea:
            int r7 = r12.f855C
            android.view.View r7 = r12.mo903b(r7)
            if (r7 == 0) goto L_0x0172
            boolean r8 = r12.f853A
            if (r8 == 0) goto L_0x00fb
            int r8 = r12.mo1310u()
            goto L_0x00ff
        L_0x00fb:
            int r8 = r12.mo1309t()
        L_0x00ff:
            r0.f878a = r8
            int r8 = r12.f856D
            if (r8 == r6) goto L_0x012a
            boolean r8 = r0.f880c
            if (r8 == 0) goto L_0x0119
            p.p.d.t r8 = r12.f871u
            int r8 = r8.mo6357b()
            int r9 = r12.f856D
            int r8 = r8 - r9
            p.p.d.t r9 = r12.f871u
            int r7 = r9.mo6355a(r7)
            goto L_0x0128
        L_0x0119:
            p.p.d.t r8 = r12.f871u
            int r8 = r8.mo6365f()
            int r9 = r12.f856D
            int r8 = r8 + r9
            p.p.d.t r9 = r12.f871u
            int r7 = r9.mo6362d(r7)
        L_0x0128:
            int r8 = r8 - r7
            goto L_0x016c
        L_0x012a:
            p.p.d.t r8 = r12.f871u
            int r8 = r8.mo6358b(r7)
            p.p.d.t r9 = r12.f871u
            int r9 = r9.mo6367g()
            if (r8 <= r9) goto L_0x014a
            boolean r7 = r0.f880c
            if (r7 == 0) goto L_0x0143
            p.p.d.t r7 = r12.f871u
            int r7 = r7.mo6357b()
            goto L_0x015a
        L_0x0143:
            p.p.d.t r7 = r12.f871u
            int r7 = r7.mo6365f()
            goto L_0x015a
        L_0x014a:
            p.p.d.t r8 = r12.f871u
            int r8 = r8.mo6362d(r7)
            p.p.d.t r9 = r12.f871u
            int r9 = r9.mo6365f()
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x015d
            int r7 = -r8
        L_0x015a:
            r0.f879b = r7
            goto L_0x01a4
        L_0x015d:
            p.p.d.t r8 = r12.f871u
            int r8 = r8.mo6357b()
            p.p.d.t r9 = r12.f871u
            int r7 = r9.mo6355a(r7)
            int r8 = r8 - r7
            if (r8 >= 0) goto L_0x016f
        L_0x016c:
            r0.f879b = r8
            goto L_0x01a4
        L_0x016f:
            r0.f879b = r6
            goto L_0x01a4
        L_0x0172:
            int r7 = r12.f855C
            r0.f878a = r7
            int r8 = r12.f856D
            if (r8 != r6) goto L_0x0189
            int r7 = r12.mo1301i(r7)
            if (r7 != r4) goto L_0x0182
            r7 = r4
            goto L_0x0183
        L_0x0182:
            r7 = r3
        L_0x0183:
            r0.f880c = r7
            r0.mo1315a()
            goto L_0x01a2
        L_0x0189:
            boolean r7 = r0.f880c
            if (r7 == 0) goto L_0x0197
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            p.p.d.t r7 = r7.f871u
            int r7 = r7.mo6357b()
            int r7 = r7 - r8
            goto L_0x01a0
        L_0x0197:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            p.p.d.t r7 = r7.f871u
            int r7 = r7.mo6365f()
            int r7 = r7 + r8
        L_0x01a0:
            r0.f879b = r7
        L_0x01a2:
            r0.f881d = r4
        L_0x01a4:
            r7 = r4
            goto L_0x01ab
        L_0x01a6:
            r12.f855C = r2
            r12.f856D = r6
        L_0x01aa:
            r7 = r3
        L_0x01ab:
            if (r7 == 0) goto L_0x01ae
            goto L_0x01e7
        L_0x01ae:
            boolean r7 = r12.f859G
            int r8 = r14.mo1135a()
            if (r7 == 0) goto L_0x01ca
            int r7 = r12.mo1222d()
        L_0x01ba:
            int r7 = r7 + r2
            if (r7 < 0) goto L_0x01e2
            android.view.View r9 = r12.mo1219c(r7)
            int r9 = r12.mo1237i(r9)
            if (r9 < 0) goto L_0x01ba
            if (r9 >= r8) goto L_0x01ba
            goto L_0x01e3
        L_0x01ca:
            int r7 = r12.mo1222d()
            r9 = r3
        L_0x01cf:
            if (r9 >= r7) goto L_0x01e2
            android.view.View r10 = r12.mo1219c(r9)
            int r10 = r12.mo1237i(r10)
            if (r10 < 0) goto L_0x01df
            if (r10 >= r8) goto L_0x01df
            r9 = r10
            goto L_0x01e3
        L_0x01df:
            int r9 = r9 + 1
            goto L_0x01cf
        L_0x01e2:
            r9 = r3
        L_0x01e3:
            r0.f878a = r9
            r0.f879b = r6
        L_0x01e7:
            r0.f882e = r4
        L_0x01e9:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r12.f861I
            if (r7 != 0) goto L_0x0206
            int r7 = r12.f855C
            if (r7 != r2) goto L_0x0206
            boolean r7 = r0.f880c
            boolean r8 = r12.f859G
            if (r7 != r8) goto L_0x01ff
            boolean r7 = r12.mo1312w()
            boolean r8 = r12.f860H
            if (r7 == r8) goto L_0x0206
        L_0x01ff:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r12.f857E
            r7.mo1318a()
            r0.f881d = r4
        L_0x0206:
            int r7 = r12.mo1222d()
            if (r7 <= 0) goto L_0x02be
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r12.f861I
            if (r7 == 0) goto L_0x0214
            int r7 = r7.f895g
            if (r7 >= r4) goto L_0x02be
        L_0x0214:
            boolean r7 = r0.f881d
            if (r7 == 0) goto L_0x0233
            r1 = r3
        L_0x0219:
            int r7 = r12.f869s
            if (r1 >= r7) goto L_0x02be
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r12.f870t
            r7 = r7[r1]
            r7.mo1343c()
            int r7 = r0.f879b
            if (r7 == r6) goto L_0x0230
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r12.f870t
            r8 = r8[r1]
            r8.f904b = r7
            r8.f905c = r7
        L_0x0230:
            int r1 = r1 + 1
            goto L_0x0219
        L_0x0233:
            if (r1 != 0) goto L_0x0255
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r12.f864L
            int[] r1 = r1.f883f
            if (r1 != 0) goto L_0x023c
            goto L_0x0255
        L_0x023c:
            r1 = r3
        L_0x023d:
            int r7 = r12.f869s
            if (r1 >= r7) goto L_0x02be
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r12.f870t
            r7 = r7[r1]
            r7.mo1343c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r8 = r12.f864L
            int[] r8 = r8.f883f
            r8 = r8[r1]
            r7.f904b = r8
            r7.f905c = r8
            int r1 = r1 + 1
            goto L_0x023d
        L_0x0255:
            r1 = r3
        L_0x0256:
            int r7 = r12.f869s
            if (r1 >= r7) goto L_0x0296
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r12.f870t
            r7 = r7[r1]
            boolean r8 = r12.f853A
            int r9 = r0.f879b
            if (r8 == 0) goto L_0x0269
            int r10 = r7.mo1335a(r6)
            goto L_0x026d
        L_0x0269:
            int r10 = r7.mo1340b(r6)
        L_0x026d:
            r7.mo1343c()
            if (r10 != r6) goto L_0x0273
            goto L_0x0293
        L_0x0273:
            if (r8 == 0) goto L_0x027f
            androidx.recyclerview.widget.StaggeredGridLayoutManager r11 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            p.p.d.t r11 = r11.f871u
            int r11 = r11.mo6357b()
            if (r10 < r11) goto L_0x0293
        L_0x027f:
            if (r8 != 0) goto L_0x028c
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            p.p.d.t r8 = r8.f871u
            int r8 = r8.mo6365f()
            if (r10 <= r8) goto L_0x028c
            goto L_0x0293
        L_0x028c:
            if (r9 == r6) goto L_0x028f
            int r10 = r10 + r9
        L_0x028f:
            r7.f905c = r10
            r7.f904b = r10
        L_0x0293:
            int r1 = r1 + 1
            goto L_0x0256
        L_0x0296:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r12.f864L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r12.f870t
            if (r1 == 0) goto L_0x02bd
            int r8 = r7.length
            int[] r9 = r1.f883f
            if (r9 == 0) goto L_0x02a4
            int r9 = r9.length
            if (r9 >= r8) goto L_0x02ad
        L_0x02a4:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r9 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r9 = r9.f870t
            int r9 = r9.length
            int[] r9 = new int[r9]
            r1.f883f = r9
        L_0x02ad:
            r9 = r3
        L_0x02ae:
            if (r9 >= r8) goto L_0x02be
            int[] r10 = r1.f883f
            r11 = r7[r9]
            int r11 = r11.mo1340b(r6)
            r10[r9] = r11
            int r9 = r9 + 1
            goto L_0x02ae
        L_0x02bd:
            throw r5
        L_0x02be:
            r12.mo1207a(r13)
            p.p.d.n r1 = r12.f875y
            r1.f4709a = r3
            r12.f865M = r3
            p.p.d.t r1 = r12.f872v
            int r1 = r1.mo6367g()
            int r7 = r12.f869s
            int r7 = r1 / r7
            r12.f874x = r7
            p.p.d.t r7 = r12.f872v
            int r7 = r7.mo6361d()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r7)
            r12.f862J = r1
            int r1 = r0.f878a
            r12.mo1292b(r1, r14)
            boolean r1 = r0.f880c
            if (r1 == 0) goto L_0x02f4
            r12.mo1307m(r2)
            p.p.d.n r1 = r12.f875y
            r12.mo1283a(r13, r1, r14)
            r12.mo1307m(r4)
            goto L_0x02ff
        L_0x02f4:
            r12.mo1307m(r4)
            p.p.d.n r1 = r12.f875y
            r12.mo1283a(r13, r1, r14)
            r12.mo1307m(r2)
        L_0x02ff:
            p.p.d.n r1 = r12.f875y
            int r2 = r0.f878a
            int r7 = r1.f4712d
            int r2 = r2 + r7
            r1.f4711c = r2
            r12.mo1283a(r13, r1, r14)
            p.p.d.t r1 = r12.f872v
            int r1 = r1.mo6361d()
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L_0x0317
            goto L_0x03bb
        L_0x0317:
            r1 = 0
            int r2 = r12.mo1222d()
            r7 = r3
        L_0x031d:
            if (r7 >= r2) goto L_0x033f
            android.view.View r8 = r12.mo1219c(r7)
            p.p.d.t r9 = r12.f872v
            int r9 = r9.mo6358b(r8)
            float r9 = (float) r9
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x032f
            goto L_0x033b
        L_0x032f:
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0142c) r8
            if (r8 == 0) goto L_0x033e
            float r1 = java.lang.Math.max(r1, r9)
        L_0x033b:
            int r7 = r7 + 1
            goto L_0x031d
        L_0x033e:
            throw r5
        L_0x033f:
            int r5 = r12.f874x
            int r7 = r12.f869s
            float r7 = (float) r7
            float r1 = r1 * r7
            int r1 = java.lang.Math.round(r1)
            p.p.d.t r7 = r12.f872v
            int r7 = r7.mo6361d()
            if (r7 != r6) goto L_0x035b
            p.p.d.t r6 = r12.f872v
            int r6 = r6.mo6367g()
            int r1 = java.lang.Math.min(r1, r6)
        L_0x035b:
            int r6 = r12.f869s
            int r6 = r1 / r6
            r12.f874x = r6
            p.p.d.t r6 = r12.f872v
            int r6 = r6.mo6361d()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            r12.f862J = r1
            int r1 = r12.f874x
            if (r1 != r5) goto L_0x0372
            goto L_0x03bb
        L_0x0372:
            r1 = r3
        L_0x0373:
            if (r1 >= r2) goto L_0x03bb
            android.view.View r6 = r12.mo1219c(r1)
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0142c) r7
            boolean r8 = r7.f886f
            if (r8 == 0) goto L_0x0384
            goto L_0x03b8
        L_0x0384:
            boolean r8 = r12.mo1312w()
            if (r8 == 0) goto L_0x03a4
            int r8 = r12.f873w
            if (r8 != r4) goto L_0x03a4
            int r8 = r12.f869s
            int r9 = r8 + -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r7 = r7.f885e
            int r7 = r7.f907e
            int r9 = r9 - r7
            int r9 = -r9
            int r10 = r12.f874x
            int r9 = r9 * r10
            int r8 = r8 - r4
            int r8 = r8 - r7
            int r7 = -r8
            int r7 = r7 * r5
            int r9 = r9 - r7
            r6.offsetLeftAndRight(r9)
            goto L_0x03b8
        L_0x03a4:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r7 = r7.f885e
            int r7 = r7.f907e
            int r8 = r12.f874x
            int r8 = r8 * r7
            int r7 = r7 * r5
            int r9 = r12.f873w
            int r8 = r8 - r7
            if (r9 != r4) goto L_0x03b5
            r6.offsetLeftAndRight(r8)
            goto L_0x03b8
        L_0x03b5:
            r6.offsetTopAndBottom(r8)
        L_0x03b8:
            int r1 = r1 + 1
            goto L_0x0373
        L_0x03bb:
            int r1 = r12.mo1222d()
            if (r1 <= 0) goto L_0x03d2
            boolean r1 = r12.f853A
            if (r1 == 0) goto L_0x03cc
            r12.mo1288a(r13, r14, r4)
            r12.mo1294b(r13, r14, r3)
            goto L_0x03d2
        L_0x03cc:
            r12.mo1294b(r13, r14, r4)
            r12.mo1288a(r13, r14, r3)
        L_0x03d2:
            if (r15 == 0) goto L_0x0401
            boolean r15 = r14.f738g
            if (r15 != 0) goto L_0x0401
            int r15 = r12.f858F
            if (r15 == 0) goto L_0x03ee
            int r15 = r12.mo1222d()
            if (r15 <= 0) goto L_0x03ee
            boolean r15 = r12.f865M
            if (r15 != 0) goto L_0x03ec
            android.view.View r15 = r12.mo1311v()
            if (r15 == 0) goto L_0x03ee
        L_0x03ec:
            r15 = r4
            goto L_0x03ef
        L_0x03ee:
            r15 = r3
        L_0x03ef:
            if (r15 == 0) goto L_0x0401
            java.lang.Runnable r15 = r12.f868P
            androidx.recyclerview.widget.RecyclerView r1 = r12.f795b
            if (r1 == 0) goto L_0x03fa
            r1.removeCallbacks(r15)
        L_0x03fa:
            boolean r15 = r12.mo1308s()
            if (r15 == 0) goto L_0x0401
            goto L_0x0402
        L_0x0401:
            r4 = r3
        L_0x0402:
            boolean r15 = r14.f738g
            if (r15 == 0) goto L_0x040b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r15 = r12.f864L
            r15.mo1316b()
        L_0x040b:
            boolean r15 = r0.f880c
            r12.f859G = r15
            boolean r15 = r12.mo1312w()
            r12.f860H = r15
            if (r4 == 0) goto L_0x041f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r15 = r12.f864L
            r15.mo1316b()
            r12.mo1298c(r13, r14, r3)
        L_0x041f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1298c(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    /* renamed from: d */
    public final int mo1299d(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? MeasureSpec.makeMeasureSpec(Math.max(0, (MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* renamed from: d */
    public int mo908d(C0099a0 a0Var) {
        return mo1300h(a0Var);
    }

    /* renamed from: d */
    public void mo1224d(int i) {
        RecyclerView recyclerView = this.f795b;
        if (recyclerView != null) {
            recyclerView.offsetChildrenHorizontal(i);
        }
        for (int i2 = 0; i2 < this.f869s; i2++) {
            C0148f fVar = this.f870t[i2];
            int i3 = fVar.f904b;
            if (i3 != Integer.MIN_VALUE) {
                fVar.f904b = i3 + i;
            }
            int i4 = fVar.f905c;
            if (i4 != Integer.MIN_VALUE) {
                fVar.f905c = i4 + i;
            }
        }
    }

    /* renamed from: e */
    public int mo874e(C0099a0 a0Var) {
        return mo1302i(a0Var);
    }

    /* renamed from: e */
    public void mo1227e(int i) {
        RecyclerView recyclerView = this.f795b;
        if (recyclerView != null) {
            recyclerView.offsetChildrenVertical(i);
        }
        for (int i2 = 0; i2 < this.f869s; i2++) {
            C0148f fVar = this.f870t[i2];
            int i3 = fVar.f904b;
            if (i3 != Integer.MIN_VALUE) {
                fVar.f904b = i3 + i;
            }
            int i4 = fVar.f905c;
            if (i4 != Integer.MIN_VALUE) {
                fVar.f905c = i4 + i;
            }
        }
    }

    /* renamed from: f */
    public int mo876f(C0099a0 a0Var) {
        return mo1304j(a0Var);
    }

    /* renamed from: f */
    public void mo1230f(int i) {
        if (i == 0) {
            mo1308s();
        }
    }

    /* renamed from: g */
    public void mo877g(C0099a0 a0Var) {
        this.f855C = -1;
        this.f856D = RecyclerView.UNDEFINED_DURATION;
        this.f861I = null;
        this.f864L.mo1316b();
    }

    /* renamed from: h */
    public final int mo1300h(C0099a0 a0Var) {
        if (mo1222d() == 0) {
            return 0;
        }
        return C1061o.m2437a(a0Var, this.f871u, mo1291b(!this.f866N), mo1284a(!this.f866N), (C0120o) this, this.f866N);
    }

    /* renamed from: h */
    public void mo914h(int i) {
        C0146e eVar = this.f861I;
        if (!(eVar == null || eVar.f893e == i)) {
            eVar.f896h = null;
            eVar.f895g = 0;
            eVar.f893e = -1;
            eVar.f894f = -1;
        }
        this.f855C = i;
        this.f856D = RecyclerView.UNDEFINED_DURATION;
        mo1242p();
    }

    /* renamed from: i */
    public final int mo1301i(int i) {
        int i2 = -1;
        if (mo1222d() == 0) {
            if (this.f853A) {
                i2 = 1;
            }
            return i2;
        }
        if ((i < mo1309t()) == this.f853A) {
            i2 = 1;
        }
        return i2;
    }

    /* renamed from: i */
    public final int mo1302i(C0099a0 a0Var) {
        if (mo1222d() == 0) {
            return 0;
        }
        return C1061o.m2438a(a0Var, this.f871u, mo1291b(!this.f866N), mo1284a(!this.f866N), (C0120o) this, this.f866N, this.f853A);
    }

    /* renamed from: j */
    public final int mo1303j(int i) {
        int a = this.f870t[0].mo1335a(i);
        for (int i2 = 1; i2 < this.f869s; i2++) {
            int a2 = this.f870t[i2].mo1335a(i);
            if (a2 > a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: j */
    public final int mo1304j(C0099a0 a0Var) {
        if (mo1222d() == 0) {
            return 0;
        }
        return C1061o.m2523b(a0Var, this.f871u, mo1291b(!this.f866N), mo1284a(!this.f866N), this, this.f866N);
    }

    /* renamed from: k */
    public final int mo1305k(int i) {
        int b = this.f870t[0].mo1340b(i);
        for (int i2 = 1; i2 < this.f869s; i2++) {
            int b2 = this.f870t[i2].mo1340b(i);
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: l */
    public final boolean mo1306l(int i) {
        boolean z = true;
        if (this.f873w == 0) {
            if ((i == -1) == this.f853A) {
                z = false;
            }
            return z;
        }
        if (((i == -1) == this.f853A) != mo1312w()) {
            z = false;
        }
        return z;
    }

    /* renamed from: m */
    public final void mo1307m(int i) {
        C1599n nVar = this.f875y;
        nVar.f4713e = i;
        int i2 = 1;
        if (this.f853A != (i == -1)) {
            i2 = -1;
        }
        nVar.f4712d = i2;
    }

    /* renamed from: n */
    public boolean mo919n() {
        return this.f858F != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable mo920o() {
        /*
            r5 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = r5.f861I
            if (r0 == 0) goto L_0x000c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r5.f861I
            r0.<init>(r1)
            return r0
        L_0x000c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$e
            r0.<init>()
            boolean r1 = r5.f876z
            r0.f900l = r1
            boolean r1 = r5.f859G
            r0.f901m = r1
            boolean r1 = r5.f860H
            r0.f902n = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r5.f857E
            r2 = 0
            if (r1 == 0) goto L_0x0030
            int[] r3 = r1.f887a
            if (r3 == 0) goto L_0x0030
            r0.f898j = r3
            int r3 = r3.length
            r0.f897i = r3
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r1 = r1.f888b
            r0.f899k = r1
            goto L_0x0032
        L_0x0030:
            r0.f897i = r2
        L_0x0032:
            int r1 = r5.mo1222d()
            r3 = -1
            if (r1 <= 0) goto L_0x009a
            boolean r1 = r5.f859G
            if (r1 == 0) goto L_0x0042
            int r1 = r5.mo1310u()
            goto L_0x0046
        L_0x0042:
            int r1 = r5.mo1309t()
        L_0x0046:
            r0.f893e = r1
            boolean r1 = r5.f853A
            r4 = 1
            if (r1 == 0) goto L_0x0052
            android.view.View r1 = r5.mo1284a(r4)
            goto L_0x0056
        L_0x0052:
            android.view.View r1 = r5.mo1291b(r4)
        L_0x0056:
            if (r1 != 0) goto L_0x0059
            goto L_0x005d
        L_0x0059:
            int r3 = r5.mo1237i(r1)
        L_0x005d:
            r0.f894f = r3
            int r1 = r5.f869s
            r0.f895g = r1
            int[] r1 = new int[r1]
            r0.f896h = r1
        L_0x0067:
            int r1 = r5.f869s
            if (r2 >= r1) goto L_0x00a0
            boolean r1 = r5.f859G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x0082
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r5.f870t
            r1 = r1[r2]
            int r1 = r1.mo1335a(r3)
            if (r1 == r3) goto L_0x0093
            p.p.d.t r3 = r5.f871u
            int r3 = r3.mo6357b()
            goto L_0x0092
        L_0x0082:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r5.f870t
            r1 = r1[r2]
            int r1 = r1.mo1340b(r3)
            if (r1 == r3) goto L_0x0093
            p.p.d.t r3 = r5.f871u
            int r3 = r3.mo6365f()
        L_0x0092:
            int r1 = r1 - r3
        L_0x0093:
            int[] r3 = r0.f896h
            r3[r2] = r1
            int r2 = r2 + 1
            goto L_0x0067
        L_0x009a:
            r0.f893e = r3
            r0.f894f = r3
            r0.f895g = r2
        L_0x00a0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo920o():android.os.Parcelable");
    }

    /* renamed from: r */
    public boolean mo880r() {
        return this.f861I == null;
    }

    /* renamed from: s */
    public boolean mo1308s() {
        int i;
        int i2;
        if (mo1222d() == 0 || this.f858F == 0 || !this.f802i) {
            return false;
        }
        if (this.f853A) {
            i2 = mo1310u();
            i = mo1309t();
        } else {
            i2 = mo1309t();
            i = mo1310u();
        }
        if (i2 == 0 && mo1311v() != null) {
            this.f857E.mo1318a();
        } else if (!this.f865M) {
            return false;
        } else {
            int i3 = this.f853A ? -1 : 1;
            int i4 = i + 1;
            C0144a a = this.f857E.mo1317a(i2, i4, i3, true);
            if (a == null) {
                this.f865M = false;
                this.f857E.mo1322b(i4);
                return false;
            }
            C0144a a2 = this.f857E.mo1317a(i2, a.f889e, i3 * -1, true);
            if (a2 == null) {
                this.f857E.mo1322b(a.f889e);
            } else {
                this.f857E.mo1322b(a2.f889e + 1);
            }
        }
        this.f801h = true;
        mo1242p();
        return true;
    }

    /* renamed from: t */
    public int mo1309t() {
        if (mo1222d() == 0) {
            return 0;
        }
        return mo1237i(mo1219c(0));
    }

    /* renamed from: u */
    public int mo1310u() {
        int d = mo1222d();
        if (d == 0) {
            return 0;
        }
        return mo1237i(mo1219c(d - 1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b9, code lost:
        if (r11 == r12) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cb, code lost:
        if (r11 == r12) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cf, code lost:
        r11 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0091 A[SYNTHETIC] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo1311v() {
        /*
            r13 = this;
            int r0 = r13.mo1222d()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r13.f869s
            r2.<init>(r3)
            int r3 = r13.f869s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r13.f873w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r13.mo1312w()
            if (r3 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r5
        L_0x0021:
            boolean r6 = r13.f853A
            if (r6 == 0) goto L_0x0027
            r6 = r5
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L_0x002b:
            if (r0 >= r6) goto L_0x002f
            r7 = r1
            goto L_0x0030
        L_0x002f:
            r7 = r5
        L_0x0030:
            if (r0 == r6) goto L_0x00f1
            android.view.View r8 = r13.mo1219c(r0)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0142c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r10 = r9.f885e
            int r10 = r10.f907e
            boolean r10 = r2.get(r10)
            if (r10 == 0) goto L_0x0099
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r10 = r9.f885e
            boolean r11 = r13.f853A
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == 0) goto L_0x006c
            int r11 = r10.f905c
            if (r11 == r12) goto L_0x0053
            goto L_0x0058
        L_0x0053:
            r10.mo1338a()
            int r11 = r10.f905c
        L_0x0058:
            p.p.d.t r12 = r13.f871u
            int r12 = r12.mo6357b()
            if (r11 >= r12) goto L_0x008e
            java.util.ArrayList<android.view.View> r11 = r10.f903a
            int r12 = r11.size()
            int r12 = r12 + r5
            java.lang.Object r11 = r11.get(r12)
            goto L_0x0084
        L_0x006c:
            int r11 = r10.f904b
            if (r11 == r12) goto L_0x0071
            goto L_0x0076
        L_0x0071:
            r10.mo1342b()
            int r11 = r10.f904b
        L_0x0076:
            p.p.d.t r12 = r13.f871u
            int r12 = r12.mo6365f()
            if (r11 <= r12) goto L_0x008e
            java.util.ArrayList<android.view.View> r11 = r10.f903a
            java.lang.Object r11 = r11.get(r4)
        L_0x0084:
            android.view.View r11 = (android.view.View) r11
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r10 = r10.mo1341b(r11)
            boolean r10 = r10.f886f
            r10 = r10 ^ r1
            goto L_0x008f
        L_0x008e:
            r10 = r4
        L_0x008f:
            if (r10 == 0) goto L_0x0092
            return r8
        L_0x0092:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r10 = r9.f885e
            int r10 = r10.f907e
            r2.clear(r10)
        L_0x0099:
            boolean r10 = r9.f886f
            if (r10 == 0) goto L_0x009e
            goto L_0x00ee
        L_0x009e:
            int r10 = r0 + r7
            if (r10 == r6) goto L_0x00ee
            android.view.View r10 = r13.mo1219c(r10)
            boolean r11 = r13.f853A
            if (r11 == 0) goto L_0x00bc
            p.p.d.t r11 = r13.f871u
            int r11 = r11.mo6355a(r8)
            p.p.d.t r12 = r13.f871u
            int r12 = r12.mo6355a(r10)
            if (r11 >= r12) goto L_0x00b9
            return r8
        L_0x00b9:
            if (r11 != r12) goto L_0x00cf
            goto L_0x00cd
        L_0x00bc:
            p.p.d.t r11 = r13.f871u
            int r11 = r11.mo6362d(r8)
            p.p.d.t r12 = r13.f871u
            int r12 = r12.mo6362d(r10)
            if (r11 <= r12) goto L_0x00cb
            return r8
        L_0x00cb:
            if (r11 != r12) goto L_0x00cf
        L_0x00cd:
            r11 = r1
            goto L_0x00d0
        L_0x00cf:
            r11 = r4
        L_0x00d0:
            if (r11 == 0) goto L_0x00ee
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r10 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0142c) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f885e
            int r9 = r9.f907e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r10 = r10.f885e
            int r10 = r10.f907e
            int r9 = r9 - r10
            if (r9 >= 0) goto L_0x00e5
            r9 = r1
            goto L_0x00e6
        L_0x00e5:
            r9 = r4
        L_0x00e6:
            if (r3 >= 0) goto L_0x00ea
            r10 = r1
            goto L_0x00eb
        L_0x00ea:
            r10 = r4
        L_0x00eb:
            if (r9 == r10) goto L_0x00ee
            return r8
        L_0x00ee:
            int r0 = r0 + r7
            goto L_0x0030
        L_0x00f1:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1311v():android.view.View");
    }

    /* renamed from: w */
    public boolean mo1312w() {
        return mo1231g() == 1;
    }

    /* renamed from: x */
    public final void mo1313x() {
        this.f853A = (this.f873w == 1 || !mo1312w()) ? this.f876z : !this.f876z;
    }

    /* renamed from: a */
    public void mo890a(int i, int i2, C0099a0 a0Var, C0123c cVar) {
        int i3;
        int i4;
        if (this.f873w != 0) {
            i = i2;
        }
        if (mo1222d() != 0 && i != 0) {
            mo1285a(i, a0Var);
            int[] iArr = this.f867O;
            if (iArr == null || iArr.length < this.f869s) {
                this.f867O = new int[this.f869s];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f869s; i6++) {
                C1599n nVar = this.f875y;
                if (nVar.f4712d == -1) {
                    i4 = nVar.f4714f;
                    i3 = this.f870t[i6].mo1340b(i4);
                } else {
                    i4 = this.f870t[i6].mo1335a(nVar.f4715g);
                    i3 = this.f875y.f4715g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f867O[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f867O, 0, i5);
            int i8 = 0;
            while (i8 < i5) {
                int i9 = this.f875y.f4711c;
                if (i9 >= 0 && i9 < a0Var.mo1135a()) {
                    ((C1597b) cVar).mo6339a(this.f875y.f4711c, this.f867O[i8]);
                    C1599n nVar2 = this.f875y;
                    nVar2.f4711c += nVar2.f4712d;
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r9v2, types: [int] */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r16v0 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r0v31 */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r16v1 */
    /* JADX WARNING: type inference failed for: r16v2 */
    /* JADX WARNING: type inference failed for: r16v6, types: [int] */
    /* JADX WARNING: type inference failed for: r1v86 */
    /* JADX WARNING: type inference failed for: r1v88, types: [int] */
    /* JADX WARNING: type inference failed for: r1v89, types: [int] */
    /* JADX WARNING: type inference failed for: r1v90, types: [int] */
    /* JADX WARNING: type inference failed for: r1v91, types: [int] */
    /* JADX WARNING: type inference failed for: r1v93 */
    /* JADX WARNING: type inference failed for: r16v7 */
    /* JADX WARNING: type inference failed for: r16v8 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r1v102 */
    /* JADX WARNING: type inference failed for: r1v103 */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: type inference failed for: r10v22 */
    /* JADX WARNING: type inference failed for: r0v79 */
    /* JADX WARNING: type inference failed for: r2v55 */
    /* JADX WARNING: type inference failed for: r2v56 */
    /* JADX WARNING: type inference failed for: r1v106 */
    /* JADX WARNING: type inference failed for: r1v107 */
    /* JADX WARNING: type inference failed for: r1v108 */
    /* JADX WARNING: type inference failed for: r1v109 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v1, types: [boolean]
      assigns: []
      uses: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], boolean, ?[int, short, byte, char]]
      mth insns count: 414
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01cf  */
    /* JADX WARNING: Unknown variable types count: 19 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo1283a(androidx.recyclerview.widget.RecyclerView.C0132v r19, p124p.p180p.p181d.C1599n r20, androidx.recyclerview.widget.RecyclerView.C0099a0 r21) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r20
            java.util.BitSet r0 = r6.f854B
            int r1 = r6.f869s
            r9 = 0
            r10 = 1
            r0.set(r9, r1, r10)
            p.p.d.n r0 = r6.f875y
            boolean r0 = r0.f4717i
            if (r0 == 0) goto L_0x0020
            int r0 = r8.f4713e
            if (r0 != r10) goto L_0x001d
            r13 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0030
        L_0x001d:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0030
        L_0x0020:
            int r0 = r8.f4713e
            if (r0 != r10) goto L_0x002a
            int r0 = r8.f4715g
            int r1 = r8.f4710b
            int r0 = r0 + r1
            goto L_0x002f
        L_0x002a:
            int r0 = r8.f4714f
            int r1 = r8.f4710b
            int r0 = r0 - r1
        L_0x002f:
            r13 = r0
        L_0x0030:
            int r0 = r8.f4713e
            r6.mo1296c(r0, r13)
            boolean r0 = r6.f853A
            if (r0 == 0) goto L_0x0040
            p.p.d.t r0 = r6.f871u
            int r0 = r0.mo6357b()
            goto L_0x0046
        L_0x0040:
            p.p.d.t r0 = r6.f871u
            int r0 = r0.mo6365f()
        L_0x0046:
            r14 = r0
            r0 = r9
        L_0x0048:
            int r1 = r8.f4711c
            if (r1 < 0) goto L_0x0054
            int r2 = r21.mo1135a()
            if (r1 >= r2) goto L_0x0054
            r1 = r10
            goto L_0x0055
        L_0x0054:
            r1 = r9
        L_0x0055:
            r2 = -1
            if (r1 == 0) goto L_0x0367
            p.p.d.n r1 = r6.f875y
            boolean r1 = r1.f4717i
            if (r1 != 0) goto L_0x0066
            java.util.BitSet r1 = r6.f854B
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0367
        L_0x0066:
            int r0 = r8.f4711c
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            androidx.recyclerview.widget.RecyclerView$d0 r0 = r7.mo1261a(r0, r9, r3)
            android.view.View r15 = r0.f757a
            int r0 = r8.f4711c
            int r1 = r8.f4712d
            int r0 = r0 + r1
            r8.f4711c = r0
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            r5 = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r5 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0142c) r5
            int r0 = r5.mo1248a()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r6.f857E
            int[] r1 = r1.f887a
            if (r1 == 0) goto L_0x0092
            int r3 = r1.length
            if (r0 < r3) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            r1 = r1[r0]
            goto L_0x0093
        L_0x0092:
            r1 = r2
        L_0x0093:
            if (r1 != r2) goto L_0x0097
            r3 = r10
            goto L_0x0098
        L_0x0097:
            r3 = r9
        L_0x0098:
            if (r3 == 0) goto L_0x0103
            boolean r1 = r5.f886f
            if (r1 == 0) goto L_0x00a3
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r6.f870t
            r1 = r1[r9]
            goto L_0x00f7
        L_0x00a3:
            int r1 = r8.f4713e
            boolean r1 = r6.mo1306l(r1)
            if (r1 == 0) goto L_0x00b2
            int r1 = r6.f869s
            int r1 = r1 - r10
            r4 = r2
            r16 = r4
            goto L_0x00b8
        L_0x00b2:
            int r1 = r6.f869s
            r4 = r1
            r1 = r9
            r16 = r10
        L_0x00b8:
            int r11 = r8.f4713e
            r17 = 0
            if (r11 != r10) goto L_0x00db
            p.p.d.t r11 = r6.f871u
            int r11 = r11.mo6365f()
            r12 = 2147483647(0x7fffffff, float:NaN)
        L_0x00c7:
            if (r1 == r4) goto L_0x00f5
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r6.f870t
            r2 = r2[r1]
            int r9 = r2.mo1335a(r11)
            if (r9 >= r12) goto L_0x00d6
            r17 = r2
            r12 = r9
        L_0x00d6:
            int r1 = r1 + r16
            r2 = -1
            r9 = 0
            goto L_0x00c7
        L_0x00db:
            p.p.d.t r2 = r6.f871u
            int r2 = r2.mo6357b()
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00e3:
            if (r1 == r4) goto L_0x00f5
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r11 = r6.f870t
            r11 = r11[r1]
            int r12 = r11.mo1340b(r2)
            if (r12 <= r9) goto L_0x00f2
            r17 = r11
            r9 = r12
        L_0x00f2:
            int r1 = r1 + r16
            goto L_0x00e3
        L_0x00f5:
            r1 = r17
        L_0x00f7:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r2 = r6.f857E
            r2.mo1319a(r0)
            int[] r2 = r2.f887a
            int r4 = r1.f907e
            r2[r0] = r4
            goto L_0x0107
        L_0x0103:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r6.f870t
            r1 = r2[r1]
        L_0x0107:
            r9 = r1
            r5.f885e = r9
            int r1 = r8.f4713e
            if (r1 != r10) goto L_0x0114
            r1 = -1
            r2 = 0
            r6.mo1202a(r15, r1, r2)
            goto L_0x0118
        L_0x0114:
            r2 = 0
            r6.mo1202a(r15, r2, r2)
        L_0x0118:
            boolean r1 = r5.f886f
            if (r1 == 0) goto L_0x013d
            int r1 = r6.f873w
            if (r1 != r10) goto L_0x0123
            int r1 = r6.f862J
            goto L_0x014c
        L_0x0123:
            int r1 = r6.f810q
            int r2 = r6.f808o
            int r4 = r18.mo1239k()
            int r11 = r18.mo1240l()
            int r11 = r11 + r4
            int r4 = r5.width
            int r1 = androidx.recyclerview.widget.RecyclerView.C0120o.m500a(r1, r2, r11, r4, r10)
            int r2 = r6.f862J
            r4 = 0
            r6.mo1286a(r15, r1, r2, r4)
            goto L_0x0182
        L_0x013d:
            r4 = 0
            int r1 = r6.f873w
            if (r1 != r10) goto L_0x0161
            int r1 = r6.f874x
            int r2 = r6.f808o
            int r11 = r5.width
            int r1 = androidx.recyclerview.widget.RecyclerView.C0120o.m500a(r1, r2, r4, r11, r4)
        L_0x014c:
            int r2 = r6.f811r
            int r4 = r6.f809p
            int r11 = r18.mo1241m()
            int r12 = r18.mo1238j()
            int r12 = r12 + r11
            int r11 = r5.height
            int r2 = androidx.recyclerview.widget.RecyclerView.C0120o.m500a(r2, r4, r12, r11, r10)
            r12 = 0
            goto L_0x017f
        L_0x0161:
            int r1 = r6.f810q
            int r2 = r6.f808o
            int r4 = r18.mo1239k()
            int r11 = r18.mo1240l()
            int r11 = r11 + r4
            int r4 = r5.width
            int r1 = androidx.recyclerview.widget.RecyclerView.C0120o.m500a(r1, r2, r11, r4, r10)
            int r2 = r6.f874x
            int r4 = r6.f809p
            int r11 = r5.height
            r12 = 0
            int r2 = androidx.recyclerview.widget.RecyclerView.C0120o.m500a(r2, r4, r12, r11, r12)
        L_0x017f:
            r6.mo1286a(r15, r1, r2, r12)
        L_0x0182:
            int r1 = r8.f4713e
            if (r1 != r10) goto L_0x01cf
            boolean r1 = r5.f886f
            if (r1 == 0) goto L_0x018f
            int r1 = r6.mo1303j(r14)
            goto L_0x0193
        L_0x018f:
            int r1 = r9.mo1335a(r14)
        L_0x0193:
            p.p.d.t r2 = r6.f871u
            int r2 = r2.mo6358b(r15)
            int r2 = r2 + r1
            if (r3 == 0) goto L_0x01cc
            boolean r4 = r5.f886f
            if (r4 == 0) goto L_0x01cc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r4 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a
            r4.<init>()
            int r11 = r6.f869s
            int[] r11 = new int[r11]
            r4.f891g = r11
            r11 = 0
        L_0x01ac:
            int r12 = r6.f869s
            if (r11 >= r12) goto L_0x01c2
            int[] r12 = r4.f891g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r10 = r6.f870t
            r10 = r10[r11]
            int r10 = r10.mo1335a(r1)
            int r10 = r1 - r10
            r12[r11] = r10
            int r11 = r11 + 1
            r10 = 1
            goto L_0x01ac
        L_0x01c2:
            r10 = -1
            r4.f890f = r10
            r4.f889e = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r10 = r6.f857E
            r10.mo1321a(r4)
        L_0x01cc:
            r4 = r1
            r10 = r2
            goto L_0x0216
        L_0x01cf:
            boolean r1 = r5.f886f
            if (r1 == 0) goto L_0x01d8
            int r1 = r6.mo1305k(r14)
            goto L_0x01dc
        L_0x01d8:
            int r1 = r9.mo1340b(r14)
        L_0x01dc:
            p.p.d.t r2 = r6.f871u
            int r2 = r2.mo6358b(r15)
            int r2 = r1 - r2
            if (r3 == 0) goto L_0x0214
            boolean r4 = r5.f886f
            if (r4 == 0) goto L_0x0214
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r4 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a
            r4.<init>()
            int r10 = r6.f869s
            int[] r10 = new int[r10]
            r4.f891g = r10
            r10 = 0
        L_0x01f6:
            int r11 = r6.f869s
            if (r10 >= r11) goto L_0x020a
            int[] r11 = r4.f891g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r6.f870t
            r12 = r12[r10]
            int r12 = r12.mo1340b(r1)
            int r12 = r12 - r1
            r11[r10] = r12
            int r10 = r10 + 1
            goto L_0x01f6
        L_0x020a:
            r10 = 1
            r4.f890f = r10
            r4.f889e = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r10 = r6.f857E
            r10.mo1321a(r4)
        L_0x0214:
            r10 = r1
            r4 = r2
        L_0x0216:
            boolean r1 = r5.f886f
            if (r1 == 0) goto L_0x0282
            int r1 = r8.f4712d
            r2 = -1
            if (r1 != r2) goto L_0x0282
            r1 = 1
            if (r3 == 0) goto L_0x0225
            r6.f865M = r1
            goto L_0x0283
        L_0x0225:
            int r2 = r8.f4713e
            if (r2 != r1) goto L_0x0250
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r6.f870t
            r2 = 0
            r1 = r1[r2]
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1.mo1335a(r11)
            r2 = 1
        L_0x0235:
            int r3 = r6.f869s
            if (r2 >= r3) goto L_0x024a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r3 = r6.f870t
            r3 = r3[r2]
            int r3 = r3.mo1335a(r11)
            if (r3 == r1) goto L_0x0247
            r1 = 1
            r16 = 0
            goto L_0x024d
        L_0x0247:
            int r2 = r2 + 1
            goto L_0x0235
        L_0x024a:
            r1 = 1
            r16 = 1
        L_0x024d:
            r2 = r16 ^ 1
            goto L_0x0273
        L_0x0250:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r6.f870t
            r2 = 0
            r1 = r1[r2]
            int r1 = r1.mo1340b(r11)
            r2 = 1
        L_0x025c:
            int r3 = r6.f869s
            if (r2 >= r3) goto L_0x0270
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r3 = r6.f870t
            r3 = r3[r2]
            int r3 = r3.mo1340b(r11)
            if (r3 == r1) goto L_0x026d
            r1 = 1
            r2 = 0
            goto L_0x0272
        L_0x026d:
            int r2 = r2 + 1
            goto L_0x025c
        L_0x0270:
            r1 = 1
            r2 = 1
        L_0x0272:
            r2 = r2 ^ r1
        L_0x0273:
            if (r2 == 0) goto L_0x0285
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r2 = r6.f857E
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r2.mo1324c(r0)
            if (r0 == 0) goto L_0x027f
            r0.f892h = r1
        L_0x027f:
            r6.f865M = r1
            goto L_0x0285
        L_0x0282:
            r1 = 1
        L_0x0283:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0285:
            int r0 = r8.f4713e
            if (r0 != r1) goto L_0x02a1
            boolean r0 = r5.f886f
            if (r0 == 0) goto L_0x029b
            int r0 = r6.f869s
        L_0x028f:
            r1 = -1
            int r0 = r0 + r1
            if (r0 < 0) goto L_0x02b8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r6.f870t
            r1 = r1[r0]
            r1.mo1339a(r15)
            goto L_0x028f
        L_0x029b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r0 = r5.f885e
            r0.mo1339a(r15)
            goto L_0x02b8
        L_0x02a1:
            boolean r0 = r5.f886f
            if (r0 == 0) goto L_0x02b3
            int r0 = r6.f869s
        L_0x02a7:
            r1 = -1
            int r0 = r0 + r1
            if (r0 < 0) goto L_0x02b8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r6.f870t
            r1 = r1[r0]
            r1.mo1344c(r15)
            goto L_0x02a7
        L_0x02b3:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r0 = r5.f885e
            r0.mo1344c(r15)
        L_0x02b8:
            boolean r0 = r18.mo1312w()
            if (r0 == 0) goto L_0x02e9
            int r0 = r6.f873w
            r1 = 1
            if (r0 != r1) goto L_0x02e9
            boolean r0 = r5.f886f
            if (r0 == 0) goto L_0x02ce
            p.p.d.t r0 = r6.f872v
            int r0 = r0.mo6357b()
            goto L_0x02de
        L_0x02ce:
            p.p.d.t r0 = r6.f872v
            int r0 = r0.mo6357b()
            int r2 = r6.f869s
            int r2 = r2 - r1
            int r1 = r9.f907e
            int r2 = r2 - r1
            int r1 = r6.f874x
            int r2 = r2 * r1
            int r0 = r0 - r2
        L_0x02de:
            p.p.d.t r1 = r6.f872v
            int r1 = r1.mo6358b(r15)
            int r1 = r0 - r1
            r12 = r0
            r3 = r1
            goto L_0x0309
        L_0x02e9:
            boolean r0 = r5.f886f
            if (r0 == 0) goto L_0x02f4
            p.p.d.t r0 = r6.f872v
            int r0 = r0.mo6365f()
            goto L_0x0300
        L_0x02f4:
            int r0 = r9.f907e
            int r1 = r6.f874x
            int r0 = r0 * r1
            p.p.d.t r1 = r6.f872v
            int r1 = r1.mo6365f()
            int r0 = r0 + r1
        L_0x0300:
            p.p.d.t r1 = r6.f872v
            int r1 = r1.mo6358b(r15)
            int r1 = r1 + r0
            r3 = r0
            r12 = r1
        L_0x0309:
            int r0 = r6.f873w
            r2 = 1
            if (r0 != r2) goto L_0x031d
            r0 = r18
            r1 = r15
            r16 = r2
            r2 = r3
            r3 = r4
            r4 = r12
            r12 = r5
            r5 = r10
            r0.mo1201a(r1, r2, r3, r4, r5)
            r10 = r12
            goto L_0x0329
        L_0x031d:
            r16 = r2
            r0 = r18
            r1 = r15
            r2 = r4
            r4 = r10
            r10 = r5
            r5 = r12
            r0.mo1201a(r1, r2, r3, r4, r5)
        L_0x0329:
            boolean r0 = r10.f886f
            if (r0 == 0) goto L_0x0335
            p.p.d.n r0 = r6.f875y
            int r0 = r0.f4713e
            r6.mo1296c(r0, r13)
            goto L_0x033c
        L_0x0335:
            p.p.d.n r0 = r6.f875y
            int r0 = r0.f4713e
            r6.mo1290a(r9, r0, r13)
        L_0x033c:
            p.p.d.n r0 = r6.f875y
            r6.mo1289a(r7, r0)
            p.p.d.n r0 = r6.f875y
            boolean r0 = r0.f4716h
            if (r0 == 0) goto L_0x0360
            boolean r0 = r15.hasFocusable()
            if (r0 == 0) goto L_0x0360
            boolean r0 = r10.f886f
            if (r0 == 0) goto L_0x0357
            java.util.BitSet r0 = r6.f854B
            r0.clear()
            goto L_0x0360
        L_0x0357:
            java.util.BitSet r0 = r6.f854B
            int r1 = r9.f907e
            r2 = 0
            r0.set(r1, r2)
            goto L_0x0361
        L_0x0360:
            r2 = 0
        L_0x0361:
            r9 = r2
            r0 = r16
            r10 = r0
            goto L_0x0048
        L_0x0367:
            r2 = r9
            if (r0 != 0) goto L_0x036f
            p.p.d.n r0 = r6.f875y
            r6.mo1289a(r7, r0)
        L_0x036f:
            p.p.d.n r0 = r6.f875y
            int r0 = r0.f4713e
            r1 = -1
            if (r0 != r1) goto L_0x0388
            p.p.d.t r0 = r6.f871u
            int r0 = r0.mo6365f()
            int r0 = r6.mo1305k(r0)
            p.p.d.t r1 = r6.f871u
            int r1 = r1.mo6365f()
            int r1 = r1 - r0
            goto L_0x039a
        L_0x0388:
            p.p.d.t r0 = r6.f871u
            int r0 = r0.mo6357b()
            int r0 = r6.mo1303j(r0)
            p.p.d.t r1 = r6.f871u
            int r1 = r1.mo6357b()
            int r1 = r0 - r1
        L_0x039a:
            if (r1 <= 0) goto L_0x03a3
            int r0 = r8.f4710b
            int r9 = java.lang.Math.min(r0, r1)
            goto L_0x03a4
        L_0x03a3:
            r9 = r2
        L_0x03a4:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1283a(androidx.recyclerview.widget.RecyclerView$v, p.p.d.n, androidx.recyclerview.widget.RecyclerView$a0):int");
    }

    /* renamed from: a */
    public final void mo1286a(View view, int i, int i2, boolean z) {
        Rect rect = this.f863K;
        RecyclerView recyclerView = this.f795b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.getItemDecorInsetsForChild(view));
        }
        C0142c cVar = (C0142c) view.getLayoutParams();
        int i3 = cVar.leftMargin;
        Rect rect2 = this.f863K;
        int d = mo1299d(i, i3 + rect2.left, cVar.rightMargin + rect2.right);
        int i4 = cVar.topMargin;
        Rect rect3 = this.f863K;
        int d2 = mo1299d(i2, i4 + rect3.top, cVar.bottomMargin + rect3.bottom);
        if (z ? mo1217b(view, d, d2, cVar) : mo1210a(view, d, d2, (C0125p) cVar)) {
            view.measure(d, d2);
        }
    }

    /* renamed from: a */
    public void mo899a(RecyclerView recyclerView, C0132v vVar) {
        Runnable runnable = this.f868P;
        RecyclerView recyclerView2 = this.f795b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.f869s; i++) {
            this.f870t[i].mo1343c();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003b, code lost:
        if (r9.f873w == 1) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0041, code lost:
        if (r9.f873w == 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004d, code lost:
        if (mo1312w() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0059, code lost:
        if (mo1312w() == false) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo848a(android.view.View r10, int r11, androidx.recyclerview.widget.RecyclerView.C0132v r12, androidx.recyclerview.widget.RecyclerView.C0099a0 r13) {
        /*
            r9 = this;
            int r0 = r9.mo1222d()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r10 = r9.mo1213b(r10)
            if (r10 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r9.mo1313x()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            if (r11 == r3) goto L_0x0050
            r4 = 2
            if (r11 == r4) goto L_0x0044
            r4 = 17
            if (r11 == r4) goto L_0x003f
            r4 = 33
            if (r11 == r4) goto L_0x0039
            r4 = 66
            if (r11 == r4) goto L_0x0034
            r4 = 130(0x82, float:1.82E-43)
            if (r11 == r4) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            int r11 = r9.f873w
            if (r11 != r3) goto L_0x0032
        L_0x0030:
            r11 = r3
            goto L_0x005c
        L_0x0032:
            r11 = r0
            goto L_0x005c
        L_0x0034:
            int r11 = r9.f873w
            if (r11 != 0) goto L_0x0032
            goto L_0x0030
        L_0x0039:
            int r11 = r9.f873w
            if (r11 != r3) goto L_0x0032
        L_0x003d:
            r11 = r2
            goto L_0x005c
        L_0x003f:
            int r11 = r9.f873w
            if (r11 != 0) goto L_0x0032
        L_0x0043:
            goto L_0x003d
        L_0x0044:
            int r11 = r9.f873w
            if (r11 != r3) goto L_0x0049
            goto L_0x0030
        L_0x0049:
            boolean r11 = r9.mo1312w()
            if (r11 == 0) goto L_0x0030
            goto L_0x0054
        L_0x0050:
            int r11 = r9.f873w
            if (r11 != r3) goto L_0x0055
        L_0x0054:
            goto L_0x0043
        L_0x0055:
            boolean r11 = r9.mo1312w()
            if (r11 == 0) goto L_0x003d
            goto L_0x0030
        L_0x005c:
            if (r11 != r0) goto L_0x005f
            return r1
        L_0x005f:
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0142c) r0
            boolean r4 = r0.f886f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r0 = r0.f885e
            if (r11 != r3) goto L_0x0070
            int r5 = r9.mo1310u()
            goto L_0x0074
        L_0x0070:
            int r5 = r9.mo1309t()
        L_0x0074:
            r9.mo1292b(r5, r13)
            r9.mo1307m(r11)
            p.p.d.n r6 = r9.f875y
            int r7 = r6.f4712d
            int r7 = r7 + r5
            r6.f4711c = r7
            r7 = 1051372203(0x3eaaaaab, float:0.33333334)
            p.p.d.t r8 = r9.f871u
            int r8 = r8.mo6367g()
            float r8 = (float) r8
            float r8 = r8 * r7
            int r7 = (int) r8
            r6.f4710b = r7
            p.p.d.n r6 = r9.f875y
            r6.f4716h = r3
            r7 = 0
            r6.f4709a = r7
            r9.mo1283a(r12, r6, r13)
            boolean r12 = r9.f853A
            r9.f859G = r12
            if (r4 != 0) goto L_0x00a8
            android.view.View r12 = r0.mo1337a(r5, r11)
            if (r12 == 0) goto L_0x00a8
            if (r12 == r10) goto L_0x00a8
            return r12
        L_0x00a8:
            boolean r12 = r9.mo1306l(r11)
            if (r12 == 0) goto L_0x00c3
            int r12 = r9.f869s
            int r12 = r12 - r3
        L_0x00b1:
            if (r12 < 0) goto L_0x00d8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r13 = r9.f870t
            r13 = r13[r12]
            android.view.View r13 = r13.mo1337a(r5, r11)
            if (r13 == 0) goto L_0x00c0
            if (r13 == r10) goto L_0x00c0
            return r13
        L_0x00c0:
            int r12 = r12 + -1
            goto L_0x00b1
        L_0x00c3:
            r12 = r7
        L_0x00c4:
            int r13 = r9.f869s
            if (r12 >= r13) goto L_0x00d8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r13 = r9.f870t
            r13 = r13[r12]
            android.view.View r13 = r13.mo1337a(r5, r11)
            if (r13 == 0) goto L_0x00d5
            if (r13 == r10) goto L_0x00d5
            return r13
        L_0x00d5:
            int r12 = r12 + 1
            goto L_0x00c4
        L_0x00d8:
            boolean r12 = r9.f876z
            r12 = r12 ^ r3
            if (r11 != r2) goto L_0x00df
            r13 = r3
            goto L_0x00e0
        L_0x00df:
            r13 = r7
        L_0x00e0:
            if (r12 != r13) goto L_0x00e4
            r12 = r3
            goto L_0x00e5
        L_0x00e4:
            r12 = r7
        L_0x00e5:
            if (r4 != 0) goto L_0x00fb
            if (r12 == 0) goto L_0x00ee
            int r13 = r0.mo1345d()
            goto L_0x00f2
        L_0x00ee:
            int r13 = r0.mo1346e()
        L_0x00f2:
            android.view.View r13 = r9.mo903b(r13)
            if (r13 == 0) goto L_0x00fb
            if (r13 == r10) goto L_0x00fb
            return r13
        L_0x00fb:
            boolean r11 = r9.mo1306l(r11)
            if (r11 == 0) goto L_0x0128
            int r11 = r9.f869s
            int r11 = r11 - r3
        L_0x0104:
            if (r11 < 0) goto L_0x0149
            int r13 = r0.f907e
            if (r11 != r13) goto L_0x010b
            goto L_0x0125
        L_0x010b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r13 = r9.f870t
            if (r12 == 0) goto L_0x0116
            r13 = r13[r11]
            int r13 = r13.mo1345d()
            goto L_0x011c
        L_0x0116:
            r13 = r13[r11]
            int r13 = r13.mo1346e()
        L_0x011c:
            android.view.View r13 = r9.mo903b(r13)
            if (r13 == 0) goto L_0x0125
            if (r13 == r10) goto L_0x0125
            return r13
        L_0x0125:
            int r11 = r11 + -1
            goto L_0x0104
        L_0x0128:
            int r11 = r9.f869s
            if (r7 >= r11) goto L_0x0149
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r11 = r9.f870t
            if (r12 == 0) goto L_0x0137
            r11 = r11[r7]
            int r11 = r11.mo1345d()
            goto L_0x013d
        L_0x0137:
            r11 = r11[r7]
            int r11 = r11.mo1346e()
        L_0x013d:
            android.view.View r11 = r9.mo903b(r11)
            if (r11 == 0) goto L_0x0146
            if (r11 == r10) goto L_0x0146
            return r11
        L_0x0146:
            int r7 = r7 + 1
            goto L_0x0128
        L_0x0149:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo848a(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    /* renamed from: a */
    public void mo893a(Parcelable parcelable) {
        if (parcelable instanceof C0146e) {
            C0146e eVar = (C0146e) parcelable;
            this.f861I = eVar;
            if (this.f855C != -1) {
                eVar.f896h = null;
                eVar.f895g = 0;
                eVar.f893e = -1;
                eVar.f894f = -1;
                eVar.f896h = null;
                eVar.f895g = 0;
                eVar.f897i = 0;
                eVar.f898j = null;
                eVar.f899k = null;
            }
            mo1242p();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r6.f4713e == -1) goto L_0x0013;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1289a(androidx.recyclerview.widget.RecyclerView.C0132v r5, p124p.p180p.p181d.C1599n r6) {
        /*
            r4 = this;
            boolean r0 = r6.f4709a
            if (r0 == 0) goto L_0x007c
            boolean r0 = r6.f4717i
            if (r0 == 0) goto L_0x000a
            goto L_0x007c
        L_0x000a:
            int r0 = r6.f4710b
            r1 = -1
            if (r0 != 0) goto L_0x001f
            int r0 = r6.f4713e
            if (r0 != r1) goto L_0x0019
        L_0x0013:
            int r6 = r6.f4715g
        L_0x0015:
            r4.mo1287a(r5, r6)
            goto L_0x007c
        L_0x0019:
            int r6 = r6.f4714f
        L_0x001b:
            r4.mo1293b(r5, r6)
            goto L_0x007c
        L_0x001f:
            int r0 = r6.f4713e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0050
            int r0 = r6.f4714f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f870t
            r1 = r1[r2]
            int r1 = r1.mo1340b(r0)
        L_0x002f:
            int r2 = r4.f869s
            if (r3 >= r2) goto L_0x0041
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f870t
            r2 = r2[r3]
            int r2 = r2.mo1340b(r0)
            if (r2 <= r1) goto L_0x003e
            r1 = r2
        L_0x003e:
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0041:
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0045
            goto L_0x0013
        L_0x0045:
            int r1 = r6.f4715g
            int r6 = r6.f4710b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L_0x0015
        L_0x0050:
            int r0 = r6.f4715g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f870t
            r1 = r1[r2]
            int r1 = r1.mo1335a(r0)
        L_0x005a:
            int r2 = r4.f869s
            if (r3 >= r2) goto L_0x006c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f870t
            r2 = r2[r3]
            int r2 = r2.mo1335a(r0)
            if (r2 >= r1) goto L_0x0069
            r1 = r2
        L_0x0069:
            int r3 = r3 + 1
            goto L_0x005a
        L_0x006c:
            int r0 = r6.f4715g
            int r1 = r1 - r0
            if (r1 >= 0) goto L_0x0072
            goto L_0x0019
        L_0x0072:
            int r0 = r6.f4714f
            int r6 = r6.f4710b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L_0x001b
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1289a(androidx.recyclerview.widget.RecyclerView$v, p.p.d.n):void");
    }

    /* renamed from: a */
    public void mo852a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int l = mo1240l() + mo1239k();
        int j = mo1238j() + mo1241m();
        if (this.f873w == 1) {
            i4 = C0120o.m499a(i2, rect.height() + j, mo1234h());
            i3 = C0120o.m499a(i, (this.f874x * this.f869s) + l, mo1236i());
        } else {
            i3 = C0120o.m499a(i, rect.width() + l, mo1236i());
            i4 = C0120o.m499a(i2, (this.f874x * this.f869s) + j, mo1234h());
        }
        this.f795b.setMeasuredDimension(i3, i4);
    }

    /* renamed from: a */
    public void mo898a(RecyclerView recyclerView, C0099a0 a0Var, int i) {
        C1600o oVar = new C1600o(recyclerView.getContext());
        oVar.f838a = i;
        mo1209a((C0137z) oVar);
    }

    /* renamed from: a */
    public final void mo1290a(C0148f fVar, int i, int i2) {
        int i3 = fVar.f906d;
        if (i == -1) {
            int i4 = fVar.f904b;
            if (i4 == Integer.MIN_VALUE) {
                fVar.mo1342b();
                i4 = fVar.f904b;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = fVar.f905c;
            if (i5 == Integer.MIN_VALUE) {
                fVar.mo1338a();
                i5 = fVar.f905c;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.f854B.set(fVar.f907e, false);
    }
}
