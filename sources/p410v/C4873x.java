package p410v;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.C4557i;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;
import p392u.p406t.C4653a;
import p392u.p406t.C4656d;
import p392u.p409w.C4674a;
import p392u.p409w.C4677c;
import p392u.p409w.C4681g;
import p410v.p411m0.C4737b;
import p423w.C4892f;

/* renamed from: v.x */
public final class C4873x {

    /* renamed from: k */
    public static final char[] f11614k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: l */
    public static final C4876b f11615l = new C4876b(null);

    /* renamed from: a */
    public final boolean f11616a;

    /* renamed from: b */
    public final String f11617b;

    /* renamed from: c */
    public final String f11618c;

    /* renamed from: d */
    public final String f11619d;

    /* renamed from: e */
    public final String f11620e;

    /* renamed from: f */
    public final int f11621f;

    /* renamed from: g */
    public final List<String> f11622g;

    /* renamed from: h */
    public final List<String> f11623h;

    /* renamed from: i */
    public final String f11624i;

    /* renamed from: j */
    public final String f11625j;

    /* renamed from: v.x$a */
    public static final class C4874a {

        /* renamed from: i */
        public static final C4875a f11626i = new C4875a(null);

        /* renamed from: a */
        public String f11627a;

        /* renamed from: b */
        public String f11628b;

        /* renamed from: c */
        public String f11629c;

        /* renamed from: d */
        public String f11630d;

        /* renamed from: e */
        public int f11631e = -1;

        /* renamed from: f */
        public final List<String> f11632f;

        /* renamed from: g */
        public List<String> f11633g;

        /* renamed from: h */
        public String f11634h;

        /* renamed from: v.x$a$a */
        public static final class C4875a {
            public /* synthetic */ C4875a(C4636f fVar) {
            }
        }

        public C4874a() {
            String str = Objects.EMPTY_STRING;
            this.f11628b = str;
            this.f11629c = str;
            ArrayList arrayList = new ArrayList();
            this.f11632f = arrayList;
            arrayList.add(str);
        }

        /* renamed from: a */
        public final C4874a mo11399a(String str) {
            List<String> list;
            if (str != null) {
                String a = C4876b.m10890a(C4873x.f11615l, str, 0, 0, " \"'<>#", true, false, true, false, null, 211);
                if (a != null) {
                    list = C4873x.f11615l.mo11410c(a);
                    this.f11633g = list;
                    return this;
                }
            }
            list = null;
            this.f11633g = list;
            return this;
        }

        /* renamed from: a */
        public final C4874a mo11400a(String str, String str2) {
            String str3 = null;
            if (str != null) {
                if (this.f11633g == null) {
                    this.f11633g = new ArrayList();
                }
                List<String> list = this.f11633g;
                if (list != null) {
                    list.add(C4876b.m10890a(C4873x.f11615l, str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211));
                    List<String> list2 = this.f11633g;
                    if (list2 != null) {
                        if (str2 != null) {
                            str3 = C4876b.m10890a(C4873x.f11615l, str2, 0, 0, " \"'<>#&=", true, false, true, false, null, 211);
                        }
                        list2.add(str3);
                        return this;
                    }
                    C4638h.m10269a();
                    throw null;
                }
                C4638h.m10269a();
                throw null;
            }
            C4638h.m10271a("encodedName");
            throw null;
        }

        /* renamed from: b */
        public final int mo11403b() {
            int i = this.f11631e;
            if (i != -1) {
                return i;
            }
            C4876b bVar = C4873x.f11615l;
            String str = this.f11627a;
            if (str != null) {
                return bVar.mo11405a(str);
            }
            C4638h.m10269a();
            throw null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
            if ((r7.f11629c.length() > 0) != false) goto L_0x0032;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0091, code lost:
            if (r1 != r6.mo11405a(r5)) goto L_0x0098;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r7 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r7.f11627a
                if (r1 == 0) goto L_0x000f
                r0.append(r1)
                java.lang.String r1 = "://"
                goto L_0x0011
            L_0x000f:
                java.lang.String r1 = "//"
            L_0x0011:
                r0.append(r1)
                java.lang.String r1 = r7.f11628b
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L_0x0020
                r1 = r2
                goto L_0x0021
            L_0x0020:
                r1 = r3
            L_0x0021:
                r4 = 58
                if (r1 != 0) goto L_0x0032
                java.lang.String r1 = r7.f11629c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x002f
                r1 = r2
                goto L_0x0030
            L_0x002f:
                r1 = r3
            L_0x0030:
                if (r1 == 0) goto L_0x0050
            L_0x0032:
                java.lang.String r1 = r7.f11628b
                r0.append(r1)
                java.lang.String r1 = r7.f11629c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0040
                goto L_0x0041
            L_0x0040:
                r2 = r3
            L_0x0041:
                if (r2 == 0) goto L_0x004b
                r0.append(r4)
                java.lang.String r1 = r7.f11629c
                r0.append(r1)
            L_0x004b:
                r1 = 64
                r0.append(r1)
            L_0x0050:
                java.lang.String r1 = r7.f11630d
                r2 = 0
                if (r1 == 0) goto L_0x0078
                if (r1 == 0) goto L_0x0074
                r5 = 2
                boolean r1 = p392u.p409w.C4681g.m10316a(r1, r4, r3, r5)
                if (r1 == 0) goto L_0x006e
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r7.f11630d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0078
            L_0x006e:
                java.lang.String r1 = r7.f11630d
                r0.append(r1)
                goto L_0x0078
            L_0x0074:
                p392u.p401r.p403c.C4638h.m10269a()
                throw r2
            L_0x0078:
                int r1 = r7.f11631e
                r5 = -1
                if (r1 != r5) goto L_0x0081
                java.lang.String r1 = r7.f11627a
                if (r1 == 0) goto L_0x009e
            L_0x0081:
                int r1 = r7.mo11403b()
                java.lang.String r5 = r7.f11627a
                if (r5 == 0) goto L_0x0098
                v.x$b r6 = p410v.C4873x.f11615l
                if (r5 == 0) goto L_0x0094
                int r5 = r6.mo11405a(r5)
                if (r1 == r5) goto L_0x009e
                goto L_0x0098
            L_0x0094:
                p392u.p401r.p403c.C4638h.m10269a()
                throw r2
            L_0x0098:
                r0.append(r4)
                r0.append(r1)
            L_0x009e:
                v.x$b r1 = p410v.C4873x.f11615l
                java.util.List<java.lang.String> r1 = r7.f11632f
                if (r1 == 0) goto L_0x00ea
                int r4 = r1.size()
            L_0x00a8:
                if (r3 >= r4) goto L_0x00bb
                r5 = 47
                r0.append(r5)
                java.lang.Object r5 = r1.get(r3)
                java.lang.String r5 = (java.lang.String) r5
                r0.append(r5)
                int r3 = r3 + 1
                goto L_0x00a8
            L_0x00bb:
                java.util.List<java.lang.String> r1 = r7.f11633g
                if (r1 == 0) goto L_0x00d2
                r1 = 63
                r0.append(r1)
                v.x$b r1 = p410v.C4873x.f11615l
                java.util.List<java.lang.String> r3 = r7.f11633g
                if (r3 == 0) goto L_0x00ce
                r1.mo11407a(r3, r0)
                goto L_0x00d2
            L_0x00ce:
                p392u.p401r.p403c.C4638h.m10269a()
                throw r2
            L_0x00d2:
                java.lang.String r1 = r7.f11634h
                if (r1 == 0) goto L_0x00e0
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r7.f11634h
                r0.append(r1)
            L_0x00e0:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                p392u.p401r.p403c.C4638h.m10270a(r0, r1)
                return r0
            L_0x00ea:
                java.lang.String r0 = "$this$toPathString"
                p392u.p401r.p403c.C4638h.m10271a(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p410v.C4873x.C4874a.toString():java.lang.String");
        }

        /* renamed from: a */
        public final C4873x mo11402a() {
            String str = this.f11627a;
            if (str != null) {
                String a = C4876b.m10891a(C4873x.f11615l, this.f11628b, 0, 0, false, 7);
                String a2 = C4876b.m10891a(C4873x.f11615l, this.f11629c, 0, 0, false, 7);
                String str2 = this.f11630d;
                if (str2 != null) {
                    int b = mo11403b();
                    List a3 = C4873x.f11615l.mo11406a(this.f11632f, false);
                    if (a3 != null) {
                        List<String> list = this.f11633g;
                        List a4 = list != null ? C4873x.f11615l.mo11406a(list, true) : null;
                        String str3 = this.f11634h;
                        C4873x xVar = new C4873x(str, a, a2, str2, b, a3, a4, str3 != null ? C4876b.m10891a(C4873x.f11615l, str3, 0, 0, false, 7) : null, toString());
                        return xVar;
                    }
                    throw new C4557i("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /* JADX WARNING: type inference failed for: r8v16 */
        /* JADX WARNING: type inference failed for: r10v16 */
        /* JADX WARNING: type inference failed for: r10v17 */
        /* JADX WARNING: type inference failed for: r10v18 */
        /* JADX WARNING: type inference failed for: r8v17 */
        /* JADX WARNING: type inference failed for: r8v18 */
        /* JADX WARNING: type inference failed for: r24v1 */
        /* JADX WARNING: type inference failed for: r8v20 */
        /* JADX WARNING: type inference failed for: r8v21 */
        /* JADX WARNING: type inference failed for: r8v26 */
        /* JADX WARNING: type inference failed for: r10v30 */
        /* JADX WARNING: type inference failed for: r8v27 */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:695)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:690)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:690)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:690)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
            	at jadx.core.ProcessClass.process(ProcessClass.java:35)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
            */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v17
          assigns: []
          uses: []
          mth insns count: 466
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Removed duplicated region for block: B:142:0x031c  */
        /* JADX WARNING: Removed duplicated region for block: B:154:0x036c  */
        /* JADX WARNING: Removed duplicated region for block: B:155:0x0370  */
        /* JADX WARNING: Removed duplicated region for block: B:231:0x0416 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:232:0x03fb A[SYNTHETIC] */
        /* renamed from: a */
        public final p410v.C4873x.C4874a mo11401a(p410v.C4873x r28, java.lang.String r29) {
            /*
                r27 = this;
                r0 = r27
                r1 = r28
                r12 = r29
                if (r12 == 0) goto L_0x049c
                r2 = 3
                r3 = 0
                int r2 = p410v.p411m0.C4737b.m10448a(r12, r3, r3, r2)
                int r4 = r29.length()
                int r13 = p410v.p411m0.C4737b.m10473b(r12, r2, r4)
                int r4 = r13 - r2
                r5 = 2
                r6 = 58
                r7 = -1
                r8 = 1
                if (r4 >= r5) goto L_0x0020
                goto L_0x0069
            L_0x0020:
                char r4 = r12.charAt(r2)
                r9 = 90
                r10 = 122(0x7a, float:1.71E-43)
                r11 = 65
                r14 = 97
                if (r4 < r14) goto L_0x0030
                if (r4 <= r10) goto L_0x0035
            L_0x0030:
                if (r4 < r11) goto L_0x0069
                if (r4 <= r9) goto L_0x0035
                goto L_0x0069
            L_0x0035:
                r4 = r2
            L_0x0036:
                int r4 = r4 + r8
                if (r4 >= r13) goto L_0x0069
                char r15 = r12.charAt(r4)
                if (r14 <= r15) goto L_0x0040
                goto L_0x0043
            L_0x0040:
                if (r10 < r15) goto L_0x0043
                goto L_0x0061
            L_0x0043:
                if (r11 <= r15) goto L_0x0046
                goto L_0x0049
            L_0x0046:
                if (r9 < r15) goto L_0x0049
                goto L_0x0061
            L_0x0049:
                r9 = 57
                r10 = 48
                if (r10 <= r15) goto L_0x0050
                goto L_0x0053
            L_0x0050:
                if (r9 < r15) goto L_0x0053
                goto L_0x0061
            L_0x0053:
                r9 = 43
                if (r15 != r9) goto L_0x0058
                goto L_0x0061
            L_0x0058:
                r9 = 45
                if (r15 != r9) goto L_0x005d
                goto L_0x0061
            L_0x005d:
                r9 = 46
                if (r15 != r9) goto L_0x0066
            L_0x0061:
                r9 = 90
                r10 = 122(0x7a, float:1.71E-43)
                goto L_0x0036
            L_0x0066:
                if (r15 != r6) goto L_0x0069
                goto L_0x006a
            L_0x0069:
                r4 = r7
            L_0x006a:
                java.lang.String r14 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                if (r4 == r7) goto L_0x00ab
                java.lang.String r9 = "https:"
                boolean r9 = p392u.p409w.C4681g.m10320a(r12, r9, r2, r8)
                if (r9 == 0) goto L_0x007d
                java.lang.String r4 = "https"
                r0.f11627a = r4
                int r2 = r2 + 6
                goto L_0x00b1
            L_0x007d:
                java.lang.String r9 = "http:"
                boolean r9 = p392u.p409w.C4681g.m10320a(r12, r9, r2, r8)
                if (r9 == 0) goto L_0x008c
                java.lang.String r4 = "http"
                r0.f11627a = r4
                int r2 = r2 + 5
                goto L_0x00b1
            L_0x008c:
                java.lang.String r1 = "Expected URL scheme 'http' or 'https' but was '"
                java.lang.StringBuilder r1 = p213q.p214a.p215a.p216a.C1965a.m4756a(r1)
                java.lang.String r2 = r12.substring(r3, r4)
                p392u.p401r.p403c.C4638h.m10270a(r2, r14)
                r1.append(r2)
                java.lang.String r2 = "'"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                r2.<init>(r1)
                throw r2
            L_0x00ab:
                if (r1 == 0) goto L_0x0494
                java.lang.String r4 = r1.f11617b
                r0.f11627a = r4
            L_0x00b1:
                r4 = r2
            L_0x00b2:
                r9 = 47
                r10 = 92
                if (r4 >= r13) goto L_0x00c5
                char r11 = r12.charAt(r4)
                if (r11 == r10) goto L_0x00c0
                if (r11 != r9) goto L_0x00c5
            L_0x00c0:
                int r3 = r3 + 1
                int r4 = r4 + 1
                goto L_0x00b2
            L_0x00c5:
                r4 = 63
                r11 = 35
                if (r3 >= r5) goto L_0x010e
                if (r1 == 0) goto L_0x010e
                java.lang.String r5 = r1.f11617b
                java.lang.String r15 = r0.f11627a
                boolean r5 = p392u.p401r.p403c.C4638h.m10272a(r5, r15)
                r5 = r5 ^ r8
                if (r5 == 0) goto L_0x00d9
                goto L_0x010e
            L_0x00d9:
                java.lang.String r3 = r28.mo11392e()
                r0.f11628b = r3
                java.lang.String r3 = r28.mo11386a()
                r0.f11629c = r3
                java.lang.String r3 = r1.f11620e
                r0.f11630d = r3
                int r3 = r1.f11621f
                r0.f11631e = r3
                java.util.List<java.lang.String> r3 = r0.f11632f
                r3.clear()
                java.util.List<java.lang.String> r3 = r0.f11632f
                java.util.List r4 = r28.mo11390c()
                r3.addAll(r4)
                if (r2 == r13) goto L_0x0103
                char r3 = r12.charAt(r2)
                if (r3 != r11) goto L_0x010a
            L_0x0103:
                java.lang.String r1 = r28.mo11391d()
                r0.mo11399a(r1)
            L_0x010a:
                r17 = r13
                goto L_0x02c4
            L_0x010e:
                int r2 = r2 + r3
                r1 = 0
                r3 = 0
                r15 = r1
                r16 = r3
                r1 = r11
                r11 = r2
            L_0x0116:
                java.lang.String r2 = "@/\\?#"
                int r8 = p410v.p411m0.C4737b.m10450a(r12, r2, r11, r13)
                if (r8 == r13) goto L_0x0123
                char r2 = r12.charAt(r8)
                goto L_0x0124
            L_0x0123:
                r2 = r7
            L_0x0124:
                if (r2 == r7) goto L_0x01ec
                if (r2 == r1) goto L_0x01ec
                if (r2 == r9) goto L_0x01ec
                if (r2 == r10) goto L_0x01ec
                if (r2 == r4) goto L_0x01ec
                r1 = 64
                if (r2 == r1) goto L_0x0136
                r17 = r13
                goto L_0x01dd
            L_0x0136:
                java.lang.String r10 = "%40"
                if (r15 != 0) goto L_0x01a2
                int r9 = p410v.p411m0.C4737b.m10444a(r12, r6, r11, r8)
                v.x$b r1 = p410v.C4873x.f11615l
                r6 = 1
                r7 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r2 = r29
                r3 = r11
                r4 = r9
                r11 = r8
                r8 = r17
                r21 = r9
                r9 = r18
                r22 = r10
                r10 = r19
                r28 = r15
                r15 = r11
                r11 = r20
                java.lang.String r1 = p410v.C4873x.C4876b.m10890a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r16 == 0) goto L_0x017c
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.f11628b
                r2.append(r3)
                r3 = r22
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
            L_0x017c:
                r0.f11628b = r1
                r1 = r21
                if (r1 == r15) goto L_0x019b
                v.x$b r2 = p410v.C4873x.f11615l
                int r3 = r1 + 1
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r2
                r2 = r29
                r4 = r15
                java.lang.String r1 = p410v.C4873x.C4876b.m10890a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r0.f11629c = r1
                r1 = 1
                goto L_0x019d
            L_0x019b:
                r1 = r28
            L_0x019d:
                r16 = 1
                r17 = r13
                goto L_0x01da
            L_0x01a2:
                r3 = r10
                r28 = r15
                r15 = r8
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r1 = r0.f11629c
                r10.append(r1)
                r10.append(r3)
                v.x$b r1 = p410v.C4873x.f11615l
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r17 = 0
                r18 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r2 = r29
                r3 = r11
                r4 = r15
                r11 = r10
                r10 = r17
                r17 = r13
                r13 = r11
                r11 = r18
                java.lang.String r1 = p410v.C4873x.C4876b.m10890a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r13.append(r1)
                java.lang.String r1 = r13.toString()
                r0.f11629c = r1
                r1 = r28
            L_0x01da:
                int r11 = r15 + 1
                r15 = r1
            L_0x01dd:
                r1 = 35
                r4 = 63
                r10 = 92
                r9 = 47
                r7 = -1
                r6 = 58
                r13 = r17
                goto L_0x0116
            L_0x01ec:
                r15 = r8
                r17 = r13
                r8 = r11
            L_0x01f0:
                if (r8 >= r15) goto L_0x0212
                char r1 = r12.charAt(r8)
                r2 = 58
                if (r1 == r2) goto L_0x020e
                r2 = 91
                if (r1 == r2) goto L_0x01ff
                goto L_0x020b
            L_0x01ff:
                int r8 = r8 + 1
                if (r8 >= r15) goto L_0x020b
                char r1 = r12.charAt(r8)
                r2 = 93
                if (r1 != r2) goto L_0x01ff
            L_0x020b:
                int r8 = r8 + 1
                goto L_0x01f0
            L_0x020e:
                r1 = 1
                r10 = r1
                r13 = r8
                goto L_0x0215
            L_0x0212:
                r1 = 1
                r10 = r1
                r13 = r15
            L_0x0215:
                int r9 = r13 + 1
                r7 = 34
                if (r9 >= r15) goto L_0x0298
                v.x$b r1 = p410v.C4873x.f11615l
                r5 = 0
                r6 = 4
                r2 = r29
                r3 = r11
                r4 = r13
                java.lang.String r1 = p410v.C4873x.C4876b.m10891a(r1, r2, r3, r4, r5, r6)
                java.lang.String r1 = p119o.p120a.C0967p0.m2251e(r1)
                r0.f11630d = r1
                v.x$b r1 = p410v.C4873x.f11615l     // Catch:{ NumberFormatException -> 0x0260 }
                java.lang.String r5 = ""     // Catch:{ NumberFormatException -> 0x0260 }
                r6 = 0
                r7 = 0
                r8 = 0
                r16 = 0
                r18 = 0
                r19 = 248(0xf8, float:3.48E-43)
                r2 = r29
                r3 = r9
                r4 = r15
                r23 = r9
                r9 = r16
                r24 = r10
                r10 = r18
                r28 = r11
                r11 = r19
                java.lang.String r1 = p410v.C4873x.C4876b.m10890a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ NumberFormatException -> 0x025d }
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x025d }
                r2 = 65535(0xffff, float:9.1834E-41)
                r8 = r24
                if (r8 <= r1) goto L_0x025a
                goto L_0x0265
            L_0x025a:
                if (r2 < r1) goto L_0x0265
                goto L_0x0266
            L_0x025d:
                r8 = r24
                goto L_0x0265
            L_0x0260:
                r23 = r9
                r8 = r10
                r28 = r11
            L_0x0265:
                r1 = -1
            L_0x0266:
                r0.f11631e = r1
                r2 = -1
                if (r1 == r2) goto L_0x026d
                r10 = r8
                goto L_0x026e
            L_0x026d:
                r10 = 0
            L_0x026e:
                if (r10 == 0) goto L_0x0273
                r7 = 34
                goto L_0x02ba
            L_0x0273:
                java.lang.String r1 = "Invalid URL port: \""
                java.lang.StringBuilder r1 = p213q.p214a.p215a.p216a.C1965a.m4756a(r1)
                r13 = r23
                java.lang.String r2 = r12.substring(r13, r15)
                p392u.p401r.p403c.C4638h.m10270a(r2, r14)
                r1.append(r2)
                r2 = 34
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L_0x0298:
                r8 = r10
                r28 = r11
                v.x$b r1 = p410v.C4873x.f11615l
                r5 = 0
                r6 = 4
                r2 = r29
                r3 = r28
                r4 = r13
                java.lang.String r1 = p410v.C4873x.C4876b.m10891a(r1, r2, r3, r4, r5, r6)
                java.lang.String r1 = p119o.p120a.C0967p0.m2251e(r1)
                r0.f11630d = r1
                v.x$b r1 = p410v.C4873x.f11615l
                java.lang.String r2 = r0.f11627a
                if (r2 == 0) goto L_0x048f
                int r1 = r1.mo11405a(r2)
                r0.f11631e = r1
            L_0x02ba:
                java.lang.String r1 = r0.f11630d
                if (r1 == 0) goto L_0x02c0
                r10 = r8
                goto L_0x02c1
            L_0x02c0:
                r10 = 0
            L_0x02c1:
                if (r10 == 0) goto L_0x046c
                r2 = r15
            L_0x02c4:
                java.lang.String r1 = "?#"
                r3 = r17
                int r1 = p410v.p411m0.C4737b.m10450a(r12, r1, r2, r3)
                if (r2 != r1) goto L_0x02d3
                r14 = r0
                r11 = r3
                r13 = r12
                goto L_0x041c
            L_0x02d3:
                char r4 = r12.charAt(r2)
                java.lang.String r5 = ""
                r6 = 47
                if (r4 == r6) goto L_0x02fa
                r6 = 92
                if (r4 != r6) goto L_0x02e2
                goto L_0x02fa
            L_0x02e2:
                java.util.List<java.lang.String> r4 = r0.f11632f
                int r6 = r4.size()
                int r6 = r6 - r8
                r4.set(r6, r5)
                r10 = r0
                r16 = r10
                r14 = r1
                r15 = r14
                r4 = r2
                r17 = r3
                r11 = r8
                r1 = r12
                r9 = r1
                r13 = r9
                r12 = r5
                goto L_0x031a
            L_0x02fa:
                java.util.List<java.lang.String> r4 = r0.f11632f
                r4.clear()
                java.util.List<java.lang.String> r4 = r0.f11632f
                r4.add(r5)
                r7 = r0
                r9 = r7
                r4 = r1
                r13 = r3
                r6 = r5
                r3 = r4
                r5 = r2
                r1 = r12
                r2 = r1
            L_0x030d:
                int r5 = r5 + r8
                r14 = r3
                r15 = r4
                r4 = r5
                r16 = r7
                r11 = r8
                r10 = r9
                r9 = r12
                r17 = r13
                r13 = r2
                r12 = r6
            L_0x031a:
                if (r4 >= r15) goto L_0x0416
                java.lang.String r2 = "/\\"
                int r8 = p410v.p411m0.C4737b.m10450a(r9, r2, r4, r15)
                if (r8 >= r15) goto L_0x0327
                r18 = r11
                goto L_0x032a
            L_0x0327:
                r2 = 0
                r18 = r2
            L_0x032a:
                r7 = 1
                v.x$b r2 = p410v.C4873x.f11615l
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 240(0xf0, float:3.36E-43)
                java.lang.String r6 = " \"<>^`{}|/\\?#"
                r3 = r9
                r5 = r8
                r24 = r8
                r8 = r19
                r19 = r9
                r9 = r20
                r25 = r10
                r10 = r21
                r26 = r11
                r11 = r22
                r0 = r12
                r12 = r23
                java.lang.String r2 = p410v.C4873x.C4876b.m10890a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                java.lang.String r3 = "."
                boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r2, r3)
                if (r3 != 0) goto L_0x0367
                java.lang.String r3 = "%2e"
                r8 = r26
                boolean r3 = p392u.p409w.C4681g.m10322a(r2, r3, r8)
                if (r3 == 0) goto L_0x0365
                goto L_0x0369
            L_0x0365:
                r11 = 0
                goto L_0x036a
            L_0x0367:
                r8 = r26
            L_0x0369:
                r11 = r8
            L_0x036a:
                if (r11 == 0) goto L_0x0370
                r9 = r25
                goto L_0x03f9
            L_0x0370:
                java.lang.String r3 = ".."
                boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r2, r3)
                if (r3 != 0) goto L_0x0393
                java.lang.String r3 = "%2e."
                boolean r3 = p392u.p409w.C4681g.m10322a(r2, r3, r8)
                if (r3 != 0) goto L_0x0393
                java.lang.String r3 = ".%2e"
                boolean r3 = p392u.p409w.C4681g.m10322a(r2, r3, r8)
                if (r3 != 0) goto L_0x0393
                java.lang.String r3 = "%2e%2e"
                boolean r3 = p392u.p409w.C4681g.m10322a(r2, r3, r8)
                if (r3 == 0) goto L_0x0391
                goto L_0x0393
            L_0x0391:
                r11 = 0
                goto L_0x0394
            L_0x0393:
                r11 = r8
            L_0x0394:
                if (r11 == 0) goto L_0x03ca
                r9 = r25
                java.util.List<java.lang.String> r2 = r9.f11632f
                int r3 = r2.size()
                int r3 = r3 - r8
                java.lang.Object r2 = r2.remove(r3)
                java.lang.String r2 = (java.lang.String) r2
                int r2 = r2.length()
                if (r2 != 0) goto L_0x03ad
                r11 = r8
                goto L_0x03ae
            L_0x03ad:
                r11 = 0
            L_0x03ae:
                if (r11 == 0) goto L_0x03c4
                java.util.List<java.lang.String> r2 = r9.f11632f
                boolean r2 = r2.isEmpty()
                r2 = r2 ^ r8
                if (r2 == 0) goto L_0x03c4
                java.util.List<java.lang.String> r2 = r9.f11632f
                int r3 = r2.size()
                int r3 = r3 - r8
                r2.set(r3, r0)
                goto L_0x03f9
            L_0x03c4:
                java.util.List<java.lang.String> r2 = r9.f11632f
                r2.add(r0)
                goto L_0x03f9
            L_0x03ca:
                r9 = r25
                java.util.List<java.lang.String> r3 = r9.f11632f
                int r4 = r3.size()
                int r4 = r4 - r8
                java.lang.Object r3 = r3.get(r4)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                int r3 = r3.length()
                if (r3 != 0) goto L_0x03e1
                r11 = r8
                goto L_0x03e2
            L_0x03e1:
                r11 = 0
            L_0x03e2:
                java.util.List<java.lang.String> r3 = r9.f11632f
                if (r11 == 0) goto L_0x03ef
                int r4 = r3.size()
                int r4 = r4 - r8
                r3.set(r4, r2)
                goto L_0x03f2
            L_0x03ef:
                r3.add(r2)
            L_0x03f2:
                if (r18 == 0) goto L_0x03f9
                java.util.List<java.lang.String> r2 = r9.f11632f
                r2.add(r0)
            L_0x03f9:
                if (r18 == 0) goto L_0x040b
                r6 = r0
                r2 = r13
                r3 = r14
                r4 = r15
                r7 = r16
                r13 = r17
                r12 = r19
                r5 = r24
                r0 = r27
                goto L_0x030d
            L_0x040b:
                r12 = r0
                r11 = r8
                r10 = r9
                r9 = r19
                r4 = r24
                r0 = r27
                goto L_0x031a
            L_0x0416:
                r12 = r1
                r1 = r14
                r14 = r16
                r11 = r17
            L_0x041c:
                if (r1 >= r11) goto L_0x044c
                char r0 = r13.charAt(r1)
                r2 = 63
                if (r0 != r2) goto L_0x044c
                r15 = 35
                int r16 = p410v.p411m0.C4737b.m10444a(r13, r15, r1, r11)
                v.x$b r10 = p410v.C4873x.f11615l
                int r2 = r1 + 1
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r17 = 208(0xd0, float:2.91E-43)
                java.lang.String r4 = " \"'<>#"
                r0 = r10
                r1 = r12
                r3 = r16
                r15 = r10
                r10 = r17
                java.lang.String r0 = p410v.C4873x.C4876b.m10890a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.util.List r0 = r15.mo11410c(r0)
                r14.f11633g = r0
                r1 = r16
            L_0x044c:
                r15 = 35
                if (r1 >= r11) goto L_0x046b
                char r0 = r13.charAt(r1)
                if (r0 != r15) goto L_0x046b
                v.x$b r0 = p410v.C4873x.f11615l
                int r2 = r1 + 1
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 176(0xb0, float:2.47E-43)
                java.lang.String r4 = ""
                r1 = r12
                r3 = r11
                java.lang.String r0 = p410v.C4873x.C4876b.m10890a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r14.f11634h = r0
            L_0x046b:
                return r14
            L_0x046c:
                java.lang.String r0 = "Invalid URL host: \""
                java.lang.StringBuilder r0 = p213q.p214a.p215a.p216a.C1965a.m4756a(r0)
                r2 = r28
                java.lang.String r1 = r12.substring(r2, r13)
                p392u.p401r.p403c.C4638h.m10270a(r1, r14)
                r0.append(r1)
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x048f:
                p392u.p401r.p403c.C4638h.m10269a()
                r0 = 0
                throw r0
            L_0x0494:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expected URL scheme 'http' or 'https' but no colon was found"
                r0.<init>(r1)
                throw r0
            L_0x049c:
                r0 = 0
                java.lang.String r1 = "input"
                p392u.p401r.p403c.C4638h.m10271a(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p410v.C4873x.C4874a.mo11401a(v.x, java.lang.String):v.x$a");
        }
    }

    /* renamed from: v.x$b */
    public static final class C4876b {
        public /* synthetic */ C4876b(C4636f fVar) {
        }

        /* renamed from: a */
        public static /* synthetic */ String m10890a(C4876b bVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3) {
            String str3;
            int i4;
            boolean z5;
            C4876b bVar2 = bVar;
            String str4 = str;
            String str5 = str2;
            int i5 = i3;
            int i6 = (i5 & 1) != 0 ? 0 : i;
            int length = (i5 & 2) != 0 ? str.length() : i2;
            boolean z6 = (i5 & 8) != 0 ? false : z;
            boolean z7 = (i5 & 16) != 0 ? false : z2;
            boolean z8 = (i5 & 32) != 0 ? false : z3;
            boolean z9 = (i5 & 64) != 0 ? false : z4;
            Charset charset2 = (i5 & 128) != 0 ? null : charset;
            if (bVar2 == null) {
                throw null;
            } else if (str4 == null) {
                C4638h.m10271a("$this$canonicalize");
                throw null;
            } else if (str5 != null) {
                int i7 = i6;
                while (true) {
                    str3 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
                    if (i7 < length) {
                        int codePointAt = str4.codePointAt(i7);
                        i4 = 2;
                        if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z9) || C4681g.m10316a((CharSequence) str5, (char) codePointAt, false, 2) || ((codePointAt == 37 && (!z6 || (z7 && !bVar2.mo11408a(str4, i7, length)))) || (codePointAt == 43 && z8)))) {
                            C4892f fVar = new C4892f();
                            fVar.mo11441a(str4, i6, i7);
                            C4892f fVar2 = null;
                        } else {
                            i7 += Character.charCount(codePointAt);
                        }
                    } else {
                        String substring = str4.substring(i6, length);
                        C4638h.m10270a((Object) substring, str3);
                        return substring;
                    }
                }
                C4892f fVar3 = new C4892f();
                fVar3.mo11441a(str4, i6, i7);
                C4892f fVar22 = null;
                while (i7 < length) {
                    int codePointAt2 = str4.codePointAt(i7);
                    if (!z6 || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 != 43 || !z8) {
                            if (codePointAt2 < 32 || codePointAt2 == 127 || (codePointAt2 >= 128 && !z9)) {
                                z5 = z8;
                            } else {
                                z5 = z8;
                                if (!C4681g.m10316a((CharSequence) str5, (char) codePointAt2, false, i4) && (codePointAt2 != 37 || (z6 && (!z7 || bVar2.mo11408a(str4, i7, length))))) {
                                    fVar3.mo11445b(codePointAt2);
                                    i7 += Character.charCount(codePointAt2);
                                    i4 = 2;
                                    z8 = z5;
                                }
                            }
                            if (fVar22 == null) {
                                fVar22 = new C4892f();
                            }
                            if (charset2 == null || C4638h.m10272a((Object) charset2, (Object) StandardCharsets.UTF_8)) {
                                fVar22.mo11445b(codePointAt2);
                            } else {
                                int charCount = Character.charCount(codePointAt2) + i7;
                                boolean z10 = true;
                                if (i7 >= 0) {
                                    if (charCount >= i7) {
                                        if (charCount > str.length()) {
                                            z10 = false;
                                        }
                                        if (!z10) {
                                            StringBuilder a = C1965a.m4757a("endIndex > string.length: ", charCount, " > ");
                                            a.append(str.length());
                                            throw new IllegalArgumentException(a.toString().toString());
                                        } else if (C4638h.m10272a((Object) charset2, (Object) C4674a.f10859a)) {
                                            fVar22.mo11441a(str4, i7, charCount);
                                        } else {
                                            String substring2 = str4.substring(i7, charCount);
                                            C4638h.m10270a((Object) substring2, str3);
                                            byte[] bytes = substring2.getBytes(charset2);
                                            C4638h.m10270a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                                            fVar22.write(bytes, 0, bytes.length);
                                        }
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("endIndex < beginIndex: ");
                                        sb.append(charCount);
                                        sb.append(" < ");
                                        sb.append(i7);
                                        throw new IllegalArgumentException(sb.toString().toString());
                                    }
                                } else {
                                    throw new IllegalArgumentException(C1965a.m4761b("beginIndex < 0: ", i7).toString());
                                }
                            }
                            while (!fVar22.mo11460i()) {
                                byte readByte = fVar22.readByte() & 255;
                                fVar3.writeByte(37);
                                fVar3.writeByte((int) C4873x.f11614k[(readByte >> 4) & 15]);
                                fVar3.writeByte((int) C4873x.f11614k[readByte & 15]);
                            }
                            i7 += Character.charCount(codePointAt2);
                            i4 = 2;
                            z8 = z5;
                        } else {
                            fVar3.mo11440a(z6 ? "+" : "%2B");
                        }
                    }
                    z5 = z8;
                    i7 += Character.charCount(codePointAt2);
                    i4 = 2;
                    z8 = z5;
                }
                return fVar3.mo11470r();
            } else {
                C4638h.m10271a("encodeSet");
                throw null;
            }
        }

        /* renamed from: a */
        public final List<String> mo11406a(List<String> list, boolean z) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                arrayList.add(str != null ? m10891a(this, str, 0, 0, z, 3) : null);
            }
            List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
            C4638h.m10270a((Object) unmodifiableList, "Collections.unmodifiableList(result)");
            return unmodifiableList;
        }

        /* renamed from: a */
        public final boolean mo11408a(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && C4737b.m10443a(str.charAt(i + 1)) != -1 && C4737b.m10443a(str.charAt(i3)) != -1;
        }

        /* renamed from: b */
        public final C4873x mo11409b(String str) {
            if (str != null) {
                C4874a aVar = new C4874a();
                aVar.mo11401a((C4873x) null, str);
                return aVar.mo11402a();
            }
            C4638h.m10271a("$this$toHttpUrl");
            throw null;
        }

        /* renamed from: c */
        public final List<String> mo11410c(String str) {
            if (str != null) {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (i <= str.length()) {
                    int a = C4681g.m10302a((CharSequence) str, '&', i, false, 4);
                    if (a == -1) {
                        a = str.length();
                    }
                    int a2 = C4681g.m10302a((CharSequence) str, '=', i, false, 4);
                    String str2 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
                    if (a2 == -1 || a2 > a) {
                        String substring = str.substring(i, a);
                        C4638h.m10270a((Object) substring, str2);
                        arrayList.add(substring);
                        arrayList.add(null);
                    } else {
                        String substring2 = str.substring(i, a2);
                        C4638h.m10270a((Object) substring2, str2);
                        arrayList.add(substring2);
                        String substring3 = str.substring(a2 + 1, a);
                        C4638h.m10270a((Object) substring3, str2);
                        arrayList.add(substring3);
                    }
                    i = a + 1;
                }
                return arrayList;
            }
            C4638h.m10271a("$this$toQueryNamesAndValues");
            throw null;
        }

        /* renamed from: a */
        public final int mo11405a(String str) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 3213448) {
                    if (hashCode == 99617003 && str.equals("https")) {
                        return 443;
                    }
                } else if (str.equals("http")) {
                    return 80;
                }
                return -1;
            }
            C4638h.m10271a("scheme");
            throw null;
        }

        /* renamed from: a */
        public static /* synthetic */ String m10891a(C4876b bVar, String str, int i, int i2, boolean z, int i3) {
            int i4;
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            if (bVar == null) {
                throw null;
            } else if (str != null) {
                int i5 = i;
                while (i4 < i2) {
                    char charAt = str.charAt(i4);
                    if (charAt == '%' || (charAt == '+' && z)) {
                        C4892f fVar = new C4892f();
                        fVar.mo11441a(str, i, i4);
                        while (i4 < i2) {
                            int codePointAt = str.codePointAt(i4);
                            if (codePointAt == 37) {
                                int i6 = i4 + 2;
                                if (i6 < i2) {
                                    int a = C4737b.m10443a(str.charAt(i4 + 1));
                                    int a2 = C4737b.m10443a(str.charAt(i6));
                                    if (!(a == -1 || a2 == -1)) {
                                        fVar.writeByte((a << 4) + a2);
                                        i4 = Character.charCount(codePointAt) + i6;
                                    }
                                    fVar.mo11445b(codePointAt);
                                    i4 += Character.charCount(codePointAt);
                                }
                            }
                            if (codePointAt == 43 && z) {
                                fVar.writeByte(32);
                                i4++;
                            }
                            fVar.mo11445b(codePointAt);
                            i4 += Character.charCount(codePointAt);
                        }
                        return fVar.mo11470r();
                    }
                    i5 = i4 + 1;
                }
                String substring = str.substring(i, i2);
                C4638h.m10270a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            } else {
                C4638h.m10271a("$this$percentDecode");
                throw null;
            }
        }

        /* renamed from: a */
        public final void mo11407a(List<String> list, StringBuilder sb) {
            if (list == null) {
                C4638h.m10271a("$this$toQueryString");
                throw null;
            } else if (sb != null) {
                C4653a a = C4656d.m10290a((C4653a) C4656d.m10291b(0, list.size()), 2);
                int i = a.f10839e;
                int i2 = a.f10840f;
                int i3 = a.f10841g;
                if (i3 >= 0) {
                    if (i > i2) {
                        return;
                    }
                } else if (i < i2) {
                    return;
                }
                while (true) {
                    String str = (String) list.get(i);
                    String str2 = (String) list.get(i + 1);
                    if (i > 0) {
                        sb.append('&');
                    }
                    sb.append(str);
                    if (str2 != null) {
                        sb.append('=');
                        sb.append(str2);
                    }
                    if (i != i2) {
                        i += i3;
                    } else {
                        return;
                    }
                }
            } else {
                C4638h.m10271a("out");
                throw null;
            }
        }
    }

    public C4873x(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        if (str == null) {
            C4638h.m10271a("scheme");
            throw null;
        } else if (str2 == null) {
            C4638h.m10271a("username");
            throw null;
        } else if (str3 == null) {
            C4638h.m10271a("password");
            throw null;
        } else if (str4 == null) {
            C4638h.m10271a("host");
            throw null;
        } else if (list == null) {
            C4638h.m10271a("pathSegments");
            throw null;
        } else if (str6 != null) {
            this.f11617b = str;
            this.f11618c = str2;
            this.f11619d = str3;
            this.f11620e = str4;
            this.f11621f = i;
            this.f11622g = list;
            this.f11623h = list2;
            this.f11624i = str5;
            this.f11625j = str6;
            this.f11616a = C4638h.m10272a((Object) str, (Object) "https");
        } else {
            C4638h.m10271a("url");
            throw null;
        }
    }

    /* renamed from: a */
    public final String mo11386a() {
        if (this.f11619d.length() == 0) {
            return Objects.EMPTY_STRING;
        }
        int a = C4681g.m10302a((CharSequence) this.f11625j, ':', this.f11617b.length() + 3, false, 4) + 1;
        int a2 = C4681g.m10302a((CharSequence) this.f11625j, '@', 0, false, 6);
        String str = this.f11625j;
        if (str != null) {
            String substring = str.substring(a, a2);
            C4638h.m10270a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new C4557i("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public final C4874a mo11387a(String str) {
        if (str != null) {
            try {
                C4874a aVar = new C4874a();
                aVar.mo11401a(this, str);
                return aVar;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } else {
            C4638h.m10271a("link");
            throw null;
        }
    }

    /* renamed from: b */
    public final String mo11388b() {
        int a = C4681g.m10302a((CharSequence) this.f11625j, '/', this.f11617b.length() + 3, false, 4);
        String str = this.f11625j;
        int a2 = C4737b.m10450a(str, "?#", a, str.length());
        String str2 = this.f11625j;
        if (str2 != null) {
            String substring = str2.substring(a, a2);
            C4638h.m10270a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new C4557i("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: b */
    public final C4873x mo11389b(String str) {
        if (str != null) {
            C4874a a = mo11387a(str);
            if (a != null) {
                return a.mo11402a();
            }
            return null;
        }
        C4638h.m10271a("link");
        throw null;
    }

    /* renamed from: c */
    public final List<String> mo11390c() {
        int a = C4681g.m10302a((CharSequence) this.f11625j, '/', this.f11617b.length() + 3, false, 4);
        String str = this.f11625j;
        int a2 = C4737b.m10450a(str, "?#", a, str.length());
        ArrayList arrayList = new ArrayList();
        while (a < a2) {
            int i = a + 1;
            int a3 = C4737b.m10444a(this.f11625j, '/', i, a2);
            String str2 = this.f11625j;
            if (str2 != null) {
                String substring = str2.substring(i, a3);
                C4638h.m10270a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(substring);
                a = a3;
            } else {
                throw new C4557i("null cannot be cast to non-null type java.lang.String");
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final String mo11391d() {
        if (this.f11623h == null) {
            return null;
        }
        int a = C4681g.m10302a((CharSequence) this.f11625j, '?', 0, false, 6) + 1;
        String str = this.f11625j;
        int a2 = C4737b.m10444a(str, '#', a, str.length());
        String str2 = this.f11625j;
        if (str2 != null) {
            String substring = str2.substring(a, a2);
            C4638h.m10270a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new C4557i("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: e */
    public final String mo11392e() {
        if (this.f11618c.length() == 0) {
            return Objects.EMPTY_STRING;
        }
        int length = this.f11617b.length() + 3;
        String str = this.f11625j;
        int a = C4737b.m10450a(str, ":@", length, str.length());
        String str2 = this.f11625j;
        if (str2 != null) {
            String substring = str2.substring(length, a);
            C4638h.m10270a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new C4557i("null cannot be cast to non-null type java.lang.String");
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4873x) && C4638h.m10272a((Object) ((C4873x) obj).f11625j, (Object) this.f11625j);
    }

    /* renamed from: f */
    public final C4874a mo11394f() {
        C4874a aVar = new C4874a();
        aVar.f11627a = this.f11617b;
        String e = mo11392e();
        String str = null;
        String str2 = "<set-?>";
        if (e != null) {
            aVar.f11628b = e;
            String a = mo11386a();
            if (a != null) {
                aVar.f11629c = a;
                aVar.f11630d = this.f11620e;
                aVar.f11631e = this.f11621f != f11615l.mo11405a(this.f11617b) ? this.f11621f : -1;
                aVar.f11632f.clear();
                aVar.f11632f.addAll(mo11390c());
                aVar.mo11399a(mo11391d());
                if (this.f11624i != null) {
                    int a2 = C4681g.m10302a((CharSequence) this.f11625j, '#', 0, false, 6) + 1;
                    String str3 = this.f11625j;
                    if (str3 != null) {
                        str = str3.substring(a2);
                        C4638h.m10270a((Object) str, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new C4557i("null cannot be cast to non-null type java.lang.String");
                    }
                }
                aVar.f11634h = str;
                return aVar;
            }
            C4638h.m10271a(str2);
            throw null;
        }
        C4638h.m10271a(str2);
        throw null;
    }

    /* renamed from: g */
    public final String mo11395g() {
        C4874a a = mo11387a("/...");
        if (a == null) {
            C4638h.m10269a();
            throw null;
        } else if (a != null) {
            a.f11628b = C4876b.m10890a(f11615l, Objects.EMPTY_STRING, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
            a.f11629c = C4876b.m10890a(f11615l, Objects.EMPTY_STRING, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
            return a.mo11402a().f11625j;
        } else {
            throw null;
        }
    }

    /* renamed from: h */
    public final URI mo11396h() {
        C4874a f = mo11394f();
        int size = f.f11632f.size();
        for (int i = 0; i < size; i++) {
            List<String> list = f.f11632f;
            list.set(i, C4876b.m10890a(f11615l, (String) list.get(i), 0, 0, "[]", true, true, false, false, null, 227));
        }
        List<String> list2 = f.f11633g;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str = (String) list2.get(i2);
                list2.set(i2, str != null ? C4876b.m10890a(f11615l, str, 0, 0, "\\^`{|}", true, true, true, false, null, 195) : null);
            }
        }
        String str2 = f.f11634h;
        f.f11634h = str2 != null ? C4876b.m10890a(f11615l, str2, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163) : null;
        String aVar = f.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e) {
            try {
                C4677c cVar = new C4677c("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                String str3 = Objects.EMPTY_STRING;
                if (aVar != null) {
                    String replaceAll = cVar.f10873e.matcher(aVar).replaceAll(str3);
                    C4638h.m10270a((Object) replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                    URI create = URI.create(replaceAll);
                    C4638h.m10270a((Object) create, "URI.create(stripped)");
                    return create;
                }
                C4638h.m10271a("input");
                throw null;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public int hashCode() {
        return this.f11625j.hashCode();
    }

    public String toString() {
        return this.f11625j;
    }
}
