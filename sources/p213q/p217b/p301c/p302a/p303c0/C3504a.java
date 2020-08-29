package p213q.p217b.p301c.p302a.p303c0;

import com.google.crypto.tink.proto.RegistryConfig;
import java.security.GeneralSecurityException;
import p213q.p217b.p301c.p302a.C3574i;
import p213q.p217b.p301c.p302a.C3846q;
import p213q.p217b.p301c.p302a.C3855z;
import p213q.p217b.p301c.p302a.p309h0.C3570c;

/* renamed from: q.b.c.a.c0.a */
public final class C3504a {

    /* renamed from: a */
    public static final String f8901a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";

    /* renamed from: b */
    public static final String f8902b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
    @Deprecated

    /* renamed from: c */
    public static final RegistryConfig f8903c = RegistryConfig.getDefaultInstance();

    static {
        new C3508c();
        new C3517f();
        new C3514e();
        new C3523h();
        new C3527j();
        new C3520g();
        new C3530k();
        try {
            m7966a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m7966a() {
        C3570c.m8112a();
        C3855z.m9221a((C3574i<KeyProtoT>) new C3508c<KeyProtoT>(), true);
        C3855z.m9221a((C3574i<KeyProtoT>) new C3514e<KeyProtoT>(), true);
        C3855z.m9221a((C3574i<KeyProtoT>) new C3517f<KeyProtoT>(), true);
        C3855z.m9221a((C3574i<KeyProtoT>) new C3520g<KeyProtoT>(), true);
        C3855z.m9221a((C3574i<KeyProtoT>) new C3523h<KeyProtoT>(), true);
        C3855z.m9221a((C3574i<KeyProtoT>) new C3527j<KeyProtoT>(), true);
        C3855z.m9221a((C3574i<KeyProtoT>) new C3530k<KeyProtoT>(), true);
        C3855z.m9222a((C3846q<P>) new C3505b<P>());
    }
}
