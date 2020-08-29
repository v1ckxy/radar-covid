package p213q.p217b.p301c.p302a.p307g0.p308a;

import android.annotation.TargetApi;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p301c.p302a.C3499a;

@TargetApi(23)
/* renamed from: q.b.c.a.g0.a.b */
public final class C3558b implements C3499a {

    /* renamed from: a */
    public final SecretKey f8942a;

    public C3558b(String str) {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load(null);
        SecretKey secretKey = (SecretKey) instance.getKey(str, null);
        this.f8942a = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException(C1965a.m4751a("Keystore cannot load the key with ID: ", str));
        }
    }

    /* renamed from: a */
    public byte[] mo9453a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.f8942a);
            instance.updateAAD(bArr2);
            instance.doFinal(bArr, 0, bArr.length, bArr3, 12);
            System.arraycopy(instance.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: b */
    public byte[] mo9454b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, this.f8942a, gCMParameterSpec);
            instance.updateAAD(bArr2);
            return instance.doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
