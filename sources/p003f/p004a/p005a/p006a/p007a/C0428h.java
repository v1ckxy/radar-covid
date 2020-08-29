package p003f.p004a.p005a.p006a.p007a;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p002es.gob.radarcovid.models.domain.Language;
import p002es.gob.radarcovid.models.domain.Region;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p355e.p361w.C4396a;
import p392u.p401r.p403c.C4638h;

/* renamed from: f.a.a.a.a.h */
public final class C0428h implements C0427g {

    /* renamed from: a */
    public final SharedPreferences f1816a;

    /* renamed from: f.a.a.a.a.h$a */
    public static final class C0429a extends C4396a<HashMap<String, String>> {
    }

    /* renamed from: f.a.a.a.a.h$b */
    public static final class C0430b extends C4396a<List<? extends Language>> {
    }

    /* renamed from: f.a.a.a.a.h$c */
    public static final class C0431c extends C4396a<List<? extends Region>> {
    }

    public C0428h(Context context) {
        if (context != null) {
            this.f1816a = context.getSharedPreferences("app_preferences", 0);
        } else {
            C4638h.m10271a("context");
            throw null;
        }
    }

    /* renamed from: a */
    public String mo3673a() {
        SharedPreferences sharedPreferences = this.f1816a;
        String str = Objects.EMPTY_STRING;
        String string = sharedPreferences.getString("uuid", str);
        return string != null ? string : str;
    }

    /* renamed from: a */
    public void mo3675a(Date date) {
        if (date != null) {
            this.f1816a.edit().putLong("key_infection_report_date", date.getTime()).apply();
            return;
        }
        C4638h.m10271a("date");
        throw null;
    }

    /* renamed from: a */
    public void mo3678a(boolean z) {
        this.f1816a.edit().putBoolean("onboarding_completed", z).apply();
    }

    /* renamed from: b */
    public Date mo3679b() {
        long j = this.f1816a.getLong("key_infection_report_date", 0);
        if (j == 0) {
            return null;
        }
        return new Date(j);
    }

    /* renamed from: b */
    public void mo3681b(List<Language> list) {
        if (list != null) {
            this.f1816a.edit().putString("key_languages", C2286e.m5344g((Object) list)).apply();
            return;
        }
        C4638h.m10271a("languages");
        throw null;
    }

    /* renamed from: b */
    public void mo3682b(boolean z) {
        this.f1816a.edit().putBoolean("poll_completed", z).apply();
    }

    /* renamed from: c */
    public String mo3683c() {
        String str = "es-ES";
        String string = this.f1816a.getString("key_current_language", str);
        return string != null ? string : str;
    }

    /* renamed from: d */
    public String mo3684d() {
        String str = "ES-MD";
        String string = this.f1816a.getString("key_current_region", str);
        return string != null ? string : str;
    }

    /* renamed from: e */
    public List<Language> mo3685e() {
        Object a = new Gson().mo3077a(this.f1816a.getString("key_languages", Objects.EMPTY_ARRAY), new C0430b().getType());
        C4638h.m10270a(a, "Gson().fromJson(\n       …       itemType\n        )");
        return (List) a;
    }

    /* renamed from: f */
    public List<Region> mo3686f() {
        Object a = new Gson().mo3077a(this.f1816a.getString("key_regions", Objects.EMPTY_ARRAY), new C0431c().getType());
        C4638h.m10270a(a, "Gson().fromJson(\n       …       itemType\n        )");
        return (List) a;
    }

    /* renamed from: g */
    public Map<String, String> mo3687g() {
        Object a = new Gson().mo3077a(this.f1816a.getString("key_labels", "{\"test\":\"Hola Label\"}"), new C0429a().getType());
        C4638h.m10270a(a, "Gson().fromJson(\n       …       itemType\n        )");
        return (Map) a;
    }

    /* renamed from: h */
    public boolean mo3688h() {
        return this.f1816a.getBoolean("onboarding_completed", false);
    }

    /* renamed from: i */
    public boolean mo3689i() {
        return this.f1816a.getBoolean("poll_completed", false);
    }

    /* renamed from: a */
    public void mo3677a(Map<String, String> map) {
        if (map != null) {
            this.f1816a.edit().putString("key_labels", C2286e.m5344g((Object) map)).apply();
            return;
        }
        C4638h.m10271a("labels");
        throw null;
    }

    /* renamed from: b */
    public void mo3680b(String str) {
        String str2 = "uuid";
        if (str != null) {
            this.f1816a.edit().putString(str2, str).apply();
        } else {
            C4638h.m10271a(str2);
            throw null;
        }
    }

    /* renamed from: a */
    public void mo3676a(List<Region> list) {
        if (list != null) {
            this.f1816a.edit().putString("key_regions", C2286e.m5344g((Object) list)).apply();
            return;
        }
        C4638h.m10271a("regions");
        throw null;
    }

    /* renamed from: a */
    public void mo3674a(String str) {
        if (str != null) {
            this.f1816a.edit().putString("key_current_language", str).apply();
        } else {
            C4638h.m10271a("language");
            throw null;
        }
    }
}
