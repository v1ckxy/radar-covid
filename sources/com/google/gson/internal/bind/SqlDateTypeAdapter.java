package com.google.gson.internal.bind;

import com.google.gson.Gson;
import java.sql.Date;
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

public final class SqlDateTypeAdapter extends C4344s<Date> {

    /* renamed from: b */
    public static final C4345t f1609b = new C4345t() {
        /* renamed from: a */
        public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    public final DateFormat f1610a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: a */
    public synchronized Date m1214a(C4397a aVar) {
        if (aVar.peek() == C4399b.NULL) {
            aVar.mo10644y();
            return null;
        }
        try {
            return new Date(this.f1610a.parse(aVar.mo10645z()).getTime());
        } catch (ParseException e) {
            throw new C4340q((Throwable) e);
        }
    }

    /* renamed from: a */
    public synchronized void mo3073a(C4400c cVar, Date date) {
        cVar.mo10655d(date == null ? null : this.f1610a.format(date));
    }
}
