package p002es.gob.radarcovid.models.response;

import java.util.ArrayList;

/* renamed from: es.gob.radarcovid.models.response.ResponseRegions */
public final class ResponseRegions extends ArrayList<ResponseRegionsItem> {
    public /* bridge */ boolean contains(ResponseRegionsItem responseRegionsItem) {
        return super.contains(responseRegionsItem);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ResponseRegionsItem) {
            return contains((ResponseRegionsItem) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(ResponseRegionsItem responseRegionsItem) {
        return super.indexOf(responseRegionsItem);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ResponseRegionsItem) {
            return indexOf((ResponseRegionsItem) obj);
        }
        return -1;
    }

    public /* bridge */ int lastIndexOf(ResponseRegionsItem responseRegionsItem) {
        return super.lastIndexOf(responseRegionsItem);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ResponseRegionsItem) {
            return lastIndexOf((ResponseRegionsItem) obj);
        }
        return -1;
    }

    public final /* bridge */ ResponseRegionsItem remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(ResponseRegionsItem responseRegionsItem) {
        return super.remove(responseRegionsItem);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof ResponseRegionsItem) {
            return remove((ResponseRegionsItem) obj);
        }
        return false;
    }

    public /* bridge */ ResponseRegionsItem removeAt(int i) {
        return (ResponseRegionsItem) super.remove(i);
    }

    public final /* bridge */ int size() {
        return getSize();
    }
}
