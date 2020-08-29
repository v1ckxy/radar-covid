package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.p127k.C1061o;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;
import p213q.p217b.p218a.p231b.p251g.p256e.C2340a1;
import p213q.p217b.p218a.p231b.p251g.p256e.C2340a1.C2341a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2378c1;
import p213q.p217b.p218a.p231b.p251g.p256e.C2378c1.C2379a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2395d1;
import p213q.p217b.p218a.p231b.p251g.p256e.C2412e1;
import p213q.p217b.p218a.p231b.p251g.p256e.C2412e1.C2413a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2447g1;
import p213q.p217b.p218a.p231b.p251g.p256e.C2467h1;
import p213q.p217b.p218a.p231b.p251g.p256e.C2484i1;
import p213q.p217b.p218a.p231b.p251g.p256e.C2484i1.C2485a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2556m0;
import p213q.p217b.p218a.p231b.p251g.p256e.C2573n0;
import p213q.p217b.p218a.p231b.p251g.p256e.C2591o0;
import p213q.p217b.p218a.p231b.p251g.p256e.C2602oa;
import p213q.p217b.p218a.p231b.p251g.p256e.C2608p0;
import p213q.p217b.p218a.p231b.p251g.p256e.C2635q6;
import p213q.p217b.p218a.p231b.p251g.p256e.C2668s7;
import p213q.p217b.p218a.p231b.p251g.p256e.C2698u5;
import p213q.p217b.p218a.p231b.p251g.p256e.C2714v4;
import p213q.p217b.p218a.p231b.p251g.p256e.C2756y0;
import p213q.p217b.p218a.p231b.p251g.p256e.C2772z0;

/* renamed from: q.b.a.b.h.b.t9 */
public final class C3123t9 extends C3046m9 {
    public C3123t9(C3033l9 l9Var) {
        super(l9Var);
    }

    /* renamed from: a */
    public static int m7332a(C2413a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i = 0; i < ((C2412e1) aVar.f6618f).zzg.size(); i++) {
            if (str.equals(((C2484i1) ((C2412e1) aVar.f6618f).zzg.get(i)).zze)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static String m7333a(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static List<Long> m7334a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m7337a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: a */
    public static void m7338a(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m7337a(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* renamed from: a */
    public static boolean m7340a(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: a */
    public static boolean m7341a(List<Long> list, int i) {
        if (i < (list.size() << 6)) {
            if (((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m7342a(C3047n nVar, C3189z9 z9Var) {
        C1061o.m2524b(nVar);
        C1061o.m2524b(z9Var);
        return !TextUtils.isEmpty(z9Var.f8018f) || !TextUtils.isEmpty(z9Var.f8034v);
    }

    /* renamed from: b */
    public static C2378c1 m7343b(C2340a1 a1Var, String str) {
        for (C2378c1 c1Var : a1Var.zzd) {
            if (c1Var.zzd.equals(str)) {
                return c1Var;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final byte[] mo8747c(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            mo8285i().f7153f.mo8433a("Failed to gzip content", e);
            throw e;
        }
    }

    /* renamed from: o */
    public final boolean mo8276o() {
        return false;
    }

    /* renamed from: s */
    public final List<Integer> mo8748s() {
        Map a = C3069p.m7217a(this.f7580b.f7537i.f7332a);
        if (a == null || a.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Integer) C3069p.f7696P.mo8702a(null)).intValue();
        Iterator it = a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            mo8285i().f7156i.mo8433a("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    mo8285i().f7156i.mo8433a("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: b */
    public final byte[] mo8746b(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            mo8285i().f7153f.mo8433a("Failed to ungzip content", e);
            throw e;
        }
    }

    /* renamed from: a */
    public final long mo8732a(byte[] bArr) {
        C1061o.m2524b(bArr);
        mo8287k().mo8279c();
        MessageDigest w = C3156w9.m7419w();
        if (w != null) {
            return C3156w9.m7402a(w.digest(bArr));
        }
        mo8285i().f7153f.mo8432a("Failed to get MD5");
        return 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        mo8285i().f7153f.mo8432a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T mo8733a(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ b -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ b -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ b -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ b -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ b -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002b
        L_0x001c:
            q.b.a.b.h.b.b4 r5 = r4.mo8285i()     // Catch:{ all -> 0x001a }
            q.b.a.b.h.b.e4 r5 = r5.f7153f     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo8432a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002b:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.mo8733a(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* renamed from: a */
    public final C2340a1 mo8738a(C3011k kVar) {
        C2341a n = C2340a1.m5426n();
        n.mo7362b(kVar.f7470e);
        C3036m mVar = kVar.f7471f;
        if (mVar != null) {
            for (String str : mVar.f7556e.keySet()) {
                C2379a s = C2378c1.m5579s();
                s.mo7482a(str);
                mo8743a(s, kVar.f7471f.mo8636a(str));
                n.mo7359a(s);
            }
            return (C2340a1) ((C2490i6) n.mo7778m());
        }
        throw null;
    }

    /* renamed from: a */
    public static <Builder extends C2668s7> Builder m7336a(Builder builder, byte[] bArr) {
        C2698u5 b = C2698u5.m6463b();
        Builder builder2 = (C2714v4) builder;
        if (b != null) {
            if (builder2 != null) {
                Builder builder3 = (C2491a) builder2;
                builder3.mo7774a(bArr, bArr.length, b);
                return builder3;
            }
            throw null;
        } else if (builder2 != null) {
            Builder builder4 = (C2491a) builder2;
            builder4.mo7774a(bArr, bArr.length, C2698u5.m6462a());
            return builder4;
        } else {
            throw null;
        }
    }

    /* renamed from: a */
    public final String mo8736a(C2591o0 o0Var) {
        if (o0Var == null) {
            return Objects.NULL_STRING;
        }
        StringBuilder a = C1965a.m4756a("\nproperty_filter {\n");
        if (o0Var.mo7904a()) {
            m7338a(a, 0, "filter_id", (Object) Integer.valueOf(o0Var.zzd));
        }
        m7338a(a, 0, "property_name", (Object) mo8281e().mo8838c(o0Var.zze));
        String a2 = m7333a(o0Var.zzg, o0Var.zzh, o0Var.zzi);
        if (!a2.isEmpty()) {
            m7338a(a, 0, "filter_type", (Object) a2);
        }
        C2556m0 m0Var = o0Var.zzf;
        if (m0Var == null) {
            m0Var = C2556m0.zzh;
        }
        mo8741a(a, 1, m0Var);
        a.append("}\n");
        return a.toString();
    }

    /* renamed from: a */
    public final String mo8735a(C2395d1 d1Var) {
        if (d1Var == null) {
            return Objects.EMPTY_STRING;
        }
        StringBuilder a = C1965a.m4756a("\nbatch {\n");
        Iterator it = d1Var.zzc.iterator();
        while (true) {
            String str = "}\n";
            if (it.hasNext()) {
                C2412e1 e1Var = (C2412e1) it.next();
                if (e1Var != null) {
                    m7337a(a, 1);
                    a.append("bundle {\n");
                    if ((e1Var.zzc & 1) != 0) {
                        m7338a(a, 1, "protocol_version", (Object) Integer.valueOf(e1Var.zze));
                    }
                    m7338a(a, 1, "platform", (Object) e1Var.zzm);
                    if ((e1Var.zzc & 16384) != 0) {
                        m7338a(a, 1, "gmp_version", (Object) Long.valueOf(e1Var.zzu));
                    }
                    if ((e1Var.zzc & 32768) != 0) {
                        m7338a(a, 1, "uploading_gmp_version", (Object) Long.valueOf(e1Var.zzv));
                    }
                    if ((e1Var.zzd & 16) != 0) {
                        m7338a(a, 1, "dynamite_version", (Object) Long.valueOf(e1Var.zzas));
                    }
                    if ((e1Var.zzc & 536870912) != 0) {
                        m7338a(a, 1, "config_version", (Object) Long.valueOf(e1Var.zzak));
                    }
                    m7338a(a, 1, "gmp_app_id", (Object) e1Var.zzac);
                    m7338a(a, 1, "admob_app_id", (Object) e1Var.zzap);
                    m7338a(a, 1, "app_id", (Object) e1Var.zzs);
                    m7338a(a, 1, "app_version", (Object) e1Var.zzt);
                    if ((e1Var.zzc & 33554432) != 0) {
                        m7338a(a, 1, "app_version_major", (Object) Integer.valueOf(e1Var.zzag));
                    }
                    m7338a(a, 1, "firebase_instance_id", (Object) e1Var.zzaf);
                    if ((e1Var.zzc & 524288) != 0) {
                        m7338a(a, 1, "dev_cert_hash", (Object) Long.valueOf(e1Var.zzz));
                    }
                    m7338a(a, 1, "app_store", (Object) e1Var.zzr);
                    if ((e1Var.zzc & 2) != 0) {
                        m7338a(a, 1, "upload_timestamp_millis", (Object) Long.valueOf(e1Var.zzh));
                    }
                    if ((e1Var.zzc & 4) != 0) {
                        m7338a(a, 1, "start_timestamp_millis", (Object) Long.valueOf(e1Var.zzi));
                    }
                    if ((e1Var.zzc & 8) != 0) {
                        m7338a(a, 1, "end_timestamp_millis", (Object) Long.valueOf(e1Var.zzj));
                    }
                    if ((e1Var.zzc & 16) != 0) {
                        m7338a(a, 1, "previous_bundle_start_timestamp_millis", (Object) Long.valueOf(e1Var.zzk));
                    }
                    if ((e1Var.zzc & 32) != 0) {
                        m7338a(a, 1, "previous_bundle_end_timestamp_millis", (Object) Long.valueOf(e1Var.zzl));
                    }
                    m7338a(a, 1, "app_instance_id", (Object) e1Var.zzy);
                    m7338a(a, 1, "resettable_device_id", (Object) e1Var.zzw);
                    m7338a(a, 1, "device_id", (Object) e1Var.zzaj);
                    m7338a(a, 1, "ds_id", (Object) e1Var.zzam);
                    if ((e1Var.zzc & 131072) != 0) {
                        m7338a(a, 1, "limited_ad_tracking", (Object) Boolean.valueOf(e1Var.zzx));
                    }
                    m7338a(a, 1, "os_version", (Object) e1Var.zzn);
                    m7338a(a, 1, "device_model", (Object) e1Var.zzo);
                    m7338a(a, 1, "user_default_language", (Object) e1Var.zzp);
                    if ((e1Var.zzc & 1024) != 0) {
                        m7338a(a, 1, "time_zone_offset_minutes", (Object) Integer.valueOf(e1Var.zzq));
                    }
                    if ((e1Var.zzc & 1048576) != 0) {
                        m7338a(a, 1, "bundle_sequential_index", (Object) Integer.valueOf(e1Var.zzaa));
                    }
                    if ((e1Var.zzc & 8388608) != 0) {
                        m7338a(a, 1, "service_upload", (Object) Boolean.valueOf(e1Var.zzad));
                    }
                    m7338a(a, 1, "health_monitor", (Object) e1Var.zzab);
                    if (!this.f7133a.f7338g.mo8574a(C3069p.f7691M0)) {
                        if ((e1Var.zzc & 1073741824) != 0) {
                            long j = e1Var.zzal;
                            if (j != 0) {
                                m7338a(a, 1, "android_id", (Object) Long.valueOf(j));
                            }
                        }
                    }
                    if ((e1Var.zzd & 2) != 0) {
                        m7338a(a, 1, "retry_counter", (Object) Integer.valueOf(e1Var.zzao));
                    }
                    C2635q6<C2484i1> q6Var = e1Var.zzg;
                    String str2 = "name";
                    if (q6Var != null) {
                        for (C2484i1 i1Var : q6Var) {
                            if (i1Var != null) {
                                m7337a(a, 2);
                                a.append("user_property {\n");
                                Double d = null;
                                m7338a(a, 2, "set_timestamp_millis", (i1Var.zzc & 1) != 0 ? Long.valueOf(i1Var.zzd) : null);
                                m7338a(a, 2, str2, (Object) mo8281e().mo8838c(i1Var.zze));
                                m7338a(a, 2, "string_value", (Object) i1Var.zzf);
                                m7338a(a, 2, "int_value", (i1Var.zzc & 8) != 0 ? Long.valueOf(i1Var.zzg) : null);
                                if ((i1Var.zzc & 32) != 0) {
                                    d = Double.valueOf(i1Var.zzi);
                                }
                                m7338a(a, 2, "double_value", (Object) d);
                                m7337a(a, 2);
                                a.append(str);
                            }
                        }
                    }
                    C2635q6<C2756y0> q6Var2 = e1Var.zzae;
                    if (q6Var2 != null) {
                        for (C2756y0 y0Var : q6Var2) {
                            if (y0Var != null) {
                                m7337a(a, 2);
                                a.append("audience_membership {\n");
                                if ((y0Var.zzc & 1) != 0) {
                                    m7338a(a, 2, "audience_id", (Object) Integer.valueOf(y0Var.zzd));
                                }
                                if ((y0Var.zzc & 8) != 0) {
                                    m7338a(a, 2, "new_audience", (Object) Boolean.valueOf(y0Var.zzg));
                                }
                                C2447g1 g1Var = y0Var.zze;
                                if (g1Var == null) {
                                    g1Var = C2447g1.zzg;
                                }
                                m7339a(a, 2, "current_data", g1Var);
                                if ((y0Var.zzc & 4) != 0) {
                                    C2447g1 g1Var2 = y0Var.zzf;
                                    if (g1Var2 == null) {
                                        g1Var2 = C2447g1.zzg;
                                    }
                                    m7339a(a, 2, "previous_data", g1Var2);
                                }
                                m7337a(a, 2);
                                a.append(str);
                            }
                        }
                    }
                    C2635q6<C2340a1> q6Var3 = e1Var.zzf;
                    if (q6Var3 != null) {
                        for (C2340a1 a1Var : q6Var3) {
                            if (a1Var != null) {
                                m7337a(a, 2);
                                a.append("event {\n");
                                m7338a(a, 2, str2, (Object) mo8281e().mo8834a(a1Var.zze));
                                if (a1Var.mo7353l()) {
                                    m7338a(a, 2, "timestamp_millis", (Object) Long.valueOf(a1Var.zzf));
                                }
                                if ((a1Var.zzc & 4) != 0) {
                                    m7338a(a, 2, "previous_timestamp_millis", (Object) Long.valueOf(a1Var.zzg));
                                }
                                if ((a1Var.zzc & 8) != 0) {
                                    m7338a(a, 2, "count", (Object) Integer.valueOf(a1Var.zzh));
                                }
                                if (a1Var.zzd.size() != 0) {
                                    mo8740a(a, 2, (List<C2378c1>) a1Var.zzd);
                                }
                                m7337a(a, 2);
                                a.append(str);
                            }
                        }
                    }
                    m7337a(a, 1);
                    a.append(str);
                }
            } else {
                a.append(str);
                return a.toString();
            }
        }
    }

    /* renamed from: a */
    public final List<Long> mo8737a(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                mo8285i().f7156i.mo8433a("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    mo8285i().f7156i.mo8434a("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* renamed from: a */
    public static List<C2378c1> m7335a(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                C2379a s = C2378c1.m5579s();
                for (String str : bundle.keySet()) {
                    C2379a s2 = C2378c1.m5579s();
                    s2.mo7482a(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        s2.mo7480a(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        s2.mo7483b((String) obj);
                    } else if (obj instanceof Double) {
                        s2.mo7479a(((Double) obj).doubleValue());
                    }
                    if (s.f6619g) {
                        s.mo7776k();
                        s.f6619g = false;
                    }
                    C2378c1.m5577a((C2378c1) s.f6618f, (C2378c1) ((C2490i6) s2.mo7778m()));
                }
                if (((C2378c1) s.f6618f).mo7478r() > 0) {
                    arrayList.add((C2378c1) ((C2490i6) s.mo7778m()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo8742a(C2341a aVar, String str, Object obj) {
        List a = aVar.mo7355a();
        int i = 0;
        while (true) {
            if (i >= a.size()) {
                i = -1;
                break;
            } else if (str.equals(((C2378c1) a.get(i)).zzd)) {
                break;
            } else {
                i++;
            }
        }
        C2379a s = C2378c1.m5579s();
        s.mo7482a(str);
        if (obj instanceof Long) {
            s.mo7480a(((Long) obj).longValue());
        } else if (obj instanceof String) {
            s.mo7483b((String) obj);
        } else if (obj instanceof Double) {
            s.mo7479a(((Double) obj).doubleValue());
        } else if (C2602oa.m6203b() && this.f7133a.f7338g.mo8574a(C3069p.f7679G0) && (obj instanceof Bundle[])) {
            s.mo7481a((Iterable<? extends C2378c1>) m7335a((Bundle[]) obj));
        }
        if (i >= 0) {
            if (aVar.f6619g) {
                aVar.mo7776k();
                aVar.f6619g = false;
            }
            C2340a1.m5422a((C2340a1) aVar.f6618f, i, (C2378c1) ((C2490i6) s.mo7778m()));
            return;
        }
        aVar.mo7359a(s);
    }

    /* renamed from: a */
    public final void mo8743a(C2379a aVar, Object obj) {
        C1061o.m2524b(obj);
        if (aVar.f6619g) {
            aVar.mo7776k();
            aVar.f6619g = false;
        }
        C2378c1 c1Var = (C2378c1) aVar.f6618f;
        c1Var.zzc &= -3;
        c1Var.zze = C2378c1.zzj.zze;
        if (aVar.f6619g) {
            aVar.mo7776k();
            aVar.f6619g = false;
        }
        C2378c1 c1Var2 = (C2378c1) aVar.f6618f;
        c1Var2.zzc &= -5;
        c1Var2.zzf = 0;
        if (aVar.f6619g) {
            aVar.mo7776k();
            aVar.f6619g = false;
        }
        C2378c1 c1Var3 = (C2378c1) aVar.f6618f;
        c1Var3.zzc &= -17;
        c1Var3.zzh = 0.0d;
        if (aVar.f6619g) {
            aVar.mo7776k();
            aVar.f6619g = false;
        }
        C2378c1.m5575a((C2378c1) aVar.f6618f);
        if (obj instanceof String) {
            aVar.mo7483b((String) obj);
        } else if (obj instanceof Long) {
            aVar.mo7480a(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.mo7479a(((Double) obj).doubleValue());
        } else if (!C2602oa.m6203b() || !this.f7133a.f7338g.mo8574a(C3069p.f7679G0) || !(obj instanceof Bundle[])) {
            mo8285i().f7153f.mo8433a("Ignoring invalid (type) event param value", obj);
        } else {
            aVar.mo7481a((Iterable<? extends C2378c1>) m7335a((Bundle[]) obj));
        }
    }

    /* renamed from: a */
    public final void mo8744a(C2485a aVar, Object obj) {
        C1061o.m2524b(obj);
        if (aVar.f6619g) {
            aVar.mo7776k();
            aVar.f6619g = false;
        }
        C2484i1 i1Var = (C2484i1) aVar.f6618f;
        i1Var.zzc &= -5;
        i1Var.zzf = C2484i1.zzj.zzf;
        if (aVar.f6619g) {
            aVar.mo7776k();
            aVar.f6619g = false;
        }
        C2484i1 i1Var2 = (C2484i1) aVar.f6618f;
        i1Var2.zzc &= -9;
        i1Var2.zzg = 0;
        if (aVar.f6619g) {
            aVar.mo7776k();
            aVar.f6619g = false;
        }
        C2484i1 i1Var3 = (C2484i1) aVar.f6618f;
        i1Var3.zzc &= -33;
        i1Var3.zzi = 0.0d;
        if (obj instanceof String) {
            String str = (String) obj;
            if (aVar.f6619g) {
                aVar.mo7776k();
                aVar.f6619g = false;
            }
            C2484i1.m5925b((C2484i1) aVar.f6618f, str);
        } else if (obj instanceof Long) {
            aVar.mo7736b(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (aVar.f6619g) {
                aVar.mo7776k();
                aVar.f6619g = false;
            }
            C2484i1 i1Var4 = (C2484i1) aVar.f6618f;
            i1Var4.zzc |= 32;
            i1Var4.zzi = doubleValue;
        } else {
            mo8285i().f7153f.mo8433a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* renamed from: a */
    public final void mo8741a(StringBuilder sb, int i, C2556m0 m0Var) {
        if (m0Var != null) {
            m7337a(sb, i);
            sb.append("filter {\n");
            boolean z = false;
            if ((m0Var.zzc & 4) != 0) {
                m7338a(sb, i, "complement", (Object) Boolean.valueOf(m0Var.zzf));
            }
            if ((m0Var.zzc & 8) != 0) {
                m7338a(sb, i, "param_name", (Object) mo8281e().mo8837b(m0Var.zzg));
            }
            String str = "}\n";
            if (m0Var.mo7860a()) {
                int i2 = i + 1;
                C2608p0 k = m0Var.mo7861k();
                if (k != null) {
                    m7337a(sb, i2);
                    sb.append("string_filter");
                    sb.append(" {\n");
                    if ((k.zzc & 1) != 0) {
                        m7338a(sb, i2, "match_type", (Object) k.mo7929k().name());
                    }
                    if ((k.zzc & 2) != 0) {
                        m7338a(sb, i2, "expression", (Object) k.zze);
                    }
                    if ((k.zzc & 4) != 0) {
                        z = true;
                    }
                    if (z) {
                        m7338a(sb, i2, "case_sensitive", (Object) Boolean.valueOf(k.zzf));
                    }
                    if (k.mo7930l() > 0) {
                        m7337a(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String str2 : k.zzg) {
                            m7337a(sb, i2 + 2);
                            sb.append(str2);
                            sb.append("\n");
                        }
                        sb.append(str);
                    }
                    m7337a(sb, i2);
                    sb.append(str);
                }
            }
            if (m0Var.mo7862l()) {
                mo8739a(sb, i + 1, "number_filter", m0Var.mo7863m());
            }
            m7337a(sb, i);
            sb.append(str);
        }
    }

    /* renamed from: a */
    public final void mo8739a(StringBuilder sb, int i, String str, C2573n0 n0Var) {
        if (n0Var != null) {
            m7337a(sb, i);
            sb.append(str);
            sb.append(" {\n");
            boolean z = true;
            if ((n0Var.zzc & 1) != 0) {
                m7338a(sb, i, "comparison_type", (Object) n0Var.mo7876k().name());
            }
            if ((n0Var.zzc & 2) != 0) {
                m7338a(sb, i, "match_as_float", (Object) Boolean.valueOf(n0Var.zze));
            }
            if ((n0Var.zzc & 4) != 0) {
                m7338a(sb, i, "comparison_value", (Object) n0Var.zzf);
            }
            if ((n0Var.zzc & 8) != 0) {
                m7338a(sb, i, "min_comparison_value", (Object) n0Var.zzg);
            }
            if ((n0Var.zzc & 16) == 0) {
                z = false;
            }
            if (z) {
                m7338a(sb, i, "max_comparison_value", (Object) n0Var.zzh);
            }
            m7337a(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    public static void m7339a(StringBuilder sb, int i, String str, C2447g1 g1Var) {
        if (g1Var != null) {
            m7337a(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            int size = g1Var.zzd.size();
            String str2 = Objects.ARRAY_ELEMENT_SEPARATOR;
            if (size != 0) {
                m7337a(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long l : g1Var.zzd) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(str2);
                    }
                    sb.append(l);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (g1Var.zzc.size() != 0) {
                m7337a(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long l2 : g1Var.zzc) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(str2);
                    }
                    sb.append(l2);
                    i4 = i5;
                }
                sb.append(10);
            }
            String str3 = "}\n";
            if (g1Var.mo7663l() != 0) {
                m7337a(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (C2772z0 z0Var : g1Var.zze) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(str2);
                    }
                    sb.append((z0Var.zzc & 1) != 0 ? Integer.valueOf(z0Var.zzd) : null);
                    sb.append(":");
                    sb.append((z0Var.zzc & 2) != 0 ? Long.valueOf(z0Var.zze) : null);
                    i6 = i7;
                }
                sb.append(str3);
            }
            if (g1Var.mo7664m() != 0) {
                m7337a(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (C2467h1 h1Var : g1Var.zzf) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(str2);
                    }
                    sb.append((h1Var.zzc & 1) != 0 ? Integer.valueOf(h1Var.zzd) : null);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long longValue : h1Var.zze) {
                        long longValue2 = longValue.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(str2);
                        }
                        sb.append(longValue2);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append(str3);
            }
            m7337a(sb, 3);
            sb.append(str3);
        }
    }

    /* renamed from: a */
    public final void mo8740a(StringBuilder sb, int i, List<C2378c1> list) {
        if (list != null) {
            int i2 = i + 1;
            for (C2378c1 c1Var : list) {
                if (c1Var != null) {
                    m7337a(sb, i2);
                    sb.append("param {\n");
                    String str = "double_value";
                    String str2 = "int_value";
                    String str3 = "string_value";
                    String str4 = "name";
                    Double d = null;
                    if (!C2602oa.m6203b() || !this.f7133a.f7338g.mo8574a(C3069p.f7675E0)) {
                        m7338a(sb, i2, str4, (Object) mo8281e().mo8837b(c1Var.zzd));
                        m7338a(sb, i2, str3, (Object) c1Var.zze);
                        m7338a(sb, i2, str2, c1Var.mo7474n() ? Long.valueOf(c1Var.zzf) : null);
                        if (c1Var.mo7476p()) {
                            d = Double.valueOf(c1Var.zzh);
                        }
                        m7338a(sb, i2, str, (Object) d);
                    } else {
                        m7338a(sb, i2, str4, (c1Var.zzc & 1) != 0 ? mo8281e().mo8837b(c1Var.zzd) : null);
                        m7338a(sb, i2, str3, c1Var.mo7472l() ? c1Var.zze : null);
                        m7338a(sb, i2, str2, c1Var.mo7474n() ? Long.valueOf(c1Var.zzf) : null);
                        if (c1Var.mo7476p()) {
                            d = Double.valueOf(c1Var.zzh);
                        }
                        m7338a(sb, i2, str, (Object) d);
                        if (c1Var.mo7478r() > 0) {
                            mo8740a(sb, i2, (List<C2378c1>) c1Var.zzi);
                        }
                    }
                    m7337a(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo8745a(long j, long j2) {
        if (j != 0 && j2 > 0) {
            if (((C2284c) this.f7133a.f7345n) == null) {
                throw null;
            } else if (Math.abs(System.currentTimeMillis() - j) <= j2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final Object mo8734a(C2340a1 a1Var, String str) {
        C2378c1 b = m7343b(a1Var, str);
        if (b != null) {
            if (b.mo7472l()) {
                return b.zze;
            }
            if (b.mo7474n()) {
                return Long.valueOf(b.zzf);
            }
            if (b.mo7476p()) {
                return Double.valueOf(b.zzh);
            }
            if (C2602oa.m6203b() && this.f7133a.f7338g.mo8574a(C3069p.f7679G0) && b.mo7478r() > 0) {
                C2635q6<C2378c1> q6Var = b.zzi;
                ArrayList arrayList = new ArrayList();
                for (C2378c1 c1Var : q6Var) {
                    if (c1Var != null) {
                        Bundle bundle = new Bundle();
                        for (C2378c1 c1Var2 : c1Var.zzi) {
                            if (c1Var2.mo7472l()) {
                                bundle.putString(c1Var2.zzd, c1Var2.zze);
                            } else if (c1Var2.mo7474n()) {
                                bundle.putLong(c1Var2.zzd, c1Var2.zzf);
                            } else if (c1Var2.mo7476p()) {
                                bundle.putDouble(c1Var2.zzd, c1Var2.zzh);
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
        }
        return null;
    }
}
