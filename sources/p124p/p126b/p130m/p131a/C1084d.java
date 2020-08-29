package p124p.p126b.p130m.p131a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import p124p.p126b.p130m.p131a.C1079b.C1082c;

@SuppressLint({"RestrictedAPI"})
/* renamed from: p.b.m.a.d */
public class C1084d extends C1079b {

    /* renamed from: q */
    public C1085a f2913q;

    /* renamed from: r */
    public boolean f2914r;

    /* renamed from: p.b.m.a.d$a */
    public static class C1085a extends C1082c {

        /* renamed from: J */
        public int[][] f2915J;

        public C1085a(C1085a aVar, C1084d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.f2915J = aVar.f2915J;
            } else {
                this.f2915J = new int[this.f2892g.length][];
            }
        }

        /* renamed from: a */
        public int mo4649a(int[] iArr) {
            int[][] iArr2 = this.f2915J;
            int i = this.f2893h;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: d */
        public void mo4566d() {
            int[][] iArr = this.f2915J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f2915J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f2915J = iArr2;
        }

        public Drawable newDrawable() {
            return new C1084d(this, null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C1084d(this, resources);
        }
    }

    public C1084d(C1085a aVar) {
        if (aVar != null) {
            mo4555a(aVar);
        }
    }

    public C1084d(C1085a aVar, Resources resources) {
        mo4555a(new C1085a(aVar, this, resources));
        onStateChange(getState());
    }

    /* renamed from: a */
    public C1085a m2638a() {
        return new C1085a(this.f2913q, this, null);
    }

    /* renamed from: a */
    public void mo4555a(C1082c cVar) {
        super.mo4555a(cVar);
        if (cVar instanceof C1085a) {
            this.f2913q = (C1085a) cVar;
        }
    }

    public void applyTheme(Theme theme) {
        C1082c cVar = this.f2863e;
        if (cVar != null) {
            if (theme != null) {
                cVar.mo4613c();
                int i = cVar.f2893h;
                Drawable[] drawableArr = cVar.f2892g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        cVar.f2890e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                cVar.mo4610a(theme.getResources());
            }
            onStateChange(getState());
            return;
        }
        throw null;
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.f2914r) {
            super.mutate();
            if (this == this) {
                this.f2913q.mo4566d();
                this.f2914r = true;
            }
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStateChange(int[] r4) {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.f2866h
            r1 = 0
            if (r0 == 0) goto L_0x000a
        L_0x0005:
            boolean r0 = r0.setState(r4)
            goto L_0x0010
        L_0x000a:
            android.graphics.drawable.Drawable r0 = r3.f2865g
            if (r0 == 0) goto L_0x000f
            goto L_0x0005
        L_0x000f:
            r0 = r1
        L_0x0010:
            p.b.m.a.d$a r2 = r3.f2913q
            int r4 = r2.mo4649a(r4)
            if (r4 >= 0) goto L_0x0020
            p.b.m.a.d$a r4 = r3.f2913q
            int[] r2 = android.util.StateSet.WILD_CARD
            int r4 = r4.mo4649a(r2)
        L_0x0020:
            boolean r4 = r3.mo4574a(r4)
            if (r4 != 0) goto L_0x0028
            if (r0 == 0) goto L_0x0029
        L_0x0028:
            r1 = 1
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p130m.p131a.C1084d.onStateChange(int[]):boolean");
    }
}
