package p124p.p150h.p154f;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface.Builder;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p124p.p150h.p152e.p153b.C1328c;
import p124p.p150h.p152e.p153b.C1329d;
import p124p.p150h.p159i.C1355b;
import p124p.p150h.p159i.C1355b.C1361f;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.h.f.g */
public class C1341g extends C1339e {

    /* renamed from: g */
    public final Class<?> f4052g;

    /* renamed from: h */
    public final Constructor<?> f4053h;

    /* renamed from: i */
    public final Method f4054i;

    /* renamed from: j */
    public final Method f4055j;

    /* renamed from: k */
    public final Method f4056k;

    /* renamed from: l */
    public final Method f4057l;

    /* renamed from: m */
    public final Method f4058m;

    public C1341g() {
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = mo5802a(cls2);
            method2 = mo5806b(cls2);
            method = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            Class<?> cls3 = cls2;
            method5 = mo5808c(cls2);
            cls = cls3;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder a = C1965a.m4756a("Unable to collect necessary methods for class ");
            a.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", a.toString(), e);
            method5 = null;
            method4 = null;
            constructor = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f4052g = cls;
        this.f4053h = constructor;
        this.f4054i = method3;
        this.f4055j = method2;
        this.f4056k = method;
        this.f4057l = method4;
        this.f4058m = method5;
    }

    /* renamed from: c */
    private Object m3405c() {
        try {
            return this.f4053h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public Typeface mo5801a(Context context, Resources resources, int i, String str, int i2) {
        if (!mo5807b()) {
            return super.mo5801a(context, resources, i, str, i2);
        }
        Object c = m3405c();
        if (c == null) {
            return null;
        }
        if (!mo5804a(context, c, str, 0, -1, -1, null)) {
            mo5803a(c);
            return null;
        } else if (!mo5809c(c)) {
            return null;
        } else {
            return mo5805b(c);
        }
    }

    /* renamed from: a */
    public Typeface mo5800a(Context context, C1328c cVar, Resources resources, int i) {
        C1329d[] dVarArr;
        if (!mo5807b()) {
            return super.mo5800a(context, cVar, resources, i);
        }
        Object c = m3405c();
        if (c == null) {
            return null;
        }
        for (C1329d dVar : cVar.f4018a) {
            if (!mo5804a(context, c, dVar.f4019a, dVar.f4023e, dVar.f4020b, dVar.f4021c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.f4022d))) {
                mo5803a(c);
                return null;
            }
        }
        if (!mo5809c(c)) {
            return null;
        }
        return mo5805b(c);
    }

    /* renamed from: a */
    public Method mo5802a(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* renamed from: a */
    public final void mo5803a(Object obj) {
        try {
            this.f4057l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo5804a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f4054i.invoke(obj, new Object[]{context.getAssets(), str, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public Typeface mo5805b(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f4052g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f4058m.invoke(null, new Object[]{newInstance, Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public Method mo5806b(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* renamed from: b */
    public final boolean mo5807b() {
        if (this.f4054i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f4054i != null;
    }

    /* renamed from: c */
    public Method mo5808c(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: c */
    public final boolean mo5809c(Object obj) {
        try {
            return ((Boolean) this.f4056k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public Typeface mo5799a(Context context, CancellationSignal cancellationSignal, C1361f[] fVarArr, int i) {
        boolean z;
        ParcelFileDescriptor openFileDescriptor;
        if (fVarArr.length < 1) {
            return null;
        }
        if (!mo5807b()) {
            C1361f a = mo5810a(fVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(a.f4084a, "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Builder(openFileDescriptor.getFileDescriptor()).setWeight(a.f4086c).setItalic(a.f4087d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Map a2 = C1355b.m3440a(context, fVarArr, cancellationSignal);
            Object c = m3405c();
            if (c == null) {
                return null;
            }
            boolean z2 = false;
            for (C1361f fVar : fVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) a2.get(fVar.f4084a);
                if (byteBuffer != null) {
                    try {
                        z = ((Boolean) this.f4055j.invoke(c, new Object[]{byteBuffer, Integer.valueOf(fVar.f4085b), null, Integer.valueOf(fVar.f4086c), Integer.valueOf(fVar.f4087d ? 1 : 0)})).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z = false;
                    }
                    if (!z) {
                        mo5803a(c);
                        return null;
                    }
                    z2 = true;
                }
            }
            if (!z2) {
                mo5803a(c);
                return null;
            } else if (!mo5809c(c)) {
                return null;
            } else {
                Typeface b = mo5805b(c);
                if (b == null) {
                    return null;
                }
                return Typeface.create(b, i);
            }
        }
        throw th;
    }
}
