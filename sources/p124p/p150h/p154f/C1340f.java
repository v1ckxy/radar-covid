package p124p.p150h.p154f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.List;
import p124p.p126b.p127k.C1061o;
import p124p.p143e.C1261h;
import p124p.p150h.p152e.p153b.C1328c;
import p124p.p150h.p152e.p153b.C1329d;
import p124p.p150h.p159i.C1355b.C1361f;

/* renamed from: p.h.f.f */
public class C1340f extends C1344j {

    /* renamed from: b */
    public static final Class<?> f4048b;

    /* renamed from: c */
    public static final Constructor<?> f4049c;

    /* renamed from: d */
    public static final Method f4050d;

    /* renamed from: e */
    public static final Method f4051e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f4049c = constructor;
        f4048b = cls;
        f4050d = method;
        f4051e = method2;
    }

    /* renamed from: a */
    public static Typeface m3401a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f4048b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f4051e.invoke(null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m3402a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f4050d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public Typeface mo5800a(Context context, C1328c cVar, Resources resources, int i) {
        Object obj;
        C1329d[] dVarArr;
        ByteBuffer byteBuffer;
        FileInputStream fileInputStream;
        Throwable th;
        try {
            obj = f4049c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (C1329d dVar : cVar.f4018a) {
            int i2 = dVar.f4024f;
            File a = C1061o.m2462a(context);
            Resources resources2 = resources;
            if (a != null) {
                try {
                    if (C1061o.m2513a(a, resources2, i2)) {
                        try {
                            fileInputStream = new FileInputStream(a);
                            FileChannel channel = fileInputStream.getChannel();
                            byteBuffer = channel.map(MapMode.READ_ONLY, 0, channel.size());
                            fileInputStream.close();
                        } catch (IOException unused2) {
                            byteBuffer = null;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        a.delete();
                        if (byteBuffer != null || !m3402a(obj, byteBuffer, dVar.f4023e, dVar.f4020b, dVar.f4021c)) {
                            return null;
                        }
                    }
                } finally {
                    a.delete();
                }
            }
            byteBuffer = null;
            if (byteBuffer != null) {
                return null;
            }
        }
        return m3401a(obj);
        throw th;
    }

    /* renamed from: a */
    public Typeface mo5799a(Context context, CancellationSignal cancellationSignal, C1361f[] fVarArr, int i) {
        Object obj;
        try {
            obj = f4049c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        C1261h hVar = new C1261h();
        for (C1361f fVar : fVarArr) {
            Uri uri = fVar.f4084a;
            ByteBuffer byteBuffer = (ByteBuffer) hVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = C1061o.m2468a(context, cancellationSignal, uri);
                hVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !m3402a(obj, byteBuffer, fVar.f4085b, fVar.f4086c, fVar.f4087d)) {
                return null;
            }
        }
        Typeface a = m3401a(obj);
        if (a == null) {
            return null;
        }
        return Typeface.create(a, i);
    }
}
