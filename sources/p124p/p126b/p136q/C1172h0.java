package p124p.p126b.p136q;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import p124p.p126b.C1027j;
import p124p.p126b.p134p.p135i.C1134p;
import p124p.p150h.p162l.C1404o;

/* renamed from: p.b.q.h0 */
public class C1172h0 implements C1134p {

    /* renamed from: G */
    public static Method f3289G;

    /* renamed from: H */
    public static Method f3290H;

    /* renamed from: I */
    public static Method f3291I;

    /* renamed from: A */
    public final C1173a f3292A = new C1173a();

    /* renamed from: B */
    public final Handler f3293B;

    /* renamed from: C */
    public final Rect f3294C = new Rect();

    /* renamed from: D */
    public Rect f3295D;

    /* renamed from: E */
    public boolean f3296E;

    /* renamed from: F */
    public PopupWindow f3297F;

    /* renamed from: e */
    public Context f3298e;

    /* renamed from: f */
    public ListAdapter f3299f;

    /* renamed from: g */
    public C1157c0 f3300g;

    /* renamed from: h */
    public int f3301h = -2;

    /* renamed from: i */
    public int f3302i = -2;

    /* renamed from: j */
    public int f3303j;

    /* renamed from: k */
    public int f3304k;

    /* renamed from: l */
    public int f3305l = 1002;

    /* renamed from: m */
    public boolean f3306m;

    /* renamed from: n */
    public boolean f3307n;

    /* renamed from: o */
    public boolean f3308o;

    /* renamed from: p */
    public int f3309p = 0;

    /* renamed from: q */
    public boolean f3310q = false;

    /* renamed from: r */
    public boolean f3311r = false;

    /* renamed from: s */
    public int f3312s = Integer.MAX_VALUE;

    /* renamed from: t */
    public int f3313t = 0;

    /* renamed from: u */
    public DataSetObserver f3314u;

    /* renamed from: v */
    public View f3315v;

    /* renamed from: w */
    public OnItemClickListener f3316w;

    /* renamed from: x */
    public final C1177e f3317x = new C1177e();

    /* renamed from: y */
    public final C1176d f3318y = new C1176d();

    /* renamed from: z */
    public final C1175c f3319z = new C1175c();

    /* renamed from: p.b.q.h0$a */
    public class C1173a implements Runnable {
        public C1173a() {
        }

        public void run() {
            C1157c0 c0Var = C1172h0.this.f3300g;
            if (c0Var != null) {
                c0Var.setListSelectionHidden(true);
                c0Var.requestLayout();
            }
        }
    }

    /* renamed from: p.b.q.h0$b */
    public class C1174b extends DataSetObserver {
        public C1174b() {
        }

        public void onChanged() {
            if (C1172h0.this.mo4766a()) {
                C1172h0.this.mo4769c();
            }
        }

        public void onInvalidated() {
            C1172h0.this.dismiss();
        }
    }

    /* renamed from: p.b.q.h0$c */
    public class C1175c implements OnScrollListener {
        public C1175c() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            boolean z = true;
            if (i == 1) {
                if (C1172h0.this.f3297F.getInputMethodMode() != 2) {
                    z = false;
                }
                if (!z && C1172h0.this.f3297F.getContentView() != null) {
                    C1172h0 h0Var = C1172h0.this;
                    h0Var.f3293B.removeCallbacks(h0Var.f3317x);
                    C1172h0.this.f3317x.run();
                }
            }
        }
    }

    /* renamed from: p.b.q.h0$d */
    public class C1176d implements OnTouchListener {
        public C1176d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0) {
                PopupWindow popupWindow = C1172h0.this.f3297F;
                if (popupWindow != null && popupWindow.isShowing() && x >= 0 && x < C1172h0.this.f3297F.getWidth() && y >= 0 && y < C1172h0.this.f3297F.getHeight()) {
                    C1172h0 h0Var = C1172h0.this;
                    h0Var.f3293B.postDelayed(h0Var.f3317x, 250);
                    return false;
                }
            }
            if (action == 1) {
                C1172h0 h0Var2 = C1172h0.this;
                h0Var2.f3293B.removeCallbacks(h0Var2.f3317x);
            }
            return false;
        }
    }

    /* renamed from: p.b.q.h0$e */
    public class C1177e implements Runnable {
        public C1177e() {
        }

        public void run() {
            C1157c0 c0Var = C1172h0.this.f3300g;
            if (c0Var != null && C1404o.m3562w(c0Var) && C1172h0.this.f3300g.getCount() > C1172h0.this.f3300g.getChildCount()) {
                int childCount = C1172h0.this.f3300g.getChildCount();
                C1172h0 h0Var = C1172h0.this;
                if (childCount <= h0Var.f3312s) {
                    h0Var.f3297F.setInputMethodMode(2);
                    C1172h0.this.mo4769c();
                }
            }
        }
    }

    static {
        String str = "ListPopupWindow";
        if (VERSION.SDK_INT <= 28) {
            try {
                f3289G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i(str, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f3291I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i(str, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (VERSION.SDK_INT <= 23) {
            try {
                f3290H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i(str, "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C1172h0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3298e = context;
        this.f3293B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1027j.ListPopupWindow, i, i2);
        this.f3303j = obtainStyledAttributes.getDimensionPixelOffset(C1027j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C1027j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f3304k = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f3306m = true;
        }
        obtainStyledAttributes.recycle();
        C1199o oVar = new C1199o(context, attributeSet, i, i2);
        this.f3297F = oVar;
        oVar.setInputMethodMode(1);
    }

    /* renamed from: a */
    public C1157c0 mo5158a(Context context, boolean z) {
        return new C1157c0(context, z);
    }

    /* renamed from: a */
    public void mo5159a(int i) {
        this.f3304k = i;
        this.f3306m = true;
    }

    /* renamed from: a */
    public void mo5160a(Drawable drawable) {
        this.f3297F.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void mo248a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f3314u;
        if (dataSetObserver == null) {
            this.f3314u = new C1174b();
        } else {
            ListAdapter listAdapter2 = this.f3299f;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f3299f = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3314u);
        }
        C1157c0 c0Var = this.f3300g;
        if (c0Var != null) {
            c0Var.setAdapter(this.f3299f);
        }
    }

    /* renamed from: a */
    public void mo5161a(boolean z) {
        this.f3296E = z;
        this.f3297F.setFocusable(z);
    }

    /* renamed from: a */
    public boolean mo4766a() {
        return this.f3297F.isShowing();
    }

    /* renamed from: b */
    public int mo5162b() {
        return this.f3303j;
    }

    /* renamed from: c */
    public void mo4769c() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z = true;
        if (this.f3300g == null) {
            C1157c0 a = mo5158a(this.f3298e, !this.f3296E);
            this.f3300g = a;
            a.setAdapter(this.f3299f);
            this.f3300g.setOnItemClickListener(this.f3316w);
            this.f3300g.setFocusable(true);
            this.f3300g.setFocusableInTouchMode(true);
            this.f3300g.setOnItemSelectedListener(new C1170g0(this));
            this.f3300g.setOnScrollListener(this.f3319z);
            this.f3297F.setContentView(this.f3300g);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f3297F.getContentView();
        }
        Drawable background = this.f3297F.getBackground();
        if (background != null) {
            background.getPadding(this.f3294C);
            Rect rect = this.f3294C;
            int i5 = rect.top;
            i = rect.bottom + i5;
            if (!this.f3306m) {
                this.f3304k = -i5;
            }
        } else {
            this.f3294C.setEmpty();
            i = 0;
        }
        boolean z2 = this.f3297F.getInputMethodMode() == 2;
        View view = this.f3315v;
        int i6 = this.f3304k;
        String str = "ListPopupWindow";
        if (VERSION.SDK_INT <= 23) {
            Method method = f3290H;
            if (method != null) {
                try {
                    i2 = ((Integer) method.invoke(this.f3297F, new Object[]{view, Integer.valueOf(i6), Boolean.valueOf(z2)})).intValue();
                } catch (Exception unused) {
                    Log.i(str, "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            i2 = this.f3297F.getMaxAvailableHeight(view, i6);
        } else {
            i2 = this.f3297F.getMaxAvailableHeight(view, i6, z2);
        }
        if (this.f3310q || this.f3301h == -1) {
            i3 = i2 + i;
        } else {
            int i7 = this.f3302i;
            if (i7 != -2) {
                i4 = 1073741824;
                if (i7 == -1) {
                    int i8 = this.f3298e.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.f3294C;
                    i7 = i8 - (rect2.left + rect2.right);
                }
            } else {
                int i9 = this.f3298e.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f3294C;
                i7 = i9 - (rect3.left + rect3.right);
                i4 = RecyclerView.UNDEFINED_DURATION;
            }
            int a2 = this.f3300g.mo5068a(MeasureSpec.makeMeasureSpec(i7, i4), i2 - 0, -1);
            i3 = a2 + (a2 > 0 ? this.f3300g.getPaddingBottom() + this.f3300g.getPaddingTop() + i + 0 : 0);
        }
        boolean z3 = this.f3297F.getInputMethodMode() == 2;
        this.f3297F.setWindowLayoutType(this.f3305l);
        if (!this.f3297F.isShowing()) {
            int i10 = this.f3302i;
            if (i10 == -1) {
                i10 = -1;
            } else if (i10 == -2) {
                i10 = this.f3315v.getWidth();
            }
            int i11 = this.f3301h;
            if (i11 == -1) {
                i3 = -1;
            } else if (i11 != -2) {
                i3 = i11;
            }
            this.f3297F.setWidth(i10);
            this.f3297F.setHeight(i3);
            if (VERSION.SDK_INT <= 28) {
                Method method2 = f3289G;
                if (method2 != null) {
                    try {
                        method2.invoke(this.f3297F, new Object[]{Boolean.valueOf(true)});
                    } catch (Exception unused2) {
                        Log.i(str, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    }
                }
            } else {
                this.f3297F.setIsClippedToScreen(true);
            }
            this.f3297F.setOutsideTouchable(!this.f3311r && !this.f3310q);
            this.f3297F.setTouchInterceptor(this.f3318y);
            if (this.f3308o) {
                this.f3297F.setOverlapAnchor(this.f3307n);
            }
            if (VERSION.SDK_INT <= 28) {
                Method method3 = f3291I;
                if (method3 != null) {
                    try {
                        method3.invoke(this.f3297F, new Object[]{this.f3295D});
                    } catch (Exception e) {
                        Log.e(str, "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                this.f3297F.setEpicenterBounds(this.f3295D);
            }
            this.f3297F.showAsDropDown(this.f3315v, this.f3303j, this.f3304k, this.f3309p);
            this.f3300g.setSelection(-1);
            if (!this.f3296E || this.f3300g.isInTouchMode()) {
                C1157c0 c0Var = this.f3300g;
                if (c0Var != null) {
                    c0Var.setListSelectionHidden(true);
                    c0Var.requestLayout();
                }
            }
            if (!this.f3296E) {
                this.f3293B.post(this.f3292A);
            }
        } else if (C1404o.m3562w(this.f3315v)) {
            int i12 = this.f3302i;
            if (i12 == -1) {
                i12 = -1;
            } else if (i12 == -2) {
                i12 = this.f3315v.getWidth();
            }
            int i13 = this.f3301h;
            if (i13 == -1) {
                if (!z3) {
                    i3 = -1;
                }
                if (z3) {
                    this.f3297F.setWidth(this.f3302i == -1 ? -1 : 0);
                    this.f3297F.setHeight(0);
                } else {
                    this.f3297F.setWidth(this.f3302i == -1 ? -1 : 0);
                    this.f3297F.setHeight(-1);
                }
            } else if (i13 != -2) {
                i3 = i13;
            }
            PopupWindow popupWindow = this.f3297F;
            if (this.f3311r || this.f3310q) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f3297F.update(this.f3315v, this.f3303j, this.f3304k, i12 < 0 ? -1 : i12, i3 < 0 ? -1 : i3);
        }
    }

    /* renamed from: c */
    public void mo5163c(int i) {
        this.f3303j = i;
    }

    /* renamed from: d */
    public Drawable mo5164d() {
        return this.f3297F.getBackground();
    }

    /* renamed from: d */
    public void mo5165d(int i) {
        Drawable background = this.f3297F.getBackground();
        if (background != null) {
            background.getPadding(this.f3294C);
            Rect rect = this.f3294C;
            this.f3302i = rect.left + rect.right + i;
            return;
        }
        this.f3302i = i;
    }

    public void dismiss() {
        this.f3297F.dismiss();
        this.f3297F.setContentView(null);
        this.f3300g = null;
        this.f3293B.removeCallbacks(this.f3317x);
    }

    /* renamed from: e */
    public ListView mo4774e() {
        return this.f3300g;
    }

    /* renamed from: f */
    public int mo5166f() {
        if (!this.f3306m) {
            return 0;
        }
        return this.f3304k;
    }
}
