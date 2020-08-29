package p410v;

import java.util.LinkedHashMap;
import java.util.Map;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4553f;
import p392u.p401r.p403c.C4638h;
import p410v.C4870w.C4871a;
import p410v.p411m0.C4737b;
import p410v.p411m0.p414e.C4777f;

/* renamed from: v.e0 */
public final class C4706e0 {

    /* renamed from: a */
    public C4704e f11028a;

    /* renamed from: b */
    public final C4873x f11029b;

    /* renamed from: c */
    public final String f11030c;

    /* renamed from: d */
    public final C4870w f11031d;

    /* renamed from: e */
    public final C4716h0 f11032e;

    /* renamed from: f */
    public final Map<Class<?>, Object> f11033f;

    /* renamed from: v.e0$a */
    public static class C4707a {

        /* renamed from: a */
        public C4873x f11034a;

        /* renamed from: b */
        public String f11035b;

        /* renamed from: c */
        public C4871a f11036c;

        /* renamed from: d */
        public C4716h0 f11037d;

        /* renamed from: e */
        public Map<Class<?>, Object> f11038e;

        public C4707a() {
            this.f11038e = new LinkedHashMap();
            this.f11035b = "GET";
            this.f11036c = new C4871a();
        }

        public C4707a(C4706e0 e0Var) {
            LinkedHashMap linkedHashMap;
            if (e0Var != null) {
                this.f11038e = new LinkedHashMap();
                this.f11034a = e0Var.f11029b;
                this.f11035b = e0Var.f11030c;
                this.f11037d = e0Var.f11032e;
                if (e0Var.f11033f.isEmpty()) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    Map<Class<?>, Object> map = e0Var.f11033f;
                    if (map != null) {
                        linkedHashMap = new LinkedHashMap(map);
                    } else {
                        C4638h.m10271a("$this$toMutableMap");
                        throw null;
                    }
                }
                this.f11038e = linkedHashMap;
                this.f11036c = e0Var.f11031d.mo11368c();
                return;
            }
            C4638h.m10271a("request");
            throw null;
        }

        /* renamed from: a */
        public C4707a mo11017a(String str, String str2) {
            if (str == null) {
                C4638h.m10271a("name");
                throw null;
            } else if (str2 != null) {
                this.f11036c.mo11382c(str, str2);
                return this;
            } else {
                C4638h.m10271a("value");
                throw null;
            }
        }

        /* renamed from: a */
        public C4706e0 mo11021a() {
            C4873x xVar = this.f11034a;
            if (xVar != null) {
                C4706e0 e0Var = new C4706e0(xVar, this.f11035b, this.f11036c.mo11378a(), this.f11037d, C4737b.m10459a(this.f11038e));
                return e0Var;
            }
            throw new IllegalStateException("url == null".toString());
        }

        /* renamed from: a */
        public C4707a mo11019a(C4870w wVar) {
            if (wVar != null) {
                this.f11036c = wVar.mo11368c();
                return this;
            }
            C4638h.m10271a("headers");
            throw null;
        }

        /* renamed from: a */
        public C4707a mo11018a(String str, C4716h0 h0Var) {
            if (str != null) {
                if (str.length() > 0) {
                    String str2 = "method ";
                    if (h0Var == null) {
                        if (!(true ^ C4777f.m10585b(str))) {
                            throw new IllegalArgumentException(C1965a.m4752a(str2, str, " must have a request body.").toString());
                        }
                    } else if (!C4777f.m10584a(str)) {
                        throw new IllegalArgumentException(C1965a.m4752a(str2, str, " must not have a request body.").toString());
                    }
                    this.f11035b = str;
                    this.f11037d = h0Var;
                    return this;
                }
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            C4638h.m10271a("method");
            throw null;
        }

        /* renamed from: a */
        public C4707a mo11016a(String str) {
            if (str != null) {
                this.f11036c.mo11381c(str);
                return this;
            }
            C4638h.m10271a("name");
            throw null;
        }

        /* renamed from: a */
        public <T> C4707a mo11015a(Class<? super T> cls, T t) {
            if (cls != null) {
                if (t == null) {
                    this.f11038e.remove(cls);
                } else {
                    if (this.f11038e.isEmpty()) {
                        this.f11038e = new LinkedHashMap();
                    }
                    Map<Class<?>, Object> map = this.f11038e;
                    Object cast = cls.cast(t);
                    if (cast != null) {
                        map.put(cls, cast);
                    } else {
                        C4638h.m10269a();
                        throw null;
                    }
                }
                return this;
            }
            C4638h.m10271a("type");
            throw null;
        }

        /* renamed from: a */
        public C4707a mo11020a(C4873x xVar) {
            if (xVar != null) {
                this.f11034a = xVar;
                return this;
            }
            C4638h.m10271a("url");
            throw null;
        }
    }

    public C4706e0(C4873x xVar, String str, C4870w wVar, C4716h0 h0Var, Map<Class<?>, ? extends Object> map) {
        if (xVar == null) {
            C4638h.m10271a("url");
            throw null;
        } else if (str == null) {
            C4638h.m10271a("method");
            throw null;
        } else if (wVar == null) {
            C4638h.m10271a("headers");
            throw null;
        } else if (map != null) {
            this.f11029b = xVar;
            this.f11030c = str;
            this.f11031d = wVar;
            this.f11032e = h0Var;
            this.f11033f = map;
        } else {
            C4638h.m10271a("tags");
            throw null;
        }
    }

    /* renamed from: a */
    public final String mo11012a(String str) {
        if (str != null) {
            return this.f11031d.mo11366a(str);
        }
        C4638h.m10271a("name");
        throw null;
    }

    /* renamed from: a */
    public final C4704e mo11013a() {
        C4704e eVar = this.f11028a;
        if (eVar != null) {
            return eVar;
        }
        C4704e a = C4704e.f11014n.mo11011a(this.f11031d);
        this.f11028a = a;
        return a;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("Request{method=");
        a.append(this.f11030c);
        a.append(", url=");
        a.append(this.f11029b);
        if (this.f11031d.size() != 0) {
            a.append(", headers=[");
            int i = 0;
            for (Object next : this.f11031d) {
                int i2 = i + 1;
                if (i >= 0) {
                    C4553f fVar = (C4553f) next;
                    String str = (String) fVar.f10766e;
                    String str2 = (String) fVar.f10767f;
                    if (i > 0) {
                        a.append(Objects.ARRAY_ELEMENT_SEPARATOR);
                    }
                    a.append(str);
                    a.append(':');
                    a.append(str2);
                    i = i2;
                } else {
                    C2286e.m5338f();
                    throw null;
                }
            }
            a.append(']');
        }
        if (!this.f11033f.isEmpty()) {
            a.append(", tags=");
            a.append(this.f11033f);
        }
        a.append('}');
        String sb = a.toString();
        C4638h.m10270a((Object) sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }
}
