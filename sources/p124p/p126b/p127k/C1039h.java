package p124p.p126b.p127k;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.List;
import java.util.Map;
import p124p.p126b.C1018a;
import p124p.p126b.C1020c;
import p124p.p126b.C1023f;
import p124p.p126b.C1024g;
import p124p.p126b.C1027j;
import p124p.p126b.p128l.p129a.C1070a;
import p124p.p126b.p134p.C1089a;
import p124p.p126b.p134p.C1089a.C1090a;
import p124p.p126b.p134p.C1092c;
import p124p.p126b.p134p.C1101h;
import p124p.p126b.p134p.p135i.C1111e;
import p124p.p126b.p134p.p135i.C1114g;
import p124p.p126b.p134p.p135i.C1114g.C1115a;
import p124p.p126b.p134p.p135i.C1129m;
import p124p.p126b.p134p.p135i.C1129m.C1130a;
import p124p.p126b.p136q.C1143a1;
import p124p.p126b.p136q.C1178i;
import p124p.p126b.p136q.C1213u0;
import p124p.p126b.p136q.C1227z;
import p124p.p143e.C1248a;
import p124p.p150h.p162l.C1401l;
import p124p.p150h.p162l.C1404o;
import p124p.p150h.p162l.C1413t;
import p124p.p150h.p162l.C1416u;
import p124p.p150h.p162l.C1417v;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.b.k.h */
public class C1039h extends C1038g implements C1115a, Factory2 {

    /* renamed from: d0 */
    public static final Map<Class<?>, Integer> f2689d0 = new C1248a();

    /* renamed from: e0 */
    public static final boolean f2690e0 = false;

    /* renamed from: f0 */
    public static final int[] f2691f0 = {16842836};

    /* renamed from: g0 */
    public static boolean f2692g0 = true;

    /* renamed from: h0 */
    public static final boolean f2693h0;

    /* renamed from: A */
    public View f2694A;

    /* renamed from: B */
    public boolean f2695B;

    /* renamed from: C */
    public boolean f2696C;

    /* renamed from: D */
    public boolean f2697D;

    /* renamed from: E */
    public boolean f2698E;

    /* renamed from: F */
    public boolean f2699F;

    /* renamed from: G */
    public boolean f2700G;

    /* renamed from: H */
    public boolean f2701H;

    /* renamed from: I */
    public boolean f2702I;

    /* renamed from: J */
    public C1051j[] f2703J;

    /* renamed from: K */
    public C1051j f2704K;

    /* renamed from: L */
    public boolean f2705L;

    /* renamed from: M */
    public boolean f2706M;

    /* renamed from: N */
    public boolean f2707N;

    /* renamed from: O */
    public boolean f2708O;

    /* renamed from: P */
    public boolean f2709P;

    /* renamed from: Q */
    public int f2710Q = -100;

    /* renamed from: R */
    public int f2711R;

    /* renamed from: S */
    public boolean f2712S;

    /* renamed from: T */
    public boolean f2713T;

    /* renamed from: U */
    public C1047g f2714U;

    /* renamed from: V */
    public C1047g f2715V;

    /* renamed from: W */
    public boolean f2716W;

    /* renamed from: X */
    public int f2717X;

    /* renamed from: Y */
    public final Runnable f2718Y = new C1041b();

    /* renamed from: Z */
    public boolean f2719Z;

    /* renamed from: a0 */
    public Rect f2720a0;

    /* renamed from: b0 */
    public Rect f2721b0;

    /* renamed from: c0 */
    public AppCompatViewInflater f2722c0;

    /* renamed from: g */
    public final Object f2723g;

    /* renamed from: h */
    public final Context f2724h;

    /* renamed from: i */
    public Window f2725i;

    /* renamed from: j */
    public C1045e f2726j;

    /* renamed from: k */
    public final C1037f f2727k;

    /* renamed from: l */
    public C1028a f2728l;

    /* renamed from: m */
    public MenuInflater f2729m;

    /* renamed from: n */
    public CharSequence f2730n;

    /* renamed from: o */
    public C1227z f2731o;

    /* renamed from: p */
    public C1042c f2732p;

    /* renamed from: q */
    public C1052k f2733q;

    /* renamed from: r */
    public C1089a f2734r;

    /* renamed from: s */
    public ActionBarContextView f2735s;

    /* renamed from: t */
    public PopupWindow f2736t;

    /* renamed from: u */
    public Runnable f2737u;

    /* renamed from: v */
    public C1413t f2738v = null;

    /* renamed from: w */
    public boolean f2739w = true;

    /* renamed from: x */
    public boolean f2740x;

    /* renamed from: y */
    public ViewGroup f2741y;

    /* renamed from: z */
    public TextView f2742z;

    /* renamed from: p.b.k.h$a */
    public static class C1040a implements UncaughtExceptionHandler {

        /* renamed from: a */
        public final /* synthetic */ UncaughtExceptionHandler f2743a;

        public C1040a(UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f2743a = uncaughtExceptionHandler;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            boolean z = false;
            if (th instanceof NotFoundException) {
                String message = th.getMessage();
                if (message != null && (message.contains("drawable") || message.contains("Drawable"))) {
                    z = true;
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append(th.getMessage());
                sb.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                NotFoundException notFoundException = new NotFoundException(sb.toString());
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f2743a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f2743a.uncaughtException(thread, th);
        }
    }

    /* renamed from: p.b.k.h$b */
    public class C1041b implements Runnable {
        public C1041b() {
        }

        public void run() {
            C1039h hVar = C1039h.this;
            if ((hVar.f2717X & 1) != 0) {
                hVar.mo4477c(0);
            }
            C1039h hVar2 = C1039h.this;
            if ((hVar2.f2717X & 4096) != 0) {
                hVar2.mo4477c(108);
            }
            C1039h hVar3 = C1039h.this;
            hVar3.f2716W = false;
            hVar3.f2717X = 0;
        }
    }

    /* renamed from: p.b.k.h$c */
    public final class C1042c implements C1130a {
        public C1042c() {
        }

        /* renamed from: a */
        public void mo196a(C1114g gVar, boolean z) {
            C1039h.this.mo4475b(gVar);
        }

        /* renamed from: a */
        public boolean mo197a(C1114g gVar) {
            Callback i = C1039h.this.mo4486i();
            if (i != null) {
                i.onMenuOpened(108, gVar);
            }
            return true;
        }
    }

    /* renamed from: p.b.k.h$d */
    public class C1043d implements C1090a {

        /* renamed from: a */
        public C1090a f2746a;

        /* renamed from: p.b.k.h$d$a */
        public class C1044a extends C1417v {
            public C1044a() {
            }

            /* renamed from: b */
            public void mo4498b(View view) {
                C1039h.this.f2735s.setVisibility(8);
                C1039h hVar = C1039h.this;
                PopupWindow popupWindow = hVar.f2736t;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.f2735s.getParent() instanceof View) {
                    C1404o.m3508C((View) C1039h.this.f2735s.getParent());
                }
                C1039h.this.f2735s.removeAllViews();
                C1039h.this.f2738v.mo5912a((C1416u) null);
                C1039h.this.f2738v = null;
            }
        }

        public C1043d(C1090a aVar) {
            this.f2746a = aVar;
        }

        /* renamed from: a */
        public void mo4494a(C1089a aVar) {
            this.f2746a.mo4494a(aVar);
            C1039h hVar = C1039h.this;
            if (hVar.f2736t != null) {
                hVar.f2725i.getDecorView().removeCallbacks(C1039h.this.f2737u);
            }
            C1039h hVar2 = C1039h.this;
            if (hVar2.f2735s != null) {
                hVar2.mo4480e();
                C1039h hVar3 = C1039h.this;
                C1413t a = C1404o.m3511a(hVar3.f2735s);
                a.mo5910a(0.0f);
                hVar3.f2738v = a;
                C1413t tVar = C1039h.this.f2738v;
                C1044a aVar2 = new C1044a();
                View view = (View) tVar.f4179a.get();
                if (view != null) {
                    tVar.mo5915a(view, aVar2);
                }
            }
            C1039h hVar4 = C1039h.this;
            C1037f fVar = hVar4.f2727k;
            if (fVar != null) {
                fVar.mo4434b(hVar4.f2734r);
            }
            C1039h.this.f2734r = null;
        }

        /* renamed from: a */
        public boolean mo4495a(C1089a aVar, Menu menu) {
            return this.f2746a.mo4495a(aVar, menu);
        }

        /* renamed from: a */
        public boolean mo4496a(C1089a aVar, MenuItem menuItem) {
            return this.f2746a.mo4496a(aVar, menuItem);
        }

        /* renamed from: b */
        public boolean mo4497b(C1089a aVar, Menu menu) {
            return this.f2746a.mo4497b(aVar, menu);
        }
    }

    /* renamed from: p.b.k.h$e */
    public class C1045e extends C1101h {
        public C1045e(Callback callback) {
            super(callback);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x01a5  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.ActionMode mo4499a(android.view.ActionMode.Callback r10) {
            /*
                r9 = this;
                p.b.p.e$a r0 = new p.b.p.e$a
                p.b.k.h r1 = p124p.p126b.p127k.C1039h.this
                android.content.Context r1 = r1.f2724h
                r0.<init>(r1, r10)
                p.b.k.h r10 = p124p.p126b.p127k.C1039h.this
                r1 = 0
                if (r10 == 0) goto L_0x01ba
                p.b.p.a r2 = r10.f2734r
                if (r2 == 0) goto L_0x0015
                r2.mo4540a()
            L_0x0015:
                p.b.k.h$d r2 = new p.b.k.h$d
                r2.<init>(r0)
                r10.mo4487j()
                p.b.k.a r3 = r10.f2728l
                if (r3 == 0) goto L_0x0030
                p.b.p.a r3 = r3.mo4408a(r2)
                r10.f2734r = r3
                if (r3 == 0) goto L_0x0030
                p.b.k.f r4 = r10.f2727k
                if (r4 == 0) goto L_0x0030
                r4.mo4431a(r3)
            L_0x0030:
                p.b.p.a r3 = r10.f2734r
                if (r3 != 0) goto L_0x01b0
                r10.mo4480e()
                p.b.p.a r3 = r10.f2734r
                if (r3 == 0) goto L_0x003e
                r3.mo4540a()
            L_0x003e:
                p.b.k.f r3 = r10.f2727k
                if (r3 == 0) goto L_0x004b
                boolean r4 = r10.f2709P
                if (r4 != 0) goto L_0x004b
                p.b.p.a r3 = r3.mo4430a(r2)     // Catch:{ AbstractMethodError -> 0x004b }
                goto L_0x004c
            L_0x004b:
                r3 = r1
            L_0x004c:
                if (r3 == 0) goto L_0x0052
                r10.f2734r = r3
                goto L_0x01a1
            L_0x0052:
                androidx.appcompat.widget.ActionBarContextView r3 = r10.f2735s
                r4 = 0
                r5 = 1
                if (r3 != 0) goto L_0x010a
                boolean r3 = r10.f2700G
                if (r3 == 0) goto L_0x00de
                android.util.TypedValue r3 = new android.util.TypedValue
                r3.<init>()
                android.content.Context r6 = r10.f2724h
                android.content.res.Resources$Theme r6 = r6.getTheme()
                int r7 = p124p.p126b.C1018a.actionBarTheme
                r6.resolveAttribute(r7, r3, r5)
                int r7 = r3.resourceId
                if (r7 == 0) goto L_0x0091
                android.content.Context r7 = r10.f2724h
                android.content.res.Resources r7 = r7.getResources()
                android.content.res.Resources$Theme r7 = r7.newTheme()
                r7.setTo(r6)
                int r6 = r3.resourceId
                r7.applyStyle(r6, r5)
                p.b.p.c r6 = new p.b.p.c
                android.content.Context r8 = r10.f2724h
                r6.<init>(r8, r4)
                android.content.res.Resources$Theme r8 = r6.getTheme()
                r8.setTo(r7)
                goto L_0x0093
            L_0x0091:
                android.content.Context r6 = r10.f2724h
            L_0x0093:
                androidx.appcompat.widget.ActionBarContextView r7 = new androidx.appcompat.widget.ActionBarContextView
                r7.<init>(r6)
                r10.f2735s = r7
                android.widget.PopupWindow r7 = new android.widget.PopupWindow
                int r8 = p124p.p126b.C1018a.actionModePopupWindowStyle
                r7.<init>(r6, r1, r8)
                r10.f2736t = r7
                r8 = 2
                r7.setWindowLayoutType(r8)
                android.widget.PopupWindow r7 = r10.f2736t
                androidx.appcompat.widget.ActionBarContextView r8 = r10.f2735s
                r7.setContentView(r8)
                android.widget.PopupWindow r7 = r10.f2736t
                r8 = -1
                r7.setWidth(r8)
                android.content.res.Resources$Theme r7 = r6.getTheme()
                int r8 = p124p.p126b.C1018a.actionBarSize
                r7.resolveAttribute(r8, r3, r5)
                int r3 = r3.data
                android.content.res.Resources r6 = r6.getResources()
                android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
                int r3 = android.util.TypedValue.complexToDimensionPixelSize(r3, r6)
                androidx.appcompat.widget.ActionBarContextView r6 = r10.f2735s
                r6.setContentHeight(r3)
                android.widget.PopupWindow r3 = r10.f2736t
                r6 = -2
                r3.setHeight(r6)
                p.b.k.l r3 = new p.b.k.l
                r3.<init>(r10)
                r10.f2737u = r3
                goto L_0x010a
            L_0x00de:
                android.view.ViewGroup r3 = r10.f2741y
                int r6 = p124p.p126b.C1023f.action_mode_bar_stub
                android.view.View r3 = r3.findViewById(r6)
                androidx.appcompat.widget.ViewStubCompat r3 = (androidx.appcompat.widget.ViewStubCompat) r3
                if (r3 == 0) goto L_0x010a
                r10.mo4487j()
                p.b.k.a r6 = r10.f2728l
                if (r6 == 0) goto L_0x00f6
                android.content.Context r6 = r6.mo4416c()
                goto L_0x00f7
            L_0x00f6:
                r6 = r1
            L_0x00f7:
                if (r6 != 0) goto L_0x00fb
                android.content.Context r6 = r10.f2724h
            L_0x00fb:
                android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
                r3.setLayoutInflater(r6)
                android.view.View r3 = r3.mo547a()
                androidx.appcompat.widget.ActionBarContextView r3 = (androidx.appcompat.widget.ActionBarContextView) r3
                r10.f2735s = r3
            L_0x010a:
                androidx.appcompat.widget.ActionBarContextView r3 = r10.f2735s
                if (r3 == 0) goto L_0x01a1
                r10.mo4480e()
                androidx.appcompat.widget.ActionBarContextView r3 = r10.f2735s
                r3.mo99b()
                p.b.p.d r3 = new p.b.p.d
                androidx.appcompat.widget.ActionBarContextView r6 = r10.f2735s
                android.content.Context r6 = r6.getContext()
                androidx.appcompat.widget.ActionBarContextView r7 = r10.f2735s
                android.widget.PopupWindow r8 = r10.f2736t
                if (r8 != 0) goto L_0x0125
                goto L_0x0126
            L_0x0125:
                r5 = r4
            L_0x0126:
                r3.<init>(r6, r7, r2, r5)
                p.b.p.i.g r5 = r3.f2928l
                p.b.p.a$a r2 = r2.f2746a
                boolean r2 = r2.mo4497b(r3, r5)
                if (r2 == 0) goto L_0x019f
                r3.mo4552g()
                androidx.appcompat.widget.ActionBarContextView r2 = r10.f2735s
                r2.mo98a(r3)
                r10.f2734r = r3
                boolean r2 = r10.mo4488k()
                r3 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0169
                androidx.appcompat.widget.ActionBarContextView r2 = r10.f2735s
                r4 = 0
                r2.setAlpha(r4)
                androidx.appcompat.widget.ActionBarContextView r2 = r10.f2735s
                p.h.l.t r2 = p124p.p150h.p162l.C1404o.m3511a(r2)
                r2.mo5910a(r3)
                r10.f2738v = r2
                p.b.k.m r3 = new p.b.k.m
                r3.<init>(r10)
                java.lang.ref.WeakReference<android.view.View> r4 = r2.f4179a
                java.lang.Object r4 = r4.get()
                android.view.View r4 = (android.view.View) r4
                if (r4 == 0) goto L_0x018f
                r2.mo5915a(r4, r3)
                goto L_0x018f
            L_0x0169:
                androidx.appcompat.widget.ActionBarContextView r2 = r10.f2735s
                r2.setAlpha(r3)
                androidx.appcompat.widget.ActionBarContextView r2 = r10.f2735s
                r2.setVisibility(r4)
                androidx.appcompat.widget.ActionBarContextView r2 = r10.f2735s
                r3 = 32
                r2.sendAccessibilityEvent(r3)
                androidx.appcompat.widget.ActionBarContextView r2 = r10.f2735s
                android.view.ViewParent r2 = r2.getParent()
                boolean r2 = r2 instanceof android.view.View
                if (r2 == 0) goto L_0x018f
                androidx.appcompat.widget.ActionBarContextView r2 = r10.f2735s
                android.view.ViewParent r2 = r2.getParent()
                android.view.View r2 = (android.view.View) r2
                r2.requestApplyInsets()
            L_0x018f:
                android.widget.PopupWindow r2 = r10.f2736t
                if (r2 == 0) goto L_0x01a1
                android.view.Window r2 = r10.f2725i
                android.view.View r2 = r2.getDecorView()
                java.lang.Runnable r3 = r10.f2737u
                r2.post(r3)
                goto L_0x01a1
            L_0x019f:
                r10.f2734r = r1
            L_0x01a1:
                p.b.p.a r2 = r10.f2734r
                if (r2 == 0) goto L_0x01ac
                p.b.k.f r3 = r10.f2727k
                if (r3 == 0) goto L_0x01ac
                r3.mo4431a(r2)
            L_0x01ac:
                p.b.p.a r2 = r10.f2734r
                r10.f2734r = r2
            L_0x01b0:
                p.b.p.a r10 = r10.f2734r
                if (r10 == 0) goto L_0x01b9
                android.view.ActionMode r10 = r0.mo4677b(r10)
                return r10
            L_0x01b9:
                return r1
            L_0x01ba:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p127k.C1039h.C1045e.mo4499a(android.view.ActionMode$Callback):android.view.ActionMode");
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C1039h.this.mo4472a(keyEvent) || this.f2985e.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
            if (r6 != false) goto L_0x001d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                android.view.Window$Callback r0 = r5.f2985e
                boolean r0 = r0.dispatchKeyShortcutEvent(r6)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x004f
                p.b.k.h r0 = p124p.p126b.p127k.C1039h.this
                int r3 = r6.getKeyCode()
                r0.mo4487j()
                p.b.k.a r4 = r0.f2728l
                if (r4 == 0) goto L_0x001f
                boolean r3 = r4.mo4413a(r3, r6)
                if (r3 == 0) goto L_0x001f
            L_0x001d:
                r6 = r2
                goto L_0x004d
            L_0x001f:
                p.b.k.h$j r3 = r0.f2704K
                if (r3 == 0) goto L_0x0034
                int r4 = r6.getKeyCode()
                boolean r3 = r0.mo4473a(r3, r4, r6, r2)
                if (r3 == 0) goto L_0x0034
                p.b.k.h$j r6 = r0.f2704K
                if (r6 == 0) goto L_0x001d
                r6.f2771n = r2
                goto L_0x001d
            L_0x0034:
                p.b.k.h$j r3 = r0.f2704K
                if (r3 != 0) goto L_0x004c
                p.b.k.h$j r3 = r0.mo4478d(r1)
                r0.mo4476b(r3, r6)
                int r4 = r6.getKeyCode()
                boolean r6 = r0.mo4473a(r3, r4, r6, r2)
                r3.f2770m = r1
                if (r6 == 0) goto L_0x004c
                goto L_0x001d
            L_0x004c:
                r6 = r1
            L_0x004d:
                if (r6 == 0) goto L_0x0050
            L_0x004f:
                r1 = r2
            L_0x0050:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p127k.C1039h.C1045e.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C1114g)) {
                return this.f2985e.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            this.f2985e.onMenuOpened(i, menu);
            C1039h hVar = C1039h.this;
            if (hVar != null) {
                if (i == 108) {
                    hVar.mo4487j();
                    C1028a aVar = hVar.f2728l;
                    if (aVar != null) {
                        aVar.mo4411a(true);
                    }
                }
                return true;
            }
            throw null;
        }

        public void onPanelClosed(int i, Menu menu) {
            this.f2985e.onPanelClosed(i, menu);
            C1039h hVar = C1039h.this;
            if (hVar == null) {
                throw null;
            } else if (i == 108) {
                hVar.mo4487j();
                C1028a aVar = hVar.f2728l;
                if (aVar != null) {
                    aVar.mo4411a(false);
                }
            } else if (i == 0) {
                C1051j d = hVar.mo4478d(i);
                if (d.f2772o) {
                    hVar.mo4471a(d, false);
                }
            }
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C1114g gVar = menu instanceof C1114g ? (C1114g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.f3096y = true;
            }
            boolean onPreparePanel = this.f2985e.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.f3096y = false;
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C1051j d = C1039h.this.mo4478d(0);
            if (d != null) {
                C1114g gVar = d.f2767j;
                if (gVar != null) {
                    this.f2985e.onProvideKeyboardShortcuts(list, gVar, i);
                    return;
                }
            }
            this.f2985e.onProvideKeyboardShortcuts(list, menu, i);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!C1039h.this.f2739w || i != 0) {
                return this.f2985e.onWindowStartingActionMode(callback, i);
            }
            return mo4499a(callback);
        }
    }

    /* renamed from: p.b.k.h$f */
    public class C1046f extends C1047g {

        /* renamed from: c */
        public final PowerManager f2750c;

        public C1046f(Context context) {
            super();
            this.f2750c = (PowerManager) context.getSystemService("power");
        }

        /* renamed from: b */
        public IntentFilter mo4510b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo4511c() {
            return this.f2750c.isPowerSaveMode() ? 2 : 1;
        }

        /* renamed from: d */
        public void mo4512d() {
            C1039h.this.mo4479d();
        }
    }

    /* renamed from: p.b.k.h$g */
    public abstract class C1047g {

        /* renamed from: a */
        public BroadcastReceiver f2752a;

        /* renamed from: p.b.k.h$g$a */
        public class C1048a extends BroadcastReceiver {
            public C1048a() {
            }

            public void onReceive(Context context, Intent intent) {
                C1047g.this.mo4512d();
            }
        }

        public C1047g() {
        }

        /* renamed from: a */
        public void mo4513a() {
            BroadcastReceiver broadcastReceiver = this.f2752a;
            if (broadcastReceiver != null) {
                try {
                    C1039h.this.f2724h.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f2752a = null;
            }
        }

        /* renamed from: b */
        public abstract IntentFilter mo4510b();

        /* renamed from: c */
        public abstract int mo4511c();

        /* renamed from: d */
        public abstract void mo4512d();

        /* renamed from: e */
        public void mo4514e() {
            mo4513a();
            IntentFilter b = mo4510b();
            if (b != null && b.countActions() != 0) {
                if (this.f2752a == null) {
                    this.f2752a = new C1048a();
                }
                C1039h.this.f2724h.registerReceiver(this.f2752a, b);
            }
        }
    }

    /* renamed from: p.b.k.h$h */
    public class C1049h extends C1047g {

        /* renamed from: c */
        public final C1063q f2755c;

        public C1049h(C1063q qVar) {
            super();
            this.f2755c = qVar;
        }

        /* renamed from: b */
        public IntentFilter mo4510b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:49:0x00ec  */
        /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo4511c() {
            /*
                r24 = this;
                r0 = r24
                p.b.k.q r1 = r0.f2755c
                p.b.k.q$a r2 = r1.f2807c
                long r3 = r2.f2809b
                long r5 = java.lang.System.currentTimeMillis()
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                r4 = 1
                if (r3 <= 0) goto L_0x0013
                r3 = r4
                goto L_0x0014
            L_0x0013:
                r3 = 0
            L_0x0014:
                if (r3 == 0) goto L_0x001a
            L_0x0016:
                boolean r1 = r2.f2808a
                goto L_0x00ea
            L_0x001a:
                android.content.Context r3 = r1.f2805a
                java.lang.String r6 = "android.permission.ACCESS_COARSE_LOCATION"
                int r3 = p124p.p126b.p127k.C1061o.m2433a(r3, r6)
                r6 = 0
                if (r3 != 0) goto L_0x002c
                java.lang.String r3 = "network"
                android.location.Location r3 = r1.mo4535a(r3)
                goto L_0x002d
            L_0x002c:
                r3 = r6
            L_0x002d:
                android.content.Context r7 = r1.f2805a
                java.lang.String r8 = "android.permission.ACCESS_FINE_LOCATION"
                int r7 = p124p.p126b.p127k.C1061o.m2433a(r7, r8)
                if (r7 != 0) goto L_0x003d
                java.lang.String r6 = "gps"
                android.location.Location r6 = r1.mo4535a(r6)
            L_0x003d:
                if (r6 == 0) goto L_0x004e
                if (r3 == 0) goto L_0x004e
                long r7 = r6.getTime()
                long r9 = r3.getTime()
                int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r7 <= 0) goto L_0x0051
                goto L_0x0050
            L_0x004e:
                if (r6 == 0) goto L_0x0051
            L_0x0050:
                r3 = r6
            L_0x0051:
                if (r3 == 0) goto L_0x00cd
                p.b.k.q$a r1 = r1.f2807c
                long r13 = java.lang.System.currentTimeMillis()
                p.b.k.p r6 = p124p.p126b.p127k.C1062p.f2800d
                if (r6 != 0) goto L_0x0064
                p.b.k.p r6 = new p.b.k.p
                r6.<init>()
                p124p.p126b.p127k.C1062p.f2800d = r6
            L_0x0064:
                p.b.k.p r11 = p124p.p126b.p127k.C1062p.f2800d
                r22 = 86400000(0x5265c00, double:4.2687272E-316)
                long r16 = r13 - r22
                double r18 = r3.getLatitude()
                double r20 = r3.getLongitude()
                r15 = r11
                r15.mo4534a(r16, r18, r20)
                double r9 = r3.getLatitude()
                double r15 = r3.getLongitude()
                r6 = r11
                r7 = r13
                r5 = r11
                r11 = r15
                r6.mo4534a(r7, r9, r11)
                int r6 = r5.f2803c
                if (r6 != r4) goto L_0x008c
                r6 = r4
                goto L_0x008d
            L_0x008c:
                r6 = 0
            L_0x008d:
                long r7 = r5.f2802b
                long r9 = r5.f2801a
                long r16 = r13 + r22
                double r18 = r3.getLatitude()
                double r20 = r3.getLongitude()
                r15 = r5
                r15.mo4534a(r16, r18, r20)
                long r11 = r5.f2802b
                r15 = 0
                r17 = -1
                int r3 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
                if (r3 == 0) goto L_0x00c2
                int r3 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
                if (r3 != 0) goto L_0x00ae
                goto L_0x00c2
            L_0x00ae:
                int r3 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r3 <= 0) goto L_0x00b4
                long r11 = r11 + r15
                goto L_0x00bd
            L_0x00b4:
                int r3 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                if (r3 <= 0) goto L_0x00bb
                long r11 = r9 + r15
                goto L_0x00bd
            L_0x00bb:
                long r11 = r7 + r15
            L_0x00bd:
                r7 = 60000(0xea60, double:2.9644E-319)
                long r11 = r11 + r7
                goto L_0x00c7
            L_0x00c2:
                r7 = 43200000(0x2932e00, double:2.1343636E-316)
                long r11 = r13 + r7
            L_0x00c7:
                r1.f2808a = r6
                r1.f2809b = r11
                goto L_0x0016
            L_0x00cd:
                java.lang.String r1 = "TwilightManager"
                java.lang.String r2 = "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."
                android.util.Log.i(r1, r2)
                java.util.Calendar r1 = java.util.Calendar.getInstance()
                r2 = 11
                int r1 = r1.get(r2)
                r2 = 6
                if (r1 < r2) goto L_0x00e8
                r2 = 22
                if (r1 < r2) goto L_0x00e6
                goto L_0x00e8
            L_0x00e6:
                r5 = 0
                goto L_0x00e9
            L_0x00e8:
                r5 = r4
            L_0x00e9:
                r1 = r5
            L_0x00ea:
                if (r1 == 0) goto L_0x00ed
                r4 = 2
            L_0x00ed:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p127k.C1039h.C1049h.mo4511c():int");
        }

        /* renamed from: d */
        public void mo4512d() {
            C1039h.this.mo4479d();
        }
    }

    /* renamed from: p.b.k.h$i */
    public class C1050i extends ContentFrameLayout {
        public C1050i(Context context) {
            super(context);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C1039h.this.mo4472a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    C1039h hVar = C1039h.this;
                    hVar.mo4471a(hVar.mo4478d(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C1070a.m2602b(getContext(), i));
        }
    }

    /* renamed from: p.b.k.h$j */
    public static final class C1051j {

        /* renamed from: a */
        public int f2758a;

        /* renamed from: b */
        public int f2759b;

        /* renamed from: c */
        public int f2760c;

        /* renamed from: d */
        public int f2761d;

        /* renamed from: e */
        public int f2762e;

        /* renamed from: f */
        public int f2763f;

        /* renamed from: g */
        public ViewGroup f2764g;

        /* renamed from: h */
        public View f2765h;

        /* renamed from: i */
        public View f2766i;

        /* renamed from: j */
        public C1114g f2767j;

        /* renamed from: k */
        public C1111e f2768k;

        /* renamed from: l */
        public Context f2769l;

        /* renamed from: m */
        public boolean f2770m;

        /* renamed from: n */
        public boolean f2771n;

        /* renamed from: o */
        public boolean f2772o;

        /* renamed from: p */
        public boolean f2773p;

        /* renamed from: q */
        public boolean f2774q = false;

        /* renamed from: r */
        public boolean f2775r;

        /* renamed from: s */
        public Bundle f2776s;

        public C1051j(int i) {
            this.f2758a = i;
        }

        /* renamed from: a */
        public void mo4519a(C1114g gVar) {
            C1114g gVar2 = this.f2767j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.mo4806a((C1129m) this.f2768k);
                }
                this.f2767j = gVar;
                if (gVar != null) {
                    C1111e eVar = this.f2768k;
                    if (eVar != null) {
                        gVar.mo4807a((C1129m) eVar, gVar.f3072a);
                    }
                }
            }
        }
    }

    /* renamed from: p.b.k.h$k */
    public final class C1052k implements C1130a {
        public C1052k() {
        }

        /* renamed from: a */
        public void mo196a(C1114g gVar, boolean z) {
            C1114g c = gVar.mo4826c();
            boolean z2 = c != gVar;
            C1039h hVar = C1039h.this;
            if (z2) {
                gVar = c;
            }
            C1051j a = hVar.mo4467a((Menu) gVar);
            if (a == null) {
                return;
            }
            if (z2) {
                C1039h.this.mo4468a(a.f2758a, a, c);
                C1039h.this.mo4471a(a, true);
                return;
            }
            C1039h.this.mo4471a(a, z);
        }

        /* renamed from: a */
        public boolean mo197a(C1114g gVar) {
            if (gVar == null) {
                C1039h hVar = C1039h.this;
                if (hVar.f2697D) {
                    Callback i = hVar.mo4486i();
                    if (i != null && !C1039h.this.f2709P) {
                        i.onMenuOpened(108, gVar);
                    }
                }
            }
            return true;
        }
    }

    static {
        int i = VERSION.SDK_INT;
        boolean z = false;
        if (i <= 25) {
            z = true;
        }
        f2693h0 = z;
        if (f2690e0 && !f2692g0) {
            Thread.setDefaultUncaughtExceptionHandler(new C1040a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    public C1039h(Context context, Window window, C1037f fVar, Object obj) {
        C1036e eVar = null;
        this.f2724h = context;
        this.f2727k = fVar;
        this.f2723g = obj;
        if (this.f2710Q == -100 && (obj instanceof Dialog)) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof C1036e)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        eVar = (C1036e) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (eVar != null) {
                this.f2710Q = ((C1039h) eVar.mo4428P()).f2710Q;
            }
        }
        if (this.f2710Q == -100) {
            Integer num = (Integer) f2689d0.get(this.f2723g.getClass());
            if (num != null) {
                this.f2710Q = num.intValue();
                f2689d0.remove(this.f2723g.getClass());
            }
        }
        if (window != null) {
            mo4469a(window);
        }
        C1178i.m2953b();
    }

    /* renamed from: a */
    public C1051j mo4467a(Menu menu) {
        C1051j[] jVarArr = this.f2703J;
        int length = jVarArr != null ? jVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C1051j jVar = jVarArr[i];
            if (jVar != null && jVar.f2767j == menu) {
                return jVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo4460a(View view, LayoutParams layoutParams) {
        mo4483f();
        ((ViewGroup) this.f2741y.findViewById(16908290)).addView(view, layoutParams);
        this.f2726j.f2985e.onContentChanged();
    }

    /* renamed from: a */
    public void mo4471a(C1051j jVar, boolean z) {
        if (z && jVar.f2758a == 0) {
            C1227z zVar = this.f2731o;
            if (zVar != null && zVar.mo126a()) {
                mo4475b(jVar.f2767j);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f2724h.getSystemService("window");
        if (windowManager != null && jVar.f2772o) {
            ViewGroup viewGroup = jVar.f2764g;
            if (viewGroup != null) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo4468a(jVar.f2758a, jVar, null);
                }
            }
        }
        jVar.f2770m = false;
        jVar.f2771n = false;
        jVar.f2772o = false;
        jVar.f2765h = null;
        jVar.f2774q = true;
        if (this.f2704K == jVar) {
            this.f2704K = null;
        }
    }

    /* renamed from: a */
    public final boolean mo4473a(C1051j jVar, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if (jVar.f2770m || mo4476b(jVar, keyEvent)) {
            C1114g gVar = jVar.f2767j;
            if (gVar != null) {
                z = gVar.performShortcut(i, keyEvent, i2);
            }
        }
        if (z && (i2 & 1) == 0 && this.f2731o == null) {
            mo4471a(jVar, true);
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo199a(C1114g gVar, MenuItem menuItem) {
        Callback i = mo4486i();
        if (i != null && !this.f2709P) {
            C1051j a = mo4467a((Menu) gVar.mo4826c());
            if (a != null) {
                return i.onMenuItemSelected(a.f2758a, menuItem);
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo4463b() {
        mo4487j();
        C1028a aVar = this.f2728l;
        mo4481e(0);
    }

    /* renamed from: b */
    public void mo4475b(C1114g gVar) {
        if (!this.f2702I) {
            this.f2702I = true;
            this.f2731o.mo144h();
            Callback i = mo4486i();
            if (i != null && !this.f2709P) {
                i.onPanelClosed(108, gVar);
            }
            this.f2702I = false;
        }
    }

    /* renamed from: c */
    public void mo4466c() {
        this.f2708O = false;
        C1038g.m2350b((C1038g) this);
        mo4487j();
        C1028a aVar = this.f2728l;
        if (aVar != null) {
            aVar.mo4417c(false);
        }
        if (this.f2723g instanceof Dialog) {
            C1047g gVar = this.f2714U;
            if (gVar != null) {
                gVar.mo4513a();
            }
            C1047g gVar2 = this.f2715V;
            if (gVar2 != null) {
                gVar2.mo4513a();
            }
        }
    }

    /* renamed from: c */
    public void mo4477c(int i) {
        C1051j d = mo4478d(i);
        if (d.f2767j != null) {
            Bundle bundle = new Bundle();
            d.f2767j.mo4823b(bundle);
            if (bundle.size() > 0) {
                d.f2776s = bundle;
            }
            d.f2767j.mo4840j();
            d.f2767j.clear();
        }
        d.f2775r = true;
        d.f2774q = true;
        if ((i == 108 || i == 0) && this.f2731o != null) {
            C1051j d2 = mo4478d(0);
            if (d2 != null) {
                d2.f2770m = false;
                mo4476b(d2, (KeyEvent) null);
            }
        }
    }

    /* renamed from: d */
    public C1051j mo4478d(int i) {
        C1051j[] jVarArr = this.f2703J;
        if (jVarArr == null || jVarArr.length <= i) {
            C1051j[] jVarArr2 = new C1051j[(i + 1)];
            if (jVarArr != null) {
                System.arraycopy(jVarArr, 0, jVarArr2, 0, jVarArr.length);
            }
            this.f2703J = jVarArr2;
            jVarArr = jVarArr2;
        }
        C1051j jVar = jVarArr[i];
        if (jVar != null) {
            return jVar;
        }
        C1051j jVar2 = new C1051j(i);
        jVarArr[i] = jVar2;
        return jVar2;
    }

    /* renamed from: d */
    public boolean mo4479d() {
        return mo4474a(true);
    }

    /* renamed from: e */
    public void mo4480e() {
        C1413t tVar = this.f2738v;
        if (tVar != null) {
            tVar.mo5914a();
        }
    }

    /* renamed from: e */
    public final void mo4481e(int i) {
        this.f2717X = (1 << i) | this.f2717X;
        if (!this.f2716W) {
            C1404o.m3523a(this.f2725i.getDecorView(), this.f2718Y);
            this.f2716W = true;
        }
    }

    /* renamed from: f */
    public int mo4482f(int i) {
        boolean z;
        boolean z2;
        ActionBarContextView actionBarContextView = this.f2735s;
        int i2 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof MarginLayoutParams)) {
            z = false;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f2735s.getLayoutParams();
            boolean z3 = true;
            if (this.f2735s.isShown()) {
                if (this.f2720a0 == null) {
                    this.f2720a0 = new Rect();
                    this.f2721b0 = new Rect();
                }
                Rect rect = this.f2720a0;
                Rect rect2 = this.f2721b0;
                rect.set(0, i, 0, 0);
                C1143a1.m2886a(this.f2741y, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.f2694A;
                    if (view == null) {
                        View view2 = new View(this.f2724h);
                        this.f2694A = view2;
                        view2.setBackgroundColor(this.f2724h.getResources().getColor(C1020c.abc_input_method_navigation_guard));
                        this.f2741y.addView(this.f2694A, -1, new LayoutParams(-1, i));
                    } else {
                        LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f2694A.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f2694A == null) {
                    z3 = false;
                }
                if (!this.f2699F && z3) {
                    i = 0;
                }
                boolean z4 = z3;
                z3 = z2;
                z = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f2735s.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.f2694A;
        if (view3 != null) {
            if (!z) {
                i2 = 8;
            }
            view3.setVisibility(i2);
        }
        return i;
    }

    /* renamed from: f */
    public final void mo4483f() {
        ViewGroup viewGroup;
        if (!this.f2740x) {
            TypedArray obtainStyledAttributes = this.f2724h.obtainStyledAttributes(C1027j.AppCompatTheme);
            if (obtainStyledAttributes.hasValue(C1027j.AppCompatTheme_windowActionBar)) {
                if (obtainStyledAttributes.getBoolean(C1027j.AppCompatTheme_windowNoTitle, false)) {
                    mo4462a(1);
                } else if (obtainStyledAttributes.getBoolean(C1027j.AppCompatTheme_windowActionBar, false)) {
                    mo4462a(108);
                }
                if (obtainStyledAttributes.getBoolean(C1027j.AppCompatTheme_windowActionBarOverlay, false)) {
                    mo4462a(109);
                }
                if (obtainStyledAttributes.getBoolean(C1027j.AppCompatTheme_windowActionModeOverlay, false)) {
                    mo4462a(10);
                }
                this.f2700G = obtainStyledAttributes.getBoolean(C1027j.AppCompatTheme_android_windowIsFloating, false);
                obtainStyledAttributes.recycle();
                mo4484g();
                this.f2725i.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.f2724h);
                if (this.f2701H) {
                    viewGroup = (ViewGroup) from.inflate(this.f2699F ? C1024g.abc_screen_simple_overlay_action_mode : C1024g.abc_screen_simple, null);
                    C1404o.m3527a((View) viewGroup, (C1401l) new C1053i(this));
                } else if (this.f2700G) {
                    viewGroup = (ViewGroup) from.inflate(C1024g.abc_dialog_title_material, null);
                    this.f2698E = false;
                    this.f2697D = false;
                } else if (this.f2697D) {
                    TypedValue typedValue = new TypedValue();
                    this.f2724h.getTheme().resolveAttribute(C1018a.actionBarTheme, typedValue, true);
                    viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C1092c(this.f2724h, typedValue.resourceId) : this.f2724h).inflate(C1024g.abc_screen_toolbar, null);
                    C1227z zVar = (C1227z) viewGroup.findViewById(C1023f.decor_content_parent);
                    this.f2731o = zVar;
                    zVar.setWindowCallback(mo4486i());
                    if (this.f2698E) {
                        this.f2731o.mo118a(109);
                    }
                    if (this.f2695B) {
                        this.f2731o.mo118a(2);
                    }
                    if (this.f2696C) {
                        this.f2731o.mo118a(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    if (this.f2731o == null) {
                        this.f2742z = (TextView) viewGroup.findViewById(C1023f.title);
                    }
                    C1143a1.m2888b(viewGroup);
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C1023f.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f2725i.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.f2725i.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new C1055k(this));
                    this.f2741y = viewGroup;
                    Object obj = this.f2723g;
                    CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2730n;
                    if (!TextUtils.isEmpty(title)) {
                        C1227z zVar2 = this.f2731o;
                        if (zVar2 != null) {
                            zVar2.setWindowTitle(title);
                        } else {
                            C1028a aVar = this.f2728l;
                            if (aVar != null) {
                                aVar.mo4410a(title);
                            } else {
                                TextView textView = this.f2742z;
                                if (textView != null) {
                                    textView.setText(title);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2741y.findViewById(16908290);
                    View decorView = this.f2725i.getDecorView();
                    contentFrameLayout2.f239k.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (C1404o.m3563x(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.f2724h.obtainStyledAttributes(C1027j.AppCompatTheme);
                    obtainStyledAttributes2.getValue(C1027j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(C1027j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(C1027j.AppCompatTheme_windowFixedWidthMajor)) {
                        obtainStyledAttributes2.getValue(C1027j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(C1027j.AppCompatTheme_windowFixedWidthMinor)) {
                        obtainStyledAttributes2.getValue(C1027j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(C1027j.AppCompatTheme_windowFixedHeightMajor)) {
                        obtainStyledAttributes2.getValue(C1027j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(C1027j.AppCompatTheme_windowFixedHeightMinor)) {
                        obtainStyledAttributes2.getValue(C1027j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.f2740x = true;
                    C1051j d = mo4478d(0);
                    if (this.f2709P) {
                        return;
                    }
                    if (d == null || d.f2767j == null) {
                        mo4481e(108);
                        return;
                    }
                    return;
                }
                StringBuilder a = C1965a.m4756a("AppCompat does not support the current theme features: { windowActionBar: ");
                a.append(this.f2697D);
                a.append(", windowActionBarOverlay: ");
                a.append(this.f2698E);
                a.append(", android:windowIsFloating: ");
                a.append(this.f2700G);
                a.append(", windowActionModeOverlay: ");
                a.append(this.f2699F);
                a.append(", windowNoTitle: ");
                a.append(this.f2701H);
                a.append(" }");
                throw new IllegalArgumentException(a.toString());
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    /* renamed from: g */
    public final void mo4484g() {
        if (this.f2725i == null) {
            Object obj = this.f2723g;
            if (obj instanceof Activity) {
                mo4469a(((Activity) obj).getWindow());
            }
        }
        if (this.f2725i == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: h */
    public final C1047g mo4485h() {
        if (this.f2714U == null) {
            Context context = this.f2724h;
            if (C1063q.f2804d == null) {
                Context applicationContext = context.getApplicationContext();
                C1063q.f2804d = new C1063q(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f2714U = new C1049h(C1063q.f2804d);
        }
        return this.f2714U;
    }

    /* renamed from: i */
    public final Callback mo4486i() {
        return this.f2725i.getCallback();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4487j() {
        /*
            r3 = this;
            r3.mo4483f()
            boolean r0 = r3.f2697D
            if (r0 == 0) goto L_0x0037
            p.b.k.a r0 = r3.f2728l
            if (r0 == 0) goto L_0x000c
            goto L_0x0037
        L_0x000c:
            java.lang.Object r0 = r3.f2723g
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0020
            p.b.k.r r0 = new p.b.k.r
            java.lang.Object r1 = r3.f2723g
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f2698E
            r0.<init>(r1, r2)
        L_0x001d:
            r3.f2728l = r0
            goto L_0x002e
        L_0x0020:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x002e
            p.b.k.r r0 = new p.b.k.r
            java.lang.Object r1 = r3.f2723g
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x002e:
            p.b.k.a r0 = r3.f2728l
            if (r0 == 0) goto L_0x0037
            boolean r1 = r3.f2719Z
            r0.mo4415b(r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p127k.C1039h.mo4487j():void");
    }

    /* renamed from: k */
    public final boolean mo4488k() {
        if (this.f2740x) {
            ViewGroup viewGroup = this.f2741y;
            if (viewGroup != null && C1404o.m3563x(viewGroup)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public final void mo4489l() {
        if (this.f2740x) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r14).getDepth() > 1) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r11, java.lang.String r12, android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r10 = this;
            androidx.appcompat.app.AppCompatViewInflater r0 = r10.f2722c0
            r1 = 0
            if (r0 != 0) goto L_0x0060
            android.content.Context r0 = r10.f2724h
            int[] r2 = p124p.p126b.C1027j.AppCompatTheme
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            int r2 = p124p.p126b.C1027j.AppCompatTheme_viewInflaterClass
            java.lang.String r2 = r0.getString(r2)
            if (r2 == 0) goto L_0x0059
            java.lang.Class<androidx.appcompat.app.AppCompatViewInflater> r0 = androidx.appcompat.app.AppCompatViewInflater.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0022
            goto L_0x0059
        L_0x0022:
            java.lang.Class r0 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0037 }
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0037 }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r3)     // Catch:{ all -> 0x0037 }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x0037 }
            java.lang.Object r0 = r0.newInstance(r3)     // Catch:{ all -> 0x0037 }
            androidx.appcompat.app.AppCompatViewInflater r0 = (androidx.appcompat.app.AppCompatViewInflater) r0     // Catch:{ all -> 0x0037 }
            r10.f2722c0 = r0     // Catch:{ all -> 0x0037 }
            goto L_0x0060
        L_0x0037:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to instantiate custom view inflater "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = ". Falling back to default."
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "AppCompatDelegate"
            android.util.Log.i(r3, r2, r0)
            androidx.appcompat.app.AppCompatViewInflater r0 = new androidx.appcompat.app.AppCompatViewInflater
            r0.<init>()
            goto L_0x005e
        L_0x0059:
            androidx.appcompat.app.AppCompatViewInflater r0 = new androidx.appcompat.app.AppCompatViewInflater
            r0.<init>()
        L_0x005e:
            r10.f2722c0 = r0
        L_0x0060:
            boolean r0 = f2690e0
            if (r0 == 0) goto L_0x0098
            boolean r0 = r14 instanceof org.xmlpull.v1.XmlPullParser
            r2 = 1
            if (r0 == 0) goto L_0x0073
            r0 = r14
            org.xmlpull.v1.XmlPullParser r0 = (org.xmlpull.v1.XmlPullParser) r0
            int r0 = r0.getDepth()
            if (r0 <= r2) goto L_0x0098
            goto L_0x0081
        L_0x0073:
            r0 = r11
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            if (r0 != 0) goto L_0x0079
            goto L_0x0098
        L_0x0079:
            android.view.Window r3 = r10.f2725i
            android.view.View r3 = r3.getDecorView()
        L_0x007f:
            if (r0 != 0) goto L_0x0083
        L_0x0081:
            r6 = r2
            goto L_0x0099
        L_0x0083:
            if (r0 == r3) goto L_0x0098
            boolean r4 = r0 instanceof android.view.View
            if (r4 == 0) goto L_0x0098
            r4 = r0
            android.view.View r4 = (android.view.View) r4
            boolean r4 = p124p.p150h.p162l.C1404o.m3562w(r4)
            if (r4 == 0) goto L_0x0093
            goto L_0x0098
        L_0x0093:
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x007f
        L_0x0098:
            r6 = r1
        L_0x0099:
            androidx.appcompat.app.AppCompatViewInflater r1 = r10.f2722c0
            boolean r7 = f2690e0
            r8 = 1
            p124p.p126b.p136q.C1228z0.m3094a()
            r9 = 0
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            android.view.View r0 = r1.createView(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p127k.C1039h.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00fc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4474a(boolean r12) {
        /*
            r11 = this;
            boolean r0 = r11.f2709P
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r11.f2710Q
            r2 = -100
            if (r0 == r2) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = r2
        L_0x000e:
            r3 = -1
            r4 = 3
            r5 = 2
            r6 = 1
            if (r0 == r2) goto L_0x0051
            if (r0 == r3) goto L_0x0050
            if (r0 == 0) goto L_0x0036
            if (r0 == r6) goto L_0x0050
            if (r0 == r5) goto L_0x0050
            if (r0 != r4) goto L_0x002e
            p.b.k.h$g r2 = r11.f2715V
            if (r2 != 0) goto L_0x002b
            p.b.k.h$f r2 = new p.b.k.h$f
            android.content.Context r3 = r11.f2724h
            r2.<init>(r3)
            r11.f2715V = r2
        L_0x002b:
            p.b.k.h$g r2 = r11.f2715V
            goto L_0x004b
        L_0x002e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."
            r12.<init>(r0)
            throw r12
        L_0x0036:
            android.content.Context r2 = r11.f2724h
            java.lang.Class<android.app.UiModeManager> r7 = android.app.UiModeManager.class
            java.lang.Object r2 = r2.getSystemService(r7)
            android.app.UiModeManager r2 = (android.app.UiModeManager) r2
            int r2 = r2.getNightMode()
            if (r2 != 0) goto L_0x0047
            goto L_0x0051
        L_0x0047:
            p.b.k.h$g r2 = r11.mo4485h()
        L_0x004b:
            int r3 = r2.mo4511c()
            goto L_0x0051
        L_0x0050:
            r3 = r0
        L_0x0051:
            android.content.Context r2 = r11.f2724h
            android.content.Context r2 = r2.getApplicationContext()
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.uiMode
            r2 = r2 & 48
            if (r3 == r6) goto L_0x006c
            if (r3 == r5) goto L_0x0069
            r3 = r2
            goto L_0x006e
        L_0x0069:
            r3 = 32
            goto L_0x006e
        L_0x006c:
            r3 = 16
        L_0x006e:
            boolean r5 = r11.f2713T
            java.lang.String r7 = "AppCompatDelegate"
            if (r5 != 0) goto L_0x00ab
            java.lang.Object r5 = r11.f2723g
            boolean r5 = r5 instanceof android.app.Activity
            if (r5 == 0) goto L_0x00ab
            android.content.Context r5 = r11.f2724h
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            if (r5 != 0) goto L_0x0084
            r5 = r1
            goto L_0x00af
        L_0x0084:
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x00a3 }
            android.content.Context r9 = r11.f2724h     // Catch:{ NameNotFoundException -> 0x00a3 }
            java.lang.Object r10 = r11.f2723g     // Catch:{ NameNotFoundException -> 0x00a3 }
            java.lang.Class r10 = r10.getClass()     // Catch:{ NameNotFoundException -> 0x00a3 }
            r8.<init>(r9, r10)     // Catch:{ NameNotFoundException -> 0x00a3 }
            android.content.pm.ActivityInfo r5 = r5.getActivityInfo(r8, r1)     // Catch:{ NameNotFoundException -> 0x00a3 }
            if (r5 == 0) goto L_0x009f
            int r5 = r5.configChanges     // Catch:{ NameNotFoundException -> 0x00a3 }
            r5 = r5 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x009f
            r5 = r6
            goto L_0x00a0
        L_0x009f:
            r5 = r1
        L_0x00a0:
            r11.f2712S = r5     // Catch:{ NameNotFoundException -> 0x00a3 }
            goto L_0x00ab
        L_0x00a3:
            r5 = move-exception
            java.lang.String r8 = "Exception while getting ActivityInfo"
            android.util.Log.d(r7, r8, r5)
            r11.f2712S = r1
        L_0x00ab:
            r11.f2713T = r6
            boolean r5 = r11.f2712S
        L_0x00af:
            boolean r8 = f2693h0
            if (r8 != 0) goto L_0x00b5
            if (r3 == r2) goto L_0x00dc
        L_0x00b5:
            if (r5 != 0) goto L_0x00dc
            boolean r2 = r11.f2706M
            if (r2 != 0) goto L_0x00dc
            java.lang.Object r2 = r11.f2723g
            boolean r2 = r2 instanceof android.view.ContextThemeWrapper
            if (r2 == 0) goto L_0x00dc
            android.content.res.Configuration r2 = new android.content.res.Configuration
            r2.<init>()
            int r8 = r2.uiMode
            r8 = r8 & -49
            r8 = r8 | r3
            r2.uiMode = r8
            java.lang.Object r8 = r11.f2723g     // Catch:{ IllegalStateException -> 0x00d6 }
            android.view.ContextThemeWrapper r8 = (android.view.ContextThemeWrapper) r8     // Catch:{ IllegalStateException -> 0x00d6 }
            r8.applyOverrideConfiguration(r2)     // Catch:{ IllegalStateException -> 0x00d6 }
            r1 = r6
            goto L_0x00dc
        L_0x00d6:
            r2 = move-exception
            java.lang.String r8 = "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()"
            android.util.Log.e(r7, r8, r2)
        L_0x00dc:
            android.content.Context r2 = r11.f2724h
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.uiMode
            r2 = r2 & 48
            if (r1 != 0) goto L_0x0102
            if (r2 == r3) goto L_0x0102
            if (r12 == 0) goto L_0x0102
            if (r5 != 0) goto L_0x0102
            boolean r12 = r11.f2706M
            if (r12 == 0) goto L_0x0102
            java.lang.Object r12 = r11.f2723g
            boolean r7 = r12 instanceof android.app.Activity
            if (r7 == 0) goto L_0x0102
            android.app.Activity r12 = (android.app.Activity) r12
            p124p.p150h.p151d.C1309a.m3359b(r12)
            r1 = r6
        L_0x0102:
            r12 = 0
            if (r1 != 0) goto L_0x0203
            if (r2 == r3) goto L_0x0203
            android.content.Context r1 = r11.f2724h
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r2 = new android.content.res.Configuration
            android.content.res.Configuration r7 = r1.getConfiguration()
            r2.<init>(r7)
            android.content.res.Configuration r7 = r1.getConfiguration()
            int r7 = r7.uiMode
            r7 = r7 & -49
            r3 = r3 | r7
            r2.uiMode = r3
            r1.updateConfiguration(r2, r12)
            int r3 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r3 >= r7) goto L_0x01c5
            r7 = 28
            if (r3 < r7) goto L_0x0130
            goto L_0x01c5
        L_0x0130:
            r7 = 24
            java.lang.String r8 = "mDrawableCache"
            java.lang.String r9 = "ResourcesFlusher"
            if (r3 < r7) goto L_0x0197
            boolean r3 = p124p.p126b.p127k.C1061o.f2794h
            if (r3 != 0) goto L_0x0152
            java.lang.Class<android.content.res.Resources> r3 = android.content.res.Resources.class
            java.lang.String r7 = "mResourcesImpl"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r7)     // Catch:{ NoSuchFieldException -> 0x014a }
            p124p.p126b.p127k.C1061o.f2793g = r3     // Catch:{ NoSuchFieldException -> 0x014a }
            r3.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x014a }
            goto L_0x0150
        L_0x014a:
            r3 = move-exception
            java.lang.String r7 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r9, r7, r3)
        L_0x0150:
            p124p.p126b.p127k.C1061o.f2794h = r6
        L_0x0152:
            java.lang.reflect.Field r3 = p124p.p126b.p127k.C1061o.f2793g
            if (r3 != 0) goto L_0x0158
            goto L_0x01c5
        L_0x0158:
            java.lang.Object r1 = r3.get(r1)     // Catch:{ IllegalAccessException -> 0x015d }
            goto L_0x0164
        L_0x015d:
            r1 = move-exception
            java.lang.String r3 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r9, r3, r1)
            r1 = r12
        L_0x0164:
            if (r1 != 0) goto L_0x0167
            goto L_0x01c5
        L_0x0167:
            boolean r3 = p124p.p126b.p127k.C1061o.f2788b
            if (r3 != 0) goto L_0x0181
            java.lang.Class r3 = r1.getClass()     // Catch:{ NoSuchFieldException -> 0x0179 }
            java.lang.reflect.Field r3 = r3.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x0179 }
            p124p.p126b.p127k.C1061o.f2787a = r3     // Catch:{ NoSuchFieldException -> 0x0179 }
            r3.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x0179 }
            goto L_0x017f
        L_0x0179:
            r3 = move-exception
            java.lang.String r7 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r9, r7, r3)
        L_0x017f:
            p124p.p126b.p127k.C1061o.f2788b = r6
        L_0x0181:
            java.lang.reflect.Field r3 = p124p.p126b.p127k.C1061o.f2787a
            if (r3 == 0) goto L_0x0190
            java.lang.Object r1 = r3.get(r1)     // Catch:{ IllegalAccessException -> 0x018a }
            goto L_0x0191
        L_0x018a:
            r1 = move-exception
            java.lang.String r3 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r9, r3, r1)
        L_0x0190:
            r1 = r12
        L_0x0191:
            if (r1 == 0) goto L_0x01c5
            p124p.p126b.p127k.C1061o.m2543c(r1)
            goto L_0x01c5
        L_0x0197:
            boolean r3 = p124p.p126b.p127k.C1061o.f2788b
            if (r3 != 0) goto L_0x01af
            java.lang.Class<android.content.res.Resources> r3 = android.content.res.Resources.class
            java.lang.reflect.Field r3 = r3.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x01a7 }
            p124p.p126b.p127k.C1061o.f2787a = r3     // Catch:{ NoSuchFieldException -> 0x01a7 }
            r3.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x01a7 }
            goto L_0x01ad
        L_0x01a7:
            r3 = move-exception
            java.lang.String r7 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r9, r7, r3)
        L_0x01ad:
            p124p.p126b.p127k.C1061o.f2788b = r6
        L_0x01af:
            java.lang.reflect.Field r3 = p124p.p126b.p127k.C1061o.f2787a
            if (r3 == 0) goto L_0x01be
            java.lang.Object r1 = r3.get(r1)     // Catch:{ IllegalAccessException -> 0x01b8 }
            goto L_0x01bf
        L_0x01b8:
            r1 = move-exception
            java.lang.String r3 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r9, r3, r1)
        L_0x01be:
            r1 = r12
        L_0x01bf:
            if (r1 != 0) goto L_0x01c2
            goto L_0x01c5
        L_0x01c2:
            p124p.p126b.p127k.C1061o.m2543c(r1)
        L_0x01c5:
            int r1 = r11.f2711R
            if (r1 == 0) goto L_0x01d9
            android.content.Context r3 = r11.f2724h
            r3.setTheme(r1)
            android.content.Context r1 = r11.f2724h
            android.content.res.Resources$Theme r1 = r1.getTheme()
            int r3 = r11.f2711R
            r1.applyStyle(r3, r6)
        L_0x01d9:
            if (r5 == 0) goto L_0x0204
            java.lang.Object r1 = r11.f2723g
            boolean r3 = r1 instanceof android.app.Activity
            if (r3 == 0) goto L_0x0204
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r3 = r1 instanceof p124p.p177n.C1542h
            if (r3 == 0) goto L_0x01fb
            r3 = r1
            p.n.h r3 = (p124p.p177n.C1542h) r3
            p.n.e r3 = r3.mo2g()
            p.n.i r3 = (p124p.p177n.C1543i) r3
            p.n.e$b r3 = r3.f4559b
            p.n.e$b r5 = p124p.p177n.C1537e.C1539b.STARTED
            boolean r3 = r3.mo6228a(r5)
            if (r3 == 0) goto L_0x0204
            goto L_0x01ff
        L_0x01fb:
            boolean r3 = r11.f2708O
            if (r3 == 0) goto L_0x0204
        L_0x01ff:
            r1.onConfigurationChanged(r2)
            goto L_0x0204
        L_0x0203:
            r6 = r1
        L_0x0204:
            if (r6 == 0) goto L_0x0212
            java.lang.Object r1 = r11.f2723g
            boolean r2 = r1 instanceof p124p.p126b.p127k.C1036e
            if (r2 == 0) goto L_0x0212
            p.b.k.e r1 = (p124p.p126b.p127k.C1036e) r1
            if (r1 == 0) goto L_0x0211
            goto L_0x0212
        L_0x0211:
            throw r12
        L_0x0212:
            if (r0 != 0) goto L_0x021c
            p.b.k.h$g r12 = r11.mo4485h()
            r12.mo4514e()
            goto L_0x0223
        L_0x021c:
            p.b.k.h$g r12 = r11.f2714U
            if (r12 == 0) goto L_0x0223
            r12.mo4513a()
        L_0x0223:
            if (r0 != r4) goto L_0x0238
            p.b.k.h$g r12 = r11.f2715V
            if (r12 != 0) goto L_0x0232
            p.b.k.h$f r12 = new p.b.k.h$f
            android.content.Context r0 = r11.f2724h
            r12.<init>(r0)
            r11.f2715V = r12
        L_0x0232:
            p.b.k.h$g r12 = r11.f2715V
            r12.mo4514e()
            goto L_0x023f
        L_0x0238:
            p.b.k.h$g r12 = r11.f2715V
            if (r12 == 0) goto L_0x023f
            r12.mo4513a()
        L_0x023f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p127k.C1039h.mo4474a(boolean):boolean");
    }

    /* renamed from: b */
    public final boolean mo4476b(C1051j jVar, KeyEvent keyEvent) {
        Theme theme;
        if (this.f2709P) {
            return false;
        }
        if (jVar.f2770m) {
            return true;
        }
        C1051j jVar2 = this.f2704K;
        if (!(jVar2 == null || jVar2 == jVar)) {
            mo4471a(jVar2, false);
        }
        Callback i = mo4486i();
        if (i != null) {
            jVar.f2766i = i.onCreatePanelView(jVar.f2758a);
        }
        int i2 = jVar.f2758a;
        boolean z = i2 == 0 || i2 == 108;
        if (z) {
            C1227z zVar = this.f2731o;
            if (zVar != null) {
                zVar.mo130c();
            }
        }
        if (jVar.f2766i == null) {
            if (jVar.f2767j == null || jVar.f2775r) {
                if (jVar.f2767j == null) {
                    Context context = this.f2724h;
                    int i3 = jVar.f2758a;
                    if ((i3 == 0 || i3 == 108) && this.f2731o != null) {
                        TypedValue typedValue = new TypedValue();
                        Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(C1018a.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(C1018a.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(C1018a.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            C1092c cVar = new C1092c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    C1114g gVar = new C1114g(context);
                    gVar.f3076e = this;
                    jVar.mo4519a(gVar);
                    if (jVar.f2767j == null) {
                        return false;
                    }
                }
                if (z && this.f2731o != null) {
                    if (this.f2732p == null) {
                        this.f2732p = new C1042c();
                    }
                    this.f2731o.mo120a(jVar.f2767j, this.f2732p);
                }
                jVar.f2767j.mo4840j();
                if (!i.onCreatePanelMenu(jVar.f2758a, jVar.f2767j)) {
                    jVar.mo4519a(null);
                    if (z) {
                        C1227z zVar2 = this.f2731o;
                        if (zVar2 != null) {
                            zVar2.mo120a(null, this.f2732p);
                        }
                    }
                    return false;
                }
                jVar.f2775r = false;
            }
            jVar.f2767j.mo4840j();
            Bundle bundle = jVar.f2776s;
            if (bundle != null) {
                jVar.f2767j.mo4803a(bundle);
                jVar.f2776s = null;
            }
            if (!i.onPreparePanel(0, jVar.f2766i, jVar.f2767j)) {
                if (z) {
                    C1227z zVar3 = this.f2731o;
                    if (zVar3 != null) {
                        zVar3.mo120a(null, this.f2732p);
                    }
                }
                jVar.f2767j.mo4838i();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            jVar.f2773p = z2;
            jVar.f2767j.setQwertyMode(z2);
            jVar.f2767j.mo4838i();
        }
        jVar.f2770m = true;
        jVar.f2771n = false;
        this.f2704K = jVar;
        return true;
    }

    /* renamed from: b */
    public void mo4464b(int i) {
        mo4483f();
        ViewGroup viewGroup = (ViewGroup) this.f2741y.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2724h).inflate(i, viewGroup);
        this.f2726j.f2985e.onContentChanged();
    }

    /* renamed from: b */
    public void mo4465b(View view, LayoutParams layoutParams) {
        mo4483f();
        ViewGroup viewGroup = (ViewGroup) this.f2741y.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2726j.f2985e.onContentChanged();
    }

    /* renamed from: a */
    public final void mo4469a(Window window) {
        String str = "AppCompat has already installed itself into the Window";
        if (this.f2725i == null) {
            Callback callback = window.getCallback();
            if (!(callback instanceof C1045e)) {
                C1045e eVar = new C1045e(callback);
                this.f2726j = eVar;
                window.setCallback(eVar);
                C1213u0 a = C1213u0.m3012a(this.f2724h, (AttributeSet) null, f2691f0);
                Drawable c = a.mo5320c(0);
                if (c != null) {
                    window.setBackgroundDrawable(c);
                }
                a.f3426b.recycle();
                this.f2725i = window;
                return;
            }
            throw new IllegalStateException(str);
        }
        throw new IllegalStateException(str);
    }

    /* renamed from: a */
    public void mo4468a(int i, C1051j jVar, Menu menu) {
        if (menu == null) {
            if (jVar == null && i >= 0) {
                C1051j[] jVarArr = this.f2703J;
                if (i < jVarArr.length) {
                    jVar = jVarArr[i];
                }
            }
            if (jVar != null) {
                menu = jVar.f2767j;
            }
        }
        if ((jVar == null || jVar.f2772o) && !this.f2709P) {
            this.f2726j.f2985e.onPanelClosed(i, menu);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0117, code lost:
        if (r7 == false) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4472a(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f2723g
            boolean r1 = r0 instanceof p124p.p150h.p162l.C1392d.C1393a
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof p124p.p126b.p127k.C1059n
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r6.f2725i
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = p124p.p150h.p162l.C1404o.m3537b(r0, r7)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r7.getKeyCode()
            r1 = 82
            if (r0 != r1) goto L_0x002d
            p.b.k.h$e r0 = r6.f2726j
            android.view.Window$Callback r0 = r0.f2985e
            boolean r0 = r0.dispatchKeyEvent(r7)
            if (r0 == 0) goto L_0x002d
            return r2
        L_0x002d:
            int r0 = r7.getKeyCode()
            int r3 = r7.getAction()
            r4 = 0
            if (r3 != 0) goto L_0x003a
            r3 = r2
            goto L_0x003b
        L_0x003a:
            r3 = r4
        L_0x003b:
            r5 = 4
            if (r3 == 0) goto L_0x0065
            if (r0 == r5) goto L_0x0056
            if (r0 == r1) goto L_0x0043
            goto L_0x0062
        L_0x0043:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x0119
            p.b.k.h$j r0 = r6.mo4478d(r4)
            boolean r1 = r0.f2772o
            if (r1 != 0) goto L_0x0119
            r6.mo4476b(r0, r7)
            goto L_0x0119
        L_0x0056:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r2 = r4
        L_0x0060:
            r6.f2705L = r2
        L_0x0062:
            r2 = r4
            goto L_0x0119
        L_0x0065:
            if (r0 == r5) goto L_0x00eb
            if (r0 == r1) goto L_0x006a
            goto L_0x0062
        L_0x006a:
            p.b.p.a r0 = r6.f2734r
            if (r0 == 0) goto L_0x0070
            goto L_0x0119
        L_0x0070:
            p.b.k.h$j r0 = r6.mo4478d(r4)
            p.b.q.z r1 = r6.f2731o
            if (r1 == 0) goto L_0x00aa
            boolean r1 = r1.mo137g()
            if (r1 == 0) goto L_0x00aa
            android.content.Context r1 = r6.f2724h
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            boolean r1 = r1.hasPermanentMenuKey()
            if (r1 != 0) goto L_0x00aa
            p.b.q.z r1 = r6.f2731o
            boolean r1 = r1.mo126a()
            if (r1 != 0) goto L_0x00a3
            boolean r1 = r6.f2709P
            if (r1 != 0) goto L_0x00ca
            boolean r7 = r6.mo4476b(r0, r7)
            if (r7 == 0) goto L_0x00ca
            p.b.q.z r7 = r6.f2731o
            boolean r7 = r7.mo135f()
            goto L_0x00d1
        L_0x00a3:
            p.b.q.z r7 = r6.f2731o
            boolean r7 = r7.mo134e()
            goto L_0x00d1
        L_0x00aa:
            boolean r1 = r0.f2772o
            if (r1 != 0) goto L_0x00cc
            boolean r1 = r0.f2771n
            if (r1 == 0) goto L_0x00b3
            goto L_0x00cc
        L_0x00b3:
            boolean r1 = r0.f2770m
            if (r1 == 0) goto L_0x00ca
            boolean r1 = r0.f2775r
            if (r1 == 0) goto L_0x00c2
            r0.f2770m = r4
            boolean r1 = r6.mo4476b(r0, r7)
            goto L_0x00c3
        L_0x00c2:
            r1 = r2
        L_0x00c3:
            if (r1 == 0) goto L_0x00ca
            r6.mo4470a(r0, r7)
            r7 = r2
            goto L_0x00d1
        L_0x00ca:
            r7 = r4
            goto L_0x00d1
        L_0x00cc:
            boolean r7 = r0.f2772o
            r6.mo4471a(r0, r2)
        L_0x00d1:
            if (r7 == 0) goto L_0x0119
            android.content.Context r7 = r6.f2724h
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x00e3
            r7.playSoundEffect(r4)
            goto L_0x0119
        L_0x00e3:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
            goto L_0x0119
        L_0x00eb:
            boolean r7 = r6.f2705L
            r6.f2705L = r4
            p.b.k.h$j r0 = r6.mo4478d(r4)
            if (r0 == 0) goto L_0x00ff
            boolean r1 = r0.f2772o
            if (r1 == 0) goto L_0x00ff
            if (r7 != 0) goto L_0x0119
            r6.mo4471a(r0, r2)
            goto L_0x0119
        L_0x00ff:
            p.b.p.a r7 = r6.f2734r
            if (r7 == 0) goto L_0x0107
            r7.mo4540a()
            goto L_0x0114
        L_0x0107:
            r6.mo4487j()
            p.b.k.a r7 = r6.f2728l
            if (r7 == 0) goto L_0x0116
            boolean r7 = r7.mo4412a()
            if (r7 == 0) goto L_0x0116
        L_0x0114:
            r7 = r2
            goto L_0x0117
        L_0x0116:
            r7 = r4
        L_0x0117:
            if (r7 == 0) goto L_0x0062
        L_0x0119:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p127k.C1039h.mo4472a(android.view.KeyEvent):boolean");
    }

    /* renamed from: a */
    public void mo4457a() {
        LayoutInflater from = LayoutInflater.from(this.f2724h);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof C1039h)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: a */
    public void mo4458a(Bundle bundle) {
        this.f2706M = true;
        mo4474a(false);
        mo4484g();
        Object obj = this.f2723g;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                str = C1061o.m2527b((Context) activity, activity.getComponentName());
            } catch (NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                C1028a aVar = this.f2728l;
                if (aVar == null) {
                    this.f2719Z = true;
                } else {
                    aVar.mo4415b(true);
                }
            }
        }
        this.f2707N = true;
    }

    /* renamed from: a */
    public void mo198a(C1114g gVar) {
        C1227z zVar = this.f2731o;
        if (zVar == null || !zVar.mo137g() || (ViewConfiguration.get(this.f2724h).hasPermanentMenuKey() && !this.f2731o.mo132d())) {
            C1051j d = mo4478d(0);
            d.f2774q = true;
            mo4471a(d, false);
            mo4470a(d, (KeyEvent) null);
            return;
        }
        Callback i = mo4486i();
        if (this.f2731o.mo126a()) {
            this.f2731o.mo134e();
            if (!this.f2709P) {
                i.onPanelClosed(108, mo4478d(0).f2767j);
            }
        } else if (i != null && !this.f2709P) {
            if (this.f2716W && (1 & this.f2717X) != 0) {
                this.f2725i.getDecorView().removeCallbacks(this.f2718Y);
                this.f2718Y.run();
            }
            C1051j d2 = mo4478d(0);
            C1114g gVar2 = d2.f2767j;
            if (gVar2 != null && !d2.f2775r && i.onPreparePanel(0, d2.f2766i, gVar2)) {
                i.onMenuOpened(108, d2.f2767j);
                this.f2731o.mo135f();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0159, code lost:
        if (r3 != null) goto L_0x015b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0160  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4470a(p124p.p126b.p127k.C1039h.C1051j r14, android.view.KeyEvent r15) {
        /*
            r13 = this;
            boolean r0 = r14.f2772o
            if (r0 != 0) goto L_0x01d7
            boolean r0 = r13.f2709P
            if (r0 == 0) goto L_0x000a
            goto L_0x01d7
        L_0x000a:
            int r0 = r14.f2758a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0027
            android.content.Context r0 = r13.f2724h
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r3 = 4
            if (r0 != r3) goto L_0x0023
            r0 = r2
            goto L_0x0024
        L_0x0023:
            r0 = r1
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            android.view.Window$Callback r0 = r13.mo4486i()
            if (r0 == 0) goto L_0x003b
            int r3 = r14.f2758a
            p.b.p.i.g r4 = r14.f2767j
            boolean r0 = r0.onMenuOpened(r3, r4)
            if (r0 != 0) goto L_0x003b
            r13.mo4471a(r14, r2)
            return
        L_0x003b:
            android.content.Context r0 = r13.f2724h
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            boolean r15 = r13.mo4476b(r14, r15)
            if (r15 != 0) goto L_0x004f
            return
        L_0x004f:
            android.view.ViewGroup r15 = r14.f2764g
            r3 = -1
            r4 = -2
            if (r15 == 0) goto L_0x006b
            boolean r15 = r14.f2774q
            if (r15 == 0) goto L_0x005a
            goto L_0x006b
        L_0x005a:
            android.view.View r15 = r14.f2766i
            if (r15 == 0) goto L_0x01b5
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 == 0) goto L_0x01b5
            int r15 = r15.width
            if (r15 != r3) goto L_0x01b5
            r6 = r3
            goto L_0x01b6
        L_0x006b:
            android.view.ViewGroup r15 = r14.f2764g
            r3 = 0
            if (r15 != 0) goto L_0x00e5
            r13.mo4487j()
            p.b.k.a r15 = r13.f2728l
            if (r15 == 0) goto L_0x007c
            android.content.Context r15 = r15.mo4416c()
            goto L_0x007d
        L_0x007c:
            r15 = r3
        L_0x007d:
            if (r15 != 0) goto L_0x0081
            android.content.Context r15 = r13.f2724h
        L_0x0081:
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources r6 = r15.getResources()
            android.content.res.Resources$Theme r6 = r6.newTheme()
            android.content.res.Resources$Theme r7 = r15.getTheme()
            r6.setTo(r7)
            int r7 = p124p.p126b.C1018a.actionBarPopupTheme
            r6.resolveAttribute(r7, r5, r2)
            int r7 = r5.resourceId
            if (r7 == 0) goto L_0x00a1
            r6.applyStyle(r7, r2)
        L_0x00a1:
            int r7 = p124p.p126b.C1018a.panelMenuListTheme
            r6.resolveAttribute(r7, r5, r2)
            int r5 = r5.resourceId
            if (r5 == 0) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            int r5 = p124p.p126b.C1026i.Theme_AppCompat_CompactMenu
        L_0x00ad:
            r6.applyStyle(r5, r2)
            p.b.p.c r5 = new p.b.p.c
            r5.<init>(r15, r1)
            android.content.res.Resources$Theme r15 = r5.getTheme()
            r15.setTo(r6)
            r14.f2769l = r5
            int[] r15 = p124p.p126b.C1027j.AppCompatTheme
            android.content.res.TypedArray r15 = r5.obtainStyledAttributes(r15)
            int r5 = p124p.p126b.C1027j.AppCompatTheme_panelBackground
            int r5 = r15.getResourceId(r5, r1)
            r14.f2759b = r5
            int r5 = p124p.p126b.C1027j.AppCompatTheme_android_windowAnimationStyle
            int r5 = r15.getResourceId(r5, r1)
            r14.f2763f = r5
            r15.recycle()
            p.b.k.h$i r15 = new p.b.k.h$i
            android.content.Context r5 = r14.f2769l
            r15.<init>(r5)
            r14.f2764g = r15
            r15 = 81
            r14.f2760c = r15
            goto L_0x00f4
        L_0x00e5:
            boolean r5 = r14.f2774q
            if (r5 == 0) goto L_0x00f4
            int r15 = r15.getChildCount()
            if (r15 <= 0) goto L_0x00f4
            android.view.ViewGroup r15 = r14.f2764g
            r15.removeAllViews()
        L_0x00f4:
            android.view.View r15 = r14.f2766i
            if (r15 == 0) goto L_0x00fb
            r14.f2765h = r15
            goto L_0x015b
        L_0x00fb:
            p.b.p.i.g r15 = r14.f2767j
            if (r15 != 0) goto L_0x0100
            goto L_0x015d
        L_0x0100:
            p.b.k.h$k r15 = r13.f2733q
            if (r15 != 0) goto L_0x010b
            p.b.k.h$k r15 = new p.b.k.h$k
            r15.<init>()
            r13.f2733q = r15
        L_0x010b:
            p.b.k.h$k r15 = r13.f2733q
            p.b.p.i.g r5 = r14.f2767j
            if (r5 != 0) goto L_0x0112
            goto L_0x0157
        L_0x0112:
            p.b.p.i.e r3 = r14.f2768k
            if (r3 != 0) goto L_0x012a
            p.b.p.i.e r3 = new p.b.p.i.e
            android.content.Context r5 = r14.f2769l
            int r6 = p124p.p126b.C1024g.abc_list_menu_item_layout
            r3.<init>(r5, r6)
            r14.f2768k = r3
            r3.f3061l = r15
            p.b.p.i.g r15 = r14.f2767j
            android.content.Context r5 = r15.f3072a
            r15.mo4807a(r3, r5)
        L_0x012a:
            p.b.p.i.e r15 = r14.f2768k
            android.view.ViewGroup r3 = r14.f2764g
            androidx.appcompat.view.menu.ExpandedMenuView r5 = r15.f3057h
            if (r5 != 0) goto L_0x0155
            android.view.LayoutInflater r5 = r15.f3055f
            int r6 = p124p.p126b.C1024g.abc_expanded_menu_layout
            android.view.View r3 = r5.inflate(r6, r3, r1)
            androidx.appcompat.view.menu.ExpandedMenuView r3 = (androidx.appcompat.view.menu.ExpandedMenuView) r3
            r15.f3057h = r3
            p.b.p.i.e$a r3 = r15.f3062m
            if (r3 != 0) goto L_0x0149
            p.b.p.i.e$a r3 = new p.b.p.i.e$a
            r3.<init>()
            r15.f3062m = r3
        L_0x0149:
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r15.f3057h
            p.b.p.i.e$a r5 = r15.f3062m
            r3.setAdapter(r5)
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r15.f3057h
            r3.setOnItemClickListener(r15)
        L_0x0155:
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r15.f3057h
        L_0x0157:
            r14.f2765h = r3
            if (r3 == 0) goto L_0x015d
        L_0x015b:
            r15 = r2
            goto L_0x015e
        L_0x015d:
            r15 = r1
        L_0x015e:
            if (r15 == 0) goto L_0x01d7
            android.view.View r15 = r14.f2765h
            if (r15 != 0) goto L_0x0165
            goto L_0x0178
        L_0x0165:
            android.view.View r15 = r14.f2766i
            if (r15 == 0) goto L_0x016a
            goto L_0x0176
        L_0x016a:
            p.b.p.i.e r15 = r14.f2768k
            android.widget.ListAdapter r15 = r15.mo4784a()
            int r15 = r15.getCount()
            if (r15 <= 0) goto L_0x0178
        L_0x0176:
            r15 = r2
            goto L_0x0179
        L_0x0178:
            r15 = r1
        L_0x0179:
            if (r15 != 0) goto L_0x017c
            goto L_0x01d7
        L_0x017c:
            android.view.View r15 = r14.f2765h
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 != 0) goto L_0x0189
            android.view.ViewGroup$LayoutParams r15 = new android.view.ViewGroup$LayoutParams
            r15.<init>(r4, r4)
        L_0x0189:
            int r3 = r14.f2759b
            android.view.ViewGroup r5 = r14.f2764g
            r5.setBackgroundResource(r3)
            android.view.View r3 = r14.f2765h
            android.view.ViewParent r3 = r3.getParent()
            boolean r5 = r3 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x01a1
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r5 = r14.f2765h
            r3.removeView(r5)
        L_0x01a1:
            android.view.ViewGroup r3 = r14.f2764g
            android.view.View r5 = r14.f2765h
            r3.addView(r5, r15)
            android.view.View r15 = r14.f2765h
            boolean r15 = r15.hasFocus()
            if (r15 != 0) goto L_0x01b5
            android.view.View r15 = r14.f2765h
            r15.requestFocus()
        L_0x01b5:
            r6 = r4
        L_0x01b6:
            r14.f2771n = r1
            android.view.WindowManager$LayoutParams r15 = new android.view.WindowManager$LayoutParams
            r7 = -2
            int r8 = r14.f2761d
            int r9 = r14.f2762e
            r10 = 1002(0x3ea, float:1.404E-42)
            r11 = 8519680(0x820000, float:1.1938615E-38)
            r12 = -3
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            int r1 = r14.f2760c
            r15.gravity = r1
            int r1 = r14.f2763f
            r15.windowAnimations = r1
            android.view.ViewGroup r1 = r14.f2764g
            r0.addView(r1, r15)
            r14.f2772o = r2
        L_0x01d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p127k.C1039h.mo4470a(p.b.k.h$j, android.view.KeyEvent):void");
    }

    /* renamed from: a */
    public boolean mo4462a(int i) {
        String str = "AppCompatDelegate";
        if (i == 8) {
            Log.i(str, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i(str, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f2701H && i == 108) {
            return false;
        }
        if (this.f2697D && i == 1) {
            this.f2697D = false;
        }
        if (i == 1) {
            mo4489l();
            this.f2701H = true;
            return true;
        } else if (i == 2) {
            mo4489l();
            this.f2695B = true;
            return true;
        } else if (i == 5) {
            mo4489l();
            this.f2696C = true;
            return true;
        } else if (i == 10) {
            mo4489l();
            this.f2699F = true;
            return true;
        } else if (i == 108) {
            mo4489l();
            this.f2697D = true;
            return true;
        } else if (i != 109) {
            return this.f2725i.requestFeature(i);
        } else {
            mo4489l();
            this.f2698E = true;
            return true;
        }
    }

    /* renamed from: a */
    public void mo4459a(View view) {
        mo4483f();
        ViewGroup viewGroup = (ViewGroup) this.f2741y.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2726j.f2985e.onContentChanged();
    }

    /* renamed from: a */
    public final void mo4461a(CharSequence charSequence) {
        this.f2730n = charSequence;
        C1227z zVar = this.f2731o;
        if (zVar != null) {
            zVar.setWindowTitle(charSequence);
            return;
        }
        C1028a aVar = this.f2728l;
        if (aVar != null) {
            aVar.mo4410a(charSequence);
            return;
        }
        TextView textView = this.f2742z;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
