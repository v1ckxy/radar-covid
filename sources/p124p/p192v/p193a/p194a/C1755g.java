package p124p.p192v.p193a.p194a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p124p.p126b.p127k.C1061o;
import p124p.p143e.C1248a;
import p124p.p150h.p152e.p153b.C1326a;
import p124p.p150h.p154f.C1337c;

/* renamed from: p.v.a.a.g */
public class C1755g extends C1754f {

    /* renamed from: n */
    public static final Mode f5112n = Mode.SRC_IN;

    /* renamed from: f */
    public C1763h f5113f;

    /* renamed from: g */
    public PorterDuffColorFilter f5114g;

    /* renamed from: h */
    public ColorFilter f5115h;

    /* renamed from: i */
    public boolean f5116i;

    /* renamed from: j */
    public boolean f5117j;

    /* renamed from: k */
    public final float[] f5118k;

    /* renamed from: l */
    public final Matrix f5119l;

    /* renamed from: m */
    public final Rect f5120m;

    /* renamed from: p.v.a.a.g$b */
    public static class C1757b extends C1761f {
        public C1757b() {
        }

        public C1757b(C1757b bVar) {
            super(bVar);
        }

        /* renamed from: b */
        public boolean mo6686b() {
            return true;
        }
    }

    /* renamed from: p.v.a.a.g$c */
    public static class C1758c extends C1761f {

        /* renamed from: e */
        public int[] f5121e;

        /* renamed from: f */
        public C1326a f5122f;

        /* renamed from: g */
        public float f5123g = 0.0f;

        /* renamed from: h */
        public C1326a f5124h;

        /* renamed from: i */
        public float f5125i = 1.0f;

        /* renamed from: j */
        public float f5126j = 1.0f;

        /* renamed from: k */
        public float f5127k = 0.0f;

        /* renamed from: l */
        public float f5128l = 1.0f;

        /* renamed from: m */
        public float f5129m = 0.0f;

        /* renamed from: n */
        public Cap f5130n = Cap.BUTT;

        /* renamed from: o */
        public Join f5131o = Join.MITER;

        /* renamed from: p */
        public float f5132p = 4.0f;

        public C1758c() {
        }

        public C1758c(C1758c cVar) {
            super(cVar);
            this.f5121e = cVar.f5121e;
            this.f5122f = cVar.f5122f;
            this.f5123g = cVar.f5123g;
            this.f5125i = cVar.f5125i;
            this.f5124h = cVar.f5124h;
            this.f5148c = cVar.f5148c;
            this.f5126j = cVar.f5126j;
            this.f5127k = cVar.f5127k;
            this.f5128l = cVar.f5128l;
            this.f5129m = cVar.f5129m;
            this.f5130n = cVar.f5130n;
            this.f5131o = cVar.f5131o;
            this.f5132p = cVar.f5132p;
        }

        /* renamed from: a */
        public boolean mo6687a() {
            return this.f5124h.mo5791b() || this.f5122f.mo5791b();
        }

        /* renamed from: a */
        public boolean mo6688a(int[] iArr) {
            return this.f5122f.mo5790a(iArr) | this.f5124h.mo5790a(iArr);
        }

        public float getFillAlpha() {
            return this.f5126j;
        }

        public int getFillColor() {
            return this.f5124h.f4017c;
        }

        public float getStrokeAlpha() {
            return this.f5125i;
        }

        public int getStrokeColor() {
            return this.f5122f.f4017c;
        }

        public float getStrokeWidth() {
            return this.f5123g;
        }

        public float getTrimPathEnd() {
            return this.f5128l;
        }

        public float getTrimPathOffset() {
            return this.f5129m;
        }

        public float getTrimPathStart() {
            return this.f5127k;
        }

        public void setFillAlpha(float f) {
            this.f5126j = f;
        }

        public void setFillColor(int i) {
            this.f5124h.f4017c = i;
        }

        public void setStrokeAlpha(float f) {
            this.f5125i = f;
        }

        public void setStrokeColor(int i) {
            this.f5122f.f4017c = i;
        }

        public void setStrokeWidth(float f) {
            this.f5123g = f;
        }

        public void setTrimPathEnd(float f) {
            this.f5128l = f;
        }

        public void setTrimPathOffset(float f) {
            this.f5129m = f;
        }

        public void setTrimPathStart(float f) {
            this.f5127k = f;
        }
    }

    /* renamed from: p.v.a.a.g$d */
    public static class C1759d extends C1760e {

        /* renamed from: a */
        public final Matrix f5133a = new Matrix();

        /* renamed from: b */
        public final ArrayList<C1760e> f5134b = new ArrayList<>();

        /* renamed from: c */
        public float f5135c = 0.0f;

        /* renamed from: d */
        public float f5136d = 0.0f;

        /* renamed from: e */
        public float f5137e = 0.0f;

        /* renamed from: f */
        public float f5138f = 1.0f;

        /* renamed from: g */
        public float f5139g = 1.0f;

        /* renamed from: h */
        public float f5140h = 0.0f;

        /* renamed from: i */
        public float f5141i = 0.0f;

        /* renamed from: j */
        public final Matrix f5142j = new Matrix();

        /* renamed from: k */
        public int f5143k;

        /* renamed from: l */
        public int[] f5144l;

        /* renamed from: m */
        public String f5145m = null;

        public C1759d() {
            super(null);
        }

        public C1759d(C1759d dVar, C1248a<String, Object> aVar) {
            C1761f fVar;
            super(null);
            this.f5135c = dVar.f5135c;
            this.f5136d = dVar.f5136d;
            this.f5137e = dVar.f5137e;
            this.f5138f = dVar.f5138f;
            this.f5139g = dVar.f5139g;
            this.f5140h = dVar.f5140h;
            this.f5141i = dVar.f5141i;
            this.f5144l = dVar.f5144l;
            String str = dVar.f5145m;
            this.f5145m = str;
            this.f5143k = dVar.f5143k;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f5142j.set(dVar.f5142j);
            ArrayList<C1760e> arrayList = dVar.f5134b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C1759d) {
                    this.f5134b.add(new C1759d((C1759d) obj, aVar));
                } else {
                    if (obj instanceof C1758c) {
                        fVar = new C1758c((C1758c) obj);
                    } else if (obj instanceof C1757b) {
                        fVar = new C1757b((C1757b) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f5134b.add(fVar);
                    String str2 = fVar.f5147b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public boolean mo6687a() {
            for (int i = 0; i < this.f5134b.size(); i++) {
                if (((C1760e) this.f5134b.get(i)).mo6687a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo6688a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f5134b.size(); i++) {
                z |= ((C1760e) this.f5134b.get(i)).mo6688a(iArr);
            }
            return z;
        }

        /* renamed from: b */
        public final void mo6705b() {
            this.f5142j.reset();
            this.f5142j.postTranslate(-this.f5136d, -this.f5137e);
            this.f5142j.postScale(this.f5138f, this.f5139g);
            this.f5142j.postRotate(this.f5135c, 0.0f, 0.0f);
            this.f5142j.postTranslate(this.f5140h + this.f5136d, this.f5141i + this.f5137e);
        }

        public String getGroupName() {
            return this.f5145m;
        }

        public Matrix getLocalMatrix() {
            return this.f5142j;
        }

        public float getPivotX() {
            return this.f5136d;
        }

        public float getPivotY() {
            return this.f5137e;
        }

        public float getRotation() {
            return this.f5135c;
        }

        public float getScaleX() {
            return this.f5138f;
        }

        public float getScaleY() {
            return this.f5139g;
        }

        public float getTranslateX() {
            return this.f5140h;
        }

        public float getTranslateY() {
            return this.f5141i;
        }

        public void setPivotX(float f) {
            if (f != this.f5136d) {
                this.f5136d = f;
                mo6705b();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f5137e) {
                this.f5137e = f;
                mo6705b();
            }
        }

        public void setRotation(float f) {
            if (f != this.f5135c) {
                this.f5135c = f;
                mo6705b();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f5138f) {
                this.f5138f = f;
                mo6705b();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f5139g) {
                this.f5139g = f;
                mo6705b();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f5140h) {
                this.f5140h = f;
                mo6705b();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f5141i) {
                this.f5141i = f;
                mo6705b();
            }
        }
    }

    /* renamed from: p.v.a.a.g$e */
    public static abstract class C1760e {
        public C1760e() {
        }

        public /* synthetic */ C1760e(C1756a aVar) {
        }

        /* renamed from: a */
        public boolean mo6687a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo6688a(int[] iArr) {
            return false;
        }
    }

    /* renamed from: p.v.a.a.g$f */
    public static abstract class C1761f extends C1760e {

        /* renamed from: a */
        public C1337c[] f5146a = null;

        /* renamed from: b */
        public String f5147b;

        /* renamed from: c */
        public int f5148c = 0;

        /* renamed from: d */
        public int f5149d;

        public C1761f() {
            super(null);
        }

        public C1761f(C1761f fVar) {
            super(null);
            this.f5147b = fVar.f5147b;
            this.f5149d = fVar.f5149d;
            this.f5146a = C1061o.m2519a(fVar.f5146a);
        }

        /* renamed from: b */
        public boolean mo6686b() {
            return false;
        }

        public C1337c[] getPathData() {
            return this.f5146a;
        }

        public String getPathName() {
            return this.f5147b;
        }

        public void setPathData(C1337c[] cVarArr) {
            if (!C1061o.m2517a(this.f5146a, cVarArr)) {
                this.f5146a = C1061o.m2519a(cVarArr);
                return;
            }
            C1337c[] cVarArr2 = this.f5146a;
            for (int i = 0; i < cVarArr.length; i++) {
                cVarArr2[i].f4039a = cVarArr[i].f4039a;
                for (int i2 = 0; i2 < cVarArr[i].f4040b.length; i2++) {
                    cVarArr2[i].f4040b[i2] = cVarArr[i].f4040b[i2];
                }
            }
        }
    }

    /* renamed from: p.v.a.a.g$g */
    public static class C1762g {

        /* renamed from: q */
        public static final Matrix f5150q = new Matrix();

        /* renamed from: a */
        public final Path f5151a;

        /* renamed from: b */
        public final Path f5152b;

        /* renamed from: c */
        public final Matrix f5153c;

        /* renamed from: d */
        public Paint f5154d;

        /* renamed from: e */
        public Paint f5155e;

        /* renamed from: f */
        public PathMeasure f5156f;

        /* renamed from: g */
        public int f5157g;

        /* renamed from: h */
        public final C1759d f5158h;

        /* renamed from: i */
        public float f5159i;

        /* renamed from: j */
        public float f5160j;

        /* renamed from: k */
        public float f5161k;

        /* renamed from: l */
        public float f5162l;

        /* renamed from: m */
        public int f5163m;

        /* renamed from: n */
        public String f5164n;

        /* renamed from: o */
        public Boolean f5165o;

        /* renamed from: p */
        public final C1248a<String, Object> f5166p;

        public C1762g() {
            this.f5153c = new Matrix();
            this.f5159i = 0.0f;
            this.f5160j = 0.0f;
            this.f5161k = 0.0f;
            this.f5162l = 0.0f;
            this.f5163m = 255;
            this.f5164n = null;
            this.f5165o = null;
            this.f5166p = new C1248a<>();
            this.f5158h = new C1759d();
            this.f5151a = new Path();
            this.f5152b = new Path();
        }

        public C1762g(C1762g gVar) {
            this.f5153c = new Matrix();
            this.f5159i = 0.0f;
            this.f5160j = 0.0f;
            this.f5161k = 0.0f;
            this.f5162l = 0.0f;
            this.f5163m = 255;
            this.f5164n = null;
            this.f5165o = null;
            C1248a<String, Object> aVar = new C1248a<>();
            this.f5166p = aVar;
            this.f5158h = new C1759d(gVar.f5158h, aVar);
            this.f5151a = new Path(gVar.f5151a);
            this.f5152b = new Path(gVar.f5152b);
            this.f5159i = gVar.f5159i;
            this.f5160j = gVar.f5160j;
            this.f5161k = gVar.f5161k;
            this.f5162l = gVar.f5162l;
            this.f5157g = gVar.f5157g;
            this.f5163m = gVar.f5163m;
            this.f5164n = gVar.f5164n;
            String str = gVar.f5164n;
            if (str != null) {
                this.f5166p.put(str, this);
            }
            this.f5165o = gVar.f5165o;
        }

        /* JADX WARNING: type inference failed for: r11v0 */
        /* JADX WARNING: type inference failed for: r11v1, types: [boolean] */
        /* JADX WARNING: type inference failed for: r11v2 */
        /* JADX WARNING: type inference failed for: r11v10 */
        /* JADX WARNING: type inference failed for: r11v11 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r11v1, types: [boolean]
          assigns: []
          uses: [?[int, short, byte, char], boolean]
          mth insns count: 240
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
        /* JADX WARNING: Unknown variable types count: 3 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo6725a(p124p.p192v.p193a.p194a.C1755g.C1759d r18, android.graphics.Matrix r19, android.graphics.Canvas r20, int r21, int r22, android.graphics.ColorFilter r23) {
            /*
                r17 = this;
                r7 = r17
                r8 = r18
                r9 = r20
                r10 = r23
                android.graphics.Matrix r0 = r8.f5133a
                r1 = r19
                r0.set(r1)
                android.graphics.Matrix r0 = r8.f5133a
                android.graphics.Matrix r1 = r8.f5142j
                r0.preConcat(r1)
                r20.save()
                r11 = 0
                r12 = r11
            L_0x001b:
                java.util.ArrayList<p.v.a.a.g$e> r0 = r8.f5134b
                int r0 = r0.size()
                if (r12 >= r0) goto L_0x0233
                java.util.ArrayList<p.v.a.a.g$e> r0 = r8.f5134b
                java.lang.Object r0 = r0.get(r12)
                p.v.a.a.g$e r0 = (p124p.p192v.p193a.p194a.C1755g.C1760e) r0
                boolean r1 = r0 instanceof p124p.p192v.p193a.p194a.C1755g.C1759d
                if (r1 == 0) goto L_0x0043
                r1 = r0
                p.v.a.a.g$d r1 = (p124p.p192v.p193a.p194a.C1755g.C1759d) r1
                android.graphics.Matrix r2 = r8.f5133a
                r0 = r17
                r3 = r20
                r4 = r21
                r5 = r22
                r6 = r23
                r0.mo6725a(r1, r2, r3, r4, r5, r6)
                goto L_0x0228
            L_0x0043:
                boolean r1 = r0 instanceof p124p.p192v.p193a.p194a.C1755g.C1761f
                if (r1 == 0) goto L_0x0228
                p.v.a.a.g$f r0 = (p124p.p192v.p193a.p194a.C1755g.C1761f) r0
                r1 = r21
                float r2 = (float) r1
                float r3 = r7.f5161k
                float r2 = r2 / r3
                r3 = r22
                float r4 = (float) r3
                float r5 = r7.f5162l
                float r4 = r4 / r5
                float r5 = java.lang.Math.min(r2, r4)
                android.graphics.Matrix r6 = r8.f5133a
                android.graphics.Matrix r13 = r7.f5153c
                r13.set(r6)
                android.graphics.Matrix r13 = r7.f5153c
                r13.postScale(r2, r4)
                r2 = 4
                float[] r2 = new float[r2]
                r2 = {0, 1065353216, 1065353216, 0} // fill-array
                r6.mapVectors(r2)
                r4 = r2[r11]
                double r13 = (double) r4
                r4 = 1
                r6 = r2[r4]
                r19 = r5
                double r4 = (double) r6
                double r4 = java.lang.Math.hypot(r13, r4)
                float r4 = (float) r4
                r5 = 2
                r6 = r2[r5]
                double r13 = (double) r6
                r6 = 3
                r15 = r2[r6]
                double r6 = (double) r15
                double r6 = java.lang.Math.hypot(r13, r6)
                float r6 = (float) r6
                r7 = r2[r11]
                r13 = 1
                r14 = r2[r13]
                r5 = r2[r5]
                r13 = 3
                r2 = r2[r13]
                float r7 = r7 * r2
                float r14 = r14 * r5
                float r7 = r7 - r14
                float r2 = java.lang.Math.max(r4, r6)
                r4 = 0
                int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r5 <= 0) goto L_0x00a5
                float r5 = java.lang.Math.abs(r7)
                float r5 = r5 / r2
                goto L_0x00a6
            L_0x00a5:
                r5 = r4
            L_0x00a6:
                int r2 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r2 != 0) goto L_0x00ae
                r2 = r17
                goto L_0x022d
            L_0x00ae:
                r2 = r17
                android.graphics.Path r6 = r2.f5151a
                if (r0 == 0) goto L_0x0226
                r6.reset()
                p.h.f.c[] r13 = r0.f5146a
                if (r13 == 0) goto L_0x00be
                p124p.p150h.p154f.C1337c.m3392a(r13, r6)
            L_0x00be:
                android.graphics.Path r6 = r2.f5151a
                android.graphics.Path r13 = r2.f5152b
                r13.reset()
                boolean r13 = r0.mo6686b()
                if (r13 == 0) goto L_0x00e7
                android.graphics.Path r4 = r2.f5152b
                int r0 = r0.f5148c
                if (r0 != 0) goto L_0x00d4
                android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
                goto L_0x00d6
            L_0x00d4:
                android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
            L_0x00d6:
                r4.setFillType(r0)
                android.graphics.Path r0 = r2.f5152b
                android.graphics.Matrix r4 = r2.f5153c
                r0.addPath(r6, r4)
                android.graphics.Path r0 = r2.f5152b
                r9.clipPath(r0)
                goto L_0x022d
            L_0x00e7:
                p.v.a.a.g$c r0 = (p124p.p192v.p193a.p194a.C1755g.C1758c) r0
                float r13 = r0.f5127k
                int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
                r14 = 1065353216(0x3f800000, float:1.0)
                if (r13 != 0) goto L_0x00f7
                float r13 = r0.f5128l
                int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
                if (r13 == 0) goto L_0x0137
            L_0x00f7:
                float r13 = r0.f5127k
                float r15 = r0.f5129m
                float r13 = r13 + r15
                float r13 = r13 % r14
                float r7 = r0.f5128l
                float r7 = r7 + r15
                float r7 = r7 % r14
                android.graphics.PathMeasure r14 = r2.f5156f
                if (r14 != 0) goto L_0x010c
                android.graphics.PathMeasure r14 = new android.graphics.PathMeasure
                r14.<init>()
                r2.f5156f = r14
            L_0x010c:
                android.graphics.PathMeasure r14 = r2.f5156f
                android.graphics.Path r15 = r2.f5151a
                r14.setPath(r15, r11)
                android.graphics.PathMeasure r14 = r2.f5156f
                float r14 = r14.getLength()
                float r13 = r13 * r14
                float r7 = r7 * r14
                r6.reset()
                int r15 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                if (r15 <= 0) goto L_0x012e
                android.graphics.PathMeasure r15 = r2.f5156f
                r11 = 1
                r15.getSegment(r13, r14, r6, r11)
                android.graphics.PathMeasure r13 = r2.f5156f
                r13.getSegment(r4, r7, r6, r11)
                goto L_0x0134
            L_0x012e:
                r11 = 1
                android.graphics.PathMeasure r14 = r2.f5156f
                r14.getSegment(r13, r7, r6, r11)
            L_0x0134:
                r6.rLineTo(r4, r4)
            L_0x0137:
                android.graphics.Path r4 = r2.f5152b
                android.graphics.Matrix r7 = r2.f5153c
                r4.addPath(r6, r7)
                p.h.e.b.a r4 = r0.f5124h
                boolean r6 = r4.mo5789a()
                if (r6 != 0) goto L_0x014d
                int r4 = r4.f4017c
                if (r4 == 0) goto L_0x014b
                goto L_0x014d
            L_0x014b:
                r4 = 0
                goto L_0x014e
            L_0x014d:
                r4 = 1
            L_0x014e:
                r6 = 1132396544(0x437f0000, float:255.0)
                r7 = 255(0xff, float:3.57E-43)
                if (r4 == 0) goto L_0x01ac
                p.h.e.b.a r4 = r0.f5124h
                android.graphics.Paint r11 = r2.f5155e
                if (r11 != 0) goto L_0x0167
                android.graphics.Paint r11 = new android.graphics.Paint
                r13 = 1
                r11.<init>(r13)
                r2.f5155e = r11
                android.graphics.Paint$Style r13 = android.graphics.Paint.Style.FILL
                r11.setStyle(r13)
            L_0x0167:
                android.graphics.Paint r11 = r2.f5155e
                boolean r13 = r4.mo5789a()
                if (r13 == 0) goto L_0x0184
                android.graphics.Shader r4 = r4.f4015a
                android.graphics.Matrix r13 = r2.f5153c
                r4.setLocalMatrix(r13)
                r11.setShader(r4)
                float r4 = r0.f5126j
                float r4 = r4 * r6
                int r4 = java.lang.Math.round(r4)
                r11.setAlpha(r4)
                goto L_0x0196
            L_0x0184:
                r13 = 0
                r11.setShader(r13)
                r11.setAlpha(r7)
                int r4 = r4.f4017c
                float r13 = r0.f5126j
                int r4 = p124p.p192v.p193a.p194a.C1755g.m4386a(r4, r13)
                r11.setColor(r4)
            L_0x0196:
                r11.setColorFilter(r10)
                android.graphics.Path r4 = r2.f5152b
                int r13 = r0.f5148c
                if (r13 != 0) goto L_0x01a2
                android.graphics.Path$FillType r13 = android.graphics.Path.FillType.WINDING
                goto L_0x01a4
            L_0x01a2:
                android.graphics.Path$FillType r13 = android.graphics.Path.FillType.EVEN_ODD
            L_0x01a4:
                r4.setFillType(r13)
                android.graphics.Path r4 = r2.f5152b
                r9.drawPath(r4, r11)
            L_0x01ac:
                p.h.e.b.a r4 = r0.f5122f
                boolean r11 = r4.mo5789a()
                if (r11 != 0) goto L_0x01bc
                int r4 = r4.f4017c
                if (r4 == 0) goto L_0x01b9
                goto L_0x01bc
            L_0x01b9:
                r16 = 0
                goto L_0x01be
            L_0x01bc:
                r16 = 1
            L_0x01be:
                if (r16 == 0) goto L_0x022d
                p.h.e.b.a r4 = r0.f5122f
                android.graphics.Paint r11 = r2.f5154d
                if (r11 != 0) goto L_0x01d3
                android.graphics.Paint r11 = new android.graphics.Paint
                r13 = 1
                r11.<init>(r13)
                r2.f5154d = r11
                android.graphics.Paint$Style r13 = android.graphics.Paint.Style.STROKE
                r11.setStyle(r13)
            L_0x01d3:
                android.graphics.Paint r11 = r2.f5154d
                android.graphics.Paint$Join r13 = r0.f5131o
                if (r13 == 0) goto L_0x01dc
                r11.setStrokeJoin(r13)
            L_0x01dc:
                android.graphics.Paint$Cap r13 = r0.f5130n
                if (r13 == 0) goto L_0x01e3
                r11.setStrokeCap(r13)
            L_0x01e3:
                float r13 = r0.f5132p
                r11.setStrokeMiter(r13)
                boolean r13 = r4.mo5789a()
                if (r13 == 0) goto L_0x0203
                android.graphics.Shader r4 = r4.f4015a
                android.graphics.Matrix r7 = r2.f5153c
                r4.setLocalMatrix(r7)
                r11.setShader(r4)
                float r4 = r0.f5125i
                float r4 = r4 * r6
                int r4 = java.lang.Math.round(r4)
                r11.setAlpha(r4)
                goto L_0x0215
            L_0x0203:
                r6 = 0
                r11.setShader(r6)
                r11.setAlpha(r7)
                int r4 = r4.f4017c
                float r6 = r0.f5125i
                int r4 = p124p.p192v.p193a.p194a.C1755g.m4386a(r4, r6)
                r11.setColor(r4)
            L_0x0215:
                r11.setColorFilter(r10)
                float r5 = r5 * r19
                float r0 = r0.f5123g
                float r0 = r0 * r5
                r11.setStrokeWidth(r0)
                android.graphics.Path r0 = r2.f5152b
                r9.drawPath(r0, r11)
                goto L_0x022d
            L_0x0226:
                r0 = 0
                throw r0
            L_0x0228:
                r1 = r21
                r3 = r22
                r2 = r7
            L_0x022d:
                int r12 = r12 + 1
                r7 = r2
                r11 = 0
                goto L_0x001b
            L_0x0233:
                r2 = r7
                r20.restore()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p124p.p192v.p193a.p194a.C1755g.C1762g.mo6725a(p.v.a.a.g$d, android.graphics.Matrix, android.graphics.Canvas, int, int, android.graphics.ColorFilter):void");
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f5163m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f5163m = i;
        }
    }

    /* renamed from: p.v.a.a.g$h */
    public static class C1763h extends ConstantState {

        /* renamed from: a */
        public int f5167a;

        /* renamed from: b */
        public C1762g f5168b;

        /* renamed from: c */
        public ColorStateList f5169c;

        /* renamed from: d */
        public Mode f5170d;

        /* renamed from: e */
        public boolean f5171e;

        /* renamed from: f */
        public Bitmap f5172f;

        /* renamed from: g */
        public ColorStateList f5173g;

        /* renamed from: h */
        public Mode f5174h;

        /* renamed from: i */
        public int f5175i;

        /* renamed from: j */
        public boolean f5176j;

        /* renamed from: k */
        public boolean f5177k;

        /* renamed from: l */
        public Paint f5178l;

        public C1763h() {
            this.f5169c = null;
            this.f5170d = C1755g.f5112n;
            this.f5168b = new C1762g();
        }

        public C1763h(C1763h hVar) {
            this.f5169c = null;
            this.f5170d = C1755g.f5112n;
            if (hVar != null) {
                this.f5167a = hVar.f5167a;
                C1762g gVar = new C1762g(hVar.f5168b);
                this.f5168b = gVar;
                if (hVar.f5168b.f5155e != null) {
                    gVar.f5155e = new Paint(hVar.f5168b.f5155e);
                }
                if (hVar.f5168b.f5154d != null) {
                    this.f5168b.f5154d = new Paint(hVar.f5168b.f5154d);
                }
                this.f5169c = hVar.f5169c;
                this.f5170d = hVar.f5170d;
                this.f5171e = hVar.f5171e;
            }
        }

        /* renamed from: a */
        public boolean mo6731a() {
            C1762g gVar = this.f5168b;
            if (gVar.f5165o == null) {
                gVar.f5165o = Boolean.valueOf(gVar.f5158h.mo6687a());
            }
            return gVar.f5165o.booleanValue();
        }

        public int getChangingConfigurations() {
            return this.f5167a;
        }

        public Drawable newDrawable() {
            return new C1755g(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C1755g(this);
        }

        /* renamed from: a */
        public void mo6730a(int i, int i2) {
            this.f5172f.eraseColor(0);
            Canvas canvas = new Canvas(this.f5172f);
            C1762g gVar = this.f5168b;
            gVar.mo6725a(gVar.f5158h, C1762g.f5150q, canvas, i, i2, null);
        }
    }

    /* renamed from: p.v.a.a.g$i */
    public static class C1764i extends ConstantState {

        /* renamed from: a */
        public final ConstantState f5179a;

        public C1764i(ConstantState constantState) {
            this.f5179a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f5179a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f5179a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1755g gVar = new C1755g();
            gVar.f5111e = (VectorDrawable) this.f5179a.newDrawable();
            return gVar;
        }

        public Drawable newDrawable(Resources resources) {
            C1755g gVar = new C1755g();
            gVar.f5111e = (VectorDrawable) this.f5179a.newDrawable(resources);
            return gVar;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            C1755g gVar = new C1755g();
            gVar.f5111e = (VectorDrawable) this.f5179a.newDrawable(resources, theme);
            return gVar;
        }
    }

    public C1755g() {
        this.f5117j = true;
        this.f5118k = new float[9];
        this.f5119l = new Matrix();
        this.f5120m = new Rect();
        this.f5113f = new C1763h();
    }

    public C1755g(C1763h hVar) {
        this.f5117j = true;
        this.f5118k = new float[9];
        this.f5119l = new Matrix();
        this.f5120m = new Rect();
        this.f5113f = hVar;
        this.f5114g = mo6659a(hVar.f5169c, hVar.f5170d);
    }

    /* renamed from: a */
    public static int m4386a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032 A[Catch:{ IOException | XmlPullParserException -> 0x003f }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037 A[Catch:{ IOException | XmlPullParserException -> 0x003f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p124p.p192v.p193a.p194a.C1755g m4387a(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x001d
            p.v.a.a.g r0 = new p.v.a.a.g
            r0.<init>()
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r5, r6)
            r0.f5111e = r4
            p.v.a.a.g$i r4 = new p.v.a.a.g$i
            android.graphics.drawable.Drawable r5 = r0.f5111e
            android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
            r4.<init>(r5)
            return r0
        L_0x001d:
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)     // Catch:{ XmlPullParserException -> 0x0041, IOException -> 0x003f }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ XmlPullParserException -> 0x0041, IOException -> 0x003f }
        L_0x0025:
            int r1 = r5.next()     // Catch:{ XmlPullParserException -> 0x0041, IOException -> 0x003f }
            r2 = 2
            if (r1 == r2) goto L_0x0030
            r3 = 1
            if (r1 == r3) goto L_0x0030
            goto L_0x0025
        L_0x0030:
            if (r1 != r2) goto L_0x0037
            p.v.a.a.g r4 = createFromXmlInner(r4, r5, r0, r6)     // Catch:{ XmlPullParserException -> 0x0041, IOException -> 0x003f }
            return r4
        L_0x0037:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0041, IOException -> 0x003f }
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)     // Catch:{ XmlPullParserException -> 0x0041, IOException -> 0x003f }
            throw r4     // Catch:{ XmlPullParserException -> 0x0041, IOException -> 0x003f }
        L_0x003f:
            r4 = move-exception
            goto L_0x0042
        L_0x0041:
            r4 = move-exception
        L_0x0042:
            java.lang.String r5 = "parser error"
            java.lang.String r6 = "VectorDrawableCompat"
            android.util.Log.e(r6, r5, r4)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p192v.p193a.p194a.C1755g.m4387a(android.content.res.Resources, int, android.content.res.Resources$Theme):p.v.a.a.g");
    }

    public static C1755g createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C1755g gVar = new C1755g();
        gVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return gVar;
    }

    /* renamed from: a */
    public PorterDuffColorFilter mo6659a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            drawable.canApplyTheme();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cf, code lost:
        if ((r1 == r7.getWidth() && r3 == r6.f5172f.getHeight()) == false) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            android.graphics.drawable.Drawable r0 = r10.f5111e
            if (r0 == 0) goto L_0x0008
            r0.draw(r11)
            return
        L_0x0008:
            android.graphics.Rect r0 = r10.f5120m
            r10.copyBounds(r0)
            android.graphics.Rect r0 = r10.f5120m
            int r0 = r0.width()
            if (r0 <= 0) goto L_0x0167
            android.graphics.Rect r0 = r10.f5120m
            int r0 = r0.height()
            if (r0 > 0) goto L_0x001f
            goto L_0x0167
        L_0x001f:
            android.graphics.ColorFilter r0 = r10.f5115h
            if (r0 != 0) goto L_0x0025
            android.graphics.PorterDuffColorFilter r0 = r10.f5114g
        L_0x0025:
            android.graphics.Matrix r1 = r10.f5119l
            r11.getMatrix(r1)
            android.graphics.Matrix r1 = r10.f5119l
            float[] r2 = r10.f5118k
            r1.getValues(r2)
            float[] r1 = r10.f5118k
            r2 = 0
            r1 = r1[r2]
            float r1 = java.lang.Math.abs(r1)
            float[] r3 = r10.f5118k
            r4 = 4
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r4 = r10.f5118k
            r5 = 1
            r4 = r4[r5]
            float r4 = java.lang.Math.abs(r4)
            float[] r6 = r10.f5118k
            r7 = 3
            r6 = r6[r7]
            float r6 = java.lang.Math.abs(r6)
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r4 != 0) goto L_0x0060
            int r4 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0062
        L_0x0060:
            r1 = r8
            r3 = r1
        L_0x0062:
            android.graphics.Rect r4 = r10.f5120m
            int r4 = r4.width()
            float r4 = (float) r4
            float r4 = r4 * r1
            int r1 = (int) r4
            android.graphics.Rect r4 = r10.f5120m
            int r4 = r4.height()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            r4 = 2048(0x800, float:2.87E-42)
            int r1 = java.lang.Math.min(r4, r1)
            int r3 = java.lang.Math.min(r4, r3)
            if (r1 <= 0) goto L_0x0167
            if (r3 > 0) goto L_0x0084
            goto L_0x0167
        L_0x0084:
            int r4 = r11.save()
            android.graphics.Rect r6 = r10.f5120m
            int r9 = r6.left
            float r9 = (float) r9
            int r6 = r6.top
            float r6 = (float) r6
            r11.translate(r9, r6)
            boolean r6 = r10.isAutoMirrored()
            if (r6 == 0) goto L_0x00a1
            int r6 = r10.getLayoutDirection()
            if (r6 != r5) goto L_0x00a1
            r6 = r5
            goto L_0x00a2
        L_0x00a1:
            r6 = r2
        L_0x00a2:
            if (r6 == 0) goto L_0x00b3
            android.graphics.Rect r6 = r10.f5120m
            int r6 = r6.width()
            float r6 = (float) r6
            r11.translate(r6, r7)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11.scale(r6, r8)
        L_0x00b3:
            android.graphics.Rect r6 = r10.f5120m
            r6.offsetTo(r2, r2)
            p.v.a.a.g$h r6 = r10.f5113f
            android.graphics.Bitmap r7 = r6.f5172f
            if (r7 == 0) goto L_0x00d1
            int r7 = r7.getWidth()
            if (r1 != r7) goto L_0x00ce
            android.graphics.Bitmap r7 = r6.f5172f
            int r7 = r7.getHeight()
            if (r3 != r7) goto L_0x00ce
            r7 = r5
            goto L_0x00cf
        L_0x00ce:
            r7 = r2
        L_0x00cf:
            if (r7 != 0) goto L_0x00db
        L_0x00d1:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r1, r3, r7)
            r6.f5172f = r7
            r6.f5177k = r5
        L_0x00db:
            boolean r6 = r10.f5117j
            if (r6 != 0) goto L_0x00e5
            p.v.a.a.g$h r6 = r10.f5113f
            r6.mo6730a(r1, r3)
            goto L_0x0129
        L_0x00e5:
            p.v.a.a.g$h r6 = r10.f5113f
            boolean r7 = r6.f5177k
            if (r7 != 0) goto L_0x0109
            android.content.res.ColorStateList r7 = r6.f5173g
            android.content.res.ColorStateList r8 = r6.f5169c
            if (r7 != r8) goto L_0x0109
            android.graphics.PorterDuff$Mode r7 = r6.f5174h
            android.graphics.PorterDuff$Mode r8 = r6.f5170d
            if (r7 != r8) goto L_0x0109
            boolean r7 = r6.f5176j
            boolean r8 = r6.f5171e
            if (r7 != r8) goto L_0x0109
            int r7 = r6.f5175i
            p.v.a.a.g$g r6 = r6.f5168b
            int r6 = r6.getRootAlpha()
            if (r7 != r6) goto L_0x0109
            r6 = r5
            goto L_0x010a
        L_0x0109:
            r6 = r2
        L_0x010a:
            if (r6 != 0) goto L_0x0129
            p.v.a.a.g$h r6 = r10.f5113f
            r6.mo6730a(r1, r3)
            p.v.a.a.g$h r1 = r10.f5113f
            android.content.res.ColorStateList r3 = r1.f5169c
            r1.f5173g = r3
            android.graphics.PorterDuff$Mode r3 = r1.f5170d
            r1.f5174h = r3
            p.v.a.a.g$g r3 = r1.f5168b
            int r3 = r3.getRootAlpha()
            r1.f5175i = r3
            boolean r3 = r1.f5171e
            r1.f5176j = r3
            r1.f5177k = r2
        L_0x0129:
            p.v.a.a.g$h r1 = r10.f5113f
            android.graphics.Rect r3 = r10.f5120m
            p.v.a.a.g$g r6 = r1.f5168b
            int r6 = r6.getRootAlpha()
            r7 = 255(0xff, float:3.57E-43)
            if (r6 >= r7) goto L_0x0138
            r2 = r5
        L_0x0138:
            r6 = 0
            if (r2 != 0) goto L_0x013f
            if (r0 != 0) goto L_0x013f
            r0 = r6
            goto L_0x015f
        L_0x013f:
            android.graphics.Paint r2 = r1.f5178l
            if (r2 != 0) goto L_0x014d
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.f5178l = r2
            r2.setFilterBitmap(r5)
        L_0x014d:
            android.graphics.Paint r2 = r1.f5178l
            p.v.a.a.g$g r5 = r1.f5168b
            int r5 = r5.getRootAlpha()
            r2.setAlpha(r5)
            android.graphics.Paint r2 = r1.f5178l
            r2.setColorFilter(r0)
            android.graphics.Paint r0 = r1.f5178l
        L_0x015f:
            android.graphics.Bitmap r1 = r1.f5172f
            r11.drawBitmap(r1, r6, r3, r0)
            r11.restoreToCount(r4)
        L_0x0167:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p192v.p193a.p194a.C1755g.draw(android.graphics.Canvas):void");
    }

    public int getAlpha() {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f5113f.f5168b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f5111e;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f5113f.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f5115h;
    }

    public ConstantState getConstantState() {
        if (this.f5111e != null && VERSION.SDK_INT >= 24) {
            return new C1764i(this.f5111e.getConstantState());
        }
        this.f5113f.f5167a = getChangingConfigurations();
        return this.f5113f;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f5111e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f5113f.f5168b.f5160j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f5111e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f5113f.f5168b.f5159i;
    }

    public int getOpacity() {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:132:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inflate(android.content.res.Resources r28, org.xmlpull.v1.XmlPullParser r29, android.util.AttributeSet r30, android.content.res.Resources.Theme r31) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            android.graphics.drawable.Drawable r0 = r1.f5111e
            if (r0 == 0) goto L_0x0012
            r0.inflate(r2, r9, r10, r11)
            return
        L_0x0012:
            p.v.a.a.g$h r12 = r1.f5113f
            p.v.a.a.g$g r0 = new p.v.a.a.g$g
            r0.<init>()
            r12.f5168b = r0
            int[] r0 = p124p.p192v.p193a.p194a.C1746a.f5086a
            android.content.res.TypedArray r3 = p124p.p126b.p127k.C1061o.m2453a(r2, r11, r10, r0)
            p.v.a.a.g$h r4 = r1.f5113f
            p.v.a.a.g$g r5 = r4.f5168b
            r13 = 6
            r14 = -1
            java.lang.String r0 = "tintMode"
            int r0 = p124p.p126b.p127k.C1061o.m2521b(r3, r9, r0, r13, r14)
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_IN
            r15 = 9
            r8 = 5
            r7 = 3
            if (r0 == r7) goto L_0x0049
            if (r0 == r8) goto L_0x004b
            if (r0 == r15) goto L_0x0046
            switch(r0) {
                case 14: goto L_0x0043;
                case 15: goto L_0x0040;
                case 16: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x004b
        L_0x003d:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.ADD
            goto L_0x004b
        L_0x0040:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SCREEN
            goto L_0x004b
        L_0x0043:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x004b
        L_0x0046:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L_0x004b
        L_0x0049:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_OVER
        L_0x004b:
            r4.f5170d = r6
            java.lang.String r0 = "tint"
            boolean r0 = p124p.p126b.p127k.C1061o.m2515a(r9, r0)
            r13 = 0
            r15 = 1
            r14 = 2
            if (r0 == 0) goto L_0x00ac
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r3.getValue(r15, r0)
            int r6 = r0.type
            if (r6 == r14) goto L_0x008d
            r14 = 28
            if (r6 < r14) goto L_0x0073
            r14 = 31
            if (r6 > r14) goto L_0x0073
            int r0 = r0.data
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            goto L_0x00ad
        L_0x0073:
            android.content.res.Resources r0 = r3.getResources()
            int r6 = r3.getResourceId(r15, r13)
            android.content.res.XmlResourceParser r6 = r0.getXml(r6)     // Catch:{ Exception -> 0x0084 }
            android.content.res.ColorStateList r0 = p124p.p126b.p127k.C1061o.m2451a(r0, r6, r11)     // Catch:{ Exception -> 0x0084 }
            goto L_0x00ad
        L_0x0084:
            r0 = move-exception
            java.lang.String r6 = "CSLCompat"
            java.lang.String r14 = "Failed to inflate ColorStateList."
            android.util.Log.e(r6, r14, r0)
            goto L_0x00ac
        L_0x008d:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to resolve attribute at index "
            r3.append(r4)
            r3.append(r15)
            java.lang.String r4 = ": "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x00ac:
            r0 = 0
        L_0x00ad:
            if (r0 == 0) goto L_0x00b1
            r4.f5169c = r0
        L_0x00b1:
            boolean r0 = r4.f5171e
            java.lang.String r6 = "autoMirrored"
            boolean r6 = p124p.p126b.p127k.C1061o.m2515a(r9, r6)
            if (r6 != 0) goto L_0x00bc
            goto L_0x00c0
        L_0x00bc:
            boolean r0 = r3.getBoolean(r8, r0)
        L_0x00c0:
            r4.f5171e = r0
            float r0 = r5.f5161k
            r14 = 7
            java.lang.String r4 = "viewportWidth"
            float r0 = p124p.p126b.p127k.C1061o.m2430a(r3, r9, r4, r14, r0)
            r5.f5161k = r0
            float r0 = r5.f5162l
            r6 = 8
            java.lang.String r4 = "viewportHeight"
            float r0 = p124p.p126b.p127k.C1061o.m2430a(r3, r9, r4, r6, r0)
            r5.f5162l = r0
            float r4 = r5.f5161k
            r19 = 0
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x043f
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x0423
            float r0 = r5.f5159i
            float r0 = r3.getDimension(r7, r0)
            r5.f5159i = r0
            float r0 = r5.f5160j
            r4 = 2
            float r0 = r3.getDimension(r4, r0)
            r5.f5160j = r0
            float r4 = r5.f5159i
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x0407
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x03eb
            float r0 = r5.getAlpha()
            r4 = 4
            java.lang.String r6 = "alpha"
            float r0 = p124p.p126b.p127k.C1061o.m2430a(r3, r9, r6, r4, r0)
            r5.setAlpha(r0)
            java.lang.String r0 = r3.getString(r13)
            if (r0 == 0) goto L_0x011b
            r5.f5164n = r0
            p.e.a<java.lang.String, java.lang.Object> r6 = r5.f5166p
            r6.put(r0, r5)
        L_0x011b:
            r3.recycle()
            int r0 = r27.getChangingConfigurations()
            r12.f5167a = r0
            r12.f5177k = r15
            p.v.a.a.g$h r0 = r1.f5113f
            p.v.a.a.g$g r6 = r0.f5168b
            java.util.ArrayDeque r5 = new java.util.ArrayDeque
            r5.<init>()
            p.v.a.a.g$d r3 = r6.f5158h
            r5.push(r3)
            int r3 = r29.getEventType()
            int r20 = r29.getDepth()
            int r14 = r20 + 1
            r20 = r15
        L_0x0140:
            if (r3 == r15) goto L_0x03d2
            int r4 = r29.getDepth()
            if (r4 >= r14) goto L_0x014a
            if (r3 == r7) goto L_0x03d2
        L_0x014a:
            java.lang.String r4 = "group"
            r7 = 2
            if (r3 != r7) goto L_0x03a2
            java.lang.String r3 = r29.getName()
            java.lang.Object r7 = r5.peek()
            p.v.a.a.g$d r7 = (p124p.p192v.p193a.p194a.C1755g.C1759d) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            java.lang.String r15 = "fillType"
            java.lang.String r13 = "pathData"
            if (r8 == 0) goto L_0x02a9
            p.v.a.a.g$c r8 = new p.v.a.a.g$c
            r8.<init>()
            int[] r3 = p124p.p192v.p193a.p194a.C1746a.f5088c
            android.content.res.TypedArray r4 = p124p.p126b.p127k.C1061o.m2453a(r2, r11, r10, r3)
            r3 = 0
            r8.f5121e = r3
            boolean r13 = p124p.p126b.p127k.C1061o.m2515a(r9, r13)
            if (r13 != 0) goto L_0x018b
            r1 = r4
            r25 = r5
            r26 = r6
            r13 = r8
            r18 = r14
            r5 = 4
            r17 = -1
            r21 = 9
            r22 = 8
            r14 = r7
            goto L_0x027a
        L_0x018b:
            r13 = 0
            java.lang.String r3 = r4.getString(r13)
            if (r3 == 0) goto L_0x0194
            r8.f5147b = r3
        L_0x0194:
            r3 = 2
            java.lang.String r13 = r4.getString(r3)
            if (r13 == 0) goto L_0x01a1
            p.h.f.c[] r3 = p124p.p126b.p127k.C1061o.m2552d(r13)
            r8.f5146a = r3
        L_0x01a1:
            r13 = 1
            r20 = 0
            java.lang.String r23 = "fillColor"
            r18 = 0
            r3 = r4
            r24 = r4
            r4 = r29
            r25 = r5
            r5 = r31
            r26 = r6
            r6 = r23
            r18 = r14
            r1 = 3
            r14 = r7
            r7 = r13
            r13 = r8
            r1 = 5
            r8 = r20
            p.h.e.b.a r3 = p124p.p126b.p127k.C1061o.m2471a(r3, r4, r5, r6, r7, r8)
            r13.f5124h = r3
            r3 = 12
            float r4 = r13.f5126j
            java.lang.String r5 = "fillAlpha"
            r8 = r24
            float r3 = p124p.p126b.p127k.C1061o.m2430a(r8, r9, r5, r3, r4)
            r13.f5126j = r3
            java.lang.String r3 = "strokeLineCap"
            r4 = -1
            r7 = 8
            int r3 = p124p.p126b.p127k.C1061o.m2521b(r8, r9, r3, r7, r4)
            android.graphics.Paint$Cap r4 = r13.f5130n
            if (r3 == 0) goto L_0x01ec
            r5 = 1
            if (r3 == r5) goto L_0x01e9
            r5 = 2
            if (r3 == r5) goto L_0x01e6
            goto L_0x01ee
        L_0x01e6:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.SQUARE
            goto L_0x01ee
        L_0x01e9:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.ROUND
            goto L_0x01ee
        L_0x01ec:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.BUTT
        L_0x01ee:
            r13.f5130n = r4
            java.lang.String r3 = "strokeLineJoin"
            r5 = -1
            r6 = 9
            int r3 = p124p.p126b.p127k.C1061o.m2521b(r8, r9, r3, r6, r5)
            android.graphics.Paint$Join r4 = r13.f5131o
            if (r3 == 0) goto L_0x020a
            r5 = 1
            if (r3 == r5) goto L_0x0207
            r5 = 2
            if (r3 == r5) goto L_0x0204
            goto L_0x020c
        L_0x0204:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.BEVEL
            goto L_0x020c
        L_0x0207:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.ROUND
            goto L_0x020c
        L_0x020a:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER
        L_0x020c:
            r13.f5131o = r4
            r3 = 10
            float r4 = r13.f5132p
            java.lang.String r5 = "strokeMiterLimit"
            float r3 = p124p.p126b.p127k.C1061o.m2430a(r8, r9, r5, r3, r4)
            r13.f5132p = r3
            r16 = 3
            r19 = 0
            java.lang.String r20 = "strokeColor"
            r3 = r8
            r4 = r29
            r17 = -1
            r5 = r31
            r21 = r6
            r6 = r20
            r22 = r7
            r7 = r16
            r1 = r8
            r8 = r19
            p.h.e.b.a r3 = p124p.p126b.p127k.C1061o.m2471a(r3, r4, r5, r6, r7, r8)
            r13.f5122f = r3
            r3 = 11
            float r4 = r13.f5125i
            java.lang.String r5 = "strokeAlpha"
            float r3 = p124p.p126b.p127k.C1061o.m2430a(r1, r9, r5, r3, r4)
            r13.f5125i = r3
            float r3 = r13.f5123g
            java.lang.String r4 = "strokeWidth"
            r5 = 4
            float r3 = p124p.p126b.p127k.C1061o.m2430a(r1, r9, r4, r5, r3)
            r13.f5123g = r3
            float r3 = r13.f5128l
            java.lang.String r4 = "trimPathEnd"
            r6 = 6
            float r3 = p124p.p126b.p127k.C1061o.m2430a(r1, r9, r4, r6, r3)
            r13.f5128l = r3
            float r3 = r13.f5129m
            java.lang.String r4 = "trimPathOffset"
            r6 = 7
            float r3 = p124p.p126b.p127k.C1061o.m2430a(r1, r9, r4, r6, r3)
            r13.f5129m = r3
            float r3 = r13.f5127k
            java.lang.String r4 = "trimPathStart"
            r6 = 5
            float r3 = p124p.p126b.p127k.C1061o.m2430a(r1, r9, r4, r6, r3)
            r13.f5127k = r3
            r3 = 13
            int r4 = r13.f5148c
            int r3 = p124p.p126b.p127k.C1061o.m2521b(r1, r9, r15, r3, r4)
            r13.f5148c = r3
        L_0x027a:
            r1.recycle()
            java.util.ArrayList<p.v.a.a.g$e> r1 = r14.f5134b
            r1.add(r13)
            java.lang.String r1 = r13.getPathName()
            if (r1 == 0) goto L_0x0294
            r1 = r26
            p.e.a<java.lang.String, java.lang.Object> r3 = r1.f5166p
            java.lang.String r4 = r13.getPathName()
            r3.put(r4, r13)
            goto L_0x0296
        L_0x0294:
            r1 = r26
        L_0x0296:
            int r3 = r0.f5167a
            int r4 = r13.f5149d
            r3 = r3 | r4
            r0.f5167a = r3
            r7 = r25
            r5 = 7
            r6 = 0
            r8 = 6
            r13 = 5
            r14 = 3
            r15 = 2
            r20 = 0
            goto L_0x03c1
        L_0x02a9:
            r25 = r5
            r1 = r6
            r18 = r14
            r5 = 4
            r17 = -1
            r21 = 9
            r22 = 8
            r14 = r7
            java.lang.String r6 = "clip-path"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x030d
            p.v.a.a.g$b r3 = new p.v.a.a.g$b
            r3.<init>()
            boolean r4 = p124p.p126b.p127k.C1061o.m2515a(r9, r13)
            if (r4 != 0) goto L_0x02ca
            goto L_0x02f0
        L_0x02ca:
            int[] r4 = p124p.p192v.p193a.p194a.C1746a.f5089d
            android.content.res.TypedArray r4 = p124p.p126b.p127k.C1061o.m2453a(r2, r11, r10, r4)
            r6 = 0
            java.lang.String r7 = r4.getString(r6)
            if (r7 == 0) goto L_0x02d9
            r3.f5147b = r7
        L_0x02d9:
            r7 = 1
            java.lang.String r8 = r4.getString(r7)
            if (r8 == 0) goto L_0x02e6
            p.h.f.c[] r7 = p124p.p126b.p127k.C1061o.m2552d(r8)
            r3.f5146a = r7
        L_0x02e6:
            r7 = 2
            int r8 = p124p.p126b.p127k.C1061o.m2521b(r4, r9, r15, r7, r6)
            r3.f5148c = r8
            r4.recycle()
        L_0x02f0:
            java.util.ArrayList<p.v.a.a.g$e> r4 = r14.f5134b
            r4.add(r3)
            java.lang.String r4 = r3.getPathName()
            if (r4 == 0) goto L_0x0304
            p.e.a<java.lang.String, java.lang.Object> r4 = r1.f5166p
            java.lang.String r6 = r3.getPathName()
            r4.put(r6, r3)
        L_0x0304:
            int r4 = r0.f5167a
            int r3 = r3.f5149d
            r3 = r3 | r4
            r0.f5167a = r3
            goto L_0x0399
        L_0x030d:
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0399
            p.v.a.a.g$d r3 = new p.v.a.a.g$d
            r3.<init>()
            int[] r4 = p124p.p192v.p193a.p194a.C1746a.f5087b
            android.content.res.TypedArray r4 = p124p.p126b.p127k.C1061o.m2453a(r2, r11, r10, r4)
            r6 = 0
            r3.f5144l = r6
            float r7 = r3.f5135c
            java.lang.String r8 = "rotation"
            r13 = 5
            float r7 = p124p.p126b.p127k.C1061o.m2430a(r4, r9, r8, r13, r7)
            r3.f5135c = r7
            float r7 = r3.f5136d
            r8 = 1
            float r7 = r4.getFloat(r8, r7)
            r3.f5136d = r7
            float r7 = r3.f5137e
            r15 = 2
            float r7 = r4.getFloat(r15, r7)
            r3.f5137e = r7
            float r7 = r3.f5138f
            java.lang.String r6 = "scaleX"
            r8 = 3
            float r6 = p124p.p126b.p127k.C1061o.m2430a(r4, r9, r6, r8, r7)
            r3.f5138f = r6
            float r6 = r3.f5139g
            java.lang.String r7 = "scaleY"
            float r6 = p124p.p126b.p127k.C1061o.m2430a(r4, r9, r7, r5, r6)
            r3.f5139g = r6
            float r6 = r3.f5140h
            java.lang.String r7 = "translateX"
            r8 = 6
            float r6 = p124p.p126b.p127k.C1061o.m2430a(r4, r9, r7, r8, r6)
            r3.f5140h = r6
            float r6 = r3.f5141i
            java.lang.String r7 = "translateY"
            r5 = 7
            float r6 = p124p.p126b.p127k.C1061o.m2430a(r4, r9, r7, r5, r6)
            r3.f5141i = r6
            r6 = 0
            java.lang.String r7 = r4.getString(r6)
            if (r7 == 0) goto L_0x0372
            r3.f5145m = r7
        L_0x0372:
            r3.mo6705b()
            r4.recycle()
            java.util.ArrayList<p.v.a.a.g$e> r4 = r14.f5134b
            r4.add(r3)
            r7 = r25
            r7.push(r3)
            java.lang.String r4 = r3.getGroupName()
            if (r4 == 0) goto L_0x0391
            p.e.a<java.lang.String, java.lang.Object> r4 = r1.f5166p
            java.lang.String r14 = r3.getGroupName()
            r4.put(r14, r3)
        L_0x0391:
            int r4 = r0.f5167a
            int r3 = r3.f5143k
            r3 = r3 | r4
            r0.f5167a = r3
            goto L_0x03a0
        L_0x0399:
            r7 = r25
            r5 = 7
            r6 = 0
            r8 = 6
            r13 = 5
            r15 = 2
        L_0x03a0:
            r14 = 3
            goto L_0x03c1
        L_0x03a2:
            r1 = r6
            r15 = r7
            r6 = r13
            r18 = r14
            r14 = 3
            r17 = -1
            r21 = 9
            r22 = 8
            r7 = r5
            r13 = r8
            r5 = 7
            r8 = 6
            if (r3 != r14) goto L_0x03c1
            java.lang.String r3 = r29.getName()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x03c1
            r7.pop()
        L_0x03c1:
            int r3 = r29.next()
            r5 = r7
            r8 = r13
            r7 = r14
            r14 = r18
            r4 = 4
            r15 = 1
            r13 = r6
            r6 = r1
            r1 = r27
            goto L_0x0140
        L_0x03d2:
            if (r20 != 0) goto L_0x03e1
            android.content.res.ColorStateList r0 = r12.f5169c
            android.graphics.PorterDuff$Mode r1 = r12.f5170d
            r2 = r27
            android.graphics.PorterDuffColorFilter r0 = r2.mo6659a(r0, r1)
            r2.f5114g = r0
            return
        L_0x03e1:
            r2 = r27
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "no path defined"
            r0.<init>(r1)
            throw r0
        L_0x03eb:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires height > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0407:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires width > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0423:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportHeight > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x043f:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportWidth > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p192v.p193a.p194a.C1755g.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public void invalidateSelf() {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f5113f.f5171e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r0.isStateful() != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f5111e
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            p.v.a.a.g$h r0 = r1.f5113f
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.mo6731a()
            if (r0 != 0) goto L_0x0028
            p.v.a.a.g$h r0 = r1.f5113f
            android.content.res.ColorStateList r0 = r0.f5169c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p192v.p193a.p194a.C1755g.isStateful():boolean");
    }

    public Drawable mutate() {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f5116i && super.mutate() == this) {
            this.f5113f = new C1763h(this.f5113f);
            this.f5116i = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C1763h hVar = this.f5113f;
        ColorStateList colorStateList = hVar.f5169c;
        boolean z2 = true;
        if (colorStateList != null) {
            Mode mode = hVar.f5170d;
            if (mode != null) {
                this.f5114g = mo6659a(colorStateList, mode);
                invalidateSelf();
                z = true;
            }
        }
        if (hVar.mo6731a()) {
            boolean a = hVar.f5168b.f5158h.mo6688a(iArr);
            hVar.f5177k |= a;
            if (a) {
                invalidateSelf();
                return z2;
            }
        }
        z2 = z;
        return z2;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            drawable.setAlpha(i);
            return;
        }
        if (this.f5113f.f5168b.getRootAlpha() != i) {
            this.f5113f.f5168b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f5113f.f5171e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f5115h = colorFilter;
        invalidateSelf();
    }

    public void setTint(int i) {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            C1061o.m2476a(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            C1061o.m2477a(drawable, colorStateList);
            return;
        }
        C1763h hVar = this.f5113f;
        if (hVar.f5169c != colorStateList) {
            hVar.f5169c = colorStateList;
            this.f5114g = mo6659a(colorStateList, hVar.f5170d);
            invalidateSelf();
        }
    }

    public void setTintMode(Mode mode) {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            C1061o.m2478a(drawable, mode);
            return;
        }
        C1763h hVar = this.f5113f;
        if (hVar.f5170d != mode) {
            hVar.f5170d = mode;
            this.f5114g = mo6659a(hVar.f5169c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f5111e;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
