package p213q.p217b.p218a.p231b.p267j.p268b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import java.util.List;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p240m.C2157h;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

/* renamed from: q.b.a.b.j.b.h */
public final class C3225h extends C2258a implements C2157h {
    public static final Creator<C3225h> CREATOR = new C3227j();

    /* renamed from: e */
    public final List<String> f8088e;

    /* renamed from: f */
    public final String f8089f;

    public C3225h(List<String> list, String str) {
        this.f8088e = list;
        this.f8089f = str;
    }

    public final Status getStatus() {
        return this.f8089f != null ? Status.f1058i : Status.f1060k;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2486a(parcel, 1, this.f8088e, false);
        C1061o.m2485a(parcel, 2, this.f8089f, false);
        C1061o.m2566n(parcel, a);
    }
}
