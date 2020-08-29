package p213q.p217b.p317d.p347l;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import p124p.p143e.C1248a;
import p124p.p150h.p152e.C1325a;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.d.l.a0 */
public final class C4216a0 {

    /* renamed from: a */
    public final SharedPreferences f10160a;

    /* renamed from: b */
    public final Context f10161b;

    /* renamed from: c */
    public final Map<String, Long> f10162c = new C1248a();

    public C4216a0(Context context) {
        String str = "FirebaseInstanceId";
        this.f10161b = context;
        this.f10160a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(C1325a.m3375a(this.f10161b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !mo10403b()) {
                    Log.i(str, "App restored, clearing state");
                    mo10400a();
                    FirebaseInstanceId.m1141g().mo3055b();
                }
            } catch (IOException e) {
                if (Log.isLoggable(str, 3)) {
                    String str2 = "Error creating file in no backup dir: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            }
        }
    }

    /* renamed from: a */
    public static String m9693a(String str, String str2) {
        return C1965a.m4745a(C1965a.m4743a(str2, C1965a.m4743a(str, 3)), str, "|S|", str2);
    }

    /* renamed from: b */
    public static String m9694b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(C1965a.m4743a(str3, C1965a.m4743a(str2, C1965a.m4743a(str, 4))));
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: a */
    public final synchronized long mo10398a(String str) {
        long currentTimeMillis;
        currentTimeMillis = System.currentTimeMillis();
        if (!this.f10160a.contains(m9693a(str, "cre"))) {
            Editor edit = this.f10160a.edit();
            edit.putString(m9693a(str, "cre"), String.valueOf(currentTimeMillis));
            edit.commit();
        } else {
            String string = this.f10160a.getString(m9693a(str, "cre"), null);
            if (string != null) {
                try {
                    currentTimeMillis = Long.parseLong(string);
                } catch (NumberFormatException unused) {
                }
            }
            currentTimeMillis = 0;
        }
        this.f10162c.put(str, Long.valueOf(currentTimeMillis));
        return currentTimeMillis;
    }

    /* renamed from: a */
    public final synchronized C4272z mo10399a(String str, String str2, String str3) {
        return C4272z.m9766a(this.f10160a.getString(m9694b(str, str2, str3), null));
    }

    /* renamed from: a */
    public final synchronized void mo10400a() {
        this.f10162c.clear();
        this.f10160a.edit().clear().commit();
    }

    /* renamed from: a */
    public final synchronized void mo10401a(String str, String str2, String str3, String str4, String str5) {
        String a = C4272z.m9765a(str4, str5, System.currentTimeMillis());
        if (a != null) {
            Editor edit = this.f10160a.edit();
            edit.putString(m9694b(str, str2, str3), a);
            edit.commit();
        }
    }

    /* renamed from: b */
    public final synchronized void mo10402b(String str) {
        String concat = String.valueOf(str).concat("|T|");
        Editor edit = this.f10160a.edit();
        for (String str2 : this.f10160a.getAll().keySet()) {
            if (str2.startsWith(concat)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    /* renamed from: b */
    public final synchronized boolean mo10403b() {
        return this.f10160a.getAll().isEmpty();
    }
}
