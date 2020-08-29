package p124p.p144f.p147b;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout.C0064a;
import p124p.p144f.p147b.C1293c.C1294a;

/* renamed from: p.f.b.d */
public class C1295d extends ViewGroup {

    /* renamed from: e */
    public C1293c f3914e;

    /* renamed from: p.f.b.d$a */
    public static class C1296a extends C0064a {

        /* renamed from: m0 */
        public float f3915m0;

        /* renamed from: n0 */
        public boolean f3916n0;

        /* renamed from: o0 */
        public float f3917o0;

        /* renamed from: p0 */
        public float f3918p0;

        /* renamed from: q0 */
        public float f3919q0;

        /* renamed from: r0 */
        public float f3920r0;

        /* renamed from: s0 */
        public float f3921s0;

        /* renamed from: t0 */
        public float f3922t0;

        /* renamed from: u0 */
        public float f3923u0;

        /* renamed from: v0 */
        public float f3924v0;

        /* renamed from: w0 */
        public float f3925w0;

        /* renamed from: x0 */
        public float f3926x0;

        /* renamed from: y0 */
        public float f3927y0;

        public C1296a(int i, int i2) {
            super(i, i2);
            this.f3915m0 = 1.0f;
            this.f3916n0 = false;
            this.f3917o0 = 0.0f;
            this.f3918p0 = 0.0f;
            this.f3919q0 = 0.0f;
            this.f3920r0 = 0.0f;
            this.f3921s0 = 1.0f;
            this.f3922t0 = 1.0f;
            this.f3923u0 = 0.0f;
            this.f3924v0 = 0.0f;
            this.f3925w0 = 0.0f;
            this.f3926x0 = 0.0f;
            this.f3927y0 = 0.0f;
        }

        public C1296a(Context context, AttributeSet attributeSet) {
            float f;
            super(context, attributeSet);
            this.f3915m0 = 1.0f;
            this.f3916n0 = false;
            this.f3917o0 = 0.0f;
            this.f3918p0 = 0.0f;
            this.f3919q0 = 0.0f;
            this.f3920r0 = 0.0f;
            this.f3921s0 = 1.0f;
            this.f3922t0 = 1.0f;
            this.f3923u0 = 0.0f;
            this.f3924v0 = 0.0f;
            this.f3925w0 = 0.0f;
            this.f3926x0 = 0.0f;
            this.f3927y0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1300h.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1300h.ConstraintSet_android_alpha) {
                    this.f3915m0 = obtainStyledAttributes.getFloat(index, this.f3915m0);
                } else if (index == C1300h.ConstraintSet_android_elevation) {
                    this.f3917o0 = obtainStyledAttributes.getFloat(index, this.f3917o0);
                    this.f3916n0 = true;
                } else if (index == C1300h.ConstraintSet_android_rotationX) {
                    this.f3919q0 = obtainStyledAttributes.getFloat(index, this.f3919q0);
                } else if (index == C1300h.ConstraintSet_android_rotationY) {
                    this.f3920r0 = obtainStyledAttributes.getFloat(index, this.f3920r0);
                } else if (index == C1300h.ConstraintSet_android_rotation) {
                    this.f3918p0 = obtainStyledAttributes.getFloat(index, this.f3918p0);
                } else if (index == C1300h.ConstraintSet_android_scaleX) {
                    this.f3921s0 = obtainStyledAttributes.getFloat(index, this.f3921s0);
                } else if (index == C1300h.ConstraintSet_android_scaleY) {
                    this.f3922t0 = obtainStyledAttributes.getFloat(index, this.f3922t0);
                } else if (index == C1300h.ConstraintSet_android_transformPivotX) {
                    this.f3923u0 = obtainStyledAttributes.getFloat(index, this.f3923u0);
                } else if (index == C1300h.ConstraintSet_android_transformPivotY) {
                    this.f3924v0 = obtainStyledAttributes.getFloat(index, this.f3924v0);
                } else {
                    if (index == C1300h.ConstraintSet_android_translationX) {
                        f = this.f3925w0;
                    } else if (index == C1300h.ConstraintSet_android_translationY) {
                        this.f3926x0 = obtainStyledAttributes.getFloat(index, this.f3926x0);
                    } else if (index == C1300h.ConstraintSet_android_translationZ) {
                        f = this.f3927y0;
                    }
                    this.f3925w0 = obtainStyledAttributes.getFloat(index, f);
                }
            }
        }
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new C1296a(-2, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1296a(getContext(), attributeSet);
    }

    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0064a(layoutParams);
    }

    public C1293c getConstraintSet() {
        if (this.f3914e == null) {
            this.f3914e = new C1293c();
        }
        C1293c cVar = this.f3914e;
        if (cVar != null) {
            int childCount = getChildCount();
            cVar.f3839a.clear();
            int i = 0;
            while (i < childCount) {
                View childAt = getChildAt(i);
                C1296a aVar = (C1296a) childAt.getLayoutParams();
                int id = childAt.getId();
                if (id != -1) {
                    if (!cVar.f3839a.containsKey(Integer.valueOf(id))) {
                        cVar.f3839a.put(Integer.valueOf(id), new C1294a());
                    }
                    C1294a aVar2 = (C1294a) cVar.f3839a.get(Integer.valueOf(id));
                    if (childAt instanceof C1292b) {
                        C1292b bVar = (C1292b) childAt;
                        aVar2.mo5751a(id, aVar);
                        if (bVar instanceof C1291a) {
                            aVar2.f3905t0 = 1;
                            C1291a aVar3 = (C1291a) bVar;
                            aVar2.f3903s0 = aVar3.getType();
                            aVar2.f3907u0 = aVar3.getReferencedIds();
                        }
                    }
                    aVar2.mo5751a(id, aVar);
                    i++;
                } else {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
            }
            return this.f3914e;
        }
        throw null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
