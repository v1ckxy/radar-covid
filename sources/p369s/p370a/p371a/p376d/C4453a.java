package p369s.p370a.p371a.p376d;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import p116io.jsonwebtoken.lang.Objects;

/* renamed from: s.a.a.d.a */
public final class C4453a extends RuntimeException {

    /* renamed from: e */
    public final List<Throwable> f10544e;

    /* renamed from: f */
    public final String f10545f;

    /* renamed from: g */
    public Throwable f10546g;

    /* renamed from: s.a.a.d.a$a */
    public static final class C4454a extends RuntimeException {
        public C4454a(String str) {
            super(str);
        }

        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public C4453a(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (iterable != null) {
            for (Object obj : iterable) {
                if (obj instanceof C4453a) {
                    linkedHashSet.addAll(((C4453a) obj).f10544e);
                } else {
                    if (obj == null) {
                        obj = new NullPointerException("Throwable was null!");
                    }
                    linkedHashSet.add(obj);
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            this.f10544e = Collections.unmodifiableList(new ArrayList(linkedHashSet));
            StringBuilder sb = new StringBuilder();
            sb.append(this.f10544e.size());
            sb.append(" exceptions occurred. ");
            this.f10545f = sb.toString();
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    public C4453a(Throwable... thArr) {
        this((Iterable<? extends Throwable>) thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    /* renamed from: a */
    public final void mo10734a(StringBuilder sb, Throwable th, String str) {
        StackTraceElement[] stackTrace;
        sb.append(str);
        sb.append(th);
        sb.append(10);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append(10);
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            mo10734a(sb, th.getCause(), Objects.EMPTY_STRING);
        }
    }

    public synchronized Throwable getCause() {
        Throwable th;
        int i;
        String[] split;
        if (this.f10546g == null) {
            String property = System.getProperty("line.separator");
            if (this.f10544e.size() > 1) {
                IdentityHashMap identityHashMap = new IdentityHashMap();
                StringBuilder sb = new StringBuilder();
                sb.append("Multiple exceptions (");
                sb.append(this.f10544e.size());
                sb.append(")");
                sb.append(property);
                for (Throwable th2 : this.f10544e) {
                    int i2 = 0;
                    while (true) {
                        if (th2 == null) {
                            break;
                        }
                        for (int i3 = 0; i3 < i2; i3++) {
                            sb.append("  ");
                        }
                        sb.append("|-- ");
                        sb.append(th2.getClass().getCanonicalName());
                        sb.append(": ");
                        String message = th2.getMessage();
                        if (message == null || !message.contains(property)) {
                            sb.append(message);
                            sb.append(property);
                        } else {
                            sb.append(property);
                            for (String str : message.split(property)) {
                                for (int i4 = 0; i4 < i2 + 2; i4++) {
                                    sb.append("  ");
                                }
                                sb.append(str);
                                sb.append(property);
                            }
                        }
                        int i5 = 0;
                        while (true) {
                            i = i2 + 2;
                            if (i5 >= i) {
                                break;
                            }
                            sb.append("  ");
                            i5++;
                        }
                        StackTraceElement[] stackTrace = th2.getStackTrace();
                        if (stackTrace.length > 0) {
                            sb.append("at ");
                            sb.append(stackTrace[0]);
                            sb.append(property);
                        }
                        if (!identityHashMap.containsKey(th2)) {
                            identityHashMap.put(th2, Boolean.valueOf(true));
                            th2 = th2.getCause();
                            i2++;
                        } else {
                            Throwable cause = th2.getCause();
                            if (cause != null) {
                                for (int i6 = 0; i6 < i; i6++) {
                                    sb.append("  ");
                                }
                                sb.append("|-- ");
                                sb.append("(cause not expanded again) ");
                                sb.append(cause.getClass().getCanonicalName());
                                sb.append(": ");
                                sb.append(cause.getMessage());
                                sb.append(property);
                            }
                        }
                    }
                }
                th = new C4454a(sb.toString().trim());
            } else {
                th = (Throwable) this.f10544e.get(0);
            }
            this.f10546g = th;
        }
        return this.f10546g;
    }

    public String getMessage() {
        return this.f10545f;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append(10);
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append(10);
        }
        int i = 1;
        for (Throwable th : this.f10544e) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            mo10734a(sb, th, "\t");
            i++;
        }
        printStream.println(sb.toString());
    }

    public void printStackTrace(PrintWriter printWriter) {
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append(10);
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append(10);
        }
        int i = 1;
        for (Throwable th : this.f10544e) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            mo10734a(sb, th, "\t");
            i++;
        }
        printWriter.println(sb.toString());
    }
}
