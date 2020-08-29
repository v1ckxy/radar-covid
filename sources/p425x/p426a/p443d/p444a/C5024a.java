package p425x.p426a.p443d.p444a;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p427a.C4967n;
import p425x.p426a.p427a.p429d2.C4932a;
import p425x.p426a.p427a.p432g2.C4945a;
import p425x.p426a.p437c.p438a.p439a.C5019a;
import p425x.p426a.p437c.p438a.p440b.p441a.C5021a;
import p425x.p426a.p437c.p438a.p442c.C5022a;
import p425x.p426a.p437c.p438a.p442c.C5023b;
import p425x.p426a.p445e.p446a.C5031e;
import p425x.p426a.p445e.p456c.p458b.p459c.C5128c;
import p425x.p426a.p445e.p456c.p458b.p460d.C5133e;
import p425x.p426a.p445e.p456c.p458b.p460d.C5134f;
import p425x.p426a.p445e.p456c.p458b.p461e.C5137c;
import p425x.p426a.p445e.p456c.p458b.p462f.C5140c;
import p425x.p426a.p445e.p456c.p458b.p463g.C5143c;
import p425x.p426a.p445e.p456c.p458b.p464h.C5146c;
import p425x.p426a.p445e.p456c.p458b.p465i.C5151e;
import p425x.p426a.p445e.p456c.p458b.p465i.C5152f;

/* renamed from: x.a.d.a.a */
public final class C5024a extends Provider implements C5019a {

    /* renamed from: e */
    public static final Map f11956e = new HashMap();

    /* renamed from: f */
    public static final String[] f11957f = {"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};

    /* renamed from: g */
    public static final String[] f11958g = {"SipHash", "SipHash128", "Poly1305"};

    /* renamed from: h */
    public static final String[] f11959h = {"AES", "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624", "GOST3412_2015", "Zuc"};

    /* renamed from: i */
    public static final String[] f11960i = {"X509", "IES"};

    /* renamed from: j */
    public static final String[] f11961j = {"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC"};

    /* renamed from: k */
    public static final String[] f11962k = {"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka"};

    /* renamed from: l */
    public static final String[] f11963l = {"BC", "BCFKS", "PKCS12"};

    /* renamed from: m */
    public static final String[] f11964m = {"DRBG"};

    /* renamed from: x.a.d.a.a$a */
    public class C5025a implements PrivilegedAction {
        public C5025a() {
        }

        public Object run() {
            C5024a aVar = C5024a.this;
            aVar.mo11698a("org.bouncycastle.jcajce.provider.digest.", C5024a.f11962k);
            String str = "org.bouncycastle.jcajce.provider.symmetric.";
            aVar.mo11698a(str, C5024a.f11957f);
            aVar.mo11698a(str, C5024a.f11958g);
            aVar.mo11698a(str, C5024a.f11959h);
            String str2 = "org.bouncycastle.jcajce.provider.asymmetric.";
            aVar.mo11698a(str2, C5024a.f11960i);
            aVar.mo11698a(str2, C5024a.f11961j);
            aVar.mo11698a("org.bouncycastle.jcajce.provider.keystore.", C5024a.f11963l);
            aVar.mo11698a("org.bouncycastle.jcajce.provider.drbg.", C5024a.f11964m);
            aVar.mo11699a(C5031e.f11990e, (C5023b) new C5146c());
            aVar.mo11699a(C5031e.f11991f, (C5023b) new C5137c());
            aVar.mo11699a(C5031e.f11992g, (C5023b) new C5151e());
            aVar.mo11699a(C4932a.f11768a, (C5023b) new C5151e());
            aVar.mo11699a(C5031e.f11997l, (C5023b) new C5152f());
            aVar.mo11699a(C4932a.f11769b, (C5023b) new C5152f());
            aVar.mo11699a(C5031e.f11988c, (C5023b) new C5134f());
            aVar.mo11699a(C5031e.f11989d, (C5023b) new C5133e());
            aVar.mo11699a(C5031e.f11986a, (C5023b) new C5143c());
            aVar.mo11699a(C5031e.f12002q, (C5023b) new C5140c());
            aVar.mo11699a(C5031e.f12003r, (C5023b) new C5140c());
            aVar.mo11699a(C4945a.f11809l, (C5023b) new C5128c());
            aVar.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
            aVar.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
            aVar.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
            aVar.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
            aVar.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
            aVar.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
            aVar.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
            aVar.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
            aVar.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
            aVar.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
            aVar.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
            aVar.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
            aVar.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
            aVar.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
            aVar.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
            aVar.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
            aVar.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
            String str3 = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi";
            aVar.put("CertPathValidator.RFC3280", str3);
            String str4 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi";
            aVar.put("CertPathBuilder.RFC3280", str4);
            aVar.put("CertPathValidator.PKIX", str3);
            aVar.put("CertPathBuilder.PKIX", str4);
            aVar.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
            aVar.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
            aVar.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
            aVar.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
            return null;
        }
    }

    static {
        new C5026b();
    }

    public C5024a() {
        super("BC", 1.65d, "BouncyCastle Security Provider v1.65");
        AccessController.doPrivileged(new C5025a());
    }

    /* renamed from: a */
    public final void mo11698a(String str, String[] strArr) {
        Class cls;
        for (int i = 0; i != strArr.length; i++) {
            Class<C5024a> cls2 = C5024a.class;
            String a = C1965a.m4754a(C1965a.m4756a(str), strArr[i], "$Mappings");
            try {
                ClassLoader classLoader = cls2.getClassLoader();
                cls = classLoader != null ? classLoader.loadClass(a) : (Class) AccessController.doPrivileged(new C5021a(a));
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            if (cls != null) {
                try {
                    ((C5022a) cls.newInstance()).mo11697a(this);
                } catch (Exception e) {
                    StringBuilder b = C1965a.m4763b("cannot create instance of ", str);
                    b.append(strArr[i]);
                    b.append("$Mappings : ");
                    b.append(e);
                    throw new InternalError(b.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo11699a(C4967n nVar, C5023b bVar) {
        synchronized (f11956e) {
            f11956e.put(nVar, bVar);
        }
    }
}
