package defpackage;

import S.h.e.l.l.C0000;
import ijiami.C0001;
import ijiami.C0002;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0007 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f22short = {1360, 1371, 1356, 1371, 1300, 1359, 1358, 1363, 1366, 1300, 1403, 1352, 1352, 1371, 1347, 1398, 1363, 1353, 1358, 1730, 1737, 1758, 1737, 1670, 1729, 1735, 1670, 1774, 1729, 1732, 1741, 2528, 2539, 2556, 2539, 2468, 2559, 2558, 2531, 2534, 2468, 2507, 2552, 2552, 2539, 2547, 2502, 2531, 2553, 2558, 1806, 1794, 1800, 1798, 1831, 1798, 1819, 1830, 1807, 1798, 1806, 1798, 1805, 1815, 1808};

    /* JADX INFO: renamed from: ۟ۡ۟۟۠, reason: not valid java name and contains not printable characters */
    public static int m652(Object obj) {
        if (C0000.m24() <= 0) {
            return C0001.m60(obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۥۡۨۨ, reason: not valid java name and contains not printable characters */
    public static Class m653(Object obj) {
        if (C0001.m58() > 0) {
            return C0001.m61((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۨۥۧ, reason: not valid java name and contains not printable characters */
    public static String m654(Object obj, int i, int i2, int i3) {
        if (C0000.m24() <= 0) {
            return C0004.m624((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m655(Object obj, int i, int i2, int i3) {
        if (C0003.m429() > 0) {
            return C0000.m23((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ, reason: contains not printable characters */
    private static Object[] m657(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
        try {
            try {
                try {
                    return (Object[]) C0004.m603(C0004.m610(obj, m654(m658(), 1746746 ^ m652(C0001.m174()), 1755429 ^ m652(C0001.m115()), m652(C0001.m172()) ^ 1744935), new Class[]{m653(m654(m658(), 1753516 ^ m652(C0002.m180()), 1748691 ^ m652(C0002.m259()), m652(C0001.m138()) ^ 1753278)), m653(m654(m658(), 1751766 ^ m652(C0001.m70()), 1748782 ^ m652(C0001.m155()), m652(C0003.m451()) ^ 1747348)), m653(m655(m658(), 1749663 ^ m652(C0002.m325()), 1750553 ^ m652(C0004.m503()), m652(C0001.m178()) ^ 1745298))}), obj, new Object[]{arrayList, file, arrayList2});
                } catch (ClassNotFoundException e) {
                    throw new NoClassDefFoundError(C0004.m589(e));
                }
            } catch (ClassNotFoundException e2) {
                throw new NoClassDefFoundError(C0004.m589(e2));
            }
        } catch (ClassNotFoundException e3) {
            throw new NoClassDefFoundError(C0004.m589(e3));
        }
    }

    /* JADX INFO: renamed from: ۨۤۤ۟, reason: not valid java name and contains not printable characters */
    public static short[] m658() {
        if (C0001.m58() > 0) {
            return f22short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۤۤۦ, reason: not valid java name and contains not printable characters */
    public static Object[] m659(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0003.m429() >= 0) {
            return m657(obj, (ArrayList) obj2, (File) obj3, (ArrayList) obj4);
        }
        return null;
    }
}
