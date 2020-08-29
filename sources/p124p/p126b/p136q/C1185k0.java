package p124p.p126b.p136q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p124p.p126b.C1022e;
import p124p.p126b.p130m.p131a.C1071a;
import p124p.p126b.p136q.C1178i.C1179a;
import p124p.p143e.C1248a;
import p124p.p143e.C1253e;
import p124p.p143e.C1254f;
import p124p.p143e.C1262i;
import p124p.p192v.p193a.p194a.C1748c;
import p124p.p192v.p193a.p194a.C1755g;

/* renamed from: p.b.q.k0 */
public final class C1185k0 {

    /* renamed from: h */
    public static final Mode f3345h = Mode.SRC_IN;

    /* renamed from: i */
    public static C1185k0 f3346i;

    /* renamed from: j */
    public static final C1188c f3347j = new C1188c(6);

    /* renamed from: a */
    public WeakHashMap<Context, C1262i<ColorStateList>> f3348a;

    /* renamed from: b */
    public C1248a<String, C1189d> f3349b;

    /* renamed from: c */
    public C1262i<String> f3350c;

    /* renamed from: d */
    public final WeakHashMap<Context, C1253e<WeakReference<ConstantState>>> f3351d = new WeakHashMap<>(0);

    /* renamed from: e */
    public TypedValue f3352e;

    /* renamed from: f */
    public boolean f3353f;

    /* renamed from: g */
    public C1190e f3354g;

    /* renamed from: p.b.q.k0$a */
    public static class C1186a implements C1189d {
        /* renamed from: a */
        public Drawable mo5224a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C1071a.m2603a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: p.b.q.k0$b */
    public static class C1187b implements C1189d {
        /* renamed from: a */
        public Drawable mo5224a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                Resources resources = context.getResources();
                C1748c cVar = new C1748c(context, null, null);
                cVar.inflate(resources, xmlPullParser, attributeSet, theme);
                return cVar;
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: p.b.q.k0$c */
    public static class C1188c extends C1254f<Integer, PorterDuffColorFilter> {
        public C1188c(int i) {
            super(i);
        }
    }

    /* renamed from: p.b.q.k0$d */
    public interface C1189d {
        /* renamed from: a */
        Drawable mo5224a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme);
    }

    /* renamed from: p.b.q.k0$e */
    public interface C1190e {
    }

    /* renamed from: p.b.q.k0$f */
    public static class C1191f implements C1189d {
        /* renamed from: a */
        public Drawable mo5224a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C1755g.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    public final Drawable mo5212a(Context context, int i) {
        if (this.f3352e == null) {
            this.f3352e = new TypedValue();
        }
        TypedValue typedValue = this.f3352e;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable a = mo5215a(context, j);
        if (a != null) {
            return a;
        }
        C1190e eVar = this.f3354g;
        LayerDrawable layerDrawable = null;
        if (eVar != null) {
            C1179a aVar = (C1179a) eVar;
            if (i == C1022e.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{mo5221b(context, C1022e.abc_cab_background_internal_bg), mo5221b(context, C1022e.abc_cab_background_top_mtrl_alpha)});
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            mo5220a(context, j, (Drawable) layerDrawable);
        }
        return layerDrawable;
    }

    /* renamed from: a */
    public synchronized void mo5216a(Context context) {
        C1253e eVar = (C1253e) this.f3351d.get(context);
        if (eVar != null) {
            eVar.mo5517b();
        }
    }

    /* renamed from: a */
    public final void mo5217a(String str, C1189d dVar) {
        if (this.f3349b == null) {
            this.f3349b = new C1248a<>();
        }
        this.f3349b.put(str, dVar);
    }

    /* renamed from: a */
    public synchronized void mo5218a(C1190e eVar) {
        this.f3354g = eVar;
    }

    /* renamed from: a */
    public final synchronized boolean mo5220a(Context context, long j, Drawable drawable) {
        boolean z;
        ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C1253e eVar = (C1253e) this.f3351d.get(context);
            if (eVar == null) {
                eVar = new C1253e();
                this.f3351d.put(context, eVar);
            }
            eVar.mo5520c(j, new WeakReference(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public synchronized Drawable mo5221b(Context context, int i) {
        return mo5213a(context, i, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.content.res.ColorStateList mo5222c(android.content.Context r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, p.e.i<android.content.res.ColorStateList>> r0 = r3.f3348a     // Catch:{ all -> 0x004d }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x004d }
            p.e.i r0 = (p124p.p143e.C1262i) r0     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.mo5615b(r5, r1)     // Catch:{ all -> 0x004d }
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x004d }
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 != 0) goto L_0x004f
            p.b.q.k0$e r0 = r3.f3354g     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x001d
            goto L_0x0025
        L_0x001d:
            p.b.q.k0$e r0 = r3.f3354g     // Catch:{ all -> 0x004d }
            p.b.q.i$a r0 = (p124p.p126b.p136q.C1178i.C1179a) r0
            android.content.res.ColorStateList r1 = r0.mo5181b(r4, r5)     // Catch:{ all -> 0x004d }
        L_0x0025:
            if (r1 == 0) goto L_0x004b
            java.util.WeakHashMap<android.content.Context, p.e.i<android.content.res.ColorStateList>> r0 = r3.f3348a     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0032
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x004d }
            r0.<init>()     // Catch:{ all -> 0x004d }
            r3.f3348a = r0     // Catch:{ all -> 0x004d }
        L_0x0032:
            java.util.WeakHashMap<android.content.Context, p.e.i<android.content.res.ColorStateList>> r0 = r3.f3348a     // Catch:{ all -> 0x004d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x004d }
            p.e.i r0 = (p124p.p143e.C1262i) r0     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0048
            p.e.i r0 = new p.e.i     // Catch:{ all -> 0x004d }
            r2 = 10
            r0.<init>(r2)     // Catch:{ all -> 0x004d }
            java.util.WeakHashMap<android.content.Context, p.e.i<android.content.res.ColorStateList>> r2 = r3.f3348a     // Catch:{ all -> 0x004d }
            r2.put(r4, r0)     // Catch:{ all -> 0x004d }
        L_0x0048:
            r0.mo5613a(r5, r1)     // Catch:{ all -> 0x004d }
        L_0x004b:
            r0 = r1
            goto L_0x004f
        L_0x004d:
            r4 = move-exception
            goto L_0x0051
        L_0x004f:
            monitor-exit(r3)
            return r0
        L_0x0051:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p136q.C1185k0.mo5222c(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x007b A[Catch:{ Exception -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1 A[Catch:{ Exception -> 0x00a9 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo5223d(android.content.Context r11, int r12) {
        /*
            r10 = this;
            p.e.a<java.lang.String, p.b.q.k0$d> r0 = r10.f3349b
            r1 = 0
            if (r0 == 0) goto L_0x00b9
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b9
            p.e.i<java.lang.String> r0 = r10.f3350c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo5615b(r12, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x0031
            p.e.a<java.lang.String, p.b.q.k0$d> r3 = r10.f3349b
            java.lang.Object r0 = r3.getOrDefault(r0, r1)
            if (r0 != 0) goto L_0x0031
        L_0x0027:
            return r1
        L_0x0028:
            p.e.i r0 = new p.e.i
            r1 = 10
            r0.<init>(r1)
            r10.f3350c = r0
        L_0x0031:
            android.util.TypedValue r0 = r10.f3352e
            if (r0 != 0) goto L_0x003c
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f3352e = r0
        L_0x003c:
            android.util.TypedValue r0 = r10.f3352e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            int r4 = r0.assetCookie
            long r4 = (long) r4
            r6 = 32
            long r4 = r4 << r6
            int r6 = r0.data
            long r6 = (long) r6
            long r4 = r4 | r6
            android.graphics.drawable.Drawable r6 = r10.mo5215a(r11, r4)
            if (r6 == 0) goto L_0x0057
            return r6
        L_0x0057:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00b1
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00b1
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a9 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a9 }
        L_0x006f:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a9 }
            r9 = 2
            if (r8 == r9) goto L_0x0079
            if (r8 == r3) goto L_0x0079
            goto L_0x006f
        L_0x0079:
            if (r8 != r9) goto L_0x00a1
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a9 }
            p.e.i<java.lang.String> r8 = r10.f3350c     // Catch:{ Exception -> 0x00a9 }
            r8.mo5613a(r12, r3)     // Catch:{ Exception -> 0x00a9 }
            p.e.a<java.lang.String, p.b.q.k0$d> r8 = r10.f3349b     // Catch:{ Exception -> 0x00a9 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a9 }
            p.b.q.k0$d r3 = (p124p.p126b.p136q.C1185k0.C1189d) r3     // Catch:{ Exception -> 0x00a9 }
            if (r3 == 0) goto L_0x0096
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a9 }
            android.graphics.drawable.Drawable r6 = r3.mo5224a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a9 }
        L_0x0096:
            if (r6 == 0) goto L_0x00b1
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a9 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a9 }
            r10.mo5220a(r11, r4, r6)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00b1
        L_0x00a1:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a9 }
            throw r11     // Catch:{ Exception -> 0x00a9 }
        L_0x00a9:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00b1:
            if (r6 != 0) goto L_0x00b8
            p.e.i<java.lang.String> r11 = r10.f3350c
            r11.mo5613a(r12, r2)
        L_0x00b8:
            return r6
        L_0x00b9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p136q.C1185k0.mo5223d(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public static synchronized C1185k0 m2968a() {
        C1185k0 k0Var;
        synchronized (C1185k0.class) {
            if (f3346i == null) {
                C1185k0 k0Var2 = new C1185k0();
                f3346i = k0Var2;
                if (VERSION.SDK_INT < 24) {
                    k0Var2.mo5217a("vector", (C1189d) new C1191f());
                    k0Var2.mo5217a("animated-vector", (C1189d) new C1187b());
                    k0Var2.mo5217a("animated-selector", (C1189d) new C1186a());
                }
            }
            k0Var = f3346i;
        }
        return k0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable mo5215a(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, p.e.e<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f3351d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            p.e.e r0 = (p124p.p143e.C1253e) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo5516b(r5, r1)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo5519c(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p136q.C1185k0.mo5215a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r0 != false) goto L_0x002a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.drawable.Drawable mo5213a(android.content.Context r5, int r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f3353f     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0006
            goto L_0x002a
        L_0x0006:
            r0 = 1
            r4.f3353f = r0     // Catch:{ all -> 0x0047 }
            int r1 = p124p.p126b.p132n.C1086a.abc_vector_test     // Catch:{ all -> 0x0047 }
            android.graphics.drawable.Drawable r1 = r4.mo5221b(r5, r1)     // Catch:{ all -> 0x0047 }
            r2 = 0
            if (r1 == 0) goto L_0x0049
            boolean r3 = r1 instanceof p124p.p192v.p193a.p194a.C1755g     // Catch:{ all -> 0x0047 }
            if (r3 != 0) goto L_0x0028
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0047 }
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r2
        L_0x0028:
            if (r0 == 0) goto L_0x0049
        L_0x002a:
            android.graphics.drawable.Drawable r0 = r4.mo5223d(r5, r6)     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0034
            android.graphics.drawable.Drawable r0 = r4.mo5212a(r5, r6)     // Catch:{ all -> 0x0047 }
        L_0x0034:
            if (r0 != 0) goto L_0x003a
            android.graphics.drawable.Drawable r0 = p124p.p150h.p152e.C1325a.m3377b(r5, r6)     // Catch:{ all -> 0x0047 }
        L_0x003a:
            if (r0 == 0) goto L_0x0040
            android.graphics.drawable.Drawable r0 = r4.mo5214a(r5, r6, r7, r0)     // Catch:{ all -> 0x0047 }
        L_0x0040:
            if (r0 == 0) goto L_0x0045
            p124p.p126b.p136q.C1145b0.m2891b(r0)     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r4)
            return r0
        L_0x0047:
            r5 = move-exception
            goto L_0x0053
        L_0x0049:
            r4.f3353f = r2     // Catch:{ all -> 0x0047 }
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0047 }
            java.lang.String r6 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r5.<init>(r6)     // Catch:{ all -> 0x0047 }
            throw r5     // Catch:{ all -> 0x0047 }
        L_0x0053:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p136q.C1185k0.mo5213a(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m2967a(int i, Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C1185k0.class) {
            C1188c cVar = f3347j;
            if (cVar != null) {
                int i2 = (i + 31) * 31;
                porterDuffColorFilter = (PorterDuffColorFilter) cVar.mo5525a(Integer.valueOf(mode.hashCode() + i2));
                if (porterDuffColorFilter == null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                    C1188c cVar2 = f3347j;
                    if (cVar2 != null) {
                        PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) cVar2.mo5526a(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
                    } else {
                        throw null;
                    }
                }
            } else {
                throw null;
            }
        }
        return porterDuffColorFilter;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo5214a(android.content.Context r10, int r11, boolean r12, android.graphics.drawable.Drawable r13) {
        /*
            r9 = this;
            android.content.res.ColorStateList r0 = r9.mo5222c(r10, r11)
            r1 = 0
            if (r0 == 0) goto L_0x0028
            boolean r10 = p124p.p126b.p136q.C1145b0.m2890a(r13)
            if (r10 == 0) goto L_0x0011
            android.graphics.drawable.Drawable r13 = r13.mutate()
        L_0x0011:
            r13.setTintList(r0)
            p.b.q.k0$e r10 = r9.f3354g
            if (r10 != 0) goto L_0x0019
            goto L_0x0021
        L_0x0019:
            p.b.q.i$a r10 = (p124p.p126b.p136q.C1178i.C1179a) r10
            int r10 = p124p.p126b.C1022e.abc_switch_thumb_material
            if (r11 != r10) goto L_0x0021
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
        L_0x0021:
            if (r1 == 0) goto L_0x00a3
            r13.setTintMode(r1)
            goto L_0x00a3
        L_0x0028:
            p.b.q.k0$e r0 = r9.f3354g
            if (r0 == 0) goto L_0x009a
            p.b.q.i$a r0 = (p124p.p126b.p136q.C1178i.C1179a) r0
            if (r0 == 0) goto L_0x0099
            int r2 = p124p.p126b.C1022e.abc_seekbar_track_material
            r3 = 1
            r4 = 16908301(0x102000d, float:2.3877265E-38)
            r5 = 16908303(0x102000f, float:2.387727E-38)
            r6 = 16908288(0x1020000, float:2.387723E-38)
            if (r11 != r2) goto L_0x006e
            r2 = r13
            android.graphics.drawable.LayerDrawable r2 = (android.graphics.drawable.LayerDrawable) r2
            android.graphics.drawable.Drawable r6 = r2.findDrawableByLayerId(r6)
            int r7 = p124p.p126b.C1018a.colorControlNormal
            int r7 = p124p.p126b.p136q.C1203p0.m3005b(r10, r7)
            android.graphics.PorterDuff$Mode r8 = p124p.p126b.p136q.C1178i.f3325b
            r0.mo5179a(r6, r7, r8)
            android.graphics.drawable.Drawable r5 = r2.findDrawableByLayerId(r5)
            int r6 = p124p.p126b.C1018a.colorControlNormal
        L_0x0055:
            int r6 = p124p.p126b.p136q.C1203p0.m3005b(r10, r6)
            android.graphics.PorterDuff$Mode r7 = p124p.p126b.p136q.C1178i.f3325b
            r0.mo5179a(r5, r6, r7)
            android.graphics.drawable.Drawable r2 = r2.findDrawableByLayerId(r4)
            int r4 = p124p.p126b.C1018a.colorControlActivated
            int r4 = p124p.p126b.p136q.C1203p0.m3005b(r10, r4)
            android.graphics.PorterDuff$Mode r5 = p124p.p126b.p136q.C1178i.f3325b
            r0.mo5179a(r2, r4, r5)
            goto L_0x0096
        L_0x006e:
            int r2 = p124p.p126b.C1022e.abc_ratingbar_material
            if (r11 == r2) goto L_0x007d
            int r2 = p124p.p126b.C1022e.abc_ratingbar_indicator_material
            if (r11 == r2) goto L_0x007d
            int r2 = p124p.p126b.C1022e.abc_ratingbar_small_material
            if (r11 != r2) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r3 = 0
            goto L_0x0096
        L_0x007d:
            r2 = r13
            android.graphics.drawable.LayerDrawable r2 = (android.graphics.drawable.LayerDrawable) r2
            android.graphics.drawable.Drawable r6 = r2.findDrawableByLayerId(r6)
            int r7 = p124p.p126b.C1018a.colorControlNormal
            int r7 = p124p.p126b.p136q.C1203p0.m3004a(r10, r7)
            android.graphics.PorterDuff$Mode r8 = p124p.p126b.p136q.C1178i.f3325b
            r0.mo5179a(r6, r7, r8)
            android.graphics.drawable.Drawable r5 = r2.findDrawableByLayerId(r5)
            int r6 = p124p.p126b.C1018a.colorControlActivated
            goto L_0x0055
        L_0x0096:
            if (r3 == 0) goto L_0x009a
            goto L_0x00a3
        L_0x0099:
            throw r1
        L_0x009a:
            boolean r10 = r9.mo5219a(r10, r11, r13)
            if (r10 != 0) goto L_0x00a3
            if (r12 == 0) goto L_0x00a3
            r13 = r1
        L_0x00a3:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p136q.C1185k0.mo5214a(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public static void m2969a(Drawable drawable, C1209s0 s0Var, int[] iArr) {
        if (!C1145b0.m2890a(drawable) || drawable.mutate() == drawable) {
            if (s0Var.f3416d || s0Var.f3415c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = s0Var.f3416d ? s0Var.f3413a : null;
                Mode mode = s0Var.f3415c ? s0Var.f3414b : f3345h;
                if (!(colorStateList == null || mode == null)) {
                    porterDuffColorFilter = m2967a(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5219a(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            p.b.q.k0$e r0 = r7.f3354g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x006f
            p.b.q.i$a r0 = (p124p.p126b.p136q.C1178i.C1179a) r0
            if (r0 == 0) goto L_0x006d
            android.graphics.PorterDuff$Mode r3 = p124p.p126b.p136q.C1178i.f3325b
            int[] r4 = r0.f3328a
            boolean r4 = r0.mo5180a(r4, r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L_0x001b
            int r5 = p124p.p126b.C1018a.colorControlNormal
            goto L_0x0044
        L_0x001b:
            int[] r4 = r0.f3330c
            boolean r4 = r0.mo5180a(r4, r9)
            if (r4 == 0) goto L_0x0026
            int r5 = p124p.p126b.C1018a.colorControlActivated
            goto L_0x0044
        L_0x0026:
            int[] r4 = r0.f3331d
            boolean r0 = r0.mo5180a(r4, r9)
            if (r0 == 0) goto L_0x0031
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0044
        L_0x0031:
            int r0 = p124p.p126b.C1022e.abc_list_divider_mtrl_alpha
            if (r9 != r0) goto L_0x0040
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L_0x0046
        L_0x0040:
            int r0 = p124p.p126b.C1022e.abc_dialog_material_background
            if (r9 != r0) goto L_0x0048
        L_0x0044:
            r9 = r5
            r0 = r6
        L_0x0046:
            r4 = r1
            goto L_0x004b
        L_0x0048:
            r9 = r2
            r4 = r9
            r0 = r6
        L_0x004b:
            if (r4 == 0) goto L_0x0069
            boolean r4 = p124p.p126b.p136q.C1145b0.m2890a(r10)
            if (r4 == 0) goto L_0x0057
            android.graphics.drawable.Drawable r10 = r10.mutate()
        L_0x0057:
            int r8 = p124p.p126b.p136q.C1203p0.m3005b(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = p124p.p126b.p136q.C1178i.m2950a(r8, r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L_0x0067
            r10.setAlpha(r0)
        L_0x0067:
            r8 = r1
            goto L_0x006a
        L_0x0069:
            r8 = r2
        L_0x006a:
            if (r8 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006d:
            r8 = 0
            throw r8
        L_0x006f:
            r1 = r2
        L_0x0070:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p136q.C1185k0.mo5219a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
