package p213q.p217b.p218a.p231b.p239d.p242n.p243o;

import android.os.Parcel;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.d.n.o.b */
public class C2259b extends RuntimeException {
    public C2259b(String str, Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        int dataSize = parcel.dataSize();
        StringBuilder sb = new StringBuilder(C1965a.m4743a(str, 41));
        sb.append(str);
        sb.append(" Parcel: pos=");
        sb.append(dataPosition);
        sb.append(" size=");
        sb.append(dataSize);
        super(sb.toString());
    }
}
