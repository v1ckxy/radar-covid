package p124p.p150h.p162l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p124p.p150h.C1307b;
import p124p.p150h.p162l.C1387a.C1388a;
import p124p.p150h.p162l.p163y.C1429b;
import p124p.p150h.p162l.p163y.C1429b.C1430a;
import p124p.p150h.p162l.p163y.C1436d;

/* renamed from: p.h.l.o */
public class C1404o {

    /* renamed from: a */
    public static final AtomicInteger f4166a = new AtomicInteger(1);

    /* renamed from: b */
    public static WeakHashMap<View, C1413t> f4167b = null;

    /* renamed from: c */
    public static Field f4168c;

    /* renamed from: d */
    public static boolean f4169d = false;

    /* renamed from: p.h.l.o$a */
    public class C1405a implements OnApplyWindowInsetsListener {

        /* renamed from: a */
        public final /* synthetic */ C1401l f4170a;

        public C1405a(C1401l lVar) {
            this.f4170a = lVar;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            if (windowInsets != null) {
                return this.f4170a.mo648a(view, new C1419x(windowInsets)).mo5927f();
            }
            throw null;
        }
    }

    /* renamed from: p.h.l.o$b */
    public static abstract class C1406b<T> {

        /* renamed from: a */
        public final int f4171a;

        /* renamed from: b */
        public final Class<T> f4172b;

        /* renamed from: c */
        public final int f4173c;

        public C1406b(int i, Class<T> cls, int i2) {
            this.f4171a = i;
            this.f4172b = cls;
            this.f4173c = i2;
        }

        public C1406b(int i, Class<T> cls, int i2, int i3) {
            this.f4171a = i;
            this.f4172b = cls;
            this.f4173c = i3;
        }

        /* renamed from: a */
        public abstract T mo5901a(View view);

        /* renamed from: a */
        public abstract void mo5902a(View view, T t);

        /* renamed from: a */
        public boolean mo5903a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        /* renamed from: a */
        public abstract boolean mo5904a(T t, T t2);

        /* renamed from: b */
        public T mo5905b(View view) {
            if (VERSION.SDK_INT >= this.f4173c) {
                return mo5901a(view);
            }
            T tag = view.getTag(this.f4171a);
            if (this.f4172b.isInstance(tag)) {
                return tag;
            }
            return null;
        }
    }

    /* renamed from: p.h.l.o$c */
    public interface C1407c {
        /* renamed from: a */
        boolean mo5906a(View view, KeyEvent keyEvent);
    }

    /* renamed from: p.h.l.o$d */
    public static class C1408d {

        /* renamed from: d */
        public static final ArrayList<WeakReference<View>> f4174d = new ArrayList<>();

        /* renamed from: a */
        public WeakHashMap<View, Boolean> f4175a = null;

        /* renamed from: b */
        public SparseArray<WeakReference<View>> f4176b = null;

        /* renamed from: c */
        public WeakReference<KeyEvent> f4177c = null;

        /* renamed from: a */
        public static C1408d m3572a(View view) {
            C1408d dVar = (C1408d) view.getTag(C1307b.tag_unhandled_key_event_manager);
            if (dVar != null) {
                return dVar;
            }
            C1408d dVar2 = new C1408d();
            view.setTag(C1307b.tag_unhandled_key_event_manager, dVar2);
            return dVar2;
        }

        /* renamed from: a */
        public final View mo5907a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f4175a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View a = mo5907a(viewGroup.getChildAt(childCount), keyEvent);
                        if (a != null) {
                            return a;
                        }
                    }
                }
                if (mo5909b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public final void mo5908a() {
            WeakHashMap<View, Boolean> weakHashMap = this.f4175a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!f4174d.isEmpty()) {
                synchronized (f4174d) {
                    if (this.f4175a == null) {
                        this.f4175a = new WeakHashMap<>();
                    }
                    for (int size = f4174d.size() - 1; size >= 0; size--) {
                        View view = (View) ((WeakReference) f4174d.get(size)).get();
                        if (view == null) {
                            f4174d.remove(size);
                        } else {
                            this.f4175a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f4175a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        public final boolean mo5909b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C1307b.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((C1407c) arrayList.get(size)).mo5906a(view, keyEvent)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    static {
        new WeakHashMap();
    }

    /* renamed from: A */
    public static boolean m3506A(View view) {
        Boolean bool = (Boolean) new C1409p(C1307b.tag_screen_reader_focusable, Boolean.class, 28).mo5905b(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: B */
    public static void m3507B(View view) {
        view.postInvalidateOnAnimation();
    }

    /* renamed from: C */
    public static void m3508C(View view) {
        view.requestApplyInsets();
    }

    /* renamed from: D */
    public static void m3509D(View view) {
        view.stopNestedScroll();
    }

    /* renamed from: a */
    public static int m3510a() {
        return View.generateViewId();
    }

    /* renamed from: a */
    public static C1413t m3511a(View view) {
        if (f4167b == null) {
            f4167b = new WeakHashMap<>();
        }
        C1413t tVar = (C1413t) f4167b.get(view);
        if (tVar != null) {
            return tVar;
        }
        C1413t tVar2 = new C1413t(view);
        f4167b.put(view, tVar2);
        return tVar2;
    }

    /* renamed from: a */
    public static void m3514a(View view, float f) {
        view.setElevation(f);
    }

    /* renamed from: a */
    public static void m3516a(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }

    /* renamed from: a */
    public static void m3517a(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m3519a(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* renamed from: a */
    public static void m3520a(View view, Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* renamed from: a */
    public static void m3521a(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    /* renamed from: a */
    public static void m3522a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: a */
    public static void m3523a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* renamed from: a */
    public static void m3524a(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    /* renamed from: a */
    public static void m3525a(View view, String str) {
        view.setTransitionName(str);
    }

    /* renamed from: a */
    public static void m3527a(View view, C1401l lVar) {
        if (lVar == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new C1405a(lVar));
        }
    }

    /* renamed from: a */
    public static boolean m3532a(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    /* renamed from: a */
    public static boolean m3533a(View view, KeyEvent keyEvent) {
        boolean z = false;
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        C1408d a = C1408d.m3572a(view);
        if (a != null) {
            if (keyEvent.getAction() == 0) {
                a.mo5908a();
            }
            View a2 = a.mo5907a(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (a.f4176b == null) {
                        a.f4176b = new SparseArray<>();
                    }
                    a.f4176b.put(keyCode, new WeakReference(a2));
                }
            }
            if (a2 != null) {
                z = true;
            }
            return z;
        }
        throw null;
    }

    /* renamed from: b */
    public static C1387a m3534b(View view) {
        AccessibilityDelegate c = m3538c(view);
        if (c == null) {
            return null;
        }
        return c instanceof C1388a ? ((C1388a) c).f4148a : new C1387a(c);
    }

    /* renamed from: b */
    public static void m3535b(View view, int i) {
        view.offsetLeftAndRight(i);
    }

    /* renamed from: b */
    public static void m3536b(View view, boolean z) {
        view.setHasTransientState(z);
    }

    /* renamed from: b */
    public static boolean m3537b(View view, KeyEvent keyEvent) {
        boolean z = false;
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        C1408d a = C1408d.m3572a(view);
        WeakReference<KeyEvent> weakReference = a.f4177c;
        if (weakReference == null || weakReference.get() != keyEvent) {
            a.f4177c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            if (a.f4176b == null) {
                a.f4176b = new SparseArray<>();
            }
            SparseArray<WeakReference<View>> sparseArray = a.f4176b;
            if (keyEvent.getAction() == 1) {
                int indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode());
                if (indexOfKey >= 0) {
                    weakReference2 = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
            }
            if (weakReference2 == null) {
                weakReference2 = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
            }
            if (weakReference2 != null) {
                View view2 = (View) weakReference2.get();
                if (view2 != null && m3562w(view2)) {
                    a.mo5909b(view2, keyEvent);
                }
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    public static AccessibilityDelegate m3538c(View view) {
        if (VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        AccessibilityDelegate accessibilityDelegate = null;
        if (!f4169d) {
            if (f4168c == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    f4168c = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    f4169d = true;
                }
            }
            Object obj = f4168c.get(view);
            if (obj instanceof AccessibilityDelegate) {
                accessibilityDelegate = (AccessibilityDelegate) obj;
            }
        }
        return accessibilityDelegate;
    }

    /* renamed from: c */
    public static void m3539c(View view, int i) {
        view.offsetTopAndBottom(i);
    }

    /* renamed from: d */
    public static int m3540d(View view) {
        return view.getAccessibilityLiveRegion();
    }

    /* renamed from: d */
    public static void m3541d(View view, int i) {
        m3513a(i, view);
        m3515a(view, 0);
    }

    /* renamed from: e */
    public static ColorStateList m3542e(View view) {
        return view.getBackgroundTintList();
    }

    /* renamed from: e */
    public static void m3543e(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    /* renamed from: f */
    public static Rect m3544f(View view) {
        return view.getClipBounds();
    }

    /* renamed from: f */
    public static void m3545f(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    /* renamed from: g */
    public static Display m3546g(View view) {
        return view.getDisplay();
    }

    /* renamed from: h */
    public static float m3547h(View view) {
        return view.getElevation();
    }

    /* renamed from: i */
    public static boolean m3548i(View view) {
        return view.getFitsSystemWindows();
    }

    /* renamed from: j */
    public static int m3549j(View view) {
        return view.getImportantForAccessibility();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: k */
    public static int m3550k(View view) {
        if (VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: l */
    public static int m3551l(View view) {
        return view.getLayoutDirection();
    }

    /* renamed from: m */
    public static int m3552m(View view) {
        return view.getMinimumHeight();
    }

    /* renamed from: n */
    public static int m3553n(View view) {
        return view.getMinimumWidth();
    }

    /* renamed from: o */
    public static int m3554o(View view) {
        return view.getPaddingEnd();
    }

    /* renamed from: p */
    public static int m3555p(View view) {
        return view.getPaddingStart();
    }

    /* renamed from: q */
    public static String m3556q(View view) {
        return view.getTransitionName();
    }

    /* renamed from: r */
    public static int m3557r(View view) {
        return view.getWindowSystemUiVisibility();
    }

    /* renamed from: s */
    public static float m3558s(View view) {
        return view.getZ();
    }

    /* renamed from: t */
    public static boolean m3559t(View view) {
        return view.hasOnClickListeners();
    }

    /* renamed from: u */
    public static boolean m3560u(View view) {
        return view.hasOverlappingRendering();
    }

    /* renamed from: v */
    public static boolean m3561v(View view) {
        return view.hasTransientState();
    }

    /* renamed from: w */
    public static boolean m3562w(View view) {
        return view.isAttachedToWindow();
    }

    /* renamed from: x */
    public static boolean m3563x(View view) {
        return view.isLaidOut();
    }

    /* renamed from: y */
    public static boolean m3564y(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* renamed from: z */
    public static boolean m3565z(View view) {
        return view.isPaddingRelative();
    }

    /* renamed from: a */
    public static void m3515a(View view, int i) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = ((CharSequence) new C1410q(C1307b.tag_accessibility_pane_title, CharSequence.class, 8, 28).mo5905b(view)) != null;
            if (view.getAccessibilityLiveRegion() != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(view.getParent().getClass().getSimpleName());
                    sb.append(" does not fully implement ViewParent");
                    Log.e("ViewCompat", sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: a */
    public static C1419x m3512a(View view, C1419x xVar) {
        WindowInsets f = xVar.mo5927f();
        if (f == null) {
            return xVar;
        }
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(f);
        return !onApplyWindowInsets.equals(f) ? new C1419x(onApplyWindowInsets) : xVar;
    }

    /* renamed from: a */
    public static void m3530a(View view, C1429b bVar) {
        view.onInitializeAccessibilityNodeInfo(bVar.f4203a);
    }

    /* renamed from: a */
    public static void m3513a(int i, View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C1307b.tag_accessibility_actions);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(C1307b.tag_accessibility_actions, arrayList);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((C1430a) arrayList.get(i2)).mo5954a() == i) {
                arrayList.remove(i2);
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m3529a(View view, C1430a aVar, CharSequence charSequence, C1436d dVar) {
        if (dVar == null && charSequence == null) {
            m3541d(view, aVar.mo5954a());
            return;
        }
        C1430a aVar2 = new C1430a(null, aVar.f4215b, charSequence, dVar, aVar.f4216c);
        C1387a b = m3534b(view);
        if (b == null) {
            b = new C1387a();
        }
        m3526a(view, b);
        m3513a(aVar2.mo5954a(), view);
        ArrayList arrayList = (ArrayList) view.getTag(C1307b.tag_accessibility_actions);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(C1307b.tag_accessibility_actions, arrayList);
        }
        arrayList.add(aVar2);
        m3515a(view, 0);
    }

    /* renamed from: a */
    public static void m3518a(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (VERSION.SDK_INT >= 29) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: a */
    public static void m3526a(View view, C1387a aVar) {
        if (aVar == null && (m3538c(view) instanceof C1388a)) {
            aVar = new C1387a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.f4147b);
    }

    /* renamed from: a */
    public static void m3531a(View view, boolean z) {
        C1411r rVar = new C1411r(C1307b.tag_accessibility_heading, Boolean.class, 28);
        Boolean valueOf = Boolean.valueOf(z);
        if (VERSION.SDK_INT >= rVar.f4173c) {
            rVar.mo5902a(view, valueOf);
        } else if (rVar.mo5904a(rVar.mo5905b(view), valueOf)) {
            C1387a b = m3534b(view);
            if (b == null) {
                b = new C1387a();
            }
            m3526a(view, b);
            view.setTag(rVar.f4171a, valueOf);
            m3515a(view, 0);
        }
    }

    /* renamed from: a */
    public static void m3528a(View view, C1403n nVar) {
        if (VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (nVar != null ? nVar.f4165a : null));
        }
    }
}
