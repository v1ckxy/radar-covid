package p213q.p217b.p301c.p302a.p311j0.p312a;

/* renamed from: q.b.c.a.j0.a.w */
public enum C3724w {
    DOUBLE(0, C3725a.f9273f, C3610d0.DOUBLE),
    FLOAT(1, C3725a.f9273f, C3610d0.FLOAT),
    INT64(2, C3725a.f9273f, C3610d0.LONG),
    UINT64(3, C3725a.f9273f, C3610d0.LONG),
    INT32(4, C3725a.f9273f, C3610d0.INT),
    FIXED64(5, C3725a.f9273f, C3610d0.LONG),
    FIXED32(6, C3725a.f9273f, C3610d0.INT),
    BOOL(7, C3725a.f9273f, C3610d0.BOOLEAN),
    STRING(8, C3725a.f9273f, C3610d0.STRING),
    MESSAGE(9, C3725a.f9273f, C3610d0.MESSAGE),
    BYTES(10, C3725a.f9273f, C3610d0.BYTE_STRING),
    UINT32(11, C3725a.f9273f, C3610d0.INT),
    ENUM(12, C3725a.f9273f, C3610d0.ENUM),
    SFIXED32(13, C3725a.f9273f, C3610d0.INT),
    SFIXED64(14, C3725a.f9273f, C3610d0.LONG),
    SINT32(15, C3725a.f9273f, C3610d0.INT),
    SINT64(16, C3725a.f9273f, C3610d0.LONG),
    GROUP(17, C3725a.f9273f, C3610d0.MESSAGE),
    DOUBLE_LIST(18, C3725a.f9274g, C3610d0.DOUBLE),
    FLOAT_LIST(19, C3725a.f9274g, C3610d0.FLOAT),
    INT64_LIST(20, C3725a.f9274g, C3610d0.LONG),
    UINT64_LIST(21, C3725a.f9274g, C3610d0.LONG),
    INT32_LIST(22, C3725a.f9274g, C3610d0.INT),
    FIXED64_LIST(23, C3725a.f9274g, C3610d0.LONG),
    FIXED32_LIST(24, C3725a.f9274g, C3610d0.INT),
    BOOL_LIST(25, C3725a.f9274g, C3610d0.BOOLEAN),
    STRING_LIST(26, C3725a.f9274g, C3610d0.STRING),
    MESSAGE_LIST(27, C3725a.f9274g, C3610d0.MESSAGE),
    BYTES_LIST(28, C3725a.f9274g, C3610d0.BYTE_STRING),
    UINT32_LIST(29, C3725a.f9274g, C3610d0.INT),
    ENUM_LIST(30, C3725a.f9274g, C3610d0.ENUM),
    SFIXED32_LIST(31, C3725a.f9274g, C3610d0.INT),
    SFIXED64_LIST(32, C3725a.f9274g, C3610d0.LONG),
    SINT32_LIST(33, C3725a.f9274g, C3610d0.INT),
    SINT64_LIST(34, C3725a.f9274g, C3610d0.LONG),
    DOUBLE_LIST_PACKED(35, C3725a.f9275h, C3610d0.DOUBLE),
    FLOAT_LIST_PACKED(36, C3725a.f9275h, C3610d0.FLOAT),
    INT64_LIST_PACKED(37, C3725a.f9275h, C3610d0.LONG),
    UINT64_LIST_PACKED(38, C3725a.f9275h, C3610d0.LONG),
    INT32_LIST_PACKED(39, C3725a.f9275h, C3610d0.INT),
    FIXED64_LIST_PACKED(40, C3725a.f9275h, C3610d0.LONG),
    FIXED32_LIST_PACKED(41, C3725a.f9275h, C3610d0.INT),
    BOOL_LIST_PACKED(42, C3725a.f9275h, C3610d0.BOOLEAN),
    UINT32_LIST_PACKED(43, C3725a.f9275h, C3610d0.INT),
    ENUM_LIST_PACKED(44, C3725a.f9275h, C3610d0.ENUM),
    SFIXED32_LIST_PACKED(45, C3725a.f9275h, C3610d0.INT),
    SFIXED64_LIST_PACKED(46, C3725a.f9275h, C3610d0.LONG),
    SINT32_LIST_PACKED(47, C3725a.f9275h, C3610d0.INT),
    SINT64_LIST_PACKED(48, C3725a.f9275h, C3610d0.LONG),
    GROUP_LIST(49, C3725a.f9274g, C3610d0.MESSAGE),
    MAP(50, C3725a.f9276i, C3610d0.VOID);
    

    /* renamed from: f0 */
    public static final C3724w[] f9249f0 = null;

    /* renamed from: e */
    public final int f9271e;

    /* renamed from: f */
    public final C3725a f9272f;

    /* renamed from: q.b.c.a.j0.a.w$a */
    public enum C3725a {

        /* renamed from: f */
        public static final C3725a f9273f = null;

        /* renamed from: g */
        public static final C3725a f9274g = null;

        /* renamed from: h */
        public static final C3725a f9275h = null;

        /* renamed from: i */
        public static final C3725a f9276i = null;

        /* renamed from: j */
        public static final /* synthetic */ C3725a[] f9277j = null;

        /* renamed from: e */
        public final boolean f9278e;

        /* access modifiers changed from: public */
        static {
            f9273f = new C3725a("SCALAR", 0, false);
            f9274g = new C3725a("VECTOR", 1, true);
            f9275h = new C3725a("PACKED_VECTOR", 2, true);
            C3725a aVar = new C3725a("MAP", 3, false);
            f9276i = aVar;
            f9277j = new C3725a[]{f9273f, f9274g, f9275h, aVar};
        }

        /* access modifiers changed from: public */
        C3725a(String str, int i, boolean z) {
            this.f9278e = z;
        }

        public static C3725a valueOf(String str) {
            return (C3725a) Enum.valueOf(C3725a.class, str);
        }

        public static C3725a[] values() {
            return (C3725a[]) f9277j.clone();
        }
    }

    /* access modifiers changed from: public */
    static {
        int i;
        C3724w[] values = values();
        f9249f0 = new C3724w[values.length];
        for (C3724w wVar : values) {
            f9249f0[wVar.f9271e] = wVar;
        }
    }

    /* access modifiers changed from: public */
    C3724w(int i, C3725a aVar, C3610d0 d0Var) {
        this.f9271e = i;
        this.f9272f = aVar;
        int ordinal = aVar.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            Class<?> cls = d0Var.f8994e;
        }
        if (aVar == C3725a.f9273f && d0Var.ordinal() != 6) {
        }
    }
}
