package p002es.gob.radarcovid.models.request;

import java.util.ArrayList;

/* renamed from: es.gob.radarcovid.models.request.RequestPostAnswers */
public final class RequestPostAnswers extends ArrayList<RequestPostAnswer> {
    public /* bridge */ boolean contains(RequestPostAnswer requestPostAnswer) {
        return super.contains(requestPostAnswer);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof RequestPostAnswer) {
            return contains((RequestPostAnswer) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(RequestPostAnswer requestPostAnswer) {
        return super.indexOf(requestPostAnswer);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof RequestPostAnswer) {
            return indexOf((RequestPostAnswer) obj);
        }
        return -1;
    }

    public /* bridge */ int lastIndexOf(RequestPostAnswer requestPostAnswer) {
        return super.lastIndexOf(requestPostAnswer);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof RequestPostAnswer) {
            return lastIndexOf((RequestPostAnswer) obj);
        }
        return -1;
    }

    public final /* bridge */ RequestPostAnswer remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(RequestPostAnswer requestPostAnswer) {
        return super.remove(requestPostAnswer);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof RequestPostAnswer) {
            return remove((RequestPostAnswer) obj);
        }
        return false;
    }

    public /* bridge */ RequestPostAnswer removeAt(int i) {
        return (RequestPostAnswer) super.remove(i);
    }

    public final /* bridge */ int size() {
        return getSize();
    }
}
