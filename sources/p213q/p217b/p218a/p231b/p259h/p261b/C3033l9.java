package p213q.p217b.p218a.p231b.p259h.p261b;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p246q.C2283b;
import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;
import p213q.p217b.p218a.p231b.p239d.p248r.C2294b;
import p213q.p217b.p218a.p231b.p251g.p256e.C2340a1;
import p213q.p217b.p218a.p231b.p251g.p256e.C2340a1.C2341a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2378c1;
import p213q.p217b.p218a.p231b.p251g.p256e.C2378c1.C2379a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2412e1;
import p213q.p217b.p218a.p231b.p251g.p256e.C2412e1.C2413a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2424ec;
import p213q.p217b.p218a.p231b.p251g.p256e.C2442fc;
import p213q.p217b.p218a.p231b.p251g.p256e.C2484i1;
import p213q.p217b.p218a.p231b.p251g.p256e.C2484i1.C2485a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2490i6;

/* renamed from: q.b.a.b.h.b.l9 */
public class C3033l9 implements C2910b6 {

    /* renamed from: x */
    public static volatile C3033l9 f7528x;

    /* renamed from: a */
    public C2897a5 f7529a;

    /* renamed from: b */
    public C2956f4 f7530b;

    /* renamed from: c */
    public C2939e f7531c;

    /* renamed from: d */
    public C3041m4 f7532d;

    /* renamed from: e */
    public C2997i9 f7533e;

    /* renamed from: f */
    public C2902aa f7534f;

    /* renamed from: g */
    public final C3123t9 f7535g;

    /* renamed from: h */
    public C3019k7 f7536h;

    /* renamed from: i */
    public final C2969g5 f7537i;

    /* renamed from: j */
    public boolean f7538j = false;

    /* renamed from: k */
    public boolean f7539k;

    /* renamed from: l */
    public long f7540l;

    /* renamed from: m */
    public List<Runnable> f7541m;

    /* renamed from: n */
    public int f7542n;

    /* renamed from: o */
    public int f7543o;

    /* renamed from: p */
    public boolean f7544p;

    /* renamed from: q */
    public boolean f7545q;

    /* renamed from: r */
    public boolean f7546r;

    /* renamed from: s */
    public FileLock f7547s;

    /* renamed from: t */
    public FileChannel f7548t;

    /* renamed from: u */
    public List<Long> f7549u;

    /* renamed from: v */
    public List<Long> f7550v;

    /* renamed from: w */
    public long f7551w;

    /* renamed from: q.b.a.b.h.b.l9$a */
    public class C3034a {

        /* renamed from: a */
        public C2412e1 f7552a;

        /* renamed from: b */
        public List<Long> f7553b;

        /* renamed from: c */
        public List<C2340a1> f7554c;

        /* renamed from: d */
        public long f7555d;

        public /* synthetic */ C3034a(C3033l9 l9Var, C3068o9 o9Var) {
        }

        /* renamed from: a */
        public final void mo8632a(C2412e1 e1Var) {
            C1061o.m2524b(e1Var);
            this.f7552a = e1Var;
        }

        /* renamed from: a */
        public final boolean mo8633a(long j, C2340a1 a1Var) {
            C1061o.m2524b(a1Var);
            if (this.f7554c == null) {
                this.f7554c = new ArrayList();
            }
            if (this.f7553b == null) {
                this.f7553b = new ArrayList();
            }
            if (this.f7554c.size() > 0 && ((((C2340a1) this.f7554c.get(0)).zzf / 1000) / 60) / 60 != ((a1Var.zzf / 1000) / 60) / 60) {
                return false;
            }
            long d = this.f7555d + ((long) a1Var.mo7765d());
            if (d >= ((long) Math.max(0, ((Integer) C3069p.f7728i.mo8702a(null)).intValue()))) {
                return false;
            }
            this.f7555d = d;
            this.f7554c.add(a1Var);
            this.f7553b.add(Long.valueOf(j));
            if (this.f7554c.size() >= Math.max(1, ((Integer) C3069p.f7730j.mo8702a(null)).intValue())) {
                return false;
            }
            return true;
        }
    }

    public C3033l9(C3101r9 r9Var) {
        C1061o.m2524b(r9Var);
        this.f7537i = C2969g5.m6914a(r9Var.f7832a, null, null);
        this.f7551w = -1;
        C3123t9 t9Var = new C3123t9(this);
        t9Var.mo8650n();
        this.f7535g = t9Var;
        C2956f4 f4Var = new C2956f4(this);
        f4Var.mo8650n();
        this.f7530b = f4Var;
        C2897a5 a5Var = new C2897a5(this);
        a5Var.mo8650n();
        this.f7529a = a5Var;
        C3184z4 g = this.f7537i.mo8283g();
        C3068o9 o9Var = new C3068o9(this, r9Var);
        g.mo8846n();
        C1061o.m2524b(o9Var);
        g.mo8843a(new C2945e5<>(g, o9Var, "Task exception on worker thread"));
    }

    /* renamed from: a */
    public static C3033l9 m7072a(Context context) {
        C1061o.m2524b(context);
        C1061o.m2524b(context.getApplicationContext());
        if (f7528x == null) {
            synchronized (C3033l9.class) {
                if (f7528x == null) {
                    f7528x = new C3033l9(new C3101r9(context));
                }
            }
        }
        return f7528x;
    }

    /* renamed from: a */
    public final C3189z9 mo8598a(String str) {
        String str2 = str;
        C2920c4 b = mo8619d().mo8413b(str2);
        if (b == null || TextUtils.isEmpty(b.mo8361p())) {
            this.f7537i.mo8285i().f7160m.mo8433a("No app data available; dropping", str2);
            return null;
        }
        Boolean b2 = mo8609b(b);
        if (b2 == null || b2.booleanValue()) {
            C3189z9 z9Var = new C3189z9(str, b.mo8351i(), b.mo8361p(), b.mo8362q(), b.mo8363r(), b.mo8364s(), b.mo8365t(), (String) null, b.mo8367v(), false, b.mo8358m(), b.mo8328b(), 0, 0, b.mo8335c(), b.mo8338d(), false, b.mo8354j(), b.mo8339e(), b.mo8366u(), b.mo8342f(), (!C2424ec.m5790b() || !this.f7537i.f7338g.mo8578c(str2, C3069p.f7741o0)) ? null : b.mo8356k());
            return z9Var;
        }
        this.f7537i.mo8285i().f7153f.mo8433a("App version does not match; dropping. appId", C2908b4.m6745a(str));
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0258, code lost:
        r29 = r2;
        r28 = r5;
        r27 = r6;
        r44 = r8;
        r8 = r0;
        r2 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0265, code lost:
        r3 = r1;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0288, code lost:
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        r29 = r2;
        r28 = r5;
        r27 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0242, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0243, code lost:
        r29 = r2;
        r28 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0248, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0249, code lost:
        r29 = r2;
        r28 = r5;
        r27 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0252, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0253, code lost:
        r2 = r0;
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0257, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0290 A[Catch:{ all -> 0x0f8b }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x029e A[Catch:{ all -> 0x0f8b }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c A[ExcHandler: all (r0v7 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:4:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03de A[Catch:{ all -> 0x0f8b }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03e9 A[Catch:{ all -> 0x0f8b }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03ea A[Catch:{ all -> 0x0f8b }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x05bc A[Catch:{ all -> 0x0f8b }] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0693 A[Catch:{ all -> 0x0f8b }] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0859 A[Catch:{ all -> 0x0f8b }] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x087a A[Catch:{ all -> 0x0f8b }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0891 A[Catch:{ all -> 0x0f8b }] */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x0bba A[Catch:{ all -> 0x0f8b }] */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x0bcd A[Catch:{ all -> 0x0f8b }] */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x0bd0 A[Catch:{ all -> 0x0f8b }] */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0bf6 A[SYNTHETIC, Splitter:B:440:0x0bf6] */
    /* JADX WARNING: Removed duplicated region for block: B:555:0x0f6e  */
    /* JADX WARNING: Removed duplicated region for block: B:563:0x0f85 A[SYNTHETIC, Splitter:B:563:0x0f85] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0123 A[Catch:{ SQLiteException -> 0x0242, all -> 0x0252 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013a A[Catch:{ SQLiteException -> 0x0242, all -> 0x0252 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0252 A[ExcHandler: all (r0v9 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r8 
      PHI: (r8v69 android.database.Cursor) = (r8v73 android.database.Cursor), (r8v73 android.database.Cursor), (r8v73 android.database.Cursor), (r8v75 android.database.Cursor), (r8v75 android.database.Cursor), (r8v77 android.database.Cursor), (r8v77 android.database.Cursor), (r8v75 android.database.Cursor), (r8v83 android.database.Cursor), (r8v87 android.database.Cursor), (r8v87 android.database.Cursor), (r8v87 android.database.Cursor) binds: [B:51:0x00fc, B:52:?, B:54:0x0105, B:59:0x013f, B:61:0x0151, B:77:0x01e3, B:80:0x01ee, B:66:0x0165, B:44:0x00e1, B:26:0x008e, B:32:0x009b, B:33:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:26:0x008e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8607a(long r46) {
        /*
            r45 = this;
            r1 = r45
            java.lang.String r2 = "_si"
            java.lang.String r3 = "_sc"
            java.lang.String r4 = "_sn"
            java.lang.String r5 = "_npa"
            java.lang.String r6 = ""
            q.b.a.b.h.b.e r7 = r45.mo8619d()
            r7.mo8429x()
            q.b.a.b.h.b.l9$a r7 = new q.b.a.b.h.b.l9$a     // Catch:{ all -> 0x0f8b }
            r8 = 0
            r7.<init>(r1, r8)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.e r9 = r45.mo8619d()     // Catch:{ all -> 0x0f8b }
            long r10 = r1.f7551w     // Catch:{ all -> 0x0f8b }
            p124p.p126b.p127k.C1061o.m2524b(r7)     // Catch:{ all -> 0x0f8b }
            r9.mo8279c()     // Catch:{ all -> 0x0f8b }
            r9.mo8649m()     // Catch:{ all -> 0x0f8b }
            r13 = -1
            r15 = 2
            android.database.sqlite.SQLiteDatabase r12 = r9.mo8425t()     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            boolean r18 = android.text.TextUtils.isEmpty(r8)     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            if (r18 == 0) goto L_0x00a3
            int r18 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r18 == 0) goto L_0x0053
            java.lang.String[] r8 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0050, all -> 0x004c }
            java.lang.String r19 = java.lang.String.valueOf(r10)     // Catch:{ SQLiteException -> 0x0050, all -> 0x004c }
            r17 = 0
            r8[r17] = r19     // Catch:{ SQLiteException -> 0x0050, all -> 0x004c }
            java.lang.String r19 = java.lang.String.valueOf(r46)     // Catch:{ SQLiteException -> 0x0050, all -> 0x004c }
            r20 = 1
            r8[r20] = r19     // Catch:{ SQLiteException -> 0x0050, all -> 0x004c }
            goto L_0x005f
        L_0x004c:
            r0 = move-exception
            r2 = r0
            goto L_0x0265
        L_0x0050:
            r0 = move-exception
            r8 = r0
            goto L_0x0064
        L_0x0053:
            r8 = 1
            java.lang.String[] r15 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            java.lang.String r8 = java.lang.String.valueOf(r46)     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            r17 = 0
            r15[r17] = r8     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            r8 = r15
        L_0x005f:
            if (r18 == 0) goto L_0x006d
            java.lang.String r15 = "rowid <= ? and "
            goto L_0x006e
        L_0x0064:
            r29 = r2
            r28 = r5
            r27 = r6
        L_0x006a:
            r2 = 0
            goto L_0x0274
        L_0x006d:
            r15 = r6
        L_0x006e:
            int r13 = r15.length()     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            int r13 = r13 + 148
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            r14.<init>(r13)     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            java.lang.String r13 = "select app_id, metadata_fingerprint from raw_events where "
            r14.append(r13)     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            r14.append(r15)     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            java.lang.String r13 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r14.append(r13)     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            java.lang.String r13 = r14.toString()     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            android.database.Cursor r8 = r12.rawQuery(r13, r8)     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            boolean r13 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x0257, all -> 0x0252 }
            if (r13 != 0) goto L_0x0095
            goto L_0x00e7
        L_0x0095:
            r13 = 0
            java.lang.String r14 = r8.getString(r13)     // Catch:{ SQLiteException -> 0x0257, all -> 0x0252 }
            r13 = 1
            java.lang.String r15 = r8.getString(r13)     // Catch:{ SQLiteException -> 0x0248, all -> 0x0252 }
            r8.close()     // Catch:{ SQLiteException -> 0x0248, all -> 0x0252 }
            goto L_0x00f8
        L_0x00a3:
            int r8 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r8 == 0) goto L_0x00b6
            r13 = 2
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            r13 = 0
            r15 = 0
            r14[r15] = r13     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            java.lang.String r13 = java.lang.String.valueOf(r10)     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            r15 = 1
            r14[r15] = r13     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            goto L_0x00bb
        L_0x00b6:
            r13 = 0
            java.lang.String[] r14 = new java.lang.String[]{r13}     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
        L_0x00bb:
            if (r8 == 0) goto L_0x00c0
            java.lang.String r8 = " and rowid <= ?"
            goto L_0x00c1
        L_0x00c0:
            r8 = r6
        L_0x00c1:
            int r13 = r8.length()     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            int r13 = r13 + 84
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            r15.<init>(r13)     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            java.lang.String r13 = "select metadata_fingerprint from raw_events where app_id = ?"
            r15.append(r13)     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            r15.append(r8)     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            java.lang.String r8 = " order by rowid limit 1;"
            r15.append(r8)     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            java.lang.String r8 = r15.toString()     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            android.database.Cursor r8 = r12.rawQuery(r8, r14)     // Catch:{ SQLiteException -> 0x0269, all -> 0x004c }
            boolean r13 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x0257, all -> 0x0252 }
            if (r13 != 0) goto L_0x00ef
        L_0x00e7:
            r29 = r2
            r28 = r5
            r27 = r6
            goto L_0x0289
        L_0x00ef:
            r13 = 0
            java.lang.String r15 = r8.getString(r13)     // Catch:{ SQLiteException -> 0x0257, all -> 0x0252 }
            r8.close()     // Catch:{ SQLiteException -> 0x0257, all -> 0x0252 }
            r14 = 0
        L_0x00f8:
            java.lang.String r19 = "raw_events_metadata"
            java.lang.String r13 = "metadata"
            java.lang.String[] r20 = new java.lang.String[]{r13}     // Catch:{ SQLiteException -> 0x0248, all -> 0x0252 }
            java.lang.String r21 = "app_id = ? and metadata_fingerprint = ?"
            r27 = r6
            r13 = 2
            java.lang.String[] r6 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0242, all -> 0x0252 }
            r13 = 0
            r6[r13] = r14     // Catch:{ SQLiteException -> 0x0242, all -> 0x0252 }
            r13 = 1
            r6[r13] = r15     // Catch:{ SQLiteException -> 0x0242, all -> 0x0252 }
            r23 = 0
            r24 = 0
            java.lang.String r25 = "rowid"
            java.lang.String r26 = "2"
            r18 = r12
            r22 = r6
            android.database.Cursor r8 = r18.query(r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ SQLiteException -> 0x0242, all -> 0x0252 }
            boolean r6 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x0242, all -> 0x0252 }
            if (r6 != 0) goto L_0x013a
            q.b.a.b.h.b.b4 r6 = r9.mo8285i()     // Catch:{ SQLiteException -> 0x0242, all -> 0x0252 }
            q.b.a.b.h.b.e4 r6 = r6.mo8308t()     // Catch:{ SQLiteException -> 0x0242, all -> 0x0252 }
            java.lang.String r10 = "Raw event metadata record is missing. appId"
            java.lang.Object r11 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r14)     // Catch:{ SQLiteException -> 0x0242, all -> 0x0252 }
            r6.mo8433a(r10, r11)     // Catch:{ SQLiteException -> 0x0242, all -> 0x0252 }
            r29 = r2
            r28 = r5
            goto L_0x0289
        L_0x013a:
            r6 = 0
            byte[] r13 = r8.getBlob(r6)     // Catch:{ SQLiteException -> 0x0242, all -> 0x0252 }
            q.b.a.b.g.e.e1$a r6 = p213q.p217b.p218a.p231b.p251g.p256e.C2412e1.m5677o()     // Catch:{ IOException -> 0x0228 }
            q.b.a.b.g.e.s7 r6 = p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.m7336a(r6, r13)     // Catch:{ IOException -> 0x0228 }
            q.b.a.b.g.e.e1$a r6 = (p213q.p217b.p218a.p231b.p251g.p256e.C2412e1.C2413a) r6     // Catch:{ IOException -> 0x0228 }
            q.b.a.b.g.e.p7 r6 = r6.mo7778m()     // Catch:{ IOException -> 0x0228 }
            q.b.a.b.g.e.i6 r6 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r6     // Catch:{ IOException -> 0x0228 }
            q.b.a.b.g.e.e1 r6 = (p213q.p217b.p218a.p231b.p251g.p256e.C2412e1) r6     // Catch:{ IOException -> 0x0228 }
            boolean r13 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x0242, all -> 0x0252 }
            if (r13 == 0) goto L_0x0172
            q.b.a.b.h.b.b4 r13 = r9.mo8285i()     // Catch:{ SQLiteException -> 0x0242, all -> 0x0252 }
            q.b.a.b.h.b.e4 r13 = r13.mo8309u()     // Catch:{ SQLiteException -> 0x0242, all -> 0x0252 }
            r28 = r5
            java.lang.String r5 = "Get multiple raw event metadata records, expected one. appId"
            r29 = r2
            java.lang.Object r2 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r14)     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            r13.mo8433a(r5, r2)     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            goto L_0x0176
        L_0x016d:
            r0 = move-exception
            r29 = r2
            goto L_0x024f
        L_0x0172:
            r29 = r2
            r28 = r5
        L_0x0176:
            r8.close()     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            r7.mo8632a(r6)     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            r5 = -1
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0195
            java.lang.String r2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r5 = 3
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            r5 = 0
            r6[r5] = r14     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            r5 = 1
            r6[r5] = r15     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            r10 = 2
            r6[r10] = r5     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            goto L_0x01a0
        L_0x0195:
            java.lang.String r2 = "app_id = ? and metadata_fingerprint = ?"
            r5 = 2
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            r5 = 0
            r6[r5] = r14     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            r5 = 1
            r6[r5] = r15     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
        L_0x01a0:
            r21 = r2
            r22 = r6
            java.lang.String r19 = "raw_events"
            java.lang.String r2 = "rowid"
            java.lang.String r5 = "name"
            java.lang.String r6 = "timestamp"
            java.lang.String r10 = "data"
            java.lang.String[] r20 = new java.lang.String[]{r2, r5, r6, r10}     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            r23 = 0
            r24 = 0
            java.lang.String r25 = "rowid"
            r26 = 0
            r18 = r12
            android.database.Cursor r8 = r18.query(r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            boolean r2 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            if (r2 != 0) goto L_0x01d9
            q.b.a.b.h.b.b4 r2 = r9.mo8285i()     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            q.b.a.b.h.b.e4 r2 = r2.mo8309u()     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            java.lang.String r5 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r6 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r14)     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            r2.mo8433a(r5, r6)     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            goto L_0x0289
        L_0x01d9:
            r2 = 0
            long r5 = r8.getLong(r2)     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            r2 = 3
            byte[] r10 = r8.getBlob(r2)     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            q.b.a.b.g.e.a1$a r2 = p213q.p217b.p218a.p231b.p251g.p256e.C2340a1.m5426n()     // Catch:{ IOException -> 0x020d }
            q.b.a.b.g.e.s7 r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.m7336a(r2, r10)     // Catch:{ IOException -> 0x020d }
            q.b.a.b.g.e.a1$a r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1.C2341a) r2     // Catch:{ IOException -> 0x020d }
            r10 = 1
            java.lang.String r11 = r8.getString(r10)     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            r2.mo7358a(r11)     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            r10 = 2
            long r11 = r8.getLong(r10)     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            r2.mo7357a(r11)     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            q.b.a.b.g.e.p7 r2 = r2.mo7778m()     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            q.b.a.b.g.e.i6 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r2     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            q.b.a.b.g.e.a1 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r2     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            boolean r2 = r7.mo8633a(r5, r2)     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            if (r2 != 0) goto L_0x0220
            goto L_0x0289
        L_0x020d:
            r0 = move-exception
            r2 = r0
            q.b.a.b.h.b.b4 r5 = r9.mo8285i()     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            q.b.a.b.h.b.e4 r5 = r5.mo8308t()     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            java.lang.String r6 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r10 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r14)     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            r5.mo8434a(r6, r10, r2)     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
        L_0x0220:
            boolean r2 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            if (r2 != 0) goto L_0x01d9
            goto L_0x0289
        L_0x0228:
            r0 = move-exception
            r29 = r2
            r28 = r5
            r2 = r0
            q.b.a.b.h.b.b4 r5 = r9.mo8285i()     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            q.b.a.b.h.b.e4 r5 = r5.mo8308t()     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            java.lang.String r6 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r10 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r14)     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            r5.mo8434a(r6, r10, r2)     // Catch:{ SQLiteException -> 0x0240, all -> 0x0252 }
            goto L_0x0289
        L_0x0240:
            r0 = move-exception
            goto L_0x024f
        L_0x0242:
            r0 = move-exception
            r29 = r2
            r28 = r5
            goto L_0x024f
        L_0x0248:
            r0 = move-exception
            r29 = r2
            r28 = r5
            r27 = r6
        L_0x024f:
            r2 = r8
            r8 = r0
            goto L_0x0275
        L_0x0252:
            r0 = move-exception
            r2 = r0
            r3 = r1
            goto L_0x0f83
        L_0x0257:
            r0 = move-exception
            r29 = r2
            r28 = r5
            r27 = r6
            r2 = r0
            r44 = r8
            r8 = r2
            r2 = r44
            goto L_0x0274
        L_0x0265:
            r3 = r1
            r8 = 0
            goto L_0x0f83
        L_0x0269:
            r0 = move-exception
            r29 = r2
            r28 = r5
            r27 = r6
            r2 = r0
            r8 = r2
            goto L_0x006a
        L_0x0274:
            r14 = 0
        L_0x0275:
            q.b.a.b.h.b.b4 r5 = r9.mo8285i()     // Catch:{ all -> 0x0f7f }
            q.b.a.b.h.b.e4 r5 = r5.mo8308t()     // Catch:{ all -> 0x0f7f }
            java.lang.String r6 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r9 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r14)     // Catch:{ all -> 0x0f7f }
            r5.mo8434a(r6, r9, r8)     // Catch:{ all -> 0x0f7f }
            if (r2 == 0) goto L_0x028c
            r8 = r2
        L_0x0289:
            r8.close()     // Catch:{ all -> 0x0f8b }
        L_0x028c:
            java.util.List<q.b.a.b.g.e.a1> r2 = r7.f7554c     // Catch:{ all -> 0x0f8b }
            if (r2 == 0) goto L_0x029b
            java.util.List<q.b.a.b.g.e.a1> r2 = r7.f7554c     // Catch:{ all -> 0x0f8b }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0f8b }
            if (r2 == 0) goto L_0x0299
            goto L_0x029b
        L_0x0299:
            r2 = 0
            goto L_0x029c
        L_0x029b:
            r2 = 1
        L_0x029c:
            if (r2 != 0) goto L_0x0f6e
            q.b.a.b.g.e.e1 r2 = r7.f7552a     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6$a r2 = r2.mo7769h()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.e1$a r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2412e1.C2413a) r2     // Catch:{ all -> 0x0f8b }
            r2.mo7599o()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.g5 r5 = r1.f7537i     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.ka r5 = r5.mo8469l()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.e1 r6 = r7.f7552a     // Catch:{ all -> 0x0f8b }
            java.lang.String r6 = r6.mo7552n()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.r3<java.lang.Boolean> r8 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7707V     // Catch:{ all -> 0x0f8b }
            boolean r5 = r5.mo8580d(r6, r8)     // Catch:{ all -> 0x0f8b }
            r8 = -1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = -1
            r18 = 0
        L_0x02c4:
            java.util.List<q.b.a.b.g.e.a1> r9 = r7.f7554c     // Catch:{ all -> 0x0f8b }
            int r9 = r9.size()     // Catch:{ all -> 0x0f8b }
            java.lang.String r6 = "_fr"
            r21 = r10
            java.lang.String r10 = "_et"
            r22 = r11
            java.lang.String r11 = "_e"
            r23 = r3
            r24 = r4
            if (r12 >= r9) goto L_0x08e8
            java.util.List<q.b.a.b.g.e.a1> r9 = r7.f7554c     // Catch:{ all -> 0x0f8b }
            java.lang.Object r9 = r9.get(r12)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.a1 r9 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r9     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6$a r9 = r9.mo7769h()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.a1$a r9 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1.C2341a) r9     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.a5 r3 = r45.mo8610b()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.e1 r4 = r7.f7552a     // Catch:{ all -> 0x0f8b }
            java.lang.String r4 = r4.mo7552n()     // Catch:{ all -> 0x0f8b }
            r30 = r12
            java.lang.String r12 = r9.mo7364o()     // Catch:{ all -> 0x0f8b }
            boolean r3 = r3.mo8269b(r4, r12)     // Catch:{ all -> 0x0f8b }
            java.lang.String r4 = "_err"
            if (r3 == 0) goto L_0x0383
            q.b.a.b.h.b.g5 r3 = r1.f7537i     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.b4 r3 = r3.mo8285i()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.e4 r3 = r3.mo8309u()     // Catch:{ all -> 0x0f8b }
            java.lang.String r6 = "Dropping blacklisted raw event. appId"
            q.b.a.b.g.e.e1 r10 = r7.f7552a     // Catch:{ all -> 0x0f8b }
            java.lang.String r10 = r10.mo7552n()     // Catch:{ all -> 0x0f8b }
            java.lang.Object r10 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r10)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.g5 r11 = r1.f7537i     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.z3 r11 = r11.mo8474q()     // Catch:{ all -> 0x0f8b }
            java.lang.String r12 = r9.mo7364o()     // Catch:{ all -> 0x0f8b }
            java.lang.String r11 = r11.mo8834a(r12)     // Catch:{ all -> 0x0f8b }
            r3.mo8434a(r6, r10, r11)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.a5 r3 = r45.mo8610b()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.e1 r6 = r7.f7552a     // Catch:{ all -> 0x0f8b }
            java.lang.String r6 = r6.mo7552n()     // Catch:{ all -> 0x0f8b }
            boolean r3 = r3.mo8273d(r6)     // Catch:{ all -> 0x0f8b }
            if (r3 != 0) goto L_0x034a
            q.b.a.b.h.b.a5 r3 = r45.mo8610b()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.e1 r6 = r7.f7552a     // Catch:{ all -> 0x0f8b }
            java.lang.String r6 = r6.mo7552n()     // Catch:{ all -> 0x0f8b }
            boolean r3 = r3.mo8274e(r6)     // Catch:{ all -> 0x0f8b }
            if (r3 == 0) goto L_0x0348
            goto L_0x034a
        L_0x0348:
            r3 = 0
            goto L_0x034b
        L_0x034a:
            r3 = 1
        L_0x034b:
            if (r3 != 0) goto L_0x036e
            java.lang.String r3 = r9.mo7364o()     // Catch:{ all -> 0x0f8b }
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x0f8b }
            if (r3 != 0) goto L_0x036e
            q.b.a.b.h.b.g5 r3 = r1.f7537i     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.w9 r3 = r3.mo8473p()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.e1 r4 = r7.f7552a     // Catch:{ all -> 0x0f8b }
            r4.mo7552n()     // Catch:{ all -> 0x0f8b }
            r4 = 11
            java.lang.String r6 = "_ev"
            java.lang.String r9 = r9.mo7364o()     // Catch:{ all -> 0x0f8b }
            r10 = 0
            r3.mo8783a(r4, r6, r9, r10)     // Catch:{ all -> 0x0f8b }
        L_0x036e:
            r31 = r5
            r36 = r8
            r16 = r14
            r10 = r21
            r11 = r22
            r3 = r23
            r14 = r24
            r6 = r29
            r5 = r30
            r8 = r2
            goto L_0x08da
        L_0x0383:
            q.b.a.b.h.b.a5 r3 = r45.mo8610b()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.e1 r12 = r7.f7552a     // Catch:{ all -> 0x0f8b }
            java.lang.String r12 = r12.mo7552n()     // Catch:{ all -> 0x0f8b }
            r31 = r5
            java.lang.String r5 = r9.mo7364o()     // Catch:{ all -> 0x0f8b }
            boolean r3 = r3.mo8271c(r12, r5)     // Catch:{ all -> 0x0f8b }
            java.lang.String r5 = "_c"
            if (r3 != 0) goto L_0x03f3
            r45.mo8621k()     // Catch:{ all -> 0x0f8b }
            java.lang.String r12 = r9.mo7364o()     // Catch:{ all -> 0x0f8b }
            p124p.p126b.p127k.C1061o.m2528b(r12)     // Catch:{ all -> 0x0f8b }
            r32 = r15
            int r15 = r12.hashCode()     // Catch:{ all -> 0x0f8b }
            r33 = r13
            r13 = 94660(0x171c4, float:1.32647E-40)
            if (r15 == r13) goto L_0x03d1
            r13 = 95025(0x17331, float:1.33158E-40)
            if (r15 == r13) goto L_0x03c7
            r13 = 95027(0x17333, float:1.33161E-40)
            if (r15 == r13) goto L_0x03bd
            goto L_0x03db
        L_0x03bd:
            java.lang.String r13 = "_ui"
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x0f8b }
            if (r12 == 0) goto L_0x03db
            r12 = 1
            goto L_0x03dc
        L_0x03c7:
            java.lang.String r13 = "_ug"
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x0f8b }
            if (r12 == 0) goto L_0x03db
            r12 = 2
            goto L_0x03dc
        L_0x03d1:
            java.lang.String r13 = "_in"
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x0f8b }
            if (r12 == 0) goto L_0x03db
            r12 = 0
            goto L_0x03dc
        L_0x03db:
            r12 = -1
        L_0x03dc:
            if (r12 == 0) goto L_0x03e6
            r13 = 1
            if (r12 == r13) goto L_0x03e6
            r13 = 2
            if (r12 == r13) goto L_0x03e6
            r12 = 0
            goto L_0x03e7
        L_0x03e6:
            r12 = 1
        L_0x03e7:
            if (r12 == 0) goto L_0x03ea
            goto L_0x03f7
        L_0x03ea:
            r35 = r2
            r36 = r8
            r34 = r10
            r10 = r14
            goto L_0x05ba
        L_0x03f3:
            r33 = r13
            r32 = r15
        L_0x03f7:
            r34 = r10
            r12 = 0
            r13 = 0
            r15 = 0
        L_0x03fc:
            int r10 = r9.mo7363n()     // Catch:{ all -> 0x0f8b }
            r35 = r2
            java.lang.String r2 = "_r"
            if (r12 >= r10) goto L_0x0461
            q.b.a.b.g.e.c1 r10 = r9.mo7360a(r12)     // Catch:{ all -> 0x0f8b }
            java.lang.String r10 = r10.mo7471k()     // Catch:{ all -> 0x0f8b }
            boolean r10 = r5.equals(r10)     // Catch:{ all -> 0x0f8b }
            if (r10 == 0) goto L_0x0431
            q.b.a.b.g.e.c1 r2 = r9.mo7360a(r12)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6$a r2 = r2.mo7769h()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.c1$a r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2378c1.C2379a) r2     // Catch:{ all -> 0x0f8b }
            r10 = r14
            r13 = 1
            r2.mo7480a(r13)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.p7 r2 = r2.mo7778m()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r2     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.c1 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2378c1) r2     // Catch:{ all -> 0x0f8b }
            r9.mo7356a(r12, r2)     // Catch:{ all -> 0x0f8b }
            r13 = 1
            goto L_0x045b
        L_0x0431:
            r10 = r14
            q.b.a.b.g.e.c1 r14 = r9.mo7360a(r12)     // Catch:{ all -> 0x0f8b }
            java.lang.String r14 = r14.mo7471k()     // Catch:{ all -> 0x0f8b }
            boolean r2 = r2.equals(r14)     // Catch:{ all -> 0x0f8b }
            if (r2 == 0) goto L_0x045b
            q.b.a.b.g.e.c1 r2 = r9.mo7360a(r12)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6$a r2 = r2.mo7769h()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.c1$a r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2378c1.C2379a) r2     // Catch:{ all -> 0x0f8b }
            r14 = 1
            r2.mo7480a(r14)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.p7 r2 = r2.mo7778m()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r2     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.c1 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2378c1) r2     // Catch:{ all -> 0x0f8b }
            r9.mo7356a(r12, r2)     // Catch:{ all -> 0x0f8b }
            r15 = 1
        L_0x045b:
            int r12 = r12 + 1
            r14 = r10
            r2 = r35
            goto L_0x03fc
        L_0x0461:
            r10 = r14
            if (r13 != 0) goto L_0x0495
            if (r3 == 0) goto L_0x0495
            q.b.a.b.h.b.g5 r12 = r1.f7537i     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.b4 r12 = r12.mo8285i()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.e4 r12 = r12.mo8312x()     // Catch:{ all -> 0x0f8b }
            java.lang.String r13 = "Marking event as conversion"
            q.b.a.b.h.b.g5 r14 = r1.f7537i     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.z3 r14 = r14.mo8474q()     // Catch:{ all -> 0x0f8b }
            r36 = r8
            java.lang.String r8 = r9.mo7364o()     // Catch:{ all -> 0x0f8b }
            java.lang.String r8 = r14.mo8834a(r8)     // Catch:{ all -> 0x0f8b }
            r12.mo8433a(r13, r8)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.c1$a r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2378c1.m5579s()     // Catch:{ all -> 0x0f8b }
            r8.mo7482a(r5)     // Catch:{ all -> 0x0f8b }
            r12 = 1
            r8.mo7480a(r12)     // Catch:{ all -> 0x0f8b }
            r9.mo7359a(r8)     // Catch:{ all -> 0x0f8b }
            goto L_0x0497
        L_0x0495:
            r36 = r8
        L_0x0497:
            if (r15 != 0) goto L_0x04c5
            q.b.a.b.h.b.g5 r8 = r1.f7537i     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.b4 r8 = r8.mo8285i()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.e4 r8 = r8.mo8312x()     // Catch:{ all -> 0x0f8b }
            java.lang.String r12 = "Marking event as real-time"
            q.b.a.b.h.b.g5 r13 = r1.f7537i     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.z3 r13 = r13.mo8474q()     // Catch:{ all -> 0x0f8b }
            java.lang.String r14 = r9.mo7364o()     // Catch:{ all -> 0x0f8b }
            java.lang.String r13 = r13.mo8834a(r14)     // Catch:{ all -> 0x0f8b }
            r8.mo8433a(r12, r13)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.c1$a r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2378c1.m5579s()     // Catch:{ all -> 0x0f8b }
            r8.mo7482a(r2)     // Catch:{ all -> 0x0f8b }
            r12 = 1
            r8.mo7480a(r12)     // Catch:{ all -> 0x0f8b }
            r9.mo7359a(r8)     // Catch:{ all -> 0x0f8b }
        L_0x04c5:
            q.b.a.b.h.b.e r37 = r45.mo8619d()     // Catch:{ all -> 0x0f8b }
            long r38 = r45.mo8629s()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.e1 r8 = r7.f7552a     // Catch:{ all -> 0x0f8b }
            java.lang.String r40 = r8.mo7552n()     // Catch:{ all -> 0x0f8b }
            r41 = 0
            r42 = 1
            q.b.a.b.h.b.d r8 = r37.mo8398a(r38, r40, r41, r42)     // Catch:{ all -> 0x0f8b }
            long r12 = r8.f7235e     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.g5 r8 = r1.f7537i     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.ka r8 = r8.mo8469l()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.e1 r14 = r7.f7552a     // Catch:{ all -> 0x0f8b }
            java.lang.String r14 = r14.mo7552n()     // Catch:{ all -> 0x0f8b }
            int r8 = r8.mo8577c(r14)     // Catch:{ all -> 0x0f8b }
            long r14 = (long) r8     // Catch:{ all -> 0x0f8b }
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 <= 0) goto L_0x04f6
            m7074a(r9, r2)     // Catch:{ all -> 0x0f8b }
            goto L_0x04f8
        L_0x04f6:
            r21 = 1
        L_0x04f8:
            java.lang.String r2 = r9.mo7364o()     // Catch:{ all -> 0x0f8b }
            boolean r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.m7417h(r2)     // Catch:{ all -> 0x0f8b }
            if (r2 == 0) goto L_0x05ba
            if (r3 == 0) goto L_0x05ba
            q.b.a.b.h.b.e r37 = r45.mo8619d()     // Catch:{ all -> 0x0f8b }
            long r38 = r45.mo8629s()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.e1 r2 = r7.f7552a     // Catch:{ all -> 0x0f8b }
            java.lang.String r40 = r2.mo7552n()     // Catch:{ all -> 0x0f8b }
            r41 = 1
            r42 = 0
            q.b.a.b.h.b.d r2 = r37.mo8398a(r38, r40, r41, r42)     // Catch:{ all -> 0x0f8b }
            long r12 = r2.f7233c     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.g5 r2 = r1.f7537i     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.ka r2 = r2.mo8469l()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.e1 r8 = r7.f7552a     // Catch:{ all -> 0x0f8b }
            java.lang.String r8 = r8.mo7552n()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.r3<java.lang.Integer> r14 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7738n     // Catch:{ all -> 0x0f8b }
            int r2 = r2.mo8576b(r8, r14)     // Catch:{ all -> 0x0f8b }
            long r14 = (long) r2     // Catch:{ all -> 0x0f8b }
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 <= 0) goto L_0x05ba
            q.b.a.b.h.b.g5 r2 = r1.f7537i     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.b4 r2 = r2.mo8285i()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.e4 r2 = r2.mo8309u()     // Catch:{ all -> 0x0f8b }
            java.lang.String r8 = "Too many conversions. Not logging as conversion. appId"
            q.b.a.b.g.e.e1 r12 = r7.f7552a     // Catch:{ all -> 0x0f8b }
            java.lang.String r12 = r12.mo7552n()     // Catch:{ all -> 0x0f8b }
            java.lang.Object r12 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r12)     // Catch:{ all -> 0x0f8b }
            r2.mo8433a(r8, r12)     // Catch:{ all -> 0x0f8b }
            r2 = 0
            r8 = 0
            r12 = -1
            r13 = 0
        L_0x0550:
            int r14 = r9.mo7363n()     // Catch:{ all -> 0x0f8b }
            if (r2 >= r14) goto L_0x057b
            q.b.a.b.g.e.c1 r14 = r9.mo7360a(r2)     // Catch:{ all -> 0x0f8b }
            java.lang.String r15 = r14.mo7471k()     // Catch:{ all -> 0x0f8b }
            boolean r15 = r5.equals(r15)     // Catch:{ all -> 0x0f8b }
            if (r15 == 0) goto L_0x056d
            q.b.a.b.g.e.i6$a r12 = r14.mo7769h()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.c1$a r12 = (p213q.p217b.p218a.p231b.p251g.p256e.C2378c1.C2379a) r12     // Catch:{ all -> 0x0f8b }
            r13 = r12
            r12 = r2
            goto L_0x0578
        L_0x056d:
            java.lang.String r14 = r14.mo7471k()     // Catch:{ all -> 0x0f8b }
            boolean r14 = r4.equals(r14)     // Catch:{ all -> 0x0f8b }
            if (r14 == 0) goto L_0x0578
            r8 = 1
        L_0x0578:
            int r2 = r2 + 1
            goto L_0x0550
        L_0x057b:
            if (r8 == 0) goto L_0x0583
            if (r13 == 0) goto L_0x0583
            r9.mo7361b(r12)     // Catch:{ all -> 0x0f8b }
            goto L_0x05ba
        L_0x0583:
            if (r13 == 0) goto L_0x05a1
            java.lang.Object r2 = r13.clone()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6$a r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a) r2     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.c1$a r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2378c1.C2379a) r2     // Catch:{ all -> 0x0f8b }
            r2.mo7482a(r4)     // Catch:{ all -> 0x0f8b }
            r13 = 10
            r2.mo7480a(r13)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.p7 r2 = r2.mo7778m()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r2     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.c1 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2378c1) r2     // Catch:{ all -> 0x0f8b }
            r9.mo7356a(r12, r2)     // Catch:{ all -> 0x0f8b }
            goto L_0x05ba
        L_0x05a1:
            q.b.a.b.h.b.g5 r2 = r1.f7537i     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.b4 r2 = r2.mo8285i()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.e4 r2 = r2.mo8308t()     // Catch:{ all -> 0x0f8b }
            java.lang.String r4 = "Did not find conversion parameter. appId"
            q.b.a.b.g.e.e1 r8 = r7.f7552a     // Catch:{ all -> 0x0f8b }
            java.lang.String r8 = r8.mo7552n()     // Catch:{ all -> 0x0f8b }
            java.lang.Object r8 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r8)     // Catch:{ all -> 0x0f8b }
            r2.mo8433a(r4, r8)     // Catch:{ all -> 0x0f8b }
        L_0x05ba:
            if (r3 == 0) goto L_0x067d
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0f8b }
            java.util.List r3 = r9.mo7355a()     // Catch:{ all -> 0x0f8b }
            r2.<init>(r3)     // Catch:{ all -> 0x0f8b }
            r3 = 0
            r4 = -1
            r8 = -1
        L_0x05c8:
            int r12 = r2.size()     // Catch:{ all -> 0x0f8b }
            java.lang.String r13 = "currency"
            java.lang.String r14 = "value"
            if (r3 >= r12) goto L_0x05f8
            java.lang.Object r12 = r2.get(r3)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.c1 r12 = (p213q.p217b.p218a.p231b.p251g.p256e.C2378c1) r12     // Catch:{ all -> 0x0f8b }
            java.lang.String r12 = r12.mo7471k()     // Catch:{ all -> 0x0f8b }
            boolean r12 = r14.equals(r12)     // Catch:{ all -> 0x0f8b }
            if (r12 == 0) goto L_0x05e4
            r4 = r3
            goto L_0x05f5
        L_0x05e4:
            java.lang.Object r12 = r2.get(r3)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.c1 r12 = (p213q.p217b.p218a.p231b.p251g.p256e.C2378c1) r12     // Catch:{ all -> 0x0f8b }
            java.lang.String r12 = r12.mo7471k()     // Catch:{ all -> 0x0f8b }
            boolean r12 = r13.equals(r12)     // Catch:{ all -> 0x0f8b }
            if (r12 == 0) goto L_0x05f5
            r8 = r3
        L_0x05f5:
            int r3 = r3 + 1
            goto L_0x05c8
        L_0x05f8:
            r3 = -1
            if (r4 == r3) goto L_0x067e
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.c1 r3 = (p213q.p217b.p218a.p231b.p251g.p256e.C2378c1) r3     // Catch:{ all -> 0x0f8b }
            boolean r3 = r3.mo7474n()     // Catch:{ all -> 0x0f8b }
            if (r3 != 0) goto L_0x062e
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.c1 r3 = (p213q.p217b.p218a.p231b.p251g.p256e.C2378c1) r3     // Catch:{ all -> 0x0f8b }
            boolean r3 = r3.mo7476p()     // Catch:{ all -> 0x0f8b }
            if (r3 != 0) goto L_0x062e
            q.b.a.b.h.b.g5 r2 = r1.f7537i     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.b4 r2 = r2.mo8285i()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.e4 r2 = r2.mo8310v()     // Catch:{ all -> 0x0f8b }
            java.lang.String r3 = "Value must be specified with a numeric type."
            r2.mo8432a(r3)     // Catch:{ all -> 0x0f8b }
            r9.mo7361b(r4)     // Catch:{ all -> 0x0f8b }
            m7074a(r9, r5)     // Catch:{ all -> 0x0f8b }
            r2 = 18
            m7073a(r9, r2, r14)     // Catch:{ all -> 0x0f8b }
            goto L_0x067d
        L_0x062e:
            r3 = -1
            if (r8 != r3) goto L_0x0634
            r2 = 1
            r12 = 3
            goto L_0x0660
        L_0x0634:
            java.lang.Object r2 = r2.get(r8)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.c1 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2378c1) r2     // Catch:{ all -> 0x0f8b }
            java.lang.String r2 = r2.mo7473m()     // Catch:{ all -> 0x0f8b }
            int r8 = r2.length()     // Catch:{ all -> 0x0f8b }
            r12 = 3
            if (r8 == r12) goto L_0x0646
            goto L_0x0657
        L_0x0646:
            r8 = 0
        L_0x0647:
            int r14 = r2.length()     // Catch:{ all -> 0x0f8b }
            if (r8 >= r14) goto L_0x065f
            int r14 = r2.codePointAt(r8)     // Catch:{ all -> 0x0f8b }
            boolean r15 = java.lang.Character.isLetter(r14)     // Catch:{ all -> 0x0f8b }
            if (r15 != 0) goto L_0x0659
        L_0x0657:
            r2 = 1
            goto L_0x0660
        L_0x0659:
            int r14 = java.lang.Character.charCount(r14)     // Catch:{ all -> 0x0f8b }
            int r8 = r8 + r14
            goto L_0x0647
        L_0x065f:
            r2 = 0
        L_0x0660:
            if (r2 == 0) goto L_0x067f
            q.b.a.b.h.b.g5 r2 = r1.f7537i     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.b4 r2 = r2.mo8285i()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.e4 r2 = r2.mo8310v()     // Catch:{ all -> 0x0f8b }
            java.lang.String r8 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.mo8432a(r8)     // Catch:{ all -> 0x0f8b }
            r9.mo7361b(r4)     // Catch:{ all -> 0x0f8b }
            m7074a(r9, r5)     // Catch:{ all -> 0x0f8b }
            r2 = 19
            m7073a(r9, r2, r13)     // Catch:{ all -> 0x0f8b }
            goto L_0x067f
        L_0x067d:
            r3 = -1
        L_0x067e:
            r12 = 3
        L_0x067f:
            q.b.a.b.h.b.g5 r2 = r1.f7537i     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.ka r2 = r2.mo8469l()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.e1 r4 = r7.f7552a     // Catch:{ all -> 0x0f8b }
            java.lang.String r4 = r4.mo7552n()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.r3<java.lang.Boolean> r5 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7706U     // Catch:{ all -> 0x0f8b }
            boolean r2 = r2.mo8580d(r4, r5)     // Catch:{ all -> 0x0f8b }
            if (r2 == 0) goto L_0x0859
            java.lang.String r2 = r9.mo7364o()     // Catch:{ all -> 0x0f8b }
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x0f8b }
            r4 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x0704
            r45.mo8621k()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.p7 r2 = r9.mo7778m()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r2     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.a1 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r2     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.c1 r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.m7343b(r2, r6)     // Catch:{ all -> 0x0f8b }
            if (r2 != 0) goto L_0x06f4
            if (r10 == 0) goto L_0x06de
            long r13 = r10.mo7365p()     // Catch:{ all -> 0x0f8b }
            long r15 = r9.mo7365p()     // Catch:{ all -> 0x0f8b }
            long r13 = r13 - r15
            long r13 = java.lang.Math.abs(r13)     // Catch:{ all -> 0x0f8b }
            int r2 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x06de
            java.lang.Object r2 = r10.clone()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6$a r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a) r2     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.a1$a r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1.C2341a) r2     // Catch:{ all -> 0x0f8b }
            boolean r4 = r1.mo8608a(r9, r2)     // Catch:{ all -> 0x0f8b }
            if (r4 == 0) goto L_0x06de
            r8 = r35
            r6 = r36
            r8.mo7556a(r6, r2)     // Catch:{ all -> 0x0f8b }
            r4 = r32
            r13 = r34
            goto L_0x074e
        L_0x06de:
            r8 = r35
            r6 = r36
            r36 = r6
            r33 = r9
            r16 = r10
            r15 = r22
            r3 = r23
            r14 = r24
            r6 = r29
            r13 = r34
            goto L_0x0868
        L_0x06f4:
            r8 = r35
            r16 = r10
            r3 = r23
            r14 = r24
            r6 = r29
            r4 = r32
            r13 = r34
            goto L_0x0867
        L_0x0704:
            r8 = r35
            r6 = r36
            java.lang.String r2 = "_vs"
            java.lang.String r13 = r9.mo7364o()     // Catch:{ all -> 0x0f8b }
            boolean r2 = r2.equals(r13)     // Catch:{ all -> 0x0f8b }
            if (r2 == 0) goto L_0x076d
            r45.mo8621k()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.p7 r2 = r9.mo7778m()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r2     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.a1 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r2     // Catch:{ all -> 0x0f8b }
            r13 = r34
            q.b.a.b.g.e.c1 r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.m7343b(r2, r13)     // Catch:{ all -> 0x0f8b }
            if (r2 != 0) goto L_0x0769
            if (r33 == 0) goto L_0x075a
            long r14 = r33.mo7365p()     // Catch:{ all -> 0x0f8b }
            long r25 = r9.mo7365p()     // Catch:{ all -> 0x0f8b }
            long r14 = r14 - r25
            long r14 = java.lang.Math.abs(r14)     // Catch:{ all -> 0x0f8b }
            int r2 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x075a
            java.lang.Object r2 = r33.clone()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6$a r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a) r2     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.a1$a r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1.C2341a) r2     // Catch:{ all -> 0x0f8b }
            boolean r4 = r1.mo8608a(r2, r9)     // Catch:{ all -> 0x0f8b }
            if (r4 == 0) goto L_0x075a
            r4 = r32
            r8.mo7556a(r4, r2)     // Catch:{ all -> 0x0f8b }
        L_0x074e:
            r36 = r6
            r3 = r23
            r14 = r24
            r6 = r29
            r16 = 0
            goto L_0x084a
        L_0x075a:
            r4 = r32
            r15 = r4
            r16 = r9
            r36 = r22
            r3 = r23
            r14 = r24
            r6 = r29
            goto L_0x0868
        L_0x0769:
            r4 = r32
            goto L_0x084e
        L_0x076d:
            r4 = r32
            r13 = r34
            q.b.a.b.h.b.g5 r2 = r1.f7537i     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.ka r2 = r2.mo8469l()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.e1 r5 = r7.f7552a     // Catch:{ all -> 0x0f8b }
            java.lang.String r5 = r5.mo7552n()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.r3<java.lang.Boolean> r14 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7749s0     // Catch:{ all -> 0x0f8b }
            boolean r2 = r2.mo8580d(r5, r14)     // Catch:{ all -> 0x0f8b }
            if (r2 == 0) goto L_0x084e
            java.lang.String r2 = "_ab"
            java.lang.String r5 = r9.mo7364o()     // Catch:{ all -> 0x0f8b }
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x0f8b }
            if (r2 == 0) goto L_0x084e
            r45.mo8621k()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.p7 r2 = r9.mo7778m()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r2     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.a1 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r2     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.c1 r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.m7343b(r2, r13)     // Catch:{ all -> 0x0f8b }
            if (r2 != 0) goto L_0x084e
            if (r33 == 0) goto L_0x084e
            long r14 = r33.mo7365p()     // Catch:{ all -> 0x0f8b }
            long r25 = r9.mo7365p()     // Catch:{ all -> 0x0f8b }
            long r14 = r14 - r25
            long r14 = java.lang.Math.abs(r14)     // Catch:{ all -> 0x0f8b }
            r25 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r14 > r25 ? 1 : (r14 == r25 ? 0 : -1))
            if (r2 > 0) goto L_0x084e
            java.lang.Object r2 = r33.clone()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6$a r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6.C2491a) r2     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.a1$a r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1.C2341a) r2     // Catch:{ all -> 0x0f8b }
            r1.mo8612b(r2, r9)     // Catch:{ all -> 0x0f8b }
            java.lang.String r5 = r2.mo7364o()     // Catch:{ all -> 0x0f8b }
            boolean r5 = r11.equals(r5)     // Catch:{ all -> 0x0f8b }
            p124p.p126b.p127k.C1061o.m2507a(r5)     // Catch:{ all -> 0x0f8b }
            r45.mo8621k()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.p7 r5 = r2.mo7778m()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6 r5 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r5     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.a1 r5 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r5     // Catch:{ all -> 0x0f8b }
            r14 = r24
            q.b.a.b.g.e.c1 r5 = p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.m7343b(r5, r14)     // Catch:{ all -> 0x0f8b }
            r45.mo8621k()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.p7 r15 = r2.mo7778m()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6 r15 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r15     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.a1 r15 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r15     // Catch:{ all -> 0x0f8b }
            r3 = r23
            q.b.a.b.g.e.c1 r15 = p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.m7343b(r15, r3)     // Catch:{ all -> 0x0f8b }
            r45.mo8621k()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.p7 r16 = r2.mo7778m()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6 r16 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r16     // Catch:{ all -> 0x0f8b }
            r12 = r16
            q.b.a.b.g.e.a1 r12 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r12     // Catch:{ all -> 0x0f8b }
            r36 = r6
            r6 = r29
            q.b.a.b.g.e.c1 r12 = p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.m7343b(r12, r6)     // Catch:{ all -> 0x0f8b }
            if (r5 == 0) goto L_0x080c
            java.lang.String r5 = r5.mo7473m()     // Catch:{ all -> 0x0f8b }
            goto L_0x080e
        L_0x080c:
            r5 = r27
        L_0x080e:
            boolean r16 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0f8b }
            if (r16 != 0) goto L_0x081e
            r16 = r10
            q.b.a.b.h.b.t9 r10 = r45.mo8621k()     // Catch:{ all -> 0x0f8b }
            r10.mo8742a(r9, r14, r5)     // Catch:{ all -> 0x0f8b }
            goto L_0x0820
        L_0x081e:
            r16 = r10
        L_0x0820:
            if (r15 == 0) goto L_0x0827
            java.lang.String r5 = r15.mo7473m()     // Catch:{ all -> 0x0f8b }
            goto L_0x0829
        L_0x0827:
            r5 = r27
        L_0x0829:
            boolean r10 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0f8b }
            if (r10 != 0) goto L_0x0836
            q.b.a.b.h.b.t9 r10 = r45.mo8621k()     // Catch:{ all -> 0x0f8b }
            r10.mo8742a(r9, r3, r5)     // Catch:{ all -> 0x0f8b }
        L_0x0836:
            if (r12 == 0) goto L_0x0847
            q.b.a.b.h.b.t9 r5 = r45.mo8621k()     // Catch:{ all -> 0x0f8b }
            long r24 = r12.mo7475o()     // Catch:{ all -> 0x0f8b }
            java.lang.Long r10 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x0f8b }
            r5.mo8742a(r9, r6, r10)     // Catch:{ all -> 0x0f8b }
        L_0x0847:
            r8.mo7556a(r4, r2)     // Catch:{ all -> 0x0f8b }
        L_0x084a:
            r15 = r4
            r33 = 0
            goto L_0x0868
        L_0x084e:
            r36 = r6
            r16 = r10
            r3 = r23
            r14 = r24
            r6 = r29
            goto L_0x0867
        L_0x0859:
            r16 = r10
            r3 = r23
            r14 = r24
            r6 = r29
            r4 = r32
            r13 = r34
            r8 = r35
        L_0x0867:
            r15 = r4
        L_0x0868:
            if (r31 != 0) goto L_0x08c2
            java.lang.String r2 = r9.mo7364o()     // Catch:{ all -> 0x0f8b }
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x0f8b }
            if (r2 == 0) goto L_0x08c2
            int r2 = r9.mo7363n()     // Catch:{ all -> 0x0f8b }
            if (r2 != 0) goto L_0x0891
            q.b.a.b.h.b.g5 r2 = r1.f7537i     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.b4 r2 = r2.mo8285i()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.e4 r2 = r2.mo8309u()     // Catch:{ all -> 0x0f8b }
            java.lang.String r4 = "Engagement event does not contain any parameters. appId"
            q.b.a.b.g.e.e1 r5 = r7.f7552a     // Catch:{ all -> 0x0f8b }
            java.lang.String r5 = r5.mo7552n()     // Catch:{ all -> 0x0f8b }
        L_0x088c:
            java.lang.Object r5 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r5)     // Catch:{ all -> 0x0f8b }
            goto L_0x08b8
        L_0x0891:
            q.b.a.b.h.b.t9 r2 = r45.mo8621k()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.p7 r4 = r9.mo7778m()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r4     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.a1 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r4     // Catch:{ all -> 0x0f8b }
            java.lang.Object r2 = r2.mo8734a(r4, r13)     // Catch:{ all -> 0x0f8b }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0f8b }
            if (r2 != 0) goto L_0x08bc
            q.b.a.b.h.b.g5 r2 = r1.f7537i     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.b4 r2 = r2.mo8285i()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.e4 r2 = r2.mo8309u()     // Catch:{ all -> 0x0f8b }
            java.lang.String r4 = "Engagement event does not include duration. appId"
            q.b.a.b.g.e.e1 r5 = r7.f7552a     // Catch:{ all -> 0x0f8b }
            java.lang.String r5 = r5.mo7552n()     // Catch:{ all -> 0x0f8b }
            goto L_0x088c
        L_0x08b8:
            r2.mo8433a(r4, r5)     // Catch:{ all -> 0x0f8b }
            goto L_0x08c2
        L_0x08bc:
            long r4 = r2.longValue()     // Catch:{ all -> 0x0f8b }
            long r18 = r18 + r4
        L_0x08c2:
            java.util.List<q.b.a.b.g.e.a1> r2 = r7.f7554c     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.p7 r4 = r9.mo7778m()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r4     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.a1 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r4     // Catch:{ all -> 0x0f8b }
            r5 = r30
            r2.set(r5, r4)     // Catch:{ all -> 0x0f8b }
            int r11 = r22 + 1
            r8.mo7561a(r9)     // Catch:{ all -> 0x0f8b }
            r10 = r21
            r13 = r33
        L_0x08da:
            int r12 = r5 + 1
            r29 = r6
            r2 = r8
            r4 = r14
            r14 = r16
            r5 = r31
            r8 = r36
            goto L_0x02c4
        L_0x08e8:
            r8 = r2
            r31 = r5
            r13 = r10
            if (r31 == 0) goto L_0x0940
            r2 = r22
            r3 = 0
        L_0x08f1:
            if (r3 >= r2) goto L_0x0940
            q.b.a.b.g.e.a1 r4 = r8.mo7555a(r3)     // Catch:{ all -> 0x0f8b }
            java.lang.String r5 = r4.mo7352k()     // Catch:{ all -> 0x0f8b }
            boolean r5 = r11.equals(r5)     // Catch:{ all -> 0x0f8b }
            if (r5 == 0) goto L_0x0912
            r45.mo8621k()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.c1 r5 = p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.m7343b(r4, r6)     // Catch:{ all -> 0x0f8b }
            if (r5 == 0) goto L_0x0912
            r8.mo7565b(r3)     // Catch:{ all -> 0x0f8b }
            int r2 = r2 + -1
            int r3 = r3 + -1
            goto L_0x093d
        L_0x0912:
            r45.mo8621k()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.c1 r4 = p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.m7343b(r4, r13)     // Catch:{ all -> 0x0f8b }
            if (r4 == 0) goto L_0x093d
            boolean r5 = r4.mo7474n()     // Catch:{ all -> 0x0f8b }
            if (r5 == 0) goto L_0x092a
            long r4 = r4.mo7475o()     // Catch:{ all -> 0x0f8b }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0f8b }
            goto L_0x092b
        L_0x092a:
            r4 = 0
        L_0x092b:
            if (r4 == 0) goto L_0x093d
            long r9 = r4.longValue()     // Catch:{ all -> 0x0f8b }
            r14 = 0
            int r5 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x093d
            long r4 = r4.longValue()     // Catch:{ all -> 0x0f8b }
            long r18 = r18 + r4
        L_0x093d:
            r4 = 1
            int r3 = r3 + r4
            goto L_0x08f1
        L_0x0940:
            r2 = r18
            r4 = 0
            r1.mo8601a(r8, r2, r4)     // Catch:{ all -> 0x0f8b }
            java.util.List r4 = r8.mo7554a()     // Catch:{ all -> 0x0f8b }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0f8b }
        L_0x094e:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0f8b }
            if (r5 == 0) goto L_0x0968
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.a1 r5 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r5     // Catch:{ all -> 0x0f8b }
            java.lang.String r6 = "_s"
            java.lang.String r5 = r5.mo7352k()     // Catch:{ all -> 0x0f8b }
            boolean r5 = r6.equals(r5)     // Catch:{ all -> 0x0f8b }
            if (r5 == 0) goto L_0x094e
            r4 = 1
            goto L_0x0969
        L_0x0968:
            r4 = 0
        L_0x0969:
            java.lang.String r5 = "_se"
            if (r4 == 0) goto L_0x0978
            q.b.a.b.h.b.e r4 = r45.mo8619d()     // Catch:{ all -> 0x0f8b }
            java.lang.String r6 = r8.mo7607v()     // Catch:{ all -> 0x0f8b }
            r4.mo8414b(r6, r5)     // Catch:{ all -> 0x0f8b }
        L_0x0978:
            java.lang.String r4 = "_sid"
            int r4 = p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.m7332a(r8, r4)     // Catch:{ all -> 0x0f8b }
            if (r4 < 0) goto L_0x0982
            r4 = 1
            goto L_0x0983
        L_0x0982:
            r4 = 0
        L_0x0983:
            if (r4 == 0) goto L_0x098a
            r4 = 1
            r1.mo8601a(r8, r2, r4)     // Catch:{ all -> 0x0f8b }
            goto L_0x09ac
        L_0x098a:
            int r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.m7332a(r8, r5)     // Catch:{ all -> 0x0f8b }
            if (r2 < 0) goto L_0x09ac
            r8.mo7574d(r2)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.g5 r2 = r1.f7537i     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.b4 r2 = r2.mo8285i()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.e4 r2 = r2.mo8308t()     // Catch:{ all -> 0x0f8b }
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            q.b.a.b.g.e.e1 r4 = r7.f7552a     // Catch:{ all -> 0x0f8b }
            java.lang.String r4 = r4.mo7552n()     // Catch:{ all -> 0x0f8b }
            java.lang.Object r4 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r4)     // Catch:{ all -> 0x0f8b }
            r2.mo8433a(r3, r4)     // Catch:{ all -> 0x0f8b }
        L_0x09ac:
            q.b.a.b.h.b.t9 r2 = r45.mo8621k()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.b4 r3 = r2.mo8285i()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.e4 r3 = r3.mo8312x()     // Catch:{ all -> 0x0f8b }
            java.lang.String r4 = "Checking account type status for ad personalization signals"
            r3.mo8432a(r4)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.a5 r3 = r2.mo8653r()     // Catch:{ all -> 0x0f8b }
            java.lang.String r4 = r8.mo7607v()     // Catch:{ all -> 0x0f8b }
            boolean r3 = r3.mo8268b(r4)     // Catch:{ all -> 0x0f8b }
            if (r3 == 0) goto L_0x0a3a
            q.b.a.b.h.b.e r3 = r2.mo8652q()     // Catch:{ all -> 0x0f8b }
            java.lang.String r4 = r8.mo7607v()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.c4 r3 = r3.mo8413b(r4)     // Catch:{ all -> 0x0f8b }
            if (r3 == 0) goto L_0x0a3a
            boolean r3 = r3.mo8335c()     // Catch:{ all -> 0x0f8b }
            if (r3 == 0) goto L_0x0a3a
            q.b.a.b.h.b.h r3 = r2.mo8280d()     // Catch:{ all -> 0x0f8b }
            boolean r3 = r3.mo8496v()     // Catch:{ all -> 0x0f8b }
            if (r3 == 0) goto L_0x0a3a
            q.b.a.b.h.b.b4 r3 = r2.mo8285i()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.e4 r3 = r3.mo8311w()     // Catch:{ all -> 0x0f8b }
            java.lang.String r4 = "Turning off ad personalization due to account type"
            r3.mo8432a(r4)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i1$a r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2484i1.m5926l()     // Catch:{ all -> 0x0f8b }
            r4 = r28
            r3.mo7735a(r4)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.h r2 = r2.mo8280d()     // Catch:{ all -> 0x0f8b }
            long r5 = r2.mo8495u()     // Catch:{ all -> 0x0f8b }
            r3.mo7734a(r5)     // Catch:{ all -> 0x0f8b }
            r5 = 1
            r3.mo7736b(r5)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.p7 r2 = r3.mo7778m()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r2     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i1 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2484i1) r2     // Catch:{ all -> 0x0f8b }
            r3 = 0
        L_0x0a18:
            int r5 = r8.mo7602q()     // Catch:{ all -> 0x0f8b }
            if (r3 >= r5) goto L_0x0a34
            q.b.a.b.g.e.i1 r5 = r8.mo7573c(r3)     // Catch:{ all -> 0x0f8b }
            java.lang.String r5 = r5.mo7733k()     // Catch:{ all -> 0x0f8b }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x0f8b }
            if (r5 == 0) goto L_0x0a31
            r8.mo7557a(r3, r2)     // Catch:{ all -> 0x0f8b }
            r3 = 1
            goto L_0x0a35
        L_0x0a31:
            int r3 = r3 + 1
            goto L_0x0a18
        L_0x0a34:
            r3 = 0
        L_0x0a35:
            if (r3 != 0) goto L_0x0a3a
            r8.mo7563a(r2)     // Catch:{ all -> 0x0f8b }
        L_0x0a3a:
            q.b.a.b.h.b.g5 r2 = r1.f7537i     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.ka r2 = r2.mo8469l()     // Catch:{ all -> 0x0f8b }
            java.lang.String r3 = r8.mo7607v()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.r3<java.lang.Boolean> r4 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7739n0     // Catch:{ all -> 0x0f8b }
            boolean r2 = r2.mo8580d(r3, r4)     // Catch:{ all -> 0x0f8b }
            if (r2 == 0) goto L_0x0a4f
            m7075a(r8)     // Catch:{ all -> 0x0f8b }
        L_0x0a4f:
            r8.mo7610y()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.aa r9 = r45.mo8620e()     // Catch:{ all -> 0x0f8b }
            java.lang.String r10 = r8.mo7607v()     // Catch:{ all -> 0x0f8b }
            java.util.List r11 = r8.mo7554a()     // Catch:{ all -> 0x0f8b }
            java.util.List r12 = r8.mo7601p()     // Catch:{ all -> 0x0f8b }
            long r2 = r8.mo7603r()     // Catch:{ all -> 0x0f8b }
            java.lang.Long r13 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0f8b }
            long r2 = r8.mo7604s()     // Catch:{ all -> 0x0f8b }
            java.lang.Long r14 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0f8b }
            java.util.List r2 = r9.mo8292a(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0f8b }
            r8.mo7567b(r2)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.g5 r2 = r1.f7537i     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.ka r2 = r2.mo8469l()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.e1 r3 = r7.f7552a     // Catch:{ all -> 0x0f8b }
            java.lang.String r3 = r3.mo7552n()     // Catch:{ all -> 0x0f8b }
            boolean r2 = r2.mo8581e(r3)     // Catch:{ all -> 0x0f8b }
            if (r2 == 0) goto L_0x0dc6
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0dc0 }
            r2.<init>()     // Catch:{ all -> 0x0dc0 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0dc0 }
            r3.<init>()     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.h.b.g5 r4 = r1.f7537i     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.h.b.w9 r4 = r4.mo8473p()     // Catch:{ all -> 0x0dc0 }
            java.security.SecureRandom r4 = r4.mo8814t()     // Catch:{ all -> 0x0dc0 }
            r5 = 0
        L_0x0aa0:
            int r6 = r8.mo7597n()     // Catch:{ all -> 0x0dc0 }
            if (r5 >= r6) goto L_0x0d8b
            q.b.a.b.g.e.a1 r6 = r8.mo7555a(r5)     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.g.e.i6$a r6 = r6.mo7769h()     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.g.e.a1$a r6 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1.C2341a) r6     // Catch:{ all -> 0x0dc0 }
            java.lang.String r9 = r6.mo7364o()     // Catch:{ all -> 0x0dc0 }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0dc0 }
            java.lang.String r10 = "_sr"
            java.lang.String r11 = "_efs"
            if (r9 == 0) goto L_0x0b2c
            q.b.a.b.h.b.t9 r9 = r45.mo8621k()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.p7 r12 = r6.mo7778m()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6 r12 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r12     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.a1 r12 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r12     // Catch:{ all -> 0x0f8b }
            java.lang.String r13 = "_en"
            java.lang.Object r9 = r9.mo8734a(r12, r13)     // Catch:{ all -> 0x0f8b }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0f8b }
            java.lang.Object r12 = r2.get(r9)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.j r12 = (p213q.p217b.p218a.p231b.p259h.p261b.C2999j) r12     // Catch:{ all -> 0x0f8b }
            if (r12 != 0) goto L_0x0aed
            q.b.a.b.h.b.e r12 = r45.mo8619d()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.e1 r13 = r7.f7552a     // Catch:{ all -> 0x0f8b }
            java.lang.String r13 = r13.mo7552n()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.j r12 = r12.mo8399a(r13, r9)     // Catch:{ all -> 0x0f8b }
            r2.put(r9, r12)     // Catch:{ all -> 0x0f8b }
        L_0x0aed:
            java.lang.Long r9 = r12.f7437i     // Catch:{ all -> 0x0f8b }
            if (r9 != 0) goto L_0x0bf1
            java.lang.Long r9 = r12.f7438j     // Catch:{ all -> 0x0f8b }
            long r13 = r9.longValue()     // Catch:{ all -> 0x0f8b }
            r15 = 1
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 <= 0) goto L_0x0b06
            q.b.a.b.h.b.t9 r9 = r45.mo8621k()     // Catch:{ all -> 0x0f8b }
            java.lang.Long r13 = r12.f7438j     // Catch:{ all -> 0x0f8b }
            r9.mo8742a(r6, r10, r13)     // Catch:{ all -> 0x0f8b }
        L_0x0b06:
            java.lang.Boolean r9 = r12.f7439k     // Catch:{ all -> 0x0f8b }
            if (r9 == 0) goto L_0x0b1f
            java.lang.Boolean r9 = r12.f7439k     // Catch:{ all -> 0x0f8b }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0f8b }
            if (r9 == 0) goto L_0x0b1f
            q.b.a.b.h.b.t9 r9 = r45.mo8621k()     // Catch:{ all -> 0x0f8b }
            r12 = 1
            java.lang.Long r10 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0f8b }
            r9.mo8742a(r6, r11, r10)     // Catch:{ all -> 0x0f8b }
        L_0x0b1f:
            q.b.a.b.g.e.p7 r9 = r6.mo7778m()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6 r9 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r9     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.a1 r9 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r9     // Catch:{ all -> 0x0f8b }
        L_0x0b27:
            r3.add(r9)     // Catch:{ all -> 0x0f8b }
            goto L_0x0bf1
        L_0x0b2c:
            q.b.a.b.h.b.a5 r9 = r45.mo8610b()     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.g.e.e1 r12 = r7.f7552a     // Catch:{ all -> 0x0dc0 }
            java.lang.String r12 = r12.mo7552n()     // Catch:{ all -> 0x0dc0 }
            long r12 = r9.mo8270c(r12)     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.h.b.g5 r9 = r1.f7537i     // Catch:{ all -> 0x0dc0 }
            r9.mo8473p()     // Catch:{ all -> 0x0dc0 }
            long r14 = r6.mo7365p()     // Catch:{ all -> 0x0dc0 }
            long r14 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.m7400a(r14, r12)     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.g.e.p7 r9 = r6.mo7778m()     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.g.e.i6 r9 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r9     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.g.e.a1 r9 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r9     // Catch:{ all -> 0x0dc0 }
            r16 = r11
            java.lang.String r11 = "_dbg"
            r22 = r12
            r18 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0dc0 }
            boolean r13 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0dc0 }
            if (r13 != 0) goto L_0x0bb7
            if (r12 != 0) goto L_0x0b64
            goto L_0x0bb7
        L_0x0b64:
            java.util.List r9 = r9.mo7351a()     // Catch:{ all -> 0x0f8b }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0f8b }
        L_0x0b6c:
            boolean r13 = r9.hasNext()     // Catch:{ all -> 0x0f8b }
            if (r13 == 0) goto L_0x0bb7
            java.lang.Object r13 = r9.next()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.c1 r13 = (p213q.p217b.p218a.p231b.p251g.p256e.C2378c1) r13     // Catch:{ all -> 0x0f8b }
            r18 = r9
            java.lang.String r9 = r13.mo7471k()     // Catch:{ all -> 0x0f8b }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0f8b }
            if (r9 == 0) goto L_0x0bb4
            long r18 = r13.mo7475o()     // Catch:{ all -> 0x0f8b }
            java.lang.Long r9 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0f8b }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0f8b }
            if (r9 != 0) goto L_0x0bb2
            boolean r9 = r12 instanceof java.lang.String     // Catch:{ all -> 0x0f8b }
            if (r9 == 0) goto L_0x0ba0
            java.lang.String r9 = r13.mo7473m()     // Catch:{ all -> 0x0f8b }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0f8b }
            if (r9 != 0) goto L_0x0bb2
        L_0x0ba0:
            boolean r9 = r12 instanceof java.lang.Double     // Catch:{ all -> 0x0f8b }
            if (r9 == 0) goto L_0x0bb7
            double r18 = r13.mo7477q()     // Catch:{ all -> 0x0f8b }
            java.lang.Double r9 = java.lang.Double.valueOf(r18)     // Catch:{ all -> 0x0f8b }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0f8b }
            if (r9 == 0) goto L_0x0bb7
        L_0x0bb2:
            r9 = 1
            goto L_0x0bb8
        L_0x0bb4:
            r9 = r18
            goto L_0x0b6c
        L_0x0bb7:
            r9 = 0
        L_0x0bb8:
            if (r9 != 0) goto L_0x0bcd
            q.b.a.b.h.b.a5 r9 = r45.mo8610b()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.e1 r11 = r7.f7552a     // Catch:{ all -> 0x0f8b }
            java.lang.String r11 = r11.mo7552n()     // Catch:{ all -> 0x0f8b }
            java.lang.String r12 = r6.mo7364o()     // Catch:{ all -> 0x0f8b }
            int r9 = r9.mo8272d(r11, r12)     // Catch:{ all -> 0x0f8b }
            goto L_0x0bce
        L_0x0bcd:
            r9 = 1
        L_0x0bce:
            if (r9 > 0) goto L_0x0bf6
            q.b.a.b.h.b.g5 r10 = r1.f7537i     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.b4 r10 = r10.mo8285i()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.h.b.e4 r10 = r10.mo8309u()     // Catch:{ all -> 0x0f8b }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r6.mo7364o()     // Catch:{ all -> 0x0f8b }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0f8b }
            r10.mo8434a(r11, r12, r9)     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.p7 r9 = r6.mo7778m()     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.i6 r9 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r9     // Catch:{ all -> 0x0f8b }
            q.b.a.b.g.e.a1 r9 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r9     // Catch:{ all -> 0x0f8b }
            goto L_0x0b27
        L_0x0bf1:
            r8.mo7556a(r5, r6)     // Catch:{ all -> 0x0f8b }
            goto L_0x0ca0
        L_0x0bf6:
            java.lang.String r11 = r6.mo7364o()     // Catch:{ all -> 0x0dc0 }
            java.lang.Object r11 = r2.get(r11)     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.h.b.j r11 = (p213q.p217b.p218a.p231b.p259h.p261b.C2999j) r11     // Catch:{ all -> 0x0dc0 }
            if (r11 != 0) goto L_0x0c54
            q.b.a.b.h.b.e r11 = r45.mo8619d()     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.g.e.e1 r12 = r7.f7552a     // Catch:{ all -> 0x0dc0 }
            java.lang.String r12 = r12.mo7552n()     // Catch:{ all -> 0x0dc0 }
            java.lang.String r13 = r6.mo7364o()     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.h.b.j r11 = r11.mo8399a(r12, r13)     // Catch:{ all -> 0x0dc0 }
            if (r11 != 0) goto L_0x0c54
            q.b.a.b.h.b.g5 r11 = r1.f7537i     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.h.b.b4 r11 = r11.mo8285i()     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.h.b.e4 r11 = r11.mo8309u()     // Catch:{ all -> 0x0dc0 }
            java.lang.String r12 = "Event being bundled has no eventAggregate. appId, eventName"
            q.b.a.b.g.e.e1 r13 = r7.f7552a     // Catch:{ all -> 0x0dc0 }
            java.lang.String r13 = r13.mo7552n()     // Catch:{ all -> 0x0dc0 }
            java.lang.String r1 = r6.mo7364o()     // Catch:{ all -> 0x0dc0 }
            r11.mo8434a(r12, r13, r1)     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.h.b.j r11 = new q.b.a.b.h.b.j     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.g.e.e1 r1 = r7.f7552a     // Catch:{ all -> 0x0dc0 }
            java.lang.String r28 = r1.mo7552n()     // Catch:{ all -> 0x0dc0 }
            java.lang.String r29 = r6.mo7364o()     // Catch:{ all -> 0x0dc0 }
            r30 = 1
            r32 = 1
            r34 = 1
            long r36 = r6.mo7365p()     // Catch:{ all -> 0x0dc0 }
            r38 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r27 = r11
            r27.<init>(r28, r29, r30, r32, r34, r36, r38, r40, r41, r42, r43)     // Catch:{ all -> 0x0dc0 }
        L_0x0c54:
            q.b.a.b.h.b.t9 r1 = r45.mo8621k()     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.g.e.p7 r12 = r6.mo7778m()     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.g.e.i6 r12 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r12     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.g.e.a1 r12 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r12     // Catch:{ all -> 0x0dc0 }
            java.lang.String r13 = "_eid"
            java.lang.Object r1 = r1.mo8734a(r12, r13)     // Catch:{ all -> 0x0dc0 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0dc0 }
            if (r1 == 0) goto L_0x0c6c
            r12 = 1
            goto L_0x0c6d
        L_0x0c6c:
            r12 = 0
        L_0x0c6d:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0dc0 }
            r13 = 1
            if (r9 != r13) goto L_0x0ca9
            q.b.a.b.g.e.p7 r1 = r6.mo7778m()     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.g.e.i6 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r1     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.g.e.a1 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r1     // Catch:{ all -> 0x0dc0 }
            r3.add(r1)     // Catch:{ all -> 0x0dc0 }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0dc0 }
            if (r1 == 0) goto L_0x0c9d
            java.lang.Long r1 = r11.f7437i     // Catch:{ all -> 0x0dc0 }
            if (r1 != 0) goto L_0x0c91
            java.lang.Long r1 = r11.f7438j     // Catch:{ all -> 0x0dc0 }
            if (r1 != 0) goto L_0x0c91
            java.lang.Boolean r1 = r11.f7439k     // Catch:{ all -> 0x0dc0 }
            if (r1 == 0) goto L_0x0c9d
        L_0x0c91:
            r1 = 0
            q.b.a.b.h.b.j r9 = r11.mo8542a(r1, r1, r1)     // Catch:{ all -> 0x0dc0 }
            java.lang.String r1 = r6.mo7364o()     // Catch:{ all -> 0x0dc0 }
            r2.put(r1, r9)     // Catch:{ all -> 0x0dc0 }
        L_0x0c9d:
            r8.mo7556a(r5, r6)     // Catch:{ all -> 0x0dc0 }
        L_0x0ca0:
            r13 = r4
            r19 = r7
            r1 = r8
            r7 = r5
            r4 = 1
            goto L_0x0d80
        L_0x0ca9:
            int r13 = r4.nextInt(r9)     // Catch:{ all -> 0x0dc0 }
            if (r13 != 0) goto L_0x0cf0
            q.b.a.b.h.b.t9 r1 = r45.mo8621k()     // Catch:{ all -> 0x0dc0 }
            r13 = r4
            r18 = r5
            long r4 = (long) r9     // Catch:{ all -> 0x0dc0 }
            java.lang.Long r9 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0dc0 }
            r1.mo8742a(r6, r10, r9)     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.g.e.p7 r1 = r6.mo7778m()     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.g.e.i6 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r1     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.g.e.a1 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r1     // Catch:{ all -> 0x0dc0 }
            r3.add(r1)     // Catch:{ all -> 0x0dc0 }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0dc0 }
            if (r1 == 0) goto L_0x0cd8
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0dc0 }
            r4 = 0
            q.b.a.b.h.b.j r11 = r11.mo8542a(r4, r1, r4)     // Catch:{ all -> 0x0dc0 }
        L_0x0cd8:
            java.lang.String r1 = r6.mo7364o()     // Catch:{ all -> 0x0dc0 }
            long r4 = r6.mo7365p()     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.h.b.j r4 = r11.mo8541a(r4, r14)     // Catch:{ all -> 0x0dc0 }
            r2.put(r1, r4)     // Catch:{ all -> 0x0dc0 }
            r19 = r7
            r1 = r8
            r7 = r18
            r4 = 1
            goto L_0x0d7d
        L_0x0cf0:
            r13 = r4
            r18 = r5
            java.lang.Long r4 = r11.f7436h     // Catch:{ all -> 0x0dc0 }
            if (r4 == 0) goto L_0x0d02
            java.lang.Long r4 = r11.f7436h     // Catch:{ all -> 0x0dc0 }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0dc0 }
            r19 = r7
            r35 = r8
            goto L_0x0d17
        L_0x0d02:
            r4 = r45
            q.b.a.b.h.b.g5 r5 = r4.f7537i     // Catch:{ all -> 0x0dc0 }
            r5.mo8473p()     // Catch:{ all -> 0x0dc0 }
            long r4 = r6.mo7366q()     // Catch:{ all -> 0x0dc0 }
            r19 = r7
            r35 = r8
            r7 = r22
            long r4 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.m7400a(r4, r7)     // Catch:{ all -> 0x0dc0 }
        L_0x0d17:
            int r4 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x0d65
            q.b.a.b.h.b.t9 r1 = r45.mo8621k()     // Catch:{ all -> 0x0dc0 }
            r4 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0dc0 }
            r8 = r16
            r1.mo8742a(r6, r8, r7)     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.h.b.t9 r1 = r45.mo8621k()     // Catch:{ all -> 0x0dc0 }
            long r7 = (long) r9     // Catch:{ all -> 0x0dc0 }
            java.lang.Long r9 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0dc0 }
            r1.mo8742a(r6, r10, r9)     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.g.e.p7 r1 = r6.mo7778m()     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.g.e.i6 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r1     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.g.e.a1 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2340a1) r1     // Catch:{ all -> 0x0dc0 }
            r3.add(r1)     // Catch:{ all -> 0x0dc0 }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0dc0 }
            if (r1 == 0) goto L_0x0d55
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0dc0 }
            r7 = 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0dc0 }
            r7 = 0
            q.b.a.b.h.b.j r11 = r11.mo8542a(r7, r1, r8)     // Catch:{ all -> 0x0dc0 }
        L_0x0d55:
            java.lang.String r1 = r6.mo7364o()     // Catch:{ all -> 0x0dc0 }
            long r7 = r6.mo7365p()     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.h.b.j r7 = r11.mo8541a(r7, r14)     // Catch:{ all -> 0x0dc0 }
            r2.put(r1, r7)     // Catch:{ all -> 0x0dc0 }
            goto L_0x0d79
        L_0x0d65:
            r4 = 1
            boolean r7 = r12.booleanValue()     // Catch:{ all -> 0x0dc0 }
            if (r7 == 0) goto L_0x0d79
            java.lang.String r7 = r6.mo7364o()     // Catch:{ all -> 0x0dc0 }
            r8 = 0
            q.b.a.b.h.b.j r1 = r11.mo8542a(r1, r8, r8)     // Catch:{ all -> 0x0dc0 }
            r2.put(r7, r1)     // Catch:{ all -> 0x0dc0 }
        L_0x0d79:
            r7 = r18
            r1 = r35
        L_0x0d7d:
            r1.mo7556a(r7, r6)     // Catch:{ all -> 0x0dc0 }
        L_0x0d80:
            int r6 = r7 + 1
            r8 = r1
            r5 = r6
            r4 = r13
            r7 = r19
            r1 = r45
            goto L_0x0aa0
        L_0x0d8b:
            r19 = r7
            r1 = r8
            int r4 = r3.size()     // Catch:{ all -> 0x0dc0 }
            int r5 = r1.mo7597n()     // Catch:{ all -> 0x0dc0 }
            if (r4 >= r5) goto L_0x0d9e
            r1.mo7599o()     // Catch:{ all -> 0x0dc0 }
            r1.mo7559a(r3)     // Catch:{ all -> 0x0dc0 }
        L_0x0d9e:
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0dc0 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0dc0 }
        L_0x0da6:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0dc0 }
            if (r3 == 0) goto L_0x0dc9
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0dc0 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.h.b.e r4 = r45.mo8619d()     // Catch:{ all -> 0x0dc0 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0dc0 }
            q.b.a.b.h.b.j r3 = (p213q.p217b.p218a.p231b.p259h.p261b.C2999j) r3     // Catch:{ all -> 0x0dc0 }
            r4.mo8402a(r3)     // Catch:{ all -> 0x0dc0 }
            goto L_0x0da6
        L_0x0dc0:
            r0 = move-exception
            r1 = r0
            r3 = r45
            goto L_0x0f8e
        L_0x0dc6:
            r19 = r7
            r1 = r8
        L_0x0dc9:
            r3 = r45
            q.b.a.b.h.b.g5 r2 = r3.f7537i     // Catch:{ all -> 0x0f89 }
            q.b.a.b.h.b.ka r2 = r2.mo8469l()     // Catch:{ all -> 0x0f89 }
            java.lang.String r4 = r1.mo7607v()     // Catch:{ all -> 0x0f89 }
            q.b.a.b.h.b.r3<java.lang.Boolean> r5 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7739n0     // Catch:{ all -> 0x0f89 }
            boolean r2 = r2.mo8580d(r4, r5)     // Catch:{ all -> 0x0f89 }
            if (r2 != 0) goto L_0x0de0
            m7075a(r1)     // Catch:{ all -> 0x0f89 }
        L_0x0de0:
            r2 = r19
            q.b.a.b.g.e.e1 r4 = r2.f7552a     // Catch:{ all -> 0x0f89 }
            java.lang.String r4 = r4.mo7552n()     // Catch:{ all -> 0x0f89 }
            q.b.a.b.h.b.e r5 = r45.mo8619d()     // Catch:{ all -> 0x0f89 }
            q.b.a.b.h.b.c4 r5 = r5.mo8413b(r4)     // Catch:{ all -> 0x0f89 }
            if (r5 != 0) goto L_0x0e0c
            q.b.a.b.h.b.g5 r5 = r3.f7537i     // Catch:{ all -> 0x0f89 }
            q.b.a.b.h.b.b4 r5 = r5.mo8285i()     // Catch:{ all -> 0x0f89 }
            q.b.a.b.h.b.e4 r5 = r5.mo8308t()     // Catch:{ all -> 0x0f89 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            q.b.a.b.g.e.e1 r7 = r2.f7552a     // Catch:{ all -> 0x0f89 }
            java.lang.String r7 = r7.mo7552n()     // Catch:{ all -> 0x0f89 }
            java.lang.Object r7 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r7)     // Catch:{ all -> 0x0f89 }
            r5.mo8433a(r6, r7)     // Catch:{ all -> 0x0f89 }
            goto L_0x0e67
        L_0x0e0c:
            int r6 = r1.mo7597n()     // Catch:{ all -> 0x0f89 }
            if (r6 <= 0) goto L_0x0e67
            long r6 = r5.mo8360o()     // Catch:{ all -> 0x0f89 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0e20
            r1.mo7578e(r6)     // Catch:{ all -> 0x0f89 }
            goto L_0x0e23
        L_0x0e20:
            r1.mo7606u()     // Catch:{ all -> 0x0f89 }
        L_0x0e23:
            long r8 = r5.mo8359n()     // Catch:{ all -> 0x0f89 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0e2e
            goto L_0x0e2f
        L_0x0e2e:
            r6 = r8
        L_0x0e2f:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0e37
            r1.mo7575d(r6)     // Catch:{ all -> 0x0f89 }
            goto L_0x0e3a
        L_0x0e37:
            r1.mo7605t()     // Catch:{ all -> 0x0f89 }
        L_0x0e3a:
            r5.mo8371z()     // Catch:{ all -> 0x0f89 }
            long r6 = r5.mo8368w()     // Catch:{ all -> 0x0f89 }
            int r6 = (int) r6     // Catch:{ all -> 0x0f89 }
            r1.mo7580f(r6)     // Catch:{ all -> 0x0f89 }
            long r6 = r1.mo7603r()     // Catch:{ all -> 0x0f89 }
            r5.mo8323a(r6)     // Catch:{ all -> 0x0f89 }
            long r6 = r1.mo7604s()     // Catch:{ all -> 0x0f89 }
            r5.mo8329b(r6)     // Catch:{ all -> 0x0f89 }
            java.lang.String r6 = r5.mo8322a()     // Catch:{ all -> 0x0f89 }
            if (r6 == 0) goto L_0x0e5d
            r1.mo7592j(r6)     // Catch:{ all -> 0x0f89 }
            goto L_0x0e60
        L_0x0e5d:
            r1.mo7608w()     // Catch:{ all -> 0x0f89 }
        L_0x0e60:
            q.b.a.b.h.b.e r6 = r45.mo8619d()     // Catch:{ all -> 0x0f89 }
            r6.mo8401a(r5)     // Catch:{ all -> 0x0f89 }
        L_0x0e67:
            int r5 = r1.mo7597n()     // Catch:{ all -> 0x0f89 }
            if (r5 <= 0) goto L_0x0ecd
            q.b.a.b.h.b.g5 r5 = r3.f7537i     // Catch:{ all -> 0x0f89 }
            r5.mo8282f()     // Catch:{ all -> 0x0f89 }
            q.b.a.b.h.b.a5 r5 = r45.mo8610b()     // Catch:{ all -> 0x0f89 }
            q.b.a.b.g.e.e1 r6 = r2.f7552a     // Catch:{ all -> 0x0f89 }
            java.lang.String r6 = r6.mo7552n()     // Catch:{ all -> 0x0f89 }
            q.b.a.b.g.e.v0 r5 = r5.mo8264a(r6)     // Catch:{ all -> 0x0f89 }
            if (r5 == 0) goto L_0x0e91
            boolean r6 = r5.mo8052a()     // Catch:{ all -> 0x0f89 }
            if (r6 != 0) goto L_0x0e89
            goto L_0x0e91
        L_0x0e89:
            long r5 = r5.mo8053k()     // Catch:{ all -> 0x0f89 }
            r1.mo7589i(r5)     // Catch:{ all -> 0x0f89 }
            goto L_0x0ebc
        L_0x0e91:
            q.b.a.b.g.e.e1 r5 = r2.f7552a     // Catch:{ all -> 0x0f89 }
            java.lang.String r5 = r5.mo7549k()     // Catch:{ all -> 0x0f89 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0f89 }
            if (r5 == 0) goto L_0x0ea3
            r5 = -1
            r1.mo7589i(r5)     // Catch:{ all -> 0x0f89 }
            goto L_0x0ebc
        L_0x0ea3:
            q.b.a.b.h.b.g5 r5 = r3.f7537i     // Catch:{ all -> 0x0f89 }
            q.b.a.b.h.b.b4 r5 = r5.mo8285i()     // Catch:{ all -> 0x0f89 }
            q.b.a.b.h.b.e4 r5 = r5.mo8309u()     // Catch:{ all -> 0x0f89 }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            q.b.a.b.g.e.e1 r7 = r2.f7552a     // Catch:{ all -> 0x0f89 }
            java.lang.String r7 = r7.mo7552n()     // Catch:{ all -> 0x0f89 }
            java.lang.Object r7 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r7)     // Catch:{ all -> 0x0f89 }
            r5.mo8433a(r6, r7)     // Catch:{ all -> 0x0f89 }
        L_0x0ebc:
            q.b.a.b.h.b.e r5 = r45.mo8619d()     // Catch:{ all -> 0x0f89 }
            q.b.a.b.g.e.p7 r1 = r1.mo7778m()     // Catch:{ all -> 0x0f89 }
            q.b.a.b.g.e.i6 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r1     // Catch:{ all -> 0x0f89 }
            q.b.a.b.g.e.e1 r1 = (p213q.p217b.p218a.p231b.p251g.p256e.C2412e1) r1     // Catch:{ all -> 0x0f89 }
            r10 = r21
            r5.mo8407a(r1, r10)     // Catch:{ all -> 0x0f89 }
        L_0x0ecd:
            q.b.a.b.h.b.e r1 = r45.mo8619d()     // Catch:{ all -> 0x0f89 }
            java.util.List<java.lang.Long> r2 = r2.f7553b     // Catch:{ all -> 0x0f89 }
            p124p.p126b.p127k.C1061o.m2524b(r2)     // Catch:{ all -> 0x0f89 }
            r1.mo8279c()     // Catch:{ all -> 0x0f89 }
            r1.mo8649m()     // Catch:{ all -> 0x0f89 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0f89 }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0f89 }
            r6 = 0
        L_0x0ee4:
            int r7 = r2.size()     // Catch:{ all -> 0x0f89 }
            if (r6 >= r7) goto L_0x0f01
            if (r6 == 0) goto L_0x0ef1
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0f89 }
        L_0x0ef1:
            java.lang.Object r7 = r2.get(r6)     // Catch:{ all -> 0x0f89 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0f89 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0f89 }
            r5.append(r7)     // Catch:{ all -> 0x0f89 }
            int r6 = r6 + 1
            goto L_0x0ee4
        L_0x0f01:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0f89 }
            android.database.sqlite.SQLiteDatabase r6 = r1.mo8425t()     // Catch:{ all -> 0x0f89 }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0f89 }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0f89 }
            int r6 = r2.size()     // Catch:{ all -> 0x0f89 }
            if (r5 == r6) goto L_0x0f34
            q.b.a.b.h.b.b4 r1 = r1.mo8285i()     // Catch:{ all -> 0x0f89 }
            q.b.a.b.h.b.e4 r1 = r1.mo8308t()     // Catch:{ all -> 0x0f89 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0f89 }
            int r2 = r2.size()     // Catch:{ all -> 0x0f89 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0f89 }
            r1.mo8434a(r6, r5, r2)     // Catch:{ all -> 0x0f89 }
        L_0x0f34:
            q.b.a.b.h.b.e r1 = r45.mo8619d()     // Catch:{ all -> 0x0f89 }
            android.database.sqlite.SQLiteDatabase r2 = r1.mo8425t()     // Catch:{ all -> 0x0f89 }
            java.lang.String r5 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0f4b }
            r7 = 0
            r6[r7] = r4     // Catch:{ SQLiteException -> 0x0f4b }
            r7 = 1
            r6[r7] = r4     // Catch:{ SQLiteException -> 0x0f4b }
            r2.execSQL(r5, r6)     // Catch:{ SQLiteException -> 0x0f4b }
            goto L_0x0f5e
        L_0x0f4b:
            r0 = move-exception
            r2 = r0
            q.b.a.b.h.b.b4 r1 = r1.mo8285i()     // Catch:{ all -> 0x0f89 }
            q.b.a.b.h.b.e4 r1 = r1.mo8308t()     // Catch:{ all -> 0x0f89 }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r4 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r4)     // Catch:{ all -> 0x0f89 }
            r1.mo8434a(r5, r4, r2)     // Catch:{ all -> 0x0f89 }
        L_0x0f5e:
            q.b.a.b.h.b.e r1 = r45.mo8619d()     // Catch:{ all -> 0x0f89 }
            r1.mo8424s()     // Catch:{ all -> 0x0f89 }
            q.b.a.b.h.b.e r1 = r45.mo8619d()
            r1.mo8430y()
            r1 = 1
            return r1
        L_0x0f6e:
            r3 = r1
            q.b.a.b.h.b.e r1 = r45.mo8619d()     // Catch:{ all -> 0x0f89 }
            r1.mo8424s()     // Catch:{ all -> 0x0f89 }
            q.b.a.b.h.b.e r1 = r45.mo8619d()
            r1.mo8430y()
            r1 = 0
            return r1
        L_0x0f7f:
            r0 = move-exception
            r3 = r1
            r8 = r2
            r2 = r0
        L_0x0f83:
            if (r8 == 0) goto L_0x0f88
            r8.close()     // Catch:{ all -> 0x0f89 }
        L_0x0f88:
            throw r2     // Catch:{ all -> 0x0f89 }
        L_0x0f89:
            r0 = move-exception
            goto L_0x0f8d
        L_0x0f8b:
            r0 = move-exception
            r3 = r1
        L_0x0f8d:
            r1 = r0
        L_0x0f8e:
            q.b.a.b.h.b.e r2 = r45.mo8619d()
            r2.mo8430y()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3033l9.mo8607a(long):boolean");
    }

    /* renamed from: b */
    public final Boolean mo8609b(C2920c4 c4Var) {
        try {
            if (c4Var.mo8362q() != -2147483648L) {
                if (c4Var.mo8362q() == ((long) C2294b.m5363b(this.f7537i.f7332a).mo7310b(c4Var.mo8345g(), 0).versionCode)) {
                    return Boolean.valueOf(true);
                }
            } else {
                String str = C2294b.m5363b(this.f7537i.f7332a).mo7310b(c4Var.mo8345g(), 0).versionName;
                if (c4Var.mo8361p() != null && c4Var.mo8361p().equals(str)) {
                    return Boolean.valueOf(true);
                }
            }
            return Boolean.valueOf(false);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final C2897a5 mo8610b() {
        m7076a((C3046m9) this.f7529a);
        return this.f7529a;
    }

    /* renamed from: c */
    public final C2956f4 mo8616c() {
        m7076a((C3046m9) this.f7530b);
        return this.f7530b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0657, code lost:
        if (android.text.TextUtils.isEmpty(r3.f8034v) == false) goto L_0x0659;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x08e1, code lost:
        if (r8.f7235e < ((long) r1.f7537i.mo8469l().mo8577c(r4.f7466a))) goto L_0x08e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x08e3, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02f0 A[Catch:{ SQLiteException -> 0x02b8, all -> 0x093a }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0327 A[Catch:{ SQLiteException -> 0x02b8, all -> 0x093a }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0351 A[Catch:{ SQLiteException -> 0x02b8, all -> 0x093a }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03a5 A[Catch:{ SQLiteException -> 0x02b8, all -> 0x093a }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x067a A[Catch:{ SQLiteException -> 0x02b8, all -> 0x093a }] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0694 A[Catch:{ SQLiteException -> 0x02b8, all -> 0x093a }] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x06b7 A[Catch:{ SQLiteException -> 0x02b8, all -> 0x093a }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x06d2 A[Catch:{ SQLiteException -> 0x02b8, all -> 0x093a }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0779 A[Catch:{ SQLiteException -> 0x02b8, all -> 0x093a }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0786 A[Catch:{ SQLiteException -> 0x02b8, all -> 0x093a }] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x07a1 A[Catch:{ SQLiteException -> 0x02b8, all -> 0x093a }] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0820 A[Catch:{ SQLiteException -> 0x02b8, all -> 0x093a }] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0831 A[Catch:{ SQLiteException -> 0x02b8, all -> 0x093a }] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0849 A[Catch:{ SQLiteException -> 0x02b8, all -> 0x093a }] */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0890 A[Catch:{ SQLiteException -> 0x02b8, all -> 0x093a }] */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x08eb A[Catch:{ SQLiteException -> 0x02b8, all -> 0x093a }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0181 A[Catch:{ SQLiteException -> 0x02b8, all -> 0x093a }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018a A[Catch:{ SQLiteException -> 0x02b8, all -> 0x093a }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8617c(p213q.p217b.p218a.p231b.p259h.p261b.C3047n r29, p213q.p217b.p218a.p231b.p259h.p261b.C3189z9 r30) {
        /*
            r28 = this;
            r1 = r28
            r2 = r29
            r3 = r30
            java.lang.String r4 = "_sno"
            p124p.p126b.p127k.C1061o.m2524b(r30)
            java.lang.String r5 = r3.f8017e
            p124p.p126b.p127k.C1061o.m2528b(r5)
            long r5 = java.lang.System.nanoTime()
            r28.mo8628r()
            r28.mo8623m()
            java.lang.String r15 = r3.f8017e
            r28.mo8621k()
            boolean r7 = p213q.p217b.p218a.p231b.p259h.p261b.C3123t9.m7342a(r29, r30)
            if (r7 != 0) goto L_0x0026
            return
        L_0x0026:
            boolean r7 = r3.f8024l
            if (r7 != 0) goto L_0x002e
            r1.mo8611b(r3)
            return
        L_0x002e:
            q.b.a.b.h.b.a5 r7 = r28.mo8610b()
            java.lang.String r8 = r2.f7582e
            boolean r7 = r7.mo8269b(r15, r8)
            java.lang.String r14 = "_ev"
            java.lang.String r13 = "_err"
            r18 = 1
            r11 = 0
            r12 = 0
            if (r7 == 0) goto L_0x00db
            q.b.a.b.h.b.g5 r3 = r1.f7537i
            q.b.a.b.h.b.b4 r3 = r3.mo8285i()
            q.b.a.b.h.b.e4 r3 = r3.mo8309u()
            java.lang.Object r4 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r15)
            q.b.a.b.h.b.g5 r5 = r1.f7537i
            q.b.a.b.h.b.z3 r5 = r5.mo8474q()
            java.lang.String r6 = r2.f7582e
            java.lang.String r5 = r5.mo8834a(r6)
            java.lang.String r6 = "Dropping blacklisted event. appId"
            r3.mo8434a(r6, r4, r5)
            q.b.a.b.h.b.a5 r3 = r28.mo8610b()
            boolean r3 = r3.mo8273d(r15)
            if (r3 != 0) goto L_0x0078
            q.b.a.b.h.b.a5 r3 = r28.mo8610b()
            boolean r3 = r3.mo8274e(r15)
            if (r3 == 0) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r18 = r12
        L_0x0078:
            if (r18 != 0) goto L_0x008f
            java.lang.String r3 = r2.f7582e
            boolean r3 = r13.equals(r3)
            if (r3 != 0) goto L_0x008f
            q.b.a.b.h.b.g5 r3 = r1.f7537i
            q.b.a.b.h.b.w9 r3 = r3.mo8473p()
            r4 = 11
            java.lang.String r2 = r2.f7582e
            r3.mo8783a(r4, r14, r2, r12)
        L_0x008f:
            if (r18 == 0) goto L_0x00da
            q.b.a.b.h.b.e r2 = r28.mo8619d()
            q.b.a.b.h.b.c4 r2 = r2.mo8413b(r15)
            if (r2 == 0) goto L_0x00da
            long r3 = r2.mo8370y()
            long r5 = r2.mo8369x()
            long r3 = java.lang.Math.max(r3, r5)
            q.b.a.b.h.b.g5 r5 = r1.f7537i
            q.b.a.b.d.q.b r5 = r5.mo8284h()
            q.b.a.b.d.q.c r5 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r5
            long r5 = r5.mo7305a()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            q.b.a.b.h.b.r3<java.lang.Long> r5 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7762z
            java.lang.Object r5 = r5.mo8702a(r11)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00da
            q.b.a.b.h.b.g5 r3 = r1.f7537i
            q.b.a.b.h.b.b4 r3 = r3.mo8285i()
            q.b.a.b.h.b.e4 r3 = r3.mo8311w()
            java.lang.String r4 = "Fetching config for blacklisted app"
            r3.mo8432a(r4)
            r1.mo8602a(r2)
        L_0x00da:
            return
        L_0x00db:
            boolean r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2405da.m5643b()
            if (r7 == 0) goto L_0x010a
            q.b.a.b.h.b.g5 r7 = r1.f7537i
            q.b.a.b.h.b.ka r7 = r7.mo8469l()
            q.b.a.b.h.b.r3<java.lang.Boolean> r8 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7687K0
            boolean r7 = r7.mo8574a(r8)
            if (r7 == 0) goto L_0x010a
            q.b.a.b.h.b.g4 r2 = p213q.p217b.p218a.p231b.p259h.p261b.C2968g4.m6912a(r29)
            q.b.a.b.h.b.g5 r7 = r1.f7537i
            q.b.a.b.h.b.w9 r7 = r7.mo8473p()
            q.b.a.b.h.b.g5 r8 = r1.f7537i
            q.b.a.b.h.b.ka r8 = r8.mo8469l()
            int r8 = r8.mo8571a(r15)
            r7.mo8795a(r2, r8)
            q.b.a.b.h.b.n r2 = r2.mo8461a()
        L_0x010a:
            q.b.a.b.h.b.g5 r7 = r1.f7537i
            q.b.a.b.h.b.b4 r7 = r7.mo8285i()
            r8 = 2
            boolean r7 = r7.mo8305a(r8)
            if (r7 == 0) goto L_0x0130
            q.b.a.b.h.b.g5 r7 = r1.f7537i
            q.b.a.b.h.b.b4 r7 = r7.mo8285i()
            q.b.a.b.h.b.e4 r7 = r7.mo8312x()
            q.b.a.b.h.b.g5 r9 = r1.f7537i
            q.b.a.b.h.b.z3 r9 = r9.mo8474q()
            java.lang.String r9 = r9.mo8835a(r2)
            java.lang.String r10 = "Logging event"
            r7.mo8433a(r10, r9)
        L_0x0130:
            q.b.a.b.h.b.e r7 = r28.mo8619d()
            r7.mo8429x()
            r1.mo8611b(r3)     // Catch:{ all -> 0x093a }
            boolean r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2602oa.m6203b()     // Catch:{ all -> 0x093a }
            if (r7 == 0) goto L_0x0151
            q.b.a.b.h.b.g5 r7 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.ka r7 = r7.mo8469l()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.r3<java.lang.Boolean> r9 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7685J0     // Catch:{ all -> 0x093a }
            boolean r7 = r7.mo8574a(r9)     // Catch:{ all -> 0x093a }
            if (r7 == 0) goto L_0x0151
            r7 = r18
            goto L_0x0152
        L_0x0151:
            r7 = r12
        L_0x0152:
            java.lang.String r9 = "ecommerce_purchase"
            java.lang.String r10 = r2.f7582e     // Catch:{ all -> 0x093a }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x093a }
            java.lang.String r10 = "refund"
            if (r9 != 0) goto L_0x0175
            if (r7 == 0) goto L_0x0173
            java.lang.String r7 = "purchase"
            java.lang.String r9 = r2.f7582e     // Catch:{ all -> 0x093a }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x093a }
            if (r7 != 0) goto L_0x0175
            java.lang.String r7 = r2.f7582e     // Catch:{ all -> 0x093a }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x093a }
            if (r7 == 0) goto L_0x0173
            goto L_0x0175
        L_0x0173:
            r7 = r12
            goto L_0x0177
        L_0x0175:
            r7 = r18
        L_0x0177:
            java.lang.String r9 = "_iap"
            java.lang.String r11 = r2.f7582e     // Catch:{ all -> 0x093a }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x093a }
            if (r9 != 0) goto L_0x0186
            if (r7 == 0) goto L_0x0184
            goto L_0x0186
        L_0x0184:
            r9 = r12
            goto L_0x0188
        L_0x0186:
            r9 = r18
        L_0x0188:
            if (r9 == 0) goto L_0x0336
            q.b.a.b.h.b.m r9 = r2.f7583f     // Catch:{ all -> 0x093a }
            java.lang.String r11 = "currency"
            java.lang.String r9 = r9.mo8640d(r11)     // Catch:{ all -> 0x093a }
            java.lang.String r11 = "value"
            if (r7 == 0) goto L_0x020c
            q.b.a.b.h.b.m r7 = r2.f7583f     // Catch:{ all -> 0x093a }
            java.lang.Double r7 = r7.mo8639c(r11)     // Catch:{ all -> 0x093a }
            double r19 = r7.doubleValue()     // Catch:{ all -> 0x093a }
            r21 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r19 = r19 * r21
            r23 = 0
            int r7 = (r19 > r23 ? 1 : (r19 == r23 ? 0 : -1))
            if (r7 != 0) goto L_0x01bd
            q.b.a.b.h.b.m r7 = r2.f7583f     // Catch:{ all -> 0x093a }
            java.lang.Long r7 = r7.mo8638b(r11)     // Catch:{ all -> 0x093a }
            r17 = r13
            long r12 = r7.longValue()     // Catch:{ all -> 0x093a }
            double r11 = (double) r12     // Catch:{ all -> 0x093a }
            double r19 = r11 * r21
            goto L_0x01bf
        L_0x01bd:
            r17 = r13
        L_0x01bf:
            r11 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r7 = (r19 > r11 ? 1 : (r19 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x01ed
            r11 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r7 = (r19 > r11 ? 1 : (r19 == r11 ? 0 : -1))
            if (r7 < 0) goto L_0x01ed
            long r11 = java.lang.Math.round(r19)     // Catch:{ all -> 0x093a }
            boolean r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2602oa.m6203b()     // Catch:{ all -> 0x093a }
            if (r7 == 0) goto L_0x0218
            q.b.a.b.h.b.g5 r7 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.ka r7 = r7.mo8469l()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.r3<java.lang.Boolean> r13 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7685J0     // Catch:{ all -> 0x093a }
            boolean r7 = r7.mo8574a(r13)     // Catch:{ all -> 0x093a }
            if (r7 == 0) goto L_0x0218
            java.lang.String r7 = r2.f7582e     // Catch:{ all -> 0x093a }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x093a }
            if (r7 == 0) goto L_0x0218
            long r11 = -r11
            goto L_0x0218
        L_0x01ed:
            q.b.a.b.h.b.g5 r7 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.b4 r7 = r7.mo8285i()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.e4 r7 = r7.mo8309u()     // Catch:{ all -> 0x093a }
            java.lang.String r8 = "Data lost. Currency value is too big. appId"
            java.lang.Object r9 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r15)     // Catch:{ all -> 0x093a }
            java.lang.Double r10 = java.lang.Double.valueOf(r19)     // Catch:{ all -> 0x093a }
            r7.mo8434a(r8, r9, r10)     // Catch:{ all -> 0x093a }
            r24 = r5
            r26 = r17
            r5 = 0
            r12 = 0
            goto L_0x0325
        L_0x020c:
            r17 = r13
            q.b.a.b.h.b.m r7 = r2.f7583f     // Catch:{ all -> 0x093a }
            java.lang.Long r7 = r7.mo8638b(r11)     // Catch:{ all -> 0x093a }
            long r11 = r7.longValue()     // Catch:{ all -> 0x093a }
        L_0x0218:
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x093a }
            if (r7 != 0) goto L_0x031e
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ all -> 0x093a }
            java.lang.String r7 = r9.toUpperCase(r7)     // Catch:{ all -> 0x093a }
            java.lang.String r9 = "[A-Z]{3}"
            boolean r9 = r7.matches(r9)     // Catch:{ all -> 0x093a }
            if (r9 == 0) goto L_0x031e
            java.lang.String r9 = "_ltv_"
            int r10 = r7.length()     // Catch:{ all -> 0x093a }
            if (r10 == 0) goto L_0x0239
            java.lang.String r7 = r9.concat(r7)     // Catch:{ all -> 0x093a }
            goto L_0x023e
        L_0x0239:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x093a }
            r7.<init>(r9)     // Catch:{ all -> 0x093a }
        L_0x023e:
            r10 = r7
            q.b.a.b.h.b.e r7 = r28.mo8619d()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.u9 r7 = r7.mo8416c(r15, r10)     // Catch:{ all -> 0x093a }
            if (r7 == 0) goto L_0x027e
            java.lang.Object r9 = r7.f7911e     // Catch:{ all -> 0x093a }
            boolean r9 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x093a }
            if (r9 != 0) goto L_0x0250
            goto L_0x027e
        L_0x0250:
            java.lang.Object r7 = r7.f7911e     // Catch:{ all -> 0x093a }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x093a }
            long r7 = r7.longValue()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.u9 r19 = new q.b.a.b.h.b.u9     // Catch:{ all -> 0x093a }
            java.lang.String r9 = r2.f7584g     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r13 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.d.q.b r13 = r13.mo8284h()     // Catch:{ all -> 0x093a }
            q.b.a.b.d.q.c r13 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r13
            long r20 = r13.mo7305a()     // Catch:{ all -> 0x093a }
            long r7 = r7 + r11
            java.lang.Long r13 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x093a }
            r7 = r19
            r8 = r15
            r24 = r5
            r5 = 0
            r6 = 0
            r11 = r20
            r26 = r17
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x093a }
            r6 = r19
            goto L_0x02e6
        L_0x027e:
            r24 = r5
            r26 = r17
            r5 = 0
            r6 = 0
            q.b.a.b.h.b.e r7 = r28.mo8619d()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r9 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.ka r9 = r9.mo8469l()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.r3<java.lang.Integer> r13 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7674E     // Catch:{ all -> 0x093a }
            int r9 = r9.mo8576b(r15, r13)     // Catch:{ all -> 0x093a }
            int r9 = r9 + -1
            p124p.p126b.p127k.C1061o.m2528b(r15)     // Catch:{ all -> 0x093a }
            r7.mo8279c()     // Catch:{ all -> 0x093a }
            r7.mo8649m()     // Catch:{ all -> 0x093a }
            android.database.sqlite.SQLiteDatabase r13 = r7.mo8425t()     // Catch:{ SQLiteException -> 0x02b8 }
            java.lang.String r6 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x02b8 }
            r8[r5] = r15     // Catch:{ SQLiteException -> 0x02b8 }
            r8[r18] = r15     // Catch:{ SQLiteException -> 0x02b8 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x02b8 }
            r16 = 2
            r8[r16] = r9     // Catch:{ SQLiteException -> 0x02b8 }
            r13.execSQL(r6, r8)     // Catch:{ SQLiteException -> 0x02b8 }
            goto L_0x02cb
        L_0x02b8:
            r0 = move-exception
            r6 = r0
            q.b.a.b.h.b.b4 r7 = r7.mo8285i()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.e4 r7 = r7.mo8308t()     // Catch:{ all -> 0x093a }
            java.lang.String r8 = "Error pruning currencies. appId"
            java.lang.Object r9 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r15)     // Catch:{ all -> 0x093a }
            r7.mo8434a(r8, r9, r6)     // Catch:{ all -> 0x093a }
        L_0x02cb:
            q.b.a.b.h.b.u9 r6 = new q.b.a.b.h.b.u9     // Catch:{ all -> 0x093a }
            java.lang.String r9 = r2.f7584g     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r7 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.d.q.b r7 = r7.mo8284h()     // Catch:{ all -> 0x093a }
            q.b.a.b.d.q.c r7 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r7
            long r16 = r7.mo7305a()     // Catch:{ all -> 0x093a }
            java.lang.Long r13 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x093a }
            r7 = r6
            r8 = r15
            r11 = r16
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x093a }
        L_0x02e6:
            q.b.a.b.h.b.e r7 = r28.mo8619d()     // Catch:{ all -> 0x093a }
            boolean r7 = r7.mo8410a(r6)     // Catch:{ all -> 0x093a }
            if (r7 != 0) goto L_0x0323
            q.b.a.b.h.b.g5 r7 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.b4 r7 = r7.mo8285i()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.e4 r7 = r7.mo8308t()     // Catch:{ all -> 0x093a }
            java.lang.String r8 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r9 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r15)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r10 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.z3 r10 = r10.mo8474q()     // Catch:{ all -> 0x093a }
            java.lang.String r11 = r6.f7909c     // Catch:{ all -> 0x093a }
            java.lang.String r10 = r10.mo8838c(r11)     // Catch:{ all -> 0x093a }
            java.lang.Object r6 = r6.f7911e     // Catch:{ all -> 0x093a }
            r7.mo8435a(r8, r9, r10, r6)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r6 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.w9 r6 = r6.mo8473p()     // Catch:{ all -> 0x093a }
            r7 = 9
            r8 = 0
            r6.mo8783a(r7, r8, r8, r5)     // Catch:{ all -> 0x093a }
            goto L_0x0323
        L_0x031e:
            r24 = r5
            r26 = r17
            r5 = 0
        L_0x0323:
            r12 = r18
        L_0x0325:
            if (r12 != 0) goto L_0x033b
            q.b.a.b.h.b.e r2 = r28.mo8619d()     // Catch:{ all -> 0x093a }
            r2.mo8424s()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.e r2 = r28.mo8619d()
            r2.mo8430y()
            return
        L_0x0336:
            r24 = r5
            r5 = r12
            r26 = r13
        L_0x033b:
            java.lang.String r6 = r2.f7582e     // Catch:{ all -> 0x093a }
            boolean r6 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.m7417h(r6)     // Catch:{ all -> 0x093a }
            java.lang.String r7 = r2.f7582e     // Catch:{ all -> 0x093a }
            r8 = r26
            boolean r20 = r8.equals(r7)     // Catch:{ all -> 0x093a }
            boolean r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2602oa.m6203b()     // Catch:{ all -> 0x093a }
            r21 = 1
            if (r7 == 0) goto L_0x0370
            q.b.a.b.h.b.g5 r7 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.ka r7 = r7.mo8469l()     // Catch:{ all -> 0x093a }
            java.lang.String r8 = r3.f8017e     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.r3<java.lang.Boolean> r9 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7677F0     // Catch:{ all -> 0x093a }
            boolean r7 = r7.mo8580d(r8, r9)     // Catch:{ all -> 0x093a }
            if (r7 == 0) goto L_0x0370
            q.b.a.b.h.b.g5 r7 = r1.f7537i     // Catch:{ all -> 0x093a }
            r7.mo8473p()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.m r7 = r2.f7583f     // Catch:{ all -> 0x093a }
            long r7 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.m7401a(r7)     // Catch:{ all -> 0x093a }
            long r7 = r7 + r21
            r11 = r7
            goto L_0x0372
        L_0x0370:
            r11 = r21
        L_0x0372:
            q.b.a.b.h.b.e r7 = r28.mo8619d()     // Catch:{ all -> 0x093a }
            long r8 = r28.mo8629s()     // Catch:{ all -> 0x093a }
            r13 = 1
            r16 = 0
            r17 = 0
            r10 = r15
            r5 = r14
            r14 = r6
            r29 = r15
            r15 = r16
            r16 = r20
            q.b.a.b.h.b.d r7 = r7.mo8397a(r8, r10, r11, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x093a }
            long r8 = r7.f7232b     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.r3<java.lang.Integer> r10 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7732k     // Catch:{ all -> 0x093a }
            r11 = 0
            java.lang.Object r10 = r10.mo8702a(r11)     // Catch:{ all -> 0x093a }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x093a }
            int r10 = r10.intValue()     // Catch:{ all -> 0x093a }
            long r10 = (long) r10     // Catch:{ all -> 0x093a }
            long r8 = r8 - r10
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            r11 = 1000(0x3e8, double:4.94E-321)
            if (r10 <= 0) goto L_0x03d2
            long r8 = r8 % r11
            int r2 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r2 != 0) goto L_0x03c3
            q.b.a.b.h.b.g5 r2 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.b4 r2 = r2.mo8285i()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.e4 r2 = r2.mo8308t()     // Catch:{ all -> 0x093a }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r29)     // Catch:{ all -> 0x093a }
            long r5 = r7.f7232b     // Catch:{ all -> 0x093a }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x093a }
            r2.mo8434a(r3, r4, r5)     // Catch:{ all -> 0x093a }
        L_0x03c3:
            q.b.a.b.h.b.e r2 = r28.mo8619d()     // Catch:{ all -> 0x093a }
            r2.mo8424s()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.e r2 = r28.mo8619d()
            r2.mo8430y()
            return
        L_0x03d2:
            if (r6 == 0) goto L_0x0426
            long r8 = r7.f7231a     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.r3<java.lang.Integer> r10 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7736m     // Catch:{ all -> 0x093a }
            r13 = 0
            java.lang.Object r10 = r10.mo8702a(r13)     // Catch:{ all -> 0x093a }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x093a }
            int r10 = r10.intValue()     // Catch:{ all -> 0x093a }
            long r11 = (long) r10     // Catch:{ all -> 0x093a }
            long r8 = r8 - r11
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x0426
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 % r10
            int r3 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r3 != 0) goto L_0x0409
            q.b.a.b.h.b.g5 r3 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.b4 r3 = r3.mo8285i()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.e4 r3 = r3.mo8308t()     // Catch:{ all -> 0x093a }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r6 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r29)     // Catch:{ all -> 0x093a }
            long r7 = r7.f7231a     // Catch:{ all -> 0x093a }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x093a }
            r3.mo8434a(r4, r6, r7)     // Catch:{ all -> 0x093a }
        L_0x0409:
            q.b.a.b.h.b.g5 r3 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.w9 r3 = r3.mo8473p()     // Catch:{ all -> 0x093a }
            r4 = 16
            java.lang.String r2 = r2.f7582e     // Catch:{ all -> 0x093a }
            r6 = 0
            r3.mo8783a(r4, r5, r2, r6)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.e r2 = r28.mo8619d()     // Catch:{ all -> 0x093a }
            r2.mo8424s()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.e r2 = r28.mo8619d()
            r2.mo8430y()
            return
        L_0x0426:
            if (r20 == 0) goto L_0x0476
            long r8 = r7.f7234d     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r5 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.ka r5 = r5.mo8469l()     // Catch:{ all -> 0x093a }
            java.lang.String r10 = r3.f8017e     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.r3<java.lang.Integer> r11 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7734l     // Catch:{ all -> 0x093a }
            int r5 = r5.mo8576b(r10, r11)     // Catch:{ all -> 0x093a }
            r10 = 1000000(0xf4240, float:1.401298E-39)
            int r5 = java.lang.Math.min(r10, r5)     // Catch:{ all -> 0x093a }
            r10 = 0
            int r5 = java.lang.Math.max(r10, r5)     // Catch:{ all -> 0x093a }
            long r10 = (long) r5     // Catch:{ all -> 0x093a }
            long r8 = r8 - r10
            int r5 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x0476
            int r2 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r2 != 0) goto L_0x0467
            q.b.a.b.h.b.g5 r2 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.b4 r2 = r2.mo8285i()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.e4 r2 = r2.mo8308t()     // Catch:{ all -> 0x093a }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r29)     // Catch:{ all -> 0x093a }
            long r5 = r7.f7234d     // Catch:{ all -> 0x093a }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x093a }
            r2.mo8434a(r3, r4, r5)     // Catch:{ all -> 0x093a }
        L_0x0467:
            q.b.a.b.h.b.e r2 = r28.mo8619d()     // Catch:{ all -> 0x093a }
            r2.mo8424s()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.e r2 = r28.mo8619d()
            r2.mo8430y()
            return
        L_0x0476:
            q.b.a.b.h.b.m r5 = r2.f7583f     // Catch:{ all -> 0x093a }
            android.os.Bundle r5 = r5.mo8637b()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r7 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.w9 r7 = r7.mo8473p()     // Catch:{ all -> 0x093a }
            java.lang.String r8 = "_o"
            java.lang.String r9 = r2.f7584g     // Catch:{ all -> 0x093a }
            r7.mo8786a(r5, r8, r9)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r7 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.w9 r7 = r7.mo8473p()     // Catch:{ all -> 0x093a }
            r12 = r29
            boolean r7 = r7.mo8809d(r12)     // Catch:{ all -> 0x093a }
            java.lang.String r13 = "_r"
            if (r7 == 0) goto L_0x04b5
            q.b.a.b.h.b.g5 r7 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.w9 r7 = r7.mo8473p()     // Catch:{ all -> 0x093a }
            java.lang.String r8 = "_dbg"
            java.lang.Long r9 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x093a }
            r7.mo8786a(r5, r8, r9)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r7 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.w9 r7 = r7.mo8473p()     // Catch:{ all -> 0x093a }
            java.lang.Long r8 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x093a }
            r7.mo8786a(r5, r13, r8)     // Catch:{ all -> 0x093a }
        L_0x04b5:
            java.lang.String r7 = "_s"
            java.lang.String r8 = r2.f7582e     // Catch:{ all -> 0x093a }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x093a }
            if (r7 == 0) goto L_0x04dc
            q.b.a.b.h.b.e r7 = r28.mo8619d()     // Catch:{ all -> 0x093a }
            java.lang.String r8 = r3.f8017e     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.u9 r7 = r7.mo8416c(r8, r4)     // Catch:{ all -> 0x093a }
            if (r7 == 0) goto L_0x04dc
            java.lang.Object r8 = r7.f7911e     // Catch:{ all -> 0x093a }
            boolean r8 = r8 instanceof java.lang.Long     // Catch:{ all -> 0x093a }
            if (r8 == 0) goto L_0x04dc
            q.b.a.b.h.b.g5 r8 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.w9 r8 = r8.mo8473p()     // Catch:{ all -> 0x093a }
            java.lang.Object r7 = r7.f7911e     // Catch:{ all -> 0x093a }
            r8.mo8786a(r5, r4, r7)     // Catch:{ all -> 0x093a }
        L_0x04dc:
            q.b.a.b.h.b.e r4 = r28.mo8619d()     // Catch:{ all -> 0x093a }
            long r7 = r4.mo8415c(r12)     // Catch:{ all -> 0x093a }
            int r4 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x04ff
            q.b.a.b.h.b.g5 r4 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.b4 r4 = r4.mo8285i()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.e4 r4 = r4.mo8309u()     // Catch:{ all -> 0x093a }
            java.lang.String r9 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r10 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r12)     // Catch:{ all -> 0x093a }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x093a }
            r4.mo8434a(r9, r10, r7)     // Catch:{ all -> 0x093a }
        L_0x04ff:
            q.b.a.b.h.b.k r4 = new q.b.a.b.h.b.k     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r8 = r1.f7537i     // Catch:{ all -> 0x093a }
            java.lang.String r9 = r2.f7584g     // Catch:{ all -> 0x093a }
            java.lang.String r11 = r2.f7582e     // Catch:{ all -> 0x093a }
            long r14 = r2.f7585h     // Catch:{ all -> 0x093a }
            r20 = 0
            r7 = r4
            r10 = r12
            r2 = r12
            r27 = r13
            r12 = r14
            r14 = r20
            r16 = r5
            r7.<init>(r8, r9, r10, r11, r12, r14, r16)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.e r5 = r28.mo8619d()     // Catch:{ all -> 0x093a }
            java.lang.String r7 = r4.f7467b     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.j r5 = r5.mo8399a(r2, r7)     // Catch:{ all -> 0x093a }
            if (r5 != 0) goto L_0x058a
            q.b.a.b.h.b.e r5 = r28.mo8619d()     // Catch:{ all -> 0x093a }
            long r7 = r5.mo8417d(r2)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r5 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.ka r5 = r5.mo8469l()     // Catch:{ all -> 0x093a }
            int r5 = r5.mo8575b(r2)     // Catch:{ all -> 0x093a }
            long r9 = (long) r5     // Catch:{ all -> 0x093a }
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x057f
            if (r6 == 0) goto L_0x057f
            q.b.a.b.h.b.g5 r3 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.b4 r3 = r3.mo8285i()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.e4 r3 = r3.mo8308t()     // Catch:{ all -> 0x093a }
            java.lang.String r5 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r6 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r2)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r7 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.z3 r7 = r7.mo8474q()     // Catch:{ all -> 0x093a }
            java.lang.String r4 = r4.f7467b     // Catch:{ all -> 0x093a }
            java.lang.String r4 = r7.mo8834a(r4)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r7 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.ka r7 = r7.mo8469l()     // Catch:{ all -> 0x093a }
            int r2 = r7.mo8575b(r2)     // Catch:{ all -> 0x093a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x093a }
            r3.mo8435a(r5, r6, r4, r2)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r2 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.w9 r2 = r2.mo8473p()     // Catch:{ all -> 0x093a }
            r3 = 8
            r4 = 0
            r6 = 0
            r2.mo8783a(r3, r4, r4, r6)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.e r2 = r28.mo8619d()
            r2.mo8430y()
            return
        L_0x057f:
            r6 = 0
            q.b.a.b.h.b.j r5 = new q.b.a.b.h.b.j     // Catch:{ all -> 0x093a }
            java.lang.String r7 = r4.f7467b     // Catch:{ all -> 0x093a }
            long r8 = r4.f7469d     // Catch:{ all -> 0x093a }
            r5.<init>(r2, r7, r8)     // Catch:{ all -> 0x093a }
            goto L_0x0599
        L_0x058a:
            r6 = 0
            q.b.a.b.h.b.g5 r2 = r1.f7537i     // Catch:{ all -> 0x093a }
            long r7 = r5.f7434f     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.k r4 = r4.mo8549a(r2, r7)     // Catch:{ all -> 0x093a }
            long r7 = r4.f7469d     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.j r5 = r5.mo8540a(r7)     // Catch:{ all -> 0x093a }
        L_0x0599:
            q.b.a.b.h.b.e r2 = r28.mo8619d()     // Catch:{ all -> 0x093a }
            r2.mo8402a(r5)     // Catch:{ all -> 0x093a }
            r28.mo8628r()     // Catch:{ all -> 0x093a }
            r28.mo8623m()     // Catch:{ all -> 0x093a }
            p124p.p126b.p127k.C1061o.m2524b(r4)     // Catch:{ all -> 0x093a }
            p124p.p126b.p127k.C1061o.m2524b(r30)     // Catch:{ all -> 0x093a }
            java.lang.String r2 = r4.f7466a     // Catch:{ all -> 0x093a }
            p124p.p126b.p127k.C1061o.m2528b(r2)     // Catch:{ all -> 0x093a }
            java.lang.String r2 = r4.f7466a     // Catch:{ all -> 0x093a }
            java.lang.String r5 = r3.f8017e     // Catch:{ all -> 0x093a }
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x093a }
            p124p.p126b.p127k.C1061o.m2507a(r2)     // Catch:{ all -> 0x093a }
            q.b.a.b.g.e.e1$a r2 = p213q.p217b.p218a.p231b.p251g.p256e.C2412e1.m5677o()     // Catch:{ all -> 0x093a }
            r2.mo7554a()     // Catch:{ all -> 0x093a }
            java.lang.String r5 = "android"
            r2.mo7560a(r5)     // Catch:{ all -> 0x093a }
            java.lang.String r5 = r3.f8017e     // Catch:{ all -> 0x093a }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x093a }
            if (r5 != 0) goto L_0x05d5
            java.lang.String r5 = r3.f8017e     // Catch:{ all -> 0x093a }
            r2.mo7582f(r5)     // Catch:{ all -> 0x093a }
        L_0x05d5:
            java.lang.String r5 = r3.f8020h     // Catch:{ all -> 0x093a }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x093a }
            if (r5 != 0) goto L_0x05e2
            java.lang.String r5 = r3.f8020h     // Catch:{ all -> 0x093a }
            r2.mo7579e(r5)     // Catch:{ all -> 0x093a }
        L_0x05e2:
            java.lang.String r5 = r3.f8019g     // Catch:{ all -> 0x093a }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x093a }
            if (r5 != 0) goto L_0x05ef
            java.lang.String r5 = r3.f8019g     // Catch:{ all -> 0x093a }
            r2.mo7585g(r5)     // Catch:{ all -> 0x093a }
        L_0x05ef:
            long r7 = r3.f8026n     // Catch:{ all -> 0x093a }
            r9 = -2147483648(0xffffffff80000000, double:NaN)
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x05fe
            long r7 = r3.f8026n     // Catch:{ all -> 0x093a }
            int r5 = (int) r7     // Catch:{ all -> 0x093a }
            r2.mo7583g(r5)     // Catch:{ all -> 0x093a }
        L_0x05fe:
            long r7 = r3.f8021i     // Catch:{ all -> 0x093a }
            r2.mo7581f(r7)     // Catch:{ all -> 0x093a }
            java.lang.String r5 = r3.f8018f     // Catch:{ all -> 0x093a }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x093a }
            if (r5 != 0) goto L_0x0610
            java.lang.String r5 = r3.f8018f     // Catch:{ all -> 0x093a }
            r2.mo7594k(r5)     // Catch:{ all -> 0x093a }
        L_0x0610:
            boolean r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2424ec.m5790b()     // Catch:{ all -> 0x093a }
            if (r5 == 0) goto L_0x065c
            q.b.a.b.h.b.g5 r5 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.ka r5 = r5.mo8469l()     // Catch:{ all -> 0x093a }
            java.lang.String r7 = r3.f8017e     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.r3<java.lang.Boolean> r8 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7741o0     // Catch:{ all -> 0x093a }
            boolean r5 = r5.mo8580d(r7, r8)     // Catch:{ all -> 0x093a }
            if (r5 == 0) goto L_0x065c
            java.lang.String r5 = r2.mo7609x()     // Catch:{ all -> 0x093a }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x093a }
            if (r5 == 0) goto L_0x063d
            java.lang.String r5 = r3.f8038z     // Catch:{ all -> 0x093a }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x093a }
            if (r5 != 0) goto L_0x063d
            java.lang.String r5 = r3.f8038z     // Catch:{ all -> 0x093a }
            r2.mo7600o(r5)     // Catch:{ all -> 0x093a }
        L_0x063d:
            java.lang.String r5 = r2.mo7609x()     // Catch:{ all -> 0x093a }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x093a }
            if (r5 == 0) goto L_0x0672
            java.lang.String r5 = r2.mo7553A()     // Catch:{ all -> 0x093a }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x093a }
            if (r5 == 0) goto L_0x0672
            java.lang.String r5 = r3.f8034v     // Catch:{ all -> 0x093a }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x093a }
            if (r5 != 0) goto L_0x0672
        L_0x0659:
            java.lang.String r5 = r3.f8034v     // Catch:{ all -> 0x093a }
            goto L_0x066f
        L_0x065c:
            java.lang.String r5 = r2.mo7609x()     // Catch:{ all -> 0x093a }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x093a }
            if (r5 == 0) goto L_0x0672
            java.lang.String r5 = r3.f8034v     // Catch:{ all -> 0x093a }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x093a }
            if (r5 != 0) goto L_0x0672
            goto L_0x0659
        L_0x066f:
            r2.mo7598n(r5)     // Catch:{ all -> 0x093a }
        L_0x0672:
            long r7 = r3.f8022j     // Catch:{ all -> 0x093a }
            r9 = 0
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x067f
            long r7 = r3.f8022j     // Catch:{ all -> 0x093a }
            r2.mo7587h(r7)     // Catch:{ all -> 0x093a }
        L_0x067f:
            long r7 = r3.f8036x     // Catch:{ all -> 0x093a }
            r2.mo7593k(r7)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r5 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.ka r5 = r5.mo8469l()     // Catch:{ all -> 0x093a }
            java.lang.String r7 = r3.f8017e     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.r3<java.lang.Boolean> r8 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7709X     // Catch:{ all -> 0x093a }
            boolean r5 = r5.mo8580d(r7, r8)     // Catch:{ all -> 0x093a }
            if (r5 == 0) goto L_0x06a1
            q.b.a.b.h.b.t9 r5 = r28.mo8621k()     // Catch:{ all -> 0x093a }
            java.util.List r5 = r5.mo8748s()     // Catch:{ all -> 0x093a }
            if (r5 == 0) goto L_0x06a1
            r2.mo7571c(r5)     // Catch:{ all -> 0x093a }
        L_0x06a1:
            q.b.a.b.h.b.g5 r5 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.o4 r5 = r5.mo8470m()     // Catch:{ all -> 0x093a }
            java.lang.String r7 = r3.f8017e     // Catch:{ all -> 0x093a }
            android.util.Pair r5 = r5.mo8662a(r7)     // Catch:{ all -> 0x093a }
            java.lang.Object r7 = r5.first     // Catch:{ all -> 0x093a }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ all -> 0x093a }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x093a }
            if (r7 != 0) goto L_0x06d2
            boolean r7 = r3.f8031s     // Catch:{ all -> 0x093a }
            if (r7 == 0) goto L_0x0734
            java.lang.Object r7 = r5.first     // Catch:{ all -> 0x093a }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x093a }
            r2.mo7588h(r7)     // Catch:{ all -> 0x093a }
            java.lang.Object r7 = r5.second     // Catch:{ all -> 0x093a }
            if (r7 == 0) goto L_0x0734
            java.lang.Object r5 = r5.second     // Catch:{ all -> 0x093a }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x093a }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x093a }
            r2.mo7564a(r5)     // Catch:{ all -> 0x093a }
            goto L_0x0734
        L_0x06d2:
            q.b.a.b.h.b.g5 r5 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.h r5 = r5.mo8478u()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r7 = r1.f7537i     // Catch:{ all -> 0x093a }
            android.content.Context r7 = r7.mo8286j()     // Catch:{ all -> 0x093a }
            boolean r5 = r5.mo8492a(r7)     // Catch:{ all -> 0x093a }
            if (r5 != 0) goto L_0x0734
            boolean r5 = r3.f8032t     // Catch:{ all -> 0x093a }
            if (r5 == 0) goto L_0x0734
            q.b.a.b.h.b.g5 r5 = r1.f7537i     // Catch:{ all -> 0x093a }
            android.content.Context r5 = r5.mo8286j()     // Catch:{ all -> 0x093a }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x093a }
            java.lang.String r7 = "android_id"
            java.lang.String r5 = android.provider.Settings.Secure.getString(r5, r7)     // Catch:{ all -> 0x093a }
            if (r5 != 0) goto L_0x0714
            q.b.a.b.h.b.g5 r5 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.b4 r5 = r5.mo8285i()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.e4 r5 = r5.mo8309u()     // Catch:{ all -> 0x093a }
            java.lang.String r7 = "null secure ID. appId"
            java.lang.String r8 = r2.mo7607v()     // Catch:{ all -> 0x093a }
            java.lang.Object r8 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r8)     // Catch:{ all -> 0x093a }
            r5.mo8433a(r7, r8)     // Catch:{ all -> 0x093a }
            java.lang.String r5 = "null"
            goto L_0x0731
        L_0x0714:
            boolean r7 = r5.isEmpty()     // Catch:{ all -> 0x093a }
            if (r7 == 0) goto L_0x0731
            q.b.a.b.h.b.g5 r7 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.b4 r7 = r7.mo8285i()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.e4 r7 = r7.mo8309u()     // Catch:{ all -> 0x093a }
            java.lang.String r8 = "empty secure ID. appId"
            java.lang.String r11 = r2.mo7607v()     // Catch:{ all -> 0x093a }
            java.lang.Object r11 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r11)     // Catch:{ all -> 0x093a }
            r7.mo8433a(r8, r11)     // Catch:{ all -> 0x093a }
        L_0x0731:
            r2.mo7596m(r5)     // Catch:{ all -> 0x093a }
        L_0x0734:
            q.b.a.b.h.b.g5 r5 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.h r5 = r5.mo8478u()     // Catch:{ all -> 0x093a }
            r5.mo8846n()     // Catch:{ all -> 0x093a }
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ all -> 0x093a }
            r2.mo7572c(r5)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r5 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.h r5 = r5.mo8478u()     // Catch:{ all -> 0x093a }
            r5.mo8846n()     // Catch:{ all -> 0x093a }
            java.lang.String r5 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x093a }
            r2.mo7568b(r5)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r5 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.h r5 = r5.mo8478u()     // Catch:{ all -> 0x093a }
            long r7 = r5.mo8493s()     // Catch:{ all -> 0x093a }
            int r5 = (int) r7     // Catch:{ all -> 0x093a }
            r2.mo7577e(r5)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r5 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.h r5 = r5.mo8478u()     // Catch:{ all -> 0x093a }
            java.lang.String r5 = r5.mo8494t()     // Catch:{ all -> 0x093a }
            r2.mo7576d(r5)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r5 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.ka r5 = r5.mo8469l()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.r3<java.lang.Boolean> r7 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7691M0     // Catch:{ all -> 0x093a }
            boolean r5 = r5.mo8574a(r7)     // Catch:{ all -> 0x093a }
            if (r5 != 0) goto L_0x077e
            long r7 = r3.f8028p     // Catch:{ all -> 0x093a }
            r2.mo7591j(r7)     // Catch:{ all -> 0x093a }
        L_0x077e:
            q.b.a.b.h.b.g5 r5 = r1.f7537i     // Catch:{ all -> 0x093a }
            boolean r5 = r5.mo8464b()     // Catch:{ all -> 0x093a }
            if (r5 == 0) goto L_0x0795
            r2.mo7607v()     // Catch:{ all -> 0x093a }
            r5 = 0
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x093a }
            if (r7 == 0) goto L_0x0791
            goto L_0x0795
        L_0x0791:
            r2.mo7611z()     // Catch:{ all -> 0x093a }
            throw r5
        L_0x0795:
            q.b.a.b.h.b.e r5 = r28.mo8619d()     // Catch:{ all -> 0x093a }
            java.lang.String r7 = r3.f8017e     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.c4 r5 = r5.mo8413b(r7)     // Catch:{ all -> 0x093a }
            if (r5 != 0) goto L_0x0816
            q.b.a.b.h.b.c4 r5 = new q.b.a.b.h.b.c4     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r7 = r1.f7537i     // Catch:{ all -> 0x093a }
            java.lang.String r8 = r3.f8017e     // Catch:{ all -> 0x093a }
            r5.<init>(r7, r8)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r7 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.w9 r7 = r7.mo8473p()     // Catch:{ all -> 0x093a }
            java.lang.String r7 = r7.mo8816v()     // Catch:{ all -> 0x093a }
            r5.mo8325a(r7)     // Catch:{ all -> 0x093a }
            java.lang.String r7 = r3.f8027o     // Catch:{ all -> 0x093a }
            r5.mo8344f(r7)     // Catch:{ all -> 0x093a }
            java.lang.String r7 = r3.f8018f     // Catch:{ all -> 0x093a }
            r5.mo8330b(r7)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r7 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.o4 r7 = r7.mo8470m()     // Catch:{ all -> 0x093a }
            java.lang.String r8 = r3.f8017e     // Catch:{ all -> 0x093a }
            java.lang.String r7 = r7.mo8665b(r8)     // Catch:{ all -> 0x093a }
            r5.mo8341e(r7)     // Catch:{ all -> 0x093a }
            r5.mo8346g(r9)     // Catch:{ all -> 0x093a }
            r5.mo8323a(r9)     // Catch:{ all -> 0x093a }
            r5.mo8329b(r9)     // Catch:{ all -> 0x093a }
            java.lang.String r7 = r3.f8019g     // Catch:{ all -> 0x093a }
            r5.mo8347g(r7)     // Catch:{ all -> 0x093a }
            long r7 = r3.f8026n     // Catch:{ all -> 0x093a }
            r5.mo8332c(r7)     // Catch:{ all -> 0x093a }
            java.lang.String r7 = r3.f8020h     // Catch:{ all -> 0x093a }
            r5.mo8350h(r7)     // Catch:{ all -> 0x093a }
            long r7 = r3.f8021i     // Catch:{ all -> 0x093a }
            r5.mo8336d(r7)     // Catch:{ all -> 0x093a }
            long r7 = r3.f8022j     // Catch:{ all -> 0x093a }
            r5.mo8340e(r7)     // Catch:{ all -> 0x093a }
            boolean r7 = r3.f8024l     // Catch:{ all -> 0x093a }
            r5.mo8327a(r7)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r7 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.ka r7 = r7.mo8469l()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.r3<java.lang.Boolean> r8 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7691M0     // Catch:{ all -> 0x093a }
            boolean r7 = r7.mo8574a(r8)     // Catch:{ all -> 0x093a }
            if (r7 != 0) goto L_0x080a
            long r7 = r3.f8028p     // Catch:{ all -> 0x093a }
            r5.mo8355j(r7)     // Catch:{ all -> 0x093a }
        L_0x080a:
            long r7 = r3.f8036x     // Catch:{ all -> 0x093a }
            r5.mo8343f(r7)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.e r7 = r28.mo8619d()     // Catch:{ all -> 0x093a }
            r7.mo8401a(r5)     // Catch:{ all -> 0x093a }
        L_0x0816:
            java.lang.String r7 = r5.mo8348h()     // Catch:{ all -> 0x093a }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x093a }
            if (r7 != 0) goto L_0x0827
            java.lang.String r7 = r5.mo8348h()     // Catch:{ all -> 0x093a }
            r2.mo7590i(r7)     // Catch:{ all -> 0x093a }
        L_0x0827:
            java.lang.String r7 = r5.mo8358m()     // Catch:{ all -> 0x093a }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x093a }
            if (r7 != 0) goto L_0x0838
            java.lang.String r5 = r5.mo8358m()     // Catch:{ all -> 0x093a }
            r2.mo7595l(r5)     // Catch:{ all -> 0x093a }
        L_0x0838:
            q.b.a.b.h.b.e r5 = r28.mo8619d()     // Catch:{ all -> 0x093a }
            java.lang.String r3 = r3.f8017e     // Catch:{ all -> 0x093a }
            java.util.List r3 = r5.mo8393a(r3)     // Catch:{ all -> 0x093a }
            r12 = r6
        L_0x0843:
            int r5 = r3.size()     // Catch:{ all -> 0x093a }
            if (r12 >= r5) goto L_0x0878
            q.b.a.b.g.e.i1$a r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2484i1.m5926l()     // Catch:{ all -> 0x093a }
            java.lang.Object r7 = r3.get(r12)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.u9 r7 = (p213q.p217b.p218a.p231b.p259h.p261b.C3134u9) r7     // Catch:{ all -> 0x093a }
            java.lang.String r7 = r7.f7909c     // Catch:{ all -> 0x093a }
            r5.mo7735a(r7)     // Catch:{ all -> 0x093a }
            java.lang.Object r7 = r3.get(r12)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.u9 r7 = (p213q.p217b.p218a.p231b.p259h.p261b.C3134u9) r7     // Catch:{ all -> 0x093a }
            long r7 = r7.f7910d     // Catch:{ all -> 0x093a }
            r5.mo7734a(r7)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.t9 r7 = r28.mo8621k()     // Catch:{ all -> 0x093a }
            java.lang.Object r8 = r3.get(r12)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.u9 r8 = (p213q.p217b.p218a.p231b.p259h.p261b.C3134u9) r8     // Catch:{ all -> 0x093a }
            java.lang.Object r8 = r8.f7911e     // Catch:{ all -> 0x093a }
            r7.mo8744a(r5, r8)     // Catch:{ all -> 0x093a }
            r2.mo7562a(r5)     // Catch:{ all -> 0x093a }
            int r12 = r12 + 1
            goto L_0x0843
        L_0x0878:
            q.b.a.b.h.b.e r3 = r28.mo8619d()     // Catch:{ IOException -> 0x08ee }
            q.b.a.b.g.e.p7 r5 = r2.mo7778m()     // Catch:{ IOException -> 0x08ee }
            q.b.a.b.g.e.i6 r5 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r5     // Catch:{ IOException -> 0x08ee }
            q.b.a.b.g.e.e1 r5 = (p213q.p217b.p218a.p231b.p251g.p256e.C2412e1) r5     // Catch:{ IOException -> 0x08ee }
            long r2 = r3.mo8390a(r5)     // Catch:{ IOException -> 0x08ee }
            q.b.a.b.h.b.e r5 = r28.mo8619d()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.m r7 = r4.f7471f     // Catch:{ all -> 0x093a }
            if (r7 == 0) goto L_0x08e5
            q.b.a.b.h.b.m r7 = r4.f7471f     // Catch:{ all -> 0x093a }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x093a }
        L_0x0896:
            r8 = r7
            q.b.a.b.h.b.l r8 = (p213q.p217b.p218a.p231b.p259h.p261b.C3023l) r8
            boolean r11 = r8.hasNext()     // Catch:{ all -> 0x093a }
            if (r11 == 0) goto L_0x08b1
            java.lang.Object r8 = r8.next()     // Catch:{ all -> 0x093a }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x093a }
            r11 = r27
            boolean r8 = r11.equals(r8)     // Catch:{ all -> 0x093a }
            if (r8 == 0) goto L_0x08ae
            goto L_0x08e3
        L_0x08ae:
            r27 = r11
            goto L_0x0896
        L_0x08b1:
            q.b.a.b.h.b.a5 r7 = r28.mo8610b()     // Catch:{ all -> 0x093a }
            java.lang.String r8 = r4.f7466a     // Catch:{ all -> 0x093a }
            java.lang.String r11 = r4.f7467b     // Catch:{ all -> 0x093a }
            boolean r7 = r7.mo8271c(r8, r11)     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.e r11 = r28.mo8619d()     // Catch:{ all -> 0x093a }
            long r12 = r28.mo8629s()     // Catch:{ all -> 0x093a }
            java.lang.String r14 = r4.f7466a     // Catch:{ all -> 0x093a }
            r15 = 0
            r16 = 0
            q.b.a.b.h.b.d r8 = r11.mo8398a(r12, r14, r15, r16)     // Catch:{ all -> 0x093a }
            if (r7 == 0) goto L_0x08e5
            long r7 = r8.f7235e     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.g5 r11 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.ka r11 = r11.mo8469l()     // Catch:{ all -> 0x093a }
            java.lang.String r12 = r4.f7466a     // Catch:{ all -> 0x093a }
            int r11 = r11.mo8577c(r12)     // Catch:{ all -> 0x093a }
            long r11 = (long) r11     // Catch:{ all -> 0x093a }
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x08e5
        L_0x08e3:
            r6 = r18
        L_0x08e5:
            boolean r2 = r5.mo8409a(r4, r2, r6)     // Catch:{ all -> 0x093a }
            if (r2 == 0) goto L_0x0907
            r1.f7540l = r9     // Catch:{ all -> 0x093a }
            goto L_0x0907
        L_0x08ee:
            r0 = move-exception
            r3 = r0
            q.b.a.b.h.b.g5 r4 = r1.f7537i     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.b4 r4 = r4.mo8285i()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.e4 r4 = r4.mo8308t()     // Catch:{ all -> 0x093a }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.mo7607v()     // Catch:{ all -> 0x093a }
            java.lang.Object r2 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r2)     // Catch:{ all -> 0x093a }
            r4.mo8434a(r5, r2, r3)     // Catch:{ all -> 0x093a }
        L_0x0907:
            q.b.a.b.h.b.e r2 = r28.mo8619d()     // Catch:{ all -> 0x093a }
            r2.mo8424s()     // Catch:{ all -> 0x093a }
            q.b.a.b.h.b.e r2 = r28.mo8619d()
            r2.mo8430y()
            r28.mo8631u()
            q.b.a.b.h.b.g5 r2 = r1.f7537i
            q.b.a.b.h.b.b4 r2 = r2.mo8285i()
            q.b.a.b.h.b.e4 r2 = r2.mo8312x()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r24
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.mo8433a(r4, r3)
            return
        L_0x093a:
            r0 = move-exception
            r2 = r0
            q.b.a.b.h.b.e r3 = r28.mo8619d()
            r3.mo8430y()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3033l9.mo8617c(q.b.a.b.h.b.n, q.b.a.b.h.b.z9):void");
    }

    /* renamed from: c */
    public final boolean mo8618c(C3189z9 z9Var) {
        return (!C2424ec.m5790b() || !this.f7537i.f7338g.mo8578c(z9Var.f8017e, C3069p.f7741o0)) ? !TextUtils.isEmpty(z9Var.f8018f) || !TextUtils.isEmpty(z9Var.f8034v) : !TextUtils.isEmpty(z9Var.f8018f) || !TextUtils.isEmpty(z9Var.f8038z) || !TextUtils.isEmpty(z9Var.f8034v);
    }

    /* renamed from: d */
    public final C2939e mo8619d() {
        m7076a((C3046m9) this.f7531c);
        return this.f7531c;
    }

    /* renamed from: e */
    public final C2902aa mo8620e() {
        m7076a((C3046m9) this.f7534f);
        return this.f7534f;
    }

    /* renamed from: f */
    public final C3010ja mo8282f() {
        return this.f7537i.f7337f;
    }

    /* renamed from: g */
    public final C3184z4 mo8283g() {
        return this.f7537i.mo8283g();
    }

    /* renamed from: h */
    public final C2283b mo8284h() {
        return this.f7537i.f7345n;
    }

    /* renamed from: i */
    public final C2908b4 mo8285i() {
        return this.f7537i.mo8285i();
    }

    /* renamed from: j */
    public final Context mo8286j() {
        return this.f7537i.f7332a;
    }

    /* renamed from: k */
    public final C3123t9 mo8621k() {
        m7076a((C3046m9) this.f7535g);
        return this.f7535g;
    }

    /* renamed from: l */
    public final C3183z3 mo8622l() {
        return this.f7537i.mo8474q();
    }

    /* renamed from: m */
    public final void mo8623m() {
        if (!this.f7538j) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:89|90) */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r1.f7537i.mo8285i().f7153f.mo8434a("Failed to parse upload URL. Not uploading. appId", p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r3), r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x02d3 */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8624n() {
        /*
            r17 = this;
            r1 = r17
            r17.mo8628r()
            r17.mo8623m()
            r0 = 1
            r1.f7546r = r0
            r2 = 0
            q.b.a.b.h.b.g5 r3 = r1.f7537i     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.ja r3 = r3.f7337f     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.g5 r3 = r1.f7537i     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.t7 r3 = r3.mo8477t()     // Catch:{ all -> 0x0317 }
            java.lang.Boolean r3 = r3.f7869e     // Catch:{ all -> 0x0317 }
            if (r3 != 0) goto L_0x0025
            q.b.a.b.h.b.g5 r0 = r1.f7537i     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.e4 r0 = r0.f7156i     // Catch:{ all -> 0x0317 }
            java.lang.String r3 = "Upload data called on the client side before use of service was decided"
            goto L_0x0055
        L_0x0025:
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0317 }
            if (r3 == 0) goto L_0x0036
            q.b.a.b.h.b.g5 r0 = r1.f7537i     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.e4 r0 = r0.f7153f     // Catch:{ all -> 0x0317 }
            java.lang.String r3 = "Upload called in the client side when service should be used"
            goto L_0x0055
        L_0x0036:
            long r3 = r1.f7540l     // Catch:{ all -> 0x0317 }
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x003f
            goto L_0x0071
        L_0x003f:
            r17.mo8628r()     // Catch:{ all -> 0x0317 }
            java.util.List<java.lang.Long> r3 = r1.f7549u     // Catch:{ all -> 0x0317 }
            if (r3 == 0) goto L_0x0048
            r3 = r0
            goto L_0x0049
        L_0x0048:
            r3 = r2
        L_0x0049:
            if (r3 == 0) goto L_0x005a
            q.b.a.b.h.b.g5 r0 = r1.f7537i     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.e4 r0 = r0.f7161n     // Catch:{ all -> 0x0317 }
            java.lang.String r3 = "Uploading requested multiple times"
        L_0x0055:
            r0.mo8432a(r3)     // Catch:{ all -> 0x0317 }
            goto L_0x0310
        L_0x005a:
            q.b.a.b.h.b.f4 r3 = r17.mo8616c()     // Catch:{ all -> 0x0317 }
            boolean r3 = r3.mo8452s()     // Catch:{ all -> 0x0317 }
            if (r3 != 0) goto L_0x0076
            q.b.a.b.h.b.g5 r0 = r1.f7537i     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.e4 r0 = r0.f7161n     // Catch:{ all -> 0x0317 }
            java.lang.String r3 = "Network not connected, ignoring upload request"
            r0.mo8432a(r3)     // Catch:{ all -> 0x0317 }
        L_0x0071:
            r17.mo8631u()     // Catch:{ all -> 0x0317 }
            goto L_0x0310
        L_0x0076:
            q.b.a.b.h.b.g5 r3 = r1.f7537i     // Catch:{ all -> 0x0317 }
            q.b.a.b.d.q.b r3 = r3.f7345n     // Catch:{ all -> 0x0317 }
            q.b.a.b.d.q.c r3 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r3     // Catch:{ all -> 0x0317 }
            r4 = 0
            if (r3 == 0) goto L_0x0316
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.g5 r3 = r1.f7537i     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.ka r3 = r3.f7338g     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.r3<java.lang.Integer> r9 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7698Q     // Catch:{ all -> 0x0317 }
            int r3 = r3.mo8576b(r4, r9)     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.r3<java.lang.Long> r9 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7718d     // Catch:{ all -> 0x0317 }
            java.lang.Object r9 = r9.mo8702a(r4)     // Catch:{ all -> 0x0317 }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x0317 }
            long r9 = r9.longValue()     // Catch:{ all -> 0x0317 }
            long r9 = r7 - r9
            r11 = r2
        L_0x009c:
            if (r11 >= r3) goto L_0x00a7
            boolean r12 = r1.mo8607a(r9)     // Catch:{ all -> 0x0317 }
            if (r12 == 0) goto L_0x00a7
            int r11 = r11 + 1
            goto L_0x009c
        L_0x00a7:
            q.b.a.b.h.b.g5 r3 = r1.f7537i     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.o4 r3 = r3.mo8470m()     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.s4 r3 = r3.f7622e     // Catch:{ all -> 0x0317 }
            long r9 = r3.mo8708a()     // Catch:{ all -> 0x0317 }
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00ce
            q.b.a.b.h.b.g5 r3 = r1.f7537i     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.b4 r3 = r3.mo8285i()     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.e4 r3 = r3.f7160m     // Catch:{ all -> 0x0317 }
            java.lang.String r5 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r9 = r7 - r9
            long r9 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x0317 }
            java.lang.Long r6 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0317 }
            r3.mo8433a(r5, r6)     // Catch:{ all -> 0x0317 }
        L_0x00ce:
            q.b.a.b.h.b.e r3 = r17.mo8619d()     // Catch:{ all -> 0x0317 }
            java.lang.String r3 = r3.mo8426u()     // Catch:{ all -> 0x0317 }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0317 }
            r9 = -1
            if (r5 != 0) goto L_0x02e5
            long r5 = r1.f7551w     // Catch:{ all -> 0x0317 }
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x00ee
            q.b.a.b.h.b.e r5 = r17.mo8619d()     // Catch:{ all -> 0x0317 }
            long r5 = r5.mo8427v()     // Catch:{ all -> 0x0317 }
            r1.f7551w = r5     // Catch:{ all -> 0x0317 }
        L_0x00ee:
            q.b.a.b.h.b.g5 r5 = r1.f7537i     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.ka r5 = r5.f7338g     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.r3<java.lang.Integer> r6 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7724g     // Catch:{ all -> 0x0317 }
            int r5 = r5.mo8576b(r3, r6)     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.g5 r6 = r1.f7537i     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.ka r6 = r6.f7338g     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.r3<java.lang.Integer> r9 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7726h     // Catch:{ all -> 0x0317 }
            int r6 = r6.mo8576b(r3, r9)     // Catch:{ all -> 0x0317 }
            int r6 = java.lang.Math.max(r2, r6)     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.e r9 = r17.mo8619d()     // Catch:{ all -> 0x0317 }
            java.util.List r5 = r9.mo8394a(r3, r5, r6)     // Catch:{ all -> 0x0317 }
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x0317 }
            if (r6 != 0) goto L_0x030f
            java.util.Iterator r6 = r5.iterator()     // Catch:{ all -> 0x0317 }
        L_0x0118:
            boolean r9 = r6.hasNext()     // Catch:{ all -> 0x0317 }
            if (r9 == 0) goto L_0x0133
            java.lang.Object r9 = r6.next()     // Catch:{ all -> 0x0317 }
            android.util.Pair r9 = (android.util.Pair) r9     // Catch:{ all -> 0x0317 }
            java.lang.Object r9 = r9.first     // Catch:{ all -> 0x0317 }
            q.b.a.b.g.e.e1 r9 = (p213q.p217b.p218a.p231b.p251g.p256e.C2412e1) r9     // Catch:{ all -> 0x0317 }
            java.lang.String r10 = r9.zzw     // Catch:{ all -> 0x0317 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0317 }
            if (r10 != 0) goto L_0x0118
            java.lang.String r6 = r9.zzw     // Catch:{ all -> 0x0317 }
            goto L_0x0134
        L_0x0133:
            r6 = r4
        L_0x0134:
            if (r6 == 0) goto L_0x015f
            r9 = r2
        L_0x0137:
            int r10 = r5.size()     // Catch:{ all -> 0x0317 }
            if (r9 >= r10) goto L_0x015f
            java.lang.Object r10 = r5.get(r9)     // Catch:{ all -> 0x0317 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x0317 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x0317 }
            q.b.a.b.g.e.e1 r10 = (p213q.p217b.p218a.p231b.p251g.p256e.C2412e1) r10     // Catch:{ all -> 0x0317 }
            java.lang.String r11 = r10.zzw     // Catch:{ all -> 0x0317 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0317 }
            if (r11 != 0) goto L_0x015c
            java.lang.String r10 = r10.zzw     // Catch:{ all -> 0x0317 }
            boolean r10 = r10.equals(r6)     // Catch:{ all -> 0x0317 }
            if (r10 != 0) goto L_0x015c
            java.util.List r5 = r5.subList(r2, r9)     // Catch:{ all -> 0x0317 }
            goto L_0x015f
        L_0x015c:
            int r9 = r9 + 1
            goto L_0x0137
        L_0x015f:
            q.b.a.b.g.e.d1 r6 = p213q.p217b.p218a.p231b.p251g.p256e.C2395d1.zzd     // Catch:{ all -> 0x0317 }
            q.b.a.b.g.e.i6$a r6 = r6.mo7768g()     // Catch:{ all -> 0x0317 }
            q.b.a.b.g.e.d1$a r6 = (p213q.p217b.p218a.p231b.p251g.p256e.C2395d1.C2396a) r6     // Catch:{ all -> 0x0317 }
            int r9 = r5.size()     // Catch:{ all -> 0x0317 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0317 }
            int r11 = r5.size()     // Catch:{ all -> 0x0317 }
            r10.<init>(r11)     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.g5 r11 = r1.f7537i     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.ka r11 = r11.f7338g     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.b r11 = r11.f7501c     // Catch:{ all -> 0x0317 }
            java.lang.String r12 = "gaia_collection_enabled"
            java.lang.String r11 = r11.mo8263a(r3, r12)     // Catch:{ all -> 0x0317 }
            java.lang.String r12 = "1"
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0317 }
            r12 = r2
        L_0x0187:
            if (r12 >= r9) goto L_0x0218
            java.lang.Object r13 = r5.get(r12)     // Catch:{ all -> 0x0317 }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x0317 }
            java.lang.Object r13 = r13.first     // Catch:{ all -> 0x0317 }
            q.b.a.b.g.e.e1 r13 = (p213q.p217b.p218a.p231b.p251g.p256e.C2412e1) r13     // Catch:{ all -> 0x0317 }
            q.b.a.b.g.e.i6$a r13 = r13.mo7769h()     // Catch:{ all -> 0x0317 }
            q.b.a.b.g.e.e1$a r13 = (p213q.p217b.p218a.p231b.p251g.p256e.C2412e1.C2413a) r13     // Catch:{ all -> 0x0317 }
            java.lang.Object r14 = r5.get(r12)     // Catch:{ all -> 0x0317 }
            android.util.Pair r14 = (android.util.Pair) r14     // Catch:{ all -> 0x0317 }
            java.lang.Object r14 = r14.second     // Catch:{ all -> 0x0317 }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ all -> 0x0317 }
            r10.add(r14)     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.g5 r14 = r1.f7537i     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.ka r14 = r14.f7338g     // Catch:{ all -> 0x0317 }
            r14.mo8583n()     // Catch:{ all -> 0x0317 }
            r14 = 31000(0x7918, double:1.5316E-319)
            r13.mo7584g(r14)     // Catch:{ all -> 0x0317 }
            r13.mo7558a(r7)     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.g5 r14 = r1.f7537i     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.ja r14 = r14.f7337f     // Catch:{ all -> 0x0317 }
            r13.mo7569b(r2)     // Catch:{ all -> 0x0317 }
            if (r11 != 0) goto L_0x01da
            boolean r14 = r13.f6619g     // Catch:{ all -> 0x0317 }
            if (r14 == 0) goto L_0x01c7
            r13.mo7776k()     // Catch:{ all -> 0x0317 }
            r13.f6619g = r2     // Catch:{ all -> 0x0317 }
        L_0x01c7:
            MessageType r14 = r13.f6618f     // Catch:{ all -> 0x0317 }
            q.b.a.b.g.e.e1 r14 = (p213q.p217b.p218a.p231b.p251g.p256e.C2412e1) r14     // Catch:{ all -> 0x0317 }
            int r15 = r14.zzc     // Catch:{ all -> 0x0317 }
            r16 = 2147483647(0x7fffffff, float:NaN)
            r15 = r15 & r16
            r14.zzc = r15     // Catch:{ all -> 0x0317 }
            q.b.a.b.g.e.e1 r15 = p213q.p217b.p218a.p231b.p251g.p256e.C2412e1.zzaw     // Catch:{ all -> 0x0317 }
            java.lang.String r15 = r15.zzam     // Catch:{ all -> 0x0317 }
            r14.zzam = r15     // Catch:{ all -> 0x0317 }
        L_0x01da:
            q.b.a.b.h.b.g5 r14 = r1.f7537i     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.ka r14 = r14.f7338g     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.r3<java.lang.Boolean> r15 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7711Z     // Catch:{ all -> 0x0317 }
            boolean r14 = r14.mo8578c(r3, r15)     // Catch:{ all -> 0x0317 }
            if (r14 == 0) goto L_0x020f
            q.b.a.b.g.e.p7 r14 = r13.mo7778m()     // Catch:{ all -> 0x0317 }
            q.b.a.b.g.e.i6 r14 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r14     // Catch:{ all -> 0x0317 }
            q.b.a.b.g.e.e1 r14 = (p213q.p217b.p218a.p231b.p251g.p256e.C2412e1) r14     // Catch:{ all -> 0x0317 }
            byte[] r14 = r14.mo8084f()     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.t9 r15 = r17.mo8621k()     // Catch:{ all -> 0x0317 }
            long r14 = r15.mo8732a(r14)     // Catch:{ all -> 0x0317 }
            boolean r0 = r13.f6619g     // Catch:{ all -> 0x0317 }
            if (r0 == 0) goto L_0x0203
            r13.mo7776k()     // Catch:{ all -> 0x0317 }
            r13.f6619g = r2     // Catch:{ all -> 0x0317 }
        L_0x0203:
            MessageType r0 = r13.f6618f     // Catch:{ all -> 0x0317 }
            q.b.a.b.g.e.e1 r0 = (p213q.p217b.p218a.p231b.p251g.p256e.C2412e1) r0     // Catch:{ all -> 0x0317 }
            int r2 = r0.zzd     // Catch:{ all -> 0x0317 }
            r2 = r2 | 32
            r0.zzd = r2     // Catch:{ all -> 0x0317 }
            r0.zzat = r14     // Catch:{ all -> 0x0317 }
        L_0x020f:
            r6.mo7494a(r13)     // Catch:{ all -> 0x0317 }
            int r12 = r12 + 1
            r0 = 1
            r2 = 0
            goto L_0x0187
        L_0x0218:
            q.b.a.b.h.b.g5 r0 = r1.f7537i     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()     // Catch:{ all -> 0x0317 }
            r2 = 2
            boolean r0 = r0.mo8305a(r2)     // Catch:{ all -> 0x0317 }
            if (r0 == 0) goto L_0x0236
            q.b.a.b.h.b.t9 r0 = r17.mo8621k()     // Catch:{ all -> 0x0317 }
            q.b.a.b.g.e.p7 r2 = r6.mo7778m()     // Catch:{ all -> 0x0317 }
            q.b.a.b.g.e.i6 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r2     // Catch:{ all -> 0x0317 }
            q.b.a.b.g.e.d1 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2395d1) r2     // Catch:{ all -> 0x0317 }
            java.lang.String r0 = r0.mo8735a(r2)     // Catch:{ all -> 0x0317 }
            goto L_0x0237
        L_0x0236:
            r0 = r4
        L_0x0237:
            r17.mo8621k()     // Catch:{ all -> 0x0317 }
            q.b.a.b.g.e.p7 r2 = r6.mo7778m()     // Catch:{ all -> 0x0317 }
            q.b.a.b.g.e.i6 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2490i6) r2     // Catch:{ all -> 0x0317 }
            q.b.a.b.g.e.d1 r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2395d1) r2     // Catch:{ all -> 0x0317 }
            byte[] r13 = r2.mo8084f()     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.r3<java.lang.String> r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7744q     // Catch:{ all -> 0x0317 }
            java.lang.Object r2 = r2.mo8702a(r4)     // Catch:{ all -> 0x0317 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0317 }
            java.net.URL r12 = new java.net.URL     // Catch:{ MalformedURLException -> 0x02d3 }
            r12.<init>(r2)     // Catch:{ MalformedURLException -> 0x02d3 }
            boolean r4 = r10.isEmpty()     // Catch:{ MalformedURLException -> 0x02d3 }
            if (r4 != 0) goto L_0x025b
            r4 = 1
            goto L_0x025c
        L_0x025b:
            r4 = 0
        L_0x025c:
            p124p.p126b.p127k.C1061o.m2507a(r4)     // Catch:{ MalformedURLException -> 0x02d3 }
            java.util.List<java.lang.Long> r4 = r1.f7549u     // Catch:{ MalformedURLException -> 0x02d3 }
            if (r4 == 0) goto L_0x0271
            q.b.a.b.h.b.g5 r4 = r1.f7537i     // Catch:{ MalformedURLException -> 0x02d3 }
            q.b.a.b.h.b.b4 r4 = r4.mo8285i()     // Catch:{ MalformedURLException -> 0x02d3 }
            q.b.a.b.h.b.e4 r4 = r4.f7153f     // Catch:{ MalformedURLException -> 0x02d3 }
            java.lang.String r5 = "Set uploading progress before finishing the previous upload"
            r4.mo8432a(r5)     // Catch:{ MalformedURLException -> 0x02d3 }
            goto L_0x0278
        L_0x0271:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x02d3 }
            r4.<init>(r10)     // Catch:{ MalformedURLException -> 0x02d3 }
            r1.f7549u = r4     // Catch:{ MalformedURLException -> 0x02d3 }
        L_0x0278:
            q.b.a.b.h.b.g5 r4 = r1.f7537i     // Catch:{ MalformedURLException -> 0x02d3 }
            q.b.a.b.h.b.o4 r4 = r4.mo8470m()     // Catch:{ MalformedURLException -> 0x02d3 }
            q.b.a.b.h.b.s4 r4 = r4.f7623f     // Catch:{ MalformedURLException -> 0x02d3 }
            r4.mo8709a(r7)     // Catch:{ MalformedURLException -> 0x02d3 }
            java.lang.String r4 = "?"
            if (r9 <= 0) goto L_0x0296
            MessageType r4 = r6.f6618f     // Catch:{ MalformedURLException -> 0x02d3 }
            q.b.a.b.g.e.d1 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2395d1) r4     // Catch:{ MalformedURLException -> 0x02d3 }
            q.b.a.b.g.e.q6<q.b.a.b.g.e.e1> r4 = r4.zzc     // Catch:{ MalformedURLException -> 0x02d3 }
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch:{ MalformedURLException -> 0x02d3 }
            q.b.a.b.g.e.e1 r4 = (p213q.p217b.p218a.p231b.p251g.p256e.C2412e1) r4     // Catch:{ MalformedURLException -> 0x02d3 }
            java.lang.String r4 = r4.zzs     // Catch:{ MalformedURLException -> 0x02d3 }
        L_0x0296:
            q.b.a.b.h.b.g5 r5 = r1.f7537i     // Catch:{ MalformedURLException -> 0x02d3 }
            q.b.a.b.h.b.b4 r5 = r5.mo8285i()     // Catch:{ MalformedURLException -> 0x02d3 }
            q.b.a.b.h.b.e4 r5 = r5.f7161n     // Catch:{ MalformedURLException -> 0x02d3 }
            java.lang.String r6 = "Uploading data. app, uncompressed size, data"
            int r7 = r13.length     // Catch:{ MalformedURLException -> 0x02d3 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ MalformedURLException -> 0x02d3 }
            r5.mo8435a(r6, r4, r7, r0)     // Catch:{ MalformedURLException -> 0x02d3 }
            r0 = 1
            r1.f7545q = r0     // Catch:{ MalformedURLException -> 0x02d3 }
            q.b.a.b.h.b.f4 r10 = r17.mo8616c()     // Catch:{ MalformedURLException -> 0x02d3 }
            q.b.a.b.h.b.n9 r15 = new q.b.a.b.h.b.n9     // Catch:{ MalformedURLException -> 0x02d3 }
            r15.<init>(r1, r3)     // Catch:{ MalformedURLException -> 0x02d3 }
            r10.mo8279c()     // Catch:{ MalformedURLException -> 0x02d3 }
            r10.mo8649m()     // Catch:{ MalformedURLException -> 0x02d3 }
            p124p.p126b.p127k.C1061o.m2524b(r12)     // Catch:{ MalformedURLException -> 0x02d3 }
            p124p.p126b.p127k.C1061o.m2524b(r13)     // Catch:{ MalformedURLException -> 0x02d3 }
            p124p.p126b.p127k.C1061o.m2524b(r15)     // Catch:{ MalformedURLException -> 0x02d3 }
            q.b.a.b.h.b.z4 r0 = r10.mo8283g()     // Catch:{ MalformedURLException -> 0x02d3 }
            q.b.a.b.h.b.j4 r4 = new q.b.a.b.h.b.j4     // Catch:{ MalformedURLException -> 0x02d3 }
            r14 = 0
            r9 = r4
            r11 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ MalformedURLException -> 0x02d3 }
            r0.mo8844b(r4)     // Catch:{ MalformedURLException -> 0x02d3 }
            goto L_0x030f
        L_0x02d3:
            q.b.a.b.h.b.g5 r0 = r1.f7537i     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.e4 r0 = r0.f7153f     // Catch:{ all -> 0x0317 }
            java.lang.String r4 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r3 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r3)     // Catch:{ all -> 0x0317 }
            r0.mo8434a(r4, r3, r2)     // Catch:{ all -> 0x0317 }
            goto L_0x030f
        L_0x02e5:
            r1.f7551w = r9     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.e r0 = r17.mo8619d()     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.r3<java.lang.Long> r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7718d     // Catch:{ all -> 0x0317 }
            java.lang.Object r2 = r2.mo8702a(r4)     // Catch:{ all -> 0x0317 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0317 }
            long r2 = r2.longValue()     // Catch:{ all -> 0x0317 }
            long r7 = r7 - r2
            java.lang.String r0 = r0.mo8392a(r7)     // Catch:{ all -> 0x0317 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0317 }
            if (r2 != 0) goto L_0x030f
            q.b.a.b.h.b.e r2 = r17.mo8619d()     // Catch:{ all -> 0x0317 }
            q.b.a.b.h.b.c4 r0 = r2.mo8413b(r0)     // Catch:{ all -> 0x0317 }
            if (r0 == 0) goto L_0x030f
            r1.mo8602a(r0)     // Catch:{ all -> 0x0317 }
        L_0x030f:
            r2 = 0
        L_0x0310:
            r1.f7546r = r2
            r17.mo8599a()
            return
        L_0x0316:
            throw r4     // Catch:{ all -> 0x0317 }
        L_0x0317:
            r0 = move-exception
            r2 = 0
            r1.f7546r = r2
            r17.mo8599a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3033l9.mo8624n():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8625o() {
        /*
            r11 = this;
            r11.mo8628r()
            r11.mo8623m()
            boolean r0 = r11.f7539k
            if (r0 != 0) goto L_0x01aa
            r0 = 1
            r11.f7539k = r0
            r11.mo8628r()
            q.b.a.b.h.b.g5 r1 = r11.f7537i
            q.b.a.b.h.b.ka r1 = r1.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7737m0
            boolean r1 = r1.mo8574a(r2)
            java.lang.String r2 = "Storage concurrent access okay"
            r3 = 0
            if (r1 == 0) goto L_0x0035
            java.nio.channels.FileLock r1 = r11.f7547s
            if (r1 == 0) goto L_0x0035
            boolean r1 = r1.isValid()
            if (r1 == 0) goto L_0x0035
            q.b.a.b.h.b.g5 r1 = r11.f7537i
            q.b.a.b.h.b.b4 r1 = r1.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7161n
            r1.mo8432a(r2)
            goto L_0x0064
        L_0x0035:
            q.b.a.b.h.b.g5 r1 = r11.f7537i
            android.content.Context r1 = r1.f7332a
            java.io.File r1 = r1.getFilesDir()
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "google_app_measurement.db"
            r4.<init>(r1, r5)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0080, OverlappingFileLockException -> 0x0074 }
            java.lang.String r5 = "rw"
            r1.<init>(r4, r5)     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0080, OverlappingFileLockException -> 0x0074 }
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0080, OverlappingFileLockException -> 0x0074 }
            r11.f7548t = r1     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0080, OverlappingFileLockException -> 0x0074 }
            java.nio.channels.FileLock r1 = r1.tryLock()     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0080, OverlappingFileLockException -> 0x0074 }
            r11.f7547s = r1     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0080, OverlappingFileLockException -> 0x0074 }
            if (r1 == 0) goto L_0x0066
            q.b.a.b.h.b.g5 r1 = r11.f7537i     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0080, OverlappingFileLockException -> 0x0074 }
            q.b.a.b.h.b.b4 r1 = r1.mo8285i()     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0080, OverlappingFileLockException -> 0x0074 }
            q.b.a.b.h.b.e4 r1 = r1.f7161n     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0080, OverlappingFileLockException -> 0x0074 }
            r1.mo8432a(r2)     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0080, OverlappingFileLockException -> 0x0074 }
        L_0x0064:
            r1 = r0
            goto L_0x009b
        L_0x0066:
            q.b.a.b.h.b.g5 r1 = r11.f7537i     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0080, OverlappingFileLockException -> 0x0074 }
            q.b.a.b.h.b.b4 r1 = r1.mo8285i()     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0080, OverlappingFileLockException -> 0x0074 }
            q.b.a.b.h.b.e4 r1 = r1.f7153f     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0080, OverlappingFileLockException -> 0x0074 }
            java.lang.String r2 = "Storage concurrent data access panic"
            r1.mo8432a(r2)     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0080, OverlappingFileLockException -> 0x0074 }
            goto L_0x009a
        L_0x0074:
            r1 = move-exception
            q.b.a.b.h.b.g5 r2 = r11.f7537i
            q.b.a.b.h.b.b4 r2 = r2.mo8285i()
            q.b.a.b.h.b.e4 r2 = r2.f7156i
            java.lang.String r4 = "Storage lock already acquired"
            goto L_0x0097
        L_0x0080:
            r1 = move-exception
            q.b.a.b.h.b.g5 r2 = r11.f7537i
            q.b.a.b.h.b.b4 r2 = r2.mo8285i()
            q.b.a.b.h.b.e4 r2 = r2.f7153f
            java.lang.String r4 = "Failed to access storage lock file"
            goto L_0x0097
        L_0x008c:
            r1 = move-exception
            q.b.a.b.h.b.g5 r2 = r11.f7537i
            q.b.a.b.h.b.b4 r2 = r2.mo8285i()
            q.b.a.b.h.b.e4 r2 = r2.f7153f
            java.lang.String r4 = "Failed to acquire storage lock"
        L_0x0097:
            r2.mo8433a(r4, r1)
        L_0x009a:
            r1 = r3
        L_0x009b:
            if (r1 == 0) goto L_0x01aa
            java.nio.channels.FileChannel r1 = r11.f7548t
            r11.mo8628r()
            r4 = 0
            r2 = 4
            java.lang.String r6 = "Bad channel to read from"
            if (r1 == 0) goto L_0x00e9
            boolean r7 = r1.isOpen()
            if (r7 != 0) goto L_0x00b0
            goto L_0x00e9
        L_0x00b0:
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r2)
            r1.position(r4)     // Catch:{ IOException -> 0x00da }
            int r1 = r1.read(r7)     // Catch:{ IOException -> 0x00da }
            if (r1 == r2) goto L_0x00d2
            r7 = -1
            if (r1 == r7) goto L_0x00f4
            q.b.a.b.h.b.g5 r7 = r11.f7537i     // Catch:{ IOException -> 0x00da }
            q.b.a.b.h.b.b4 r7 = r7.mo8285i()     // Catch:{ IOException -> 0x00da }
            q.b.a.b.h.b.e4 r7 = r7.f7156i     // Catch:{ IOException -> 0x00da }
            java.lang.String r8 = "Unexpected data length. Bytes read"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00da }
            r7.mo8433a(r8, r1)     // Catch:{ IOException -> 0x00da }
            goto L_0x00f4
        L_0x00d2:
            r7.flip()     // Catch:{ IOException -> 0x00da }
            int r1 = r7.getInt()     // Catch:{ IOException -> 0x00da }
            goto L_0x00f5
        L_0x00da:
            r1 = move-exception
            q.b.a.b.h.b.g5 r7 = r11.f7537i
            q.b.a.b.h.b.b4 r7 = r7.mo8285i()
            q.b.a.b.h.b.e4 r7 = r7.f7153f
            java.lang.String r8 = "Failed to read from channel"
            r7.mo8433a(r8, r1)
            goto L_0x00f4
        L_0x00e9:
            q.b.a.b.h.b.g5 r1 = r11.f7537i
            q.b.a.b.h.b.b4 r1 = r1.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7153f
            r1.mo8432a(r6)
        L_0x00f4:
            r1 = r3
        L_0x00f5:
            q.b.a.b.h.b.g5 r7 = r11.f7537i
            q.b.a.b.h.b.u3 r7 = r7.mo8479v()
            r7.mo8373v()
            int r7 = r7.f7884e
            r11.mo8628r()
            if (r1 <= r7) goto L_0x0119
            q.b.a.b.h.b.g5 r0 = r11.f7537i
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7153f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.lang.String r3 = "Panic: can't downgrade version. Previous, current version"
            goto L_0x01a7
        L_0x0119:
            if (r1 >= r7) goto L_0x01aa
            java.nio.channels.FileChannel r8 = r11.f7548t
            r11.mo8628r()
            if (r8 == 0) goto L_0x0174
            boolean r9 = r8.isOpen()
            if (r9 != 0) goto L_0x0129
            goto L_0x0174
        L_0x0129:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r2.putInt(r7)
            r2.flip()
            r8.truncate(r4)     // Catch:{ IOException -> 0x0165 }
            q.b.a.b.h.b.g5 r4 = r11.f7537i     // Catch:{ IOException -> 0x0165 }
            q.b.a.b.h.b.ka r4 = r4.f7338g     // Catch:{ IOException -> 0x0165 }
            q.b.a.b.h.b.r3<java.lang.Boolean> r5 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7763z0     // Catch:{ IOException -> 0x0165 }
            r4.mo8574a(r5)     // Catch:{ IOException -> 0x0165 }
            r8.write(r2)     // Catch:{ IOException -> 0x0165 }
            r8.force(r0)     // Catch:{ IOException -> 0x0165 }
            long r4 = r8.size()     // Catch:{ IOException -> 0x0165 }
            r9 = 4
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x0180
            q.b.a.b.h.b.g5 r2 = r11.f7537i     // Catch:{ IOException -> 0x0165 }
            q.b.a.b.h.b.b4 r2 = r2.mo8285i()     // Catch:{ IOException -> 0x0165 }
            q.b.a.b.h.b.e4 r2 = r2.f7153f     // Catch:{ IOException -> 0x0165 }
            java.lang.String r4 = "Error writing to channel. Bytes written"
            long r5 = r8.size()     // Catch:{ IOException -> 0x0165 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ IOException -> 0x0165 }
            r2.mo8433a(r4, r5)     // Catch:{ IOException -> 0x0165 }
            goto L_0x0180
        L_0x0165:
            r0 = move-exception
            q.b.a.b.h.b.g5 r2 = r11.f7537i
            q.b.a.b.h.b.b4 r2 = r2.mo8285i()
            q.b.a.b.h.b.e4 r2 = r2.f7153f
            java.lang.String r4 = "Failed to write to channel"
            r2.mo8433a(r4, r0)
            goto L_0x017f
        L_0x0174:
            q.b.a.b.h.b.g5 r0 = r11.f7537i
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7153f
            r0.mo8432a(r6)
        L_0x017f:
            r0 = r3
        L_0x0180:
            if (r0 == 0) goto L_0x0195
            q.b.a.b.h.b.g5 r0 = r11.f7537i
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7161n
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.lang.String r3 = "Storage version upgraded. Previous, current version"
            goto L_0x01a7
        L_0x0195:
            q.b.a.b.h.b.g5 r0 = r11.f7537i
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()
            q.b.a.b.h.b.e4 r0 = r0.f7153f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.lang.String r3 = "Storage version upgrade failed. Previous, current version"
        L_0x01a7:
            r0.mo8434a(r3, r1, r2)
        L_0x01aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3033l9.mo8625o():void");
    }

    /* renamed from: p */
    public final C3041m4 mo8626p() {
        C3041m4 m4Var = this.f7532d;
        if (m4Var != null) {
            return m4Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: q */
    public final C2997i9 mo8627q() {
        m7076a((C3046m9) this.f7533e);
        return this.f7533e;
    }

    /* renamed from: r */
    public final void mo8628r() {
        this.f7537i.mo8283g().mo8279c();
    }

    /* renamed from: s */
    public final long mo8629s() {
        if (((C2284c) this.f7537i.f7345n) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            C3063o4 m = this.f7537i.mo8470m();
            m.mo8846n();
            m.mo8279c();
            long a = m.f7626i.mo8708a();
            if (a == 0) {
                a = 1 + ((long) m.mo8287k().mo8814t().nextInt(86400000));
                m.f7626i.mo8709a(a);
            }
            return ((((currentTimeMillis + a) / 1000) / 60) / 60) / 24;
        }
        throw null;
    }

    /* renamed from: t */
    public final boolean mo8630t() {
        mo8628r();
        mo8623m();
        return ((mo8619d().mo8411b("select count(1) > 0 from raw_events", (String[]) null) > 0 ? 1 : (mo8619d().mo8411b("select count(1) > 0 from raw_events", (String[]) null) == 0 ? 0 : -1)) != 0) || !TextUtils.isEmpty(mo8619d().mo8426u());
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018b  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8631u() {
        /*
            r24 = this;
            r0 = r24
            r24.mo8628r()
            r24.mo8623m()
            long r1 = r0.f7540l
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r1 <= 0) goto L_0x0043
            q.b.a.b.h.b.g5 r1 = r0.f7537i
            q.b.a.b.d.q.b r1 = r1.f7345n
            q.b.a.b.d.q.c r1 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r1
            if (r1 == 0) goto L_0x0042
            long r5 = android.os.SystemClock.elapsedRealtime()
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            long r9 = r0.f7540l
            long r5 = r5 - r9
            long r5 = java.lang.Math.abs(r5)
            long r7 = r7 - r5
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x003f
            q.b.a.b.h.b.g5 r1 = r0.f7537i
            q.b.a.b.h.b.b4 r1 = r1.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7161n
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.mo8433a(r3, r2)
            goto L_0x0353
        L_0x003f:
            r0.f7540l = r3
            goto L_0x0043
        L_0x0042:
            throw r2
        L_0x0043:
            q.b.a.b.h.b.g5 r1 = r0.f7537i
            boolean r1 = r1.mo8467e()
            if (r1 == 0) goto L_0x0346
            boolean r1 = r24.mo8630t()
            if (r1 != 0) goto L_0x0053
            goto L_0x0346
        L_0x0053:
            q.b.a.b.h.b.g5 r1 = r0.f7537i
            q.b.a.b.d.q.b r1 = r1.f7345n
            q.b.a.b.d.q.c r1 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r1
            if (r1 == 0) goto L_0x0345
            long r5 = java.lang.System.currentTimeMillis()
            q.b.a.b.h.b.r3<java.lang.Long> r1 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7666A
            java.lang.Object r1 = r1.mo8702a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r7 = r1.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            q.b.a.b.h.b.e r1 = r24.mo8619d()
            java.lang.String r9 = "select count(1) > 0 from raw_events where realtime = 1"
            long r9 = r1.mo8411b(r9, r2)
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x007f
            r1 = 1
            goto L_0x0080
        L_0x007f:
            r1 = 0
        L_0x0080:
            if (r1 != 0) goto L_0x0098
            q.b.a.b.h.b.e r1 = r24.mo8619d()
            java.lang.String r11 = "select count(1) > 0 from queue where has_realtime = 1"
            long r11 = r1.mo8411b(r11, r2)
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0092
            r1 = 1
            goto L_0x0093
        L_0x0092:
            r1 = 0
        L_0x0093:
            if (r1 == 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r1 = 0
            goto L_0x0099
        L_0x0098:
            r1 = 1
        L_0x0099:
            if (r1 == 0) goto L_0x00bb
            q.b.a.b.h.b.g5 r11 = r0.f7537i
            q.b.a.b.h.b.ka r11 = r11.f7338g
            java.lang.String r12 = "debug.firebase.analytics.app"
            java.lang.String r13 = ""
            java.lang.String r11 = r11.mo8573a(r12, r13)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L_0x00b8
            java.lang.String r12 = ".none."
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L_0x00b8
            q.b.a.b.h.b.r3<java.lang.Long> r11 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7754v
            goto L_0x00bd
        L_0x00b8:
            q.b.a.b.h.b.r3<java.lang.Long> r11 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7752u
            goto L_0x00bd
        L_0x00bb:
            q.b.a.b.h.b.r3<java.lang.Long> r11 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7750t
        L_0x00bd:
            java.lang.Object r11 = r11.mo8702a(r2)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            q.b.a.b.h.b.g5 r13 = r0.f7537i
            q.b.a.b.h.b.o4 r13 = r13.mo8470m()
            q.b.a.b.h.b.s4 r13 = r13.f7622e
            long r13 = r13.mo8708a()
            q.b.a.b.h.b.g5 r15 = r0.f7537i
            q.b.a.b.h.b.o4 r15 = r15.mo8470m()
            q.b.a.b.h.b.s4 r15 = r15.f7623f
            long r15 = r15.mo8708a()
            q.b.a.b.h.b.e r10 = r24.mo8619d()
            java.lang.String r9 = "select max(bundle_end_timestamp) from queue"
            long r9 = r10.mo8389a(r9, r2, r3)
            q.b.a.b.h.b.e r0 = r24.mo8619d()
            r18 = r11
            java.lang.String r11 = "select max(timestamp) from raw_events"
            long r11 = r0.mo8389a(r11, r2, r3)
            long r9 = java.lang.Math.max(r9, r11)
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0104
            r7 = r3
            goto L_0x0178
        L_0x0104:
            long r9 = r9 - r5
            long r9 = java.lang.Math.abs(r9)
            long r9 = r5 - r9
            long r13 = r13 - r5
            long r11 = java.lang.Math.abs(r13)
            long r11 = r5 - r11
            long r15 = r15 - r5
            long r13 = java.lang.Math.abs(r15)
            long r5 = r5 - r13
            long r11 = java.lang.Math.max(r11, r5)
            long r7 = r7 + r9
            if (r1 == 0) goto L_0x0129
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0129
            long r0 = java.lang.Math.min(r9, r11)
            long r7 = r0 + r18
        L_0x0129:
            q.b.a.b.h.b.t9 r0 = r24.mo8621k()
            r13 = r18
            boolean r0 = r0.mo8745a(r11, r13)
            if (r0 != 0) goto L_0x0137
            long r7 = r11 + r13
        L_0x0137:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0178
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0178
            r0 = 0
        L_0x0140:
            r1 = 20
            q.b.a.b.h.b.r3<java.lang.Integer> r9 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7670C
            java.lang.Object r9 = r9.mo8702a(r2)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r10 = 0
            int r9 = java.lang.Math.max(r10, r9)
            int r1 = java.lang.Math.min(r1, r9)
            if (r0 >= r1) goto L_0x0176
            r11 = 1
            long r11 = r11 << r0
            q.b.a.b.h.b.r3<java.lang.Long> r1 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7668B
            java.lang.Object r1 = r1.mo8702a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r13 = r1.longValue()
            long r13 = java.lang.Math.max(r3, r13)
            long r13 = r13 * r11
            long r7 = r7 + r13
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0173
            goto L_0x0179
        L_0x0173:
            int r0 = r0 + 1
            goto L_0x0140
        L_0x0176:
            r7 = r3
            goto L_0x0179
        L_0x0178:
            r10 = 0
        L_0x0179:
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x018b
            r0 = r24
            q.b.a.b.h.b.g5 r1 = r0.f7537i
            q.b.a.b.h.b.b4 r1 = r1.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7161n
            java.lang.String r2 = "Next upload time is 0"
            goto L_0x0350
        L_0x018b:
            r0 = r24
            q.b.a.b.h.b.f4 r1 = r24.mo8616c()
            boolean r1 = r1.mo8452s()
            if (r1 != 0) goto L_0x01f0
            q.b.a.b.h.b.g5 r1 = r0.f7537i
            q.b.a.b.h.b.b4 r1 = r1.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7161n
            java.lang.String r2 = "No network"
            r1.mo8432a(r2)
            q.b.a.b.h.b.m4 r1 = r24.mo8626p()
            q.b.a.b.h.b.l9 r2 = r1.f7561a
            r2.mo8623m()
            q.b.a.b.h.b.l9 r2 = r1.f7561a
            q.b.a.b.h.b.z4 r2 = r2.mo8283g()
            r2.mo8279c()
            boolean r2 = r1.f7562b
            if (r2 == 0) goto L_0x01bc
            goto L_0x035a
        L_0x01bc:
            q.b.a.b.h.b.l9 r2 = r1.f7561a
            q.b.a.b.h.b.g5 r2 = r2.f7537i
            android.content.Context r2 = r2.f7332a
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r4 = "android.net.conn.CONNECTIVITY_CHANGE"
            r3.<init>(r4)
            r2.registerReceiver(r1, r3)
            q.b.a.b.h.b.l9 r2 = r1.f7561a
            q.b.a.b.h.b.f4 r2 = r2.mo8616c()
            boolean r2 = r2.mo8452s()
            r1.f7563c = r2
            q.b.a.b.h.b.l9 r2 = r1.f7561a
            q.b.a.b.h.b.b4 r2 = r2.mo8285i()
            q.b.a.b.h.b.e4 r2 = r2.f7161n
            boolean r3 = r1.f7563c
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "Registering connectivity change receiver. Network connected"
            r2.mo8433a(r4, r3)
            r2 = 1
            r1.f7562b = r2
            goto L_0x035a
        L_0x01f0:
            q.b.a.b.h.b.g5 r1 = r0.f7537i
            q.b.a.b.h.b.o4 r1 = r1.mo8470m()
            q.b.a.b.h.b.s4 r1 = r1.f7624g
            long r5 = r1.mo8708a()
            q.b.a.b.h.b.r3<java.lang.Long> r1 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7746r
            java.lang.Object r1 = r1.mo8702a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r11 = r1.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            q.b.a.b.h.b.t9 r1 = r24.mo8621k()
            boolean r1 = r1.mo8745a(r5, r11)
            if (r1 != 0) goto L_0x021b
            long r5 = r5 + r11
            long r7 = java.lang.Math.max(r7, r5)
        L_0x021b:
            q.b.a.b.h.b.m4 r1 = r24.mo8626p()
            r1.mo8644a()
            q.b.a.b.h.b.g5 r1 = r0.f7537i
            q.b.a.b.d.q.b r1 = r1.f7345n
            q.b.a.b.d.q.c r1 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r1
            if (r1 == 0) goto L_0x0344
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r5
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x025c
            q.b.a.b.h.b.r3<java.lang.Long> r1 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7756w
            java.lang.Object r1 = r1.mo8702a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r5 = r1.longValue()
            long r7 = java.lang.Math.max(r3, r5)
            q.b.a.b.h.b.g5 r1 = r0.f7537i
            q.b.a.b.h.b.o4 r1 = r1.mo8470m()
            q.b.a.b.h.b.s4 r1 = r1.f7622e
            q.b.a.b.h.b.g5 r5 = r0.f7537i
            q.b.a.b.d.q.b r5 = r5.f7345n
            q.b.a.b.d.q.c r5 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r5
            if (r5 == 0) goto L_0x025b
            long r5 = java.lang.System.currentTimeMillis()
            r1.mo8709a(r5)
            goto L_0x025c
        L_0x025b:
            throw r2
        L_0x025c:
            q.b.a.b.h.b.g5 r1 = r0.f7537i
            q.b.a.b.h.b.b4 r1 = r1.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7161n
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            java.lang.String r6 = "Upload scheduled in approximately ms"
            r1.mo8433a(r6, r5)
            q.b.a.b.h.b.i9 r1 = r24.mo8627q()
            r1.mo8649m()
            q.b.a.b.h.b.g5 r5 = r1.f7133a
            q.b.a.b.h.b.ja r6 = r5.f7337f
            android.content.Context r5 = r5.f7332a
            boolean r6 = p213q.p217b.p218a.p231b.p259h.p261b.C3173y4.m7486a(r5)
            if (r6 != 0) goto L_0x028b
            q.b.a.b.h.b.b4 r6 = r1.mo8285i()
            q.b.a.b.h.b.e4 r6 = r6.f7160m
            java.lang.String r9 = "Receiver not registered/enabled"
            r6.mo8432a(r9)
        L_0x028b:
            boolean r5 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.m7406a(r5)
            if (r5 != 0) goto L_0x029c
            q.b.a.b.h.b.b4 r5 = r1.mo8285i()
            q.b.a.b.h.b.e4 r5 = r5.f7160m
            java.lang.String r6 = "Service not registered/enabled"
            r5.mo8432a(r6)
        L_0x029c:
            r1.mo8536s()
            q.b.a.b.h.b.b4 r5 = r1.mo8285i()
            q.b.a.b.h.b.e4 r5 = r5.f7161n
            java.lang.Long r6 = java.lang.Long.valueOf(r7)
            java.lang.String r9 = "Scheduling upload, millis"
            r5.mo8433a(r9, r6)
            q.b.a.b.h.b.g5 r5 = r1.f7133a
            q.b.a.b.d.q.b r5 = r5.f7345n
            q.b.a.b.d.q.c r5 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r5
            if (r5 == 0) goto L_0x0343
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r19 = r5 + r7
            q.b.a.b.h.b.r3<java.lang.Long> r5 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7758x
            java.lang.Object r5 = r5.mo8702a(r2)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x02e2
            q.b.a.b.h.b.g r5 = r1.f7416e
            long r5 = r5.f7316c
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x02da
            r9 = 1
            goto L_0x02db
        L_0x02da:
            r9 = r10
        L_0x02db:
            if (r9 != 0) goto L_0x02e2
            q.b.a.b.h.b.g r3 = r1.f7416e
            r3.mo8458a(r7)
        L_0x02e2:
            q.b.a.b.h.b.g5 r3 = r1.f7133a
            q.b.a.b.h.b.ja r4 = r3.f7337f
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r4 < r5) goto L_0x0325
            android.content.Context r2 = r3.f7332a
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurementJobService"
            r3.<init>(r2, r4)
            int r1 = r1.mo8537t()
            android.os.PersistableBundle r4 = new android.os.PersistableBundle
            r4.<init>()
            java.lang.String r5 = "action"
            java.lang.String r6 = "com.google.android.gms.measurement.UPLOAD"
            r4.putString(r5, r6)
            android.app.job.JobInfo$Builder r5 = new android.app.job.JobInfo$Builder
            r5.<init>(r1, r3)
            android.app.job.JobInfo$Builder r1 = r5.setMinimumLatency(r7)
            r3 = 1
            long r5 = r7 << r3
            android.app.job.JobInfo$Builder r1 = r1.setOverrideDeadline(r5)
            android.app.job.JobInfo$Builder r1 = r1.setExtras(r4)
            android.app.job.JobInfo r1 = r1.build()
            java.lang.String r3 = "com.google.android.gms"
            java.lang.String r4 = "UploadAlarm"
            p213q.p217b.p218a.p231b.p251g.p256e.C2528k5.m6084a(r2, r1, r3, r4)
            goto L_0x0342
        L_0x0325:
            android.app.AlarmManager r3 = r1.f7415d
            r18 = 2
            q.b.a.b.h.b.r3<java.lang.Long> r4 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7748s
            java.lang.Object r2 = r4.mo8702a(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            long r21 = java.lang.Math.max(r4, r7)
            android.app.PendingIntent r23 = r1.mo8538u()
            r17 = r3
            r17.setInexactRepeating(r18, r19, r21, r23)
        L_0x0342:
            return
        L_0x0343:
            throw r2
        L_0x0344:
            throw r2
        L_0x0345:
            throw r2
        L_0x0346:
            q.b.a.b.h.b.g5 r1 = r0.f7537i
            q.b.a.b.h.b.b4 r1 = r1.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7161n
            java.lang.String r2 = "Nothing to upload or uploading impossible"
        L_0x0350:
            r1.mo8432a(r2)
        L_0x0353:
            q.b.a.b.h.b.m4 r1 = r24.mo8626p()
            r1.mo8644a()
        L_0x035a:
            q.b.a.b.h.b.i9 r1 = r24.mo8627q()
            r1.mo8536s()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3033l9.mo8631u():void");
    }

    /* renamed from: b */
    public final void mo8612b(C2341a aVar, C2341a aVar2) {
        C1061o.m2507a("_e".equals(aVar.mo7364o()));
        mo8621k();
        String str = "_et";
        C2378c1 b = C3123t9.m7343b((C2340a1) ((C2490i6) aVar.mo7778m()), str);
        if (b.mo7474n()) {
            long j = b.zzf;
            if (j > 0) {
                mo8621k();
                C2378c1 b2 = C3123t9.m7343b((C2340a1) ((C2490i6) aVar2.mo7778m()), str);
                if (b2 != null) {
                    long j2 = b2.zzf;
                    if (j2 > 0) {
                        j += j2;
                    }
                }
                mo8621k().mo8742a(aVar2, str, (Object) Long.valueOf(j));
                mo8621k().mo8742a(aVar, "_fr", (Object) Long.valueOf(1));
            }
        }
    }

    /* renamed from: a */
    public static void m7073a(C2341a aVar, int i, String str) {
        List a = aVar.mo7355a();
        int i2 = 0;
        while (true) {
            String str2 = "_err";
            if (i2 >= a.size()) {
                C2379a s = C2378c1.m5579s();
                s.mo7482a(str2);
                s.mo7480a(Long.valueOf((long) i).longValue());
                C2378c1 c1Var = (C2378c1) ((C2490i6) s.mo7778m());
                C2379a s2 = C2378c1.m5579s();
                s2.mo7482a("_ev");
                s2.mo7483b(str);
                C2378c1 c1Var2 = (C2378c1) ((C2490i6) s2.mo7778m());
                if (aVar.f6619g) {
                    aVar.mo7776k();
                    aVar.f6619g = false;
                }
                C2340a1.m5425a((C2340a1) aVar.f6618f, c1Var);
                if (aVar.f6619g) {
                    aVar.mo7776k();
                    aVar.f6619g = false;
                }
                C2340a1.m5425a((C2340a1) aVar.f6618f, c1Var2);
                return;
            } else if (!str2.equals(((C2378c1) a.get(i2)).zzd)) {
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo8614b(C3047n nVar, C3189z9 z9Var) {
        if (C2442fc.m5827b() && this.f7537i.f7338g.mo8574a(C3069p.f7695O0)) {
            C2968g4 a = C2968g4.m6912a(nVar);
            this.f7537i.mo8473p().mo8785a(a.f7324d, mo8619d().mo8420e(z9Var.f8017e));
            this.f7537i.mo8473p().mo8795a(a, this.f7537i.f7338g.mo8571a(z9Var.f8017e));
            nVar = a.mo8461a();
        }
        mo8604a(nVar, z9Var);
    }

    /* renamed from: a */
    public static void m7074a(C2341a aVar, String str) {
        List a = aVar.mo7355a();
        for (int i = 0; i < a.size(); i++) {
            if (str.equals(((C2378c1) a.get(i)).zzd)) {
                aVar.mo7361b(i);
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo8615b(C3112s9 s9Var, C3189z9 z9Var) {
        mo8628r();
        mo8623m();
        if (mo8618c(z9Var)) {
            if (!z9Var.f8024l) {
                mo8611b(z9Var);
                return;
            }
            if (!"_npa".equals(s9Var.f7851f) || z9Var.f8035w == null) {
                this.f7537i.mo8285i().f7160m.mo8433a("Removing user property", this.f7537i.mo8474q().mo8838c(s9Var.f7851f));
                mo8619d().mo8429x();
                try {
                    mo8611b(z9Var);
                    mo8619d().mo8414b(z9Var.f8017e, s9Var.f7851f);
                    mo8619d().mo8424s();
                    this.f7537i.mo8285i().f7160m.mo8433a("User property removed", this.f7537i.mo8474q().mo8838c(s9Var.f7851f));
                } finally {
                    mo8619d().mo8430y();
                }
            } else {
                this.f7537i.mo8285i().f7160m.mo8432a("Falling back to manifest metadata value for ad personalization");
                if (((C2284c) this.f7537i.f7345n) != null) {
                    C3112s9 s9Var2 = new C3112s9("_npa", System.currentTimeMillis(), Long.valueOf(z9Var.f8035w.booleanValue() ? 1 : 0), "auto");
                    mo8605a(s9Var2, z9Var);
                    return;
                }
                throw null;
            }
        }
    }

    /* renamed from: a */
    public static void m7075a(C2413a aVar) {
        aVar.mo7566b((long) RecyclerView.FOREVER_NS);
        aVar.mo7570c(Long.MIN_VALUE);
        for (int i = 0; i < aVar.mo7597n(); i++) {
            C2340a1 a = aVar.mo7555a(i);
            if (a.zzf < aVar.mo7603r()) {
                aVar.mo7566b(a.zzf);
            }
            if (a.zzf > aVar.mo7604s()) {
                aVar.mo7570c(a.zzf);
            }
        }
    }

    /* renamed from: a */
    public final void mo8601a(C2413a aVar, long j, boolean z) {
        C3134u9 u9Var;
        boolean z2;
        String str = z ? "_se" : "_lte";
        C3134u9 c = mo8619d().mo8416c(aVar.mo7607v(), str);
        if (c == null || c.f7911e == null) {
            String v = aVar.mo7607v();
            if (((C2284c) this.f7537i.f7345n) != null) {
                u9Var = new C3134u9(v, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
            } else {
                throw null;
            }
        } else {
            String v2 = aVar.mo7607v();
            if (((C2284c) this.f7537i.f7345n) != null) {
                u9Var = new C3134u9(v2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) c.f7911e).longValue() + j));
            } else {
                throw null;
            }
        }
        C2485a l = C2484i1.m5926l();
        l.mo7735a(str);
        if (((C2284c) this.f7537i.f7345n) != null) {
            l.mo7734a(System.currentTimeMillis());
            l.mo7736b(((Long) u9Var.f7911e).longValue());
            C2484i1 i1Var = (C2484i1) ((C2490i6) l.mo7778m());
            int a = C3123t9.m7332a(aVar, str);
            if (a >= 0) {
                if (aVar.f6619g) {
                    aVar.mo7776k();
                    aVar.f6619g = false;
                }
                C2412e1.m5657a((C2412e1) aVar.f6618f, a, i1Var);
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (aVar.f6619g) {
                    aVar.mo7776k();
                    aVar.f6619g = false;
                }
                C2412e1.m5661a((C2412e1) aVar.f6618f, i1Var);
            }
            if (j > 0) {
                mo8619d().mo8410a(u9Var);
                this.f7537i.mo8285i().f7161n.mo8434a("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", u9Var.f7911e);
                return;
            }
            return;
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo8613b(C2998ia iaVar, C3189z9 z9Var) {
        C1061o.m2524b(iaVar);
        C1061o.m2528b(iaVar.f7418e);
        C1061o.m2524b(iaVar.f7420g);
        C1061o.m2528b(iaVar.f7420g.f7851f);
        mo8628r();
        mo8623m();
        if (mo8618c(z9Var)) {
            if (!z9Var.f8024l) {
                mo8611b(z9Var);
                return;
            }
            mo8619d().mo8429x();
            try {
                mo8611b(z9Var);
                C2998ia d = mo8619d().mo8418d(iaVar.f7418e, iaVar.f7420g.f7851f);
                if (d != null) {
                    this.f7537i.mo8285i().f7160m.mo8434a("Removing conditional user property", iaVar.f7418e, this.f7537i.mo8474q().mo8838c(iaVar.f7420g.f7851f));
                    mo8619d().mo8419e(iaVar.f7418e, iaVar.f7420g.f7851f);
                    if (d.f7422i) {
                        mo8619d().mo8414b(iaVar.f7418e, iaVar.f7420g.f7851f);
                    }
                    if (iaVar.f7428o != null) {
                        Bundle bundle = null;
                        if (iaVar.f7428o.f7583f != null) {
                            bundle = iaVar.f7428o.f7583f.mo8637b();
                        }
                        Bundle bundle2 = bundle;
                        mo8617c(this.f7537i.mo8473p().mo8782a(iaVar.f7418e, iaVar.f7428o.f7582e, bundle2, d.f7419f, iaVar.f7428o.f7585h), z9Var);
                    }
                } else {
                    this.f7537i.mo8285i().f7156i.mo8434a("Conditional user property doesn't exist", C2908b4.m6745a(iaVar.f7418e), this.f7537i.mo8474q().mo8838c(iaVar.f7420g.f7851f));
                }
                mo8619d().mo8424s();
            } finally {
                mo8619d().mo8430y();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0270  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p213q.p217b.p218a.p231b.p259h.p261b.C2920c4 mo8611b(p213q.p217b.p218a.p231b.p259h.p261b.C3189z9 r10) {
        /*
            r9 = this;
            r9.mo8628r()
            r9.mo8623m()
            p124p.p126b.p127k.C1061o.m2524b(r10)
            java.lang.String r0 = r10.f8017e
            p124p.p126b.p127k.C1061o.m2528b(r0)
            q.b.a.b.h.b.e r0 = r9.mo8619d()
            java.lang.String r1 = r10.f8017e
            q.b.a.b.h.b.c4 r0 = r0.mo8413b(r1)
            q.b.a.b.h.b.g5 r1 = r9.f7537i
            q.b.a.b.h.b.o4 r1 = r1.mo8470m()
            java.lang.String r2 = r10.f8017e
            java.lang.String r1 = r1.mo8665b(r2)
            q.b.a.b.g.e.nb r2 = p213q.p217b.p218a.p231b.p251g.p256e.C2586nb.f6749f
            java.lang.Object r2 = r2.mo7405a()
            q.b.a.b.g.e.qb r2 = (p213q.p217b.p218a.p231b.p251g.p256e.C2640qb) r2
            boolean r2 = r2.mo7958a()
            r3 = 0
            if (r2 == 0) goto L_0x011b
            q.b.a.b.h.b.g5 r2 = r9.f7537i
            q.b.a.b.h.b.ka r2 = r2.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r5 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7753u0
            boolean r2 = r2.mo8574a(r5)
            if (r2 == 0) goto L_0x011b
            if (r0 != 0) goto L_0x005c
            q.b.a.b.h.b.c4 r0 = new q.b.a.b.h.b.c4
            q.b.a.b.h.b.g5 r2 = r9.f7537i
            java.lang.String r5 = r10.f8017e
            r0.<init>(r2, r5)
            q.b.a.b.h.b.g5 r2 = r9.f7537i
            q.b.a.b.h.b.w9 r2 = r2.mo8473p()
            java.lang.String r2 = r2.mo8816v()
            r0.mo8325a(r2)
            r0.mo8341e(r1)
            goto L_0x0076
        L_0x005c:
            java.lang.String r2 = r0.mo8357l()
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0076
            r0.mo8341e(r1)
            q.b.a.b.h.b.g5 r1 = r9.f7537i
            q.b.a.b.h.b.w9 r1 = r1.mo8473p()
            java.lang.String r1 = r1.mo8816v()
            r0.mo8325a(r1)
        L_0x0076:
            java.lang.String r1 = r10.f8018f
            r0.mo8330b(r1)
            java.lang.String r1 = r10.f8034v
            r0.mo8333c(r1)
            boolean r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2424ec.m5790b()
            if (r1 == 0) goto L_0x009b
            q.b.a.b.h.b.g5 r1 = r9.f7537i
            q.b.a.b.h.b.ka r1 = r1.f7338g
            java.lang.String r2 = r0.mo8345g()
            q.b.a.b.h.b.r3<java.lang.Boolean> r5 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7741o0
            boolean r1 = r1.mo8578c(r2, r5)
            if (r1 == 0) goto L_0x009b
            java.lang.String r1 = r10.f8038z
            r0.mo8337d(r1)
        L_0x009b:
            java.lang.String r1 = r10.f8027o
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00a8
            java.lang.String r1 = r10.f8027o
            r0.mo8344f(r1)
        L_0x00a8:
            long r1 = r10.f8021i
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00b1
            r0.mo8336d(r1)
        L_0x00b1:
            java.lang.String r1 = r10.f8019g
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00be
            java.lang.String r1 = r10.f8019g
            r0.mo8347g(r1)
        L_0x00be:
            long r1 = r10.f8026n
            r0.mo8332c(r1)
            java.lang.String r1 = r10.f8020h
            if (r1 == 0) goto L_0x00ca
            r0.mo8350h(r1)
        L_0x00ca:
            long r1 = r10.f8022j
            r0.mo8340e(r1)
            boolean r1 = r10.f8024l
            r0.mo8327a(r1)
            java.lang.String r1 = r10.f8023k
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00e1
            java.lang.String r1 = r10.f8023k
            r0.mo8353i(r1)
        L_0x00e1:
            q.b.a.b.h.b.g5 r1 = r9.f7537i
            q.b.a.b.h.b.ka r1 = r1.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7691M0
            boolean r1 = r1.mo8574a(r2)
            if (r1 != 0) goto L_0x00f2
            long r1 = r10.f8028p
            r0.mo8355j(r1)
        L_0x00f2:
            boolean r1 = r10.f8031s
            r0.mo8331b(r1)
            boolean r1 = r10.f8032t
            r0.mo8334c(r1)
            java.lang.Boolean r1 = r10.f8035w
            r0.mo8324a(r1)
            long r1 = r10.f8036x
            r0.mo8343f(r1)
            q.b.a.b.h.b.g5 r10 = r0.f7184a
            q.b.a.b.h.b.z4 r10 = r10.mo8283g()
            r10.mo8279c()
            boolean r10 = r0.f7181E
            if (r10 == 0) goto L_0x011a
            q.b.a.b.h.b.e r10 = r9.mo8619d()
            r10.mo8401a(r0)
        L_0x011a:
            return r0
        L_0x011b:
            r2 = 1
            if (r0 != 0) goto L_0x0138
            q.b.a.b.h.b.c4 r0 = new q.b.a.b.h.b.c4
            q.b.a.b.h.b.g5 r5 = r9.f7537i
            java.lang.String r6 = r10.f8017e
            r0.<init>(r5, r6)
            q.b.a.b.h.b.g5 r5 = r9.f7537i
            q.b.a.b.h.b.w9 r5 = r5.mo8473p()
            java.lang.String r5 = r5.mo8816v()
            r0.mo8325a(r5)
            r0.mo8341e(r1)
            goto L_0x0152
        L_0x0138:
            java.lang.String r5 = r0.mo8357l()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0154
            r0.mo8341e(r1)
            q.b.a.b.h.b.g5 r1 = r9.f7537i
            q.b.a.b.h.b.w9 r1 = r1.mo8473p()
            java.lang.String r1 = r1.mo8816v()
            r0.mo8325a(r1)
        L_0x0152:
            r1 = r2
            goto L_0x0155
        L_0x0154:
            r1 = 0
        L_0x0155:
            java.lang.String r5 = r10.f8018f
            java.lang.String r6 = r0.mo8351i()
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 != 0) goto L_0x0167
            java.lang.String r1 = r10.f8018f
            r0.mo8330b(r1)
            r1 = r2
        L_0x0167:
            java.lang.String r5 = r10.f8034v
            java.lang.String r6 = r0.mo8354j()
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 != 0) goto L_0x0179
            java.lang.String r1 = r10.f8034v
            r0.mo8333c(r1)
            r1 = r2
        L_0x0179:
            boolean r5 = p213q.p217b.p218a.p231b.p251g.p256e.C2424ec.m5790b()
            if (r5 == 0) goto L_0x01a1
            q.b.a.b.h.b.g5 r5 = r9.f7537i
            q.b.a.b.h.b.ka r5 = r5.f7338g
            java.lang.String r6 = r0.mo8345g()
            q.b.a.b.h.b.r3<java.lang.Boolean> r7 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7741o0
            boolean r5 = r5.mo8578c(r6, r7)
            if (r5 == 0) goto L_0x01a1
            java.lang.String r5 = r10.f8038z
            java.lang.String r6 = r0.mo8356k()
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 != 0) goto L_0x01a1
            java.lang.String r1 = r10.f8038z
            r0.mo8337d(r1)
            r1 = r2
        L_0x01a1:
            java.lang.String r5 = r10.f8027o
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x01bb
            java.lang.String r5 = r10.f8027o
            java.lang.String r6 = r0.mo8358m()
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x01bb
            java.lang.String r1 = r10.f8027o
            r0.mo8344f(r1)
            r1 = r2
        L_0x01bb:
            long r5 = r10.f8021i
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x01cf
            long r7 = r0.mo8364s()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x01cf
            long r5 = r10.f8021i
            r0.mo8336d(r5)
            r1 = r2
        L_0x01cf:
            java.lang.String r5 = r10.f8019g
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x01e9
            java.lang.String r5 = r10.f8019g
            java.lang.String r6 = r0.mo8361p()
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x01e9
            java.lang.String r1 = r10.f8019g
            r0.mo8347g(r1)
            r1 = r2
        L_0x01e9:
            long r5 = r10.f8026n
            long r7 = r0.mo8362q()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x01f9
            long r5 = r10.f8026n
            r0.mo8332c(r5)
            r1 = r2
        L_0x01f9:
            java.lang.String r5 = r10.f8020h
            if (r5 == 0) goto L_0x020d
            java.lang.String r6 = r0.mo8363r()
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x020d
            java.lang.String r1 = r10.f8020h
            r0.mo8350h(r1)
            r1 = r2
        L_0x020d:
            long r5 = r10.f8022j
            long r7 = r0.mo8365t()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x021d
            long r5 = r10.f8022j
            r0.mo8340e(r5)
            r1 = r2
        L_0x021d:
            boolean r5 = r10.f8024l
            boolean r6 = r0.mo8367v()
            if (r5 == r6) goto L_0x022b
            boolean r1 = r10.f8024l
            r0.mo8327a(r1)
            r1 = r2
        L_0x022b:
            java.lang.String r5 = r10.f8023k
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x024c
            java.lang.String r5 = r10.f8023k
            q.b.a.b.h.b.g5 r6 = r0.f7184a
            q.b.a.b.h.b.z4 r6 = r6.mo8283g()
            r6.mo8279c()
            java.lang.String r6 = r0.f7180D
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x024c
            java.lang.String r1 = r10.f8023k
            r0.mo8353i(r1)
            r1 = r2
        L_0x024c:
            q.b.a.b.h.b.g5 r5 = r9.f7537i
            q.b.a.b.h.b.ka r5 = r5.f7338g
            q.b.a.b.h.b.r3<java.lang.Boolean> r6 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7691M0
            boolean r5 = r5.mo8574a(r6)
            if (r5 != 0) goto L_0x0268
            long r5 = r10.f8028p
            long r7 = r0.mo8328b()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x0268
            long r5 = r10.f8028p
            r0.mo8355j(r5)
            r1 = r2
        L_0x0268:
            boolean r5 = r10.f8031s
            boolean r6 = r0.mo8335c()
            if (r5 == r6) goto L_0x0276
            boolean r1 = r10.f8031s
            r0.mo8331b(r1)
            r1 = r2
        L_0x0276:
            boolean r5 = r10.f8032t
            boolean r6 = r0.mo8338d()
            if (r5 == r6) goto L_0x0284
            boolean r1 = r10.f8032t
            r0.mo8334c(r1)
            r1 = r2
        L_0x0284:
            java.lang.Boolean r5 = r10.f8035w
            java.lang.Boolean r6 = r0.mo8339e()
            if (r5 == r6) goto L_0x0292
            java.lang.Boolean r1 = r10.f8035w
            r0.mo8324a(r1)
            r1 = r2
        L_0x0292:
            long r5 = r10.f8036x
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x02a6
            long r3 = r0.mo8366u()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x02a6
            long r3 = r10.f8036x
            r0.mo8343f(r3)
            goto L_0x02a7
        L_0x02a6:
            r2 = r1
        L_0x02a7:
            if (r2 == 0) goto L_0x02b0
            q.b.a.b.h.b.e r10 = r9.mo8619d()
            r10.mo8401a(r0)
        L_0x02b0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3033l9.mo8611b(q.b.a.b.h.b.z9):q.b.a.b.h.b.c4");
    }

    /* renamed from: a */
    public final void mo8604a(C3047n nVar, C3189z9 z9Var) {
        List<C2998ia> list;
        List<C2998ia> list2;
        List<C2998ia> list3;
        C2944e4 e4Var;
        String str;
        Object a;
        String c;
        Object obj;
        C3047n nVar2 = nVar;
        C3189z9 z9Var2 = z9Var;
        C1061o.m2524b(z9Var);
        C1061o.m2528b(z9Var2.f8017e);
        mo8628r();
        mo8623m();
        String str2 = z9Var2.f8017e;
        long j = nVar2.f7585h;
        mo8621k();
        if (C3123t9.m7342a(nVar, z9Var)) {
            if (!z9Var2.f8024l) {
                mo8611b(z9Var2);
                return;
            }
            if (this.f7537i.f7338g.mo8578c(str2, C3069p.f7717c0)) {
                List<String> list4 = z9Var2.f8037y;
                if (list4 != null) {
                    if (list4.contains(nVar2.f7582e)) {
                        Bundle b = nVar2.f7583f.mo8637b();
                        b.putLong("ga_safelisted", 1);
                        C3047n nVar3 = new C3047n(nVar2.f7582e, new C3036m(b), nVar2.f7584g, nVar2.f7585h);
                        nVar2 = nVar3;
                    } else {
                        this.f7537i.mo8285i().f7160m.mo8435a("Dropping non-safelisted event. appId, event name, origin", str2, nVar2.f7582e, nVar2.f7584g);
                        return;
                    }
                }
            }
            mo8619d().mo8429x();
            try {
                C2939e d = mo8619d();
                C1061o.m2528b(str2);
                d.mo8279c();
                d.mo8649m();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i < 0) {
                    d.mo8285i().f7156i.mo8434a("Invalid time querying timed out conditional properties", C2908b4.m6745a(str2), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = d.mo8396a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (C2998ia iaVar : list) {
                    if (iaVar != null) {
                        this.f7537i.mo8285i().f7161n.mo8435a("User property timed out", iaVar.f7418e, this.f7537i.mo8474q().mo8838c(iaVar.f7420g.f7851f), iaVar.f7420g.mo8714a());
                        if (iaVar.f7424k != null) {
                            mo8617c(new C3047n(iaVar.f7424k, j), z9Var2);
                        }
                        mo8619d().mo8419e(str2, iaVar.f7420g.f7851f);
                    }
                }
                C2939e d2 = mo8619d();
                C1061o.m2528b(str2);
                d2.mo8279c();
                d2.mo8649m();
                if (i < 0) {
                    d2.mo8285i().f7156i.mo8434a("Invalid time querying expired conditional properties", C2908b4.m6745a(str2), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = d2.mo8396a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (C2998ia iaVar2 : list2) {
                    if (iaVar2 != null) {
                        this.f7537i.mo8285i().f7161n.mo8435a("User property expired", iaVar2.f7418e, this.f7537i.mo8474q().mo8838c(iaVar2.f7420g.f7851f), iaVar2.f7420g.mo8714a());
                        mo8619d().mo8414b(str2, iaVar2.f7420g.f7851f);
                        if (iaVar2.f7428o != null) {
                            arrayList.add(iaVar2.f7428o);
                        }
                        mo8619d().mo8419e(str2, iaVar2.f7420g.f7851f);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    mo8617c(new C3047n((C3047n) obj2, j), z9Var2);
                }
                C2939e d3 = mo8619d();
                String str3 = nVar2.f7582e;
                C1061o.m2528b(str2);
                C1061o.m2528b(str3);
                d3.mo8279c();
                d3.mo8649m();
                if (i < 0) {
                    d3.mo8285i().f7156i.mo8435a("Invalid time querying triggered conditional properties", C2908b4.m6745a(str2), d3.mo8281e().mo8834a(str3), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = d3.mo8396a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (C2998ia iaVar3 : list3) {
                    if (iaVar3 != null) {
                        C3112s9 s9Var = iaVar3.f7420g;
                        C3134u9 u9Var = r4;
                        C3134u9 u9Var2 = new C3134u9(iaVar3.f7418e, iaVar3.f7419f, s9Var.f7851f, j, s9Var.mo8714a());
                        if (mo8619d().mo8410a(u9Var)) {
                            e4Var = this.f7537i.mo8285i().f7161n;
                            str = "User property triggered";
                            a = iaVar3.f7418e;
                            c = this.f7537i.mo8474q().mo8838c(u9Var.f7909c);
                            obj = u9Var.f7911e;
                        } else {
                            e4Var = this.f7537i.mo8285i().f7153f;
                            str = "Too many active user properties, ignoring";
                            a = C2908b4.m6745a(iaVar3.f7418e);
                            c = this.f7537i.mo8474q().mo8838c(u9Var.f7909c);
                            obj = u9Var.f7911e;
                        }
                        e4Var.mo8435a(str, a, c, obj);
                        if (iaVar3.f7426m != null) {
                            arrayList2.add(iaVar3.f7426m);
                        }
                        iaVar3.f7420g = new C3112s9(u9Var);
                        iaVar3.f7422i = true;
                        mo8619d().mo8408a(iaVar3);
                    }
                }
                mo8617c(nVar2, z9Var2);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj3 = arrayList2.get(i3);
                    i3++;
                    mo8617c(new C3047n((C3047n) obj3, j), z9Var2);
                }
                mo8619d().mo8424s();
            } finally {
                mo8619d().mo8430y();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009b, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x009d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8602a(p213q.p217b.p218a.p231b.p259h.p261b.C2920c4 r11) {
        /*
            r10 = this;
            r10.mo8628r()
            boolean r0 = p213q.p217b.p218a.p231b.p251g.p256e.C2424ec.m5790b()
            if (r0 == 0) goto L_0x0045
            q.b.a.b.h.b.g5 r0 = r10.f7537i
            q.b.a.b.h.b.ka r0 = r0.f7338g
            java.lang.String r1 = r11.mo8345g()
            q.b.a.b.h.b.r3<java.lang.Boolean> r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7741o0
            boolean r0 = r0.mo8578c(r1, r2)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r11.mo8351i()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = r11.mo8356k()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = r11.mo8354j()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0067
            java.lang.String r2 = r11.mo8345g()
            r3 = 204(0xcc, float:2.86E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r10
            r1.mo8600a(r2, r3, r4, r5, r6)
            return
        L_0x0045:
            java.lang.String r0 = r11.mo8351i()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = r11.mo8354j()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0067
            java.lang.String r2 = r11.mo8345g()
            r3 = 204(0xcc, float:2.86E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r10
            r1.mo8600a(r2, r3, r4, r5, r6)
            return
        L_0x0067:
            q.b.a.b.h.b.g5 r0 = r10.f7537i
            q.b.a.b.h.b.ka r0 = r0.f7338g
            r1 = 0
            if (r0 == 0) goto L_0x0184
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = r11.mo8351i()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x00a1
            boolean r3 = p213q.p217b.p218a.p231b.p251g.p256e.C2424ec.m5790b()
            if (r3 == 0) goto L_0x009d
            q.b.a.b.h.b.g5 r3 = r0.f7133a
            q.b.a.b.h.b.ka r3 = r3.f7338g
            java.lang.String r4 = r11.mo8345g()
            q.b.a.b.h.b.r3<java.lang.Boolean> r5 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7741o0
            boolean r3 = r3.mo8578c(r4, r5)
            if (r3 == 0) goto L_0x009d
            java.lang.String r3 = r11.mo8356k()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x00a1
        L_0x009d:
            java.lang.String r3 = r11.mo8354j()
        L_0x00a1:
            q.b.a.b.h.b.r3<java.lang.String> r4 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7720e
            java.lang.Object r4 = r4.mo8702a(r1)
            java.lang.String r4 = (java.lang.String) r4
            android.net.Uri$Builder r4 = r2.scheme(r4)
            q.b.a.b.h.b.r3<java.lang.String> r5 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7722f
            java.lang.Object r5 = r5.mo8702a(r1)
            java.lang.String r5 = (java.lang.String) r5
            android.net.Uri$Builder r4 = r4.encodedAuthority(r5)
            java.lang.String r5 = "config/app/"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r6 = r3.length()
            if (r6 == 0) goto L_0x00ca
            java.lang.String r3 = r5.concat(r3)
            goto L_0x00cf
        L_0x00ca:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r5)
        L_0x00cf:
            android.net.Uri$Builder r3 = r4.path(r3)
            java.lang.String r4 = r11.mo8348h()
            java.lang.String r5 = "app_instance_id"
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r5, r4)
            java.lang.String r4 = "platform"
            java.lang.String r5 = "android"
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r4, r5)
            r0.mo8583n()
            r4 = 31000(0x7918, double:1.5316E-319)
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r4 = "gmp_version"
            r3.appendQueryParameter(r4, r0)
            android.net.Uri r0 = r2.build()
            java.lang.String r0 = r0.toString()
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x016e }
            r5.<init>(r0)     // Catch:{ MalformedURLException -> 0x016e }
            q.b.a.b.h.b.g5 r2 = r10.f7537i     // Catch:{ MalformedURLException -> 0x016e }
            q.b.a.b.h.b.b4 r2 = r2.mo8285i()     // Catch:{ MalformedURLException -> 0x016e }
            q.b.a.b.h.b.e4 r2 = r2.f7161n     // Catch:{ MalformedURLException -> 0x016e }
            java.lang.String r3 = "Fetching remote configuration"
            java.lang.String r4 = r11.mo8345g()     // Catch:{ MalformedURLException -> 0x016e }
            r2.mo8433a(r3, r4)     // Catch:{ MalformedURLException -> 0x016e }
            q.b.a.b.h.b.a5 r2 = r10.mo8610b()     // Catch:{ MalformedURLException -> 0x016e }
            java.lang.String r3 = r11.mo8345g()     // Catch:{ MalformedURLException -> 0x016e }
            q.b.a.b.g.e.v0 r2 = r2.mo8264a(r3)     // Catch:{ MalformedURLException -> 0x016e }
            q.b.a.b.h.b.a5 r3 = r10.mo8610b()     // Catch:{ MalformedURLException -> 0x016e }
            java.lang.String r4 = r11.mo8345g()     // Catch:{ MalformedURLException -> 0x016e }
            r3.mo8279c()     // Catch:{ MalformedURLException -> 0x016e }
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f7132i     // Catch:{ MalformedURLException -> 0x016e }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ MalformedURLException -> 0x016e }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ MalformedURLException -> 0x016e }
            if (r2 == 0) goto L_0x0142
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch:{ MalformedURLException -> 0x016e }
            if (r2 != 0) goto L_0x0142
            p.e.a r1 = new p.e.a     // Catch:{ MalformedURLException -> 0x016e }
            r1.<init>()     // Catch:{ MalformedURLException -> 0x016e }
            java.lang.String r2 = "If-Modified-Since"
            r1.put(r2, r3)     // Catch:{ MalformedURLException -> 0x016e }
        L_0x0142:
            r7 = r1
            r1 = 1
            r10.f7544p = r1     // Catch:{ MalformedURLException -> 0x016e }
            q.b.a.b.h.b.f4 r3 = r10.mo8616c()     // Catch:{ MalformedURLException -> 0x016e }
            java.lang.String r4 = r11.mo8345g()     // Catch:{ MalformedURLException -> 0x016e }
            q.b.a.b.h.b.q9 r8 = new q.b.a.b.h.b.q9     // Catch:{ MalformedURLException -> 0x016e }
            r8.<init>(r10)     // Catch:{ MalformedURLException -> 0x016e }
            r3.mo8279c()     // Catch:{ MalformedURLException -> 0x016e }
            r3.mo8649m()     // Catch:{ MalformedURLException -> 0x016e }
            p124p.p126b.p127k.C1061o.m2524b(r5)     // Catch:{ MalformedURLException -> 0x016e }
            p124p.p126b.p127k.C1061o.m2524b(r8)     // Catch:{ MalformedURLException -> 0x016e }
            q.b.a.b.h.b.z4 r1 = r3.mo8283g()     // Catch:{ MalformedURLException -> 0x016e }
            q.b.a.b.h.b.j4 r9 = new q.b.a.b.h.b.j4     // Catch:{ MalformedURLException -> 0x016e }
            r6 = 0
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ MalformedURLException -> 0x016e }
            r1.mo8844b(r9)     // Catch:{ MalformedURLException -> 0x016e }
            return
        L_0x016e:
            q.b.a.b.h.b.g5 r1 = r10.f7537i
            q.b.a.b.h.b.b4 r1 = r1.mo8285i()
            q.b.a.b.h.b.e4 r1 = r1.f7153f
            java.lang.String r11 = r11.mo8345g()
            java.lang.Object r11 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r11)
            java.lang.String r2 = "Failed to parse config URL. Not fetching. appId"
            r1.mo8434a(r2, r11, r0)
            return
        L_0x0184:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3033l9.mo8602a(q.b.a.b.h.b.c4):void");
    }

    /* renamed from: a */
    public final void mo8605a(C3112s9 s9Var, C3189z9 z9Var) {
        mo8628r();
        mo8623m();
        if (mo8618c(z9Var)) {
            if (!z9Var.f8024l) {
                mo8611b(z9Var);
                return;
            }
            int b = this.f7537i.mo8473p().mo8803b(s9Var.f7851f);
            String str = "_ev";
            int i = 0;
            if (b != 0) {
                this.f7537i.mo8473p();
                String a = C3156w9.m7404a(s9Var.f7851f, 24, true);
                String str2 = s9Var.f7851f;
                if (str2 != null) {
                    i = str2.length();
                }
                this.f7537i.mo8473p().mo8783a(b, str, a, i);
                return;
            }
            int b2 = this.f7537i.mo8473p().mo8804b(s9Var.f7851f, s9Var.mo8714a());
            if (b2 != 0) {
                this.f7537i.mo8473p();
                String a2 = C3156w9.m7404a(s9Var.f7851f, 24, true);
                Object a3 = s9Var.mo8714a();
                if (a3 != null && ((a3 instanceof String) || (a3 instanceof CharSequence))) {
                    i = String.valueOf(a3).length();
                }
                this.f7537i.mo8473p().mo8783a(b2, str, a2, i);
                return;
            }
            Object c = this.f7537i.mo8473p().mo8807c(s9Var.f7851f, s9Var.mo8714a());
            if (c != null) {
                if ("_sid".equals(s9Var.f7851f)) {
                    long j = s9Var.f7852g;
                    String str3 = s9Var.f7855j;
                    long j2 = 0;
                    C3134u9 c2 = mo8619d().mo8416c(z9Var.f8017e, "_sno");
                    if (c2 != null) {
                        Object obj = c2.f7911e;
                        if (obj instanceof Long) {
                            j2 = ((Long) obj).longValue();
                            C3112s9 s9Var2 = new C3112s9("_sno", j, Long.valueOf(j2 + 1), str3);
                            mo8605a(s9Var2, z9Var);
                        }
                    }
                    if (c2 != null) {
                        this.f7537i.mo8285i().f7156i.mo8433a("Retrieved last session number from database does not contain a valid (long) value", c2.f7911e);
                    }
                    C2999j a4 = mo8619d().mo8399a(z9Var.f8017e, "_s");
                    if (a4 != null) {
                        j2 = a4.f7431c;
                        this.f7537i.mo8285i().f7161n.mo8433a("Backfill the session number. Last used session number", Long.valueOf(j2));
                    }
                    C3112s9 s9Var22 = new C3112s9("_sno", j, Long.valueOf(j2 + 1), str3);
                    mo8605a(s9Var22, z9Var);
                }
                C3134u9 u9Var = new C3134u9(z9Var.f8017e, s9Var.f7855j, s9Var.f7851f, s9Var.f7852g, c);
                this.f7537i.mo8285i().f7161n.mo8434a("Setting user property", this.f7537i.mo8474q().mo8838c(u9Var.f7909c), c);
                mo8619d().mo8429x();
                try {
                    mo8611b(z9Var);
                    boolean a5 = mo8619d().mo8410a(u9Var);
                    mo8619d().mo8424s();
                    if (!a5) {
                        this.f7537i.mo8285i().f7153f.mo8434a("Too many unique user properties are set. Ignoring user property", this.f7537i.mo8474q().mo8838c(u9Var.f7909c), u9Var.f7911e);
                        this.f7537i.mo8473p().mo8783a(9, (String) null, (String) null, 0);
                    }
                } finally {
                    mo8619d().mo8430y();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo8603a(C2998ia iaVar, C3189z9 z9Var) {
        C2944e4 e4Var;
        String str;
        Object a;
        String c;
        Object a2;
        C2944e4 e4Var2;
        String str2;
        Object a3;
        String c2;
        Object obj;
        C1061o.m2524b(iaVar);
        C1061o.m2528b(iaVar.f7418e);
        C1061o.m2524b(iaVar.f7419f);
        C1061o.m2524b(iaVar.f7420g);
        C1061o.m2528b(iaVar.f7420g.f7851f);
        mo8628r();
        mo8623m();
        if (mo8618c(z9Var)) {
            if (!z9Var.f8024l) {
                mo8611b(z9Var);
                return;
            }
            C2998ia iaVar2 = new C2998ia(iaVar);
            boolean z = false;
            iaVar2.f7422i = false;
            mo8619d().mo8429x();
            try {
                C2998ia d = mo8619d().mo8418d(iaVar2.f7418e, iaVar2.f7420g.f7851f);
                if (d != null && !d.f7419f.equals(iaVar2.f7419f)) {
                    this.f7537i.mo8285i().f7156i.mo8435a("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f7537i.mo8474q().mo8838c(iaVar2.f7420g.f7851f), iaVar2.f7419f, d.f7419f);
                }
                if (d != null && d.f7422i) {
                    iaVar2.f7419f = d.f7419f;
                    iaVar2.f7421h = d.f7421h;
                    iaVar2.f7425l = d.f7425l;
                    iaVar2.f7423j = d.f7423j;
                    iaVar2.f7426m = d.f7426m;
                    iaVar2.f7422i = d.f7422i;
                    C3112s9 s9Var = new C3112s9(iaVar2.f7420g.f7851f, d.f7420g.f7852g, iaVar2.f7420g.mo8714a(), d.f7420g.f7855j);
                    iaVar2.f7420g = s9Var;
                } else if (TextUtils.isEmpty(iaVar2.f7423j)) {
                    C3112s9 s9Var2 = new C3112s9(iaVar2.f7420g.f7851f, iaVar2.f7421h, iaVar2.f7420g.mo8714a(), iaVar2.f7420g.f7855j);
                    iaVar2.f7420g = s9Var2;
                    iaVar2.f7422i = true;
                    z = true;
                }
                if (iaVar2.f7422i) {
                    C3112s9 s9Var3 = iaVar2.f7420g;
                    C3134u9 u9Var = new C3134u9(iaVar2.f7418e, iaVar2.f7419f, s9Var3.f7851f, s9Var3.f7852g, s9Var3.mo8714a());
                    if (mo8619d().mo8410a(u9Var)) {
                        e4Var2 = this.f7537i.mo8285i().f7160m;
                        str2 = "User property updated immediately";
                        a3 = iaVar2.f7418e;
                        c2 = this.f7537i.mo8474q().mo8838c(u9Var.f7909c);
                        obj = u9Var.f7911e;
                    } else {
                        e4Var2 = this.f7537i.mo8285i().f7153f;
                        str2 = "(2)Too many active user properties, ignoring";
                        a3 = C2908b4.m6745a(iaVar2.f7418e);
                        c2 = this.f7537i.mo8474q().mo8838c(u9Var.f7909c);
                        obj = u9Var.f7911e;
                    }
                    e4Var2.mo8435a(str2, a3, c2, obj);
                    if (z && iaVar2.f7426m != null) {
                        mo8617c(new C3047n(iaVar2.f7426m, iaVar2.f7421h), z9Var);
                    }
                }
                if (mo8619d().mo8408a(iaVar2)) {
                    e4Var = this.f7537i.mo8285i().f7160m;
                    str = "Conditional property added";
                    a = iaVar2.f7418e;
                    c = this.f7537i.mo8474q().mo8838c(iaVar2.f7420g.f7851f);
                    a2 = iaVar2.f7420g.mo8714a();
                } else {
                    e4Var = this.f7537i.mo8285i().f7153f;
                    str = "Too many conditional properties, ignoring";
                    a = C2908b4.m6745a(iaVar2.f7418e);
                    c = this.f7537i.mo8474q().mo8838c(iaVar2.f7420g.f7851f);
                    a2 = iaVar2.f7420g.mo8714a();
                }
                e4Var.mo8435a(str, a, c, a2);
                mo8619d().mo8424s();
            } finally {
                mo8619d().mo8430y();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x012e A[Catch:{ all -> 0x0182, all -> 0x018b }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0181 A[SYNTHETIC, Splitter:B:78:0x0181] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8600a(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12) {
        /*
            r7 = this;
            r7.mo8628r()
            r7.mo8623m()
            p124p.p126b.p127k.C1061o.m2528b(r8)
            r0 = 0
            if (r11 != 0) goto L_0x000e
            byte[] r11 = new byte[r0]     // Catch:{ all -> 0x018b }
        L_0x000e:
            q.b.a.b.h.b.g5 r1 = r7.f7537i     // Catch:{ all -> 0x018b }
            q.b.a.b.h.b.b4 r1 = r1.mo8285i()     // Catch:{ all -> 0x018b }
            q.b.a.b.h.b.e4 r1 = r1.f7161n     // Catch:{ all -> 0x018b }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r11.length     // Catch:{ all -> 0x018b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x018b }
            r1.mo8433a(r2, r3)     // Catch:{ all -> 0x018b }
            q.b.a.b.h.b.e r1 = r7.mo8619d()     // Catch:{ all -> 0x018b }
            r1.mo8429x()     // Catch:{ all -> 0x018b }
            q.b.a.b.h.b.e r1 = r7.mo8619d()     // Catch:{ all -> 0x0182 }
            q.b.a.b.h.b.c4 r1 = r1.mo8413b(r8)     // Catch:{ all -> 0x0182 }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            r4 = 1
            if (r9 == r2) goto L_0x003c
            r2 = 204(0xcc, float:2.86E-43)
            if (r9 == r2) goto L_0x003c
            if (r9 != r3) goto L_0x0040
        L_0x003c:
            if (r10 != 0) goto L_0x0040
            r2 = r4
            goto L_0x0041
        L_0x0040:
            r2 = r0
        L_0x0041:
            if (r1 != 0) goto L_0x0056
            q.b.a.b.h.b.g5 r9 = r7.f7537i     // Catch:{ all -> 0x0182 }
            q.b.a.b.h.b.b4 r9 = r9.mo8285i()     // Catch:{ all -> 0x0182 }
            q.b.a.b.h.b.e4 r9 = r9.f7156i     // Catch:{ all -> 0x0182 }
            java.lang.String r10 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r8 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r8)     // Catch:{ all -> 0x0182 }
            r9.mo8433a(r10, r8)     // Catch:{ all -> 0x0182 }
            goto L_0x0175
        L_0x0056:
            r5 = 404(0x194, float:5.66E-43)
            r6 = 0
            if (r2 != 0) goto L_0x00d5
            if (r9 != r5) goto L_0x005f
            goto L_0x00d5
        L_0x005f:
            q.b.a.b.h.b.g5 r11 = r7.f7537i     // Catch:{ all -> 0x0182 }
            q.b.a.b.d.q.b r11 = r11.f7345n     // Catch:{ all -> 0x0182 }
            q.b.a.b.d.q.c r11 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r11     // Catch:{ all -> 0x0182 }
            if (r11 == 0) goto L_0x00d4
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0182 }
            r1.mo8352i(r11)     // Catch:{ all -> 0x0182 }
            q.b.a.b.h.b.e r11 = r7.mo8619d()     // Catch:{ all -> 0x0182 }
            r11.mo8401a(r1)     // Catch:{ all -> 0x0182 }
            q.b.a.b.h.b.g5 r11 = r7.f7537i     // Catch:{ all -> 0x0182 }
            q.b.a.b.h.b.b4 r11 = r11.mo8285i()     // Catch:{ all -> 0x0182 }
            q.b.a.b.h.b.e4 r11 = r11.f7161n     // Catch:{ all -> 0x0182 }
            java.lang.String r12 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0182 }
            r11.mo8434a(r12, r1, r10)     // Catch:{ all -> 0x0182 }
            q.b.a.b.h.b.a5 r10 = r7.mo8610b()     // Catch:{ all -> 0x0182 }
            r10.mo8279c()     // Catch:{ all -> 0x0182 }
            java.util.Map<java.lang.String, java.lang.String> r10 = r10.f7132i     // Catch:{ all -> 0x0182 }
            r10.put(r8, r6)     // Catch:{ all -> 0x0182 }
            q.b.a.b.h.b.g5 r8 = r7.f7537i     // Catch:{ all -> 0x0182 }
            q.b.a.b.h.b.o4 r8 = r8.mo8470m()     // Catch:{ all -> 0x0182 }
            q.b.a.b.h.b.s4 r8 = r8.f7623f     // Catch:{ all -> 0x0182 }
            q.b.a.b.h.b.g5 r10 = r7.f7537i     // Catch:{ all -> 0x0182 }
            q.b.a.b.d.q.b r10 = r10.f7345n     // Catch:{ all -> 0x0182 }
            q.b.a.b.d.q.c r10 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r10     // Catch:{ all -> 0x0182 }
            if (r10 == 0) goto L_0x00d3
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0182 }
            r8.mo8709a(r10)     // Catch:{ all -> 0x0182 }
            r8 = 503(0x1f7, float:7.05E-43)
            if (r9 == r8) goto L_0x00b3
            r8 = 429(0x1ad, float:6.01E-43)
            if (r9 != r8) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r4 = r0
        L_0x00b3:
            if (r4 == 0) goto L_0x00ce
            q.b.a.b.h.b.g5 r8 = r7.f7537i     // Catch:{ all -> 0x0182 }
            q.b.a.b.h.b.o4 r8 = r8.mo8470m()     // Catch:{ all -> 0x0182 }
            q.b.a.b.h.b.s4 r8 = r8.f7624g     // Catch:{ all -> 0x0182 }
            q.b.a.b.h.b.g5 r9 = r7.f7537i     // Catch:{ all -> 0x0182 }
            q.b.a.b.d.q.b r9 = r9.f7345n     // Catch:{ all -> 0x0182 }
            q.b.a.b.d.q.c r9 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r9     // Catch:{ all -> 0x0182 }
            if (r9 == 0) goto L_0x00cd
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0182 }
            r8.mo8709a(r9)     // Catch:{ all -> 0x0182 }
            goto L_0x00ce
        L_0x00cd:
            throw r6     // Catch:{ all -> 0x0182 }
        L_0x00ce:
            r7.mo8631u()     // Catch:{ all -> 0x0182 }
            goto L_0x0175
        L_0x00d3:
            throw r6     // Catch:{ all -> 0x0182 }
        L_0x00d4:
            throw r6     // Catch:{ all -> 0x0182 }
        L_0x00d5:
            if (r12 == 0) goto L_0x00e0
            java.lang.String r10 = "Last-Modified"
            java.lang.Object r10 = r12.get(r10)     // Catch:{ all -> 0x0182 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x0182 }
            goto L_0x00e1
        L_0x00e0:
            r10 = r6
        L_0x00e1:
            if (r10 == 0) goto L_0x00f0
            int r12 = r10.size()     // Catch:{ all -> 0x0182 }
            if (r12 <= 0) goto L_0x00f0
            java.lang.Object r10 = r10.get(r0)     // Catch:{ all -> 0x0182 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0182 }
            goto L_0x00f1
        L_0x00f0:
            r10 = r6
        L_0x00f1:
            if (r9 == r5) goto L_0x010d
            if (r9 != r3) goto L_0x00f6
            goto L_0x010d
        L_0x00f6:
            q.b.a.b.h.b.a5 r12 = r7.mo8610b()     // Catch:{ all -> 0x0182 }
            boolean r10 = r12.mo8267a(r8, r11, r10)     // Catch:{ all -> 0x0182 }
            if (r10 != 0) goto L_0x0126
            q.b.a.b.h.b.e r8 = r7.mo8619d()     // Catch:{ all -> 0x018b }
        L_0x0104:
            r8.mo8430y()     // Catch:{ all -> 0x018b }
            r7.f7544p = r0
            r7.mo8599a()
            return
        L_0x010d:
            q.b.a.b.h.b.a5 r10 = r7.mo8610b()     // Catch:{ all -> 0x0182 }
            q.b.a.b.g.e.v0 r10 = r10.mo8264a(r8)     // Catch:{ all -> 0x0182 }
            if (r10 != 0) goto L_0x0126
            q.b.a.b.h.b.a5 r10 = r7.mo8610b()     // Catch:{ all -> 0x0182 }
            boolean r10 = r10.mo8267a(r8, r6, r6)     // Catch:{ all -> 0x0182 }
            if (r10 != 0) goto L_0x0126
            q.b.a.b.h.b.e r8 = r7.mo8619d()     // Catch:{ all -> 0x018b }
            goto L_0x0104
        L_0x0126:
            q.b.a.b.h.b.g5 r10 = r7.f7537i     // Catch:{ all -> 0x0182 }
            q.b.a.b.d.q.b r10 = r10.f7345n     // Catch:{ all -> 0x0182 }
            q.b.a.b.d.q.c r10 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r10     // Catch:{ all -> 0x0182 }
            if (r10 == 0) goto L_0x0181
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0182 }
            r1.mo8349h(r2)     // Catch:{ all -> 0x0182 }
            q.b.a.b.h.b.e r10 = r7.mo8619d()     // Catch:{ all -> 0x0182 }
            r10.mo8401a(r1)     // Catch:{ all -> 0x0182 }
            if (r9 != r5) goto L_0x014c
            q.b.a.b.h.b.g5 r9 = r7.f7537i     // Catch:{ all -> 0x0182 }
            q.b.a.b.h.b.b4 r9 = r9.mo8285i()     // Catch:{ all -> 0x0182 }
            q.b.a.b.h.b.e4 r9 = r9.f7158k     // Catch:{ all -> 0x0182 }
            java.lang.String r10 = "Config not found. Using empty config. appId"
            r9.mo8433a(r10, r8)     // Catch:{ all -> 0x0182 }
            goto L_0x0162
        L_0x014c:
            q.b.a.b.h.b.g5 r8 = r7.f7537i     // Catch:{ all -> 0x0182 }
            q.b.a.b.h.b.b4 r8 = r8.mo8285i()     // Catch:{ all -> 0x0182 }
            q.b.a.b.h.b.e4 r8 = r8.f7161n     // Catch:{ all -> 0x0182 }
            java.lang.String r10 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0182 }
            int r11 = r11.length     // Catch:{ all -> 0x0182 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0182 }
            r8.mo8434a(r10, r9, r11)     // Catch:{ all -> 0x0182 }
        L_0x0162:
            q.b.a.b.h.b.f4 r8 = r7.mo8616c()     // Catch:{ all -> 0x0182 }
            boolean r8 = r8.mo8452s()     // Catch:{ all -> 0x0182 }
            if (r8 == 0) goto L_0x00ce
            boolean r8 = r7.mo8630t()     // Catch:{ all -> 0x0182 }
            if (r8 == 0) goto L_0x00ce
            r7.mo8624n()     // Catch:{ all -> 0x0182 }
        L_0x0175:
            q.b.a.b.h.b.e r8 = r7.mo8619d()     // Catch:{ all -> 0x0182 }
            r8.mo8424s()     // Catch:{ all -> 0x0182 }
            q.b.a.b.h.b.e r8 = r7.mo8619d()     // Catch:{ all -> 0x018b }
            goto L_0x0104
        L_0x0181:
            throw r6     // Catch:{ all -> 0x0182 }
        L_0x0182:
            r8 = move-exception
            q.b.a.b.h.b.e r9 = r7.mo8619d()     // Catch:{ all -> 0x018b }
            r9.mo8430y()     // Catch:{ all -> 0x018b }
            throw r8     // Catch:{ all -> 0x018b }
        L_0x018b:
            r8 = move-exception
            r7.f7544p = r0
            r7.mo8599a()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3033l9.mo8600a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* renamed from: a */
    public final boolean mo8608a(C2341a aVar, C2341a aVar2) {
        C1061o.m2507a("_e".equals(aVar.mo7364o()));
        mo8621k();
        C2378c1 b = C3123t9.m7343b((C2340a1) ((C2490i6) aVar.mo7778m()), "_sc");
        String str = null;
        Object obj = b == null ? null : b.zze;
        mo8621k();
        C2378c1 b2 = C3123t9.m7343b((C2340a1) ((C2490i6) aVar2.mo7778m()), "_pc");
        if (b2 != null) {
            str = b2.zze;
        }
        if (str == null || !str.equals(obj)) {
            return false;
        }
        mo8612b(aVar, aVar2);
        return true;
    }

    /* renamed from: a */
    public final void mo8599a() {
        mo8628r();
        if (this.f7544p || this.f7545q || this.f7546r) {
            this.f7537i.mo8285i().f7161n.mo8435a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f7544p), Boolean.valueOf(this.f7545q), Boolean.valueOf(this.f7546r));
            return;
        }
        this.f7537i.mo8285i().f7161n.mo8432a("Stopping uploading service(s)");
        List<Runnable> list = this.f7541m;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            this.f7541m.clear();
        }
    }

    /* renamed from: a */
    public static void m7076a(C3046m9 m9Var) {
        if (m9Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!m9Var.f7581c) {
            String valueOf = String.valueOf(m9Var.getClass());
            StringBuilder sb = new StringBuilder(valueOf.length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:160:0x0449 A[Catch:{ SQLiteException -> 0x01b7, all -> 0x04a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x047d A[Catch:{ SQLiteException -> 0x01b7, all -> 0x04a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0120 A[Catch:{ SQLiteException -> 0x01b7, all -> 0x04a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ca A[Catch:{ SQLiteException -> 0x01b7, all -> 0x04a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x022f A[Catch:{ SQLiteException -> 0x01b7, all -> 0x04a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x023c A[Catch:{ SQLiteException -> 0x01b7, all -> 0x04a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x024b A[Catch:{ SQLiteException -> 0x01b7, all -> 0x04a7 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8606a(p213q.p217b.p218a.p231b.p259h.p261b.C3189z9 r25) {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r6 = "_uwa"
            java.lang.String r0 = "app_id=?"
            r24.mo8628r()
            r24.mo8623m()
            p124p.p126b.p127k.C1061o.m2524b(r25)
            java.lang.String r7 = r2.f8017e
            p124p.p126b.p127k.C1061o.m2528b(r7)
            boolean r7 = r24.mo8618c(r25)
            if (r7 != 0) goto L_0x0023
            return
        L_0x0023:
            q.b.a.b.h.b.e r7 = r24.mo8619d()
            java.lang.String r8 = r2.f8017e
            q.b.a.b.h.b.c4 r7 = r7.mo8413b(r8)
            r8 = 0
            if (r7 == 0) goto L_0x005b
            java.lang.String r10 = r7.mo8351i()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x005b
            java.lang.String r10 = r2.f8018f
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x005b
            r7.mo8349h(r8)
            q.b.a.b.h.b.e r10 = r24.mo8619d()
            r10.mo8401a(r7)
            q.b.a.b.h.b.a5 r7 = r24.mo8610b()
            java.lang.String r10 = r2.f8017e
            r7.mo8279c()
            java.util.Map<java.lang.String, q.b.a.b.g.e.v0> r7 = r7.f7130g
            r7.remove(r10)
        L_0x005b:
            boolean r7 = r2.f8024l
            if (r7 != 0) goto L_0x0063
            r24.mo8611b(r25)
            return
        L_0x0063:
            long r10 = r2.f8029q
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            r12 = 0
            if (r7 != 0) goto L_0x0078
            q.b.a.b.h.b.g5 r7 = r1.f7537i
            q.b.a.b.d.q.b r7 = r7.f7345n
            q.b.a.b.d.q.c r7 = (p213q.p217b.p218a.p231b.p239d.p246q.C2284c) r7
            if (r7 == 0) goto L_0x0077
            long r10 = java.lang.System.currentTimeMillis()
            goto L_0x0078
        L_0x0077:
            throw r12
        L_0x0078:
            q.b.a.b.h.b.g5 r7 = r1.f7537i
            q.b.a.b.h.b.h r7 = r7.mo8478u()
            r7.mo8279c()
            r7.f7369g = r12
            r7.f7370h = r8
            int r7 = r2.f8030r
            r15 = 0
            r14 = 1
            if (r7 == 0) goto L_0x00a5
            if (r7 == r14) goto L_0x00a5
            q.b.a.b.h.b.g5 r13 = r1.f7537i
            q.b.a.b.h.b.b4 r13 = r13.mo8285i()
            q.b.a.b.h.b.e4 r13 = r13.f7156i
            java.lang.String r12 = r2.f8017e
            java.lang.Object r12 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r12)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r14 = "Incorrect app type, assuming installed app. appId, appType"
            r13.mo8434a(r14, r12, r7)
            r7 = r15
        L_0x00a5:
            q.b.a.b.h.b.e r12 = r24.mo8619d()
            r12.mo8429x()
            q.b.a.b.h.b.e r12 = r24.mo8619d()     // Catch:{ all -> 0x04a7 }
            java.lang.String r13 = r2.f8017e     // Catch:{ all -> 0x04a7 }
            java.lang.String r14 = "_npa"
            q.b.a.b.h.b.u9 r12 = r12.mo8416c(r13, r14)     // Catch:{ all -> 0x04a7 }
            if (r12 == 0) goto L_0x00c7
            java.lang.String r13 = "auto"
            java.lang.String r14 = r12.f7908b     // Catch:{ all -> 0x04a7 }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x04a7 }
            if (r13 == 0) goto L_0x00c5
            goto L_0x00c7
        L_0x00c5:
            r9 = 1
            goto L_0x0114
        L_0x00c7:
            java.lang.Boolean r13 = r2.f8035w     // Catch:{ all -> 0x04a7 }
            if (r13 == 0) goto L_0x0101
            q.b.a.b.h.b.s9 r14 = new q.b.a.b.h.b.s9     // Catch:{ all -> 0x04a7 }
            java.lang.String r19 = "_npa"
            java.lang.Boolean r13 = r2.f8035w     // Catch:{ all -> 0x04a7 }
            boolean r13 = r13.booleanValue()     // Catch:{ all -> 0x04a7 }
            if (r13 == 0) goto L_0x00da
            r20 = 1
            goto L_0x00dc
        L_0x00da:
            r20 = r8
        L_0x00dc:
            java.lang.Long r20 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x04a7 }
            java.lang.String r21 = "auto"
            r8 = 1
            r13 = r14
            r8 = r14
            r9 = 1
            r14 = r19
            r15 = r10
            r17 = r20
            r18 = r21
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x04a7 }
            if (r12 == 0) goto L_0x00fd
            java.lang.Object r12 = r12.f7911e     // Catch:{ all -> 0x04a7 }
            java.lang.Long r13 = r8.f7853h     // Catch:{ all -> 0x04a7 }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x04a7 }
            if (r12 != 0) goto L_0x0114
        L_0x00fd:
            r1.mo8605a(r8, r2)     // Catch:{ all -> 0x04a7 }
            goto L_0x0114
        L_0x0101:
            r9 = 1
            if (r12 == 0) goto L_0x0114
            q.b.a.b.h.b.s9 r8 = new q.b.a.b.h.b.s9     // Catch:{ all -> 0x04a7 }
            java.lang.String r14 = "_npa"
            r17 = 0
            java.lang.String r18 = "auto"
            r13 = r8
            r15 = r10
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x04a7 }
            r1.mo8615b(r8, r2)     // Catch:{ all -> 0x04a7 }
        L_0x0114:
            q.b.a.b.h.b.e r8 = r24.mo8619d()     // Catch:{ all -> 0x04a7 }
            java.lang.String r12 = r2.f8017e     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.c4 r8 = r8.mo8413b(r12)     // Catch:{ all -> 0x04a7 }
            if (r8 == 0) goto L_0x01c8
            q.b.a.b.h.b.g5 r12 = r1.f7537i     // Catch:{ all -> 0x04a7 }
            r12.mo8473p()     // Catch:{ all -> 0x04a7 }
            java.lang.String r12 = r2.f8018f     // Catch:{ all -> 0x04a7 }
            java.lang.String r13 = r8.mo8351i()     // Catch:{ all -> 0x04a7 }
            java.lang.String r14 = r2.f8034v     // Catch:{ all -> 0x04a7 }
            java.lang.String r15 = r8.mo8354j()     // Catch:{ all -> 0x04a7 }
            boolean r12 = p213q.p217b.p218a.p231b.p259h.p261b.C3156w9.m7410a(r12, r13, r14, r15)     // Catch:{ all -> 0x04a7 }
            if (r12 == 0) goto L_0x01c8
            q.b.a.b.h.b.g5 r12 = r1.f7537i     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.b4 r12 = r12.mo8285i()     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.e4 r12 = r12.f7156i     // Catch:{ all -> 0x04a7 }
            java.lang.String r13 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r14 = r8.mo8345g()     // Catch:{ all -> 0x04a7 }
            java.lang.Object r14 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r14)     // Catch:{ all -> 0x04a7 }
            r12.mo8433a(r13, r14)     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.e r12 = r24.mo8619d()     // Catch:{ all -> 0x04a7 }
            java.lang.String r8 = r8.mo8345g()     // Catch:{ all -> 0x04a7 }
            r12.mo8649m()     // Catch:{ all -> 0x04a7 }
            r12.mo8279c()     // Catch:{ all -> 0x04a7 }
            p124p.p126b.p127k.C1061o.m2528b(r8)     // Catch:{ all -> 0x04a7 }
            android.database.sqlite.SQLiteDatabase r13 = r12.mo8425t()     // Catch:{ SQLiteException -> 0x01b7 }
            java.lang.String[] r14 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x01b7 }
            r15 = 0
            r14[r15] = r8     // Catch:{ SQLiteException -> 0x01b7 }
            java.lang.String r9 = "events"
            int r9 = r13.delete(r9, r0, r14)     // Catch:{ SQLiteException -> 0x01b7 }
            int r9 = r9 + r15
            java.lang.String r15 = "user_attributes"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b7 }
            int r9 = r9 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b7 }
            int r9 = r9 + r15
            java.lang.String r15 = "apps"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b7 }
            int r9 = r9 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b7 }
            int r9 = r9 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b7 }
            int r9 = r9 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b7 }
            int r9 = r9 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b7 }
            int r9 = r9 + r15
            java.lang.String r15 = "audience_filter_values"
            int r0 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01b7 }
            int r9 = r9 + r0
            if (r9 <= 0) goto L_0x01c7
            q.b.a.b.h.b.b4 r0 = r12.mo8285i()     // Catch:{ SQLiteException -> 0x01b7 }
            q.b.a.b.h.b.e4 r0 = r0.f7161n     // Catch:{ SQLiteException -> 0x01b7 }
            java.lang.String r13 = "Deleted application data. app, records"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ SQLiteException -> 0x01b7 }
            r0.mo8434a(r13, r8, r9)     // Catch:{ SQLiteException -> 0x01b7 }
            goto L_0x01c7
        L_0x01b7:
            r0 = move-exception
            q.b.a.b.h.b.b4 r9 = r12.mo8285i()     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.e4 r9 = r9.f7153f     // Catch:{ all -> 0x04a7 }
            java.lang.String r12 = "Error deleting application data. appId, error"
            java.lang.Object r8 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r8)     // Catch:{ all -> 0x04a7 }
            r9.mo8434a(r12, r8, r0)     // Catch:{ all -> 0x04a7 }
        L_0x01c7:
            r8 = 0
        L_0x01c8:
            if (r8 == 0) goto L_0x0229
            long r12 = r8.mo8362q()     // Catch:{ all -> 0x04a7 }
            r14 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x01e1
            long r12 = r8.mo8362q()     // Catch:{ all -> 0x04a7 }
            long r14 = r2.f8026n     // Catch:{ all -> 0x04a7 }
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x01e1
            r15 = 1
            goto L_0x01e2
        L_0x01e1:
            r15 = 0
        L_0x01e2:
            long r12 = r8.mo8362q()     // Catch:{ all -> 0x04a7 }
            r16 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0201
            java.lang.String r0 = r8.mo8361p()     // Catch:{ all -> 0x04a7 }
            if (r0 == 0) goto L_0x0201
            java.lang.String r0 = r8.mo8361p()     // Catch:{ all -> 0x04a7 }
            java.lang.String r9 = r2.f8019g     // Catch:{ all -> 0x04a7 }
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x04a7 }
            if (r0 != 0) goto L_0x0201
            r0 = 1
            goto L_0x0202
        L_0x0201:
            r0 = 0
        L_0x0202:
            r0 = r0 | r15
            if (r0 == 0) goto L_0x0229
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04a7 }
            r0.<init>()     // Catch:{ all -> 0x04a7 }
            java.lang.String r9 = "_pv"
            java.lang.String r8 = r8.mo8361p()     // Catch:{ all -> 0x04a7 }
            r0.putString(r9, r8)     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.n r8 = new q.b.a.b.h.b.n     // Catch:{ all -> 0x04a7 }
            java.lang.String r14 = "_au"
            q.b.a.b.h.b.m r15 = new q.b.a.b.h.b.m     // Catch:{ all -> 0x04a7 }
            r15.<init>(r0)     // Catch:{ all -> 0x04a7 }
            java.lang.String r16 = "auto"
            r13 = r8
            r9 = 0
            r17 = r10
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x04a7 }
            r1.mo8604a(r8, r2)     // Catch:{ all -> 0x04a7 }
            goto L_0x022a
        L_0x0229:
            r9 = 0
        L_0x022a:
            r24.mo8611b(r25)     // Catch:{ all -> 0x04a7 }
            if (r7 != 0) goto L_0x023c
            q.b.a.b.h.b.e r0 = r24.mo8619d()     // Catch:{ all -> 0x04a7 }
            java.lang.String r8 = r2.f8017e     // Catch:{ all -> 0x04a7 }
            java.lang.String r12 = "_f"
        L_0x0237:
            q.b.a.b.h.b.j r0 = r0.mo8399a(r8, r12)     // Catch:{ all -> 0x04a7 }
            goto L_0x0249
        L_0x023c:
            r8 = 1
            if (r7 != r8) goto L_0x0248
            q.b.a.b.h.b.e r0 = r24.mo8619d()     // Catch:{ all -> 0x04a7 }
            java.lang.String r8 = r2.f8017e     // Catch:{ all -> 0x04a7 }
            java.lang.String r12 = "_v"
            goto L_0x0237
        L_0x0248:
            r0 = 0
        L_0x0249:
            if (r0 != 0) goto L_0x047d
            r12 = 3600000(0x36ee80, double:1.7786363E-317)
            long r14 = r10 / r12
            r16 = 1
            long r14 = r14 + r16
            long r14 = r14 * r12
            java.lang.String r0 = "_dac"
            java.lang.String r8 = "_r"
            java.lang.String r12 = "_c"
            java.lang.String r13 = "_et"
            if (r7 != 0) goto L_0x03d8
            q.b.a.b.h.b.s9 r7 = new q.b.a.b.h.b.s9     // Catch:{ all -> 0x04a7 }
            java.lang.String r16 = "_fot"
            java.lang.Long r17 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x04a7 }
            java.lang.String r18 = "auto"
            r15 = r13
            r13 = r7
            r14 = r16
            r9 = r15
            r15 = r10
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x04a7 }
            r1.mo8605a(r7, r2)     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.g5 r7 = r1.f7537i     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.ka r7 = r7.f7338g     // Catch:{ all -> 0x04a7 }
            java.lang.String r13 = r2.f8018f     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.r3<java.lang.Boolean> r14 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7702S     // Catch:{ all -> 0x04a7 }
            boolean r7 = r7.mo8578c(r13, r14)     // Catch:{ all -> 0x04a7 }
            if (r7 == 0) goto L_0x028f
            r24.mo8628r()     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.g5 r7 = r1.f7537i     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.t4 r7 = r7.f7354w     // Catch:{ all -> 0x04a7 }
            java.lang.String r13 = r2.f8017e     // Catch:{ all -> 0x04a7 }
            r7.mo8716a(r13)     // Catch:{ all -> 0x04a7 }
        L_0x028f:
            r24.mo8628r()     // Catch:{ all -> 0x04a7 }
            r24.mo8623m()     // Catch:{ all -> 0x04a7 }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x04a7 }
            r7.<init>()     // Catch:{ all -> 0x04a7 }
            r13 = 1
            r7.putLong(r12, r13)     // Catch:{ all -> 0x04a7 }
            r7.putLong(r8, r13)     // Catch:{ all -> 0x04a7 }
            r12 = 0
            r7.putLong(r6, r12)     // Catch:{ all -> 0x04a7 }
            r7.putLong(r5, r12)     // Catch:{ all -> 0x04a7 }
            r7.putLong(r4, r12)     // Catch:{ all -> 0x04a7 }
            r7.putLong(r3, r12)     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.g5 r8 = r1.f7537i     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.ka r8 = r8.f7338g     // Catch:{ all -> 0x04a7 }
            java.lang.String r12 = r2.f8017e     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.r3<java.lang.Boolean> r13 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7706U     // Catch:{ all -> 0x04a7 }
            boolean r8 = r8.mo8578c(r12, r13)     // Catch:{ all -> 0x04a7 }
            r12 = 1
            if (r8 == 0) goto L_0x02c3
            r7.putLong(r9, r12)     // Catch:{ all -> 0x04a7 }
        L_0x02c3:
            boolean r8 = r2.f8033u     // Catch:{ all -> 0x04a7 }
            if (r8 == 0) goto L_0x02ca
            r7.putLong(r0, r12)     // Catch:{ all -> 0x04a7 }
        L_0x02ca:
            q.b.a.b.h.b.e r0 = r24.mo8619d()     // Catch:{ all -> 0x04a7 }
            java.lang.String r8 = r2.f8017e     // Catch:{ all -> 0x04a7 }
            p124p.p126b.p127k.C1061o.m2528b(r8)     // Catch:{ all -> 0x04a7 }
            r0.mo8279c()     // Catch:{ all -> 0x04a7 }
            r0.mo8649m()     // Catch:{ all -> 0x04a7 }
            java.lang.String r12 = "first_open_count"
            long r14 = r0.mo8423h(r8, r12)     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.g5 r0 = r1.f7537i     // Catch:{ all -> 0x04a7 }
            android.content.Context r0 = r0.f7332a     // Catch:{ all -> 0x04a7 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x04a7 }
            if (r0 != 0) goto L_0x0303
            q.b.a.b.h.b.g5 r0 = r1.f7537i     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.b4 r0 = r0.mo8285i()     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.e4 r0 = r0.f7153f     // Catch:{ all -> 0x04a7 }
            java.lang.String r3 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.String r4 = r2.f8017e     // Catch:{ all -> 0x04a7 }
            java.lang.Object r4 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r4)     // Catch:{ all -> 0x04a7 }
            r0.mo8433a(r3, r4)     // Catch:{ all -> 0x04a7 }
            r20 = r9
            r3 = r14
        L_0x02ff:
            r8 = 0
            goto L_0x03bc
        L_0x0303:
            q.b.a.b.h.b.g5 r0 = r1.f7537i     // Catch:{ NameNotFoundException -> 0x0313 }
            android.content.Context r0 = r0.f7332a     // Catch:{ NameNotFoundException -> 0x0313 }
            q.b.a.b.d.r.a r0 = p213q.p217b.p218a.p231b.p239d.p248r.C2294b.m5363b(r0)     // Catch:{ NameNotFoundException -> 0x0313 }
            java.lang.String r8 = r2.f8017e     // Catch:{ NameNotFoundException -> 0x0313 }
            r12 = 0
            android.content.pm.PackageInfo r0 = r0.mo7310b(r8, r12)     // Catch:{ NameNotFoundException -> 0x0313 }
            goto L_0x0328
        L_0x0313:
            r0 = move-exception
            q.b.a.b.h.b.g5 r8 = r1.f7537i     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.b4 r8 = r8.mo8285i()     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.e4 r8 = r8.f7153f     // Catch:{ all -> 0x04a7 }
            java.lang.String r12 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.String r13 = r2.f8017e     // Catch:{ all -> 0x04a7 }
            java.lang.Object r13 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r13)     // Catch:{ all -> 0x04a7 }
            r8.mo8434a(r12, r13, r0)     // Catch:{ all -> 0x04a7 }
            r0 = 0
        L_0x0328:
            if (r0 == 0) goto L_0x0377
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x04a7 }
            r16 = 0
            int r8 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r8 == 0) goto L_0x0377
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x04a7 }
            r20 = r9
            long r8 = r0.lastUpdateTime     // Catch:{ all -> 0x04a7 }
            int r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0359
            q.b.a.b.h.b.g5 r0 = r1.f7537i     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.ka r0 = r0.f7338g     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.r3<java.lang.Boolean> r8 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7751t0     // Catch:{ all -> 0x04a7 }
            boolean r0 = r0.mo8574a(r8)     // Catch:{ all -> 0x04a7 }
            if (r0 == 0) goto L_0x0354
            r8 = 0
            int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0357
            r8 = 1
        L_0x0350:
            r7.putLong(r6, r8)     // Catch:{ all -> 0x04a7 }
            goto L_0x0357
        L_0x0354:
            r8 = 1
            goto L_0x0350
        L_0x0357:
            r0 = 0
            goto L_0x035a
        L_0x0359:
            r0 = 1
        L_0x035a:
            q.b.a.b.h.b.s9 r6 = new q.b.a.b.h.b.s9     // Catch:{ all -> 0x04a7 }
            java.lang.String r8 = "_fi"
            if (r0 == 0) goto L_0x0363
            r12 = 1
            goto L_0x0365
        L_0x0363:
            r12 = 0
        L_0x0365:
            java.lang.Long r17 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x04a7 }
            java.lang.String r18 = "auto"
            r13 = r6
            r22 = r14
            r14 = r8
            r15 = r10
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x04a7 }
            r1.mo8605a(r6, r2)     // Catch:{ all -> 0x04a7 }
            goto L_0x037b
        L_0x0377:
            r20 = r9
            r22 = r14
        L_0x037b:
            q.b.a.b.h.b.g5 r0 = r1.f7537i     // Catch:{ NameNotFoundException -> 0x038b }
            android.content.Context r0 = r0.f7332a     // Catch:{ NameNotFoundException -> 0x038b }
            q.b.a.b.d.r.a r0 = p213q.p217b.p218a.p231b.p239d.p248r.C2294b.m5363b(r0)     // Catch:{ NameNotFoundException -> 0x038b }
            java.lang.String r6 = r2.f8017e     // Catch:{ NameNotFoundException -> 0x038b }
            r8 = 0
            android.content.pm.ApplicationInfo r12 = r0.mo7308a(r6, r8)     // Catch:{ NameNotFoundException -> 0x038b }
            goto L_0x03a0
        L_0x038b:
            r0 = move-exception
            q.b.a.b.h.b.g5 r6 = r1.f7537i     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.b4 r6 = r6.mo8285i()     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.e4 r6 = r6.f7153f     // Catch:{ all -> 0x04a7 }
            java.lang.String r8 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.String r9 = r2.f8017e     // Catch:{ all -> 0x04a7 }
            java.lang.Object r9 = p213q.p217b.p218a.p231b.p259h.p261b.C2908b4.m6745a(r9)     // Catch:{ all -> 0x04a7 }
            r6.mo8434a(r8, r9, r0)     // Catch:{ all -> 0x04a7 }
            r12 = 0
        L_0x03a0:
            if (r12 == 0) goto L_0x03b8
            int r0 = r12.flags     // Catch:{ all -> 0x04a7 }
            r6 = 1
            r0 = r0 & r6
            if (r0 == 0) goto L_0x03ad
            r8 = 1
            r7.putLong(r4, r8)     // Catch:{ all -> 0x04a7 }
        L_0x03ad:
            int r0 = r12.flags     // Catch:{ all -> 0x04a7 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x03b8
            r8 = 1
            r7.putLong(r3, r8)     // Catch:{ all -> 0x04a7 }
        L_0x03b8:
            r3 = r22
            goto L_0x02ff
        L_0x03bc:
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x03c3
            r7.putLong(r5, r3)     // Catch:{ all -> 0x04a7 }
        L_0x03c3:
            q.b.a.b.h.b.n r0 = new q.b.a.b.h.b.n     // Catch:{ all -> 0x04a7 }
            java.lang.String r14 = "_f"
            q.b.a.b.h.b.m r15 = new q.b.a.b.h.b.m     // Catch:{ all -> 0x04a7 }
            r15.<init>(r7)     // Catch:{ all -> 0x04a7 }
            java.lang.String r16 = "auto"
            r13 = r0
            r17 = r10
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x04a7 }
            r1.mo8614b(r0, r2)     // Catch:{ all -> 0x04a7 }
            goto L_0x0439
        L_0x03d8:
            r20 = r13
            r3 = 1
            if (r7 != r3) goto L_0x0439
            q.b.a.b.h.b.s9 r3 = new q.b.a.b.h.b.s9     // Catch:{ all -> 0x04a7 }
            java.lang.String r4 = "_fvt"
            java.lang.Long r17 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x04a7 }
            java.lang.String r18 = "auto"
            r13 = r3
            r14 = r4
            r15 = r10
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x04a7 }
            r1.mo8605a(r3, r2)     // Catch:{ all -> 0x04a7 }
            r24.mo8628r()     // Catch:{ all -> 0x04a7 }
            r24.mo8623m()     // Catch:{ all -> 0x04a7 }
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x04a7 }
            r3.<init>()     // Catch:{ all -> 0x04a7 }
            r4 = 1
            r3.putLong(r12, r4)     // Catch:{ all -> 0x04a7 }
            r3.putLong(r8, r4)     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.g5 r4 = r1.f7537i     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.ka r4 = r4.f7338g     // Catch:{ all -> 0x04a7 }
            java.lang.String r5 = r2.f8017e     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.r3<java.lang.Boolean> r6 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7706U     // Catch:{ all -> 0x04a7 }
            boolean r4 = r4.mo8578c(r5, r6)     // Catch:{ all -> 0x04a7 }
            if (r4 == 0) goto L_0x0419
            r4 = r20
            r5 = 1
            r3.putLong(r4, r5)     // Catch:{ all -> 0x04a7 }
            goto L_0x041d
        L_0x0419:
            r4 = r20
            r5 = 1
        L_0x041d:
            boolean r7 = r2.f8033u     // Catch:{ all -> 0x04a7 }
            if (r7 == 0) goto L_0x0424
            r3.putLong(r0, r5)     // Catch:{ all -> 0x04a7 }
        L_0x0424:
            q.b.a.b.h.b.n r0 = new q.b.a.b.h.b.n     // Catch:{ all -> 0x04a7 }
            java.lang.String r14 = "_v"
            q.b.a.b.h.b.m r15 = new q.b.a.b.h.b.m     // Catch:{ all -> 0x04a7 }
            r15.<init>(r3)     // Catch:{ all -> 0x04a7 }
            java.lang.String r16 = "auto"
            r13 = r0
            r17 = r10
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x04a7 }
            r1.mo8614b(r0, r2)     // Catch:{ all -> 0x04a7 }
            goto L_0x043b
        L_0x0439:
            r4 = r20
        L_0x043b:
            q.b.a.b.h.b.g5 r0 = r1.f7537i     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.ka r0 = r0.f7338g     // Catch:{ all -> 0x04a7 }
            java.lang.String r3 = r2.f8017e     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.r3<java.lang.Boolean> r5 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7707V     // Catch:{ all -> 0x04a7 }
            boolean r0 = r0.mo8578c(r3, r5)     // Catch:{ all -> 0x04a7 }
            if (r0 != 0) goto L_0x0498
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04a7 }
            r0.<init>()     // Catch:{ all -> 0x04a7 }
            r5 = 1
            r0.putLong(r4, r5)     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.g5 r3 = r1.f7537i     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.ka r3 = r3.f7338g     // Catch:{ all -> 0x04a7 }
            java.lang.String r4 = r2.f8017e     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.r3<java.lang.Boolean> r5 = p213q.p217b.p218a.p231b.p259h.p261b.C3069p.f7706U     // Catch:{ all -> 0x04a7 }
            boolean r3 = r3.mo8578c(r4, r5)     // Catch:{ all -> 0x04a7 }
            if (r3 == 0) goto L_0x0468
            java.lang.String r3 = "_fr"
            r4 = 1
            r0.putLong(r3, r4)     // Catch:{ all -> 0x04a7 }
        L_0x0468:
            q.b.a.b.h.b.n r3 = new q.b.a.b.h.b.n     // Catch:{ all -> 0x04a7 }
            java.lang.String r14 = "_e"
            q.b.a.b.h.b.m r15 = new q.b.a.b.h.b.m     // Catch:{ all -> 0x04a7 }
            r15.<init>(r0)     // Catch:{ all -> 0x04a7 }
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r10
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x04a7 }
        L_0x0479:
            r1.mo8614b(r3, r2)     // Catch:{ all -> 0x04a7 }
            goto L_0x0498
        L_0x047d:
            boolean r0 = r2.f8025m     // Catch:{ all -> 0x04a7 }
            if (r0 == 0) goto L_0x0498
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04a7 }
            r0.<init>()     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.n r3 = new q.b.a.b.h.b.n     // Catch:{ all -> 0x04a7 }
            java.lang.String r14 = "_cd"
            q.b.a.b.h.b.m r15 = new q.b.a.b.h.b.m     // Catch:{ all -> 0x04a7 }
            r15.<init>(r0)     // Catch:{ all -> 0x04a7 }
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r10
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x04a7 }
            goto L_0x0479
        L_0x0498:
            q.b.a.b.h.b.e r0 = r24.mo8619d()     // Catch:{ all -> 0x04a7 }
            r0.mo8424s()     // Catch:{ all -> 0x04a7 }
            q.b.a.b.h.b.e r0 = r24.mo8619d()
            r0.mo8430y()
            return
        L_0x04a7:
            r0 = move-exception
            q.b.a.b.h.b.e r2 = r24.mo8619d()
            r2.mo8430y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3033l9.mo8606a(q.b.a.b.h.b.z9):void");
    }
}
