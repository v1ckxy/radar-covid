package p213q.p217b.p317d.p322h.p323e.p327l;

import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p322h.p323e.p326k.C3944g;

/* renamed from: q.b.d.h.e.l.e */
public class C4020e implements C4009a {

    /* renamed from: d */
    public static final Charset f9812d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final File f9813a;

    /* renamed from: b */
    public final int f9814b;

    /* renamed from: c */
    public C4014c f9815c;

    /* renamed from: q.b.d.h.e.l.e$a */
    public class C4021a {

        /* renamed from: a */
        public final byte[] f9816a;

        /* renamed from: b */
        public final int f9817b;

        public C4021a(C4020e eVar, byte[] bArr, int i) {
            this.f9816a = bArr;
            this.f9817b = i;
        }
    }

    public C4020e(File file, int i) {
        this.f9813a = file;
        this.f9814b = i;
    }

    /* renamed from: a */
    public void mo10199a() {
        C3944g.m9360a((Closeable) this.f9815c, "There was a problem closing the Crashlytics log file.");
        this.f9815c = null;
    }

    /* renamed from: a */
    public void mo10200a(long j, String str) {
        mo10223e();
        String str2 = " ";
        if (this.f9815c != null) {
            if (str == null) {
                str = Objects.NULL_STRING;
            }
            try {
                int i = this.f9814b / 4;
                if (str.length() > i) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("...");
                    sb.append(str.substring(str.length() - i));
                    str = sb.toString();
                }
                byte[] bytes = String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str.replaceAll("\r", str2).replaceAll("\n", str2)}).getBytes(f9812d);
                C4014c cVar = this.f9815c;
                if (cVar != null) {
                    cVar.mo10210a(bytes, 0, bytes.length);
                    while (!this.f9815c.mo10215f() && this.f9815c.mo10217h() > this.f9814b) {
                        this.f9815c.mo10216g();
                    }
                    return;
                }
                throw null;
            } catch (IOException e) {
                C3913b bVar = C3913b.f9552c;
                if (bVar.mo10110a(6)) {
                    Log.e(bVar.f9553a, "There was a problem writing to the Crashlytics log.", e);
                }
            }
        }
    }

    /* renamed from: b */
    public String mo10201b() {
        byte[] c = mo10202c();
        if (c != null) {
            return new String(c, f9812d);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo10202c() {
        /*
            r7 = this;
            java.io.File r0 = r7.f9813a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            r4 = r1
            goto L_0x0042
        L_0x000c:
            r7.mo10223e()
            q.b.d.h.e.l.c r0 = r7.f9815c
            if (r0 != 0) goto L_0x0014
            goto L_0x000a
        L_0x0014:
            r3 = 1
            int[] r3 = new int[r3]
            r3[r2] = r2
            int r0 = r0.mo10217h()
            byte[] r0 = new byte[r0]
            q.b.d.h.e.l.c r4 = r7.f9815c     // Catch:{ IOException -> 0x002a }
            q.b.d.h.e.l.d r5 = new q.b.d.h.e.l.d     // Catch:{ IOException -> 0x002a }
            r5.<init>(r7, r0, r3)     // Catch:{ IOException -> 0x002a }
            r4.mo10209a(r5)     // Catch:{ IOException -> 0x002a }
            goto L_0x003b
        L_0x002a:
            r4 = move-exception
            q.b.d.h.e.b r5 = p213q.p217b.p317d.p322h.p323e.C3913b.f9552c
            r6 = 6
            boolean r6 = r5.mo10110a(r6)
            if (r6 == 0) goto L_0x003b
            java.lang.String r5 = r5.f9553a
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            android.util.Log.e(r5, r6, r4)
        L_0x003b:
            q.b.d.h.e.l.e$a r4 = new q.b.d.h.e.l.e$a
            r3 = r3[r2]
            r4.<init>(r7, r0, r3)
        L_0x0042:
            if (r4 != 0) goto L_0x0045
            return r1
        L_0x0045:
            int r0 = r4.f9817b
            byte[] r1 = new byte[r0]
            byte[] r3 = r4.f9816a
            java.lang.System.arraycopy(r3, r2, r1, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p317d.p322h.p323e.p327l.C4020e.mo10202c():byte[]");
    }

    /* renamed from: d */
    public void mo10203d() {
        C3944g.m9360a((Closeable) this.f9815c, "There was a problem closing the Crashlytics log file.");
        this.f9815c = null;
        this.f9813a.delete();
    }

    /* renamed from: e */
    public final void mo10223e() {
        if (this.f9815c == null) {
            try {
                this.f9815c = new C4014c(this.f9813a);
            } catch (IOException e) {
                C3913b bVar = C3913b.f9552c;
                StringBuilder a = C1965a.m4756a("Could not open log file: ");
                a.append(this.f9813a);
                bVar.mo10112b(a.toString(), e);
            }
        }
    }
}
