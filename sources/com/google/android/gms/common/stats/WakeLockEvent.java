package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;
import p124p.p126b.p127k.C1061o;
import p213q.p217b.p218a.p231b.p239d.p245p.C2281e;

public final class WakeLockEvent extends StatsEvent {
    public static final Creator<WakeLockEvent> CREATOR = new C2281e();

    /* renamed from: e */
    public final int f1076e;

    /* renamed from: f */
    public final long f1077f;

    /* renamed from: g */
    public int f1078g;

    /* renamed from: h */
    public final String f1079h;

    /* renamed from: i */
    public final String f1080i;

    /* renamed from: j */
    public final String f1081j;

    /* renamed from: k */
    public final int f1082k;

    /* renamed from: l */
    public final List<String> f1083l;

    /* renamed from: m */
    public final String f1084m;

    /* renamed from: n */
    public final long f1085n;

    /* renamed from: o */
    public int f1086o;

    /* renamed from: p */
    public final String f1087p;

    /* renamed from: q */
    public final float f1088q;

    /* renamed from: r */
    public final long f1089r;

    /* renamed from: s */
    public final boolean f1090s;

    /* renamed from: t */
    public long f1091t = -1;

    public WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.f1076e = i;
        this.f1077f = j;
        this.f1078g = i2;
        this.f1079h = str;
        this.f1080i = str3;
        this.f1081j = str5;
        this.f1082k = i3;
        this.f1083l = list;
        this.f1084m = str2;
        this.f1085n = j2;
        this.f1086o = i4;
        this.f1087p = str4;
        this.f1088q = f;
        this.f1089r = j3;
        this.f1090s = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1061o.m2436a(parcel);
        C1061o.m2480a(parcel, 1, this.f1076e);
        C1061o.m2481a(parcel, 2, this.f1077f);
        C1061o.m2485a(parcel, 4, this.f1079h, false);
        C1061o.m2480a(parcel, 5, this.f1082k);
        C1061o.m2486a(parcel, 6, this.f1083l, false);
        C1061o.m2481a(parcel, 8, this.f1085n);
        C1061o.m2485a(parcel, 10, this.f1080i, false);
        C1061o.m2480a(parcel, 11, this.f1078g);
        C1061o.m2485a(parcel, 12, this.f1084m, false);
        C1061o.m2485a(parcel, 13, this.f1087p, false);
        C1061o.m2480a(parcel, 14, this.f1086o);
        float f = this.f1088q;
        C1061o.m2541c(parcel, 15, 4);
        parcel.writeFloat(f);
        C1061o.m2481a(parcel, 16, this.f1089r);
        C1061o.m2485a(parcel, 17, this.f1081j, false);
        C1061o.m2487a(parcel, 18, this.f1090s);
        C1061o.m2566n(parcel, a);
    }
}
