package p425x.p426a.p445e.p446a;

import p119o.p120a.C0967p0;
import p425x.p426a.p427a.C4927c1;
import p425x.p426a.p427a.C4929d;
import p425x.p426a.p427a.C4933e;
import p425x.p426a.p427a.C4958k;
import p425x.p426a.p427a.C4964m;
import p425x.p426a.p427a.C4967n;
import p425x.p426a.p427a.C4971o;
import p425x.p426a.p427a.C4983s;
import p425x.p426a.p427a.C4986t;
import p425x.p426a.p427a.C5003y0;
import p425x.p426a.p445e.p447b.p452e.C5065a;

/* renamed from: x.a.e.a.f */
public class C5032f extends C4964m {

    /* renamed from: e */
    public C4958k f12004e;

    /* renamed from: f */
    public C4967n f12005f;

    /* renamed from: g */
    public byte[][] f12006g;

    /* renamed from: h */
    public byte[] f12007h;

    /* renamed from: i */
    public byte[][] f12008i;

    /* renamed from: j */
    public byte[] f12009j;

    /* renamed from: k */
    public byte[] f12010k;

    /* renamed from: l */
    public C5065a[] f12011l;

    public C5032f(C4986t tVar) {
        C4986t tVar2 = tVar;
        int i = 0;
        if (tVar2.mo11628e(0) instanceof C4958k) {
            this.f12004e = C4958k.m11231a((Object) tVar2.mo11628e(0));
        } else {
            this.f12005f = C4967n.m11262a((Object) tVar2.mo11628e(0));
        }
        C4986t tVar3 = (C4986t) tVar2.mo11628e(1);
        this.f12006g = new byte[tVar3.size()][];
        for (int i2 = 0; i2 < tVar3.size(); i2++) {
            this.f12006g[i2] = ((C4971o) tVar3.mo11628e(i2)).f11858e;
        }
        this.f12007h = ((C4971o) ((C4986t) tVar2.mo11628e(2)).mo11628e(0)).f11858e;
        C4986t tVar4 = (C4986t) tVar2.mo11628e(3);
        this.f12008i = new byte[tVar4.size()][];
        for (int i3 = 0; i3 < tVar4.size(); i3++) {
            this.f12008i[i3] = ((C4971o) tVar4.mo11628e(i3)).f11858e;
        }
        this.f12009j = ((C4971o) ((C4986t) tVar2.mo11628e(4)).mo11628e(0)).f11858e;
        this.f12010k = ((C4971o) ((C4986t) tVar2.mo11628e(5)).mo11628e(0)).f11858e;
        C4986t tVar5 = (C4986t) tVar2.mo11628e(6);
        byte[][][][] bArr = new byte[tVar5.size()][][][];
        byte[][][][] bArr2 = new byte[tVar5.size()][][][];
        byte[][][] bArr3 = new byte[tVar5.size()][][];
        byte[][] bArr4 = new byte[tVar5.size()][];
        int i4 = 0;
        while (i4 < tVar5.size()) {
            C4986t tVar6 = (C4986t) tVar5.mo11628e(i4);
            C4986t tVar7 = (C4986t) tVar6.mo11628e(i);
            bArr[i4] = new byte[tVar7.size()][][];
            for (int i5 = i; i5 < tVar7.size(); i5++) {
                C4986t tVar8 = (C4986t) tVar7.mo11628e(i5);
                bArr[i4][i5] = new byte[tVar8.size()][];
                for (int i6 = 0; i6 < tVar8.size(); i6++) {
                    bArr[i4][i5][i6] = ((C4971o) tVar8.mo11628e(i6)).f11858e;
                }
            }
            C4986t tVar9 = (C4986t) tVar6.mo11628e(1);
            bArr2[i4] = new byte[tVar9.size()][][];
            for (int i7 = 0; i7 < tVar9.size(); i7++) {
                C4986t tVar10 = (C4986t) tVar9.mo11628e(i7);
                bArr2[i4][i7] = new byte[tVar10.size()][];
                for (int i8 = 0; i8 < tVar10.size(); i8++) {
                    bArr2[i4][i7][i8] = ((C4971o) tVar10.mo11628e(i8)).f11858e;
                }
            }
            C4986t tVar11 = (C4986t) tVar6.mo11628e(2);
            bArr3[i4] = new byte[tVar11.size()][];
            for (int i9 = 0; i9 < tVar11.size(); i9++) {
                bArr3[i4][i9] = ((C4971o) tVar11.mo11628e(i9)).f11858e;
            }
            bArr4[i4] = ((C4971o) tVar6.mo11628e(3)).f11858e;
            i4++;
            i = 0;
        }
        int length = this.f12010k.length - 1;
        this.f12011l = new C5065a[length];
        int i10 = 0;
        while (i10 < length) {
            byte[] bArr5 = this.f12010k;
            int i11 = i10 + 1;
            C5065a aVar = new C5065a(bArr5[i10], bArr5[i11], C0967p0.m2224a(bArr[i10]), C0967p0.m2224a(bArr2[i10]), C0967p0.m2239b(bArr3[i10]), C0967p0.m2247c(bArr4[i10]));
            this.f12011l[i10] = aVar;
            i10 = i11;
        }
    }

    /* renamed from: f */
    public C4983s mo11569f() {
        C4933e eVar = new C4933e(10);
        C4929d dVar = this.f12004e;
        if (dVar == null) {
            dVar = this.f12005f;
        }
        eVar.mo11573a(dVar);
        C4933e eVar2 = new C4933e(10);
        int i = 0;
        while (true) {
            byte[][] bArr = this.f12006g;
            if (i >= bArr.length) {
                break;
            }
            eVar2.mo11573a((C4929d) new C5003y0(bArr[i]));
            i++;
        }
        eVar.mo11573a((C4929d) new C4927c1(eVar2));
        C4933e eVar3 = new C4933e(10);
        eVar3.mo11573a((C4929d) new C5003y0(this.f12007h));
        eVar.mo11573a((C4929d) new C4927c1(eVar3));
        C4933e eVar4 = new C4933e(10);
        int i2 = 0;
        while (true) {
            byte[][] bArr2 = this.f12008i;
            if (i2 >= bArr2.length) {
                break;
            }
            eVar4.mo11573a((C4929d) new C5003y0(bArr2[i2]));
            i2++;
        }
        eVar.mo11573a((C4929d) new C4927c1(eVar4));
        C4933e eVar5 = new C4933e(10);
        eVar5.mo11573a((C4929d) new C5003y0(this.f12009j));
        eVar.mo11573a((C4929d) new C4927c1(eVar5));
        C4933e eVar6 = new C4933e(10);
        eVar6.mo11573a((C4929d) new C5003y0(this.f12010k));
        eVar.mo11573a((C4929d) new C4927c1(eVar6));
        C4933e eVar7 = new C4933e(10);
        for (int i3 = 0; i3 < this.f12011l.length; i3++) {
            C4933e eVar8 = new C4933e(10);
            byte[][][] a = C0967p0.m2223a(this.f12011l[i3].f12131d);
            C4933e eVar9 = new C4933e(10);
            for (int i4 = 0; i4 < a.length; i4++) {
                C4933e eVar10 = new C4933e(10);
                for (byte[] y0Var : a[i4]) {
                    eVar10.mo11573a((C4929d) new C5003y0(y0Var));
                }
                eVar9.mo11573a((C4929d) new C4927c1(eVar10));
            }
            eVar8.mo11573a((C4929d) new C4927c1(eVar9));
            byte[][][] a2 = C0967p0.m2223a(this.f12011l[i3].f12132e);
            C4933e eVar11 = new C4933e(10);
            for (int i5 = 0; i5 < a2.length; i5++) {
                C4933e eVar12 = new C4933e(10);
                for (byte[] y0Var2 : a2[i5]) {
                    eVar12.mo11573a((C4929d) new C5003y0(y0Var2));
                }
                eVar11.mo11573a((C4929d) new C4927c1(eVar12));
            }
            eVar8.mo11573a((C4929d) new C4927c1(eVar11));
            byte[][] a3 = C0967p0.m2222a(this.f12011l[i3].f12133f);
            C4933e eVar13 = new C4933e(10);
            for (byte[] y0Var3 : a3) {
                eVar13.mo11573a((C4929d) new C5003y0(y0Var3));
            }
            eVar8.mo11573a((C4929d) new C4927c1(eVar13));
            eVar8.mo11573a((C4929d) new C5003y0(C0967p0.m2238b(this.f12011l[i3].f12134g)));
            eVar7.mo11573a((C4929d) new C4927c1(eVar8));
        }
        eVar.mo11573a((C4929d) new C4927c1(eVar7));
        return new C4927c1(eVar);
    }

    public C5032f(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C5065a[] aVarArr) {
        this.f12004e = new C4958k(1);
        this.f12006g = C0967p0.m2222a(sArr);
        this.f12007h = C0967p0.m2238b(sArr2);
        this.f12008i = C0967p0.m2222a(sArr3);
        this.f12009j = C0967p0.m2238b(sArr4);
        byte[] bArr = new byte[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            bArr[i] = (byte) iArr[i];
        }
        this.f12010k = bArr;
        this.f12011l = aVarArr;
    }
}
