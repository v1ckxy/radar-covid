package p425x.p426a.p437c.p438a.p439a;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;
import p425x.p426a.p469f.C5167h;

/* renamed from: x.a.c.a.a.b */
public class C5020b extends BasicPermission {

    /* renamed from: e */
    public final String f11953e;

    /* renamed from: f */
    public final int f11954f;

    public C5020b(String str, String str2) {
        super(str, str2);
        this.f11953e = str2;
        StringTokenizer stringTokenizer = new StringTokenizer(C5167h.m11602b(str2), " ,");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("threadlocalecimplicitlyca")) {
                i |= 1;
            } else if (nextToken.equals("ecimplicitlyca")) {
                i |= 2;
            } else if (nextToken.equals("threadlocaldhdefaultparams")) {
                i |= 4;
            } else if (nextToken.equals("dhdefaultparams")) {
                i |= 8;
            } else if (nextToken.equals("acceptableeccurves")) {
                i |= 16;
            } else if (nextToken.equals("additionalecparameters")) {
                i |= 32;
            } else if (nextToken.equals("all")) {
                i |= 63;
            }
        }
        if (i != 0) {
            this.f11954f = i;
            return;
        }
        throw new IllegalArgumentException("unknown permissions passed to mask");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5020b)) {
            return false;
        }
        C5020b bVar = (C5020b) obj;
        if (this.f11954f != bVar.f11954f || !getName().equals(bVar.getName())) {
            z = false;
        }
        return z;
    }

    public String getActions() {
        return this.f11953e;
    }

    public int hashCode() {
        return getName().hashCode() + this.f11954f;
    }

    public boolean implies(Permission permission) {
        boolean z = false;
        if (!(permission instanceof C5020b) || !getName().equals(permission.getName())) {
            return false;
        }
        C5020b bVar = (C5020b) permission;
        int i = this.f11954f;
        int i2 = bVar.f11954f;
        if ((i & i2) == i2) {
            z = true;
        }
        return z;
    }
}
