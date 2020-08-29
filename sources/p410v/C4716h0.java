package p410v;

import java.io.File;
import java.nio.charset.Charset;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4674a;
import p410v.C4879z.C4880a;
import p410v.p411m0.C4737b;
import p423w.C4895h;
import p423w.C4897j;

/* renamed from: v.h0 */
public abstract class C4716h0 {

    /* renamed from: a */
    public static final C4717a f11051a = new C4717a(null);

    /* renamed from: v.h0$a */
    public static final class C4717a {

        /* renamed from: v.h0$a$a */
        public static final class C4718a extends C4716h0 {

            /* renamed from: b */
            public final /* synthetic */ byte[] f11052b;

            /* renamed from: c */
            public final /* synthetic */ C4879z f11053c;

            /* renamed from: d */
            public final /* synthetic */ int f11054d;

            /* renamed from: e */
            public final /* synthetic */ int f11055e;

            public C4718a(byte[] bArr, C4879z zVar, int i, int i2) {
                this.f11052b = bArr;
                this.f11053c = zVar;
                this.f11054d = i;
                this.f11055e = i2;
            }

            /* renamed from: a */
            public long mo10970a() {
                return (long) this.f11054d;
            }

            /* renamed from: a */
            public void mo10972a(C4895h hVar) {
                if (hVar != null) {
                    hVar.write(this.f11052b, this.f11055e, this.f11054d);
                } else {
                    C4638h.m10271a("sink");
                    throw null;
                }
            }

            /* renamed from: b */
            public C4879z mo10973b() {
                return this.f11053c;
            }
        }

        public /* synthetic */ C4717a(C4636f fVar) {
        }

        /* renamed from: a */
        public final C4716h0 mo11030a(String str, C4879z zVar) {
            if (str != null) {
                Charset charset = C4674a.f10859a;
                if (zVar != null) {
                    charset = C4879z.m10905a(zVar, null, 1);
                    if (charset == null) {
                        charset = C4674a.f10859a;
                        C4880a aVar = C4879z.f11637f;
                        StringBuilder sb = new StringBuilder();
                        sb.append(zVar);
                        sb.append("; charset=utf-8");
                        zVar = C4880a.m10909b(sb.toString());
                    }
                }
                byte[] bytes = str.getBytes(charset);
                C4638h.m10270a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                return mo11031a(bytes, zVar, 0, bytes.length);
            }
            C4638h.m10271a("$this$toRequestBody");
            throw null;
        }

        /* renamed from: a */
        public final C4716h0 mo11031a(byte[] bArr, C4879z zVar, int i, int i2) {
            if (bArr != null) {
                C4737b.m10462a((long) bArr.length, (long) i, (long) i2);
                return new C4718a(bArr, zVar, i2, i);
            }
            C4638h.m10271a("$this$toRequestBody");
            throw null;
        }
    }

    /* renamed from: a */
    public static final C4716h0 m10395a(C4879z zVar, File file) {
        if (file != null) {
            return new C4710f0(file, zVar);
        }
        C4638h.m10271a("file");
        throw null;
    }

    /* renamed from: a */
    public long mo10970a() {
        return -1;
    }

    /* renamed from: a */
    public abstract void mo10972a(C4895h hVar);

    /* renamed from: b */
    public abstract C4879z mo10973b();

    /* renamed from: a */
    public static final C4716h0 m10396a(C4879z zVar, C4897j jVar) {
        if (jVar != null) {
            return new C4712g0(jVar, zVar);
        }
        C4638h.m10271a("content");
        throw null;
    }
}
