package p124p.p144f.p145a;

import java.util.Arrays;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.f.a.g */
public class C1270g {

    /* renamed from: k */
    public static int f3632k = 1;

    /* renamed from: a */
    public String f3633a;

    /* renamed from: b */
    public int f3634b = -1;

    /* renamed from: c */
    public int f3635c = -1;

    /* renamed from: d */
    public int f3636d = 0;

    /* renamed from: e */
    public float f3637e;

    /* renamed from: f */
    public float[] f3638f = new float[7];

    /* renamed from: g */
    public C1271a f3639g;

    /* renamed from: h */
    public C1264b[] f3640h = new C1264b[8];

    /* renamed from: i */
    public int f3641i = 0;

    /* renamed from: j */
    public int f3642j = 0;

    /* renamed from: p.f.a.g$a */
    public enum C1271a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C1270g(C1271a aVar) {
        this.f3639g = aVar;
    }

    /* renamed from: a */
    public void mo5664a() {
        this.f3633a = null;
        this.f3639g = C1271a.UNKNOWN;
        this.f3636d = 0;
        this.f3634b = -1;
        this.f3635c = -1;
        this.f3637e = 0.0f;
        this.f3641i = 0;
        this.f3642j = 0;
    }

    /* renamed from: a */
    public final void mo5665a(C1264b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f3641i;
            if (i >= i2) {
                C1264b[] bVarArr = this.f3640h;
                if (i2 >= bVarArr.length) {
                    this.f3640h = (C1264b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C1264b[] bVarArr2 = this.f3640h;
                int i3 = this.f3641i;
                bVarArr2[i3] = bVar;
                this.f3641i = i3 + 1;
                return;
            } else if (this.f3640h[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo5666b(C1264b bVar) {
        int i = this.f3641i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f3640h[i2] == bVar) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    C1264b[] bVarArr = this.f3640h;
                    int i4 = i2 + i3;
                    bVarArr[i4] = bVarArr[i4 + 1];
                }
                this.f3641i--;
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo5667c(C1264b bVar) {
        int i = this.f3641i;
        for (int i2 = 0; i2 < i; i2++) {
            C1264b[] bVarArr = this.f3640h;
            C1263a aVar = bVarArr[i2].f3609d;
            C1264b bVar2 = bVarArr[i2];
            while (true) {
                int i3 = aVar.f3603i;
                int i4 = 0;
                while (i3 != -1 && i4 < aVar.f3595a) {
                    int i5 = aVar.f3600f[i3];
                    C1270g gVar = bVar.f3606a;
                    if (i5 == gVar.f3634b) {
                        float f = aVar.f3602h[i3];
                        aVar.mo5624a(gVar, false);
                        C1263a aVar2 = bVar.f3609d;
                        int i6 = aVar2.f3603i;
                        int i7 = 0;
                        while (i6 != -1 && i7 < aVar2.f3595a) {
                            aVar.mo5629a(aVar.f3597c.f3613c[aVar2.f3600f[i6]], aVar2.f3602h[i6] * f, false);
                            i6 = aVar2.f3601g[i6];
                            i7++;
                        }
                        bVar2.f3607b = (bVar.f3607b * f) + bVar2.f3607b;
                    } else {
                        i3 = aVar.f3601g[i3];
                        i4++;
                    }
                }
            }
        }
        this.f3641i = 0;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a(Objects.EMPTY_STRING);
        a.append(this.f3633a);
        return a.toString();
    }
}
