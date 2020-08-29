package p124p.p199y.p200x;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: p.y.x.a */
public class C1822a {

    /* renamed from: a */
    public final Handler f5305a;

    public C1822a() {
        Handler handler;
        Handler handler2;
        Looper mainLooper = Looper.getMainLooper();
        if (VERSION.SDK_INT >= 28) {
            handler = Handler.createAsync(mainLooper);
        } else {
            try {
                handler2 = (Handler) Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Callback.class, Boolean.TYPE}).newInstance(new Object[]{mainLooper, null, Boolean.valueOf(true)});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
                Log.v("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor");
                handler2 = new Handler(mainLooper);
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                } else if (cause instanceof Error) {
                    throw ((Error) cause);
                } else {
                    throw new RuntimeException(cause);
                }
            }
            handler = handler2;
        }
        this.f5305a = handler;
    }
}
