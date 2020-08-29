package p116io.jsonwebtoken.lang;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: io.jsonwebtoken.lang.Strings */
public final class Strings {
    public static final String CURRENT_PATH = ".";
    public static final char EXTENSION_SEPARATOR = '.';
    public static final String FOLDER_SEPARATOR = "/";
    public static final String TOP_PATH = "..";
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final String WINDOWS_FOLDER_SEPARATOR = "\\";

    public static String[] addStringToArray(String[] strArr, String str) {
        if (Objects.isEmpty((Object[]) strArr)) {
            return new String[]{str};
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[strArr.length] = str;
        return strArr2;
    }

    public static String applyRelativePath(String str, String str2) {
        String str3 = FOLDER_SEPARATOR;
        int lastIndexOf = str.lastIndexOf(str3);
        if (lastIndexOf == -1) {
            return str2;
        }
        String substring = str.substring(0, lastIndexOf);
        if (!str2.startsWith(str3)) {
            substring = C1965a.m4751a(substring, str3);
        }
        return C1965a.m4751a(substring, str2);
    }

    public static String arrayToCommaDelimitedString(Object[] objArr) {
        return arrayToDelimitedString(objArr, ",");
    }

    public static String arrayToDelimitedString(Object[] objArr, String str) {
        if (Objects.isEmpty(objArr)) {
            return Objects.EMPTY_STRING;
        }
        if (objArr.length == 1) {
            return Objects.nullSafeToString(objArr[0]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            if (i > 0) {
                sb.append(str);
            }
            sb.append(objArr[i]);
        }
        return sb.toString();
    }

    public static String capitalize(String str) {
        return changeFirstCharacterCase(str, true);
    }

    public static String changeFirstCharacterCase(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(z ? Character.toUpperCase(str.charAt(0)) : Character.toLowerCase(str.charAt(0)));
        sb.append(str.substring(1));
        return sb.toString();
    }

    public static CharSequence clean(CharSequence charSequence) {
        CharSequence trimWhitespace = trimWhitespace(charSequence);
        if (!hasLength(trimWhitespace)) {
            return null;
        }
        return trimWhitespace;
    }

    public static String clean(String str) {
        CharSequence clean = clean((CharSequence) str);
        if (clean != null) {
            return clean.toString();
        }
        return null;
    }

    public static String cleanPath(String str) {
        String str2;
        String str3;
        if (str == null) {
            return null;
        }
        String str4 = FOLDER_SEPARATOR;
        String replace = replace(str, WINDOWS_FOLDER_SEPARATOR, str4);
        int indexOf = replace.indexOf(":");
        if (indexOf != -1) {
            int i = indexOf + 1;
            str2 = replace.substring(0, i);
            replace = replace.substring(i);
        } else {
            str2 = Objects.EMPTY_STRING;
        }
        if (replace.startsWith(str4)) {
            str2 = C1965a.m4751a(str2, str4);
            replace = replace.substring(1);
        }
        String[] delimitedListToStringArray = delimitedListToStringArray(replace, str4);
        LinkedList linkedList = new LinkedList();
        int length = delimitedListToStringArray.length - 1;
        int i2 = 0;
        while (true) {
            str3 = TOP_PATH;
            if (length < 0) {
                break;
            }
            String str5 = delimitedListToStringArray[length];
            if (!CURRENT_PATH.equals(str5)) {
                if (str3.equals(str5)) {
                    i2++;
                } else if (i2 > 0) {
                    i2--;
                } else {
                    linkedList.add(0, str5);
                }
            }
            length--;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            linkedList.add(0, str3);
        }
        StringBuilder a = C1965a.m4756a(str2);
        a.append(collectionToDelimitedString(linkedList, str4));
        return a.toString();
    }

    public static String collectionToCommaDelimitedString(Collection<?> collection) {
        return collectionToDelimitedString(collection, ",");
    }

    public static String collectionToDelimitedString(Collection<?> collection, String str) {
        String str2 = Objects.EMPTY_STRING;
        return collectionToDelimitedString(collection, str, str2, str2);
    }

    public static String collectionToDelimitedString(Collection<?> collection, String str, String str2, String str3) {
        if (Collections.isEmpty((Collection) collection)) {
            return Objects.EMPTY_STRING;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            sb.append(str2);
            sb.append(it.next());
            sb.append(str3);
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static Set<String> commaDelimitedListToSet(String str) {
        TreeSet treeSet = new TreeSet();
        for (String add : commaDelimitedListToStringArray(str)) {
            treeSet.add(add);
        }
        return treeSet;
    }

    public static String[] commaDelimitedListToStringArray(String str) {
        return delimitedListToStringArray(str, ",");
    }

    public static String[] concatenateStringArrays(String[] strArr, String[] strArr2) {
        if (Objects.isEmpty((Object[]) strArr)) {
            return strArr2;
        }
        if (Objects.isEmpty((Object[]) strArr2)) {
            return strArr;
        }
        String[] strArr3 = new String[(strArr.length + strArr2.length)];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    public static boolean containsWhitespace(CharSequence charSequence) {
        if (!hasLength(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (Character.isWhitespace(charSequence.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsWhitespace(String str) {
        return containsWhitespace((CharSequence) str);
    }

    public static int countOccurrencesOf(String str, String str2) {
        int i = 0;
        if (str == null || str2 == null || str.length() == 0 || str2.length() == 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            int indexOf = str.indexOf(str2, i);
            if (indexOf == -1) {
                return i2;
            }
            i2++;
            i = indexOf + str2.length();
        }
    }

    public static String delete(String str, String str2) {
        return replace(str, str2, Objects.EMPTY_STRING);
    }

    public static String deleteAny(String str, String str2) {
        if (!hasLength(str) || !hasLength(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (str2.indexOf(charAt) == -1) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static String[] delimitedListToStringArray(String str, String str2) {
        return delimitedListToStringArray(str, str2, null);
    }

    public static String[] delimitedListToStringArray(String str, String str2, String str3) {
        int i = 0;
        if (str == null) {
            return new String[0];
        }
        if (str2 == null) {
            return new String[]{str};
        }
        ArrayList arrayList = new ArrayList();
        if (Objects.EMPTY_STRING.equals(str2)) {
            while (i < str.length()) {
                int i2 = i + 1;
                arrayList.add(deleteAny(str.substring(i, i2), str3));
                i = i2;
            }
        } else {
            while (true) {
                int indexOf = str.indexOf(str2, i);
                if (indexOf == -1) {
                    break;
                }
                arrayList.add(deleteAny(str.substring(i, indexOf), str3));
                i = str2.length() + indexOf;
            }
            if (str.length() > 0 && i <= str.length()) {
                arrayList.add(deleteAny(str.substring(i), str3));
            }
        }
        return toStringArray((Collection<String>) arrayList);
    }

    public static boolean endsWithIgnoreCase(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        if (str.endsWith(str2)) {
            return true;
        }
        if (str.length() < str2.length()) {
            return false;
        }
        return str.substring(str.length() - str2.length()).toLowerCase().equals(str2.toLowerCase());
    }

    public static String getFilename(String str) {
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(FOLDER_SEPARATOR);
        if (lastIndexOf != -1) {
            str = str.substring(lastIndexOf + 1);
        }
        return str;
    }

    public static String getFilenameExtension(String str) {
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1 && str.lastIndexOf(FOLDER_SEPARATOR) <= lastIndexOf) {
            return str.substring(lastIndexOf + 1);
        }
        return null;
    }

    public static boolean hasLength(CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 0;
    }

    public static boolean hasLength(String str) {
        return hasLength((CharSequence) str);
    }

    public static boolean hasText(CharSequence charSequence) {
        if (!hasLength(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasText(String str) {
        return hasText((CharSequence) str);
    }

    public static String[] mergeStringArrays(String[] strArr, String[] strArr2) {
        if (Objects.isEmpty((Object[]) strArr)) {
            return strArr2;
        }
        if (Objects.isEmpty((Object[]) strArr2)) {
            return strArr;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        for (String str : strArr2) {
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        return toStringArray((Collection<String>) arrayList);
    }

    public static Locale parseLocaleString(String str) {
        String[] strArr = tokenizeToStringArray(str, "_ ", false, false);
        int length = strArr.length;
        String str2 = Objects.EMPTY_STRING;
        String str3 = length > 0 ? strArr[0] : str2;
        String str4 = strArr.length > 1 ? strArr[1] : str2;
        validateLocalePart(str3);
        validateLocalePart(str4);
        if (strArr.length >= 2) {
            str2 = trimLeadingWhitespace(str.substring(str4.length() + str.indexOf(str4)));
            if (str2.startsWith("_")) {
                str2 = trimLeadingCharacter(str2, '_');
            }
        }
        if (str3.length() > 0) {
            return new Locale(str3, str4, str2);
        }
        return null;
    }

    public static boolean pathEquals(String str, String str2) {
        return cleanPath(str).equals(cleanPath(str2));
    }

    public static String quote(String str) {
        if (str == null) {
            return null;
        }
        String str2 = "'";
        return C1965a.m4752a(str2, str, str2);
    }

    public static Object quoteIfString(Object obj) {
        return obj instanceof String ? quote((String) obj) : obj;
    }

    public static String[] removeDuplicateStrings(String[] strArr) {
        if (Objects.isEmpty((Object[]) strArr)) {
            return strArr;
        }
        TreeSet treeSet = new TreeSet();
        for (String add : strArr) {
            treeSet.add(add);
        }
        return toStringArray((Collection<String>) treeSet);
    }

    public static String replace(String str, String str2, String str3) {
        if (!hasLength(str) || !hasLength(str2) || str3 == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int indexOf = str.indexOf(str2);
        int length = str2.length();
        while (indexOf >= 0) {
            sb.append(str.substring(i, indexOf));
            sb.append(str3);
            i = indexOf + length;
            indexOf = str.indexOf(str2, i);
        }
        sb.append(str.substring(i));
        return sb.toString();
    }

    public static String[] sortStringArray(String[] strArr) {
        if (Objects.isEmpty((Object[]) strArr)) {
            return new String[0];
        }
        Arrays.sort(strArr);
        return strArr;
    }

    public static String[] split(String str, String str2) {
        if (!hasLength(str) || !hasLength(str2)) {
            return null;
        }
        int indexOf = str.indexOf(str2);
        if (indexOf < 0) {
            return null;
        }
        return new String[]{str.substring(0, indexOf), str.substring(str2.length() + indexOf)};
    }

    public static Properties splitArrayElementsIntoProperties(String[] strArr, String str) {
        return splitArrayElementsIntoProperties(strArr, str, null);
    }

    public static Properties splitArrayElementsIntoProperties(String[] strArr, String str, String str2) {
        if (Objects.isEmpty((Object[]) strArr)) {
            return null;
        }
        Properties properties = new Properties();
        for (String str3 : strArr) {
            if (str2 != null) {
                str3 = deleteAny(str3, str2);
            }
            String[] split = split(str3, str);
            if (split != null) {
                properties.setProperty(split[0].trim(), split[1].trim());
            }
        }
        return properties;
    }

    public static boolean startsWithIgnoreCase(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        if (str.startsWith(str2)) {
            return true;
        }
        if (str.length() < str2.length()) {
            return false;
        }
        return str.substring(0, str2.length()).toLowerCase().equals(str2.toLowerCase());
    }

    public static String stripFilenameExtension(String str) {
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(46);
        return (lastIndexOf != -1 && str.lastIndexOf(FOLDER_SEPARATOR) <= lastIndexOf) ? str.substring(0, lastIndexOf) : str;
    }

    public static boolean substringMatch(CharSequence charSequence, int i, CharSequence charSequence2) {
        for (int i2 = 0; i2 < charSequence2.length(); i2++) {
            int i3 = i + i2;
            if (i3 >= charSequence.length() || charSequence.charAt(i3) != charSequence2.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    public static String toLanguageTag(Locale locale) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        if (hasText(locale.getCountry())) {
            StringBuilder a = C1965a.m4756a("-");
            a.append(locale.getCountry());
            str = a.toString();
        } else {
            str = Objects.EMPTY_STRING;
        }
        sb.append(str);
        return sb.toString();
    }

    public static String[] toStringArray(Collection<String> collection) {
        if (collection == null) {
            return null;
        }
        return (String[]) collection.toArray(new String[collection.size()]);
    }

    public static String[] toStringArray(Enumeration<String> enumeration) {
        if (enumeration == null) {
            return null;
        }
        ArrayList list = Collections.list(enumeration);
        return (String[]) list.toArray(new String[list.size()]);
    }

    public static String[] tokenizeToStringArray(String str, String str2) {
        return tokenizeToStringArray(str, str2, true, true);
    }

    public static String[] tokenizeToStringArray(String str, String str2, boolean z, boolean z2) {
        if (str == null) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (z) {
                nextToken = nextToken.trim();
            }
            if (!z2 || nextToken.length() > 0) {
                arrayList.add(nextToken);
            }
        }
        return toStringArray((Collection<String>) arrayList);
    }

    public static String trimAllWhitespace(String str) {
        if (!hasLength(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        while (sb.length() > i) {
            if (Character.isWhitespace(sb.charAt(i))) {
                sb.deleteCharAt(i);
            } else {
                i++;
            }
        }
        return sb.toString();
    }

    public static String[] trimArrayElements(String[] strArr) {
        if (Objects.isEmpty((Object[]) strArr)) {
            return new String[0];
        }
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            strArr2[i] = str != null ? str.trim() : null;
        }
        return strArr2;
    }

    public static String trimLeadingCharacter(String str, char c) {
        if (!hasLength(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() > 0 && sb.charAt(0) == c) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public static String trimLeadingWhitespace(String str) {
        if (!hasLength(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() > 0 && Character.isWhitespace(sb.charAt(0))) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public static String trimTrailingCharacter(String str, char c) {
        if (!hasLength(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String trimTrailingWhitespace(String str) {
        if (!hasLength(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() > 0 && Character.isWhitespace(sb.charAt(sb.length() - 1))) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static CharSequence trimWhitespace(CharSequence charSequence) {
        if (!hasLength(charSequence)) {
            return charSequence;
        }
        int length = charSequence.length();
        int i = 0;
        while (i < length && Character.isWhitespace(charSequence.charAt(i))) {
            i++;
        }
        int i2 = length;
        while (i < length && Character.isWhitespace(charSequence.charAt(i2 - 1))) {
            i2--;
        }
        if (i > 0 || i2 < length) {
            charSequence = charSequence.subSequence(i, i2);
        }
        return charSequence;
    }

    public static String trimWhitespace(String str) {
        return (String) trimWhitespace((CharSequence) str);
    }

    public static String uncapitalize(String str) {
        return changeFirstCharacterCase(str, false);
    }

    public static String unqualify(String str) {
        return unqualify(str, '.');
    }

    public static String unqualify(String str, char c) {
        return str.substring(str.lastIndexOf(c) + 1);
    }

    public static void validateLocalePart(String str) {
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '_' || charAt == ' ' || Character.isLetterOrDigit(charAt)) {
                i++;
            } else {
                throw new IllegalArgumentException(C1965a.m4752a("Locale part \"", str, "\" contains invalid characters"));
            }
        }
    }
}
