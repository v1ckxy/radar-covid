package p213q.p217b.p218a.p231b.p262i.p265d.p266b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

@TargetApi(14)
/* renamed from: q.b.a.b.i.d.b.c */
public final class C3208c implements ActivityLifecycleCallbacks {

    /* renamed from: e */
    public final Activity f8060e;

    /* renamed from: f */
    public final C3207b f8061f;

    public /* synthetic */ C3208c(Activity activity, C3207b bVar, C3206a aVar) {
        this.f8060e = activity;
        this.f8061f = bVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.f8060e) {
            String str = "NearbyMessagesClient";
            if (Log.isLoggable(str, 2)) {
                Log.v(str, String.format("Unregistering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", new Object[]{activity.getPackageName()}));
            }
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
        if (activity == this.f8060e) {
            try {
                this.f8061f.mo8878b(1);
            } catch (RemoteException e) {
                String str = "NearbyMessagesClient";
                if (Log.isLoggable(str, 2)) {
                    Log.v(str, String.format("Failed to emit ACTIVITY_STOPPED from ClientLifecycleSafetyNet for Activity %s: %s", new Object[]{activity.getPackageName(), e}));
                }
            }
        }
    }
}
