package p003f.p004a.p005a.p012b.p027c.p031d.p035d;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import p003f.p004a.p005a.p012b.p027c.p031d.p034c.C0554b;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;

/* renamed from: f.a.a.b.c.d.d.a */
public final class C0556a implements C0554b {

    /* renamed from: a */
    public final Context f1980a;

    public C0556a(Context context) {
        if (context != null) {
            this.f1980a = context;
        } else {
            C4638h.m10271a("context");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3771a(String str) {
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
            this.f1980a.startActivity(new Intent("android.intent.action.VIEW", uri));
            return;
        }
        C4638h.m10271a("url");
        throw null;
    }

    /* renamed from: b */
    public void mo3772b(String str) {
        if (str != null) {
            Context context = this.f1980a;
            Intent intent = new Intent("android.intent.action.DIAL");
            StringBuilder sb = new StringBuilder();
            sb.append("tel:");
            sb.append(str);
            intent.setData(Uri.parse(sb.toString()));
            context.startActivity(intent);
            return;
        }
        C4638h.m10271a("phone");
        throw null;
    }
}
