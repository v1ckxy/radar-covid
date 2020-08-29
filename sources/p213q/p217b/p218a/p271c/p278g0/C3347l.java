package p213q.p217b.p218a.p271c.p278g0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.List;
import p213q.p217b.p218a.p271c.p277f0.C3328a;
import p213q.p217b.p218a.p271c.p278g0.C3348m.C3354f;

/* renamed from: q.b.a.c.g0.l */
public class C3347l extends C3354f {

    /* renamed from: b */
    public final /* synthetic */ List f8442b;

    /* renamed from: c */
    public final /* synthetic */ Matrix f8443c;

    public C3347l(C3348m mVar, List list, Matrix matrix) {
        this.f8442b = list;
        this.f8443c = matrix;
    }

    /* renamed from: a */
    public void mo9107a(Matrix matrix, C3328a aVar, int i, Canvas canvas) {
        for (C3354f a : this.f8442b) {
            a.mo9107a(this.f8443c, aVar, i, canvas);
        }
    }
}
