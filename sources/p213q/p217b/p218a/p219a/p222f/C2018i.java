package p213q.p217b.p218a.p219a.p222f;

import android.util.Base64;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p219a.C1967b;
import p213q.p217b.p218a.p219a.p222f.C2006b.C2008b;

/* renamed from: q.b.a.a.f.i */
public abstract class C2018i {

    /* renamed from: q.b.a.a.f.i$a */
    public static abstract class C2019a {
        /* renamed from: a */
        public abstract C2019a mo7005a(String str);

        /* renamed from: a */
        public abstract C2019a mo7006a(C1967b bVar);

        /* renamed from: a */
        public abstract C2018i mo7007a();
    }

    /* renamed from: a */
    public static C2019a m4802a() {
        C2008b bVar = new C2008b();
        bVar.mo7006a(C1967b.DEFAULT);
        return bVar;
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[3];
        C2006b bVar = (C2006b) this;
        objArr[0] = bVar.f5762a;
        objArr[1] = bVar.f5764c;
        byte[] bArr = bVar.f5763b;
        if (bArr == null) {
            str = Objects.EMPTY_STRING;
        } else {
            str = Base64.encodeToString(bArr, 2);
        }
        objArr[2] = str;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
