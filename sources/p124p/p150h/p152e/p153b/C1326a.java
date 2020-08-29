package p124p.p150h.p152e.p153b;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* renamed from: p.h.e.b.a */
public final class C1326a {

    /* renamed from: a */
    public final Shader f4015a;

    /* renamed from: b */
    public final ColorStateList f4016b;

    /* renamed from: c */
    public int f4017c;

    public C1326a(Shader shader, ColorStateList colorStateList, int i) {
        this.f4015a = shader;
        this.f4016b = colorStateList;
        this.f4017c = i;
    }

    /* JADX WARNING: type inference failed for: r4v7, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r17v0, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r4v11, types: [android.graphics.SweepGradient] */
    /* JADX WARNING: type inference failed for: r12v8, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: type inference failed for: r17v2, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r12v9, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x014f, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r1.toString());
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r17v2, types: [android.graphics.RadialGradient]
      assigns: [android.graphics.RadialGradient, android.graphics.LinearGradient]
      uses: [android.graphics.RadialGradient, android.graphics.Shader, android.graphics.LinearGradient]
      mth insns count: 198
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
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p124p.p150h.p152e.p153b.C1326a m3379a(android.content.res.Resources r26, int r27, android.content.res.Resources.Theme r28) {
        /*
            r0 = r26
            r1 = r28
            android.content.res.XmlResourceParser r2 = r26.getXml(r27)
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r2)
        L_0x000c:
            int r4 = r2.next()
            r5 = 2
            r6 = 1
            if (r4 == r5) goto L_0x0017
            if (r4 == r6) goto L_0x0017
            goto L_0x000c
        L_0x0017:
            if (r4 != r5) goto L_0x0233
            java.lang.String r4 = r2.getName()
            r7 = -1
            int r8 = r4.hashCode()
            r9 = 89650992(0x557f730, float:1.01546526E-35)
            java.lang.String r10 = "gradient"
            r11 = 0
            if (r8 == r9) goto L_0x003a
            r9 = 1191572447(0x4705f3df, float:34291.87)
            if (r8 == r9) goto L_0x0030
            goto L_0x0041
        L_0x0030:
            java.lang.String r8 = "selector"
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x0041
            r7 = r11
            goto L_0x0041
        L_0x003a:
            boolean r8 = r4.equals(r10)
            if (r8 == 0) goto L_0x0041
            r7 = r6
        L_0x0041:
            if (r7 == 0) goto L_0x0224
            if (r7 != r6) goto L_0x0206
            java.lang.String r4 = r2.getName()
            boolean r7 = r4.equals(r10)
            if (r7 == 0) goto L_0x01e8
            int[] r4 = p124p.p150h.C1308c.GradientColor
            android.content.res.TypedArray r4 = p124p.p126b.p127k.C1061o.m2453a(r0, r1, r3, r4)
            int r7 = p124p.p150h.C1308c.GradientColor_android_startX
            r9 = 0
            java.lang.String r10 = "startX"
            float r13 = p124p.p126b.p127k.C1061o.m2430a(r4, r2, r10, r7, r9)
            int r7 = p124p.p150h.C1308c.GradientColor_android_startY
            java.lang.String r10 = "startY"
            float r14 = p124p.p126b.p127k.C1061o.m2430a(r4, r2, r10, r7, r9)
            int r7 = p124p.p150h.C1308c.GradientColor_android_endX
            java.lang.String r10 = "endX"
            float r15 = p124p.p126b.p127k.C1061o.m2430a(r4, r2, r10, r7, r9)
            int r7 = p124p.p150h.C1308c.GradientColor_android_endY
            java.lang.String r10 = "endY"
            float r16 = p124p.p126b.p127k.C1061o.m2430a(r4, r2, r10, r7, r9)
            int r7 = p124p.p150h.C1308c.GradientColor_android_centerX
            java.lang.String r10 = "centerX"
            float r7 = p124p.p126b.p127k.C1061o.m2430a(r4, r2, r10, r7, r9)
            int r10 = p124p.p150h.C1308c.GradientColor_android_centerY
            java.lang.String r12 = "centerY"
            float r10 = p124p.p126b.p127k.C1061o.m2430a(r4, r2, r12, r10, r9)
            int r12 = p124p.p150h.C1308c.GradientColor_android_type
            java.lang.String r8 = "type"
            int r8 = p124p.p126b.p127k.C1061o.m2521b(r4, r2, r8, r12, r11)
            int r12 = p124p.p150h.C1308c.GradientColor_android_startColor
            java.lang.String r5 = "startColor"
            int r5 = p124p.p126b.p127k.C1061o.m2434a(r4, r2, r5, r12, r11)
            java.lang.String r12 = "centerColor"
            boolean r18 = p124p.p126b.p127k.C1061o.m2515a(r2, r12)
            int r6 = p124p.p150h.C1308c.GradientColor_android_centerColor
            int r6 = p124p.p126b.p127k.C1061o.m2434a(r4, r2, r12, r6, r11)
            int r12 = p124p.p150h.C1308c.GradientColor_android_endColor
            java.lang.String r9 = "endColor"
            int r9 = p124p.p126b.p127k.C1061o.m2434a(r4, r2, r9, r12, r11)
            int r12 = p124p.p150h.C1308c.GradientColor_android_tileMode
            java.lang.String r0 = "tileMode"
            int r0 = p124p.p126b.p127k.C1061o.m2521b(r4, r2, r0, r12, r11)
            int r12 = p124p.p150h.C1308c.GradientColor_android_gradientRadius
            java.lang.String r11 = "gradientRadius"
            r21 = r7
            r7 = 0
            float r11 = p124p.p126b.p127k.C1061o.m2430a(r4, r2, r11, r12, r7)
            r4.recycle()
            int r4 = r2.getDepth()
            r7 = 1
            int r4 = r4 + r7
            java.util.ArrayList r12 = new java.util.ArrayList
            r7 = 20
            r12.<init>(r7)
            r22 = r11
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r7)
            r7 = r26
            r23 = r10
        L_0x00d8:
            int r10 = r2.next()
            r24 = r15
            r15 = 1
            if (r10 == r15) goto L_0x0157
            int r15 = r2.getDepth()
            r25 = r14
            if (r15 >= r4) goto L_0x00ec
            r14 = 3
            if (r10 == r14) goto L_0x0159
        L_0x00ec:
            r14 = 2
            if (r10 == r14) goto L_0x00f0
            goto L_0x0152
        L_0x00f0:
            if (r15 > r4) goto L_0x0150
            java.lang.String r10 = r2.getName()
            java.lang.String r14 = "item"
            boolean r10 = r10.equals(r14)
            if (r10 != 0) goto L_0x00ff
            goto L_0x0152
        L_0x00ff:
            int[] r10 = p124p.p150h.C1308c.GradientColorItem
            android.content.res.TypedArray r7 = p124p.p126b.p127k.C1061o.m2453a(r7, r1, r3, r10)
            int r10 = p124p.p150h.C1308c.GradientColorItem_android_color
            boolean r10 = r7.hasValue(r10)
            int r14 = p124p.p150h.C1308c.GradientColorItem_android_offset
            boolean r14 = r7.hasValue(r14)
            if (r10 == 0) goto L_0x0135
            if (r14 == 0) goto L_0x0135
            int r10 = p124p.p150h.C1308c.GradientColorItem_android_color
            r14 = 0
            int r10 = r7.getColor(r10, r14)
            int r14 = p124p.p150h.C1308c.GradientColorItem_android_offset
            r15 = 0
            float r14 = r7.getFloat(r14, r15)
            r7.recycle()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r11.add(r7)
            java.lang.Float r7 = java.lang.Float.valueOf(r14)
            r12.add(r7)
            goto L_0x0150
        L_0x0135:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0150:
            r7 = r26
        L_0x0152:
            r15 = r24
            r14 = r25
            goto L_0x00d8
        L_0x0157:
            r25 = r14
        L_0x0159:
            int r1 = r11.size()
            if (r1 <= 0) goto L_0x0165
            p.h.e.b.f r1 = new p.h.e.b.f
            r1.<init>(r11, r12)
            goto L_0x0166
        L_0x0165:
            r1 = 0
        L_0x0166:
            if (r1 == 0) goto L_0x016a
        L_0x0168:
            r2 = 1
            goto L_0x0176
        L_0x016a:
            p.h.e.b.f r1 = new p.h.e.b.f
            if (r18 == 0) goto L_0x0172
            r1.<init>(r5, r6, r9)
            goto L_0x0168
        L_0x0172:
            r1.<init>(r5, r9)
            goto L_0x0168
        L_0x0176:
            if (r8 == r2) goto L_0x01aa
            r3 = 2
            if (r8 == r3) goto L_0x019c
            android.graphics.LinearGradient r4 = new android.graphics.LinearGradient
            int[] r5 = r1.f4028a
            float[] r1 = r1.f4029b
            if (r0 == r2) goto L_0x018b
            if (r0 == r3) goto L_0x0188
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP
            goto L_0x018d
        L_0x0188:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x018d
        L_0x018b:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.REPEAT
        L_0x018d:
            r19 = r0
            r12 = r4
            r14 = r25
            r15 = r24
            r17 = r5
            r18 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x01d8
        L_0x019c:
            android.graphics.SweepGradient r4 = new android.graphics.SweepGradient
            int[] r0 = r1.f4028a
            float[] r1 = r1.f4029b
            r2 = r21
            r3 = r23
            r4.<init>(r2, r3, r0, r1)
            goto L_0x01d8
        L_0x01aa:
            r2 = r21
            r3 = r23
            r4 = 0
            int r4 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x01e0
            android.graphics.RadialGradient r4 = new android.graphics.RadialGradient
            int[] r5 = r1.f4028a
            float[] r1 = r1.f4029b
            r6 = 1
            if (r0 == r6) goto L_0x01c5
            r6 = 2
            if (r0 == r6) goto L_0x01c2
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP
            goto L_0x01c7
        L_0x01c2:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x01c7
        L_0x01c5:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.REPEAT
        L_0x01c7:
            r23 = r0
            r17 = r4
            r18 = r2
            r19 = r3
            r20 = r22
            r21 = r5
            r22 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23)
        L_0x01d8:
            p.h.e.b.a r0 = new p.h.e.b.a
            r1 = 0
            r2 = 0
            r0.<init>(r4, r1, r2)
            return r0
        L_0x01e0:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)
            throw r0
        L_0x01e8:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid gradient color tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0206:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": unsupported complex color tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0224:
            android.content.res.ColorStateList r0 = p124p.p126b.p127k.C1061o.m2452a(r0, r2, r3, r1)
            p.h.e.b.a r1 = new p.h.e.b.a
            int r2 = r0.getDefaultColor()
            r3 = 0
            r1.<init>(r3, r0, r2)
            return r1
        L_0x0233:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p150h.p152e.p153b.C1326a.m3379a(android.content.res.Resources, int, android.content.res.Resources$Theme):p.h.e.b.a");
    }

    /* renamed from: a */
    public boolean mo5789a() {
        return this.f4015a != null;
    }

    /* renamed from: a */
    public boolean mo5790a(int[] iArr) {
        if (mo5791b()) {
            ColorStateList colorStateList = this.f4016b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f4017c) {
                this.f4017c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo5791b() {
        if (this.f4015a == null) {
            ColorStateList colorStateList = this.f4016b;
            if (colorStateList != null && colorStateList.isStateful()) {
                return true;
            }
        }
        return false;
    }
}
