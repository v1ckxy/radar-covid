package p410v.p411m0.p416g;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;
import p410v.p411m0.C4737b;
import p410v.p411m0.p416g.C4793d.C4795b;
import p423w.C4892f;
import p423w.C4895h;

/* renamed from: v.m0.g.m */
public final class C4821m implements Closeable {

    /* renamed from: k */
    public static final Logger f11502k = Logger.getLogger(C4796e.class.getName());

    /* renamed from: e */
    public final C4892f f11503e;

    /* renamed from: f */
    public int f11504f;

    /* renamed from: g */
    public boolean f11505g;

    /* renamed from: h */
    public final C4795b f11506h;

    /* renamed from: i */
    public final C4895h f11507i;

    /* renamed from: j */
    public final boolean f11508j;

    public C4821m(C4895h hVar, boolean z) {
        if (hVar != null) {
            this.f11507i = hVar;
            this.f11508j = z;
            C4892f fVar = new C4892f();
            this.f11503e = fVar;
            this.f11504f = 16384;
            this.f11506h = new C4795b(0, false, fVar, 3);
            return;
        }
        C4638h.m10271a("sink");
        throw null;
    }

    /* renamed from: a */
    public final synchronized void mo11267a() {
        if (this.f11505g) {
            throw new IOException("closed");
        } else if (this.f11508j) {
            if (f11502k.isLoggable(Level.FINE)) {
                Logger logger = f11502k;
                StringBuilder sb = new StringBuilder();
                sb.append(">> CONNECTION ");
                sb.append(C4796e.f11378a.mo11504h());
                logger.fine(C4737b.m10455a(sb.toString(), new Object[0]));
            }
            this.f11507i.mo11443a(C4796e.f11378a);
            this.f11507i.flush();
        }
    }

    /* renamed from: a */
    public final void mo11268a(int i, int i2, int i3, int i4) {
        if (f11502k.isLoggable(Level.FINE)) {
            f11502k.fine(C4796e.f11382e.mo11205a(false, i, i2, i3, i4));
        }
        boolean z = true;
        if (i2 <= this.f11504f) {
            if ((((int) 2147483648L) & i) != 0) {
                z = false;
            }
            if (z) {
                C4737b.m10466a(this.f11507i, i2);
                this.f11507i.writeByte(i3 & 255);
                this.f11507i.writeByte(i4 & 255);
                this.f11507i.writeInt(i & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(C1965a.m4761b("reserved bit set: ", i).toString());
        }
        StringBuilder a = C1965a.m4756a("FRAME_SIZE_ERROR length > ");
        a.append(this.f11504f);
        a.append(": ");
        a.append(i2);
        throw new IllegalArgumentException(a.toString().toString());
    }

    /* renamed from: a */
    public final synchronized void mo11270a(int i, long j) {
        if (!this.f11505g) {
            if (j != 0 && j <= 2147483647L) {
                mo11268a(i, 4, 8, 0);
                this.f11507i.writeInt((int) j);
                this.f11507i.flush();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo11273a(C4825q qVar) {
        String str = "peerSettings";
        if (qVar == null) {
            C4638h.m10271a(str);
            throw null;
        } else if (!this.f11505g) {
            int i = this.f11504f;
            if ((qVar.f11517a & 32) != 0) {
                i = qVar.f11518b[5];
            }
            this.f11504f = i;
            int i2 = -1;
            if (((qVar.f11517a & 2) != 0 ? qVar.f11518b[1] : -1) != -1) {
                C4795b bVar = this.f11506h;
                if ((qVar.f11517a & 2) != 0) {
                    i2 = qVar.f11518b[1];
                }
                bVar.f11375h = i2;
                int min = Math.min(i2, 16384);
                int i3 = bVar.f11370c;
                if (i3 != min) {
                    if (min < i3) {
                        bVar.f11368a = Math.min(bVar.f11368a, min);
                    }
                    bVar.f11369b = true;
                    bVar.f11370c = min;
                    int i4 = bVar.f11374g;
                    if (min < i4) {
                        if (min == 0) {
                            bVar.mo11200a();
                        } else {
                            bVar.mo11199a(i4 - min);
                        }
                    }
                }
            }
            mo11268a(0, 0, 4, 1);
            this.f11507i.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo11274a(boolean z, int i, int i2) {
        if (!this.f11505g) {
            mo11268a(0, 8, 6, z ? 1 : 0);
            this.f11507i.writeInt(i);
            this.f11507i.writeInt(i2);
            this.f11507i.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: b */
    public final void mo11277b(int i, long j) {
        while (j > 0) {
            long min = Math.min((long) this.f11504f, j);
            j -= min;
            mo11268a(i, (int) min, 9, j == 0 ? 4 : 0);
            this.f11507i.mo11105a(this.f11503e, min);
        }
    }

    /* renamed from: b */
    public final synchronized void mo11278b(C4825q qVar) {
        String str = "settings";
        if (qVar == null) {
            C4638h.m10271a(str);
            throw null;
        } else if (!this.f11505g) {
            mo11268a(0, Integer.bitCount(qVar.f11517a) * 6, 4, 0);
            int i = 0;
            while (i < 10) {
                boolean z = true;
                if (((1 << i) & qVar.f11517a) == 0) {
                    z = false;
                }
                if (z) {
                    int i2 = i != 4 ? i != 7 ? i : 4 : 3;
                    this.f11507i.writeShort(i2);
                    this.f11507i.writeInt(qVar.f11518b[i]);
                }
                i++;
            }
            this.f11507i.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void close() {
        this.f11505g = true;
        this.f11507i.close();
    }

    public final synchronized void flush() {
        if (!this.f11505g) {
            this.f11507i.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo11276a(boolean z, int i, C4892f fVar, int i2) {
        if (!this.f11505g) {
            mo11268a(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                C4895h hVar = this.f11507i;
                if (fVar != null) {
                    hVar.mo11105a(fVar, (long) i2);
                } else {
                    C4638h.m10269a();
                    throw null;
                }
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo11272a(int i, C4790b bVar, byte[] bArr) {
        String str = "errorCode";
        if (bVar != null) {
            String str2 = "debugData";
            if (bArr == null) {
                C4638h.m10271a(str2);
                throw null;
            } else if (!this.f11505g) {
                boolean z = false;
                if (bVar.f11347e != -1) {
                    mo11268a(0, bArr.length + 8, 7, 0);
                    this.f11507i.writeInt(i);
                    this.f11507i.writeInt(bVar.f11347e);
                    if (bArr.length == 0) {
                        z = true;
                    }
                    if (!z) {
                        this.f11507i.write(bArr);
                    }
                    this.f11507i.flush();
                } else {
                    throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
                }
            } else {
                throw new IOException("closed");
            }
        } else {
            C4638h.m10271a(str);
            throw null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo11275a(boolean z, int i, List<C4792c> list) {
        String str = "headerBlock";
        if (list == null) {
            C4638h.m10271a(str);
            throw null;
        } else if (!this.f11505g) {
            this.f11506h.mo11202a(list);
            long j = this.f11503e.f11661f;
            long min = Math.min((long) this.f11504f, j);
            int i2 = (j > min ? 1 : (j == min ? 0 : -1));
            int i3 = i2 == 0 ? 4 : 0;
            if (z) {
                i3 |= 1;
            }
            mo11268a(i, (int) min, 1, i3);
            this.f11507i.mo11105a(this.f11503e, min);
            if (i2 > 0) {
                mo11277b(i, j - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo11269a(int i, int i2, List<C4792c> list) {
        String str = "requestHeaders";
        if (list == null) {
            C4638h.m10271a(str);
            throw null;
        } else if (!this.f11505g) {
            this.f11506h.mo11202a(list);
            long j = this.f11503e.f11661f;
            int min = (int) Math.min(((long) this.f11504f) - 4, j);
            int i3 = min + 4;
            long j2 = (long) min;
            int i4 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            mo11268a(i, i3, 5, i4 == 0 ? 4 : 0);
            this.f11507i.writeInt(i2 & Integer.MAX_VALUE);
            this.f11507i.mo11105a(this.f11503e, j2);
            if (i4 > 0) {
                mo11277b(i, j - j2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo11271a(int i, C4790b bVar) {
        String str = "errorCode";
        if (bVar == null) {
            C4638h.m10271a(str);
            throw null;
        } else if (!this.f11505g) {
            if (bVar.f11347e != -1) {
                mo11268a(i, 4, 3, 0);
                this.f11507i.writeInt(bVar.f11347e);
                this.f11507i.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }
}
