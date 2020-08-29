package p116io.jsonwebtoken.impl;

@Deprecated
/* renamed from: io.jsonwebtoken.impl.DefaultTextCodecFactory */
public class DefaultTextCodecFactory implements TextCodecFactory {
    public String getSystemProperty(String str) {
        return System.getProperty(str);
    }

    public TextCodec getTextCodec() {
        return isAndroid() ? new AndroidBase64Codec() : new Base64Codec();
    }

    public boolean isAndroid() {
        String lowerCase;
        String str;
        String systemProperty = getSystemProperty("java.vm.name");
        if (systemProperty != null) {
            lowerCase = systemProperty.toLowerCase();
            str = "dalvik";
        } else {
            String systemProperty2 = getSystemProperty("java.vm.vendor");
            if (systemProperty2 == null) {
                return false;
            }
            lowerCase = systemProperty2.toLowerCase();
            str = "android";
        }
        return lowerCase.contains(str);
    }
}
