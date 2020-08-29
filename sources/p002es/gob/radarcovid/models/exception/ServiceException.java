package p002es.gob.radarcovid.models.exception;

import com.google.gson.Gson;
import p002es.gob.radarcovid.models.response.ResponseError;
import p116io.jsonwebtoken.lang.Objects;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;
import p410v.C4725j0;
import p484y.C5263c0;

/* renamed from: es.gob.radarcovid.models.exception.ServiceException */
public final class ServiceException extends Exception {
    public static final Companion Companion = new Companion(null);
    public static final String MESSAGE_DEFAULT = "Internal server error";
    public static final String UNSPECIFIED_ERROR = "Can't get the detailed error message";

    /* renamed from: es.gob.radarcovid.models.exception.ServiceException$Companion */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C4636f fVar) {
            this();
        }

        private final String getMessageFromErrorBody(C4725j0 j0Var) {
            if (j0Var != null) {
                String message = ((ResponseError) new Gson().mo3075a(j0Var.mo11048a(), new ServiceException$Companion$getMessageFromErrorBody$1$1().getType())).getMessage();
                if (message != null) {
                    return message;
                }
            }
            return ServiceException.MESSAGE_DEFAULT;
        }

        public final <T> ServiceException from(C5263c0<T> c0Var) {
            if (c0Var != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(c0Var.f12549a.f11063i);
                    sb.append(" - ");
                    sb.append(getMessageFromErrorBody(c0Var.f12551c));
                    return new ServiceException(sb.toString());
                } catch (Exception unused) {
                    return new ServiceException(Objects.EMPTY_STRING);
                }
            } else {
                C4638h.m10271a("response");
                throw null;
            }
        }
    }

    public ServiceException(String str) {
        if (str != null) {
            super(str);
        } else {
            C4638h.m10271a("message");
            throw null;
        }
    }
}
