package p002es.gob.radarcovid.models.request;

import java.util.ArrayList;

/* renamed from: es.gob.radarcovid.models.request.RequestKpiReport */
public final class RequestKpiReport extends ArrayList<RequestKpi> {
    public /* bridge */ boolean contains(RequestKpi requestKpi) {
        return super.contains(requestKpi);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof RequestKpi) {
            return contains((RequestKpi) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(RequestKpi requestKpi) {
        return super.indexOf(requestKpi);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof RequestKpi) {
            return indexOf((RequestKpi) obj);
        }
        return -1;
    }

    public /* bridge */ int lastIndexOf(RequestKpi requestKpi) {
        return super.lastIndexOf(requestKpi);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof RequestKpi) {
            return lastIndexOf((RequestKpi) obj);
        }
        return -1;
    }

    public final /* bridge */ RequestKpi remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(RequestKpi requestKpi) {
        return super.remove(requestKpi);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof RequestKpi) {
            return remove((RequestKpi) obj);
        }
        return false;
    }

    public /* bridge */ RequestKpi removeAt(int i) {
        return (RequestKpi) super.remove(i);
    }

    public final /* bridge */ int size() {
        return getSize();
    }
}
