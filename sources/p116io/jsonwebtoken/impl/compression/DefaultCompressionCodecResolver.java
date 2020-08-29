package p116io.jsonwebtoken.impl.compression;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p116io.jsonwebtoken.CompressionCodec;
import p116io.jsonwebtoken.CompressionCodecResolver;
import p116io.jsonwebtoken.CompressionCodecs;
import p116io.jsonwebtoken.CompressionException;
import p116io.jsonwebtoken.Header;
import p116io.jsonwebtoken.impl.lang.Services;
import p116io.jsonwebtoken.lang.Assert;
import p116io.jsonwebtoken.lang.Strings;

/* renamed from: io.jsonwebtoken.impl.compression.DefaultCompressionCodecResolver */
public class DefaultCompressionCodecResolver implements CompressionCodecResolver {
    public static final String MISSING_COMPRESSION_MESSAGE = "Unable to find an implementation for compression algorithm [%s] using java.util.ServiceLoader. Ensure you include a backing implementation .jar in the classpath, for example jjwt-impl.jar, or your own .jar for custom implementations.";
    public final Map<String, CompressionCodec> codecs;

    public DefaultCompressionCodecResolver() {
        HashMap hashMap = new HashMap();
        for (CompressionCodec compressionCodec : Services.loadAll(CompressionCodec.class)) {
            hashMap.put(compressionCodec.getAlgorithmName().toUpperCase(), compressionCodec);
        }
        hashMap.put(CompressionCodecs.DEFLATE.getAlgorithmName().toUpperCase(), CompressionCodecs.DEFLATE);
        hashMap.put(CompressionCodecs.GZIP.getAlgorithmName().toUpperCase(), CompressionCodecs.GZIP);
        this.codecs = Collections.unmodifiableMap(hashMap);
    }

    private CompressionCodec byName(String str) {
        Assert.hasText(str, "'name' must not be empty");
        CompressionCodec compressionCodec = (CompressionCodec) this.codecs.get(str.toUpperCase());
        if (compressionCodec != null) {
            return compressionCodec;
        }
        throw new CompressionException(String.format(MISSING_COMPRESSION_MESSAGE, new Object[]{str}));
    }

    private String getAlgorithmFromHeader(Header header) {
        Assert.notNull(header, "header cannot be null.");
        return header.getCompressionAlgorithm();
    }

    public CompressionCodec resolveCompressionCodec(Header header) {
        String algorithmFromHeader = getAlgorithmFromHeader(header);
        if (!Strings.hasText(algorithmFromHeader)) {
            return null;
        }
        return byName(algorithmFromHeader);
    }
}
