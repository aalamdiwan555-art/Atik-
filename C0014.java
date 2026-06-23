package defpackage;

import S.h.e.l.l.C0000;
import android.content.Context;
import ijiami.C0001;
import ijiami.C0002;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: renamed from: ۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0014 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f27short = {2341, 2361, 2361, 2365, 2403, 2365, 2367, 2338, 2357, 2356, 2309, 2338, 2366, 2361, 2902, 2890, 2890, 2894, 2832, 2894, 2892, 2897, 2886, 2887, 2926, 2897, 2892, 2890, 489, 1139, 1132, 1137, 1143, 1059, 1086, 1059, 2570, 2582, 2198, 2195, 2195, 2181, 2194, 2180, 2180, 2263, 2250, 2263, 933, 853, 842, 855, 849, 773, 792, 773, 2959, 2764, 2764, 2764, 2764, 2764, 1186, 1208, 1181, 1211, 1189, 1182, 1208, 1198, 1199, 1251, 1250, 1259, 1157, 1198, 1215, 1212, 1188, 1209, 1184, 1154, 1189, 1215, 1198, 1209, 1197, 1194, 1192, 1198, 1259, 1157, 1194, 1190, 1198, 1265, 1259, 1560, 1561, 1538, 1628, 2390, 2390, 2390, 2326};

    /* JADX INFO: renamed from: ۟۟ۨۥۢ, reason: not valid java name and contains not printable characters */
    public static String m689(Object obj, int i, int i2, int i3) {
        if (C0003.m429() > 0) {
            return C0004.m624((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۡۥۢ, reason: not valid java name and contains not printable characters */
    public static int m690(Object obj) {
        if (C0000.m24() < 0) {
            return C0001.m60(obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m691(Object obj, int i, int i2, int i3) {
        if (C0003.m429() > 0) {
            return C0000.m23((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۦۣۨ, reason: not valid java name and contains not printable characters */
    public static String m692(Object obj, int i, int i2, int i3) {
        if (C0002.m341() >= 0) {
            return C0002.m309((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static boolean m693(Context context) {
        String strM320;
        int iM452;
        if (C0001.m160() >= 14) {
            strM320 = C0004.m516(m694(m697(), 1753662 ^ m690(C0001.m151()), 1751557 ^ m690(C0002.m302()), m690(C0003.m468()) ^ 54729));
            String strM516 = C0004.m516(m692(m697(), 1749844 ^ m690(C0003.m434()), 1754637 ^ m690(C0004.m551()), m690(C0004.m632()) ^ 1749722));
            if (strM516 == null) {
                strM516 = m689(m697(), 1749767 ^ m690(C0001.m101()), 56483 ^ m690(C0001.m154()), m690(C0001.m83()) ^ 1757090);
            }
            iM452 = C0002.m347(strM516);
            C0002.m209(C0004.m606(), C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), strM320), m692(m697(), 1751707 ^ m690(C0004.m522()), 1754442 ^ m690(C0001.m149()), m690(C0003.m352()) ^ 55934))));
            C0002.m209(C0004.m606(), C0002.m279(C0002.m329(C0001.m111(new StringBuffer(), m692(m697(), 1751505 ^ m690(C0004.m576()), 1748708 ^ m690(C0002.m298()), m690(C0002.m260()) ^ 1754688)), iM452)));
        } else {
            strM320 = C0002.m320(context);
            iM452 = C0003.m452(context);
            m694(m697(), 1748857 ^ m690(C0001.m87()), 1746836 ^ m690(C0004.m552()), m690(C0003.m443()) ^ 1753075);
            C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), strM320), m694(m697(), 1750733 ^ m690(C0001.m118()), 1754539 ^ m690(C0002.m276()), m690(C0003.m430()) ^ 1747194)));
            m694(m697(), 1747729 ^ m690(C0003.m408()), m690(C0001.m81()) ^ 1766, m690(C0003.m383()) ^ 1746010);
            C0002.m279(C0001.m111(C0002.m329(new StringBuffer(), iM452), m694(m697(), 1754623 ^ m690(C0002.m253()), 1755463 ^ m690(C0002.m183()), m690(C0003.m409()) ^ 1749362)));
        }
        return (C0004.m582(strM320) || iM452 == -1) ? false : true;
    }

    /* JADX INFO: renamed from: ۥ۠ۢۥ, reason: contains not printable characters */
    public static String m694(Object obj, int i, int i2, int i3) {
        if (C0000.m24() <= 0) {
            return C0001.m179((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ, reason: contains not printable characters */
    public static boolean m695() {
        try {
            Enumeration enumerationM222 = C0002.m222();
            if (enumerationM222 != null) {
                Iterator itM79 = C0001.m79(C0003.m477(enumerationM222));
                while (C0002.m248(itM79)) {
                    NetworkInterface networkInterface = (NetworkInterface) C0004.m628(itM79);
                    if (C0002.m285(networkInterface) && C0004.m507(C0001.m153(networkInterface)) != 0) {
                        StringBuffer stringBuffer = new StringBuffer();
                        m691(m697(), 1752510 ^ m690(C0001.m173()), 1755616 ^ m690(C0002.m270()), m690(C0002.m303()) ^ 1744905);
                        C0002.m279(C0001.m111(C0001.m111(stringBuffer, m689(m697(), 1750689 ^ m690(C0003.m414()), 1754528 ^ m690(C0003.m478()), m690(C0001.m147()) ^ 1749518)), C0004.m556(networkInterface)));
                        if (!C0001.m144(m694(m697(), 1749661 ^ m690(C0001.m35()), 1754477 ^ m690(C0003.m498()), m690(C0004.m541()) ^ 1755109), C0004.m556(networkInterface))) {
                            if (C0001.m144(m694(m697(), 1747931 ^ m690(C0003.m370()), 1750593 ^ m690(C0004.m566()), m690(C0003.m394()) ^ 54624), C0004.m556(networkInterface))) {
                            }
                        }
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            C0004.m588(th);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ, reason: contains not printable characters */
    public static void m696(Context context) {
        if (C0003.m442() || C0002.m213(context)) {
            C0004.m544(0);
        }
    }

    /* JADX INFO: renamed from: ۦۥۥۣ, reason: contains not printable characters */
    public static short[] m697() {
        if (C0001.m58() > 0) {
            return f27short;
        }
        return null;
    }
}
