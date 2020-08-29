package p213q.p217b.p301c.p302a.p306f0;

import com.google.crypto.tink.proto.RegistryConfig;
import java.security.GeneralSecurityException;
import p213q.p217b.p301c.p302a.C3574i;
import p213q.p217b.p301c.p302a.C3846q;
import p213q.p217b.p301c.p302a.C3849t;
import p213q.p217b.p301c.p302a.C3855z;
import p213q.p217b.p301c.p302a.p303c0.C3504a;

/* renamed from: q.b.c.a.f0.c */
public final class C3548c {
    @Deprecated

    /* renamed from: a */
    public static final RegistryConfig f8923a = RegistryConfig.getDefaultInstance();
    @Deprecated

    /* renamed from: b */
    public static final RegistryConfig f8924b = RegistryConfig.getDefaultInstance();
    @Deprecated

    /* renamed from: c */
    public static final RegistryConfig f8925c = RegistryConfig.getDefaultInstance();

    static {
        new C3546b();
        new C3543a();
        try {
            m8075a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m8075a() {
        C3504a.m7966a();
        C3855z.m9223a((C3849t<KeyProtoT, PublicKeyProtoT>) new C3543a<KeyProtoT,PublicKeyProtoT>(), (C3574i<PublicKeyProtoT>) new C3546b<PublicKeyProtoT>(), true);
        C3855z.m9222a((C3846q<P>) new C3549d<P>());
        C3855z.m9222a((C3846q<P>) new C3551e<P>());
    }
}
