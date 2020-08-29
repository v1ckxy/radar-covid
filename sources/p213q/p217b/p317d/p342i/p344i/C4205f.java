package p213q.p217b.p317d.p342i.p344i;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import p213q.p217b.p317d.p342i.C4192c;
import p213q.p217b.p317d.p342i.C4193d;
import p213q.p217b.p317d.p342i.C4194e;
import p213q.p217b.p317d.p342i.C4195f;
import p213q.p217b.p317d.p342i.C4196g;

/* renamed from: q.b.d.i.i.f */
public final class C4205f implements C4194e, C4196g {

    /* renamed from: a */
    public C4205f f10143a = null;

    /* renamed from: b */
    public boolean f10144b = true;

    /* renamed from: c */
    public final JsonWriter f10145c;

    /* renamed from: d */
    public final Map<Class<?>, C4193d<?>> f10146d;

    /* renamed from: e */
    public final Map<Class<?>, C4195f<?>> f10147e;

    /* renamed from: f */
    public final C4193d<Object> f10148f;

    /* renamed from: g */
    public final boolean f10149g;

    public C4205f(Writer writer, Map<Class<?>, C4193d<?>> map, Map<Class<?>, C4195f<?>> map2, C4193d<Object> dVar, boolean z) {
        this.f10145c = new JsonWriter(writer);
        this.f10146d = map;
        this.f10147e = map2;
        this.f10148f = dVar;
        this.f10149g = z;
    }

    /* renamed from: a */
    public C4194e mo10384a(String str, int i) {
        mo10392a();
        this.f10145c.name(str);
        mo10392a();
        this.f10145c.value((long) i);
        return this;
    }

    /* renamed from: a */
    public final void mo10392a() {
        if (this.f10144b) {
            C4205f fVar = this.f10143a;
            if (fVar != null) {
                fVar.mo10392a();
                this.f10143a.f10144b = false;
                this.f10143a = null;
                this.f10145c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    /* renamed from: a */
    public C4194e mo10385a(String str, long j) {
        mo10392a();
        this.f10145c.name(str);
        mo10392a();
        this.f10145c.value(j);
        return this;
    }

    /* renamed from: a */
    public C4194e mo10387a(String str, boolean z) {
        mo10392a();
        this.f10145c.name(str);
        mo10392a();
        this.f10145c.value(z);
        return this;
    }

    /* renamed from: a */
    public C4196g mo10388a(String str) {
        mo10392a();
        this.f10145c.value(str);
        return this;
    }

    /* renamed from: a */
    public C4196g mo10389a(boolean z) {
        mo10392a();
        this.f10145c.value(z);
        return this;
    }

    /* renamed from: a */
    public C4205f mo10391a(Object obj, boolean z) {
        int i = 0;
        if (z) {
            if (obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number)) {
                Object[] objArr = new Object[1];
                objArr[0] = obj == null ? null : obj.getClass();
                throw new C4192c(String.format("%s cannot be encoded inline", objArr));
            }
        }
        if (obj == null) {
            this.f10145c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f10145c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                mo10392a();
                this.f10145c.value(Base64.encodeToString(bArr, 2));
                return this;
            }
            this.f10145c.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    this.f10145c.value((long) iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    long j = jArr[i];
                    mo10392a();
                    this.f10145c.value(j);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f10145c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f10145c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number a : (Number[]) obj) {
                    mo10391a((Object) a, false);
                }
            } else {
                for (Object a2 : (Object[]) obj) {
                    mo10391a(a2, false);
                }
            }
            this.f10145c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            Collection<Object> collection = (Collection) obj;
            this.f10145c.beginArray();
            for (Object a3 : collection) {
                mo10391a(a3, false);
            }
            this.f10145c.endArray();
            return this;
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            this.f10145c.beginObject();
            for (Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                try {
                    mo10386a((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new C4192c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                }
            }
            this.f10145c.endObject();
            return this;
        } else {
            C4193d dVar = (C4193d) this.f10146d.get(obj.getClass());
            if (dVar != null) {
                if (!z) {
                    this.f10145c.beginObject();
                }
                dVar.mo6969a(obj, this);
                if (!z) {
                    this.f10145c.endObject();
                }
                return this;
            }
            C4195f fVar = (C4195f) this.f10147e.get(obj.getClass());
            if (fVar != null) {
                fVar.mo6969a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                mo10392a();
                this.f10145c.value(name);
                return this;
            } else {
                C4193d<Object> dVar2 = this.f10148f;
                if (!z) {
                    this.f10145c.beginObject();
                }
                dVar2.mo6969a(obj, this);
                if (!z) {
                    this.f10145c.endObject();
                }
                return this;
            }
        }
    }

    /* renamed from: a */
    public C4205f m9681a(String str, Object obj) {
        C4205f fVar;
        C4205f fVar2;
        if (this.f10149g) {
            if (obj == null) {
                fVar2 = this;
            } else {
                mo10392a();
                this.f10145c.name(str);
                fVar2 = mo10391a(obj, false);
            }
            return fVar2;
        }
        mo10392a();
        this.f10145c.name(str);
        if (obj == null) {
            this.f10145c.nullValue();
            fVar = this;
        } else {
            fVar = mo10391a(obj, false);
        }
        return fVar;
    }
}
