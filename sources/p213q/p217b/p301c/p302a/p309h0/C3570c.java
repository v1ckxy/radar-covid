package p213q.p217b.p301c.p302a.p309h0;

import com.google.crypto.tink.proto.RegistryConfig;
import java.security.GeneralSecurityException;
import p213q.p217b.p301c.p302a.C3574i;
import p213q.p217b.p301c.p302a.C3846q;
import p213q.p217b.p301c.p302a.C3855z;

/* renamed from: q.b.c.a.h0.c */
public final class C3570c {
    @Deprecated

    /* renamed from: a */
    public static final RegistryConfig f8954a = RegistryConfig.getDefaultInstance();

    static {
        new C3567b();
        try {
            m8112a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m8112a() {
        C3855z.m9221a((C3574i<KeyProtoT>) new C3567b<KeyProtoT>(), true);
        C3855z.m9221a((C3574i<KeyProtoT>) new C3564a<KeyProtoT>(), true);
        C3855z.m9222a((C3846q<P>) new C3571d<P>());
    }
}
