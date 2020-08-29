package p213q.p217b.p355e;

import java.lang.reflect.Field;
import java.util.Locale;
import p116io.jsonwebtoken.lang.Strings;

/* renamed from: q.b.e.c */
public enum C4320c implements C4327d {
    IDENTITY {
        /* renamed from: a */
        public String mo10535a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        /* renamed from: a */
        public String mo10535a(Field field) {
            return C4320c.m9839a(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        /* renamed from: a */
        public String mo10535a(Field field) {
            return C4320c.m9839a(C4320c.m9840a(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        /* renamed from: a */
        public String mo10535a(Field field) {
            return C4320c.m9840a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        /* renamed from: a */
        public String mo10535a(Field field) {
            return C4320c.m9840a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        /* renamed from: a */
        public String mo10535a(Field field) {
            return C4320c.m9840a(field.getName(), Strings.CURRENT_PATH).toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: a */
    public static String m9839a(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        int i2 = i + 1;
        if (i2 < str.length()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(upperCase);
            sb2.append(str.substring(i2));
            str2 = sb2.toString();
        } else {
            str2 = String.valueOf(upperCase);
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m9840a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}
