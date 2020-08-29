package p124p.p126b.p134p.p135i;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow.OnDismissListener;
import p124p.p126b.p134p.p135i.C1129m.C1130a;
import p124p.p150h.p162l.C1404o;

/* renamed from: p.b.p.i.l */
public class C1127l {

    /* renamed from: a */
    public final Context f3142a;

    /* renamed from: b */
    public final C1114g f3143b;

    /* renamed from: c */
    public final boolean f3144c;

    /* renamed from: d */
    public final int f3145d;

    /* renamed from: e */
    public final int f3146e;

    /* renamed from: f */
    public View f3147f;

    /* renamed from: g */
    public int f3148g = 8388611;

    /* renamed from: h */
    public boolean f3149h;

    /* renamed from: i */
    public C1130a f3150i;

    /* renamed from: j */
    public C1126k f3151j;

    /* renamed from: k */
    public OnDismissListener f3152k;

    /* renamed from: l */
    public final OnDismissListener f3153l = new C1128a();

    /* renamed from: p.b.p.i.l$a */
    public class C1128a implements OnDismissListener {
        public C1128a() {
        }

        public void onDismiss() {
            C1127l.this.mo4965c();
        }
    }

    public C1127l(Context context, C1114g gVar, View view, boolean z, int i, int i2) {
        this.f3142a = context;
        this.f3143b = gVar;
        this.f3147f = view;
        this.f3144c = z;
        this.f3145d = i;
        this.f3146e = i2;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [p.b.p.i.k, p.b.p.i.m] */
    /* JADX WARNING: type inference failed for: r7v0, types: [p.b.p.i.q] */
    /* JADX WARNING: type inference failed for: r1v12, types: [p.b.p.i.d] */
    /* JADX WARNING: type inference failed for: r7v1, types: [p.b.p.i.q] */
    /* JADX WARNING: type inference failed for: r1v13, types: [p.b.p.i.d] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v1, types: [p.b.p.i.q]
      assigns: [p.b.p.i.q, p.b.p.i.d]
      uses: [p.b.p.i.q, p.b.p.i.k, p.b.p.i.m, p.b.p.i.d]
      mth insns count: 50
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p124p.p126b.p134p.p135i.C1126k mo4961a() {
        /*
            r14 = this;
            p.b.p.i.k r0 = r14.f3151j
            if (r0 != 0) goto L_0x0078
            android.content.Context r0 = r14.f3142a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.getRealSize(r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f3142a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p124p.p126b.C1021d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0032
            r0 = 1
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            if (r0 == 0) goto L_0x0046
            p.b.p.i.d r0 = new p.b.p.i.d
            android.content.Context r2 = r14.f3142a
            android.view.View r3 = r14.f3147f
            int r4 = r14.f3145d
            int r5 = r14.f3146e
            boolean r6 = r14.f3144c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0058
        L_0x0046:
            p.b.p.i.q r0 = new p.b.p.i.q
            android.content.Context r8 = r14.f3142a
            p.b.p.i.g r9 = r14.f3143b
            android.view.View r10 = r14.f3147f
            int r11 = r14.f3145d
            int r12 = r14.f3146e
            boolean r13 = r14.f3144c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0058:
            p.b.p.i.g r1 = r14.f3143b
            r0.mo4765a(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f3153l
            r0.mo4764a(r1)
            android.view.View r1 = r14.f3147f
            r0.mo4763a(r1)
            p.b.p.i.m$a r1 = r14.f3150i
            r0.mo535a(r1)
            boolean r1 = r14.f3149h
            r0.mo4768b(r1)
            int r1 = r14.f3148g
            r0.mo4762a(r1)
            r14.f3151j = r0
        L_0x0078:
            p.b.p.i.k r0 = r14.f3151j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p134p.p135i.C1127l.mo4961a():p.b.p.i.k");
    }

    /* renamed from: a */
    public void mo4963a(C1130a aVar) {
        this.f3150i = aVar;
        C1126k kVar = this.f3151j;
        if (kVar != null) {
            kVar.mo535a(aVar);
        }
    }

    /* renamed from: b */
    public boolean mo4964b() {
        C1126k kVar = this.f3151j;
        return kVar != null && kVar.mo4766a();
    }

    /* renamed from: c */
    public void mo4965c() {
        this.f3151j = null;
        OnDismissListener onDismissListener = this.f3152k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: d */
    public boolean mo4966d() {
        if (mo4964b()) {
            return true;
        }
        if (this.f3147f == null) {
            return false;
        }
        mo4962a(0, 0, false, false);
        return true;
    }

    /* renamed from: a */
    public final void mo4962a(int i, int i2, boolean z, boolean z2) {
        C1126k a = mo4961a();
        a.mo4772c(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f3148g, C1404o.m3551l(this.f3147f)) & 7) == 5) {
                i -= this.f3147f.getWidth();
            }
            a.mo4767b(i);
            a.mo4770c(i2);
            int i3 = (int) ((this.f3142a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.f3141e = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a.mo4769c();
    }
}
