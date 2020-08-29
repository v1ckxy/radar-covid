package p003f.p004a.p005a.p012b.p062i.p066d;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import p003f.p004a.p005a.p006a.p011e.C0500a;
import p003f.p004a.p005a.p012b.p062i.p065c.C0609b;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;

/* renamed from: f.a.a.b.i.d.a */
public final class C0611a implements C0609b {

    /* renamed from: a */
    public final Fragment f2047a;

    /* renamed from: b */
    public final C0500a f2048b;

    public C0611a(Fragment fragment, C0500a aVar) {
        if (fragment == null) {
            C4638h.m10271a("fragment");
            throw null;
        } else if (aVar != null) {
            this.f2047a = fragment;
            this.f2048b = aVar;
        } else {
            C4638h.m10271a("labelManager");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3810a() {
        String str;
        Uri uri;
        Fragment fragment = this.f2047a;
        String obj = this.f2048b.mo3714a("USE_CONDITIONS_URL", (CharSequence) "https://radarcovid.covid19.gob.es/terms-of-service/use-conditions.html").toString();
        String str2 = "http://";
        if (C4681g.m10318a((CharSequence) obj, (CharSequence) str2, false, 2) || C4681g.m10318a((CharSequence) obj, (CharSequence) "https://", false, 2)) {
            uri = Uri.parse(obj);
            str = "Uri.parse(url)";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(obj);
            uri = Uri.parse(sb.toString());
            str = "Uri.parse(\"http://$url\")";
        }
        C4638h.m10270a((Object) uri, str);
        fragment.mo791a(new Intent("android.intent.action.VIEW", uri));
    }

    /* renamed from: b */
    public void mo3811b() {
        String str;
        Uri uri;
        Fragment fragment = this.f2047a;
        String obj = this.f2048b.mo3714a("PRIVACY_POLICY_URL", (CharSequence) "https://radarcovid.covid19.gob.es/terms-of-service/privacy-policy.html").toString();
        String str2 = "http://";
        if (C4681g.m10318a((CharSequence) obj, (CharSequence) str2, false, 2) || C4681g.m10318a((CharSequence) obj, (CharSequence) "https://", false, 2)) {
            uri = Uri.parse(obj);
            str = "Uri.parse(url)";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(obj);
            uri = Uri.parse(sb.toString());
            str = "Uri.parse(\"http://$url\")";
        }
        C4638h.m10270a((Object) uri, str);
        fragment.mo791a(new Intent("android.intent.action.VIEW", uri));
    }
}
