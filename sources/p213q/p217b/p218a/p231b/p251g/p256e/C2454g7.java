package p213q.p217b.p218a.p231b.p251g.p256e;

/* renamed from: q.b.a.b.g.e.g7 */
public final class C2454g7 implements C2438f8 {

    /* renamed from: b */
    public static final C2636q7 f6548b = new C2437f7();

    /* renamed from: a */
    public final C2636q7 f6549a;

    public C2454g7() {
        C2636q7 q7Var;
        C2636q7[] q7VarArr = new C2636q7[2];
        q7VarArr[0] = C2436f6.f6528a;
        try {
            q7Var = (C2636q7) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            q7Var = f6548b;
        }
        q7VarArr[1] = q7Var;
        C2497i7 i7Var = new C2497i7(q7VarArr);
        C2546l6.m6114a(i7Var, "messageInfoFactory");
        this.f6549a = i7Var;
    }
}
