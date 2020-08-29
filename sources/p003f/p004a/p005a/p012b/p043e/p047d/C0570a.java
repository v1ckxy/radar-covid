package p003f.p004a.p005a.p012b.p043e.p047d;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import p003f.p004a.p005a.p012b.p043e.p046c.C0568b;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;

/* renamed from: f.a.a.b.e.d.a */
public final class C0570a implements C0568b {

    /* renamed from: a */
    public final Activity f1986a;

    public C0570a(Activity activity) {
        if (activity != null) {
            this.f1986a = activity;
        } else {
            C4638h.m10271a("activity");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3778a(String str) {
        Uri uri;
        String str2;
        if (str != null) {
            String str3 = "http://";
            if (C4681g.m10318a((CharSequence) str, (CharSequence) str3, false, 2) || C4681g.m10318a((CharSequence) str, (CharSequence) "https://", false, 2)) {
                uri = Uri.parse(str);
                str2 = "Uri.parse(url)";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(str);
                uri = Uri.parse(sb.toString());
                str2 = "Uri.parse(\"http://$url\")";
            }
            C4638h.m10270a((Object) uri, str2);
            this.f1986a.startActivity(new Intent("android.intent.action.VIEW", uri));
            return;
        }
        C4638h.m10271a("url");
        throw null;
    }
}
