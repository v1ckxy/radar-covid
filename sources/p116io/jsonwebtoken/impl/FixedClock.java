package p116io.jsonwebtoken.impl;

import java.util.Date;
import p116io.jsonwebtoken.Clock;

/* renamed from: io.jsonwebtoken.impl.FixedClock */
public class FixedClock implements Clock {
    public final Date now;

    public FixedClock() {
        this(new Date());
    }

    public FixedClock(Date date) {
        this.now = date;
    }

    public Date now() {
        return this.now;
    }
}
