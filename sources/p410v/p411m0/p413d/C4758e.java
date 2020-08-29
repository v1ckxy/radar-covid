package p410v.p411m0.p413d;

import java.net.Proxy.Type;
import p410v.p411m0.p416g.C4790b;

/* renamed from: v.m0.d.e */
public final /* synthetic */ class C4758e {

    /* renamed from: a */
    public static final /* synthetic */ int[] f11234a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f11235b;

    static {
        int[] iArr = new int[Type.values().length];
        f11234a = iArr;
        iArr[Type.DIRECT.ordinal()] = 1;
        f11234a[Type.HTTP.ordinal()] = 2;
        int[] iArr2 = new int[C4790b.values().length];
        f11235b = iArr2;
        C4790b bVar = C4790b.REFUSED_STREAM;
        iArr2[4] = 1;
        int[] iArr3 = f11235b;
        C4790b bVar2 = C4790b.CANCEL;
        iArr3[5] = 2;
    }
}
