package p213q.p217b.p218a.p231b.p251g.p256e;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p213q.p217b.p218a.p231b.p251g.p256e.C2714v4;
import p213q.p217b.p218a.p231b.p251g.p256e.C2730w4;

/* renamed from: q.b.a.b.g.e.w4 */
public abstract class C2730w4<MessageType extends C2730w4<MessageType, BuilderType>, BuilderType extends C2714v4<MessageType, BuilderType>> implements C2619p7 {
    public int zza = 0;

    /* renamed from: a */
    public static <T> void m6511a(Iterable<T> iterable, List<? super T> list) {
        C2546l6.m6112a(iterable);
        String str = " is null.";
        String str2 = "Element at index ";
        if (iterable instanceof C2347a7) {
            List d = ((C2347a7) iterable).mo7401d();
            C2347a7 a7Var = (C2347a7) list;
            int size = list.size();
            for (Object next : d) {
                if (next == null) {
                    int size2 = a7Var.size() - size;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append(str2);
                    sb.append(size2);
                    sb.append(str);
                    String sb2 = sb.toString();
                    for (int size3 = a7Var.size() - 1; size3 >= size; size3--) {
                        a7Var.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof C2435f5) {
                    a7Var.mo7399a((C2435f5) next);
                } else {
                    a7Var.add((String) next);
                }
            }
        } else if (iterable instanceof C2780z7) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size4 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    int size5 = list.size() - size4;
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append(str2);
                    sb3.append(size5);
                    sb3.append(str);
                    String sb4 = sb3.toString();
                    for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                        list.remove(size6);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(next2);
            }
        }
    }

    /* renamed from: f */
    public final byte[] mo8084f() {
        try {
            byte[] bArr = new byte[mo7765d()];
            C2615p5 a = C2615p5.m6236a(bArr);
            mo7762a(a);
            if (a.mo7941a() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(10 + name.length() + 62);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: i */
    public final C2435f5 mo7956i() {
        try {
            C2545l5 e = C2435f5.m5808e(mo7765d());
            mo7762a(e.f6702a);
            return e.mo7846a();
        } catch (IOException e2) {
            String str = "ByteString";
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(str.length() + name.length() + 62);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }
}
