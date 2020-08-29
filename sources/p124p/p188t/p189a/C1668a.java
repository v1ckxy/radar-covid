package p124p.p188t.p189a;

/* renamed from: p.t.a.a */
public final class C1668a implements C1675e {

    /* renamed from: e */
    public final String f4922e;

    /* renamed from: f */
    public final Object[] f4923f = null;

    public C1668a(String str) {
        this.f4922e = str;
    }

    /* renamed from: a */
    public String mo6426a() {
        return this.f4922e;
    }

    /* renamed from: a */
    public void mo6427a(C1674d dVar) {
        double d;
        long j;
        int i;
        Object[] objArr = this.f4923f;
        if (objArr != null) {
            int length = objArr.length;
            int i2 = 0;
            while (i2 < length) {
                Object obj = objArr[i2];
                i2++;
                if (obj == null) {
                    dVar.bindNull(i2);
                } else if (obj instanceof byte[]) {
                    dVar.bindBlob(i2, (byte[]) obj);
                } else {
                    if (obj instanceof Float) {
                        d = (double) ((Float) obj).floatValue();
                    } else if (obj instanceof Double) {
                        d = ((Double) obj).doubleValue();
                    } else {
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                        } else {
                            if (obj instanceof Integer) {
                                i = ((Integer) obj).intValue();
                            } else if (obj instanceof Short) {
                                i = ((Short) obj).shortValue();
                            } else if (obj instanceof Byte) {
                                i = ((Byte) obj).byteValue();
                            } else if (obj instanceof String) {
                                dVar.bindString(i2, (String) obj);
                            } else if (obj instanceof Boolean) {
                                j = ((Boolean) obj).booleanValue() ? 1 : 0;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Cannot bind ");
                                sb.append(obj);
                                sb.append(" at index ");
                                sb.append(i2);
                                sb.append(" Supported types: null, byte[], float, double, long, int, short, byte, string");
                                throw new IllegalArgumentException(sb.toString());
                            }
                            j = (long) i;
                        }
                        dVar.bindLong(i2, j);
                    }
                    dVar.bindDouble(i2, d);
                }
            }
        }
    }
}
