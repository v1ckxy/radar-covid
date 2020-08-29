package p124p.p167j.p169b;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.Chip.C0227b;
import java.util.ArrayList;
import java.util.List;
import p124p.p143e.C1262i;
import p124p.p150h.p162l.C1387a;
import p124p.p150h.p162l.C1404o;
import p124p.p150h.p162l.p163y.C1429b;
import p124p.p150h.p162l.p163y.C1433c;

/* renamed from: p.j.b.a */
public abstract class C1461a extends C1387a {

    /* renamed from: n */
    public static final Rect f4275n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);

    /* renamed from: o */
    public static final C1465b<C1429b> f4276o = new C1462a();

    /* renamed from: p */
    public static final C1466c<C1262i<C1429b>, C1429b> f4277p = new C1463b();

    /* renamed from: d */
    public final Rect f4278d = new Rect();

    /* renamed from: e */
    public final Rect f4279e = new Rect();

    /* renamed from: f */
    public final Rect f4280f = new Rect();

    /* renamed from: g */
    public final int[] f4281g = new int[2];

    /* renamed from: h */
    public final AccessibilityManager f4282h;

    /* renamed from: i */
    public final View f4283i;

    /* renamed from: j */
    public C1464c f4284j;

    /* renamed from: k */
    public int f4285k = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: l */
    public int f4286l = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: m */
    public int f4287m = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: p.j.b.a$a */
    public static class C1462a implements C1465b<C1429b> {
        /* renamed from: a */
        public void mo5998a(Object obj, Rect rect) {
            ((C1429b) obj).f4203a.getBoundsInParent(rect);
        }
    }

    /* renamed from: p.j.b.a$b */
    public static class C1463b implements C1466c<C1262i<C1429b>, C1429b> {
    }

    /* renamed from: p.j.b.a$c */
    public class C1464c extends C1433c {
        public C1464c() {
        }

        /* renamed from: a */
        public C1429b mo5957a(int i) {
            return new C1429b(AccessibilityNodeInfo.obtain(C1461a.this.mo5995d(i).f4203a));
        }

        /* renamed from: b */
        public C1429b mo5959b(int i) {
            int i2 = i == 2 ? C1461a.this.f4285k : C1461a.this.f4286l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return new C1429b(AccessibilityNodeInfo.obtain(C1461a.this.mo5995d(i2).f4203a));
        }

        /* renamed from: a */
        public boolean mo5958a(int i, int i2, Bundle bundle) {
            C1461a aVar = C1461a.this;
            if (i == -1) {
                return C1404o.m3532a(aVar.f4283i, i2, bundle);
            }
            boolean z = true;
            if (i2 == 1) {
                return aVar.mo5996e(i);
            }
            if (i2 == 2) {
                return aVar.mo5993b(i);
            }
            if (i2 != 64) {
                return i2 != 128 ? aVar.mo1994a(i, i2, bundle) : aVar.mo5990a(i);
            }
            if (aVar.f4282h.isEnabled() && aVar.f4282h.isTouchExplorationEnabled()) {
                int i3 = aVar.f4285k;
                if (i3 != i) {
                    if (i3 != Integer.MIN_VALUE) {
                        aVar.mo5990a(i3);
                    }
                    aVar.f4285k = i;
                    aVar.f4283i.invalidate();
                    aVar.mo5991a(i, 32768);
                    return z;
                }
            }
            z = false;
            return z;
        }
    }

    public C1461a(View view) {
        if (view != null) {
            this.f4283i = view;
            this.f4282h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C1404o.m3549j(view) == 0) {
                view.setImportantForAccessibility(1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: a */
    public C1433c mo5867a(View view) {
        if (this.f4284j == null) {
            this.f4284j = new C1464c();
        }
        return this.f4284j;
    }

    /* renamed from: a */
    public abstract void mo1992a(int i, C1429b bVar);

    /* renamed from: a */
    public abstract void mo1993a(List<Integer> list);

    /* renamed from: a */
    public final boolean mo5990a(int i) {
        if (this.f4285k != i) {
            return false;
        }
        this.f4285k = RecyclerView.UNDEFINED_DURATION;
        this.f4283i.invalidate();
        mo5991a(i, 65536);
        return true;
    }

    /* renamed from: a */
    public abstract boolean mo1994a(int i, int i2, Bundle bundle);

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0130, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L_0x0132;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x013c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5992a(int r20, android.graphics.Rect r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.mo1993a(r3)
            p.e.i r4 = new p.e.i
            r5 = 10
            r4.<init>(r5)
            r5 = 0
            r6 = r5
        L_0x0017:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x0027
            p.h.l.y.b r7 = r0.mo5994c(r6)
            r4.mo5619c(r6, r7)
            int r6 = r6 + 1
            goto L_0x0017
        L_0x0027:
            int r3 = r0.f4286l
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r7) goto L_0x002f
            r3 = 0
            goto L_0x0035
        L_0x002f:
            java.lang.Object r3 = r4.mo5612a(r3)
            p.h.l.y.b r3 = (p124p.p150h.p162l.p163y.C1429b) r3
        L_0x0035:
            r8 = 2
            r9 = -1
            r10 = 1
            if (r1 == r10) goto L_0x0141
            if (r1 == r8) goto L_0x0141
            r8 = 130(0x82, float:1.82E-43)
            r11 = 66
            r12 = 33
            r13 = 17
            if (r1 == r13) goto L_0x0055
            if (r1 == r12) goto L_0x0055
            if (r1 == r11) goto L_0x0055
            if (r1 != r8) goto L_0x004d
            goto L_0x0055
        L_0x004d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L_0x0055:
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            int r15 = r0.f4286l
            java.lang.String r6 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r15 == r7) goto L_0x006a
            p.h.l.y.b r2 = r0.mo5995d(r15)
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f4203a
            r2.getBoundsInParent(r14)
            goto L_0x0097
        L_0x006a:
            if (r2 == 0) goto L_0x0070
            r14.set(r2)
            goto L_0x0097
        L_0x0070:
            android.view.View r2 = r0.f4283i
            int r15 = r2.getWidth()
            int r2 = r2.getHeight()
            if (r1 == r13) goto L_0x0094
            if (r1 == r12) goto L_0x0090
            if (r1 == r11) goto L_0x008c
            if (r1 != r8) goto L_0x0086
            r14.set(r5, r9, r15, r9)
            goto L_0x0097
        L_0x0086:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r6)
            throw r1
        L_0x008c:
            r14.set(r9, r5, r9, r2)
            goto L_0x0097
        L_0x0090:
            r14.set(r5, r2, r15, r2)
            goto L_0x0097
        L_0x0094:
            r14.set(r15, r5, r15, r2)
        L_0x0097:
            p.j.b.c<p.e.i<p.h.l.y.b>, p.h.l.y.b> r2 = f4277p
            p.j.b.b<p.h.l.y.b> r15 = f4276o
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>(r14)
            if (r1 == r13) goto L_0x00c5
            if (r1 == r12) goto L_0x00bc
            if (r1 == r11) goto L_0x00b5
            if (r1 != r8) goto L_0x00af
            int r6 = r14.height()
            int r6 = r6 + r10
            int r6 = -r6
            goto L_0x00c1
        L_0x00af:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r6)
            throw r1
        L_0x00b5:
            int r6 = r14.width()
            int r6 = r6 + r10
            int r6 = -r6
            goto L_0x00ca
        L_0x00bc:
            int r6 = r14.height()
            int r6 = r6 + r10
        L_0x00c1:
            r7.offset(r5, r6)
            goto L_0x00cd
        L_0x00c5:
            int r6 = r14.width()
            int r6 = r6 + r10
        L_0x00ca:
            r7.offset(r6, r5)
        L_0x00cd:
            p.j.b.a$b r2 = (p124p.p167j.p169b.C1461a.C1463b) r2
            if (r2 == 0) goto L_0x013f
            int r2 = r4.mo5617c()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r8 = r5
            r16 = 0
        L_0x00dd:
            if (r8 >= r2) goto L_0x01b3
            boolean r11 = r4.f3591e
            if (r11 == 0) goto L_0x00e6
            r4.mo5616b()
        L_0x00e6:
            java.lang.Object[] r11 = r4.f3593g
            r11 = r11[r8]
            p.h.l.y.b r11 = (p124p.p150h.p162l.p163y.C1429b) r11
            if (r11 != r3) goto L_0x00ef
            goto L_0x013c
        L_0x00ef:
            r12 = r15
            p.j.b.a$a r12 = (p124p.p167j.p169b.C1461a.C1462a) r12
            r12.mo5998a(r11, r6)
            boolean r12 = p124p.p126b.p127k.C1061o.m2512a(r14, r6, r1)
            if (r12 != 0) goto L_0x00fc
            goto L_0x0134
        L_0x00fc:
            boolean r12 = p124p.p126b.p127k.C1061o.m2512a(r14, r7, r1)
            if (r12 != 0) goto L_0x0103
            goto L_0x0132
        L_0x0103:
            boolean r12 = p124p.p126b.p127k.C1061o.m2511a(r1, r14, r6, r7)
            if (r12 == 0) goto L_0x010a
            goto L_0x0132
        L_0x010a:
            boolean r12 = p124p.p126b.p127k.C1061o.m2511a(r1, r14, r7, r6)
            if (r12 == 0) goto L_0x0111
            goto L_0x0134
        L_0x0111:
            int r12 = p124p.p126b.p127k.C1061o.m2520b(r1, r14, r6)
            int r13 = p124p.p126b.p127k.C1061o.m2538c(r1, r14, r6)
            int r17 = r12 * 13
            int r17 = r17 * r12
            int r13 = r13 * r13
            int r13 = r13 + r17
            int r12 = p124p.p126b.p127k.C1061o.m2520b(r1, r14, r7)
            int r17 = p124p.p126b.p127k.C1061o.m2538c(r1, r14, r7)
            int r18 = r12 * 13
            int r18 = r18 * r12
            int r17 = r17 * r17
            int r12 = r17 + r18
            if (r13 >= r12) goto L_0x0134
        L_0x0132:
            r12 = r10
            goto L_0x0135
        L_0x0134:
            r12 = r5
        L_0x0135:
            if (r12 == 0) goto L_0x013c
            r7.set(r6)
            r16 = r11
        L_0x013c:
            int r8 = r8 + 1
            goto L_0x00dd
        L_0x013f:
            r1 = 0
            throw r1
        L_0x0141:
            android.view.View r2 = r0.f4283i
            int r2 = p124p.p150h.p162l.C1404o.m3551l(r2)
            if (r2 != r10) goto L_0x014b
            r2 = r10
            goto L_0x014c
        L_0x014b:
            r2 = r5
        L_0x014c:
            p.j.b.c<p.e.i<p.h.l.y.b>, p.h.l.y.b> r6 = f4277p
            p.j.b.b<p.h.l.y.b> r7 = f4276o
            p.j.b.a$b r6 = (p124p.p167j.p169b.C1461a.C1463b) r6
            if (r6 == 0) goto L_0x01d9
            int r6 = r4.mo5617c()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r6)
            r12 = r5
        L_0x015e:
            if (r12 >= r6) goto L_0x0173
            boolean r13 = r4.f3591e
            if (r13 == 0) goto L_0x0167
            r4.mo5616b()
        L_0x0167:
            java.lang.Object[] r13 = r4.f3593g
            r13 = r13[r12]
            p.h.l.y.b r13 = (p124p.p150h.p162l.p163y.C1429b) r13
            r11.add(r13)
            int r12 = r12 + 1
            goto L_0x015e
        L_0x0173:
            p.j.b.d r6 = new p.j.b.d
            r6.<init>(r2, r7)
            java.util.Collections.sort(r11, r6)
            if (r1 == r10) goto L_0x019d
            if (r1 != r8) goto L_0x0195
            int r1 = r11.size()
            if (r3 != 0) goto L_0x0187
            r2 = r9
            goto L_0x018b
        L_0x0187:
            int r2 = r11.lastIndexOf(r3)
        L_0x018b:
            int r2 = r2 + r10
            if (r2 >= r1) goto L_0x0193
            java.lang.Object r6 = r11.get(r2)
            goto L_0x01af
        L_0x0193:
            r6 = 0
            goto L_0x01af
        L_0x0195:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L_0x019d:
            int r1 = r11.size()
            if (r3 != 0) goto L_0x01a4
            goto L_0x01a8
        L_0x01a4:
            int r1 = r11.indexOf(r3)
        L_0x01a8:
            int r1 = r1 + r9
            if (r1 < 0) goto L_0x0193
            java.lang.Object r6 = r11.get(r1)
        L_0x01af:
            r16 = r6
            p.h.l.y.b r16 = (p124p.p150h.p162l.p163y.C1429b) r16
        L_0x01b3:
            r1 = r16
            if (r1 != 0) goto L_0x01ba
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x01d4
        L_0x01ba:
            boolean r2 = r4.f3591e
            if (r2 == 0) goto L_0x01c1
            r4.mo5616b()
        L_0x01c1:
            int r2 = r4.f3594h
            if (r5 >= r2) goto L_0x01d0
            java.lang.Object[] r2 = r4.f3593g
            r2 = r2[r5]
            if (r2 != r1) goto L_0x01cd
            r9 = r5
            goto L_0x01d0
        L_0x01cd:
            int r5 = r5 + 1
            goto L_0x01c1
        L_0x01d0:
            int r7 = r4.mo5614b(r9)
        L_0x01d4:
            boolean r1 = r0.mo5996e(r7)
            return r1
        L_0x01d9:
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p167j.p169b.C1461a.mo5992a(int, android.graphics.Rect):boolean");
    }

    /* renamed from: b */
    public final boolean mo5993b(int i) {
        if (this.f4286l != i) {
            return false;
        }
        this.f4286l = RecyclerView.UNDEFINED_DURATION;
        C0227b bVar = (C0227b) this;
        if (i == 1) {
            Chip chip = Chip.this;
            chip.f1288p = false;
            chip.refreshDrawableState();
        }
        mo5991a(i, 8);
        return true;
    }

    /* renamed from: c */
    public final C1429b mo5994c(int i) {
        AccessibilityNodeInfo accessibilityNodeInfo;
        C1429b bVar = new C1429b(AccessibilityNodeInfo.obtain());
        bVar.f4203a.setEnabled(true);
        bVar.f4203a.setFocusable(true);
        bVar.f4203a.setClassName("android.view.View");
        bVar.f4203a.setBoundsInParent(f4275n);
        bVar.f4203a.setBoundsInScreen(f4275n);
        View view = this.f4283i;
        bVar.f4204b = -1;
        bVar.f4203a.setParent(view);
        mo1992a(i, bVar);
        if (bVar.mo5950c() == null && bVar.mo5942a() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        bVar.f4203a.getBoundsInParent(this.f4279e);
        if (!this.f4279e.equals(f4275n)) {
            int actions = bVar.f4203a.getActions();
            if ((actions & 64) == 0) {
                int i2 = 128;
                if ((actions & 128) == 0) {
                    bVar.f4203a.setPackageName(this.f4283i.getContext().getPackageName());
                    View view2 = this.f4283i;
                    bVar.f4205c = i;
                    bVar.f4203a.setSource(view2, i);
                    boolean z = false;
                    if (this.f4285k == i) {
                        bVar.f4203a.setAccessibilityFocused(true);
                        accessibilityNodeInfo = bVar.f4203a;
                    } else {
                        bVar.f4203a.setAccessibilityFocused(false);
                        accessibilityNodeInfo = bVar.f4203a;
                        i2 = 64;
                    }
                    accessibilityNodeInfo.addAction(i2);
                    boolean z2 = this.f4286l == i;
                    if (z2) {
                        bVar.f4203a.addAction(2);
                    } else if (bVar.f4203a.isFocusable()) {
                        bVar.f4203a.addAction(1);
                    }
                    bVar.f4203a.setFocused(z2);
                    this.f4283i.getLocationOnScreen(this.f4281g);
                    bVar.f4203a.getBoundsInScreen(this.f4278d);
                    if (this.f4278d.equals(f4275n)) {
                        bVar.f4203a.getBoundsInParent(this.f4278d);
                        if (bVar.f4204b != -1) {
                            C1429b bVar2 = new C1429b(AccessibilityNodeInfo.obtain());
                            for (int i3 = bVar.f4204b; i3 != -1; i3 = bVar2.f4204b) {
                                View view3 = this.f4283i;
                                bVar2.f4204b = -1;
                                bVar2.f4203a.setParent(view3, -1);
                                bVar2.f4203a.setBoundsInParent(f4275n);
                                mo1992a(i3, bVar2);
                                bVar2.f4203a.getBoundsInParent(this.f4279e);
                                Rect rect = this.f4278d;
                                Rect rect2 = this.f4279e;
                                rect.offset(rect2.left, rect2.top);
                            }
                            bVar2.f4203a.recycle();
                        }
                        this.f4278d.offset(this.f4281g[0] - this.f4283i.getScrollX(), this.f4281g[1] - this.f4283i.getScrollY());
                    }
                    if (this.f4283i.getLocalVisibleRect(this.f4280f)) {
                        this.f4280f.offset(this.f4281g[0] - this.f4283i.getScrollX(), this.f4281g[1] - this.f4283i.getScrollY());
                        if (this.f4278d.intersect(this.f4280f)) {
                            bVar.f4203a.setBoundsInScreen(this.f4278d);
                            Rect rect3 = this.f4278d;
                            if (rect3 != null && !rect3.isEmpty() && this.f4283i.getWindowVisibility() == 0) {
                                View view4 = this.f4283i;
                                while (true) {
                                    ViewParent parent = view4.getParent();
                                    if (parent instanceof View) {
                                        view4 = (View) parent;
                                        if (view4.getAlpha() > 0.0f) {
                                            if (view4.getVisibility() != 0) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else if (parent != null) {
                                        z = true;
                                    }
                                }
                            }
                            if (z) {
                                bVar.f4203a.setVisibleToUser(true);
                            }
                        }
                    }
                    return bVar;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    /* renamed from: d */
    public C1429b mo5995d(int i) {
        if (i != -1) {
            return mo5994c(i);
        }
        C1429b bVar = new C1429b(AccessibilityNodeInfo.obtain(this.f4283i));
        C1404o.m3530a(this.f4283i, bVar);
        ArrayList arrayList = new ArrayList();
        mo1993a((List<Integer>) arrayList);
        if (bVar.f4203a.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                bVar.f4203a.addChild(this.f4283i, ((Integer) arrayList.get(i2)).intValue());
            }
            return bVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: e */
    public final boolean mo5996e(int i) {
        if (!this.f4283i.isFocused() && !this.f4283i.requestFocus()) {
            return false;
        }
        int i2 = this.f4286l;
        if (i2 == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo5993b(i2);
        }
        this.f4286l = i;
        C0227b bVar = (C0227b) this;
        if (i == 1) {
            Chip chip = Chip.this;
            chip.f1288p = true;
            chip.refreshDrawableState();
        }
        mo5991a(i, 8);
        return true;
    }

    /* renamed from: f */
    public final void mo5997f(int i) {
        int i2 = this.f4287m;
        if (i2 != i) {
            this.f4287m = i;
            mo5991a(i, 128);
            mo5991a(i2, 256);
        }
    }

    /* renamed from: b */
    public void mo770b(View view, AccessibilityEvent accessibilityEvent) {
        this.f4146a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo768a(View view, C1429b bVar) {
        this.f4146a.onInitializeAccessibilityNodeInfo(view, bVar.f4203a);
        C0227b bVar2 = (C0227b) this;
        bVar.f4203a.setCheckable(Chip.this.mo1851c());
        bVar.f4203a.setClickable(Chip.this.isClickable());
        if (Chip.this.mo1851c() || Chip.this.isClickable()) {
            bVar.f4203a.setClassName(Chip.this.mo1851c() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            bVar.f4203a.setClassName("android.view.View");
        }
        bVar.f4203a.setText(Chip.this.getText());
    }

    /* renamed from: a */
    public final boolean mo5991a(int i, int i2) {
        AccessibilityEvent accessibilityEvent;
        if (i == Integer.MIN_VALUE || !this.f4282h.isEnabled()) {
            return false;
        }
        ViewParent parent = this.f4283i.getParent();
        if (parent == null) {
            return false;
        }
        if (i != -1) {
            accessibilityEvent = AccessibilityEvent.obtain(i2);
            C1429b d = mo5995d(i);
            accessibilityEvent.getText().add(d.mo5950c());
            accessibilityEvent.setContentDescription(d.mo5942a());
            accessibilityEvent.setScrollable(d.f4203a.isScrollable());
            accessibilityEvent.setPassword(d.f4203a.isPassword());
            accessibilityEvent.setEnabled(d.f4203a.isEnabled());
            accessibilityEvent.setChecked(d.f4203a.isChecked());
            if (!accessibilityEvent.getText().isEmpty() || accessibilityEvent.getContentDescription() != null) {
                accessibilityEvent.setClassName(d.f4203a.getClassName());
                accessibilityEvent.setSource(this.f4283i, i);
                accessibilityEvent.setPackageName(this.f4283i.getContext().getPackageName());
            } else {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
        } else {
            accessibilityEvent = AccessibilityEvent.obtain(i2);
            this.f4283i.onInitializeAccessibilityEvent(accessibilityEvent);
        }
        return parent.requestSendAccessibilityEvent(this.f4283i, accessibilityEvent);
    }
}
