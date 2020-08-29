package p213q.p217b.p355e.p357v;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: q.b.e.v.f */
public class C4361f implements C4383s<T> {

    /* renamed from: a */
    public final C4389y f10400a;

    /* renamed from: b */
    public final /* synthetic */ Class f10401b;

    /* renamed from: c */
    public final /* synthetic */ Type f10402c;

    public C4361f(C4362g gVar, Class cls, Type type) {
        C4389y yVar;
        this.f10401b = cls;
        this.f10402c = type;
        String str = "newInstance";
        try {
            Class cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            yVar = new C4385u(cls2.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get(null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke(null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod(str, new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                yVar = new C4386v(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod(str, new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    yVar = new C4387w(declaredMethod3);
                } catch (Exception unused3) {
                    yVar = new C4388x();
                }
            }
        }
        this.f10400a = yVar;
    }

    /* renamed from: a */
    public T mo10576a() {
        try {
            return this.f10400a.mo10624a(this.f10401b);
        } catch (Exception e) {
            StringBuilder a = C1965a.m4756a("Unable to invoke no-args constructor for ");
            a.append(this.f10402c);
            a.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(a.toString(), e);
        }
    }
}
