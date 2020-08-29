package p124p.p199y;

/* renamed from: p.y.t */
public enum C1816t {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    /* renamed from: f */
    public boolean mo6791f() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
