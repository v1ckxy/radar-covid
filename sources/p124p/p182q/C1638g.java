package p124p.p182q;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p124p.p182q.p183l.C1649a;
import p124p.p188t.p189a.C1669b;
import p124p.p188t.p189a.C1670c;
import p124p.p188t.p189a.C1670c.C1673c;
import p124p.p188t.p189a.C1675e;
import p124p.p188t.p189a.p190f.C1676a;
import p124p.p188t.p189a.p190f.C1678b;
import p124p.p188t.p189a.p190f.C1684f;

/* renamed from: p.q.g */
public abstract class C1638g {
    @Deprecated

    /* renamed from: a */
    public volatile C1669b f4809a;

    /* renamed from: b */
    public Executor f4810b;

    /* renamed from: c */
    public C1670c f4811c;

    /* renamed from: d */
    public final C1626e f4812d;

    /* renamed from: e */
    public boolean f4813e;

    /* renamed from: f */
    public boolean f4814f;
    @Deprecated

    /* renamed from: g */
    public List<C1640b> f4815g;

    /* renamed from: h */
    public final ReentrantReadWriteLock f4816h = new ReentrantReadWriteLock();

    /* renamed from: i */
    public final ThreadLocal<Integer> f4817i = new ThreadLocal<>();

    /* renamed from: p.q.g$a */
    public static class C1639a<T extends C1638g> {

        /* renamed from: a */
        public final Class<T> f4818a;

        /* renamed from: b */
        public final String f4819b;

        /* renamed from: c */
        public final Context f4820c;

        /* renamed from: d */
        public ArrayList<C1640b> f4821d;

        /* renamed from: e */
        public Executor f4822e;

        /* renamed from: f */
        public Executor f4823f;

        /* renamed from: g */
        public C1673c f4824g;

        /* renamed from: h */
        public boolean f4825h;

        /* renamed from: i */
        public C1641c f4826i = C1641c.AUTOMATIC;

        /* renamed from: j */
        public boolean f4827j = true;

        /* renamed from: k */
        public boolean f4828k;

        /* renamed from: l */
        public final C1642d f4829l = new C1642d();

        /* renamed from: m */
        public Set<Integer> f4830m;

        public C1639a(Context context, Class<T> cls, String str) {
            this.f4820c = context;
            this.f4818a = cls;
            this.f4819b = str;
        }

        /* renamed from: a */
        public C1639a<T> mo6421a(C1649a... aVarArr) {
            if (this.f4830m == null) {
                this.f4830m = new HashSet();
            }
            for (C1649a aVar : aVarArr) {
                this.f4830m.add(Integer.valueOf(aVar.f4862a));
                this.f4830m.add(Integer.valueOf(aVar.f4863b));
            }
            C1642d dVar = this.f4829l;
            if (dVar != null) {
                for (C1649a aVar2 : aVarArr) {
                    int i = aVar2.f4862a;
                    int i2 = aVar2.f4863b;
                    TreeMap treeMap = (TreeMap) dVar.f4835a.get(Integer.valueOf(i));
                    if (treeMap == null) {
                        treeMap = new TreeMap();
                        dVar.f4835a.put(Integer.valueOf(i), treeMap);
                    }
                    C1649a aVar3 = (C1649a) treeMap.get(Integer.valueOf(i2));
                    if (aVar3 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Overriding migration ");
                        sb.append(aVar3);
                        sb.append(" with ");
                        sb.append(aVar2);
                        Log.w("ROOM", sb.toString());
                    }
                    treeMap.put(Integer.valueOf(i2), aVar2);
                }
                return this;
            }
            throw null;
        }
    }

    /* renamed from: p.q.g$b */
    public static abstract class C1640b {
    }

    /* renamed from: p.q.g$c */
    public enum C1641c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING
    }

    /* renamed from: p.q.g$d */
    public static class C1642d {

        /* renamed from: a */
        public HashMap<Integer, TreeMap<Integer, C1649a>> f4835a = new HashMap<>();
    }

    public C1638g() {
        new ConcurrentHashMap();
        this.f4812d = new C1626e((WorkDatabase_Impl) this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* renamed from: a */
    public void mo6414a() {
        if (!this.f4813e) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
            }
        }
    }

    /* renamed from: b */
    public void mo6415b() {
        if (!mo6418e() && this.f4817i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    /* renamed from: c */
    public void mo6416c() {
        mo6414a();
        C1669b writableDatabase = this.f4811c.getWritableDatabase();
        this.f4812d.mo6398b(writableDatabase);
        ((C1676a) writableDatabase).f4930e.beginTransaction();
    }

    @Deprecated
    /* renamed from: d */
    public void mo6417d() {
        ((C1676a) this.f4811c.getWritableDatabase()).f4930e.endTransaction();
        if (!mo6418e()) {
            C1626e eVar = this.f4812d;
            if (eVar.f4773e.compareAndSet(false, true)) {
                eVar.f4772d.f4810b.execute(eVar.f4778j);
            }
        }
    }

    /* renamed from: e */
    public boolean mo6418e() {
        return ((C1676a) this.f4811c.getWritableDatabase()).f4930e.inTransaction();
    }

    /* renamed from: f */
    public boolean mo6419f() {
        C1669b bVar = this.f4809a;
        return bVar != null && ((C1676a) bVar).f4930e.isOpen();
    }

    @Deprecated
    /* renamed from: g */
    public void mo6420g() {
        ((C1676a) this.f4811c.getWritableDatabase()).f4930e.setTransactionSuccessful();
    }

    /* renamed from: a */
    public C1684f mo6413a(String str) {
        mo6414a();
        mo6415b();
        return new C1684f(((C1676a) this.f4811c.getWritableDatabase()).f4930e.compileStatement(str));
    }

    /* renamed from: a */
    public Cursor mo6412a(C1675e eVar, CancellationSignal cancellationSignal) {
        mo6414a();
        mo6415b();
        if (cancellationSignal == null) {
            return ((C1676a) this.f4811c.getWritableDatabase()).mo6491a(eVar);
        }
        C1676a aVar = (C1676a) this.f4811c.getWritableDatabase();
        return aVar.f4930e.rawQueryWithFactory(new C1678b(aVar, eVar), eVar.mo6426a(), C1676a.f4929f, null, cancellationSignal);
    }
}
