package p213q.p217b.p218a.p219a.p220e.p221b;

import android.util.SparseArray;

/* renamed from: q.b.a.a.e.b.o */
public abstract class C1994o {

    /* renamed from: q.b.a.a.e.b.o$a */
    public enum C1995a {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: A */
        public static final SparseArray<C1995a> f5685A = null;

        /* renamed from: e */
        public final int f5707e;

        /* access modifiers changed from: public */
        static {
            UNKNOWN_MOBILE_SUBTYPE = new C1995a("UNKNOWN_MOBILE_SUBTYPE", 0, 0);
            GPRS = new C1995a("GPRS", 1, 1);
            EDGE = new C1995a("EDGE", 2, 2);
            UMTS = new C1995a("UMTS", 3, 3);
            CDMA = new C1995a("CDMA", 4, 4);
            EVDO_0 = new C1995a("EVDO_0", 5, 5);
            EVDO_A = new C1995a("EVDO_A", 6, 6);
            RTT = new C1995a("RTT", 7, 7);
            HSDPA = new C1995a("HSDPA", 8, 8);
            HSUPA = new C1995a("HSUPA", 9, 9);
            HSPA = new C1995a("HSPA", 10, 10);
            IDEN = new C1995a("IDEN", 11, 11);
            EVDO_B = new C1995a("EVDO_B", 12, 12);
            LTE = new C1995a("LTE", 13, 13);
            EHRPD = new C1995a("EHRPD", 14, 14);
            HSPAP = new C1995a("HSPAP", 15, 15);
            GSM = new C1995a("GSM", 16, 16);
            TD_SCDMA = new C1995a("TD_SCDMA", 17, 17);
            IWLAN = new C1995a("IWLAN", 18, 18);
            LTE_CA = new C1995a("LTE_CA", 19, 19);
            COMBINED = new C1995a("COMBINED", 20, 100);
            SparseArray<C1995a> sparseArray = new SparseArray<>();
            f5685A = sparseArray;
            sparseArray.put(0, UNKNOWN_MOBILE_SUBTYPE);
            f5685A.put(1, GPRS);
            f5685A.put(2, EDGE);
            f5685A.put(3, UMTS);
            f5685A.put(4, CDMA);
            f5685A.put(5, EVDO_0);
            f5685A.put(6, EVDO_A);
            f5685A.put(7, RTT);
            f5685A.put(8, HSDPA);
            f5685A.put(9, HSUPA);
            f5685A.put(10, HSPA);
            f5685A.put(11, IDEN);
            f5685A.put(12, EVDO_B);
            f5685A.put(13, LTE);
            f5685A.put(14, EHRPD);
            f5685A.put(15, HSPAP);
            f5685A.put(16, GSM);
            f5685A.put(17, TD_SCDMA);
            f5685A.put(18, IWLAN);
            f5685A.put(19, LTE_CA);
        }

        /* access modifiers changed from: public */
        C1995a(int i) {
            this.f5707e = i;
        }
    }

    /* renamed from: q.b.a.a.e.b.o$b */
    public enum C1996b {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        

        /* renamed from: y */
        public static final SparseArray<C1996b> f5727y = null;

        /* renamed from: e */
        public final int f5728e;

        /* access modifiers changed from: public */
        static {
            MOBILE = new C1996b("MOBILE", 0, 0);
            WIFI = new C1996b("WIFI", 1, 1);
            MOBILE_MMS = new C1996b("MOBILE_MMS", 2, 2);
            MOBILE_SUPL = new C1996b("MOBILE_SUPL", 3, 3);
            MOBILE_DUN = new C1996b("MOBILE_DUN", 4, 4);
            MOBILE_HIPRI = new C1996b("MOBILE_HIPRI", 5, 5);
            WIMAX = new C1996b("WIMAX", 6, 6);
            BLUETOOTH = new C1996b("BLUETOOTH", 7, 7);
            DUMMY = new C1996b("DUMMY", 8, 8);
            ETHERNET = new C1996b("ETHERNET", 9, 9);
            MOBILE_FOTA = new C1996b("MOBILE_FOTA", 10, 10);
            MOBILE_IMS = new C1996b("MOBILE_IMS", 11, 11);
            MOBILE_CBS = new C1996b("MOBILE_CBS", 12, 12);
            WIFI_P2P = new C1996b("WIFI_P2P", 13, 13);
            MOBILE_IA = new C1996b("MOBILE_IA", 14, 14);
            MOBILE_EMERGENCY = new C1996b("MOBILE_EMERGENCY", 15, 15);
            PROXY = new C1996b("PROXY", 16, 16);
            VPN = new C1996b("VPN", 17, 17);
            NONE = new C1996b("NONE", 18, -1);
            SparseArray<C1996b> sparseArray = new SparseArray<>();
            f5727y = sparseArray;
            sparseArray.put(0, MOBILE);
            f5727y.put(1, WIFI);
            f5727y.put(2, MOBILE_MMS);
            f5727y.put(3, MOBILE_SUPL);
            f5727y.put(4, MOBILE_DUN);
            f5727y.put(5, MOBILE_HIPRI);
            f5727y.put(6, WIMAX);
            f5727y.put(7, BLUETOOTH);
            f5727y.put(8, DUMMY);
            f5727y.put(9, ETHERNET);
            f5727y.put(10, MOBILE_FOTA);
            f5727y.put(11, MOBILE_IMS);
            f5727y.put(12, MOBILE_CBS);
            f5727y.put(13, WIFI_P2P);
            f5727y.put(14, MOBILE_IA);
            f5727y.put(15, MOBILE_EMERGENCY);
            f5727y.put(16, PROXY);
            f5727y.put(17, VPN);
            f5727y.put(-1, NONE);
        }

        /* access modifiers changed from: public */
        C1996b(int i) {
            this.f5728e = i;
        }
    }
}
