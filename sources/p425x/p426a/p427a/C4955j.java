package p425x.p426a.p427a;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p469f.p471j.C5173a;

/* renamed from: x.a.a.j */
public class C4955j extends FilterInputStream {

    /* renamed from: e */
    public final int f11838e;

    /* renamed from: f */
    public final boolean f11839f;

    /* renamed from: g */
    public final byte[][] f11840g;

    public C4955j(InputStream inputStream) {
        int a = C4924b2.m11132a(inputStream);
        super(inputStream);
        this.f11838e = a;
        this.f11839f = false;
        this.f11840g = new byte[11][];
    }

    /* renamed from: a */
    public static int m11218a(InputStream inputStream, int i) {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = 0;
        int read = inputStream.read();
        if ((read & 127) != 0) {
            while (read >= 0 && (read & 128) != 0) {
                i3 = (i3 | (read & 127)) << 7;
                read = inputStream.read();
            }
            if (read >= 0) {
                return i3 | (read & 127);
            }
            throw new EOFException("EOF found inside tag value.");
        }
        throw new IOException("corrupted stream - invalid high tag number found");
    }

    /* renamed from: a */
    public static int m11219a(InputStream inputStream, int i, boolean z) {
        int read = inputStream.read();
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        } else if (read == 128) {
            return -1;
        } else {
            if (read > 127) {
                int i2 = read & 127;
                if (i2 <= 4) {
                    int i3 = 0;
                    int i4 = 0;
                    while (i4 < i2) {
                        int read2 = inputStream.read();
                        if (read2 >= 0) {
                            i3 = (i3 << 8) + read2;
                            i4++;
                        } else {
                            throw new EOFException("EOF found reading length");
                        }
                    }
                    if (i3 < 0) {
                        throw new IOException("corrupted stream - negative length found");
                    } else if (i3 < i || z) {
                        read = i3;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("corrupted stream - out of bounds length found: ");
                        sb.append(i3);
                        sb.append(" >= ");
                        sb.append(i);
                        throw new IOException(sb.toString());
                    }
                } else {
                    throw new IOException(C1965a.m4761b("DER length more than 4 bytes: ", i2));
                }
            }
            return read;
        }
    }

    /* renamed from: a */
    public C4983s mo11589a(int i, int i2, int i3) {
        int i4 = 0;
        boolean z = (i & 32) != 0;
        C4992u1 u1Var = new C4992u1(this, i3, this.f11838e);
        if ((i & 64) != 0) {
            return new C4960k1(z, i2, u1Var.mo11637a());
        }
        if ((i & 128) != 0) {
            return new C5002y(u1Var).mo11653a(z, i2);
        }
        if (!z) {
            return m11220a(i2, u1Var, this.f11840g);
        }
        if (i2 == 4) {
            C4933e a = mo11588a(u1Var);
            int i5 = a.f11772b;
            C4971o[] oVarArr = new C4971o[i5];
            while (i4 != i5) {
                C4929d a2 = a.mo11572a(i4);
                if (a2 instanceof C4971o) {
                    oVarArr[i4] = (C4971o) a2;
                    i4++;
                } else {
                    StringBuilder a3 = C1965a.m4756a("unknown object encountered in constructed OCTET STRING: ");
                    a3.append(a2.getClass());
                    throw new C4942g(a3.toString());
                }
            }
            return new C4938f0(oVarArr);
        } else if (i2 == 8) {
            return new C4966m1(mo11588a(u1Var));
        } else {
            if (i2 == 16) {
                return this.f11839f ? new C5004y1(u1Var.mo11637a()) : C4970n1.m11275a(mo11588a(u1Var));
            }
            if (i2 == 17) {
                return C4970n1.m11276b(mo11588a(u1Var));
            }
            throw new IOException(C1965a.m4762b("unknown tag ", i2, " encountered"));
        }
    }

    public C4983s readObject() {
        int read = read();
        if (read > 0) {
            int a = m11218a((InputStream) this, read);
            boolean z = (read & 32) != 0;
            int a2 = m11219a((InputStream) this, this.f11838e, false);
            if (a2 >= 0) {
                try {
                    return mo11589a(read, a, a2);
                } catch (IllegalArgumentException e) {
                    throw new C4942g("corrupted stream detected", e);
                }
            } else if (z) {
                C5002y yVar = new C5002y(new C4998w1(this, this.f11838e), this.f11838e);
                if ((read & 64) != 0) {
                    return new C4930d0(a, yVar).mo11570g();
                }
                if ((read & 128) != 0) {
                    return yVar.mo11653a(true, a);
                }
                if (a == 4) {
                    return new C4943g0(yVar).mo11570g();
                }
                if (a == 8) {
                    try {
                        return new C4966m1(yVar.mo11654b());
                    } catch (IllegalArgumentException e2) {
                        throw new C4942g(e2.getMessage(), e2);
                    }
                } else if (a == 16) {
                    return new C4948h0(yVar.mo11654b());
                } else {
                    if (a == 17) {
                        return new C4956j0(yVar.mo11654b());
                    }
                    throw new IOException("unknown BER object encountered");
                }
            } else {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
        } else if (read != 0) {
            return null;
        } else {
            throw new IOException("unexpected end-of-contents marker");
        }
    }

    public C4955j(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        int length = bArr.length;
        super(byteArrayInputStream);
        this.f11838e = length;
        this.f11839f = false;
        this.f11840g = new byte[11][];
    }

    public C4955j(byte[] bArr, boolean z) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        int length = bArr.length;
        super(byteArrayInputStream);
        this.f11838e = length;
        this.f11839f = z;
        this.f11840g = new byte[11][];
    }

    /* renamed from: a */
    public static C4983s m11220a(int i, C4992u1 u1Var, byte[][] bArr) {
        C4937f fVar;
        int i2;
        C4983s sVar;
        int i3 = 0;
        if (i == 10) {
            byte[] a = m11221a(u1Var, bArr);
            if (a.length > 1) {
                fVar = new C4937f(a);
            } else if (a.length != 0) {
                byte b = a[0] & 255;
                C4937f[] fVarArr = C4937f.f11788f;
                if (b >= fVarArr.length) {
                    fVar = new C4937f(a);
                } else {
                    C4937f fVar2 = fVarArr[b];
                    if (fVar2 == null) {
                        fVar2 = new C4937f(a);
                        fVarArr[b] = fVar2;
                    }
                    fVar = fVar2;
                }
            } else {
                throw new IllegalArgumentException("ENUMERATED has zero length");
            }
            return fVar;
        } else if (i == 12) {
            return new C4944g1(u1Var.mo11637a());
        } else {
            if (i != 30) {
                switch (i) {
                    case 1:
                        return C4925c.m11134b(m11221a(u1Var, bArr));
                    case 2:
                        return new C4958k(u1Var.mo11637a(), false);
                    case 3:
                        int i4 = u1Var.f11874h;
                        if (i4 >= 1) {
                            int read = u1Var.read();
                            int i5 = i4 - 1;
                            byte[] bArr2 = new byte[i5];
                            if (i5 != 0) {
                                if (C5173a.m11609a(u1Var, bArr2, 0, i5) != i5) {
                                    throw new EOFException("EOF encountered in middle of BIT STRING");
                                } else if (read > 0 && read < 8) {
                                    int i6 = i5 - 1;
                                    if (bArr2[i6] != ((byte) (bArr2[i6] & (255 << read)))) {
                                        sVar = new C4963l1(bArr2, read);
                                        return sVar;
                                    }
                                }
                            }
                            sVar = new C4975p0(bArr2, read);
                            return sVar;
                        }
                        throw new IllegalArgumentException("truncated BIT STRING detected");
                    case 4:
                        return new C5003y0(u1Var.mo11637a());
                    case 5:
                        return C4997w0.f11880e;
                    case 6:
                        return C4967n.m11264b(m11221a(u1Var, bArr));
                    default:
                        switch (i) {
                            case 18:
                                return new C5000x0(u1Var.mo11637a());
                            case 19:
                                return new C4923b1(u1Var.mo11637a());
                            case 20:
                                return new C4935e1(u1Var.mo11637a());
                            case 21:
                                return new C4954i1(u1Var.mo11637a());
                            case 22:
                                return new C4994v0(u1Var.mo11637a());
                            case 23:
                                return new C4922b0(u1Var.mo11637a());
                            case 24:
                                return new C4952i(u1Var.mo11637a());
                            case 25:
                                return new C4991u0(u1Var.mo11637a());
                            case 26:
                                return new C4957j1(u1Var.mo11637a());
                            case 27:
                                return new C4984s0(u1Var.mo11637a());
                            case 28:
                                return new C4949h1(u1Var.mo11637a());
                            default:
                                throw new IOException(C1965a.m4762b("unknown tag ", i, " encountered"));
                        }
                }
            } else {
                int i7 = u1Var.f11874h;
                if ((i7 & 1) == 0) {
                    int i8 = i7 / 2;
                    char[] cArr = new char[i8];
                    byte[] bArr3 = new byte[8];
                    int i9 = 0;
                    while (true) {
                        String str = "EOF encountered in middle of BMPString";
                        if (i7 < 8) {
                            if (i7 > 0) {
                                if (C5173a.m11609a(u1Var, bArr3, 0, i7) == i7) {
                                    while (true) {
                                        int i10 = i3 + 1;
                                        int i11 = i10 + 1;
                                        i2 = i9 + 1;
                                        cArr[i9] = (char) ((bArr3[i3] << 8) | (bArr3[i10] & 255));
                                        if (i11 >= i7) {
                                            break;
                                        }
                                        i3 = i11;
                                        i9 = i2;
                                    }
                                    i9 = i2;
                                } else {
                                    throw new EOFException(str);
                                }
                            }
                            if (u1Var.f11874h == 0 && i8 == i9) {
                                return new C4972o0(cArr);
                            }
                            throw new IllegalStateException();
                        } else if (C5173a.m11609a(u1Var, bArr3, 0, 8) == 8) {
                            cArr[i9] = (char) ((bArr3[0] << 8) | (bArr3[1] & 255));
                            cArr[i9 + 1] = (char) ((bArr3[2] << 8) | (bArr3[3] & 255));
                            cArr[i9 + 2] = (char) ((bArr3[4] << 8) | (bArr3[5] & 255));
                            cArr[i9 + 3] = (char) ((bArr3[6] << 8) | (bArr3[7] & 255));
                            i9 += 4;
                            i7 -= 8;
                        } else {
                            throw new EOFException(str);
                        }
                    }
                } else {
                    throw new IOException("malformed BMPString encoding encountered");
                }
            }
        }
    }

    /* renamed from: a */
    public static byte[] m11221a(C4992u1 u1Var, byte[][] bArr) {
        int i = u1Var.f11874h;
        if (i >= bArr.length) {
            return u1Var.mo11637a();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        int i2 = u1Var.f11874h;
        if (i2 == bArr2.length) {
            if (i2 != 0) {
                int i3 = u1Var.f11898f;
                if (i2 < i3) {
                    int a = i2 - C5173a.m11609a(u1Var.f11897e, bArr2, 0, bArr2.length);
                    u1Var.f11874h = a;
                    if (a == 0) {
                        u1Var.mo11658a(true);
                    } else {
                        StringBuilder a2 = C1965a.m4756a("DEF length ");
                        a2.append(u1Var.f11873g);
                        a2.append(" object truncated by ");
                        a2.append(u1Var.f11874h);
                        throw new EOFException(a2.toString());
                    }
                } else {
                    StringBuilder a3 = C1965a.m4756a("corrupted stream - out of bounds length found: ");
                    a3.append(u1Var.f11874h);
                    a3.append(" >= ");
                    a3.append(i3);
                    throw new IOException(a3.toString());
                }
            }
            return bArr2;
        }
        throw new IllegalArgumentException("buffer length not right for data");
    }

    /* renamed from: a */
    public C4933e mo11588a(C4992u1 u1Var) {
        if (u1Var.f11874h < 1) {
            return new C4933e(0);
        }
        C4955j jVar = new C4955j((InputStream) u1Var);
        C4933e eVar = new C4933e(10);
        while (true) {
            C4983s readObject = jVar.readObject();
            if (readObject == null) {
                return eVar;
            }
            eVar.mo11573a((C4929d) readObject);
        }
    }
}
