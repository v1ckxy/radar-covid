package p213q.p217b.p317d.p322h.p323e.p328m;

import java.nio.charset.Charset;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p317d.p322h.p323e.p328m.C4043b.C4045b;
import p213q.p217b.p317d.p322h.p323e.p328m.C4052f.C4054b;

/* renamed from: q.b.d.h.e.m.v */
public abstract class C4090v {

    /* renamed from: a */
    public static final Charset f9975a = Charset.forName("UTF-8");

    /* renamed from: q.b.d.h.e.m.v$a */
    public static abstract class C4091a {
        /* renamed from: a */
        public abstract C4090v mo10229a();
    }

    /* renamed from: q.b.d.h.e.m.v$b */
    public static abstract class C4092b {
    }

    /* renamed from: q.b.d.h.e.m.v$c */
    public static abstract class C4093c {

        /* renamed from: q.b.d.h.e.m.v$c$a */
        public static abstract class C4094a {
        }
    }

    /* renamed from: q.b.d.h.e.m.v$d */
    public static abstract class C4095d {

        /* renamed from: q.b.d.h.e.m.v$d$a */
        public static abstract class C4096a {

            /* renamed from: q.b.d.h.e.m.v$d$a$a */
            public static abstract class C4097a {
            }
        }

        /* renamed from: q.b.d.h.e.m.v$d$b */
        public static abstract class C4098b {
            /* renamed from: a */
            public abstract C4098b mo10242a(boolean z);

            /* renamed from: a */
            public abstract C4095d mo10243a();
        }

        /* renamed from: q.b.d.h.e.m.v$d$c */
        public static abstract class C4099c {

            /* renamed from: q.b.d.h.e.m.v$d$c$a */
            public static abstract class C4100a {
                /* renamed from: a */
                public abstract C4099c mo10253a();
            }
        }

        /* renamed from: q.b.d.h.e.m.v$d$d */
        public static abstract class C4101d {

            /* renamed from: q.b.d.h.e.m.v$d$d$a */
            public static abstract class C4102a {

                /* renamed from: q.b.d.h.e.m.v$d$d$a$a */
                public static abstract class C4103a {

                    /* renamed from: q.b.d.h.e.m.v$d$d$a$a$a */
                    public static abstract class C4104a {
                    }

                    /* renamed from: q.b.d.h.e.m.v$d$d$a$a$b */
                    public static abstract class C4105b {
                        /* renamed from: a */
                        public abstract C4103a mo10265a();
                    }

                    /* renamed from: q.b.d.h.e.m.v$d$d$a$a$c */
                    public static abstract class C4106c {
                    }

                    /* renamed from: q.b.d.h.e.m.v$d$d$a$a$d */
                    public static abstract class C4107d {
                    }

                    /* renamed from: q.b.d.h.e.m.v$d$d$a$a$e */
                    public static abstract class C4108e {

                        /* renamed from: q.b.d.h.e.m.v$d$d$a$a$e$a */
                        public static abstract class C4109a {

                            /* renamed from: q.b.d.h.e.m.v$d$d$a$a$e$a$a */
                            public static abstract class C4110a {
                                /* renamed from: a */
                                public abstract C4109a mo10281a();
                            }
                        }
                    }
                }
            }

            /* renamed from: q.b.d.h.e.m.v$d$d$b */
            public static abstract class C4111b {
                /* renamed from: a */
                public abstract C4111b mo10257a(C4102a aVar);

                /* renamed from: a */
                public abstract C4101d mo10258a();
            }

            /* renamed from: q.b.d.h.e.m.v$d$d$c */
            public static abstract class C4112c {

                /* renamed from: q.b.d.h.e.m.v$d$d$c$a */
                public static abstract class C4113a {
                    /* renamed from: a */
                    public abstract C4112c mo10285a();
                }
            }

            /* renamed from: q.b.d.h.e.m.v$d$d$d */
            public static abstract class C4114d {
            }
        }

        /* renamed from: q.b.d.h.e.m.v$d$e */
        public static abstract class C4115e {

            /* renamed from: q.b.d.h.e.m.v$d$e$a */
            public static abstract class C4116a {
                /* renamed from: a */
                public abstract C4115e mo10292a();
            }
        }

        /* renamed from: q.b.d.h.e.m.v$d$f */
        public static abstract class C4117f {
        }
    }

    /* renamed from: q.b.d.h.e.m.v$e */
    public enum C4118e {
        INCOMPLETE,
        JAVA,
        NATIVE
    }

    /* renamed from: b */
    public static C4091a m9515b() {
        return new C4045b();
    }

    /* renamed from: a */
    public abstract C4091a mo10225a();

    /* renamed from: a */
    public C4090v mo10297a(C4119w<C4101d> wVar) {
        C4043b bVar = (C4043b) this;
        if (bVar.f9845h != null) {
            C4091a a = mo10225a();
            C4095d dVar = bVar.f9845h;
            if (dVar != null) {
                C4054b bVar2 = new C4054b((C4052f) dVar, null);
                bVar2.f9881j = wVar;
                C4045b bVar3 = (C4045b) a;
                bVar3.f9853g = bVar2.mo10243a();
                return bVar3.mo10229a();
            }
            throw null;
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    /* renamed from: a */
    public C4090v mo10296a(long j, boolean z, String str) {
        C4091a a = mo10225a();
        C4095d dVar = ((C4043b) this).f9845h;
        if (dVar != null) {
            if (dVar != null) {
                C4054b bVar = new C4054b((C4052f) dVar, null);
                bVar.f9875d = Long.valueOf(j);
                bVar.f9876e = Boolean.valueOf(z);
                if (str != null) {
                    String str2 = Objects.EMPTY_STRING;
                    if (str2.isEmpty()) {
                        bVar.f9878g = new C4088u(str, null);
                        bVar.mo10243a();
                    } else {
                        throw new IllegalStateException(C1965a.m4751a("Missing required properties:", str2));
                    }
                }
                ((C4045b) a).f9853g = bVar.mo10243a();
            } else {
                throw null;
            }
        }
        return a.mo10229a();
    }
}
