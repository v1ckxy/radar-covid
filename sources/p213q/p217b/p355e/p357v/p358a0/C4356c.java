package p213q.p217b.p355e.p357v.p358a0;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import p213q.p217b.p355e.C4333j;

/* renamed from: q.b.e.v.a0.c */
public final class C4356c extends C4355b {

    /* renamed from: d */
    public static Class f10397d;

    /* renamed from: b */
    public final Object f10398b;

    /* renamed from: c */
    public final Field f10399c;

    public C4356c() {
        Object obj;
        Field field = null;
        try {
            Class cls = Class.forName("sun.misc.Unsafe");
            f10397d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f10398b = obj;
        try {
            field = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused2) {
        }
        this.f10399c = field;
    }

    /* renamed from: a */
    public void mo10575a(AccessibleObject accessibleObject) {
        boolean z = false;
        if (!(this.f10398b == null || this.f10399c == null)) {
            try {
                long longValue = ((Long) f10397d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f10398b, new Object[]{this.f10399c})).longValue();
                f10397d.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f10398b, new Object[]{accessibleObject, Long.valueOf(longValue), Boolean.valueOf(true)});
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Gson couldn't modify fields for ");
                sb.append(accessibleObject);
                sb.append("\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.");
                throw new C4333j(sb.toString(), e);
            }
        }
    }
}
