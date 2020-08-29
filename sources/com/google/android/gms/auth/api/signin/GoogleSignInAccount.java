package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p234b.p235a.p236a.C2110b;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2283b;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;

public class GoogleSignInAccount extends C2258a implements ReflectedParcelable {
    public static final Creator<GoogleSignInAccount> CREATOR = new C2110b();

    /* renamed from: r */
    public static C2283b f1041r = C2284c.f6249a;

    /* renamed from: e */
    public final int f1042e;

    /* renamed from: f */
    public String f1043f;

    /* renamed from: g */
    public String f1044g;

    /* renamed from: h */
    public String f1045h;

    /* renamed from: i */
    public String f1046i;

    /* renamed from: j */
    public Uri f1047j;

    /* renamed from: k */
    public String f1048k;

    /* renamed from: l */
    public long f1049l;

    /* renamed from: m */
    public String f1050m;

    /* renamed from: n */
    public List<Scope> f1051n;

    /* renamed from: o */
    public String f1052o;

    /* renamed from: p */
    public String f1053p;

    /* renamed from: q */
    public Set<Scope> f1054q = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f1042e = i;
        this.f1043f = str;
        this.f1044g = str2;
        this.f1045h = str3;
        this.f1046i = str4;
        this.f1047j = uri;
        this.f1048k = str5;
        this.f1049l = j;
        this.f1050m = str6;
        this.f1051n = list;
        this.f1052o = str7;
        this.f1053p = str8;
    }

    /* renamed from: a */
    public static GoogleSignInAccount m878a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        String str2 = "tokenId";
        String optString3 = jSONObject.has(str2) ? jSONObject.optString(str2) : null;
        String str3 = "email";
        String optString4 = jSONObject.has(str3) ? jSONObject.optString(str3) : null;
        String str4 = "displayName";
        String optString5 = jSONObject.has(str4) ? jSONObject.optString(str4) : null;
        String str5 = "givenName";
        String optString6 = jSONObject.has(str5) ? jSONObject.optString(str5) : null;
        String str6 = "familyName";
        String optString7 = jSONObject.has(str6) ? jSONObject.optString(str6) : null;
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (valueOf == null) {
            if (((C2284c) f1041r) != null) {
                valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
            } else {
                throw null;
            }
        }
        long longValue = valueOf.longValue();
        C1061o.m2528b(string);
        C1061o.m2524b(hashSet);
        GoogleSignInAccount googleSignInAccount = r3;
        GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, longValue, string, new ArrayList(hashSet), optString6, optString7);
        String str7 = "serverAuthCode";
        googleSignInAccount.f1048k = jSONObject.has(str7) ? jSONObject.optString(str7) : null;
        return googleSignInAccount;
    }

    /* renamed from: c */
    public Set<Scope> mo1510c() {
        HashSet hashSet = new HashSet(this.f1051n);
        hashSet.addAll(this.f1054q);
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.f1050m.equals(this.f1050m)) {
            if (((AbstractSet) googleSignInAccount.mo1510c()).equals(mo1510c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((AbstractSet) mo1510c()).hashCode() + ((this.f1050m.hashCode() + 527) * 31);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2480a(parcel, 1, this.f1042e);
        C1061o.m2485a(parcel, 2, this.f1043f, false);
        C1061o.m2485a(parcel, 3, this.f1044g, false);
        C1061o.m2485a(parcel, 4, this.f1045h, false);
        C1061o.m2485a(parcel, 5, this.f1046i, false);
        C1061o.m2484a(parcel, 6, (Parcelable) this.f1047j, i, false);
        C1061o.m2485a(parcel, 7, this.f1048k, false);
        C1061o.m2481a(parcel, 8, this.f1049l);
        C1061o.m2485a(parcel, 9, this.f1050m, false);
        C1061o.m2531b(parcel, 10, this.f1051n, false);
        C1061o.m2485a(parcel, 11, this.f1052o, false);
        C1061o.m2485a(parcel, 12, this.f1053p, false);
        C1061o.m2566n(parcel, a);
    }
}
