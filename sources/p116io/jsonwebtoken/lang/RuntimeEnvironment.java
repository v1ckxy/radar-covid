package p116io.jsonwebtoken.lang;

import java.security.Provider;
import java.security.Security;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.jsonwebtoken.lang.RuntimeEnvironment */
public final class RuntimeEnvironment {
    public static final String BC_PROVIDER_CLASS_NAME = "org.bouncycastle.jce.provider.BouncyCastleProvider";
    public static final boolean BOUNCY_CASTLE_AVAILABLE = Classes.isAvailable(BC_PROVIDER_CLASS_NAME);
    public static final AtomicBoolean bcLoaded = new AtomicBoolean(false);

    static {
        enableBouncyCastleIfPossible();
    }

    public static void enableBouncyCastleIfPossible() {
        if (BOUNCY_CASTLE_AVAILABLE && !bcLoaded.get()) {
            try {
                Class forName = Classes.forName(BC_PROVIDER_CLASS_NAME);
                for (Provider isInstance : Security.getProviders()) {
                    if (forName.isInstance(isInstance)) {
                        bcLoaded.set(true);
                        return;
                    }
                }
                Security.addProvider((Provider) Classes.newInstance(forName));
                bcLoaded.set(true);
            } catch (UnknownClassException unused) {
            }
        }
    }
}
