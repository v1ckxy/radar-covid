package p213q.p217b.p218a.p231b.p239d.p240m.p241k;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: q.b.a.b.d.m.k.c */
public final class C2164c implements ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: i */
    public static final C2164c f6033i = new C2164c();

    /* renamed from: e */
    public final AtomicBoolean f6034e = new AtomicBoolean();

    /* renamed from: f */
    public final AtomicBoolean f6035f = new AtomicBoolean();
    @GuardedBy("sInstance")

    /* renamed from: g */
    public final ArrayList<C2165a> f6036g = new ArrayList<>();
    @GuardedBy("sInstance")

    /* renamed from: h */
    public boolean f6037h = false;

    /* renamed from: q.b.a.b.d.m.k.c$a */
    public interface C2165a {
        /* renamed from: a */
        void mo7162a(boolean z);
    }

    /* renamed from: a */
    public static void m4961a(Application application) {
        synchronized (f6033i) {
            if (!f6033i.f6037h) {
                application.registerActivityLifecycleCallbacks(f6033i);
                application.registerComponentCallbacks(f6033i);
                f6033i.f6037h = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo7150a(C2165a aVar) {
        synchronized (f6033i) {
            this.f6036g.add(aVar);
        }
    }

    /* renamed from: a */
    public final void mo7151a(boolean z) {
        synchronized (f6033i) {
            ArrayList<C2165a> arrayList = this.f6036g;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((C2165a) obj).mo7162a(z);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f6034e.compareAndSet(true, false);
        this.f6035f.set(true);
        if (compareAndSet) {
            mo7151a(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f6034e.compareAndSet(true, false);
        this.f6035f.set(true);
        if (compareAndSet) {
            mo7151a(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f6034e.compareAndSet(false, true)) {
            this.f6035f.set(true);
            mo7151a(true);
        }
    }
}
