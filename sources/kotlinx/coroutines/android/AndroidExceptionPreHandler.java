package kotlinx.coroutines.android;

import android.os.Build.VERSION;
import androidx.annotation.Keep;
import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p392u.p395p.C4576a;
import p392u.p395p.C4583f;

@Keep
public final class AndroidExceptionPreHandler extends C4576a implements CoroutineExceptionHandler {
    public volatile Object _preHandler = this;

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.f2460c);
    }

    private final Method preHandler() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        boolean z = false;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z = true;
            }
            if (z) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    public void handleException(C4583f fVar, Throwable th) {
        Thread currentThread = Thread.currentThread();
        if (VERSION.SDK_INT >= 28) {
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
            return;
        }
        Method preHandler = preHandler();
        Object obj = null;
        Object invoke = preHandler != null ? preHandler.invoke(null, new Object[0]) : null;
        if (invoke instanceof UncaughtExceptionHandler) {
            obj = invoke;
        }
        UncaughtExceptionHandler uncaughtExceptionHandler = (UncaughtExceptionHandler) obj;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(currentThread, th);
        }
    }
}
