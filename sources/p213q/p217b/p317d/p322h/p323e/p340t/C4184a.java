package p213q.p217b.p317d.p322h.p323e.p340t;

/* renamed from: q.b.d.h.e.t.a */
public class C4184a implements C4187d {

    /* renamed from: a */
    public final int f10118a;

    /* renamed from: b */
    public final C4187d[] f10119b;

    /* renamed from: c */
    public final C4185b f10120c;

    public C4184a(int i, C4187d... dVarArr) {
        this.f10118a = i;
        this.f10119b = dVarArr;
        this.f10120c = new C4185b(i);
    }

    /* renamed from: a */
    public StackTraceElement[] mo10383a(StackTraceElement[] stackTraceElementArr) {
        C4187d[] dVarArr;
        if (stackTraceElementArr.length <= this.f10118a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (C4187d dVar : this.f10119b) {
            if (stackTraceElementArr2.length <= this.f10118a) {
                break;
            }
            stackTraceElementArr2 = dVar.mo10383a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.f10118a) {
            stackTraceElementArr2 = this.f10120c.mo10383a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
