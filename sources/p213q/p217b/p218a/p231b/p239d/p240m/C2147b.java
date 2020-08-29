package p213q.p217b.p218a.p231b.p239d.p240m;

import com.google.android.gms.common.api.Status;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.d.m.b */
public class C2147b extends Exception {
    @Deprecated

    /* renamed from: e */
    public final Status f6010e;

    public C2147b(Status status) {
        int i = status.f1062f;
        String str = status.f1063g;
        if (str == null) {
            str = Objects.EMPTY_STRING;
        }
        StringBuilder sb = new StringBuilder(C1965a.m4743a(str, 13));
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.f6010e = status;
    }
}
