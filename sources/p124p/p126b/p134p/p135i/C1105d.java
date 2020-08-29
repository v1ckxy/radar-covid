package p124p.p126b.p134p.p135i;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import java.util.ArrayList;
import java.util.List;
import p124p.p126b.C1021d;
import p124p.p126b.C1024g;
import p124p.p126b.p134p.p135i.C1129m.C1130a;
import p124p.p126b.p136q.C1180i0;
import p124p.p126b.p136q.C1182j0;
import p124p.p150h.p162l.C1404o;

/* renamed from: p.b.p.i.d */
public final class C1105d extends C1126k implements C1129m, OnKeyListener, OnDismissListener {

    /* renamed from: F */
    public static final int f3017F = C1024g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    public boolean f3018A;

    /* renamed from: B */
    public C1130a f3019B;

    /* renamed from: C */
    public ViewTreeObserver f3020C;

    /* renamed from: D */
    public OnDismissListener f3021D;

    /* renamed from: E */
    public boolean f3022E;

    /* renamed from: f */
    public final Context f3023f;

    /* renamed from: g */
    public final int f3024g;

    /* renamed from: h */
    public final int f3025h;

    /* renamed from: i */
    public final int f3026i;

    /* renamed from: j */
    public final boolean f3027j;

    /* renamed from: k */
    public final Handler f3028k;

    /* renamed from: l */
    public final List<C1114g> f3029l = new ArrayList();

    /* renamed from: m */
    public final List<C1110d> f3030m = new ArrayList();

    /* renamed from: n */
    public final OnGlobalLayoutListener f3031n = new C1106a();

    /* renamed from: o */
    public final OnAttachStateChangeListener f3032o = new C1107b();

    /* renamed from: p */
    public final C1180i0 f3033p = new C1108c();

    /* renamed from: q */
    public int f3034q;

    /* renamed from: r */
    public int f3035r;

    /* renamed from: s */
    public View f3036s;

    /* renamed from: t */
    public View f3037t;

    /* renamed from: u */
    public int f3038u;

    /* renamed from: v */
    public boolean f3039v;

    /* renamed from: w */
    public boolean f3040w;

    /* renamed from: x */
    public int f3041x;

    /* renamed from: y */
    public int f3042y;

    /* renamed from: z */
    public boolean f3043z;

    /* renamed from: p.b.p.i.d$a */
    public class C1106a implements OnGlobalLayoutListener {
        public C1106a() {
        }

        public void onGlobalLayout() {
            if (C1105d.this.mo4766a() && C1105d.this.f3030m.size() > 0 && !((C1110d) C1105d.this.f3030m.get(0)).f3051a.f3296E) {
                View view = C1105d.this.f3037t;
                if (view == null || !view.isShown()) {
                    C1105d.this.dismiss();
                    return;
                }
                for (C1110d dVar : C1105d.this.f3030m) {
                    dVar.f3051a.mo4769c();
                }
            }
        }
    }

    /* renamed from: p.b.p.i.d$b */
    public class C1107b implements OnAttachStateChangeListener {
        public C1107b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C1105d.this.f3020C;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C1105d.this.f3020C = view.getViewTreeObserver();
                }
                C1105d dVar = C1105d.this;
                dVar.f3020C.removeGlobalOnLayoutListener(dVar.f3031n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: p.b.p.i.d$c */
    public class C1108c implements C1180i0 {

        /* renamed from: p.b.p.i.d$c$a */
        public class C1109a implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ C1110d f3047e;

            /* renamed from: f */
            public final /* synthetic */ MenuItem f3048f;

            /* renamed from: g */
            public final /* synthetic */ C1114g f3049g;

            public C1109a(C1110d dVar, MenuItem menuItem, C1114g gVar) {
                this.f3047e = dVar;
                this.f3048f = menuItem;
                this.f3049g = gVar;
            }

            public void run() {
                C1110d dVar = this.f3047e;
                if (dVar != null) {
                    C1105d.this.f3022E = true;
                    dVar.f3052b.mo4808a(false);
                    C1105d.this.f3022E = false;
                }
                if (this.f3048f.isEnabled() && this.f3048f.hasSubMenu()) {
                    this.f3049g.mo4809a(this.f3048f, 4);
                }
            }
        }

        public C1108c() {
        }

        /* renamed from: a */
        public void mo4781a(C1114g gVar, MenuItem menuItem) {
            C1110d dVar = null;
            C1105d.this.f3028k.removeCallbacksAndMessages(null);
            int size = C1105d.this.f3030m.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == ((C1110d) C1105d.this.f3030m.get(i)).f3052b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C1105d.this.f3030m.size()) {
                    dVar = (C1110d) C1105d.this.f3030m.get(i2);
                }
                C1105d.this.f3028k.postAtTime(new C1109a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: b */
        public void mo4782b(C1114g gVar, MenuItem menuItem) {
            C1105d.this.f3028k.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: p.b.p.i.d$d */
    public static class C1110d {

        /* renamed from: a */
        public final C1182j0 f3051a;

        /* renamed from: b */
        public final C1114g f3052b;

        /* renamed from: c */
        public final int f3053c;

        public C1110d(C1182j0 j0Var, C1114g gVar, int i) {
            this.f3051a = j0Var;
            this.f3052b = gVar;
            this.f3053c = i;
        }
    }

    public C1105d(Context context, View view, int i, int i2, boolean z) {
        int i3 = 0;
        this.f3034q = 0;
        this.f3035r = 0;
        this.f3023f = context;
        this.f3036s = view;
        this.f3025h = i;
        this.f3026i = i2;
        this.f3027j = z;
        this.f3043z = false;
        if (C1404o.m3551l(view) != 1) {
            i3 = 1;
        }
        this.f3038u = i3;
        Resources resources = context.getResources();
        this.f3024g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1021d.abc_config_prefDialogWidth));
        this.f3028k = new Handler();
    }

    /* renamed from: a */
    public void mo533a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public void mo4764a(OnDismissListener onDismissListener) {
        this.f3021D = onDismissListener;
    }

    /* renamed from: a */
    public void mo4765a(C1114g gVar) {
        gVar.mo4807a((C1129m) this, this.f3023f);
        if (mo4766a()) {
            mo4771c(gVar);
        } else {
            this.f3029l.add(gVar);
        }
    }

    /* renamed from: a */
    public void mo534a(C1114g gVar, boolean z) {
        int size = this.f3030m.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (gVar == ((C1110d) this.f3030m.get(i)).f3052b) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < this.f3030m.size()) {
                ((C1110d) this.f3030m.get(i2)).f3052b.mo4808a(false);
            }
            C1110d dVar = (C1110d) this.f3030m.remove(i);
            dVar.f3052b.mo4806a((C1129m) this);
            if (this.f3022E) {
                dVar.f3051a.f3297F.setExitTransition(null);
                dVar.f3051a.f3297F.setAnimationStyle(0);
            }
            dVar.f3051a.dismiss();
            int size2 = this.f3030m.size();
            int i3 = size2 > 0 ? ((C1110d) this.f3030m.get(size2 - 1)).f3053c : C1404o.m3551l(this.f3036s) == 1 ? 0 : 1;
            this.f3038u = i3;
            if (size2 == 0) {
                dismiss();
                C1130a aVar = this.f3019B;
                if (aVar != null) {
                    aVar.mo196a(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f3020C;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f3020C.removeGlobalOnLayoutListener(this.f3031n);
                    }
                    this.f3020C = null;
                }
                this.f3037t.removeOnAttachStateChangeListener(this.f3032o);
                this.f3021D.onDismiss();
            } else if (z) {
                ((C1110d) this.f3030m.get(0)).f3052b.mo4808a(false);
            }
        }
    }

    /* renamed from: a */
    public void mo535a(C1130a aVar) {
        this.f3019B = aVar;
    }

    /* renamed from: a */
    public boolean mo4766a() {
        return this.f3030m.size() > 0 && ((C1110d) this.f3030m.get(0)).f3051a.mo4766a();
    }

    /* renamed from: b */
    public void mo4767b(int i) {
        this.f3039v = true;
        this.f3041x = i;
    }

    /* renamed from: b */
    public void mo4768b(boolean z) {
        this.f3043z = z;
    }

    /* renamed from: b */
    public boolean mo539b() {
        return false;
    }

    /* renamed from: c */
    public void mo4769c() {
        if (!mo4766a()) {
            for (C1114g c : this.f3029l) {
                mo4771c(c);
            }
            this.f3029l.clear();
            View view = this.f3036s;
            this.f3037t = view;
            if (view != null) {
                boolean z = this.f3020C == null;
                ViewTreeObserver viewTreeObserver = this.f3037t.getViewTreeObserver();
                this.f3020C = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f3031n);
                }
                this.f3037t.addOnAttachStateChangeListener(this.f3032o);
            }
        }
    }

    /* renamed from: c */
    public void mo4770c(int i) {
        this.f3040w = true;
        this.f3042y = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0143, code lost:
        if (((r9.getWidth() + r11[0]) + r4) > r10.right) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0149, code lost:
        if ((r11[0] - r4) < 0) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014d, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b2  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4771c(p124p.p126b.p134p.p135i.C1114g r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.content.Context r2 = r0.f3023f
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            p.b.p.i.f r3 = new p.b.p.i.f
            boolean r4 = r0.f3027j
            int r5 = f3017F
            r3.<init>(r1, r2, r4, r5)
            boolean r4 = r16.mo4766a()
            r5 = 1
            if (r4 != 0) goto L_0x0021
            boolean r4 = r0.f3043z
            if (r4 == 0) goto L_0x0021
            r3.f3067g = r5
            goto L_0x002d
        L_0x0021:
            boolean r4 = r16.mo4766a()
            if (r4 == 0) goto L_0x002d
            boolean r4 = p124p.p126b.p134p.p135i.C1126k.m2792b(r17)
            r3.f3067g = r4
        L_0x002d:
            android.content.Context r4 = r0.f3023f
            int r6 = r0.f3024g
            r7 = 0
            int r4 = p124p.p126b.p134p.p135i.C1126k.m2791a(r3, r7, r4, r6)
            p.b.q.j0 r6 = new p.b.q.j0
            android.content.Context r8 = r0.f3023f
            int r9 = r0.f3025h
            int r10 = r0.f3026i
            r6.<init>(r8, r7, r9, r10)
            p.b.q.i0 r8 = r0.f3033p
            r6.f3338J = r8
            r6.f3316w = r0
            android.widget.PopupWindow r8 = r6.f3297F
            r8.setOnDismissListener(r0)
            android.view.View r8 = r0.f3036s
            r6.f3315v = r8
            int r8 = r0.f3035r
            r6.f3309p = r8
            r6.mo5161a(r5)
            android.widget.PopupWindow r8 = r6.f3297F
            r9 = 2
            r8.setInputMethodMode(r9)
            r6.mo248a(r3)
            r6.mo5165d(r4)
            int r3 = r0.f3035r
            r6.f3309p = r3
            java.util.List<p.b.p.i.d$d> r3 = r0.f3030m
            int r3 = r3.size()
            r8 = 0
            if (r3 <= 0) goto L_0x00e5
            java.util.List<p.b.p.i.d$d> r3 = r0.f3030m
            int r10 = r3.size()
            int r10 = r10 - r5
            java.lang.Object r3 = r3.get(r10)
            p.b.p.i.d$d r3 = (p124p.p126b.p134p.p135i.C1105d.C1110d) r3
            p.b.p.i.g r10 = r3.f3052b
            int r11 = r10.size()
            r12 = r8
        L_0x0084:
            if (r12 >= r11) goto L_0x009a
            android.view.MenuItem r13 = r10.getItem(r12)
            boolean r14 = r13.hasSubMenu()
            if (r14 == 0) goto L_0x0097
            android.view.SubMenu r14 = r13.getSubMenu()
            if (r1 != r14) goto L_0x0097
            goto L_0x009b
        L_0x0097:
            int r12 = r12 + 1
            goto L_0x0084
        L_0x009a:
            r13 = r7
        L_0x009b:
            if (r13 != 0) goto L_0x009e
            goto L_0x00e7
        L_0x009e:
            p.b.q.j0 r10 = r3.f3051a
            p.b.q.c0 r10 = r10.f3300g
            android.widget.ListAdapter r11 = r10.getAdapter()
            boolean r12 = r11 instanceof android.widget.HeaderViewListAdapter
            if (r12 == 0) goto L_0x00b7
            android.widget.HeaderViewListAdapter r11 = (android.widget.HeaderViewListAdapter) r11
            int r12 = r11.getHeadersCount()
            android.widget.ListAdapter r11 = r11.getWrappedAdapter()
            p.b.p.i.f r11 = (p124p.p126b.p134p.p135i.C1113f) r11
            goto L_0x00ba
        L_0x00b7:
            p.b.p.i.f r11 = (p124p.p126b.p134p.p135i.C1113f) r11
            r12 = r8
        L_0x00ba:
            int r14 = r11.getCount()
            r15 = r8
        L_0x00bf:
            r9 = -1
            if (r15 >= r14) goto L_0x00cd
            p.b.p.i.i r7 = r11.getItem(r15)
            if (r13 != r7) goto L_0x00c9
            goto L_0x00ce
        L_0x00c9:
            int r15 = r15 + 1
            r7 = 0
            goto L_0x00bf
        L_0x00cd:
            r15 = r9
        L_0x00ce:
            if (r15 != r9) goto L_0x00d1
            goto L_0x00e6
        L_0x00d1:
            int r15 = r15 + r12
            int r7 = r10.getFirstVisiblePosition()
            int r15 = r15 - r7
            if (r15 < 0) goto L_0x00e6
            int r7 = r10.getChildCount()
            if (r15 < r7) goto L_0x00e0
            goto L_0x00e6
        L_0x00e0:
            android.view.View r7 = r10.getChildAt(r15)
            goto L_0x00e7
        L_0x00e5:
            r3 = 0
        L_0x00e6:
            r7 = 0
        L_0x00e7:
            if (r7 == 0) goto L_0x01b2
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r9 > r10) goto L_0x0109
            java.lang.reflect.Method r9 = p124p.p126b.p136q.C1182j0.f3337K
            if (r9 == 0) goto L_0x010e
            android.widget.PopupWindow r10 = r6.f3297F     // Catch:{ Exception -> 0x0101 }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0101 }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r8)     // Catch:{ Exception -> 0x0101 }
            r11[r8] = r12     // Catch:{ Exception -> 0x0101 }
            r9.invoke(r10, r11)     // Catch:{ Exception -> 0x0101 }
            goto L_0x010e
        L_0x0101:
            java.lang.String r9 = "MenuPopupWindow"
            java.lang.String r10 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r9, r10)
            goto L_0x010e
        L_0x0109:
            android.widget.PopupWindow r9 = r6.f3297F
            r9.setTouchModal(r8)
        L_0x010e:
            android.widget.PopupWindow r9 = r6.f3297F
            r10 = 0
            r9.setEnterTransition(r10)
            java.util.List<p.b.p.i.d$d> r9 = r0.f3030m
            int r10 = r9.size()
            int r10 = r10 - r5
            java.lang.Object r9 = r9.get(r10)
            p.b.p.i.d$d r9 = (p124p.p126b.p134p.p135i.C1105d.C1110d) r9
            p.b.q.j0 r9 = r9.f3051a
            p.b.q.c0 r9 = r9.f3300g
            r10 = 2
            int[] r11 = new int[r10]
            r9.getLocationOnScreen(r11)
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            android.view.View r12 = r0.f3037t
            r12.getWindowVisibleDisplayFrame(r10)
            int r12 = r0.f3038u
            if (r12 != r5) goto L_0x0146
            r11 = r11[r8]
            int r9 = r9.getWidth()
            int r9 = r9 + r11
            int r9 = r9 + r4
            int r10 = r10.right
            if (r9 <= r10) goto L_0x014b
            goto L_0x014d
        L_0x0146:
            r9 = r11[r8]
            int r9 = r9 - r4
            if (r9 >= 0) goto L_0x014d
        L_0x014b:
            r9 = r5
            goto L_0x014e
        L_0x014d:
            r9 = r8
        L_0x014e:
            if (r9 != r5) goto L_0x0152
            r10 = r5
            goto L_0x0153
        L_0x0152:
            r10 = r8
        L_0x0153:
            r0.f3038u = r9
            int r9 = android.os.Build.VERSION.SDK_INT
            r11 = 26
            r12 = 5
            if (r9 < r11) goto L_0x0161
            r6.f3315v = r7
            r9 = r8
            r13 = r9
            goto L_0x0192
        L_0x0161:
            r9 = 2
            int[] r11 = new int[r9]
            android.view.View r13 = r0.f3036s
            r13.getLocationOnScreen(r11)
            int[] r9 = new int[r9]
            r7.getLocationOnScreen(r9)
            int r13 = r0.f3035r
            r13 = r13 & 7
            if (r13 != r12) goto L_0x0188
            r13 = r11[r8]
            android.view.View r14 = r0.f3036s
            int r14 = r14.getWidth()
            int r14 = r14 + r13
            r11[r8] = r14
            r13 = r9[r8]
            int r14 = r7.getWidth()
            int r14 = r14 + r13
            r9[r8] = r14
        L_0x0188:
            r13 = r9[r8]
            r14 = r11[r8]
            int r13 = r13 - r14
            r9 = r9[r5]
            r11 = r11[r5]
            int r9 = r9 - r11
        L_0x0192:
            int r11 = r0.f3035r
            r11 = r11 & r12
            if (r11 != r12) goto L_0x019f
            if (r10 == 0) goto L_0x019a
            goto L_0x01a5
        L_0x019a:
            int r4 = r7.getWidth()
            goto L_0x01a7
        L_0x019f:
            if (r10 == 0) goto L_0x01a7
            int r4 = r7.getWidth()
        L_0x01a5:
            int r13 = r13 + r4
            goto L_0x01a8
        L_0x01a7:
            int r13 = r13 - r4
        L_0x01a8:
            r6.f3303j = r13
            r6.f3308o = r5
            r6.f3307n = r5
            r6.mo5159a(r9)
            goto L_0x01d0
        L_0x01b2:
            boolean r4 = r0.f3039v
            if (r4 == 0) goto L_0x01ba
            int r4 = r0.f3041x
            r6.f3303j = r4
        L_0x01ba:
            boolean r4 = r0.f3040w
            if (r4 == 0) goto L_0x01c3
            int r4 = r0.f3042y
            r6.mo5159a(r4)
        L_0x01c3:
            android.graphics.Rect r4 = r0.f3141e
            if (r4 == 0) goto L_0x01cd
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r4)
            goto L_0x01ce
        L_0x01cd:
            r10 = 0
        L_0x01ce:
            r6.f3295D = r10
        L_0x01d0:
            p.b.p.i.d$d r4 = new p.b.p.i.d$d
            int r5 = r0.f3038u
            r4.<init>(r6, r1, r5)
            java.util.List<p.b.p.i.d$d> r5 = r0.f3030m
            r5.add(r4)
            r6.mo4769c()
            p.b.q.c0 r4 = r6.f3300g
            r4.setOnKeyListener(r0)
            if (r3 != 0) goto L_0x020e
            boolean r3 = r0.f3018A
            if (r3 == 0) goto L_0x020e
            java.lang.CharSequence r3 = r1.f3084m
            if (r3 == 0) goto L_0x020e
            int r3 = p124p.p126b.C1024g.abc_popup_menu_header_item_layout
            android.view.View r2 = r2.inflate(r3, r4, r8)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.setEnabled(r8)
            java.lang.CharSequence r1 = r1.f3084m
            r3.setText(r1)
            r1 = 0
            r4.addHeaderView(r2, r1, r8)
            r6.mo4769c()
        L_0x020e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p134p.p135i.C1105d.mo4771c(p.b.p.i.g):void");
    }

    /* renamed from: c */
    public void mo4772c(boolean z) {
        this.f3018A = z;
    }

    /* renamed from: d */
    public Parcelable mo541d() {
        return null;
    }

    public void dismiss() {
        int size = this.f3030m.size();
        if (size > 0) {
            C1110d[] dVarArr = (C1110d[]) this.f3030m.toArray(new C1110d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C1110d dVar = dVarArr[i];
                if (dVar.f3051a.mo4766a()) {
                    dVar.f3051a.dismiss();
                }
            }
        }
    }

    /* renamed from: e */
    public ListView mo4774e() {
        if (this.f3030m.isEmpty()) {
            return null;
        }
        List<C1110d> list = this.f3030m;
        return ((C1110d) list.get(list.size() - 1)).f3051a.f3300g;
    }

    /* renamed from: f */
    public boolean mo4775f() {
        return false;
    }

    public void onDismiss() {
        C1110d dVar;
        int size = this.f3030m.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (C1110d) this.f3030m.get(i);
            if (!dVar.f3051a.mo4766a()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f3052b.mo4808a(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: a */
    public boolean mo538a(C1138r rVar) {
        for (C1110d dVar : this.f3030m) {
            if (rVar == dVar.f3052b) {
                dVar.f3051a.f3300g.requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        rVar.mo4807a((C1129m) this, this.f3023f);
        if (mo4766a()) {
            mo4771c((C1114g) rVar);
        } else {
            this.f3029l.add(rVar);
        }
        C1130a aVar = this.f3019B;
        if (aVar != null) {
            aVar.mo197a(rVar);
        }
        return true;
    }

    /* renamed from: a */
    public void mo4763a(View view) {
        if (this.f3036s != view) {
            this.f3036s = view;
            this.f3035r = Gravity.getAbsoluteGravity(this.f3034q, C1404o.m3551l(view));
        }
    }

    /* renamed from: a */
    public void mo4762a(int i) {
        if (this.f3034q != i) {
            this.f3034q = i;
            this.f3035r = Gravity.getAbsoluteGravity(i, C1404o.m3551l(this.f3036s));
        }
    }

    /* renamed from: a */
    public void mo536a(boolean z) {
        for (C1110d dVar : this.f3030m) {
            ListAdapter adapter = dVar.f3051a.f3300g.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C1113f) adapter).notifyDataSetChanged();
        }
    }
}
