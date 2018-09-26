package com.ecjtu.zxing;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;

/**
 *  使用zxing的方式
 *  生成QRCode
 */
public class CreateQRCode {
    public static void main(String[] args) {
        int width = 300;
        int height = 300;
        String format = "png";
        String content = "金^(*￣(oo)￣)^ haha 是你说可以这样称呼的!!!";

        // 定义二维码的参数
        HashMap hint = new HashMap();
        hint.put(EncodeHintType.CHARACTER_SET,"utf-8");
        hint.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        hint.put(EncodeHintType.MARGIN,2);


        // 生成二维码
        try {
            BitMatrix encode = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hint);
            Path path = new File("E:\\search.png").toPath();
            MatrixToImageWriter.writeToPath(encode,format,path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
