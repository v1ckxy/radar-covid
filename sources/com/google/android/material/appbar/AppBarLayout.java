package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0068c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0069d;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0071f;
import java.lang.ref.WeakReference;
import java.util.List;
import p124p.p126b.p127k.C1061o;
import p124p.p126b.p128l.p129a.C1070a;
import p124p.p150h.p162l.C1396g;
import p124p.p150h.p162l.C1404o;
import p124p.p167j.p168a.C1458a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p271c.C3294b;
import p213q.p217b.p218a.p271c.C3318d;
import p213q.p217b.p218a.p271c.C3330g;
import p213q.p217b.p218a.p271c.C3406l;
import p213q.p217b.p218a.p271c.p278g0.C3337g;
import p213q.p217b.p218a.p271c.p283m.C3407a;
import p213q.p217b.p218a.p271c.p284n.C3417a;
import p213q.p217b.p218a.p271c.p284n.C3418b;
import p213q.p217b.p218a.p271c.p284n.C3419c;
import p213q.p217b.p218a.p271c.p284n.C3421d;

@C0069d(Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: e */
    public int f1137e;

    /* renamed from: f */
    public int f1138f;

    /* renamed from: g */
    public int f1139g;

    /* renamed from: h */
    public int f1140h;

    /* renamed from: i */
    public boolean f1141i;

    /* renamed from: j */
    public int f1142j;

    /* renamed from: k */
    public boolean f1143k;

    /* renamed from: l */
    public boolean f1144l;

    /* renamed from: m */
    public boolean f1145m;

    /* renamed from: n */
    public int f1146n;

    /* renamed from: o */
    public WeakReference<View> f1147o;

    /* renamed from: p */
    public ValueAnimator f1148p;

    /* renamed from: q */
    public int[] f1149q;

    /* renamed from: r */
    public Drawable f1150r;

    public static class BaseBehavior<T extends AppBarLayout> extends C3419c<T> {

        /* renamed from: k */
        public int f1151k;

        /* renamed from: l */
        public int f1152l;

        /* renamed from: m */
        public ValueAnimator f1153m;

        /* renamed from: n */
        public int f1154n = -1;

        /* renamed from: o */
        public boolean f1155o;

        /* renamed from: p */
        public float f1156p;

        /* renamed from: q */
        public WeakReference<View> f1157q;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        public static class C0202a extends C1458a {
            public static final Creator<C0202a> CREATOR = new C0203a();

            /* renamed from: g */
            public int f1158g;

            /* renamed from: h */
            public float f1159h;

            /* renamed from: i */
            public boolean f1160i;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a */
            public static class C0203a implements ClassLoaderCreator<C0202a> {
                public Object createFromParcel(Parcel parcel) {
                    return new C0202a(parcel, null);
                }

                public Object[] newArray(int i) {
                    return new C0202a[i];
                }

                public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C0202a(parcel, classLoader);
                }
            }

            public C0202a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f1158g = parcel.readInt();
                this.f1159h = parcel.readFloat();
                this.f1160i = parcel.readByte() != 0;
            }

            public C0202a(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.f4274e, i);
                parcel.writeInt(this.f1158g);
                parcel.writeFloat(this.f1159h);
                parcel.writeByte(this.f1160i ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public static boolean m927a(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: a */
        public final View mo1673a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C1396g) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        public final void mo1675a(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int abs = Math.abs(mo1679c() - i);
            float abs2 = Math.abs(f);
            int round = abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            int c = mo1679c();
            if (c == i) {
                ValueAnimator valueAnimator = this.f1153m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f1153m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f1153m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f1153m = valueAnimator3;
                valueAnimator3.setInterpolator(C3407a.f8576e);
                this.f1153m.addUpdateListener(new C3418b(this, coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f1153m.setDuration((long) Math.min(round, 600));
            this.f1153m.setIntValues(new int[]{c, i});
            this.f1153m.start();
        }

        /* JADX WARNING: Removed duplicated region for block: B:38:0x00af  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00d6  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00d8  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo1678b(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10, int r11, int r12) {
            /*
                r7 = this;
                r2 = r9
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                int r9 = r7.mo1679c()
                r0 = 0
                if (r11 == 0) goto L_0x00e2
                if (r9 < r11) goto L_0x00e2
                if (r9 > r12) goto L_0x00e2
                int r3 = p124p.p126b.p127k.C1061o.m2432a(r10, r11, r12)
                if (r9 == r3) goto L_0x00e4
                boolean r10 = r2.f1141i
                if (r10 == 0) goto L_0x0085
                int r10 = java.lang.Math.abs(r3)
                int r11 = r2.getChildCount()
                r12 = r0
            L_0x0021:
                if (r12 >= r11) goto L_0x0085
                android.view.View r1 = r2.getChildAt(r12)
                android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$a r4 = (com.google.android.material.appbar.AppBarLayout.C0204a) r4
                android.view.animation.Interpolator r5 = r4.f1162b
                int r6 = r1.getTop()
                if (r10 < r6) goto L_0x0082
                int r6 = r1.getBottom()
                if (r10 > r6) goto L_0x0082
                if (r5 == 0) goto L_0x0085
                int r11 = r4.f1161a
                r12 = r11 & 1
                if (r12 == 0) goto L_0x0058
                int r12 = r1.getHeight()
                int r6 = r4.topMargin
                int r12 = r12 + r6
                int r4 = r4.bottomMargin
                int r12 = r12 + r4
                int r12 = r12 + r0
                r11 = r11 & 2
                if (r11 == 0) goto L_0x0059
                int r11 = p124p.p150h.p162l.C1404o.m3552m(r1)
                int r12 = r12 - r11
                goto L_0x0059
            L_0x0058:
                r12 = r0
            L_0x0059:
                boolean r11 = p124p.p150h.p162l.C1404o.m3548i(r1)
                if (r11 == 0) goto L_0x0064
                int r11 = r2.getTopInset()
                int r12 = r12 - r11
            L_0x0064:
                if (r12 <= 0) goto L_0x0085
                int r11 = r1.getTop()
                int r10 = r10 - r11
                float r11 = (float) r12
                float r10 = (float) r10
                float r10 = r10 / r11
                float r10 = r5.getInterpolation(r10)
                float r10 = r10 * r11
                int r10 = java.lang.Math.round(r10)
                int r11 = java.lang.Integer.signum(r3)
                int r12 = r1.getTop()
                int r12 = r12 + r10
                int r12 = r12 * r11
                goto L_0x0086
            L_0x0082:
                int r12 = r12 + 1
                goto L_0x0021
            L_0x0085:
                r12 = r3
            L_0x0086:
                boolean r10 = r7.mo9207a(r12)
                int r11 = r9 - r3
                int r12 = r3 - r12
                r7.f1151k = r12
                if (r10 != 0) goto L_0x00c5
                boolean r10 = r2.f1141i
                if (r10 == 0) goto L_0x00c5
                p.g.d.a<android.view.View> r10 = r8.f499f
                p.e.h<T, java.util.ArrayList<T>> r10 = r10.f3932b
                r12 = 0
                java.lang.Object r10 = r10.getOrDefault(r2, r12)
                java.util.List r10 = (java.util.List) r10
                if (r10 == 0) goto L_0x00c5
                boolean r12 = r10.isEmpty()
                if (r12 != 0) goto L_0x00c5
            L_0x00a9:
                int r12 = r10.size()
                if (r0 >= r12) goto L_0x00c5
                java.lang.Object r12 = r10.get(r0)
                android.view.View r12 = (android.view.View) r12
                android.view.ViewGroup$LayoutParams r1 = r12.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0071f) r1
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r1.f519a
                if (r1 == 0) goto L_0x00c2
                r1.mo668b(r8, r12, r2)
            L_0x00c2:
                int r0 = r0 + 1
                goto L_0x00a9
            L_0x00c5:
                int r10 = r7.mo9208b()
                r2.f1137e = r10
                boolean r10 = r2.willNotDraw()
                if (r10 != 0) goto L_0x00d4
                p124p.p150h.p162l.C1404o.m3507B(r2)
            L_0x00d4:
                if (r3 >= r9) goto L_0x00d8
                r9 = -1
                goto L_0x00d9
            L_0x00d8:
                r9 = 1
            L_0x00d9:
                r4 = r9
                r5 = 0
                r0 = r7
                r1 = r8
                r0.mo1676a(r1, r2, r3, r4, r5)
                r0 = r11
                goto L_0x00e4
            L_0x00e2:
                r7.f1151k = r0
            L_0x00e4:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo1678b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        /* renamed from: c */
        public int mo1679c() {
            return mo9208b() + this.f1151k;
        }

        /* renamed from: a */
        public boolean mo1677a(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference<View> weakReference = this.f1157q;
            if (weakReference == null) {
                return true;
            }
            View view2 = (View) weakReference.get();
            return view2 != null && view2.isShown() && !view2.canScrollVertically(-1);
        }

        /* renamed from: a */
        public boolean mo658a(CoordinatorLayout coordinatorLayout, View view, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.mo658a(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            int i2 = this.f1154n;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i2);
                int i3 = -childAt.getBottom();
                mo9203c(coordinatorLayout, appBarLayout, this.f1155o ? appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3 : Math.round(((float) childAt.getHeight()) * this.f1156p) + i3);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i4 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        mo1675a(coordinatorLayout, (T) appBarLayout, i4, 0.0f);
                    } else {
                        mo9203c(coordinatorLayout, appBarLayout, i4);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        mo1675a(coordinatorLayout, (T) appBarLayout, 0, 0.0f);
                    } else {
                        mo9203c(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f1142j = 0;
            this.f1154n = -1;
            mo9207a(C1061o.m2432a(mo9208b(), -appBarLayout.getTotalScrollRange(), 0));
            mo1676a(coordinatorLayout, appBarLayout, mo9208b(), 0, true);
            appBarLayout.f1137e = mo9208b();
            if (!appBarLayout.willNotDraw()) {
                C1404o.m3507B(appBarLayout);
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo659a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((C0071f) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.mo598a((View) appBarLayout, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public void mo657a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i2 != 0) {
                if (i2 < 0) {
                    i5 = -appBarLayout.getTotalScrollRange();
                    i4 = appBarLayout.getDownNestedPreScrollRange() + i5;
                } else {
                    i5 = -appBarLayout.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                int i6 = i5;
                int i7 = i4;
                if (i6 != i7) {
                    iArr[1] = mo9202a(coordinatorLayout, appBarLayout, i2, i6, i7);
                }
            }
            if (appBarLayout.f1145m) {
                appBarLayout.mo1640a(appBarLayout.mo1639a(view2));
            }
        }

        /* renamed from: a */
        public void mo656a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i4 < 0) {
                iArr[1] = mo9202a(coordinatorLayout, appBarLayout, i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
        }

        /* renamed from: a */
        public void mo653a(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof C0202a) {
                C0202a aVar = (C0202a) parcelable;
                Parcelable parcelable2 = aVar.f4274e;
                this.f1154n = aVar.f1158g;
                this.f1156p = aVar.f1159h;
                this.f1155o = aVar.f1160i;
                return;
            }
            this.f1154n = -1;
        }

        /* renamed from: a */
        public Parcelable mo650a(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = BaseSavedState.EMPTY_STATE;
            int b = mo9208b();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + b;
                if (childAt.getTop() + b > 0 || bottom < 0) {
                    i++;
                } else {
                    C0202a aVar = new C0202a(absSavedState);
                    aVar.f1158g = i;
                    if (bottom == appBarLayout.getTopInset() + C1404o.m3552m(childAt)) {
                        z = true;
                    }
                    aVar.f1160i = z;
                    aVar.f1159h = ((float) bottom) / ((float) childAt.getHeight());
                    return aVar;
                }
            }
            return absSavedState;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
            if (((r3.getTotalScrollRange() != 0) && r2.getHeight() - r4.getHeight() <= r3.getHeight()) != false) goto L_0x002d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo666a(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r5 = r6 & 2
                r6 = 1
                r0 = 0
                if (r5 == 0) goto L_0x002c
                boolean r5 = r3.f1145m
                if (r5 != 0) goto L_0x002d
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L_0x0014
                r5 = r6
                goto L_0x0015
            L_0x0014:
                r5 = r0
            L_0x0015:
                if (r5 == 0) goto L_0x0028
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L_0x0028
                r2 = r6
                goto L_0x0029
            L_0x0028:
                r2 = r0
            L_0x0029:
                if (r2 == 0) goto L_0x002c
                goto L_0x002d
            L_0x002c:
                r6 = r0
            L_0x002d:
                if (r6 == 0) goto L_0x0036
                android.animation.ValueAnimator r2 = r1.f1153m
                if (r2 == 0) goto L_0x0036
                r2.cancel()
            L_0x0036:
                r2 = 0
                r1.f1157q = r2
                r1.f1152l = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo666a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int, int):boolean");
        }

        /* renamed from: a */
        public void mo654a(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f1152l == 0 || i == 1) {
                mo1674a(coordinatorLayout, (T) appBarLayout);
                if (appBarLayout.f1145m) {
                    appBarLayout.mo1640a(appBarLayout.mo1639a(view2));
                }
            }
            this.f1157q = new WeakReference<>(view2);
        }

        /* renamed from: a */
        public final void mo1674a(CoordinatorLayout coordinatorLayout, T t) {
            int c = mo1679c();
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C0204a aVar = (C0204a) childAt.getLayoutParams();
                if (m927a(aVar.f1161a, 32)) {
                    top -= aVar.topMargin;
                    bottom += aVar.bottomMargin;
                }
                int i2 = -c;
                if (top <= i2 && bottom >= i2) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                C0204a aVar2 = (C0204a) childAt2.getLayoutParams();
                int i3 = aVar2.f1161a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == t.getChildCount() - 1) {
                        i5 += t.getTopInset();
                    }
                    if (m927a(i3, 2)) {
                        i5 += C1404o.m3552m(childAt2);
                    } else if (m927a(i3, 5)) {
                        int m = C1404o.m3552m(childAt2) + i5;
                        if (c < m) {
                            i4 = m;
                        } else {
                            i5 = m;
                        }
                    }
                    if (m927a(i3, 32)) {
                        i4 += aVar2.topMargin;
                        i5 -= aVar2.bottomMargin;
                    }
                    if (c < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    mo1675a(coordinatorLayout, t, C1061o.m2432a(i4, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x006f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo1676a(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, int r9, int r10, boolean r11) {
            /*
                r6 = this;
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            L_0x000a:
                if (r3 >= r1) goto L_0x0020
                android.view.View r4 = r8.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L_0x001d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L_0x001d
                goto L_0x0021
            L_0x001d:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0020:
                r4 = 0
            L_0x0021:
                if (r4 == 0) goto L_0x009e
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$a r0 = (com.google.android.material.appbar.AppBarLayout.C0204a) r0
                int r0 = r0.f1161a
                r1 = r0 & 1
                r3 = 1
                if (r1 == 0) goto L_0x0049
                int r1 = p124p.p150h.p162l.C1404o.m3552m(r4)
                if (r10 <= 0) goto L_0x004b
                r10 = r0 & 12
                if (r10 == 0) goto L_0x004b
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L_0x0049
            L_0x0047:
                r9 = r3
                goto L_0x005d
            L_0x0049:
                r9 = r2
                goto L_0x005d
            L_0x004b:
                r10 = r0 & 2
                if (r10 == 0) goto L_0x0049
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L_0x0049
                goto L_0x0047
            L_0x005d:
                boolean r10 = r8.f1145m
                if (r10 == 0) goto L_0x0069
                android.view.View r9 = r6.mo1673a(r7)
                boolean r9 = r8.mo1639a(r9)
            L_0x0069:
                boolean r9 = r8.mo1640a(r9)
                if (r11 != 0) goto L_0x009b
                if (r9 == 0) goto L_0x009e
                java.util.List r7 = r7.mo604b(r8)
                int r9 = r7.size()
                r10 = r2
            L_0x007a:
                if (r10 >= r9) goto L_0x0099
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0071f) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.f519a
                boolean r0 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r0 == 0) goto L_0x0096
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f8612g
                if (r7 == 0) goto L_0x0099
                r2 = r3
                goto L_0x0099
            L_0x0096:
                int r10 = r10 + 1
                goto L_0x007a
            L_0x0099:
                if (r2 == 0) goto L_0x009e
            L_0x009b:
                r8.jumpDrawablesToCurrentState()
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo1676a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends C3421d {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3406l.ScrollingViewBehavior_Layout);
            this.f8612g = obtainStyledAttributes.getDimensionPixelSize(C3406l.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public AppBarLayout mo1683a(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public boolean mo661a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout a = mo1683a(coordinatorLayout.mo595a(view));
            if (a != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f8609d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    a.mo1637a(false, !z);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo663a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: b */
        public boolean mo668b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            C0068c cVar = ((C0071f) view2.getLayoutParams()).f519a;
            if (cVar instanceof BaseBehavior) {
                C1404o.m3539c(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f1151k) + this.f8611f) - mo9205a(view2));
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f1145m) {
                    appBarLayout.mo1640a(appBarLayout.mo1639a(view));
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    public static class C0204a extends LayoutParams {

        /* renamed from: a */
        public int f1161a = 1;

        /* renamed from: b */
        public Interpolator f1162b;

        public C0204a(int i, int i2) {
            super(i, i2);
        }

        public C0204a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3406l.AppBarLayout_Layout);
            this.f1161a = obtainStyledAttributes.getInt(C3406l.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(C3406l.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f1162b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(C3406l.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public C0204a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0204a(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0204a(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: a */
    public void mo1637a(boolean z, boolean z2) {
        int i = z ? 1 : 2;
        int i2 = 0;
        if (z2) {
            i2 = 4;
        }
        this.f1142j = i | i2 | 8;
        requestLayout();
    }

    /* renamed from: a */
    public final boolean mo1638a() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return childAt.getVisibility() != 8 && !C1404o.m3548i(childAt);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0204a;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1150r != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f1137e));
            this.f1150r.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1150r;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0204a(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0204a(getContext(), attributeSet);
    }

    public C0204a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new C0204a((LayoutParams) layoutParams) : layoutParams instanceof MarginLayoutParams ? new C0204a((MarginLayoutParams) layoutParams) : new C0204a(layoutParams);
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int m;
        int i2 = this.f1139g;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C0204a aVar = (C0204a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = aVar.f1161a;
            if ((i4 & 5) == 5) {
                int i5 = aVar.topMargin + aVar.bottomMargin;
                if ((i4 & 8) != 0) {
                    m = C1404o.m3552m(childAt);
                } else if ((i4 & 2) != 0) {
                    m = measuredHeight - C1404o.m3552m(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && C1404o.m3548i(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = m + i5;
                i = Math.min(i, measuredHeight - getTopInset());
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f1139g = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.f1140h;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C0204a aVar = (C0204a) childAt.getLayoutParams();
            int measuredHeight = aVar.topMargin + aVar.bottomMargin + childAt.getMeasuredHeight();
            int i4 = aVar.f1161a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C1404o.m3552m(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f1140h = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f1146n;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int m = C1404o.m3552m(this);
        if (m == 0) {
            int childCount = getChildCount();
            m = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (m == 0) {
                return getHeight() / 3;
            }
        }
        return (m * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f1142j;
    }

    public Drawable getStatusBarForeground() {
        return this.f1150r;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f1138f;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C0204a aVar = (C0204a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = aVar.f1161a;
            if ((i4 & 1) == 0) {
                break;
            }
            int i5 = measuredHeight + aVar.topMargin + aVar.bottomMargin + i3;
            if (i2 == 0 && C1404o.m3548i(childAt)) {
                i5 -= getTopInset();
            }
            i3 = i5;
            if ((i4 & 2) != 0) {
                i3 -= C1404o.m3552m(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f1138f = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C3337g) {
            C2286e.m5230a((View) this, (C3337g) background);
        }
    }

    public int[] onCreateDrawableState(int i) {
        if (this.f1149q == null) {
            this.f1149q = new int[4];
        }
        int[] iArr = this.f1149q;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f1143k ? C3294b.state_liftable : -C3294b.state_liftable;
        iArr[1] = (!this.f1143k || !this.f1144l) ? -C3294b.state_lifted : C3294b.state_lifted;
        iArr[2] = this.f1143k ? C3294b.state_collapsible : -C3294b.state_collapsible;
        iArr[3] = (!this.f1143k || !this.f1144l) ? -C3294b.state_collapsed : C3294b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f1147o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f1147o = null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        boolean z3 = true;
        if (C1404o.m3548i(this) && mo1638a()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        this.f1138f = -1;
        this.f1139g = -1;
        this.f1140h = -1;
        this.f1141i = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C0204a) getChildAt(i5).getLayoutParams()).f1162b != null) {
                this.f1141i = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f1150r;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f1145m) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((C0204a) getChildAt(i6).getLayoutParams()).f1161a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    z2 = true;
                    break;
                }
                i6++;
            }
            if (!z2) {
                z3 = false;
            }
        }
        if (this.f1143k != z3) {
            this.f1143k = z3;
            refreshDrawableState();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C1404o.m3548i(this) && mo1638a()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C1061o.m2432a(getTopInset() + getMeasuredHeight(), 0, MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        this.f1138f = -1;
        this.f1139g = -1;
        this.f1140h = -1;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C2286e.m5229a((View) this, f);
    }

    public void setExpanded(boolean z) {
        mo1637a(z, C1404o.m3563x(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f1145m = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f1146n = i;
        WeakReference<View> weakReference = this.f1147o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f1147o = null;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f1150r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f1150r = drawable3;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f1150r.setState(getDrawableState());
                }
                this.f1150r.setLayoutDirection(C1404o.m3551l(this));
                this.f1150r.setVisible(getVisibility() == 0, false);
                this.f1150r.setCallback(this);
            }
            if (this.f1150r != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(true ^ z);
            C1404o.m3507B(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C1070a.m2602b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        int integer = getResources().getInteger(C3330g.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        String str = "elevation";
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, C3294b.state_liftable, -C3294b.state_lifted}, ObjectAnimator.ofFloat(this, str, new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(this, str, new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, str, new float[]{0.0f}).setDuration(0));
        setStateListAnimator(stateListAnimator);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1150r;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1150r;
    }

    /* renamed from: a */
    public boolean mo1640a(boolean z) {
        if (this.f1144l == z) {
            return false;
        }
        this.f1144l = z;
        refreshDrawableState();
        if (this.f1145m && (getBackground() instanceof C3337g)) {
            C3337g gVar = (C3337g) getBackground();
            float dimension = getResources().getDimension(C3318d.design_appbar_elevation);
            float f = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.f1148p;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, dimension});
            this.f1148p = ofFloat;
            ofFloat.setDuration((long) getResources().getInteger(C3330g.app_bar_elevation_anim_duration));
            this.f1148p.setInterpolator(C3407a.f8572a);
            this.f1148p.addUpdateListener(new C3417a(this, gVar));
            this.f1148p.start();
        }
        return true;
    }

    /* renamed from: generateDefaultLayoutParams reason: collision with other method in class */
    public LayoutParams m11849generateDefaultLayoutParams() {
        return new C0204a(-1, -2);
    }

    /* renamed from: generateLayoutParams reason: collision with other method in class */
    public LayoutParams m11850generateLayoutParams(AttributeSet attributeSet) {
        return new C0204a(getContext(), attributeSet);
    }

    /* renamed from: a */
    public boolean mo1639a(View view) {
        View view2 = null;
        if (this.f1147o == null) {
            int i = this.f1146n;
            if (i != -1) {
                View findViewById = view != null ? view.findViewById(i) : null;
                if (findViewById == null && (getParent() instanceof ViewGroup)) {
                    findViewById = ((ViewGroup) getParent()).findViewById(this.f1146n);
                }
                if (findViewById != null) {
                    this.f1147o = new WeakReference<>(findViewById);
                }
            }
        }
        WeakReference<View> weakReference = this.f1147o;
        if (weakReference != null) {
            view2 = (View) weakReference.get();
        }
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }
}
