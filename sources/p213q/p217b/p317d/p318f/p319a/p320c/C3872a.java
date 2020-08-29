package p213q.p217b.p317d.p318f.p319a.p320c;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p259h.p261b.C2946e6;
import p213q.p217b.p218a.p231b.p259h.p261b.C2970g6;

/* renamed from: q.b.d.f.a.c.a */
public final class C3872a {

    /* renamed from: a */
    public static final Set<String> f9481a = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));

    /* renamed from: b */
    public static final List<String> f9482b = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"});

    /* renamed from: c */
    public static final List<String> f9483c = Arrays.asList(new String[]{"auto", "app", "am"});

    /* renamed from: d */
    public static final List<String> f9484d = Arrays.asList(new String[]{"_r", "_dbg"});

    static {
        String[][] strArr = {C2970g6.f7358a, C2970g6.f7359b};
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            i += strArr[i2].length;
        }
        Object[] copyOf = Arrays.copyOf(strArr[0], i);
        int length = strArr[0].length;
        for (int i3 = 1; i3 < 2; i3++) {
            String[] strArr2 = strArr[i3];
            System.arraycopy(strArr2, 0, copyOf, length, strArr2.length);
            length += strArr2.length;
        }
        Arrays.asList((String[]) copyOf);
        Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});
    }

    /* renamed from: a */
    public static boolean m9248a(String str) {
        return !f9483c.contains(str);
    }

    /* renamed from: b */
    public static String m9249b(String str) {
        String a = C2286e.m5191a(str, C2946e6.f7282b, C2946e6.f7281a);
        return a != null ? a : str;
    }
}
