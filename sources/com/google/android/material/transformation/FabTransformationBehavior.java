package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0071f;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p213q.p217b.p218a.p271c.p283m.C3407a;
import p213q.p217b.p218a.p271c.p283m.C3413g;
import p213q.p217b.p218a.p271c.p283m.C3414h;
import p213q.p217b.p218a.p271c.p283m.C3415i;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final Rect f1440c = new Rect();

    /* renamed from: d */
    public final RectF f1441d = new RectF();

    /* renamed from: e */
    public final RectF f1442e = new RectF();

    /* renamed from: f */
    public final int[] f1443f = new int[2];

    /* renamed from: g */
    public float f1444g;

    /* renamed from: h */
    public float f1445h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    public class C0255a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f1446a;

        /* renamed from: b */
        public final /* synthetic */ View f1447b;

        /* renamed from: c */
        public final /* synthetic */ View f1448c;

        public C0255a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f1446a = z;
            this.f1447b = view;
            this.f1448c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f1446a) {
                this.f1447b.setVisibility(4);
                this.f1448c.setAlpha(1.0f);
                this.f1448c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f1446a) {
                this.f1447b.setVisibility(0);
                this.f1448c.setAlpha(0.0f);
                this.f1448c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    public static class C0256b {

        /* renamed from: a */
        public C3413g f1449a;

        /* renamed from: b */
        public C3415i f1450b;
    }

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final float mo2323a(View view, View view2, C3415i iVar) {
        float f;
        float f2;
        RectF rectF = this.f1441d;
        RectF rectF2 = this.f1442e;
        mo2327a(view, rectF);
        rectF.offset(this.f1444g, this.f1445h);
        mo2327a(view2, rectF2);
        float f3 = 0.0f;
        int i = iVar.f8592a & 7;
        if (i == 1) {
            f2 = rectF2.centerX();
            f = rectF.centerX();
        } else if (i != 3) {
            if (i == 5) {
                f2 = rectF2.right;
                f = rectF.right;
            }
            return f3 + iVar.f8593b;
        } else {
            f2 = rectF2.left;
            f = rectF.left;
        }
        f3 = f2 - f;
        return f3 + iVar.f8593b;
    }

    /* renamed from: a */
    public final Pair<C3414h, C3414h> mo2325a(float f, float f2, boolean z, C0256b bVar) {
        String str;
        C3413g gVar;
        C3414h hVar;
        if (f != 0.0f) {
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i != 0) {
                if ((!z || f2 >= 0.0f) && (z || i <= 0)) {
                    hVar = bVar.f1449a.mo9189a("translationXCurveDownwards");
                    gVar = bVar.f1449a;
                    str = "translationYCurveDownwards";
                } else {
                    hVar = bVar.f1449a.mo9189a("translationXCurveUpwards");
                    gVar = bVar.f1449a;
                    str = "translationYCurveUpwards";
                }
                return new Pair<>(hVar, gVar.mo9189a(str));
            }
        }
        hVar = bVar.f1449a.mo9189a("translationXLinear");
        gVar = bVar.f1449a;
        str = "translationYLinear";
        return new Pair<>(hVar, gVar.mo9189a(str));
    }

    /* renamed from: a */
    public final ViewGroup mo2326a(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo2327a(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f1443f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: a */
    public void mo652a(C0071f fVar) {
        if (fVar.f526h == 0) {
            fVar.f526h = 80;
        }
    }

    /* renamed from: a */
    public boolean mo663a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
    }

    /* renamed from: b */
    public final float mo2328b(View view, View view2, C3415i iVar) {
        float f;
        float f2;
        RectF rectF = this.f1441d;
        RectF rectF2 = this.f1442e;
        mo2327a(view, rectF);
        rectF.offset(this.f1444g, this.f1445h);
        mo2327a(view2, rectF2);
        float f3 = 0.0f;
        int i = iVar.f8592a & 112;
        if (i == 16) {
            f2 = rectF2.centerY();
            f = rectF.centerY();
        } else if (i != 48) {
            if (i == 80) {
                f2 = rectF2.bottom;
                f = rectF.bottom;
            }
            return f3 + iVar.f8594c;
        } else {
            f2 = rectF2.top;
            f = rectF.top;
        }
        f3 = f2 - f;
        return f3 + iVar.f8594c;
    }

    /* renamed from: a */
    public final float mo2324a(C0256b bVar, C3414h hVar, float f, float f2) {
        long j = hVar.f8587a;
        long j2 = hVar.f8588b;
        C3414h a = bVar.f1449a.mo9189a("expansion");
        return C3407a.m7806a(f, f2, hVar.mo9193a().getInterpolation(((float) (((a.f8587a + a.f8588b) + 17) - j)) / ((float) j2)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03ec A[LOOP:1: B:113:0x03ea->B:114:0x03ec, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0373  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.AnimatorSet mo2321b(android.view.View r28, android.view.View r29, boolean r30, boolean r31) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            android.content.Context r4 = r29.getContext()
            if (r3 == 0) goto L_0x0011
            int r5 = p213q.p217b.p218a.p271c.C3276a.mtrl_fab_transformation_sheet_expand_spec
            goto L_0x0013
        L_0x0011:
            int r5 = p213q.p217b.p218a.p271c.C3276a.mtrl_fab_transformation_sheet_collapse_spec
        L_0x0013:
            com.google.android.material.transformation.FabTransformationBehavior$b r6 = new com.google.android.material.transformation.FabTransformationBehavior$b
            r6.<init>()
            q.b.a.c.m.g r4 = p213q.p217b.p218a.p271c.p283m.C3413g.m7807a(r4, r5)
            r6.f1449a = r4
            q.b.a.c.m.i r4 = new q.b.a.c.m.i
            r5 = 17
            r7 = 0
            r4.<init>(r5, r7, r7)
            r6.f1450b = r4
            if (r3 == 0) goto L_0x0036
            float r4 = r28.getTranslationX()
            r0.f1444g = r4
            float r4 = r28.getTranslationY()
            r0.f1445h = r4
        L_0x0036:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            float r8 = p124p.p150h.p162l.C1404o.m3547h(r29)
            float r9 = r28.getElevation()
            float r8 = r8 - r9
            r9 = 1
            r10 = 0
            if (r3 == 0) goto L_0x005e
            if (r31 != 0) goto L_0x0053
            float r8 = -r8
            r2.setTranslationZ(r8)
        L_0x0053:
            android.util.Property r8 = android.view.View.TRANSLATION_Z
            float[] r11 = new float[r9]
            r11[r10] = r7
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r2, r8, r11)
            goto L_0x0069
        L_0x005e:
            android.util.Property r11 = android.view.View.TRANSLATION_Z
            float[] r12 = new float[r9]
            float r8 = -r8
            r12[r10] = r8
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r2, r11, r12)
        L_0x0069:
            q.b.a.c.m.g r11 = r6.f1449a
            java.lang.String r12 = "elevation"
            q.b.a.c.m.h r11 = r11.mo9189a(r12)
            r11.mo9194a(r8)
            r4.add(r8)
            android.graphics.RectF r8 = r0.f1441d
            q.b.a.c.m.i r11 = r6.f1450b
            float r11 = r0.mo2323a(r1, r2, r11)
            q.b.a.c.m.i r12 = r6.f1450b
            float r12 = r0.mo2328b(r1, r2, r12)
            android.util.Pair r13 = r0.mo2325a(r11, r12, r3, r6)
            java.lang.Object r14 = r13.first
            q.b.a.c.m.h r14 = (p213q.p217b.p218a.p271c.p283m.C3414h) r14
            java.lang.Object r13 = r13.second
            q.b.a.c.m.h r13 = (p213q.p217b.p218a.p271c.p283m.C3414h) r13
            if (r3 == 0) goto L_0x00db
            if (r31 != 0) goto L_0x009d
            float r15 = -r11
            r2.setTranslationX(r15)
            float r15 = -r12
            r2.setTranslationY(r15)
        L_0x009d:
            android.util.Property r15 = android.view.View.TRANSLATION_X
            r16 = r5
            float[] r5 = new float[r9]
            r5[r10] = r7
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r2, r15, r5)
            android.util.Property r15 = android.view.View.TRANSLATION_Y
            r17 = r5
            float[] r5 = new float[r9]
            r5[r10] = r7
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r2, r15, r5)
            float r11 = -r11
            float r12 = -r12
            float r11 = r0.mo2324a(r6, r14, r11, r7)
            float r12 = r0.mo2324a(r6, r13, r12, r7)
            android.graphics.Rect r15 = r0.f1440c
            r2.getWindowVisibleDisplayFrame(r15)
            android.graphics.RectF r7 = r0.f1441d
            r7.set(r15)
            android.graphics.RectF r15 = r0.f1442e
            r0.mo2327a(r2, r15)
            r15.offset(r11, r12)
            r15.intersect(r7)
            r8.set(r15)
            r7 = r5
            r5 = r17
            goto L_0x00f3
        L_0x00db:
            r16 = r5
            android.util.Property r5 = android.view.View.TRANSLATION_X
            float[] r7 = new float[r9]
            float r11 = -r11
            r7[r10] = r11
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r2, r5, r7)
            android.util.Property r7 = android.view.View.TRANSLATION_Y
            float[] r11 = new float[r9]
            float r12 = -r12
            r11[r10] = r12
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r7, r11)
        L_0x00f3:
            r14.mo9194a(r5)
            r13.mo9194a(r7)
            r4.add(r5)
            r4.add(r7)
            float r5 = r8.width()
            float r7 = r8.height()
            q.b.a.c.m.i r8 = r6.f1450b
            float r8 = r0.mo2323a(r1, r2, r8)
            q.b.a.c.m.i r11 = r6.f1450b
            float r11 = r0.mo2328b(r1, r2, r11)
            android.util.Pair r12 = r0.mo2325a(r8, r11, r3, r6)
            java.lang.Object r13 = r12.first
            q.b.a.c.m.h r13 = (p213q.p217b.p218a.p271c.p283m.C3414h) r13
            java.lang.Object r12 = r12.second
            q.b.a.c.m.h r12 = (p213q.p217b.p218a.p271c.p283m.C3414h) r12
            android.util.Property r14 = android.view.View.TRANSLATION_X
            float[] r15 = new float[r9]
            if (r3 == 0) goto L_0x0126
            goto L_0x0128
        L_0x0126:
            float r8 = r0.f1444g
        L_0x0128:
            r15[r10] = r8
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r1, r14, r15)
            android.util.Property r14 = android.view.View.TRANSLATION_Y
            float[] r15 = new float[r9]
            if (r3 == 0) goto L_0x0135
            goto L_0x0137
        L_0x0135:
            float r11 = r0.f1445h
        L_0x0137:
            r15[r10] = r11
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r1, r14, r15)
            r13.mo9194a(r8)
            r12.mo9194a(r11)
            r4.add(r8)
            r4.add(r11)
            boolean r8 = r2 instanceof p213q.p217b.p218a.p271c.p293w.C3454c
            if (r8 == 0) goto L_0x01a1
            boolean r11 = r1 instanceof android.widget.ImageView
            if (r11 != 0) goto L_0x0152
            goto L_0x01a1
        L_0x0152:
            r11 = r2
            q.b.a.c.w.c r11 = (p213q.p217b.p218a.p271c.p293w.C3454c) r11
            r12 = r1
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            android.graphics.drawable.Drawable r12 = r12.getDrawable()
            if (r12 != 0) goto L_0x015f
            goto L_0x01a1
        L_0x015f:
            r12.mutate()
            r13 = 255(0xff, float:3.57E-43)
            if (r3 == 0) goto L_0x0176
            if (r31 != 0) goto L_0x016b
            r12.setAlpha(r13)
        L_0x016b:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r13 = p213q.p217b.p218a.p271c.p283m.C3410d.f8579b
            int[] r14 = new int[r9]
            r14[r10] = r10
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofInt(r12, r13, r14)
            goto L_0x0180
        L_0x0176:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r14 = p213q.p217b.p218a.p271c.p283m.C3410d.f8579b
            int[] r15 = new int[r9]
            r15[r10] = r13
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofInt(r12, r14, r15)
        L_0x0180:
            q.b.a.c.k0.a r14 = new q.b.a.c.k0.a
            r14.<init>(r0, r2)
            r13.addUpdateListener(r14)
            q.b.a.c.m.g r14 = r6.f1449a
            java.lang.String r15 = "iconFade"
            q.b.a.c.m.h r14 = r14.mo9189a(r15)
            r14.mo9194a(r13)
            r4.add(r13)
            q.b.a.c.k0.b r13 = new q.b.a.c.k0.b
            r13.<init>(r0, r11, r12)
            r11 = r16
            r11.add(r13)
            goto L_0x01a3
        L_0x01a1:
            r11 = r16
        L_0x01a3:
            if (r8 != 0) goto L_0x01ad
            r1 = r4
            r19 = r6
            r18 = r8
            r3 = r11
            goto L_0x0312
        L_0x01ad:
            r12 = r2
            q.b.a.c.w.c r12 = (p213q.p217b.p218a.p271c.p293w.C3454c) r12
            q.b.a.c.m.i r13 = r6.f1450b
            android.graphics.RectF r14 = r0.f1441d
            android.graphics.RectF r15 = r0.f1442e
            r0.mo2327a(r1, r14)
            float r10 = r0.f1444g
            float r9 = r0.f1445h
            r14.offset(r10, r9)
            r0.mo2327a(r2, r15)
            float r9 = r0.mo2323a(r1, r2, r13)
            float r9 = -r9
            r10 = 0
            r15.offset(r9, r10)
            float r9 = r14.centerX()
            float r10 = r15.left
            float r9 = r9 - r10
            q.b.a.c.m.i r10 = r6.f1450b
            android.graphics.RectF r13 = r0.f1441d
            android.graphics.RectF r14 = r0.f1442e
            r0.mo2327a(r1, r13)
            float r15 = r0.f1444g
            r18 = r8
            float r8 = r0.f1445h
            r13.offset(r15, r8)
            r0.mo2327a(r2, r14)
            float r8 = r0.mo2328b(r1, r2, r10)
            float r8 = -r8
            r10 = 0
            r14.offset(r10, r8)
            float r8 = r13.centerY()
            float r10 = r14.top
            float r8 = r8 - r10
            r10 = r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r10 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r10
            android.graphics.Rect r13 = r0.f1440c
            r10.mo2061a(r13)
            android.graphics.Rect r10 = r0.f1440c
            int r10 = r10.width()
            float r10 = (float) r10
            r13 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r13
            q.b.a.c.m.g r13 = r6.f1449a
            java.lang.String r14 = "expansion"
            q.b.a.c.m.h r13 = r13.mo9189a(r14)
            if (r3 == 0) goto L_0x0282
            if (r31 != 0) goto L_0x021e
            q.b.a.c.w.c$e r14 = new q.b.a.c.w.c$e
            r14.<init>(r9, r8, r10)
            r12.setRevealInfo(r14)
        L_0x021e:
            if (r31 == 0) goto L_0x0226
            q.b.a.c.w.c$e r10 = r12.getRevealInfo()
            float r10 = r10.f8813c
        L_0x0226:
            r14 = 0
            float r15 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5142a(r9, r8, r14, r14)
            float r21 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5142a(r9, r8, r5, r14)
            float r5 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5142a(r9, r8, r5, r7)
            float r7 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5142a(r9, r8, r14, r7)
            int r14 = (r15 > r21 ? 1 : (r15 == r21 ? 0 : -1))
            if (r14 <= 0) goto L_0x0244
            int r14 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x0244
            int r14 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x0244
            goto L_0x0256
        L_0x0244:
            int r14 = (r21 > r5 ? 1 : (r21 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x024f
            int r14 = (r21 > r7 ? 1 : (r21 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x024f
            r15 = r21
            goto L_0x0256
        L_0x024f:
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x0255
            r15 = r5
            goto L_0x0256
        L_0x0255:
            r15 = r7
        L_0x0256:
            android.animation.Animator r5 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5172a(r12, r9, r8, r15)
            q.b.a.c.k0.c r7 = new q.b.a.c.k0.c
            r7.<init>(r0, r12)
            r5.addListener(r7)
            long r14 = r13.f8587a
            int r7 = (int) r9
            int r8 = (int) r8
            r0 = 0
            int r9 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x0279
            android.animation.Animator r7 = android.view.ViewAnimationUtils.createCircularReveal(r2, r7, r8, r10, r10)
            r7.setStartDelay(r0)
            r7.setDuration(r14)
            r4.add(r7)
        L_0x0279:
            r1 = r4
            r19 = r6
            r22 = r11
            r23 = r12
            goto L_0x0300
        L_0x0282:
            q.b.a.c.w.c$e r0 = r12.getRevealInfo()
            float r0 = r0.f8813c
            android.animation.Animator r5 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5172a(r12, r9, r8, r10)
            long r14 = r13.f8587a
            int r1 = (int) r9
            int r7 = (int) r8
            r8 = 0
            int r19 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r19 <= 0) goto L_0x02a3
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r2, r1, r7, r0, r0)
            r0.setStartDelay(r8)
            r0.setDuration(r14)
            r4.add(r0)
        L_0x02a3:
            long r14 = r13.f8587a
            long r8 = r13.f8588b
            q.b.a.c.m.g r0 = r6.f1449a
            r21 = r5
            p.e.h<java.lang.String, q.b.a.c.m.h> r5 = r0.f8585a
            int r5 = r5.f3589g
            r19 = r6
            r22 = r11
            r23 = r12
            r6 = 0
            r11 = 0
        L_0x02b8:
            if (r6 >= r5) goto L_0x02e0
            r20 = r5
            p.e.h<java.lang.String, q.b.a.c.m.h> r5 = r0.f8585a
            java.lang.Object r5 = r5.mo5598e(r6)
            q.b.a.c.m.h r5 = (p213q.p217b.p218a.p271c.p283m.C3414h) r5
            r24 = r4
            long r3 = r5.f8587a
            r26 = r0
            r25 = r1
            long r0 = r5.f8588b
            long r3 = r3 + r0
            long r11 = java.lang.Math.max(r11, r3)
            int r6 = r6 + 1
            r3 = r30
            r5 = r20
            r4 = r24
            r1 = r25
            r0 = r26
            goto L_0x02b8
        L_0x02e0:
            r25 = r1
            r24 = r4
            long r14 = r14 + r8
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x02fc
            r0 = r25
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r2, r0, r7, r10, r10)
            r0.setStartDelay(r14)
            long r11 = r11 - r14
            r0.setDuration(r11)
            r1 = r24
            r1.add(r0)
            goto L_0x02fe
        L_0x02fc:
            r1 = r24
        L_0x02fe:
            r5 = r21
        L_0x0300:
            r13.mo9194a(r5)
            r1.add(r5)
            q.b.a.c.w.a r0 = new q.b.a.c.w.a
            r3 = r23
            r0.<init>(r3)
            r3 = r22
            r3.add(r0)
        L_0x0312:
            if (r18 != 0) goto L_0x0319
            r6 = r30
            r4 = r19
            goto L_0x036b
        L_0x0319:
            r0 = r2
            q.b.a.c.w.c r0 = (p213q.p217b.p218a.p271c.p293w.C3454c) r0
            android.content.res.ColorStateList r4 = r28.getBackgroundTintList()
            if (r4 == 0) goto L_0x032f
            int[] r5 = r28.getDrawableState()
            int r6 = r4.getDefaultColor()
            int r4 = r4.getColorForState(r5, r6)
            goto L_0x0330
        L_0x032f:
            r4 = 0
        L_0x0330:
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r4
            r6 = r30
            if (r6 == 0) goto L_0x034a
            if (r31 != 0) goto L_0x033d
            r0.setCircularRevealScrimColor(r4)
        L_0x033d:
            android.util.Property<q.b.a.c.w.c, java.lang.Integer> r4 = p213q.p217b.p218a.p271c.p293w.C3454c.C3458d.f8810a
            r7 = 1
            int[] r8 = new int[r7]
            r9 = 0
            r8[r9] = r5
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r4, r8)
            goto L_0x0356
        L_0x034a:
            r7 = 1
            r9 = 0
            android.util.Property<q.b.a.c.w.c, java.lang.Integer> r5 = p213q.p217b.p218a.p271c.p293w.C3454c.C3458d.f8810a
            int[] r8 = new int[r7]
            r8[r9] = r4
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r5, r8)
        L_0x0356:
            q.b.a.c.m.b r4 = p213q.p217b.p218a.p271c.p283m.C3408b.f8577a
            r0.setEvaluator(r4)
            r4 = r19
            q.b.a.c.m.g r5 = r4.f1449a
            java.lang.String r7 = "color"
            q.b.a.c.m.h r5 = r5.mo9189a(r7)
            r5.mo9194a(r0)
            r1.add(r0)
        L_0x036b:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 != 0) goto L_0x0373
            r10 = 0
            r5 = r27
            goto L_0x03d4
        L_0x0373:
            int r0 = p213q.p217b.p218a.p271c.C3327f.mtrl_child_content_container
            android.view.View r0 = r2.findViewById(r0)
            if (r0 == 0) goto L_0x037e
        L_0x037b:
            r5 = r27
            goto L_0x0394
        L_0x037e:
            boolean r0 = r2 instanceof p213q.p217b.p218a.p271c.p282k0.C3405e
            if (r0 != 0) goto L_0x038b
            boolean r0 = r2 instanceof p213q.p217b.p218a.p271c.p282k0.C3404d
            if (r0 == 0) goto L_0x0387
            goto L_0x038b
        L_0x0387:
            r5 = r27
            r0 = r2
            goto L_0x0394
        L_0x038b:
            r0 = r2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5 = 0
            android.view.View r0 = r0.getChildAt(r5)
            goto L_0x037b
        L_0x0394:
            android.view.ViewGroup r0 = r5.mo2326a(r0)
            if (r0 != 0) goto L_0x039c
            r10 = 0
            goto L_0x03d4
        L_0x039c:
            if (r6 == 0) goto L_0x03b9
            if (r31 != 0) goto L_0x03aa
            android.util.Property<android.view.ViewGroup, java.lang.Float> r7 = p213q.p217b.p218a.p271c.p283m.C3409c.f8578a
            r8 = 0
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r7.set(r0, r8)
        L_0x03aa:
            android.util.Property<android.view.ViewGroup, java.lang.Float> r7 = p213q.p217b.p218a.p271c.p283m.C3409c.f8578a
            r8 = 1
            float[] r8 = new float[r8]
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r8[r10] = r9
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r7, r8)
            goto L_0x03c6
        L_0x03b9:
            r8 = 1
            r10 = 0
            android.util.Property<android.view.ViewGroup, java.lang.Float> r7 = p213q.p217b.p218a.p271c.p283m.C3409c.f8578a
            float[] r8 = new float[r8]
            r9 = 0
            r8[r10] = r9
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r7, r8)
        L_0x03c6:
            q.b.a.c.m.g r4 = r4.f1449a
            java.lang.String r7 = "contentFade"
            q.b.a.c.m.h r4 = r4.mo9189a(r7)
            r4.mo9194a(r0)
            r1.add(r0)
        L_0x03d4:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5227a(r0, r1)
            com.google.android.material.transformation.FabTransformationBehavior$a r1 = new com.google.android.material.transformation.FabTransformationBehavior$a
            r4 = r28
            r1.<init>(r5, r6, r2, r4)
            r0.addListener(r1)
            int r1 = r3.size()
        L_0x03ea:
            if (r10 >= r1) goto L_0x03f8
            java.lang.Object r2 = r3.get(r10)
            android.animation.Animator$AnimatorListener r2 = (android.animation.Animator.AnimatorListener) r2
            r0.addListener(r2)
            int r10 = r10 + 1
            goto L_0x03ea
        L_0x03f8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.mo2321b(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }
}
