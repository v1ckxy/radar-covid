package p213q.p217b.p317d.p347l;

import android.os.Bundle;
import android.util.Log;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p231b.p270l.C3257j;

/* renamed from: q.b.d.l.p */
public abstract class C4251p<T> {

    /* renamed from: a */
    public final int f10230a;

    /* renamed from: b */
    public final C3257j<T> f10231b = new C3257j<>();

    /* renamed from: c */
    public final int f10232c;

    /* renamed from: d */
    public final Bundle f10233d;

    public C4251p(int i, int i2, Bundle bundle) {
        this.f10230a = i;
        this.f10232c = i2;
        this.f10233d = bundle;
    }

    /* renamed from: a */
    public final void mo10439a(C4249o oVar) {
        String str = "MessengerIpcClient";
        if (Log.isLoggable(str, 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(oVar);
            StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 14);
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d(str, sb.toString());
        }
        this.f10231b.f8128a.mo8929a((Exception) oVar);
    }

    public String toString() {
        int i = this.f10232c;
        int i2 = this.f10230a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(false);
        sb.append(Objects.ARRAY_END);
        return sb.toString();
    }
}
