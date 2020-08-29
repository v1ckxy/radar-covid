package com.google.android.gms.common.stats;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p242n.p243o.C2258a;

public abstract class StatsEvent extends C2258a implements ReflectedParcelable {
    public String toString() {
        WakeLockEvent wakeLockEvent = (WakeLockEvent) this;
        long j = wakeLockEvent.f1077f;
        int i = wakeLockEvent.f1078g;
        long j2 = wakeLockEvent.f1091t;
        String str = wakeLockEvent.f1079h;
        int i2 = wakeLockEvent.f1082k;
        List<String> list = wakeLockEvent.f1083l;
        String str2 = Objects.EMPTY_STRING;
        String join = list == null ? str2 : TextUtils.join(",", list);
        int i3 = wakeLockEvent.f1086o;
        String str3 = wakeLockEvent.f1080i;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = wakeLockEvent.f1087p;
        if (str4 == null) {
            str4 = str2;
        }
        float f = wakeLockEvent.f1088q;
        String str5 = wakeLockEvent.f1081j;
        if (str5 != null) {
            str2 = str5;
        }
        boolean z = wakeLockEvent.f1090s;
        StringBuilder sb = new StringBuilder(str2.length() + str4.length() + str3.length() + C1965a.m4743a(join, C1965a.m4743a(str, 51)));
        String str6 = "\t";
        sb.append(str6);
        sb.append(str);
        sb.append(str6);
        sb.append(i2);
        sb.append(str6);
        sb.append(join);
        sb.append(str6);
        sb.append(i3);
        sb.append(str6);
        sb.append(str3);
        sb.append(str6);
        sb.append(str4);
        sb.append(str6);
        sb.append(f);
        sb.append(str6);
        sb.append(str2);
        sb.append(str6);
        sb.append(z);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(C1965a.m4743a(sb2, 53));
        sb3.append(j);
        sb3.append(str6);
        sb3.append(i);
        sb3.append(str6);
        sb3.append(j2);
        sb3.append(sb2);
        return sb3.toString();
    }
}
