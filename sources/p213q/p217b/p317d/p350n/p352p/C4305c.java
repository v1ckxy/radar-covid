package p213q.p217b.p317d.p350n.p352p;

import android.content.Context;
import android.util.JsonReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p317d.p346k.C4212c;
import p213q.p217b.p317d.p350n.p352p.C4302b.C4304b;
import p213q.p217b.p317d.p350n.p352p.C4306d.C4307a;
import p213q.p217b.p317d.p350n.p352p.C4308e.C4309a;
import p213q.p217b.p317d.p350n.p352p.C4308e.C4310b;
import p213q.p217b.p317d.p354p.C4317f;

/* renamed from: q.b.d.n.p.c */
public class C4305c {

    /* renamed from: d */
    public static final Pattern f10352d = Pattern.compile("[0-9]+s");

    /* renamed from: e */
    public static final Charset f10353e = Charset.forName("UTF-8");

    /* renamed from: a */
    public final Context f10354a;

    /* renamed from: b */
    public final C4317f f10355b;

    /* renamed from: c */
    public final C4212c f10356c;

    public C4305c(Context context, C4317f fVar, C4212c cVar) {
        this.f10354a = context;
        this.f10355b = fVar;
        this.f10356c = cVar;
    }

    /* renamed from: a */
    public static long m9820a(String str) {
        C1061o.m2508a(f10352d.matcher(str).matches(), (Object) "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m9821a(java.net.HttpURLConnection r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            java.io.InputStream r0 = r10.getErrorStream()
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 3
            if (r0 != 0) goto L_0x000c
            goto L_0x0050
        L_0x000c:
            java.io.BufferedReader r6 = new java.io.BufferedReader
            java.io.InputStreamReader r7 = new java.io.InputStreamReader
            java.nio.charset.Charset r8 = f10353e
            r7.<init>(r0, r8)
            r6.<init>(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r0.<init>()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
        L_0x001d:
            java.lang.String r7 = r6.readLine()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            if (r7 == 0) goto L_0x002c
            r0.append(r7)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r7 = 10
            r0.append(r7)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            goto L_0x001d
        L_0x002c:
            java.lang.String r7 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            int r9 = r10.getResponseCode()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r4] = r9     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.String r10 = r10.getResponseMessage()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r3] = r10     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r2] = r0     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.String r10 = java.lang.String.format(r7, r8)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r1 = r10
            goto L_0x004d
        L_0x0048:
            r10 = move-exception
            r6.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            throw r10
        L_0x004d:
            r6.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            boolean r10 = android.text.TextUtils.isEmpty(r1)
            if (r10 != 0) goto L_0x007b
            java.lang.String r10 = "Firebase-Installations"
            android.util.Log.w(r10, r1)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r12
            r0[r3] = r13
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L_0x006a
            java.lang.String r11 = ""
            goto L_0x0070
        L_0x006a:
            java.lang.String r12 = ", "
            java.lang.String r11 = p213q.p214a.p215a.p216a.C1965a.m4751a(r12, r11)
        L_0x0070:
            r0[r2] = r11
            java.lang.String r11 = "Firebase options used while communicating with Firebase server APIs: %s, %s%s"
            java.lang.String r11 = java.lang.String.format(r11, r0)
            android.util.Log.w(r10, r11)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p350n.p352p.C4305c.m9821a(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static void m9822a(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    /* renamed from: b */
    public final C4308e mo10526b(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f10353e));
        C4309a a = C4308e.m9828a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                ((C4304b) a).f10349a = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                a.mo10521a(m9820a(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        C4304b bVar = (C4304b) a;
        bVar.f10351c = C4310b.OK;
        return bVar.mo10522a();
    }

    /* renamed from: c */
    public final void mo10527c(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:16.3.2");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            m9822a((URLConnection) httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x009a A[Catch:{ NameNotFoundException -> 0x00df }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b5 A[Catch:{ NameNotFoundException -> 0x00df }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.net.HttpURLConnection mo10523a(java.net.URL r9, java.lang.String r10) {
        /*
            r8 = this;
            java.net.URLConnection r9 = r9.openConnection()
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9
            r0 = 10000(0x2710, float:1.4013E-41)
            r9.setConnectTimeout(r0)
            r1 = 0
            r9.setUseCaches(r1)
            r9.setReadTimeout(r0)
            java.lang.String r0 = "application/json"
            java.lang.String r2 = "Content-Type"
            r9.addRequestProperty(r2, r0)
            java.lang.String r2 = "Accept"
            r9.addRequestProperty(r2, r0)
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r2 = "gzip"
            r9.addRequestProperty(r0, r2)
            java.lang.String r0 = "Cache-Control"
            java.lang.String r2 = "no-cache"
            r9.addRequestProperty(r0, r2)
            android.content.Context r0 = r8.f10354a
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r2 = "X-Android-Package"
            r9.addRequestProperty(r2, r0)
            q.b.d.k.c r0 = r8.f10356c
            if (r0 == 0) goto L_0x005f
            q.b.d.p.f r2 = r8.f10355b
            if (r2 == 0) goto L_0x005f
            java.lang.String r2 = "fire-installations-id"
            q.b.d.k.c$a r0 = r0.mo10394a(r2)
            q.b.d.k.c$a r2 = p213q.p217b.p317d.p346k.C4212c.C4213a.NONE
            if (r0 == r2) goto L_0x005f
            q.b.d.p.f r2 = r8.f10355b
            java.lang.String r2 = r2.mo10531a()
            java.lang.String r3 = "x-firebase-client"
            r9.addRequestProperty(r3, r2)
            int r0 = r0.f10157e
            java.lang.String r0 = java.lang.Integer.toString(r0)
            java.lang.String r2 = "x-firebase-client-log-type"
            r9.addRequestProperty(r2, r0)
        L_0x005f:
            java.lang.String r0 = "ContentValues"
            r2 = 0
            android.content.Context r3 = r8.f10354a     // Catch:{ NameNotFoundException -> 0x00df }
            android.content.Context r4 = r8.f10354a     // Catch:{ NameNotFoundException -> 0x00df }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x00df }
            q.b.a.b.d.r.a r3 = p213q.p217b.p218a.p231b.p239d.p248r.C2294b.m5363b(r3)     // Catch:{ NameNotFoundException -> 0x00df }
            android.content.Context r3 = r3.f6270a     // Catch:{ NameNotFoundException -> 0x00df }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00df }
            r5 = 64
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x00df }
            android.content.pm.Signature[] r4 = r3.signatures     // Catch:{ NameNotFoundException -> 0x00df }
            if (r4 == 0) goto L_0x0097
            int r4 = r4.length     // Catch:{ NameNotFoundException -> 0x00df }
            r5 = 1
            if (r4 != r5) goto L_0x0097
            java.lang.String r4 = "SHA1"
            java.security.MessageDigest r4 = p213q.p217b.p218a.p231b.p239d.p246q.C2282a.m5136a(r4)     // Catch:{ NameNotFoundException -> 0x00df }
            if (r4 == 0) goto L_0x0097
            android.content.pm.Signature[] r3 = r3.signatures     // Catch:{ NameNotFoundException -> 0x00df }
            r3 = r3[r1]     // Catch:{ NameNotFoundException -> 0x00df }
            byte[] r3 = r3.toByteArray()     // Catch:{ NameNotFoundException -> 0x00df }
            byte[] r3 = r4.digest(r3)     // Catch:{ NameNotFoundException -> 0x00df }
            goto L_0x0098
        L_0x0097:
            r3 = r2
        L_0x0098:
            if (r3 != 0) goto L_0x00b5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x00df }
            r1.<init>()     // Catch:{ NameNotFoundException -> 0x00df }
            java.lang.String r3 = "Could not get fingerprint hash for package: "
            r1.append(r3)     // Catch:{ NameNotFoundException -> 0x00df }
            android.content.Context r3 = r8.f10354a     // Catch:{ NameNotFoundException -> 0x00df }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x00df }
            r1.append(r3)     // Catch:{ NameNotFoundException -> 0x00df }
            java.lang.String r1 = r1.toString()     // Catch:{ NameNotFoundException -> 0x00df }
            android.util.Log.e(r0, r1)     // Catch:{ NameNotFoundException -> 0x00df }
            goto L_0x00f6
        L_0x00b5:
            int r4 = r3.length     // Catch:{ NameNotFoundException -> 0x00df }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x00df }
            int r6 = r4 << 1
            r5.<init>(r6)     // Catch:{ NameNotFoundException -> 0x00df }
        L_0x00bd:
            if (r1 >= r4) goto L_0x00da
            char[] r6 = p213q.p217b.p218a.p231b.p239d.p246q.C2285d.f6250a     // Catch:{ NameNotFoundException -> 0x00df }
            byte r7 = r3[r1]     // Catch:{ NameNotFoundException -> 0x00df }
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >>> 4
            char r6 = r6[r7]     // Catch:{ NameNotFoundException -> 0x00df }
            r5.append(r6)     // Catch:{ NameNotFoundException -> 0x00df }
            char[] r6 = p213q.p217b.p218a.p231b.p239d.p246q.C2285d.f6250a     // Catch:{ NameNotFoundException -> 0x00df }
            byte r7 = r3[r1]     // Catch:{ NameNotFoundException -> 0x00df }
            r7 = r7 & 15
            char r6 = r6[r7]     // Catch:{ NameNotFoundException -> 0x00df }
            r5.append(r6)     // Catch:{ NameNotFoundException -> 0x00df }
            int r1 = r1 + 1
            goto L_0x00bd
        L_0x00da:
            java.lang.String r2 = r5.toString()     // Catch:{ NameNotFoundException -> 0x00df }
            goto L_0x00f6
        L_0x00df:
            r1 = move-exception
            java.lang.String r3 = "No such package: "
            java.lang.StringBuilder r3 = p213q.p214a.p215a.p216a.C1965a.m4756a(r3)
            android.content.Context r4 = r8.f10354a
            java.lang.String r4 = r4.getPackageName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r0, r3, r1)
        L_0x00f6:
            java.lang.String r0 = "X-Android-Cert"
            r9.addRequestProperty(r0, r2)
            java.lang.String r0 = "x-goog-api-key"
            r9.addRequestProperty(r0, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p350n.p352p.C4305c.mo10523a(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }

    /* renamed from: a */
    public final C4306d mo10524a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f10353e));
        C4309a a = C4308e.m9828a();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        C4308e eVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        ((C4304b) a).f10349a = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        a.mo10521a(m9820a(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                eVar = a.mo10522a();
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        C4300a aVar = new C4300a(str, str2, str3, eVar, C4307a.OK, null);
        return aVar;
    }

    /* renamed from: a */
    public final void mo10525a(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:16.3.2");
            m9822a((URLConnection) httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }
}
