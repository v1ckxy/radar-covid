package p213q.p217b.p218a.p231b.p259h.p261b;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.C2124f;
import p213q.p217b.p218a.p231b.p239d.C2129i;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p239d.p248r.C2294b;
import p213q.p217b.p218a.p231b.p251g.p256e.C2424ec;
import p213q.p217b.p218a.p231b.p251g.p256e.C2602oa;
import p213q.p217b.p218a.p231b.p251g.p256e.C2626pe;

/* renamed from: q.b.a.b.h.b.w9 */
public final class C3156w9 extends C3185z5 {

    /* renamed from: g */
    public static final String[] f7944g = {"firebase_", "google_", "ga_"};

    /* renamed from: h */
    public static final String[] f7945h = {"_err"};

    /* renamed from: c */
    public SecureRandom f7946c;

    /* renamed from: d */
    public final AtomicLong f7947d = new AtomicLong(0);

    /* renamed from: e */
    public int f7948e;

    /* renamed from: f */
    public Integer f7949f = null;

    public C3156w9(C2969g5 g5Var) {
        super(g5Var);
    }

    /* renamed from: a */
    public static long m7400a(long j, long j2) {
        return ((j2 * 60000) + j) / 86400000;
    }

    /* renamed from: a */
    public static long m7402a(byte[] bArr) {
        C1061o.m2524b(bArr);
        int i = 0;
        C1061o.m2533b(bArr.length > 0);
        long j = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
            length--;
        }
        return j;
    }

    /* renamed from: a */
    public static Bundle m7403a(List<C3112s9> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (C3112s9 s9Var : list) {
            String str = s9Var.f7854i;
            if (str != null) {
                bundle.putString(s9Var.f7851f, str);
            } else {
                Long l = s9Var.f7853h;
                if (l != null) {
                    bundle.putLong(s9Var.f7851f, l.longValue());
                } else {
                    Double d = s9Var.f7856k;
                    if (d != null) {
                        bundle.putDouble(s9Var.f7851f, d.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public static String m7404a(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* renamed from: a */
    public static void m7405a(Bundle bundle, int i, String str, Object obj) {
        if (m7408a(bundle, i)) {
            bundle.putString("_ev", m7404a(str, 40, true));
            if (obj != null) {
                C1061o.m2524b(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) String.valueOf(obj).length());
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m7406a(Context context) {
        C1061o.m2524b(context);
        return m7414b(context, VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: a */
    public static boolean m7407a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* renamed from: a */
    public static boolean m7408a(Bundle bundle, int i) {
        if (bundle == null) {
            return false;
        }
        String str = "_err";
        if (bundle.getLong(str) != 0) {
            return false;
        }
        bundle.putLong(str, (long) i);
        return true;
    }

    /* renamed from: a */
    public static boolean m7409a(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* renamed from: a */
    public static boolean m7410a(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* renamed from: a */
    public static boolean m7411a(String str, String[] strArr) {
        C1061o.m2524b(strArr);
        for (String c : strArr) {
            if (m7416c(str, c)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static byte[] m7412a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: b */
    public static ArrayList<Bundle> m7413b(List<C2998ia> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (C2998ia iaVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", iaVar.f7418e);
            bundle.putString("origin", iaVar.f7419f);
            bundle.putLong("creation_timestamp", iaVar.f7421h);
            bundle.putString("name", iaVar.f7420g.f7851f);
            C2286e.m5228a(bundle, iaVar.f7420g.mo8714a());
            bundle.putBoolean("active", iaVar.f7422i);
            String str = iaVar.f7423j;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C3047n nVar = iaVar.f7424k;
            if (nVar != null) {
                bundle.putString("timed_out_event_name", nVar.f7582e);
                C3036m mVar = iaVar.f7424k.f7583f;
                if (mVar != null) {
                    bundle.putBundle("timed_out_event_params", mVar.mo8637b());
                }
            }
            bundle.putLong("trigger_timeout", iaVar.f7425l);
            C3047n nVar2 = iaVar.f7426m;
            if (nVar2 != null) {
                bundle.putString("triggered_event_name", nVar2.f7582e);
                C3036m mVar2 = iaVar.f7426m.f7583f;
                if (mVar2 != null) {
                    bundle.putBundle("triggered_event_params", mVar2.mo8637b());
                }
            }
            bundle.putLong("triggered_timestamp", iaVar.f7420g.f7852g);
            bundle.putLong("time_to_live", iaVar.f7427n);
            C3047n nVar3 = iaVar.f7428o;
            if (nVar3 != null) {
                bundle.putString("expired_event_name", nVar3.f7582e);
                C3036m mVar3 = iaVar.f7428o.f7583f;
                if (mVar3 != null) {
                    bundle.putBundle("expired_event_params", mVar3.mo8637b());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m7414b(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: b */
    public static Bundle[] m7415b(Object obj) {
        Object[] array;
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            array = arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return (Bundle[]) array;
    }

    /* renamed from: c */
    public static boolean m7416c(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* renamed from: h */
    public static boolean m7417h(String str) {
        C1061o.m2528b(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* renamed from: i */
    public static boolean m7418i(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: w */
    public static MessageDigest m7419w() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final int mo8775a(String str) {
        String str2 = "event";
        if (!mo8805b(str2, str)) {
            return 2;
        }
        if (!mo8802a(str2, C2946e6.f7281a, str)) {
            return 13;
        }
        return !mo8798a(str2, 40, str) ? 2 : 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ca  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo8776a(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.Object r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24, boolean r25) {
        /*
            r17 = this;
            r7 = r17
            r8 = r20
            r0 = r21
            r1 = r22
            r17.mo8279c()
            boolean r2 = p213q.p217b.p218a.p231b.p251g.p256e.C2602oa.m6203b()
            r3 = 17
            java.lang.String r4 = "param"
            r9 = 1
            r10 = 0
            if (r2 == 0) goto L_0x0098
            q.b.a.b.h.b.g5 r2 = r7.f7133a
            q.b.a.b.h.b.ka r2 = r2.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r5 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7683I0
            boolean r2 = r2.mo8574a(r5)
            if (r2 == 0) goto L_0x0098
            boolean r2 = m7409a(r21)
            if (r2 == 0) goto L_0x00a3
            if (r25 == 0) goto L_0x0095
            java.lang.String[] r2 = p213q.p217b.p218a.p231b.p259h.p261b.C2934d6.f7247c
            boolean r2 = m7411a(r8, r2)
            if (r2 != 0) goto L_0x0036
            r0 = 20
            return r0
        L_0x0036:
            q.b.a.b.h.b.g5 r2 = r7.f7133a
            q.b.a.b.h.b.t7 r2 = r2.mo8477t()
            r2.mo8279c()
            r2.mo8373v()
            boolean r5 = r2.mo8723D()
            if (r5 != 0) goto L_0x004a
        L_0x0048:
            r2 = r9
            goto L_0x0059
        L_0x004a:
            q.b.a.b.h.b.w9 r2 = r2.mo8287k()
            int r2 = r2.mo8815u()
            r5 = 200900(0x310c4, float:2.81521E-40)
            if (r2 < r5) goto L_0x0058
            goto L_0x0048
        L_0x0058:
            r2 = r10
        L_0x0059:
            if (r2 != 0) goto L_0x005e
            r0 = 25
            return r0
        L_0x005e:
            r2 = 200(0xc8, float:2.8E-43)
            boolean r5 = r7.mo8806b(r4, r8, r2, r0)
            if (r5 != 0) goto L_0x00a3
            boolean r5 = r0 instanceof android.os.Parcelable[]
            if (r5 == 0) goto L_0x007a
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            if (r6 <= r2) goto L_0x0093
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r2)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x0093
        L_0x007a:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x0093
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            if (r6 <= r2) goto L_0x0093
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r2 = r5.subList(r10, r2)
            r6.<init>(r2)
            r1.putParcelableArrayList(r8, r6)
        L_0x0093:
            r11 = r3
            goto L_0x00a4
        L_0x0095:
            r0 = 21
            return r0
        L_0x0098:
            if (r25 == 0) goto L_0x00a3
            r1 = 1000(0x3e8, float:1.401E-42)
            boolean r1 = r7.mo8806b(r4, r8, r1, r0)
            if (r1 != 0) goto L_0x00a3
            return r3
        L_0x00a3:
            r11 = r10
        L_0x00a4:
            q.b.a.b.h.b.g5 r1 = r7.f7133a
            q.b.a.b.h.b.ka r1 = r1.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7700R
            r12 = r18
            boolean r1 = r1.mo8578c(r12, r2)
            if (r1 == 0) goto L_0x00b8
            boolean r1 = m7418i(r19)
            if (r1 != 0) goto L_0x00be
        L_0x00b8:
            boolean r1 = m7418i(r20)
            if (r1 == 0) goto L_0x00c1
        L_0x00be:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x00c3
        L_0x00c1:
            r1 = 100
        L_0x00c3:
            boolean r1 = r7.mo8800a(r4, r8, r1, r0)
            if (r1 == 0) goto L_0x00ca
            return r11
        L_0x00ca:
            if (r25 == 0) goto L_0x017b
            boolean r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2602oa.m6203b()
            if (r1 == 0) goto L_0x00e0
            q.b.a.b.h.b.g5 r1 = r7.f7133a
            q.b.a.b.h.b.ka r1 = r1.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7681H0
            boolean r1 = r1.mo8574a(r2)
            if (r1 == 0) goto L_0x00e0
            r13 = r9
            goto L_0x00e1
        L_0x00e0:
            r13 = r10
        L_0x00e1:
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00fb
            if (r13 == 0) goto L_0x0178
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r6 = r24
            r0.mo8787a(r1, r2, r3, r4, r5, r6)
            goto L_0x0178
        L_0x00fb:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x0138
            r14 = r0
            android.os.Parcelable[] r14 = (android.os.Parcelable[]) r14
            int r15 = r14.length
            r6 = r10
        L_0x0104:
            if (r6 >= r15) goto L_0x0178
            r0 = r14[r6]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x011c
            q.b.a.b.h.b.b4 r1 = r17.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7158k
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.mo8434a(r2, r0, r8)
            goto L_0x0177
        L_0x011c:
            if (r13 == 0) goto L_0x0133
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r16 = r6
            r6 = r24
            r0.mo8787a(r1, r2, r3, r4, r5, r6)
            goto L_0x0135
        L_0x0133:
            r16 = r6
        L_0x0135:
            int r6 = r16 + 1
            goto L_0x0104
        L_0x0138:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0177
            r14 = r0
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            int r15 = r14.size()
            r0 = r10
        L_0x0144:
            if (r0 >= r15) goto L_0x0178
            java.lang.Object r1 = r14.get(r0)
            int r16 = r0 + 1
            boolean r0 = r1 instanceof android.os.Bundle
            if (r0 != 0) goto L_0x0160
            q.b.a.b.h.b.b4 r0 = r17.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7158k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r0.mo8434a(r2, r1, r8)
            goto L_0x0177
        L_0x0160:
            if (r13 == 0) goto L_0x0174
            r4 = r1
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r6 = r24
            r0.mo8787a(r1, r2, r3, r4, r5, r6)
        L_0x0174:
            r0 = r16
            goto L_0x0144
        L_0x0177:
            r9 = r10
        L_0x0178:
            if (r9 == 0) goto L_0x017b
            return r11
        L_0x017b:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.mo8776a(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* renamed from: a */
    public final Object mo8781a(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            return mo8780a(256, obj, true, true);
        }
        if (!m7418i(str)) {
            i = 100;
        }
        return mo8780a(i, obj, false, true);
    }

    /* renamed from: a */
    public final void mo8785a(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    mo8287k().mo8786a(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    /* renamed from: b */
    public final int mo8803b(String str) {
        String str2 = "user property";
        if (!mo8805b(str2, str)) {
            return 6;
        }
        if (!mo8802a(str2, C2970g6.f7358a, str)) {
            return 15;
        }
        return !mo8798a(str2, 24, str) ? 6 : 0;
    }

    /* renamed from: b */
    public final int mo8804b(String str, Object obj) {
        String str2;
        int i;
        if ("_ldl".equals(str)) {
            i = mo8812g(str);
            str2 = "user property referrer";
        } else {
            i = mo8812g(str);
            str2 = "user property";
        }
        return mo8800a(str2, str, i, obj) ? 0 : 7;
    }

    /* renamed from: b */
    public final boolean mo8805b(String str, String str2) {
        if (str2 == null) {
            mo8285i().f7155h.mo8433a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo8285i().f7155h.mo8433a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        mo8285i().f7155h.mo8434a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            mo8285i().f7155h.mo8434a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* renamed from: c */
    public final Object mo8807c(String str, Object obj) {
        boolean equals = "_ldl".equals(str);
        int g = mo8812g(str);
        return equals ? mo8780a(g, obj, true, false) : mo8780a(g, obj, false, false);
    }

    /* renamed from: c */
    public final boolean mo8808c(String str) {
        mo8279c();
        if (C2294b.m5363b(this.f7133a.f7332a).f6270a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        mo8285i().f7160m.mo8433a("Permission not granted", str);
        return false;
    }

    /* renamed from: d */
    public final boolean mo8809d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String a = this.f7133a.f7338g.mo8573a("debug.firebase.analytics.app", Objects.EMPTY_STRING);
        C3010ja jaVar = this.f7133a.f7337f;
        return a.equals(str);
    }

    /* renamed from: e */
    public final int mo8810e(String str) {
        String str2 = "event param";
        if (!mo8799a(str2, str)) {
            return 3;
        }
        if (!mo8802a(str2, (String[]) null, str)) {
            return 14;
        }
        return !mo8798a(str2, 40, str) ? 3 : 0;
    }

    /* renamed from: f */
    public final int mo8811f(String str) {
        String str2 = "event param";
        if (!mo8805b(str2, str)) {
            return 3;
        }
        if (!mo8802a(str2, (String[]) null, str)) {
            return 14;
        }
        return !mo8798a(str2, 40, str) ? 3 : 0;
    }

    /* renamed from: g */
    public final int mo8812g(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return (!this.f7133a.f7338g.mo8574a(C3069p.f7735l0) || !"_lgclid".equals(str)) ? 36 : 100;
    }

    /* renamed from: m */
    public final void mo8666m() {
        mo8279c();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                mo8285i().f7156i.mo8432a("Utils falling back to Random for random id");
            }
        }
        this.f7947d.set(nextLong);
    }

    /* renamed from: q */
    public final boolean mo8306q() {
        return true;
    }

    /* renamed from: s */
    public final long mo8813s() {
        long andIncrement;
        long j;
        if (this.f7947d.get() == 0) {
            synchronized (this.f7947d) {
                long nanoTime = System.nanoTime();
                if (((C2284c) this.f7133a.f7345n) != null) {
                    long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                    int i = this.f7948e + 1;
                    this.f7948e = i;
                    j = nextLong + ((long) i);
                } else {
                    throw null;
                }
            }
            return j;
        }
        synchronized (this.f7947d) {
            this.f7947d.compareAndSet(-1, 1);
            andIncrement = this.f7947d.getAndIncrement();
        }
        return andIncrement;
    }

    /* renamed from: t */
    public final SecureRandom mo8814t() {
        mo8279c();
        if (this.f7946c == null) {
            this.f7946c = new SecureRandom();
        }
        return this.f7946c;
    }

    /* renamed from: u */
    public final int mo8815u() {
        if (this.f7949f == null) {
            C2124f fVar = C2124f.f5997b;
            Context context = this.f7133a.f7332a;
            if (fVar != null) {
                this.f7949f = Integer.valueOf(C2129i.m4922a(context) / 1000);
            } else {
                throw null;
            }
        }
        return this.f7949f.intValue();
    }

    /* renamed from: v */
    public final String mo8816v() {
        byte[] bArr = new byte[16];
        mo8814t().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* renamed from: b */
    public final boolean mo8806b(String str, String str2, int i, Object obj) {
        int i2;
        if (obj instanceof Parcelable[]) {
            i2 = ((Parcelable[]) obj).length;
        } else {
            if (obj instanceof ArrayList) {
                i2 = ((ArrayList) obj).size();
            }
            return true;
        }
        if (i2 > i) {
            mo8285i().f7158k.mo8435a("Parameter array is too long; discarded. Value kind, name, array length", str, str2, Integer.valueOf(i2));
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static long m7401a(C3036m mVar) {
        long j = 0;
        if (mVar == null) {
            return 0;
        }
        for (String a : mVar.f7556e.keySet()) {
            Object a2 = mVar.mo8636a(a);
            if (a2 instanceof Parcelable[]) {
                j += (long) ((Parcelable[]) a2).length;
            }
        }
        return j;
    }

    /* renamed from: a */
    public final Bundle mo8777a(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            String str5 = "gclid";
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter(str5);
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(str5, str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String str6 = "aclid";
            String queryParameter3 = uri.getQueryParameter(str6);
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(str6, queryParameter3);
            }
            String str7 = "cp1";
            String queryParameter4 = uri.getQueryParameter(str7);
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString(str7, queryParameter4);
            }
            String str8 = "anid";
            String queryParameter5 = uri.getQueryParameter(str8);
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString(str8, queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            mo8285i().f7156i.mo8433a("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* renamed from: a */
    public final Bundle mo8778a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a = mo8781a(str, bundle.get(str));
                if (a == null) {
                    mo8285i().f7158k.mo8433a("Param value can't be null", mo8281e().mo8837b(str));
                } else {
                    mo8786a(bundle2, str, a);
                }
            }
        }
        return bundle2;
    }

    /* renamed from: a */
    public final Bundle mo8779a(String str, String str2, Bundle bundle, List<String> list, boolean z, boolean z2) {
        int i;
        int i2;
        Bundle bundle2;
        String str3;
        int i3;
        String str4 = str2;
        Bundle bundle3 = bundle;
        List<String> list2 = list;
        boolean z3 = C2602oa.m6203b() && this.f7133a.f7338g.mo8574a(C3069p.f7683I0);
        boolean a = z3 ? m7411a(str4, C2946e6.f7283c) : z2;
        if (bundle3 == null) {
            return null;
        }
        Bundle bundle4 = new Bundle(bundle3);
        int m = this.f7133a.f7338g.mo8582m();
        int i4 = 0;
        for (String str5 : this.f7133a.f7338g.mo8578c(str, C3069p.f7715b0) ? new TreeSet(bundle.keySet()) : bundle.keySet()) {
            if (list2 == null || !list2.contains(str5)) {
                i = z ? mo8810e(str5) : 0;
                if (i == 0) {
                    i = mo8811f(str5);
                }
            } else {
                i = 0;
            }
            if (i != 0) {
                m7405a(bundle4, i, str5, (Object) i == 3 ? str5 : null);
                bundle4.remove(str5);
                i2 = m;
                bundle2 = bundle4;
            } else {
                String str6 = str5;
                i2 = m;
                Bundle bundle5 = bundle4;
                int a2 = mo8776a(str, str2, str5, bundle3.get(str5), bundle4, list, z, a);
                if (!z3 || a2 != 17) {
                    str3 = str6;
                    bundle2 = bundle5;
                    if (a2 != 0 && !"_ev".equals(str3)) {
                        m7405a(bundle2, a2, a2 == 21 ? str4 : str3, bundle3.get(str3));
                        bundle2.remove(str3);
                    }
                } else {
                    str3 = str6;
                    bundle2 = bundle5;
                    m7405a(bundle2, a2, str3, (Object) Boolean.valueOf(false));
                }
                if (m7417h(str3)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    if (i5 > i3) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Event can't contain more than ");
                        sb.append(i3);
                        sb.append(" params");
                        mo8285i().f7155h.mo8434a(sb.toString(), mo8281e().mo8834a(str4), mo8281e().mo8833a(bundle3));
                        m7408a(bundle2, 5);
                        bundle2.remove(str3);
                        String str7 = str;
                        i4 = i5;
                        m = i3;
                        bundle4 = bundle2;
                    } else {
                        i4 = i5;
                    }
                } else {
                    i3 = i2;
                }
                String str8 = str;
                m = i3;
                bundle4 = bundle2;
            }
            String str9 = str;
            bundle4 = bundle2;
            m = i2;
        }
        return bundle4;
    }

    /* renamed from: a */
    public final C3047n mo8782a(String str, String str2, Bundle bundle, String str3, long j) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo8775a(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            String str4 = "_o";
            bundle2.putString(str4, str3);
            String str5 = str2;
            C3047n nVar = new C3047n(str5, new C3036m(mo8778a(mo8779a(str, str2, bundle2, Collections.singletonList(str4), false, false))), str3, j);
            return nVar;
        }
        mo8285i().f7153f.mo8433a("Invalid conditional property event name", mo8281e().mo8838c(str2));
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final Object mo8780a(int i, Object obj, boolean z, boolean z2) {
        Parcelable[] parcelableArr;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return m7404a(String.valueOf(obj), i, z);
            }
            if (!C2602oa.m6203b() || !this.f7133a.f7338g.mo8574a(C3069p.f7681H0) || !this.f7133a.f7338g.mo8574a(C3069p.f7679G0) || !z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle a = mo8778a((Bundle) parcelable);
                    if (!a.isEmpty()) {
                        arrayList.add(a);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* renamed from: a */
    public final void mo8784a(Bundle bundle, long j) {
        String str = "_et";
        long j2 = bundle.getLong(str);
        if (j2 != 0) {
            mo8285i().f7156i.mo8433a("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong(str, j + j2);
    }

    /* renamed from: a */
    public final void mo8786a(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!C2602oa.m6203b() || !this.f7133a.f7338g.mo8574a(C3069p.f7681H0) || !this.f7133a.f7338g.mo8574a(C3069p.f7679G0) || !(obj instanceof Bundle[])) {
                if (str != null) {
                    mo8285i().f7158k.mo8434a("Not putting event parameter. Invalid value type. name, type", mo8281e().mo8837b(str), obj != null ? obj.getClass().getSimpleName() : null);
                }
            } else {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            }
        }
    }

    /* renamed from: a */
    public final void mo8788a(C2626pe peVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            peVar.mo7874a(bundle);
        } catch (RemoteException e) {
            this.f7133a.mo8285i().f7156i.mo8433a("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo8789a(C2626pe peVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            peVar.mo7874a(bundle);
        } catch (RemoteException e) {
            this.f7133a.mo8285i().f7156i.mo8433a("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo8790a(C2626pe peVar, Bundle bundle) {
        try {
            peVar.mo7874a(bundle);
        } catch (RemoteException e) {
            this.f7133a.mo8285i().f7156i.mo8433a("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo8791a(C2626pe peVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            peVar.mo7874a(bundle);
        } catch (RemoteException e) {
            this.f7133a.mo8285i().f7156i.mo8433a("Error returning string value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo8792a(C2626pe peVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            peVar.mo7874a(bundle);
        } catch (RemoteException e) {
            this.f7133a.mo8285i().f7156i.mo8433a("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo8793a(C2626pe peVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            peVar.mo7874a(bundle);
        } catch (RemoteException e) {
            this.f7133a.mo8285i().f7156i.mo8433a("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo8794a(C2626pe peVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            peVar.mo7874a(bundle);
        } catch (RemoteException e) {
            this.f7133a.mo8285i().f7156i.mo8433a("Error returning byte array to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo8795a(C2968g4 g4Var, int i) {
        Iterator it = new TreeSet(g4Var.f7324d.keySet()).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (m7417h(str)) {
                i2++;
                if (i2 > i) {
                    StringBuilder sb = new StringBuilder(48);
                    sb.append("Event can't contain more than ");
                    sb.append(i);
                    sb.append(" params");
                    mo8285i().f7155h.mo8434a(sb.toString(), mo8281e().mo8834a(g4Var.f7321a), mo8281e().mo8833a(g4Var.f7324d));
                    m7408a(g4Var.f7324d, 5);
                    g4Var.f7324d.remove(str);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo8787a(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int i;
        int i2;
        String str4;
        int i3;
        String str5;
        String str6 = str2;
        Bundle bundle2 = bundle;
        List<String> list2 = list;
        if (bundle2 != null) {
            boolean a = this.f7133a.f7338g.mo8574a(C3069p.f7683I0);
            if (a) {
                i = 0;
            } else {
                i = this.f7133a.f7338g.mo8582m();
            }
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i4 = 0;
            while (it.hasNext()) {
                String str7 = (String) it.next();
                if (list2 == null || !list2.contains(str7)) {
                    i2 = z ? mo8810e(str7) : 0;
                    if (i2 == 0) {
                        i2 = mo8811f(str7);
                    }
                } else {
                    i2 = 0;
                }
                if (i2 != 0) {
                    m7405a(bundle2, i2, str7, (Object) i2 == 3 ? str7 : null);
                    bundle2.remove(str7);
                } else {
                    if (m7409a(bundle2.get(str7))) {
                        mo8285i().f7158k.mo8435a("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str6, str3, str7);
                        i3 = 22;
                        str4 = str7;
                    } else {
                        String str8 = str3;
                        str4 = str7;
                        i3 = mo8776a(str, str2, str7, bundle2.get(str7), bundle, list, z, false);
                    }
                    if (i3 != 0 && !"_ev".equals(str4)) {
                        m7405a(bundle2, i3, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    } else if (m7417h(str4) && (!a || !m7411a(str4, C2934d6.f7248d))) {
                        int i5 = i4 + 1;
                        if (i5 > i) {
                            if (a) {
                                str5 = "Item cannot contain custom parameters";
                            } else {
                                StringBuilder sb = new StringBuilder(63);
                                sb.append("Child bundles can't contain more than ");
                                sb.append(i);
                                sb.append(" custom params");
                                str5 = sb.toString();
                            }
                            mo8285i().f7155h.mo8434a(str5, mo8281e().mo8834a(str6), mo8281e().mo8833a(bundle2));
                            m7408a(bundle2, a ? 23 : 5);
                            bundle2.remove(str4);
                        }
                        i4 = i5;
                    }
                }
            }
        }
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: a */
    public final boolean mo8797a(String str, double d) {
        try {
            Editor edit = this.f7133a.f7332a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d));
            return edit.commit();
        } catch (Exception e) {
            mo8285i().f7153f.mo8433a("Failed to persist Deferred Deep Link. exception", e);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo8798a(String str, int i, String str2) {
        if (str2 == null) {
            mo8285i().f7155h.mo8433a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            mo8285i().f7155h.mo8435a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo8799a(String str, String str2) {
        if (str2 == null) {
            mo8285i().f7155h.mo8433a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo8285i().f7155h.mo8433a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                mo8285i().f7155h.mo8434a("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    mo8285i().f7155h.mo8434a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo8800a(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i) {
                mo8285i().f7158k.mo8435a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo8801a(String str, String str2, String str3) {
        String str4 = "^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$";
        if (!TextUtils.isEmpty(str)) {
            C1061o.m2524b(str);
            if (!str.matches(str4)) {
                if (this.f7133a.mo8475r()) {
                    mo8285i().f7155h.mo8433a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C2908b4.m6745a(str));
                }
                return false;
            }
        } else if (!C2424ec.m5790b() || !this.f7133a.f7338g.mo8574a(C3069p.f7741o0) || TextUtils.isEmpty(str3)) {
            if (!TextUtils.isEmpty(str2)) {
                C1061o.m2524b(str2);
                if (!str2.matches(str4)) {
                    mo8285i().f7155h.mo8433a("Invalid admob_app_id. Analytics disabled.", C2908b4.m6745a(str2));
                    return false;
                }
            } else {
                if (this.f7133a.mo8475r()) {
                    mo8285i().f7155h.mo8432a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo8802a(String str, String[] strArr, String str2) {
        boolean z;
        if (str2 == null) {
            mo8285i().f7155h.mo8433a("Name is required and can't be null. Type", str);
            return false;
        }
        C1061o.m2524b(str2);
        String[] strArr2 = f7944g;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            mo8285i().f7155h.mo8434a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        } else if (strArr == null || !m7411a(str2, strArr)) {
            return true;
        } else {
            mo8285i().f7155h.mo8434a("Name is reserved. Type, name", str, str2);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo8783a(int i, String str, String str2, int i2) {
        Bundle bundle = new Bundle();
        m7408a(bundle, i);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            bundle.putString(str, str2);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        C2969g5 g5Var = this.f7133a;
        C3010ja jaVar = g5Var.f7337f;
        g5Var.mo8472o().mo8561a("auto", "_err", bundle);
    }

    /* renamed from: a */
    public final boolean mo8796a(Context context, String str) {
        C2944e4 e4Var;
        String str2;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = C2294b.m5363b(context).f6270a.getPackageManager().getPackageInfo(str, 64);
            if (!(packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length <= 0)) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(packageInfo.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
        } catch (CertificateException e) {
            e = e;
            e4Var = mo8285i().f7153f;
            str2 = "Error obtaining certificate";
            e4Var.mo8433a(str2, e);
            return true;
        } catch (NameNotFoundException e2) {
            e = e2;
            e4Var = mo8285i().f7153f;
            str2 = "Package name not found";
            e4Var.mo8433a(str2, e);
            return true;
        }
        return true;
    }
}
