package defpackage;

import S.h.e.l.l.C0000;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import ijiami.C0001;
import ijiami.C0002;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0019 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f35short = {945, 945, 945, 945, 997, 901, 901, 997, 940, 940, 997, 896, 896, 997, 933, 933, 997, 955, 955, 1745, 1728, 1747, 1729, 1754, 1695, 381, 1003, 937, 938, 930, 1672, 1674, 1680, 1675, 1681, 1664, 1665, 2761, 2709, 2690, 2693, 2695, 2708, 2690, 2761, 2693, 2708, 2695, 2709, 2702, 2761, 1913, 1829, 1842, 1845, 1847, 1828, 1842, 1913, 1845, 1828, 1847, 1829, 1854, 1913, 1135, 447, 3113, 3096, 3083, 3097, 3074, 3106, 3083, 3076, 3086, 3078, 3087, 3096, 3080, 3079, 3145, 3084, 3099, 3099, 3078, 3099, 3145, 3078, 3082, 3082, 3100, 3099, 3084, 3085, 3145, 3102, 3073, 3072, 3077, 3084, 3145, 3102, 3099, 3072, 3101, 3072, 3079, 3086, 3145, 3087, 3072, 3077, 3084, 3143, 3143, 3143, 1324, 1309, 1294, 1308, 1287, 1319, 1294, 1281, 1291, 1283, 1290, 1309, 2863, 2872, 2872, 2853, 2872, 2922, 2928, 2922, 1065, 1074, 1067, 1067, 1940, 1927, 1936, 1937, 1931, 1933, 1932, 1964, 1923, 1935, 1927, 2524, 2511, 2520, 2521, 2499, 2501, 2500, 2537, 2501, 2510, 2511, 3111, 3112, 3106, 3124, 3113, 3119, 3106, 3176, 3113, 3125, 3176, 3076, 3123, 3119, 3114, 3106, 2900, 2917, 2934, 2916, 2943, 2911, 2934, 2937, 2931, 2939, 2930, 2917, 1735, 1736, 1670, 1731, 1748, 1748, 1737, 1748, 1670, 1737, 1733, 1733, 1747, 1748, 1731, 1730, 1670, 1745, 1742, 1731, 1736, 1670, 1733, 1737, 1738, 1738, 1731, 1733, 1746, 1670, 1750, 1735, 1733, 1741, 1735, 1729, 1731, 1670, 1743, 1736, 1728, 1737, 2477, 2460, 2447, 2461, 2438, 2470, 2447, 2432, 2442, 2434, 2443, 2460, 3113, 3123, 3113, 2961, 2976, 2995, 2977, 3002, 2970, 2995, 3004, 2998, 3006, 2999, 2976, 3311, 3296, 3246, 3307, 3324, 3324, 3297, 3324, 3246, 3297, 3309, 3309, 3323, 3324, 3307, 3306, 3246, 3321, 3302, 3307, 3296, 3246, 3309, 3297, 3298, 3298, 3307, 3309, 3322, 3246, 3309, 3324, 3311, 3325, 3302, 3246, 3303, 3296, 3304, 3297};

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    private Context f36;

    /* JADX INFO: renamed from: ۦۧ, reason: contains not printable characters */
    private Thread.UncaughtExceptionHandler f39;

    /* JADX INFO: renamed from: ۦۦ, reason: contains not printable characters */
    private Map<String, String> f38 = new HashMap();

    /* JADX INFO: renamed from: ۦۥ, reason: contains not printable characters */
    private DateFormat f37 = new SimpleDateFormat(m734(m744(), 1750565 ^ m729(C0003.m385()), 1748812 ^ m729(C0001.m87()), m729(C0002.m274()) ^ 1750477));

    /* JADX INFO: renamed from: ۟۟ۢۤۡ, reason: not valid java name and contains not printable characters */
    public static int m729(Object obj) {
        if (C0001.m58() > 0) {
            return C0001.m60(obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟۠۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static DateFormat m730(Object obj) {
        if (C0000.m24() <= 0) {
            return ((C0019) obj).f37;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static Map m731(Object obj) {
        if (C0000.m24() <= 0) {
            return ((C0019) obj).f38;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠ۦۡ۟, reason: not valid java name and contains not printable characters */
    public static Thread.UncaughtExceptionHandler m732(Object obj) {
        if (C0003.m429() > 0) {
            return ((C0019) obj).f39;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static String m733(Object obj, Object obj2) {
        if (C0000.m24() < 0) {
            return ((C0019) obj).m743((Throwable) obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۣۢۥ, reason: not valid java name and contains not printable characters */
    public static String m734(Object obj, int i, int i2, int i3) {
        if (C0002.m341() > 0) {
            return C0001.m179((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۥۦ۠, reason: not valid java name and contains not printable characters */
    public static void m735(Object obj) {
        if (C0003.m429() >= 0) {
            ((C0020) obj).start();
        }
    }

    /* JADX INFO: renamed from: ۠۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static String m736(Object obj, int i, int i2, int i3) {
        if (C0000.m24() <= 0) {
            return C0002.m309((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧۥ۟, reason: not valid java name and contains not printable characters */
    public static Class m737(Object obj) {
        if (C0000.m24() <= 0) {
            return C0001.m61((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۦۢۡ, reason: not valid java name and contains not printable characters */
    public static String m738(Object obj, int i, int i2, int i3) {
        if (C0001.m58() >= 0) {
            return C0004.m624((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Context m739(Object obj) {
        if (C0003.m429() > 0) {
            return ((C0019) obj).f36;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    private boolean m741(Throwable th) {
        if (th == null) {
            return false;
        }
        m735(new C0020(this));
        C0001.m119(this, m739(this));
        m733(this, th);
        return true;
    }

    /* JADX INFO: renamed from: ۥۣۤۡ, reason: contains not printable characters */
    public static boolean m742(Object obj, Object obj2) {
        if (C0001.m58() > 0) {
            return ((C0019) obj).m741((Throwable) obj2);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ, reason: contains not printable characters */
    private String m743(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator itM79 = C0001.m79(C0003.m437(m731(this)));
        while (C0002.m248(itM79)) {
            Map.Entry entry = (Map.Entry) C0004.m628(itM79);
            String str = (String) C0001.m69(entry);
            String str2 = (String) C0001.m42(entry);
            C0001.m111(stringBuffer, C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), str), m745(m744(), 1749632 ^ m729(C0004.m575()), 1746880 ^ m729(C0003.m392()), m729(C0004.m560()) ^ 55410)))), str2))), m734(m744(), 1750565 ^ m729(C0003.m476()), 1748670 ^ m729(C0003.m491()), m729(C0002.m316()) ^ 1751987))));
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        C0003.m454(th, printWriter);
        for (Throwable thM405 = C0003.m405(th); thM405 != null; thM405 = C0003.m405(thM405)) {
            C0003.m454(thM405, printWriter);
        }
        C0002.m189(printWriter);
        C0001.m111(stringBuffer, C0002.m297(stringWriter));
        try {
            long jM622 = C0004.m622();
            String strM269 = C0002.m269(m730(this), new Date());
            String strM279 = C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), C0002.m279(C0001.m78(C0001.m111(new StringBuffer(), C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), m734(m744(), 1747826 ^ m729(C0001.m75()), 56391 ^ m729(C0002.m246()), m729(C0004.m599()) ^ 1757115)), strM269))), m734(m744(), 1752710 ^ m729(C0003.m350()), 1750723 ^ m729(C0001.m80()), m729(C0003.m390()) ^ 1746449)))), jM622))), m734(m744(), 1753596 ^ m729(C0002.m349()), 1748740 ^ m729(C0001.m36()), m729(C0003.m456()) ^ 1746948)));
            if (!C0001.m144(C0001.m92(), m736(m744(), 1747777 ^ m729(C0003.m470()), 1753423 ^ m729(C0003.m465()), m729(C0003.m419()) ^ 1751161))) {
                return strM279;
            }
            File file = new File(m734(m744(), 1754445 ^ m729(C0001.m169()), 1748721 ^ m729(C0001.m133()), m729(C0001.m145()) ^ 1751171));
            if (!C0001.m120(file)) {
                C0004.m618(file);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), m736(m744(), 1749751 ^ m729(C0001.m32()), 1752683 ^ m729(C0002.m282()), m729(C0003.m443()) ^ 1749074)), strM279)));
            C0004.m549(fileOutputStream, C0001.m162(C0002.m279(stringBuffer)));
            C0002.m241(fileOutputStream);
            return strM279;
        } catch (Exception e) {
            m738(m744(), 56418 ^ m729(C0002.m199()), 1749744 ^ m729(C0001.m35()), m729(C0004.m591()) ^ 1752949);
            m738(m744(), 1748943 ^ m729(C0004.m604()), 1753548 ^ m729(C0004.m509()), m729(C0001.m41()) ^ 1756588);
            return (String) null;
        }
    }

    /* JADX INFO: renamed from: ۦۢ۟ۤ, reason: contains not printable characters */
    public static short[] m744() {
        if (C0002.m341() > 0) {
            return f35short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨۤۢ, reason: contains not printable characters */
    public static String m745(Object obj, int i, int i2, int i3) {
        if (C0001.m58() > 0) {
            return C0000.m23((short[]) obj, i, i2, i3);
        }
        return null;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (!m742(this, th) && m732(this) != null) {
            C0001.m46(m732(this), thread, th);
            return;
        }
        try {
            C0004.m600(1000);
        } catch (InterruptedException e) {
            m745(m744(), 1746708 ^ m729(C0001.m72()), m729(C0003.m438()) ^ 1747, m729(C0001.m114()) ^ 1753232);
            m734(m744(), 1746914 ^ m729(C0001.m165()), 56437 ^ m729(C0002.m344()), m729(C0001.m139()) ^ 1745289);
        }
        C0002.m242(C0004.m531());
        C0004.m544(1);
    }

    /* JADX INFO: renamed from: ۥۢ, reason: contains not printable characters */
    public void m746(Context context) {
        String strM375;
        try {
            PackageInfo packageInfoM31 = C0001.m31(C0003.m496(context), C0002.m295(context), 1);
            if (packageInfoM31 != null) {
                if (C0003.m375(packageInfoM31) == null) {
                    strM375 = m738(m744(), 1749513 ^ m729(C0002.m325()), 1746841 ^ m729(C0002.m323()), m729(C0001.m89()) ^ 1756514);
                } else {
                    strM375 = C0003.m375(packageInfoM31);
                }
                String strM279 = C0002.m279(C0001.m111(C0002.m329(new StringBuffer(), C0003.m413(packageInfoM31)), C0004.m619()));
                C0002.m290(m731(this), m738(m744(), 1749706 ^ m729(C0002.m286()), 1747925 ^ m729(C0003.m426()), m729(C0003.m468()) ^ 56166), strM375);
                C0002.m290(m731(this), m734(m744(), 1749946 ^ m729(C0004.m550()), 1751657 ^ m729(C0002.m219()), m729(C0004.m615()) ^ 1749992), strM279);
            }
        } catch (PackageManager.NameNotFoundException e) {
            m738(m744(), m729(C0003.m438()) ^ 1644, 1749647 ^ m729(C0003.m424()), m729(C0004.m517()) ^ 1751509);
            m736(m744(), 1750948 ^ m729(C0001.m94()), 1755631 ^ m729(C0003.m371()), m729(C0003.m486()) ^ 1757089);
        }
        try {
            Field[] fieldArrM289 = C0002.m289(m737(m745(m744(), 1752743 ^ m729(C0003.m412()), 1755452 ^ m729(C0004.m500()), m729(C0002.m200()) ^ 1752576)));
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= fieldArrM289.length) {
                    return;
                }
                Field field = fieldArrM289[i2];
                try {
                    C0003.m384(field, true);
                    C0002.m290(m731(this), C0003.m361(field), C0002.m184(C0001.m49(field, (Object) null)));
                    StringBuffer stringBuffer = new StringBuffer();
                    StringBuffer stringBuffer2 = new StringBuffer();
                    m738(m744(), 1748875 ^ m729(C0001.m177()), 56499 ^ m729(C0003.m415()), m729(C0002.m258()) ^ 1749897);
                    C0002.m279(C0003.m379(C0001.m111(stringBuffer, C0002.m279(C0001.m111(C0001.m111(stringBuffer2, C0003.m361(field)), m745(m744(), 1750615 ^ m729(C0001.m142()), 1747811 ^ m729(C0004.m521()), m729(C0003.m483()) ^ 1747882)))), C0001.m49(field, (Object) null)));
                } catch (Exception e2) {
                    m734(m744(), 1748834 ^ m729(C0001.m134()), 1748786 ^ m729(C0002.m196()), m729(C0001.m131()) ^ 55081);
                    m745(m744(), 1752834 ^ m729(C0001.m71()), 1754433 ^ m729(C0003.m498()), m729(C0004.m541()) ^ 1756423);
                }
                i = i2 + 1;
            }
        } catch (ClassNotFoundException e3) {
            throw new NoClassDefFoundError(C0004.m589(e3));
        }
    }

    /* JADX INFO: renamed from: ۥۣ, reason: contains not printable characters */
    public void m747(Context context) {
        this.f36 = context;
        this.f39 = C0001.m166();
        C0004.m607(this);
    }
}
