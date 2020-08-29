package p410v.p411m0.p413d;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p394o.C4574a;
import p392u.p401r.p403c.C4638h;
import p410v.C4722j;
import p410v.C4722j.C4724b;
import p410v.C4734m;
import p410v.C4734m.C4735a;
import p410v.p411m0.C4737b;

/* renamed from: v.m0.d.b */
public final class C4753b {

    /* renamed from: a */
    public int f11204a;

    /* renamed from: b */
    public boolean f11205b;

    /* renamed from: c */
    public boolean f11206c;

    /* renamed from: d */
    public final List<C4734m> f11207d;

    public C4753b(List<C4734m> list) {
        if (list != null) {
            this.f11207d = list;
        } else {
            C4638h.m10271a("connectionSpecs");
            throw null;
        }
    }

    /* renamed from: a */
    public final C4734m mo11107a(SSLSocket sSLSocket) {
        C4734m mVar;
        boolean z;
        String[] strArr;
        String[] strArr2;
        if (sSLSocket != null) {
            int i = this.f11204a;
            int size = this.f11207d.size();
            while (true) {
                if (i >= size) {
                    mVar = null;
                    break;
                }
                mVar = (C4734m) this.f11207d.get(i);
                if (mVar.mo11061a(sSLSocket)) {
                    this.f11204a = i + 1;
                    break;
                }
                i++;
            }
            if (mVar == null) {
                StringBuilder a = C1965a.m4756a("Unable to find acceptable protocols. isFallback=");
                a.append(this.f11206c);
                a.append(',');
                a.append(" modes=");
                a.append(this.f11207d);
                a.append(',');
                a.append(" supported protocols=");
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                if (enabledProtocols == null) {
                    C4638h.m10269a();
                    throw null;
                }
                String arrays = Arrays.toString(enabledProtocols);
                C4638h.m10270a((Object) arrays, "java.util.Arrays.toString(this)");
                a.append(arrays);
                throw new UnknownServiceException(a.toString());
            }
            int i2 = this.f11204a;
            int size2 = this.f11207d.size();
            while (true) {
                if (i2 >= size2) {
                    z = false;
                    break;
                } else if (((C4734m) this.f11207d.get(i2)).mo11061a(sSLSocket)) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f11205b = z;
            boolean z2 = this.f11206c;
            if (mVar.f11133c != null) {
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                C4638h.m10270a((Object) enabledCipherSuites, "sslSocket.enabledCipherSuites");
                String[] strArr3 = mVar.f11133c;
                C4724b bVar = C4722j.f11104t;
                strArr = C4737b.m10476b(enabledCipherSuites, strArr3, C4722j.f11086b);
            } else {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            if (mVar.f11134d != null) {
                String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
                C4638h.m10270a((Object) enabledProtocols2, "sslSocket.enabledProtocols");
                strArr2 = C4737b.m10476b(enabledProtocols2, mVar.f11134d, (Comparator<? super String>) C4574a.f10782e);
            } else {
                strArr2 = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            C4638h.m10270a((Object) supportedCipherSuites, "supportedCipherSuites");
            C4724b bVar2 = C4722j.f11104t;
            int a2 = C4737b.m10452a(supportedCipherSuites, "TLS_FALLBACK_SCSV", C4722j.f11086b);
            String str = "cipherSuitesIntersection";
            if (z2 && a2 != -1) {
                C4638h.m10270a((Object) strArr, str);
                String str2 = supportedCipherSuites[a2];
                C4638h.m10270a((Object) str2, "supportedCipherSuites[indexOfFallbackScsv]");
                Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
                C4638h.m10270a((Object) copyOf, "java.util.Arrays.copyOf(this, newSize)");
                strArr = (String[]) copyOf;
                strArr[strArr.length - 1] = str2;
            }
            C4735a aVar = new C4735a(mVar);
            C4638h.m10270a((Object) strArr, str);
            aVar.mo11067a((String[]) Arrays.copyOf(strArr, strArr.length));
            C4638h.m10270a((Object) strArr2, "tlsVersionsIntersection");
            aVar.mo11071b((String[]) Arrays.copyOf(strArr2, strArr2.length));
            C4734m a3 = aVar.mo11070a();
            if (a3.mo11062b() != null) {
                sSLSocket.setEnabledProtocols(a3.f11134d);
            }
            if (a3.mo11060a() != null) {
                sSLSocket.setEnabledCipherSuites(a3.f11133c);
            }
            return mVar;
        }
        C4638h.m10271a("sslSocket");
        throw null;
    }
}
