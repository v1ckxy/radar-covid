package p124p.p144f.p145a;

import java.util.Arrays;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p144f.p145a.C1270g.C1271a;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.f.a.a */
public class C1263a {

    /* renamed from: a */
    public int f3595a = 0;

    /* renamed from: b */
    public final C1264b f3596b;

    /* renamed from: c */
    public final C1265c f3597c;

    /* renamed from: d */
    public int f3598d = 8;

    /* renamed from: e */
    public C1270g f3599e = null;

    /* renamed from: f */
    public int[] f3600f = new int[8];

    /* renamed from: g */
    public int[] f3601g = new int[8];

    /* renamed from: h */
    public float[] f3602h = new float[8];

    /* renamed from: i */
    public int f3603i = -1;

    /* renamed from: j */
    public int f3604j = -1;

    /* renamed from: k */
    public boolean f3605k = false;

    public C1263a(C1264b bVar, C1265c cVar) {
        this.f3596b = bVar;
        this.f3597c = cVar;
    }

    /* renamed from: a */
    public final float mo5623a(C1270g gVar) {
        int i = this.f3603i;
        int i2 = 0;
        while (i != -1 && i2 < this.f3595a) {
            if (this.f3600f[i] == gVar.f3634b) {
                return this.f3602h[i];
            }
            i = this.f3601g[i];
            i2++;
        }
        return 0.0f;
    }

    /* renamed from: a */
    public final float mo5624a(C1270g gVar, boolean z) {
        if (this.f3599e == gVar) {
            this.f3599e = null;
        }
        int i = this.f3603i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f3595a) {
            if (this.f3600f[i] == gVar.f3634b) {
                if (i == this.f3603i) {
                    this.f3603i = this.f3601g[i];
                } else {
                    int[] iArr = this.f3601g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    gVar.mo5666b(this.f3596b);
                }
                gVar.f3642j--;
                this.f3595a--;
                this.f3600f[i] = -1;
                if (this.f3605k) {
                    this.f3604j = i;
                }
                return this.f3602h[i];
            }
            i2++;
            i3 = i;
            i = this.f3601g[i];
        }
        return 0.0f;
    }

    /* renamed from: a */
    public final C1270g mo5625a(int i) {
        int i2 = this.f3603i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f3595a) {
            if (i3 == i) {
                return this.f3597c.f3613c[this.f3600f[i2]];
            }
            i2 = this.f3601g[i2];
            i3++;
        }
        return null;
    }

    /* renamed from: a */
    public C1270g mo5626a(boolean[] zArr, C1270g gVar) {
        int i = this.f3603i;
        int i2 = 0;
        C1270g gVar2 = null;
        float f = 0.0f;
        while (i != -1 && i2 < this.f3595a) {
            if (this.f3602h[i] < 0.0f) {
                C1270g gVar3 = this.f3597c.f3613c[this.f3600f[i]];
                if ((zArr == null || !zArr[gVar3.f3634b]) && gVar3 != gVar) {
                    C1271a aVar = gVar3.f3639g;
                    if (aVar == C1271a.SLACK || aVar == C1271a.ERROR) {
                        float f2 = this.f3602h[i];
                        if (f2 < f) {
                            gVar2 = gVar3;
                            f = f2;
                        }
                    }
                }
            }
            i = this.f3601g[i];
            i2++;
        }
        return gVar2;
    }

    /* renamed from: a */
    public final void mo5627a() {
        int i = this.f3603i;
        int i2 = 0;
        while (i != -1 && i2 < this.f3595a) {
            C1270g gVar = this.f3597c.f3613c[this.f3600f[i]];
            if (gVar != null) {
                gVar.mo5666b(this.f3596b);
            }
            i = this.f3601g[i];
            i2++;
        }
        this.f3603i = -1;
        this.f3604j = -1;
        this.f3605k = false;
        this.f3595a = 0;
    }

    /* renamed from: a */
    public final void mo5628a(C1270g gVar, float f) {
        if (f == 0.0f) {
            mo5624a(gVar, true);
            return;
        }
        int i = this.f3603i;
        if (i == -1) {
            this.f3603i = 0;
            this.f3602h[0] = f;
            this.f3600f[0] = gVar.f3634b;
            this.f3601g[0] = -1;
            gVar.f3642j++;
            gVar.mo5665a(this.f3596b);
            this.f3595a++;
            if (!this.f3605k) {
                int i2 = this.f3604j + 1;
                this.f3604j = i2;
                int[] iArr = this.f3600f;
                if (i2 >= iArr.length) {
                    this.f3605k = true;
                    this.f3604j = iArr.length - 1;
                }
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f3595a) {
            int[] iArr2 = this.f3600f;
            int i5 = iArr2[i];
            int i6 = gVar.f3634b;
            if (i5 == i6) {
                this.f3602h[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i4 = i;
            }
            i = this.f3601g[i];
            i3++;
        }
        int i7 = this.f3604j;
        int i8 = i7 + 1;
        if (this.f3605k) {
            int[] iArr3 = this.f3600f;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f3600f;
        if (i7 >= iArr4.length && this.f3595a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f3600f;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f3600f;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f3598d * 2;
            this.f3598d = i10;
            this.f3605k = false;
            this.f3604j = i7 - 1;
            this.f3602h = Arrays.copyOf(this.f3602h, i10);
            this.f3600f = Arrays.copyOf(this.f3600f, this.f3598d);
            this.f3601g = Arrays.copyOf(this.f3601g, this.f3598d);
        }
        this.f3600f[i7] = gVar.f3634b;
        this.f3602h[i7] = f;
        int[] iArr7 = this.f3601g;
        if (i4 != -1) {
            iArr7[i7] = iArr7[i4];
            iArr7[i4] = i7;
        } else {
            iArr7[i7] = this.f3603i;
            this.f3603i = i7;
        }
        gVar.f3642j++;
        gVar.mo5665a(this.f3596b);
        this.f3595a++;
        if (!this.f3605k) {
            this.f3604j++;
        }
        if (this.f3595a >= this.f3600f.length) {
            this.f3605k = true;
        }
        int i11 = this.f3604j;
        int[] iArr8 = this.f3600f;
        if (i11 >= iArr8.length) {
            this.f3605k = true;
            this.f3604j = iArr8.length - 1;
        }
    }

    /* renamed from: a */
    public final void mo5629a(C1270g gVar, float f, boolean z) {
        if (f != 0.0f) {
            int i = this.f3603i;
            if (i == -1) {
                this.f3603i = 0;
                this.f3602h[0] = f;
                this.f3600f[0] = gVar.f3634b;
                this.f3601g[0] = -1;
                gVar.f3642j++;
                gVar.mo5665a(this.f3596b);
                this.f3595a++;
                if (!this.f3605k) {
                    int i2 = this.f3604j + 1;
                    this.f3604j = i2;
                    int[] iArr = this.f3600f;
                    if (i2 >= iArr.length) {
                        this.f3605k = true;
                        this.f3604j = iArr.length - 1;
                    }
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f3595a) {
                int[] iArr2 = this.f3600f;
                int i5 = iArr2[i];
                int i6 = gVar.f3634b;
                if (i5 == i6) {
                    float[] fArr = this.f3602h;
                    fArr[i] = fArr[i] + f;
                    if (fArr[i] == 0.0f) {
                        if (i == this.f3603i) {
                            this.f3603i = this.f3601g[i];
                        } else {
                            int[] iArr3 = this.f3601g;
                            iArr3[i4] = iArr3[i];
                        }
                        if (z) {
                            gVar.mo5666b(this.f3596b);
                        }
                        if (this.f3605k) {
                            this.f3604j = i;
                        }
                        gVar.f3642j--;
                        this.f3595a--;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i4 = i;
                }
                i = this.f3601g[i];
                i3++;
            }
            int i7 = this.f3604j;
            int i8 = i7 + 1;
            if (this.f3605k) {
                int[] iArr4 = this.f3600f;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.f3600f;
            if (i7 >= iArr5.length && this.f3595a < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f3600f;
                    if (i9 >= iArr6.length) {
                        break;
                    } else if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr7 = this.f3600f;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.f3598d * 2;
                this.f3598d = i10;
                this.f3605k = false;
                this.f3604j = i7 - 1;
                this.f3602h = Arrays.copyOf(this.f3602h, i10);
                this.f3600f = Arrays.copyOf(this.f3600f, this.f3598d);
                this.f3601g = Arrays.copyOf(this.f3601g, this.f3598d);
            }
            this.f3600f[i7] = gVar.f3634b;
            this.f3602h[i7] = f;
            int[] iArr8 = this.f3601g;
            if (i4 != -1) {
                iArr8[i7] = iArr8[i4];
                iArr8[i4] = i7;
            } else {
                iArr8[i7] = this.f3603i;
                this.f3603i = i7;
            }
            gVar.f3642j++;
            gVar.mo5665a(this.f3596b);
            this.f3595a++;
            if (!this.f3605k) {
                this.f3604j++;
            }
            int i11 = this.f3604j;
            int[] iArr9 = this.f3600f;
            if (i11 >= iArr9.length) {
                this.f3605k = true;
                this.f3604j = iArr9.length - 1;
            }
        }
    }

    /* renamed from: b */
    public final float mo5630b(int i) {
        int i2 = this.f3603i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f3595a) {
            if (i3 == i) {
                return this.f3602h[i2];
            }
            i2 = this.f3601g[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final boolean mo5631b(C1270g gVar) {
        return gVar.f3642j <= 1;
    }

    public String toString() {
        int i = this.f3603i;
        String str = Objects.EMPTY_STRING;
        int i2 = 0;
        while (i != -1 && i2 < this.f3595a) {
            StringBuilder a = C1965a.m4756a(C1965a.m4751a(str, " -> "));
            a.append(this.f3602h[i]);
            a.append(" : ");
            StringBuilder a2 = C1965a.m4756a(a.toString());
            a2.append(this.f3597c.f3613c[this.f3600f[i]]);
            str = a2.toString();
            i = this.f3601g[i];
            i2++;
        }
        return str;
    }
}
