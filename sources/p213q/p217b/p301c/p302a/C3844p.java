package p213q.p217b.p301c.p302a;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: q.b.c.a.p */
public final class C3844p<P> {

    /* renamed from: d */
    public static final Charset f9437d = Charset.forName("UTF-8");

    /* renamed from: a */
    public ConcurrentMap<String, List<C3845a<P>>> f9438a = new ConcurrentHashMap();

    /* renamed from: b */
    public C3845a<P> f9439b;

    /* renamed from: c */
    public final Class<P> f9440c;

    /* renamed from: q.b.c.a.p$a */
    public static final class C3845a<P> {

        /* renamed from: a */
        public final P f9441a;

        /* renamed from: b */
        public final byte[] f9442b;

        /* renamed from: c */
        public final KeyStatusType f9443c;

        /* renamed from: d */
        public final OutputPrefixType f9444d;

        /* renamed from: e */
        public final int f9445e;

        public C3845a(P p, byte[] bArr, KeyStatusType keyStatusType, OutputPrefixType outputPrefixType, int i) {
            this.f9441a = p;
            this.f9442b = Arrays.copyOf(bArr, bArr.length);
            this.f9443c = keyStatusType;
            this.f9444d = outputPrefixType;
            this.f9445e = i;
        }

        /* renamed from: a */
        public final byte[] mo10049a() {
            byte[] bArr = this.f9442b;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }
    }

    public C3844p(Class<P> cls) {
        this.f9440c = cls;
    }

    /* renamed from: a */
    public List<C3845a<P>> mo10047a() {
        return mo10048a(C3501b.f8900a);
    }

    /* renamed from: a */
    public List<C3845a<P>> mo10048a(byte[] bArr) {
        List<C3845a<P>> list = (List) this.f9438a.get(new String(bArr, f9437d));
        return list != null ? list : Collections.emptyList();
    }
}
