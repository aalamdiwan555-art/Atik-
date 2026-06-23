package defpackage;

import ijiami.C0001;
import ijiami.C0002;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0023 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f43short = {886, 1224};

    /* JADX INFO: renamed from: ۣ۟ۤۨۤ, reason: not valid java name and contains not printable characters */
    public static short[] m762() {
        if (C0001.m58() > 0) {
            return f43short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۤ, reason: contains not printable characters */
    public static ArrayList<String> m763(String str) {
        if (C0003.m386(str, m765(m762(), 1750663 ^ m764(C0004.m523()), 1751708 ^ m764(C0002.m307()), m764(C0004.m629()) ^ 1745989))) {
            return new ArrayList<>(C0001.m74(C0001.m65(str, m765(m762(), 1746694 ^ m764(C0004.m593()), 1754624 ^ m764(C0001.m137()), m764(C0004.m616()) ^ 1756483))));
        }
        if (C0002.m210(str)) {
            ArrayList<String> arrayList = new ArrayList<>();
            C0002.m251(arrayList, C0004.m619());
            return arrayList;
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        C0002.m251(arrayList2, str);
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۨ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static int m764(Object obj) {
        if (C0003.m429() > 0) {
            return C0001.m60(obj);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨۡ۠۟, reason: not valid java name and contains not printable characters */
    public static String m765(Object obj, int i, int i2, int i3) {
        if (C0002.m341() > 0) {
            return C0004.m624((short[]) obj, i, i2, i3);
        }
        return null;
    }
}
