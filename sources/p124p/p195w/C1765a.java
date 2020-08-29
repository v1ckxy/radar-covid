package p124p.p195w;

import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p124p.p143e.C1248a;

/* renamed from: p.w.a */
public abstract class C1765a {

    /* renamed from: a */
    public final C1248a<String, Method> f5180a;

    /* renamed from: b */
    public final C1248a<String, Method> f5181b;

    /* renamed from: c */
    public final C1248a<String, Class> f5182c;

    public C1765a(C1248a<String, Method> aVar, C1248a<String, Method> aVar2, C1248a<String, Class> aVar3) {
        this.f5180a = aVar;
        this.f5181b = aVar2;
        this.f5182c = aVar3;
    }

    /* renamed from: a */
    public final Class mo6743a(Class<? extends C1767c> cls) {
        Class cls2 = (Class) this.f5182c.getOrDefault(cls.getName(), null);
        if (cls2 != null) {
            return cls2;
        }
        Class cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f5182c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: a */
    public abstract void mo6745a();

    /* renamed from: a */
    public abstract boolean mo6747a(int i);

    /* renamed from: b */
    public final Method mo6749b(Class cls) {
        Method method = (Method) this.f5181b.getOrDefault(cls.getName(), null);
        if (method != null) {
            return method;
        }
        Class a = mo6743a(cls);
        System.currentTimeMillis();
        Method declaredMethod = a.getDeclaredMethod("write", new Class[]{cls, C1765a.class});
        this.f5181b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: b */
    public abstract C1765a mo6750b();

    /* renamed from: b */
    public abstract void mo6751b(int i);

    /* renamed from: c */
    public <T extends C1767c> T mo6754c() {
        String readString = ((C1766b) this).f5184e.readString();
        if (readString == null) {
            return null;
        }
        C1765a b = mo6750b();
        try {
            return (C1767c) mo6744a(readString).invoke(null, new Object[]{b});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: a */
    public final Method mo6744a(String str) {
        Class<C1765a> cls = C1765a.class;
        Method method = (Method) this.f5180a.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f5180a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: b */
    public void mo6752b(int i, int i2) {
        mo6751b(i2);
        ((C1766b) this).f5184e.writeInt(i);
    }

    /* renamed from: b */
    public void mo6753b(Parcelable parcelable, int i) {
        mo6751b(i);
        ((C1766b) this).f5184e.writeParcelable(parcelable, 0);
    }

    /* renamed from: a */
    public boolean mo6748a(boolean z, int i) {
        if (!mo6747a(i)) {
            return z;
        }
        return ((C1766b) this).f5184e.readInt() != 0;
    }

    /* renamed from: a */
    public CharSequence mo6742a(CharSequence charSequence, int i) {
        if (!mo6747a(i)) {
            return charSequence;
        }
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1766b) this).f5184e);
    }

    /* renamed from: a */
    public int mo6740a(int i, int i2) {
        return !mo6747a(i2) ? i : ((C1766b) this).f5184e.readInt();
    }

    /* renamed from: a */
    public <T extends Parcelable> T mo6741a(T t, int i) {
        return !mo6747a(i) ? t : ((C1766b) this).f5184e.readParcelable(C1766b.class.getClassLoader());
    }

    /* renamed from: a */
    public void mo6746a(C1767c cVar) {
        if (cVar == null) {
            ((C1766b) this).f5184e.writeString(null);
            return;
        }
        try {
            ((C1766b) this).f5184e.writeString(mo6743a(cVar.getClass()).getName());
            C1765a b = mo6750b();
            try {
                mo6749b(cVar.getClass()).invoke(null, new Object[]{cVar, b});
                b.mo6745a();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e2.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            }
        } catch (ClassNotFoundException e5) {
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), e5);
        }
    }
}
