package p002es.gob.radarcovid.models.response;

import java.util.ArrayList;

/* renamed from: es.gob.radarcovid.models.response.ResponseQuestions */
public final class ResponseQuestions extends ArrayList<ResponseQuestion> {
    public /* bridge */ boolean contains(ResponseQuestion responseQuestion) {
        return super.contains(responseQuestion);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ResponseQuestion) {
            return contains((ResponseQuestion) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(ResponseQuestion responseQuestion) {
        return super.indexOf(responseQuestion);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ResponseQuestion) {
            return indexOf((ResponseQuestion) obj);
        }
        return -1;
    }

    public /* bridge */ int lastIndexOf(ResponseQuestion responseQuestion) {
        return super.lastIndexOf(responseQuestion);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ResponseQuestion) {
            return lastIndexOf((ResponseQuestion) obj);
        }
        return -1;
    }

    public final /* bridge */ ResponseQuestion remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(ResponseQuestion responseQuestion) {
        return super.remove(responseQuestion);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof ResponseQuestion) {
            return remove((ResponseQuestion) obj);
        }
        return false;
    }

    public /* bridge */ ResponseQuestion removeAt(int i) {
        return (ResponseQuestion) super.remove(i);
    }

    public final /* bridge */ int size() {
        return getSize();
    }
}
