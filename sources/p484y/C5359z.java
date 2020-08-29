package p484y;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* renamed from: y.z */
public class C5359z {

    /* renamed from: c */
    public static final C5359z f12681c = ("Dalvik".equals(System.getProperty("java.vm.name")) ? new C5360a() : new C5359z(true));

    /* renamed from: a */
    public final boolean f12682a;
    @Nullable

    /* renamed from: b */
    public final Constructor<Lookup> f12683b;

    /* renamed from: y.z$a */
    public static final class C5360a extends C5359z {

        /* renamed from: y.z$a$a */
        public static final class C5361a implements Executor {

            /* renamed from: e */
            public final Handler f12684e = new Handler(Looper.getMainLooper());

            public void execute(Runnable runnable) {
                this.f12684e.post(runnable);
            }
        }

        public C5360a() {
            super(VERSION.SDK_INT >= 24);
        }

        @Nullable
        /* renamed from: a */
        public Object mo12060a(Method method, Class<?> cls, Object obj, Object... objArr) {
            if (VERSION.SDK_INT >= 26) {
                return C5359z.super.mo12060a(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }

        /* renamed from: a */
        public Executor mo12061a() {
            return new C5361a();
        }
    }

    public C5359z(boolean z) {
        this.f12682a = z;
        Constructor<Lookup> constructor = null;
        if (z) {
            try {
                constructor = Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f12683b = constructor;
    }

    @Nullable
    @IgnoreJRERequirement
    /* renamed from: a */
    public Object mo12060a(Method method, Class<?> cls, Object obj, Object... objArr) {
        Lookup lookup;
        Constructor<Lookup> constructor = this.f12683b;
        if (constructor != null) {
            lookup = (Lookup) constructor.newInstance(new Object[]{cls, Integer.valueOf(-1)});
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    @Nullable
    /* renamed from: a */
    public Executor mo12061a() {
        return null;
    }
}
