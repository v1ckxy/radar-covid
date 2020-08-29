package p410v.p411m0.p416g;

import java.io.IOException;
import p392u.p401r.p403c.C4638h;

/* renamed from: v.m0.g.r */
public final class C4826r extends IOException {

    /* renamed from: e */
    public final C4790b f11519e;

    public C4826r(C4790b bVar) {
        if (bVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("stream was reset: ");
            sb.append(bVar);
            super(sb.toString());
            this.f11519e = bVar;
            return;
        }
        C4638h.m10271a("errorCode");
        throw null;
    }
}
