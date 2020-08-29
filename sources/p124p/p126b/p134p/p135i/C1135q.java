package p124p.p126b.p134p.p135i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import p124p.p126b.C1021d;
import p124p.p126b.C1024g;
import p124p.p126b.p134p.p135i.C1129m.C1130a;
import p124p.p126b.p136q.C1157c0;
import p124p.p126b.p136q.C1182j0;

/* renamed from: p.b.p.i.q */
public final class C1135q extends C1126k implements OnDismissListener, OnItemClickListener, C1129m, OnKeyListener {

    /* renamed from: z */
    public static final int f3156z = C1024g.abc_popup_menu_item_layout;

    /* renamed from: f */
    public final Context f3157f;

    /* renamed from: g */
    public final C1114g f3158g;

    /* renamed from: h */
    public final C1113f f3159h;

    /* renamed from: i */
    public final boolean f3160i;

    /* renamed from: j */
    public final int f3161j;

    /* renamed from: k */
    public final int f3162k;

    /* renamed from: l */
    public final int f3163l;

    /* renamed from: m */
    public final C1182j0 f3164m;

    /* renamed from: n */
    public final OnGlobalLayoutListener f3165n = new C1136a();

    /* renamed from: o */
    public final OnAttachStateChangeListener f3166o = new C1137b();

    /* renamed from: p */
    public OnDismissListener f3167p;

    /* renamed from: q */
    public View f3168q;

    /* renamed from: r */
    public View f3169r;

    /* renamed from: s */
    public C1130a f3170s;

    /* renamed from: t */
    public ViewTreeObserver f3171t;

    /* renamed from: u */
    public boolean f3172u;

    /* renamed from: v */
    public boolean f3173v;

    /* renamed from: w */
    public int f3174w;

    /* renamed from: x */
    public int f3175x = 0;

    /* renamed from: y */
    public boolean f3176y;

    /* renamed from: p.b.p.i.q$a */
    public class C1136a implements OnGlobalLayoutListener {
        public C1136a() {
        }

        public void onGlobalLayout() {
            if (C1135q.this.mo4766a()) {
                C1135q qVar = C1135q.this;
                if (!qVar.f3164m.f3296E) {
                    View view = qVar.f3169r;
                    if (view == null || !view.isShown()) {
                        C1135q.this.dismiss();
                    } else {
                        C1135q.this.f3164m.mo4769c();
                    }
                }
            }
        }
    }

    /* renamed from: p.b.p.i.q$b */
    public class C1137b implements OnAttachStateChangeListener {
        public C1137b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C1135q.this.f3171t;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C1135q.this.f3171t = view.getViewTreeObserver();
                }
                C1135q qVar = C1135q.this;
                qVar.f3171t.removeGlobalOnLayoutListener(qVar.f3165n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C1135q(Context context, C1114g gVar, View view, int i, int i2, boolean z) {
        this.f3157f = context;
        this.f3158g = gVar;
        this.f3160i = z;
        this.f3159h = new C1113f(gVar, LayoutInflater.from(context), this.f3160i, f3156z);
        this.f3162k = i;
        this.f3163l = i2;
        Resources resources = context.getResources();
        this.f3161j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1021d.abc_config_prefDialogWidth));
        this.f3168q = view;
        this.f3164m = new C1182j0(this.f3157f, null, this.f3162k, this.f3163l);
        gVar.mo4807a((C1129m) this, context);
    }

    /* renamed from: a */
    public void mo4762a(int i) {
        this.f3175x = i;
    }

    /* renamed from: a */
    public void mo533a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public void mo4763a(View view) {
        this.f3168q = view;
    }

    /* renamed from: a */
    public void mo4764a(OnDismissListener onDismissListener) {
        this.f3167p = onDismissListener;
    }

    /* renamed from: a */
    public void mo4765a(C1114g gVar) {
    }

    /* renamed from: a */
    public void mo534a(C1114g gVar, boolean z) {
        if (gVar == this.f3158g) {
            dismiss();
            C1130a aVar = this.f3170s;
            if (aVar != null) {
                aVar.mo196a(gVar, z);
            }
        }
    }

    /* renamed from: a */
    public void mo535a(C1130a aVar) {
        this.f3170s = aVar;
    }

    /* renamed from: a */
    public void mo536a(boolean z) {
        this.f3173v = false;
        C1113f fVar = this.f3159h;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo4766a() {
        return !this.f3172u && this.f3164m.mo4766a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo538a(p124p.p126b.p134p.p135i.C1138r r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x0076
            p.b.p.i.l r0 = new p.b.p.i.l
            android.content.Context r3 = r9.f3157f
            android.view.View r5 = r9.f3169r
            boolean r6 = r9.f3160i
            int r7 = r9.f3162k
            int r8 = r9.f3163l
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            p.b.p.i.m$a r2 = r9.f3170s
            r0.mo4963a(r2)
            boolean r2 = p124p.p126b.p134p.p135i.C1126k.m2792b(r10)
            r0.f3149h = r2
            p.b.p.i.k r3 = r0.f3151j
            if (r3 == 0) goto L_0x002a
            r3.mo4768b(r2)
        L_0x002a:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f3167p
            r0.f3152k = r2
            r2 = 0
            r9.f3167p = r2
            p.b.p.i.g r2 = r9.f3158g
            r2.mo4808a(r1)
            p.b.q.j0 r2 = r9.f3164m
            int r3 = r2.f3303j
            boolean r4 = r2.f3306m
            if (r4 != 0) goto L_0x0040
            r2 = r1
            goto L_0x0042
        L_0x0040:
            int r2 = r2.f3304k
        L_0x0042:
            int r4 = r9.f3175x
            android.view.View r5 = r9.f3168q
            int r5 = p124p.p150h.p162l.C1404o.m3551l(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x005a
            android.view.View r4 = r9.f3168q
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L_0x005a:
            boolean r4 = r0.mo4964b()
            r5 = 1
            if (r4 == 0) goto L_0x0062
            goto L_0x006b
        L_0x0062:
            android.view.View r4 = r0.f3147f
            if (r4 != 0) goto L_0x0068
            r0 = r1
            goto L_0x006c
        L_0x0068:
            r0.mo4962a(r3, r2, r5, r5)
        L_0x006b:
            r0 = r5
        L_0x006c:
            if (r0 == 0) goto L_0x0076
            p.b.p.i.m$a r0 = r9.f3170s
            if (r0 == 0) goto L_0x0075
            r0.mo197a(r10)
        L_0x0075:
            return r5
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p134p.p135i.C1135q.mo538a(p.b.p.i.r):boolean");
    }

    /* renamed from: b */
    public void mo4768b(boolean z) {
        this.f3159h.f3067g = z;
    }

    /* renamed from: b */
    public boolean mo539b() {
        return false;
    }

    /* renamed from: c */
    public void mo4770c(int i) {
        C1182j0 j0Var = this.f3164m;
        j0Var.f3304k = i;
        j0Var.f3306m = true;
    }

    /* renamed from: c */
    public void mo4772c(boolean z) {
        this.f3176y = z;
    }

    /* renamed from: d */
    public Parcelable mo541d() {
        return null;
    }

    public void dismiss() {
        if (mo4766a()) {
            this.f3164m.dismiss();
        }
    }

    /* renamed from: e */
    public ListView mo4774e() {
        return this.f3164m.f3300g;
    }

    public void onDismiss() {
        this.f3172u = true;
        this.f3158g.mo4808a(true);
        ViewTreeObserver viewTreeObserver = this.f3171t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f3171t = this.f3169r.getViewTreeObserver();
            }
            this.f3171t.removeGlobalOnLayoutListener(this.f3165n);
            this.f3171t = null;
        }
        this.f3169r.removeOnAttachStateChangeListener(this.f3166o);
        OnDismissListener onDismissListener = this.f3167p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: b */
    public void mo4767b(int i) {
        this.f3164m.f3303j = i;
    }

    /* renamed from: c */
    public void mo4769c() {
        boolean z = true;
        if (!mo4766a()) {
            if (!this.f3172u) {
                View view = this.f3168q;
                if (view != null) {
                    this.f3169r = view;
                    this.f3164m.f3297F.setOnDismissListener(this);
                    C1182j0 j0Var = this.f3164m;
                    j0Var.f3316w = this;
                    j0Var.mo5161a(true);
                    View view2 = this.f3169r;
                    boolean z2 = this.f3171t == null;
                    ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                    this.f3171t = viewTreeObserver;
                    if (z2) {
                        viewTreeObserver.addOnGlobalLayoutListener(this.f3165n);
                    }
                    view2.addOnAttachStateChangeListener(this.f3166o);
                    C1182j0 j0Var2 = this.f3164m;
                    j0Var2.f3315v = view2;
                    j0Var2.f3309p = this.f3175x;
                    if (!this.f3173v) {
                        this.f3174w = C1126k.m2791a(this.f3159h, null, this.f3157f, this.f3161j);
                        this.f3173v = true;
                    }
                    this.f3164m.mo5165d(this.f3174w);
                    this.f3164m.f3297F.setInputMethodMode(2);
                    C1182j0 j0Var3 = this.f3164m;
                    Rect rect = this.f3141e;
                    if (j0Var3 != null) {
                        j0Var3.f3295D = rect != null ? new Rect(rect) : null;
                        this.f3164m.mo4769c();
                        C1157c0 c0Var = this.f3164m.f3300g;
                        c0Var.setOnKeyListener(this);
                        if (this.f3176y && this.f3158g.f3084m != null) {
                            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f3157f).inflate(C1024g.abc_popup_menu_header_item_layout, c0Var, false);
                            TextView textView = (TextView) frameLayout.findViewById(16908310);
                            if (textView != null) {
                                textView.setText(this.f3158g.f3084m);
                            }
                            frameLayout.setEnabled(false);
                            c0Var.addHeaderView(frameLayout, null, false);
                        }
                        this.f3164m.mo248a((ListAdapter) this.f3159h);
                        this.f3164m.mo4769c();
                    } else {
                        throw null;
                    }
                }
            }
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }
}
