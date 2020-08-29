package p213q.p217b.p218a.p231b.p259h.p261b;

import p213q.p217b.p218a.p231b.p251g.p256e.C2677t0;

/* renamed from: q.b.a.b.h.b.s3 */
public abstract class C3106s3 extends C2677t0 implements C3117t3 {
    public C3106s3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00f7, code lost:
        r9.writeNoException();
        r9.writeTypedList(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0151, code lost:
        r9.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0154, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7410a(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        /*
            r6 = this;
            r10 = 1
            r0 = 0
            switch(r7) {
                case 1: goto L_0x013e;
                case 2: goto L_0x012a;
                case 3: goto L_0x0005;
                case 4: goto L_0x011e;
                case 5: goto L_0x010a;
                case 6: goto L_0x00fe;
                case 7: goto L_0x00e4;
                case 8: goto L_0x0005;
                case 9: goto L_0x00cc;
                case 10: goto L_0x00b6;
                case 11: goto L_0x00a2;
                case 12: goto L_0x008d;
                case 13: goto L_0x0080;
                case 14: goto L_0x0066;
                case 15: goto L_0x0050;
                case 16: goto L_0x003a;
                case 17: goto L_0x0028;
                case 18: goto L_0x001b;
                case 19: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return r0
        L_0x0006:
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2724w.m6504a(r8, r7)
            android.os.Bundle r7 = (android.os.Bundle) r7
            android.os.Parcelable$Creator<q.b.a.b.h.b.z9> r0 = p213q.p217b.p218a.p231b.p259h.p261b.C3189z9.CREATOR
            android.os.Parcelable r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2724w.m6504a(r8, r0)
            q.b.a.b.h.b.z9 r8 = (p213q.p217b.p218a.p231b.p259h.p261b.C3189z9) r8
            r6.mo8504a(r7, r8)
            goto L_0x0151
        L_0x001b:
            android.os.Parcelable$Creator<q.b.a.b.h.b.z9> r7 = p213q.p217b.p218a.p231b.p259h.p261b.C3189z9.CREATOR
            android.os.Parcelable r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2724w.m6504a(r8, r7)
            q.b.a.b.h.b.z9 r7 = (p213q.p217b.p218a.p231b.p259h.p261b.C3189z9) r7
            r6.mo8516d(r7)
            goto L_0x0151
        L_0x0028:
            java.lang.String r7 = r8.readString()
            java.lang.String r0 = r8.readString()
            java.lang.String r8 = r8.readString()
            java.util.List r7 = r6.mo8498a(r7, r0, r8)
            goto L_0x00f7
        L_0x003a:
            java.lang.String r7 = r8.readString()
            java.lang.String r0 = r8.readString()
            android.os.Parcelable$Creator<q.b.a.b.h.b.z9> r1 = p213q.p217b.p218a.p231b.p259h.p261b.C3189z9.CREATOR
            android.os.Parcelable r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2724w.m6504a(r8, r1)
            q.b.a.b.h.b.z9 r8 = (p213q.p217b.p218a.p231b.p259h.p261b.C3189z9) r8
            java.util.List r7 = r6.mo8500a(r7, r0, r8)
            goto L_0x00f7
        L_0x0050:
            java.lang.String r7 = r8.readString()
            java.lang.String r0 = r8.readString()
            java.lang.String r1 = r8.readString()
            boolean r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2724w.m6508a(r8)
            java.util.List r7 = r6.mo8499a(r7, r0, r1, r8)
            goto L_0x00f7
        L_0x0066:
            java.lang.String r7 = r8.readString()
            java.lang.String r0 = r8.readString()
            boolean r1 = p213q.p217b.p218a.p231b.p251g.p256e.C2724w.m6508a(r8)
            android.os.Parcelable$Creator<q.b.a.b.h.b.z9> r2 = p213q.p217b.p218a.p231b.p259h.p261b.C3189z9.CREATOR
            android.os.Parcelable r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2724w.m6504a(r8, r2)
            q.b.a.b.h.b.z9 r8 = (p213q.p217b.p218a.p231b.p259h.p261b.C3189z9) r8
            java.util.List r7 = r6.mo8501a(r7, r0, r1, r8)
            goto L_0x00f7
        L_0x0080:
            android.os.Parcelable$Creator<q.b.a.b.h.b.ia> r7 = p213q.p217b.p218a.p231b.p259h.p261b.C2998ia.CREATOR
            android.os.Parcelable r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2724w.m6504a(r8, r7)
            q.b.a.b.h.b.ia r7 = (p213q.p217b.p218a.p231b.p259h.p261b.C2998ia) r7
            r6.mo8507a(r7)
            goto L_0x0151
        L_0x008d:
            android.os.Parcelable$Creator<q.b.a.b.h.b.ia> r7 = p213q.p217b.p218a.p231b.p259h.p261b.C2998ia.CREATOR
            android.os.Parcelable r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2724w.m6504a(r8, r7)
            q.b.a.b.h.b.ia r7 = (p213q.p217b.p218a.p231b.p259h.p261b.C2998ia) r7
            android.os.Parcelable$Creator<q.b.a.b.h.b.z9> r0 = p213q.p217b.p218a.p231b.p259h.p261b.C3189z9.CREATOR
            android.os.Parcelable r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2724w.m6504a(r8, r0)
            q.b.a.b.h.b.z9 r8 = (p213q.p217b.p218a.p231b.p259h.p261b.C3189z9) r8
            r6.mo8508a(r7, r8)
            goto L_0x0151
        L_0x00a2:
            android.os.Parcelable$Creator<q.b.a.b.h.b.z9> r7 = p213q.p217b.p218a.p231b.p259h.p261b.C3189z9.CREATOR
            android.os.Parcelable r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2724w.m6504a(r8, r7)
            q.b.a.b.h.b.z9 r7 = (p213q.p217b.p218a.p231b.p259h.p261b.C3189z9) r7
            java.lang.String r7 = r6.mo8515c(r7)
            r9.writeNoException()
            r9.writeString(r7)
            goto L_0x0154
        L_0x00b6:
            long r1 = r8.readLong()
            java.lang.String r3 = r8.readString()
            java.lang.String r4 = r8.readString()
            java.lang.String r5 = r8.readString()
            r0 = r6
            r0.mo8503a(r1, r3, r4, r5)
            goto L_0x0151
        L_0x00cc:
            android.os.Parcelable$Creator<q.b.a.b.h.b.n> r7 = p213q.p217b.p218a.p231b.p259h.p261b.C3047n.CREATOR
            android.os.Parcelable r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2724w.m6504a(r8, r7)
            q.b.a.b.h.b.n r7 = (p213q.p217b.p218a.p231b.p259h.p261b.C3047n) r7
            java.lang.String r8 = r8.readString()
            byte[] r7 = r6.mo8513a(r7, r8)
            r9.writeNoException()
            r9.writeByteArray(r7)
            goto L_0x0154
        L_0x00e4:
            android.os.Parcelable$Creator<q.b.a.b.h.b.z9> r7 = p213q.p217b.p218a.p231b.p259h.p261b.C3189z9.CREATOR
            android.os.Parcelable r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2724w.m6504a(r8, r7)
            q.b.a.b.h.b.z9 r7 = (p213q.p217b.p218a.p231b.p259h.p261b.C3189z9) r7
            int r8 = r8.readInt()
            if (r8 == 0) goto L_0x00f3
            r0 = r10
        L_0x00f3:
            java.util.List r7 = r6.mo8502a(r7, r0)
        L_0x00f7:
            r9.writeNoException()
            r9.writeTypedList(r7)
            goto L_0x0154
        L_0x00fe:
            android.os.Parcelable$Creator<q.b.a.b.h.b.z9> r7 = p213q.p217b.p218a.p231b.p259h.p261b.C3189z9.CREATOR
            android.os.Parcelable r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2724w.m6504a(r8, r7)
            q.b.a.b.h.b.z9 r7 = (p213q.p217b.p218a.p231b.p259h.p261b.C3189z9) r7
            r6.mo8514b(r7)
            goto L_0x0151
        L_0x010a:
            android.os.Parcelable$Creator<q.b.a.b.h.b.n> r7 = p213q.p217b.p218a.p231b.p259h.p261b.C3047n.CREATOR
            android.os.Parcelable r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2724w.m6504a(r8, r7)
            q.b.a.b.h.b.n r7 = (p213q.p217b.p218a.p231b.p259h.p261b.C3047n) r7
            java.lang.String r0 = r8.readString()
            java.lang.String r8 = r8.readString()
            r6.mo8509a(r7, r0, r8)
            goto L_0x0151
        L_0x011e:
            android.os.Parcelable$Creator<q.b.a.b.h.b.z9> r7 = p213q.p217b.p218a.p231b.p259h.p261b.C3189z9.CREATOR
            android.os.Parcelable r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2724w.m6504a(r8, r7)
            q.b.a.b.h.b.z9 r7 = (p213q.p217b.p218a.p231b.p259h.p261b.C3189z9) r7
            r6.mo8512a(r7)
            goto L_0x0151
        L_0x012a:
            android.os.Parcelable$Creator<q.b.a.b.h.b.s9> r7 = p213q.p217b.p218a.p231b.p259h.p261b.C3112s9.CREATOR
            android.os.Parcelable r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2724w.m6504a(r8, r7)
            q.b.a.b.h.b.s9 r7 = (p213q.p217b.p218a.p231b.p259h.p261b.C3112s9) r7
            android.os.Parcelable$Creator<q.b.a.b.h.b.z9> r0 = p213q.p217b.p218a.p231b.p259h.p261b.C3189z9.CREATOR
            android.os.Parcelable r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2724w.m6504a(r8, r0)
            q.b.a.b.h.b.z9 r8 = (p213q.p217b.p218a.p231b.p259h.p261b.C3189z9) r8
            r6.mo8511a(r7, r8)
            goto L_0x0151
        L_0x013e:
            android.os.Parcelable$Creator<q.b.a.b.h.b.n> r7 = p213q.p217b.p218a.p231b.p259h.p261b.C3047n.CREATOR
            android.os.Parcelable r7 = p213q.p217b.p218a.p231b.p251g.p256e.C2724w.m6504a(r8, r7)
            q.b.a.b.h.b.n r7 = (p213q.p217b.p218a.p231b.p259h.p261b.C3047n) r7
            android.os.Parcelable$Creator<q.b.a.b.h.b.z9> r0 = p213q.p217b.p218a.p231b.p259h.p261b.C3189z9.CREATOR
            android.os.Parcelable r8 = p213q.p217b.p218a.p231b.p251g.p256e.C2724w.m6504a(r8, r0)
            q.b.a.b.h.b.z9 r8 = (p213q.p217b.p218a.p231b.p259h.p261b.C3189z9) r8
            r6.mo8510a(r7, r8)
        L_0x0151:
            r9.writeNoException()
        L_0x0154:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p213q.p217b.p218a.p231b.p259h.p261b.C3106s3.mo7410a(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
