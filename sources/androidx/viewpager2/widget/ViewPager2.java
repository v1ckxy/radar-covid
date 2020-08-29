package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0099a0;
import androidx.recyclerview.widget.RecyclerView.C0108g;
import androidx.recyclerview.widget.RecyclerView.C0111i;
import androidx.recyclerview.widget.RecyclerView.C0114l;
import androidx.recyclerview.widget.RecyclerView.C0120o;
import androidx.recyclerview.widget.RecyclerView.C0132v;
import p124p.p150h.p162l.C1404o;
import p124p.p150h.p162l.p163y.C1429b;
import p124p.p150h.p162l.p163y.C1429b.C1430a;
import p124p.p150h.p162l.p163y.C1429b.C1431b;
import p124p.p150h.p162l.p163y.C1429b.C1432c;
import p124p.p150h.p162l.p163y.C1436d;
import p124p.p150h.p162l.p163y.C1436d.C1437a;
import p124p.p180p.p181d.C1607u;
import p124p.p196x.C1768a;
import p124p.p196x.p197b.C1775g;
import p124p.p196x.p198c.C1778c;
import p124p.p196x.p198c.C1779d;
import p124p.p196x.p198c.C1780e;
import p124p.p196x.p198c.C1781f;
import p124p.p196x.p198c.C1781f.C1782a;
import p124p.p196x.p198c.C1783g;

public final class ViewPager2 extends ViewGroup {

    /* renamed from: e */
    public final Rect f940e = new Rect();

    /* renamed from: f */
    public final Rect f941f = new Rect();

    /* renamed from: g */
    public C1778c f942g = new C1778c(3);

    /* renamed from: h */
    public int f943h;

    /* renamed from: i */
    public boolean f944i = false;

    /* renamed from: j */
    public C0111i f945j = new C0160a();

    /* renamed from: k */
    public LinearLayoutManager f946k;

    /* renamed from: l */
    public int f947l = -1;

    /* renamed from: m */
    public Parcelable f948m;

    /* renamed from: n */
    public RecyclerView f949n;

    /* renamed from: o */
    public C1607u f950o;

    /* renamed from: p */
    public C1781f f951p;

    /* renamed from: q */
    public C1778c f952q;

    /* renamed from: r */
    public C1779d f953r;

    /* renamed from: s */
    public C1780e f954s;

    /* renamed from: t */
    public C0114l f955t = null;

    /* renamed from: u */
    public boolean f956u = false;

    /* renamed from: v */
    public boolean f957v = true;

    /* renamed from: w */
    public int f958w = -1;

    /* renamed from: x */
    public C0163d f959x;

    /* renamed from: androidx.viewpager2.widget.ViewPager2$a */
    public class C0160a extends C0164e {
        public C0160a() {
            super(null);
        }

        /* renamed from: a */
        public void mo1184a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f944i = true;
            viewPager2.f951p.f5217l = true;
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$b */
    public class C0161b extends C0166g {
        public C0161b() {
        }

        /* renamed from: a */
        public void mo1406a(int i) {
            if (i == 0) {
                ViewPager2.this.mo1380c();
            }
        }

        /* renamed from: b */
        public void mo1407b(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f943h != i) {
                viewPager2.f943h = i;
                viewPager2.f959x.mo1425g();
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$c */
    public class C0162c extends C0166g {
        public C0162c() {
        }

        /* renamed from: b */
        public void mo1407b(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f949n.requestFocus(2);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$d */
    public abstract class C0163d {
        public /* synthetic */ C0163d(ViewPager2 viewPager2, C0160a aVar) {
        }

        /* renamed from: a */
        public abstract void mo1408a(View view, C1429b bVar);

        /* renamed from: a */
        public abstract void mo1409a(AccessibilityEvent accessibilityEvent);

        /* renamed from: a */
        public abstract void mo1410a(AccessibilityNodeInfo accessibilityNodeInfo);

        /* renamed from: a */
        public abstract void mo1411a(C0108g<?> gVar);

        /* renamed from: a */
        public void mo1412a(C1429b bVar) {
        }

        /* renamed from: a */
        public abstract void mo1413a(C1778c cVar, RecyclerView recyclerView);

        /* renamed from: a */
        public abstract boolean mo1414a();

        /* renamed from: a */
        public boolean mo1415a(int i) {
            return false;
        }

        /* renamed from: a */
        public abstract boolean mo1416a(int i, Bundle bundle);

        /* renamed from: b */
        public abstract void mo1417b(C0108g<?> gVar);

        /* renamed from: b */
        public boolean mo1418b() {
            return false;
        }

        /* renamed from: b */
        public boolean mo1419b(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: b */
        public abstract boolean mo1420b(int i, Bundle bundle);

        /* renamed from: c */
        public abstract String mo1421c();

        /* renamed from: d */
        public abstract void mo1422d();

        /* renamed from: e */
        public CharSequence mo1423e() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: f */
        public abstract void mo1424f();

        /* renamed from: g */
        public abstract void mo1425g();

        /* renamed from: h */
        public abstract void mo1426h();

        /* renamed from: i */
        public abstract void mo1427i();
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$e */
    public static abstract class C0164e extends C0111i {
        public /* synthetic */ C0164e(C0160a aVar) {
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$f */
    public class C0165f extends LinearLayoutManager {
        public C0165f(Context context) {
            super(1, false);
        }

        /* renamed from: a */
        public void mo895a(C0099a0 a0Var, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.mo895a(a0Var, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        /* renamed from: a */
        public void mo855a(C0132v vVar, C0099a0 a0Var, View view, C1429b bVar) {
            ViewPager2.this.f959x.mo1408a(view, bVar);
        }

        /* renamed from: a */
        public void mo1208a(C0132v vVar, C0099a0 a0Var, C1429b bVar) {
            super.mo1208a(vVar, a0Var, bVar);
            ViewPager2.this.f959x.mo1412a(bVar);
        }

        /* renamed from: a */
        public boolean mo1211a(C0132v vVar, C0099a0 a0Var, int i, Bundle bundle) {
            return ViewPager2.this.f959x.mo1415a(i) ? ViewPager2.this.f959x.mo1419b(i) : super.mo1211a(vVar, a0Var, i, bundle);
        }

        /* renamed from: a */
        public boolean mo1212a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$g */
    public static abstract class C0166g {
        /* renamed from: a */
        public void mo1406a(int i) {
        }

        /* renamed from: a */
        public void mo1428a(int i, float f, int i2) {
        }

        /* renamed from: b */
        public void mo1407b(int i) {
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$h */
    public class C0167h extends C0163d {

        /* renamed from: a */
        public final C1436d f964a = new C0168a();

        /* renamed from: b */
        public final C1436d f965b = new C0169b();

        /* renamed from: c */
        public C0111i f966c;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$h$a */
        public class C0168a implements C1436d {
            public C0168a() {
            }

            /* renamed from: a */
            public boolean mo1431a(View view, C1437a aVar) {
                C0167h.this.mo1429c(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$h$b */
        public class C0169b implements C1436d {
            public C0169b() {
            }

            /* renamed from: a */
            public boolean mo1431a(View view, C1437a aVar) {
                C0167h.this.mo1429c(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$h$c */
        public class C0170c extends C0164e {
            public C0170c() {
                super(null);
            }

            /* renamed from: a */
            public void mo1184a() {
                C0167h.this.mo1430j();
            }
        }

        public C0167h() {
            super(ViewPager2.this, null);
        }

        /* renamed from: a */
        public void mo1409a(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        /* renamed from: a */
        public void mo1411a(C0108g<?> gVar) {
            mo1430j();
            if (gVar != null) {
                gVar.f778a.registerObserver(this.f966c);
            }
        }

        /* renamed from: a */
        public boolean mo1414a() {
            return true;
        }

        /* renamed from: a */
        public boolean mo1416a(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        /* renamed from: b */
        public void mo1417b(C0108g<?> gVar) {
            if (gVar != null) {
                gVar.f778a.unregisterObserver(this.f966c);
            }
        }

        /* renamed from: b */
        public boolean mo1420b(int i, Bundle bundle) {
            if (i == 8192 || i == 4096) {
                mo1429c(i == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
                return true;
            }
            throw new IllegalStateException();
        }

        /* renamed from: c */
        public String mo1421c() {
            return "androidx.viewpager.widget.ViewPager";
        }

        /* renamed from: c */
        public void mo1429c(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f957v) {
                viewPager2.mo1379b(i, true);
            }
        }

        /* renamed from: d */
        public void mo1422d() {
            mo1430j();
        }

        /* renamed from: f */
        public void mo1424f() {
            mo1430j();
        }

        /* renamed from: g */
        public void mo1425g() {
            mo1430j();
        }

        /* renamed from: h */
        public void mo1426h() {
            mo1430j();
        }

        /* renamed from: i */
        public void mo1427i() {
            mo1430j();
        }

        /* renamed from: j */
        public void mo1430j() {
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = 16908360;
            C1404o.m3541d(viewPager2, 16908360);
            C1404o.m3541d(viewPager2, 16908361);
            C1404o.m3541d(viewPager2, 16908358);
            C1404o.m3541d(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() != null) {
                int b = ViewPager2.this.getAdapter().mo1178b();
                if (b != 0) {
                    ViewPager2 viewPager22 = ViewPager2.this;
                    if (viewPager22.f957v) {
                        if (viewPager22.getOrientation() == 0) {
                            boolean a = ViewPager2.this.mo1377a();
                            int i2 = a ? 16908360 : 16908361;
                            if (a) {
                                i = 16908361;
                            }
                            if (ViewPager2.this.f943h < b - 1) {
                                C1404o.m3529a(viewPager2, new C1430a(i2, null), null, this.f964a);
                            }
                            if (ViewPager2.this.f943h > 0) {
                                C1404o.m3529a(viewPager2, new C1430a(i, null), null, this.f965b);
                            }
                        } else {
                            if (ViewPager2.this.f943h < b - 1) {
                                C1404o.m3529a(viewPager2, new C1430a(16908359, null), null, this.f964a);
                            }
                            if (ViewPager2.this.f943h > 0) {
                                C1404o.m3529a(viewPager2, new C1430a(16908358, null), null, this.f965b);
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo1413a(C1778c cVar, RecyclerView recyclerView) {
            C1404o.m3545f(recyclerView, 2);
            this.f966c = new C0170c();
            if (ViewPager2.this.getImportantForAccessibility() == 0) {
                ViewPager2.this.setImportantForAccessibility(1);
            }
        }

        /* renamed from: a */
        public void mo1410a(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            int i2;
            C1429b bVar = new C1429b(accessibilityNodeInfo);
            if (ViewPager2.this.getAdapter() == null) {
                i = 0;
                i2 = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                i = ViewPager2.this.getAdapter().mo1178b();
                i2 = 1;
            } else {
                i2 = ViewPager2.this.getAdapter().mo1178b();
                i = 1;
            }
            bVar.mo5946a((Object) new C1431b(CollectionInfo.obtain(i, i2, false, 0)));
            C0108g adapter = ViewPager2.this.getAdapter();
            if (adapter != null) {
                int b = adapter.mo1178b();
                if (b != 0) {
                    ViewPager2 viewPager2 = ViewPager2.this;
                    if (viewPager2.f957v) {
                        if (viewPager2.f943h > 0) {
                            bVar.f4203a.addAction(8192);
                        }
                        if (ViewPager2.this.f943h < b - 1) {
                            bVar.f4203a.addAction(4096);
                        }
                        bVar.f4203a.setScrollable(true);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo1408a(View view, C1429b bVar) {
            int i = 0;
            int i2 = ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.f946k.mo1237i(view) : 0;
            if (ViewPager2.this.getOrientation() == 0) {
                i = ViewPager2.this.f946k.mo1237i(view);
            }
            bVar.mo5949b((Object) C1432c.m3642a(i2, 1, i, 1, false, false));
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$i */
    public interface C0171i {
        /* renamed from: a */
        void mo1432a(View view, float f);
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$j */
    public class C0172j extends C1607u {
        public C0172j() {
        }

        /* renamed from: b */
        public View mo1433b(C0120o oVar) {
            if (ViewPager2.this.f953r.f5203a.f5218m) {
                return null;
            }
            return super.mo1433b(oVar);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$k */
    public class C0173k extends RecyclerView {
        public C0173k(Context context) {
            super(context);
        }

        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f959x.mo1418b() ? ViewPager2.this.f959x.mo1423e() : super.getAccessibilityClassName();
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f943h);
            accessibilityEvent.setToIndex(ViewPager2.this.f943h);
            ViewPager2.this.f959x.mo1409a(accessibilityEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f957v && super.onInterceptTouchEvent(motionEvent);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f957v && super.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$l */
    public static class C0174l extends BaseSavedState {
        public static final Creator<C0174l> CREATOR = new C0175a();

        /* renamed from: e */
        public int f973e;

        /* renamed from: f */
        public int f974f;

        /* renamed from: g */
        public Parcelable f975g;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$l$a */
        public class C0175a implements ClassLoaderCreator<C0174l> {
            public Object createFromParcel(Parcel parcel) {
                return VERSION.SDK_INT >= 24 ? new C0174l(parcel, null) : new C0174l(parcel);
            }

            public Object[] newArray(int i) {
                return new C0174l[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return VERSION.SDK_INT >= 24 ? new C0174l(parcel, classLoader) : new C0174l(parcel);
            }
        }

        public C0174l(Parcel parcel) {
            super(parcel);
            this.f973e = parcel.readInt();
            this.f974f = parcel.readInt();
            this.f975g = parcel.readParcelable(null);
        }

        public C0174l(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f973e);
            parcel.writeInt(this.f974f);
            parcel.writeParcelable(this.f975g, i);
        }

        public C0174l(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f973e = parcel.readInt();
            this.f974f = parcel.readInt();
            this.f975g = parcel.readParcelable(classLoader);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$m */
    public static class C0176m implements Runnable {

        /* renamed from: e */
        public final int f976e;

        /* renamed from: f */
        public final RecyclerView f977f;

        public C0176m(int i, RecyclerView recyclerView) {
            this.f976e = i;
            this.f977f = recyclerView;
        }

        public void run() {
            this.f977f.smoothScrollToPosition(this.f976e);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        mo1376a(context, (AttributeSet) null);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo1376a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo1376a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo1376a(context, attributeSet);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo1376a(Context context, AttributeSet attributeSet) {
        this.f959x = new C0167h();
        C0173k kVar = new C0173k(context);
        this.f949n = kVar;
        kVar.setId(C1404o.m3510a());
        this.f949n.setDescendantFocusability(131072);
        C0165f fVar = new C0165f(context);
        this.f946k = fVar;
        this.f949n.setLayoutManager(fVar);
        this.f949n.setScrollingTouchSlop(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1768a.ViewPager2);
        C1404o.m3518a(this, context, C1768a.ViewPager2, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(C1768a.ViewPager2_android_orientation, 0));
            obtainStyledAttributes.recycle();
            this.f949n.setLayoutParams(new LayoutParams(-1, -1));
            this.f949n.addOnChildAttachStateChangeListener(new C1783g(this));
            C1781f fVar2 = new C1781f(this);
            this.f951p = fVar2;
            this.f953r = new C1779d(this, fVar2, this.f949n);
            C0172j jVar = new C0172j();
            this.f950o = jVar;
            jVar.mo6376a(this.f949n);
            this.f949n.addOnScrollListener(this.f951p);
            C1778c cVar = new C1778c(3);
            this.f952q = cVar;
            this.f951p.f5206a = cVar;
            C0161b bVar = new C0161b();
            C0162c cVar2 = new C0162c();
            this.f952q.f5202a.add(bVar);
            this.f952q.f5202a.add(cVar2);
            this.f959x.mo1413a(this.f952q, this.f949n);
            C1778c cVar3 = this.f952q;
            cVar3.f5202a.add(this.f942g);
            C1780e eVar = new C1780e(this.f946k);
            this.f954s = eVar;
            this.f952q.f5202a.add(eVar);
            RecyclerView recyclerView = this.f949n;
            attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    public boolean mo1377a() {
        return this.f946k.mo1231g() == 1;
    }

    /* renamed from: b */
    public final void mo1378b() {
        if (this.f947l != -1) {
            C0108g adapter = getAdapter();
            if (adapter != null) {
                Parcelable parcelable = this.f948m;
                if (parcelable != null) {
                    if (adapter instanceof C1775g) {
                        ((C1775g) adapter).mo1359a(parcelable);
                    }
                    this.f948m = null;
                }
                int max = Math.max(0, Math.min(this.f947l, adapter.mo1178b() - 1));
                this.f943h = max;
                this.f947l = -1;
                this.f949n.scrollToPosition(max);
                this.f959x.mo1422d();
            }
        }
    }

    /* renamed from: b */
    public void mo1379b(int i, boolean z) {
        C0108g adapter = getAdapter();
        boolean z2 = false;
        if (adapter == null) {
            if (this.f947l != -1) {
                this.f947l = Math.max(i, 0);
            }
        } else if (adapter.mo1178b() > 0) {
            int min = Math.min(Math.max(i, 0), adapter.mo1178b() - 1);
            if (min == this.f943h) {
                if (this.f951p.f5211f == 0) {
                    return;
                }
            }
            if (min != this.f943h || !z) {
                double d = (double) this.f943h;
                this.f943h = min;
                this.f959x.mo1425g();
                if (!(this.f951p.f5211f == 0)) {
                    C1781f fVar = this.f951p;
                    fVar.mo6761b();
                    C1782a aVar = fVar.f5212g;
                    d = ((double) aVar.f5219a) + ((double) aVar.f5220b);
                }
                C1781f fVar2 = this.f951p;
                fVar2.f5210e = z ? 2 : 3;
                fVar2.f5218m = false;
                if (fVar2.f5214i != min) {
                    z2 = true;
                }
                fVar2.f5214i = min;
                fVar2.mo6762b(2);
                if (z2) {
                    C0166g gVar = fVar2.f5206a;
                    if (gVar != null) {
                        gVar.mo1407b(min);
                    }
                }
                if (!z) {
                    this.f949n.scrollToPosition(min);
                    return;
                }
                double d2 = (double) min;
                if (Math.abs(d2 - d) > 3.0d) {
                    this.f949n.scrollToPosition(d2 > d ? min - 3 : min + 3);
                    RecyclerView recyclerView = this.f949n;
                    recyclerView.post(new C0176m(min, recyclerView));
                } else {
                    this.f949n.smoothScrollToPosition(min);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo1380c() {
        C1607u uVar = this.f950o;
        if (uVar != null) {
            View b = uVar.mo1433b(this.f946k);
            if (b != null) {
                int i = this.f946k.mo1237i(b);
                if (i != this.f943h && getScrollState() == 0) {
                    this.f952q.mo1407b(i);
                }
                this.f944i = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public boolean canScrollHorizontally(int i) {
        return this.f949n.canScrollHorizontally(i);
    }

    public boolean canScrollVertically(int i) {
        return this.f949n.canScrollVertically(i);
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof C0174l) {
            int i = ((C0174l) parcelable).f973e;
            sparseArray.put(this.f949n.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        mo1378b();
    }

    public CharSequence getAccessibilityClassName() {
        return this.f959x.mo1414a() ? this.f959x.mo1421c() : super.getAccessibilityClassName();
    }

    public C0108g getAdapter() {
        return this.f949n.getAdapter();
    }

    public int getCurrentItem() {
        return this.f943h;
    }

    public int getItemDecorationCount() {
        return this.f949n.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f958w;
    }

    public int getOrientation() {
        return this.f946k.f698s;
    }

    public int getPageSize() {
        int i;
        int i2;
        RecyclerView recyclerView = this.f949n;
        if (getOrientation() == 0) {
            i = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            i2 = recyclerView.getPaddingRight();
        } else {
            i = recyclerView.getHeight() - recyclerView.getPaddingTop();
            i2 = recyclerView.getPaddingBottom();
        }
        return i - i2;
    }

    public int getScrollState() {
        return this.f951p.f5211f;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f959x.mo1410a(accessibilityNodeInfo);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f949n.getMeasuredWidth();
        int measuredHeight = this.f949n.getMeasuredHeight();
        this.f940e.left = getPaddingLeft();
        this.f940e.right = (i3 - i) - getPaddingRight();
        this.f940e.top = getPaddingTop();
        this.f940e.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f940e, this.f941f);
        RecyclerView recyclerView = this.f949n;
        Rect rect = this.f941f;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f944i) {
            mo1380c();
        }
    }

    public void onMeasure(int i, int i2) {
        measureChild(this.f949n, i, i2);
        int measuredWidth = this.f949n.getMeasuredWidth();
        int measuredHeight = this.f949n.getMeasuredHeight();
        int measuredState = this.f949n.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), ViewGroup.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0174l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0174l lVar = (C0174l) parcelable;
        super.onRestoreInstanceState(lVar.getSuperState());
        this.f947l = lVar.f974f;
        this.f948m = lVar.f975g;
    }

    public Parcelable onSaveInstanceState() {
        C0174l lVar = new C0174l(super.onSaveInstanceState());
        lVar.f973e = this.f949n.getId();
        int i = this.f947l;
        if (i == -1) {
            i = this.f943h;
        }
        lVar.f974f = i;
        Parcelable parcelable = this.f948m;
        if (parcelable == null) {
            C0108g adapter = this.f949n.getAdapter();
            if (adapter instanceof C1775g) {
                parcelable = ((C1775g) adapter).mo1358a();
            }
            return lVar;
        }
        lVar.f975g = parcelable;
        return lVar;
    }

    public void onViewAdded(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append(ViewPager2.class.getSimpleName());
        sb.append(" does not support direct child views");
        throw new IllegalStateException(sb.toString());
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        return this.f959x.mo1416a(i, bundle) ? this.f959x.mo1420b(i, bundle) : super.performAccessibilityAction(i, bundle);
    }

    public void setAdapter(C0108g gVar) {
        C0108g adapter = this.f949n.getAdapter();
        this.f959x.mo1417b(adapter);
        if (adapter != null) {
            adapter.f778a.unregisterObserver(this.f945j);
        }
        this.f949n.setAdapter(gVar);
        this.f943h = 0;
        mo1378b();
        this.f959x.mo1411a(gVar);
        if (gVar != null) {
            gVar.f778a.registerObserver(this.f945j);
        }
    }

    public void setCurrentItem(int i) {
        mo1375a(i, true);
    }

    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f959x.mo1424f();
    }

    public void setOffscreenPageLimit(int i) {
        if (i >= 1 || i == -1) {
            this.f958w = i;
            this.f949n.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i) {
        this.f946k.mo918j(i);
        this.f959x.mo1426h();
    }

    public void setPageTransformer(C0171i iVar) {
        boolean z = this.f956u;
        if (iVar != null) {
            if (!z) {
                this.f955t = this.f949n.getItemAnimator();
                this.f956u = true;
            }
            this.f949n.setItemAnimator(null);
        } else if (z) {
            this.f949n.setItemAnimator(this.f955t);
            this.f955t = null;
            this.f956u = false;
        }
        C1780e eVar = this.f954s;
        if (iVar != eVar.f5205b) {
            eVar.f5205b = iVar;
            if (iVar != null) {
                C1781f fVar = this.f951p;
                fVar.mo6761b();
                C1782a aVar = fVar.f5212g;
                double d = ((double) aVar.f5219a) + ((double) aVar.f5220b);
                int i = (int) d;
                float f = (float) (d - ((double) i));
                this.f954s.mo1428a(i, f, Math.round(((float) getPageSize()) * f));
            }
        }
    }

    public void setUserInputEnabled(boolean z) {
        this.f957v = z;
        this.f959x.mo1427i();
    }

    /* renamed from: a */
    public void mo1375a(int i, boolean z) {
        if (!this.f953r.f5203a.f5218m) {
            mo1379b(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }
}
