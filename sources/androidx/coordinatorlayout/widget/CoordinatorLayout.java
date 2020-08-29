package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p116io.jsonwebtoken.lang.Strings;
import p124p.p148g.C1301a;
import p124p.p148g.C1302b;
import p124p.p148g.C1303c;
import p124p.p148g.p149d.C1304a;
import p124p.p148g.p149d.C1305b;
import p124p.p150h.p152e.C1325a;
import p124p.p150h.p161k.C1384d;
import p124p.p150h.p161k.C1385e;
import p124p.p150h.p162l.C1398i;
import p124p.p150h.p162l.C1399j;
import p124p.p150h.p162l.C1400k;
import p124p.p150h.p162l.C1401l;
import p124p.p150h.p162l.C1404o;
import p124p.p150h.p162l.C1419x;
import p124p.p167j.p168a.C1458a;
import p213q.p214a.p215a.p216a.C1965a;

public class CoordinatorLayout extends ViewGroup implements C1398i, C1399j {

    /* renamed from: A */
    public static final Comparator<View> f493A = new C0075i();

    /* renamed from: B */
    public static final C1384d<Rect> f494B = new C1385e(12);

    /* renamed from: x */
    public static final String f495x;

    /* renamed from: y */
    public static final Class<?>[] f496y = {Context.class, AttributeSet.class};

    /* renamed from: z */
    public static final ThreadLocal<Map<String, Constructor<C0068c>>> f497z = new ThreadLocal<>();

    /* renamed from: e */
    public final List<View> f498e;

    /* renamed from: f */
    public final C1304a<View> f499f;

    /* renamed from: g */
    public final List<View> f500g;

    /* renamed from: h */
    public final List<View> f501h;

    /* renamed from: i */
    public final int[] f502i;

    /* renamed from: j */
    public final int[] f503j;

    /* renamed from: k */
    public boolean f504k;

    /* renamed from: l */
    public boolean f505l;

    /* renamed from: m */
    public int[] f506m;

    /* renamed from: n */
    public View f507n;

    /* renamed from: o */
    public View f508o;

    /* renamed from: p */
    public C0072g f509p;

    /* renamed from: q */
    public boolean f510q;

    /* renamed from: r */
    public C1419x f511r;

    /* renamed from: s */
    public boolean f512s;

    /* renamed from: t */
    public Drawable f513t;

    /* renamed from: u */
    public OnHierarchyChangeListener f514u;

    /* renamed from: v */
    public C1401l f515v;

    /* renamed from: w */
    public final C1400k f516w;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public class C0066a implements C1401l {
        public C0066a() {
        }

        /* renamed from: a */
        public C1419x mo648a(View view, C1419x xVar) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.f511r, xVar)) {
                coordinatorLayout.f511r = xVar;
                boolean z = true;
                boolean z2 = xVar != null && xVar.mo5924d() > 0;
                coordinatorLayout.f512s = z2;
                if (z2 || coordinatorLayout.getBackground() != null) {
                    z = false;
                }
                coordinatorLayout.setWillNotDraw(z);
                if (!xVar.f4187a.mo5936g()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        if (C1404o.m3548i(childAt) && ((C0071f) childAt.getLayoutParams()).f519a != null && xVar.f4187a.mo5936g()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return xVar;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C0067b {
        C0068c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class C0068c<V extends View> {
        public C0068c() {
        }

        public C0068c(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: a */
        public Parcelable mo650a(CoordinatorLayout coordinatorLayout, V v) {
            return BaseSavedState.EMPTY_STATE;
        }

        /* renamed from: a */
        public void mo651a() {
        }

        /* renamed from: a */
        public void mo652a(C0071f fVar) {
        }

        /* renamed from: a */
        public void mo653a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo654a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        }

        @Deprecated
        /* renamed from: a */
        public void mo655a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        public void mo656a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            if (i5 == 0) {
                mo655a(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: a */
        public void mo657a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        }

        /* renamed from: a */
        public boolean mo658a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo659a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: a */
        public boolean mo660a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: a */
        public boolean mo661a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: a */
        public boolean mo662a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo663a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: a */
        public boolean mo664a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        /* renamed from: a */
        public boolean mo665a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo666a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo665a(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo667b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean mo668b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface C0069d {
        Class<? extends C0068c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public class C0070e implements OnHierarchyChangeListener {
        public C0070e() {
        }

        public void onChildViewAdded(View view, View view2) {
            OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f514u;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo606b(2);
            OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f514u;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0071f extends MarginLayoutParams {

        /* renamed from: a */
        public C0068c f519a;

        /* renamed from: b */
        public boolean f520b = false;

        /* renamed from: c */
        public int f521c = 0;

        /* renamed from: d */
        public int f522d = 0;

        /* renamed from: e */
        public int f523e = -1;

        /* renamed from: f */
        public int f524f = -1;

        /* renamed from: g */
        public int f525g = 0;

        /* renamed from: h */
        public int f526h = 0;

        /* renamed from: i */
        public int f527i;

        /* renamed from: j */
        public int f528j;

        /* renamed from: k */
        public View f529k;

        /* renamed from: l */
        public View f530l;

        /* renamed from: m */
        public boolean f531m;

        /* renamed from: n */
        public boolean f532n;

        /* renamed from: o */
        public boolean f533o;

        /* renamed from: p */
        public boolean f534p;

        /* renamed from: q */
        public final Rect f535q = new Rect();

        public C0071f(int i, int i2) {
            super(i, i2);
        }

        public C0071f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1303c.CoordinatorLayout_Layout);
            this.f521c = obtainStyledAttributes.getInteger(C1303c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f524f = obtainStyledAttributes.getResourceId(C1303c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f522d = obtainStyledAttributes.getInteger(C1303c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f523e = obtainStyledAttributes.getInteger(C1303c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f525g = obtainStyledAttributes.getInt(C1303c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f526h = obtainStyledAttributes.getInt(C1303c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(C1303c.CoordinatorLayout_Layout_layout_behavior);
            this.f520b = hasValue;
            if (hasValue) {
                this.f519a = CoordinatorLayout.m174a(context, attributeSet, obtainStyledAttributes.getString(C1303c.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            C0068c cVar = this.f519a;
            if (cVar != null) {
                cVar.mo652a(this);
            }
        }

        public C0071f(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0071f(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0071f(C0071f fVar) {
            super(fVar);
        }

        /* renamed from: a */
        public void mo672a(int i, boolean z) {
            if (i == 0) {
                this.f532n = z;
            } else if (i == 1) {
                this.f533o = z;
            }
        }

        /* renamed from: a */
        public boolean mo673a(int i) {
            if (i == 0) {
                return this.f532n;
            }
            if (i != 1) {
                return false;
            }
            return this.f533o;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    public class C0072g implements OnPreDrawListener {
        public C0072g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo606b(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    public static class C0073h extends C1458a {
        public static final Creator<C0073h> CREATOR = new C0074a();

        /* renamed from: g */
        public SparseArray<Parcelable> f537g;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        public static class C0074a implements ClassLoaderCreator<C0073h> {
            public Object createFromParcel(Parcel parcel) {
                return new C0073h(parcel, null);
            }

            public Object[] newArray(int i) {
                return new C0073h[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0073h(parcel, classLoader);
            }
        }

        public C0073h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f537g = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f537g.append(iArr[i], readParcelableArray[i]);
            }
        }

        public C0073h(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f4274e, i);
            SparseArray<Parcelable> sparseArray = this.f537g;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f537g.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.f537g.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    public static class C0075i implements Comparator<View> {
        public int compare(Object obj, Object obj2) {
            View view = (View) obj2;
            float s = C1404o.m3558s((View) obj);
            float z = view.getZ();
            if (s > z) {
                return -1;
            }
            return s < z ? 1 : 0;
        }
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        f495x = packageR != null ? packageR.getName() : null;
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1301a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f498e = new ArrayList();
        this.f499f = new C1304a<>();
        this.f500g = new ArrayList();
        this.f501h = new ArrayList();
        this.f502i = new int[2];
        this.f503j = new int[2];
        this.f516w = new C1400k();
        int[] iArr = C1303c.CoordinatorLayout;
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, C1302b.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (VERSION.SDK_INT >= 29) {
            int[] iArr2 = C1303c.CoordinatorLayout;
            if (i == 0) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, 0, C1302b.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(C1303c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f506m = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f506m.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr3 = this.f506m;
                iArr3[i2] = (int) (((float) iArr3[i2]) * f);
            }
        }
        this.f513t = obtainStyledAttributes.getDrawable(C1303c.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        mo605b();
        super.setOnHierarchyChangeListener(new C0070e());
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: a */
    public static C0068c m174a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(Strings.CURRENT_PATH)) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            str = sb.toString();
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f495x)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f495x);
            sb2.append('.');
            sb2.append(str);
            str = sb2.toString();
        }
        try {
            Map map = (Map) f497z.get();
            if (map == null) {
                map = new HashMap();
                f497z.set(map);
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f496y);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (C0068c) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            throw new RuntimeException(C1965a.m4751a("Could not inflate Behavior subclass ", str), e);
        }
    }

    /* renamed from: a */
    public static void m175a(Rect rect) {
        rect.setEmpty();
        f494B.mo5865a(rect);
    }

    /* renamed from: c */
    public static Rect m176c() {
        Rect rect = (Rect) f494B.mo5864a();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: a */
    public final int mo594a(int i) {
        StringBuilder sb;
        int[] iArr = this.f506m;
        String str = "CoordinatorLayout";
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e(str, sb.toString());
        return 0;
    }

    /* renamed from: a */
    public void mo598a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo122a(View view, int i, int i2, int i3, int i4, int i5) {
        mo123a(view, i, i2, i3, i4, 0, this.f503j);
    }

    /* renamed from: a */
    public void mo599a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
            return;
        }
        if (z) {
            C1305b.m3354a((ViewGroup) this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: a */
    public final void mo600a(C0071f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - fVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: b */
    public List<View> mo604b(View view) {
        List list = (List) this.f499f.f3932b.getOrDefault(view, null);
        this.f501h.clear();
        if (list != null) {
            this.f501h.addAll(list);
        }
        return this.f501h;
    }

    /* renamed from: b */
    public final void mo605b() {
        if (C1404o.m3548i(this)) {
            if (this.f515v == null) {
                this.f515v = new C0066a();
            }
            C1404o.m3527a((View) this, this.f515v);
            setSystemUiVisibility(1280);
            return;
        }
        C1404o.m3527a((View) this, (C1401l) null);
    }

    /* renamed from: c */
    public C0071f mo608c(View view) {
        C0071f fVar = (C0071f) view.getLayoutParams();
        if (!fVar.f520b) {
            String str = "CoordinatorLayout";
            if (view instanceof C0067b) {
                C0068c behavior = ((C0067b) view).getBehavior();
                if (behavior == null) {
                    Log.e(str, "Attached behavior class is null");
                }
                C0068c cVar = fVar.f519a;
                if (cVar != behavior) {
                    if (cVar != null) {
                        cVar.mo651a();
                    }
                    fVar.f519a = behavior;
                    fVar.f520b = true;
                    if (behavior != null) {
                        behavior.mo652a(fVar);
                    }
                }
            } else {
                C0069d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (C0069d) cls.getAnnotation(C0069d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        C0068c cVar2 = (C0068c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        C0068c cVar3 = fVar.f519a;
                        if (cVar3 != cVar2) {
                            if (cVar3 != null) {
                                cVar3.mo651a();
                            }
                            fVar.f519a = cVar2;
                            fVar.f520b = true;
                            if (cVar2 != null) {
                                cVar2.mo652a(fVar);
                            }
                        }
                    } catch (Exception e) {
                        StringBuilder a = C1965a.m4756a("Default behavior class ");
                        a.append(dVar.value().getName());
                        a.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e(str, a.toString(), e);
                    }
                }
            }
            fVar.f520b = true;
        }
        return fVar;
    }

    /* renamed from: c */
    public final void mo609c(View view, int i) {
        C0071f fVar = (C0071f) view.getLayoutParams();
        int i2 = fVar.f527i;
        if (i2 != i) {
            C1404o.m3535b(view, i - i2);
            fVar.f527i = i;
        }
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0071f) && super.checkLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public final void mo611d(View view, int i) {
        C0071f fVar = (C0071f) view.getLayoutParams();
        int i2 = fVar.f528j;
        if (i2 != i) {
            C1404o.m3539c(view, i - i2);
            fVar.f528j = i;
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        C0068c cVar = ((C0071f) view.getLayoutParams()).f519a;
        return super.drawChild(canvas, view, j);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f513t;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new C0071f(-2, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0071f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        mo596a();
        return Collections.unmodifiableList(this.f498e);
    }

    public final C1419x getLastWindowInsets() {
        return this.f511r;
    }

    public int getNestedScrollAxes() {
        return this.f516w.mo5895a();
    }

    public Drawable getStatusBarBackground() {
        return this.f513t;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo601a(false);
        if (this.f510q) {
            if (this.f509p == null) {
                this.f509p = new C0072g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f509p);
        }
        if (this.f511r == null && C1404o.m3548i(this)) {
            requestApplyInsets();
        }
        this.f505l = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo601a(false);
        if (this.f510q && this.f509p != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f509p);
        }
        View view = this.f508o;
        if (view != null) {
            mo121a(view, 0);
        }
        this.f505l = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f512s && this.f513t != null) {
            C1419x xVar = this.f511r;
            int d = xVar != null ? xVar.mo5924d() : 0;
            if (d > 0) {
                this.f513t.setBounds(0, 0, getWidth(), d);
                this.f513t.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            mo601a(true);
        }
        boolean a = mo602a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            mo601a(true);
        }
        return a;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int l = C1404o.m3551l(this);
        int size = this.f498e.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f498e.get(i5);
            if (view.getVisibility() != 8) {
                C0068c cVar = ((C0071f) view.getLayoutParams()).f519a;
                if (cVar == null || !cVar.mo658a(this, view, l)) {
                    mo607b(view, l);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x017e, code lost:
        if (r0.mo659a(r30, r20, r8, r21, r23, 0) == false) goto L_0x018e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0181  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.mo596a()
            int r0 = r30.getChildCount()
            r8 = 0
            r1 = r8
        L_0x000b:
            r2 = 1
            if (r1 >= r0) goto L_0x0038
            android.view.View r3 = r7.getChildAt(r1)
            p.g.d.a<android.view.View> r4 = r7.f499f
            p.e.h<T, java.util.ArrayList<T>> r5 = r4.f3932b
            int r5 = r5.f3589g
            r6 = r8
        L_0x0019:
            if (r6 >= r5) goto L_0x0030
            p.e.h<T, java.util.ArrayList<T>> r9 = r4.f3932b
            java.lang.Object r9 = r9.mo5598e(r6)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x002d
            boolean r9 = r9.contains(r3)
            if (r9 == 0) goto L_0x002d
            r3 = r2
            goto L_0x0031
        L_0x002d:
            int r6 = r6 + 1
            goto L_0x0019
        L_0x0030:
            r3 = r8
        L_0x0031:
            if (r3 == 0) goto L_0x0035
            r0 = r2
            goto L_0x0039
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x0038:
            r0 = r8
        L_0x0039:
            boolean r1 = r7.f510q
            if (r0 == r1) goto L_0x006d
            if (r0 == 0) goto L_0x005a
            boolean r0 = r7.f505l
            if (r0 == 0) goto L_0x0057
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r7.f509p
            if (r0 != 0) goto L_0x004e
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>()
            r7.f509p = r0
        L_0x004e:
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r7.f509p
            r0.addOnPreDrawListener(r1)
        L_0x0057:
            r7.f510q = r2
            goto L_0x006d
        L_0x005a:
            boolean r0 = r7.f505l
            if (r0 == 0) goto L_0x006b
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r7.f509p
            if (r0 == 0) goto L_0x006b
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r7.f509p
            r0.removeOnPreDrawListener(r1)
        L_0x006b:
            r7.f510q = r8
        L_0x006d:
            int r9 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r10 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r11 = p124p.p150h.p162l.C1404o.m3551l(r30)
            if (r11 != r2) goto L_0x0085
            r12 = r2
            goto L_0x0086
        L_0x0085:
            r12 = r8
        L_0x0086:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r9 + r10
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            p.h.l.x r3 = r7.f511r
            if (r3 == 0) goto L_0x00af
            boolean r3 = r30.getFitsSystemWindows()
            if (r3 == 0) goto L_0x00af
            r19 = r2
            goto L_0x00b1
        L_0x00af:
            r19 = r8
        L_0x00b1:
            java.util.List<android.view.View> r2 = r7.f498e
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = r8
            r3 = r2
        L_0x00bb:
            if (r3 >= r6) goto L_0x01d4
            java.util.List<android.view.View> r0 = r7.f498e
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x00d7
            r22 = r3
            r29 = r6
            r28 = r9
            goto L_0x01cb
        L_0x00d7:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0071f) r1
            int r0 = r1.f523e
            if (r0 < 0) goto L_0x0121
            if (r13 == 0) goto L_0x0121
            int r0 = r7.mo594a(r0)
            int r8 = r1.f521c
            if (r8 != 0) goto L_0x00ef
            r8 = 8388661(0x800035, float:1.1755018E-38)
        L_0x00ef:
            int r8 = android.view.Gravity.getAbsoluteGravity(r8, r11)
            r8 = r8 & 7
            r22 = r2
            r2 = 3
            if (r8 != r2) goto L_0x00fc
            if (r12 == 0) goto L_0x0101
        L_0x00fc:
            r2 = 5
            if (r8 != r2) goto L_0x010d
            if (r12 == 0) goto L_0x010d
        L_0x0101:
            int r2 = r14 - r10
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r8 = r0
            r21 = r2
            goto L_0x0125
        L_0x010d:
            if (r8 != r2) goto L_0x0111
            if (r12 == 0) goto L_0x0116
        L_0x0111:
            r2 = 3
            if (r8 != r2) goto L_0x011f
            if (r12 == 0) goto L_0x011f
        L_0x0116:
            int r0 = r0 - r9
            r8 = 0
            int r0 = java.lang.Math.max(r8, r0)
            r21 = r0
            goto L_0x0125
        L_0x011f:
            r8 = 0
            goto L_0x0123
        L_0x0121:
            r22 = r2
        L_0x0123:
            r21 = r8
        L_0x0125:
            if (r19 == 0) goto L_0x0157
            boolean r0 = r20.getFitsSystemWindows()
            if (r0 != 0) goto L_0x0157
            p.h.l.x r0 = r7.f511r
            int r0 = r0.mo5922b()
            p.h.l.x r2 = r7.f511r
            int r2 = r2.mo5923c()
            int r2 = r2 + r0
            p.h.l.x r0 = r7.f511r
            int r0 = r0.mo5924d()
            p.h.l.x r8 = r7.f511r
            int r8 = r8.mo5921a()
            int r8 = r8 + r0
            int r0 = r14 - r2
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r8
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r8 = r0
            r23 = r2
            goto L_0x015b
        L_0x0157:
            r8 = r31
            r23 = r32
        L_0x015b:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f519a
            if (r0 == 0) goto L_0x0181
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r8
            r27 = r4
            r4 = r21
            r28 = r9
            r9 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo659a(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x019b
            goto L_0x018e
        L_0x0181:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r9
            r25 = r22
            r22 = r3
            r9 = r5
        L_0x018e:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r8
            r3 = r21
            r4 = r23
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x019b:
            int r0 = r20.getMeasuredWidth()
            int r0 = r0 + r17
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r9, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r2 + r18
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r8 = r25
            int r2 = android.view.View.combineMeasuredStates(r8, r2)
            r5 = r0
            r4 = r1
        L_0x01cb:
            int r3 = r22 + 1
            r9 = r28
            r6 = r29
            r8 = 0
            goto L_0x00bb
        L_0x01d4:
            r8 = r2
            r1 = r4
            r9 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r8
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r9, r2, r0)
            int r2 = r8 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0071f fVar = (C0071f) childAt.getLayoutParams();
                if (fVar.mo673a(0)) {
                    C0068c cVar = fVar.f519a;
                }
            }
        }
        return false;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0071f fVar = (C0071f) childAt.getLayoutParams();
                if (fVar.mo673a(0)) {
                    C0068c cVar = fVar.f519a;
                    if (cVar != null) {
                        z |= cVar.mo664a(this, childAt, view, f, f2);
                    }
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo124a(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo123a(view, i, i2, i3, i4, 0, this.f503j);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo125a(view, view2, i, 0);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0073h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0073h hVar = (C0073h) parcelable;
        super.onRestoreInstanceState(hVar.f4274e);
        SparseArray<Parcelable> sparseArray = hVar.f537g;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0068c cVar = mo608c(childAt).f519a;
            if (!(id == -1 || cVar == null)) {
                Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                if (parcelable2 != null) {
                    cVar.mo653a(this, childAt, parcelable2);
                }
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        C0073h hVar = new C0073h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0068c cVar = ((C0071f) childAt.getLayoutParams()).f519a;
            if (!(id == -1 || cVar == null)) {
                Parcelable a = cVar.mo650a(this, childAt);
                if (a != null) {
                    sparseArray.append(id, a);
                }
            }
        }
        hVar.f537g = sparseArray;
        return hVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo129b(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo121a(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f507n
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.mo602a(r1, r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = r5
        L_0x0016:
            android.view.View r6 = r0.f507n
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0071f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f519a
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.f507n
            boolean r6 = r6.mo667b(r0, r7, r1)
            goto L_0x002a
        L_0x0029:
            r6 = r5
        L_0x002a:
            android.view.View r7 = r0.f507n
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.mo601a(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C0068c cVar = ((C0071f) view.getLayoutParams()).f519a;
        if (cVar == null || !cVar.mo661a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f504k) {
            mo601a(false);
            this.f504k = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        mo605b();
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f514u = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f513t;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f513t = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f513t.setState(getDrawableState());
                }
                this.f513t.setLayoutDirection(C1404o.m3551l(this));
                this.f513t.setVisible(getVisibility() == 0, false);
                this.f513t.setCallback(this);
            }
            C1404o.m3507B(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C1325a.m3377b(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f513t;
        if (drawable != null && drawable.isVisible() != z) {
            this.f513t.setVisible(z, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f513t;
    }

    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof C0071f) {
            return new C0071f((C0071f) layoutParams);
        }
        return layoutParams instanceof MarginLayoutParams ? new C0071f((MarginLayoutParams) layoutParams) : new C0071f(layoutParams);
    }

    /* renamed from: a */
    public List<View> mo595a(View view) {
        C1304a<View> aVar = this.f499f;
        int i = aVar.f3932b.f3589g;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) aVar.f3932b.mo5598e(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(aVar.f3932b.mo5593c(i2));
            }
        }
        this.f501h.clear();
        if (arrayList != null) {
            this.f501h.addAll(arrayList);
        }
        return this.f501h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0258  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo606b(int r25) {
        /*
            r24 = this;
            r7 = r24
            r8 = r25
            int r9 = p124p.p150h.p162l.C1404o.m3551l(r24)
            java.util.List<android.view.View> r0 = r7.f498e
            int r10 = r0.size()
            android.graphics.Rect r11 = m176c()
            android.graphics.Rect r12 = m176c()
            android.graphics.Rect r13 = m176c()
            r0 = 0
            r14 = r0
        L_0x001c:
            if (r14 >= r10) goto L_0x02c9
            java.util.List<android.view.View> r0 = r7.f498e
            java.lang.Object r0 = r0.get(r14)
            r15 = r0
            android.view.View r15 = (android.view.View) r15
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            r6 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0071f) r6
            if (r8 != 0) goto L_0x003e
            int r0 = r15.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x003e
            r1 = r10
            r2 = r13
            r19 = r14
            goto L_0x02c3
        L_0x003e:
            r0 = 0
            r5 = r0
        L_0x0040:
            if (r5 >= r14) goto L_0x00fb
            java.util.List<android.view.View> r0 = r7.f498e
            java.lang.Object r0 = r0.get(r5)
            android.view.View r0 = (android.view.View) r0
            android.view.View r1 = r6.f530l
            if (r1 != r0) goto L_0x00e7
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            r4 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0071f) r4
            android.view.View r0 = r4.f529k
            if (r0 == 0) goto L_0x00e7
            android.graphics.Rect r3 = m176c()
            android.graphics.Rect r2 = m176c()
            android.graphics.Rect r1 = m176c()
            android.view.View r0 = r4.f529k
            p124p.p148g.p149d.C1305b.m3354a(r7, r0, r3)
            r0 = 0
            r7.mo599a(r15, r0, r2)
            int r0 = r15.getMeasuredWidth()
            r16 = r10
            int r10 = r15.getMeasuredHeight()
            r17 = r0
            r0 = r24
            r18 = r1
            r1 = r9
            r19 = r14
            r14 = r2
            r2 = r3
            r20 = r3
            r3 = r18
            r21 = r4
            r22 = r5
            r5 = r17
            r23 = r13
            r13 = r6
            r6 = r10
            r0.mo597a(r1, r2, r3, r4, r5, r6)
            r0 = r18
            int r1 = r0.left
            int r2 = r14.left
            if (r1 != r2) goto L_0x00a5
            int r1 = r0.top
            int r2 = r14.top
            if (r1 == r2) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r1 = 0
            goto L_0x00a6
        L_0x00a5:
            r1 = 1
        L_0x00a6:
            r3 = r17
            r2 = r21
            r7.mo600a(r2, r0, r3, r10)
            int r3 = r0.left
            int r4 = r14.left
            int r3 = r3 - r4
            int r4 = r0.top
            int r5 = r14.top
            int r4 = r4 - r5
            if (r3 == 0) goto L_0x00bc
            r15.offsetLeftAndRight(r3)
        L_0x00bc:
            if (r4 == 0) goto L_0x00c1
            r15.offsetTopAndBottom(r4)
        L_0x00c1:
            if (r1 == 0) goto L_0x00cc
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r2.f519a
            if (r1 == 0) goto L_0x00cc
            android.view.View r2 = r2.f529k
            r1.mo668b(r7, r15, r2)
        L_0x00cc:
            r20.setEmpty()
            p.h.k.d<android.graphics.Rect> r1 = f494B
            r2 = r20
            r1.mo5865a(r2)
            r14.setEmpty()
            p.h.k.d<android.graphics.Rect> r1 = f494B
            r1.mo5865a(r14)
            r0.setEmpty()
            p.h.k.d<android.graphics.Rect> r1 = f494B
            r1.mo5865a(r0)
            goto L_0x00f0
        L_0x00e7:
            r22 = r5
            r16 = r10
            r23 = r13
            r19 = r14
            r13 = r6
        L_0x00f0:
            int r5 = r22 + 1
            r6 = r13
            r10 = r16
            r14 = r19
            r13 = r23
            goto L_0x0040
        L_0x00fb:
            r16 = r10
            r23 = r13
            r19 = r14
            r13 = r6
            r0 = 1
            r7.mo599a(r15, r0, r12)
            int r0 = r13.f525g
            r1 = 48
            r2 = 80
            r3 = 3
            r4 = 5
            if (r0 == 0) goto L_0x015e
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x015e
            int r0 = r13.f525g
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r9)
            r5 = r0 & 112(0x70, float:1.57E-43)
            if (r5 == r1) goto L_0x0133
            if (r5 == r2) goto L_0x0123
            goto L_0x013d
        L_0x0123:
            int r5 = r11.bottom
            int r6 = r24.getHeight()
            int r10 = r12.top
            int r6 = r6 - r10
            int r5 = java.lang.Math.max(r5, r6)
            r11.bottom = r5
            goto L_0x013d
        L_0x0133:
            int r5 = r11.top
            int r6 = r12.bottom
            int r5 = java.lang.Math.max(r5, r6)
            r11.top = r5
        L_0x013d:
            r0 = r0 & 7
            if (r0 == r3) goto L_0x0154
            if (r0 == r4) goto L_0x0144
            goto L_0x015e
        L_0x0144:
            int r0 = r11.right
            int r3 = r24.getWidth()
            int r4 = r12.left
            int r3 = r3 - r4
            int r0 = java.lang.Math.max(r0, r3)
            r11.right = r0
            goto L_0x015e
        L_0x0154:
            int r0 = r11.left
            int r3 = r12.right
            int r0 = java.lang.Math.max(r0, r3)
            r11.left = r0
        L_0x015e:
            int r0 = r13.f526h
            if (r0 == 0) goto L_0x0264
            int r0 = r15.getVisibility()
            if (r0 != 0) goto L_0x0264
            boolean r0 = r15.isLaidOut()
            if (r0 != 0) goto L_0x0170
            goto L_0x0264
        L_0x0170:
            int r0 = r15.getWidth()
            if (r0 <= 0) goto L_0x0264
            int r0 = r15.getHeight()
            if (r0 > 0) goto L_0x017e
            goto L_0x0264
        L_0x017e:
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0071f) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r3 = r0.f519a
            android.graphics.Rect r4 = m176c()
            android.graphics.Rect r5 = m176c()
            int r6 = r15.getLeft()
            int r10 = r15.getTop()
            int r13 = r15.getRight()
            int r14 = r15.getBottom()
            r5.set(r6, r10, r13, r14)
            if (r3 == 0) goto L_0x01d3
            boolean r3 = r3.mo660a(r7, r15, r4)
            if (r3 == 0) goto L_0x01d3
            boolean r3 = r5.contains(r4)
            if (r3 == 0) goto L_0x01b0
            goto L_0x01d6
        L_0x01b0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Rect should be within the child's bounds. Rect:"
            java.lang.StringBuilder r1 = p213q.p214a.p215a.p216a.C1965a.m4756a(r1)
            java.lang.String r2 = r4.toShortString()
            r1.append(r2)
            java.lang.String r2 = " | Bounds:"
            r1.append(r2)
            java.lang.String r2 = r5.toShortString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01d3:
            r4.set(r5)
        L_0x01d6:
            r5.setEmpty()
            p.h.k.d<android.graphics.Rect> r3 = f494B
            r3.mo5865a(r5)
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L_0x01e6
            goto L_0x025c
        L_0x01e6:
            int r3 = r0.f526h
            int r3 = android.view.Gravity.getAbsoluteGravity(r3, r9)
            r5 = r3 & 48
            if (r5 != r1) goto L_0x0202
            int r1 = r4.top
            int r5 = r0.topMargin
            int r1 = r1 - r5
            int r5 = r0.f528j
            int r1 = r1 - r5
            int r5 = r11.top
            if (r1 >= r5) goto L_0x0202
            int r5 = r5 - r1
            r7.mo611d(r15, r5)
            r1 = 1
            goto L_0x0203
        L_0x0202:
            r1 = 0
        L_0x0203:
            r5 = r3 & 80
            if (r5 != r2) goto L_0x021d
            int r2 = r24.getHeight()
            int r5 = r4.bottom
            int r2 = r2 - r5
            int r5 = r0.bottomMargin
            int r2 = r2 - r5
            int r5 = r0.f528j
            int r2 = r2 + r5
            int r5 = r11.bottom
            if (r2 >= r5) goto L_0x021d
            int r2 = r2 - r5
            r7.mo611d(r15, r2)
            r1 = 1
        L_0x021d:
            if (r1 != 0) goto L_0x0223
            r1 = 0
            r7.mo611d(r15, r1)
        L_0x0223:
            r1 = r3 & 3
            r2 = 3
            if (r1 != r2) goto L_0x023a
            int r1 = r4.left
            int r2 = r0.leftMargin
            int r1 = r1 - r2
            int r2 = r0.f527i
            int r1 = r1 - r2
            int r2 = r11.left
            if (r1 >= r2) goto L_0x023a
            int r2 = r2 - r1
            r7.mo609c(r15, r2)
            r1 = 1
            goto L_0x023b
        L_0x023a:
            r1 = 0
        L_0x023b:
            r2 = r3 & 5
            r3 = 5
            if (r2 != r3) goto L_0x0256
            int r2 = r24.getWidth()
            int r3 = r4.right
            int r2 = r2 - r3
            int r3 = r0.rightMargin
            int r2 = r2 - r3
            int r0 = r0.f527i
            int r2 = r2 + r0
            int r0 = r11.right
            if (r2 >= r0) goto L_0x0256
            int r2 = r2 - r0
            r7.mo609c(r15, r2)
            r1 = 1
        L_0x0256:
            if (r1 != 0) goto L_0x025c
            r0 = 0
            r7.mo609c(r15, r0)
        L_0x025c:
            r4.setEmpty()
            p.h.k.d<android.graphics.Rect> r0 = f494B
            r0.mo5865a(r4)
        L_0x0264:
            r0 = 2
            if (r8 == r0) goto L_0x0289
            android.view.ViewGroup$LayoutParams r1 = r15.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0071f) r1
            android.graphics.Rect r1 = r1.f535q
            r2 = r23
            r2.set(r1)
            boolean r1 = r2.equals(r12)
            if (r1 == 0) goto L_0x027d
            r1 = r16
            goto L_0x02c3
        L_0x027d:
            android.view.ViewGroup$LayoutParams r1 = r15.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0071f) r1
            android.graphics.Rect r1 = r1.f535q
            r1.set(r12)
            goto L_0x028b
        L_0x0289:
            r2 = r23
        L_0x028b:
            int r14 = r19 + 1
            r1 = r16
        L_0x028f:
            if (r14 >= r1) goto L_0x02c3
            java.util.List<android.view.View> r3 = r7.f498e
            java.lang.Object r3 = r3.get(r14)
            android.view.View r3 = (android.view.View) r3
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0071f) r4
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r5 = r4.f519a
            if (r5 == 0) goto L_0x02c0
            boolean r6 = r5.mo663a(r7, r3, r15)
            if (r6 == 0) goto L_0x02c0
            if (r8 != 0) goto L_0x02b3
            boolean r6 = r4.f534p
            if (r6 == 0) goto L_0x02b3
            r3 = 0
            r4.f534p = r3
            goto L_0x02c0
        L_0x02b3:
            if (r8 == r0) goto L_0x02ba
            boolean r3 = r5.mo668b(r7, r3, r15)
            goto L_0x02bb
        L_0x02ba:
            r3 = 1
        L_0x02bb:
            r5 = 1
            if (r8 != r5) goto L_0x02c0
            r4.f534p = r3
        L_0x02c0:
            int r14 = r14 + 1
            goto L_0x028f
        L_0x02c3:
            int r14 = r19 + 1
            r10 = r1
            r13 = r2
            goto L_0x001c
        L_0x02c9:
            r2 = r13
            m175a(r11)
            m175a(r12)
            m175a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.mo606b(int):void");
    }

    /* renamed from: a */
    public final void mo597a(int i, Rect rect, Rect rect2, C0071f fVar, int i2, int i3) {
        int i4 = fVar.f521c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = fVar.f522d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int i10 = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int i11 = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            i10 -= i2 / 2;
        } else if (i6 != 5) {
            i10 -= i2;
        }
        if (i7 == 16) {
            i11 -= i3 / 2;
        } else if (i7 != 80) {
            i11 -= i3;
        }
        rect2.set(i10, i11, i2 + i10, i3 + i11);
    }

    /* renamed from: a */
    public boolean mo603a(View view, int i, int i2) {
        Rect c = m176c();
        C1305b.m3354a((ViewGroup) this, view, c);
        try {
            boolean contains = c.contains(i, i2);
            return contains;
        } finally {
            c.setEmpty();
            f494B.mo5865a(c);
        }
    }

    /* renamed from: a */
    public void mo124a(View view, int i, int i2, int[] iArr, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i3;
            } else {
                C0071f fVar = (C0071f) childAt.getLayoutParams();
                if (fVar.mo673a(i3)) {
                    C0068c cVar = fVar.f519a;
                    if (cVar != null) {
                        int[] iArr2 = this.f502i;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        cVar.mo657a(this, childAt, view, i, i2, iArr2, i3);
                        int[] iArr3 = this.f502i;
                        i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                        int[] iArr4 = this.f502i;
                        i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                        z = true;
                    }
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            mo606b(1);
        }
    }

    /* renamed from: a */
    public void mo123a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        boolean z;
        int i6;
        int childCount = getChildCount();
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0071f fVar = (C0071f) childAt.getLayoutParams();
                if (fVar.mo673a(i5)) {
                    C0068c cVar = fVar.f519a;
                    if (cVar != null) {
                        int[] iArr2 = this.f502i;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        cVar.mo656a(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                        int[] iArr3 = this.f502i;
                        i7 = i3 > 0 ? Math.max(i7, iArr3[0]) : Math.min(i7, iArr3[0]);
                        if (i4 > 0) {
                            z = true;
                            i6 = Math.max(i8, this.f502i[1]);
                        } else {
                            z = true;
                            i6 = Math.min(i8, this.f502i[1]);
                        }
                        i8 = i6;
                        z2 = z;
                    }
                }
            }
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (z2) {
            mo606b(1);
        }
    }

    /* renamed from: a */
    public void mo125a(View view, View view2, int i, int i2) {
        C1400k kVar = this.f516w;
        if (i2 == 1) {
            kVar.f4161b = i;
        } else {
            kVar.f4160a = i;
        }
        this.f508o = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            C0071f fVar = (C0071f) getChildAt(i3).getLayoutParams();
            if (fVar.mo673a(i2)) {
                C0068c cVar = fVar.f519a;
            }
        }
    }

    /* renamed from: a */
    public void mo121a(View view, int i) {
        C1400k kVar = this.f516w;
        if (i == 1) {
            kVar.f4161b = 0;
        } else {
            kVar.f4160a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0071f fVar = (C0071f) childAt.getLayoutParams();
            if (fVar.mo673a(i)) {
                C0068c cVar = fVar.f519a;
                if (cVar != null) {
                    cVar.mo654a(this, childAt, view, i);
                }
                fVar.mo672a(i, false);
                fVar.f534p = false;
            }
        }
        this.f508o = null;
    }

    /* renamed from: a */
    public final boolean mo602a(MotionEvent motionEvent, int i) {
        boolean z;
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f500g;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        int i3 = childCount - 1;
        while (i3 >= 0) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
            i3--;
        }
        Comparator<View> comparator = f493A;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            C0071f fVar = (C0071f) view.getLayoutParams();
            C0068c cVar = fVar.f519a;
            if ((!z2 && !z3) || actionMasked == 0) {
                if (!z2 && cVar != null) {
                    if (i2 == 0) {
                        z2 = cVar.mo662a(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z2 = cVar.mo667b(this, view, motionEvent2);
                    }
                    if (z2) {
                        this.f507n = view;
                    }
                }
                if (fVar.f519a == null) {
                    fVar.f531m = false;
                }
                boolean z4 = fVar.f531m;
                if (z4) {
                    z = true;
                } else {
                    C0068c cVar2 = fVar.f519a;
                    z = z4 | false;
                    fVar.f531m = z;
                }
                z3 = z && !z4;
                if (z && !z3) {
                    break;
                }
            } else if (cVar != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    cVar.mo662a(this, view, motionEvent3);
                } else if (i2 == 1) {
                    cVar.mo667b(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        if (r5 != false) goto L_0x00c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0161 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0107  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo596a() {
        /*
            r12 = this;
            java.util.List<android.view.View> r0 = r12.f498e
            r0.clear()
            p.g.d.a<android.view.View> r0 = r12.f499f
            p.e.h<T, java.util.ArrayList<T>> r1 = r0.f3932b
            int r1 = r1.f3589g
            r2 = 0
            r3 = r2
        L_0x000d:
            if (r3 >= r1) goto L_0x0024
            p.e.h<T, java.util.ArrayList<T>> r4 = r0.f3932b
            java.lang.Object r4 = r4.mo5598e(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L_0x0021
            r4.clear()
            p.h.k.d<java.util.ArrayList<T>> r5 = r0.f3931a
            r5.mo5865a(r4)
        L_0x0021:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0024:
            p.e.h<T, java.util.ArrayList<T>> r0 = r0.f3932b
            r0.clear()
            int r0 = r12.getChildCount()
            r1 = r2
        L_0x002e:
            if (r1 >= r0) goto L_0x018e
            android.view.View r3 = r12.getChildAt(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = r12.mo608c(r3)
            int r5 = r4.f524f
            r6 = -1
            r7 = 0
            r8 = 1
            if (r5 != r6) goto L_0x0045
            r4.f530l = r7
            r4.f529k = r7
            goto L_0x00c3
        L_0x0045:
            android.view.View r5 = r4.f529k
            if (r5 == 0) goto L_0x0076
            int r5 = r5.getId()
            int r6 = r4.f524f
            if (r5 == r6) goto L_0x0052
            goto L_0x006f
        L_0x0052:
            android.view.View r5 = r4.f529k
            android.view.ViewParent r6 = r5.getParent()
        L_0x0058:
            if (r6 == r12) goto L_0x0071
            if (r6 == 0) goto L_0x006b
            if (r6 != r3) goto L_0x005f
            goto L_0x006b
        L_0x005f:
            boolean r9 = r6 instanceof android.view.View
            if (r9 == 0) goto L_0x0066
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x0066:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0058
        L_0x006b:
            r4.f530l = r7
            r4.f529k = r7
        L_0x006f:
            r5 = r2
            goto L_0x0074
        L_0x0071:
            r4.f530l = r5
            r5 = r8
        L_0x0074:
            if (r5 != 0) goto L_0x00c3
        L_0x0076:
            int r5 = r4.f524f
            android.view.View r5 = r12.findViewById(r5)
            r4.f529k = r5
            if (r5 == 0) goto L_0x00b9
            if (r5 != r12) goto L_0x0091
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x0089
            goto L_0x00bf
        L_0x0089:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x0091:
            android.view.ViewParent r6 = r5.getParent()
        L_0x0095:
            if (r6 == r12) goto L_0x00b6
            if (r6 == 0) goto L_0x00b6
            if (r6 != r3) goto L_0x00aa
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x00a2
            goto L_0x00bf
        L_0x00a2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x00aa:
            boolean r9 = r6 instanceof android.view.View
            if (r9 == 0) goto L_0x00b1
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x00b1:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0095
        L_0x00b6:
            r4.f530l = r5
            goto L_0x00c3
        L_0x00b9:
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x0169
        L_0x00bf:
            r4.f530l = r7
            r4.f529k = r7
        L_0x00c3:
            p.g.d.a<android.view.View> r5 = r12.f499f
            r5.mo5770a(r3)
            r5 = r2
        L_0x00c9:
            if (r5 >= r0) goto L_0x0165
            if (r5 != r1) goto L_0x00cf
            goto L_0x0161
        L_0x00cf:
            android.view.View r6 = r12.getChildAt(r5)
            android.view.View r9 = r4.f530l
            if (r6 == r9) goto L_0x0104
            int r9 = p124p.p150h.p162l.C1404o.m3551l(r12)
            android.view.ViewGroup$LayoutParams r10 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0071f) r10
            int r10 = r10.f525g
            int r10 = android.view.Gravity.getAbsoluteGravity(r10, r9)
            if (r10 == 0) goto L_0x00f4
            int r11 = r4.f526h
            int r9 = android.view.Gravity.getAbsoluteGravity(r11, r9)
            r9 = r9 & r10
            if (r9 != r10) goto L_0x00f4
            r9 = r8
            goto L_0x00f5
        L_0x00f4:
            r9 = r2
        L_0x00f5:
            if (r9 != 0) goto L_0x0104
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r9 = r4.f519a
            if (r9 == 0) goto L_0x0102
            boolean r9 = r9.mo663a(r12, r3, r6)
            if (r9 == 0) goto L_0x0102
            goto L_0x0104
        L_0x0102:
            r9 = r2
            goto L_0x0105
        L_0x0104:
            r9 = r8
        L_0x0105:
            if (r9 == 0) goto L_0x0161
            p.g.d.a<android.view.View> r9 = r12.f499f
            p.e.h<T, java.util.ArrayList<T>> r9 = r9.f3932b
            int r9 = r9.mo5587a(r6)
            if (r9 < 0) goto L_0x0113
            r9 = r8
            goto L_0x0114
        L_0x0113:
            r9 = r2
        L_0x0114:
            if (r9 != 0) goto L_0x011b
            p.g.d.a<android.view.View> r9 = r12.f499f
            r9.mo5770a(r6)
        L_0x011b:
            p.g.d.a<android.view.View> r9 = r12.f499f
            p.e.h<T, java.util.ArrayList<T>> r10 = r9.f3932b
            int r10 = r10.mo5587a(r6)
            if (r10 < 0) goto L_0x0127
            r10 = r8
            goto L_0x0128
        L_0x0127:
            r10 = r2
        L_0x0128:
            if (r10 == 0) goto L_0x0159
            p.e.h<T, java.util.ArrayList<T>> r10 = r9.f3932b
            int r10 = r10.mo5587a(r3)
            if (r10 < 0) goto L_0x0134
            r10 = r8
            goto L_0x0135
        L_0x0134:
            r10 = r2
        L_0x0135:
            if (r10 == 0) goto L_0x0159
            p.e.h<T, java.util.ArrayList<T>> r10 = r9.f3932b
            java.lang.Object r10 = r10.getOrDefault(r6, r7)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L_0x0155
            p.h.k.d<java.util.ArrayList<T>> r10 = r9.f3931a
            java.lang.Object r10 = r10.mo5864a()
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L_0x0150
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x0150:
            p.e.h<T, java.util.ArrayList<T>> r9 = r9.f3932b
            r9.put(r6, r10)
        L_0x0155:
            r10.add(r3)
            goto L_0x0161
        L_0x0159:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L_0x0161:
            int r5 = r5 + 1
            goto L_0x00c9
        L_0x0165:
            int r1 = r1 + 1
            goto L_0x002e
        L_0x0169:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not find CoordinatorLayout descendant view with id "
            java.lang.StringBuilder r1 = p213q.p214a.p215a.p216a.C1965a.m4756a(r1)
            android.content.res.Resources r2 = r12.getResources()
            int r4 = r4.f524f
            java.lang.String r2 = r2.getResourceName(r4)
            r1.append(r2)
            java.lang.String r2 = " to anchor view "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x018e:
            java.util.List<android.view.View> r0 = r12.f498e
            p.g.d.a<android.view.View> r1 = r12.f499f
            java.util.ArrayList<T> r3 = r1.f3933c
            r3.clear()
            java.util.HashSet<T> r3 = r1.f3934d
            r3.clear()
            p.e.h<T, java.util.ArrayList<T>> r3 = r1.f3932b
            int r3 = r3.f3589g
        L_0x01a0:
            if (r2 >= r3) goto L_0x01b2
            p.e.h<T, java.util.ArrayList<T>> r4 = r1.f3932b
            java.lang.Object r4 = r4.mo5593c(r2)
            java.util.ArrayList<T> r5 = r1.f3933c
            java.util.HashSet<T> r6 = r1.f3934d
            r1.mo5771a(r4, r5, r6)
            int r2 = r2 + 1
            goto L_0x01a0
        L_0x01b2:
            java.util.ArrayList<T> r1 = r1.f3933c
            r0.addAll(r1)
            java.util.List<android.view.View> r0 = r12.f498e
            java.util.Collections.reverse(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.mo596a():void");
    }

    /* renamed from: b */
    public void mo607b(View view, int i) {
        C0071f fVar = (C0071f) view.getLayoutParams();
        int i2 = 0;
        if (!(fVar.f529k == null && fVar.f524f != -1)) {
            View view2 = fVar.f529k;
            if (view2 != null) {
                Rect c = m176c();
                Rect c2 = m176c();
                try {
                    C1305b.m3354a((ViewGroup) this, view2, c);
                    C0071f fVar2 = (C0071f) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    mo597a(i, c, c2, fVar2, measuredWidth, measuredHeight);
                    mo600a(fVar2, c2, measuredWidth, measuredHeight);
                    view.layout(c2.left, c2.top, c2.right, c2.bottom);
                    c.setEmpty();
                    f494B.mo5865a(c);
                    c2.setEmpty();
                    f494B.mo5865a(c2);
                } catch (Throwable th) {
                    m175a(c);
                    m175a(c2);
                    throw th;
                }
            } else {
                int i3 = fVar.f523e;
                if (i3 >= 0) {
                    C0071f fVar3 = (C0071f) view.getLayoutParams();
                    int i4 = fVar3.f521c;
                    if (i4 == 0) {
                        i4 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
                    int i5 = absoluteGravity & 7;
                    int i6 = absoluteGravity & 112;
                    int width = getWidth();
                    int height = getHeight();
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    if (i == 1) {
                        i3 = width - i3;
                    }
                    int a = mo594a(i3) - measuredWidth2;
                    if (i5 == 1) {
                        a += measuredWidth2 / 2;
                    } else if (i5 == 5) {
                        a += measuredWidth2;
                    }
                    if (i6 == 16) {
                        i2 = 0 + (measuredHeight2 / 2);
                    } else if (i6 == 80) {
                        i2 = measuredHeight2 + 0;
                    }
                    int max = Math.max(getPaddingLeft() + fVar3.leftMargin, Math.min(a, ((width - getPaddingRight()) - measuredWidth2) - fVar3.rightMargin));
                    int max2 = Math.max(getPaddingTop() + fVar3.topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - fVar3.bottomMargin));
                    view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                    return;
                }
                C0071f fVar4 = (C0071f) view.getLayoutParams();
                Rect c3 = m176c();
                c3.set(getPaddingLeft() + fVar4.leftMargin, getPaddingTop() + fVar4.topMargin, (getWidth() - getPaddingRight()) - fVar4.rightMargin, (getHeight() - getPaddingBottom()) - fVar4.bottomMargin);
                if (this.f511r != null && C1404o.m3548i(this) && !view.getFitsSystemWindows()) {
                    c3.left = this.f511r.mo5922b() + c3.left;
                    c3.top = this.f511r.mo5924d() + c3.top;
                    c3.right -= this.f511r.mo5923c();
                    c3.bottom -= this.f511r.mo5921a();
                }
                Rect c4 = m176c();
                int i7 = fVar4.f521c;
                if ((i7 & 7) == 0) {
                    i7 |= 8388611;
                }
                if ((i7 & 112) == 0) {
                    i7 |= 48;
                }
                Gravity.apply(i7, view.getMeasuredWidth(), view.getMeasuredHeight(), c3, c4, i);
                view.layout(c4.left, c4.top, c4.right, c4.bottom);
                c3.setEmpty();
                f494B.mo5865a(c3);
                c4.setEmpty();
                f494B.mo5865a(c4);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* renamed from: b */
    public boolean mo129b(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        int i4 = 0;
        boolean z = false;
        while (true) {
            if (i4 >= childCount) {
                return z;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0071f fVar = (C0071f) childAt.getLayoutParams();
                C0068c cVar = fVar.f519a;
                if (cVar != null) {
                    boolean a = cVar.mo666a(this, childAt, view, view2, i, i2);
                    z |= a;
                    fVar.mo672a(i3, a);
                } else {
                    fVar.mo672a(i3, false);
                }
            }
            i4++;
        }
    }

    /* renamed from: a */
    public final void mo601a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0068c cVar = ((C0071f) childAt.getLayoutParams()).f519a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    cVar.mo662a(this, childAt, obtain);
                } else {
                    cVar.mo667b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0071f) getChildAt(i2).getLayoutParams()).f531m = false;
        }
        this.f507n = null;
        this.f504k = false;
    }
}
