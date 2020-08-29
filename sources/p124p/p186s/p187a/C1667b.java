package p124p.p186s.p187a;

import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyGenParameterSpec.Builder;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import p213q.p214a.p215a.p216a.C1965a;

@Deprecated
/* renamed from: p.s.a.b */
public final class C1667b {

    /* renamed from: a */
    public static final KeyGenParameterSpec f4921a = new Builder("_androidx_security_master_key_", 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256).build();

    /* renamed from: a */
    public static String m4214a(KeyGenParameterSpec keyGenParameterSpec) {
        if (keyGenParameterSpec.getKeySize() != 256) {
            StringBuilder a = C1965a.m4756a("invalid key size, want 256 bits got ");
            a.append(keyGenParameterSpec.getKeySize());
            a.append(" bits");
            throw new IllegalArgumentException(a.toString());
        } else if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
            StringBuilder a2 = C1965a.m4756a("invalid block mode, want GCM got ");
            a2.append(Arrays.toString(keyGenParameterSpec.getBlockModes()));
            throw new IllegalArgumentException(a2.toString());
        } else if (keyGenParameterSpec.getPurposes() != 3) {
            StringBuilder a3 = C1965a.m4756a("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
            a3.append(keyGenParameterSpec.getPurposes());
            throw new IllegalArgumentException(a3.toString());
        } else if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            StringBuilder a4 = C1965a.m4756a("invalid padding mode, want NoPadding got ");
            a4.append(Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
            throw new IllegalArgumentException(a4.toString());
        } else if (!keyGenParameterSpec.isUserAuthenticationRequired() || keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() >= 1) {
            String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
            String str = "AndroidKeyStore";
            KeyStore instance = KeyStore.getInstance(str);
            instance.load(null);
            if (!instance.containsAlias(keystoreAlias)) {
                try {
                    KeyGenerator instance2 = KeyGenerator.getInstance("AES", str);
                    instance2.init(keyGenParameterSpec);
                    instance2.generateKey();
                } catch (ProviderException e) {
                    throw new GeneralSecurityException(e.getMessage(), e);
                }
            }
            return keyGenParameterSpec.getKeystoreAlias();
        } else {
            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
        }
    }
}
