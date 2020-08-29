package com.google.gson.internal.bind;

import com.google.gson.Gson;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p213q.p217b.p355e.C4340q;
import p213q.p217b.p355e.C4344s;
import p213q.p217b.p355e.C4345t;
import p213q.p217b.p355e.p357v.C4372o;
import p213q.p217b.p355e.p357v.p359z.p360d.C4395a;
import p213q.p217b.p355e.p361w.C4396a;
import p213q.p217b.p355e.p362x.C4397a;
import p213q.p217b.p355e.p362x.C4399b;
import p213q.p217b.p355e.p362x.C4400c;

public final class DateTypeAdapter extends C4344s<Date> {

    /* renamed from: b */
    public static final C4345t f1588b = new C4345t() {
        /* renamed from: a */
        public <T> C4344s<T> mo3085a(Gson gson, C4396a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    public final List<DateFormat> f1589a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f1589a = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f1589a.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C4372o.f10411a >= 9) {
            List<DateFormat> list = this.f1589a;
            StringBuilder sb = new StringBuilder();
            sb.append("MMM d, yyyy");
            sb.append(" ");
            sb.append("h:mm:ss a");
            list.add(new SimpleDateFormat(sb.toString(), Locale.US));
        }
    }

    /* renamed from: a */
    public Object mo3072a(C4397a aVar) {
        if (aVar.peek() != C4399b.NULL) {
            return mo3092a(aVar.mo10645z());
        }
        aVar.mo10644y();
        return null;
    }

    /* renamed from: a */
    public final synchronized Date mo3092a(String str) {
        for (DateFormat parse : this.f1589a) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return C4395a.m9935a(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new C4340q(str, e);
        }
    }

    /* renamed from: a */
    public synchronized void mo3073a(C4400c cVar, Date date) {
        if (date == null) {
            cVar.mo10661o();
        } else {
            cVar.mo10655d(((DateFormat) this.f1589a.get(0)).format(date));
        }
    }
}
