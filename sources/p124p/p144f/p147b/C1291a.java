package p124p.p144f.p147b;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p124p.p144f.p145a.p146h.C1272a;

/* renamed from: p.f.b.a */
public class C1291a extends C1292b {

    /* renamed from: k */
    public int f3828k;

    /* renamed from: l */
    public int f3829l;

    /* renamed from: m */
    public C1272a f3830m;

    public C1291a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: a */
    public void mo5736a(AttributeSet attributeSet) {
        super.mo5736a(attributeSet);
        this.f3830m = new C1272a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1300h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1300h.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C1300h.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f3830m.f3651o0 = obtainStyledAttributes.getBoolean(index, true);
                }
            }
        }
        this.f3834h = this.f3830m;
        mo5740a();
    }

    public int getType() {
        return this.f3828k;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f3830m.f3651o0 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r5 == 6) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r5 == 6) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setType(int r5) {
        /*
            r4 = this;
            r4.f3828k = r5
            r4.f3829l = r5
            android.content.res.Resources r5 = r4.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.getLayoutDirection()
            r0 = 0
            r1 = 1
            if (r1 != r5) goto L_0x0016
            r5 = r1
            goto L_0x0017
        L_0x0016:
            r5 = r0
        L_0x0017:
            r2 = 6
            r3 = 5
            if (r5 == 0) goto L_0x0025
            int r5 = r4.f3828k
            if (r5 != r3) goto L_0x0022
        L_0x001f:
            r4.f3829l = r1
            goto L_0x002f
        L_0x0022:
            if (r5 != r2) goto L_0x002f
            goto L_0x0029
        L_0x0025:
            int r5 = r4.f3828k
            if (r5 != r3) goto L_0x002c
        L_0x0029:
            r4.f3829l = r0
            goto L_0x002f
        L_0x002c:
            if (r5 != r2) goto L_0x002f
            goto L_0x001f
        L_0x002f:
            p.f.a.h.a r5 = r4.f3830m
            int r0 = r4.f3829l
            r5.f3649m0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p144f.p147b.C1291a.setType(int):void");
    }
}
