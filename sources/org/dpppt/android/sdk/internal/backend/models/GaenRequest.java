package org.dpppt.android.sdk.internal.backend.models;

import com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import p119o.p120a.C0967p0;

public class GaenRequest {
    public int delayedKeyDate;
    public int fake;
    public List<GaenKey> gaenKeys;

    public GaenRequest(List<TemporaryExposureKey> list, int i) {
        ArrayList arrayList = new ArrayList();
        int a = C0967p0.m2170a(System.currentTimeMillis());
        for (TemporaryExposureKey temporaryExposureKey : list) {
            arrayList.add(new GaenKey(C0967p0.m2252e(temporaryExposureKey.mo1628c()), Integer.valueOf(temporaryExposureKey.f1128f), Integer.valueOf(temporaryExposureKey.f1130h), Integer.valueOf(temporaryExposureKey.f1129g)));
            a = Math.min(a, temporaryExposureKey.f1128f);
        }
        SecureRandom secureRandom = new SecureRandom();
        while (arrayList.size() < 14) {
            byte[] bArr = new byte[16];
            secureRandom.nextBytes(bArr);
            a -= 144;
            GaenKey gaenKey = new GaenKey(C0967p0.m2252e(bArr), Integer.valueOf(a), Integer.valueOf(144), Integer.valueOf(0), 1);
            arrayList.add(gaenKey);
        }
        this.gaenKeys = arrayList;
        this.delayedKeyDate = i;
        this.fake = 0;
    }

    public List<GaenKey> getGaenKeys() {
        return this.gaenKeys;
    }

    public Integer isFake() {
        return Integer.valueOf(this.fake);
    }

    public void setFake(Integer num) {
        this.fake = num.intValue();
    }

    public void setGaenKeys(List<GaenKey> list) {
        this.gaenKeys = list;
    }
}
