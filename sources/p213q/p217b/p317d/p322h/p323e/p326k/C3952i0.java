package p213q.p217b.p317d.p322h.p323e.p326k;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p116io.jsonwebtoken.lang.Objects;
import p116io.jsonwebtoken.lang.Strings;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4071n;
import p213q.p217b.p317d.p322h.p323e.p328m.C4075p;
import p213q.p217b.p317d.p322h.p323e.p328m.C4077q.C4079b;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4106c;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4108e;
import p213q.p217b.p317d.p322h.p323e.p328m.C4090v.C4095d.C4101d.C4102a.C4103a.C4108e.C4109a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4119w;
import p213q.p217b.p317d.p322h.p323e.p340t.C4187d;
import p213q.p217b.p317d.p322h.p323e.p340t.C4188e;

/* renamed from: q.b.d.h.e.k.i0 */
public class C3952i0 {

    /* renamed from: e */
    public static final String f9648e = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"17.1.1"});

    /* renamed from: f */
    public static final Map<String, Integer> f9649f;

    /* renamed from: a */
    public final Context f9650a;

    /* renamed from: b */
    public final C3970q0 f9651b;

    /* renamed from: c */
    public final C3932b f9652c;

    /* renamed from: d */
    public final C4187d f9653d;

    static {
        HashMap hashMap = new HashMap();
        f9649f = hashMap;
        hashMap.put("armeabi", Integer.valueOf(5));
        f9649f.put("armeabi-v7a", Integer.valueOf(6));
        f9649f.put("arm64-v8a", Integer.valueOf(9));
        f9649f.put("x86", Integer.valueOf(0));
        f9649f.put("x86_64", Integer.valueOf(1));
    }

    public C3952i0(Context context, C3970q0 q0Var, C3932b bVar, C4187d dVar) {
        this.f9650a = context;
        this.f9651b = q0Var;
        this.f9652c = bVar;
        this.f9653d = dVar;
    }

    /* renamed from: a */
    public final C4106c mo10144a(C4188e eVar, int i, int i2, int i3) {
        String str = eVar.f10124b;
        String str2 = eVar.f10123a;
        StackTraceElement[] stackTraceElementArr = eVar.f10125c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C4188e eVar2 = eVar.f10126d;
        if (i3 >= i2) {
            C4188e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f10126d;
                i4++;
            }
        }
        C4106c cVar = null;
        if (str != null) {
            C4119w wVar = new C4119w(mo10146a(stackTraceElementArr, i));
            Integer valueOf = Integer.valueOf(i4);
            if (eVar2 != null && i4 == 0) {
                cVar = mo10144a(eVar2, i, i2, i3 + 1);
            }
            String str3 = Objects.EMPTY_STRING;
            if (valueOf == null) {
                str3 = C1965a.m4751a(str3, " overflowCount");
            }
            if (str3.isEmpty()) {
                C4071n nVar = new C4071n(str, str2, wVar, cVar, valueOf.intValue(), null);
                return nVar;
            }
            throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str3));
        }
        throw new NullPointerException("Null type");
    }

    /* renamed from: a */
    public final C4119w<C4109a> mo10146a(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (i2 < length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            C4079b bVar = new C4079b();
            bVar.f9952e = Integer.valueOf(i);
            long j = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max((long) stackTraceElement.getLineNumber(), 0) : 0;
            StringBuilder sb = new StringBuilder();
            sb.append(stackTraceElement.getClassName());
            sb.append(Strings.CURRENT_PATH);
            sb.append(stackTraceElement.getMethodName());
            String sb2 = sb.toString();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j = (long) stackTraceElement.getLineNumber();
            }
            bVar.f9948a = Long.valueOf(max);
            if (sb2 != null) {
                bVar.f9949b = sb2;
                bVar.f9950c = fileName;
                bVar.f9951d = Long.valueOf(j);
                arrayList.add(bVar.mo10281a());
                i2++;
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return new C4119w<>(arrayList);
    }

    /* renamed from: a */
    public final C4108e mo10145a(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        String name = thread.getName();
        if (name != null) {
            Integer valueOf = Integer.valueOf(i);
            C4119w wVar = new C4119w(mo10146a(stackTraceElementArr, i));
            String str = Objects.EMPTY_STRING;
            if (valueOf == null) {
                str = C1965a.m4751a(str, " importance");
            }
            if (str.isEmpty()) {
                return new C4075p(name, valueOf.intValue(), wVar, null);
            }
            throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str));
        }
        throw new NullPointerException("Null name");
    }
}
