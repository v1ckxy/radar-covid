package p213q.p217b.p218a.p231b.p239d.p242n;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;
import p124p.p126b.p127k.C1061o;
import p124p.p143e.C1261h;
import p124p.p150h.p158h.C1349a;
import p124p.p150h.p158h.C1352d;
import p213q.p217b.p218a.p231b.p238c.C2112b;
import p213q.p217b.p218a.p231b.p239d.C2128h;
import p213q.p217b.p218a.p231b.p239d.C2131k;
import p213q.p217b.p218a.p231b.p239d.p248r.C2293a;
import p213q.p217b.p218a.p231b.p239d.p248r.C2294b;

/* renamed from: q.b.a.b.d.n.p */
public final class C2262p {
    @GuardedBy("sCache")

    /* renamed from: a */
    public static final C1261h<String, String> f6219a = new C1261h<>();
    @GuardedBy("sCache")

    /* renamed from: b */
    public static Locale f6220b;

    /* renamed from: a */
    public static String m5112a(Context context) {
        return context.getResources().getString(C2112b.common_google_play_services_notification_channel_name);
    }

    /* renamed from: a */
    public static String m5113a(Context context, int i) {
        String str;
        Resources resources = context.getResources();
        String str2 = "GoogleApiAvailability";
        switch (i) {
            case 1:
                return resources.getString(C2112b.common_google_play_services_install_title);
            case 2:
                return resources.getString(C2112b.common_google_play_services_update_title);
            case 3:
                return resources.getString(C2112b.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e(str2, "An invalid account was specified when connecting. Please provide a valid account.");
                return m5114a(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e(str2, "Network error occurred. Please retry request later.");
                return m5114a(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e(str2, "The specified account could not be signed in.");
                return m5114a(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e(str2, "The current user profile is restricted and could not use authenticated features.");
                return m5114a(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                str = sb.toString();
                break;
        }
        Log.e(str2, str);
        return null;
    }

    /* renamed from: a */
    public static String m5114a(Context context, String str) {
        C1349a aVar;
        synchronized (f6219a) {
            Configuration configuration = context.getResources().getConfiguration();
            if (VERSION.SDK_INT >= 24) {
                aVar = new C1349a(new C1352d(configuration.getLocales()));
            } else {
                aVar = C1349a.m3433a(configuration.locale);
            }
            Locale locale = aVar.f4060a.get(0);
            if (!locale.equals(f6220b)) {
                f6219a.clear();
                f6220b = locale;
            }
            String str2 = (String) f6219a.getOrDefault(str, null);
            if (str2 != null) {
                return str2;
            }
            Resources d = C2128h.m4921d(context);
            if (d == null) {
                return null;
            }
            int identifier = d.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String str3 = "GoogleApiAvailability";
                String str4 = "Missing resource: ";
                String valueOf = String.valueOf(str);
                Log.w(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                return null;
            }
            String string = d.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String str5 = "GoogleApiAvailability";
                String str6 = "Got empty resource: ";
                String valueOf2 = String.valueOf(str);
                Log.w(str5, valueOf2.length() != 0 ? str6.concat(valueOf2) : new String(str6));
                return null;
            }
            f6219a.put(str, string);
            return string;
        }
    }

    /* renamed from: a */
    public static String m5115a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a = m5114a(context, str);
        if (a == null) {
            a = resources.getString(C2131k.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a, new Object[]{str2});
    }

    /* renamed from: b */
    public static String m5116b(Context context) {
        String packageName = context.getPackageName();
        try {
            C2293a b = C2294b.m5363b(context);
            return b.f6270a.getPackageManager().getApplicationLabel(b.f6270a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static String m5117b(Context context, int i) {
        Resources resources = context.getResources();
        String b = m5116b(context);
        if (i == 1) {
            return resources.getString(C2112b.common_google_play_services_install_text, new Object[]{b});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(C2112b.common_google_play_services_enable_text, new Object[]{b});
            } else if (i == 5) {
                return m5115a(context, "common_google_play_services_invalid_account_text", b);
            } else {
                if (i == 7) {
                    return m5115a(context, "common_google_play_services_network_error_text", b);
                }
                if (i == 9) {
                    return resources.getString(C2112b.common_google_play_services_unsupported_text, new Object[]{b});
                } else if (i == 20) {
                    return m5115a(context, "common_google_play_services_restricted_profile_text", b);
                } else {
                    switch (i) {
                        case 16:
                            return m5115a(context, "common_google_play_services_api_unavailable_text", b);
                        case 17:
                            return m5115a(context, "common_google_play_services_sign_in_failed_text", b);
                        case 18:
                            return resources.getString(C2112b.common_google_play_services_updating_text, new Object[]{b});
                        default:
                            return resources.getString(C2131k.common_google_play_services_unknown_issue, new Object[]{b});
                    }
                }
            }
        } else if (C1061o.m2545c(context)) {
            return resources.getString(C2112b.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(C2112b.common_google_play_services_update_text, new Object[]{b});
        }
    }
}
