package defpackage;

import S.h.e.l.l.C0000;
import ijiami.C0001;
import ijiami.C0002;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: ۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0021 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f42short = {2459, 2436, 2505, 2500, 2459};

    /* JADX INFO: renamed from: ۟ۤۢۡۧ, reason: not valid java name and contains not printable characters */
    public static short[] m753() {
        if (C0000.m24() <= 0) {
            return f42short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۦۧۨۦ, reason: not valid java name and contains not printable characters */
    public static int m754(Object obj) {
        if (C0003.m429() >= 0) {
            return C0001.m60(obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۢۧ۠, reason: not valid java name and contains not printable characters */
    public static String m755(Object obj, int i, int i2, int i3) {
        if (C0002.m341() >= 0) {
            return C0002.m309((short[]) obj, i, i2, i3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡ, reason: contains not printable characters */
    public static void m756(String str) {
        try {
            C0003.m395(C0002.m322(), C0002.m279(C0001.m111(C0001.m111(new StringBuffer(), m755(m753(), 1755431 ^ m754(C0003.m351()), 1755400 ^ m754(C0004.m577()), m754(C0004.m602()) ^ 1753142)), str)));
        } catch (IOException e) {
        }
    }

    /* JADX INFO: renamed from: ۥۢ, reason: contains not printable characters */
    public static void m757(String str) {
        for (File file : C0001.m34(new File(str))) {
            if (C0001.m123(file)) {
                C0003.m363(C0004.m505(file));
            } else {
                C0002.m318(C0004.m505(file));
            }
        }
    }
}
