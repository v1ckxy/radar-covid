package p213q.p217b.p218a.p231b.p251g.p256e;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import p213q.p217b.p218a.p231b.p249e.C2303a;

/* renamed from: q.b.a.b.g.e.oe */
public interface C2606oe extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void endAdUnitExposure(String str, long j);

    void generateEventId(C2626pe peVar);

    void getAppInstanceId(C2626pe peVar);

    void getCachedAppInstanceId(C2626pe peVar);

    void getConditionalUserProperties(String str, String str2, C2626pe peVar);

    void getCurrentScreenClass(C2626pe peVar);

    void getCurrentScreenName(C2626pe peVar);

    void getGmpAppId(C2626pe peVar);

    void getMaxUserProperties(String str, C2626pe peVar);

    void getTestFlag(C2626pe peVar, int i);

    void getUserProperties(String str, String str2, boolean z, C2626pe peVar);

    void initForTests(Map map);

    void initialize(C2303a aVar, C2427f fVar, long j);

    void isDataCollectionEnabled(C2626pe peVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, C2626pe peVar, long j);

    void logHealthData(int i, String str, C2303a aVar, C2303a aVar2, C2303a aVar3);

    void onActivityCreated(C2303a aVar, Bundle bundle, long j);

    void onActivityDestroyed(C2303a aVar, long j);

    void onActivityPaused(C2303a aVar, long j);

    void onActivityResumed(C2303a aVar, long j);

    void onActivitySaveInstanceState(C2303a aVar, C2626pe peVar, long j);

    void onActivityStarted(C2303a aVar, long j);

    void onActivityStopped(C2303a aVar, long j);

    void performAction(Bundle bundle, C2626pe peVar, long j);

    void registerOnMeasurementEventListener(C2376c cVar);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setCurrentScreen(C2303a aVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(C2376c cVar);

    void setInstanceIdProvider(C2393d dVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, C2303a aVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(C2376c cVar);
}
