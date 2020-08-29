package p425x.p426a.p445e.p447b.p449b;

import p119o.p120a.C0967p0;
import p425x.p426a.p445e.p467d.p468a.C5155a;
import p425x.p426a.p445e.p467d.p468a.C5156b;
import p425x.p426a.p445e.p467d.p468a.C5158d;
import p425x.p426a.p445e.p467d.p468a.C5159e;

/* renamed from: x.a.e.b.b.e */
public class C5059e extends C5058d {

    /* renamed from: a */
    public int f12112a;

    /* renamed from: b */
    public int f12113b;

    /* renamed from: c */
    public C5156b f12114c;

    /* renamed from: d */
    public C5159e f12115d;

    /* renamed from: e */
    public C5155a f12116e;

    /* renamed from: f */
    public C5158d f12117f;

    /* renamed from: g */
    public C5158d f12118g;

    public C5059e(int i, int i2, C5156b bVar, C5159e eVar, C5158d dVar, C5158d dVar2, C5155a aVar) {
        int i3;
        int[] iArr;
        int i4;
        C5156b bVar2 = bVar;
        C5159e eVar2 = eVar;
        int i5 = 1;
        super(true);
        this.f12113b = i2;
        this.f12112a = i;
        this.f12114c = bVar2;
        this.f12115d = eVar2;
        this.f12116e = aVar;
        this.f12117f = dVar;
        this.f12118g = dVar2;
        C0967p0.m2193a(bVar, eVar);
        int b = eVar.mo11917b();
        C5159e[] eVarArr = new C5159e[b];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i3 = b >> 1;
            if (i7 >= i3) {
                break;
            }
            int i8 = i7 << 1;
            int[] iArr2 = new int[(i8 + 1)];
            iArr2[i8] = 1;
            eVarArr[i7] = new C5159e(bVar2, iArr2);
            i7++;
        }
        while (i3 < b) {
            int i9 = i3 << 1;
            int[] iArr3 = new int[(i9 + 1)];
            iArr3[i9] = i5;
            C5159e eVar3 = new C5159e(bVar2, iArr3);
            int[] iArr4 = eVar3.f12347c;
            int[] iArr5 = eVar2.f12347c;
            int a = C5159e.m11590a(iArr5);
            int i10 = -1;
            if (a != -1) {
                int length = iArr4.length;
                int[] iArr6 = new int[length];
                int a2 = C5159e.m11590a(iArr5);
                int a3 = eVar3.f12345a.mo11902a(a2 == -1 ? i6 : iArr5[a2]);
                System.arraycopy(iArr4, i6, iArr6, i6, length);
                while (a <= C5159e.m11590a(iArr6)) {
                    C5156b bVar3 = eVar3.f12345a;
                    int a4 = C5159e.m11590a(iArr6);
                    int a5 = bVar3.mo11903a(a4 == i10 ? i6 : iArr6[a4], a3);
                    int a6 = C5159e.m11590a(iArr6) - a;
                    int a7 = C5159e.m11590a(iArr5);
                    if (a7 == i10) {
                        iArr = new int[1];
                        i4 = i6;
                    } else {
                        int[] iArr7 = new int[(a7 + a6 + 1)];
                        i4 = 0;
                        System.arraycopy(iArr5, 0, iArr7, a6, a7 + 1);
                        iArr = iArr7;
                    }
                    iArr6 = eVar3.mo11916a(eVar3.mo11915a(iArr, a5), iArr6);
                    i6 = i4;
                    i10 = -1;
                }
                int i11 = i6;
                eVarArr[i3] = new C5159e(eVar3.f12345a, iArr6);
                i3++;
                i6 = i11;
                i5 = 1;
            } else {
                throw new ArithmeticException("Division by zero");
            }
        }
        int i12 = i6;
        int b2 = eVar.mo11917b();
        C5159e[] eVarArr2 = new C5159e[b2];
        int i13 = b2 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            eVarArr2[i14] = new C5159e(eVarArr[i14]);
        }
        C5159e[] eVarArr3 = new C5159e[b2];
        while (i13 >= 0) {
            eVarArr3[i13] = new C5159e(bVar2, i13);
            i13--;
        }
        for (int i15 = i12; i15 < b2; i15++) {
            if (eVarArr2[i15].mo11913a(i15) == 0) {
                int i16 = i15 + 1;
                int i17 = i12;
                while (i16 < b2) {
                    if (eVarArr2[i16].mo11913a(i15) != 0) {
                        C5159e eVar4 = eVarArr2[i15];
                        eVarArr2[i15] = eVarArr2[i16];
                        eVarArr2[i16] = eVar4;
                        C5159e eVar5 = eVarArr3[i15];
                        eVarArr3[i15] = eVarArr3[i16];
                        eVarArr3[i16] = eVar5;
                        i16 = b2;
                        i17 = 1;
                    }
                    i16++;
                }
                if (i17 == 0) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int a8 = bVar2.mo11902a(eVarArr2[i15].mo11913a(i15));
            eVarArr2[i15].mo11918b(a8);
            eVarArr3[i15].mo11918b(a8);
            for (int i18 = i12; i18 < b2; i18++) {
                if (i18 != i15) {
                    int a9 = eVarArr2[i18].mo11913a(i15);
                    if (a9 != 0) {
                        C5159e c = eVarArr2[i15].mo11919c(a9);
                        C5159e c2 = eVarArr3[i15].mo11919c(a9);
                        C5159e eVar6 = eVarArr2[i18];
                        eVar6.f12347c = eVar6.mo11916a(eVar6.f12347c, c.f12347c);
                        eVar6.mo11914a();
                        C5159e eVar7 = eVarArr3[i18];
                        eVar7.f12347c = eVar7.mo11916a(eVar7.f12347c, c2.f12347c);
                        eVar7.mo11914a();
                    }
                }
            }
        }
    }
}
