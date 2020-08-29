package p213q.p217b.p218a.p231b.p251g.p256e;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import p213q.p217b.p218a.p231b.p251g.p256e.C2698u5;

/* renamed from: q.b.a.b.g.e.h6 */
public abstract class C2473h6<T extends C2698u5> {

    /* renamed from: a */
    public static final Logger f6573a = Logger.getLogger(C2615p5.class.getName());

    /* renamed from: b */
    public static String f6574b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* renamed from: a */
    public static <T extends C2698u5> T m5900a(Class<T> cls) {
        String str;
        Class<C2473h6> cls2 = C2473h6.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(C2698u5.class)) {
            str = f6574b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (C2698u5) cls.cast(((C2473h6) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo7705a());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((C2473h6) it.next()).mo7705a()));
                } catch (ServiceConfigurationError e5) {
                    ServiceConfigurationError serviceConfigurationError = e5;
                    Logger logger = f6573a;
                    Level level = Level.SEVERE;
                    String str2 = "Unable to load ";
                    String simpleName = cls.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? str2.concat(simpleName) : new String(str2), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (C2698u5) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C2698u5) cls.getMethod("combine", new Class[]{Collection.class}).invoke(null, new Object[]{arrayList});
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* renamed from: a */
    public abstract T mo7705a();
}
