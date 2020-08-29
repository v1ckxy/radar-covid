package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.p4 */
public final class C3074p4 {

    /* renamed from: a */
    public final String f7767a;

    /* renamed from: b */
    public final Bundle f7768b = new Bundle();

    /* renamed from: c */
    public boolean f7769c;

    /* renamed from: d */
    public Bundle f7770d;

    /* renamed from: e */
    public final /* synthetic */ C3063o4 f7771e;

    public C3074p4(C3063o4 o4Var, String str) {
        this.f7771e = o4Var;
        C1061o.m2528b(str);
        this.f7767a = str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|46) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r12.f7771e.mo8285i().f7153f.mo8432a("Error reading value from SharedPreferences. Value dropped");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x009e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo8687a() {
        /*
            r12 = this;
            boolean r0 = r12.f7769c
            if (r0 != 0) goto L_0x00c7
            r0 = 1
            r12.f7769c = r0
            q.b.a.b.h.b.o4 r1 = r12.f7771e
            android.content.SharedPreferences r1 = r1.mo8667s()
            java.lang.String r2 = r12.f7767a
            r3 = 0
            java.lang.String r1 = r1.getString(r2, r3)
            if (r1 == 0) goto L_0x00bf
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ JSONException -> 0x00b2 }
            r2.<init>()     // Catch:{ JSONException -> 0x00b2 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00b2 }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x00b2 }
            r1 = 0
            r4 = r1
        L_0x0022:
            int r5 = r3.length()     // Catch:{ JSONException -> 0x00b2 }
            if (r4 >= r5) goto L_0x00af
            org.json.JSONObject r5 = r3.getJSONObject(r4)     // Catch:{ NumberFormatException | JSONException -> 0x009e }
            java.lang.String r6 = "n"
            java.lang.String r6 = r5.getString(r6)     // Catch:{ NumberFormatException | JSONException -> 0x009e }
            java.lang.String r7 = "t"
            java.lang.String r7 = r5.getString(r7)     // Catch:{ NumberFormatException | JSONException -> 0x009e }
            r8 = -1
            int r9 = r7.hashCode()     // Catch:{ NumberFormatException | JSONException -> 0x009e }
            r10 = 100
            r11 = 2
            if (r9 == r10) goto L_0x005f
            r10 = 108(0x6c, float:1.51E-43)
            if (r9 == r10) goto L_0x0055
            r10 = 115(0x73, float:1.61E-43)
            if (r9 == r10) goto L_0x004b
            goto L_0x0068
        L_0x004b:
            java.lang.String r9 = "s"
            boolean r9 = r7.equals(r9)     // Catch:{ NumberFormatException | JSONException -> 0x009e }
            if (r9 == 0) goto L_0x0068
            r8 = r1
            goto L_0x0068
        L_0x0055:
            java.lang.String r9 = "l"
            boolean r9 = r7.equals(r9)     // Catch:{ NumberFormatException | JSONException -> 0x009e }
            if (r9 == 0) goto L_0x0068
            r8 = r11
            goto L_0x0068
        L_0x005f:
            java.lang.String r9 = "d"
            boolean r9 = r7.equals(r9)     // Catch:{ NumberFormatException | JSONException -> 0x009e }
            if (r9 == 0) goto L_0x0068
            r8 = r0
        L_0x0068:
            java.lang.String r9 = "v"
            if (r8 == 0) goto L_0x0096
            if (r8 == r0) goto L_0x008a
            if (r8 == r11) goto L_0x007e
            q.b.a.b.h.b.o4 r5 = r12.f7771e     // Catch:{ NumberFormatException | JSONException -> 0x009e }
            q.b.a.b.h.b.b4 r5 = r5.mo8285i()     // Catch:{ NumberFormatException | JSONException -> 0x009e }
            q.b.a.b.h.b.e4 r5 = r5.f7153f     // Catch:{ NumberFormatException | JSONException -> 0x009e }
            java.lang.String r6 = "Unrecognized persisted bundle type. Type"
            r5.mo8433a(r6, r7)     // Catch:{ NumberFormatException | JSONException -> 0x009e }
            goto L_0x00ab
        L_0x007e:
            java.lang.String r5 = r5.getString(r9)     // Catch:{ NumberFormatException | JSONException -> 0x009e }
            long r7 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException | JSONException -> 0x009e }
            r2.putLong(r6, r7)     // Catch:{ NumberFormatException | JSONException -> 0x009e }
            goto L_0x00ab
        L_0x008a:
            java.lang.String r5 = r5.getString(r9)     // Catch:{ NumberFormatException | JSONException -> 0x009e }
            double r7 = java.lang.Double.parseDouble(r5)     // Catch:{ NumberFormatException | JSONException -> 0x009e }
            r2.putDouble(r6, r7)     // Catch:{ NumberFormatException | JSONException -> 0x009e }
            goto L_0x00ab
        L_0x0096:
            java.lang.String r5 = r5.getString(r9)     // Catch:{ NumberFormatException | JSONException -> 0x009e }
            r2.putString(r6, r5)     // Catch:{ NumberFormatException | JSONException -> 0x009e }
            goto L_0x00ab
        L_0x009e:
            q.b.a.b.h.b.o4 r5 = r12.f7771e     // Catch:{ JSONException -> 0x00b2 }
            q.b.a.b.h.b.b4 r5 = r5.mo8285i()     // Catch:{ JSONException -> 0x00b2 }
            q.b.a.b.h.b.e4 r5 = r5.f7153f     // Catch:{ JSONException -> 0x00b2 }
            java.lang.String r6 = "Error reading value from SharedPreferences. Value dropped"
            r5.mo8432a(r6)     // Catch:{ JSONException -> 0x00b2 }
        L_0x00ab:
            int r4 = r4 + 1
            goto L_0x0022
        L_0x00af:
            r12.f7770d = r2     // Catch:{ JSONException -> 0x00b2 }
            goto L_0x00bf
        L_0x00b2:
            q.b.a.b.h.b.o4 r0 = r12.f7771e
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7153f
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            r0.mo8432a(r1)
        L_0x00bf:
            android.os.Bundle r0 = r12.f7770d
            if (r0 != 0) goto L_0x00c7
            android.os.Bundle r0 = r12.f7768b
            r12.f7770d = r0
        L_0x00c7:
            android.os.Bundle r0 = r12.f7770d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3074p4.mo8687a():android.os.Bundle");
    }

    /* renamed from: a */
    public final void mo8688a(Bundle bundle) {
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        Editor edit = this.f7771e.mo8667s().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f7767a);
        } else {
            String str2 = this.f7767a;
            JSONArray jSONArray = new JSONArray();
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str3);
                        jSONObject.put("v", String.valueOf(obj));
                        String str4 = "t";
                        if (obj instanceof String) {
                            str = "s";
                        } else if (obj instanceof Long) {
                            str = "l";
                        } else if (obj instanceof Double) {
                            str = "d";
                        } else {
                            this.f7771e.mo8285i().f7153f.mo8433a("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONObject.put(str4, str);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        this.f7771e.mo8285i().f7153f.mo8433a("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            edit.putString(str2, jSONArray.toString());
        }
        edit.apply();
        this.f7770d = bundle;
    }
}
