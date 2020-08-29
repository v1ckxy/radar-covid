package p002es.gob.radarcovid.models.exception;

import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.models.exception.MapperException */
public final class MapperException extends Exception {
    public final String detail;
    public final String title;

    public MapperException(String str, String str2) {
        if (str == null) {
            C4638h.m10271a("title");
            throw null;
        } else if (str2 != null) {
            this.title = str;
            this.detail = str2;
        } else {
            C4638h.m10271a("detail");
            throw null;
        }
    }

    public /* synthetic */ MapperException(String str, String str2, int i, C4636f fVar) {
        if ((i & 2) != 0) {
            str2 = "The types in the class fields do not match";
        }
        this(str, str2);
    }

    public Throwable getCause() {
        return new Throwable(this.detail);
    }

    public String getMessage() {
        return this.title;
    }
}
