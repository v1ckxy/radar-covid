package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p124p.p126b.p127k.C1061o;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;
import p213q.p217b.p218a.p231b.p251g.p256e.C2340a1;
import p213q.p217b.p218a.p231b.p251g.p256e.C2405da;
import p213q.p217b.p218a.p231b.p251g.p256e.C2412e1;
import p213q.p217b.p218a.p231b.p251g.p256e.C2424ec;
import p213q.p217b.p218a.p231b.p251g.p256e.C2539l0;
import p213q.p217b.p218a.p231b.p251g.p256e.C2591o0;

/* renamed from: q.b.a.b.h.b.e */
public final class C2939e extends C3046m9 {

    /* renamed from: f */
    public static final String[] f7259f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g */
    public static final String[] f7260g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h */
    public static final String[] f7261h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};

    /* renamed from: i */
    public static final String[] f7262i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j */
    public static final String[] f7263j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k */
    public static final String[] f7264k;

    /* renamed from: l */
    public static final String[] f7265l;

    /* renamed from: m */
    public static final String[] f7266m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    public final C2951f f7267d = new C2951f(this, this.f7133a.f7332a, "google_app_measurement.db");

    /* renamed from: e */
    public final C3009j9 f7268e = new C3009j9(this.f7133a.f7345n);

    static {
        String str = "session_scoped";
        f7264k = new String[]{str, "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
        f7265l = new String[]{str, "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    }

    public C2939e(C3033l9 l9Var) {
        super(l9Var);
    }

    /* renamed from: a */
    public static void m6836a(ContentValues contentValues, String str, Object obj) {
        C1061o.m2528b(str);
        C1061o.m2524b(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* renamed from: a */
    public final long mo8390a(C2412e1 e1Var) {
        mo8279c();
        mo8649m();
        C1061o.m2524b(e1Var);
        C1061o.m2528b(e1Var.zzs);
        byte[] f = e1Var.mo8084f();
        long a = mo8651p().mo8732a(f);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", e1Var.zzs);
        contentValues.put("metadata_fingerprint", Long.valueOf(a));
        contentValues.put("metadata", f);
        try {
            mo8425t().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return a;
        } catch (SQLiteException e) {
            mo8285i().f7153f.mo8434a("Error storing raw event metadata. appId", C2908b4.m6745a(e1Var.zzs), e);
            throw e;
        }
    }

    /* renamed from: a */
    public final C2927d mo8398a(long j, String str, boolean z, boolean z2) {
        return mo8397a(j, str, 1, false, false, z, false, z2);
    }

    /* renamed from: b */
    public final long mo8411b(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = mo8425t().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                cursor.close();
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            mo8285i().f7153f.mo8434a("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final List<C2998ia> mo8412b(String str, String str2, String str3) {
        C1061o.m2528b(str);
        mo8279c();
        mo8649m();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return mo8396a(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: c */
    public final long mo8415c(String str) {
        C1061o.m2528b(str);
        mo8279c();
        mo8649m();
        try {
            return (long) mo8425t().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, this.f7133a.f7338g.mo8576b(str, C3069p.f7742p))))});
        } catch (SQLiteException e) {
            mo8285i().f7153f.mo8434a("Error deleting over the limit events. appId", C2908b4.m6745a(str), e);
            return 0;
        }
    }

    /* renamed from: d */
    public final long mo8417d(String str) {
        C1061o.m2528b(str);
        return mo8389a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011d  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p213q.p217b.p218a.p231b.p259h.p261b.C2998ia mo8418d(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            r7 = r31
            p124p.p126b.p127k.C1061o.m2528b(r30)
            p124p.p126b.p127k.C1061o.m2528b(r31)
            r29.mo8279c()
            r29.mo8649m()
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r29.mo8425t()     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            java.lang.String r10 = "conditional_properties"
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r11 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            java.lang.String r12 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            r1 = 0
            r13[r1] = r30     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            r2 = 1
            r13[r2] = r7     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            r14 = 0
            r15 = 0
            r16 = 0
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            boolean r3 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00ec }
            if (r3 != 0) goto L_0x004c
            r9.close()
            return r8
        L_0x004c:
            java.lang.String r16 = r9.getString(r1)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00ec }
            r10 = r29
            java.lang.Object r5 = r10.mo8391a(r9, r2)     // Catch:{ SQLiteException -> 0x00ea }
            int r0 = r9.getInt(r0)     // Catch:{ SQLiteException -> 0x00ea }
            if (r0 == 0) goto L_0x005f
            r20 = r2
            goto L_0x0061
        L_0x005f:
            r20 = r1
        L_0x0061:
            r0 = 3
            java.lang.String r21 = r9.getString(r0)     // Catch:{ SQLiteException -> 0x00ea }
            r0 = 4
            long r23 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ea }
            q.b.a.b.h.b.t9 r0 = r29.mo8651p()     // Catch:{ SQLiteException -> 0x00ea }
            r1 = 5
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00ea }
            android.os.Parcelable$Creator<q.b.a.b.h.b.n> r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3047n.CREATOR     // Catch:{ SQLiteException -> 0x00ea }
            android.os.Parcelable r0 = r0.mo8733a(r1, r2)     // Catch:{ SQLiteException -> 0x00ea }
            r22 = r0
            q.b.a.b.h.b.n r22 = (p213q.p217b.p218a.p231b.p259h.p261b.C3047n) r22     // Catch:{ SQLiteException -> 0x00ea }
            r0 = 6
            long r18 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ea }
            q.b.a.b.h.b.t9 r0 = r29.mo8651p()     // Catch:{ SQLiteException -> 0x00ea }
            r1 = 7
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00ea }
            android.os.Parcelable$Creator<q.b.a.b.h.b.n> r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3047n.CREATOR     // Catch:{ SQLiteException -> 0x00ea }
            android.os.Parcelable r0 = r0.mo8733a(r1, r2)     // Catch:{ SQLiteException -> 0x00ea }
            r25 = r0
            q.b.a.b.h.b.n r25 = (p213q.p217b.p218a.p231b.p259h.p261b.C3047n) r25     // Catch:{ SQLiteException -> 0x00ea }
            r0 = 8
            long r3 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ea }
            r0 = 9
            long r26 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ea }
            q.b.a.b.h.b.t9 r0 = r29.mo8651p()     // Catch:{ SQLiteException -> 0x00ea }
            r1 = 10
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00ea }
            android.os.Parcelable$Creator<q.b.a.b.h.b.n> r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3047n.CREATOR     // Catch:{ SQLiteException -> 0x00ea }
            android.os.Parcelable r0 = r0.mo8733a(r1, r2)     // Catch:{ SQLiteException -> 0x00ea }
            r28 = r0
            q.b.a.b.h.b.n r28 = (p213q.p217b.p218a.p231b.p259h.p261b.C3047n) r28     // Catch:{ SQLiteException -> 0x00ea }
            q.b.a.b.h.b.s9 r17 = new q.b.a.b.h.b.s9     // Catch:{ SQLiteException -> 0x00ea }
            r1 = r17
            r2 = r31
            r6 = r16
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x00ea }
            q.b.a.b.h.b.ia r0 = new q.b.a.b.h.b.ia     // Catch:{ SQLiteException -> 0x00ea }
            r14 = r0
            r15 = r30
            r14.<init>(r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r28)     // Catch:{ SQLiteException -> 0x00ea }
            boolean r1 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x00ea }
            if (r1 == 0) goto L_0x00e6
            q.b.a.b.h.b.b4 r1 = r29.mo8285i()     // Catch:{ SQLiteException -> 0x00ea }
            q.b.a.b.h.b.e4 r1 = r1.f7153f     // Catch:{ SQLiteException -> 0x00ea }
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            java.lang.Object r3 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r30)     // Catch:{ SQLiteException -> 0x00ea }
            q.b.a.b.h.b.z3 r4 = r29.mo8281e()     // Catch:{ SQLiteException -> 0x00ea }
            java.lang.String r4 = r4.mo8838c(r7)     // Catch:{ SQLiteException -> 0x00ea }
            r1.mo8434a(r2, r3, r4)     // Catch:{ SQLiteException -> 0x00ea }
        L_0x00e6:
            r9.close()
            return r0
        L_0x00ea:
            r0 = move-exception
            goto L_0x00fc
        L_0x00ec:
            r0 = move-exception
            r10 = r29
            goto L_0x011a
        L_0x00f0:
            r0 = move-exception
            r10 = r29
            goto L_0x00fc
        L_0x00f4:
            r0 = move-exception
            r10 = r29
            goto L_0x011b
        L_0x00f8:
            r0 = move-exception
            r10 = r29
            r9 = r8
        L_0x00fc:
            q.b.a.b.h.b.b4 r1 = r29.mo8285i()     // Catch:{ all -> 0x0119 }
            q.b.a.b.h.b.e4 r1 = r1.f7153f     // Catch:{ all -> 0x0119 }
            java.lang.String r2 = "Error querying conditional property"
            java.lang.Object r3 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r30)     // Catch:{ all -> 0x0119 }
            q.b.a.b.h.b.z3 r4 = r29.mo8281e()     // Catch:{ all -> 0x0119 }
            java.lang.String r4 = r4.mo8838c(r7)     // Catch:{ all -> 0x0119 }
            r1.mo8435a(r2, r3, r4, r0)     // Catch:{ all -> 0x0119 }
            if (r9 == 0) goto L_0x0118
            r9.close()
        L_0x0118:
            return r8
        L_0x0119:
            r0 = move-exception
        L_0x011a:
            r8 = r9
        L_0x011b:
            if (r8 == 0) goto L_0x0120
            r8.close()
        L_0x0120:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C2939e.mo8418d(java.lang.String, java.lang.String):q.b.a.b.h.b.ia");
    }

    /* renamed from: e */
    public final int mo8419e(String str, String str2) {
        C1061o.m2528b(str);
        C1061o.m2528b(str2);
        mo8279c();
        mo8649m();
        try {
            return mo8425t().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            mo8285i().f7153f.mo8435a("Error deleting conditional property", C2908b4.m6745a(str), mo8281e().mo8838c(str2), e);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d0  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<p213q.p217b.p218a.p231b.p251g.p256e.C2539l0>> mo8421f(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.mo8649m()
            r12.mo8279c()
            p124p.p126b.p127k.C1061o.m2528b(r13)
            p124p.p126b.p127k.C1061o.m2528b(r14)
            p.e.a r0 = new p.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.mo8425t()
            r9 = 0
            java.lang.String r2 = "event_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0098, all -> 0x0096 }
            java.lang.String r4 = "app_id=? AND event_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0098, all -> 0x0096 }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x0098, all -> 0x0096 }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x0098, all -> 0x0096 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0098, all -> 0x0096 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0094 }
            if (r1 != 0) goto L_0x0040
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0094 }
            r14.close()
            return r13
        L_0x0040:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0094 }
            q.b.a.b.g.e.l0 r2 = p213q.p217b.p218a.p231b.p251g.p256e.C2539l0.zzl     // Catch:{ IOException -> 0x007a }
            q.b.a.b.g.e.i6$a r2 = r2.mo7768g()     // Catch:{ IOException -> 0x007a }
            q.b.a.b.g.e.l0$a r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2539l0.C2540a) r2     // Catch:{ IOException -> 0x007a }
            q.b.a.b.g.e.s7 r1 = p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.m7336a(r2, r1)     // Catch:{ IOException -> 0x007a }
            q.b.a.b.g.e.l0$a r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2539l0.C2540a) r1     // Catch:{ IOException -> 0x007a }
            q.b.a.b.g.e.p7 r1 = r1.mo7778m()     // Catch:{ IOException -> 0x007a }
            q.b.a.b.g.e.i6 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r1     // Catch:{ IOException -> 0x007a }
            q.b.a.b.g.e.l0 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2539l0) r1     // Catch:{ IOException -> 0x007a }
            int r2 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0094 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0094 }
            if (r3 != 0) goto L_0x0076
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0094 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0094 }
            r0.put(r2, r3)     // Catch:{ SQLiteException -> 0x0094 }
        L_0x0076:
            r3.add(r1)     // Catch:{ SQLiteException -> 0x0094 }
            goto L_0x008a
        L_0x007a:
            r1 = move-exception
            q.b.a.b.h.b.b4 r2 = r12.mo8285i()     // Catch:{ SQLiteException -> 0x0094 }
            q.b.a.b.h.b.e4 r2 = r2.f7153f     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r13)     // Catch:{ SQLiteException -> 0x0094 }
            r2.mo8434a(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0094 }
        L_0x008a:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0094 }
            if (r1 != 0) goto L_0x0040
            r14.close()
            return r0
        L_0x0094:
            r0 = move-exception
            goto L_0x009b
        L_0x0096:
            r13 = move-exception
            goto L_0x00ce
        L_0x0098:
            r14 = move-exception
            r0 = r14
            r14 = r9
        L_0x009b:
            q.b.a.b.h.b.b4 r1 = r12.mo8285i()     // Catch:{ all -> 0x00cc }
            q.b.a.b.h.b.e4 r1 = r1.f7153f     // Catch:{ all -> 0x00cc }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r3 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r13)     // Catch:{ all -> 0x00cc }
            r1.mo8434a(r2, r3, r0)     // Catch:{ all -> 0x00cc }
            boolean r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2568mb.m6153b()     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x00c6
            q.b.a.b.h.b.g5 r0 = r12.f7133a     // Catch:{ all -> 0x00cc }
            q.b.a.b.h.b.ka r0 = r0.f7338g     // Catch:{ all -> 0x00cc }
            q.b.a.b.h.b.r3<java.lang.Boolean> r1 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7705T0     // Catch:{ all -> 0x00cc }
            boolean r13 = r0.mo8578c(r13, r1)     // Catch:{ all -> 0x00cc }
            if (r13 == 0) goto L_0x00c6
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x00cc }
            if (r14 == 0) goto L_0x00c5
            r14.close()
        L_0x00c5:
            return r13
        L_0x00c6:
            if (r14 == 0) goto L_0x00cb
            r14.close()
        L_0x00cb:
            return r9
        L_0x00cc:
            r13 = move-exception
            r9 = r14
        L_0x00ce:
            if (r9 == 0) goto L_0x00d3
            r9.close()
        L_0x00d3:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C2939e.mo8421f(java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cf  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<p213q.p217b.p218a.p231b.p251g.p256e.C2591o0>> mo8422g(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.mo8649m()
            r12.mo8279c()
            p124p.p126b.p127k.C1061o.m2528b(r13)
            p124p.p126b.p127k.C1061o.m2528b(r14)
            p.e.a r0 = new p.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.mo8425t()
            r9 = 0
            java.lang.String r2 = "property_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0098, all -> 0x0096 }
            java.lang.String r4 = "app_id=? AND property_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0098, all -> 0x0096 }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x0098, all -> 0x0096 }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x0098, all -> 0x0096 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0098, all -> 0x0096 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0094 }
            if (r1 != 0) goto L_0x0040
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0094 }
            r14.close()
            return r13
        L_0x0040:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0094 }
            q.b.a.b.g.e.o0 r2 = p213q.p217b.p218a.p231b.p251g.p256e.C2591o0.zzj     // Catch:{ IOException -> 0x007a }
            q.b.a.b.g.e.i6$a r2 = r2.mo7768g()     // Catch:{ IOException -> 0x007a }
            q.b.a.b.g.e.o0$a r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2591o0.C2592a) r2     // Catch:{ IOException -> 0x007a }
            q.b.a.b.g.e.s7 r1 = p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.m7336a(r2, r1)     // Catch:{ IOException -> 0x007a }
            q.b.a.b.g.e.o0$a r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2591o0.C2592a) r1     // Catch:{ IOException -> 0x007a }
            q.b.a.b.g.e.p7 r1 = r1.mo7778m()     // Catch:{ IOException -> 0x007a }
            q.b.a.b.g.e.i6 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r1     // Catch:{ IOException -> 0x007a }
            q.b.a.b.g.e.o0 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2591o0) r1     // Catch:{ IOException -> 0x007a }
            int r2 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0094 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0094 }
            if (r3 != 0) goto L_0x0076
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0094 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0094 }
            r0.put(r2, r3)     // Catch:{ SQLiteException -> 0x0094 }
        L_0x0076:
            r3.add(r1)     // Catch:{ SQLiteException -> 0x0094 }
            goto L_0x008a
        L_0x007a:
            r1 = move-exception
            q.b.a.b.h.b.b4 r2 = r12.mo8285i()     // Catch:{ SQLiteException -> 0x0094 }
            q.b.a.b.h.b.e4 r2 = r2.f7153f     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r13)     // Catch:{ SQLiteException -> 0x0094 }
            r2.mo8434a(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0094 }
        L_0x008a:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0094 }
            if (r1 != 0) goto L_0x0040
            r14.close()
            return r0
        L_0x0094:
            r0 = move-exception
            goto L_0x009a
        L_0x0096:
            r13 = move-exception
            goto L_0x00cd
        L_0x0098:
            r0 = move-exception
            r14 = r9
        L_0x009a:
            q.b.a.b.h.b.b4 r1 = r12.mo8285i()     // Catch:{ all -> 0x00cb }
            q.b.a.b.h.b.e4 r1 = r1.f7153f     // Catch:{ all -> 0x00cb }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r3 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r13)     // Catch:{ all -> 0x00cb }
            r1.mo8434a(r2, r3, r0)     // Catch:{ all -> 0x00cb }
            boolean r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2568mb.m6153b()     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00c5
            q.b.a.b.h.b.g5 r0 = r12.f7133a     // Catch:{ all -> 0x00cb }
            q.b.a.b.h.b.ka r0 = r0.f7338g     // Catch:{ all -> 0x00cb }
            q.b.a.b.h.b.r3<java.lang.Boolean> r1 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7705T0     // Catch:{ all -> 0x00cb }
            boolean r13 = r0.mo8578c(r13, r1)     // Catch:{ all -> 0x00cb }
            if (r13 == 0) goto L_0x00c5
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x00cb }
            if (r14 == 0) goto L_0x00c4
            r14.close()
        L_0x00c4:
            return r13
        L_0x00c5:
            if (r14 == 0) goto L_0x00ca
            r14.close()
        L_0x00ca:
            return r9
        L_0x00cb:
            r13 = move-exception
            r9 = r14
        L_0x00cd:
            if (r9 == 0) goto L_0x00d2
            r9.close()
        L_0x00d2:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C2939e.mo8422g(java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h */
    public final long mo8423h(String str, String str2) {
        long j;
        C1061o.m2528b(str);
        C1061o.m2528b(str2);
        mo8279c();
        mo8649m();
        SQLiteDatabase t = mo8425t();
        t.beginTransaction();
        long j2 = 0;
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str2);
            sb.append(" from app2 where app_id=?");
            j = mo8389a(sb.toString(), new String[]{str}, -1);
            String str3 = "app2";
            String str4 = "app_id";
            if (j == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(str4, str);
                contentValues.put("first_open_count", Integer.valueOf(0));
                contentValues.put("previous_install_count", Integer.valueOf(0));
                if (t.insertWithOnConflict(str3, null, contentValues, 5) == -1) {
                    mo8285i().f7153f.mo8434a("Failed to insert column (got -1). appId", C2908b4.m6745a(str), str2);
                    t.endTransaction();
                    return -1;
                }
                j = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(str4, str);
                contentValues2.put(str2, Long.valueOf(1 + j));
                if (((long) t.update(str3, contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    mo8285i().f7153f.mo8434a("Failed to update column (got 0). appId", C2908b4.m6745a(str), str2);
                    t.endTransaction();
                    return -1;
                }
                t.setTransactionSuccessful();
                t.endTransaction();
                return j;
            } catch (SQLiteException e) {
                e = e;
                j2 = j;
                try {
                    mo8285i().f7153f.mo8435a("Error inserting column. appId", C2908b4.m6745a(str), str2, e);
                    t.endTransaction();
                    j = j2;
                    return j;
                } catch (Throwable th) {
                    t.endTransaction();
                    throw th;
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            mo8285i().f7153f.mo8435a("Error inserting column. appId", C2908b4.m6745a(str), str2, e);
            t.endTransaction();
            j = j2;
            return j;
        }
    }

    /* renamed from: o */
    public final boolean mo8276o() {
        return false;
    }

    /* renamed from: s */
    public final void mo8424s() {
        mo8649m();
        mo8425t().setTransactionSuccessful();
    }

    /* renamed from: t */
    public final SQLiteDatabase mo8425t() {
        mo8279c();
        try {
            return this.f7267d.getWritableDatabase();
        } catch (SQLiteException e) {
            mo8285i().f7156i.mo8433a("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo8426u() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mo8425t()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0025, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0027
        L_0x0020:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x0039
        L_0x0025:
            r2 = move-exception
            r0 = r1
        L_0x0027:
            q.b.a.b.h.b.b4 r3 = r6.mo8285i()     // Catch:{ all -> 0x0038 }
            q.b.a.b.h.b.e4 r3 = r3.f7153f     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.mo8433a(r4, r2)     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0037
            r0.close()
        L_0x0037:
            return r1
        L_0x0038:
            r1 = move-exception
        L_0x0039:
            if (r0 == 0) goto L_0x003e
            r0.close()
        L_0x003e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C2939e.mo8426u():java.lang.String");
    }

    /* renamed from: v */
    public final long mo8427v() {
        Cursor cursor = null;
        try {
            cursor = mo8425t().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
            if (!cursor.moveToFirst()) {
                cursor.close();
                return -1;
            }
            long j = cursor.getLong(0);
            cursor.close();
            return j;
        } catch (SQLiteException e) {
            mo8285i().f7153f.mo8433a("Error querying raw events", e);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: w */
    public final boolean mo8428w() {
        return this.f7133a.f7332a.getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: x */
    public final void mo8429x() {
        mo8649m();
        mo8425t().beginTransaction();
    }

    /* renamed from: y */
    public final void mo8430y() {
        mo8649m();
        mo8425t().endTransaction();
    }

    /* renamed from: z */
    public final void mo8431z() {
        mo8279c();
        mo8649m();
        if (mo8428w()) {
            long a = mo8288l().f7625h.mo8708a();
            if (((C2284c) this.f7133a.f7345n) != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Math.abs(elapsedRealtime - a) > ((Long) C3069p.f7760y.mo8702a(null)).longValue()) {
                    mo8288l().f7625h.mo8709a(elapsedRealtime);
                    mo8279c();
                    mo8649m();
                    if (mo8428w()) {
                        SQLiteDatabase t = mo8425t();
                        String[] strArr = new String[2];
                        if (((C2284c) this.f7133a.f7345n) != null) {
                            strArr[0] = String.valueOf(System.currentTimeMillis());
                            strArr[1] = String.valueOf(C3022ka.m7048u());
                            int delete = t.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", strArr);
                            if (delete > 0) {
                                mo8285i().f7161n.mo8433a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                            }
                        } else {
                            throw null;
                        }
                    }
                }
                return;
            }
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00f0 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00f2 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x010f A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0111 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x012e A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0130 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x014d A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x014f A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x016f A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0173 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x019b A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x019d A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01ba A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01bc A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01d9 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01f2 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0207 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0223 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0224 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0233 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0271 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02a3  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p213q.p217b.p218a.p231b.p259h.p261b.C2920c4 mo8413b(java.lang.String r36) {
        /*
            r35 = this;
            r1 = r35
            r2 = r36
            p124p.p126b.p127k.C1061o.m2528b(r36)
            r35.mo8279c()
            r35.mo8649m()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r35.mo8425t()     // Catch:{ SQLiteException -> 0x0288, all -> 0x0286 }
            java.lang.String r5 = "apps"
            java.lang.String r6 = "app_instance_id"
            java.lang.String r7 = "gmp_app_id"
            java.lang.String r8 = "resettable_device_id_hash"
            java.lang.String r9 = "last_bundle_index"
            java.lang.String r10 = "last_bundle_start_timestamp"
            java.lang.String r11 = "last_bundle_end_timestamp"
            java.lang.String r12 = "app_version"
            java.lang.String r13 = "app_store"
            java.lang.String r14 = "gmp_version"
            java.lang.String r15 = "dev_cert_hash"
            java.lang.String r16 = "measurement_enabled"
            java.lang.String r17 = "day"
            java.lang.String r18 = "daily_public_events_count"
            java.lang.String r19 = "daily_events_count"
            java.lang.String r20 = "daily_conversions_count"
            java.lang.String r21 = "config_fetched_time"
            java.lang.String r22 = "failed_config_fetch_time"
            java.lang.String r23 = "app_version_int"
            java.lang.String r24 = "firebase_instance_id"
            java.lang.String r25 = "daily_error_events_count"
            java.lang.String r26 = "daily_realtime_events_count"
            java.lang.String r27 = "health_monitor_sample"
            java.lang.String r28 = "android_id"
            java.lang.String r29 = "adid_reporting_enabled"
            java.lang.String r30 = "ssaid_reporting_enabled"
            java.lang.String r31 = "admob_app_id"
            java.lang.String r32 = "dynamite_version"
            java.lang.String r33 = "safelisted_events"
            java.lang.String r34 = "ga_app_id"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34}     // Catch:{ SQLiteException -> 0x0288, all -> 0x0286 }
            java.lang.String r7 = "app_id=?"
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0288, all -> 0x0286 }
            r12 = 0
            r8[r12] = r2     // Catch:{ SQLiteException -> 0x0288, all -> 0x0286 }
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0288, all -> 0x0286 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0284 }
            if (r5 != 0) goto L_0x006b
            r4.close()
            return r3
        L_0x006b:
            q.b.a.b.h.b.c4 r5 = new q.b.a.b.h.b.c4     // Catch:{ SQLiteException -> 0x0284 }
            q.b.a.b.h.b.l9 r6 = r1.f7580b     // Catch:{ SQLiteException -> 0x0284 }
            q.b.a.b.h.b.g5 r6 = r6.f7537i     // Catch:{ SQLiteException -> 0x0284 }
            r5.<init>(r6, r2)     // Catch:{ SQLiteException -> 0x0284 }
            java.lang.String r6 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x0284 }
            r5.mo8325a(r6)     // Catch:{ SQLiteException -> 0x0284 }
            java.lang.String r6 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0284 }
            r5.mo8330b(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 2
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.mo8341e(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 3
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.mo8346g(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 4
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.mo8323a(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 5
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.mo8329b(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 6
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.mo8347g(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 7
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.mo8350h(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 8
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.mo8336d(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 9
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.mo8340e(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 10
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x0284 }
            if (r7 != 0) goto L_0x00d5
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x0284 }
            if (r6 == 0) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            r6 = r12
            goto L_0x00d6
        L_0x00d5:
            r6 = r0
        L_0x00d6:
            r5.mo8327a(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 11
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            q.b.a.b.h.b.g5 r8 = r5.f7184a     // Catch:{ SQLiteException -> 0x0284 }
            q.b.a.b.h.b.z4 r8 = r8.mo8283g()     // Catch:{ SQLiteException -> 0x0284 }
            r8.mo8279c()     // Catch:{ SQLiteException -> 0x0284 }
            boolean r8 = r5.f7181E     // Catch:{ SQLiteException -> 0x0284 }
            long r9 = r5.f7207x     // Catch:{ SQLiteException -> 0x0284 }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x00f2
            r9 = r0
            goto L_0x00f3
        L_0x00f2:
            r9 = r12
        L_0x00f3:
            r8 = r8 | r9
            r5.f7181E = r8     // Catch:{ SQLiteException -> 0x0284 }
            r5.f7207x = r6     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 12
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            q.b.a.b.h.b.g5 r8 = r5.f7184a     // Catch:{ SQLiteException -> 0x0284 }
            q.b.a.b.h.b.z4 r8 = r8.mo8283g()     // Catch:{ SQLiteException -> 0x0284 }
            r8.mo8279c()     // Catch:{ SQLiteException -> 0x0284 }
            boolean r8 = r5.f7181E     // Catch:{ SQLiteException -> 0x0284 }
            long r9 = r5.f7208y     // Catch:{ SQLiteException -> 0x0284 }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x0111
            r9 = r0
            goto L_0x0112
        L_0x0111:
            r9 = r12
        L_0x0112:
            r8 = r8 | r9
            r5.f7181E = r8     // Catch:{ SQLiteException -> 0x0284 }
            r5.f7208y = r6     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 13
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            q.b.a.b.h.b.g5 r8 = r5.f7184a     // Catch:{ SQLiteException -> 0x0284 }
            q.b.a.b.h.b.z4 r8 = r8.mo8283g()     // Catch:{ SQLiteException -> 0x0284 }
            r8.mo8279c()     // Catch:{ SQLiteException -> 0x0284 }
            boolean r8 = r5.f7181E     // Catch:{ SQLiteException -> 0x0284 }
            long r9 = r5.f7209z     // Catch:{ SQLiteException -> 0x0284 }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x0130
            r9 = r0
            goto L_0x0131
        L_0x0130:
            r9 = r12
        L_0x0131:
            r8 = r8 | r9
            r5.f7181E = r8     // Catch:{ SQLiteException -> 0x0284 }
            r5.f7209z = r6     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 14
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            q.b.a.b.h.b.g5 r8 = r5.f7184a     // Catch:{ SQLiteException -> 0x0284 }
            q.b.a.b.h.b.z4 r8 = r8.mo8283g()     // Catch:{ SQLiteException -> 0x0284 }
            r8.mo8279c()     // Catch:{ SQLiteException -> 0x0284 }
            boolean r8 = r5.f7181E     // Catch:{ SQLiteException -> 0x0284 }
            long r9 = r5.f7177A     // Catch:{ SQLiteException -> 0x0284 }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x014f
            r9 = r0
            goto L_0x0150
        L_0x014f:
            r9 = r12
        L_0x0150:
            r8 = r8 | r9
            r5.f7181E = r8     // Catch:{ SQLiteException -> 0x0284 }
            r5.f7177A = r6     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 15
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.mo8349h(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 16
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.mo8352i(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 17
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x0284 }
            if (r7 == 0) goto L_0x0173
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0178
        L_0x0173:
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x0284 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x0284 }
        L_0x0178:
            r5.mo8332c(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 18
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.mo8344f(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 19
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            q.b.a.b.h.b.g5 r8 = r5.f7184a     // Catch:{ SQLiteException -> 0x0284 }
            q.b.a.b.h.b.z4 r8 = r8.mo8283g()     // Catch:{ SQLiteException -> 0x0284 }
            r8.mo8279c()     // Catch:{ SQLiteException -> 0x0284 }
            boolean r8 = r5.f7181E     // Catch:{ SQLiteException -> 0x0284 }
            long r9 = r5.f7178B     // Catch:{ SQLiteException -> 0x0284 }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x019d
            r9 = r0
            goto L_0x019e
        L_0x019d:
            r9 = r12
        L_0x019e:
            r8 = r8 | r9
            r5.f7181E = r8     // Catch:{ SQLiteException -> 0x0284 }
            r5.f7178B = r6     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 20
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            q.b.a.b.h.b.g5 r8 = r5.f7184a     // Catch:{ SQLiteException -> 0x0284 }
            q.b.a.b.h.b.z4 r8 = r8.mo8283g()     // Catch:{ SQLiteException -> 0x0284 }
            r8.mo8279c()     // Catch:{ SQLiteException -> 0x0284 }
            boolean r8 = r5.f7181E     // Catch:{ SQLiteException -> 0x0284 }
            long r9 = r5.f7179C     // Catch:{ SQLiteException -> 0x0284 }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x01bc
            r9 = r0
            goto L_0x01bd
        L_0x01bc:
            r9 = r12
        L_0x01bd:
            r8 = r8 | r9
            r5.f7181E = r8     // Catch:{ SQLiteException -> 0x0284 }
            r5.f7179C = r6     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 21
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.mo8353i(r6)     // Catch:{ SQLiteException -> 0x0284 }
            q.b.a.b.h.b.g5 r6 = r1.f7133a     // Catch:{ SQLiteException -> 0x0284 }
            q.b.a.b.h.b.ka r6 = r6.f7338g     // Catch:{ SQLiteException -> 0x0284 }
            q.b.a.b.h.b.r3<java.lang.Boolean> r7 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7691M0     // Catch:{ SQLiteException -> 0x0284 }
            boolean r6 = r6.mo8574a(r7)     // Catch:{ SQLiteException -> 0x0284 }
            r7 = 0
            if (r6 != 0) goto L_0x01ea
            r6 = 22
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x0284 }
            if (r9 == 0) goto L_0x01e3
            r9 = r7
            goto L_0x01e7
        L_0x01e3:
            long r9 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
        L_0x01e7:
            r5.mo8355j(r9)     // Catch:{ SQLiteException -> 0x0284 }
        L_0x01ea:
            r6 = 23
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x0284 }
            if (r9 != 0) goto L_0x01fb
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x0284 }
            if (r6 == 0) goto L_0x01f9
            goto L_0x01fb
        L_0x01f9:
            r6 = r12
            goto L_0x01fc
        L_0x01fb:
            r6 = r0
        L_0x01fc:
            r5.mo8331b(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 24
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x0284 }
            if (r9 != 0) goto L_0x020f
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x0284 }
            if (r6 == 0) goto L_0x020e
            goto L_0x020f
        L_0x020e:
            r0 = r12
        L_0x020f:
            r5.mo8334c(r0)     // Catch:{ SQLiteException -> 0x0284 }
            r0 = 25
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0284 }
            r5.mo8333c(r0)     // Catch:{ SQLiteException -> 0x0284 }
            r0 = 26
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x0284 }
            if (r6 == 0) goto L_0x0224
            goto L_0x0228
        L_0x0224:
            long r7 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x0284 }
        L_0x0228:
            r5.mo8343f(r7)     // Catch:{ SQLiteException -> 0x0284 }
            r0 = 27
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x0284 }
            if (r6 != 0) goto L_0x0245
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0284 }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x0284 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x0284 }
            r5.mo8326a(r0)     // Catch:{ SQLiteException -> 0x0284 }
        L_0x0245:
            boolean r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2424ec.m5790b()     // Catch:{ SQLiteException -> 0x0284 }
            if (r0 == 0) goto L_0x0260
            q.b.a.b.h.b.g5 r0 = r1.f7133a     // Catch:{ SQLiteException -> 0x0284 }
            q.b.a.b.h.b.ka r0 = r0.f7338g     // Catch:{ SQLiteException -> 0x0284 }
            q.b.a.b.h.b.r3<java.lang.Boolean> r6 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7741o0     // Catch:{ SQLiteException -> 0x0284 }
            boolean r0 = r0.mo8578c(r2, r6)     // Catch:{ SQLiteException -> 0x0284 }
            if (r0 == 0) goto L_0x0260
            r0 = 28
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0284 }
            r5.mo8337d(r0)     // Catch:{ SQLiteException -> 0x0284 }
        L_0x0260:
            q.b.a.b.h.b.g5 r0 = r5.f7184a     // Catch:{ SQLiteException -> 0x0284 }
            q.b.a.b.h.b.z4 r0 = r0.mo8283g()     // Catch:{ SQLiteException -> 0x0284 }
            r0.mo8279c()     // Catch:{ SQLiteException -> 0x0284 }
            r5.f7181E = r12     // Catch:{ SQLiteException -> 0x0284 }
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0284 }
            if (r0 == 0) goto L_0x0280
            q.b.a.b.h.b.b4 r0 = r35.mo8285i()     // Catch:{ SQLiteException -> 0x0284 }
            q.b.a.b.h.b.e4 r0 = r0.f7153f     // Catch:{ SQLiteException -> 0x0284 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r36)     // Catch:{ SQLiteException -> 0x0284 }
            r0.mo8433a(r6, r7)     // Catch:{ SQLiteException -> 0x0284 }
        L_0x0280:
            r4.close()
            return r5
        L_0x0284:
            r0 = move-exception
            goto L_0x028a
        L_0x0286:
            r0 = move-exception
            goto L_0x02a1
        L_0x0288:
            r0 = move-exception
            r4 = r3
        L_0x028a:
            q.b.a.b.h.b.b4 r5 = r35.mo8285i()     // Catch:{ all -> 0x029f }
            q.b.a.b.h.b.e4 r5 = r5.f7153f     // Catch:{ all -> 0x029f }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r2 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r36)     // Catch:{ all -> 0x029f }
            r5.mo8434a(r6, r2, r0)     // Catch:{ all -> 0x029f }
            if (r4 == 0) goto L_0x029e
            r4.close()
        L_0x029e:
            return r3
        L_0x029f:
            r0 = move-exception
            r3 = r4
        L_0x02a1:
            if (r3 == 0) goto L_0x02a6
            r3.close()
        L_0x02a6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C2939e.mo8413b(java.lang.String):q.b.a.b.h.b.c4");
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c6  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo8420e(java.lang.String r10) {
        /*
            r9 = this;
            r9.mo8279c()
            r9.mo8649m()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.mo8425t()     // Catch:{ SQLiteException -> 0x00af, all -> 0x00ad }
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x00af, all -> 0x00ad }
            r5 = 0
            r4[r5] = r10     // Catch:{ SQLiteException -> 0x00af, all -> 0x00ad }
            android.database.Cursor r1 = r1.rawQuery(r2, r4)     // Catch:{ SQLiteException -> 0x00af, all -> 0x00ad }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00ab }
            if (r2 != 0) goto L_0x002c
            q.b.a.b.h.b.b4 r10 = r9.mo8285i()     // Catch:{ SQLiteException -> 0x00ab }
            q.b.a.b.h.b.e4 r10 = r10.f7161n     // Catch:{ SQLiteException -> 0x00ab }
            java.lang.String r2 = "Default event parameters not found"
            r10.mo8432a(r2)     // Catch:{ SQLiteException -> 0x00ab }
            r1.close()
            return r0
        L_0x002c:
            byte[] r2 = r1.getBlob(r5)     // Catch:{ SQLiteException -> 0x00ab }
            q.b.a.b.g.e.a1$a r4 = p213q.p217b.p218a.p231b.p251g.p256e.C2340a1.m5426n()     // Catch:{ IOException -> 0x0097 }
            q.b.a.b.g.e.s7 r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.m7336a(r4, r2)     // Catch:{ IOException -> 0x0097 }
            q.b.a.b.g.e.a1$a r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1.C2341a) r2     // Catch:{ IOException -> 0x0097 }
            q.b.a.b.g.e.p7 r2 = r2.mo7778m()     // Catch:{ IOException -> 0x0097 }
            q.b.a.b.g.e.i6 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r2     // Catch:{ IOException -> 0x0097 }
            q.b.a.b.g.e.a1 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r2     // Catch:{ IOException -> 0x0097 }
            r9.mo8651p()     // Catch:{ SQLiteException -> 0x00ab }
            q.b.a.b.g.e.q6<q.b.a.b.g.e.c1> r10 = r2.zzd     // Catch:{ SQLiteException -> 0x00ab }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00ab }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00ab }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ SQLiteException -> 0x00ab }
        L_0x0050:
            boolean r4 = r10.hasNext()     // Catch:{ SQLiteException -> 0x00ab }
            if (r4 == 0) goto L_0x0093
            java.lang.Object r4 = r10.next()     // Catch:{ SQLiteException -> 0x00ab }
            q.b.a.b.g.e.c1 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2378c1) r4     // Catch:{ SQLiteException -> 0x00ab }
            java.lang.String r6 = r4.zzd     // Catch:{ SQLiteException -> 0x00ab }
            boolean r7 = r4.mo7476p()     // Catch:{ SQLiteException -> 0x00ab }
            if (r7 == 0) goto L_0x006a
            double r7 = r4.zzh     // Catch:{ SQLiteException -> 0x00ab }
            r2.putDouble(r6, r7)     // Catch:{ SQLiteException -> 0x00ab }
            goto L_0x0050
        L_0x006a:
            int r7 = r4.zzc     // Catch:{ SQLiteException -> 0x00ab }
            r7 = r7 & 8
            if (r7 == 0) goto L_0x0072
            r7 = r3
            goto L_0x0073
        L_0x0072:
            r7 = r5
        L_0x0073:
            if (r7 == 0) goto L_0x007b
            float r4 = r4.zzg     // Catch:{ SQLiteException -> 0x00ab }
            r2.putFloat(r6, r4)     // Catch:{ SQLiteException -> 0x00ab }
            goto L_0x0050
        L_0x007b:
            boolean r7 = r4.mo7472l()     // Catch:{ SQLiteException -> 0x00ab }
            if (r7 == 0) goto L_0x0087
            java.lang.String r4 = r4.zze     // Catch:{ SQLiteException -> 0x00ab }
            r2.putString(r6, r4)     // Catch:{ SQLiteException -> 0x00ab }
            goto L_0x0050
        L_0x0087:
            boolean r7 = r4.mo7474n()     // Catch:{ SQLiteException -> 0x00ab }
            if (r7 == 0) goto L_0x0050
            long r7 = r4.zzf     // Catch:{ SQLiteException -> 0x00ab }
            r2.putLong(r6, r7)     // Catch:{ SQLiteException -> 0x00ab }
            goto L_0x0050
        L_0x0093:
            r1.close()
            return r2
        L_0x0097:
            r2 = move-exception
            q.b.a.b.h.b.b4 r3 = r9.mo8285i()     // Catch:{ SQLiteException -> 0x00ab }
            q.b.a.b.h.b.e4 r3 = r3.f7153f     // Catch:{ SQLiteException -> 0x00ab }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r10 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r10)     // Catch:{ SQLiteException -> 0x00ab }
            r3.mo8434a(r4, r10, r2)     // Catch:{ SQLiteException -> 0x00ab }
            r1.close()
            return r0
        L_0x00ab:
            r10 = move-exception
            goto L_0x00b1
        L_0x00ad:
            r10 = move-exception
            goto L_0x00c4
        L_0x00af:
            r10 = move-exception
            r1 = r0
        L_0x00b1:
            q.b.a.b.h.b.b4 r2 = r9.mo8285i()     // Catch:{ all -> 0x00c2 }
            q.b.a.b.h.b.e4 r2 = r2.f7153f     // Catch:{ all -> 0x00c2 }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.mo8433a(r3, r10)     // Catch:{ all -> 0x00c2 }
            if (r1 == 0) goto L_0x00c1
            r1.close()
        L_0x00c1:
            return r0
        L_0x00c2:
            r10 = move-exception
            r0 = r1
        L_0x00c4:
            if (r0 == 0) goto L_0x00c9
            r0.close()
        L_0x00c9:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C2939e.mo8420e(java.lang.String):android.os.Bundle");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p213q.p217b.p218a.p231b.p259h.p261b.C3134u9 mo8416c(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            p124p.p126b.p127k.C1061o.m2528b(r19)
            p124p.p126b.p127k.C1061o.m2528b(r20)
            r18.mo8279c()
            r18.mo8649m()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.mo8425t()     // Catch:{ SQLiteException -> 0x007c, all -> 0x0078 }
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch:{ SQLiteException -> 0x007c, all -> 0x0078 }
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x007c, all -> 0x0078 }
            r1 = 0
            r14[r1] = r19     // Catch:{ SQLiteException -> 0x007c, all -> 0x0078 }
            r2 = 1
            r14[r2] = r8     // Catch:{ SQLiteException -> 0x007c, all -> 0x0078 }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x007c, all -> 0x0078 }
            boolean r3 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x0074, all -> 0x0070 }
            if (r3 != 0) goto L_0x003d
            r10.close()
            return r9
        L_0x003d:
            long r5 = r10.getLong(r1)     // Catch:{ SQLiteException -> 0x0074, all -> 0x0070 }
            r11 = r18
            java.lang.Object r7 = r11.mo8391a(r10, r2)     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r3 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x006e }
            q.b.a.b.h.b.u9 r0 = new q.b.a.b.h.b.u9     // Catch:{ SQLiteException -> 0x006e }
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x006e }
            boolean r1 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x006e }
            if (r1 == 0) goto L_0x006a
            q.b.a.b.h.b.b4 r1 = r18.mo8285i()     // Catch:{ SQLiteException -> 0x006e }
            q.b.a.b.h.b.e4 r1 = r1.f7153f     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r19)     // Catch:{ SQLiteException -> 0x006e }
            r1.mo8433a(r2, r3)     // Catch:{ SQLiteException -> 0x006e }
        L_0x006a:
            r10.close()
            return r0
        L_0x006e:
            r0 = move-exception
            goto L_0x0080
        L_0x0070:
            r0 = move-exception
            r11 = r18
            goto L_0x009e
        L_0x0074:
            r0 = move-exception
            r11 = r18
            goto L_0x0080
        L_0x0078:
            r0 = move-exception
            r11 = r18
            goto L_0x009f
        L_0x007c:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L_0x0080:
            q.b.a.b.h.b.b4 r1 = r18.mo8285i()     // Catch:{ all -> 0x009d }
            q.b.a.b.h.b.e4 r1 = r1.f7153f     // Catch:{ all -> 0x009d }
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r19)     // Catch:{ all -> 0x009d }
            q.b.a.b.h.b.z3 r4 = r18.mo8281e()     // Catch:{ all -> 0x009d }
            java.lang.String r4 = r4.mo8838c(r8)     // Catch:{ all -> 0x009d }
            r1.mo8435a(r2, r3, r4, r0)     // Catch:{ all -> 0x009d }
            if (r10 == 0) goto L_0x009c
            r10.close()
        L_0x009c:
            return r9
        L_0x009d:
            r0 = move-exception
        L_0x009e:
            r9 = r10
        L_0x009f:
            if (r9 == 0) goto L_0x00a4
            r9.close()
        L_0x00a4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C2939e.mo8416c(java.lang.String, java.lang.String):q.b.a.b.h.b.u9");
    }

    /* renamed from: a */
    public final long mo8389a(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo8425t().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return j;
        } catch (SQLiteException e) {
            mo8285i().f7153f.mo8434a("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final C2927d mo8397a(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C1061o.m2528b(str);
        mo8279c();
        mo8649m();
        String[] strArr = {str};
        C2927d dVar = new C2927d();
        Cursor cursor = null;
        try {
            SQLiteDatabase t = mo8425t();
            SQLiteDatabase sQLiteDatabase = t;
            cursor = sQLiteDatabase.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
            if (!cursor.moveToFirst()) {
                mo8285i().f7156i.mo8433a("Not updating daily counts, app is not known. appId", C2908b4.m6745a(str));
                cursor.close();
                return dVar;
            }
            if (cursor.getLong(0) == j) {
                dVar.f7232b = cursor.getLong(1);
                dVar.f7231a = cursor.getLong(2);
                dVar.f7233c = cursor.getLong(3);
                dVar.f7234d = cursor.getLong(4);
                dVar.f7235e = cursor.getLong(5);
            }
            if (z) {
                dVar.f7232b += j2;
            }
            if (z2) {
                dVar.f7231a += j2;
            }
            if (z3) {
                dVar.f7233c += j2;
            }
            if (z4) {
                dVar.f7234d += j2;
            }
            if (z5) {
                dVar.f7235e += j2;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j));
            contentValues.put("daily_public_events_count", Long.valueOf(dVar.f7231a));
            contentValues.put("daily_events_count", Long.valueOf(dVar.f7232b));
            contentValues.put("daily_conversions_count", Long.valueOf(dVar.f7233c));
            contentValues.put("daily_error_events_count", Long.valueOf(dVar.f7234d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(dVar.f7235e));
            t.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return dVar;
        } catch (SQLiteException e) {
            mo8285i().f7153f.mo8434a("Error updating daily counts. appId", C2908b4.m6745a(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return dVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0147  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p213q.p217b.p218a.p231b.p259h.p261b.C2999j mo8399a(java.lang.String r26, java.lang.String r27) {
        /*
            r25 = this;
            r15 = r27
            p124p.p126b.p127k.C1061o.m2528b(r26)
            p124p.p126b.p127k.C1061o.m2528b(r27)
            r25.mo8279c()
            r25.mo8649m()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r1 = "lifetime_count"
            java.lang.String r2 = "current_bundle_count"
            java.lang.String r3 = "last_fire_timestamp"
            java.lang.String r4 = "last_bundled_timestamp"
            java.lang.String r5 = "last_bundled_day"
            java.lang.String r6 = "last_sampled_complex_event_id"
            java.lang.String r7 = "last_sampling_rate"
            java.lang.String r8 = "last_exempt_from_sampling"
            java.lang.String r9 = "current_session_count"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            r18 = 0
            android.database.sqlite.SQLiteDatabase r1 = r25.mo8425t()     // Catch:{ SQLiteException -> 0x0120, all -> 0x011e }
            java.lang.String r2 = "events"
            r9 = 0
            java.lang.String[] r3 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x0120, all -> 0x011e }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0120, all -> 0x011e }
            r3 = r0
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ SQLiteException -> 0x0120, all -> 0x011e }
            java.lang.String r4 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0120, all -> 0x011e }
            r5[r9] = r26     // Catch:{ SQLiteException -> 0x0120, all -> 0x011e }
            r10 = 1
            r5[r10] = r15     // Catch:{ SQLiteException -> 0x0120, all -> 0x011e }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0120, all -> 0x011e }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x011a, all -> 0x0114 }
            if (r1 != 0) goto L_0x005a
            r14.close()
            return r18
        L_0x005a:
            long r4 = r14.getLong(r9)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0114 }
            long r6 = r14.getLong(r10)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0114 }
            long r11 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0114 }
            r0 = 3
            boolean r1 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0114 }
            r2 = 0
            if (r1 == 0) goto L_0x0072
            r16 = r2
            goto L_0x0078
        L_0x0072:
            long r0 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0114 }
            r16 = r0
        L_0x0078:
            r0 = 4
            boolean r1 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0114 }
            if (r1 == 0) goto L_0x0082
            r0 = r18
            goto L_0x008a
        L_0x0082:
            long r0 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0114 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0114 }
        L_0x008a:
            r1 = 5
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0114 }
            if (r8 == 0) goto L_0x0094
            r19 = r18
            goto L_0x009e
        L_0x0094:
            long r19 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0114 }
            java.lang.Long r1 = java.lang.Long.valueOf(r19)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0114 }
            r19 = r1
        L_0x009e:
            r1 = 6
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0114 }
            if (r8 == 0) goto L_0x00a8
            r20 = r18
            goto L_0x00b2
        L_0x00a8:
            long r20 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0114 }
            java.lang.Long r1 = java.lang.Long.valueOf(r20)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0114 }
            r20 = r1
        L_0x00b2:
            r1 = 7
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0114 }
            if (r8 != 0) goto L_0x00cd
            long r21 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x00cb }
            r23 = 1
            int r1 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r1 != 0) goto L_0x00c4
            r9 = r10
        L_0x00c4:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ SQLiteException -> 0x00cb }
            r21 = r1
            goto L_0x00cf
        L_0x00cb:
            r0 = move-exception
            goto L_0x0123
        L_0x00cd:
            r21 = r18
        L_0x00cf:
            r1 = 8
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0114 }
            if (r8 == 0) goto L_0x00d9
            r8 = r2
            goto L_0x00de
        L_0x00d9:
            long r1 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x011a, all -> 0x0114 }
            r8 = r1
        L_0x00de:
            q.b.a.b.h.b.j r22 = new q.b.a.b.h.b.j     // Catch:{ SQLiteException -> 0x011a, all -> 0x0114 }
            r1 = r22
            r2 = r26
            r3 = r27
            r10 = r11
            r12 = r16
            r23 = r14
            r14 = r0
            r15 = r19
            r16 = r20
            r17 = r21
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0110, all -> 0x010e }
            boolean r0 = r23.moveToNext()     // Catch:{ SQLiteException -> 0x0110, all -> 0x010e }
            if (r0 == 0) goto L_0x010a
            q.b.a.b.h.b.b4 r0 = r25.mo8285i()     // Catch:{ SQLiteException -> 0x0110, all -> 0x010e }
            q.b.a.b.h.b.e4 r0 = r0.f7153f     // Catch:{ SQLiteException -> 0x0110, all -> 0x010e }
            java.lang.String r1 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r2 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r26)     // Catch:{ SQLiteException -> 0x0110, all -> 0x010e }
            r0.mo8433a(r1, r2)     // Catch:{ SQLiteException -> 0x0110, all -> 0x010e }
        L_0x010a:
            r23.close()
            return r22
        L_0x010e:
            r0 = move-exception
            goto L_0x0117
        L_0x0110:
            r0 = move-exception
            r14 = r23
            goto L_0x0123
        L_0x0114:
            r0 = move-exception
            r23 = r14
        L_0x0117:
            r18 = r23
            goto L_0x0145
        L_0x011a:
            r0 = move-exception
            r23 = r14
            goto L_0x0123
        L_0x011e:
            r0 = move-exception
            goto L_0x0145
        L_0x0120:
            r0 = move-exception
            r14 = r18
        L_0x0123:
            q.b.a.b.h.b.b4 r1 = r25.mo8285i()     // Catch:{ all -> 0x0142 }
            q.b.a.b.h.b.e4 r1 = r1.f7153f     // Catch:{ all -> 0x0142 }
            java.lang.String r2 = "Error querying events. appId"
            java.lang.Object r3 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r26)     // Catch:{ all -> 0x0142 }
            q.b.a.b.h.b.z3 r4 = r25.mo8281e()     // Catch:{ all -> 0x0142 }
            r5 = r27
            java.lang.String r4 = r4.mo8834a(r5)     // Catch:{ all -> 0x0142 }
            r1.mo8435a(r2, r3, r4, r0)     // Catch:{ all -> 0x0142 }
            if (r14 == 0) goto L_0x0141
            r14.close()
        L_0x0141:
            return r18
        L_0x0142:
            r0 = move-exception
            r18 = r14
        L_0x0145:
            if (r18 == 0) goto L_0x014a
            r18.close()
        L_0x014a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C2939e.mo8399a(java.lang.String, java.lang.String):q.b.a.b.h.b.j");
    }

    /* renamed from: a */
    public final Object mo8391a(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            mo8285i().f7153f.mo8432a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                mo8285i().f7153f.mo8433a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            mo8285i().f7153f.mo8432a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo8392a(long r5) {
        /*
            r4 = this;
            r4.mo8279c()
            r4.mo8649m()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.mo8425t()     // Catch:{ SQLiteException -> 0x003c, all -> 0x003a }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x003c, all -> 0x003a }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x003c, all -> 0x003a }
            r6 = 0
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x003c, all -> 0x003a }
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x003c, all -> 0x003a }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0038 }
            if (r1 != 0) goto L_0x0030
            q.b.a.b.h.b.b4 r6 = r4.mo8285i()     // Catch:{ SQLiteException -> 0x0038 }
            q.b.a.b.h.b.e4 r6 = r6.f7161n     // Catch:{ SQLiteException -> 0x0038 }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.mo8432a(r1)     // Catch:{ SQLiteException -> 0x0038 }
            r5.close()
            return r0
        L_0x0030:
            java.lang.String r6 = r5.getString(r6)     // Catch:{ SQLiteException -> 0x0038 }
            r5.close()
            return r6
        L_0x0038:
            r6 = move-exception
            goto L_0x003e
        L_0x003a:
            r6 = move-exception
            goto L_0x0051
        L_0x003c:
            r6 = move-exception
            r5 = r0
        L_0x003e:
            q.b.a.b.h.b.b4 r1 = r4.mo8285i()     // Catch:{ all -> 0x004f }
            q.b.a.b.h.b.e4 r1 = r1.f7153f     // Catch:{ all -> 0x004f }
            java.lang.String r2 = "Error selecting expired configs"
            r1.mo8433a(r2, r6)     // Catch:{ all -> 0x004f }
            if (r5 == 0) goto L_0x004e
            r5.close()
        L_0x004e:
            return r0
        L_0x004f:
            r6 = move-exception
            r0 = r5
        L_0x0051:
            if (r0 == 0) goto L_0x0056
            r0.close()
        L_0x0056:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C2939e.mo8392a(long):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p213q.p217b.p218a.p231b.p259h.p261b.C3134u9> mo8393a(java.lang.String r14) {
        /*
            r13 = this;
            p124p.p126b.p127k.C1061o.m2528b(r14)
            r13.mo8279c()
            r13.mo8649m()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.mo8425t()     // Catch:{ SQLiteException -> 0x007e, all -> 0x007c }
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch:{ SQLiteException -> 0x007e, all -> 0x007c }
            java.lang.String r5 = "app_id=?"
            r11 = 1
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x007e, all -> 0x007c }
            r12 = 0
            r6[r12] = r14     // Catch:{ SQLiteException -> 0x007e, all -> 0x007c }
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x007e, all -> 0x007c }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x007a }
            if (r3 != 0) goto L_0x003d
            r2.close()
            return r0
        L_0x003d:
            java.lang.String r7 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x007a }
            java.lang.String r3 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x007a }
            if (r3 != 0) goto L_0x0049
            java.lang.String r3 = ""
        L_0x0049:
            r6 = r3
            r3 = 2
            long r8 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x007a }
            r3 = 3
            java.lang.Object r10 = r13.mo8391a(r2, r3)     // Catch:{ SQLiteException -> 0x007a }
            if (r10 != 0) goto L_0x0066
            q.b.a.b.h.b.b4 r3 = r13.mo8285i()     // Catch:{ SQLiteException -> 0x007a }
            q.b.a.b.h.b.e4 r3 = r3.f7153f     // Catch:{ SQLiteException -> 0x007a }
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r14)     // Catch:{ SQLiteException -> 0x007a }
            r3.mo8433a(r4, r5)     // Catch:{ SQLiteException -> 0x007a }
            goto L_0x0070
        L_0x0066:
            q.b.a.b.h.b.u9 r3 = new q.b.a.b.h.b.u9     // Catch:{ SQLiteException -> 0x007a }
            r4 = r3
            r5 = r14
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x007a }
            r0.add(r3)     // Catch:{ SQLiteException -> 0x007a }
        L_0x0070:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x007a }
            if (r3 != 0) goto L_0x003d
            r2.close()
            return r0
        L_0x007a:
            r0 = move-exception
            goto L_0x0080
        L_0x007c:
            r14 = move-exception
            goto L_0x00b3
        L_0x007e:
            r0 = move-exception
            r2 = r1
        L_0x0080:
            q.b.a.b.h.b.b4 r3 = r13.mo8285i()     // Catch:{ all -> 0x00b1 }
            q.b.a.b.h.b.e4 r3 = r3.f7153f     // Catch:{ all -> 0x00b1 }
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r14)     // Catch:{ all -> 0x00b1 }
            r3.mo8434a(r4, r5, r0)     // Catch:{ all -> 0x00b1 }
            boolean r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2568mb.m6153b()     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00ab
            q.b.a.b.h.b.g5 r0 = r13.f7133a     // Catch:{ all -> 0x00b1 }
            q.b.a.b.h.b.ka r0 = r0.f7338g     // Catch:{ all -> 0x00b1 }
            q.b.a.b.h.b.r3<java.lang.Boolean> r3 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7705T0     // Catch:{ all -> 0x00b1 }
            boolean r14 = r0.mo8578c(r14, r3)     // Catch:{ all -> 0x00b1 }
            if (r14 == 0) goto L_0x00ab
            java.util.List r14 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00b1 }
            if (r2 == 0) goto L_0x00aa
            r2.close()
        L_0x00aa:
            return r14
        L_0x00ab:
            if (r2 == 0) goto L_0x00b0
            r2.close()
        L_0x00b0:
            return r1
        L_0x00b1:
            r14 = move-exception
            r1 = r2
        L_0x00b3:
            if (r1 == 0) goto L_0x00b8
            r1.close()
        L_0x00b8:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C2939e.mo8393a(java.lang.String):java.util.List");
    }

    /* renamed from: b */
    public final void mo8414b(String str, String str2) {
        C1061o.m2528b(str);
        C1061o.m2528b(str2);
        mo8279c();
        mo8649m();
        try {
            mo8425t().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            mo8285i().f7153f.mo8435a("Error deleting user property. appId", C2908b4.m6745a(str), mo8281e().mo8838c(str2), e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bf A[LOOP:0: B:17:0x0052->B:41:0x00bf, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c1 A[EDGE_INSN: B:55:0x00c1->B:42:0x00c1 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Pair<p213q.p217b.p218a.p231b.p251g.p256e.C2412e1, java.lang.Long>> mo8394a(java.lang.String r13, int r14, int r15) {
        /*
            r12 = this;
            r12.mo8279c()
            r12.mo8649m()
            r0 = 1
            r1 = 0
            if (r14 <= 0) goto L_0x000c
            r2 = r0
            goto L_0x000d
        L_0x000c:
            r2 = r1
        L_0x000d:
            p124p.p126b.p127k.C1061o.m2507a(r2)
            if (r15 <= 0) goto L_0x0014
            r2 = r0
            goto L_0x0015
        L_0x0014:
            r2 = r1
        L_0x0015:
            p124p.p126b.p127k.C1061o.m2507a(r2)
            p124p.p126b.p127k.C1061o.m2528b(r13)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.mo8425t()     // Catch:{ SQLiteException -> 0x00c7 }
            java.lang.String r4 = "queue"
            java.lang.String r5 = "rowid"
            java.lang.String r6 = "data"
            java.lang.String r7 = "retry_count"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7}     // Catch:{ SQLiteException -> 0x00c7 }
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00c7 }
            r7[r1] = r13     // Catch:{ SQLiteException -> 0x00c7 }
            r8 = 0
            r9 = 0
            java.lang.String r10 = "rowid"
            java.lang.String r11 = java.lang.String.valueOf(r14)     // Catch:{ SQLiteException -> 0x00c7 }
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x00c7 }
            boolean r14 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00c7 }
            if (r14 != 0) goto L_0x004c
            java.util.List r13 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x00c7 }
            r2.close()
            return r13
        L_0x004c:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00c7 }
            r14.<init>()     // Catch:{ SQLiteException -> 0x00c7 }
            r3 = r1
        L_0x0052:
            long r4 = r2.getLong(r1)     // Catch:{ SQLiteException -> 0x00c7 }
            byte[] r6 = r2.getBlob(r0)     // Catch:{ IOException -> 0x00ab }
            q.b.a.b.h.b.t9 r7 = r12.mo8651p()     // Catch:{ IOException -> 0x00ab }
            byte[] r6 = r7.mo8746b(r6)     // Catch:{ IOException -> 0x00ab }
            boolean r7 = r14.isEmpty()     // Catch:{ SQLiteException -> 0x00c7 }
            if (r7 != 0) goto L_0x006c
            int r7 = r6.length     // Catch:{ SQLiteException -> 0x00c7 }
            int r7 = r7 + r3
            if (r7 > r15) goto L_0x00c1
        L_0x006c:
            q.b.a.b.g.e.e1$a r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2412e1.m5677o()     // Catch:{ IOException -> 0x009a }
            q.b.a.b.g.e.s7 r7 = p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.m7336a(r7, r6)     // Catch:{ IOException -> 0x009a }
            q.b.a.b.g.e.e1$a r7 = (p213q.p217b.p218a.p231b.p251g.p256e.C2412e1.C2413a) r7     // Catch:{ IOException -> 0x009a }
            r8 = 2
            boolean r9 = r2.isNull(r8)     // Catch:{ SQLiteException -> 0x00c7 }
            if (r9 != 0) goto L_0x0084
            int r8 = r2.getInt(r8)     // Catch:{ SQLiteException -> 0x00c7 }
            r7.mo7586h(r8)     // Catch:{ SQLiteException -> 0x00c7 }
        L_0x0084:
            int r6 = r6.length     // Catch:{ SQLiteException -> 0x00c7 }
            int r3 = r3 + r6
            q.b.a.b.g.e.p7 r6 = r7.mo7778m()     // Catch:{ SQLiteException -> 0x00c7 }
            q.b.a.b.g.e.i6 r6 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r6     // Catch:{ SQLiteException -> 0x00c7 }
            q.b.a.b.g.e.e1 r6 = (p213q.p217b.p218a.p231b.p251g.p256e.C2412e1) r6     // Catch:{ SQLiteException -> 0x00c7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x00c7 }
            android.util.Pair r4 = android.util.Pair.create(r6, r4)     // Catch:{ SQLiteException -> 0x00c7 }
            r14.add(r4)     // Catch:{ SQLiteException -> 0x00c7 }
            goto L_0x00b9
        L_0x009a:
            r4 = move-exception
            q.b.a.b.h.b.b4 r5 = r12.mo8285i()     // Catch:{ SQLiteException -> 0x00c7 }
            q.b.a.b.h.b.e4 r5 = r5.f7153f     // Catch:{ SQLiteException -> 0x00c7 }
            java.lang.String r6 = "Failed to merge queued bundle. appId"
            java.lang.Object r7 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r13)     // Catch:{ SQLiteException -> 0x00c7 }
        L_0x00a7:
            r5.mo8434a(r6, r7, r4)     // Catch:{ SQLiteException -> 0x00c7 }
            goto L_0x00b9
        L_0x00ab:
            r4 = move-exception
            q.b.a.b.h.b.b4 r5 = r12.mo8285i()     // Catch:{ SQLiteException -> 0x00c7 }
            q.b.a.b.h.b.e4 r5 = r5.f7153f     // Catch:{ SQLiteException -> 0x00c7 }
            java.lang.String r6 = "Failed to unzip queued bundle. appId"
            java.lang.Object r7 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r13)     // Catch:{ SQLiteException -> 0x00c7 }
            goto L_0x00a7
        L_0x00b9:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00c7 }
            if (r4 == 0) goto L_0x00c1
            if (r3 <= r15) goto L_0x0052
        L_0x00c1:
            r2.close()
            return r14
        L_0x00c5:
            r13 = move-exception
            goto L_0x00e1
        L_0x00c7:
            r14 = move-exception
            q.b.a.b.h.b.b4 r15 = r12.mo8285i()     // Catch:{ all -> 0x00c5 }
            q.b.a.b.h.b.e4 r15 = r15.f7153f     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = "Error querying bundles. appId"
            java.lang.Object r13 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r13)     // Catch:{ all -> 0x00c5 }
            r15.mo8434a(r0, r13, r14)     // Catch:{ all -> 0x00c5 }
            java.util.List r13 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00c5 }
            if (r2 == 0) goto L_0x00e0
            r2.close()
        L_0x00e0:
            return r13
        L_0x00e1:
            if (r2 == 0) goto L_0x00e6
            r2.close()
        L_0x00e6:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C2939e.mo8394a(java.lang.String, int, int):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ea, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00eb, code lost:
        r4 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010f, code lost:
        r0 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0113, code lost:
        if (r12 != null) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0115, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0118, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011b, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0123, code lost:
        r10.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e8 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0013] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0103 A[Catch:{ all -> 0x011f }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0123  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p213q.p217b.p218a.p231b.p259h.p261b.C3134u9> mo8395a(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            r21 = this;
            r1 = r21
            r9 = r22
            p124p.p126b.p127k.C1061o.m2528b(r22)
            r21.mo8279c()
            r21.mo8649m()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00ea, all -> 0x00e8 }
            r11 = 3
            r2.<init>(r11)     // Catch:{ SQLiteException -> 0x00ea, all -> 0x00e8 }
            r2.add(r9)     // Catch:{ SQLiteException -> 0x00ea, all -> 0x00e8 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00ea, all -> 0x00e8 }
            java.lang.String r4 = "app_id=?"
            r3.<init>(r4)     // Catch:{ SQLiteException -> 0x00ea, all -> 0x00e8 }
            boolean r4 = android.text.TextUtils.isEmpty(r23)     // Catch:{ SQLiteException -> 0x00ea, all -> 0x00e8 }
            if (r4 != 0) goto L_0x0034
            r4 = r23
            r2.add(r4)     // Catch:{ SQLiteException -> 0x00e6, all -> 0x00e8 }
            java.lang.String r5 = " and origin=?"
            r3.append(r5)     // Catch:{ SQLiteException -> 0x00e6, all -> 0x00e8 }
            goto L_0x0036
        L_0x0034:
            r4 = r23
        L_0x0036:
            boolean r5 = android.text.TextUtils.isEmpty(r24)     // Catch:{ SQLiteException -> 0x00e6, all -> 0x00e8 }
            if (r5 != 0) goto L_0x004e
            java.lang.String r5 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x00e6, all -> 0x00e8 }
            java.lang.String r6 = "*"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ SQLiteException -> 0x00e6, all -> 0x00e8 }
            r2.add(r5)     // Catch:{ SQLiteException -> 0x00e6, all -> 0x00e8 }
            java.lang.String r5 = " and name glob ?"
            r3.append(r5)     // Catch:{ SQLiteException -> 0x00e6, all -> 0x00e8 }
        L_0x004e:
            int r5 = r2.size()     // Catch:{ SQLiteException -> 0x00e6, all -> 0x00e8 }
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x00e6, all -> 0x00e8 }
            java.lang.Object[] r2 = r2.toArray(r5)     // Catch:{ SQLiteException -> 0x00e6, all -> 0x00e8 }
            r16 = r2
            java.lang.String[] r16 = (java.lang.String[]) r16     // Catch:{ SQLiteException -> 0x00e6, all -> 0x00e8 }
            android.database.sqlite.SQLiteDatabase r12 = r21.mo8425t()     // Catch:{ SQLiteException -> 0x00e6, all -> 0x00e8 }
            java.lang.String r13 = "user_attributes"
            java.lang.String r2 = "name"
            java.lang.String r5 = "set_timestamp"
            java.lang.String r6 = "value"
            java.lang.String r7 = "origin"
            java.lang.String[] r14 = new java.lang.String[]{r2, r5, r6, r7}     // Catch:{ SQLiteException -> 0x00e6, all -> 0x00e8 }
            java.lang.String r15 = r3.toString()     // Catch:{ SQLiteException -> 0x00e6, all -> 0x00e8 }
            r17 = 0
            r18 = 0
            java.lang.String r19 = "rowid"
            java.lang.String r20 = "1001"
            android.database.Cursor r12 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x00e6, all -> 0x00e8 }
            boolean r2 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x00e4 }
            if (r2 != 0) goto L_0x0088
            r12.close()
            return r0
        L_0x0088:
            int r2 = r0.size()     // Catch:{ SQLiteException -> 0x00e4 }
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 < r3) goto L_0x00a0
            q.b.a.b.h.b.b4 r2 = r21.mo8285i()     // Catch:{ SQLiteException -> 0x00e4 }
            q.b.a.b.h.b.e4 r2 = r2.f7153f     // Catch:{ SQLiteException -> 0x00e4 }
            java.lang.String r5 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x00e4 }
            r2.mo8433a(r5, r3)     // Catch:{ SQLiteException -> 0x00e4 }
            goto L_0x00db
        L_0x00a0:
            r2 = 0
            java.lang.String r5 = r12.getString(r2)     // Catch:{ SQLiteException -> 0x00e4 }
            r2 = 1
            long r6 = r12.getLong(r2)     // Catch:{ SQLiteException -> 0x00e4 }
            r2 = 2
            java.lang.Object r8 = r1.mo8391a(r12, r2)     // Catch:{ SQLiteException -> 0x00e4 }
            java.lang.String r13 = r12.getString(r11)     // Catch:{ SQLiteException -> 0x00e4 }
            if (r8 != 0) goto L_0x00c7
            q.b.a.b.h.b.b4 r2 = r21.mo8285i()     // Catch:{ SQLiteException -> 0x00e1 }
            q.b.a.b.h.b.e4 r2 = r2.f7153f     // Catch:{ SQLiteException -> 0x00e1 }
            java.lang.String r3 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r4 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r22)     // Catch:{ SQLiteException -> 0x00e1 }
            r14 = r24
            r2.mo8435a(r3, r4, r13, r14)     // Catch:{ SQLiteException -> 0x00e1 }
            goto L_0x00d5
        L_0x00c7:
            r14 = r24
            q.b.a.b.h.b.u9 r15 = new q.b.a.b.h.b.u9     // Catch:{ SQLiteException -> 0x00e1 }
            r2 = r15
            r3 = r22
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ SQLiteException -> 0x00e1 }
            r0.add(r15)     // Catch:{ SQLiteException -> 0x00e1 }
        L_0x00d5:
            boolean r2 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x00e1 }
            if (r2 != 0) goto L_0x00df
        L_0x00db:
            r12.close()
            return r0
        L_0x00df:
            r4 = r13
            goto L_0x0088
        L_0x00e1:
            r0 = move-exception
            r4 = r13
            goto L_0x00ee
        L_0x00e4:
            r0 = move-exception
            goto L_0x00ee
        L_0x00e6:
            r0 = move-exception
            goto L_0x00ed
        L_0x00e8:
            r0 = move-exception
            goto L_0x0121
        L_0x00ea:
            r0 = move-exception
            r4 = r23
        L_0x00ed:
            r12 = r10
        L_0x00ee:
            q.b.a.b.h.b.b4 r2 = r21.mo8285i()     // Catch:{ all -> 0x011f }
            q.b.a.b.h.b.e4 r2 = r2.f7153f     // Catch:{ all -> 0x011f }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r22)     // Catch:{ all -> 0x011f }
            r2.mo8435a(r3, r5, r4, r0)     // Catch:{ all -> 0x011f }
            boolean r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2568mb.m6153b()     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x0119
            q.b.a.b.h.b.g5 r0 = r1.f7133a     // Catch:{ all -> 0x011f }
            q.b.a.b.h.b.ka r0 = r0.f7338g     // Catch:{ all -> 0x011f }
            q.b.a.b.h.b.r3<java.lang.Boolean> r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7705T0     // Catch:{ all -> 0x011f }
            boolean r0 = r0.mo8578c(r9, r2)     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x0119
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x011f }
            if (r12 == 0) goto L_0x0118
            r12.close()
        L_0x0118:
            return r0
        L_0x0119:
            if (r12 == 0) goto L_0x011e
            r12.close()
        L_0x011e:
            return r10
        L_0x011f:
            r0 = move-exception
            r10 = r12
        L_0x0121:
            if (r10 == 0) goto L_0x0126
            r10.close()
        L_0x0126:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C2939e.mo8395a(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public final List<C2998ia> mo8396a(String str, String[] strArr) {
        mo8279c();
        mo8649m();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = mo8425t().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
            if (!cursor.moveToFirst()) {
                cursor.close();
                return arrayList;
            }
            while (true) {
                if (arrayList.size() < 1000) {
                    boolean z = false;
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object a = mo8391a(cursor, 3);
                    if (cursor.getInt(4) != 0) {
                        z = true;
                    }
                    String string4 = cursor.getString(5);
                    long j = cursor.getLong(6);
                    C3047n nVar = (C3047n) mo8651p().mo8733a(cursor.getBlob(7), C3047n.CREATOR);
                    long j2 = cursor.getLong(8);
                    C3047n nVar2 = (C3047n) mo8651p().mo8733a(cursor.getBlob(9), C3047n.CREATOR);
                    long j3 = cursor.getLong(10);
                    long j4 = cursor.getLong(11);
                    C3047n nVar3 = (C3047n) mo8651p().mo8733a(cursor.getBlob(12), C3047n.CREATOR);
                    C3112s9 s9Var = new C3112s9(string3, j3, a, string2);
                    boolean z2 = z;
                    C2998ia iaVar = r3;
                    C2998ia iaVar2 = new C2998ia(string, string2, s9Var, j2, z2, string4, nVar, j, nVar2, j4, nVar3);
                    arrayList.add(iaVar);
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } else {
                    mo8285i().f7153f.mo8433a("Read more than the max allowed conditional properties, ignoring extra", Integer.valueOf(1000));
                    break;
                }
            }
            cursor.close();
            return arrayList;
        } catch (SQLiteException e) {
            mo8285i().f7153f.mo8433a("Error querying conditional user property value", e);
            List<C2998ia> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo8402a(C2999j jVar) {
        C1061o.m2524b(jVar);
        mo8279c();
        mo8649m();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", jVar.f7429a);
        contentValues.put("name", jVar.f7430b);
        contentValues.put("lifetime_count", Long.valueOf(jVar.f7431c));
        contentValues.put("current_bundle_count", Long.valueOf(jVar.f7432d));
        contentValues.put("last_fire_timestamp", Long.valueOf(jVar.f7434f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(jVar.f7435g));
        contentValues.put("last_bundled_day", jVar.f7436h);
        contentValues.put("last_sampled_complex_event_id", jVar.f7437i);
        contentValues.put("last_sampling_rate", jVar.f7438j);
        contentValues.put("current_session_count", Long.valueOf(jVar.f7433e));
        Boolean bool = jVar.f7439k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : Long.valueOf(1));
        try {
            if (mo8425t().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                mo8285i().f7153f.mo8433a("Failed to insert/update event aggregates (got -1). appId", C2908b4.m6745a(jVar.f7429a));
            }
        } catch (SQLiteException e) {
            mo8285i().f7153f.mo8434a("Error storing event aggregates. appId", C2908b4.m6745a(jVar.f7429a), e);
        }
    }

    /* renamed from: a */
    public final void mo8401a(C2920c4 c4Var) {
        String str = "apps";
        C1061o.m2524b(c4Var);
        mo8279c();
        mo8649m();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c4Var.mo8345g());
        contentValues.put("app_instance_id", c4Var.mo8348h());
        contentValues.put("gmp_app_id", c4Var.mo8351i());
        contentValues.put("resettable_device_id_hash", c4Var.mo8357l());
        contentValues.put("last_bundle_index", Long.valueOf(c4Var.mo8368w()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c4Var.mo8359n()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c4Var.mo8360o()));
        contentValues.put("app_version", c4Var.mo8361p());
        contentValues.put("app_store", c4Var.mo8363r());
        contentValues.put("gmp_version", Long.valueOf(c4Var.mo8364s()));
        contentValues.put("dev_cert_hash", Long.valueOf(c4Var.mo8365t()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c4Var.mo8367v()));
        c4Var.f7184a.mo8283g().mo8279c();
        contentValues.put("day", Long.valueOf(c4Var.f7207x));
        c4Var.f7184a.mo8283g().mo8279c();
        contentValues.put("daily_public_events_count", Long.valueOf(c4Var.f7208y));
        c4Var.f7184a.mo8283g().mo8279c();
        contentValues.put("daily_events_count", Long.valueOf(c4Var.f7209z));
        c4Var.f7184a.mo8283g().mo8279c();
        contentValues.put("daily_conversions_count", Long.valueOf(c4Var.f7177A));
        c4Var.f7184a.mo8283g().mo8279c();
        contentValues.put("config_fetched_time", Long.valueOf(c4Var.f7182F));
        c4Var.f7184a.mo8283g().mo8279c();
        contentValues.put("failed_config_fetch_time", Long.valueOf(c4Var.f7183G));
        contentValues.put("app_version_int", Long.valueOf(c4Var.mo8362q()));
        contentValues.put("firebase_instance_id", c4Var.mo8358m());
        c4Var.f7184a.mo8283g().mo8279c();
        contentValues.put("daily_error_events_count", Long.valueOf(c4Var.f7178B));
        c4Var.f7184a.mo8283g().mo8279c();
        contentValues.put("daily_realtime_events_count", Long.valueOf(c4Var.f7179C));
        c4Var.f7184a.mo8283g().mo8279c();
        contentValues.put("health_monitor_sample", c4Var.f7180D);
        contentValues.put("android_id", Long.valueOf(c4Var.mo8328b()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c4Var.mo8335c()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(c4Var.mo8338d()));
        contentValues.put("admob_app_id", c4Var.mo8354j());
        contentValues.put("dynamite_version", Long.valueOf(c4Var.mo8366u()));
        if (c4Var.mo8342f() != null) {
            if (c4Var.mo8342f().size() == 0) {
                mo8285i().f7156i.mo8433a("Safelisted events should not be an empty list. appId", c4Var.mo8345g());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", c4Var.mo8342f()));
            }
        }
        if (C2424ec.m5790b() && this.f7133a.f7338g.mo8578c(c4Var.mo8345g(), C3069p.f7741o0)) {
            contentValues.put("ga_app_id", c4Var.mo8356k());
        }
        try {
            SQLiteDatabase t = mo8425t();
            if (((long) t.update(str, contentValues, "app_id = ?", new String[]{c4Var.mo8345g()})) == 0 && t.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                mo8285i().f7153f.mo8433a("Failed to insert/update app (got -1). appId", C2908b4.m6745a(c4Var.mo8345g()));
            }
        } catch (SQLiteException e) {
            mo8285i().f7153f.mo8434a("Error storing app. appId", C2908b4.m6745a(c4Var.mo8345g()), e);
        }
    }

    /* renamed from: a */
    public final void mo8400a(List<Long> list) {
        mo8279c();
        mo8649m();
        C1061o.m2524b(list);
        if (list.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        } else if (mo8428w()) {
            String join = TextUtils.join(",", list);
            String a = C1965a.m4745a(C1965a.m4743a(join, 2), "(", join, ")");
            if (mo8411b(C1965a.m4745a(C1965a.m4743a(a, 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", a, " AND retry_count =  2147483647 LIMIT 1"), (String[]) null) > 0) {
                mo8285i().f7156i.mo8432a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase t = mo8425t();
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(a);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                t.execSQL(sb.toString());
            } catch (SQLiteException e) {
                mo8285i().f7153f.mo8433a("Error incrementing retry count. error", e);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo8407a(C2412e1 e1Var, boolean z) {
        Object obj;
        String str;
        C2944e4 e4Var;
        mo8279c();
        mo8649m();
        C1061o.m2524b(e1Var);
        C1061o.m2528b(e1Var.zzs);
        C1061o.m2533b((e1Var.zzc & 8) != 0);
        mo8431z();
        if (((C2284c) this.f7133a.f7345n) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (e1Var.zzj < currentTimeMillis - C3022ka.m7048u() || e1Var.zzj > C3022ka.m7048u() + currentTimeMillis) {
                mo8285i().f7156i.mo8435a("Storing bundle outside of the max uploading time span. appId, now, timestamp", C2908b4.m6745a(e1Var.zzs), Long.valueOf(currentTimeMillis), Long.valueOf(e1Var.zzj));
            }
            try {
                byte[] c = mo8651p().mo8747c(e1Var.mo8084f());
                mo8285i().f7161n.mo8433a("Saving bundle, size", Integer.valueOf(c.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", e1Var.zzs);
                contentValues.put("bundle_end_timestamp", Long.valueOf(e1Var.zzj));
                contentValues.put("data", c);
                contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
                if ((e1Var.zzd & 2) != 0) {
                    contentValues.put("retry_count", Integer.valueOf(e1Var.zzao));
                }
                try {
                    if (mo8425t().insert("queue", null, contentValues) != -1) {
                        return true;
                    }
                    mo8285i().f7153f.mo8433a("Failed to insert bundle (got -1). appId", C2908b4.m6745a(e1Var.zzs));
                    return false;
                } catch (SQLiteException e) {
                    e = e;
                    e4Var = mo8285i().f7153f;
                    obj = C2908b4.m6745a(e1Var.zzs);
                    str = "Error storing bundle. appId";
                    e4Var.mo8434a(str, obj, e);
                    return false;
                }
            } catch (IOException e2) {
                e = e2;
                e4Var = mo8285i().f7153f;
                obj = C2908b4.m6745a(e1Var.zzs);
                str = "Data loss. Failed to serialize bundle. appId";
                e4Var.mo8434a(str, obj, e);
                return false;
            }
        } else {
            throw null;
        }
    }

    /* renamed from: a */
    public final boolean mo8409a(C3011k kVar, long j, boolean z) {
        mo8279c();
        mo8649m();
        C1061o.m2524b(kVar);
        C1061o.m2528b(kVar.f7466a);
        byte[] f = mo8651p().mo8738a(kVar).mo8084f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", kVar.f7466a);
        contentValues.put("name", kVar.f7467b);
        contentValues.put("timestamp", Long.valueOf(kVar.f7469d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", f);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (mo8425t().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            mo8285i().f7153f.mo8433a("Failed to insert raw event (got -1). appId", C2908b4.m6745a(kVar.f7466a));
            return false;
        } catch (SQLiteException e) {
            mo8285i().f7153f.mo8434a("Error storing raw event. appId", C2908b4.m6745a(kVar.f7466a), e);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo8410a(C3134u9 u9Var) {
        C1061o.m2524b(u9Var);
        mo8279c();
        mo8649m();
        if (mo8416c(u9Var.f7907a, u9Var.f7909c) == null) {
            if (C3156w9.m7417h(u9Var.f7909c)) {
                long b = mo8411b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{u9Var.f7907a});
                C3022ka kaVar = this.f7133a.f7338g;
                String str = u9Var.f7907a;
                if (kaVar != null) {
                    int i = 25;
                    if (C2405da.m5643b() && kaVar.mo8578c(null, C3069p.f7687K0)) {
                        i = Math.max(Math.min(kaVar.mo8576b(str, C3069p.f7678G), 100), 25);
                    }
                    if (b >= ((long) i)) {
                        return false;
                    }
                } else {
                    throw null;
                }
            } else {
                if (!"_npa".equals(u9Var.f7909c)) {
                    if (mo8411b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{u9Var.f7907a, u9Var.f7908b}) >= 25) {
                        return false;
                    }
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", u9Var.f7907a);
        contentValues.put("origin", u9Var.f7908b);
        contentValues.put("name", u9Var.f7909c);
        contentValues.put("set_timestamp", Long.valueOf(u9Var.f7910d));
        m6836a(contentValues, "value", u9Var.f7911e);
        try {
            if (mo8425t().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                mo8285i().f7153f.mo8433a("Failed to insert/update user property (got -1). appId", C2908b4.m6745a(u9Var.f7907a));
            }
        } catch (SQLiteException e) {
            mo8285i().f7153f.mo8434a("Error storing user property. appId", C2908b4.m6745a(u9Var.f7907a), e);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo8408a(C2998ia iaVar) {
        C1061o.m2524b(iaVar);
        mo8279c();
        mo8649m();
        if (mo8416c(iaVar.f7418e, iaVar.f7420g.f7851f) == null) {
            if (mo8411b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{iaVar.f7418e}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", iaVar.f7418e);
        contentValues.put("origin", iaVar.f7419f);
        contentValues.put("name", iaVar.f7420g.f7851f);
        m6836a(contentValues, "value", iaVar.f7420g.mo8714a());
        contentValues.put("active", Boolean.valueOf(iaVar.f7422i));
        contentValues.put("trigger_event_name", iaVar.f7423j);
        contentValues.put("trigger_timeout", Long.valueOf(iaVar.f7425l));
        mo8287k();
        contentValues.put("timed_out_event", C3156w9.m7412a((Parcelable) iaVar.f7424k));
        contentValues.put("creation_timestamp", Long.valueOf(iaVar.f7421h));
        mo8287k();
        contentValues.put("triggered_event", C3156w9.m7412a((Parcelable) iaVar.f7426m));
        contentValues.put("triggered_timestamp", Long.valueOf(iaVar.f7420g.f7852g));
        contentValues.put("time_to_live", Long.valueOf(iaVar.f7427n));
        mo8287k();
        contentValues.put("expired_event", C3156w9.m7412a((Parcelable) iaVar.f7428o));
        try {
            if (mo8425t().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                mo8285i().f7153f.mo8433a("Failed to insert/update conditional user property (got -1)", C2908b4.m6745a(iaVar.f7418e));
            }
        } catch (SQLiteException e) {
            mo8285i().f7153f.mo8434a("Error storing conditional user property", C2908b4.m6745a(iaVar.f7418e), e);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo8403a(String str, int i, C2539l0 l0Var) {
        mo8649m();
        mo8279c();
        C1061o.m2528b(str);
        C1061o.m2524b(l0Var);
        Integer num = null;
        if (TextUtils.isEmpty(l0Var.zze)) {
            C2944e4 e4Var = mo8285i().f7156i;
            Object a = C2908b4.m6745a(str);
            Integer valueOf = Integer.valueOf(i);
            if (l0Var.mo7835a()) {
                num = Integer.valueOf(l0Var.zzd);
            }
            e4Var.mo8435a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", a, valueOf, String.valueOf(num));
            return false;
        }
        byte[] f = l0Var.mo8084f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", l0Var.mo7835a() ? Integer.valueOf(l0Var.zzd) : null);
        contentValues.put("event_name", l0Var.zze);
        contentValues.put("session_scoped", (l0Var.zzc & 64) != 0 ? Boolean.valueOf(l0Var.zzk) : null);
        contentValues.put("data", f);
        try {
            if (mo8425t().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                mo8285i().f7153f.mo8433a("Failed to insert event filter (got -1). appId", C2908b4.m6745a(str));
            }
            return true;
        } catch (SQLiteException e) {
            mo8285i().f7153f.mo8434a("Error storing event filter. appId", C2908b4.m6745a(str), e);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo8404a(String str, int i, C2591o0 o0Var) {
        mo8649m();
        mo8279c();
        C1061o.m2528b(str);
        C1061o.m2524b(o0Var);
        Integer num = null;
        if (TextUtils.isEmpty(o0Var.zze)) {
            C2944e4 e4Var = mo8285i().f7156i;
            Object a = C2908b4.m6745a(str);
            Integer valueOf = Integer.valueOf(i);
            if (o0Var.mo7904a()) {
                num = Integer.valueOf(o0Var.zzd);
            }
            e4Var.mo8435a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", a, valueOf, String.valueOf(num));
            return false;
        }
        byte[] f = o0Var.mo8084f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", o0Var.mo7904a() ? Integer.valueOf(o0Var.zzd) : null);
        contentValues.put("property_name", o0Var.zze);
        contentValues.put("session_scoped", (o0Var.zzc & 32) != 0 ? Boolean.valueOf(o0Var.zzi) : null);
        contentValues.put("data", f);
        try {
            if (mo8425t().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            mo8285i().f7153f.mo8433a("Failed to insert property filter (got -1). appId", C2908b4.m6745a(str));
            return false;
        } catch (SQLiteException e) {
            mo8285i().f7153f.mo8434a("Error storing property filter. appId", C2908b4.m6745a(str), e);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo8405a(String str, Long l, long j, C2340a1 a1Var) {
        mo8279c();
        mo8649m();
        C1061o.m2524b(a1Var);
        C1061o.m2528b(str);
        C1061o.m2524b(l);
        byte[] f = a1Var.mo8084f();
        mo8285i().f7161n.mo8434a("Saving complex main event, appId, data size", mo8281e().mo8834a(str), Integer.valueOf(f.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", f);
        try {
            if (mo8425t().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            mo8285i().f7153f.mo8433a("Failed to insert complex main event (got -1). appId", C2908b4.m6745a(str));
            return false;
        } catch (SQLiteException e) {
            mo8285i().f7153f.mo8434a("Error storing complex main event. appId", C2908b4.m6745a(str), e);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo8406a(String str, List<Integer> list) {
        C1061o.m2528b(str);
        mo8649m();
        mo8279c();
        SQLiteDatabase t = mo8425t();
        try {
            long b = mo8411b("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(RecyclerView.MAX_SCROLL_DURATION, this.f7133a.f7338g.mo8576b(str, C3069p.f7676F)));
            if (b <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = (Integer) list.get(i);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            String a = C1965a.m4745a(C1965a.m4743a(join, 2), "(", join, ")");
            return t.delete("audience_filter_values", C1965a.m4745a(C1965a.m4743a(a, 140), "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", a, " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            mo8285i().f7153f.mo8434a("Database error querying filters. appId", C2908b4.m6745a(str), e);
            return false;
        }
    }
}
