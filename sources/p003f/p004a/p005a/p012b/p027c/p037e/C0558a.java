package p003f.p004a.p005a.p012b.p027c.p037e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import p003f.p004a.p005a.p012b.p027c.p030c.C0549b;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;

/* renamed from: f.a.a.b.c.e.a */
public final class C0558a implements C0549b {

    /* renamed from: a */
    public final Context f1982a;

    public C0558a(Context context) {
        if (context != null) {
            this.f1982a = context;
        } else {
            C4638h.m10271a("context");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3766a(String str) {
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
            this.f1982a.startActivity(new Intent("android.intent.action.VIEW", uri));
            return;
        }
        C4638h.m10271a("url");
        throw null;
    }
}
