package p213q.p214a.p215a.p216a;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import p213q.p217b.p317d.p322h.p323e.C3913b;
import p425x.p426a.p445e.p447b.p455h.C5082d;

/* renamed from: q.a.a.a.a */
/* compiled from: outline */
public class C1965a {
    /* renamed from: a */
    public static int m4742a(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    /* renamed from: a */
    public static int m4743a(String str, int i) {
        return String.valueOf(str).length() + i;
    }

    /* renamed from: a */
    public static long m4744a(long j, long j2, long j3, long j4) {
        return ((j * j2) + j3) * j4;
    }

    /* renamed from: a */
    public static String m4745a(int i, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m4746a(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    /* renamed from: a */
    public static String m4747a(Class cls, StringBuilder sb, String str, String str2) {
        sb.append(cls.getSimpleName());
        sb.append(str);
        sb.append(cls.getSimpleName());
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m4748a(String str, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m4749a(String str, Fragment fragment, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(fragment);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m4750a(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m4751a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m4752a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m4753a(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m4754a(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m4755a(XmlPullParser xmlPullParser, StringBuilder sb, String str) {
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static StringBuilder m4756a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* renamed from: a */
    public static StringBuilder m4757a(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    /* renamed from: a */
    public static void m4758a(int i, String str, HashMap hashMap, String str2) {
        hashMap.put(str2, new C5082d(i, str));
    }

    /* renamed from: a */
    public static void m4759a(String str, String str2, C3913b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        bVar.mo10108a(sb.toString());
    }

    /* renamed from: b */
    public static int m4760b(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    /* renamed from: b */
    public static String m4761b(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: b */
    public static String m4762b(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    public static StringBuilder m4763b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }
}
