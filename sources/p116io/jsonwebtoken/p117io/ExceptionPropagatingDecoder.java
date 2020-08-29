package p116io.jsonwebtoken.p117io;

import p116io.jsonwebtoken.lang.Assert;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.io.ExceptionPropagatingDecoder */
public class ExceptionPropagatingDecoder<T, R> implements Decoder<T, R> {
    public final Decoder<T, R> decoder;

    public ExceptionPropagatingDecoder(Decoder<T, R> decoder2) {
        Assert.notNull(decoder2, "Decoder cannot be null.");
        this.decoder = decoder2;
    }

    public R decode(T t) {
        Assert.notNull(t, "Decode argument cannot be null.");
        try {
            return this.decoder.decode(t);
        } catch (DecodingException e) {
            throw e;
        } catch (Exception e2) {
            StringBuilder a = C1965a.m4756a("Unable to decode input: ");
            a.append(e2.getMessage());
            throw new DecodingException(a.toString(), e2);
        }
    }
}
