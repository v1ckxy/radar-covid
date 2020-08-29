package p213q.p217b.p218a.p231b.p232a.p233a;

import android.net.Uri;
import android.net.Uri.Builder;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.a.b.a.a.b */
public final class C2108b extends Thread {

    /* renamed from: e */
    public final /* synthetic */ Map f5966e;

    public C2108b(Map map) {
        this.f5966e = map;
    }

    public final void run() {
        StringBuilder sb;
        String str;
        String str2;
        HttpURLConnection httpURLConnection;
        String str3 = ". ";
        String str4 = "HttpUrlPinger";
        Map map = this.f5966e;
        Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str5 : map.keySet()) {
            buildUpon.appendQueryParameter(str5, (String) map.get(str5));
        }
        String uri = buildUpon.build().toString();
        try {
            httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 65);
                sb2.append("Received non-success response code ");
                sb2.append(responseCode);
                sb2.append(" from pinging URL: ");
                sb2.append(uri);
                Log.w(str4, sb2.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            str2 = e.getMessage();
            sb = new StringBuilder(C1965a.m4743a(str2, C1965a.m4743a(uri, 32)));
            str = "Error while parsing ping URL: ";
            r3 = e;
            sb.append(str);
            sb.append(uri);
            sb.append(str3);
            sb.append(str2);
            Log.w(str4, sb.toString(), r3);
        } catch (IOException | RuntimeException e2) {
            str2 = e2.getMessage();
            sb = new StringBuilder(C1965a.m4743a(str2, C1965a.m4743a(uri, 27)));
            str = "Error while pinging URL: ";
            r3 = e2;
            sb.append(str);
            sb.append(uri);
            sb.append(str3);
            sb.append(str2);
            Log.w(str4, sb.toString(), r3);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
