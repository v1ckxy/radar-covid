package p116io.jsonwebtoken.impl.lang;

/* renamed from: io.jsonwebtoken.impl.lang.UnavailableImplementationException */
public final class UnavailableImplementationException extends RuntimeException {
    public static final String DEFAULT_NOT_FOUND_MESSAGE = "Unable to find an implementation for %s using java.util.ServiceLoader. Ensure you include a backing implementation .jar in the classpath, for example jjwt-impl.jar, or your own .jar for custom implementations.";

    public UnavailableImplementationException(Class cls) {
        super(String.format(DEFAULT_NOT_FOUND_MESSAGE, new Object[]{cls}));
    }
}
