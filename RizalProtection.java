package S.h.e.l.l;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import defpackage.C0003;
import defpackage.C0004;
import defpackage.C0016;
import defpackage.C0019;
import ijiami.C0001;
import ijiami.C0002;
import ijiami.RizalObfuscator;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipFile;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class RizalProtection extends RizalObfuscator {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f0short = {1155, 1278, 1208, 1278, 1205, 1278, 1212, 1278, 1212, 1278, 1154, 1209, 1194, 1201, 1212, 1152, 1186, 1215, 1188, 1205, 1203, 1188, 1209, 1215, 1214, 1181, 1182, 1183, 1176, 1177, 1178, 1179, 1172, 1173, 1174, 1175, 1168, 1169, 1170, 1171, 1164, 1165, 1166, 1167, 1160, 1161, 1162, 1163, 1156, 1157, 1158, 1213, 1214, 1215, 1208, 1209, 1210, 1211, 1204, 1205, 1206, 1207, 1200, 1201, 1202, 1203, 1196, 1197, 1198, 1199, 1192, 1193, 1194, 1195, 1188, 1189, 1190, 1228, 1229, 1230, 1231, 1224, 1225, 1226, 1227, 1220, 1221, 453, 458, 448, 470, 459, 461, 448, 394, 453, 468, 468, 394, 485, 468, 468, 456, 461, 455, 453, 464, 461, 459, 458, 2067, 2076, 2070, 2048, 2077, 2075, 2070, 2140, 2065, 2077, 2076, 2054, 2071, 2076, 2054, 2140, 2097, 2077, 2076, 2054, 2071, 2058, 2054, 3059, 3046, 3046, 3059, 3057, 3066, 1163, 1156, 1166, 1176, 1157, 1155, 1166, 1220, 1163, 1178, 1178, 1220, 1193, 1157, 1156, 1182, 1167, 1170, 1182, 1187, 1159, 1178, 1158, 2687, 2653, 2663, 2662, 2679, 2656, 2641, 2685, 2684, 2662, 2679, 2666, 2662, 2961, 2993, 2973, 2965, 2962, 2984, 2964, 2958, 2969, 2973, 2968, 261, 266, 256, 278, 267, 269, 256, 330, 261, 276, 276, 330, 293, 263, 272, 269, 274, 269, 272, 285, 304, 268, 278, 257, 261, 256, 763, 735, 760, 767, 738, 767, 759, 762, 727, 742, 742, 762, 767, 757, 759, 738, 767, 761, 760, 523, 551, 522, 522, 551, 534, 534, 522, 527, 517, 519, 530, 527, 521, 520, 533, 2930, 2895, 2942, 2940, 2932, 2942, 2936, 2938, 2902, 2929, 2937, 2928, 1612, 1603, 1609, 1631, 1602, 1604, 1609, 1539, 1612, 1629, 1629, 1539, 1633, 1602, 1612, 1609, 1608, 1609, 1644, 1629, 1606, 432, 412, 429, 429, 433, 436, 446, 444, 425, 436, 434, 435, 2241, 2285, 2268, 2268, 2240, 2245, 2255, 2253, 2264, 2245, 2243, 2242, 2277, 2242, 2250, 2243, 1592, 1577, 1596, 1568, 1540, 1569, 1595, 1596, 2252, 2253, 2256, 2285, 2244, 2253, 2245, 2253, 2246, 2268, 2267, 1953, 1962, 1981, 1962, 2021, 1982, 1983, 1954, 1959, 2021, 1927, 1954, 1976, 1983, 1026, 1033, 1054, 1033, 1094, 1025, 1031, 1094, 1070, 1025, 1028, 1037, 1759, 1748, 1731, 1748, 1691, 1728, 1729, 1756, 1753, 1691, 1785, 1756, 1734, 1729, 729, 725, 735, 721, 740, 725, 704, 732, 753, 728, 721, 729, 721, 730, 704, 711, 1275, 1258, 1279, 1251, 1223, 1250, 1272, 1279, 2616, 2617, 2596, 2585, 2608, 2617, 2609, 2617, 2610, 2600, 2607, 2083, 2082, 2111, 2050, 2091, 2082, 2090, 2082, 2089, 2099, 2100, 2068, 2098, 2103, 2103, 2101, 2082, 2100, 2100, 2082, 2083, 2050, 2111, 2084, 2082, 2103, 2099, 2094, 2088, 2089, 2100, 1137, 1100, 1111, 1105, 1092, 1088, 1117, 1115, 1114, 1044, 1117, 1114, 1044, 1113, 1109, 1119, 1105, 1136, 1105, 1100, 1137, 1112, 1105, 1113, 1105, 1114, 1088, 2311, 2326, 2307, 2335, 2363, 2334, 2308, 2307, 2359, 2358, 2347, 2326, 2367, 2358, 2366, 2358, 2365, 2343, 2336, 2764, 2765, 2768, 2797, 2756, 2765, 2757, 2765, 2758, 2780, 2779, 2811, 2781, 2776, 2776, 2778, 2765, 2779, 2779, 2765, 2764, 2797, 2768, 2763, 2765, 2776, 2780, 2753, 2759, 2758, 2779, 2193, 2220, 2231, 2225, 2212, 2208, 2237, 2235, 2234, 2292, 2237, 2234, 2292, 2233, 2229, 2239, 2225, 2192, 2225, 2220, 2193, 2232, 2225, 2233, 2225, 2234, 2208, 1018, 1003, 1022, 994, 966, 995, 1017, 1022, 1785, 1784, 1765, 1752, 1777, 1784, 1776, 1784, 1779, 1769, 1774, 2271, 2270, 2271, 478, 449, 453, 678, 692, 692, 674, 691, 692, 744, 270, 287, 287, 259, 262, 268, 270, 283, 262, 256, 257, 594, 595, 577, 554, 575, 3111, 3126, 3126, 3114, 3119, 3109, 3111, 3122, 3119, 3113, 3112, 2744, 2739, 2750, 2744, 2736, 2701, 2738, 2729, 2735, 2734, 2746, 2743, 3110, 3117, 3104, 3110, 3118, 3101, 3125, 3114, 3126, 3104, 3105, 1050, 1041, 1052, 1050, 1042, 1067, 1046, 1046, 1037, 2242, 2249, 2244, 2242, 2250, 2295, 2289, 2287, 394, 395, 406, 1509, 1527, 1527, 1505, 1520, 1527, 1451, 3176, 3106, 3107, 3134};

    /* JADX INFO: renamed from: ۦ, reason: contains not printable characters */
    public static final String f1;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    String f2;

    /* JADX INFO: renamed from: ۥ۠, reason: contains not printable characters */
    public boolean f3;

    /* JADX INFO: renamed from: ۥۡ, reason: contains not printable characters */
    public boolean f4;

    /* JADX INFO: renamed from: ۥۢ, reason: contains not printable characters */
    public boolean f5;

    /* JADX INFO: renamed from: ۥۣ, reason: contains not printable characters */
    public boolean f6;

    /* JADX INFO: renamed from: ۥۤ, reason: contains not printable characters */
    public Application f7;

    /* JADX INFO: renamed from: ۥۥ, reason: contains not printable characters */
    File f8;

    /* JADX INFO: renamed from: ۥۦ, reason: contains not printable characters */
    List<File> f9;

    /* JADX INFO: renamed from: ۥۧ, reason: contains not printable characters */
    boolean f10;

    /* JADX INFO: renamed from: ۥۨ, reason: contains not printable characters */
    File f11;

    static {
        try {
            f1 = C0002.m292(m8(m0(m14(), 1746817 ^ m12(C0002.m299()), 1755473 ^ m12(C0004.m567()), m12(C0001.m63()) ^ 1754770)));
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(C0004.m589(e));
        }
    }

    /* JADX INFO: renamed from: ۟۟۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m0(Object obj, int i, int i2, int i3) {
        if (C0002.m341() > 0) {
            return C0001.m179((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static String m1(Object obj, int i, int i2, int i3) {
        if (C0001.m58() >= 0) {
            return C0002.m309((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static String m2(Object obj) {
        if (C0000.m24() < 0) {
            return ((RizalProtection) obj).f2;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static String m3(Object obj, Object obj2) {
        if (C0001.m58() > 0) {
            return ((RizalProtection) obj).m30((Context) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۥۥۡ, reason: not valid java name and contains not printable characters */
    public static void m4(Object obj) throws IllegalAccessException {
        if (C0001.m58() >= 0) {
            ((RizalProtection) obj).m20();
        }
    }

    /* JADX INFO: renamed from: ۟۠ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static File m5(Object obj) {
        if (C0003.m429() > 0) {
            return ((RizalProtection) obj).f8;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۡۨۧ۠, reason: not valid java name and contains not printable characters */
    public static void m6(Object obj, Object obj2, Object obj3) throws IllegalAccessException {
        if (C0003.m429() > 0) {
            m17(obj, (String) obj2, (Object[]) obj3);
        }
    }

    /* JADX INFO: renamed from: ۟ۢۥۤۡ, reason: not valid java name and contains not printable characters */
    public static List m7(Object obj) {
        if (C0003.m429() >= 0) {
            return ((RizalProtection) obj).f9;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۥ۠, reason: not valid java name and contains not printable characters */
    public static Class m8(Object obj) {
        if (C0002.m341() >= 0) {
            return C0001.m61((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m9(Object obj, int i, int i2, int i3) {
        if (C0000.m24() <= 0) {
            return C0000.m23((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۤۥۧ, reason: not valid java name and contains not printable characters */
    public static File m10(Object obj) {
        if (C0000.m24() < 0) {
            return ((RizalProtection) obj).f11;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۡۡۧ, reason: not valid java name and contains not printable characters */
    public static Object m11(Object obj) {
        if (C0001.m58() >= 0) {
            return ((Class) obj).newInstance();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static int m12(Object obj) {
        if (C0003.m429() > 0) {
            return C0001.m60(obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static boolean m13(Object obj) {
        if (C0000.m24() < 0) {
            return ((RizalProtection) obj).f10;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤۦۨ۠, reason: not valid java name and contains not printable characters */
    public static short[] m14() {
        if (C0003.m429() >= 0) {
            return f0short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static String m15(int i) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            C0003.m462(stringBuffer, C0003.m466(m1(m14(), 1747718 ^ m12(C0004.m538()), 1752466 ^ m12(C0001.m86()), m12(C0004.m580()) ^ 1752600), C0004.m548(random, 62)));
        }
        return C0002.m279(stringBuffer);
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    private void m16() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        if (m13(this) || C0004.m582(m2(this))) {
            return;
        }
        Context contextM88 = C0001.m88(this);
        this.f7 = (Application) m11(m8(m2(this)));
        try {
            try {
                Method methodM337 = C0002.m337(m8(m9(m14(), 1747638 ^ m12(C0004.m535()), 1751701 ^ m12(C0003.m459()), m12(C0002.m212()) ^ 1747802)), m9(m14(), 1752364 ^ m12(C0001.m150()), m12(C0001.m55()) ^ 56377, m12(C0004.m519()) ^ 1755672), new Class[]{m8(m0(m14(), 1752684 ^ m12(C0004.m585()), 56557 ^ m12(C0004.m573()), m12(C0004.m617()) ^ 1753552))});
                C0001.m148(methodM337, true);
                C0004.m603(methodM337, C0003.m382(this), new Object[]{contextM88});
                Class clsM8 = m8(m9(m14(), 1748936 ^ m12(C0003.m480()), 1746802 ^ m12(C0001.m77()), m12(C0004.m555()) ^ 1745870));
                Field fieldM214 = C0002.m214(clsM8, m9(m14(), 1751681 ^ m12(C0001.m116()), 1754536 ^ m12(C0004.m508()), m12(C0002.m268()) ^ 1757173));
                C0003.m384(fieldM214, true);
                C0003.m463(fieldM214, contextM88, C0003.m382(this));
                Field fieldM2142 = C0002.m214(clsM8, m0(m14(), 1750543 ^ m12(C0003.m482()), 1747785 ^ m12(C0002.m267()), m12(C0001.m146()) ^ 1756726));
                C0003.m384(fieldM2142, true);
                Object objM49 = C0001.m49(fieldM2142, contextM88);
                Class clsM82 = m8(m21(m14(), 1752602 ^ m12(C0003.m356()), 1755440 ^ m12(C0001.m115()), m12(C0004.m634()) ^ 1747462));
                Field fieldM2143 = C0002.m214(clsM82, m1(m14(), 1752371 ^ m12(C0002.m226()), 1746764 ^ m12(C0002.m227()), m12(C0001.m158()) ^ 1752946));
                C0003.m384(fieldM2143, true);
                C0003.m463(fieldM2143, objM49, C0003.m382(this));
                Field fieldM2144 = C0002.m214(clsM82, m9(m14(), m12(C0001.m112()) ^ 56377, 1746829 ^ m12(C0002.m323()), m12(C0001.m108()) ^ 1751064));
                C0003.m384(fieldM2144, true);
                ArrayList arrayList = (ArrayList) C0001.m49(fieldM2144, objM49);
                C0002.m190(arrayList, this);
                C0002.m251(arrayList, C0003.m382(this));
                Field fieldM2145 = C0002.m214(clsM8, m9(m14(), 1754544 ^ m12(C0003.m458()), 1754569 ^ m12(C0004.m527()), m12(C0002.m338()) ^ 1755861));
                C0003.m384(fieldM2145, true);
                Object objM492 = C0001.m49(fieldM2145, contextM88);
                Class clsM83 = m8(m21(m14(), 1752035 ^ m12(C0002.m335()), 56407 ^ m12(C0003.m389()), m12(C0004.m614()) ^ 1750318));
                Field fieldM2146 = C0002.m214(clsM83, m1(m14(), 1751263 ^ m12(C0001.m143()), 1755331 ^ m12(C0002.m319()), m12(C0001.m53()) ^ 1749941));
                C0003.m384(fieldM2146, true);
                C0003.m463(fieldM2146, objM492, C0003.m382(this));
                Field fieldM2147 = C0002.m214(clsM83, m9(m14(), 1752296 ^ m12(C0003.m428()), 1746741 ^ m12(C0003.m407()), m12(C0002.m235()) ^ 1753011));
                C0003.m384(fieldM2147, true);
                ((ApplicationInfo) C0001.m49(fieldM2147, objM492)).className = m2(this);
                C0003.m427(C0003.m382(this));
                this.f10 = true;
                C0003.m416(new C0016(this));
                C0002.m257(this);
            } catch (ClassNotFoundException e) {
                throw new NoClassDefFoundError(C0004.m589(e));
            }
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError(C0004.m589(e2));
        }
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    private static void m17(Object obj, String str, Object[] objArr) throws IllegalAccessException {
        Field fieldM461 = C0003.m461(obj, str);
        Object[] objArr2 = (Object[]) C0001.m49(fieldM461, obj);
        Object[] objArr3 = (Object[]) C0002.m311(C0003.m448(C0001.m51(objArr2)), objArr2.length + objArr.length);
        C0003.m401(objArr2, 0, objArr3, 0, objArr2.length);
        C0003.m401(objArr, 0, objArr3, objArr2.length, objArr.length);
        C0003.m463(fieldM461, obj, objArr3);
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static byte[] m18(byte[] bArr, String str) {
        byte[] bArrM162 = C0001.m162(str);
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ bArrM162[i % bArrM162.length]);
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: ۥۤۦۣ, reason: contains not printable characters */
    public static void m19(Object obj) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        if (C0001.m58() > 0) {
            ((RizalProtection) obj).m16();
        }
    }

    /* JADX INFO: renamed from: ۦ, reason: contains not printable characters */
    private void m20() throws IllegalAccessException {
        IOException[] iOExceptionArr;
        IOException[] iOExceptionArr2;
        ClassLoader classLoaderM339 = C0002.m339(this);
        if (C0001.m160() >= 23) {
            Object objM49 = C0001.m49(C0003.m461(classLoaderM339, m1(m14(), 1754258 ^ m12(C0002.m266()), 1749811 ^ m12(C0003.m403()), m12(C0001.m110()) ^ 1747402)), classLoaderM339);
            Field fieldM461 = C0003.m461(objM49, m9(m14(), 1755602 ^ m12(C0002.m198()), 1755470 ^ m12(C0001.m156()), m12(C0001.m82()) ^ 1749358));
            Object[] objArr = (Object[]) C0001.m49(fieldM461, objM49);
            try {
                try {
                    try {
                        Object[] objArr2 = (Object[]) C0004.m603(C0004.m610(objM49, m9(m14(), 1754123 ^ m12(C0003.m396()), 1750670 ^ m12(C0003.m497()), m12(C0004.m576()) ^ 1751928), new Class[]{m8(m0(m14(), 56602 ^ m12(C0004.m595()), 1746729 ^ m12(C0004.m525()), m12(C0001.m169()) ^ 1753763)), m8(m0(m14(), 1753264 ^ m12(C0002.m218()), 1752612 ^ m12(C0002.m254()), m12(C0001.m174()) ^ 1745760)), m8(m1(m14(), 55940 ^ m12(C0004.m511()), 1751790 ^ m12(C0002.m335()), m12(C0002.m255()) ^ 1750077))}), objM49, new Object[]{m7(this), m10(this), new ArrayList()});
                        Object[] objArr3 = (Object[]) C0002.m311(C0003.m448(C0001.m51(objArr)), objArr.length + objArr2.length);
                        C0003.m401(objArr, 0, objArr3, 0, objArr.length);
                        C0003.m401(objArr2, 0, objArr3, objArr.length, objArr2.length);
                        C0003.m463(fieldM461, objM49, objArr3);
                        return;
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
        if (C0001.m160() >= 21 && C0001.m160() < 23) {
            Object objM492 = C0001.m49(C0003.m461(classLoaderM339, m0(m14(), 1755389 ^ m12(C0002.m294()), 1750728 ^ m12(C0004.m512()), m12(C0003.m387()) ^ 1754382)), classLoaderM339);
            ArrayList arrayList = new ArrayList();
            m6(objM492, m9(m14(), 1750905 ^ m12(C0004.m598()), 1755399 ^ m12(C0001.m126()), m12(C0003.m359()) ^ 1748382), C0002.m314(objM492, new ArrayList(m7(this)), m10(this), arrayList));
            if (C0004.m569(arrayList) > 0) {
                Iterator itM79 = C0001.m79(arrayList);
                while (C0002.m248(itM79)) {
                    C0004.m574();
                    m1(m14(), 1751161 ^ m12(C0001.m157()), 56516 ^ m12(C0003.m422()), m12(C0003.m453()) ^ 1750736);
                }
                Field fieldM4612 = C0003.m461(classLoaderM339, m21(m14(), 1746547 ^ m12(C0003.m353()), 1750614 ^ m12(C0001.m125()), m12(C0002.m205()) ^ 1745572));
                IOException[] iOExceptionArr3 = (IOException[]) C0001.m49(fieldM4612, classLoaderM339);
                if (iOExceptionArr3 == null) {
                    iOExceptionArr2 = (IOException[]) C0002.m328(arrayList, new IOException[C0004.m569(arrayList)]);
                } else {
                    IOException[] iOExceptionArr4 = new IOException[C0004.m569(arrayList) + iOExceptionArr3.length];
                    C0002.m328(arrayList, iOExceptionArr4);
                    C0003.m401(iOExceptionArr3, 0, iOExceptionArr4, C0004.m569(arrayList), iOExceptionArr3.length);
                    iOExceptionArr2 = iOExceptionArr4;
                }
                C0003.m463(fieldM4612, classLoaderM339, iOExceptionArr2);
                return;
            }
            return;
        }
        if (C0001.m160() != 19) {
            if (C0001.m160() < 14 || C0001.m160() > 18) {
                return;
            }
            Object objM493 = C0001.m49(C0003.m461(classLoaderM339, m21(m14(), 1754046 ^ m12(C0002.m342()), 1755394 ^ m12(C0002.m230()), m12(C0003.m449()) ^ 1748145)), classLoaderM339);
            m6(objM493, m21(m14(), 1747324 ^ m12(C0002.m249()), 1755629 ^ m12(C0002.m232()), m12(C0003.m399()) ^ 1752223), C0003.m441(objM493, new ArrayList(m7(this)), m10(this)));
            return;
        }
        Object objM494 = C0001.m49(C0003.m461(classLoaderM339, m9(m14(), 1750739 ^ m12(C0002.m235()), 56500 ^ m12(C0003.m420()), m12(C0001.m108()) ^ 1749769)), classLoaderM339);
        ArrayList arrayList2 = new ArrayList();
        m6(objM494, m21(m14(), 1749879 ^ m12(C0002.m304()), 1750605 ^ m12(C0002.m236()), m12(C0003.m376()) ^ 1755189), C0002.m314(objM494, new ArrayList(m7(this)), m10(this), arrayList2));
        if (C0004.m569(arrayList2) > 0) {
            Iterator itM792 = C0001.m79(arrayList2);
            while (C0002.m248(itM792)) {
                C0004.m574();
                m9(m14(), 1751936 ^ m12(C0001.m108()), m12(C0001.m95()) ^ 1785, m12(C0003.m484()) ^ 1750609);
            }
            Field fieldM4613 = C0003.m461(classLoaderM339, m1(m14(), 1748759 ^ m12(C0002.m315()), 1755411 ^ m12(C0001.m126()), m12(C0002.m286()) ^ 1751279));
            IOException[] iOExceptionArr5 = (IOException[]) C0001.m49(fieldM4613, classLoaderM339);
            if (iOExceptionArr5 == null) {
                iOExceptionArr = (IOException[]) C0002.m328(arrayList2, new IOException[C0004.m569(arrayList2)]);
            } else {
                IOException[] iOExceptionArr6 = new IOException[C0004.m569(arrayList2) + iOExceptionArr5.length];
                C0002.m328(arrayList2, iOExceptionArr6);
                C0003.m401(iOExceptionArr5, 0, iOExceptionArr6, C0004.m569(arrayList2), iOExceptionArr5.length);
                iOExceptionArr = iOExceptionArr6;
            }
            C0003.m463(fieldM4613, classLoaderM339, iOExceptionArr);
        }
    }

    /* JADX INFO: renamed from: ۦ۠۠ۨ, reason: contains not printable characters */
    public static String m21(Object obj, int i, int i2, int i3) {
        if (C0003.m429() >= 0) {
            return C0004.m624((short[]) obj, i, i2, i3);
        }
        return null;
    }

    @Override // ijiami.RizalObfuscator, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        int i = 0;
        this.f9 = new ArrayList();
        this.f8 = C0002.m197(context, m9(m14(), 1746258 ^ m12(C0002.m240()), 56354 ^ m12(C0002.m199()), m12(C0004.m559()) ^ 1753393), 0);
        this.f11 = new File(C0001.m141(context), m0(m14(), 1747150 ^ m12(C0004.m535()), 1755612 ^ m12(C0004.m602()), m12(C0002.m313()) ^ 1754068));
        C0002.m318(C0004.m505(m5(this)));
        C0003.m492(C0004.m505(m5(this)));
        C0003.m492(C0004.m505(m10(this)));
        try {
            ZipFile zipFile = new ZipFile(m3(this, context));
            String strM225 = C0002.m225(context, m3(this, context));
            String str = new String(C0002.m185(C0002.m327(context, C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), m0(m14(), 1754006 ^ m12(C0004.m612()), 1751599 ^ m12(C0002.m193()), m12(C0004.m601()) ^ 1754031)), C0003.m481(m0(m14(), 1754036 ^ m12(C0004.m562()), 1746899 ^ m12(C0003.m435()), m12(C0001.m124()) ^ 1747599))))), strM225), m0(m14(), 1746373 ^ m12(C0002.m299()), 1751623 ^ m12(C0004.m615()), m12(C0001.m173()) ^ 1752960));
            C0003.m492(C0004.m505(m5(this)));
            JSONObject jSONObject = new JSONObject(str);
            this.f2 = C0002.m262(jSONObject, m9(m14(), 1746281 ^ m12(C0003.m455()), 1748686 ^ m12(C0001.m102()), m12(C0001.m59()) ^ 1752763));
            this.f5 = C0003.m460(jSONObject, m9(m14(), 1749238 ^ m12(C0003.m471()), 1750638 ^ m12(C0001.m39()), m12(C0002.m221()) ^ 1757172));
            this.f6 = C0003.m460(jSONObject, m0(m14(), 1751978 ^ m12(C0001.m93()), 1749678 ^ m12(C0002.m263()), m12(C0001.m84()) ^ 1745538));
            this.f3 = C0003.m460(jSONObject, m21(m14(), 1751937 ^ m12(C0004.m630()), 1750792 ^ m12(C0002.m281()), m12(C0004.m552()) ^ 1745895));
            this.f4 = C0003.m460(jSONObject, m9(m14(), 1748246 ^ m12(C0001.m177()), 1750699 ^ m12(C0002.m234()), m12(C0003.m423()) ^ 1753201));
            ArrayList arrayListM367 = C0003.m367(C0002.m262(jSONObject, m1(m14(), 1754996 ^ m12(C0004.m501()), 1755401 ^ m12(C0002.m230()), m12(C0001.m77()) ^ 1746571)));
            while (true) {
                int i2 = i;
                if (i2 >= C0004.m507(arrayListM367)) {
                    break;
                }
                InputStream inputStreamM400 = C0003.m400(zipFile, C0003.m369(zipFile, C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), m1(m14(), 1747203 ^ m12(C0001.m127()), 1749568 ^ m12(C0002.m286()), m12(C0001.m80()) ^ 1749830)), (String) C0003.m358(arrayListM367, i2)))));
                File file = new File(m5(this), C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), C0003.m475(32)), m21(m14(), 1750215 ^ m12(C0002.m308()), 1751552 ^ m12(C0004.m513()), m12(C0001.m134()) ^ 1745884))));
                C0001.m103(C0004.m532(C0003.m360(inputStreamM400), strM225), C0004.m505(file));
                C0003.m368(m7(this), file);
                i = i2 + 1;
            }
        } catch (Exception e) {
            C0001.m135(e);
        }
        super.attachBaseContext(context);
        switch (1) {
            case 1:
                try {
                    m4(this);
                    try {
                        C0002.m318(C0004.m505(m5(this)));
                        Iterator itM79 = C0001.m79(m7(this));
                        while (C0002.m248(itM79)) {
                            C0001.m175((File) C0004.m628(itM79));
                        }
                    } catch (Exception e2) {
                        C0001.m135(e2);
                        return;
                    }
                } catch (Exception e3) {
                    C0001.m135(e3);
                    return;
                }
                break;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context createPackageContext(String str, int i) {
        if (C0004.m582(m2(this))) {
            return super.createPackageContext(str, i);
        }
        try {
            m19(this);
        } catch (Exception e) {
            C0001.m135(e);
        }
        return C0003.m382(this);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public String getPackageName() {
        return !C0004.m582(m2(this)) ? C0004.m619() : super.getPackageName();
    }

    @Override // ijiami.RizalObfuscator, android.app.Application
    public void onCreate() {
        super.onCreate();
        try {
            m19(this);
        } catch (Exception e) {
            C0001.m135(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m22() {
        C0002.m310(new C0019(), C0002.m252(this));
    }
}
