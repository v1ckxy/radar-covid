package p213q.p217b.p317d.p322h.p323e.p332p;

import android.app.ActivityManager.RunningAppProcessInfo;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p116io.jsonwebtoken.lang.Objects;
import p116io.jsonwebtoken.lang.Strings;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p213q.p217b.p317d.p322h.p323e.p340t.C4188e;

/* renamed from: q.b.d.h.e.p.d */
public class C4144d {

    /* renamed from: a */
    public static final C4139a f10029a = C4139a.m9568a("0");

    /* renamed from: b */
    public static final C4139a f10030b = C4139a.m9568a("Unity");

    /* renamed from: a */
    public static int m9588a() {
        return C4142c.m9571b(3, 0) + C4142c.m9572b(2, f10029a) + C4142c.m9572b(1, f10029a) + 0;
    }

    /* renamed from: a */
    public static int m9589a(Float f, int i, boolean z, int i2, long j, long j2) {
        int i3 = 0;
        if (f != null) {
            f.floatValue();
            i3 = 0 + C4142c.m9575d(1) + 4;
        }
        return C4142c.m9571b(6, j2) + C4142c.m9571b(5, j) + C4142c.m9577e(4, i2) + C4142c.m9573b(3, z) + i3 + C4142c.m9574c((i >> 31) ^ (i << 1)) + C4142c.m9575d(2);
    }

    /* renamed from: a */
    public static int m9590a(StackTraceElement stackTraceElement, boolean z) {
        int i = 0;
        int b = C4142c.m9571b(1, stackTraceElement.isNativeMethod() ? (long) Math.max(stackTraceElement.getLineNumber(), 0) : 0) + 0;
        StringBuilder sb = new StringBuilder();
        sb.append(stackTraceElement.getClassName());
        sb.append(Strings.CURRENT_PATH);
        sb.append(stackTraceElement.getMethodName());
        int b2 = C4142c.m9572b(2, C4139a.m9568a(sb.toString())) + b;
        if (stackTraceElement.getFileName() != null) {
            b2 += C4142c.m9572b(3, C4139a.m9568a(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            b2 += C4142c.m9571b(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i = 2;
        }
        return C4142c.m9577e(5, i) + b2;
    }

    /* renamed from: a */
    public static int m9591a(String str, String str2) {
        int b = C4142c.m9572b(1, C4139a.m9568a(str));
        if (str2 == null) {
            str2 = Objects.EMPTY_STRING;
        }
        return C4142c.m9572b(2, C4139a.m9568a(str2)) + b;
    }

    /* renamed from: a */
    public static int m9592a(Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        int e = C4142c.m9577e(2, i) + C4142c.m9572b(1, C4139a.m9568a(thread.getName()));
        for (StackTraceElement a : stackTraceElementArr) {
            int a2 = m9590a(a, z);
            e += C4142c.m9574c(a2) + C4142c.m9575d(3) + a2;
        }
        return e;
    }

    /* renamed from: a */
    public static int m9593a(C4139a aVar, C4139a aVar2) {
        int b = C4142c.m9572b(3, aVar) + C4142c.m9571b(2, 0) + C4142c.m9571b(1, 0) + 0;
        return aVar2 != null ? b + C4142c.m9572b(4, aVar2) : b;
    }

    /* renamed from: a */
    public static int m9594a(C4188e eVar, int i, int i2) {
        int i3 = 0;
        int b = C4142c.m9572b(1, C4139a.m9568a(eVar.f10124b)) + 0;
        String str = eVar.f10123a;
        if (str != null) {
            b += C4142c.m9572b(3, C4139a.m9568a(str));
        }
        for (StackTraceElement a : eVar.f10125c) {
            int a2 = m9590a(a, true);
            b += C4142c.m9574c(a2) + C4142c.m9575d(4) + a2;
        }
        C4188e eVar2 = eVar.f10126d;
        if (eVar2 == null) {
            return b;
        }
        if (i < i2) {
            int a3 = m9594a(eVar2, i + 1, i2);
            return b + C4142c.m9574c(a3) + C4142c.m9575d(6) + a3;
        }
        while (eVar2 != null) {
            eVar2 = eVar2.f10126d;
            i3++;
        }
        return b + C4142c.m9577e(7, i3);
    }

    /* renamed from: a */
    public static int m9595a(C4188e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C4139a aVar, C4139a aVar2) {
        int d = C4142c.m9575d(1);
        int a = m9592a(thread, stackTraceElementArr, 4, true);
        int c = C4142c.m9574c(a) + d + a + 0;
        int length = threadArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int a2 = m9592a(threadArr[i2], (StackTraceElement[]) list.get(i2), 0, false);
            c += C4142c.m9574c(a2) + d + a2;
        }
        int a3 = m9594a(eVar, 1, i);
        int c2 = C4142c.m9574c(a3) + C4142c.m9575d(2) + a3 + c;
        int a4 = m9588a();
        int c3 = C4142c.m9574c(a4) + C4142c.m9575d(3) + a4 + c2;
        int a5 = m9593a(aVar, aVar2);
        return C4142c.m9574c(a5) + C4142c.m9575d(3) + a5 + c3;
    }

    /* renamed from: a */
    public static int m9596a(C4188e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C4139a aVar, C4139a aVar2, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2) {
        int a = m9595a(eVar, thread, stackTraceElementArr, threadArr, list, i, aVar, aVar2);
        boolean z = true;
        int c = C4142c.m9574c(a) + C4142c.m9575d(1) + a + 0;
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                int a2 = m9591a((String) entry.getKey(), (String) entry.getValue());
                c += C4142c.m9574c(a2) + C4142c.m9575d(2) + a2;
            }
        }
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance == 100) {
                z = false;
            }
            c += C4142c.m9573b(3, z);
        }
        return C4142c.m9577e(4, i2) + c;
    }

    /* renamed from: a */
    public static C4139a m9597a(String str) {
        if (str == null) {
            return null;
        }
        return C4139a.m9568a(str);
    }

    /* renamed from: a */
    public static void m9600a(C4142c cVar, String str) {
        C4139a a = C4139a.m9568a(str);
        cVar.mo10352b(7, 2);
        int b = C4142c.m9572b(2, a);
        cVar.mo10351b(C4142c.m9574c(b) + C4142c.m9575d(5) + b);
        cVar.mo10352b(5, 2);
        cVar.mo10351b(b);
        cVar.mo10349a(2, a);
    }

    /* renamed from: a */
    public static void m9601a(C4142c cVar, String str, String str2, long j) {
        cVar.mo10349a(1, C4139a.m9568a(str2));
        cVar.mo10349a(2, C4139a.m9568a(str));
        cVar.mo10348a(3, j);
    }

    /* renamed from: a */
    public static void m9602a(C4142c cVar, String str, String str2, String str3) {
        if (str == null) {
            str = Objects.EMPTY_STRING;
        }
        C4139a a = C4139a.m9568a(str);
        C4139a a2 = m9597a(str2);
        C4139a a3 = m9597a(str3);
        int b = C4142c.m9572b(1, a) + 0;
        if (str2 != null) {
            b += C4142c.m9572b(2, a2);
        }
        if (str3 != null) {
            b += C4142c.m9572b(3, a3);
        }
        cVar.mo10352b(6, 2);
        cVar.mo10351b(b);
        cVar.mo10349a(1, a);
        if (str2 != null) {
            cVar.mo10349a(2, a2);
        }
        if (str3 != null) {
            cVar.mo10349a(3, a3);
        }
    }

    /* renamed from: a */
    public static void m9605a(C4142c cVar, Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        cVar.mo10352b(1, 2);
        cVar.mo10351b(m9592a(thread, stackTraceElementArr, i, z));
        cVar.mo10349a(1, C4139a.m9568a(thread.getName()));
        cVar.mo10354c(2, i);
        for (StackTraceElement a : stackTraceElementArr) {
            m9598a(cVar, 3, a, z);
        }
    }

    /* renamed from: a */
    public static void m9598a(C4142c cVar, int i, StackTraceElement stackTraceElement, boolean z) {
        cVar.mo10351b((i << 3) | 2);
        cVar.mo10351b(m9590a(stackTraceElement, z));
        int i2 = 0;
        cVar.mo10348a(1, stackTraceElement.isNativeMethod() ? (long) Math.max(stackTraceElement.getLineNumber(), 0) : 0);
        StringBuilder sb = new StringBuilder();
        sb.append(stackTraceElement.getClassName());
        sb.append(Strings.CURRENT_PATH);
        sb.append(stackTraceElement.getMethodName());
        cVar.mo10349a(2, C4139a.m9568a(sb.toString()));
        if (stackTraceElement.getFileName() != null) {
            cVar.mo10349a(3, C4139a.m9568a(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            cVar.mo10348a(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i2 = 4;
        }
        cVar.mo10354c(5, i2);
    }

    /* renamed from: a */
    public static void m9603a(C4142c cVar, String str, String str2, String str3, String str4, int i, String str5) {
        C4139a a = C4139a.m9568a(str);
        C4139a a2 = C4139a.m9568a(str2);
        C4139a a3 = C4139a.m9568a(str3);
        C4139a a4 = C4139a.m9568a(str4);
        C4139a a5 = str5 != null ? C4139a.m9568a(str5) : null;
        cVar.mo10352b(7, 2);
        int b = C4142c.m9572b(6, a4) + C4142c.m9572b(3, a3) + C4142c.m9572b(2, a2) + C4142c.m9572b(1, a) + 0;
        if (a5 != null) {
            b = C4142c.m9572b(9, a5) + C4142c.m9572b(8, f10030b) + b;
        }
        cVar.mo10351b(C4142c.m9576d(10, i) + b);
        cVar.mo10349a(1, a);
        cVar.mo10349a(2, a2);
        cVar.mo10349a(3, a3);
        cVar.mo10349a(6, a4);
        if (a5 != null) {
            cVar.mo10349a(8, f10030b);
            cVar.mo10349a(9, a5);
        }
        cVar.mo10347a(10, i);
    }

    /* renamed from: a */
    public static void m9599a(C4142c cVar, long j, String str, C4188e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, Map<String, String> map, byte[] bArr, RunningAppProcessInfo runningAppProcessInfo, int i2, String str2, String str3, Float f, int i3, boolean z, long j2, long j3) {
        C4139a aVar;
        C4142c cVar2 = cVar;
        long j4 = j;
        Thread[] threadArr2 = threadArr;
        byte[] bArr2 = bArr;
        RunningAppProcessInfo runningAppProcessInfo2 = runningAppProcessInfo;
        int i4 = i2;
        String str4 = str3;
        C4139a a = C4139a.m9568a(str2);
        String str5 = Objects.EMPTY_STRING;
        C4139a a2 = str4 == null ? null : C4139a.m9568a(str4.replace("-", str5));
        if (bArr2 != null) {
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr2, 0, bArr3, 0, length);
            aVar = new C4139a(bArr3);
        } else {
            C3913b.f9552c.mo10108a("No log data to include with this event.");
            aVar = null;
        }
        cVar2.mo10352b(10, 2);
        int b = C4142c.m9572b(2, C4139a.m9568a(str)) + C4142c.m9571b(1, j4) + 0;
        C4139a aVar2 = aVar;
        C4139a aVar3 = a2;
        String str6 = str5;
        C4139a aVar4 = a;
        int a3 = m9596a(eVar, thread, stackTraceElementArr, threadArr, list, i, a, a2, map, runningAppProcessInfo, i2);
        int c = C4142c.m9574c(a3) + C4142c.m9575d(3) + a3 + b;
        int a4 = m9589a(f, i3, z, i2, j2, j3);
        int c2 = C4142c.m9574c(a4) + C4142c.m9575d(5) + a4 + c;
        if (aVar2 != null) {
            int b2 = C4142c.m9572b(1, aVar2);
            c2 += C4142c.m9574c(b2) + C4142c.m9575d(6) + b2;
        }
        cVar2.mo10351b(c2);
        cVar2.mo10348a(1, j4);
        cVar2.mo10349a(2, C4139a.m9568a(str));
        cVar2.mo10352b(3, 2);
        Thread thread2 = thread;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        Thread[] threadArr3 = threadArr;
        List<StackTraceElement[]> list2 = list;
        int i5 = i;
        C4139a aVar5 = aVar4;
        C4139a aVar6 = aVar3;
        cVar2.mo10351b(m9596a(eVar, thread2, stackTraceElementArr2, threadArr3, list2, i5, aVar5, aVar6, map, runningAppProcessInfo, i2));
        cVar2.mo10352b(1, 2);
        cVar2.mo10351b(m9595a(eVar, thread2, stackTraceElementArr2, threadArr3, list2, i5, aVar5, aVar6));
        m9605a(cVar2, thread2, stackTraceElementArr2, 4, true);
        int length2 = threadArr2.length;
        for (int i6 = 0; i6 < length2; i6++) {
            m9605a(cVar2, threadArr2[i6], (StackTraceElement[]) list.get(i6), 0, false);
        }
        m9606a(cVar2, eVar, 1, i, 2);
        cVar2.mo10352b(3, 2);
        cVar2.mo10351b(m9588a());
        cVar2.mo10349a(1, f10029a);
        cVar2.mo10349a(2, f10029a);
        cVar2.mo10348a(3, 0);
        cVar2.mo10352b(4, 2);
        C4139a aVar7 = aVar3;
        C4139a aVar8 = aVar4;
        cVar2.mo10351b(m9593a(aVar8, aVar7));
        cVar2.mo10348a(1, 0);
        cVar2.mo10348a(2, 0);
        cVar2.mo10349a(3, aVar8);
        if (aVar7 != null) {
            cVar2.mo10349a(4, aVar7);
        }
        if (map != null && !map.isEmpty()) {
            for (Entry entry : map.entrySet()) {
                cVar2.mo10352b(2, 2);
                cVar2.mo10351b(m9591a((String) entry.getKey(), (String) entry.getValue()));
                cVar2.mo10349a(1, C4139a.m9568a((String) entry.getKey()));
                String str7 = (String) entry.getValue();
                if (str7 == null) {
                    str7 = str6;
                }
                cVar2.mo10349a(2, C4139a.m9568a(str7));
            }
        }
        RunningAppProcessInfo runningAppProcessInfo3 = runningAppProcessInfo;
        if (runningAppProcessInfo3 != null) {
            cVar2.mo10350a(3, runningAppProcessInfo3.importance != 100);
        }
        int i7 = i2;
        cVar2.mo10354c(4, i7);
        cVar2.mo10352b(5, 2);
        cVar2.mo10351b(m9589a(f, i3, z, i2, j2, j3));
        if (f != null) {
            float floatValue = f.floatValue();
            cVar2.mo10351b(13);
            int floatToRawIntBits = Float.floatToRawIntBits(floatValue);
            cVar2.mo10346a(floatToRawIntBits & 255);
            cVar2.mo10346a((floatToRawIntBits >> 8) & 255);
            cVar2.mo10346a((floatToRawIntBits >> 16) & 255);
            cVar2.mo10346a((floatToRawIntBits >> 24) & 255);
        }
        cVar2.mo10351b(16);
        cVar2.mo10351b((i3 << 1) ^ (i3 >> 31));
        cVar2.mo10350a(3, z);
        cVar2.mo10354c(4, i7);
        cVar2.mo10348a(5, j2);
        cVar2.mo10348a(6, j3);
        if (aVar2 != null) {
            cVar2.mo10352b(6, 2);
            cVar2.mo10351b(C4142c.m9572b(1, aVar2));
            cVar2.mo10349a(1, aVar2);
        }
    }

    /* renamed from: a */
    public static void m9606a(C4142c cVar, C4188e eVar, int i, int i2, int i3) {
        cVar.mo10351b((i3 << 3) | 2);
        cVar.mo10351b(m9594a(eVar, 1, i2));
        cVar.mo10349a(1, C4139a.m9568a(eVar.f10124b));
        String str = eVar.f10123a;
        if (str != null) {
            cVar.mo10349a(3, C4139a.m9568a(str));
        }
        int i4 = 0;
        for (StackTraceElement a : eVar.f10125c) {
            m9598a(cVar, 4, a, true);
        }
        C4188e eVar2 = eVar.f10126d;
        if (eVar2 == null) {
            return;
        }
        if (i < i2) {
            m9606a(cVar, eVar2, i + 1, i2, 6);
            return;
        }
        while (eVar2 != null) {
            eVar2 = eVar2.f10126d;
            i4++;
        }
        cVar.mo10354c(7, i4);
    }

    /* renamed from: a */
    public static void m9604a(C4142c cVar, String str, String str2, boolean z) {
        C4139a a = C4139a.m9568a(str);
        C4139a a2 = C4139a.m9568a(str2);
        cVar.mo10352b(8, 2);
        cVar.mo10351b(C4142c.m9573b(4, z) + C4142c.m9572b(3, a2) + C4142c.m9572b(2, a) + C4142c.m9576d(1, 3) + 0);
        cVar.mo10347a(1, 3);
        cVar.mo10349a(2, a);
        cVar.mo10349a(3, a2);
        cVar.mo10350a(4, z);
    }
}
