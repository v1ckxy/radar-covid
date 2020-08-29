package p124p.p150h.p154f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p124p.p126b.p127k.C1061o;
import p124p.p150h.p152e.p153b.C1328c;
import p124p.p150h.p152e.p153b.C1329d;

/* renamed from: p.h.f.e */
public class C1339e extends C1344j {

    /* renamed from: b */
    public static Class<?> f4043b = null;

    /* renamed from: c */
    public static Constructor<?> f4044c = null;

    /* renamed from: d */
    public static Method f4045d = null;

    /* renamed from: e */
    public static Method f4046e = null;

    /* renamed from: f */
    public static boolean f4047f = false;

    /* renamed from: a */
    public static void m3397a() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f4047f) {
            f4047f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method2 = null;
                cls = null;
                method = null;
            }
            f4044c = constructor;
            f4043b = cls;
            f4045d = method;
            f4046e = method2;
        }
    }

    /* renamed from: a */
    public static boolean m3398a(Object obj, String str, int i, boolean z) {
        m3397a();
        try {
            return ((Boolean) f4045d.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public Typeface mo5800a(Context context, C1328c cVar, Resources resources, int i) {
        m3397a();
        try {
            Object newInstance = f4044c.newInstance(new Object[0]);
            C1329d[] dVarArr = cVar.f4018a;
            int length = dVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                C1329d dVar = dVarArr[i2];
                File a = C1061o.m2462a(context);
                if (a == null) {
                    return null;
                }
                try {
                    if (!C1061o.m2513a(a, resources, dVar.f4024f)) {
                        a.delete();
                        return null;
                    } else if (!m3398a(newInstance, a.getPath(), dVar.f4020b, dVar.f4021c)) {
                        return null;
                    } else {
                        i2++;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    a.delete();
                }
            }
            m3397a();
            try {
                Object newInstance2 = Array.newInstance(f4043b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f4046e.invoke(null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[SYNTHETIC, Splitter:B:18:0x004e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo5799a(android.content.Context r4, android.os.CancellationSignal r5, p124p.p150h.p159i.C1355b.C1361f[] r6, int r7) {
        /*
            r3 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0006
            return r1
        L_0x0006:
            p.h.i.b$f r6 = r3.mo5810a(r6, r7)
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.f4084a     // Catch:{ IOException -> 0x0084 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch:{ IOException -> 0x0084 }
            if (r5 != 0) goto L_0x001e
            if (r5 == 0) goto L_0x001d
            r5.close()     // Catch:{ IOException -> 0x0084 }
        L_0x001d:
            return r1
        L_0x001e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ErrnoException -> 0x004b }
            r6.<init>()     // Catch:{ ErrnoException -> 0x004b }
            java.lang.String r7 = "/proc/self/fd/"
            r6.append(r7)     // Catch:{ ErrnoException -> 0x004b }
            int r7 = r5.getFd()     // Catch:{ ErrnoException -> 0x004b }
            r6.append(r7)     // Catch:{ ErrnoException -> 0x004b }
            java.lang.String r6 = r6.toString()     // Catch:{ ErrnoException -> 0x004b }
            java.lang.String r6 = android.system.Os.readlink(r6)     // Catch:{ ErrnoException -> 0x004b }
            android.system.StructStat r7 = android.system.Os.stat(r6)     // Catch:{ ErrnoException -> 0x004b }
            int r7 = r7.st_mode     // Catch:{ ErrnoException -> 0x004b }
            boolean r7 = android.system.OsConstants.S_ISREG(r7)     // Catch:{ ErrnoException -> 0x004b }
            if (r7 == 0) goto L_0x004b
            java.io.File r7 = new java.io.File     // Catch:{ ErrnoException -> 0x004b }
            r7.<init>(r6)     // Catch:{ ErrnoException -> 0x004b }
            goto L_0x004c
        L_0x0049:
            r4 = move-exception
            goto L_0x007b
        L_0x004b:
            r7 = r1
        L_0x004c:
            if (r7 == 0) goto L_0x005d
            boolean r6 = r7.canRead()     // Catch:{ all -> 0x0049 }
            if (r6 != 0) goto L_0x0055
            goto L_0x005d
        L_0x0055:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r7)     // Catch:{ all -> 0x0049 }
            r5.close()     // Catch:{ IOException -> 0x0084 }
            return r4
        L_0x005d:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0049 }
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch:{ all -> 0x0049 }
            r6.<init>(r7)     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface r4 = super.mo5811a(r4, r6)     // Catch:{ all -> 0x0071 }
            r6.close()     // Catch:{ all -> 0x0049 }
            r5.close()     // Catch:{ IOException -> 0x0084 }
            return r4
        L_0x0071:
            r4 = move-exception
            r6.close()     // Catch:{ all -> 0x0076 }
            goto L_0x007a
        L_0x0076:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch:{ all -> 0x0049 }
        L_0x007a:
            throw r4     // Catch:{ all -> 0x0049 }
        L_0x007b:
            r5.close()     // Catch:{ all -> 0x007f }
            goto L_0x0083
        L_0x007f:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x0084 }
        L_0x0083:
            throw r4     // Catch:{ IOException -> 0x0084 }
        L_0x0084:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p150h.p154f.C1339e.mo5799a(android.content.Context, android.os.CancellationSignal, p.h.i.b$f[], int):android.graphics.Typeface");
    }
}
