package defpackage;

import android.content.Context;
import ijiami.C0001;
import ijiami.C0002;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: ۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0022 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static byte[] m758(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int iM117 = C0001.m117(inputStream, bArr);
            if (iM117 == -1) {
                return C0003.m417(byteArrayOutputStream);
            }
            C0003.m440(byteArrayOutputStream, bArr, 0, iM117);
        }
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m759(byte[] bArr, String str) {
        File file = new File(str);
        if (!C0001.m120(file) && C0004.m565(file)) {
            C0004.m618(file);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        C0001.m168(bufferedOutputStream, bArr);
        if (bufferedOutputStream != null) {
            C0002.m321(bufferedOutputStream);
        }
        if (fileOutputStream != null) {
            C0002.m241(fileOutputStream);
        }
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static byte[] m760(Context context, String str) {
        try {
            ZipFile zipFile = new ZipFile(C0003.m450(context));
            return C0003.m360(C0003.m400(zipFile, C0003.m369(zipFile, str)));
        } catch (IOException e) {
            C0001.m76(e);
            return (byte[]) null;
        }
    }

    /* JADX INFO: renamed from: ۥۣ, reason: contains not printable characters */
    public static void m761(String str) {
        try {
            File file = new File(str);
            if (C0001.m120(file)) {
                return;
            }
            C0004.m618(file);
        } catch (Exception e) {
        }
    }
}
