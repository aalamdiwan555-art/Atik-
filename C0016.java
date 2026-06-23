package defpackage;

import S.h.e.l.l.RizalProtection;
import ijiami.C0001;
import ijiami.C0002;

/* JADX INFO: renamed from: ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0016 extends Thread {

    /* JADX INFO: renamed from: ۦ۟, reason: contains not printable characters */
    private final RizalProtection f30;

    public C0016(RizalProtection rizalProtection) {
        this.f30 = rizalProtection;
    }

    /* JADX INFO: renamed from: ۟ۤ۠۟۠, reason: not valid java name and contains not printable characters */
    public static RizalProtection m710(Object obj) {
        if (C0002.m341() >= 0) {
            return ((C0016) obj).f30;
        }
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            try {
                C0004.m600(1000);
                if (C0003.m473(m710(this))) {
                    try {
                        C0001.m176(C0001.m164(C0003.m382(m710(this))));
                    } catch (Exception e) {
                    }
                }
                if (C0001.m159(m710(this))) {
                    try {
                        C0002.m296(C0001.m164(C0003.m382(m710(this))));
                    } catch (Exception e2) {
                    }
                }
                if (C0001.m132(m710(this))) {
                    try {
                        C0003.m406(C0001.m164(C0003.m382(m710(this))));
                    } catch (Exception e3) {
                    }
                }
                if (C0002.m237(m710(this))) {
                    try {
                        C0001.m67(C0001.m164(C0003.m382(m710(this))));
                    } catch (Exception e4) {
                    }
                }
            } catch (Exception e5) {
            }
        }
    }
}
