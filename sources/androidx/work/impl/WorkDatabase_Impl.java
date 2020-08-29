package androidx.work.impl;

import p124p.p199y.p200x.p209s.C1891b;
import p124p.p199y.p200x.p209s.C1892c;
import p124p.p199y.p200x.p209s.C1895e;
import p124p.p199y.p200x.p209s.C1896f;
import p124p.p199y.p200x.p209s.C1899h;
import p124p.p199y.p200x.p209s.C1900i;
import p124p.p199y.p200x.p209s.C1904k;
import p124p.p199y.p200x.p209s.C1905l;
import p124p.p199y.p200x.p209s.C1908n;
import p124p.p199y.p200x.p209s.C1909o;
import p124p.p199y.p200x.p209s.C1915q;
import p124p.p199y.p200x.p209s.C1916r;
import p124p.p199y.p200x.p209s.C1927t;
import p124p.p199y.p200x.p209s.C1928u;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: k */
    public volatile C1915q f991k;

    /* renamed from: l */
    public volatile C1891b f992l;

    /* renamed from: m */
    public volatile C1927t f993m;

    /* renamed from: n */
    public volatile C1899h f994n;

    /* renamed from: o */
    public volatile C1904k f995o;

    /* renamed from: p */
    public volatile C1908n f996p;

    /* renamed from: q */
    public volatile C1895e f997q;

    /* renamed from: h */
    public C1891b mo1457h() {
        C1891b bVar;
        if (this.f992l != null) {
            return this.f992l;
        }
        synchronized (this) {
            if (this.f992l == null) {
                this.f992l = new C1892c(this);
            }
            bVar = this.f992l;
        }
        return bVar;
    }

    /* renamed from: i */
    public C1895e mo1458i() {
        C1895e eVar;
        if (this.f997q != null) {
            return this.f997q;
        }
        synchronized (this) {
            if (this.f997q == null) {
                this.f997q = new C1896f(this);
            }
            eVar = this.f997q;
        }
        return eVar;
    }

    /* renamed from: j */
    public C1899h mo1459j() {
        C1899h hVar;
        if (this.f994n != null) {
            return this.f994n;
        }
        synchronized (this) {
            if (this.f994n == null) {
                this.f994n = new C1900i(this);
            }
            hVar = this.f994n;
        }
        return hVar;
    }

    /* renamed from: k */
    public C1904k mo1460k() {
        C1904k kVar;
        if (this.f995o != null) {
            return this.f995o;
        }
        synchronized (this) {
            if (this.f995o == null) {
                this.f995o = new C1905l(this);
            }
            kVar = this.f995o;
        }
        return kVar;
    }

    /* renamed from: l */
    public C1908n mo1461l() {
        C1908n nVar;
        if (this.f996p != null) {
            return this.f996p;
        }
        synchronized (this) {
            if (this.f996p == null) {
                this.f996p = new C1909o(this);
            }
            nVar = this.f996p;
        }
        return nVar;
    }

    /* renamed from: m */
    public C1915q mo1462m() {
        C1915q qVar;
        if (this.f991k != null) {
            return this.f991k;
        }
        synchronized (this) {
            if (this.f991k == null) {
                this.f991k = new C1916r(this);
            }
            qVar = this.f991k;
        }
        return qVar;
    }

    /* renamed from: n */
    public C1927t mo1463n() {
        C1927t tVar;
        if (this.f993m != null) {
            return this.f993m;
        }
        synchronized (this) {
            if (this.f993m == null) {
                this.f993m = new C1928u(this);
            }
            tVar = this.f993m;
        }
        return tVar;
    }
}
