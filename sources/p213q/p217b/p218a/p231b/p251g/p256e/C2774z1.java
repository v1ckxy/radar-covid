package p213q.p217b.p218a.p231b.p251g.p256e;

import android.net.Uri;
import p124p.p143e.C1248a;

/* renamed from: q.b.a.b.g.e.z1 */
public final class C2774z1 {

    /* renamed from: a */
    public static final C1248a<String, Uri> f7004a = new C1248a<>();

    /* renamed from: a */
    public static synchronized Uri m6581a(String str) {
        Uri uri;
        synchronized (C2774z1.class) {
            uri = (Uri) f7004a.getOrDefault(str, null);
            if (uri == null) {
                String str2 = "content://com.google.android.gms.phenotype/";
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                f7004a.put(str, uri);
            }
        }
        return uri;
    }
}
