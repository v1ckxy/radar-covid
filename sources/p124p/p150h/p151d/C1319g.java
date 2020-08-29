package p124p.p150h.p151d;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* renamed from: p.h.d.g */
public class C1319g {

    /* renamed from: A */
    public String f3968A;

    /* renamed from: B */
    public Bundle f3969B;

    /* renamed from: C */
    public int f3970C = 0;

    /* renamed from: D */
    public int f3971D = 0;

    /* renamed from: E */
    public Notification f3972E;

    /* renamed from: F */
    public RemoteViews f3973F;

    /* renamed from: G */
    public RemoteViews f3974G;

    /* renamed from: H */
    public RemoteViews f3975H;

    /* renamed from: I */
    public String f3976I;

    /* renamed from: J */
    public int f3977J = 0;

    /* renamed from: K */
    public String f3978K;

    /* renamed from: L */
    public long f3979L;

    /* renamed from: M */
    public int f3980M = 0;

    /* renamed from: N */
    public boolean f3981N;

    /* renamed from: O */
    public Notification f3982O;

    /* renamed from: P */
    public boolean f3983P;
    @Deprecated

    /* renamed from: Q */
    public ArrayList<String> f3984Q;

    /* renamed from: a */
    public Context f3985a;

    /* renamed from: b */
    public ArrayList<C1317e> f3986b = new ArrayList<>();

    /* renamed from: c */
    public ArrayList<C1317e> f3987c = new ArrayList<>();

    /* renamed from: d */
    public CharSequence f3988d;

    /* renamed from: e */
    public CharSequence f3989e;

    /* renamed from: f */
    public PendingIntent f3990f;

    /* renamed from: g */
    public PendingIntent f3991g;

    /* renamed from: h */
    public RemoteViews f3992h;

    /* renamed from: i */
    public Bitmap f3993i;

    /* renamed from: j */
    public CharSequence f3994j;

    /* renamed from: k */
    public int f3995k;

    /* renamed from: l */
    public int f3996l;

    /* renamed from: m */
    public boolean f3997m = true;

    /* renamed from: n */
    public boolean f3998n;

    /* renamed from: o */
    public C1320h f3999o;

    /* renamed from: p */
    public CharSequence f4000p;

    /* renamed from: q */
    public CharSequence[] f4001q;

    /* renamed from: r */
    public int f4002r;

    /* renamed from: s */
    public int f4003s;

    /* renamed from: t */
    public boolean f4004t;

    /* renamed from: u */
    public String f4005u;

    /* renamed from: v */
    public boolean f4006v;

    /* renamed from: w */
    public String f4007w;

    /* renamed from: x */
    public boolean f4008x = false;

    /* renamed from: y */
    public boolean f4009y;

    /* renamed from: z */
    public boolean f4010z;

    public C1319g(Context context, String str) {
        Notification notification = new Notification();
        this.f3982O = notification;
        this.f3985a = context;
        this.f3976I = str;
        notification.when = System.currentTimeMillis();
        this.f3982O.audioStreamType = -1;
        this.f3996l = 0;
        this.f3984Q = new ArrayList<>();
        this.f3981N = true;
    }

    /* renamed from: c */
    public static CharSequence m3364c(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            charSequence = charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    /* JADX WARNING: type inference failed for: r7v6, types: [android.app.Notification$BubbleMetadata, long[], android.net.Uri] */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r7v22 */
    /* JADX WARNING: type inference failed for: r7v33 */
    /* JADX WARNING: type inference failed for: r7v34 */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0326, code lost:
        if (r9 == 1) goto L_0x036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0369, code lost:
        if (r9 == 1) goto L_0x036b;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v6, types: [android.app.Notification$BubbleMetadata, long[], android.net.Uri]
      assigns: []
      uses: [long[], android.net.Uri, android.app.Notification$BubbleMetadata]
      mth insns count: 353
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
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x029c  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Notification mo5784a() {
        /*
            r16 = this;
            r0 = r16
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L_0x001c
            android.app.Notification$Builder r2 = new android.app.Notification$Builder
            android.content.Context r4 = r0.f3985a
            java.lang.String r5 = r0.f3976I
            r2.<init>(r4, r5)
            goto L_0x0023
        L_0x001c:
            android.app.Notification$Builder r2 = new android.app.Notification$Builder
            android.content.Context r4 = r0.f3985a
            r2.<init>(r4)
        L_0x0023:
            android.app.Notification r4 = r0.f3982O
            long r5 = r4.when
            android.app.Notification$Builder r5 = r2.setWhen(r5)
            int r6 = r4.icon
            int r7 = r4.iconLevel
            android.app.Notification$Builder r5 = r5.setSmallIcon(r6, r7)
            android.widget.RemoteViews r6 = r4.contentView
            android.app.Notification$Builder r5 = r5.setContent(r6)
            java.lang.CharSequence r6 = r4.tickerText
            android.widget.RemoteViews r7 = r0.f3992h
            android.app.Notification$Builder r5 = r5.setTicker(r6, r7)
            long[] r6 = r4.vibrate
            android.app.Notification$Builder r5 = r5.setVibrate(r6)
            int r6 = r4.ledARGB
            int r7 = r4.ledOnMS
            int r8 = r4.ledOffMS
            android.app.Notification$Builder r5 = r5.setLights(r6, r7, r8)
            int r6 = r4.flags
            r7 = 2
            r6 = r6 & r7
            r8 = 0
            if (r6 == 0) goto L_0x005a
            r6 = 1
            goto L_0x005b
        L_0x005a:
            r6 = r8
        L_0x005b:
            android.app.Notification$Builder r5 = r5.setOngoing(r6)
            int r6 = r4.flags
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0067
            r6 = 1
            goto L_0x0068
        L_0x0067:
            r6 = r8
        L_0x0068:
            android.app.Notification$Builder r5 = r5.setOnlyAlertOnce(r6)
            int r6 = r4.flags
            r6 = r6 & 16
            if (r6 == 0) goto L_0x0074
            r6 = 1
            goto L_0x0075
        L_0x0074:
            r6 = r8
        L_0x0075:
            android.app.Notification$Builder r5 = r5.setAutoCancel(r6)
            int r6 = r4.defaults
            android.app.Notification$Builder r5 = r5.setDefaults(r6)
            java.lang.CharSequence r6 = r0.f3988d
            android.app.Notification$Builder r5 = r5.setContentTitle(r6)
            java.lang.CharSequence r6 = r0.f3989e
            android.app.Notification$Builder r5 = r5.setContentText(r6)
            java.lang.CharSequence r6 = r0.f3994j
            android.app.Notification$Builder r5 = r5.setContentInfo(r6)
            android.app.PendingIntent r6 = r0.f3990f
            android.app.Notification$Builder r5 = r5.setContentIntent(r6)
            android.app.PendingIntent r6 = r4.deleteIntent
            android.app.Notification$Builder r5 = r5.setDeleteIntent(r6)
            android.app.PendingIntent r6 = r0.f3991g
            int r10 = r4.flags
            r10 = r10 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x00a7
            r10 = 1
            goto L_0x00a8
        L_0x00a7:
            r10 = r8
        L_0x00a8:
            android.app.Notification$Builder r5 = r5.setFullScreenIntent(r6, r10)
            android.graphics.Bitmap r6 = r0.f3993i
            android.app.Notification$Builder r5 = r5.setLargeIcon(r6)
            int r6 = r0.f3995k
            android.app.Notification$Builder r5 = r5.setNumber(r6)
            int r6 = r0.f4002r
            int r10 = r0.f4003s
            boolean r11 = r0.f4004t
            r5.setProgress(r6, r10, r11)
            java.lang.CharSequence r5 = r0.f4000p
            android.app.Notification$Builder r5 = r2.setSubText(r5)
            boolean r6 = r0.f3998n
            android.app.Notification$Builder r5 = r5.setUsesChronometer(r6)
            int r6 = r0.f3996l
            r5.setPriority(r6)
            java.util.ArrayList<p.h.d.e> r5 = r0.f3986b
            java.util.Iterator r5 = r5.iterator()
        L_0x00d8:
            boolean r6 = r5.hasNext()
            r10 = 29
            r11 = 24
            r12 = 0
            if (r6 == 0) goto L_0x0168
            java.lang.Object r6 = r5.next()
            p.h.d.e r6 = (p124p.p150h.p151d.C1317e) r6
            androidx.core.graphics.drawable.IconCompat r13 = r6.mo5783a()
            android.app.Notification$Action$Builder r14 = new android.app.Notification$Action$Builder
            if (r13 == 0) goto L_0x00f6
            android.graphics.drawable.Icon r13 = r13.mo688d()
            goto L_0x00f7
        L_0x00f6:
            r13 = r12
        L_0x00f7:
            java.lang.CharSequence r15 = r6.f3965j
            android.app.PendingIntent r9 = r6.f3966k
            r14.<init>(r13, r15, r9)
            p.h.d.j[] r9 = r6.f3958c
            if (r9 == 0) goto L_0x0119
            int r13 = r9.length
            android.app.RemoteInput[] r13 = new android.app.RemoteInput[r13]
            int r15 = r9.length
            if (r15 > 0) goto L_0x0114
            int r9 = r13.length
            r12 = r8
        L_0x010a:
            if (r12 >= r9) goto L_0x0119
            r15 = r13[r12]
            r14.addRemoteInput(r15)
            int r12 = r12 + 1
            goto L_0x010a
        L_0x0114:
            r1 = r9[r8]
            android.app.RemoteInput$Builder r1 = new android.app.RemoteInput$Builder
            throw r12
        L_0x0119:
            android.os.Bundle r9 = r6.f3956a
            if (r9 == 0) goto L_0x0125
            android.os.Bundle r9 = new android.os.Bundle
            android.os.Bundle r12 = r6.f3956a
            r9.<init>(r12)
            goto L_0x012a
        L_0x0125:
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
        L_0x012a:
            boolean r12 = r6.f3960e
            java.lang.String r13 = "android.support.allowGeneratedReplies"
            r9.putBoolean(r13, r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r11) goto L_0x013a
            boolean r11 = r6.f3960e
            r14.setAllowGeneratedReplies(r11)
        L_0x013a:
            int r11 = r6.f3962g
            java.lang.String r12 = "android.support.action.semanticAction"
            r9.putInt(r12, r11)
            int r11 = android.os.Build.VERSION.SDK_INT
            r12 = 28
            if (r11 < r12) goto L_0x014c
            int r11 = r6.f3962g
            r14.setSemanticAction(r11)
        L_0x014c:
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 < r10) goto L_0x0155
            boolean r10 = r6.f3963h
            r14.setContextual(r10)
        L_0x0155:
            boolean r6 = r6.f3961f
            java.lang.String r10 = "android.support.action.showsUserInterface"
            r9.putBoolean(r10, r6)
            r14.addExtras(r9)
            android.app.Notification$Action r6 = r14.build()
            r2.addAction(r6)
            goto L_0x00d8
        L_0x0168:
            android.os.Bundle r5 = r0.f3969B
            if (r5 == 0) goto L_0x016f
            r1.putAll(r5)
        L_0x016f:
            android.widget.RemoteViews r5 = r0.f3973F
            android.widget.RemoteViews r6 = r0.f3974G
            boolean r9 = r0.f3997m
            r2.setShowWhen(r9)
            boolean r9 = r0.f4008x
            android.app.Notification$Builder r9 = r2.setLocalOnly(r9)
            java.lang.String r13 = r0.f4005u
            android.app.Notification$Builder r9 = r9.setGroup(r13)
            boolean r13 = r0.f4006v
            android.app.Notification$Builder r9 = r9.setGroupSummary(r13)
            java.lang.String r13 = r0.f4007w
            r9.setSortKey(r13)
            int r9 = r0.f3980M
            java.lang.String r13 = r0.f3968A
            android.app.Notification$Builder r13 = r2.setCategory(r13)
            int r14 = r0.f3970C
            android.app.Notification$Builder r13 = r13.setColor(r14)
            int r14 = r0.f3971D
            android.app.Notification$Builder r13 = r13.setVisibility(r14)
            android.app.Notification r14 = r0.f3972E
            android.app.Notification$Builder r13 = r13.setPublicVersion(r14)
            android.net.Uri r14 = r4.sound
            android.media.AudioAttributes r15 = r4.audioAttributes
            r13.setSound(r14, r15)
            java.util.ArrayList<java.lang.String> r13 = r0.f3984Q
            java.util.Iterator r13 = r13.iterator()
        L_0x01b6:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x01c6
            java.lang.Object r14 = r13.next()
            java.lang.String r14 = (java.lang.String) r14
            r2.addPerson(r14)
            goto L_0x01b6
        L_0x01c6:
            android.widget.RemoteViews r13 = r0.f3975H
            java.util.ArrayList<p.h.d.e> r14 = r0.f3987c
            int r14 = r14.size()
            if (r14 <= 0) goto L_0x0227
            android.os.Bundle r14 = r0.f3969B
            if (r14 != 0) goto L_0x01db
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>()
            r0.f3969B = r14
        L_0x01db:
            android.os.Bundle r14 = r0.f3969B
            java.lang.String r15 = "android.car.EXTENSIONS"
            android.os.Bundle r14 = r14.getBundle(r15)
            if (r14 != 0) goto L_0x01ea
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>()
        L_0x01ea:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            r10 = r8
        L_0x01f0:
            java.util.ArrayList<p.h.d.e> r8 = r0.f3987c
            int r8 = r8.size()
            if (r10 >= r8) goto L_0x020f
            java.lang.String r8 = java.lang.Integer.toString(r10)
            java.util.ArrayList<p.h.d.e> r12 = r0.f3987c
            java.lang.Object r12 = r12.get(r10)
            p.h.d.e r12 = (p124p.p150h.p151d.C1317e) r12
            android.os.Bundle r12 = p124p.p150h.p151d.C1321i.m3370a(r12)
            r7.putBundle(r8, r12)
            int r10 = r10 + 1
            r12 = 0
            goto L_0x01f0
        L_0x020f:
            java.lang.String r8 = "invisible_actions"
            r14.putBundle(r8, r7)
            android.os.Bundle r7 = r0.f3969B
            if (r7 != 0) goto L_0x021f
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            r0.f3969B = r7
        L_0x021f:
            android.os.Bundle r7 = r0.f3969B
            r7.putBundle(r15, r14)
            r1.putBundle(r15, r14)
        L_0x0227:
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r11) goto L_0x024b
            android.os.Bundle r7 = r0.f3969B
            android.app.Notification$Builder r7 = r2.setExtras(r7)
            java.lang.CharSequence[] r8 = r0.f4001q
            r7.setRemoteInputHistory(r8)
            android.widget.RemoteViews r7 = r0.f3973F
            if (r7 == 0) goto L_0x023d
            r2.setCustomContentView(r7)
        L_0x023d:
            android.widget.RemoteViews r7 = r0.f3974G
            if (r7 == 0) goto L_0x0244
            r2.setCustomBigContentView(r7)
        L_0x0244:
            android.widget.RemoteViews r7 = r0.f3975H
            if (r7 == 0) goto L_0x024b
            r2.setCustomHeadsUpContentView(r7)
        L_0x024b:
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r3) goto L_0x0289
            int r7 = r0.f3977J
            android.app.Notification$Builder r7 = r2.setBadgeIconType(r7)
            java.lang.String r8 = r0.f3978K
            android.app.Notification$Builder r7 = r7.setShortcutId(r8)
            long r14 = r0.f3979L
            android.app.Notification$Builder r7 = r7.setTimeoutAfter(r14)
            int r8 = r0.f3980M
            r7.setGroupAlertBehavior(r8)
            boolean r7 = r0.f4010z
            if (r7 == 0) goto L_0x026f
            boolean r7 = r0.f4009y
            r2.setColorized(r7)
        L_0x026f:
            java.lang.String r7 = r0.f3976I
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x0289
            r7 = 0
            android.app.Notification$Builder r8 = r2.setSound(r7)
            r10 = 0
            android.app.Notification$Builder r8 = r8.setDefaults(r10)
            android.app.Notification$Builder r8 = r8.setLights(r10, r10, r10)
            r8.setVibrate(r7)
            goto L_0x028a
        L_0x0289:
            r7 = 0
        L_0x028a:
            int r8 = android.os.Build.VERSION.SDK_INT
            r10 = 29
            if (r8 < r10) goto L_0x0298
            boolean r8 = r0.f3981N
            r2.setAllowSystemGeneratedContextualActions(r8)
            r2.setBubbleMetadata(r7)
        L_0x0298:
            boolean r8 = r0.f3983P
            if (r8 == 0) goto L_0x02cb
            boolean r8 = r0.f4006v
            if (r8 == 0) goto L_0x02a2
            r8 = 2
            goto L_0x02a3
        L_0x02a2:
            r8 = 1
        L_0x02a3:
            r2.setVibrate(r7)
            r2.setSound(r7)
            int r7 = r4.defaults
            r7 = r7 & -2
            r4.defaults = r7
            r7 = r7 & -3
            r4.defaults = r7
            r2.setDefaults(r7)
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r3) goto L_0x02ca
            java.lang.String r4 = r0.f4005u
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x02c7
            java.lang.String r4 = "silent"
            r2.setGroup(r4)
        L_0x02c7:
            r2.setGroupAlertBehavior(r8)
        L_0x02ca:
            r9 = r8
        L_0x02cb:
            p.h.d.h r4 = r0.f3999o
            if (r4 == 0) goto L_0x02e9
            r7 = r4
            p.h.d.f r7 = (p124p.p150h.p151d.C1318f) r7
            android.app.Notification$BigTextStyle r8 = new android.app.Notification$BigTextStyle
            r8.<init>(r2)
            r10 = 0
            android.app.Notification$BigTextStyle r8 = r8.setBigContentTitle(r10)
            java.lang.CharSequence r12 = r7.f3967c
            android.app.Notification$BigTextStyle r8 = r8.bigText(r12)
            boolean r7 = r7.f4012b
            if (r7 == 0) goto L_0x02e9
            r8.setSummaryText(r10)
        L_0x02e9:
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r3) goto L_0x02f3
            android.app.Notification r1 = r2.build()
            goto L_0x037a
        L_0x02f3:
            if (r7 < r11) goto L_0x0329
            android.app.Notification r1 = r2.build()
            if (r9 == 0) goto L_0x037a
            java.lang.String r2 = r1.getGroup()
            if (r2 == 0) goto L_0x0319
            int r2 = r1.flags
            r2 = r2 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0319
            r2 = 2
            if (r9 != r2) goto L_0x0319
            r2 = 0
            r1.sound = r2
            r1.vibrate = r2
            int r2 = r1.defaults
            r2 = r2 & -2
            r1.defaults = r2
            r2 = r2 & -3
            r1.defaults = r2
        L_0x0319:
            java.lang.String r2 = r1.getGroup()
            if (r2 == 0) goto L_0x037a
            int r2 = r1.flags
            r2 = r2 & 512(0x200, float:7.175E-43)
            if (r2 != 0) goto L_0x037a
            r2 = 1
            if (r9 != r2) goto L_0x037a
            goto L_0x036b
        L_0x0329:
            r2.setExtras(r1)
            android.app.Notification r1 = r2.build()
            if (r5 == 0) goto L_0x0334
            r1.contentView = r5
        L_0x0334:
            if (r6 == 0) goto L_0x0338
            r1.bigContentView = r6
        L_0x0338:
            if (r13 == 0) goto L_0x033c
            r1.headsUpContentView = r13
        L_0x033c:
            if (r9 == 0) goto L_0x037a
            java.lang.String r2 = r1.getGroup()
            if (r2 == 0) goto L_0x035c
            int r2 = r1.flags
            r2 = r2 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x035c
            r2 = 2
            if (r9 != r2) goto L_0x035c
            r2 = 0
            r1.sound = r2
            r1.vibrate = r2
            int r2 = r1.defaults
            r2 = r2 & -2
            r1.defaults = r2
            r2 = r2 & -3
            r1.defaults = r2
        L_0x035c:
            java.lang.String r2 = r1.getGroup()
            if (r2 == 0) goto L_0x037a
            int r2 = r1.flags
            r2 = r2 & 512(0x200, float:7.175E-43)
            if (r2 != 0) goto L_0x037a
            r2 = 1
            if (r9 != r2) goto L_0x037a
        L_0x036b:
            r2 = 0
            r1.sound = r2
            r1.vibrate = r2
            int r2 = r1.defaults
            r2 = r2 & -2
            r1.defaults = r2
            r2 = r2 & -3
            r1.defaults = r2
        L_0x037a:
            android.widget.RemoteViews r2 = r0.f3973F
            if (r2 == 0) goto L_0x0380
            r1.contentView = r2
        L_0x0380:
            if (r4 == 0) goto L_0x0389
            p.h.d.h r2 = r0.f3999o
            if (r2 == 0) goto L_0x0387
            goto L_0x0389
        L_0x0387:
            r2 = 0
            throw r2
        L_0x0389:
            if (r4 == 0) goto L_0x038d
            android.os.Bundle r2 = r1.extras
        L_0x038d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p150h.p151d.C1319g.mo5784a():android.app.Notification");
    }

    /* renamed from: a */
    public C1319g mo5785a(CharSequence charSequence) {
        this.f3989e = m3364c(charSequence);
        return this;
    }

    /* renamed from: a */
    public final void mo5787a(int i, boolean z) {
        Notification notification;
        int i2;
        if (z) {
            notification = this.f3982O;
            i2 = i | notification.flags;
        } else {
            notification = this.f3982O;
            i2 = (~i) & notification.flags;
        }
        notification.flags = i2;
    }

    /* renamed from: b */
    public C1319g mo5788b(CharSequence charSequence) {
        this.f3988d = m3364c(charSequence);
        return this;
    }

    /* renamed from: a */
    public C1319g mo5786a(C1320h hVar) {
        if (this.f3999o != hVar) {
            this.f3999o = hVar;
            if (!(hVar == null || hVar.f4011a == this)) {
                hVar.f4011a = this;
                mo5786a(hVar);
            }
        }
        return this;
    }
}
