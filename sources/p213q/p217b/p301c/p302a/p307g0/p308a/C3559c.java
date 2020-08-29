package p213q.p217b.p301c.p302a.p307g0.p308a;

import android.annotation.TargetApi;
import android.security.keystore.KeyGenParameterSpec.Builder;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;
import p213q.p217b.p301c.p302a.C3499a;
import p213q.p217b.p301c.p302a.C3776m;
import p213q.p217b.p301c.p302a.p315m0.C3817m0;

@TargetApi(23)
/* renamed from: q.b.c.a.g0.a.c */
public final class C3559c implements C3776m {
    /* renamed from: c */
    public static C3499a m8089c(String str) {
        String str2 = "android-keystore://";
        String a = C3817m0.m9174a(str2, str);
        String str3 = "AndroidKeyStore";
        KeyStore instance = KeyStore.getInstance(str3);
        instance.load(null);
        if (!instance.containsAlias(a)) {
            String a2 = C3817m0.m9174a(str2, str);
            KeyGenerator instance2 = KeyGenerator.getInstance("AES", str3);
            instance2.init(new Builder(a2, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
            instance2.generateKey();
        }
        try {
            return new C3558b(C3817m0.m9174a(str2, str));
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
