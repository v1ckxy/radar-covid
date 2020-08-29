package p213q.p217b.p301c.p302a.p307g0.p308a;

import android.content.Context;
import android.util.Log;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.Keyset.Builder;
import java.security.GeneralSecurityException;
import javax.annotation.concurrent.GuardedBy;
import p213q.p217b.p301c.p302a.C3499a;
import p213q.p217b.p301c.p302a.C3562h;
import p213q.p217b.p301c.p302a.C3587j;
import p213q.p217b.p301c.p302a.C3740k;
import p213q.p217b.p301c.p302a.C3766l;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3606c0;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3697r;

/* renamed from: q.b.c.a.g0.a.a */
public final class C3555a {

    /* renamed from: a */
    public final C3560d f8930a;

    /* renamed from: b */
    public final C3766l f8931b;

    /* renamed from: c */
    public final boolean f8932c;

    /* renamed from: d */
    public final C3499a f8933d;

    /* renamed from: e */
    public final C3562h f8934e;
    @GuardedBy("this")

    /* renamed from: f */
    public C3740k f8935f;

    /* renamed from: q.b.c.a.g0.a.a$a */
    public static /* synthetic */ class C3556a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8936a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0015 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001c */
        static {
            /*
                com.google.crypto.tink.proto.OutputPrefixType[] r0 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8936a = r0
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch:{ NoSuchFieldError -> 0x000e }
                r1 = 1
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                int[] r0 = f8936a     // Catch:{ NoSuchFieldError -> 0x0015 }
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch:{ NoSuchFieldError -> 0x0015 }
                r1 = 2
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                int[] r0 = f8936a     // Catch:{ NoSuchFieldError -> 0x001c }
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch:{ NoSuchFieldError -> 0x001c }
                r1 = 3
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                int[] r0 = f8936a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x0023 }
                r1 = 4
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p307g0.p308a.C3555a.C3556a.<clinit>():void");
        }
    }

    /* renamed from: q.b.c.a.g0.a.a$b */
    public static final class C3557b {

        /* renamed from: a */
        public C3560d f8937a = null;

        /* renamed from: b */
        public C3766l f8938b = null;

        /* renamed from: c */
        public String f8939c = null;

        /* renamed from: d */
        public boolean f8940d = true;

        /* renamed from: e */
        public C3562h f8941e = null;

        /* renamed from: a */
        public C3557b mo9475a(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            } else if (str != null) {
                this.f8937a = new C3560d(context, str, str2);
                this.f8938b = new C3561e(context, str, str2);
                return this;
            } else {
                throw new IllegalArgumentException("need a keyset name");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ce, code lost:
        if (r0 == false) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C3555a(p213q.p217b.p301c.p302a.p307g0.p308a.C3555a.C3557b r11, p213q.p217b.p301c.p302a.p307g0.p308a.C3555a.C3556a r12) {
        /*
            r10 = this;
            java.lang.String r12 = "a"
            r10.<init>()
            q.b.c.a.g0.a.d r0 = r11.f8937a
            r10.f8930a = r0
            if (r0 == 0) goto L_0x017e
            q.b.c.a.l r0 = r11.f8938b
            r10.f8931b = r0
            if (r0 == 0) goto L_0x0176
            boolean r0 = r11.f8940d
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = r11.f8939c
            if (r0 == 0) goto L_0x001a
            goto L_0x0022
        L_0x001a:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "need a master key URI, please set it with Builder#masterKeyUri"
            r11.<init>(r12)
            throw r11
        L_0x0022:
            boolean r0 = r11.f8940d
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = "android-keystore://"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b8 }
            r4.<init>()     // Catch:{ Exception -> 0x00b8 }
            r4.append(r0)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x00b8 }
            r6 = 16
            byte[] r6 = p213q.p217b.p301c.p302a.p315m0.C3806h0.m9148a(r6)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r7 = "UTF-8"
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)     // Catch:{ Exception -> 0x00b8 }
            r5.<init>(r6, r7)     // Catch:{ Exception -> 0x00b8 }
            r4.append(r5)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00b8 }
            q.b.c.a.a r5 = p213q.p217b.p301c.p302a.p307g0.p308a.C3559c.m8089c(r4)     // Catch:{ Exception -> 0x00b8 }
            byte[] r6 = new byte[r3]     // Catch:{ Exception -> 0x00b8 }
            byte[] r7 = new byte[r3]     // Catch:{ Exception -> 0x00b8 }
            byte[] r6 = r5.mo9453a(r6, r7)     // Catch:{ Exception -> 0x00b8 }
            byte[] r6 = r5.mo9454b(r6, r7)     // Catch:{ Exception -> 0x00b8 }
            int r6 = r6.length     // Catch:{ Exception -> 0x00b8 }
            if (r6 == 0) goto L_0x0061
            java.lang.String r0 = "cannot use Android Keystore: encryption/decryption of empty message and empty aad returns incorrect results"
            goto L_0x00a2
        L_0x0061:
            r6 = 10
            byte[] r7 = p213q.p217b.p301c.p302a.p315m0.C3806h0.m9148a(r6)     // Catch:{ Exception -> 0x00b8 }
            byte[] r8 = new byte[r3]     // Catch:{ Exception -> 0x00b8 }
            byte[] r9 = r5.mo9453a(r7, r8)     // Catch:{ Exception -> 0x00b8 }
            byte[] r8 = r5.mo9454b(r9, r8)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r8 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5310c(r8)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r7 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5310c(r7)     // Catch:{ Exception -> 0x00b8 }
            boolean r7 = r8.equals(r7)     // Catch:{ Exception -> 0x00b8 }
            if (r7 != 0) goto L_0x0082
            java.lang.String r0 = "cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns incorrect results"
            goto L_0x00a2
        L_0x0082:
            byte[] r7 = p213q.p217b.p301c.p302a.p315m0.C3806h0.m9148a(r6)     // Catch:{ Exception -> 0x00b8 }
            byte[] r6 = p213q.p217b.p301c.p302a.p315m0.C3806h0.m9148a(r6)     // Catch:{ Exception -> 0x00b8 }
            byte[] r8 = r5.mo9453a(r7, r6)     // Catch:{ Exception -> 0x00b8 }
            byte[] r5 = r5.mo9454b(r8, r6)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r5 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5310c(r5)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r6 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5310c(r7)     // Catch:{ Exception -> 0x00b8 }
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x00b8 }
            if (r5 != 0) goto L_0x00a6
            java.lang.String r0 = "cannot use Android Keystore: encryption/decryption of non-empty message and non-empty aad returns incorrect results"
        L_0x00a2:
            android.util.Log.i(r12, r0)     // Catch:{ Exception -> 0x00b8 }
            goto L_0x00cd
        L_0x00a6:
            java.lang.String r0 = p213q.p217b.p301c.p302a.p315m0.C3817m0.m9174a(r0, r4)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r4 = "AndroidKeyStore"
            java.security.KeyStore r4 = java.security.KeyStore.getInstance(r4)     // Catch:{ Exception -> 0x00b8 }
            r4.load(r2)     // Catch:{ Exception -> 0x00b8 }
            r4.deleteEntry(r0)     // Catch:{ Exception -> 0x00b8 }
            r0 = r1
            goto L_0x00ce
        L_0x00b8:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "cannot use Android Keystore: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.i(r12, r0)
        L_0x00cd:
            r0 = r3
        L_0x00ce:
            if (r0 == 0) goto L_0x00d1
            goto L_0x00d2
        L_0x00d1:
            r1 = r3
        L_0x00d2:
            r10.f8932c = r1
            boolean r0 = r10.mo9474c()
            if (r0 == 0) goto L_0x00e3
            java.lang.String r0 = r11.f8939c
            q.b.c.a.a r0 = p213q.p217b.p301c.p302a.p307g0.p308a.C3559c.m8089c(r0)
            r10.f8933d = r0
            goto L_0x00e5
        L_0x00e3:
            r10.f8933d = r2
        L_0x00e5:
            q.b.c.a.h r11 = r11.f8941e
            r10.f8934e = r11
            q.b.c.a.k r11 = r10.mo9473b()     // Catch:{ IOException -> 0x00ee }
            goto L_0x015c
        L_0x00ee:
            r11 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "cannot read keyset: "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            android.util.Log.i(r12, r11)
            q.b.c.a.h r11 = r10.f8934e
            if (r11 == 0) goto L_0x016e
            q.b.c.a.k r11 = new q.b.c.a.k
            com.google.crypto.tink.proto.Keyset$Builder r12 = com.google.crypto.tink.proto.Keyset.newBuilder()
            r11.<init>(r12)
            q.b.c.a.h r12 = r10.f8934e
            r11.mo10016a(r12)
            q.b.c.a.j r12 = r11.mo10015a()
            com.google.crypto.tink.proto.Keyset r12 = r12.f8967a
            com.google.crypto.tink.proto.KeysetInfo r12 = p213q.p217b.p301c.p302a.C3502b0.m7962a(r12)
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo r12 = r12.getKeyInfo(r3)
            int r12 = r12.getKeyId()
            r11.mo10019b(r12)
            boolean r12 = r10.mo9474c()     // Catch:{ IOException -> 0x0167 }
            if (r12 == 0) goto L_0x013c
            q.b.c.a.j r12 = r11.mo10015a()     // Catch:{ IOException -> 0x0167 }
            q.b.c.a.l r0 = r10.f8931b     // Catch:{ IOException -> 0x0167 }
            q.b.c.a.a r1 = r10.f8933d     // Catch:{ IOException -> 0x0167 }
            r12.mo9484a(r0, r1)     // Catch:{ IOException -> 0x0167 }
            goto L_0x015c
        L_0x013c:
            q.b.c.a.j r12 = r11.mo10015a()     // Catch:{ IOException -> 0x0167 }
            q.b.c.a.l r0 = r10.f8931b     // Catch:{ IOException -> 0x0167 }
            com.google.crypto.tink.proto.Keyset r12 = r12.f8967a     // Catch:{ IOException -> 0x0167 }
            q.b.c.a.g0.a.e r0 = (p213q.p217b.p301c.p302a.p307g0.p308a.C3561e) r0     // Catch:{ IOException -> 0x0167 }
            android.content.SharedPreferences$Editor r1 = r0.f8945a     // Catch:{ IOException -> 0x0167 }
            java.lang.String r0 = r0.f8946b     // Catch:{ IOException -> 0x0167 }
            byte[] r12 = r12.toByteArray()     // Catch:{ IOException -> 0x0167 }
            java.lang.String r12 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5310c(r12)     // Catch:{ IOException -> 0x0167 }
            android.content.SharedPreferences$Editor r12 = r1.putString(r0, r12)     // Catch:{ IOException -> 0x0167 }
            boolean r12 = r12.commit()     // Catch:{ IOException -> 0x0167 }
            if (r12 == 0) goto L_0x015f
        L_0x015c:
            r10.f8935f = r11
            return
        L_0x015f:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ IOException -> 0x0167 }
            java.lang.String r12 = "Failed to write to SharedPreferences"
            r11.<init>(r12)     // Catch:{ IOException -> 0x0167 }
            throw r11     // Catch:{ IOException -> 0x0167 }
        L_0x0167:
            r11 = move-exception
            java.security.GeneralSecurityException r12 = new java.security.GeneralSecurityException
            r12.<init>(r11)
            throw r12
        L_0x016e:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r12 = "cannot obtain keyset handle"
            r11.<init>(r12)
            throw r11
        L_0x0176:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "need to specify where to write the keyset to with Builder#withSharedPref"
            r11.<init>(r12)
            throw r11
        L_0x017e:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "need to specify where to read the keyset from with Builder#withSharedPref"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.p307g0.p308a.C3555a.<init>(q.b.c.a.g0.a.a$b, q.b.c.a.g0.a.a$a):void");
    }

    /* renamed from: a */
    public synchronized C3587j mo9472a() {
        return this.f8935f.mo10015a();
    }

    /* renamed from: b */
    public final C3740k mo9473b() {
        if (mo9474c()) {
            try {
                return new C3740k((Builder) C3587j.m8150a(this.f8930a, this.f8933d).f8967a.toBuilder());
            } catch (GeneralSecurityException | C3606c0 e) {
                StringBuilder sb = new StringBuilder();
                sb.append("cannot decrypt keyset: ");
                sb.append(e);
                Log.i("a", sb.toString());
            }
        }
        C3587j a = C3587j.m8149a(Keyset.parseFrom(this.f8930a.mo9476a(), C3697r.m8878a()));
        if (mo9474c()) {
            a.mo9484a(this.f8931b, this.f8933d);
        }
        return new C3740k((Builder) a.f8967a.toBuilder());
    }

    /* renamed from: c */
    public final boolean mo9474c() {
        return this.f8932c;
    }
}
