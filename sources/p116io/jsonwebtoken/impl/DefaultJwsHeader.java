package p116io.jsonwebtoken.impl;

import java.util.Map;
import p116io.jsonwebtoken.JwsHeader;

/* renamed from: io.jsonwebtoken.impl.DefaultJwsHeader */
public class DefaultJwsHeader extends DefaultHeader implements JwsHeader {
    public DefaultJwsHeader() {
    }

    public DefaultJwsHeader(Map<String, Object> map) {
        super(map);
    }

    public String getAlgorithm() {
        return getString(JwsHeader.ALGORITHM);
    }

    public String getKeyId() {
        return getString(JwsHeader.KEY_ID);
    }

    public JwsHeader setAlgorithm(String str) {
        setValue(JwsHeader.ALGORITHM, str);
        return this;
    }

    public JwsHeader setKeyId(String str) {
        setValue(JwsHeader.KEY_ID, str);
        return this;
    }
}
