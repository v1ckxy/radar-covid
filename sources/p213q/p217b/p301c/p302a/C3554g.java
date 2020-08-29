package p213q.p217b.p301c.p302a;

import com.google.crypto.tink.proto.KeyData;
import java.security.GeneralSecurityException;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p301c.p302a.C3574i.C3575a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;

/* renamed from: q.b.c.a.g */
public class C3554g<PrimitiveT, KeyProtoT extends C3706s0> implements C3542f<PrimitiveT> {

    /* renamed from: a */
    public final C3574i<KeyProtoT> f8928a;

    /* renamed from: b */
    public final Class<PrimitiveT> f8929b;

    public C3554g(C3574i<KeyProtoT> iVar, Class<PrimitiveT> cls) {
        if (iVar.mo9480d().contains(cls) || Void.class.equals(cls)) {
            this.f8928a = iVar;
            this.f8929b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{iVar.toString(), cls.getName()}));
    }

    /* renamed from: a */
    public final PrimitiveT mo9469a(C3635j jVar) {
        try {
            C3706s0 a = this.f8928a.mo9460a(jVar);
            if (!Void.class.equals(this.f8929b)) {
                this.f8928a.mo9461a(a);
                return this.f8928a.mo9479a(a, this.f8929b);
            }
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        } catch (C3606c0 e) {
            StringBuilder a2 = C1965a.m4756a("Failures parsing proto of type ");
            a2.append(this.f8928a.f8958a.getName());
            throw new GeneralSecurityException(a2.toString(), e);
        }
    }

    /* renamed from: b */
    public final C3706s0 mo9470b(C3635j jVar) {
        try {
            C3575a b = this.f8928a.mo9462b();
            C3706s0 a = b.mo9466a(jVar);
            b.mo9467b(a);
            return (C3706s0) b.mo9465a(a);
        } catch (C3606c0 e) {
            StringBuilder a2 = C1965a.m4756a("Failures parsing proto of type ");
            a2.append(this.f8928a.mo9462b().f8961a.getName());
            throw new GeneralSecurityException(a2.toString(), e);
        }
    }

    /* renamed from: c */
    public final KeyData mo9471c(C3635j jVar) {
        try {
            C3575a b = this.f8928a.mo9462b();
            C3706s0 a = b.mo9466a(jVar);
            b.mo9467b(a);
            return (KeyData) KeyData.newBuilder().setTypeUrl(this.f8928a.mo9459a()).setValue(((C3706s0) b.mo9465a(a)).toByteString()).setKeyMaterialType(this.f8928a.mo9463c()).build();
        } catch (C3606c0 e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }
}
