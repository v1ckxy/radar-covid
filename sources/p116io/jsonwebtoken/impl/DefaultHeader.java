package p116io.jsonwebtoken.impl;

import java.util.Map;
import p116io.jsonwebtoken.Header;
import p116io.jsonwebtoken.lang.Strings;

/* renamed from: io.jsonwebtoken.impl.DefaultHeader */
public class DefaultHeader<T extends Header<T>> extends JwtMap implements Header<T> {
    public DefaultHeader() {
    }

    public DefaultHeader(Map<String, Object> map) {
        super(map);
    }

    public String getCompressionAlgorithm() {
        String string = getString(Header.COMPRESSION_ALGORITHM);
        return !Strings.hasText(string) ? getString(Header.DEPRECATED_COMPRESSION_ALGORITHM) : string;
    }

    public String getContentType() {
        return getString(Header.CONTENT_TYPE);
    }

    public String getType() {
        return getString(Header.TYPE);
    }

    public T setCompressionAlgorithm(String str) {
        setValue(Header.COMPRESSION_ALGORITHM, str);
        return this;
    }

    public T setContentType(String str) {
        setValue(Header.CONTENT_TYPE, str);
        return this;
    }

    public T setType(String str) {
        setValue(Header.TYPE, str);
        return this;
    }
}
