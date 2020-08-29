package p425x.p472b.p473a.p474a.p476l.p478l;

/* renamed from: x.b.a.a.l.l.b */
public class C5221b {

    /* renamed from: a */
    public C5222c f12432a;

    /* renamed from: b */
    public String f12433b;

    /* renamed from: c */
    public boolean f12434c;

    /* renamed from: d */
    public long f12435d;

    public C5221b(C5222c cVar, String str, boolean z, long j) {
        this.f12432a = cVar;
        this.f12433b = str;
        this.f12434c = z;
        this.f12435d = j;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C5221b.class != obj.getClass()) {
            return false;
        }
        C5221b bVar = (C5221b) obj;
        if (this.f12434c != bVar.f12434c || this.f12435d != bVar.f12435d || this.f12432a != bVar.f12432a) {
            return false;
        }
        String str = this.f12433b;
        String str2 = bVar.f12433b;
        if (str != null) {
            z = str.equals(str2);
        } else if (str2 != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = this.f12432a.hashCode() * 31;
        String str = this.f12433b;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + (this.f12434c ? 1 : 0)) * 31;
        long j = this.f12435d;
        return hashCode2 + ((int) (j ^ (j >>> 32)));
    }
}
