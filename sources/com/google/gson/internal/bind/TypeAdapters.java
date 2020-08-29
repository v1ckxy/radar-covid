package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter$1;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p355e.C4329f;
import p213q.p217b.p355e.C4332i;
import p213q.p217b.p355e.C4333j;
import p213q.p217b.p355e.C4334k;
import p213q.p217b.p355e.C4335l;
import p213q.p217b.p355e.C4337n;
import p213q.p217b.p355e.C4340q;
import p213q.p217b.p355e.C4344s;
import p213q.p217b.p355e.C4345t;
import p213q.p217b.p355e.p356u.C4347b;
import p213q.p217b.p355e.p357v.C4374q;
import p213q.p217b.p355e.p361w.C4396a;
import p213q.p217b.p355e.p362x.C4397a;
import p213q.p217b.p355e.p362x.C4399b;
import p213q.p217b.p355e.p362x.C4400c;

public final class TypeAdapters {

    /* renamed from: A */
    public static final C4344s<String> f1623A = new C4344s<String>() {
        /* renamed from: a */
        public Object mo3072a(C4397a aVar) {
            C4399b peek = aVar.peek();
            if (peek != C4399b.NULL) {
                return peek == C4399b.BOOLEAN ? Boolean.toString(aVar.mo10638t()) : aVar.mo10645z();
            }
            aVar.mo10644y();
            return null;
        }

        /* renamed from: a */
        public void mo3073a(C4400c cVar, Object obj) {
            cVar.mo10655d((String) obj);
        }
    };

    /* renamed from: B */
    public static final C4344s<BigDecimal> f1624B = new C4344s<BigDecimal>() {
        /* renamed from: a */
        public Object mo3072a(C4397a aVar) {
            if (aVar.peek() == C4399b.NULL) {
                aVar.mo10644y();
                return null;
            }
            try {
                return new BigDecimal(aVar.mo10645z());
            } catch (NumberFormatException e) {
                throw new C4340q((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo3073a(C4400c cVar, Object obj) {
            cVar.mo10649a((Number) (BigDecimal) obj);
        }
    };

    /* renamed from: C */
    public static final C4344s<BigInteger> f1625C = new C4344s<BigInteger>() {
        /* renamed from: a */
        public Object mo3072a(C4397a aVar) {
            if (aVar.peek() == C4399b.NULL) {
                aVar.mo10644y();
                return null;
            }
            try {
                return new BigInteger(aVar.mo10645z());
            } catch (NumberFormatException e) {
                throw new C4340q((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo3073a(C4400c cVar, Object obj) {
            cVar.mo10649a((Number) (BigInteger) obj);
        }
    };

    /* renamed from: D */
    public static final C4345t f1626D;

    /* renamed from: E */
    public static final C4344s<StringBuilder> f1627E;

    /* renamed from: F */
    public static final C4345t f1628F;

    /* renamed from: G */
    public static final C4344s<StringBuffer> f1629G;

    /* renamed from: H */
    public static final C4345t f1630H;

    /* renamed from: I */
    public static final C4344s<URL> f1631I;

    /* renamed from: J */
    public static final C4345t f1632J;

    /* renamed from: K */
    public static final C4344s<URI> f1633K;

    /* renamed from: L */
    public static final C4345t f1634L;

    /* renamed from: M */
    public static final C4344s<InetAddress> f1635M;

    /* renamed from: N */
    public static final C4345t f1636N;

    /* renamed from: O */
    public static final C4344s<UUID> f1637O;

    /* renamed from: P */
    public static final C4345t f1638P;

    /* renamed from: Q */
    public static final C4344s<Currency> f1639Q;

    /* renamed from: R */
    public static final C4345t f1640R;

    /* renamed from: S */
    public static final C4345t f1641S = new C4345t() {
        /* renamed from: a */
        public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
            if (aVar.getRawType() != Timestamp.class) {
                return null;
            }
            Class<Date> cls = Date.class;
            if (gson != null) {
                final C4344s a = gson.mo3080a(C4396a.get(cls));
                return new C4344s<Timestamp>(this) {
                    /* renamed from: a */
                    public Object mo3072a(C4397a aVar) {
                        Date date = (Date) a.mo3072a(aVar);
                        if (date != null) {
                            return new Timestamp(date.getTime());
                        }
                        return null;
                    }

                    /* renamed from: a */
                    public void mo3073a(C4400c cVar, Object obj) {
                        a.mo3073a(cVar, (Timestamp) obj);
                    }
                };
            }
            throw null;
        }
    };

    /* renamed from: T */
    public static final C4344s<Calendar> f1642T;

    /* renamed from: U */
    public static final C4345t f1643U;

    /* renamed from: V */
    public static final C4344s<Locale> f1644V;

    /* renamed from: W */
    public static final C4345t f1645W;

    /* renamed from: X */
    public static final C4344s<C4332i> f1646X;

    /* renamed from: Y */
    public static final C4345t f1647Y;

    /* renamed from: Z */
    public static final C4345t f1648Z = new C4345t() {
        /* renamed from: a */
        public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
            Class<Enum> rawType = aVar.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new EnumTypeAdapter(rawType);
        }
    };

    /* renamed from: a */
    public static final C4344s<Class> f1649a;

    /* renamed from: b */
    public static final C4345t f1650b;

    /* renamed from: c */
    public static final C4344s<BitSet> f1651c;

    /* renamed from: d */
    public static final C4345t f1652d;

    /* renamed from: e */
    public static final C4344s<Boolean> f1653e = new C4344s<Boolean>() {
        /* renamed from: a */
        public Object mo3072a(C4397a aVar) {
            C4399b peek = aVar.peek();
            if (peek == C4399b.NULL) {
                aVar.mo10644y();
                return null;
            }
            return Boolean.valueOf(peek == C4399b.STRING ? Boolean.parseBoolean(aVar.mo10645z()) : aVar.mo10638t());
        }

        /* renamed from: a */
        public void mo3073a(C4400c cVar, Object obj) {
            cVar.mo10648a((Boolean) obj);
        }
    };

    /* renamed from: f */
    public static final C4344s<Boolean> f1654f = new C4344s<Boolean>() {
        /* renamed from: a */
        public Object mo3072a(C4397a aVar) {
            if (aVar.peek() != C4399b.NULL) {
                return Boolean.valueOf(aVar.mo10645z());
            }
            aVar.mo10644y();
            return null;
        }

        /* renamed from: a */
        public void mo3073a(C4400c cVar, Object obj) {
            Boolean bool = (Boolean) obj;
            cVar.mo10655d(bool == null ? Objects.NULL_STRING : bool.toString());
        }
    };

    /* renamed from: g */
    public static final C4345t f1655g;

    /* renamed from: h */
    public static final C4344s<Number> f1656h = new C4344s<Number>() {
        /* renamed from: a */
        public Object mo3072a(C4397a aVar) {
            if (aVar.peek() == C4399b.NULL) {
                aVar.mo10644y();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.mo10641v());
            } catch (NumberFormatException e) {
                throw new C4340q((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo3073a(C4400c cVar, Object obj) {
            cVar.mo10649a((Number) obj);
        }
    };

    /* renamed from: i */
    public static final C4345t f1657i;

    /* renamed from: j */
    public static final C4344s<Number> f1658j = new C4344s<Number>() {
        /* renamed from: a */
        public Object mo3072a(C4397a aVar) {
            if (aVar.peek() == C4399b.NULL) {
                aVar.mo10644y();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.mo10641v());
            } catch (NumberFormatException e) {
                throw new C4340q((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo3073a(C4400c cVar, Object obj) {
            cVar.mo10649a((Number) obj);
        }
    };

    /* renamed from: k */
    public static final C4345t f1659k;

    /* renamed from: l */
    public static final C4344s<Number> f1660l = new C4344s<Number>() {
        /* renamed from: a */
        public Object mo3072a(C4397a aVar) {
            if (aVar.peek() == C4399b.NULL) {
                aVar.mo10644y();
                return null;
            }
            try {
                return Integer.valueOf(aVar.mo10641v());
            } catch (NumberFormatException e) {
                throw new C4340q((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo3073a(C4400c cVar, Object obj) {
            cVar.mo10649a((Number) obj);
        }
    };

    /* renamed from: m */
    public static final C4345t f1661m;

    /* renamed from: n */
    public static final C4344s<AtomicInteger> f1662n;

    /* renamed from: o */
    public static final C4345t f1663o;

    /* renamed from: p */
    public static final C4344s<AtomicBoolean> f1664p;

    /* renamed from: q */
    public static final C4345t f1665q;

    /* renamed from: r */
    public static final C4344s<AtomicIntegerArray> f1666r;

    /* renamed from: s */
    public static final C4345t f1667s;

    /* renamed from: t */
    public static final C4344s<Number> f1668t = new C4344s<Number>() {
        /* renamed from: a */
        public Object mo3072a(C4397a aVar) {
            if (aVar.peek() == C4399b.NULL) {
                aVar.mo10644y();
                return null;
            }
            try {
                return Long.valueOf(aVar.mo10642w());
            } catch (NumberFormatException e) {
                throw new C4340q((Throwable) e);
            }
        }

        /* renamed from: a */
        public void mo3073a(C4400c cVar, Object obj) {
            cVar.mo10649a((Number) obj);
        }
    };

    /* renamed from: u */
    public static final C4344s<Number> f1669u = new C4344s<Number>() {
        /* renamed from: a */
        public Object mo3072a(C4397a aVar) {
            if (aVar.peek() != C4399b.NULL) {
                return Float.valueOf((float) aVar.mo10640u());
            }
            aVar.mo10644y();
            return null;
        }

        /* renamed from: a */
        public void mo3073a(C4400c cVar, Object obj) {
            cVar.mo10649a((Number) obj);
        }
    };

    /* renamed from: v */
    public static final C4344s<Number> f1670v = new C4344s<Number>() {
        /* renamed from: a */
        public Object mo3072a(C4397a aVar) {
            if (aVar.peek() != C4399b.NULL) {
                return Double.valueOf(aVar.mo10640u());
            }
            aVar.mo10644y();
            return null;
        }

        /* renamed from: a */
        public void mo3073a(C4400c cVar, Object obj) {
            cVar.mo10649a((Number) obj);
        }
    };

    /* renamed from: w */
    public static final C4344s<Number> f1671w;

    /* renamed from: x */
    public static final C4345t f1672x;

    /* renamed from: y */
    public static final C4344s<Character> f1673y = new C4344s<Character>() {
        /* renamed from: a */
        public Object mo3072a(C4397a aVar) {
            if (aVar.peek() == C4399b.NULL) {
                aVar.mo10644y();
                return null;
            }
            String z = aVar.mo10645z();
            if (z.length() == 1) {
                return Character.valueOf(z.charAt(0));
            }
            throw new C4340q(C1965a.m4751a("Expecting character, got: ", z));
        }

        /* renamed from: a */
        public void mo3073a(C4400c cVar, Object obj) {
            Character ch = (Character) obj;
            cVar.mo10655d(ch == null ? null : String.valueOf(ch));
        }
    };

    /* renamed from: z */
    public static final C4345t f1674z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$31 */
    public final class C037031 implements C4345t {
        /* renamed from: a */
        public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
            boolean equals = aVar.equals(null);
            return null;
        }
    }

    public static final class EnumTypeAdapter<T extends Enum<T>> extends C4344s<T> {

        /* renamed from: a */
        public final Map<String, T> f1688a = new HashMap();

        /* renamed from: b */
        public final Map<T, String> f1689b = new HashMap();

        public EnumTypeAdapter(Class<T> cls) {
            Enum[] enumArr;
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    C4347b bVar = (C4347b) cls.getField(name).getAnnotation(C4347b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String put : bVar.alternate()) {
                            this.f1688a.put(put, enumR);
                        }
                    }
                    this.f1688a.put(name, enumR);
                    this.f1689b.put(enumR, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: a */
        public Object mo3072a(C4397a aVar) {
            if (aVar.peek() != C4399b.NULL) {
                return (Enum) this.f1688a.get(aVar.mo10645z());
            }
            aVar.mo10644y();
            return null;
        }

        /* renamed from: a */
        public void mo3073a(C4400c cVar, Object obj) {
            Enum enumR = (Enum) obj;
            cVar.mo10655d(enumR == null ? null : (String) this.f1689b.get(enumR));
        }
    }

    static {
        final TypeAdapter$1 typeAdapter$1 = new TypeAdapter$1(new C4344s<Class>() {
            /* renamed from: a */
            public Object mo3072a(C4397a aVar) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            /* renamed from: a */
            public void mo3073a(C4400c cVar, Object obj) {
                Class cls = (Class) obj;
                StringBuilder a = C1965a.m4756a("Attempted to serialize java.lang.Class: ");
                a.append(cls.getName());
                a.append(". Forgot to register a type adapter?");
                throw new UnsupportedOperationException(a.toString());
            }
        });
        f1649a = typeAdapter$1;
        final Class<Class> cls = Class.class;
        f1650b = new C4345t() {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r0);
                a.append("]");
                return a.toString();
            }
        };
        final TypeAdapter$1 typeAdapter$12 = new TypeAdapter$1(new C4344s<BitSet>() {
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
                if (r7.mo10641v() != 0) goto L_0x004c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
                if (java.lang.Integer.parseInt(r1) != 0) goto L_0x004c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
                r1 = false;
             */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x0054 A[SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object mo3072a(p213q.p217b.p355e.p362x.C4397a r7) {
                /*
                    r6 = this;
                    java.util.BitSet r0 = new java.util.BitSet
                    r0.<init>()
                    r7.mo10628a()
                    q.b.e.x.b r1 = r7.peek()
                    r2 = 0
                    r3 = r2
                L_0x000e:
                    q.b.e.x.b r4 = p213q.p217b.p355e.p362x.C4399b.END_ARRAY
                    if (r1 == r4) goto L_0x0067
                    int r4 = r1.ordinal()
                    r5 = 5
                    if (r4 == r5) goto L_0x0042
                    r5 = 6
                    if (r4 == r5) goto L_0x003b
                    r5 = 7
                    if (r4 != r5) goto L_0x0024
                    boolean r1 = r7.mo10638t()
                    goto L_0x004f
                L_0x0024:
                    q.b.e.q r7 = new q.b.e.q
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "Invalid bitset value type: "
                    r0.append(r2)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r7.<init>(r0)
                    throw r7
                L_0x003b:
                    int r1 = r7.mo10641v()
                    if (r1 == 0) goto L_0x004e
                    goto L_0x004c
                L_0x0042:
                    java.lang.String r1 = r7.mo10645z()
                    int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x005b }
                    if (r1 == 0) goto L_0x004e
                L_0x004c:
                    r1 = 1
                    goto L_0x004f
                L_0x004e:
                    r1 = r2
                L_0x004f:
                    if (r1 == 0) goto L_0x0054
                    r0.set(r3)
                L_0x0054:
                    int r3 = r3 + 1
                    q.b.e.x.b r1 = r7.peek()
                    goto L_0x000e
                L_0x005b:
                    q.b.e.q r7 = new q.b.e.q
                    java.lang.String r0 = "Error: Expecting: bitset number value (1, 0), Found: "
                    java.lang.String r0 = p213q.p214a.p215a.p216a.C1965a.m4751a(r0, r1)
                    r7.<init>(r0)
                    throw r7
                L_0x0067:
                    r7.mo10633k()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.C03562.mo3072a(q.b.e.x.a):java.lang.Object");
            }

            /* renamed from: a */
            public void mo3073a(C4400c cVar, Object obj) {
                BitSet bitSet = (BitSet) obj;
                cVar.mo10656f();
                int length = bitSet.length();
                for (int i = 0; i < length; i++) {
                    cVar.mo10654d(bitSet.get(i) ? 1 : 0);
                }
                cVar.mo10659h();
            }
        });
        f1651c = typeAdapter$12;
        final Class<BitSet> cls2 = BitSet.class;
        f1652d = new C4345t() {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r0);
                a.append("]");
                return a.toString();
            }
        };
        final Class cls3 = Boolean.TYPE;
        final Class<Boolean> cls4 = Boolean.class;
        final C4344s<Boolean> sVar = f1653e;
        f1655g = new C4345t() {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                Class rawType = aVar.getRawType();
                if (rawType == r0 || rawType == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append("+");
                a.append(r0.getName());
                a.append(",adapter=");
                a.append(r2);
                a.append("]");
                return a.toString();
            }
        };
        final Class cls5 = Byte.TYPE;
        final Class<Byte> cls6 = Byte.class;
        final C4344s<Number> sVar2 = f1656h;
        f1657i = new C4345t() {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                Class rawType = aVar.getRawType();
                if (rawType == r0 || rawType == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append("+");
                a.append(r0.getName());
                a.append(",adapter=");
                a.append(r2);
                a.append("]");
                return a.toString();
            }
        };
        final Class cls7 = Short.TYPE;
        final Class<Short> cls8 = Short.class;
        final C4344s<Number> sVar3 = f1658j;
        f1659k = new C4345t() {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                Class rawType = aVar.getRawType();
                if (rawType == r0 || rawType == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append("+");
                a.append(r0.getName());
                a.append(",adapter=");
                a.append(r2);
                a.append("]");
                return a.toString();
            }
        };
        final Class cls9 = Integer.TYPE;
        final Class<Integer> cls10 = Integer.class;
        final C4344s<Number> sVar4 = f1660l;
        f1661m = new C4345t() {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                Class rawType = aVar.getRawType();
                if (rawType == r0 || rawType == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append("+");
                a.append(r0.getName());
                a.append(",adapter=");
                a.append(r2);
                a.append("]");
                return a.toString();
            }
        };
        final TypeAdapter$1 typeAdapter$13 = new TypeAdapter$1(new C4344s<AtomicInteger>() {
            /* renamed from: a */
            public Object mo3072a(C4397a aVar) {
                try {
                    return new AtomicInteger(aVar.mo10641v());
                } catch (NumberFormatException e) {
                    throw new C4340q((Throwable) e);
                }
            }

            /* renamed from: a */
            public void mo3073a(C4400c cVar, Object obj) {
                cVar.mo10654d((long) ((AtomicInteger) obj).get());
            }
        });
        f1662n = typeAdapter$13;
        final Class<AtomicInteger> cls11 = AtomicInteger.class;
        f1663o = new C4345t() {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r0);
                a.append("]");
                return a.toString();
            }
        };
        final TypeAdapter$1 typeAdapter$14 = new TypeAdapter$1(new C4344s<AtomicBoolean>() {
            /* renamed from: a */
            public Object mo3072a(C4397a aVar) {
                return new AtomicBoolean(aVar.mo10638t());
            }

            /* renamed from: a */
            public void mo3073a(C4400c cVar, Object obj) {
                cVar.mo10650a(((AtomicBoolean) obj).get());
            }
        });
        f1664p = typeAdapter$14;
        final Class<AtomicBoolean> cls12 = AtomicBoolean.class;
        f1665q = new C4345t() {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r0);
                a.append("]");
                return a.toString();
            }
        };
        final TypeAdapter$1 typeAdapter$15 = new TypeAdapter$1(new C4344s<AtomicIntegerArray>() {
            /* renamed from: a */
            public Object mo3072a(C4397a aVar) {
                ArrayList arrayList = new ArrayList();
                aVar.mo10628a();
                while (aVar.mo10637r()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.mo10641v()));
                    } catch (NumberFormatException e) {
                        throw new C4340q((Throwable) e);
                    }
                }
                aVar.mo10633k();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            }

            /* renamed from: a */
            public void mo3073a(C4400c cVar, Object obj) {
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                cVar.mo10656f();
                int length = atomicIntegerArray.length();
                for (int i = 0; i < length; i++) {
                    cVar.mo10654d((long) atomicIntegerArray.get(i));
                }
                cVar.mo10659h();
            }
        });
        f1666r = typeAdapter$15;
        final Class<AtomicIntegerArray> cls13 = AtomicIntegerArray.class;
        f1667s = new C4345t() {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r0);
                a.append("]");
                return a.toString();
            }
        };
        final C035014 r0 = new C4344s<Number>() {
            /* renamed from: a */
            public Object mo3072a(C4397a aVar) {
                C4399b peek = aVar.peek();
                int ordinal = peek.ordinal();
                if (ordinal == 5 || ordinal == 6) {
                    return new C4374q(aVar.mo10645z());
                }
                if (ordinal == 8) {
                    aVar.mo10644y();
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expecting number, got: ");
                sb.append(peek);
                throw new C4340q(sb.toString());
            }

            /* renamed from: a */
            public void mo3073a(C4400c cVar, Object obj) {
                cVar.mo10649a((Number) obj);
            }
        };
        f1671w = r0;
        final Class<Number> cls14 = Number.class;
        f1672x = new C4345t() {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r0);
                a.append("]");
                return a.toString();
            }
        };
        final Class cls15 = Character.TYPE;
        final Class<Character> cls16 = Character.class;
        final C4344s<Character> sVar5 = f1673y;
        f1674z = new C4345t() {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                Class rawType = aVar.getRawType();
                if (rawType == cls15 || rawType == cls16) {
                    return sVar5;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(cls16.getName());
                a.append("+");
                a.append(cls15.getName());
                a.append(",adapter=");
                a.append(sVar5);
                a.append("]");
                return a.toString();
            }
        };
        final Class<String> cls17 = String.class;
        final C4344s<String> sVar6 = f1623A;
        f1626D = new C4345t() {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r0);
                a.append("]");
                return a.toString();
            }
        };
        final C035519 r02 = new C4344s<StringBuilder>() {
            /* renamed from: a */
            public Object mo3072a(C4397a aVar) {
                if (aVar.peek() != C4399b.NULL) {
                    return new StringBuilder(aVar.mo10645z());
                }
                aVar.mo10644y();
                return null;
            }

            /* renamed from: a */
            public void mo3073a(C4400c cVar, Object obj) {
                StringBuilder sb = (StringBuilder) obj;
                cVar.mo10655d(sb == null ? null : sb.toString());
            }
        };
        f1627E = r02;
        final Class<StringBuilder> cls18 = StringBuilder.class;
        f1628F = new C4345t() {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r0);
                a.append("]");
                return a.toString();
            }
        };
        final C035720 r03 = new C4344s<StringBuffer>() {
            /* renamed from: a */
            public Object mo3072a(C4397a aVar) {
                if (aVar.peek() != C4399b.NULL) {
                    return new StringBuffer(aVar.mo10645z());
                }
                aVar.mo10644y();
                return null;
            }

            /* renamed from: a */
            public void mo3073a(C4400c cVar, Object obj) {
                StringBuffer stringBuffer = (StringBuffer) obj;
                cVar.mo10655d(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        f1629G = r03;
        final Class<StringBuffer> cls19 = StringBuffer.class;
        f1630H = new C4345t() {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r0);
                a.append("]");
                return a.toString();
            }
        };
        final C035821 r04 = new C4344s<URL>() {
            /* renamed from: a */
            public Object mo3072a(C4397a aVar) {
                if (aVar.peek() == C4399b.NULL) {
                    aVar.mo10644y();
                    return null;
                }
                String z = aVar.mo10645z();
                if (Objects.NULL_STRING.equals(z)) {
                    return null;
                }
                return new URL(z);
            }

            /* renamed from: a */
            public void mo3073a(C4400c cVar, Object obj) {
                URL url = (URL) obj;
                cVar.mo10655d(url == null ? null : url.toExternalForm());
            }
        };
        f1631I = r04;
        final Class<URL> cls20 = URL.class;
        f1632J = new C4345t() {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r0);
                a.append("]");
                return a.toString();
            }
        };
        final C035922 r05 = new C4344s<URI>() {
            /* renamed from: a */
            public Object mo3072a(C4397a aVar) {
                if (aVar.peek() == C4399b.NULL) {
                    aVar.mo10644y();
                    return null;
                }
                try {
                    String z = aVar.mo10645z();
                    if (Objects.NULL_STRING.equals(z)) {
                        return null;
                    }
                    return new URI(z);
                } catch (URISyntaxException e) {
                    throw new C4333j((Throwable) e);
                }
            }

            /* renamed from: a */
            public void mo3073a(C4400c cVar, Object obj) {
                URI uri = (URI) obj;
                cVar.mo10655d(uri == null ? null : uri.toASCIIString());
            }
        };
        f1633K = r05;
        final Class<URI> cls21 = URI.class;
        f1634L = new C4345t() {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r0);
                a.append("]");
                return a.toString();
            }
        };
        final C036023 r06 = new C4344s<InetAddress>() {
            /* renamed from: a */
            public Object mo3072a(C4397a aVar) {
                if (aVar.peek() != C4399b.NULL) {
                    return InetAddress.getByName(aVar.mo10645z());
                }
                aVar.mo10644y();
                return null;
            }

            /* renamed from: a */
            public void mo3073a(C4400c cVar, Object obj) {
                InetAddress inetAddress = (InetAddress) obj;
                cVar.mo10655d(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        f1635M = r06;
        final Class<InetAddress> cls22 = InetAddress.class;
        f1636N = new C4345t() {
            /* renamed from: a */
            public <T2> C4344s<T2> mo3085a(Gson gson, C4396a<T2> aVar) {
                final Class rawType = aVar.getRawType();
                if (!r1.isAssignableFrom(rawType)) {
                    return null;
                }
                return new C4344s<T1>() {
                    /* renamed from: a */
                    public T1 mo3072a(C4397a aVar) {
                        T1 a = r0.mo3072a(aVar);
                        if (a == null || rawType.isInstance(a)) {
                            return a;
                        }
                        StringBuilder a2 = C1965a.m4756a("Expected a ");
                        a2.append(rawType.getName());
                        a2.append(" but was ");
                        a2.append(a.getClass().getName());
                        throw new C4340q(a2.toString());
                    }

                    /* renamed from: a */
                    public void mo3073a(C4400c cVar, T1 t1) {
                        r0.mo3073a(cVar, t1);
                    }
                };
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[typeHierarchy=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r0);
                a.append("]");
                return a.toString();
            }
        };
        final C036124 r07 = new C4344s<UUID>() {
            /* renamed from: a */
            public Object mo3072a(C4397a aVar) {
                if (aVar.peek() != C4399b.NULL) {
                    return UUID.fromString(aVar.mo10645z());
                }
                aVar.mo10644y();
                return null;
            }

            /* renamed from: a */
            public void mo3073a(C4400c cVar, Object obj) {
                UUID uuid = (UUID) obj;
                cVar.mo10655d(uuid == null ? null : uuid.toString());
            }
        };
        f1637O = r07;
        final Class<UUID> cls23 = UUID.class;
        f1638P = new C4345t() {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r0);
                a.append("]");
                return a.toString();
            }
        };
        final TypeAdapter$1 typeAdapter$16 = new TypeAdapter$1(new C4344s<Currency>() {
            /* renamed from: a */
            public Object mo3072a(C4397a aVar) {
                return Currency.getInstance(aVar.mo10645z());
            }

            /* renamed from: a */
            public void mo3073a(C4400c cVar, Object obj) {
                cVar.mo10655d(((Currency) obj).getCurrencyCode());
            }
        });
        f1639Q = typeAdapter$16;
        final Class<Currency> cls24 = Currency.class;
        f1640R = new C4345t() {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r0);
                a.append("]");
                return a.toString();
            }
        };
        final C036527 r08 = new C4344s<Calendar>() {
            /* renamed from: a */
            public Object mo3072a(C4397a aVar) {
                if (aVar.peek() == C4399b.NULL) {
                    aVar.mo10644y();
                    return null;
                }
                aVar.mo10632f();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (aVar.peek() != C4399b.END_OBJECT) {
                    String x = aVar.mo10643x();
                    int v = aVar.mo10641v();
                    if ("year".equals(x)) {
                        i = v;
                    } else if ("month".equals(x)) {
                        i2 = v;
                    } else if ("dayOfMonth".equals(x)) {
                        i3 = v;
                    } else if ("hourOfDay".equals(x)) {
                        i4 = v;
                    } else if ("minute".equals(x)) {
                        i5 = v;
                    } else if ("second".equals(x)) {
                        i6 = v;
                    }
                }
                aVar.mo10634m();
                GregorianCalendar gregorianCalendar = new GregorianCalendar(i, i2, i3, i4, i5, i6);
                return gregorianCalendar;
            }

            /* renamed from: a */
            public void mo3073a(C4400c cVar, Object obj) {
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    cVar.mo10661o();
                    return;
                }
                cVar.mo10658g();
                cVar.mo10652b("year");
                cVar.mo10654d((long) calendar.get(1));
                cVar.mo10652b("month");
                cVar.mo10654d((long) calendar.get(2));
                cVar.mo10652b("dayOfMonth");
                cVar.mo10654d((long) calendar.get(5));
                cVar.mo10652b("hourOfDay");
                cVar.mo10654d((long) calendar.get(11));
                cVar.mo10652b("minute");
                cVar.mo10654d((long) calendar.get(12));
                cVar.mo10652b("second");
                cVar.mo10654d((long) calendar.get(13));
                cVar.mo10660k();
            }
        };
        f1642T = r08;
        final Class<Calendar> cls25 = Calendar.class;
        final Class<GregorianCalendar> cls26 = GregorianCalendar.class;
        f1643U = new C4345t() {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                Class rawType = aVar.getRawType();
                if (rawType == cls25 || rawType == cls26) {
                    return r08;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(cls25.getName());
                a.append("+");
                a.append(cls26.getName());
                a.append(",adapter=");
                a.append(r08);
                a.append("]");
                return a.toString();
            }
        };
        final C036628 r09 = new C4344s<Locale>() {
            /* renamed from: a */
            public Object mo3072a(C4397a aVar) {
                Locale locale;
                String str = null;
                if (aVar.peek() == C4399b.NULL) {
                    aVar.mo10644y();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.mo10645z(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                }
                if (nextToken2 == null && str == null) {
                    return new Locale(nextToken);
                }
                if (str == null) {
                    locale = new Locale(nextToken, nextToken2);
                } else {
                    locale = new Locale(nextToken, nextToken2, str);
                }
                return locale;
            }

            /* renamed from: a */
            public void mo3073a(C4400c cVar, Object obj) {
                Locale locale = (Locale) obj;
                cVar.mo10655d(locale == null ? null : locale.toString());
            }
        };
        f1644V = r09;
        final Class<Locale> cls27 = Locale.class;
        f1645W = new C4345t() {
            /* renamed from: a */
            public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
                if (aVar.getRawType() == cls27) {
                    return r09;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[type=");
                a.append(cls27.getName());
                a.append(",adapter=");
                a.append(r09);
                a.append("]");
                return a.toString();
            }
        };
        final C036729 r010 = new C4344s<C4332i>() {
            /* renamed from: a */
            public C4332i m1272a(C4397a aVar) {
                int ordinal = aVar.peek().ordinal();
                if (ordinal == 0) {
                    C4329f fVar = new C4329f();
                    aVar.mo10628a();
                    while (aVar.mo10637r()) {
                        Object a = mo3072a(aVar);
                        if (a == null) {
                            a = C4334k.f10382a;
                        }
                        fVar.f10381e.add(a);
                    }
                    aVar.mo10633k();
                    return fVar;
                } else if (ordinal == 2) {
                    C4335l lVar = new C4335l();
                    aVar.mo10632f();
                    while (aVar.mo10637r()) {
                        String x = aVar.mo10643x();
                        Object a2 = mo3072a(aVar);
                        if (a2 == null) {
                            a2 = C4334k.f10382a;
                        }
                        lVar.f10383a.put(x, a2);
                    }
                    aVar.mo10634m();
                    return lVar;
                } else if (ordinal == 5) {
                    return new C4337n(aVar.mo10645z());
                } else {
                    if (ordinal == 6) {
                        return new C4337n((Number) new C4374q(aVar.mo10645z()));
                    }
                    if (ordinal == 7) {
                        return new C4337n(Boolean.valueOf(aVar.mo10638t()));
                    }
                    if (ordinal == 8) {
                        aVar.mo10644y();
                        return C4334k.f10382a;
                    }
                    throw new IllegalArgumentException();
                }
            }

            /* renamed from: a */
            public void mo3073a(C4400c cVar, C4332i iVar) {
                if (iVar == null || (iVar instanceof C4334k)) {
                    cVar.mo10661o();
                } else if (iVar instanceof C4337n) {
                    C4337n c = iVar.mo10541c();
                    Object obj = c.f10385a;
                    if (obj instanceof Number) {
                        cVar.mo10649a(c.mo10550g());
                    } else if (obj instanceof Boolean) {
                        cVar.mo10650a(c.mo10549f());
                    } else {
                        cVar.mo10655d(c.mo10551h());
                    }
                } else {
                    boolean z = iVar instanceof C4329f;
                    if (z) {
                        cVar.mo10656f();
                        if (z) {
                            Iterator it = ((C4329f) iVar).iterator();
                            while (it.hasNext()) {
                                mo3073a(cVar, (C4332i) it.next());
                            }
                            cVar.mo10659h();
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Not a JSON Array: ");
                        sb.append(iVar);
                        throw new IllegalStateException(sb.toString());
                    }
                    boolean z2 = iVar instanceof C4335l;
                    if (z2) {
                        cVar.mo10658g();
                        if (z2) {
                            for (Entry entry : ((C4335l) iVar).f10383a.entrySet()) {
                                cVar.mo10652b((String) entry.getKey());
                                mo3073a(cVar, (C4332i) entry.getValue());
                            }
                            cVar.mo10660k();
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Not a JSON Object: ");
                        sb2.append(iVar);
                        throw new IllegalStateException(sb2.toString());
                    }
                    StringBuilder a = C1965a.m4756a("Couldn't write ");
                    a.append(iVar.getClass());
                    throw new IllegalArgumentException(a.toString());
                }
            }
        };
        f1646X = r010;
        final Class<C4332i> cls28 = C4332i.class;
        f1647Y = new C4345t() {
            /* renamed from: a */
            public <T2> C4344s<T2> mo3085a(Gson gson, C4396a<T2> aVar) {
                final Class rawType = aVar.getRawType();
                if (!cls28.isAssignableFrom(rawType)) {
                    return null;
                }
                return new C4344s<T1>() {
                    /* renamed from: a */
                    public T1 mo3072a(C4397a aVar) {
                        T1 a = r010.mo3072a(aVar);
                        if (a == null || rawType.isInstance(a)) {
                            return a;
                        }
                        StringBuilder a2 = C1965a.m4756a("Expected a ");
                        a2.append(rawType.getName());
                        a2.append(" but was ");
                        a2.append(a.getClass().getName());
                        throw new C4340q(a2.toString());
                    }

                    /* renamed from: a */
                    public void mo3073a(C4400c cVar, T1 t1) {
                        r010.mo3073a(cVar, t1);
                    }
                };
            }

            public String toString() {
                StringBuilder a = C1965a.m4756a("Factory[typeHierarchy=");
                a.append(cls28.getName());
                a.append(",adapter=");
                a.append(r010);
                a.append("]");
                return a.toString();
            }
        };
    }
}
