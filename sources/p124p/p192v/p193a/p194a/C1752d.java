package p124p.p192v.p193a.p194a;

import android.animation.TypeEvaluator;
import p124p.p126b.p127k.C1061o;
import p124p.p150h.p154f.C1337c;

/* renamed from: p.v.a.a.d */
public class C1752d implements TypeEvaluator<C1337c[]> {

    /* renamed from: a */
    public C1337c[] f5109a;

    public Object evaluate(float f, Object obj, Object obj2) {
        C1337c[] cVarArr = (C1337c[]) obj;
        C1337c[] cVarArr2 = (C1337c[]) obj2;
        if (C1061o.m2517a(cVarArr, cVarArr2)) {
            if (!C1061o.m2517a(this.f5109a, cVarArr)) {
                this.f5109a = C1061o.m2519a(cVarArr);
            }
            int i = 0;
            while (i < cVarArr.length) {
                C1337c cVar = this.f5109a[i];
                C1337c cVar2 = cVarArr[i];
                C1337c cVar3 = cVarArr2[i];
                if (cVar != null) {
                    cVar.f4039a = cVar2.f4039a;
                    int i2 = 0;
                    while (true) {
                        float[] fArr = cVar2.f4040b;
                        if (i2 >= fArr.length) {
                            break;
                        }
                        cVar.f4040b[i2] = (cVar3.f4040b[i2] * f) + ((1.0f - f) * fArr[i2]);
                        i2++;
                    }
                    i++;
                } else {
                    throw null;
                }
            }
            return this.f5109a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
