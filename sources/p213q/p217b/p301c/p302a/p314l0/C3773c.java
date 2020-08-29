package p213q.p217b.p301c.p302a.p314l0;

import com.google.crypto.tink.proto.RegistryConfig;
import java.security.GeneralSecurityException;
import p213q.p217b.p301c.p302a.C3574i;
import p213q.p217b.p301c.p302a.C3846q;
import p213q.p217b.p301c.p302a.C3855z;

/* renamed from: q.b.c.a.l0.c */
public final class C3773c {
    @Deprecated

    /* renamed from: a */
    public static final RegistryConfig f9315a = RegistryConfig.getDefaultInstance();

    /* renamed from: b */
    public static final RegistryConfig f9316b = RegistryConfig.getDefaultInstance();

    static {
        new C3767a();
        new C3770b();
        try {
            C3855z.m9221a((C3574i<KeyProtoT>) new C3767a<KeyProtoT>(), true);
            C3855z.m9221a((C3574i<KeyProtoT>) new C3770b<KeyProtoT>(), true);
            C3855z.m9222a((C3846q<P>) new C3775e<P>());
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
