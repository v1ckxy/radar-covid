package p124p.p165i.p166a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p124p.p165i.p166a.C1455b.C1456a;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.i.a.a */
public abstract class C1452a extends BaseAdapter implements Filterable, C1456a {

    /* renamed from: e */
    public boolean f4259e;

    /* renamed from: f */
    public boolean f4260f;

    /* renamed from: g */
    public Cursor f4261g;

    /* renamed from: h */
    public Context f4262h;

    /* renamed from: i */
    public int f4263i;

    /* renamed from: j */
    public C1453a f4264j;

    /* renamed from: k */
    public DataSetObserver f4265k;

    /* renamed from: l */
    public C1455b f4266l;

    /* renamed from: p.i.a.a$a */
    public class C1453a extends ContentObserver {
        public C1453a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C1452a aVar = C1452a.this;
            if (aVar.f4260f) {
                Cursor cursor = aVar.f4261g;
                if (cursor != null && !cursor.isClosed()) {
                    aVar.f4259e = aVar.f4261g.requery();
                }
            }
        }
    }

    /* renamed from: p.i.a.a$b */
    public class C1454b extends DataSetObserver {
        public C1454b() {
        }

        public void onChanged() {
            C1452a aVar = C1452a.this;
            aVar.f4259e = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C1452a aVar = C1452a.this;
            aVar.f4259e = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public C1452a(Context context, Cursor cursor, boolean z) {
        C1454b bVar;
        boolean z2 = true;
        boolean z3 = z ? true : true;
        if (z3 && true) {
            z3 |= true;
            this.f4260f = true;
        } else {
            this.f4260f = false;
        }
        if (cursor == null) {
            z2 = false;
        }
        this.f4261g = cursor;
        this.f4259e = z2;
        this.f4262h = context;
        this.f4263i = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if (z3 & true) {
            this.f4264j = new C1453a();
            bVar = new C1454b();
        } else {
            bVar = null;
            this.f4264j = null;
        }
        this.f4265k = bVar;
        if (z2) {
            C1453a aVar = this.f4264j;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f4265k;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: a */
    public abstract View mo5276a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: a */
    public void mo5277a(Cursor cursor) {
        Cursor cursor2 = this.f4261g;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C1453a aVar = this.f4264j;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                DataSetObserver dataSetObserver = this.f4265k;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f4261g = cursor;
            if (cursor != null) {
                C1453a aVar2 = this.f4264j;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                DataSetObserver dataSetObserver2 = this.f4265k;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f4263i = cursor.getColumnIndexOrThrow("_id");
                this.f4259e = true;
                notifyDataSetChanged();
            } else {
                this.f4263i = -1;
                this.f4259e = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* renamed from: a */
    public abstract void mo5278a(View view, Context context, Cursor cursor);

    /* renamed from: b */
    public abstract CharSequence mo5279b(Cursor cursor);

    public int getCount() {
        if (this.f4259e) {
            Cursor cursor = this.f4261g;
            if (cursor != null) {
                return cursor.getCount();
            }
        }
        return 0;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f4259e) {
            return null;
        }
        this.f4261g.moveToPosition(i);
        if (view == null) {
            C1457c cVar = (C1457c) this;
            view = cVar.f4272o.inflate(cVar.f4271n, viewGroup, false);
        }
        mo5278a(view, this.f4262h, this.f4261g);
        return view;
    }

    public Filter getFilter() {
        if (this.f4266l == null) {
            this.f4266l = new C1455b(this);
        }
        return this.f4266l;
    }

    public Object getItem(int i) {
        if (this.f4259e) {
            Cursor cursor = this.f4261g;
            if (cursor != null) {
                cursor.moveToPosition(i);
                return this.f4261g;
            }
        }
        return null;
    }

    public long getItemId(int i) {
        if (this.f4259e) {
            Cursor cursor = this.f4261g;
            if (cursor != null && cursor.moveToPosition(i)) {
                return this.f4261g.getLong(this.f4263i);
            }
        }
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f4259e) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f4261g.moveToPosition(i)) {
            if (view == null) {
                view = mo5276a(this.f4262h, this.f4261g, viewGroup);
            }
            mo5278a(view, this.f4262h, this.f4261g);
            return view;
        } else {
            throw new IllegalStateException(C1965a.m4761b("couldn't move cursor to position ", i));
        }
    }
}
