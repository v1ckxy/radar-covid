package p213q.p217b.p317d.p350n.p351o;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import p116io.jsonwebtoken.lang.Objects;

/* renamed from: q.b.d.n.o.b */
public class C4295b {

    /* renamed from: c */
    public static final String[] f10330c = {"*", "FCM", "GCM", Objects.EMPTY_STRING};

    /* renamed from: a */
    public final SharedPreferences f10331a;

    /* renamed from: b */
    public final String f10332b;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
        if (r0.isEmpty() != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4295b(p213q.p217b.p317d.C3859c r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.mo10056a()
            android.content.Context r0 = r4.f9459a
            r1 = 0
            java.lang.String r2 = "com.google.android.gms.appid"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r1)
            r3.f10331a = r0
            r4.mo10056a()
            q.b.d.e r0 = r4.f9461c
            java.lang.String r0 = r0.f9475e
            if (r0 == 0) goto L_0x001b
            goto L_0x004a
        L_0x001b:
            r4.mo10056a()
            q.b.d.e r4 = r4.f9461c
            java.lang.String r0 = r4.f9472b
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L_0x0033
            java.lang.String r4 = "2:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L_0x0033
            goto L_0x004a
        L_0x0033:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r0.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L_0x0040
        L_0x003e:
            r0 = r2
            goto L_0x004a
        L_0x0040:
            r0 = 1
            r0 = r4[r0]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x004a
            goto L_0x003e
        L_0x004a:
            r3.f10332b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p350n.p351o.C4295b.<init>(q.b.d.c):void");
    }

    /* renamed from: a */
    public String mo10507a() {
        synchronized (this.f10331a) {
            String b = mo10508b();
            if (b != null) {
                return b;
            }
            String c = mo10509c();
            return c;
        }
    }

    /* renamed from: b */
    public final String mo10508b() {
        String string;
        synchronized (this.f10331a) {
            string = this.f10331a.getString("|S|id", null);
        }
        return string;
    }

    /* renamed from: c */
    public final String mo10509c() {
        String str;
        PublicKey publicKey;
        synchronized (this.f10331a) {
            str = null;
            String string = this.f10331a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid key stored ");
                sb.append(e);
                Log.w("ContentValues", sb.toString());
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
        if (r5.startsWith(p116io.jsonwebtoken.lang.Objects.ARRAY_START) == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r4 = new org.json.JSONObject(r5).getString("token");
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo10510d() {
        /*
            r9 = this;
            android.content.SharedPreferences r0 = r9.f10331a
            monitor-enter(r0)
            java.lang.String[] r1 = f10330c     // Catch:{ all -> 0x0050 }
            int r2 = r1.length     // Catch:{ all -> 0x0050 }
            r3 = 0
        L_0x0007:
            r4 = 0
            if (r3 >= r2) goto L_0x004e
            r5 = r1[r3]     // Catch:{ all -> 0x0050 }
            java.lang.String r6 = r9.f10332b     // Catch:{ all -> 0x0050 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r7.<init>()     // Catch:{ all -> 0x0050 }
            java.lang.String r8 = "|T|"
            r7.append(r8)     // Catch:{ all -> 0x0050 }
            r7.append(r6)     // Catch:{ all -> 0x0050 }
            java.lang.String r6 = "|"
            r7.append(r6)     // Catch:{ all -> 0x0050 }
            r7.append(r5)     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0050 }
            android.content.SharedPreferences r6 = r9.f10331a     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = r6.getString(r5, r4)     // Catch:{ all -> 0x0050 }
            if (r5 == 0) goto L_0x004b
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x0050 }
            if (r6 != 0) goto L_0x004b
            java.lang.String r1 = "{"
            boolean r1 = r5.startsWith(r1)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0049
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0048 }
            r1.<init>(r5)     // Catch:{ JSONException -> 0x0048 }
            java.lang.String r2 = "token"
            java.lang.String r4 = r1.getString(r2)     // Catch:{ JSONException -> 0x0048 }
        L_0x0048:
            r5 = r4
        L_0x0049:
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return r5
        L_0x004b:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return r4
        L_0x0050:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p350n.p351o.C4295b.mo10510d():java.lang.String");
    }
}
