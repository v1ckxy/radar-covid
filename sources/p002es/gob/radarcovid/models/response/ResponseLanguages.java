package p002es.gob.radarcovid.models.response;

import java.util.ArrayList;

/* renamed from: es.gob.radarcovid.models.response.ResponseLanguages */
public final class ResponseLanguages extends ArrayList<ResponseLanguagesItem> {
    public /* bridge */ boolean contains(ResponseLanguagesItem responseLanguagesItem) {
        return super.contains(responseLanguagesItem);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ResponseLanguagesItem) {
            return contains((ResponseLanguagesItem) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(ResponseLanguagesItem responseLanguagesItem) {
        return super.indexOf(responseLanguagesItem);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ResponseLanguagesItem) {
            return indexOf((ResponseLanguagesItem) obj);
        }
        return -1;
    }

    public /* bridge */ int lastIndexOf(ResponseLanguagesItem responseLanguagesItem) {
        return super.lastIndexOf(responseLanguagesItem);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ResponseLanguagesItem) {
            return lastIndexOf((ResponseLanguagesItem) obj);
        }
        return -1;
    }

    public final /* bridge */ ResponseLanguagesItem remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(ResponseLanguagesItem responseLanguagesItem) {
        return super.remove(responseLanguagesItem);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof ResponseLanguagesItem) {
            return remove((ResponseLanguagesItem) obj);
        }
        return false;
    }

    public /* bridge */ ResponseLanguagesItem removeAt(int i) {
        return (ResponseLanguagesItem) super.remove(i);
    }

    public final /* bridge */ int size() {
        return getSize();
    }
}
