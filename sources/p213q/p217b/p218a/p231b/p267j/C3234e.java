package p213q.p217b.p218a.p231b.p267j;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2134a;
import p213q.p217b.p218a.p231b.p239d.p240m.C2133a.C2145f;
import p213q.p217b.p218a.p231b.p239d.p240m.C2150d.C2151a;
import p213q.p217b.p218a.p231b.p239d.p240m.C2150d.C2152b;
import p213q.p217b.p218a.p231b.p239d.p242n.C2228c;
import p213q.p217b.p218a.p231b.p267j.p268b.C3218a;

/* renamed from: q.b.a.b.j.e */
public final class C3234e extends C2134a<C3218a, C3217a> {
    /* renamed from: a */
    public final /* synthetic */ C2145f mo7120a(Context context, Looper looper, C2228c cVar, Object obj, C2151a aVar, C2152b bVar) {
        if (((C3217a) obj) == null) {
            C3217a aVar2 = C3217a.f8071j;
        }
        C3217a aVar3 = cVar.f6161g;
        Integer num = cVar.f6162h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", cVar.f6155a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (aVar3 != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", aVar3.f8072a);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", aVar3.f8073b);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", aVar3.f8074c);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", aVar3.f8075d);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", aVar3.f8076e);
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", aVar3.f8077f);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", aVar3.f8078g);
            Long l = aVar3.f8079h;
            if (l != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", l.longValue());
            }
            Long l2 = aVar3.f8080i;
            if (l2 != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", l2.longValue());
            }
        }
        C3218a aVar4 = new C3218a(context, looper, true, cVar, bundle, aVar, bVar);
        return aVar4;
    }
}
