package com.google.gson.internal.bind;

import com.google.gson.Gson;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p213q.p217b.p355e.C4340q;
import p213q.p217b.p355e.C4344s;
import p213q.p217b.p355e.C4345t;
import p213q.p217b.p355e.p361w.C4396a;
import p213q.p217b.p355e.p362x.C4397a;
import p213q.p217b.p355e.p362x.C4399b;
import p213q.p217b.p355e.p362x.C4400c;

public final class TimeTypeAdapter extends C4344s<Time> {

    /* renamed from: b */
    public static final C4345t f1611b = new C4345t() {
        /* renamed from: a */
        public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
            if (aVar.getRawType() == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    public final DateFormat f1612a = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: a */
    public synchronized Time m1219a(C4397a aVar) {
        if (aVar.peek() == C4399b.NULL) {
            aVar.mo10644y();
            return null;
        }
        try {
            return new Time(this.f1612a.parse(aVar.mo10645z()).getTime());
        } catch (ParseException e) {
            throw new C4340q((Throwable) e);
        }
    }

    /* renamed from: a */
    public synchronized void mo3073a(C4400c cVar, Time time) {
        cVar.mo10655d(time == null ? null : this.f1612a.format(time));
    }
}
