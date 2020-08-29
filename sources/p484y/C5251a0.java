package p484y;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;
import p410v.C4686a0;
import p410v.C4686a0.C4687a;
import p410v.C4686a0.C4689c;
import p410v.C4706e0.C4707a;
import p410v.C4716h0;
import p410v.C4864u.C4865a;
import p410v.C4870w;
import p410v.C4870w.C4871a;
import p410v.C4873x;
import p410v.C4873x.C4874a;
import p410v.C4873x.C4876b;
import p410v.C4879z;
import p423w.C4895h;

/* renamed from: y.a0 */
public final class C5251a0 {

    /* renamed from: l */
    public static final char[] f12488l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    public static final Pattern f12489m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    public final String f12490a;

    /* renamed from: b */
    public final C4873x f12491b;
    @Nullable

    /* renamed from: c */
    public String f12492c;
    @Nullable

    /* renamed from: d */
    public C4874a f12493d;

    /* renamed from: e */
    public final C4707a f12494e = new C4707a();

    /* renamed from: f */
    public final C4871a f12495f;
    @Nullable

    /* renamed from: g */
    public C4879z f12496g;

    /* renamed from: h */
    public final boolean f12497h;
    @Nullable

    /* renamed from: i */
    public C4687a f12498i;
    @Nullable

    /* renamed from: j */
    public C4865a f12499j;
    @Nullable

    /* renamed from: k */
    public C4716h0 f12500k;

    /* renamed from: y.a0$a */
    public static class C5252a extends C4716h0 {

        /* renamed from: b */
        public final C4716h0 f12501b;

        /* renamed from: c */
        public final C4879z f12502c;

        public C5252a(C4716h0 h0Var, C4879z zVar) {
            this.f12501b = h0Var;
            this.f12502c = zVar;
        }

        /* renamed from: a */
        public long mo10970a() {
            return this.f12501b.mo10970a();
        }

        /* renamed from: a */
        public void mo10972a(C4895h hVar) {
            this.f12501b.mo10972a(hVar);
        }

        /* renamed from: b */
        public C4879z mo10973b() {
            return this.f12502c;
        }
    }

    public C5251a0(String str, C4873x xVar, @Nullable String str2, @Nullable C4870w wVar, @Nullable C4879z zVar, boolean z, boolean z2, boolean z3) {
        this.f12490a = str;
        this.f12491b = xVar;
        this.f12492c = str2;
        this.f12496g = zVar;
        this.f12497h = z;
        this.f12495f = wVar != null ? wVar.mo11368c() : new C4871a();
        if (z2) {
            this.f12499j = new C4865a();
        } else if (z3) {
            C4687a aVar = new C4687a();
            this.f12498i = aVar;
            aVar.mo10975a(C4686a0.f10893h);
        }
    }

    /* renamed from: a */
    public void mo11975a(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f12496g = C4879z.m10906a(str2);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(C1965a.m4751a("Malformed content type: ", str2), e);
            }
        } else {
            this.f12495f.mo11377a(str, str2);
        }
    }

    /* renamed from: a */
    public void mo11976a(String str, String str2, boolean z) {
        String str3 = "value";
        String str4 = "name";
        C4865a aVar = this.f12499j;
        if (z) {
            if (str == null) {
                C4638h.m10271a(str4);
                throw null;
            } else if (str2 != null) {
                String str5 = str;
                aVar.f11600a.add(C4876b.m10890a(C4873x.f11615l, str5, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f11602c, 83));
                String str6 = str2;
                aVar.f11601b.add(C4876b.m10890a(C4873x.f11615l, str6, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f11602c, 83));
            } else {
                C4638h.m10271a(str3);
                throw null;
            }
        } else if (str == null) {
            C4638h.m10271a(str4);
            throw null;
        } else if (str2 != null) {
            String str7 = str;
            aVar.f11600a.add(C4876b.m10890a(C4873x.f11615l, str7, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar.f11602c, 91));
            String str8 = str2;
            aVar.f11601b.add(C4876b.m10890a(C4873x.f11615l, str8, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar.f11602c, 91));
        } else {
            C4638h.m10271a(str3);
            throw null;
        }
    }

    /* renamed from: b */
    public void mo11978b(String str, @Nullable String str2, boolean z) {
        String str3 = str;
        String str4 = str2;
        String str5 = this.f12492c;
        String str6 = null;
        if (str5 != null) {
            C4874a a = this.f12491b.mo11387a(str5);
            this.f12493d = a;
            if (a != null) {
                this.f12492c = null;
            } else {
                StringBuilder a2 = C1965a.m4756a("Malformed URL. Base: ");
                a2.append(this.f12491b);
                a2.append(", Relative: ");
                a2.append(this.f12492c);
                throw new IllegalArgumentException(a2.toString());
            }
        }
        if (z) {
            this.f12493d.mo11400a(str3, str4);
            return;
        }
        C4874a aVar = this.f12493d;
        if (str3 != null) {
            if (aVar.f11633g == null) {
                aVar.f11633g = new ArrayList();
            }
            List<String> list = aVar.f11633g;
            if (list != null) {
                list.add(C4876b.m10890a(C4873x.f11615l, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219));
                List<String> list2 = aVar.f11633g;
                if (list2 != null) {
                    if (str4 != null) {
                        str6 = C4876b.m10890a(C4873x.f11615l, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219);
                    }
                    list2.add(str6);
                    return;
                }
                C4638h.m10269a();
                throw null;
            }
            C4638h.m10269a();
            throw null;
        }
        C4638h.m10271a("name");
        throw null;
    }

    /* renamed from: a */
    public void mo11977a(C4870w wVar, C4716h0 h0Var) {
        C4687a aVar = this.f12498i;
        if (aVar == null) {
            throw null;
        } else if (h0Var != null) {
            aVar.mo10974a(C4689c.m10342a(wVar, h0Var));
        } else {
            C4638h.m10271a("body");
            throw null;
        }
    }
}
