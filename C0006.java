package defpackage;

import S.h.e.l.l.C0000;
import ijiami.C0001;
import ijiami.C0002;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0006 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f21short = {1833, 1826, 1845, 1826, 1901, 1846, 1847, 1834, 1839, 1901, 1794, 1841, 1841, 1826, 1850, 1807, 1834, 1840, 1847, 1520, 1531, 1516, 1531, 1460, 1523, 1525, 1460, 1500, 1523, 1526, 1535, 1897, 1893, 1903, 1889, 1856, 1889, 1916, 1857, 1896, 1889, 1897, 1889, 1898, 1904, 1911};

    /* JADX INFO: renamed from: ۟۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m644() {
        if (C0003.m429() > 0) {
            return f21short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟۠۠۟, reason: not valid java name and contains not printable characters */
    public static Class m645(Object obj) {
        if (C0001.m58() > 0) {
            return C0001.m61((String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۨۥۦ, reason: not valid java name and contains not printable characters */
    public static String m646(Object obj, int i, int i2, int i3) {
        if (C0001.m58() > 0) {
            return C0000.m23((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۡۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m647(Object obj) {
        if (C0002.m341() > 0) {
            return C0001.m60(obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۨۡ۟, reason: contains not printable characters */
    public static String m649(Object obj, int i, int i2, int i3) {
        if (C0002.m341() > 0) {
            return C0001.m179((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ, reason: contains not printable characters */
    private static Object[] m650(Object obj, ArrayList<File> arrayList, File file) {
        try {
            try {
                return (Object[]) C0004.m603(C0004.m610(obj, m646(m644(), m647(C0002.m208()) ^ 1750681, 1750762 ^ m647(C0004.m572()), m647(C0002.m194()) ^ 1748102), new Class[]{m645(m649(m644(), 1752738 ^ m647(C0004.m537()), 56373 ^ m647(C0002.m195()), m647(C0002.m264()) ^ 1750433)), m645(m646(m644(), 1755634 ^ m647(C0001.m91()), 1754504 ^ m647(C0001.m138()), m647(C0004.m614()) ^ 1750681))}), obj, new Object[]{arrayList, file});
            } catch (ClassNotFoundException e) {
                throw new NoClassDefFoundError(C0004.m589(e));
            }
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError(C0004.m589(e2));
        }
    }

    /* JADX INFO: renamed from: ۣۨۨ۠, reason: not valid java name and contains not printable characters */
    public static Object[] m651(Object obj, Object obj2, Object obj3) {
        if (C0003.m429() > 0) {
            return m650(obj, (ArrayList) obj2, (File) obj3);
        }
        return null;
    }
}
