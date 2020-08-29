package p213q.p217b.p218a.p231b.p251g.p256e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import p213q.p217b.p218a.p231b.p249e.C2303a;

/* renamed from: q.b.a.b.g.e.qe */
public final class C2643qe extends C2338a implements C2606oe {
    public C2643qe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) {
        Parcel d = mo7348d();
        d.writeString(str);
        d.writeLong(j);
        mo7347b(23, d);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel d = mo7348d();
        d.writeString(str);
        d.writeString(str2);
        C2724w.m6506a(d, (Parcelable) bundle);
        mo7347b(9, d);
    }

    public final void endAdUnitExposure(String str, long j) {
        Parcel d = mo7348d();
        d.writeString(str);
        d.writeLong(j);
        mo7347b(24, d);
    }

    public final void generateEventId(C2626pe peVar) {
        Parcel d = mo7348d();
        C2724w.m6505a(d, (IInterface) peVar);
        mo7347b(22, d);
    }

    public final void getAppInstanceId(C2626pe peVar) {
        Parcel d = mo7348d();
        C2724w.m6505a(d, (IInterface) peVar);
        mo7347b(20, d);
    }

    public final void getCachedAppInstanceId(C2626pe peVar) {
        Parcel d = mo7348d();
        C2724w.m6505a(d, (IInterface) peVar);
        mo7347b(19, d);
    }

    public final void getConditionalUserProperties(String str, String str2, C2626pe peVar) {
        Parcel d = mo7348d();
        d.writeString(str);
        d.writeString(str2);
        C2724w.m6505a(d, (IInterface) peVar);
        mo7347b(10, d);
    }

    public final void getCurrentScreenClass(C2626pe peVar) {
        Parcel d = mo7348d();
        C2724w.m6505a(d, (IInterface) peVar);
        mo7347b(17, d);
    }

    public final void getCurrentScreenName(C2626pe peVar) {
        Parcel d = mo7348d();
        C2724w.m6505a(d, (IInterface) peVar);
        mo7347b(16, d);
    }

    public final void getGmpAppId(C2626pe peVar) {
        Parcel d = mo7348d();
        C2724w.m6505a(d, (IInterface) peVar);
        mo7347b(21, d);
    }

    public final void getMaxUserProperties(String str, C2626pe peVar) {
        Parcel d = mo7348d();
        d.writeString(str);
        C2724w.m6505a(d, (IInterface) peVar);
        mo7347b(6, d);
    }

    public final void getTestFlag(C2626pe peVar, int i) {
        Parcel d = mo7348d();
        C2724w.m6505a(d, (IInterface) peVar);
        d.writeInt(i);
        mo7347b(38, d);
    }

    public final void getUserProperties(String str, String str2, boolean z, C2626pe peVar) {
        Parcel d = mo7348d();
        d.writeString(str);
        d.writeString(str2);
        C2724w.m6507a(d, z);
        C2724w.m6505a(d, (IInterface) peVar);
        mo7347b(5, d);
    }

    public final void initForTests(Map map) {
        Parcel d = mo7348d();
        d.writeMap(map);
        mo7347b(37, d);
    }

    public final void initialize(C2303a aVar, C2427f fVar, long j) {
        Parcel d = mo7348d();
        C2724w.m6505a(d, (IInterface) aVar);
        C2724w.m6506a(d, (Parcelable) fVar);
        d.writeLong(j);
        mo7347b(1, d);
    }

    public final void isDataCollectionEnabled(C2626pe peVar) {
        Parcel d = mo7348d();
        C2724w.m6505a(d, (IInterface) peVar);
        mo7347b(40, d);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel d = mo7348d();
        d.writeString(str);
        d.writeString(str2);
        C2724w.m6506a(d, (Parcelable) bundle);
        d.writeInt(z ? 1 : 0);
        d.writeInt(z2 ? 1 : 0);
        d.writeLong(j);
        mo7347b(2, d);
    }

    public final void logEventAndBundle(String str, String str2, Bundle bundle, C2626pe peVar, long j) {
        Parcel d = mo7348d();
        d.writeString(str);
        d.writeString(str2);
        C2724w.m6506a(d, (Parcelable) bundle);
        C2724w.m6505a(d, (IInterface) peVar);
        d.writeLong(j);
        mo7347b(3, d);
    }

    public final void logHealthData(int i, String str, C2303a aVar, C2303a aVar2, C2303a aVar3) {
        Parcel d = mo7348d();
        d.writeInt(i);
        d.writeString(str);
        C2724w.m6505a(d, (IInterface) aVar);
        C2724w.m6505a(d, (IInterface) aVar2);
        C2724w.m6505a(d, (IInterface) aVar3);
        mo7347b(33, d);
    }

    public final void onActivityCreated(C2303a aVar, Bundle bundle, long j) {
        Parcel d = mo7348d();
        C2724w.m6505a(d, (IInterface) aVar);
        C2724w.m6506a(d, (Parcelable) bundle);
        d.writeLong(j);
        mo7347b(27, d);
    }

    public final void onActivityDestroyed(C2303a aVar, long j) {
        Parcel d = mo7348d();
        C2724w.m6505a(d, (IInterface) aVar);
        d.writeLong(j);
        mo7347b(28, d);
    }

    public final void onActivityPaused(C2303a aVar, long j) {
        Parcel d = mo7348d();
        C2724w.m6505a(d, (IInterface) aVar);
        d.writeLong(j);
        mo7347b(29, d);
    }

    public final void onActivityResumed(C2303a aVar, long j) {
        Parcel d = mo7348d();
        C2724w.m6505a(d, (IInterface) aVar);
        d.writeLong(j);
        mo7347b(30, d);
    }

    public final void onActivitySaveInstanceState(C2303a aVar, C2626pe peVar, long j) {
        Parcel d = mo7348d();
        C2724w.m6505a(d, (IInterface) aVar);
        C2724w.m6505a(d, (IInterface) peVar);
        d.writeLong(j);
        mo7347b(31, d);
    }

    public final void onActivityStarted(C2303a aVar, long j) {
        Parcel d = mo7348d();
        C2724w.m6505a(d, (IInterface) aVar);
        d.writeLong(j);
        mo7347b(25, d);
    }

    public final void onActivityStopped(C2303a aVar, long j) {
        Parcel d = mo7348d();
        C2724w.m6505a(d, (IInterface) aVar);
        d.writeLong(j);
        mo7347b(26, d);
    }

    public final void performAction(Bundle bundle, C2626pe peVar, long j) {
        Parcel d = mo7348d();
        C2724w.m6506a(d, (Parcelable) bundle);
        C2724w.m6505a(d, (IInterface) peVar);
        d.writeLong(j);
        mo7347b(32, d);
    }

    public final void registerOnMeasurementEventListener(C2376c cVar) {
        Parcel d = mo7348d();
        C2724w.m6505a(d, (IInterface) cVar);
        mo7347b(35, d);
    }

    public final void resetAnalyticsData(long j) {
        Parcel d = mo7348d();
        d.writeLong(j);
        mo7347b(12, d);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel d = mo7348d();
        C2724w.m6506a(d, (Parcelable) bundle);
        d.writeLong(j);
        mo7347b(8, d);
    }

    public final void setCurrentScreen(C2303a aVar, String str, String str2, long j) {
        Parcel d = mo7348d();
        C2724w.m6505a(d, (IInterface) aVar);
        d.writeString(str);
        d.writeString(str2);
        d.writeLong(j);
        mo7347b(15, d);
    }

    public final void setDataCollectionEnabled(boolean z) {
        Parcel d = mo7348d();
        C2724w.m6507a(d, z);
        mo7347b(39, d);
    }

    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel d = mo7348d();
        C2724w.m6506a(d, (Parcelable) bundle);
        mo7347b(42, d);
    }

    public final void setEventInterceptor(C2376c cVar) {
        Parcel d = mo7348d();
        C2724w.m6505a(d, (IInterface) cVar);
        mo7347b(34, d);
    }

    public final void setInstanceIdProvider(C2393d dVar) {
        Parcel d = mo7348d();
        C2724w.m6505a(d, (IInterface) dVar);
        mo7347b(18, d);
    }

    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel d = mo7348d();
        C2724w.m6507a(d, z);
        d.writeLong(j);
        mo7347b(11, d);
    }

    public final void setMinimumSessionDuration(long j) {
        Parcel d = mo7348d();
        d.writeLong(j);
        mo7347b(13, d);
    }

    public final void setSessionTimeoutDuration(long j) {
        Parcel d = mo7348d();
        d.writeLong(j);
        mo7347b(14, d);
    }

    public final void setUserId(String str, long j) {
        Parcel d = mo7348d();
        d.writeString(str);
        d.writeLong(j);
        mo7347b(7, d);
    }

    public final void setUserProperty(String str, String str2, C2303a aVar, boolean z, long j) {
        Parcel d = mo7348d();
        d.writeString(str);
        d.writeString(str2);
        C2724w.m6505a(d, (IInterface) aVar);
        d.writeInt(z ? 1 : 0);
        d.writeLong(j);
        mo7347b(4, d);
    }

    public final void unregisterOnMeasurementEventListener(C2376c cVar) {
        Parcel d = mo7348d();
        C2724w.m6505a(d, (IInterface) cVar);
        mo7347b(36, d);
    }
}
