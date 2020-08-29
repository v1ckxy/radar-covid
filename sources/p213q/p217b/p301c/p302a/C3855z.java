package p213q.p217b.p301c.p302a;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyTemplate;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0;

/* renamed from: q.b.c.a.z */
public final class C3855z {

    /* renamed from: a */
    public static final Logger f9449a = Logger.getLogger(C3855z.class.getName());

    /* renamed from: b */
    public static final ConcurrentMap<String, C3856a> f9450b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final ConcurrentMap<String, Object> f9451c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final ConcurrentMap<String, Boolean> f9452d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final ConcurrentMap<Class<?>, C3846q<?>> f9453e = new ConcurrentHashMap();

    /* renamed from: q.b.c.a.z$a */
    public interface C3856a {
        /* renamed from: a */
        C3542f<?> mo10050a();

        /* renamed from: a */
        <P> C3542f<P> mo10051a(Class<P> cls);

        /* renamed from: b */
        Class<?> mo10052b();

        /* renamed from: c */
        Class<?> mo10053c();

        /* renamed from: d */
        Set<Class<?>> mo10054d();
    }

    static {
        new ConcurrentHashMap();
    }

    /* renamed from: a */
    public static <P> P m9216a(String str, byte[] bArr, Class<P> cls) {
        C3635j a = C3635j.m8388a(bArr);
        if (cls != null) {
            return m9215a(str, a, cls);
        }
        throw null;
    }

    /* renamed from: a */
    public static synchronized C3856a m9219a(String str) {
        C3856a aVar;
        synchronized (C3855z.class) {
            if (f9450b.containsKey(str)) {
                aVar = (C3856a) f9450b.get(str);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("No key manager found for key type ");
                sb.append(str);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m9220a(java.lang.String r5, java.lang.Class<?> r6, boolean r7) {
        /*
            java.lang.Class<q.b.c.a.z> r0 = p213q.p217b.p301c.p302a.C3855z.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, q.b.c.a.z$a> r1 = f9450b     // Catch:{ all -> 0x0083 }
            boolean r1 = r1.containsKey(r5)     // Catch:{ all -> 0x0083 }
            if (r1 != 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            java.util.concurrent.ConcurrentMap<java.lang.String, q.b.c.a.z$a> r1 = f9450b     // Catch:{ all -> 0x0083 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0083 }
            q.b.c.a.z$a r1 = (p213q.p217b.p301c.p302a.C3855z.C3856a) r1     // Catch:{ all -> 0x0083 }
            java.lang.Class r2 = r1.mo10053c()     // Catch:{ all -> 0x0083 }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x0049
            if (r7 == 0) goto L_0x0047
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r6 = f9452d     // Catch:{ all -> 0x0083 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x0083 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0083 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0083 }
            if (r6 == 0) goto L_0x0030
            goto L_0x0047
        L_0x0030:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0083 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r7.<init>()     // Catch:{ all -> 0x0083 }
            java.lang.String r1 = "New keys are already disallowed for key type "
            r7.append(r1)     // Catch:{ all -> 0x0083 }
            r7.append(r5)     // Catch:{ all -> 0x0083 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0083 }
            r6.<init>(r5)     // Catch:{ all -> 0x0083 }
            throw r6     // Catch:{ all -> 0x0083 }
        L_0x0047:
            monitor-exit(r0)
            return
        L_0x0049:
            java.util.logging.Logger r7 = f9449a     // Catch:{ all -> 0x0083 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r2.<init>()     // Catch:{ all -> 0x0083 }
            java.lang.String r3 = "Attempted overwrite of a registered key manager for key type "
            r2.append(r3)     // Catch:{ all -> 0x0083 }
            r2.append(r5)     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0083 }
            r7.warning(r2)     // Catch:{ all -> 0x0083 }
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0083 }
            r4 = 0
            r3[r4] = r5     // Catch:{ all -> 0x0083 }
            r5 = 1
            java.lang.Class r1 = r1.mo10053c()     // Catch:{ all -> 0x0083 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0083 }
            r3[r5] = r1     // Catch:{ all -> 0x0083 }
            r5 = 2
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x0083 }
            r3[r5] = r6     // Catch:{ all -> 0x0083 }
            java.lang.String r5 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0083 }
            r7.<init>(r5)     // Catch:{ all -> 0x0083 }
            throw r7     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.C3855z.m9220a(java.lang.String, java.lang.Class, boolean):void");
    }

    /* renamed from: a */
    public static synchronized <P> void m9222a(C3846q<P> qVar) {
        synchronized (C3855z.class) {
            if (qVar != null) {
                Class a = qVar.mo9457a();
                if (f9453e.containsKey(a)) {
                    C3846q qVar2 = (C3846q) f9453e.get(a);
                    if (!qVar.getClass().equals(qVar2.getClass())) {
                        Logger logger = f9449a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Attempted overwrite of a registered SetWrapper for type ");
                        sb.append(a.toString());
                        logger.warning(sb.toString());
                        throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{a.getName(), qVar2.getClass().getName(), qVar.getClass().getName()}));
                    }
                }
                f9453e.put(a, qVar);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    /* renamed from: b */
    public static synchronized KeyData m9224b(KeyTemplate keyTemplate) {
        KeyData c;
        synchronized (C3855z.class) {
            C3542f a = m9219a(keyTemplate.getTypeUrl()).mo10050a();
            if (((Boolean) f9452d.get(keyTemplate.getTypeUrl())).booleanValue()) {
                c = ((C3554g) a).mo9471c(keyTemplate.getValue());
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("newKey-operation not permitted for key type ");
                sb.append(keyTemplate.getTypeUrl());
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return c;
    }

    /* renamed from: a */
    public static <P> P m9215a(String str, C3635j jVar, Class<P> cls) {
        C3542f fVar;
        C3856a a = m9219a(str);
        if (cls == null) {
            fVar = a.mo10050a();
        } else if (a.mo10054d().contains(cls)) {
            fVar = a.mo10051a(cls);
        } else {
            StringBuilder a2 = C1965a.m4756a("Primitive type ");
            a2.append(cls.getName());
            a2.append(" not supported by key manager of type ");
            a2.append(a.mo10053c());
            a2.append(", supported primitives: ");
            Set<Class> d = a.mo10054d();
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (Class cls2 : d) {
                if (!z) {
                    sb.append(Objects.ARRAY_ELEMENT_SEPARATOR);
                }
                sb.append(cls2.getCanonicalName());
                z = false;
            }
            a2.append(sb.toString());
            throw new GeneralSecurityException(a2.toString());
        }
        return ((C3554g) fVar).mo9469a(jVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0016 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <P> p213q.p217b.p301c.p302a.C3844p<P> m9218a(p213q.p217b.p301c.p302a.C3587j r11, java.lang.Class<P> r12) {
        /*
            if (r12 == 0) goto L_0x010a
            com.google.crypto.tink.proto.Keyset r0 = r11.f8967a
            p213q.p217b.p301c.p302a.C3502b0.m7963b(r0)
            q.b.c.a.p r0 = new q.b.c.a.p
            r0.<init>(r12)
            com.google.crypto.tink.proto.Keyset r1 = r11.f8967a
            java.util.List r1 = r1.getKeyList()
            java.util.Iterator r1 = r1.iterator()
        L_0x0016:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0109
            java.lang.Object r2 = r1.next()
            com.google.crypto.tink.proto.Keyset$Key r2 = (com.google.crypto.tink.proto.Keyset.Key) r2
            com.google.crypto.tink.proto.KeyStatusType r3 = r2.getStatus()
            com.google.crypto.tink.proto.KeyStatusType r4 = com.google.crypto.tink.proto.KeyStatusType.ENABLED
            if (r3 != r4) goto L_0x0016
            com.google.crypto.tink.proto.KeyData r3 = r2.getKeyData()
            java.lang.String r3 = r3.getTypeUrl()
            com.google.crypto.tink.proto.KeyData r4 = r2.getKeyData()
            q.b.c.a.j0.a.j r4 = r4.getValue()
            java.lang.Object r6 = m9215a(r3, r4, r12)
            com.google.crypto.tink.proto.KeyStatusType r3 = r2.getStatus()
            com.google.crypto.tink.proto.KeyStatusType r4 = com.google.crypto.tink.proto.KeyStatusType.ENABLED
            if (r3 != r4) goto L_0x0101
            q.b.c.a.p$a r3 = new q.b.c.a.p$a
            com.google.crypto.tink.proto.OutputPrefixType r4 = r2.getOutputPrefixType()
            int r4 = r4.ordinal()
            r5 = 5
            r7 = 1
            if (r4 == r7) goto L_0x0073
            r7 = 2
            if (r4 == r7) goto L_0x0069
            r7 = 3
            if (r4 == r7) goto L_0x0066
            r7 = 4
            if (r4 != r7) goto L_0x005e
            goto L_0x0069
        L_0x005e:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r12 = "unknown output prefix type"
            r11.<init>(r12)
            throw r11
        L_0x0066:
            byte[] r4 = p213q.p217b.p301c.p302a.C3501b.f8900a
            goto L_0x0087
        L_0x0069:
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r5)
            r5 = 0
            java.nio.ByteBuffer r4 = r4.put(r5)
            goto L_0x007b
        L_0x0073:
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r5)
            java.nio.ByteBuffer r4 = r4.put(r7)
        L_0x007b:
            int r5 = r2.getKeyId()
            java.nio.ByteBuffer r4 = r4.putInt(r5)
            byte[] r4 = r4.array()
        L_0x0087:
            r7 = r4
            com.google.crypto.tink.proto.KeyStatusType r8 = r2.getStatus()
            com.google.crypto.tink.proto.OutputPrefixType r9 = r2.getOutputPrefixType()
            int r10 = r2.getKeyId()
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r3)
            java.lang.String r5 = new java.lang.String
            byte[] r6 = r3.mo10049a()
            java.nio.charset.Charset r7 = p213q.p217b.p301c.p302a.C3844p.f9437d
            r5.<init>(r6, r7)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<q.b.c.a.p$a<P>>> r6 = r0.f9438a
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)
            java.lang.Object r4 = r6.put(r5, r4)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x00cd
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.addAll(r4)
            r6.add(r3)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<q.b.c.a.p$a<P>>> r4 = r0.f9438a
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)
            r4.put(r5, r6)
        L_0x00cd:
            int r2 = r2.getKeyId()
            com.google.crypto.tink.proto.Keyset r4 = r11.f8967a
            int r4 = r4.getPrimaryKeyId()
            if (r2 != r4) goto L_0x0016
            com.google.crypto.tink.proto.KeyStatusType r2 = r3.f9443c
            com.google.crypto.tink.proto.KeyStatusType r4 = com.google.crypto.tink.proto.KeyStatusType.ENABLED
            if (r2 != r4) goto L_0x00f9
            byte[] r2 = r3.mo10049a()
            java.util.List r2 = r0.mo10048a(r2)
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00f1
            r0.f9439b = r3
            goto L_0x0016
        L_0x00f1:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "the primary entry cannot be set to an entry which is not held by this primitive set"
            r11.<init>(r12)
            throw r11
        L_0x00f9:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "the primary entry has to be ENABLED"
            r11.<init>(r12)
            throw r11
        L_0x0101:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r12 = "only ENABLED key is allowed"
            r11.<init>(r12)
            throw r11
        L_0x0109:
            return r0
        L_0x010a:
            r11 = 0
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p301c.p302a.C3855z.m9218a(q.b.c.a.j, java.lang.Class):q.b.c.a.p");
    }

    /* renamed from: a */
    public static synchronized C3706s0 m9217a(KeyTemplate keyTemplate) {
        C3706s0 b;
        synchronized (C3855z.class) {
            C3542f a = m9219a(keyTemplate.getTypeUrl()).mo10050a();
            if (((Boolean) f9452d.get(keyTemplate.getTypeUrl())).booleanValue()) {
                b = ((C3554g) a).mo9470b(keyTemplate.getValue());
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("newKey-operation not permitted for key type ");
                sb.append(keyTemplate.getTypeUrl());
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return b;
    }

    /* renamed from: a */
    public static synchronized <KeyProtoT extends C3706s0, PublicKeyProtoT extends C3706s0> void m9223a(C3849t<KeyProtoT, PublicKeyProtoT> tVar, C3574i<PublicKeyProtoT> iVar, boolean z) {
        synchronized (C3855z.class) {
            if (tVar == null || iVar == null) {
                throw new IllegalArgumentException("given key managers must be non-null.");
            }
            String a = tVar.mo9459a();
            String a2 = iVar.mo9459a();
            m9220a(a, tVar.getClass(), z);
            m9220a(a2, iVar.getClass(), false);
            if (!a.equals(a2)) {
                if (f9450b.containsKey(a)) {
                    Class b = ((C3856a) f9450b.get(a)).mo10052b();
                    if (b != null) {
                        if (!b.equals(iVar.getClass())) {
                            Logger logger = f9449a;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Attempted overwrite of a registered key manager for key type ");
                            sb.append(a);
                            sb.append(" with inconsistent public key type ");
                            sb.append(a2);
                            logger.warning(sb.toString());
                            throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{tVar.getClass().getName(), b.getName(), iVar.getClass().getName()}));
                        }
                    }
                }
                if (!f9450b.containsKey(a) || ((C3856a) f9450b.get(a)).mo10052b() == null) {
                    f9450b.put(a, new C3853x(tVar, iVar));
                    f9451c.put(a, new C3854y(tVar));
                }
                f9452d.put(a, Boolean.valueOf(z));
                if (!f9450b.containsKey(a2)) {
                    f9450b.put(a2, new C3852w(iVar));
                }
                f9452d.put(a2, Boolean.valueOf(false));
            } else {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
        }
    }

    /* renamed from: a */
    public static synchronized <KeyProtoT extends C3706s0> void m9221a(C3574i<KeyProtoT> iVar, boolean z) {
        synchronized (C3855z.class) {
            if (iVar != null) {
                String a = iVar.mo9459a();
                m9220a(a, iVar.getClass(), z);
                if (!f9450b.containsKey(a)) {
                    f9450b.put(a, new C3852w(iVar));
                    f9451c.put(a, new C3854y(iVar));
                }
                f9452d.put(a, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }
}
