package p484y;

import java.lang.annotation.Annotation;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: y.g0 */
public final class C5279g0 implements C5272f0 {

    /* renamed from: a */
    public static final C5272f0 f12573a = new C5279g0();

    /* renamed from: a */
    public static Annotation[] m11751a(Annotation[] annotationArr) {
        if (C5282h0.m11766a(annotationArr, C5272f0.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[(annotationArr.length + 1)];
        annotationArr2[0] = f12573a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    public Class<? extends Annotation> annotationType() {
        return C5272f0.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof C5272f0;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("@");
        a.append(C5272f0.class.getName());
        a.append("()");
        return a.toString();
    }
}
