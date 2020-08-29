package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0068c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0071f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p124p.p126b.p127k.C1061o;
import p124p.p150h.p162l.C1404o;
import p124p.p150h.p162l.p163y.C1429b.C1430a;
import p124p.p150h.p162l.p163y.C1436d;
import p124p.p150h.p162l.p163y.C1436d.C1437a;
import p124p.p167j.p168a.C1458a;
import p124p.p167j.p169b.C1468e;
import p124p.p167j.p169b.C1468e.C1471c;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p271c.C3294b;
import p213q.p217b.p218a.p271c.C3318d;
import p213q.p217b.p218a.p271c.C3400k;
import p213q.p217b.p218a.p271c.p278g0.C3337g;
import p213q.p217b.p218a.p271c.p278g0.C3342j;
import p213q.p217b.p218a.p271c.p296y.C3495a;

public class BottomSheetBehavior<V extends View> extends C0068c<V> {

    /* renamed from: K */
    public static final int f1210K = C3400k.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    public int f1211A;

    /* renamed from: B */
    public WeakReference<V> f1212B;

    /* renamed from: C */
    public WeakReference<View> f1213C;

    /* renamed from: D */
    public final ArrayList<C0220d> f1214D = new ArrayList<>();

    /* renamed from: E */
    public VelocityTracker f1215E;

    /* renamed from: F */
    public int f1216F;

    /* renamed from: G */
    public int f1217G;

    /* renamed from: H */
    public boolean f1218H;

    /* renamed from: I */
    public Map<View, Integer> f1219I;

    /* renamed from: J */
    public final C1471c f1220J = new C0218b();

    /* renamed from: a */
    public int f1221a = 0;

    /* renamed from: b */
    public boolean f1222b = true;

    /* renamed from: c */
    public float f1223c;

    /* renamed from: d */
    public int f1224d;

    /* renamed from: e */
    public boolean f1225e;

    /* renamed from: f */
    public int f1226f;

    /* renamed from: g */
    public boolean f1227g;

    /* renamed from: h */
    public C3337g f1228h;

    /* renamed from: i */
    public C3342j f1229i;

    /* renamed from: j */
    public boolean f1230j;

    /* renamed from: k */
    public C0223f f1231k = null;

    /* renamed from: l */
    public ValueAnimator f1232l;

    /* renamed from: m */
    public int f1233m;

    /* renamed from: n */
    public int f1234n;

    /* renamed from: o */
    public int f1235o;

    /* renamed from: p */
    public float f1236p = 0.5f;

    /* renamed from: q */
    public int f1237q;

    /* renamed from: r */
    public float f1238r = -1.0f;

    /* renamed from: s */
    public boolean f1239s;

    /* renamed from: t */
    public boolean f1240t;

    /* renamed from: u */
    public int f1241u = 4;

    /* renamed from: v */
    public C1468e f1242v;

    /* renamed from: w */
    public boolean f1243w;

    /* renamed from: x */
    public int f1244x;

    /* renamed from: y */
    public boolean f1245y;

    /* renamed from: z */
    public int f1246z;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    public class C0217a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ View f1247e;

        /* renamed from: f */
        public final /* synthetic */ int f1248f;

        public C0217a(View view, int i) {
            this.f1247e = view;
            this.f1248f = i;
        }

        public void run() {
            BottomSheetBehavior.this.mo1764a(this.f1247e, this.f1248f);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public class C0218b extends C1471c {
        public C0218b() {
        }

        /* renamed from: a */
        public int mo1690a(View view, int i, int i2) {
            return view.getLeft();
        }

        /* renamed from: a */
        public void mo1691a(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.mo1774d(1);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
            if (java.lang.Math.abs(r8 - r6.f1250a.f1235o) < java.lang.Math.abs(r8 - r6.f1250a.f1237q)) goto L_0x007e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cb, code lost:
            if (java.lang.Math.abs(r8 - r0) < java.lang.Math.abs(r8 - r6.f1250a.f1237q)) goto L_0x007e;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1692a(android.view.View r7, float r8, float r9) {
            /*
                r6 = this;
                r0 = 0
                int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                r2 = 4
                r3 = 6
                r4 = 3
                if (r1 >= 0) goto L_0x0022
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r8.f1222b
                if (r9 == 0) goto L_0x0013
            L_0x000e:
                int r8 = r8.f1234n
            L_0x0010:
                r2 = r4
                goto L_0x00ce
            L_0x0013:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f1235o
                if (r8 <= r0) goto L_0x001f
                r8 = r0
                goto L_0x0082
            L_0x001f:
                int r8 = r9.f1233m
                goto L_0x0010
            L_0x0022:
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r5 = r1.f1239s
                if (r5 == 0) goto L_0x004b
                boolean r1 = r1.mo1768a(r7, r9)
                if (r1 == 0) goto L_0x004b
                int r1 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r5 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r5 = r5.f1237q
                if (r1 > r5) goto L_0x0044
                float r1 = java.lang.Math.abs(r8)
                float r5 = java.lang.Math.abs(r9)
                int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x004b
            L_0x0044:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f1211A
                r2 = 5
                goto L_0x00ce
            L_0x004b:
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x0087
                float r8 = java.lang.Math.abs(r8)
                float r9 = java.lang.Math.abs(r9)
                int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
                if (r8 <= 0) goto L_0x005c
                goto L_0x0087
            L_0x005c:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r8.f1222b
                if (r9 == 0) goto L_0x0065
            L_0x0062:
                int r8 = r8.f1237q
                goto L_0x00ce
            L_0x0065:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f1235o
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f1237q
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0084
            L_0x007e:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f1235o
            L_0x0082:
                r2 = r3
                goto L_0x00ce
            L_0x0084:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                goto L_0x0062
            L_0x0087:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r0 = r9.f1222b
                if (r0 == 0) goto L_0x00a8
                int r9 = r9.f1234n
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f1237q
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0084
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                goto L_0x000e
            L_0x00a8:
                int r0 = r9.f1235o
                if (r8 >= r0) goto L_0x00bc
                int r9 = r9.f1237q
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                if (r8 >= r9) goto L_0x007e
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f1233m
                goto L_0x0010
            L_0x00bc:
                int r9 = r8 - r0
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f1237q
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0084
                goto L_0x007e
            L_0x00ce:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r0 = 1
                r9.mo1765a(r7, r2, r8, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C0218b.mo1692a(android.view.View, float, float):void");
        }

        /* renamed from: a */
        public void mo1694a(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo1762a(i2);
        }

        /* renamed from: b */
        public int mo1778b(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f1239s ? bottomSheetBehavior.f1211A : bottomSheetBehavior.f1237q;
        }

        /* renamed from: b */
        public int mo1695b(View view, int i, int i2) {
            int a = BottomSheetBehavior.this.mo1771c();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C1061o.m2432a(i, a, bottomSheetBehavior.f1239s ? bottomSheetBehavior.f1211A : bottomSheetBehavior.f1237q);
        }

        /* renamed from: b */
        public boolean mo1696b(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f1241u;
            boolean z = true;
            if (i2 == 1 || bottomSheetBehavior.f1218H) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f1216F == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f1213C;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f1212B;
            if (weakReference2 == null || weakReference2.get() != view) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    public class C0219c implements C1436d {

        /* renamed from: a */
        public final /* synthetic */ int f1251a;

        public C0219c(int i) {
            this.f1251a = i;
        }

        /* renamed from: a */
        public boolean mo1431a(View view, C1437a aVar) {
            BottomSheetBehavior.this.mo1772c(this.f1251a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    public static abstract class C0220d {
        /* renamed from: a */
        public abstract void mo1779a(View view, float f);

        /* renamed from: a */
        public abstract void mo1780a(View view, int i);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public static class C0221e extends C1458a {
        public static final Creator<C0221e> CREATOR = new C0222a();

        /* renamed from: g */
        public final int f1253g;

        /* renamed from: h */
        public int f1254h;

        /* renamed from: i */
        public boolean f1255i;

        /* renamed from: j */
        public boolean f1256j;

        /* renamed from: k */
        public boolean f1257k;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e$a */
        public static class C0222a implements ClassLoaderCreator<C0221e> {
            public Object createFromParcel(Parcel parcel) {
                return new C0221e(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0221e[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0221e(parcel, classLoader);
            }
        }

        public C0221e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1253g = parcel.readInt();
            this.f1254h = parcel.readInt();
            boolean z = false;
            this.f1255i = parcel.readInt() == 1;
            this.f1256j = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.f1257k = z;
        }

        public C0221e(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f1253g = bottomSheetBehavior.f1241u;
            this.f1254h = bottomSheetBehavior.f1224d;
            this.f1255i = bottomSheetBehavior.f1222b;
            this.f1256j = bottomSheetBehavior.f1239s;
            this.f1257k = bottomSheetBehavior.f1240t;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f4274e, i);
            parcel.writeInt(this.f1253g);
            parcel.writeInt(this.f1254h);
            parcel.writeInt(this.f1255i ? 1 : 0);
            parcel.writeInt(this.f1256j ? 1 : 0);
            parcel.writeInt(this.f1257k ? 1 : 0);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    public class C0223f implements Runnable {

        /* renamed from: e */
        public final View f1258e;

        /* renamed from: f */
        public boolean f1259f;

        /* renamed from: g */
        public int f1260g;

        public C0223f(View view, int i) {
            this.f1258e = view;
            this.f1260g = i;
        }

        public void run() {
            C1468e eVar = BottomSheetBehavior.this.f1242v;
            if (eVar == null || !eVar.mo6012a(true)) {
                BottomSheetBehavior.this.mo1774d(this.f1260g);
            } else {
                C1404o.m3523a(this.f1258e, (Runnable) this);
            }
            this.f1259f = false;
        }
    }

    public BottomSheetBehavior() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0076, code lost:
        if (r11 == -1) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomSheetBehavior(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            r9.<init>(r10, r11)
            r0 = 0
            r9.f1221a = r0
            r1 = 1
            r9.f1222b = r1
            r2 = 0
            r9.f1231k = r2
            r3 = 1056964608(0x3f000000, float:0.5)
            r9.f1236p = r3
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9.f1238r = r4
            r5 = 4
            r9.f1241u = r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r9.f1214D = r6
            com.google.android.material.bottomsheet.BottomSheetBehavior$b r6 = new com.google.android.material.bottomsheet.BottomSheetBehavior$b
            r6.<init>()
            r9.f1220J = r6
            int[] r6 = p213q.p217b.p218a.p271c.C3406l.BottomSheetBehavior_Layout
            android.content.res.TypedArray r6 = r10.obtainStyledAttributes(r11, r6)
            int r7 = p213q.p217b.p218a.p271c.C3406l.BottomSheetBehavior_Layout_shapeAppearance
            boolean r7 = r6.hasValue(r7)
            r9.f1227g = r7
            int r7 = p213q.p217b.p218a.p271c.C3406l.BottomSheetBehavior_Layout_backgroundTint
            boolean r7 = r6.hasValue(r7)
            if (r7 == 0) goto L_0x0045
            int r2 = p213q.p217b.p218a.p271c.C3406l.BottomSheetBehavior_Layout_backgroundTint
            android.content.res.ColorStateList r2 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5173a(r10, r6, r2)
            r9.mo1763a(r10, r11, r7, r2)
            goto L_0x0048
        L_0x0045:
            r9.mo1763a(r10, r11, r7, r2)
        L_0x0048:
            r11 = 2
            float[] r11 = new float[r11]
            r11 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r11 = android.animation.ValueAnimator.ofFloat(r11)
            r9.f1232l = r11
            r7 = 500(0x1f4, double:2.47E-321)
            r11.setDuration(r7)
            android.animation.ValueAnimator r11 = r9.f1232l
            q.b.a.c.r.a r2 = new q.b.a.c.r.a
            r2.<init>(r9)
            r11.addUpdateListener(r2)
            int r11 = p213q.p217b.p218a.p271c.C3406l.BottomSheetBehavior_Layout_android_elevation
            float r11 = r6.getDimension(r11, r4)
            r9.f1238r = r11
            int r11 = p213q.p217b.p218a.p271c.C3406l.BottomSheetBehavior_Layout_behavior_peekHeight
            android.util.TypedValue r11 = r6.peekValue(r11)
            r2 = -1
            if (r11 == 0) goto L_0x0079
            int r11 = r11.data
            if (r11 != r2) goto L_0x0079
            goto L_0x007f
        L_0x0079:
            int r11 = p213q.p217b.p218a.p271c.C3406l.BottomSheetBehavior_Layout_behavior_peekHeight
            int r11 = r6.getDimensionPixelSize(r11, r2)
        L_0x007f:
            r9.mo1770b(r11)
            int r11 = p213q.p217b.p218a.p271c.C3406l.BottomSheetBehavior_Layout_behavior_hideable
            boolean r11 = r6.getBoolean(r11, r0)
            boolean r2 = r9.f1239s
            if (r2 == r11) goto L_0x009b
            r9.f1239s = r11
            if (r11 != 0) goto L_0x0098
            int r11 = r9.f1241u
            r2 = 5
            if (r11 != r2) goto L_0x0098
            r9.mo1772c(r5)
        L_0x0098:
            r9.mo1773d()
        L_0x009b:
            int r11 = p213q.p217b.p218a.p271c.C3406l.BottomSheetBehavior_Layout_behavior_fitToContents
            boolean r11 = r6.getBoolean(r11, r1)
            boolean r1 = r9.f1222b
            if (r1 != r11) goto L_0x00a6
            goto L_0x00c2
        L_0x00a6:
            r9.f1222b = r11
            java.lang.ref.WeakReference<V> r11 = r9.f1212B
            if (r11 == 0) goto L_0x00af
            r9.mo1769b()
        L_0x00af:
            boolean r11 = r9.f1222b
            if (r11 == 0) goto L_0x00ba
            int r11 = r9.f1241u
            r1 = 6
            if (r11 != r1) goto L_0x00ba
            r11 = 3
            goto L_0x00bc
        L_0x00ba:
            int r11 = r9.f1241u
        L_0x00bc:
            r9.mo1774d(r11)
            r9.mo1773d()
        L_0x00c2:
            int r11 = p213q.p217b.p218a.p271c.C3406l.BottomSheetBehavior_Layout_behavior_skipCollapsed
            boolean r11 = r6.getBoolean(r11, r0)
            r9.f1240t = r11
            int r11 = p213q.p217b.p218a.p271c.C3406l.BottomSheetBehavior_Layout_behavior_saveFlags
            int r11 = r6.getInt(r11, r0)
            r9.f1221a = r11
            int r11 = p213q.p217b.p218a.p271c.C3406l.BottomSheetBehavior_Layout_behavior_halfExpandedRatio
            float r11 = r6.getFloat(r11, r3)
            r1 = 0
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0106
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0106
            r9.f1236p = r11
            int r11 = p213q.p217b.p218a.p271c.C3406l.BottomSheetBehavior_Layout_behavior_expandedOffset
            int r11 = r6.getInt(r11, r0)
            if (r11 < 0) goto L_0x00fe
            r9.f1233m = r11
            r6.recycle()
            android.view.ViewConfiguration r10 = android.view.ViewConfiguration.get(r10)
            int r10 = r10.getScaledMaximumFlingVelocity()
            float r10 = (float) r10
            r9.f1223c = r10
            return
        L_0x00fe:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "offset must be greater than or equal to 0"
            r10.<init>(r11)
            throw r10
        L_0x0106:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "ratio must be a float value between 0 and 1"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    public View mo1761a(View view) {
        if (C1404o.m3564y(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View a = mo1761a(viewGroup.getChildAt(i));
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo651a() {
        this.f1212B = null;
        this.f1242v = null;
    }

    /* renamed from: a */
    public void mo1762a(int i) {
        float f;
        float f2;
        View view = (View) this.f1212B.get();
        if (view != null && !this.f1214D.isEmpty()) {
            int i2 = this.f1237q;
            if (i > i2) {
                f = (float) (i2 - i);
                f2 = (float) (this.f1211A - i2);
            } else {
                f = (float) (i2 - i);
                f2 = (float) (i2 - mo1771c());
            }
            float f3 = f / f2;
            for (int i3 = 0; i3 < this.f1214D.size(); i3++) {
                ((C0220d) this.f1214D.get(i3)).mo1779a(view, f3);
            }
        }
    }

    /* renamed from: a */
    public final void mo1763a(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f1227g) {
            this.f1229i = C3342j.m7744a(context, attributeSet, C3294b.bottomSheetStyle, f1210K).mo9102a();
            C3337g gVar = new C3337g(this.f1229i);
            this.f1228h = gVar;
            gVar.f8365e.f8388b = new C3495a(context);
            gVar.mo9086j();
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f1228h.setTint(typedValue.data);
                return;
            }
            this.f1228h.mo9063a(colorStateList);
        }
    }

    /* renamed from: a */
    public void mo1764a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f1237q;
        } else if (i == 6) {
            int i3 = this.f1235o;
            if (this.f1222b) {
                int i4 = this.f1234n;
                if (i3 <= i4) {
                    i = 3;
                    i2 = i4;
                }
            }
            i2 = i3;
        } else if (i == 3) {
            i2 = mo1771c();
        } else if (!this.f1239s || i != 5) {
            throw new IllegalArgumentException(C1965a.m4761b("Illegal state argument: ", i));
        } else {
            i2 = this.f1211A;
        }
        mo1765a(view, i, i2, false);
    }

    /* renamed from: a */
    public final void mo1766a(V v, C1430a aVar, int i) {
        C1404o.m3529a(v, aVar, null, new C0219c(i));
    }

    /* renamed from: a */
    public void mo652a(C0071f fVar) {
        this.f1212B = null;
        this.f1242v = null;
    }

    /* renamed from: a */
    public void mo656a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* renamed from: a */
    public void mo657a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f1213C;
            if (view == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = v.getTop();
                int i5 = top - i2;
                if (i2 <= 0) {
                    if (i2 < 0 && !view.canScrollVertically(-1)) {
                        int i6 = this.f1237q;
                        if (i5 <= i6 || this.f1239s) {
                            iArr[1] = i2;
                            C1404o.m3539c(v, -i2);
                            mo1774d(1);
                        } else {
                            iArr[1] = top - i6;
                            C1404o.m3539c(v, -iArr[1]);
                            i4 = 4;
                        }
                    }
                    mo1762a(v.getTop());
                    this.f1244x = i2;
                    this.f1245y = true;
                } else if (i5 < mo1771c()) {
                    iArr[1] = top - mo1771c();
                    C1404o.m3539c(v, -iArr[1]);
                    i4 = 3;
                } else {
                    iArr[1] = i2;
                    C1404o.m3539c(v, -i2);
                    mo1774d(1);
                    mo1762a(v.getTop());
                    this.f1244x = i2;
                    this.f1245y = true;
                }
                mo1774d(i4);
                mo1762a(v.getTop());
                this.f1244x = i2;
                this.f1245y = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo1767a(boolean z) {
        int i;
        WeakReference<V> weakReference = this.f1212B;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.f1219I == null) {
                        this.f1219I = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.f1212B.get()) {
                        Map<View, Integer> map = this.f1219I;
                        if (z) {
                            map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            i = 4;
                        } else if (map != null && map.containsKey(childAt)) {
                            i = ((Integer) this.f1219I.get(childAt)).intValue();
                        }
                        C1404o.m3545f(childAt, i);
                    }
                }
                if (!z) {
                    this.f1219I = null;
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo1768a(View view, float f) {
        boolean z = true;
        if (this.f1240t) {
            return true;
        }
        if (view.getTop() < this.f1237q) {
            return false;
        }
        if (Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.f1237q)) / ((float) this.f1224d) <= 0.5f) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo664a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f1213C;
        return (weakReference == null || view != weakReference.get() || this.f1241u == 3) ? false : true;
    }

    /* renamed from: a */
    public boolean mo666a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f1244x = 0;
        this.f1245y = false;
        return (i & 2) != 0;
    }

    /* renamed from: b */
    public final void mo1769b() {
        int max = this.f1225e ? Math.max(this.f1226f, this.f1211A - ((this.f1246z * 9) / 16)) : this.f1224d;
        if (this.f1222b) {
            this.f1237q = Math.max(this.f1211A - max, this.f1234n);
        } else {
            this.f1237q = this.f1211A - max;
        }
    }

    /* renamed from: b */
    public boolean mo667b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1241u == 1 && actionMasked == 0) {
            return true;
        }
        C1468e eVar = this.f1242v;
        if (eVar != null) {
            eVar.mo6007a(motionEvent);
        }
        if (actionMasked == 0) {
            this.f1216F = -1;
            VelocityTracker velocityTracker = this.f1215E;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1215E = null;
            }
        }
        if (this.f1215E == null) {
            this.f1215E = VelocityTracker.obtain();
        }
        this.f1215E.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f1243w) {
            float abs = Math.abs(((float) this.f1217G) - motionEvent.getY());
            C1468e eVar2 = this.f1242v;
            if (abs > ((float) eVar2.f4295b)) {
                eVar2.mo6008a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1243w;
    }

    /* renamed from: c */
    public final int mo1771c() {
        return this.f1222b ? this.f1234n : this.f1233m;
    }

    /* renamed from: c */
    public void mo1772c(int i) {
        if (i != this.f1241u) {
            if (this.f1212B == null) {
                if (i == 4 || i == 3 || i == 6 || (this.f1239s && i == 5)) {
                    this.f1241u = i;
                }
                return;
            }
            mo1775e(i);
        }
    }

    /* renamed from: d */
    public final void mo1773d() {
        C1430a aVar;
        WeakReference<V> weakReference = this.f1212B;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                C1404o.m3541d(view, 524288);
                C1404o.m3541d(view, 262144);
                C1404o.m3541d(view, 1048576);
                if (this.f1239s && this.f1241u != 5) {
                    mo1766a((V) view, C1430a.f4211j, 5);
                }
                int i = this.f1241u;
                int i2 = 6;
                if (i == 3) {
                    if (this.f1222b) {
                        i2 = 4;
                    }
                    aVar = C1430a.f4210i;
                } else if (i != 4) {
                    if (i == 6) {
                        mo1766a((V) view, C1430a.f4210i, 4);
                        mo1766a((V) view, C1430a.f4209h, 3);
                    }
                } else {
                    if (this.f1222b) {
                        i2 = 3;
                    }
                    aVar = C1430a.f4209h;
                }
                mo1766a((V) view, aVar, i2);
            }
        }
    }

    /* renamed from: d */
    public void mo1774d(int i) {
        if (this.f1241u != i) {
            this.f1241u = i;
            WeakReference<V> weakReference = this.f1212B;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view != null) {
                    if (i == 6 || i == 3) {
                        mo1767a(true);
                    } else if (i == 5 || i == 4) {
                        mo1767a(false);
                    }
                    mo1776f(i);
                    for (int i2 = 0; i2 < this.f1214D.size(); i2++) {
                        ((C0220d) this.f1214D.get(i2)).mo1780a(view, i);
                    }
                    mo1773d();
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo1775e(int i) {
        View view = (View) this.f1212B.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !C1404o.m3562w(view)) {
                mo1764a(view, i);
            } else {
                view.post(new C0217a(view, i));
            }
        }
    }

    /* renamed from: f */
    public final void mo1776f(int i) {
        if (i != 2) {
            boolean z = i == 3;
            if (this.f1230j != z) {
                this.f1230j = z;
                if (this.f1228h != null) {
                    ValueAnimator valueAnimator = this.f1232l;
                    if (valueAnimator != null) {
                        if (valueAnimator.isRunning()) {
                            this.f1232l.reverse();
                        } else {
                            float f = z ? 0.0f : 1.0f;
                            this.f1232l.setFloatValues(new float[]{1.0f - f, f});
                            this.f1232l.start();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo662a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = false;
        if (!v.isShown()) {
            this.f1243w = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view = null;
        if (actionMasked == 0) {
            this.f1216F = -1;
            VelocityTracker velocityTracker = this.f1215E;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1215E = null;
            }
        }
        if (this.f1215E == null) {
            this.f1215E = VelocityTracker.obtain();
        }
        this.f1215E.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f1217G = (int) motionEvent.getY();
            if (this.f1241u != 2) {
                WeakReference<View> weakReference = this.f1213C;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.mo603a(view2, x, this.f1217G)) {
                    this.f1216F = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f1218H = true;
                }
            }
            this.f1243w = this.f1216F == -1 && !coordinatorLayout.mo603a((View) v, x, this.f1217G);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1218H = false;
            this.f1216F = -1;
            if (this.f1243w) {
                this.f1243w = false;
                return false;
            }
        }
        if (!this.f1243w) {
            C1468e eVar = this.f1242v;
            if (eVar != null && eVar.mo6021c(motionEvent)) {
                return true;
            }
        }
        WeakReference<View> weakReference2 = this.f1213C;
        if (weakReference2 != null) {
            view = (View) weakReference2.get();
        }
        if (actionMasked == 2 && view != null && !this.f1243w && this.f1241u != 1 && !coordinatorLayout.mo603a(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.f1242v != null && Math.abs(((float) this.f1217G) - motionEvent.getY()) > ((float) this.f1242v.f4295b)) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1770b(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f1225e
            if (r4 != 0) goto L_0x0015
            r3.f1225e = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.f1225e
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f1224d
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = r1
            goto L_0x001f
        L_0x0017:
            r3.f1225e = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f1224d = r4
        L_0x001f:
            if (r0 == 0) goto L_0x003a
            java.lang.ref.WeakReference<V> r4 = r3.f1212B
            if (r4 == 0) goto L_0x003a
            r3.mo1769b()
            int r4 = r3.f1241u
            r0 = 4
            if (r4 != r0) goto L_0x003a
            java.lang.ref.WeakReference<V> r4 = r3.f1212B
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003a
            r4.requestLayout()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo1770b(int):void");
    }

    /* renamed from: a */
    public boolean mo658a(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        if (C1404o.m3548i(coordinatorLayout) && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.f1212B == null) {
            this.f1226f = coordinatorLayout.getResources().getDimensionPixelSize(C3318d.design_bottom_sheet_peek_height_min);
            this.f1212B = new WeakReference<>(v);
            if (this.f1227g) {
                C3337g gVar = this.f1228h;
                if (gVar != null) {
                    v.setBackground(gVar);
                }
            }
            C3337g gVar2 = this.f1228h;
            if (gVar2 != null) {
                float f = this.f1238r;
                if (f == -1.0f) {
                    f = v.getElevation();
                }
                gVar2.mo9059a(f);
                boolean z = this.f1241u == 3;
                this.f1230j = z;
                this.f1228h.mo9068b(z ? 0.0f : 1.0f);
            }
            mo1773d();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.f1242v == null) {
            this.f1242v = new C1468e(coordinatorLayout.getContext(), coordinatorLayout, this.f1220J);
        }
        int top = v.getTop();
        coordinatorLayout.mo607b(v, i);
        this.f1246z = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.f1211A = height;
        this.f1234n = Math.max(0, height - v.getHeight());
        this.f1235o = (int) ((1.0f - this.f1236p) * ((float) this.f1211A));
        mo1769b();
        int i3 = this.f1241u;
        if (i3 == 3) {
            i2 = mo1771c();
        } else if (i3 == 6) {
            i2 = this.f1235o;
        } else if (!this.f1239s || i3 != 5) {
            int i4 = this.f1241u;
            if (i4 == 4) {
                i2 = this.f1237q;
            } else {
                if (i4 == 1 || i4 == 2) {
                    v.offsetTopAndBottom(top - v.getTop());
                }
                this.f1213C = new WeakReference<>(mo1761a((View) v));
                return true;
            }
        } else {
            i2 = this.f1211A;
        }
        v.offsetTopAndBottom(i2);
        this.f1213C = new WeakReference<>(mo1761a((View) v));
        return true;
    }

    /* renamed from: a */
    public void mo653a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C0221e eVar = (C0221e) parcelable;
        Parcelable parcelable2 = eVar.f4274e;
        int i = this.f1221a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f1224d = eVar.f1254h;
            }
            int i2 = this.f1221a;
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f1222b = eVar.f1255i;
            }
            int i3 = this.f1221a;
            if (i3 == -1 || (i3 & 4) == 4) {
                this.f1239s = eVar.f1256j;
            }
            int i4 = this.f1221a;
            if (i4 == -1 || (i4 & 8) == 8) {
                this.f1240t = eVar.f1257k;
            }
        }
        int i5 = eVar.f1253g;
        if (i5 == 1 || i5 == 2) {
            this.f1241u = 4;
        } else {
            this.f1241u = i5;
        }
    }

    /* renamed from: a */
    public Parcelable mo650a(CoordinatorLayout coordinatorLayout, V v) {
        return new C0221e((Parcelable) BaseSavedState.EMPTY_STATE, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008c, code lost:
        if (java.lang.Math.abs(r4 - r1) < java.lang.Math.abs(r4 - r3.f1237q)) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00aa, code lost:
        if (java.lang.Math.abs(r4 - r3.f1235o) < java.lang.Math.abs(r4 - r3.f1237q)) goto L_0x00ac;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo654a(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.View r6, int r7) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r7 = r3.mo1771c()
            r0 = 3
            if (r4 != r7) goto L_0x000f
            r3.mo1774d(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.f1213C
            if (r4 == 0) goto L_0x00b5
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto L_0x00b5
            boolean r4 = r3.f1245y
            if (r4 != 0) goto L_0x001f
            goto L_0x00b5
        L_0x001f:
            int r4 = r3.f1244x
            r6 = 6
            r7 = 4
            if (r4 <= 0) goto L_0x002b
            int r4 = r3.mo1771c()
            goto L_0x00af
        L_0x002b:
            boolean r4 = r3.f1239s
            if (r4 == 0) goto L_0x004e
            android.view.VelocityTracker r4 = r3.f1215E
            if (r4 != 0) goto L_0x0035
            r4 = 0
            goto L_0x0044
        L_0x0035:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f1223c
            r4.computeCurrentVelocity(r1, r2)
            android.view.VelocityTracker r4 = r3.f1215E
            int r1 = r3.f1216F
            float r4 = r4.getYVelocity(r1)
        L_0x0044:
            boolean r4 = r3.mo1768a(r5, r4)
            if (r4 == 0) goto L_0x004e
            int r4 = r3.f1211A
            r0 = 5
            goto L_0x00af
        L_0x004e:
            int r4 = r3.f1244x
            if (r4 != 0) goto L_0x008f
            int r4 = r5.getTop()
            boolean r1 = r3.f1222b
            if (r1 == 0) goto L_0x006e
            int r6 = r3.f1234n
            int r6 = r4 - r6
            int r6 = java.lang.Math.abs(r6)
            int r1 = r3.f1237q
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r6 >= r4) goto L_0x0093
            int r4 = r3.f1234n
            goto L_0x00af
        L_0x006e:
            int r1 = r3.f1235o
            if (r4 >= r1) goto L_0x007f
            int r7 = r3.f1237q
            int r7 = r4 - r7
            int r7 = java.lang.Math.abs(r7)
            if (r4 >= r7) goto L_0x00ac
            int r4 = r3.f1233m
            goto L_0x00af
        L_0x007f:
            int r0 = r4 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.f1237q
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x0093
            goto L_0x00ac
        L_0x008f:
            boolean r4 = r3.f1222b
            if (r4 == 0) goto L_0x0097
        L_0x0093:
            int r4 = r3.f1237q
            r0 = r7
            goto L_0x00af
        L_0x0097:
            int r4 = r5.getTop()
            int r0 = r3.f1235o
            int r0 = r4 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.f1237q
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x0093
        L_0x00ac:
            int r4 = r3.f1235o
            r0 = r6
        L_0x00af:
            r6 = 0
            r3.mo1765a(r5, r0, r4, r6)
            r3.f1245y = r6
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo654a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    /* renamed from: a */
    public void mo1765a(View view, int i, int i2, boolean z) {
        boolean z2;
        if (z) {
            z2 = this.f1242v.mo6018b(view.getLeft(), i2);
        } else {
            C1468e eVar = this.f1242v;
            int left = view.getLeft();
            eVar.f4311r = view;
            eVar.f4296c = -1;
            z2 = eVar.mo6010a(left, i2, 0, 0);
            if (!z2 && eVar.f4294a == 0 && eVar.f4311r != null) {
                eVar.f4311r = null;
            }
        }
        if (z2) {
            mo1774d(2);
            mo1776f(i);
            if (this.f1231k == null) {
                this.f1231k = new C0223f<>(view, i);
            }
            C0223f fVar = this.f1231k;
            boolean z3 = fVar.f1259f;
            fVar.f1260g = i;
            if (!z3) {
                C1404o.m3523a(view, (Runnable) fVar);
                this.f1231k.f1259f = true;
                return;
            }
            return;
        }
        mo1774d(i);
    }
}
