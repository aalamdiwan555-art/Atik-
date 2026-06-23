package defpackage;

import S.h.e.l.l.C0000;
import android.content.Context;
import ijiami.C0001;
import ijiami.C0002;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: ۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0013 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f25short = {872, 878, 2375, 1028, 1049, 1032, 1045, 1131, 1546, 1557, 1556, 1566, 1557, 2529, 2535, 1069, 1074, 1121, 1132, 1069, 1121, 288, 285, 285, 262, 295, 262, 283, 286, 1649, 1655, 1660, 1659, 1588, 1632, 1649, 1639, 1632, 2868, 2825, 2825, 2834, 2867, 2834, 2831, 2826, 2418, 2427, 2412, 2431, 2362, 2408, 2421, 2421, 2414, 2363, 977, 1004, 1004, 1015, 982, 1015, 1002, 1007, 1299, 1298, 1289, 1373, 1295, 1298, 1298, 1289, 1372, 832, 893, 893, 870, 839, 870, 891, 894, 2317, 2344, 2305, 2326, 2309, 2354, 2319, 2319, 2324, 2368, 2397, 2368, 2324, 2322, 2325, 2309, 2380, 2368, 2312, 2305, 2326, 2309, 2368, 2322, 2319, 2319, 2324, 2369, 3133, 3169, 3179, 3169, 3174, 3191, 3199, 3133, 3184, 3195, 3196, 3133, 3169, 3175, 3160, 3076, 3086, 3076, 3075, 3090, 3098, 3160, 3093, 3102, 3097, 3160, 3076, 3074, 1931, 2007, 2013, 2007, 2000, 1985, 1993, 1931, 2012, 1990, 1997, 1994, 1931, 2007, 2001, 1813, 1865, 1859, 1865, 1870, 1887, 1879, 1813, 1858, 1880, 1875, 1876, 1813, 1865, 1871};

    /* JADX INFO: renamed from: ۦ۠, reason: contains not printable characters */
    static boolean f26 = false;

    /* JADX INFO: renamed from: ۣ۟۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m675(Object obj) {
        if (C0003.m429() >= 0) {
            return m683((String) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static short[] m676() {
        if (C0000.m24() <= 0) {
            return f25short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m677(Object obj, int i, int i2, int i3) {
        if (C0003.m429() > 0) {
            return C0001.m179((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۤۡ, reason: not valid java name and contains not printable characters */
    public static String m678(Object obj, int i, int i2, int i3) {
        if (C0000.m24() <= 0) {
            return C0002.m309((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۥۥ, reason: not valid java name and contains not printable characters */
    public static int m679(Object obj) {
        if (C0001.m58() >= 0) {
            return C0001.m60(obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡۤۡۢ, reason: not valid java name and contains not printable characters */
    public static String m680(Object obj, int i, int i2, int i3) {
        if (C0002.m341() > 0) {
            return C0004.m624((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m681(java.lang.String r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0013.m681(java.lang.String):int");
    }

    /* JADX INFO: renamed from: ۥ۠, reason: contains not printable characters */
    public static boolean m682() {
        Process process = (Process) null;
        try {
            try {
                Process processM398 = C0003.m398(C0002.m322(), new String[]{m678(m676(), m679(C0003.m372()) ^ 1760, 1752577 ^ m679(C0003.m412()), m679(C0001.m130()) ^ 1756822), m680(m676(), 1747660 ^ m679(C0002.m273()), 1752463 ^ m679(C0003.m388()), m679(C0001.m163()) ^ 1755220)});
                if (C0001.m54(new BufferedReader(new InputStreamReader(C0004.m554(processM398)))) != null) {
                    if (processM398 != null) {
                        C0003.m418(processM398);
                    }
                    return true;
                }
                if (processM398 != null) {
                    C0003.m418(processM398);
                }
                return false;
            } catch (Throwable th) {
                if (process != null) {
                    C0003.m418(process);
                }
                return false;
            }
        } finally {
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00b1: MOVE (r8 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:23:0x00b1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX INFO: renamed from: ۥ۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m683(java.lang.String r9) throws java.lang.Throwable {
        /*
            r0 = 0
            java.lang.Process r0 = (java.lang.Process) r0
            java.lang.Runtime r1 = ijiami.C0002.m322()     // Catch: java.io.IOException -> La2 java.lang.Throwable -> Lbc
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch: java.io.IOException -> La2 java.lang.Throwable -> Lbc
            r2.<init>()     // Catch: java.io.IOException -> La2 java.lang.Throwable -> Lbc
            short[] r3 = m676()     // Catch: java.io.IOException -> La2 java.lang.Throwable -> Lbc
            java.lang.String r4 = defpackage.C0003.m355()     // Catch: java.io.IOException -> La2 java.lang.Throwable -> Lbc
            int r4 = m679(r4)     // Catch: java.io.IOException -> La2 java.lang.Throwable -> Lbc
            r5 = 1754467(0x1ac563, float:2.458532E-39)
            java.lang.String r6 = defpackage.C0004.m534()     // Catch: java.io.IOException -> La2 java.lang.Throwable -> Lbc
            int r6 = m679(r6)     // Catch: java.io.IOException -> La2 java.lang.Throwable -> Lbc
            r5 = r5 ^ r6
            r6 = 1751778(0x1abae2, float:2.454764E-39)
            java.lang.String r7 = defpackage.C0004.m580()     // Catch: java.io.IOException -> La2 java.lang.Throwable -> Lbc
            int r7 = m679(r7)     // Catch: java.io.IOException -> La2 java.lang.Throwable -> Lbc
            r6 = r6 ^ r7
            r7 = 55449(0xd899, float:7.77E-41)
            r4 = r4 ^ r7
            java.lang.String r3 = m678(r3, r5, r6, r4)     // Catch: java.io.IOException -> La2 java.lang.Throwable -> Lbc
            java.lang.StringBuffer r2 = ijiami.C0001.m111(r2, r3)     // Catch: java.io.IOException -> La2 java.lang.Throwable -> Lbc
            java.lang.StringBuffer r2 = ijiami.C0001.m111(r2, r9)     // Catch: java.io.IOException -> La2 java.lang.Throwable -> Lbc
            java.lang.String r2 = ijiami.C0002.m279(r2)     // Catch: java.io.IOException -> La2 java.lang.Throwable -> Lbc
            java.lang.Process r1 = defpackage.C0003.m395(r1, r2)     // Catch: java.io.IOException -> La2 java.lang.Throwable -> Lbc
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lba
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lba
            java.io.InputStream r3 = defpackage.C0004.m554(r1)     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lba
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lba
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lba
            java.lang.String r0 = ijiami.C0001.m54(r0)     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lba
            short[] r2 = m676()     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lba
            java.lang.String r3 = ijiami.C0001.m140()     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lba
            int r3 = m679(r3)     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lba
            r4 = 1755536(0x1ac990, float:2.46003E-39)
            java.lang.String r5 = ijiami.C0002.m346()     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lba
            int r5 = m679(r5)     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lba
            r4 = r4 ^ r5
            r5 = 1755520(0x1ac980, float:2.460007E-39)
            java.lang.String r6 = defpackage.C0004.m553()     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lba
            int r6 = m679(r6)     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lba
            r5 = r5 ^ r6
            r6 = 1751222(0x1ab8b6, float:2.453985E-39)
            r3 = r3 ^ r6
            m677(r2, r4, r5, r3)     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lba
            if (r0 == 0) goto La9
            int r2 = ijiami.C0002.m312(r0)     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lba
            r3 = 4
            if (r2 < r3) goto La9
            r2 = 3
            char r0 = defpackage.C0003.m466(r0, r2)     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lba
            r2 = 115(0x73, float:1.61E-43)
            if (r0 == r2) goto L9b
            r2 = 120(0x78, float:1.68E-43)
            if (r0 != r2) goto La9
        L9b:
            if (r1 == 0) goto La0
            defpackage.C0003.m418(r1)     // Catch: java.lang.Throwable -> Lb0 java.io.IOException -> Lba
        La0:
            r0 = 1
        La1:
            return r0
        La2:
            r1 = move-exception
            r8 = r1
            r1 = r0
            r0 = r8
        La6:
            ijiami.C0001.m76(r0)     // Catch: java.lang.Throwable -> Lb0
        La9:
            if (r1 == 0) goto Lae
            defpackage.C0003.m418(r1)
        Lae:
            r0 = 0
            goto La1
        Lb0:
            r0 = move-exception
            r8 = r1
            r1 = r0
            r0 = r8
        Lb4:
            if (r0 == 0) goto Lb9
            defpackage.C0003.m418(r0)
        Lb9:
            throw r1
        Lba:
            r0 = move-exception
            goto La6
        Lbc:
            r1 = move-exception
            goto Lb4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0013.m683(java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: ۥۡ, reason: contains not printable characters */
    public static boolean m684() {
        if (m688()) {
            m678(m676(), 1755631 ^ m679(C0002.m284()), 1748619 ^ m679(C0004.m586()), m679(C0004.m636()) ^ 1753389);
            m687(m676(), 1746768 ^ m679(C0004.m543()), 1750714 ^ m679(C0001.m52()), m679(C0001.m43()) ^ 1752698);
        } else {
            if (C0004.m515(m678(m676(), 1747878 ^ m679(C0002.m291()), 1746792 ^ m679(C0001.m72()), m679(C0004.m573()) ^ 56046)) != -1) {
                m680(m676(), 1752609 ^ m679(C0004.m596()), 1746711 ^ m679(C0004.m629()), m679(C0001.m122()) ^ 1755695);
                m677(m676(), 1747859 ^ m679(C0004.m581()), 1754373 ^ m679(C0003.m488()), m679(C0004.m558()) ^ 1751583);
                f26 = true;
            } else {
                m680(m676(), 1747679 ^ m679(C0004.m579()), 1752589 ^ m679(C0003.m493()), m679(C0003.m366()) ^ 1751391);
                m678(m676(), 1747837 ^ m679(C0003.m433()), 1748751 ^ m679(C0004.m626()), m679(C0001.m68()) ^ 1750807);
            }
        }
        return m688();
    }

    /* JADX INFO: renamed from: ۥۢ, reason: contains not printable characters */
    public static boolean m685() {
        if (C0001.m120(new File(m677(m676(), 1754464 ^ m679(C0002.m261()), 56333 ^ m679(C0002.m201()), m679(C0003.m459()) ^ 1750672)))) {
            if (m675(m678(m676(), 1752829 ^ m679(C0002.m343()), 1749680 ^ m679(C0003.m362()), m679(C0004.m564()) ^ 1752938))) {
                return true;
            }
        }
        if (C0001.m120(new File(m677(m676(), 1755246 ^ m679(C0004.m590()), 1748614 ^ m679(C0003.m397()), m679(C0002.m275()) ^ 1748004)))) {
            if (m675(m677(m676(), 1755222 ^ m679(C0004.m578()), 1753580 ^ m679(C0004.m533()), m679(C0004.m631()) ^ 56261))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ, reason: contains not printable characters */
    public static void m686(Context context) {
        if (C0002.m272() || C0002.m187() || C0001.m45()) {
            C0004.m544(0);
        }
    }

    /* JADX INFO: renamed from: ۦ۟۟ۦ, reason: contains not printable characters */
    public static String m687(Object obj, int i, int i2, int i3) {
        if (C0001.m58() > 0) {
            return C0000.m23((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۧۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m688() {
        if (C0002.m341() > 0) {
            return f26;
        }
        return false;
    }
}
