package p213q.p217b.p301c.p302a.p313k0;

import com.google.crypto.tink.proto.RegistryConfig;
import java.security.GeneralSecurityException;
import p213q.p217b.p301c.p302a.C3574i;
import p213q.p217b.p301c.p302a.C3846q;
import p213q.p217b.p301c.p302a.C3849t;
import p213q.p217b.p301c.p302a.C3855z;

/* renamed from: q.b.c.a.k0.k */
public final class C3765k {
    @Deprecated

    /* renamed from: a */
    public static final RegistryConfig f9310a = RegistryConfig.getDefaultInstance();
    @Deprecated

    /* renamed from: b */
    public static final RegistryConfig f9311b = RegistryConfig.getDefaultInstance();

    /* renamed from: c */
    public static final RegistryConfig f9312c = RegistryConfig.getDefaultInstance();

    static {
        new C3744b();
        new C3741a();
        new C3749d();
        new C3746c();
        new C3755g();
        new C3758h();
        try {
            m9084a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m9084a() {
        C3855z.m9223a((C3849t<KeyProtoT, PublicKeyProtoT>) new C3741a<KeyProtoT,PublicKeyProtoT>(), (C3574i<PublicKeyProtoT>) new C3744b<PublicKeyProtoT>(), true);
        C3855z.m9223a((C3849t<KeyProtoT, PublicKeyProtoT>) new C3746c<KeyProtoT,PublicKeyProtoT>(), (C3574i<PublicKeyProtoT>) new C3749d<PublicKeyProtoT>(), true);
        C3855z.m9223a((C3849t<KeyProtoT, PublicKeyProtoT>) new C3755g<KeyProtoT,PublicKeyProtoT>(), (C3574i<PublicKeyProtoT>) new C3758h<PublicKeyProtoT>(), true);
        C3855z.m9223a((C3849t<KeyProtoT, PublicKeyProtoT>) new C3760i<KeyProtoT,PublicKeyProtoT>(), (C3574i<PublicKeyProtoT>) new C3763j<PublicKeyProtoT>(), true);
        C3855z.m9222a((C3846q<P>) new C3751e<P>());
        C3855z.m9222a((C3846q<P>) new C3753f<P>());
    }
}
