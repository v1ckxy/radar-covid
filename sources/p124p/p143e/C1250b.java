package p124p.p143e;

import java.util.Map;

/* renamed from: p.e.b */
public class C1250b extends C1255g<E, E> {

    /* renamed from: d */
    public final /* synthetic */ C1251c f3542d;

    public C1250b(C1251c cVar) {
        this.f3542d = cVar;
    }

    /* renamed from: a */
    public int mo5481a(Object obj) {
        return this.f3542d.indexOf(obj);
    }

    /* renamed from: a */
    public Object mo5482a(int i, int i2) {
        return this.f3542d.f3550f[i];
    }

    /* renamed from: a */
    public E mo5483a(int i, E e) {
        throw new UnsupportedOperationException("not a map");
    }

    /* renamed from: a */
    public void mo5484a() {
        this.f3542d.clear();
    }

    /* renamed from: a */
    public void mo5485a(int i) {
        this.f3542d.mo5499f(i);
    }

    /* renamed from: a */
    public void mo5486a(E e, E e2) {
        this.f3542d.add(e);
    }

    /* renamed from: b */
    public int mo5487b(Object obj) {
        return this.f3542d.indexOf(obj);
    }

    /* renamed from: b */
    public Map<E, E> mo5488b() {
        throw new UnsupportedOperationException("not a map");
    }

    /* renamed from: c */
    public int mo5489c() {
        return this.f3542d.f3551g;
    }
}
