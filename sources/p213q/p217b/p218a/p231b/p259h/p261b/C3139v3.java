package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p213q.p217b.p218a.p231b.p251g.p256e.C2338a;
import p213q.p217b.p218a.p231b.p251g.p256e.C2724w;

/* renamed from: q.b.a.b.h.b.v3 */
public final class C3139v3 extends C2338a implements C3117t3 {
    public C3139v3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: a */
    public final List<C2998ia> mo8498a(String str, String str2, String str3) {
        Parcel d = mo7348d();
        d.writeString(str);
        d.writeString(str2);
        d.writeString(str3);
        Parcel a = mo7345a(17, d);
        ArrayList createTypedArrayList = a.createTypedArrayList(C2998ia.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<C3112s9> mo8499a(String str, String str2, String str3, boolean z) {
        Parcel d = mo7348d();
        d.writeString(str);
        d.writeString(str2);
        d.writeString(str3);
        C2724w.m6507a(d, z);
        Parcel a = mo7345a(15, d);
        ArrayList createTypedArrayList = a.createTypedArrayList(C3112s9.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<C2998ia> mo8500a(String str, String str2, C3189z9 z9Var) {
        Parcel d = mo7348d();
        d.writeString(str);
        d.writeString(str2);
        C2724w.m6506a(d, (Parcelable) z9Var);
        Parcel a = mo7345a(16, d);
        ArrayList createTypedArrayList = a.createTypedArrayList(C2998ia.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<C3112s9> mo8501a(String str, String str2, boolean z, C3189z9 z9Var) {
        Parcel d = mo7348d();
        d.writeString(str);
        d.writeString(str2);
        C2724w.m6507a(d, z);
        C2724w.m6506a(d, (Parcelable) z9Var);
        Parcel a = mo7345a(14, d);
        ArrayList createTypedArrayList = a.createTypedArrayList(C3112s9.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<C3112s9> mo8502a(C3189z9 z9Var, boolean z) {
        Parcel d = mo7348d();
        C2724w.m6506a(d, (Parcelable) z9Var);
        d.writeInt(z ? 1 : 0);
        Parcel a = mo7345a(7, d);
        ArrayList createTypedArrayList = a.createTypedArrayList(C3112s9.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final void mo8503a(long j, String str, String str2, String str3) {
        Parcel d = mo7348d();
        d.writeLong(j);
        d.writeString(str);
        d.writeString(str2);
        d.writeString(str3);
        mo7347b(10, d);
    }

    /* renamed from: a */
    public final void mo8504a(Bundle bundle, C3189z9 z9Var) {
        Parcel d = mo7348d();
        C2724w.m6506a(d, (Parcelable) bundle);
        C2724w.m6506a(d, (Parcelable) z9Var);
        mo7347b(19, d);
    }

    /* renamed from: a */
    public final void mo8507a(C2998ia iaVar) {
        Parcel d = mo7348d();
        C2724w.m6506a(d, (Parcelable) iaVar);
        mo7347b(13, d);
    }

    /* renamed from: a */
    public final void mo8508a(C2998ia iaVar, C3189z9 z9Var) {
        Parcel d = mo7348d();
        C2724w.m6506a(d, (Parcelable) iaVar);
        C2724w.m6506a(d, (Parcelable) z9Var);
        mo7347b(12, d);
    }

    /* renamed from: a */
    public final void mo8509a(C3047n nVar, String str, String str2) {
        Parcel d = mo7348d();
        C2724w.m6506a(d, (Parcelable) nVar);
        d.writeString(str);
        d.writeString(str2);
        mo7347b(5, d);
    }

    /* renamed from: a */
    public final void mo8510a(C3047n nVar, C3189z9 z9Var) {
        Parcel d = mo7348d();
        C2724w.m6506a(d, (Parcelable) nVar);
        C2724w.m6506a(d, (Parcelable) z9Var);
        mo7347b(1, d);
    }

    /* renamed from: a */
    public final void mo8511a(C3112s9 s9Var, C3189z9 z9Var) {
        Parcel d = mo7348d();
        C2724w.m6506a(d, (Parcelable) s9Var);
        C2724w.m6506a(d, (Parcelable) z9Var);
        mo7347b(2, d);
    }

    /* renamed from: a */
    public final void mo8512a(C3189z9 z9Var) {
        Parcel d = mo7348d();
        C2724w.m6506a(d, (Parcelable) z9Var);
        mo7347b(4, d);
    }

    /* renamed from: a */
    public final byte[] mo8513a(C3047n nVar, String str) {
        Parcel d = mo7348d();
        C2724w.m6506a(d, (Parcelable) nVar);
        d.writeString(str);
        Parcel a = mo7345a(9, d);
        byte[] createByteArray = a.createByteArray();
        a.recycle();
        return createByteArray;
    }

    /* renamed from: b */
    public final void mo8514b(C3189z9 z9Var) {
        Parcel d = mo7348d();
        C2724w.m6506a(d, (Parcelable) z9Var);
        mo7347b(6, d);
    }

    /* renamed from: c */
    public final String mo8515c(C3189z9 z9Var) {
        Parcel d = mo7348d();
        C2724w.m6506a(d, (Parcelable) z9Var);
        Parcel a = mo7345a(11, d);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: d */
    public final void mo8516d(C3189z9 z9Var) {
        Parcel d = mo7348d();
        C2724w.m6506a(d, (Parcelable) z9Var);
        mo7347b(18, d);
    }
}
