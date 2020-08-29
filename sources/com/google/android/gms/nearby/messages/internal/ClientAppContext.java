package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.Locale;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;
import p213q.p217b.p218a.p231b.p262i.p265d.p266b.C3211f;

public final class ClientAppContext extends C2258a implements ReflectedParcelable {
    public static final Creator<ClientAppContext> CREATOR = new C3211f();

    /* renamed from: e */
    public final int f1131e;

    /* renamed from: f */
    public final String f1132f;

    /* renamed from: g */
    public final String f1133g;

    /* renamed from: h */
    public final boolean f1134h;
    @Deprecated

    /* renamed from: i */
    public final int f1135i;

    /* renamed from: j */
    public final String f1136j;

    public ClientAppContext(int i, String str, String str2, boolean z, int i2, String str3) {
        this.f1131e = i;
        C1061o.m2524b(str);
        this.f1132f = str;
        if (str2 != null && !str2.isEmpty()) {
            String str4 = "0p:";
            if (!str2.startsWith(str4)) {
                Log.w("NearbyMessages", String.format(Locale.US, "ClientAppContext: 0P identifier(%s) without 0P prefix(%s)", new Object[]{str2, str4}));
                str2 = str2.length() != 0 ? str4.concat(str2) : new String(str4);
            }
        }
        this.f1133g = str2;
        this.f1134h = z;
        this.f1135i = i2;
        this.f1136j = str3;
    }

    /* renamed from: a */
    public static boolean m922a(String str, String str2) {
        return TextUtils.isEmpty(str) ? TextUtils.isEmpty(str2) : str.equals(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientAppContext)) {
            return false;
        }
        ClientAppContext clientAppContext = (ClientAppContext) obj;
        return m922a(this.f1132f, clientAppContext.f1132f) && m922a(this.f1133g, clientAppContext.f1133g) && this.f1134h == clientAppContext.f1134h && m922a(this.f1136j, clientAppContext.f1136j) && this.f1135i == clientAppContext.f1135i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1132f, this.f1133g, Boolean.valueOf(this.f1134h), this.f1136j, Integer.valueOf(this.f1135i)});
    }

    public final String toString() {
        return String.format(Locale.US, "{realClientPackageName: %s, zeroPartyIdentifier: %s, useRealClientApiKey: %b, apiKey: %s, callingContext: %d}", new Object[]{this.f1132f, this.f1133g, Boolean.valueOf(this.f1134h), this.f1136j, Integer.valueOf(this.f1135i)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2480a(parcel, 1, this.f1131e);
        C1061o.m2485a(parcel, 2, this.f1132f, false);
        C1061o.m2485a(parcel, 3, this.f1133g, false);
        C1061o.m2487a(parcel, 4, this.f1134h);
        C1061o.m2480a(parcel, 5, this.f1135i);
        C1061o.m2485a(parcel, 6, this.f1136j, false);
        C1061o.m2566n(parcel, a);
    }
}
