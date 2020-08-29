package p213q.p217b.p317d.p322h.p323e.p326k;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import p116io.jsonwebtoken.lang.Objects;
import p116io.jsonwebtoken.lang.Strings;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p347l.p348b.C4218a;

/* renamed from: q.b.d.h.e.k.q0 */
public class C3970q0 implements C3972r0 {

    /* renamed from: f */
    public static final Pattern f9693f = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: g */
    public static final String f9694g = Pattern.quote(Strings.FOLDER_SEPARATOR);

    /* renamed from: a */
    public final C3974s0 f9695a;

    /* renamed from: b */
    public final Context f9696b;

    /* renamed from: c */
    public final String f9697c;

    /* renamed from: d */
    public final C4218a f9698d;

    /* renamed from: e */
    public String f9699e;

    public C3970q0(Context context, String str, C4218a aVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str != null) {
            this.f9696b = context;
            this.f9697c = str;
            this.f9698d = aVar;
            this.f9695a = new C3974s0();
        } else {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
    }

    /* renamed from: a */
    public final String mo10159a(String str) {
        return str.replaceAll(f9694g, Objects.EMPTY_STRING);
    }

    /* renamed from: a */
    public final synchronized String mo10160a(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        String uuid = UUID.randomUUID().toString();
        lowerCase = uuid == null ? null : f9693f.matcher(uuid).replaceAll(Objects.EMPTY_STRING).toLowerCase(Locale.US);
        C3913b bVar = C3913b.f9552c;
        StringBuilder sb = new StringBuilder();
        sb.append("Created new Crashlytics IID: ");
        sb.append(lowerCase);
        bVar.mo10108a(sb.toString());
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* renamed from: b */
    public String mo10162b() {
        return this.f9695a.mo10163a(this.f9696b);
    }

    /* renamed from: a */
    public synchronized String mo10158a() {
        String a;
        if (this.f9699e != null) {
            return this.f9699e;
        }
        SharedPreferences e = C3944g.m9370e(this.f9696b);
        String id = this.f9698d.getId();
        String string = e.getString("firebase.installation.id", null);
        if (string == null) {
            SharedPreferences sharedPreferences = this.f9696b.getSharedPreferences("com.crashlytics.prefs", 0);
            String string2 = sharedPreferences.getString("crashlytics.installation.id", null);
            C3913b bVar = C3913b.f9552c;
            StringBuilder sb = new StringBuilder();
            sb.append("No cached FID; legacy id is ");
            sb.append(string2);
            bVar.mo10108a(sb.toString());
            if (string2 == null) {
                this.f9699e = mo10160a(id, e);
            } else {
                this.f9699e = string2;
                mo10161a(string2, id, e, sharedPreferences);
            }
            return this.f9699e;
        }
        if (string.equals(id)) {
            this.f9699e = e.getString("crashlytics.installation.id", null);
            C3913b bVar2 = C3913b.f9552c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Found matching FID, using Crashlytics IID: ");
            sb2.append(this.f9699e);
            bVar2.mo10108a(sb2.toString());
            if (this.f9699e == null) {
                a = mo10160a(id, e);
            }
            return this.f9699e;
        }
        a = mo10160a(id, e);
        this.f9699e = a;
        return this.f9699e;
    }

    /* renamed from: a */
    public final synchronized void mo10161a(String str, String str2, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        C3913b bVar = C3913b.f9552c;
        StringBuilder sb = new StringBuilder();
        sb.append("Migrating legacy Crashlytics IID: ");
        sb.append(str);
        bVar.mo10108a(sb.toString());
        sharedPreferences.edit().putString("crashlytics.installation.id", str).putString("firebase.installation.id", str2).apply();
        sharedPreferences2.edit().remove("crashlytics.installation.id").remove("crashlytics.advertising.id").apply();
    }
}
