package p392u.p409w;

import java.io.Serializable;
import java.util.regex.Pattern;
import p392u.p401r.p403c.C4638h;

/* renamed from: u.w.c */
public final class C4677c implements Serializable {

    /* renamed from: e */
    public final Pattern f10873e;

    public C4677c(String str) {
        if (str != null) {
            Pattern compile = Pattern.compile(str);
            C4638h.m10270a((Object) compile, "Pattern.compile(pattern)");
            this.f10873e = compile;
            return;
        }
        C4638h.m10271a("pattern");
        throw null;
    }

    /* renamed from: a */
    public final boolean mo10964a(CharSequence charSequence) {
        if (charSequence != null) {
            return this.f10873e.matcher(charSequence).matches();
        }
        C4638h.m10271a("input");
        throw null;
    }

    public String toString() {
        String pattern = this.f10873e.toString();
        C4638h.m10270a((Object) pattern, "nativePattern.toString()");
        return pattern;
    }
}
