package p124p.p192v.p193a.p194a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p124p.p126b.p127k.C1061o;
import p124p.p143e.C1248a;

/* renamed from: p.v.a.a.c */
public class C1748c extends C1754f implements C1747b {

    /* renamed from: f */
    public C1750b f5098f;

    /* renamed from: g */
    public Context f5099g;

    /* renamed from: h */
    public ArgbEvaluator f5100h;

    /* renamed from: i */
    public final Callback f5101i;

    /* renamed from: p.v.a.a.c$a */
    public class C1749a implements Callback {
        public C1749a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            C1748c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C1748c.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C1748c.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: p.v.a.a.c$b */
    public static class C1750b extends ConstantState {

        /* renamed from: a */
        public int f5103a;

        /* renamed from: b */
        public C1755g f5104b;

        /* renamed from: c */
        public AnimatorSet f5105c;

        /* renamed from: d */
        public ArrayList<Animator> f5106d;

        /* renamed from: e */
        public C1248a<Animator, String> f5107e;

        public C1750b(C1750b bVar, Callback callback, Resources resources) {
            if (bVar != null) {
                this.f5103a = bVar.f5103a;
                C1755g gVar = bVar.f5104b;
                if (gVar != null) {
                    ConstantState constantState = gVar.getConstantState();
                    C1755g gVar2 = (C1755g) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    this.f5104b = gVar2;
                    gVar2.mutate();
                    this.f5104b = gVar2;
                    gVar2.setCallback(callback);
                    this.f5104b.setBounds(bVar.f5104b.getBounds());
                    this.f5104b.f5117j = false;
                }
                ArrayList<Animator> arrayList = bVar.f5106d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f5106d = new ArrayList<>(size);
                    this.f5107e = new C1248a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = (Animator) bVar.f5106d.get(i);
                        Animator clone = animator.clone();
                        String str = (String) bVar.f5107e.getOrDefault(animator, null);
                        clone.setTarget(this.f5104b.f5113f.f5168b.f5166p.getOrDefault(str, null));
                        this.f5106d.add(clone);
                        this.f5107e.put(clone, str);
                    }
                    if (this.f5105c == null) {
                        this.f5105c = new AnimatorSet();
                    }
                    this.f5105c.playTogether(this.f5106d);
                }
            }
        }

        public int getChangingConfigurations() {
            return this.f5103a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: p.v.a.a.c$c */
    public static class C1751c extends ConstantState {

        /* renamed from: a */
        public final ConstantState f5108a;

        public C1751c(ConstantState constantState) {
            this.f5108a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f5108a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f5108a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1748c cVar = new C1748c(null, null, null);
            Drawable newDrawable = this.f5108a.newDrawable();
            cVar.f5111e = newDrawable;
            newDrawable.setCallback(cVar.f5101i);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            C1748c cVar = new C1748c(null, null, null);
            Drawable newDrawable = this.f5108a.newDrawable(resources);
            cVar.f5111e = newDrawable;
            newDrawable.setCallback(cVar.f5101i);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            C1748c cVar = new C1748c(null, null, null);
            Drawable newDrawable = this.f5108a.newDrawable(resources, theme);
            cVar.f5111e = newDrawable;
            newDrawable.setCallback(cVar.f5101i);
            return cVar;
        }
    }

    public C1748c() {
        this(null, null, null);
    }

    public C1748c(Context context, C1750b bVar, Resources resources) {
        this.f5100h = null;
        this.f5101i = new C1749a();
        this.f5099g = context;
        if (bVar != null) {
            this.f5098f = bVar;
        } else {
            this.f5098f = new C1750b(bVar, this.f5101i, resources);
        }
    }

    public void applyTheme(Theme theme) {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f5098f.f5104b.draw(canvas);
        if (this.f5098f.f5105c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f5098f.f5104b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f5111e;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f5098f.f5103a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f5098f.f5104b.getColorFilter();
    }

    public ConstantState getConstantState() {
        if (this.f5111e == null || VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1751c(this.f5111e.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f5111e;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f5098f.f5104b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f5111e;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f5098f.f5104b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f5111e;
        return drawable != null ? drawable.getOpacity() : this.f5098f.f5104b.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00eb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ec, code lost:
        r7 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f1, code lost:
        r7 = r15;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e9 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:32:0x0093] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = r24
            r3 = r25
            android.graphics.drawable.Drawable r4 = r1.f5111e
            r5 = r23
            if (r4 == 0) goto L_0x0012
            r4.inflate(r0, r5, r2, r3)
            return
        L_0x0012:
            int r4 = r23.getEventType()
            int r6 = r23.getDepth()
            r7 = 1
            int r6 = r6 + r7
        L_0x001c:
            if (r4 == r7) goto L_0x0150
            int r8 = r23.getDepth()
            if (r8 >= r6) goto L_0x0027
            r8 = 3
            if (r4 == r8) goto L_0x0150
        L_0x0027:
            r8 = 2
            if (r4 != r8) goto L_0x0149
            java.lang.String r4 = r23.getName()
            java.lang.String r8 = "animated-vector"
            boolean r8 = r8.equals(r4)
            r9 = 0
            r10 = 0
            if (r8 == 0) goto L_0x005e
            int[] r4 = p124p.p192v.p193a.p194a.C1746a.f5090e
            android.content.res.TypedArray r4 = p124p.p126b.p127k.C1061o.m2453a(r0, r3, r2, r4)
            int r8 = r4.getResourceId(r10, r10)
            if (r8 == 0) goto L_0x0146
            p.v.a.a.g r8 = p124p.p192v.p193a.p194a.C1755g.m4387a(r0, r8, r3)
            r8.f5117j = r10
            android.graphics.drawable.Drawable$Callback r10 = r1.f5101i
            r8.setCallback(r10)
            p.v.a.a.c$b r10 = r1.f5098f
            p.v.a.a.g r10 = r10.f5104b
            if (r10 == 0) goto L_0x0058
            r10.setCallback(r9)
        L_0x0058:
            p.v.a.a.c$b r9 = r1.f5098f
            r9.f5104b = r8
            goto L_0x0146
        L_0x005e:
            java.lang.String r8 = "target"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x0149
            int[] r4 = p124p.p192v.p193a.p194a.C1746a.f5091f
            android.content.res.TypedArray r4 = r0.obtainAttributes(r2, r4)
            java.lang.String r8 = r4.getString(r10)
            int r10 = r4.getResourceId(r7, r10)
            if (r10 == 0) goto L_0x0146
            android.content.Context r11 = r1.f5099g
            if (r11 == 0) goto L_0x013b
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 24
            if (r12 < r13) goto L_0x0085
            android.animation.Animator r10 = android.animation.AnimatorInflater.loadAnimator(r11, r10)
            goto L_0x00af
        L_0x0085:
            android.content.res.Resources r12 = r11.getResources()
            android.content.res.Resources$Theme r13 = r11.getTheme()
            java.lang.String r15 = "Can't load animation resource ID #0x"
            android.content.res.XmlResourceParser r19 = r12.getAnimation(r10)     // Catch:{ XmlPullParserException -> 0x0115, IOException -> 0x00f7 }
            android.util.AttributeSet r16 = android.util.Xml.asAttributeSet(r19)     // Catch:{ XmlPullParserException -> 0x00f0, IOException -> 0x00eb, all -> 0x00e9 }
            r17 = 0
            r18 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r14 = r19
            r7 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r20
            android.animation.Animator r10 = p124p.p126b.p127k.C1061o.m2444a(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ XmlPullParserException -> 0x00e7, IOException -> 0x00e5, all -> 0x00e9 }
            r19.close()
        L_0x00af:
            p.v.a.a.c$b r7 = r1.f5098f
            p.v.a.a.g r7 = r7.f5104b
            p.v.a.a.g$h r7 = r7.f5113f
            p.v.a.a.g$g r7 = r7.f5168b
            p.e.a<java.lang.String, java.lang.Object> r7 = r7.f5166p
            java.lang.Object r7 = r7.getOrDefault(r8, r9)
            r10.setTarget(r7)
            p.v.a.a.c$b r7 = r1.f5098f
            java.util.ArrayList<android.animation.Animator> r9 = r7.f5106d
            if (r9 != 0) goto L_0x00d6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r7.f5106d = r9
            p.v.a.a.c$b r7 = r1.f5098f
            p.e.a r9 = new p.e.a
            r9.<init>()
            r7.f5107e = r9
        L_0x00d6:
            p.v.a.a.c$b r7 = r1.f5098f
            java.util.ArrayList<android.animation.Animator> r7 = r7.f5106d
            r7.add(r10)
            p.v.a.a.c$b r7 = r1.f5098f
            p.e.a<android.animation.Animator, java.lang.String> r7 = r7.f5107e
            r7.put(r10, r8)
            goto L_0x0146
        L_0x00e5:
            r0 = move-exception
            goto L_0x00ed
        L_0x00e7:
            r0 = move-exception
            goto L_0x00f2
        L_0x00e9:
            r0 = move-exception
            goto L_0x0135
        L_0x00eb:
            r0 = move-exception
            r7 = r15
        L_0x00ed:
            r9 = r19
            goto L_0x00f9
        L_0x00f0:
            r0 = move-exception
            r7 = r15
        L_0x00f2:
            r9 = r19
            goto L_0x0117
        L_0x00f5:
            r0 = move-exception
            goto L_0x0133
        L_0x00f7:
            r0 = move-exception
            r7 = r15
        L_0x00f9:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x00f5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r3.<init>()     // Catch:{ all -> 0x00f5 }
            r3.append(r7)     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = java.lang.Integer.toHexString(r10)     // Catch:{ all -> 0x00f5 }
            r3.append(r4)     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00f5 }
            r2.<init>(r3)     // Catch:{ all -> 0x00f5 }
            r2.initCause(r0)     // Catch:{ all -> 0x00f5 }
            throw r2     // Catch:{ all -> 0x00f5 }
        L_0x0115:
            r0 = move-exception
            r7 = r15
        L_0x0117:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x00f5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r3.<init>()     // Catch:{ all -> 0x00f5 }
            r3.append(r7)     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = java.lang.Integer.toHexString(r10)     // Catch:{ all -> 0x00f5 }
            r3.append(r4)     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00f5 }
            r2.<init>(r3)     // Catch:{ all -> 0x00f5 }
            r2.initCause(r0)     // Catch:{ all -> 0x00f5 }
            throw r2     // Catch:{ all -> 0x00f5 }
        L_0x0133:
            r19 = r9
        L_0x0135:
            if (r19 == 0) goto L_0x013a
            r19.close()
        L_0x013a:
            throw r0
        L_0x013b:
            r4.recycle()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Context can't be null when inflating animators"
            r0.<init>(r2)
            throw r0
        L_0x0146:
            r4.recycle()
        L_0x0149:
            int r4 = r23.next()
            r7 = 1
            goto L_0x001c
        L_0x0150:
            p.v.a.a.c$b r0 = r1.f5098f
            android.animation.AnimatorSet r2 = r0.f5105c
            if (r2 != 0) goto L_0x015d
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r0.f5105c = r2
        L_0x015d:
            android.animation.AnimatorSet r2 = r0.f5105c
            java.util.ArrayList<android.animation.Animator> r0 = r0.f5106d
            r2.playTogether(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p192v.p193a.p194a.C1748c.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f5098f.f5104b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f5111e;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f5098f.f5105c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f5111e;
        return drawable != null ? drawable.isStateful() : this.f5098f.f5104b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f5098f.f5104b.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.f5111e;
        return drawable != null ? drawable.setLevel(i) : this.f5098f.f5104b.setLevel(i);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f5111e;
        return drawable != null ? drawable.setState(iArr) : this.f5098f.f5104b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f5098f.f5104b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
            return;
        }
        C1755g gVar = this.f5098f.f5104b;
        Drawable drawable2 = gVar.f5111e;
        if (drawable2 != null) {
            drawable2.setAutoMirrored(z);
        } else {
            gVar.f5113f.f5171e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        C1755g gVar = this.f5098f.f5104b;
        Drawable drawable2 = gVar.f5111e;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        } else {
            gVar.f5115h = colorFilter;
            gVar.invalidateSelf();
        }
    }

    public void setTint(int i) {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            C1061o.m2476a(drawable, i);
        } else {
            this.f5098f.f5104b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            C1061o.m2477a(drawable, colorStateList);
        } else {
            this.f5098f.f5104b.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            C1061o.m2478a(drawable, mode);
        } else {
            this.f5098f.f5104b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f5098f.f5104b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f5098f.f5105c.isStarted()) {
            this.f5098f.f5105c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f5111e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f5098f.f5105c.end();
        }
    }
}
