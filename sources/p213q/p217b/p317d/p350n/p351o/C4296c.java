package p213q.p217b.p317d.p350n.p351o;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.C3859c;

/* renamed from: q.b.d.n.o.c */
public class C4296c {

    /* renamed from: a */
    public final File f10333a;

    /* renamed from: b */
    public final C3859c f10334b;

    /* renamed from: q.b.d.n.o.c$a */
    public enum C4297a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C4296c(C3859c cVar) {
        cVar.mo10056a();
        File filesDir = cVar.f9459a.getFilesDir();
        StringBuilder a = C1965a.m4756a("PersistedInstallation.");
        a.append(cVar.mo10057b());
        a.append(".json");
        this.f10333a = new File(filesDir, a.toString());
        this.f10334b = cVar;
    }

    /* renamed from: a */
    public C4298d mo10512a(C4298d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", ((C4292a) dVar).f10316a);
            jSONObject.put("Status", ((C4292a) dVar).f10317b.ordinal());
            jSONObject.put("AuthToken", ((C4292a) dVar).f10318c);
            jSONObject.put("RefreshToken", ((C4292a) dVar).f10319d);
            jSONObject.put("TokenCreationEpochInSecs", ((C4292a) dVar).f10321f);
            jSONObject.put("ExpiresInSecs", ((C4292a) dVar).f10320e);
            jSONObject.put("FisError", ((C4292a) dVar).f10322g);
            C3859c cVar = this.f10334b;
            cVar.mo10056a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", cVar.f9459a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(this.f10333a)) {
                return dVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p213q.p217b.p317d.p350n.p351o.C4298d mo10511a() {
        /*
            r11 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 16384(0x4000, float:2.2959E-41)
            byte[] r2 = new byte[r1]
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException | JSONException -> 0x002d }
            java.io.File r5 = r11.f10333a     // Catch:{ IOException | JSONException -> 0x002d }
            r4.<init>(r5)     // Catch:{ IOException | JSONException -> 0x002d }
        L_0x0011:
            int r5 = r4.read(r2, r3, r1)     // Catch:{ all -> 0x0028 }
            if (r5 >= 0) goto L_0x0024
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0028 }
            r1.<init>(r0)     // Catch:{ all -> 0x0028 }
            r4.close()     // Catch:{ IOException | JSONException -> 0x002d }
            goto L_0x0032
        L_0x0024:
            r0.write(r2, r3, r5)     // Catch:{ all -> 0x0028 }
            goto L_0x0011
        L_0x0028:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x002c }
        L_0x002c:
            throw r0     // Catch:{ IOException | JSONException -> 0x002d }
        L_0x002d:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L_0x0032:
            r0 = 0
            java.lang.String r2 = "Fid"
            java.lang.String r2 = r1.optString(r2, r0)
            q.b.d.n.o.c$a r4 = p213q.p217b.p317d.p350n.p351o.C4296c.C4297a.ATTEMPT_MIGRATION
            java.lang.String r4 = "Status"
            int r3 = r1.optInt(r4, r3)
            java.lang.String r4 = "AuthToken"
            java.lang.String r4 = r1.optString(r4, r0)
            java.lang.String r5 = "RefreshToken"
            java.lang.String r5 = r1.optString(r5, r0)
            r6 = 0
            java.lang.String r8 = "TokenCreationEpochInSecs"
            long r8 = r1.optLong(r8, r6)
            java.lang.String r10 = "ExpiresInSecs"
            long r6 = r1.optLong(r10, r6)
            java.lang.String r10 = "FisError"
            java.lang.String r0 = r1.optString(r10, r0)
            q.b.d.n.o.d$a r1 = p213q.p217b.p317d.p350n.p351o.C4298d.m9810d()
            q.b.d.n.o.a$b r1 = (p213q.p217b.p317d.p350n.p351o.C4292a.C4294b) r1
            r1.f10323a = r2
            q.b.d.n.o.c$a[] r2 = p213q.p217b.p317d.p350n.p351o.C4296c.C4297a.values()
            r2 = r2[r3]
            r1.mo10504a(r2)
            r1.f10325c = r4
            r1.f10326d = r5
            r1.mo10506b(r8)
            r1.mo10503a(r6)
            r1.f10329g = r0
            q.b.d.n.o.d r0 = r1.mo10505a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p350n.p351o.C4296c.mo10511a():q.b.d.n.o.d");
    }
}
