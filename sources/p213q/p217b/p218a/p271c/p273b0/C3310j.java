package p213q.p217b.p218a.p271c.p273b0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import p124p.p126b.p134p.C1092c;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p271c.C3294b;
import p213q.p217b.p218a.p271c.C3406l;

/* renamed from: q.b.a.c.b0.j */
public final class C3310j {

    /* renamed from: a */
    public static final int[] f8300a = {C3294b.colorPrimary};

    /* renamed from: b */
    public static final int[] f8301b = {C3294b.colorPrimaryVariant};

    /* renamed from: c */
    public static final int[] f8302c = {16842752, C3294b.theme};

    /* renamed from: d */
    public static final int[] f8303d = {C3294b.materialThemeOverlay};

    /* renamed from: a */
    public static void m7687a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3406l.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C3406l.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C3294b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m7689a(context, f8301b, "Theme.MaterialComponents");
            }
        }
        m7689a(context, f8300a, "Theme.AppCompat");
    }

    /* renamed from: b */
    public static Context m7690b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8303d, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if (resourceId == 0) {
            return context;
        }
        if ((context instanceof C1092c) && ((C1092c) context).f2919a == resourceId) {
            return context;
        }
        C1092c cVar = new C1092c(context, resourceId);
        TypedArray obtainStyledAttributes2 = cVar.obtainStyledAttributes(attributeSet, f8302c);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        return resourceId2 != 0 ? new C1092c((Context) cVar, resourceId2) : cVar;
    }

    /* renamed from: b */
    public static TypedArray m7691b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m7687a(context, attributeSet, i, i2);
        m7688a(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r0.getResourceId(p213q.p217b.p218a.p271c.C3406l.ThemeEnforcement_android_textAppearance, -1) != -1) goto L_0x0035;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m7688a(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        /*
            int[] r0 = p213q.p217b.p218a.p271c.C3406l.ThemeEnforcement
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r8, r9)
            int r1 = p213q.p217b.p218a.p271c.C3406l.ThemeEnforcement_enforceTextAppearance
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L_0x0013
            r0.recycle()
            return
        L_0x0013:
            r1 = 1
            r3 = -1
            if (r10 == 0) goto L_0x0037
            int r4 = r10.length
            if (r4 != 0) goto L_0x001b
            goto L_0x0037
        L_0x001b:
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
            int r6 = r10.length
            r7 = r2
        L_0x0021:
            if (r7 >= r6) goto L_0x0032
            r8 = r10[r7]
            int r8 = r5.getResourceId(r8, r3)
            if (r8 != r3) goto L_0x002f
            r5.recycle()
            goto L_0x0040
        L_0x002f:
            int r7 = r7 + 1
            goto L_0x0021
        L_0x0032:
            r5.recycle()
        L_0x0035:
            r2 = r1
            goto L_0x0040
        L_0x0037:
            int r5 = p213q.p217b.p218a.p271c.C3406l.ThemeEnforcement_android_textAppearance
            int r5 = r0.getResourceId(r5, r3)
            if (r5 == r3) goto L_0x0040
            goto L_0x0035
        L_0x0040:
            r0.recycle()
            if (r2 == 0) goto L_0x0046
            return
        L_0x0046:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p271c.p273b0.C3310j.m7688a(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    /* renamed from: a */
    public static void m7689a(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= iArr.length) {
                obtainStyledAttributes.recycle();
                z = true;
                break;
            } else if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            throw new IllegalArgumentException(C1965a.m4752a("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }
}
