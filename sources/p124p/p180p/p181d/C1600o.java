package p124p.p180p.p181d;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView.C0137z;

/* renamed from: p.p.d.o */
public class C1600o extends C0137z {

    /* renamed from: i */
    public final LinearInterpolator f4718i = new LinearInterpolator();

    /* renamed from: j */
    public final DecelerateInterpolator f4719j = new DecelerateInterpolator();

    /* renamed from: k */
    public PointF f4720k;

    /* renamed from: l */
    public final DisplayMetrics f4721l;

    /* renamed from: m */
    public boolean f4722m = false;

    /* renamed from: n */
    public float f4723n;

    /* renamed from: o */
    public int f4724o = 0;

    /* renamed from: p */
    public int f4725p = 0;

    public C1600o(Context context) {
        this.f4721l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: a */
    public float mo6343a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* renamed from: a */
    public int mo6344a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1280a(android.view.View r11, androidx.recyclerview.widget.RecyclerView.C0099a0 r12, androidx.recyclerview.widget.RecyclerView.C0137z.C0138a r13) {
        /*
            r10 = this;
            android.graphics.PointF r12 = r10.f4720k
            r0 = 1
            r1 = -1
            r2 = 0
            r3 = 0
            if (r12 == 0) goto L_0x0015
            float r12 = r12.x
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x000f
            goto L_0x0015
        L_0x000f:
            if (r12 <= 0) goto L_0x0013
            r9 = r0
            goto L_0x0016
        L_0x0013:
            r9 = r1
            goto L_0x0016
        L_0x0015:
            r9 = r3
        L_0x0016:
            androidx.recyclerview.widget.RecyclerView$o r12 = r10.f840c
            if (r12 == 0) goto L_0x0047
            boolean r4 = r12.mo901a()
            if (r4 != 0) goto L_0x0021
            goto L_0x0047
        L_0x0021:
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$p r4 = (androidx.recyclerview.widget.RecyclerView.C0125p) r4
            int r5 = r12.mo1223d(r11)
            int r6 = r4.leftMargin
            int r5 = r5 - r6
            int r6 = r12.mo1232g(r11)
            int r4 = r4.rightMargin
            int r6 = r6 + r4
            int r7 = r12.mo1239k()
            int r4 = r12.f810q
            int r12 = r12.mo1240l()
            int r8 = r4 - r12
            r4 = r10
            int r12 = r4.mo6344a(r5, r6, r7, r8, r9)
            goto L_0x0048
        L_0x0047:
            r12 = r3
        L_0x0048:
            android.graphics.PointF r4 = r10.f4720k
            if (r4 == 0) goto L_0x0059
            float r4 = r4.y
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0053
            goto L_0x0059
        L_0x0053:
            if (r2 <= 0) goto L_0x0057
            r9 = r0
            goto L_0x005a
        L_0x0057:
            r9 = r1
            goto L_0x005a
        L_0x0059:
            r9 = r3
        L_0x005a:
            androidx.recyclerview.widget.RecyclerView$o r0 = r10.f840c
            if (r0 == 0) goto L_0x008c
            boolean r1 = r0.mo905b()
            if (r1 != 0) goto L_0x0065
            goto L_0x008c
        L_0x0065:
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C0125p) r1
            int r2 = r0.mo1235h(r11)
            int r3 = r1.topMargin
            int r5 = r2 - r3
            int r11 = r0.mo1218c(r11)
            int r1 = r1.bottomMargin
            int r6 = r11 + r1
            int r7 = r0.mo1241m()
            int r11 = r0.f811r
            int r0 = r0.mo1238j()
            int r8 = r11 - r0
            r4 = r10
            int r3 = r4.mo6344a(r5, r6, r7, r8, r9)
        L_0x008c:
            int r11 = r12 * r12
            int r0 = r3 * r3
            int r0 = r0 + r11
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            int r11 = (int) r0
            int r11 = r10.mo6345b(r11)
            if (r11 <= 0) goto L_0x00a4
            int r12 = -r12
            int r0 = -r3
            android.view.animation.DecelerateInterpolator r1 = r10.f4719j
            r13.mo1281a(r12, r0, r11, r1)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p180p.p181d.C1600o.mo1280a(android.view.View, androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.RecyclerView$z$a):void");
    }

    /* renamed from: b */
    public int mo6345b(int i) {
        return (int) Math.ceil(((double) mo6346c(i)) / 0.3356d);
    }

    /* renamed from: c */
    public int mo6346c(int i) {
        float abs = (float) Math.abs(i);
        if (!this.f4722m) {
            this.f4723n = mo6343a(this.f4721l);
            this.f4722m = true;
        }
        return (int) Math.ceil((double) (abs * this.f4723n));
    }
}
