package defpackage;

import S.h.e.l.l.C0000;
import android.content.Context;
import android.telephony.TelephonyManager;
import ijiami.C0001;
import ijiami.C0002;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0015 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f28short = {1553, 1553, 1553, 1553, 1553, 1553, 1553, 1553, 1553, 1553, 1553, 1553, 1553, 1553, 1553, 2869, 2914, 2913, 2920, 2915, 2915, 2914, 2915, 2917, 2866, 2918, 2869, 2869, 2870, 2913, 2912, 2128, 2129, 2130, 2131, 2132, 2133, 2134, 2135, 2136, 2137, 2129, 2130, 2131, 2132, 2133, 1160, 1168, 1175, 1174, 1181, 511, 416, 418, 447, 435, 511, 446, 437, 420, 511, 420, 435, 416, 1574, 1581, 1617, 2163, 2161, 2170, 2161, 2150, 2173, 2167, 768, 788, 793, 782, 1422, 1439, 1417, 1422, 1495, 1425, 1439, 1411, 1417, 990, 982, 982, 990, 981, 988, 998, 970, 989, 978, 844, 868, 892, 869, 872, 893, 870, 891, 952, 919, 925, 907, 918, 912, 925, 985, 938, 957, 946, 985, 923, 908, 912, 917, 909, 985, 927, 918, 907, 985, 897, 961, 975, 2712, 2746, 2737, 2726, 2738, 2736, 2731, 2742, 2736, 2737, 994, 992, 1003, 992, 1015, 1004, 998, 2367, 2365, 2358, 2365, 2346, 2353, 2363, 424, 416, 416, 424, 419, 426, 400, 444, 427, 420};

    /* JADX INFO: renamed from: ۦۡ, reason: contains not printable characters */
    private static String[] f29 = {m704(m705(), 1755339 ^ m701(C0003.m494()), 1753707 ^ m701(C0003.m364()), m701(C0002.m268()) ^ 1754054), m700(m705(), 1747854 ^ m701(C0003.m464()), 1746707 ^ m701(C0003.m410()), m701(C0001.m149()) ^ 1756699), m700(m705(), 56377 ^ m701(C0002.m195()), 56366 ^ m701(C0002.m199()), m701(C0003.m402()) ^ 1755714)};

    /* JADX INFO: renamed from: ۟ۢۧۥۢ, reason: not valid java name and contains not printable characters */
    public static C0017 m698(Object obj) {
        if (C0002.m341() > 0) {
            return C0017.m711((String[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static String m699(Object obj, int i, int i2, int i3) {
        if (C0000.m24() <= 0) {
            return C0002.m309((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨ۠, reason: not valid java name and contains not printable characters */
    public static String m700(Object obj, int i, int i2, int i3) {
        if (C0001.m58() > 0) {
            return C0000.m23((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۨۡ, reason: not valid java name and contains not printable characters */
    public static int m701(Object obj) {
        if (C0003.m429() >= 0) {
            return C0001.m60(obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۦۥۣۥ, reason: not valid java name and contains not printable characters */
    public static String[] m702() {
        if (C0003.m429() >= 0) {
            return f29;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m703(Object obj, int i, int i2, int i3) {
        if (C0002.m341() >= 0) {
            return C0004.m624((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static String m704(Object obj, int i, int i2, int i3) {
        if (C0001.m58() >= 0) {
            return C0001.m179((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣۤ۠, reason: not valid java name and contains not printable characters */
    public static short[] m705() {
        if (C0001.m58() >= 0) {
            return f28short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۠, reason: contains not printable characters */
    public static boolean m706(Context context) {
        String strM373 = C0003.m373((TelephonyManager) C0004.m568(context, m700(m705(), 1747726 ^ m701(C0003.m408()), 1753480 ^ m701(C0004.m562()), m701(C0004.m518()) ^ 1750983)));
        for (String str : m702()) {
            if (C0003.m447(str, strM373)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۤ, reason: contains not printable characters */
    public static boolean m707() throws Throwable {
        Exception exc;
        boolean z;
        BufferedReader bufferedReader;
        boolean z2;
        ArrayList arrayList;
        int iM182;
        BufferedReader bufferedReader2 = (BufferedReader) null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(m699(m705(), 1748758 ^ m701(C0003.m374()), 1753450 ^ m701(C0002.m326()), m701(C0003.m446()) ^ 1749913))), 1000);
            try {
                try {
                    C0001.m54(bufferedReader);
                    arrayList = new ArrayList();
                } catch (Exception e) {
                    z = false;
                    exc = e;
                    bufferedReader2 = bufferedReader;
                }
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                C0004.m536(bufferedReader2);
                throw th;
            }
        } catch (Exception e2) {
            exc = e2;
            z = false;
        } catch (Throwable th2) {
            th = th2;
        }
        while (true) {
            String strM54 = C0001.m54(bufferedReader);
            if (strM54 == null) {
                break;
            }
            C0002.m251(arrayList, m698(C0001.m65(strM54, m704(m705(), 56504 ^ m701(C0004.m625()), 1755557 ^ m701(C0002.m284()), m701(C0001.m158()) ^ 1751966))));
            try {
                C0001.m135(exc);
                bufferedReader = bufferedReader2;
                z2 = z;
                C0004.m536(bufferedReader);
                return z2;
            } catch (Throwable th3) {
                th = th3;
                C0004.m536(bufferedReader2);
                throw th;
            }
        }
        C0004.m536(bufferedReader);
        Iterator itM79 = C0001.m79(arrayList);
        while (true) {
            if (!C0002.m248(itM79)) {
                iM182 = -1;
                break;
            }
            C0017 c0017 = (C0017) C0004.m628(itM79);
            if (C0004.m620(c0017) == 0) {
                iM182 = C0002.m182(c0017);
                break;
            }
        }
        if (iM182 != -1) {
            Iterator itM792 = C0001.m79(arrayList);
            z = false;
            while (C0002.m248(itM792)) {
                try {
                    C0017 c00172 = (C0017) C0004.m628(itM792);
                    if (C0004.m620(c00172) != 0 && C0002.m182(c00172) == iM182) {
                        z = true;
                    }
                } catch (Exception e3) {
                    exc = e3;
                    bufferedReader2 = bufferedReader;
                    C0001.m135(exc);
                    bufferedReader = bufferedReader2;
                    z2 = z;
                }
            }
            z2 = z;
        } else {
            z2 = false;
        }
        C0004.m536(bufferedReader);
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x01ee  */
    /* JADX INFO: renamed from: ۥۥ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m708() {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0015.m708():boolean");
    }

    /* JADX INFO: renamed from: ۦ, reason: contains not printable characters */
    public static void m709(Context context) {
        try {
            if (C0003.m499() || C0003.m431() || C0004.m528(context)) {
                C0004.m544(0);
            }
        } catch (IOException e) {
            C0001.m76(e);
        }
    }
}
