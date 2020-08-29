package p124p.p126b.p136q;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityManager;
import p124p.p126b.C1021d;
import p124p.p150h.p162l.C1404o;
import p124p.p150h.p162l.C1412s;

/* renamed from: p.b.q.x0 */
public class C1222x0 implements OnLongClickListener, OnHoverListener, OnAttachStateChangeListener {

    /* renamed from: n */
    public static C1222x0 f3485n;

    /* renamed from: o */
    public static C1222x0 f3486o;

    /* renamed from: e */
    public final View f3487e;

    /* renamed from: f */
    public final CharSequence f3488f;

    /* renamed from: g */
    public final int f3489g;

    /* renamed from: h */
    public final Runnable f3490h = new C1223a();

    /* renamed from: i */
    public final Runnable f3491i = new C1224b();

    /* renamed from: j */
    public int f3492j;

    /* renamed from: k */
    public int f3493k;

    /* renamed from: l */
    public C1226y0 f3494l;

    /* renamed from: m */
    public boolean f3495m;

    /* renamed from: p.b.q.x0$a */
    public class C1223a implements Runnable {
        public C1223a() {
        }

        public void run() {
            C1222x0.this.mo5396a(false);
        }
    }

    /* renamed from: p.b.q.x0$b */
    public class C1224b implements Runnable {
        public C1224b() {
        }

        public void run() {
            C1222x0.this.mo5397b();
        }
    }

    public C1222x0(View view, CharSequence charSequence) {
        this.f3487e = view;
        this.f3488f = charSequence;
        this.f3489g = C1412s.m3586a(ViewConfiguration.get(view.getContext()));
        mo5395a();
        this.f3487e.setOnLongClickListener(this);
        this.f3487e.setOnHoverListener(this);
    }

    /* renamed from: a */
    public static void m3080a(C1222x0 x0Var) {
        C1222x0 x0Var2 = f3485n;
        if (x0Var2 != null) {
            x0Var2.f3487e.removeCallbacks(x0Var2.f3490h);
        }
        f3485n = x0Var;
        if (x0Var != null) {
            x0Var.f3487e.postDelayed(x0Var.f3490h, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    /* renamed from: a */
    public final void mo5395a() {
        this.f3492j = Integer.MAX_VALUE;
        this.f3493k = Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public void mo5397b() {
        if (f3486o == this) {
            f3486o = null;
            C1226y0 y0Var = this.f3494l;
            if (y0Var != null) {
                y0Var.mo5404a();
                this.f3494l = null;
                mo5395a();
                this.f3487e.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f3485n == this) {
            m3080a((C1222x0) null);
        }
        this.f3487e.removeCallbacks(this.f3491i);
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.f3494l != null && this.f3495m) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f3487e.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                mo5395a();
                mo5397b();
            }
        } else if (this.f3487e.isEnabled() && this.f3494l == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.f3492j) > this.f3489g || Math.abs(y - this.f3493k) > this.f3489g) {
                this.f3492j = x;
                this.f3493k = y;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m3080a(this);
            }
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f3492j = view.getWidth() / 2;
        this.f3493k = view.getHeight() / 2;
        mo5396a(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo5397b();
    }

    /* renamed from: a */
    public void mo5396a(boolean z) {
        int i;
        int i2;
        long j;
        if (C1404o.m3562w(this.f3487e)) {
            m3080a((C1222x0) null);
            C1222x0 x0Var = f3486o;
            if (x0Var != null) {
                x0Var.mo5397b();
            }
            f3486o = this;
            this.f3495m = z;
            C1226y0 y0Var = new C1226y0(this.f3487e.getContext());
            this.f3494l = y0Var;
            View view = this.f3487e;
            int i3 = this.f3492j;
            int i4 = this.f3493k;
            boolean z2 = this.f3495m;
            CharSequence charSequence = this.f3488f;
            if (y0Var.f3500b.getParent() != null) {
                y0Var.mo5404a();
            }
            y0Var.f3501c.setText(charSequence);
            LayoutParams layoutParams = y0Var.f3502d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = y0Var.f3499a.getResources().getDimensionPixelOffset(C1021d.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i3 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = y0Var.f3499a.getResources().getDimensionPixelOffset(C1021d.tooltip_precise_anchor_extra_offset);
                i = i4 + dimensionPixelOffset2;
                i2 = i4 - dimensionPixelOffset2;
            } else {
                i = view.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = y0Var.f3499a.getResources().getDimensionPixelOffset(z2 ? C1021d.tooltip_y_offset_touch : C1021d.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof LayoutParams) || ((LayoutParams) layoutParams2).type != 2) {
                Context context = view.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(y0Var.f3503e);
                Rect rect = y0Var.f3503e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = y0Var.f3499a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    y0Var.f3503e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(y0Var.f3505g);
                view.getLocationOnScreen(y0Var.f3504f);
                int[] iArr = y0Var.f3504f;
                int i5 = iArr[0];
                int[] iArr2 = y0Var.f3505g;
                iArr[0] = i5 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i3) - (rootView.getWidth() / 2);
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                y0Var.f3500b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = y0Var.f3500b.getMeasuredHeight();
                int[] iArr3 = y0Var.f3504f;
                int i6 = ((iArr3[1] + i2) - dimensionPixelOffset3) - measuredHeight;
                int i7 = iArr3[1] + i + dimensionPixelOffset3;
                if (!z2 ? measuredHeight + i7 > y0Var.f3503e.height() : i6 >= 0) {
                    layoutParams.y = i6;
                } else {
                    layoutParams.y = i7;
                }
            }
            ((WindowManager) y0Var.f3499a.getSystemService("window")).addView(y0Var.f3500b, y0Var.f3502d);
            this.f3487e.addOnAttachStateChangeListener(this);
            if (this.f3495m) {
                j = 2500;
            } else {
                j = ((this.f3487e.getWindowSystemUiVisibility() & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f3487e.removeCallbacks(this.f3491i);
            this.f3487e.postDelayed(this.f3491i, j);
        }
    }
}
