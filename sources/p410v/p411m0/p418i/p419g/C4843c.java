package p410v.p411m0.p418i.p419g;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p392u.C4557i;
import p392u.p401r.p403c.C4638h;
import p410v.C4694c0;
import p410v.p411m0.p418i.C4832b;
import p410v.p411m0.p418i.C4832b.C4833a;
import p410v.p411m0.p418i.C4839f;

/* renamed from: v.m0.i.g.c */
public final class C4843c implements C4845e {

    /* renamed from: a */
    public static final C4843c f11557a = new C4843c();

    /* renamed from: a */
    public void mo11324a(SSLSocket sSLSocket, String str, List<? extends C4694c0> list) {
        if (sSLSocket == null) {
            C4638h.m10271a("sslSocket");
            throw null;
        } else if (list == null) {
            C4638h.m10271a("protocols");
            throw null;
        } else if (mo11326b(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Object[] array = C4839f.f11548c.mo11321a(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new C4557i("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: b */
    public boolean mo11326b(SSLSocket sSLSocket) {
        if (sSLSocket != null) {
            return Conscrypt.isConscrypt(sSLSocket);
        }
        C4638h.m10271a("sslSocket");
        throw null;
    }

    /* renamed from: a */
    public String mo11323a(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            C4638h.m10271a("sslSocket");
            throw null;
        } else if (mo11326b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo11325a() {
        C4833a aVar = C4832b.f11530f;
        return C4832b.f11529e;
    }
}
