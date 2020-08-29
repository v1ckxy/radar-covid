package p213q.p217b.p301c.p302a;

import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.KeyTemplate.Builder;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.errorprone.annotations.Immutable;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;

@Immutable
/* renamed from: q.b.c.a.h */
public final class C3562h {

    /* renamed from: a */
    public final KeyTemplate f8947a;

    /* renamed from: q.b.c.a.h$a */
    public enum C3563a {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    public C3562h(KeyTemplate keyTemplate) {
        this.f8947a = keyTemplate;
    }

    /* renamed from: a */
    public static C3562h m8091a(String str, byte[] bArr, C3563a aVar) {
        OutputPrefixType outputPrefixType;
        Builder value = KeyTemplate.newBuilder().setTypeUrl(str).setValue(C3635j.m8388a(bArr));
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            outputPrefixType = OutputPrefixType.TINK;
        } else if (ordinal == 1) {
            outputPrefixType = OutputPrefixType.LEGACY;
        } else if (ordinal == 2) {
            outputPrefixType = OutputPrefixType.RAW;
        } else if (ordinal == 3) {
            outputPrefixType = OutputPrefixType.CRUNCHY;
        } else {
            throw new IllegalArgumentException("Unknown output prefix type");
        }
        return new C3562h((KeyTemplate) value.setOutputPrefixType(outputPrefixType).build());
    }
}
