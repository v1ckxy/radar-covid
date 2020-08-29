package p213q.p217b.p301c.p302a.p305e0;

import com.google.crypto.tink.proto.RegistryConfig;
import java.security.GeneralSecurityException;
import p213q.p217b.p301c.p302a.C3574i;
import p213q.p217b.p301c.p302a.C3846q;
import p213q.p217b.p301c.p302a.C3855z;

/* renamed from: q.b.c.a.e0.b */
public final class C3539b {
    @Deprecated

    /* renamed from: a */
    public static final RegistryConfig f8918a = RegistryConfig.getDefaultInstance();
    @Deprecated

    /* renamed from: b */
    public static final RegistryConfig f8919b = RegistryConfig.getDefaultInstance();

    static {
        new C3536a();
        try {
            C3855z.m9221a((C3574i<KeyProtoT>) new C3536a<KeyProtoT>(), true);
            C3855z.m9222a((C3846q<P>) new C3540c<P>());
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m8056a() {
        C3855z.m9221a((C3574i<KeyProtoT>) new C3536a<KeyProtoT>(), true);
        C3855z.m9222a((C3846q<P>) new C3540c<P>());
    }
}
