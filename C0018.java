package defpackage;

import S.h.e.l.l.C0000;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import ijiami.C0001;
import ijiami.C0002;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0018 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f34short = {1953, 1952, 2027, 1975, 1962, 1959, 1971, 2027, 1956, 1963, 1953, 1975, 1962, 1964, 1953, 2027, 1981, 1973, 1962, 1974, 1952, 1953, 2027, 1964, 1963, 1974, 1969, 1956, 1961, 1961, 1952, 1975, 1813, 1821, 1821, 1821, 732, 733, 662, 714, 727, 730, 718, 662, 729, 726, 732, 714, 727, 721, 732, 662, 704, 712, 727, 715, 733, 732, 662, 736, 712, 727, 715, 733, 732, 762, 714, 721, 732, 735, 733, 917, 916, 991, 899, 926, 915, 903, 991, 912, 927, 917, 899, 926, 920, 917, 991, 905, 897, 926, 898, 916, 917, 991, 937, 897, 926, 898, 916, 917, 947, 899, 920, 917, 918, 916, 2533, 2489, 2483, 2489, 2494, 2479, 2471, 2533, 2476, 2488, 2475, 2471, 2479, 2493, 2469, 2488, 2465, 2533, 2450, 2490, 2469, 2489, 2479, 2478, 2440, 2488, 2467, 2478, 2477, 2479, 2532, 2464, 2475, 2488, 2912, 2879, 2877, 2848, 2860, 2912, 2845, 2911, 2899, 2882, 2881, 1354, 1345, 1362, 1042, 1082, 1061, 1081, 1071, 1070, 1032, 1080, 1059, 1070, 1069, 1071, 1124, 1056, 1067, 1080};

    /* JADX INFO: renamed from: ۟۠۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m712(Object obj, int i, int i2, int i3) {
        if (C0001.m58() >= 0) {
            return C0004.m624((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m713() {
        if (C0002.m341() > 0) {
            return m726();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m714() {
        if (C0002.m341() > 0) {
            return m724();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۟ۡۢۤ۠, reason: not valid java name and contains not printable characters */
    public static short[] m715() {
        if (C0003.m429() > 0) {
            return f34short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static String m716(Object obj, int i, int i2, int i3) {
        if (C0000.m24() < 0) {
            return C0002.m309((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۥۡ۠, reason: not valid java name and contains not printable characters */
    public static boolean m717(Object obj) {
        if (C0003.m429() >= 0) {
            return m721((Context) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۢۧۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m718() {
        if (C0003.m429() > 0) {
            return m723();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۣۢۨۤ, reason: not valid java name and contains not printable characters */
    public static int m719(Object obj) {
        if (C0001.m58() > 0) {
            return C0001.m60(obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۤۡۢ, reason: not valid java name and contains not printable characters */
    public static String m720(Object obj, int i, int i2, int i3) {
        if (C0000.m24() <= 0) {
            return C0001.m179((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ, reason: contains not printable characters */
    private static boolean m721(Context context) {
        Iterator itM79 = C0001.m79(C0002.m229(C0003.m496(context), 128));
        while (C0002.m248(itM79)) {
            if (C0001.m144(C0002.m332((ApplicationInfo) C0004.m628(itM79)), m727(m715(), 56416 ^ m719(C0003.m444()), 1752460 ^ m719(C0001.m86()), m719(C0004.m546()) ^ 1753638))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۦ, reason: contains not printable characters */
    private static boolean m722() {
        try {
            throw new Exception(m727(m715(), 1750534 ^ m719(C0004.m571()), 1746791 ^ m719(C0001.m165()), m719(C0003.m381()) ^ 1752423));
        } catch (Exception e) {
            StackTraceElement[] stackTraceElementArrM587 = C0004.m587(e);
            for (StackTraceElement stackTraceElement : stackTraceElementArrM587) {
                if (C0001.m144(C0003.m445(stackTraceElement), m716(m715(), 1751489 ^ m719(C0004.m594()), 1752615 ^ m719(C0003.m412()), m719(C0004.m563()) ^ 1751889))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥۧ, reason: contains not printable characters */
    private static boolean m723() {
        try {
            return C0001.m97(C0001.m66(), m712(m715(), 1751469 ^ m719(C0004.m630()), 1747773 ^ m719(C0004.m557()), m719(C0002.m333()) ^ 57299)) != null;
        } catch (Exception e) {
            C0001.m135(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥۨ, reason: contains not printable characters */
    private static boolean m724() {
        return C0001.m120(new File(m712(m715(), 1748680 ^ m719(C0001.m161()), 1755463 ^ m719(C0002.m215()), m719(C0003.m404()) ^ 1755302)));
    }

    /* JADX INFO: renamed from: ۦ, reason: contains not printable characters */
    public static void m725(Context context) {
        if (m717(context) || m718() || m714() || m728() || m713()) {
            C0004.m544(0);
        }
    }

    /* JADX INFO: renamed from: ۦ۟, reason: contains not printable characters */
    private static boolean m726() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), C0002.m279(C0002.m329(C0001.m111(new StringBuffer(), m720(m715(), 1746895 ^ m719(C0002.m202()), 1750691 ^ m719(C0002.m317()), m719(C0001.m47()) ^ 1753643)), C0004.m531()))), m720(m715(), 1753467 ^ m719(C0004.m608()), 1753639 ^ m719(C0003.m402()), m719(C0004.m524()) ^ 1745125)))));
            while (true) {
                String strM54 = C0001.m54(bufferedReader);
                if (strM54 == null) {
                    break;
                }
                if (C0002.m345(strM54, m712(m715(), 1752789 ^ m719(C0003.m365()), 1755620 ^ m719(C0002.m192()), m719(C0001.m64()) ^ 1751268))) {
                    if (C0003.m386(strM54, m720(m715(), 1746919 ^ m719(C0002.m228()), 1748634 ^ m719(C0004.m621()), m719(C0002.m188()) ^ 1751425))) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            C0001.m135(e);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧۥۤۡ, reason: not valid java name and contains not printable characters */
    public static String m727(Object obj, int i, int i2, int i3) {
        if (C0000.m24() < 0) {
            return C0000.m23((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨۦۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m728() {
        if (C0001.m58() > 0) {
            return m722();
        }
        return false;
    }
}
