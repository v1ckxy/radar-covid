package p124p.p199y.p200x.p210t.p211p;

import java.util.concurrent.Executor;

/* renamed from: p.y.x.t.p.b */
public enum C1960b implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
