package com.google.gson.internal.bind;

import com.google.gson.internal.Excluder;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p213q.p217b.p355e.C4318a;
import p213q.p217b.p355e.C4319b;
import p213q.p217b.p355e.C4327d;
import p213q.p217b.p355e.C4340q;
import p213q.p217b.p355e.C4344s;
import p213q.p217b.p355e.C4345t;
import p213q.p217b.p355e.p356u.C4348c;
import p213q.p217b.p355e.p356u.C4349d;
import p213q.p217b.p355e.p357v.C4362g;
import p213q.p217b.p355e.p357v.C4383s;
import p213q.p217b.p355e.p357v.p358a0.C4355b;
import p213q.p217b.p355e.p357v.p359z.C4394c;
import p213q.p217b.p355e.p362x.C4397a;
import p213q.p217b.p355e.p362x.C4399b;
import p213q.p217b.p355e.p362x.C4400c;

public final class ReflectiveTypeAdapterFactory implements C4345t {

    /* renamed from: e */
    public final C4362g f1599e;

    /* renamed from: f */
    public final C4327d f1600f;

    /* renamed from: g */
    public final Excluder f1601g;

    /* renamed from: h */
    public final JsonAdapterAnnotationTypeAdapterFactory f1602h;

    /* renamed from: i */
    public final C4355b f1603i = C4355b.f10396a;

    public static final class Adapter<T> extends C4344s<T> {

        /* renamed from: a */
        public final C4383s<T> f1604a;

        /* renamed from: b */
        public final Map<String, C0340a> f1605b;

        public Adapter(C4383s<T> sVar, Map<String, C0340a> map) {
            this.f1604a = sVar;
            this.f1605b = map;
        }

        /* renamed from: a */
        public T mo3072a(C4397a aVar) {
            if (aVar.peek() == C4399b.NULL) {
                aVar.mo10644y();
                return null;
            }
            T a = this.f1604a.mo10576a();
            try {
                aVar.mo10632f();
                while (aVar.mo10637r()) {
                    C0340a aVar2 = (C0340a) this.f1605b.get(aVar.mo10643x());
                    if (aVar2 != null) {
                        if (aVar2.f1608c) {
                            C4394c cVar = (C4394c) aVar2;
                            Object a2 = cVar.f10454f.mo3072a(aVar);
                            if (a2 != null || !cVar.f10457i) {
                                cVar.f10452d.set(a, a2);
                            }
                        }
                    }
                    aVar.mo10625D();
                }
                aVar.mo10634m();
                return a;
            } catch (IllegalStateException e) {
                throw new C4340q((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: a */
        public void mo3073a(C4400c cVar, T t) {
            if (t == null) {
                cVar.mo10661o();
                return;
            }
            cVar.mo10658g();
            try {
                for (C0340a aVar : this.f1605b.values()) {
                    C4394c cVar2 = (C4394c) aVar;
                    boolean z = false;
                    if (cVar2.f1607b) {
                        if (cVar2.f10452d.get(t) != t) {
                            z = true;
                        }
                    }
                    if (z) {
                        cVar.mo10652b(aVar.f1606a);
                        C4394c cVar3 = (C4394c) aVar;
                        (cVar3.f10453e ? cVar3.f10454f : new TypeAdapterRuntimeTypeWrapper(cVar3.f10455g, cVar3.f10454f, cVar3.f10456h.getType())).mo3073a(cVar, cVar3.f10452d.get(t));
                    }
                }
                cVar.mo10660k();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a */
    public static abstract class C0340a {

        /* renamed from: a */
        public final String f1606a;

        /* renamed from: b */
        public final boolean f1607b;

        /* renamed from: c */
        public final boolean f1608c;

        public C0340a(String str, boolean z, boolean z2) {
            this.f1606a = str;
            this.f1607b = z;
            this.f1608c = z2;
        }
    }

    public ReflectiveTypeAdapterFactory(C4362g gVar, C4327d dVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f1599e = gVar;
        this.f1600f = dVar;
        this.f1601g = excluder;
        this.f1602h = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /* JADX WARNING: type inference failed for: r4v8, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r30v0 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r0v13, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v18, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v12
      assigns: []
      uses: []
      mth insns count: 207
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x019b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0182 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> p213q.p217b.p355e.C4344s<T> mo3085a(com.google.gson.Gson r37, p213q.p217b.p355e.p361w.C4396a<T> r38) {
        /*
            r36 = this;
            r11 = r36
            r12 = r37
            java.lang.Class<java.lang.Object> r13 = java.lang.Object.class
            java.lang.Class r0 = r38.getRawType()
            boolean r1 = r13.isAssignableFrom(r0)
            r14 = 0
            if (r1 != 0) goto L_0x0012
            return r14
        L_0x0012:
            q.b.e.v.g r1 = r11.f1599e
            r2 = r38
            q.b.e.v.s r15 = r1.mo10577a(r2)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter r10 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            boolean r1 = r0.isInterface()
            if (r1 == 0) goto L_0x002e
        L_0x0027:
            r14 = r9
            r34 = r10
            r22 = r15
            goto L_0x01de
        L_0x002e:
            java.lang.reflect.Type r8 = r38.getType()
            r7 = r0
            r16 = r2
        L_0x0035:
            if (r7 == r13) goto L_0x0027
            java.lang.reflect.Field[] r6 = r7.getDeclaredFields()
            int r5 = r6.length
            r4 = 0
            r3 = r4
        L_0x003e:
            if (r3 >= r5) goto L_0x01b7
            r2 = r6[r3]
            r1 = 1
            boolean r0 = r11.mo3095a(r2, r1)
            boolean r17 = r11.mo3095a(r2, r4)
            if (r0 != 0) goto L_0x0063
            if (r17 != 0) goto L_0x0063
            r20 = r3
            r31 = r4
            r32 = r5
            r33 = r6
            r38 = r7
            r12 = r8
            r14 = r9
            r34 = r10
            r19 = r13
            r22 = r15
            goto L_0x0182
        L_0x0063:
            q.b.e.v.a0.b r4 = r11.f1603i
            r4.mo10575a(r2)
            java.lang.reflect.Type r4 = r16.getType()
            java.lang.reflect.Type r14 = r2.getGenericType()
            java.lang.reflect.Type r14 = p213q.p217b.p355e.p357v.C4350a.m9862a(r4, r7, r14)
            java.lang.Class<q.b.e.u.b> r4 = p213q.p217b.p355e.p356u.C4347b.class
            java.lang.annotation.Annotation r4 = r2.getAnnotation(r4)
            q.b.e.u.b r4 = (p213q.p217b.p355e.p356u.C4347b) r4
            if (r4 != 0) goto L_0x008b
            q.b.e.d r4 = r11.f1600f
            java.lang.String r4 = r4.mo10535a(r2)
            java.util.List r4 = java.util.Collections.singletonList(r4)
            r19 = r0
            goto L_0x009c
        L_0x008b:
            java.lang.String r1 = r4.value()
            java.lang.String[] r4 = r4.alternate()
            r19 = r0
            int r0 = r4.length
            if (r0 != 0) goto L_0x00a1
            java.util.List r4 = java.util.Collections.singletonList(r1)
        L_0x009c:
            r20 = r3
            r18 = 1
            goto L_0x00c1
        L_0x00a1:
            java.util.ArrayList r0 = new java.util.ArrayList
            r20 = r3
            int r3 = r4.length
            r18 = 1
            int r3 = r3 + 1
            r0.<init>(r3)
            r0.add(r1)
            int r1 = r4.length
            r3 = 0
        L_0x00b2:
            if (r3 >= r1) goto L_0x00c0
            r21 = r1
            r1 = r4[r3]
            r0.add(r1)
            int r3 = r3 + 1
            r1 = r21
            goto L_0x00b2
        L_0x00c0:
            r4 = r0
        L_0x00c1:
            int r3 = r4.size()
            r0 = r19
            r1 = 0
            r19 = r13
            r13 = 0
        L_0x00cb:
            if (r1 >= r3) goto L_0x0172
            java.lang.Object r21 = r4.get(r1)
            r22 = r15
            r15 = r21
            java.lang.String r15 = (java.lang.String) r15
            if (r1 == 0) goto L_0x00dc
            r21 = 0
            goto L_0x00de
        L_0x00dc:
            r21 = r0
        L_0x00de:
            q.b.e.w.a r0 = p213q.p217b.p355e.p361w.C4396a.get(r14)
            r23 = r1
            java.lang.Class r1 = r0.getRawType()
            r24 = r3
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r3 = p213q.p217b.p355e.p357v.C4384t.f10436a
            boolean r25 = r3.containsKey(r1)
            java.lang.Class<q.b.e.u.a> r1 = p213q.p217b.p355e.p356u.C4346a.class
            java.lang.annotation.Annotation r1 = r2.getAnnotation(r1)
            q.b.e.u.a r1 = (p213q.p217b.p355e.p356u.C4346a) r1
            if (r1 == 0) goto L_0x0105
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r3 = r11.f1602h
            r26 = r2
            q.b.e.v.g r2 = r11.f1599e
            q.b.e.s r1 = r3.mo3094a(r2, r12, r0, r1)
            goto L_0x0108
        L_0x0105:
            r26 = r2
            r1 = 0
        L_0x0108:
            if (r1 == 0) goto L_0x010d
            r27 = r18
            goto L_0x010f
        L_0x010d:
            r27 = 0
        L_0x010f:
            if (r1 != 0) goto L_0x0115
            q.b.e.s r1 = r12.mo3080a(r0)
        L_0x0115:
            r28 = r1
            q.b.e.v.z.c r3 = new q.b.e.v.z.c
            r29 = r0
            r0 = r3
            r35 = r23
            r23 = r18
            r18 = r35
            r1 = r36
            r2 = r15
            r11 = r3
            r3 = r21
            r30 = r4
            r31 = 0
            r4 = r17
            r32 = r5
            r5 = r26
            r33 = r6
            r6 = r27
            r38 = r7
            r7 = r28
            r12 = r8
            r8 = r37
            r27 = r14
            r14 = r9
            r9 = r29
            r34 = r10
            r10 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r14.put(r15, r11)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a r0 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.C0340a) r0
            if (r13 != 0) goto L_0x0152
            r13 = r0
        L_0x0152:
            int r1 = r18 + 1
            r11 = r36
            r7 = r38
            r8 = r12
            r9 = r14
            r0 = r21
            r15 = r22
            r18 = r23
            r3 = r24
            r2 = r26
            r14 = r27
            r4 = r30
            r5 = r32
            r6 = r33
            r10 = r34
            r12 = r37
            goto L_0x00cb
        L_0x0172:
            r32 = r5
            r33 = r6
            r38 = r7
            r12 = r8
            r14 = r9
            r34 = r10
            r22 = r15
            r31 = 0
            if (r13 != 0) goto L_0x019b
        L_0x0182:
            int r3 = r20 + 1
            r11 = r36
            r7 = r38
            r8 = r12
            r9 = r14
            r13 = r19
            r15 = r22
            r4 = r31
            r5 = r32
            r6 = r33
            r10 = r34
            r14 = 0
            r12 = r37
            goto L_0x003e
        L_0x019b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r2 = " declares multiple JSON fields named "
            r1.append(r2)
            java.lang.String r2 = r13.f1606a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01b7:
            r38 = r7
            r12 = r8
            r14 = r9
            r34 = r10
            r19 = r13
            r22 = r15
            java.lang.reflect.Type r0 = r16.getType()
            java.lang.reflect.Type r1 = r38.getGenericSuperclass()
            r2 = r38
            java.lang.reflect.Type r0 = p213q.p217b.p355e.p357v.C4350a.m9862a(r0, r2, r1)
            q.b.e.w.a r16 = p213q.p217b.p355e.p361w.C4396a.get(r0)
            java.lang.Class r7 = r16.getRawType()
            r11 = r36
            r14 = 0
            r12 = r37
            goto L_0x0035
        L_0x01de:
            r0 = r22
            r1 = r34
            r1.<init>(r0, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.mo3085a(com.google.gson.Gson, q.b.e.w.a):q.b.e.s");
    }

    /* renamed from: a */
    public boolean mo3095a(Field field, boolean z) {
        boolean z2;
        Excluder excluder = this.f1601g;
        Class type = field.getType();
        if (excluder.mo3086a(type) || excluder.mo3087a(type, z)) {
            return false;
        }
        if ((excluder.f1572f & field.getModifiers()) == 0 && ((excluder.f1571e == -1.0d || excluder.mo3088a((C4348c) field.getAnnotation(C4348c.class), (C4349d) field.getAnnotation(C4349d.class))) && !field.isSynthetic() && ((excluder.f1573g || !excluder.mo3090c(field.getType())) && !excluder.mo3089b(field.getType())))) {
            List<C4318a> list = z ? excluder.f1574h : excluder.f1575i;
            if (!list.isEmpty()) {
                C4319b bVar = new C4319b(field);
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C4318a) it.next()).mo10534a(bVar)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return true;
        }
        return false;
    }
}
