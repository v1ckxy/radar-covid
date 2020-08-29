package p116io.jsonwebtoken.p117io;

import p116io.jsonwebtoken.lang.Assert;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.io.ExceptionPropagatingEncoder */
public class ExceptionPropagatingEncoder<T, R> implements Encoder<T, R> {
    public final Encoder<T, R> encoder;

    public ExceptionPropagatingEncoder(Encoder<T, R> encoder2) {
        Assert.notNull(encoder2, "Encoder cannot be null.");
        this.encoder = encoder2;
    }

    public R encode(T t) {
        Assert.notNull(t, "Encode argument cannot be null.");
        try {
            return this.encoder.encode(t);
        } catch (EncodingException e) {
            throw e;
        } catch (Exception e2) {
            StringBuilder a = C1965a.m4756a("Unable to encode input: ");
            a.append(e2.getMessage());
            throw new EncodingException(a.toString(), e2);
        }
    }
}
