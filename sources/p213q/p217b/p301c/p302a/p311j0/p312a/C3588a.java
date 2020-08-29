package p213q.p217b.p301c.p302a.p311j0.p312a;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3588a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3588a.C3589a;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3635j.C3641f;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3670m.C3675e;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3706s0.C3707a;

/* renamed from: q.b.c.a.j0.a.a */
public abstract class C3588a<MessageType extends C3588a<MessageType, BuilderType>, BuilderType extends C3589a<MessageType, BuilderType>> implements C3706s0 {
    public int memoizedHashCode = 0;

    /* renamed from: q.b.c.a.j0.a.a$a */
    public static abstract class C3589a<MessageType extends C3588a<MessageType, BuilderType>, BuilderType extends C3589a<MessageType, BuilderType>> implements C3707a {

        /* renamed from: q.b.c.a.j0.a.a$a$a */
        public static final class C3590a extends FilterInputStream {

            /* renamed from: e */
            public int f8968e;

            public C3590a(InputStream inputStream, int i) {
                super(inputStream);
                this.f8968e = i;
            }

            public int available() {
                return Math.min(super.available(), this.f8968e);
            }

            public int read() {
                if (this.f8968e <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f8968e--;
                }
                return read;
            }

            public int read(byte[] bArr, int i, int i2) {
                int i3 = this.f8968e;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.f8968e -= read;
                }
                return read;
            }

            public long skip(long j) {
                long skip = super.skip(Math.min(j, (long) this.f8968e));
                if (skip >= 0) {
                    this.f8968e = (int) (((long) this.f8968e) - skip);
                }
                return skip;
            }
        }

        @Deprecated
        public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll(iterable, (List) collection);
        }

        public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            C3594b0.m8164a(iterable);
            if (iterable instanceof C3627h0) {
                List q = ((C3627h0) iterable).mo9638q();
                C3627h0 h0Var = (C3627h0) list;
                int size = list.size();
                for (Object next : q) {
                    if (next == null) {
                        StringBuilder a = C1965a.m4756a("Element at index ");
                        a.append(h0Var.size() - size);
                        a.append(" is null.");
                        String sb = a.toString();
                        int size2 = h0Var.size();
                        while (true) {
                            size2--;
                            if (size2 >= size) {
                                h0Var.remove(size2);
                            } else {
                                throw new NullPointerException(sb);
                            }
                        }
                    } else if (next instanceof C3635j) {
                        h0Var.mo9633a((C3635j) next);
                    } else {
                        h0Var.add((String) next);
                    }
                }
            } else if (iterable instanceof C3592a1) {
                list.addAll((Collection) iterable);
            } else {
                addAllCheckingNulls(iterable, list);
            }
        }

        public static <T> void addAllCheckingNulls(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size = list.size();
            for (Object next : iterable) {
                if (next == null) {
                    StringBuilder a = C1965a.m4756a("Element at index ");
                    a.append(list.size() - size);
                    a.append(" is null.");
                    String sb = a.toString();
                    int size2 = list.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            list.remove(size2);
                        } else {
                            throw new NullPointerException(sb);
                        }
                    }
                } else {
                    list.add(next);
                }
            }
        }

        private String getReadingExceptionMessage(String str) {
            StringBuilder a = C1965a.m4756a("Reading ");
            a.append(getClass().getName());
            a.append(" from a ");
            a.append(str);
            a.append(" threw an IOException (should never happen).");
            return a.toString();
        }

        public static C3669l1 newUninitializedMessageException(C3706s0 s0Var) {
            return new C3669l1();
        }

        public abstract /* bridge */ /* synthetic */ Object clone();

        public abstract BuilderType clone();

        public abstract /* bridge */ /* synthetic */ C3707a clone();

        public abstract BuilderType internalMergeFrom(MessageType messagetype);

        public boolean mergeDelimitedFrom(InputStream inputStream) {
            return mergeDelimitedFrom(inputStream, C3697r.m8878a());
        }

        public boolean mergeDelimitedFrom(InputStream inputStream, C3697r rVar) {
            int read = inputStream.read();
            if (read == -1) {
                return false;
            }
            mergeFrom((InputStream) new C3590a(inputStream, C3656k.m8443a(read, inputStream)), rVar);
            return true;
        }

        public BuilderType mergeFrom(InputStream inputStream) {
            C3656k a = C3656k.m8445a(inputStream);
            mergeFrom(a);
            a.mo9733a(0);
            return this;
        }

        public BuilderType mergeFrom(InputStream inputStream, C3697r rVar) {
            C3656k a = C3656k.m8445a(inputStream);
            mergeFrom(a, rVar);
            a.mo9733a(0);
            return this;
        }

        public BuilderType mergeFrom(C3635j jVar) {
            try {
                C3656k f = jVar.mo9667f();
                mergeFrom(f);
                f.mo9733a(0);
                return this;
            } catch (C3606c0 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        public BuilderType mergeFrom(C3635j jVar, C3697r rVar) {
            try {
                C3656k f = jVar.mo9667f();
                mergeFrom(f, rVar);
                f.mo9733a(0);
                return this;
            } catch (C3606c0 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        public BuilderType mergeFrom(C3656k kVar) {
            return mergeFrom(kVar, C3697r.m8878a());
        }

        public abstract BuilderType mergeFrom(C3656k kVar, C3697r rVar);

        public BuilderType mergeFrom(C3706s0 s0Var) {
            if (getDefaultInstanceForType().getClass().isInstance(s0Var)) {
                return internalMergeFrom((C3588a) s0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        public BuilderType mergeFrom(byte[] bArr) {
            return mergeFrom(bArr, 0, bArr.length);
        }

        public abstract BuilderType mergeFrom(byte[] bArr, int i, int i2);

        public abstract BuilderType mergeFrom(byte[] bArr, int i, int i2, C3697r rVar);

        public BuilderType mergeFrom(byte[] bArr, C3697r rVar) {
            return mergeFrom(bArr, 0, bArr.length, rVar);
        }

        public abstract /* bridge */ /* synthetic */ C3707a mergeFrom(C3656k kVar, C3697r rVar);

        public abstract /* bridge */ /* synthetic */ C3707a mergeFrom(byte[] bArr, int i, int i2);

        public abstract /* bridge */ /* synthetic */ C3707a mergeFrom(byte[] bArr, int i, int i2, C3697r rVar);
    }

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        C3589a.addAll(iterable, (List) collection);
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        C3589a.addAll(iterable, list);
    }

    public static void checkByteStringIsUtf8(C3635j jVar) {
        if (!jVar.mo9663c()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        StringBuilder a = C1965a.m4756a("Serializing ");
        a.append(getClass().getName());
        a.append(" to a ");
        a.append(str);
        a.append(" threw an IOException (should never happen).");
        return a.toString();
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(C3625g1 g1Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int c = g1Var.mo9650c(this);
        setMemoizedSerializedSize(c);
        return c;
    }

    public C3669l1 newUninitializedMessageException() {
        return new C3669l1();
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            C3670m b = C3670m.m8646b(bArr);
            writeTo(b);
            if (b.mo9797a() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    public C3635j toByteString() {
        try {
            C3641f g = C3635j.m8393g(getSerializedSize());
            writeTo(g.f9039a);
            return g.mo9678a();
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int i = C3670m.m8671i(serializedSize) + serializedSize;
        if (i > 4096) {
            i = 4096;
        }
        C3675e eVar = new C3675e(outputStream, i);
        eVar.mo9814c(serializedSize);
        writeTo(eVar);
        if (eVar.f9108f > 0) {
            eVar.mo9827i();
        }
    }

    public void writeTo(OutputStream outputStream) {
        C3675e eVar = new C3675e(outputStream, C3670m.m8661f(getSerializedSize()));
        writeTo(eVar);
        if (eVar.f9108f > 0) {
            eVar.mo9827i();
        }
    }
}
