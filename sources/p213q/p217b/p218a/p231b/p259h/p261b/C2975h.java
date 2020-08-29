package p213q.p217b.p218a.p231b.p259h.p261b;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p124p.p150h.p152e.C1325a;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;

/* renamed from: q.b.a.b.h.b.h */
public final class C2975h extends C3185z5 {

    /* renamed from: c */
    public long f7365c;

    /* renamed from: d */
    public String f7366d;

    /* renamed from: e */
    public Boolean f7367e;

    /* renamed from: f */
    public AccountManager f7368f;

    /* renamed from: g */
    public Boolean f7369g;

    /* renamed from: h */
    public long f7370h;

    public C2975h(C2969g5 g5Var) {
        super(g5Var);
    }

    /* renamed from: a */
    public final boolean mo8492a(Context context) {
        if (this.f7367e == null) {
            C3010ja jaVar = this.f7133a.f7337f;
            this.f7367e = Boolean.valueOf(false);
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.f7367e = Boolean.valueOf(true);
                }
            } catch (NameNotFoundException unused) {
            }
        }
        return this.f7367e.booleanValue();
    }

    /* renamed from: q */
    public final boolean mo8306q() {
        Calendar instance = Calendar.getInstance();
        this.f7365c = TimeUnit.MINUTES.convert((long) (instance.get(16) + instance.get(15)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        this.f7366d = C1965a.m4745a(C1965a.m4743a(lowerCase2, C1965a.m4743a(lowerCase, 1)), lowerCase, "-", lowerCase2);
        return false;
    }

    /* renamed from: s */
    public final long mo8493s() {
        mo8846n();
        return this.f7365c;
    }

    /* renamed from: t */
    public final String mo8494t() {
        mo8846n();
        return this.f7366d;
    }

    /* renamed from: u */
    public final long mo8495u() {
        mo8279c();
        return this.f7370h;
    }

    /* renamed from: v */
    public final boolean mo8496v() {
        String str = "com.google";
        mo8279c();
        if (((C2284c) this.f7133a.f7345n) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f7370h > 86400000) {
                this.f7369g = null;
            }
            Boolean bool = this.f7369g;
            if (bool != null) {
                return bool.booleanValue();
            }
            if (C1325a.m3374a(this.f7133a.f7332a, "android.permission.GET_ACCOUNTS") != 0) {
                mo8285i().f7157j.mo8432a("Permission error checking for dasher/unicorn accounts");
            } else {
                if (this.f7368f == null) {
                    this.f7368f = AccountManager.get(this.f7133a.f7332a);
                }
                try {
                    Account[] accountArr = (Account[]) this.f7368f.getAccountsByTypeAndFeatures(str, new String[]{"service_HOSTED"}, null, null).getResult();
                    if (accountArr == null || accountArr.length <= 0) {
                        Account[] accountArr2 = (Account[]) this.f7368f.getAccountsByTypeAndFeatures(str, new String[]{"service_uca"}, null, null).getResult();
                        if (accountArr2 != null && accountArr2.length > 0) {
                            this.f7369g = Boolean.valueOf(true);
                            this.f7370h = currentTimeMillis;
                            return true;
                        }
                    } else {
                        this.f7369g = Boolean.valueOf(true);
                        this.f7370h = currentTimeMillis;
                        return true;
                    }
                } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                    mo8285i().f7154g.mo8433a("Exception checking account types", e);
                }
            }
            this.f7370h = currentTimeMillis;
            this.f7369g = Boolean.valueOf(false);
            return false;
        }
        throw null;
    }
}
