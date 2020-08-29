package p213q.p217b.p218a.p231b.p270l;

/* renamed from: q.b.a.b.l.b */
public final class C3241b extends IllegalStateException {
    public C3241b(String str, Throwable th) {
        super(str, th);
    }

    /* renamed from: a */
    public static IllegalStateException m7548a(C3255i<?> iVar) {
        String str;
        if (!iVar.mo8935c()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception a = iVar.mo8920a();
        if (a != null) {
            str = "failure";
        } else if (iVar.mo8936d()) {
            String valueOf = String.valueOf(iVar.mo8931b());
            StringBuilder sb = new StringBuilder(valueOf.length() + 7);
            sb.append("result ");
            sb.append(valueOf);
            str = sb.toString();
        } else {
            str = ((C3250f0) iVar).f8123d ? "cancellation" : "unknown issue";
        }
        String str2 = "Complete with: ";
        String valueOf2 = String.valueOf(str);
        return new C3241b(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), a);
    }
}
