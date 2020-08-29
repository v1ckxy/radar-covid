package p116io.jsonwebtoken.impl.lang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import p116io.jsonwebtoken.lang.Assert;
import p116io.jsonwebtoken.lang.Collections;

/* renamed from: io.jsonwebtoken.impl.lang.Services */
public final class Services {
    public static final List<ClassLoaderAccessor> CLASS_LOADER_ACCESSORS = Collections.arrayToList(new ClassLoaderAccessor[]{new ClassLoaderAccessor() {
        public ClassLoader getClassLoader() {
            return Thread.currentThread().getContextClassLoader();
        }
    }, new ClassLoaderAccessor() {
        public ClassLoader getClassLoader() {
            return Services.class.getClassLoader();
        }
    }, new ClassLoaderAccessor() {
        public ClassLoader getClassLoader() {
            return ClassLoader.getSystemClassLoader();
        }
    }});

    /* renamed from: io.jsonwebtoken.impl.lang.Services$ClassLoaderAccessor */
    public interface ClassLoaderAccessor {
        ClassLoader getClassLoader();
    }

    public static <T> List<T> loadAll(Class<T> cls) {
        Assert.notNull(cls, "Parameter 'spi' must not be null.");
        for (ClassLoaderAccessor classLoader : CLASS_LOADER_ACCESSORS) {
            List loadAll = loadAll(cls, classLoader.getClassLoader());
            if (!loadAll.isEmpty()) {
                return java.util.Collections.unmodifiableList(loadAll);
            }
        }
        throw new UnavailableImplementationException(cls);
    }

    public static <T> List<T> loadAll(Class<T> cls, ClassLoader classLoader) {
        ServiceLoader load = ServiceLoader.load(cls, classLoader);
        ArrayList arrayList = new ArrayList();
        Iterator it = load.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static <T> T loadFirst(Class<T> cls) {
        Assert.notNull(cls, "Parameter 'spi' must not be null.");
        for (ClassLoaderAccessor classLoader : CLASS_LOADER_ACCESSORS) {
            T loadFirst = loadFirst(cls, classLoader.getClassLoader());
            if (loadFirst != null) {
                return loadFirst;
            }
        }
        throw new UnavailableImplementationException(cls);
    }

    public static <T> T loadFirst(Class<T> cls, ClassLoader classLoader) {
        ServiceLoader load = ServiceLoader.load(cls, classLoader);
        if (load.iterator().hasNext()) {
            return load.iterator().next();
        }
        return null;
    }
}
