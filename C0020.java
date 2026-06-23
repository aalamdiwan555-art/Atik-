package defpackage;

import S.h.e.l.l.C0000;
import android.content.Context;
import ijiami.C0001;
import ijiami.C0002;

/* JADX INFO: renamed from: ۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
class C0020 extends Thread {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f40short = {22546, 25899, 27859, -1898, 32145, 22805, 22112, 29738, 22680, 22946};

    /* JADX INFO: renamed from: ۦۨ, reason: contains not printable characters */
    private final C0019 f41;

    C0020(C0019 c0019) {
        this.f41 = c0019;
    }

    /* JADX INFO: renamed from: ۟۠ۥۥۤ, reason: not valid java name and contains not printable characters */
    public static int m748(Object obj) {
        if (C0000.m24() < 0) {
            return C0001.m60(obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۟ۡۨ۠۠, reason: not valid java name and contains not printable characters */
    public static short[] m749() {
        if (C0003.m429() >= 0) {
            return f40short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Context m750(Object obj) {
        if (C0000.m24() <= 0) {
            return C0019.m739((C0019) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static C0019 m751(Object obj) {
        if (C0001.m58() > 0) {
            return ((C0020) obj).f41;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۡۡۨ, reason: contains not printable characters */
    public static String m752(Object obj, int i, int i2, int i3) {
        if (C0003.m429() >= 0) {
            return C0000.m23((short[]) obj, i, i2, i3);
        }
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        C0001.m105();
        C0002.m277(m750(m751(this)), m752(m749(), 56505 ^ m748(C0004.m510()), 1749780 ^ m748(C0003.m421()), m748(C0002.m191()) ^ 1752575));
        C0004.m583();
    }
}
