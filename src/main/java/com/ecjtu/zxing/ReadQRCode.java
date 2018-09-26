package com.ecjtu.zxing;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;

/**
 * 使用zxing的方式
 * 二维码的解析
 */
public class ReadQRCode {
    public static void main(String[] args) {
        // 首先先获取二维码
        MultiFormatReader reader = new MultiFormatReader();
        File file = new File("E:\\logo_QRCode.png");
        try {
            // 获取图片
            BufferedImage image = ImageIO.read(file);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(image)));
            // 定义二维码的参数
            HashMap hint = new HashMap();
            hint.put(EncodeHintType.CHARACTER_SET,"utf-8");
            Result result = reader.decode(bitmap, hint);
            System.out.println("解析的结果为:"+result.toString());
            System.out.println("二维码的类型为:"+result.getBarcodeFormat());
            System.out.println("二维码的内容为:"+result.getText());


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
