package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p124p.p126b.p127k.C1061o;
import p124p.p143e.C1248a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2522k0;
import p213q.p217b.p218a.p231b.p251g.p256e.C2522k0.C2523a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2539l0;
import p213q.p217b.p218a.p231b.p251g.p256e.C2539l0.C2540a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2556m0;
import p213q.p217b.p218a.p231b.p251g.p256e.C2556m0.C2557a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2591o0;
import p213q.p217b.p218a.p231b.p251g.p256e.C2591o0.C2592a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2602oa;
import p213q.p217b.p218a.p231b.p251g.p256e.C2618p6;
import p213q.p217b.p218a.p231b.p251g.p256e.C2692u0;
import p213q.p217b.p218a.p231b.p251g.p256e.C2692u0.C2693a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2709v0;
import p213q.p217b.p218a.p231b.p251g.p256e.C2709v0.C2710a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2725w0;

/* renamed from: q.b.a.b.h.b.a5 */
public final class C2897a5 extends C3046m9 implements C2903b {

    /* renamed from: d */
    public final Map<String, Map<String, String>> f7127d = new C1248a();

    /* renamed from: e */
    public final Map<String, Map<String, Boolean>> f7128e = new C1248a();

    /* renamed from: f */
    public final Map<String, Map<String, Boolean>> f7129f = new C1248a();

    /* renamed from: g */
    public final Map<String, C2709v0> f7130g = new C1248a();

    /* renamed from: h */
    public final Map<String, Map<String, Integer>> f7131h = new C1248a();

    /* renamed from: i */
    public final Map<String, String> f7132i = new C1248a();

    public C2897a5(C3033l9 l9Var) {
        super(l9Var);
    }

    /* renamed from: a */
    public final String mo8263a(String str, String str2) {
        mo8279c();
        mo8275f(str);
        Map map = (Map) this.f7127d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* renamed from: a */
    public final C2709v0 mo8264a(String str) {
        mo8649m();
        mo8279c();
        C1061o.m2528b(str);
        mo8275f(str);
        return (C2709v0) this.f7130g.get(str);
    }

    /* renamed from: a */
    public final C2709v0 mo8265a(String str, byte[] bArr) {
        String str2 = "Unable to merge remote config. appId";
        if (bArr == null) {
            return C2709v0.zzl;
        }
        try {
            C2709v0 v0Var = (C2709v0) ((C2490i6) ((C2710a) C3123t9.m7336a((C2710a) C2709v0.zzl.mo7768g(), bArr)).mo7778m());
            C2944e4 e4Var = mo8285i().f7161n;
            String str3 = "Parsed config. version, gmp_app_id";
            boolean z = true;
            String str4 = null;
            Object valueOf = (v0Var.zzc & 1) != 0 ? Long.valueOf(v0Var.zzd) : null;
            if ((v0Var.zzc & 2) == 0) {
                z = false;
            }
            if (z) {
                str4 = v0Var.zze;
            }
            e4Var.mo8434a(str3, valueOf, str4);
            return v0Var;
        } catch (RuntimeException | C2618p6 e) {
            mo8285i().f7156i.mo8434a(str2, C2908b4.m6745a(str), e);
            return C2709v0.zzl;
        }
    }

    /* renamed from: b */
    public final boolean mo8269b(String str, String str2) {
        mo8279c();
        mo8275f(str);
        String str3 = "1";
        if (str3.equals(mo8263a(str, "measurement.upload.blacklist_internal")) && C3156w9.m7418i(str2)) {
            return true;
        }
        if (str3.equals(mo8263a(str, "measurement.upload.blacklist_public")) && C3156w9.m7417h(str2)) {
            return true;
        }
        Map map = (Map) this.f7128e.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: c */
    public final boolean mo8271c(String str, String str2) {
        mo8279c();
        mo8275f(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        if (C2602oa.m6203b() && this.f7133a.f7338g.mo8574a(C3069p.f7685J0) && ("purchase".equals(str2) || "refund".equals(str2))) {
            return true;
        }
        Map map = (Map) this.f7129f.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: d */
    public final int mo8272d(String str, String str2) {
        mo8279c();
        mo8275f(str);
        Map map = (Map) this.f7131h.get(str);
        if (map == null) {
            return 1;
        }
        Integer num = (Integer) map.get(str2);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    /* renamed from: d */
    public final boolean mo8273d(String str) {
        return "1".equals(mo8263a(str, "measurement.upload.blacklist_internal"));
    }

    /* renamed from: e */
    public final boolean mo8274e(String str) {
        return "1".equals(mo8263a(str, "measurement.upload.blacklist_public"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        if (r2 != null) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8275f(java.lang.String r12) {
        /*
            r11 = this;
            r11.mo8649m()
            r11.mo8279c()
            p124p.p126b.p127k.C1061o.m2528b(r12)
            java.util.Map<java.lang.String, q.b.a.b.g.e.v0> r0 = r11.f7130g
            java.lang.Object r0 = r0.get(r12)
            if (r0 != 0) goto L_0x00d8
            q.b.a.b.h.b.e r0 = r11.mo8652q()
            r1 = 0
            if (r0 == 0) goto L_0x00d7
            p124p.p126b.p127k.C1061o.m2528b(r12)
            r0.mo8279c()
            r0.mo8649m()
            android.database.sqlite.SQLiteDatabase r2 = r0.mo8425t()     // Catch:{ SQLiteException -> 0x0067, all -> 0x0065 }
            java.lang.String r3 = "apps"
            java.lang.String r4 = "remote_config"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x0067, all -> 0x0065 }
            java.lang.String r5 = "app_id=?"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0067, all -> 0x0065 }
            r10 = 0
            r6[r10] = r12     // Catch:{ SQLiteException -> 0x0067, all -> 0x0065 }
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0067, all -> 0x0065 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0063 }
            if (r3 != 0) goto L_0x0046
        L_0x0042:
            r2.close()
            goto L_0x007c
        L_0x0046:
            byte[] r3 = r2.getBlob(r10)     // Catch:{ SQLiteException -> 0x0063 }
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0063 }
            if (r4 == 0) goto L_0x005f
            q.b.a.b.h.b.b4 r4 = r0.mo8285i()     // Catch:{ SQLiteException -> 0x0063 }
            q.b.a.b.h.b.e4 r4 = r4.f7153f     // Catch:{ SQLiteException -> 0x0063 }
            java.lang.String r5 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r6 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r12)     // Catch:{ SQLiteException -> 0x0063 }
            r4.mo8433a(r5, r6)     // Catch:{ SQLiteException -> 0x0063 }
        L_0x005f:
            r2.close()
            goto L_0x007d
        L_0x0063:
            r3 = move-exception
            goto L_0x006a
        L_0x0065:
            r12 = move-exception
            goto L_0x00d1
        L_0x0067:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x006a:
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()     // Catch:{ all -> 0x00cf }
            q.b.a.b.h.b.e4 r0 = r0.f7153f     // Catch:{ all -> 0x00cf }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r12)     // Catch:{ all -> 0x00cf }
            r0.mo8434a(r4, r5, r3)     // Catch:{ all -> 0x00cf }
            if (r2 == 0) goto L_0x007c
            goto L_0x0042
        L_0x007c:
            r3 = r1
        L_0x007d:
            if (r3 != 0) goto L_0x009e
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = r11.f7127d
            r0.put(r12, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r0 = r11.f7128e
            r0.put(r12, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r0 = r11.f7129f
            r0.put(r12, r1)
            java.util.Map<java.lang.String, q.b.a.b.g.e.v0> r0 = r11.f7130g
            r0.put(r12, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r11.f7132i
            r0.put(r12, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r0 = r11.f7131h
            r0.put(r12, r1)
            return
        L_0x009e:
            q.b.a.b.g.e.v0 r0 = r11.mo8265a(r12, r3)
            q.b.a.b.g.e.i6$a r0 = r0.mo7769h()
            q.b.a.b.g.e.v0$a r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2709v0.C2710a) r0
            r11.mo8266a(r12, r0)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r2 = r11.f7127d
            q.b.a.b.g.e.p7 r3 = r0.mo7778m()
            q.b.a.b.g.e.i6 r3 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r3
            q.b.a.b.g.e.v0 r3 = (p213q.p217b.p218a.p231b.p251g.p256e.C2709v0) r3
            java.util.Map r3 = m6699a(r3)
            r2.put(r12, r3)
            java.util.Map<java.lang.String, q.b.a.b.g.e.v0> r2 = r11.f7130g
            q.b.a.b.g.e.p7 r0 = r0.mo7778m()
            q.b.a.b.g.e.i6 r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r0
            q.b.a.b.g.e.v0 r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2709v0) r0
            r2.put(r12, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r11.f7132i
            r0.put(r12, r1)
            goto L_0x00d8
        L_0x00cf:
            r12 = move-exception
            r1 = r2
        L_0x00d1:
            if (r1 == 0) goto L_0x00d6
            r1.close()
        L_0x00d6:
            throw r12
        L_0x00d7:
            throw r1
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C2897a5.mo8275f(java.lang.String):void");
    }

    /* renamed from: o */
    public final boolean mo8276o() {
        return false;
    }

    /* renamed from: c */
    public final long mo8270c(String str) {
        String a = mo8263a(str, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty(a)) {
            try {
                return Long.parseLong(a);
            } catch (NumberFormatException e) {
                mo8285i().f7156i.mo8434a("Unable to parse timezone offset. appId", C2908b4.m6745a(str), e);
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final boolean mo8268b(String str) {
        mo8279c();
        C2709v0 a = mo8264a(str);
        if (a == null) {
            return false;
        }
        return a.zzk;
    }

    /* renamed from: a */
    public static Map<String, String> m6699a(C2709v0 v0Var) {
        C1248a aVar = new C1248a();
        if (v0Var != null) {
            for (C2725w0 w0Var : v0Var.zzg) {
                aVar.put(w0Var.zzd, w0Var.zze);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo8266a(String str, C2710a aVar) {
        C1248a aVar2 = new C1248a();
        C1248a aVar3 = new C1248a();
        C1248a aVar4 = new C1248a();
        if (aVar != null) {
            for (int i = 0; i < ((C2709v0) aVar.f6618f).zzh.size(); i++) {
                C2693a aVar5 = (C2693a) ((C2692u0) ((C2709v0) aVar.f6618f).zzh.get(i)).mo7769h();
                if (TextUtils.isEmpty(aVar5.mo8044a())) {
                    mo8285i().f7156i.mo8432a("EventConfig contained null event name");
                } else {
                    String a = C2286e.m5191a(aVar5.mo8044a(), C2946e6.f7281a, C2946e6.f7282b);
                    if (!TextUtils.isEmpty(a)) {
                        if (aVar5.f6619g) {
                            aVar5.mo7776k();
                            aVar5.f6619g = false;
                        }
                        C2692u0.m6453a((C2692u0) aVar5.f6618f, a);
                        if (aVar.f6619g) {
                            aVar.mo7776k();
                            aVar.f6619g = false;
                        }
                        C2709v0.m6485a((C2709v0) aVar.f6618f, i, (C2692u0) ((C2490i6) aVar5.mo7778m()));
                    }
                    aVar2.put(aVar5.mo8044a(), Boolean.valueOf(((C2692u0) aVar5.f6618f).zze));
                    aVar3.put(aVar5.mo8044a(), Boolean.valueOf(((C2692u0) aVar5.f6618f).zzf));
                    if ((((C2692u0) aVar5.f6618f).zzc & 8) != 0) {
                        if (aVar5.mo8045n() < 2 || aVar5.mo8045n() > 65535) {
                            mo8285i().f7156i.mo8434a("Invalid sampling rate. Event name, sample rate", aVar5.mo8044a(), Integer.valueOf(aVar5.mo8045n()));
                        } else {
                            aVar4.put(aVar5.mo8044a(), Integer.valueOf(aVar5.mo8045n()));
                        }
                    }
                }
            }
        }
        this.f7128e.put(str, aVar2);
        this.f7129f.put(str, aVar3);
        this.f7131h.put(str, aVar4);
    }

    /* renamed from: a */
    public final boolean mo8267a(String str, byte[] bArr, String str2) {
        byte[] bArr2;
        boolean z;
        String str3;
        C2944e4 e4Var;
        String str4;
        Object a;
        boolean z2;
        boolean z3;
        String str5 = str;
        mo8649m();
        mo8279c();
        C1061o.m2528b(str);
        C2710a aVar = (C2710a) mo8265a(str, bArr).mo7769h();
        int i = 0;
        if (aVar == null) {
            return false;
        }
        mo8266a(str5, aVar);
        this.f7130g.put(str5, (C2709v0) ((C2490i6) aVar.mo7778m()));
        this.f7132i.put(str5, str2);
        this.f7127d.put(str5, m6699a((C2709v0) ((C2490i6) aVar.mo7778m())));
        C2939e q = mo8652q();
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((C2709v0) aVar.f6618f).zzi));
        if (q != null) {
            String str6 = "app_id=? and audience_id=?";
            String str7 = "event_filters";
            String str8 = "app_id=?";
            String str9 = "property_filters";
            C1061o.m2524b(arrayList);
            int i2 = 0;
            while (i2 < arrayList.size()) {
                C2523a aVar2 = (C2523a) ((C2522k0) arrayList.get(i2)).mo7769h();
                if (((C2522k0) aVar2.f6618f).zzf.size() != 0) {
                    int i3 = i;
                    while (i3 < ((C2522k0) aVar2.f6618f).zzf.size()) {
                        C2540a aVar3 = (C2540a) ((C2539l0) ((C2522k0) aVar2.f6618f).zzf.get(i3)).mo7769h();
                        C2540a aVar4 = (C2540a) ((C2491a) aVar3.clone());
                        String a2 = C2286e.m5191a(((C2539l0) aVar3.f6618f).zze, C2946e6.f7281a, C2946e6.f7282b);
                        if (a2 != null) {
                            if (aVar4.f6619g) {
                                aVar4.mo7776k();
                                aVar4.f6619g = false;
                            }
                            C2539l0.m6096a((C2539l0) aVar4.f6618f, a2);
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        int i4 = 0;
                        while (i4 < ((C2539l0) aVar3.f6618f).zzf.size()) {
                            C2556m0 m0Var = (C2556m0) ((C2539l0) aVar3.f6618f).zzf.get(i4);
                            C2540a aVar5 = aVar3;
                            C2710a aVar6 = aVar;
                            String str10 = str6;
                            String a3 = C2286e.m5191a(m0Var.zzg, C2934d6.f7245a, C2934d6.f7246b);
                            if (a3 != null) {
                                C2557a aVar7 = (C2557a) m0Var.mo7769h();
                                if (aVar7.f6619g) {
                                    aVar7.mo7776k();
                                    aVar7.f6619g = false;
                                }
                                C2556m0.m6132a((C2556m0) aVar7.f6618f, a3);
                                C2556m0 m0Var2 = (C2556m0) ((C2490i6) aVar7.mo7778m());
                                if (aVar4.f6619g) {
                                    aVar4.mo7776k();
                                    aVar4.f6619g = false;
                                }
                                C2539l0.m6095a((C2539l0) aVar4.f6618f, i4, m0Var2);
                                z3 = true;
                            }
                            i4++;
                            aVar3 = aVar5;
                            aVar = aVar6;
                            str6 = str10;
                        }
                        C2710a aVar8 = aVar;
                        String str11 = str6;
                        if (z3) {
                            if (aVar2.f6619g) {
                                aVar2.mo7776k();
                                aVar2.f6619g = false;
                            }
                            C2522k0.m6062a((C2522k0) aVar2.f6618f, i3, (C2539l0) ((C2490i6) aVar4.mo7778m()));
                            arrayList.set(i2, (C2522k0) ((C2490i6) aVar2.mo7778m()));
                        }
                        i3++;
                        aVar = aVar8;
                        str6 = str11;
                    }
                }
                C2710a aVar9 = aVar;
                String str12 = str6;
                if (((C2522k0) aVar2.f6618f).zze.size() != 0) {
                    for (int i5 = 0; i5 < ((C2522k0) aVar2.f6618f).zze.size(); i5++) {
                        C2591o0 o0Var = (C2591o0) ((C2522k0) aVar2.f6618f).zze.get(i5);
                        String a4 = C2286e.m5191a(o0Var.zze, C2970g6.f7358a, C2970g6.f7359b);
                        if (a4 != null) {
                            C2592a aVar10 = (C2592a) o0Var.mo7769h();
                            if (aVar10.f6619g) {
                                aVar10.mo7776k();
                                z2 = false;
                                aVar10.f6619g = false;
                            } else {
                                z2 = false;
                            }
                            C2591o0.m6196a((C2591o0) aVar10.f6618f, a4);
                            if (aVar2.f6619g) {
                                aVar2.mo7776k();
                                aVar2.f6619g = z2;
                            }
                            C2522k0.m6063a((C2522k0) aVar2.f6618f, i5, (C2591o0) ((C2490i6) aVar10.mo7778m()));
                            arrayList.set(i2, (C2522k0) ((C2490i6) aVar2.mo7778m()));
                        }
                    }
                }
                i2++;
                i = 0;
                aVar = aVar9;
                str6 = str12;
            }
            C2710a aVar11 = aVar;
            String str13 = str6;
            q.mo8649m();
            q.mo8279c();
            C1061o.m2528b(str);
            C1061o.m2524b(arrayList);
            SQLiteDatabase t = q.mo8425t();
            t.beginTransaction();
            try {
                q.mo8649m();
                q.mo8279c();
                C1061o.m2528b(str);
                SQLiteDatabase t2 = q.mo8425t();
                t2.delete(str9, str8, new String[]{str5});
                t2.delete(str7, str8, new String[]{str5});
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C2522k0 k0Var = (C2522k0) it.next();
                    q.mo8649m();
                    q.mo8279c();
                    C1061o.m2528b(str);
                    C1061o.m2524b(k0Var);
                    if ((k0Var.zzc & 1) != 0) {
                        int i6 = k0Var.zzd;
                        Iterator it2 = k0Var.zzf.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (!((C2539l0) it2.next()).mo7835a()) {
                                    e4Var = q.mo8285i().f7156i;
                                    str4 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                                    a = C2908b4.m6745a(str);
                                    break;
                                }
                            } else {
                                for (C2591o0 a5 : k0Var.zze) {
                                    if (!a5.mo7904a()) {
                                        e4Var = q.mo8285i().f7156i;
                                        str4 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                                        a = C2908b4.m6745a(str);
                                    }
                                }
                                Iterator it3 = k0Var.zzf.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (!q.mo8403a(str5, i6, (C2539l0) it3.next())) {
                                            z = false;
                                            break;
                                        }
                                    } else {
                                        z = true;
                                        break;
                                    }
                                }
                                if (z) {
                                    Iterator it4 = k0Var.zze.iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            if (!q.mo8404a(str5, i6, (C2591o0) it4.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                if (!z) {
                                    q.mo8649m();
                                    q.mo8279c();
                                    C1061o.m2528b(str);
                                    SQLiteDatabase t3 = q.mo8425t();
                                    str3 = str13;
                                    t3.delete(str9, str3, new String[]{str5, String.valueOf(i6)});
                                    t3.delete(str7, str3, new String[]{str5, String.valueOf(i6)});
                                } else {
                                    str3 = str13;
                                }
                                str13 = str3;
                            }
                        }
                        e4Var.mo8434a(str4, a, Integer.valueOf(i6));
                        break;
                    }
                    q.mo8285i().f7156i.mo8433a("Audience with no ID. appId", C2908b4.m6745a(str));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    C2522k0 k0Var2 = (C2522k0) it5.next();
                    arrayList2.add((k0Var2.zzc & 1) != 0 ? Integer.valueOf(k0Var2.zzd) : null);
                }
                q.mo8406a(str5, (List<Integer>) arrayList2);
                t.setTransactionSuccessful();
                t.endTransaction();
                C2710a aVar12 = aVar11;
                try {
                    if (aVar12.f6619g) {
                        aVar12.mo7776k();
                        aVar12.f6619g = false;
                    }
                    C2709v0.m6484a((C2709v0) aVar12.f6618f);
                    bArr2 = ((C2709v0) ((C2490i6) aVar12.mo7778m())).mo8084f();
                } catch (RuntimeException e) {
                    mo8285i().f7156i.mo8434a("Unable to serialize reduced-size config. Storing full config instead. appId", C2908b4.m6745a(str), e);
                    bArr2 = bArr;
                }
                C2939e q2 = mo8652q();
                C1061o.m2528b(str);
                q2.mo8279c();
                q2.mo8649m();
                ContentValues contentValues = new ContentValues();
                contentValues.put("remote_config", bArr2);
                try {
                    if (((long) q2.mo8425t().update("apps", contentValues, "app_id = ?", new String[]{str5})) == 0) {
                        q2.mo8285i().f7153f.mo8433a("Failed to update remote config (got 0). appId", C2908b4.m6745a(str));
                    }
                } catch (SQLiteException e2) {
                    q2.mo8285i().f7153f.mo8434a("Error storing remote config. appId", C2908b4.m6745a(str), e2);
                }
                this.f7130g.put(str5, (C2709v0) ((C2490i6) aVar12.mo7778m()));
                return true;
            } catch (Throwable th) {
                t.endTransaction();
                throw th;
            }
        } else {
            throw null;
        }
    }
}
