package p213q.p217b.p317d.p322h.p323e.p326k;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p270l.C3250f0;
import p213q.p217b.p218a.p231b.p270l.C3253h;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p213q.p217b.p218a.p231b.p270l.C3257j;
import p213q.p217b.p218a.p231b.p270l.C3259k;
import p213q.p217b.p317d.p322h.p323e.C3912a;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p322h.p323e.p324i.C3922a;
import p213q.p217b.p317d.p322h.p323e.p327l.C4010b;
import p213q.p217b.p317d.p322h.p323e.p327l.C4010b.C4012b;
import p213q.p217b.p317d.p322h.p323e.p328m.C4043b;
import p213q.p217b.p317d.p322h.p323e.p328m.C4043b.C4045b;
import p213q.p217b.p317d.p322h.p323e.p328m.C4052f;
import p213q.p217b.p317d.p322h.p323e.p328m.C4052f.C4054b;
import p213q.p217b.p317d.p322h.p323e.p328m.C4055g;
import p213q.p217b.p317d.p322h.p323e.p328m.C4058i.C4060b;
import p213q.p217b.p317d.p322h.p323e.p328m.C4085t.C4087b;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d;
import p213q.p217b.p317d.p322h.p323e.p330n.C4129c;
import p213q.p217b.p317d.p322h.p323e.p331o.C4137g;
import p213q.p217b.p317d.p322h.p323e.p331o.C4138h;
import p213q.p217b.p317d.p322h.p323e.p332p.C4140b;
import p213q.p217b.p317d.p322h.p323e.p332p.C4142c;
import p213q.p217b.p317d.p322h.p323e.p332p.C4144d;
import p213q.p217b.p317d.p322h.p323e.p333q.C4145a;
import p213q.p217b.p317d.p322h.p323e.p333q.C4146b;
import p213q.p217b.p317d.p322h.p323e.p333q.C4146b.C4147a;
import p213q.p217b.p317d.p322h.p323e.p333q.C4146b.C4148b;
import p213q.p217b.p317d.p322h.p323e.p333q.C4146b.C4149c;
import p213q.p217b.p317d.p322h.p323e.p333q.p334c.C4153c;
import p213q.p217b.p317d.p322h.p323e.p336r.C4162c;
import p213q.p217b.p317d.p322h.p323e.p337s.C4168e;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4173b;
import p213q.p217b.p317d.p322h.p323e.p340t.C4184a;
import p213q.p217b.p317d.p322h.p323e.p340t.C4186c;
import p213q.p217b.p317d.p322h.p323e.p340t.C4187d;
import p213q.p217b.p317d.p322h.p323e.p340t.C4188e;
import p213q.p217b.p317d.p322h.p323e.p341u.C4189a;

/* renamed from: q.b.d.h.e.k.t */
public class C3975t {

    /* renamed from: A */
    public static final Comparator<File> f9710A = new C3978c();

    /* renamed from: B */
    public static final Comparator<File> f9711B = new C3979d();

    /* renamed from: C */
    public static final Pattern f9712C = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");

    /* renamed from: D */
    public static final Map<String, String> f9713D = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");

    /* renamed from: E */
    public static final String[] f9714E = {"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};

    /* renamed from: x */
    public static final FilenameFilter f9715x = new C3976a("BeginSession");

    /* renamed from: y */
    public static final FilenameFilter f9716y = C3958l.f9659a;

    /* renamed from: z */
    public static final FilenameFilter f9717z = new C3977b();

    /* renamed from: a */
    public final Context f9718a;

    /* renamed from: b */
    public final C3959l0 f9719b;

    /* renamed from: c */
    public final C3950h0 f9720c;

    /* renamed from: d */
    public final C4001y0 f9721d;

    /* renamed from: e */
    public final C3948h f9722e;

    /* renamed from: f */
    public final C4129c f9723f;

    /* renamed from: g */
    public final C3970q0 f9724g;

    /* renamed from: h */
    public final C4138h f9725h;

    /* renamed from: i */
    public final C3932b f9726i;

    /* renamed from: j */
    public final C4148b f9727j;

    /* renamed from: k */
    public final C3986k f9728k;

    /* renamed from: l */
    public final C4010b f9729l;

    /* renamed from: m */
    public final C4145a f9730m;

    /* renamed from: n */
    public final C4147a f9731n;

    /* renamed from: o */
    public final C3912a f9732o;

    /* renamed from: p */
    public final C4187d f9733p;

    /* renamed from: q */
    public final String f9734q;

    /* renamed from: r */
    public final C3922a f9735r;

    /* renamed from: s */
    public final C3997w0 f9736s;

    /* renamed from: t */
    public C3956k0 f9737t;

    /* renamed from: u */
    public C3257j<Boolean> f9738u = new C3257j<>();

    /* renamed from: v */
    public C3257j<Boolean> f9739v = new C3257j<>();

    /* renamed from: w */
    public C3257j<Void> f9740w = new C3257j<>();

    /* renamed from: q.b.d.h.e.k.t$a */
    public class C3976a extends C3984i {
        public C3976a(String str) {
            super(str);
        }

        public boolean accept(File file, String str) {
            return super.accept(file, str) && str.endsWith(".cls");
        }
    }

    /* renamed from: q.b.d.h.e.k.t$b */
    public class C3977b implements FilenameFilter {
        public boolean accept(File file, String str) {
            return str.length() == 39 && str.endsWith(".cls");
        }
    }

    /* renamed from: q.b.d.h.e.k.t$c */
    public class C3978c implements Comparator<File> {
        public int compare(Object obj, Object obj2) {
            return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    }

    /* renamed from: q.b.d.h.e.k.t$d */
    public class C3979d implements Comparator<File> {
        public int compare(Object obj, Object obj2) {
            return ((File) obj).getName().compareTo(((File) obj2).getName());
        }
    }

    /* renamed from: q.b.d.h.e.k.t$e */
    public class C3980e implements Callable<C3255i<Void>> {

        /* renamed from: e */
        public final /* synthetic */ Date f9741e;

        /* renamed from: f */
        public final /* synthetic */ Throwable f9742f;

        /* renamed from: g */
        public final /* synthetic */ Thread f9743g;

        /* renamed from: h */
        public final /* synthetic */ C4168e f9744h;

        public C3980e(Date date, Throwable th, Thread thread, C4168e eVar) {
            this.f9741e = date;
            this.f9742f = th;
            this.f9743g = thread;
            this.f9744h = eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:126:0x03a8 A[Catch:{ all -> 0x038c }] */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x0411  */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x0417  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call() {
            /*
                r29 = this;
                r1 = r29
                q.b.d.h.e.k.t r0 = p213q.p217b.p317d.p322h.p323e.p326k.C3975t.this
                q.b.d.h.e.k.h0 r0 = r0.f9720c
                r0.mo10141a()
                java.util.Date r0 = r1.f9741e
                long r2 = r0.getTime()
                r4 = 1000(0x3e8, double:4.94E-321)
                long r10 = r2 / r4
                q.b.d.h.e.k.t r0 = p213q.p217b.p317d.p322h.p323e.p326k.C3975t.this
                q.b.d.h.e.k.w0 r0 = r0.f9736s
                java.lang.Throwable r2 = r1.f9742f
                java.lang.Thread r3 = r1.f9743g
                java.lang.String r4 = r0.f9778f
                if (r4 != 0) goto L_0x002a
                q.b.d.h.e.b r0 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
                java.lang.String r2 = "Cannot persist event, no currently open session"
                r0.mo10108a(r2)
                r27 = r10
                goto L_0x0346
            L_0x002a:
                q.b.d.h.e.k.i0 r5 = r0.f9773a
                android.content.Context r6 = r5.f9650a
                android.content.res.Resources r6 = r6.getResources()
                android.content.res.Configuration r6 = r6.getConfiguration()
                int r6 = r6.orientation
                q.b.d.h.e.t.e r7 = new q.b.d.h.e.t.e
                q.b.d.h.e.t.d r8 = r5.f9653d
                r7.<init>(r2, r8)
                q.b.d.h.e.m.j$b r2 = new q.b.d.h.e.m.j$b
                r2.<init>()
                java.lang.String r8 = "crash"
                r2.f9912b = r8
                java.lang.Long r8 = java.lang.Long.valueOf(r10)
                r2.f9911a = r8
                q.b.d.h.e.k.b r8 = r5.f9652c
                java.lang.String r8 = r8.f9593d
                android.content.Context r9 = r5.f9650a
                android.app.ActivityManager$RunningAppProcessInfo r8 = p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9355a(r8, r9)
                if (r8 == 0) goto L_0x0068
                int r8 = r8.importance
                r9 = 100
                if (r8 == r9) goto L_0x0062
                r8 = 1
                goto L_0x0063
            L_0x0062:
                r8 = 0
            L_0x0063:
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                goto L_0x0069
            L_0x0068:
                r8 = 0
            L_0x0069:
                r15 = r8
                java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
                q.b.d.h.e.m.l$b r9 = new q.b.d.h.e.m.l$b
                r9.<init>()
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.lang.StackTraceElement[] r13 = r7.f10125c
                r14 = 4
                q.b.d.h.e.m.v$d$d$a$a$e r13 = r5.mo10145a(r3, r13, r14)
                r12.add(r13)
                java.util.Map r13 = java.lang.Thread.getAllStackTraces()
                java.util.Set r13 = r13.entrySet()
                java.util.Iterator r13 = r13.iterator()
            L_0x008e:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto L_0x00c8
                java.lang.Object r14 = r13.next()
                java.util.Map$Entry r14 = (java.util.Map.Entry) r14
                java.lang.Object r16 = r14.getKey()
                r17 = r13
                r13 = r16
                java.lang.Thread r13 = (java.lang.Thread) r13
                boolean r16 = r13.equals(r3)
                if (r16 != 0) goto L_0x00c1
                r16 = r3
                q.b.d.h.e.t.d r3 = r5.f9653d
                java.lang.Object r14 = r14.getValue()
                java.lang.StackTraceElement[] r14 = (java.lang.StackTraceElement[]) r14
                java.lang.StackTraceElement[] r3 = r3.mo10383a(r14)
                r14 = 0
                q.b.d.h.e.m.v$d$d$a$a$e r3 = r5.mo10145a(r13, r3, r14)
                r12.add(r3)
                goto L_0x00c3
            L_0x00c1:
                r16 = r3
            L_0x00c3:
                r3 = r16
                r13 = r17
                goto L_0x008e
            L_0x00c8:
                r3 = 0
                q.b.d.h.e.m.w r13 = new q.b.d.h.e.m.w
                r13.<init>(r12)
                r9.f9924a = r13
                r12 = 8
                r13 = 4
                q.b.d.h.e.m.v$d$d$a$a$c r3 = r5.mo10144a(r7, r13, r12, r3)
                r9.f9925b = r3
                r12 = 0
                java.lang.Long r3 = java.lang.Long.valueOf(r12)
                java.lang.String r7 = ""
                if (r3 != 0) goto L_0x00e6
                java.lang.String r12 = " address"
                goto L_0x00e7
            L_0x00e6:
                r12 = r7
            L_0x00e7:
                boolean r13 = r12.isEmpty()
                java.lang.String r14 = "Missing required properties:"
                if (r13 == 0) goto L_0x045c
                q.b.d.h.e.m.o r12 = new q.b.d.h.e.m.o
                long r19 = r3.longValue()
                r21 = 0
                java.lang.String r17 = "0"
                java.lang.String r18 = "0"
                r16 = r12
                r16.<init>(r17, r18, r19, r21)
                r9.f9926c = r12
                r3 = 1
                q.b.d.h.e.m.v$d$d$a$a$a[] r3 = new p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4104a[r3]
                r12 = 0
                java.lang.Long r16 = java.lang.Long.valueOf(r12)
                java.lang.Long r12 = java.lang.Long.valueOf(r12)
                q.b.d.h.e.k.b r13 = r5.f9652c
                r25 = r7
                java.lang.String r7 = r13.f9593d
                if (r7 == 0) goto L_0x0454
                java.lang.String r13 = r13.f9591b
                if (r16 != 0) goto L_0x0122
                java.lang.String r17 = " baseAddress"
                r26 = r14
                r14 = r17
                goto L_0x0126
            L_0x0122:
                r26 = r14
                r14 = r25
            L_0x0126:
                r27 = r10
                if (r12 != 0) goto L_0x0130
                java.lang.String r10 = " size"
                java.lang.String r14 = p213q.p214a.p215a.p216a.C1965a.m4751a(r14, r10)
            L_0x0130:
                boolean r10 = r14.isEmpty()
                if (r10 == 0) goto L_0x0448
                q.b.d.h.e.m.m r10 = new q.b.d.h.e.m.m
                long r18 = r16.longValue()
                long r20 = r12.longValue()
                r24 = 0
                r17 = r10
                r22 = r7
                r23 = r13
                r17.<init>(r18, r20, r22, r23, r24)
                r7 = 0
                r3[r7] = r10
                q.b.d.h.e.m.w r7 = new q.b.d.h.e.m.w
                java.util.List r3 = java.util.Arrays.asList(r3)
                r7.<init>(r3)
                r9.f9927d = r7
                q.b.d.h.e.m.v$d$d$a$a r13 = r9.mo10265a()
                java.lang.String r3 = " uiOrientation"
                if (r8 != 0) goto L_0x0163
                r7 = r3
                goto L_0x0165
            L_0x0163:
                r7 = r25
            L_0x0165:
                boolean r9 = r7.isEmpty()
                if (r9 == 0) goto L_0x043c
                q.b.d.h.e.m.k r7 = new q.b.d.h.e.m.k
                int r16 = r8.intValue()
                r17 = 0
                r14 = 0
                r12 = r7
                r8 = r26
                r12.<init>(r13, r14, r15, r16, r17)
                r2.mo10257a(r7)
                android.content.Context r7 = r5.f9650a
                q.b.d.h.e.k.e r7 = p213q.p217b.p317d.p322h.p323e.p326k.C3938e.m9345a(r7)
                java.lang.Float r9 = r7.f9602a
                if (r9 == 0) goto L_0x0190
                double r9 = r9.doubleValue()
                java.lang.Double r9 = java.lang.Double.valueOf(r9)
                goto L_0x0191
            L_0x0190:
                r9 = 0
            L_0x0191:
                int r7 = r7.mo10128a()
                android.content.Context r10 = r5.f9650a
                boolean r10 = p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9369d(r10)
                long r11 = p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9365b()
                android.content.Context r5 = r5.f9650a
                android.app.ActivityManager$MemoryInfo r13 = new android.app.ActivityManager$MemoryInfo
                r13.<init>()
                java.lang.String r14 = "activity"
                java.lang.Object r5 = r5.getSystemService(r14)
                android.app.ActivityManager r5 = (android.app.ActivityManager) r5
                r5.getMemoryInfo(r13)
                long r13 = r13.availMem
                long r11 = r11 - r13
                java.io.File r5 = android.os.Environment.getDataDirectory()
                java.lang.String r5 = r5.getPath()
                long r13 = p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9353a(r5)
                q.b.d.h.e.m.r$b r5 = new q.b.d.h.e.m.r$b
                r5.<init>()
                r5.f9959a = r9
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r5.f9960b = r7
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r10)
                r5.f9961c = r7
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r5.f9962d = r6
                java.lang.Long r6 = java.lang.Long.valueOf(r11)
                r5.f9963e = r6
                java.lang.Long r6 = java.lang.Long.valueOf(r13)
                r5.f9964f = r6
                q.b.d.h.e.m.v$d$d$c r5 = r5.mo10285a()
                r2.f9914d = r5
                q.b.d.h.e.m.v$d$d r2 = r2.mo10258a()
                q.b.d.h.e.m.j r2 = (p213q.p217b.p317d.p322h.p323e.p328m.C4061j) r2
                q.b.d.h.e.m.j$b r5 = new q.b.d.h.e.m.j$b
                r6 = 0
                r5.<init>(r2, r6)
                q.b.d.h.e.l.b r7 = r0.f9776d
                q.b.d.h.e.l.a r7 = r7.f9794c
                java.lang.String r7 = r7.mo10201b()
                if (r7 == 0) goto L_0x0209
                q.b.d.h.e.m.s r9 = new q.b.d.h.e.m.s
                r9.<init>(r7, r6)
                r5.f9915e = r9
                goto L_0x0210
            L_0x0209:
                q.b.d.h.e.b r6 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
                java.lang.String r7 = "No log data to include with this event."
                r6.mo10108a(r7)
            L_0x0210:
                q.b.d.h.e.k.y0 r6 = r0.f9777e
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r6 = r6.f9783b
                java.util.Map r6 = java.util.Collections.unmodifiableMap(r6)
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                int r9 = r6.size()
                r7.ensureCapacity(r9)
                java.util.Set r6 = r6.entrySet()
                java.util.Iterator r6 = r6.iterator()
            L_0x022c:
                boolean r9 = r6.hasNext()
                if (r9 == 0) goto L_0x0262
                java.lang.Object r9 = r6.next()
                java.util.Map$Entry r9 = (java.util.Map.Entry) r9
                java.lang.Object r10 = r9.getKey()
                java.lang.String r10 = (java.lang.String) r10
                if (r10 == 0) goto L_0x025a
                java.lang.Object r9 = r9.getValue()
                java.lang.String r9 = (java.lang.String) r9
                if (r9 == 0) goto L_0x0252
                q.b.d.h.e.m.c r11 = new q.b.d.h.e.m.c
                r12 = 0
                r11.<init>(r10, r9, r12)
                r7.add(r11)
                goto L_0x022c
            L_0x0252:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r2 = "Null value"
                r0.<init>(r2)
                throw r0
            L_0x025a:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r2 = "Null key"
                r0.<init>(r2)
                throw r0
            L_0x0262:
                q.b.d.h.e.k.v0 r6 = p213q.p217b.p317d.p322h.p323e.p326k.C3995v0.f9770e
                java.util.Collections.sort(r7, r6)
                boolean r6 = r7.isEmpty()
                if (r6 != 0) goto L_0x02b0
                q.b.d.h.e.m.v$d$d$a r2 = r2.f9908c
                q.b.d.h.e.m.k r2 = (p213q.p217b.p317d.p322h.p323e.p328m.C4064k) r2
                if (r2 == 0) goto L_0x02ae
                q.b.d.h.e.m.v$d$d$a$a r10 = r2.f9916a
                java.lang.Boolean r12 = r2.f9918c
                int r2 = r2.f9919d
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                q.b.d.h.e.m.w r11 = new q.b.d.h.e.m.w
                r11.<init>(r7)
                if (r10 != 0) goto L_0x0287
                java.lang.String r7 = " execution"
                goto L_0x0289
            L_0x0287:
                r7 = r25
            L_0x0289:
                if (r2 != 0) goto L_0x028f
                java.lang.String r7 = p213q.p214a.p215a.p216a.C1965a.m4751a(r7, r3)
            L_0x028f:
                boolean r3 = r7.isEmpty()
                if (r3 == 0) goto L_0x02a4
                q.b.d.h.e.m.k r3 = new q.b.d.h.e.m.k
                int r13 = r2.intValue()
                r14 = 0
                r9 = r3
                r9.<init>(r10, r11, r12, r13, r14)
                r5.mo10257a(r3)
                goto L_0x02b0
            L_0x02a4:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = p213q.p214a.p215a.p216a.C1965a.m4751a(r8, r7)
                r0.<init>(r2)
                throw r0
            L_0x02ae:
                r0 = 0
                throw r0
            L_0x02b0:
                q.b.d.h.e.o.g r0 = r0.f9774b
                q.b.d.h.e.m.v$d$d r2 = r5.mo10258a()
                q.b.d.h.e.s.e r3 = r0.f10017f
                q.b.d.h.e.s.d r3 = (p213q.p217b.p317d.p322h.p323e.p337s.C4166d) r3
                q.b.d.h.e.s.i.e r3 = r3.mo10374b()
                q.b.d.h.e.s.i.d r3 = r3.mo10376a()
                int r3 = r3.f10101a
                java.io.File r5 = r0.mo10337b(r4)
                q.b.d.h.e.m.x.f r6 = p213q.p217b.p317d.p322h.p323e.p331o.C4137g.f10009i
                if (r6 == 0) goto L_0x043a
                q.b.d.i.a r6 = p213q.p217b.p317d.p322h.p323e.p328m.p329x.C4125f.f9986a
                q.b.d.i.i.d r6 = (p213q.p217b.p317d.p342i.p344i.C4202d) r6
                if (r6 == 0) goto L_0x0438
                java.io.StringWriter r7 = new java.io.StringWriter
                r7.<init>()
                r6.mo10390a(r2, r7)     // Catch:{ IOException -> 0x02da }
            L_0x02da:
                java.lang.String r2 = r7.toString()
                java.util.concurrent.atomic.AtomicInteger r0 = r0.f10012a
                int r0 = r0.getAndIncrement()
                java.util.Locale r6 = java.util.Locale.US
                r7 = 1
                java.lang.Object[] r7 = new java.lang.Object[r7]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r8 = 0
                r7[r8] = r0
                java.lang.String r0 = "%010d"
                java.lang.String r0 = java.lang.String.format(r6, r0, r7)
                java.lang.String r6 = "event"
                java.lang.String r7 = "_"
                java.lang.String r0 = p213q.p214a.p215a.p216a.C1965a.m4752a(r6, r0, r7)
                java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x0307 }
                r6.<init>(r5, r0)     // Catch:{ IOException -> 0x0307 }
                p213q.p217b.p317d.p322h.p323e.p331o.C4137g.m9559b(r6, r2)     // Catch:{ IOException -> 0x0307 }
                goto L_0x031e
            L_0x0307:
                r0 = move-exception
                q.b.d.h.e.b r2 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "Could not persist event for session "
                r6.append(r7)
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                r2.mo10109a(r4, r0)
            L_0x031e:
                q.b.d.h.e.o.c r0 = p213q.p217b.p317d.p322h.p323e.p331o.C4133c.f10003a
                java.util.List r0 = p213q.p217b.p317d.p322h.p323e.p331o.C4137g.m9552a(r5, r0)
                q.b.d.h.e.o.d r2 = p213q.p217b.p317d.p322h.p323e.p331o.C4134d.f10004e
                java.util.Collections.sort(r0, r2)
                int r2 = r0.size()
                java.util.Iterator r0 = r0.iterator()
            L_0x0331:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L_0x0346
                java.lang.Object r4 = r0.next()
                java.io.File r4 = (java.io.File) r4
                if (r2 > r3) goto L_0x0340
                goto L_0x0346
            L_0x0340:
                p213q.p217b.p317d.p322h.p323e.p331o.C4137g.m9562d(r4)
                int r2 = r2 + -1
                goto L_0x0331
            L_0x0346:
                q.b.d.h.e.k.t r6 = p213q.p217b.p317d.p322h.p323e.p326k.C3975t.this
                java.lang.Thread r8 = r1.f9743g
                java.lang.Throwable r9 = r1.f9742f
                if (r6 == 0) goto L_0x0436
                java.lang.String r2 = "Failed to close fatal exception file output stream."
                java.lang.String r3 = "Failed to flush to session begin file."
                java.lang.String r0 = r6.mo10164a()     // Catch:{ Exception -> 0x039a, all -> 0x0395 }
                if (r0 != 0) goto L_0x0364
                q.b.d.h.e.b r0 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c     // Catch:{ Exception -> 0x039a, all -> 0x0395 }
                java.lang.String r4 = "Tried to write a fatal exception while no session was open."
                r0.mo10111b(r4)     // Catch:{ Exception -> 0x039a, all -> 0x0395 }
                r0 = 0
                p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9361a(r0, r3)
                goto L_0x03b1
            L_0x0364:
                q.b.d.h.e.p.b r4 = new q.b.d.h.e.p.b     // Catch:{ Exception -> 0x039a, all -> 0x0395 }
                java.io.File r5 = r6.mo10177c()     // Catch:{ Exception -> 0x039a, all -> 0x0395 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x039a, all -> 0x0395 }
                r7.<init>()     // Catch:{ Exception -> 0x039a, all -> 0x0395 }
                r7.append(r0)     // Catch:{ Exception -> 0x039a, all -> 0x0395 }
                java.lang.String r0 = "SessionCrash"
                r7.append(r0)     // Catch:{ Exception -> 0x039a, all -> 0x0395 }
                java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x039a, all -> 0x0395 }
                r4.<init>(r5, r0)     // Catch:{ Exception -> 0x039a, all -> 0x0395 }
                q.b.d.h.e.p.c r5 = p213q.p217b.p317d.p322h.p323e.p332p.C4142c.m9570a(r4)     // Catch:{ Exception -> 0x0393, all -> 0x0391 }
                java.lang.String r12 = "crash"
                r13 = 1
                r7 = r5
                r10 = r27
                r6.mo10171a(r7, r8, r9, r10, r12, r13)     // Catch:{ Exception -> 0x038f }
                goto L_0x03ad
            L_0x038c:
                r0 = move-exception
                goto L_0x042f
            L_0x038f:
                r0 = move-exception
                goto L_0x039d
            L_0x0391:
                r0 = move-exception
                goto L_0x0397
            L_0x0393:
                r0 = move-exception
                goto L_0x039c
            L_0x0395:
                r0 = move-exception
                r4 = 0
            L_0x0397:
                r5 = 0
                goto L_0x042f
            L_0x039a:
                r0 = move-exception
                r4 = 0
            L_0x039c:
                r5 = 0
            L_0x039d:
                q.b.d.h.e.b r6 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c     // Catch:{ all -> 0x038c }
                java.lang.String r7 = "An error occurred in the fatal exception logger"
                r8 = 6
                boolean r8 = r6.mo10110a(r8)     // Catch:{ all -> 0x038c }
                if (r8 == 0) goto L_0x03ad
                java.lang.String r6 = r6.f9553a     // Catch:{ all -> 0x038c }
                android.util.Log.e(r6, r7, r0)     // Catch:{ all -> 0x038c }
            L_0x03ad:
                r0 = r4
                p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9361a(r5, r3)
            L_0x03b1:
                p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9360a(r0, r2)
                q.b.d.h.e.k.t r0 = p213q.p217b.p317d.p322h.p323e.p326k.C3975t.this
                java.util.Date r2 = r1.f9741e
                long r2 = r2.getTime()
                r0.mo10167a(r2)
                q.b.d.h.e.s.e r0 = r1.f9744h
                q.b.d.h.e.s.d r0 = (p213q.p217b.p317d.p322h.p323e.p337s.C4166d) r0
                q.b.d.h.e.s.i.e r0 = r0.mo10374b()
                q.b.d.h.e.s.i.d r2 = r0.mo10376a()
                int r2 = r2.f10101a
                q.b.d.h.e.s.i.d r0 = r0.mo10376a()
                int r0 = r0.f10102b
                q.b.d.h.e.k.t r3 = p213q.p217b.p317d.p322h.p323e.p326k.C3975t.this
                r4 = 1
                r3.mo10166a(r2, r4)
                q.b.d.h.e.k.t r2 = p213q.p217b.p317d.p322h.p323e.p326k.C3975t.this
                p213q.p217b.p317d.p322h.p323e.p326k.C3975t.m9406b(r2)
                q.b.d.h.e.k.t r2 = p213q.p217b.p317d.p322h.p323e.p326k.C3975t.this
                java.io.File r3 = r2.mo10178d()
                java.io.File r4 = r2.mo10176b()
                java.util.Comparator<java.io.File> r5 = p213q.p217b.p317d.p322h.p323e.p326k.C3975t.f9711B
                int r3 = p213q.p217b.p317d.p322h.p323e.p326k.C4003z0.m9438a(r3, r4, r0, r5)
                int r0 = r0 - r3
                java.io.File r3 = r2.mo10179e()
                java.util.Comparator<java.io.File> r4 = p213q.p217b.p317d.p322h.p323e.p326k.C3975t.f9711B
                java.io.FilenameFilter r5 = p213q.p217b.p317d.p322h.p323e.p326k.C4003z0.f9784a
                int r3 = p213q.p217b.p317d.p322h.p323e.p326k.C4003z0.m9439a(r3, r5, r0, r4)
                int r0 = r0 - r3
                java.io.File r2 = r2.mo10177c()
                java.io.FilenameFilter r3 = p213q.p217b.p317d.p322h.p323e.p326k.C3975t.f9717z
                java.util.Comparator<java.io.File> r4 = p213q.p217b.p317d.p322h.p323e.p326k.C3975t.f9711B
                p213q.p217b.p317d.p322h.p323e.p326k.C4003z0.m9439a(r2, r3, r0, r4)
                q.b.d.h.e.k.t r0 = p213q.p217b.p317d.p322h.p323e.p326k.C3975t.this
                q.b.d.h.e.k.l0 r0 = r0.f9719b
                boolean r0 = r0.mo10149a()
                if (r0 != 0) goto L_0x0417
                r0 = 0
                q.b.a.b.l.i r0 = p213q.p217b.p218a.p231b.p239d.p246q.C2286e.m5291b(r0)
                goto L_0x042e
            L_0x0417:
                q.b.d.h.e.k.t r0 = p213q.p217b.p317d.p322h.p323e.p326k.C3975t.this
                q.b.d.h.e.k.h r0 = r0.f9722e
                java.util.concurrent.ExecutorService r0 = r0.f9640a
                q.b.d.h.e.s.e r2 = r1.f9744h
                q.b.d.h.e.s.d r2 = (p213q.p217b.p317d.p322h.p323e.p337s.C4166d) r2
                q.b.a.b.l.i r2 = r2.mo10370a()
                q.b.d.h.e.k.y r3 = new q.b.d.h.e.k.y
                r3.<init>(r1, r0)
                q.b.a.b.l.i r0 = r2.mo8927a(r0, r3)
            L_0x042e:
                return r0
            L_0x042f:
                p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9361a(r5, r3)
                p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9360a(r4, r2)
                throw r0
            L_0x0436:
                r0 = 0
                throw r0
            L_0x0438:
                r0 = 0
                throw r0
            L_0x043a:
                r0 = 0
                throw r0
            L_0x043c:
                r8 = r26
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = p213q.p214a.p215a.p216a.C1965a.m4751a(r8, r7)
                r0.<init>(r2)
                throw r0
            L_0x0448:
                r8 = r26
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = p213q.p214a.p215a.p216a.C1965a.m4751a(r8, r14)
                r0.<init>(r2)
                throw r0
            L_0x0454:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r2 = "Null name"
                r0.<init>(r2)
                throw r0
            L_0x045c:
                r8 = r14
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = p213q.p214a.p215a.p216a.C1965a.m4751a(r8, r12)
                r0.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p322h.p323e.p326k.C3975t.C3980e.call():java.lang.Object");
        }
    }

    /* renamed from: q.b.d.h.e.k.t$f */
    public class C3981f implements C3253h<Boolean, Void> {

        /* renamed from: a */
        public final /* synthetic */ C3255i f9746a;

        /* renamed from: b */
        public final /* synthetic */ float f9747b;

        public C3981f(C3255i iVar, float f) {
            this.f9746a = iVar;
            this.f9747b = f;
        }

        /* renamed from: a */
        public C3255i mo8939a(Object obj) {
            return C3975t.this.f9722e.mo10139b(new C3933b0(this, (Boolean) obj));
        }
    }

    /* renamed from: q.b.d.h.e.k.t$g */
    public static class C3982g implements FilenameFilter {
        public /* synthetic */ C3982g(C3976a aVar) {
        }

        public boolean accept(File file, String str) {
            return !C3975t.f9717z.accept(file, str) && C3975t.f9712C.matcher(str).matches();
        }
    }

    /* renamed from: q.b.d.h.e.k.t$h */
    public interface C3983h {
        /* renamed from: a */
        void mo10157a(C4142c cVar);
    }

    /* renamed from: q.b.d.h.e.k.t$i */
    public static class C3984i implements FilenameFilter {

        /* renamed from: a */
        public final String f9749a;

        public C3984i(String str) {
            this.f9749a = str;
        }

        public boolean accept(File file, String str) {
            return str.contains(this.f9749a) && !str.endsWith(".cls_temp");
        }
    }

    /* renamed from: q.b.d.h.e.k.t$j */
    public static class C3985j implements FilenameFilter {
        public boolean accept(File file, String str) {
            return C4140b.f10021h.accept(file, str) || str.contains("SessionMissingBinaryImages");
        }
    }

    /* renamed from: q.b.d.h.e.k.t$k */
    public static final class C3986k implements C4012b {

        /* renamed from: a */
        public final C4138h f9750a;

        public C3986k(C4138h hVar) {
            this.f9750a = hVar;
        }

        /* renamed from: a */
        public File mo10190a() {
            File file = new File(this.f9750a.mo10339a(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    /* renamed from: q.b.d.h.e.k.t$l */
    public final class C3987l implements C4149c {
        public /* synthetic */ C3987l(C3976a aVar) {
        }
    }

    /* renamed from: q.b.d.h.e.k.t$m */
    public final class C3988m implements C4147a {
        public /* synthetic */ C3988m(C3976a aVar) {
        }
    }

    /* renamed from: q.b.d.h.e.k.t$n */
    public static final class C3989n implements Runnable {

        /* renamed from: e */
        public final Context f9753e;

        /* renamed from: f */
        public final C4153c f9754f;

        /* renamed from: g */
        public final C4146b f9755g;

        /* renamed from: h */
        public final boolean f9756h;

        public C3989n(Context context, C4153c cVar, C4146b bVar, boolean z) {
            this.f9753e = context;
            this.f9754f = cVar;
            this.f9755g = bVar;
            this.f9756h = z;
        }

        public void run() {
            if (C3944g.m9362a(this.f9753e)) {
                C3913b.f9552c.mo10108a("Attempting to send crash report at time of crash...");
                this.f9755g.mo10357a(this.f9754f, this.f9756h);
            }
        }
    }

    /* renamed from: q.b.d.h.e.k.t$o */
    public static class C3990o implements FilenameFilter {

        /* renamed from: a */
        public final String f9757a;

        public C3990o(String str) {
            this.f9757a = str;
        }

        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f9757a);
            sb.append(".cls");
            boolean z = false;
            if (str.equals(sb.toString())) {
                return false;
            }
            if (str.contains(this.f9757a) && !str.endsWith(".cls_temp")) {
                z = true;
            }
            return z;
        }
    }

    public C3975t(Context context, C3948h hVar, C4129c cVar, C3970q0 q0Var, C3959l0 l0Var, C4138h hVar2, C3950h0 h0Var, C3932b bVar, C4145a aVar, C4148b bVar2, C3912a aVar2, C4189a aVar3, C3922a aVar4, C4168e eVar) {
        String str;
        Context context2 = context;
        C3970q0 q0Var2 = q0Var;
        C4138h hVar3 = hVar2;
        C3932b bVar3 = bVar;
        C4189a aVar5 = aVar3;
        new AtomicInteger(0);
        new AtomicBoolean(false);
        this.f9718a = context2;
        this.f9722e = hVar;
        this.f9723f = cVar;
        this.f9724g = q0Var2;
        this.f9719b = l0Var;
        this.f9725h = hVar3;
        this.f9720c = h0Var;
        this.f9726i = bVar3;
        this.f9727j = bVar2 != null ? bVar2 : new C3935c0(this);
        this.f9732o = aVar2;
        if (!aVar5.f10128b) {
            Context context3 = aVar5.f10127a;
            int a = C3944g.m9352a(context3, "com.google.firebase.crashlytics.unity_version", "string");
            if (a != 0) {
                str = context3.getResources().getString(a);
                C1965a.m4759a("Unity Editor version is: ", str, C3913b.f9552c);
            } else {
                str = null;
            }
            aVar5.f10129c = str;
            aVar5.f10128b = true;
        }
        String str2 = aVar5.f10129c;
        if (str2 == null) {
            str2 = null;
        }
        this.f9734q = str2;
        this.f9735r = aVar4;
        this.f9721d = new C4001y0();
        this.f9728k = new C3986k(hVar3);
        this.f9729l = new C4010b(context, this.f9728k);
        this.f9730m = aVar == null ? new C4145a(new C3987l(null)) : aVar;
        this.f9731n = new C3988m(null);
        C4184a aVar6 = new C4184a(1024, new C4186c(10));
        this.f9733p = aVar6;
        C4010b bVar4 = this.f9729l;
        C4001y0 y0Var = this.f9721d;
        if (hVar3 != null) {
            C3997w0 w0Var = new C3997w0(new C3952i0(context, q0Var2, bVar3, aVar6), new C4137g(new File(new File(hVar3.f10018a.getFilesDir(), ".com.google.firebase.crashlytics").getPath()), eVar), C4162c.m9632a(context), bVar4, y0Var);
            this.f9736s = w0Var;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static String m9399a(File file) {
        return file.getName().substring(0, 35);
    }

    /* renamed from: a */
    public static /* synthetic */ C3255i m9400a(C3975t tVar) {
        File[] a;
        boolean z;
        C3255i iVar;
        if (tVar != null) {
            ArrayList arrayList = new ArrayList();
            for (File file : tVar.mo10175a(f9716y)) {
                try {
                    long parseLong = Long.parseLong(file.getName().substring(3));
                    try {
                        Class.forName("com.google.firebase.crash.FirebaseCrash");
                        z = true;
                    } catch (ClassNotFoundException unused) {
                        z = false;
                    }
                    if (z) {
                        C3913b.f9552c.mo10108a("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
                        iVar = C2286e.m5291b(null);
                    } else {
                        iVar = C2286e.m5211a((Executor) new ScheduledThreadPoolExecutor(1), (Callable<TResult>) new C3996w<TResult>(tVar, parseLong));
                    }
                    arrayList.add(iVar);
                } catch (NumberFormatException unused2) {
                    C3913b bVar = C3913b.f9552c;
                    StringBuilder a2 = C1965a.m4756a("Could not parse timestamp from file ");
                    a2.append(file.getName());
                    bVar.mo10108a(a2.toString());
                }
                file.delete();
            }
            return C2286e.m5210a((Collection<? extends C3255i<?>>) arrayList);
        }
        throw null;
    }

    /* renamed from: b */
    public static /* synthetic */ void m9406b(C3975t tVar) {
        C3975t tVar2 = tVar;
        if (tVar2 != null) {
            long i = m9407i();
            new C3940f(tVar2.f9724g);
            String str = C3940f.f9607b;
            C1965a.m4759a("Opening a new session with ID ", str, C3913b.f9552c);
            tVar2.f9732o.mo10106c(str);
            String str2 = "17.1.1";
            String format = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{str2});
            C3969q qVar = new C3969q(tVar, str, format, i);
            tVar2.mo10168a(str, "BeginSession", (C3983h) qVar);
            tVar2.f9732o.mo10101a(str, format, i);
            C3970q0 q0Var = tVar2.f9724g;
            String str3 = q0Var.f9697c;
            C3932b bVar = tVar2.f9726i;
            String str4 = bVar.f9594e;
            String str5 = bVar.f9595f;
            String a = q0Var.mo10158a();
            int i2 = C3963n0.m9387a(tVar2.f9726i.f9592c).f9680e;
            String str6 = str2;
            C3971r rVar = r1;
            int i3 = i2;
            C3971r rVar2 = new C3971r(tVar, str3, str4, str5, a, i2);
            tVar2.mo10168a(str, "SessionApp", (C3983h) rVar);
            tVar2.f9732o.mo10102a(str, str3, str4, str5, a, i3, tVar2.f9734q);
            String str7 = VERSION.RELEASE;
            String str8 = VERSION.CODENAME;
            boolean g = C3944g.m9372g(tVar2.f9718a);
            tVar2.mo10168a(str, "SessionOS", (C3983h) new C3973s(tVar2, str7, str8, g));
            tVar2.f9732o.mo10103a(str, str7, str8, g);
            Context context = tVar2.f9718a;
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            int a2 = C3944g.m9351a();
            String str9 = Build.MODEL;
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            long b = C3944g.m9365b();
            long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            boolean f = C3944g.m9371f(context);
            int b2 = C3944g.m9364b(context);
            String str10 = Build.MANUFACTURER;
            String str11 = Build.PRODUCT;
            long j = i;
            C3992u uVar = r1;
            String str12 = str6;
            String str13 = str;
            C3992u uVar2 = new C3992u(tVar, a2, str9, availableProcessors, b, blockCount, f, b2, str10, str11);
            tVar2.mo10168a(str13, "SessionDevice", (C3983h) uVar);
            tVar2.f9732o.mo10100a(str13, a2, str9, availableProcessors, b, blockCount, f, b2, str10, str11);
            tVar2.f9729l.mo10204a(str13);
            C3997w0 w0Var = tVar2.f9736s;
            String replaceAll = str13.replaceAll("-", Objects.EMPTY_STRING);
            w0Var.f9778f = replaceAll;
            C3952i0 i0Var = w0Var.f9773a;
            if (i0Var != null) {
                C4045b bVar2 = (C4045b) C4090v.m9515b();
                bVar2.f9847a = str12;
                String str14 = i0Var.f9652c.f9590a;
                if (str14 != null) {
                    bVar2.f9848b = str14;
                    String a3 = i0Var.f9651b.mo10158a();
                    if (a3 != null) {
                        bVar2.f9850d = a3;
                        C3932b bVar3 = i0Var.f9652c;
                        String str15 = bVar3.f9594e;
                        String str16 = "Null buildVersion";
                        if (str15 != null) {
                            bVar2.f9851e = str15;
                            String str17 = bVar3.f9595f;
                            if (str17 != null) {
                                bVar2.f9852f = str17;
                                bVar2.f9849c = Integer.valueOf(4);
                                C4054b bVar4 = new C4054b();
                                bVar4.mo10242a(false);
                                bVar4.f9874c = Long.valueOf(j);
                                String str18 = "Null identifier";
                                if (replaceAll != null) {
                                    bVar4.f9873b = replaceAll;
                                    String str19 = C3952i0.f9648e;
                                    if (str19 != null) {
                                        bVar4.f9872a = str19;
                                        C3970q0 q0Var2 = i0Var.f9651b;
                                        String str20 = q0Var2.f9697c;
                                        if (str20 != null) {
                                            C3932b bVar5 = i0Var.f9652c;
                                            String str21 = bVar5.f9594e;
                                            String str22 = "Null version";
                                            if (str21 != null) {
                                                C4055g gVar = new C4055g(str20, str21, bVar5.f9595f, null, q0Var2.mo10158a(), null);
                                                bVar4.f9877f = gVar;
                                                C4087b bVar6 = new C4087b();
                                                bVar6.f9970a = Integer.valueOf(3);
                                                String str23 = VERSION.RELEASE;
                                                if (str23 != null) {
                                                    bVar6.f9971b = str23;
                                                    String str24 = VERSION.CODENAME;
                                                    if (str24 != null) {
                                                        bVar6.f9972c = str24;
                                                        bVar6.f9973d = Boolean.valueOf(C3944g.m9372g(i0Var.f9650a));
                                                        bVar4.f9879h = bVar6.mo10292a();
                                                        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                                        String str25 = Build.CPU_ABI;
                                                        int i4 = 7;
                                                        if (!TextUtils.isEmpty(str25)) {
                                                            Integer num = (Integer) C3952i0.f9649f.get(str25.toLowerCase(Locale.US));
                                                            if (num != null) {
                                                                i4 = num.intValue();
                                                            }
                                                        }
                                                        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                                        long b3 = C3944g.m9365b();
                                                        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
                                                        boolean f2 = C3944g.m9371f(i0Var.f9650a);
                                                        int b4 = C3944g.m9364b(i0Var.f9650a);
                                                        String str26 = Build.MANUFACTURER;
                                                        String str27 = Build.PRODUCT;
                                                        C4060b bVar7 = new C4060b();
                                                        bVar7.f9897a = Integer.valueOf(i4);
                                                        String str28 = Build.MODEL;
                                                        if (str28 != null) {
                                                            bVar7.f9898b = str28;
                                                            bVar7.f9899c = Integer.valueOf(availableProcessors2);
                                                            bVar7.f9900d = Long.valueOf(b3);
                                                            bVar7.f9901e = Long.valueOf(blockCount2);
                                                            bVar7.f9902f = Boolean.valueOf(f2);
                                                            bVar7.f9903g = Integer.valueOf(b4);
                                                            if (str26 != null) {
                                                                bVar7.f9904h = str26;
                                                                if (str27 != null) {
                                                                    bVar7.f9905i = str27;
                                                                    bVar4.f9880i = bVar7.mo10253a();
                                                                    bVar4.f9882k = Integer.valueOf(3);
                                                                    bVar2.f9853g = bVar4.mo10243a();
                                                                    C4090v a4 = bVar2.mo10229a();
                                                                    C4137g gVar2 = w0Var.f9774b;
                                                                    if (gVar2 != null) {
                                                                        C4095d dVar = ((C4043b) a4).f9845h;
                                                                        if (dVar == null) {
                                                                            C3913b.f9552c.mo10108a("Could not get session for report");
                                                                            return;
                                                                        }
                                                                        String str29 = ((C4052f) dVar).f9862b;
                                                                        try {
                                                                            File b5 = gVar2.mo10337b(str29);
                                                                            C4137g.m9558b(b5);
                                                                            C4137g.m9559b(new File(b5, "report"), C4137g.f10009i.mo10324a(a4));
                                                                        } catch (IOException e) {
                                                                            C3913b bVar8 = C3913b.f9552c;
                                                                            StringBuilder sb = new StringBuilder();
                                                                            sb.append("Could not persist report for session ");
                                                                            sb.append(str29);
                                                                            bVar8.mo10109a(sb.toString(), e);
                                                                        }
                                                                    } else {
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    throw new NullPointerException("Null modelClass");
                                                                }
                                                            } else {
                                                                throw new NullPointerException("Null manufacturer");
                                                            }
                                                        } else {
                                                            throw new NullPointerException("Null model");
                                                        }
                                                    } else {
                                                        throw new NullPointerException(str16);
                                                    }
                                                } else {
                                                    throw new NullPointerException(str22);
                                                }
                                            } else {
                                                throw new NullPointerException(str22);
                                            }
                                        } else {
                                            throw new NullPointerException(str18);
                                        }
                                    } else {
                                        throw new NullPointerException("Null generator");
                                    }
                                } else {
                                    throw new NullPointerException(str18);
                                }
                            } else {
                                throw new NullPointerException("Null displayVersion");
                            }
                        } else {
                            throw new NullPointerException(str16);
                        }
                    } else {
                        throw new NullPointerException("Null installationUuid");
                    }
                } else {
                    throw new NullPointerException("Null gmpAppId");
                }
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }

    /* renamed from: i */
    public static long m9407i() {
        return new Date().getTime() / 1000;
    }

    /* renamed from: a */
    public final String mo10164a() {
        File[] h = mo10182h();
        if (h.length > 0) {
            return m9399a(h[0]);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo10168a(String str, String str2, C3983h hVar) {
        C4140b bVar;
        String str3 = "Failed to close session ";
        String str4 = "Failed to flush to session ";
        String str5 = " file.";
        C4142c cVar = null;
        try {
            File c = mo10177c();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            bVar = new C4140b(c, sb.toString());
            try {
                cVar = C4142c.m9570a((OutputStream) bVar);
                hVar.mo10157a(cVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append(str2);
                sb2.append(str5);
                C3944g.m9361a((Flushable) cVar, sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(str2);
                sb3.append(str5);
                C3944g.m9360a((Closeable) bVar, sb3.toString());
            } catch (Throwable th) {
                th = th;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str4);
                sb4.append(str2);
                sb4.append(str5);
                C3944g.m9361a((Flushable) cVar, sb4.toString());
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str3);
                sb5.append(str2);
                sb5.append(str5);
                C3944g.m9360a((Closeable) bVar, sb5.toString());
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bVar = null;
            StringBuilder sb42 = new StringBuilder();
            sb42.append(str4);
            sb42.append(str2);
            sb42.append(str5);
            C3944g.m9361a((Flushable) cVar, sb42.toString());
            StringBuilder sb52 = new StringBuilder();
            sb52.append(str3);
            sb52.append(str2);
            sb52.append(str5);
            C3944g.m9360a((Closeable) bVar, sb52.toString());
            throw th;
        }
    }

    /* renamed from: a */
    public final File[] mo10174a(File file, FilenameFilter filenameFilter) {
        File[] listFiles = file.listFiles(filenameFilter);
        return listFiles == null ? new File[0] : listFiles;
    }

    /* renamed from: b */
    public File mo10176b() {
        return new File(mo10177c(), "fatal-sessions");
    }

    /* renamed from: c */
    public File mo10177c() {
        return this.f9725h.mo10339a();
    }

    /* renamed from: d */
    public File mo10178d() {
        return new File(mo10177c(), "native-sessions");
    }

    /* renamed from: e */
    public File mo10179e() {
        return new File(mo10177c(), "nonfatal-sessions");
    }

    /* renamed from: f */
    public boolean mo10180f() {
        C3956k0 k0Var = this.f9737t;
        return k0Var != null && k0Var.f9658d.get();
    }

    /* renamed from: g */
    public File[] mo10181g() {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, mo10174a(mo10176b(), f9717z));
        Collections.addAll(linkedList, mo10174a(mo10179e(), f9717z));
        Collections.addAll(linkedList, mo10174a(mo10177c(), f9717z));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    /* renamed from: h */
    public final File[] mo10182h() {
        File[] a = mo10175a(f9715x);
        Arrays.sort(a, f9710A);
        return a;
    }

    /* renamed from: a */
    public static void m9402a(String str, File file) {
        FileOutputStream fileOutputStream;
        if (str != null) {
            String str2 = "Failed to close ";
            String str3 = "Failed to flush to append to ";
            C4142c cVar = null;
            try {
                fileOutputStream = new FileOutputStream(file, true);
                try {
                    cVar = C4142c.m9570a((OutputStream) fileOutputStream);
                    C4144d.m9600a(cVar, str);
                    StringBuilder a = C1965a.m4756a(str3);
                    a.append(file.getPath());
                    C3944g.m9361a((Flushable) cVar, a.toString());
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(file.getPath());
                    C3944g.m9360a((Closeable) fileOutputStream, sb.toString());
                } catch (Throwable th) {
                    th = th;
                    StringBuilder a2 = C1965a.m4756a(str3);
                    a2.append(file.getPath());
                    C3944g.m9361a((Flushable) cVar, a2.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(file.getPath());
                    C3944g.m9360a((Closeable) fileOutputStream, sb2.toString());
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
                StringBuilder a22 = C1965a.m4756a(str3);
                a22.append(file.getPath());
                C3944g.m9361a((Flushable) cVar, a22.toString());
                StringBuilder sb22 = new StringBuilder();
                sb22.append(str2);
                sb22.append(file.getPath());
                C3944g.m9360a((Closeable) fileOutputStream, sb22.toString());
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo10169a(C4140b bVar) {
        if (bVar != null) {
            try {
                bVar.mo10342a();
            } catch (IOException e) {
                C3913b bVar2 = C3913b.f9552c;
                if (bVar2.mo10110a(6)) {
                    Log.e(bVar2.f9553a, "Error closing session file stream in the presence of an exception", e);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m9401a(InputStream inputStream, C4142c cVar, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        if (cVar != null) {
            int i3 = cVar.f10026f;
            int i4 = cVar.f10027g;
            int i5 = i3 - i4;
            if (i5 >= i) {
                System.arraycopy(bArr, 0, cVar.f10025e, i4, i);
                cVar.f10027g += i;
                return;
            }
            System.arraycopy(bArr, 0, cVar.f10025e, i4, i5);
            int i6 = i5 + 0;
            int i7 = i - i5;
            cVar.f10027g = cVar.f10026f;
            cVar.mo10345a();
            if (i7 <= cVar.f10026f) {
                System.arraycopy(bArr, i6, cVar.f10025e, 0, i7);
                cVar.f10027g = i7;
                return;
            }
            cVar.f10028h.write(bArr, i6, i7);
            return;
        }
        throw null;
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [int] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r5v20, types: [boolean] */
    /* JADX WARNING: type inference failed for: r10v13, types: [boolean] */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: type inference failed for: r8v11, types: [boolean] */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: type inference failed for: r10v22 */
    /* JADX WARNING: type inference failed for: r10v24 */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* JADX WARNING: type inference failed for: r5v24 */
    /* JADX WARNING: type inference failed for: r4v30 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: type inference failed for: r7v20 */
    /* JADX WARNING: type inference failed for: r7v21 */
    /* JADX WARNING: type inference failed for: r7v22 */
    /* JADX WARNING: type inference failed for: r7v23 */
    /* JADX WARNING: type inference failed for: r6v33 */
    /* JADX WARNING: type inference failed for: r6v34 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r7v24 */
    /* JADX WARNING: type inference failed for: r4v31 */
    /* JADX WARNING: type inference failed for: r7v25 */
    /* JADX WARNING: type inference failed for: r7v26 */
    /* JADX WARNING: type inference failed for: r7v27 */
    /* JADX WARNING: type inference failed for: r7v28 */
    /* JADX WARNING: type inference failed for: r7v29 */
    /* JADX WARNING: type inference failed for: r8v24 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:178:0x03cb */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v9
      assigns: []
      uses: []
      mth insns count: 451
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0443 A[Catch:{ IOException -> 0x045a }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0444 A[Catch:{ IOException -> 0x045a }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04a8  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0302 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0108 A[Catch:{ all -> 0x04aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0170  */
    /* JADX WARNING: Unknown variable types count: 20 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10166a(int r14, boolean r15) {
        /*
            r13 = this;
            r0 = r15 ^ 1
            int r1 = r0 + 8
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.io.File[] r3 = r13.mo10182h()
            int r4 = r3.length
            int r1 = java.lang.Math.min(r1, r4)
            r4 = 0
            r5 = r4
        L_0x0014:
            if (r5 >= r1) goto L_0x0022
            r6 = r3[r5]
            java.lang.String r6 = m9399a(r6)
            r2.add(r6)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x0022:
            q.b.d.h.e.l.b r1 = r13.f9729l
            q.b.d.h.e.l.b$b r1 = r1.f9793b
            q.b.d.h.e.k.t$k r1 = (p213q.p217b.p317d.p322h.p323e.p326k.C3975t.C3986k) r1
            java.io.File r1 = r1.mo10190a()
            java.io.File[] r1 = r1.listFiles()
            if (r1 == 0) goto L_0x0058
            int r3 = r1.length
            r5 = r4
        L_0x0034:
            if (r5 >= r3) goto L_0x0058
            r6 = r1[r5]
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = ".temp"
            int r8 = r7.lastIndexOf(r8)
            r9 = -1
            if (r8 != r9) goto L_0x0046
            goto L_0x004c
        L_0x0046:
            r9 = 20
            java.lang.String r7 = r7.substring(r9, r8)
        L_0x004c:
            boolean r7 = r2.contains(r7)
            if (r7 != 0) goto L_0x0055
            r6.delete()
        L_0x0055:
            int r5 = r5 + 1
            goto L_0x0034
        L_0x0058:
            q.b.d.h.e.k.t$g r1 = new q.b.d.h.e.k.t$g
            r3 = 0
            r1.<init>(r3)
            java.io.File[] r1 = r13.mo10175a(r1)
            int r5 = r1.length
            r6 = r4
        L_0x0064:
            r7 = 1
            if (r6 >= r5) goto L_0x00a9
            r8 = r1[r6]
            java.lang.String r9 = r8.getName()
            java.util.regex.Pattern r10 = f9712C
            java.util.regex.Matcher r10 = r10.matcher(r9)
            boolean r11 = r10.matches()
            if (r11 != 0) goto L_0x0083
            q.b.d.h.e.b r7 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Deleting unknown file: "
            goto L_0x0096
        L_0x0083:
            java.lang.String r7 = r10.group(r7)
            boolean r7 = r2.contains(r7)
            if (r7 != 0) goto L_0x00a6
            q.b.d.h.e.b r7 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Trimming session file: "
        L_0x0096:
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r7.mo10108a(r9)
            r8.delete()
        L_0x00a6:
            int r6 = r6 + 1
            goto L_0x0064
        L_0x00a9:
            java.io.File[] r1 = r13.mo10182h()
            int r2 = r1.length
            if (r2 > r0) goto L_0x00b8
            q.b.d.h.e.b r14 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.String r15 = "No open sessions to be closed."
            r14.mo10108a(r15)
            return
        L_0x00b8:
            r2 = r1[r0]
            java.lang.String r2 = m9399a(r2)
            boolean r5 = r13.mo10180f()
            if (r5 == 0) goto L_0x00c7
            q.b.d.h.e.k.y0 r5 = r13.f9721d
            goto L_0x0115
        L_0x00c7:
            q.b.d.h.e.k.t0 r5 = new q.b.d.h.e.k.t0
            java.io.File r6 = r13.mo10177c()
            r5.<init>(r6)
            java.lang.String r6 = "Failed to close user metadata file."
            java.io.File r5 = r5.mo10193a(r2)
            boolean r8 = r5.exists()
            if (r8 != 0) goto L_0x00e2
            q.b.d.h.e.k.y0 r5 = new q.b.d.h.e.k.y0
            r5.<init>()
            goto L_0x0115
        L_0x00e2:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            r8.<init>(r5)     // Catch:{ Exception -> 0x00fb, all -> 0x00f8 }
            java.lang.String r5 = p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9357a(r8)     // Catch:{ Exception -> 0x00f6, all -> 0x00f3 }
            q.b.d.h.e.k.y0 r5 = p213q.p217b.p317d.p322h.p323e.p326k.C3991t0.m9430b(r5)     // Catch:{ Exception -> 0x00f6, all -> 0x00f3 }
            p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9360a(r8, r6)
            goto L_0x0115
        L_0x00f3:
            r14 = move-exception
            goto L_0x04ad
        L_0x00f6:
            r5 = move-exception
            goto L_0x00fd
        L_0x00f8:
            r14 = move-exception
            goto L_0x04ac
        L_0x00fb:
            r5 = move-exception
            r8 = r3
        L_0x00fd:
            q.b.d.h.e.b r9 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c     // Catch:{ all -> 0x04aa }
            java.lang.String r10 = "Error deserializing user metadata."
            r11 = 6
            boolean r11 = r9.mo10110a(r11)     // Catch:{ all -> 0x04aa }
            if (r11 == 0) goto L_0x010d
            java.lang.String r9 = r9.f9553a     // Catch:{ all -> 0x04aa }
            android.util.Log.e(r9, r10, r5)     // Catch:{ all -> 0x04aa }
        L_0x010d:
            p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9360a(r8, r6)
            q.b.d.h.e.k.y0 r5 = new q.b.d.h.e.k.y0
            r5.<init>()
        L_0x0115:
            q.b.d.h.e.k.v r6 = new q.b.d.h.e.k.v
            r6.<init>(r13, r5)
            java.lang.String r5 = "SessionUser"
            r13.mo10168a(r2, r5, r6)
            if (r15 == 0) goto L_0x0126
            q.b.d.h.e.k.w0 r15 = r13.f9736s
            r15.f9778f = r3
            goto L_0x0166
        L_0x0126:
            q.b.d.h.e.a r15 = r13.f9732o
            boolean r15 = r15.mo10107d(r2)
            if (r15 == 0) goto L_0x0166
            q.b.d.h.e.b r15 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.String r5 = "Finalizing native report for session "
            p213q.p214a.p215a.p216a.C1965a.m4759a(r5, r2, r15)
            q.b.d.h.e.a r15 = r13.f9732o
            q.b.d.h.e.d r15 = r15.mo10105b(r2)
            q.b.d.h.e.c$b r15 = (p213q.p217b.p317d.p322h.p323e.C3914c.C3916b) r15
            if (r15 == 0) goto L_0x0165
            q.b.d.h.e.b r15 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "No minidump data found for session "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r15.mo10113c(r3)
            q.b.d.h.e.a r15 = r13.f9732o
            boolean r15 = r15.mo10104a(r2)
            if (r15 != 0) goto L_0x0166
            q.b.d.h.e.b r15 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.String r3 = "Could not finalize native session: "
            p213q.p214a.p215a.p216a.C1965a.m4759a(r3, r2, r15)
            goto L_0x0166
        L_0x0165:
            throw r3
        L_0x0166:
            q.b.d.h.e.b r15 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.String r2 = "Closing open sessions."
            r15.mo10108a(r2)
        L_0x016d:
            int r15 = r1.length
            if (r0 >= r15) goto L_0x0310
            r15 = r1[r0]
            java.lang.String r2 = m9399a(r15)
            q.b.d.h.e.b r3 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.String r5 = "Closing session: "
            p213q.p214a.p215a.p216a.C1965a.m4759a(r5, r2, r3)
            q.b.d.h.e.b r3 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Collecting session parts for ID "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            r3.mo10108a(r5)
            q.b.d.h.e.k.t$i r3 = new q.b.d.h.e.k.t$i
            java.lang.String r5 = "SessionCrash"
            java.lang.String r5 = p213q.p214a.p215a.p216a.C1965a.m4751a(r2, r5)
            r3.<init>(r5)
            java.io.File[] r3 = r13.mo10175a(r3)
            if (r3 == 0) goto L_0x01a9
            int r5 = r3.length
            if (r5 <= 0) goto L_0x01a9
            r5 = r7
            goto L_0x01aa
        L_0x01a9:
            r5 = r4
        L_0x01aa:
            q.b.d.h.e.b r6 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.util.Locale r8 = java.util.Locale.US
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r4] = r2
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)
            r10[r7] = r11
            java.lang.String r11 = "Session %s has fatal exception: %s"
            java.lang.String r8 = java.lang.String.format(r8, r11, r10)
            r6.mo10108a(r8)
            q.b.d.h.e.k.t$i r6 = new q.b.d.h.e.k.t$i
            java.lang.String r8 = "SessionEvent"
            java.lang.String r10 = p213q.p214a.p215a.p216a.C1965a.m4751a(r2, r8)
            r6.<init>(r10)
            java.io.File[] r6 = r13.mo10175a(r6)
            if (r6 == 0) goto L_0x01d8
            int r10 = r6.length
            if (r10 <= 0) goto L_0x01d8
            r10 = r7
            goto L_0x01d9
        L_0x01d8:
            r10 = r4
        L_0x01d9:
            q.b.d.h.e.b r11 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.util.Locale r12 = java.util.Locale.US
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r4] = r2
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r10)
            r9[r7] = r4
            java.lang.String r4 = "Session %s has non-fatal exceptions: %s"
            java.lang.String r4 = java.lang.String.format(r12, r4, r9)
            r11.mo10108a(r4)
            if (r5 != 0) goto L_0x01fe
            if (r10 == 0) goto L_0x01f5
            goto L_0x01fe
        L_0x01f5:
            q.b.d.h.e.b r15 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.String r3 = "No events present for session ID "
            p213q.p214a.p215a.p216a.C1965a.m4759a(r3, r2, r15)
            goto L_0x02d4
        L_0x01fe:
            int r4 = r6.length
            if (r4 <= r14) goto L_0x0236
            q.b.d.h.e.b r4 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)
            r11 = 0
            r9[r11] = r10
            java.lang.String r10 = "Trimming down to %d logged exceptions."
            java.lang.String r6 = java.lang.String.format(r6, r10, r9)
            r4.mo10108a(r6)
            java.io.File r4 = r13.mo10177c()
            q.b.d.h.e.k.t$i r6 = new q.b.d.h.e.k.t$i
            java.lang.String r9 = p213q.p214a.p215a.p216a.C1965a.m4751a(r2, r8)
            r6.<init>(r9)
            java.util.Comparator<java.io.File> r9 = f9711B
            p213q.p217b.p317d.p322h.p323e.p326k.C4003z0.m9439a(r4, r6, r14, r9)
            q.b.d.h.e.k.t$i r4 = new q.b.d.h.e.k.t$i
            java.lang.String r6 = p213q.p214a.p215a.p216a.C1965a.m4751a(r2, r8)
            r4.<init>(r6)
            java.io.File[] r6 = r13.mo10175a(r4)
        L_0x0236:
            if (r5 == 0) goto L_0x023c
            r4 = 0
            r3 = r3[r4]
            goto L_0x023d
        L_0x023c:
            r3 = 0
        L_0x023d:
            java.lang.String r4 = "Failed to close CLS file"
            java.lang.String r5 = "Error flushing session file stream"
            if (r3 == 0) goto L_0x0245
            r8 = r7
            goto L_0x0246
        L_0x0245:
            r8 = 0
        L_0x0246:
            if (r8 == 0) goto L_0x024d
            java.io.File r9 = r13.mo10176b()
            goto L_0x0251
        L_0x024d:
            java.io.File r9 = r13.mo10179e()
        L_0x0251:
            boolean r10 = r9.exists()
            if (r10 != 0) goto L_0x025a
            r9.mkdirs()
        L_0x025a:
            q.b.d.h.e.p.b r10 = new q.b.d.h.e.p.b     // Catch:{ Exception -> 0x02b5, all -> 0x02b1 }
            r10.<init>(r9, r2)     // Catch:{ Exception -> 0x02b5, all -> 0x02b1 }
            q.b.d.h.e.p.c r9 = p213q.p217b.p317d.p322h.p323e.p332p.C4142c.m9570a(r10)     // Catch:{ Exception -> 0x02ae, all -> 0x02ab }
            q.b.d.h.e.b r11 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c     // Catch:{ Exception -> 0x02a9 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a9 }
            r12.<init>()     // Catch:{ Exception -> 0x02a9 }
            java.lang.String r7 = "Collecting SessionStart data for session ID "
            r12.append(r7)     // Catch:{ Exception -> 0x02a6 }
            r12.append(r2)     // Catch:{ Exception -> 0x02a6 }
            java.lang.String r7 = r12.toString()     // Catch:{ Exception -> 0x02a6 }
            r11.mo10108a(r7)     // Catch:{ Exception -> 0x02a6 }
            m9403a(r9, r15)     // Catch:{ Exception -> 0x02a6 }
            r15 = 4
            long r11 = m9407i()     // Catch:{ Exception -> 0x02a6 }
            r9.mo10348a(r15, r11)     // Catch:{ Exception -> 0x02a6 }
            r15 = 5
            r9.mo10350a(r15, r8)     // Catch:{ Exception -> 0x02a6 }
            r15 = 11
            r7 = 1
            r9.mo10354c(r15, r7)     // Catch:{ Exception -> 0x02a9 }
            r15 = 12
            r11 = 3
            r9.mo10347a(r15, r11)     // Catch:{ Exception -> 0x02a9 }
            r13.mo10170a(r9, r2)     // Catch:{ Exception -> 0x02a9 }
            m9404a(r9, r6, r2)     // Catch:{ Exception -> 0x02a9 }
            if (r8 == 0) goto L_0x029f
            m9403a(r9, r3)     // Catch:{ Exception -> 0x02a9 }
        L_0x029f:
            p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9361a(r9, r5)
            p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9360a(r10, r4)
            goto L_0x02d4
        L_0x02a6:
            r15 = move-exception
            r7 = 1
            goto L_0x02b8
        L_0x02a9:
            r15 = move-exception
            goto L_0x02b8
        L_0x02ab:
            r14 = move-exception
            r15 = 0
            goto L_0x0309
        L_0x02ae:
            r15 = move-exception
            r9 = 0
            goto L_0x02b8
        L_0x02b1:
            r14 = move-exception
            r15 = 0
            r10 = 0
            goto L_0x0309
        L_0x02b5:
            r15 = move-exception
            r9 = 0
            r10 = 0
        L_0x02b8:
            q.b.d.h.e.b r3 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c     // Catch:{ all -> 0x0307 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0307 }
            r6.<init>()     // Catch:{ all -> 0x0307 }
            java.lang.String r8 = "Failed to write session file for session ID: "
            r6.append(r8)     // Catch:{ all -> 0x0307 }
            r6.append(r2)     // Catch:{ all -> 0x0307 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0307 }
            r3.mo10112b(r6, r15)     // Catch:{ all -> 0x0307 }
            p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9361a(r9, r5)
            r13.mo10169a(r10)
        L_0x02d4:
            q.b.d.h.e.b r15 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Removing session part files for ID "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r15.mo10108a(r3)
            q.b.d.h.e.k.t$o r15 = new q.b.d.h.e.k.t$o
            r15.<init>(r2)
            java.io.File[] r15 = r13.mo10175a(r15)
            if (r15 != 0) goto L_0x02f6
            goto L_0x0302
        L_0x02f6:
            int r2 = r15.length
            r3 = 0
        L_0x02f8:
            if (r3 >= r2) goto L_0x0302
            r4 = r15[r3]
            r4.delete()
            int r3 = r3 + 1
            goto L_0x02f8
        L_0x0302:
            int r0 = r0 + 1
            r4 = 0
            goto L_0x016d
        L_0x0307:
            r14 = move-exception
            r15 = r9
        L_0x0309:
            p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9361a(r15, r5)
            p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9360a(r10, r4)
            throw r14
        L_0x0310:
            q.b.d.h.e.k.w0 r14 = r13.f9736s
            long r0 = m9407i()
            q.b.d.h.e.o.g r15 = r14.f9774b
            java.lang.String r14 = r14.f9778f
            if (r15 == 0) goto L_0x04a8
            q.b.d.h.e.o.b r2 = new q.b.d.h.e.o.b
            r2.<init>(r14)
            java.io.File r14 = r15.f10013b
            java.util.List r14 = p213q.p217b.p317d.p322h.p323e.p331o.C4137g.m9551a(r14, r2)
            java.util.Comparator<? super java.io.File> r2 = p213q.p217b.p317d.p322h.p323e.p331o.C4137g.f10010j
            java.util.Collections.sort(r14, r2)
            int r2 = r14.size()
            r3 = 8
            if (r2 > r3) goto L_0x0336
            r2 = 0
            goto L_0x0357
        L_0x0336:
            int r2 = r14.size()
            java.util.List r2 = r14.subList(r3, r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0342:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0352
            java.lang.Object r4 = r2.next()
            java.io.File r4 = (java.io.File) r4
            p213q.p217b.p317d.p322h.p323e.p331o.C4137g.m9562d(r4)
            goto L_0x0342
        L_0x0352:
            r2 = 0
            java.util.List r14 = r14.subList(r2, r3)
        L_0x0357:
            java.util.Iterator r14 = r14.iterator()
        L_0x035b:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x0476
            java.lang.Object r3 = r14.next()
            java.io.File r3 = (java.io.File) r3
            java.io.FilenameFilter r4 = p213q.p217b.p317d.p322h.p323e.p331o.C4137g.f10011k
            java.util.List r4 = p213q.p217b.p317d.p322h.p323e.p331o.C4137g.m9552a(r3, r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x0375
            goto L_0x0471
        L_0x0375:
            java.util.Collections.sort(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0381:
            r6 = r2
        L_0x0382:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x03ed
            java.lang.Object r8 = r4.next()
            java.io.File r8 = (java.io.File) r8
            q.b.d.h.e.m.x.f r9 = p213q.p217b.p317d.p322h.p323e.p331o.C4137g.f10009i     // Catch:{ IOException -> 0x03d5 }
            java.lang.String r10 = p213q.p217b.p317d.p322h.p323e.p331o.C4137g.m9560c(r8)     // Catch:{ IOException -> 0x03d5 }
            if (r9 == 0) goto L_0x03d3
            android.util.JsonReader r9 = new android.util.JsonReader     // Catch:{ IllegalStateException -> 0x03cc }
            java.io.StringReader r11 = new java.io.StringReader     // Catch:{ IllegalStateException -> 0x03cc }
            r11.<init>(r10)     // Catch:{ IllegalStateException -> 0x03cc }
            r9.<init>(r11)     // Catch:{ IllegalStateException -> 0x03cc }
            q.b.d.h.e.m.v$d$d r10 = p213q.p217b.p317d.p322h.p323e.p328m.p329x.C4125f.m9539e(r9)     // Catch:{ all -> 0x03c7 }
            r9.close()     // Catch:{ IllegalStateException -> 0x03cc }
            r5.add(r10)     // Catch:{ IOException -> 0x03d5 }
            if (r6 != 0) goto L_0x03c5
            java.lang.String r9 = r8.getName()     // Catch:{ IOException -> 0x03d5 }
            java.lang.String r10 = "event"
            boolean r10 = r9.startsWith(r10)     // Catch:{ IOException -> 0x03d5 }
            if (r10 == 0) goto L_0x03c2
            java.lang.String r10 = "_"
            boolean r6 = r9.endsWith(r10)     // Catch:{ IOException -> 0x03d5 }
            if (r6 == 0) goto L_0x03c2
            r6 = r7
            goto L_0x03c3
        L_0x03c2:
            r6 = r2
        L_0x03c3:
            if (r6 == 0) goto L_0x0381
        L_0x03c5:
            r6 = r7
            goto L_0x0382
        L_0x03c7:
            r10 = move-exception
            r9.close()     // Catch:{ all -> 0x03cb }
        L_0x03cb:
            throw r10     // Catch:{ IllegalStateException -> 0x03cc }
        L_0x03cc:
            r9 = move-exception
            java.io.IOException r10 = new java.io.IOException     // Catch:{ IOException -> 0x03d5 }
            r10.<init>(r9)     // Catch:{ IOException -> 0x03d5 }
            throw r10     // Catch:{ IOException -> 0x03d5 }
        L_0x03d3:
            r9 = 0
            throw r9     // Catch:{ IOException -> 0x03d5 }
        L_0x03d5:
            r9 = move-exception
            q.b.d.h.e.b r10 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Could not add event to report for "
            r11.append(r12)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.mo10109a(r8, r9)
            goto L_0x0382
        L_0x03ed:
            java.io.File r4 = new java.io.File
            java.lang.String r8 = "user"
            r4.<init>(r3, r8)
            boolean r8 = r4.isFile()
            if (r8 == 0) goto L_0x0416
            java.lang.String r4 = p213q.p217b.p317d.p322h.p323e.p331o.C4137g.m9560c(r4)     // Catch:{ IOException -> 0x03ff }
            goto L_0x0417
        L_0x03ff:
            r4 = move-exception
            q.b.d.h.e.b r8 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.String r9 = "Could not read user ID file in "
            java.lang.StringBuilder r9 = p213q.p214a.p215a.p216a.C1965a.m4756a(r9)
            java.lang.String r10 = r3.getName()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.mo10109a(r9, r4)
        L_0x0416:
            r4 = 0
        L_0x0417:
            java.io.File r8 = new java.io.File
            java.lang.String r9 = "report"
            r8.<init>(r3, r9)
            if (r6 == 0) goto L_0x0423
            java.io.File r9 = r15.f10014c
            goto L_0x0425
        L_0x0423:
            java.io.File r9 = r15.f10015d
        L_0x0425:
            q.b.d.h.e.m.x.f r10 = p213q.p217b.p317d.p322h.p323e.p331o.C4137g.f10009i     // Catch:{ IOException -> 0x045a }
            java.lang.String r11 = p213q.p217b.p317d.p322h.p323e.p331o.C4137g.m9560c(r8)     // Catch:{ IOException -> 0x045a }
            q.b.d.h.e.m.v r10 = r10.mo10325a(r11)     // Catch:{ IOException -> 0x045a }
            q.b.d.h.e.m.v r4 = r10.mo10296a(r0, r6, r4)     // Catch:{ IOException -> 0x045a }
            q.b.d.h.e.m.w r6 = new q.b.d.h.e.m.w     // Catch:{ IOException -> 0x045a }
            r6.<init>(r5)     // Catch:{ IOException -> 0x045a }
            q.b.d.h.e.m.v r4 = r4.mo10297a(r6)     // Catch:{ IOException -> 0x045a }
            r5 = r4
            q.b.d.h.e.m.b r5 = (p213q.p217b.p317d.p322h.p323e.p328m.C4043b) r5     // Catch:{ IOException -> 0x045a }
            q.b.d.h.e.m.v$d r5 = r5.f9845h     // Catch:{ IOException -> 0x045a }
            if (r5 != 0) goto L_0x0444
            goto L_0x0471
        L_0x0444:
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x045a }
            p213q.p217b.p317d.p322h.p323e.p331o.C4137g.m9558b(r9)     // Catch:{ IOException -> 0x045a }
            q.b.d.h.e.m.f r5 = (p213q.p217b.p317d.p322h.p323e.p328m.C4052f) r5     // Catch:{ IOException -> 0x045a }
            java.lang.String r5 = r5.f9862b     // Catch:{ IOException -> 0x045a }
            r6.<init>(r9, r5)     // Catch:{ IOException -> 0x045a }
            q.b.d.h.e.m.x.f r5 = p213q.p217b.p317d.p322h.p323e.p331o.C4137g.f10009i     // Catch:{ IOException -> 0x045a }
            java.lang.String r4 = r5.mo10324a(r4)     // Catch:{ IOException -> 0x045a }
            p213q.p217b.p317d.p322h.p323e.p331o.C4137g.m9559b(r6, r4)     // Catch:{ IOException -> 0x045a }
            goto L_0x0471
        L_0x045a:
            r4 = move-exception
            q.b.d.h.e.b r5 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "Could not synthesize final report file for "
            r6.append(r9)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r5.mo10109a(r6, r4)
        L_0x0471:
            p213q.p217b.p317d.p322h.p323e.p331o.C4137g.m9562d(r3)
            goto L_0x035b
        L_0x0476:
            q.b.d.h.e.s.e r14 = r15.f10017f
            q.b.d.h.e.s.d r14 = (p213q.p217b.p317d.p322h.p323e.p337s.C4166d) r14
            q.b.d.h.e.s.i.e r14 = r14.mo10374b()
            q.b.d.h.e.s.i.d r14 = r14.mo10376a()
            int r14 = r14.f10102b
            java.util.List r15 = r15.mo10338b()
            int r0 = r15.size()
            if (r0 > r14) goto L_0x048f
            goto L_0x04a7
        L_0x048f:
            java.util.List r14 = r15.subList(r14, r0)
            java.util.Iterator r14 = r14.iterator()
        L_0x0497:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x04a7
            java.lang.Object r15 = r14.next()
            java.io.File r15 = (java.io.File) r15
            r15.delete()
            goto L_0x0497
        L_0x04a7:
            return
        L_0x04a8:
            r14 = 0
            throw r14
        L_0x04aa:
            r14 = move-exception
            r3 = r8
        L_0x04ac:
            r8 = r3
        L_0x04ad:
            p213q.p217b.p317d.p322h.p323e.p326k.C3944g.m9360a(r8, r6)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p322h.p323e.p326k.C3975t.mo10166a(int, boolean):void");
    }

    /* renamed from: a */
    public boolean mo10173a(int i) {
        this.f9722e.mo10138a();
        if (mo10180f()) {
            C3913b.f9552c.mo10108a("Skipping session finalization because a crash has already occurred.");
            return Boolean.FALSE.booleanValue();
        }
        C3913b.f9552c.mo10108a("Finalizing previously open sessions.");
        try {
            mo10166a(i, false);
            C3913b.f9552c.mo10108a("Closed all previously open sessions");
            return true;
        } catch (Exception e) {
            C3913b bVar = C3913b.f9552c;
            if (bVar.mo10110a(6)) {
                Log.e(bVar.f9553a, "Unable to finalize previously open sessions.", e);
            }
            return false;
        }
    }

    /* renamed from: a */
    public synchronized void mo10172a(C4168e eVar, Thread thread, Throwable th) {
        C3913b bVar = C3913b.f9552c;
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics is handling uncaught exception \"");
        sb.append(th);
        sb.append("\" from thread ");
        sb.append(thread.getName());
        bVar.mo10108a(sb.toString());
        Date date = new Date();
        C3948h hVar = this.f9722e;
        C3980e eVar2 = new C3980e(date, th, thread, eVar);
        try {
            C4003z0.m9441a(hVar.mo10139b(eVar2));
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final File[] mo10175a(FilenameFilter filenameFilter) {
        File[] listFiles = mo10177c().listFiles(filenameFilter);
        return listFiles == null ? new File[0] : listFiles;
    }

    /* renamed from: a */
    public C3255i<Void> mo10165a(float f, C3255i<C4173b> iVar) {
        C3255i iVar2;
        C4145a aVar = this.f9730m;
        File[] g = C3975t.this.mo10181g();
        File[] listFiles = C3975t.this.mo10178d().listFiles();
        boolean z = false;
        Boolean valueOf = Boolean.valueOf(false);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        if ((g != null && g.length > 0) || listFiles.length > 0) {
            z = true;
        }
        if (!z) {
            C3913b.f9552c.mo10108a("No reports are available.");
            this.f9738u.mo8941a(valueOf);
            return C2286e.m5291b(null);
        }
        C3913b.f9552c.mo10108a("Unsent reports are available.");
        boolean a = this.f9719b.mo10149a();
        Boolean valueOf2 = Boolean.valueOf(true);
        if (a) {
            C3913b.f9552c.mo10108a("Automatic data collection is enabled. Allowing upload.");
            this.f9738u.mo8941a(valueOf);
            iVar2 = C2286e.m5291b(valueOf2);
        } else {
            C3913b.f9552c.mo10108a("Automatic data collection is disabled.");
            C3913b.f9552c.mo10108a("Notifying that unsent reports are available.");
            this.f9738u.mo8941a(valueOf2);
            C3255i b = this.f9719b.mo10150b();
            C4002z zVar = new C4002z(this);
            C3250f0 f0Var = (C3250f0) b;
            if (f0Var != null) {
                C3255i a2 = f0Var.mo8927a(C3259k.f8131a, (C3253h<TResult, TContinuationResult>) zVar);
                C3913b.f9552c.mo10108a("Waiting for send/deleteUnsentReports to be called.");
                iVar2 = C4003z0.m9443a(a2, (C3255i<T>) this.f9739v.f8128a);
            } else {
                throw null;
            }
        }
        C3981f fVar = new C3981f(iVar, f);
        C3250f0 f0Var2 = (C3250f0) iVar2;
        if (f0Var2 != null) {
            return f0Var2.mo8927a(C3259k.f8131a, (C3253h<TResult, TContinuationResult>) fVar);
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo10167a(long j) {
        try {
            File c = mo10177c();
            StringBuilder sb = new StringBuilder();
            sb.append(".ae");
            sb.append(j);
            new File(c, sb.toString()).createNewFile();
        } catch (IOException unused) {
            C3913b.f9552c.mo10108a("Could not write app exception marker.");
        }
    }

    /* renamed from: a */
    public final void mo10170a(C4142c cVar, String str) {
        String[] strArr;
        for (String str2 : f9714E) {
            File[] a = mo10175a((FilenameFilter) new C3984i(C1965a.m4752a(str, str2, ".cls")));
            String str3 = " data for session ID ";
            if (a.length == 0) {
                C3913b bVar = C3913b.f9552c;
                StringBuilder sb = new StringBuilder();
                sb.append("Can't find ");
                sb.append(str2);
                sb.append(str3);
                sb.append(str);
                bVar.mo10108a(sb.toString());
            } else {
                C3913b bVar2 = C3913b.f9552c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Collecting ");
                sb2.append(str2);
                sb2.append(str3);
                sb2.append(str);
                bVar2.mo10108a(sb2.toString());
                m9403a(cVar, a[0]);
            }
        }
    }

    /* renamed from: a */
    public static void m9404a(C4142c cVar, File[] fileArr, String str) {
        Arrays.sort(fileArr, C3944g.f9626c);
        for (File file : fileArr) {
            try {
                C3913b.f9552c.mo10108a(String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[]{str, file.getName()}));
                m9403a(cVar, file);
            } catch (Exception e) {
                C3913b bVar = C3913b.f9552c;
                if (bVar.mo10110a(6)) {
                    Log.e(bVar.f9553a, "Error writting non-fatal to session.", e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10171a(C4142c cVar, Thread thread, Throwable th, long j, String str, boolean z) {
        Thread[] threadArr;
        Map map;
        Map map2;
        C4188e eVar = new C4188e(th, this.f9733p);
        Context context = this.f9718a;
        C3938e a = C3938e.m9345a(context);
        Float f = a.f9602a;
        int a2 = a.mo10128a();
        boolean d = C3944g.m9369d(context);
        int i = context.getResources().getConfiguration().orientation;
        long b = C3944g.m9365b();
        MemoryInfo memoryInfo = new MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j2 = b - memoryInfo.availMem;
        long a3 = C3944g.m9353a(Environment.getDataDirectory().getPath());
        RunningAppProcessInfo a4 = C3944g.m9355a(context.getPackageName(), context);
        LinkedList linkedList = new LinkedList();
        StackTraceElement[] stackTraceElementArr = eVar.f10125c;
        String str2 = this.f9726i.f9591b;
        String str3 = this.f9724g.f9697c;
        int i2 = 0;
        if (z) {
            Map allStackTraces = Thread.getAllStackTraces();
            Thread[] threadArr2 = new Thread[allStackTraces.size()];
            for (Entry entry : allStackTraces.entrySet()) {
                threadArr2[i2] = (Thread) entry.getKey();
                linkedList.add(this.f9733p.mo10383a((StackTraceElement[]) entry.getValue()));
                i2++;
            }
            threadArr = threadArr2;
        } else {
            threadArr = new Thread[0];
        }
        if (!C3944g.m9363a(context, "com.crashlytics.CollectCustomKeys", true)) {
            map2 = new TreeMap();
        } else {
            map2 = Collections.unmodifiableMap(this.f9721d.f9783b);
            if (map2 != null && map2.size() > 1) {
                map = new TreeMap(map2);
                String str4 = str3;
                Thread[] threadArr3 = threadArr;
                String str5 = str2;
                Map map3 = map;
                C4144d.m9599a(cVar, j, str, eVar, thread, stackTraceElementArr, threadArr3, linkedList, 8, map3, this.f9729l.f9794c.mo10202c(), a4, i, str4, str5, f, a2, d, j2, a3);
                this.f9729l.f9794c.mo10203d();
            }
        }
        map = map2;
        String str42 = str3;
        Thread[] threadArr32 = threadArr;
        String str52 = str2;
        Map map32 = map;
        C4144d.m9599a(cVar, j, str, eVar, thread, stackTraceElementArr, threadArr32, linkedList, 8, map32, this.f9729l.f9794c.mo10202c(), a4, i, str42, str52, f, a2, d, j2, a3);
        this.f9729l.f9794c.mo10203d();
    }

    /* renamed from: a */
    public static void m9403a(C4142c cVar, File file) {
        String str = "Failed to close file input stream.";
        if (!file.exists()) {
            C3913b bVar = C3913b.f9552c;
            StringBuilder a = C1965a.m4756a("Tried to include a file that doesn't exist: ");
            a.append(file.getName());
            bVar.mo10111b(a.toString());
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                m9401a((InputStream) fileInputStream2, cVar, (int) file.length());
                C3944g.m9360a((Closeable) fileInputStream2, str);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                C3944g.m9360a((Closeable) fileInputStream, str);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C3944g.m9360a((Closeable) fileInputStream, str);
            throw th;
        }
    }
}
