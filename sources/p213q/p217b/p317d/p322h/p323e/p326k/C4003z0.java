package p213q.p217b.p317d.p322h.p323e.p326k;

import android.os.Looper;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p218a.p231b.p270l.C3239a;
import p213q.p217b.p218a.p231b.p270l.C3255i;
import p213q.p217b.p218a.p231b.p270l.C3257j;

/* renamed from: q.b.d.h.e.k.z0 */
public final class C4003z0 {

    /* renamed from: a */
    public static final FilenameFilter f9784a = new C4004a();

    /* renamed from: b */
    public static final ExecutorService f9785b = C2286e.m5207a("awaitEvenIfOnMainThread task continuation executor");

    /* renamed from: q.b.d.h.e.k.z0$a */
    public class C4004a implements FilenameFilter {
        public boolean accept(File file, String str) {
            return true;
        }
    }

    /* renamed from: q.b.d.h.e.k.z0$b */
    public class C4005b implements C3239a<T, Void> {

        /* renamed from: a */
        public final /* synthetic */ C3257j f9786a;

        public C4005b(C3257j jVar) {
            this.f9786a = jVar;
        }

        /* renamed from: a */
        public Object mo8913a(C3255i iVar) {
            if (iVar.mo8936d()) {
                this.f9786a.mo8941a(iVar.mo8931b());
            } else {
                this.f9786a.mo8940a(iVar.mo8920a());
            }
            return null;
        }
    }

    /* renamed from: q.b.d.h.e.k.z0$c */
    public class C4006c implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ Callable f9787e;

        /* renamed from: f */
        public final /* synthetic */ C3257j f9788f;

        /* renamed from: q.b.d.h.e.k.z0$c$a */
        public class C4007a implements C3239a<T, Void> {
            public C4007a() {
            }

            /* renamed from: a */
            public Object mo8913a(C3255i iVar) {
                if (iVar.mo8936d()) {
                    C3257j jVar = C4006c.this.f9788f;
                    jVar.f8128a.mo8930a(iVar.mo8931b());
                } else {
                    C3257j jVar2 = C4006c.this.f9788f;
                    jVar2.f8128a.mo8929a(iVar.mo8920a());
                }
                return null;
            }
        }

        public C4006c(Callable callable, C3257j jVar) {
            this.f9787e = callable;
            this.f9788f = jVar;
        }

        public void run() {
            try {
                ((C3255i) this.f9787e.call()).mo8928a((C3239a<TResult, TContinuationResult>) new C4007a<TResult,TContinuationResult>());
            } catch (Exception e) {
                this.f9788f.f8128a.mo8929a(e);
            }
        }
    }

    /* renamed from: q.b.d.h.e.k.z0$d */
    public class C4008d implements C3239a<T, Object> {

        /* renamed from: a */
        public final /* synthetic */ CountDownLatch f9790a;

        public C4008d(CountDownLatch countDownLatch) {
            this.f9790a = countDownLatch;
        }

        /* renamed from: a */
        public Object mo8913a(C3255i<T> iVar) {
            this.f9790a.countDown();
            return null;
        }
    }

    /* renamed from: a */
    public static int m9438a(File file, File file2, int i, Comparator<File> comparator) {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        File[] listFiles2 = file2.listFiles(f9784a);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        if (listFiles2 == null) {
            listFiles2 = new File[0];
        }
        arrayList.addAll(Arrays.asList(listFiles));
        arrayList.addAll(Arrays.asList(listFiles2));
        return m9440a(arrayList, i, comparator);
    }

    /* renamed from: a */
    public static int m9439a(File file, FilenameFilter filenameFilter, int i, Comparator<File> comparator) {
        File[] listFiles = file.listFiles(filenameFilter);
        if (listFiles == null) {
            return 0;
        }
        return m9440a(Arrays.asList(listFiles), i, comparator);
    }

    /* renamed from: a */
    public static int m9440a(List<File> list, int i, Comparator<File> comparator) {
        int size = list.size();
        Collections.sort(list, comparator);
        for (File file : list) {
            if (size <= i) {
                return size;
            }
            m9444a(file);
            size--;
        }
        return size;
    }

    /* renamed from: a */
    public static <T> T m9441a(C3255i<T> iVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        iVar.mo8922a((Executor) f9785b, (C3239a<TResult, TContinuationResult>) new C4008d<TResult,TContinuationResult>(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (iVar.mo8935c()) {
            return iVar.mo8931b();
        }
        throw new TimeoutException();
    }

    /* renamed from: a */
    public static <T> C3255i<T> m9442a(Executor executor, Callable<C3255i<T>> callable) {
        C3257j jVar = new C3257j();
        executor.execute(new C4006c(callable, jVar));
        return jVar.f8128a;
    }

    /* renamed from: a */
    public static void m9444a(File file) {
        if (file.isDirectory()) {
            for (File a : file.listFiles()) {
                m9444a(a);
            }
        }
        file.delete();
    }

    /* renamed from: a */
    public static <T> C3255i<T> m9443a(C3255i<T> iVar, C3255i<T> iVar2) {
        C3257j jVar = new C3257j();
        C4005b bVar = new C4005b(jVar);
        iVar.mo8928a((C3239a<TResult, TContinuationResult>) bVar);
        iVar2.mo8928a((C3239a<TResult, TContinuationResult>) bVar);
        return jVar.f8128a;
    }
}
