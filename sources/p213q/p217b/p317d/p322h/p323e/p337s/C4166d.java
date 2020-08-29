package p213q.p217b.p317d.p322h.p323e.p337s;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p270l.C3253h;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p213q.p217b.p218a.p231b.p270l.C3257j;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p322h.p323e.p326k.C3944g;
import p213q.p217b.p317d.p322h.p323e.p326k.C3959l0;
import p213q.p217b.p317d.p322h.p323e.p326k.C3999x0;
import p213q.p217b.p317d.p322h.p323e.p326k.C4003z0;
import p213q.p217b.p317d.p322h.p323e.p330n.C4128b;
import p213q.p217b.p317d.p322h.p323e.p330n.C4130d;
import p213q.p217b.p317d.p322h.p323e.p331o.C4138h;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4173b;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4174c;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4175d;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4176e;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4177f;
import p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4178g;
import p213q.p217b.p317d.p322h.p323e.p337s.p339j.C4181c;
import p213q.p217b.p317d.p322h.p323e.p337s.p339j.C4182d;

/* renamed from: q.b.d.h.e.s.d */
public class C4166d implements C4168e {

    /* renamed from: a */
    public final Context f10071a;

    /* renamed from: b */
    public final C4178g f10072b;

    /* renamed from: c */
    public final C4169f f10073c;

    /* renamed from: d */
    public final C3999x0 f10074d;

    /* renamed from: e */
    public final C4163a f10075e;

    /* renamed from: f */
    public final C4182d f10076f;

    /* renamed from: g */
    public final C3959l0 f10077g;

    /* renamed from: h */
    public final AtomicReference<C4176e> f10078h = new AtomicReference<>();

    /* renamed from: i */
    public final AtomicReference<C3257j<C4173b>> f10079i = new AtomicReference<>(new C3257j());

    /* renamed from: q.b.d.h.e.s.d$a */
    public class C4167a implements C3253h<Void, Void> {
        public C4167a() {
        }

        /* renamed from: a */
        public C3255i mo8939a(Object obj) {
            JSONObject jSONObject;
            FileWriter fileWriter;
            Void voidR = (Void) obj;
            C4166d dVar = C4166d.this;
            C4182d dVar2 = dVar.f10076f;
            C4178g gVar = dVar.f10072b;
            C4181c cVar = (C4181c) dVar2;
            FileWriter fileWriter2 = null;
            if (cVar != null) {
                try {
                    Map a = cVar.mo10379a(gVar);
                    C4128b a2 = cVar.mo10120a(a);
                    cVar.mo10381a(a2, gVar);
                    C3913b bVar = cVar.f10117f;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Requesting settings from ");
                    sb.append(cVar.f9582a);
                    bVar.mo10108a(sb.toString());
                    C3913b bVar2 = cVar.f10117f;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Settings query params were: ");
                    sb2.append(a);
                    bVar2.mo10108a(sb2.toString());
                    C4130d a3 = a2.mo10328a();
                    C3913b bVar3 = cVar.f10117f;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Settings request ID: ");
                    sb3.append(a3.f10000c.mo11366a("X-REQUEST-ID"));
                    bVar3.mo10108a(sb3.toString());
                    jSONObject = cVar.mo10380a(a3);
                } catch (IOException e) {
                    C3913b bVar4 = cVar.f10117f;
                    if (bVar4.mo10110a(6)) {
                        Log.e(bVar4.f9553a, "Settings request failed.", e);
                    }
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    C4177f a4 = C4166d.this.f10073c.mo10375a(jSONObject);
                    C4163a aVar = C4166d.this.f10075e;
                    long j = a4.f10106d;
                    if (aVar != null) {
                        String str = "Failed to close settings writer.";
                        C3913b.f9552c.mo10108a("Writing settings to cache file...");
                        try {
                            jSONObject.put("expires_at", j);
                            fileWriter = new FileWriter(new File(new C4138h(aVar.f10066a).mo10339a(), "com.crashlytics.settings.json"));
                            try {
                                fileWriter.write(jSONObject.toString());
                                fileWriter.flush();
                            } catch (Exception e2) {
                                e = e2;
                            } catch (Throwable th) {
                                th = th;
                                C3944g.m9360a((Closeable) fileWriter, str);
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            fileWriter = null;
                            try {
                                C3913b bVar5 = C3913b.f9552c;
                                String str2 = "Failed to cache settings";
                                if (bVar5.mo10110a(6)) {
                                    Log.e(bVar5.f9553a, str2, e);
                                }
                                C3944g.m9360a((Closeable) fileWriter, str);
                                C4166d.this.mo10373a(jSONObject, "Loaded settings: ");
                                C4166d dVar3 = C4166d.this;
                                String str3 = dVar3.f10072b.f10112f;
                                Editor edit = C3944g.m9370e(dVar3.f10071a).edit();
                                edit.putString("existing_instance_identifier", str3);
                                edit.apply();
                                C4166d.this.f10078h.set(a4);
                                ((C3257j) C4166d.this.f10079i.get()).mo8941a(a4.f10103a);
                                C3257j jVar = new C3257j();
                                jVar.mo8941a(a4.f10103a);
                                C4166d.this.f10079i.set(jVar);
                                return C2286e.m5291b(null);
                            } catch (Throwable th2) {
                                th = th2;
                                fileWriter2 = fileWriter;
                                fileWriter = fileWriter2;
                                C3944g.m9360a((Closeable) fileWriter, str);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileWriter = fileWriter2;
                            C3944g.m9360a((Closeable) fileWriter, str);
                            throw th;
                        }
                        C3944g.m9360a((Closeable) fileWriter, str);
                        C4166d.this.mo10373a(jSONObject, "Loaded settings: ");
                        C4166d dVar32 = C4166d.this;
                        String str32 = dVar32.f10072b.f10112f;
                        Editor edit2 = C3944g.m9370e(dVar32.f10071a).edit();
                        edit2.putString("existing_instance_identifier", str32);
                        edit2.apply();
                        C4166d.this.f10078h.set(a4);
                        ((C3257j) C4166d.this.f10079i.get()).mo8941a(a4.f10103a);
                        C3257j jVar2 = new C3257j();
                        jVar2.mo8941a(a4.f10103a);
                        C4166d.this.f10079i.set(jVar2);
                    } else {
                        throw null;
                    }
                }
                return C2286e.m5291b(null);
            }
            throw null;
        }
    }

    public C4166d(Context context, C4178g gVar, C3999x0 x0Var, C4169f fVar, C4163a aVar, C4182d dVar, C3959l0 l0Var) {
        this.f10071a = context;
        this.f10072b = gVar;
        this.f10074d = x0Var;
        this.f10073c = fVar;
        this.f10075e = aVar;
        this.f10076f = dVar;
        this.f10077g = l0Var;
        AtomicReference<C4176e> atomicReference = this.f10078h;
        JSONObject jSONObject = new JSONObject();
        C4177f fVar2 = new C4177f(C4164b.m9635a(x0Var, 3600, jSONObject), null, new C4175d(jSONObject.optInt("max_custom_exception_events", 8), 4), new C4174c(jSONObject.optBoolean("collect_reports", true)), 0, 3600);
        atomicReference.set(fVar2);
    }

    /* renamed from: a */
    public C3255i<C4173b> mo10370a() {
        return ((C3257j) this.f10079i.get()).f8128a;
    }

    /* renamed from: b */
    public C4176e mo10374b() {
        return (C4176e) this.f10078h.get();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p213q.p217b.p317d.p322h.p323e.p337s.p338i.C4177f mo10372a(p213q.p217b.p317d.p322h.p323e.p337s.C4165c r9) {
        /*
            r8 = this;
            r0 = 6
            r1 = 0
            q.b.d.h.e.s.c r2 = p213q.p217b.p317d.p322h.p323e.p337s.C4165c.SKIP_CACHE_LOOKUP     // Catch:{ Exception -> 0x0043 }
            boolean r2 = r2.equals(r9)     // Catch:{ Exception -> 0x0043 }
            if (r2 != 0) goto L_0x0076
            q.b.d.h.e.s.a r2 = r8.f10075e     // Catch:{ Exception -> 0x0043 }
            org.json.JSONObject r2 = r2.mo10368a()     // Catch:{ Exception -> 0x0043 }
            if (r2 == 0) goto L_0x0062
            q.b.d.h.e.s.f r3 = r8.f10073c     // Catch:{ Exception -> 0x0043 }
            q.b.d.h.e.s.i.f r3 = r3.mo10375a(r2)     // Catch:{ Exception -> 0x0043 }
            if (r3 == 0) goto L_0x0052
            java.lang.String r4 = "Loaded cached settings: "
            r8.mo10373a(r2, r4)     // Catch:{ Exception -> 0x0043 }
            q.b.d.h.e.k.x0 r2 = r8.f10074d     // Catch:{ Exception -> 0x0043 }
            if (r2 == 0) goto L_0x0051
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0043 }
            q.b.d.h.e.s.c r2 = p213q.p217b.p317d.p322h.p323e.p337s.C4165c.IGNORE_CACHE_EXPIRATION     // Catch:{ Exception -> 0x0043 }
            boolean r9 = r2.equals(r9)     // Catch:{ Exception -> 0x0043 }
            if (r9 != 0) goto L_0x0045
            long r6 = r3.f10106d     // Catch:{ Exception -> 0x0043 }
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x0037
            r9 = 1
            goto L_0x0038
        L_0x0037:
            r9 = 0
        L_0x0038:
            if (r9 != 0) goto L_0x003b
            goto L_0x0045
        L_0x003b:
            q.b.d.h.e.b r9 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c     // Catch:{ Exception -> 0x0043 }
            java.lang.String r2 = "Cached settings have expired."
        L_0x003f:
            r9.mo10108a(r2)     // Catch:{ Exception -> 0x0043 }
            goto L_0x0076
        L_0x0043:
            r9 = move-exception
            goto L_0x0067
        L_0x0045:
            q.b.d.h.e.b r9 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c     // Catch:{ Exception -> 0x004e }
            java.lang.String r1 = "Returning cached settings."
            r9.mo10108a(r1)     // Catch:{ Exception -> 0x004e }
            r1 = r3
            goto L_0x0076
        L_0x004e:
            r9 = move-exception
            r1 = r3
            goto L_0x0067
        L_0x0051:
            throw r1     // Catch:{ Exception -> 0x0043 }
        L_0x0052:
            q.b.d.h.e.b r9 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c     // Catch:{ Exception -> 0x0043 }
            java.lang.String r2 = "Failed to parse cached settings data."
            boolean r3 = r9.mo10110a(r0)     // Catch:{ Exception -> 0x0043 }
            if (r3 == 0) goto L_0x0076
            java.lang.String r9 = r9.f9553a     // Catch:{ Exception -> 0x0043 }
            android.util.Log.e(r9, r2, r1)     // Catch:{ Exception -> 0x0043 }
            goto L_0x0076
        L_0x0062:
            q.b.d.h.e.b r9 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c     // Catch:{ Exception -> 0x0043 }
            java.lang.String r2 = "No cached settings data found."
            goto L_0x003f
        L_0x0067:
            q.b.d.h.e.b r2 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            boolean r0 = r2.mo10110a(r0)
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = r2.f9553a
            java.lang.String r2 = "Failed to get cached settings"
            android.util.Log.e(r0, r2, r9)
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p322h.p323e.p337s.C4166d.mo10372a(q.b.d.h.e.s.c):q.b.d.h.e.s.i.f");
    }

    /* renamed from: a */
    public C3255i<Void> mo10371a(C4165c cVar, Executor executor) {
        if (!(!C3944g.m9370e(this.f10071a).getString("existing_instance_identifier", Objects.EMPTY_STRING).equals(this.f10072b.f10112f))) {
            C4177f a = mo10372a(cVar);
            if (a != null) {
                this.f10078h.set(a);
                ((C3257j) this.f10079i.get()).mo8941a(a.f10103a);
                return C2286e.m5291b(null);
            }
        }
        C4177f a2 = mo10372a(C4165c.IGNORE_CACHE_EXPIRATION);
        if (a2 != null) {
            this.f10078h.set(a2);
            ((C3257j) this.f10079i.get()).mo8941a(a2.f10103a);
        }
        C3959l0 l0Var = this.f10077g;
        return C4003z0.m9443a((C3255i<T>) l0Var.f9666g.f8128a, l0Var.mo10150b()).mo8927a(executor, (C3253h<TResult, TContinuationResult>) new C4167a<TResult,TContinuationResult>());
    }

    /* renamed from: a */
    public final void mo10373a(JSONObject jSONObject, String str) {
        C3913b bVar = C3913b.f9552c;
        StringBuilder a = C1965a.m4756a(str);
        a.append(jSONObject.toString());
        bVar.mo10108a(a.toString());
    }
}
