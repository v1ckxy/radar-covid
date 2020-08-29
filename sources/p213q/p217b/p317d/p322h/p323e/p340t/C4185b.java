package p213q.p217b.p317d.p322h.p323e.p340t;

/* renamed from: q.b.d.h.e.t.b */
public class C4185b implements C4187d {

    /* renamed from: a */
    public final int f10121a;

    public C4185b(int i) {
        this.f10121a = i;
    }

    /* renamed from: a */
    public StackTraceElement[] mo10383a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f10121a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
