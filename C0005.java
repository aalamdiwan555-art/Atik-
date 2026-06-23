package defpackage;

import S.h.e.l.l.C0000;
import ijiami.C0001;
import ijiami.C0002;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0005 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f20short = {1961, 1926, 1930, 1923, 1931, 1999, 699, 757, 756, 751, 699, 765, 756, 750, 757, 767, 699, 754, 757, 699, 761, 721, 704, 732, 731, 720, 660, 1405, 1322, 1332, 1321, 1333, 1405, 1325, 1340, 1327, 1340, 1328, 1336, 1321, 1336, 1327, 1326, 1405, 629, 571, 570, 545, 629, 563, 570, 544, 571, 561, 629, 572, 571, 629};

    /* JADX INFO: renamed from: ۣۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m637() {
        if (C0003.m429() >= 0) {
            return f20short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static String m638(Object obj, int i, int i2, int i3) {
        if (C0003.m429() > 0) {
            return C0004.m624((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۢۡ۟, reason: not valid java name and contains not printable characters */
    public static String m639(Object obj, int i, int i2, int i3) {
        if (C0000.m24() <= 0) {
            return C0002.m309((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Field m640(Object obj, String str) {
        for (Class clsM206 = C0002.m206(obj); clsM206 != null; clsM206 = C0003.m354(clsM206)) {
            try {
                Field fieldM214 = C0002.m214(clsM206, str);
                if (!C0002.m288(fieldM214)) {
                    C0003.m384(fieldM214, true);
                }
                return fieldM214;
            } catch (NoSuchFieldException e) {
            }
        }
        throw new NoSuchFieldException(C0002.m279(C0003.m379(C0001.m111(new StringBuffer(), C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), m643(m637(), 1752737 ^ m642(C0002.m216()), 1749615 ^ m642(C0002.m348()), m642(C0002.m239()) ^ 1753765)), str))), m639(m637(), 1755341 ^ m642(C0003.m494()), 1752552 ^ m642(C0002.m223()), m642(C0004.m635()) ^ 1749117)))), C0002.m206(obj))));
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Method m641(Object obj, String str, Class... clsArr) throws NoSuchMethodException {
        for (Class clsM206 = C0002.m206(obj); clsM206 != null; clsM206 = C0003.m354(clsM206)) {
            try {
                Method methodM337 = C0002.m337(clsM206, str, clsArr);
                if (!C0001.m170(methodM337)) {
                    C0001.m148(methodM337, true);
                }
                return methodM337;
            } catch (NoSuchMethodException e) {
            }
        }
        throw new NoSuchMethodException(C0002.m279(C0003.m379(C0001.m111(new StringBuffer(), C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), C0002.m279(C0003.m379(C0001.m111(new StringBuffer(), C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), m639(m637(), 1749807 ^ m642(C0003.m403()), 1750779 ^ m642(C0004.m570()), m642(C0001.m85()) ^ 56899)), str))), m639(m637(), 1751641 ^ m642(C0004.m615()), 1753530 ^ m642(C0001.m106()), m642(C0003.m425()) ^ 1748600)))), C0001.m74(clsArr)))), m638(m637(), 1746702 ^ m642(C0003.m436()), 1749775 ^ m642(C0004.m502()), m642(C0002.m202()) ^ 1746198)))), C0002.m206(obj))));
    }

    /* JADX INFO: renamed from: ۦ۟ۤۢ, reason: contains not printable characters */
    public static int m642(Object obj) {
        if (C0001.m58() >= 0) {
            return C0001.m60(obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦۨۥۨ, reason: contains not printable characters */
    public static String m643(Object obj, int i, int i2, int i3) {
        if (C0003.m429() >= 0) {
            return C0001.m179((short[]) obj, i, i2, i3);
        }
        return null;
    }
}
