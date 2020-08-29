package p213q.p217b.p317d.p347l;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import p213q.p217b.p218a.p231b.p270l.C3239a;
import p213q.p217b.p218a.p231b.p270l.C3255i;

/* renamed from: q.b.d.l.c1 */
public final /* synthetic */ class C4223c1 implements C3239a {
    public C4223c1(C4220b1 b1Var) {
    }

    /* renamed from: a */
    public final Object mo8913a(C3255i iVar) {
        Bundle bundle = (Bundle) iVar.mo8921a(IOException.class);
        String str = "SERVICE_NOT_AVAILABLE";
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(valueOf.length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException(str);
            }
        } else {
            throw new IOException(str);
        }
    }
}
