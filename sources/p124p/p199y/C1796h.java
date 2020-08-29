package p124p.p199y;

import android.app.Notification;

/* renamed from: p.y.h */
public final class C1796h {

    /* renamed from: a */
    public final int f5275a;

    /* renamed from: b */
    public final int f5276b;

    /* renamed from: c */
    public final Notification f5277c;

    public C1796h(int i, Notification notification, int i2) {
        this.f5275a = i;
        this.f5277c = notification;
        this.f5276b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1796h.class != obj.getClass()) {
            return false;
        }
        C1796h hVar = (C1796h) obj;
        if (this.f5275a == hVar.f5275a && this.f5276b == hVar.f5276b) {
            return this.f5277c.equals(hVar.f5277c);
        }
        return false;
    }

    public int hashCode() {
        return this.f5277c.hashCode() + (((this.f5275a * 31) + this.f5276b) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ForegroundInfo{");
        sb.append("mNotificationId=");
        sb.append(this.f5275a);
        sb.append(", mForegroundServiceType=");
        sb.append(this.f5276b);
        sb.append(", mNotification=");
        sb.append(this.f5277c);
        sb.append('}');
        return sb.toString();
    }
}
