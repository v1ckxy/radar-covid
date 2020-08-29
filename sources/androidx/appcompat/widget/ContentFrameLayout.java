package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p124p.p126b.p127k.C1039h;
import p124p.p126b.p127k.C1039h.C1051j;
import p124p.p126b.p127k.C1055k;
import p124p.p126b.p134p.p135i.C1114g;
import p124p.p126b.p136q.C1227z;

public class ContentFrameLayout extends FrameLayout {

    /* renamed from: e */
    public TypedValue f233e;

    /* renamed from: f */
    public TypedValue f234f;

    /* renamed from: g */
    public TypedValue f235g;

    /* renamed from: h */
    public TypedValue f236h;

    /* renamed from: i */
    public TypedValue f237i;

    /* renamed from: j */
    public TypedValue f238j;

    /* renamed from: k */
    public final Rect f239k;

    /* renamed from: l */
    public C0035a f240l;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    public interface C0035a {
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f239k = new Rect();
    }

    /* renamed from: a */
    public void mo284a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f237i == null) {
            this.f237i = new TypedValue();
        }
        return this.f237i;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f238j == null) {
            this.f238j = new TypedValue();
        }
        return this.f238j;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f235g == null) {
            this.f235g = new TypedValue();
        }
        return this.f235g;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f236h == null) {
            this.f236h = new TypedValue();
        }
        return this.f236h;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f233e == null) {
            this.f233e = new TypedValue();
        }
        return this.f233e;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f234f == null) {
            this.f234f = new TypedValue();
        }
        return this.f234f;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0035a aVar = this.f240l;
        if (aVar != null && ((C1055k) aVar) == null) {
            throw null;
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0035a aVar = this.f240l;
        if (aVar != null) {
            C1039h hVar = ((C1055k) aVar).f2780a;
            C1227z zVar = hVar.f2731o;
            if (zVar != null) {
                zVar.mo144h();
            }
            if (hVar.f2736t != null) {
                hVar.f2725i.getDecorView().removeCallbacks(hVar.f2737u);
                if (hVar.f2736t.isShowing()) {
                    try {
                        hVar.f2736t.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                hVar.f2736t = null;
            }
            hVar.mo4480e();
            C1051j d = hVar.mo4478d(0);
            if (d != null) {
                C1114g gVar = d.f2767j;
                if (gVar != null) {
                    gVar.mo4808a(true);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            android.content.Context r0 = r13.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.widthPixels
            int r2 = r0.heightPixels
            r3 = 1
            r4 = 0
            if (r1 >= r2) goto L_0x0016
            r1 = r3
            goto L_0x0017
        L_0x0016:
            r1 = r4
        L_0x0017:
            int r2 = android.view.View.MeasureSpec.getMode(r14)
            int r5 = android.view.View.MeasureSpec.getMode(r15)
            r6 = 6
            r7 = 5
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 1073741824(0x40000000, float:2.0)
            if (r2 != r8) goto L_0x0060
            if (r1 == 0) goto L_0x002c
            android.util.TypedValue r10 = r13.f236h
            goto L_0x002e
        L_0x002c:
            android.util.TypedValue r10 = r13.f235g
        L_0x002e:
            if (r10 == 0) goto L_0x0060
            int r11 = r10.type
            if (r11 == 0) goto L_0x0060
            if (r11 != r7) goto L_0x003c
            float r10 = r10.getDimension(r0)
        L_0x003a:
            int r10 = (int) r10
            goto L_0x0048
        L_0x003c:
            if (r11 != r6) goto L_0x0047
            int r11 = r0.widthPixels
            float r12 = (float) r11
            float r11 = (float) r11
            float r10 = r10.getFraction(r12, r11)
            goto L_0x003a
        L_0x0047:
            r10 = r4
        L_0x0048:
            if (r10 <= 0) goto L_0x0060
            android.graphics.Rect r11 = r13.f239k
            int r12 = r11.left
            int r11 = r11.right
            int r12 = r12 + r11
            int r10 = r10 - r12
            int r14 = android.view.View.MeasureSpec.getSize(r14)
            int r14 = java.lang.Math.min(r10, r14)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r9)
            r10 = r3
            goto L_0x0061
        L_0x0060:
            r10 = r4
        L_0x0061:
            if (r5 != r8) goto L_0x009a
            if (r1 == 0) goto L_0x0068
            android.util.TypedValue r5 = r13.f237i
            goto L_0x006a
        L_0x0068:
            android.util.TypedValue r5 = r13.f238j
        L_0x006a:
            if (r5 == 0) goto L_0x009a
            int r11 = r5.type
            if (r11 == 0) goto L_0x009a
            if (r11 != r7) goto L_0x0078
            float r5 = r5.getDimension(r0)
        L_0x0076:
            int r5 = (int) r5
            goto L_0x0084
        L_0x0078:
            if (r11 != r6) goto L_0x0083
            int r11 = r0.heightPixels
            float r12 = (float) r11
            float r11 = (float) r11
            float r5 = r5.getFraction(r12, r11)
            goto L_0x0076
        L_0x0083:
            r5 = r4
        L_0x0084:
            if (r5 <= 0) goto L_0x009a
            android.graphics.Rect r11 = r13.f239k
            int r12 = r11.top
            int r11 = r11.bottom
            int r12 = r12 + r11
            int r5 = r5 - r12
            int r15 = android.view.View.MeasureSpec.getSize(r15)
            int r15 = java.lang.Math.min(r5, r15)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r9)
        L_0x009a:
            super.onMeasure(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r9)
            if (r10 != 0) goto L_0x00db
            if (r2 != r8) goto L_0x00db
            if (r1 == 0) goto L_0x00ae
            android.util.TypedValue r1 = r13.f234f
            goto L_0x00b0
        L_0x00ae:
            android.util.TypedValue r1 = r13.f233e
        L_0x00b0:
            if (r1 == 0) goto L_0x00db
            int r2 = r1.type
            if (r2 == 0) goto L_0x00db
            if (r2 != r7) goto L_0x00be
            float r0 = r1.getDimension(r0)
        L_0x00bc:
            int r0 = (int) r0
            goto L_0x00ca
        L_0x00be:
            if (r2 != r6) goto L_0x00c9
            int r0 = r0.widthPixels
            float r2 = (float) r0
            float r0 = (float) r0
            float r0 = r1.getFraction(r2, r0)
            goto L_0x00bc
        L_0x00c9:
            r0 = r4
        L_0x00ca:
            if (r0 <= 0) goto L_0x00d4
            android.graphics.Rect r1 = r13.f239k
            int r2 = r1.left
            int r1 = r1.right
            int r2 = r2 + r1
            int r0 = r0 - r2
        L_0x00d4:
            if (r14 >= r0) goto L_0x00db
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
            goto L_0x00dc
        L_0x00db:
            r3 = r4
        L_0x00dc:
            if (r3 == 0) goto L_0x00e1
            super.onMeasure(r5, r15)
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(C0035a aVar) {
        this.f240l = aVar;
    }
}
