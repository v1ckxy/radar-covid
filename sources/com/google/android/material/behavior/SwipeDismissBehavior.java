package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0068c;
import p124p.p150h.p162l.C1404o;
import p124p.p167j.p169b.C1468e;
import p124p.p167j.p169b.C1468e.C1471c;

public class SwipeDismissBehavior<V extends View> extends C0068c<V> {

    /* renamed from: a */
    public C1468e f1169a;

    /* renamed from: b */
    public C0207b f1170b;

    /* renamed from: c */
    public boolean f1171c;

    /* renamed from: d */
    public float f1172d = 0.0f;

    /* renamed from: e */
    public int f1173e = 2;

    /* renamed from: f */
    public float f1174f = 0.5f;

    /* renamed from: g */
    public float f1175g = 0.0f;

    /* renamed from: h */
    public float f1176h = 0.5f;

    /* renamed from: i */
    public final C1471c f1177i = new C0206a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    public class C0206a extends C1471c {

        /* renamed from: a */
        public int f1178a;

        /* renamed from: b */
        public int f1179b = -1;

        public C0206a() {
        }

        /* renamed from: a */
        public int mo1689a(View view) {
            return view.getWidth();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            if (r5 != false) goto L_0x001c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            if (r5 != false) goto L_0x0012;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            r5 = r2.f1178a;
            r3 = r3.getWidth() + r5;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo1690a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = p124p.p150h.p162l.C1404o.m3551l(r3)
                r0 = 1
                if (r5 != r0) goto L_0x0009
                r5 = r0
                goto L_0x000a
            L_0x0009:
                r5 = 0
            L_0x000a:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f1173e
                if (r1 != 0) goto L_0x0024
                if (r5 == 0) goto L_0x001c
            L_0x0012:
                int r5 = r2.f1178a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f1178a
                goto L_0x0037
            L_0x001c:
                int r5 = r2.f1178a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0037
            L_0x0024:
                if (r1 != r0) goto L_0x0029
                if (r5 == 0) goto L_0x0012
                goto L_0x001c
            L_0x0029:
                int r5 = r2.f1178a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f1178a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0037:
                int r4 = java.lang.Math.max(r5, r4)
                int r3 = java.lang.Math.min(r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C0206a.mo1690a(android.view.View, int, int):int");
        }

        /* renamed from: a */
        public void mo1691a(int i) {
            C0207b bVar = SwipeDismissBehavior.this.f1170b;
            if (bVar != null) {
                bVar.mo1697a(i);
            }
        }

        /* renamed from: a */
        public void mo1693a(View view, int i) {
            this.f1179b = i;
            this.f1178a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: a */
        public void mo1694a(View view, int i, int i2, int i3, int i4) {
            float width = (((float) view.getWidth()) * SwipeDismissBehavior.this.f1175g) + ((float) this.f1178a);
            float width2 = (((float) view.getWidth()) * SwipeDismissBehavior.this.f1176h) + ((float) this.f1178a);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m951a(0.0f, 1.0f - ((f - width) / (width2 - width)), 1.0f));
            }
        }

        /* renamed from: b */
        public int mo1695b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: b */
        public boolean mo1696b(View view, int i) {
            int i2 = this.f1179b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo1688a(view);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.f1178a) >= java.lang.Math.round(((float) r8.getWidth()) * r7.f1180c.f1174f)) goto L_0x002a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0080  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1692a(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.f1179b = r10
                int r10 = r8.getWidth()
                r0 = 0
                int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x003a
                int r4 = p124p.p150h.p162l.C1404o.m3551l(r8)
                if (r4 != r2) goto L_0x0016
                r4 = r2
                goto L_0x0017
            L_0x0016:
                r4 = r3
            L_0x0017:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.f1173e
                r6 = 2
                if (r5 != r6) goto L_0x001f
                goto L_0x002a
            L_0x001f:
                if (r5 != 0) goto L_0x002e
                if (r4 == 0) goto L_0x0028
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x002c
                goto L_0x002a
            L_0x0028:
                if (r1 <= 0) goto L_0x002c
            L_0x002a:
                r9 = r2
                goto L_0x0056
            L_0x002c:
                r9 = r3
                goto L_0x0056
            L_0x002e:
                if (r5 != r2) goto L_0x002c
                if (r4 == 0) goto L_0x0035
                if (r1 <= 0) goto L_0x002c
                goto L_0x0039
            L_0x0035:
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x002c
            L_0x0039:
                goto L_0x002a
            L_0x003a:
                int r9 = r8.getLeft()
                int r0 = r7.f1178a
                int r9 = r9 - r0
                int r0 = r8.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r1 = r1.f1174f
                float r0 = r0 * r1
                int r0 = java.lang.Math.round(r0)
                int r9 = java.lang.Math.abs(r9)
                if (r9 < r0) goto L_0x002c
                goto L_0x002a
            L_0x0056:
                if (r9 == 0) goto L_0x0064
                int r9 = r8.getLeft()
                int r0 = r7.f1178a
                if (r9 >= r0) goto L_0x0062
                int r0 = r0 - r10
                goto L_0x0067
            L_0x0062:
                int r0 = r0 + r10
                goto L_0x0067
            L_0x0064:
                int r0 = r7.f1178a
                r2 = r3
            L_0x0067:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                p.j.b.e r9 = r9.f1169a
                int r10 = r8.getTop()
                boolean r9 = r9.mo6018b(r0, r10)
                if (r9 == 0) goto L_0x0080
                com.google.android.material.behavior.SwipeDismissBehavior$c r9 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r2)
                p124p.p150h.p162l.C1404o.m3523a(r8, r9)
                goto L_0x008b
            L_0x0080:
                if (r2 == 0) goto L_0x008b
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$b r9 = r9.f1170b
                if (r9 == 0) goto L_0x008b
                r9.mo1698a(r8)
            L_0x008b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C0206a.mo1692a(android.view.View, float, float):void");
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public interface C0207b {
        /* renamed from: a */
        void mo1697a(int i);

        /* renamed from: a */
        void mo1698a(View view);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    public class C0208c implements Runnable {

        /* renamed from: e */
        public final View f1181e;

        /* renamed from: f */
        public final boolean f1182f;

        public C0208c(View view, boolean z) {
            this.f1181e = view;
            this.f1182f = z;
        }

        public void run() {
            C1468e eVar = SwipeDismissBehavior.this.f1169a;
            if (eVar != null && eVar.mo6012a(true)) {
                C1404o.m3523a(this.f1181e, (Runnable) this);
            } else if (this.f1182f) {
                C0207b bVar = SwipeDismissBehavior.this.f1170b;
                if (bVar != null) {
                    bVar.mo1698a(this.f1181e);
                }
            }
        }
    }

    /* renamed from: a */
    public static float m951a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: a */
    public boolean mo1688a(View view) {
        return true;
    }

    /* renamed from: a */
    public boolean mo662a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f1171c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.mo603a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1171c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1171c = false;
        }
        if (!z) {
            return false;
        }
        if (this.f1169a == null) {
            this.f1169a = new C1468e(coordinatorLayout.getContext(), coordinatorLayout, this.f1177i);
        }
        return this.f1169a.mo6021c(motionEvent);
    }

    /* renamed from: b */
    public boolean mo667b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C1468e eVar = this.f1169a;
        if (eVar == null) {
            return false;
        }
        eVar.mo6007a(motionEvent);
        return true;
    }
}
