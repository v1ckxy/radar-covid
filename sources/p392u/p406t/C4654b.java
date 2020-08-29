package p392u.p406t;

import java.util.NoSuchElementException;
import p392u.p393n.C4573l;

/* renamed from: u.t.b */
public final class C4654b extends C4573l {

    /* renamed from: e */
    public final int f10842e;

    /* renamed from: f */
    public boolean f10843f;

    /* renamed from: g */
    public int f10844g;

    /* renamed from: h */
    public final int f10845h;

    public C4654b(int i, int i2, int i3) {
        this.f10845h = i3;
        this.f10842e = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f10843f = z;
        if (!z) {
            i = this.f10842e;
        }
        this.f10844g = i;
    }

    /* renamed from: b */
    public int mo10900b() {
        int i = this.f10844g;
        if (i != this.f10842e) {
            this.f10844g = this.f10845h + i;
        } else if (this.f10843f) {
            this.f10843f = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public boolean hasNext() {
        return this.f10843f;
    }
}
